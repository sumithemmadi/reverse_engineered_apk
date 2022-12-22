package com.allinone.callerid.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class j0 {
  private static volatile j0 a;
  
  public final ExecutorService b = Executors.newFixedThreadPool(10);
  
  public static j0 a() {
    // Byte code:
    //   0: getstatic com/allinone/callerid/util/j0.a : Lcom/allinone/callerid/util/j0;
    //   3: ifnonnull -> 39
    //   6: ldc com/allinone/callerid/util/j0
    //   8: monitorenter
    //   9: getstatic com/allinone/callerid/util/j0.a : Lcom/allinone/callerid/util/j0;
    //   12: ifnonnull -> 27
    //   15: new com/allinone/callerid/util/j0
    //   18: astore_0
    //   19: aload_0
    //   20: invokespecial <init> : ()V
    //   23: aload_0
    //   24: putstatic com/allinone/callerid/util/j0.a : Lcom/allinone/callerid/util/j0;
    //   27: ldc com/allinone/callerid/util/j0
    //   29: monitorexit
    //   30: goto -> 39
    //   33: astore_0
    //   34: ldc com/allinone/callerid/util/j0
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    //   39: getstatic com/allinone/callerid/util/j0.a : Lcom/allinone/callerid/util/j0;
    //   42: areturn
    // Exception table:
    //   from	to	target	type
    //   9	27	33	finally
    //   27	30	33	finally
    //   34	37	33	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */