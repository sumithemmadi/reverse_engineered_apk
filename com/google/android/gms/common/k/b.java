package com.google.android.gms.common.k;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.o;

public class b {
  private final Context a;
  
  public b(Context paramContext) {
    this.a = paramContext;
  }
  
  public int a(String paramString) {
    return this.a.checkCallingOrSelfPermission(paramString);
  }
  
  public int b(String paramString1, String paramString2) {
    return this.a.getPackageManager().checkPermission(paramString1, paramString2);
  }
  
  public ApplicationInfo c(String paramString, int paramInt) {
    return this.a.getPackageManager().getApplicationInfo(paramString, paramInt);
  }
  
  public CharSequence d(String paramString) {
    return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(paramString, 0));
  }
  
  public PackageInfo e(String paramString, int paramInt) {
    return this.a.getPackageManager().getPackageInfo(paramString, paramInt);
  }
  
  public boolean f() {
    if (Binder.getCallingUid() == Process.myUid())
      return a.a(this.a); 
    if (o.k()) {
      String str = this.a.getPackageManager().getNameForUid(Binder.getCallingUid());
      if (str != null)
        return this.a.getPackageManager().isInstantApp(str); 
    } 
    return false;
  }
  
  public final PackageInfo g(String paramString, int paramInt1, int paramInt2) {
    return this.a.getPackageManager().getPackageInfo(paramString, 64);
  }
  
  @TargetApi(19)
  public final boolean h(int paramInt, String paramString) {
    if (o.f())
      try {
        ((AppOpsManager)this.a.getSystemService("appops")).checkPackage(paramInt, paramString);
        return true;
      } catch (SecurityException securityException) {
        return false;
      }  
    String[] arrayOfString = this.a.getPackageManager().getPackagesForUid(paramInt);
    if (securityException != null && arrayOfString != null)
      for (paramInt = 0; paramInt < arrayOfString.length; paramInt++) {
        if (securityException.equals(arrayOfString[paramInt]))
          return true; 
      }  
    return false;
  }
  
  public final String[] i(int paramInt) {
    return this.a.getPackageManager().getPackagesForUid(paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */