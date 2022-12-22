package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.h;

abstract class m0<T> extends s {
  protected final h<T> b;
  
  public m0(int paramInt, h<T> paramh) {
    super(paramInt);
    this.b = paramh;
  }
  
  public void b(Status paramStatus) {
    this.b.d((Exception)new ApiException(paramStatus));
  }
  
  public void d(RuntimeException paramRuntimeException) {
    this.b.d(paramRuntimeException);
  }
  
  public final void f(f.a<?> parama) {
    try {
      i(parama);
      return;
    } catch (DeadObjectException deadObjectException) {
      super.b(d0.e((RemoteException)deadObjectException));
      throw deadObjectException;
    } catch (RemoteException remoteException) {
      super.b(d0.e(remoteException));
      return;
    } catch (RuntimeException runtimeException) {
      super.d(runtimeException);
      return;
    } 
  }
  
  protected abstract void i(f.a<?> parama);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */