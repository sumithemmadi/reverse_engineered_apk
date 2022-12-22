package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

public final class e {
  public static int a(Context paramContext, String paramString1, String paramString2) {
    return (Build.VERSION.SDK_INT >= 23) ? ((AppOpsManager)paramContext.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(paramString1, paramString2) : 1;
  }
  
  public static String b(String paramString) {
    return (Build.VERSION.SDK_INT >= 23) ? AppOpsManager.permissionToOp(paramString) : null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */