package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.LinkedList;

final class pj1 {
  private final LinkedList<bk1<?>> a = new LinkedList<bk1<?>>();
  
  private final int b;
  
  private final int c;
  
  private final sk1 d;
  
  public pj1(int paramInt1, int paramInt2) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = new sk1();
  }
  
  private final void h() {
    while (!this.a.isEmpty()) {
      boolean bool;
      bk1 bk1 = this.a.getFirst();
      if (q.j().a() - bk1.d >= this.c) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        this.d.g();
        this.a.remove();
      } 
    } 
  }
  
  public final long a() {
    return this.d.a();
  }
  
  public final int b() {
    h();
    return this.a.size();
  }
  
  public final bk1<?> c() {
    this.d.e();
    h();
    if (this.a.isEmpty())
      return null; 
    bk1<?> bk1 = this.a.remove();
    if (bk1 != null)
      this.d.f(); 
    return bk1;
  }
  
  public final long d() {
    return this.d.b();
  }
  
  public final int e() {
    return this.d.c();
  }
  
  public final String f() {
    return this.d.d();
  }
  
  public final rk1 g() {
    return this.d.h();
  }
  
  public final boolean i(bk1<?> parambk1) {
    this.d.e();
    h();
    if (this.a.size() == this.b)
      return false; 
    this.a.add(parambk1);
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */