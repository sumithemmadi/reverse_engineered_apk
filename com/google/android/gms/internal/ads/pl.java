package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.d1;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class pl implements pl2 {
  private final Object a = new Object();
  
  private final d1 b;
  
  private final ol c;
  
  private final ml d;
  
  private final HashSet<el> e = new HashSet<el>();
  
  private final HashSet<nl> f = new HashSet<nl>();
  
  private boolean g = false;
  
  public pl(String paramString, d1 paramd1) {
    this.d = new ml(paramString, paramd1);
    this.b = paramd1;
    this.c = new ol();
  }
  
  public final void a(boolean paramBoolean) {
    long l = q.j().a();
    if (paramBoolean) {
      long l1 = this.b.b();
      x<Long> x = m0.D0;
      if (l - l1 > ((Long)er2.e().<Long>c(x)).longValue()) {
        this.d.d = -1;
      } else {
        this.d.d = this.b.B();
      } 
      this.g = true;
      return;
    } 
    this.b.e(l);
    this.b.a(this.d.d);
  }
  
  public final Bundle b(Context paramContext, ll paramll) {
    HashSet<el> hashSet = new HashSet();
    synchronized (this.a) {
      ArrayList<Bundle> arrayList;
      hashSet.addAll(this.e);
      this.e.clear();
      null = new Bundle();
      null.putBundle("app", this.d.c(paramContext, this.c.b()));
      Bundle bundle = new Bundle();
      Iterator<nl> iterator = this.f.iterator();
      if (!iterator.hasNext()) {
        null.putBundle("slots", bundle);
        arrayList = new ArrayList();
        Iterator<el> iterator1 = hashSet.iterator();
        while (iterator1.hasNext())
          arrayList.add(((el)iterator1.next()).a()); 
        null.putParcelableArrayList("ads", arrayList);
        paramll.a(hashSet);
        return (Bundle)null;
      } 
      nl nl = (nl)arrayList.next();
      throw new NoSuchMethodError();
    } 
  }
  
  public final el c(e parame, String paramString) {
    return new el(parame, this, this.c.a(), paramString);
  }
  
  public final void d(zzvl paramzzvl, long paramLong) {
    synchronized (this.a) {
      this.d.a(paramzzvl, paramLong);
      return;
    } 
  }
  
  public final void e(el paramel) {
    synchronized (this.a) {
      this.e.add(paramel);
      return;
    } 
  }
  
  public final void f(HashSet<el> paramHashSet) {
    synchronized (this.a) {
      this.e.addAll(paramHashSet);
      return;
    } 
  }
  
  public final void g() {
    synchronized (this.a) {
      this.d.d();
      return;
    } 
  }
  
  public final void h() {
    synchronized (this.a) {
      this.d.e();
      return;
    } 
  }
  
  public final boolean i() {
    return this.g;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */