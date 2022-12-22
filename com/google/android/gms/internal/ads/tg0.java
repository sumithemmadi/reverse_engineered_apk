package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class tg0 {
  private final kl0 a;
  
  private final dk0 b;
  
  private final gx c;
  
  private final xf0 d;
  
  public tg0(kl0 paramkl0, dk0 paramdk0, gx paramgx, xf0 paramxf0) {
    this.a = paramkl0;
    this.b = paramdk0;
    this.c = paramgx;
    this.d = paramxf0;
  }
  
  public final View c() {
    tq tq = this.a.a(zzvs.r0(), null, null);
    tq.getView().setVisibility(8);
    tq.d("/sendMessageToSdk", new wg0(this));
    tq.d("/adMuted", new vg0(this));
    this.b.g(new WeakReference(tq), "/loadHtml", new yg0(this));
    this.b.g(new WeakReference(tq), "/showOverlay", new xg0(this));
    this.b.g(new WeakReference(tq), "/hideOverlay", new ah0(this));
    return tq.getView();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */