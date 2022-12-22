package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;

public class b {
  private final a.a.a.b a;
  
  private final ComponentName b;
  
  b(a.a.a.b paramb, ComponentName paramComponentName) {
    this.a = paramb;
    this.b = paramComponentName;
  }
  
  public static boolean a(Context paramContext, String paramString, d paramd) {
    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
    if (!TextUtils.isEmpty(paramString))
      intent.setPackage(paramString); 
    return paramContext.bindService(intent, paramd, 33);
  }
  
  public e b(a parama) {
    e e;
    a a1 = new a(this, parama);
    parama = null;
    try {
      boolean bool = this.a.E6((a.a.a.a)a1);
      if (!bool)
        return null; 
      e = new e(this.a, (a.a.a.a)a1, this.b);
    } catch (RemoteException remoteException) {}
    return e;
  }
  
  public boolean c(long paramLong) {
    try {
      return this.a.J4(paramLong);
    } catch (RemoteException remoteException) {
      return false;
    } 
  }
  
  class a extends a.a.a.a.a {
    private Handler b = new Handler(Looper.getMainLooper());
    
    a(b this$0, a param1a) {}
    
    public void P8(String param1String, Bundle param1Bundle) {
      if (this.c == null)
        return; 
      this.b.post(new d(this, param1String, param1Bundle));
    }
    
    public void R7(int param1Int, Bundle param1Bundle) {
      if (this.c == null)
        return; 
      this.b.post(new a(this, param1Int, param1Bundle));
    }
    
    public void b9(Bundle param1Bundle) {
      if (this.c == null)
        return; 
      this.b.post(new c(this, param1Bundle));
    }
    
    public void d7(String param1String, Bundle param1Bundle) {
      if (this.c == null)
        return; 
      this.b.post(new b(this, param1String, param1Bundle));
    }
    
    public void l9(int param1Int, Uri param1Uri, boolean param1Boolean, Bundle param1Bundle) {
      if (this.c == null)
        return; 
      this.b.post(new e(this, param1Int, param1Uri, param1Boolean, param1Bundle));
    }
    
    class a implements Runnable {
      a(b.a this$0, int param2Int, Bundle param2Bundle) {}
      
      public void run() {
        this.d.c.c(this.b, this.c);
      }
    }
    
    class b implements Runnable {
      b(b.a this$0, String param2String, Bundle param2Bundle) {}
      
      public void run() {
        this.d.c.a(this.b, this.c);
      }
    }
    
    class c implements Runnable {
      c(b.a this$0, Bundle param2Bundle) {}
      
      public void run() {
        this.c.c.b(this.b);
      }
    }
    
    class d implements Runnable {
      d(b.a this$0, String param2String, Bundle param2Bundle) {}
      
      public void run() {
        this.d.c.d(this.b, this.c);
      }
    }
    
    class e implements Runnable {
      e(b.a this$0, int param2Int, Uri param2Uri, boolean param2Boolean, Bundle param2Bundle) {}
      
      public void run() {
        this.f.c.e(this.b, this.c, this.d, this.e);
      }
    }
  }
  
  class a implements Runnable {
    a(b this$0, int param1Int, Bundle param1Bundle) {}
    
    public void run() {
      this.d.c.c(this.b, this.c);
    }
  }
  
  class b implements Runnable {
    b(b this$0, String param1String, Bundle param1Bundle) {}
    
    public void run() {
      this.d.c.a(this.b, this.c);
    }
  }
  
  class c implements Runnable {
    c(b this$0, Bundle param1Bundle) {}
    
    public void run() {
      this.c.c.b(this.b);
    }
  }
  
  class d implements Runnable {
    d(b this$0, String param1String, Bundle param1Bundle) {}
    
    public void run() {
      this.d.c.d(this.b, this.c);
    }
  }
  
  class e implements Runnable {
    e(b this$0, int param1Int, Uri param1Uri, boolean param1Boolean, Bundle param1Bundle) {}
    
    public void run() {
      this.f.c.e(this.b, this.c, this.d, this.e);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/browser/customtabs/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */