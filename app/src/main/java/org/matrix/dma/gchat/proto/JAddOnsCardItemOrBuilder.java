// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface JAddOnsCardItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:JAddOnsCardItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .JAddOnsCardItem.CardItemHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>optional .JAddOnsCardItem.CardItemHeader header = 1;</code>
   * @return The header.
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemHeader getHeader();
  /**
   * <code>optional .JAddOnsCardItem.CardItemHeader header = 1;</code>
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>repeated .JAddOnsCardItem.CardItemSection sections = 2;</code>
   */
  java.util.List<org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemSection> 
      getSectionsList();
  /**
   * <code>repeated .JAddOnsCardItem.CardItemSection sections = 2;</code>
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemSection getSections(int index);
  /**
   * <code>repeated .JAddOnsCardItem.CardItemSection sections = 2;</code>
   */
  int getSectionsCount();
  /**
   * <code>repeated .JAddOnsCardItem.CardItemSection sections = 2;</code>
   */
  java.util.List<? extends org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemSectionOrBuilder> 
      getSectionsOrBuilderList();
  /**
   * <code>repeated .JAddOnsCardItem.CardItemSection sections = 2;</code>
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemSectionOrBuilder getSectionsOrBuilder(
      int index);

  /**
   * <code>repeated .JAddOnsCardItem.CardItemAction card_actions = 3;</code>
   */
  java.util.List<org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemAction> 
      getCardActionsList();
  /**
   * <code>repeated .JAddOnsCardItem.CardItemAction card_actions = 3;</code>
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemAction getCardActions(int index);
  /**
   * <code>repeated .JAddOnsCardItem.CardItemAction card_actions = 3;</code>
   */
  int getCardActionsCount();
  /**
   * <code>repeated .JAddOnsCardItem.CardItemAction card_actions = 3;</code>
   */
  java.util.List<? extends org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemActionOrBuilder> 
      getCardActionsOrBuilderList();
  /**
   * <code>repeated .JAddOnsCardItem.CardItemAction card_actions = 3;</code>
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemActionOrBuilder getCardActionsOrBuilder(
      int index);

  /**
   * <code>optional string name = 4;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .JAddOnsCardItem.CardItemFixedFooter fixed_footer = 5;</code>
   * @return Whether the fixedFooter field is set.
   */
  boolean hasFixedFooter();
  /**
   * <code>optional .JAddOnsCardItem.CardItemFixedFooter fixed_footer = 5;</code>
   * @return The fixedFooter.
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemFixedFooter getFixedFooter();
  /**
   * <code>optional .JAddOnsCardItem.CardItemFixedFooter fixed_footer = 5;</code>
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemFixedFooterOrBuilder getFixedFooterOrBuilder();

  /**
   * <code>optional .JAddOnsCardItem.CardItemRefreshAction refresh_action = 6;</code>
   * @return Whether the refreshAction field is set.
   */
  boolean hasRefreshAction();
  /**
   * <code>optional .JAddOnsCardItem.CardItemRefreshAction refresh_action = 6;</code>
   * @return The refreshAction.
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemRefreshAction getRefreshAction();
  /**
   * <code>optional .JAddOnsCardItem.CardItemRefreshAction refresh_action = 6;</code>
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemRefreshActionOrBuilder getRefreshActionOrBuilder();

  /**
   * <code>optional .JAddOnsCardItem.DisplayStyle display_style = 7;</code>
   * @return Whether the displayStyle field is set.
   */
  boolean hasDisplayStyle();
  /**
   * <code>optional .JAddOnsCardItem.DisplayStyle display_style = 7;</code>
   * @return The displayStyle.
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.DisplayStyle getDisplayStyle();

  /**
   * <code>optional .JAddOnsCardItem.CardItemHeader peek_card_header = 8;</code>
   * @return Whether the peekCardHeader field is set.
   */
  boolean hasPeekCardHeader();
  /**
   * <code>optional .JAddOnsCardItem.CardItemHeader peek_card_header = 8;</code>
   * @return The peekCardHeader.
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemHeader getPeekCardHeader();
  /**
   * <code>optional .JAddOnsCardItem.CardItemHeader peek_card_header = 8;</code>
   */
  org.matrix.dma.gchat.proto.JAddOnsCardItem.CardItemHeaderOrBuilder getPeekCardHeaderOrBuilder();

  /**
   * <code>optional .JAddOnsThemeColors background_theme_colors = 9;</code>
   * @return Whether the backgroundThemeColors field is set.
   */
  boolean hasBackgroundThemeColors();
  /**
   * <code>optional .JAddOnsThemeColors background_theme_colors = 9;</code>
   * @return The backgroundThemeColors.
   */
  org.matrix.dma.gchat.proto.JAddOnsThemeColors getBackgroundThemeColors();
  /**
   * <code>optional .JAddOnsThemeColors background_theme_colors = 9;</code>
   */
  org.matrix.dma.gchat.proto.JAddOnsThemeColorsOrBuilder getBackgroundThemeColorsOrBuilder();
}
