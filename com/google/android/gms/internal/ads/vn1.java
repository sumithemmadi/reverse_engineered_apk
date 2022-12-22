package com.google.android.gms.internal.ads;

final class vn1 extends un1 {
  private final String a;
  
  private final boolean b;
  
  private final boolean c;
  
  private vn1(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.a = paramString;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
  }
  
  public final String a() {
    return this.a;
  }
  
  public final boolean b() {
    return this.b;
  }
  
  public final boolean d() {
    return this.c;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof un1) {
      paramObject = paramObject;
      if (this.a.equals(paramObject.a()) && this.b == paramObject.b() && this.c == paramObject.d())
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    char c2;
    int i = this.a.hashCode();
    boolean bool = this.b;
    char c1 = 'ӏ';
    if (bool) {
      c2 = 'ӏ';
    } else {
      c2 = 'ӕ';
    } 
    if (!this.c)
      c1 = 'ӕ'; 
    return ((i ^ 0xF4243) * 1000003 ^ c2) * 1000003 ^ c1;
  }
  
  public final String toString() {
    String str = this.a;
    boolean bool1 = this.b;
    boolean bool2 = this.c;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 99);
    stringBuilder.append("AdShield2Options{clientVersion=");
    stringBuilder.append(str);
    stringBuilder.append(", shouldGetAdvertisingId=");
    stringBuilder.append(bool1);
    stringBuilder.append(", isGooglePlayServicesAvailable=");
    stringBuilder.append(bool2);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */