package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class mo0 {
  private final Map<String, String> a = new ConcurrentHashMap<String, String>();
  
  mo0(jo0 paramjo0) {}
  
  private final mo0 b() {
    this.a.putAll(jo0.a(this.b));
    return this;
  }
  
  public final mo0 a(sh1 paramsh1) {
    this.a.put("gqi", paramsh1.b);
    return this;
  }
  
  public final void c() {
    jo0.c(this.b).execute(new lo0(this));
  }
  
  public final String d() {
    return jo0.d(this.b).c(this.a);
  }
  
  public final mo0 g(nh1 paramnh1) {
    this.a.put("aai", paramnh1.v);
    return this;
  }
  
  public final mo0 h(String paramString1, String paramString2) {
    this.a.put(paramString1, paramString2);
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */