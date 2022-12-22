package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.f;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.l.j;
import java.util.HashMap;
import java.util.Map;

public class b implements a {
  private static final String b = f.f("CommandHandler");
  
  private final Context c;
  
  private final Map<String, a> d;
  
  private final Object e;
  
  b(Context paramContext) {
    this.c = paramContext;
    this.d = new HashMap<String, a>();
    this.e = new Object();
  }
  
  static Intent a(Context paramContext) {
    Intent intent = new Intent(paramContext, SystemAlarmService.class);
    intent.setAction("ACTION_CONSTRAINTS_CHANGED");
    return intent;
  }
  
  static Intent b(Context paramContext, String paramString) {
    Intent intent = new Intent(paramContext, SystemAlarmService.class);
    intent.setAction("ACTION_DELAY_MET");
    intent.putExtra("KEY_WORKSPEC_ID", paramString);
    return intent;
  }
  
  static Intent d(Context paramContext, String paramString, boolean paramBoolean) {
    Intent intent = new Intent(paramContext, SystemAlarmService.class);
    intent.setAction("ACTION_EXECUTION_COMPLETED");
    intent.putExtra("KEY_WORKSPEC_ID", paramString);
    intent.putExtra("KEY_NEEDS_RESCHEDULE", paramBoolean);
    return intent;
  }
  
  static Intent e(Context paramContext) {
    Intent intent = new Intent(paramContext, SystemAlarmService.class);
    intent.setAction("ACTION_RESCHEDULE");
    return intent;
  }
  
  static Intent f(Context paramContext, String paramString) {
    Intent intent = new Intent(paramContext, SystemAlarmService.class);
    intent.setAction("ACTION_SCHEDULE_WORK");
    intent.putExtra("KEY_WORKSPEC_ID", paramString);
    return intent;
  }
  
  static Intent g(Context paramContext, String paramString) {
    Intent intent = new Intent(paramContext, SystemAlarmService.class);
    intent.setAction("ACTION_STOP_WORK");
    intent.putExtra("KEY_WORKSPEC_ID", paramString);
    return intent;
  }
  
  private void h(Intent paramIntent, int paramInt, e parame) {
    f.c().a(b, String.format("Handling constraints changed %s", new Object[] { paramIntent }), new Throwable[0]);
    (new c(this.c, paramInt, parame)).a();
  }
  
  private void i(Intent paramIntent, int paramInt, e parame) {
    Bundle bundle = paramIntent.getExtras();
    synchronized (this.e) {
      String str1 = bundle.getString("KEY_WORKSPEC_ID");
      f f = f.c();
      String str2 = b;
      f.a(str2, String.format("Handing delay met for %s", new Object[] { str1 }), new Throwable[0]);
      if (!this.d.containsKey(str1)) {
        d d = new d();
        this(this.c, paramInt, str1, parame);
        this.d.put(str1, d);
        d.f();
      } else {
        f.c().a(str2, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[] { str1 }), new Throwable[0]);
      } 
      return;
    } 
  }
  
  private void j(Intent paramIntent, int paramInt, e parame) {
    Bundle bundle = paramIntent.getExtras();
    String str = bundle.getString("KEY_WORKSPEC_ID");
    boolean bool = bundle.getBoolean("KEY_NEEDS_RESCHEDULE");
    f.c().a(b, String.format("Handling onExecutionCompleted %s, %s", new Object[] { paramIntent, Integer.valueOf(paramInt) }), new Throwable[0]);
    c(str, bool);
  }
  
  private void k(Intent paramIntent, int paramInt, e parame) {
    f.c().a(b, String.format("Handling reschedule %s, %s", new Object[] { paramIntent, Integer.valueOf(paramInt) }), new Throwable[0]);
    parame.g().r();
  }
  
  private void l(Intent paramIntent, int paramInt, e parame) {
    String str1 = paramIntent.getExtras().getString("KEY_WORKSPEC_ID");
    f f = f.c();
    String str2 = b;
    f.a(str2, String.format("Handling schedule work for %s", new Object[] { str1 }), new Throwable[0]);
    WorkDatabase workDatabase = parame.g().n();
    workDatabase.c();
    try {
      StringBuilder stringBuilder1;
      StringBuilder stringBuilder2;
      f f1;
      j j = workDatabase.y().m(str1);
      if (j == null) {
        f f2 = f.c();
        stringBuilder2 = new StringBuilder();
        this();
        stringBuilder2.append("Skipping scheduling ");
        stringBuilder2.append(str1);
        stringBuilder2.append(" because it's no longer in the DB");
        f2.h(str2, stringBuilder2.toString(), new Throwable[0]);
        return;
      } 
      if (((j)stringBuilder2).d.isFinished()) {
        f1 = f.c();
        stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append("Skipping scheduling ");
        stringBuilder1.append(str1);
        stringBuilder1.append("because it is finished.");
        f1.h(str2, stringBuilder1.toString(), new Throwable[0]);
        return;
      } 
      long l = f1.a();
      if (!f1.b()) {
        f.c().a(str2, String.format("Setting up Alarms for %s at %s", new Object[] { str1, Long.valueOf(l) }), new Throwable[0]);
        a.c(this.c, stringBuilder1.g(), str1, l);
      } else {
        f.c().a(str2, String.format("Opportunistically setting an alarm for %s at %s", new Object[] { str1, Long.valueOf(l) }), new Throwable[0]);
        a.c(this.c, stringBuilder1.g(), str1, l);
        Intent intent = a(this.c);
        e.b b1 = new e.b();
        this((e)stringBuilder1, intent, paramInt);
        stringBuilder1.k(b1);
      } 
      workDatabase.q();
      return;
    } finally {
      workDatabase.g();
    } 
  }
  
  private void m(Intent paramIntent, int paramInt, e parame) {
    String str = paramIntent.getExtras().getString("KEY_WORKSPEC_ID");
    f.c().a(b, String.format("Handing stopWork work for %s", new Object[] { str }), new Throwable[0]);
    parame.g().v(str);
    a.a(this.c, parame.g(), str);
    parame.c(str, false);
  }
  
  private static boolean n(Bundle paramBundle, String... paramVarArgs) {
    if (paramBundle == null || paramBundle.isEmpty())
      return false; 
    int i = paramVarArgs.length;
    for (byte b1 = 0; b1 < i; b1++) {
      if (paramBundle.get(paramVarArgs[b1]) == null)
        return false; 
    } 
    return true;
  }
  
  public void c(String paramString, boolean paramBoolean) {
    synchronized (this.e) {
      a a1 = this.d.remove(paramString);
      if (a1 != null)
        a1.c(paramString, paramBoolean); 
      return;
    } 
  }
  
  boolean o() {
    synchronized (this.e) {
      boolean bool;
      if (!this.d.isEmpty()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
  
  void p(Intent paramIntent, int paramInt, e parame) {
    String str = paramIntent.getAction();
    if ("ACTION_CONSTRAINTS_CHANGED".equals(str)) {
      h(paramIntent, paramInt, parame);
    } else if ("ACTION_RESCHEDULE".equals(str)) {
      k(paramIntent, paramInt, parame);
    } else if (!n(paramIntent.getExtras(), new String[] { "KEY_WORKSPEC_ID" })) {
      f.c().b(b, String.format("Invalid request for %s, requires %s.", new Object[] { str, "KEY_WORKSPEC_ID" }), new Throwable[0]);
    } else if ("ACTION_SCHEDULE_WORK".equals(str)) {
      l(paramIntent, paramInt, parame);
    } else if ("ACTION_DELAY_MET".equals(str)) {
      i(paramIntent, paramInt, parame);
    } else if ("ACTION_STOP_WORK".equals(str)) {
      m(paramIntent, paramInt, parame);
    } else if ("ACTION_EXECUTION_COMPLETED".equals(str)) {
      j(paramIntent, paramInt, parame);
    } else {
      f.c().h(b, String.format("Ignoring intent %s", new Object[] { paramIntent }), new Throwable[0]);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */