package com.android.billingclient.api;

import c.c.a.a.b.d.a;

final class w0 implements Runnable {
  w0(d paramd, Exception paramException, i parami, String paramString) {}
  
  public final void run() {
    String str = String.valueOf(this.b);
    StringBuilder stringBuilder = new StringBuilder(str.length() + 30);
    stringBuilder.append("Error consuming purchase; ex: ");
    stringBuilder.append(str);
    a.b("BillingClient", stringBuilder.toString());
    this.c.a(y.q, this.d);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */