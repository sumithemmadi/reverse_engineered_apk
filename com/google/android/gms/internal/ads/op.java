package com.google.android.gms.internal.ads;

public final class op implements cq {
  public final up a(eo parameo, int paramInt, String paramString, bo parambo) {
    if (paramInt > 0) {
      paramInt = ap.L();
      return (up)((paramInt < parambo.h) ? new jq(parameo, parambo) : ((paramInt < parambo.b) ? new gq(parameo, parambo) : new eq(parameo)));
    } 
    return new fq(parameo);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/op.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */