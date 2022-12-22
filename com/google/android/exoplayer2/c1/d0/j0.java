package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.text.l.g;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.v;
import java.util.List;

final class j0 {
  private final List<Format> a;
  
  private final v[] b;
  
  public j0(List<Format> paramList) {
    this.a = paramList;
    this.b = new v[paramList.size()];
  }
  
  public void a(long paramLong, v paramv) {
    if (paramv.a() < 9)
      return; 
    int i = paramv.k();
    int j = paramv.k();
    int k = paramv.z();
    if (i == 434 && j == 1195456820 && k == 3)
      g.b(paramLong, paramv, this.b); 
  }
  
  public void b(j paramj, h0.d paramd) {
    for (byte b = 0; b < this.b.length; b++) {
      boolean bool;
      paramd.a();
      v v1 = paramj.g(paramd.c(), 3);
      Format format = this.a.get(b);
      String str = format.j;
      if ("application/cea-608".equals(str) || "application/cea-708".equals(str)) {
        bool = true;
      } else {
        bool = false;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid closed caption mime type provided: ");
      stringBuilder.append(str);
      e.b(bool, stringBuilder.toString());
      v1.d(Format.z(paramd.b(), str, null, -1, format.d, format.B, format.C, null, Long.MAX_VALUE, format.l));
      this.b[b] = v1;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */