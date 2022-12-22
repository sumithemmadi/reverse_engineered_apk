package com.allinone.callerid.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.allinone.callerid.R;
import java.util.ArrayList;
import java.util.List;

public class DiffuseView extends View {
  private int b;
  
  private int c = getResources().getColor(2131099675);
  
  private Bitmap d;
  
  private float e;
  
  private int f;
  
  private Integer g = Integer.valueOf(300);
  
  private int h;
  
  private boolean i = false;
  
  private List<Integer> j = new ArrayList<Integer>();
  
  private List<Integer> k = new ArrayList<Integer>();
  
  private Paint l;
  
  public DiffuseView(Context paramContext) {
    this(paramContext, null);
  }
  
  public DiffuseView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public DiffuseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.DiffuseView, paramInt, 0);
    this.b = typedArray.getColor(0, this.b);
    this.c = typedArray.getColor(1, this.c);
    this.e = typedArray.getFloat(3, this.e);
    this.f = typedArray.getInt(6, this.f);
    this.g = Integer.valueOf(typedArray.getInt(4, this.g.intValue()));
    this.h = typedArray.getInt(5, this.h);
    typedArray.recycle();
  }
  
  private void a() {
    Paint paint = new Paint();
    this.l = paint;
    paint.setAntiAlias(true);
    this.j.add(Integer.valueOf(220));
    this.k.add(Integer.valueOf(0));
  }
  
  public void invalidate() {
    if (hasWindowFocus())
      super.invalidate(); 
  }
  
  public void onDraw(Canvas paramCanvas) {
    this.l.setColor(this.b);
    byte b = 0;
    while (true) {
      int i = this.j.size();
      int j = 1;
      if (b < i) {
        Integer integer1 = this.j.get(b);
        this.l.setAlpha(integer1.intValue());
        Integer integer2 = this.k.get(b);
        paramCanvas.drawCircle((getWidth() / 2), (getHeight() / 2), this.e + integer2.intValue(), this.l);
        if (integer1.intValue() > 0 && integer2.intValue() < this.g.intValue()) {
          List<Integer> list1 = this.j;
          if (integer1.intValue() - this.h > 0)
            j = integer1.intValue() - this.h; 
          list1.set(b, Integer.valueOf(j));
          this.k.set(b, Integer.valueOf(integer2.intValue() + this.h));
        } 
        b++;
        continue;
      } 
      List<Integer> list = this.k;
      if (((Integer)list.get(list.size() - 1)).intValue() >= this.g.intValue() / this.f) {
        this.j.add(Integer.valueOf(220));
        this.k.add(Integer.valueOf(0));
      } 
      if (this.k.size() >= 20) {
        this.k.remove(0);
        this.j.remove(0);
      } 
      this.l.setColor(this.c);
      paramCanvas.drawCircle((getWidth() / 2), (getHeight() / 2), this.e, this.l);
      Bitmap bitmap = this.d;
      if (bitmap != null)
        paramCanvas.drawBitmap(bitmap, (getWidth() / 2 - this.d.getWidth() / 2), (getHeight() / 2 - this.d.getHeight() / 2), this.l); 
      if (this.i)
        invalidate(); 
      return;
    } 
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean)
      invalidate(); 
  }
  
  public void setColor(int paramInt) {
    this.b = paramInt;
  }
  
  public void setCoreColor(int paramInt) {
    this.c = paramInt;
  }
  
  public void setCoreImage(int paramInt) {
    this.d = BitmapFactory.decodeResource(getResources(), paramInt);
  }
  
  public void setCoreRadius(int paramInt) {
    this.e = paramInt;
  }
  
  public void setDiffuseSpeed(int paramInt) {
    this.h = paramInt;
  }
  
  public void setDiffuseWidth(int paramInt) {
    this.f = paramInt;
  }
  
  public void setMaxWidth(int paramInt) {
    this.g = Integer.valueOf(paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/DiffuseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */