package androidx.transition;

import android.animation.TypeEvaluator;

class d implements TypeEvaluator<float[]> {
  private float[] a;
  
  d(float[] paramArrayOffloat) {
    this.a = paramArrayOffloat;
  }
  
  public float[] a(float paramFloat, float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    float[] arrayOfFloat1 = this.a;
    float[] arrayOfFloat2 = arrayOfFloat1;
    if (arrayOfFloat1 == null)
      arrayOfFloat2 = new float[paramArrayOffloat1.length]; 
    for (byte b = 0; b < arrayOfFloat2.length; b++) {
      float f = paramArrayOffloat1[b];
      arrayOfFloat2[b] = f + (paramArrayOffloat2[b] - f) * paramFloat;
    } 
    return arrayOfFloat2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */