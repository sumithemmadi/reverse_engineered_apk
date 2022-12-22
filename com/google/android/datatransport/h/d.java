package com.google.android.datatransport.h;

import android.content.Context;
import com.google.android.datatransport.h.u.a.a;
import com.google.android.datatransport.h.u.a.b;
import com.google.android.datatransport.h.u.a.c;
import com.google.android.datatransport.h.u.a.d;
import com.google.android.datatransport.h.x.c;
import com.google.android.datatransport.h.x.d;
import com.google.android.datatransport.h.x.g;
import com.google.android.datatransport.h.x.i;
import com.google.android.datatransport.h.x.j.b0;
import com.google.android.datatransport.h.x.j.c;
import com.google.android.datatransport.h.x.j.c0;
import com.google.android.datatransport.h.x.j.f;
import com.google.android.datatransport.h.x.j.g;
import com.google.android.datatransport.h.x.j.h;
import com.google.android.datatransport.h.x.j.i0;
import com.google.android.datatransport.h.y.a;
import com.google.android.datatransport.h.y.c;
import com.google.android.datatransport.h.y.d;
import com.google.android.datatransport.runtime.backends.i;
import com.google.android.datatransport.runtime.backends.k;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import java.util.concurrent.Executor;

final class d extends s {
  private e.a.a<Executor> b;
  
  private e.a.a<Context> c;
  
  private e.a.a d;
  
  private e.a.a e;
  
  private e.a.a f;
  
  private e.a.a<b0> g;
  
  private e.a.a<SchedulerConfig> h;
  
  private e.a.a<r> i;
  
  private e.a.a<c> j;
  
  private e.a.a<l> k;
  
  private e.a.a<p> l;
  
  private e.a.a<r> m;
  
  private d(Context paramContext) {
    e(paramContext);
  }
  
  public static s.a d() {
    return new b(null);
  }
  
  private void e(Context paramContext) {
    this.b = a.a((e.a.a)j.a());
    b b = c.a(paramContext);
    this.c = (e.a.a<Context>)b;
    i i = i.a((e.a.a)b, (e.a.a)c.a(), (e.a.a)d.a());
    this.d = (e.a.a)i;
    this.e = a.a((e.a.a)k.a(this.c, (e.a.a)i));
    this.f = (e.a.a)i0.a(this.c, (e.a.a)f.a(), (e.a.a)g.a());
    this.g = a.a((e.a.a)c0.a((e.a.a)c.a(), (e.a.a)d.a(), (e.a.a)h.a(), this.f));
    g g = g.b((e.a.a)c.a());
    this.h = (e.a.a<SchedulerConfig>)g;
    i i1 = i.a(this.c, this.g, (e.a.a)g, (e.a.a)d.a());
    this.i = (e.a.a<r>)i1;
    e.a.a<Executor> a5 = this.b;
    e.a.a<Context> a2 = this.e;
    e.a.a<b0> a6 = this.g;
    this.j = (e.a.a<c>)d.a(a5, a2, (e.a.a)i1, a6, a6);
    a2 = this.c;
    e.a.a a3 = this.e;
    e.a.a<b0> a4 = this.g;
    this.k = (e.a.a<l>)m.a(a2, a3, a4, this.i, this.b, a4, (e.a.a)c.a());
    e.a.a<Executor> a1 = this.b;
    a4 = this.g;
    this.l = (e.a.a<p>)q.a(a1, a4, this.i, a4);
    this.m = a.a((e.a.a)t.a((e.a.a<a>)c.a(), (e.a.a<a>)d.a(), (e.a.a)this.j, this.k, this.l));
  }
  
  c b() {
    return (c)this.g.get();
  }
  
  r c() {
    return (r)this.m.get();
  }
  
  private static final class b implements s.a {
    private Context a;
    
    private b() {}
    
    public s a() {
      d.a(this.a, Context.class);
      return new d(this.a, null);
    }
    
    public b c(Context param1Context) {
      this.a = (Context)d.b(param1Context);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */