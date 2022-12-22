package com.allinone.callerid.util.gg;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.u;

public class c {
  private static volatile c a;
  
  private g b;
  
  public static c c() {
    // Byte code:
    //   0: getstatic com/allinone/callerid/util/gg/c.a : Lcom/allinone/callerid/util/gg/c;
    //   3: ifnonnull -> 39
    //   6: ldc com/allinone/callerid/util/gg/c
    //   8: monitorenter
    //   9: getstatic com/allinone/callerid/util/gg/c.a : Lcom/allinone/callerid/util/gg/c;
    //   12: ifnonnull -> 27
    //   15: new com/allinone/callerid/util/gg/c
    //   18: astore_0
    //   19: aload_0
    //   20: invokespecial <init> : ()V
    //   23: aload_0
    //   24: putstatic com/allinone/callerid/util/gg/c.a : Lcom/allinone/callerid/util/gg/c;
    //   27: ldc com/allinone/callerid/util/gg/c
    //   29: monitorexit
    //   30: goto -> 39
    //   33: astore_0
    //   34: ldc com/allinone/callerid/util/gg/c
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    //   39: getstatic com/allinone/callerid/util/gg/c.a : Lcom/allinone/callerid/util/gg/c;
    //   42: areturn
    // Exception table:
    //   from	to	target	type
    //   9	27	33	finally
    //   27	30	33	finally
    //   34	37	33	finally
  }
  
  public void b() {
    this.b = null;
  }
  
  public void d(Context paramContext, String paramString, c paramc) {
    g g1 = this.b;
    if (g1 != null && paramc != null)
      paramc.b(g1); 
    if (paramContext != null && paramString != null) {
      d.a a = new d.a(paramContext, paramString);
      a.e(new a(this, paramc));
      u u = (new u.a()).b(true).a();
      a.g((new com.google.android.gms.ads.formats.b.a()).h(u).a());
      a.f(new b(this, paramc)).a().b((new e.a()).b(MediationNativeAdapter.class, new Bundle()).d());
    } 
  }
  
  class a implements g.a {
    a(c this$0, c.c param1c) {}
    
    public void r(g param1g) {
      c.a(this.c, param1g);
      c.c c1 = this.b;
      if (c1 != null)
        c1.b(param1g); 
    }
  }
  
  class b extends com.google.android.gms.ads.b {
    b(c this$0, c.c param1c) {}
    
    public void C() {
      super.C();
      c.c c1 = this.a;
      if (c1 != null)
        c1.a(); 
    }
  }
  
  public static interface c {
    void a();
    
    void b(g param1g);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/gg/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */