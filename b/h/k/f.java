package b.h.k;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class f {
  private static boolean a = false;
  
  private static Method b;
  
  private static boolean c = false;
  
  private static Field d;
  
  private static boolean a(ActionBar paramActionBar, KeyEvent paramKeyEvent) {
    if (!a) {
      try {
        b = paramActionBar.getClass().getMethod("onMenuKeyEvent", new Class[] { KeyEvent.class });
      } catch (NoSuchMethodException noSuchMethodException) {}
      a = true;
    } 
    Method method = b;
    if (method != null)
      try {
        return ((Boolean)method.invoke(paramActionBar, new Object[] { paramKeyEvent })).booleanValue();
      } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {} 
    return false;
  }
  
  private static boolean b(Activity paramActivity, KeyEvent paramKeyEvent) {
    paramActivity.onUserInteraction();
    Window window = paramActivity.getWindow();
    if (window.hasFeature(8)) {
      ActionBar actionBar = paramActivity.getActionBar();
      if (paramKeyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, paramKeyEvent))
        return true; 
    } 
    if (window.superDispatchKeyEvent(paramKeyEvent))
      return true; 
    View view = window.getDecorView();
    if (w.i(view, paramKeyEvent))
      return true; 
    if (view != null) {
      KeyEvent.DispatcherState dispatcherState = view.getKeyDispatcherState();
    } else {
      view = null;
    } 
    return paramKeyEvent.dispatch((KeyEvent.Callback)paramActivity, (KeyEvent.DispatcherState)view, paramActivity);
  }
  
  private static boolean c(Dialog paramDialog, KeyEvent paramKeyEvent) {
    DialogInterface.OnKeyListener onKeyListener = f(paramDialog);
    if (onKeyListener != null && onKeyListener.onKey((DialogInterface)paramDialog, paramKeyEvent.getKeyCode(), paramKeyEvent))
      return true; 
    Window window = paramDialog.getWindow();
    if (window.superDispatchKeyEvent(paramKeyEvent))
      return true; 
    View view = window.getDecorView();
    if (w.i(view, paramKeyEvent))
      return true; 
    if (view != null) {
      KeyEvent.DispatcherState dispatcherState = view.getKeyDispatcherState();
    } else {
      view = null;
    } 
    return paramKeyEvent.dispatch((KeyEvent.Callback)paramDialog, (KeyEvent.DispatcherState)view, paramDialog);
  }
  
  public static boolean d(View paramView, KeyEvent paramKeyEvent) {
    return w.j(paramView, paramKeyEvent);
  }
  
  public static boolean e(a parama, View paramView, Window.Callback paramCallback, KeyEvent paramKeyEvent) {
    boolean bool = false;
    if (parama == null)
      return false; 
    if (Build.VERSION.SDK_INT >= 28)
      return parama.k(paramKeyEvent); 
    if (paramCallback instanceof Activity)
      return b((Activity)paramCallback, paramKeyEvent); 
    if (paramCallback instanceof Dialog)
      return c((Dialog)paramCallback, paramKeyEvent); 
    if ((paramView != null && w.i(paramView, paramKeyEvent)) || parama.k(paramKeyEvent))
      bool = true; 
    return bool;
  }
  
  private static DialogInterface.OnKeyListener f(Dialog paramDialog) {
    if (!c) {
      try {
        Field field1 = Dialog.class.getDeclaredField("mOnKeyListener");
        d = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {}
      c = true;
    } 
    Field field = d;
    if (field != null)
      try {
        return (DialogInterface.OnKeyListener)field.get(paramDialog);
      } catch (IllegalAccessException illegalAccessException) {} 
    return null;
  }
  
  public static interface a {
    boolean k(KeyEvent param1KeyEvent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */