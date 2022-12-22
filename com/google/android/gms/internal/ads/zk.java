package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.v.a;

public final class zk implements bl {
  public final ot1<String> a(String paramString, PackageInfo paramPackageInfo, int paramInt) {
    return dt1.h(paramString);
  }
  
  public final ot1<String> b(Context paramContext, int paramInt) {
    return dt1.h(null);
  }
  
  public final ot1<a.a> c(Context paramContext, int paramInt) {
    sm<a.a> sm = new sm();
    er2.a();
    if (sl.l(paramContext))
      fm.a.execute(new cl(this, paramContext, sm)); 
    return sm;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */