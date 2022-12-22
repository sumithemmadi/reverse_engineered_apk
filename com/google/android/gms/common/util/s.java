package com.google.android.gms.common.util;

import java.util.regex.Pattern;

public class s {
  private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");
  
  public static boolean a(String paramString) {
    return (paramString == null || paramString.trim().isEmpty());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */