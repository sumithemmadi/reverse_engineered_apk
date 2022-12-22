package androidx.core.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import b.h.i.c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class i {
  private static Field a;
  
  private static boolean b;
  
  private static Field c;
  
  private static boolean d;
  
  public static Drawable[] a(TextView paramTextView) {
    Drawable drawable;
    int j = Build.VERSION.SDK_INT;
    if (j >= 18)
      return paramTextView.getCompoundDrawablesRelative(); 
    if (j >= 17) {
      int k = paramTextView.getLayoutDirection();
      j = 1;
      if (k != 1)
        j = 0; 
      Drawable[] arrayOfDrawable = paramTextView.getCompoundDrawables();
      if (j != 0) {
        Drawable drawable1 = arrayOfDrawable[2];
        drawable = arrayOfDrawable[0];
        arrayOfDrawable[0] = drawable1;
        arrayOfDrawable[2] = drawable;
      } 
      return arrayOfDrawable;
    } 
    return drawable.getCompoundDrawables();
  }
  
  public static int b(TextView paramTextView) {
    return paramTextView.getPaddingTop() - (paramTextView.getPaint().getFontMetricsInt()).top;
  }
  
  public static int c(TextView paramTextView) {
    return paramTextView.getPaddingBottom() + (paramTextView.getPaint().getFontMetricsInt()).bottom;
  }
  
  public static int d(TextView paramTextView) {
    if (Build.VERSION.SDK_INT >= 16)
      return paramTextView.getMaxLines(); 
    if (!d) {
      c = h("mMaxMode");
      d = true;
    } 
    Field field = c;
    if (field != null && i(field, paramTextView) == 1) {
      if (!b) {
        a = h("mMaximum");
        b = true;
      } 
      field = a;
      if (field != null)
        return i(field, paramTextView); 
    } 
    return -1;
  }
  
  private static int e(TextDirectionHeuristic paramTextDirectionHeuristic) {
    return (paramTextDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) ? 1 : ((paramTextDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) ? 1 : ((paramTextDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) ? 2 : ((paramTextDirectionHeuristic == TextDirectionHeuristics.LTR) ? 3 : ((paramTextDirectionHeuristic == TextDirectionHeuristics.RTL) ? 4 : ((paramTextDirectionHeuristic == TextDirectionHeuristics.LOCALE) ? 5 : ((paramTextDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) ? 6 : ((paramTextDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) ? 7 : 1)))))));
  }
  
  private static TextDirectionHeuristic f(TextView paramTextView) {
    if (paramTextView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod)
      return TextDirectionHeuristics.LTR; 
    int j = Build.VERSION.SDK_INT;
    byte b = 0;
    if (j >= 28 && (paramTextView.getInputType() & 0xF) == 3) {
      b = Character.getDirectionality(DecimalFormatSymbols.getInstance(paramTextView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
      return (b == 1 || b == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    } 
    if (paramTextView.getLayoutDirection() == 1)
      b = 1; 
    switch (paramTextView.getTextDirection()) {
      default:
        if (b != 0)
          return TextDirectionHeuristics.FIRSTSTRONG_RTL; 
        break;
      case 7:
        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
      case 6:
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
      case 5:
        return TextDirectionHeuristics.LOCALE;
      case 4:
        return TextDirectionHeuristics.RTL;
      case 3:
        return TextDirectionHeuristics.LTR;
      case 2:
        return TextDirectionHeuristics.ANYRTL_LTR;
    } 
    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
  }
  
  public static c.a g(TextView paramTextView) {
    int j = Build.VERSION.SDK_INT;
    if (j >= 28)
      return new c.a(paramTextView.getTextMetricsParams()); 
    c.a.a a = new c.a.a(new TextPaint((Paint)paramTextView.getPaint()));
    if (j >= 23) {
      a.b(paramTextView.getBreakStrategy());
      a.c(paramTextView.getHyphenationFrequency());
    } 
    if (j >= 18)
      a.d(f(paramTextView)); 
    return a.a();
  }
  
  private static Field h(String paramString) {
    Field field = null;
    try {
      Field field1 = TextView.class.getDeclaredField(paramString);
      field = field1;
      field1.setAccessible(true);
      field = field1;
    } catch (NoSuchFieldException noSuchFieldException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not retrieve ");
      stringBuilder.append(paramString);
      stringBuilder.append(" field.");
      Log.e("TextViewCompat", stringBuilder.toString());
    } 
    return field;
  }
  
  private static int i(Field paramField, TextView paramTextView) {
    try {
      return paramField.getInt(paramTextView);
    } catch (IllegalAccessException illegalAccessException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not retrieve value of ");
      stringBuilder.append(paramField.getName());
      stringBuilder.append(" field.");
      Log.d("TextViewCompat", stringBuilder.toString());
      return -1;
    } 
  }
  
  public static void j(TextView paramTextView, ColorStateList paramColorStateList) {
    b.h.j.i.e(paramTextView);
    if (Build.VERSION.SDK_INT >= 24) {
      paramTextView.setCompoundDrawableTintList(paramColorStateList);
    } else if (paramTextView instanceof l) {
      ((l)paramTextView).setSupportCompoundDrawablesTintList(paramColorStateList);
    } 
  }
  
  public static void k(TextView paramTextView, PorterDuff.Mode paramMode) {
    b.h.j.i.e(paramTextView);
    if (Build.VERSION.SDK_INT >= 24) {
      paramTextView.setCompoundDrawableTintMode(paramMode);
    } else if (paramTextView instanceof l) {
      ((l)paramTextView).setSupportCompoundDrawablesTintMode(paramMode);
    } 
  }
  
  public static void l(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    int j = Build.VERSION.SDK_INT;
    if (j >= 18) {
      paramTextView.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    } else if (j >= 17) {
      Drawable drawable;
      int k = paramTextView.getLayoutDirection();
      j = 1;
      if (k != 1)
        j = 0; 
      if (j != 0) {
        drawable = paramDrawable3;
      } else {
        drawable = paramDrawable1;
      } 
      if (j == 0)
        paramDrawable1 = paramDrawable3; 
      paramTextView.setCompoundDrawables(drawable, paramDrawable2, paramDrawable1, paramDrawable4);
    } else {
      paramTextView.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    } 
  }
  
  public static void m(TextView paramTextView, int paramInt) {
    b.h.j.i.c(paramInt);
    int j = Build.VERSION.SDK_INT;
    if (j >= 28) {
      paramTextView.setFirstBaselineToTopHeight(paramInt);
      return;
    } 
    Paint.FontMetricsInt fontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
    if (j < 16 || paramTextView.getIncludeFontPadding()) {
      j = fontMetricsInt.top;
    } else {
      j = fontMetricsInt.ascent;
    } 
    if (paramInt > Math.abs(j))
      paramTextView.setPadding(paramTextView.getPaddingLeft(), paramInt + j, paramTextView.getPaddingRight(), paramTextView.getPaddingBottom()); 
  }
  
  public static void n(TextView paramTextView, int paramInt) {
    int j;
    b.h.j.i.c(paramInt);
    Paint.FontMetricsInt fontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
    if (Build.VERSION.SDK_INT < 16 || paramTextView.getIncludeFontPadding()) {
      j = fontMetricsInt.bottom;
    } else {
      j = fontMetricsInt.descent;
    } 
    if (paramInt > Math.abs(j))
      paramTextView.setPadding(paramTextView.getPaddingLeft(), paramTextView.getPaddingTop(), paramTextView.getPaddingRight(), paramInt - j); 
  }
  
  public static void o(TextView paramTextView, int paramInt) {
    b.h.j.i.c(paramInt);
    int j = paramTextView.getPaint().getFontMetricsInt(null);
    if (paramInt != j)
      paramTextView.setLineSpacing((paramInt - j), 1.0F); 
  }
  
  public static void p(TextView paramTextView, c paramc) {
    if (Build.VERSION.SDK_INT >= 29) {
      paramTextView.setText((CharSequence)paramc.b());
    } else {
      if (g(paramTextView).a(paramc.a())) {
        paramTextView.setText((CharSequence)paramc);
        return;
      } 
      throw new IllegalArgumentException("Given text can not be applied to TextView.");
    } 
  }
  
  public static void q(TextView paramTextView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 23) {
      paramTextView.setTextAppearance(paramInt);
    } else {
      paramTextView.setTextAppearance(paramTextView.getContext(), paramInt);
    } 
  }
  
  public static void r(TextView paramTextView, c.a parama) {
    int j = Build.VERSION.SDK_INT;
    if (j >= 18)
      paramTextView.setTextDirection(e(parama.d())); 
    if (j < 23) {
      float f = parama.e().getTextScaleX();
      paramTextView.getPaint().set(parama.e());
      if (f == paramTextView.getTextScaleX())
        paramTextView.setTextScaleX(f / 2.0F + 1.0F); 
      paramTextView.setTextScaleX(f);
    } else {
      paramTextView.getPaint().set(parama.e());
      paramTextView.setBreakStrategy(parama.b());
      paramTextView.setHyphenationFrequency(parama.c());
    } 
  }
  
  public static ActionMode.Callback s(TextView paramTextView, ActionMode.Callback paramCallback) {
    int j = Build.VERSION.SDK_INT;
    return (j < 26 || j > 27 || paramCallback instanceof a) ? paramCallback : new a(paramCallback, paramTextView);
  }
  
  private static class a implements ActionMode.Callback {
    private final ActionMode.Callback a;
    
    private final TextView b;
    
    private Class<?> c;
    
    private Method d;
    
    private boolean e;
    
    private boolean f;
    
    a(ActionMode.Callback param1Callback, TextView param1TextView) {
      this.a = param1Callback;
      this.b = param1TextView;
      this.f = false;
    }
    
    private Intent a() {
      return (new Intent()).setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }
    
    private Intent b(ResolveInfo param1ResolveInfo, TextView param1TextView) {
      Intent intent = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", d(param1TextView) ^ true);
      ActivityInfo activityInfo = param1ResolveInfo.activityInfo;
      return intent.setClassName(activityInfo.packageName, activityInfo.name);
    }
    
    private List<ResolveInfo> c(Context param1Context, PackageManager param1PackageManager) {
      ArrayList<ResolveInfo> arrayList = new ArrayList();
      if (!(param1Context instanceof android.app.Activity))
        return arrayList; 
      for (ResolveInfo resolveInfo : param1PackageManager.queryIntentActivities(a(), 0)) {
        if (e(resolveInfo, param1Context))
          arrayList.add(resolveInfo); 
      } 
      return arrayList;
    }
    
    private boolean d(TextView param1TextView) {
      boolean bool;
      if (param1TextView instanceof android.text.Editable && param1TextView.onCheckIsTextEditor() && param1TextView.isEnabled()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    private boolean e(ResolveInfo param1ResolveInfo, Context param1Context) {
      boolean bool = param1Context.getPackageName().equals(param1ResolveInfo.activityInfo.packageName);
      boolean bool1 = true;
      if (bool)
        return true; 
      ActivityInfo activityInfo = param1ResolveInfo.activityInfo;
      if (!activityInfo.exported)
        return false; 
      String str = activityInfo.permission;
      bool = bool1;
      if (str != null)
        if (param1Context.checkSelfPermission(str) == 0) {
          bool = bool1;
        } else {
          bool = false;
        }  
      return bool;
    }
    
    private void f(Menu param1Menu) {
      Context context = this.b.getContext();
      PackageManager packageManager = context.getPackageManager();
      if (!this.f) {
        this.f = true;
        try {
          Class<?> clazz = Class.forName("com.android.internal.view.menu.MenuBuilder");
          this.c = clazz;
          this.d = clazz.getDeclaredMethod("removeItemAt", new Class[] { int.class });
          this.e = true;
        } catch (ClassNotFoundException|NoSuchMethodException classNotFoundException) {
          this.c = null;
          this.d = null;
          this.e = false;
        } 
      } 
      try {
        Method method;
        if (this.e && this.c.isInstance(param1Menu)) {
          method = this.d;
        } else {
          method = param1Menu.getClass().getDeclaredMethod("removeItemAt", new Class[] { int.class });
        } 
        int i;
        for (i = param1Menu.size() - 1; i >= 0; i--) {
          MenuItem menuItem = param1Menu.getItem(i);
          if (menuItem.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(menuItem.getIntent().getAction()))
            method.invoke(param1Menu, new Object[] { Integer.valueOf(i) }); 
        } 
        List<ResolveInfo> list = c(context, packageManager);
        for (i = 0; i < list.size(); i++) {
          ResolveInfo resolveInfo = list.get(i);
          param1Menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.b)).setShowAsAction(1);
        } 
      } catch (NoSuchMethodException|IllegalAccessException|java.lang.reflect.InvocationTargetException noSuchMethodException) {}
    }
    
    public boolean onActionItemClicked(ActionMode param1ActionMode, MenuItem param1MenuItem) {
      return this.a.onActionItemClicked(param1ActionMode, param1MenuItem);
    }
    
    public boolean onCreateActionMode(ActionMode param1ActionMode, Menu param1Menu) {
      return this.a.onCreateActionMode(param1ActionMode, param1Menu);
    }
    
    public void onDestroyActionMode(ActionMode param1ActionMode) {
      this.a.onDestroyActionMode(param1ActionMode);
    }
    
    public boolean onPrepareActionMode(ActionMode param1ActionMode, Menu param1Menu) {
      f(param1Menu);
      return this.a.onPrepareActionMode(param1ActionMode, param1Menu);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */