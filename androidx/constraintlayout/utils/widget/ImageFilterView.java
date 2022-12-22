package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.e;

public class ImageFilterView extends AppCompatImageView {
  private c d = new c();
  
  private boolean e = true;
  
  private float f = 0.0F;
  
  private float g = 0.0F;
  
  private float h = Float.NaN;
  
  private Path i;
  
  ViewOutlineProvider j;
  
  RectF k;
  
  Drawable[] l;
  
  LayerDrawable m;
  
  public ImageFilterView(Context paramContext) {
    super(paramContext);
    e(paramContext, null);
  }
  
  public ImageFilterView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    e(paramContext, paramAttributeSet);
  }
  
  public ImageFilterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    e(paramContext, paramAttributeSet);
  }
  
  private void e(Context paramContext, AttributeSet paramAttributeSet) {
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, e.ImageFilterView);
      int i = typedArray.getIndexCount();
      Drawable drawable = typedArray.getDrawable(e.ImageFilterView_altSrc);
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == e.ImageFilterView_crossfade) {
          this.f = typedArray.getFloat(j, 0.0F);
        } else if (j == e.ImageFilterView_warmth) {
          setWarmth(typedArray.getFloat(j, 0.0F));
        } else if (j == e.ImageFilterView_saturation) {
          setSaturation(typedArray.getFloat(j, 0.0F));
        } else if (j == e.ImageFilterView_contrast) {
          setContrast(typedArray.getFloat(j, 0.0F));
        } else if (j == e.ImageFilterView_round) {
          if (Build.VERSION.SDK_INT >= 21)
            setRound(typedArray.getDimension(j, 0.0F)); 
        } else if (j == e.ImageFilterView_roundPercent) {
          if (Build.VERSION.SDK_INT >= 21)
            setRoundPercent(typedArray.getFloat(j, 0.0F)); 
        } else if (j == e.ImageFilterView_overlay) {
          setOverlay(typedArray.getBoolean(j, this.e));
        } 
      } 
      typedArray.recycle();
      if (drawable != null) {
        Drawable[] arrayOfDrawable = new Drawable[2];
        this.l = arrayOfDrawable;
        arrayOfDrawable[0] = getDrawable();
        this.l[1] = drawable;
        LayerDrawable layerDrawable = new LayerDrawable(this.l);
        this.m = layerDrawable;
        layerDrawable.getDrawable(1).setAlpha((int)(this.f * 255.0F));
        setImageDrawable((Drawable)this.m);
      } 
    } 
  }
  
  private void setOverlay(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public void draw(Canvas paramCanvas) {
    boolean bool;
    if (Build.VERSION.SDK_INT < 21 && this.g != 0.0F && this.i != null) {
      bool = true;
      paramCanvas.save();
      paramCanvas.clipPath(this.i);
    } else {
      bool = false;
    } 
    super.draw(paramCanvas);
    if (bool)
      paramCanvas.restore(); 
  }
  
  public float getBrightness() {
    return this.d.d;
  }
  
  public float getContrast() {
    return this.d.f;
  }
  
  public float getCrossfade() {
    return this.f;
  }
  
  public float getRound() {
    return this.h;
  }
  
  public float getRoundPercent() {
    return this.g;
  }
  
  public float getSaturation() {
    return this.d.e;
  }
  
  public float getWarmth() {
    return this.d.g;
  }
  
  public void setBrightness(float paramFloat) {
    c c1 = this.d;
    c1.d = paramFloat;
    c1.c((ImageView)this);
  }
  
  public void setContrast(float paramFloat) {
    c c1 = this.d;
    c1.f = paramFloat;
    c1.c((ImageView)this);
  }
  
  public void setCrossfade(float paramFloat) {
    this.f = paramFloat;
    if (this.l != null) {
      if (!this.e)
        this.m.getDrawable(0).setAlpha((int)((1.0F - this.f) * 255.0F)); 
      this.m.getDrawable(1).setAlpha((int)(this.f * 255.0F));
      setImageDrawable((Drawable)this.m);
    } 
  }
  
  public void setRound(float paramFloat) {
    boolean bool;
    if (Float.isNaN(paramFloat)) {
      this.h = paramFloat;
      paramFloat = this.g;
      this.g = -1.0F;
      setRoundPercent(paramFloat);
      return;
    } 
    if (this.h != paramFloat) {
      bool = true;
    } else {
      bool = false;
    } 
    this.h = paramFloat;
    if (paramFloat != 0.0F) {
      if (this.i == null)
        this.i = new Path(); 
      if (this.k == null)
        this.k = new RectF(); 
      if (Build.VERSION.SDK_INT >= 21) {
        if (this.j == null) {
          b b = new b(this);
          this.j = b;
          setOutlineProvider(b);
        } 
        setClipToOutline(true);
      } 
      int i = getWidth();
      int j = getHeight();
      this.k.set(0.0F, 0.0F, i, j);
      this.i.reset();
      Path path = this.i;
      RectF rectF = this.k;
      paramFloat = this.h;
      path.addRoundRect(rectF, paramFloat, paramFloat, Path.Direction.CW);
    } else if (Build.VERSION.SDK_INT >= 21) {
      setClipToOutline(false);
    } 
    if (bool && Build.VERSION.SDK_INT >= 21)
      invalidateOutline(); 
  }
  
  public void setRoundPercent(float paramFloat) {
    boolean bool;
    if (this.g != paramFloat) {
      bool = true;
    } else {
      bool = false;
    } 
    this.g = paramFloat;
    if (paramFloat != 0.0F) {
      if (this.i == null)
        this.i = new Path(); 
      if (this.k == null)
        this.k = new RectF(); 
      if (Build.VERSION.SDK_INT >= 21) {
        if (this.j == null) {
          a a = new a(this);
          this.j = a;
          setOutlineProvider(a);
        } 
        setClipToOutline(true);
      } 
      int i = getWidth();
      int j = getHeight();
      paramFloat = Math.min(i, j) * this.g / 2.0F;
      this.k.set(0.0F, 0.0F, i, j);
      this.i.reset();
      this.i.addRoundRect(this.k, paramFloat, paramFloat, Path.Direction.CW);
    } else if (Build.VERSION.SDK_INT >= 21) {
      setClipToOutline(false);
    } 
    if (bool && Build.VERSION.SDK_INT >= 21)
      invalidateOutline(); 
  }
  
  public void setSaturation(float paramFloat) {
    c c1 = this.d;
    c1.e = paramFloat;
    c1.c((ImageView)this);
  }
  
  public void setWarmth(float paramFloat) {
    c c1 = this.d;
    c1.g = paramFloat;
    c1.c((ImageView)this);
  }
  
  class a extends ViewOutlineProvider {
    a(ImageFilterView this$0) {}
    
    public void getOutline(View param1View, Outline param1Outline) {
      int i = this.a.getWidth();
      int j = this.a.getHeight();
      param1Outline.setRoundRect(0, 0, i, j, Math.min(i, j) * ImageFilterView.c(this.a) / 2.0F);
    }
  }
  
  class b extends ViewOutlineProvider {
    b(ImageFilterView this$0) {}
    
    public void getOutline(View param1View, Outline param1Outline) {
      param1Outline.setRoundRect(0, 0, this.a.getWidth(), this.a.getHeight(), ImageFilterView.d(this.a));
    }
  }
  
  static class c {
    float[] a = new float[20];
    
    ColorMatrix b = new ColorMatrix();
    
    ColorMatrix c = new ColorMatrix();
    
    float d = 1.0F;
    
    float e = 1.0F;
    
    float f = 1.0F;
    
    float g = 1.0F;
    
    private void a(float param1Float) {
      float[] arrayOfFloat = this.a;
      arrayOfFloat[0] = param1Float;
      arrayOfFloat[1] = 0.0F;
      arrayOfFloat[2] = 0.0F;
      arrayOfFloat[3] = 0.0F;
      arrayOfFloat[4] = 0.0F;
      arrayOfFloat[5] = 0.0F;
      arrayOfFloat[6] = param1Float;
      arrayOfFloat[7] = 0.0F;
      arrayOfFloat[8] = 0.0F;
      arrayOfFloat[9] = 0.0F;
      arrayOfFloat[10] = 0.0F;
      arrayOfFloat[11] = 0.0F;
      arrayOfFloat[12] = param1Float;
      arrayOfFloat[13] = 0.0F;
      arrayOfFloat[14] = 0.0F;
      arrayOfFloat[15] = 0.0F;
      arrayOfFloat[16] = 0.0F;
      arrayOfFloat[17] = 0.0F;
      arrayOfFloat[18] = 1.0F;
      arrayOfFloat[19] = 0.0F;
    }
    
    private void b(float param1Float) {
      float f1 = 1.0F - param1Float;
      float f2 = 0.2999F * f1;
      float f3 = 0.587F * f1;
      f1 *= 0.114F;
      float[] arrayOfFloat = this.a;
      arrayOfFloat[0] = f2 + param1Float;
      arrayOfFloat[1] = f3;
      arrayOfFloat[2] = f1;
      arrayOfFloat[3] = 0.0F;
      arrayOfFloat[4] = 0.0F;
      arrayOfFloat[5] = f2;
      arrayOfFloat[6] = f3 + param1Float;
      arrayOfFloat[7] = f1;
      arrayOfFloat[8] = 0.0F;
      arrayOfFloat[9] = 0.0F;
      arrayOfFloat[10] = f2;
      arrayOfFloat[11] = f3;
      arrayOfFloat[12] = f1 + param1Float;
      arrayOfFloat[13] = 0.0F;
      arrayOfFloat[14] = 0.0F;
      arrayOfFloat[15] = 0.0F;
      arrayOfFloat[16] = 0.0F;
      arrayOfFloat[17] = 0.0F;
      arrayOfFloat[18] = 1.0F;
      arrayOfFloat[19] = 0.0F;
    }
    
    private void d(float param1Float) {
      float f1 = param1Float;
      if (param1Float <= 0.0F)
        f1 = 0.01F; 
      param1Float = 5000.0F / f1 / 100.0F;
      if (param1Float > 66.0F) {
        double d = (param1Float - 60.0F);
        f2 = (float)Math.pow(d, -0.13320475816726685D) * 329.69873F;
        f1 = (float)Math.pow(d, 0.07551484555006027D) * 288.12216F;
      } else {
        f1 = (float)Math.log(param1Float) * 99.4708F - 161.11957F;
        f2 = 255.0F;
      } 
      if (param1Float < 66.0F) {
        if (param1Float > 19.0F) {
          param1Float = (float)Math.log((param1Float - 10.0F)) * 138.51773F - 305.0448F;
        } else {
          param1Float = 0.0F;
        } 
      } else {
        param1Float = 255.0F;
      } 
      float f2 = Math.min(255.0F, Math.max(f2, 0.0F));
      f1 = Math.min(255.0F, Math.max(f1, 0.0F));
      param1Float = Math.min(255.0F, Math.max(param1Float, 0.0F));
      float f3 = (float)Math.log(50.0F);
      float f4 = (float)Math.log(40.0F);
      float f5 = Math.min(255.0F, Math.max(255.0F, 0.0F));
      f3 = Math.min(255.0F, Math.max(f3 * 99.4708F - 161.11957F, 0.0F));
      f4 = Math.min(255.0F, Math.max(f4 * 138.51773F - 305.0448F, 0.0F));
      f2 /= f5;
      f1 /= f3;
      param1Float /= f4;
      float[] arrayOfFloat = this.a;
      arrayOfFloat[0] = f2;
      arrayOfFloat[1] = 0.0F;
      arrayOfFloat[2] = 0.0F;
      arrayOfFloat[3] = 0.0F;
      arrayOfFloat[4] = 0.0F;
      arrayOfFloat[5] = 0.0F;
      arrayOfFloat[6] = f1;
      arrayOfFloat[7] = 0.0F;
      arrayOfFloat[8] = 0.0F;
      arrayOfFloat[9] = 0.0F;
      arrayOfFloat[10] = 0.0F;
      arrayOfFloat[11] = 0.0F;
      arrayOfFloat[12] = param1Float;
      arrayOfFloat[13] = 0.0F;
      arrayOfFloat[14] = 0.0F;
      arrayOfFloat[15] = 0.0F;
      arrayOfFloat[16] = 0.0F;
      arrayOfFloat[17] = 0.0F;
      arrayOfFloat[18] = 1.0F;
      arrayOfFloat[19] = 0.0F;
    }
    
    void c(ImageView param1ImageView) {
      boolean bool2;
      this.b.reset();
      float f = this.e;
      boolean bool1 = true;
      if (f != 1.0F) {
        b(f);
        this.b.set(this.a);
        bool2 = true;
      } else {
        bool2 = false;
      } 
      f = this.f;
      if (f != 1.0F) {
        this.c.setScale(f, f, f, 1.0F);
        this.b.postConcat(this.c);
        bool2 = true;
      } 
      f = this.g;
      if (f != 1.0F) {
        d(f);
        this.c.set(this.a);
        this.b.postConcat(this.c);
        bool2 = true;
      } 
      f = this.d;
      if (f != 1.0F) {
        a(f);
        this.c.set(this.a);
        this.b.postConcat(this.c);
        bool2 = bool1;
      } 
      if (bool2) {
        param1ImageView.setColorFilter((ColorFilter)new ColorMatrixColorFilter(this.b));
      } else {
        param1ImageView.clearColorFilter();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/utils/widget/ImageFilterView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */