//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializecreateDmRequest")
public inline fun createDmRequest(block: org.matrix.dma.gchat.proto.CreateDmRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.CreateDmRequest =
  org.matrix.dma.gchat.proto.CreateDmRequestKt.Dsl._create(org.matrix.dma.gchat.proto.CreateDmRequest.newBuilder()).apply { block() }._build()
public object CreateDmRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.CreateDmRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.CreateDmRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.CreateDmRequest = _builder.build()

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
    public val CreateDmRequestKt.Dsl.requestHeaderOrNull: org.matrix.dma.gchat.proto.RequestHeader?
      get() = _builder.requestHeaderOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class FetchOptionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .CreateDmRequest.FetchOptions fetch_options = 8;</code>
     */
    public val fetchOptions: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions, FetchOptionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getFetchOptionsList()
      )
    /**
     * <code>repeated .CreateDmRequest.FetchOptions fetch_options = 8;</code>
     * @param value The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addFetchOptions")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions, FetchOptionsProxy>.add(value: org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions) {
      _builder.addFetchOptions(value)
    }/**
     * <code>repeated .CreateDmRequest.FetchOptions fetch_options = 8;</code>
     * @param value The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignFetchOptions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions, FetchOptionsProxy>.plusAssign(value: org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions) {
      add(value)
    }/**
     * <code>repeated .CreateDmRequest.FetchOptions fetch_options = 8;</code>
     * @param values The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllFetchOptions")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions, FetchOptionsProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions>) {
      _builder.addAllFetchOptions(values)
    }/**
     * <code>repeated .CreateDmRequest.FetchOptions fetch_options = 8;</code>
     * @param values The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllFetchOptions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions, FetchOptionsProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions>) {
      addAll(values)
    }/**
     * <code>repeated .CreateDmRequest.FetchOptions fetch_options = 8;</code>
     * @param index The index to set the value at.
     * @param value The fetchOptions to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setFetchOptions")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions, FetchOptionsProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions) {
      _builder.setFetchOptions(index, value)
    }/**
     * <code>repeated .CreateDmRequest.FetchOptions fetch_options = 8;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearFetchOptions")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.CreateDmRequest.FetchOptions, FetchOptionsProxy>.clear() {
      _builder.clearFetchOptions()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MembersProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .UserId members = 1;</code>
     */
     public val members: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.UserId, MembersProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getMembersList()
      )
    /**
     * <code>repeated .UserId members = 1;</code>
     * @param value The members to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMembers")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.UserId, MembersProxy>.add(value: org.matrix.dma.gchat.proto.UserId) {
      _builder.addMembers(value)
    }
    /**
     * <code>repeated .UserId members = 1;</code>
     * @param value The members to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMembers")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.UserId, MembersProxy>.plusAssign(value: org.matrix.dma.gchat.proto.UserId) {
      add(value)
    }
    /**
     * <code>repeated .UserId members = 1;</code>
     * @param values The members to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMembers")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.UserId, MembersProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.UserId>) {
      _builder.addAllMembers(values)
    }
    /**
     * <code>repeated .UserId members = 1;</code>
     * @param values The members to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMembers")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.UserId, MembersProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.UserId>) {
      addAll(values)
    }
    /**
     * <code>repeated .UserId members = 1;</code>
     * @param index The index to set the value at.
     * @param value The members to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMembers")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.UserId, MembersProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.UserId) {
      _builder.setMembers(index, value)
    }
    /**
     * <code>repeated .UserId members = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMembers")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.UserId, MembersProxy>.clear() {
      _builder.clearMembers()
    }


    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InviteesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .InviteeInfo invitees = 7;</code>
     */
     public val invitees: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeInfo, InviteesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInviteesList()
      )
    /**
     * <code>repeated .InviteeInfo invitees = 7;</code>
     * @param value The invitees to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInvitees")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeInfo, InviteesProxy>.add(value: org.matrix.dma.gchat.proto.InviteeInfo) {
      _builder.addInvitees(value)
    }
    /**
     * <code>repeated .InviteeInfo invitees = 7;</code>
     * @param value The invitees to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInvitees")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeInfo, InviteesProxy>.plusAssign(value: org.matrix.dma.gchat.proto.InviteeInfo) {
      add(value)
    }
    /**
     * <code>repeated .InviteeInfo invitees = 7;</code>
     * @param values The invitees to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInvitees")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeInfo, InviteesProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.InviteeInfo>) {
      _builder.addAllInvitees(values)
    }
    /**
     * <code>repeated .InviteeInfo invitees = 7;</code>
     * @param values The invitees to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInvitees")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeInfo, InviteesProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.InviteeInfo>) {
      addAll(values)
    }
    /**
     * <code>repeated .InviteeInfo invitees = 7;</code>
     * @param index The index to set the value at.
     * @param value The invitees to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInvitees")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeInfo, InviteesProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.InviteeInfo) {
      _builder.setInvitees(index, value)
    }
    /**
     * <code>repeated .InviteeInfo invitees = 7;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInvitees")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.InviteeInfo, InviteesProxy>.clear() {
      _builder.clearInvitees()
    }


    /**
     * <pre>
     * optional MessageCreationInfo message_creation_info = 2;
     * </pre>
     *
     * <code>optional .RetentionSettings retention_settings = 3;</code>
     */
    public var retentionSettings: org.matrix.dma.gchat.proto.RetentionSettings
      @JvmName("getRetentionSettings")
      get() = _builder.getRetentionSettings()
      @JvmName("setRetentionSettings")
      set(value) {
        _builder.setRetentionSettings(value)
      }
    /**
     * <pre>
     * optional MessageCreationInfo message_creation_info = 2;
     * </pre>
     *
     * <code>optional .RetentionSettings retention_settings = 3;</code>
     */
    public fun clearRetentionSettings() {
      _builder.clearRetentionSettings()
    }
    /**
     * <pre>
     * optional MessageCreationInfo message_creation_info = 2;
     * </pre>
     *
     * <code>optional .RetentionSettings retention_settings = 3;</code>
     * @return Whether the retentionSettings field is set.
     */
    public fun hasRetentionSettings(): kotlin.Boolean {
      return _builder.hasRetentionSettings()
    }
    public val CreateDmRequestKt.Dsl.retentionSettingsOrNull: org.matrix.dma.gchat.proto.RetentionSettings?
      get() = _builder.retentionSettingsOrNull

    /**
     * <code>optional string local_id = 4;</code>
     */
    public var localId: kotlin.String
      @JvmName("getLocalId")
      get() = _builder.getLocalId()
      @JvmName("setLocalId")
      set(value) {
        _builder.setLocalId(value)
      }
    /**
     * <code>optional string local_id = 4;</code>
     */
    public fun clearLocalId() {
      _builder.clearLocalId()
    }
    /**
     * <code>optional string local_id = 4;</code>
     * @return Whether the localId field is set.
     */
    public fun hasLocalId(): kotlin.Boolean {
      return _builder.hasLocalId()
    }

    /**
     * <code>optional string topic_and_message_id = 5;</code>
     */
    public var topicAndMessageId: kotlin.String
      @JvmName("getTopicAndMessageId")
      get() = _builder.getTopicAndMessageId()
      @JvmName("setTopicAndMessageId")
      set(value) {
        _builder.setTopicAndMessageId(value)
      }
    /**
     * <code>optional string topic_and_message_id = 5;</code>
     */
    public fun clearTopicAndMessageId() {
      _builder.clearTopicAndMessageId()
    }
    /**
     * <code>optional string topic_and_message_id = 5;</code>
     * @return Whether the topicAndMessageId field is set.
     */
    public fun hasTopicAndMessageId(): kotlin.Boolean {
      return _builder.hasTopicAndMessageId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.CreateDmRequest.copy(block: org.matrix.dma.gchat.proto.CreateDmRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.CreateDmRequest =
  org.matrix.dma.gchat.proto.CreateDmRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.CreateDmRequestOrBuilder.requestHeaderOrNull: org.matrix.dma.gchat.proto.RequestHeader?
  get() = if (hasRequestHeader()) getRequestHeader() else null

public val org.matrix.dma.gchat.proto.CreateDmRequestOrBuilder.retentionSettingsOrNull: org.matrix.dma.gchat.proto.RetentionSettings?
  get() = if (hasRetentionSettings()) getRetentionSettings() else null

