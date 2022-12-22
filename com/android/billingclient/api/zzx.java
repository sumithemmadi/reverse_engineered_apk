package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import c.c.a.a.b.d.a;

final class zzx extends ResultReceiver {
  public final void onReceiveResult(int paramInt, Bundle paramBundle) {
    g.a a = g.c();
    a.c(paramInt);
    a.b(a.e(paramBundle, "BillingClient"));
    g g = a.a();
    this.b.a(g);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */