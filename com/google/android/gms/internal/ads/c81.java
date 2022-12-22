package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

public final class c81 implements t91<Bundle> {
  private final String a;
  
  public c81(String paramString) {
    this.a = paramString;
  }
  
  private static boolean a(Set<String> paramSet) {
    return (paramSet.contains("rewarded") || paramSet.contains("interstitial") || paramSet.contains("native") || paramSet.contains("banner"));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */