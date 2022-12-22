package com.google.android.gms.common.api.internal;

import b.e.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.h;
import java.util.Map;
import java.util.Set;

public final class o0 {
  private final a<b<?>, ConnectionResult> a;
  
  private final a<b<?>, String> b;
  
  private final h<Map<b<?>, String>> c;
  
  private int d;
  
  private boolean e;
  
  public final void a(b<?> paramb, ConnectionResult paramConnectionResult, String paramString) {
    this.a.put(paramb, paramConnectionResult);
    this.b.put(paramb, paramString);
    this.d--;
    if (!paramConnectionResult.s0())
      this.e = true; 
    if (this.d == 0) {
      if (this.e) {
        AvailabilityException availabilityException = new AvailabilityException(this.a);
        this.c.b((Exception)availabilityException);
        return;
      } 
      this.c.c(this.b);
    } 
  }
  
  public final Set<b<?>> b() {
    return this.a.keySet();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */