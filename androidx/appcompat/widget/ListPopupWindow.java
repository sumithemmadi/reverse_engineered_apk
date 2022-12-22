package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import androidx.core.widget.h;
import b.a.j;
import b.h.k.w;
import java.lang.reflect.Method;

public class ListPopupWindow implements p {
  private static Method b;
  
  private static Method c;
  
  private static Method d;
  
  final g A = new g(this);
  
  private final f B = new f(this);
  
  private final e C = new e(this);
  
  private final c D = new c(this);
  
  private Runnable E;
  
  final Handler F;
  
  private final Rect G = new Rect();
  
  private Rect H;
  
  private boolean I;
  
  PopupWindow J;
  
  private Context e;
  
  private ListAdapter f;
  
  r g;
  
  private int h = -2;
  
  private int i = -2;
  
  private int j;
  
  private int k;
  
  private int l = 1002;
  
  private boolean m;
  
  private boolean n;
  
  private boolean o;
  
  private int p = 0;
  
  private boolean q = false;
  
  private boolean r = false;
  
  int s = Integer.MAX_VALUE;
  
  private View t;
  
  private int u = 0;
  
  private DataSetObserver v;
  
  private View w;
  
  private Drawable x;
  
  private AdapterView.OnItemClickListener y;
  
  private AdapterView.OnItemSelectedListener z;
  
  static {
    if (Build.VERSION.SDK_INT <= 28) {
      try {
        b = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { boolean.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      } 
      try {
        d = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
      } 
    } 
    if (Build.VERSION.SDK_INT <= 23)
      try {
        c = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, int.class, boolean.class });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
      }  
  }
  
  public ListPopupWindow(Context paramContext) {
    this(paramContext, null, b.a.a.listPopupWindowStyle);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.a.a.listPopupWindowStyle);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    this.e = paramContext;
    this.F = new Handler(paramContext.getMainLooper());
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ListPopupWindow, paramInt1, paramInt2);
    this.j = typedArray.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    int i = typedArray.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
    this.k = i;
    if (i != 0)
      this.m = true; 
    typedArray.recycle();
    AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(paramContext, paramAttributeSet, paramInt1, paramInt2);
    this.J = appCompatPopupWindow;
    appCompatPopupWindow.setInputMethodMode(1);
  }
  
  private void A() {
    View view = this.t;
    if (view != null) {
      ViewParent viewParent = view.getParent();
      if (viewParent instanceof ViewGroup)
        ((ViewGroup)viewParent).removeView(this.t); 
    } 
  }
  
  private void L(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT <= 28) {
      Method method = b;
      if (method != null)
        try {
          method.invoke(this.J, new Object[] { Boolean.valueOf(paramBoolean) });
        } catch (Exception exception) {
          Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
        }  
    } else {
      this.J.setIsClippedToScreen(paramBoolean);
    } 
  }
  
  private int o() {
    byte b1;
    byte b2;
    r r1 = this.g;
    boolean bool = true;
    if (r1 == null) {
      LinearLayout.LayoutParams layoutParams1;
      LinearLayout.LayoutParams layoutParams2;
      Context context = this.e;
      this.E = new a(this);
      r r2 = q(context, this.I ^ true);
      this.g = r2;
      Drawable drawable1 = this.x;
      if (drawable1 != null)
        r2.setSelector(drawable1); 
      this.g.setAdapter(this.f);
      this.g.setOnItemClickListener(this.y);
      this.g.setFocusable(true);
      this.g.setFocusableInTouchMode(true);
      this.g.setOnItemSelectedListener(new b(this));
      this.g.setOnScrollListener(this.C);
      AdapterView.OnItemSelectedListener onItemSelectedListener = this.z;
      if (onItemSelectedListener != null)
        this.g.setOnItemSelectedListener(onItemSelectedListener); 
      r r3 = this.g;
      View view = this.t;
      if (view != null) {
        StringBuilder stringBuilder;
        boolean bool1;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        b1 = this.u;
        if (b1 != 0) {
          if (b1 != 1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid hint position ");
            stringBuilder.append(this.u);
            Log.e("ListPopupWindow", stringBuilder.toString());
          } else {
            linearLayout.addView((View)stringBuilder, (ViewGroup.LayoutParams)layoutParams);
            linearLayout.addView(view);
          } 
        } else {
          linearLayout.addView(view);
          linearLayout.addView((View)stringBuilder, (ViewGroup.LayoutParams)layoutParams);
        } 
        b1 = this.i;
        if (b1 >= 0) {
          bool1 = true;
        } else {
          b1 = 0;
          bool1 = false;
        } 
        view.measure(View.MeasureSpec.makeMeasureSpec(b1, bool1), 0);
        layoutParams2 = (LinearLayout.LayoutParams)view.getLayoutParams();
        b1 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
      } else {
        b1 = 0;
        layoutParams1 = layoutParams2;
      } 
      this.J.setContentView((View)layoutParams1);
    } else {
      ViewGroup viewGroup = (ViewGroup)this.J.getContentView();
      View view = this.t;
      if (view != null) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
        b1 = view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
      } else {
        b1 = 0;
      } 
    } 
    Drawable drawable = this.J.getBackground();
    if (drawable != null) {
      drawable.getPadding(this.G);
      Rect rect = this.G;
      int m = rect.top;
      int k = rect.bottom + m;
      b2 = k;
      if (!this.m) {
        this.k = -m;
        b2 = k;
      } 
    } else {
      this.G.setEmpty();
      b2 = 0;
    } 
    if (this.J.getInputMethodMode() != 2)
      bool = false; 
    int j = s(r(), this.k, bool);
    if (this.q || this.h == -1)
      return j + b2; 
    int i = this.i;
    if (i != -2) {
      if (i != -1) {
        i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
      } else {
        i = (this.e.getResources().getDisplayMetrics()).widthPixels;
        Rect rect = this.G;
        i = View.MeasureSpec.makeMeasureSpec(i - rect.left + rect.right, 1073741824);
      } 
    } else {
      i = (this.e.getResources().getDisplayMetrics()).widthPixels;
      Rect rect = this.G;
      i = View.MeasureSpec.makeMeasureSpec(i - rect.left + rect.right, -2147483648);
    } 
    j = this.g.d(i, 0, -1, j - b1, -1);
    i = b1;
    if (j > 0)
      i = b1 + b2 + this.g.getPaddingTop() + this.g.getPaddingBottom(); 
    return j + i;
  }
  
  private int s(View paramView, int paramInt, boolean paramBoolean) {
    if (Build.VERSION.SDK_INT <= 23) {
      Method method = c;
      if (method != null)
        try {
          return ((Integer)method.invoke(this.J, new Object[] { paramView, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).intValue();
        } catch (Exception exception) {
          Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
        }  
      return this.J.getMaxAvailableHeight(paramView, paramInt);
    } 
    return this.J.getMaxAvailableHeight(paramView, paramInt, paramBoolean);
  }
  
  public void B(View paramView) {
    this.w = paramView;
  }
  
  public void C(int paramInt) {
    this.J.setAnimationStyle(paramInt);
  }
  
  public void D(int paramInt) {
    Drawable drawable = this.J.getBackground();
    if (drawable != null) {
      drawable.getPadding(this.G);
      Rect rect = this.G;
      this.i = rect.left + rect.right + paramInt;
    } else {
      O(paramInt);
    } 
  }
  
  public void E(int paramInt) {
    this.p = paramInt;
  }
  
  public void F(Rect paramRect) {
    if (paramRect != null) {
      paramRect = new Rect(paramRect);
    } else {
      paramRect = null;
    } 
    this.H = paramRect;
  }
  
  public void G(int paramInt) {
    this.J.setInputMethodMode(paramInt);
  }
  
  public void H(boolean paramBoolean) {
    this.I = paramBoolean;
    this.J.setFocusable(paramBoolean);
  }
  
  public void I(PopupWindow.OnDismissListener paramOnDismissListener) {
    this.J.setOnDismissListener(paramOnDismissListener);
  }
  
  public void J(AdapterView.OnItemClickListener paramOnItemClickListener) {
    this.y = paramOnItemClickListener;
  }
  
  public void K(boolean paramBoolean) {
    this.o = true;
    this.n = paramBoolean;
  }
  
  public void M(int paramInt) {
    this.u = paramInt;
  }
  
  public void N(int paramInt) {
    r r1 = this.g;
    if (a() && r1 != null) {
      r1.setListSelectionHidden(false);
      r1.setSelection(paramInt);
      if (r1.getChoiceMode() != 0)
        r1.setItemChecked(paramInt, true); 
    } 
  }
  
  public void O(int paramInt) {
    this.i = paramInt;
  }
  
  public void T0() {
    int i = o();
    boolean bool1 = y();
    h.b(this.J, this.l);
    boolean bool2 = this.J.isShowing();
    boolean bool = true;
    if (bool2) {
      int k;
      if (!w.U(r()))
        return; 
      int j = this.i;
      if (j == -1) {
        k = -1;
      } else {
        k = j;
        if (j == -2)
          k = r().getWidth(); 
      } 
      j = this.h;
      if (j == -1) {
        if (!bool1)
          i = -1; 
        if (bool1) {
          PopupWindow popupWindow = this.J;
          if (this.i == -1) {
            j = -1;
          } else {
            j = 0;
          } 
          popupWindow.setWidth(j);
          this.J.setHeight(0);
        } else {
          PopupWindow popupWindow = this.J;
          if (this.i == -1) {
            j = -1;
          } else {
            j = 0;
          } 
          popupWindow.setWidth(j);
          this.J.setHeight(-1);
        } 
      } else if (j != -2) {
        i = j;
      } 
      PopupWindow popupWindow1 = this.J;
      if (this.r || this.q)
        bool = false; 
      popupWindow1.setOutsideTouchable(bool);
      PopupWindow popupWindow2 = this.J;
      View view = r();
      j = this.j;
      int m = this.k;
      if (k < 0)
        k = -1; 
      if (i < 0)
        i = -1; 
      popupWindow2.update(view, j, m, k, i);
    } else {
      int k;
      int j = this.i;
      if (j == -1) {
        k = -1;
      } else {
        k = j;
        if (j == -2)
          k = r().getWidth(); 
      } 
      j = this.h;
      if (j == -1) {
        i = -1;
      } else if (j != -2) {
        i = j;
      } 
      this.J.setWidth(k);
      this.J.setHeight(i);
      L(true);
      PopupWindow popupWindow = this.J;
      if (!this.r && !this.q) {
        bool = true;
      } else {
        bool = false;
      } 
      popupWindow.setOutsideTouchable(bool);
      this.J.setTouchInterceptor(this.B);
      if (this.o)
        h.a(this.J, this.n); 
      if (Build.VERSION.SDK_INT <= 28) {
        Method method = d;
        if (method != null)
          try {
            method.invoke(this.J, new Object[] { this.H });
          } catch (Exception exception) {
            Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", exception);
          }  
      } else {
        this.J.setEpicenterBounds(this.H);
      } 
      h.c(this.J, r(), this.j, this.k, this.p);
      this.g.setSelection(-1);
      if (!this.I || this.g.isInTouchMode())
        p(); 
      if (!this.I)
        this.F.post(this.D); 
    } 
  }
  
  public ListView U0() {
    return this.g;
  }
  
  public boolean a() {
    return this.J.isShowing();
  }
  
  public void b(Drawable paramDrawable) {
    this.J.setBackgroundDrawable(paramDrawable);
  }
  
  public int c() {
    return this.j;
  }
  
  public void dismiss() {
    this.J.dismiss();
    A();
    this.J.setContentView(null);
    this.g = null;
    this.F.removeCallbacks(this.A);
  }
  
  public void e(int paramInt) {
    this.j = paramInt;
  }
  
  public Drawable h() {
    return this.J.getBackground();
  }
  
  public void j(int paramInt) {
    this.k = paramInt;
    this.m = true;
  }
  
  public int m() {
    return !this.m ? 0 : this.k;
  }
  
  public void n(ListAdapter paramListAdapter) {
    DataSetObserver dataSetObserver = this.v;
    if (dataSetObserver == null) {
      this.v = new d(this);
    } else {
      ListAdapter listAdapter = this.f;
      if (listAdapter != null)
        listAdapter.unregisterDataSetObserver(dataSetObserver); 
    } 
    this.f = paramListAdapter;
    if (paramListAdapter != null)
      paramListAdapter.registerDataSetObserver(this.v); 
    r r1 = this.g;
    if (r1 != null)
      r1.setAdapter(this.f); 
  }
  
  public void p() {
    r r1 = this.g;
    if (r1 != null) {
      r1.setListSelectionHidden(true);
      r1.requestLayout();
    } 
  }
  
  r q(Context paramContext, boolean paramBoolean) {
    return new r(paramContext, paramBoolean);
  }
  
  public View r() {
    return this.w;
  }
  
  public Object t() {
    return !a() ? null : this.g.getSelectedItem();
  }
  
  public long u() {
    return !a() ? Long.MIN_VALUE : this.g.getSelectedItemId();
  }
  
  public int v() {
    return !a() ? -1 : this.g.getSelectedItemPosition();
  }
  
  public View w() {
    return !a() ? null : this.g.getSelectedView();
  }
  
  public int x() {
    return this.i;
  }
  
  public boolean y() {
    boolean bool;
    if (this.J.getInputMethodMode() == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean z() {
    return this.I;
  }
  
  class a implements Runnable {
    a(ListPopupWindow this$0) {}
    
    public void run() {
      View view = this.b.r();
      if (view != null && view.getWindowToken() != null)
        this.b.T0(); 
    }
  }
  
  class b implements AdapterView.OnItemSelectedListener {
    b(ListPopupWindow this$0) {}
    
    public void onItemSelected(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      if (param1Int != -1) {
        r r = this.b.g;
        if (r != null)
          r.setListSelectionHidden(false); 
      } 
    }
    
    public void onNothingSelected(AdapterView<?> param1AdapterView) {}
  }
  
  private class c implements Runnable {
    c(ListPopupWindow this$0) {}
    
    public void run() {
      this.b.p();
    }
  }
  
  private class d extends DataSetObserver {
    d(ListPopupWindow this$0) {}
    
    public void onChanged() {
      if (this.a.a())
        this.a.T0(); 
    }
    
    public void onInvalidated() {
      this.a.dismiss();
    }
  }
  
  private class e implements AbsListView.OnScrollListener {
    e(ListPopupWindow this$0) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {
      if (param1Int == 1 && !this.a.y() && this.a.J.getContentView() != null) {
        ListPopupWindow listPopupWindow = this.a;
        listPopupWindow.F.removeCallbacks(listPopupWindow.A);
        this.a.A.run();
      } 
    }
  }
  
  private class f implements View.OnTouchListener {
    f(ListPopupWindow this$0) {}
    
    public boolean onTouch(View param1View, MotionEvent param1MotionEvent) {
      int i = param1MotionEvent.getAction();
      int j = (int)param1MotionEvent.getX();
      int k = (int)param1MotionEvent.getY();
      if (i == 0) {
        PopupWindow popupWindow = this.b.J;
        if (popupWindow != null && popupWindow.isShowing() && j >= 0 && j < this.b.J.getWidth() && k >= 0 && k < this.b.J.getHeight()) {
          ListPopupWindow listPopupWindow = this.b;
          listPopupWindow.F.postDelayed(listPopupWindow.A, 250L);
          return false;
        } 
      } 
      if (i == 1) {
        ListPopupWindow listPopupWindow = this.b;
        listPopupWindow.F.removeCallbacks(listPopupWindow.A);
      } 
      return false;
    }
  }
  
  private class g implements Runnable {
    g(ListPopupWindow this$0) {}
    
    public void run() {
      r r = this.b.g;
      if (r != null && w.U((View)r) && this.b.g.getCount() > this.b.g.getChildCount()) {
        int i = this.b.g.getChildCount();
        ListPopupWindow listPopupWindow = this.b;
        if (i <= listPopupWindow.s) {
          listPopupWindow.J.setInputMethodMode(2);
          this.b.T0();
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/ListPopupWindow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */