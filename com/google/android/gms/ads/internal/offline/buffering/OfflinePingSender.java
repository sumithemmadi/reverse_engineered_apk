package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.mb;
import com.google.android.gms.internal.ads.nb;
import com.google.android.gms.internal.ads.te;

public class OfflinePingSender extends Worker {
  private final te g;
  
  public OfflinePingSender(Context paramContext, WorkerParameters paramWorkerParameters) {
    super(paramContext, paramWorkerParameters);
    this.g = er2.b().e(paramContext, (mb)new nb());
  }
  
  public ListenableWorker.a doWork() {
    try {
      this.g.A3();
      return ListenableWorker.a.c();
    } catch (RemoteException remoteException) {
      return ListenableWorker.a.a();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/offline/buffering/OfflinePingSender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */