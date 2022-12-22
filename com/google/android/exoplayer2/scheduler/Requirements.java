package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;

public final class Requirements implements Parcelable {
  public static final Parcelable.Creator<Requirements> CREATOR = new a();
  
  private final int b;
  
  public Requirements(int paramInt) {
    int i = paramInt;
    if ((paramInt & 0x2) != 0)
      i = paramInt | 0x1; 
    this.b = i;
  }
  
  private int b(Context paramContext) {
    if (!i())
      return 0; 
    ConnectivityManager connectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    NetworkInfo networkInfo = ((ConnectivityManager)e.e(connectivityManager)).getActiveNetworkInfo();
    return (networkInfo == null || !networkInfo.isConnected() || !h(connectivityManager)) ? (this.b & 0x3) : ((j() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0);
  }
  
  private boolean e(Context paramContext) {
    Intent intent = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    boolean bool = false;
    if (intent == null)
      return false; 
    int i = intent.getIntExtra("status", -1);
    if (i == 2 || i == 5)
      bool = true; 
    return bool;
  }
  
  private boolean f(Context paramContext) {
    PowerManager powerManager = (PowerManager)paramContext.getSystemService("power");
    int i = h0.a;
    boolean bool = true;
    if (i >= 23) {
      bool = powerManager.isDeviceIdleMode();
    } else if ((i >= 20) ? !powerManager.isInteractive() : !powerManager.isScreenOn()) {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean h(ConnectivityManager paramConnectivityManager) {
    int i = h0.a;
    boolean bool = true;
    if (i < 24)
      return true; 
    Network network = paramConnectivityManager.getActiveNetwork();
    if (network == null)
      return false; 
    NetworkCapabilities networkCapabilities = paramConnectivityManager.getNetworkCapabilities(network);
    if (networkCapabilities == null || !networkCapabilities.hasCapability(16))
      bool = false; 
    return bool;
  }
  
  public boolean a(Context paramContext) {
    boolean bool;
    if (c(paramContext) == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int c(Context paramContext) {
    int i = b(paramContext);
    int j = i;
    if (d()) {
      j = i;
      if (!e(paramContext))
        j = i | 0x8; 
    } 
    i = j;
    if (g()) {
      i = j;
      if (!f(paramContext))
        i = j | 0x4; 
    } 
    return i;
  }
  
  public boolean d() {
    boolean bool;
    if ((this.b & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || Requirements.class != paramObject.getClass())
      return false; 
    if (this.b != ((Requirements)paramObject).b)
      bool = false; 
    return bool;
  }
  
  public boolean g() {
    boolean bool;
    if ((this.b & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int hashCode() {
    return this.b;
  }
  
  public boolean i() {
    int i = this.b;
    boolean bool = true;
    if ((i & 0x1) == 0)
      bool = false; 
    return bool;
  }
  
  public boolean j() {
    boolean bool;
    if ((this.b & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
  }
  
  static final class a implements Parcelable.Creator<Requirements> {
    public Requirements a(Parcel param1Parcel) {
      return new Requirements(param1Parcel.readInt());
    }
    
    public Requirements[] b(int param1Int) {
      return new Requirements[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/scheduler/Requirements.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */