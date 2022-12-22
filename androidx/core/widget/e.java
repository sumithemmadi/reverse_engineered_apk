package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

public class e {
  public static ColorStateList a(ImageView paramImageView) {
    if (Build.VERSION.SDK_INT >= 21)
      return paramImageView.getImageTintList(); 
    if (paramImageView instanceof m) {
      ColorStateList colorStateList = ((m)paramImageView).getSupportImageTintList();
    } else {
      paramImageView = null;
    } 
    return (ColorStateList)paramImageView;
  }
  
  public static PorterDuff.Mode b(ImageView paramImageView) {
    if (Build.VERSION.SDK_INT >= 21)
      return paramImageView.getImageTintMode(); 
    if (paramImageView instanceof m) {
      PorterDuff.Mode mode = ((m)paramImageView).getSupportImageTintMode();
    } else {
      paramImageView = null;
    } 
    return (PorterDuff.Mode)paramImageView;
  }
  
  public static void c(ImageView paramImageView, ColorStateList paramColorStateList) {
    Drawable drawable;
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      paramImageView.setImageTintList(paramColorStateList);
      if (i == 21) {
        drawable = paramImageView.getDrawable();
        if (drawable != null && paramImageView.getImageTintList() != null) {
          if (drawable.isStateful())
            drawable.setState(paramImageView.getDrawableState()); 
          paramImageView.setImageDrawable(drawable);
        } 
      } 
    } else if (paramImageView instanceof m) {
      ((m)paramImageView).setSupportImageTintList((ColorStateList)drawable);
    } 
  }
  
  public static void d(ImageView paramImageView, PorterDuff.Mode paramMode) {
    Drawable drawable;
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      paramImageView.setImageTintMode(paramMode);
      if (i == 21) {
        drawable = paramImageView.getDrawable();
        if (drawable != null && paramImageView.getImageTintList() != null) {
          if (drawable.isStateful())
            drawable.setState(paramImageView.getDrawableState()); 
          paramImageView.setImageDrawable(drawable);
        } 
      } 
    } else if (paramImageView instanceof m) {
      ((m)paramImageView).setSupportImageTintMode((PorterDuff.Mode)drawable);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */