package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import java.util.Map;
import java.util.concurrent.Executor;

public final class pn1 {
  private static volatile zzbw$zza.zzc a = zzbw$zza.zzc.b;
  
  private final Context b;
  
  private final Executor c;
  
  private final g<ao2> d;
  
  private pn1(Context paramContext, Executor paramExecutor, g<ao2> paramg) {
    this.b = paramContext;
    this.c = paramExecutor;
    this.d = paramg;
  }
  
  public static pn1 a(Context paramContext, Executor paramExecutor) {
    return new pn1(paramContext, paramExecutor, j.c(paramExecutor, new sn1(paramContext)));
  }
  
  private final g<Boolean> c(int paramInt, long paramLong, Exception paramException, String paramString1, Map<String, String> paramMap, String paramString2) {
    zzbw$zza.b b = zzbw$zza.X().z(this.b.getPackageName()).y(paramLong);
    b.x(a);
    if (paramException != null)
      b.A(gr1.a(paramException)).B(paramException.getClass().getName()); 
    if (paramString2 != null)
      b.C(paramString2); 
    if (paramString1 != null)
      b.D(paramString1); 
    return this.d.h(this.c, new qn1(b, paramInt));
  }
  
  static void f(zzbw$zza.zzc paramzzc) {
    a = paramzzc;
  }
  
  public final g<Boolean> b(int paramInt, long paramLong, Exception paramException) {
    return c(paramInt, paramLong, paramException, null, null, null);
  }
  
  public final g<Boolean> d(int paramInt, long paramLong, String paramString, Map<String, String> paramMap) {
    return c(paramInt, paramLong, null, paramString, null, null);
  }
  
  public final g<Boolean> g(int paramInt, long paramLong, String paramString) {
    return c(paramInt, paramLong, null, null, null, paramString);
  }
  
  public final g<Boolean> i(int paramInt, String paramString) {
    return c(paramInt, 0L, null, null, null, paramString);
  }
  
  public final g<Boolean> j(int paramInt, long paramLong) {
    return c(paramInt, paramLong, null, null, null, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */