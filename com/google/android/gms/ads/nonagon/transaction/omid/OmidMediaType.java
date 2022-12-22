package com.google.android.gms.ads.nonagon.transaction.omid;

public enum OmidMediaType {
  b, c, d;
  
  static {
    OmidMediaType omidMediaType1 = new OmidMediaType("VIDEO", 0);
    b = omidMediaType1;
    OmidMediaType omidMediaType2 = new OmidMediaType("DISPLAY", 1);
    c = omidMediaType2;
    OmidMediaType omidMediaType3 = new OmidMediaType("UNKNOWN", 2);
    d = omidMediaType3;
    e = new OmidMediaType[] { omidMediaType1, omidMediaType2, omidMediaType3 };
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/nonagon/transaction/omid/OmidMediaType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */