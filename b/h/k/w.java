package b.h.k;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import b.h.k.f0.c;
import b.h.k.f0.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class w {
  private static final AtomicInteger a = new AtomicInteger(1);
  
  private static Field b;
  
  private static boolean c;
  
  private static Field d;
  
  private static boolean e;
  
  private static WeakHashMap<View, String> f;
  
  private static WeakHashMap<View, a0> g = null;
  
  private static Field h;
  
  private static boolean i = false;
  
  private static ThreadLocal<Rect> j;
  
  private static final int[] k = new int[] { 
      b.h.c.accessibility_custom_action_0, b.h.c.accessibility_custom_action_1, b.h.c.accessibility_custom_action_2, b.h.c.accessibility_custom_action_3, b.h.c.accessibility_custom_action_4, b.h.c.accessibility_custom_action_5, b.h.c.accessibility_custom_action_6, b.h.c.accessibility_custom_action_7, b.h.c.accessibility_custom_action_8, b.h.c.accessibility_custom_action_9, 
      b.h.c.accessibility_custom_action_10, b.h.c.accessibility_custom_action_11, b.h.c.accessibility_custom_action_12, b.h.c.accessibility_custom_action_13, b.h.c.accessibility_custom_action_14, b.h.c.accessibility_custom_action_15, b.h.c.accessibility_custom_action_16, b.h.c.accessibility_custom_action_17, b.h.c.accessibility_custom_action_18, b.h.c.accessibility_custom_action_19, 
      b.h.c.accessibility_custom_action_20, b.h.c.accessibility_custom_action_21, b.h.c.accessibility_custom_action_22, b.h.c.accessibility_custom_action_23, b.h.c.accessibility_custom_action_24, b.h.c.accessibility_custom_action_25, b.h.c.accessibility_custom_action_26, b.h.c.accessibility_custom_action_27, b.h.c.accessibility_custom_action_28, b.h.c.accessibility_custom_action_29, 
      b.h.c.accessibility_custom_action_30, b.h.c.accessibility_custom_action_31 };
  
  private static final s l = new a();
  
  private static f m = new f();
  
  public static int A(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.getImportantForAccessibility() : 0;
  }
  
  public static void A0(View paramView, boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 16)
      paramView.setHasTransientState(paramBoolean); 
  }
  
  @SuppressLint({"InlinedApi"})
  public static int B(View paramView) {
    return (Build.VERSION.SDK_INT >= 26) ? paramView.getImportantForAutofill() : 0;
  }
  
  public static void B0(View paramView, int paramInt) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 19) {
      paramView.setImportantForAccessibility(paramInt);
    } else if (i >= 16) {
      i = paramInt;
      if (paramInt == 4)
        i = 2; 
      paramView.setImportantForAccessibility(i);
    } 
  }
  
  public static int C(View paramView) {
    return (Build.VERSION.SDK_INT >= 17) ? paramView.getLayoutDirection() : 0;
  }
  
  public static void C0(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 26)
      paramView.setImportantForAutofill(paramInt); 
  }
  
  public static int D(View paramView) {
    if (Build.VERSION.SDK_INT >= 16)
      return paramView.getMinimumHeight(); 
    if (!e) {
      try {
        Field field1 = View.class.getDeclaredField("mMinHeight");
        d = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {}
      e = true;
    } 
    Field field = d;
    if (field != null)
      try {
        return ((Integer)field.get(paramView)).intValue();
      } catch (Exception exception) {} 
    return 0;
  }
  
  public static void D0(View paramView, Paint paramPaint) {
    if (Build.VERSION.SDK_INT >= 17) {
      paramView.setLayerPaint(paramPaint);
    } else {
      paramView.setLayerType(paramView.getLayerType(), paramPaint);
      paramView.invalidate();
    } 
  }
  
  public static int E(View paramView) {
    if (Build.VERSION.SDK_INT >= 16)
      return paramView.getMinimumWidth(); 
    if (!c) {
      try {
        Field field1 = View.class.getDeclaredField("mMinWidth");
        b = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {}
      c = true;
    } 
    Field field = b;
    if (field != null)
      try {
        return ((Integer)field.get(paramView)).intValue();
      } catch (Exception exception) {} 
    return 0;
  }
  
  public static void E0(View paramView, q paramq) {
    if (Build.VERSION.SDK_INT >= 21)
      h.d(paramView, paramq); 
  }
  
  public static String[] F(View paramView) {
    return (String[])paramView.getTag(b.h.c.tag_on_receive_content_mime_types);
  }
  
  public static void F0(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (Build.VERSION.SDK_INT >= 17) {
      paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  static a G(View paramView) {
    a a1 = l(paramView);
    a a2 = a1;
    if (a1 == null)
      a2 = new a(); 
    r0(paramView, a2);
    return a2;
  }
  
  public static void G0(View paramView, u paramu) {
    if (Build.VERSION.SDK_INT >= 24) {
      if (paramu != null) {
        Object object = paramu.a();
      } else {
        paramu = null;
      } 
      paramView.setPointerIcon((PointerIcon)paramu);
    } 
  }
  
  public static int H(View paramView) {
    return (Build.VERSION.SDK_INT >= 17) ? paramView.getPaddingEnd() : paramView.getPaddingRight();
  }
  
  public static void H0(View paramView, int paramInt1, int paramInt2) {
    if (Build.VERSION.SDK_INT >= 23)
      paramView.setScrollIndicators(paramInt1, paramInt2); 
  }
  
  public static int I(View paramView) {
    return (Build.VERSION.SDK_INT >= 17) ? paramView.getPaddingStart() : paramView.getPaddingLeft();
  }
  
  public static void I0(View paramView, CharSequence paramCharSequence) {
    if (Build.VERSION.SDK_INT >= 19)
      N0().g(paramView, paramCharSequence); 
  }
  
  public static ViewParent J(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.getParentForAccessibility() : paramView.getParent();
  }
  
  public static void J0(View paramView, String paramString) {
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.setTransitionName(paramString);
    } else {
      if (f == null)
        f = new WeakHashMap<View, String>(); 
      f.put(paramView, paramString);
    } 
  }
  
  public static e0 K(View paramView) {
    int i = Build.VERSION.SDK_INT;
    return (i >= 23) ? i.a(paramView) : ((i >= 21) ? h.c(paramView) : null);
  }
  
  public static void K0(View paramView, float paramFloat) {
    if (Build.VERSION.SDK_INT >= 21)
      paramView.setTranslationZ(paramFloat); 
  }
  
  public static final CharSequence L(View paramView) {
    return N0().f(paramView);
  }
  
  private static void L0(View paramView) {
    if (A(paramView) == 0)
      B0(paramView, 1); 
    for (ViewParent viewParent = paramView.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
      if (A((View)viewParent) == 4) {
        B0(paramView, 2);
        break;
      } 
    } 
  }
  
  public static String M(View paramView) {
    if (Build.VERSION.SDK_INT >= 21)
      return paramView.getTransitionName(); 
    WeakHashMap<View, String> weakHashMap = f;
    return (weakHashMap == null) ? null : weakHashMap.get(paramView);
  }
  
  public static void M0(View paramView, float paramFloat) {
    if (Build.VERSION.SDK_INT >= 21)
      paramView.setZ(paramFloat); 
  }
  
  public static float N(View paramView) {
    return (Build.VERSION.SDK_INT >= 21) ? paramView.getTranslationZ() : 0.0F;
  }
  
  private static g<CharSequence> N0() {
    return new d(b.h.c.tag_state_description, CharSequence.class, 64, 30);
  }
  
  public static int O(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.getWindowSystemUiVisibility() : 0;
  }
  
  public static void O0(View paramView) {
    if (Build.VERSION.SDK_INT >= 21) {
      paramView.stopNestedScroll();
    } else if (paramView instanceof k) {
      ((k)paramView).stopNestedScroll();
    } 
  }
  
  public static float P(View paramView) {
    return (Build.VERSION.SDK_INT >= 21) ? paramView.getZ() : 0.0F;
  }
  
  private static void P0(View paramView) {
    float f1 = paramView.getTranslationY();
    paramView.setTranslationY(1.0F + f1);
    paramView.setTranslationY(f1);
  }
  
  public static boolean Q(View paramView) {
    return (Build.VERSION.SDK_INT >= 15) ? paramView.hasOnClickListeners() : false;
  }
  
  public static boolean R(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.hasOverlappingRendering() : true;
  }
  
  public static boolean S(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.hasTransientState() : false;
  }
  
  public static boolean T(View paramView) {
    boolean bool1;
    Boolean bool = a().f(paramView);
    if (bool == null) {
      bool1 = false;
    } else {
      bool1 = bool.booleanValue();
    } 
    return bool1;
  }
  
  public static boolean U(View paramView) {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 19)
      return paramView.isAttachedToWindow(); 
    if (paramView.getWindowToken() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean V(View paramView) {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 19)
      return paramView.isLaidOut(); 
    if (paramView.getWidth() > 0 && paramView.getHeight() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean W(View paramView) {
    return (Build.VERSION.SDK_INT >= 21) ? paramView.isNestedScrollingEnabled() : ((paramView instanceof k) ? ((k)paramView).isNestedScrollingEnabled() : false);
  }
  
  public static boolean X(View paramView) {
    return (Build.VERSION.SDK_INT >= 17) ? paramView.isPaddingRelative() : false;
  }
  
  public static boolean Y(View paramView) {
    boolean bool1;
    Boolean bool = q0().f(paramView);
    if (bool == null) {
      bool1 = false;
    } else {
      bool1 = bool.booleanValue();
    } 
    return bool1;
  }
  
  static void Z(View paramView, int paramInt) {
    boolean bool;
    AccessibilityManager accessibilityManager = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
    if (!accessibilityManager.isEnabled())
      return; 
    if (p(paramView) != null && paramView.getVisibility() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    int i = o(paramView);
    char c = ' ';
    if (i != 0 || bool) {
      AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
      if (!bool)
        c = 'ࠀ'; 
      accessibilityEvent.setEventType(c);
      accessibilityEvent.setContentChangeTypes(paramInt);
      if (bool) {
        accessibilityEvent.getText().add(p(paramView));
        L0(paramView);
      } 
      paramView.sendAccessibilityEventUnchecked(accessibilityEvent);
      return;
    } 
    if (paramInt == 32) {
      AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
      paramView.onInitializeAccessibilityEvent(accessibilityEvent);
      accessibilityEvent.setEventType(32);
      accessibilityEvent.setContentChangeTypes(paramInt);
      accessibilityEvent.setSource(paramView);
      paramView.onPopulateAccessibilityEvent(accessibilityEvent);
      accessibilityEvent.getText().add(p(paramView));
      accessibilityManager.sendAccessibilityEvent(accessibilityEvent);
    } else if (paramView.getParent() != null) {
      try {
        paramView.getParent().notifySubtreeAccessibilityStateChanged(paramView, paramView, paramInt);
      } catch (AbstractMethodError abstractMethodError) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramView.getParent().getClass().getSimpleName());
        stringBuilder.append(" does not fully implement ViewParent");
        Log.e("ViewCompat", stringBuilder.toString(), abstractMethodError);
      } 
    } 
  }
  
  private static g<Boolean> a() {
    return new e(b.h.c.tag_accessibility_heading, Boolean.class, 28);
  }
  
  public static void a0(View paramView, int paramInt) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      paramView.offsetLeftAndRight(paramInt);
    } else if (i >= 21) {
      Rect rect = x();
      i = 0;
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View) {
        View view = (View)viewParent;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        i = rect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()) ^ true;
      } 
      e(paramView, paramInt);
      if (i != 0 && rect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))
        ((View)viewParent).invalidate(rect); 
    } else {
      e(paramView, paramInt);
    } 
  }
  
  public static int b(View paramView, CharSequence paramCharSequence, f paramf) {
    int i = r(paramView);
    if (i != -1)
      c(paramView, new c.a(i, paramCharSequence, paramf)); 
    return i;
  }
  
  public static void b0(View paramView, int paramInt) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23) {
      paramView.offsetTopAndBottom(paramInt);
    } else if (i >= 21) {
      Rect rect = x();
      i = 0;
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View) {
        View view = (View)viewParent;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        i = rect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()) ^ true;
      } 
      f(paramView, paramInt);
      if (i != 0 && rect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))
        ((View)viewParent).invalidate(rect); 
    } else {
      f(paramView, paramInt);
    } 
  }
  
  private static void c(View paramView, c.a parama) {
    if (Build.VERSION.SDK_INT >= 21) {
      G(paramView);
      m0(parama.b(), paramView);
      q(paramView).add(parama);
      Z(paramView, 0);
    } 
  }
  
  public static e0 c0(View paramView, e0 parame0) {
    if (Build.VERSION.SDK_INT >= 21) {
      WindowInsets windowInsets = parame0.s();
      if (windowInsets != null) {
        WindowInsets windowInsets1 = paramView.onApplyWindowInsets(windowInsets);
        if (!windowInsets1.equals(windowInsets))
          return e0.u(windowInsets1, paramView); 
      } 
    } 
    return parame0;
  }
  
  public static a0 d(View paramView) {
    if (g == null)
      g = new WeakHashMap<View, a0>(); 
    a0 a01 = g.get(paramView);
    a0 a02 = a01;
    if (a01 == null) {
      a02 = new a0(paramView);
      g.put(paramView, a02);
    } 
    return a02;
  }
  
  public static void d0(View paramView, c paramc) {
    paramView.onInitializeAccessibilityNodeInfo(paramc.G0());
  }
  
  private static void e(View paramView, int paramInt) {
    paramView.offsetLeftAndRight(paramInt);
    if (paramView.getVisibility() == 0) {
      P0(paramView);
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View)
        P0((View)viewParent); 
    } 
  }
  
  private static g<CharSequence> e0() {
    return new c(b.h.c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
  }
  
  private static void f(View paramView, int paramInt) {
    paramView.offsetTopAndBottom(paramInt);
    if (paramView.getVisibility() == 0) {
      P0(paramView);
      ViewParent viewParent = paramView.getParent();
      if (viewParent instanceof View)
        P0((View)viewParent); 
    } 
  }
  
  public static boolean f0(View paramView, int paramInt, Bundle paramBundle) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.performAccessibilityAction(paramInt, paramBundle) : false;
  }
  
  public static e0 g(View paramView, e0 parame0, Rect paramRect) {
    return (Build.VERSION.SDK_INT >= 21) ? h.b(paramView, parame0, paramRect) : parame0;
  }
  
  public static c g0(View paramView, c paramc) {
    c c1;
    if (Log.isLoggable("ViewCompat", 3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("performReceiveContent: ");
      stringBuilder.append(paramc);
      stringBuilder.append(", view=");
      stringBuilder.append(paramView.getClass().getSimpleName());
      stringBuilder.append("[");
      stringBuilder.append(paramView.getId());
      stringBuilder.append("]");
      Log.d("ViewCompat", stringBuilder.toString());
    } 
    r r = (r)paramView.getTag(b.h.c.tag_on_receive_content_listener);
    if (r != null) {
      paramc = r.a(paramView, paramc);
      if (paramc == null) {
        paramView = null;
      } else {
        c1 = y(paramView).a(paramc);
      } 
      return c1;
    } 
    return y((View)c1).a(paramc);
  }
  
  public static e0 h(View paramView, e0 parame0) {
    if (Build.VERSION.SDK_INT >= 21) {
      WindowInsets windowInsets = parame0.s();
      if (windowInsets != null) {
        WindowInsets windowInsets1 = paramView.dispatchApplyWindowInsets(windowInsets);
        if (!windowInsets1.equals(windowInsets))
          return e0.u(windowInsets1, paramView); 
      } 
    } 
    return parame0;
  }
  
  public static void h0(View paramView) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.postInvalidateOnAnimation();
    } else {
      paramView.postInvalidate();
    } 
  }
  
  static boolean i(View paramView, KeyEvent paramKeyEvent) {
    return (Build.VERSION.SDK_INT >= 28) ? false : l.a(paramView).b(paramView, paramKeyEvent);
  }
  
  public static void i0(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.postInvalidateOnAnimation(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
  }
  
  static boolean j(View paramView, KeyEvent paramKeyEvent) {
    return (Build.VERSION.SDK_INT >= 28) ? false : l.a(paramView).f(paramKeyEvent);
  }
  
  public static void j0(View paramView, Runnable paramRunnable) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.postOnAnimation(paramRunnable);
    } else {
      paramView.postDelayed(paramRunnable, ValueAnimator.getFrameDelay());
    } 
  }
  
  public static int k() {
    if (Build.VERSION.SDK_INT >= 17)
      return View.generateViewId(); 
    while (true) {
      AtomicInteger atomicInteger = a;
      int i = atomicInteger.get();
      int j = i + 1;
      int k = j;
      if (j > 16777215)
        k = 1; 
      if (atomicInteger.compareAndSet(i, k))
        return i; 
    } 
  }
  
  public static void k0(View paramView, Runnable paramRunnable, long paramLong) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.postOnAnimationDelayed(paramRunnable, paramLong);
    } else {
      paramView.postDelayed(paramRunnable, ValueAnimator.getFrameDelay() + paramLong);
    } 
  }
  
  public static a l(View paramView) {
    View.AccessibilityDelegate accessibilityDelegate = m(paramView);
    return (accessibilityDelegate == null) ? null : ((accessibilityDelegate instanceof a.a) ? ((a.a)accessibilityDelegate).a : new a(accessibilityDelegate));
  }
  
  public static void l0(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 21) {
      m0(paramInt, paramView);
      Z(paramView, 0);
    } 
  }
  
  private static View.AccessibilityDelegate m(View paramView) {
    return (Build.VERSION.SDK_INT >= 29) ? paramView.getAccessibilityDelegate() : n(paramView);
  }
  
  private static void m0(int paramInt, View paramView) {
    List<c.a> list = q(paramView);
    for (byte b = 0; b < list.size(); b++) {
      if (((c.a)list.get(b)).b() == paramInt) {
        list.remove(b);
        break;
      } 
    } 
  }
  
  private static View.AccessibilityDelegate n(View paramView) {
    if (i)
      return null; 
    if (h == null)
      try {
        Field field = View.class.getDeclaredField("mAccessibilityDelegate");
        h = field;
        field.setAccessible(true);
      } finally {
        paramView = null;
        i = true;
      }  
    try {
      Object object;
      return (object instanceof View.AccessibilityDelegate) ? (View.AccessibilityDelegate)object : null;
    } finally {
      paramView = null;
      i = true;
    } 
  }
  
  public static void n0(View paramView, c.a parama, CharSequence paramCharSequence, f paramf) {
    if (paramf == null && paramCharSequence == null) {
      l0(paramView, parama.b());
    } else {
      c(paramView, parama.a(paramCharSequence, paramf));
    } 
  }
  
  public static int o(View paramView) {
    return (Build.VERSION.SDK_INT >= 19) ? paramView.getAccessibilityLiveRegion() : 0;
  }
  
  public static void o0(View paramView) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 20) {
      paramView.requestApplyInsets();
    } else if (i >= 16) {
      paramView.requestFitSystemWindows();
    } 
  }
  
  public static CharSequence p(View paramView) {
    return e0().f(paramView);
  }
  
  public static void p0(View paramView, @SuppressLint({"ContextFirst"}) Context paramContext, int[] paramArrayOfint, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    if (Build.VERSION.SDK_INT >= 29)
      j.a(paramView, paramContext, paramArrayOfint, paramAttributeSet, paramTypedArray, paramInt1, paramInt2); 
  }
  
  private static List<c.a> q(View paramView) {
    int i = b.h.c.tag_accessibility_actions;
    ArrayList<c.a> arrayList1 = (ArrayList)paramView.getTag(i);
    ArrayList<c.a> arrayList2 = arrayList1;
    if (arrayList1 == null) {
      arrayList2 = new ArrayList();
      paramView.setTag(i, arrayList2);
    } 
    return arrayList2;
  }
  
  private static g<Boolean> q0() {
    return new b(b.h.c.tag_screen_reader_focusable, Boolean.class, 28);
  }
  
  private static int r(View paramView) {
    List<c.a> list = q(paramView);
    byte b = 0;
    int i = -1;
    while (true) {
      int[] arrayOfInt = k;
      if (b < arrayOfInt.length && i == -1) {
        int j = arrayOfInt[b];
        byte b1 = 0;
        int k = 1;
        while (b1 < list.size()) {
          byte b2;
          if (((c.a)list.get(b1)).b() != j) {
            b2 = 1;
          } else {
            b2 = 0;
          } 
          k &= b2;
          b1++;
        } 
        if (k != 0)
          i = j; 
        b++;
        continue;
      } 
      break;
    } 
    return i;
  }
  
  public static void r0(View paramView, a parama) {
    View.AccessibilityDelegate accessibilityDelegate;
    a a1 = parama;
    if (parama == null) {
      a1 = parama;
      if (m(paramView) instanceof a.a)
        a1 = new a(); 
    } 
    if (a1 == null) {
      parama = null;
    } else {
      accessibilityDelegate = a1.d();
    } 
    paramView.setAccessibilityDelegate(accessibilityDelegate);
  }
  
  public static ColorStateList s(View paramView) {
    if (Build.VERSION.SDK_INT >= 21)
      return paramView.getBackgroundTintList(); 
    if (paramView instanceof v) {
      ColorStateList colorStateList = ((v)paramView).getSupportBackgroundTintList();
    } else {
      paramView = null;
    } 
    return (ColorStateList)paramView;
  }
  
  public static void s0(View paramView, boolean paramBoolean) {
    a().g(paramView, Boolean.valueOf(paramBoolean));
  }
  
  public static PorterDuff.Mode t(View paramView) {
    if (Build.VERSION.SDK_INT >= 21)
      return paramView.getBackgroundTintMode(); 
    if (paramView instanceof v) {
      PorterDuff.Mode mode = ((v)paramView).getSupportBackgroundTintMode();
    } else {
      paramView = null;
    } 
    return (PorterDuff.Mode)paramView;
  }
  
  public static void t0(View paramView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 19)
      paramView.setAccessibilityLiveRegion(paramInt); 
  }
  
  public static Rect u(View paramView) {
    return (Build.VERSION.SDK_INT >= 18) ? paramView.getClipBounds() : null;
  }
  
  public static void u0(View paramView, Drawable paramDrawable) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramView.setBackground(paramDrawable);
    } else {
      paramView.setBackgroundDrawable(paramDrawable);
    } 
  }
  
  public static Display v(View paramView) {
    return (Build.VERSION.SDK_INT >= 17) ? paramView.getDisplay() : (U(paramView) ? ((WindowManager)paramView.getContext().getSystemService("window")).getDefaultDisplay() : null);
  }
  
  public static void v0(View paramView, ColorStateList paramColorStateList) {
    Drawable drawable;
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      paramView.setBackgroundTintList(paramColorStateList);
      if (i == 21) {
        drawable = paramView.getBackground();
        if (paramView.getBackgroundTintList() != null || paramView.getBackgroundTintMode() != null) {
          i = 1;
        } else {
          i = 0;
        } 
        if (drawable != null && i != 0) {
          if (drawable.isStateful())
            drawable.setState(paramView.getDrawableState()); 
          paramView.setBackground(drawable);
        } 
      } 
    } else if (paramView instanceof v) {
      ((v)paramView).setSupportBackgroundTintList((ColorStateList)drawable);
    } 
  }
  
  public static float w(View paramView) {
    return (Build.VERSION.SDK_INT >= 21) ? paramView.getElevation() : 0.0F;
  }
  
  public static void w0(View paramView, PorterDuff.Mode paramMode) {
    Drawable drawable;
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      paramView.setBackgroundTintMode(paramMode);
      if (i == 21) {
        drawable = paramView.getBackground();
        if (paramView.getBackgroundTintList() != null || paramView.getBackgroundTintMode() != null) {
          i = 1;
        } else {
          i = 0;
        } 
        if (drawable != null && i != 0) {
          if (drawable.isStateful())
            drawable.setState(paramView.getDrawableState()); 
          paramView.setBackground(drawable);
        } 
      } 
    } else if (paramView instanceof v) {
      ((v)paramView).setSupportBackgroundTintMode((PorterDuff.Mode)drawable);
    } 
  }
  
  private static Rect x() {
    if (j == null)
      j = new ThreadLocal<Rect>(); 
    Rect rect1 = j.get();
    Rect rect2 = rect1;
    if (rect1 == null) {
      rect2 = new Rect();
      j.set(rect2);
    } 
    rect2.setEmpty();
    return rect2;
  }
  
  public static void x0(View paramView, Rect paramRect) {
    if (Build.VERSION.SDK_INT >= 18)
      paramView.setClipBounds(paramRect); 
  }
  
  private static s y(View paramView) {
    return (paramView instanceof s) ? (s)paramView : l;
  }
  
  public static void y0(View paramView, float paramFloat) {
    if (Build.VERSION.SDK_INT >= 21)
      paramView.setElevation(paramFloat); 
  }
  
  public static boolean z(View paramView) {
    return (Build.VERSION.SDK_INT >= 16) ? paramView.getFitsSystemWindows() : false;
  }
  
  @Deprecated
  public static void z0(View paramView, boolean paramBoolean) {
    paramView.setFitsSystemWindows(paramBoolean);
  }
  
  class a implements s {
    public c a(c param1c) {
      return param1c;
    }
  }
  
  class b extends g<Boolean> {
    b(w this$0, Class<Boolean> param1Class, int param1Int1) {
      super(this$0, param1Class, param1Int1);
    }
    
    Boolean i(View param1View) {
      return Boolean.valueOf(param1View.isScreenReaderFocusable());
    }
    
    void j(View param1View, Boolean param1Boolean) {
      param1View.setScreenReaderFocusable(param1Boolean.booleanValue());
    }
    
    boolean k(Boolean param1Boolean1, Boolean param1Boolean2) {
      return a(param1Boolean1, param1Boolean2) ^ true;
    }
  }
  
  class c extends g<CharSequence> {
    c(w this$0, Class<CharSequence> param1Class, int param1Int1, int param1Int2) {
      super(this$0, param1Class, param1Int1, param1Int2);
    }
    
    CharSequence i(View param1View) {
      return param1View.getAccessibilityPaneTitle();
    }
    
    void j(View param1View, CharSequence param1CharSequence) {
      param1View.setAccessibilityPaneTitle(param1CharSequence);
    }
    
    boolean k(CharSequence param1CharSequence1, CharSequence param1CharSequence2) {
      return TextUtils.equals(param1CharSequence1, param1CharSequence2) ^ true;
    }
  }
  
  class d extends g<CharSequence> {
    d(w this$0, Class<CharSequence> param1Class, int param1Int1, int param1Int2) {
      super(this$0, param1Class, param1Int1, param1Int2);
    }
    
    CharSequence i(View param1View) {
      return param1View.getStateDescription();
    }
    
    void j(View param1View, CharSequence param1CharSequence) {
      param1View.setStateDescription(param1CharSequence);
    }
    
    boolean k(CharSequence param1CharSequence1, CharSequence param1CharSequence2) {
      return TextUtils.equals(param1CharSequence1, param1CharSequence2) ^ true;
    }
  }
  
  class e extends g<Boolean> {
    e(w this$0, Class<Boolean> param1Class, int param1Int1) {
      super(this$0, param1Class, param1Int1);
    }
    
    Boolean i(View param1View) {
      return Boolean.valueOf(param1View.isAccessibilityHeading());
    }
    
    void j(View param1View, Boolean param1Boolean) {
      param1View.setAccessibilityHeading(param1Boolean.booleanValue());
    }
    
    boolean k(Boolean param1Boolean1, Boolean param1Boolean2) {
      return a(param1Boolean1, param1Boolean2) ^ true;
    }
  }
  
  static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    private WeakHashMap<View, Boolean> b = new WeakHashMap<View, Boolean>();
    
    private void a(View param1View, boolean param1Boolean) {
      boolean bool;
      if (param1View.getVisibility() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      if (param1Boolean != bool) {
        byte b;
        if (bool) {
          b = 16;
        } else {
          b = 32;
        } 
        w.Z(param1View, b);
        this.b.put(param1View, Boolean.valueOf(bool));
      } 
    }
    
    private void b(View param1View) {
      param1View.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
    
    public void onGlobalLayout() {
      if (Build.VERSION.SDK_INT < 28)
        for (Map.Entry<View, Boolean> entry : this.b.entrySet())
          a((View)entry.getKey(), ((Boolean)entry.getValue()).booleanValue());  
    }
    
    public void onViewAttachedToWindow(View param1View) {
      b(param1View);
    }
    
    public void onViewDetachedFromWindow(View param1View) {}
  }
  
  static abstract class g<T> {
    private final int a;
    
    private final Class<T> b;
    
    private final int c;
    
    private final int d;
    
    g(int param1Int1, Class<T> param1Class, int param1Int2) {
      this(param1Int1, param1Class, 0, param1Int2);
    }
    
    g(int param1Int1, Class<T> param1Class, int param1Int2, int param1Int3) {
      this.a = param1Int1;
      this.b = param1Class;
      this.d = param1Int2;
      this.c = param1Int3;
    }
    
    private boolean b() {
      boolean bool;
      if (Build.VERSION.SDK_INT >= 19) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    private boolean c() {
      boolean bool;
      if (Build.VERSION.SDK_INT >= this.c) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean a(Boolean param1Boolean1, Boolean param1Boolean2) {
      boolean bool1;
      boolean bool2;
      boolean bool = false;
      if (param1Boolean1 == null) {
        bool1 = false;
      } else {
        bool1 = param1Boolean1.booleanValue();
      } 
      if (param1Boolean2 == null) {
        bool2 = false;
      } else {
        bool2 = param1Boolean2.booleanValue();
      } 
      if (bool1 == bool2)
        bool = true; 
      return bool;
    }
    
    abstract T d(View param1View);
    
    abstract void e(View param1View, T param1T);
    
    T f(View param1View) {
      if (c())
        return d(param1View); 
      if (b()) {
        Object object = param1View.getTag(this.a);
        if (this.b.isInstance(object))
          return (T)object; 
      } 
      return null;
    }
    
    void g(View param1View, T param1T) {
      if (c()) {
        e(param1View, param1T);
      } else if (b() && h(f(param1View), param1T)) {
        w.G(param1View);
        param1View.setTag(this.a, param1T);
        w.Z(param1View, this.d);
      } 
    }
    
    abstract boolean h(T param1T1, T param1T2);
  }
  
  private static class h {
    static void a(WindowInsets param1WindowInsets, View param1View) {
      View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)param1View.getTag(b.h.c.tag_window_insets_animation_callback);
      if (onApplyWindowInsetsListener != null)
        onApplyWindowInsetsListener.onApplyWindowInsets(param1View, param1WindowInsets); 
    }
    
    static e0 b(View param1View, e0 param1e0, Rect param1Rect) {
      WindowInsets windowInsets = param1e0.s();
      if (windowInsets != null)
        return e0.u(param1View.computeSystemWindowInsets(windowInsets, param1Rect), param1View); 
      param1Rect.setEmpty();
      return param1e0;
    }
    
    public static e0 c(View param1View) {
      return e0.a.a(param1View);
    }
    
    static void d(View param1View, q param1q) {
      if (Build.VERSION.SDK_INT < 30)
        param1View.setTag(b.h.c.tag_on_apply_window_listener, param1q); 
      if (param1q == null) {
        param1View.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)param1View.getTag(b.h.c.tag_window_insets_animation_callback));
        return;
      } 
      param1View.setOnApplyWindowInsetsListener(new a(param1View, param1q));
    }
    
    class a implements View.OnApplyWindowInsetsListener {
      e0 a = null;
      
      a(w.h this$0, q param2q) {}
      
      public WindowInsets onApplyWindowInsets(View param2View, WindowInsets param2WindowInsets) {
        e0 e02 = e0.u(param2WindowInsets, param2View);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
          w.h.a(param2WindowInsets, this.b);
          if (e02.equals(this.a))
            return this.c.a(param2View, e02).s(); 
        } 
        this.a = e02;
        e0 e01 = this.c.a(param2View, e02);
        if (i >= 30)
          return e01.s(); 
        w.o0(param2View);
        return e01.s();
      }
    }
  }
  
  class a implements View.OnApplyWindowInsetsListener {
    e0 a = null;
    
    a(w this$0, q param1q) {}
    
    public WindowInsets onApplyWindowInsets(View param1View, WindowInsets param1WindowInsets) {
      e0 e02 = e0.u(param1WindowInsets, param1View);
      int i = Build.VERSION.SDK_INT;
      if (i < 30) {
        w.h.a(param1WindowInsets, this.b);
        if (e02.equals(this.a))
          return this.c.a(param1View, e02).s(); 
      } 
      this.a = e02;
      e0 e01 = this.c.a(param1View, e02);
      if (i >= 30)
        return e01.s(); 
      w.o0(param1View);
      return e01.s();
    }
  }
  
  private static class i {
    public static e0 a(View param1View) {
      WindowInsets windowInsets = param1View.getRootWindowInsets();
      if (windowInsets == null)
        return null; 
      e0 e0 = e0.t(windowInsets);
      e0.q(e0);
      e0.d(param1View.getRootView());
      return e0;
    }
  }
  
  private static class j {
    static void a(View param1View, Context param1Context, int[] param1ArrayOfint, AttributeSet param1AttributeSet, TypedArray param1TypedArray, int param1Int1, int param1Int2) {
      param1View.saveAttributeDataForStyleable(param1Context, param1ArrayOfint, param1AttributeSet, param1TypedArray, param1Int1, param1Int2);
    }
  }
  
  public static interface k {
    boolean a(View param1View, KeyEvent param1KeyEvent);
  }
  
  static class l {
    private static final ArrayList<WeakReference<View>> a = new ArrayList<WeakReference<View>>();
    
    private WeakHashMap<View, Boolean> b = null;
    
    private SparseArray<WeakReference<View>> c = null;
    
    private WeakReference<KeyEvent> d = null;
    
    static l a(View param1View) {
      int i = b.h.c.tag_unhandled_key_event_manager;
      l l1 = (l)param1View.getTag(i);
      l l2 = l1;
      if (l1 == null) {
        l2 = new l();
        param1View.setTag(i, l2);
      } 
      return l2;
    }
    
    private View c(View param1View, KeyEvent param1KeyEvent) {
      WeakHashMap<View, Boolean> weakHashMap = this.b;
      if (weakHashMap != null && weakHashMap.containsKey(param1View)) {
        if (param1View instanceof ViewGroup) {
          ViewGroup viewGroup = (ViewGroup)param1View;
          for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
            View view = c(viewGroup.getChildAt(i), param1KeyEvent);
            if (view != null)
              return view; 
          } 
        } 
        if (e(param1View, param1KeyEvent))
          return param1View; 
      } 
      return null;
    }
    
    private SparseArray<WeakReference<View>> d() {
      if (this.c == null)
        this.c = new SparseArray(); 
      return this.c;
    }
    
    private boolean e(View param1View, KeyEvent param1KeyEvent) {
      ArrayList<w.k> arrayList = (ArrayList)param1View.getTag(b.h.c.tag_unhandled_key_listeners);
      if (arrayList != null)
        for (int i = arrayList.size() - 1; i >= 0; i--) {
          if (((w.k)arrayList.get(i)).a(param1View, param1KeyEvent))
            return true; 
        }  
      return false;
    }
    
    private void g() {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Ljava/util/WeakHashMap;
      //   4: astore_1
      //   5: aload_1
      //   6: ifnull -> 13
      //   9: aload_1
      //   10: invokevirtual clear : ()V
      //   13: getstatic b/h/k/w$l.a : Ljava/util/ArrayList;
      //   16: astore_2
      //   17: aload_2
      //   18: invokevirtual isEmpty : ()Z
      //   21: ifeq -> 25
      //   24: return
      //   25: aload_2
      //   26: monitorenter
      //   27: aload_0
      //   28: getfield b : Ljava/util/WeakHashMap;
      //   31: ifnonnull -> 47
      //   34: new java/util/WeakHashMap
      //   37: astore_1
      //   38: aload_1
      //   39: invokespecial <init> : ()V
      //   42: aload_0
      //   43: aload_1
      //   44: putfield b : Ljava/util/WeakHashMap;
      //   47: aload_2
      //   48: invokevirtual size : ()I
      //   51: iconst_1
      //   52: isub
      //   53: istore_3
      //   54: iload_3
      //   55: iflt -> 149
      //   58: getstatic b/h/k/w$l.a : Ljava/util/ArrayList;
      //   61: astore_1
      //   62: aload_1
      //   63: iload_3
      //   64: invokevirtual get : (I)Ljava/lang/Object;
      //   67: checkcast java/lang/ref/WeakReference
      //   70: invokevirtual get : ()Ljava/lang/Object;
      //   73: checkcast android/view/View
      //   76: astore #4
      //   78: aload #4
      //   80: ifnonnull -> 92
      //   83: aload_1
      //   84: iload_3
      //   85: invokevirtual remove : (I)Ljava/lang/Object;
      //   88: pop
      //   89: goto -> 143
      //   92: aload_0
      //   93: getfield b : Ljava/util/WeakHashMap;
      //   96: aload #4
      //   98: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
      //   101: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   104: pop
      //   105: aload #4
      //   107: invokevirtual getParent : ()Landroid/view/ViewParent;
      //   110: astore_1
      //   111: aload_1
      //   112: instanceof android/view/View
      //   115: ifeq -> 143
      //   118: aload_0
      //   119: getfield b : Ljava/util/WeakHashMap;
      //   122: aload_1
      //   123: checkcast android/view/View
      //   126: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
      //   129: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   132: pop
      //   133: aload_1
      //   134: invokeinterface getParent : ()Landroid/view/ViewParent;
      //   139: astore_1
      //   140: goto -> 111
      //   143: iinc #3, -1
      //   146: goto -> 54
      //   149: aload_2
      //   150: monitorexit
      //   151: return
      //   152: astore_1
      //   153: aload_2
      //   154: monitorexit
      //   155: goto -> 160
      //   158: aload_1
      //   159: athrow
      //   160: goto -> 158
      // Exception table:
      //   from	to	target	type
      //   27	47	152	finally
      //   47	54	152	finally
      //   58	78	152	finally
      //   83	89	152	finally
      //   92	111	152	finally
      //   111	140	152	finally
      //   149	151	152	finally
      //   153	155	152	finally
    }
    
    boolean b(View param1View, KeyEvent param1KeyEvent) {
      boolean bool;
      if (param1KeyEvent.getAction() == 0)
        g(); 
      param1View = c(param1View, param1KeyEvent);
      if (param1KeyEvent.getAction() == 0) {
        int i = param1KeyEvent.getKeyCode();
        if (param1View != null && !KeyEvent.isModifierKey(i))
          d().put(i, new WeakReference<View>(param1View)); 
      } 
      if (param1View != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean f(KeyEvent param1KeyEvent) {
      WeakReference<KeyEvent> weakReference1 = this.d;
      if (weakReference1 != null && weakReference1.get() == param1KeyEvent)
        return false; 
      this.d = new WeakReference<KeyEvent>(param1KeyEvent);
      WeakReference<KeyEvent> weakReference2 = null;
      SparseArray<WeakReference<View>> sparseArray = d();
      weakReference1 = weakReference2;
      if (param1KeyEvent.getAction() == 1) {
        int i = sparseArray.indexOfKey(param1KeyEvent.getKeyCode());
        weakReference1 = weakReference2;
        if (i >= 0) {
          weakReference1 = (WeakReference<KeyEvent>)sparseArray.valueAt(i);
          sparseArray.removeAt(i);
        } 
      } 
      weakReference2 = weakReference1;
      if (weakReference1 == null)
        weakReference2 = (WeakReference<KeyEvent>)sparseArray.get(param1KeyEvent.getKeyCode()); 
      if (weakReference2 != null) {
        View view = (View)weakReference2.get();
        if (view != null && w.U(view))
          e(view, param1KeyEvent); 
        return true;
      } 
      return false;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */