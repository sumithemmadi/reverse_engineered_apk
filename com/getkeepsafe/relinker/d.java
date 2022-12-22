package com.getkeepsafe.relinker;

import android.os.Build;

final class d implements b.b {
  public void a(String paramString) {
    System.loadLibrary(paramString);
  }
  
  public String b(String paramString) {
    return (paramString.startsWith("lib") && paramString.endsWith(".so")) ? paramString : System.mapLibraryName(paramString);
  }
  
  public String c(String paramString) {
    return paramString.substring(3, paramString.length() - 3);
  }
  
  public String[] d() {
    if (Build.VERSION.SDK_INT >= 21) {
      String[] arrayOfString = Build.SUPPORTED_ABIS;
      if (arrayOfString.length > 0)
        return arrayOfString; 
    } 
    String str = Build.CPU_ABI2;
    return !e.a(str) ? new String[] { Build.CPU_ABI, str } : new String[] { Build.CPU_ABI };
  }
  
  public void e(String paramString) {
    System.load(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */