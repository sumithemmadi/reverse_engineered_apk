package com.google.ads;

public enum AdRequest$Gender {
  b, c, d;
  
  static {
    AdRequest$Gender adRequest$Gender1 = new AdRequest$Gender("UNKNOWN", 0);
    b = adRequest$Gender1;
    AdRequest$Gender adRequest$Gender2 = new AdRequest$Gender("MALE", 1);
    c = adRequest$Gender2;
    AdRequest$Gender adRequest$Gender3 = new AdRequest$Gender("FEMALE", 2);
    d = adRequest$Gender3;
    e = new AdRequest$Gender[] { adRequest$Gender1, adRequest$Gender2, adRequest$Gender3 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/AdRequest$Gender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */