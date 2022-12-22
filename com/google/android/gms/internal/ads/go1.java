package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class go1 {
  private final Context a;
  
  private final Executor b;
  
  private final pn1 c;
  
  private final un1 d;
  
  private final lo1 e;
  
  private final lo1 f;
  
  private g<zzcf$zza> g;
  
  private g<zzcf$zza> h;
  
  private go1(Context paramContext, Executor paramExecutor, pn1 parampn1, un1 paramun1, ko1 paramko1, jo1 paramjo1) {
    this.a = paramContext;
    this.b = paramExecutor;
    this.c = parampn1;
    this.d = paramun1;
    this.e = paramko1;
    this.f = paramjo1;
  }
  
  private static zzcf$zza a(g<zzcf$zza> paramg, zzcf$zza paramzzcf$zza) {
    return !paramg.o() ? paramzzcf$zza : (zzcf$zza)paramg.k();
  }
  
  public static go1 b(Context paramContext, Executor paramExecutor, pn1 parampn1, un1 paramun1) {
    go1 go11 = new go1(paramContext, paramExecutor, parampn1, paramun1, new ko1(), new jo1());
    if (go11.d.b()) {
      go11.g = go11.h(new fo1(go11));
    } else {
      go11.g = j.e(go11.e.a());
    } 
    go11.h = go11.h(new io1(go11));
    return go11;
  }
  
  private final g<zzcf$zza> h(Callable<zzcf$zza> paramCallable) {
    return j.c(this.b, paramCallable).d(this.b, new ho1(this));
  }
  
  public final zzcf$zza c() {
    return a(this.g, this.e.a());
  }
  
  public final zzcf$zza g() {
    return a(this.h, this.f.a());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/go1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */