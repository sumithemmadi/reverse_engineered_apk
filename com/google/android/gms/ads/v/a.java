package com.google.android.gms.ads.v;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import c.c.a.a.b.a.d;
import c.c.a.a.b.a.e;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.t;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class a {
  private com.google.android.gms.common.a a;
  
  private d b;
  
  private boolean c;
  
  private final Object d = new Object();
  
  private b e;
  
  private final Context f;
  
  private final boolean g;
  
  private final long h;
  
  public a(Context paramContext) {
    this(paramContext, 30000L, false, false);
  }
  
  private a(Context paramContext, long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    t.j(paramContext);
    Context context = paramContext;
    if (paramBoolean1) {
      context = paramContext.getApplicationContext();
      if (context == null)
        context = paramContext; 
    } 
    this.f = context;
    this.c = false;
    this.h = paramLong;
    this.g = paramBoolean2;
  }
  
  public static a b(Context paramContext) {
    c c = new c(paramContext);
    boolean bool = c.a("gads:ad_id_app_context:enabled", false);
    float f = c.b("gads:ad_id_app_context:ping_ratio", 0.0F);
    String str = c.c("gads:ad_id_use_shared_preference:experiment_id", "");
    a a1 = new a(paramContext, -1L, bool, c.a("gads:ad_id_use_persistent_service:enabled", false));
    try {
      long l = SystemClock.elapsedRealtime();
      a1.j(false);
      a a2 = a1.c();
      a1.k(a2, bool, f, SystemClock.elapsedRealtime() - l, str, null);
      return a2;
    } finally {
      c = null;
    } 
  }
  
  public static boolean d(Context paramContext) {
    null = new c(paramContext);
    a a1 = new a(paramContext, -1L, null.a("gads:ad_id_app_context:enabled", false), null.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
    try {
      a1.j(false);
      return a1.l();
    } finally {
      a1.a();
    } 
  }
  
  public static void e(boolean paramBoolean) {}
  
  private static com.google.android.gms.common.a g(Context paramContext, boolean paramBoolean) {
    try {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      int i = c.f().h(paramContext, 12451000);
      if (i == 0 || i == 2) {
        String str;
        if (paramBoolean) {
          str = "com.google.android.gms.ads.identifier.service.PERSISTENT_START";
        } else {
          str = "com.google.android.gms.ads.identifier.service.START";
        } 
        com.google.android.gms.common.a a1 = new com.google.android.gms.common.a();
        Intent intent = new Intent(str);
        intent.setPackage("com.google.android.gms");
        try {
          paramBoolean = com.google.android.gms.common.stats.a.b().a(paramContext, intent, (ServiceConnection)a1, 1);
          if (paramBoolean)
            return a1; 
          throw new IOException("Connection failure");
        } finally {
          paramContext = null;
        } 
      } 
      throw new IOException("Google Play services not available");
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      throw new GooglePlayServicesNotAvailableException(9);
    } 
  }
  
  private static d h(Context paramContext, com.google.android.gms.common.a parama) {
    try {
      return e.Y0(parama.b(10000L, TimeUnit.MILLISECONDS));
    } catch (InterruptedException interruptedException) {
      throw new IOException("Interrupted exception");
    } finally {
      paramContext = null;
    } 
  }
  
  private final void i() {
    synchronized (this.d) {
      b b1 = this.e;
      if (b1 != null) {
        b1.d.countDown();
        try {
          this.e.join();
        } catch (InterruptedException interruptedException) {}
      } 
      if (this.h > 0L) {
        b1 = new b();
        this(this, this.h);
        this.e = b1;
      } 
      return;
    } 
  }
  
  private final void j(boolean paramBoolean) {
    // Byte code:
    //   0: ldc 'Calling this from your main thread can lead to deadlock'
    //   2: invokestatic i : (Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield c : Z
    //   11: ifeq -> 18
    //   14: aload_0
    //   15: invokevirtual a : ()V
    //   18: aload_0
    //   19: getfield f : Landroid/content/Context;
    //   22: aload_0
    //   23: getfield g : Z
    //   26: invokestatic g : (Landroid/content/Context;Z)Lcom/google/android/gms/common/a;
    //   29: astore_2
    //   30: aload_0
    //   31: aload_2
    //   32: putfield a : Lcom/google/android/gms/common/a;
    //   35: aload_0
    //   36: aload_0
    //   37: getfield f : Landroid/content/Context;
    //   40: aload_2
    //   41: invokestatic h : (Landroid/content/Context;Lcom/google/android/gms/common/a;)Lc/c/a/a/b/a/d;
    //   44: putfield b : Lc/c/a/a/b/a/d;
    //   47: aload_0
    //   48: iconst_1
    //   49: putfield c : Z
    //   52: iload_1
    //   53: ifeq -> 60
    //   56: aload_0
    //   57: invokespecial i : ()V
    //   60: aload_0
    //   61: monitorexit
    //   62: return
    //   63: astore_2
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_2
    //   67: athrow
    // Exception table:
    //   from	to	target	type
    //   7	18	63	finally
    //   18	52	63	finally
    //   56	60	63	finally
    //   60	62	63	finally
    //   64	66	63	finally
  }
  
  private final boolean k(a parama, boolean paramBoolean, float paramFloat, long paramLong, String paramString, Throwable paramThrowable) {
    String str2;
    if (Math.random() > paramFloat)
      return false; 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    String str1 = "1";
    if (paramBoolean) {
      str2 = "1";
    } else {
      str2 = "0";
    } 
    hashMap.put("app_context", str2);
    if (parama != null) {
      if (parama.b()) {
        str2 = str1;
      } else {
        str2 = "0";
      } 
      hashMap.put("limit_ad_tracking", str2);
    } 
    if (parama != null && parama.a() != null)
      hashMap.put("ad_id_size", Integer.toString(parama.a().length())); 
    if (paramThrowable != null)
      hashMap.put("error", paramThrowable.getClass().getName()); 
    if (paramString != null && !paramString.isEmpty())
      hashMap.put("experiment_id", paramString); 
    hashMap.put("tag", "AdvertisingIdClient");
    hashMap.put("time_spent", Long.toString(paramLong));
    (new b(this, hashMap)).start();
    return true;
  }
  
  private final boolean l() {
    // Byte code:
    //   0: ldc 'Calling this from your main thread can lead to deadlock'
    //   2: invokestatic i : (Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield c : Z
    //   11: ifne -> 100
    //   14: aload_0
    //   15: getfield d : Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield e : Lcom/google/android/gms/ads/v/a$b;
    //   25: astore_2
    //   26: aload_2
    //   27: ifnull -> 82
    //   30: aload_2
    //   31: getfield e : Z
    //   34: ifeq -> 82
    //   37: aload_1
    //   38: monitorexit
    //   39: aload_0
    //   40: iconst_0
    //   41: invokespecial j : (Z)V
    //   44: aload_0
    //   45: getfield c : Z
    //   48: ifeq -> 54
    //   51: goto -> 100
    //   54: new java/io/IOException
    //   57: astore_1
    //   58: aload_1
    //   59: ldc_w 'AdvertisingIdClient cannot reconnect.'
    //   62: invokespecial <init> : (Ljava/lang/String;)V
    //   65: aload_1
    //   66: athrow
    //   67: astore_1
    //   68: new java/io/IOException
    //   71: astore_2
    //   72: aload_2
    //   73: ldc_w 'AdvertisingIdClient cannot reconnect.'
    //   76: aload_1
    //   77: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   80: aload_2
    //   81: athrow
    //   82: new java/io/IOException
    //   85: astore_2
    //   86: aload_2
    //   87: ldc_w 'AdvertisingIdClient is not connected.'
    //   90: invokespecial <init> : (Ljava/lang/String;)V
    //   93: aload_2
    //   94: athrow
    //   95: astore_2
    //   96: aload_1
    //   97: monitorexit
    //   98: aload_2
    //   99: athrow
    //   100: aload_0
    //   101: getfield a : Lcom/google/android/gms/common/a;
    //   104: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   107: pop
    //   108: aload_0
    //   109: getfield b : Lc/c/a/a/b/a/d;
    //   112: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   115: pop
    //   116: aload_0
    //   117: getfield b : Lc/c/a/a/b/a/d;
    //   120: invokeinterface c : ()Z
    //   125: istore_3
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_0
    //   129: invokespecial i : ()V
    //   132: iload_3
    //   133: ireturn
    //   134: astore_1
    //   135: ldc_w 'AdvertisingIdClient'
    //   138: ldc_w 'GMS remote exception '
    //   141: aload_1
    //   142: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   145: pop
    //   146: new java/io/IOException
    //   149: astore_1
    //   150: aload_1
    //   151: ldc_w 'Remote exception'
    //   154: invokespecial <init> : (Ljava/lang/String;)V
    //   157: aload_1
    //   158: athrow
    //   159: astore_1
    //   160: aload_0
    //   161: monitorexit
    //   162: aload_1
    //   163: athrow
    // Exception table:
    //   from	to	target	type
    //   7	21	159	finally
    //   21	26	95	finally
    //   30	39	95	finally
    //   39	44	67	java/lang/Exception
    //   39	44	159	finally
    //   44	51	159	finally
    //   54	67	159	finally
    //   68	82	159	finally
    //   82	95	95	finally
    //   96	98	95	finally
    //   98	100	159	finally
    //   100	116	159	finally
    //   116	126	134	android/os/RemoteException
    //   116	126	159	finally
    //   126	128	159	finally
    //   135	159	159	finally
    //   160	162	159	finally
  }
  
  public final void a() {
    // Byte code:
    //   0: ldc 'Calling this from your main thread can lead to deadlock'
    //   2: invokestatic i : (Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield f : Landroid/content/Context;
    //   11: ifnull -> 80
    //   14: aload_0
    //   15: getfield a : Lcom/google/android/gms/common/a;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnonnull -> 26
    //   23: goto -> 80
    //   26: aload_0
    //   27: getfield c : Z
    //   30: ifeq -> 62
    //   33: invokestatic b : ()Lcom/google/android/gms/common/stats/a;
    //   36: aload_0
    //   37: getfield f : Landroid/content/Context;
    //   40: aload_0
    //   41: getfield a : Lcom/google/android/gms/common/a;
    //   44: invokevirtual c : (Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   47: goto -> 62
    //   50: astore_1
    //   51: ldc_w 'AdvertisingIdClient'
    //   54: ldc_w 'AdvertisingIdClient unbindService failed.'
    //   57: aload_1
    //   58: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   61: pop
    //   62: aload_0
    //   63: iconst_0
    //   64: putfield c : Z
    //   67: aload_0
    //   68: aconst_null
    //   69: putfield b : Lc/c/a/a/b/a/d;
    //   72: aload_0
    //   73: aconst_null
    //   74: putfield a : Lcom/google/android/gms/common/a;
    //   77: aload_0
    //   78: monitorexit
    //   79: return
    //   80: aload_0
    //   81: monitorexit
    //   82: return
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Exception table:
    //   from	to	target	type
    //   7	19	83	finally
    //   26	47	50	finally
    //   51	62	83	finally
    //   62	79	83	finally
    //   80	82	83	finally
    //   84	86	83	finally
  }
  
  public a c() {
    // Byte code:
    //   0: ldc 'Calling this from your main thread can lead to deadlock'
    //   2: invokestatic i : (Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield c : Z
    //   11: ifne -> 100
    //   14: aload_0
    //   15: getfield d : Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield e : Lcom/google/android/gms/ads/v/a$b;
    //   25: astore_2
    //   26: aload_2
    //   27: ifnull -> 82
    //   30: aload_2
    //   31: getfield e : Z
    //   34: ifeq -> 82
    //   37: aload_1
    //   38: monitorexit
    //   39: aload_0
    //   40: iconst_0
    //   41: invokespecial j : (Z)V
    //   44: aload_0
    //   45: getfield c : Z
    //   48: ifeq -> 54
    //   51: goto -> 100
    //   54: new java/io/IOException
    //   57: astore_1
    //   58: aload_1
    //   59: ldc_w 'AdvertisingIdClient cannot reconnect.'
    //   62: invokespecial <init> : (Ljava/lang/String;)V
    //   65: aload_1
    //   66: athrow
    //   67: astore_1
    //   68: new java/io/IOException
    //   71: astore_2
    //   72: aload_2
    //   73: ldc_w 'AdvertisingIdClient cannot reconnect.'
    //   76: aload_1
    //   77: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   80: aload_2
    //   81: athrow
    //   82: new java/io/IOException
    //   85: astore_2
    //   86: aload_2
    //   87: ldc_w 'AdvertisingIdClient is not connected.'
    //   90: invokespecial <init> : (Ljava/lang/String;)V
    //   93: aload_2
    //   94: athrow
    //   95: astore_2
    //   96: aload_1
    //   97: monitorexit
    //   98: aload_2
    //   99: athrow
    //   100: aload_0
    //   101: getfield a : Lcom/google/android/gms/common/a;
    //   104: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   107: pop
    //   108: aload_0
    //   109: getfield b : Lc/c/a/a/b/a/d;
    //   112: invokestatic j : (Ljava/lang/Object;)Ljava/lang/Object;
    //   115: pop
    //   116: new com/google/android/gms/ads/v/a$a
    //   119: astore_1
    //   120: aload_1
    //   121: aload_0
    //   122: getfield b : Lc/c/a/a/b/a/d;
    //   125: invokeinterface getId : ()Ljava/lang/String;
    //   130: aload_0
    //   131: getfield b : Lc/c/a/a/b/a/d;
    //   134: iconst_1
    //   135: invokeinterface P3 : (Z)Z
    //   140: invokespecial <init> : (Ljava/lang/String;Z)V
    //   143: aload_0
    //   144: monitorexit
    //   145: aload_0
    //   146: invokespecial i : ()V
    //   149: aload_1
    //   150: areturn
    //   151: astore_1
    //   152: ldc_w 'AdvertisingIdClient'
    //   155: ldc_w 'GMS remote exception '
    //   158: aload_1
    //   159: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   162: pop
    //   163: new java/io/IOException
    //   166: astore_1
    //   167: aload_1
    //   168: ldc_w 'Remote exception'
    //   171: invokespecial <init> : (Ljava/lang/String;)V
    //   174: aload_1
    //   175: athrow
    //   176: astore_1
    //   177: aload_0
    //   178: monitorexit
    //   179: aload_1
    //   180: athrow
    // Exception table:
    //   from	to	target	type
    //   7	21	176	finally
    //   21	26	95	finally
    //   30	39	95	finally
    //   39	44	67	java/lang/Exception
    //   39	44	176	finally
    //   44	51	176	finally
    //   54	67	176	finally
    //   68	82	176	finally
    //   82	95	95	finally
    //   96	98	95	finally
    //   98	100	176	finally
    //   100	116	176	finally
    //   116	143	151	android/os/RemoteException
    //   116	143	176	finally
    //   143	145	176	finally
    //   152	176	176	finally
    //   177	179	176	finally
  }
  
  public void f() {
    j(true);
  }
  
  protected void finalize() {
    a();
    super.finalize();
  }
  
  public static final class a {
    private final String a;
    
    private final boolean b;
    
    public a(String param1String, boolean param1Boolean) {
      this.a = param1String;
      this.b = param1Boolean;
    }
    
    public final String a() {
      return this.a;
    }
    
    public final boolean b() {
      return this.b;
    }
    
    public final String toString() {
      String str = this.a;
      boolean bool = this.b;
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
      stringBuilder.append("{");
      stringBuilder.append(str);
      stringBuilder.append("}");
      stringBuilder.append(bool);
      return stringBuilder.toString();
    }
  }
  
  static final class b extends Thread {
    private WeakReference<a> b;
    
    private long c;
    
    CountDownLatch d;
    
    boolean e;
    
    public b(a param1a, long param1Long) {
      this.b = new WeakReference<a>(param1a);
      this.c = param1Long;
      this.d = new CountDownLatch(1);
      this.e = false;
      start();
    }
    
    private final void a() {
      a a = this.b.get();
      if (a != null) {
        a.a();
        this.e = true;
      } 
    }
    
    public final void run() {
      try {
        if (!this.d.await(this.c, TimeUnit.MILLISECONDS))
          a(); 
        return;
      } catch (InterruptedException interruptedException) {
        a();
        return;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/v/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */