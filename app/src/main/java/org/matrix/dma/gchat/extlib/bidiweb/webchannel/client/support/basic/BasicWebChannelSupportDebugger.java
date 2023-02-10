package org.matrix.dma.gchat.extlib.bidiweb.webchannel.client.support.basic;

import android.util.Log;

import com.google.common.base.Preconditions;
import org.matrix.dma.gchat.extlib.bidiweb.webchannel.client.support.Support.Debugger;

/**
 * Implementation of WebChannel Debugger interface.
 *
 * <p>Light wrapper around GoogleLogger to match the WebChannel Support API.
 */
class BasicWebChannelSupportDebugger extends Debugger {

  @Override
  public void debug(String text) {
    Log.d("bidiweb-D", text);
  }

  @Override
  public void info(String text) {
    Log.d("bidiweb-I", text);
  }

  @Override
  public void warning(String text) {
    Log.d("bidiweb-W", text);
  }

  @Override
  public void dumpException(Exception ex, String msg) {
    Log.d("bidiweb-I", "Exception with message: " + msg +" | "+ ex.toString());
  }

  @Override
  public void severe(String text) {
    Log.d("bidiweb-S", text);
  }

  @Override
  public void assertCondition(boolean condition, String text) {
    Preconditions.checkState(condition, text);
  }
}
