package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

final class u92 implements np1 {
  private final un1 a;
  
  private final go1 b;
  
  private final ga2 c;
  
  private final zzfa d;
  
  u92(un1 paramun1, go1 paramgo1, ga2 paramga2, zzfa paramzzfa) {
    this.a = paramun1;
    this.b = paramgo1;
    this.c = paramga2;
    this.d = paramzzfa;
  }
  
  private final Map<String, Object> e() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    zzcf$zza zzcf$zza = this.b.g();
    hashMap.put("v", this.a.a());
    hashMap.put("gms", Boolean.valueOf(this.a.d()));
    hashMap.put("int", zzcf$zza.j0());
    hashMap.put("up", Boolean.valueOf(this.d.a()));
    hashMap.put("t", new Throwable());
    return (Map)hashMap;
  }
  
  public final Map<String, Object> a() {
    Map<String, Object> map = e();
    map.put("lts", Long.valueOf(this.c.e()));
    return map;
  }
  
  public final Map<String, Object> b() {
    Map<String, Object> map = e();
    zzcf$zza zzcf$zza = this.b.c();
    map.put("gai", Boolean.valueOf(this.a.b()));
    map.put("did", zzcf$zza.t0());
    map.put("dst", Integer.valueOf(zzcf$zza.v0().zzv()));
    map.put("doo", Boolean.valueOf(zzcf$zza.w0()));
    return map;
  }
  
  public final Map<String, Object> c() {
    return e();
  }
  
  final void d(View paramView) {
    this.c.g(paramView);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */