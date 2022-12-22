package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ic {
  private static String a = "Volley";
  
  public static boolean b = Log.isLoggable("Volley", 2);
  
  private static final String c = ic.class.getName();
  
  public static void a(String paramString, Object... paramVarArgs) {
    Log.d(a, d(paramString, paramVarArgs));
  }
  
  public static void b(String paramString, Object... paramVarArgs) {
    Log.e(a, d(paramString, paramVarArgs));
  }
  
  public static void c(String paramString, Object... paramVarArgs) {
    if (b)
      Log.v(a, d(paramString, paramVarArgs)); 
  }
  
  private static String d(String paramString, Object... paramVarArgs) {
    String str;
    if (paramVarArgs != null)
      paramString = String.format(Locale.US, paramString, paramVarArgs); 
    StackTraceElement[] arrayOfStackTraceElement = (new Throwable()).fillInStackTrace().getStackTrace();
    byte b = 2;
    while (true) {
      if (b < arrayOfStackTraceElement.length) {
        if (!arrayOfStackTraceElement[b].getClassName().equals(c)) {
          String str1 = arrayOfStackTraceElement[b].getClassName();
          str1 = str1.substring(str1.lastIndexOf('.') + 1);
          str1 = str1.substring(str1.lastIndexOf('$') + 1);
          String str2 = arrayOfStackTraceElement[b].getMethodName();
          StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 1 + String.valueOf(str2).length());
          stringBuilder.append(str1);
          stringBuilder.append(".");
          stringBuilder.append(str2);
          str1 = stringBuilder.toString();
          break;
        } 
        b++;
        continue;
      } 
      str = "<unknown>";
      break;
    } 
    return String.format(Locale.US, "[%d] %s: %s", new Object[] { Long.valueOf(Thread.currentThread().getId()), str, paramString });
  }
  
  public static void e(Throwable paramThrowable, String paramString, Object... paramVarArgs) {
    Log.e(a, d(paramString, paramVarArgs), paramThrowable);
  }
  
  static final class a {
    public static final boolean a = ic.b;
    
    private final List<yd> b = new ArrayList<yd>();
    
    private boolean c = false;
    
    public final void a(String param1String, long param1Long) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield c : Z
      //   6: ifne -> 43
      //   9: aload_0
      //   10: getfield b : Ljava/util/List;
      //   13: astore #4
      //   15: new com/google/android/gms/internal/ads/yd
      //   18: astore #5
      //   20: aload #5
      //   22: aload_1
      //   23: lload_2
      //   24: invokestatic elapsedRealtime : ()J
      //   27: invokespecial <init> : (Ljava/lang/String;JJ)V
      //   30: aload #4
      //   32: aload #5
      //   34: invokeinterface add : (Ljava/lang/Object;)Z
      //   39: pop
      //   40: aload_0
      //   41: monitorexit
      //   42: return
      //   43: new java/lang/IllegalStateException
      //   46: astore_1
      //   47: aload_1
      //   48: ldc 'Marker added to finished log'
      //   50: invokespecial <init> : (Ljava/lang/String;)V
      //   53: aload_1
      //   54: athrow
      //   55: astore_1
      //   56: aload_0
      //   57: monitorexit
      //   58: aload_1
      //   59: athrow
      // Exception table:
      //   from	to	target	type
      //   2	40	55	finally
      //   43	55	55	finally
    }
    
    public final void b(String param1String) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_1
      //   4: putfield c : Z
      //   7: aload_0
      //   8: getfield b : Ljava/util/List;
      //   11: invokeinterface size : ()I
      //   16: ifne -> 24
      //   19: lconst_0
      //   20: lstore_2
      //   21: goto -> 76
      //   24: aload_0
      //   25: getfield b : Ljava/util/List;
      //   28: iconst_0
      //   29: invokeinterface get : (I)Ljava/lang/Object;
      //   34: checkcast com/google/android/gms/internal/ads/yd
      //   37: getfield c : J
      //   40: lstore #4
      //   42: aload_0
      //   43: getfield b : Ljava/util/List;
      //   46: astore #6
      //   48: aload #6
      //   50: aload #6
      //   52: invokeinterface size : ()I
      //   57: iconst_1
      //   58: isub
      //   59: invokeinterface get : (I)Ljava/lang/Object;
      //   64: checkcast com/google/android/gms/internal/ads/yd
      //   67: getfield c : J
      //   70: lstore_2
      //   71: lload_2
      //   72: lload #4
      //   74: lsub
      //   75: lstore_2
      //   76: lload_2
      //   77: lconst_0
      //   78: lcmp
      //   79: ifgt -> 85
      //   82: aload_0
      //   83: monitorexit
      //   84: return
      //   85: aload_0
      //   86: getfield b : Ljava/util/List;
      //   89: iconst_0
      //   90: invokeinterface get : (I)Ljava/lang/Object;
      //   95: checkcast com/google/android/gms/internal/ads/yd
      //   98: getfield c : J
      //   101: lstore #4
      //   103: ldc '(%-4d ms) %s'
      //   105: iconst_2
      //   106: anewarray java/lang/Object
      //   109: dup
      //   110: iconst_0
      //   111: lload_2
      //   112: invokestatic valueOf : (J)Ljava/lang/Long;
      //   115: aastore
      //   116: dup
      //   117: iconst_1
      //   118: aload_1
      //   119: aastore
      //   120: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
      //   123: aload_0
      //   124: getfield b : Ljava/util/List;
      //   127: invokeinterface iterator : ()Ljava/util/Iterator;
      //   132: astore #6
      //   134: lload #4
      //   136: lstore_2
      //   137: aload #6
      //   139: invokeinterface hasNext : ()Z
      //   144: ifeq -> 206
      //   147: aload #6
      //   149: invokeinterface next : ()Ljava/lang/Object;
      //   154: checkcast com/google/android/gms/internal/ads/yd
      //   157: astore_1
      //   158: aload_1
      //   159: getfield c : J
      //   162: lstore #4
      //   164: ldc '(+%-4d) [%2d] %s'
      //   166: iconst_3
      //   167: anewarray java/lang/Object
      //   170: dup
      //   171: iconst_0
      //   172: lload #4
      //   174: lload_2
      //   175: lsub
      //   176: invokestatic valueOf : (J)Ljava/lang/Long;
      //   179: aastore
      //   180: dup
      //   181: iconst_1
      //   182: aload_1
      //   183: getfield b : J
      //   186: invokestatic valueOf : (J)Ljava/lang/Long;
      //   189: aastore
      //   190: dup
      //   191: iconst_2
      //   192: aload_1
      //   193: getfield a : Ljava/lang/String;
      //   196: aastore
      //   197: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
      //   200: lload #4
      //   202: lstore_2
      //   203: goto -> 137
      //   206: aload_0
      //   207: monitorexit
      //   208: return
      //   209: astore_1
      //   210: aload_0
      //   211: monitorexit
      //   212: goto -> 217
      //   215: aload_1
      //   216: athrow
      //   217: goto -> 215
      // Exception table:
      //   from	to	target	type
      //   2	19	209	finally
      //   24	71	209	finally
      //   85	134	209	finally
      //   137	200	209	finally
    }
    
    protected final void finalize() {
      if (!this.c) {
        b("Request on the loose");
        ic.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */