package com.google.android.gms.internal.ads;

import java.util.Random;
import java.util.WeakHashMap;

public final class er2 {
  private static er2 a = new er2();
  
  private final sl b;
  
  private final sq2 c;
  
  private final String d;
  
  private final d0 e;
  
  private final f0 f;
  
  private final i0 g;
  
  private final zzazn h;
  
  private final Random i;
  
  private final WeakHashMap<?, String> j;
  
  protected er2() {
    this(new sl(), new sq2(new fq2(), new gq2(), new gu2(), new q5(), new yh(), new cj(), new bf(), new p5()), new d0(), new f0(), new i0(), sl.x(), new zzazn(0, 204204000, true), new Random(), new WeakHashMap<Object, String>());
  }
  
  private er2(sl paramsl, sq2 paramsq2, d0 paramd0, f0 paramf0, i0 parami0, String paramString, zzazn paramzzazn, Random paramRandom, WeakHashMap<?, String> paramWeakHashMap) {
    this.b = paramsl;
    this.c = paramsq2;
    this.e = paramd0;
    this.f = paramf0;
    this.g = parami0;
    this.d = paramString;
    this.h = paramzzazn;
    this.i = paramRandom;
    this.j = paramWeakHashMap;
  }
  
  public static sl a() {
    return a.b;
  }
  
  public static sq2 b() {
    return a.c;
  }
  
  public static f0 c() {
    return a.f;
  }
  
  public static d0 d() {
    return a.e;
  }
  
  public static i0 e() {
    return a.g;
  }
  
  public static String f() {
    return a.d;
  }
  
  public static zzazn g() {
    return a.h;
  }
  
  public static Random h() {
    return a.i;
  }
  
  public static WeakHashMap<?, String> i() {
    return a.j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/er2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */