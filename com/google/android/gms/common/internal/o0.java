package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.stats.a;
import com.google.android.gms.internal.common.h;
import java.util.HashMap;

final class o0 extends i {
  private final HashMap<i.a, q0> d = new HashMap<i.a, q0>();
  
  private final Context e;
  
  private final Handler f;
  
  private final a g;
  
  private final long h;
  
  private final long i;
  
  o0(Context paramContext) {
    this.e = paramContext.getApplicationContext();
    this.f = (Handler)new h(paramContext.getMainLooper(), new p0(this, null));
    this.g = a.b();
    this.h = 5000L;
    this.i = 300000L;
  }
  
  protected final boolean f(i.a parama, ServiceConnection paramServiceConnection, String paramString) {
    t.k(paramServiceConnection, "ServiceConnection must not be null");
    synchronized (this.d) {
      q0 q01;
      String str;
      q0 q02 = this.d.get(parama);
      if (q02 == null) {
        q02 = new q0();
        this(this, parama);
        q02.a(paramServiceConnection, paramServiceConnection, paramString);
        q02.c(paramString);
        this.d.put(parama, q02);
        q01 = q02;
      } else {
        this.f.removeMessages(0, q01);
        if (!q02.e(paramServiceConnection)) {
          q02.a(paramServiceConnection, paramServiceConnection, paramString);
          int k = q02.f();
          if (k != 1) {
            if (k != 2) {
              q01 = q02;
            } else {
              q02.c(paramString);
              q01 = q02;
            } 
          } else {
            paramServiceConnection.onServiceConnected(q02.j(), q02.i());
            q01 = q02;
          } 
          return q01.d();
        } 
        IllegalStateException illegalStateException = new IllegalStateException();
        str = String.valueOf(q01);
        int j = str.length();
        StringBuilder stringBuilder = new StringBuilder();
        this(j + 81);
        stringBuilder.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
        stringBuilder.append(str);
        this(stringBuilder.toString());
        throw illegalStateException;
      } 
      return str.d();
    } 
  }
  
  protected final void g(i.a parama, ServiceConnection paramServiceConnection, String paramString) {
    t.k(paramServiceConnection, "ServiceConnection must not be null");
    synchronized (this.d) {
      String str;
      q0 q0 = this.d.get(parama);
      if (q0 != null) {
        Message message;
        if (q0.e(paramServiceConnection)) {
          q0.b(paramServiceConnection, paramString);
          if (q0.h()) {
            message = this.f.obtainMessage(0, parama);
            this.f.sendMessageDelayed(message, this.h);
          } 
          return;
        } 
        IllegalStateException illegalStateException1 = new IllegalStateException();
        str = String.valueOf(message);
        int k = str.length();
        StringBuilder stringBuilder1 = new StringBuilder();
        this(k + 76);
        stringBuilder1.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
        stringBuilder1.append(str);
        this(stringBuilder1.toString());
        throw illegalStateException1;
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      paramString = String.valueOf(str);
      int j = paramString.length();
      StringBuilder stringBuilder = new StringBuilder();
      this(j + 50);
      stringBuilder.append("Nonexistent connection status for service config: ");
      stringBuilder.append(paramString);
      this(stringBuilder.toString());
      throw illegalStateException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */