package b.e;

class c {
  static final int[] a = new int[0];
  
  static final long[] b = new long[0];
  
  static final Object[] c = new Object[0];
  
  static int a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    paramInt1--;
    int i = 0;
    while (i <= paramInt1) {
      int j = i + paramInt1 >>> 1;
      int k = paramArrayOfint[j];
      if (k < paramInt2) {
        i = j + 1;
        continue;
      } 
      if (k > paramInt2) {
        paramInt1 = j - 1;
        continue;
      } 
      return j;
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  static int b(long[] paramArrayOflong, int paramInt, long paramLong) {
    paramInt--;
    int i = 0;
    while (i <= paramInt) {
      int j = i + paramInt >>> 1;
      long l = paramArrayOflong[j];
      if (l < paramLong) {
        i = j + 1;
        continue;
      } 
      if (l > paramLong) {
        paramInt = j - 1;
        continue;
      } 
      return j;
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public static boolean c(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  public static int d(int paramInt) {
    for (byte b = 4; b < 32; b++) {
      int i = (1 << b) - 12;
      if (paramInt <= i)
        return i; 
    } 
    return paramInt;
  }
  
  public static int e(int paramInt) {
    return d(paramInt * 4) / 4;
  }
  
  public static int f(int paramInt) {
    return d(paramInt * 8) / 8;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */