package com.google.android.gms.internal.ads;

final class hq1 extends eq1 {
  private final char a;
  
  hq1(char paramChar) {
    this.a = (char)paramChar;
  }
  
  public final boolean c(char paramChar) {
    return (paramChar == this.a);
  }
  
  public final String toString() {
    String str = fq1.e(this.a);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 18);
    stringBuilder.append("CharMatcher.is('");
    stringBuilder.append(str);
    stringBuilder.append("')");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */