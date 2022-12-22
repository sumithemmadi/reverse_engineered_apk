package com.allinone.callerid.customview;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DrawFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.allinone.callerid.R;

public class b {
  private float A;
  
  private int B;
  
  private int C;
  
  private float D;
  
  private float E;
  
  private int F;
  
  private int G;
  
  private int H = -1;
  
  private PaintFlagsDrawFilter I = new PaintFlagsDrawFilter(0, 3);
  
  private int J = 0;
  
  private boolean K = true;
  
  private View L;
  
  private a M;
  
  private boolean N = false;
  
  private final int a = 0;
  
  private final int b = 1;
  
  private final int c = 2;
  
  private final int d = 3;
  
  private final int e = 4;
  
  private int f = 0;
  
  private final int g = 0;
  
  private final int h = 1;
  
  private final int i = 2;
  
  private int j = 0;
  
  private int k = 125;
  
  private final int l = 200;
  
  private final int m = 10;
  
  private Drawable n;
  
  private int o = 0;
  
  private int p = 0;
  
  private int q = 15;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private Path u = new Path();
  
  private Paint v = new Paint();
  
  private Paint w = new Paint();
  
  private float x;
  
  private float y;
  
  private float z;
  
  @SuppressLint({"NewApi"})
  public b(View paramView, AttributeSet paramAttributeSet) {
    this.M = (a)paramView;
    this.L = paramView;
    paramView.setClickable(true);
    p(0);
    this.B = 20;
    this.C = this.k / 10;
    if (Build.VERSION.SDK_INT >= 11)
      paramView.setLayerType(1, null); 
    paramView.setWillNotDraw(false);
    if (paramAttributeSet != null) {
      TypedArray typedArray = paramView.getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.LButtonStyle);
      this.K = typedArray.getBoolean(2, true);
      this.H = typedArray.getInt(0, -1);
      Drawable drawable = typedArray.getDrawable(1);
      this.n = drawable;
      if (drawable != null) {
        this.F = drawable.getIntrinsicWidth();
        this.G = this.n.getIntrinsicHeight();
      } 
      this.J = typedArray.getInt(3, 0);
      typedArray.recycle();
    } 
  }
  
  private int b() {
    View view = this.L;
    return (view == null) ? 0 : view.getHeight();
  }
  
  private int d() {
    View view = this.L;
    return (view == null) ? 0 : view.getWidth();
  }
  
  private void e() {
    float f1 = this.L.getWidth();
    float f2 = this.L.getHeight();
    if (f1 > 0.0F && f2 > 0.0F) {
      if (Math.min(f1, f2) / Math.max(f1, f2) > 0.8F) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i) {
        this.j = 0;
      } else if (f1 > f2) {
        this.j = 1;
      } else {
        this.j = 2;
      } 
      int i = this.J;
      if (i != 0) {
        if (i != 1 && i != 2) {
          if (i == 3) {
            this.z = Math.min(f1, f2) / 4.0F;
            this.A = Math.max(f1, f2) / 2.0F;
            if (this.H == -1)
              this.H = 822083583; 
          } 
        } else {
          this.z = f2 / 2.0F;
          this.A = f1;
          if (this.H == -1)
            this.H = 822083583; 
        } 
      } else {
        this.z = Math.min(f1, f2) / 4.0F;
        if (this.j == 0) {
          this.A = Math.min(f1, f2) / 2.0F;
        } else {
          this.A = Math.max(f1, f2) / 2.0F;
        } 
        if (this.H == -1)
          this.H = 805306368; 
      } 
      f1 = this.A;
      f2 = this.z;
      this.x = (f1 - f2) / this.B;
      this.y = (f1 - f2) / this.C;
      f();
    } 
  }
  
  private void f() {
    this.v.setColor(Color.rgb(Color.red(this.H), Color.green(this.H), Color.blue(this.H)));
    this.q = Color.alpha(this.H);
    this.w.setColor(Color.rgb(Color.red(this.H), Color.green(this.H), Color.blue(this.H)));
    this.w.setAlpha(this.q);
    this.v.setAlpha(0);
    int i = this.q;
    int j = i / this.B;
    this.r = j;
    i /= this.C;
    this.s = i;
    if (j < 1)
      this.r = 1; 
    if (i < 1)
      this.s = 1; 
    this.t = this.s;
  }
  
  private void g() {
    int i = this.f;
    if (i != 0 && i != 3) {
      if (i == 2) {
        this.p += this.r;
        this.z += this.x;
      } else if (i == 1) {
        this.p += this.s;
        this.z += this.y;
      } else if (i == 4) {
        this.p -= this.t;
        this.z = this.A;
      } 
      int j = this.p;
      i = this.q;
      if (j >= i)
        this.p = i; 
      if (this.p < 0)
        this.p = 0; 
      this.v.setAlpha(this.p);
      float f1 = this.z;
      float f2 = this.A;
      if (f1 > f2)
        this.z = f2; 
      i = this.p;
      if (i <= 0 || i >= this.q)
        m(); 
      this.L.invalidate();
    } 
  }
  
  private void m() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : I
    //   4: istore_1
    //   5: iload_1
    //   6: iconst_1
    //   7: if_icmpeq -> 101
    //   10: iload_1
    //   11: iconst_2
    //   12: if_icmpeq -> 69
    //   15: iload_1
    //   16: iconst_3
    //   17: if_icmpeq -> 101
    //   20: iload_1
    //   21: iconst_4
    //   22: if_icmpeq -> 28
    //   25: goto -> 114
    //   28: aload_0
    //   29: getfield K : Z
    //   32: ifeq -> 62
    //   35: aload_0
    //   36: getfield N : Z
    //   39: ifeq -> 62
    //   42: aload_0
    //   43: getfield M : Lcom/allinone/callerid/customview/a;
    //   46: astore_2
    //   47: aload_2
    //   48: ifnull -> 57
    //   51: aload_2
    //   52: invokeinterface a : ()V
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield N : Z
    //   62: aload_0
    //   63: invokevirtual n : ()V
    //   66: goto -> 114
    //   69: aload_0
    //   70: iconst_3
    //   71: putfield f : I
    //   74: aload_0
    //   75: getfield J : I
    //   78: istore_1
    //   79: iload_1
    //   80: iconst_1
    //   81: if_icmpeq -> 89
    //   84: iload_1
    //   85: iconst_2
    //   86: if_icmpne -> 114
    //   89: aload_0
    //   90: aload_0
    //   91: invokespecial d : ()I
    //   94: i2f
    //   95: putfield z : F
    //   98: goto -> 114
    //   101: aload_0
    //   102: aload_0
    //   103: getfield A : F
    //   106: putfield z : F
    //   109: aload_0
    //   110: iconst_4
    //   111: putfield f : I
    //   114: aload_0
    //   115: getfield L : Landroid/view/View;
    //   118: invokevirtual invalidate : ()V
    //   121: return
  }
  
  public void a(Canvas paramCanvas) {
    if (this.z == 0.0F || this.A == 0.0F)
      e(); 
    paramCanvas.setDrawFilter((DrawFilter)this.I);
    paramCanvas.save();
    Drawable drawable = this.n;
    if (drawable != null) {
      drawable.setBounds(0, 0, d(), b());
      this.n.draw(paramCanvas);
    } else {
      int j = this.o;
      if (j != 0)
        paramCanvas.drawColor(j); 
    } 
    int i = this.f;
    if (i != 1 && i != 2) {
      if (i != 3) {
        if (i == 4) {
          i = this.J;
          if (i != 0) {
            if (i != 1) {
              if (i != 2) {
                if (i == 3)
                  paramCanvas.drawCircle((d() / 2), (b() / 2), this.z, this.v); 
              } else {
                paramCanvas.drawCircle(d(), (b() / 2), this.z, this.v);
              } 
            } else {
              paramCanvas.drawCircle(0.0F, (b() / 2), this.z, this.v);
            } 
          } else if (this.j == 0) {
            paramCanvas.drawCircle((d() / 2), (b() / 2), this.z, this.v);
          } else {
            paramCanvas.drawPaint(this.v);
          } 
        } 
      } else {
        i = this.J;
        if (i != 0) {
          if (i != 1) {
            if (i != 2) {
              if (i == 3)
                paramCanvas.drawCircle((d() / 2), (b() / 2), (Math.max(d(), b()) / 2), this.v); 
            } else {
              paramCanvas.drawCircle(d(), (b() / 2), d(), this.v);
            } 
          } else {
            paramCanvas.drawCircle(0.0F, (b() / 2), d(), this.v);
          } 
        } else if (this.j == 0) {
          paramCanvas.drawCircle((d() / 2), (b() / 2), (Math.min(d(), b()) / 2), this.v);
        } else {
          paramCanvas.drawPaint(this.v);
        } 
      } 
    } else {
      i = this.J;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i == 3) {
              this.u.reset();
              this.u.addCircle((d() / 2), (b() / 2), this.z, Path.Direction.CCW);
              paramCanvas.drawPath(this.u, this.w);
              if (Build.VERSION.SDK_INT >= 26) {
                paramCanvas.clipPath(this.u);
              } else {
                paramCanvas.clipPath(this.u, Region.Op.XOR);
              } 
              paramCanvas.drawCircle((d() / 2), (b() / 2), this.A, this.v);
            } 
          } else {
            this.u.reset();
            this.u.addCircle(d(), (b() / 2), this.z, Path.Direction.CCW);
            paramCanvas.drawPath(this.u, this.w);
            if (Build.VERSION.SDK_INT >= 26) {
              paramCanvas.clipPath(this.u);
            } else {
              paramCanvas.clipPath(this.u, Region.Op.XOR);
            } 
            paramCanvas.drawCircle(d(), (b() / 2), this.A, this.v);
          } 
        } else {
          this.u.reset();
          this.u.addCircle(0.0F, (b() / 2), this.z, Path.Direction.CCW);
          paramCanvas.drawPath(this.u, this.w);
          if (Build.VERSION.SDK_INT >= 26) {
            paramCanvas.clipPath(this.u);
          } else {
            paramCanvas.clipPath(this.u, Region.Op.XOR);
          } 
          paramCanvas.drawCircle(0.0F, (b() / 2), this.A, this.v);
        } 
      } else {
        this.u.reset();
        this.u.addCircle(this.D, this.E, this.z, Path.Direction.CCW);
        paramCanvas.drawPath(this.u, this.w);
        if (Build.VERSION.SDK_INT >= 26) {
          paramCanvas.clipPath(this.u);
        } else {
          paramCanvas.clipPath(this.u, Region.Op.XOR);
        } 
        if (this.j == 0) {
          paramCanvas.drawCircle((d() / 2), (b() / 2), this.A, this.v);
        } else {
          paramCanvas.drawPaint(this.v);
        } 
      } 
    } 
    paramCanvas.restore();
    g();
  }
  
  public int[] c(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i != 1073741824)
      if (i == Integer.MIN_VALUE) {
        paramInt1 = Math.min(this.F, paramInt1);
      } else {
        paramInt1 = this.F;
      }  
    if (j != 1073741824)
      if (j == Integer.MIN_VALUE) {
        paramInt2 = Math.min(this.G, paramInt2);
      } else {
        paramInt2 = this.G;
      }  
    return new int[] { paramInt1, paramInt2 };
  }
  
  public boolean h() {
    boolean bool;
    if (this.F > 0 && this.G > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void i(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i != 1) {
        if (i != 3 && i != 4) {
          this.L.invalidate();
          return;
        } 
        if (this.f == 2)
          this.f = 1; 
      } 
      i = this.f;
      if (i == 3) {
        m();
      } else if (i == 2) {
        this.f = 1;
      } 
    } else {
      if (this.f != 0)
        n(); 
      this.D = paramMotionEvent.getX();
      this.E = paramMotionEvent.getY();
      i = this.j;
      if (i != 0) {
        if (i != 1) {
          if (i == 2)
            this.D = (d() / 2); 
        } else {
          this.E = (b() / 2);
        } 
      } else {
        this.D = (d() / 2);
        this.E = (b() / 2);
      } 
      this.f = 2;
    } 
    this.L.invalidate();
  }
  
  public void j(View paramView, int paramInt) {
    if (paramInt != 0)
      n(); 
  }
  
  public void k(boolean paramBoolean) {
    if (!paramBoolean)
      n(); 
  }
  
  public void l() {
    if (this.f != 4)
      this.f = 1; 
    if (!this.K) {
      a a1 = this.M;
      if (a1 != null)
        a1.a(); 
    } else if (this.f == 3) {
      a a1 = this.M;
      if (a1 != null)
        a1.a(); 
    } else {
      this.N = true;
    } 
  }
  
  public void n() {
    this.f = 0;
    this.N = false;
    this.z = (b() / 4);
    this.p = 0;
  }
  
  public void o(Drawable paramDrawable) {
    this.n = paramDrawable;
    this.o = 0;
    if (paramDrawable != null) {
      this.F = paramDrawable.getIntrinsicWidth();
      this.G = this.n.getIntrinsicHeight();
    } 
    this.L.requestLayout();
    this.L.invalidate();
  }
  
  public void p(int paramInt) {
    this.n = null;
    this.o = paramInt;
  }
  
  public void q(int paramInt) {
    this.H = paramInt;
    f();
  }
  
  public void r(boolean paramBoolean) {
    this.K = paramBoolean;
  }
  
  public void s(int paramInt) {
    this.J = paramInt;
    e();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */