package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r0;
import com.google.android.gms.common.k.c;
import com.google.android.gms.common.util.i;

public class c {
  public static final int a = e.a;
  
  private static final c b = new c();
  
  public static c f() {
    return b;
  }
  
  private static String k(Context paramContext, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("gcore_");
    stringBuilder.append(a);
    stringBuilder.append("-");
    if (!TextUtils.isEmpty(paramString))
      stringBuilder.append(paramString); 
    stringBuilder.append("-");
    if (paramContext != null)
      stringBuilder.append(paramContext.getPackageName()); 
    stringBuilder.append("-");
    if (paramContext != null)
      try {
        stringBuilder.append((c.a(paramContext).e(paramContext.getPackageName(), 0)).versionCode);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {} 
    return stringBuilder.toString();
  }
  
  public int a(Context paramContext) {
    return e.b(paramContext);
  }
  
  public Intent b(Context paramContext, int paramInt, String paramString) {
    return (paramInt != 1 && paramInt != 2) ? ((paramInt != 3) ? null : r0.b("com.google.android.gms")) : ((paramContext != null && i.f(paramContext)) ? r0.a() : r0.c("com.google.android.gms", k(paramContext, paramString)));
  }
  
  public PendingIntent c(Context paramContext, int paramInt1, int paramInt2) {
    return d(paramContext, paramInt1, paramInt2, null);
  }
  
  public PendingIntent d(Context paramContext, int paramInt1, int paramInt2, String paramString) {
    Intent intent = b(paramContext, paramInt1, paramString);
    return (intent == null) ? null : PendingIntent.getActivity(paramContext, paramInt2, intent, 134217728);
  }
  
  public String e(int paramInt) {
    return e.c(paramInt);
  }
  
  public int g(Context paramContext) {
    return h(paramContext, a);
  }
  
  public int h(Context paramContext, int paramInt) {
    int i = e.g(paramContext, paramInt);
    paramInt = i;
    if (e.h(paramContext, i))
      paramInt = 18; 
    return paramInt;
  }
  
  public boolean i(Context paramContext, String paramString) {
    return e.m(paramContext, paramString);
  }
  
  public boolean j(int paramInt) {
    return e.j(paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */