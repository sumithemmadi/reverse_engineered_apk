package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;

public final class k71 implements s91<l71> {
  private final nt1 a;
  
  private final ViewGroup b;
  
  private final Context c;
  
  private final Set<String> d;
  
  public k71(nt1 paramnt1, ViewGroup paramViewGroup, Context paramContext, Set<String> paramSet) {
    this.a = paramnt1;
    this.d = paramSet;
    this.b = paramViewGroup;
    this.c = paramContext;
  }
  
  private static Boolean c(Activity paramActivity) {
    Window window = paramActivity.getWindow();
    if (window != null && ((window.getAttributes()).flags & 0x1000000) != 0)
      return Boolean.TRUE; 
    try {
      PackageManager packageManager = paramActivity.getPackageManager();
      ComponentName componentName = paramActivity.getComponentName();
      boolean bool = false;
      if (((packageManager.getActivityInfo(componentName, 0)).flags & 0x200) != 0)
        bool = true; 
      return Boolean.valueOf(bool);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return null;
    } 
  }
  
  public final ot1<l71> a() {
    return this.a.a(new n71(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */