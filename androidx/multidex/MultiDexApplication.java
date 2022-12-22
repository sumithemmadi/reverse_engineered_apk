package androidx.multidex;

import android.app.Application;
import android.content.Context;

public class MultiDexApplication extends Application {
  protected void attachBaseContext(Context paramContext) {
    super.attachBaseContext(paramContext);
    a.k((Context)this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/multidex/MultiDexApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */