package com.android.billingclient.api;

import c.c.a.a.b.d.a;

final class v0 implements Runnable {
  v0(d paramd, int paramInt, i parami, g paramg, String paramString) {}
  
  public final void run() {
    int j = this.b;
    StringBuilder stringBuilder = new StringBuilder(63);
    stringBuilder.append("Error consuming purchase with token. Response code: ");
    stringBuilder.append(j);
    a.b("BillingClient", stringBuilder.toString());
    this.c.a(this.d, this.e);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */