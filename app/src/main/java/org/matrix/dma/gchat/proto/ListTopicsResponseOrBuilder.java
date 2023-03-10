// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface ListTopicsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ListTopicsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Topic topics = 1;</code>
   */
  java.util.List<org.matrix.dma.gchat.proto.Topic> 
      getTopicsList();
  /**
   * <code>repeated .Topic topics = 1;</code>
   */
  org.matrix.dma.gchat.proto.Topic getTopics(int index);
  /**
   * <code>repeated .Topic topics = 1;</code>
   */
  int getTopicsCount();
  /**
   * <code>repeated .Topic topics = 1;</code>
   */
  java.util.List<? extends org.matrix.dma.gchat.proto.TopicOrBuilder> 
      getTopicsOrBuilderList();
  /**
   * <code>repeated .Topic topics = 1;</code>
   */
  org.matrix.dma.gchat.proto.TopicOrBuilder getTopicsOrBuilder(
      int index);

  /**
   * <code>optional .ReadRevision user_revision = 2;</code>
   * @return Whether the userRevision field is set.
   */
  boolean hasUserRevision();
  /**
   * <code>optional .ReadRevision user_revision = 2;</code>
   * @return The userRevision.
   */
  org.matrix.dma.gchat.proto.ReadRevision getUserRevision();
  /**
   * <code>optional .ReadRevision user_revision = 2;</code>
   */
  org.matrix.dma.gchat.proto.ReadRevisionOrBuilder getUserRevisionOrBuilder();

  /**
   * <code>optional .ReadRevision group_revision = 3;</code>
   * @return Whether the groupRevision field is set.
   */
  boolean hasGroupRevision();
  /**
   * <code>optional .ReadRevision group_revision = 3;</code>
   * @return The groupRevision.
   */
  org.matrix.dma.gchat.proto.ReadRevision getGroupRevision();
  /**
   * <code>optional .ReadRevision group_revision = 3;</code>
   */
  org.matrix.dma.gchat.proto.ReadRevisionOrBuilder getGroupRevisionOrBuilder();

  /**
   * <code>optional bool contains_first_topic = 4;</code>
   * @return Whether the containsFirstTopic field is set.
   */
  boolean hasContainsFirstTopic();
  /**
   * <code>optional bool contains_first_topic = 4;</code>
   * @return The containsFirstTopic.
   */
  boolean getContainsFirstTopic();

  /**
   * <code>optional bool contains_last_topic = 5;</code>
   * @return Whether the containsLastTopic field is set.
   */
  boolean hasContainsLastTopic();
  /**
   * <code>optional bool contains_last_topic = 5;</code>
   * @return The containsLastTopic.
   */
  boolean getContainsLastTopic();

  /**
   * <code>optional .ReadReceiptSet read_receipt_set = 6;</code>
   * @return Whether the readReceiptSet field is set.
   */
  boolean hasReadReceiptSet();
  /**
   * <code>optional .ReadReceiptSet read_receipt_set = 6;</code>
   * @return The readReceiptSet.
   */
  org.matrix.dma.gchat.proto.ReadReceiptSet getReadReceiptSet();
  /**
   * <code>optional .ReadReceiptSet read_receipt_set = 6;</code>
   */
  org.matrix.dma.gchat.proto.ReadReceiptSetOrBuilder getReadReceiptSetOrBuilder();
}
