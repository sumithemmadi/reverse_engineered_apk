package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

class mr1<E> extends lr1<E> {
  Object[] a;
  
  int b;
  
  boolean c;
  
  mr1(int paramInt) {
    ir1.b(paramInt, "initialCapacity");
    this.a = new Object[paramInt];
    this.b = 0;
  }
  
  private final void e(int paramInt) {
    Object[] arrayOfObject = this.a;
    if (arrayOfObject.length < paramInt) {
      int i = arrayOfObject.length;
      if (paramInt >= 0) {
        int j = i + (i >> 1) + 1;
        i = j;
        if (j < paramInt)
          i = Integer.highestOneBit(paramInt - 1) << 1; 
        paramInt = i;
        if (i < 0)
          paramInt = Integer.MAX_VALUE; 
        this.a = Arrays.copyOf(arrayOfObject, paramInt);
        this.c = false;
        return;
      } 
      throw new AssertionError("cannot store more than MAX_VALUE elements");
    } 
    if (this.c) {
      this.a = (Object[])arrayOfObject.clone();
      this.c = false;
    } 
  }
  
  public lr1<E> c(Iterable<? extends E> paramIterable) {
    if (paramIterable instanceof Collection) {
      Collection collection = (Collection)paramIterable;
      e(this.b + collection.size());
      if (collection instanceof zzdwy) {
        this.b = ((zzdwy)collection).zza(this.a, this.b);
        return this;
      } 
    } 
    super.c(paramIterable);
    return this;
  }
  
  public mr1<E> d(E paramE) {
    xq1.b(paramE);
    e(this.b + 1);
    Object[] arrayOfObject = this.a;
    int i = this.b;
    this.b = i + 1;
    arrayOfObject[i] = paramE;
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */