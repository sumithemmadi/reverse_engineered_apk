package c.c.a.c.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.splitcompat.q;
import java.util.HashSet;
import java.util.Set;

public abstract class c<StateT> {
  protected final a a;
  
  private final IntentFilter b;
  
  private final Context c;
  
  protected final Set<a<StateT>> d = new HashSet<a<StateT>>();
  
  private b e = null;
  
  private volatile boolean f = false;
  
  protected c(a parama, IntentFilter paramIntentFilter, Context paramContext) {
    this.a = parama;
    this.b = paramIntentFilter;
    this.c = q.c(paramContext);
  }
  
  private final void b() {
    if ((this.f || !this.d.isEmpty()) && this.e == null) {
      b b1 = new b(this);
      this.e = b1;
      this.c.registerReceiver((BroadcastReceiver)b1, this.b);
    } 
    if (!this.f && this.d.isEmpty()) {
      b b1 = this.e;
      if (b1 != null) {
        this.c.unregisterReceiver((BroadcastReceiver)b1);
        this.e = null;
      } 
    } 
  }
  
  protected abstract void a(Context paramContext, Intent paramIntent);
  
  public final void c(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: putfield f : Z
    //   7: aload_0
    //   8: invokespecial b : ()V
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: astore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_2
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	14	finally
  }
  
  public final void d(StateT paramStateT) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/HashSet
    //   5: astore_2
    //   6: aload_2
    //   7: aload_0
    //   8: getfield d : Ljava/util/Set;
    //   11: invokespecial <init> : (Ljava/util/Collection;)V
    //   14: aload_2
    //   15: invokevirtual iterator : ()Ljava/util/Iterator;
    //   18: astore_2
    //   19: aload_2
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 46
    //   28: aload_2
    //   29: invokeinterface next : ()Ljava/lang/Object;
    //   34: checkcast c/c/a/c/a/a/a
    //   37: aload_1
    //   38: invokeinterface a : (Ljava/lang/Object;)V
    //   43: goto -> 19
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: goto -> 57
    //   55: aload_1
    //   56: athrow
    //   57: goto -> 55
    // Exception table:
    //   from	to	target	type
    //   2	19	49	finally
    //   19	43	49	finally
  }
  
  public final boolean e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Lc/c/a/c/a/a/b;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: goto -> 30
    //   28: aload_1
    //   29: athrow
    //   30: goto -> 28
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/c/a/c/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */