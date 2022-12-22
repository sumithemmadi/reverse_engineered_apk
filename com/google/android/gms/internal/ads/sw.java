package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.common.util.e;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class sw implements p, f50, i50, yk2 {
  private final nw b;
  
  private final qw c;
  
  private final Set<tq> d = new HashSet<tq>();
  
  private final db<JSONObject, JSONObject> e;
  
  private final Executor f;
  
  private final e g;
  
  private final AtomicBoolean h = new AtomicBoolean(false);
  
  private final vw i = new vw();
  
  private boolean j = false;
  
  private WeakReference<?> k = new WeakReference(this);
  
  public sw(wa paramwa, qw paramqw, Executor paramExecutor, nw paramnw, e parame) {
    this.b = paramnw;
    na<JSONObject> na = ma.b;
    this.e = paramwa.a("google.afma.activeView.handleUpdate", na, na);
    this.c = paramqw;
    this.f = paramExecutor;
    this.g = parame;
  }
  
  private final void l() {
    for (tq tq : this.d)
      this.b.g(tq); 
    this.b.e();
  }
  
  public final void D(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Lcom/google/android/gms/internal/ads/vw;
    //   6: iconst_1
    //   7: putfield b : Z
    //   10: aload_0
    //   11: invokevirtual i : ()V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  public final void M0() {}
  
  public final void R5(zzn paramzzn) {}
  
  public final void S() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: iconst_0
    //   7: iconst_1
    //   8: invokevirtual compareAndSet : (ZZ)Z
    //   11: ifeq -> 26
    //   14: aload_0
    //   15: getfield b : Lcom/google/android/gms/internal/ads/nw;
    //   18: aload_0
    //   19: invokevirtual c : (Lcom/google/android/gms/internal/ads/sw;)V
    //   22: aload_0
    //   23: invokevirtual i : ()V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	29	finally
  }
  
  public final void i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Ljava/lang/ref/WeakReference;
    //   6: invokevirtual get : ()Ljava/lang/Object;
    //   9: ifnull -> 17
    //   12: iconst_1
    //   13: istore_1
    //   14: goto -> 19
    //   17: iconst_0
    //   18: istore_1
    //   19: iload_1
    //   20: ifne -> 30
    //   23: aload_0
    //   24: invokevirtual n : ()V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: aload_0
    //   31: getfield j : Z
    //   34: ifne -> 166
    //   37: aload_0
    //   38: getfield h : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   41: invokevirtual get : ()Z
    //   44: istore_2
    //   45: iload_2
    //   46: ifeq -> 166
    //   49: aload_0
    //   50: getfield i : Lcom/google/android/gms/internal/ads/vw;
    //   53: aload_0
    //   54: getfield g : Lcom/google/android/gms/common/util/e;
    //   57: invokeinterface b : ()J
    //   62: putfield d : J
    //   65: aload_0
    //   66: getfield c : Lcom/google/android/gms/internal/ads/qw;
    //   69: aload_0
    //   70: getfield i : Lcom/google/android/gms/internal/ads/vw;
    //   73: invokevirtual b : (Lcom/google/android/gms/internal/ads/vw;)Lorg/json/JSONObject;
    //   76: astore_3
    //   77: aload_0
    //   78: getfield d : Ljava/util/Set;
    //   81: invokeinterface iterator : ()Ljava/util/Iterator;
    //   86: astore #4
    //   88: aload #4
    //   90: invokeinterface hasNext : ()Z
    //   95: ifeq -> 141
    //   98: aload #4
    //   100: invokeinterface next : ()Ljava/lang/Object;
    //   105: checkcast com/google/android/gms/internal/ads/tq
    //   108: astore #5
    //   110: aload_0
    //   111: getfield f : Ljava/util/concurrent/Executor;
    //   114: astore #6
    //   116: new com/google/android/gms/internal/ads/ww
    //   119: astore #7
    //   121: aload #7
    //   123: aload #5
    //   125: aload_3
    //   126: invokespecial <init> : (Lcom/google/android/gms/internal/ads/tq;Lorg/json/JSONObject;)V
    //   129: aload #6
    //   131: aload #7
    //   133: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   138: goto -> 88
    //   141: aload_0
    //   142: getfield e : Lcom/google/android/gms/internal/ads/db;
    //   145: aload_3
    //   146: invokevirtual a : (Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ot1;
    //   149: ldc 'ActiveViewListener.callActiveViewJs'
    //   151: invokestatic b : (Lcom/google/android/gms/internal/ads/ot1;Ljava/lang/String;)V
    //   154: aload_0
    //   155: monitorexit
    //   156: return
    //   157: astore #6
    //   159: ldc 'Failed to call ActiveViewJS'
    //   161: aload #6
    //   163: invokestatic l : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   166: aload_0
    //   167: monitorexit
    //   168: return
    //   169: astore #6
    //   171: aload_0
    //   172: monitorexit
    //   173: goto -> 179
    //   176: aload #6
    //   178: athrow
    //   179: goto -> 176
    // Exception table:
    //   from	to	target	type
    //   2	12	169	finally
    //   23	27	169	finally
    //   30	45	169	finally
    //   49	88	157	java/lang/Exception
    //   49	88	169	finally
    //   88	138	157	java/lang/Exception
    //   88	138	169	finally
    //   141	154	157	java/lang/Exception
    //   141	154	169	finally
    //   159	166	169	finally
  }
  
  public final void k0(zk2 paramzk2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Lcom/google/android/gms/internal/ads/vw;
    //   6: astore_2
    //   7: aload_2
    //   8: aload_1
    //   9: getfield m : Z
    //   12: putfield a : Z
    //   15: aload_2
    //   16: aload_1
    //   17: putfield f : Lcom/google/android/gms/internal/ads/zk2;
    //   20: aload_0
    //   21: invokevirtual i : ()V
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	27	finally
  }
  
  public final void n() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial l : ()V
    //   6: aload_0
    //   7: iconst_1
    //   8: putfield j : Z
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	14	finally
  }
  
  public final void onPause() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Lcom/google/android/gms/internal/ads/vw;
    //   6: iconst_1
    //   7: putfield b : Z
    //   10: aload_0
    //   11: invokevirtual i : ()V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  public final void onResume() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Lcom/google/android/gms/internal/ads/vw;
    //   6: iconst_0
    //   7: putfield b : Z
    //   10: aload_0
    //   11: invokevirtual i : ()V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  public final void r(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Lcom/google/android/gms/internal/ads/vw;
    //   6: ldc 'u'
    //   8: putfield e : Ljava/lang/String;
    //   11: aload_0
    //   12: invokevirtual i : ()V
    //   15: aload_0
    //   16: invokespecial l : ()V
    //   19: aload_0
    //   20: iconst_1
    //   21: putfield j : Z
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	27	finally
  }
  
  public final void s(tq paramtq) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Ljava/util/Set;
    //   6: aload_1
    //   7: invokeinterface add : (Ljava/lang/Object;)Z
    //   12: pop
    //   13: aload_0
    //   14: getfield b : Lcom/google/android/gms/internal/ads/nw;
    //   17: aload_1
    //   18: invokevirtual b : (Lcom/google/android/gms/internal/ads/tq;)V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	24	finally
  }
  
  public final void t(Object paramObject) {
    this.k = new WeakReference(paramObject);
  }
  
  public final void u9() {}
  
  public final void y(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Lcom/google/android/gms/internal/ads/vw;
    //   6: iconst_0
    //   7: putfield b : Z
    //   10: aload_0
    //   11: invokevirtual i : ()V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */