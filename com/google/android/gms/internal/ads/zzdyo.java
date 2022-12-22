package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzdyo<InputT, OutputT> extends os1<OutputT> {
  private static final Logger m = Logger.getLogger(zzdyo.class.getName());
  
  private zzdwy<? extends ot1<? extends InputT>> n;
  
  private final boolean o;
  
  private final boolean p;
  
  zzdyo(zzdwy<? extends ot1<? extends InputT>> paramzzdwy, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramzzdwy.size());
    this.n = xq1.<zzdwy<? extends ot1<? extends InputT>>>b(paramzzdwy);
    this.o = paramBoolean1;
    this.p = paramBoolean2;
  }
  
  private final void J(Throwable paramThrowable) {
    xq1.b(paramThrowable);
    if (this.o && !j(paramThrowable) && P(E(), paramThrowable)) {
      U(paramThrowable);
      return;
    } 
    if (paramThrowable instanceof Error)
      U(paramThrowable); 
  }
  
  private final void L(int paramInt, Future<? extends InputT> paramFuture) {
    try {
      return;
    } catch (ExecutionException executionException) {
      return;
    } finally {
      paramFuture = null;
      J((Throwable)paramFuture);
    } 
  }
  
  private final void M(zzdwy<? extends Future<? extends InputT>> paramzzdwy) {
    byte b2;
    int i = F();
    byte b1 = 0;
    if (i >= 0) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    if (b2) {
      if (i == 0) {
        if (paramzzdwy != null) {
          yr1<Future> yr1 = (yr1)paramzzdwy.iterator();
          for (b2 = b1; yr1.hasNext(); b2++) {
            Future<? extends InputT> future = yr1.next();
            if (!future.isCancelled())
              L(b2, future); 
          } 
        } 
        H();
        R();
        N(zza.c);
      } 
      return;
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Less than 0 remaining futures");
    throw illegalStateException;
  }
  
  private static boolean P(Set<Throwable> paramSet, Throwable paramThrowable) {
    while (paramThrowable != null) {
      if (!paramSet.add(paramThrowable))
        return false; 
      paramThrowable = paramThrowable.getCause();
    } 
    return true;
  }
  
  private static void U(Throwable paramThrowable) {
    String str;
    if (paramThrowable instanceof Error) {
      str = "Input Future failed with Error";
    } else {
      str = "Got more than one input Future failure. Logging failures after the first";
    } 
    m.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, paramThrowable);
  }
  
  final void I(Set<Throwable> paramSet) {
    xq1.b(paramSet);
    if (!isCancelled())
      P(paramSet, b()); 
  }
  
  void N(zza paramzza) {
    xq1.b(paramzza);
    this.n = null;
  }
  
  final void Q() {
    zzdwy zzdwy1;
    if (this.n.isEmpty()) {
      R();
      return;
    } 
    if (this.o) {
      byte b = 0;
      yr1<ot1> yr11 = (yr1)this.n.iterator();
      while (yr11.hasNext()) {
        zzdwy1 = (zzdwy)yr11.next();
        zzdwy1.a(new ns1(this, (ot1)zzdwy1, b), zzdzd.b);
        b++;
      } 
      return;
    } 
    if (this.p) {
      zzdwy1 = this.n;
    } else {
      zzdwy1 = null;
    } 
    ms1 ms1 = new ms1(this, zzdwy1);
    yr1<ot1> yr1 = (yr1)this.n.iterator();
    while (yr1.hasNext())
      ((ot1)yr1.next()).a(ms1, zzdzd.b); 
  }
  
  abstract void R();
  
  abstract void S(int paramInt, InputT paramInputT);
  
  protected final void c() {
    boolean bool2;
    super.c();
    zzdwy<? extends ot1<? extends InputT>> zzdwy1 = this.n;
    N(zza.b);
    boolean bool1 = isCancelled();
    if (zzdwy1 != null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool1 & bool2) {
      bool1 = l();
      yr1<Future> yr1 = (yr1)zzdwy1.iterator();
      while (yr1.hasNext())
        ((Future)yr1.next()).cancel(bool1); 
    } 
  }
  
  protected final String h() {
    zzdwy<? extends ot1<? extends InputT>> zzdwy1 = this.n;
    if (zzdwy1 != null) {
      String str = String.valueOf(zzdwy1);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 8);
      stringBuilder.append("futures=");
      stringBuilder.append(str);
      return stringBuilder.toString();
    } 
    return super.h();
  }
  
  enum zza {
    b, c;
    
    static {
      zza zza1 = new zza("OUTPUT_FUTURE_DONE", 0);
      b = zza1;
      zza zza2 = new zza("ALL_INPUT_FUTURES_PROCESSED", 1);
      c = zza2;
      d = new zza[] { zza1, zza2 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdyo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */