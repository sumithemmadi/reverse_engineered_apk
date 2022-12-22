package b.h.k;

import android.view.View;
import android.view.ViewParent;

public class l {
  private ViewParent a;
  
  private ViewParent b;
  
  private final View c;
  
  private boolean d;
  
  private int[] e;
  
  public l(View paramView) {
    this.c = paramView;
  }
  
  private boolean g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint1, int paramInt5, int[] paramArrayOfint2) {
    if (l()) {
      ViewParent viewParent = h(paramInt5);
      if (viewParent == null)
        return false; 
      if (paramInt1 != 0 || paramInt2 != 0 || paramInt3 != 0 || paramInt4 != 0) {
        byte b1;
        byte b2;
        if (paramArrayOfint1 != null) {
          this.c.getLocationInWindow(paramArrayOfint1);
          b1 = paramArrayOfint1[0];
          int i = paramArrayOfint1[1];
          b2 = b1;
          b1 = i;
        } else {
          b2 = 0;
          b1 = 0;
        } 
        if (paramArrayOfint2 == null) {
          paramArrayOfint2 = i();
          paramArrayOfint2[0] = 0;
          paramArrayOfint2[1] = 0;
        } 
        z.d(viewParent, this.c, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfint2);
        if (paramArrayOfint1 != null) {
          this.c.getLocationInWindow(paramArrayOfint1);
          paramArrayOfint1[0] = paramArrayOfint1[0] - b2;
          paramArrayOfint1[1] = paramArrayOfint1[1] - b1;
        } 
        return true;
      } 
      if (paramArrayOfint1 != null) {
        paramArrayOfint1[0] = 0;
        paramArrayOfint1[1] = 0;
      } 
    } 
    return false;
  }
  
  private ViewParent h(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? null : this.b) : this.a;
  }
  
  private int[] i() {
    if (this.e == null)
      this.e = new int[2]; 
    return this.e;
  }
  
  private void n(int paramInt, ViewParent paramViewParent) {
    if (paramInt != 0) {
      if (paramInt == 1)
        this.b = paramViewParent; 
    } else {
      this.a = paramViewParent;
    } 
  }
  
  public boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (l()) {
      ViewParent viewParent = h(0);
      if (viewParent != null)
        return z.a(viewParent, this.c, paramFloat1, paramFloat2, paramBoolean); 
    } 
    return false;
  }
  
  public boolean b(float paramFloat1, float paramFloat2) {
    if (l()) {
      ViewParent viewParent = h(0);
      if (viewParent != null)
        return z.b(viewParent, this.c, paramFloat1, paramFloat2); 
    } 
    return false;
  }
  
  public boolean c(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return d(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2, 0);
  }
  
  public boolean d(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt3) {
    boolean bool = l();
    boolean bool1 = false;
    null = bool1;
    if (bool) {
      ViewParent viewParent = h(paramInt3);
      if (viewParent == null)
        return false; 
      if (paramInt1 != 0 || paramInt2 != 0) {
        byte b1;
        byte b2;
        if (paramArrayOfint2 != null) {
          this.c.getLocationInWindow(paramArrayOfint2);
          b1 = paramArrayOfint2[0];
          b2 = paramArrayOfint2[1];
        } else {
          b1 = 0;
          b2 = 0;
        } 
        int[] arrayOfInt = paramArrayOfint1;
        if (paramArrayOfint1 == null)
          arrayOfInt = i(); 
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        z.c(viewParent, this.c, paramInt1, paramInt2, arrayOfInt, paramInt3);
        if (paramArrayOfint2 != null) {
          this.c.getLocationInWindow(paramArrayOfint2);
          paramArrayOfint2[0] = paramArrayOfint2[0] - b1;
          paramArrayOfint2[1] = paramArrayOfint2[1] - b2;
        } 
        if (arrayOfInt[0] == 0) {
          null = bool1;
          return (arrayOfInt[1] != 0) ? true : null;
        } 
      } else {
        null = bool1;
        if (paramArrayOfint2 != null) {
          paramArrayOfint2[0] = 0;
          paramArrayOfint2[1] = 0;
          null = bool1;
        } 
        return null;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  public void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint1, int paramInt5, int[] paramArrayOfint2) {
    g(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint1, paramInt5, paramArrayOfint2);
  }
  
  public boolean f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return g(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint, 0, null);
  }
  
  public boolean j() {
    return k(0);
  }
  
  public boolean k(int paramInt) {
    boolean bool;
    if (h(paramInt) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean l() {
    return this.d;
  }
  
  public void m(boolean paramBoolean) {
    if (this.d)
      w.O0(this.c); 
    this.d = paramBoolean;
  }
  
  public boolean o(int paramInt) {
    return p(paramInt, 0);
  }
  
  public boolean p(int paramInt1, int paramInt2) {
    if (k(paramInt2))
      return true; 
    if (l()) {
      ViewParent viewParent = this.c.getParent();
      View view = this.c;
      while (viewParent != null) {
        if (z.f(viewParent, view, this.c, paramInt1, paramInt2)) {
          n(paramInt2, viewParent);
          z.e(viewParent, view, this.c, paramInt1, paramInt2);
          return true;
        } 
        if (viewParent instanceof View)
          view = (View)viewParent; 
        viewParent = viewParent.getParent();
      } 
    } 
    return false;
  }
  
  public void q() {
    r(0);
  }
  
  public void r(int paramInt) {
    ViewParent viewParent = h(paramInt);
    if (viewParent != null) {
      z.g(viewParent, this.c, paramInt);
      n(paramInt, null);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */