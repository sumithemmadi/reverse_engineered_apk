package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class lq1 {
  private static final ConditionVariable a = new ConditionVariable();
  
  protected static volatile ao2 b = null;
  
  private static volatile Random c = null;
  
  private z92 d;
  
  protected volatile Boolean e;
  
  public lq1(z92 paramz92) {
    this.d = paramz92;
    paramz92.r().execute(new lp1(this));
  }
  
  public static int e() {
    try {
      return (Build.VERSION.SDK_INT >= 21) ? ThreadLocalRandom.current().nextInt() : f().nextInt();
    } catch (RuntimeException runtimeException) {
      return f().nextInt();
    } 
  }
  
  private static Random f() {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/lq1.c : Ljava/util/Random;
    //   3: ifnonnull -> 39
    //   6: ldc com/google/android/gms/internal/ads/lq1
    //   8: monitorenter
    //   9: getstatic com/google/android/gms/internal/ads/lq1.c : Ljava/util/Random;
    //   12: ifnonnull -> 27
    //   15: new java/util/Random
    //   18: astore_0
    //   19: aload_0
    //   20: invokespecial <init> : ()V
    //   23: aload_0
    //   24: putstatic com/google/android/gms/internal/ads/lq1.c : Ljava/util/Random;
    //   27: ldc com/google/android/gms/internal/ads/lq1
    //   29: monitorexit
    //   30: goto -> 39
    //   33: astore_0
    //   34: ldc com/google/android/gms/internal/ads/lq1
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    //   39: getstatic com/google/android/gms/internal/ads/lq1.c : Ljava/util/Random;
    //   42: areturn
    // Exception table:
    //   from	to	target	type
    //   9	27	33	finally
    //   27	30	33	finally
    //   34	37	33	finally
  }
  
  public final void b(int paramInt1, int paramInt2, long paramLong) {
    d(paramInt1, paramInt2, paramLong, null, null);
  }
  
  public final void c(int paramInt1, int paramInt2, long paramLong, String paramString) {
    d(paramInt1, -1, paramLong, paramString, null);
  }
  
  public final void d(int paramInt1, int paramInt2, long paramLong, String paramString, Exception paramException) {
    try {
      a.block();
      if (this.e.booleanValue() && b != null) {
        zzbw$zza.b b = zzbw$zza.X().z(this.d.b.getPackageName()).y(paramLong);
        if (paramString != null)
          b.C(paramString); 
        if (paramException != null) {
          StringWriter stringWriter = new StringWriter();
          this();
          PrintWriter printWriter = new PrintWriter();
          this(stringWriter);
          p22.a(paramException, printWriter);
          b.A(stringWriter.toString()).B(paramException.getClass().getName());
        } 
        fo2 fo2 = b.a(((zzbw$zza)b.h()).g());
        fo2.c(paramInt1);
        if (paramInt2 != -1)
          fo2.b(paramInt2); 
        fo2.a();
      } 
    } catch (Exception exception) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */