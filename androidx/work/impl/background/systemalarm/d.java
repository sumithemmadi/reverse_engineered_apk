package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.f;
import androidx.work.impl.a;
import androidx.work.impl.k.c;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.i;
import java.util.Collections;
import java.util.List;

public class d implements c, a, g.b {
  private static final String b = f.f("DelayMetCommandHandler");
  
  private final Context c;
  
  private final int d;
  
  private final String e;
  
  private final e f;
  
  private final androidx.work.impl.k.d g;
  
  private final Object h;
  
  private int i;
  
  private PowerManager.WakeLock j;
  
  private boolean k;
  
  d(Context paramContext, int paramInt, String paramString, e parame) {
    this.c = paramContext;
    this.d = paramInt;
    this.f = parame;
    this.e = paramString;
    this.g = new androidx.work.impl.k.d(paramContext, parame.f(), this);
    this.k = false;
    this.i = 0;
    this.h = new Object();
  }
  
  private void d() {
    synchronized (this.h) {
      this.g.e();
      this.f.h().c(this.e);
      PowerManager.WakeLock wakeLock = this.j;
      if (wakeLock != null && wakeLock.isHeld()) {
        f.c().a(b, String.format("Releasing wakelock %s for WorkSpec %s", new Object[] { this.j, this.e }), new Throwable[0]);
        this.j.release();
      } 
      return;
    } 
  }
  
  private void g() {
    synchronized (this.h) {
      if (this.i < 2) {
        e.b b2;
        this.i = 2;
        f f = f.c();
        String str = b;
        f.a(str, String.format("Stopping work for WorkSpec %s", new Object[] { this.e }), new Throwable[0]);
        Intent intent = b.g(this.c, this.e);
        e e1 = this.f;
        e.b b1 = new e.b();
        this(e1, intent, this.d);
        e1.k(b1);
        if (this.f.e().d(this.e)) {
          f.c().a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[] { this.e }), new Throwable[0]);
          Intent intent1 = b.f(this.c, this.e);
          e1 = this.f;
          b2 = new e.b();
          this(e1, intent1, this.d);
          e1.k(b2);
        } else {
          f.c().a((String)b2, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[] { this.e }), new Throwable[0]);
        } 
      } else {
        f.c().a(b, String.format("Already stopped work for %s", new Object[] { this.e }), new Throwable[0]);
      } 
      return;
    } 
  }
  
  public void a(String paramString) {
    f.c().a(b, String.format("Exceeded time limits on execution for %s", new Object[] { paramString }), new Throwable[0]);
    g();
  }
  
  public void b(List<String> paramList) {
    g();
  }
  
  public void c(String paramString, boolean paramBoolean) {
    f.c().a(b, String.format("onExecuted %s, %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) }), new Throwable[0]);
    d();
    if (paramBoolean) {
      Intent intent = b.f(this.c, this.e);
      e e1 = this.f;
      e1.k(new e.b(e1, intent, this.d));
    } 
    if (this.k) {
      Intent intent = b.a(this.c);
      e e1 = this.f;
      e1.k(new e.b(e1, intent, this.d));
    } 
  }
  
  public void e(List<String> paramList) {
    if (!paramList.contains(this.e))
      return; 
    synchronized (this.h) {
      if (this.i == 0) {
        this.i = 1;
        f.c().a(b, String.format("onAllConstraintsMet for %s", new Object[] { this.e }), new Throwable[0]);
        if (this.f.e().f(this.e)) {
          this.f.h().b(this.e, 600000L, this);
        } else {
          d();
        } 
      } else {
        f.c().a(b, String.format("Already started work for %s", new Object[] { this.e }), new Throwable[0]);
      } 
      return;
    } 
  }
  
  void f() {
    this.j = i.b(this.c, String.format("%s (%s)", new Object[] { this.e, Integer.valueOf(this.d) }));
    f f = f.c();
    String str = b;
    f.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[] { this.j, this.e }), new Throwable[0]);
    this.j.acquire();
    j j = this.f.g().n().y().m(this.e);
    if (j == null) {
      g();
      return;
    } 
    boolean bool = j.b();
    this.k = bool;
    if (!bool) {
      f.c().a(str, String.format("No constraints for %s", new Object[] { this.e }), new Throwable[0]);
      e(Collections.singletonList(this.e));
    } else {
      this.g.d(Collections.singletonList(j));
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */