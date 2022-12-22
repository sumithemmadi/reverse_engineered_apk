package com.google.android.play.core.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class j0 {
  private final ConcurrentHashMap<i0, List<Throwable>> a = new ConcurrentHashMap<i0, List<Throwable>>(16, 0.75F, 10);
  
  private final ReferenceQueue<Throwable> b = new ReferenceQueue<Throwable>();
  
  public final List<Throwable> a(Throwable paramThrowable) {
    while (true) {
      Reference<? extends Throwable> reference = this.b.poll();
      if (reference != null) {
        this.a.remove(reference);
        continue;
      } 
      reference = new i0(paramThrowable, null);
      List<Throwable> list2 = this.a.get(reference);
      if (list2 != null)
        return list2; 
      list2 = new Vector<Throwable>(2);
      List<Throwable> list1 = this.a.putIfAbsent(new i0(paramThrowable, this.b), list2);
      return (list1 == null) ? list2 : list1;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */