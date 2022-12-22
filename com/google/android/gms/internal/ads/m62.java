package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class m62 implements Iterator<zzejy> {
  private final ArrayDeque<zzeng> b;
  
  private zzejy c;
  
  private m62(zzejr paramzzejr) {
    ArrayDeque<zzeng> arrayDeque;
    if (paramzzejr instanceof zzeng) {
      zzeng zzeng = (zzeng)paramzzejr;
      arrayDeque = new ArrayDeque(zzeng.zzbgm());
      this.b = arrayDeque;
      arrayDeque.push(zzeng);
      this.c = a(zzeng.zza(zzeng));
      return;
    } 
    this.b = null;
    this.c = (zzejy)arrayDeque;
  }
  
  private final zzejy a(zzejr paramzzejr) {
    while (paramzzejr instanceof zzeng) {
      paramzzejr = paramzzejr;
      this.b.push(paramzzejr);
      paramzzejr = zzeng.zza((zzeng)paramzzejr);
    } 
    return (zzejy)paramzzejr;
  }
  
  public final boolean hasNext() {
    return (this.c != null);
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */