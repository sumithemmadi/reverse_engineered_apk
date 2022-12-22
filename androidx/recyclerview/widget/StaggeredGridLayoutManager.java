package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.x.b {
  boolean A = false;
  
  private BitSet B;
  
  int C = -1;
  
  int D = Integer.MIN_VALUE;
  
  LazySpanLookup E = new LazySpanLookup();
  
  private int F = 2;
  
  private boolean G;
  
  private boolean H;
  
  private SavedState I;
  
  private int J;
  
  private final Rect K = new Rect();
  
  private final b L = new b(this);
  
  private boolean M = false;
  
  private boolean N = true;
  
  private int[] O;
  
  private final Runnable P = new a(this);
  
  private int s = -1;
  
  c[] t;
  
  i u;
  
  i v;
  
  private int w;
  
  private int x;
  
  private final f y;
  
  boolean z = false;
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    RecyclerView.o.d d = RecyclerView.o.i0(paramContext, paramAttributeSet, paramInt1, paramInt2);
    L2(d.a);
    N2(d.b);
    M2(d.c);
    this.y = new f();
    b2();
  }
  
  private void A2(RecyclerView.u paramu, RecyclerView.y paramy, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   4: astore #4
    //   6: aload_0
    //   7: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
    //   10: ifnonnull -> 21
    //   13: aload_0
    //   14: getfield C : I
    //   17: iconst_m1
    //   18: if_icmpeq -> 39
    //   21: aload_2
    //   22: invokevirtual b : ()I
    //   25: ifne -> 39
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual k1 : (Landroidx/recyclerview/widget/RecyclerView$u;)V
    //   33: aload #4
    //   35: invokevirtual c : ()V
    //   38: return
    //   39: aload #4
    //   41: getfield e : Z
    //   44: istore #5
    //   46: iconst_1
    //   47: istore #6
    //   49: iload #5
    //   51: ifeq -> 78
    //   54: aload_0
    //   55: getfield C : I
    //   58: iconst_m1
    //   59: if_icmpne -> 78
    //   62: aload_0
    //   63: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
    //   66: ifnull -> 72
    //   69: goto -> 78
    //   72: iconst_0
    //   73: istore #7
    //   75: goto -> 81
    //   78: iconst_1
    //   79: istore #7
    //   81: iload #7
    //   83: ifeq -> 133
    //   86: aload #4
    //   88: invokevirtual c : ()V
    //   91: aload_0
    //   92: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
    //   95: ifnull -> 107
    //   98: aload_0
    //   99: aload #4
    //   101: invokespecial O1 : (Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;)V
    //   104: goto -> 120
    //   107: aload_0
    //   108: invokespecial I2 : ()V
    //   111: aload #4
    //   113: aload_0
    //   114: getfield A : Z
    //   117: putfield c : Z
    //   120: aload_0
    //   121: aload_2
    //   122: aload #4
    //   124: invokevirtual R2 : (Landroidx/recyclerview/widget/RecyclerView$y;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;)V
    //   127: aload #4
    //   129: iconst_1
    //   130: putfield e : Z
    //   133: aload_0
    //   134: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
    //   137: ifnonnull -> 184
    //   140: aload_0
    //   141: getfield C : I
    //   144: iconst_m1
    //   145: if_icmpne -> 184
    //   148: aload #4
    //   150: getfield c : Z
    //   153: aload_0
    //   154: getfield G : Z
    //   157: if_icmpne -> 171
    //   160: aload_0
    //   161: invokevirtual x2 : ()Z
    //   164: aload_0
    //   165: getfield H : Z
    //   168: if_icmpeq -> 184
    //   171: aload_0
    //   172: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;
    //   175: invokevirtual b : ()V
    //   178: aload #4
    //   180: iconst_1
    //   181: putfield d : Z
    //   184: aload_0
    //   185: invokevirtual J : ()I
    //   188: ifle -> 386
    //   191: aload_0
    //   192: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
    //   195: astore #8
    //   197: aload #8
    //   199: ifnull -> 211
    //   202: aload #8
    //   204: getfield d : I
    //   207: iconst_1
    //   208: if_icmpge -> 386
    //   211: aload #4
    //   213: getfield d : Z
    //   216: ifeq -> 273
    //   219: iconst_0
    //   220: istore #7
    //   222: iload #7
    //   224: aload_0
    //   225: getfield s : I
    //   228: if_icmpge -> 386
    //   231: aload_0
    //   232: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   235: iload #7
    //   237: aaload
    //   238: invokevirtual e : ()V
    //   241: aload #4
    //   243: getfield b : I
    //   246: istore #9
    //   248: iload #9
    //   250: ldc -2147483648
    //   252: if_icmpeq -> 267
    //   255: aload_0
    //   256: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   259: iload #7
    //   261: aaload
    //   262: iload #9
    //   264: invokevirtual y : (I)V
    //   267: iinc #7, 1
    //   270: goto -> 222
    //   273: iload #7
    //   275: ifne -> 338
    //   278: aload_0
    //   279: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   282: getfield f : [I
    //   285: ifnonnull -> 291
    //   288: goto -> 338
    //   291: iconst_0
    //   292: istore #7
    //   294: iload #7
    //   296: aload_0
    //   297: getfield s : I
    //   300: if_icmpge -> 386
    //   303: aload_0
    //   304: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   307: iload #7
    //   309: aaload
    //   310: astore #8
    //   312: aload #8
    //   314: invokevirtual e : ()V
    //   317: aload #8
    //   319: aload_0
    //   320: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   323: getfield f : [I
    //   326: iload #7
    //   328: iaload
    //   329: invokevirtual y : (I)V
    //   332: iinc #7, 1
    //   335: goto -> 294
    //   338: iconst_0
    //   339: istore #7
    //   341: iload #7
    //   343: aload_0
    //   344: getfield s : I
    //   347: if_icmpge -> 375
    //   350: aload_0
    //   351: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   354: iload #7
    //   356: aaload
    //   357: aload_0
    //   358: getfield A : Z
    //   361: aload #4
    //   363: getfield b : I
    //   366: invokevirtual b : (ZI)V
    //   369: iinc #7, 1
    //   372: goto -> 341
    //   375: aload_0
    //   376: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   379: aload_0
    //   380: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   383: invokevirtual d : ([Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;)V
    //   386: aload_0
    //   387: aload_1
    //   388: invokevirtual w : (Landroidx/recyclerview/widget/RecyclerView$u;)V
    //   391: aload_0
    //   392: getfield y : Landroidx/recyclerview/widget/f;
    //   395: iconst_0
    //   396: putfield a : Z
    //   399: aload_0
    //   400: iconst_0
    //   401: putfield M : Z
    //   404: aload_0
    //   405: aload_0
    //   406: getfield v : Landroidx/recyclerview/widget/i;
    //   409: invokevirtual n : ()I
    //   412: invokevirtual T2 : (I)V
    //   415: aload_0
    //   416: aload #4
    //   418: getfield a : I
    //   421: aload_2
    //   422: invokespecial S2 : (ILandroidx/recyclerview/widget/RecyclerView$y;)V
    //   425: aload #4
    //   427: getfield c : Z
    //   430: ifeq -> 488
    //   433: aload_0
    //   434: iconst_m1
    //   435: invokespecial K2 : (I)V
    //   438: aload_0
    //   439: aload_1
    //   440: aload_0
    //   441: getfield y : Landroidx/recyclerview/widget/f;
    //   444: aload_2
    //   445: invokespecial c2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/f;Landroidx/recyclerview/widget/RecyclerView$y;)I
    //   448: pop
    //   449: aload_0
    //   450: iconst_1
    //   451: invokespecial K2 : (I)V
    //   454: aload_0
    //   455: getfield y : Landroidx/recyclerview/widget/f;
    //   458: astore #8
    //   460: aload #8
    //   462: aload #4
    //   464: getfield a : I
    //   467: aload #8
    //   469: getfield d : I
    //   472: iadd
    //   473: putfield c : I
    //   476: aload_0
    //   477: aload_1
    //   478: aload #8
    //   480: aload_2
    //   481: invokespecial c2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/f;Landroidx/recyclerview/widget/RecyclerView$y;)I
    //   484: pop
    //   485: goto -> 540
    //   488: aload_0
    //   489: iconst_1
    //   490: invokespecial K2 : (I)V
    //   493: aload_0
    //   494: aload_1
    //   495: aload_0
    //   496: getfield y : Landroidx/recyclerview/widget/f;
    //   499: aload_2
    //   500: invokespecial c2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/f;Landroidx/recyclerview/widget/RecyclerView$y;)I
    //   503: pop
    //   504: aload_0
    //   505: iconst_m1
    //   506: invokespecial K2 : (I)V
    //   509: aload_0
    //   510: getfield y : Landroidx/recyclerview/widget/f;
    //   513: astore #8
    //   515: aload #8
    //   517: aload #4
    //   519: getfield a : I
    //   522: aload #8
    //   524: getfield d : I
    //   527: iadd
    //   528: putfield c : I
    //   531: aload_0
    //   532: aload_1
    //   533: aload #8
    //   535: aload_2
    //   536: invokespecial c2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/f;Landroidx/recyclerview/widget/RecyclerView$y;)I
    //   539: pop
    //   540: aload_0
    //   541: invokespecial H2 : ()V
    //   544: aload_0
    //   545: invokevirtual J : ()I
    //   548: ifle -> 589
    //   551: aload_0
    //   552: getfield A : Z
    //   555: ifeq -> 575
    //   558: aload_0
    //   559: aload_1
    //   560: aload_2
    //   561: iconst_1
    //   562: invokespecial k2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;Z)V
    //   565: aload_0
    //   566: aload_1
    //   567: aload_2
    //   568: iconst_0
    //   569: invokespecial l2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;Z)V
    //   572: goto -> 589
    //   575: aload_0
    //   576: aload_1
    //   577: aload_2
    //   578: iconst_1
    //   579: invokespecial l2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;Z)V
    //   582: aload_0
    //   583: aload_1
    //   584: aload_2
    //   585: iconst_0
    //   586: invokespecial k2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;Z)V
    //   589: iload_3
    //   590: ifeq -> 665
    //   593: aload_2
    //   594: invokevirtual e : ()Z
    //   597: ifne -> 665
    //   600: aload_0
    //   601: getfield F : I
    //   604: ifeq -> 634
    //   607: aload_0
    //   608: invokevirtual J : ()I
    //   611: ifle -> 634
    //   614: aload_0
    //   615: getfield M : Z
    //   618: ifne -> 628
    //   621: aload_0
    //   622: invokevirtual v2 : ()Landroid/view/View;
    //   625: ifnull -> 634
    //   628: iconst_1
    //   629: istore #7
    //   631: goto -> 637
    //   634: iconst_0
    //   635: istore #7
    //   637: iload #7
    //   639: ifeq -> 665
    //   642: aload_0
    //   643: aload_0
    //   644: getfield P : Ljava/lang/Runnable;
    //   647: invokevirtual o1 : (Ljava/lang/Runnable;)Z
    //   650: pop
    //   651: aload_0
    //   652: invokevirtual T1 : ()Z
    //   655: ifeq -> 665
    //   658: iload #6
    //   660: istore #7
    //   662: goto -> 668
    //   665: iconst_0
    //   666: istore #7
    //   668: aload_2
    //   669: invokevirtual e : ()Z
    //   672: ifeq -> 682
    //   675: aload_0
    //   676: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   679: invokevirtual c : ()V
    //   682: aload_0
    //   683: aload #4
    //   685: getfield c : Z
    //   688: putfield G : Z
    //   691: aload_0
    //   692: aload_0
    //   693: invokevirtual x2 : ()Z
    //   696: putfield H : Z
    //   699: iload #7
    //   701: ifeq -> 718
    //   704: aload_0
    //   705: getfield L : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;
    //   708: invokevirtual c : ()V
    //   711: aload_0
    //   712: aload_1
    //   713: aload_2
    //   714: iconst_0
    //   715: invokespecial A2 : (Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;Z)V
    //   718: return
  }
  
  private boolean B2(int paramInt) {
    boolean bool;
    int j = this.w;
    boolean bool1 = true;
    boolean bool2 = true;
    if (j == 0) {
      if (paramInt == -1) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool != this.A) {
        bool = bool2;
      } else {
        bool = false;
      } 
      return bool;
    } 
    if (paramInt == -1) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool == this.A) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool == x2()) {
      bool = bool1;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void D2(View paramView) {
    for (int j = this.s - 1; j >= 0; j--)
      this.t[j].x(paramView); 
  }
  
  private void E2(RecyclerView.u paramu, f paramf) {
    if (paramf.a && !paramf.i)
      if (paramf.b == 0) {
        if (paramf.e == -1) {
          F2(paramu, paramf.g);
        } else {
          G2(paramu, paramf.f);
        } 
      } else if (paramf.e == -1) {
        int j = paramf.f;
        j -= p2(j);
        if (j < 0) {
          j = paramf.g;
        } else {
          j = paramf.g - Math.min(j, paramf.b);
        } 
        F2(paramu, j);
      } else {
        int j = q2(paramf.g) - paramf.g;
        if (j < 0) {
          j = paramf.f;
        } else {
          int k = paramf.f;
          j = Math.min(j, paramf.b) + k;
        } 
        G2(paramu, j);
      }  
  }
  
  private void F2(RecyclerView.u paramu, int paramInt) {
    int j = J() - 1;
    while (j >= 0) {
      View view = I(j);
      if (this.u.g(view) >= paramInt && this.u.q(view) >= paramInt) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (layoutParams.f) {
          byte b3;
          byte b1 = 0;
          byte b2 = 0;
          while (true) {
            b3 = b1;
            if (b2 < this.s) {
              if ((this.t[b2]).a.size() == 1)
                return; 
              b2++;
              continue;
            } 
            break;
          } 
          while (b3 < this.s) {
            this.t[b3].v();
            b3++;
          } 
        } else {
          if (layoutParams.e.a.size() == 1)
            return; 
          layoutParams.e.v();
        } 
        m1(view, paramu);
        j--;
      } 
    } 
  }
  
  private void G2(RecyclerView.u paramu, int paramInt) {
    while (J() > 0) {
      byte b1 = 0;
      View view = I(0);
      if (this.u.d(view) <= paramInt && this.u.p(view) <= paramInt) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (layoutParams.f) {
          byte b3;
          byte b2 = 0;
          while (true) {
            b3 = b1;
            if (b2 < this.s) {
              if ((this.t[b2]).a.size() == 1)
                return; 
              b2++;
              continue;
            } 
            break;
          } 
          while (b3 < this.s) {
            this.t[b3].w();
            b3++;
          } 
        } else {
          if (layoutParams.e.a.size() == 1)
            return; 
          layoutParams.e.w();
        } 
        m1(view, paramu);
      } 
    } 
  }
  
  private void H2() {
    if (this.v.k() == 1073741824)
      return; 
    float f1 = 0.0F;
    int j = J();
    int k = 0;
    int m;
    for (m = 0; m < j; m++) {
      View view = I(m);
      float f2 = this.v.e(view);
      if (f2 >= f1) {
        float f3 = f2;
        if (((LayoutParams)view.getLayoutParams()).e())
          f3 = f2 * 1.0F / this.s; 
        f1 = Math.max(f1, f3);
      } 
    } 
    int n = this.x;
    int i1 = Math.round(f1 * this.s);
    m = i1;
    if (this.v.k() == Integer.MIN_VALUE)
      m = Math.min(i1, this.v.n()); 
    T2(m);
    m = k;
    if (this.x == n)
      return; 
    while (m < j) {
      View view = I(m);
      LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
      if (!layoutParams.f)
        if (x2() && this.w == 1) {
          k = this.s;
          i1 = layoutParams.e.e;
          view.offsetLeftAndRight(-(k - 1 - i1) * this.x - -(k - 1 - i1) * n);
        } else {
          i1 = layoutParams.e.e;
          k = this.x * i1;
          i1 *= n;
          if (this.w == 1) {
            view.offsetLeftAndRight(k - i1);
          } else {
            view.offsetTopAndBottom(k - i1);
          } 
        }  
      m++;
    } 
  }
  
  private void I2() {
    if (this.w == 1 || !x2()) {
      this.A = this.z;
      return;
    } 
    this.A = this.z ^ true;
  }
  
  private void K2(int paramInt) {
    boolean bool2;
    f f1 = this.y;
    f1.e = paramInt;
    boolean bool1 = this.A;
    boolean bool = true;
    if (paramInt == -1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool1 == bool2) {
      paramInt = bool;
    } else {
      paramInt = -1;
    } 
    f1.d = paramInt;
  }
  
  private void N1(View paramView) {
    for (int j = this.s - 1; j >= 0; j--)
      this.t[j].a(paramView); 
  }
  
  private void O1(b paramb) {
    SavedState savedState = this.I;
    int j = savedState.d;
    if (j > 0)
      if (j == this.s) {
        for (j = 0; j < this.s; j++) {
          this.t[j].e();
          savedState = this.I;
          int k = savedState.e[j];
          int m = k;
          if (k != Integer.MIN_VALUE) {
            if (savedState.j) {
              m = this.u.i();
            } else {
              m = this.u.m();
            } 
            m = k + m;
          } 
          this.t[j].y(m);
        } 
      } else {
        savedState.b();
        savedState = this.I;
        savedState.b = savedState.c;
      }  
    savedState = this.I;
    this.H = savedState.k;
    M2(savedState.i);
    I2();
    savedState = this.I;
    j = savedState.b;
    if (j != -1) {
      this.C = j;
      paramb.c = savedState.j;
    } else {
      paramb.c = this.A;
    } 
    if (savedState.f > 1) {
      LazySpanLookup lazySpanLookup = this.E;
      lazySpanLookup.a = savedState.g;
      lazySpanLookup.b = savedState.h;
    } 
  }
  
  private void O2(int paramInt1, int paramInt2) {
    for (byte b1 = 0; b1 < this.s; b1++) {
      if (!(this.t[b1]).a.isEmpty())
        U2(this.t[b1], paramInt1, paramInt2); 
    } 
  }
  
  private boolean P2(RecyclerView.y paramy, b paramb) {
    int j;
    if (this.G) {
      j = i2(paramy.b());
    } else {
      j = e2(paramy.b());
    } 
    paramb.a = j;
    paramb.b = Integer.MIN_VALUE;
    return true;
  }
  
  private void R1(View paramView, LayoutParams paramLayoutParams, f paramf) {
    if (paramf.e == 1) {
      if (paramLayoutParams.f) {
        N1(paramView);
      } else {
        paramLayoutParams.e.a(paramView);
      } 
    } else if (paramLayoutParams.f) {
      D2(paramView);
    } else {
      paramLayoutParams.e.x(paramView);
    } 
  }
  
  private int S1(int paramInt) {
    boolean bool;
    int j = J();
    byte b1 = -1;
    if (j == 0) {
      if (this.A)
        b1 = 1; 
      return b1;
    } 
    if (paramInt < m2()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool == this.A)
      b1 = 1; 
    return b1;
  }
  
  private void S2(int paramInt, RecyclerView.y paramy) {
    // Byte code:
    //   0: aload_0
    //   1: getfield y : Landroidx/recyclerview/widget/f;
    //   4: astore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: aload_3
    //   9: iconst_0
    //   10: putfield b : I
    //   13: aload_3
    //   14: iload_1
    //   15: putfield c : I
    //   18: aload_0
    //   19: invokevirtual x0 : ()Z
    //   22: ifeq -> 90
    //   25: aload_2
    //   26: invokevirtual c : ()I
    //   29: istore #5
    //   31: iload #5
    //   33: iconst_m1
    //   34: if_icmpeq -> 90
    //   37: aload_0
    //   38: getfield A : Z
    //   41: istore #6
    //   43: iload #5
    //   45: iload_1
    //   46: if_icmpge -> 55
    //   49: iconst_1
    //   50: istore #7
    //   52: goto -> 58
    //   55: iconst_0
    //   56: istore #7
    //   58: iload #6
    //   60: iload #7
    //   62: if_icmpne -> 76
    //   65: aload_0
    //   66: getfield u : Landroidx/recyclerview/widget/i;
    //   69: invokevirtual n : ()I
    //   72: istore_1
    //   73: goto -> 92
    //   76: aload_0
    //   77: getfield u : Landroidx/recyclerview/widget/i;
    //   80: invokevirtual n : ()I
    //   83: istore #5
    //   85: iconst_0
    //   86: istore_1
    //   87: goto -> 95
    //   90: iconst_0
    //   91: istore_1
    //   92: iconst_0
    //   93: istore #5
    //   95: aload_0
    //   96: invokevirtual M : ()Z
    //   99: ifeq -> 138
    //   102: aload_0
    //   103: getfield y : Landroidx/recyclerview/widget/f;
    //   106: aload_0
    //   107: getfield u : Landroidx/recyclerview/widget/i;
    //   110: invokevirtual m : ()I
    //   113: iload #5
    //   115: isub
    //   116: putfield f : I
    //   119: aload_0
    //   120: getfield y : Landroidx/recyclerview/widget/f;
    //   123: aload_0
    //   124: getfield u : Landroidx/recyclerview/widget/i;
    //   127: invokevirtual i : ()I
    //   130: iload_1
    //   131: iadd
    //   132: putfield g : I
    //   135: goto -> 164
    //   138: aload_0
    //   139: getfield y : Landroidx/recyclerview/widget/f;
    //   142: aload_0
    //   143: getfield u : Landroidx/recyclerview/widget/i;
    //   146: invokevirtual h : ()I
    //   149: iload_1
    //   150: iadd
    //   151: putfield g : I
    //   154: aload_0
    //   155: getfield y : Landroidx/recyclerview/widget/f;
    //   158: iload #5
    //   160: ineg
    //   161: putfield f : I
    //   164: aload_0
    //   165: getfield y : Landroidx/recyclerview/widget/f;
    //   168: astore_2
    //   169: aload_2
    //   170: iconst_0
    //   171: putfield h : Z
    //   174: aload_2
    //   175: iconst_1
    //   176: putfield a : Z
    //   179: iload #4
    //   181: istore #7
    //   183: aload_0
    //   184: getfield u : Landroidx/recyclerview/widget/i;
    //   187: invokevirtual k : ()I
    //   190: ifne -> 210
    //   193: iload #4
    //   195: istore #7
    //   197: aload_0
    //   198: getfield u : Landroidx/recyclerview/widget/i;
    //   201: invokevirtual h : ()I
    //   204: ifne -> 210
    //   207: iconst_1
    //   208: istore #7
    //   210: aload_2
    //   211: iload #7
    //   213: putfield i : Z
    //   216: return
  }
  
  private boolean U1(c paramc) {
    if (this.A) {
      if (paramc.n() < this.u.i()) {
        ArrayList<View> arrayList = paramc.a;
        return (paramc.q((View)arrayList.get(arrayList.size() - 1))).f ^ true;
      } 
    } else if (paramc.r() > this.u.m()) {
      return (paramc.q((View)paramc.a.get(0))).f ^ true;
    } 
    return false;
  }
  
  private void U2(c paramc, int paramInt1, int paramInt2) {
    int j = paramc.m();
    if (paramInt1 == -1) {
      if (paramc.r() + j <= paramInt2)
        this.B.set(paramc.e, false); 
    } else if (paramc.n() - j >= paramInt2) {
      this.B.set(paramc.e, false);
    } 
  }
  
  private int V1(RecyclerView.y paramy) {
    return (J() == 0) ? 0 : l.a(paramy, this.u, g2(this.N ^ true), f2(this.N ^ true), this, this.N);
  }
  
  private int V2(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 == 0 && paramInt3 == 0)
      return paramInt1; 
    int j = View.MeasureSpec.getMode(paramInt1);
    return (j == Integer.MIN_VALUE || j == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), j) : paramInt1;
  }
  
  private int W1(RecyclerView.y paramy) {
    return (J() == 0) ? 0 : l.b(paramy, this.u, g2(this.N ^ true), f2(this.N ^ true), this, this.N, this.A);
  }
  
  private int X1(RecyclerView.y paramy) {
    return (J() == 0) ? 0 : l.c(paramy, this.u, g2(this.N ^ true), f2(this.N ^ true), this, this.N);
  }
  
  private int Y1(int paramInt) {
    int j = -1;
    boolean bool1 = true;
    boolean bool2 = true;
    if (paramInt != 1) {
      if (paramInt != 2) {
        if (paramInt != 17) {
          if (paramInt != 33) {
            if (paramInt != 66) {
              if (paramInt != 130)
                return Integer.MIN_VALUE; 
              if (this.w == 1) {
                paramInt = bool2;
              } else {
                paramInt = Integer.MIN_VALUE;
              } 
              return paramInt;
            } 
            if (this.w == 0) {
              paramInt = bool1;
            } else {
              paramInt = Integer.MIN_VALUE;
            } 
            return paramInt;
          } 
          if (this.w != 1)
            j = Integer.MIN_VALUE; 
          return j;
        } 
        if (this.w != 0)
          j = Integer.MIN_VALUE; 
        return j;
      } 
      return (this.w == 1) ? 1 : (x2() ? -1 : 1);
    } 
    return (this.w == 1) ? -1 : (x2() ? 1 : -1);
  }
  
  private LazySpanLookup.FullSpanItem Z1(int paramInt) {
    LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
    fullSpanItem.d = new int[this.s];
    for (byte b1 = 0; b1 < this.s; b1++)
      fullSpanItem.d[b1] = paramInt - this.t[b1].o(paramInt); 
    return fullSpanItem;
  }
  
  private LazySpanLookup.FullSpanItem a2(int paramInt) {
    LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
    fullSpanItem.d = new int[this.s];
    for (byte b1 = 0; b1 < this.s; b1++)
      fullSpanItem.d[b1] = this.t[b1].s(paramInt) - paramInt; 
    return fullSpanItem;
  }
  
  private void b2() {
    this.u = i.b(this, this.w);
    this.v = i.b(this, 1 - this.w);
  }
  
  private int c2(RecyclerView.u paramu, f paramf, RecyclerView.y paramy) {
    int j;
    int k;
    this.B.set(0, this.s, true);
    if (this.y.i) {
      if (paramf.e == 1) {
        j = Integer.MAX_VALUE;
      } else {
        j = Integer.MIN_VALUE;
      } 
    } else if (paramf.e == 1) {
      j = paramf.g + paramf.b;
    } else {
      j = paramf.f - paramf.b;
    } 
    O2(paramf.e, j);
    if (this.A) {
      k = this.u.i();
    } else {
      k = this.u.m();
    } 
    int m;
    for (m = 0; paramf.a(paramy) && (this.y.i || !this.B.isEmpty()); m = 1) {
      int i1;
      c c1;
      int i2;
      int i3;
      View view = paramf.b(paramu);
      LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
      int n = layoutParams.a();
      m = this.E.g(n);
      if (m == -1) {
        i1 = 1;
      } else {
        i1 = 0;
      } 
      if (i1) {
        if (layoutParams.f) {
          c1 = this.t[0];
        } else {
          c1 = s2(paramf);
        } 
        this.E.n(n, c1);
      } else {
        c1 = this.t[m];
      } 
      layoutParams.e = c1;
      if (paramf.e == 1) {
        d(view);
      } else {
        e(view, 0);
      } 
      z2(view, layoutParams, false);
      if (paramf.e == 1) {
        if (layoutParams.f) {
          m = o2(k);
        } else {
          m = c1.o(k);
        } 
        i2 = this.u.e(view);
        if (i1 && layoutParams.f) {
          LazySpanLookup.FullSpanItem fullSpanItem = Z1(m);
          fullSpanItem.c = -1;
          fullSpanItem.b = n;
          this.E.a(fullSpanItem);
        } 
        i3 = i2 + m;
        i2 = m;
      } else {
        if (layoutParams.f) {
          m = r2(k);
        } else {
          m = c1.s(k);
        } 
        i2 = m - this.u.e(view);
        if (i1 && layoutParams.f) {
          LazySpanLookup.FullSpanItem fullSpanItem = a2(m);
          fullSpanItem.c = 1;
          fullSpanItem.b = n;
          this.E.a(fullSpanItem);
        } 
        i3 = m;
      } 
      if (layoutParams.f && paramf.d == -1)
        if (i1) {
          this.M = true;
        } else {
          boolean bool;
          if (paramf.e == 1) {
            bool = P1();
          } else {
            bool = Q1();
          } 
          if ((bool ^ true) != 0) {
            LazySpanLookup.FullSpanItem fullSpanItem = this.E.f(n);
            if (fullSpanItem != null)
              fullSpanItem.e = true; 
            this.M = true;
          } 
        }  
      R1(view, layoutParams, paramf);
      if (x2() && this.w == 1) {
        if (layoutParams.f) {
          m = this.v.i();
        } else {
          m = this.v.i() - (this.s - 1 - c1.e) * this.x;
        } 
        n = this.v.e(view);
        i1 = m;
        n = m - n;
        m = i1;
      } else {
        if (layoutParams.f) {
          m = this.v.m();
        } else {
          m = c1.e * this.x + this.v.m();
        } 
        n = this.v.e(view);
        i1 = m;
        m = n + m;
        n = i1;
      } 
      if (this.w == 1) {
        z0(view, n, i2, m, i3);
      } else {
        z0(view, i2, n, i3, m);
      } 
      if (layoutParams.f) {
        O2(this.y.e, j);
      } else {
        U2(c1, this.y.e, j);
      } 
      E2(paramu, this.y);
      if (this.y.h && view.hasFocusable())
        if (layoutParams.f) {
          this.B.clear();
        } else {
          this.B.set(c1.e, false);
        }  
    } 
    if (m == 0)
      E2(paramu, this.y); 
    if (this.y.e == -1) {
      j = r2(this.u.m());
      j = this.u.m() - j;
    } else {
      j = o2(this.u.i()) - this.u.i();
    } 
    if (j > 0) {
      j = Math.min(paramf.b, j);
    } else {
      j = 0;
    } 
    return j;
  }
  
  private int e2(int paramInt) {
    int j = J();
    for (byte b1 = 0; b1 < j; b1++) {
      int k = h0(I(b1));
      if (k >= 0 && k < paramInt)
        return k; 
    } 
    return 0;
  }
  
  private int i2(int paramInt) {
    for (int j = J() - 1; j >= 0; j--) {
      int k = h0(I(j));
      if (k >= 0 && k < paramInt)
        return k; 
    } 
    return 0;
  }
  
  private void k2(RecyclerView.u paramu, RecyclerView.y paramy, boolean paramBoolean) {
    int j = o2(-2147483648);
    if (j == Integer.MIN_VALUE)
      return; 
    j = this.u.i() - j;
    if (j > 0) {
      j -= -J2(-j, paramu, paramy);
      if (paramBoolean && j > 0)
        this.u.r(j); 
    } 
  }
  
  private void l2(RecyclerView.u paramu, RecyclerView.y paramy, boolean paramBoolean) {
    int j = r2(2147483647);
    if (j == Integer.MAX_VALUE)
      return; 
    j -= this.u.m();
    if (j > 0) {
      j -= J2(j, paramu, paramy);
      if (paramBoolean && j > 0)
        this.u.r(-j); 
    } 
  }
  
  private int o2(int paramInt) {
    int j = this.t[0].o(paramInt);
    byte b1 = 1;
    while (b1 < this.s) {
      int k = this.t[b1].o(paramInt);
      int m = j;
      if (k > j)
        m = k; 
      b1++;
      j = m;
    } 
    return j;
  }
  
  private int p2(int paramInt) {
    int j = this.t[0].s(paramInt);
    byte b1 = 1;
    while (b1 < this.s) {
      int k = this.t[b1].s(paramInt);
      int m = j;
      if (k > j)
        m = k; 
      b1++;
      j = m;
    } 
    return j;
  }
  
  private int q2(int paramInt) {
    int j = this.t[0].o(paramInt);
    byte b1 = 1;
    while (b1 < this.s) {
      int k = this.t[b1].o(paramInt);
      int m = j;
      if (k < j)
        m = k; 
      b1++;
      j = m;
    } 
    return j;
  }
  
  private int r2(int paramInt) {
    int j = this.t[0].s(paramInt);
    byte b1 = 1;
    while (b1 < this.s) {
      int k = this.t[b1].s(paramInt);
      int m = j;
      if (k < j)
        m = k; 
      b1++;
      j = m;
    } 
    return j;
  }
  
  private c s2(f paramf) {
    int k;
    byte b1;
    boolean bool = B2(paramf.e);
    int j = -1;
    if (bool) {
      k = this.s - 1;
      b1 = -1;
    } else {
      k = 0;
      j = this.s;
      b1 = 1;
    } 
    int m = paramf.e;
    c c2 = null;
    paramf = null;
    if (m == 1) {
      c c3;
      m = Integer.MAX_VALUE;
      int i1 = this.u.m();
      int i2 = k;
      while (i2 != j) {
        c2 = this.t[i2];
        int i3 = c2.o(i1);
        k = m;
        if (i3 < m) {
          c3 = c2;
          k = i3;
        } 
        i2 += b1;
        m = k;
      } 
      return c3;
    } 
    m = Integer.MIN_VALUE;
    int n = this.u.i();
    c c1 = c2;
    while (k != j) {
      c2 = this.t[k];
      int i2 = c2.s(n);
      int i1 = m;
      if (i2 > m) {
        c1 = c2;
        i1 = i2;
      } 
      k += b1;
      m = i1;
    } 
    return c1;
  }
  
  private void u2(int paramInt1, int paramInt2, int paramInt3) {
    if (this.A) {
      int k = n2();
    } else {
      int k = m2();
    } 
    if (paramInt3 == 8) {
      if (paramInt1 < paramInt2) {
        int k = paramInt2 + 1;
      } else {
        int k = paramInt1 + 1;
        int m = paramInt2;
        this.E.h(m);
      } 
    } else {
      int k = paramInt1 + paramInt2;
    } 
    int j = paramInt1;
    this.E.h(j);
  }
  
  private void y2(View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    j(paramView, this.K);
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    int j = layoutParams.leftMargin;
    Rect rect = this.K;
    paramInt1 = V2(paramInt1, j + rect.left, layoutParams.rightMargin + rect.right);
    j = layoutParams.topMargin;
    rect = this.K;
    paramInt2 = V2(paramInt2, j + rect.top, layoutParams.bottomMargin + rect.bottom);
    if (paramBoolean) {
      paramBoolean = I1(paramView, paramInt1, paramInt2, layoutParams);
    } else {
      paramBoolean = G1(paramView, paramInt1, paramInt2, layoutParams);
    } 
    if (paramBoolean)
      paramView.measure(paramInt1, paramInt2); 
  }
  
  private void z2(View paramView, LayoutParams paramLayoutParams, boolean paramBoolean) {
    if (paramLayoutParams.f) {
      if (this.w == 1) {
        y2(paramView, this.J, RecyclerView.o.K(W(), X(), g0() + d0(), paramLayoutParams.height, true), paramBoolean);
      } else {
        y2(paramView, RecyclerView.o.K(o0(), p0(), e0() + f0(), paramLayoutParams.width, true), this.J, paramBoolean);
      } 
    } else if (this.w == 1) {
      y2(paramView, RecyclerView.o.K(this.x, p0(), 0, paramLayoutParams.width, false), RecyclerView.o.K(W(), X(), g0() + d0(), paramLayoutParams.height, true), paramBoolean);
    } else {
      y2(paramView, RecyclerView.o.K(o0(), p0(), e0() + f0(), paramLayoutParams.width, true), RecyclerView.o.K(this.x, X(), 0, paramLayoutParams.height, false), paramBoolean);
    } 
  }
  
  public void C0(int paramInt) {
    super.C0(paramInt);
    for (byte b1 = 0; b1 < this.s; b1++)
      this.t[b1].u(paramInt); 
  }
  
  void C2(int paramInt, RecyclerView.y paramy) {
    int j;
    byte b1;
    if (paramInt > 0) {
      j = n2();
      b1 = 1;
    } else {
      j = m2();
      b1 = -1;
    } 
    this.y.a = true;
    S2(j, paramy);
    K2(b1);
    f f1 = this.y;
    f1.c = j + f1.d;
    f1.b = Math.abs(paramInt);
  }
  
  public RecyclerView.LayoutParams D() {
    return (this.w == 0) ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
  }
  
  public void D0(int paramInt) {
    super.D0(paramInt);
    for (byte b1 = 0; b1 < this.s; b1++)
      this.t[b1].u(paramInt); 
  }
  
  public void D1(Rect paramRect, int paramInt1, int paramInt2) {
    int j = e0() + f0();
    int k = g0() + d0();
    if (this.w == 1) {
      paramInt2 = RecyclerView.o.n(paramInt2, paramRect.height() + k, b0());
      paramInt1 = RecyclerView.o.n(paramInt1, this.x * this.s + j, c0());
    } else {
      paramInt1 = RecyclerView.o.n(paramInt1, paramRect.width() + j, c0());
      paramInt2 = RecyclerView.o.n(paramInt2, this.x * this.s + k, b0());
    } 
    C1(paramInt1, paramInt2);
  }
  
  public RecyclerView.LayoutParams E(Context paramContext, AttributeSet paramAttributeSet) {
    return new LayoutParams(paramContext, paramAttributeSet);
  }
  
  public void E0(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2) {
    this.E.b();
    for (byte b1 = 0; b1 < this.s; b1++)
      this.t[b1].e(); 
  }
  
  public RecyclerView.LayoutParams F(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams) : new LayoutParams(paramLayoutParams);
  }
  
  public void I0(RecyclerView paramRecyclerView, RecyclerView.u paramu) {
    super.I0(paramRecyclerView, paramu);
    o1(this.P);
    for (byte b1 = 0; b1 < this.s; b1++)
      this.t[b1].e(); 
    paramRecyclerView.requestLayout();
  }
  
  public View J0(View paramView, int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    if (J() == 0)
      return null; 
    paramView = B(paramView);
    if (paramView == null)
      return null; 
    I2();
    int j = Y1(paramInt);
    if (j == Integer.MIN_VALUE)
      return null; 
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    boolean bool1 = layoutParams.f;
    c c1 = layoutParams.e;
    if (j == 1) {
      paramInt = n2();
    } else {
      paramInt = m2();
    } 
    S2(paramInt, paramy);
    K2(j);
    f f1 = this.y;
    f1.c = f1.d + paramInt;
    f1.b = (int)(this.u.n() * 0.33333334F);
    f1 = this.y;
    f1.h = true;
    int k = 0;
    f1.a = false;
    c2(paramu, f1, paramy);
    this.G = this.A;
    if (!bool1) {
      View view = c1.p(paramInt, j);
      if (view != null && view != paramView)
        return view; 
    } 
    if (B2(j)) {
      for (int n = this.s - 1; n >= 0; n--) {
        View view = this.t[n].p(paramInt, j);
        if (view != null && view != paramView)
          return view; 
      } 
    } else {
      for (byte b1 = 0; b1 < this.s; b1++) {
        View view = this.t[b1].p(paramInt, j);
        if (view != null && view != paramView)
          return view; 
      } 
    } 
    boolean bool2 = this.z;
    if (j == -1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if ((bool2 ^ true) == paramInt) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (!bool1) {
      int n;
      if (paramInt != 0) {
        n = c1.g();
      } else {
        n = c1.h();
      } 
      View view = C(n);
      if (view != null && view != paramView)
        return view; 
    } 
    int m = k;
    if (B2(j)) {
      for (m = this.s - 1; m >= 0; m--) {
        if (m != c1.e) {
          if (paramInt != 0) {
            k = this.t[m].g();
          } else {
            k = this.t[m].h();
          } 
          View view = C(k);
          if (view != null && view != paramView)
            return view; 
        } 
      } 
    } else {
      while (m < this.s) {
        if (paramInt != 0) {
          k = this.t[m].g();
        } else {
          k = this.t[m].h();
        } 
        View view = C(k);
        if (view != null && view != paramView)
          return view; 
        m++;
      } 
    } 
    return null;
  }
  
  public void J1(RecyclerView paramRecyclerView, RecyclerView.y paramy, int paramInt) {
    g g = new g(paramRecyclerView.getContext());
    g.p(paramInt);
    K1(g);
  }
  
  int J2(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    if (J() == 0 || paramInt == 0)
      return 0; 
    C2(paramInt, paramy);
    int j = c2(paramu, this.y, paramy);
    if (this.y.b >= j)
      if (paramInt < 0) {
        paramInt = -j;
      } else {
        paramInt = j;
      }  
    this.u.r(-paramInt);
    this.G = this.A;
    f f1 = this.y;
    f1.b = 0;
    E2(paramu, f1);
    return paramInt;
  }
  
  public void K0(AccessibilityEvent paramAccessibilityEvent) {
    super.K0(paramAccessibilityEvent);
    if (J() > 0) {
      View view1 = g2(false);
      View view2 = f2(false);
      if (view1 != null && view2 != null) {
        int j = h0(view1);
        int k = h0(view2);
        if (j < k) {
          paramAccessibilityEvent.setFromIndex(j);
          paramAccessibilityEvent.setToIndex(k);
        } else {
          paramAccessibilityEvent.setFromIndex(k);
          paramAccessibilityEvent.setToIndex(j);
        } 
      } 
    } 
  }
  
  public void L2(int paramInt) {
    if (paramInt == 0 || paramInt == 1) {
      g(null);
      if (paramInt == this.w)
        return; 
      this.w = paramInt;
      i i1 = this.u;
      this.u = this.v;
      this.v = i1;
      t1();
      return;
    } 
    throw new IllegalArgumentException("invalid orientation.");
  }
  
  public boolean M1() {
    boolean bool;
    if (this.I == null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void M2(boolean paramBoolean) {
    g(null);
    SavedState savedState = this.I;
    if (savedState != null && savedState.i != paramBoolean)
      savedState.i = paramBoolean; 
    this.z = paramBoolean;
    t1();
  }
  
  public void N2(int paramInt) {
    g(null);
    if (paramInt != this.s) {
      w2();
      this.s = paramInt;
      this.B = new BitSet(this.s);
      this.t = new c[this.s];
      for (paramInt = 0; paramInt < this.s; paramInt++)
        this.t[paramInt] = new c(this, paramInt); 
      t1();
    } 
  }
  
  boolean P1() {
    int j = this.t[0].o(-2147483648);
    for (byte b1 = 1; b1 < this.s; b1++) {
      if (this.t[b1].o(-2147483648) != j)
        return false; 
    } 
    return true;
  }
  
  boolean Q1() {
    int j = this.t[0].s(-2147483648);
    for (byte b1 = 1; b1 < this.s; b1++) {
      if (this.t[b1].s(-2147483648) != j)
        return false; 
    } 
    return true;
  }
  
  boolean Q2(RecyclerView.y paramy, b paramb) {
    boolean bool = paramy.e();
    boolean bool1 = false;
    if (!bool) {
      int j = this.C;
      if (j == -1)
        return false; 
      if (j < 0 || j >= paramy.b()) {
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        return false;
      } 
      SavedState savedState = this.I;
      if (savedState == null || savedState.b == -1 || savedState.d < 1) {
        View view = C(this.C);
        if (view != null) {
          if (this.A) {
            j = n2();
          } else {
            j = m2();
          } 
          paramb.a = j;
          if (this.D != Integer.MIN_VALUE) {
            if (paramb.c) {
              paramb.b = this.u.i() - this.D - this.u.d(view);
            } else {
              paramb.b = this.u.m() + this.D - this.u.g(view);
            } 
            return true;
          } 
          if (this.u.e(view) > this.u.n()) {
            if (paramb.c) {
              j = this.u.i();
            } else {
              j = this.u.m();
            } 
            paramb.b = j;
            return true;
          } 
          j = this.u.g(view) - this.u.m();
          if (j < 0) {
            paramb.b = -j;
            return true;
          } 
          j = this.u.i() - this.u.d(view);
          if (j < 0) {
            paramb.b = j;
            return true;
          } 
          paramb.b = Integer.MIN_VALUE;
        } else {
          j = this.C;
          paramb.a = j;
          int k = this.D;
          if (k == Integer.MIN_VALUE) {
            if (S1(j) == 1)
              bool1 = true; 
            paramb.c = bool1;
            paramb.a();
          } else {
            paramb.b(k);
          } 
          paramb.d = true;
        } 
        return true;
      } 
      paramb.b = Integer.MIN_VALUE;
      paramb.a = this.C;
      return true;
    } 
    return false;
  }
  
  public void R0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    u2(paramInt1, paramInt2, 1);
  }
  
  void R2(RecyclerView.y paramy, b paramb) {
    if (Q2(paramy, paramb))
      return; 
    if (P2(paramy, paramb))
      return; 
    paramb.a();
    paramb.a = 0;
  }
  
  public void S0(RecyclerView paramRecyclerView) {
    this.E.b();
    t1();
  }
  
  public void T0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {
    u2(paramInt1, paramInt2, 8);
  }
  
  boolean T1() {
    int j;
    int k;
    byte b1;
    if (J() == 0 || this.F == 0 || !r0())
      return false; 
    if (this.A) {
      j = n2();
      k = m2();
    } else {
      j = m2();
      k = n2();
    } 
    if (j == 0 && v2() != null) {
      this.E.b();
      u1();
      t1();
      return true;
    } 
    if (!this.M)
      return false; 
    if (this.A) {
      b1 = -1;
    } else {
      b1 = 1;
    } 
    LazySpanLookup lazySpanLookup = this.E;
    LazySpanLookup.FullSpanItem fullSpanItem2 = lazySpanLookup.e(j, ++k, b1, true);
    if (fullSpanItem2 == null) {
      this.M = false;
      this.E.d(k);
      return false;
    } 
    LazySpanLookup.FullSpanItem fullSpanItem1 = this.E.e(j, fullSpanItem2.b, b1 * -1, true);
    if (fullSpanItem1 == null) {
      this.E.d(fullSpanItem2.b);
    } else {
      this.E.d(fullSpanItem1.b + 1);
    } 
    u1();
    t1();
    return true;
  }
  
  void T2(int paramInt) {
    this.x = paramInt / this.s;
    this.J = View.MeasureSpec.makeMeasureSpec(paramInt, this.v.k());
  }
  
  public void U0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    u2(paramInt1, paramInt2, 2);
  }
  
  public void W0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject) {
    u2(paramInt1, paramInt2, 4);
  }
  
  public void X0(RecyclerView.u paramu, RecyclerView.y paramy) {
    A2(paramu, paramy, true);
  }
  
  public void Y0(RecyclerView.y paramy) {
    super.Y0(paramy);
    this.C = -1;
    this.D = Integer.MIN_VALUE;
    this.I = null;
    this.L.c();
  }
  
  public PointF a(int paramInt) {
    paramInt = S1(paramInt);
    PointF pointF = new PointF();
    if (paramInt == 0)
      return null; 
    if (this.w == 0) {
      pointF.x = paramInt;
      pointF.y = 0.0F;
    } else {
      pointF.x = 0.0F;
      pointF.y = paramInt;
    } 
    return pointF;
  }
  
  public void c1(Parcelable paramParcelable) {
    if (paramParcelable instanceof SavedState) {
      paramParcelable = paramParcelable;
      this.I = (SavedState)paramParcelable;
      if (this.C != -1) {
        paramParcelable.a();
        this.I.b();
      } 
      t1();
    } 
  }
  
  public Parcelable d1() {
    // Byte code:
    //   0: aload_0
    //   1: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
    //   4: ifnull -> 19
    //   7: new androidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState
    //   10: dup
    //   11: aload_0
    //   12: getfield I : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;
    //   15: invokespecial <init> : (Landroidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState;)V
    //   18: areturn
    //   19: new androidx/recyclerview/widget/StaggeredGridLayoutManager$SavedState
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore_1
    //   27: aload_1
    //   28: aload_0
    //   29: getfield z : Z
    //   32: putfield i : Z
    //   35: aload_1
    //   36: aload_0
    //   37: getfield G : Z
    //   40: putfield j : Z
    //   43: aload_1
    //   44: aload_0
    //   45: getfield H : Z
    //   48: putfield k : Z
    //   51: aload_0
    //   52: getfield E : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup;
    //   55: astore_2
    //   56: iconst_0
    //   57: istore_3
    //   58: aload_2
    //   59: ifnull -> 97
    //   62: aload_2
    //   63: getfield a : [I
    //   66: astore #4
    //   68: aload #4
    //   70: ifnull -> 97
    //   73: aload_1
    //   74: aload #4
    //   76: putfield g : [I
    //   79: aload_1
    //   80: aload #4
    //   82: arraylength
    //   83: putfield f : I
    //   86: aload_1
    //   87: aload_2
    //   88: getfield b : Ljava/util/List;
    //   91: putfield h : Ljava/util/List;
    //   94: goto -> 102
    //   97: aload_1
    //   98: iconst_0
    //   99: putfield f : I
    //   102: aload_0
    //   103: invokevirtual J : ()I
    //   106: ifle -> 270
    //   109: aload_0
    //   110: getfield G : Z
    //   113: ifeq -> 125
    //   116: aload_0
    //   117: invokevirtual n2 : ()I
    //   120: istore #5
    //   122: goto -> 131
    //   125: aload_0
    //   126: invokevirtual m2 : ()I
    //   129: istore #5
    //   131: aload_1
    //   132: iload #5
    //   134: putfield b : I
    //   137: aload_1
    //   138: aload_0
    //   139: invokevirtual h2 : ()I
    //   142: putfield c : I
    //   145: aload_0
    //   146: getfield s : I
    //   149: istore #5
    //   151: aload_1
    //   152: iload #5
    //   154: putfield d : I
    //   157: aload_1
    //   158: iload #5
    //   160: newarray int
    //   162: putfield e : [I
    //   165: iload_3
    //   166: aload_0
    //   167: getfield s : I
    //   170: if_icmpge -> 285
    //   173: aload_0
    //   174: getfield G : Z
    //   177: ifeq -> 216
    //   180: aload_0
    //   181: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   184: iload_3
    //   185: aaload
    //   186: ldc -2147483648
    //   188: invokevirtual o : (I)I
    //   191: istore #6
    //   193: iload #6
    //   195: istore #5
    //   197: iload #6
    //   199: ldc -2147483648
    //   201: if_icmpeq -> 256
    //   204: aload_0
    //   205: getfield u : Landroidx/recyclerview/widget/i;
    //   208: invokevirtual i : ()I
    //   211: istore #5
    //   213: goto -> 249
    //   216: aload_0
    //   217: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   220: iload_3
    //   221: aaload
    //   222: ldc -2147483648
    //   224: invokevirtual s : (I)I
    //   227: istore #6
    //   229: iload #6
    //   231: istore #5
    //   233: iload #6
    //   235: ldc -2147483648
    //   237: if_icmpeq -> 256
    //   240: aload_0
    //   241: getfield u : Landroidx/recyclerview/widget/i;
    //   244: invokevirtual m : ()I
    //   247: istore #5
    //   249: iload #6
    //   251: iload #5
    //   253: isub
    //   254: istore #5
    //   256: aload_1
    //   257: getfield e : [I
    //   260: iload_3
    //   261: iload #5
    //   263: iastore
    //   264: iinc #3, 1
    //   267: goto -> 165
    //   270: aload_1
    //   271: iconst_m1
    //   272: putfield b : I
    //   275: aload_1
    //   276: iconst_m1
    //   277: putfield c : I
    //   280: aload_1
    //   281: iconst_0
    //   282: putfield d : I
    //   285: aload_1
    //   286: areturn
  }
  
  public int[] d2(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 14
    //   4: aload_0
    //   5: getfield s : I
    //   8: newarray int
    //   10: astore_1
    //   11: goto -> 23
    //   14: aload_1
    //   15: arraylength
    //   16: aload_0
    //   17: getfield s : I
    //   20: if_icmplt -> 53
    //   23: iconst_0
    //   24: istore_2
    //   25: iload_2
    //   26: aload_0
    //   27: getfield s : I
    //   30: if_icmpge -> 51
    //   33: aload_1
    //   34: iload_2
    //   35: aload_0
    //   36: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   39: iload_2
    //   40: aaload
    //   41: invokevirtual f : ()I
    //   44: iastore
    //   45: iinc #2, 1
    //   48: goto -> 25
    //   51: aload_1
    //   52: areturn
    //   53: new java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial <init> : ()V
    //   60: astore_3
    //   61: aload_3
    //   62: ldc_w 'Provided int[]'s size must be more than or equal to span count. Expected:'
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_3
    //   70: aload_0
    //   71: getfield s : I
    //   74: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload_3
    //   79: ldc_w ', array size:'
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_3
    //   87: aload_1
    //   88: arraylength
    //   89: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: aload_3
    //   98: invokevirtual toString : ()Ljava/lang/String;
    //   101: invokespecial <init> : (Ljava/lang/String;)V
    //   104: astore_1
    //   105: goto -> 110
    //   108: aload_1
    //   109: athrow
    //   110: goto -> 108
  }
  
  public void e1(int paramInt) {
    if (paramInt == 0)
      T1(); 
  }
  
  View f2(boolean paramBoolean) {
    int j = this.u.m();
    int k = this.u.i();
    int m = J() - 1;
    View view;
    for (view = null; m >= 0; view = view2) {
      View view1 = I(m);
      int n = this.u.g(view1);
      int i1 = this.u.d(view1);
      View view2 = view;
      if (i1 > j)
        if (n >= k) {
          view2 = view;
        } else {
          if (i1 <= k || !paramBoolean)
            return view1; 
          view2 = view;
          if (view == null)
            view2 = view1; 
        }  
      m--;
    } 
    return view;
  }
  
  public void g(String paramString) {
    if (this.I == null)
      super.g(paramString); 
  }
  
  View g2(boolean paramBoolean) {
    int j = this.u.m();
    int k = this.u.i();
    int m = J();
    View view = null;
    byte b1 = 0;
    while (b1 < m) {
      View view1 = I(b1);
      int n = this.u.g(view1);
      View view2 = view;
      if (this.u.d(view1) > j)
        if (n >= k) {
          view2 = view;
        } else {
          if (n >= j || !paramBoolean)
            return view1; 
          view2 = view;
          if (view == null)
            view2 = view1; 
        }  
      b1++;
      view = view2;
    } 
    return view;
  }
  
  int h2() {
    View view;
    int j;
    if (this.A) {
      view = f2(true);
    } else {
      view = g2(true);
    } 
    if (view == null) {
      j = -1;
    } else {
      j = h0(view);
    } 
    return j;
  }
  
  public int[] j2(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 14
    //   4: aload_0
    //   5: getfield s : I
    //   8: newarray int
    //   10: astore_1
    //   11: goto -> 23
    //   14: aload_1
    //   15: arraylength
    //   16: aload_0
    //   17: getfield s : I
    //   20: if_icmplt -> 53
    //   23: iconst_0
    //   24: istore_2
    //   25: iload_2
    //   26: aload_0
    //   27: getfield s : I
    //   30: if_icmpge -> 51
    //   33: aload_1
    //   34: iload_2
    //   35: aload_0
    //   36: getfield t : [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   39: iload_2
    //   40: aaload
    //   41: invokevirtual i : ()I
    //   44: iastore
    //   45: iinc #2, 1
    //   48: goto -> 25
    //   51: aload_1
    //   52: areturn
    //   53: new java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial <init> : ()V
    //   60: astore_3
    //   61: aload_3
    //   62: ldc_w 'Provided int[]'s size must be more than or equal to span count. Expected:'
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_3
    //   70: aload_0
    //   71: getfield s : I
    //   74: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload_3
    //   79: ldc_w ', array size:'
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_3
    //   87: aload_1
    //   88: arraylength
    //   89: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: aload_3
    //   98: invokevirtual toString : ()Ljava/lang/String;
    //   101: invokespecial <init> : (Ljava/lang/String;)V
    //   104: astore_1
    //   105: goto -> 110
    //   108: aload_1
    //   109: athrow
    //   110: goto -> 108
  }
  
  public boolean k() {
    boolean bool;
    if (this.w == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean l() {
    int j = this.w;
    boolean bool = true;
    if (j != 1)
      bool = false; 
    return bool;
  }
  
  public boolean m(RecyclerView.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  int m2() {
    int j = J();
    int k = 0;
    if (j != 0)
      k = h0(I(0)); 
    return k;
  }
  
  int n2() {
    int j = J();
    if (j == 0) {
      j = 0;
    } else {
      j = h0(I(j - 1));
    } 
    return j;
  }
  
  public void o(int paramInt1, int paramInt2, RecyclerView.y paramy, RecyclerView.o.c paramc) {
    if (this.w != 0)
      paramInt1 = paramInt2; 
    if (J() != 0 && paramInt1 != 0) {
      C2(paramInt1, paramy);
      int[] arrayOfInt = this.O;
      if (arrayOfInt == null || arrayOfInt.length < this.s)
        this.O = new int[this.s]; 
      boolean bool = false;
      paramInt2 = 0;
      for (paramInt1 = 0; paramInt2 < this.s; paramInt1 = j) {
        f f1 = this.y;
        if (f1.d == -1) {
          j = f1.f;
          k = this.t[paramInt2].s(j);
        } else {
          j = this.t[paramInt2].o(f1.g);
          k = this.y.g;
        } 
        int k = j - k;
        int j = paramInt1;
        if (k >= 0) {
          this.O[paramInt1] = k;
          j = paramInt1 + 1;
        } 
        paramInt2++;
      } 
      Arrays.sort(this.O, 0, paramInt1);
      for (paramInt2 = bool; paramInt2 < paramInt1 && this.y.a(paramy); paramInt2++) {
        paramc.a(this.y.c, this.O[paramInt2]);
        f f1 = this.y;
        f1.c += f1.d;
      } 
    } 
  }
  
  public int q(RecyclerView.y paramy) {
    return V1(paramy);
  }
  
  public int r(RecyclerView.y paramy) {
    return W1(paramy);
  }
  
  public int s(RecyclerView.y paramy) {
    return X1(paramy);
  }
  
  public boolean s0() {
    boolean bool;
    if (this.F != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int t(RecyclerView.y paramy) {
    return V1(paramy);
  }
  
  public int t2() {
    return this.s;
  }
  
  public int u(RecyclerView.y paramy) {
    return W1(paramy);
  }
  
  public int v(RecyclerView.y paramy) {
    return X1(paramy);
  }
  
  View v2() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual J : ()I
    //   4: iconst_1
    //   5: isub
    //   6: istore_1
    //   7: new java/util/BitSet
    //   10: dup
    //   11: aload_0
    //   12: getfield s : I
    //   15: invokespecial <init> : (I)V
    //   18: astore_2
    //   19: aload_2
    //   20: iconst_0
    //   21: aload_0
    //   22: getfield s : I
    //   25: iconst_1
    //   26: invokevirtual set : (IIZ)V
    //   29: aload_0
    //   30: getfield w : I
    //   33: istore_3
    //   34: iconst_m1
    //   35: istore #4
    //   37: iload_3
    //   38: iconst_1
    //   39: if_icmpne -> 54
    //   42: aload_0
    //   43: invokevirtual x2 : ()Z
    //   46: ifeq -> 54
    //   49: iconst_1
    //   50: istore_3
    //   51: goto -> 56
    //   54: iconst_m1
    //   55: istore_3
    //   56: aload_0
    //   57: getfield A : Z
    //   60: ifeq -> 69
    //   63: iconst_m1
    //   64: istore #5
    //   66: goto -> 76
    //   69: iload_1
    //   70: iconst_1
    //   71: iadd
    //   72: istore #5
    //   74: iconst_0
    //   75: istore_1
    //   76: iload_1
    //   77: istore #6
    //   79: iload_1
    //   80: iload #5
    //   82: if_icmpge -> 91
    //   85: iconst_1
    //   86: istore #4
    //   88: iload_1
    //   89: istore #6
    //   91: iload #6
    //   93: iload #5
    //   95: if_icmpeq -> 350
    //   98: aload_0
    //   99: iload #6
    //   101: invokevirtual I : (I)Landroid/view/View;
    //   104: astore #7
    //   106: aload #7
    //   108: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   111: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams
    //   114: astore #8
    //   116: aload_2
    //   117: aload #8
    //   119: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   122: getfield e : I
    //   125: invokevirtual get : (I)Z
    //   128: ifeq -> 158
    //   131: aload_0
    //   132: aload #8
    //   134: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   137: invokespecial U1 : (Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;)Z
    //   140: ifeq -> 146
    //   143: aload #7
    //   145: areturn
    //   146: aload_2
    //   147: aload #8
    //   149: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   152: getfield e : I
    //   155: invokevirtual clear : (I)V
    //   158: aload #8
    //   160: getfield f : Z
    //   163: ifeq -> 169
    //   166: goto -> 340
    //   169: iload #6
    //   171: iload #4
    //   173: iadd
    //   174: istore_1
    //   175: iload_1
    //   176: iload #5
    //   178: if_icmpeq -> 340
    //   181: aload_0
    //   182: iload_1
    //   183: invokevirtual I : (I)Landroid/view/View;
    //   186: astore #9
    //   188: aload_0
    //   189: getfield A : Z
    //   192: ifeq -> 234
    //   195: aload_0
    //   196: getfield u : Landroidx/recyclerview/widget/i;
    //   199: aload #7
    //   201: invokevirtual d : (Landroid/view/View;)I
    //   204: istore #10
    //   206: aload_0
    //   207: getfield u : Landroidx/recyclerview/widget/i;
    //   210: aload #9
    //   212: invokevirtual d : (Landroid/view/View;)I
    //   215: istore_1
    //   216: iload #10
    //   218: iload_1
    //   219: if_icmpge -> 225
    //   222: aload #7
    //   224: areturn
    //   225: iload #10
    //   227: iload_1
    //   228: if_icmpne -> 275
    //   231: goto -> 270
    //   234: aload_0
    //   235: getfield u : Landroidx/recyclerview/widget/i;
    //   238: aload #7
    //   240: invokevirtual g : (Landroid/view/View;)I
    //   243: istore #10
    //   245: aload_0
    //   246: getfield u : Landroidx/recyclerview/widget/i;
    //   249: aload #9
    //   251: invokevirtual g : (Landroid/view/View;)I
    //   254: istore_1
    //   255: iload #10
    //   257: iload_1
    //   258: if_icmple -> 264
    //   261: aload #7
    //   263: areturn
    //   264: iload #10
    //   266: iload_1
    //   267: if_icmpne -> 275
    //   270: iconst_1
    //   271: istore_1
    //   272: goto -> 277
    //   275: iconst_0
    //   276: istore_1
    //   277: iload_1
    //   278: ifeq -> 340
    //   281: aload #9
    //   283: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   286: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams
    //   289: astore #9
    //   291: aload #8
    //   293: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   296: getfield e : I
    //   299: aload #9
    //   301: getfield e : Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
    //   304: getfield e : I
    //   307: isub
    //   308: ifge -> 316
    //   311: iconst_1
    //   312: istore_1
    //   313: goto -> 318
    //   316: iconst_0
    //   317: istore_1
    //   318: iload_3
    //   319: ifge -> 328
    //   322: iconst_1
    //   323: istore #10
    //   325: goto -> 331
    //   328: iconst_0
    //   329: istore #10
    //   331: iload_1
    //   332: iload #10
    //   334: if_icmpeq -> 340
    //   337: aload #7
    //   339: areturn
    //   340: iload #6
    //   342: iload #4
    //   344: iadd
    //   345: istore #6
    //   347: goto -> 91
    //   350: aconst_null
    //   351: areturn
  }
  
  public int w1(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    return J2(paramInt, paramu, paramy);
  }
  
  public void w2() {
    this.E.b();
    t1();
  }
  
  public void x1(int paramInt) {
    SavedState savedState = this.I;
    if (savedState != null && savedState.b != paramInt)
      savedState.a(); 
    this.C = paramInt;
    this.D = Integer.MIN_VALUE;
    t1();
  }
  
  boolean x2() {
    int j = Z();
    boolean bool = true;
    if (j != 1)
      bool = false; 
    return bool;
  }
  
  public int y1(int paramInt, RecyclerView.u paramu, RecyclerView.y paramy) {
    return J2(paramInt, paramu, paramy);
  }
  
  public static class LayoutParams extends RecyclerView.LayoutParams {
    StaggeredGridLayoutManager.c e;
    
    boolean f;
    
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
    
    public boolean e() {
      return this.f;
    }
    
    public void f(boolean param1Boolean) {
      this.f = param1Boolean;
    }
  }
  
  static class LazySpanLookup {
    int[] a;
    
    List<FullSpanItem> b;
    
    private int i(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Ljava/util/List;
      //   4: ifnonnull -> 9
      //   7: iconst_m1
      //   8: ireturn
      //   9: aload_0
      //   10: iload_1
      //   11: invokevirtual f : (I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
      //   14: astore_2
      //   15: aload_2
      //   16: ifnull -> 30
      //   19: aload_0
      //   20: getfield b : Ljava/util/List;
      //   23: aload_2
      //   24: invokeinterface remove : (Ljava/lang/Object;)Z
      //   29: pop
      //   30: aload_0
      //   31: getfield b : Ljava/util/List;
      //   34: invokeinterface size : ()I
      //   39: istore_3
      //   40: iconst_0
      //   41: istore #4
      //   43: iload #4
      //   45: iload_3
      //   46: if_icmpge -> 79
      //   49: aload_0
      //   50: getfield b : Ljava/util/List;
      //   53: iload #4
      //   55: invokeinterface get : (I)Ljava/lang/Object;
      //   60: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
      //   63: getfield b : I
      //   66: iload_1
      //   67: if_icmplt -> 73
      //   70: goto -> 82
      //   73: iinc #4, 1
      //   76: goto -> 43
      //   79: iconst_m1
      //   80: istore #4
      //   82: iload #4
      //   84: iconst_m1
      //   85: if_icmpeq -> 120
      //   88: aload_0
      //   89: getfield b : Ljava/util/List;
      //   92: iload #4
      //   94: invokeinterface get : (I)Ljava/lang/Object;
      //   99: checkcast androidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
      //   102: astore_2
      //   103: aload_0
      //   104: getfield b : Ljava/util/List;
      //   107: iload #4
      //   109: invokeinterface remove : (I)Ljava/lang/Object;
      //   114: pop
      //   115: aload_2
      //   116: getfield b : I
      //   119: ireturn
      //   120: iconst_m1
      //   121: ireturn
    }
    
    private void l(int param1Int1, int param1Int2) {
      List<FullSpanItem> list = this.b;
      if (list == null)
        return; 
      for (int i = list.size() - 1; i >= 0; i--) {
        FullSpanItem fullSpanItem = this.b.get(i);
        int j = fullSpanItem.b;
        if (j >= param1Int1)
          fullSpanItem.b = j + param1Int2; 
      } 
    }
    
    private void m(int param1Int1, int param1Int2) {
      List<FullSpanItem> list = this.b;
      if (list == null)
        return; 
      for (int i = list.size() - 1; i >= 0; i--) {
        FullSpanItem fullSpanItem = this.b.get(i);
        int j = fullSpanItem.b;
        if (j >= param1Int1)
          if (j < param1Int1 + param1Int2) {
            this.b.remove(i);
          } else {
            fullSpanItem.b = j - param1Int2;
          }  
      } 
    }
    
    public void a(FullSpanItem param1FullSpanItem) {
      if (this.b == null)
        this.b = new ArrayList<FullSpanItem>(); 
      int i = this.b.size();
      for (byte b = 0; b < i; b++) {
        FullSpanItem fullSpanItem = this.b.get(b);
        if (fullSpanItem.b == param1FullSpanItem.b)
          this.b.remove(b); 
        if (fullSpanItem.b >= param1FullSpanItem.b) {
          this.b.add(b, param1FullSpanItem);
          return;
        } 
      } 
      this.b.add(param1FullSpanItem);
    }
    
    void b() {
      int[] arrayOfInt = this.a;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
      this.b = null;
    }
    
    void c(int param1Int) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt == null) {
        arrayOfInt = new int[Math.max(param1Int, 10) + 1];
        this.a = arrayOfInt;
        Arrays.fill(arrayOfInt, -1);
      } else if (param1Int >= arrayOfInt.length) {
        int[] arrayOfInt1 = new int[o(param1Int)];
        this.a = arrayOfInt1;
        System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
        arrayOfInt1 = this.a;
        Arrays.fill(arrayOfInt1, arrayOfInt.length, arrayOfInt1.length, -1);
      } 
    }
    
    int d(int param1Int) {
      List<FullSpanItem> list = this.b;
      if (list != null)
        for (int i = list.size() - 1; i >= 0; i--) {
          if (((FullSpanItem)this.b.get(i)).b >= param1Int)
            this.b.remove(i); 
        }  
      return h(param1Int);
    }
    
    public FullSpanItem e(int param1Int1, int param1Int2, int param1Int3, boolean param1Boolean) {
      List<FullSpanItem> list = this.b;
      if (list == null)
        return null; 
      int i = list.size();
      for (byte b = 0; b < i; b++) {
        FullSpanItem fullSpanItem = this.b.get(b);
        int j = fullSpanItem.b;
        if (j >= param1Int2)
          return null; 
        if (j >= param1Int1 && (param1Int3 == 0 || fullSpanItem.c == param1Int3 || (param1Boolean && fullSpanItem.e)))
          return fullSpanItem; 
      } 
      return null;
    }
    
    public FullSpanItem f(int param1Int) {
      List<FullSpanItem> list = this.b;
      if (list == null)
        return null; 
      for (int i = list.size() - 1; i >= 0; i--) {
        FullSpanItem fullSpanItem = this.b.get(i);
        if (fullSpanItem.b == param1Int)
          return fullSpanItem; 
      } 
      return null;
    }
    
    int g(int param1Int) {
      int[] arrayOfInt = this.a;
      return (arrayOfInt == null || param1Int >= arrayOfInt.length) ? -1 : arrayOfInt[param1Int];
    }
    
    int h(int param1Int) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt == null)
        return -1; 
      if (param1Int >= arrayOfInt.length)
        return -1; 
      int i = i(param1Int);
      if (i == -1) {
        arrayOfInt = this.a;
        Arrays.fill(arrayOfInt, param1Int, arrayOfInt.length, -1);
        return this.a.length;
      } 
      i = Math.min(i + 1, this.a.length);
      Arrays.fill(this.a, param1Int, i, -1);
      return i;
    }
    
    void j(int param1Int1, int param1Int2) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt != null && param1Int1 < arrayOfInt.length) {
        int i = param1Int1 + param1Int2;
        c(i);
        arrayOfInt = this.a;
        System.arraycopy(arrayOfInt, param1Int1, arrayOfInt, i, arrayOfInt.length - param1Int1 - param1Int2);
        Arrays.fill(this.a, param1Int1, i, -1);
        l(param1Int1, param1Int2);
      } 
    }
    
    void k(int param1Int1, int param1Int2) {
      int[] arrayOfInt = this.a;
      if (arrayOfInt != null && param1Int1 < arrayOfInt.length) {
        int i = param1Int1 + param1Int2;
        c(i);
        arrayOfInt = this.a;
        System.arraycopy(arrayOfInt, i, arrayOfInt, param1Int1, arrayOfInt.length - param1Int1 - param1Int2);
        arrayOfInt = this.a;
        Arrays.fill(arrayOfInt, arrayOfInt.length - param1Int2, arrayOfInt.length, -1);
        m(param1Int1, param1Int2);
      } 
    }
    
    void n(int param1Int, StaggeredGridLayoutManager.c param1c) {
      c(param1Int);
      this.a[param1Int] = param1c.e;
    }
    
    int o(int param1Int) {
      int i;
      for (i = this.a.length; i <= param1Int; i *= 2);
      return i;
    }
    
    @SuppressLint({"BanParcelableUsage"})
    static class FullSpanItem implements Parcelable {
      public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
      
      int b;
      
      int c;
      
      int[] d;
      
      boolean e;
      
      FullSpanItem() {}
      
      FullSpanItem(Parcel param2Parcel) {
        this.b = param2Parcel.readInt();
        this.c = param2Parcel.readInt();
        int i = param2Parcel.readInt();
        boolean bool = true;
        if (i != 1)
          bool = false; 
        this.e = bool;
        i = param2Parcel.readInt();
        if (i > 0) {
          int[] arrayOfInt = new int[i];
          this.d = arrayOfInt;
          param2Parcel.readIntArray(arrayOfInt);
        } 
      }
      
      int a(int param2Int) {
        int[] arrayOfInt = this.d;
        if (arrayOfInt == null) {
          param2Int = 0;
        } else {
          param2Int = arrayOfInt[param2Int];
        } 
        return param2Int;
      }
      
      public int describeContents() {
        return 0;
      }
      
      public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FullSpanItem{mPosition=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mGapDir=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mHasUnwantedGapAfter=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mGapPerSpan=");
        stringBuilder.append(Arrays.toString(this.d));
        stringBuilder.append('}');
        return stringBuilder.toString();
      }
      
      public void writeToParcel(Parcel param2Parcel, int param2Int) {
        param2Parcel.writeInt(this.b);
        param2Parcel.writeInt(this.c);
        param2Parcel.writeInt(this.e);
        int[] arrayOfInt = this.d;
        if (arrayOfInt != null && arrayOfInt.length > 0) {
          param2Parcel.writeInt(arrayOfInt.length);
          param2Parcel.writeIntArray(this.d);
        } else {
          param2Parcel.writeInt(0);
        } 
      }
      
      class a implements Parcelable.Creator<FullSpanItem> {
        public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a(Parcel param3Parcel) {
          return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(param3Parcel);
        }
        
        public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] b(int param3Int) {
          return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[param3Int];
        }
      }
    }
    
    class a implements Parcelable.Creator<FullSpanItem> {
      public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a(Parcel param2Parcel) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(param2Parcel);
      }
      
      public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] b(int param2Int) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[param2Int];
      }
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  static class FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
    
    int b;
    
    int c;
    
    int[] d;
    
    boolean e;
    
    FullSpanItem() {}
    
    FullSpanItem(Parcel param1Parcel) {
      this.b = param1Parcel.readInt();
      this.c = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      this.e = bool;
      i = param1Parcel.readInt();
      if (i > 0) {
        int[] arrayOfInt = new int[i];
        this.d = arrayOfInt;
        param1Parcel.readIntArray(arrayOfInt);
      } 
    }
    
    int a(int param1Int) {
      int[] arrayOfInt = this.d;
      if (arrayOfInt == null) {
        param1Int = 0;
      } else {
        param1Int = arrayOfInt[param1Int];
      } 
      return param1Int;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("FullSpanItem{mPosition=");
      stringBuilder.append(this.b);
      stringBuilder.append(", mGapDir=");
      stringBuilder.append(this.c);
      stringBuilder.append(", mHasUnwantedGapAfter=");
      stringBuilder.append(this.e);
      stringBuilder.append(", mGapPerSpan=");
      stringBuilder.append(Arrays.toString(this.d));
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeInt(this.b);
      param1Parcel.writeInt(this.c);
      param1Parcel.writeInt(this.e);
      int[] arrayOfInt = this.d;
      if (arrayOfInt != null && arrayOfInt.length > 0) {
        param1Parcel.writeInt(arrayOfInt.length);
        param1Parcel.writeIntArray(this.d);
      } else {
        param1Parcel.writeInt(0);
      } 
    }
    
    class a implements Parcelable.Creator<FullSpanItem> {
      public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a(Parcel param3Parcel) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(param3Parcel);
      }
      
      public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] b(int param3Int) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[param3Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<LazySpanLookup.FullSpanItem> {
    public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a(Parcel param1Parcel) {
      return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(param1Parcel);
    }
    
    public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] b(int param1Int) {
      return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[param1Int];
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class SavedState implements Parcelable {
    public static final Parcelable.Creator<SavedState> CREATOR = new a();
    
    int b;
    
    int c;
    
    int d;
    
    int[] e;
    
    int f;
    
    int[] g;
    
    List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> h;
    
    boolean i;
    
    boolean j;
    
    boolean k;
    
    public SavedState() {}
    
    SavedState(Parcel param1Parcel) {
      this.b = param1Parcel.readInt();
      this.c = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      this.d = i;
      if (i > 0) {
        int[] arrayOfInt = new int[i];
        this.e = arrayOfInt;
        param1Parcel.readIntArray(arrayOfInt);
      } 
      i = param1Parcel.readInt();
      this.f = i;
      if (i > 0) {
        int[] arrayOfInt = new int[i];
        this.g = arrayOfInt;
        param1Parcel.readIntArray(arrayOfInt);
      } 
      i = param1Parcel.readInt();
      boolean bool1 = false;
      if (i == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.i = bool2;
      if (param1Parcel.readInt() == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.j = bool2;
      boolean bool2 = bool1;
      if (param1Parcel.readInt() == 1)
        bool2 = true; 
      this.k = bool2;
      this.h = param1Parcel.readArrayList(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader());
    }
    
    public SavedState(SavedState param1SavedState) {
      this.d = param1SavedState.d;
      this.b = param1SavedState.b;
      this.c = param1SavedState.c;
      this.e = param1SavedState.e;
      this.f = param1SavedState.f;
      this.g = param1SavedState.g;
      this.i = param1SavedState.i;
      this.j = param1SavedState.j;
      this.k = param1SavedState.k;
      this.h = param1SavedState.h;
    }
    
    void a() {
      this.e = null;
      this.d = 0;
      this.b = -1;
      this.c = -1;
    }
    
    void b() {
      this.e = null;
      this.d = 0;
      this.f = 0;
      this.g = null;
      this.h = null;
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeInt(this.b);
      param1Parcel.writeInt(this.c);
      param1Parcel.writeInt(this.d);
      if (this.d > 0)
        param1Parcel.writeIntArray(this.e); 
      param1Parcel.writeInt(this.f);
      if (this.f > 0)
        param1Parcel.writeIntArray(this.g); 
      param1Parcel.writeInt(this.i);
      param1Parcel.writeInt(this.j);
      param1Parcel.writeInt(this.k);
      param1Parcel.writeList(this.h);
    }
    
    class a implements Parcelable.Creator<SavedState> {
      public StaggeredGridLayoutManager.SavedState a(Parcel param2Parcel) {
        return new StaggeredGridLayoutManager.SavedState(param2Parcel);
      }
      
      public StaggeredGridLayoutManager.SavedState[] b(int param2Int) {
        return new StaggeredGridLayoutManager.SavedState[param2Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<SavedState> {
    public StaggeredGridLayoutManager.SavedState a(Parcel param1Parcel) {
      return new StaggeredGridLayoutManager.SavedState(param1Parcel);
    }
    
    public StaggeredGridLayoutManager.SavedState[] b(int param1Int) {
      return new StaggeredGridLayoutManager.SavedState[param1Int];
    }
  }
  
  class a implements Runnable {
    a(StaggeredGridLayoutManager this$0) {}
    
    public void run() {
      this.b.T1();
    }
  }
  
  class b {
    int a;
    
    int b;
    
    boolean c;
    
    boolean d;
    
    boolean e;
    
    int[] f;
    
    b(StaggeredGridLayoutManager this$0) {
      c();
    }
    
    void a() {
      int i;
      if (this.c) {
        i = this.g.u.i();
      } else {
        i = this.g.u.m();
      } 
      this.b = i;
    }
    
    void b(int param1Int) {
      if (this.c) {
        this.b = this.g.u.i() - param1Int;
      } else {
        this.b = this.g.u.m() + param1Int;
      } 
    }
    
    void c() {
      this.a = -1;
      this.b = Integer.MIN_VALUE;
      this.c = false;
      this.d = false;
      this.e = false;
      int[] arrayOfInt = this.f;
      if (arrayOfInt != null)
        Arrays.fill(arrayOfInt, -1); 
    }
    
    void d(StaggeredGridLayoutManager.c[] param1ArrayOfc) {
      int i = param1ArrayOfc.length;
      int[] arrayOfInt = this.f;
      if (arrayOfInt == null || arrayOfInt.length < i)
        this.f = new int[this.g.t.length]; 
      for (byte b1 = 0; b1 < i; b1++)
        this.f[b1] = param1ArrayOfc[b1].s(-2147483648); 
    }
  }
  
  class c {
    ArrayList<View> a = new ArrayList<View>();
    
    int b = Integer.MIN_VALUE;
    
    int c = Integer.MIN_VALUE;
    
    int d = 0;
    
    final int e;
    
    c(StaggeredGridLayoutManager this$0, int param1Int) {
      this.e = param1Int;
    }
    
    void a(View param1View) {
      StaggeredGridLayoutManager.LayoutParams layoutParams = q(param1View);
      layoutParams.e = this;
      this.a.add(param1View);
      this.c = Integer.MIN_VALUE;
      if (this.a.size() == 1)
        this.b = Integer.MIN_VALUE; 
      if (layoutParams.c() || layoutParams.b())
        this.d += this.f.u.e(param1View); 
    }
    
    void b(boolean param1Boolean, int param1Int) {
      int i;
      if (param1Boolean) {
        i = o(-2147483648);
      } else {
        i = s(-2147483648);
      } 
      e();
      if (i == Integer.MIN_VALUE)
        return; 
      if ((param1Boolean && i < this.f.u.i()) || (!param1Boolean && i > this.f.u.m()))
        return; 
      int j = i;
      if (param1Int != Integer.MIN_VALUE)
        j = i + param1Int; 
      this.c = j;
      this.b = j;
    }
    
    void c() {
      ArrayList<View> arrayList = this.a;
      View view = arrayList.get(arrayList.size() - 1);
      StaggeredGridLayoutManager.LayoutParams layoutParams = q(view);
      this.c = this.f.u.d(view);
      if (layoutParams.f) {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem = this.f.E.f(layoutParams.a());
        if (fullSpanItem != null && fullSpanItem.c == 1)
          this.c += fullSpanItem.a(this.e); 
      } 
    }
    
    void d() {
      View view = this.a.get(0);
      StaggeredGridLayoutManager.LayoutParams layoutParams = q(view);
      this.b = this.f.u.g(view);
      if (layoutParams.f) {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItem = this.f.E.f(layoutParams.a());
        if (fullSpanItem != null && fullSpanItem.c == -1)
          this.b -= fullSpanItem.a(this.e); 
      } 
    }
    
    void e() {
      this.a.clear();
      t();
      this.d = 0;
    }
    
    public int f() {
      int i;
      if (this.f.z) {
        i = l(this.a.size() - 1, -1, true);
      } else {
        i = l(0, this.a.size(), true);
      } 
      return i;
    }
    
    public int g() {
      int i;
      if (this.f.z) {
        i = k(this.a.size() - 1, -1, true);
      } else {
        i = k(0, this.a.size(), true);
      } 
      return i;
    }
    
    public int h() {
      int i;
      if (this.f.z) {
        i = k(0, this.a.size(), true);
      } else {
        i = k(this.a.size() - 1, -1, true);
      } 
      return i;
    }
    
    public int i() {
      int i;
      if (this.f.z) {
        i = l(0, this.a.size(), false);
      } else {
        i = l(this.a.size() - 1, -1, false);
      } 
      return i;
    }
    
    int j(int param1Int1, int param1Int2, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3) {
      byte b;
      int i = this.f.u.m();
      int j = this.f.u.i();
      if (param1Int2 > param1Int1) {
        b = 1;
      } else {
        b = -1;
      } 
      while (param1Int1 != param1Int2) {
        boolean bool2;
        View view = this.a.get(param1Int1);
        int k = this.f.u.g(view);
        int m = this.f.u.d(view);
        boolean bool1 = false;
        if (param1Boolean3 ? (k <= j) : (k < j)) {
          bool2 = true;
        } else {
          bool2 = false;
        } 
        if (param1Boolean3 ? (m >= i) : (m > i))
          bool1 = true; 
        if (bool2 && bool1)
          if (param1Boolean1 && param1Boolean2) {
            if (k >= i && m <= j)
              return this.f.h0(view); 
          } else {
            if (param1Boolean2)
              return this.f.h0(view); 
            if (k < i || m > j)
              return this.f.h0(view); 
          }  
        param1Int1 += b;
      } 
      return -1;
    }
    
    int k(int param1Int1, int param1Int2, boolean param1Boolean) {
      return j(param1Int1, param1Int2, false, false, param1Boolean);
    }
    
    int l(int param1Int1, int param1Int2, boolean param1Boolean) {
      return j(param1Int1, param1Int2, param1Boolean, true, false);
    }
    
    public int m() {
      return this.d;
    }
    
    int n() {
      int i = this.c;
      if (i != Integer.MIN_VALUE)
        return i; 
      c();
      return this.c;
    }
    
    int o(int param1Int) {
      int i = this.c;
      if (i != Integer.MIN_VALUE)
        return i; 
      if (this.a.size() == 0)
        return param1Int; 
      c();
      return this.c;
    }
    
    public View p(int param1Int1, int param1Int2) {
      // Byte code:
      //   0: aconst_null
      //   1: astore_3
      //   2: aconst_null
      //   3: astore #4
      //   5: iload_2
      //   6: iconst_m1
      //   7: if_icmpne -> 120
      //   10: aload_0
      //   11: getfield a : Ljava/util/ArrayList;
      //   14: invokevirtual size : ()I
      //   17: istore #5
      //   19: iconst_0
      //   20: istore_2
      //   21: aload #4
      //   23: astore_3
      //   24: iload_2
      //   25: iload #5
      //   27: if_icmpge -> 230
      //   30: aload_0
      //   31: getfield a : Ljava/util/ArrayList;
      //   34: iload_2
      //   35: invokevirtual get : (I)Ljava/lang/Object;
      //   38: checkcast android/view/View
      //   41: astore #6
      //   43: aload_0
      //   44: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   47: astore #7
      //   49: aload #7
      //   51: getfield z : Z
      //   54: ifeq -> 71
      //   57: aload #4
      //   59: astore_3
      //   60: aload #7
      //   62: aload #6
      //   64: invokevirtual h0 : (Landroid/view/View;)I
      //   67: iload_1
      //   68: if_icmple -> 230
      //   71: aload_0
      //   72: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   75: astore_3
      //   76: aload_3
      //   77: getfield z : Z
      //   80: ifne -> 99
      //   83: aload_3
      //   84: aload #6
      //   86: invokevirtual h0 : (Landroid/view/View;)I
      //   89: iload_1
      //   90: if_icmplt -> 99
      //   93: aload #4
      //   95: astore_3
      //   96: goto -> 230
      //   99: aload #4
      //   101: astore_3
      //   102: aload #6
      //   104: invokevirtual hasFocusable : ()Z
      //   107: ifeq -> 230
      //   110: iinc #2, 1
      //   113: aload #6
      //   115: astore #4
      //   117: goto -> 21
      //   120: aload_0
      //   121: getfield a : Ljava/util/ArrayList;
      //   124: invokevirtual size : ()I
      //   127: iconst_1
      //   128: isub
      //   129: istore_2
      //   130: aload_3
      //   131: astore #4
      //   133: aload #4
      //   135: astore_3
      //   136: iload_2
      //   137: iflt -> 230
      //   140: aload_0
      //   141: getfield a : Ljava/util/ArrayList;
      //   144: iload_2
      //   145: invokevirtual get : (I)Ljava/lang/Object;
      //   148: checkcast android/view/View
      //   151: astore #6
      //   153: aload_0
      //   154: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   157: astore #7
      //   159: aload #7
      //   161: getfield z : Z
      //   164: ifeq -> 181
      //   167: aload #4
      //   169: astore_3
      //   170: aload #7
      //   172: aload #6
      //   174: invokevirtual h0 : (Landroid/view/View;)I
      //   177: iload_1
      //   178: if_icmpge -> 230
      //   181: aload_0
      //   182: getfield f : Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
      //   185: astore_3
      //   186: aload_3
      //   187: getfield z : Z
      //   190: ifne -> 209
      //   193: aload_3
      //   194: aload #6
      //   196: invokevirtual h0 : (Landroid/view/View;)I
      //   199: iload_1
      //   200: if_icmpgt -> 209
      //   203: aload #4
      //   205: astore_3
      //   206: goto -> 230
      //   209: aload #4
      //   211: astore_3
      //   212: aload #6
      //   214: invokevirtual hasFocusable : ()Z
      //   217: ifeq -> 230
      //   220: iinc #2, -1
      //   223: aload #6
      //   225: astore #4
      //   227: goto -> 133
      //   230: aload_3
      //   231: areturn
    }
    
    StaggeredGridLayoutManager.LayoutParams q(View param1View) {
      return (StaggeredGridLayoutManager.LayoutParams)param1View.getLayoutParams();
    }
    
    int r() {
      int i = this.b;
      if (i != Integer.MIN_VALUE)
        return i; 
      d();
      return this.b;
    }
    
    int s(int param1Int) {
      int i = this.b;
      if (i != Integer.MIN_VALUE)
        return i; 
      if (this.a.size() == 0)
        return param1Int; 
      d();
      return this.b;
    }
    
    void t() {
      this.b = Integer.MIN_VALUE;
      this.c = Integer.MIN_VALUE;
    }
    
    void u(int param1Int) {
      int i = this.b;
      if (i != Integer.MIN_VALUE)
        this.b = i + param1Int; 
      i = this.c;
      if (i != Integer.MIN_VALUE)
        this.c = i + param1Int; 
    }
    
    void v() {
      int i = this.a.size();
      View view = this.a.remove(i - 1);
      StaggeredGridLayoutManager.LayoutParams layoutParams = q(view);
      layoutParams.e = null;
      if (layoutParams.c() || layoutParams.b())
        this.d -= this.f.u.e(view); 
      if (i == 1)
        this.b = Integer.MIN_VALUE; 
      this.c = Integer.MIN_VALUE;
    }
    
    void w() {
      View view = this.a.remove(0);
      StaggeredGridLayoutManager.LayoutParams layoutParams = q(view);
      layoutParams.e = null;
      if (this.a.size() == 0)
        this.c = Integer.MIN_VALUE; 
      if (layoutParams.c() || layoutParams.b())
        this.d -= this.f.u.e(view); 
      this.b = Integer.MIN_VALUE;
    }
    
    void x(View param1View) {
      StaggeredGridLayoutManager.LayoutParams layoutParams = q(param1View);
      layoutParams.e = this;
      this.a.add(0, param1View);
      this.b = Integer.MIN_VALUE;
      if (this.a.size() == 1)
        this.c = Integer.MIN_VALUE; 
      if (layoutParams.c() || layoutParams.b())
        this.d += this.f.u.e(param1View); 
    }
    
    void y(int param1Int) {
      this.b = param1Int;
      this.c = param1Int;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/StaggeredGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */