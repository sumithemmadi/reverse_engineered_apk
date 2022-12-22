package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.e;

public final class c {
  public static int a(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2) {
    String str1;
    if (paramContext.checkPermission(paramString1, paramInt1, paramInt2) == -1)
      return -1; 
    String str2 = e.b(paramString1);
    if (str2 == null)
      return 0; 
    paramString1 = paramString2;
    if (paramString2 == null) {
      String[] arrayOfString = paramContext.getPackageManager().getPackagesForUid(paramInt2);
      if (arrayOfString == null || arrayOfString.length <= 0)
        return -1; 
      str1 = arrayOfString[0];
    } 
    return (e.a(paramContext, str2, str1) != 0) ? -2 : 0;
  }
  
  public static int b(Context paramContext, String paramString) {
    return a(paramContext, paramString, Process.myPid(), Process.myUid(), paramContext.getPackageName());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/content/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */