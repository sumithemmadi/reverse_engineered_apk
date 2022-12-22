package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class f32 extends g32 {
  private int b = 0;
  
  private final int c;
  
  f32(zzejr paramzzejr) {
    this.c = paramzzejr.size();
  }
  
  public final byte b() {
    int i = this.b;
    if (i < this.c) {
      this.b = i + 1;
      return this.d.zzga(i);
    } 
    throw new NoSuchElementException();
  }
  
  public final boolean hasNext() {
    return (this.b < this.c);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */