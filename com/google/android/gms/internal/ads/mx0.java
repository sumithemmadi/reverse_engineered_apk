package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.b;

final class mx0 implements od0 {
  private final nh1 a;
  
  private final kd b;
  
  private final boolean c;
  
  private e50 d = null;
  
  mx0(nh1 paramnh1, kd paramkd, boolean paramBoolean) {
    this.a = paramnh1;
    this.b = paramkd;
    this.c = paramBoolean;
  }
  
  public final void a(boolean paramBoolean, Context paramContext) {
    try {
      if (this.c) {
        paramBoolean = this.b.U8(b.a2(paramContext));
      } else {
        paramBoolean = this.b.a4(b.a2(paramContext));
      } 
      if (paramBoolean) {
        if (this.d == null)
          return; 
        x<Boolean> x = m0.v1;
        return;
      } 
      throw new zzcaf("Adapter failed to show.");
    } finally {
      paramContext = null;
    } 
  }
  
  public final void b(e50 parame50) {
    this.d = parame50;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */