package androidx.work;

import android.util.Log;

public abstract class f {
  private static f a;
  
  private static final int b = 20;
  
  public f(int paramInt) {}
  
  public static f c() {
    // Byte code:
    //   0: ldc androidx/work/f
    //   2: monitorenter
    //   3: getstatic androidx/work/f.a : Landroidx/work/f;
    //   6: ifnonnull -> 22
    //   9: new androidx/work/f$a
    //   12: astore_0
    //   13: aload_0
    //   14: iconst_3
    //   15: invokespecial <init> : (I)V
    //   18: aload_0
    //   19: putstatic androidx/work/f.a : Landroidx/work/f;
    //   22: getstatic androidx/work/f.a : Landroidx/work/f;
    //   25: astore_0
    //   26: ldc androidx/work/f
    //   28: monitorexit
    //   29: aload_0
    //   30: areturn
    //   31: astore_0
    //   32: ldc androidx/work/f
    //   34: monitorexit
    //   35: aload_0
    //   36: athrow
    // Exception table:
    //   from	to	target	type
    //   3	22	31	finally
    //   22	26	31	finally
  }
  
  public static void e(f paramf) {
    // Byte code:
    //   0: ldc androidx/work/f
    //   2: monitorenter
    //   3: aload_0
    //   4: putstatic androidx/work/f.a : Landroidx/work/f;
    //   7: ldc androidx/work/f
    //   9: monitorexit
    //   10: return
    //   11: astore_0
    //   12: ldc androidx/work/f
    //   14: monitorexit
    //   15: aload_0
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   3	7	11	finally
  }
  
  public static String f(String paramString) {
    int i = paramString.length();
    StringBuilder stringBuilder = new StringBuilder(23);
    stringBuilder.append("WM-");
    int j = b;
    if (i >= j) {
      stringBuilder.append(paramString.substring(0, j));
    } else {
      stringBuilder.append(paramString);
    } 
    return stringBuilder.toString();
  }
  
  public abstract void a(String paramString1, String paramString2, Throwable... paramVarArgs);
  
  public abstract void b(String paramString1, String paramString2, Throwable... paramVarArgs);
  
  public abstract void d(String paramString1, String paramString2, Throwable... paramVarArgs);
  
  public abstract void g(String paramString1, String paramString2, Throwable... paramVarArgs);
  
  public abstract void h(String paramString1, String paramString2, Throwable... paramVarArgs);
  
  public static class a extends f {
    private int c;
    
    public a(int param1Int) {
      super(param1Int);
      this.c = param1Int;
    }
    
    public void a(String param1String1, String param1String2, Throwable... param1VarArgs) {
      if (this.c <= 3)
        if (param1VarArgs != null && param1VarArgs.length >= 1) {
          Log.d(param1String1, param1String2, param1VarArgs[0]);
        } else {
          Log.d(param1String1, param1String2);
        }  
    }
    
    public void b(String param1String1, String param1String2, Throwable... param1VarArgs) {
      if (this.c <= 6)
        if (param1VarArgs != null && param1VarArgs.length >= 1) {
          Log.e(param1String1, param1String2, param1VarArgs[0]);
        } else {
          Log.e(param1String1, param1String2);
        }  
    }
    
    public void d(String param1String1, String param1String2, Throwable... param1VarArgs) {
      if (this.c <= 4)
        if (param1VarArgs != null && param1VarArgs.length >= 1) {
          Log.i(param1String1, param1String2, param1VarArgs[0]);
        } else {
          Log.i(param1String1, param1String2);
        }  
    }
    
    public void g(String param1String1, String param1String2, Throwable... param1VarArgs) {
      if (this.c <= 2)
        if (param1VarArgs != null && param1VarArgs.length >= 1) {
          Log.v(param1String1, param1String2, param1VarArgs[0]);
        } else {
          Log.v(param1String1, param1String2);
        }  
    }
    
    public void h(String param1String1, String param1String2, Throwable... param1VarArgs) {
      if (this.c <= 5)
        if (param1VarArgs != null && param1VarArgs.length >= 1) {
          Log.w(param1String1, param1String2, param1VarArgs[0]);
        } else {
          Log.w(param1String1, param1String2);
        }  
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */