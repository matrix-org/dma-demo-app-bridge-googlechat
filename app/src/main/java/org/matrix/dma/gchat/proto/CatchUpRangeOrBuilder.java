// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface CatchUpRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CatchUpRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 from_revision_timestamp = 1;</code>
   * @return Whether the fromRevisionTimestamp field is set.
   */
  boolean hasFromRevisionTimestamp();
  /**
   * <code>optional int64 from_revision_timestamp = 1;</code>
   * @return The fromRevisionTimestamp.
   */
  long getFromRevisionTimestamp();

  /**
   * <code>optional int64 to_revision_timestamp = 2;</code>
   * @return Whether the toRevisionTimestamp field is set.
   */
  boolean hasToRevisionTimestamp();
  /**
   * <code>optional int64 to_revision_timestamp = 2;</code>
   * @return The toRevisionTimestamp.
   */
  long getToRevisionTimestamp();
}
