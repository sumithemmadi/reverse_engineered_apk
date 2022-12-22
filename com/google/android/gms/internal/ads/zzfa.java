package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class zzfa extends BroadcastReceiver {
  private boolean a = true;
  
  zzfa(Context paramContext) {
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.intent.action.USER_PRESENT");
    intentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.registerReceiver(this, intentFilter);
  }
  
  final boolean a() {
    return this.a;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction())) {
      this.a = true;
      return;
    } 
    if ("android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()))
      this.a = false; 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */