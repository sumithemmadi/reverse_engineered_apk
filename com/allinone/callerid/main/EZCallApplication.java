package com.allinone.callerid.main;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import c.d.a.q;
import com.allinone.callerid.d.f.d;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.gg.AppOpenManager;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.danikula.videocache.f;
import com.google.android.gms.ads.n;
import com.tencent.mmkv.MMKV;
import org.xutils.x;

public class EZCallApplication extends Application {
  public static boolean b = false;
  
  private static EZCallApplication c;
  
  public boolean d = false;
  
  public boolean e = false;
  
  public String f = "en";
  
  public boolean g = true;
  
  public AppOpenManager h;
  
  public boolean i = true;
  
  public boolean j = true;
  
  private f k;
  
  private void b() {
    (j0.a()).b.execute(new c(this));
  }
  
  public static EZCallApplication c() {
    // Byte code:
    //   0: ldc com/allinone/callerid/main/EZCallApplication
    //   2: monitorenter
    //   3: getstatic com/allinone/callerid/main/EZCallApplication.c : Lcom/allinone/callerid/main/EZCallApplication;
    //   6: ifnonnull -> 21
    //   9: new com/allinone/callerid/main/EZCallApplication
    //   12: astore_0
    //   13: aload_0
    //   14: invokespecial <init> : ()V
    //   17: aload_0
    //   18: putstatic com/allinone/callerid/main/EZCallApplication.c : Lcom/allinone/callerid/main/EZCallApplication;
    //   21: getstatic com/allinone/callerid/main/EZCallApplication.c : Lcom/allinone/callerid/main/EZCallApplication;
    //   24: astore_0
    //   25: ldc com/allinone/callerid/main/EZCallApplication
    //   27: monitorexit
    //   28: aload_0
    //   29: areturn
    //   30: astore_0
    //   31: ldc com/allinone/callerid/main/EZCallApplication
    //   33: monitorexit
    //   34: aload_0
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   3	21	30	finally
    //   21	25	30	finally
  }
  
  public static f d(Context paramContext) {
    EZCallApplication eZCallApplication = (EZCallApplication)paramContext.getApplicationContext();
    f f2 = eZCallApplication.k;
    f f1 = f2;
    if (f2 == null) {
      f1 = eZCallApplication.f();
      eZCallApplication.k = f1;
    } 
    return f1;
  }
  
  private f f() {
    return (new f.b((Context)this)).d(1073741824L).c((com.danikula.videocache.q.c)new d()).a();
  }
  
  protected void attachBaseContext(Context paramContext) {
    super.attachBaseContext(paramContext);
    try {
      androidx.multidex.a.k((Context)this);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void e() {
    boolean bool = b1.z0();
    byte b = 0;
    if (bool)
      if (i1.i0(getApplicationContext())) {
        b1.T2(1);
      } else {
        b1.T2(0);
      }  
    int i = b1.A2();
    if (i == 1)
      b = 1; 
    if (b) {
      b = 2;
    } else {
      b = 1;
    } 
    androidx.appcompat.app.c.F(b);
    if (i != 0) {
      if (i != 1) {
        d1.c((Context)this, 2131820814);
      } else {
        d1.c((Context)this, 2131820776);
      } 
    } else {
      d1.c((Context)this, 2131820814);
    } 
  }
  
  public void onCreate() {
    try {
      boolean bool = com.google.android.play.core.missingsplits.b.a((Context)this).a();
    } finally {
      Exception exception = null;
    } 
    super.onCreate();
    if (d0.a)
      d0.a("tony", "Application--onCreate"); 
    try {
      c = this;
      com.android.boom.a.b((Context)this);
      a a = new a();
      this(this);
      n.a((Context)this, a);
      AppOpenManager appOpenManager = new AppOpenManager();
      this(this);
      this.h = appOpenManager;
      e();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(getFilesDir().getAbsolutePath());
      stringBuilder.append("/mmkv");
      String str = stringBuilder.toString();
      b b = new b();
      this(this);
      MMKV.p(str, b);
      b();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements com.google.android.gms.ads.initialization.b {
    a(EZCallApplication this$0) {}
    
    public void a(com.google.android.gms.ads.initialization.a param1a) {}
  }
  
  class b implements MMKV.b {
    b(EZCallApplication this$0) {}
    
    public void a(String param1String) {
      try {
        com.getkeepsafe.relinker.b.a(this.a.getApplicationContext(), param1String);
      } finally {
        param1String = null;
      } 
    }
  }
  
  class c implements Runnable {
    c(EZCallApplication this$0) {}
    
    public void run() {
      try {
        Process.setThreadPriority(10);
        x.Ext.init(EZCallApplication.a());
        com.allinone.callerid.f.j.b.a().b();
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
          StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
          this();
          StrictMode.setVmPolicy(builder.build());
          builder.detectFileUriExposure();
        } 
        if (i1.m0())
          c.e.a.a.a.a(EZCallApplication.a()); 
        this.b.f = b1.y0();
        this.b.g = b1.p0();
        d0.b(this.b.getApplicationContext());
        q.h(this.b.getApplicationContext());
      } finally {
        Exception exception = null;
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/main/EZCallApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */