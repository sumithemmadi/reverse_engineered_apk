package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.r;

public final class ih extends nh {
  private final String b;
  
  private final int c;
  
  public ih(String paramString, int paramInt) {
    this.b = paramString;
    this.c = paramInt;
  }
  
  public final int P() {
    return this.c;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null && paramObject instanceof ih) {
      paramObject = paramObject;
      if (r.a(this.b, ((ih)paramObject).b) && r.a(Integer.valueOf(this.c), Integer.valueOf(((ih)paramObject).c)))
        return true; 
    } 
    return false;
  }
  
  public final String l() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */