package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class d {
  protected static final Class<?> a;
  
  protected static final Field b;
  
  protected static final Field c;
  
  protected static final Method d;
  
  protected static final Method e;
  
  protected static final Method f;
  
  private static final Handler g = new Handler(Looper.getMainLooper());
  
  static {
    Class<?> clazz = a();
    a = clazz;
    b = b();
    c = f();
    d = d(clazz);
    e = c(clazz);
    f = e(clazz);
  }
  
  private static Class<?> a() {
    try {
      return Class.forName("android.app.ActivityThread");
    } finally {
      Exception exception = null;
    } 
  }
  
  private static Field b() {
    try {
      Field field = Activity.class.getDeclaredField("mMainThread");
      return field;
    } finally {
      Exception exception = null;
    } 
  }
  
  private static Method c(Class<?> paramClass) {
    if (paramClass == null)
      return null; 
    try {
      Method method = paramClass.getDeclaredMethod("performStopActivity", new Class[] { IBinder.class, boolean.class });
      return method;
    } finally {
      paramClass = null;
    } 
  }
  
  private static Method d(Class<?> paramClass) {
    if (paramClass == null)
      return null; 
    try {
      Method method = paramClass.getDeclaredMethod("performStopActivity", new Class[] { IBinder.class, boolean.class, String.class });
      return method;
    } finally {
      paramClass = null;
    } 
  }
  
  private static Method e(Class<?> paramClass) {
    if (g() && paramClass != null)
      try {
        Class<int> clazz = int.class;
        Class<boolean> clazz1 = boolean.class;
        Method method = paramClass.getDeclaredMethod("requestRelaunchActivity", new Class[] { IBinder.class, List.class, List.class, clazz, clazz1, Configuration.class, Configuration.class, clazz1, clazz1 });
        method.setAccessible(true);
        return method;
      } finally {} 
    return null;
  }
  
  private static Field f() {
    try {
      Field field = Activity.class.getDeclaredField("mToken");
      return field;
    } finally {
      Exception exception = null;
    } 
  }
  
  private static boolean g() {
    int i = Build.VERSION.SDK_INT;
    return (i == 26 || i == 27);
  }
  
  protected static boolean h(Object paramObject, int paramInt, Activity paramActivity) {
    try {
      Object object1 = c.get(paramActivity);
      if (object1 != paramObject || paramActivity.hashCode() != paramInt)
        return false; 
      Object object2 = b.get(paramActivity);
      Handler handler = g;
      paramObject = new c();
      return true;
    } finally {
      paramObject = null;
      Log.e("ActivityRecreator", "Exception while fetching field values", (Throwable)paramObject);
    } 
  }
  
  static boolean i(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 28) {
      paramActivity.recreate();
      return true;
    } 
    if (g() && f == null)
      return false; 
    if (e == null && d == null)
      return false; 
    try {
      null = c.get(paramActivity);
      if (null == null)
        return false; 
      Object object = b.get(paramActivity);
      if (object == null)
        return false; 
      Application application = paramActivity.getApplication();
      d d1 = new d();
      this(paramActivity);
      application.registerActivityLifecycleCallbacks(d1);
      Handler handler = g;
      a a = new a();
      this(d1, null);
      handler.post(a);
    } finally {
      paramActivity = null;
    } 
  }
  
  class a implements Runnable {
    a(d this$0, Object param1Object) {}
    
    public void run() {
      this.b.b = this.c;
    }
  }
  
  class b implements Runnable {
    b(d this$0, d.d param1d) {}
    
    public void run() {
      this.b.unregisterActivityLifecycleCallbacks(this.c);
    }
  }
  
  class c implements Runnable {
    c(d this$0, Object param1Object1) {}
    
    public void run() {
      try {
        Method method = d.d;
      } catch (RuntimeException runtimeException) {
      
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  private static final class d implements Application.ActivityLifecycleCallbacks {
    Object b;
    
    private Activity c;
    
    private final int d;
    
    private boolean e = false;
    
    private boolean f = false;
    
    private boolean g = false;
    
    d(Activity param1Activity) {
      this.c = param1Activity;
      this.d = param1Activity.hashCode();
    }
    
    public void onActivityCreated(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityDestroyed(Activity param1Activity) {
      if (this.c == param1Activity) {
        this.c = null;
        this.f = true;
      } 
    }
    
    public void onActivityPaused(Activity param1Activity) {
      if (this.f && !this.g && !this.e && d.h(this.b, this.d, param1Activity)) {
        this.g = true;
        this.b = null;
      } 
    }
    
    public void onActivityResumed(Activity param1Activity) {}
    
    public void onActivitySaveInstanceState(Activity param1Activity, Bundle param1Bundle) {}
    
    public void onActivityStarted(Activity param1Activity) {
      if (this.c == param1Activity)
        this.e = true; 
    }
    
    public void onActivityStopped(Activity param1Activity) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */