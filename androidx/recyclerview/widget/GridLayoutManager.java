package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b.h.k.f0.c;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
  boolean I = false;
  
  int J = -1;
  
  int[] K;
  
  View[] L;
  
  final SparseIntArray M = new SparseIntArray();
  
  final SparseIntArray N = new SparseIntArray();
  
  b O = new a();
  
  final Rect P = new Rect();
  
  private boolean Q;
  
  public GridLayoutManager(Context paramContext, int paramInt) {
    super(paramContext);
    c3(paramInt);
  }
  
  public GridLayoutManager(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean) {
    super(paramContext, paramInt2, paramBoolean);
    c3(paramInt1);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    c3((RecyclerView.o.i0(paramContext, paramAttributeSet, paramInt1, paramInt2)).b);
  }
  
  private void L2(RecyclerView.u paramu, RecyclerView.y paramy, int paramInt, boolean paramBoolean) {
    byte b1;
    int i = 0;
    int j = -1;
    if (paramBoolean) {
      boolean bool = false;
      b1 = 1;
      j = paramInt;
      paramInt = bool;
    } else {
      paramInt--;
      b1 = -1;
    } 
    while (paramInt != j) {
      View view = this.L[paramInt];
      LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
      int k = Y2(paramu, paramy, h0(view));
      layoutParams.f = k;
      layoutParams.e = i;
      i += k;
      paramInt += b1;
    } 
  }
  
  private void M2() {
    int i = J();
    for (byte b1 = 0; b1 < i; b1++) {
      LayoutParams layoutParams = (LayoutParams)I(b1).getLayoutParams();
      int j = layoutParams.a();
      this.M.put(j, layoutParams.f());
      this.N.put(j, layoutParams.e());
    } 
  }
  
  private void N2(int paramInt) {
    this.K = O2(this.K, this.J, paramInt);
  }
  
  static int[] O2(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: ifnull -> 27
    //   6: aload_0
    //   7: arraylength
    //   8: iload_1
    //   9: iconst_1
    //   10: iadd
    //   11: if_icmpne -> 27
    //   14: aload_0
    //   15: astore #4
    //   17: aload_0
    //   18: aload_0
    //   19: arraylength
    //   20: iconst_1
    //   21: isub
    //   22: iaload
    //   23: iload_2
    //   24: if_icmpeq -> 34
    //   27: iload_1
    //   28: iconst_1
    //   29: iadd
    //   30: newarray int
    //   32: astore #4
    //   34: iconst_0
    //   35: istore #5
    //   37: aload #4
    //   39: iconst_0
    //   40: iconst_0
    //   41: iastore
    //   42: iload_2
    //   43: iload_1
    //   44: idiv
    //   45: istore #6
    //   47: iload_2
    //   48: iload_1
    //   49: irem
    //   50: istore #7
    //   52: iconst_0
    //   53: istore #8
    //   55: iload #5
    //   57: istore_2
    //   58: iload_3
    //   59: iload_1
    //   60: if_icmpgt -> 116
    //   63: iload_2
    //   64: iload #7
    //   66: iadd
    //   67: istore_2
    //   68: iload_2
    //   69: ifle -> 93
    //   72: iload_1
    //   73: iload_2
    //   74: isub
    //   75: iload #7
    //   77: if_icmpge -> 93
    //   80: iload #6
    //   82: iconst_1
    //   83: iadd
    //   84: istore #5
    //   86: iload_2
    //   87: iload_1
    //   88: isub
    //   89: istore_2
    //   90: goto -> 97
    //   93: iload #6
    //   95: istore #5
    //   97: iload #8
    //   99: iload #5
    //   101: iadd
    //   102: istore #8
    //   104: aload #4
    //   106: iload_3
    //   107: iload #8
    //   109: iastore
    //   110: iinc #3, 1
    //   113: goto -> 58
    //   116: aload #4
    //   118: areturn
  }
  
  private void P2() {
    this.M.clear();
    this.N.clear();
  }
  
  private int Q2(RecyclerView.y paramy) {
    if (J() != 0 && paramy.b() != 0) {
      U1();
      boolean bool = o2();
      View view1 = Y1(bool ^ true, true);
      View view2 = X1(bool ^ true, true);
      if (view1 != null && view2 != null) {
        int i = this.O.b(h0(view1), this.J);
        int j = this.O.b(h0(view2), this.J);
        int k = Math.min(i, j);
        i = Math.max(i, j);
        j = this.O.b(paramy.b() - 1, this.J);
        if (this.x) {
          k = Math.max(0, j + 1 - i - 1);
        } else {
          k = Math.max(0, k);
        } 
        if (!bool)
          return k; 
        i = Math.abs(this.u.d(view2) - this.u.g(view1));
        j = this.O.b(h0(view1), this.J);
        int m = this.O.b(h0(view2), this.J);
        float f = i / (m - j + 1);
        return Math.round(k * f + (this.u.m() - this.u.g(view1)));
      } 
    } 
    return 0;
  }
  
  private int R2(RecyclerView.y paramy) {
    if (J() != 0 && paramy.b() != 0) {
      U1();
      View view1 = Y1(o2() ^ true, true);
      View view2 = X1(o2() ^ true, true);
      if (view1 != null && view2 != null) {
        if (!o2())
          return this.O.b(paramy.b() - 1, this.J) + 1; 
        int i = this.u.d(view2);
        int j = this.u.g(view1);
        int k = this.O.b(h0(view1), this.J);
        int m = this.O.b(h0(view2), this.J);
        int n = this.O.b(paramy.b() - 1, this.J);
        return (int)((i - j) / (m - k + 1) * (n + 1));
      } 
    } 
    return 0;
  }
  
  private void S2(RecyclerView.u paramu, RecyclerView.y paramy, LinearLayoutManager.a parama, int paramInt) {
    if (paramInt == 1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    int i = X2(paramu, paramy, parama.b);
    if (paramInt != 0) {
      while (i > 0) {
        paramInt = parama.b;
        if (paramInt > 0) {
          parama.b = --paramInt;
          i = X2(paramu, paramy, paramInt);
        } 
      } 
    } else {
      int j = paramy.b();
      paramInt = parama.b;
      while (paramInt < j - 1) {
        int k = paramInt + 1;
        int m = X2(paramu, paramy, k);
        if (m > i) {
          paramInt = k;
          i = m;
        } 
      } 
      parama.b = paramInt;
    } 
  }
  
  private void T2() {
    View[] arrayOfView = this.L;
    if (arrayOfView == null || arrayOfView.length != this.J)
      this.L = new View[this.J]; 
  }
  
  private int W2(RecyclerView.u paramu, RecyclerView.y paramy, int paramInt) {
    if (!paramy.e())
      return this.O.b(paramInt, this.J); 
    int i = paramu.f(paramInt);
    if (i == -1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot find span size for pre layout position. ");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 0;
    } 
    return this.O.b(i, this.J);
  }
  
  private int X2(RecyclerView.u paramu, RecyclerView.y paramy, int paramInt) {
    if (!paramy.e())
      return this.O.c(paramInt, this.J); 
    int i = this.N.get(paramInt, -1);
    if (i != -1)
      return i; 
    i = paramu.f(paramInt);
    if (i == -1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 0;
    } 
    return this.O.c(i, this.J);
  }
  
  private int Y2(RecyclerView.u paramu, RecyclerView.y paramy, int paramInt) {
    if (!paramy.e())
      return this.O.f(paramInt); 
    int i = this.M.get(paramInt, -1);
    if (i != -1)
      return i; 
    i = paramu.f(paramInt);
    if (i == -1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      stringBuilder.append(paramInt);
      Log.w("GridLayoutManager", stringBuilder.toString());
      return 1;
    } 
    return this.O.f(i);
  }
  
  private void Z2(float paramFloat, int paramInt) {
    N2(Math.max(Math.round(paramFloat * this.J), paramInt));
  }
  
  private void a3(View paramView, int paramInt, boolean paramBoolean) {
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    Rect rect = layoutParams.b;
    int i = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
    int j = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
    int k = U2(layoutParams.e, layoutParams.f);
    if (this.s == 1) {
      j = RecyclerView.o.K(k, paramInt, j, layoutParams.width, false);
      paramInt = RecyclerView.o.K(this.u.n(), X(), i, layoutParams.height, true);
    } else {
      paramInt = RecyclerView.o.K(k, paramInt, i, layoutParams.height, false);
      j = RecyclerView.o.K(this.u.n(), p0(), j, layoutParams.width, true);
    } 
    b3(paramView, j, paramInt, paramBoolean);
  }
  
  private void b3(View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    if (paramBoolean) {
      paramBoolean = I1(paramView, paramInt1, paramInt2, layoutParams);
    } else {
      paramBoolean = G1(paramView, paramInt1, paramInt2, layoutParams);
    } 
    if (paramBoolean)
      paramView.measure(paramInt1, paramInt2); 
  }
  
  private void e3() {
    int i;
    int j;
    if (m2() == 1) {
      i = o0() - f0();
      j = e0();
    } else {
      i = W() - d0();
      j = g0();
    } 
    N2(i - j);
  }
  
  public void C2(boolean paramBoolean) {
    if (!paramBoolean) {
      super.C2(false);
      return;
    } 
    throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
  }
  
  public RecyclerView.LayoutParams D() {
    return (this.s == 0) ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
  }
  
  public void D1(Rect paramRect, int paramInt1, int paramInt2) {
    int[] arrayOfInt;
    if (this.K == null)
      super.D1(paramRect, paramInt1, paramInt2); 
    int i = e0() + f0();
    int j = g0() + d0();
    if (this.s == 1) {
      paramInt2 = RecyclerView.o.n(paramInt2, paramRect.height() + j, b0());
      arrayOfInt = this.K;
      i = RecyclerView.o.n(paramInt1, arrayOfInt[arrayOfInt.length - 1] + i, c0());
      paramInt1 = paramInt2;
      paramInt2 = i;
    } else {
      paramInt1 = RecyclerView.o.n(paramInt1, arrayOfInt.width() + i, c0());
      arrayOfInt = this.K;
      i = RecyclerView.o.n(paramInt2, arrayOfInt[arrayOfInt.length - 1] + j, b0());
      paramInt2 = paramInt1;
      paramInt1 = i;
    } 
    C1(paramInt2, paramInt1);
  }
  
  public RecyclerView.LayoutParams E(Context paramContext, AttributeSet paramAttributeSet) {
    return new LayoutParams(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.LayoutParams F(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams) : new LayoutParams(paramLayoutParams);
  }
  
  public View J0(View paramView, int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual B : (Landroid/view/View;)Landroid/view/View;
    //   5: astore #5
    //   7: aconst_null
    //   8: astore #6
    //   10: aload #5
    //   12: ifnonnull -> 17
    //   15: aconst_null
    //   16: areturn
    //   17: aload #5
    //   19: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   22: checkcast androidx/recyclerview/widget/GridLayoutManager$LayoutParams
    //   25: astore #7
    //   27: aload #7
    //   29: getfield e : I
    //   32: istore #8
    //   34: aload #7
    //   36: getfield f : I
    //   39: iload #8
    //   41: iadd
    //   42: istore #9
    //   44: aload_0
    //   45: aload_1
    //   46: iload_2
    //   47: aload_3
    //   48: aload #4
    //   50: invokespecial J0 : (Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)Landroid/view/View;
    //   53: ifnonnull -> 58
    //   56: aconst_null
    //   57: areturn
    //   58: aload_0
    //   59: iload_2
    //   60: invokevirtual S1 : (I)I
    //   63: iconst_1
    //   64: if_icmpne -> 73
    //   67: iconst_1
    //   68: istore #10
    //   70: goto -> 76
    //   73: iconst_0
    //   74: istore #10
    //   76: iload #10
    //   78: aload_0
    //   79: getfield x : Z
    //   82: if_icmpeq -> 90
    //   85: iconst_1
    //   86: istore_2
    //   87: goto -> 92
    //   90: iconst_0
    //   91: istore_2
    //   92: iload_2
    //   93: ifeq -> 112
    //   96: aload_0
    //   97: invokevirtual J : ()I
    //   100: iconst_1
    //   101: isub
    //   102: istore_2
    //   103: iconst_m1
    //   104: istore #11
    //   106: iconst_m1
    //   107: istore #12
    //   109: goto -> 123
    //   112: aload_0
    //   113: invokevirtual J : ()I
    //   116: istore #11
    //   118: iconst_0
    //   119: istore_2
    //   120: iconst_1
    //   121: istore #12
    //   123: aload_0
    //   124: getfield s : I
    //   127: iconst_1
    //   128: if_icmpne -> 144
    //   131: aload_0
    //   132: invokevirtual n2 : ()Z
    //   135: ifeq -> 144
    //   138: iconst_1
    //   139: istore #13
    //   141: goto -> 147
    //   144: iconst_0
    //   145: istore #13
    //   147: aload_0
    //   148: aload_3
    //   149: aload #4
    //   151: iload_2
    //   152: invokespecial W2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;I)I
    //   155: istore #14
    //   157: iload_2
    //   158: istore #15
    //   160: iconst_0
    //   161: istore #16
    //   163: iconst_m1
    //   164: istore #17
    //   166: iconst_m1
    //   167: istore #18
    //   169: iconst_0
    //   170: istore_2
    //   171: aconst_null
    //   172: astore_1
    //   173: iload #11
    //   175: istore #19
    //   177: iload #16
    //   179: istore #11
    //   181: iload #15
    //   183: iload #19
    //   185: if_icmpeq -> 568
    //   188: aload_0
    //   189: aload_3
    //   190: aload #4
    //   192: iload #15
    //   194: invokespecial W2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;I)I
    //   197: istore #16
    //   199: aload_0
    //   200: iload #15
    //   202: invokevirtual I : (I)Landroid/view/View;
    //   205: astore #7
    //   207: aload #7
    //   209: aload #5
    //   211: if_acmpne -> 217
    //   214: goto -> 568
    //   217: aload #7
    //   219: invokevirtual hasFocusable : ()Z
    //   222: ifeq -> 243
    //   225: iload #16
    //   227: iload #14
    //   229: if_icmpeq -> 243
    //   232: aload #6
    //   234: ifnull -> 240
    //   237: goto -> 568
    //   240: goto -> 558
    //   243: aload #7
    //   245: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   248: checkcast androidx/recyclerview/widget/GridLayoutManager$LayoutParams
    //   251: astore #20
    //   253: aload #20
    //   255: getfield e : I
    //   258: istore #21
    //   260: aload #20
    //   262: getfield f : I
    //   265: iload #21
    //   267: iadd
    //   268: istore #22
    //   270: aload #7
    //   272: invokevirtual hasFocusable : ()Z
    //   275: ifeq -> 295
    //   278: iload #21
    //   280: iload #8
    //   282: if_icmpne -> 295
    //   285: iload #22
    //   287: iload #9
    //   289: if_icmpne -> 295
    //   292: aload #7
    //   294: areturn
    //   295: aload #7
    //   297: invokevirtual hasFocusable : ()Z
    //   300: ifeq -> 308
    //   303: aload #6
    //   305: ifnull -> 320
    //   308: aload #7
    //   310: invokevirtual hasFocusable : ()Z
    //   313: ifne -> 326
    //   316: aload_1
    //   317: ifnonnull -> 326
    //   320: iconst_1
    //   321: istore #16
    //   323: goto -> 477
    //   326: iload #21
    //   328: iload #8
    //   330: invokestatic max : (II)I
    //   333: istore #16
    //   335: iload #22
    //   337: iload #9
    //   339: invokestatic min : (II)I
    //   342: iload #16
    //   344: isub
    //   345: istore #23
    //   347: aload #7
    //   349: invokevirtual hasFocusable : ()Z
    //   352: ifeq -> 398
    //   355: iload #23
    //   357: iload #11
    //   359: if_icmple -> 365
    //   362: goto -> 320
    //   365: iload #23
    //   367: iload #11
    //   369: if_icmpne -> 474
    //   372: iload #21
    //   374: iload #17
    //   376: if_icmple -> 385
    //   379: iconst_1
    //   380: istore #16
    //   382: goto -> 388
    //   385: iconst_0
    //   386: istore #16
    //   388: iload #13
    //   390: iload #16
    //   392: if_icmpne -> 474
    //   395: goto -> 362
    //   398: aload #6
    //   400: ifnonnull -> 474
    //   403: iconst_1
    //   404: istore #24
    //   406: iconst_1
    //   407: istore #25
    //   409: aload_0
    //   410: aload #7
    //   412: iconst_0
    //   413: iconst_1
    //   414: invokevirtual y0 : (Landroid/view/View;ZZ)Z
    //   417: ifeq -> 474
    //   420: iload_2
    //   421: istore #16
    //   423: iload #23
    //   425: iload #16
    //   427: if_icmple -> 437
    //   430: iload #24
    //   432: istore #16
    //   434: goto -> 477
    //   437: iload #23
    //   439: iload #16
    //   441: if_icmpne -> 471
    //   444: iload #21
    //   446: iload #18
    //   448: if_icmple -> 458
    //   451: iload #25
    //   453: istore #16
    //   455: goto -> 461
    //   458: iconst_0
    //   459: istore #16
    //   461: iload #13
    //   463: iload #16
    //   465: if_icmpne -> 474
    //   468: goto -> 320
    //   471: goto -> 474
    //   474: iconst_0
    //   475: istore #16
    //   477: iload #16
    //   479: ifeq -> 558
    //   482: aload #7
    //   484: invokevirtual hasFocusable : ()Z
    //   487: ifeq -> 529
    //   490: aload #20
    //   492: getfield e : I
    //   495: istore #17
    //   497: iload #22
    //   499: iload #9
    //   501: invokestatic min : (II)I
    //   504: istore #11
    //   506: iload #21
    //   508: iload #8
    //   510: invokestatic max : (II)I
    //   513: istore #16
    //   515: aload #7
    //   517: astore #6
    //   519: iload #11
    //   521: iload #16
    //   523: isub
    //   524: istore #11
    //   526: goto -> 558
    //   529: aload #20
    //   531: getfield e : I
    //   534: istore #18
    //   536: iload #22
    //   538: iload #9
    //   540: invokestatic min : (II)I
    //   543: iload #21
    //   545: iload #8
    //   547: invokestatic max : (II)I
    //   550: isub
    //   551: istore_2
    //   552: aload #7
    //   554: astore_1
    //   555: goto -> 558
    //   558: iload #15
    //   560: iload #12
    //   562: iadd
    //   563: istore #15
    //   565: goto -> 181
    //   568: aload #6
    //   570: ifnull -> 576
    //   573: goto -> 579
    //   576: aload_1
    //   577: astore #6
    //   579: aload #6
    //   581: areturn
  }
  
  public boolean M1() {
    boolean bool;
    if (this.D == null && !this.I) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int N(RecyclerView.u paramu, RecyclerView.y paramy) {
    return (this.s == 1) ? this.J : ((paramy.b() < 1) ? 0 : (W2(paramu, paramy, paramy.b() - 1) + 1));
  }
  
  void O1(RecyclerView.y paramy, LinearLayoutManager.c paramc, RecyclerView.o.c paramc1) {
    int i = this.J;
    for (byte b1 = 0; b1 < this.J && paramc.c(paramy) && i > 0; b1++) {
      int j = paramc.d;
      paramc1.a(j, Math.max(0, paramc.g));
      i -= this.O.f(j);
      paramc.d += paramc.e;
    } 
  }
  
  public void P0(RecyclerView.u paramu, RecyclerView.y paramy, View paramView, c paramc) {
    ViewGroup.LayoutParams layoutParams1 = paramView.getLayoutParams();
    if (!(layoutParams1 instanceof LayoutParams)) {
      O0(paramView, paramc);
      return;
    } 
    LayoutParams layoutParams = (LayoutParams)layoutParams1;
    int i = W2(paramu, paramy, layoutParams.a());
    if (this.s == 0) {
      paramc.f0(c.c.a(layoutParams.e(), layoutParams.f(), i, 1, false, false));
    } else {
      paramc.f0(c.c.a(i, 1, layoutParams.e(), layoutParams.f(), false, false));
    } 
  }
  
  public void R0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    this.O.h();
    this.O.g();
  }
  
  public void S0(RecyclerView paramRecyclerView) {
    this.O.h();
    this.O.g();
  }
  
  public void T0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {
    this.O.h();
    this.O.g();
  }
  
  public void U0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    this.O.h();
    this.O.g();
  }
  
  int U2(int paramInt1, int paramInt2) {
    if (this.s == 1 && n2()) {
      int[] arrayOfInt1 = this.K;
      int i = this.J;
      return arrayOfInt1[i - paramInt1] - arrayOfInt1[i - paramInt1 - paramInt2];
    } 
    int[] arrayOfInt = this.K;
    return arrayOfInt[paramInt2 + paramInt1] - arrayOfInt[paramInt1];
  }
  
  public int V2() {
    return this.J;
  }
  
  public void W0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject) {
    this.O.h();
    this.O.g();
  }
  
  public void X0(RecyclerView.u paramu, RecyclerView.y paramy) {
    if (paramy.e())
      M2(); 
    super.X0(paramu, paramy);
    P2();
  }
  
  public void Y0(RecyclerView.y paramy) {
    super.Y0(paramy);
    this.I = false;
  }
  
  public void c3(int paramInt) {
    if (paramInt == this.J)
      return; 
    this.I = true;
    if (paramInt >= 1) {
      this.J = paramInt;
      this.O.h();
      t1();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Span count should be at least 1. Provided ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void d3(b paramb) {
    this.O = paramb;
  }
  
  View g2(RecyclerView.u paramu, RecyclerView.y paramy, boolean paramBoolean1, boolean paramBoolean2) {
    int i = J();
    int j = -1;
    byte b1 = 1;
    if (paramBoolean2) {
      i = J() - 1;
      b1 = -1;
    } else {
      j = i;
      i = 0;
    } 
    int k = paramy.b();
    U1();
    int m = this.u.m();
    int n = this.u.i();
    View view1 = null;
    View view2;
    for (view2 = null; i != j; view2 = view5) {
      View view3 = I(i);
      int i1 = h0(view3);
      View view4 = view1;
      View view5 = view2;
      if (i1 >= 0) {
        view4 = view1;
        view5 = view2;
        if (i1 < k)
          if (X2(paramu, paramy, i1) != 0) {
            view4 = view1;
            view5 = view2;
          } else if (((RecyclerView.LayoutParams)view3.getLayoutParams()).c()) {
            view4 = view1;
            view5 = view2;
            if (view2 == null) {
              view5 = view3;
              view4 = view1;
            } 
          } else if (this.u.g(view3) >= n || this.u.d(view3) < m) {
            view4 = view1;
            view5 = view2;
            if (view1 == null) {
              view4 = view3;
              view5 = view2;
            } 
          } else {
            return view3;
          }  
      } 
      i += b1;
      view1 = view4;
    } 
    if (view1 == null)
      view1 = view2; 
    return view1;
  }
  
  public int k0(RecyclerView.u paramu, RecyclerView.y paramy) {
    return (this.s == 0) ? this.J : ((paramy.b() < 1) ? 0 : (W2(paramu, paramy, paramy.b() - 1) + 1));
  }
  
  public boolean m(RecyclerView.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  void p2(RecyclerView.u paramu, RecyclerView.y paramy, LinearLayoutManager.c paramc, LinearLayoutManager.b paramb) {
    StringBuilder stringBuilder;
    int j;
    int k;
    boolean bool;
    int i = this.u.l();
    if (i != 1073741824) {
      j = 1;
    } else {
      j = 0;
    } 
    if (J() > 0) {
      k = this.K[this.J];
    } else {
      k = 0;
    } 
    if (j)
      e3(); 
    if (paramc.e == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    int m = this.J;
    if (!bool)
      m = X2(paramu, paramy, paramc.d) + Y2(paramu, paramy, paramc.d); 
    byte b1 = 0;
    while (b1 < this.J && paramc.c(paramy) && m > 0) {
      int i2 = paramc.d;
      int i3 = Y2(paramu, paramy, i2);
      if (i3 <= this.J) {
        m -= i3;
        if (m < 0)
          break; 
        View view = paramc.d(paramu);
        if (view == null)
          break; 
        this.L[b1] = view;
        b1++;
        continue;
      } 
      stringBuilder = new StringBuilder();
      stringBuilder.append("Item at position ");
      stringBuilder.append(i2);
      stringBuilder.append(" requires ");
      stringBuilder.append(i3);
      stringBuilder.append(" spans but GridLayoutManager has only ");
      stringBuilder.append(this.J);
      stringBuilder.append(" spans.");
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    if (b1 == 0) {
      paramb.b = true;
      return;
    } 
    float f = 0.0F;
    L2((RecyclerView.u)stringBuilder, paramy, b1, bool);
    int i1 = 0;
    m = 0;
    while (i1 < b1) {
      View view = this.L[i1];
      if (paramc.l == null) {
        if (bool) {
          d(view);
        } else {
          e(view, 0);
        } 
      } else if (bool) {
        b(view);
      } else {
        c(view, 0);
      } 
      j(view, this.P);
      a3(view, i, false);
      int i3 = this.u.e(view);
      int i2 = m;
      if (i3 > m)
        i2 = i3; 
      LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
      float f1 = this.u.f(view) * 1.0F / layoutParams.f;
      float f2 = f;
      if (f1 > f)
        f2 = f1; 
      i1++;
      m = i2;
      f = f2;
    } 
    int n = m;
    if (j) {
      Z2(f, k);
      j = 0;
      m = 0;
      while (true) {
        n = m;
        if (j < b1) {
          View view = this.L[j];
          a3(view, 1073741824, true);
          k = this.u.e(view);
          n = m;
          if (k > m)
            n = k; 
          j++;
          m = n;
          continue;
        } 
        break;
      } 
    } 
    for (m = 0; m < b1; m++) {
      View view = this.L[m];
      if (this.u.e(view) != n) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        Rect rect = layoutParams.b;
        k = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        j = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        i1 = U2(layoutParams.e, layoutParams.f);
        if (this.s == 1) {
          j = RecyclerView.o.K(i1, 1073741824, j, layoutParams.width, false);
          k = View.MeasureSpec.makeMeasureSpec(n - k, 1073741824);
        } else {
          j = View.MeasureSpec.makeMeasureSpec(n - j, 1073741824);
          k = RecyclerView.o.K(i1, 1073741824, k, layoutParams.height, false);
        } 
        b3(view, j, k, true);
      } 
    } 
    byte b2 = 0;
    paramb.a = n;
    if (this.s == 1) {
      if (paramc.f == -1) {
        m = paramc.b;
        n = m - n;
      } else {
        j = paramc.b;
        m = j;
        j = n + j;
        n = m;
        m = j;
      } 
      j = 0;
      k = 0;
    } else if (paramc.f == -1) {
      j = paramc.b;
      k = j - n;
      n = 0;
      m = 0;
    } else {
      k = paramc.b;
      j = n + k;
      m = 0;
      n = 0;
    } 
    while (b2 < b1) {
      View view = this.L[b2];
      LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
      if (this.s == 1) {
        if (n2()) {
          k = e0() + this.K[this.J - layoutParams.e];
          i1 = this.u.f(view);
          j = k;
          k -= i1;
        } else {
          j = e0() + this.K[layoutParams.e];
          i1 = this.u.f(view);
          k = j;
          j = i1 + j;
        } 
        i1 = m;
        m = n;
        n = k;
      } else {
        i1 = g0() + this.K[layoutParams.e];
        i = this.u.f(view);
        m = i1;
        n = k;
        i1 = i + i1;
      } 
      z0(view, n, m, j, i1);
      if (layoutParams.c() || layoutParams.b())
        paramb.c = true; 
      paramb.d |= view.hasFocusable();
      b2++;
      k = n;
      n = m;
      m = i1;
    } 
    Arrays.fill((Object[])this.L, (Object)null);
  }
  
  public int r(RecyclerView.y paramy) {
    return this.Q ? Q2(paramy) : super.r(paramy);
  }
  
  void r2(RecyclerView.u paramu, RecyclerView.y paramy, LinearLayoutManager.a parama, int paramInt) {
    super.r2(paramu, paramy, parama, paramInt);
    e3();
    if (paramy.b() > 0 && !paramy.e())
      S2(paramu, paramy, parama, paramInt); 
    T2();
  }
  
  public int s(RecyclerView.y paramy) {
    return this.Q ? R2(paramy) : super.s(paramy);
  }
  
  public int u(RecyclerView.y paramy) {
    return this.Q ? Q2(paramy) : super.u(paramy);
  }
  
  public int v(RecyclerView.y paramy) {
    return this.Q ? R2(paramy) : super.v(paramy);
  }
  
  public int w1(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    e3();
    T2();
    return super.w1(paramInt, paramu, paramy);
  }
  
  public int y1(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    e3();
    T2();
    return super.y1(paramInt, paramu, paramy);
  }
  
  public static class LayoutParams extends RecyclerView.LayoutParams {
    int e = -1;
    
    int f = 0;
    
    public LayoutParams(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
    
    public int e() {
      return this.e;
    }
    
    public int f() {
      return this.f;
    }
  }
  
  public static final class a extends b {
    public int e(int param1Int1, int param1Int2) {
      return param1Int1 % param1Int2;
    }
    
    public int f(int param1Int) {
      return 1;
    }
  }
  
  public static abstract class b {
    final SparseIntArray a = new SparseIntArray();
    
    final SparseIntArray b = new SparseIntArray();
    
    private boolean c = false;
    
    private boolean d = false;
    
    static int a(SparseIntArray param1SparseIntArray, int param1Int) {
      int i = param1SparseIntArray.size() - 1;
      int j = 0;
      while (j <= i) {
        int k = j + i >>> 1;
        if (param1SparseIntArray.keyAt(k) < param1Int) {
          j = k + 1;
          continue;
        } 
        i = k - 1;
      } 
      param1Int = j - 1;
      return (param1Int >= 0 && param1Int < param1SparseIntArray.size()) ? param1SparseIntArray.keyAt(param1Int) : -1;
    }
    
    int b(int param1Int1, int param1Int2) {
      if (!this.d)
        return d(param1Int1, param1Int2); 
      int i = this.b.get(param1Int1, -1);
      if (i != -1)
        return i; 
      param1Int2 = d(param1Int1, param1Int2);
      this.b.put(param1Int1, param1Int2);
      return param1Int2;
    }
    
    int c(int param1Int1, int param1Int2) {
      if (!this.c)
        return e(param1Int1, param1Int2); 
      int i = this.a.get(param1Int1, -1);
      if (i != -1)
        return i; 
      param1Int2 = e(param1Int1, param1Int2);
      this.a.put(param1Int1, param1Int2);
      return param1Int2;
    }
    
    public int d(int param1Int1, int param1Int2) {
      // Byte code:
      //   0: aload_0
      //   1: getfield d : Z
      //   4: ifeq -> 79
      //   7: aload_0
      //   8: getfield b : Landroid/util/SparseIntArray;
      //   11: iload_1
      //   12: invokestatic a : (Landroid/util/SparseIntArray;I)I
      //   15: istore_3
      //   16: iload_3
      //   17: iconst_m1
      //   18: if_icmpeq -> 79
      //   21: aload_0
      //   22: getfield b : Landroid/util/SparseIntArray;
      //   25: iload_3
      //   26: invokevirtual get : (I)I
      //   29: istore #4
      //   31: iload_3
      //   32: iconst_1
      //   33: iadd
      //   34: istore #5
      //   36: aload_0
      //   37: iload_3
      //   38: iload_2
      //   39: invokevirtual c : (II)I
      //   42: aload_0
      //   43: iload_3
      //   44: invokevirtual f : (I)I
      //   47: iadd
      //   48: istore #6
      //   50: iload #4
      //   52: istore #7
      //   54: iload #5
      //   56: istore_3
      //   57: iload #6
      //   59: istore #8
      //   61: iload #6
      //   63: iload_2
      //   64: if_icmpne -> 87
      //   67: iload #4
      //   69: iconst_1
      //   70: iadd
      //   71: istore #7
      //   73: iload #5
      //   75: istore_3
      //   76: goto -> 84
      //   79: iconst_0
      //   80: istore #7
      //   82: iconst_0
      //   83: istore_3
      //   84: iconst_0
      //   85: istore #8
      //   87: aload_0
      //   88: iload_1
      //   89: invokevirtual f : (I)I
      //   92: istore #9
      //   94: iload_3
      //   95: istore #5
      //   97: iload #5
      //   99: iload_1
      //   100: if_icmpge -> 170
      //   103: aload_0
      //   104: iload #5
      //   106: invokevirtual f : (I)I
      //   109: istore #4
      //   111: iload #8
      //   113: iload #4
      //   115: iadd
      //   116: istore #6
      //   118: iload #6
      //   120: iload_2
      //   121: if_icmpne -> 135
      //   124: iload #7
      //   126: iconst_1
      //   127: iadd
      //   128: istore #8
      //   130: iconst_0
      //   131: istore_3
      //   132: goto -> 157
      //   135: iload #7
      //   137: istore #8
      //   139: iload #6
      //   141: istore_3
      //   142: iload #6
      //   144: iload_2
      //   145: if_icmple -> 157
      //   148: iload #7
      //   150: iconst_1
      //   151: iadd
      //   152: istore #8
      //   154: iload #4
      //   156: istore_3
      //   157: iinc #5, 1
      //   160: iload #8
      //   162: istore #7
      //   164: iload_3
      //   165: istore #8
      //   167: goto -> 97
      //   170: iload #7
      //   172: istore_1
      //   173: iload #8
      //   175: iload #9
      //   177: iadd
      //   178: iload_2
      //   179: if_icmple -> 187
      //   182: iload #7
      //   184: iconst_1
      //   185: iadd
      //   186: istore_1
      //   187: iload_1
      //   188: ireturn
    }
    
    public int e(int param1Int1, int param1Int2) {
      // Byte code:
      //   0: aload_0
      //   1: iload_1
      //   2: invokevirtual f : (I)I
      //   5: istore_3
      //   6: iload_3
      //   7: iload_2
      //   8: if_icmpne -> 13
      //   11: iconst_0
      //   12: ireturn
      //   13: aload_0
      //   14: getfield c : Z
      //   17: ifeq -> 56
      //   20: aload_0
      //   21: getfield a : Landroid/util/SparseIntArray;
      //   24: iload_1
      //   25: invokestatic a : (Landroid/util/SparseIntArray;I)I
      //   28: istore #4
      //   30: iload #4
      //   32: iflt -> 56
      //   35: aload_0
      //   36: getfield a : Landroid/util/SparseIntArray;
      //   39: iload #4
      //   41: invokevirtual get : (I)I
      //   44: aload_0
      //   45: iload #4
      //   47: invokevirtual f : (I)I
      //   50: iadd
      //   51: istore #5
      //   53: goto -> 121
      //   56: iconst_0
      //   57: istore #6
      //   59: iconst_0
      //   60: istore #5
      //   62: iload #6
      //   64: iload_1
      //   65: if_icmpge -> 130
      //   68: aload_0
      //   69: iload #6
      //   71: invokevirtual f : (I)I
      //   74: istore #7
      //   76: iload #5
      //   78: iload #7
      //   80: iadd
      //   81: istore #8
      //   83: iload #8
      //   85: iload_2
      //   86: if_icmpne -> 99
      //   89: iconst_0
      //   90: istore #5
      //   92: iload #6
      //   94: istore #4
      //   96: goto -> 121
      //   99: iload #6
      //   101: istore #4
      //   103: iload #8
      //   105: istore #5
      //   107: iload #8
      //   109: iload_2
      //   110: if_icmple -> 121
      //   113: iload #7
      //   115: istore #5
      //   117: iload #6
      //   119: istore #4
      //   121: iload #4
      //   123: iconst_1
      //   124: iadd
      //   125: istore #6
      //   127: goto -> 62
      //   130: iload_3
      //   131: iload #5
      //   133: iadd
      //   134: iload_2
      //   135: if_icmpgt -> 141
      //   138: iload #5
      //   140: ireturn
      //   141: iconst_0
      //   142: ireturn
    }
    
    public abstract int f(int param1Int);
    
    public void g() {
      this.b.clear();
    }
    
    public void h() {
      this.a.clear();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/GridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */