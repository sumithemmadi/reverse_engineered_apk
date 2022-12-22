package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

public class v<T extends IInterface> extends h<T> {
  private final a.h<T> H;
  
  protected void J(int paramInt, T paramT) {
    this.H.j(paramInt, (IInterface)paramT);
  }
  
  protected String l() {
    return this.H.l();
  }
  
  protected T m(IBinder paramIBinder) {
    return (T)this.H.m(paramIBinder);
  }
  
  public a.h<T> n0() {
    return this.H;
  }
  
  protected String r() {
    return this.H.r();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */