package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

public class Constraints extends ViewGroup {
  b b;
  
  public Constraints(Context paramContext) {
    super(paramContext);
    setVisibility(8);
  }
  
  public Constraints(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    c(paramAttributeSet);
    setVisibility(8);
  }
  
  public Constraints(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    c(paramAttributeSet);
    setVisibility(8);
  }
  
  private void c(AttributeSet paramAttributeSet) {
    Log.v("Constraints", " ################# init");
  }
  
  protected LayoutParams a() {
    return new LayoutParams(-2, -2);
  }
  
  public LayoutParams b(AttributeSet paramAttributeSet) {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new ConstraintLayout.LayoutParams(paramLayoutParams);
  }
  
  public b getConstraintSet() {
    if (this.b == null)
      this.b = new b(); 
    this.b.k(this);
    return this.b;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public static class LayoutParams extends ConstraintLayout.LayoutParams {
    public float A0;
    
    public float B0;
    
    public float p0 = 1.0F;
    
    public boolean q0;
    
    public float r0;
    
    public float s0;
    
    public float t0;
    
    public float u0;
    
    public float v0;
    
    public float w0;
    
    public float x0;
    
    public float y0;
    
    public float z0;
    
    public LayoutParams(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.q0 = false;
      this.r0 = 0.0F;
      this.s0 = 0.0F;
      this.t0 = 0.0F;
      this.u0 = 0.0F;
      this.v0 = 1.0F;
      this.w0 = 1.0F;
      this.x0 = 0.0F;
      this.y0 = 0.0F;
      this.z0 = 0.0F;
      this.A0 = 0.0F;
      this.B0 = 0.0F;
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      byte b = 0;
      this.q0 = false;
      this.r0 = 0.0F;
      this.s0 = 0.0F;
      this.t0 = 0.0F;
      this.u0 = 0.0F;
      this.v0 = 1.0F;
      this.w0 = 1.0F;
      this.x0 = 0.0F;
      this.y0 = 0.0F;
      this.z0 = 0.0F;
      this.A0 = 0.0F;
      this.B0 = 0.0F;
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, e.ConstraintSet);
      int i = typedArray.getIndexCount();
      while (b < i) {
        int j = typedArray.getIndex(b);
        if (j == e.ConstraintSet_android_alpha) {
          this.p0 = typedArray.getFloat(j, this.p0);
        } else if (j == e.ConstraintSet_android_elevation) {
          if (Build.VERSION.SDK_INT >= 21) {
            this.r0 = typedArray.getFloat(j, this.r0);
            this.q0 = true;
          } 
        } else if (j == e.ConstraintSet_android_rotationX) {
          this.t0 = typedArray.getFloat(j, this.t0);
        } else if (j == e.ConstraintSet_android_rotationY) {
          this.u0 = typedArray.getFloat(j, this.u0);
        } else if (j == e.ConstraintSet_android_rotation) {
          this.s0 = typedArray.getFloat(j, this.s0);
        } else if (j == e.ConstraintSet_android_scaleX) {
          this.v0 = typedArray.getFloat(j, this.v0);
        } else if (j == e.ConstraintSet_android_scaleY) {
          this.w0 = typedArray.getFloat(j, this.w0);
        } else if (j == e.ConstraintSet_android_transformPivotX) {
          this.x0 = typedArray.getFloat(j, this.x0);
        } else if (j == e.ConstraintSet_android_transformPivotY) {
          this.y0 = typedArray.getFloat(j, this.y0);
        } else if (j == e.ConstraintSet_android_translationX) {
          this.z0 = typedArray.getFloat(j, this.z0);
        } else if (j == e.ConstraintSet_android_translationY) {
          this.A0 = typedArray.getFloat(j, this.A0);
        } else if (j == e.ConstraintSet_android_translationZ && Build.VERSION.SDK_INT >= 21) {
          this.B0 = typedArray.getFloat(j, this.B0);
        } 
        b++;
      } 
      typedArray.recycle();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/Constraints.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */