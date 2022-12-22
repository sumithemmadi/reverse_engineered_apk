package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class j52 extends a32<Long> implements v42, g62, RandomAccess {
  private static final j52 c;
  
  private long[] d;
  
  private int e;
  
  static {
    j52 j521 = new j52(new long[0], 0);
    c = j521;
    j521.G();
  }
  
  j52() {
    this(new long[10], 0);
  }
  
  private j52(long[] paramArrayOflong, int paramInt) {
    this.d = paramArrayOflong;
    this.e = paramInt;
  }
  
  public static j52 f() {
    return c;
  }
  
  private final void j(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(k(paramInt));
  }
  
  private final String k(int paramInt) {
    int i = this.e;
    StringBuilder stringBuilder = new StringBuilder(35);
    stringBuilder.append("Index:");
    stringBuilder.append(paramInt);
    stringBuilder.append(", Size:");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
  
  public final boolean addAll(Collection<? extends Long> paramCollection) {
    a();
    m42.a(paramCollection);
    if (!(paramCollection instanceof j52))
      return super.addAll(paramCollection); 
    j52 j521 = (j52)paramCollection;
    int i = j521.e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      j += i;
      long[] arrayOfLong = this.d;
      if (j > arrayOfLong.length)
        this.d = Arrays.copyOf(arrayOfLong, j); 
      System.arraycopy(j521.d, 0, this.d, this.e, j521.e);
      this.e = j;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final long c(int paramInt) {
    j(paramInt);
    return this.d[paramInt];
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof j52))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((j52)paramObject).e)
      return false; 
    paramObject = ((j52)paramObject).d;
    for (byte b = 0; b < this.e; b++) {
      if (this.d[b] != paramObject[b])
        return false; 
    } 
    return true;
  }
  
  public final v42 g(int paramInt) {
    if (paramInt >= this.e)
      return new j52(Arrays.copyOf(this.d, paramInt), this.e); 
    throw new IllegalArgumentException();
  }
  
  public final int hashCode() {
    int i = 1;
    for (byte b = 0; b < this.e; b++)
      i = i * 31 + m42.g(this.d[b]); 
    return i;
  }
  
  public final void i(long paramLong) {
    a();
    int i = this.e;
    long[] arrayOfLong = this.d;
    if (i == arrayOfLong.length) {
      long[] arrayOfLong1 = new long[i * 3 / 2 + 1];
      System.arraycopy(arrayOfLong, 0, arrayOfLong1, 0, i);
      this.d = arrayOfLong1;
    } 
    arrayOfLong = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfLong[i] = paramLong;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Long))
      return -1; 
    long l = ((Long)paramObject).longValue();
    int i = size();
    for (byte b = 0; b < i; b++) {
      if (this.d[b] == l)
        return b; 
    } 
    return -1;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2) {
    a();
    if (paramInt2 >= paramInt1) {
      long[] arrayOfLong = this.d;
      System.arraycopy(arrayOfLong, paramInt2, arrayOfLong, paramInt1, this.e - paramInt2);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */