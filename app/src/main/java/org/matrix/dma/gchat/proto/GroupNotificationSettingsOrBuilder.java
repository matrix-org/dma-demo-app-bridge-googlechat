// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface GroupNotificationSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GroupNotificationSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .GroupNotificationSettings.GroupNotificationState state = 1;</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <code>optional .GroupNotificationSettings.GroupNotificationState state = 1;</code>
   * @return The state.
   */
  org.matrix.dma.gchat.proto.GroupNotificationSettings.GroupNotificationState getState();

  /**
   * <code>optional .GroupNotificationSettings.RoomNotificationState room_state = 2;</code>
   * @return Whether the roomState field is set.
   */
  boolean hasRoomState();
  /**
   * <code>optional .GroupNotificationSettings.RoomNotificationState room_state = 2;</code>
   * @return The roomState.
   */
  org.matrix.dma.gchat.proto.GroupNotificationSettings.RoomNotificationState getRoomState();
}
