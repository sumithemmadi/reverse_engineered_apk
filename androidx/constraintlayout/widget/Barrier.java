package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.a;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.g;
import androidx.constraintlayout.solver.widgets.h;

public class Barrier extends ConstraintHelper {
  private int k;
  
  private int l;
  
  private a m;
  
  public Barrier(Context paramContext) {
    super(paramContext);
    setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    setVisibility(8);
  }
  
  public Barrier(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    setVisibility(8);
  }
  
  private void x(ConstraintWidget paramConstraintWidget, int paramInt, boolean paramBoolean) {
    this.l = paramInt;
    if (Build.VERSION.SDK_INT < 17) {
      paramInt = this.k;
      if (paramInt == 5) {
        this.l = 0;
      } else if (paramInt == 6) {
        this.l = 1;
      } 
    } else if (paramBoolean) {
      paramInt = this.k;
      if (paramInt == 5) {
        this.l = 1;
      } else if (paramInt == 6) {
        this.l = 0;
      } 
    } else {
      paramInt = this.k;
      if (paramInt == 5) {
        this.l = 0;
      } else if (paramInt == 6) {
        this.l = 1;
      } 
    } 
    if (paramConstraintWidget instanceof a)
      ((a)paramConstraintWidget).n1(this.l); 
  }
  
  public int getMargin() {
    return this.m.j1();
  }
  
  public int getType() {
    return this.k;
  }
  
  protected void n(AttributeSet paramAttributeSet) {
    super.n(paramAttributeSet);
    this.m = new a();
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, e.ConstraintLayout_Layout);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == e.ConstraintLayout_Layout_barrierDirection) {
          setType(typedArray.getInt(j, 0));
        } else if (j == e.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
          this.m.m1(typedArray.getBoolean(j, true));
        } else if (j == e.ConstraintLayout_Layout_barrierMargin) {
          j = typedArray.getDimensionPixelSize(j, 0);
          this.m.o1(j);
        } 
      } 
      typedArray.recycle();
    } 
    this.e = (g)this.m;
    v();
  }
  
  public void o(b.a parama, h paramh, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray<ConstraintWidget> paramSparseArray) {
    super.o(parama, paramh, paramLayoutParams, paramSparseArray);
    if (paramh instanceof a) {
      a a1 = (a)paramh;
      boolean bool = ((d)paramh.L()).C1();
      x((ConstraintWidget)a1, parama.d.c0, bool);
      a1.m1(parama.d.k0);
      a1.o1(parama.d.d0);
    } 
  }
  
  public void p(ConstraintWidget paramConstraintWidget, boolean paramBoolean) {
    x(paramConstraintWidget, this.k, paramBoolean);
  }
  
  public void setAllowsGoneWidget(boolean paramBoolean) {
    this.m.m1(paramBoolean);
  }
  
  public void setDpMargin(int paramInt) {
    float f = (getResources().getDisplayMetrics()).density;
    paramInt = (int)(paramInt * f + 0.5F);
    this.m.o1(paramInt);
  }
  
  public void setMargin(int paramInt) {
    this.m.o1(paramInt);
  }
  
  public void setType(int paramInt) {
    this.k = paramInt;
  }
  
  public boolean w() {
    return this.m.h1();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/Barrier.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */