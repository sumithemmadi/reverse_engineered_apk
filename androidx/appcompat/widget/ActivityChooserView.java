package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import b.a.h;
import b.a.j;
import b.h.k.w;

public class ActivityChooserView extends ViewGroup {
  final f b;
  
  private final g c;
  
  private final View d;
  
  private final Drawable e;
  
  final FrameLayout f;
  
  private final ImageView g;
  
  final FrameLayout h;
  
  private final ImageView i;
  
  private final int j;
  
  b.h.k.b k;
  
  final DataSetObserver l = new a(this);
  
  private final ViewTreeObserver.OnGlobalLayoutListener m = new b(this);
  
  private ListPopupWindow n;
  
  PopupWindow.OnDismissListener o;
  
  boolean p;
  
  int q = 4;
  
  private boolean r;
  
  private int s;
  
  public ActivityChooserView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActivityChooserView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    int[] arrayOfInt = j.ActivityChooserView;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    w.p0((View)this, paramContext, arrayOfInt, paramAttributeSet, typedArray, paramInt, 0);
    this.q = typedArray.getInt(j.ActivityChooserView_initialActivityCount, 4);
    Drawable drawable = typedArray.getDrawable(j.ActivityChooserView_expandActivityOverflowButtonDrawable);
    typedArray.recycle();
    LayoutInflater.from(getContext()).inflate(b.a.g.abc_activity_chooser_view, this, true);
    g g1 = new g(this);
    this.c = g1;
    View view = findViewById(b.a.f.activity_chooser_view_content);
    this.d = view;
    this.e = view.getBackground();
    FrameLayout frameLayout = (FrameLayout)findViewById(b.a.f.default_activity_button);
    this.h = frameLayout;
    frameLayout.setOnClickListener(g1);
    frameLayout.setOnLongClickListener(g1);
    paramInt = b.a.f.image;
    this.i = (ImageView)frameLayout.findViewById(paramInt);
    frameLayout = (FrameLayout)findViewById(b.a.f.expand_activities_button);
    frameLayout.setOnClickListener(g1);
    frameLayout.setAccessibilityDelegate(new c(this));
    frameLayout.setOnTouchListener(new d(this, (View)frameLayout));
    this.f = frameLayout;
    ImageView imageView = (ImageView)frameLayout.findViewById(paramInt);
    this.g = imageView;
    imageView.setImageDrawable(drawable);
    f f1 = new f(this);
    this.b = f1;
    f1.registerDataSetObserver(new e(this));
    Resources resources = paramContext.getResources();
    this.j = Math.max((resources.getDisplayMetrics()).widthPixels / 2, resources.getDimensionPixelSize(b.a.d.abc_config_prefDialogWidth));
  }
  
  public boolean a() {
    if (b()) {
      getListPopupWindow().dismiss();
      ViewTreeObserver viewTreeObserver = getViewTreeObserver();
      if (viewTreeObserver.isAlive())
        viewTreeObserver.removeGlobalOnLayoutListener(this.m); 
    } 
    return true;
  }
  
  public boolean b() {
    return getListPopupWindow().a();
  }
  
  public boolean c() {
    if (b() || !this.r)
      return false; 
    this.p = false;
    d(this.q);
    return true;
  }
  
  void d(int paramInt) {
    if (this.b.b() != null) {
      byte b1;
      getViewTreeObserver().addOnGlobalLayoutListener(this.m);
      if (this.h.getVisibility() == 0) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      int i = this.b.a();
      if (paramInt != Integer.MAX_VALUE && i > paramInt + b1) {
        this.b.j(true);
        this.b.h(paramInt - 1);
      } else {
        this.b.j(false);
        this.b.h(paramInt);
      } 
      ListPopupWindow listPopupWindow = getListPopupWindow();
      if (!listPopupWindow.a()) {
        if (this.p || b1 == 0) {
          this.b.i(true, b1);
        } else {
          this.b.i(false, false);
        } 
        listPopupWindow.D(Math.min(this.b.f(), this.j));
        listPopupWindow.T0();
        b.h.k.b b2 = this.k;
        if (b2 != null)
          b2.k(true); 
        listPopupWindow.U0().setContentDescription(getContext().getString(h.abc_activitychooserview_choose_application));
        listPopupWindow.U0().setSelector((Drawable)new ColorDrawable(0));
      } 
      return;
    } 
    throw new IllegalStateException("No data model. Did you call #setDataModel?");
  }
  
  void e() {
    if (this.b.getCount() > 0) {
      this.f.setEnabled(true);
    } else {
      this.f.setEnabled(false);
    } 
    int i = this.b.a();
    int j = this.b.d();
    if (i == 1 || (i > 1 && j > 0)) {
      this.h.setVisibility(0);
      ResolveInfo resolveInfo = this.b.c();
      PackageManager packageManager = getContext().getPackageManager();
      this.i.setImageDrawable(resolveInfo.loadIcon(packageManager));
      if (this.s != 0) {
        CharSequence charSequence = resolveInfo.loadLabel(packageManager);
        charSequence = getContext().getString(this.s, new Object[] { charSequence });
        this.h.setContentDescription(charSequence);
      } 
    } else {
      this.h.setVisibility(8);
    } 
    if (this.h.getVisibility() == 0) {
      this.d.setBackgroundDrawable(this.e);
    } else {
      this.d.setBackgroundDrawable(null);
    } 
  }
  
  public c getDataModel() {
    return this.b.b();
  }
  
  ListPopupWindow getListPopupWindow() {
    if (this.n == null) {
      ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
      this.n = listPopupWindow;
      listPopupWindow.n((ListAdapter)this.b);
      this.n.B((View)this);
      this.n.H(true);
      this.n.J(this.c);
      this.n.I(this.c);
    } 
    return this.n;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.b.b() == null) {
      this.r = true;
      return;
    } 
    throw null;
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.b.b() == null) {
      ViewTreeObserver viewTreeObserver = getViewTreeObserver();
      if (viewTreeObserver.isAlive())
        viewTreeObserver.removeGlobalOnLayoutListener(this.m); 
      if (b())
        a(); 
      this.r = false;
      return;
    } 
    throw null;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.d.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!b())
      a(); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    View view = this.d;
    int i = paramInt2;
    if (this.h.getVisibility() != 0)
      i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824); 
    measureChild(view, paramInt1, i);
    setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
  }
  
  public void setActivityChooserModel(c paramc) {
    this.b.g(paramc);
    if (b()) {
      a();
      c();
    } 
  }
  
  public void setDefaultActionButtonContentDescription(int paramInt) {
    this.s = paramInt;
  }
  
  public void setExpandActivityOverflowButtonContentDescription(int paramInt) {
    String str = getContext().getString(paramInt);
    this.g.setContentDescription(str);
  }
  
  public void setExpandActivityOverflowButtonDrawable(Drawable paramDrawable) {
    this.g.setImageDrawable(paramDrawable);
  }
  
  public void setInitialActivityCount(int paramInt) {
    this.q = paramInt;
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.o = paramOnDismissListener;
  }
  
  public void setProvider(b.h.k.b paramb) {
    this.k = paramb;
  }
  
  public static class InnerLayout extends LinearLayout {
    private static final int[] b = new int[] { 16842964 };
    
    public InnerLayout(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      e0 e0 = e0.u(param1Context, param1AttributeSet, b);
      setBackgroundDrawable(e0.g(0));
      e0.w();
    }
  }
  
  class a extends DataSetObserver {
    a(ActivityChooserView this$0) {}
    
    public void onChanged() {
      super.onChanged();
      this.a.b.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
      super.onInvalidated();
      this.a.b.notifyDataSetInvalidated();
    }
  }
  
  class b implements ViewTreeObserver.OnGlobalLayoutListener {
    b(ActivityChooserView this$0) {}
    
    public void onGlobalLayout() {
      if (this.b.b())
        if (!this.b.isShown()) {
          this.b.getListPopupWindow().dismiss();
        } else {
          this.b.getListPopupWindow().T0();
          b.h.k.b b1 = this.b.k;
          if (b1 != null)
            b1.k(true); 
        }  
    }
  }
  
  class c extends View.AccessibilityDelegate {
    c(ActivityChooserView this$0) {}
    
    public void onInitializeAccessibilityNodeInfo(View param1View, AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      super.onInitializeAccessibilityNodeInfo(param1View, param1AccessibilityNodeInfo);
      b.h.k.f0.c.H0(param1AccessibilityNodeInfo).Z(true);
    }
  }
  
  class d extends t {
    d(ActivityChooserView this$0, View param1View) {
      super(param1View);
    }
    
    public p b() {
      return this.k.getListPopupWindow();
    }
    
    protected boolean c() {
      this.k.c();
      return true;
    }
    
    protected boolean d() {
      this.k.a();
      return true;
    }
  }
  
  class e extends DataSetObserver {
    e(ActivityChooserView this$0) {}
    
    public void onChanged() {
      super.onChanged();
      this.a.e();
    }
  }
  
  private class f extends BaseAdapter {
    private c b;
    
    private int c = 4;
    
    private boolean d;
    
    private boolean e;
    
    private boolean f;
    
    f(ActivityChooserView this$0) {}
    
    public int a() {
      throw null;
    }
    
    public c b() {
      return this.b;
    }
    
    public ResolveInfo c() {
      throw null;
    }
    
    public int d() {
      throw null;
    }
    
    public boolean e() {
      return this.d;
    }
    
    public int f() {
      int i = this.c;
      this.c = Integer.MAX_VALUE;
      byte b = 0;
      int j = View.MeasureSpec.makeMeasureSpec(0, 0);
      int k = View.MeasureSpec.makeMeasureSpec(0, 0);
      int m = getCount();
      View view = null;
      int n = 0;
      while (b < m) {
        view = getView(b, view, null);
        view.measure(j, k);
        n = Math.max(n, view.getMeasuredWidth());
        b++;
      } 
      this.c = i;
      return n;
    }
    
    public void g(c param1c) {
      if (this.g.b.b() == null || !this.g.isShown()) {
        if (param1c == null || !this.g.isShown()) {
          notifyDataSetChanged();
          return;
        } 
        DataSetObserver dataSetObserver1 = this.g.l;
        throw null;
      } 
      DataSetObserver dataSetObserver = this.g.l;
      throw null;
    }
    
    public int getCount() {
      throw null;
    }
    
    public Object getItem(int param1Int) {
      param1Int = getItemViewType(param1Int);
      if (param1Int != 0) {
        if (param1Int == 1)
          return null; 
        throw new IllegalArgumentException();
      } 
      if (!this.d)
        throw null; 
      throw null;
    }
    
    public long getItemId(int param1Int) {
      return param1Int;
    }
    
    public int getItemViewType(int param1Int) {
      return (this.f && param1Int == getCount() - 1) ? 1 : 0;
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      // Byte code:
      //   0: aload_0
      //   1: iload_1
      //   2: invokevirtual getItemViewType : (I)I
      //   5: istore #4
      //   7: iload #4
      //   9: ifeq -> 97
      //   12: iload #4
      //   14: iconst_1
      //   15: if_icmpne -> 89
      //   18: aload_2
      //   19: ifnull -> 33
      //   22: aload_2
      //   23: astore #5
      //   25: aload_2
      //   26: invokevirtual getId : ()I
      //   29: iconst_1
      //   30: if_icmpeq -> 86
      //   33: aload_0
      //   34: getfield g : Landroidx/appcompat/widget/ActivityChooserView;
      //   37: invokevirtual getContext : ()Landroid/content/Context;
      //   40: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
      //   43: getstatic b/a/g.abc_activity_chooser_view_list_item : I
      //   46: aload_3
      //   47: iconst_0
      //   48: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
      //   51: astore #5
      //   53: aload #5
      //   55: iconst_1
      //   56: invokevirtual setId : (I)V
      //   59: aload #5
      //   61: getstatic b/a/f.title : I
      //   64: invokevirtual findViewById : (I)Landroid/view/View;
      //   67: checkcast android/widget/TextView
      //   70: aload_0
      //   71: getfield g : Landroidx/appcompat/widget/ActivityChooserView;
      //   74: invokevirtual getContext : ()Landroid/content/Context;
      //   77: getstatic b/a/h.abc_activity_chooser_view_see_all : I
      //   80: invokevirtual getString : (I)Ljava/lang/String;
      //   83: invokevirtual setText : (Ljava/lang/CharSequence;)V
      //   86: aload #5
      //   88: areturn
      //   89: new java/lang/IllegalArgumentException
      //   92: dup
      //   93: invokespecial <init> : ()V
      //   96: athrow
      //   97: aload_2
      //   98: ifnull -> 114
      //   101: aload_2
      //   102: astore #5
      //   104: aload_2
      //   105: invokevirtual getId : ()I
      //   108: getstatic b/a/f.list_item : I
      //   111: if_icmpeq -> 134
      //   114: aload_0
      //   115: getfield g : Landroidx/appcompat/widget/ActivityChooserView;
      //   118: invokevirtual getContext : ()Landroid/content/Context;
      //   121: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
      //   124: getstatic b/a/g.abc_activity_chooser_view_list_item : I
      //   127: aload_3
      //   128: iconst_0
      //   129: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
      //   132: astore #5
      //   134: aload_0
      //   135: getfield g : Landroidx/appcompat/widget/ActivityChooserView;
      //   138: invokevirtual getContext : ()Landroid/content/Context;
      //   141: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
      //   144: astore #6
      //   146: aload #5
      //   148: getstatic b/a/f.icon : I
      //   151: invokevirtual findViewById : (I)Landroid/view/View;
      //   154: checkcast android/widget/ImageView
      //   157: astore_3
      //   158: aload_0
      //   159: iload_1
      //   160: invokevirtual getItem : (I)Ljava/lang/Object;
      //   163: checkcast android/content/pm/ResolveInfo
      //   166: astore_2
      //   167: aload_3
      //   168: aload_2
      //   169: aload #6
      //   171: invokevirtual loadIcon : (Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
      //   174: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
      //   177: aload #5
      //   179: getstatic b/a/f.title : I
      //   182: invokevirtual findViewById : (I)Landroid/view/View;
      //   185: checkcast android/widget/TextView
      //   188: aload_2
      //   189: aload #6
      //   191: invokevirtual loadLabel : (Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
      //   194: invokevirtual setText : (Ljava/lang/CharSequence;)V
      //   197: aload_0
      //   198: getfield d : Z
      //   201: ifeq -> 224
      //   204: iload_1
      //   205: ifne -> 224
      //   208: aload_0
      //   209: getfield e : Z
      //   212: ifeq -> 224
      //   215: aload #5
      //   217: iconst_1
      //   218: invokevirtual setActivated : (Z)V
      //   221: goto -> 230
      //   224: aload #5
      //   226: iconst_0
      //   227: invokevirtual setActivated : (Z)V
      //   230: aload #5
      //   232: areturn
    }
    
    public int getViewTypeCount() {
      return 3;
    }
    
    public void h(int param1Int) {
      if (this.c != param1Int) {
        this.c = param1Int;
        notifyDataSetChanged();
      } 
    }
    
    public void i(boolean param1Boolean1, boolean param1Boolean2) {
      if (this.d != param1Boolean1 || this.e != param1Boolean2) {
        this.d = param1Boolean1;
        this.e = param1Boolean2;
        notifyDataSetChanged();
      } 
    }
    
    public void j(boolean param1Boolean) {
      if (this.f != param1Boolean) {
        this.f = param1Boolean;
        notifyDataSetChanged();
      } 
    }
  }
  
  private class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
    g(ActivityChooserView this$0) {}
    
    private void a() {
      PopupWindow.OnDismissListener onDismissListener = this.b.o;
      if (onDismissListener != null)
        onDismissListener.onDismiss(); 
    }
    
    public void onClick(View param1View) {
      ActivityChooserView activityChooserView = this.b;
      if (param1View != activityChooserView.h) {
        if (param1View == activityChooserView.f) {
          activityChooserView.p = false;
          activityChooserView.d(activityChooserView.q);
          return;
        } 
        throw new IllegalArgumentException();
      } 
      activityChooserView.a();
      this.b.b.c();
      this.b.b.b();
      throw null;
    }
    
    public void onDismiss() {
      a();
      b.h.k.b b = this.b.k;
      if (b != null)
        b.k(false); 
    }
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      int i = ((ActivityChooserView.f)param1AdapterView.getAdapter()).getItemViewType(param1Int);
      if (i != 0) {
        if (i == 1) {
          this.b.d(2147483647);
        } else {
          throw new IllegalArgumentException();
        } 
      } else {
        this.b.a();
        ActivityChooserView activityChooserView = this.b;
        if (activityChooserView.p) {
          if (param1Int > 0) {
            activityChooserView.b.b();
            throw null;
          } 
          return;
        } 
        activityChooserView.b.e();
        this.b.b.b();
        throw null;
      } 
    }
    
    public boolean onLongClick(View param1View) {
      ActivityChooserView activityChooserView = this.b;
      if (param1View == activityChooserView.h) {
        if (activityChooserView.b.getCount() > 0) {
          ActivityChooserView activityChooserView1 = this.b;
          activityChooserView1.p = true;
          activityChooserView1.d(activityChooserView1.q);
        } 
        return true;
      } 
      throw new IllegalArgumentException();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/ActivityChooserView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */