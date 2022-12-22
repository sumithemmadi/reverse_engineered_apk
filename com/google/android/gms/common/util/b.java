package com.google.android.gms.common.util;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class b {
  public static <T> T[] a(T[]... paramVarArgs) {
    if (paramVarArgs.length == 0)
      return (T[])Array.newInstance(paramVarArgs.getClass(), 0); 
    int i = 0;
    int j = 0;
    while (i < paramVarArgs.length) {
      j += (paramVarArgs[i]).length;
      i++;
    } 
    Object[] arrayOfObject = Arrays.copyOf((Object[])paramVarArgs[0], j);
    i = (paramVarArgs[0]).length;
    for (j = 1; j < paramVarArgs.length; j++) {
      T[] arrayOfT = paramVarArgs[j];
      System.arraycopy(arrayOfT, 0, arrayOfObject, i, arrayOfT.length);
      i += arrayOfT.length;
    } 
    return (T[])arrayOfObject;
  }
  
  public static <T> boolean b(T[] paramArrayOfT, T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 10
    //   4: aload_0
    //   5: arraylength
    //   6: istore_2
    //   7: goto -> 12
    //   10: iconst_0
    //   11: istore_2
    //   12: iconst_0
    //   13: istore_3
    //   14: iload_3
    //   15: iload_2
    //   16: if_icmpge -> 38
    //   19: aload_0
    //   20: iload_3
    //   21: aaload
    //   22: aload_1
    //   23: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   26: ifeq -> 32
    //   29: goto -> 40
    //   32: iinc #3, 1
    //   35: goto -> 14
    //   38: iconst_m1
    //   39: istore_3
    //   40: iload_3
    //   41: iflt -> 46
    //   44: iconst_1
    //   45: ireturn
    //   46: iconst_0
    //   47: ireturn
  }
  
  public static void c(StringBuilder paramStringBuilder, double[] paramArrayOfdouble) {
    int i = paramArrayOfdouble.length;
    for (byte b1 = 0; b1 < i; b1++) {
      if (b1 != 0)
        paramStringBuilder.append(","); 
      paramStringBuilder.append(Double.toString(paramArrayOfdouble[b1]));
    } 
  }
  
  public static void d(StringBuilder paramStringBuilder, float[] paramArrayOffloat) {
    int i = paramArrayOffloat.length;
    for (byte b1 = 0; b1 < i; b1++) {
      if (b1 != 0)
        paramStringBuilder.append(","); 
      paramStringBuilder.append(Float.toString(paramArrayOffloat[b1]));
    } 
  }
  
  public static void e(StringBuilder paramStringBuilder, int[] paramArrayOfint) {
    int i = paramArrayOfint.length;
    for (byte b1 = 0; b1 < i; b1++) {
      if (b1 != 0)
        paramStringBuilder.append(","); 
      paramStringBuilder.append(Integer.toString(paramArrayOfint[b1]));
    } 
  }
  
  public static void f(StringBuilder paramStringBuilder, long[] paramArrayOflong) {
    int i = paramArrayOflong.length;
    for (byte b1 = 0; b1 < i; b1++) {
      if (b1 != 0)
        paramStringBuilder.append(","); 
      paramStringBuilder.append(Long.toString(paramArrayOflong[b1]));
    } 
  }
  
  public static <T> void g(StringBuilder paramStringBuilder, T[] paramArrayOfT) {
    int i = paramArrayOfT.length;
    for (byte b1 = 0; b1 < i; b1++) {
      if (b1 != 0)
        paramStringBuilder.append(","); 
      paramStringBuilder.append(paramArrayOfT[b1].toString());
    } 
  }
  
  public static void h(StringBuilder paramStringBuilder, boolean[] paramArrayOfboolean) {
    int i = paramArrayOfboolean.length;
    for (byte b1 = 0; b1 < i; b1++) {
      if (b1 != 0)
        paramStringBuilder.append(","); 
      paramStringBuilder.append(Boolean.toString(paramArrayOfboolean[b1]));
    } 
  }
  
  public static void i(StringBuilder paramStringBuilder, String[] paramArrayOfString) {
    int i = paramArrayOfString.length;
    for (byte b1 = 0; b1 < i; b1++) {
      if (b1 != 0)
        paramStringBuilder.append(","); 
      paramStringBuilder.append("\"");
      paramStringBuilder.append(paramArrayOfString[b1]);
      paramStringBuilder.append("\"");
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */