package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class bo1 implements d.a, d.b {
  private xo1 a;
  
  private final String b;
  
  private final String c;
  
  private final zzgp d;
  
  private final int e;
  
  private final LinkedBlockingQueue<zzduw> f;
  
  private final HandlerThread g;
  
  private final pn1 h;
  
  private final long i;
  
  public bo1(Context paramContext, int paramInt, zzgp paramzzgp, String paramString1, String paramString2, String paramString3, pn1 parampn1) {
    this.b = paramString1;
    this.e = 1;
    this.d = paramzzgp;
    this.c = paramString2;
    this.h = parampn1;
    HandlerThread handlerThread = new HandlerThread("GassDGClient");
    this.g = handlerThread;
    handlerThread.start();
    this.i = System.currentTimeMillis();
    this.a = new xo1(paramContext, handlerThread.getLooper(), this, this, 19621000);
    this.f = new LinkedBlockingQueue<zzduw>();
    this.a.s();
  }
  
  private final void a() {
    xo1 xo11 = this.a;
    if (xo11 != null && (xo11.c() || this.a.g()))
      this.a.a(); 
  }
  
  private final cp1 b() {
    try {
      return this.a.i0();
    } catch (IllegalStateException|android.os.DeadObjectException illegalStateException) {
      return null;
    } 
  }
  
  private static zzduw c() {
    return new zzduw(null, 1);
  }
  
  private final void d(int paramInt, long paramLong, Exception paramException) {
    pn1 pn11 = this.h;
    if (pn11 != null)
      pn11.b(paramInt, System.currentTimeMillis() - paramLong, paramException); 
  }
  
  public final void Y0(int paramInt) {
    try {
      d(4011, this.i, null);
      this.f.put(c());
    } catch (InterruptedException interruptedException) {}
  }
  
  public final zzduw e(int paramInt) {
    try {
      zzduw zzduw = this.f.poll(50000L, TimeUnit.MILLISECONDS);
    } catch (InterruptedException interruptedException) {
      d(2009, this.i, interruptedException);
      interruptedException = null;
    } 
    d(3004, this.i, null);
    if (interruptedException != null)
      if (((zzduw)interruptedException).d == 7) {
        pn1.f(zzbw$zza.zzc.d);
      } else {
        pn1.f(zzbw$zza.zzc.c);
      }  
    return (zzduw)((interruptedException == null) ? c() : interruptedException);
  }
  
  public final void i1(ConnectionResult paramConnectionResult) {
    try {
      d(4012, this.i, null);
      this.f.put(c());
    } catch (InterruptedException interruptedException) {}
  }
  
  public final void o1(Bundle paramBundle) {
    cp1 cp1 = b();
    if (cp1 != null)
      try {
        zzduu zzduu = new zzduu();
        this(this.e, this.d, this.b, this.c);
        zzduw zzduw = cp1.F2(zzduu);
        d(5011, this.i, null);
        this.f.put(zzduw);
        a();
        return;
      } finally {
        cp1 = null;
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bo1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */