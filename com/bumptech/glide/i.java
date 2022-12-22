package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.j.g.c;
import com.bumptech.glide.manager.c;
import com.bumptech.glide.manager.d;
import com.bumptech.glide.manager.l;
import com.bumptech.glide.manager.m;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.manager.s;
import com.bumptech.glide.p.k;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.c;
import com.bumptech.glide.request.d;
import com.bumptech.glide.request.e;
import com.bumptech.glide.request.h.h;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class i implements ComponentCallbacks2, m {
  private static final e b = (e)e.q0(Bitmap.class).U();
  
  private static final e c = (e)e.q0(c.class).U();
  
  private static final e d = (e)((e)e.r0(h.c).d0(Priority.e)).k0(true);
  
  protected final c e;
  
  protected final Context f;
  
  final l g;
  
  private final q h;
  
  private final p i;
  
  private final s j = new s();
  
  private final Runnable k;
  
  private final c l;
  
  private final CopyOnWriteArrayList<d<Object>> m;
  
  private e n;
  
  private boolean o;
  
  public i(c paramc, l paraml, p paramp, Context paramContext) {
    this(paramc, paraml, paramp, new q(), paramc.g(), paramContext);
  }
  
  i(c paramc, l paraml, p paramp, q paramq, d paramd, Context paramContext) {
    a a = new a(this);
    this.k = a;
    this.e = paramc;
    this.g = paraml;
    this.i = paramp;
    this.h = paramq;
    this.f = paramContext;
    c c1 = paramd.a(paramContext.getApplicationContext(), new b(this, paramq));
    this.l = c1;
    if (k.p()) {
      k.t(a);
    } else {
      paraml.a(this);
    } 
    paraml.a((m)c1);
    this.m = new CopyOnWriteArrayList<d<Object>>(paramc.i().c());
    x(paramc.i().d());
    paramc.o(this);
  }
  
  private void A(h<?> paramh) {
    boolean bool = z(paramh);
    c c1 = paramh.f();
    if (!bool && !this.e.p(paramh) && c1 != null) {
      paramh.c(null);
      c1.clear();
    } 
  }
  
  public void X() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual u : ()V
    //   6: aload_0
    //   7: getfield j : Lcom/bumptech/glide/manager/s;
    //   10: invokevirtual X : ()V
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	16	finally
  }
  
  public <ResourceType> h<ResourceType> i(Class<ResourceType> paramClass) {
    return new h<ResourceType>(this.e, this, paramClass, this.f);
  }
  
  public h<Bitmap> j() {
    return i(Bitmap.class).r0((a<?>)b);
  }
  
  public h<Drawable> k() {
    return i(Drawable.class);
  }
  
  public void l(h<?> paramh) {
    if (paramh == null)
      return; 
    A(paramh);
  }
  
  List<d<Object>> m() {
    return this.m;
  }
  
  e n() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield n : Lcom/bumptech/glide/request/e;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  <T> j<?, T> o(Class<T> paramClass) {
    return this.e.i().e(paramClass);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public void onDestroy() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/bumptech/glide/manager/s;
    //   6: invokevirtual onDestroy : ()V
    //   9: aload_0
    //   10: getfield j : Lcom/bumptech/glide/manager/s;
    //   13: invokevirtual j : ()Ljava/util/List;
    //   16: invokeinterface iterator : ()Ljava/util/Iterator;
    //   21: astore_1
    //   22: aload_1
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 47
    //   31: aload_0
    //   32: aload_1
    //   33: invokeinterface next : ()Ljava/lang/Object;
    //   38: checkcast com/bumptech/glide/request/h/h
    //   41: invokevirtual l : (Lcom/bumptech/glide/request/h/h;)V
    //   44: goto -> 22
    //   47: aload_0
    //   48: getfield j : Lcom/bumptech/glide/manager/s;
    //   51: invokevirtual i : ()V
    //   54: aload_0
    //   55: getfield h : Lcom/bumptech/glide/manager/q;
    //   58: invokevirtual b : ()V
    //   61: aload_0
    //   62: getfield g : Lcom/bumptech/glide/manager/l;
    //   65: aload_0
    //   66: invokeinterface b : (Lcom/bumptech/glide/manager/m;)V
    //   71: aload_0
    //   72: getfield g : Lcom/bumptech/glide/manager/l;
    //   75: aload_0
    //   76: getfield l : Lcom/bumptech/glide/manager/c;
    //   79: invokeinterface b : (Lcom/bumptech/glide/manager/m;)V
    //   84: aload_0
    //   85: getfield k : Ljava/lang/Runnable;
    //   88: invokestatic u : (Ljava/lang/Runnable;)V
    //   91: aload_0
    //   92: getfield e : Lcom/bumptech/glide/c;
    //   95: aload_0
    //   96: invokevirtual s : (Lcom/bumptech/glide/i;)V
    //   99: aload_0
    //   100: monitorexit
    //   101: return
    //   102: astore_1
    //   103: aload_0
    //   104: monitorexit
    //   105: goto -> 110
    //   108: aload_1
    //   109: athrow
    //   110: goto -> 108
    // Exception table:
    //   from	to	target	type
    //   2	22	102	finally
    //   22	44	102	finally
    //   47	99	102	finally
  }
  
  public void onLowMemory() {}
  
  public void onStart() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual v : ()V
    //   6: aload_0
    //   7: getfield j : Lcom/bumptech/glide/manager/s;
    //   10: invokevirtual onStart : ()V
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	16	finally
  }
  
  public void onTrimMemory(int paramInt) {
    if (paramInt == 60 && this.o)
      t(); 
  }
  
  public h<Drawable> p(Uri paramUri) {
    return k().E0(paramUri);
  }
  
  public h<Drawable> q(Object paramObject) {
    return k().G0(paramObject);
  }
  
  public h<Drawable> r(String paramString) {
    return k().H0(paramString);
  }
  
  public void s() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Lcom/bumptech/glide/manager/q;
    //   6: invokevirtual c : ()V
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	12	finally
  }
  
  public void t() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual s : ()V
    //   6: aload_0
    //   7: getfield i : Lcom/bumptech/glide/manager/p;
    //   10: invokeinterface a : ()Ljava/util/Set;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_1
    //   21: aload_1
    //   22: invokeinterface hasNext : ()Z
    //   27: ifeq -> 45
    //   30: aload_1
    //   31: invokeinterface next : ()Ljava/lang/Object;
    //   36: checkcast com/bumptech/glide/i
    //   39: invokevirtual s : ()V
    //   42: goto -> 21
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: goto -> 56
    //   54: aload_1
    //   55: athrow
    //   56: goto -> 54
    // Exception table:
    //   from	to	target	type
    //   2	21	48	finally
    //   21	42	48	finally
  }
  
  public String toString() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/lang/StringBuilder
    //   5: astore_1
    //   6: aload_1
    //   7: invokespecial <init> : ()V
    //   10: aload_1
    //   11: aload_0
    //   12: invokespecial toString : ()Ljava/lang/String;
    //   15: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: pop
    //   19: aload_1
    //   20: ldc_w '{tracker='
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: aload_1
    //   28: aload_0
    //   29: getfield h : Lcom/bumptech/glide/manager/q;
    //   32: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload_1
    //   37: ldc_w ', treeNode='
    //   40: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_1
    //   45: aload_0
    //   46: getfield i : Lcom/bumptech/glide/manager/p;
    //   49: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload_1
    //   54: ldc_w '}'
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload_1
    //   62: invokevirtual toString : ()Ljava/lang/String;
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: areturn
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    // Exception table:
    //   from	to	target	type
    //   2	66	70	finally
  }
  
  public void u() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Lcom/bumptech/glide/manager/q;
    //   6: invokevirtual d : ()V
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	12	finally
  }
  
  public void v() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Lcom/bumptech/glide/manager/q;
    //   6: invokevirtual f : ()V
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	12	finally
  }
  
  public i w(e parame) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual x : (Lcom/bumptech/glide/request/e;)V
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_0
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  protected void x(e parame) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual i : ()Lcom/bumptech/glide/request/a;
    //   7: checkcast com/bumptech/glide/request/e
    //   10: invokevirtual b : ()Lcom/bumptech/glide/request/a;
    //   13: checkcast com/bumptech/glide/request/e
    //   16: putfield n : Lcom/bumptech/glide/request/e;
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	22	finally
  }
  
  void y(h<?> paramh, c paramc) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Lcom/bumptech/glide/manager/s;
    //   6: aload_1
    //   7: invokevirtual k : (Lcom/bumptech/glide/request/h/h;)V
    //   10: aload_0
    //   11: getfield h : Lcom/bumptech/glide/manager/q;
    //   14: aload_2
    //   15: invokevirtual g : (Lcom/bumptech/glide/request/c;)V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	21	finally
  }
  
  boolean z(h<?> paramh) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokeinterface f : ()Lcom/bumptech/glide/request/c;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: iconst_1
    //   16: ireturn
    //   17: aload_0
    //   18: getfield h : Lcom/bumptech/glide/manager/q;
    //   21: aload_2
    //   22: invokevirtual a : (Lcom/bumptech/glide/request/c;)Z
    //   25: ifeq -> 47
    //   28: aload_0
    //   29: getfield j : Lcom/bumptech/glide/manager/s;
    //   32: aload_1
    //   33: invokevirtual l : (Lcom/bumptech/glide/request/h/h;)V
    //   36: aload_1
    //   37: aconst_null
    //   38: invokeinterface c : (Lcom/bumptech/glide/request/c;)V
    //   43: aload_0
    //   44: monitorexit
    //   45: iconst_1
    //   46: ireturn
    //   47: aload_0
    //   48: monitorexit
    //   49: iconst_0
    //   50: ireturn
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	51	finally
    //   17	43	51	finally
  }
  
  class a implements Runnable {
    a(i this$0) {}
    
    public void run() {
      i i1 = this.b;
      i1.g.a(i1);
    }
  }
  
  private class b implements c.a {
    private final q a;
    
    b(i this$0, q param1q) {
      this.a = param1q;
    }
    
    public void a(boolean param1Boolean) {
      if (param1Boolean)
        synchronized (this.b) {
          this.a.e();
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */