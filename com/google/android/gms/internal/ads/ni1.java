package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Iterator;
import java.util.List;

public final class ni1 {
  private final nh1 a;
  
  private final sh1 b;
  
  private final pu0 c;
  
  private final jn1 d;
  
  public ni1(pu0 parampu0, jn1 paramjn1, nh1 paramnh1, sh1 paramsh1) {
    this.a = paramnh1;
    this.b = paramsh1;
    this.c = parampu0;
    this.d = paramjn1;
  }
  
  private final void b(String paramString, int paramInt) {
    if (!this.a.d0) {
      this.d.a(paramString);
      return;
    } 
    av0 av0 = new av0(q.j().a(), this.b.b, paramString, paramInt);
    this.c.o(av0);
  }
  
  public final void a(List<String> paramList, Integer paramInteger) {
    Iterator<String> iterator = paramList.iterator();
    while (iterator.hasNext())
      b(iterator.next(), paramInteger); 
  }
  
  public final void c(List<String> paramList) {
    Iterator<String> iterator = paramList.iterator();
    while (iterator.hasNext())
      b(iterator.next(), qu0.b); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ni1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */