// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface UserStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .UserId user_id = 1;</code>
   * @return Whether the userId field is set.
   */
  boolean hasUserId();
  /**
   * <code>optional .UserId user_id = 1;</code>
   * @return The userId.
   */
  org.matrix.dma.gchat.proto.UserId getUserId();
  /**
   * <code>optional .UserId user_id = 1;</code>
   */
  org.matrix.dma.gchat.proto.UserIdOrBuilder getUserIdOrBuilder();

  /**
   * <code>optional .DndSettings dnd_settings = 2;</code>
   * @return Whether the dndSettings field is set.
   */
  boolean hasDndSettings();
  /**
   * <code>optional .DndSettings dnd_settings = 2;</code>
   * @return The dndSettings.
   */
  org.matrix.dma.gchat.proto.DndSettings getDndSettings();
  /**
   * <code>optional .DndSettings dnd_settings = 2;</code>
   */
  org.matrix.dma.gchat.proto.DndSettingsOrBuilder getDndSettingsOrBuilder();

  /**
   * <code>optional int64 update_timestamp_usec = 3;</code>
   * @return Whether the updateTimestampUsec field is set.
   */
  boolean hasUpdateTimestampUsec();
  /**
   * <code>optional int64 update_timestamp_usec = 3;</code>
   * @return The updateTimestampUsec.
   */
  long getUpdateTimestampUsec();

  /**
   * <code>optional int64 dnd_settings_update_timestamp_usec = 7;</code>
   * @return Whether the dndSettingsUpdateTimestampUsec field is set.
   */
  boolean hasDndSettingsUpdateTimestampUsec();
  /**
   * <code>optional int64 dnd_settings_update_timestamp_usec = 7;</code>
   * @return The dndSettingsUpdateTimestampUsec.
   */
  long getDndSettingsUpdateTimestampUsec();

  /**
   * <code>optional int64 status_timestamp_usec = 4;</code>
   * @return Whether the statusTimestampUsec field is set.
   */
  boolean hasStatusTimestampUsec();
  /**
   * <code>optional int64 status_timestamp_usec = 4;</code>
   * @return The statusTimestampUsec.
   */
  long getStatusTimestampUsec();

  /**
   * <code>optional bool presence_shared = 5;</code>
   * @return Whether the presenceShared field is set.
   */
  boolean hasPresenceShared();
  /**
   * <code>optional bool presence_shared = 5;</code>
   * @return The presenceShared.
   */
  boolean getPresenceShared();

  /**
   * <code>optional .CustomStatus custom_status = 6;</code>
   * @return Whether the customStatus field is set.
   */
  boolean hasCustomStatus();
  /**
   * <code>optional .CustomStatus custom_status = 6;</code>
   * @return The customStatus.
   */
  org.matrix.dma.gchat.proto.CustomStatus getCustomStatus();
  /**
   * <code>optional .CustomStatus custom_status = 6;</code>
   */
  org.matrix.dma.gchat.proto.CustomStatusOrBuilder getCustomStatusOrBuilder();

  /**
   * <code>optional int64 custom_status_update_timestamp_usec = 8;</code>
   * @return Whether the customStatusUpdateTimestampUsec field is set.
   */
  boolean hasCustomStatusUpdateTimestampUsec();
  /**
   * <code>optional int64 custom_status_update_timestamp_usec = 8;</code>
   * @return The customStatusUpdateTimestampUsec.
   */
  long getCustomStatusUpdateTimestampUsec();
}
