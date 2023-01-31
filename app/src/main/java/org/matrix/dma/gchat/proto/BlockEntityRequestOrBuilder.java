// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface BlockEntityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BlockEntityRequest)
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
   * <pre>
   *oneof Entity {
   * </pre>
   *
   * <code>optional .UserId user_id = 1;</code>
   * @return Whether the userId field is set.
   */
  boolean hasUserId();
  /**
   * <pre>
   *oneof Entity {
   * </pre>
   *
   * <code>optional .UserId user_id = 1;</code>
   * @return The userId.
   */
  org.matrix.dma.gchat.proto.UserId getUserId();
  /**
   * <pre>
   *oneof Entity {
   * </pre>
   *
   * <code>optional .UserId user_id = 1;</code>
   */
  org.matrix.dma.gchat.proto.UserIdOrBuilder getUserIdOrBuilder();

  /**
   * <code>optional .GroupId group_id = 2;</code>
   * @return Whether the groupId field is set.
   */
  boolean hasGroupId();
  /**
   * <code>optional .GroupId group_id = 2;</code>
   * @return The groupId.
   */
  org.matrix.dma.gchat.proto.GroupId getGroupId();
  /**
   * <code>optional .GroupId group_id = 2;</code>
   */
  org.matrix.dma.gchat.proto.GroupIdOrBuilder getGroupIdOrBuilder();

  /**
   * <pre>
   *}
   * </pre>
   *
   * <code>optional bool blocked = 3;</code>
   * @return Whether the blocked field is set.
   */
  boolean hasBlocked();
  /**
   * <pre>
   *}
   * </pre>
   *
   * <code>optional bool blocked = 3;</code>
   * @return The blocked.
   */
  boolean getBlocked();

  /**
   * <code>optional bool reported = 4;</code>
   * @return Whether the reported field is set.
   */
  boolean hasReported();
  /**
   * <code>optional bool reported = 4;</code>
   * @return The reported.
   */
  boolean getReported();
}
