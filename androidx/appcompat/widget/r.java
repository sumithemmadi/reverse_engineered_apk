package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.f;
import b.a.l.a.c;
import b.h.k.a0;
import java.lang.reflect.Field;

class r extends ListView {
  private final Rect b = new Rect();
  
  private int c = 0;
  
  private int d = 0;
  
  private int e = 0;
  
  private int f = 0;
  
  private int g;
  
  private Field h;
  
  private a i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  private a0 m;
  
  private f n;
  
  b o;
  
  r(Context paramContext, boolean paramBoolean) {
    super(paramContext, null, b.a.a.dropDownListViewStyle);
    this.k = paramBoolean;
    setCacheColorHint(0);
    try {
      Field field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.h = field;
      field.setAccessible(true);
    } catch (NoSuchFieldException noSuchFieldException) {
      noSuchFieldException.printStackTrace();
    } 
  }
  
  private void a() {
    this.l = false;
    setPressed(false);
    drawableStateChanged();
    View view = getChildAt(this.g - getFirstVisiblePosition());
    if (view != null)
      view.setPressed(false); 
    a0 a01 = this.m;
    if (a01 != null) {
      a01.b();
      this.m = null;
    } 
  }
  
  private void b(View paramView, int paramInt) {
    performItemClick(paramView, paramInt, getItemIdAtPosition(paramInt));
  }
  
  private void c(Canvas paramCanvas) {
    if (!this.b.isEmpty()) {
      Drawable drawable = getSelector();
      if (drawable != null) {
        drawable.setBounds(this.b);
        drawable.draw(paramCanvas);
      } 
    } 
  }
  
  private void f(int paramInt, View paramView) {
    Rect rect = this.b;
    rect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    rect.left -= this.c;
    rect.top -= this.d;
    rect.right += this.e;
    rect.bottom += this.f;
    try {
      boolean bool = this.h.getBoolean(this);
      if (paramView.isEnabled() != bool) {
        Field field = this.h;
        if (!bool) {
          bool = true;
        } else {
          bool = false;
        } 
        field.set(this, Boolean.valueOf(bool));
        if (paramInt != -1)
          refreshDrawableState(); 
      } 
    } catch (IllegalAccessException illegalAccessException) {
      illegalAccessException.printStackTrace();
    } 
  }
  
  private void g(int paramInt, View paramView) {
    boolean bool2;
    Drawable drawable = getSelector();
    boolean bool1 = true;
    if (drawable != null && paramInt != -1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool2)
      drawable.setVisible(false, false); 
    f(paramInt, paramView);
    if (bool2) {
      Rect rect = this.b;
      float f1 = rect.exactCenterX();
      float f2 = rect.exactCenterY();
      if (getVisibility() != 0)
        bool1 = false; 
      drawable.setVisible(bool1, false);
      androidx.core.graphics.drawable.a.k(drawable, f1, f2);
    } 
  }
  
  private void h(int paramInt, View paramView, float paramFloat1, float paramFloat2) {
    g(paramInt, paramView);
    Drawable drawable = getSelector();
    if (drawable != null && paramInt != -1)
      androidx.core.graphics.drawable.a.k(drawable, paramFloat1, paramFloat2); 
  }
  
  private void i(View paramView, int paramInt, float paramFloat1, float paramFloat2) {
    this.l = true;
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
      drawableHotspotChanged(paramFloat1, paramFloat2); 
    if (!isPressed())
      setPressed(true); 
    layoutChildren();
    int j = this.g;
    if (j != -1) {
      View view = getChildAt(j - getFirstVisiblePosition());
      if (view != null && view != paramView && view.isPressed())
        view.setPressed(false); 
    } 
    this.g = paramInt;
    float f1 = paramView.getLeft();
    float f2 = paramView.getTop();
    if (i >= 21)
      paramView.drawableHotspotChanged(paramFloat1 - f1, paramFloat2 - f2); 
    if (!paramView.isPressed())
      paramView.setPressed(true); 
    h(paramInt, paramView, paramFloat1, paramFloat2);
    setSelectorEnabled(false);
    refreshDrawableState();
  }
  
  private boolean j() {
    return this.l;
  }
  
  private void k() {
    Drawable drawable = getSelector();
    if (drawable != null && j() && isPressed())
      drawable.setState(getDrawableState()); 
  }
  
  private void setSelectorEnabled(boolean paramBoolean) {
    a a1 = this.i;
    if (a1 != null)
      a1.c(paramBoolean); 
  }
  
  public int d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt2 = getListPaddingTop();
    paramInt3 = getListPaddingBottom();
    int i = getDividerHeight();
    Drawable drawable = getDivider();
    ListAdapter listAdapter = getAdapter();
    if (listAdapter == null)
      return paramInt2 + paramInt3; 
    paramInt3 = paramInt2 + paramInt3;
    if (i <= 0 || drawable == null)
      i = 0; 
    int j = listAdapter.getCount();
    drawable = null;
    byte b1 = 0;
    int k = 0;
    for (paramInt2 = 0; b1 < j; paramInt2 = m) {
      int m = listAdapter.getItemViewType(b1);
      int n = k;
      if (m != k) {
        drawable = null;
        n = m;
      } 
      View view2 = listAdapter.getView(b1, (View)drawable, (ViewGroup)this);
      ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
      ViewGroup.LayoutParams layoutParams1 = layoutParams2;
      if (layoutParams2 == null) {
        layoutParams1 = generateDefaultLayoutParams();
        view2.setLayoutParams(layoutParams1);
      } 
      k = layoutParams1.height;
      if (k > 0) {
        k = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
      } else {
        k = View.MeasureSpec.makeMeasureSpec(0, 0);
      } 
      view2.measure(paramInt1, k);
      view2.forceLayout();
      k = paramInt3;
      if (b1 > 0)
        k = paramInt3 + i; 
      paramInt3 = k + view2.getMeasuredHeight();
      if (paramInt3 >= paramInt4) {
        paramInt1 = paramInt4;
        if (paramInt5 >= 0) {
          paramInt1 = paramInt4;
          if (b1 > paramInt5) {
            paramInt1 = paramInt4;
            if (paramInt2 > 0) {
              paramInt1 = paramInt4;
              if (paramInt3 != paramInt4)
                paramInt1 = paramInt2; 
            } 
          } 
        } 
        return paramInt1;
      } 
      m = paramInt2;
      if (paramInt5 >= 0) {
        m = paramInt2;
        if (b1 >= paramInt5)
          m = paramInt3; 
      } 
      b1++;
      k = n;
      View view1 = view2;
    } 
    return paramInt3;
  }
  
  protected void dispatchDraw(Canvas paramCanvas) {
    c(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged() {
    if (this.o != null)
      return; 
    super.drawableStateChanged();
    setSelectorEnabled(true);
    k();
  }
  
  public boolean e(MotionEvent paramMotionEvent, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_3
    //   5: iload_3
    //   6: iconst_1
    //   7: if_icmpeq -> 42
    //   10: iload_3
    //   11: iconst_2
    //   12: if_icmpeq -> 36
    //   15: iload_3
    //   16: iconst_3
    //   17: if_icmpeq -> 28
    //   20: iconst_0
    //   21: istore_2
    //   22: iconst_1
    //   23: istore #4
    //   25: goto -> 139
    //   28: iconst_0
    //   29: istore_2
    //   30: iconst_0
    //   31: istore #4
    //   33: goto -> 139
    //   36: iconst_1
    //   37: istore #4
    //   39: goto -> 45
    //   42: iconst_0
    //   43: istore #4
    //   45: aload_1
    //   46: iload_2
    //   47: invokevirtual findPointerIndex : (I)I
    //   50: istore #5
    //   52: iload #5
    //   54: ifge -> 60
    //   57: goto -> 28
    //   60: aload_1
    //   61: iload #5
    //   63: invokevirtual getX : (I)F
    //   66: f2i
    //   67: istore_2
    //   68: aload_1
    //   69: iload #5
    //   71: invokevirtual getY : (I)F
    //   74: f2i
    //   75: istore #5
    //   77: aload_0
    //   78: iload_2
    //   79: iload #5
    //   81: invokevirtual pointToPosition : (II)I
    //   84: istore #6
    //   86: iload #6
    //   88: iconst_m1
    //   89: if_icmpne -> 97
    //   92: iconst_1
    //   93: istore_2
    //   94: goto -> 139
    //   97: aload_0
    //   98: iload #6
    //   100: aload_0
    //   101: invokevirtual getFirstVisiblePosition : ()I
    //   104: isub
    //   105: invokevirtual getChildAt : (I)Landroid/view/View;
    //   108: astore #7
    //   110: aload_0
    //   111: aload #7
    //   113: iload #6
    //   115: iload_2
    //   116: i2f
    //   117: iload #5
    //   119: i2f
    //   120: invokespecial i : (Landroid/view/View;IFF)V
    //   123: iload_3
    //   124: iconst_1
    //   125: if_icmpne -> 20
    //   128: aload_0
    //   129: aload #7
    //   131: iload #6
    //   133: invokespecial b : (Landroid/view/View;I)V
    //   136: goto -> 20
    //   139: iload #4
    //   141: ifeq -> 148
    //   144: iload_2
    //   145: ifeq -> 152
    //   148: aload_0
    //   149: invokespecial a : ()V
    //   152: iload #4
    //   154: ifeq -> 198
    //   157: aload_0
    //   158: getfield n : Landroidx/core/widget/f;
    //   161: ifnonnull -> 176
    //   164: aload_0
    //   165: new androidx/core/widget/f
    //   168: dup
    //   169: aload_0
    //   170: invokespecial <init> : (Landroid/widget/ListView;)V
    //   173: putfield n : Landroidx/core/widget/f;
    //   176: aload_0
    //   177: getfield n : Landroidx/core/widget/f;
    //   180: iconst_1
    //   181: invokevirtual m : (Z)Landroidx/core/widget/a;
    //   184: pop
    //   185: aload_0
    //   186: getfield n : Landroidx/core/widget/f;
    //   189: aload_0
    //   190: aload_1
    //   191: invokevirtual onTouch : (Landroid/view/View;Landroid/view/MotionEvent;)Z
    //   194: pop
    //   195: goto -> 213
    //   198: aload_0
    //   199: getfield n : Landroidx/core/widget/f;
    //   202: astore_1
    //   203: aload_1
    //   204: ifnull -> 213
    //   207: aload_1
    //   208: iconst_0
    //   209: invokevirtual m : (Z)Landroidx/core/widget/a;
    //   212: pop
    //   213: iload #4
    //   215: ireturn
  }
  
  public boolean hasFocus() {
    return (this.k || super.hasFocus());
  }
  
  public boolean hasWindowFocus() {
    return (this.k || super.hasWindowFocus());
  }
  
  public boolean isFocused() {
    return (this.k || super.isFocused());
  }
  
  public boolean isInTouchMode() {
    boolean bool;
    if ((this.k && this.j) || super.isInTouchMode()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected void onDetachedFromWindow() {
    this.o = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    if (Build.VERSION.SDK_INT < 26)
      return super.onHoverEvent(paramMotionEvent); 
    int i = paramMotionEvent.getActionMasked();
    if (i == 10 && this.o == null) {
      b b1 = new b(this);
      this.o = b1;
      b1.b();
    } 
    boolean bool = super.onHoverEvent(paramMotionEvent);
    if (i == 9 || i == 7) {
      i = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if (i != -1 && i != getSelectedItemPosition()) {
        View view = getChildAt(i - getFirstVisiblePosition());
        if (view.isEnabled())
          setSelectionFromTop(i, view.getTop() - getTop()); 
        k();
      } 
      return bool;
    } 
    setSelection(-1);
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 0)
      this.g = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()); 
    b b1 = this.o;
    if (b1 != null)
      b1.a(); 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  void setListSelectionHidden(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable) {
    a a1;
    if (paramDrawable != null) {
      a1 = new a(paramDrawable);
    } else {
      a1 = null;
    } 
    this.i = a1;
    super.setSelector((Drawable)a1);
    Rect rect = new Rect();
    if (paramDrawable != null)
      paramDrawable.getPadding(rect); 
    this.c = rect.left;
    this.d = rect.top;
    this.e = rect.right;
    this.f = rect.bottom;
  }
  
  private static class a extends c {
    private boolean c = true;
    
    a(Drawable param1Drawable) {
      super(param1Drawable);
    }
    
    void c(boolean param1Boolean) {
      this.c = param1Boolean;
    }
    
    public void draw(Canvas param1Canvas) {
      if (this.c)
        super.draw(param1Canvas); 
    }
    
    public void setHotspot(float param1Float1, float param1Float2) {
      if (this.c)
        super.setHotspot(param1Float1, param1Float2); 
    }
    
    public void setHotspotBounds(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      if (this.c)
        super.setHotspotBounds(param1Int1, param1Int2, param1Int3, param1Int4); 
    }
    
    public boolean setState(int[] param1ArrayOfint) {
      return this.c ? super.setState(param1ArrayOfint) : false;
    }
    
    public boolean setVisible(boolean param1Boolean1, boolean param1Boolean2) {
      return this.c ? super.setVisible(param1Boolean1, param1Boolean2) : false;
    }
  }
  
  private class b implements Runnable {
    b(r this$0) {}
    
    public void a() {
      r r1 = this.b;
      r1.o = null;
      r1.removeCallbacks(this);
    }
    
    public void b() {
      this.b.post(this);
    }
    
    public void run() {
      r r1 = this.b;
      r1.o = null;
      r1.drawableStateChanged();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */