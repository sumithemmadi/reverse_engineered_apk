package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.y.a;
import java.util.Set;

public final class c60 extends j90<a> implements z5 {
  private Bundle c = new Bundle();
  
  public c60(Set<gb0<a>> paramSet) {
    super(paramSet);
  }
  
  public final Bundle b1() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new android/os/Bundle
    //   5: dup
    //   6: aload_0
    //   7: getfield c : Landroid/os/Bundle;
    //   10: invokespecial <init> : (Landroid/os/Bundle;)V
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: astore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	18	finally
  }
  
  public final void l0(String paramString, Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Landroid/os/Bundle;
    //   6: aload_2
    //   7: invokevirtual putAll : (Landroid/os/Bundle;)V
    //   10: aload_0
    //   11: getstatic com/google/android/gms/internal/ads/f60.a : Lcom/google/android/gms/internal/ads/l90;
    //   14: invokevirtual X0 : (Lcom/google/android/gms/internal/ads/l90;)V
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	20	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */