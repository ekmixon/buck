// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: downward_api.proto

package com.facebook.buck.downward.model;

@javax.annotation.Generated(value="protoc", comments="annotations:ResultEventOrBuilder.java.pb.meta")
public interface ResultEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:downward.api.v1.ResultEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string action_id = 1;</code>
   */
  java.lang.String getActionId();
  /**
   * <code>string action_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getActionIdBytes();

  /**
   * <code>int32 exit_code = 2;</code>
   */
  int getExitCode();

  /**
   * <code>string message = 3;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 3;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
