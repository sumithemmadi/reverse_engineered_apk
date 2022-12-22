package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import b.a.g;
import b.h.k.b;
import java.util.ArrayList;

class ActionMenuPresenter extends b implements b.a {
  a A;
  
  c B;
  
  private b C;
  
  final f D = new f(this);
  
  int E;
  
  d l;
  
  private Drawable m;
  
  private boolean n;
  
  private boolean o;
  
  private boolean p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private boolean t;
  
  private boolean u;
  
  private boolean v;
  
  private boolean w;
  
  private int x;
  
  private final SparseBooleanArray y = new SparseBooleanArray();
  
  e z;
  
  public ActionMenuPresenter(Context paramContext) {
    super(paramContext, g.abc_action_menu_layout, g.abc_action_menu_item_layout);
  }
  
  private View C(MenuItem paramMenuItem) {
    ViewGroup viewGroup = (ViewGroup)this.j;
    if (viewGroup == null)
      return null; 
    int i = viewGroup.getChildCount();
    for (byte b1 = 0; b1 < i; b1++) {
      View view = viewGroup.getChildAt(b1);
      if (view instanceof n.a && ((n.a)view).getItemData() == paramMenuItem)
        return view; 
    } 
    return null;
  }
  
  public boolean B() {
    return E() | F();
  }
  
  public Drawable D() {
    d d1 = this.l;
    return (d1 != null) ? d1.getDrawable() : (this.n ? this.m : null);
  }
  
  public boolean E() {
    c c1 = this.B;
    if (c1 != null) {
      n n = this.j;
      if (n != null) {
        ((View)n).removeCallbacks(c1);
        this.B = null;
        return true;
      } 
    } 
    e e1 = this.z;
    if (e1 != null) {
      e1.b();
      return true;
    } 
    return false;
  }
  
  public boolean F() {
    a a1 = this.A;
    if (a1 != null) {
      a1.b();
      return true;
    } 
    return false;
  }
  
  public boolean G() {
    return (this.B != null || H());
  }
  
  public boolean H() {
    boolean bool;
    e e1 = this.z;
    if (e1 != null && e1.d()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void I(Configuration paramConfiguration) {
    if (!this.t)
      this.s = b.a.o.a.b(this.c).d(); 
    g g = this.d;
    if (g != null)
      g.M(true); 
  }
  
  public void J(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public void K(ActionMenuView paramActionMenuView) {
    this.j = paramActionMenuView;
    paramActionMenuView.b(this.d);
  }
  
  public void L(Drawable paramDrawable) {
    d d1 = this.l;
    if (d1 != null) {
      d1.setImageDrawable(paramDrawable);
    } else {
      this.n = true;
      this.m = paramDrawable;
    } 
  }
  
  public void M(boolean paramBoolean) {
    this.o = paramBoolean;
    this.p = true;
  }
  
  public boolean N() {
    if (this.o && !H()) {
      g g = this.d;
      if (g != null && this.j != null && this.B == null && !g.B().isEmpty()) {
        c c1 = new c(this, new e(this, this.c, this.d, (View)this.l, true));
        this.B = c1;
        ((View)this.j).post(c1);
        return true;
      } 
    } 
    return false;
  }
  
  public void a(boolean paramBoolean) {
    if (paramBoolean) {
      super.j(null);
    } else {
      g g = this.d;
      if (g != null)
        g.e(false); 
    } 
  }
  
  public void b(g paramg, boolean paramBoolean) {
    B();
    super.b(paramg, paramBoolean);
  }
  
  public void c(boolean paramBoolean) {
    super.c(paramBoolean);
    ((View)this.j).requestLayout();
    g<i> g = this.d;
    byte b1 = 0;
    if (g != null) {
      ArrayList<i> arrayList = g.u();
      int j = arrayList.size();
      for (byte b2 = 0; b2 < j; b2++) {
        b b3 = ((i)arrayList.get(b2)).b();
        if (b3 != null)
          b3.i(this); 
      } 
    } 
    g = this.d;
    if (g != null) {
      ArrayList arrayList = g.B();
    } else {
      g = null;
    } 
    int i = b1;
    if (this.o) {
      i = b1;
      if (g != null) {
        int j = g.size();
        if (j == 1) {
          i = ((i)g.get(0)).isActionViewExpanded() ^ true;
        } else {
          i = b1;
          if (j > 0)
            i = 1; 
        } 
      } 
    } 
    if (i != 0) {
      if (this.l == null)
        this.l = new d(this, this.b); 
      ViewGroup viewGroup = (ViewGroup)this.l.getParent();
      if (viewGroup != this.j) {
        if (viewGroup != null)
          viewGroup.removeView((View)this.l); 
        viewGroup = (ActionMenuView)this.j;
        viewGroup.addView((View)this.l, (ViewGroup.LayoutParams)viewGroup.F());
      } 
    } else {
      d d1 = this.l;
      if (d1 != null) {
        ViewParent viewParent = d1.getParent();
        n n = this.j;
        if (viewParent == n)
          ((ViewGroup)n).removeView((View)this.l); 
      } 
    } 
    ((ActionMenuView)this.j).setOverflowReserved(this.o);
  }
  
  public boolean d() {
    // Byte code:
    //   0: aload_0
    //   1: astore_1
    //   2: aload_1
    //   3: getfield d : Landroidx/appcompat/view/menu/g;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull -> 24
    //   11: aload_2
    //   12: invokevirtual G : ()Ljava/util/ArrayList;
    //   15: astore_2
    //   16: aload_2
    //   17: invokevirtual size : ()I
    //   20: istore_3
    //   21: goto -> 28
    //   24: aconst_null
    //   25: astore_2
    //   26: iconst_0
    //   27: istore_3
    //   28: aload_1
    //   29: getfield s : I
    //   32: istore #4
    //   34: aload_1
    //   35: getfield r : I
    //   38: istore #5
    //   40: iconst_0
    //   41: iconst_0
    //   42: invokestatic makeMeasureSpec : (II)I
    //   45: istore #6
    //   47: aload_1
    //   48: getfield j : Landroidx/appcompat/view/menu/n;
    //   51: checkcast android/view/ViewGroup
    //   54: astore #7
    //   56: iconst_0
    //   57: istore #8
    //   59: iconst_0
    //   60: istore #9
    //   62: iconst_0
    //   63: istore #10
    //   65: iconst_0
    //   66: istore #11
    //   68: iload #8
    //   70: iload_3
    //   71: if_icmpge -> 152
    //   74: aload_2
    //   75: iload #8
    //   77: invokevirtual get : (I)Ljava/lang/Object;
    //   80: checkcast androidx/appcompat/view/menu/i
    //   83: astore #12
    //   85: aload #12
    //   87: invokevirtual o : ()Z
    //   90: ifeq -> 99
    //   93: iinc #10, 1
    //   96: goto -> 116
    //   99: aload #12
    //   101: invokevirtual n : ()Z
    //   104: ifeq -> 113
    //   107: iinc #11, 1
    //   110: goto -> 116
    //   113: iconst_1
    //   114: istore #9
    //   116: iload #4
    //   118: istore #13
    //   120: aload_1
    //   121: getfield w : Z
    //   124: ifeq -> 142
    //   127: iload #4
    //   129: istore #13
    //   131: aload #12
    //   133: invokevirtual isActionViewExpanded : ()Z
    //   136: ifeq -> 142
    //   139: iconst_0
    //   140: istore #13
    //   142: iinc #8, 1
    //   145: iload #13
    //   147: istore #4
    //   149: goto -> 68
    //   152: iload #4
    //   154: istore #8
    //   156: aload_1
    //   157: getfield o : Z
    //   160: ifeq -> 188
    //   163: iload #9
    //   165: ifne -> 182
    //   168: iload #4
    //   170: istore #8
    //   172: iload #11
    //   174: iload #10
    //   176: iadd
    //   177: iload #4
    //   179: if_icmple -> 188
    //   182: iload #4
    //   184: iconst_1
    //   185: isub
    //   186: istore #8
    //   188: iload #8
    //   190: iload #10
    //   192: isub
    //   193: istore #4
    //   195: aload_1
    //   196: getfield y : Landroid/util/SparseBooleanArray;
    //   199: astore #12
    //   201: aload #12
    //   203: invokevirtual clear : ()V
    //   206: aload_1
    //   207: getfield u : Z
    //   210: ifeq -> 242
    //   213: aload_1
    //   214: getfield x : I
    //   217: istore #11
    //   219: iload #5
    //   221: iload #11
    //   223: idiv
    //   224: istore #8
    //   226: iload #11
    //   228: iload #5
    //   230: iload #11
    //   232: irem
    //   233: iload #8
    //   235: idiv
    //   236: iadd
    //   237: istore #14
    //   239: goto -> 248
    //   242: iconst_0
    //   243: istore #14
    //   245: iconst_0
    //   246: istore #8
    //   248: iconst_0
    //   249: istore #15
    //   251: iconst_0
    //   252: istore #11
    //   254: iload #5
    //   256: istore #9
    //   258: iload_3
    //   259: istore #5
    //   261: aload_0
    //   262: astore_1
    //   263: iload #15
    //   265: iload #5
    //   267: if_icmpge -> 764
    //   270: aload_2
    //   271: iload #15
    //   273: invokevirtual get : (I)Ljava/lang/Object;
    //   276: checkcast androidx/appcompat/view/menu/i
    //   279: astore #16
    //   281: aload #16
    //   283: invokevirtual o : ()Z
    //   286: ifeq -> 397
    //   289: aload_1
    //   290: aload #16
    //   292: aconst_null
    //   293: aload #7
    //   295: invokevirtual q : (Landroidx/appcompat/view/menu/i;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   298: astore #17
    //   300: aload_1
    //   301: getfield u : Z
    //   304: ifeq -> 327
    //   307: iload #8
    //   309: aload #17
    //   311: iload #14
    //   313: iload #8
    //   315: iload #6
    //   317: iconst_0
    //   318: invokestatic L : (Landroid/view/View;IIII)I
    //   321: isub
    //   322: istore #8
    //   324: goto -> 336
    //   327: aload #17
    //   329: iload #6
    //   331: iload #6
    //   333: invokevirtual measure : (II)V
    //   336: aload #17
    //   338: invokevirtual getMeasuredWidth : ()I
    //   341: istore #10
    //   343: iload #9
    //   345: iload #10
    //   347: isub
    //   348: istore #13
    //   350: iload #11
    //   352: istore_3
    //   353: iload #11
    //   355: ifne -> 361
    //   358: iload #10
    //   360: istore_3
    //   361: aload #16
    //   363: invokevirtual getGroupId : ()I
    //   366: istore #11
    //   368: iload #11
    //   370: ifeq -> 381
    //   373: aload #12
    //   375: iload #11
    //   377: iconst_1
    //   378: invokevirtual put : (IZ)V
    //   381: aload #16
    //   383: iconst_1
    //   384: invokevirtual u : (Z)V
    //   387: iload #13
    //   389: istore #9
    //   391: iload_3
    //   392: istore #11
    //   394: goto -> 758
    //   397: aload #16
    //   399: invokevirtual n : ()Z
    //   402: ifeq -> 752
    //   405: aload #16
    //   407: invokevirtual getGroupId : ()I
    //   410: istore #18
    //   412: aload #12
    //   414: iload #18
    //   416: invokevirtual get : (I)Z
    //   419: istore #19
    //   421: iload #4
    //   423: ifgt -> 431
    //   426: iload #19
    //   428: ifeq -> 454
    //   431: iload #9
    //   433: ifle -> 454
    //   436: aload_1
    //   437: getfield u : Z
    //   440: ifeq -> 448
    //   443: iload #8
    //   445: ifle -> 454
    //   448: iconst_1
    //   449: istore #20
    //   451: goto -> 457
    //   454: iconst_0
    //   455: istore #20
    //   457: iload #20
    //   459: istore #21
    //   461: iload #20
    //   463: istore #22
    //   465: iload #9
    //   467: istore #13
    //   469: iload #8
    //   471: istore #10
    //   473: iload #11
    //   475: istore_3
    //   476: iload #20
    //   478: ifeq -> 612
    //   481: aload_1
    //   482: aload #16
    //   484: aconst_null
    //   485: aload #7
    //   487: invokevirtual q : (Landroidx/appcompat/view/menu/i;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    //   490: astore #17
    //   492: aload_1
    //   493: getfield u : Z
    //   496: ifeq -> 536
    //   499: aload #17
    //   501: iload #14
    //   503: iload #8
    //   505: iload #6
    //   507: iconst_0
    //   508: invokestatic L : (Landroid/view/View;IIII)I
    //   511: istore #10
    //   513: iload #8
    //   515: iload #10
    //   517: isub
    //   518: istore_3
    //   519: iload_3
    //   520: istore #8
    //   522: iload #10
    //   524: ifne -> 545
    //   527: iconst_0
    //   528: istore #21
    //   530: iload_3
    //   531: istore #8
    //   533: goto -> 545
    //   536: aload #17
    //   538: iload #6
    //   540: iload #6
    //   542: invokevirtual measure : (II)V
    //   545: aload #17
    //   547: invokevirtual getMeasuredWidth : ()I
    //   550: istore #10
    //   552: iload #9
    //   554: iload #10
    //   556: isub
    //   557: istore #13
    //   559: iload #11
    //   561: istore_3
    //   562: iload #11
    //   564: ifne -> 570
    //   567: iload #10
    //   569: istore_3
    //   570: aload_1
    //   571: getfield u : Z
    //   574: ifeq -> 585
    //   577: iload #13
    //   579: iflt -> 598
    //   582: goto -> 592
    //   585: iload #13
    //   587: iload_3
    //   588: iadd
    //   589: ifle -> 598
    //   592: iconst_1
    //   593: istore #11
    //   595: goto -> 601
    //   598: iconst_0
    //   599: istore #11
    //   601: iload #21
    //   603: iload #11
    //   605: iand
    //   606: istore #22
    //   608: iload #8
    //   610: istore #10
    //   612: iload #22
    //   614: ifeq -> 637
    //   617: iload #18
    //   619: ifeq -> 637
    //   622: aload #12
    //   624: iload #18
    //   626: iconst_1
    //   627: invokevirtual put : (IZ)V
    //   630: iload #4
    //   632: istore #11
    //   634: goto -> 723
    //   637: iload #4
    //   639: istore #11
    //   641: iload #19
    //   643: ifeq -> 723
    //   646: aload #12
    //   648: iload #18
    //   650: iconst_0
    //   651: invokevirtual put : (IZ)V
    //   654: iconst_0
    //   655: istore #8
    //   657: iload #4
    //   659: istore #11
    //   661: iload #8
    //   663: iload #15
    //   665: if_icmpge -> 723
    //   668: aload_2
    //   669: iload #8
    //   671: invokevirtual get : (I)Ljava/lang/Object;
    //   674: checkcast androidx/appcompat/view/menu/i
    //   677: astore_1
    //   678: iload #4
    //   680: istore #11
    //   682: aload_1
    //   683: invokevirtual getGroupId : ()I
    //   686: iload #18
    //   688: if_icmpne -> 713
    //   691: iload #4
    //   693: istore #11
    //   695: aload_1
    //   696: invokevirtual l : ()Z
    //   699: ifeq -> 708
    //   702: iload #4
    //   704: iconst_1
    //   705: iadd
    //   706: istore #11
    //   708: aload_1
    //   709: iconst_0
    //   710: invokevirtual u : (Z)V
    //   713: iinc #8, 1
    //   716: iload #11
    //   718: istore #4
    //   720: goto -> 657
    //   723: iload #11
    //   725: istore #4
    //   727: iload #22
    //   729: ifeq -> 738
    //   732: iload #11
    //   734: iconst_1
    //   735: isub
    //   736: istore #4
    //   738: aload #16
    //   740: iload #22
    //   742: invokevirtual u : (Z)V
    //   745: iload #10
    //   747: istore #8
    //   749: goto -> 387
    //   752: aload #16
    //   754: iconst_0
    //   755: invokevirtual u : (Z)V
    //   758: iinc #15, 1
    //   761: goto -> 261
    //   764: iconst_1
    //   765: ireturn
  }
  
  public void h(Context paramContext, g paramg) {
    super.h(paramContext, paramg);
    Resources resources = paramContext.getResources();
    b.a.o.a a1 = b.a.o.a.b(paramContext);
    if (!this.p)
      this.o = a1.h(); 
    if (!this.v)
      this.q = a1.c(); 
    if (!this.t)
      this.s = a1.d(); 
    int i = this.q;
    if (this.o) {
      if (this.l == null) {
        d d1 = new d(this, this.b);
        this.l = d1;
        if (this.n) {
          d1.setImageDrawable(this.m);
          this.m = null;
          this.n = false;
        } 
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.l.measure(j, j);
      } 
      i -= this.l.getMeasuredWidth();
    } else {
      this.l = null;
    } 
    this.r = i;
    this.x = (int)((resources.getDisplayMetrics()).density * 56.0F);
  }
  
  public void i(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState))
      return; 
    int i = ((SavedState)paramParcelable).b;
    if (i > 0) {
      MenuItem menuItem = this.d.findItem(i);
      if (menuItem != null)
        j((r)menuItem.getSubMenu()); 
    } 
  }
  
  public boolean j(r paramr) {
    boolean bool = paramr.hasVisibleItems();
    boolean bool1 = false;
    if (!bool)
      return false; 
    r r1;
    for (r1 = paramr; r1.i0() != this.d; r1 = (r)r1.i0());
    View view = C(r1.getItem());
    if (view == null)
      return false; 
    this.E = paramr.getItem().getItemId();
    int i = paramr.size();
    byte b1 = 0;
    while (true) {
      bool = bool1;
      if (b1 < i) {
        MenuItem menuItem = paramr.getItem(b1);
        if (menuItem.isVisible() && menuItem.getIcon() != null) {
          bool = true;
          break;
        } 
        b1++;
        continue;
      } 
      break;
    } 
    a a1 = new a(this, this.c, paramr, view);
    this.A = a1;
    a1.g(bool);
    this.A.k();
    super.j(paramr);
    return true;
  }
  
  public Parcelable k() {
    SavedState savedState = new SavedState();
    savedState.b = this.E;
    return savedState;
  }
  
  public void m(i parami, n.a parama) {
    parama.e(parami, 0);
    ActionMenuView actionMenuView = (ActionMenuView)this.j;
    ActionMenuItemView actionMenuItemView = (ActionMenuItemView)parama;
    actionMenuItemView.setItemInvoker(actionMenuView);
    if (this.C == null)
      this.C = new b(this); 
    actionMenuItemView.setPopupCallback(this.C);
  }
  
  public boolean o(ViewGroup paramViewGroup, int paramInt) {
    return (paramViewGroup.getChildAt(paramInt) == this.l) ? false : super.o(paramViewGroup, paramInt);
  }
  
  public View q(i parami, View paramView, ViewGroup paramViewGroup) {
    boolean bool;
    View view = parami.getActionView();
    if (view == null || parami.j())
      view = super.q(parami, paramView, paramViewGroup); 
    if (parami.isActionViewExpanded()) {
      bool = true;
    } else {
      bool = false;
    } 
    view.setVisibility(bool);
    ActionMenuView actionMenuView = (ActionMenuView)paramViewGroup;
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    if (!actionMenuView.checkLayoutParams(layoutParams))
      view.setLayoutParams((ViewGroup.LayoutParams)actionMenuView.E(layoutParams)); 
    return view;
  }
  
  public n r(ViewGroup paramViewGroup) {
    n n2 = this.j;
    n n1 = super.r(paramViewGroup);
    if (n2 != n1)
      ((ActionMenuView)n1).setPresenter(this); 
    return n1;
  }
  
  public boolean t(int paramInt, i parami) {
    return parami.l();
  }
  
  @SuppressLint({"BanParcelableUsage"})
  private static class SavedState implements Parcelable {
    public static final Parcelable.Creator<SavedState> CREATOR = new a();
    
    public int b;
    
    SavedState() {}
    
    SavedState(Parcel param1Parcel) {
      this.b = param1Parcel.readInt();
    }
    
    public int describeContents() {
      return 0;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeInt(this.b);
    }
    
    class a implements Parcelable.Creator<SavedState> {
      public ActionMenuPresenter.SavedState a(Parcel param2Parcel) {
        return new ActionMenuPresenter.SavedState(param2Parcel);
      }
      
      public ActionMenuPresenter.SavedState[] b(int param2Int) {
        return new ActionMenuPresenter.SavedState[param2Int];
      }
    }
  }
  
  class a implements Parcelable.Creator<SavedState> {
    public ActionMenuPresenter.SavedState a(Parcel param1Parcel) {
      return new ActionMenuPresenter.SavedState(param1Parcel);
    }
    
    public ActionMenuPresenter.SavedState[] b(int param1Int) {
      return new ActionMenuPresenter.SavedState[param1Int];
    }
  }
  
  private class a extends l {
    public a(ActionMenuPresenter this$0, Context param1Context, r param1r, View param1View) {
      super(param1Context, (g)param1r, param1View, false, b.a.a.actionOverflowMenuStyle);
      if (!((i)param1r.getItem()).l()) {
        View view;
        ActionMenuPresenter.d d2 = this$0.l;
        ActionMenuPresenter.d d1 = d2;
        if (d2 == null)
          view = (View)ActionMenuPresenter.w(this$0); 
        f(view);
      } 
      j(this$0.D);
    }
    
    protected void e() {
      ActionMenuPresenter actionMenuPresenter = this.m;
      actionMenuPresenter.A = null;
      actionMenuPresenter.E = 0;
      super.e();
    }
  }
  
  private class b extends ActionMenuItemView.b {
    b(ActionMenuPresenter this$0) {}
    
    public p a() {
      ActionMenuPresenter.a a = this.a.A;
      if (a != null) {
        k k = a.c();
      } else {
        a = null;
      } 
      return (p)a;
    }
  }
  
  private class c implements Runnable {
    private ActionMenuPresenter.e b;
    
    public c(ActionMenuPresenter this$0, ActionMenuPresenter.e param1e) {
      this.b = param1e;
    }
    
    public void run() {
      if (ActionMenuPresenter.y(this.c) != null)
        ActionMenuPresenter.z(this.c).d(); 
      View view = (View)ActionMenuPresenter.A(this.c);
      if (view != null && view.getWindowToken() != null && this.b.m())
        this.c.z = this.b; 
      this.c.B = null;
    }
  }
  
  private class d extends AppCompatImageView implements ActionMenuView.a {
    public d(ActionMenuPresenter this$0, Context param1Context) {
      super(param1Context, null, b.a.a.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      g0.a((View)this, getContentDescription());
      setOnTouchListener(new a(this, (View)this, this$0));
    }
    
    public boolean a() {
      return false;
    }
    
    public boolean b() {
      return false;
    }
    
    public boolean performClick() {
      if (super.performClick())
        return true; 
      playSoundEffect(0);
      this.d.N();
      return true;
    }
    
    protected boolean setFrame(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      boolean bool = super.setFrame(param1Int1, param1Int2, param1Int3, param1Int4);
      Drawable drawable1 = getDrawable();
      Drawable drawable2 = getBackground();
      if (drawable1 != null && drawable2 != null) {
        int i = getWidth();
        param1Int4 = getHeight();
        param1Int1 = Math.max(i, param1Int4) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        param1Int3 = getPaddingTop();
        param1Int2 = getPaddingBottom();
        k = (i + j - k) / 2;
        param1Int2 = (param1Int4 + param1Int3 - param1Int2) / 2;
        androidx.core.graphics.drawable.a.l(drawable2, k - param1Int1, param1Int2 - param1Int1, k + param1Int1, param1Int2 + param1Int1);
      } 
      return bool;
    }
    
    class a extends t {
      a(ActionMenuPresenter.d this$0, View param2View, ActionMenuPresenter param2ActionMenuPresenter) {
        super(param2View);
      }
      
      public p b() {
        ActionMenuPresenter.e e = this.l.d.z;
        return (p)((e == null) ? null : e.c());
      }
      
      public boolean c() {
        this.l.d.N();
        return true;
      }
      
      public boolean d() {
        ActionMenuPresenter actionMenuPresenter = this.l.d;
        if (actionMenuPresenter.B != null)
          return false; 
        actionMenuPresenter.E();
        return true;
      }
    }
  }
  
  class a extends t {
    a(ActionMenuPresenter this$0, View param1View, ActionMenuPresenter param1ActionMenuPresenter) {
      super(param1View);
    }
    
    public p b() {
      ActionMenuPresenter.e e = this.l.d.z;
      return (p)((e == null) ? null : e.c());
    }
    
    public boolean c() {
      this.l.d.N();
      return true;
    }
    
    public boolean d() {
      ActionMenuPresenter actionMenuPresenter = this.l.d;
      if (actionMenuPresenter.B != null)
        return false; 
      actionMenuPresenter.E();
      return true;
    }
  }
  
  private class e extends l {
    public e(ActionMenuPresenter this$0, Context param1Context, g param1g, View param1View, boolean param1Boolean) {
      super(param1Context, param1g, param1View, param1Boolean, b.a.a.actionOverflowMenuStyle);
      h(8388613);
      j(this$0.D);
    }
    
    protected void e() {
      if (ActionMenuPresenter.u(this.m) != null)
        ActionMenuPresenter.v(this.m).close(); 
      this.m.z = null;
      super.e();
    }
  }
  
  private class f implements m.a {
    f(ActionMenuPresenter this$0) {}
    
    public void b(g param1g, boolean param1Boolean) {
      if (param1g instanceof r)
        param1g.F().e(false); 
      m.a a1 = this.b.p();
      if (a1 != null)
        a1.b(param1g, param1Boolean); 
    }
    
    public boolean c(g param1g) {
      g g1 = ActionMenuPresenter.x(this.b);
      boolean bool = false;
      if (param1g == g1)
        return false; 
      this.b.E = ((r)param1g).getItem().getItemId();
      m.a a1 = this.b.p();
      if (a1 != null)
        bool = a1.c(param1g); 
      return bool;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/ActionMenuPresenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */