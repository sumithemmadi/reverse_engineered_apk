package com.bumptech.glide.load.engine;

import b.h.j.f;
import com.bumptech.glide.p.j;
import com.bumptech.glide.p.l.a;
import com.bumptech.glide.p.l.c;

final class r<Z> implements s<Z>, a.f {
  private static final f<r<?>> b = a.d(20, new a());
  
  private final c c = c.a();
  
  private s<Z> d;
  
  private boolean e;
  
  private boolean f;
  
  private void d(s<Z> params) {
    this.f = false;
    this.e = true;
    this.d = params;
  }
  
  static <Z> r<Z> e(s<Z> params) {
    r<Z> r1 = (r)j.d(b.b());
    r1.d(params);
    return r1;
  }
  
  private void f() {
    this.d = null;
    b.c(this);
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/bumptech/glide/p/l/c;
    //   6: invokevirtual c : ()V
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield f : Z
    //   14: aload_0
    //   15: getfield e : Z
    //   18: ifne -> 34
    //   21: aload_0
    //   22: getfield d : Lcom/bumptech/glide/load/engine/s;
    //   25: invokeinterface a : ()V
    //   30: aload_0
    //   31: invokespecial f : ()V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	34	37	finally
  }
  
  public int b() {
    return this.d.b();
  }
  
  public Class<Z> c() {
    return this.d.c();
  }
  
  void g() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/bumptech/glide/p/l/c;
    //   6: invokevirtual c : ()V
    //   9: aload_0
    //   10: getfield e : Z
    //   13: ifeq -> 35
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield e : Z
    //   21: aload_0
    //   22: getfield f : Z
    //   25: ifeq -> 32
    //   28: aload_0
    //   29: invokevirtual a : ()V
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: new java/lang/IllegalStateException
    //   38: astore_1
    //   39: aload_1
    //   40: ldc 'Already unlocked'
    //   42: invokespecial <init> : (Ljava/lang/String;)V
    //   45: aload_1
    //   46: athrow
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   2	32	47	finally
    //   35	47	47	finally
  }
  
  public Z get() {
    return this.d.get();
  }
  
  public c i() {
    return this.c;
  }
  
  class a implements a.d<r<?>> {
    public r<?> b() {
      return new r();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */