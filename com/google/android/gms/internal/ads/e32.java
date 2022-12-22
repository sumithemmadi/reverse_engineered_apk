package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class e32 extends a32<Boolean> implements u42<Boolean>, g62, RandomAccess {
  private static final e32 c;
  
  private boolean[] d;
  
  private int e;
  
  static {
    e32 e321 = new e32(new boolean[0], 0);
    c = e321;
    e321.G();
  }
  
  e32() {
    this(new boolean[10], 0);
  }
  
  private e32(boolean[] paramArrayOfboolean, int paramInt) {
    this.d = paramArrayOfboolean;
    this.e = paramInt;
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
  
  public final boolean addAll(Collection<? extends Boolean> paramCollection) {
    a();
    m42.a(paramCollection);
    if (!(paramCollection instanceof e32))
      return super.addAll(paramCollection); 
    e32 e321 = (e32)paramCollection;
    int i = e321.e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      j += i;
      boolean[] arrayOfBoolean = this.d;
      if (j > arrayOfBoolean.length)
        this.d = Arrays.copyOf(arrayOfBoolean, j); 
      System.arraycopy(e321.d, 0, this.d, this.e, e321.e);
      this.e = j;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final void c(boolean paramBoolean) {
    a();
    int i = this.e;
    boolean[] arrayOfBoolean = this.d;
    if (i == arrayOfBoolean.length) {
      boolean[] arrayOfBoolean1 = new boolean[i * 3 / 2 + 1];
      System.arraycopy(arrayOfBoolean, 0, arrayOfBoolean1, 0, i);
      this.d = arrayOfBoolean1;
    } 
    arrayOfBoolean = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfBoolean[i] = paramBoolean;
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof e32))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((e32)paramObject).e)
      return false; 
    paramObject = ((e32)paramObject).d;
    for (byte b = 0; b < this.e; b++) {
      if (this.d[b] != paramObject[b])
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int i = 1;
    for (byte b = 0; b < this.e; b++)
      i = i * 31 + m42.e(this.d[b]); 
    return i;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Boolean))
      return -1; 
    boolean bool = ((Boolean)paramObject).booleanValue();
    int i = size();
    for (byte b = 0; b < i; b++) {
      if (this.d[b] == bool)
        return b; 
    } 
    return -1;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2) {
    a();
    if (paramInt2 >= paramInt1) {
      boolean[] arrayOfBoolean = this.d;
      System.arraycopy(arrayOfBoolean, paramInt2, arrayOfBoolean, paramInt1, this.e - paramInt2);
      this.e -= paramInt2 - paramInt1;
      this.modCount++;
      return;
    } 
    throw new IndexOutOfBoundsException("toIndex < fromIndex");
  }
  
  public final int size() {
    return this.e;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/e32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */