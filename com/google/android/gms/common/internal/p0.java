package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class p0 implements Handler.Callback {
  private p0(o0 paramo0) {}
  
  public final boolean handleMessage(Message paramMessage) {
    int i = paramMessage.what;
    if (i != 0) {
      if (i != 1)
        return false; 
      synchronized (o0.h(this.b)) {
        i.a a = (i.a)paramMessage.obj;
        q0 q0 = (q0)o0.h(this.b).get(a);
        if (q0 != null && q0.f() == 3) {
          String str1 = String.valueOf(a);
          i = str1.length();
          StringBuilder stringBuilder = new StringBuilder();
          this(i + 47);
          stringBuilder.append("Timeout waiting for ServiceConnection callback ");
          stringBuilder.append(str1);
          String str2 = stringBuilder.toString();
          Exception exception = new Exception();
          this();
          Log.e("GmsClientSupervisor", str2, exception);
          ComponentName componentName2 = q0.j();
          ComponentName componentName1 = componentName2;
          if (componentName2 == null)
            componentName1 = a.c(); 
          componentName2 = componentName1;
          if (componentName1 == null) {
            componentName2 = new ComponentName();
            this(t.<String>j(a.b()), "unknown");
          } 
          q0.onServiceDisconnected(componentName2);
        } 
        return true;
      } 
    } 
    synchronized (o0.h(this.b)) {
      i.a a = (i.a)paramMessage.obj;
      q0 q0 = (q0)o0.h(this.b).get(a);
      if (q0 != null && q0.h()) {
        if (q0.d())
          q0.g("GmsClientSupervisor"); 
        o0.h(this.b).remove(a);
      } 
      return true;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */