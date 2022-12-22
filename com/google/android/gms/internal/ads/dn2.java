package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.common.internal.d;

public final class dn2 {
  private final Runnable a = new cn2(this);
  
  private final Object b = new Object();
  
  private in2 c;
  
  private Context d;
  
  private ln2 e;
  
  private final void a() {
    synchronized (this.b) {
      if (this.d == null || this.c != null)
        return; 
      fn2 fn2 = new fn2();
      this(this);
      hn2 hn2 = new hn2();
      this(this);
      in2 in21 = e(fn2, hn2);
      this.c = in21;
      in21.s();
      return;
    } 
  }
  
  private final void b() {
    synchronized (this.b) {
      in2 in21 = this.c;
      if (in21 == null)
        return; 
      if (in21.c() || this.c.g())
        this.c.a(); 
      this.c = null;
      this.e = null;
      Binder.flushPendingCommands();
      return;
    } 
  }
  
  private final in2 e(d.a parama, d.b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new com/google/android/gms/internal/ads/in2
    //   5: dup
    //   6: aload_0
    //   7: getfield d : Landroid/content/Context;
    //   10: invokestatic q : ()Lcom/google/android/gms/ads/internal/util/l0;
    //   13: invokevirtual b : ()Landroid/os/Looper;
    //   16: aload_1
    //   17: aload_2
    //   18: invokespecial <init> : (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/d$a;Lcom/google/android/gms/common/internal/d$b;)V
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: areturn
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: athrow
    // Exception table:
    //   from	to	target	type
    //   2	22	26	finally
  }
  
  public final void c(Context paramContext) {
    if (paramContext == null)
      return; 
    synchronized (this.b) {
      if (this.d != null)
        return; 
      this.d = paramContext.getApplicationContext();
      x<Boolean> x = m0.U2;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        a();
      } else {
        x = m0.T2;
        if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
          gn2 gn2 = new gn2();
          this(this);
          q.f().d(gn2);
        } 
      } 
      return;
    } 
  }
  
  public final zztc d(zzth paramzzth) {
    synchronized (this.b) {
      zztc zztc;
      if (this.e == null) {
        zztc = new zztc();
        this();
        return zztc;
      } 
      try {
        if (this.c.j0()) {
          zztc = this.e.B2((zzth)zztc);
          return zztc;
        } 
        zztc = this.e.Z8((zzth)zztc);
        return zztc;
      } catch (RemoteException remoteException) {
        cm.c("Unable to call into cache service.", (Throwable)remoteException);
        zztc zztc1 = new zztc();
        this();
        return zztc1;
      } 
    } 
  }
  
  public final long i(zzth paramzzth) {
    synchronized (this.b) {
      if (this.e == null)
        return -2L; 
      boolean bool = this.c.j0();
      if (bool)
        try {
          return this.e.m8(paramzzth);
        } catch (RemoteException remoteException) {
          cm.c("Unable to call into cache service.", (Throwable)remoteException);
        }  
      return -2L;
    } 
  }
  
  public final void m() {
    x<Boolean> x = m0.V2;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      synchronized (this.b) {
        a();
        xp1 xp1 = h1.a;
        xp1.removeCallbacks(this.a);
        Runnable runnable = this.a;
        x<Long> x1 = m0.W2;
        xp1.postDelayed(runnable, ((Long)er2.e().<Long>c(x1)).longValue());
        return;
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */