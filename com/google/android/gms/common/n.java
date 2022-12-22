package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.x0;
import com.google.android.gms.common.internal.y0;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.DynamiteModule;

final class n {
  private static volatile y0 a;
  
  private static final Object b = new Object();
  
  private static Context c;
  
  static v a(String paramString, o paramo, boolean paramBoolean1, boolean paramBoolean2) {
    StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
    try {
      return d(paramString, paramo, paramBoolean1, paramBoolean2);
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
  
  static void c(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/common/n
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/common/n.c : Landroid/content/Context;
    //   6: ifnonnull -> 24
    //   9: aload_0
    //   10: ifnull -> 32
    //   13: aload_0
    //   14: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   17: putstatic com/google/android/gms/common/n.c : Landroid/content/Context;
    //   20: ldc com/google/android/gms/common/n
    //   22: monitorexit
    //   23: return
    //   24: ldc 'GoogleCertificates'
    //   26: ldc 'GoogleCertificates has been initialized already'
    //   28: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   31: pop
    //   32: ldc com/google/android/gms/common/n
    //   34: monitorexit
    //   35: return
    //   36: astore_0
    //   37: ldc com/google/android/gms/common/n
    //   39: monitorexit
    //   40: aload_0
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   3	9	36	finally
    //   13	20	36	finally
    //   24	32	36	finally
  }
  
  private static v d(String paramString, o paramo, boolean paramBoolean1, boolean paramBoolean2) {
    try {
      if (a == null) {
        t.j(c);
        synchronized (b) {
          if (a == null)
            a = x0.i1(DynamiteModule.e(c, DynamiteModule.l, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl")); 
        } 
      } 
      t.j(c);
      zzj zzj = new zzj(paramString, paramo, paramBoolean1, paramBoolean2);
      try {
        paramBoolean2 = a.A8(zzj, b.a2(c.getPackageManager()));
        return paramBoolean2 ? v.a() : v.d(new p(paramBoolean1, paramString, paramo));
      } catch (RemoteException remoteException) {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)remoteException);
        return v.c("module call", (Throwable)remoteException);
      } 
    } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException loadingException) {
      Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)loadingException);
      paramString = String.valueOf(loadingException.getMessage());
      if (paramString.length() != 0) {
        paramString = "module init: ".concat(paramString);
      } else {
        paramString = new String("module init: ");
      } 
      return v.c(paramString, (Throwable)loadingException);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */