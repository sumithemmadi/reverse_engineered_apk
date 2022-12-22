package androidx.core.os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

public class d {
  public static boolean a(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 24) ? ((UserManager)paramContext.getSystemService(UserManager.class)).isUserUnlocked() : true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/os/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */