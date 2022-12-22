package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.c;

class i {
  private static final int[] a = new int[] { 16843067, 16843068 };
  
  private final ProgressBar b;
  
  private Bitmap c;
  
  i(ProgressBar paramProgressBar) {
    this.b = paramProgressBar;
  }
  
  private Shape a() {
    return (Shape)new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null);
  }
  
  private Drawable d(Drawable paramDrawable, boolean paramBoolean) {
    ClipDrawable clipDrawable;
    if (paramDrawable instanceof c) {
      c c = (c)paramDrawable;
      Drawable drawable = c.b();
      if (drawable != null)
        c.a(d(drawable, paramBoolean)); 
    } else {
      LayerDrawable layerDrawable;
      if (paramDrawable instanceof LayerDrawable) {
        layerDrawable = (LayerDrawable)paramDrawable;
        int j = layerDrawable.getNumberOfLayers();
        Drawable[] arrayOfDrawable = new Drawable[j];
        boolean bool = false;
        byte b;
        for (b = 0; b < j; b++) {
          int k = layerDrawable.getId(b);
          Drawable drawable = layerDrawable.getDrawable(b);
          if (k == 16908301 || k == 16908303) {
            paramBoolean = true;
          } else {
            paramBoolean = false;
          } 
          arrayOfDrawable[b] = d(drawable, paramBoolean);
        } 
        LayerDrawable layerDrawable1 = new LayerDrawable(arrayOfDrawable);
        for (b = bool; b < j; b++)
          layerDrawable1.setId(b, layerDrawable.getId(b)); 
        return (Drawable)layerDrawable1;
      } 
      if (layerDrawable instanceof BitmapDrawable) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable)layerDrawable;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (this.c == null)
          this.c = bitmap; 
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(a());
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        shapeDrawable2.getPaint().setShader((Shader)bitmapShader);
        shapeDrawable2.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
        ShapeDrawable shapeDrawable1 = shapeDrawable2;
        if (paramBoolean)
          clipDrawable = new ClipDrawable((Drawable)shapeDrawable2, 3, 1); 
        return (Drawable)clipDrawable;
      } 
    } 
    return (Drawable)clipDrawable;
  }
  
  private Drawable e(Drawable paramDrawable) {
    AnimationDrawable animationDrawable;
    Drawable drawable = paramDrawable;
    if (paramDrawable instanceof AnimationDrawable) {
      AnimationDrawable animationDrawable1 = (AnimationDrawable)paramDrawable;
      int j = animationDrawable1.getNumberOfFrames();
      animationDrawable = new AnimationDrawable();
      animationDrawable.setOneShot(animationDrawable1.isOneShot());
      for (byte b = 0; b < j; b++) {
        paramDrawable = d(animationDrawable1.getFrame(b), true);
        paramDrawable.setLevel(10000);
        animationDrawable.addFrame(paramDrawable, animationDrawable1.getDuration(b));
      } 
      animationDrawable.setLevel(10000);
    } 
    return (Drawable)animationDrawable;
  }
  
  Bitmap b() {
    return this.c;
  }
  
  void c(AttributeSet paramAttributeSet, int paramInt) {
    e0 e0 = e0.v(this.b.getContext(), paramAttributeSet, a, paramInt, 0);
    Drawable drawable = e0.h(0);
    if (drawable != null)
      this.b.setIndeterminateDrawable(e(drawable)); 
    drawable = e0.h(1);
    if (drawable != null)
      this.b.setProgressDrawable(d(drawable, false)); 
    e0.w();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */