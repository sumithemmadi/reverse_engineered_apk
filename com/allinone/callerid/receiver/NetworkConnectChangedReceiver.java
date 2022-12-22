package com.allinone.callerid.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Parcelable;
import com.allinone.callerid.a.b;
import com.allinone.callerid.util.d0;

public class NetworkConnectChangedReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    try {
      if ("android.net.wifi.STATE_CHANGE".equals(paramIntent.getAction())) {
        Parcelable parcelable = paramIntent.getParcelableExtra("networkInfo");
        if (parcelable != null) {
          boolean bool;
          NetworkInfo.State state2 = ((NetworkInfo)parcelable).getState();
          NetworkInfo.State state1 = NetworkInfo.State.CONNECTED;
          if (state2 == state1) {
            bool = true;
          } else {
            bool = false;
          } 
          if (!bool) {
            if (d0.a)
              d0.a("wbb", "断开下载"); 
          } else {
            if (d0.a)
              d0.a("wbb", "网络已连接"); 
            b.e().g();
          } 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/receiver/NetworkConnectChangedReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */