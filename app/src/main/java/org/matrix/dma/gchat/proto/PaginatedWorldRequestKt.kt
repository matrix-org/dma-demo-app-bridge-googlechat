//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializepaginatedWorldRequest")
public inline fun paginatedWorldRequest(block: org.matrix.dma.gchat.proto.PaginatedWorldRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.PaginatedWorldRequest =
  org.matrix.dma.gchat.proto.PaginatedWorldRequestKt.Dsl._create(org.matrix.dma.gchat.proto.PaginatedWorldRequest.newBuilder()).apply { block() }._build()
public object PaginatedWorldRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.PaginatedWorldRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.PaginatedWorldRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.PaginatedWorldRequest = _builder.build()

    /**
     * <code>optional .RequestHeader request_header = 1;</code>
     */
    public var requestHeader: org.matrix.dma.gchat.proto.RequestHeader
      @JvmName("getRequestHeader")
      get() = _builder.getRequestHeader()
      @JvmName("setRequestHeader")
      set(value) {
        _builder.setRequestHeader(value)
      }
    /**
     * <code>optional .RequestHeader request_header = 1;</code>
     */
    public fun clearRequestHeader() {
      _builder.clearRequestHeader()
    }
    /**
     * <code>optional .RequestHeader request_header = 1;</code>
     * @return Whether the requestHeader field is set.
     */
    public fun hasRequestHeader(): kotlin.Boolean {
      return _builder.hasRequestHeader()
    }
    public val PaginatedWorldRequestKt.Dsl.requestHeaderOrNull: org.matrix.dma.gchat.proto.RequestHeader?
      get() = _builder.requestHeaderOrNull

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class WorldSectionRequestsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .WorldSectionRequest world_section_requests = 2;</code>
     */
     public val worldSectionRequests: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.WorldSectionRequest, WorldSectionRequestsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getWorldSectionRequestsList()
      )
    /**
     * <code>repeated .WorldSectionRequest world_section_requests = 2;</code>
     * @param value The worldSectionRequests to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addWorldSectionRequests")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.WorldSectionRequest, WorldSectionRequestsProxy>.add(value: org.matrix.dma.gchat.proto.WorldSectionRequest) {
      _builder.addWorldSectionRequests(value)
    }
    /**
     * <code>repeated .WorldSectionRequest world_section_requests = 2;</code>
     * @param value The worldSectionRequests to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignWorldSectionRequests")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.WorldSectionRequest, WorldSectionRequestsProxy>.plusAssign(value: org.matrix.dma.gchat.proto.WorldSectionRequest) {
      add(value)
    }
    /**
     * <code>repeated .WorldSectionRequest world_section_requests = 2;</code>
     * @param values The worldSectionRequests to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllWorldSectionRequests")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.WorldSectionRequest, WorldSectionRequestsProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.WorldSectionRequest>) {
      _builder.addAllWorldSectionRequests(values)
    }
    /**
     * <code>repeated .WorldSectionRequest world_section_requests = 2;</code>
     * @param values The worldSectionRequests to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllWorldSectionRequests")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.WorldSectionRequest, WorldSectionRequestsProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.WorldSectionRequest>) {
      addAll(values)
    }
    /**
     * <code>repeated .WorldSectionRequest world_section_requests = 2;</code>
     * @param index The index to set the value at.
     * @param value The worldSectionRequests to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setWorldSectionRequests")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.WorldSectionRequest, WorldSectionRequestsProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.WorldSectionRequest) {
      _builder.setWorldSectionRequests(index, value)
    }
    /**
     * <code>repeated .WorldSectionRequest world_section_requests = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearWorldSectionRequests")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.WorldSectionRequest, WorldSectionRequestsProxy>.clear() {
      _builder.clearWorldSectionRequests()
    }


    /**
     * <code>optional string world_consistency_token = 3;</code>
     */
    public var worldConsistencyToken: kotlin.String
      @JvmName("getWorldConsistencyToken")
      get() = _builder.getWorldConsistencyToken()
      @JvmName("setWorldConsistencyToken")
      set(value) {
        _builder.setWorldConsistencyToken(value)
      }
    /**
     * <code>optional string world_consistency_token = 3;</code>
     */
    public fun clearWorldConsistencyToken() {
      _builder.clearWorldConsistencyToken()
    }
    /**
     * <code>optional string world_consistency_token = 3;</code>
     * @return Whether the worldConsistencyToken field is set.
     */
    public fun hasWorldConsistencyToken(): kotlin.Boolean {
      return _builder.hasWorldConsistencyToken()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class FetchOptionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .PaginatedWorldRequest.FetchOptions fetch_options = 4;</code>
     */
    public val fetchOptions: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions, FetchOptionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getFetchOptionsList()
      )
    /**
     * <code>repeated .PaginatedWorldRequest.FetchOptions fetch_options = 4;</code>
     * @param value The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addFetchOptions")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions, FetchOptionsProxy>.add(value: org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions) {
      _builder.addFetchOptions(value)
    }/**
     * <code>repeated .PaginatedWorldRequest.FetchOptions fetch_options = 4;</code>
     * @param value The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignFetchOptions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions, FetchOptionsProxy>.plusAssign(value: org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions) {
      add(value)
    }/**
     * <code>repeated .PaginatedWorldRequest.FetchOptions fetch_options = 4;</code>
     * @param values The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllFetchOptions")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions, FetchOptionsProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions>) {
      _builder.addAllFetchOptions(values)
    }/**
     * <code>repeated .PaginatedWorldRequest.FetchOptions fetch_options = 4;</code>
     * @param values The fetchOptions to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllFetchOptions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions, FetchOptionsProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions>) {
      addAll(values)
    }/**
     * <code>repeated .PaginatedWorldRequest.FetchOptions fetch_options = 4;</code>
     * @param index The index to set the value at.
     * @param value The fetchOptions to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setFetchOptions")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions, FetchOptionsProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions) {
      _builder.setFetchOptions(index, value)
    }/**
     * <code>repeated .PaginatedWorldRequest.FetchOptions fetch_options = 4;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearFetchOptions")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.PaginatedWorldRequest.FetchOptions, FetchOptionsProxy>.clear() {
      _builder.clearFetchOptions()
    }
    /**
     * <code>optional bool fetch_from_user_spaces = 5;</code>
     */
    public var fetchFromUserSpaces: kotlin.Boolean
      @JvmName("getFetchFromUserSpaces")
      get() = _builder.getFetchFromUserSpaces()
      @JvmName("setFetchFromUserSpaces")
      set(value) {
        _builder.setFetchFromUserSpaces(value)
      }
    /**
     * <code>optional bool fetch_from_user_spaces = 5;</code>
     */
    public fun clearFetchFromUserSpaces() {
      _builder.clearFetchFromUserSpaces()
    }
    /**
     * <code>optional bool fetch_from_user_spaces = 5;</code>
     * @return Whether the fetchFromUserSpaces field is set.
     */
    public fun hasFetchFromUserSpaces(): kotlin.Boolean {
      return _builder.hasFetchFromUserSpaces()
    }

    /**
     * <code>optional bool receive_world_update_notifications = 6;</code>
     */
    public var receiveWorldUpdateNotifications: kotlin.Boolean
      @JvmName("getReceiveWorldUpdateNotifications")
      get() = _builder.getReceiveWorldUpdateNotifications()
      @JvmName("setReceiveWorldUpdateNotifications")
      set(value) {
        _builder.setReceiveWorldUpdateNotifications(value)
      }
    /**
     * <code>optional bool receive_world_update_notifications = 6;</code>
     */
    public fun clearReceiveWorldUpdateNotifications() {
      _builder.clearReceiveWorldUpdateNotifications()
    }
    /**
     * <code>optional bool receive_world_update_notifications = 6;</code>
     * @return Whether the receiveWorldUpdateNotifications field is set.
     */
    public fun hasReceiveWorldUpdateNotifications(): kotlin.Boolean {
      return _builder.hasReceiveWorldUpdateNotifications()
    }

    /**
     * <code>optional bool fetch_snippets_for_unnamed_rooms = 7;</code>
     */
    public var fetchSnippetsForUnnamedRooms: kotlin.Boolean
      @JvmName("getFetchSnippetsForUnnamedRooms")
      get() = _builder.getFetchSnippetsForUnnamedRooms()
      @JvmName("setFetchSnippetsForUnnamedRooms")
      set(value) {
        _builder.setFetchSnippetsForUnnamedRooms(value)
      }
    /**
     * <code>optional bool fetch_snippets_for_unnamed_rooms = 7;</code>
     */
    public fun clearFetchSnippetsForUnnamedRooms() {
      _builder.clearFetchSnippetsForUnnamedRooms()
    }
    /**
     * <code>optional bool fetch_snippets_for_unnamed_rooms = 7;</code>
     * @return Whether the fetchSnippetsForUnnamedRooms field is set.
     */
    public fun hasFetchSnippetsForUnnamedRooms(): kotlin.Boolean {
      return _builder.hasFetchSnippetsForUnnamedRooms()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.PaginatedWorldRequest.copy(block: org.matrix.dma.gchat.proto.PaginatedWorldRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.PaginatedWorldRequest =
  org.matrix.dma.gchat.proto.PaginatedWorldRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.PaginatedWorldRequestOrBuilder.requestHeaderOrNull: org.matrix.dma.gchat.proto.RequestHeader?
  get() = if (hasRequestHeader()) getRequestHeader() else null

