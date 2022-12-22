package com.google.android.play.core.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class a {
  private final String a;
  
  public a(String paramString) {
    int i = Process.myUid();
    int j = Process.myPid();
    StringBuilder stringBuilder = new StringBuilder(39);
    stringBuilder.append("UID: [");
    stringBuilder.append(i);
    stringBuilder.append("]  PID: [");
    stringBuilder.append(j);
    stringBuilder.append("] ");
    String str = String.valueOf(stringBuilder.toString());
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0) {
      paramString = str.concat(paramString);
    } else {
      paramString = new String(str);
    } 
    this.a = paramString;
  }
  
  private final int f(int paramInt, String paramString, Object[] paramArrayOfObject) {
    return Log.isLoggable("PlayCore", paramInt) ? Log.i("PlayCore", g(this.a, paramString, paramArrayOfObject)) : 0;
  }
  
  private static String g(String paramString1, String paramString2, Object... paramVarArgs) {
    String str = paramString2;
    if (paramVarArgs.length > 0)
      try {
        str = String.format(Locale.US, paramString2, paramVarArgs);
      } catch (IllegalFormatException illegalFormatException) {
        str = String.valueOf(paramString2);
        if (str.length() != 0) {
          str = "Unable to format ".concat(str);
        } else {
          str = new String("Unable to format ");
        } 
        Log.e("PlayCore", str, illegalFormatException);
        String str1 = TextUtils.join(", ", paramVarArgs);
        StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(paramString2).length() + 3 + String.valueOf(str1).length());
        stringBuilder1.append(paramString2);
        stringBuilder1.append(" [");
        stringBuilder1.append(str1);
        stringBuilder1.append("]");
        str = stringBuilder1.toString();
      }  
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 3 + String.valueOf(str).length());
    stringBuilder.append(paramString1);
    stringBuilder.append(" : ");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public final void a(String paramString, Object... paramVarArgs) {
    f(3, paramString, paramVarArgs);
  }
  
  public final void b(String paramString, Object... paramVarArgs) {
    f(6, paramString, paramVarArgs);
  }
  
  public final void c(Throwable paramThrowable, String paramString, Object... paramVarArgs) {
    if (Log.isLoggable("PlayCore", 6))
      Log.e("PlayCore", g(this.a, paramString, paramVarArgs), paramThrowable); 
  }
  
  public final void d(String paramString, Object... paramVarArgs) {
    f(4, paramString, paramVarArgs);
  }
  
  public final void e(String paramString, Object... paramVarArgs) {
    f(5, paramString, paramVarArgs);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */