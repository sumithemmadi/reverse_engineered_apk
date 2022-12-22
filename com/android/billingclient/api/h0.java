package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c.c.a.a.b.d.a;
import java.util.List;

final class h0 extends BroadcastReceiver {
  private final k a;
  
  private boolean b;
  
  public final void a(Context paramContext, IntentFilter paramIntentFilter) {
    if (!this.b) {
      paramContext.registerReceiver(i0.c(this.c), paramIntentFilter);
      this.b = true;
    } 
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    g g = a.c(paramIntent, "BillingBroadcastManager");
    List<Purchase> list = a.f(paramIntent.getExtras());
    this.a.a(g, list);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */