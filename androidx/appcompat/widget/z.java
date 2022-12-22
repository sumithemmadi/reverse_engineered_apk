package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b.a.j;
import b.h.e.a;

public class z {
  private static final ThreadLocal<TypedValue> a = new ThreadLocal<TypedValue>();
  
  static final int[] b = new int[] { -16842910 };
  
  static final int[] c = new int[] { 16842908 };
  
  static final int[] d = new int[] { 16843518 };
  
  static final int[] e = new int[] { 16842919 };
  
  static final int[] f = new int[] { 16842912 };
  
  static final int[] g = new int[] { 16842913 };
  
  static final int[] h = new int[] { -16842919, -16842908 };
  
  static final int[] i = new int[0];
  
  private static final int[] j = new int[1];
  
  public static void a(View paramView, Context paramContext) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(j.AppCompatTheme);
    try {
      if (!typedArray.hasValue(j.AppCompatTheme_windowActionBar)) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("View ");
        stringBuilder.append(paramView.getClass());
        stringBuilder.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
        Log.e("ThemeUtils", stringBuilder.toString());
      } 
      return;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static int b(Context paramContext, int paramInt) {
    ColorStateList colorStateList = e(paramContext, paramInt);
    if (colorStateList != null && colorStateList.isStateful())
      return colorStateList.getColorForState(b, colorStateList.getDefaultColor()); 
    TypedValue typedValue = f();
    paramContext.getTheme().resolveAttribute(16842803, typedValue, true);
    return d(paramContext, paramInt, typedValue.getFloat());
  }
  
  public static int c(Context paramContext, int paramInt) {
    int[] arrayOfInt = j;
    arrayOfInt[0] = paramInt;
    e0 e0 = e0.u(paramContext, null, arrayOfInt);
    try {
      paramInt = e0.b(0, 0);
      return paramInt;
    } finally {
      e0.w();
    } 
  }
  
  static int d(Context paramContext, int paramInt, float paramFloat) {
    paramInt = c(paramContext, paramInt);
    return a.d(paramInt, Math.round(Color.alpha(paramInt) * paramFloat));
  }
  
  public static ColorStateList e(Context paramContext, int paramInt) {
    null = j;
    null[0] = paramInt;
    e0 e0 = e0.u(paramContext, null, null);
    try {
      return e0.c(0);
    } finally {
      e0.w();
    } 
  }
  
  private static TypedValue f() {
    ThreadLocal<TypedValue> threadLocal = a;
    TypedValue typedValue1 = threadLocal.get();
    TypedValue typedValue2 = typedValue1;
    if (typedValue1 == null) {
      typedValue2 = new TypedValue();
      threadLocal.set(typedValue2);
    } 
    return typedValue2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */