package com.google.android.gms.internal.ads;

public final class xq1 {
  public static void a(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static <T> T b(T paramT) {
    paramT.getClass();
    return paramT;
  }
  
  public static <T> T c(T paramT, Object paramObject) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  public static <T> T d(T paramT, String paramString, Object paramObject) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(er1.c(paramString, new Object[] { paramObject }));
  }
  
  public static int e(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 >= 0 && paramInt1 <= paramInt2)
      return paramInt1; 
    throw new IndexOutOfBoundsException(f(paramInt1, paramInt2, paramString));
  }
  
  private static String f(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 < 0)
      return er1.c("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) }); 
    if (paramInt2 >= 0)
      return er1.c("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }); 
    StringBuilder stringBuilder = new StringBuilder(26);
    stringBuilder.append("negative size: ");
    stringBuilder.append(paramInt2);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static void g(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 < 0 || paramInt2 < paramInt1 || paramInt2 > paramInt3) {
      String str;
      if (paramInt1 >= 0 && paramInt1 <= paramInt3) {
        if (paramInt2 < 0 || paramInt2 > paramInt3) {
          String str1 = f(paramInt2, paramInt3, "end index");
          throw new IndexOutOfBoundsException(str1);
        } 
        str = er1.c("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = f(paramInt1, paramInt3, "start index");
      } 
      throw new IndexOutOfBoundsException(str);
    } 
  }
  
  public static int h(int paramInt1, int paramInt2) {
    if (paramInt1 < 0 || paramInt1 >= paramInt2) {
      String str;
      if (paramInt1 >= 0) {
        if (paramInt2 < 0) {
          StringBuilder stringBuilder = new StringBuilder(26);
          stringBuilder.append("negative size: ");
          stringBuilder.append(paramInt2);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        str = er1.c("%s (%s) must be less than size (%s)", new Object[] { "index", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      } else {
        str = er1.c("%s (%s) must not be negative", new Object[] { "index", Integer.valueOf(paramInt1) });
      } 
      throw new IndexOutOfBoundsException(str);
    } 
    return paramInt1;
  }
  
  public static int i(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt1 <= paramInt2)
      return paramInt1; 
    throw new IndexOutOfBoundsException(f(paramInt1, paramInt2, "index"));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */