package com.google.android.datatransport.cct;

public final class e {
  static String a(String paramString1, String paramString2) {
    int i = paramString1.length() - paramString2.length();
    if (i >= 0 && i <= 1) {
      StringBuilder stringBuilder = new StringBuilder(paramString1.length() + paramString2.length());
      for (i = 0; i < paramString1.length(); i++) {
        stringBuilder.append(paramString1.charAt(i));
        if (paramString2.length() > i)
          stringBuilder.append(paramString2.charAt(i)); 
      } 
      return stringBuilder.toString();
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid input received");
    throw illegalArgumentException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */