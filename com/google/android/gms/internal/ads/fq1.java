package com.google.android.gms.internal.ads;

public abstract class fq1 {
  public static fq1 b(char paramChar) {
    return new hq1(paramChar);
  }
  
  private static String d(char paramChar) {
    char[] arrayOfChar = new char[6];
    arrayOfChar[0] = '\\';
    arrayOfChar[1] = 'u';
    arrayOfChar[2] = Character.MIN_VALUE;
    arrayOfChar[3] = Character.MIN_VALUE;
    arrayOfChar[4] = Character.MIN_VALUE;
    arrayOfChar[5] = Character.MIN_VALUE;
    for (byte b = 0; b < 4; b++) {
      arrayOfChar[5 - b] = "0123456789ABCDEF".charAt(paramChar & 0xF);
      paramChar = (char)(paramChar >> 4);
    } 
    return String.copyValueOf(arrayOfChar);
  }
  
  public int a(CharSequence paramCharSequence, int paramInt) {
    int i = paramCharSequence.length();
    xq1.e(paramInt, i, "index");
    while (paramInt < i) {
      if (c(paramCharSequence.charAt(paramInt)))
        return paramInt; 
      paramInt++;
    } 
    return -1;
  }
  
  public abstract boolean c(char paramChar);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */