package org.matrix.dma.gchat.extlib.bidiweb.webchannel.client.support.basic;

import org.matrix.dma.gchat.extlib.bidiweb.webchannel.client.support.Support;

import okhttp3.HttpUrl;

/**
 * Implementation of WebChannel UriBuilder interface.
 *
 * <p>Light wrapper around Guava UriBuilder to match the WebChannel Support API.
 */
class BasicWebChannelSupportUriBuilder extends Support.UriBuilder {
  private final HttpUrl.Builder builder;

  public static BasicWebChannelSupportUriBuilder parse(String url) {
    return new BasicWebChannelSupportUriBuilder(HttpUrl.parse(url).newBuilder());
  }

  private BasicWebChannelSupportUriBuilder(HttpUrl.Builder builder) {
    this.builder = builder;
  }

  @Override
  public BasicWebChannelSupportUriBuilder addQueryParameter(String name, String value) {
    builder.addQueryParameter(name, value);
    return this;
  }

  @Override
  public String getAuthority() {
    // XXX: Improper change
    return builder.toString();
  }

  @Override
  public BasicWebChannelSupportUri getUri() {
    return new BasicWebChannelSupportUri(builder.build());
  }

  @Override
  public BasicWebChannelSupportUriBuilder clone() {
    return new BasicWebChannelSupportUriBuilder(HttpUrl.parse(builder.toString()).newBuilder());
  }

  @Override
  public String toString() {
    return builder.toString();
  }
}
