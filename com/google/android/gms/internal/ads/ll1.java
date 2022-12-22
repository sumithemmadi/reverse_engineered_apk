package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public abstract class ll1<E> {
  private static final ot1<?> a = dt1.h(null);
  
  private final nt1 b;
  
  private final ScheduledExecutorService c;
  
  private final yl1<E> d;
  
  public ll1(nt1 paramnt1, ScheduledExecutorService paramScheduledExecutorService, yl1<E> paramyl1) {
    this.b = paramnt1;
    this.c = paramScheduledExecutorService;
    this.d = paramyl1;
  }
  
  public final nl1 a(E paramE, ot1<?>... paramVarArgs) {
    return new nl1(this, paramE, Arrays.asList(paramVarArgs), null);
  }
  
  public final <I> sl1<I> b(E paramE, ot1<I> paramot1) {
    return new sl1<I>(this, paramE, null, paramot1, Collections.singletonList(paramot1), paramot1, null);
  }
  
  public final pl1 g(E paramE) {
    return new pl1(this, paramE, null);
  }
  
  protected abstract String h(E paramE);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ll1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */