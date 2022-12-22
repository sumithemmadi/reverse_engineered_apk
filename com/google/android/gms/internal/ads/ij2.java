package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class ij2 {
  private static final byte[] a = new byte[] { 0, 0, 0, 1 };
  
  private static final int[] b = new int[] { 
      96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 
      11025, 8000, 7350 };
  
  private static final int[] c = new int[] { 
      0, 1, 2, 3, 4, 5, 6, 8, -1, -1, 
      -1, 7, 8, -1, 8, -1 };
  
  private static int a(rj2 paramrj2) {
    int i = paramrj2.a(5);
    int j = i;
    if (i == 31)
      j = paramrj2.a(6) + 32; 
    return j;
  }
  
  private static int b(rj2 paramrj2) {
    int i = paramrj2.a(4);
    if (i == 15) {
      i = paramrj2.a(24);
    } else {
      boolean bool;
      if (i < 13) {
        bool = true;
      } else {
        bool = false;
      } 
      jj2.a(bool);
      i = b[i];
    } 
    return i;
  }
  
  public static byte[] c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    byte[] arrayOfByte1 = a;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramInt2];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte2, arrayOfByte1.length, paramInt2);
    return arrayOfByte2;
  }
  
  public static Pair<Integer, Integer> d(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: new com/google/android/gms/internal/ads/rj2
    //   3: dup
    //   4: aload_0
    //   5: invokespecial <init> : ([B)V
    //   8: astore_0
    //   9: aload_0
    //   10: invokestatic a : (Lcom/google/android/gms/internal/ads/rj2;)I
    //   13: istore_1
    //   14: aload_0
    //   15: invokestatic b : (Lcom/google/android/gms/internal/ads/rj2;)I
    //   18: istore_2
    //   19: aload_0
    //   20: iconst_4
    //   21: invokevirtual a : (I)I
    //   24: istore_3
    //   25: iload_1
    //   26: iconst_5
    //   27: if_icmpeq -> 39
    //   30: iload_3
    //   31: istore #4
    //   33: iload_1
    //   34: bipush #29
    //   36: if_icmpne -> 67
    //   39: aload_0
    //   40: invokestatic b : (Lcom/google/android/gms/internal/ads/rj2;)I
    //   43: istore_1
    //   44: iload_1
    //   45: istore_2
    //   46: iload_3
    //   47: istore #4
    //   49: aload_0
    //   50: invokestatic a : (Lcom/google/android/gms/internal/ads/rj2;)I
    //   53: bipush #22
    //   55: if_icmpne -> 67
    //   58: aload_0
    //   59: iconst_4
    //   60: invokevirtual a : (I)I
    //   63: istore #4
    //   65: iload_1
    //   66: istore_2
    //   67: getstatic com/google/android/gms/internal/ads/ij2.c : [I
    //   70: iload #4
    //   72: iaload
    //   73: istore #4
    //   75: iload #4
    //   77: iconst_m1
    //   78: if_icmpeq -> 87
    //   81: iconst_1
    //   82: istore #5
    //   84: goto -> 90
    //   87: iconst_0
    //   88: istore #5
    //   90: iload #5
    //   92: invokestatic a : (Z)V
    //   95: iload_2
    //   96: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   99: iload #4
    //   101: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   104: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   107: areturn
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ij2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */