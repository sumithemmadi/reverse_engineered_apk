package com.google.android.gms.internal.ads;

final class xm1 {
  public final String a;
  
  public final String b;
  
  public xm1(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof xm1))
      return false; 
    paramObject = paramObject;
    return (this.a.equals(((xm1)paramObject).a) && this.b.equals(((xm1)paramObject).b));
  }
  
  public final int hashCode() {
    String str1 = String.valueOf(this.a);
    String str2 = String.valueOf(this.b);
    if (str2.length() != 0) {
      str1 = str1.concat(str2);
    } else {
      str1 = new String(str1);
    } 
    return str1.hashCode();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */