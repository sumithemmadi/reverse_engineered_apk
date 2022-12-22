package androidx.constraintlayout.motion.widget;

import java.util.Arrays;
import java.util.HashMap;

public class e {
  HashMap<Object, HashMap<String, float[]>> a = new HashMap<Object, HashMap<String, float[]>>();
  
  float a(Object paramObject, String paramString, int paramInt) {
    if (!this.a.containsKey(paramObject))
      return Float.NaN; 
    paramObject = this.a.get(paramObject);
    if (!paramObject.containsKey(paramString))
      return Float.NaN; 
    paramObject = paramObject.get(paramString);
    return (paramObject.length > paramInt) ? paramObject[paramInt] : Float.NaN;
  }
  
  void b(Object paramObject, String paramString, int paramInt, float paramFloat) {
    if (!this.a.containsKey(paramObject)) {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      float[] arrayOfFloat = new float[paramInt + 1];
      arrayOfFloat[paramInt] = paramFloat;
      hashMap.put(paramString, arrayOfFloat);
      this.a.put(paramObject, hashMap);
    } else {
      HashMap<String, float[]> hashMap = this.a.get(paramObject);
      if (!hashMap.containsKey(paramString)) {
        float[] arrayOfFloat = new float[paramInt + 1];
        arrayOfFloat[paramInt] = paramFloat;
        hashMap.put(paramString, arrayOfFloat);
        this.a.put(paramObject, hashMap);
      } else {
        float[] arrayOfFloat = hashMap.get(paramString);
        paramObject = arrayOfFloat;
        if (arrayOfFloat.length <= paramInt)
          paramObject = Arrays.copyOf(arrayOfFloat, paramInt + 1); 
        paramObject[paramInt] = paramFloat;
        hashMap.put(paramString, paramObject);
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */