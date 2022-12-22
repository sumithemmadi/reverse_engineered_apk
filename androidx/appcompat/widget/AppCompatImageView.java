package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.m;
import b.h.k.v;

public class AppCompatImageView extends ImageView implements v, m {
  private final d b;
  
  private final h c;
  
  public AppCompatImageView(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatImageView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AppCompatImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(b0.b(paramContext), paramAttributeSet, paramInt);
    z.a((View)this, getContext());
    d d1 = new d((View)this);
    this.b = d1;
    d1.e(paramAttributeSet, paramInt);
    h h1 = new h(this);
    this.c = h1;
    h1.f(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    d d1 = this.b;
    if (d1 != null)
      d1.b(); 
    h h1 = this.c;
    if (h1 != null)
      h1.b(); 
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    d d1 = this.b;
    if (d1 != null) {
      ColorStateList colorStateList = d1.c();
    } else {
      d1 = null;
    } 
    return (ColorStateList)d1;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    d d1 = this.b;
    if (d1 != null) {
      PorterDuff.Mode mode = d1.d();
    } else {
      d1 = null;
    } 
    return (PorterDuff.Mode)d1;
  }
  
  public ColorStateList getSupportImageTintList() {
    h h1 = this.c;
    if (h1 != null) {
      ColorStateList colorStateList = h1.c();
    } else {
      h1 = null;
    } 
    return (ColorStateList)h1;
  }
  
  public PorterDuff.Mode getSupportImageTintMode() {
    h h1 = this.c;
    if (h1 != null) {
      PorterDuff.Mode mode = h1.d();
    } else {
      h1 = null;
    } 
    return (PorterDuff.Mode)h1;
  }
  
  public boolean hasOverlappingRendering() {
    boolean bool;
    if (this.c.e() && super.hasOverlappingRendering()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    d d1 = this.b;
    if (d1 != null)
      d1.f(paramDrawable); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    d d1 = this.b;
    if (d1 != null)
      d1.g(paramInt); 
  }
  
  public void setImageBitmap(Bitmap paramBitmap) {
    super.setImageBitmap(paramBitmap);
    h h1 = this.c;
    if (h1 != null)
      h1.b(); 
  }
  
  public void setImageDrawable(Drawable paramDrawable) {
    super.setImageDrawable(paramDrawable);
    h h1 = this.c;
    if (h1 != null)
      h1.b(); 
  }
  
  public void setImageResource(int paramInt) {
    h h1 = this.c;
    if (h1 != null)
      h1.g(paramInt); 
  }
  
  public void setImageURI(Uri paramUri) {
    super.setImageURI(paramUri);
    h h1 = this.c;
    if (h1 != null)
      h1.b(); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    d d1 = this.b;
    if (d1 != null)
      d1.i(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    d d1 = this.b;
    if (d1 != null)
      d1.j(paramMode); 
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList) {
    h h1 = this.c;
    if (h1 != null)
      h1.h(paramColorStateList); 
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode) {
    h h1 = this.c;
    if (h1 != null)
      h1.i(paramMode); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */