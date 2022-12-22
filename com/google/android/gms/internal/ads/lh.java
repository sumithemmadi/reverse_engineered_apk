package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

public final class lh extends ContextWrapper {
  public static Context a(Context paramContext) {
    if (paramContext instanceof lh)
      return ((lh)paramContext).getBaseContext(); 
    Context context = paramContext.getApplicationContext();
    return (context == null) ? paramContext : context;
  }
  
  public final Context getApplicationContext() {
    throw new NoSuchMethodError();
  }
  
  public final ApplicationInfo getApplicationInfo() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/lang/NoSuchMethodError
    //   5: astore_1
    //   6: aload_1
    //   7: invokespecial <init> : ()V
    //   10: aload_1
    //   11: athrow
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	12	finally
  }
  
  public final String getPackageName() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/lang/NoSuchMethodError
    //   5: astore_1
    //   6: aload_1
    //   7: invokespecial <init> : ()V
    //   10: aload_1
    //   11: athrow
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	12	finally
  }
  
  public final String getPackageResourcePath() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/lang/NoSuchMethodError
    //   5: astore_1
    //   6: aload_1
    //   7: invokespecial <init> : ()V
    //   10: aload_1
    //   11: athrow
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	12	finally
  }
  
  public final void startActivity(Intent paramIntent) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/lang/NoSuchMethodError
    //   5: astore_1
    //   6: aload_1
    //   7: invokespecial <init> : ()V
    //   10: aload_1
    //   11: athrow
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	12	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */