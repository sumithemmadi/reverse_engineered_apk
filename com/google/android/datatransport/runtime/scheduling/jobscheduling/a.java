package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.h.m;
import com.google.android.datatransport.h.x.j.c;

public class a implements r {
  private final Context a;
  
  private final c b;
  
  private AlarmManager c;
  
  private final SchedulerConfig d;
  
  private final com.google.android.datatransport.h.y.a e;
  
  a(Context paramContext, c paramc, AlarmManager paramAlarmManager, com.google.android.datatransport.h.y.a parama, SchedulerConfig paramSchedulerConfig) {
    this.a = paramContext;
    this.b = paramc;
    this.c = paramAlarmManager;
    this.e = parama;
    this.d = paramSchedulerConfig;
  }
  
  public a(Context paramContext, c paramc, com.google.android.datatransport.h.y.a parama, SchedulerConfig paramSchedulerConfig) {
    this(paramContext, paramc, (AlarmManager)paramContext.getSystemService("alarm"), parama, paramSchedulerConfig);
  }
  
  public void a(m paramm, int paramInt) {
    b(paramm, paramInt, false);
  }
  
  public void b(m paramm, int paramInt, boolean paramBoolean) {
    Uri.Builder builder = new Uri.Builder();
    builder.appendQueryParameter("backendName", paramm.b());
    builder.appendQueryParameter("priority", String.valueOf(com.google.android.datatransport.h.z.a.a(paramm.d())));
    if (paramm.c() != null)
      builder.appendQueryParameter("extras", Base64.encodeToString(paramm.c(), 0)); 
    Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
    intent.setData(builder.build());
    intent.putExtra("attemptNumber", paramInt);
    if (!paramBoolean && c(intent)) {
      com.google.android.datatransport.h.v.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", paramm);
      return;
    } 
    long l1 = this.b.g0(paramm);
    long l2 = this.d.g(paramm.d(), l1, paramInt);
    com.google.android.datatransport.h.v.a.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { paramm, Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(paramInt) });
    PendingIntent pendingIntent = PendingIntent.getBroadcast(this.a, 0, intent, 0);
    this.c.set(3, this.e.a() + l2, pendingIntent);
  }
  
  boolean c(Intent paramIntent) {
    Context context = this.a;
    boolean bool = false;
    if (PendingIntent.getBroadcast(context, 0, paramIntent, 536870912) != null)
      bool = true; 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */