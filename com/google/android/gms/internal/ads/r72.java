package com.google.android.gms.internal.ads;

final class r72 {
  private static void a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, char[] paramArrayOfchar, int paramInt) {
    if (!l(paramByte2) && (paramByte1 << 28) + paramByte2 + 112 >> 30 == 0 && !l(paramByte3) && !l(paramByte4)) {
      int i = (paramByte1 & 0x7) << 18 | (paramByte2 & 0x3F) << 12 | (paramByte3 & 0x3F) << 6 | paramByte4 & 0x3F;
      paramArrayOfchar[paramInt] = (char)(char)((i >>> 10) + 55232);
      paramArrayOfchar[paramInt + 1] = (char)(char)((i & 0x3FF) + 56320);
      return;
    } 
    throw zzelo.zzbji();
  }
  
  private static void b(byte paramByte1, byte paramByte2, byte paramByte3, char[] paramArrayOfchar, int paramInt) {
    if (!l(paramByte2) && (paramByte1 != -32 || paramByte2 >= -96) && (paramByte1 != -19 || paramByte2 < -96) && !l(paramByte3)) {
      paramArrayOfchar[paramInt] = (char)(char)((paramByte1 & 0xF) << 12 | (paramByte2 & 0x3F) << 6 | paramByte3 & 0x3F);
      return;
    } 
    throw zzelo.zzbji();
  }
  
  private static void c(byte paramByte1, byte paramByte2, char[] paramArrayOfchar, int paramInt) {
    if (paramByte1 >= -62 && !l(paramByte2)) {
      paramArrayOfchar[paramInt] = (char)(char)((paramByte1 & 0x1F) << 6 | paramByte2 & 0x3F);
      return;
    } 
    throw zzelo.zzbji();
  }
  
  private static void d(byte paramByte, char[] paramArrayOfchar, int paramInt) {
    paramArrayOfchar[paramInt] = (char)(char)paramByte;
  }
  
  private static boolean i(byte paramByte) {
    return (paramByte >= 0);
  }
  
  private static boolean j(byte paramByte) {
    return (paramByte < -32);
  }
  
  private static boolean k(byte paramByte) {
    return (paramByte < -16);
  }
  
  private static boolean l(byte paramByte) {
    return (paramByte > -65);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */