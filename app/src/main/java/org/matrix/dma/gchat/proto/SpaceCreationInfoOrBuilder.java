// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface SpaceCreationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SpaceCreationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * optional GroupGuestAccessSettings group_guest_access_settings = 3;
   * </pre>
   *
   * <code>optional .GroupVisibility visibility = 4;</code>
   * @return Whether the visibility field is set.
   */
  boolean hasVisibility();
  /**
   * <pre>
   * optional GroupGuestAccessSettings group_guest_access_settings = 3;
   * </pre>
   *
   * <code>optional .GroupVisibility visibility = 4;</code>
   * @return The visibility.
   */
  org.matrix.dma.gchat.proto.GroupVisibility getVisibility();
  /**
   * <pre>
   * optional GroupGuestAccessSettings group_guest_access_settings = 3;
   * </pre>
   *
   * <code>optional .GroupVisibility visibility = 4;</code>
   */
  org.matrix.dma.gchat.proto.GroupVisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <code>optional .SpaceCreationInfo.FlatGroup flat_group = 5;</code>
   * @return Whether the flatGroup field is set.
   */
  boolean hasFlatGroup();
  /**
   * <code>optional .SpaceCreationInfo.FlatGroup flat_group = 5;</code>
   * @return The flatGroup.
   */
  org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroup getFlatGroup();
  /**
   * <code>optional .SpaceCreationInfo.FlatGroup flat_group = 5;</code>
   */
  org.matrix.dma.gchat.proto.SpaceCreationInfo.FlatGroupOrBuilder getFlatGroupOrBuilder();

  /**
   * <code>optional .SpaceCreationInfo.ThreadedGroup threaded_group = 6;</code>
   * @return Whether the threadedGroup field is set.
   */
  boolean hasThreadedGroup();
  /**
   * <code>optional .SpaceCreationInfo.ThreadedGroup threaded_group = 6;</code>
   * @return The threadedGroup.
   */
  org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroup getThreadedGroup();
  /**
   * <code>optional .SpaceCreationInfo.ThreadedGroup threaded_group = 6;</code>
   */
  org.matrix.dma.gchat.proto.SpaceCreationInfo.ThreadedGroupOrBuilder getThreadedGroupOrBuilder();

  /**
   * <code>optional bool has_server_generated_name = 7;</code>
   * @return Whether the hasServerGeneratedName field is set.
   */
  boolean hasHasServerGeneratedName();
  /**
   * <code>optional bool has_server_generated_name = 7;</code>
   * @return The hasServerGeneratedName.
   */
  boolean getHasServerGeneratedName();

  /**
   * <pre>
   * optional RoomInviteNotificationSettings notification_settings = 9;
   * optional AvatarInfo avatar_info = 10;
   * </pre>
   *
   * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
   */
  java.util.List<org.matrix.dma.gchat.proto.InviteeMemberInfo> 
      getInviteeMemberInfosList();
  /**
   * <pre>
   * optional RoomInviteNotificationSettings notification_settings = 9;
   * optional AvatarInfo avatar_info = 10;
   * </pre>
   *
   * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
   */
  org.matrix.dma.gchat.proto.InviteeMemberInfo getInviteeMemberInfos(int index);
  /**
   * <pre>
   * optional RoomInviteNotificationSettings notification_settings = 9;
   * optional AvatarInfo avatar_info = 10;
   * </pre>
   *
   * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
   */
  int getInviteeMemberInfosCount();
  /**
   * <pre>
   * optional RoomInviteNotificationSettings notification_settings = 9;
   * optional AvatarInfo avatar_info = 10;
   * </pre>
   *
   * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
   */
  java.util.List<? extends org.matrix.dma.gchat.proto.InviteeMemberInfoOrBuilder> 
      getInviteeMemberInfosOrBuilderList();
  /**
   * <pre>
   * optional RoomInviteNotificationSettings notification_settings = 9;
   * optional AvatarInfo avatar_info = 10;
   * </pre>
   *
   * <code>repeated .InviteeMemberInfo invitee_member_infos = 8;</code>
   */
  org.matrix.dma.gchat.proto.InviteeMemberInfoOrBuilder getInviteeMemberInfosOrBuilder(
      int index);

  /**
   * <code>optional .SpaceCreationInfo.SpaceType space_type = 11;</code>
   * @return Whether the spaceType field is set.
   */
  boolean hasSpaceType();
  /**
   * <code>optional .SpaceCreationInfo.SpaceType space_type = 11;</code>
   * @return The spaceType.
   */
  org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceType getSpaceType();
  /**
   * <code>optional .SpaceCreationInfo.SpaceType space_type = 11;</code>
   */
  org.matrix.dma.gchat.proto.SpaceCreationInfo.SpaceTypeOrBuilder getSpaceTypeOrBuilder();

  /**
   * <pre>
   * optional ?? space_details = 12;
   * </pre>
   *
   * <code>optional .SharedAttributeCheckerGroupType attribute_checker_group_type = 13;</code>
   * @return Whether the attributeCheckerGroupType field is set.
   */
  boolean hasAttributeCheckerGroupType();
  /**
   * <pre>
   * optional ?? space_details = 12;
   * </pre>
   *
   * <code>optional .SharedAttributeCheckerGroupType attribute_checker_group_type = 13;</code>
   * @return The attributeCheckerGroupType.
   */
  org.matrix.dma.gchat.proto.SharedAttributeCheckerGroupType getAttributeCheckerGroupType();

  /**
   * <code>optional string shared_drive_name = 14;</code>
   * @return Whether the sharedDriveName field is set.
   */
  boolean hasSharedDriveName();
  /**
   * <code>optional string shared_drive_name = 14;</code>
   * @return The sharedDriveName.
   */
  java.lang.String getSharedDriveName();
  /**
   * <code>optional string shared_drive_name = 14;</code>
   * @return The bytes for sharedDriveName.
   */
  com.google.protobuf.ByteString
      getSharedDriveNameBytes();
}
