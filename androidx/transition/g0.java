package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b.h.k.w;
import java.lang.reflect.Method;
import java.util.ArrayList;

class g0 implements i0 {
  protected a a;
  
  g0(Context paramContext, ViewGroup paramViewGroup, View paramView) {
    this.a = new a(paramContext, paramViewGroup, paramView, this);
  }
  
  static g0 e(View paramView) {
    ViewGroup viewGroup = f(paramView);
    if (viewGroup != null) {
      int i = viewGroup.getChildCount();
      for (byte b = 0; b < i; b++) {
        View view = viewGroup.getChildAt(b);
        if (view instanceof a)
          return ((a)view).f; 
      } 
      return new b0(viewGroup.getContext(), viewGroup, paramView);
    } 
    return null;
  }
  
  static ViewGroup f(View paramView) {
    while (paramView != null) {
      if (paramView.getId() == 16908290 && paramView instanceof ViewGroup)
        return (ViewGroup)paramView; 
      if (paramView.getParent() instanceof ViewGroup)
        ViewGroup viewGroup = (ViewGroup)paramView.getParent(); 
    } 
    return null;
  }
  
  public void a(Drawable paramDrawable) {
    this.a.a(paramDrawable);
  }
  
  public void b(Drawable paramDrawable) {
    this.a.f(paramDrawable);
  }
  
  static class a extends ViewGroup {
    static Method b;
    
    ViewGroup c;
    
    View d;
    
    ArrayList<Drawable> e = null;
    
    g0 f;
    
    private boolean g;
    
    static {
      try {
        Class<int> clazz = int.class;
        b = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[] { clazz, clazz, Rect.class });
      } catch (NoSuchMethodException noSuchMethodException) {}
    }
    
    a(Context param1Context, ViewGroup param1ViewGroup, View param1View, g0 param1g0) {
      super(param1Context);
      this.c = param1ViewGroup;
      this.d = param1View;
      setRight(param1ViewGroup.getWidth());
      setBottom(param1ViewGroup.getHeight());
      param1ViewGroup.addView((View)this);
      this.f = param1g0;
    }
    
    private void c() {
      if (!this.g)
        return; 
      throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
    }
    
    private void d() {
      if (getChildCount() == 0) {
        ArrayList<Drawable> arrayList = this.e;
        if (arrayList == null || arrayList.size() == 0) {
          this.g = true;
          this.c.removeView((View)this);
        } 
      } 
    }
    
    private void e(int[] param1ArrayOfint) {
      int[] arrayOfInt1 = new int[2];
      int[] arrayOfInt2 = new int[2];
      this.c.getLocationOnScreen(arrayOfInt1);
      this.d.getLocationOnScreen(arrayOfInt2);
      param1ArrayOfint[0] = arrayOfInt2[0] - arrayOfInt1[0];
      param1ArrayOfint[1] = arrayOfInt2[1] - arrayOfInt1[1];
    }
    
    public void a(Drawable param1Drawable) {
      c();
      if (this.e == null)
        this.e = new ArrayList<Drawable>(); 
      if (!this.e.contains(param1Drawable)) {
        this.e.add(param1Drawable);
        invalidate(param1Drawable.getBounds());
        param1Drawable.setCallback((Drawable.Callback)this);
      } 
    }
    
    public void b(View param1View) {
      c();
      if (param1View.getParent() instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)param1View.getParent();
        if (viewGroup != this.c && viewGroup.getParent() != null && w.U((View)viewGroup)) {
          int[] arrayOfInt1 = new int[2];
          int[] arrayOfInt2 = new int[2];
          viewGroup.getLocationOnScreen(arrayOfInt1);
          this.c.getLocationOnScreen(arrayOfInt2);
          w.a0(param1View, arrayOfInt1[0] - arrayOfInt2[0]);
          w.b0(param1View, arrayOfInt1[1] - arrayOfInt2[1]);
        } 
        viewGroup.removeView(param1View);
        if (param1View.getParent() != null)
          viewGroup.removeView(param1View); 
      } 
      addView(param1View);
    }
    
    protected void dispatchDraw(Canvas param1Canvas) {
      int i;
      int[] arrayOfInt1 = new int[2];
      int[] arrayOfInt2 = new int[2];
      this.c.getLocationOnScreen(arrayOfInt1);
      this.d.getLocationOnScreen(arrayOfInt2);
      byte b = 0;
      param1Canvas.translate((arrayOfInt2[0] - arrayOfInt1[0]), (arrayOfInt2[1] - arrayOfInt1[1]));
      param1Canvas.clipRect(new Rect(0, 0, this.d.getWidth(), this.d.getHeight()));
      super.dispatchDraw(param1Canvas);
      ArrayList<Drawable> arrayList = this.e;
      if (arrayList == null) {
        i = 0;
      } else {
        i = arrayList.size();
      } 
      while (b < i) {
        ((Drawable)this.e.get(b)).draw(param1Canvas);
        b++;
      } 
    }
    
    public boolean dispatchTouchEvent(MotionEvent param1MotionEvent) {
      return false;
    }
    
    public void f(Drawable param1Drawable) {
      ArrayList<Drawable> arrayList = this.e;
      if (arrayList != null) {
        arrayList.remove(param1Drawable);
        invalidate(param1Drawable.getBounds());
        param1Drawable.setCallback(null);
        d();
      } 
    }
    
    public void g(View param1View) {
      removeView(param1View);
      d();
    }
    
    public ViewParent invalidateChildInParent(int[] param1ArrayOfint, Rect param1Rect) {
      if (this.c != null) {
        param1Rect.offset(param1ArrayOfint[0], param1ArrayOfint[1]);
        if (this.c instanceof ViewGroup) {
          param1ArrayOfint[0] = 0;
          param1ArrayOfint[1] = 0;
          int[] arrayOfInt = new int[2];
          e(arrayOfInt);
          param1Rect.offset(arrayOfInt[0], arrayOfInt[1]);
          return super.invalidateChildInParent(param1ArrayOfint, param1Rect);
        } 
        invalidate(param1Rect);
      } 
      return null;
    }
    
    public void invalidateDrawable(Drawable param1Drawable) {
      invalidate(param1Drawable.getBounds());
    }
    
    protected void onLayout(boolean param1Boolean, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    protected boolean verifyDrawable(Drawable param1Drawable) {
      if (!super.verifyDrawable(param1Drawable)) {
        ArrayList<Drawable> arrayList = this.e;
        return (arrayList != null && arrayList.contains(param1Drawable));
      } 
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */