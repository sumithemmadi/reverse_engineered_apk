package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class j42 extends a32<Float> implements u42<Float>, g62, RandomAccess {
  private static final j42 c;
  
  private float[] d;
  
  private int e;
  
  static {
    j42 j421 = new j42(new float[0], 0);
    c = j421;
    j421.G();
  }
  
  j42() {
    this(new float[10], 0);
  }
  
  private j42(float[] paramArrayOffloat, int paramInt) {
    this.d = paramArrayOffloat;
    this.e = paramInt;
  }
  
  private final void c(int paramInt) {
    if (paramInt >= 0 && paramInt < this.e)
      return; 
    throw new IndexOutOfBoundsException(f(paramInt));
  }
  
  private final String f(int paramInt) {
    int i = this.e;
    StringBuilder stringBuilder = new StringBuilder(35);
    stringBuilder.append("Index:");
    stringBuilder.append(paramInt);
    stringBuilder.append(", Size:");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
  
  public final boolean addAll(Collection<? extends Float> paramCollection) {
    a();
    m42.a(paramCollection);
    if (!(paramCollection instanceof j42))
      return super.addAll(paramCollection); 
    j42 j421 = (j42)paramCollection;
    int i = j421.e;
    if (i == 0)
      return false; 
    int j = this.e;
    if (Integer.MAX_VALUE - j >= i) {
      i = j + i;
      float[] arrayOfFloat = this.d;
      if (i > arrayOfFloat.length)
        this.d = Arrays.copyOf(arrayOfFloat, i); 
      System.arraycopy(j421.d, 0, this.d, this.e, j421.e);
      this.e = i;
      this.modCount++;
      return true;
    } 
    throw new OutOfMemoryError();
  }
  
  public final boolean contains(Object paramObject) {
    return (indexOf(paramObject) != -1);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof j42))
      return super.equals(paramObject); 
    paramObject = paramObject;
    if (this.e != ((j42)paramObject).e)
      return false; 
    paramObject = ((j42)paramObject).d;
    for (byte b = 0; b < this.e; b++) {
      if (Float.floatToIntBits(this.d[b]) != Float.floatToIntBits(paramObject[b]))
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    int i = 1;
    for (byte b = 0; b < this.e; b++)
      i = i * 31 + Float.floatToIntBits(this.d[b]); 
    return i;
  }
  
  public final void i(float paramFloat) {
    a();
    int i = this.e;
    float[] arrayOfFloat1 = this.d;
    if (i == arrayOfFloat1.length) {
      float[] arrayOfFloat = new float[i * 3 / 2 + 1];
      System.arraycopy(arrayOfFloat1, 0, arrayOfFloat, 0, i);
      this.d = arrayOfFloat;
    } 
    float[] arrayOfFloat2 = this.d;
    i = this.e;
    this.e = i + 1;
    arrayOfFloat2[i] = paramFloat;
  }
  
  public final int indexOf(Object paramObject) {
    if (!(paramObject instanceof Float))
      return -1; 
    float f = ((Float)paramObject).floatValue();
    int i = size();
    for (byte b = 0; b < i; b++) {
      if (this.d[b] == f)
        return b; 
    } 
    return -1;
  }
  
  protected final void removeRange(int paramInt1, int paramInt2) {
    a();
    if (paramInt2 >= paramInt1) {
      float[] arrayOfFloat = this.d;
      System.arraycopy(arrayOfFloat, paramInt2, arrayOfFloat, paramInt1, this.e - paramInt2);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */