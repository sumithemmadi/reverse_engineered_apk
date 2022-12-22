package b.h.k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import b.h.f.a.b;

public final class i {
  public static MenuItem a(MenuItem paramMenuItem, b paramb) {
    if (paramMenuItem instanceof b)
      return (MenuItem)((b)paramMenuItem).a(paramb); 
    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
    return paramMenuItem;
  }
  
  public static void b(MenuItem paramMenuItem, char paramChar, int paramInt) {
    if (paramMenuItem instanceof b) {
      ((b)paramMenuItem).setAlphabeticShortcut(paramChar, paramInt);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setAlphabeticShortcut(paramChar, paramInt);
    } 
  }
  
  public static void c(MenuItem paramMenuItem, CharSequence paramCharSequence) {
    if (paramMenuItem instanceof b) {
      ((b)paramMenuItem).setContentDescription(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setContentDescription(paramCharSequence);
    } 
  }
  
  public static void d(MenuItem paramMenuItem, ColorStateList paramColorStateList) {
    if (paramMenuItem instanceof b) {
      ((b)paramMenuItem).setIconTintList(paramColorStateList);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setIconTintList(paramColorStateList);
    } 
  }
  
  public static void e(MenuItem paramMenuItem, PorterDuff.Mode paramMode) {
    if (paramMenuItem instanceof b) {
      ((b)paramMenuItem).setIconTintMode(paramMode);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setIconTintMode(paramMode);
    } 
  }
  
  public static void f(MenuItem paramMenuItem, char paramChar, int paramInt) {
    if (paramMenuItem instanceof b) {
      ((b)paramMenuItem).setNumericShortcut(paramChar, paramInt);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setNumericShortcut(paramChar, paramInt);
    } 
  }
  
  public static void g(MenuItem paramMenuItem, CharSequence paramCharSequence) {
    if (paramMenuItem instanceof b) {
      ((b)paramMenuItem).setTooltipText(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 26) {
      paramMenuItem.setTooltipText(paramCharSequence);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */