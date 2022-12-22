package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.g;
import java.util.concurrent.atomic.AtomicBoolean;

public final class s01 implements g {
  private final l40 a;
  
  private final e50 b;
  
  private final kb0 c;
  
  private final eb0 d;
  
  private final sw e;
  
  private AtomicBoolean f = new AtomicBoolean(false);
  
  s01(l40 paraml40, e50 parame50, kb0 paramkb0, eb0 parameb0, sw paramsw) {
    this.a = paraml40;
    this.b = parame50;
    this.c = paramkb0;
    this.d = parameb0;
    this.e = paramsw;
  }
  
  public final void a() {
    if (this.f.get()) {
      this.b.S();
      this.c.b1();
    } 
  }
  
  public final void b() {
    if (this.f.get())
      this.a.x(); 
  }
  
  public final void c(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: iconst_0
    //   7: iconst_1
    //   8: invokevirtual compareAndSet : (ZZ)Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifne -> 19
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: aload_0
    //   20: getfield e : Lcom/google/android/gms/internal/ads/sw;
    //   23: invokevirtual S : ()V
    //   26: aload_0
    //   27: getfield d : Lcom/google/android/gms/internal/ads/eb0;
    //   30: aload_1
    //   31: invokevirtual b1 : (Landroid/view/View;)V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	37	finally
    //   19	34	37	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */