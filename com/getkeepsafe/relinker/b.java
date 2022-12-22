package com.getkeepsafe.relinker;

import android.content.Context;
import java.io.File;

public class b {
  public static void a(Context paramContext, String paramString) {
    b(paramContext, paramString, null, null);
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2, c paramc) {
    (new c()).f(paramContext, paramString1, paramString2, paramc);
  }
  
  public static interface a {
    void a(Context param1Context, String[] param1ArrayOfString, String param1String, File param1File, c param1c);
  }
  
  public static interface b {
    void a(String param1String);
    
    String b(String param1String);
    
    String c(String param1String);
    
    String[] d();
    
    void e(String param1String);
  }
  
  public static interface c {
    void a();
    
    void b(Throwable param1Throwable);
  }
  
  public static interface d {
    void a(String param1String);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */