package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

public final class g {
  public static Intent a(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 16) {
      Intent intent = paramActivity.getParentActivityIntent();
      if (intent != null)
        return intent; 
    } 
    String str = c(paramActivity);
    if (str == null)
      return null; 
    ComponentName componentName = new ComponentName((Context)paramActivity, str);
    try {
      Intent intent;
      if (d((Context)paramActivity, componentName) == null) {
        intent = Intent.makeMainActivity(componentName);
      } else {
        intent = new Intent();
        this();
        intent = intent.setComponent(componentName);
      } 
      return intent;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("getParentActivityIntent: bad parentActivityName '");
      stringBuilder.append(str);
      stringBuilder.append("' in manifest");
      Log.e("NavUtils", stringBuilder.toString());
      return null;
    } 
  }
  
  public static Intent b(Context paramContext, ComponentName paramComponentName) {
    Intent intent;
    String str = d(paramContext, paramComponentName);
    if (str == null)
      return null; 
    paramComponentName = new ComponentName(paramComponentName.getPackageName(), str);
    if (d(paramContext, paramComponentName) == null) {
      intent = Intent.makeMainActivity(paramComponentName);
    } else {
      intent = (new Intent()).setComponent(paramComponentName);
    } 
    return intent;
  }
  
  public static String c(Activity paramActivity) {
    try {
      return d((Context)paramActivity, paramActivity.getComponentName());
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      throw new IllegalArgumentException(nameNotFoundException);
    } 
  }
  
  public static String d(Context paramContext, ComponentName paramComponentName) {
    PackageManager packageManager = paramContext.getPackageManager();
    int i = Build.VERSION.SDK_INT;
    int j = 640;
    if (i >= 29) {
      j = 269222528;
    } else if (i >= 24) {
      j = 787072;
    } 
    ActivityInfo activityInfo = packageManager.getActivityInfo(paramComponentName, j);
    if (i >= 16) {
      String str = activityInfo.parentActivityName;
      if (str != null)
        return str; 
    } 
    Bundle bundle = activityInfo.metaData;
    if (bundle == null)
      return null; 
    String str2 = bundle.getString("android.support.PARENT_ACTIVITY");
    if (str2 == null)
      return null; 
    String str1 = str2;
    if (str2.charAt(0) == '.') {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramContext.getPackageName());
      stringBuilder.append(str2);
      str1 = stringBuilder.toString();
    } 
    return str1;
  }
  
  public static void e(Activity paramActivity, Intent paramIntent) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramActivity.navigateUpTo(paramIntent);
    } else {
      paramIntent.addFlags(67108864);
      paramActivity.startActivity(paramIntent);
      paramActivity.finish();
    } 
  }
  
  public static boolean f(Activity paramActivity, Intent paramIntent) {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 16)
      return paramActivity.shouldUpRecreateTask(paramIntent); 
    String str = paramActivity.getIntent().getAction();
    if (str != null && !str.equals("android.intent.action.MAIN")) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */