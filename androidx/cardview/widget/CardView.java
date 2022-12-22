package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b.d.b;
import b.d.d;
import b.d.e;

public class CardView extends FrameLayout {
  private static final int[] b = new int[] { 16842801 };
  
  private static final e c;
  
  private boolean d;
  
  private boolean e;
  
  int f;
  
  int g;
  
  final Rect h;
  
  final Rect i;
  
  private final d j;
  
  static {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      c = new b();
    } else if (i >= 17) {
      c = new a();
    } else {
      c = new c();
    } 
    c.j();
  }
  
  public CardView(Context paramContext) {
    this(paramContext, null);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.d.a.cardViewStyle);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ColorStateList colorStateList;
    Rect rect = new Rect();
    this.h = rect;
    this.i = new Rect();
    a a = new a(this);
    this.j = a;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.CardView, paramInt, d.CardView);
    paramInt = e.CardView_cardBackgroundColor;
    if (typedArray.hasValue(paramInt)) {
      colorStateList = typedArray.getColorStateList(paramInt);
    } else {
      TypedArray typedArray1 = getContext().obtainStyledAttributes(b);
      paramInt = typedArray1.getColor(0, 0);
      typedArray1.recycle();
      float[] arrayOfFloat = new float[3];
      Color.colorToHSV(paramInt, arrayOfFloat);
      if (arrayOfFloat[2] > 0.5F) {
        paramInt = getResources().getColor(b.cardview_light_background);
      } else {
        paramInt = getResources().getColor(b.cardview_dark_background);
      } 
      colorStateList = ColorStateList.valueOf(paramInt);
    } 
    float f1 = typedArray.getDimension(e.CardView_cardCornerRadius, 0.0F);
    float f2 = typedArray.getDimension(e.CardView_cardElevation, 0.0F);
    float f3 = typedArray.getDimension(e.CardView_cardMaxElevation, 0.0F);
    this.d = typedArray.getBoolean(e.CardView_cardUseCompatPadding, false);
    this.e = typedArray.getBoolean(e.CardView_cardPreventCornerOverlap, true);
    paramInt = typedArray.getDimensionPixelSize(e.CardView_contentPadding, 0);
    rect.left = typedArray.getDimensionPixelSize(e.CardView_contentPaddingLeft, paramInt);
    rect.top = typedArray.getDimensionPixelSize(e.CardView_contentPaddingTop, paramInt);
    rect.right = typedArray.getDimensionPixelSize(e.CardView_contentPaddingRight, paramInt);
    rect.bottom = typedArray.getDimensionPixelSize(e.CardView_contentPaddingBottom, paramInt);
    if (f2 > f3)
      f3 = f2; 
    this.f = typedArray.getDimensionPixelSize(e.CardView_android_minWidth, 0);
    this.g = typedArray.getDimensionPixelSize(e.CardView_android_minHeight, 0);
    typedArray.recycle();
    c.a(a, paramContext, colorStateList, f1, f2, f3);
  }
  
  public ColorStateList getCardBackgroundColor() {
    return c.h(this.j);
  }
  
  public float getCardElevation() {
    return c.c(this.j);
  }
  
  public int getContentPaddingBottom() {
    return this.h.bottom;
  }
  
  public int getContentPaddingLeft() {
    return this.h.left;
  }
  
  public int getContentPaddingRight() {
    return this.h.right;
  }
  
  public int getContentPaddingTop() {
    return this.h.top;
  }
  
  public float getMaxCardElevation() {
    return c.g(this.j);
  }
  
  public boolean getPreventCornerOverlap() {
    return this.e;
  }
  
  public float getRadius() {
    return c.d(this.j);
  }
  
  public boolean getUseCompatPadding() {
    return this.d;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    e e1 = c;
    if (!(e1 instanceof b)) {
      int i = View.MeasureSpec.getMode(paramInt1);
      if (i == Integer.MIN_VALUE || i == 1073741824)
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(e1.l(this.j)), View.MeasureSpec.getSize(paramInt1)), i); 
      i = View.MeasureSpec.getMode(paramInt2);
      if (i == Integer.MIN_VALUE || i == 1073741824)
        paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(e1.k(this.j)), View.MeasureSpec.getSize(paramInt2)), i); 
      super.onMeasure(paramInt1, paramInt2);
    } else {
      super.onMeasure(paramInt1, paramInt2);
    } 
  }
  
  public void setCardBackgroundColor(int paramInt) {
    c.n(this.j, ColorStateList.valueOf(paramInt));
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList) {
    c.n(this.j, paramColorStateList);
  }
  
  public void setCardElevation(float paramFloat) {
    c.f(this.j, paramFloat);
  }
  
  public void setContentPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.h.set(paramInt1, paramInt2, paramInt3, paramInt4);
    c.i(this.j);
  }
  
  public void setMaxCardElevation(float paramFloat) {
    c.o(this.j, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt) {
    this.g = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt) {
    this.f = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean) {
    if (paramBoolean != this.e) {
      this.e = paramBoolean;
      c.m(this.j);
    } 
  }
  
  public void setRadius(float paramFloat) {
    c.b(this.j, paramFloat);
  }
  
  public void setUseCompatPadding(boolean paramBoolean) {
    if (this.d != paramBoolean) {
      this.d = paramBoolean;
      c.e(this.j);
    } 
  }
  
  class a implements d {
    private Drawable a;
    
    a(CardView this$0) {}
    
    public void a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.b.i.set(param1Int1, param1Int2, param1Int3, param1Int4);
      CardView cardView = this.b;
      Rect rect = cardView.h;
      CardView.e(cardView, param1Int1 + rect.left, param1Int2 + rect.top, param1Int3 + rect.right, param1Int4 + rect.bottom);
    }
    
    public void b(int param1Int1, int param1Int2) {
      CardView cardView = this.b;
      if (param1Int1 > cardView.f)
        CardView.f(cardView, param1Int1); 
      cardView = this.b;
      if (param1Int2 > cardView.g)
        CardView.g(cardView, param1Int2); 
    }
    
    public void c(Drawable param1Drawable) {
      this.a = param1Drawable;
      this.b.setBackgroundDrawable(param1Drawable);
    }
    
    public boolean d() {
      return this.b.getPreventCornerOverlap();
    }
    
    public boolean e() {
      return this.b.getUseCompatPadding();
    }
    
    public Drawable f() {
      return this.a;
    }
    
    public View g() {
      return (View)this.b;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/cardview/widget/CardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */