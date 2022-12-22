package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

public class l {
  private Map<String, Integer> a = new HashMap<String, Integer>();
  
  public boolean a(String paramString, int paramInt) {
    int i;
    Integer integer = this.a.get(paramString);
    boolean bool = false;
    if (integer != null) {
      i = integer.intValue();
    } else {
      i = 0;
    } 
    if ((i & paramInt) != 0)
      bool = true; 
    this.a.put(paramString, Integer.valueOf(paramInt | i));
    return bool ^ true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */