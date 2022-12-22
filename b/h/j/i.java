package b.h.j;

import java.util.Locale;

public final class i {
  public static void a(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static int b(int paramInt1, int paramInt2, int paramInt3, String paramString) {
    if (paramInt1 >= paramInt2) {
      if (paramInt1 <= paramInt3)
        return paramInt1; 
      throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
    } 
    throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
  }
  
  public static int c(int paramInt) {
    if (paramInt >= 0)
      return paramInt; 
    throw new IllegalArgumentException();
  }
  
  public static int d(int paramInt1, int paramInt2) {
    if ((paramInt1 & paramInt2) == paramInt1)
      return paramInt1; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Requested flags 0x");
    stringBuilder.append(Integer.toHexString(paramInt1));
    stringBuilder.append(", but only 0x");
    stringBuilder.append(Integer.toHexString(paramInt2));
    stringBuilder.append(" are allowed");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static <T> T e(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  public static <T> T f(T paramT, Object paramObject) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(String.valueOf(paramObject));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/j/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */