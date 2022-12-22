package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.text.l.g;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.v;
import java.util.List;

public final class c0 {
  private final List<Format> a;
  
  private final v[] b;
  
  public c0(List<Format> paramList) {
    this.a = paramList;
    this.b = new v[paramList.size()];
  }
  
  public void a(long paramLong, v paramv) {
    g.a(paramLong, paramv, this.b);
  }
  
  public void b(j paramj, h0.d paramd) {
    for (byte b = 0; b < this.b.length; b++) {
      boolean bool;
      paramd.a();
      v v1 = paramj.g(paramd.c(), 3);
      Format format = this.a.get(b);
      String str1 = format.j;
      if ("application/cea-608".equals(str1) || "application/cea-708".equals(str1)) {
        bool = true;
      } else {
        bool = false;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid closed caption mime type provided: ");
      stringBuilder.append(str1);
      e.b(bool, stringBuilder.toString());
      String str2 = format.b;
      if (str2 == null)
        str2 = paramd.b(); 
      v1.d(Format.z(str2, str1, null, -1, format.d, format.B, format.C, null, Long.MAX_VALUE, format.l));
      this.b[b] = v1;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */