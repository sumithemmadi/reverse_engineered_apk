package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class xt1<V> extends xs1<V> {
  private ot1<V> i;
  
  private ScheduledFuture<?> j;
  
  private xt1(ot1<V> paramot1) {
    this.i = xq1.<ot1<V>>b(paramot1);
  }
  
  static <V> ot1<V> K(ot1<V> paramot1, long paramLong, TimeUnit paramTimeUnit, ScheduledExecutorService paramScheduledExecutorService) {
    xt1<V> xt11 = new xt1<V>(paramot1);
    zt1<V> zt1 = new zt1<V>(xt11);
    xt11.j = paramScheduledExecutorService.schedule(zt1, paramLong, paramTimeUnit);
    paramot1.a(zt1, zzdzd.b);
    return xt11;
  }
  
  protected final void c() {
    g(this.i);
    ScheduledFuture<?> scheduledFuture = this.j;
    if (scheduledFuture != null)
      scheduledFuture.cancel(false); 
    this.i = null;
    this.j = null;
  }
  
  protected final String h() {
    ot1<V> ot11 = this.i;
    ScheduledFuture<?> scheduledFuture = this.j;
    if (ot11 != null) {
      String str2 = String.valueOf(ot11);
      StringBuilder stringBuilder = new StringBuilder(str2.length() + 14);
      stringBuilder.append("inputFuture=[");
      stringBuilder.append(str2);
      stringBuilder.append("]");
      str2 = stringBuilder.toString();
      String str1 = str2;
      if (scheduledFuture != null) {
        long l = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        str1 = str2;
        if (l > 0L) {
          str1 = String.valueOf(str2);
          StringBuilder stringBuilder1 = new StringBuilder(str1.length() + 43);
          stringBuilder1.append(str1);
          stringBuilder1.append(", remaining delay=[");
          stringBuilder1.append(l);
          stringBuilder1.append(" ms]");
          str1 = stringBuilder1.toString();
        } 
      } 
      return str1;
    } 
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xt1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */