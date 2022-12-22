package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.k.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class u {
  private static final int a = Process.myUid();
  
  private static final Method b = g();
  
  private static final Method c = i();
  
  private static final Method d = j();
  
  private static final Method e = k();
  
  private static final Method f = l();
  
  private static final Method g = m();
  
  private static final Method h = n();
  
  public static WorkSource a(Context paramContext, String paramString) {
    if (paramContext != null && paramContext.getPackageManager() != null && paramString != null)
      try {
        String str;
        ApplicationInfo applicationInfo = c.a(paramContext).c(paramString, 0);
        if (applicationInfo == null) {
          if (paramString.length() != 0) {
            str = "Could not get applicationInfo from package: ".concat(paramString);
          } else {
            str = new String("Could not get applicationInfo from package: ");
          } 
          Log.e("WorkSourceUtil", str);
          return null;
        } 
        return e(((ApplicationInfo)str).uid, paramString);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        String str;
        if (paramString.length() != 0) {
          str = "Could not find package: ".concat(paramString);
        } else {
          str = new String("Could not find package: ");
        } 
        Log.e("WorkSourceUtil", str);
      }  
    return null;
  }
  
  public static List<String> b(WorkSource paramWorkSource) {
    int i;
    byte b = 0;
    if (paramWorkSource == null) {
      i = 0;
    } else {
      i = d(paramWorkSource);
    } 
    if (i == 0)
      return Collections.emptyList(); 
    ArrayList<String> arrayList = new ArrayList();
    while (b < i) {
      String str = f(paramWorkSource, b);
      if (!s.a(str))
        arrayList.add(str); 
      b++;
    } 
    return arrayList;
  }
  
  public static boolean c(Context paramContext) {
    return (paramContext == null) ? false : ((paramContext.getPackageManager() == null) ? false : ((c.a(paramContext).b("android.permission.UPDATE_DEVICE_STATS", paramContext.getPackageName()) == 0)));
  }
  
  private static int d(WorkSource paramWorkSource) {
    Method method = d;
    if (method != null)
      try {
        return ((Integer)method.invoke(paramWorkSource, new Object[0])).intValue();
      } catch (Exception exception) {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception);
      }  
    return 0;
  }
  
  private static WorkSource e(int paramInt, String paramString) {
    WorkSource workSource = new WorkSource();
    h(workSource, paramInt, paramString);
    return workSource;
  }
  
  private static String f(WorkSource paramWorkSource, int paramInt) {
    Method method = f;
    if (method != null)
      try {
        return (String)method.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt) });
      } catch (Exception exception) {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception);
      }  
    return null;
  }
  
  private static Method g() {
    try {
      Method method = WorkSource.class.getMethod("add", new Class[] { int.class });
    } catch (Exception exception) {
      exception = null;
    } 
    return (Method)exception;
  }
  
  private static void h(WorkSource paramWorkSource, int paramInt, String paramString) {
    Method method2 = c;
    if (method2 != null) {
      String str = paramString;
      if (paramString == null)
        str = ""; 
      try {
        method2.invoke(paramWorkSource, new Object[] { Integer.valueOf(paramInt), str });
        return;
      } catch (Exception exception) {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception);
        return;
      } 
    } 
    Method method1 = b;
    if (method1 != null)
      try {
        method1.invoke(exception, new Object[] { Integer.valueOf(paramInt) });
        return;
      } catch (Exception exception1) {
        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", exception1);
      }  
  }
  
  private static Method i() {
    if (o.e())
      try {
        return WorkSource.class.getMethod("add", new Class[] { int.class, String.class });
      } catch (Exception exception) {} 
    return null;
  }
  
  private static Method j() {
    try {
      Method method = WorkSource.class.getMethod("size", new Class[0]);
    } catch (Exception exception) {
      exception = null;
    } 
    return (Method)exception;
  }
  
  private static Method k() {
    try {
      Method method = WorkSource.class.getMethod("get", new Class[] { int.class });
    } catch (Exception exception) {
      exception = null;
    } 
    return (Method)exception;
  }
  
  private static Method l() {
    if (o.e())
      try {
        return WorkSource.class.getMethod("getName", new Class[] { int.class });
      } catch (Exception exception) {} 
    return null;
  }
  
  private static final Method m() {
    if (o.l()) {
      try {
        Method method = WorkSource.class.getMethod("createWorkChain", new Class[0]);
      } catch (Exception exception) {
        Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", exception);
        exception = null;
      } 
      return (Method)exception;
    } 
    Object object = null;
  }
  
  @SuppressLint({"PrivateApi"})
  private static final Method n() {
    if (o.l()) {
      try {
        Method method = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[] { int.class, String.class });
      } catch (Exception exception) {
        Log.w("WorkSourceUtil", "Missing WorkChain class", exception);
        exception = null;
      } 
      return (Method)exception;
    } 
    Object object = null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */