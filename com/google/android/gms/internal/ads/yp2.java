package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class yp2 {
  private final String a;
  
  private final String b;
  
  public yp2(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final String a() {
    return this.a;
  }
  
  public final String b() {
    return this.b;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && yp2.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (TextUtils.equals(this.a, ((yp2)paramObject).a) && TextUtils.equals(this.b, ((yp2)paramObject).b))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a.hashCode() * 31 + this.b.hashCode();
  }
  
  public final String toString() {
    String str1 = this.a;
    String str2 = this.b;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 20 + String.valueOf(str2).length());
    stringBuilder.append("Header[name=");
    stringBuilder.append(str1);
    stringBuilder.append(",value=");
    stringBuilder.append(str2);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */