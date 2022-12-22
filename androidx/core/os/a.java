package androidx.core.os;

import android.os.Build;

public class a {
  @Deprecated
  public static boolean a() {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 30) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/os/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */