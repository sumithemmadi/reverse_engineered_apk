package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class pq1 {
  private final String a;
  
  private final sq1 b;
  
  private sq1 c;
  
  private boolean d;
  
  private pq1(String paramString) {
    sq1 sq11 = new sq1(null);
    this.b = sq11;
    this.c = sq11;
    this.d = false;
    this.a = xq1.<String>b(paramString);
  }
  
  public final pq1 a(Object paramObject) {
    sq1 sq11 = new sq1(null);
    this.c.b = sq11;
    this.c = sq11;
    sq11.a = paramObject;
    return this;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append(this.a);
    stringBuilder.append('{');
    sq1 sq11 = this.b.b;
    for (String str = ""; sq11 != null; str = ", ") {
      Object object = sq11.a;
      stringBuilder.append(str);
      if (object != null && object.getClass().isArray()) {
        str = Arrays.deepToString(new Object[] { object });
        stringBuilder.append(str, 1, str.length() - 1);
      } else {
        stringBuilder.append(object);
      } 
      sq11 = sq11.b;
    } 
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */