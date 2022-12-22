package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPrivateKey;

public final class k12 implements ku1 {
  private static final byte[] a = new byte[0];
  
  private final ECPrivateKey b;
  
  private final m12 c;
  
  private final String d;
  
  private final byte[] e;
  
  private final zzeic f;
  
  private final h12 g;
  
  public k12(ECPrivateKey paramECPrivateKey, byte[] paramArrayOfbyte, String paramString, zzeic paramzzeic, h12 paramh12) {
    this.b = paramECPrivateKey;
    this.c = new m12(paramECPrivateKey);
    this.e = paramArrayOfbyte;
    this.d = paramString;
    this.f = paramzzeic;
    this.g = paramh12;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */