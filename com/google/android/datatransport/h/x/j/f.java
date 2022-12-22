package com.google.android.datatransport.h.x.j;

import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.u.a.d;

public final class f implements b<String> {
  public static f a() {
    return a.a();
  }
  
  public static String b() {
    return (String)d.c(e.a(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public String c() {
    return b();
  }
  
  private static final class a {
    private static final f a = new f();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/j/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */