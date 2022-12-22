package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.h.k.w;

public final class ViewPager2 extends ViewGroup {
  static boolean b = true;
  
  private final Rect c = new Rect();
  
  private final Rect d = new Rect();
  
  private b e = new b(3);
  
  int f;
  
  boolean g = false;
  
  private RecyclerView.i h = new a(this);
  
  private LinearLayoutManager i;
  
  private int j = -1;
  
  private Parcelable k;
  
  RecyclerView l;
  
  private androidx.recyclerview.widget.j m;
  
  e n;
  
  private b o;
  
  private c p;
  
  private d q;
  
  private RecyclerView.l r = null;
  
  private boolean s = false;
  
  private boolean t = true;
  
  private int u = -1;
  
  e v;
  
  public ViewPager2(Context paramContext) {
    super(paramContext);
    b(paramContext, null);
  }
  
  public ViewPager2(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    b(paramContext, paramAttributeSet);
  }
  
  public ViewPager2(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    b(paramContext, paramAttributeSet);
  }
  
  private RecyclerView.p a() {
    return new d(this);
  }
  
  private void b(Context paramContext, AttributeSet paramAttributeSet) {
    f f;
    if (b) {
      j j1 = new j(this);
    } else {
      f = new f(this);
    } 
    this.v = f;
    m m = new m(this, paramContext);
    this.l = m;
    m.setId(w.k());
    this.l.setDescendantFocusability(131072);
    h h = new h(this, paramContext);
    this.i = h;
    this.l.setLayoutManager((RecyclerView.o)h);
    this.l.setScrollingTouchSlop(1);
    j(paramContext, paramAttributeSet);
    this.l.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.l.j(a());
    e e1 = new e(this);
    this.n = e1;
    this.p = new c(this, e1, this.l);
    l l1 = new l(this);
    this.m = l1;
    l1.b(this.l);
    this.l.l(this.n);
    b b2 = new b(3);
    this.o = b2;
    this.n.o(b2);
    b b1 = new b(this);
    c c1 = new c(this);
    this.o.d(b1);
    this.o.d(c1);
    this.v.h(this.o, this.l);
    this.o.d(this.e);
    d d1 = new d(this.i);
    this.q = d1;
    this.o.d(d1);
    RecyclerView recyclerView = this.l;
    attachViewToParent((View)recyclerView, 0, recyclerView.getLayoutParams());
  }
  
  private void f(RecyclerView.Adapter<?> paramAdapter) {
    if (paramAdapter != null)
      paramAdapter.x(this.h); 
  }
  
  private void h() {
    if (this.j == -1)
      return; 
    RecyclerView.Adapter adapter = getAdapter();
    if (adapter == null)
      return; 
    Parcelable parcelable = this.k;
    if (parcelable != null) {
      if (adapter instanceof androidx.viewpager2.adapter.a)
        ((androidx.viewpager2.adapter.a)adapter).b(parcelable); 
      this.k = null;
    } 
    int k = Math.max(0, Math.min(this.j, adapter.d() - 1));
    this.f = k;
    this.j = -1;
    this.l.i1(k);
    this.v.m();
  }
  
  private void j(Context paramContext, AttributeSet paramAttributeSet) {
    int[] arrayOfInt = b.u.a.ViewPager2;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    if (Build.VERSION.SDK_INT >= 29)
      saveAttributeDataForStyleable(paramContext, arrayOfInt, paramAttributeSet, typedArray, 0, 0); 
    try {
      setOrientation(typedArray.getInt(b.u.a.ViewPager2_android_orientation, 0));
      return;
    } finally {
      typedArray.recycle();
    } 
  }
  
  private void k(RecyclerView.Adapter<?> paramAdapter) {
    if (paramAdapter != null)
      paramAdapter.z(this.h); 
  }
  
  public boolean c() {
    return this.p.a();
  }
  
  public boolean canScrollHorizontally(int paramInt) {
    return this.l.canScrollHorizontally(paramInt);
  }
  
  public boolean canScrollVertically(int paramInt) {
    return this.l.canScrollVertically(paramInt);
  }
  
  boolean d() {
    int k = this.i.Z();
    boolean bool = true;
    if (k != 1)
      bool = false; 
    return bool;
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray) {
    Parcelable parcelable = (Parcelable)paramSparseArray.get(getId());
    if (parcelable instanceof SavedState) {
      int k = ((SavedState)parcelable).b;
      paramSparseArray.put(this.l.getId(), paramSparseArray.get(k));
      paramSparseArray.remove(k);
    } 
    super.dispatchRestoreInstanceState(paramSparseArray);
    h();
  }
  
  public boolean e() {
    return this.t;
  }
  
  public void g() {
    if (this.q.d() == null)
      return; 
    double d1 = this.n.g();
    int k = (int)d1;
    double d2 = k;
    Double.isNaN(d2);
    float f = (float)(d1 - d2);
    int m = Math.round(getPageSize() * f);
    this.q.b(k, f, m);
  }
  
  public CharSequence getAccessibilityClassName() {
    return this.v.a() ? this.v.g() : super.getAccessibilityClassName();
  }
  
  public RecyclerView.Adapter getAdapter() {
    return this.l.getAdapter();
  }
  
  public int getCurrentItem() {
    return this.f;
  }
  
  public int getItemDecorationCount() {
    return this.l.getItemDecorationCount();
  }
  
  public int getOffscreenPageLimit() {
    return this.u;
  }
  
  public int getOrientation() {
    return this.i.m2();
  }
  
  int getPageSize() {
    int k;
    int m;
    RecyclerView recyclerView = this.l;
    if (getOrientation() == 0) {
      k = recyclerView.getWidth() - recyclerView.getPaddingLeft();
      m = recyclerView.getPaddingRight();
    } else {
      k = recyclerView.getHeight() - recyclerView.getPaddingTop();
      m = recyclerView.getPaddingBottom();
    } 
    return k - m;
  }
  
  public int getScrollState() {
    return this.n.h();
  }
  
  void i(int paramInt, boolean paramBoolean) {
    RecyclerView.Adapter adapter = getAdapter();
    if (adapter == null) {
      if (this.j != -1)
        this.j = Math.max(paramInt, 0); 
      return;
    } 
    if (adapter.d() <= 0)
      return; 
    int k = Math.min(Math.max(paramInt, 0), adapter.d() - 1);
    if (k == this.f && this.n.j())
      return; 
    paramInt = this.f;
    if (k == paramInt && paramBoolean)
      return; 
    double d1 = paramInt;
    this.f = k;
    this.v.q();
    if (!this.n.j())
      d1 = this.n.g(); 
    this.n.m(k, paramBoolean);
    if (!paramBoolean) {
      this.l.i1(k);
      return;
    } 
    double d2 = k;
    Double.isNaN(d2);
    if (Math.abs(d2 - d1) > 3.0D) {
      RecyclerView recyclerView = this.l;
      if (d2 > d1) {
        paramInt = k - 3;
      } else {
        paramInt = k + 3;
      } 
      recyclerView.i1(paramInt);
      recyclerView = this.l;
      recyclerView.post(new n(k, recyclerView));
    } else {
      this.l.q1(k);
    } 
  }
  
  void l() {
    androidx.recyclerview.widget.j j1 = this.m;
    if (j1 != null) {
      View view = j1.f((RecyclerView.o)this.i);
      if (view == null)
        return; 
      int k = this.i.h0(view);
      if (k != this.f && getScrollState() == 0)
        this.o.c(k); 
      this.g = false;
      return;
    } 
    throw new IllegalStateException("Design assumption violated.");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    this.v.i(paramAccessibilityNodeInfo);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int k = this.l.getMeasuredWidth();
    int m = this.l.getMeasuredHeight();
    this.c.left = getPaddingLeft();
    this.c.right = paramInt3 - paramInt1 - getPaddingRight();
    this.c.top = getPaddingTop();
    this.c.bottom = paramInt4 - paramInt2 - getPaddingBottom();
    Gravity.apply(8388659, k, m, this.c, this.d);
    RecyclerView recyclerView = this.l;
    Rect rect = this.d;
    recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
    if (this.g)
      l(); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    measureChild((View)this.l, paramInt1, paramInt2);
    int k = this.l.getMeasuredWidth();
    int m = this.l.getMeasuredHeight();
    int n = this.l.getMeasuredState();
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    int i3 = getPaddingTop();
    int i4 = getPaddingBottom();
    k = Math.max(k + i1 + i2, getSuggestedMinimumWidth());
    i3 = Math.max(m + i3 + i4, getSuggestedMinimumHeight());
    setMeasuredDimension(ViewGroup.resolveSizeAndState(k, paramInt1, n), ViewGroup.resolveSizeAndState(i3, paramInt2, n << 16));
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    SavedState savedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(savedState.getSuperState());
    this.j = savedState.c;
    this.k = savedState.d;
  }
  
  protected Parcelable onSaveInstanceState() {
    SavedState savedState = new SavedState(super.onSaveInstanceState());
    savedState.b = this.l.getId();
    int k = this.j;
    int m = k;
    if (k == -1)
      m = this.f; 
    savedState.c = m;
    Parcelable parcelable = this.k;
    if (parcelable != null) {
      savedState.d = parcelable;
    } else {
      RecyclerView.Adapter adapter = this.l.getAdapter();
      if (adapter instanceof androidx.viewpager2.adapter.a)
        savedState.d = ((androidx.viewpager2.adapter.a)adapter).a(); 
    } 
    return (Parcelable)savedState;
  }
  
  public void onViewAdded(View paramView) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(ViewPager2.class.getSimpleName());
    stringBuilder.append(" does not support direct child views");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle) {
    return this.v.c(paramInt, paramBundle) ? this.v.l(paramInt, paramBundle) : super.performAccessibilityAction(paramInt, paramBundle);
  }
  
  public void setAdapter(RecyclerView.Adapter<?> paramAdapter) {
    RecyclerView.Adapter<?> adapter = this.l.getAdapter();
    this.v.f(adapter);
    k(adapter);
    this.l.setAdapter(paramAdapter);
    this.f = 0;
    h();
    this.v.e(paramAdapter);
    f(paramAdapter);
  }
  
  public void setCurrentItem(int paramInt) {
    setCurrentItem(paramInt, true);
  }
  
  public void setCurrentItem(int paramInt, boolean paramBoolean) {
    if (!c()) {
      i(paramInt, paramBoolean);
      return;
    } 
    throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
  }
  
  public void setLayoutDirection(int paramInt) {
    super.setLayoutDirection(paramInt);
    this.v.p();
  }
  
  public void setOffscreenPageLimit(int paramInt) {
    if (paramInt >= 1 || paramInt == -1) {
      this.u = paramInt;
      this.l.requestLayout();
      return;
    } 
    throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
  }
  
  public void setOrientation(int paramInt) {
    this.i.z2(paramInt);
    this.v.r();
  }
  
  public void setPageTransformer(k paramk) {
    if (paramk != null) {
      if (!this.s) {
        this.r = this.l.getItemAnimator();
        this.s = true;
      } 
      this.l.setItemAnimator(null);
    } else if (this.s) {
      this.l.setItemAnimator(this.r);
      this.r = null;
      this.s = false;
    } 
    if (paramk == this.q.d())
      return; 
    this.q.e(paramk);
    g();
  }
  
  public void setUserInputEnabled(boolean paramBoolean) {
    this.t = paramBoolean;
    this.v.s();
  }
  
  static class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = (Parcelable.Creator<SavedState>)new a();
    
    int b;
    
    int c;
    
    Parcelable d;
    
    SavedState(Parcel param1Parcel) {
      super(param1Parcel);
      a(param1Parcel, null);
    }
    
    SavedState(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      a(param1Parcel, param1ClassLoader);
    }
    
    SavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    private void a(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      this.b = param1Parcel.readInt();
      this.c = param1Parcel.readInt();
      this.d = param1Parcel.readParcelable(param1ClassLoader);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.b);
      param1Parcel.writeInt(this.c);
      param1Parcel.writeParcelable(this.d, param1Int);
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
      public ViewPager2.SavedState a(Parcel param2Parcel) {
        return b(param2Parcel, null);
      }
      
      public ViewPager2.SavedState b(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        ViewPager2.SavedState savedState;
        if (Build.VERSION.SDK_INT >= 24) {
          savedState = new ViewPager2.SavedState(param2Parcel, param2ClassLoader);
        } else {
          savedState = new ViewPager2.SavedState((Parcel)savedState);
        } 
        return savedState;
      }
      
      public ViewPager2.SavedState[] c(int param2Int) {
        return new ViewPager2.SavedState[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<SavedState> {
    public ViewPager2.SavedState a(Parcel param1Parcel) {
      return b(param1Parcel, null);
    }
    
    public ViewPager2.SavedState b(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      ViewPager2.SavedState savedState;
      if (Build.VERSION.SDK_INT >= 24) {
        savedState = new ViewPager2.SavedState(param1Parcel, param1ClassLoader);
      } else {
        savedState = new ViewPager2.SavedState((Parcel)savedState);
      } 
      return savedState;
    }
    
    public ViewPager2.SavedState[] c(int param1Int) {
      return new ViewPager2.SavedState[param1Int];
    }
  }
  
  class a extends g {
    a(ViewPager2 this$0) {
      super(null);
    }
    
    public void a() {
      ViewPager2 viewPager2 = this.a;
      viewPager2.g = true;
      viewPager2.n.l();
    }
  }
  
  class b extends i {
    b(ViewPager2 this$0) {}
    
    public void a(int param1Int) {
      if (param1Int == 0)
        this.a.l(); 
    }
    
    public void c(int param1Int) {
      ViewPager2 viewPager2 = this.a;
      if (viewPager2.f != param1Int) {
        viewPager2.f = param1Int;
        viewPager2.v.q();
      } 
    }
  }
  
  class c extends i {
    c(ViewPager2 this$0) {}
    
    public void c(int param1Int) {
      this.a.clearFocus();
      if (this.a.hasFocus())
        this.a.l.requestFocus(2); 
    }
  }
  
  class d implements RecyclerView.p {
    d(ViewPager2 this$0) {}
    
    public void a(View param1View) {}
    
    public void b(View param1View) {
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)param1View.getLayoutParams();
      if (((ViewGroup.MarginLayoutParams)layoutParams).width == -1 && ((ViewGroup.MarginLayoutParams)layoutParams).height == -1)
        return; 
      throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
    }
  }
  
  private abstract class e {
    private e(ViewPager2 this$0) {}
    
    boolean a() {
      return false;
    }
    
    boolean b(int param1Int) {
      return false;
    }
    
    boolean c(int param1Int, Bundle param1Bundle) {
      return false;
    }
    
    boolean d() {
      return false;
    }
    
    void e(RecyclerView.Adapter<?> param1Adapter) {}
    
    void f(RecyclerView.Adapter<?> param1Adapter) {}
    
    String g() {
      throw new IllegalStateException("Not implemented.");
    }
    
    void h(b param1b, RecyclerView param1RecyclerView) {}
    
    void i(AccessibilityNodeInfo param1AccessibilityNodeInfo) {}
    
    void j(b.h.k.f0.c param1c) {}
    
    boolean k(int param1Int) {
      throw new IllegalStateException("Not implemented.");
    }
    
    boolean l(int param1Int, Bundle param1Bundle) {
      throw new IllegalStateException("Not implemented.");
    }
    
    void m() {}
    
    CharSequence n() {
      throw new IllegalStateException("Not implemented.");
    }
    
    void o(AccessibilityEvent param1AccessibilityEvent) {}
    
    void p() {}
    
    void q() {}
    
    void r() {}
    
    void s() {}
  }
  
  class f extends e {
    f(ViewPager2 this$0) {
      super(this$0, null);
    }
    
    public boolean b(int param1Int) {
      boolean bool;
      if ((param1Int == 8192 || param1Int == 4096) && !this.b.e()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean d() {
      return true;
    }
    
    public void j(b.h.k.f0.c param1c) {
      if (!this.b.e()) {
        param1c.T(b.h.k.f0.c.a.n);
        param1c.T(b.h.k.f0.c.a.m);
        param1c.x0(false);
      } 
    }
    
    public boolean k(int param1Int) {
      if (b(param1Int))
        return false; 
      throw new IllegalStateException();
    }
    
    public CharSequence n() {
      if (d())
        return "androidx.viewpager.widget.ViewPager"; 
      throw new IllegalStateException();
    }
  }
  
  private static abstract class g extends RecyclerView.i {
    private g() {}
    
    public final void b(int param1Int1, int param1Int2) {
      a();
    }
    
    public final void c(int param1Int1, int param1Int2, Object param1Object) {
      a();
    }
    
    public final void d(int param1Int1, int param1Int2) {
      a();
    }
    
    public final void e(int param1Int1, int param1Int2) {
      a();
    }
  }
  
  private class h extends LinearLayoutManager {
    h(ViewPager2 this$0, Context param1Context) {
      super(param1Context);
    }
    
    public void N0(RecyclerView.u param1u, RecyclerView.y param1y, b.h.k.f0.c param1c) {
      super.N0(param1u, param1y, param1c);
      this.I.v.j(param1c);
    }
    
    protected void N1(RecyclerView.y param1y, int[] param1ArrayOfint) {
      int i = this.I.getOffscreenPageLimit();
      if (i == -1) {
        super.N1(param1y, param1ArrayOfint);
        return;
      } 
      i = this.I.getPageSize() * i;
      param1ArrayOfint[0] = i;
      param1ArrayOfint[1] = i;
    }
    
    public boolean h1(RecyclerView.u param1u, RecyclerView.y param1y, int param1Int, Bundle param1Bundle) {
      return this.I.v.b(param1Int) ? this.I.v.k(param1Int) : super.h1(param1u, param1y, param1Int, param1Bundle);
    }
    
    public boolean s1(RecyclerView param1RecyclerView, View param1View, Rect param1Rect, boolean param1Boolean1, boolean param1Boolean2) {
      return false;
    }
  }
  
  public static abstract class i {
    public void a(int param1Int) {}
    
    public void b(int param1Int1, float param1Float, int param1Int2) {}
    
    public void c(int param1Int) {}
  }
  
  class j extends e {
    private final b.h.k.f0.f b = new a(this);
    
    private final b.h.k.f0.f c = new b(this);
    
    private RecyclerView.i d;
    
    j(ViewPager2 this$0) {
      super(this$0, null);
    }
    
    private void t(AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      boolean bool1;
      if (this.e.getAdapter() != null) {
        if (this.e.getOrientation() == 1) {
          bool1 = this.e.getAdapter().d();
        } else {
          int k = this.e.getAdapter().d();
          bool1 = false;
          b.h.k.f0.c.H0(param1AccessibilityNodeInfo).e0(b.h.k.f0.c.b.b(bool1, k, false, 0));
        } 
      } else {
        bool1 = false;
      } 
      boolean bool2 = false;
      b.h.k.f0.c.H0(param1AccessibilityNodeInfo).e0(b.h.k.f0.c.b.b(bool1, bool2, false, 0));
    }
    
    private void u(AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      RecyclerView.Adapter adapter = this.e.getAdapter();
      if (adapter == null)
        return; 
      int k = adapter.d();
      if (k != 0 && this.e.e()) {
        if (this.e.f > 0)
          param1AccessibilityNodeInfo.addAction(8192); 
        if (this.e.f < k - 1)
          param1AccessibilityNodeInfo.addAction(4096); 
        param1AccessibilityNodeInfo.setScrollable(true);
      } 
    }
    
    public boolean a() {
      return true;
    }
    
    public boolean c(int param1Int, Bundle param1Bundle) {
      return (param1Int == 8192 || param1Int == 4096);
    }
    
    public void e(RecyclerView.Adapter<?> param1Adapter) {
      w();
      if (param1Adapter != null)
        param1Adapter.x(this.d); 
    }
    
    public void f(RecyclerView.Adapter<?> param1Adapter) {
      if (param1Adapter != null)
        param1Adapter.z(this.d); 
    }
    
    public String g() {
      if (a())
        return "androidx.viewpager.widget.ViewPager"; 
      throw new IllegalStateException();
    }
    
    public void h(b param1b, RecyclerView param1RecyclerView) {
      w.B0((View)param1RecyclerView, 2);
      this.d = new c(this);
      if (w.A((View)this.e) == 0)
        w.B0((View)this.e, 1); 
    }
    
    public void i(AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      t(param1AccessibilityNodeInfo);
      if (Build.VERSION.SDK_INT >= 16)
        u(param1AccessibilityNodeInfo); 
    }
    
    public boolean l(int param1Int, Bundle param1Bundle) {
      if (c(param1Int, param1Bundle)) {
        if (param1Int == 8192) {
          param1Int = this.e.getCurrentItem() - 1;
        } else {
          param1Int = this.e.getCurrentItem() + 1;
        } 
        v(param1Int);
        return true;
      } 
      throw new IllegalStateException();
    }
    
    public void m() {
      w();
    }
    
    public void o(AccessibilityEvent param1AccessibilityEvent) {
      param1AccessibilityEvent.setSource((View)this.e);
      param1AccessibilityEvent.setClassName(g());
    }
    
    public void p() {
      w();
    }
    
    public void q() {
      w();
    }
    
    public void r() {
      w();
    }
    
    public void s() {
      w();
      if (Build.VERSION.SDK_INT < 21)
        this.e.sendAccessibilityEvent(2048); 
    }
    
    void v(int param1Int) {
      if (this.e.e())
        this.e.i(param1Int, true); 
    }
    
    void w() {
      ViewPager2 viewPager2 = this.e;
      int k = 16908360;
      w.l0((View)viewPager2, 16908360);
      w.l0((View)viewPager2, 16908361);
      w.l0((View)viewPager2, 16908358);
      w.l0((View)viewPager2, 16908359);
      if (this.e.getAdapter() == null)
        return; 
      int m = this.e.getAdapter().d();
      if (m == 0)
        return; 
      if (!this.e.e())
        return; 
      if (this.e.getOrientation() == 0) {
        int n;
        boolean bool = this.e.d();
        if (bool) {
          n = 16908360;
        } else {
          n = 16908361;
        } 
        if (bool)
          k = 16908361; 
        if (this.e.f < m - 1)
          w.n0((View)viewPager2, new b.h.k.f0.c.a(n, null), null, this.b); 
        if (this.e.f > 0)
          w.n0((View)viewPager2, new b.h.k.f0.c.a(k, null), null, this.c); 
      } else {
        if (this.e.f < m - 1)
          w.n0((View)viewPager2, new b.h.k.f0.c.a(16908359, null), null, this.b); 
        if (this.e.f > 0)
          w.n0((View)viewPager2, new b.h.k.f0.c.a(16908358, null), null, this.c); 
      } 
    }
    
    class a implements b.h.k.f0.f {
      a(ViewPager2.j this$0) {}
      
      public boolean a(View param2View, b.h.k.f0.f.a param2a) {
        ViewPager2 viewPager2 = (ViewPager2)param2View;
        this.a.v(viewPager2.getCurrentItem() + 1);
        return true;
      }
    }
    
    class b implements b.h.k.f0.f {
      b(ViewPager2.j this$0) {}
      
      public boolean a(View param2View, b.h.k.f0.f.a param2a) {
        ViewPager2 viewPager2 = (ViewPager2)param2View;
        this.a.v(viewPager2.getCurrentItem() - 1);
        return true;
      }
    }
    
    class c extends ViewPager2.g {
      c(ViewPager2.j this$0) {
        super(null);
      }
      
      public void a() {
        this.a.w();
      }
    }
  }
  
  class a implements b.h.k.f0.f {
    a(ViewPager2 this$0) {}
    
    public boolean a(View param1View, b.h.k.f0.f.a param1a) {
      ViewPager2 viewPager2 = (ViewPager2)param1View;
      this.a.v(viewPager2.getCurrentItem() + 1);
      return true;
    }
  }
  
  class b implements b.h.k.f0.f {
    b(ViewPager2 this$0) {}
    
    public boolean a(View param1View, b.h.k.f0.f.a param1a) {
      ViewPager2 viewPager2 = (ViewPager2)param1View;
      this.a.v(viewPager2.getCurrentItem() - 1);
      return true;
    }
  }
  
  class c extends g {
    c(ViewPager2 this$0) {
      super(null);
    }
    
    public void a() {
      this.a.w();
    }
  }
  
  public static interface k {
    void a(View param1View, float param1Float);
  }
  
  private class l extends androidx.recyclerview.widget.j {
    l(ViewPager2 this$0) {}
    
    public View f(RecyclerView.o param1o) {
      View view;
      if (this.f.c()) {
        param1o = null;
      } else {
        view = super.f(param1o);
      } 
      return view;
    }
  }
  
  private class m extends RecyclerView {
    m(ViewPager2 this$0, Context param1Context) {
      super(param1Context);
    }
    
    public CharSequence getAccessibilityClassName() {
      return this.M0.v.d() ? this.M0.v.n() : super.getAccessibilityClassName();
    }
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent param1AccessibilityEvent) {
      super.onInitializeAccessibilityEvent(param1AccessibilityEvent);
      param1AccessibilityEvent.setFromIndex(this.M0.f);
      param1AccessibilityEvent.setToIndex(this.M0.f);
      this.M0.v.o(param1AccessibilityEvent);
    }
    
    public boolean onInterceptTouchEvent(MotionEvent param1MotionEvent) {
      boolean bool;
      if (this.M0.e() && super.onInterceptTouchEvent(param1MotionEvent)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent param1MotionEvent) {
      boolean bool;
      if (this.M0.e() && super.onTouchEvent(param1MotionEvent)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
  
  private static class n implements Runnable {
    private final int b;
    
    private final RecyclerView c;
    
    n(int param1Int, RecyclerView param1RecyclerView) {
      this.b = param1Int;
      this.c = param1RecyclerView;
    }
    
    public void run() {
      this.c.q1(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/viewpager2/widget/ViewPager2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */