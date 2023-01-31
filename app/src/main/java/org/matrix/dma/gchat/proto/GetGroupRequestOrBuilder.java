// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface GetGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetGroupRequest)
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
   * <code>repeated .GetGroupRequest.FetchOptions fetch_options = 4;</code>
   * @return A list containing the fetchOptions.
   */
  java.util.List<org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions> getFetchOptionsList();
  /**
   * <code>repeated .GetGroupRequest.FetchOptions fetch_options = 4;</code>
   * @return The count of fetchOptions.
   */
  int getFetchOptionsCount();
  /**
   * <code>repeated .GetGroupRequest.FetchOptions fetch_options = 4;</code>
   * @param index The index of the element to return.
   * @return The fetchOptions at the given index.
   */
  org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions getFetchOptions(int index);

  /**
   * <code>optional .ReferenceRevision user_not_older_than = 2;</code>
   * @return Whether the userNotOlderThan field is set.
   */
  boolean hasUserNotOlderThan();
  /**
   * <code>optional .ReferenceRevision user_not_older_than = 2;</code>
   * @return The userNotOlderThan.
   */
  org.matrix.dma.gchat.proto.ReferenceRevision getUserNotOlderThan();
  /**
   * <code>optional .ReferenceRevision user_not_older_than = 2;</code>
   */
  org.matrix.dma.gchat.proto.ReferenceRevisionOrBuilder getUserNotOlderThanOrBuilder();

  /**
   * <code>optional .ReferenceRevision group_not_older_than = 3;</code>
   * @return Whether the groupNotOlderThan field is set.
   */
  boolean hasGroupNotOlderThan();
  /**
   * <code>optional .ReferenceRevision group_not_older_than = 3;</code>
   * @return The groupNotOlderThan.
   */
  org.matrix.dma.gchat.proto.ReferenceRevision getGroupNotOlderThan();
  /**
   * <code>optional .ReferenceRevision group_not_older_than = 3;</code>
   */
  org.matrix.dma.gchat.proto.ReferenceRevisionOrBuilder getGroupNotOlderThanOrBuilder();

  /**
   * <code>optional bool include_invite_dms = 5;</code>
   * @return Whether the includeInviteDms field is set.
   */
  boolean hasIncludeInviteDms();
  /**
   * <code>optional bool include_invite_dms = 5;</code>
   * @return The includeInviteDms.
   */
  boolean getIncludeInviteDms();
}
