package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;

public final class w {
  private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
  
  private static long b;
  
  private static float c = Float.NaN;
  
  @TargetApi(20)
  public static int a(Context paramContext) {
    int i;
    boolean bool1;
    if (paramContext == null || paramContext.getApplicationContext() == null)
      return -1; 
    Intent intent = paramContext.getApplicationContext().registerReceiver(null, a);
    boolean bool = false;
    if (intent == null) {
      i = 0;
    } else {
      i = intent.getIntExtra("plugged", 0);
    } 
    byte b = 3;
    if (o.d())
      b = 7; 
    if ((i & b) != 0) {
      i = 1;
    } else {
      i = 0;
    } 
    PowerManager powerManager = (PowerManager)paramContext.getSystemService("power");
    if (powerManager == null)
      return -1; 
    if (o.g()) {
      bool1 = powerManager.isInteractive();
    } else {
      bool1 = powerManager.isScreenOn();
    } 
    b = bool;
    if (bool1)
      b = 2; 
    return b | i;
  }
  
  public static float b(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/gms/common/util/w
    //   2: monitorenter
    //   3: invokestatic elapsedRealtime : ()J
    //   6: getstatic com/google/android/gms/common/util/w.b : J
    //   9: lsub
    //   10: ldc2_w 60000
    //   13: lcmp
    //   14: ifge -> 35
    //   17: getstatic com/google/android/gms/common/util/w.c : F
    //   20: invokestatic isNaN : (F)Z
    //   23: ifne -> 35
    //   26: getstatic com/google/android/gms/common/util/w.c : F
    //   29: fstore_1
    //   30: ldc com/google/android/gms/common/util/w
    //   32: monitorexit
    //   33: fload_1
    //   34: freturn
    //   35: aload_0
    //   36: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   39: aconst_null
    //   40: getstatic com/google/android/gms/common/util/w.a : Landroid/content/IntentFilter;
    //   43: invokevirtual registerReceiver : (Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   46: astore_0
    //   47: aload_0
    //   48: ifnull -> 75
    //   51: aload_0
    //   52: ldc 'level'
    //   54: iconst_m1
    //   55: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   58: istore_2
    //   59: aload_0
    //   60: ldc 'scale'
    //   62: iconst_m1
    //   63: invokevirtual getIntExtra : (Ljava/lang/String;I)I
    //   66: istore_3
    //   67: iload_2
    //   68: i2f
    //   69: iload_3
    //   70: i2f
    //   71: fdiv
    //   72: putstatic com/google/android/gms/common/util/w.c : F
    //   75: invokestatic elapsedRealtime : ()J
    //   78: putstatic com/google/android/gms/common/util/w.b : J
    //   81: getstatic com/google/android/gms/common/util/w.c : F
    //   84: fstore_1
    //   85: ldc com/google/android/gms/common/util/w
    //   87: monitorexit
    //   88: fload_1
    //   89: freturn
    //   90: astore_0
    //   91: ldc com/google/android/gms/common/util/w
    //   93: monitorexit
    //   94: aload_0
    //   95: athrow
    // Exception table:
    //   from	to	target	type
    //   3	30	90	finally
    //   35	47	90	finally
    //   51	75	90	finally
    //   75	85	90	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */