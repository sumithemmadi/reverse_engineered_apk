package androidx.core.content.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import b.h.e.d;
import b.h.j.i;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class f {
  public static Drawable a(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    return (Build.VERSION.SDK_INT >= 21) ? paramResources.getDrawable(paramInt, paramTheme) : paramResources.getDrawable(paramInt);
  }
  
  public static Typeface b(Context paramContext, int paramInt) {
    return paramContext.isRestricted() ? null : e(paramContext, paramInt, new TypedValue(), 0, null, null, false, false);
  }
  
  public static Typeface c(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, a parama) {
    return paramContext.isRestricted() ? null : e(paramContext, paramInt1, paramTypedValue, paramInt2, parama, null, true, false);
  }
  
  public static void d(Context paramContext, int paramInt, a parama, Handler paramHandler) {
    i.e(parama);
    if (paramContext.isRestricted()) {
      parama.a(-4, paramHandler);
      return;
    } 
    e(paramContext, paramInt, new TypedValue(), 0, parama, paramHandler, false, false);
  }
  
  private static Typeface e(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, a parama, Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2) {
    Resources resources = paramContext.getResources();
    resources.getValue(paramInt1, paramTypedValue, true);
    Typeface typeface = f(paramContext, resources, paramTypedValue, paramInt1, paramInt2, parama, paramHandler, paramBoolean1, paramBoolean2);
    if (typeface != null || parama != null || paramBoolean2)
      return typeface; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Font resource ID #0x");
    stringBuilder.append(Integer.toHexString(paramInt1));
    stringBuilder.append(" could not be retrieved.");
    throw new Resources.NotFoundException(stringBuilder.toString());
  }
  
  private static Typeface f(Context paramContext, Resources paramResources, TypedValue paramTypedValue, int paramInt1, int paramInt2, a parama, Handler paramHandler, boolean paramBoolean1, boolean paramBoolean2) {
    String str;
    CharSequence charSequence = paramTypedValue.string;
    if (charSequence != null) {
      str = charSequence.toString();
      if (!str.startsWith("res/")) {
        if (parama != null)
          parama.a(-3, paramHandler); 
        return null;
      } 
      Typeface typeface = d.f(paramResources, paramInt1, paramInt2);
      if (typeface != null) {
        if (parama != null)
          parama.b(typeface, paramHandler); 
        return typeface;
      } 
      if (paramBoolean2)
        return null; 
      try {
        if (str.toLowerCase().endsWith(".xml")) {
          c.a a1 = c.b((XmlPullParser)paramResources.getXml(paramInt1), paramResources);
          if (a1 == null) {
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (parama != null)
              parama.a(-3, paramHandler); 
            return null;
          } 
          return d.c(paramContext, a1, paramResources, paramInt1, paramInt2, parama, paramHandler, paramBoolean1);
        } 
        Typeface typeface1 = d.d(paramContext, paramResources, paramInt1, str, paramInt2);
        if (parama != null)
          if (typeface1 != null) {
            parama.b(typeface1, paramHandler);
          } else {
            parama.a(-3, paramHandler);
          }  
        return typeface1;
      } catch (XmlPullParserException xmlPullParserException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Failed to parse xml resource ");
        stringBuilder1.append(str);
        Log.e("ResourcesCompat", stringBuilder1.toString(), (Throwable)xmlPullParserException);
      } catch (IOException iOException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Failed to read xml resource ");
        stringBuilder1.append(str);
        Log.e("ResourcesCompat", stringBuilder1.toString(), iOException);
      } 
      if (parama != null)
        parama.a(-3, paramHandler); 
      return null;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Resource \"");
    stringBuilder.append(iOException.getResourceName(paramInt1));
    stringBuilder.append("\" (");
    stringBuilder.append(Integer.toHexString(paramInt1));
    stringBuilder.append(") is not a Font: ");
    stringBuilder.append(str);
    throw new Resources.NotFoundException(stringBuilder.toString());
  }
  
  public static abstract class a {
    public static Handler c(Handler param1Handler) {
      Handler handler = param1Handler;
      if (param1Handler == null)
        handler = new Handler(Looper.getMainLooper()); 
      return handler;
    }
    
    public final void a(int param1Int, Handler param1Handler) {
      c(param1Handler).post(new b(this, param1Int));
    }
    
    public final void b(Typeface param1Typeface, Handler param1Handler) {
      c(param1Handler).post(new a(this, param1Typeface));
    }
    
    public abstract void d(int param1Int);
    
    public abstract void e(Typeface param1Typeface);
    
    class a implements Runnable {
      a(f.a this$0, Typeface param2Typeface) {}
      
      public void run() {
        this.c.e(this.b);
      }
    }
    
    class b implements Runnable {
      b(f.a this$0, int param2Int) {}
      
      public void run() {
        this.c.d(this.b);
      }
    }
  }
  
  class a implements Runnable {
    a(f this$0, Typeface param1Typeface) {}
    
    public void run() {
      this.c.e(this.b);
    }
  }
  
  class b implements Runnable {
    b(f this$0, int param1Int) {}
    
    public void run() {
      this.c.d(this.b);
    }
  }
  
  public static final class b {
    public static void a(Resources.Theme param1Theme) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 29) {
        b.a(param1Theme);
      } else if (i >= 23) {
        a.a(param1Theme);
      } 
    }
    
    static class a {
      private static final Object a = new Object();
      
      private static Method b;
      
      private static boolean c;
      
      static void a(Resources.Theme param2Theme) {
        synchronized (a) {
          boolean bool = c;
          if (!bool) {
            try {
              Method method1 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
              b = method1;
              method1.setAccessible(true);
            } catch (NoSuchMethodException noSuchMethodException) {
              Log.i("ResourcesCompat", "Failed to retrieve rebase() method", noSuchMethodException);
            } 
            c = true;
          } 
          Method method = b;
          if (method != null)
            try {
              method.invoke(param2Theme, new Object[0]);
            } catch (IllegalAccessException illegalAccessException) {
              Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", illegalAccessException);
              b = null;
            } catch (InvocationTargetException invocationTargetException) {} 
          return;
        } 
      }
    }
    
    static class b {
      static void a(Resources.Theme param2Theme) {
        param2Theme.rebase();
      }
    }
  }
  
  static class a {
    private static final Object a = new Object();
    
    private static Method b;
    
    private static boolean c;
    
    static void a(Resources.Theme param1Theme) {
      synchronized (a) {
        boolean bool = c;
        if (!bool) {
          try {
            Method method1 = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
            b = method1;
            method1.setAccessible(true);
          } catch (NoSuchMethodException noSuchMethodException) {
            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", noSuchMethodException);
          } 
          c = true;
        } 
        Method method = b;
        if (method != null)
          try {
            method.invoke(param1Theme, new Object[0]);
          } catch (IllegalAccessException illegalAccessException) {
            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", illegalAccessException);
            b = null;
          } catch (InvocationTargetException invocationTargetException) {} 
        return;
      } 
    }
  }
  
  static class b {
    static void a(Resources.Theme param1Theme) {
      param1Theme.rebase();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/content/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */