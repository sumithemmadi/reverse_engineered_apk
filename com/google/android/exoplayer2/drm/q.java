package com.google.android.exoplayer2.drm;

import android.util.Pair;
import java.util.Map;

public final class q {
  private static long a(Map<String, String> paramMap, String paramString) {
    if (paramMap != null)
      try {
        String str = paramMap.get(paramString);
        if (str != null)
          return Long.parseLong(str); 
      } catch (NumberFormatException numberFormatException) {} 
    return -9223372036854775807L;
  }
  
  public static Pair<Long, Long> b(DrmSession<?> paramDrmSession) {
    Map<String, String> map = paramDrmSession.d();
    return (map == null) ? null : new Pair(Long.valueOf(a(map, "LicenseDurationRemaining")), Long.valueOf(a(map, "PlaybackDurationRemaining")));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/drm/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */