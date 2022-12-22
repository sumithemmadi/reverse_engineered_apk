package com.google.android.gms.internal.ads;

import android.util.Log;

public final class o82 extends r82 {
  private String a;
  
  public o82(String paramString) {
    this.a = paramString;
  }
  
  public final void a(String paramString) {
    String str = this.a;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(paramString).length());
    stringBuilder.append(str);
    stringBuilder.append(":");
    stringBuilder.append(paramString);
    Log.d("isoparser", stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */