package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.d1;
import java.util.ArrayList;

public final class w71 implements s91<x71> {
  private final nt1 a;
  
  private final gi1 b;
  
  private final PackageInfo c;
  
  private final d1 d;
  
  public w71(nt1 paramnt1, gi1 paramgi1, PackageInfo paramPackageInfo, d1 paramd1) {
    this.a = paramnt1;
    this.b = paramgi1;
    this.c = paramPackageInfo;
    this.d = paramd1;
  }
  
  public final ot1<x71> a() {
    return this.a.a(new z71(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */