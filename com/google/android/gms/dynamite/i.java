package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

final class i extends PathClassLoader {
  i(String paramString, ClassLoader paramClassLoader) {
    super(paramString, paramClassLoader);
  }
  
  protected final Class<?> loadClass(String paramString, boolean paramBoolean) {
    if (!paramString.startsWith("java.") && !paramString.startsWith("android."))
      try {
        return findClass(paramString);
      } catch (ClassNotFoundException classNotFoundException) {} 
    return super.loadClass(paramString, paramBoolean);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/dynamite/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */