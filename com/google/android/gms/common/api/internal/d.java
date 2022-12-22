package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.v;

public abstract class d<R extends i, A extends a.b> extends BasePendingResult<R> {
  private final a.c<A> q;
  
  private final a<?> r;
  
  protected d(a<?> parama, com.google.android.gms.common.api.d paramd) {
    super((com.google.android.gms.common.api.d)t.k(paramd, "GoogleApiClient must not be null"));
    t.k(parama, "Api must not be null");
    this.q = parama.a();
    this.r = parama;
  }
  
  private void q(RemoteException paramRemoteException) {
    r(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }
  
  protected abstract void n(A paramA);
  
  protected void o(R paramR) {}
  
  public final void p(A paramA) {
    a.h h;
    A a1 = paramA;
    if (paramA instanceof v)
      h = ((v)paramA).n0(); 
    try {
      n((A)h);
      return;
    } catch (DeadObjectException deadObjectException) {
      q((RemoteException)deadObjectException);
      throw deadObjectException;
    } catch (RemoteException remoteException) {
      q(remoteException);
      return;
    } 
  }
  
  public final void r(Status paramStatus) {
    t.b(paramStatus.s0() ^ true, "Failed result must not be success");
    paramStatus = (Status)c(paramStatus);
    f((R)paramStatus);
    o((R)paramStatus);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */