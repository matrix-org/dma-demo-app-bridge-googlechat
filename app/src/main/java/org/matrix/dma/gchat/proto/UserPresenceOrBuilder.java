// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface UserPresenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserPresence)
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
   * <code>optional .Presence presence = 2;</code>
   * @return Whether the presence field is set.
   */
  boolean hasPresence();
  /**
   * <code>optional .Presence presence = 2;</code>
   * @return The presence.
   */
  org.matrix.dma.gchat.proto.Presence getPresence();

  /**
   * <code>optional int64 active_until = 4;</code>
   * @return Whether the activeUntil field is set.
   */
  boolean hasActiveUntil();
  /**
   * <code>optional int64 active_until = 4;</code>
   * @return The activeUntil.
   */
  long getActiveUntil();

  /**
   * <code>optional .DndState_State dnd_state = 3;</code>
   * @return Whether the dndState field is set.
   */
  boolean hasDndState();
  /**
   * <code>optional .DndState_State dnd_state = 3;</code>
   * @return The dndState.
   */
  org.matrix.dma.gchat.proto.DndState_State getDndState();

  /**
   * <code>optional .UserStatus user_status = 5;</code>
   * @return Whether the userStatus field is set.
   */
  boolean hasUserStatus();
  /**
   * <code>optional .UserStatus user_status = 5;</code>
   * @return The userStatus.
   */
  org.matrix.dma.gchat.proto.UserStatus getUserStatus();
  /**
   * <code>optional .UserStatus user_status = 5;</code>
   */
  org.matrix.dma.gchat.proto.UserStatusOrBuilder getUserStatusOrBuilder();
}
