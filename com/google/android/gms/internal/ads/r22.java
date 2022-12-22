package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class r22 {
  private final ConcurrentHashMap<q22, List<Throwable>> a = new ConcurrentHashMap<q22, List<Throwable>>(16, 0.75F, 10);
  
  private final ReferenceQueue<Throwable> b = new ReferenceQueue<Throwable>();
  
  public final List<Throwable> a(Throwable paramThrowable, boolean paramBoolean) {
    Reference<? extends Throwable> reference;
    for (reference = this.b.poll(); reference != null; reference = this.b.poll())
      this.a.remove(reference); 
    reference = new q22(paramThrowable, null);
    List<Throwable> list2 = this.a.get(reference);
    if (!paramBoolean)
      return list2; 
    if (list2 != null)
      return list2; 
    list2 = new Vector<Throwable>(2);
    List<Throwable> list1 = this.a.putIfAbsent(new q22(paramThrowable, this.b), list2);
    return (list1 == null) ? list2 : list1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/r22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */