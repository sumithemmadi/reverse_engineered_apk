package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class wt1<V> extends bt1<V> implements ot1<V>, ScheduledFuture<V> {
  private final ScheduledFuture<?> c;
  
  public wt1(ot1<V> paramot1, ScheduledFuture<?> paramScheduledFuture) {
    super(paramot1);
    this.c = paramScheduledFuture;
  }
  
  public final boolean cancel(boolean paramBoolean) {
    boolean bool = super.cancel(paramBoolean);
    if (bool)
      this.c.cancel(paramBoolean); 
    return bool;
  }
  
  public final long getDelay(TimeUnit paramTimeUnit) {
    return this.c.getDelay(paramTimeUnit);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */