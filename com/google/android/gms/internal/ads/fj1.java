package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

public final class fj1 implements ll, r40 {
  private final HashSet<el> b = new HashSet<el>();
  
  private final Context c;
  
  private final pl d;
  
  public fj1(Context paramContext, pl parampl) {
    this.c = paramContext;
    this.d = parampl;
  }
  
  public final void E(zzvg paramzzvg) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: getfield b : I
    //   6: iconst_3
    //   7: if_icmpeq -> 21
    //   10: aload_0
    //   11: getfield d : Lcom/google/android/gms/internal/ads/pl;
    //   14: aload_0
    //   15: getfield b : Ljava/util/HashSet;
    //   18: invokevirtual f : (Ljava/util/HashSet;)V
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
  
  public final void a(HashSet<el> paramHashSet) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/HashSet;
    //   6: invokevirtual clear : ()V
    //   9: aload_0
    //   10: getfield b : Ljava/util/HashSet;
    //   13: aload_1
    //   14: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   17: pop
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
  
  public final Bundle b() {
    return this.d.b(this.c, this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */