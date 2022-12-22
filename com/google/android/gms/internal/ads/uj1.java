package com.google.android.gms.internal.ads;

final class uj1 {
  private final wj1 a = new wj1();
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  public final void a() {
    this.d++;
  }
  
  public final void b() {
    this.e++;
  }
  
  public final void c() {
    this.b++;
    this.a.b = true;
  }
  
  public final void d() {
    this.c++;
    this.a.c = true;
  }
  
  public final void e() {
    this.f++;
  }
  
  public final wj1 f() {
    wj1 wj11 = (wj1)this.a.clone();
    wj1 wj12 = this.a;
    wj12.b = false;
    wj12.c = false;
    return wj11;
  }
  
  public final String g() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("\n\tPool does not exist: ");
    stringBuilder.append(this.d);
    stringBuilder.append("\n\tNew pools created: ");
    stringBuilder.append(this.b);
    stringBuilder.append("\n\tPools removed: ");
    stringBuilder.append(this.c);
    stringBuilder.append("\n\tEntries added: ");
    stringBuilder.append(this.f);
    stringBuilder.append("\n\tNo entries retrieved: ");
    stringBuilder.append(this.e);
    stringBuilder.append("\n");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */