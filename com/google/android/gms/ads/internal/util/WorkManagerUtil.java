package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.NetworkType;
import androidx.work.a;
import androidx.work.b;
import androidx.work.d;
import androidx.work.g;
import androidx.work.k;
import androidx.work.l;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.cm;

public class WorkManagerUtil extends f0 {
  private static void S9(Context paramContext) {
    try {
      paramContext = paramContext.getApplicationContext();
      a.a a = new a.a();
      this();
      k.e(paramContext, a.a());
    } catch (IllegalStateException illegalStateException) {}
  }
  
  public final void zzap(a parama) {
    Context context = (Context)b.o1(parama);
    S9(context);
    try {
      k k = k.d(context);
      k.a("offline_ping_sender_work");
      b b = (new b.a()).b(NetworkType.c).a();
      k.b(((g.a)((g.a)(new g.a(OfflinePingSender.class)).e(b)).a("offline_ping_sender_work")).b());
      return;
    } catch (IllegalStateException illegalStateException) {
      cm.d("Failed to instantiate WorkManager.", illegalStateException);
      return;
    } 
  }
  
  public final boolean zzd(a parama, String paramString1, String paramString2) {
    Context context = (Context)b.o1(parama);
    S9(context);
    b b = (new b.a()).b(NetworkType.c).a();
    d d = (new d.a()).e("uri", paramString1).e("gws_query_id", paramString2).a();
    g g = (g)((g.a)((g.a)((g.a)(new g.a(OfflineNotificationPoster.class)).e(b)).f(d)).a("offline_notification_work")).b();
    try {
      k k = k.d(context);
      k.b((l)g);
      return true;
    } catch (IllegalStateException illegalStateException) {
      cm.d("Failed to instantiate WorkManager.", illegalStateException);
      return false;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/WorkManagerUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */