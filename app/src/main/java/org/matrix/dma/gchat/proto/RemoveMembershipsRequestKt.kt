//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializeremoveMembershipsRequest")
public inline fun removeMembershipsRequest(block: org.matrix.dma.gchat.proto.RemoveMembershipsRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.RemoveMembershipsRequest =
  org.matrix.dma.gchat.proto.RemoveMembershipsRequestKt.Dsl._create(org.matrix.dma.gchat.proto.RemoveMembershipsRequest.newBuilder()).apply { block() }._build()
public object RemoveMembershipsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.RemoveMembershipsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.RemoveMembershipsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.RemoveMembershipsRequest = _builder.build()

    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    public var requestHeader: org.matrix.dma.gchat.proto.RequestHeader
      @JvmName("getRequestHeader")
      get() = _builder.getRequestHeader()
      @JvmName("setRequestHeader")
      set(value) {
        _builder.setRequestHeader(value)
      }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     */
    public fun clearRequestHeader() {
      _builder.clearRequestHeader()
    }
    /**
     * <code>optional .RequestHeader request_header = 100;</code>
     * @return Whether the requestHeader field is set.
     */
    public fun hasRequestHeader(): kotlin.Boolean {
      return _builder.hasRequestHeader()
    }
    public val RemoveMembershipsRequestKt.Dsl.requestHeaderOrNull: org.matrix.dma.gchat.proto.RequestHeader?
      get() = _builder.requestHeaderOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MemberIdsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .MemberId member_ids = 1;</code>
     */
     public val memberIds: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.MemberId, MemberIdsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getMemberIdsList()
      )
    /**
     * <code>repeated .MemberId member_ids = 1;</code>
     * @param value The memberIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMemberIds")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.MemberId, MemberIdsProxy>.add(value: org.matrix.dma.gchat.proto.MemberId) {
      _builder.addMemberIds(value)
    }
    /**
     * <code>repeated .MemberId member_ids = 1;</code>
     * @param value The memberIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMemberIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.MemberId, MemberIdsProxy>.plusAssign(value: org.matrix.dma.gchat.proto.MemberId) {
      add(value)
    }
    /**
     * <code>repeated .MemberId member_ids = 1;</code>
     * @param values The memberIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMemberIds")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.MemberId, MemberIdsProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.MemberId>) {
      _builder.addAllMemberIds(values)
    }
    /**
     * <code>repeated .MemberId member_ids = 1;</code>
     * @param values The memberIds to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMemberIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.MemberId, MemberIdsProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.MemberId>) {
      addAll(values)
    }
    /**
     * <code>repeated .MemberId member_ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The memberIds to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMemberIds")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.MemberId, MemberIdsProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.MemberId) {
      _builder.setMemberIds(index, value)
    }
    /**
     * <code>repeated .MemberId member_ids = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMemberIds")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.MemberId, MemberIdsProxy>.clear() {
      _builder.clearMemberIds()
    }


    /**
     * <code>optional .GroupId group_id = 2;</code>
     */
    public var groupId: org.matrix.dma.gchat.proto.GroupId
      @JvmName("getGroupId")
      get() = _builder.getGroupId()
      @JvmName("setGroupId")
      set(value) {
        _builder.setGroupId(value)
      }
    /**
     * <code>optional .GroupId group_id = 2;</code>
     */
    public fun clearGroupId() {
      _builder.clearGroupId()
    }
    /**
     * <code>optional .GroupId group_id = 2;</code>
     * @return Whether the groupId field is set.
     */
    public fun hasGroupId(): kotlin.Boolean {
      return _builder.hasGroupId()
    }
    public val RemoveMembershipsRequestKt.Dsl.groupIdOrNull: org.matrix.dma.gchat.proto.GroupId?
      get() = _builder.groupIdOrNull

    /**
     * <code>optional .MembershipState membership_state = 3;</code>
     */
    public var membershipState: org.matrix.dma.gchat.proto.MembershipState
      @JvmName("getMembershipState")
      get() = _builder.getMembershipState()
      @JvmName("setMembershipState")
      set(value) {
        _builder.setMembershipState(value)
      }
    /**
     * <code>optional .MembershipState membership_state = 3;</code>
     */
    public fun clearMembershipState() {
      _builder.clearMembershipState()
    }
    /**
     * <code>optional .MembershipState membership_state = 3;</code>
     * @return Whether the membershipState field is set.
     */
    public fun hasMembershipState(): kotlin.Boolean {
      return _builder.hasMembershipState()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.RemoveMembershipsRequest.copy(block: org.matrix.dma.gchat.proto.RemoveMembershipsRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.RemoveMembershipsRequest =
  org.matrix.dma.gchat.proto.RemoveMembershipsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.RemoveMembershipsRequestOrBuilder.requestHeaderOrNull: org.matrix.dma.gchat.proto.RequestHeader?
  get() = if (hasRequestHeader()) getRequestHeader() else null

public val org.matrix.dma.gchat.proto.RemoveMembershipsRequestOrBuilder.groupIdOrNull: org.matrix.dma.gchat.proto.GroupId?
  get() = if (hasGroupId()) getGroupId() else null

