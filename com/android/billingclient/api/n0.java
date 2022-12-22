package com.android.billingclient.api;

import c.c.a.a.b.d.a;

final class n0 implements Runnable {
  n0(p0 paramp0, Exception paramException) {}
  
  public final void run() {
    String str = String.valueOf(this.b);
    StringBuilder stringBuilder = new StringBuilder(str.length() + 32);
    stringBuilder.append("Error acknowledge purchase; ex: ");
    stringBuilder.append(str);
    a.b("BillingClient", stringBuilder.toString());
    this.c.b.a(y.q);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */