package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class w32 extends a32<Double> implements u42<Double>, g62, RandomAccess {
  private static final w32 c;
  
  private double[] d;
  
  private int e;
  
  static {
    w32 w321 = new w32(new double[0], 0);
    c = w321;
    w321.G();
  }
  
  w32() {
    this(new double[10], 0);
  }
  
  private w32(double[] paramArrayOfdouble, int paramInt) {
    this.d = paramArrayOfdouble;
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
  
  public final boolean addAll(Collection<? extends Double> paramCollection) {
    a();
    m42.a(paramCollection);
    if (!(paramCollection instanceof w32))
      return super.addAll(paramCollection); 
    w32 w321 = (w32)paramCollection;
    int i = w321.e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      j += i;
      double[] arrayOfDouble = this.d;
      if (j > arrayOfDouble.length)
        this.d = Arrays.copyOf(arrayOfDouble, j); 
      System.arraycopy(w321.d, 0, this.d, this.e, w321.e);
      this.e = j;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final void c(double paramDouble) {
    a();
    int i = this.e;
    double[] arrayOfDouble = this.d;
    if (i == arrayOfDouble.length) {
      double[] arrayOfDouble1 = new double[i * 3 / 2 + 1];
      System.arraycopy(arrayOfDouble, 0, arrayOfDouble1, 0, i);
      this.d = arrayOfDouble1;
    } 
    arrayOfDouble = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfDouble[i] = paramDouble;
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof w32))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((w32)paramObject).e)
      return false; 
    paramObject = ((w32)paramObject).d;
    for (byte b = 0; b < this.e; b++) {
      if (Double.doubleToLongBits(this.d[b]) != Double.doubleToLongBits(paramObject[b]))
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int i = 1;
    for (byte b = 0; b < this.e; b++)
      i = i * 31 + m42.g(Double.doubleToLongBits(this.d[b])); 
    return i;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Double))
      return -1; 
    double d = ((Double)paramObject).doubleValue();
    int i = size();
    for (byte b = 0; b < i; b++) {
      if (this.d[b] == d)
        return b; 
    } 
    return -1;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2) {
    a();
    if (paramInt2 >= paramInt1) {
      double[] arrayOfDouble = this.d;
      System.arraycopy(arrayOfDouble, paramInt2, arrayOfDouble, paramInt1, this.e - paramInt2);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */