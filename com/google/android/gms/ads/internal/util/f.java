package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

public final class f {
  private boolean a = false;
  
  private float b = 1.0F;
  
  public static float c(Context paramContext) {
    AudioManager audioManager = (AudioManager)paramContext.getSystemService("audio");
    if (audioManager == null)
      return 0.0F; 
    int i = audioManager.getStreamMaxVolume(3);
    int j = audioManager.getStreamVolume(3);
    return (i == 0) ? 0.0F : (j / i);
  }
  
  private final boolean f() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : F
    //   6: fstore_1
    //   7: fload_1
    //   8: fconst_0
    //   9: fcmpl
    //   10: iflt -> 19
    //   13: iconst_1
    //   14: istore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: iload_2
    //   18: ireturn
    //   19: iconst_0
    //   20: istore_2
    //   21: goto -> 15
    //   24: astore_3
    //   25: aload_0
    //   26: monitorexit
    //   27: goto -> 32
    //   30: aload_3
    //   31: athrow
    //   32: goto -> 30
    // Exception table:
    //   from	to	target	type
    //   2	7	24	finally
  }
  
  public final void a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: putfield a : Z
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_2
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_2
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public final void b(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: fload_1
    //   4: putfield b : F
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_2
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_2
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public final float d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial f : ()Z
    //   6: ifeq -> 18
    //   9: aload_0
    //   10: getfield b : F
    //   13: fstore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: fload_1
    //   17: freturn
    //   18: aload_0
    //   19: monitorexit
    //   20: fconst_1
    //   21: freturn
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	22	finally
  }
  
  public final boolean e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */