package com.google.android.play.core.internal;

import android.os.Build;
import java.io.File;

public final class t {
  public static s a() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      switch (i) {
        default:
          return new x(null);
        case 27:
          if (Build.VERSION.PREVIEW_SDK_INT == 0)
            return new x(null); 
        case 26:
          return new x(null);
        case 25:
          return new x(null);
        case 24:
          return new x(null);
        case 23:
          return new x(null);
        case 22:
          return new x();
        case 21:
          break;
      } 
      return new x(null);
    } 
    throw new AssertionError("Unsupported Android Version");
  }
  
  public static String b(File paramFile) {
    if (paramFile.getName().endsWith(".apk")) {
      String str2 = paramFile.getName();
      String str1 = "";
      String str3 = str2.replaceFirst("(_\\d+)?\\.apk", "");
      if (str3.equals("base-master"))
        return ""; 
      str2 = "base-";
      if (str3.startsWith("base-")) {
        str1 = "config.";
        return str3.replace(str2, str1);
      } 
      str3 = str3.replace("-", ".config.");
      str2 = ".config.master";
      return str3.replace(str2, str1);
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Non-apk found in splits directory.");
    throw illegalArgumentException;
  }
  
  public static void c(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  public static <T> void d(T paramT, Object paramObject) {
    if (paramT != null)
      return; 
    throw new NullPointerException((String)paramObject);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */