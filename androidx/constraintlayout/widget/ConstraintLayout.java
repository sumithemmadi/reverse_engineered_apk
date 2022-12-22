package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.f;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
  SparseArray<View> b = new SparseArray();
  
  private ArrayList<ConstraintHelper> c = new ArrayList<ConstraintHelper>(4);
  
  protected d d = new d();
  
  private int e = 0;
  
  private int f = 0;
  
  private int g = Integer.MAX_VALUE;
  
  private int h = Integer.MAX_VALUE;
  
  protected boolean i = true;
  
  private int j = 257;
  
  private b k = null;
  
  protected a l = null;
  
  private int m = -1;
  
  private HashMap<String, Integer> n = new HashMap<String, Integer>();
  
  private int o = -1;
  
  private int p = -1;
  
  int q = -1;
  
  int r = -1;
  
  int s = 0;
  
  int t = 0;
  
  private SparseArray<ConstraintWidget> u = new SparseArray();
  
  b v = new b(this, this);
  
  private int w = 0;
  
  private int x = 0;
  
  public ConstraintLayout(Context paramContext) {
    super(paramContext);
    q(null, 0, 0);
  }
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    q(paramAttributeSet, 0, 0);
  }
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    q(paramAttributeSet, paramInt, 0);
  }
  
  private int getPaddingWidth() {
    int i = getPaddingLeft();
    int j = 0;
    i = Math.max(0, i) + Math.max(0, getPaddingRight());
    if (Build.VERSION.SDK_INT >= 17) {
      j = Math.max(0, getPaddingStart());
      j = Math.max(0, getPaddingEnd()) + j;
    } 
    if (j > 0)
      i = j; 
    return i;
  }
  
  private final ConstraintWidget n(int paramInt) {
    ConstraintWidget constraintWidget;
    if (paramInt == 0)
      return (ConstraintWidget)this.d; 
    View view1 = (View)this.b.get(paramInt);
    View view2 = view1;
    if (view1 == null) {
      view1 = findViewById(paramInt);
      view2 = view1;
      if (view1 != null) {
        view2 = view1;
        if (view1 != this) {
          view2 = view1;
          if (view1.getParent() == this) {
            onViewAdded(view1);
            view2 = view1;
          } 
        } 
      } 
    } 
    if (view2 == this)
      return (ConstraintWidget)this.d; 
    if (view2 == null) {
      view2 = null;
    } else {
      constraintWidget = ((LayoutParams)view2.getLayoutParams()).n0;
    } 
    return constraintWidget;
  }
  
  private void q(AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this.d.p0(this);
    this.d.I1(this.v);
    this.b.put(getId(), this);
    this.k = null;
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, e.ConstraintLayout_Layout, paramInt1, paramInt2);
      paramInt2 = typedArray.getIndexCount();
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
        int i = typedArray.getIndex(paramInt1);
        if (i == e.ConstraintLayout_Layout_android_minWidth) {
          this.e = typedArray.getDimensionPixelOffset(i, this.e);
        } else if (i == e.ConstraintLayout_Layout_android_minHeight) {
          this.f = typedArray.getDimensionPixelOffset(i, this.f);
        } else if (i == e.ConstraintLayout_Layout_android_maxWidth) {
          this.g = typedArray.getDimensionPixelOffset(i, this.g);
        } else if (i == e.ConstraintLayout_Layout_android_maxHeight) {
          this.h = typedArray.getDimensionPixelOffset(i, this.h);
        } else if (i == e.ConstraintLayout_Layout_layout_optimizationLevel) {
          this.j = typedArray.getInt(i, this.j);
        } else if (i == e.ConstraintLayout_Layout_layoutDescription) {
          i = typedArray.getResourceId(i, 0);
          if (i != 0)
            try {
              t(i);
            } catch (android.content.res.Resources.NotFoundException notFoundException) {
              this.l = null;
            }  
        } else if (i == e.ConstraintLayout_Layout_constraintSet) {
          i = typedArray.getResourceId(i, 0);
          try {
            b b1 = new b();
            this();
            this.k = b1;
            b1.w(getContext(), i);
          } catch (android.content.res.Resources.NotFoundException notFoundException) {
            this.k = null;
          } 
          this.m = i;
        } 
      } 
      typedArray.recycle();
    } 
    this.d.J1(this.j);
  }
  
  private void s() {
    this.i = true;
    this.o = -1;
    this.p = -1;
    this.q = -1;
    this.r = -1;
    this.s = 0;
    this.t = 0;
  }
  
  private void w() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual isInEditMode : ()Z
    //   4: istore_1
    //   5: aload_0
    //   6: invokevirtual getChildCount : ()I
    //   9: istore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: iload_3
    //   13: iload_2
    //   14: if_icmpge -> 47
    //   17: aload_0
    //   18: aload_0
    //   19: iload_3
    //   20: invokevirtual getChildAt : (I)Landroid/view/View;
    //   23: invokevirtual p : (Landroid/view/View;)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   26: astore #4
    //   28: aload #4
    //   30: ifnonnull -> 36
    //   33: goto -> 41
    //   36: aload #4
    //   38: invokevirtual k0 : ()V
    //   41: iinc #3, 1
    //   44: goto -> 12
    //   47: iload_1
    //   48: ifeq -> 144
    //   51: iconst_0
    //   52: istore_3
    //   53: iload_3
    //   54: iload_2
    //   55: if_icmpge -> 144
    //   58: aload_0
    //   59: iload_3
    //   60: invokevirtual getChildAt : (I)Landroid/view/View;
    //   63: astore #5
    //   65: aload_0
    //   66: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   69: aload #5
    //   71: invokevirtual getId : ()I
    //   74: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   77: astore #6
    //   79: aload_0
    //   80: iconst_0
    //   81: aload #6
    //   83: aload #5
    //   85: invokevirtual getId : ()I
    //   88: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   91: invokevirtual setDesignInformation : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   94: aload #6
    //   96: bipush #47
    //   98: invokevirtual indexOf : (I)I
    //   101: istore #7
    //   103: aload #6
    //   105: astore #4
    //   107: iload #7
    //   109: iconst_m1
    //   110: if_icmpeq -> 124
    //   113: aload #6
    //   115: iload #7
    //   117: iconst_1
    //   118: iadd
    //   119: invokevirtual substring : (I)Ljava/lang/String;
    //   122: astore #4
    //   124: aload_0
    //   125: aload #5
    //   127: invokevirtual getId : ()I
    //   130: invokespecial n : (I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   133: aload #4
    //   135: invokevirtual q0 : (Ljava/lang/String;)V
    //   138: iinc #3, 1
    //   141: goto -> 53
    //   144: aload_0
    //   145: getfield m : I
    //   148: iconst_m1
    //   149: if_icmpeq -> 204
    //   152: iconst_0
    //   153: istore_3
    //   154: iload_3
    //   155: iload_2
    //   156: if_icmpge -> 204
    //   159: aload_0
    //   160: iload_3
    //   161: invokevirtual getChildAt : (I)Landroid/view/View;
    //   164: astore #4
    //   166: aload #4
    //   168: invokevirtual getId : ()I
    //   171: aload_0
    //   172: getfield m : I
    //   175: if_icmpne -> 198
    //   178: aload #4
    //   180: instanceof androidx/constraintlayout/widget/Constraints
    //   183: ifeq -> 198
    //   186: aload_0
    //   187: aload #4
    //   189: checkcast androidx/constraintlayout/widget/Constraints
    //   192: invokevirtual getConstraintSet : ()Landroidx/constraintlayout/widget/b;
    //   195: putfield k : Landroidx/constraintlayout/widget/b;
    //   198: iinc #3, 1
    //   201: goto -> 154
    //   204: aload_0
    //   205: getfield k : Landroidx/constraintlayout/widget/b;
    //   208: astore #4
    //   210: aload #4
    //   212: ifnull -> 222
    //   215: aload #4
    //   217: aload_0
    //   218: iconst_1
    //   219: invokevirtual f : (Landroidx/constraintlayout/widget/ConstraintLayout;Z)V
    //   222: aload_0
    //   223: getfield d : Landroidx/constraintlayout/solver/widgets/d;
    //   226: invokevirtual h1 : ()V
    //   229: aload_0
    //   230: getfield c : Ljava/util/ArrayList;
    //   233: invokevirtual size : ()I
    //   236: istore #7
    //   238: iload #7
    //   240: ifle -> 272
    //   243: iconst_0
    //   244: istore_3
    //   245: iload_3
    //   246: iload #7
    //   248: if_icmpge -> 272
    //   251: aload_0
    //   252: getfield c : Ljava/util/ArrayList;
    //   255: iload_3
    //   256: invokevirtual get : (I)Ljava/lang/Object;
    //   259: checkcast androidx/constraintlayout/widget/ConstraintHelper
    //   262: aload_0
    //   263: invokevirtual u : (Landroidx/constraintlayout/widget/ConstraintLayout;)V
    //   266: iinc #3, 1
    //   269: goto -> 245
    //   272: iconst_0
    //   273: istore_3
    //   274: iload_3
    //   275: iload_2
    //   276: if_icmpge -> 309
    //   279: aload_0
    //   280: iload_3
    //   281: invokevirtual getChildAt : (I)Landroid/view/View;
    //   284: astore #4
    //   286: aload #4
    //   288: instanceof androidx/constraintlayout/widget/Placeholder
    //   291: ifeq -> 303
    //   294: aload #4
    //   296: checkcast androidx/constraintlayout/widget/Placeholder
    //   299: aload_0
    //   300: invokevirtual c : (Landroidx/constraintlayout/widget/ConstraintLayout;)V
    //   303: iinc #3, 1
    //   306: goto -> 274
    //   309: aload_0
    //   310: getfield u : Landroid/util/SparseArray;
    //   313: invokevirtual clear : ()V
    //   316: aload_0
    //   317: getfield u : Landroid/util/SparseArray;
    //   320: iconst_0
    //   321: aload_0
    //   322: getfield d : Landroidx/constraintlayout/solver/widgets/d;
    //   325: invokevirtual put : (ILjava/lang/Object;)V
    //   328: aload_0
    //   329: getfield u : Landroid/util/SparseArray;
    //   332: aload_0
    //   333: invokevirtual getId : ()I
    //   336: aload_0
    //   337: getfield d : Landroidx/constraintlayout/solver/widgets/d;
    //   340: invokevirtual put : (ILjava/lang/Object;)V
    //   343: iconst_0
    //   344: istore_3
    //   345: iload_3
    //   346: iload_2
    //   347: if_icmpge -> 385
    //   350: aload_0
    //   351: iload_3
    //   352: invokevirtual getChildAt : (I)Landroid/view/View;
    //   355: astore #6
    //   357: aload_0
    //   358: aload #6
    //   360: invokevirtual p : (Landroid/view/View;)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   363: astore #4
    //   365: aload_0
    //   366: getfield u : Landroid/util/SparseArray;
    //   369: aload #6
    //   371: invokevirtual getId : ()I
    //   374: aload #4
    //   376: invokevirtual put : (ILjava/lang/Object;)V
    //   379: iinc #3, 1
    //   382: goto -> 345
    //   385: iconst_0
    //   386: istore_3
    //   387: iload_3
    //   388: iload_2
    //   389: if_icmpge -> 455
    //   392: aload_0
    //   393: iload_3
    //   394: invokevirtual getChildAt : (I)Landroid/view/View;
    //   397: astore #6
    //   399: aload_0
    //   400: aload #6
    //   402: invokevirtual p : (Landroid/view/View;)Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   405: astore #5
    //   407: aload #5
    //   409: ifnonnull -> 415
    //   412: goto -> 449
    //   415: aload #6
    //   417: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   420: checkcast androidx/constraintlayout/widget/ConstraintLayout$LayoutParams
    //   423: astore #4
    //   425: aload_0
    //   426: getfield d : Landroidx/constraintlayout/solver/widgets/d;
    //   429: aload #5
    //   431: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)V
    //   434: aload_0
    //   435: iload_1
    //   436: aload #6
    //   438: aload #5
    //   440: aload #4
    //   442: aload_0
    //   443: getfield u : Landroid/util/SparseArray;
    //   446: invokevirtual d : (ZLandroid/view/View;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V
    //   449: iinc #3, 1
    //   452: goto -> 387
    //   455: return
    //   456: astore #4
    //   458: goto -> 138
    // Exception table:
    //   from	to	target	type
    //   65	103	456	android/content/res/Resources$NotFoundException
    //   113	124	456	android/content/res/Resources$NotFoundException
    //   124	138	456	android/content/res/Resources$NotFoundException
  }
  
  private boolean y() {
    boolean bool2;
    int i = getChildCount();
    boolean bool1 = false;
    byte b1 = 0;
    while (true) {
      bool2 = bool1;
      if (b1 < i) {
        if (getChildAt(b1).isLayoutRequested()) {
          bool2 = true;
          break;
        } 
        b1++;
        continue;
      } 
      break;
    } 
    if (bool2)
      w(); 
    return bool2;
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    super.addView(paramView, paramInt, paramLayoutParams);
    if (Build.VERSION.SDK_INT < 14)
      onViewAdded(paramView); 
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  protected void d(boolean paramBoolean, View paramView, ConstraintWidget paramConstraintWidget, LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray) {
    // Byte code:
    //   0: aload #4
    //   2: invokevirtual c : ()V
    //   5: aload #4
    //   7: iconst_0
    //   8: putfield o0 : Z
    //   11: aload_3
    //   12: aload_2
    //   13: invokevirtual getVisibility : ()I
    //   16: invokevirtual X0 : (I)V
    //   19: aload #4
    //   21: getfield b0 : Z
    //   24: ifeq -> 38
    //   27: aload_3
    //   28: iconst_1
    //   29: invokevirtual H0 : (Z)V
    //   32: aload_3
    //   33: bipush #8
    //   35: invokevirtual X0 : (I)V
    //   38: aload_3
    //   39: aload_2
    //   40: invokevirtual p0 : (Ljava/lang/Object;)V
    //   43: aload_2
    //   44: instanceof androidx/constraintlayout/widget/ConstraintHelper
    //   47: ifeq -> 65
    //   50: aload_2
    //   51: checkcast androidx/constraintlayout/widget/ConstraintHelper
    //   54: aload_3
    //   55: aload_0
    //   56: getfield d : Landroidx/constraintlayout/solver/widgets/d;
    //   59: invokevirtual C1 : ()Z
    //   62: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Z)V
    //   65: aload #4
    //   67: getfield Z : Z
    //   70: ifeq -> 176
    //   73: aload_3
    //   74: checkcast androidx/constraintlayout/solver/widgets/f
    //   77: astore_2
    //   78: aload #4
    //   80: getfield k0 : I
    //   83: istore #6
    //   85: aload #4
    //   87: getfield l0 : I
    //   90: istore #7
    //   92: aload #4
    //   94: getfield m0 : F
    //   97: fstore #8
    //   99: getstatic android/os/Build$VERSION.SDK_INT : I
    //   102: bipush #17
    //   104: if_icmpge -> 128
    //   107: aload #4
    //   109: getfield a : I
    //   112: istore #6
    //   114: aload #4
    //   116: getfield b : I
    //   119: istore #7
    //   121: aload #4
    //   123: getfield c : F
    //   126: fstore #8
    //   128: fload #8
    //   130: ldc_w -1.0
    //   133: fcmpl
    //   134: ifeq -> 146
    //   137: aload_2
    //   138: fload #8
    //   140: invokevirtual m1 : (F)V
    //   143: goto -> 1425
    //   146: iload #6
    //   148: iconst_m1
    //   149: if_icmpeq -> 161
    //   152: aload_2
    //   153: iload #6
    //   155: invokevirtual k1 : (I)V
    //   158: goto -> 1425
    //   161: iload #7
    //   163: iconst_m1
    //   164: if_icmpeq -> 1425
    //   167: aload_2
    //   168: iload #7
    //   170: invokevirtual l1 : (I)V
    //   173: goto -> 1425
    //   176: aload #4
    //   178: getfield d0 : I
    //   181: istore #7
    //   183: aload #4
    //   185: getfield e0 : I
    //   188: istore #6
    //   190: aload #4
    //   192: getfield f0 : I
    //   195: istore #9
    //   197: aload #4
    //   199: getfield g0 : I
    //   202: istore #10
    //   204: aload #4
    //   206: getfield h0 : I
    //   209: istore #11
    //   211: aload #4
    //   213: getfield i0 : I
    //   216: istore #12
    //   218: aload #4
    //   220: getfield j0 : F
    //   223: fstore #8
    //   225: getstatic android/os/Build$VERSION.SDK_INT : I
    //   228: bipush #17
    //   230: if_icmpge -> 442
    //   233: aload #4
    //   235: getfield d : I
    //   238: istore #13
    //   240: aload #4
    //   242: getfield e : I
    //   245: istore #9
    //   247: aload #4
    //   249: getfield f : I
    //   252: istore #11
    //   254: aload #4
    //   256: getfield g : I
    //   259: istore #14
    //   261: aload #4
    //   263: getfield t : I
    //   266: istore #12
    //   268: aload #4
    //   270: getfield v : I
    //   273: istore #10
    //   275: aload #4
    //   277: getfield z : F
    //   280: fstore #8
    //   282: iload #13
    //   284: istore #7
    //   286: iload #9
    //   288: istore #6
    //   290: iload #13
    //   292: iconst_m1
    //   293: if_icmpne -> 359
    //   296: iload #13
    //   298: istore #7
    //   300: iload #9
    //   302: istore #6
    //   304: iload #9
    //   306: iconst_m1
    //   307: if_icmpne -> 359
    //   310: aload #4
    //   312: getfield q : I
    //   315: istore #7
    //   317: iload #7
    //   319: iconst_m1
    //   320: if_icmpeq -> 330
    //   323: iload #9
    //   325: istore #6
    //   327: goto -> 359
    //   330: aload #4
    //   332: getfield p : I
    //   335: istore #15
    //   337: iload #13
    //   339: istore #7
    //   341: iload #9
    //   343: istore #6
    //   345: iload #15
    //   347: iconst_m1
    //   348: if_icmpeq -> 359
    //   351: iload #15
    //   353: istore #6
    //   355: iload #13
    //   357: istore #7
    //   359: iload #11
    //   361: iconst_m1
    //   362: if_icmpne -> 419
    //   365: iload #14
    //   367: iconst_m1
    //   368: if_icmpne -> 419
    //   371: aload #4
    //   373: getfield r : I
    //   376: istore #9
    //   378: iload #9
    //   380: iconst_m1
    //   381: if_icmpeq -> 387
    //   384: goto -> 423
    //   387: aload #4
    //   389: getfield s : I
    //   392: istore #9
    //   394: iload #9
    //   396: iconst_m1
    //   397: if_icmpeq -> 419
    //   400: iload #11
    //   402: istore #14
    //   404: iload #12
    //   406: istore #11
    //   408: iload #9
    //   410: istore #13
    //   412: iload #10
    //   414: istore #12
    //   416: goto -> 450
    //   419: iload #11
    //   421: istore #9
    //   423: iload #10
    //   425: istore #13
    //   427: iload #12
    //   429: istore #11
    //   431: iload #14
    //   433: istore #10
    //   435: iload #13
    //   437: istore #12
    //   439: goto -> 442
    //   442: iload #10
    //   444: istore #13
    //   446: iload #9
    //   448: istore #14
    //   450: aload #4
    //   452: getfield m : I
    //   455: istore #9
    //   457: iload #9
    //   459: iconst_m1
    //   460: if_icmpeq -> 496
    //   463: aload #5
    //   465: iload #9
    //   467: invokevirtual get : (I)Ljava/lang/Object;
    //   470: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   473: astore_2
    //   474: aload_2
    //   475: ifnull -> 1049
    //   478: aload_3
    //   479: aload_2
    //   480: aload #4
    //   482: getfield o : F
    //   485: aload #4
    //   487: getfield n : I
    //   490: invokevirtual l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;FI)V
    //   493: goto -> 1049
    //   496: iload #7
    //   498: iconst_m1
    //   499: if_icmpeq -> 544
    //   502: aload #5
    //   504: iload #7
    //   506: invokevirtual get : (I)Ljava/lang/Object;
    //   509: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   512: astore_2
    //   513: aload_2
    //   514: ifnull -> 541
    //   517: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   520: astore #16
    //   522: aload_3
    //   523: aload #16
    //   525: aload_2
    //   526: aload #16
    //   528: aload #4
    //   530: getfield leftMargin : I
    //   533: iload #11
    //   535: invokevirtual a0 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
    //   538: goto -> 583
    //   541: goto -> 583
    //   544: iload #6
    //   546: iconst_m1
    //   547: if_icmpeq -> 583
    //   550: aload #5
    //   552: iload #6
    //   554: invokevirtual get : (I)Ljava/lang/Object;
    //   557: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   560: astore_2
    //   561: aload_2
    //   562: ifnull -> 583
    //   565: aload_3
    //   566: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   569: aload_2
    //   570: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   573: aload #4
    //   575: getfield leftMargin : I
    //   578: iload #11
    //   580: invokevirtual a0 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
    //   583: iload #14
    //   585: iconst_m1
    //   586: if_icmpeq -> 625
    //   589: aload #5
    //   591: iload #14
    //   593: invokevirtual get : (I)Ljava/lang/Object;
    //   596: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   599: astore_2
    //   600: aload_2
    //   601: ifnull -> 667
    //   604: aload_3
    //   605: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   608: aload_2
    //   609: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   612: aload #4
    //   614: getfield rightMargin : I
    //   617: iload #12
    //   619: invokevirtual a0 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
    //   622: goto -> 667
    //   625: iload #13
    //   627: iconst_m1
    //   628: if_icmpeq -> 667
    //   631: aload #5
    //   633: iload #13
    //   635: invokevirtual get : (I)Ljava/lang/Object;
    //   638: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   641: astore_2
    //   642: aload_2
    //   643: ifnull -> 667
    //   646: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   649: astore #16
    //   651: aload_3
    //   652: aload #16
    //   654: aload_2
    //   655: aload #16
    //   657: aload #4
    //   659: getfield rightMargin : I
    //   662: iload #12
    //   664: invokevirtual a0 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
    //   667: aload #4
    //   669: getfield h : I
    //   672: istore #7
    //   674: iload #7
    //   676: iconst_m1
    //   677: if_icmpeq -> 722
    //   680: aload #5
    //   682: iload #7
    //   684: invokevirtual get : (I)Ljava/lang/Object;
    //   687: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   690: astore_2
    //   691: aload_2
    //   692: ifnull -> 771
    //   695: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   698: astore #16
    //   700: aload_3
    //   701: aload #16
    //   703: aload_2
    //   704: aload #16
    //   706: aload #4
    //   708: getfield topMargin : I
    //   711: aload #4
    //   713: getfield u : I
    //   716: invokevirtual a0 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
    //   719: goto -> 771
    //   722: aload #4
    //   724: getfield i : I
    //   727: istore #7
    //   729: iload #7
    //   731: iconst_m1
    //   732: if_icmpeq -> 771
    //   735: aload #5
    //   737: iload #7
    //   739: invokevirtual get : (I)Ljava/lang/Object;
    //   742: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   745: astore_2
    //   746: aload_2
    //   747: ifnull -> 771
    //   750: aload_3
    //   751: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   754: aload_2
    //   755: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   758: aload #4
    //   760: getfield topMargin : I
    //   763: aload #4
    //   765: getfield u : I
    //   768: invokevirtual a0 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
    //   771: aload #4
    //   773: getfield j : I
    //   776: istore #7
    //   778: iload #7
    //   780: iconst_m1
    //   781: if_icmpeq -> 823
    //   784: aload #5
    //   786: iload #7
    //   788: invokevirtual get : (I)Ljava/lang/Object;
    //   791: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   794: astore_2
    //   795: aload_2
    //   796: ifnull -> 875
    //   799: aload_3
    //   800: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   803: aload_2
    //   804: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   807: aload #4
    //   809: getfield bottomMargin : I
    //   812: aload #4
    //   814: getfield w : I
    //   817: invokevirtual a0 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
    //   820: goto -> 875
    //   823: aload #4
    //   825: getfield k : I
    //   828: istore #7
    //   830: iload #7
    //   832: iconst_m1
    //   833: if_icmpeq -> 875
    //   836: aload #5
    //   838: iload #7
    //   840: invokevirtual get : (I)Ljava/lang/Object;
    //   843: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   846: astore #16
    //   848: aload #16
    //   850: ifnull -> 875
    //   853: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   856: astore_2
    //   857: aload_3
    //   858: aload_2
    //   859: aload #16
    //   861: aload_2
    //   862: aload #4
    //   864: getfield bottomMargin : I
    //   867: aload #4
    //   869: getfield w : I
    //   872: invokevirtual a0 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;II)V
    //   875: aload #4
    //   877: getfield l : I
    //   880: istore #7
    //   882: iload #7
    //   884: iconst_m1
    //   885: if_icmpeq -> 1016
    //   888: aload_0
    //   889: getfield b : Landroid/util/SparseArray;
    //   892: iload #7
    //   894: invokevirtual get : (I)Ljava/lang/Object;
    //   897: checkcast android/view/View
    //   900: astore #16
    //   902: aload #5
    //   904: aload #4
    //   906: getfield l : I
    //   909: invokevirtual get : (I)Ljava/lang/Object;
    //   912: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   915: astore_2
    //   916: aload_2
    //   917: ifnull -> 1016
    //   920: aload #16
    //   922: ifnull -> 1016
    //   925: aload #16
    //   927: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   930: instanceof androidx/constraintlayout/widget/ConstraintLayout$LayoutParams
    //   933: ifeq -> 1016
    //   936: aload #16
    //   938: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   941: checkcast androidx/constraintlayout/widget/ConstraintLayout$LayoutParams
    //   944: astore #5
    //   946: aload #4
    //   948: iconst_1
    //   949: putfield Y : Z
    //   952: aload #5
    //   954: iconst_1
    //   955: putfield Y : Z
    //   958: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.g : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   961: astore #16
    //   963: aload_3
    //   964: aload #16
    //   966: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   969: aload_2
    //   970: aload #16
    //   972: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   975: iconst_0
    //   976: iconst_m1
    //   977: iconst_1
    //   978: invokevirtual b : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;IIZ)Z
    //   981: pop
    //   982: aload_3
    //   983: iconst_1
    //   984: invokevirtual y0 : (Z)V
    //   987: aload #5
    //   989: getfield n0 : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   992: iconst_1
    //   993: invokevirtual y0 : (Z)V
    //   996: aload_3
    //   997: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   1000: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1003: invokevirtual q : ()V
    //   1006: aload_3
    //   1007: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   1010: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1013: invokevirtual q : ()V
    //   1016: fload #8
    //   1018: fconst_0
    //   1019: fcmpl
    //   1020: iflt -> 1029
    //   1023: aload_3
    //   1024: fload #8
    //   1026: invokevirtual A0 : (F)V
    //   1029: aload #4
    //   1031: getfield A : F
    //   1034: fstore #8
    //   1036: fload #8
    //   1038: fconst_0
    //   1039: fcmpl
    //   1040: iflt -> 1049
    //   1043: aload_3
    //   1044: fload #8
    //   1046: invokevirtual R0 : (F)V
    //   1049: iload_1
    //   1050: ifeq -> 1086
    //   1053: aload #4
    //   1055: getfield Q : I
    //   1058: istore #7
    //   1060: iload #7
    //   1062: iconst_m1
    //   1063: if_icmpne -> 1075
    //   1066: aload #4
    //   1068: getfield R : I
    //   1071: iconst_m1
    //   1072: if_icmpeq -> 1086
    //   1075: aload_3
    //   1076: iload #7
    //   1078: aload #4
    //   1080: getfield R : I
    //   1083: invokevirtual P0 : (II)V
    //   1086: aload #4
    //   1088: getfield W : Z
    //   1091: ifne -> 1176
    //   1094: aload #4
    //   1096: getfield width : I
    //   1099: iconst_m1
    //   1100: if_icmpne -> 1161
    //   1103: aload #4
    //   1105: getfield T : Z
    //   1108: ifeq -> 1121
    //   1111: aload_3
    //   1112: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1115: invokevirtual D0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1118: goto -> 1128
    //   1121: aload_3
    //   1122: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.e : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1125: invokevirtual D0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1128: aload_3
    //   1129: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   1132: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1135: aload #4
    //   1137: getfield leftMargin : I
    //   1140: putfield g : I
    //   1143: aload_3
    //   1144: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   1147: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1150: aload #4
    //   1152: getfield rightMargin : I
    //   1155: putfield g : I
    //   1158: goto -> 1209
    //   1161: aload_3
    //   1162: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1165: invokevirtual D0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1168: aload_3
    //   1169: iconst_0
    //   1170: invokevirtual Y0 : (I)V
    //   1173: goto -> 1209
    //   1176: aload_3
    //   1177: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1180: invokevirtual D0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1183: aload_3
    //   1184: aload #4
    //   1186: getfield width : I
    //   1189: invokevirtual Y0 : (I)V
    //   1192: aload #4
    //   1194: getfield width : I
    //   1197: bipush #-2
    //   1199: if_icmpne -> 1209
    //   1202: aload_3
    //   1203: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1206: invokevirtual D0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1209: aload #4
    //   1211: getfield X : Z
    //   1214: ifne -> 1299
    //   1217: aload #4
    //   1219: getfield height : I
    //   1222: iconst_m1
    //   1223: if_icmpne -> 1284
    //   1226: aload #4
    //   1228: getfield U : Z
    //   1231: ifeq -> 1244
    //   1234: aload_3
    //   1235: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1238: invokevirtual U0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1241: goto -> 1251
    //   1244: aload_3
    //   1245: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.e : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1248: invokevirtual U0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1251: aload_3
    //   1252: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   1255: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1258: aload #4
    //   1260: getfield topMargin : I
    //   1263: putfield g : I
    //   1266: aload_3
    //   1267: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   1270: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1273: aload #4
    //   1275: getfield bottomMargin : I
    //   1278: putfield g : I
    //   1281: goto -> 1332
    //   1284: aload_3
    //   1285: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1288: invokevirtual U0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1291: aload_3
    //   1292: iconst_0
    //   1293: invokevirtual z0 : (I)V
    //   1296: goto -> 1332
    //   1299: aload_3
    //   1300: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1303: invokevirtual U0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1306: aload_3
    //   1307: aload #4
    //   1309: getfield height : I
    //   1312: invokevirtual z0 : (I)V
    //   1315: aload #4
    //   1317: getfield height : I
    //   1320: bipush #-2
    //   1322: if_icmpne -> 1332
    //   1325: aload_3
    //   1326: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1329: invokevirtual U0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1332: aload_3
    //   1333: aload #4
    //   1335: getfield B : Ljava/lang/String;
    //   1338: invokevirtual r0 : (Ljava/lang/String;)V
    //   1341: aload_3
    //   1342: aload #4
    //   1344: getfield E : F
    //   1347: invokevirtual F0 : (F)V
    //   1350: aload_3
    //   1351: aload #4
    //   1353: getfield F : F
    //   1356: invokevirtual W0 : (F)V
    //   1359: aload_3
    //   1360: aload #4
    //   1362: getfield G : I
    //   1365: invokevirtual B0 : (I)V
    //   1368: aload_3
    //   1369: aload #4
    //   1371: getfield H : I
    //   1374: invokevirtual S0 : (I)V
    //   1377: aload_3
    //   1378: aload #4
    //   1380: getfield I : I
    //   1383: aload #4
    //   1385: getfield K : I
    //   1388: aload #4
    //   1390: getfield M : I
    //   1393: aload #4
    //   1395: getfield O : F
    //   1398: invokevirtual E0 : (IIIF)V
    //   1401: aload_3
    //   1402: aload #4
    //   1404: getfield J : I
    //   1407: aload #4
    //   1409: getfield L : I
    //   1412: aload #4
    //   1414: getfield N : I
    //   1417: aload #4
    //   1419: getfield P : F
    //   1422: invokevirtual V0 : (IIIF)V
    //   1425: return
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    ArrayList<ConstraintHelper> arrayList = this.c;
    if (arrayList != null) {
      int i = arrayList.size();
      if (i > 0)
        for (byte b1 = 0; b1 < i; b1++)
          ((ConstraintHelper)this.c.get(b1)).s(this);  
    } 
    super.dispatchDraw(paramCanvas);
    if (isInEditMode()) {
      int i = getChildCount();
      float f1 = getWidth();
      float f2 = getHeight();
      for (byte b1 = 0; b1 < i; b1++) {
        View view = getChildAt(b1);
        if (view.getVisibility() != 8) {
          Object object = view.getTag();
          if (object != null && object instanceof String) {
            object = ((String)object).split(",");
            if (object.length == 4) {
              int j = Integer.parseInt((String)object[0]);
              int k = Integer.parseInt((String)object[1]);
              int m = Integer.parseInt((String)object[2]);
              int n = Integer.parseInt((String)object[3]);
              j = (int)(j / 1080.0F * f1);
              k = (int)(k / 1920.0F * f2);
              m = (int)(m / 1080.0F * f1);
              n = (int)(n / 1920.0F * f2);
              object = new Paint();
              object.setColor(-65536);
              float f3 = j;
              float f4 = k;
              float f5 = (j + m);
              paramCanvas.drawLine(f3, f4, f5, f4, (Paint)object);
              float f6 = (k + n);
              paramCanvas.drawLine(f5, f4, f5, f6, (Paint)object);
              paramCanvas.drawLine(f5, f6, f3, f6, (Paint)object);
              paramCanvas.drawLine(f3, f6, f3, f4, (Paint)object);
              object.setColor(-16711936);
              paramCanvas.drawLine(f3, f4, f5, f6, (Paint)object);
              paramCanvas.drawLine(f3, f6, f5, f4, (Paint)object);
            } 
          } 
        } 
      } 
    } 
  }
  
  protected LayoutParams e() {
    return new LayoutParams(-2, -2);
  }
  
  public LayoutParams f(AttributeSet paramAttributeSet) {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  public void forceLayout() {
    s();
    super.forceLayout();
  }
  
  public Object g(int paramInt, Object paramObject) {
    if (paramInt == 0 && paramObject instanceof String) {
      paramObject = paramObject;
      HashMap<String, Integer> hashMap = this.n;
      if (hashMap != null && hashMap.containsKey(paramObject))
        return this.n.get(paramObject); 
    } 
    return null;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new LayoutParams(paramLayoutParams);
  }
  
  public int getMaxHeight() {
    return this.h;
  }
  
  public int getMaxWidth() {
    return this.g;
  }
  
  public int getMinHeight() {
    return this.f;
  }
  
  public int getMinWidth() {
    return this.e;
  }
  
  public int getOptimizationLevel() {
    return this.d.w1();
  }
  
  public View o(int paramInt) {
    return (View)this.b.get(paramInt);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt3 = getChildCount();
    paramBoolean = isInEditMode();
    paramInt2 = 0;
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++) {
      View view = getChildAt(paramInt1);
      LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
      ConstraintWidget constraintWidget = layoutParams.n0;
      if ((view.getVisibility() != 8 || layoutParams.Z || layoutParams.a0 || layoutParams.c0 || paramBoolean) && !layoutParams.b0) {
        int i = constraintWidget.V();
        paramInt4 = constraintWidget.W();
        int j = constraintWidget.U() + i;
        int k = constraintWidget.y() + paramInt4;
        view.layout(i, paramInt4, j, k);
        if (view instanceof Placeholder) {
          view = ((Placeholder)view).getContent();
          if (view != null) {
            view.setVisibility(0);
            view.layout(i, paramInt4, j, k);
          } 
        } 
      } 
    } 
    paramInt3 = this.c.size();
    if (paramInt3 > 0)
      for (paramInt1 = paramInt2; paramInt1 < paramInt3; paramInt1++)
        ((ConstraintHelper)this.c.get(paramInt1)).q(this);  
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (!this.i) {
      int i = getChildCount();
      for (byte b1 = 0; b1 < i; b1++) {
        if (getChildAt(b1).isLayoutRequested()) {
          this.i = true;
          break;
        } 
      } 
    } 
    if (!this.i) {
      int i = this.w;
      if (i == paramInt1 && this.x == paramInt2) {
        u(paramInt1, paramInt2, this.d.U(), this.d.y(), this.d.D1(), this.d.B1());
        return;
      } 
      if (i == paramInt1 && View.MeasureSpec.getMode(paramInt1) == 1073741824 && View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.x) == Integer.MIN_VALUE && View.MeasureSpec.getSize(paramInt2) >= this.d.y()) {
        this.w = paramInt1;
        this.x = paramInt2;
        u(paramInt1, paramInt2, this.d.U(), this.d.y(), this.d.D1(), this.d.B1());
        return;
      } 
    } 
    this.w = paramInt1;
    this.x = paramInt2;
    this.d.K1(r());
    if (this.i) {
      this.i = false;
      if (y())
        this.d.M1(); 
    } 
    v(this.d, this.j, paramInt1, paramInt2);
    u(paramInt1, paramInt2, this.d.U(), this.d.y(), this.d.D1(), this.d.B1());
  }
  
  public void onViewAdded(View paramView) {
    if (Build.VERSION.SDK_INT >= 14)
      super.onViewAdded(paramView); 
    ConstraintWidget constraintWidget = p(paramView);
    if (paramView instanceof Guideline && !(constraintWidget instanceof f)) {
      LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
      f f = new f();
      layoutParams.n0 = (ConstraintWidget)f;
      layoutParams.Z = true;
      f.n1(layoutParams.S);
    } 
    if (paramView instanceof ConstraintHelper) {
      ConstraintHelper constraintHelper = (ConstraintHelper)paramView;
      constraintHelper.v();
      ((LayoutParams)paramView.getLayoutParams()).a0 = true;
      if (!this.c.contains(constraintHelper))
        this.c.add(constraintHelper); 
    } 
    this.b.put(paramView.getId(), paramView);
    this.i = true;
  }
  
  public void onViewRemoved(View paramView) {
    if (Build.VERSION.SDK_INT >= 14)
      super.onViewRemoved(paramView); 
    this.b.remove(paramView.getId());
    ConstraintWidget constraintWidget = p(paramView);
    this.d.g1(constraintWidget);
    this.c.remove(paramView);
    this.i = true;
  }
  
  public final ConstraintWidget p(View paramView) {
    ConstraintWidget constraintWidget;
    if (paramView == this)
      return (ConstraintWidget)this.d; 
    if (paramView == null) {
      paramView = null;
    } else {
      constraintWidget = ((LayoutParams)paramView.getLayoutParams()).n0;
    } 
    return constraintWidget;
  }
  
  protected boolean r() {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i >= 17) {
      if (((getContext().getApplicationInfo()).flags & 0x400000) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      bool2 = bool1;
      if (i != 0) {
        bool2 = bool1;
        if (1 == getLayoutDirection())
          bool2 = true; 
      } 
    } 
    return bool2;
  }
  
  public void removeView(View paramView) {
    super.removeView(paramView);
    if (Build.VERSION.SDK_INT < 14)
      onViewRemoved(paramView); 
  }
  
  public void requestLayout() {
    s();
    super.requestLayout();
  }
  
  public void setConstraintSet(b paramb) {
    this.k = paramb;
  }
  
  public void setDesignInformation(int paramInt, Object paramObject1, Object paramObject2) {
    if (paramInt == 0 && paramObject1 instanceof String && paramObject2 instanceof Integer) {
      if (this.n == null)
        this.n = new HashMap<String, Integer>(); 
      String str = (String)paramObject1;
      paramInt = str.indexOf("/");
      paramObject1 = str;
      if (paramInt != -1)
        paramObject1 = str.substring(paramInt + 1); 
      paramInt = ((Integer)paramObject2).intValue();
      this.n.put(paramObject1, Integer.valueOf(paramInt));
    } 
  }
  
  public void setId(int paramInt) {
    this.b.remove(getId());
    super.setId(paramInt);
    this.b.put(getId(), this);
  }
  
  public void setMaxHeight(int paramInt) {
    if (paramInt == this.h)
      return; 
    this.h = paramInt;
    requestLayout();
  }
  
  public void setMaxWidth(int paramInt) {
    if (paramInt == this.g)
      return; 
    this.g = paramInt;
    requestLayout();
  }
  
  public void setMinHeight(int paramInt) {
    if (paramInt == this.f)
      return; 
    this.f = paramInt;
    requestLayout();
  }
  
  public void setMinWidth(int paramInt) {
    if (paramInt == this.e)
      return; 
    this.e = paramInt;
    requestLayout();
  }
  
  public void setOnConstraintsChanged(c paramc) {
    a a1 = this.l;
    if (a1 != null)
      a1.c(paramc); 
  }
  
  public void setOptimizationLevel(int paramInt) {
    this.j = paramInt;
    this.d.J1(paramInt);
  }
  
  public void setState(int paramInt1, int paramInt2, int paramInt3) {
    a a1 = this.l;
    if (a1 != null)
      a1.d(paramInt1, paramInt2, paramInt3); 
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  protected void t(int paramInt) {
    this.l = new a(getContext(), this, paramInt);
  }
  
  protected void u(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2) {
    b b1 = this.v;
    int i = b1.e;
    paramInt3 += b1.d;
    paramInt4 += i;
    if (Build.VERSION.SDK_INT >= 11) {
      paramInt1 = ViewGroup.resolveSizeAndState(paramInt3, paramInt1, 0);
      paramInt3 = ViewGroup.resolveSizeAndState(paramInt4, paramInt2, 0);
      paramInt2 = Math.min(this.g, paramInt1 & 0xFFFFFF);
      paramInt3 = Math.min(this.h, paramInt3 & 0xFFFFFF);
      paramInt1 = paramInt2;
      if (paramBoolean1)
        paramInt1 = paramInt2 | 0x1000000; 
      paramInt2 = paramInt3;
      if (paramBoolean2)
        paramInt2 = paramInt3 | 0x1000000; 
      setMeasuredDimension(paramInt1, paramInt2);
      this.o = paramInt1;
      this.p = paramInt2;
    } else {
      setMeasuredDimension(paramInt3, paramInt4);
      this.o = paramInt3;
      this.p = paramInt4;
    } 
  }
  
  protected void v(d paramd, int paramInt1, int paramInt2, int paramInt3) {
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    int k = View.MeasureSpec.getMode(paramInt3);
    int m = View.MeasureSpec.getSize(paramInt3);
    int n = Math.max(0, getPaddingTop());
    int i1 = Math.max(0, getPaddingBottom());
    int i2 = n + i1;
    int i3 = getPaddingWidth();
    this.v.c(paramInt2, paramInt3, n, i1, i3, i2);
    if (Build.VERSION.SDK_INT >= 17) {
      paramInt2 = Math.max(0, getPaddingStart());
      paramInt3 = Math.max(0, getPaddingEnd());
      if (paramInt2 > 0 || paramInt3 > 0) {
        if (r())
          paramInt2 = paramInt3; 
      } else {
        paramInt2 = Math.max(0, getPaddingLeft());
      } 
    } else {
      paramInt2 = Math.max(0, getPaddingLeft());
    } 
    paramInt3 = j - i3;
    i2 = m - i2;
    x(paramd, i, paramInt3, k, i2);
    paramd.E1(paramInt1, i, paramInt3, k, i2, this.o, this.p, paramInt2, n);
  }
  
  protected void x(d paramd, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield v : Landroidx/constraintlayout/widget/ConstraintLayout$b;
    //   4: astore #6
    //   6: aload #6
    //   8: getfield e : I
    //   11: istore #7
    //   13: aload #6
    //   15: getfield d : I
    //   18: istore #8
    //   20: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   23: astore #6
    //   25: aload_0
    //   26: invokevirtual getChildCount : ()I
    //   29: istore #9
    //   31: iload_2
    //   32: ldc_w -2147483648
    //   35: if_icmpeq -> 107
    //   38: iload_2
    //   39: ifeq -> 77
    //   42: iload_2
    //   43: ldc_w 1073741824
    //   46: if_icmpeq -> 58
    //   49: aload #6
    //   51: astore #10
    //   53: iconst_0
    //   54: istore_3
    //   55: goto -> 134
    //   58: aload_0
    //   59: getfield g : I
    //   62: iload #8
    //   64: isub
    //   65: iload_3
    //   66: invokestatic min : (II)I
    //   69: istore_3
    //   70: aload #6
    //   72: astore #10
    //   74: goto -> 134
    //   77: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   80: astore #11
    //   82: aload #11
    //   84: astore #10
    //   86: iload #9
    //   88: ifne -> 53
    //   91: iconst_0
    //   92: aload_0
    //   93: getfield e : I
    //   96: invokestatic max : (II)I
    //   99: istore_3
    //   100: aload #11
    //   102: astore #10
    //   104: goto -> 134
    //   107: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   110: astore #11
    //   112: aload #11
    //   114: astore #10
    //   116: iload #9
    //   118: ifne -> 134
    //   121: iconst_0
    //   122: aload_0
    //   123: getfield e : I
    //   126: invokestatic max : (II)I
    //   129: istore_3
    //   130: aload #11
    //   132: astore #10
    //   134: iload #4
    //   136: ldc_w -2147483648
    //   139: if_icmpeq -> 209
    //   142: iload #4
    //   144: ifeq -> 178
    //   147: iload #4
    //   149: ldc_w 1073741824
    //   152: if_icmpeq -> 161
    //   155: iconst_0
    //   156: istore #5
    //   158: goto -> 237
    //   161: aload_0
    //   162: getfield h : I
    //   165: iload #7
    //   167: isub
    //   168: iload #5
    //   170: invokestatic min : (II)I
    //   173: istore #5
    //   175: goto -> 237
    //   178: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   181: astore #11
    //   183: aload #11
    //   185: astore #6
    //   187: iload #9
    //   189: ifne -> 155
    //   192: iconst_0
    //   193: aload_0
    //   194: getfield f : I
    //   197: invokestatic max : (II)I
    //   200: istore #5
    //   202: aload #11
    //   204: astore #6
    //   206: goto -> 237
    //   209: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   212: astore #11
    //   214: aload #11
    //   216: astore #6
    //   218: iload #9
    //   220: ifne -> 237
    //   223: iconst_0
    //   224: aload_0
    //   225: getfield f : I
    //   228: invokestatic max : (II)I
    //   231: istore #5
    //   233: aload #11
    //   235: astore #6
    //   237: iload_3
    //   238: aload_1
    //   239: invokevirtual U : ()I
    //   242: if_icmpne -> 254
    //   245: iload #5
    //   247: aload_1
    //   248: invokevirtual y : ()I
    //   251: if_icmpeq -> 258
    //   254: aload_1
    //   255: invokevirtual A1 : ()V
    //   258: aload_1
    //   259: iconst_0
    //   260: invokevirtual Z0 : (I)V
    //   263: aload_1
    //   264: iconst_0
    //   265: invokevirtual a1 : (I)V
    //   268: aload_1
    //   269: aload_0
    //   270: getfield g : I
    //   273: iload #8
    //   275: isub
    //   276: invokevirtual L0 : (I)V
    //   279: aload_1
    //   280: aload_0
    //   281: getfield h : I
    //   284: iload #7
    //   286: isub
    //   287: invokevirtual K0 : (I)V
    //   290: aload_1
    //   291: iconst_0
    //   292: invokevirtual O0 : (I)V
    //   295: aload_1
    //   296: iconst_0
    //   297: invokevirtual N0 : (I)V
    //   300: aload_1
    //   301: aload #10
    //   303: invokevirtual D0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   306: aload_1
    //   307: iload_3
    //   308: invokevirtual Y0 : (I)V
    //   311: aload_1
    //   312: aload #6
    //   314: invokevirtual U0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   317: aload_1
    //   318: iload #5
    //   320: invokevirtual z0 : (I)V
    //   323: aload_1
    //   324: aload_0
    //   325: getfield e : I
    //   328: iload #8
    //   330: isub
    //   331: invokevirtual O0 : (I)V
    //   334: aload_1
    //   335: aload_0
    //   336: getfield f : I
    //   339: iload #7
    //   341: isub
    //   342: invokevirtual N0 : (I)V
    //   345: return
  }
  
  public static class LayoutParams extends ViewGroup.MarginLayoutParams {
    public float A = 0.5F;
    
    public String B = null;
    
    float C = 0.0F;
    
    int D = 1;
    
    public float E = -1.0F;
    
    public float F = -1.0F;
    
    public int G = 0;
    
    public int H = 0;
    
    public int I = 0;
    
    public int J = 0;
    
    public int K = 0;
    
    public int L = 0;
    
    public int M = 0;
    
    public int N = 0;
    
    public float O = 1.0F;
    
    public float P = 1.0F;
    
    public int Q = -1;
    
    public int R = -1;
    
    public int S = -1;
    
    public boolean T = false;
    
    public boolean U = false;
    
    public String V = null;
    
    boolean W = true;
    
    boolean X = true;
    
    boolean Y = false;
    
    boolean Z = false;
    
    public int a = -1;
    
    boolean a0 = false;
    
    public int b = -1;
    
    boolean b0 = false;
    
    public float c = -1.0F;
    
    boolean c0 = false;
    
    public int d = -1;
    
    int d0 = -1;
    
    public int e = -1;
    
    int e0 = -1;
    
    public int f = -1;
    
    int f0 = -1;
    
    public int g = -1;
    
    int g0 = -1;
    
    public int h = -1;
    
    int h0 = -1;
    
    public int i = -1;
    
    int i0 = -1;
    
    public int j = -1;
    
    float j0 = 0.5F;
    
    public int k = -1;
    
    int k0;
    
    public int l = -1;
    
    int l0;
    
    public int m = -1;
    
    float m0;
    
    public int n = 0;
    
    ConstraintWidget n0 = new ConstraintWidget();
    
    public float o = 0.0F;
    
    public boolean o0 = false;
    
    public int p = -1;
    
    public int q = -1;
    
    public int r = -1;
    
    public int s = -1;
    
    public int t = -1;
    
    public int u = -1;
    
    public int v = -1;
    
    public int w = -1;
    
    public int x = -1;
    
    public int y = -1;
    
    public float z = 0.5F;
    
    public LayoutParams(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: aload_2
      //   3: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
      //   6: aload_0
      //   7: iconst_m1
      //   8: putfield a : I
      //   11: aload_0
      //   12: iconst_m1
      //   13: putfield b : I
      //   16: aload_0
      //   17: ldc -1.0
      //   19: putfield c : F
      //   22: aload_0
      //   23: iconst_m1
      //   24: putfield d : I
      //   27: aload_0
      //   28: iconst_m1
      //   29: putfield e : I
      //   32: aload_0
      //   33: iconst_m1
      //   34: putfield f : I
      //   37: aload_0
      //   38: iconst_m1
      //   39: putfield g : I
      //   42: aload_0
      //   43: iconst_m1
      //   44: putfield h : I
      //   47: aload_0
      //   48: iconst_m1
      //   49: putfield i : I
      //   52: aload_0
      //   53: iconst_m1
      //   54: putfield j : I
      //   57: aload_0
      //   58: iconst_m1
      //   59: putfield k : I
      //   62: aload_0
      //   63: iconst_m1
      //   64: putfield l : I
      //   67: aload_0
      //   68: iconst_m1
      //   69: putfield m : I
      //   72: aload_0
      //   73: iconst_0
      //   74: putfield n : I
      //   77: aload_0
      //   78: fconst_0
      //   79: putfield o : F
      //   82: aload_0
      //   83: iconst_m1
      //   84: putfield p : I
      //   87: aload_0
      //   88: iconst_m1
      //   89: putfield q : I
      //   92: aload_0
      //   93: iconst_m1
      //   94: putfield r : I
      //   97: aload_0
      //   98: iconst_m1
      //   99: putfield s : I
      //   102: aload_0
      //   103: iconst_m1
      //   104: putfield t : I
      //   107: aload_0
      //   108: iconst_m1
      //   109: putfield u : I
      //   112: aload_0
      //   113: iconst_m1
      //   114: putfield v : I
      //   117: aload_0
      //   118: iconst_m1
      //   119: putfield w : I
      //   122: aload_0
      //   123: iconst_m1
      //   124: putfield x : I
      //   127: aload_0
      //   128: iconst_m1
      //   129: putfield y : I
      //   132: aload_0
      //   133: ldc 0.5
      //   135: putfield z : F
      //   138: aload_0
      //   139: ldc 0.5
      //   141: putfield A : F
      //   144: aload_0
      //   145: aconst_null
      //   146: putfield B : Ljava/lang/String;
      //   149: aload_0
      //   150: fconst_0
      //   151: putfield C : F
      //   154: aload_0
      //   155: iconst_1
      //   156: putfield D : I
      //   159: aload_0
      //   160: ldc -1.0
      //   162: putfield E : F
      //   165: aload_0
      //   166: ldc -1.0
      //   168: putfield F : F
      //   171: aload_0
      //   172: iconst_0
      //   173: putfield G : I
      //   176: aload_0
      //   177: iconst_0
      //   178: putfield H : I
      //   181: aload_0
      //   182: iconst_0
      //   183: putfield I : I
      //   186: aload_0
      //   187: iconst_0
      //   188: putfield J : I
      //   191: aload_0
      //   192: iconst_0
      //   193: putfield K : I
      //   196: aload_0
      //   197: iconst_0
      //   198: putfield L : I
      //   201: aload_0
      //   202: iconst_0
      //   203: putfield M : I
      //   206: aload_0
      //   207: iconst_0
      //   208: putfield N : I
      //   211: aload_0
      //   212: fconst_1
      //   213: putfield O : F
      //   216: aload_0
      //   217: fconst_1
      //   218: putfield P : F
      //   221: aload_0
      //   222: iconst_m1
      //   223: putfield Q : I
      //   226: aload_0
      //   227: iconst_m1
      //   228: putfield R : I
      //   231: aload_0
      //   232: iconst_m1
      //   233: putfield S : I
      //   236: aload_0
      //   237: iconst_0
      //   238: putfield T : Z
      //   241: aload_0
      //   242: iconst_0
      //   243: putfield U : Z
      //   246: aload_0
      //   247: aconst_null
      //   248: putfield V : Ljava/lang/String;
      //   251: aload_0
      //   252: iconst_1
      //   253: putfield W : Z
      //   256: aload_0
      //   257: iconst_1
      //   258: putfield X : Z
      //   261: aload_0
      //   262: iconst_0
      //   263: putfield Y : Z
      //   266: aload_0
      //   267: iconst_0
      //   268: putfield Z : Z
      //   271: aload_0
      //   272: iconst_0
      //   273: putfield a0 : Z
      //   276: aload_0
      //   277: iconst_0
      //   278: putfield b0 : Z
      //   281: aload_0
      //   282: iconst_0
      //   283: putfield c0 : Z
      //   286: aload_0
      //   287: iconst_m1
      //   288: putfield d0 : I
      //   291: aload_0
      //   292: iconst_m1
      //   293: putfield e0 : I
      //   296: aload_0
      //   297: iconst_m1
      //   298: putfield f0 : I
      //   301: aload_0
      //   302: iconst_m1
      //   303: putfield g0 : I
      //   306: aload_0
      //   307: iconst_m1
      //   308: putfield h0 : I
      //   311: aload_0
      //   312: iconst_m1
      //   313: putfield i0 : I
      //   316: aload_0
      //   317: ldc 0.5
      //   319: putfield j0 : F
      //   322: aload_0
      //   323: new androidx/constraintlayout/solver/widgets/ConstraintWidget
      //   326: dup
      //   327: invokespecial <init> : ()V
      //   330: putfield n0 : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   333: aload_0
      //   334: iconst_0
      //   335: putfield o0 : Z
      //   338: aload_1
      //   339: aload_2
      //   340: getstatic androidx/constraintlayout/widget/e.ConstraintLayout_Layout : [I
      //   343: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      //   346: astore_1
      //   347: aload_1
      //   348: invokevirtual getIndexCount : ()I
      //   351: istore_3
      //   352: iconst_0
      //   353: istore #4
      //   355: iload #4
      //   357: iload_3
      //   358: if_icmpge -> 2102
      //   361: aload_1
      //   362: iload #4
      //   364: invokevirtual getIndex : (I)I
      //   367: istore #5
      //   369: getstatic androidx/constraintlayout/widget/ConstraintLayout$LayoutParams$a.a : Landroid/util/SparseIntArray;
      //   372: iload #5
      //   374: invokevirtual get : (I)I
      //   377: istore #6
      //   379: iload #6
      //   381: tableswitch default -> 548, 1 -> 2082, 2 -> 2044, 3 -> 2027, 4 -> 1981, 5 -> 1964, 6 -> 1947, 7 -> 1930, 8 -> 1892, 9 -> 1854, 10 -> 1816, 11 -> 1778, 12 -> 1740, 13 -> 1702, 14 -> 1664, 15 -> 1626, 16 -> 1588, 17 -> 1550, 18 -> 1512, 19 -> 1474, 20 -> 1436, 21 -> 1419, 22 -> 1402, 23 -> 1385, 24 -> 1368, 25 -> 1351, 26 -> 1334, 27 -> 1317, 28 -> 1300, 29 -> 1283, 30 -> 1266, 31 -> 1232, 32 -> 1198, 33 -> 1156, 34 -> 1114, 35 -> 1088, 36 -> 1046, 37 -> 1004, 38 -> 978
      //   548: iload #6
      //   550: tableswitch default -> 596, 44 -> 708, 45 -> 691, 46 -> 674, 47 -> 660, 48 -> 646, 49 -> 629, 50 -> 612, 51 -> 599
      //   596: goto -> 2096
      //   599: aload_0
      //   600: aload_1
      //   601: iload #5
      //   603: invokevirtual getString : (I)Ljava/lang/String;
      //   606: putfield V : Ljava/lang/String;
      //   609: goto -> 2096
      //   612: aload_0
      //   613: aload_1
      //   614: iload #5
      //   616: aload_0
      //   617: getfield R : I
      //   620: invokevirtual getDimensionPixelOffset : (II)I
      //   623: putfield R : I
      //   626: goto -> 2096
      //   629: aload_0
      //   630: aload_1
      //   631: iload #5
      //   633: aload_0
      //   634: getfield Q : I
      //   637: invokevirtual getDimensionPixelOffset : (II)I
      //   640: putfield Q : I
      //   643: goto -> 2096
      //   646: aload_0
      //   647: aload_1
      //   648: iload #5
      //   650: iconst_0
      //   651: invokevirtual getInt : (II)I
      //   654: putfield H : I
      //   657: goto -> 2096
      //   660: aload_0
      //   661: aload_1
      //   662: iload #5
      //   664: iconst_0
      //   665: invokevirtual getInt : (II)I
      //   668: putfield G : I
      //   671: goto -> 2096
      //   674: aload_0
      //   675: aload_1
      //   676: iload #5
      //   678: aload_0
      //   679: getfield F : F
      //   682: invokevirtual getFloat : (IF)F
      //   685: putfield F : F
      //   688: goto -> 2096
      //   691: aload_0
      //   692: aload_1
      //   693: iload #5
      //   695: aload_0
      //   696: getfield E : F
      //   699: invokevirtual getFloat : (IF)F
      //   702: putfield E : F
      //   705: goto -> 2096
      //   708: aload_1
      //   709: iload #5
      //   711: invokevirtual getString : (I)Ljava/lang/String;
      //   714: astore_2
      //   715: aload_0
      //   716: aload_2
      //   717: putfield B : Ljava/lang/String;
      //   720: aload_0
      //   721: ldc_w NaN
      //   724: putfield C : F
      //   727: aload_0
      //   728: iconst_m1
      //   729: putfield D : I
      //   732: aload_2
      //   733: ifnull -> 2096
      //   736: aload_2
      //   737: invokevirtual length : ()I
      //   740: istore #6
      //   742: aload_0
      //   743: getfield B : Ljava/lang/String;
      //   746: bipush #44
      //   748: invokevirtual indexOf : (I)I
      //   751: istore #5
      //   753: iload #5
      //   755: ifle -> 817
      //   758: iload #5
      //   760: iload #6
      //   762: iconst_1
      //   763: isub
      //   764: if_icmpge -> 817
      //   767: aload_0
      //   768: getfield B : Ljava/lang/String;
      //   771: iconst_0
      //   772: iload #5
      //   774: invokevirtual substring : (II)Ljava/lang/String;
      //   777: astore_2
      //   778: aload_2
      //   779: ldc_w 'W'
      //   782: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
      //   785: ifeq -> 796
      //   788: aload_0
      //   789: iconst_0
      //   790: putfield D : I
      //   793: goto -> 811
      //   796: aload_2
      //   797: ldc_w 'H'
      //   800: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
      //   803: ifeq -> 811
      //   806: aload_0
      //   807: iconst_1
      //   808: putfield D : I
      //   811: iinc #5, 1
      //   814: goto -> 820
      //   817: iconst_0
      //   818: istore #5
      //   820: aload_0
      //   821: getfield B : Ljava/lang/String;
      //   824: bipush #58
      //   826: invokevirtual indexOf : (I)I
      //   829: istore #7
      //   831: iload #7
      //   833: iflt -> 950
      //   836: iload #7
      //   838: iload #6
      //   840: iconst_1
      //   841: isub
      //   842: if_icmpge -> 950
      //   845: aload_0
      //   846: getfield B : Ljava/lang/String;
      //   849: iload #5
      //   851: iload #7
      //   853: invokevirtual substring : (II)Ljava/lang/String;
      //   856: astore #8
      //   858: aload_0
      //   859: getfield B : Ljava/lang/String;
      //   862: iload #7
      //   864: iconst_1
      //   865: iadd
      //   866: invokevirtual substring : (I)Ljava/lang/String;
      //   869: astore_2
      //   870: aload #8
      //   872: invokevirtual length : ()I
      //   875: ifle -> 2096
      //   878: aload_2
      //   879: invokevirtual length : ()I
      //   882: ifle -> 2096
      //   885: aload #8
      //   887: invokestatic parseFloat : (Ljava/lang/String;)F
      //   890: fstore #9
      //   892: aload_2
      //   893: invokestatic parseFloat : (Ljava/lang/String;)F
      //   896: fstore #10
      //   898: fload #9
      //   900: fconst_0
      //   901: fcmpl
      //   902: ifle -> 2096
      //   905: fload #10
      //   907: fconst_0
      //   908: fcmpl
      //   909: ifle -> 2096
      //   912: aload_0
      //   913: getfield D : I
      //   916: iconst_1
      //   917: if_icmpne -> 935
      //   920: aload_0
      //   921: fload #10
      //   923: fload #9
      //   925: fdiv
      //   926: invokestatic abs : (F)F
      //   929: putfield C : F
      //   932: goto -> 2096
      //   935: aload_0
      //   936: fload #9
      //   938: fload #10
      //   940: fdiv
      //   941: invokestatic abs : (F)F
      //   944: putfield C : F
      //   947: goto -> 2096
      //   950: aload_0
      //   951: getfield B : Ljava/lang/String;
      //   954: iload #5
      //   956: invokevirtual substring : (I)Ljava/lang/String;
      //   959: astore_2
      //   960: aload_2
      //   961: invokevirtual length : ()I
      //   964: ifle -> 2096
      //   967: aload_0
      //   968: aload_2
      //   969: invokestatic parseFloat : (Ljava/lang/String;)F
      //   972: putfield C : F
      //   975: goto -> 2096
      //   978: aload_0
      //   979: fconst_0
      //   980: aload_1
      //   981: iload #5
      //   983: aload_0
      //   984: getfield P : F
      //   987: invokevirtual getFloat : (IF)F
      //   990: invokestatic max : (FF)F
      //   993: putfield P : F
      //   996: aload_0
      //   997: iconst_2
      //   998: putfield J : I
      //   1001: goto -> 2096
      //   1004: aload_0
      //   1005: aload_1
      //   1006: iload #5
      //   1008: aload_0
      //   1009: getfield N : I
      //   1012: invokevirtual getDimensionPixelSize : (II)I
      //   1015: putfield N : I
      //   1018: goto -> 2096
      //   1021: astore_2
      //   1022: aload_1
      //   1023: iload #5
      //   1025: aload_0
      //   1026: getfield N : I
      //   1029: invokevirtual getInt : (II)I
      //   1032: bipush #-2
      //   1034: if_icmpne -> 2096
      //   1037: aload_0
      //   1038: bipush #-2
      //   1040: putfield N : I
      //   1043: goto -> 2096
      //   1046: aload_0
      //   1047: aload_1
      //   1048: iload #5
      //   1050: aload_0
      //   1051: getfield L : I
      //   1054: invokevirtual getDimensionPixelSize : (II)I
      //   1057: putfield L : I
      //   1060: goto -> 2096
      //   1063: astore_2
      //   1064: aload_1
      //   1065: iload #5
      //   1067: aload_0
      //   1068: getfield L : I
      //   1071: invokevirtual getInt : (II)I
      //   1074: bipush #-2
      //   1076: if_icmpne -> 2096
      //   1079: aload_0
      //   1080: bipush #-2
      //   1082: putfield L : I
      //   1085: goto -> 2096
      //   1088: aload_0
      //   1089: fconst_0
      //   1090: aload_1
      //   1091: iload #5
      //   1093: aload_0
      //   1094: getfield O : F
      //   1097: invokevirtual getFloat : (IF)F
      //   1100: invokestatic max : (FF)F
      //   1103: putfield O : F
      //   1106: aload_0
      //   1107: iconst_2
      //   1108: putfield I : I
      //   1111: goto -> 2096
      //   1114: aload_0
      //   1115: aload_1
      //   1116: iload #5
      //   1118: aload_0
      //   1119: getfield M : I
      //   1122: invokevirtual getDimensionPixelSize : (II)I
      //   1125: putfield M : I
      //   1128: goto -> 2096
      //   1131: astore_2
      //   1132: aload_1
      //   1133: iload #5
      //   1135: aload_0
      //   1136: getfield M : I
      //   1139: invokevirtual getInt : (II)I
      //   1142: bipush #-2
      //   1144: if_icmpne -> 2096
      //   1147: aload_0
      //   1148: bipush #-2
      //   1150: putfield M : I
      //   1153: goto -> 2096
      //   1156: aload_0
      //   1157: aload_1
      //   1158: iload #5
      //   1160: aload_0
      //   1161: getfield K : I
      //   1164: invokevirtual getDimensionPixelSize : (II)I
      //   1167: putfield K : I
      //   1170: goto -> 2096
      //   1173: astore_2
      //   1174: aload_1
      //   1175: iload #5
      //   1177: aload_0
      //   1178: getfield K : I
      //   1181: invokevirtual getInt : (II)I
      //   1184: bipush #-2
      //   1186: if_icmpne -> 2096
      //   1189: aload_0
      //   1190: bipush #-2
      //   1192: putfield K : I
      //   1195: goto -> 2096
      //   1198: aload_1
      //   1199: iload #5
      //   1201: iconst_0
      //   1202: invokevirtual getInt : (II)I
      //   1205: istore #5
      //   1207: aload_0
      //   1208: iload #5
      //   1210: putfield J : I
      //   1213: iload #5
      //   1215: iconst_1
      //   1216: if_icmpne -> 2096
      //   1219: ldc_w 'ConstraintLayout'
      //   1222: ldc_w 'layout_constraintHeight_default="wrap" is deprecated.\\nUse layout_height="WRAP_CONTENT" and layout_constrainedHeight="true" instead.'
      //   1225: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
      //   1228: pop
      //   1229: goto -> 2096
      //   1232: aload_1
      //   1233: iload #5
      //   1235: iconst_0
      //   1236: invokevirtual getInt : (II)I
      //   1239: istore #5
      //   1241: aload_0
      //   1242: iload #5
      //   1244: putfield I : I
      //   1247: iload #5
      //   1249: iconst_1
      //   1250: if_icmpne -> 2096
      //   1253: ldc_w 'ConstraintLayout'
      //   1256: ldc_w 'layout_constraintWidth_default="wrap" is deprecated.\\nUse layout_width="WRAP_CONTENT" and layout_constrainedWidth="true" instead.'
      //   1259: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
      //   1262: pop
      //   1263: goto -> 2096
      //   1266: aload_0
      //   1267: aload_1
      //   1268: iload #5
      //   1270: aload_0
      //   1271: getfield A : F
      //   1274: invokevirtual getFloat : (IF)F
      //   1277: putfield A : F
      //   1280: goto -> 2096
      //   1283: aload_0
      //   1284: aload_1
      //   1285: iload #5
      //   1287: aload_0
      //   1288: getfield z : F
      //   1291: invokevirtual getFloat : (IF)F
      //   1294: putfield z : F
      //   1297: goto -> 2096
      //   1300: aload_0
      //   1301: aload_1
      //   1302: iload #5
      //   1304: aload_0
      //   1305: getfield U : Z
      //   1308: invokevirtual getBoolean : (IZ)Z
      //   1311: putfield U : Z
      //   1314: goto -> 2096
      //   1317: aload_0
      //   1318: aload_1
      //   1319: iload #5
      //   1321: aload_0
      //   1322: getfield T : Z
      //   1325: invokevirtual getBoolean : (IZ)Z
      //   1328: putfield T : Z
      //   1331: goto -> 2096
      //   1334: aload_0
      //   1335: aload_1
      //   1336: iload #5
      //   1338: aload_0
      //   1339: getfield y : I
      //   1342: invokevirtual getDimensionPixelSize : (II)I
      //   1345: putfield y : I
      //   1348: goto -> 2096
      //   1351: aload_0
      //   1352: aload_1
      //   1353: iload #5
      //   1355: aload_0
      //   1356: getfield x : I
      //   1359: invokevirtual getDimensionPixelSize : (II)I
      //   1362: putfield x : I
      //   1365: goto -> 2096
      //   1368: aload_0
      //   1369: aload_1
      //   1370: iload #5
      //   1372: aload_0
      //   1373: getfield w : I
      //   1376: invokevirtual getDimensionPixelSize : (II)I
      //   1379: putfield w : I
      //   1382: goto -> 2096
      //   1385: aload_0
      //   1386: aload_1
      //   1387: iload #5
      //   1389: aload_0
      //   1390: getfield v : I
      //   1393: invokevirtual getDimensionPixelSize : (II)I
      //   1396: putfield v : I
      //   1399: goto -> 2096
      //   1402: aload_0
      //   1403: aload_1
      //   1404: iload #5
      //   1406: aload_0
      //   1407: getfield u : I
      //   1410: invokevirtual getDimensionPixelSize : (II)I
      //   1413: putfield u : I
      //   1416: goto -> 2096
      //   1419: aload_0
      //   1420: aload_1
      //   1421: iload #5
      //   1423: aload_0
      //   1424: getfield t : I
      //   1427: invokevirtual getDimensionPixelSize : (II)I
      //   1430: putfield t : I
      //   1433: goto -> 2096
      //   1436: aload_1
      //   1437: iload #5
      //   1439: aload_0
      //   1440: getfield s : I
      //   1443: invokevirtual getResourceId : (II)I
      //   1446: istore #6
      //   1448: aload_0
      //   1449: iload #6
      //   1451: putfield s : I
      //   1454: iload #6
      //   1456: iconst_m1
      //   1457: if_icmpne -> 2096
      //   1460: aload_0
      //   1461: aload_1
      //   1462: iload #5
      //   1464: iconst_m1
      //   1465: invokevirtual getInt : (II)I
      //   1468: putfield s : I
      //   1471: goto -> 2096
      //   1474: aload_1
      //   1475: iload #5
      //   1477: aload_0
      //   1478: getfield r : I
      //   1481: invokevirtual getResourceId : (II)I
      //   1484: istore #6
      //   1486: aload_0
      //   1487: iload #6
      //   1489: putfield r : I
      //   1492: iload #6
      //   1494: iconst_m1
      //   1495: if_icmpne -> 2096
      //   1498: aload_0
      //   1499: aload_1
      //   1500: iload #5
      //   1502: iconst_m1
      //   1503: invokevirtual getInt : (II)I
      //   1506: putfield r : I
      //   1509: goto -> 2096
      //   1512: aload_1
      //   1513: iload #5
      //   1515: aload_0
      //   1516: getfield q : I
      //   1519: invokevirtual getResourceId : (II)I
      //   1522: istore #6
      //   1524: aload_0
      //   1525: iload #6
      //   1527: putfield q : I
      //   1530: iload #6
      //   1532: iconst_m1
      //   1533: if_icmpne -> 2096
      //   1536: aload_0
      //   1537: aload_1
      //   1538: iload #5
      //   1540: iconst_m1
      //   1541: invokevirtual getInt : (II)I
      //   1544: putfield q : I
      //   1547: goto -> 2096
      //   1550: aload_1
      //   1551: iload #5
      //   1553: aload_0
      //   1554: getfield p : I
      //   1557: invokevirtual getResourceId : (II)I
      //   1560: istore #6
      //   1562: aload_0
      //   1563: iload #6
      //   1565: putfield p : I
      //   1568: iload #6
      //   1570: iconst_m1
      //   1571: if_icmpne -> 2096
      //   1574: aload_0
      //   1575: aload_1
      //   1576: iload #5
      //   1578: iconst_m1
      //   1579: invokevirtual getInt : (II)I
      //   1582: putfield p : I
      //   1585: goto -> 2096
      //   1588: aload_1
      //   1589: iload #5
      //   1591: aload_0
      //   1592: getfield l : I
      //   1595: invokevirtual getResourceId : (II)I
      //   1598: istore #6
      //   1600: aload_0
      //   1601: iload #6
      //   1603: putfield l : I
      //   1606: iload #6
      //   1608: iconst_m1
      //   1609: if_icmpne -> 2096
      //   1612: aload_0
      //   1613: aload_1
      //   1614: iload #5
      //   1616: iconst_m1
      //   1617: invokevirtual getInt : (II)I
      //   1620: putfield l : I
      //   1623: goto -> 2096
      //   1626: aload_1
      //   1627: iload #5
      //   1629: aload_0
      //   1630: getfield k : I
      //   1633: invokevirtual getResourceId : (II)I
      //   1636: istore #6
      //   1638: aload_0
      //   1639: iload #6
      //   1641: putfield k : I
      //   1644: iload #6
      //   1646: iconst_m1
      //   1647: if_icmpne -> 2096
      //   1650: aload_0
      //   1651: aload_1
      //   1652: iload #5
      //   1654: iconst_m1
      //   1655: invokevirtual getInt : (II)I
      //   1658: putfield k : I
      //   1661: goto -> 2096
      //   1664: aload_1
      //   1665: iload #5
      //   1667: aload_0
      //   1668: getfield j : I
      //   1671: invokevirtual getResourceId : (II)I
      //   1674: istore #6
      //   1676: aload_0
      //   1677: iload #6
      //   1679: putfield j : I
      //   1682: iload #6
      //   1684: iconst_m1
      //   1685: if_icmpne -> 2096
      //   1688: aload_0
      //   1689: aload_1
      //   1690: iload #5
      //   1692: iconst_m1
      //   1693: invokevirtual getInt : (II)I
      //   1696: putfield j : I
      //   1699: goto -> 2096
      //   1702: aload_1
      //   1703: iload #5
      //   1705: aload_0
      //   1706: getfield i : I
      //   1709: invokevirtual getResourceId : (II)I
      //   1712: istore #6
      //   1714: aload_0
      //   1715: iload #6
      //   1717: putfield i : I
      //   1720: iload #6
      //   1722: iconst_m1
      //   1723: if_icmpne -> 2096
      //   1726: aload_0
      //   1727: aload_1
      //   1728: iload #5
      //   1730: iconst_m1
      //   1731: invokevirtual getInt : (II)I
      //   1734: putfield i : I
      //   1737: goto -> 2096
      //   1740: aload_1
      //   1741: iload #5
      //   1743: aload_0
      //   1744: getfield h : I
      //   1747: invokevirtual getResourceId : (II)I
      //   1750: istore #6
      //   1752: aload_0
      //   1753: iload #6
      //   1755: putfield h : I
      //   1758: iload #6
      //   1760: iconst_m1
      //   1761: if_icmpne -> 2096
      //   1764: aload_0
      //   1765: aload_1
      //   1766: iload #5
      //   1768: iconst_m1
      //   1769: invokevirtual getInt : (II)I
      //   1772: putfield h : I
      //   1775: goto -> 2096
      //   1778: aload_1
      //   1779: iload #5
      //   1781: aload_0
      //   1782: getfield g : I
      //   1785: invokevirtual getResourceId : (II)I
      //   1788: istore #6
      //   1790: aload_0
      //   1791: iload #6
      //   1793: putfield g : I
      //   1796: iload #6
      //   1798: iconst_m1
      //   1799: if_icmpne -> 2096
      //   1802: aload_0
      //   1803: aload_1
      //   1804: iload #5
      //   1806: iconst_m1
      //   1807: invokevirtual getInt : (II)I
      //   1810: putfield g : I
      //   1813: goto -> 2096
      //   1816: aload_1
      //   1817: iload #5
      //   1819: aload_0
      //   1820: getfield f : I
      //   1823: invokevirtual getResourceId : (II)I
      //   1826: istore #6
      //   1828: aload_0
      //   1829: iload #6
      //   1831: putfield f : I
      //   1834: iload #6
      //   1836: iconst_m1
      //   1837: if_icmpne -> 2096
      //   1840: aload_0
      //   1841: aload_1
      //   1842: iload #5
      //   1844: iconst_m1
      //   1845: invokevirtual getInt : (II)I
      //   1848: putfield f : I
      //   1851: goto -> 2096
      //   1854: aload_1
      //   1855: iload #5
      //   1857: aload_0
      //   1858: getfield e : I
      //   1861: invokevirtual getResourceId : (II)I
      //   1864: istore #6
      //   1866: aload_0
      //   1867: iload #6
      //   1869: putfield e : I
      //   1872: iload #6
      //   1874: iconst_m1
      //   1875: if_icmpne -> 2096
      //   1878: aload_0
      //   1879: aload_1
      //   1880: iload #5
      //   1882: iconst_m1
      //   1883: invokevirtual getInt : (II)I
      //   1886: putfield e : I
      //   1889: goto -> 2096
      //   1892: aload_1
      //   1893: iload #5
      //   1895: aload_0
      //   1896: getfield d : I
      //   1899: invokevirtual getResourceId : (II)I
      //   1902: istore #6
      //   1904: aload_0
      //   1905: iload #6
      //   1907: putfield d : I
      //   1910: iload #6
      //   1912: iconst_m1
      //   1913: if_icmpne -> 2096
      //   1916: aload_0
      //   1917: aload_1
      //   1918: iload #5
      //   1920: iconst_m1
      //   1921: invokevirtual getInt : (II)I
      //   1924: putfield d : I
      //   1927: goto -> 2096
      //   1930: aload_0
      //   1931: aload_1
      //   1932: iload #5
      //   1934: aload_0
      //   1935: getfield c : F
      //   1938: invokevirtual getFloat : (IF)F
      //   1941: putfield c : F
      //   1944: goto -> 2096
      //   1947: aload_0
      //   1948: aload_1
      //   1949: iload #5
      //   1951: aload_0
      //   1952: getfield b : I
      //   1955: invokevirtual getDimensionPixelOffset : (II)I
      //   1958: putfield b : I
      //   1961: goto -> 2096
      //   1964: aload_0
      //   1965: aload_1
      //   1966: iload #5
      //   1968: aload_0
      //   1969: getfield a : I
      //   1972: invokevirtual getDimensionPixelOffset : (II)I
      //   1975: putfield a : I
      //   1978: goto -> 2096
      //   1981: aload_1
      //   1982: iload #5
      //   1984: aload_0
      //   1985: getfield o : F
      //   1988: invokevirtual getFloat : (IF)F
      //   1991: ldc_w 360.0
      //   1994: frem
      //   1995: fstore #10
      //   1997: aload_0
      //   1998: fload #10
      //   2000: putfield o : F
      //   2003: fload #10
      //   2005: fconst_0
      //   2006: fcmpg
      //   2007: ifge -> 2096
      //   2010: aload_0
      //   2011: ldc_w 360.0
      //   2014: fload #10
      //   2016: fsub
      //   2017: ldc_w 360.0
      //   2020: frem
      //   2021: putfield o : F
      //   2024: goto -> 2096
      //   2027: aload_0
      //   2028: aload_1
      //   2029: iload #5
      //   2031: aload_0
      //   2032: getfield n : I
      //   2035: invokevirtual getDimensionPixelSize : (II)I
      //   2038: putfield n : I
      //   2041: goto -> 2096
      //   2044: aload_1
      //   2045: iload #5
      //   2047: aload_0
      //   2048: getfield m : I
      //   2051: invokevirtual getResourceId : (II)I
      //   2054: istore #6
      //   2056: aload_0
      //   2057: iload #6
      //   2059: putfield m : I
      //   2062: iload #6
      //   2064: iconst_m1
      //   2065: if_icmpne -> 2096
      //   2068: aload_0
      //   2069: aload_1
      //   2070: iload #5
      //   2072: iconst_m1
      //   2073: invokevirtual getInt : (II)I
      //   2076: putfield m : I
      //   2079: goto -> 2096
      //   2082: aload_0
      //   2083: aload_1
      //   2084: iload #5
      //   2086: aload_0
      //   2087: getfield S : I
      //   2090: invokevirtual getInt : (II)I
      //   2093: putfield S : I
      //   2096: iinc #4, 1
      //   2099: goto -> 355
      //   2102: aload_1
      //   2103: invokevirtual recycle : ()V
      //   2106: aload_0
      //   2107: invokevirtual c : ()V
      //   2110: return
      //   2111: astore_2
      //   2112: goto -> 2096
      // Exception table:
      //   from	to	target	type
      //   885	898	2111	java/lang/NumberFormatException
      //   912	932	2111	java/lang/NumberFormatException
      //   935	947	2111	java/lang/NumberFormatException
      //   967	975	2111	java/lang/NumberFormatException
      //   1004	1018	1021	java/lang/Exception
      //   1046	1060	1063	java/lang/Exception
      //   1114	1128	1131	java/lang/Exception
      //   1156	1170	1173	java/lang/Exception
    }
    
    public LayoutParams(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public String a() {
      return this.V;
    }
    
    public ConstraintWidget b() {
      return this.n0;
    }
    
    public void c() {
      this.Z = false;
      this.W = true;
      this.X = true;
      int i = this.width;
      if (i == -2 && this.T) {
        this.W = false;
        if (this.I == 0)
          this.I = 1; 
      } 
      int j = this.height;
      if (j == -2 && this.U) {
        this.X = false;
        if (this.J == 0)
          this.J = 1; 
      } 
      if (i == 0 || i == -1) {
        this.W = false;
        if (i == 0 && this.I == 1) {
          this.width = -2;
          this.T = true;
        } 
      } 
      if (j == 0 || j == -1) {
        this.X = false;
        if (j == 0 && this.J == 1) {
          this.height = -2;
          this.U = true;
        } 
      } 
      if (this.c != -1.0F || this.a != -1 || this.b != -1) {
        this.Z = true;
        this.W = true;
        this.X = true;
        if (!(this.n0 instanceof f))
          this.n0 = (ConstraintWidget)new f(); 
        ((f)this.n0).n1(this.S);
      } 
    }
    
    @TargetApi(17)
    public void resolveLayoutDirection(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: getfield leftMargin : I
      //   4: istore_2
      //   5: aload_0
      //   6: getfield rightMargin : I
      //   9: istore_3
      //   10: getstatic android/os/Build$VERSION.SDK_INT : I
      //   13: istore #4
      //   15: iconst_0
      //   16: istore #5
      //   18: iload #4
      //   20: bipush #17
      //   22: if_icmplt -> 43
      //   25: aload_0
      //   26: iload_1
      //   27: invokespecial resolveLayoutDirection : (I)V
      //   30: iconst_1
      //   31: aload_0
      //   32: invokevirtual getLayoutDirection : ()I
      //   35: if_icmpne -> 43
      //   38: iconst_1
      //   39: istore_1
      //   40: goto -> 45
      //   43: iconst_0
      //   44: istore_1
      //   45: aload_0
      //   46: iconst_m1
      //   47: putfield f0 : I
      //   50: aload_0
      //   51: iconst_m1
      //   52: putfield g0 : I
      //   55: aload_0
      //   56: iconst_m1
      //   57: putfield d0 : I
      //   60: aload_0
      //   61: iconst_m1
      //   62: putfield e0 : I
      //   65: aload_0
      //   66: iconst_m1
      //   67: putfield h0 : I
      //   70: aload_0
      //   71: iconst_m1
      //   72: putfield i0 : I
      //   75: aload_0
      //   76: aload_0
      //   77: getfield t : I
      //   80: putfield h0 : I
      //   83: aload_0
      //   84: aload_0
      //   85: getfield v : I
      //   88: putfield i0 : I
      //   91: aload_0
      //   92: getfield z : F
      //   95: fstore #6
      //   97: aload_0
      //   98: fload #6
      //   100: putfield j0 : F
      //   103: aload_0
      //   104: getfield a : I
      //   107: istore #7
      //   109: aload_0
      //   110: iload #7
      //   112: putfield k0 : I
      //   115: aload_0
      //   116: getfield b : I
      //   119: istore #4
      //   121: aload_0
      //   122: iload #4
      //   124: putfield l0 : I
      //   127: aload_0
      //   128: getfield c : F
      //   131: fstore #8
      //   133: aload_0
      //   134: fload #8
      //   136: putfield m0 : F
      //   139: iload_1
      //   140: ifeq -> 371
      //   143: aload_0
      //   144: getfield p : I
      //   147: istore_1
      //   148: iload_1
      //   149: iconst_m1
      //   150: if_icmpeq -> 163
      //   153: aload_0
      //   154: iload_1
      //   155: putfield f0 : I
      //   158: iconst_1
      //   159: istore_1
      //   160: goto -> 187
      //   163: aload_0
      //   164: getfield q : I
      //   167: istore #9
      //   169: iload #5
      //   171: istore_1
      //   172: iload #9
      //   174: iconst_m1
      //   175: if_icmpeq -> 187
      //   178: aload_0
      //   179: iload #9
      //   181: putfield g0 : I
      //   184: goto -> 158
      //   187: aload_0
      //   188: getfield r : I
      //   191: istore #5
      //   193: iload #5
      //   195: iconst_m1
      //   196: if_icmpeq -> 207
      //   199: aload_0
      //   200: iload #5
      //   202: putfield e0 : I
      //   205: iconst_1
      //   206: istore_1
      //   207: aload_0
      //   208: getfield s : I
      //   211: istore #5
      //   213: iload #5
      //   215: iconst_m1
      //   216: if_icmpeq -> 227
      //   219: aload_0
      //   220: iload #5
      //   222: putfield d0 : I
      //   225: iconst_1
      //   226: istore_1
      //   227: aload_0
      //   228: getfield x : I
      //   231: istore #5
      //   233: iload #5
      //   235: iconst_m1
      //   236: if_icmpeq -> 245
      //   239: aload_0
      //   240: iload #5
      //   242: putfield i0 : I
      //   245: aload_0
      //   246: getfield y : I
      //   249: istore #5
      //   251: iload #5
      //   253: iconst_m1
      //   254: if_icmpeq -> 263
      //   257: aload_0
      //   258: iload #5
      //   260: putfield h0 : I
      //   263: iload_1
      //   264: ifeq -> 275
      //   267: aload_0
      //   268: fconst_1
      //   269: fload #6
      //   271: fsub
      //   272: putfield j0 : F
      //   275: aload_0
      //   276: getfield Z : Z
      //   279: ifeq -> 461
      //   282: aload_0
      //   283: getfield S : I
      //   286: iconst_1
      //   287: if_icmpne -> 461
      //   290: fload #8
      //   292: ldc -1.0
      //   294: fcmpl
      //   295: ifeq -> 319
      //   298: aload_0
      //   299: fconst_1
      //   300: fload #8
      //   302: fsub
      //   303: putfield m0 : F
      //   306: aload_0
      //   307: iconst_m1
      //   308: putfield k0 : I
      //   311: aload_0
      //   312: iconst_m1
      //   313: putfield l0 : I
      //   316: goto -> 461
      //   319: iload #7
      //   321: iconst_m1
      //   322: if_icmpeq -> 345
      //   325: aload_0
      //   326: iload #7
      //   328: putfield l0 : I
      //   331: aload_0
      //   332: iconst_m1
      //   333: putfield k0 : I
      //   336: aload_0
      //   337: ldc -1.0
      //   339: putfield m0 : F
      //   342: goto -> 461
      //   345: iload #4
      //   347: iconst_m1
      //   348: if_icmpeq -> 461
      //   351: aload_0
      //   352: iload #4
      //   354: putfield k0 : I
      //   357: aload_0
      //   358: iconst_m1
      //   359: putfield l0 : I
      //   362: aload_0
      //   363: ldc -1.0
      //   365: putfield m0 : F
      //   368: goto -> 461
      //   371: aload_0
      //   372: getfield p : I
      //   375: istore_1
      //   376: iload_1
      //   377: iconst_m1
      //   378: if_icmpeq -> 386
      //   381: aload_0
      //   382: iload_1
      //   383: putfield e0 : I
      //   386: aload_0
      //   387: getfield q : I
      //   390: istore_1
      //   391: iload_1
      //   392: iconst_m1
      //   393: if_icmpeq -> 401
      //   396: aload_0
      //   397: iload_1
      //   398: putfield d0 : I
      //   401: aload_0
      //   402: getfield r : I
      //   405: istore_1
      //   406: iload_1
      //   407: iconst_m1
      //   408: if_icmpeq -> 416
      //   411: aload_0
      //   412: iload_1
      //   413: putfield f0 : I
      //   416: aload_0
      //   417: getfield s : I
      //   420: istore_1
      //   421: iload_1
      //   422: iconst_m1
      //   423: if_icmpeq -> 431
      //   426: aload_0
      //   427: iload_1
      //   428: putfield g0 : I
      //   431: aload_0
      //   432: getfield x : I
      //   435: istore_1
      //   436: iload_1
      //   437: iconst_m1
      //   438: if_icmpeq -> 446
      //   441: aload_0
      //   442: iload_1
      //   443: putfield h0 : I
      //   446: aload_0
      //   447: getfield y : I
      //   450: istore_1
      //   451: iload_1
      //   452: iconst_m1
      //   453: if_icmpeq -> 461
      //   456: aload_0
      //   457: iload_1
      //   458: putfield i0 : I
      //   461: aload_0
      //   462: getfield r : I
      //   465: iconst_m1
      //   466: if_icmpne -> 623
      //   469: aload_0
      //   470: getfield s : I
      //   473: iconst_m1
      //   474: if_icmpne -> 623
      //   477: aload_0
      //   478: getfield q : I
      //   481: iconst_m1
      //   482: if_icmpne -> 623
      //   485: aload_0
      //   486: getfield p : I
      //   489: iconst_m1
      //   490: if_icmpne -> 623
      //   493: aload_0
      //   494: getfield f : I
      //   497: istore_1
      //   498: iload_1
      //   499: iconst_m1
      //   500: if_icmpeq -> 527
      //   503: aload_0
      //   504: iload_1
      //   505: putfield f0 : I
      //   508: aload_0
      //   509: getfield rightMargin : I
      //   512: ifgt -> 558
      //   515: iload_3
      //   516: ifle -> 558
      //   519: aload_0
      //   520: iload_3
      //   521: putfield rightMargin : I
      //   524: goto -> 558
      //   527: aload_0
      //   528: getfield g : I
      //   531: istore_1
      //   532: iload_1
      //   533: iconst_m1
      //   534: if_icmpeq -> 558
      //   537: aload_0
      //   538: iload_1
      //   539: putfield g0 : I
      //   542: aload_0
      //   543: getfield rightMargin : I
      //   546: ifgt -> 558
      //   549: iload_3
      //   550: ifle -> 558
      //   553: aload_0
      //   554: iload_3
      //   555: putfield rightMargin : I
      //   558: aload_0
      //   559: getfield d : I
      //   562: istore_1
      //   563: iload_1
      //   564: iconst_m1
      //   565: if_icmpeq -> 592
      //   568: aload_0
      //   569: iload_1
      //   570: putfield d0 : I
      //   573: aload_0
      //   574: getfield leftMargin : I
      //   577: ifgt -> 623
      //   580: iload_2
      //   581: ifle -> 623
      //   584: aload_0
      //   585: iload_2
      //   586: putfield leftMargin : I
      //   589: goto -> 623
      //   592: aload_0
      //   593: getfield e : I
      //   596: istore_1
      //   597: iload_1
      //   598: iconst_m1
      //   599: if_icmpeq -> 623
      //   602: aload_0
      //   603: iload_1
      //   604: putfield e0 : I
      //   607: aload_0
      //   608: getfield leftMargin : I
      //   611: ifgt -> 623
      //   614: iload_2
      //   615: ifle -> 623
      //   618: aload_0
      //   619: iload_2
      //   620: putfield leftMargin : I
      //   623: return
    }
    
    private static class a {
      public static final SparseIntArray a;
      
      static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintCircle, 2);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
        sparseIntArray.append(e.ConstraintLayout_Layout_android_orientation, 1);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginTop, 22);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginRight, 23);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginStart, 25);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constrainedWidth, 27);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constrainedHeight, 28);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
        sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
        a.append(e.ConstraintLayout_Layout_layout_constraintTag, 51);
      }
    }
  }
  
  private static class a {
    public static final SparseIntArray a;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      a = sparseIntArray;
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintCircle, 2);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
      sparseIntArray.append(e.ConstraintLayout_Layout_android_orientation, 1);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginTop, 22);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginRight, 23);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginStart, 25);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constrainedWidth, 27);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constrainedHeight, 28);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
      sparseIntArray.append(e.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
      a.append(e.ConstraintLayout_Layout_layout_constraintTag, 51);
    }
  }
  
  class b implements androidx.constraintlayout.solver.widgets.analyzer.b.b {
    ConstraintLayout a;
    
    int b;
    
    int c;
    
    int d;
    
    int e;
    
    int f;
    
    int g;
    
    public b(ConstraintLayout this$0, ConstraintLayout param1ConstraintLayout1) {
      this.a = param1ConstraintLayout1;
    }
    
    private boolean d(int param1Int1, int param1Int2, int param1Int3) {
      if (param1Int1 == param1Int2)
        return true; 
      int i = View.MeasureSpec.getMode(param1Int1);
      View.MeasureSpec.getSize(param1Int1);
      param1Int1 = View.MeasureSpec.getMode(param1Int2);
      param1Int2 = View.MeasureSpec.getSize(param1Int2);
      return (param1Int1 == 1073741824 && (i == Integer.MIN_VALUE || i == 0) && param1Int3 == param1Int2);
    }
    
    public final void a() {
      int i = this.a.getChildCount();
      boolean bool = false;
      byte b1;
      for (b1 = 0; b1 < i; b1++) {
        View view = this.a.getChildAt(b1);
        if (view instanceof Placeholder)
          ((Placeholder)view).b(this.a); 
      } 
      i = ConstraintLayout.c(this.a).size();
      if (i > 0)
        for (b1 = bool; b1 < i; b1++)
          ((ConstraintHelper)ConstraintLayout.c(this.a).get(b1)).r(this.a);  
    }
    
    @SuppressLint({"WrongCall"})
    public final void b(ConstraintWidget param1ConstraintWidget, androidx.constraintlayout.solver.widgets.analyzer.b.a param1a) {
      // Byte code:
      //   0: aload_1
      //   1: ifnonnull -> 5
      //   4: return
      //   5: aload_1
      //   6: invokevirtual T : ()I
      //   9: bipush #8
      //   11: if_icmpne -> 37
      //   14: aload_1
      //   15: invokevirtual d0 : ()Z
      //   18: ifne -> 37
      //   21: aload_2
      //   22: iconst_0
      //   23: putfield h : I
      //   26: aload_2
      //   27: iconst_0
      //   28: putfield i : I
      //   31: aload_2
      //   32: iconst_0
      //   33: putfield j : I
      //   36: return
      //   37: aload_1
      //   38: invokevirtual L : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   41: ifnonnull -> 45
      //   44: return
      //   45: aload_2
      //   46: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
      //   49: astore_3
      //   50: aload_2
      //   51: getfield e : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
      //   54: astore #4
      //   56: aload_2
      //   57: getfield f : I
      //   60: istore #5
      //   62: aload_2
      //   63: getfield g : I
      //   66: istore #6
      //   68: aload_0
      //   69: getfield b : I
      //   72: aload_0
      //   73: getfield c : I
      //   76: iadd
      //   77: istore #7
      //   79: aload_0
      //   80: getfield d : I
      //   83: istore #8
      //   85: aload_1
      //   86: invokevirtual t : ()Ljava/lang/Object;
      //   89: checkcast android/view/View
      //   92: astore #9
      //   94: getstatic androidx/constraintlayout/widget/ConstraintLayout$a.a : [I
      //   97: astore #10
      //   99: aload #10
      //   101: aload_3
      //   102: invokevirtual ordinal : ()I
      //   105: iaload
      //   106: istore #11
      //   108: iload #11
      //   110: iconst_1
      //   111: if_icmpeq -> 326
      //   114: iload #11
      //   116: iconst_2
      //   117: if_icmpeq -> 310
      //   120: iload #11
      //   122: iconst_3
      //   123: if_icmpeq -> 290
      //   126: iload #11
      //   128: iconst_4
      //   129: if_icmpeq -> 138
      //   132: iconst_0
      //   133: istore #8
      //   135: goto -> 335
      //   138: aload_0
      //   139: getfield f : I
      //   142: iload #8
      //   144: bipush #-2
      //   146: invokestatic getChildMeasureSpec : (III)I
      //   149: istore #11
      //   151: aload_1
      //   152: getfield q : I
      //   155: iconst_1
      //   156: if_icmpne -> 165
      //   159: iconst_1
      //   160: istore #5
      //   162: goto -> 168
      //   165: iconst_0
      //   166: istore #5
      //   168: aload_2
      //   169: getfield m : I
      //   172: istore #12
      //   174: iload #12
      //   176: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.b : I
      //   179: if_icmpeq -> 194
      //   182: iload #11
      //   184: istore #8
      //   186: iload #12
      //   188: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.c : I
      //   191: if_icmpne -> 335
      //   194: aload #9
      //   196: invokevirtual getMeasuredHeight : ()I
      //   199: aload_1
      //   200: invokevirtual y : ()I
      //   203: if_icmpne -> 212
      //   206: iconst_1
      //   207: istore #8
      //   209: goto -> 215
      //   212: iconst_0
      //   213: istore #8
      //   215: aload_2
      //   216: getfield m : I
      //   219: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.c : I
      //   222: if_icmpeq -> 264
      //   225: iload #5
      //   227: ifeq -> 264
      //   230: iload #5
      //   232: ifeq -> 240
      //   235: iload #8
      //   237: ifne -> 264
      //   240: aload #9
      //   242: instanceof androidx/constraintlayout/widget/Placeholder
      //   245: ifne -> 264
      //   248: aload_1
      //   249: invokevirtual h0 : ()Z
      //   252: ifeq -> 258
      //   255: goto -> 264
      //   258: iconst_0
      //   259: istore #5
      //   261: goto -> 267
      //   264: iconst_1
      //   265: istore #5
      //   267: iload #11
      //   269: istore #8
      //   271: iload #5
      //   273: ifeq -> 335
      //   276: aload_1
      //   277: invokevirtual U : ()I
      //   280: ldc 1073741824
      //   282: invokestatic makeMeasureSpec : (II)I
      //   285: istore #8
      //   287: goto -> 335
      //   290: aload_0
      //   291: getfield f : I
      //   294: iload #8
      //   296: aload_1
      //   297: invokevirtual C : ()I
      //   300: iadd
      //   301: iconst_m1
      //   302: invokestatic getChildMeasureSpec : (III)I
      //   305: istore #8
      //   307: goto -> 335
      //   310: aload_0
      //   311: getfield f : I
      //   314: iload #8
      //   316: bipush #-2
      //   318: invokestatic getChildMeasureSpec : (III)I
      //   321: istore #8
      //   323: goto -> 335
      //   326: iload #5
      //   328: ldc 1073741824
      //   330: invokestatic makeMeasureSpec : (II)I
      //   333: istore #8
      //   335: aload #10
      //   337: aload #4
      //   339: invokevirtual ordinal : ()I
      //   342: iaload
      //   343: istore #5
      //   345: iload #5
      //   347: iconst_1
      //   348: if_icmpeq -> 563
      //   351: iload #5
      //   353: iconst_2
      //   354: if_icmpeq -> 547
      //   357: iload #5
      //   359: iconst_3
      //   360: if_icmpeq -> 527
      //   363: iload #5
      //   365: iconst_4
      //   366: if_icmpeq -> 375
      //   369: iconst_0
      //   370: istore #5
      //   372: goto -> 572
      //   375: aload_0
      //   376: getfield g : I
      //   379: iload #7
      //   381: bipush #-2
      //   383: invokestatic getChildMeasureSpec : (III)I
      //   386: istore #7
      //   388: aload_1
      //   389: getfield r : I
      //   392: iconst_1
      //   393: if_icmpne -> 402
      //   396: iconst_1
      //   397: istore #11
      //   399: goto -> 405
      //   402: iconst_0
      //   403: istore #11
      //   405: aload_2
      //   406: getfield m : I
      //   409: istore #6
      //   411: iload #6
      //   413: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.b : I
      //   416: if_icmpeq -> 431
      //   419: iload #7
      //   421: istore #5
      //   423: iload #6
      //   425: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.c : I
      //   428: if_icmpne -> 572
      //   431: aload #9
      //   433: invokevirtual getMeasuredWidth : ()I
      //   436: aload_1
      //   437: invokevirtual U : ()I
      //   440: if_icmpne -> 449
      //   443: iconst_1
      //   444: istore #5
      //   446: goto -> 452
      //   449: iconst_0
      //   450: istore #5
      //   452: aload_2
      //   453: getfield m : I
      //   456: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.c : I
      //   459: if_icmpeq -> 501
      //   462: iload #11
      //   464: ifeq -> 501
      //   467: iload #11
      //   469: ifeq -> 477
      //   472: iload #5
      //   474: ifne -> 501
      //   477: aload #9
      //   479: instanceof androidx/constraintlayout/widget/Placeholder
      //   482: ifne -> 501
      //   485: aload_1
      //   486: invokevirtual i0 : ()Z
      //   489: ifeq -> 495
      //   492: goto -> 501
      //   495: iconst_0
      //   496: istore #11
      //   498: goto -> 504
      //   501: iconst_1
      //   502: istore #11
      //   504: iload #7
      //   506: istore #5
      //   508: iload #11
      //   510: ifeq -> 572
      //   513: aload_1
      //   514: invokevirtual y : ()I
      //   517: ldc 1073741824
      //   519: invokestatic makeMeasureSpec : (II)I
      //   522: istore #5
      //   524: goto -> 572
      //   527: aload_0
      //   528: getfield g : I
      //   531: iload #7
      //   533: aload_1
      //   534: invokevirtual S : ()I
      //   537: iadd
      //   538: iconst_m1
      //   539: invokestatic getChildMeasureSpec : (III)I
      //   542: istore #5
      //   544: goto -> 572
      //   547: aload_0
      //   548: getfield g : I
      //   551: iload #7
      //   553: bipush #-2
      //   555: invokestatic getChildMeasureSpec : (III)I
      //   558: istore #5
      //   560: goto -> 572
      //   563: iload #6
      //   565: ldc 1073741824
      //   567: invokestatic makeMeasureSpec : (II)I
      //   570: istore #5
      //   572: aload_1
      //   573: invokevirtual L : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   576: checkcast androidx/constraintlayout/solver/widgets/d
      //   579: astore #10
      //   581: aload #10
      //   583: ifnull -> 744
      //   586: aload_0
      //   587: getfield h : Landroidx/constraintlayout/widget/ConstraintLayout;
      //   590: invokestatic b : (Landroidx/constraintlayout/widget/ConstraintLayout;)I
      //   593: sipush #256
      //   596: invokestatic b : (II)Z
      //   599: ifeq -> 744
      //   602: aload #9
      //   604: invokevirtual getMeasuredWidth : ()I
      //   607: aload_1
      //   608: invokevirtual U : ()I
      //   611: if_icmpne -> 744
      //   614: aload #9
      //   616: invokevirtual getMeasuredWidth : ()I
      //   619: aload #10
      //   621: invokevirtual U : ()I
      //   624: if_icmpge -> 744
      //   627: aload #9
      //   629: invokevirtual getMeasuredHeight : ()I
      //   632: aload_1
      //   633: invokevirtual y : ()I
      //   636: if_icmpne -> 744
      //   639: aload #9
      //   641: invokevirtual getMeasuredHeight : ()I
      //   644: aload #10
      //   646: invokevirtual y : ()I
      //   649: if_icmpge -> 744
      //   652: aload #9
      //   654: invokevirtual getBaseline : ()I
      //   657: aload_1
      //   658: invokevirtual q : ()I
      //   661: if_icmpne -> 744
      //   664: aload_1
      //   665: invokevirtual g0 : ()Z
      //   668: ifne -> 744
      //   671: aload_0
      //   672: aload_1
      //   673: invokevirtual D : ()I
      //   676: iload #8
      //   678: aload_1
      //   679: invokevirtual U : ()I
      //   682: invokespecial d : (III)Z
      //   685: ifeq -> 711
      //   688: aload_0
      //   689: aload_1
      //   690: invokevirtual E : ()I
      //   693: iload #5
      //   695: aload_1
      //   696: invokevirtual y : ()I
      //   699: invokespecial d : (III)Z
      //   702: ifeq -> 711
      //   705: iconst_1
      //   706: istore #11
      //   708: goto -> 714
      //   711: iconst_0
      //   712: istore #11
      //   714: iload #11
      //   716: ifeq -> 744
      //   719: aload_2
      //   720: aload_1
      //   721: invokevirtual U : ()I
      //   724: putfield h : I
      //   727: aload_2
      //   728: aload_1
      //   729: invokevirtual y : ()I
      //   732: putfield i : I
      //   735: aload_2
      //   736: aload_1
      //   737: invokevirtual q : ()I
      //   740: putfield j : I
      //   743: return
      //   744: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
      //   747: astore #10
      //   749: aload_3
      //   750: aload #10
      //   752: if_acmpne -> 761
      //   755: iconst_1
      //   756: istore #11
      //   758: goto -> 764
      //   761: iconst_0
      //   762: istore #11
      //   764: aload #4
      //   766: aload #10
      //   768: if_acmpne -> 777
      //   771: iconst_1
      //   772: istore #7
      //   774: goto -> 780
      //   777: iconst_0
      //   778: istore #7
      //   780: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.e : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
      //   783: astore #10
      //   785: aload #4
      //   787: aload #10
      //   789: if_acmpeq -> 809
      //   792: aload #4
      //   794: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
      //   797: if_acmpne -> 803
      //   800: goto -> 809
      //   803: iconst_0
      //   804: istore #13
      //   806: goto -> 812
      //   809: iconst_1
      //   810: istore #13
      //   812: aload_3
      //   813: aload #10
      //   815: if_acmpeq -> 834
      //   818: aload_3
      //   819: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
      //   822: if_acmpne -> 828
      //   825: goto -> 834
      //   828: iconst_0
      //   829: istore #14
      //   831: goto -> 837
      //   834: iconst_1
      //   835: istore #14
      //   837: iload #11
      //   839: ifeq -> 857
      //   842: aload_1
      //   843: getfield Z : F
      //   846: fconst_0
      //   847: fcmpl
      //   848: ifle -> 857
      //   851: iconst_1
      //   852: istore #15
      //   854: goto -> 860
      //   857: iconst_0
      //   858: istore #15
      //   860: iload #7
      //   862: ifeq -> 880
      //   865: aload_1
      //   866: getfield Z : F
      //   869: fconst_0
      //   870: fcmpl
      //   871: ifle -> 880
      //   874: iconst_1
      //   875: istore #16
      //   877: goto -> 883
      //   880: iconst_0
      //   881: istore #16
      //   883: aload #9
      //   885: ifnonnull -> 889
      //   888: return
      //   889: aload #9
      //   891: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   894: checkcast androidx/constraintlayout/widget/ConstraintLayout$LayoutParams
      //   897: astore_3
      //   898: aload_2
      //   899: getfield m : I
      //   902: istore #6
      //   904: iload #6
      //   906: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.b : I
      //   909: if_icmpeq -> 959
      //   912: iload #6
      //   914: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.c : I
      //   917: if_icmpeq -> 959
      //   920: iload #11
      //   922: ifeq -> 959
      //   925: aload_1
      //   926: getfield q : I
      //   929: ifne -> 959
      //   932: iload #7
      //   934: ifeq -> 959
      //   937: aload_1
      //   938: getfield r : I
      //   941: ifeq -> 947
      //   944: goto -> 959
      //   947: iconst_0
      //   948: istore #11
      //   950: iconst_0
      //   951: istore #12
      //   953: iconst_0
      //   954: istore #13
      //   956: goto -> 1350
      //   959: aload #9
      //   961: instanceof androidx/constraintlayout/widget/VirtualLayout
      //   964: ifeq -> 997
      //   967: aload_1
      //   968: instanceof androidx/constraintlayout/solver/widgets/j
      //   971: ifeq -> 997
      //   974: aload_1
      //   975: checkcast androidx/constraintlayout/solver/widgets/j
      //   978: astore #4
      //   980: aload #9
      //   982: checkcast androidx/constraintlayout/widget/VirtualLayout
      //   985: aload #4
      //   987: iload #8
      //   989: iload #5
      //   991: invokevirtual w : (Landroidx/constraintlayout/solver/widgets/j;II)V
      //   994: goto -> 1006
      //   997: aload #9
      //   999: iload #8
      //   1001: iload #5
      //   1003: invokevirtual measure : (II)V
      //   1006: aload_1
      //   1007: iload #8
      //   1009: iload #5
      //   1011: invokevirtual J0 : (II)V
      //   1014: aload #9
      //   1016: invokevirtual getMeasuredWidth : ()I
      //   1019: istore #17
      //   1021: aload #9
      //   1023: invokevirtual getMeasuredHeight : ()I
      //   1026: istore #18
      //   1028: aload #9
      //   1030: invokevirtual getBaseline : ()I
      //   1033: istore #19
      //   1035: aload_1
      //   1036: getfield t : I
      //   1039: istore #11
      //   1041: iload #11
      //   1043: ifle -> 1058
      //   1046: iload #11
      //   1048: iload #17
      //   1050: invokestatic max : (II)I
      //   1053: istore #7
      //   1055: goto -> 1062
      //   1058: iload #17
      //   1060: istore #7
      //   1062: aload_1
      //   1063: getfield u : I
      //   1066: istore #6
      //   1068: iload #7
      //   1070: istore #11
      //   1072: iload #6
      //   1074: ifle -> 1086
      //   1077: iload #6
      //   1079: iload #7
      //   1081: invokestatic min : (II)I
      //   1084: istore #11
      //   1086: aload_1
      //   1087: getfield w : I
      //   1090: istore #7
      //   1092: iload #7
      //   1094: ifle -> 1109
      //   1097: iload #7
      //   1099: iload #18
      //   1101: invokestatic max : (II)I
      //   1104: istore #7
      //   1106: goto -> 1113
      //   1109: iload #18
      //   1111: istore #7
      //   1113: aload_1
      //   1114: getfield x : I
      //   1117: istore #6
      //   1119: iload #7
      //   1121: istore #12
      //   1123: iload #6
      //   1125: ifle -> 1137
      //   1128: iload #6
      //   1130: iload #7
      //   1132: invokestatic min : (II)I
      //   1135: istore #12
      //   1137: iload #12
      //   1139: istore #7
      //   1141: iload #11
      //   1143: istore #6
      //   1145: aload_0
      //   1146: getfield h : Landroidx/constraintlayout/widget/ConstraintLayout;
      //   1149: invokestatic b : (Landroidx/constraintlayout/widget/ConstraintLayout;)I
      //   1152: iconst_1
      //   1153: invokestatic b : (II)Z
      //   1156: ifne -> 1242
      //   1159: iload #15
      //   1161: ifeq -> 1194
      //   1164: iload #13
      //   1166: ifeq -> 1194
      //   1169: aload_1
      //   1170: getfield Z : F
      //   1173: fstore #20
      //   1175: iload #12
      //   1177: i2f
      //   1178: fload #20
      //   1180: fmul
      //   1181: ldc 0.5
      //   1183: fadd
      //   1184: f2i
      //   1185: istore #6
      //   1187: iload #12
      //   1189: istore #7
      //   1191: goto -> 1242
      //   1194: iload #12
      //   1196: istore #7
      //   1198: iload #11
      //   1200: istore #6
      //   1202: iload #16
      //   1204: ifeq -> 1242
      //   1207: iload #12
      //   1209: istore #7
      //   1211: iload #11
      //   1213: istore #6
      //   1215: iload #14
      //   1217: ifeq -> 1242
      //   1220: aload_1
      //   1221: getfield Z : F
      //   1224: fstore #20
      //   1226: iload #11
      //   1228: i2f
      //   1229: fload #20
      //   1231: fdiv
      //   1232: ldc 0.5
      //   1234: fadd
      //   1235: f2i
      //   1236: istore #7
      //   1238: iload #11
      //   1240: istore #6
      //   1242: iload #17
      //   1244: iload #6
      //   1246: if_icmpne -> 1274
      //   1249: iload #7
      //   1251: istore #11
      //   1253: iload #19
      //   1255: istore #12
      //   1257: iload #6
      //   1259: istore #13
      //   1261: iload #18
      //   1263: iload #7
      //   1265: if_icmpeq -> 1271
      //   1268: goto -> 1274
      //   1271: goto -> 1350
      //   1274: iload #17
      //   1276: iload #6
      //   1278: if_icmpeq -> 1293
      //   1281: iload #6
      //   1283: ldc 1073741824
      //   1285: invokestatic makeMeasureSpec : (II)I
      //   1288: istore #8
      //   1290: goto -> 1293
      //   1293: iload #18
      //   1295: iload #7
      //   1297: if_icmpeq -> 1309
      //   1300: iload #7
      //   1302: ldc 1073741824
      //   1304: invokestatic makeMeasureSpec : (II)I
      //   1307: istore #5
      //   1309: aload #9
      //   1311: iload #8
      //   1313: iload #5
      //   1315: invokevirtual measure : (II)V
      //   1318: aload_1
      //   1319: iload #8
      //   1321: iload #5
      //   1323: invokevirtual J0 : (II)V
      //   1326: aload #9
      //   1328: invokevirtual getMeasuredWidth : ()I
      //   1331: istore #13
      //   1333: aload #9
      //   1335: invokevirtual getMeasuredHeight : ()I
      //   1338: istore #11
      //   1340: aload #9
      //   1342: invokevirtual getBaseline : ()I
      //   1345: istore #12
      //   1347: goto -> 1271
      //   1350: iload #12
      //   1352: iconst_m1
      //   1353: if_icmpeq -> 1362
      //   1356: iconst_1
      //   1357: istore #21
      //   1359: goto -> 1365
      //   1362: iconst_0
      //   1363: istore #21
      //   1365: iload #13
      //   1367: aload_2
      //   1368: getfield f : I
      //   1371: if_icmpne -> 1392
      //   1374: iload #11
      //   1376: aload_2
      //   1377: getfield g : I
      //   1380: if_icmpeq -> 1386
      //   1383: goto -> 1392
      //   1386: iconst_0
      //   1387: istore #22
      //   1389: goto -> 1395
      //   1392: iconst_1
      //   1393: istore #22
      //   1395: aload_2
      //   1396: iload #22
      //   1398: putfield l : Z
      //   1401: aload_3
      //   1402: getfield Y : Z
      //   1405: ifeq -> 1411
      //   1408: iconst_1
      //   1409: istore #21
      //   1411: iload #21
      //   1413: ifeq -> 1436
      //   1416: iload #12
      //   1418: iconst_m1
      //   1419: if_icmpeq -> 1436
      //   1422: aload_1
      //   1423: invokevirtual q : ()I
      //   1426: iload #12
      //   1428: if_icmpeq -> 1436
      //   1431: aload_2
      //   1432: iconst_1
      //   1433: putfield l : Z
      //   1436: aload_2
      //   1437: iload #13
      //   1439: putfield h : I
      //   1442: aload_2
      //   1443: iload #11
      //   1445: putfield i : I
      //   1448: aload_2
      //   1449: iload #21
      //   1451: putfield k : Z
      //   1454: aload_2
      //   1455: iload #12
      //   1457: putfield j : I
      //   1460: return
    }
    
    public void c(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      this.b = param1Int3;
      this.c = param1Int4;
      this.d = param1Int5;
      this.e = param1Int6;
      this.f = param1Int1;
      this.g = param1Int2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/ConstraintLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */