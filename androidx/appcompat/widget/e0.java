package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.d.f;
import b.a.k.a.a;

public class e0 {
  private final Context a;
  
  private final TypedArray b;
  
  private TypedValue c;
  
  private e0(Context paramContext, TypedArray paramTypedArray) {
    this.a = paramContext;
    this.b = paramTypedArray;
  }
  
  public static e0 t(Context paramContext, int paramInt, int[] paramArrayOfint) {
    return new e0(paramContext, paramContext.obtainStyledAttributes(paramInt, paramArrayOfint));
  }
  
  public static e0 u(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint) {
    return new e0(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint));
  }
  
  public static e0 v(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfint, int paramInt1, int paramInt2) {
    return new e0(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfint, paramInt1, paramInt2));
  }
  
  public boolean a(int paramInt, boolean paramBoolean) {
    return this.b.getBoolean(paramInt, paramBoolean);
  }
  
  public int b(int paramInt1, int paramInt2) {
    return this.b.getColor(paramInt1, paramInt2);
  }
  
  public ColorStateList c(int paramInt) {
    if (this.b.hasValue(paramInt)) {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0) {
        ColorStateList colorStateList = a.c(this.a, i);
        if (colorStateList != null)
          return colorStateList; 
      } 
    } 
    return this.b.getColorStateList(paramInt);
  }
  
  public float d(int paramInt, float paramFloat) {
    return this.b.getDimension(paramInt, paramFloat);
  }
  
  public int e(int paramInt1, int paramInt2) {
    return this.b.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public int f(int paramInt1, int paramInt2) {
    return this.b.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public Drawable g(int paramInt) {
    if (this.b.hasValue(paramInt)) {
      int i = this.b.getResourceId(paramInt, 0);
      if (i != 0)
        return a.d(this.a, i); 
    } 
    return this.b.getDrawable(paramInt);
  }
  
  public Drawable h(int paramInt) {
    if (this.b.hasValue(paramInt)) {
      paramInt = this.b.getResourceId(paramInt, 0);
      if (paramInt != 0)
        return f.b().d(this.a, paramInt, true); 
    } 
    return null;
  }
  
  public float i(int paramInt, float paramFloat) {
    return this.b.getFloat(paramInt, paramFloat);
  }
  
  public Typeface j(int paramInt1, int paramInt2, f.a parama) {
    paramInt1 = this.b.getResourceId(paramInt1, 0);
    if (paramInt1 == 0)
      return null; 
    if (this.c == null)
      this.c = new TypedValue(); 
    return f.c(this.a, paramInt1, this.c, paramInt2, parama);
  }
  
  public int k(int paramInt1, int paramInt2) {
    return this.b.getInt(paramInt1, paramInt2);
  }
  
  public int l(int paramInt1, int paramInt2) {
    return this.b.getInteger(paramInt1, paramInt2);
  }
  
  public int m(int paramInt1, int paramInt2) {
    return this.b.getLayoutDimension(paramInt1, paramInt2);
  }
  
  public int n(int paramInt1, int paramInt2) {
    return this.b.getResourceId(paramInt1, paramInt2);
  }
  
  public String o(int paramInt) {
    return this.b.getString(paramInt);
  }
  
  public CharSequence p(int paramInt) {
    return this.b.getText(paramInt);
  }
  
  public CharSequence[] q(int paramInt) {
    return this.b.getTextArray(paramInt);
  }
  
  public TypedArray r() {
    return this.b;
  }
  
  public boolean s(int paramInt) {
    return this.b.hasValue(paramInt);
  }
  
  public void w() {
    this.b.recycle();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */