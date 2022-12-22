package com.allinone.callerid.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import b.p.a.a;
import com.allinone.callerid.util.j1.a;
import com.allinone.callerid.util.m0;

public class DisturbNotifitcationReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    if (paramIntent != null && paramContext != null) {
      m0.a(paramContext);
      a.s(false);
      a.b(paramContext).d(new Intent("com.allinone.callerid.DISTURB_NOTIFICATION_UPDATA"));
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/receiver/DisturbNotifitcationReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */