package com.google.android.gms.internal.ads;

import android.net.Uri;

final class ch2 implements fj2 {
  private final Uri a;
  
  private final ti2 b;
  
  private final fh2 c;
  
  private final lj2 d;
  
  private final te2 e;
  
  private volatile boolean f;
  
  private boolean g;
  
  private long h;
  
  private long i;
  
  public ch2(zg2 paramzg2, Uri paramUri, ti2 paramti2, fh2 paramfh2, lj2 paramlj2) {
    this.a = jj2.<Uri>d(paramUri);
    this.b = jj2.<ti2>d(paramti2);
    this.c = jj2.<fh2>d(paramfh2);
    this.d = paramlj2;
    this.e = new te2();
    this.g = true;
    this.i = -1L;
  }
  
  public final void a() {
    this.f = true;
  }
  
  public final void b() {
    int i = 0;
    while (!i && !this.f) {
      je2 je2;
      Exception exception;
      ne2 ne2 = null;
      try {
        long l1 = this.e.a;
        ti2 ti21 = this.b;
        xi2 xi2 = new xi2();
        this(this.a, l1, -1L, zg2.C(this.j));
        long l2 = ti21.a(xi2);
        this.i = l2;
        if (l2 != -1L)
          this.i = l2 + l1; 
        je2 je21 = new je2();
        this(this.b, l1, this.i);
        int j = i;
      } finally {
        Exception exception1 = null;
      } 
      if (i != 1 && je2 != null)
        this.e.a = je2.a(); 
      wj2.e(this.b);
      throw exception;
    } 
  }
  
  public final boolean c() {
    return this.f;
  }
  
  public final void e(long paramLong1, long paramLong2) {
    this.e.a = paramLong1;
    this.h = paramLong2;
    this.g = true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ch2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */