package com.google.android.gms.internal.ads;

import b.e.g;
import java.util.ArrayList;

public final class ag0 {
  public static final ag0 a = (new cg0()).b();
  
  private final n4 b;
  
  private final m4 c;
  
  private final c5 d;
  
  private final b5 e;
  
  private final p8 f;
  
  private final g<String, t4> g;
  
  private final g<String, s4> h;
  
  private ag0(cg0 paramcg0) {
    this.b = paramcg0.a;
    this.c = paramcg0.b;
    this.d = paramcg0.c;
    this.g = new g(paramcg0.f);
    this.h = new g(paramcg0.g);
    this.e = paramcg0.d;
    this.f = paramcg0.e;
  }
  
  public final n4 a() {
    return this.b;
  }
  
  public final m4 b() {
    return this.c;
  }
  
  public final c5 c() {
    return this.d;
  }
  
  public final b5 d() {
    return this.e;
  }
  
  public final p8 e() {
    return this.f;
  }
  
  public final ArrayList<String> f() {
    ArrayList<String> arrayList = new ArrayList();
    if (this.d != null)
      arrayList.add(Integer.toString(6)); 
    if (this.b != null)
      arrayList.add(Integer.toString(1)); 
    if (this.c != null)
      arrayList.add(Integer.toString(2)); 
    if (this.g.size() > 0)
      arrayList.add(Integer.toString(3)); 
    if (this.f != null)
      arrayList.add(Integer.toString(7)); 
    return arrayList;
  }
  
  public final ArrayList<String> g() {
    ArrayList<String> arrayList = new ArrayList(this.g.size());
    for (byte b = 0; b < this.g.size(); b++)
      arrayList.add((String)this.g.i(b)); 
    return arrayList;
  }
  
  public final t4 h(String paramString) {
    return (t4)this.g.get(paramString);
  }
  
  public final s4 i(String paramString) {
    return (s4)this.h.get(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ag0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */