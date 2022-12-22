package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.h.u.a.b;
import e.a.a;

public final class k implements b<j> {
  private final a<Context> a;
  
  private final a<h> b;
  
  public k(a<Context> parama, a<h> parama1) {
    this.a = parama;
    this.b = parama1;
  }
  
  public static k a(a<Context> parama, a<h> parama1) {
    return new k(parama, parama1);
  }
  
  public static j c(Context paramContext, Object paramObject) {
    return new j(paramContext, (h)paramObject);
  }
  
  public j b() {
    return c((Context)this.a.get(), this.b.get());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/backends/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */