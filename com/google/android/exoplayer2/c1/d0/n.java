package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.v;
import java.util.Collections;
import java.util.List;

public final class n implements o {
  private final List<h0.a> a;
  
  private final v[] b;
  
  private boolean c;
  
  private int d;
  
  private int e;
  
  private long f;
  
  public n(List<h0.a> paramList) {
    this.a = paramList;
    this.b = new v[paramList.size()];
  }
  
  private boolean a(v paramv, int paramInt) {
    if (paramv.a() == 0)
      return false; 
    if (paramv.z() != paramInt)
      this.c = false; 
    this.d--;
    return this.c;
  }
  
  public void b(v paramv) {
    if (this.c) {
      if (this.d == 2 && !a(paramv, 32))
        return; 
      int i = this.d;
      byte b = 0;
      if (i == 1 && !a(paramv, 0))
        return; 
      int j = paramv.c();
      i = paramv.a();
      v[] arrayOfV = this.b;
      int k = arrayOfV.length;
      while (b < k) {
        v v1 = arrayOfV[b];
        paramv.M(j);
        v1.b(paramv, i);
        b++;
      } 
      this.e += i;
    } 
  }
  
  public void c() {
    this.c = false;
  }
  
  public void d() {
    if (this.c) {
      v[] arrayOfV = this.b;
      int i = arrayOfV.length;
      for (byte b = 0; b < i; b++)
        arrayOfV[b].c(this.f, 1, this.e, 0, null); 
      this.c = false;
    } 
  }
  
  public void e(j paramj, h0.d paramd) {
    for (byte b = 0; b < this.b.length; b++) {
      h0.a a = this.a.get(b);
      paramd.a();
      v v1 = paramj.g(paramd.c(), 3);
      v1.d(Format.s(paramd.b(), "application/dvbsubs", null, -1, 0, Collections.singletonList(a.c), a.a, null));
      this.b[b] = v1;
    } 
  }
  
  public void f(long paramLong, int paramInt) {
    if ((paramInt & 0x4) == 0)
      return; 
    this.c = true;
    this.f = paramLong;
    this.e = 0;
    this.d = 2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */