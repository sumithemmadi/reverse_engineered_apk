package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.o;

public abstract class d0 {
  private final int a;
  
  public d0(int paramInt) {
    this.a = paramInt;
  }
  
  private static Status a(RemoteException paramRemoteException) {
    StringBuilder stringBuilder = new StringBuilder();
    if (o.b() && paramRemoteException instanceof android.os.TransactionTooLargeException)
      stringBuilder.append("TransactionTooLargeException: "); 
    stringBuilder.append(paramRemoteException.getLocalizedMessage());
    return new Status(8, stringBuilder.toString());
  }
  
  public abstract void b(Status paramStatus);
  
  public abstract void c(u0 paramu0, boolean paramBoolean);
  
  public abstract void d(RuntimeException paramRuntimeException);
  
  public abstract void f(f.a<?> parama);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */