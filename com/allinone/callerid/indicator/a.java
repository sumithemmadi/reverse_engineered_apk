package com.allinone.callerid.indicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import c.f.a.i;
import java.util.ArrayList;
import java.util.List;

public class a extends BaseIndicatorController {
  float c;
  
  float d;
  
  float e;
  
  public List<c.f.a.a> a() {
    i i1 = i.G(new float[] { 1.0F, 0.3F, 1.0F });
    i1.I(1000L);
    i1.K(-1);
    i1.x(new a(this));
    i1.g();
    i i2 = i.G(new float[] { 1.0F, 0.6F, 1.0F });
    i2.I(1000L);
    i2.K(-1);
    i2.x(new b(this));
    i2.g();
    i i3 = i.G(new float[] { 0.0F, 180.0F, 360.0F });
    i3.I(1000L);
    i3.K(-1);
    i3.x(new c(this));
    i3.g();
    ArrayList<i> arrayList = new ArrayList();
    arrayList.add(i1);
    arrayList.add(i2);
    arrayList.add(i3);
    return (List)arrayList;
  }
  
  public void b(Canvas paramCanvas, Paint paramPaint) {
    float f1 = (e() / 2);
    float f2 = (c() / 2);
    paramCanvas.save();
    paramCanvas.translate(f1, f2);
    float f3 = this.c;
    paramCanvas.scale(f3, f3);
    paramPaint.setStyle(Paint.Style.FILL);
    paramCanvas.drawCircle(0.0F, 0.0F, f1 / 2.5F, paramPaint);
    paramCanvas.restore();
    paramCanvas.translate(f1, f2);
    f3 = this.d;
    paramCanvas.scale(f3, f3);
    paramCanvas.rotate(this.e);
    paramPaint.setStrokeWidth(3.0F);
    paramPaint.setStyle(Paint.Style.STROKE);
    for (byte b = 0; b < 2; b++) {
      (new float[2])[0] = 225.0F;
      (new float[2])[1] = 45.0F;
      paramCanvas.drawArc(new RectF(-f1 + 12.0F, -f2 + 12.0F, f1 - 12.0F, f2 - 12.0F), (new float[2])[b], 90.0F, false, paramPaint);
    } 
  }
  
  class a implements i.g {
    a(a this$0) {}
    
    public void a(i param1i) {
      this.a.c = ((Float)param1i.D()).floatValue();
      this.a.g();
    }
  }
  
  class b implements i.g {
    b(a this$0) {}
    
    public void a(i param1i) {
      this.a.d = ((Float)param1i.D()).floatValue();
      this.a.g();
    }
  }
  
  class c implements i.g {
    c(a this$0) {}
    
    public void a(i param1i) {
      this.a.e = ((Float)param1i.D()).floatValue();
      this.a.g();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/indicator/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */