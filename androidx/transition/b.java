package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import java.lang.reflect.Method;

class b {
  private static Method a;
  
  private static Method b;
  
  private static boolean c;
  
  @SuppressLint({"SoonBlockedPrivateApi"})
  static void a(Canvas paramCanvas, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: istore_2
    //   4: iload_2
    //   5: bipush #21
    //   7: if_icmpge -> 13
    //   10: goto -> 161
    //   13: iload_2
    //   14: bipush #29
    //   16: if_icmplt -> 37
    //   19: iload_1
    //   20: ifeq -> 30
    //   23: aload_0
    //   24: invokevirtual enableZ : ()V
    //   27: goto -> 161
    //   30: aload_0
    //   31: invokevirtual disableZ : ()V
    //   34: goto -> 161
    //   37: iload_2
    //   38: bipush #28
    //   40: if_icmpeq -> 162
    //   43: getstatic androidx/transition/b.c : Z
    //   46: ifne -> 95
    //   49: ldc android/graphics/Canvas
    //   51: ldc 'insertReorderBarrier'
    //   53: iconst_0
    //   54: anewarray java/lang/Class
    //   57: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   60: astore_3
    //   61: aload_3
    //   62: putstatic androidx/transition/b.a : Ljava/lang/reflect/Method;
    //   65: aload_3
    //   66: iconst_1
    //   67: invokevirtual setAccessible : (Z)V
    //   70: ldc android/graphics/Canvas
    //   72: ldc 'insertInorderBarrier'
    //   74: iconst_0
    //   75: anewarray java/lang/Class
    //   78: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   81: astore_3
    //   82: aload_3
    //   83: putstatic androidx/transition/b.b : Ljava/lang/reflect/Method;
    //   86: aload_3
    //   87: iconst_1
    //   88: invokevirtual setAccessible : (Z)V
    //   91: iconst_1
    //   92: putstatic androidx/transition/b.c : Z
    //   95: iload_1
    //   96: ifeq -> 124
    //   99: getstatic androidx/transition/b.a : Ljava/lang/reflect/Method;
    //   102: astore_3
    //   103: aload_3
    //   104: ifnull -> 124
    //   107: aload_3
    //   108: aload_0
    //   109: iconst_0
    //   110: anewarray java/lang/Object
    //   113: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   116: pop
    //   117: goto -> 124
    //   120: astore_0
    //   121: goto -> 149
    //   124: iload_1
    //   125: ifne -> 161
    //   128: getstatic androidx/transition/b.b : Ljava/lang/reflect/Method;
    //   131: astore_3
    //   132: aload_3
    //   133: ifnull -> 161
    //   136: aload_3
    //   137: aload_0
    //   138: iconst_0
    //   139: anewarray java/lang/Object
    //   142: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   145: pop
    //   146: goto -> 161
    //   149: new java/lang/RuntimeException
    //   152: dup
    //   153: aload_0
    //   154: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   157: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   160: athrow
    //   161: return
    //   162: new java/lang/IllegalStateException
    //   165: dup
    //   166: ldc 'This method doesn't work on Pie!'
    //   168: invokespecial <init> : (Ljava/lang/String;)V
    //   171: athrow
    //   172: astore_3
    //   173: goto -> 91
    //   176: astore_0
    //   177: goto -> 161
    // Exception table:
    //   from	to	target	type
    //   49	91	172	java/lang/NoSuchMethodException
    //   99	103	176	java/lang/IllegalAccessException
    //   99	103	120	java/lang/reflect/InvocationTargetException
    //   107	117	176	java/lang/IllegalAccessException
    //   107	117	120	java/lang/reflect/InvocationTargetException
    //   128	132	176	java/lang/IllegalAccessException
    //   128	132	120	java/lang/reflect/InvocationTargetException
    //   136	146	176	java/lang/IllegalAccessException
    //   136	146	120	java/lang/reflect/InvocationTargetException
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */