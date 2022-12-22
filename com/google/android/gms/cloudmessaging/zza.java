package com.google.android.gms.cloudmessaging;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class zza implements Parcelable {
  public static final Parcelable.Creator<zza> CREATOR = new d();
  
  private Messenger b;
  
  private a c;
  
  public zza(IBinder paramIBinder) {
    if (Build.VERSION.SDK_INT >= 21) {
      this.b = new Messenger(paramIBinder);
      return;
    } 
    this.c = new a.a(paramIBinder);
  }
  
  private final IBinder a() {
    Messenger messenger = this.b;
    return (messenger != null) ? messenger.getBinder() : this.c.asBinder();
  }
  
  public final void b(Message paramMessage) {
    Messenger messenger = this.b;
    if (messenger != null) {
      messenger.send(paramMessage);
      return;
    } 
    this.c.t2(paramMessage);
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == null)
      return false; 
    try {
      return a().equals(((zza)paramObject).a());
    } catch (ClassCastException classCastException) {
      return false;
    } 
  }
  
  public int hashCode() {
    return a().hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    Messenger messenger = this.b;
    if (messenger != null) {
      paramParcel.writeStrongBinder(messenger.getBinder());
      return;
    } 
    paramParcel.writeStrongBinder(this.c.asBinder());
  }
  
  public static final class a extends ClassLoader {
    protected final Class<?> loadClass(String param1String, boolean param1Boolean) {
      if ("com.google.android.gms.iid.MessengerCompat".equals(param1String)) {
        boolean bool;
        if (Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3))) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class"); 
        return zza.class;
      } 
      return super.loadClass(param1String, param1Boolean);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */