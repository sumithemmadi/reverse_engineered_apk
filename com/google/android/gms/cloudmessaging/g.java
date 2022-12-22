package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import c.c.a.a.b.b.e;
import java.util.ArrayDeque;
import java.util.Queue;

final class g implements ServiceConnection {
  int a = 0;
  
  final Messenger b = new Messenger((Handler)new e(Looper.getMainLooper(), new j(this)));
  
  p c;
  
  final Queue<q<?>> d = new ArrayDeque<q<?>>();
  
  final SparseArray<q<?>> e = new SparseArray();
  
  private g(f paramf) {}
  
  final void a() {
    f.g(this.f).execute(new k(this));
  }
  
  final void b(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Landroid/util/SparseArray;
    //   6: iload_1
    //   7: invokevirtual get : (I)Ljava/lang/Object;
    //   10: checkcast com/google/android/gms/cloudmessaging/q
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull -> 79
    //   18: new java/lang/StringBuilder
    //   21: astore_3
    //   22: aload_3
    //   23: bipush #31
    //   25: invokespecial <init> : (I)V
    //   28: aload_3
    //   29: ldc 'Timing out request: '
    //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload_3
    //   36: iload_1
    //   37: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: ldc 'MessengerIpcClient'
    //   43: aload_3
    //   44: invokevirtual toString : ()Ljava/lang/String;
    //   47: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   50: pop
    //   51: aload_0
    //   52: getfield e : Landroid/util/SparseArray;
    //   55: iload_1
    //   56: invokevirtual remove : (I)V
    //   59: new com/google/android/gms/cloudmessaging/zzp
    //   62: astore_3
    //   63: aload_3
    //   64: iconst_3
    //   65: ldc 'Timed out waiting for response'
    //   67: invokespecial <init> : (ILjava/lang/String;)V
    //   70: aload_2
    //   71: aload_3
    //   72: invokevirtual b : (Lcom/google/android/gms/cloudmessaging/zzp;)V
    //   75: aload_0
    //   76: invokevirtual f : ()V
    //   79: aload_0
    //   80: monitorexit
    //   81: return
    //   82: astore_2
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_2
    //   86: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	82	finally
    //   18	79	82	finally
  }
  
  final void c(int paramInt, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'MessengerIpcClient'
    //   4: iconst_3
    //   5: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   8: ifeq -> 50
    //   11: aload_2
    //   12: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   15: astore_3
    //   16: aload_3
    //   17: invokevirtual length : ()I
    //   20: ifeq -> 33
    //   23: ldc 'Disconnected: '
    //   25: aload_3
    //   26: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   29: astore_3
    //   30: goto -> 43
    //   33: new java/lang/String
    //   36: dup
    //   37: ldc 'Disconnected: '
    //   39: invokespecial <init> : (Ljava/lang/String;)V
    //   42: astore_3
    //   43: ldc 'MessengerIpcClient'
    //   45: aload_3
    //   46: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   49: pop
    //   50: aload_0
    //   51: getfield a : I
    //   54: istore #4
    //   56: iload #4
    //   58: ifeq -> 272
    //   61: iload #4
    //   63: iconst_1
    //   64: if_icmpeq -> 138
    //   67: iload #4
    //   69: iconst_2
    //   70: if_icmpeq -> 138
    //   73: iload #4
    //   75: iconst_3
    //   76: if_icmpeq -> 130
    //   79: iload #4
    //   81: iconst_4
    //   82: if_icmpne -> 88
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: new java/lang/IllegalStateException
    //   91: astore_3
    //   92: aload_0
    //   93: getfield a : I
    //   96: istore_1
    //   97: new java/lang/StringBuilder
    //   100: astore_2
    //   101: aload_2
    //   102: bipush #26
    //   104: invokespecial <init> : (I)V
    //   107: aload_2
    //   108: ldc 'Unknown state: '
    //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload_2
    //   115: iload_1
    //   116: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload_3
    //   121: aload_2
    //   122: invokevirtual toString : ()Ljava/lang/String;
    //   125: invokespecial <init> : (Ljava/lang/String;)V
    //   128: aload_3
    //   129: athrow
    //   130: aload_0
    //   131: iconst_4
    //   132: putfield a : I
    //   135: aload_0
    //   136: monitorexit
    //   137: return
    //   138: ldc 'MessengerIpcClient'
    //   140: iconst_2
    //   141: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   144: ifeq -> 155
    //   147: ldc 'MessengerIpcClient'
    //   149: ldc 'Unbinding service'
    //   151: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   154: pop
    //   155: aload_0
    //   156: iconst_4
    //   157: putfield a : I
    //   160: invokestatic b : ()Lcom/google/android/gms/common/stats/a;
    //   163: aload_0
    //   164: getfield f : Lcom/google/android/gms/cloudmessaging/f;
    //   167: invokestatic b : (Lcom/google/android/gms/cloudmessaging/f;)Landroid/content/Context;
    //   170: aload_0
    //   171: invokevirtual c : (Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   174: new com/google/android/gms/cloudmessaging/zzp
    //   177: astore_3
    //   178: aload_3
    //   179: iload_1
    //   180: aload_2
    //   181: invokespecial <init> : (ILjava/lang/String;)V
    //   184: aload_0
    //   185: getfield d : Ljava/util/Queue;
    //   188: invokeinterface iterator : ()Ljava/util/Iterator;
    //   193: astore_2
    //   194: aload_2
    //   195: invokeinterface hasNext : ()Z
    //   200: ifeq -> 219
    //   203: aload_2
    //   204: invokeinterface next : ()Ljava/lang/Object;
    //   209: checkcast com/google/android/gms/cloudmessaging/q
    //   212: aload_3
    //   213: invokevirtual b : (Lcom/google/android/gms/cloudmessaging/zzp;)V
    //   216: goto -> 194
    //   219: aload_0
    //   220: getfield d : Ljava/util/Queue;
    //   223: invokeinterface clear : ()V
    //   228: iconst_0
    //   229: istore_1
    //   230: iload_1
    //   231: aload_0
    //   232: getfield e : Landroid/util/SparseArray;
    //   235: invokevirtual size : ()I
    //   238: if_icmpge -> 262
    //   241: aload_0
    //   242: getfield e : Landroid/util/SparseArray;
    //   245: iload_1
    //   246: invokevirtual valueAt : (I)Ljava/lang/Object;
    //   249: checkcast com/google/android/gms/cloudmessaging/q
    //   252: aload_3
    //   253: invokevirtual b : (Lcom/google/android/gms/cloudmessaging/zzp;)V
    //   256: iinc #1, 1
    //   259: goto -> 230
    //   262: aload_0
    //   263: getfield e : Landroid/util/SparseArray;
    //   266: invokevirtual clear : ()V
    //   269: aload_0
    //   270: monitorexit
    //   271: return
    //   272: new java/lang/IllegalStateException
    //   275: astore_2
    //   276: aload_2
    //   277: invokespecial <init> : ()V
    //   280: aload_2
    //   281: athrow
    //   282: astore_2
    //   283: aload_0
    //   284: monitorexit
    //   285: goto -> 290
    //   288: aload_2
    //   289: athrow
    //   290: goto -> 288
    // Exception table:
    //   from	to	target	type
    //   2	30	282	finally
    //   33	43	282	finally
    //   43	50	282	finally
    //   50	56	282	finally
    //   88	130	282	finally
    //   130	135	282	finally
    //   138	155	282	finally
    //   155	194	282	finally
    //   194	216	282	finally
    //   219	228	282	finally
    //   230	256	282	finally
    //   262	269	282	finally
    //   272	282	282	finally
  }
  
  final boolean d(Message paramMessage) {
    // Byte code:
    //   0: aload_1
    //   1: getfield arg1 : I
    //   4: istore_2
    //   5: ldc 'MessengerIpcClient'
    //   7: iconst_3
    //   8: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   11: ifeq -> 47
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: bipush #41
    //   20: invokespecial <init> : (I)V
    //   23: astore_3
    //   24: aload_3
    //   25: ldc 'Received response to request: '
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload_3
    //   32: iload_2
    //   33: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: ldc 'MessengerIpcClient'
    //   39: aload_3
    //   40: invokevirtual toString : ()Ljava/lang/String;
    //   43: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   46: pop
    //   47: aload_0
    //   48: monitorenter
    //   49: aload_0
    //   50: getfield e : Landroid/util/SparseArray;
    //   53: iload_2
    //   54: invokevirtual get : (I)Ljava/lang/Object;
    //   57: checkcast com/google/android/gms/cloudmessaging/q
    //   60: astore_3
    //   61: aload_3
    //   62: ifnonnull -> 102
    //   65: new java/lang/StringBuilder
    //   68: astore_1
    //   69: aload_1
    //   70: bipush #50
    //   72: invokespecial <init> : (I)V
    //   75: aload_1
    //   76: ldc 'Received response for unknown request: '
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_1
    //   83: iload_2
    //   84: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: ldc 'MessengerIpcClient'
    //   90: aload_1
    //   91: invokevirtual toString : ()Ljava/lang/String;
    //   94: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   97: pop
    //   98: aload_0
    //   99: monitorexit
    //   100: iconst_1
    //   101: ireturn
    //   102: aload_0
    //   103: getfield e : Landroid/util/SparseArray;
    //   106: iload_2
    //   107: invokevirtual remove : (I)V
    //   110: aload_0
    //   111: invokevirtual f : ()V
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_1
    //   117: invokevirtual getData : ()Landroid/os/Bundle;
    //   120: astore_1
    //   121: aload_1
    //   122: ldc 'unsupported'
    //   124: iconst_0
    //   125: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   128: ifeq -> 148
    //   131: aload_3
    //   132: new com/google/android/gms/cloudmessaging/zzp
    //   135: dup
    //   136: iconst_4
    //   137: ldc 'Not supported by GmsCore'
    //   139: invokespecial <init> : (ILjava/lang/String;)V
    //   142: invokevirtual b : (Lcom/google/android/gms/cloudmessaging/zzp;)V
    //   145: goto -> 153
    //   148: aload_3
    //   149: aload_1
    //   150: invokevirtual a : (Landroid/os/Bundle;)V
    //   153: iconst_1
    //   154: ireturn
    //   155: astore_1
    //   156: aload_0
    //   157: monitorexit
    //   158: aload_1
    //   159: athrow
    // Exception table:
    //   from	to	target	type
    //   49	61	155	finally
    //   65	100	155	finally
    //   102	116	155	finally
    //   156	158	155	finally
  }
  
  final boolean e(q<?> paramq) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : I
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 114
    //   11: iload_2
    //   12: iconst_1
    //   13: if_icmpeq -> 99
    //   16: iload_2
    //   17: iconst_2
    //   18: if_icmpeq -> 80
    //   21: iload_2
    //   22: iconst_3
    //   23: if_icmpeq -> 76
    //   26: iload_2
    //   27: iconst_4
    //   28: if_icmpne -> 34
    //   31: goto -> 76
    //   34: new java/lang/IllegalStateException
    //   37: astore_3
    //   38: aload_0
    //   39: getfield a : I
    //   42: istore_2
    //   43: new java/lang/StringBuilder
    //   46: astore_1
    //   47: aload_1
    //   48: bipush #26
    //   50: invokespecial <init> : (I)V
    //   53: aload_1
    //   54: ldc 'Unknown state: '
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload_1
    //   61: iload_2
    //   62: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload_3
    //   67: aload_1
    //   68: invokevirtual toString : ()Ljava/lang/String;
    //   71: invokespecial <init> : (Ljava/lang/String;)V
    //   74: aload_3
    //   75: athrow
    //   76: aload_0
    //   77: monitorexit
    //   78: iconst_0
    //   79: ireturn
    //   80: aload_0
    //   81: getfield d : Ljava/util/Queue;
    //   84: aload_1
    //   85: invokeinterface add : (Ljava/lang/Object;)Z
    //   90: pop
    //   91: aload_0
    //   92: invokevirtual a : ()V
    //   95: aload_0
    //   96: monitorexit
    //   97: iconst_1
    //   98: ireturn
    //   99: aload_0
    //   100: getfield d : Ljava/util/Queue;
    //   103: aload_1
    //   104: invokeinterface add : (Ljava/lang/Object;)Z
    //   109: pop
    //   110: aload_0
    //   111: monitorexit
    //   112: iconst_1
    //   113: ireturn
    //   114: aload_0
    //   115: getfield d : Ljava/util/Queue;
    //   118: aload_1
    //   119: invokeinterface add : (Ljava/lang/Object;)Z
    //   124: pop
    //   125: aload_0
    //   126: getfield a : I
    //   129: ifne -> 138
    //   132: iconst_1
    //   133: istore #4
    //   135: goto -> 141
    //   138: iconst_0
    //   139: istore #4
    //   141: iload #4
    //   143: invokestatic m : (Z)V
    //   146: ldc 'MessengerIpcClient'
    //   148: iconst_2
    //   149: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   152: ifeq -> 163
    //   155: ldc 'MessengerIpcClient'
    //   157: ldc 'Starting bind to GmsCore'
    //   159: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   162: pop
    //   163: aload_0
    //   164: iconst_1
    //   165: putfield a : I
    //   168: new android/content/Intent
    //   171: astore_1
    //   172: aload_1
    //   173: ldc 'com.google.android.c2dm.intent.REGISTER'
    //   175: invokespecial <init> : (Ljava/lang/String;)V
    //   178: aload_1
    //   179: ldc 'com.google.android.gms'
    //   181: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   184: pop
    //   185: invokestatic b : ()Lcom/google/android/gms/common/stats/a;
    //   188: aload_0
    //   189: getfield f : Lcom/google/android/gms/cloudmessaging/f;
    //   192: invokestatic b : (Lcom/google/android/gms/cloudmessaging/f;)Landroid/content/Context;
    //   195: aload_1
    //   196: aload_0
    //   197: iconst_1
    //   198: invokevirtual a : (Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   201: ifne -> 215
    //   204: aload_0
    //   205: iconst_0
    //   206: ldc_w 'Unable to bind to service'
    //   209: invokevirtual c : (ILjava/lang/String;)V
    //   212: goto -> 246
    //   215: aload_0
    //   216: getfield f : Lcom/google/android/gms/cloudmessaging/f;
    //   219: invokestatic g : (Lcom/google/android/gms/cloudmessaging/f;)Ljava/util/concurrent/ScheduledExecutorService;
    //   222: astore_3
    //   223: new com/google/android/gms/cloudmessaging/i
    //   226: astore_1
    //   227: aload_1
    //   228: aload_0
    //   229: invokespecial <init> : (Lcom/google/android/gms/cloudmessaging/g;)V
    //   232: aload_3
    //   233: aload_1
    //   234: ldc2_w 30
    //   237: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
    //   240: invokeinterface schedule : (Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   245: pop
    //   246: aload_0
    //   247: monitorexit
    //   248: iconst_1
    //   249: ireturn
    //   250: astore_1
    //   251: aload_0
    //   252: monitorexit
    //   253: aload_1
    //   254: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	250	finally
    //   34	76	250	finally
    //   80	95	250	finally
    //   99	110	250	finally
    //   114	132	250	finally
    //   141	163	250	finally
    //   163	212	250	finally
    //   215	246	250	finally
  }
  
  final void f() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : I
    //   6: iconst_2
    //   7: if_icmpne -> 69
    //   10: aload_0
    //   11: getfield d : Ljava/util/Queue;
    //   14: invokeinterface isEmpty : ()Z
    //   19: ifeq -> 69
    //   22: aload_0
    //   23: getfield e : Landroid/util/SparseArray;
    //   26: invokevirtual size : ()I
    //   29: ifne -> 69
    //   32: ldc 'MessengerIpcClient'
    //   34: iconst_2
    //   35: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   38: ifeq -> 50
    //   41: ldc 'MessengerIpcClient'
    //   43: ldc_w 'Finished handling requests, unbinding'
    //   46: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   49: pop
    //   50: aload_0
    //   51: iconst_3
    //   52: putfield a : I
    //   55: invokestatic b : ()Lcom/google/android/gms/common/stats/a;
    //   58: aload_0
    //   59: getfield f : Lcom/google/android/gms/cloudmessaging/f;
    //   62: invokestatic b : (Lcom/google/android/gms/cloudmessaging/f;)Landroid/content/Context;
    //   65: aload_0
    //   66: invokevirtual c : (Landroid/content/Context;Landroid/content/ServiceConnection;)V
    //   69: aload_0
    //   70: monitorexit
    //   71: return
    //   72: astore_1
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_1
    //   76: athrow
    // Exception table:
    //   from	to	target	type
    //   2	50	72	finally
    //   50	69	72	finally
  }
  
  final void g() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : I
    //   6: iconst_1
    //   7: if_icmpne -> 18
    //   10: aload_0
    //   11: iconst_1
    //   12: ldc_w 'Timed out while binding'
    //   15: invokevirtual c : (ILjava/lang/String;)V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	21	finally
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    if (Log.isLoggable("MessengerIpcClient", 2))
      Log.v("MessengerIpcClient", "Service connected"); 
    f.g(this.f).execute(new l(this, paramIBinder));
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    if (Log.isLoggable("MessengerIpcClient", 2))
      Log.v("MessengerIpcClient", "Service disconnected"); 
    f.g(this.f).execute(new n(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */