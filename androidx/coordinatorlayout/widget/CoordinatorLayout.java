package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import b.h.j.h;
import b.h.k.e0;
import b.h.k.m;
import b.h.k.n;
import b.h.k.p;
import b.h.k.q;
import b.h.k.w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements m, n {
  static final String b;
  
  static final Class<?>[] c = new Class[] { Context.class, AttributeSet.class };
  
  static final ThreadLocal<Map<String, Constructor<Behavior>>> d = new ThreadLocal<Map<String, Constructor<Behavior>>>();
  
  static final Comparator<View> e;
  
  private static final b.h.j.f<Rect> f = (b.h.j.f<Rect>)new h(12);
  
  private final List<View> g;
  
  private final a<View> h;
  
  private final List<View> i;
  
  private final List<View> j;
  
  private Paint k;
  
  private final int[] l;
  
  private final int[] m;
  
  private boolean n;
  
  private boolean o;
  
  private int[] p;
  
  private View q;
  
  private View r;
  
  private f s;
  
  private boolean t;
  
  private e0 u;
  
  private boolean v;
  
  private Drawable w;
  
  ViewGroup.OnHierarchyChangeListener x;
  
  private q y;
  
  private final p z;
  
  public CoordinatorLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.g.a.coordinatorLayoutStyle);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray;
    this.g = new ArrayList<View>();
    this.h = new a<View>();
    this.i = new ArrayList<View>();
    this.j = new ArrayList<View>();
    this.l = new int[2];
    this.m = new int[2];
    this.z = new p(this);
    boolean bool = false;
    if (paramInt == 0) {
      typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, b.g.c.CoordinatorLayout, 0, b.g.b.Widget_Support_CoordinatorLayout);
    } else {
      typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, b.g.c.CoordinatorLayout, paramInt, 0);
    } 
    if (Build.VERSION.SDK_INT >= 29)
      if (paramInt == 0) {
        saveAttributeDataForStyleable(paramContext, b.g.c.CoordinatorLayout, paramAttributeSet, typedArray, 0, b.g.b.Widget_Support_CoordinatorLayout);
      } else {
        saveAttributeDataForStyleable(paramContext, b.g.c.CoordinatorLayout, paramAttributeSet, typedArray, paramInt, 0);
      }  
    paramInt = typedArray.getResourceId(b.g.c.CoordinatorLayout_keylines, 0);
    if (paramInt != 0) {
      Resources resources = paramContext.getResources();
      this.p = resources.getIntArray(paramInt);
      float f1 = (resources.getDisplayMetrics()).density;
      int i = this.p.length;
      for (paramInt = bool; paramInt < i; paramInt++) {
        int[] arrayOfInt = this.p;
        arrayOfInt[paramInt] = (int)(arrayOfInt[paramInt] * f1);
      } 
    } 
    this.w = typedArray.getDrawable(b.g.c.CoordinatorLayout_statusBarBackground);
    typedArray.recycle();
    b0();
    super.setOnHierarchyChangeListener(new d(this));
    if (w.A((View)this) == 0)
      w.B0((View)this, 1); 
  }
  
  private int A(int paramInt) {
    StringBuilder stringBuilder;
    int[] arrayOfInt = this.p;
    if (arrayOfInt == null) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("No keylines defined for ");
      stringBuilder.append(this);
      stringBuilder.append(" - attempted index lookup ");
      stringBuilder.append(paramInt);
      Log.e("CoordinatorLayout", stringBuilder.toString());
      return 0;
    } 
    if (paramInt < 0 || paramInt >= stringBuilder.length) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Keyline index ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" out of range for ");
      stringBuilder.append(this);
      Log.e("CoordinatorLayout", stringBuilder.toString());
      return 0;
    } 
    return stringBuilder[paramInt];
  }
  
  private void D(List<View> paramList) {
    paramList.clear();
    boolean bool = isChildrenDrawingOrderEnabled();
    int i = getChildCount();
    for (int j = i - 1; j >= 0; j--) {
      int k;
      if (bool) {
        k = getChildDrawingOrder(i, j);
      } else {
        k = j;
      } 
      paramList.add(getChildAt(k));
    } 
    Comparator<View> comparator = e;
    if (comparator != null)
      Collections.sort(paramList, comparator); 
  }
  
  private boolean E(View paramView) {
    return this.h.j(paramView);
  }
  
  private void G(View paramView, int paramInt) {
    e e = (e)paramView.getLayoutParams();
    Rect rect1 = e();
    rect1.set(getPaddingLeft() + e.leftMargin, getPaddingTop() + e.topMargin, getWidth() - getPaddingRight() - e.rightMargin, getHeight() - getPaddingBottom() - e.bottomMargin);
    if (this.u != null && w.z((View)this) && !w.z(paramView)) {
      rect1.left += this.u.g();
      rect1.top += this.u.i();
      rect1.right -= this.u.h();
      rect1.bottom -= this.u.f();
    } 
    Rect rect2 = e();
    b.h.k.e.a(W(e.c), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), rect1, rect2, paramInt);
    paramView.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
    S(rect1);
    S(rect2);
  }
  
  private void H(View paramView1, View paramView2, int paramInt) {
    Rect rect1 = e();
    Rect rect2 = e();
    try {
      x(paramView2, rect1);
      y(paramView1, paramInt, rect1, rect2);
      paramView1.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
      return;
    } finally {
      S(rect1);
      S(rect2);
    } 
  }
  
  private void I(View paramView, int paramInt1, int paramInt2) {
    e e = (e)paramView.getLayoutParams();
    int i = b.h.k.e.b(X(e.c), paramInt2);
    int j = i & 0x7;
    int k = i & 0x70;
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = paramView.getMeasuredWidth();
    int i4 = paramView.getMeasuredHeight();
    i = paramInt1;
    if (paramInt2 == 1)
      i = i1 - paramInt1; 
    paramInt1 = A(i) - i3;
    paramInt2 = 0;
    if (j != 1) {
      if (j == 5)
        paramInt1 += i3; 
    } else {
      paramInt1 += i3 / 2;
    } 
    if (k != 16) {
      if (k == 80)
        paramInt2 = i4 + 0; 
    } else {
      paramInt2 = 0 + i4 / 2;
    } 
    paramInt1 = Math.max(getPaddingLeft() + e.leftMargin, Math.min(paramInt1, i1 - getPaddingRight() - i3 - e.rightMargin));
    paramInt2 = Math.max(getPaddingTop() + e.topMargin, Math.min(paramInt2, i2 - getPaddingBottom() - i4 - e.bottomMargin));
    paramView.layout(paramInt1, paramInt2, i3 + paramInt1, i4 + paramInt2);
  }
  
  private void J(View paramView, Rect paramRect, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic V : (Landroid/view/View;)Z
    //   4: ifne -> 8
    //   7: return
    //   8: aload_1
    //   9: invokevirtual getWidth : ()I
    //   12: ifle -> 461
    //   15: aload_1
    //   16: invokevirtual getHeight : ()I
    //   19: ifgt -> 25
    //   22: goto -> 461
    //   25: aload_1
    //   26: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   29: checkcast androidx/coordinatorlayout/widget/CoordinatorLayout$e
    //   32: astore #4
    //   34: aload #4
    //   36: invokevirtual f : ()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    //   39: astore #5
    //   41: invokestatic e : ()Landroid/graphics/Rect;
    //   44: astore #6
    //   46: invokestatic e : ()Landroid/graphics/Rect;
    //   49: astore #7
    //   51: aload #7
    //   53: aload_1
    //   54: invokevirtual getLeft : ()I
    //   57: aload_1
    //   58: invokevirtual getTop : ()I
    //   61: aload_1
    //   62: invokevirtual getRight : ()I
    //   65: aload_1
    //   66: invokevirtual getBottom : ()I
    //   69: invokevirtual set : (IIII)V
    //   72: aload #5
    //   74: ifnull -> 158
    //   77: aload #5
    //   79: aload_0
    //   80: aload_1
    //   81: aload #6
    //   83: invokevirtual b : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;)Z
    //   86: ifeq -> 158
    //   89: aload #7
    //   91: aload #6
    //   93: invokevirtual contains : (Landroid/graphics/Rect;)Z
    //   96: ifeq -> 102
    //   99: goto -> 165
    //   102: new java/lang/StringBuilder
    //   105: dup
    //   106: invokespecial <init> : ()V
    //   109: astore_1
    //   110: aload_1
    //   111: ldc_w 'Rect should be within the child's bounds. Rect:'
    //   114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: pop
    //   118: aload_1
    //   119: aload #6
    //   121: invokevirtual toShortString : ()Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload_1
    //   129: ldc_w ' | Bounds:'
    //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload_1
    //   137: aload #7
    //   139: invokevirtual toShortString : ()Ljava/lang/String;
    //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: new java/lang/IllegalArgumentException
    //   149: dup
    //   150: aload_1
    //   151: invokevirtual toString : ()Ljava/lang/String;
    //   154: invokespecial <init> : (Ljava/lang/String;)V
    //   157: athrow
    //   158: aload #6
    //   160: aload #7
    //   162: invokevirtual set : (Landroid/graphics/Rect;)V
    //   165: aload #7
    //   167: invokestatic S : (Landroid/graphics/Rect;)V
    //   170: aload #6
    //   172: invokevirtual isEmpty : ()Z
    //   175: ifeq -> 184
    //   178: aload #6
    //   180: invokestatic S : (Landroid/graphics/Rect;)V
    //   183: return
    //   184: aload #4
    //   186: getfield h : I
    //   189: iload_3
    //   190: invokestatic b : (II)I
    //   193: istore #8
    //   195: iconst_1
    //   196: istore #9
    //   198: iload #8
    //   200: bipush #48
    //   202: iand
    //   203: bipush #48
    //   205: if_icmpne -> 252
    //   208: aload #6
    //   210: getfield top : I
    //   213: aload #4
    //   215: getfield topMargin : I
    //   218: isub
    //   219: aload #4
    //   221: getfield j : I
    //   224: isub
    //   225: istore_3
    //   226: aload_2
    //   227: getfield top : I
    //   230: istore #10
    //   232: iload_3
    //   233: iload #10
    //   235: if_icmpge -> 252
    //   238: aload_0
    //   239: aload_1
    //   240: iload #10
    //   242: iload_3
    //   243: isub
    //   244: invokespecial Z : (Landroid/view/View;I)V
    //   247: iconst_1
    //   248: istore_3
    //   249: goto -> 254
    //   252: iconst_0
    //   253: istore_3
    //   254: iload_3
    //   255: istore #10
    //   257: iload #8
    //   259: bipush #80
    //   261: iand
    //   262: bipush #80
    //   264: if_icmpne -> 320
    //   267: aload_0
    //   268: invokevirtual getHeight : ()I
    //   271: aload #6
    //   273: getfield bottom : I
    //   276: isub
    //   277: aload #4
    //   279: getfield bottomMargin : I
    //   282: isub
    //   283: aload #4
    //   285: getfield j : I
    //   288: iadd
    //   289: istore #11
    //   291: aload_2
    //   292: getfield bottom : I
    //   295: istore #12
    //   297: iload_3
    //   298: istore #10
    //   300: iload #11
    //   302: iload #12
    //   304: if_icmpge -> 320
    //   307: aload_0
    //   308: aload_1
    //   309: iload #11
    //   311: iload #12
    //   313: isub
    //   314: invokespecial Z : (Landroid/view/View;I)V
    //   317: iconst_1
    //   318: istore #10
    //   320: iload #10
    //   322: ifne -> 331
    //   325: aload_0
    //   326: aload_1
    //   327: iconst_0
    //   328: invokespecial Z : (Landroid/view/View;I)V
    //   331: iload #8
    //   333: iconst_3
    //   334: iand
    //   335: iconst_3
    //   336: if_icmpne -> 383
    //   339: aload #6
    //   341: getfield left : I
    //   344: aload #4
    //   346: getfield leftMargin : I
    //   349: isub
    //   350: aload #4
    //   352: getfield i : I
    //   355: isub
    //   356: istore #10
    //   358: aload_2
    //   359: getfield left : I
    //   362: istore_3
    //   363: iload #10
    //   365: iload_3
    //   366: if_icmpge -> 383
    //   369: aload_0
    //   370: aload_1
    //   371: iload_3
    //   372: iload #10
    //   374: isub
    //   375: invokespecial Y : (Landroid/view/View;I)V
    //   378: iconst_1
    //   379: istore_3
    //   380: goto -> 385
    //   383: iconst_0
    //   384: istore_3
    //   385: iload #8
    //   387: iconst_5
    //   388: iand
    //   389: iconst_5
    //   390: if_icmpne -> 446
    //   393: aload_0
    //   394: invokevirtual getWidth : ()I
    //   397: aload #6
    //   399: getfield right : I
    //   402: isub
    //   403: aload #4
    //   405: getfield rightMargin : I
    //   408: isub
    //   409: aload #4
    //   411: getfield i : I
    //   414: iadd
    //   415: istore #8
    //   417: aload_2
    //   418: getfield right : I
    //   421: istore #10
    //   423: iload #8
    //   425: iload #10
    //   427: if_icmpge -> 446
    //   430: aload_0
    //   431: aload_1
    //   432: iload #8
    //   434: iload #10
    //   436: isub
    //   437: invokespecial Y : (Landroid/view/View;I)V
    //   440: iload #9
    //   442: istore_3
    //   443: goto -> 446
    //   446: iload_3
    //   447: ifne -> 456
    //   450: aload_0
    //   451: aload_1
    //   452: iconst_0
    //   453: invokespecial Y : (Landroid/view/View;I)V
    //   456: aload #6
    //   458: invokestatic S : (Landroid/graphics/Rect;)V
    //   461: return
  }
  
  static Behavior O(Context paramContext, AttributeSet paramAttributeSet, String paramString) {
    String str;
    if (TextUtils.isEmpty(paramString))
      return null; 
    if (paramString.startsWith(".")) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramContext.getPackageName());
      stringBuilder.append(paramString);
      str = stringBuilder.toString();
    } else if (paramString.indexOf('.') >= 0) {
      str = paramString;
    } else {
      String str1 = b;
      str = paramString;
      if (!TextUtils.isEmpty(str1)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        stringBuilder.append('.');
        stringBuilder.append(paramString);
        str = stringBuilder.toString();
      } 
    } 
    try {
      ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = d;
      Map<Object, Object> map2 = (Map)threadLocal.get();
      Map<Object, Object> map1 = map2;
      if (map2 == null) {
        map1 = new HashMap<Object, Object>();
        super();
        threadLocal.set(map1);
      } 
      Constructor<?> constructor2 = (Constructor)map1.get(str);
      Constructor<?> constructor1 = constructor2;
      if (constructor2 == null) {
        constructor1 = Class.forName(str, false, paramContext.getClassLoader()).getConstructor(c);
        constructor1.setAccessible(true);
        map1.put(str, constructor1);
      } 
      return (Behavior)constructor1.newInstance(new Object[] { paramContext, paramAttributeSet });
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not inflate Behavior subclass ");
      stringBuilder.append(str);
      throw new RuntimeException(stringBuilder.toString(), exception);
    } 
  }
  
  private boolean P(MotionEvent paramMotionEvent, int paramInt) {
    boolean bool2;
    int i = paramMotionEvent.getActionMasked();
    List<View> list = this.i;
    D(list);
    int j = list.size();
    e e = null;
    byte b = 0;
    boolean bool1 = false;
    boolean bool = false;
    while (true) {
      bool2 = bool1;
      if (b < j) {
        MotionEvent motionEvent;
        e e1;
        boolean bool3;
        boolean bool4;
        View view = list.get(b);
        e e2 = (e)view.getLayoutParams();
        Behavior<View> behavior = e2.f();
        if ((bool1 || bool) && i != 0) {
          e2 = e;
          bool3 = bool1;
          bool4 = bool;
          if (behavior != null) {
            e2 = e;
            if (e == null) {
              long l = SystemClock.uptimeMillis();
              motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            } 
            if (paramInt != 0) {
              if (paramInt != 1) {
                bool3 = bool1;
                bool4 = bool;
              } else {
                behavior.D(this, view, motionEvent);
                bool3 = bool1;
                bool4 = bool;
              } 
            } else {
              behavior.k(this, view, motionEvent);
              bool3 = bool1;
              bool4 = bool;
            } 
          } 
        } else {
          bool2 = bool1;
          if (!bool1) {
            bool2 = bool1;
            if (behavior != null) {
              if (paramInt != 0) {
                if (paramInt == 1)
                  bool1 = behavior.D(this, view, paramMotionEvent); 
              } else {
                bool1 = behavior.k(this, view, paramMotionEvent);
              } 
              bool2 = bool1;
              if (bool1) {
                this.q = view;
                bool2 = bool1;
              } 
            } 
          } 
          bool3 = motionEvent.c();
          bool1 = motionEvent.i(this, view);
          if (bool1 && !bool3) {
            bool = true;
          } else {
            bool = false;
          } 
          e1 = e;
          bool3 = bool2;
          bool4 = bool;
          if (bool1) {
            e1 = e;
            bool3 = bool2;
            bool4 = bool;
            if (!bool)
              break; 
          } 
        } 
        b++;
        e = e1;
        bool1 = bool3;
        bool = bool4;
        continue;
      } 
      break;
    } 
    list.clear();
    return bool2;
  }
  
  private void Q() {
    this.g.clear();
    this.h.c();
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      e e = C(view);
      e.d(this, view);
      this.h.b(view);
      for (byte b1 = 0; b1 < i; b1++) {
        if (b1 != b) {
          View view1 = getChildAt(b1);
          if (e.b(this, view, view1)) {
            if (!this.h.d(view1))
              this.h.b(view1); 
            this.h.a(view1, view);
          } 
        } 
      } 
    } 
    this.g.addAll(this.h.i());
    Collections.reverse(this.g);
  }
  
  private static void S(Rect paramRect) {
    paramRect.setEmpty();
    f.c(paramRect);
  }
  
  private void U(boolean paramBoolean) {
    int i = getChildCount();
    byte b;
    for (b = 0; b < i; b++) {
      View view = getChildAt(b);
      Behavior<View> behavior = ((e)view.getLayoutParams()).f();
      if (behavior != null) {
        long l = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        if (paramBoolean) {
          behavior.k(this, view, motionEvent);
        } else {
          behavior.D(this, view, motionEvent);
        } 
        motionEvent.recycle();
      } 
    } 
    for (b = 0; b < i; b++)
      ((e)getChildAt(b).getLayoutParams()).m(); 
    this.q = null;
    this.n = false;
  }
  
  private static int V(int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = 17; 
    return i;
  }
  
  private static int W(int paramInt) {
    int i = paramInt;
    if ((paramInt & 0x7) == 0)
      i = paramInt | 0x800003; 
    paramInt = i;
    if ((i & 0x70) == 0)
      paramInt = i | 0x30; 
    return paramInt;
  }
  
  private static int X(int paramInt) {
    int i = paramInt;
    if (paramInt == 0)
      i = 8388661; 
    return i;
  }
  
  private void Y(View paramView, int paramInt) {
    e e = (e)paramView.getLayoutParams();
    int i = e.i;
    if (i != paramInt) {
      w.a0(paramView, paramInt - i);
      e.i = paramInt;
    } 
  }
  
  private void Z(View paramView, int paramInt) {
    e e = (e)paramView.getLayoutParams();
    int i = e.j;
    if (i != paramInt) {
      w.b0(paramView, paramInt - i);
      e.j = paramInt;
    } 
  }
  
  private void b0() {
    if (Build.VERSION.SDK_INT < 21)
      return; 
    if (w.z((View)this)) {
      if (this.y == null)
        this.y = new a(this); 
      w.E0((View)this, this.y);
      setSystemUiVisibility(1280);
    } else {
      w.E0((View)this, null);
    } 
  }
  
  private static Rect e() {
    Rect rect1 = (Rect)f.b();
    Rect rect2 = rect1;
    if (rect1 == null)
      rect2 = new Rect(); 
    return rect2;
  }
  
  private static int g(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 < paramInt2) ? paramInt2 : ((paramInt1 > paramInt3) ? paramInt3 : paramInt1);
  }
  
  private void n(e parame, Rect paramRect, int paramInt1, int paramInt2) {
    int i = getWidth();
    int j = getHeight();
    i = Math.max(getPaddingLeft() + parame.leftMargin, Math.min(paramRect.left, i - getPaddingRight() - paramInt1 - parame.rightMargin));
    j = Math.max(getPaddingTop() + parame.topMargin, Math.min(paramRect.top, j - getPaddingBottom() - paramInt2 - parame.bottomMargin));
    paramRect.set(i, j, paramInt1 + i, paramInt2 + j);
  }
  
  private e0 o(e0 parame0) {
    e0 e01;
    if (parame0.m())
      return parame0; 
    byte b = 0;
    int i = getChildCount();
    while (true) {
      e01 = parame0;
      if (b < i) {
        View view = getChildAt(b);
        e01 = parame0;
        if (w.z(view)) {
          Behavior<View> behavior = ((e)view.getLayoutParams()).f();
          e01 = parame0;
          if (behavior != null) {
            parame0 = behavior.f(this, view, parame0);
            e01 = parame0;
            if (parame0.m()) {
              e01 = parame0;
              break;
            } 
          } 
        } 
        b++;
        parame0 = e01;
        continue;
      } 
      break;
    } 
    return e01;
  }
  
  private void z(View paramView, int paramInt1, Rect paramRect1, Rect paramRect2, e parame, int paramInt2, int paramInt3) {
    int i = b.h.k.e.b(V(parame.c), paramInt1);
    paramInt1 = b.h.k.e.b(W(parame.d), paramInt1);
    int j = i & 0x7;
    int k = i & 0x70;
    int i1 = paramInt1 & 0x7;
    i = paramInt1 & 0x70;
    if (i1 != 1) {
      if (i1 != 5) {
        paramInt1 = paramRect1.left;
      } else {
        paramInt1 = paramRect1.right;
      } 
    } else {
      paramInt1 = paramRect1.left + paramRect1.width() / 2;
    } 
    if (i != 16) {
      if (i != 80) {
        i = paramRect1.top;
      } else {
        i = paramRect1.bottom;
      } 
    } else {
      i = paramRect1.top + paramRect1.height() / 2;
    } 
    if (j != 1) {
      i1 = paramInt1;
      if (j != 5)
        i1 = paramInt1 - paramInt2; 
    } else {
      i1 = paramInt1 - paramInt2 / 2;
    } 
    if (k != 16) {
      paramInt1 = i;
      if (k != 80)
        paramInt1 = i - paramInt3; 
    } else {
      paramInt1 = i - paramInt3 / 2;
    } 
    paramRect2.set(i1, paramInt1, paramInt2 + i1, paramInt3 + paramInt1);
  }
  
  void B(View paramView, Rect paramRect) {
    paramRect.set(((e)paramView.getLayoutParams()).h());
  }
  
  e C(View paramView) {
    e e = (e)paramView.getLayoutParams();
    if (!e.b) {
      Behavior behavior;
      if (paramView instanceof b) {
        behavior = ((b)paramView).getBehavior();
        if (behavior == null)
          Log.e("CoordinatorLayout", "Attached behavior class is null"); 
        e.o(behavior);
        e.b = true;
      } else {
        c c;
        Class<?> clazz = behavior.getClass();
        behavior = null;
        while (clazz != null) {
          c c1 = clazz.<c>getAnnotation(c.class);
          c = c1;
          if (c1 == null) {
            clazz = clazz.getSuperclass();
            c = c1;
          } 
        } 
        if (c != null)
          try {
            e.o(c.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
          } catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Default behavior class ");
            stringBuilder.append(c.value().getName());
            stringBuilder.append(" could not be instantiated. Did you forget a default constructor?");
            Log.e("CoordinatorLayout", stringBuilder.toString(), exception);
          }  
        e.b = true;
      } 
    } 
    return e;
  }
  
  public boolean F(View paramView, int paramInt1, int paramInt2) {
    Rect rect = e();
    x(paramView, rect);
    try {
      return rect.contains(paramInt1, paramInt2);
    } finally {
      S(rect);
    } 
  }
  
  void K(View paramView, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   4: checkcast androidx/coordinatorlayout/widget/CoordinatorLayout$e
    //   7: astore_3
    //   8: aload_3
    //   9: getfield k : Landroid/view/View;
    //   12: ifnull -> 210
    //   15: invokestatic e : ()Landroid/graphics/Rect;
    //   18: astore #4
    //   20: invokestatic e : ()Landroid/graphics/Rect;
    //   23: astore #5
    //   25: invokestatic e : ()Landroid/graphics/Rect;
    //   28: astore #6
    //   30: aload_0
    //   31: aload_3
    //   32: getfield k : Landroid/view/View;
    //   35: aload #4
    //   37: invokevirtual x : (Landroid/view/View;Landroid/graphics/Rect;)V
    //   40: iconst_0
    //   41: istore #7
    //   43: aload_0
    //   44: aload_1
    //   45: iconst_0
    //   46: aload #5
    //   48: invokevirtual u : (Landroid/view/View;ZLandroid/graphics/Rect;)V
    //   51: aload_1
    //   52: invokevirtual getMeasuredWidth : ()I
    //   55: istore #8
    //   57: aload_1
    //   58: invokevirtual getMeasuredHeight : ()I
    //   61: istore #9
    //   63: aload_0
    //   64: aload_1
    //   65: iload_2
    //   66: aload #4
    //   68: aload #6
    //   70: aload_3
    //   71: iload #8
    //   73: iload #9
    //   75: invokespecial z : (Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;II)V
    //   78: aload #6
    //   80: getfield left : I
    //   83: aload #5
    //   85: getfield left : I
    //   88: if_icmpne -> 107
    //   91: iload #7
    //   93: istore_2
    //   94: aload #6
    //   96: getfield top : I
    //   99: aload #5
    //   101: getfield top : I
    //   104: if_icmpeq -> 109
    //   107: iconst_1
    //   108: istore_2
    //   109: aload_0
    //   110: aload_3
    //   111: aload #6
    //   113: iload #8
    //   115: iload #9
    //   117: invokespecial n : (Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;Landroid/graphics/Rect;II)V
    //   120: aload #6
    //   122: getfield left : I
    //   125: aload #5
    //   127: getfield left : I
    //   130: isub
    //   131: istore #7
    //   133: aload #6
    //   135: getfield top : I
    //   138: aload #5
    //   140: getfield top : I
    //   143: isub
    //   144: istore #9
    //   146: iload #7
    //   148: ifeq -> 157
    //   151: aload_1
    //   152: iload #7
    //   154: invokestatic a0 : (Landroid/view/View;I)V
    //   157: iload #9
    //   159: ifeq -> 168
    //   162: aload_1
    //   163: iload #9
    //   165: invokestatic b0 : (Landroid/view/View;I)V
    //   168: iload_2
    //   169: ifeq -> 195
    //   172: aload_3
    //   173: invokevirtual f : ()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    //   176: astore #10
    //   178: aload #10
    //   180: ifnull -> 195
    //   183: aload #10
    //   185: aload_0
    //   186: aload_1
    //   187: aload_3
    //   188: getfield k : Landroid/view/View;
    //   191: invokevirtual h : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    //   194: pop
    //   195: aload #4
    //   197: invokestatic S : (Landroid/graphics/Rect;)V
    //   200: aload #5
    //   202: invokestatic S : (Landroid/graphics/Rect;)V
    //   205: aload #6
    //   207: invokestatic S : (Landroid/graphics/Rect;)V
    //   210: return
  }
  
  final void L(int paramInt) {
    int i = w.C((View)this);
    int j = this.g.size();
    Rect rect1 = e();
    Rect rect2 = e();
    Rect rect3 = e();
    for (byte b = 0; b < j; b++) {
      View view = this.g.get(b);
      e e = (e)view.getLayoutParams();
      if (paramInt == 0 && view.getVisibility() == 8)
        continue; 
      int k;
      for (k = 0; k < b; k++) {
        View view1 = this.g.get(k);
        if (e.l == view1)
          K(view, i); 
      } 
      u(view, true, rect2);
      if (e.g != 0 && !rect2.isEmpty()) {
        int i1 = b.h.k.e.b(e.g, i);
        k = i1 & 0x70;
        if (k != 48) {
          if (k == 80)
            rect1.bottom = Math.max(rect1.bottom, getHeight() - rect2.top); 
        } else {
          rect1.top = Math.max(rect1.top, rect2.bottom);
        } 
        k = i1 & 0x7;
        if (k != 3) {
          if (k == 5)
            rect1.right = Math.max(rect1.right, getWidth() - rect2.left); 
        } else {
          rect1.left = Math.max(rect1.left, rect2.right);
        } 
      } 
      if (e.h != 0 && view.getVisibility() == 0)
        J(view, rect1, i); 
      if (paramInt != 2) {
        B(view, rect3);
        if (rect3.equals(rect2))
          continue; 
        R(view, rect2);
      } 
      for (k = b + 1; k < j; k++) {
        View view1 = this.g.get(k);
        e = (e)view1.getLayoutParams();
        Behavior<View> behavior = e.f();
        if (behavior != null && behavior.e(this, view1, view))
          if (paramInt == 0 && e.g()) {
            e.k();
          } else {
            boolean bool;
            if (paramInt != 2) {
              bool = behavior.h(this, view1, view);
            } else {
              behavior.i(this, view1, view);
              bool = true;
            } 
            if (paramInt == 1)
              e.p(bool); 
          }  
      } 
      continue;
    } 
    S(rect1);
    S(rect2);
    S(rect3);
  }
  
  public void M(View paramView, int paramInt) {
    e e = (e)paramView.getLayoutParams();
    if (!e.a()) {
      View view = e.k;
      if (view != null) {
        H(paramView, view, paramInt);
      } else {
        int i = e.e;
        if (i >= 0) {
          I(paramView, i, paramInt);
        } else {
          G(paramView, paramInt);
        } 
      } 
      return;
    } 
    throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
  }
  
  public void N(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  void R(View paramView, Rect paramRect) {
    ((e)paramView.getLayoutParams()).q(paramRect);
  }
  
  void T() {
    if (this.o && this.s != null)
      getViewTreeObserver().removeOnPreDrawListener(this.s); 
    this.t = false;
  }
  
  final e0 a0(e0 parame0) {
    e0 e01 = parame0;
    if (!b.h.j.d.a(this.u, parame0)) {
      boolean bool2;
      this.u = parame0;
      boolean bool1 = true;
      if (parame0 != null && parame0.i() > 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.v = bool2;
      if (!bool2 && getBackground() == null) {
        bool2 = bool1;
      } else {
        bool2 = false;
      } 
      setWillNotDraw(bool2);
      e01 = o(parame0);
      requestLayout();
    } 
    return e01;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    boolean bool;
    if (paramLayoutParams instanceof e && super.checkLayoutParams(paramLayoutParams)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    e e = (e)paramView.getLayoutParams();
    Behavior<View> behavior = e.a;
    if (behavior != null) {
      float f1 = behavior.d(this, paramView);
      if (f1 > 0.0F) {
        if (this.k == null)
          this.k = new Paint(); 
        this.k.setColor(e.a.c(this, paramView));
        this.k.setAlpha(g(Math.round(f1 * 255.0F), 0, 255));
        int i = paramCanvas.save();
        if (paramView.isOpaque())
          paramCanvas.clipRect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom(), Region.Op.DIFFERENCE); 
        paramCanvas.drawRect(getPaddingLeft(), getPaddingTop(), (getWidth() - getPaddingRight()), (getHeight() - getPaddingBottom()), this.k);
        paramCanvas.restoreToCount(i);
      } 
    } 
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable drawable = this.w;
    byte b = 0;
    int i = b;
    if (drawable != null) {
      i = b;
      if (drawable.isStateful())
        i = false | drawable.setState(arrayOfInt); 
    } 
    if (i != 0)
      invalidate(); 
  }
  
  void f() {
    if (this.o) {
      if (this.s == null)
        this.s = new f(this); 
      getViewTreeObserver().addOnPreDrawListener(this.s);
    } 
    this.t = true;
  }
  
  final List<View> getDependencySortedChildren() {
    Q();
    return Collections.unmodifiableList(this.g);
  }
  
  public final e0 getLastWindowInsets() {
    return this.u;
  }
  
  public int getNestedScrollAxes() {
    return this.z.a();
  }
  
  public Drawable getStatusBarBackground() {
    return this.w;
  }
  
  protected int getSuggestedMinimumHeight() {
    return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
  }
  
  protected int getSuggestedMinimumWidth() {
    return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
  }
  
  public void h(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    int i = getChildCount();
    boolean bool = false;
    byte b = 0;
    int j = 0;
    int k;
    for (k = 0; b < i; k = i2) {
      int i1;
      int i2;
      View view = getChildAt(b);
      if (view.getVisibility() == 8) {
        i1 = j;
        i2 = k;
      } else {
        e e = (e)view.getLayoutParams();
        if (!e.j(paramInt5)) {
          i1 = j;
          i2 = k;
        } else {
          Behavior<View> behavior = e.f();
          i1 = j;
          i2 = k;
          if (behavior != null) {
            int[] arrayOfInt2 = this.l;
            arrayOfInt2[0] = 0;
            arrayOfInt2[1] = 0;
            behavior.t(this, view, paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, arrayOfInt2);
            int[] arrayOfInt1 = this.l;
            if (paramInt3 > 0) {
              i2 = Math.max(j, arrayOfInt1[0]);
            } else {
              i2 = Math.min(j, arrayOfInt1[0]);
            } 
            j = i2;
            if (paramInt4 > 0) {
              i2 = Math.max(k, this.l[1]);
            } else {
              i2 = Math.min(k, this.l[1]);
            } 
            bool = true;
            i1 = j;
          } 
        } 
      } 
      b++;
      j = i1;
    } 
    paramArrayOfint[0] = paramArrayOfint[0] + j;
    paramArrayOfint[1] = paramArrayOfint[1] + k;
    if (bool)
      L(1); 
  }
  
  public void i(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    h(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0, this.m);
  }
  
  public boolean j(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    int i = getChildCount();
    byte b = 0;
    boolean bool = false;
    while (b < i) {
      View view = getChildAt(b);
      if (view.getVisibility() != 8) {
        e e = (e)view.getLayoutParams();
        Behavior<View> behavior = e.f();
        if (behavior != null) {
          boolean bool1 = behavior.A(this, view, paramView1, paramView2, paramInt1, paramInt2);
          bool |= bool1;
          e.r(paramInt2, bool1);
        } else {
          e.r(paramInt2, false);
        } 
      } 
      b++;
    } 
    return bool;
  }
  
  public void k(View paramView1, View paramView2, int paramInt1, int paramInt2) {
    this.z.c(paramView1, paramView2, paramInt1, paramInt2);
    this.r = paramView2;
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      e e = (e)view.getLayoutParams();
      if (e.j(paramInt2)) {
        Behavior<View> behavior = e.f();
        if (behavior != null)
          behavior.v(this, view, paramView1, paramView2, paramInt1, paramInt2); 
      } 
    } 
  }
  
  public void l(View paramView, int paramInt) {
    this.z.e(paramView, paramInt);
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      e e = (e)view.getLayoutParams();
      if (e.j(paramInt)) {
        Behavior<View> behavior = e.f();
        if (behavior != null)
          behavior.C(this, view, paramView, paramInt); 
        e.l(paramInt);
        e.k();
      } 
    } 
    this.r = null;
  }
  
  public void m(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    int i = getChildCount();
    boolean bool = false;
    byte b = 0;
    int j = 0;
    int k;
    for (k = 0; b < i; k = i2) {
      int i1;
      int i2;
      View view = getChildAt(b);
      if (view.getVisibility() == 8) {
        i1 = j;
        i2 = k;
      } else {
        e e = (e)view.getLayoutParams();
        if (!e.j(paramInt3)) {
          i1 = j;
          i2 = k;
        } else {
          Behavior<View> behavior = e.f();
          i1 = j;
          i2 = k;
          if (behavior != null) {
            int[] arrayOfInt2 = this.l;
            arrayOfInt2[0] = 0;
            arrayOfInt2[1] = 0;
            behavior.q(this, view, paramView, paramInt1, paramInt2, arrayOfInt2, paramInt3);
            int[] arrayOfInt1 = this.l;
            if (paramInt1 > 0) {
              i2 = Math.max(j, arrayOfInt1[0]);
            } else {
              i2 = Math.min(j, arrayOfInt1[0]);
            } 
            i1 = i2;
            arrayOfInt1 = this.l;
            if (paramInt2 > 0) {
              i2 = Math.max(k, arrayOfInt1[1]);
            } else {
              i2 = Math.min(k, arrayOfInt1[1]);
            } 
            bool = true;
          } 
        } 
      } 
      b++;
      j = i1;
    } 
    paramArrayOfint[0] = j;
    paramArrayOfint[1] = k;
    if (bool)
      L(1); 
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    U(false);
    if (this.t) {
      if (this.s == null)
        this.s = new f(this); 
      getViewTreeObserver().addOnPreDrawListener(this.s);
    } 
    if (this.u == null && w.z((View)this))
      w.o0((View)this); 
    this.o = true;
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    U(false);
    if (this.t && this.s != null)
      getViewTreeObserver().removeOnPreDrawListener(this.s); 
    View view = this.r;
    if (view != null)
      onStopNestedScroll(view); 
    this.o = false;
  }
  
  public void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    if (this.v && this.w != null) {
      boolean bool;
      e0 e01 = this.u;
      if (e01 != null) {
        bool = e01.i();
      } else {
        bool = false;
      } 
      if (bool) {
        this.w.setBounds(0, 0, getWidth(), bool);
        this.w.draw(paramCanvas);
      } 
    } 
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      U(true); 
    boolean bool = P(paramMotionEvent, 0);
    if (i == 1 || i == 3)
      U(true); 
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt3 = w.C((View)this);
    paramInt2 = this.g.size();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      View view = this.g.get(paramInt1);
      if (view.getVisibility() != 8) {
        Behavior<View> behavior = ((e)view.getLayoutParams()).f();
        if (behavior == null || !behavior.l(this, view, paramInt3))
          M(view, paramInt3); 
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial Q : ()V
    //   4: aload_0
    //   5: invokevirtual q : ()V
    //   8: aload_0
    //   9: invokevirtual getPaddingLeft : ()I
    //   12: istore_3
    //   13: aload_0
    //   14: invokevirtual getPaddingTop : ()I
    //   17: istore #4
    //   19: aload_0
    //   20: invokevirtual getPaddingRight : ()I
    //   23: istore #5
    //   25: aload_0
    //   26: invokevirtual getPaddingBottom : ()I
    //   29: istore #6
    //   31: aload_0
    //   32: invokestatic C : (Landroid/view/View;)I
    //   35: istore #7
    //   37: iload #7
    //   39: iconst_1
    //   40: if_icmpne -> 49
    //   43: iconst_1
    //   44: istore #8
    //   46: goto -> 52
    //   49: iconst_0
    //   50: istore #8
    //   52: iload_1
    //   53: invokestatic getMode : (I)I
    //   56: istore #9
    //   58: iload_1
    //   59: invokestatic getSize : (I)I
    //   62: istore #10
    //   64: iload_2
    //   65: invokestatic getMode : (I)I
    //   68: istore #11
    //   70: iload_2
    //   71: invokestatic getSize : (I)I
    //   74: istore #12
    //   76: aload_0
    //   77: invokevirtual getSuggestedMinimumWidth : ()I
    //   80: istore #13
    //   82: aload_0
    //   83: invokevirtual getSuggestedMinimumHeight : ()I
    //   86: istore #14
    //   88: aload_0
    //   89: getfield u : Lb/h/k/e0;
    //   92: ifnull -> 108
    //   95: aload_0
    //   96: invokestatic z : (Landroid/view/View;)Z
    //   99: ifeq -> 108
    //   102: iconst_1
    //   103: istore #15
    //   105: goto -> 111
    //   108: iconst_0
    //   109: istore #15
    //   111: aload_0
    //   112: getfield g : Ljava/util/List;
    //   115: invokeinterface size : ()I
    //   120: istore #16
    //   122: iconst_0
    //   123: istore #17
    //   125: iconst_0
    //   126: istore #18
    //   128: iload_3
    //   129: istore #19
    //   131: iload #19
    //   133: istore #20
    //   135: iload #18
    //   137: iload #16
    //   139: if_icmpge -> 521
    //   142: aload_0
    //   143: getfield g : Ljava/util/List;
    //   146: iload #18
    //   148: invokeinterface get : (I)Ljava/lang/Object;
    //   153: checkcast android/view/View
    //   156: astore #21
    //   158: aload #21
    //   160: invokevirtual getVisibility : ()I
    //   163: bipush #8
    //   165: if_icmpne -> 171
    //   168: goto -> 511
    //   171: aload #21
    //   173: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   176: checkcast androidx/coordinatorlayout/widget/CoordinatorLayout$e
    //   179: astore #22
    //   181: aload #22
    //   183: getfield e : I
    //   186: istore #19
    //   188: iload #19
    //   190: iflt -> 299
    //   193: iload #9
    //   195: ifeq -> 299
    //   198: aload_0
    //   199: iload #19
    //   201: invokespecial A : (I)I
    //   204: istore #23
    //   206: aload #22
    //   208: getfield c : I
    //   211: invokestatic X : (I)I
    //   214: iload #7
    //   216: invokestatic b : (II)I
    //   219: bipush #7
    //   221: iand
    //   222: istore #19
    //   224: iload #19
    //   226: iconst_3
    //   227: if_icmpne -> 235
    //   230: iload #8
    //   232: ifeq -> 246
    //   235: iload #19
    //   237: iconst_5
    //   238: if_icmpne -> 263
    //   241: iload #8
    //   243: ifeq -> 263
    //   246: iconst_0
    //   247: iload #10
    //   249: iload #5
    //   251: isub
    //   252: iload #23
    //   254: isub
    //   255: invokestatic max : (II)I
    //   258: istore #19
    //   260: goto -> 302
    //   263: iload #19
    //   265: iconst_5
    //   266: if_icmpne -> 274
    //   269: iload #8
    //   271: ifeq -> 285
    //   274: iload #19
    //   276: iconst_3
    //   277: if_icmpne -> 299
    //   280: iload #8
    //   282: ifeq -> 299
    //   285: iconst_0
    //   286: iload #23
    //   288: iload #20
    //   290: isub
    //   291: invokestatic max : (II)I
    //   294: istore #19
    //   296: goto -> 302
    //   299: iconst_0
    //   300: istore #19
    //   302: iload #17
    //   304: istore #24
    //   306: iload #15
    //   308: ifeq -> 388
    //   311: aload #21
    //   313: invokestatic z : (Landroid/view/View;)Z
    //   316: ifne -> 388
    //   319: aload_0
    //   320: getfield u : Lb/h/k/e0;
    //   323: invokevirtual g : ()I
    //   326: istore #25
    //   328: aload_0
    //   329: getfield u : Lb/h/k/e0;
    //   332: invokevirtual h : ()I
    //   335: istore #17
    //   337: aload_0
    //   338: getfield u : Lb/h/k/e0;
    //   341: invokevirtual i : ()I
    //   344: istore #26
    //   346: aload_0
    //   347: getfield u : Lb/h/k/e0;
    //   350: invokevirtual f : ()I
    //   353: istore #23
    //   355: iload #10
    //   357: iload #25
    //   359: iload #17
    //   361: iadd
    //   362: isub
    //   363: iload #9
    //   365: invokestatic makeMeasureSpec : (II)I
    //   368: istore #17
    //   370: iload #12
    //   372: iload #26
    //   374: iload #23
    //   376: iadd
    //   377: isub
    //   378: iload #11
    //   380: invokestatic makeMeasureSpec : (II)I
    //   383: istore #23
    //   385: goto -> 394
    //   388: iload_1
    //   389: istore #17
    //   391: iload_2
    //   392: istore #23
    //   394: aload #22
    //   396: invokevirtual f : ()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    //   399: astore #27
    //   401: aload #27
    //   403: ifnull -> 427
    //   406: aload #27
    //   408: aload_0
    //   409: aload #21
    //   411: iload #17
    //   413: iload #19
    //   415: iload #23
    //   417: iconst_0
    //   418: invokevirtual m : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z
    //   421: ifne -> 440
    //   424: goto -> 427
    //   427: aload_0
    //   428: aload #21
    //   430: iload #17
    //   432: iload #19
    //   434: iload #23
    //   436: iconst_0
    //   437: invokevirtual N : (Landroid/view/View;IIII)V
    //   440: iload #13
    //   442: iload_3
    //   443: iload #5
    //   445: iadd
    //   446: aload #21
    //   448: invokevirtual getMeasuredWidth : ()I
    //   451: iadd
    //   452: aload #22
    //   454: getfield leftMargin : I
    //   457: iadd
    //   458: aload #22
    //   460: getfield rightMargin : I
    //   463: iadd
    //   464: invokestatic max : (II)I
    //   467: istore #13
    //   469: iload #14
    //   471: iload #4
    //   473: iload #6
    //   475: iadd
    //   476: aload #21
    //   478: invokevirtual getMeasuredHeight : ()I
    //   481: iadd
    //   482: aload #22
    //   484: getfield topMargin : I
    //   487: iadd
    //   488: aload #22
    //   490: getfield bottomMargin : I
    //   493: iadd
    //   494: invokestatic max : (II)I
    //   497: istore #14
    //   499: iload #24
    //   501: aload #21
    //   503: invokevirtual getMeasuredState : ()I
    //   506: invokestatic combineMeasuredStates : (II)I
    //   509: istore #17
    //   511: iinc #18, 1
    //   514: iload #20
    //   516: istore #19
    //   518: goto -> 131
    //   521: aload_0
    //   522: iload #13
    //   524: iload_1
    //   525: ldc_w -16777216
    //   528: iload #17
    //   530: iand
    //   531: invokestatic resolveSizeAndState : (III)I
    //   534: iload #14
    //   536: iload_2
    //   537: iload #17
    //   539: bipush #16
    //   541: ishl
    //   542: invokestatic resolveSizeAndState : (III)I
    //   545: invokevirtual setMeasuredDimension : (II)V
    //   548: return
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    int i = getChildCount();
    byte b = 0;
    boolean bool;
    for (bool = false; b < i; bool = bool1) {
      boolean bool1;
      View view = getChildAt(b);
      if (view.getVisibility() == 8) {
        bool1 = bool;
      } else {
        e e = (e)view.getLayoutParams();
        if (!e.j(0)) {
          bool1 = bool;
        } else {
          Behavior<View> behavior = e.f();
          bool1 = bool;
          if (behavior != null)
            bool1 = bool | behavior.n(this, view, paramView, paramFloat1, paramFloat2, paramBoolean); 
        } 
      } 
      b++;
    } 
    if (bool)
      L(1); 
    return bool;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    int i = getChildCount();
    byte b = 0;
    boolean bool;
    for (bool = false; b < i; bool = bool1) {
      boolean bool1;
      View view = getChildAt(b);
      if (view.getVisibility() == 8) {
        bool1 = bool;
      } else {
        e e = (e)view.getLayoutParams();
        if (!e.j(0)) {
          bool1 = bool;
        } else {
          Behavior<View> behavior = e.f();
          bool1 = bool;
          if (behavior != null)
            bool1 = bool | behavior.o(this, view, paramView, paramFloat1, paramFloat2); 
        } 
      } 
      b++;
    } 
    return bool;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    m(paramView, paramInt1, paramInt2, paramArrayOfint, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    i(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    k(paramView1, paramView2, paramInt, 0);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.a());
    SparseArray<Parcelable> sparseArray = savedState.d;
    byte b = 0;
    int i = getChildCount();
    while (b < i) {
      View view = getChildAt(b);
      int j = view.getId();
      Behavior<View> behavior = C(view).f();
      if (j != -1 && behavior != null) {
        Parcelable parcelable = (Parcelable)sparseArray.get(j);
        if (parcelable != null)
          behavior.x(this, view, parcelable); 
      } 
      b++;
    } 
  }
  
  protected Parcelable onSaveInstanceState() {
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    SparseArray<Parcelable> sparseArray = new SparseArray();
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      View view = getChildAt(b);
      int j = view.getId();
      Behavior<View> behavior = ((e)view.getLayoutParams()).f();
      if (j != -1 && behavior != null) {
        Parcelable parcelable = behavior.y(this, view);
        if (parcelable != null)
          sparseArray.append(j, parcelable); 
      } 
    } 
    savedState.d = sparseArray;
    return (Parcelable)savedState;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return j(paramView1, paramView2, paramInt, 0);
  }
  
  public void onStopNestedScroll(View paramView) {
    l(paramView, 0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield q : Landroid/view/View;
    //   9: ifnonnull -> 29
    //   12: aload_0
    //   13: aload_1
    //   14: iconst_1
    //   15: invokespecial P : (Landroid/view/MotionEvent;I)Z
    //   18: istore_3
    //   19: iload_3
    //   20: istore #4
    //   22: iload_3
    //   23: ifeq -> 76
    //   26: goto -> 31
    //   29: iconst_0
    //   30: istore_3
    //   31: aload_0
    //   32: getfield q : Landroid/view/View;
    //   35: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   38: checkcast androidx/coordinatorlayout/widget/CoordinatorLayout$e
    //   41: invokevirtual f : ()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
    //   44: astore #5
    //   46: iload_3
    //   47: istore #4
    //   49: aload #5
    //   51: ifnull -> 76
    //   54: aload #5
    //   56: aload_0
    //   57: aload_0
    //   58: getfield q : Landroid/view/View;
    //   61: aload_1
    //   62: invokevirtual D : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    //   65: istore #6
    //   67: iload_3
    //   68: istore #4
    //   70: iload #6
    //   72: istore_3
    //   73: goto -> 78
    //   76: iconst_0
    //   77: istore_3
    //   78: aload_0
    //   79: getfield q : Landroid/view/View;
    //   82: astore #7
    //   84: aconst_null
    //   85: astore #5
    //   87: aload #7
    //   89: ifnonnull -> 107
    //   92: iload_3
    //   93: aload_0
    //   94: aload_1
    //   95: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   98: ior
    //   99: istore #6
    //   101: aload #5
    //   103: astore_1
    //   104: goto -> 144
    //   107: iload_3
    //   108: istore #6
    //   110: aload #5
    //   112: astore_1
    //   113: iload #4
    //   115: ifeq -> 144
    //   118: invokestatic uptimeMillis : ()J
    //   121: lstore #8
    //   123: lload #8
    //   125: lload #8
    //   127: iconst_3
    //   128: fconst_0
    //   129: fconst_0
    //   130: iconst_0
    //   131: invokestatic obtain : (JJIFFI)Landroid/view/MotionEvent;
    //   134: astore_1
    //   135: aload_0
    //   136: aload_1
    //   137: invokespecial onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   140: pop
    //   141: iload_3
    //   142: istore #6
    //   144: aload_1
    //   145: ifnull -> 152
    //   148: aload_1
    //   149: invokevirtual recycle : ()V
    //   152: iload_2
    //   153: iconst_1
    //   154: if_icmpeq -> 162
    //   157: iload_2
    //   158: iconst_3
    //   159: if_icmpne -> 167
    //   162: aload_0
    //   163: iconst_0
    //   164: invokespecial U : (Z)V
    //   167: iload #6
    //   169: ireturn
  }
  
  public void p(View paramView) {
    List<View> list = this.h.g(paramView);
    if (list != null && !list.isEmpty())
      for (byte b = 0; b < list.size(); b++) {
        View view = list.get(b);
        Behavior<View> behavior = ((e)view.getLayoutParams()).f();
        if (behavior != null)
          behavior.h(this, view, paramView); 
      }  
  }
  
  void q() {
    boolean bool2;
    int i = getChildCount();
    boolean bool1 = false;
    byte b = 0;
    while (true) {
      bool2 = bool1;
      if (b < i) {
        if (E(getChildAt(b))) {
          bool2 = true;
          break;
        } 
        b++;
        continue;
      } 
      break;
    } 
    if (bool2 != this.t)
      if (bool2) {
        f();
      } else {
        T();
      }  
  }
  
  protected e r() {
    return new e(-2, -2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean) {
    Behavior<View> behavior = ((e)paramView.getLayoutParams()).f();
    return (behavior != null && behavior.w(this, paramView, paramRect, paramBoolean)) ? true : super.requestChildRectangleOnScreen(paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean && !this.n) {
      U(false);
      this.n = true;
    } 
  }
  
  public e s(AttributeSet paramAttributeSet) {
    return new e(getContext(), paramAttributeSet);
  }
  
  public void setFitsSystemWindows(boolean paramBoolean) {
    super.setFitsSystemWindows(paramBoolean);
    b0();
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener) {
    this.x = paramOnHierarchyChangeListener;
  }
  
  public void setStatusBarBackground(Drawable paramDrawable) {
    Drawable drawable = this.w;
    if (drawable != paramDrawable) {
      Drawable drawable1 = null;
      if (drawable != null)
        drawable.setCallback(null); 
      if (paramDrawable != null)
        drawable1 = paramDrawable.mutate(); 
      this.w = drawable1;
      if (drawable1 != null) {
        boolean bool;
        if (drawable1.isStateful())
          this.w.setState(getDrawableState()); 
        androidx.core.graphics.drawable.a.m(this.w, w.C((View)this));
        paramDrawable = this.w;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        paramDrawable.setVisible(bool, false);
        this.w.setCallback((Drawable.Callback)this);
      } 
      w.h0((View)this);
    } 
  }
  
  public void setStatusBarBackgroundColor(int paramInt) {
    setStatusBarBackground((Drawable)new ColorDrawable(paramInt));
  }
  
  public void setStatusBarBackgroundResource(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = androidx.core.content.a.f(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    setStatusBarBackground(drawable);
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Drawable drawable = this.w;
    if (drawable != null && drawable.isVisible() != bool)
      this.w.setVisible(bool, false); 
  }
  
  protected e t(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof e) ? new e((e)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new e((ViewGroup.MarginLayoutParams)paramLayoutParams) : new e(paramLayoutParams));
  }
  
  void u(View paramView, boolean paramBoolean, Rect paramRect) {
    if (paramView.isLayoutRequested() || paramView.getVisibility() == 8) {
      paramRect.setEmpty();
      return;
    } 
    if (paramBoolean) {
      x(paramView, paramRect);
    } else {
      paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    } 
  }
  
  public List<View> v(View paramView) {
    List<View> list = this.h.h(paramView);
    this.j.clear();
    if (list != null)
      this.j.addAll(list); 
    return this.j;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.w);
  }
  
  public List<View> w(View paramView) {
    List<? extends View> list = this.h.g(paramView);
    this.j.clear();
    if (list != null)
      this.j.addAll(list); 
    return this.j;
  }
  
  void x(View paramView, Rect paramRect) {
    b.a(this, paramView, paramRect);
  }
  
  void y(View paramView, int paramInt, Rect paramRect1, Rect paramRect2) {
    e e = (e)paramView.getLayoutParams();
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    z(paramView, paramInt, paramRect1, paramRect2, e, i, j);
    n(e, paramRect2, i, j);
  }
  
  static {
    Package package_ = CoordinatorLayout.class.getPackage();
    if (package_ != null) {
      String str = package_.getName();
    } else {
      package_ = null;
    } 
    b = (String)package_;
    if (Build.VERSION.SDK_INT >= 21) {
      e = new g();
    } else {
      e = null;
    } 
  }
  
  public static abstract class Behavior<V extends View> {
    public Behavior() {}
    
    public Behavior(Context param1Context, AttributeSet param1AttributeSet) {}
    
    public boolean A(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View1, View param1View2, int param1Int1, int param1Int2) {
      return (param1Int2 == 0) ? z(param1CoordinatorLayout, param1V, param1View1, param1View2, param1Int1) : false;
    }
    
    @Deprecated
    public void B(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View) {}
    
    public void C(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int) {
      if (param1Int == 0)
        B(param1CoordinatorLayout, param1V, param1View); 
    }
    
    public boolean D(CoordinatorLayout param1CoordinatorLayout, V param1V, MotionEvent param1MotionEvent) {
      return false;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, V param1V) {
      boolean bool;
      if (d(param1CoordinatorLayout, param1V) > 0.0F) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean b(CoordinatorLayout param1CoordinatorLayout, V param1V, Rect param1Rect) {
      return false;
    }
    
    public int c(CoordinatorLayout param1CoordinatorLayout, V param1V) {
      return -16777216;
    }
    
    public float d(CoordinatorLayout param1CoordinatorLayout, V param1V) {
      return 0.0F;
    }
    
    public boolean e(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View) {
      return false;
    }
    
    public e0 f(CoordinatorLayout param1CoordinatorLayout, V param1V, e0 param1e0) {
      return param1e0;
    }
    
    public void g(CoordinatorLayout.e param1e) {}
    
    public boolean h(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View) {
      return false;
    }
    
    public void i(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View) {}
    
    public void j() {}
    
    public boolean k(CoordinatorLayout param1CoordinatorLayout, V param1V, MotionEvent param1MotionEvent) {
      return false;
    }
    
    public boolean l(CoordinatorLayout param1CoordinatorLayout, V param1V, int param1Int) {
      return false;
    }
    
    public boolean m(CoordinatorLayout param1CoordinatorLayout, V param1V, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return false;
    }
    
    public boolean n(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, float param1Float1, float param1Float2, boolean param1Boolean) {
      return false;
    }
    
    public boolean o(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, float param1Float1, float param1Float2) {
      return false;
    }
    
    @Deprecated
    public void p(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int1, int param1Int2, int[] param1ArrayOfint) {}
    
    public void q(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int1, int param1Int2, int[] param1ArrayOfint, int param1Int3) {
      if (param1Int3 == 0)
        p(param1CoordinatorLayout, param1V, param1View, param1Int1, param1Int2, param1ArrayOfint); 
    }
    
    @Deprecated
    public void r(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    @Deprecated
    public void s(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
      if (param1Int5 == 0)
        r(param1CoordinatorLayout, param1V, param1View, param1Int1, param1Int2, param1Int3, param1Int4); 
    }
    
    public void t(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int[] param1ArrayOfint) {
      param1ArrayOfint[0] = param1ArrayOfint[0] + param1Int3;
      param1ArrayOfint[1] = param1ArrayOfint[1] + param1Int4;
      s(param1CoordinatorLayout, param1V, param1View, param1Int1, param1Int2, param1Int3, param1Int4, param1Int5);
    }
    
    @Deprecated
    public void u(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View1, View param1View2, int param1Int) {}
    
    public void v(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View1, View param1View2, int param1Int1, int param1Int2) {
      if (param1Int2 == 0)
        u(param1CoordinatorLayout, param1V, param1View1, param1View2, param1Int1); 
    }
    
    public boolean w(CoordinatorLayout param1CoordinatorLayout, V param1V, Rect param1Rect, boolean param1Boolean) {
      return false;
    }
    
    public void x(CoordinatorLayout param1CoordinatorLayout, V param1V, Parcelable param1Parcelable) {}
    
    public Parcelable y(CoordinatorLayout param1CoordinatorLayout, V param1V) {
      return (Parcelable)View.BaseSavedState.EMPTY_STATE;
    }
    
    @Deprecated
    public boolean z(CoordinatorLayout param1CoordinatorLayout, V param1V, View param1View1, View param1View2, int param1Int) {
      return false;
    }
  }
  
  protected static class SavedState extends AbsSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
    
    SparseArray<Parcelable> d;
    
    public SavedState(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      int i = param1Parcel.readInt();
      int[] arrayOfInt = new int[i];
      param1Parcel.readIntArray(arrayOfInt);
      Parcelable[] arrayOfParcelable = param1Parcel.readParcelableArray(param1ClassLoader);
      this.d = new SparseArray(i);
      for (byte b = 0; b < i; b++)
        this.d.append(arrayOfInt[b], arrayOfParcelable[b]); 
    }
    
    public SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      byte b2;
      super.writeToParcel(param1Parcel, param1Int);
      SparseArray<Parcelable> sparseArray = this.d;
      byte b1 = 0;
      if (sparseArray != null) {
        b2 = sparseArray.size();
      } else {
        b2 = 0;
      } 
      param1Parcel.writeInt(b2);
      int[] arrayOfInt = new int[b2];
      Parcelable[] arrayOfParcelable = new Parcelable[b2];
      while (b1 < b2) {
        arrayOfInt[b1] = this.d.keyAt(b1);
        arrayOfParcelable[b1] = (Parcelable)this.d.valueAt(b1);
        b1++;
      } 
      param1Parcel.writeIntArray(arrayOfInt);
      param1Parcel.writeParcelableArray(arrayOfParcelable, param1Int);
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public CoordinatorLayout.SavedState a(Parcel param2Parcel) {
        return new CoordinatorLayout.SavedState(param2Parcel, null);
      }
      
      public CoordinatorLayout.SavedState b(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new CoordinatorLayout.SavedState(param2Parcel, param2ClassLoader);
      }
      
      public CoordinatorLayout.SavedState[] c(int param2Int) {
        return new CoordinatorLayout.SavedState[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
    public CoordinatorLayout.SavedState a(Parcel param1Parcel) {
      return new CoordinatorLayout.SavedState(param1Parcel, null);
    }
    
    public CoordinatorLayout.SavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new CoordinatorLayout.SavedState(param1Parcel, param1ClassLoader);
    }
    
    public CoordinatorLayout.SavedState[] c(int param1Int) {
      return new CoordinatorLayout.SavedState[param1Int];
    }
  }
  
  class a implements q {
    a(CoordinatorLayout this$0) {}
    
    public e0 a(View param1View, e0 param1e0) {
      return this.a.a0(param1e0);
    }
  }
  
  public static interface b {
    CoordinatorLayout.Behavior getBehavior();
  }
  
  @Deprecated
  @Retention(RetentionPolicy.RUNTIME)
  public static @interface c {
    Class<? extends CoordinatorLayout.Behavior> value();
  }
  
  private class d implements ViewGroup.OnHierarchyChangeListener {
    d(CoordinatorLayout this$0) {}
    
    public void onChildViewAdded(View param1View1, View param1View2) {
      ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.b.x;
      if (onHierarchyChangeListener != null)
        onHierarchyChangeListener.onChildViewAdded(param1View1, param1View2); 
    }
    
    public void onChildViewRemoved(View param1View1, View param1View2) {
      this.b.L(2);
      ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.b.x;
      if (onHierarchyChangeListener != null)
        onHierarchyChangeListener.onChildViewRemoved(param1View1, param1View2); 
    }
  }
  
  public static class e extends ViewGroup.MarginLayoutParams {
    CoordinatorLayout.Behavior a;
    
    boolean b = false;
    
    public int c = 0;
    
    public int d = 0;
    
    public int e = -1;
    
    int f = -1;
    
    public int g = 0;
    
    public int h = 0;
    
    int i;
    
    int j;
    
    View k;
    
    View l;
    
    private boolean m;
    
    private boolean n;
    
    private boolean o;
    
    private boolean p;
    
    final Rect q = new Rect();
    
    Object r;
    
    public e(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    e(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, b.g.c.CoordinatorLayout_Layout);
      this.c = typedArray.getInteger(b.g.c.CoordinatorLayout_Layout_android_layout_gravity, 0);
      this.f = typedArray.getResourceId(b.g.c.CoordinatorLayout_Layout_layout_anchor, -1);
      this.d = typedArray.getInteger(b.g.c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
      this.e = typedArray.getInteger(b.g.c.CoordinatorLayout_Layout_layout_keyline, -1);
      this.g = typedArray.getInt(b.g.c.CoordinatorLayout_Layout_layout_insetEdge, 0);
      this.h = typedArray.getInt(b.g.c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
      int i = b.g.c.CoordinatorLayout_Layout_layout_behavior;
      boolean bool = typedArray.hasValue(i);
      this.b = bool;
      if (bool)
        this.a = CoordinatorLayout.O(param1Context, param1AttributeSet, typedArray.getString(i)); 
      typedArray.recycle();
      CoordinatorLayout.Behavior behavior = this.a;
      if (behavior != null)
        behavior.g(this); 
    }
    
    public e(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public e(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
    
    public e(e param1e) {
      super(param1e);
    }
    
    private void n(View param1View, CoordinatorLayout param1CoordinatorLayout) {
      View view = param1CoordinatorLayout.findViewById(this.f);
      this.k = view;
      if (view != null) {
        if (view == param1CoordinatorLayout) {
          if (param1CoordinatorLayout.isInEditMode()) {
            this.l = null;
            this.k = null;
            return;
          } 
          throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
        } 
        for (ViewParent viewParent = view.getParent(); viewParent != param1CoordinatorLayout && viewParent != null; viewParent = viewParent.getParent()) {
          if (viewParent == param1View) {
            if (param1CoordinatorLayout.isInEditMode()) {
              this.l = null;
              this.k = null;
              return;
            } 
            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
          } 
          if (viewParent instanceof View)
            view = (View)viewParent; 
        } 
        this.l = view;
        return;
      } 
      if (param1CoordinatorLayout.isInEditMode()) {
        this.l = null;
        this.k = null;
        return;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Could not find CoordinatorLayout descendant view with id ");
      stringBuilder.append(param1CoordinatorLayout.getResources().getResourceName(this.f));
      stringBuilder.append(" to anchor view ");
      stringBuilder.append(param1View);
      IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
      throw illegalStateException;
    }
    
    private boolean s(View param1View, int param1Int) {
      boolean bool;
      int i = b.h.k.e.b(((e)param1View.getLayoutParams()).g, param1Int);
      if (i != 0 && (b.h.k.e.b(this.h, param1Int) & i) == i) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    private boolean t(View param1View, CoordinatorLayout param1CoordinatorLayout) {
      if (this.k.getId() != this.f)
        return false; 
      View view = this.k;
      for (ViewParent viewParent = view.getParent(); viewParent != param1CoordinatorLayout; viewParent = viewParent.getParent()) {
        if (viewParent == null || viewParent == param1View) {
          this.l = null;
          this.k = null;
          return false;
        } 
        if (viewParent instanceof View)
          view = (View)viewParent; 
      } 
      this.l = view;
      return true;
    }
    
    boolean a() {
      boolean bool;
      if (this.k == null && this.f != -1) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean b(CoordinatorLayout param1CoordinatorLayout, View param1View1, View param1View2) {
      if (param1View2 != this.l && !s(param1View2, w.C((View)param1CoordinatorLayout))) {
        CoordinatorLayout.Behavior<View> behavior = this.a;
        return (behavior != null && behavior.e(param1CoordinatorLayout, param1View1, param1View2));
      } 
      return true;
    }
    
    boolean c() {
      if (this.a == null)
        this.m = false; 
      return this.m;
    }
    
    View d(CoordinatorLayout param1CoordinatorLayout, View param1View) {
      if (this.f == -1) {
        this.l = null;
        this.k = null;
        return null;
      } 
      if (this.k == null || !t(param1View, param1CoordinatorLayout))
        n(param1View, param1CoordinatorLayout); 
      return this.k;
    }
    
    public int e() {
      return this.f;
    }
    
    public CoordinatorLayout.Behavior f() {
      return this.a;
    }
    
    boolean g() {
      return this.p;
    }
    
    Rect h() {
      return this.q;
    }
    
    boolean i(CoordinatorLayout param1CoordinatorLayout, View param1View) {
      boolean bool2;
      boolean bool1 = this.m;
      if (bool1)
        return true; 
      CoordinatorLayout.Behavior<View> behavior = this.a;
      if (behavior != null) {
        bool2 = behavior.a(param1CoordinatorLayout, param1View);
      } else {
        bool2 = false;
      } 
      bool2 |= bool1;
      this.m = bool2;
      return bool2;
    }
    
    boolean j(int param1Int) {
      return (param1Int != 0) ? ((param1Int != 1) ? false : this.o) : this.n;
    }
    
    void k() {
      this.p = false;
    }
    
    void l(int param1Int) {
      r(param1Int, false);
    }
    
    void m() {
      this.m = false;
    }
    
    public void o(CoordinatorLayout.Behavior param1Behavior) {
      CoordinatorLayout.Behavior behavior = this.a;
      if (behavior != param1Behavior) {
        if (behavior != null)
          behavior.j(); 
        this.a = param1Behavior;
        this.r = null;
        this.b = true;
        if (param1Behavior != null)
          param1Behavior.g(this); 
      } 
    }
    
    void p(boolean param1Boolean) {
      this.p = param1Boolean;
    }
    
    void q(Rect param1Rect) {
      this.q.set(param1Rect);
    }
    
    void r(int param1Int, boolean param1Boolean) {
      if (param1Int != 0) {
        if (param1Int == 1)
          this.o = param1Boolean; 
      } else {
        this.n = param1Boolean;
      } 
    }
  }
  
  class f implements ViewTreeObserver.OnPreDrawListener {
    f(CoordinatorLayout this$0) {}
    
    public boolean onPreDraw() {
      this.b.L(0);
      return true;
    }
  }
  
  static class g implements Comparator<View> {
    public int a(View param1View1, View param1View2) {
      float f1 = w.P(param1View1);
      float f2 = w.P(param1View2);
      return (f1 > f2) ? -1 : ((f1 < f2) ? 1 : 0);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/coordinatorlayout/widget/CoordinatorLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */