package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import c.c.a.a.b.d.a;
import c.c.a.a.b.d.c;

final class v implements ServiceConnection {
  private final Object a = new Object();
  
  private boolean b = false;
  
  private e c;
  
  private final void e(g paramg) {
    d.p(this.d, new s(this, paramg));
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    a.a("BillingClient", "Billing service connected.");
    d.s(this.d, c.Y0(paramIBinder));
    if (d.G(this.d, new t(this), 30000L, new u(this)) == null)
      e(d.H(this.d)); 
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    a.b("BillingClient", "Billing service disconnected.");
    d.s(this.d, null);
    d.t(this.d, 0);
    synchronized (this.a) {
      e e1 = this.c;
      if (e1 != null)
        e1.b(); 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */