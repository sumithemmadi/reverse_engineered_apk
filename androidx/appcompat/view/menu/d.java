package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.u;
import b.a.g;
import b.h.k.e;
import b.h.k.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
  private static final int c = g.abc_cascading_menu_item_layout;
  
  ViewTreeObserver A;
  
  private PopupWindow.OnDismissListener B;
  
  boolean C;
  
  private final Context d;
  
  private final int e;
  
  private final int f;
  
  private final int g;
  
  private final boolean h;
  
  final Handler i;
  
  private final List<g> j = new ArrayList<g>();
  
  final List<d> k = new ArrayList<d>();
  
  final ViewTreeObserver.OnGlobalLayoutListener l = new a(this);
  
  private final View.OnAttachStateChangeListener m = new b(this);
  
  private final u n = new c(this);
  
  private int o = 0;
  
  private int p = 0;
  
  private View q;
  
  View r;
  
  private int s;
  
  private boolean t;
  
  private boolean u;
  
  private int v;
  
  private int w;
  
  private boolean x;
  
  private boolean y;
  
  private m.a z;
  
  public d(Context paramContext, View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    this.d = paramContext;
    this.q = paramView;
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramBoolean;
    this.x = false;
    this.s = D();
    Resources resources = paramContext.getResources();
    this.e = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(b.a.d.abc_config_prefDialogWidth));
    this.i = new Handler();
  }
  
  private int A(g paramg) {
    int i = this.k.size();
    for (byte b = 0; b < i; b++) {
      if (paramg == ((d)this.k.get(b)).b)
        return b; 
    } 
    return -1;
  }
  
  private MenuItem B(g paramg1, g paramg2) {
    int i = paramg1.size();
    for (byte b = 0; b < i; b++) {
      MenuItem menuItem = paramg1.getItem(b);
      if (menuItem.hasSubMenu() && paramg2 == menuItem.getSubMenu())
        return menuItem; 
    } 
    return null;
  }
  
  private View C(d paramd, g paramg) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getfield b : Landroidx/appcompat/view/menu/g;
    //   5: aload_2
    //   6: invokespecial B : (Landroidx/appcompat/view/menu/g;Landroidx/appcompat/view/menu/g;)Landroid/view/MenuItem;
    //   9: astore_2
    //   10: aload_2
    //   11: ifnonnull -> 16
    //   14: aconst_null
    //   15: areturn
    //   16: aload_1
    //   17: invokevirtual a : ()Landroid/widget/ListView;
    //   20: astore_3
    //   21: aload_3
    //   22: invokevirtual getAdapter : ()Landroid/widget/ListAdapter;
    //   25: astore_1
    //   26: aload_1
    //   27: instanceof android/widget/HeaderViewListAdapter
    //   30: istore #4
    //   32: iconst_0
    //   33: istore #5
    //   35: iload #4
    //   37: ifeq -> 62
    //   40: aload_1
    //   41: checkcast android/widget/HeaderViewListAdapter
    //   44: astore_1
    //   45: aload_1
    //   46: invokevirtual getHeadersCount : ()I
    //   49: istore #6
    //   51: aload_1
    //   52: invokevirtual getWrappedAdapter : ()Landroid/widget/ListAdapter;
    //   55: checkcast androidx/appcompat/view/menu/f
    //   58: astore_1
    //   59: goto -> 70
    //   62: aload_1
    //   63: checkcast androidx/appcompat/view/menu/f
    //   66: astore_1
    //   67: iconst_0
    //   68: istore #6
    //   70: aload_1
    //   71: invokevirtual getCount : ()I
    //   74: istore #7
    //   76: iload #5
    //   78: iload #7
    //   80: if_icmpge -> 102
    //   83: aload_2
    //   84: aload_1
    //   85: iload #5
    //   87: invokevirtual c : (I)Landroidx/appcompat/view/menu/i;
    //   90: if_acmpne -> 96
    //   93: goto -> 105
    //   96: iinc #5, 1
    //   99: goto -> 76
    //   102: iconst_m1
    //   103: istore #5
    //   105: iload #5
    //   107: iconst_m1
    //   108: if_icmpne -> 113
    //   111: aconst_null
    //   112: areturn
    //   113: iload #5
    //   115: iload #6
    //   117: iadd
    //   118: aload_3
    //   119: invokevirtual getFirstVisiblePosition : ()I
    //   122: isub
    //   123: istore #5
    //   125: iload #5
    //   127: iflt -> 149
    //   130: iload #5
    //   132: aload_3
    //   133: invokevirtual getChildCount : ()I
    //   136: if_icmplt -> 142
    //   139: goto -> 149
    //   142: aload_3
    //   143: iload #5
    //   145: invokevirtual getChildAt : (I)Landroid/view/View;
    //   148: areturn
    //   149: aconst_null
    //   150: areturn
  }
  
  private int D() {
    int i = w.C(this.q);
    boolean bool = true;
    if (i == 1)
      bool = false; 
    return bool;
  }
  
  private int E(int paramInt) {
    List<d> list = this.k;
    ListView listView = ((d)list.get(list.size() - 1)).a();
    int[] arrayOfInt = new int[2];
    listView.getLocationOnScreen(arrayOfInt);
    Rect rect = new Rect();
    this.r.getWindowVisibleDisplayFrame(rect);
    return (this.s == 1) ? ((arrayOfInt[0] + listView.getWidth() + paramInt > rect.right) ? 0 : 1) : ((arrayOfInt[0] - paramInt < 0) ? 1 : 0);
  }
  
  private void F(g paramg) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Landroid/content/Context;
    //   4: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   7: astore_2
    //   8: new androidx/appcompat/view/menu/f
    //   11: dup
    //   12: aload_1
    //   13: aload_2
    //   14: aload_0
    //   15: getfield h : Z
    //   18: getstatic androidx/appcompat/view/menu/d.c : I
    //   21: invokespecial <init> : (Landroidx/appcompat/view/menu/g;Landroid/view/LayoutInflater;ZI)V
    //   24: astore_3
    //   25: aload_0
    //   26: invokevirtual a : ()Z
    //   29: ifne -> 47
    //   32: aload_0
    //   33: getfield x : Z
    //   36: ifeq -> 47
    //   39: aload_3
    //   40: iconst_1
    //   41: invokevirtual d : (Z)V
    //   44: goto -> 62
    //   47: aload_0
    //   48: invokevirtual a : ()Z
    //   51: ifeq -> 62
    //   54: aload_3
    //   55: aload_1
    //   56: invokestatic x : (Landroidx/appcompat/view/menu/g;)Z
    //   59: invokevirtual d : (Z)V
    //   62: aload_3
    //   63: aconst_null
    //   64: aload_0
    //   65: getfield d : Landroid/content/Context;
    //   68: aload_0
    //   69: getfield e : I
    //   72: invokestatic o : (Landroid/widget/ListAdapter;Landroid/view/ViewGroup;Landroid/content/Context;I)I
    //   75: istore #4
    //   77: aload_0
    //   78: invokespecial z : ()Landroidx/appcompat/widget/MenuPopupWindow;
    //   81: astore #5
    //   83: aload #5
    //   85: aload_3
    //   86: invokevirtual n : (Landroid/widget/ListAdapter;)V
    //   89: aload #5
    //   91: iload #4
    //   93: invokevirtual D : (I)V
    //   96: aload #5
    //   98: aload_0
    //   99: getfield p : I
    //   102: invokevirtual E : (I)V
    //   105: aload_0
    //   106: getfield k : Ljava/util/List;
    //   109: invokeinterface size : ()I
    //   114: ifle -> 151
    //   117: aload_0
    //   118: getfield k : Ljava/util/List;
    //   121: astore_3
    //   122: aload_3
    //   123: aload_3
    //   124: invokeinterface size : ()I
    //   129: iconst_1
    //   130: isub
    //   131: invokeinterface get : (I)Ljava/lang/Object;
    //   136: checkcast androidx/appcompat/view/menu/d$d
    //   139: astore_3
    //   140: aload_0
    //   141: aload_3
    //   142: aload_1
    //   143: invokespecial C : (Landroidx/appcompat/view/menu/d$d;Landroidx/appcompat/view/menu/g;)Landroid/view/View;
    //   146: astore #6
    //   148: goto -> 156
    //   151: aconst_null
    //   152: astore_3
    //   153: aload_3
    //   154: astore #6
    //   156: aload #6
    //   158: ifnull -> 395
    //   161: aload #5
    //   163: iconst_0
    //   164: invokevirtual S : (Z)V
    //   167: aload #5
    //   169: aconst_null
    //   170: invokevirtual P : (Ljava/lang/Object;)V
    //   173: aload_0
    //   174: iload #4
    //   176: invokespecial E : (I)I
    //   179: istore #7
    //   181: iload #7
    //   183: iconst_1
    //   184: if_icmpne -> 193
    //   187: iconst_1
    //   188: istore #8
    //   190: goto -> 196
    //   193: iconst_0
    //   194: istore #8
    //   196: aload_0
    //   197: iload #7
    //   199: putfield s : I
    //   202: getstatic android/os/Build$VERSION.SDK_INT : I
    //   205: bipush #26
    //   207: if_icmplt -> 226
    //   210: aload #5
    //   212: aload #6
    //   214: invokevirtual B : (Landroid/view/View;)V
    //   217: iconst_0
    //   218: istore #7
    //   220: iconst_0
    //   221: istore #9
    //   223: goto -> 315
    //   226: iconst_2
    //   227: newarray int
    //   229: astore #10
    //   231: aload_0
    //   232: getfield q : Landroid/view/View;
    //   235: aload #10
    //   237: invokevirtual getLocationOnScreen : ([I)V
    //   240: iconst_2
    //   241: newarray int
    //   243: astore #11
    //   245: aload #6
    //   247: aload #11
    //   249: invokevirtual getLocationOnScreen : ([I)V
    //   252: aload_0
    //   253: getfield p : I
    //   256: bipush #7
    //   258: iand
    //   259: iconst_5
    //   260: if_icmpne -> 293
    //   263: aload #10
    //   265: iconst_0
    //   266: aload #10
    //   268: iconst_0
    //   269: iaload
    //   270: aload_0
    //   271: getfield q : Landroid/view/View;
    //   274: invokevirtual getWidth : ()I
    //   277: iadd
    //   278: iastore
    //   279: aload #11
    //   281: iconst_0
    //   282: aload #11
    //   284: iconst_0
    //   285: iaload
    //   286: aload #6
    //   288: invokevirtual getWidth : ()I
    //   291: iadd
    //   292: iastore
    //   293: aload #11
    //   295: iconst_0
    //   296: iaload
    //   297: aload #10
    //   299: iconst_0
    //   300: iaload
    //   301: isub
    //   302: istore #9
    //   304: aload #11
    //   306: iconst_1
    //   307: iaload
    //   308: aload #10
    //   310: iconst_1
    //   311: iaload
    //   312: isub
    //   313: istore #7
    //   315: aload_0
    //   316: getfield p : I
    //   319: iconst_5
    //   320: iand
    //   321: iconst_5
    //   322: if_icmpne -> 343
    //   325: iload #8
    //   327: ifeq -> 333
    //   330: goto -> 355
    //   333: aload #6
    //   335: invokevirtual getWidth : ()I
    //   338: istore #4
    //   340: goto -> 365
    //   343: iload #8
    //   345: ifeq -> 365
    //   348: aload #6
    //   350: invokevirtual getWidth : ()I
    //   353: istore #4
    //   355: iload #9
    //   357: iload #4
    //   359: iadd
    //   360: istore #4
    //   362: goto -> 372
    //   365: iload #9
    //   367: iload #4
    //   369: isub
    //   370: istore #4
    //   372: aload #5
    //   374: iload #4
    //   376: invokevirtual e : (I)V
    //   379: aload #5
    //   381: iconst_1
    //   382: invokevirtual K : (Z)V
    //   385: aload #5
    //   387: iload #7
    //   389: invokevirtual j : (I)V
    //   392: goto -> 436
    //   395: aload_0
    //   396: getfield t : Z
    //   399: ifeq -> 411
    //   402: aload #5
    //   404: aload_0
    //   405: getfield v : I
    //   408: invokevirtual e : (I)V
    //   411: aload_0
    //   412: getfield u : Z
    //   415: ifeq -> 427
    //   418: aload #5
    //   420: aload_0
    //   421: getfield w : I
    //   424: invokevirtual j : (I)V
    //   427: aload #5
    //   429: aload_0
    //   430: invokevirtual n : ()Landroid/graphics/Rect;
    //   433: invokevirtual F : (Landroid/graphics/Rect;)V
    //   436: new androidx/appcompat/view/menu/d$d
    //   439: dup
    //   440: aload #5
    //   442: aload_1
    //   443: aload_0
    //   444: getfield s : I
    //   447: invokespecial <init> : (Landroidx/appcompat/widget/MenuPopupWindow;Landroidx/appcompat/view/menu/g;I)V
    //   450: astore #6
    //   452: aload_0
    //   453: getfield k : Ljava/util/List;
    //   456: aload #6
    //   458: invokeinterface add : (Ljava/lang/Object;)Z
    //   463: pop
    //   464: aload #5
    //   466: invokevirtual T0 : ()V
    //   469: aload #5
    //   471: invokevirtual U0 : ()Landroid/widget/ListView;
    //   474: astore #6
    //   476: aload #6
    //   478: aload_0
    //   479: invokevirtual setOnKeyListener : (Landroid/view/View$OnKeyListener;)V
    //   482: aload_3
    //   483: ifnonnull -> 551
    //   486: aload_0
    //   487: getfield y : Z
    //   490: ifeq -> 551
    //   493: aload_1
    //   494: invokevirtual z : ()Ljava/lang/CharSequence;
    //   497: ifnull -> 551
    //   500: aload_2
    //   501: getstatic b/a/g.abc_popup_menu_header_item_layout : I
    //   504: aload #6
    //   506: iconst_0
    //   507: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   510: checkcast android/widget/FrameLayout
    //   513: astore_2
    //   514: aload_2
    //   515: ldc_w 16908310
    //   518: invokevirtual findViewById : (I)Landroid/view/View;
    //   521: checkcast android/widget/TextView
    //   524: astore_3
    //   525: aload_2
    //   526: iconst_0
    //   527: invokevirtual setEnabled : (Z)V
    //   530: aload_3
    //   531: aload_1
    //   532: invokevirtual z : ()Ljava/lang/CharSequence;
    //   535: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   538: aload #6
    //   540: aload_2
    //   541: aconst_null
    //   542: iconst_0
    //   543: invokevirtual addHeaderView : (Landroid/view/View;Ljava/lang/Object;Z)V
    //   546: aload #5
    //   548: invokevirtual T0 : ()V
    //   551: return
  }
  
  private MenuPopupWindow z() {
    MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.d, null, this.f, this.g);
    menuPopupWindow.R(this.n);
    menuPopupWindow.J(this);
    menuPopupWindow.I(this);
    menuPopupWindow.B(this.q);
    menuPopupWindow.E(this.p);
    menuPopupWindow.H(true);
    menuPopupWindow.G(2);
    return menuPopupWindow;
  }
  
  public void T0() {
    if (a())
      return; 
    Iterator<g> iterator = this.j.iterator();
    while (iterator.hasNext())
      F(iterator.next()); 
    this.j.clear();
    View view = this.q;
    this.r = view;
    if (view != null) {
      boolean bool;
      if (this.A == null) {
        bool = true;
      } else {
        bool = false;
      } 
      ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
      this.A = viewTreeObserver;
      if (bool)
        viewTreeObserver.addOnGlobalLayoutListener(this.l); 
      this.r.addOnAttachStateChangeListener(this.m);
    } 
  }
  
  public ListView U0() {
    ListView listView;
    if (this.k.isEmpty()) {
      listView = null;
    } else {
      List<d> list = this.k;
      listView = ((d)list.get(list.size() - 1)).a();
    } 
    return listView;
  }
  
  public boolean a() {
    int i = this.k.size();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0) {
      bool2 = bool1;
      if (((d)this.k.get(0)).a.a())
        bool2 = true; 
    } 
    return bool2;
  }
  
  public void b(g paramg, boolean paramBoolean) {
    int i = A(paramg);
    if (i < 0)
      return; 
    int j = i + 1;
    if (j < this.k.size())
      ((d)this.k.get(j)).b.e(false); 
    d d1 = this.k.remove(i);
    d1.b.Q(this);
    if (this.C) {
      d1.a.Q(null);
      d1.a.C(0);
    } 
    d1.a.dismiss();
    i = this.k.size();
    if (i > 0) {
      this.s = ((d)this.k.get(i - 1)).c;
    } else {
      this.s = D();
    } 
    if (i == 0) {
      dismiss();
      m.a a1 = this.z;
      if (a1 != null)
        a1.b(paramg, true); 
      ViewTreeObserver viewTreeObserver = this.A;
      if (viewTreeObserver != null) {
        if (viewTreeObserver.isAlive())
          this.A.removeGlobalOnLayoutListener(this.l); 
        this.A = null;
      } 
      this.r.removeOnAttachStateChangeListener(this.m);
      this.B.onDismiss();
    } else if (paramBoolean) {
      ((d)this.k.get(0)).b.e(false);
    } 
  }
  
  public void c(boolean paramBoolean) {
    Iterator<d> iterator = this.k.iterator();
    while (iterator.hasNext())
      k.y(((d)iterator.next()).a().getAdapter()).notifyDataSetChanged(); 
  }
  
  public boolean d() {
    return false;
  }
  
  public void dismiss() {
    int i = this.k.size();
    if (i > 0) {
      d[] arrayOfD = this.k.<d>toArray(new d[i]);
      while (--i >= 0) {
        d d1 = arrayOfD[i];
        if (d1.a.a())
          d1.a.dismiss(); 
        i--;
      } 
    } 
  }
  
  public void g(m.a parama) {
    this.z = parama;
  }
  
  public void i(Parcelable paramParcelable) {}
  
  public boolean j(r paramr) {
    for (d d1 : this.k) {
      if (paramr == d1.b) {
        d1.a().requestFocus();
        return true;
      } 
    } 
    if (paramr.hasVisibleItems()) {
      l(paramr);
      m.a a1 = this.z;
      if (a1 != null)
        a1.c(paramr); 
      return true;
    } 
    return false;
  }
  
  public Parcelable k() {
    return null;
  }
  
  public void l(g paramg) {
    paramg.c(this, this.d);
    if (a()) {
      F(paramg);
    } else {
      this.j.add(paramg);
    } 
  }
  
  protected boolean m() {
    return false;
  }
  
  public void onDismiss() {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: istore_1
    //   10: iconst_0
    //   11: istore_2
    //   12: iload_2
    //   13: iload_1
    //   14: if_icmpge -> 50
    //   17: aload_0
    //   18: getfield k : Ljava/util/List;
    //   21: iload_2
    //   22: invokeinterface get : (I)Ljava/lang/Object;
    //   27: checkcast androidx/appcompat/view/menu/d$d
    //   30: astore_3
    //   31: aload_3
    //   32: getfield a : Landroidx/appcompat/widget/MenuPopupWindow;
    //   35: invokevirtual a : ()Z
    //   38: ifne -> 44
    //   41: goto -> 52
    //   44: iinc #2, 1
    //   47: goto -> 12
    //   50: aconst_null
    //   51: astore_3
    //   52: aload_3
    //   53: ifnull -> 64
    //   56: aload_3
    //   57: getfield b : Landroidx/appcompat/view/menu/g;
    //   60: iconst_0
    //   61: invokevirtual e : (Z)V
    //   64: return
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 1 && paramInt == 82) {
      dismiss();
      return true;
    } 
    return false;
  }
  
  public void p(View paramView) {
    if (this.q != paramView) {
      this.q = paramView;
      this.p = e.b(this.o, w.C(paramView));
    } 
  }
  
  public void r(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  public void s(int paramInt) {
    if (this.o != paramInt) {
      this.o = paramInt;
      this.p = e.b(paramInt, w.C(this.q));
    } 
  }
  
  public void t(int paramInt) {
    this.t = true;
    this.v = paramInt;
  }
  
  public void u(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.B = paramOnDismissListener;
  }
  
  public void v(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  public void w(int paramInt) {
    this.u = true;
    this.w = paramInt;
  }
  
  class a implements ViewTreeObserver.OnGlobalLayoutListener {
    a(d this$0) {}
    
    public void onGlobalLayout() {
      if (this.b.a() && this.b.k.size() > 0 && !((d.d)this.b.k.get(0)).a.z()) {
        View view = this.b.r;
        if (view == null || !view.isShown()) {
          this.b.dismiss();
          return;
        } 
        Iterator<d.d> iterator = this.b.k.iterator();
        while (iterator.hasNext())
          ((d.d)iterator.next()).a.T0(); 
      } 
    }
  }
  
  class b implements View.OnAttachStateChangeListener {
    b(d this$0) {}
    
    public void onViewAttachedToWindow(View param1View) {}
    
    public void onViewDetachedFromWindow(View param1View) {
      ViewTreeObserver viewTreeObserver = this.b.A;
      if (viewTreeObserver != null) {
        if (!viewTreeObserver.isAlive())
          this.b.A = param1View.getViewTreeObserver(); 
        d d1 = this.b;
        d1.A.removeGlobalOnLayoutListener(d1.l);
      } 
      param1View.removeOnAttachStateChangeListener(this);
    }
  }
  
  class c implements u {
    c(d this$0) {}
    
    public void d(g param1g, MenuItem param1MenuItem) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Landroidx/appcompat/view/menu/d;
      //   4: getfield i : Landroid/os/Handler;
      //   7: astore_3
      //   8: aconst_null
      //   9: astore #4
      //   11: aload_3
      //   12: aconst_null
      //   13: invokevirtual removeCallbacksAndMessages : (Ljava/lang/Object;)V
      //   16: aload_0
      //   17: getfield b : Landroidx/appcompat/view/menu/d;
      //   20: getfield k : Ljava/util/List;
      //   23: invokeinterface size : ()I
      //   28: istore #5
      //   30: iconst_0
      //   31: istore #6
      //   33: iload #6
      //   35: iload #5
      //   37: if_icmpge -> 73
      //   40: aload_1
      //   41: aload_0
      //   42: getfield b : Landroidx/appcompat/view/menu/d;
      //   45: getfield k : Ljava/util/List;
      //   48: iload #6
      //   50: invokeinterface get : (I)Ljava/lang/Object;
      //   55: checkcast androidx/appcompat/view/menu/d$d
      //   58: getfield b : Landroidx/appcompat/view/menu/g;
      //   61: if_acmpne -> 67
      //   64: goto -> 76
      //   67: iinc #6, 1
      //   70: goto -> 33
      //   73: iconst_m1
      //   74: istore #6
      //   76: iload #6
      //   78: iconst_m1
      //   79: if_icmpne -> 83
      //   82: return
      //   83: iinc #6, 1
      //   86: iload #6
      //   88: aload_0
      //   89: getfield b : Landroidx/appcompat/view/menu/d;
      //   92: getfield k : Ljava/util/List;
      //   95: invokeinterface size : ()I
      //   100: if_icmpge -> 122
      //   103: aload_0
      //   104: getfield b : Landroidx/appcompat/view/menu/d;
      //   107: getfield k : Ljava/util/List;
      //   110: iload #6
      //   112: invokeinterface get : (I)Ljava/lang/Object;
      //   117: checkcast androidx/appcompat/view/menu/d$d
      //   120: astore #4
      //   122: new androidx/appcompat/view/menu/d$c$a
      //   125: dup
      //   126: aload_0
      //   127: aload #4
      //   129: aload_2
      //   130: aload_1
      //   131: invokespecial <init> : (Landroidx/appcompat/view/menu/d$c;Landroidx/appcompat/view/menu/d$d;Landroid/view/MenuItem;Landroidx/appcompat/view/menu/g;)V
      //   134: astore_2
      //   135: invokestatic uptimeMillis : ()J
      //   138: lstore #7
      //   140: aload_0
      //   141: getfield b : Landroidx/appcompat/view/menu/d;
      //   144: getfield i : Landroid/os/Handler;
      //   147: aload_2
      //   148: aload_1
      //   149: lload #7
      //   151: ldc2_w 200
      //   154: ladd
      //   155: invokevirtual postAtTime : (Ljava/lang/Runnable;Ljava/lang/Object;J)Z
      //   158: pop
      //   159: return
    }
    
    public void g(g param1g, MenuItem param1MenuItem) {
      this.b.i.removeCallbacksAndMessages(param1g);
    }
    
    class a implements Runnable {
      a(d.c this$0, d.d param2d, MenuItem param2MenuItem, g param2g) {}
      
      public void run() {
        d.d d1 = this.b;
        if (d1 != null) {
          this.e.b.C = true;
          d1.b.e(false);
          this.e.b.C = false;
        } 
        if (this.c.isEnabled() && this.c.hasSubMenu())
          this.d.N(this.c, 4); 
      }
    }
  }
  
  class a implements Runnable {
    a(d this$0, d.d param1d, MenuItem param1MenuItem, g param1g) {}
    
    public void run() {
      d.d d1 = this.b;
      if (d1 != null) {
        this.e.b.C = true;
        d1.b.e(false);
        this.e.b.C = false;
      } 
      if (this.c.isEnabled() && this.c.hasSubMenu())
        this.d.N(this.c, 4); 
    }
  }
  
  private static class d {
    public final MenuPopupWindow a;
    
    public final g b;
    
    public final int c;
    
    public d(MenuPopupWindow param1MenuPopupWindow, g param1g, int param1Int) {
      this.a = param1MenuPopupWindow;
      this.b = param1g;
      this.c = param1Int;
    }
    
    public ListView a() {
      return this.a.U0();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */