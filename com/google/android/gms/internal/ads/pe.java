package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.util.Map;

public final class pe extends oe implements x6<tq> {
  private final tq c;
  
  private final Context d;
  
  private final WindowManager e;
  
  private final s f;
  
  private DisplayMetrics g;
  
  private float h;
  
  private int i = -1;
  
  private int j = -1;
  
  private int k;
  
  private int l = -1;
  
  private int m = -1;
  
  private int n = -1;
  
  private int o = -1;
  
  public pe(tq paramtq, Context paramContext, s params) {
    super(paramtq);
    this.c = paramtq;
    this.d = paramContext;
    this.f = params;
    this.e = (WindowManager)paramContext.getSystemService("window");
  }
  
  public final void h(int paramInt1, int paramInt2) {
    boolean bool = this.d instanceof Activity;
    int i = 0;
    if (bool) {
      q.c();
      i = h1.j0((Activity)this.d)[0];
    } 
    if (this.c.q() == null || !this.c.q().e()) {
      int j = this.c.getWidth();
      int k = this.c.getHeight();
      x<Boolean> x = m0.L;
      int m = j;
      int n = k;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
        int i1 = j;
        if (j == 0) {
          i1 = j;
          if (this.c.q() != null)
            i1 = (this.c.q()).c; 
        } 
        m = i1;
        n = k;
        if (k == 0) {
          m = i1;
          n = k;
          if (this.c.q() != null) {
            n = (this.c.q()).b;
            m = i1;
          } 
        } 
      } 
      this.n = er2.a().p(this.d, m);
      this.o = er2.a().p(this.d, n);
    } 
    d(paramInt1, paramInt2 - i, this.n, this.o);
    this.c.N().b0(paramInt1, paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */