package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

final class r30 implements i50, d60 {
  private final Context b;
  
  private final nh1 c;
  
  private final lf d;
  
  public r30(Context paramContext, nh1 paramnh1, lf paramlf) {
    this.b = paramContext;
    this.c = paramnh1;
    this.d = paramlf;
  }
  
  public final void D(Context paramContext) {}
  
  public final void i() {
    jf jf = this.c.X;
    if (jf != null && jf.a) {
      ArrayList<String> arrayList = new ArrayList();
      if (!this.c.X.b.isEmpty())
        arrayList.add(this.c.X.b); 
      this.d.b(this.b, arrayList);
    } 
  }
  
  public final void r(Context paramContext) {
    this.d.a();
  }
  
  public final void y(Context paramContext) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */