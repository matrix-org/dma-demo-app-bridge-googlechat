// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface MembershipChangedEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MembershipChangedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .Membership new_membership = 1;</code>
   * @return Whether the newMembership field is set.
   */
  boolean hasNewMembership();
  /**
   * <code>optional .Membership new_membership = 1;</code>
   * @return The newMembership.
   */
  org.matrix.dma.gchat.proto.Membership getNewMembership();
  /**
   * <code>optional .Membership new_membership = 1;</code>
   */
  org.matrix.dma.gchat.proto.MembershipOrBuilder getNewMembershipOrBuilder();

  /**
   * <code>optional .MembershipState prior_membership_state = 2;</code>
   * @return Whether the priorMembershipState field is set.
   */
  boolean hasPriorMembershipState();
  /**
   * <code>optional .MembershipState prior_membership_state = 2;</code>
   * @return The priorMembershipState.
   */
  org.matrix.dma.gchat.proto.MembershipState getPriorMembershipState();

  /**
   * <code>optional .MembershipRole prior_membership_role = 3;</code>
   * @return Whether the priorMembershipRole field is set.
   */
  boolean hasPriorMembershipRole();
  /**
   * <code>optional .MembershipRole prior_membership_role = 3;</code>
   * @return The priorMembershipRole.
   */
  org.matrix.dma.gchat.proto.MembershipRole getPriorMembershipRole();
}
