package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import java.util.List;

final class iw implements et1<String> {
  iw(jw paramjw) {}
  
  public final void a(Throwable paramThrowable) {
    int i;
    ni1 ni1 = jw.C(this.a);
    List<String> list = jw.y(this.a).d(jw.n(this.a), jw.t(this.a), false, "", "failure_click_attok", (jw.t(this.a)).c);
    q.c();
    if (h1.O(jw.B(this.a))) {
      i = qu0.b;
    } else {
      i = qu0.a;
    } 
    ni1.a(list, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/iw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */