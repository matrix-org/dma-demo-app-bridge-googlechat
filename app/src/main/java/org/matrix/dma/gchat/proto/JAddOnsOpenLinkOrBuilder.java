// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google_chat.proto

package org.matrix.dma.gchat.proto;

public interface JAddOnsOpenLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:JAddOnsOpenLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string url = 1;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <code>optional string url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional string original_link = 5;</code>
   * @return Whether the originalLink field is set.
   */
  boolean hasOriginalLink();
  /**
   * <code>optional string original_link = 5;</code>
   * @return The originalLink.
   */
  java.lang.String getOriginalLink();
  /**
   * <code>optional string original_link = 5;</code>
   * @return The bytes for originalLink.
   */
  com.google.protobuf.ByteString
      getOriginalLinkBytes();

  /**
   * <code>optional .JAddOnsOpenLink.OpenAs open_as = 2;</code>
   * @return Whether the openAs field is set.
   */
  boolean hasOpenAs();
  /**
   * <code>optional .JAddOnsOpenLink.OpenAs open_as = 2;</code>
   * @return The openAs.
   */
  org.matrix.dma.gchat.proto.JAddOnsOpenLink.OpenAs getOpenAs();

  /**
   * <code>optional .JAddOnsOpenLink.OnClose on_close = 3;</code>
   * @return Whether the onClose field is set.
   */
  boolean hasOnClose();
  /**
   * <code>optional .JAddOnsOpenLink.OnClose on_close = 3;</code>
   * @return The onClose.
   */
  org.matrix.dma.gchat.proto.JAddOnsOpenLink.OnClose getOnClose();

  /**
   * <code>optional .JAddOnsOpenLink.LoadIndicator load_indicator = 4;</code>
   * @return Whether the loadIndicator field is set.
   */
  boolean hasLoadIndicator();
  /**
   * <code>optional .JAddOnsOpenLink.LoadIndicator load_indicator = 4;</code>
   * @return The loadIndicator.
   */
  org.matrix.dma.gchat.proto.JAddOnsOpenLink.LoadIndicator getLoadIndicator();
}
