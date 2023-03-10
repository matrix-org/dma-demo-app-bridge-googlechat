//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

@kotlin.jvm.JvmName("-initializejAddOnsGrid")
public inline fun jAddOnsGrid(block: org.matrix.dma.gchat.proto.JAddOnsGridKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.JAddOnsGrid =
  org.matrix.dma.gchat.proto.JAddOnsGridKt.Dsl._create(org.matrix.dma.gchat.proto.JAddOnsGrid.newBuilder()).apply { block() }._build()
public object JAddOnsGridKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: org.matrix.dma.gchat.proto.JAddOnsGrid.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.matrix.dma.gchat.proto.JAddOnsGrid.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.matrix.dma.gchat.proto.JAddOnsGrid = _builder.build()

    /**
     * <code>optional .JAddOnsIdentifier id = 1;</code>
     */
    public var id: org.matrix.dma.gchat.proto.JAddOnsIdentifier
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>optional .JAddOnsIdentifier id = 1;</code>
     */
    public fun clearId() {
      _builder.clearId()
    }
    /**
     * <code>optional .JAddOnsIdentifier id = 1;</code>
     * @return Whether the id field is set.
     */
    public fun hasId(): kotlin.Boolean {
      return _builder.hasId()
    }
    public val JAddOnsGridKt.Dsl.idOrNull: org.matrix.dma.gchat.proto.JAddOnsIdentifier?
      get() = _builder.idOrNull

    /**
     * <code>optional string title = 2;</code>
     */
    public var title: kotlin.String
      @JvmName("getTitle")
      get() = _builder.getTitle()
      @JvmName("setTitle")
      set(value) {
        _builder.setTitle(value)
      }
    /**
     * <code>optional string title = 2;</code>
     */
    public fun clearTitle() {
      _builder.clearTitle()
    }
    /**
     * <code>optional string title = 2;</code>
     * @return Whether the title field is set.
     */
    public fun hasTitle(): kotlin.Boolean {
      return _builder.hasTitle()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ItemsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .JAddOnsGrid.GridItem items = 3;</code>
     */
     public val items: com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem, ItemsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getItemsList()
      )
    /**
     * <code>repeated .JAddOnsGrid.GridItem items = 3;</code>
     * @param value The items to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addItems")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem, ItemsProxy>.add(value: org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem) {
      _builder.addItems(value)
    }
    /**
     * <code>repeated .JAddOnsGrid.GridItem items = 3;</code>
     * @param value The items to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignItems")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem, ItemsProxy>.plusAssign(value: org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem) {
      add(value)
    }
    /**
     * <code>repeated .JAddOnsGrid.GridItem items = 3;</code>
     * @param values The items to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllItems")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem, ItemsProxy>.addAll(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem>) {
      _builder.addAllItems(values)
    }
    /**
     * <code>repeated .JAddOnsGrid.GridItem items = 3;</code>
     * @param values The items to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllItems")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem, ItemsProxy>.plusAssign(values: kotlin.collections.Iterable<org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem>) {
      addAll(values)
    }
    /**
     * <code>repeated .JAddOnsGrid.GridItem items = 3;</code>
     * @param index The index to set the value at.
     * @param value The items to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setItems")
    public operator fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem, ItemsProxy>.set(index: kotlin.Int, value: org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem) {
      _builder.setItems(index, value)
    }
    /**
     * <code>repeated .JAddOnsGrid.GridItem items = 3;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearItems")
    public fun com.google.protobuf.kotlin.DslList<org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem, ItemsProxy>.clear() {
      _builder.clearItems()
    }


    /**
     * <code>optional .JAddOnsBorderStyle border_style = 4;</code>
     */
    public var borderStyle: org.matrix.dma.gchat.proto.JAddOnsBorderStyle
      @JvmName("getBorderStyle")
      get() = _builder.getBorderStyle()
      @JvmName("setBorderStyle")
      set(value) {
        _builder.setBorderStyle(value)
      }
    /**
     * <code>optional .JAddOnsBorderStyle border_style = 4;</code>
     */
    public fun clearBorderStyle() {
      _builder.clearBorderStyle()
    }
    /**
     * <code>optional .JAddOnsBorderStyle border_style = 4;</code>
     * @return Whether the borderStyle field is set.
     */
    public fun hasBorderStyle(): kotlin.Boolean {
      return _builder.hasBorderStyle()
    }
    public val JAddOnsGridKt.Dsl.borderStyleOrNull: org.matrix.dma.gchat.proto.JAddOnsBorderStyle?
      get() = _builder.borderStyleOrNull

    /**
     * <code>optional int32 num_columns = 5;</code>
     */
    public var numColumns: kotlin.Int
      @JvmName("getNumColumns")
      get() = _builder.getNumColumns()
      @JvmName("setNumColumns")
      set(value) {
        _builder.setNumColumns(value)
      }
    /**
     * <code>optional int32 num_columns = 5;</code>
     */
    public fun clearNumColumns() {
      _builder.clearNumColumns()
    }
    /**
     * <code>optional int32 num_columns = 5;</code>
     * @return Whether the numColumns field is set.
     */
    public fun hasNumColumns(): kotlin.Boolean {
      return _builder.hasNumColumns()
    }

    /**
     * <code>optional .JAddOnsOnClick on_click = 6;</code>
     */
    public var onClick: org.matrix.dma.gchat.proto.JAddOnsOnClick
      @JvmName("getOnClick")
      get() = _builder.getOnClick()
      @JvmName("setOnClick")
      set(value) {
        _builder.setOnClick(value)
      }
    /**
     * <code>optional .JAddOnsOnClick on_click = 6;</code>
     */
    public fun clearOnClick() {
      _builder.clearOnClick()
    }
    /**
     * <code>optional .JAddOnsOnClick on_click = 6;</code>
     * @return Whether the onClick field is set.
     */
    public fun hasOnClick(): kotlin.Boolean {
      return _builder.hasOnClick()
    }
    public val JAddOnsGridKt.Dsl.onClickOrNull: org.matrix.dma.gchat.proto.JAddOnsOnClick?
      get() = _builder.onClickOrNull
  }
  @kotlin.jvm.JvmName("-initializegridItem")
  public inline fun gridItem(block: org.matrix.dma.gchat.proto.JAddOnsGridKt.GridItemKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem =
    org.matrix.dma.gchat.proto.JAddOnsGridKt.GridItemKt.Dsl._create(org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem.newBuilder()).apply { block() }._build()
  public object GridItemKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem = _builder.build()

      /**
       * <code>optional string identifier = 1;</code>
       */
      public var identifier: kotlin.String
        @JvmName("getIdentifier")
        get() = _builder.getIdentifier()
        @JvmName("setIdentifier")
        set(value) {
          _builder.setIdentifier(value)
        }
      /**
       * <code>optional string identifier = 1;</code>
       */
      public fun clearIdentifier() {
        _builder.clearIdentifier()
      }
      /**
       * <code>optional string identifier = 1;</code>
       * @return Whether the identifier field is set.
       */
      public fun hasIdentifier(): kotlin.Boolean {
        return _builder.hasIdentifier()
      }

      /**
       * <code>optional .JAddOnsImageComponent image = 2;</code>
       */
      public var image: org.matrix.dma.gchat.proto.JAddOnsImageComponent
        @JvmName("getImage")
        get() = _builder.getImage()
        @JvmName("setImage")
        set(value) {
          _builder.setImage(value)
        }
      /**
       * <code>optional .JAddOnsImageComponent image = 2;</code>
       */
      public fun clearImage() {
        _builder.clearImage()
      }
      /**
       * <code>optional .JAddOnsImageComponent image = 2;</code>
       * @return Whether the image field is set.
       */
      public fun hasImage(): kotlin.Boolean {
        return _builder.hasImage()
      }
      public val GridItemKt.Dsl.imageOrNull: org.matrix.dma.gchat.proto.JAddOnsImageComponent?
        get() = _builder.imageOrNull

      /**
       * <code>optional string title = 3;</code>
       */
      public var title: kotlin.String
        @JvmName("getTitle")
        get() = _builder.getTitle()
        @JvmName("setTitle")
        set(value) {
          _builder.setTitle(value)
        }
      /**
       * <code>optional string title = 3;</code>
       */
      public fun clearTitle() {
        _builder.clearTitle()
      }
      /**
       * <code>optional string title = 3;</code>
       * @return Whether the title field is set.
       */
      public fun hasTitle(): kotlin.Boolean {
        return _builder.hasTitle()
      }

      /**
       * <code>optional string subtitle = 4;</code>
       */
      public var subtitle: kotlin.String
        @JvmName("getSubtitle")
        get() = _builder.getSubtitle()
        @JvmName("setSubtitle")
        set(value) {
          _builder.setSubtitle(value)
        }
      /**
       * <code>optional string subtitle = 4;</code>
       */
      public fun clearSubtitle() {
        _builder.clearSubtitle()
      }
      /**
       * <code>optional string subtitle = 4;</code>
       * @return Whether the subtitle field is set.
       */
      public fun hasSubtitle(): kotlin.Boolean {
        return _builder.hasSubtitle()
      }

      /**
       * <code>optional .JAddOnsWidget.HorizontalAlign text_alignment = 5;</code>
       */
      public var textAlignment: org.matrix.dma.gchat.proto.JAddOnsWidget.HorizontalAlign
        @JvmName("getTextAlignment")
        get() = _builder.getTextAlignment()
        @JvmName("setTextAlignment")
        set(value) {
          _builder.setTextAlignment(value)
        }
      /**
       * <code>optional .JAddOnsWidget.HorizontalAlign text_alignment = 5;</code>
       */
      public fun clearTextAlignment() {
        _builder.clearTextAlignment()
      }
      /**
       * <code>optional .JAddOnsWidget.HorizontalAlign text_alignment = 5;</code>
       * @return Whether the textAlignment field is set.
       */
      public fun hasTextAlignment(): kotlin.Boolean {
        return _builder.hasTextAlignment()
      }

      /**
       * <code>optional .JAddOnsGrid.GridItem.GridItemLayout layout = 9;</code>
       */
      public var layout: org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem.GridItemLayout
        @JvmName("getLayout")
        get() = _builder.getLayout()
        @JvmName("setLayout")
        set(value) {
          _builder.setLayout(value)
        }
      /**
       * <code>optional .JAddOnsGrid.GridItem.GridItemLayout layout = 9;</code>
       */
      public fun clearLayout() {
        _builder.clearLayout()
      }
      /**
       * <code>optional .JAddOnsGrid.GridItem.GridItemLayout layout = 9;</code>
       * @return Whether the layout field is set.
       */
      public fun hasLayout(): kotlin.Boolean {
        return _builder.hasLayout()
      }

      /**
       * <code>optional .JAddOnsOnClick on_click = 10;</code>
       */
      public var onClick: org.matrix.dma.gchat.proto.JAddOnsOnClick
        @JvmName("getOnClick")
        get() = _builder.getOnClick()
        @JvmName("setOnClick")
        set(value) {
          _builder.setOnClick(value)
        }
      /**
       * <code>optional .JAddOnsOnClick on_click = 10;</code>
       */
      public fun clearOnClick() {
        _builder.clearOnClick()
      }
      /**
       * <code>optional .JAddOnsOnClick on_click = 10;</code>
       * @return Whether the onClick field is set.
       */
      public fun hasOnClick(): kotlin.Boolean {
        return _builder.hasOnClick()
      }
      public val GridItemKt.Dsl.onClickOrNull: org.matrix.dma.gchat.proto.JAddOnsOnClick?
        get() = _builder.onClickOrNull
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.JAddOnsGrid.copy(block: org.matrix.dma.gchat.proto.JAddOnsGridKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.JAddOnsGrid =
  org.matrix.dma.gchat.proto.JAddOnsGridKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem.copy(block: org.matrix.dma.gchat.proto.JAddOnsGridKt.GridItemKt.Dsl.() -> kotlin.Unit): org.matrix.dma.gchat.proto.JAddOnsGrid.GridItem =
  org.matrix.dma.gchat.proto.JAddOnsGridKt.GridItemKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val org.matrix.dma.gchat.proto.JAddOnsGrid.GridItemOrBuilder.imageOrNull: org.matrix.dma.gchat.proto.JAddOnsImageComponent?
  get() = if (hasImage()) getImage() else null

public val org.matrix.dma.gchat.proto.JAddOnsGrid.GridItemOrBuilder.onClickOrNull: org.matrix.dma.gchat.proto.JAddOnsOnClick?
  get() = if (hasOnClick()) getOnClick() else null

public val org.matrix.dma.gchat.proto.JAddOnsGridOrBuilder.idOrNull: org.matrix.dma.gchat.proto.JAddOnsIdentifier?
  get() = if (hasId()) getId() else null

public val org.matrix.dma.gchat.proto.JAddOnsGridOrBuilder.borderStyleOrNull: org.matrix.dma.gchat.proto.JAddOnsBorderStyle?
  get() = if (hasBorderStyle()) getBorderStyle() else null

public val org.matrix.dma.gchat.proto.JAddOnsGridOrBuilder.onClickOrNull: org.matrix.dma.gchat.proto.JAddOnsOnClick?
  get() = if (hasOnClick()) getOnClick() else null

