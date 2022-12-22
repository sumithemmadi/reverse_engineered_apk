package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import b.h.k.w;

class a extends ImageView {
  private Animation.AnimationListener b;
  
  int c;
  
  a(Context paramContext, int paramInt) {
    super(paramContext);
    ShapeDrawable shapeDrawable;
    float f = (getContext().getResources().getDisplayMetrics()).density;
    int i = (int)(1.75F * f);
    int j = (int)(0.0F * f);
    this.c = (int)(3.5F * f);
    if (a()) {
      shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
      w.y0((View)this, f * 4.0F);
    } else {
      shapeDrawable = new ShapeDrawable((Shape)new a(this, this.c));
      setLayerType(1, shapeDrawable.getPaint());
      shapeDrawable.getPaint().setShadowLayer(this.c, j, i, 503316480);
      i = this.c;
      setPadding(i, i, i, i);
    } 
    shapeDrawable.getPaint().setColor(paramInt);
    w.u0((View)this, (Drawable)shapeDrawable);
  }
  
  private boolean a() {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void b(Animation.AnimationListener paramAnimationListener) {
    this.b = paramAnimationListener;
  }
  
  public void onAnimationEnd() {
    super.onAnimationEnd();
    Animation.AnimationListener animationListener = this.b;
    if (animationListener != null)
      animationListener.onAnimationEnd(getAnimation()); 
  }
  
  public void onAnimationStart() {
    super.onAnimationStart();
    Animation.AnimationListener animationListener = this.b;
    if (animationListener != null)
      animationListener.onAnimationStart(getAnimation()); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (!a())
      setMeasuredDimension(getMeasuredWidth() + this.c * 2, getMeasuredHeight() + this.c * 2); 
  }
  
  public void setBackgroundColor(int paramInt) {
    if (getBackground() instanceof ShapeDrawable)
      ((ShapeDrawable)getBackground()).getPaint().setColor(paramInt); 
  }
  
  private class a extends OvalShape {
    private RadialGradient b;
    
    private Paint c = new Paint();
    
    a(a this$0, int param1Int) {
      this$0.c = param1Int;
      a((int)rect().width());
    }
    
    private void a(int param1Int) {
      float f1 = (param1Int / 2);
      float f2 = this.d.c;
      Shader.TileMode tileMode = Shader.TileMode.CLAMP;
      RadialGradient radialGradient = new RadialGradient(f1, f1, f2, new int[] { 1023410176, 0 }, null, tileMode);
      this.b = radialGradient;
      this.c.setShader((Shader)radialGradient);
    }
    
    public void draw(Canvas param1Canvas, Paint param1Paint) {
      int i = this.d.getWidth();
      int j = this.d.getHeight();
      i /= 2;
      float f1 = i;
      float f2 = (j / 2);
      param1Canvas.drawCircle(f1, f2, f1, this.c);
      param1Canvas.drawCircle(f1, f2, (i - this.d.c), param1Paint);
    }
    
    protected void onResize(float param1Float1, float param1Float2) {
      super.onResize(param1Float1, param1Float2);
      a((int)param1Float1);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/swiperefreshlayout/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */