package com.google.android.exoplayer2.util;

public final class y {
  public static int a(int paramInt1, int paramInt2) {
    for (byte b = 1; b <= 2; b++) {
      int i = (paramInt1 + b) % 3;
      if (b(i, paramInt2))
        return i; 
    } 
    return paramInt1;
  }
  
  public static boolean b(int paramInt1, int paramInt2) {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = bool1;
    if (paramInt1 != 0) {
      if (paramInt1 != 1) {
        if (paramInt1 != 2)
          return false; 
        if ((paramInt2 & 0x2) != 0) {
          bool3 = bool2;
        } else {
          bool3 = false;
        } 
        return bool3;
      } 
      if ((paramInt2 & 0x1) != 0) {
        bool3 = bool1;
      } else {
        bool3 = false;
      } 
    } 
    return bool3;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */