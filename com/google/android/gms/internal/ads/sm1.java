package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

final class sm1 implements pm1 {
  private final pm1 a;
  
  private final Queue<rm1> b;
  
  private final int c;
  
  private final AtomicBoolean d;
  
  public sm1(pm1 parampm1, ScheduledExecutorService paramScheduledExecutorService) {
    this.a = parampm1;
    this.b = new LinkedBlockingQueue<rm1>();
    x<Integer> x = m0.f6;
    this.c = ((Integer)er2.e().<Integer>c(x)).intValue();
    this.d = new AtomicBoolean(false);
    x = m0.e6;
    int i = ((Integer)er2.e().<Integer>c(x)).intValue();
    vm1 vm1 = new vm1(this);
    long l = i;
    paramScheduledExecutorService.scheduleAtFixedRate(vm1, l, l, TimeUnit.MILLISECONDS);
  }
  
  public final String a(rm1 paramrm1) {
    return this.a.a(paramrm1);
  }
  
  public final void b(rm1 paramrm1) {
    Map<String, String> map;
    if (this.b.size() >= this.c) {
      if (!this.d.getAndSet(true)) {
        Queue<rm1> queue = this.b;
        rm1 rm11 = rm1.d("dropped_event");
        map = paramrm1.g();
        if (map.containsKey("action"))
          rm11.i("dropped_action", map.get("action")); 
        queue.offer(rm11);
        return;
      } 
    } else {
      this.b.offer(map);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */