// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/messages.proto

// Protobuf Java Version: 3.25.0
package dev.openmatch;

public final class MessagesProto {
  private MessagesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Ticket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Ticket_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Ticket_ExtensionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Ticket_ExtensionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Ticket_PersistentFieldEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Ticket_PersistentFieldEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_SearchFields_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_SearchFields_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_SearchFields_DoubleArgsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_SearchFields_DoubleArgsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_SearchFields_StringArgsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_SearchFields_StringArgsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Assignment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Assignment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Assignment_ExtensionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Assignment_ExtensionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_DoubleRangeFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_DoubleRangeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_StringEqualsFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_StringEqualsFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_TagPresentFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_TagPresentFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Pool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Pool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_MatchProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_MatchProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_MatchProfile_ExtensionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_MatchProfile_ExtensionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Match_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Match_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Match_ExtensionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Match_ExtensionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Backfill_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Backfill_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Backfill_ExtensionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Backfill_ExtensionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openmatch_Backfill_PersistentFieldEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openmatch_Backfill_PersistentFieldEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022api/messages.proto\022\topenmatch\032\027google/" +
      "rpc/status.proto\032\031google/protobuf/any.pr" +
      "oto\032\037google/protobuf/timestamp.proto\"\225\004\n" +
      "\006Ticket\022\016\n\002id\030\001 \001(\tR\002id\0225\n\nassignment\030\003 " +
      "\001(\0132\025.openmatch.AssignmentR\nassignment\022<" +
      "\n\rsearch_fields\030\004 \001(\0132\027.openmatch.Search" +
      "FieldsR\014searchFields\022A\n\nextensions\030\005 \003(\013" +
      "2!.openmatch.Ticket.ExtensionsEntryR\next" +
      "ensions\022Q\n\020persistent_field\030\006 \003(\0132&.open" +
      "match.Ticket.PersistentFieldEntryR\017persi" +
      "stentField\022;\n\013create_time\030\007 \001(\0132\032.google" +
      ".protobuf.TimestampR\ncreateTime\032S\n\017Exten" +
      "sionsEntry\022\020\n\003key\030\001 \001(\tR\003key\022*\n\005value\030\002 " +
      "\001(\0132\024.google.protobuf.AnyR\005value:\0028\001\032X\n\024" +
      "PersistentFieldEntry\022\020\n\003key\030\001 \001(\tR\003key\022*" +
      "\n\005value\030\002 \001(\0132\024.google.protobuf.AnyR\005val" +
      "ue:\0028\001J\004\010\002\020\003\"\264\002\n\014SearchFields\022H\n\013double_" +
      "args\030\001 \003(\0132\'.openmatch.SearchFields.Doub" +
      "leArgsEntryR\ndoubleArgs\022H\n\013string_args\030\002" +
      " \003(\0132\'.openmatch.SearchFields.StringArgs" +
      "EntryR\nstringArgs\022\022\n\004tags\030\003 \003(\tR\004tags\032=\n" +
      "\017DoubleArgsEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005va" +
      "lue\030\002 \001(\001R\005value:\0028\001\032=\n\017StringArgsEntry\022" +
      "\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005value:" +
      "\0028\001\"\324\001\n\nAssignment\022\036\n\nconnection\030\001 \001(\tR\n" +
      "connection\022E\n\nextensions\030\004 \003(\0132%.openmat" +
      "ch.Assignment.ExtensionsEntryR\nextension" +
      "s\032S\n\017ExtensionsEntry\022\020\n\003key\030\001 \001(\tR\003key\022*" +
      "\n\005value\030\002 \001(\0132\024.google.protobuf.AnyR\005val" +
      "ue:\0028\001J\004\010\002\020\003J\004\010\003\020\004\"\307\001\n\021DoubleRangeFilter" +
      "\022\035\n\ndouble_arg\030\001 \001(\tR\tdoubleArg\022\020\n\003max\030\002" +
      " \001(\001R\003max\022\020\n\003min\030\003 \001(\001R\003min\022>\n\007exclude\030\004" +
      " \001(\0162$.openmatch.DoubleRangeFilter.Exclu" +
      "deR\007exclude\"/\n\007Exclude\022\010\n\004NONE\020\000\022\007\n\003MIN\020" +
      "\001\022\007\n\003MAX\020\002\022\010\n\004BOTH\020\003\"I\n\022StringEqualsFilt" +
      "er\022\035\n\nstring_arg\030\001 \001(\tR\tstringArg\022\024\n\005val" +
      "ue\030\002 \001(\tR\005value\"$\n\020TagPresentFilter\022\020\n\003t" +
      "ag\030\001 \001(\tR\003tag\"\224\003\n\004Pool\022\022\n\004name\030\001 \001(\tR\004na" +
      "me\022N\n\024double_range_filters\030\002 \003(\0132\034.openm" +
      "atch.DoubleRangeFilterR\022doubleRangeFilte" +
      "rs\022Q\n\025string_equals_filters\030\004 \003(\0132\035.open" +
      "match.StringEqualsFilterR\023stringEqualsFi" +
      "lters\022K\n\023tag_present_filters\030\005 \003(\0132\033.ope" +
      "nmatch.TagPresentFilterR\021tagPresentFilte" +
      "rs\022A\n\016created_before\030\006 \001(\0132\032.google.prot" +
      "obuf.TimestampR\rcreatedBefore\022?\n\rcreated" +
      "_after\030\007 \001(\0132\032.google.protobuf.Timestamp" +
      "R\014createdAfterJ\004\010\003\020\004\"\363\001\n\014MatchProfile\022\022\n" +
      "\004name\030\001 \001(\tR\004name\022%\n\005pools\030\003 \003(\0132\017.openm" +
      "atch.PoolR\005pools\022G\n\nextensions\030\005 \003(\0132\'.o" +
      "penmatch.MatchProfile.ExtensionsEntryR\ne" +
      "xtensions\032S\n\017ExtensionsEntry\022\020\n\003key\030\001 \001(" +
      "\tR\003key\022*\n\005value\030\002 \001(\0132\024.google.protobuf." +
      "AnyR\005value:\0028\001J\004\010\002\020\003J\004\010\004\020\005\"\240\003\n\005Match\022\031\n\010" +
      "match_id\030\001 \001(\tR\007matchId\022#\n\rmatch_profile" +
      "\030\002 \001(\tR\014matchProfile\022%\n\016match_function\030\003" +
      " \001(\tR\rmatchFunction\022+\n\007tickets\030\004 \003(\0132\021.o" +
      "penmatch.TicketR\007tickets\022@\n\nextensions\030\007" +
      " \003(\0132 .openmatch.Match.ExtensionsEntryR\n" +
      "extensions\022/\n\010backfill\030\010 \001(\0132\023.openmatch" +
      ".BackfillR\010backfill\022/\n\023allocate_gameserv" +
      "er\030\t \001(\010R\022allocateGameserver\032S\n\017Extensio" +
      "nsEntry\022\020\n\003key\030\001 \001(\tR\003key\022*\n\005value\030\002 \001(\013" +
      "2\024.google.protobuf.AnyR\005value:\0028\001J\004\010\005\020\006J" +
      "\004\010\006\020\007\"\376\003\n\010Backfill\022\016\n\002id\030\001 \001(\tR\002id\022<\n\rse" +
      "arch_fields\030\002 \001(\0132\027.openmatch.SearchFiel" +
      "dsR\014searchFields\022C\n\nextensions\030\003 \003(\0132#.o" +
      "penmatch.Backfill.ExtensionsEntryR\nexten" +
      "sions\022S\n\020persistent_field\030\004 \003(\0132(.openma" +
      "tch.Backfill.PersistentFieldEntryR\017persi" +
      "stentField\022;\n\013create_time\030\005 \001(\0132\032.google" +
      ".protobuf.TimestampR\ncreateTime\022\036\n\ngener" +
      "ation\030\006 \001(\003R\ngeneration\032S\n\017ExtensionsEnt" +
      "ry\022\020\n\003key\030\001 \001(\tR\003key\022*\n\005value\030\002 \001(\0132\024.go" +
      "ogle.protobuf.AnyR\005value:\0028\001\032X\n\024Persiste" +
      "ntFieldEntry\022\020\n\003key\030\001 \001(\tR\003key\022*\n\005value\030" +
      "\002 \001(\0132\024.google.protobuf.AnyR\005value:\0028\001B\204" +
      "\001\n\rdev.openmatchB\rMessagesProtoP\001Z open-" +
      "match.dev/open-match/pkg/pb\242\002\003OXX\252\002\tOpen" +
      "match\312\002\tOpenmatch\342\002\025Openmatch\\GPBMetadat" +
      "a\352\002\tOpenmatchb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          dev.google.rpc.StatusProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_openmatch_Ticket_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_openmatch_Ticket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Ticket_descriptor,
        new java.lang.String[] { "Id", "Assignment", "SearchFields", "Extensions", "PersistentField", "CreateTime", });
    internal_static_openmatch_Ticket_ExtensionsEntry_descriptor =
      internal_static_openmatch_Ticket_descriptor.getNestedTypes().get(0);
    internal_static_openmatch_Ticket_ExtensionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Ticket_ExtensionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_openmatch_Ticket_PersistentFieldEntry_descriptor =
      internal_static_openmatch_Ticket_descriptor.getNestedTypes().get(1);
    internal_static_openmatch_Ticket_PersistentFieldEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Ticket_PersistentFieldEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_openmatch_SearchFields_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_openmatch_SearchFields_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_SearchFields_descriptor,
        new java.lang.String[] { "DoubleArgs", "StringArgs", "Tags", });
    internal_static_openmatch_SearchFields_DoubleArgsEntry_descriptor =
      internal_static_openmatch_SearchFields_descriptor.getNestedTypes().get(0);
    internal_static_openmatch_SearchFields_DoubleArgsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_SearchFields_DoubleArgsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_openmatch_SearchFields_StringArgsEntry_descriptor =
      internal_static_openmatch_SearchFields_descriptor.getNestedTypes().get(1);
    internal_static_openmatch_SearchFields_StringArgsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_SearchFields_StringArgsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_openmatch_Assignment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_openmatch_Assignment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Assignment_descriptor,
        new java.lang.String[] { "Connection", "Extensions", });
    internal_static_openmatch_Assignment_ExtensionsEntry_descriptor =
      internal_static_openmatch_Assignment_descriptor.getNestedTypes().get(0);
    internal_static_openmatch_Assignment_ExtensionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Assignment_ExtensionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_openmatch_DoubleRangeFilter_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_openmatch_DoubleRangeFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_DoubleRangeFilter_descriptor,
        new java.lang.String[] { "DoubleArg", "Max", "Min", "Exclude", });
    internal_static_openmatch_StringEqualsFilter_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_openmatch_StringEqualsFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_StringEqualsFilter_descriptor,
        new java.lang.String[] { "StringArg", "Value", });
    internal_static_openmatch_TagPresentFilter_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_openmatch_TagPresentFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_TagPresentFilter_descriptor,
        new java.lang.String[] { "Tag", });
    internal_static_openmatch_Pool_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_openmatch_Pool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Pool_descriptor,
        new java.lang.String[] { "Name", "DoubleRangeFilters", "StringEqualsFilters", "TagPresentFilters", "CreatedBefore", "CreatedAfter", });
    internal_static_openmatch_MatchProfile_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_openmatch_MatchProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_MatchProfile_descriptor,
        new java.lang.String[] { "Name", "Pools", "Extensions", });
    internal_static_openmatch_MatchProfile_ExtensionsEntry_descriptor =
      internal_static_openmatch_MatchProfile_descriptor.getNestedTypes().get(0);
    internal_static_openmatch_MatchProfile_ExtensionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_MatchProfile_ExtensionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_openmatch_Match_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_openmatch_Match_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Match_descriptor,
        new java.lang.String[] { "MatchId", "MatchProfile", "MatchFunction", "Tickets", "Extensions", "Backfill", "AllocateGameserver", });
    internal_static_openmatch_Match_ExtensionsEntry_descriptor =
      internal_static_openmatch_Match_descriptor.getNestedTypes().get(0);
    internal_static_openmatch_Match_ExtensionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Match_ExtensionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_openmatch_Backfill_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_openmatch_Backfill_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Backfill_descriptor,
        new java.lang.String[] { "Id", "SearchFields", "Extensions", "PersistentField", "CreateTime", "Generation", });
    internal_static_openmatch_Backfill_ExtensionsEntry_descriptor =
      internal_static_openmatch_Backfill_descriptor.getNestedTypes().get(0);
    internal_static_openmatch_Backfill_ExtensionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Backfill_ExtensionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_openmatch_Backfill_PersistentFieldEntry_descriptor =
      internal_static_openmatch_Backfill_descriptor.getNestedTypes().get(1);
    internal_static_openmatch_Backfill_PersistentFieldEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openmatch_Backfill_PersistentFieldEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    dev.google.rpc.StatusProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}