/*
Copyright (c) Jérémy Levilain
SPDX-License-Identifier: GPL-3.0-or-later
*/

package resources

import (
	"context"
	"fmt"

	metav1 "k8s.io/apimachinery/pkg/apis/meta/v1"
	"k8s.io/apimachinery/pkg/runtime"
	"sigs.k8s.io/controller-runtime/pkg/client"

	shulkermciov1alpha1 "github.com/iamblueslime/shulker/packages/shulker-crds/v1alpha1"
	common "github.com/iamblueslime/shulker/packages/shulker-resource-utils/src"
)

type MinecraftServerFleetResourceBuilder struct {
	Instance *shulkermciov1alpha1.MinecraftServerFleet
	Scheme   *runtime.Scheme
	Client   client.Client
	Ctx      context.Context
}

func (b *MinecraftServerFleetResourceBuilder) ResourceBuilders() ([]common.ResourceBuilder, []common.ResourceBuilder) {
	builders := []common.ResourceBuilder{
		b.MinecraftServerFleetFleet(),
		b.MinecraftServerFleetConfigMap(),
	}
	dirtyBuilders := []common.ResourceBuilder{}

	return builders, dirtyBuilders
}

func (b *MinecraftServerFleetResourceBuilder) GetFleetName() string {
	return b.Instance.Name
}

func (b *MinecraftServerFleetResourceBuilder) GetConfigMapName() string {
	return fmt.Sprintf("%s-config", b.Instance.Name)
}

func (b *MinecraftServerFleetResourceBuilder) GetPodSelector() *metav1.LabelSelector {
	return &metav1.LabelSelector{
		MatchLabels: b.getLabels(),
	}
}

func (b *MinecraftServerFleetResourceBuilder) getLabels() map[string]string {
	labels := map[string]string{
		"app.kubernetes.io/name":                 b.Instance.Name,
		"app.kubernetes.io/component":            "minecraft-server",
		"minecraftcluster.shulkermc.io/name":     b.Instance.Spec.ClusterRef.Name,
		"minecraftserverfleet.shulkermc.io/name": b.Instance.Name,
	}

	return labels
}