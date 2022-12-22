package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.y.a;
import e.a.a;

public final class i implements b<h> {
  private final a<Context> a;
  
  private final a<a> b;
  
  private final a<a> c;
  
  public i(a<Context> parama, a<a> parama1, a<a> parama2) {
    this.a = parama;
    this.b = parama1;
    this.c = parama2;
  }
  
  public static i a(a<Context> parama, a<a> parama1, a<a> parama2) {
    return new i(parama, parama1, parama2);
  }
  
  public static h c(Context paramContext, a parama1, a parama2) {
    return new h(paramContext, parama1, parama2);
  }
  
  public h b() {
    return c((Context)this.a.get(), (a)this.b.get(), (a)this.c.get());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/backends/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */