package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

class e {
  private final CompoundButton a;
  
  private ColorStateList b = null;
  
  private PorterDuff.Mode c = null;
  
  private boolean d = false;
  
  private boolean e = false;
  
  private boolean f;
  
  e(CompoundButton paramCompoundButton) {
    this.a = paramCompoundButton;
  }
  
  void a() {
    Drawable drawable = c.a(this.a);
    if (drawable != null && (this.d || this.e)) {
      drawable = a.r(drawable).mutate();
      if (this.d)
        a.o(drawable, this.b); 
      if (this.e)
        a.p(drawable, this.c); 
      if (drawable.isStateful())
        drawable.setState(this.a.getDrawableState()); 
      this.a.setButtonDrawable(drawable);
    } 
  }
  
  int b(int paramInt) {
    int i = paramInt;
    if (Build.VERSION.SDK_INT < 17) {
      Drawable drawable = c.a(this.a);
      i = paramInt;
      if (drawable != null)
        i = paramInt + drawable.getIntrinsicWidth(); 
    } 
    return i;
  }
  
  ColorStateList c() {
    return this.b;
  }
  
  PorterDuff.Mode d() {
    return this.c;
  }
  
  void e(AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/widget/CompoundButton;
    //   4: invokevirtual getContext : ()Landroid/content/Context;
    //   7: astore_3
    //   8: getstatic b/a/j.CompoundButton : [I
    //   11: astore #4
    //   13: aload_3
    //   14: aload_1
    //   15: aload #4
    //   17: iload_2
    //   18: iconst_0
    //   19: invokestatic v : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/e0;
    //   22: astore_3
    //   23: aload_0
    //   24: getfield a : Landroid/widget/CompoundButton;
    //   27: astore #5
    //   29: aload #5
    //   31: aload #5
    //   33: invokevirtual getContext : ()Landroid/content/Context;
    //   36: aload #4
    //   38: aload_1
    //   39: aload_3
    //   40: invokevirtual r : ()Landroid/content/res/TypedArray;
    //   43: iload_2
    //   44: iconst_0
    //   45: invokestatic p0 : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    //   48: getstatic b/a/j.CompoundButton_buttonCompat : I
    //   51: istore_2
    //   52: aload_3
    //   53: iload_2
    //   54: invokevirtual s : (I)Z
    //   57: ifeq -> 93
    //   60: aload_3
    //   61: iload_2
    //   62: iconst_0
    //   63: invokevirtual n : (II)I
    //   66: istore_2
    //   67: iload_2
    //   68: ifeq -> 93
    //   71: aload_0
    //   72: getfield a : Landroid/widget/CompoundButton;
    //   75: astore_1
    //   76: aload_1
    //   77: aload_1
    //   78: invokevirtual getContext : ()Landroid/content/Context;
    //   81: iload_2
    //   82: invokestatic d : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   85: invokevirtual setButtonDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   88: iconst_1
    //   89: istore_2
    //   90: goto -> 95
    //   93: iconst_0
    //   94: istore_2
    //   95: iload_2
    //   96: ifne -> 139
    //   99: getstatic b/a/j.CompoundButton_android_button : I
    //   102: istore_2
    //   103: aload_3
    //   104: iload_2
    //   105: invokevirtual s : (I)Z
    //   108: ifeq -> 139
    //   111: aload_3
    //   112: iload_2
    //   113: iconst_0
    //   114: invokevirtual n : (II)I
    //   117: istore_2
    //   118: iload_2
    //   119: ifeq -> 139
    //   122: aload_0
    //   123: getfield a : Landroid/widget/CompoundButton;
    //   126: astore_1
    //   127: aload_1
    //   128: aload_1
    //   129: invokevirtual getContext : ()Landroid/content/Context;
    //   132: iload_2
    //   133: invokestatic d : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   136: invokevirtual setButtonDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   139: getstatic b/a/j.CompoundButton_buttonTint : I
    //   142: istore_2
    //   143: aload_3
    //   144: iload_2
    //   145: invokevirtual s : (I)Z
    //   148: ifeq -> 163
    //   151: aload_0
    //   152: getfield a : Landroid/widget/CompoundButton;
    //   155: aload_3
    //   156: iload_2
    //   157: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   160: invokestatic c : (Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V
    //   163: getstatic b/a/j.CompoundButton_buttonTintMode : I
    //   166: istore_2
    //   167: aload_3
    //   168: iload_2
    //   169: invokevirtual s : (I)Z
    //   172: ifeq -> 192
    //   175: aload_0
    //   176: getfield a : Landroid/widget/CompoundButton;
    //   179: aload_3
    //   180: iload_2
    //   181: iconst_m1
    //   182: invokevirtual k : (II)I
    //   185: aconst_null
    //   186: invokestatic e : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   189: invokestatic d : (Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
    //   192: aload_3
    //   193: invokevirtual w : ()V
    //   196: return
    //   197: astore_1
    //   198: aload_3
    //   199: invokevirtual w : ()V
    //   202: aload_1
    //   203: athrow
    //   204: astore_1
    //   205: goto -> 93
    // Exception table:
    //   from	to	target	type
    //   48	67	197	finally
    //   71	88	204	android/content/res/Resources$NotFoundException
    //   71	88	197	finally
    //   99	118	197	finally
    //   122	139	197	finally
    //   139	163	197	finally
    //   163	192	197	finally
  }
  
  void f() {
    if (this.f) {
      this.f = false;
      return;
    } 
    this.f = true;
    a();
  }
  
  void g(ColorStateList paramColorStateList) {
    this.b = paramColorStateList;
    this.d = true;
    a();
  }
  
  void h(PorterDuff.Mode paramMode) {
    this.c = paramMode;
    this.e = true;
    a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */