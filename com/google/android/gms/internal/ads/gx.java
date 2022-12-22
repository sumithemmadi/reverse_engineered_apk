package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class gx implements yk2 {
  private tq b;
  
  private final Executor c;
  
  private final qw d;
  
  private final e e;
  
  private boolean f = false;
  
  private boolean g = false;
  
  private vw h = new vw();
  
  public gx(Executor paramExecutor, qw paramqw, e parame) {
    this.c = paramExecutor;
    this.d = paramqw;
    this.e = parame;
  }
  
  private final void n() {
    try {
      JSONObject jSONObject = this.d.b(this.h);
      if (this.b != null) {
        Executor executor = this.c;
        fx fx = new fx();
        this(this, jSONObject);
        executor.execute(fx);
      } 
      return;
    } catch (JSONException jSONException) {
      b1.l("Failed to call video active view js", (Throwable)jSONException);
      return;
    } 
  }
  
  public final void i() {
    this.f = false;
  }
  
  public final void k0(zk2 paramzk2) {
    boolean bool;
    vw vw1 = this.h;
    if (this.g) {
      bool = false;
    } else {
      bool = paramzk2.m;
    } 
    vw1.a = bool;
    vw1.d = this.e.b();
    this.h.f = paramzk2;
    if (this.f)
      n(); 
  }
  
  public final void l() {
    this.f = true;
    n();
  }
  
  public final void r(boolean paramBoolean) {
    this.g = paramBoolean;
  }
  
  public final void s(tq paramtq) {
    this.b = paramtq;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */