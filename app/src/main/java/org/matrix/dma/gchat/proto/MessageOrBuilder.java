// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .MessageId id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional .MessageId id = 1;</code>
   * @return The id.
   */
  org.matrix.dma.gchat.proto.MessageId getId();
  /**
   * <code>optional .MessageId id = 1;</code>
   */
  org.matrix.dma.gchat.proto.MessageIdOrBuilder getIdOrBuilder();

  /**
   * <code>optional .Message.MessageState message_state = 20;</code>
   * @return Whether the messageState field is set.
   */
  boolean hasMessageState();
  /**
   * <code>optional .Message.MessageState message_state = 20;</code>
   * @return The messageState.
   */
  org.matrix.dma.gchat.proto.Message.MessageState getMessageState();

  /**
   * <code>optional .User creator = 2;</code>
   * @return Whether the creator field is set.
   */
  boolean hasCreator();
  /**
   * <code>optional .User creator = 2;</code>
   * @return The creator.
   */
  org.matrix.dma.gchat.proto.User getCreator();
  /**
   * <code>optional .User creator = 2;</code>
   */
  org.matrix.dma.gchat.proto.UserOrBuilder getCreatorOrBuilder();

  /**
   * <code>optional int64 create_time = 3;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>optional int64 create_time = 3;</code>
   * @return The createTime.
   */
  long getCreateTime();

  /**
   * <code>optional int64 last_update_time = 4;</code>
   * @return Whether the lastUpdateTime field is set.
   */
  boolean hasLastUpdateTime();
  /**
   * <code>optional int64 last_update_time = 4;</code>
   * @return The lastUpdateTime.
   */
  long getLastUpdateTime();

  /**
   * <code>optional int64 delete_time = 8;</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <code>optional int64 delete_time = 8;</code>
   * @return The deleteTime.
   */
  long getDeleteTime();

  /**
   * <code>optional int64 last_edit_time = 17;</code>
   * @return Whether the lastEditTime field is set.
   */
  boolean hasLastEditTime();
  /**
   * <code>optional int64 last_edit_time = 17;</code>
   * @return The lastEditTime.
   */
  long getLastEditTime();

  /**
   * <code>optional string text_body = 10;</code>
   * @return Whether the textBody field is set.
   */
  boolean hasTextBody();
  /**
   * <code>optional string text_body = 10;</code>
   * @return The textBody.
   */
  java.lang.String getTextBody();
  /**
   * <code>optional string text_body = 10;</code>
   * @return The bytes for textBody.
   */
  com.google.protobuf.ByteString
      getTextBodyBytes();

  /**
   * <code>repeated .Annotation annotations = 11;</code>
   */
  java.util.List<org.matrix.dma.gchat.proto.Annotation> 
      getAnnotationsList();
  /**
   * <code>repeated .Annotation annotations = 11;</code>
   */
  org.matrix.dma.gchat.proto.Annotation getAnnotations(int index);
  /**
   * <code>repeated .Annotation annotations = 11;</code>
   */
  int getAnnotationsCount();
  /**
   * <code>repeated .Annotation annotations = 11;</code>
   */
  java.util.List<? extends org.matrix.dma.gchat.proto.AnnotationOrBuilder> 
      getAnnotationsOrBuilderList();
  /**
   * <code>repeated .Annotation annotations = 11;</code>
   */
  org.matrix.dma.gchat.proto.AnnotationOrBuilder getAnnotationsOrBuilder(
      int index);

  /**
   * <pre>
   *repeated DYNProtoBotResponse bot_responses = 19;
   * </pre>
   *
   * <code>optional string local_id = 14;</code>
   * @return Whether the localId field is set.
   */
  boolean hasLocalId();
  /**
   * <pre>
   *repeated DYNProtoBotResponse bot_responses = 19;
   * </pre>
   *
   * <code>optional string local_id = 14;</code>
   * @return The localId.
   */
  java.lang.String getLocalId();
  /**
   * <pre>
   *repeated DYNProtoBotResponse bot_responses = 19;
   * </pre>
   *
   * <code>optional string local_id = 14;</code>
   * @return The bytes for localId.
   */
  com.google.protobuf.ByteString
      getLocalIdBytes();

  /**
   * <code>repeated .Attachment attachments = 15;</code>
   */
  java.util.List<org.matrix.dma.gchat.proto.Attachment> 
      getAttachmentsList();
  /**
   * <code>repeated .Attachment attachments = 15;</code>
   */
  org.matrix.dma.gchat.proto.Attachment getAttachments(int index);
  /**
   * <code>repeated .Attachment attachments = 15;</code>
   */
  int getAttachmentsCount();
  /**
   * <code>repeated .Attachment attachments = 15;</code>
   */
  java.util.List<? extends org.matrix.dma.gchat.proto.AttachmentOrBuilder> 
      getAttachmentsOrBuilderList();
  /**
   * <code>repeated .Attachment attachments = 15;</code>
   */
  org.matrix.dma.gchat.proto.AttachmentOrBuilder getAttachmentsOrBuilder(
      int index);

  /**
   * <pre>
   *optional DYNProtoAppProfile app_profile = 16;
   * </pre>
   *
   * <code>optional .RetentionSettings retention_settings = 18;</code>
   * @return Whether the retentionSettings field is set.
   */
  boolean hasRetentionSettings();
  /**
   * <pre>
   *optional DYNProtoAppProfile app_profile = 16;
   * </pre>
   *
   * <code>optional .RetentionSettings retention_settings = 18;</code>
   * @return The retentionSettings.
   */
  org.matrix.dma.gchat.proto.RetentionSettings getRetentionSettings();
  /**
   * <pre>
   *optional DYNProtoAppProfile app_profile = 16;
   * </pre>
   *
   * <code>optional .RetentionSettings retention_settings = 18;</code>
   */
  org.matrix.dma.gchat.proto.RetentionSettingsOrBuilder getRetentionSettingsOrBuilder();

  /**
   * <code>repeated .Reaction reactions = 21;</code>
   */
  java.util.List<org.matrix.dma.gchat.proto.Reaction> 
      getReactionsList();
  /**
   * <code>repeated .Reaction reactions = 21;</code>
   */
  org.matrix.dma.gchat.proto.Reaction getReactions(int index);
  /**
   * <code>repeated .Reaction reactions = 21;</code>
   */
  int getReactionsCount();
  /**
   * <code>repeated .Reaction reactions = 21;</code>
   */
  java.util.List<? extends org.matrix.dma.gchat.proto.ReactionOrBuilder> 
      getReactionsOrBuilderList();
  /**
   * <code>repeated .Reaction reactions = 21;</code>
   */
  org.matrix.dma.gchat.proto.ReactionOrBuilder getReactionsOrBuilder(
      int index);

  /**
   * <pre>
   *repeated DYNProtoCommunalLabelTag communal_labels = 27;
   *repeated DYNProtoPersonalLabelTag personal_labels = 26;
   *optional ?? message_integration_payload = 23;
   *optional DYNProtoMessage_MessagePermission editable_by = 24;
   *optional DYNProtoMessage_MessagePermission deletable_by = 25;
   * </pre>
   *
   * <code>optional int64 last_reply_time = 5;</code>
   * @return Whether the lastReplyTime field is set.
   */
  boolean hasLastReplyTime();
  /**
   * <pre>
   *repeated DYNProtoCommunalLabelTag communal_labels = 27;
   *repeated DYNProtoPersonalLabelTag personal_labels = 26;
   *optional ?? message_integration_payload = 23;
   *optional DYNProtoMessage_MessagePermission editable_by = 24;
   *optional DYNProtoMessage_MessagePermission deletable_by = 25;
   * </pre>
   *
   * <code>optional int64 last_reply_time = 5;</code>
   * @return The lastReplyTime.
   */
  long getLastReplyTime();

  /**
   * <code>optional int64 last_view_time = 6;</code>
   * @return Whether the lastViewTime field is set.
   */
  boolean hasLastViewTime();
  /**
   * <code>optional int64 last_view_time = 6;</code>
   * @return The lastViewTime.
   */
  long getLastViewTime();

  /**
   * <code>optional int64 last_mention_time = 7;</code>
   * @return Whether the lastMentionTime field is set.
   */
  boolean hasLastMentionTime();
  /**
   * <code>optional int64 last_mention_time = 7;</code>
   * @return The lastMentionTime.
   */
  long getLastMentionTime();

  /**
   * <code>optional int64 num_unread_replies = 9;</code>
   * @return Whether the numUnreadReplies field is set.
   */
  boolean hasNumUnreadReplies();
  /**
   * <code>optional int64 num_unread_replies = 9;</code>
   * @return The numUnreadReplies.
   */
  long getNumUnreadReplies();

  /**
   * <code>optional .Message last_reply = 12;</code>
   * @return Whether the lastReply field is set.
   */
  boolean hasLastReply();
  /**
   * <code>optional .Message last_reply = 12;</code>
   * @return The lastReply.
   */
  org.matrix.dma.gchat.proto.Message getLastReply();
  /**
   * <code>optional .Message last_reply = 12;</code>
   */
  org.matrix.dma.gchat.proto.MessageOrBuilder getLastReplyOrBuilder();

  /**
   * <code>optional int64 sort_time = 13;</code>
   * @return Whether the sortTime field is set.
   */
  boolean hasSortTime();
  /**
   * <code>optional int64 sort_time = 13;</code>
   * @return The sortTime.
   */
  long getSortTime();

  /**
   * <code>optional .Message.MessageType message_type = 28;</code>
   * @return Whether the messageType field is set.
   */
  boolean hasMessageType();
  /**
   * <code>optional .Message.MessageType message_type = 28;</code>
   * @return The messageType.
   */
  org.matrix.dma.gchat.proto.Message.MessageType getMessageType();

  /**
   * <pre>
   *optional DYNProtoAppId origin_app_id = 29;
   * </pre>
   *
   * <code>optional .Membership creator_membership = 30;</code>
   * @return Whether the creatorMembership field is set.
   */
  boolean hasCreatorMembership();
  /**
   * <pre>
   *optional DYNProtoAppId origin_app_id = 29;
   * </pre>
   *
   * <code>optional .Membership creator_membership = 30;</code>
   * @return The creatorMembership.
   */
  org.matrix.dma.gchat.proto.Membership getCreatorMembership();
  /**
   * <pre>
   *optional DYNProtoAppId origin_app_id = 29;
   * </pre>
   *
   * <code>optional .Membership creator_membership = 30;</code>
   */
  org.matrix.dma.gchat.proto.MembershipOrBuilder getCreatorMembershipOrBuilder();
}
