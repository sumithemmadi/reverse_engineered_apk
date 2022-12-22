package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class vy0 {
  private final e a;
  
  private final xy0 b;
  
  private final List<String> c = Collections.synchronizedList(new ArrayList<String>());
  
  private final boolean d;
  
  private final nv0 e;
  
  public vy0(e parame, xy0 paramxy0, nv0 paramnv0) {
    this.a = parame;
    this.b = paramxy0;
    x<Boolean> x = m0.r5;
    this.d = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
    this.e = paramnv0;
  }
  
  private final void d(String paramString1, int paramInt, long paramLong, String paramString2) {
    String str1;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 33);
    stringBuilder.append(paramString1);
    stringBuilder.append(".");
    stringBuilder.append(paramInt);
    stringBuilder.append(".");
    stringBuilder.append(paramLong);
    String str2 = stringBuilder.toString();
    paramString1 = str2;
    if (!TextUtils.isEmpty(paramString2)) {
      StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(paramString2).length());
      stringBuilder1.append(str2);
      stringBuilder1.append(".");
      stringBuilder1.append(paramString2);
      str1 = stringBuilder1.toString();
    } 
    this.c.add(str1);
  }
  
  final <T> ot1<T> b(sh1 paramsh1, nh1 paramnh1, ot1<T> paramot1) {
    long l = this.a.b();
    String str = paramnh1.v;
    if (str != null)
      dt1.g(paramot1, new uy0(this, l, str, paramnh1, paramsh1), fm.f); 
    return paramot1;
  }
  
  public final String e() {
    return TextUtils.join("_", this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */