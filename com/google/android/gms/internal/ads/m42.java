package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class m42 {
  static final Charset a = Charset.forName("UTF-8");
  
  private static final Charset b = Charset.forName("ISO-8859-1");
  
  public static final byte[] c;
  
  private static final ByteBuffer d;
  
  private static final o32 e;
  
  static {
    byte[] arrayOfByte = new byte[0];
    c = arrayOfByte;
    d = ByteBuffer.wrap(arrayOfByte);
    e = o32.d(arrayOfByte, 0, arrayOfByte.length, false);
  }
  
  static <T> T a(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  public static int b(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    int j = c(i, paramArrayOfbyte, 0, i);
    i = j;
    if (j == 0)
      i = 1; 
    return i;
  }
  
  static int c(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    for (int i = paramInt2; i < paramInt2 + paramInt3; i++)
      paramInt1 = paramInt1 * 31 + paramArrayOfbyte[i]; 
    return paramInt1;
  }
  
  static <T> T d(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(paramString);
  }
  
  public static int e(boolean paramBoolean) {
    return paramBoolean ? 1231 : 1237;
  }
  
  static Object f(Object paramObject1, Object paramObject2) {
    return ((u52)paramObject1).f().j((u52)paramObject2).d();
  }
  
  public static int g(long paramLong) {
    return (int)(paramLong ^ paramLong >>> 32L);
  }
  
  static boolean h(u52 paramu52) {
    if (paramu52 instanceof y22)
      paramu52 = paramu52; 
    return false;
  }
  
  public static boolean i(byte[] paramArrayOfbyte) {
    return p72.n(paramArrayOfbyte);
  }
  
  public static String j(byte[] paramArrayOfbyte) {
    return new String(paramArrayOfbyte, a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */