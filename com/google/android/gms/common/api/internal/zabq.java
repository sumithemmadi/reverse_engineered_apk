package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {
  private Context a;
  
  private final a0 b;
  
  public zabq(a0 parama0) {
    this.b = parama0;
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/content/Context;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 16
    //   11: aload_1
    //   12: aload_0
    //   13: invokevirtual unregisterReceiver : (Landroid/content/BroadcastReceiver;)V
    //   16: aload_0
    //   17: aconst_null
    //   18: putfield a : Landroid/content/Context;
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
    //   2	7	24	finally
    //   11	16	24	finally
    //   16	21	24	finally
  }
  
  public final void b(Context paramContext) {
    this.a = paramContext;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    Uri uri = paramIntent.getData();
    if (uri != null) {
      String str = uri.getSchemeSpecificPart();
    } else {
      uri = null;
    } 
    if ("com.google.android.gms".equals(uri)) {
      this.b.a();
      a();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/zabq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */