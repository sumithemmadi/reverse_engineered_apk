package com.danikula.videocache;

public final class k {
  public static void a(Object... paramVarArgs) {
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++)
      paramVarArgs[b].getClass(); 
  }
  
  static void b(boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException();
  }
  
  static void c(boolean paramBoolean, String paramString) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(paramString);
  }
  
  public static <T> T d(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  public static <T> T e(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */