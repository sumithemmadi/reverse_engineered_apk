package com.google.android.datatransport.h;

import android.content.Context;
import com.google.android.datatransport.b;
import com.google.android.datatransport.f;
import com.google.android.datatransport.g;
import com.google.android.datatransport.h.x.e;
import com.google.android.datatransport.h.y.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.p;
import java.util.Collections;
import java.util.Set;

public class r implements q {
  private static volatile s a;
  
  private final a b;
  
  private final a c;
  
  private final e d;
  
  private final l e;
  
  r(a parama1, a parama2, e parame, l paraml, p paramp) {
    this.b = parama1;
    this.c = parama2;
    this.d = parame;
    this.e = paraml;
    paramp.a();
  }
  
  private h b(l paraml) {
    return h.a().i(this.b.a()).k(this.c.a()).j(paraml.g()).h(new g(paraml.b(), paraml.d())).g(paraml.c().a()).d();
  }
  
  public static r c() {
    s s1 = a;
    if (s1 != null)
      return s1.c(); 
    throw new IllegalStateException("Not initialized!");
  }
  
  private static Set<b> d(e parame) {
    return (parame instanceof f) ? Collections.unmodifiableSet(((f)parame).a()) : Collections.singleton(b.b("proto"));
  }
  
  public static void f(Context paramContext) {
    // Byte code:
    //   0: getstatic com/google/android/datatransport/h/r.a : Lcom/google/android/datatransport/h/s;
    //   3: ifnonnull -> 44
    //   6: ldc com/google/android/datatransport/h/r
    //   8: monitorenter
    //   9: getstatic com/google/android/datatransport/h/r.a : Lcom/google/android/datatransport/h/s;
    //   12: ifnonnull -> 32
    //   15: invokestatic d : ()Lcom/google/android/datatransport/h/s$a;
    //   18: aload_0
    //   19: invokeinterface b : (Landroid/content/Context;)Lcom/google/android/datatransport/h/s$a;
    //   24: invokeinterface a : ()Lcom/google/android/datatransport/h/s;
    //   29: putstatic com/google/android/datatransport/h/r.a : Lcom/google/android/datatransport/h/s;
    //   32: ldc com/google/android/datatransport/h/r
    //   34: monitorexit
    //   35: goto -> 44
    //   38: astore_0
    //   39: ldc com/google/android/datatransport/h/r
    //   41: monitorexit
    //   42: aload_0
    //   43: athrow
    //   44: return
    // Exception table:
    //   from	to	target	type
    //   9	32	38	finally
    //   32	35	38	finally
    //   39	42	38	finally
  }
  
  public void a(l paraml, g paramg) {
    this.d.a(paraml.f().e(paraml.c().c()), b(paraml), paramg);
  }
  
  public l e() {
    return this.e;
  }
  
  public f g(e parame) {
    return new n(d(parame), m.a().b(parame.getName()).c(parame.d()).a(), this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */