/*
Copyright (c) Jérémy Levilain
SPDX-License-Identifier: GPL-3.0-or-later
*/

package main

import (
	"context"

	agonesv1 "agones.dev/agones/pkg/apis/agones/v1"
	corev1 "k8s.io/api/core/v1"
	k8serrors "k8s.io/apimachinery/pkg/api/errors"
	metav1 "k8s.io/apimachinery/pkg/apis/meta/v1"
	"k8s.io/apimachinery/pkg/runtime"
	"k8s.io/apimachinery/pkg/types"
	ctrl "sigs.k8s.io/controller-runtime"
	"sigs.k8s.io/controller-runtime/pkg/client"
	"sigs.k8s.io/controller-runtime/pkg/log"

	ctrlutil "github.com/iamblueslime/shulker/packages/shulker-controller-utils/src"
	shulkermciov1alpha1 "github.com/iamblueslime/shulker/packages/shulker-crds/v1alpha1"
	resources "github.com/iamblueslime/shulker/packages/shulker-operator/src/resources/minecraftserverfleet"
)

// MinecraftServerFleetReconciler reconciles a MinecraftServerFleet object
type MinecraftServerFleetReconciler struct {
	client.Client
	Scheme *runtime.Scheme
}

//+kubebuilder:rbac:groups="",resources=configmaps,verbs=get;list;watch;create;update
//+kubebuilder:rbac:groups=agones.dev,resources=fleets,verbs=get;list;watch;create;update
//+kubebuilder:rbac:groups=shulkermc.io,resources=minecraftserverfleets,verbs=get;list;watch;create;update;patch;delete
//+kubebuilder:rbac:groups=shulkermc.io,resources=minecraftserverfleets/status,verbs=get;update;patch

func (r *MinecraftServerFleetReconciler) Reconcile(ctx context.Context, req ctrl.Request) (ctrl.Result, error) {
	logger := log.FromContext(ctx)

	logger.Info("Reconciling MinecraftServerFleet")
	minecraftServerFleet, err := r.getMinecraftServerFleet(ctx, req.NamespacedName)

	if client.IgnoreNotFound(err) != nil {
		return ctrl.Result{}, err
	} else if k8serrors.IsNotFound(err) {
		// No need to requeue if the resource no longer exists
		return ctrl.Result{}, nil
	}

	cluster := &shulkermciov1alpha1.MinecraftCluster{}
	err = r.Get(ctx, types.NamespacedName{
		Namespace: minecraftServerFleet.Namespace,
		Name:      minecraftServerFleet.Spec.ClusterRef.Name,
	}, cluster)
	if err != nil {
		logger.Error(err, "Referenced MinecraftCluster does not exists")
		return ctrl.Result{}, err
	}

	resourceBuilder := resources.MinecraftServerFleetResourceBuilder{
		Instance: minecraftServerFleet,
		Scheme:   r.Scheme,
		Client:   r.Client,
		Ctx:      ctx,
	}
	builders, dirtyBuilders := resourceBuilder.ResourceBuilders()

	err = ctrlutil.ReconcileWithResourceBuilders(r.Client, ctx, builders, dirtyBuilders)
	if err != nil {
		return ctrl.Result{}, err
	}

	fleet := agonesv1.Fleet{}
	err = r.Get(ctx, client.ObjectKey{
		Namespace: minecraftServerFleet.Namespace,
		Name:      resourceBuilder.GetFleetName(),
	}, &fleet)
	if err != nil && !k8serrors.IsNotFound(err) {
		return ctrl.Result{}, err
	}

	minecraftServerFleet.Status.Replicas = fleet.Status.Replicas
	minecraftServerFleet.Status.ReadyReplicas = fleet.Status.ReadyReplicas
	minecraftServerFleet.Status.AllocatedReplicas = fleet.Status.AllocatedReplicas

	if minecraftServerFleet.Status.ReadyReplicas > 0 {
		minecraftServerFleet.Status.SetCondition(shulkermciov1alpha1.MinecraftServerFleetAvailableCondition, metav1.ConditionTrue, "AtLeastOneReady", "One or more servers are ready")
	} else {
		minecraftServerFleet.Status.SetCondition(shulkermciov1alpha1.MinecraftServerFleetAvailableCondition, metav1.ConditionFalse, "NotReady", "No server are ready")
	}

	return ctrl.Result{}, r.Status().Update(ctx, minecraftServerFleet)
}

func (r *MinecraftServerFleetReconciler) getMinecraftServerFleet(ctx context.Context, namespacedName types.NamespacedName) (*shulkermciov1alpha1.MinecraftServerFleet, error) {
	minecraftServerFleet := &shulkermciov1alpha1.MinecraftServerFleet{}
	err := r.Get(ctx, namespacedName, minecraftServerFleet)
	return minecraftServerFleet, err
}

// SetupWithManager sets up the controller with the Manager.
func (r *MinecraftServerFleetReconciler) SetupWithManager(mgr ctrl.Manager) error {
	err := mgr.GetFieldIndexer().IndexField(context.Background(), &shulkermciov1alpha1.MinecraftServerFleet{}, ".spec.clusterRef.name", func(object client.Object) []string {
		minecraftServerFleet := object.(*shulkermciov1alpha1.MinecraftServerFleet)
		return []string{minecraftServerFleet.Spec.ClusterRef.Name}
	})

	if err != nil {
		return err
	}

	return ctrl.NewControllerManagedBy(mgr).
		For(&shulkermciov1alpha1.MinecraftServerFleet{}).
		Owns(&agonesv1.Fleet{}).
		Owns(&corev1.ConfigMap{}).
		Complete(r)
}