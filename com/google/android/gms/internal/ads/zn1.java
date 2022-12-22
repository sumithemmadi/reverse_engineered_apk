package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class zn1 implements d.a, d.b {
  private xo1 a;
  
  private final String b;
  
  private final String c;
  
  private final LinkedBlockingQueue<zzcf$zza> d;
  
  private final HandlerThread e;
  
  public zn1(Context paramContext, String paramString1, String paramString2) {
    this.b = paramString1;
    this.c = paramString2;
    HandlerThread handlerThread = new HandlerThread("GassClient");
    this.e = handlerThread;
    handlerThread.start();
    this.a = new xo1(paramContext, handlerThread.getLooper(), this, this, 9200000);
    this.d = new LinkedBlockingQueue<zzcf$zza>();
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
  
  private static zzcf$zza c() {
    return (zzcf$zza)zzcf$zza.z0().Q(32768L).h();
  }
  
  public final void Y0(int paramInt) {
    try {
      this.d.put(c());
    } catch (InterruptedException interruptedException) {}
  }
  
  public final zzcf$zza d(int paramInt) {
    zzcf$zza zzcf$zza;
    try {
      zzcf$zza zzcf$zza1 = this.d.poll(5000L, TimeUnit.MILLISECONDS);
    } catch (InterruptedException interruptedException1) {
      interruptedException1 = null;
    } 
    InterruptedException interruptedException2 = interruptedException1;
    if (interruptedException1 == null)
      zzcf$zza = c(); 
    return zzcf$zza;
  }
  
  public final void i1(ConnectionResult paramConnectionResult) {
    try {
      this.d.put(c());
    } catch (InterruptedException interruptedException) {}
  }
  
  public final void o1(Bundle paramBundle) {
    cp1 cp1 = b();
    if (cp1 != null)
      try {
        zzduk zzduk = new zzduk();
        this(this.b, this.c);
        zzcf$zza zzcf$zza = cp1.W4(zzduk).o0();
        this.d.put(zzcf$zza);
        a();
        return;
      } finally {
        paramBundle = null;
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */