// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface HideGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HideGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .RequestHeader request_header = 100;</code>
   * @return Whether the requestHeader field is set.
   */
  boolean hasRequestHeader();
  /**
   * <code>optional .RequestHeader request_header = 100;</code>
   * @return The requestHeader.
   */
  org.matrix.dma.gchat.proto.RequestHeader getRequestHeader();
  /**
   * <code>optional .RequestHeader request_header = 100;</code>
   */
  org.matrix.dma.gchat.proto.RequestHeaderOrBuilder getRequestHeaderOrBuilder();

  /**
   * <code>optional .GroupId id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional .GroupId id = 1;</code>
   * @return The id.
   */
  org.matrix.dma.gchat.proto.GroupId getId();
  /**
   * <code>optional .GroupId id = 1;</code>
   */
  org.matrix.dma.gchat.proto.GroupIdOrBuilder getIdOrBuilder();

  /**
   * <code>optional bool hide = 2;</code>
   * @return Whether the hide field is set.
   */
  boolean hasHide();
  /**
   * <code>optional bool hide = 2;</code>
   * @return The hide.
   */
  boolean getHide();
}
