package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

final class ar0 implements et1<ci1> {
  ar0(zq0 paramzq0) {}
  
  public final void a(Throwable paramThrowable) {
    x<Boolean> x = m0.P4;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      Matcher matcher = zq0.c().matcher(paramThrowable.getMessage());
      if (matcher.matches()) {
        String str = matcher.group(1);
        zq0.b(this.a).c(Integer.parseInt(str));
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ar0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */