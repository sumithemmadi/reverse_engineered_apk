package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.e;
import b.f.a.a.c;
import java.util.HashMap;

public class j extends k {
  String h = null;
  
  int i = c.a;
  
  int j = 0;
  
  float k = Float.NaN;
  
  float l = Float.NaN;
  
  float m = Float.NaN;
  
  float n = Float.NaN;
  
  float o = Float.NaN;
  
  float p = Float.NaN;
  
  int q = 0;
  
  private float r = Float.NaN;
  
  private float s = Float.NaN;
  
  public j() {
    this.e = 2;
  }
  
  public void a(HashMap<String, s> paramHashMap) {}
  
  public void c(Context paramContext, AttributeSet paramAttributeSet) {
    a.a(this, paramContext.obtainStyledAttributes(paramAttributeSet, e.KeyPosition));
  }
  
  private static class a {
    private static SparseIntArray a;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      a = sparseIntArray;
      sparseIntArray.append(e.KeyPosition_motionTarget, 1);
      a.append(e.KeyPosition_framePosition, 2);
      a.append(e.KeyPosition_transitionEasing, 3);
      a.append(e.KeyPosition_curveFit, 4);
      a.append(e.KeyPosition_drawPath, 5);
      a.append(e.KeyPosition_percentX, 6);
      a.append(e.KeyPosition_percentY, 7);
      a.append(e.KeyPosition_keyPositionType, 9);
      a.append(e.KeyPosition_sizePercent, 8);
      a.append(e.KeyPosition_percentWidth, 11);
      a.append(e.KeyPosition_percentHeight, 12);
      a.append(e.KeyPosition_pathMotionArc, 10);
    }
    
    private static void b(j param1j, TypedArray param1TypedArray) {
      int i = param1TypedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        StringBuilder stringBuilder;
        float f;
        int k = param1TypedArray.getIndex(b);
        switch (a.get(k)) {
          default:
            stringBuilder = new StringBuilder();
            stringBuilder.append("unused attribute 0x");
            stringBuilder.append(Integer.toHexString(k));
            stringBuilder.append("   ");
            stringBuilder.append(a.get(k));
            Log.e("KeyPosition", stringBuilder.toString());
            break;
          case 12:
            param1j.l = param1TypedArray.getFloat(k, param1j.l);
            break;
          case 11:
            param1j.k = param1TypedArray.getFloat(k, param1j.k);
            break;
          case 10:
            param1j.i = param1TypedArray.getInt(k, param1j.i);
            break;
          case 9:
            param1j.q = param1TypedArray.getInt(k, param1j.q);
            break;
          case 8:
            f = param1TypedArray.getFloat(k, param1j.l);
            param1j.k = f;
            param1j.l = f;
            break;
          case 7:
            param1j.n = param1TypedArray.getFloat(k, param1j.n);
            break;
          case 6:
            param1j.m = param1TypedArray.getFloat(k, param1j.m);
            break;
          case 5:
            param1j.j = param1TypedArray.getInt(k, param1j.j);
            break;
          case 4:
            param1j.g = param1TypedArray.getInteger(k, param1j.g);
            break;
          case 3:
            if ((param1TypedArray.peekValue(k)).type == 3) {
              param1j.h = param1TypedArray.getString(k);
              break;
            } 
            param1j.h = c.b[param1TypedArray.getInteger(k, 0)];
            break;
          case 2:
            param1j.b = param1TypedArray.getInt(k, param1j.b);
            break;
          case 1:
            if (MotionLayout.y) {
              int m = param1TypedArray.getResourceId(k, param1j.c);
              param1j.c = m;
              if (m == -1)
                param1j.d = param1TypedArray.getString(k); 
              break;
            } 
            if ((param1TypedArray.peekValue(k)).type == 3) {
              param1j.d = param1TypedArray.getString(k);
              break;
            } 
            param1j.c = param1TypedArray.getResourceId(k, param1j.c);
            break;
        } 
      } 
      if (param1j.b == -1)
        Log.e("KeyPosition", "no frame position"); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */