package com.allinone.callerid.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.allinone.callerid.util.d0;

public class MyReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    if (d0.a)
      Log.e("tony", "onReceive: "); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/receiver/MyReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */