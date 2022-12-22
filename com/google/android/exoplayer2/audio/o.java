package com.google.android.exoplayer2.audio;

public final class o {
  public final int a;
  
  public final float b;
  
  public o(int paramInt, float paramFloat) {
    this.a = paramInt;
    this.b = paramFloat;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || o.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.a != ((o)paramObject).a || Float.compare(((o)paramObject).b, this.b) != 0)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return (527 + this.a) * 31 + Float.floatToIntBits(this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */