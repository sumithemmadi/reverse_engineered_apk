package b.a.l.a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

@SuppressLint({"RestrictedAPI"})
class d extends b {
  private a n;
  
  private boolean o;
  
  d(a parama) {
    if (parama != null)
      h(parama); 
  }
  
  d(a parama, Resources paramResources) {
    h(new a(parama, this, paramResources));
    onStateChange(getState());
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    super.applyTheme(paramTheme);
    onStateChange(getState());
  }
  
  void h(b.d paramd) {
    super.h(paramd);
    if (paramd instanceof a)
      this.n = (a)paramd; 
  }
  
  public boolean isStateful() {
    return true;
  }
  
  a j() {
    return new a(this.n, this, null);
  }
  
  int[] k(AttributeSet paramAttributeSet) {
    int i = paramAttributeSet.getAttributeCount();
    int[] arrayOfInt = new int[i];
    byte b1 = 0;
    int j;
    for (j = 0; b1 < i; j = m) {
      int k = paramAttributeSet.getAttributeNameResource(b1);
      int m = j;
      if (k != 0) {
        m = j;
        if (k != 16842960) {
          m = j;
          if (k != 16843161) {
            if (paramAttributeSet.getAttributeBooleanValue(b1, false)) {
              m = k;
            } else {
              m = -k;
            } 
            arrayOfInt[j] = m;
            m = j + 1;
          } 
        } 
      } 
      b1++;
    } 
    return StateSet.trimStateSet(arrayOfInt, j);
  }
  
  public Drawable mutate() {
    if (!this.o && super.mutate() == this) {
      this.n.r();
      this.o = true;
    } 
    return this;
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    null = super.onStateChange(paramArrayOfint);
    int i = this.n.A(paramArrayOfint);
    int j = i;
    if (i < 0)
      j = this.n.A(StateSet.WILD_CARD); 
    return (g(j) || null);
  }
  
  static class a extends b.d {
    int[][] J;
    
    a(a param1a, d param1d, Resources param1Resources) {
      super(param1a, param1d, param1Resources);
      if (param1a != null) {
        this.J = param1a.J;
      } else {
        this.J = new int[f()][];
      } 
    }
    
    int A(int[] param1ArrayOfint) {
      int[][] arrayOfInt = this.J;
      int i = h();
      for (byte b = 0; b < i; b++) {
        if (StateSet.stateSetMatches(arrayOfInt[b], param1ArrayOfint))
          return b; 
      } 
      return -1;
    }
    
    public Drawable newDrawable() {
      return new d(this, null);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new d(this, param1Resources);
    }
    
    public void o(int param1Int1, int param1Int2) {
      super.o(param1Int1, param1Int2);
      int[][] arrayOfInt = new int[param1Int2][];
      System.arraycopy(this.J, 0, arrayOfInt, 0, param1Int1);
      this.J = arrayOfInt;
    }
    
    void r() {
      int[][] arrayOfInt1 = this.J;
      int[][] arrayOfInt2 = new int[arrayOfInt1.length][];
      for (int i = arrayOfInt1.length - 1; i >= 0; i--) {
        arrayOfInt1 = this.J;
        if (arrayOfInt1[i] != null) {
          int[] arrayOfInt = (int[])arrayOfInt1[i].clone();
        } else {
          arrayOfInt1 = null;
        } 
        arrayOfInt2[i] = (int[])arrayOfInt1;
      } 
      this.J = arrayOfInt2;
    }
    
    int z(int[] param1ArrayOfint, Drawable param1Drawable) {
      int i = a(param1Drawable);
      this.J[i] = param1ArrayOfint;
      return i;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/l/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */