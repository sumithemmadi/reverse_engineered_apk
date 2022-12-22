package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

final class vj {
  long a;
  
  final String b;
  
  final String c;
  
  final long d;
  
  final long e;
  
  final long f;
  
  final long g;
  
  final List<yp2> h;
  
  vj(String paramString, hh2 paramhh2) {
    this(paramString, str, l1, l2, l3, l4, (List<yp2>)entry);
  }
  
  private vj(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<yp2> paramList) {
    this.b = paramString1;
    paramString1 = paramString2;
    if ("".equals(paramString2))
      paramString1 = null; 
    this.c = paramString1;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramLong3;
    this.g = paramLong4;
    this.h = paramList;
  }
  
  static vj b(rm paramrm) {
    if (ai.n(paramrm) == 538247942)
      return new vj(ai.h(paramrm), ai.h(paramrm), ai.p(paramrm), ai.p(paramrm), ai.p(paramrm), ai.p(paramrm), ai.o(paramrm)); 
    throw new IOException();
  }
  
  final boolean a(OutputStream paramOutputStream) {
    try {
      ai.i(paramOutputStream, 538247942);
      ai.k(paramOutputStream, this.b);
      String str1 = this.c;
      String str2 = str1;
      if (str1 == null)
        str2 = ""; 
      ai.k(paramOutputStream, str2);
      ai.j(paramOutputStream, this.d);
      ai.j(paramOutputStream, this.e);
      ai.j(paramOutputStream, this.f);
      ai.j(paramOutputStream, this.g);
      List<yp2> list = this.h;
      if (list != null) {
        ai.i(paramOutputStream, list.size());
        for (yp2 yp2 : list) {
          ai.k(paramOutputStream, yp2.a());
          ai.k(paramOutputStream, yp2.b());
        } 
      } else {
        ai.i(paramOutputStream, 0);
      } 
      paramOutputStream.flush();
      return true;
    } catch (IOException iOException) {
      ic.a("%s", new Object[] { iOException.toString() });
      return false;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */