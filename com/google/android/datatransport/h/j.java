package com.google.android.datatransport.h;

import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.u.a.d;
import java.util.concurrent.Executor;

public final class j implements b<Executor> {
  public static j a() {
    return a.a();
  }
  
  public static Executor b() {
    return (Executor)d.c(i.a(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public Executor c() {
    return b();
  }
  
  private static final class a {
    private static final j a = new j();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */