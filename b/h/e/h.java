package b.h.e;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class h extends g {
  protected Typeface l(Object paramObject) {
    try {
      Object object = Array.newInstance(this.g, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)this.m.invoke(null, new Object[] { object, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1) });
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  protected Method x(Class<?> paramClass) {
    paramClass = Array.newInstance(paramClass, 1).getClass();
    Class<int> clazz = int.class;
    Method method = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { paramClass, String.class, clazz, clazz });
    method.setAccessible(true);
    return method;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */