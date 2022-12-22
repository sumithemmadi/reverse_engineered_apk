package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class n42 extends a32<Integer> implements q42, g62, RandomAccess {
  private static final n42 c;
  
  private int[] d;
  
  private int e;
  
  static {
    n42 n421 = new n42(new int[0], 0);
    c = n421;
    n421.G();
  }
  
  n42() {
    this(new int[10], 0);
  }
  
  private n42(int[] paramArrayOfint, int paramInt) {
    this.d = paramArrayOfint;
    this.e = paramInt;
  }
  
  public static n42 f() {
    return c;
  }
  
  private final void i(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(j(paramInt));
  }
  
  private final String j(int paramInt) {
    int i = this.e;
    StringBuilder stringBuilder = new StringBuilder(35);
    stringBuilder.append("Index:");
    stringBuilder.append(paramInt);
    stringBuilder.append(", Size:");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
  
  public final q42 F(int paramInt) {
    if (paramInt >= this.e)
      return new n42(Arrays.copyOf(this.d, paramInt), this.e); 
    throw new IllegalArgumentException();
  }
  
  public final void M(int paramInt) {
    a();
    int i = this.e;
    int[] arrayOfInt1 = this.d;
    if (i == arrayOfInt1.length) {
      int[] arrayOfInt = new int[i * 3 / 2 + 1];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt, 0, i);
      this.d = arrayOfInt;
    } 
    int[] arrayOfInt2 = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfInt2[i] = paramInt;
  }
  
  public final boolean addAll(Collection<? extends Integer> paramCollection) {
    a();
    m42.a(paramCollection);
    if (!(paramCollection instanceof n42))
      return super.addAll(paramCollection); 
    paramCollection = paramCollection;
    int i = ((n42)paramCollection).e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      int[] arrayOfInt = this.d;
      if (i > arrayOfInt.length)
        this.d = Arrays.copyOf(arrayOfInt, i); 
      System.arraycopy(((n42)paramCollection).d, 0, this.d, this.e, ((n42)paramCollection).e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final int c(int paramInt) {
    i(paramInt);
    return this.d[paramInt];
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof n42))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((n42)paramObject).e)
      return false; 
    paramObject = ((n42)paramObject).d;
    for (byte b = 0; b < this.e; b++) {
      if (this.d[b] != paramObject[b])
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int i = 1;
    for (byte b = 0; b < this.e; b++)
      i = i * 31 + this.d[b]; 
    return i;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Integer))
      return -1; 
    int i = ((Integer)paramObject).intValue();
    int j = size();
    for (byte b = 0; b < j; b++) {
      if (this.d[b] == i)
        return b; 
    } 
    return -1;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2) {
    a();
    if (paramInt2 >= paramInt1) {
      int[] arrayOfInt = this.d;
      System.arraycopy(arrayOfInt, paramInt2, arrayOfInt, paramInt1, this.e - paramInt2);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */