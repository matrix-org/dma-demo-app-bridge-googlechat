// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface TopicIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TopicId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .GroupId group_id = 3;</code>
   * @return Whether the groupId field is set.
   */
  boolean hasGroupId();
  /**
   * <code>optional .GroupId group_id = 3;</code>
   * @return The groupId.
   */
  org.matrix.dma.gchat.proto.GroupId getGroupId();
  /**
   * <code>optional .GroupId group_id = 3;</code>
   */
  org.matrix.dma.gchat.proto.GroupIdOrBuilder getGroupIdOrBuilder();

  /**
   * <code>optional string topic_id = 2;</code>
   * @return Whether the topicId field is set.
   */
  boolean hasTopicId();
  /**
   * <code>optional string topic_id = 2;</code>
   * @return The topicId.
   */
  java.lang.String getTopicId();
  /**
   * <code>optional string topic_id = 2;</code>
   * @return The bytes for topicId.
   */
  com.google.protobuf.ByteString
      getTopicIdBytes();
}
