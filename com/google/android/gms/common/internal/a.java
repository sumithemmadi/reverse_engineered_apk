package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

public class a extends l.a {
  public static Account o1(l paraml) {
    if (paraml != null) {
      long l1 = Binder.clearCallingIdentity();
      try {
        Account account = paraml.zza();
        Binder.restoreCallingIdentity(l1);
      } catch (RemoteException remoteException) {
        Log.w("AccountAccessor", "Remote account accessor probably died");
        Binder.restoreCallingIdentity(l1);
        remoteException = null;
      } finally {}
      return (Account)t.j(paraml);
    } 
    paraml = null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */