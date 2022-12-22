package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Collections;

public final class oj0 extends i8 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, y2 {
  private View b;
  
  private nt2 c;
  
  private ff0 d;
  
  private boolean e;
  
  private boolean f;
  
  public oj0(ff0 paramff0, pf0 parampf0) {
    this.b = parampf0.E();
    this.c = parampf0.n();
    this.d = paramff0;
    this.e = false;
    this.f = false;
    if (parampf0.F() != null)
      parampf0.F().R0(this); 
  }
  
  private static void S9(k8 paramk8, int paramInt) {
    try {
      paramk8.E5(paramInt);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  private final void T9() {
    View view = this.b;
    if (view == null)
      return; 
    ViewParent viewParent = view.getParent();
    if (viewParent instanceof ViewGroup)
      ((ViewGroup)viewParent).removeView(this.b); 
  }
  
  private final void U9() {
    ff0 ff01 = this.d;
    if (ff01 != null) {
      View view = this.b;
      if (view != null)
        ff01.A(view, Collections.emptyMap(), Collections.emptyMap(), ff0.N(this.b)); 
    } 
  }
  
  public final void T4(a parama, k8 paramk8) {
    String str;
    t.e("#008 Must be called on the main UI thread.");
    if (this.e) {
      cm.g("Instream ad can not be shown after destroy().");
      S9(paramk8, 2);
      return;
    } 
    View view = this.b;
    if (view == null || this.c == null) {
      if (view == null) {
        str = "can not get video view.";
      } else {
        str = "can not get video controller.";
      } 
      if (str.length() != 0) {
        str = "Instream internal error: ".concat(str);
      } else {
        str = new String("Instream internal error: ");
      } 
      cm.g(str);
      S9(paramk8, 0);
      return;
    } 
    if (this.f) {
      cm.g("Instream ad should not be used again.");
      S9(paramk8, 1);
      return;
    } 
    this.f = true;
    T9();
    ((ViewGroup)b.o1((a)str)).addView(this.b, new ViewGroup.LayoutParams(-1, -1));
    q.z();
    an.a(this.b, this);
    q.z();
    an.b(this.b, this);
    U9();
    try {
      paramk8.Z6();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void a2() {
    h1.a.post(new nj0(this));
  }
  
  public final void destroy() {
    t.e("#008 Must be called on the main UI thread.");
    T9();
    ff0 ff01 = this.d;
    if (ff01 != null)
      ff01.a(); 
    this.d = null;
    this.b = null;
    this.c = null;
    this.e = true;
  }
  
  public final void g7(a parama) {
    t.e("#008 Must be called on the main UI thread.");
    T4(parama, new qj0(this));
  }
  
  public final nt2 getVideoController() {
    t.e("#008 Must be called on the main UI thread.");
    if (this.e) {
      cm.g("getVideoController: Instream ad should not be used after destroyed");
      return null;
    } 
    return this.c;
  }
  
  public final i3 n0() {
    t.e("#008 Must be called on the main UI thread.");
    if (this.e) {
      cm.g("getVideoController: Instream ad should not be used after destroyed");
      return null;
    } 
    ff0 ff01 = this.d;
    return (ff01 != null && ff01.x() != null) ? this.d.x().b() : null;
  }
  
  public final void onGlobalLayout() {
    U9();
  }
  
  public final void onScrollChanged() {
    U9();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */