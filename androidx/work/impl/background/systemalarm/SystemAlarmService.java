package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleService;
import androidx.work.f;
import androidx.work.impl.utils.i;

public class SystemAlarmService extends LifecycleService implements e.c {
  private static final String c = f.f("SystemAlarmService");
  
  private e d;
  
  private boolean e;
  
  private void d() {
    e e1 = new e((Context)this);
    this.d = e1;
    e1.m(this);
  }
  
  public void b() {
    this.e = true;
    f.c().a(c, "All commands completed in dispatcher", new Throwable[0]);
    i.a();
    stopSelf();
  }
  
  public void onCreate() {
    super.onCreate();
    d();
    this.e = false;
  }
  
  public void onDestroy() {
    super.onDestroy();
    this.e = true;
    this.d.j();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    super.onStartCommand(paramIntent, paramInt1, paramInt2);
    if (this.e) {
      f.c().d(c, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
      this.d.j();
      d();
      this.e = false;
    } 
    if (paramIntent != null)
      this.d.a(paramIntent, paramInt2); 
    return 3;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/SystemAlarmService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */