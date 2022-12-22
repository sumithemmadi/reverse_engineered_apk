package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class sg0 implements View.OnClickListener {
  private final dk0 b;
  
  private final e c;
  
  private i5 d;
  
  private x6<Object> e;
  
  String f;
  
  Long g;
  
  WeakReference<View> h;
  
  public sg0(dk0 paramdk0, e parame) {
    this.b = paramdk0;
    this.c = parame;
  }
  
  private final void d() {
    this.f = null;
    this.g = null;
    WeakReference<View> weakReference = this.h;
    if (weakReference == null)
      return; 
    View view = weakReference.get();
    if (view == null)
      return; 
    view.setClickable(false);
    view.setOnClickListener(null);
    this.h = null;
  }
  
  public final void a() {
    if (this.d == null)
      return; 
    if (this.g == null)
      return; 
    d();
    try {
      this.d.E9();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void b(i5 parami5) {
    this.d = parami5;
    x6<Object> x61 = this.e;
    if (x61 != null)
      this.b.i("/unconfirmedClick", x61); 
    rg0 rg0 = new rg0(this, parami5);
    this.e = rg0;
    this.b.e("/unconfirmedClick", rg0);
  }
  
  public final i5 c() {
    return this.d;
  }
  
  public final void onClick(View paramView) {
    WeakReference<View> weakReference = this.h;
    if (weakReference != null && weakReference.get() == paramView) {
      if (this.f != null && this.g != null) {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        hashMap.put("id", this.f);
        hashMap.put("time_interval", String.valueOf(this.c.a() - this.g.longValue()));
        hashMap.put("messageType", "onePointFiveClick");
        this.b.f("sendMessageToNativeJs", (Map)hashMap);
      } 
      d();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */