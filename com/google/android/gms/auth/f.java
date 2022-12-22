package com.google.android.gms.auth;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.a;
import com.google.android.gms.common.e;
import com.google.android.gms.common.i.a;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.t;
import java.io.IOException;

public class f {
  private static final String[] a = new String[] { "com.google", "com.google.work", "cn.google" };
  
  @SuppressLint({"InlinedApi"})
  public static final String b = "callerUid";
  
  @SuppressLint({"InlinedApi"})
  public static final String c = "androidPackageName";
  
  private static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
  
  private static final a e = new a("Auth", new String[] { "GoogleAuthUtil" });
  
  public static void a(Context paramContext, String paramString) {
    t.i("Calling this from your main thread can lead to deadlock");
    b(paramContext, 8400000);
    Bundle bundle = new Bundle();
    String str1 = (paramContext.getApplicationInfo()).packageName;
    bundle.putString("clientPackageName", str1);
    String str2 = c;
    if (!bundle.containsKey(str2))
      bundle.putString(str2, str1); 
    h h = new h(paramString, bundle);
    g(paramContext, d, h);
  }
  
  private static void b(Context paramContext, int paramInt) {
    try {
      e.a(paramContext.getApplicationContext(), paramInt);
      return;
    } catch (GooglePlayServicesRepairableException googlePlayServicesRepairableException) {
      throw new GooglePlayServicesAvailabilityException(googlePlayServicesRepairableException.getConnectionStatusCode(), googlePlayServicesRepairableException.getMessage(), googlePlayServicesRepairableException.getIntent());
    } catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
      throw new GoogleAuthException(googlePlayServicesNotAvailableException.getMessage());
    } 
  }
  
  public static String c(Context paramContext, Account paramAccount, String paramString) {
    return d(paramContext, paramAccount, paramString, new Bundle());
  }
  
  public static String d(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle) {
    k(paramAccount);
    return i(paramContext, paramAccount, paramString, paramBundle).p0();
  }
  
  @Deprecated
  public static String e(Context paramContext, String paramString1, String paramString2) {
    return c(paramContext, new Account(paramString1, "com.google"), paramString2);
  }
  
  private static <T> T g(Context paramContext, ComponentName paramComponentName, i<T> parami) {
    a a1 = new a();
    i i1 = i.c(paramContext);
    if (i1.a(paramComponentName, (ServiceConnection)a1, "GoogleAuthUtil")) {
      try {
        paramContext = (Context)parami.a(a1.a());
        i1.d(paramComponentName, (ServiceConnection)a1, "GoogleAuthUtil");
        return (T)paramContext;
      } catch (RemoteException remoteException) {
      
      } catch (InterruptedException interruptedException) {
      
      } finally {}
      e.d("GoogleAuthUtil", new Object[] { "Error on service connection.", paramContext });
      IOException iOException = new IOException();
      this("Error on service connection.", (Throwable)paramContext);
      throw iOException;
    } 
    throw new IOException("Could not bind to service.");
  }
  
  private static <T> T h(T paramT) {
    if (paramT != null)
      return paramT; 
    e.f("GoogleAuthUtil", new Object[] { "Binder call returned null." });
    throw new IOException("Service unavailable.");
  }
  
  public static TokenData i(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle) {
    t.i("Calling this from your main thread can lead to deadlock");
    t.g(paramString, "Scope cannot be empty or null.");
    k(paramAccount);
    b(paramContext, 8400000);
    if (paramBundle == null) {
      paramBundle = new Bundle();
    } else {
      paramBundle = new Bundle(paramBundle);
    } 
    String str1 = (paramContext.getApplicationInfo()).packageName;
    paramBundle.putString("clientPackageName", str1);
    String str2 = c;
    if (TextUtils.isEmpty(paramBundle.getString(str2)))
      paramBundle.putString(str2, str1); 
    paramBundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    g g = new g(paramAccount, paramString, paramBundle);
    return g(paramContext, d, g);
  }
  
  private static void k(Account paramAccount) {
    if (paramAccount != null) {
      if (!TextUtils.isEmpty(paramAccount.name)) {
        String[] arrayOfString = a;
        int i = arrayOfString.length;
        for (byte b = 0; b < i; b++) {
          if (arrayOfString[b].equals(paramAccount.type))
            return; 
        } 
        throw new IllegalArgumentException("Account type not supported");
      } 
      throw new IllegalArgumentException("Account name cannot be empty!");
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Account cannot be null");
    throw illegalArgumentException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */