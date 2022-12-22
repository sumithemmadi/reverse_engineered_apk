package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

class g {
  Context a;
  
  final String b;
  
  int c;
  
  final f d;
  
  final f.c e;
  
  d f;
  
  final Executor g;
  
  final c h = new a(this);
  
  final AtomicBoolean i = new AtomicBoolean(false);
  
  final ServiceConnection j;
  
  final Runnable k;
  
  final Runnable l;
  
  private final Runnable m;
  
  g(Context paramContext, String paramString, f paramf, Executor paramExecutor) {
    b b = new b(this);
    this.j = b;
    this.k = new c(this);
    this.l = new d(this);
    this.m = new e(this);
    this.a = paramContext.getApplicationContext();
    this.b = paramString;
    this.d = paramf;
    this.g = paramExecutor;
    this.e = new f(this, paramf.c);
    Intent intent = new Intent(this.a, MultiInstanceInvalidationService.class);
    this.a.bindService(intent, b, 1);
  }
  
  class a extends c.a {
    a(g this$0) {}
    
    public void z2(String[] param1ArrayOfString) {
      this.b.g.execute(new a(this, param1ArrayOfString));
    }
    
    class a implements Runnable {
      a(g.a this$0, String[] param2ArrayOfString) {}
      
      public void run() {
        this.c.b.d.e(this.b);
      }
    }
  }
  
  class a implements Runnable {
    a(g this$0, String[] param1ArrayOfString) {}
    
    public void run() {
      this.c.b.d.e(this.b);
    }
  }
  
  class b implements ServiceConnection {
    b(g this$0) {}
    
    public void onServiceConnected(ComponentName param1ComponentName, IBinder param1IBinder) {
      this.a.f = d.a.Y0(param1IBinder);
      g g1 = this.a;
      g1.g.execute(g1.k);
    }
    
    public void onServiceDisconnected(ComponentName param1ComponentName) {
      g g1 = this.a;
      g1.g.execute(g1.l);
      g1 = this.a;
      g1.f = null;
      g1.a = null;
    }
  }
  
  class c implements Runnable {
    c(g this$0) {}
    
    public void run() {
      try {
        g g1 = this.b;
        d d = g1.f;
        if (d != null) {
          g1.c = d.r3(g1.h, g1.b);
          g1 = this.b;
          g1.d.a(g1.e);
        } 
      } catch (RemoteException remoteException) {
        Log.w("ROOM", "Cannot register multi-instance invalidation callback", (Throwable)remoteException);
      } 
    }
  }
  
  class d implements Runnable {
    d(g this$0) {}
    
    public void run() {
      g g1 = this.b;
      g1.d.g(g1.e);
    }
  }
  
  class e implements Runnable {
    e(g this$0) {}
    
    public void run() {
      g g1 = this.b;
      g1.d.g(g1.e);
      try {
        g g3 = this.b;
        d d = g3.f;
        if (d != null)
          d.y9(g3.h, g3.c); 
      } catch (RemoteException remoteException) {
        Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", (Throwable)remoteException);
      } 
      g g2 = this.b;
      Context context = g2.a;
      if (context != null) {
        context.unbindService(g2.j);
        this.b.a = null;
      } 
    }
  }
  
  class f extends f.c {
    f(g this$0, String[] param1ArrayOfString) {
      super(param1ArrayOfString);
    }
    
    boolean a() {
      return true;
    }
    
    public void b(Set<String> param1Set) {
      if (this.b.i.get())
        return; 
      try {
        g g1 = this.b;
        g1.f.V8(g1.c, param1Set.<String>toArray(new String[0]));
      } catch (RemoteException remoteException) {
        Log.w("ROOM", "Cannot broadcast invalidation", (Throwable)remoteException);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */