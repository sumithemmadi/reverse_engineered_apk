package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.e;
import androidx.constraintlayout.solver.widgets.g;
import androidx.constraintlayout.solver.widgets.h;
import androidx.constraintlayout.solver.widgets.j;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.e;

public class Flow extends VirtualLayout {
  private e m;
  
  public Flow(Context paramContext) {
    super(paramContext);
  }
  
  public Flow(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public Flow(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void n(AttributeSet paramAttributeSet) {
    super.n(paramAttributeSet);
    this.m = new e();
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, e.ConstraintLayout_Layout);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == e.ConstraintLayout_Layout_android_orientation) {
          this.m.o2(typedArray.getInt(j, 0));
        } else if (j == e.ConstraintLayout_Layout_android_padding) {
          this.m.u1(typedArray.getDimensionPixelSize(j, 0));
        } else if (j == e.ConstraintLayout_Layout_android_paddingStart) {
          if (Build.VERSION.SDK_INT >= 17)
            this.m.z1(typedArray.getDimensionPixelSize(j, 0)); 
        } else if (j == e.ConstraintLayout_Layout_android_paddingEnd) {
          if (Build.VERSION.SDK_INT >= 17)
            this.m.w1(typedArray.getDimensionPixelSize(j, 0)); 
        } else if (j == e.ConstraintLayout_Layout_android_paddingLeft) {
          this.m.x1(typedArray.getDimensionPixelSize(j, 0));
        } else if (j == e.ConstraintLayout_Layout_android_paddingTop) {
          this.m.A1(typedArray.getDimensionPixelSize(j, 0));
        } else if (j == e.ConstraintLayout_Layout_android_paddingRight) {
          this.m.y1(typedArray.getDimensionPixelSize(j, 0));
        } else if (j == e.ConstraintLayout_Layout_android_paddingBottom) {
          this.m.v1(typedArray.getDimensionPixelSize(j, 0));
        } else if (j == e.ConstraintLayout_Layout_flow_wrapMode) {
          this.m.t2(typedArray.getInt(j, 0));
        } else if (j == e.ConstraintLayout_Layout_flow_horizontalStyle) {
          this.m.i2(typedArray.getInt(j, 0));
        } else if (j == e.ConstraintLayout_Layout_flow_verticalStyle) {
          this.m.s2(typedArray.getInt(j, 0));
        } else if (j == e.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
          this.m.c2(typedArray.getInt(j, 0));
        } else if (j == e.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
          this.m.k2(typedArray.getInt(j, 0));
        } else if (j == e.ConstraintLayout_Layout_flow_firstVerticalStyle) {
          this.m.e2(typedArray.getInt(j, 0));
        } else if (j == e.ConstraintLayout_Layout_flow_lastVerticalStyle) {
          this.m.m2(typedArray.getInt(j, 0));
        } else if (j == e.ConstraintLayout_Layout_flow_horizontalBias) {
          this.m.g2(typedArray.getFloat(j, 0.5F));
        } else if (j == e.ConstraintLayout_Layout_flow_firstHorizontalBias) {
          this.m.b2(typedArray.getFloat(j, 0.5F));
        } else if (j == e.ConstraintLayout_Layout_flow_lastHorizontalBias) {
          this.m.j2(typedArray.getFloat(j, 0.5F));
        } else if (j == e.ConstraintLayout_Layout_flow_firstVerticalBias) {
          this.m.d2(typedArray.getFloat(j, 0.5F));
        } else if (j == e.ConstraintLayout_Layout_flow_lastVerticalBias) {
          this.m.l2(typedArray.getFloat(j, 0.5F));
        } else if (j == e.ConstraintLayout_Layout_flow_verticalBias) {
          this.m.q2(typedArray.getFloat(j, 0.5F));
        } else if (j == e.ConstraintLayout_Layout_flow_horizontalAlign) {
          this.m.f2(typedArray.getInt(j, 2));
        } else if (j == e.ConstraintLayout_Layout_flow_verticalAlign) {
          this.m.p2(typedArray.getInt(j, 2));
        } else if (j == e.ConstraintLayout_Layout_flow_horizontalGap) {
          this.m.h2(typedArray.getDimensionPixelSize(j, 0));
        } else if (j == e.ConstraintLayout_Layout_flow_verticalGap) {
          this.m.r2(typedArray.getDimensionPixelSize(j, 0));
        } else if (j == e.ConstraintLayout_Layout_flow_maxElementsWrap) {
          this.m.n2(typedArray.getInt(j, -1));
        } 
      } 
      typedArray.recycle();
    } 
    ((ConstraintHelper)this).e = (g)this.m;
    v();
  }
  
  public void o(b.a parama, h paramh, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray) {
    super.o(parama, paramh, paramLayoutParams, paramSparseArray);
    if (paramh instanceof e) {
      e e1 = (e)paramh;
      int i = paramLayoutParams.S;
      if (i != -1)
        e1.o2(i); 
    } 
  }
  
  @SuppressLint({"WrongCall"})
  protected void onMeasure(int paramInt1, int paramInt2) {
    w((j)this.m, paramInt1, paramInt2);
  }
  
  public void p(ConstraintWidget paramConstraintWidget, boolean paramBoolean) {
    this.m.g1(paramBoolean);
  }
  
  public void setFirstHorizontalBias(float paramFloat) {
    this.m.b2(paramFloat);
    requestLayout();
  }
  
  public void setFirstHorizontalStyle(int paramInt) {
    this.m.c2(paramInt);
    requestLayout();
  }
  
  public void setFirstVerticalBias(float paramFloat) {
    this.m.d2(paramFloat);
    requestLayout();
  }
  
  public void setFirstVerticalStyle(int paramInt) {
    this.m.e2(paramInt);
    requestLayout();
  }
  
  public void setHorizontalAlign(int paramInt) {
    this.m.f2(paramInt);
    requestLayout();
  }
  
  public void setHorizontalBias(float paramFloat) {
    this.m.g2(paramFloat);
    requestLayout();
  }
  
  public void setHorizontalGap(int paramInt) {
    this.m.h2(paramInt);
    requestLayout();
  }
  
  public void setHorizontalStyle(int paramInt) {
    this.m.i2(paramInt);
    requestLayout();
  }
  
  public void setMaxElementsWrap(int paramInt) {
    this.m.n2(paramInt);
    requestLayout();
  }
  
  public void setOrientation(int paramInt) {
    this.m.o2(paramInt);
    requestLayout();
  }
  
  public void setPadding(int paramInt) {
    this.m.u1(paramInt);
    requestLayout();
  }
  
  public void setPaddingBottom(int paramInt) {
    this.m.v1(paramInt);
    requestLayout();
  }
  
  public void setPaddingLeft(int paramInt) {
    this.m.x1(paramInt);
    requestLayout();
  }
  
  public void setPaddingRight(int paramInt) {
    this.m.y1(paramInt);
    requestLayout();
  }
  
  public void setPaddingTop(int paramInt) {
    this.m.A1(paramInt);
    requestLayout();
  }
  
  public void setVerticalAlign(int paramInt) {
    this.m.p2(paramInt);
    requestLayout();
  }
  
  public void setVerticalBias(float paramFloat) {
    this.m.q2(paramFloat);
    requestLayout();
  }
  
  public void setVerticalGap(int paramInt) {
    this.m.r2(paramInt);
    requestLayout();
  }
  
  public void setVerticalStyle(int paramInt) {
    this.m.s2(paramInt);
    requestLayout();
  }
  
  public void setWrapMode(int paramInt) {
    this.m.t2(paramInt);
    requestLayout();
  }
  
  public void w(j paramj, int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (paramj != null) {
      paramj.o1(i, paramInt1, k, paramInt2);
      setMeasuredDimension(paramj.j1(), paramj.i1());
    } else {
      setMeasuredDimension(0, 0);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/helper/widget/Flow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */