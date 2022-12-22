package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import b.e.h;
import b.t.a.a.i;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class v {
  private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  
  private static v b;
  
  private static final c c = new c(6);
  
  private WeakHashMap<Context, h<ColorStateList>> d;
  
  private b.e.g<String, e> e;
  
  private h<String> f;
  
  private final WeakHashMap<Context, b.e.d<WeakReference<Drawable.ConstantState>>> g = new WeakHashMap<Context, b.e.d<WeakReference<Drawable.ConstantState>>>(0);
  
  private TypedValue h;
  
  private boolean i;
  
  private f j;
  
  private void a(String paramString, e parame) {
    if (this.e == null)
      this.e = new b.e.g(); 
    this.e.put(paramString, parame);
  }
  
  private boolean b(Context paramContext, long paramLong, Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload #4
    //   4: invokevirtual getConstantState : ()Landroid/graphics/drawable/Drawable$ConstantState;
    //   7: astore #5
    //   9: aload #5
    //   11: ifnull -> 78
    //   14: aload_0
    //   15: getfield g : Ljava/util/WeakHashMap;
    //   18: aload_1
    //   19: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast b/e/d
    //   25: astore #6
    //   27: aload #6
    //   29: astore #4
    //   31: aload #6
    //   33: ifnonnull -> 57
    //   36: new b/e/d
    //   39: astore #4
    //   41: aload #4
    //   43: invokespecial <init> : ()V
    //   46: aload_0
    //   47: getfield g : Ljava/util/WeakHashMap;
    //   50: aload_1
    //   51: aload #4
    //   53: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   56: pop
    //   57: new java/lang/ref/WeakReference
    //   60: astore_1
    //   61: aload_1
    //   62: aload #5
    //   64: invokespecial <init> : (Ljava/lang/Object;)V
    //   67: aload #4
    //   69: lload_2
    //   70: aload_1
    //   71: invokevirtual n : (JLjava/lang/Object;)V
    //   74: aload_0
    //   75: monitorexit
    //   76: iconst_1
    //   77: ireturn
    //   78: aload_0
    //   79: monitorexit
    //   80: iconst_0
    //   81: ireturn
    //   82: astore_1
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_1
    //   86: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	82	finally
    //   14	27	82	finally
    //   36	57	82	finally
    //   57	74	82	finally
  }
  
  private void c(Context paramContext, int paramInt, ColorStateList paramColorStateList) {
    if (this.d == null)
      this.d = new WeakHashMap<Context, h<ColorStateList>>(); 
    h<ColorStateList> h1 = this.d.get(paramContext);
    h<ColorStateList> h2 = h1;
    if (h1 == null) {
      h2 = new h();
      this.d.put(paramContext, h2);
    } 
    h2.a(paramInt, paramColorStateList);
  }
  
  private void d(Context paramContext) {
    if (this.i)
      return; 
    this.i = true;
    Drawable drawable = j(paramContext, b.a.m.a.abc_vector_test);
    if (drawable != null && q(drawable))
      return; 
    this.i = false;
    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
  }
  
  private static long e(TypedValue paramTypedValue) {
    return paramTypedValue.assetCookie << 32L | paramTypedValue.data;
  }
  
  private Drawable f(Context paramContext, int paramInt) {
    Drawable drawable1;
    if (this.h == null)
      this.h = new TypedValue(); 
    TypedValue typedValue = this.h;
    paramContext.getResources().getValue(paramInt, typedValue, true);
    long l = e(typedValue);
    Drawable drawable2 = i(paramContext, l);
    if (drawable2 != null)
      return drawable2; 
    f f1 = this.j;
    if (f1 == null) {
      f1 = null;
    } else {
      drawable1 = f1.c(this, paramContext, paramInt);
    } 
    if (drawable1 != null) {
      drawable1.setChangingConfigurations(typedValue.changingConfigurations);
      b(paramContext, l, drawable1);
    } 
    return drawable1;
  }
  
  private static PorterDuffColorFilter g(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfint) {
    return (paramColorStateList == null || paramMode == null) ? null : l(paramColorStateList.getColorForState(paramArrayOfint, 0), paramMode);
  }
  
  public static v h() {
    // Byte code:
    //   0: ldc androidx/appcompat/widget/v
    //   2: monitorenter
    //   3: getstatic androidx/appcompat/widget/v.b : Landroidx/appcompat/widget/v;
    //   6: ifnonnull -> 25
    //   9: new androidx/appcompat/widget/v
    //   12: astore_0
    //   13: aload_0
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: putstatic androidx/appcompat/widget/v.b : Landroidx/appcompat/widget/v;
    //   21: aload_0
    //   22: invokestatic p : (Landroidx/appcompat/widget/v;)V
    //   25: getstatic androidx/appcompat/widget/v.b : Landroidx/appcompat/widget/v;
    //   28: astore_0
    //   29: ldc androidx/appcompat/widget/v
    //   31: monitorexit
    //   32: aload_0
    //   33: areturn
    //   34: astore_0
    //   35: ldc androidx/appcompat/widget/v
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   3	25	34	finally
    //   25	29	34	finally
  }
  
  private Drawable i(Context paramContext, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Ljava/util/WeakHashMap;
    //   6: aload_1
    //   7: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast b/e/d
    //   13: astore #4
    //   15: aload #4
    //   17: ifnonnull -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: aload #4
    //   26: lload_2
    //   27: invokevirtual i : (J)Ljava/lang/Object;
    //   30: checkcast java/lang/ref/WeakReference
    //   33: astore #5
    //   35: aload #5
    //   37: ifnull -> 75
    //   40: aload #5
    //   42: invokevirtual get : ()Ljava/lang/Object;
    //   45: checkcast android/graphics/drawable/Drawable$ConstantState
    //   48: astore #5
    //   50: aload #5
    //   52: ifnull -> 69
    //   55: aload #5
    //   57: aload_1
    //   58: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   61: invokevirtual newDrawable : (Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: areturn
    //   69: aload #4
    //   71: lload_2
    //   72: invokevirtual q : (J)V
    //   75: aload_0
    //   76: monitorexit
    //   77: aconst_null
    //   78: areturn
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	79	finally
    //   24	35	79	finally
    //   40	50	79	finally
    //   55	65	79	finally
    //   69	75	79	finally
  }
  
  public static PorterDuffColorFilter l(int paramInt, PorterDuff.Mode paramMode) {
    // Byte code:
    //   0: ldc androidx/appcompat/widget/v
    //   2: monitorenter
    //   3: getstatic androidx/appcompat/widget/v.c : Landroidx/appcompat/widget/v$c;
    //   6: astore_2
    //   7: aload_2
    //   8: iload_0
    //   9: aload_1
    //   10: invokevirtual i : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    //   13: astore_3
    //   14: aload_3
    //   15: astore #4
    //   17: aload_3
    //   18: ifnonnull -> 42
    //   21: new android/graphics/PorterDuffColorFilter
    //   24: astore #4
    //   26: aload #4
    //   28: iload_0
    //   29: aload_1
    //   30: invokespecial <init> : (ILandroid/graphics/PorterDuff$Mode;)V
    //   33: aload_2
    //   34: iload_0
    //   35: aload_1
    //   36: aload #4
    //   38: invokevirtual j : (ILandroid/graphics/PorterDuff$Mode;Landroid/graphics/PorterDuffColorFilter;)Landroid/graphics/PorterDuffColorFilter;
    //   41: pop
    //   42: ldc androidx/appcompat/widget/v
    //   44: monitorexit
    //   45: aload #4
    //   47: areturn
    //   48: astore_1
    //   49: ldc androidx/appcompat/widget/v
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   3	14	48	finally
    //   21	42	48	finally
  }
  
  private ColorStateList n(Context paramContext, int paramInt) {
    WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.d;
    ColorStateList colorStateList1 = null;
    ColorStateList colorStateList2 = colorStateList1;
    if (weakHashMap != null) {
      h h1 = weakHashMap.get(paramContext);
      colorStateList2 = colorStateList1;
      if (h1 != null)
        colorStateList2 = (ColorStateList)h1.i(paramInt); 
    } 
    return colorStateList2;
  }
  
  private static void p(v paramv) {
    if (Build.VERSION.SDK_INT < 24) {
      paramv.a("vector", new g());
      paramv.a("animated-vector", new b());
      paramv.a("animated-selector", new a());
      paramv.a("drawable", new d());
    } 
  }
  
  private static boolean q(Drawable paramDrawable) {
    return (paramDrawable instanceof i || "android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()));
  }
  
  private Drawable r(Context paramContext, int paramInt) {
    b.e.g<String, e> g1 = this.e;
    if (g1 != null && !g1.isEmpty()) {
      h<String> h1 = this.f;
      if (h1 != null) {
        String str = (String)h1.i(paramInt);
        if ("appcompat_skip_skip".equals(str) || (str != null && this.e.get(str) == null))
          return null; 
      } else {
        this.f = new h();
      } 
      if (this.h == null)
        this.h = new TypedValue(); 
      TypedValue typedValue = this.h;
      Resources resources = paramContext.getResources();
      resources.getValue(paramInt, typedValue, true);
      long l = e(typedValue);
      Drawable drawable1 = i(paramContext, l);
      if (drawable1 != null)
        return drawable1; 
      CharSequence charSequence = typedValue.string;
      Drawable drawable2 = drawable1;
      if (charSequence != null) {
        drawable2 = drawable1;
        if (charSequence.toString().endsWith(".xml")) {
          drawable2 = drawable1;
          try {
            int i;
            XmlResourceParser xmlResourceParser = resources.getXml(paramInt);
            drawable2 = drawable1;
            AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
            while (true) {
              drawable2 = drawable1;
              i = xmlResourceParser.next();
              if (i != 2 && i != 1)
                continue; 
              break;
            } 
            if (i == 2) {
              drawable2 = drawable1;
              String str = xmlResourceParser.getName();
              drawable2 = drawable1;
              this.f.a(paramInt, str);
              drawable2 = drawable1;
              e e = (e)this.e.get(str);
              Drawable drawable = drawable1;
              if (e != null) {
                drawable2 = drawable1;
                drawable = e.a(paramContext, (XmlPullParser)xmlResourceParser, attributeSet, paramContext.getTheme());
              } 
              drawable2 = drawable;
              if (drawable != null) {
                drawable2 = drawable;
                drawable.setChangingConfigurations(typedValue.changingConfigurations);
                drawable2 = drawable;
                b(paramContext, l, drawable);
                drawable2 = drawable;
              } 
            } else {
              drawable2 = drawable1;
              XmlPullParserException xmlPullParserException = new XmlPullParserException();
              drawable2 = drawable1;
              this("No start tag found");
              drawable2 = drawable1;
              throw xmlPullParserException;
            } 
          } catch (Exception exception) {
            Log.e("ResourceManagerInternal", "Exception while inflating drawable", exception);
          } 
        } 
      } 
      if (drawable2 == null)
        this.f.a(paramInt, "appcompat_skip_skip"); 
      return drawable2;
    } 
    return null;
  }
  
  private Drawable v(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable) {
    Drawable drawable;
    PorterDuff.Mode mode1;
    PorterDuff.Mode mode2;
    ColorStateList colorStateList = m(paramContext, paramInt);
    if (colorStateList != null) {
      drawable = paramDrawable;
      if (q.a(paramDrawable))
        drawable = paramDrawable.mutate(); 
      drawable = androidx.core.graphics.drawable.a.r(drawable);
      androidx.core.graphics.drawable.a.o(drawable, colorStateList);
      mode1 = o(paramInt);
      Drawable drawable1 = drawable;
      if (mode1 != null) {
        androidx.core.graphics.drawable.a.p(drawable, mode1);
        drawable1 = drawable;
      } 
    } else {
      f f1 = this.j;
      if (f1 != null && f1.e((Context)drawable, paramInt, (Drawable)mode1)) {
        mode2 = mode1;
      } else {
        mode2 = mode1;
        if (!x((Context)drawable, paramInt, (Drawable)mode1)) {
          mode2 = mode1;
          if (paramBoolean)
            mode2 = null; 
        } 
      } 
    } 
    return (Drawable)mode2;
  }
  
  static void w(Drawable paramDrawable, c0 paramc0, int[] paramArrayOfint) {
    if (q.a(paramDrawable) && paramDrawable.mutate() != paramDrawable) {
      Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
      return;
    } 
    boolean bool = paramc0.d;
    if (bool || paramc0.c) {
      PorterDuff.Mode mode;
      ColorStateList colorStateList;
      if (bool) {
        colorStateList = paramc0.a;
      } else {
        colorStateList = null;
      } 
      if (paramc0.c) {
        mode = paramc0.b;
      } else {
        mode = a;
      } 
      paramDrawable.setColorFilter((ColorFilter)g(colorStateList, mode, paramArrayOfint));
    } else {
      paramDrawable.clearColorFilter();
    } 
    if (Build.VERSION.SDK_INT <= 23)
      paramDrawable.invalidateSelf(); 
  }
  
  public Drawable j(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: iload_2
    //   5: iconst_0
    //   6: invokevirtual k : (Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    //   9: astore_1
    //   10: aload_0
    //   11: monitorexit
    //   12: aload_1
    //   13: areturn
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	14	finally
  }
  
  Drawable k(Context paramContext, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial d : (Landroid/content/Context;)V
    //   7: aload_0
    //   8: aload_1
    //   9: iload_2
    //   10: invokespecial r : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   13: astore #4
    //   15: aload #4
    //   17: astore #5
    //   19: aload #4
    //   21: ifnonnull -> 32
    //   24: aload_0
    //   25: aload_1
    //   26: iload_2
    //   27: invokespecial f : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   30: astore #5
    //   32: aload #5
    //   34: astore #4
    //   36: aload #5
    //   38: ifnonnull -> 48
    //   41: aload_1
    //   42: iload_2
    //   43: invokestatic f : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   46: astore #4
    //   48: aload #4
    //   50: astore #5
    //   52: aload #4
    //   54: ifnull -> 68
    //   57: aload_0
    //   58: aload_1
    //   59: iload_2
    //   60: iload_3
    //   61: aload #4
    //   63: invokespecial v : (Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   66: astore #5
    //   68: aload #5
    //   70: ifnull -> 78
    //   73: aload #5
    //   75: invokestatic b : (Landroid/graphics/drawable/Drawable;)V
    //   78: aload_0
    //   79: monitorexit
    //   80: aload #5
    //   82: areturn
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	83	finally
    //   24	32	83	finally
    //   41	48	83	finally
    //   57	68	83	finally
    //   73	78	83	finally
  }
  
  ColorStateList m(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: iload_2
    //   5: invokespecial n : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   8: astore_3
    //   9: aload_3
    //   10: astore #4
    //   12: aload_3
    //   13: ifnonnull -> 56
    //   16: aload_0
    //   17: getfield j : Landroidx/appcompat/widget/v$f;
    //   20: astore_3
    //   21: aload_3
    //   22: ifnonnull -> 30
    //   25: aconst_null
    //   26: astore_3
    //   27: goto -> 39
    //   30: aload_3
    //   31: aload_1
    //   32: iload_2
    //   33: invokeinterface d : (Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    //   38: astore_3
    //   39: aload_3
    //   40: astore #4
    //   42: aload_3
    //   43: ifnull -> 56
    //   46: aload_0
    //   47: aload_1
    //   48: iload_2
    //   49: aload_3
    //   50: invokespecial c : (Landroid/content/Context;ILandroid/content/res/ColorStateList;)V
    //   53: aload_3
    //   54: astore #4
    //   56: aload_0
    //   57: monitorexit
    //   58: aload #4
    //   60: areturn
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	61	finally
    //   16	21	61	finally
    //   30	39	61	finally
    //   46	53	61	finally
  }
  
  PorterDuff.Mode o(int paramInt) {
    PorterDuff.Mode mode;
    f f1 = this.j;
    if (f1 == null) {
      f1 = null;
    } else {
      mode = f1.b(paramInt);
    } 
    return mode;
  }
  
  public void s(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Ljava/util/WeakHashMap;
    //   6: aload_1
    //   7: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast b/e/d
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull -> 22
    //   18: aload_1
    //   19: invokevirtual b : ()V
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	25	finally
    //   18	22	25	finally
  }
  
  Drawable t(Context paramContext, j0 paramj0, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: iload_3
    //   5: invokespecial r : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   8: astore #4
    //   10: aload #4
    //   12: astore #5
    //   14: aload #4
    //   16: ifnonnull -> 26
    //   19: aload_2
    //   20: iload_3
    //   21: invokevirtual c : (I)Landroid/graphics/drawable/Drawable;
    //   24: astore #5
    //   26: aload #5
    //   28: ifnull -> 45
    //   31: aload_0
    //   32: aload_1
    //   33: iload_3
    //   34: iconst_0
    //   35: aload #5
    //   37: invokespecial v : (Landroid/content/Context;IZLandroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: areturn
    //   45: aload_0
    //   46: monitorexit
    //   47: aconst_null
    //   48: areturn
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	49	finally
    //   19	26	49	finally
    //   31	41	49	finally
  }
  
  public void u(f paramf) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield j : Landroidx/appcompat/widget/v$f;
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  boolean x(Context paramContext, int paramInt, Drawable paramDrawable) {
    boolean bool;
    f f1 = this.j;
    if (f1 != null && f1.a(paramContext, paramInt, paramDrawable)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  static class a implements e {
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        return (Drawable)b.a.l.a.a.m(param1Context, param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
      } catch (Exception exception) {
        Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", exception);
        return null;
      } 
    }
  }
  
  private static class b implements e {
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        return (Drawable)b.t.a.a.c.a(param1Context, param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
      } catch (Exception exception) {
        Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", exception);
        return null;
      } 
    }
  }
  
  private static class c extends b.e.e<Integer, PorterDuffColorFilter> {
    public c(int param1Int) {
      super(param1Int);
    }
    
    private static int h(int param1Int, PorterDuff.Mode param1Mode) {
      return (param1Int + 31) * 31 + param1Mode.hashCode();
    }
    
    PorterDuffColorFilter i(int param1Int, PorterDuff.Mode param1Mode) {
      return (PorterDuffColorFilter)c(Integer.valueOf(h(param1Int, param1Mode)));
    }
    
    PorterDuffColorFilter j(int param1Int, PorterDuff.Mode param1Mode, PorterDuffColorFilter param1PorterDuffColorFilter) {
      return (PorterDuffColorFilter)d(Integer.valueOf(h(param1Int, param1Mode)), param1PorterDuffColorFilter);
    }
  }
  
  static class d implements e {
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      String str = param1AttributeSet.getClassAttribute();
      if (str != null)
        try {
          Drawable drawable = d.class.getClassLoader().loadClass(str).<Drawable>asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
          if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
          } else {
            drawable.inflate(param1Context.getResources(), param1XmlPullParser, param1AttributeSet);
          } 
          return drawable;
        } catch (Exception exception) {
          Log.e("DrawableDelegate", "Exception while inflating <drawable>", exception);
        }  
      return null;
    }
  }
  
  private static interface e {
    Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme);
  }
  
  public static interface f {
    boolean a(Context param1Context, int param1Int, Drawable param1Drawable);
    
    PorterDuff.Mode b(int param1Int);
    
    Drawable c(v param1v, Context param1Context, int param1Int);
    
    ColorStateList d(Context param1Context, int param1Int);
    
    boolean e(Context param1Context, int param1Int, Drawable param1Drawable);
  }
  
  private static class g implements e {
    public Drawable a(Context param1Context, XmlPullParser param1XmlPullParser, AttributeSet param1AttributeSet, Resources.Theme param1Theme) {
      try {
        return (Drawable)i.c(param1Context.getResources(), param1XmlPullParser, param1AttributeSet, param1Theme);
      } catch (Exception exception) {
        Log.e("VdcInflateDelegate", "Exception while inflating <vector>", exception);
        return null;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */