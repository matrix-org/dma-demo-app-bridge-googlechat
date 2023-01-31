// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface RoomUpdatedMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RoomUpdatedMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 2;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .GroupVisibility visibility = 3;</code>
   * @return Whether the visibility field is set.
   */
  boolean hasVisibility();
  /**
   * <code>optional .GroupVisibility visibility = 3;</code>
   * @return The visibility.
   */
  org.matrix.dma.gchat.proto.GroupVisibility getVisibility();
  /**
   * <code>optional .GroupVisibility visibility = 3;</code>
   */
  org.matrix.dma.gchat.proto.GroupVisibilityOrBuilder getVisibilityOrBuilder();

  /**
   * <code>optional bool group_link_sharing_enabled = 5;</code>
   * @return Whether the groupLinkSharingEnabled field is set.
   */
  boolean hasGroupLinkSharingEnabled();
  /**
   * <code>optional bool group_link_sharing_enabled = 5;</code>
   * @return The groupLinkSharingEnabled.
   */
  boolean getGroupLinkSharingEnabled();

  /**
   * <code>optional .RoomUpdatedMetadata.RoomRenameMetadata rename_metadata = 6;</code>
   * @return Whether the renameMetadata field is set.
   */
  boolean hasRenameMetadata();
  /**
   * <code>optional .RoomUpdatedMetadata.RoomRenameMetadata rename_metadata = 6;</code>
   * @return The renameMetadata.
   */
  org.matrix.dma.gchat.proto.RoomUpdatedMetadata.RoomRenameMetadata getRenameMetadata();
  /**
   * <code>optional .RoomUpdatedMetadata.RoomRenameMetadata rename_metadata = 6;</code>
   */
  org.matrix.dma.gchat.proto.RoomUpdatedMetadata.RoomRenameMetadataOrBuilder getRenameMetadataOrBuilder();

  /**
   * <code>optional .RoomUpdatedMetadata.GroupDetailsUpdatedMetadata group_details_metadata = 7;</code>
   * @return Whether the groupDetailsMetadata field is set.
   */
  boolean hasGroupDetailsMetadata();
  /**
   * <code>optional .RoomUpdatedMetadata.GroupDetailsUpdatedMetadata group_details_metadata = 7;</code>
   * @return The groupDetailsMetadata.
   */
  org.matrix.dma.gchat.proto.RoomUpdatedMetadata.GroupDetailsUpdatedMetadata getGroupDetailsMetadata();
  /**
   * <code>optional .RoomUpdatedMetadata.GroupDetailsUpdatedMetadata group_details_metadata = 7;</code>
   */
  org.matrix.dma.gchat.proto.RoomUpdatedMetadata.GroupDetailsUpdatedMetadataOrBuilder getGroupDetailsMetadataOrBuilder();

  /**
   * <code>optional .User initiator = 4;</code>
   * @return Whether the initiator field is set.
   */
  boolean hasInitiator();
  /**
   * <code>optional .User initiator = 4;</code>
   * @return The initiator.
   */
  org.matrix.dma.gchat.proto.User getInitiator();
  /**
   * <code>optional .User initiator = 4;</code>
   */
  org.matrix.dma.gchat.proto.UserOrBuilder getInitiatorOrBuilder();
}
