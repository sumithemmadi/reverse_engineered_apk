package b.a.k.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.v;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"RestrictedAPI"})
public final class a {
  private static final ThreadLocal<TypedValue> a = new ThreadLocal<TypedValue>();
  
  private static final WeakHashMap<Context, SparseArray<a>> b = new WeakHashMap<Context, SparseArray<a>>(0);
  
  private static final Object c = new Object();
  
  private static void a(Context paramContext, int paramInt, ColorStateList paramColorStateList) {
    synchronized (c) {
      WeakHashMap<Context, SparseArray<a>> weakHashMap = b;
      SparseArray<a> sparseArray1 = weakHashMap.get(paramContext);
      SparseArray<a> sparseArray2 = sparseArray1;
      if (sparseArray1 == null) {
        sparseArray2 = new SparseArray();
        this();
        weakHashMap.put(paramContext, sparseArray2);
      } 
      a a1 = new a();
      this(paramColorStateList, paramContext.getResources().getConfiguration());
      sparseArray2.append(paramInt, a1);
      return;
    } 
  }
  
  private static ColorStateList b(Context paramContext, int paramInt) {
    synchronized (c) {
      SparseArray sparseArray = b.get(paramContext);
      if (sparseArray != null && sparseArray.size() > 0) {
        a a1 = (a)sparseArray.get(paramInt);
        if (a1 != null) {
          if (a1.b.equals(paramContext.getResources().getConfiguration()))
            return a1.a; 
          sparseArray.remove(paramInt);
        } 
      } 
      return null;
    } 
  }
  
  public static ColorStateList c(Context paramContext, int paramInt) {
    if (Build.VERSION.SDK_INT >= 23)
      return paramContext.getColorStateList(paramInt); 
    ColorStateList colorStateList = b(paramContext, paramInt);
    if (colorStateList != null)
      return colorStateList; 
    colorStateList = f(paramContext, paramInt);
    if (colorStateList != null) {
      a(paramContext, paramInt, colorStateList);
      return colorStateList;
    } 
    return androidx.core.content.a.e(paramContext, paramInt);
  }
  
  public static Drawable d(Context paramContext, int paramInt) {
    return v.h().j(paramContext, paramInt);
  }
  
  private static TypedValue e() {
    ThreadLocal<TypedValue> threadLocal = a;
    TypedValue typedValue1 = threadLocal.get();
    TypedValue typedValue2 = typedValue1;
    if (typedValue1 == null) {
      typedValue2 = new TypedValue();
      threadLocal.set(typedValue2);
    } 
    return typedValue2;
  }
  
  private static ColorStateList f(Context paramContext, int paramInt) {
    if (g(paramContext, paramInt))
      return null; 
    Resources resources = paramContext.getResources();
    XmlResourceParser xmlResourceParser = resources.getXml(paramInt);
    try {
      return androidx.core.content.d.a.a(resources, (XmlPullParser)xmlResourceParser, paramContext.getTheme());
    } catch (Exception exception) {
      Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", exception);
      return null;
    } 
  }
  
  private static boolean g(Context paramContext, int paramInt) {
    Resources resources = paramContext.getResources();
    TypedValue typedValue = e();
    boolean bool = true;
    resources.getValue(paramInt, typedValue, true);
    paramInt = typedValue.type;
    if (paramInt < 28 || paramInt > 31)
      bool = false; 
    return bool;
  }
  
  private static class a {
    final ColorStateList a;
    
    final Configuration b;
    
    a(ColorStateList param1ColorStateList, Configuration param1Configuration) {
      this.a = param1ColorStateList;
      this.b = param1Configuration;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/k/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */