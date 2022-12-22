package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class rd2 {
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
  
  public static int a(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    byte b = paramByteBuffer.get(i + 4);
    return ((paramByteBuffer.get(i + 5) & 0xFC) >> 2 | (b & 0x1) << 6) + 1 << 5;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */