package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements h {
  private final q b = new q(this);
  
  public Lifecycle a() {
    return this.b.a();
  }
  
  public IBinder onBind(Intent paramIntent) {
    this.b.b();
    return null;
  }
  
  public void onCreate() {
    this.b.c();
    super.onCreate();
  }
  
  public void onDestroy() {
    this.b.d();
    super.onDestroy();
  }
  
  public void onStart(Intent paramIntent, int paramInt) {
    this.b.e();
    super.onStart(paramIntent, paramInt);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/LifecycleService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */