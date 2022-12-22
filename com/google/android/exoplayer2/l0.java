package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.e;

public final class l0 {
  public static final l0 a = new l0(1.0F);
  
  public final float b;
  
  public final float c;
  
  public final boolean d;
  
  private final int e;
  
  public l0(float paramFloat) {
    this(paramFloat, 1.0F, false);
  }
  
  public l0(float paramFloat1, float paramFloat2) {
    this(paramFloat1, paramFloat2, false);
  }
  
  public l0(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    boolean bool2;
    boolean bool1 = true;
    if (paramFloat1 > 0.0F) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    if (paramFloat2 > 0.0F) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.d = paramBoolean;
    this.e = Math.round(paramFloat1 * 1000.0F);
  }
  
  public long a(long paramLong) {
    return paramLong * this.e;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || l0.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((l0)paramObject).b || this.c != ((l0)paramObject).c || this.d != ((l0)paramObject).d)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return ((527 + Float.floatToRawIntBits(this.b)) * 31 + Float.floatToRawIntBits(this.c)) * 31 + this.d;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */