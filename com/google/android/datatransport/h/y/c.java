package com.google.android.datatransport.h.y;

import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.u.a.d;

public final class c implements b<a> {
  public static c a() {
    return a.a();
  }
  
  public static a b() {
    return (a)d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public a c() {
    return b();
  }
  
  private static final class a {
    private static final c a = new c();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/y/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */