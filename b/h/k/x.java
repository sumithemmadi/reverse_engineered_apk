package b.h.k;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public final class x {
  private static Method a;
  
  static {
    if (Build.VERSION.SDK_INT == 25)
      try {
        a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
      } catch (Exception exception) {
        Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
      }  
  }
  
  private static float a(ViewConfiguration paramViewConfiguration, Context paramContext) {
    if (Build.VERSION.SDK_INT >= 25) {
      Method method = a;
      if (method != null)
        try {
          int i = ((Integer)method.invoke(paramViewConfiguration, new Object[0])).intValue();
          return i;
        } catch (Exception exception) {
          Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
        }  
    } 
    TypedValue typedValue = new TypedValue();
    return paramContext.getTheme().resolveAttribute(16842829, typedValue, true) ? typedValue.getDimension(paramContext.getResources().getDisplayMetrics()) : 0.0F;
  }
  
  public static float b(ViewConfiguration paramViewConfiguration, Context paramContext) {
    return (Build.VERSION.SDK_INT >= 26) ? paramViewConfiguration.getScaledHorizontalScrollFactor() : a(paramViewConfiguration, paramContext);
  }
  
  public static int c(ViewConfiguration paramViewConfiguration) {
    return (Build.VERSION.SDK_INT >= 28) ? paramViewConfiguration.getScaledHoverSlop() : (paramViewConfiguration.getScaledTouchSlop() / 2);
  }
  
  @Deprecated
  public static int d(ViewConfiguration paramViewConfiguration) {
    return paramViewConfiguration.getScaledPagingTouchSlop();
  }
  
  public static float e(ViewConfiguration paramViewConfiguration, Context paramContext) {
    return (Build.VERSION.SDK_INT >= 26) ? paramViewConfiguration.getScaledVerticalScrollFactor() : a(paramViewConfiguration, paramContext);
  }
  
  public static boolean f(ViewConfiguration paramViewConfiguration, Context paramContext) {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 28)
      return paramViewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent(); 
    Resources resources = paramContext.getResources();
    int i = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
    if (i != 0 && resources.getBoolean(i)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */