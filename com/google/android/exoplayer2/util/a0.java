package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.v;

public final class a0 implements q {
  private final f b;
  
  private boolean c;
  
  private long d;
  
  private long e;
  
  private l0 f;
  
  public a0(f paramf) {
    this.b = paramf;
    this.f = l0.a;
  }
  
  public l0 W() {
    return this.f;
  }
  
  public void a(long paramLong) {
    this.d = paramLong;
    if (this.c)
      this.e = this.b.b(); 
  }
  
  public void b() {
    if (!this.c) {
      this.e = this.b.b();
      this.c = true;
    } 
  }
  
  public long c() {
    long l1 = this.d;
    long l2 = l1;
    if (this.c) {
      l2 = this.b.b() - this.e;
      l0 l01 = this.f;
      if (l01.b == 1.0F) {
        l2 = v.a(l2);
      } else {
        l2 = l01.a(l2);
      } 
      l2 = l1 + l2;
    } 
    return l2;
  }
  
  public void d() {
    if (this.c) {
      a(c());
      this.c = false;
    } 
  }
  
  public void d1(l0 paraml0) {
    if (this.c)
      a(c()); 
    this.f = paraml0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */