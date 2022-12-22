package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.tasks.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class u0 {
  private final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap<BasePendingResult<?>, Boolean>());
  
  private final Map<h<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap<h<?>, Boolean>());
  
  private final void c(boolean paramBoolean, Status paramStatus) {
    synchronized (this.a) {
      Map<h<?>, Boolean> map;
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this((Map)this.a);
      synchronized (this.b) {
        null = new HashMap<BasePendingResult<?>, Boolean>();
        super((Map)this.b);
        for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
          if (paramBoolean || ((Boolean)entry.getValue()).booleanValue())
            ((BasePendingResult)entry.getKey()).l(paramStatus); 
        } 
        for (Map.Entry<BasePendingResult<?>, Boolean> entry1 : null.entrySet()) {
          if (paramBoolean || ((Boolean)entry1.getValue()).booleanValue())
            ((h)entry1.getKey()).d((Exception)new ApiException(paramStatus)); 
        } 
        return;
      } 
    } 
  }
  
  final void b(BasePendingResult<? extends i> paramBasePendingResult, boolean paramBoolean) {
    this.a.put(paramBasePendingResult, Boolean.valueOf(paramBoolean));
    paramBasePendingResult.a(new o(this, paramBasePendingResult));
  }
  
  final boolean d() {
    return (!this.a.isEmpty() || !this.b.isEmpty());
  }
  
  public final void e() {
    c(false, f.b);
  }
  
  public final void f() {
    c(true, j0.a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */