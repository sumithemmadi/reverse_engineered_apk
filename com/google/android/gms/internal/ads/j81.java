package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

public final class j81 implements s91<t91<Bundle>>, t91<Bundle> {
  private final ApplicationInfo a;
  
  private final PackageInfo b;
  
  j81(ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo) {
    this.a = paramApplicationInfo;
    this.b = paramPackageInfo;
  }
  
  public final ot1<t91<Bundle>> a() {
    return dt1.h(this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */