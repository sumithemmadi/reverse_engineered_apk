package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.d1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class xo0 {
  private final d1 a;
  
  private List<Map<String, String>> b = new ArrayList<Map<String, String>>();
  
  private boolean c = false;
  
  private boolean d = false;
  
  private String e;
  
  private so0 f;
  
  public xo0(String paramString, so0 paramso0) {
    this.e = paramString;
    this.f = paramso0;
    this.a = q.g().r();
  }
  
  private final Map<String, String> c() {
    String str;
    Map<String, String> map = this.f.d();
    map.put("tms", Long.toString(q.j().b(), 10));
    if (this.a.h()) {
      str = "";
    } else {
      str = this.e;
    } 
    map.put("tid", str);
    return map;
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/internal/ads/m0.F1 : Lcom/google/android/gms/internal/ads/x;
    //   5: astore_1
    //   6: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   9: aload_1
    //   10: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   13: checkcast java/lang/Boolean
    //   16: invokevirtual booleanValue : ()Z
    //   19: ifeq -> 87
    //   22: getstatic com/google/android/gms/internal/ads/m0.c6 : Lcom/google/android/gms/internal/ads/x;
    //   25: astore_1
    //   26: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   29: aload_1
    //   30: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   33: checkcast java/lang/Boolean
    //   36: invokevirtual booleanValue : ()Z
    //   39: ifeq -> 45
    //   42: goto -> 87
    //   45: aload_0
    //   46: getfield c : Z
    //   49: ifne -> 84
    //   52: aload_0
    //   53: invokespecial c : ()Ljava/util/Map;
    //   56: astore_1
    //   57: aload_1
    //   58: ldc 'action'
    //   60: ldc 'init_started'
    //   62: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   67: pop
    //   68: aload_0
    //   69: getfield b : Ljava/util/List;
    //   72: aload_1
    //   73: invokeinterface add : (Ljava/lang/Object;)Z
    //   78: pop
    //   79: aload_0
    //   80: iconst_1
    //   81: putfield c : Z
    //   84: aload_0
    //   85: monitorexit
    //   86: return
    //   87: aload_0
    //   88: monitorexit
    //   89: return
    //   90: astore_1
    //   91: aload_0
    //   92: monitorexit
    //   93: aload_1
    //   94: athrow
    // Exception table:
    //   from	to	target	type
    //   2	42	90	finally
    //   45	84	90	finally
  }
  
  public final void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/internal/ads/m0.F1 : Lcom/google/android/gms/internal/ads/x;
    //   5: astore_1
    //   6: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   9: aload_1
    //   10: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   13: checkcast java/lang/Boolean
    //   16: invokevirtual booleanValue : ()Z
    //   19: ifeq -> 127
    //   22: getstatic com/google/android/gms/internal/ads/m0.c6 : Lcom/google/android/gms/internal/ads/x;
    //   25: astore_1
    //   26: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   29: aload_1
    //   30: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   33: checkcast java/lang/Boolean
    //   36: invokevirtual booleanValue : ()Z
    //   39: ifeq -> 45
    //   42: goto -> 127
    //   45: aload_0
    //   46: getfield d : Z
    //   49: ifne -> 124
    //   52: aload_0
    //   53: invokespecial c : ()Ljava/util/Map;
    //   56: astore_1
    //   57: aload_1
    //   58: ldc 'action'
    //   60: ldc 'init_finished'
    //   62: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   67: pop
    //   68: aload_0
    //   69: getfield b : Ljava/util/List;
    //   72: aload_1
    //   73: invokeinterface add : (Ljava/lang/Object;)Z
    //   78: pop
    //   79: aload_0
    //   80: getfield b : Ljava/util/List;
    //   83: invokeinterface iterator : ()Ljava/util/Iterator;
    //   88: astore_1
    //   89: aload_1
    //   90: invokeinterface hasNext : ()Z
    //   95: ifeq -> 119
    //   98: aload_1
    //   99: invokeinterface next : ()Ljava/lang/Object;
    //   104: checkcast java/util/Map
    //   107: astore_2
    //   108: aload_0
    //   109: getfield f : Lcom/google/android/gms/internal/ads/so0;
    //   112: aload_2
    //   113: invokevirtual b : (Ljava/util/Map;)V
    //   116: goto -> 89
    //   119: aload_0
    //   120: iconst_1
    //   121: putfield d : Z
    //   124: aload_0
    //   125: monitorexit
    //   126: return
    //   127: aload_0
    //   128: monitorexit
    //   129: return
    //   130: astore_1
    //   131: aload_0
    //   132: monitorexit
    //   133: goto -> 138
    //   136: aload_1
    //   137: athrow
    //   138: goto -> 136
    // Exception table:
    //   from	to	target	type
    //   2	42	130	finally
    //   45	89	130	finally
    //   89	116	130	finally
    //   119	124	130	finally
  }
  
  public final void d(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/internal/ads/m0.F1 : Lcom/google/android/gms/internal/ads/x;
    //   5: astore_2
    //   6: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   9: aload_2
    //   10: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   13: checkcast java/lang/Boolean
    //   16: invokevirtual booleanValue : ()Z
    //   19: ifeq -> 85
    //   22: getstatic com/google/android/gms/internal/ads/m0.c6 : Lcom/google/android/gms/internal/ads/x;
    //   25: astore_2
    //   26: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   29: aload_2
    //   30: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   33: checkcast java/lang/Boolean
    //   36: invokevirtual booleanValue : ()Z
    //   39: ifeq -> 45
    //   42: goto -> 85
    //   45: aload_0
    //   46: invokespecial c : ()Ljava/util/Map;
    //   49: astore_2
    //   50: aload_2
    //   51: ldc 'action'
    //   53: ldc 'adapter_init_started'
    //   55: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   60: pop
    //   61: aload_2
    //   62: ldc 'ancn'
    //   64: aload_1
    //   65: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   70: pop
    //   71: aload_0
    //   72: getfield b : Ljava/util/List;
    //   75: aload_2
    //   76: invokeinterface add : (Ljava/lang/Object;)Z
    //   81: pop
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: astore_1
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    // Exception table:
    //   from	to	target	type
    //   2	42	88	finally
    //   45	82	88	finally
  }
  
  public final void e(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/internal/ads/m0.F1 : Lcom/google/android/gms/internal/ads/x;
    //   5: astore_2
    //   6: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   9: aload_2
    //   10: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   13: checkcast java/lang/Boolean
    //   16: invokevirtual booleanValue : ()Z
    //   19: ifeq -> 85
    //   22: getstatic com/google/android/gms/internal/ads/m0.c6 : Lcom/google/android/gms/internal/ads/x;
    //   25: astore_2
    //   26: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   29: aload_2
    //   30: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   33: checkcast java/lang/Boolean
    //   36: invokevirtual booleanValue : ()Z
    //   39: ifeq -> 45
    //   42: goto -> 85
    //   45: aload_0
    //   46: invokespecial c : ()Ljava/util/Map;
    //   49: astore_2
    //   50: aload_2
    //   51: ldc 'action'
    //   53: ldc 'adapter_init_finished'
    //   55: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   60: pop
    //   61: aload_2
    //   62: ldc 'ancn'
    //   64: aload_1
    //   65: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   70: pop
    //   71: aload_0
    //   72: getfield b : Ljava/util/List;
    //   75: aload_2
    //   76: invokeinterface add : (Ljava/lang/Object;)Z
    //   81: pop
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: astore_1
    //   89: aload_0
    //   90: monitorexit
    //   91: aload_1
    //   92: athrow
    // Exception table:
    //   from	to	target	type
    //   2	42	88	finally
    //   45	82	88	finally
  }
  
  public final void f(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic com/google/android/gms/internal/ads/m0.F1 : Lcom/google/android/gms/internal/ads/x;
    //   5: astore_3
    //   6: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   9: aload_3
    //   10: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   13: checkcast java/lang/Boolean
    //   16: invokevirtual booleanValue : ()Z
    //   19: ifeq -> 95
    //   22: getstatic com/google/android/gms/internal/ads/m0.c6 : Lcom/google/android/gms/internal/ads/x;
    //   25: astore_3
    //   26: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   29: aload_3
    //   30: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   33: checkcast java/lang/Boolean
    //   36: invokevirtual booleanValue : ()Z
    //   39: ifeq -> 45
    //   42: goto -> 95
    //   45: aload_0
    //   46: invokespecial c : ()Ljava/util/Map;
    //   49: astore_3
    //   50: aload_3
    //   51: ldc 'action'
    //   53: ldc 'adapter_init_finished'
    //   55: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   60: pop
    //   61: aload_3
    //   62: ldc 'ancn'
    //   64: aload_1
    //   65: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   70: pop
    //   71: aload_3
    //   72: ldc 'rqe'
    //   74: aload_2
    //   75: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   80: pop
    //   81: aload_0
    //   82: getfield b : Ljava/util/List;
    //   85: aload_3
    //   86: invokeinterface add : (Ljava/lang/Object;)Z
    //   91: pop
    //   92: aload_0
    //   93: monitorexit
    //   94: return
    //   95: aload_0
    //   96: monitorexit
    //   97: return
    //   98: astore_1
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_1
    //   102: athrow
    // Exception table:
    //   from	to	target	type
    //   2	42	98	finally
    //   45	92	98	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */