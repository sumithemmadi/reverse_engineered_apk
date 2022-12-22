package com.allinone.callerid.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.allinone.callerid.util.b0;

public class KeepReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    try {
      String str = paramIntent.getAction();
      if (TextUtils.equals(str, "android.intent.action.SCREEN_OFF")) {
        b0.b().e(paramContext);
      } else if (TextUtils.equals(str, "android.intent.action.SCREEN_ON")) {
        b0.b().a();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/receiver/KeepReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */