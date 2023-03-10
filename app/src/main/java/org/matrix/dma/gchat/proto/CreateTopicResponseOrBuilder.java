// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface CreateTopicResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateTopicResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .Topic topic = 1;</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <code>optional .Topic topic = 1;</code>
   * @return The topic.
   */
  org.matrix.dma.gchat.proto.Topic getTopic();
  /**
   * <code>optional .Topic topic = 1;</code>
   */
  org.matrix.dma.gchat.proto.TopicOrBuilder getTopicOrBuilder();

  /**
   * <code>optional .WriteRevision group_revision = 2;</code>
   * @return Whether the groupRevision field is set.
   */
  boolean hasGroupRevision();
  /**
   * <code>optional .WriteRevision group_revision = 2;</code>
   * @return The groupRevision.
   */
  org.matrix.dma.gchat.proto.WriteRevision getGroupRevision();
  /**
   * <code>optional .WriteRevision group_revision = 2;</code>
   */
  org.matrix.dma.gchat.proto.WriteRevisionOrBuilder getGroupRevisionOrBuilder();

  /**
   * <code>optional .ReadRevision current_group_revision = 3;</code>
   * @return Whether the currentGroupRevision field is set.
   */
  boolean hasCurrentGroupRevision();
  /**
   * <code>optional .ReadRevision current_group_revision = 3;</code>
   * @return The currentGroupRevision.
   */
  org.matrix.dma.gchat.proto.ReadRevision getCurrentGroupRevision();
  /**
   * <code>optional .ReadRevision current_group_revision = 3;</code>
   */
  org.matrix.dma.gchat.proto.ReadRevisionOrBuilder getCurrentGroupRevisionOrBuilder();
}
