package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.g;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

final class d extends TagPayloadReader {
  private long b = -9223372036854775807L;
  
  public d() {
    super((v)new g());
  }
  
  private static Boolean e(v paramv) {
    int i = paramv.z();
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return Boolean.valueOf(bool);
  }
  
  private static Object f(v paramv, int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 8) ? ((paramInt != 10) ? ((paramInt != 11) ? null : g(paramv)) : k(paramv)) : i(paramv)) : j(paramv)) : l(paramv)) : e(paramv)) : h(paramv);
  }
  
  private static Date g(v paramv) {
    Date date = new Date((long)h(paramv).doubleValue());
    paramv.N(2);
    return date;
  }
  
  private static Double h(v paramv) {
    return Double.valueOf(Double.longBitsToDouble(paramv.s()));
  }
  
  private static HashMap<String, Object> i(v paramv) {
    int i = paramv.D();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(i);
    for (byte b = 0; b < i; b++) {
      String str = l(paramv);
      Object object = f(paramv, m(paramv));
      if (object != null)
        hashMap.put(str, object); 
    } 
    return (HashMap)hashMap;
  }
  
  private static HashMap<String, Object> j(v paramv) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    while (true) {
      String str = l(paramv);
      int i = m(paramv);
      if (i == 9)
        return (HashMap)hashMap; 
      Object object = f(paramv, i);
      if (object != null)
        hashMap.put(str, object); 
    } 
  }
  
  private static ArrayList<Object> k(v paramv) {
    int i = paramv.D();
    ArrayList<Object> arrayList = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      Object object = f(paramv, m(paramv));
      if (object != null)
        arrayList.add(object); 
    } 
    return arrayList;
  }
  
  private static String l(v paramv) {
    int i = paramv.F();
    int j = paramv.c();
    paramv.N(i);
    return new String(paramv.a, j, i);
  }
  
  private static int m(v paramv) {
    return paramv.z();
  }
  
  protected boolean b(v paramv) {
    return true;
  }
  
  protected boolean c(v paramv, long paramLong) {
    if (m(paramv) == 2) {
      if (!"onMetaData".equals(l(paramv)))
        return false; 
      if (m(paramv) != 8)
        return false; 
      HashMap<String, Object> hashMap = i(paramv);
      if (hashMap.containsKey("duration")) {
        double d1 = ((Double)hashMap.get("duration")).doubleValue();
        if (d1 > 0.0D)
          this.b = (long)(d1 * 1000000.0D); 
      } 
      return false;
    } 
    throw new ParserException();
  }
  
  public long d() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/flv/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */