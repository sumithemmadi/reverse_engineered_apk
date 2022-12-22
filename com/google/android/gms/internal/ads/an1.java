package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class an1 {
  private final String a = c2.b.a();
  
  public final String a(Map<String, String> paramMap) {
    Uri.Builder builder = Uri.parse(this.a).buildUpon();
    for (Map.Entry<String, String> entry : paramMap.entrySet())
      builder.appendQueryParameter((String)entry.getKey(), (String)entry.getValue()); 
    return builder.build().toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/an1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */