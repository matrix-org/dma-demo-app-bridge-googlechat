// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface ReadReceiptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ReadReceipt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 read_time_micros = 2;</code>
   * @return Whether the readTimeMicros field is set.
   */
  boolean hasReadTimeMicros();
  /**
   * <code>optional int64 read_time_micros = 2;</code>
   * @return The readTimeMicros.
   */
  long getReadTimeMicros();

  /**
   * <code>optional .User user = 3;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>optional .User user = 3;</code>
   * @return The user.
   */
  org.matrix.dma.gchat.proto.User getUser();
  /**
   * <code>optional .User user = 3;</code>
   */
  org.matrix.dma.gchat.proto.UserOrBuilder getUserOrBuilder();
}
