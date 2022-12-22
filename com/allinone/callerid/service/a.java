package com.allinone.callerid.service;

import android.os.Binder;
import java.lang.ref.WeakReference;

public class a extends Binder {
  private WeakReference<MyService> b;
  
  public MyService a() {
    MyService myService;
    WeakReference<MyService> weakReference = this.b;
    if (weakReference == null) {
      weakReference = null;
    } else {
      myService = weakReference.get();
    } 
    return myService;
  }
  
  public void b(MyService paramMyService) {
    this.b = new WeakReference<MyService>(paramMyService);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */