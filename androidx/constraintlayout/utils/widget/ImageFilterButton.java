package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.e;

public class ImageFilterButton extends AppCompatImageButton {
  private ImageFilterView.c d = new ImageFilterView.c();
  
  private float e = 0.0F;
  
  private float f = 0.0F;
  
  private float g = Float.NaN;
  
  private Path h;
  
  ViewOutlineProvider i;
  
  RectF j;
  
  Drawable[] k;
  
  LayerDrawable l;
  
  private boolean m = true;
  
  public ImageFilterButton(Context paramContext) {
    super(paramContext);
    c(paramContext, null);
  }
  
  public ImageFilterButton(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    c(paramContext, paramAttributeSet);
  }
  
  public ImageFilterButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    c(paramContext, paramAttributeSet);
  }
  
  private void c(Context paramContext, AttributeSet paramAttributeSet) {
    setPadding(0, 0, 0, 0);
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, e.ImageFilterView);
      int i = typedArray.getIndexCount();
      Drawable drawable = typedArray.getDrawable(e.ImageFilterView_altSrc);
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == e.ImageFilterView_crossfade) {
          this.e = typedArray.getFloat(j, 0.0F);
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
          setOverlay(typedArray.getBoolean(j, this.m));
        } 
      } 
      typedArray.recycle();
      if (drawable != null) {
        Drawable[] arrayOfDrawable = new Drawable[2];
        this.k = arrayOfDrawable;
        arrayOfDrawable[0] = getDrawable();
        this.k[1] = drawable;
        LayerDrawable layerDrawable = new LayerDrawable(this.k);
        this.l = layerDrawable;
        layerDrawable.getDrawable(1).setAlpha((int)(this.e * 255.0F));
        setImageDrawable((Drawable)this.l);
      } 
    } 
  }
  
  private void setOverlay(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public void draw(Canvas paramCanvas) {
    boolean bool;
    if (Build.VERSION.SDK_INT < 21 && this.g != 0.0F && this.h != null) {
      bool = true;
      paramCanvas.save();
      paramCanvas.clipPath(this.h);
    } else {
      bool = false;
    } 
    super.draw(paramCanvas);
    if (bool)
      paramCanvas.restore(); 
  }
  
  public float getContrast() {
    return this.d.f;
  }
  
  public float getCrossfade() {
    return this.e;
  }
  
  public float getRound() {
    return this.g;
  }
  
  public float getRoundPercent() {
    return this.f;
  }
  
  public float getSaturation() {
    return this.d.e;
  }
  
  public float getWarmth() {
    return this.d.g;
  }
  
  public void setBrightness(float paramFloat) {
    ImageFilterView.c c1 = this.d;
    c1.d = paramFloat;
    c1.c((ImageView)this);
  }
  
  public void setContrast(float paramFloat) {
    ImageFilterView.c c1 = this.d;
    c1.f = paramFloat;
    c1.c((ImageView)this);
  }
  
  public void setCrossfade(float paramFloat) {
    this.e = paramFloat;
    if (this.k != null) {
      if (!this.m)
        this.l.getDrawable(0).setAlpha((int)((1.0F - this.e) * 255.0F)); 
      this.l.getDrawable(1).setAlpha((int)(this.e * 255.0F));
      setImageDrawable((Drawable)this.l);
    } 
  }
  
  public void setRound(float paramFloat) {
    boolean bool;
    if (Float.isNaN(paramFloat)) {
      this.g = paramFloat;
      paramFloat = this.f;
      this.f = -1.0F;
      setRoundPercent(paramFloat);
      return;
    } 
    if (this.g != paramFloat) {
      bool = true;
    } else {
      bool = false;
    } 
    this.g = paramFloat;
    if (paramFloat != 0.0F) {
      if (this.h == null)
        this.h = new Path(); 
      if (this.j == null)
        this.j = new RectF(); 
      if (Build.VERSION.SDK_INT >= 21) {
        if (this.i == null) {
          b b = new b(this);
          this.i = b;
          setOutlineProvider(b);
        } 
        setClipToOutline(true);
      } 
      int i = getWidth();
      int j = getHeight();
      this.j.set(0.0F, 0.0F, i, j);
      this.h.reset();
      Path path = this.h;
      RectF rectF = this.j;
      paramFloat = this.g;
      path.addRoundRect(rectF, paramFloat, paramFloat, Path.Direction.CW);
    } else if (Build.VERSION.SDK_INT >= 21) {
      setClipToOutline(false);
    } 
    if (bool && Build.VERSION.SDK_INT >= 21)
      invalidateOutline(); 
  }
  
  public void setRoundPercent(float paramFloat) {
    boolean bool;
    if (this.f != paramFloat) {
      bool = true;
    } else {
      bool = false;
    } 
    this.f = paramFloat;
    if (paramFloat != 0.0F) {
      if (this.h == null)
        this.h = new Path(); 
      if (this.j == null)
        this.j = new RectF(); 
      if (Build.VERSION.SDK_INT >= 21) {
        if (this.i == null) {
          a a = new a(this);
          this.i = a;
          setOutlineProvider(a);
        } 
        setClipToOutline(true);
      } 
      int i = getWidth();
      int j = getHeight();
      paramFloat = Math.min(i, j) * this.f / 2.0F;
      this.j.set(0.0F, 0.0F, i, j);
      this.h.reset();
      this.h.addRoundRect(this.j, paramFloat, paramFloat, Path.Direction.CW);
    } else if (Build.VERSION.SDK_INT >= 21) {
      setClipToOutline(false);
    } 
    if (bool && Build.VERSION.SDK_INT >= 21)
      invalidateOutline(); 
  }
  
  public void setSaturation(float paramFloat) {
    ImageFilterView.c c1 = this.d;
    c1.e = paramFloat;
    c1.c((ImageView)this);
  }
  
  public void setWarmth(float paramFloat) {
    ImageFilterView.c c1 = this.d;
    c1.g = paramFloat;
    c1.c((ImageView)this);
  }
  
  class a extends ViewOutlineProvider {
    a(ImageFilterButton this$0) {}
    
    public void getOutline(View param1View, Outline param1Outline) {
      int i = this.a.getWidth();
      int j = this.a.getHeight();
      param1Outline.setRoundRect(0, 0, i, j, Math.min(i, j) * ImageFilterButton.a(this.a) / 2.0F);
    }
  }
  
  class b extends ViewOutlineProvider {
    b(ImageFilterButton this$0) {}
    
    public void getOutline(View param1View, Outline param1Outline) {
      param1Outline.setRoundRect(0, 0, this.a.getWidth(), this.a.getHeight(), ImageFilterButton.b(this.a));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/utils/widget/ImageFilterButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */