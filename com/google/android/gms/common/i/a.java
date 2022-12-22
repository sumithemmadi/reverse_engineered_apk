package com.google.android.gms.common.i;

import android.util.Log;
import com.google.android.gms.common.internal.j;
import java.util.Locale;

public class a {
  private final String a;
  
  private final String b;
  
  private final j c;
  
  private final int d;
  
  private a(String paramString1, String paramString2) {
    this.b = paramString2;
    this.a = paramString1;
    this.c = new j(paramString1);
    byte b;
    for (b = 2; 7 >= b && !Log.isLoggable(this.a, b); b++);
    this.d = b;
  }
  
  public a(String paramString, String... paramVarArgs) {
    this(paramString, str);
  }
  
  public void a(String paramString, Object... paramVarArgs) {
    if (e(3))
      Log.d(this.a, c(paramString, paramVarArgs)); 
  }
  
  public void b(String paramString, Object... paramVarArgs) {
    Log.e(this.a, c(paramString, paramVarArgs));
  }
  
  protected String c(String paramString, Object... paramVarArgs) {
    String str = paramString;
    if (paramVarArgs != null) {
      str = paramString;
      if (paramVarArgs.length > 0)
        str = String.format(Locale.US, paramString, paramVarArgs); 
    } 
    return this.b.concat(str);
  }
  
  public void d(String paramString, Object... paramVarArgs) {
    Log.i(this.a, c(paramString, paramVarArgs));
  }
  
  public boolean e(int paramInt) {
    return (this.d <= paramInt);
  }
  
  public void f(String paramString, Object... paramVarArgs) {
    Log.w(this.a, c(paramString, paramVarArgs));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */