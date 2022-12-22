package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.tasks.h;
import java.util.concurrent.TimeUnit;

final class f0 implements f.a {
  f0(f paramf, h paramh, s.a parama, s.b paramb) {}
  
  public final void a(Status paramStatus) {
    i i;
    if (paramStatus.s0()) {
      i = this.a.b(0L, TimeUnit.MILLISECONDS);
      this.b.c(this.c.a(i));
      return;
    } 
    this.b.b((Exception)this.d.a((Status)i));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */