package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

final class h62<E> extends a32<E> implements RandomAccess {
  private static final h62<Object> c;
  
  private E[] d;
  
  private int e;
  
  static {
    h62<Object> h621 = new h62((E[])new Object[0], 0);
    c = h621;
    h621.G();
  }
  
  private h62(E[] paramArrayOfE, int paramInt) {
    this.d = paramArrayOfE;
    this.e = paramInt;
  }
  
  public static <E> h62<E> c() {
    return (h62)c;
  }
  
  private final void f(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(i(paramInt));
  }
  
  private final String i(int paramInt) {
    int i = this.e;
    StringBuilder stringBuilder = new StringBuilder(35);
    stringBuilder.append("Index:");
    stringBuilder.append(paramInt);
    stringBuilder.append(", Size:");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
  
  public final void add(int paramInt, E paramE) {
    a();
    if (paramInt >= 0) {
      int i = this.e;
      if (paramInt <= i) {
        E[] arrayOfE = this.d;
        if (i < arrayOfE.length) {
          System.arraycopy(arrayOfE, paramInt, arrayOfE, paramInt + 1, i - paramInt);
        } else {
          Object[] arrayOfObject = new Object[i * 3 / 2 + 1];
          System.arraycopy(arrayOfE, 0, arrayOfObject, 0, paramInt);
          System.arraycopy(this.d, paramInt, arrayOfObject, paramInt + 1, this.e - paramInt);
          this.d = (E[])arrayOfObject;
        } 
        this.d[paramInt] = paramE;
        this.e++;
        this.modCount++;
        return;
      } 
    } 
    throw new IndexOutOfBoundsException(i(paramInt));
  }
  
  public final boolean add(E paramE) {
    a();
    int i = this.e;
    E[] arrayOfE = this.d;
    if (i == arrayOfE.length)
      this.d = Arrays.copyOf(arrayOfE, i * 3 / 2 + 1); 
    arrayOfE = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfE[i] = paramE;
    this.modCount++;
    return true;
  }
  
  public final E get(int paramInt) {
    f(paramInt);
    return this.d[paramInt];
  }
  
  public final E remove(int paramInt) {
    a();
    f(paramInt);
    E[] arrayOfE = this.d;
    E e = arrayOfE[paramInt];
    int i = this.e;
    if (paramInt < i - 1)
      System.arraycopy(arrayOfE, paramInt + 1, arrayOfE, paramInt, i - paramInt - 1); 
    this.e--;
    this.modCount++;
    return e;
  }
  
  public final E set(int paramInt, E paramE) {
    a();
    f(paramInt);
    E[] arrayOfE = this.d;
    E e = arrayOfE[paramInt];
    arrayOfE[paramInt] = paramE;
    this.modCount++;
    return e;
  }
  
  public final int size() {
    return this.e;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */