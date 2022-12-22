package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.u;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class r {
  private static final int[] a = new int[] { 
      1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 
      6, 6, 6, 7, 8, 8 };
  
  private static final int[] b = new int[] { 
      -1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, 
      -1, 12000, 24000, 48000, -1, -1 };
  
  private static final int[] c = new int[] { 
      64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 
      768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 
      2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680 };
  
  public static int a(byte[] paramArrayOfbyte) {
    int i = 0;
    byte b = paramArrayOfbyte[0];
    if (b != -2) {
      if (b != -1) {
        if (b != 31) {
          k = (paramArrayOfbyte[5] & 0x3) << 12 | (paramArrayOfbyte[6] & 0xFF) << 4;
          b = paramArrayOfbyte[7];
        } else {
          int m = (paramArrayOfbyte[6] & 0x3) << 12 | (paramArrayOfbyte[7] & 0xFF) << 4;
          k = paramArrayOfbyte[8];
          m = ((k & 0x3C) >> 2 | m) + 1;
          k = 1;
        } 
      } else {
        int m = (paramArrayOfbyte[7] & 0x3) << 12 | (paramArrayOfbyte[6] & 0xFF) << 4;
        k = paramArrayOfbyte[9];
        m = ((k & 0x3C) >> 2 | m) + 1;
        k = 1;
      } 
    } else {
      k = (paramArrayOfbyte[4] & 0x3) << 12 | (paramArrayOfbyte[7] & 0xFF) << 4;
      b = paramArrayOfbyte[6];
    } 
    int j = ((b & 0xF0) >> 4 | k) + 1;
    int k = i;
    i = j;
    if (k != 0)
      i = j * 16 / 14; 
    return i;
  }
  
  private static u b(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte[0] == Byte.MAX_VALUE)
      return new u(paramArrayOfbyte); 
    byte[] arrayOfByte = Arrays.copyOf(paramArrayOfbyte, paramArrayOfbyte.length);
    if (c(arrayOfByte))
      for (byte b = 0; b < arrayOfByte.length - 1; b += 2) {
        byte b1 = arrayOfByte[b];
        int i = b + 1;
        arrayOfByte[b] = (byte)arrayOfByte[i];
        arrayOfByte[i] = (byte)b1;
      }  
    u u = new u(arrayOfByte);
    if (arrayOfByte[0] == 31) {
      u u1 = new u(arrayOfByte);
      while (u1.b() >= 16) {
        u1.q(2);
        u.f(u1.h(14), 14);
      } 
    } 
    u.m(arrayOfByte);
    return u;
  }
  
  private static boolean c(byte[] paramArrayOfbyte) {
    boolean bool = false;
    if (paramArrayOfbyte[0] == -2 || paramArrayOfbyte[0] == -1)
      bool = true; 
    return bool;
  }
  
  public static boolean d(int paramInt) {
    return (paramInt == 2147385345 || paramInt == -25230976 || paramInt == 536864768 || paramInt == -14745368);
  }
  
  public static int e(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.get(i);
    if (j != -2) {
      if (j != -1) {
        if (j != 31) {
          int k = (paramByteBuffer.get(i + 4) & 0x1) << 6;
          i = paramByteBuffer.get(i + 5);
        } else {
          int k = (paramByteBuffer.get(i + 5) & 0x7) << 4;
          i = paramByteBuffer.get(i + 6);
          i &= 0x3C;
        } 
      } else {
        int k = (paramByteBuffer.get(i + 4) & 0x7) << 4;
        i = paramByteBuffer.get(i + 7);
        i &= 0x3C;
      } 
    } else {
      j = (paramByteBuffer.get(i + 5) & 0x1) << 6;
      i = paramByteBuffer.get(i + 4);
    } 
    i &= 0xFC;
    return ((i >> 2 | j) + 1) * 32;
  }
  
  public static int f(byte[] paramArrayOfbyte) {
    int j;
    int i = paramArrayOfbyte[0];
    if (i != -2) {
      if (i != -1) {
        if (i != 31) {
          int k = (paramArrayOfbyte[4] & 0x1) << 6;
          j = paramArrayOfbyte[5];
        } else {
          int k = (paramArrayOfbyte[5] & 0x7) << 4;
          byte b = paramArrayOfbyte[6];
          j = b & 0x3C;
        } 
      } else {
        int k = (paramArrayOfbyte[4] & 0x7) << 4;
        byte b = paramArrayOfbyte[7];
        j = b & 0x3C;
      } 
    } else {
      i = (paramArrayOfbyte[5] & 0x1) << 6;
      j = paramArrayOfbyte[4];
    } 
    j &= 0xFC;
    return ((j >> 2 | i) + 1) * 32;
  }
  
  public static Format g(byte[] paramArrayOfbyte, String paramString1, String paramString2, DrmInitData paramDrmInitData) {
    byte b;
    u u = b(paramArrayOfbyte);
    u.q(60);
    int i = u.h(6);
    int j = a[i];
    i = u.h(4);
    int k = b[i];
    i = u.h(5);
    int[] arrayOfInt = c;
    if (i >= arrayOfInt.length) {
      i = -1;
    } else {
      i = arrayOfInt[i] * 1000 / 2;
    } 
    u.q(10);
    if (u.h(2) > 0) {
      b = 1;
    } else {
      b = 0;
    } 
    return Format.p(paramString1, "audio/vnd.dts", null, i, -1, j + b, k, null, paramDrmInitData, 0, paramString2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */