package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.t;
import b.a.j;

public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.a {
  i g;
  
  private CharSequence h;
  
  private Drawable i;
  
  g.b j;
  
  private t k;
  
  b l;
  
  private boolean m;
  
  private boolean n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  public ActionMenuItemView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    Resources resources = paramContext.getResources();
    this.m = g();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ActionMenuItemView, paramInt, 0);
    this.o = typedArray.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
    typedArray.recycle();
    this.q = (int)((resources.getDisplayMetrics()).density * 32.0F + 0.5F);
    setOnClickListener(this);
    this.p = -1;
    setSaveEnabled(false);
  }
  
  private boolean g() {
    Configuration configuration = getContext().getResources().getConfiguration();
    int j = configuration.screenWidthDp;
    int k = configuration.screenHeightDp;
    return (j >= 480 || (j >= 640 && k >= 480) || configuration.orientation == 2);
  }
  
  private void h() {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Ljava/lang/CharSequence;
    //   4: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   7: istore_1
    //   8: iconst_1
    //   9: istore_2
    //   10: iload_2
    //   11: istore_3
    //   12: aload_0
    //   13: getfield i : Landroid/graphics/drawable/Drawable;
    //   16: ifnull -> 52
    //   19: aload_0
    //   20: getfield g : Landroidx/appcompat/view/menu/i;
    //   23: invokevirtual B : ()Z
    //   26: ifeq -> 50
    //   29: iload_2
    //   30: istore_3
    //   31: aload_0
    //   32: getfield m : Z
    //   35: ifne -> 52
    //   38: aload_0
    //   39: getfield n : Z
    //   42: ifeq -> 50
    //   45: iload_2
    //   46: istore_3
    //   47: goto -> 52
    //   50: iconst_0
    //   51: istore_3
    //   52: iload_1
    //   53: iconst_1
    //   54: ixor
    //   55: iload_3
    //   56: iand
    //   57: istore_3
    //   58: aconst_null
    //   59: astore #4
    //   61: iload_3
    //   62: ifeq -> 74
    //   65: aload_0
    //   66: getfield h : Ljava/lang/CharSequence;
    //   69: astore #5
    //   71: goto -> 77
    //   74: aconst_null
    //   75: astore #5
    //   77: aload_0
    //   78: aload #5
    //   80: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   83: aload_0
    //   84: getfield g : Landroidx/appcompat/view/menu/i;
    //   87: invokevirtual getContentDescription : ()Ljava/lang/CharSequence;
    //   90: astore #5
    //   92: aload #5
    //   94: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   97: ifeq -> 128
    //   100: iload_3
    //   101: ifeq -> 110
    //   104: aconst_null
    //   105: astore #5
    //   107: goto -> 119
    //   110: aload_0
    //   111: getfield g : Landroidx/appcompat/view/menu/i;
    //   114: invokevirtual getTitle : ()Ljava/lang/CharSequence;
    //   117: astore #5
    //   119: aload_0
    //   120: aload #5
    //   122: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   125: goto -> 134
    //   128: aload_0
    //   129: aload #5
    //   131: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   134: aload_0
    //   135: getfield g : Landroidx/appcompat/view/menu/i;
    //   138: invokevirtual getTooltipText : ()Ljava/lang/CharSequence;
    //   141: astore #5
    //   143: aload #5
    //   145: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   148: ifeq -> 180
    //   151: iload_3
    //   152: ifeq -> 162
    //   155: aload #4
    //   157: astore #5
    //   159: goto -> 171
    //   162: aload_0
    //   163: getfield g : Landroidx/appcompat/view/menu/i;
    //   166: invokevirtual getTitle : ()Ljava/lang/CharSequence;
    //   169: astore #5
    //   171: aload_0
    //   172: aload #5
    //   174: invokestatic a : (Landroid/view/View;Ljava/lang/CharSequence;)V
    //   177: goto -> 186
    //   180: aload_0
    //   181: aload #5
    //   183: invokestatic a : (Landroid/view/View;Ljava/lang/CharSequence;)V
    //   186: return
  }
  
  public boolean a() {
    return f();
  }
  
  public boolean b() {
    boolean bool;
    if (f() && this.g.getIcon() == null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean d() {
    return true;
  }
  
  public void e(i parami, int paramInt) {
    this.g = parami;
    setIcon(parami.getIcon());
    setTitle(parami.i(this));
    setId(parami.getItemId());
    if (parami.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    setEnabled(parami.isEnabled());
    if (parami.hasSubMenu() && this.k == null)
      this.k = new a(this); 
  }
  
  public boolean f() {
    return TextUtils.isEmpty(getText()) ^ true;
  }
  
  public i getItemData() {
    return this.g;
  }
  
  public void onClick(View paramView) {
    g.b b1 = this.j;
    if (b1 != null)
      b1.a(this.g); 
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    this.m = g();
    h();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    boolean bool = f();
    if (bool) {
      int m = this.p;
      if (m >= 0)
        super.setPadding(m, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
    } 
    super.onMeasure(paramInt1, paramInt2);
    int j = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int k = getMeasuredWidth();
    if (j == Integer.MIN_VALUE) {
      paramInt1 = Math.min(paramInt1, this.o);
    } else {
      paramInt1 = this.o;
    } 
    if (j != 1073741824 && this.o > 0 && k < paramInt1)
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2); 
    if (!bool && this.i != null)
      super.setPadding((getMeasuredWidth() - this.i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    super.onRestoreInstanceState(null);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (this.g.hasSubMenu()) {
      t t1 = this.k;
      if (t1 != null && t1.onTouch((View)this, paramMotionEvent))
        return true; 
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean) {
    if (this.n != paramBoolean) {
      this.n = paramBoolean;
      i i1 = this.g;
      if (i1 != null)
        i1.c(); 
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    this.i = paramDrawable;
    if (paramDrawable != null) {
      int j = paramDrawable.getIntrinsicWidth();
      int k = paramDrawable.getIntrinsicHeight();
      int m = this.q;
      int n = j;
      int i1 = k;
      if (j > m) {
        float f = m / j;
        i1 = (int)(k * f);
        n = m;
      } 
      if (i1 > m) {
        float f = m / i1;
        n = (int)(n * f);
      } else {
        m = i1;
      } 
      paramDrawable.setBounds(0, 0, n, m);
    } 
    setCompoundDrawables(paramDrawable, null, null, null);
    h();
  }
  
  public void setItemInvoker(g.b paramb) {
    this.j = paramb;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.p = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(b paramb) {
    this.l = paramb;
  }
  
  public void setShortcut(boolean paramBoolean, char paramChar) {}
  
  public void setTitle(CharSequence paramCharSequence) {
    this.h = paramCharSequence;
    h();
  }
  
  private class a extends t {
    public a(ActionMenuItemView this$0) {
      super((View)this$0);
    }
    
    public p b() {
      ActionMenuItemView.b b = this.k.l;
      return (b != null) ? b.a() : null;
    }
    
    protected boolean c() {
      ActionMenuItemView actionMenuItemView = this.k;
      g.b b = actionMenuItemView.j;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (b != null) {
        bool2 = bool1;
        if (b.a(actionMenuItemView.g)) {
          p p = b();
          bool2 = bool1;
          if (p != null) {
            bool2 = bool1;
            if (p.a())
              bool2 = true; 
          } 
        } 
      } 
      return bool2;
    }
  }
  
  public static abstract class b {
    public abstract p a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/view/menu/ActionMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */