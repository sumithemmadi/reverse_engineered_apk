package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.t;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a implements ServiceConnection {
  private boolean a = false;
  
  private final BlockingQueue<IBinder> b = new LinkedBlockingQueue<IBinder>();
  
  public IBinder a() {
    t.i("BlockingServiceConnection.getService() called on main thread");
    if (!this.a) {
      this.a = true;
      return this.b.take();
    } 
    throw new IllegalStateException("Cannot call get on this connection more than once");
  }
  
  public IBinder b(long paramLong, TimeUnit paramTimeUnit) {
    t.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
    if (!this.a) {
      this.a = true;
      IBinder iBinder = this.b.poll(paramLong, paramTimeUnit);
      if (iBinder != null)
        return iBinder; 
      throw new TimeoutException("Timed out waiting for the service connection");
    } 
    throw new IllegalStateException("Cannot call get on this connection more than once");
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    this.b.add(paramIBinder);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */