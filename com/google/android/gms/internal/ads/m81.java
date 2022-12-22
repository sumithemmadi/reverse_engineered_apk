package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

public final class m81 implements a92<j81> {
  private final m92<ApplicationInfo> a;
  
  private final m92<PackageInfo> b;
  
  private m81(m92<ApplicationInfo> paramm92, m92<PackageInfo> paramm921) {
    this.a = paramm92;
    this.b = paramm921;
  }
  
  public static j81 a(ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo) {
    return new j81(paramApplicationInfo, paramPackageInfo);
  }
  
  public static m81 b(m92<ApplicationInfo> paramm92, m92<PackageInfo> paramm921) {
    return new m81(paramm92, paramm921);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */