package com.bumptech.glide.o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.c;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class b {
  private static final ConcurrentMap<String, c> a = new ConcurrentHashMap<String, c>();
  
  private static PackageInfo a(Context paramContext) {
    try {
      return paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot resolve info for");
      stringBuilder.append(paramContext.getPackageName());
      Log.e("AppVersionSignature", stringBuilder.toString(), (Throwable)nameNotFoundException);
      return null;
    } 
  }
  
  private static String b(PackageInfo paramPackageInfo) {
    String str;
    if (paramPackageInfo != null) {
      str = String.valueOf(paramPackageInfo.versionCode);
    } else {
      str = UUID.randomUUID().toString();
    } 
    return str;
  }
  
  public static c c(Context paramContext) {
    String str = paramContext.getPackageName();
    ConcurrentMap<String, c> concurrentMap = a;
    c c1 = concurrentMap.get(str);
    c c2 = c1;
    if (c1 == null) {
      c2 = d(paramContext);
      c c = concurrentMap.putIfAbsent(str, c2);
      if (c != null)
        c2 = c; 
    } 
    return c2;
  }
  
  private static c d(Context paramContext) {
    return new d(b(a(paramContext)));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/o/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */