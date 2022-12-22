package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.e;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class ev extends qs2 {
  private final Context b;
  
  private final zzazn c;
  
  private final hm0 d;
  
  private final lv0<xi1, fx0> e;
  
  private final k11 f;
  
  private final np0 g;
  
  private final yj h;
  
  private final jm0 i;
  
  private boolean j;
  
  ev(Context paramContext, zzazn paramzzazn, hm0 paramhm0, lv0<xi1, fx0> paramlv0, k11 paramk11, np0 paramnp0, yj paramyj, jm0 paramjm0) {
    this.b = paramContext;
    this.c = paramzzazn;
    this.d = paramhm0;
    this.e = paramlv0;
    this.f = paramk11;
    this.g = paramnp0;
    this.h = paramyj;
    this.i = paramjm0;
    this.j = false;
  }
  
  public final void D() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Z
    //   6: ifeq -> 17
    //   9: ldc 'Mobile ads is initialized already.'
    //   11: invokestatic i : (Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield b : Landroid/content/Context;
    //   21: invokestatic a : (Landroid/content/Context;)V
    //   24: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   27: aload_0
    //   28: getfield b : Landroid/content/Context;
    //   31: aload_0
    //   32: getfield c : Lcom/google/android/gms/internal/ads/zzazn;
    //   35: invokevirtual k : (Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzazn;)V
    //   38: invokestatic i : ()Lcom/google/android/gms/internal/ads/dn2;
    //   41: aload_0
    //   42: getfield b : Landroid/content/Context;
    //   45: invokevirtual c : (Landroid/content/Context;)V
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield j : Z
    //   53: aload_0
    //   54: getfield g : Lcom/google/android/gms/internal/ads/np0;
    //   57: invokevirtual j : ()V
    //   60: getstatic com/google/android/gms/internal/ads/m0.r1 : Lcom/google/android/gms/internal/ads/x;
    //   63: astore_1
    //   64: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   67: aload_1
    //   68: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   71: checkcast java/lang/Boolean
    //   74: invokevirtual booleanValue : ()Z
    //   77: ifeq -> 87
    //   80: aload_0
    //   81: getfield f : Lcom/google/android/gms/internal/ads/k11;
    //   84: invokevirtual a : ()V
    //   87: getstatic com/google/android/gms/internal/ads/m0.K2 : Lcom/google/android/gms/internal/ads/x;
    //   90: astore_1
    //   91: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   94: aload_1
    //   95: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   98: checkcast java/lang/Boolean
    //   101: invokevirtual booleanValue : ()Z
    //   104: ifeq -> 114
    //   107: aload_0
    //   108: getfield i : Lcom/google/android/gms/internal/ads/jm0;
    //   111: invokevirtual a : ()V
    //   114: aload_0
    //   115: monitorexit
    //   116: return
    //   117: astore_1
    //   118: aload_0
    //   119: monitorexit
    //   120: aload_1
    //   121: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	117	finally
    //   17	87	117	finally
    //   87	114	117	finally
  }
  
  public final void D8(mb parammb) {
    this.d.c(parammb);
  }
  
  public final void H8() {
    this.g.a();
  }
  
  public final void I5(a8 parama8) {
    this.g.q(parama8);
  }
  
  public final void M8(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Landroid/content/Context;
    //   6: invokestatic a : (Landroid/content/Context;)V
    //   9: aload_1
    //   10: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   13: ifne -> 52
    //   16: getstatic com/google/android/gms/internal/ads/m0.J2 : Lcom/google/android/gms/internal/ads/x;
    //   19: astore_2
    //   20: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   23: aload_2
    //   24: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   27: checkcast java/lang/Boolean
    //   30: invokevirtual booleanValue : ()Z
    //   33: ifeq -> 52
    //   36: invokestatic k : ()Lcom/google/android/gms/ads/internal/e;
    //   39: aload_0
    //   40: getfield b : Landroid/content/Context;
    //   43: aload_0
    //   44: getfield c : Lcom/google/android/gms/internal/ads/zzazn;
    //   47: aload_1
    //   48: aconst_null
    //   49: invokevirtual b : (Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzazn;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   52: aload_0
    //   53: monitorexit
    //   54: return
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    // Exception table:
    //   from	to	target	type
    //   2	52	55	finally
  }
  
  public final boolean N8() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic h : ()Lcom/google/android/gms/ads/internal/util/f;
    //   5: invokevirtual e : ()Z
    //   8: istore_1
    //   9: aload_0
    //   10: monitorexit
    //   11: iload_1
    //   12: ireturn
    //   13: astore_2
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_2
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	13	finally
  }
  
  public final List<zzajh> O9() {
    return this.g.k();
  }
  
  public final void T7(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic h : ()Lcom/google/android/gms/ads/internal/util/f;
    //   5: fload_1
    //   6: invokevirtual b : (F)V
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: astore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_2
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	12	finally
  }
  
  public final void Y2(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic h : ()Lcom/google/android/gms/ads/internal/util/f;
    //   5: iload_1
    //   6: invokevirtual a : (Z)V
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: astore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_2
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	12	finally
  }
  
  public final void d8(zzaao paramzzaao) {
    this.h.d(this.b, paramzzaao);
  }
  
  public final String j5() {
    return this.c.b;
  }
  
  public final float r1() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic h : ()Lcom/google/android/gms/ads/internal/util/f;
    //   5: invokevirtual d : ()F
    //   8: fstore_1
    //   9: aload_0
    //   10: monitorexit
    //   11: fload_1
    //   12: freturn
    //   13: astore_2
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_2
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	13	finally
  }
  
  public final void s9(String paramString) {
    this.f.f(paramString);
  }
  
  public final void t1(a parama, String paramString) {
    if (parama == null) {
      cm.g("Wrapped context is null. Failed to open debug menu.");
      return;
    } 
    Context context = (Context)b.o1(parama);
    if (context == null) {
      cm.g("Context is null. Failed to open debug menu.");
      return;
    } 
    e e = new e(context);
    e.a(paramString);
    e.j(this.c.b);
    e.b();
  }
  
  public final void v5(String paramString, a parama) {
    String str;
    dv dv;
    m0.a(this.b);
    x<Boolean> x2 = m0.M2;
    if (((Boolean)er2.e().<Boolean>c(x2)).booleanValue()) {
      q.c();
      str = h1.J(this.b);
    } else {
      str = "";
    } 
    if (!TextUtils.isEmpty(str))
      paramString = str; 
    if (TextUtils.isEmpty(paramString))
      return; 
    x<Boolean> x1 = m0.J2;
    boolean bool1 = ((Boolean)er2.e().<Boolean>c(x1)).booleanValue();
    x<Boolean> x3 = m0.y0;
    boolean bool2 = bool1 | ((Boolean)er2.e().<Boolean>c(x3)).booleanValue();
    x1 = null;
    if (((Boolean)er2.e().<Boolean>c(x3)).booleanValue()) {
      bool2 = true;
      dv = new dv(this, (Runnable)b.o1(parama));
    } 
    if (bool2)
      q.k().b(this.b, this.c, paramString, dv); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */