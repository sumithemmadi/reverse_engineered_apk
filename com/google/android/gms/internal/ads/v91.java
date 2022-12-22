package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

public final class v91<T> {
  private final Set<s91<? extends t91<T>>> a;
  
  private final Executor b;
  
  public v91(Executor paramExecutor, Set<s91<? extends t91<T>>> paramSet) {
    this.b = paramExecutor;
    this.a = paramSet;
  }
  
  public final ot1<T> a(T paramT) {
    ArrayList<ot1> arrayList = new ArrayList(this.a.size());
    for (s91<? extends t91<T>> s91 : this.a) {
      ot1 ot1 = s91.a();
      if (((Boolean)i2.a.a()).booleanValue())
        ot1.a(new u91(s91, q.j().b()), fm.f); 
      arrayList.add(ot1);
    } 
    return dt1.p((Iterable)arrayList).a(new x91(arrayList, paramT), this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */