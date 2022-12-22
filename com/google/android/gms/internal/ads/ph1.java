package com.google.android.gms.internal.ads;

import android.util.JsonReader;

public final class ph1 {
  private int a;
  
  private String b;
  
  ph1(JsonReader paramJsonReader) {
    paramJsonReader.beginObject();
    int i = 3;
    String str;
    for (str = ""; paramJsonReader.hasNext(); str = paramJsonReader.nextString()) {
      String str1 = paramJsonReader.nextName();
      str1.hashCode();
      if (!str1.equals("description")) {
        if (!str1.equals("code")) {
          paramJsonReader.skipValue();
          continue;
        } 
        i = paramJsonReader.nextInt();
        continue;
      } 
    } 
    paramJsonReader.endObject();
    this.a = i;
    this.b = str;
  }
  
  public final String a() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ph1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */