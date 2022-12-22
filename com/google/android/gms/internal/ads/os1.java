package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class os1<OutputT> extends zzdyk.h<OutputT> {
  static {
    try {
      c c = new c();
      this(AtomicReferenceFieldUpdater.newUpdater(os1.class, Set.class, "k"), AtomicIntegerFieldUpdater.newUpdater(os1.class, "l"));
    } finally {
      exception = null;
    } 
    i = b;
    if (exception != null)
      j.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", exception); 
  }
  
  os1(int paramInt) {
    this.l = paramInt;
  }
  
  final Set<Throwable> E() {
    Set<Throwable> set1 = this.k;
    Set<Throwable> set2 = set1;
    if (set1 == null) {
      set2 = Collections.newSetFromMap(new ConcurrentHashMap<Throwable, Boolean>());
      I(set2);
      i.a(this, null, set2);
      set2 = this.k;
    } 
    return set2;
  }
  
  final int F() {
    return i.b(this);
  }
  
  final void H() {
    this.k = null;
  }
  
  abstract void I(Set<Throwable> paramSet);
  
  static {
    b b;
    Exception exception;
  }
  
  private static final a i;
  
  private static final Logger j = Logger.getLogger(os1.class.getName());
  
  private volatile Set<Throwable> k = null;
  
  private volatile int l;
  
  private static abstract class a {
    private a() {}
    
    abstract void a(os1 param1os1, Set<Throwable> param1Set1, Set<Throwable> param1Set2);
    
    abstract int b(os1 param1os1);
  }
  
  private static final class b extends a {
    private b() {
      super(null);
    }
    
    final void a(os1 param1os1, Set<Throwable> param1Set1, Set<Throwable> param1Set2) {
      // Byte code:
      //   0: aload_1
      //   1: monitorenter
      //   2: aload_1
      //   3: invokestatic C : (Lcom/google/android/gms/internal/ads/os1;)Ljava/util/Set;
      //   6: ifnonnull -> 15
      //   9: aload_1
      //   10: aload_3
      //   11: invokestatic D : (Lcom/google/android/gms/internal/ads/os1;Ljava/util/Set;)Ljava/util/Set;
      //   14: pop
      //   15: aload_1
      //   16: monitorexit
      //   17: return
      //   18: astore_2
      //   19: aload_1
      //   20: monitorexit
      //   21: aload_2
      //   22: athrow
      // Exception table:
      //   from	to	target	type
      //   2	15	18	finally
      //   15	17	18	finally
      //   19	21	18	finally
    }
    
    final int b(os1 param1os1) {
      // Byte code:
      //   0: aload_1
      //   1: monitorenter
      //   2: aload_1
      //   3: invokestatic G : (Lcom/google/android/gms/internal/ads/os1;)I
      //   6: istore_2
      //   7: aload_1
      //   8: monitorexit
      //   9: iload_2
      //   10: ireturn
      //   11: astore_3
      //   12: aload_1
      //   13: monitorexit
      //   14: aload_3
      //   15: athrow
      // Exception table:
      //   from	to	target	type
      //   2	9	11	finally
      //   12	14	11	finally
    }
  }
  
  private static final class c extends a {
    private final AtomicReferenceFieldUpdater<os1, Set<Throwable>> a;
    
    private final AtomicIntegerFieldUpdater<os1> b;
    
    c(AtomicReferenceFieldUpdater<os1, Set<Throwable>> param1AtomicReferenceFieldUpdater, AtomicIntegerFieldUpdater<os1> param1AtomicIntegerFieldUpdater) {
      super(null);
      this.a = param1AtomicReferenceFieldUpdater;
      this.b = param1AtomicIntegerFieldUpdater;
    }
    
    final void a(os1 param1os1, Set<Throwable> param1Set1, Set<Throwable> param1Set2) {
      this.a.compareAndSet(param1os1, null, param1Set2);
    }
    
    final int b(os1 param1os1) {
      return this.b.decrementAndGet(param1os1);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/os1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */