package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class l62 extends g32 {
  private final m62 b;
  
  private j32 c;
  
  l62(zzeng paramzzeng) {
    this.b = new m62(paramzzeng, null);
    this.c = a();
  }
  
  private final j32 a() {
    return this.b.hasNext() ? (j32)((zzejy)this.b.next()).iterator() : null;
  }
  
  public final byte b() {
    j32 j321 = this.c;
    if (j321 != null) {
      byte b = j321.b();
      if (!this.c.hasNext())
        this.c = a(); 
      return b;
    } 
    throw new NoSuchElementException();
  }
  
  public final boolean hasNext() {
    return (this.c != null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */