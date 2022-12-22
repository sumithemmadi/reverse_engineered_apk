package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zc2 {
  private static final int[] a = new int[] { 1, 2, 3, 6 };
  
  private static final int[] b = new int[] { 48000, 44100, 32000 };
  
  private static final int[] c = new int[] { 24000, 22050, 16000 };
  
  private static final int[] d = new int[] { 2, 1, 2, 3, 3, 4, 4, 5 };
  
  private static final int[] e = new int[] { 
      32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 
      192, 224, 256, 320, 384, 448, 512, 576, 640 };
  
  private static final int[] f = new int[] { 
      69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 
      417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
  
  public static zzht a(qj2 paramqj2, String paramString1, String paramString2, zzjo paramzzjo) {
    int i = paramqj2.g();
    int j = b[(i & 0xC0) >> 6];
    int k = paramqj2.g();
    int m = d[(k & 0x38) >> 3];
    i = m;
    if ((k & 0x4) != 0)
      i = m + 1; 
    return zzht.f(paramString1, "audio/ac3", null, -1, -1, i, j, null, paramzzjo, 0, paramString2);
  }
  
  public static zzht b(qj2 paramqj2, String paramString1, String paramString2, zzjo paramzzjo) {
    paramqj2.m(2);
    int i = paramqj2.g();
    int j = b[(i & 0xC0) >> 6];
    int k = paramqj2.g();
    int m = d[(k & 0xE) >> 1];
    i = m;
    if ((k & 0x1) != 0)
      i = m + 1; 
    return zzht.f(paramString1, "audio/eac3", null, -1, -1, i, j, null, paramzzjo, 0, paramString2);
  }
  
  public static int c() {
    return 1536;
  }
  
  public static int d(ByteBuffer paramByteBuffer) {
    byte b = paramByteBuffer.get(paramByteBuffer.position() + 4);
    int i = 6;
    if ((b & 0xC0) >> 6 != 3)
      i = a[(paramByteBuffer.get(paramByteBuffer.position() + 4) & 0x30) >> 4]; 
    return i * 256;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */