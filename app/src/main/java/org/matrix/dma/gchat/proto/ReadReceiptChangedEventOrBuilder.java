// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface ReadReceiptChangedEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ReadReceiptChangedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .GroupId group_id = 1;</code>
   * @return Whether the groupId field is set.
   */
  boolean hasGroupId();
  /**
   * <code>optional .GroupId group_id = 1;</code>
   * @return The groupId.
   */
  org.matrix.dma.gchat.proto.GroupId getGroupId();
  /**
   * <code>optional .GroupId group_id = 1;</code>
   */
  org.matrix.dma.gchat.proto.GroupIdOrBuilder getGroupIdOrBuilder();

  /**
   * <code>optional .ReadReceiptSet read_receipt_set = 2;</code>
   * @return Whether the readReceiptSet field is set.
   */
  boolean hasReadReceiptSet();
  /**
   * <code>optional .ReadReceiptSet read_receipt_set = 2;</code>
   * @return The readReceiptSet.
   */
  org.matrix.dma.gchat.proto.ReadReceiptSet getReadReceiptSet();
  /**
   * <code>optional .ReadReceiptSet read_receipt_set = 2;</code>
   */
  org.matrix.dma.gchat.proto.ReadReceiptSetOrBuilder getReadReceiptSetOrBuilder();
}
