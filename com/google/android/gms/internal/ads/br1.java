package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class br1 implements Iterable<String> {
  br1(wq1 paramwq1, CharSequence paramCharSequence) {}
  
  public final Iterator<String> iterator() {
    return wq1.d(this.c, this.b);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = oq1.b(", ").a(new StringBuilder("["), super.iterator());
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/br1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */