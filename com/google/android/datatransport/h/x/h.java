package com.google.android.datatransport.h.x;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.h.x.j.c;
import com.google.android.datatransport.h.y.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;

public abstract class h {
  static r a(Context paramContext, c paramc, SchedulerConfig paramSchedulerConfig, a parama) {
    return (r)((Build.VERSION.SDK_INT >= 21) ? new e(paramContext, paramc, paramSchedulerConfig) : new a(paramContext, paramc, parama, paramSchedulerConfig));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */