package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.g;
import java.util.concurrent.ScheduledExecutorService;

public final class f {
  private static f a;
  
  private final Context b;
  
  private final ScheduledExecutorService c;
  
  private g d = new g(this, null);
  
  private int e = 1;
  
  private f(Context paramContext, ScheduledExecutorService paramScheduledExecutorService) {
    this.c = paramScheduledExecutorService;
    this.b = paramContext.getApplicationContext();
  }
  
  private final int a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : I
    //   6: istore_1
    //   7: aload_0
    //   8: iload_1
    //   9: iconst_1
    //   10: iadd
    //   11: putfield e : I
    //   14: aload_0
    //   15: monitorexit
    //   16: iload_1
    //   17: ireturn
    //   18: astore_2
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_2
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	18	finally
  }
  
  public static f c(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/cloudmessaging/f
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/cloudmessaging/f.a : Lcom/google/android/gms/cloudmessaging/f;
    //   6: ifnonnull -> 47
    //   9: new com/google/android/gms/cloudmessaging/f
    //   12: astore_1
    //   13: invokestatic a : ()Lc/c/a/a/b/b/b;
    //   16: astore_2
    //   17: new com/google/android/gms/common/util/v/a
    //   20: astore_3
    //   21: aload_3
    //   22: ldc 'MessengerIpcClient'
    //   24: invokespecial <init> : (Ljava/lang/String;)V
    //   27: aload_1
    //   28: aload_0
    //   29: aload_2
    //   30: iconst_1
    //   31: aload_3
    //   32: getstatic c/c/a/a/b/b/f.b : I
    //   35: invokeinterface a : (ILjava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ScheduledExecutorService;
    //   40: invokespecial <init> : (Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    //   43: aload_1
    //   44: putstatic com/google/android/gms/cloudmessaging/f.a : Lcom/google/android/gms/cloudmessaging/f;
    //   47: getstatic com/google/android/gms/cloudmessaging/f.a : Lcom/google/android/gms/cloudmessaging/f;
    //   50: astore_0
    //   51: ldc com/google/android/gms/cloudmessaging/f
    //   53: monitorexit
    //   54: aload_0
    //   55: areturn
    //   56: astore_0
    //   57: ldc com/google/android/gms/cloudmessaging/f
    //   59: monitorexit
    //   60: aload_0
    //   61: athrow
    // Exception table:
    //   from	to	target	type
    //   3	47	56	finally
    //   47	51	56	finally
  }
  
  private final <T> g<T> e(q<T> paramq) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'MessengerIpcClient'
    //   4: iconst_3
    //   5: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   8: ifeq -> 61
    //   11: aload_1
    //   12: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   15: astore_2
    //   16: aload_2
    //   17: invokevirtual length : ()I
    //   20: istore_3
    //   21: new java/lang/StringBuilder
    //   24: astore #4
    //   26: aload #4
    //   28: iload_3
    //   29: bipush #9
    //   31: iadd
    //   32: invokespecial <init> : (I)V
    //   35: aload #4
    //   37: ldc 'Queueing '
    //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: aload #4
    //   45: aload_2
    //   46: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: pop
    //   50: ldc 'MessengerIpcClient'
    //   52: aload #4
    //   54: invokevirtual toString : ()Ljava/lang/String;
    //   57: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   60: pop
    //   61: aload_0
    //   62: getfield d : Lcom/google/android/gms/cloudmessaging/g;
    //   65: aload_1
    //   66: invokevirtual e : (Lcom/google/android/gms/cloudmessaging/q;)Z
    //   69: ifne -> 93
    //   72: new com/google/android/gms/cloudmessaging/g
    //   75: astore_2
    //   76: aload_2
    //   77: aload_0
    //   78: aconst_null
    //   79: invokespecial <init> : (Lcom/google/android/gms/cloudmessaging/f;Lcom/google/android/gms/cloudmessaging/h;)V
    //   82: aload_0
    //   83: aload_2
    //   84: putfield d : Lcom/google/android/gms/cloudmessaging/g;
    //   87: aload_2
    //   88: aload_1
    //   89: invokevirtual e : (Lcom/google/android/gms/cloudmessaging/q;)Z
    //   92: pop
    //   93: aload_1
    //   94: getfield b : Lcom/google/android/gms/tasks/h;
    //   97: invokevirtual a : ()Lcom/google/android/gms/tasks/g;
    //   100: astore_1
    //   101: aload_0
    //   102: monitorexit
    //   103: aload_1
    //   104: areturn
    //   105: astore_1
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_1
    //   109: athrow
    // Exception table:
    //   from	to	target	type
    //   2	61	105	finally
    //   61	93	105	finally
    //   93	101	105	finally
  }
  
  public final g<Void> d(int paramInt, Bundle paramBundle) {
    return e(new o(a(), 2, paramBundle));
  }
  
  public final g<Bundle> f(int paramInt, Bundle paramBundle) {
    return e(new s(a(), 1, paramBundle));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */