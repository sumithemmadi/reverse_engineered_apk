package com.bumptech.glide.p;

import android.text.TextUtils;

public final class j {
  public static void a(boolean paramBoolean, String paramString) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(paramString);
  }
  
  public static String b(String paramString) {
    if (!TextUtils.isEmpty(paramString))
      return paramString; 
    throw new IllegalArgumentException("Must not be null or empty");
  }
  
  public static <T extends java.util.Collection<Y>, Y> T c(T paramT) {
    if (!paramT.isEmpty())
      return paramT; 
    throw new IllegalArgumentException("Must not be empty.");
  }
  
  public static <T> T d(T paramT) {
    return e(paramT, "Argument must not be null");
  }
  
  public static <T> T e(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */