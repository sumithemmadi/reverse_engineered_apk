package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class er1 {
  public static String a(String paramString) {
    return tq1.a(paramString);
  }
  
  public static boolean b(String paramString) {
    return tq1.b(paramString);
  }
  
  public static String c(String paramString, Object... paramVarArgs) {
    paramString = String.valueOf(paramString);
    int i = 0;
    int j;
    for (j = 0; j < paramVarArgs.length; j++)
      paramVarArgs[j] = e(paramVarArgs[j]); 
    StringBuilder stringBuilder = new StringBuilder(paramString.length() + paramVarArgs.length * 16);
    int k = 0;
    j = i;
    while (j < paramVarArgs.length) {
      i = paramString.indexOf("%s", k);
      if (i != -1) {
        stringBuilder.append(paramString, k, i);
        stringBuilder.append(paramVarArgs[j]);
        k = i + 2;
        j++;
      } 
    } 
    stringBuilder.append(paramString, k, paramString.length());
    if (j < paramVarArgs.length) {
      stringBuilder.append(" [");
      k = j + 1;
      stringBuilder.append(paramVarArgs[j]);
      for (j = k; j < paramVarArgs.length; j++) {
        stringBuilder.append(", ");
        stringBuilder.append(paramVarArgs[j]);
      } 
      stringBuilder.append(']');
    } 
    return stringBuilder.toString();
  }
  
  public static String d(String paramString) {
    return tq1.c(paramString);
  }
  
  private static String e(Object paramObject) {
    if (paramObject == null)
      return "null"; 
    try {
      return paramObject.toString();
    } catch (Exception exception) {
      String str = paramObject.getClass().getName();
      paramObject = Integer.toHexString(System.identityHashCode(paramObject));
      StringBuilder stringBuilder2 = new StringBuilder(str.length() + 1 + String.valueOf(paramObject).length());
      stringBuilder2.append(str);
      stringBuilder2.append('@');
      stringBuilder2.append((String)paramObject);
      str = stringBuilder2.toString();
      Logger logger = Logger.getLogger("com.google.common.base.Strings");
      Level level = Level.WARNING;
      paramObject = String.valueOf(str);
      if (paramObject.length() != 0) {
        paramObject = "Exception during lenientFormat for ".concat((String)paramObject);
      } else {
        paramObject = new String("Exception during lenientFormat for ");
      } 
      logger.logp(level, "com.google.common.base.Strings", "lenientToString", (String)paramObject, exception);
      paramObject = exception.getClass().getName();
      StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str).length() + 9 + paramObject.length());
      stringBuilder1.append("<");
      stringBuilder1.append(str);
      stringBuilder1.append(" threw ");
      stringBuilder1.append((String)paramObject);
      stringBuilder1.append(">");
      return stringBuilder1.toString();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/er1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */