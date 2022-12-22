package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.regex.Pattern;

public final class o0 {
  public static boolean a(String paramString) {
    x<String> x = m0.U3;
    return b(er2.e().<String>c(x), paramString);
  }
  
  private static boolean b(String paramString1, String paramString2) {
    if (paramString1 != null && paramString2 != null)
      try {
        return Pattern.matches(paramString1, paramString2);
      } catch (RuntimeException runtimeException) {
        q.g().e(runtimeException, "NonagonUtil.isPatternMatched");
      }  
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */