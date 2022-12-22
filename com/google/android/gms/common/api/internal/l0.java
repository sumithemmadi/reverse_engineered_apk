package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;

public final class l0<A extends d<? extends i, a.b>> extends d0 {
  private final A b;
  
  public l0(int paramInt, A paramA) {
    super(paramInt);
    this.b = paramA;
  }
  
  public final void b(Status paramStatus) {
    this.b.r(paramStatus);
  }
  
  public final void c(u0 paramu0, boolean paramBoolean) {
    paramu0.b((BasePendingResult<? extends i>)this.b, paramBoolean);
  }
  
  public final void d(RuntimeException paramRuntimeException) {
    String str1 = paramRuntimeException.getClass().getSimpleName();
    String str2 = paramRuntimeException.getLocalizedMessage();
    StringBuilder stringBuilder = new StringBuilder(str1.length() + 2 + String.valueOf(str2).length());
    stringBuilder.append(str1);
    stringBuilder.append(": ");
    stringBuilder.append(str2);
    Status status = new Status(10, stringBuilder.toString());
    this.b.r(status);
  }
  
  public final void f(f.a<?> parama) {
    try {
      this.b.p(parama.l());
      return;
    } catch (RuntimeException runtimeException) {
      super.d(runtimeException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */