package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class c {
  private static Field a;
  
  private static boolean b;
  
  public static Drawable a(CompoundButton paramCompoundButton) {
    if (Build.VERSION.SDK_INT >= 23)
      return paramCompoundButton.getButtonDrawable(); 
    if (!b) {
      try {
        Field field1 = CompoundButton.class.getDeclaredField("mButtonDrawable");
        a = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", noSuchFieldException);
      } 
      b = true;
    } 
    Field field = a;
    if (field != null)
      try {
        return (Drawable)field.get(paramCompoundButton);
      } catch (IllegalAccessException illegalAccessException) {
        Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", illegalAccessException);
        a = null;
      }  
    return null;
  }
  
  public static ColorStateList b(CompoundButton paramCompoundButton) {
    return (Build.VERSION.SDK_INT >= 21) ? paramCompoundButton.getButtonTintList() : ((paramCompoundButton instanceof k) ? ((k)paramCompoundButton).getSupportButtonTintList() : null);
  }
  
  public static void c(CompoundButton paramCompoundButton, ColorStateList paramColorStateList) {
    if (Build.VERSION.SDK_INT >= 21) {
      paramCompoundButton.setButtonTintList(paramColorStateList);
    } else if (paramCompoundButton instanceof k) {
      ((k)paramCompoundButton).setSupportButtonTintList(paramColorStateList);
    } 
  }
  
  public static void d(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode) {
    if (Build.VERSION.SDK_INT >= 21) {
      paramCompoundButton.setButtonTintMode(paramMode);
    } else if (paramCompoundButton instanceof k) {
      ((k)paramCompoundButton).setSupportButtonTintMode(paramMode);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */