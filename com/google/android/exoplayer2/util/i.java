package com.google.android.exoplayer2.util;

public final class i {
  private boolean a;
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: ifne -> 16
    //   9: aload_0
    //   10: invokevirtual wait : ()V
    //   13: goto -> 2
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: goto -> 27
    //   25: aload_1
    //   26: athrow
    //   27: goto -> 25
    // Exception table:
    //   from	to	target	type
    //   2	13	19	finally
  }
  
  public boolean b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: istore_1
    //   7: aload_0
    //   8: iconst_0
    //   9: putfield a : Z
    //   12: aload_0
    //   13: monitorexit
    //   14: iload_1
    //   15: ireturn
    //   16: astore_2
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_2
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	16	finally
  }
  
  public boolean c() {
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
  
  public boolean d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: iconst_0
    //   14: ireturn
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield a : Z
    //   20: aload_0
    //   21: invokevirtual notifyAll : ()V
    //   24: aload_0
    //   25: monitorexit
    //   26: iconst_1
    //   27: ireturn
    //   28: astore_2
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_2
    //   32: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	28	finally
    //   15	24	28	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */