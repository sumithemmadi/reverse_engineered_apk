package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;

public final class zj implements yk2 {
  private final Context b;
  
  private final Object c;
  
  private String d;
  
  private boolean e;
  
  public zj(Context paramContext, String paramString) {
    Context context = paramContext;
    if (paramContext.getApplicationContext() != null)
      context = paramContext.getApplicationContext(); 
    this.b = context;
    this.d = paramString;
    this.e = false;
    this.c = new Object();
  }
  
  public final String i() {
    return this.d;
  }
  
  public final void k0(zk2 paramzk2) {
    l(paramzk2.m);
  }
  
  public final void l(boolean paramBoolean) {
    if (!q.A().H(this.b))
      return; 
    synchronized (this.c) {
      if (this.e == paramBoolean)
        return; 
      this.e = paramBoolean;
      if (TextUtils.isEmpty(this.d))
        return; 
      if (this.e) {
        q.A().s(this.b, this.d);
      } else {
        q.A().t(this.b, this.d);
      } 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */