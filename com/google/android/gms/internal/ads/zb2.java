package com.google.android.gms.internal.ads;

import java.util.UUID;

public final class zb2 {
  public static final int a;
  
  public static final UUID b = new UUID(0L, 0L);
  
  private static final UUID c = new UUID(1186680826959645954L, -5988876978535335093L);
  
  private static final UUID d = new UUID(-1301668207276963122L, -6645017420763422227L);
  
  private static final UUID e = new UUID(-7348484286925749626L, -6083546864340672619L);
  
  public static long a(long paramLong) {
    return (paramLong == -9223372036854775807L) ? -9223372036854775807L : (paramLong / 1000L);
  }
  
  public static long b(long paramLong) {
    return (paramLong == -9223372036854775807L) ? -9223372036854775807L : (paramLong * 1000L);
  }
  
  static {
    char c;
    if (wj2.a < 23) {
      c = 'ϼ';
    } else {
      c = '᣼';
    } 
    a = c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */