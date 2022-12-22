package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.util.v;

public final class i {
  public final int a;
  
  public final int b;
  
  public final String c;
  
  private i(int paramInt1, int paramInt2, String paramString) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
  }
  
  public static i a(v paramv) {
    String str;
    paramv.N(2);
    int j = paramv.z();
    int k = j >> 1;
    j = paramv.z() >> 3 & 0x1F | (j & 0x1) << 5;
    if (k == 4 || k == 5 || k == 7) {
      str = "dvhe";
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append(".0");
      stringBuilder1.append(k);
      stringBuilder1.append(".0");
      stringBuilder1.append(j);
      return new i(k, j, stringBuilder1.toString());
    } 
    if (k == 8) {
      str = "hev1";
    } else if (k == 9) {
      str = "avc3";
    } else {
      return null;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(".0");
    stringBuilder.append(k);
    stringBuilder.append(".0");
    stringBuilder.append(j);
    return new i(k, j, stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */