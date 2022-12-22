package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.a;
import androidx.core.graphics.drawable.c;
import b.a.l.a.c;
import java.lang.reflect.Field;

@SuppressLint({"RestrictedAPI"})
public class q {
  private static final int[] a = new int[] { 16842912 };
  
  private static final int[] b = new int[0];
  
  public static final Rect c = new Rect();
  
  private static Class<?> d;
  
  static {
    if (Build.VERSION.SDK_INT >= 18)
      try {
        d = Class.forName("android.graphics.Insets");
      } catch (ClassNotFoundException classNotFoundException) {} 
  }
  
  public static boolean a(Drawable paramDrawable) {
    Drawable[] arrayOfDrawable;
    int i = Build.VERSION.SDK_INT;
    if (i < 15 && paramDrawable instanceof android.graphics.drawable.InsetDrawable)
      return false; 
    if (i < 15 && paramDrawable instanceof android.graphics.drawable.GradientDrawable)
      return false; 
    if (i < 17 && paramDrawable instanceof android.graphics.drawable.LayerDrawable)
      return false; 
    if (paramDrawable instanceof DrawableContainer) {
      Drawable.ConstantState constantState = paramDrawable.getConstantState();
      if (constantState instanceof DrawableContainer.DrawableContainerState) {
        arrayOfDrawable = ((DrawableContainer.DrawableContainerState)constantState).getChildren();
        int j = arrayOfDrawable.length;
        for (i = 0; i < j; i++) {
          if (!a(arrayOfDrawable[i]))
            return false; 
        } 
      } 
    } else {
      if (arrayOfDrawable instanceof c)
        return a(((c)arrayOfDrawable).b()); 
      if (arrayOfDrawable instanceof c)
        return a(((c)arrayOfDrawable).a()); 
      if (arrayOfDrawable instanceof ScaleDrawable)
        return a(((ScaleDrawable)arrayOfDrawable).getDrawable()); 
    } 
    return true;
  }
  
  static void b(Drawable paramDrawable) {
    if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()))
      c(paramDrawable); 
  }
  
  private static void c(Drawable paramDrawable) {
    int[] arrayOfInt = paramDrawable.getState();
    if (arrayOfInt == null || arrayOfInt.length == 0) {
      paramDrawable.setState(a);
    } else {
      paramDrawable.setState(b);
    } 
    paramDrawable.setState(arrayOfInt);
  }
  
  public static Rect d(Drawable paramDrawable) {
    Rect rect;
    if (Build.VERSION.SDK_INT >= 29) {
      Insets insets = paramDrawable.getOpticalInsets();
      rect = new Rect();
      rect.left = insets.left;
      rect.right = insets.right;
      rect.top = insets.top;
      rect.bottom = insets.bottom;
      return rect;
    } 
    if (d != null)
      try {
        Drawable drawable = a.q((Drawable)rect);
        Object object = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
        if (object != null) {
          Rect rect1 = new Rect();
          this();
          for (Field field : d.getFields()) {
            String str = field.getName();
            byte b = -1;
            switch (str.hashCode()) {
              case 108511772:
                if (str.equals("right"))
                  b = 2; 
                break;
              case 3317767:
                if (str.equals("left"))
                  b = 0; 
                break;
              case 115029:
                if (str.equals("top"))
                  b = 1; 
                break;
              case -1383228885:
                if (str.equals("bottom"))
                  b = 3; 
                break;
            } 
            if (b != 0) {
              if (b != 1) {
                if (b != 2) {
                  if (b == 3)
                    rect1.bottom = field.getInt(object); 
                } else {
                  rect1.right = field.getInt(object);
                } 
              } else {
                rect1.top = field.getInt(object);
              } 
            } else {
              rect1.left = field.getInt(object);
            } 
          } 
          return rect1;
        } 
      } catch (Exception exception) {
        Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
      }  
    return c;
  }
  
  public static PorterDuff.Mode e(int paramInt, PorterDuff.Mode paramMode) {
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 9) {
          switch (paramInt) {
            default:
              return paramMode;
            case 16:
              return PorterDuff.Mode.ADD;
            case 15:
              return PorterDuff.Mode.SCREEN;
            case 14:
              break;
          } 
          return PorterDuff.Mode.MULTIPLY;
        } 
        return PorterDuff.Mode.SRC_ATOP;
      } 
      return PorterDuff.Mode.SRC_IN;
    } 
    return PorterDuff.Mode.SRC_OVER;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */