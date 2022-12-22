package androidx.browser.customtabs;

import a.a.a.a;
import a.a.a.b;
import android.content.ComponentName;
import android.os.IBinder;

public final class e {
  private final Object a = new Object();
  
  private final b b;
  
  private final a c;
  
  private final ComponentName d;
  
  e(b paramb, a parama, ComponentName paramComponentName) {
    this.b = paramb;
    this.c = parama;
    this.d = paramComponentName;
  }
  
  IBinder a() {
    return this.c.asBinder();
  }
  
  ComponentName b() {
    return this.d;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/browser/customtabs/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */