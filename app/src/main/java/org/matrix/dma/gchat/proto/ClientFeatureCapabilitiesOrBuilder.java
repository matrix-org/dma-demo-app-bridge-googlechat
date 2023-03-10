// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface ClientFeatureCapabilitiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClientFeatureCapabilities)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool enable_all_features = 1;</code>
   * @return Whether the enableAllFeatures field is set.
   */
  boolean hasEnableAllFeatures();
  /**
   * <code>optional bool enable_all_features = 1;</code>
   * @return The enableAllFeatures.
   */
  boolean getEnableAllFeatures();

  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel spaces_level_for_testing = 2;</code>
   * @return Whether the spacesLevelForTesting field is set.
   */
  boolean hasSpacesLevelForTesting();
  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel spaces_level_for_testing = 2;</code>
   * @return The spacesLevelForTesting.
   */
  org.matrix.dma.gchat.proto.ClientFeatureCapabilities.CapabilityLevel getSpacesLevelForTesting();

  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel dms_level_for_testing = 3;</code>
   * @return Whether the dmsLevelForTesting field is set.
   */
  boolean hasDmsLevelForTesting();
  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel dms_level_for_testing = 3;</code>
   * @return The dmsLevelForTesting.
   */
  org.matrix.dma.gchat.proto.ClientFeatureCapabilities.CapabilityLevel getDmsLevelForTesting();

  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel post_rooms_level = 4;</code>
   * @return Whether the postRoomsLevel field is set.
   */
  boolean hasPostRoomsLevel();
  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel post_rooms_level = 4;</code>
   * @return The postRoomsLevel.
   */
  org.matrix.dma.gchat.proto.ClientFeatureCapabilities.CapabilityLevel getPostRoomsLevel();

  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel spam_room_invites_level = 5;</code>
   * @return Whether the spamRoomInvitesLevel field is set.
   */
  boolean hasSpamRoomInvitesLevel();
  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel spam_room_invites_level = 5;</code>
   * @return The spamRoomInvitesLevel.
   */
  org.matrix.dma.gchat.proto.ClientFeatureCapabilities.CapabilityLevel getSpamRoomInvitesLevel();

  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel tombstone_level = 6;</code>
   * @return Whether the tombstoneLevel field is set.
   */
  boolean hasTombstoneLevel();
  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel tombstone_level = 6;</code>
   * @return The tombstoneLevel.
   */
  org.matrix.dma.gchat.proto.ClientFeatureCapabilities.CapabilityLevel getTombstoneLevel();

  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel rich_text_viewing_level = 7;</code>
   * @return Whether the richTextViewingLevel field is set.
   */
  boolean hasRichTextViewingLevel();
  /**
   * <code>optional .ClientFeatureCapabilities.CapabilityLevel rich_text_viewing_level = 7;</code>
   * @return The richTextViewingLevel.
   */
  org.matrix.dma.gchat.proto.ClientFeatureCapabilities.CapabilityLevel getRichTextViewingLevel();
}
