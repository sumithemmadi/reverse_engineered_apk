package androidx.core.content.d;

import java.lang.reflect.Array;

final class e {
  public static int[] a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int[] arrayOfInt = paramArrayOfint;
    if (paramInt1 + 1 > paramArrayOfint.length) {
      arrayOfInt = new int[c(paramInt1)];
      System.arraycopy(paramArrayOfint, 0, arrayOfInt, 0, paramInt1);
    } 
    arrayOfInt[paramInt1] = paramInt2;
    return arrayOfInt;
  }
  
  public static <T> T[] b(T[] paramArrayOfT, int paramInt, T paramT) {
    T[] arrayOfT = paramArrayOfT;
    if (paramInt + 1 > paramArrayOfT.length) {
      arrayOfT = (T[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), c(paramInt));
      System.arraycopy(paramArrayOfT, 0, arrayOfT, 0, paramInt);
    } 
    arrayOfT[paramInt] = paramT;
    return arrayOfT;
  }
  
  public static int c(int paramInt) {
    if (paramInt <= 4) {
      paramInt = 8;
    } else {
      paramInt *= 2;
    } 
    return paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/content/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */