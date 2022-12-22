package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

public final class na1 implements s91<oa1> {
  private final bl a;
  
  private final Executor b;
  
  private final String c;
  
  private final PackageInfo d;
  
  private final int e;
  
  public na1(bl parambl, Executor paramExecutor, String paramString, PackageInfo paramPackageInfo, int paramInt) {
    this.a = parambl;
    this.b = paramExecutor;
    this.c = paramString;
    this.d = paramPackageInfo;
    this.e = paramInt;
  }
  
  public final ot1<oa1> a() {
    return dt1.l(dt1.j(this.a.a(this.c, this.d, this.e), qa1.a, this.b), Throwable.class, new pa1(this), this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/na1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */