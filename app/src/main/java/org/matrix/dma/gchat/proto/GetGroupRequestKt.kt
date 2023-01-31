//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializegetGroupRequest")
public inline fun getGroupRequest(block: org.matrix.dma.gchat.proto.GetGroupRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.GetGroupRequest =
  org.matrix.dma.gchat.proto.GetGroupRequestKt.Dsl._create(org.matrix.dma.gchat.proto.GetGroupRequest.newBuilder()).apply { block() }._build()
public object GetGroupRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.GetGroupRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.GetGroupRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.GetGroupRequest = _builder.build()

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
    public val GetGroupRequestKt.Dsl.requestHeaderOrNull: org.matrix.dma.gchat.proto.RequestHeader?
      get() = _builder.requestHeaderOrNull

    /**
     * <code>optional .GroupId group_id = 1;</code>
     */
    public var groupId: org.matrix.dma.gchat.proto.GroupId
      @JvmName("getGroupId")
      get() = _builder.getGroupId()
      @JvmName("setGroupId")
      set(value) {
        _builder.setGroupId(value)
      }
    /**
     * <code>optional .GroupId group_id = 1;</code>
     */
    public fun clearGroupId() {
      _builder.clearGroupId()
    }
    /**
     * <code>optional .GroupId group_id = 1;</code>
     * @return Whether the groupId field is set.
     */
    public fun hasGroupId(): kotlin.Boolean {
      return _builder.hasGroupId()
    }
    public val GetGroupRequestKt.Dsl.groupIdOrNull: org.matrix.dma.gchat.proto.GroupId?
      get() = _builder.groupIdOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class FetchOptionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .GetGroupRequest.FetchOptions fetch_options = 4;</code>
     */
    public val fetchOptions: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions, FetchOptionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getFetchOptionsList()
      )
    /**
     * <code>repeated .GetGroupRequest.FetchOptions fetch_options = 4;</code>
     * @param value The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addFetchOptions")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions, FetchOptionsProxy>.add(value: org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions) {
      _builder.addFetchOptions(value)
    }/**
     * <code>repeated .GetGroupRequest.FetchOptions fetch_options = 4;</code>
     * @param value The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignFetchOptions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions, FetchOptionsProxy>.plusAssign(value: org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions) {
      add(value)
    }/**
     * <code>repeated .GetGroupRequest.FetchOptions fetch_options = 4;</code>
     * @param values The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllFetchOptions")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions, FetchOptionsProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions>) {
      _builder.addAllFetchOptions(values)
    }/**
     * <code>repeated .GetGroupRequest.FetchOptions fetch_options = 4;</code>
     * @param values The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllFetchOptions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions, FetchOptionsProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions>) {
      addAll(values)
    }/**
     * <code>repeated .GetGroupRequest.FetchOptions fetch_options = 4;</code>
     * @param index The index to set the value at.
     * @param value The fetchOptions to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setFetchOptions")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions, FetchOptionsProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions) {
      _builder.setFetchOptions(index, value)
    }/**
     * <code>repeated .GetGroupRequest.FetchOptions fetch_options = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearFetchOptions")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.GetGroupRequest.FetchOptions, FetchOptionsProxy>.clear() {
      _builder.clearFetchOptions()
    }
    /**
     * <code>optional .ReferenceRevision user_not_older_than = 2;</code>
     */
    public var userNotOlderThan: org.matrix.dma.gchat.proto.ReferenceRevision
      @JvmName("getUserNotOlderThan")
      get() = _builder.getUserNotOlderThan()
      @JvmName("setUserNotOlderThan")
      set(value) {
        _builder.setUserNotOlderThan(value)
      }
    /**
     * <code>optional .ReferenceRevision user_not_older_than = 2;</code>
     */
    public fun clearUserNotOlderThan() {
      _builder.clearUserNotOlderThan()
    }
    /**
     * <code>optional .ReferenceRevision user_not_older_than = 2;</code>
     * @return Whether the userNotOlderThan field is set.
     */
    public fun hasUserNotOlderThan(): kotlin.Boolean {
      return _builder.hasUserNotOlderThan()
    }
    public val GetGroupRequestKt.Dsl.userNotOlderThanOrNull: org.matrix.dma.gchat.proto.ReferenceRevision?
      get() = _builder.userNotOlderThanOrNull

    /**
     * <code>optional .ReferenceRevision group_not_older_than = 3;</code>
     */
    public var groupNotOlderThan: org.matrix.dma.gchat.proto.ReferenceRevision
      @JvmName("getGroupNotOlderThan")
      get() = _builder.getGroupNotOlderThan()
      @JvmName("setGroupNotOlderThan")
      set(value) {
        _builder.setGroupNotOlderThan(value)
      }
    /**
     * <code>optional .ReferenceRevision group_not_older_than = 3;</code>
     */
    public fun clearGroupNotOlderThan() {
      _builder.clearGroupNotOlderThan()
    }
    /**
     * <code>optional .ReferenceRevision group_not_older_than = 3;</code>
     * @return Whether the groupNotOlderThan field is set.
     */
    public fun hasGroupNotOlderThan(): kotlin.Boolean {
      return _builder.hasGroupNotOlderThan()
    }
    public val GetGroupRequestKt.Dsl.groupNotOlderThanOrNull: org.matrix.dma.gchat.proto.ReferenceRevision?
      get() = _builder.groupNotOlderThanOrNull

    /**
     * <code>optional bool include_invite_dms = 5;</code>
     */
    public var includeInviteDms: kotlin.Boolean
      @JvmName("getIncludeInviteDms")
      get() = _builder.getIncludeInviteDms()
      @JvmName("setIncludeInviteDms")
      set(value) {
        _builder.setIncludeInviteDms(value)
      }
    /**
     * <code>optional bool include_invite_dms = 5;</code>
     */
    public fun clearIncludeInviteDms() {
      _builder.clearIncludeInviteDms()
    }
    /**
     * <code>optional bool include_invite_dms = 5;</code>
     * @return Whether the includeInviteDms field is set.
     */
    public fun hasIncludeInviteDms(): kotlin.Boolean {
      return _builder.hasIncludeInviteDms()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.GetGroupRequest.copy(block: org.matrix.dma.gchat.proto.GetGroupRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.GetGroupRequest =
  org.matrix.dma.gchat.proto.GetGroupRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.GetGroupRequestOrBuilder.requestHeaderOrNull: org.matrix.dma.gchat.proto.RequestHeader?
  get() = if (hasRequestHeader()) getRequestHeader() else null

public val org.matrix.dma.gchat.proto.GetGroupRequestOrBuilder.groupIdOrNull: org.matrix.dma.gchat.proto.GroupId?
  get() = if (hasGroupId()) getGroupId() else null

public val org.matrix.dma.gchat.proto.GetGroupRequestOrBuilder.userNotOlderThanOrNull: org.matrix.dma.gchat.proto.ReferenceRevision?
  get() = if (hasUserNotOlderThan()) getUserNotOlderThan() else null

public val org.matrix.dma.gchat.proto.GetGroupRequestOrBuilder.groupNotOlderThanOrNull: org.matrix.dma.gchat.proto.ReferenceRevision?
  get() = if (hasGroupNotOlderThan()) getGroupNotOlderThan() else null

