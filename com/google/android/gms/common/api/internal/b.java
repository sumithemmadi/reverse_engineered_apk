package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.r;

public final class b<O extends a.d> {
  private final boolean a = false;
  
  private final int b;
  
  private final a<O> c;
  
  private final O d;
  
  private b(a<O> parama, O paramO) {
    this.c = parama;
    this.d = paramO;
    this.b = r.b(new Object[] { parama, paramO });
  }
  
  public static <O extends a.d> b<O> b(a<O> parama, O paramO) {
    return new b<O>(parama, paramO);
  }
  
  public final String a() {
    return this.c.b();
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    return (!this.a && !((b)paramObject).a && r.a(this.c, ((b)paramObject).c) && r.a(this.d, ((b)paramObject).d));
  }
  
  public final int hashCode() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */