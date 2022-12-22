package com.google.android.play.core.internal;

import android.util.Log;
import java.io.File;

final class b0 implements u {
  b0() {}
  
  b0(byte[] paramArrayOfbyte) {}
  
  b0(char[] paramArrayOfchar) {}
  
  public final boolean a(Object paramObject, File paramFile1, File paramFile2) {
    int i = this.a;
    if (i != 0)
      return (i != 1) ? true : (new File(d0.<String, File, File>g(paramObject.getClass(), String.class, File.class, paramFile1, File.class, paramFile2))).exists(); 
    try {
      boolean bool = ((Boolean)d0.<Boolean, String>f(Class.forName("dalvik.system.DexFile"), Boolean.class, String.class, paramFile1.getPath())).booleanValue();
      if (!bool)
        return true; 
    } catch (ClassNotFoundException classNotFoundException) {
      Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */