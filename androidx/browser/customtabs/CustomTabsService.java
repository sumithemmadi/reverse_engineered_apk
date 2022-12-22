package androidx.browser.customtabs;

import a.a.a.b;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class CustomTabsService extends Service {
  final Map<IBinder, IBinder.DeathRecipient> b = (Map<IBinder, IBinder.DeathRecipient>)new b.e.a();
  
  private b.a c = new a(this);
  
  protected boolean a(f paramf) {
    try {
      synchronized (this.b) {
        IBinder iBinder = paramf.a();
        iBinder.unlinkToDeath(this.b.get(iBinder), 0);
        this.b.remove(iBinder);
        return true;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      return false;
    } 
  }
  
  protected abstract Bundle b(String paramString, Bundle paramBundle);
  
  protected abstract boolean c(f paramf, Uri paramUri, Bundle paramBundle, List<Bundle> paramList);
  
  protected abstract boolean d(f paramf);
  
  protected abstract int e(f paramf, String paramString, Bundle paramBundle);
  
  protected abstract boolean f(f paramf, Uri paramUri);
  
  protected abstract boolean g(f paramf, Bundle paramBundle);
  
  protected abstract boolean h(f paramf, int paramInt, Uri paramUri, Bundle paramBundle);
  
  protected abstract boolean i(long paramLong);
  
  public IBinder onBind(Intent paramIntent) {
    return (IBinder)this.c;
  }
  
  class a extends b.a {
    a(CustomTabsService this$0) {}
    
    public boolean E6(a.a.a.a param1a) {
      f f = new f(param1a);
      try {
        a a1 = new a();
        this(this, f);
        synchronized (this.b.b) {
          param1a.asBinder().linkToDeath(a1, 0);
          this.b.b.put(param1a.asBinder(), a1);
          return this.b.d(f);
        } 
      } catch (RemoteException remoteException) {
        return false;
      } 
    }
    
    public boolean F7(a.a.a.a param1a, Bundle param1Bundle) {
      return this.b.g(new f(param1a), param1Bundle);
    }
    
    public Bundle G3(String param1String, Bundle param1Bundle) {
      return this.b.b(param1String, param1Bundle);
    }
    
    public boolean J4(long param1Long) {
      return this.b.i(param1Long);
    }
    
    public boolean V1(a.a.a.a param1a, Uri param1Uri, Bundle param1Bundle, List<Bundle> param1List) {
      return this.b.c(new f(param1a), param1Uri, param1Bundle, param1List);
    }
    
    public int d6(a.a.a.a param1a, String param1String, Bundle param1Bundle) {
      return this.b.e(new f(param1a), param1String, param1Bundle);
    }
    
    public boolean h2(a.a.a.a param1a, int param1Int, Uri param1Uri, Bundle param1Bundle) {
      return this.b.h(new f(param1a), param1Int, param1Uri, param1Bundle);
    }
    
    public boolean i8(a.a.a.a param1a, Uri param1Uri) {
      return this.b.f(new f(param1a), param1Uri);
    }
    
    class a implements IBinder.DeathRecipient {
      a(CustomTabsService.a this$0, f param2f) {}
      
      public void binderDied() {
        this.b.b.a(this.a);
      }
    }
  }
  
  class a implements IBinder.DeathRecipient {
    a(CustomTabsService this$0, f param1f) {}
    
    public void binderDied() {
      this.b.b.a(this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/browser/customtabs/CustomTabsService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */