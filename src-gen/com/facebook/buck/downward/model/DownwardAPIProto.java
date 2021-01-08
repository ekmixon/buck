// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: downward_api.proto

package com.facebook.buck.downward.model;

@javax.annotation.Generated(value="protoc", comments="annotations:DownwardAPIProto.java.pb.meta")
public final class DownwardAPIProto {
  private DownwardAPIProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_EventTypeMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_EventTypeMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ConsoleEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ConsoleEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_LogEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_LogEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_StepEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_StepEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ChromeTraceEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ChromeTraceEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ChromeTraceEvent_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ChromeTraceEvent_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_EndEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_EndEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ExternalEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ExternalEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ExternalEvent_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ExternalEvent_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_ResultEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_ResultEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_downward_api_v1_PipelineFinishedEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_downward_api_v1_PipelineFinishedEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022downward_api.proto\022\017downward.api.v1\032\036g" +
      "oogle/protobuf/duration.proto\"\252\002\n\020EventT" +
      "ypeMessage\022?\n\nevent_type\030\001 \001(\0162+.downwar" +
      "d.api.v1.EventTypeMessage.EventType\022\036\n\026c" +
      "ustom_event_type_code\030\002 \001(\005\"\264\001\n\tEventTyp" +
      "e\022\013\n\007UNKNOWN\020\000\022\021\n\rCONSOLE_EVENT\020\001\022\r\n\tLOG" +
      "_EVENT\020\002\022\026\n\022CHROME_TRACE_EVENT\020\003\022\016\n\nSTEP" +
      "_EVENT\020\004\022\022\n\016EXTERNAL_EVENT\020\005\022\020\n\014RESULT_E" +
      "VENT\020\006\022\033\n\027PIPELINE_FINISHED_EVENT\020\007\022\r\n\tE" +
      "ND_EVENT\020d\"M\n\014ConsoleEvent\022,\n\tlog_level\030" +
      "\001 \001(\0162\031.downward.api.v1.LogLevel\022\017\n\007mess" +
      "age\030\002 \001(\t\"^\n\010LogEvent\022,\n\tlog_level\030\001 \001(\016" +
      "2\031.downward.api.v1.LogLevel\022\017\n\007message\030\002" +
      " \001(\t\022\023\n\013logger_name\030\003 \001(\t\"\344\001\n\tStepEvent\022" +
      "\020\n\010event_id\030\001 \001(\005\022:\n\013step_status\030\002 \001(\0162%" +
      ".downward.api.v1.StepEvent.StepStatus\022\021\n" +
      "\tstep_type\030\003 \001(\t\022\023\n\013description\030\004 \001(\t\022+\n" +
      "\010duration\030\005 \001(\0132\031.google.protobuf.Durati" +
      "on\"4\n\nStepStatus\022\013\n\007UNKNOWN\020\000\022\013\n\007STARTED" +
      "\020\001\022\014\n\010FINISHED\020\002\"\337\002\n\020ChromeTraceEvent\022\020\n" +
      "\010event_id\030\001 \001(\005\022\020\n\010category\030\002 \001(\t\022H\n\006sta" +
      "tus\030\003 \001(\01628.downward.api.v1.ChromeTraceE" +
      "vent.ChromeTraceEventStatus\0229\n\004data\030\004 \003(" +
      "\0132+.downward.api.v1.ChromeTraceEvent.Dat" +
      "aEntry\022+\n\010duration\030\005 \001(\0132\031.google.protob" +
      "uf.Duration\022\r\n\005title\030\006 \001(\t\032+\n\tDataEntry\022" +
      "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"9\n\026Chrom" +
      "eTraceEventStatus\022\013\n\007UNKNOWN\020\000\022\t\n\005BEGIN\020" +
      "\001\022\007\n\003END\020\002\"\n\n\010EndEvent\"t\n\rExternalEvent\022" +
      "6\n\004data\030\001 \003(\0132(.downward.api.v1.External" +
      "Event.DataEntry\032+\n\tDataEntry\022\013\n\003key\030\001 \001(" +
      "\t\022\r\n\005value\030\002 \001(\t:\0028\001\"D\n\013ResultEvent\022\021\n\ta" +
      "ction_id\030\001 \001(\t\022\021\n\texit_code\030\002 \001(\005\022\017\n\007mes" +
      "sage\030\003 \001(\t\"\027\n\025PipelineFinishedEvent*W\n\010L" +
      "ogLevel\022\013\n\007UNKNOWN\020\000\022\t\n\005FATAL\020\001\022\t\n\005ERROR" +
      "\020\002\022\010\n\004WARN\020\003\022\010\n\004INFO\020\004\022\t\n\005DEBUG\020\005\022\t\n\005TRA" +
      "CE\020\006B6\n com.facebook.buck.downward.model" +
      "B\020DownwardAPIProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
        }, assigner);
    internal_static_downward_api_v1_EventTypeMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_downward_api_v1_EventTypeMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_EventTypeMessage_descriptor,
        new java.lang.String[] { "EventType", "CustomEventTypeCode", });
    internal_static_downward_api_v1_ConsoleEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_downward_api_v1_ConsoleEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ConsoleEvent_descriptor,
        new java.lang.String[] { "LogLevel", "Message", });
    internal_static_downward_api_v1_LogEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_downward_api_v1_LogEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_LogEvent_descriptor,
        new java.lang.String[] { "LogLevel", "Message", "LoggerName", });
    internal_static_downward_api_v1_StepEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_downward_api_v1_StepEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_StepEvent_descriptor,
        new java.lang.String[] { "EventId", "StepStatus", "StepType", "Description", "Duration", });
    internal_static_downward_api_v1_ChromeTraceEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_downward_api_v1_ChromeTraceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ChromeTraceEvent_descriptor,
        new java.lang.String[] { "EventId", "Category", "Status", "Data", "Duration", "Title", });
    internal_static_downward_api_v1_ChromeTraceEvent_DataEntry_descriptor =
      internal_static_downward_api_v1_ChromeTraceEvent_descriptor.getNestedTypes().get(0);
    internal_static_downward_api_v1_ChromeTraceEvent_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ChromeTraceEvent_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_downward_api_v1_EndEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_downward_api_v1_EndEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_EndEvent_descriptor,
        new java.lang.String[] { });
    internal_static_downward_api_v1_ExternalEvent_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_downward_api_v1_ExternalEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ExternalEvent_descriptor,
        new java.lang.String[] { "Data", });
    internal_static_downward_api_v1_ExternalEvent_DataEntry_descriptor =
      internal_static_downward_api_v1_ExternalEvent_descriptor.getNestedTypes().get(0);
    internal_static_downward_api_v1_ExternalEvent_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ExternalEvent_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_downward_api_v1_ResultEvent_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_downward_api_v1_ResultEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_ResultEvent_descriptor,
        new java.lang.String[] { "ActionId", "ExitCode", "Message", });
    internal_static_downward_api_v1_PipelineFinishedEvent_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_downward_api_v1_PipelineFinishedEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_downward_api_v1_PipelineFinishedEvent_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
