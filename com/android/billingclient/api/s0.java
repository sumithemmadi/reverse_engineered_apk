package com.android.billingclient.api;

import c.c.a.a.b.d.a;
import java.util.concurrent.Future;

final class s0 implements Runnable {
  s0(d paramd, Future paramFuture, Runnable paramRunnable) {}
  
  public final void run() {
    if (!this.b.isDone() && !this.b.isCancelled()) {
      this.b.cancel(true);
      a.b("BillingClient", "Async task is taking too long, cancel it!");
      Runnable runnable = this.c;
      if (runnable != null)
        runnable.run(); 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */