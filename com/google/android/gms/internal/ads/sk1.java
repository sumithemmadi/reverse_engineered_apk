package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

final class sk1 {
  private final long a;
  
  private final rk1 b = new rk1();
  
  private long c;
  
  private int d = 0;
  
  private int e = 0;
  
  private int f = 0;
  
  public sk1() {
    long l = q.j().a();
    this.a = l;
    this.c = l;
  }
  
  public final long a() {
    return this.a;
  }
  
  public final long b() {
    return this.c;
  }
  
  public final int c() {
    return this.d;
  }
  
  public final String d() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Created: ");
    stringBuilder.append(this.a);
    stringBuilder.append(" Last accessed: ");
    stringBuilder.append(this.c);
    stringBuilder.append(" Accesses: ");
    stringBuilder.append(this.d);
    stringBuilder.append("\nEntries retrieved: Valid: ");
    stringBuilder.append(this.e);
    stringBuilder.append(" Stale: ");
    stringBuilder.append(this.f);
    return stringBuilder.toString();
  }
  
  public final void e() {
    this.c = q.j().a();
    this.d++;
  }
  
  public final void f() {
    this.e++;
    this.b.b = true;
  }
  
  public final void g() {
    this.f++;
    rk1 rk11 = this.b;
    rk11.c++;
  }
  
  public final rk1 h() {
    rk1 rk11 = (rk1)this.b.clone();
    rk1 rk12 = this.b;
    rk12.b = false;
    rk12.c = 0;
    return rk11;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */