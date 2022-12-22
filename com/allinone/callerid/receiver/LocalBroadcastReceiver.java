package com.allinone.callerid.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class LocalBroadcastReceiver extends BroadcastReceiver {
  a a;
  
  public LocalBroadcastReceiver() {}
  
  public LocalBroadcastReceiver(a parama) {
    this.a = parama;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    a a1 = this.a;
    if (a1 != null)
      a1.a(paramIntent); 
  }
  
  public static interface a {
    void a(Intent param1Intent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/receiver/LocalBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */