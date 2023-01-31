// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface CreateDmRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateDmRequest)
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
   * <code>repeated .CreateDmRequest.FetchOptions fetch_options = 8;</code>
   * @return A list containing the fetchOptions.
   */
  java.util.List<org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions> getFetchOptionsList();
  /**
   * <code>repeated .CreateDmRequest.FetchOptions fetch_options = 8;</code>
   * @return The count of fetchOptions.
   */
  int getFetchOptionsCount();
  /**
   * <code>repeated .CreateDmRequest.FetchOptions fetch_options = 8;</code>
   * @param index The index of the element to return.
   * @return The fetchOptions at the given index.
   */
  org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions getFetchOptions(int index);

  /**
   * <code>repeated .UserId members = 1;</code>
   */
  java.util.List<org.matrix.dma.gchat.proto.UserId> 
      getMembersList();
  /**
   * <code>repeated .UserId members = 1;</code>
   */
  org.matrix.dma.gchat.proto.UserId getMembers(int index);
  /**
   * <code>repeated .UserId members = 1;</code>
   */
  int getMembersCount();
  /**
   * <code>repeated .UserId members = 1;</code>
   */
  java.util.List<? extends org.matrix.dma.gchat.proto.UserIdOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <code>repeated .UserId members = 1;</code>
   */
  org.matrix.dma.gchat.proto.UserIdOrBuilder getMembersOrBuilder(
      int index);

  /**
   * <code>repeated .InviteeInfo invitees = 7;</code>
   */
  java.util.List<org.matrix.dma.gchat.proto.InviteeInfo> 
      getInviteesList();
  /**
   * <code>repeated .InviteeInfo invitees = 7;</code>
   */
  org.matrix.dma.gchat.proto.InviteeInfo getInvitees(int index);
  /**
   * <code>repeated .InviteeInfo invitees = 7;</code>
   */
  int getInviteesCount();
  /**
   * <code>repeated .InviteeInfo invitees = 7;</code>
   */
  java.util.List<? extends org.matrix.dma.gchat.proto.InviteeInfoOrBuilder> 
      getInviteesOrBuilderList();
  /**
   * <code>repeated .InviteeInfo invitees = 7;</code>
   */
  org.matrix.dma.gchat.proto.InviteeInfoOrBuilder getInviteesOrBuilder(
      int index);

  /**
   * <pre>
   * optional MessageCreationInfo message_creation_info = 2;
   * </pre>
   *
   * <code>optional .RetentionSettings retention_settings = 3;</code>
   * @return Whether the retentionSettings field is set.
   */
  boolean hasRetentionSettings();
  /**
   * <pre>
   * optional MessageCreationInfo message_creation_info = 2;
   * </pre>
   *
   * <code>optional .RetentionSettings retention_settings = 3;</code>
   * @return The retentionSettings.
   */
  org.matrix.dma.gchat.proto.RetentionSettings getRetentionSettings();
  /**
   * <pre>
   * optional MessageCreationInfo message_creation_info = 2;
   * </pre>
   *
   * <code>optional .RetentionSettings retention_settings = 3;</code>
   */
  org.matrix.dma.gchat.proto.RetentionSettingsOrBuilder getRetentionSettingsOrBuilder();

  /**
   * <code>optional string local_id = 4;</code>
   * @return Whether the localId field is set.
   */
  boolean hasLocalId();
  /**
   * <code>optional string local_id = 4;</code>
   * @return The localId.
   */
  java.lang.String getLocalId();
  /**
   * <code>optional string local_id = 4;</code>
   * @return The bytes for localId.
   */
  com.google.protobuf.ByteString
      getLocalIdBytes();

  /**
   * <code>optional string topic_and_message_id = 5;</code>
   * @return Whether the topicAndMessageId field is set.
   */
  boolean hasTopicAndMessageId();
  /**
   * <code>optional string topic_and_message_id = 5;</code>
   * @return The topicAndMessageId.
   */
  java.lang.String getTopicAndMessageId();
  /**
   * <code>optional string topic_and_message_id = 5;</code>
   * @return The bytes for topicAndMessageId.
   */
  com.google.protobuf.ByteString
      getTopicAndMessageIdBytes();
}
