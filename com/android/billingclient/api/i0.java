package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

final class i0 {
  private final Context a;
  
  private final h0 b;
  
  i0(Context paramContext, k paramk) {
    this.a = paramContext;
    this.b = new h0(this, paramk, null);
  }
  
  final void a() {
    this.b.a(this.a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
  }
  
  final k b() {
    return h0.b(this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */