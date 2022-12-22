package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

public final class ol2 {
  private final Object a = new Object();
  
  private nl2 b = null;
  
  private boolean c = false;
  
  public final Activity a() {
    synchronized (this.a) {
      nl2 nl21 = this.b;
      if (nl21 != null)
        return nl21.a(); 
      return null;
    } 
  }
  
  public final Context b() {
    synchronized (this.a) {
      nl2 nl21 = this.b;
      if (nl21 != null)
        return nl21.b(); 
      return null;
    } 
  }
  
  public final void c(Context paramContext) {
    synchronized (this.a) {
      if (!this.c) {
        Application application = null;
        Context context1 = paramContext.getApplicationContext();
        Context context2 = context1;
        if (context1 == null)
          context2 = paramContext; 
        if (context2 instanceof Application)
          application = (Application)context2; 
        if (application == null) {
          cm.i("Can not cast Context to Application");
          return;
        } 
        if (this.b == null) {
          nl2 nl21 = new nl2();
          this();
          this.b = nl21;
        } 
        this.b.e(application, paramContext);
        this.c = true;
      } 
      return;
    } 
  }
  
  public final void d(pl2 parampl2) {
    synchronized (this.a) {
      if (this.b == null) {
        nl2 nl21 = new nl2();
        this();
        this.b = nl21;
      } 
      this.b.f(parampl2);
      return;
    } 
  }
  
  public final void e(pl2 parampl2) {
    synchronized (this.a) {
      nl2 nl21 = this.b;
      if (nl21 == null)
        return; 
      nl21.h(parampl2);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ol2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */