package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.f;

public class d {
  private static final String a = f.f("PackageManagerHelper");
  
  public static void a(Context paramContext, Class<?> paramClass, boolean paramBoolean) {
    String str = "enabled";
    try {
      String str1;
      byte b;
      PackageManager packageManager = paramContext.getPackageManager();
      ComponentName componentName = new ComponentName();
      this(paramContext, paramClass.getName());
      if (paramBoolean) {
        b = 1;
      } else {
        b = 2;
      } 
      packageManager.setComponentEnabledSetting(componentName, b, 1);
      f f = f.c();
      String str3 = a;
      String str2 = paramClass.getName();
      if (paramBoolean) {
        str1 = "enabled";
      } else {
        str1 = "disabled";
      } 
      f.a(str3, String.format("%s %s", new Object[] { str2, str1 }), new Throwable[0]);
    } catch (Exception exception) {
      String str1;
      f f = f.c();
      String str3 = a;
      String str2 = paramClass.getName();
      if (paramBoolean) {
        str1 = str;
      } else {
        str1 = "disabled";
      } 
      f.a(str3, String.format("%s could not be %s", new Object[] { str2, str1 }), new Throwable[] { exception });
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/utils/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */