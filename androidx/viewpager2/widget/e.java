package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

final class e extends RecyclerView.s {
  private ViewPager2.i a;
  
  private final ViewPager2 b;
  
  private final RecyclerView c;
  
  private final LinearLayoutManager d;
  
  private int e;
  
  private int f;
  
  private a g;
  
  private int h;
  
  private int i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  private boolean m;
  
  e(ViewPager2 paramViewPager2) {
    this.b = paramViewPager2;
    RecyclerView recyclerView = paramViewPager2.l;
    this.c = recyclerView;
    this.d = (LinearLayoutManager)recyclerView.getLayoutManager();
    this.g = new a();
    n();
  }
  
  private void c(int paramInt1, float paramFloat, int paramInt2) {
    ViewPager2.i i1 = this.a;
    if (i1 != null)
      i1.b(paramInt1, paramFloat, paramInt2); 
  }
  
  private void d(int paramInt) {
    ViewPager2.i i1 = this.a;
    if (i1 != null)
      i1.c(paramInt); 
  }
  
  private void e(int paramInt) {
    if (this.e == 3 && this.f == 0)
      return; 
    if (this.f == paramInt)
      return; 
    this.f = paramInt;
    ViewPager2.i i1 = this.a;
    if (i1 != null)
      i1.a(paramInt); 
  }
  
  private int f() {
    return this.d.Z1();
  }
  
  private boolean k() {
    int j = this.e;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (j != 1)
      if (j == 4) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    return bool2;
  }
  
  private void n() {
    this.e = 0;
    this.f = 0;
    this.g.a();
    this.h = -1;
    this.i = -1;
    this.j = false;
    this.k = false;
    this.m = false;
    this.l = false;
  }
  
  private void p(boolean paramBoolean) {
    this.m = paramBoolean;
    if (paramBoolean) {
      j = 4;
    } else {
      j = 1;
    } 
    this.e = j;
    int j = this.i;
    if (j != -1) {
      this.h = j;
      this.i = -1;
    } else if (this.h == -1) {
      this.h = f();
    } 
    e(1);
  }
  
  private void q() {
    float f;
    a a1 = this.g;
    int j = this.d.Z1();
    a1.a = j;
    if (j == -1) {
      a1.a();
      return;
    } 
    View view = this.d.C(j);
    if (view == null) {
      a1.a();
      return;
    } 
    int k = this.d.a0(view);
    int m = this.d.j0(view);
    int n = this.d.m0(view);
    int i1 = this.d.H(view);
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    int i2 = k;
    int i3 = m;
    j = n;
    int i4 = i1;
    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
      i2 = k + marginLayoutParams.leftMargin;
      i3 = m + marginLayoutParams.rightMargin;
      j = n + marginLayoutParams.topMargin;
      i4 = i1 + marginLayoutParams.bottomMargin;
    } 
    i1 = view.getHeight() + j + i4;
    n = view.getWidth();
    if (this.d.m2() == 0) {
      i4 = 1;
    } else {
      i4 = 0;
    } 
    if (i4 != 0) {
      i4 = view.getLeft() - i2 - this.c.getPaddingLeft();
      j = i4;
      if (this.b.d())
        j = -i4; 
      i2 = n + i2 + i3;
      i3 = j;
      j = i2;
    } else {
      i3 = view.getTop() - j - this.c.getPaddingTop();
      j = i1;
    } 
    i3 = -i3;
    a1.c = i3;
    if (i3 < 0) {
      if ((new a(this.d)).d())
        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."); 
      throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[] { Integer.valueOf(a1.c) }));
    } 
    if (j == 0) {
      f = 0.0F;
    } else {
      f = i3 / j;
    } 
    a1.b = f;
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt) {
    int j = this.e;
    boolean bool = true;
    if ((j != 1 || this.f != 1) && paramInt == 1) {
      p(false);
      return;
    } 
    if (k() && paramInt == 2) {
      if (this.k) {
        e(2);
        this.j = true;
      } 
      return;
    } 
    if (k() && paramInt == 0) {
      q();
      if (!this.k) {
        int k = this.g.a;
        j = bool;
        if (k != -1) {
          c(k, 0.0F, 0);
          j = bool;
        } 
      } else {
        a a1 = this.g;
        if (a1.c == 0) {
          int k = this.h;
          int m = a1.a;
          j = bool;
          if (k != m) {
            d(m);
            j = bool;
          } 
        } else {
          j = 0;
        } 
      } 
      if (j != 0) {
        e(0);
        n();
      } 
    } 
    if (this.e == 2 && paramInt == 0 && this.l) {
      q();
      a a1 = this.g;
      if (a1.c == 0) {
        paramInt = this.i;
        j = a1.a;
        if (paramInt != j) {
          paramInt = j;
          if (j == -1)
            paramInt = 0; 
          d(paramInt);
        } 
        e(0);
        n();
      } 
    } 
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield k : Z
    //   5: aload_0
    //   6: invokespecial q : ()V
    //   9: aload_0
    //   10: getfield j : Z
    //   13: ifeq -> 119
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield j : Z
    //   21: iload_3
    //   22: ifgt -> 62
    //   25: iload_3
    //   26: ifne -> 57
    //   29: iload_2
    //   30: ifge -> 39
    //   33: iconst_1
    //   34: istore #4
    //   36: goto -> 42
    //   39: iconst_0
    //   40: istore #4
    //   42: iload #4
    //   44: aload_0
    //   45: getfield b : Landroidx/viewpager2/widget/ViewPager2;
    //   48: invokevirtual d : ()Z
    //   51: if_icmpne -> 57
    //   54: goto -> 62
    //   57: iconst_0
    //   58: istore_2
    //   59: goto -> 64
    //   62: iconst_1
    //   63: istore_2
    //   64: iload_2
    //   65: ifeq -> 90
    //   68: aload_0
    //   69: getfield g : Landroidx/viewpager2/widget/e$a;
    //   72: astore_1
    //   73: aload_1
    //   74: getfield c : I
    //   77: ifeq -> 90
    //   80: aload_1
    //   81: getfield a : I
    //   84: iconst_1
    //   85: iadd
    //   86: istore_2
    //   87: goto -> 98
    //   90: aload_0
    //   91: getfield g : Landroidx/viewpager2/widget/e$a;
    //   94: getfield a : I
    //   97: istore_2
    //   98: aload_0
    //   99: iload_2
    //   100: putfield i : I
    //   103: aload_0
    //   104: getfield h : I
    //   107: iload_2
    //   108: if_icmpeq -> 148
    //   111: aload_0
    //   112: iload_2
    //   113: invokespecial d : (I)V
    //   116: goto -> 148
    //   119: aload_0
    //   120: getfield e : I
    //   123: ifne -> 148
    //   126: aload_0
    //   127: getfield g : Landroidx/viewpager2/widget/e$a;
    //   130: getfield a : I
    //   133: istore_3
    //   134: iload_3
    //   135: istore_2
    //   136: iload_3
    //   137: iconst_m1
    //   138: if_icmpne -> 143
    //   141: iconst_0
    //   142: istore_2
    //   143: aload_0
    //   144: iload_2
    //   145: invokespecial d : (I)V
    //   148: aload_0
    //   149: getfield g : Landroidx/viewpager2/widget/e$a;
    //   152: astore_1
    //   153: aload_1
    //   154: getfield a : I
    //   157: istore_3
    //   158: iload_3
    //   159: istore_2
    //   160: iload_3
    //   161: iconst_m1
    //   162: if_icmpne -> 167
    //   165: iconst_0
    //   166: istore_2
    //   167: aload_0
    //   168: iload_2
    //   169: aload_1
    //   170: getfield b : F
    //   173: aload_1
    //   174: getfield c : I
    //   177: invokespecial c : (IFI)V
    //   180: aload_0
    //   181: getfield g : Landroidx/viewpager2/widget/e$a;
    //   184: astore_1
    //   185: aload_1
    //   186: getfield a : I
    //   189: istore_2
    //   190: aload_0
    //   191: getfield i : I
    //   194: istore_3
    //   195: iload_2
    //   196: iload_3
    //   197: if_icmpeq -> 205
    //   200: iload_3
    //   201: iconst_m1
    //   202: if_icmpne -> 229
    //   205: aload_1
    //   206: getfield c : I
    //   209: ifne -> 229
    //   212: aload_0
    //   213: getfield f : I
    //   216: iconst_1
    //   217: if_icmpeq -> 229
    //   220: aload_0
    //   221: iconst_0
    //   222: invokespecial e : (I)V
    //   225: aload_0
    //   226: invokespecial n : ()V
    //   229: return
  }
  
  double g() {
    q();
    a a1 = this.g;
    double d1 = a1.a;
    double d2 = a1.b;
    Double.isNaN(d1);
    Double.isNaN(d2);
    return d1 + d2;
  }
  
  int h() {
    return this.f;
  }
  
  boolean i() {
    return this.m;
  }
  
  boolean j() {
    boolean bool;
    if (this.f == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void l() {
    this.l = true;
  }
  
  void m(int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      b = 2;
    } else {
      b = 3;
    } 
    this.e = b;
    byte b = 0;
    this.m = false;
    if (this.i != paramInt)
      b = 1; 
    this.i = paramInt;
    e(2);
    if (b != 0)
      d(paramInt); 
  }
  
  void o(ViewPager2.i parami) {
    this.a = parami;
  }
  
  private static final class a {
    int a;
    
    float b;
    
    int c;
    
    void a() {
      this.a = -1;
      this.b = 0.0F;
      this.c = 0;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/viewpager2/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */