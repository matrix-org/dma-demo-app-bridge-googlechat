package org.matrix.dma.gchat.extlib.bidiweb.webchannel.client.protocol_v8;

import org.matrix.dma.gchat.extlib.bidiweb.webchannel.client.WebChannelTransport;
import org.matrix.dma.gchat.extlib.bidiweb.webchannel.client.support.Support;

public class WebChannelTransports {

  public static WebChannelTransport createTransport(Support support) {
    return new WebChannelBaseTransport(support);
  }
}
