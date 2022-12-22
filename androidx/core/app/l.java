package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.util.HashSet;
import java.util.Set;

public final class l {
  private static final Object a = new Object();
  
  private static Set<String> b = new HashSet<String>();
  
  private static final Object c = new Object();
  
  private final Context d;
  
  private final NotificationManager e;
  
  private l(Context paramContext) {
    this.d = paramContext;
    this.e = (NotificationManager)paramContext.getSystemService("notification");
  }
  
  public static l b(Context paramContext) {
    return new l(paramContext);
  }
  
  public boolean a() {
    int i = Build.VERSION.SDK_INT;
    if (i >= 24)
      return this.e.areNotificationsEnabled(); 
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i >= 19) {
      AppOpsManager appOpsManager = (AppOpsManager)this.d.getSystemService("appops");
      ApplicationInfo applicationInfo = this.d.getApplicationInfo();
      String str = this.d.getApplicationContext().getPackageName();
      i = applicationInfo.uid;
      try {
        Class<?> clazz = Class.forName(AppOpsManager.class.getName());
        Class<int> clazz1 = int.class;
        i = ((Integer)clazz.getMethod("checkOpNoThrow", new Class[] { clazz1, clazz1, String.class }).invoke(appOpsManager, new Object[] { Integer.valueOf(((Integer)clazz.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), str })).intValue();
        if (i == 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        } 
      } catch (ClassNotFoundException|NoSuchMethodException|NoSuchFieldException|java.lang.reflect.InvocationTargetException|IllegalAccessException|RuntimeException classNotFoundException) {
        bool2 = bool1;
      } 
    } 
    return bool2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */