package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import b.a.j;
import b.h.k.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

class n {
  private static final RectF a = new RectF();
  
  @SuppressLint({"BanConcurrentHashMap"})
  private static ConcurrentHashMap<String, Method> b = new ConcurrentHashMap<String, Method>();
  
  @SuppressLint({"BanConcurrentHashMap"})
  private static ConcurrentHashMap<String, Field> c = new ConcurrentHashMap<String, Field>();
  
  private int d = 0;
  
  private boolean e = false;
  
  private float f = -1.0F;
  
  private float g = -1.0F;
  
  private float h = -1.0F;
  
  private int[] i = new int[0];
  
  private boolean j = false;
  
  private TextPaint k;
  
  private final TextView l;
  
  private final Context m;
  
  private final c n;
  
  n(TextView paramTextView) {
    this.l = paramTextView;
    this.m = paramTextView.getContext();
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      this.n = new b();
    } else if (i >= 23) {
      this.n = new a();
    } else {
      this.n = new c();
    } 
  }
  
  private void A(TypedArray paramTypedArray) {
    int i = paramTypedArray.length();
    int[] arrayOfInt = new int[i];
    if (i > 0) {
      for (byte b = 0; b < i; b++)
        arrayOfInt[b] = paramTypedArray.getDimensionPixelSize(b, -1); 
      this.i = c(arrayOfInt);
      B();
    } 
  }
  
  private boolean B() {
    boolean bool;
    int[] arrayOfInt = this.i;
    int i = arrayOfInt.length;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.j = bool;
    if (bool) {
      this.d = 1;
      this.g = arrayOfInt[0];
      this.h = arrayOfInt[i - 1];
      this.f = -1.0F;
    } 
    return bool;
  }
  
  private boolean C(int paramInt, RectF paramRectF) {
    byte b;
    CharSequence charSequence1 = this.l.getText();
    TransformationMethod transformationMethod = this.l.getTransformationMethod();
    CharSequence charSequence2 = charSequence1;
    if (transformationMethod != null) {
      CharSequence charSequence = transformationMethod.getTransformation(charSequence1, (View)this.l);
      charSequence2 = charSequence1;
      if (charSequence != null)
        charSequence2 = charSequence; 
    } 
    if (Build.VERSION.SDK_INT >= 16) {
      b = this.l.getMaxLines();
    } else {
      b = -1;
    } 
    q(paramInt);
    StaticLayout staticLayout = e(charSequence2, r(this.l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(paramRectF.right), b);
    return (b != -1 && (staticLayout.getLineCount() > b || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != charSequence2.length())) ? false : (!(staticLayout.getHeight() > paramRectF.bottom));
  }
  
  private boolean D() {
    return this.l instanceof AppCompatEditText ^ true;
  }
  
  private void E(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramFloat1 > 0.0F) {
      if (paramFloat2 > paramFloat1) {
        if (paramFloat3 > 0.0F) {
          this.d = 1;
          this.g = paramFloat1;
          this.h = paramFloat2;
          this.f = paramFloat3;
          this.j = false;
          return;
        } 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("The auto-size step granularity (");
        stringBuilder2.append(paramFloat3);
        stringBuilder2.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Maximum auto-size text size (");
      stringBuilder1.append(paramFloat2);
      stringBuilder1.append("px) is less or equal to minimum auto-size text size (");
      stringBuilder1.append(paramFloat1);
      stringBuilder1.append("px)");
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Minimum auto-size text size (");
    stringBuilder.append(paramFloat1);
    stringBuilder.append("px) is less or equal to (0px)");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static <T> T a(Object paramObject, String paramString, T paramT) {
    try {
      Field field = o(paramString);
      return (T)((field == null) ? (Object)paramT : field.get(paramObject));
    } catch (IllegalAccessException illegalAccessException) {
      paramObject = new StringBuilder();
      paramObject.append("Failed to access TextView#");
      paramObject.append(paramString);
      paramObject.append(" member");
      Log.w("ACTVAutoSizeHelper", paramObject.toString(), illegalAccessException);
      return paramT;
    } 
  }
  
  private int[] c(int[] paramArrayOfint) {
    int i = paramArrayOfint.length;
    if (i == 0)
      return paramArrayOfint; 
    Arrays.sort(paramArrayOfint);
    ArrayList<? extends Comparable<? super Integer>> arrayList = new ArrayList();
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      int j = paramArrayOfint[b];
      if (j > 0 && Collections.binarySearch(arrayList, Integer.valueOf(j)) < 0)
        arrayList.add(Integer.valueOf(j)); 
    } 
    if (i == arrayList.size())
      return paramArrayOfint; 
    i = arrayList.size();
    paramArrayOfint = new int[i];
    for (b = bool; b < i; b++)
      paramArrayOfint[b] = ((Integer)arrayList.get(b)).intValue(); 
    return paramArrayOfint;
  }
  
  private void d() {
    this.d = 0;
    this.g = -1.0F;
    this.h = -1.0F;
    this.f = -1.0F;
    this.i = new int[0];
    this.e = false;
  }
  
  private StaticLayout f(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2) {
    StaticLayout.Builder builder1 = StaticLayout.Builder.obtain(paramCharSequence, 0, paramCharSequence.length(), this.k, paramInt1);
    StaticLayout.Builder builder2 = builder1.setAlignment(paramAlignment).setLineSpacing(this.l.getLineSpacingExtra(), this.l.getLineSpacingMultiplier()).setIncludePad(this.l.getIncludeFontPadding()).setBreakStrategy(this.l.getBreakStrategy()).setHyphenationFrequency(this.l.getHyphenationFrequency());
    paramInt1 = paramInt2;
    if (paramInt2 == -1)
      paramInt1 = Integer.MAX_VALUE; 
    builder2.setMaxLines(paramInt1);
    try {
      this.n.a(builder1, this.l);
    } catch (ClassCastException classCastException) {
      Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
    } 
    return builder1.build();
  }
  
  private StaticLayout g(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt) {
    float f1 = ((Float)a(this.l, "mSpacingMult", Float.valueOf(1.0F))).floatValue();
    float f2 = ((Float)a(this.l, "mSpacingAdd", Float.valueOf(0.0F))).floatValue();
    boolean bool = ((Boolean)a(this.l, "mIncludePad", Boolean.TRUE)).booleanValue();
    return new StaticLayout(paramCharSequence, this.k, paramInt, paramAlignment, f1, f2, bool);
  }
  
  private StaticLayout h(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt) {
    float f1 = this.l.getLineSpacingMultiplier();
    float f2 = this.l.getLineSpacingExtra();
    boolean bool = this.l.getIncludeFontPadding();
    return new StaticLayout(paramCharSequence, this.k, paramInt, paramAlignment, f1, f2, bool);
  }
  
  private int i(RectF paramRectF) {
    int i = this.i.length;
    if (i != 0) {
      int j = i - 1;
      i = 1;
      int k = 0;
      while (i <= j) {
        int m = (i + j) / 2;
        if (C(this.i[m], paramRectF)) {
          k = i;
          i = m + 1;
          continue;
        } 
        k = m - 1;
        j = k;
      } 
      return this.i[k];
    } 
    IllegalStateException illegalStateException = new IllegalStateException("No available text sizes to choose from.");
    throw illegalStateException;
  }
  
  private static Field o(String paramString) {
    try {
      Field field1 = c.get(paramString);
      Field field2 = field1;
      if (field1 == null) {
        field1 = TextView.class.getDeclaredField(paramString);
        field2 = field1;
        if (field1 != null) {
          field1.setAccessible(true);
          c.put(paramString, field1);
          field2 = field1;
        } 
      } 
      return field2;
    } catch (NoSuchFieldException noSuchFieldException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to access TextView#");
      stringBuilder.append(paramString);
      stringBuilder.append(" member");
      Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), noSuchFieldException);
      return null;
    } 
  }
  
  private static Method p(String paramString) {
    try {
      Method method1 = b.get(paramString);
      Method method2 = method1;
      if (method1 == null) {
        method1 = TextView.class.getDeclaredMethod(paramString, new Class[0]);
        method2 = method1;
        if (method1 != null) {
          method1.setAccessible(true);
          b.put(paramString, method1);
          method2 = method1;
        } 
      } 
      return method2;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to retrieve TextView#");
      stringBuilder.append(paramString);
      stringBuilder.append("() method");
      Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), exception);
      return null;
    } 
  }
  
  static <T> T r(Object paramObject, String paramString, T paramT) {
    try {
      paramObject = p(paramString).invoke(paramObject, new Object[0]);
      paramT = (T)paramObject;
    } catch (Exception exception) {
      paramObject = new StringBuilder();
      super();
      paramObject.append("Failed to invoke TextView#");
      paramObject.append(paramString);
      paramObject.append("() method");
      Log.w("ACTVAutoSizeHelper", paramObject.toString(), exception);
    } finally {}
    return paramT;
  }
  
  private void x(float paramFloat) {
    if (paramFloat != this.l.getPaint().getTextSize()) {
      boolean bool;
      this.l.getPaint().setTextSize(paramFloat);
      if (Build.VERSION.SDK_INT >= 18) {
        bool = this.l.isInLayout();
      } else {
        bool = false;
      } 
      if (this.l.getLayout() != null) {
        this.e = false;
        try {
          Method method = p("nullLayouts");
          if (method != null)
            method.invoke(this.l, new Object[0]); 
        } catch (Exception exception) {
          Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", exception);
        } 
        if (!bool) {
          this.l.requestLayout();
        } else {
          this.l.forceLayout();
        } 
        this.l.invalidate();
      } 
    } 
  }
  
  private boolean z() {
    boolean bool = D();
    byte b = 0;
    if (bool && this.d == 1) {
      if (!this.j || this.i.length == 0) {
        int i = (int)Math.floor(((this.h - this.g) / this.f)) + 1;
        int[] arrayOfInt = new int[i];
        while (b < i) {
          arrayOfInt[b] = Math.round(this.g + b * this.f);
          b++;
        } 
        this.i = c(arrayOfInt);
      } 
      this.e = true;
    } else {
      this.e = false;
    } 
    return this.e;
  }
  
  void b() {
    if (!s())
      return; 
    if (this.e) {
      int i;
      if (this.l.getMeasuredHeight() <= 0 || this.l.getMeasuredWidth() <= 0)
        return; 
      if (this.n.b(this.l)) {
        i = 1048576;
      } else {
        i = this.l.getMeasuredWidth() - this.l.getTotalPaddingLeft() - this.l.getTotalPaddingRight();
      } 
      int j = this.l.getHeight() - this.l.getCompoundPaddingBottom() - this.l.getCompoundPaddingTop();
      if (i <= 0 || j <= 0)
        return; 
      synchronized (a) {
        null.setEmpty();
        null.right = i;
        null.bottom = j;
        float f = i(null);
        if (f != this.l.getTextSize())
          y(0, f); 
      } 
    } 
    this.e = true;
  }
  
  StaticLayout e(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2) {
    int i = Build.VERSION.SDK_INT;
    return (i >= 23) ? f(paramCharSequence, paramAlignment, paramInt1, paramInt2) : ((i >= 16) ? h(paramCharSequence, paramAlignment, paramInt1) : g(paramCharSequence, paramAlignment, paramInt1));
  }
  
  int j() {
    return Math.round(this.h);
  }
  
  int k() {
    return Math.round(this.g);
  }
  
  int l() {
    return Math.round(this.f);
  }
  
  int[] m() {
    return this.i;
  }
  
  int n() {
    return this.d;
  }
  
  void q(int paramInt) {
    TextPaint textPaint = this.k;
    if (textPaint == null) {
      this.k = new TextPaint();
    } else {
      textPaint.reset();
    } 
    this.k.set(this.l.getPaint());
    this.k.setTextSize(paramInt);
  }
  
  boolean s() {
    boolean bool;
    if (D() && this.d != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void t(AttributeSet paramAttributeSet, int paramInt) {
    float f1;
    float f2;
    float f3;
    Context context = this.m;
    int[] arrayOfInt = j.AppCompatTextView;
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    TextView textView = this.l;
    w.p0((View)textView, textView.getContext(), arrayOfInt, paramAttributeSet, typedArray, paramInt, 0);
    paramInt = j.AppCompatTextView_autoSizeTextType;
    if (typedArray.hasValue(paramInt))
      this.d = typedArray.getInt(paramInt, 0); 
    paramInt = j.AppCompatTextView_autoSizeStepGranularity;
    if (typedArray.hasValue(paramInt)) {
      f1 = typedArray.getDimension(paramInt, -1.0F);
    } else {
      f1 = -1.0F;
    } 
    paramInt = j.AppCompatTextView_autoSizeMinTextSize;
    if (typedArray.hasValue(paramInt)) {
      f2 = typedArray.getDimension(paramInt, -1.0F);
    } else {
      f2 = -1.0F;
    } 
    paramInt = j.AppCompatTextView_autoSizeMaxTextSize;
    if (typedArray.hasValue(paramInt)) {
      f3 = typedArray.getDimension(paramInt, -1.0F);
    } else {
      f3 = -1.0F;
    } 
    paramInt = j.AppCompatTextView_autoSizePresetSizes;
    if (typedArray.hasValue(paramInt)) {
      paramInt = typedArray.getResourceId(paramInt, 0);
      if (paramInt > 0) {
        TypedArray typedArray1 = typedArray.getResources().obtainTypedArray(paramInt);
        A(typedArray1);
        typedArray1.recycle();
      } 
    } 
    typedArray.recycle();
    if (D()) {
      if (this.d == 1) {
        if (!this.j) {
          DisplayMetrics displayMetrics = this.m.getResources().getDisplayMetrics();
          float f = f2;
          if (f2 == -1.0F)
            f = TypedValue.applyDimension(2, 12.0F, displayMetrics); 
          f2 = f3;
          if (f3 == -1.0F)
            f2 = TypedValue.applyDimension(2, 112.0F, displayMetrics); 
          f3 = f1;
          if (f1 == -1.0F)
            f3 = 1.0F; 
          E(f, f2, f3);
        } 
        z();
      } 
    } else {
      this.d = 0;
    } 
  }
  
  void u(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (D()) {
      DisplayMetrics displayMetrics = this.m.getResources().getDisplayMetrics();
      E(TypedValue.applyDimension(paramInt4, paramInt1, displayMetrics), TypedValue.applyDimension(paramInt4, paramInt2, displayMetrics), TypedValue.applyDimension(paramInt4, paramInt3, displayMetrics));
      if (z())
        b(); 
    } 
  }
  
  void v(int[] paramArrayOfint, int paramInt) {
    if (D()) {
      int i = paramArrayOfint.length;
      byte b = 0;
      if (i > 0) {
        int[] arrayOfInt2;
        int[] arrayOfInt1 = new int[i];
        if (paramInt == 0) {
          arrayOfInt2 = Arrays.copyOf(paramArrayOfint, i);
        } else {
          DisplayMetrics displayMetrics = this.m.getResources().getDisplayMetrics();
          while (true) {
            arrayOfInt2 = arrayOfInt1;
            if (b < i) {
              arrayOfInt1[b] = Math.round(TypedValue.applyDimension(paramInt, paramArrayOfint[b], displayMetrics));
              b++;
              continue;
            } 
            break;
          } 
        } 
        this.i = c(arrayOfInt2);
        if (!B()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("None of the preset sizes is valid: ");
          stringBuilder.append(Arrays.toString(paramArrayOfint));
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        this.j = false;
      } 
      if (z())
        b(); 
    } 
  }
  
  void w(int paramInt) {
    if (D())
      if (paramInt != 0) {
        if (paramInt == 1) {
          DisplayMetrics displayMetrics = this.m.getResources().getDisplayMetrics();
          E(TypedValue.applyDimension(2, 12.0F, displayMetrics), TypedValue.applyDimension(2, 112.0F, displayMetrics), 1.0F);
          if (z())
            b(); 
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown auto-size text type: ");
          stringBuilder.append(paramInt);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        d();
      }  
  }
  
  void y(int paramInt, float paramFloat) {
    Resources resources;
    Context context = this.m;
    if (context == null) {
      resources = Resources.getSystem();
    } else {
      resources = resources.getResources();
    } 
    x(TypedValue.applyDimension(paramInt, paramFloat, resources.getDisplayMetrics()));
  }
  
  private static class a extends c {
    void a(StaticLayout.Builder param1Builder, TextView param1TextView) {
      param1Builder.setTextDirection(n.<TextDirectionHeuristic>r(param1TextView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
  }
  
  private static class b extends a {
    void a(StaticLayout.Builder param1Builder, TextView param1TextView) {
      param1Builder.setTextDirection(param1TextView.getTextDirectionHeuristic());
    }
    
    boolean b(TextView param1TextView) {
      return param1TextView.isHorizontallyScrollable();
    }
  }
  
  private static class c {
    void a(StaticLayout.Builder param1Builder, TextView param1TextView) {}
    
    boolean b(TextView param1TextView) {
      return ((Boolean)n.<Boolean>r(param1TextView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */