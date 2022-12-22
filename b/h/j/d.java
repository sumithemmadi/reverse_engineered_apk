package b.h.j;

import android.os.Build;
import java.util.Arrays;

public class d {
  public static boolean a(Object paramObject1, Object paramObject2) {
    return (Build.VERSION.SDK_INT >= 19) ? c.a(paramObject1, paramObject2) : ((paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2))));
  }
  
  public static int b(Object... paramVarArgs) {
    return (Build.VERSION.SDK_INT >= 19) ? Arrays.hashCode(paramVarArgs) : Arrays.hashCode(paramVarArgs);
  }
  
  public static String c(Object paramObject, String paramString) {
    if (paramObject != null)
      paramString = paramObject.toString(); 
    return paramString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/j/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */