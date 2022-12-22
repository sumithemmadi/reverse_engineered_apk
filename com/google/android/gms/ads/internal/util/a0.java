package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.zzap;

final class a0 implements q7 {
  a0(x paramx, String paramString, b0 paramb0) {}
  
  public final void a(zzap paramzzap) {
    String str2 = this.a;
    String str1 = paramzzap.toString();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str1).length());
    stringBuilder.append("Failed to load URL: ");
    stringBuilder.append(str2);
    stringBuilder.append("\n");
    stringBuilder.append(str1);
    cm.i(stringBuilder.toString());
    this.b.b(null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */