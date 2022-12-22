package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.h.h;
import com.google.android.datatransport.h.m;
import com.google.android.datatransport.h.v.a;
import com.google.android.datatransport.h.x.j.c;
import com.google.android.datatransport.h.x.j.i;
import com.google.android.datatransport.h.y.a;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

public class l {
  private final Context a;
  
  private final e b;
  
  private final c c;
  
  private final r d;
  
  private final Executor e;
  
  private final a f;
  
  private final a g;
  
  public l(Context paramContext, e parame, c paramc, r paramr, Executor paramExecutor, a parama, a parama1) {
    this.a = paramContext;
    this.b = parame;
    this.c = paramc;
    this.d = paramr;
    this.e = paramExecutor;
    this.f = parama;
    this.g = parama1;
  }
  
  boolean a() {
    boolean bool;
    NetworkInfo networkInfo = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
    if (networkInfo != null && networkInfo.isConnected()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  void f(m paramm, int paramInt) {
    BackendResponse backendResponse;
    com.google.android.datatransport.runtime.backends.l l1 = this.b.get(paramm.b());
    Iterable iterable = (Iterable)this.f.b(h.a(this, paramm));
    if (!iterable.iterator().hasNext())
      return; 
    if (l1 == null) {
      a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", paramm);
      backendResponse = BackendResponse.a();
    } else {
      ArrayList<h> arrayList = new ArrayList();
      Iterator<i> iterator = iterable.iterator();
      while (iterator.hasNext())
        arrayList.add(((i)iterator.next()).b()); 
      backendResponse = l1.a(f.a().b(arrayList).c(paramm.c()).a());
    } 
    this.f.b(i.a(this, backendResponse, iterable, paramm, paramInt));
  }
  
  public void g(m paramm, int paramInt, Runnable paramRunnable) {
    this.e.execute(g.a(this, paramm, paramInt, paramRunnable));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */