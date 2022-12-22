package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import c.c.a.c.a.a.c;
import com.google.android.play.core.internal.a;
import java.util.LinkedHashSet;
import java.util.Set;

public final class o extends c<a> {
  private static o g;
  
  private final Handler h = new Handler(Looper.getMainLooper());
  
  private final e i;
  
  private final Set<b> j = new LinkedHashSet<b>();
  
  public o(Context paramContext, e parame) {
    super(new a("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), paramContext);
    this.i = parame;
  }
  
  public static o f(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/play/core/splitinstall/o
    //   2: monitorenter
    //   3: getstatic com/google/android/play/core/splitinstall/o.g : Lcom/google/android/play/core/splitinstall/o;
    //   6: ifnonnull -> 25
    //   9: new com/google/android/play/core/splitinstall/o
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: getstatic com/google/android/play/core/splitinstall/l.b : Lcom/google/android/play/core/splitinstall/l;
    //   18: invokespecial <init> : (Landroid/content/Context;Lcom/google/android/play/core/splitinstall/e;)V
    //   21: aload_1
    //   22: putstatic com/google/android/play/core/splitinstall/o.g : Lcom/google/android/play/core/splitinstall/o;
    //   25: getstatic com/google/android/play/core/splitinstall/o.g : Lcom/google/android/play/core/splitinstall/o;
    //   28: astore_0
    //   29: ldc com/google/android/play/core/splitinstall/o
    //   31: monitorexit
    //   32: aload_0
    //   33: areturn
    //   34: astore_0
    //   35: ldc com/google/android/play/core/splitinstall/o
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   3	25	34	finally
    //   25	29	34	finally
  }
  
  protected final void a(Context paramContext, Intent paramIntent) {
    Bundle bundle = paramIntent.getBundleExtra("session_state");
    if (bundle == null)
      return; 
    a a = a.e(bundle);
    this.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[] { a });
    f f = this.i.a();
    if (a.i() == 3 && f != null) {
      f.a(a.d(), (d)new m(this, a, paramIntent, paramContext));
      return;
    } 
    g(a);
  }
  
  public final void g(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/LinkedHashSet
    //   5: astore_2
    //   6: aload_2
    //   7: aload_0
    //   8: getfield j : Ljava/util/Set;
    //   11: invokespecial <init> : (Ljava/util/Collection;)V
    //   14: aload_2
    //   15: invokevirtual iterator : ()Ljava/util/Iterator;
    //   18: astore_2
    //   19: aload_2
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 46
    //   28: aload_2
    //   29: invokeinterface next : ()Ljava/lang/Object;
    //   34: checkcast com/google/android/play/core/splitinstall/b
    //   37: aload_1
    //   38: invokeinterface a : (Ljava/lang/Object;)V
    //   43: goto -> 19
    //   46: aload_0
    //   47: aload_1
    //   48: invokespecial d : (Ljava/lang/Object;)V
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: astore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: goto -> 62
    //   60: aload_1
    //   61: athrow
    //   62: goto -> 60
    // Exception table:
    //   from	to	target	type
    //   2	19	54	finally
    //   19	43	54	finally
    //   46	51	54	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitinstall/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */