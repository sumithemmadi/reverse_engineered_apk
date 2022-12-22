package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

public final class qh1 {
  public final int a;
  
  public final int b;
  
  public final boolean c;
  
  public qh1(int paramInt1, int paramInt2, boolean paramBoolean) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramBoolean;
  }
  
  static List<qh1> a(JsonReader paramJsonReader) {
    ArrayList<qh1> arrayList = new ArrayList();
    paramJsonReader.beginArray();
    while (paramJsonReader.hasNext()) {
      paramJsonReader.beginObject();
      int i = 0;
      int j = 0;
      boolean bool = false;
      while (paramJsonReader.hasNext()) {
        String str = paramJsonReader.nextName();
        if ("width".equals(str)) {
          i = paramJsonReader.nextInt();
          continue;
        } 
        if ("height".equals(str)) {
          j = paramJsonReader.nextInt();
          continue;
        } 
        if ("is_fluid_height".equals(str)) {
          bool = paramJsonReader.nextBoolean();
          continue;
        } 
        paramJsonReader.skipValue();
      } 
      paramJsonReader.endObject();
      arrayList.add(new qh1(i, j, bool));
    } 
    paramJsonReader.endArray();
    return arrayList;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qh1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */