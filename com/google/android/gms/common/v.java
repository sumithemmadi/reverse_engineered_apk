package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.j;
import java.util.concurrent.Callable;

class v {
  private static final v a = new v(true, null, null);
  
  final boolean b;
  
  private final String c;
  
  private final Throwable d;
  
  v(boolean paramBoolean, String paramString, Throwable paramThrowable) {
    this.b = paramBoolean;
    this.c = paramString;
    this.d = paramThrowable;
  }
  
  static v a() {
    return a;
  }
  
  static v b(String paramString) {
    return new v(false, paramString, null);
  }
  
  static v c(String paramString, Throwable paramThrowable) {
    return new v(false, paramString, paramThrowable);
  }
  
  static v d(Callable<String> paramCallable) {
    return new x(paramCallable, null);
  }
  
  static String e(String paramString, o paramo, boolean paramBoolean1, boolean paramBoolean2) {
    String str;
    if (paramBoolean2) {
      str = "debug cert rejected";
    } else {
      str = "not whitelisted";
    } 
    return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[] { str, paramString, j.a(a.b("SHA-1").digest(paramo.o1())), Boolean.valueOf(paramBoolean1), "12451009.false" });
  }
  
  String f() {
    return this.c;
  }
  
  final void g() {
    if (!this.b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
      if (this.d != null) {
        Log.d("GoogleCertificatesRslt", f(), this.d);
        return;
      } 
      Log.d("GoogleCertificatesRslt", f());
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */