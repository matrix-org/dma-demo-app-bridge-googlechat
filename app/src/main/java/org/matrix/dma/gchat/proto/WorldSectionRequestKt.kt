//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializeworldSectionRequest")
public inline fun worldSectionRequest(block: org.matrix.dma.gchat.proto.WorldSectionRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.WorldSectionRequest =
  org.matrix.dma.gchat.proto.WorldSectionRequestKt.Dsl._create(org.matrix.dma.gchat.proto.WorldSectionRequest.newBuilder()).apply { block() }._build()
public object WorldSectionRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.WorldSectionRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.WorldSectionRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.WorldSectionRequest = _builder.build()

    /**
     * <code>optional int32 page_size = 1;</code>
     */
    public var pageSize: kotlin.Int
      @JvmName("getPageSize")
      get() = _builder.getPageSize()
      @JvmName("setPageSize")
      set(value) {
        _builder.setPageSize(value)
      }
    /**
     * <code>optional int32 page_size = 1;</code>
     */
    public fun clearPageSize() {
      _builder.clearPageSize()
    }
    /**
     * <code>optional int32 page_size = 1;</code>
     * @return Whether the pageSize field is set.
     */
    public fun hasPageSize(): kotlin.Boolean {
      return _builder.hasPageSize()
    }

    /**
     * <code>optional .WorldSection world_section = 2;</code>
     */
    public var worldSection: org.matrix.dma.gchat.proto.WorldSection
      @JvmName("getWorldSection")
      get() = _builder.getWorldSection()
      @JvmName("setWorldSection")
      set(value) {
        _builder.setWorldSection(value)
      }
    /**
     * <code>optional .WorldSection world_section = 2;</code>
     */
    public fun clearWorldSection() {
      _builder.clearWorldSection()
    }
    /**
     * <code>optional .WorldSection world_section = 2;</code>
     * @return Whether the worldSection field is set.
     */
    public fun hasWorldSection(): kotlin.Boolean {
      return _builder.hasWorldSection()
    }
    public val WorldSectionRequestKt.Dsl.worldSectionOrNull: org.matrix.dma.gchat.proto.WorldSection?
      get() = _builder.worldSectionOrNull

    /**
     * <code>optional .WorldFilter world_filter = 4;</code>
     */
    public var worldFilter: org.matrix.dma.gchat.proto.WorldFilter
      @JvmName("getWorldFilter")
      get() = _builder.getWorldFilter()
      @JvmName("setWorldFilter")
      set(value) {
        _builder.setWorldFilter(value)
      }
    /**
     * <code>optional .WorldFilter world_filter = 4;</code>
     */
    public fun clearWorldFilter() {
      _builder.clearWorldFilter()
    }
    /**
     * <code>optional .WorldFilter world_filter = 4;</code>
     * @return Whether the worldFilter field is set.
     */
    public fun hasWorldFilter(): kotlin.Boolean {
      return _builder.hasWorldFilter()
    }
    public val WorldSectionRequestKt.Dsl.worldFilterOrNull: org.matrix.dma.gchat.proto.WorldFilter?
      get() = _builder.worldFilterOrNull

    /**
     * <code>optional int32 num_world_items_with_snippet = 5;</code>
     */
    public var numWorldItemsWithSnippet: kotlin.Int
      @JvmName("getNumWorldItemsWithSnippet")
      get() = _builder.getNumWorldItemsWithSnippet()
      @JvmName("setNumWorldItemsWithSnippet")
      set(value) {
        _builder.setNumWorldItemsWithSnippet(value)
      }
    /**
     * <code>optional int32 num_world_items_with_snippet = 5;</code>
     */
    public fun clearNumWorldItemsWithSnippet() {
      _builder.clearNumWorldItemsWithSnippet()
    }
    /**
     * <code>optional int32 num_world_items_with_snippet = 5;</code>
     * @return Whether the numWorldItemsWithSnippet field is set.
     */
    public fun hasNumWorldItemsWithSnippet(): kotlin.Boolean {
      return _builder.hasNumWorldItemsWithSnippet()
    }

    /**
     * <code>optional int64 anchor_sort_timestamp_micros = 3;</code>
     */
    public var anchorSortTimestampMicros: kotlin.Long
      @JvmName("getAnchorSortTimestampMicros")
      get() = _builder.getAnchorSortTimestampMicros()
      @JvmName("setAnchorSortTimestampMicros")
      set(value) {
        _builder.setAnchorSortTimestampMicros(value)
      }
    /**
     * <code>optional int64 anchor_sort_timestamp_micros = 3;</code>
     */
    public fun clearAnchorSortTimestampMicros() {
      _builder.clearAnchorSortTimestampMicros()
    }
    /**
     * <code>optional int64 anchor_sort_timestamp_micros = 3;</code>
     * @return Whether the anchorSortTimestampMicros field is set.
     */
    public fun hasAnchorSortTimestampMicros(): kotlin.Boolean {
      return _builder.hasAnchorSortTimestampMicros()
    }

    /**
     * <pre>
     *oneof Pagination {
     * </pre>
     *
     * <code>optional string pagination_token = 6;</code>
     */
    public var paginationToken: kotlin.String
      @JvmName("getPaginationToken")
      get() = _builder.getPaginationToken()
      @JvmName("setPaginationToken")
      set(value) {
        _builder.setPaginationToken(value)
      }
    /**
     * <pre>
     *oneof Pagination {
     * </pre>
     *
     * <code>optional string pagination_token = 6;</code>
     */
    public fun clearPaginationToken() {
      _builder.clearPaginationToken()
    }
    /**
     * <pre>
     *oneof Pagination {
     * </pre>
     *
     * <code>optional string pagination_token = 6;</code>
     * @return Whether the paginationToken field is set.
     */
    public fun hasPaginationToken(): kotlin.Boolean {
      return _builder.hasPaginationToken()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.WorldSectionRequest.copy(block: org.matrix.dma.gchat.proto.WorldSectionRequestKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.WorldSectionRequest =
  org.matrix.dma.gchat.proto.WorldSectionRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.WorldSectionRequestOrBuilder.worldSectionOrNull: org.matrix.dma.gchat.proto.WorldSection?
  get() = if (hasWorldSection()) getWorldSection() else null

public val org.matrix.dma.gchat.proto.WorldSectionRequestOrBuilder.worldFilterOrNull: org.matrix.dma.gchat.proto.WorldFilter?
  get() = if (hasWorldFilter()) getWorldFilter() else null

