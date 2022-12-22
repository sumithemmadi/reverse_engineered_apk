package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;

public final class v0 {
  private final BroadcastReceiver a = new y0(this);
  
  private final Map<BroadcastReceiver, IntentFilter> b = new WeakHashMap<BroadcastReceiver, IntentFilter>();
  
  private boolean c = false;
  
  private boolean d;
  
  private Context e;
  
  private final void e(Context paramContext, Intent paramIntent) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: astore_3
    //   6: aload_3
    //   7: invokespecial <init> : ()V
    //   10: aload_0
    //   11: getfield b : Ljava/util/Map;
    //   14: invokeinterface entrySet : ()Ljava/util/Set;
    //   19: invokeinterface iterator : ()Ljava/util/Iterator;
    //   24: astore #4
    //   26: aload #4
    //   28: invokeinterface hasNext : ()Z
    //   33: ifeq -> 88
    //   36: aload #4
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast java/util/Map$Entry
    //   46: astore #5
    //   48: aload #5
    //   50: invokeinterface getValue : ()Ljava/lang/Object;
    //   55: checkcast android/content/IntentFilter
    //   58: aload_2
    //   59: invokevirtual getAction : ()Ljava/lang/String;
    //   62: invokevirtual hasAction : (Ljava/lang/String;)Z
    //   65: ifeq -> 26
    //   68: aload_3
    //   69: aload #5
    //   71: invokeinterface getKey : ()Ljava/lang/Object;
    //   76: checkcast android/content/BroadcastReceiver
    //   79: invokeinterface add : (Ljava/lang/Object;)Z
    //   84: pop
    //   85: goto -> 26
    //   88: aload_3
    //   89: invokevirtual size : ()I
    //   92: istore #6
    //   94: iconst_0
    //   95: istore #7
    //   97: iload #7
    //   99: iload #6
    //   101: if_icmpge -> 128
    //   104: aload_3
    //   105: iload #7
    //   107: invokevirtual get : (I)Ljava/lang/Object;
    //   110: astore #4
    //   112: iinc #7, 1
    //   115: aload #4
    //   117: checkcast android/content/BroadcastReceiver
    //   120: aload_1
    //   121: aload_2
    //   122: invokevirtual onReceive : (Landroid/content/Context;Landroid/content/Intent;)V
    //   125: goto -> 97
    //   128: aload_0
    //   129: monitorexit
    //   130: return
    //   131: astore_1
    //   132: aload_0
    //   133: monitorexit
    //   134: goto -> 139
    //   137: aload_1
    //   138: athrow
    //   139: goto -> 137
    // Exception table:
    //   from	to	target	type
    //   2	26	131	finally
    //   26	85	131	finally
    //   88	94	131	finally
    //   104	112	131	finally
    //   115	125	131	finally
  }
  
  public final void a(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_1
    //   15: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   18: astore_3
    //   19: aload_0
    //   20: aload_3
    //   21: putfield e : Landroid/content/Context;
    //   24: aload_3
    //   25: ifnonnull -> 33
    //   28: aload_0
    //   29: aload_1
    //   30: putfield e : Landroid/content/Context;
    //   33: aload_0
    //   34: getfield e : Landroid/content/Context;
    //   37: invokestatic a : (Landroid/content/Context;)V
    //   40: getstatic com/google/android/gms/internal/ads/m0.y2 : Lcom/google/android/gms/internal/ads/x;
    //   43: astore_1
    //   44: aload_0
    //   45: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   48: aload_1
    //   49: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   52: checkcast java/lang/Boolean
    //   55: invokevirtual booleanValue : ()Z
    //   58: putfield d : Z
    //   61: new android/content/IntentFilter
    //   64: astore_1
    //   65: aload_1
    //   66: invokespecial <init> : ()V
    //   69: aload_1
    //   70: ldc 'android.intent.action.SCREEN_ON'
    //   72: invokevirtual addAction : (Ljava/lang/String;)V
    //   75: aload_1
    //   76: ldc 'android.intent.action.SCREEN_OFF'
    //   78: invokevirtual addAction : (Ljava/lang/String;)V
    //   81: aload_1
    //   82: ldc 'android.intent.action.USER_PRESENT'
    //   84: invokevirtual addAction : (Ljava/lang/String;)V
    //   87: aload_0
    //   88: getfield e : Landroid/content/Context;
    //   91: aload_0
    //   92: getfield a : Landroid/content/BroadcastReceiver;
    //   95: aload_1
    //   96: invokevirtual registerReceiver : (Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   99: pop
    //   100: aload_0
    //   101: iconst_1
    //   102: putfield c : Z
    //   105: aload_0
    //   106: monitorexit
    //   107: return
    //   108: astore_1
    //   109: aload_0
    //   110: monitorexit
    //   111: aload_1
    //   112: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	108	finally
    //   14	24	108	finally
    //   28	33	108	finally
    //   33	105	108	finally
  }
  
  public final void b(Context paramContext, BroadcastReceiver paramBroadcastReceiver) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Z
    //   6: ifeq -> 23
    //   9: aload_0
    //   10: getfield b : Ljava/util/Map;
    //   13: aload_2
    //   14: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   19: pop
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_1
    //   24: aload_2
    //   25: invokevirtual unregisterReceiver : (Landroid/content/BroadcastReceiver;)V
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	31	finally
    //   23	28	31	finally
  }
  
  public final void c(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Z
    //   6: ifeq -> 24
    //   9: aload_0
    //   10: getfield b : Ljava/util/Map;
    //   13: aload_2
    //   14: aload_3
    //   15: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   20: pop
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_1
    //   25: aload_2
    //   26: aload_3
    //   27: invokevirtual registerReceiver : (Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   30: pop
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	34	finally
    //   24	31	34	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */