package com.bumptech.glide.load.j.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import b.t.a.a.b;
import com.bumptech.glide.load.h;
import com.bumptech.glide.p.j;
import java.nio.ByteBuffer;
import java.util.List;

public class c extends Drawable implements g.b, Animatable {
  private final a b;
  
  private boolean c;
  
  private boolean d;
  
  private boolean e;
  
  private boolean f = true;
  
  private int g;
  
  private int h = -1;
  
  private boolean i;
  
  private Paint j;
  
  private Rect k;
  
  private List<b> l;
  
  public c(Context paramContext, com.bumptech.glide.l.a parama, h<Bitmap> paramh, int paramInt1, int paramInt2, Bitmap paramBitmap) {
    this(new a(new g(com.bumptech.glide.c.c(paramContext), parama, paramInt1, paramInt2, paramh, paramBitmap)));
  }
  
  c(a parama) {
    this.b = (a)j.d(parama);
  }
  
  private Drawable.Callback b() {
    Drawable.Callback callback;
    for (callback = getCallback(); callback instanceof Drawable; callback = ((Drawable)callback).getCallback());
    return callback;
  }
  
  private Rect d() {
    if (this.k == null)
      this.k = new Rect(); 
    return this.k;
  }
  
  private Paint h() {
    if (this.j == null)
      this.j = new Paint(2); 
    return this.j;
  }
  
  private void j() {
    List<b> list = this.l;
    if (list != null) {
      byte b1 = 0;
      int i = list.size();
      while (b1 < i) {
        ((b)this.l.get(b1)).a(this);
        b1++;
      } 
    } 
  }
  
  private void l() {
    this.g = 0;
  }
  
  private void n() {
    j.a(this.e ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
    if (this.b.a.f() == 1) {
      invalidateSelf();
    } else if (!this.c) {
      this.c = true;
      this.b.a.r(this);
      invalidateSelf();
    } 
  }
  
  private void o() {
    this.c = false;
    this.b.a.s(this);
  }
  
  public void a() {
    if (b() == null) {
      stop();
      invalidateSelf();
      return;
    } 
    invalidateSelf();
    if (g() == f() - 1)
      this.g++; 
    int i = this.h;
    if (i != -1 && this.g >= i) {
      j();
      stop();
    } 
  }
  
  public ByteBuffer c() {
    return this.b.a.b();
  }
  
  public void draw(Canvas paramCanvas) {
    if (this.e)
      return; 
    if (this.i) {
      Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
      this.i = false;
    } 
    paramCanvas.drawBitmap(this.b.a.c(), null, d(), h());
  }
  
  public Bitmap e() {
    return this.b.a.e();
  }
  
  public int f() {
    return this.b.a.f();
  }
  
  public int g() {
    return this.b.a.d();
  }
  
  public Drawable.ConstantState getConstantState() {
    return this.b;
  }
  
  public int getIntrinsicHeight() {
    return this.b.a.h();
  }
  
  public int getIntrinsicWidth() {
    return this.b.a.k();
  }
  
  public int getOpacity() {
    return -2;
  }
  
  public int i() {
    return this.b.a.j();
  }
  
  public boolean isRunning() {
    return this.c;
  }
  
  public void k() {
    this.e = true;
    this.b.a.a();
  }
  
  public void m(h<Bitmap> paramh, Bitmap paramBitmap) {
    this.b.a.o(paramh, paramBitmap);
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    this.i = true;
  }
  
  public void setAlpha(int paramInt) {
    h().setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    h().setColorFilter(paramColorFilter);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    j.a(this.e ^ true, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
    this.f = paramBoolean1;
    if (!paramBoolean1) {
      o();
    } else if (this.d) {
      n();
    } 
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start() {
    this.d = true;
    l();
    if (this.f)
      n(); 
  }
  
  public void stop() {
    this.d = false;
    o();
  }
  
  static final class a extends Drawable.ConstantState {
    final g a;
    
    a(g param1g) {
      this.a = param1g;
    }
    
    public int getChangingConfigurations() {
      return 0;
    }
    
    public Drawable newDrawable() {
      return new c(this);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return newDrawable();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */