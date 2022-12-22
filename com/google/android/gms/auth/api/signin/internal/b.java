package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.t;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class b {
  private static final Lock a = new ReentrantLock();
  
  private static b b;
  
  private final Lock c = new ReentrantLock();
  
  private final SharedPreferences d;
  
  private b(Context paramContext) {
    this.d = paramContext.getSharedPreferences("com.google.android.gms.signin", 0);
  }
  
  public static b b(Context paramContext) {
    t.j(paramContext);
    Lock lock = a;
    lock.lock();
    try {
      if (b == null) {
        b b1 = new b();
        this(paramContext.getApplicationContext());
        b = b1;
      } 
      return b;
    } finally {
      a.unlock();
    } 
  }
  
  private final void g(String paramString1, String paramString2) {
    this.c.lock();
    try {
      this.d.edit().putString(paramString1, paramString2).apply();
      return;
    } finally {
      this.c.unlock();
    } 
  }
  
  private static String h(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 1 + String.valueOf(paramString2).length());
    stringBuilder.append(paramString1);
    stringBuilder.append(":");
    stringBuilder.append(paramString2);
    return stringBuilder.toString();
  }
  
  private final GoogleSignInAccount i(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    paramString = k(h("googleSignInAccount", paramString));
    if (paramString != null)
      try {
        return GoogleSignInAccount.y0(paramString);
      } catch (JSONException jSONException) {} 
    return null;
  }
  
  private final GoogleSignInOptions j(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    paramString = k(h("googleSignInOptions", paramString));
    if (paramString != null)
      try {
        return GoogleSignInOptions.x0(paramString);
      } catch (JSONException jSONException) {} 
    return null;
  }
  
  private final String k(String paramString) {
    this.c.lock();
    try {
      paramString = this.d.getString(paramString, null);
      return paramString;
    } finally {
      this.c.unlock();
    } 
  }
  
  public void a() {
    this.c.lock();
    try {
      this.d.edit().clear().apply();
      return;
    } finally {
      this.c.unlock();
    } 
  }
  
  public GoogleSignInAccount c() {
    return i(k("defaultGoogleSignInAccount"));
  }
  
  public GoogleSignInOptions d() {
    return j(k("defaultGoogleSignInAccount"));
  }
  
  public String e() {
    return k("refreshToken");
  }
  
  public void f(GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptions paramGoogleSignInOptions) {
    t.j(paramGoogleSignInAccount);
    t.j(paramGoogleSignInOptions);
    g("defaultGoogleSignInAccount", paramGoogleSignInAccount.A0());
    t.j(paramGoogleSignInAccount);
    t.j(paramGoogleSignInOptions);
    String str = paramGoogleSignInAccount.A0();
    g(h("googleSignInAccount", str), paramGoogleSignInAccount.B0());
    g(h("googleSignInOptions", str), paramGoogleSignInOptions.D0());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */