package androidx.browser.customtabs;

import a.a.a.c;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

public class PostMessageService extends Service {
  private c.a b = new a(this);
  
  public IBinder onBind(Intent paramIntent) {
    return (IBinder)this.b;
  }
  
  class a extends c.a {
    a(PostMessageService this$0) {}
    
    public void j4(a.a.a.a param1a, Bundle param1Bundle) {
      param1a.b9(param1Bundle);
    }
    
    public void q5(a.a.a.a param1a, String param1String, Bundle param1Bundle) {
      param1a.P8(param1String, param1Bundle);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/browser/customtabs/PostMessageService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */