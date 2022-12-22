package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.util.h0;
import java.util.Collections;
import java.util.List;

public final class sh1 {
  public final List<String> a;
  
  public final String b;
  
  public final int c;
  
  public final String d;
  
  public final int e;
  
  public final long f;
  
  public final boolean g;
  
  public final ph1 h;
  
  sh1(JsonReader paramJsonReader) {
    List<?> list = Collections.emptyList();
    paramJsonReader.beginObject();
    String str1 = "";
    String str2 = "";
    long l = 0L;
    ph1 ph11 = null;
    int i = 0;
    int j = 0;
    boolean bool = false;
    while (paramJsonReader.hasNext()) {
      String str = paramJsonReader.nextName();
      if ("nofill_urls".equals(str)) {
        list = h0.b(paramJsonReader);
        continue;
      } 
      if ("refresh_interval".equals(str)) {
        i = paramJsonReader.nextInt();
        continue;
      } 
      if ("gws_query_id".equals(str)) {
        str1 = paramJsonReader.nextString();
        continue;
      } 
      if ("analytics_query_ad_event_id".equals(str)) {
        str2 = paramJsonReader.nextString();
        continue;
      } 
      if ("is_idless".equals(str)) {
        bool = paramJsonReader.nextBoolean();
        continue;
      } 
      if ("response_code".equals(str)) {
        j = paramJsonReader.nextInt();
        continue;
      } 
      if ("latency".equals(str)) {
        l = paramJsonReader.nextLong();
        continue;
      } 
      x<Boolean> x = m0.Q5;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && "public_error".equals(str) && paramJsonReader.peek() == JsonToken.BEGIN_OBJECT) {
        ph11 = new ph1(paramJsonReader);
        continue;
      } 
      paramJsonReader.skipValue();
    } 
    paramJsonReader.endObject();
    this.a = (List)list;
    this.c = i;
    this.b = str1;
    this.d = str2;
    this.e = j;
    this.f = l;
    this.h = ph11;
    this.g = bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */