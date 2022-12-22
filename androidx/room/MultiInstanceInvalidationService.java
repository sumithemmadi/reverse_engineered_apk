package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import b.e.h;

public class MultiInstanceInvalidationService extends Service {
  int b = 0;
  
  final h<String> c = new h();
  
  final RemoteCallbackList<c> d = new a(this);
  
  private final d.a e = new b(this);
  
  public IBinder onBind(Intent paramIntent) {
    return (IBinder)this.e;
  }
  
  class a extends RemoteCallbackList<c> {
    a(MultiInstanceInvalidationService this$0) {}
    
    public void a(c param1c, Object param1Object) {
      this.a.c.q(((Integer)param1Object).intValue());
    }
  }
  
  class b extends d.a {
    b(MultiInstanceInvalidationService this$0) {}
    
    public void V8(int param1Int, String[] param1ArrayOfString) {
      synchronized (this.b.d) {
        String str = (String)this.b.c.i(param1Int);
        if (str == null) {
          Log.w("ROOM", "Remote invalidation client ID not registered");
          return;
        } 
        int i = this.b.d.beginBroadcast();
        byte b1 = 0;
        while (b1 < i) {
          try {
            int j = ((Integer)this.b.d.getBroadcastCookie(b1)).intValue();
            String str1 = (String)this.b.c.i(j);
            if (param1Int != j) {
              boolean bool = str.equals(str1);
              if (bool)
                try {
                  ((c)this.b.d.getBroadcastItem(b1)).z2(param1ArrayOfString);
                } catch (RemoteException remoteException) {
                  Log.w("ROOM", "Error invoking a remote callback", (Throwable)remoteException);
                }  
            } 
          } finally {
            this.b.d.finishBroadcast();
          } 
        } 
        this.b.d.finishBroadcast();
        return;
      } 
    }
    
    public int r3(c param1c, String param1String) {
      if (param1String == null)
        return 0; 
      synchronized (this.b.d) {
        MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.b;
        int i = multiInstanceInvalidationService2.b + 1;
        multiInstanceInvalidationService2.b = i;
        if (multiInstanceInvalidationService2.d.register(param1c, Integer.valueOf(i))) {
          this.b.c.a(i, param1String);
          return i;
        } 
        MultiInstanceInvalidationService multiInstanceInvalidationService1 = this.b;
        multiInstanceInvalidationService1.b--;
        return 0;
      } 
    }
    
    public void y9(c param1c, int param1Int) {
      synchronized (this.b.d) {
        this.b.d.unregister(param1c);
        this.b.c.q(param1Int);
        return;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/MultiInstanceInvalidationService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */