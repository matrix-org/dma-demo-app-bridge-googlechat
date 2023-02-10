package org.matrix.dma.gchat.extlib.bidiweb.webchannel.client.support.basic;

import okhttp3.HttpUrl;

/**
 * Implementation of WebChannel Uri interface.
 *
 * <p>Light wrapper around Guava Uri to match the WebChannel Support API.
 */
class BasicWebChannelSupportUri extends org.matrix.dma.gchat.extlib.bidiweb.webchannel.client.support.Support.Uri {
  private final HttpUrl url;

  public BasicWebChannelSupportUri(HttpUrl uri) {
    this.url = uri;
  }

  @Override
  public String toString() {
    return url.toString();
  }
}
