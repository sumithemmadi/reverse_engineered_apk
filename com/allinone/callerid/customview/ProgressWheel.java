package com.allinone.callerid.customview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.allinone.callerid.R;

public class ProgressWheel extends View {
  private static final String b = ProgressWheel.class.getSimpleName();
  
  private boolean A;
  
  private final int c = 16;
  
  private final int d = 270;
  
  private final long e = 200L;
  
  private int f = 28;
  
  private int g = 4;
  
  private int h = 4;
  
  private boolean i = false;
  
  private double j = 0.0D;
  
  private double k = 460.0D;
  
  private float l = 0.0F;
  
  private boolean m = true;
  
  private long n = 0L;
  
  private int o = -1442840576;
  
  private int p = 16777215;
  
  private Paint q = new Paint();
  
  private Paint r = new Paint();
  
  private RectF s = new RectF();
  
  private float t = 230.0F;
  
  private long u = 0L;
  
  private boolean v;
  
  private float w = 0.0F;
  
  private float x = 0.0F;
  
  private boolean y = false;
  
  private b z;
  
  public ProgressWheel(Context paramContext) {
    super(paramContext);
    d();
  }
  
  public ProgressWheel(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ProgressWheel));
    d();
  }
  
  private void a(TypedArray paramTypedArray) {
    DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
    this.g = (int)TypedValue.applyDimension(1, this.g, displayMetrics);
    this.h = (int)TypedValue.applyDimension(1, this.h, displayMetrics);
    int i = (int)TypedValue.applyDimension(1, this.f, displayMetrics);
    this.f = i;
    this.f = (int)paramTypedArray.getDimension(3, i);
    this.i = paramTypedArray.getBoolean(4, false);
    this.g = (int)paramTypedArray.getDimension(2, this.g);
    this.h = (int)paramTypedArray.getDimension(8, this.h);
    this.t = paramTypedArray.getFloat(9, this.t / 360.0F) * 360.0F;
    this.k = paramTypedArray.getInt(1, (int)this.k);
    this.o = paramTypedArray.getColor(0, this.o);
    this.p = paramTypedArray.getColor(7, this.p);
    this.v = paramTypedArray.getBoolean(5, false);
    if (paramTypedArray.getBoolean(6, false))
      g(); 
    paramTypedArray.recycle();
  }
  
  private void b() {
    if (this.z != null) {
      float f = Math.round(this.w * 100.0F / 360.0F) / 100.0F;
      this.z.a(f);
    } 
  }
  
  private void c(float paramFloat) {
    b b1 = this.z;
    if (b1 != null)
      b1.a(paramFloat); 
  }
  
  @TargetApi(17)
  private void d() {
    float f;
    boolean bool;
    if (Build.VERSION.SDK_INT >= 17) {
      f = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0F);
    } else {
      f = Settings.System.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0F);
    } 
    if (f != 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    this.A = bool;
  }
  
  private void e(int paramInt1, int paramInt2) {
    int i = getPaddingTop();
    int j = getPaddingBottom();
    int k = getPaddingLeft();
    int m = getPaddingRight();
    if (!this.i) {
      int n = paramInt1 - k - m;
      paramInt1 = Math.min(Math.min(n, paramInt2 - j - i), this.f * 2 - this.g * 2);
      k = (n - paramInt1) / 2 + k;
      j = (paramInt2 - i - j - paramInt1) / 2 + i;
      paramInt2 = this.g;
      this.s = new RectF((k + paramInt2), (j + paramInt2), (k + paramInt1 - paramInt2), (j + paramInt1 - paramInt2));
    } else {
      int n = this.g;
      this.s = new RectF((k + n), (i + n), (paramInt1 - m - n), (paramInt2 - j - n));
    } 
  }
  
  private void f() {
    this.q.setColor(this.o);
    this.q.setAntiAlias(true);
    this.q.setStyle(Paint.Style.STROKE);
    this.q.setStrokeWidth(this.g);
    this.r.setColor(this.p);
    this.r.setAntiAlias(true);
    this.r.setStyle(Paint.Style.STROKE);
    this.r.setStrokeWidth(this.h);
  }
  
  private void h(long paramLong) {
    long l = this.n;
    if (l >= 200L) {
      double d1 = this.j;
      double d2 = paramLong;
      Double.isNaN(d2);
      d2 = d1 + d2;
      this.j = d2;
      d1 = this.k;
      if (d2 > d1) {
        this.j = d2 - d1;
        this.n = 0L;
        this.m ^= 0x1;
      } 
      float f = (float)Math.cos((this.j / d1 + 1.0D) * Math.PI) / 2.0F + 0.5F;
      if (this.m) {
        this.l = f * 254.0F;
      } else {
        f = (1.0F - f) * 254.0F;
        this.w += this.l - f;
        this.l = f;
      } 
    } else {
      this.n = l + paramLong;
    } 
  }
  
  public void g() {
    this.u = SystemClock.uptimeMillis();
    this.y = true;
    invalidate();
  }
  
  public int getBarColor() {
    return this.o;
  }
  
  public int getBarWidth() {
    return this.g;
  }
  
  public int getCircleRadius() {
    return this.f;
  }
  
  public float getProgress() {
    float f;
    if (this.y) {
      f = -1.0F;
    } else {
      f = this.w / 360.0F;
    } 
    return f;
  }
  
  public int getRimColor() {
    return this.p;
  }
  
  public int getRimWidth() {
    return this.h;
  }
  
  public float getSpinSpeed() {
    return this.t / 360.0F;
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    paramCanvas.drawArc(this.s, 360.0F, 360.0F, false, this.r);
    if (!this.A)
      return; 
    boolean bool = this.y;
    float f = 0.0F;
    boolean bool1 = true;
    boolean bool2 = true;
    if (bool) {
      long l = SystemClock.uptimeMillis() - this.u;
      float f1 = (float)l * this.t / 1000.0F;
      h(l);
      f1 = this.w + f1;
      this.w = f1;
      if (f1 > 360.0F) {
        this.w = f1 - 360.0F;
        c(-1.0F);
      } 
      this.u = SystemClock.uptimeMillis();
      f = this.w;
      f1 = this.l;
      if (isInEditMode()) {
        f = 0.0F;
        f1 = 135.0F;
      } else {
        f -= 90.0F;
        f1 += 16.0F;
      } 
      paramCanvas.drawArc(this.s, f, f1, false, this.q);
      bool2 = bool1;
    } else {
      float f2 = this.w;
      if (f2 != this.x) {
        float f4 = (float)(SystemClock.uptimeMillis() - this.u) / 1000.0F;
        float f5 = this.t;
        this.w = Math.min(this.w + f4 * f5, this.x);
        this.u = SystemClock.uptimeMillis();
      } else {
        bool2 = false;
      } 
      if (f2 != this.w)
        b(); 
      float f3 = this.w;
      float f1 = f3;
      if (!this.v) {
        f = (float)(1.0D - Math.pow((1.0F - f3 / 360.0F), 4.0F));
        f1 = (float)(1.0D - Math.pow((1.0F - this.w / 360.0F), 2.0F));
        f *= 360.0F;
        f1 *= 360.0F;
      } 
      if (isInEditMode())
        f1 = 360.0F; 
      paramCanvas.drawArc(this.s, f - 90.0F, f1, false, this.q);
    } 
    if (bool2)
      invalidate(); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    int i = this.f + getPaddingLeft() + getPaddingRight();
    int j = this.f + getPaddingTop() + getPaddingBottom();
    int k = View.MeasureSpec.getMode(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt1);
    int n = View.MeasureSpec.getMode(paramInt2);
    int i1 = View.MeasureSpec.getSize(paramInt2);
    if (k == 1073741824) {
      paramInt1 = m;
    } else {
      paramInt1 = i;
      if (k == Integer.MIN_VALUE)
        paramInt1 = Math.min(i, m); 
    } 
    if (n == 1073741824 || k == 1073741824) {
      paramInt2 = i1;
    } else {
      paramInt2 = j;
      if (n == Integer.MIN_VALUE)
        paramInt2 = Math.min(j, i1); 
    } 
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof WheelSavedState)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    WheelSavedState wheelSavedState = (WheelSavedState)paramParcelable;
    super.onRestoreInstanceState(wheelSavedState.getSuperState());
    this.w = wheelSavedState.b;
    this.x = wheelSavedState.c;
    this.y = wheelSavedState.d;
    this.t = wheelSavedState.e;
    this.g = wheelSavedState.f;
    this.o = wheelSavedState.g;
    this.h = wheelSavedState.h;
    this.p = wheelSavedState.i;
    this.f = wheelSavedState.j;
    this.v = wheelSavedState.k;
    this.i = wheelSavedState.l;
    this.u = SystemClock.uptimeMillis();
  }
  
  public Parcelable onSaveInstanceState() {
    WheelSavedState wheelSavedState = new WheelSavedState(super.onSaveInstanceState());
    wheelSavedState.b = this.w;
    wheelSavedState.c = this.x;
    wheelSavedState.d = this.y;
    wheelSavedState.e = this.t;
    wheelSavedState.f = this.g;
    wheelSavedState.g = this.o;
    wheelSavedState.h = this.h;
    wheelSavedState.i = this.p;
    wheelSavedState.j = this.f;
    wheelSavedState.k = this.v;
    wheelSavedState.l = this.i;
    return (Parcelable)wheelSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    e(paramInt1, paramInt2);
    f();
    invalidate();
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt) {
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt == 0)
      this.u = SystemClock.uptimeMillis(); 
  }
  
  public void setBarColor(int paramInt) {
    this.o = paramInt;
    f();
    if (!this.y)
      invalidate(); 
  }
  
  public void setBarWidth(int paramInt) {
    this.g = paramInt;
    if (!this.y)
      invalidate(); 
  }
  
  public void setCallback(b paramb) {
    this.z = paramb;
    if (!this.y)
      b(); 
  }
  
  public void setCircleRadius(int paramInt) {
    this.f = paramInt;
    if (!this.y)
      invalidate(); 
  }
  
  public void setInstantProgress(float paramFloat) {
    float f;
    if (this.y) {
      this.w = 0.0F;
      this.y = false;
    } 
    if (paramFloat > 1.0F) {
      f = paramFloat - 1.0F;
    } else {
      f = paramFloat;
      if (paramFloat < 0.0F)
        f = 0.0F; 
    } 
    if (f == this.x)
      return; 
    paramFloat = Math.min(f * 360.0F, 360.0F);
    this.x = paramFloat;
    this.w = paramFloat;
    this.u = SystemClock.uptimeMillis();
    invalidate();
  }
  
  public void setLinearProgress(boolean paramBoolean) {
    this.v = paramBoolean;
    if (!this.y)
      invalidate(); 
  }
  
  public void setProgress(float paramFloat) {
    float f;
    if (this.y) {
      this.w = 0.0F;
      this.y = false;
      b();
    } 
    if (paramFloat > 1.0F) {
      f = paramFloat - 1.0F;
    } else {
      f = paramFloat;
      if (paramFloat < 0.0F)
        f = 0.0F; 
    } 
    paramFloat = this.x;
    if (f == paramFloat)
      return; 
    if (this.w == paramFloat)
      this.u = SystemClock.uptimeMillis(); 
    this.x = Math.min(f * 360.0F, 360.0F);
    invalidate();
  }
  
  public void setRimColor(int paramInt) {
    this.p = paramInt;
    f();
    if (!this.y)
      invalidate(); 
  }
  
  public void setRimWidth(int paramInt) {
    this.h = paramInt;
    if (!this.y)
      invalidate(); 
  }
  
  public void setSpinSpeed(float paramFloat) {
    this.t = paramFloat * 360.0F;
  }
  
  static class WheelSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<WheelSavedState> CREATOR = new a();
    
    float b;
    
    float c;
    
    boolean d;
    
    float e;
    
    int f;
    
    int g;
    
    int h;
    
    int i;
    
    int j;
    
    boolean k;
    
    boolean l;
    
    private WheelSavedState(Parcel param1Parcel) {
      super(param1Parcel);
      boolean bool2;
      this.b = param1Parcel.readFloat();
      this.c = param1Parcel.readFloat();
      byte b = param1Parcel.readByte();
      boolean bool1 = true;
      if (b != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.d = bool2;
      this.e = param1Parcel.readFloat();
      this.f = param1Parcel.readInt();
      this.g = param1Parcel.readInt();
      this.h = param1Parcel.readInt();
      this.i = param1Parcel.readInt();
      this.j = param1Parcel.readInt();
      if (param1Parcel.readByte() != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      } 
      this.k = bool2;
      if (param1Parcel.readByte() != 0) {
        bool2 = bool1;
      } else {
        bool2 = false;
      } 
      this.l = bool2;
    }
    
    WheelSavedState(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeFloat(this.b);
      param1Parcel.writeFloat(this.c);
      param1Parcel.writeByte((byte)this.d);
      param1Parcel.writeFloat(this.e);
      param1Parcel.writeInt(this.f);
      param1Parcel.writeInt(this.g);
      param1Parcel.writeInt(this.h);
      param1Parcel.writeInt(this.i);
      param1Parcel.writeInt(this.j);
      param1Parcel.writeByte((byte)this.k);
      param1Parcel.writeByte((byte)this.l);
    }
    
    static final class a implements Parcelable.Creator<WheelSavedState> {
      public ProgressWheel.WheelSavedState a(Parcel param2Parcel) {
        return new ProgressWheel.WheelSavedState(param2Parcel, null);
      }
      
      public ProgressWheel.WheelSavedState[] b(int param2Int) {
        return new ProgressWheel.WheelSavedState[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<WheelSavedState> {
    public ProgressWheel.WheelSavedState a(Parcel param1Parcel) {
      return new ProgressWheel.WheelSavedState(param1Parcel, null);
    }
    
    public ProgressWheel.WheelSavedState[] b(int param1Int) {
      return new ProgressWheel.WheelSavedState[param1Int];
    }
  }
  
  public static interface b {
    void a(float param1Float);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/ProgressWheel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */