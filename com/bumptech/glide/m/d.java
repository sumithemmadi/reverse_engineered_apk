package com.bumptech.glide.m;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class d {
  private final Context a;
  
  public d(Context paramContext) {
    this.a = paramContext;
  }
  
  private static b b(String paramString) {
    try {
      Class<?> clazz = Class.forName(paramString);
      paramString = null;
      try {
        String str = (String)clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        paramString = str;
      } catch (InstantiationException instantiationException) {
        c(clazz, instantiationException);
      } catch (IllegalAccessException illegalAccessException) {
        c(clazz, illegalAccessException);
      } catch (NoSuchMethodException noSuchMethodException) {
        c(clazz, noSuchMethodException);
      } catch (InvocationTargetException invocationTargetException) {
        c(clazz, invocationTargetException);
      } 
      if (paramString instanceof b)
        return (b)paramString; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Expected instanceof GlideModule, but found: ");
      stringBuilder.append(paramString);
      throw new RuntimeException(stringBuilder.toString());
    } catch (ClassNotFoundException classNotFoundException) {
      throw new IllegalArgumentException("Unable to find GlideModule implementation", classNotFoundException);
    } 
  }
  
  private static void c(Class<?> paramClass, Exception paramException) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unable to instantiate GlideModule implementation for ");
    stringBuilder.append(paramClass);
    throw new RuntimeException(stringBuilder.toString(), paramException);
  }
  
  public List<b> a() {
    if (Log.isLoggable("ManifestParser", 3))
      Log.d("ManifestParser", "Loading Glide modules"); 
    ArrayList<b> arrayList = new ArrayList();
    try {
      ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
      if (applicationInfo.metaData == null) {
        if (Log.isLoggable("ManifestParser", 3))
          Log.d("ManifestParser", "Got null app info metadata"); 
        return arrayList;
      } 
      if (Log.isLoggable("ManifestParser", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Got app info metadata: ");
        stringBuilder.append(applicationInfo.metaData);
        Log.v("ManifestParser", stringBuilder.toString());
      } 
      for (String str : applicationInfo.metaData.keySet()) {
        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
          arrayList.add(b(str));
          if (Log.isLoggable("ManifestParser", 3)) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("Loaded Glide module: ");
            stringBuilder.append(str);
            Log.d("ManifestParser", stringBuilder.toString());
          } 
        } 
      } 
      if (Log.isLoggable("ManifestParser", 3))
        Log.d("ManifestParser", "Finished loading Glide modules"); 
      return arrayList;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      RuntimeException runtimeException = new RuntimeException("Unable to find metadata to parse GlideModules", (Throwable)nameNotFoundException);
      throw runtimeException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/m/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */