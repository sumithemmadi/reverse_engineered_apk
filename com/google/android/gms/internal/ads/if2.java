package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class if2 extends jf2 {
  public final long Q0;
  
  public final List<lf2> R0;
  
  public final List<if2> S0;
  
  public if2(int paramInt, long paramLong) {
    super(paramInt);
    this.Q0 = paramLong;
    this.R0 = new ArrayList<lf2>();
    this.S0 = new ArrayList<if2>();
  }
  
  public final void d(if2 paramif2) {
    this.S0.add(paramif2);
  }
  
  public final void e(lf2 paramlf2) {
    this.R0.add(paramlf2);
  }
  
  public final lf2 f(int paramInt) {
    int i = this.R0.size();
    for (byte b = 0; b < i; b++) {
      lf2 lf2 = this.R0.get(b);
      if (lf2.P0 == paramInt)
        return lf2; 
    } 
    return null;
  }
  
  public final if2 g(int paramInt) {
    int i = this.S0.size();
    for (byte b = 0; b < i; b++) {
      if2 if21 = this.S0.get(b);
      if (if21.P0 == paramInt)
        return if21; 
    } 
    return null;
  }
  
  public final String toString() {
    String str1 = jf2.c(this.P0);
    String str2 = Arrays.toString(this.R0.toArray());
    String str3 = Arrays.toString(this.S0.toArray());
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
    stringBuilder.append(str1);
    stringBuilder.append(" leaves: ");
    stringBuilder.append(str2);
    stringBuilder.append(" containers: ");
    stringBuilder.append(str3);
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/if2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */