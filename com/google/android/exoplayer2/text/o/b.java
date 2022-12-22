package com.google.android.exoplayer2.text.o;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;

final class b {
  public final int a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  private b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
  }
  
  public static b a(String paramString) {
    e.a(paramString.startsWith("Format:"));
    String[] arrayOfString = TextUtils.split(paramString.substring(7), ",");
    byte b1 = 0;
    byte b2 = -1;
    byte b3 = -1;
    byte b4 = -1;
    byte b5 = -1;
    while (b1 < arrayOfString.length) {
      byte b6;
      paramString = h0.u0(arrayOfString[b1].trim());
      paramString.hashCode();
      switch (paramString.hashCode()) {
        default:
          b6 = -1;
          break;
        case 109780401:
          if (paramString.equals("style")) {
            b6 = 3;
            break;
          } 
        case 109757538:
          if (paramString.equals("start")) {
            b6 = 2;
            break;
          } 
        case 3556653:
          if (paramString.equals("text")) {
            b6 = 1;
            break;
          } 
        case 100571:
          if (paramString.equals("end")) {
            b6 = 0;
            break;
          } 
      } 
      switch (b6) {
        case 3:
          b4 = b1;
          break;
        case 2:
          b2 = b1;
          break;
        case 1:
          b5 = b1;
          break;
        case 0:
          b3 = b1;
          break;
      } 
      b1++;
    } 
    if (b2 != -1 && b3 != -1) {
      b b6 = new b(b2, b3, b4, b5, arrayOfString.length);
    } else {
      paramString = null;
    } 
    return (b)paramString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/o/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */