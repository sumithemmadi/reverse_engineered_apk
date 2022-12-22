package com.google.android.gms.internal.ads;

final class xn1 extends tn1 {
  private String a;
  
  private Boolean b;
  
  private Boolean c;
  
  public final un1 a() {
    String str1 = this.a;
    String str2 = "";
    if (str1 == null)
      str2 = "".concat(" clientVersion"); 
    str1 = str2;
    if (this.b == null)
      str1 = String.valueOf(str2).concat(" shouldGetAdvertisingId"); 
    str2 = str1;
    if (this.c == null)
      str2 = String.valueOf(str1).concat(" isGooglePlayServicesAvailable"); 
    if (!str2.isEmpty()) {
      if (str2.length() != 0) {
        str1 = "Missing required properties:".concat(str2);
      } else {
        str1 = new String("Missing required properties:");
      } 
      throw new IllegalStateException(str1);
    } 
    return new vn1(this.a, this.b.booleanValue(), this.c.booleanValue(), null);
  }
  
  public final tn1 b(boolean paramBoolean) {
    this.b = Boolean.valueOf(paramBoolean);
    return this;
  }
  
  public final tn1 c(boolean paramBoolean) {
    this.c = Boolean.TRUE;
    return this;
  }
  
  public final tn1 d(String paramString) {
    if (paramString != null) {
      this.a = paramString;
      return this;
    } 
    throw new NullPointerException("Null clientVersion");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */