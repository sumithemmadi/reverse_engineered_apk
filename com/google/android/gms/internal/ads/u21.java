package com.google.android.gms.internal.ads;

public final class u21 implements bq2 {
  private ir2 b;
  
  public final void i(ir2 paramir2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield b : Lcom/google/android/gms/internal/ads/ir2;
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  public final void x() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/google/android/gms/internal/ads/ir2;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 27
    //   11: aload_1
    //   12: invokeinterface x : ()V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_1
    //   21: ldc 'Remote Exception at onAdClicked.'
    //   23: aload_1
    //   24: invokestatic d : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	30	finally
    //   11	17	20	android/os/RemoteException
    //   11	17	30	finally
    //   21	27	30	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/u21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */