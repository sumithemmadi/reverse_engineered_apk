package com.google.ads;

public enum AdRequest$ErrorCode {
  b, c, d, e;
  
  private final String description;
  
  static {
    AdRequest$ErrorCode adRequest$ErrorCode1 = new AdRequest$ErrorCode("INVALID_REQUEST", 0, "Invalid Ad request.");
    b = adRequest$ErrorCode1;
    AdRequest$ErrorCode adRequest$ErrorCode2 = new AdRequest$ErrorCode("NO_FILL", 1, "Ad request successful, but no ad returned due to lack of ad inventory.");
    c = adRequest$ErrorCode2;
    AdRequest$ErrorCode adRequest$ErrorCode3 = new AdRequest$ErrorCode("NETWORK_ERROR", 2, "A network error occurred.");
    d = adRequest$ErrorCode3;
    AdRequest$ErrorCode adRequest$ErrorCode4 = new AdRequest$ErrorCode("INTERNAL_ERROR", 3, "There was an internal error.");
    e = adRequest$ErrorCode4;
    f = new AdRequest$ErrorCode[] { adRequest$ErrorCode1, adRequest$ErrorCode2, adRequest$ErrorCode3, adRequest$ErrorCode4 };
  }
  
  AdRequest$ErrorCode(String paramString1) {
    this.description = paramString1;
  }
  
  public final String toString() {
    return this.description;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/AdRequest$ErrorCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */