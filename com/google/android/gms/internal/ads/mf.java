package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

final class mf implements w1 {
  private final Map<String, List<w<?>>> a = new HashMap<String, List<w<?>>>();
  
  private final i9 b;
  
  private final v3 c = null;
  
  private final mg2 d;
  
  private final BlockingQueue<w<?>> e;
  
  mf(mg2 parammg2, BlockingQueue<w<?>> paramBlockingQueue, i9 parami9) {
    this.b = parami9;
    this.d = parammg2;
    this.e = paramBlockingQueue;
  }
  
  public final void a(w<?> paramw) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual z : ()Ljava/lang/String;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield a : Ljava/util/Map;
    //   11: aload_2
    //   12: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   17: checkcast java/util/List
    //   20: astore_3
    //   21: aload_3
    //   22: ifnull -> 149
    //   25: aload_3
    //   26: invokeinterface isEmpty : ()Z
    //   31: ifne -> 149
    //   34: getstatic com/google/android/gms/internal/ads/ic.b : Z
    //   37: ifeq -> 65
    //   40: ldc '%d waiting requests for cacheKey=%s; resend to network'
    //   42: iconst_2
    //   43: anewarray java/lang/Object
    //   46: dup
    //   47: iconst_0
    //   48: aload_3
    //   49: invokeinterface size : ()I
    //   54: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   57: aastore
    //   58: dup
    //   59: iconst_1
    //   60: aload_2
    //   61: aastore
    //   62: invokestatic c : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: aload_3
    //   66: iconst_0
    //   67: invokeinterface remove : (I)Ljava/lang/Object;
    //   72: checkcast com/google/android/gms/internal/ads/w
    //   75: astore_1
    //   76: aload_0
    //   77: getfield a : Ljava/util/Map;
    //   80: aload_2
    //   81: aload_3
    //   82: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   87: pop
    //   88: aload_1
    //   89: aload_0
    //   90: invokevirtual n : (Lcom/google/android/gms/internal/ads/w1;)V
    //   93: aload_0
    //   94: getfield d : Lcom/google/android/gms/internal/ads/mg2;
    //   97: ifnull -> 149
    //   100: aload_0
    //   101: getfield e : Ljava/util/concurrent/BlockingQueue;
    //   104: astore_2
    //   105: aload_2
    //   106: ifnull -> 149
    //   109: aload_2
    //   110: aload_1
    //   111: invokeinterface put : (Ljava/lang/Object;)V
    //   116: aload_0
    //   117: monitorexit
    //   118: return
    //   119: astore_1
    //   120: ldc 'Couldn't add request to queue. %s'
    //   122: iconst_1
    //   123: anewarray java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload_1
    //   129: invokevirtual toString : ()Ljava/lang/String;
    //   132: aastore
    //   133: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: invokestatic currentThread : ()Ljava/lang/Thread;
    //   139: invokevirtual interrupt : ()V
    //   142: aload_0
    //   143: getfield d : Lcom/google/android/gms/internal/ads/mg2;
    //   146: invokevirtual b : ()V
    //   149: aload_0
    //   150: monitorexit
    //   151: return
    //   152: astore_1
    //   153: aload_0
    //   154: monitorexit
    //   155: aload_1
    //   156: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	152	finally
    //   25	65	152	finally
    //   65	105	152	finally
    //   109	116	119	java/lang/InterruptedException
    //   109	116	152	finally
    //   120	149	152	finally
  }
  
  public final void b(w<?> paramw, v4<?> paramv4) {
    // Byte code:
    //   0: aload_2
    //   1: getfield b : Lcom/google/android/gms/internal/ads/hh2;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull -> 123
    //   9: aload_3
    //   10: invokevirtual a : ()Z
    //   13: ifeq -> 19
    //   16: goto -> 123
    //   19: aload_1
    //   20: invokevirtual z : ()Ljava/lang/String;
    //   23: astore_3
    //   24: aload_0
    //   25: monitorenter
    //   26: aload_0
    //   27: getfield a : Ljava/util/Map;
    //   30: aload_3
    //   31: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast java/util/List
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: ifnull -> 117
    //   46: getstatic com/google/android/gms/internal/ads/ic.b : Z
    //   49: ifeq -> 77
    //   52: ldc 'Releasing %d waiting requests for cacheKey=%s.'
    //   54: iconst_2
    //   55: anewarray java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_1
    //   61: invokeinterface size : ()I
    //   66: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: aload_3
    //   73: aastore
    //   74: invokestatic c : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: aload_1
    //   78: invokeinterface iterator : ()Ljava/util/Iterator;
    //   83: astore_3
    //   84: aload_3
    //   85: invokeinterface hasNext : ()Z
    //   90: ifeq -> 117
    //   93: aload_3
    //   94: invokeinterface next : ()Ljava/lang/Object;
    //   99: checkcast com/google/android/gms/internal/ads/w
    //   102: astore_1
    //   103: aload_0
    //   104: getfield b : Lcom/google/android/gms/internal/ads/i9;
    //   107: aload_1
    //   108: aload_2
    //   109: invokeinterface b : (Lcom/google/android/gms/internal/ads/w;Lcom/google/android/gms/internal/ads/v4;)V
    //   114: goto -> 84
    //   117: return
    //   118: astore_1
    //   119: aload_0
    //   120: monitorexit
    //   121: aload_1
    //   122: athrow
    //   123: aload_0
    //   124: aload_1
    //   125: invokevirtual a : (Lcom/google/android/gms/internal/ads/w;)V
    //   128: return
    // Exception table:
    //   from	to	target	type
    //   26	42	118	finally
    //   119	121	118	finally
  }
  
  final boolean c(w<?> paramw) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokevirtual z : ()Ljava/lang/String;
    //   6: astore_2
    //   7: aload_0
    //   8: getfield a : Ljava/util/Map;
    //   11: aload_2
    //   12: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   17: ifeq -> 102
    //   20: aload_0
    //   21: getfield a : Ljava/util/Map;
    //   24: aload_2
    //   25: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   30: checkcast java/util/List
    //   33: astore_3
    //   34: aload_3
    //   35: astore #4
    //   37: aload_3
    //   38: ifnonnull -> 51
    //   41: new java/util/ArrayList
    //   44: astore #4
    //   46: aload #4
    //   48: invokespecial <init> : ()V
    //   51: aload_1
    //   52: ldc 'waiting-for-response'
    //   54: invokevirtual u : (Ljava/lang/String;)V
    //   57: aload #4
    //   59: aload_1
    //   60: invokeinterface add : (Ljava/lang/Object;)Z
    //   65: pop
    //   66: aload_0
    //   67: getfield a : Ljava/util/Map;
    //   70: aload_2
    //   71: aload #4
    //   73: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   78: pop
    //   79: getstatic com/google/android/gms/internal/ads/ic.b : Z
    //   82: ifeq -> 98
    //   85: ldc 'Request for cacheKey=%s is in flight, putting on hold.'
    //   87: iconst_1
    //   88: anewarray java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: aload_2
    //   94: aastore
    //   95: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   98: aload_0
    //   99: monitorexit
    //   100: iconst_1
    //   101: ireturn
    //   102: aload_0
    //   103: getfield a : Ljava/util/Map;
    //   106: aload_2
    //   107: aconst_null
    //   108: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   113: pop
    //   114: aload_1
    //   115: aload_0
    //   116: invokevirtual n : (Lcom/google/android/gms/internal/ads/w1;)V
    //   119: getstatic com/google/android/gms/internal/ads/ic.b : Z
    //   122: ifeq -> 138
    //   125: ldc 'new request, sending to network %s'
    //   127: iconst_1
    //   128: anewarray java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: aload_2
    //   134: aastore
    //   135: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   138: aload_0
    //   139: monitorexit
    //   140: iconst_0
    //   141: ireturn
    //   142: astore_1
    //   143: aload_0
    //   144: monitorexit
    //   145: aload_1
    //   146: athrow
    // Exception table:
    //   from	to	target	type
    //   2	34	142	finally
    //   41	51	142	finally
    //   51	98	142	finally
    //   102	138	142	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */