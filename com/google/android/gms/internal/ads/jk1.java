package com.google.android.gms.internal.ads;

import java.util.LinkedList;

public final class jk1<AdT extends p00> {
  private final lj1 a;
  
  private qk1 b;
  
  private yt1<bk1<AdT>> c;
  
  private ot1<bk1<AdT>> d;
  
  private int e = ok1.a;
  
  private final tj1 f;
  
  private final mk1<AdT> g;
  
  private final LinkedList<qk1> h;
  
  private final et1<bk1<AdT>> i = new kk1(this);
  
  public jk1(tj1 paramtj1, lj1 paramlj1, mk1<AdT> parammk1) {
    this.f = paramtj1;
    this.a = paramlj1;
    this.g = parammk1;
    this.h = new LinkedList<qk1>();
    paramlj1.b(new lk1(this));
  }
  
  private final boolean d() {
    ot1<bk1<AdT>> ot11 = this.d;
    return (ot11 == null || ot11.isDone());
  }
  
  private final void l(qk1 paramqk1) {
    while (true) {
      if (!d()) {
        if (paramqk1 != null)
          this.h.add(paramqk1); 
        return;
      } 
      if (paramqk1 == null && this.h.isEmpty())
        return; 
      qk1 qk11 = paramqk1;
      if (paramqk1 == null)
        qk11 = this.h.remove(); 
      if (qk11.b() != null && this.f.b(qk11.b())) {
        this.b = qk11.c();
        this.c = yt1.C();
        ot1<bk1<AdT>> ot11 = this.g.b(this.b);
        this.d = ot11;
        dt1.g(ot11, this.i, qk11.a());
        return;
      } 
      paramqk1 = null;
    } 
  }
  
  public final void g(qk1 paramqk1) {
    this.h.add(paramqk1);
  }
  
  public final ot1<nk1<AdT>> j(qk1 paramqk1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial d : ()Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: aconst_null
    //   14: areturn
    //   15: aload_0
    //   16: getstatic com/google/android/gms/internal/ads/ok1.c : I
    //   19: putfield e : I
    //   22: aload_0
    //   23: getfield b : Lcom/google/android/gms/internal/ads/qk1;
    //   26: invokeinterface b : ()Lcom/google/android/gms/internal/ads/ak1;
    //   31: ifnull -> 109
    //   34: aload_1
    //   35: invokeinterface b : ()Lcom/google/android/gms/internal/ads/ak1;
    //   40: ifnull -> 109
    //   43: aload_0
    //   44: getfield b : Lcom/google/android/gms/internal/ads/qk1;
    //   47: invokeinterface b : ()Lcom/google/android/gms/internal/ads/ak1;
    //   52: aload_1
    //   53: invokeinterface b : ()Lcom/google/android/gms/internal/ads/ak1;
    //   58: invokeinterface equals : (Ljava/lang/Object;)Z
    //   63: ifne -> 69
    //   66: goto -> 109
    //   69: aload_0
    //   70: getstatic com/google/android/gms/internal/ads/ok1.b : I
    //   73: putfield e : I
    //   76: aload_0
    //   77: getfield c : Lcom/google/android/gms/internal/ads/yt1;
    //   80: astore_3
    //   81: new com/google/android/gms/internal/ads/ik1
    //   84: astore #4
    //   86: aload #4
    //   88: aload_0
    //   89: invokespecial <init> : (Lcom/google/android/gms/internal/ads/jk1;)V
    //   92: aload_3
    //   93: aload #4
    //   95: aload_1
    //   96: invokeinterface a : ()Ljava/util/concurrent/Executor;
    //   101: invokestatic k : (Lcom/google/android/gms/internal/ads/ot1;Lcom/google/android/gms/internal/ads/qs1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/ot1;
    //   104: astore_1
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_1
    //   108: areturn
    //   109: aload_0
    //   110: monitorexit
    //   111: aconst_null
    //   112: areturn
    //   113: astore_1
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_1
    //   117: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	113	finally
    //   15	66	113	finally
    //   69	105	113	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */