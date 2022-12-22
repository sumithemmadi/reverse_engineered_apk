package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.l;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class e extends a<Void> implements l {
  private Semaphore p = new Semaphore(0);
  
  private Set<d> q;
  
  public e(Context paramContext, Set<d> paramSet) {
    super(paramContext);
    this.q = paramSet;
  }
  
  private final Void D() {
    Iterator<d> iterator = this.q.iterator();
    byte b = 0;
    while (iterator.hasNext()) {
      if (((d)iterator.next()).d(this))
        b++; 
    } 
    try {
      this.p.tryAcquire(b, 5L, TimeUnit.SECONDS);
    } catch (InterruptedException interruptedException) {
      Log.i("GACSignInLoader", "Unexpected InterruptedException", interruptedException);
      Thread.currentThread().interrupt();
    } 
    return null;
  }
  
  protected final void o() {
    this.p.drainPermits();
    h();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */