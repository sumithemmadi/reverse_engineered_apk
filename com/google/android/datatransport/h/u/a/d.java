package com.google.android.datatransport.h.u.a;

public final class d {
  public static <T> void a(T paramT, Class<T> paramClass) {
    if (paramT != null)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramClass.getCanonicalName());
    stringBuilder.append(" must be set");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public static <T> T b(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  public static <T> T c(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/u/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */