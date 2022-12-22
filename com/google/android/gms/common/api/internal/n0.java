package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.h;

public final class n0 extends m0<Boolean> {
  private final i<?> c;
  
  public n0(i<?> parami, h<Boolean> paramh) {
    super(4, paramh);
    this.c = parami;
  }
  
  public final Feature[] g(f.a<?> parama) {
    if ((c0)parama.u().get(this.c) == null)
      return null; 
    throw null;
  }
  
  public final boolean h(f.a<?> parama) {
    if ((c0)parama.u().get(this.c) == null)
      return false; 
    throw null;
  }
  
  public final void i(f.a<?> parama) {
    if ((c0)parama.u().remove(this.c) == null) {
      this.b.e(Boolean.FALSE);
      return;
    } 
    parama.l();
    throw null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */