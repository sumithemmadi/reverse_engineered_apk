package com.google.android.gms.ads;

public enum AdFormat {
  b, c, d, e, f;
  
  static {
    AdFormat adFormat1 = new AdFormat("BANNER", 0);
    b = adFormat1;
    AdFormat adFormat2 = new AdFormat("INTERSTITIAL", 1);
    c = adFormat2;
    AdFormat adFormat3 = new AdFormat("REWARDED", 2);
    d = adFormat3;
    AdFormat adFormat4 = new AdFormat("REWARDED_INTERSTITIAL", 3);
    e = adFormat4;
    AdFormat adFormat5 = new AdFormat("NATIVE", 4);
    f = adFormat5;
    g = new AdFormat[] { adFormat1, adFormat2, adFormat3, adFormat4, adFormat5 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/AdFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */