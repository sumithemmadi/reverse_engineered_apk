package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class zzdzs<T> extends AtomicReference<Runnable> implements Runnable {
  private static final Runnable b = new lt1(null);
  
  private static final Runnable c = new lt1(null);
  
  private static final Runnable d = new lt1(null);
  
  final void interruptTask() {
    Runnable runnable = (Runnable)get();
    if (runnable instanceof Thread && compareAndSet((V)runnable, (V)c))
      try {
        ((Thread)runnable).interrupt();
        return;
      } finally {
        if ((Runnable)getAndSet((V)b) == d)
          LockSupport.unpark((Thread)runnable); 
      }  
  }
  
  abstract boolean isDone();
  
  public final void run() {
    // Byte code:
    //   0: invokestatic currentThread : ()Ljava/lang/Thread;
    //   3: astore_1
    //   4: aload_0
    //   5: aconst_null
    //   6: aload_1
    //   7: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   10: ifne -> 14
    //   13: return
    //   14: aload_0
    //   15: invokevirtual isDone : ()Z
    //   18: iconst_1
    //   19: ixor
    //   20: istore_2
    //   21: iload_2
    //   22: ifeq -> 205
    //   25: aload_0
    //   26: invokevirtual zzbab : ()Ljava/lang/Object;
    //   29: astore_3
    //   30: goto -> 207
    //   33: astore #4
    //   35: aload_0
    //   36: aload_1
    //   37: getstatic com/google/android/gms/internal/ads/zzdzs.b : Ljava/lang/Runnable;
    //   40: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   43: ifne -> 193
    //   46: aload_0
    //   47: invokevirtual get : ()Ljava/lang/Object;
    //   50: checkcast java/lang/Runnable
    //   53: astore_3
    //   54: iconst_0
    //   55: istore #5
    //   57: iconst_0
    //   58: istore #6
    //   60: getstatic com/google/android/gms/internal/ads/zzdzs.c : Ljava/lang/Runnable;
    //   63: astore #7
    //   65: aload_3
    //   66: aload #7
    //   68: if_acmpeq -> 93
    //   71: aload_3
    //   72: getstatic com/google/android/gms/internal/ads/zzdzs.d : Ljava/lang/Runnable;
    //   75: if_acmpne -> 81
    //   78: goto -> 93
    //   81: iload #5
    //   83: ifeq -> 193
    //   86: aload_1
    //   87: invokevirtual interrupt : ()V
    //   90: goto -> 193
    //   93: iload #6
    //   95: iconst_1
    //   96: iadd
    //   97: istore #8
    //   99: iload #8
    //   101: sipush #1000
    //   104: if_icmple -> 167
    //   107: getstatic com/google/android/gms/internal/ads/zzdzs.d : Ljava/lang/Runnable;
    //   110: astore #9
    //   112: aload_3
    //   113: aload #9
    //   115: if_acmpeq -> 133
    //   118: iload #5
    //   120: istore #6
    //   122: aload_0
    //   123: aload #7
    //   125: aload #9
    //   127: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   130: ifeq -> 174
    //   133: invokestatic interrupted : ()Z
    //   136: ifne -> 153
    //   139: iload #5
    //   141: ifeq -> 147
    //   144: goto -> 153
    //   147: iconst_0
    //   148: istore #5
    //   150: goto -> 156
    //   153: iconst_1
    //   154: istore #5
    //   156: aload_0
    //   157: invokestatic park : (Ljava/lang/Object;)V
    //   160: iload #5
    //   162: istore #6
    //   164: goto -> 174
    //   167: invokestatic yield : ()V
    //   170: iload #5
    //   172: istore #6
    //   174: aload_0
    //   175: invokevirtual get : ()Ljava/lang/Object;
    //   178: checkcast java/lang/Runnable
    //   181: astore_3
    //   182: iload #6
    //   184: istore #5
    //   186: iload #8
    //   188: istore #6
    //   190: goto -> 60
    //   193: iload_2
    //   194: ifeq -> 380
    //   197: aload_0
    //   198: aconst_null
    //   199: aload #4
    //   201: invokevirtual zzb : (Ljava/lang/Object;Ljava/lang/Throwable;)V
    //   204: return
    //   205: aconst_null
    //   206: astore_3
    //   207: aload_0
    //   208: aload_1
    //   209: getstatic com/google/android/gms/internal/ads/zzdzs.b : Ljava/lang/Runnable;
    //   212: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   215: ifne -> 370
    //   218: aload_0
    //   219: invokevirtual get : ()Ljava/lang/Object;
    //   222: checkcast java/lang/Runnable
    //   225: astore #4
    //   227: iconst_0
    //   228: istore #5
    //   230: iconst_0
    //   231: istore #6
    //   233: getstatic com/google/android/gms/internal/ads/zzdzs.c : Ljava/lang/Runnable;
    //   236: astore #7
    //   238: aload #4
    //   240: aload #7
    //   242: if_acmpeq -> 268
    //   245: aload #4
    //   247: getstatic com/google/android/gms/internal/ads/zzdzs.d : Ljava/lang/Runnable;
    //   250: if_acmpne -> 256
    //   253: goto -> 268
    //   256: iload #5
    //   258: ifeq -> 370
    //   261: aload_1
    //   262: invokevirtual interrupt : ()V
    //   265: goto -> 370
    //   268: iload #6
    //   270: iconst_1
    //   271: iadd
    //   272: istore #8
    //   274: iload #8
    //   276: sipush #1000
    //   279: if_icmple -> 343
    //   282: getstatic com/google/android/gms/internal/ads/zzdzs.d : Ljava/lang/Runnable;
    //   285: astore #9
    //   287: aload #4
    //   289: aload #9
    //   291: if_acmpeq -> 309
    //   294: iload #5
    //   296: istore #6
    //   298: aload_0
    //   299: aload #7
    //   301: aload #9
    //   303: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   306: ifeq -> 350
    //   309: invokestatic interrupted : ()Z
    //   312: ifne -> 329
    //   315: iload #5
    //   317: ifeq -> 323
    //   320: goto -> 329
    //   323: iconst_0
    //   324: istore #5
    //   326: goto -> 332
    //   329: iconst_1
    //   330: istore #5
    //   332: aload_0
    //   333: invokestatic park : (Ljava/lang/Object;)V
    //   336: iload #5
    //   338: istore #6
    //   340: goto -> 350
    //   343: invokestatic yield : ()V
    //   346: iload #5
    //   348: istore #6
    //   350: aload_0
    //   351: invokevirtual get : ()Ljava/lang/Object;
    //   354: checkcast java/lang/Runnable
    //   357: astore #4
    //   359: iload #6
    //   361: istore #5
    //   363: iload #8
    //   365: istore #6
    //   367: goto -> 233
    //   370: iload_2
    //   371: ifeq -> 380
    //   374: aload_0
    //   375: aload_3
    //   376: aconst_null
    //   377: invokevirtual zzb : (Ljava/lang/Object;Ljava/lang/Throwable;)V
    //   380: return
    // Exception table:
    //   from	to	target	type
    //   25	30	33	finally
  }
  
  public final String toString() {
    String str1;
    Runnable runnable = (Runnable)get();
    if (runnable == b) {
      str1 = "running=[DONE]";
    } else if (str1 == c) {
      str1 = "running=[INTERRUPTED]";
    } else if (str1 instanceof Thread) {
      str1 = ((Thread)str1).getName();
      StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str1).length() + 21);
      stringBuilder1.append("running=[RUNNING ON ");
      stringBuilder1.append(str1);
      stringBuilder1.append("]");
      str1 = stringBuilder1.toString();
    } else {
      str1 = "running=[NOT STARTED YET]";
    } 
    String str2 = zzbac();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 2 + String.valueOf(str2).length());
    stringBuilder.append(str1);
    stringBuilder.append(", ");
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
  
  abstract void zzb(T paramT, Throwable paramThrowable);
  
  abstract T zzbab();
  
  abstract String zzbac();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */