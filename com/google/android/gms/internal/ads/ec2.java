package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class ec2 implements bc2 {
  private final pc2[] a;
  
  private final ni2 b;
  
  private final oi2 c;
  
  private final Handler d;
  
  private final gc2 e;
  
  private final CopyOnWriteArraySet<ac2> f;
  
  private final wc2 g;
  
  private final xc2 h;
  
  private boolean i;
  
  private boolean j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private boolean o;
  
  private vc2 p;
  
  private Object q;
  
  private ai2 r;
  
  private oi2 s;
  
  private qc2 t;
  
  private ic2 u;
  
  private int v;
  
  private int w;
  
  private long x;
  
  @SuppressLint({"HandlerLeak"})
  public ec2(pc2[] paramArrayOfpc2, ni2 paramni2, oc2 paramoc2) {
    Looper looper;
    boolean bool;
    String str = wj2.e;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 26);
    stringBuilder.append("Init ExoPlayerLib/2.4.2 [");
    stringBuilder.append(str);
    stringBuilder.append("]");
    Log.i("ExoPlayerImpl", stringBuilder.toString());
    if (paramArrayOfpc2.length > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.e(bool);
    this.a = jj2.<pc2[]>d(paramArrayOfpc2);
    this.b = jj2.<ni2>d(paramni2);
    this.j = false;
    this.k = 0;
    this.l = 1;
    this.f = new CopyOnWriteArraySet<ac2>();
    oi2 oi21 = new oi2(new mi2[paramArrayOfpc2.length]);
    this.c = oi21;
    this.p = vc2.a;
    this.g = new wc2();
    this.h = new xc2();
    this.r = ai2.a;
    this.s = oi21;
    this.t = qc2.a;
    if (Looper.myLooper() != null) {
      looper = Looper.myLooper();
    } else {
      looper = Looper.getMainLooper();
    } 
    hc2 hc2 = new hc2(this, looper);
    this.d = hc2;
    ic2 ic21 = new ic2(0, 0L);
    this.u = ic21;
    this.e = new gc2(paramArrayOfpc2, paramni2, paramoc2, this.j, 0, hc2, ic21, this);
  }
  
  private final int m() {
    if (this.p.a() || this.m > 0)
      return this.v; 
    this.p.e(this.u.a, this.h, false);
    return 0;
  }
  
  public final int V() {
    return this.l;
  }
  
  public final long X() {
    if (this.p.a() || this.m > 0)
      return this.x; 
    this.p.e(this.u.a, this.h, false);
    return this.h.b() + zb2.a(this.u.d);
  }
  
  public final void a() {
    this.e.b();
    this.d.removeCallbacksAndMessages(null);
  }
  
  public final void b(ac2 paramac2) {
    this.f.remove(paramac2);
  }
  
  public final void c(ac2 paramac2) {
    this.f.add(paramac2);
  }
  
  public final boolean d() {
    return this.j;
  }
  
  public final void e(long paramLong) {
    int i = m();
    if (i >= 0 && (this.p.a() || i < this.p.g())) {
      this.m++;
      this.v = i;
      if (!this.p.a()) {
        this.p.c(i, this.g, false);
        if (paramLong == -9223372036854775807L) {
          long l1 = 0L;
        } else {
          long l1 = zb2.b(paramLong);
        } 
        long l = (this.p.e(0, this.h, false)).d;
        if (l != -9223372036854775807L);
      } 
      this.w = 0;
      if (paramLong == -9223372036854775807L) {
        this.x = 0L;
        this.e.n(this.p, i, -9223372036854775807L);
        return;
      } 
      this.x = paramLong;
      this.e.n(this.p, i, zb2.b(paramLong));
      Iterator<ac2> iterator = this.f.iterator();
      while (iterator.hasNext())
        ((ac2)iterator.next()).a(); 
      return;
    } 
    zzhu zzhu = new zzhu(this.p, i, paramLong);
    throw zzhu;
  }
  
  public final void f(cc2... paramVarArgs) {
    this.e.q(paramVarArgs);
  }
  
  public final void g(mh2 parammh2) {
    if (!this.p.a() || this.q != null) {
      this.p = vc2.a;
      this.q = null;
      Iterator<ac2> iterator = this.f.iterator();
      while (iterator.hasNext())
        ((ac2)iterator.next()).f(this.p, this.q); 
    } 
    if (this.i) {
      this.i = false;
      this.r = ai2.a;
      this.s = this.c;
      this.b.d(null);
      Iterator<ac2> iterator = this.f.iterator();
      while (iterator.hasNext())
        ((ac2)iterator.next()).r(this.r, this.s); 
    } 
    this.n++;
    this.e.o(parammh2, true);
  }
  
  public final long getDuration() {
    return this.p.a() ? -9223372036854775807L : zb2.a((this.p.c(m(), this.g, false)).i);
  }
  
  public final int h() {
    return this.a.length;
  }
  
  public final void i(boolean paramBoolean) {
    if (this.j != paramBoolean) {
      this.j = paramBoolean;
      this.e.G(paramBoolean);
      Iterator<ac2> iterator = this.f.iterator();
      while (iterator.hasNext())
        ((ac2)iterator.next()).n(paramBoolean, this.l); 
    } 
  }
  
  public final void j(cc2... paramVarArgs) {
    this.e.w(paramVarArgs);
  }
  
  public final long k() {
    if (this.p.a() || this.m > 0)
      return this.x; 
    this.p.e(this.u.a, this.h, false);
    return this.h.b() + zb2.a(this.u.c);
  }
  
  final void l(Message paramMessage) {
    Iterator<ac2> iterator2;
    qc2 qc21;
    kc2 kc2;
    Iterator<ac2> iterator1;
    zzhe zzhe;
    int i = paramMessage.what;
    boolean bool = true;
    switch (i) {
      default:
        throw new IllegalStateException();
      case 8:
        zzhe = (zzhe)paramMessage.obj;
        iterator2 = this.f.iterator();
        while (iterator2.hasNext())
          ((ac2)iterator2.next()).w(zzhe); 
        return;
      case 7:
        qc21 = (qc2)((Message)iterator2).obj;
        if (!this.t.equals(qc21)) {
          this.t = qc21;
          Iterator<ac2> iterator = this.f.iterator();
          while (iterator.hasNext())
            ((ac2)iterator.next()).e(qc21); 
          return;
        } 
        return;
      case 6:
        kc2 = (kc2)((Message)qc21).obj;
        this.m -= kc2.d;
        if (this.n == 0) {
          this.p = kc2.a;
          this.q = kc2.b;
          this.u = kc2.c;
          iterator1 = this.f.iterator();
          while (iterator1.hasNext())
            ((ac2)iterator1.next()).f(this.p, this.q); 
          return;
        } 
        return;
      case 5:
        if (this.m == 0) {
          this.u = (ic2)((Message)iterator1).obj;
          iterator1 = this.f.iterator();
          while (iterator1.hasNext())
            ((ac2)iterator1.next()).a(); 
          return;
        } 
        return;
      case 4:
        i = this.m - 1;
        this.m = i;
        if (i == 0) {
          this.u = (ic2)((Message)iterator1).obj;
          if (((Message)iterator1).arg1 != 0) {
            iterator1 = this.f.iterator();
            while (iterator1.hasNext())
              ((ac2)iterator1.next()).a(); 
            return;
          } 
        } 
        return;
      case 3:
        if (this.n == 0) {
          pi2 pi2 = (pi2)((Message)iterator1).obj;
          this.i = true;
          this.r = pi2.a;
          this.s = pi2.b;
          this.b.d(pi2.c);
          iterator1 = this.f.iterator();
          while (iterator1.hasNext())
            ((ac2)iterator1.next()).r(this.r, this.s); 
        } 
        return;
      case 2:
        if (((Message)iterator1).arg1 == 0)
          bool = false; 
        this.o = bool;
        iterator1 = this.f.iterator();
        while (iterator1.hasNext())
          ((ac2)iterator1.next()).u(this.o); 
        return;
      case 1:
        this.l = ((Message)iterator1).arg1;
        iterator1 = this.f.iterator();
        while (iterator1.hasNext())
          ((ac2)iterator1.next()).n(this.j, this.l); 
        return;
      case 0:
        break;
    } 
    this.n--;
  }
  
  public final void stop() {
    this.e.g();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ec2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */