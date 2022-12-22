package com.google.android.gms.common.k;

import android.content.Context;

public class a {
  private static Context a;
  
  private static Boolean b;
  
  public static boolean a(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/common/k/a
    //   2: monitorenter
    //   3: aload_0
    //   4: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   7: astore_1
    //   8: getstatic com/google/android/gms/common/k/a.a : Landroid/content/Context;
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull -> 41
    //   16: getstatic com/google/android/gms/common/k/a.b : Ljava/lang/Boolean;
    //   19: astore_3
    //   20: aload_3
    //   21: ifnull -> 41
    //   24: aload_2
    //   25: aload_1
    //   26: if_acmpne -> 41
    //   29: aload_3
    //   30: invokevirtual booleanValue : ()Z
    //   33: istore #4
    //   35: ldc com/google/android/gms/common/k/a
    //   37: monitorexit
    //   38: iload #4
    //   40: ireturn
    //   41: aconst_null
    //   42: putstatic com/google/android/gms/common/k/a.b : Ljava/lang/Boolean;
    //   45: invokestatic k : ()Z
    //   48: ifeq -> 67
    //   51: aload_1
    //   52: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   55: invokevirtual isInstantApp : ()Z
    //   58: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   61: putstatic com/google/android/gms/common/k/a.b : Ljava/lang/Boolean;
    //   64: goto -> 93
    //   67: aload_0
    //   68: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   71: ldc 'com.google.android.instantapps.supervisor.InstantAppsRuntime'
    //   73: invokevirtual loadClass : (Ljava/lang/String;)Ljava/lang/Class;
    //   76: pop
    //   77: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   80: putstatic com/google/android/gms/common/k/a.b : Ljava/lang/Boolean;
    //   83: goto -> 93
    //   86: astore_0
    //   87: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   90: putstatic com/google/android/gms/common/k/a.b : Ljava/lang/Boolean;
    //   93: aload_1
    //   94: putstatic com/google/android/gms/common/k/a.a : Landroid/content/Context;
    //   97: getstatic com/google/android/gms/common/k/a.b : Ljava/lang/Boolean;
    //   100: invokevirtual booleanValue : ()Z
    //   103: istore #4
    //   105: ldc com/google/android/gms/common/k/a
    //   107: monitorexit
    //   108: iload #4
    //   110: ireturn
    //   111: astore_0
    //   112: ldc com/google/android/gms/common/k/a
    //   114: monitorexit
    //   115: aload_0
    //   116: athrow
    // Exception table:
    //   from	to	target	type
    //   3	12	111	finally
    //   16	20	111	finally
    //   29	35	111	finally
    //   41	64	111	finally
    //   67	83	86	java/lang/ClassNotFoundException
    //   67	83	111	finally
    //   87	93	111	finally
    //   93	105	111	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */