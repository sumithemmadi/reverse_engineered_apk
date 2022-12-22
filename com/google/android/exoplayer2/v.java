package com.google.android.exoplayer2;

import java.util.UUID;

public final class v {
  public static final UUID a = new UUID(0L, 0L);
  
  public static final UUID b = new UUID(1186680826959645954L, -5988876978535335093L);
  
  public static final UUID c = new UUID(-2129748144642739255L, 8654423357094679310L);
  
  public static final UUID d = new UUID(-1301668207276963122L, -6645017420763422227L);
  
  public static final UUID e = new UUID(-7348484286925749626L, -6083546864340672619L);
  
  public static long a(long paramLong) {
    long l = paramLong;
    if (paramLong != -9223372036854775807L)
      if (paramLong == Long.MIN_VALUE) {
        l = paramLong;
      } else {
        l = paramLong * 1000L;
      }  
    return l;
  }
  
  public static long b(long paramLong) {
    long l = paramLong;
    if (paramLong != -9223372036854775807L)
      if (paramLong == Long.MIN_VALUE) {
        l = paramLong;
      } else {
        l = paramLong / 1000L;
      }  
    return l;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */