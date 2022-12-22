package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.util.v;

final class n {
  public e a;
  
  public long b;
  
  public long c;
  
  public long d;
  
  public int e;
  
  public int f;
  
  public long[] g;
  
  public int[] h;
  
  public int[] i;
  
  public int[] j;
  
  public long[] k;
  
  public boolean[] l;
  
  public boolean m;
  
  public boolean[] n;
  
  public m o;
  
  public int p;
  
  public v q;
  
  public boolean r;
  
  public long s;
  
  public void a(i parami) {
    parami.readFully(this.q.a, 0, this.p);
    this.q.M(0);
    this.r = false;
  }
  
  public void b(v paramv) {
    paramv.h(this.q.a, 0, this.p);
    this.q.M(0);
    this.r = false;
  }
  
  public long c(int paramInt) {
    return this.k[paramInt] + this.j[paramInt];
  }
  
  public void d(int paramInt) {
    v v1 = this.q;
    if (v1 == null || v1.d() < paramInt)
      this.q = new v(paramInt); 
    this.p = paramInt;
    this.m = true;
    this.r = true;
  }
  
  public void e(int paramInt1, int paramInt2) {
    this.e = paramInt1;
    this.f = paramInt2;
    int[] arrayOfInt = this.h;
    if (arrayOfInt == null || arrayOfInt.length < paramInt1) {
      this.g = new long[paramInt1];
      this.h = new int[paramInt1];
    } 
    arrayOfInt = this.i;
    if (arrayOfInt == null || arrayOfInt.length < paramInt2) {
      paramInt1 = paramInt2 * 125 / 100;
      this.i = new int[paramInt1];
      this.j = new int[paramInt1];
      this.k = new long[paramInt1];
      this.l = new boolean[paramInt1];
      this.n = new boolean[paramInt1];
    } 
  }
  
  public void f() {
    this.e = 0;
    this.s = 0L;
    this.m = false;
    this.r = false;
    this.o = null;
  }
  
  public boolean g(int paramInt) {
    boolean bool;
    if (this.m && this.n[paramInt]) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */