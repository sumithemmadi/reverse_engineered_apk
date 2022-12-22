package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

final class p {
  private final Messenger a;
  
  private final zza b;
  
  p(IBinder paramIBinder) {
    String str2 = paramIBinder.getInterfaceDescriptor();
    if ("android.os.IMessenger".equals(str2)) {
      this.a = new Messenger(paramIBinder);
      this.b = null;
      return;
    } 
    if ("com.google.android.gms.iid.IMessengerCompat".equals(str2)) {
      this.b = new zza(paramIBinder);
      this.a = null;
      return;
    } 
    String str1 = String.valueOf(str2);
    if (str1.length() != 0) {
      str1 = "Invalid interface descriptor: ".concat(str1);
    } else {
      str1 = new String("Invalid interface descriptor: ");
    } 
    Log.w("MessengerIpcClient", str1);
    throw new RemoteException();
  }
  
  final void a(Message paramMessage) {
    Messenger messenger = this.a;
    if (messenger != null) {
      messenger.send(paramMessage);
      return;
    } 
    zza zza1 = this.b;
    if (zza1 != null) {
      zza1.b(paramMessage);
      return;
    } 
    throw new IllegalStateException("Both messengers are null");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */