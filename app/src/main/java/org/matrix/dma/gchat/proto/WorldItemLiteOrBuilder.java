// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface WorldItemLiteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:WorldItemLite)
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
   * <code>optional .ReadRevision group_revision = 2;</code>
   * @return Whether the groupRevision field is set.
   */
  boolean hasGroupRevision();
  /**
   * <code>optional .ReadRevision group_revision = 2;</code>
   * @return The groupRevision.
   */
  org.matrix.dma.gchat.proto.ReadRevision getGroupRevision();
  /**
   * <code>optional .ReadRevision group_revision = 2;</code>
   */
  org.matrix.dma.gchat.proto.ReadRevisionOrBuilder getGroupRevisionOrBuilder();

  /**
   * <code>optional int64 sort_timestamp = 3;</code>
   * @return Whether the sortTimestamp field is set.
   */
  boolean hasSortTimestamp();
  /**
   * <code>optional int64 sort_timestamp = 3;</code>
   * @return The sortTimestamp.
   */
  long getSortTimestamp();

  /**
   * <code>optional .GroupReadState read_state = 4;</code>
   * @return Whether the readState field is set.
   */
  boolean hasReadState();
  /**
   * <code>optional .GroupReadState read_state = 4;</code>
   * @return The readState.
   */
  org.matrix.dma.gchat.proto.GroupReadState getReadState();
  /**
   * <code>optional .GroupReadState read_state = 4;</code>
   */
  org.matrix.dma.gchat.proto.GroupReadStateOrBuilder getReadStateOrBuilder();

  /**
   * <code>optional string room_name = 5;</code>
   * @return Whether the roomName field is set.
   */
  boolean hasRoomName();
  /**
   * <code>optional string room_name = 5;</code>
   * @return The roomName.
   */
  java.lang.String getRoomName();
  /**
   * <code>optional string room_name = 5;</code>
   * @return The bytes for roomName.
   */
  com.google.protobuf.ByteString
      getRoomNameBytes();

  /**
   * <code>optional .WorldItemLite.DmMembers dm_members = 6;</code>
   * @return Whether the dmMembers field is set.
   */
  boolean hasDmMembers();
  /**
   * <code>optional .WorldItemLite.DmMembers dm_members = 6;</code>
   * @return The dmMembers.
   */
  org.matrix.dma.gchat.proto.WorldItemLite.DmMembers getDmMembers();
  /**
   * <code>optional .WorldItemLite.DmMembers dm_members = 6;</code>
   */
  org.matrix.dma.gchat.proto.WorldItemLite.DmMembersOrBuilder getDmMembersOrBuilder();

  /**
   * <code>optional .NameUsers name_users = 20;</code>
   * @return Whether the nameUsers field is set.
   */
  boolean hasNameUsers();
  /**
   * <code>optional .NameUsers name_users = 20;</code>
   * @return The nameUsers.
   */
  org.matrix.dma.gchat.proto.NameUsers getNameUsers();
  /**
   * <code>optional .NameUsers name_users = 20;</code>
   */
  org.matrix.dma.gchat.proto.NameUsersOrBuilder getNameUsersOrBuilder();

  /**
   * <code>optional int64 retention_horizon_time_micros = 8;</code>
   * @return Whether the retentionHorizonTimeMicros field is set.
   */
  boolean hasRetentionHorizonTimeMicros();
  /**
   * <code>optional int64 retention_horizon_time_micros = 8;</code>
   * @return The retentionHorizonTimeMicros.
   */
  long getRetentionHorizonTimeMicros();

  /**
   * <code>optional int64 retention_duration_seconds = 9;</code>
   * @return Whether the retentionDurationSeconds field is set.
   */
  boolean hasRetentionDurationSeconds();
  /**
   * <code>optional int64 retention_duration_seconds = 9;</code>
   * @return The retentionDurationSeconds.
   */
  long getRetentionDurationSeconds();

  /**
   * <code>optional .WorldItemLite.GroupLite group_lite = 7;</code>
   * @return Whether the groupLite field is set.
   */
  boolean hasGroupLite();
  /**
   * <code>optional .WorldItemLite.GroupLite group_lite = 7;</code>
   * @return The groupLite.
   */
  org.matrix.dma.gchat.proto.WorldItemLite.GroupLite getGroupLite();
  /**
   * <code>optional .WorldItemLite.GroupLite group_lite = 7;</code>
   */
  org.matrix.dma.gchat.proto.WorldItemLite.GroupLiteOrBuilder getGroupLiteOrBuilder();

  /**
   * <pre>
   *optional GroupGuestAccessSettings group_guest_access_settings = 10;
   *optional OrganizationInfo organization_info = 11;
   *repeated GsuiteIntegration gsuite_integration = 12;
   * </pre>
   *
   * <code>optional .Message message = 13;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   *optional GroupGuestAccessSettings group_guest_access_settings = 10;
   *optional OrganizationInfo organization_info = 11;
   *repeated GsuiteIntegration gsuite_integration = 12;
   * </pre>
   *
   * <code>optional .Message message = 13;</code>
   * @return The message.
   */
  org.matrix.dma.gchat.proto.Message getMessage();
  /**
   * <pre>
   *optional GroupGuestAccessSettings group_guest_access_settings = 10;
   *optional OrganizationInfo organization_info = 11;
   *repeated GsuiteIntegration gsuite_integration = 12;
   * </pre>
   *
   * <code>optional .Message message = 13;</code>
   */
  org.matrix.dma.gchat.proto.MessageOrBuilder getMessageOrBuilder();

  /**
   * <code>optional bool is_message_blocked = 25;</code>
   * @return Whether the isMessageBlocked field is set.
   */
  boolean hasIsMessageBlocked();
  /**
   * <code>optional bool is_message_blocked = 25;</code>
   * @return The isMessageBlocked.
   */
  boolean getIsMessageBlocked();

  /**
   * <code>optional .WorldItemLite.FlatGroup flat_group = 14;</code>
   * @return Whether the flatGroup field is set.
   */
  boolean hasFlatGroup();
  /**
   * <code>optional .WorldItemLite.FlatGroup flat_group = 14;</code>
   * @return The flatGroup.
   */
  org.matrix.dma.gchat.proto.WorldItemLite.FlatGroup getFlatGroup();
  /**
   * <code>optional .WorldItemLite.FlatGroup flat_group = 14;</code>
   */
  org.matrix.dma.gchat.proto.WorldItemLite.FlatGroupOrBuilder getFlatGroupOrBuilder();

  /**
   * <code>optional .WorldItemLite.ThreadedGroup threaded_group = 15;</code>
   * @return Whether the threadedGroup field is set.
   */
  boolean hasThreadedGroup();
  /**
   * <code>optional .WorldItemLite.ThreadedGroup threaded_group = 15;</code>
   * @return The threadedGroup.
   */
  org.matrix.dma.gchat.proto.WorldItemLite.ThreadedGroup getThreadedGroup();
  /**
   * <code>optional .WorldItemLite.ThreadedGroup threaded_group = 15;</code>
   */
  org.matrix.dma.gchat.proto.WorldItemLite.ThreadedGroupOrBuilder getThreadedGroupOrBuilder();

  /**
   * <code>optional string avatar_url = 16;</code>
   * @return Whether the avatarUrl field is set.
   */
  boolean hasAvatarUrl();
  /**
   * <code>optional string avatar_url = 16;</code>
   * @return The avatarUrl.
   */
  java.lang.String getAvatarUrl();
  /**
   * <code>optional string avatar_url = 16;</code>
   * @return The bytes for avatarUrl.
   */
  com.google.protobuf.ByteString
      getAvatarUrlBytes();

  /**
   * <pre>
   *repeated ?? space_integration_payloads = 17;
   *optional GroupIntegrationSettings group_integration_settings = 22;
   * optional AvatarInfo avatar_info = 18;
   * </pre>
   *
   * <code>optional .SharedAttributeCheckerGroupType attribute_checker_group_type = 19;</code>
   * @return Whether the attributeCheckerGroupType field is set.
   */
  boolean hasAttributeCheckerGroupType();
  /**
   * <pre>
   *repeated ?? space_integration_payloads = 17;
   *optional GroupIntegrationSettings group_integration_settings = 22;
   * optional AvatarInfo avatar_info = 18;
   * </pre>
   *
   * <code>optional .SharedAttributeCheckerGroupType attribute_checker_group_type = 19;</code>
   * @return The attributeCheckerGroupType.
   */
  org.matrix.dma.gchat.proto.SharedAttributeCheckerGroupType getAttributeCheckerGroupType();

  /**
   * <code>optional .GroupSupportLevel group_support_level = 23;</code>
   * @return Whether the groupSupportLevel field is set.
   */
  boolean hasGroupSupportLevel();
  /**
   * <code>optional .GroupSupportLevel group_support_level = 23;</code>
   * @return The groupSupportLevel.
   */
  org.matrix.dma.gchat.proto.GroupSupportLevel getGroupSupportLevel();

  /**
   * <pre>
   * optional ?? group_policies = 26;
   * </pre>
   *
   * <code>optional .GroupUnsupportedReason group_unsupported_reason = 24;</code>
   * @return Whether the groupUnsupportedReason field is set.
   */
  boolean hasGroupUnsupportedReason();
  /**
   * <pre>
   * optional ?? group_policies = 26;
   * </pre>
   *
   * <code>optional .GroupUnsupportedReason group_unsupported_reason = 24;</code>
   * @return The groupUnsupportedReason.
   */
  org.matrix.dma.gchat.proto.GroupUnsupportedReason getGroupUnsupportedReason();
}
