package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.t;
import java.util.HashMap;
import java.util.List;

public abstract class DownloadService extends Service {
  private static final HashMap<Class<? extends DownloadService>, b> b = new HashMap<Class<? extends DownloadService>, b>();
  
  private final c c;
  
  private final String d;
  
  private final int e;
  
  private final int f;
  
  private d g;
  
  private int h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private boolean l;
  
  private static Intent e(Context paramContext, Class<? extends DownloadService> paramClass, String paramString) {
    return (new Intent(paramContext, paramClass)).setAction(paramString);
  }
  
  private boolean g() {
    return this.k;
  }
  
  private static boolean h(int paramInt) {
    return (paramInt == 2 || paramInt == 5 || paramInt == 7);
  }
  
  private void i(List<b> paramList) {
    if (this.c != null) {
      byte b = 0;
      while (b < paramList.size()) {
        if (!h(((b)paramList.get(b)).a)) {
          b++;
          continue;
        } 
        throw null;
      } 
    } 
  }
  
  private void j() {
    if (this.c == null) {
      if (h0.a < 28 && this.j) {
        stopSelf();
        this.k = true;
      } else {
        this.k |= stopSelfResult(this.h);
      } 
      return;
    } 
    throw null;
  }
  
  protected abstract d d();
  
  protected abstract com.google.android.exoplayer2.scheduler.c f();
  
  public final IBinder onBind(Intent paramIntent) {
    throw new UnsupportedOperationException();
  }
  
  public void onCreate() {
    String str = this.d;
    if (str != null)
      t.a((Context)this, str, this.e, this.f, 2); 
    Class<?> clazz = getClass();
    HashMap<Class<? extends DownloadService>, b> hashMap = b;
    b b = hashMap.get(clazz);
    if (b == null) {
      boolean bool;
      if (this.c != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        com.google.android.exoplayer2.scheduler.c c1 = f();
      } else {
        b = null;
      } 
      d d1 = d();
      this.g = d1;
      d1.n();
      b = new b(getApplicationContext(), this.g, bool, (com.google.android.exoplayer2.scheduler.c)b, clazz, null);
      hashMap.put(clazz, b);
    } else {
      this.g = b.c(b);
    } 
    b.d(this);
  }
  
  public void onDestroy() {
    this.l = true;
    ((b)e.e(b.get(getClass()))).e(this);
    if (this.c == null)
      return; 
    throw null;
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder;
    Requirements requirements;
    String str1;
    String str2;
    DownloadRequest downloadRequest;
    this.h = paramInt2;
    this.j = false;
    if (paramIntent != null) {
      str1 = paramIntent.getAction();
      str2 = paramIntent.getStringExtra("content_id");
      int i = this.i;
      if (paramIntent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(str1)) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      } 
      this.i = i | paramInt1;
    } else {
      str1 = null;
      str2 = str1;
    } 
    String str3 = str1;
    if (str1 == null)
      str3 = "com.google.android.exoplayer.downloadService.action.INIT"; 
    d d1 = (d)e.e(this.g);
    byte b = -1;
    switch (str3.hashCode()) {
      case 1547520644:
        if (!str3.equals("com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD"))
          break; 
        b = 8;
        break;
      case 1015676687:
        if (!str3.equals("com.google.android.exoplayer.downloadService.action.INIT"))
          break; 
        b = 7;
        break;
      case 671523141:
        if (!str3.equals("com.google.android.exoplayer.downloadService.action.SET_STOP_REASON"))
          break; 
        b = 6;
        break;
      case 191112771:
        if (!str3.equals("com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS"))
          break; 
        b = 5;
        break;
      case -119057172:
        if (!str3.equals("com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS"))
          break; 
        b = 4;
        break;
      case -650547439:
        if (!str3.equals("com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS"))
          break; 
        b = 3;
        break;
      case -871181424:
        if (!str3.equals("com.google.android.exoplayer.downloadService.action.RESTART"))
          break; 
        b = 2;
        break;
      case -932047176:
        if (!str3.equals("com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS"))
          break; 
        b = 1;
        break;
      case -1931239035:
        if (!str3.equals("com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Ignored unrecognized action: ");
        stringBuilder.append(str3);
        o.c("DownloadService", stringBuilder.toString());
        break;
      case 8:
        if (str2 == null) {
          o.c("DownloadService", "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
          break;
        } 
        d1.m(str2);
        break;
      case 6:
        if (!stringBuilder.hasExtra("stop_reason")) {
          o.c("DownloadService", "Ignored SET_STOP_REASON: Missing stop_reason extra");
          break;
        } 
        d1.q(str2, stringBuilder.getIntExtra("stop_reason", 0));
        break;
      case 5:
        d1.k();
        break;
      case 4:
        requirements = (Requirements)stringBuilder.getParcelableExtra("requirements");
        if (requirements == null) {
          o.c("DownloadService", "Ignored SET_REQUIREMENTS: Missing requirements extra");
          break;
        } 
        d1.p(requirements);
        break;
      case 3:
        d1.l();
        break;
      case 1:
        d1.n();
        break;
      case 0:
        downloadRequest = (DownloadRequest)requirements.getParcelableExtra("download_request");
        if (downloadRequest == null) {
          o.c("DownloadService", "Ignored ADD_DOWNLOAD: Missing download_request extra");
          break;
        } 
        d1.a(downloadRequest, requirements.getIntExtra("stop_reason", 0));
        break;
      case 2:
      case 7:
        break;
    } 
    if (h0.a < 26 || !this.i || this.c == null) {
      this.k = false;
      if (d1.f())
        j(); 
      return 1;
    } 
    throw null;
  }
  
  public void onTaskRemoved(Intent paramIntent) {
    this.j = true;
  }
  
  private static final class b implements d.a {
    private final Context a;
    
    private final d b;
    
    private final boolean c;
    
    private final com.google.android.exoplayer2.scheduler.c d;
    
    private final Class<? extends DownloadService> e;
    
    private DownloadService f;
    
    private b(Context param1Context, d param1d, boolean param1Boolean, com.google.android.exoplayer2.scheduler.c param1c, Class<? extends DownloadService> param1Class) {
      this.a = param1Context;
      this.b = param1d;
      this.c = param1Boolean;
      this.d = param1c;
      this.e = param1Class;
      param1d.b(this);
      j();
    }
    
    private void h() {
      if (this.c) {
        Intent intent = DownloadService.c(this.a, this.e, "com.google.android.exoplayer.downloadService.action.RESTART");
        h0.q0(this.a, intent);
      } else {
        try {
          Intent intent = DownloadService.c(this.a, this.e, "com.google.android.exoplayer.downloadService.action.INIT");
          this.a.startService(intent);
        } catch (IllegalArgumentException illegalArgumentException) {
          o.f("DownloadService", "Failed to restart DownloadService (process is idle).");
        } 
      } 
    }
    
    private boolean i() {
      DownloadService downloadService = this.f;
      return (downloadService == null || DownloadService.b(downloadService));
    }
    
    private void j() {
      if (this.d == null)
        return; 
      if (this.b.h()) {
        String str = this.a.getPackageName();
        Requirements requirements = this.b.e();
        if (!this.d.a(requirements, str, "com.google.android.exoplayer.downloadService.action.RESTART"))
          o.c("DownloadService", "Scheduling downloads failed."); 
      } else {
        this.d.cancel();
      } 
    }
    
    public void a(d param1d, boolean param1Boolean) {
      if (!param1Boolean && !param1d.d() && i()) {
        List<b> list = param1d.c();
        for (byte b1 = 0; b1 < list.size(); b1++) {
          if (((b)list.get(b1)).a == 0) {
            h();
            break;
          } 
        } 
      } 
      j();
    }
    
    public void d(DownloadService param1DownloadService) {
      boolean bool;
      if (this.f == null) {
        bool = true;
      } else {
        bool = false;
      } 
      e.f(bool);
      this.f = param1DownloadService;
      if (this.b.g())
        (new Handler()).postAtFrontOfQueue(new a(this, param1DownloadService)); 
    }
    
    public void e(DownloadService param1DownloadService) {
      boolean bool;
      if (this.f == param1DownloadService) {
        bool = true;
      } else {
        bool = false;
      } 
      e.f(bool);
      this.f = null;
      if (this.d != null && !this.b.h())
        this.d.cancel(); 
    }
  }
  
  private final class c {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/offline/DownloadService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */