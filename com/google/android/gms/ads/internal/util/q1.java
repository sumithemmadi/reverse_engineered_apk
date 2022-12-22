package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class q1 extends BroadcastReceiver {
  private q1(h1 paramh1) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction())) {
      h1.s(this.a, true);
      return;
    } 
    if ("android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()))
      h1.s(this.a, false); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/q1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */