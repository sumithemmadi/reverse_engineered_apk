package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import b.h.j.i;

public class b extends Drawable implements Animatable {
  private static final Interpolator b = (Interpolator)new LinearInterpolator();
  
  private static final Interpolator c = (Interpolator)new b.n.a.a.b();
  
  private static final int[] d = new int[] { -16777216 };
  
  private final c e;
  
  private float f;
  
  private Resources g;
  
  private Animator h;
  
  float i;
  
  boolean j;
  
  public b(Context paramContext) {
    this.g = ((Context)i.e(paramContext)).getResources();
    c c1 = new c();
    this.e = c1;
    c1.u(d);
    k(2.5F);
    m();
  }
  
  private void a(float paramFloat, c paramc) {
    n(paramFloat, paramc);
    float f = (float)(Math.floor((paramc.j() / 0.8F)) + 1.0D);
    paramc.y(paramc.k() + (paramc.i() - 0.01F - paramc.k()) * paramFloat);
    paramc.v(paramc.i());
    paramc.w(paramc.j() + (f - paramc.j()) * paramFloat);
  }
  
  private int c(float paramFloat, int paramInt1, int paramInt2) {
    int i = paramInt1 >> 24 & 0xFF;
    int j = paramInt1 >> 16 & 0xFF;
    int k = paramInt1 >> 8 & 0xFF;
    paramInt1 &= 0xFF;
    return i + (int)(((paramInt2 >> 24 & 0xFF) - i) * paramFloat) << 24 | j + (int)(((paramInt2 >> 16 & 0xFF) - j) * paramFloat) << 16 | k + (int)(((paramInt2 >> 8 & 0xFF) - k) * paramFloat) << 8 | paramInt1 + (int)(paramFloat * ((paramInt2 & 0xFF) - paramInt1));
  }
  
  private void h(float paramFloat) {
    this.f = paramFloat;
  }
  
  private void i(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    c c1 = this.e;
    float f = (this.g.getDisplayMetrics()).density;
    c1.z(paramFloat2 * f);
    c1.q(paramFloat1 * f);
    c1.t(0);
    c1.o(paramFloat3 * f, paramFloat4 * f);
  }
  
  private void m() {
    c c1 = this.e;
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    valueAnimator.addUpdateListener(new a(this, c1));
    valueAnimator.setRepeatCount(-1);
    valueAnimator.setRepeatMode(1);
    valueAnimator.setInterpolator((TimeInterpolator)b);
    valueAnimator.addListener(new b(this, c1));
    this.h = (Animator)valueAnimator;
  }
  
  void b(float paramFloat, c paramc, boolean paramBoolean) {
    if (this.j) {
      a(paramFloat, paramc);
    } else if (paramFloat != 1.0F || paramBoolean) {
      float f2;
      float f3;
      float f1 = paramc.j();
      if (paramFloat < 0.5F) {
        f2 = paramFloat / 0.5F;
        f3 = paramc.k();
        f2 = c.getInterpolation(f2) * 0.79F + 0.01F + f3;
      } else {
        f3 = (paramFloat - 0.5F) / 0.5F;
        f2 = paramc.k() + 0.79F;
        f3 = f2 - (1.0F - c.getInterpolation(f3)) * 0.79F + 0.01F;
      } 
      float f4 = this.i;
      paramc.y(f3);
      paramc.v(f2);
      paramc.w(f1 + 0.20999998F * paramFloat);
      h((paramFloat + f4) * 216.0F);
    } 
  }
  
  public void d(boolean paramBoolean) {
    this.e.x(paramBoolean);
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas) {
    Rect rect = getBounds();
    paramCanvas.save();
    paramCanvas.rotate(this.f, rect.exactCenterX(), rect.exactCenterY());
    this.e.a(paramCanvas, rect);
    paramCanvas.restore();
  }
  
  public void e(float paramFloat) {
    this.e.p(paramFloat);
    invalidateSelf();
  }
  
  public void f(int... paramVarArgs) {
    this.e.u(paramVarArgs);
    this.e.t(0);
    invalidateSelf();
  }
  
  public void g(float paramFloat) {
    this.e.w(paramFloat);
    invalidateSelf();
  }
  
  public int getAlpha() {
    return this.e.c();
  }
  
  public int getOpacity() {
    return -3;
  }
  
  public boolean isRunning() {
    return this.h.isRunning();
  }
  
  public void j(float paramFloat1, float paramFloat2) {
    this.e.y(paramFloat1);
    this.e.v(paramFloat2);
    invalidateSelf();
  }
  
  public void k(float paramFloat) {
    this.e.z(paramFloat);
    invalidateSelf();
  }
  
  public void l(int paramInt) {
    if (paramInt == 0) {
      i(11.0F, 3.0F, 12.0F, 6.0F);
    } else {
      i(7.5F, 2.5F, 10.0F, 5.0F);
    } 
    invalidateSelf();
  }
  
  void n(float paramFloat, c paramc) {
    if (paramFloat > 0.75F) {
      paramc.r(c((paramFloat - 0.75F) / 0.25F, paramc.h(), paramc.e()));
    } else {
      paramc.r(paramc.h());
    } 
  }
  
  public void setAlpha(int paramInt) {
    this.e.n(paramInt);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.e.s(paramColorFilter);
    invalidateSelf();
  }
  
  public void start() {
    this.h.cancel();
    this.e.A();
    if (this.e.d() != this.e.g()) {
      this.j = true;
      this.h.setDuration(666L);
      this.h.start();
    } else {
      this.e.t(0);
      this.e.m();
      this.h.setDuration(1332L);
      this.h.start();
    } 
  }
  
  public void stop() {
    this.h.cancel();
    h(0.0F);
    this.e.x(false);
    this.e.t(0);
    this.e.m();
    invalidateSelf();
  }
  
  class a implements ValueAnimator.AnimatorUpdateListener {
    a(b this$0, b.c param1c) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      float f = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
      this.b.n(f, this.a);
      this.b.b(f, this.a, false);
      this.b.invalidateSelf();
    }
  }
  
  class b implements Animator.AnimatorListener {
    b(b this$0, b.c param1c) {}
    
    public void onAnimationCancel(Animator param1Animator) {}
    
    public void onAnimationEnd(Animator param1Animator) {}
    
    public void onAnimationRepeat(Animator param1Animator) {
      this.b.b(1.0F, this.a, true);
      this.a.A();
      this.a.l();
      b b1 = this.b;
      if (b1.j) {
        b1.j = false;
        param1Animator.cancel();
        param1Animator.setDuration(1332L);
        param1Animator.start();
        this.a.x(false);
      } else {
        b1.i++;
      } 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.b.i = 0.0F;
    }
  }
  
  private static class c {
    final RectF a = new RectF();
    
    final Paint b;
    
    final Paint c;
    
    final Paint d;
    
    float e;
    
    float f;
    
    float g;
    
    float h;
    
    int[] i;
    
    int j;
    
    float k;
    
    float l;
    
    float m;
    
    boolean n;
    
    Path o;
    
    float p;
    
    float q;
    
    int r;
    
    int s;
    
    int t;
    
    int u;
    
    c() {
      Paint paint1 = new Paint();
      this.b = paint1;
      Paint paint2 = new Paint();
      this.c = paint2;
      Paint paint3 = new Paint();
      this.d = paint3;
      this.e = 0.0F;
      this.f = 0.0F;
      this.g = 0.0F;
      this.h = 5.0F;
      this.p = 1.0F;
      this.t = 255;
      paint1.setStrokeCap(Paint.Cap.SQUARE);
      paint1.setAntiAlias(true);
      paint1.setStyle(Paint.Style.STROKE);
      paint2.setStyle(Paint.Style.FILL);
      paint2.setAntiAlias(true);
      paint3.setColor(0);
    }
    
    void A() {
      this.k = this.e;
      this.l = this.f;
      this.m = this.g;
    }
    
    void a(Canvas param1Canvas, Rect param1Rect) {
      RectF rectF = this.a;
      float f1 = this.q;
      float f2 = this.h / 2.0F + f1;
      if (f1 <= 0.0F)
        f2 = Math.min(param1Rect.width(), param1Rect.height()) / 2.0F - Math.max(this.r * this.p / 2.0F, this.h / 2.0F); 
      rectF.set(param1Rect.centerX() - f2, param1Rect.centerY() - f2, param1Rect.centerX() + f2, param1Rect.centerY() + f2);
      f2 = this.e;
      f1 = this.g;
      f2 = (f2 + f1) * 360.0F;
      f1 = (this.f + f1) * 360.0F - f2;
      this.b.setColor(this.u);
      this.b.setAlpha(this.t);
      float f3 = this.h / 2.0F;
      rectF.inset(f3, f3);
      param1Canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0F, this.d);
      f3 = -f3;
      rectF.inset(f3, f3);
      param1Canvas.drawArc(rectF, f2, f1, false, this.b);
      b(param1Canvas, f2, f1, rectF);
    }
    
    void b(Canvas param1Canvas, float param1Float1, float param1Float2, RectF param1RectF) {
      if (this.n) {
        Path path = this.o;
        if (path == null) {
          path = new Path();
          this.o = path;
          path.setFillType(Path.FillType.EVEN_ODD);
        } else {
          path.reset();
        } 
        float f1 = Math.min(param1RectF.width(), param1RectF.height()) / 2.0F;
        float f2 = this.r * this.p / 2.0F;
        this.o.moveTo(0.0F, 0.0F);
        this.o.lineTo(this.r * this.p, 0.0F);
        path = this.o;
        float f3 = this.r;
        float f4 = this.p;
        path.lineTo(f3 * f4 / 2.0F, this.s * f4);
        this.o.offset(f1 + param1RectF.centerX() - f2, param1RectF.centerY() + this.h / 2.0F);
        this.o.close();
        this.c.setColor(this.u);
        this.c.setAlpha(this.t);
        param1Canvas.save();
        param1Canvas.rotate(param1Float1 + param1Float2, param1RectF.centerX(), param1RectF.centerY());
        param1Canvas.drawPath(this.o, this.c);
        param1Canvas.restore();
      } 
    }
    
    int c() {
      return this.t;
    }
    
    float d() {
      return this.f;
    }
    
    int e() {
      return this.i[f()];
    }
    
    int f() {
      return (this.j + 1) % this.i.length;
    }
    
    float g() {
      return this.e;
    }
    
    int h() {
      return this.i[this.j];
    }
    
    float i() {
      return this.l;
    }
    
    float j() {
      return this.m;
    }
    
    float k() {
      return this.k;
    }
    
    void l() {
      t(f());
    }
    
    void m() {
      this.k = 0.0F;
      this.l = 0.0F;
      this.m = 0.0F;
      y(0.0F);
      v(0.0F);
      w(0.0F);
    }
    
    void n(int param1Int) {
      this.t = param1Int;
    }
    
    void o(float param1Float1, float param1Float2) {
      this.r = (int)param1Float1;
      this.s = (int)param1Float2;
    }
    
    void p(float param1Float) {
      if (param1Float != this.p)
        this.p = param1Float; 
    }
    
    void q(float param1Float) {
      this.q = param1Float;
    }
    
    void r(int param1Int) {
      this.u = param1Int;
    }
    
    void s(ColorFilter param1ColorFilter) {
      this.b.setColorFilter(param1ColorFilter);
    }
    
    void t(int param1Int) {
      this.j = param1Int;
      this.u = this.i[param1Int];
    }
    
    void u(int[] param1ArrayOfint) {
      this.i = param1ArrayOfint;
      t(0);
    }
    
    void v(float param1Float) {
      this.f = param1Float;
    }
    
    void w(float param1Float) {
      this.g = param1Float;
    }
    
    void x(boolean param1Boolean) {
      if (this.n != param1Boolean)
        this.n = param1Boolean; 
    }
    
    void y(float param1Float) {
      this.e = param1Float;
    }
    
    void z(float param1Float) {
      this.h = param1Float;
      this.b.setStrokeWidth(param1Float);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/swiperefreshlayout/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */