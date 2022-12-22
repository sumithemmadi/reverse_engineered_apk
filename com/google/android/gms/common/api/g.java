package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.t;

public final class g {
  public static <R extends i> f<R> a(R paramR, d paramd) {
    t.k(paramR, "Result must not be null");
    t.b(paramR.c().s0() ^ true, "Status code must not be SUCCESS");
    a<R> a = new a<R>(paramd, paramR);
    a.f((i)paramR);
    return (f<R>)a;
  }
  
  public static f<Status> b(Status paramStatus, d paramd) {
    t.k(paramStatus, "Result must not be null");
    n n = new n(paramd);
    n.f(paramStatus);
    return (f<Status>)n;
  }
  
  private static final class a<R extends i> extends BasePendingResult<R> {
    private final R q;
    
    public a(d param1d, R param1R) {
      super(param1d);
      this.q = param1R;
    }
    
    protected final R c(Status param1Status) {
      return this.q;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */