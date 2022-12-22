package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class n72 implements Iterator<String> {
  private Iterator<String> b;
  
  n72(l72 paraml72) {
    this.b = l72.a(paraml72).iterator();
  }
  
  public final boolean hasNext() {
    return this.b.hasNext();
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */