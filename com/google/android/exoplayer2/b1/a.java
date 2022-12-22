package com.google.android.exoplayer2.b1;

public abstract class a {
  private int flags;
  
  public final void addFlag(int paramInt) {
    this.flags = paramInt | this.flags;
  }
  
  public void clear() {
    this.flags = 0;
  }
  
  public final void clearFlag(int paramInt) {
    this.flags = (paramInt ^ 0xFFFFFFFF) & this.flags;
  }
  
  protected final boolean getFlag(int paramInt) {
    boolean bool;
    if ((this.flags & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean hasSupplementalData() {
    return getFlag(268435456);
  }
  
  public final boolean isDecodeOnly() {
    return getFlag(-2147483648);
  }
  
  public final boolean isEndOfStream() {
    return getFlag(4);
  }
  
  public final boolean isKeyFrame() {
    return getFlag(1);
  }
  
  public final void setFlags(int paramInt) {
    this.flags = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/b1/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */