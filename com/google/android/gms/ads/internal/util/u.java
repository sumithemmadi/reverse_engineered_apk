package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

public final class u {
  private final List<String> a = new ArrayList<String>();
  
  private final List<Double> b = new ArrayList<Double>();
  
  private final List<Double> c = new ArrayList<Double>();
  
  public final u a(String paramString, double paramDouble1, double paramDouble2) {
    byte b = 0;
    while (b < this.a.size()) {
      double d1 = ((Double)this.c.get(b)).doubleValue();
      double d2 = ((Double)this.b.get(b)).doubleValue();
      if (paramDouble1 >= d1 && (d1 != paramDouble1 || paramDouble2 >= d2))
        b++; 
    } 
    this.a.add(b, paramString);
    this.c.add(b, Double.valueOf(paramDouble1));
    this.b.add(b, Double.valueOf(paramDouble2));
    return this;
  }
  
  public final t e() {
    return new t(this, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */