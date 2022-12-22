package com.google.android.gms.internal.ads;

public final class cq1 {
  private static int a(char paramChar) {
    return (char)((paramChar | 0x20) - 97);
  }
  
  public static boolean b(CharSequence paramCharSequence1, CharSequence paramCharSequence2) {
    int i = paramCharSequence1.length();
    if (paramCharSequence1 == paramCharSequence2)
      return true; 
    if (i != paramCharSequence2.length())
      return false; 
    for (byte b = 0; b < i; b++) {
      char c1 = paramCharSequence1.charAt(b);
      char c2 = paramCharSequence2.charAt(b);
      if (c1 != c2) {
        int j = a(c1);
        if (j >= 26 || j != a(c2))
          return false; 
      } 
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */