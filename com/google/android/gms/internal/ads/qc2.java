package com.google.android.gms.internal.ads;

public final class qc2 {
  public static final qc2 a = new qc2(1.0F, 1.0F);
  
  public final float b;
  
  public final float c;
  
  private final int d;
  
  public qc2(float paramFloat1, float paramFloat2) {
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.d = Math.round(paramFloat1 * 1000.0F);
  }
  
  public final long a(long paramLong) {
    return paramLong * this.d;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && qc2.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.b == ((qc2)paramObject).b && this.c == ((qc2)paramObject).c)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return (Float.floatToRawIntBits(this.b) + 527) * 31 + Float.floatToRawIntBits(this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */