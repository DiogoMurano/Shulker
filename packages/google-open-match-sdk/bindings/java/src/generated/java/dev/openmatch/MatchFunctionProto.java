// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/match-function.proto

// Protobuf Java Version: 3.25.0
package dev.openmatch;

public final class MatchFunctionProto {
  private MatchFunctionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_RunRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_RunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_RunResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_RunResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030api/match-function.proto\022\topenmatch\032\022a" +
      "pi/messages.proto\032\034google/api/annotation" +
      "s.proto\032.protoc-gen-openapiv2/options/an" +
      "notations.proto\"?\n\nRunRequest\0221\n\007profile" +
      "\030\001 \001(\0132\027.openmatch.MatchProfileR\007profile" +
      "\";\n\013RunResponse\022,\n\010proposal\030\001 \001(\0132\020.open" +
      "match.MatchR\010proposal2i\n\rMatchFunction\022X" +
      "\n\003Run\022\025.openmatch.RunRequest\032\026.openmatch" +
      ".RunResponse\" \202\323\344\223\002\032\"\025/v1/matchfunction:" +
      "run:\001*0\001B\354\003\n\rdev.openmatchB\022MatchFunctio" +
      "nProtoP\001Z open-match.dev/open-match/pkg/" +
      "pb\242\002\003OXX\252\002\tOpenmatch\312\002\tOpenmatch\342\002\025Openm" +
      "atch\\GPBMetadata\352\002\tOpenmatch\222A\337\002\022\270\001\n\016Mat" +
      "ch Function\"I\n\nOpen Match\022\026https://open-" +
      "match.dev\032#open-match-discuss@googlegrou" +
      "ps.com*V\n\022Apache 2.0 License\022@https://gi" +
      "thub.com/googleforgames/open-match/blob/" +
      "master/LICENSE2\0031.0*\002\001\0022\020application/jso" +
      "n:\020application/jsonR;\n\003404\0224\n*Returned w" +
      "hen the resource does not exist.\022\006\n\004\232\002\001\007" +
      "r=\n\030Open Match Documentation\022!https://op" +
      "en-match.dev/site/docs/b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          dev.openmatch.MessagesProto.getDescriptor(),
          dev.google.api.AnnotationsProto.getDescriptor(),
          dev.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor(),
        });
    internal_static_openmatch_RunRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_openmatch_RunRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_RunRequest_descriptor,
        new java.lang.String[] { "Profile", });
    internal_static_openmatch_RunResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_openmatch_RunResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_RunResponse_descriptor,
        new java.lang.String[] { "Proposal", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(dev.google.api.AnnotationsProto.http);
    registry.add(dev.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Swagger);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    dev.openmatch.MessagesProto.getDescriptor();
    dev.google.api.AnnotationsProto.getDescriptor();
    dev.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}