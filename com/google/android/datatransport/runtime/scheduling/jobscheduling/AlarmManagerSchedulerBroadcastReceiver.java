package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.h.m;
import com.google.android.datatransport.h.r;
import com.google.android.datatransport.h.z.a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    String str1 = paramIntent.getData().getQueryParameter("backendName");
    String str2 = paramIntent.getData().getQueryParameter("extras");
    int i = Integer.valueOf(paramIntent.getData().getQueryParameter("priority")).intValue();
    int j = paramIntent.getExtras().getInt("attemptNumber");
    r.f(paramContext);
    m.a a = m.a().b(str1).d(a.b(i));
    if (str2 != null)
      a.c(Base64.decode(str2, 0)); 
    r.c().e().g(a.a(), j, b.a());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */