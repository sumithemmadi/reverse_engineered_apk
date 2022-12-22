package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.d1;

public final class ht0 implements qa0 {
  private boolean b = false;
  
  private boolean c = false;
  
  private final String d;
  
  private final pm1 e;
  
  private final d1 f;
  
  public ht0(String paramString, pm1 parampm1) {
    this.d = paramString;
    this.e = parampm1;
    this.f = q.g().r();
  }
  
  private final rm1 a(String paramString) {
    String str;
    if (this.f.h()) {
      str = "";
    } else {
      str = this.d;
    } 
    return rm1.d(paramString).i("tms", Long.toString(q.j().b(), 10)).i("tid", str);
  }
  
  public final void B() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Z
    //   6: ifne -> 29
    //   9: aload_0
    //   10: getfield e : Lcom/google/android/gms/internal/ads/pm1;
    //   13: aload_0
    //   14: ldc 'init_started'
    //   16: invokespecial a : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/rm1;
    //   19: invokeinterface b : (Lcom/google/android/gms/internal/ads/rm1;)V
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield b : Z
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	32	finally
  }
  
  public final void D(String paramString) {
    this.e.b(a("adapter_init_started").i("ancn", paramString));
  }
  
  public final void H(String paramString1, String paramString2) {
    this.e.b(a("adapter_init_finished").i("ancn", paramString1).i("rqe", paramString2));
  }
  
  public final void I0(String paramString) {
    this.e.b(a("adapter_init_finished").i("ancn", paramString));
  }
  
  public final void K() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Z
    //   6: ifne -> 29
    //   9: aload_0
    //   10: getfield e : Lcom/google/android/gms/internal/ads/pm1;
    //   13: aload_0
    //   14: ldc 'init_finished'
    //   16: invokespecial a : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/rm1;
    //   19: invokeinterface b : (Lcom/google/android/gms/internal/ads/rm1;)V
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield c : Z
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	32	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ht0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */