package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class el {
  private final e a;
  
  private final pl b;
  
  private final LinkedList<dl> c;
  
  private final Object d = new Object();
  
  private final String e;
  
  private final String f;
  
  private long g = -1L;
  
  private long h = -1L;
  
  private boolean i = false;
  
  private long j = -1L;
  
  private long k = 0L;
  
  private long l = -1L;
  
  private long m = -1L;
  
  el(e parame, pl parampl, String paramString1, String paramString2) {
    this.a = parame;
    this.b = parampl;
    this.e = paramString1;
    this.f = paramString2;
    this.c = new LinkedList<dl>();
  }
  
  public final Bundle a() {
    synchronized (this.d) {
      Bundle bundle = new Bundle();
      this();
      bundle.putString("seq_num", this.e);
      bundle.putString("slotid", this.f);
      bundle.putBoolean("ismediation", false);
      bundle.putLong("treq", this.l);
      bundle.putLong("tresponse", this.m);
      bundle.putLong("timp", this.h);
      bundle.putLong("tload", this.j);
      bundle.putLong("pcc", this.k);
      bundle.putLong("tfetch", this.g);
      ArrayList<Bundle> arrayList = new ArrayList();
      this();
      Iterator<dl> iterator = this.c.iterator();
      while (iterator.hasNext())
        arrayList.add(((dl)iterator.next()).a()); 
      bundle.putParcelableArrayList("tclick", arrayList);
      return bundle;
    } 
  }
  
  public final void c(boolean paramBoolean) {
    synchronized (this.d) {
      if (this.m != -1L)
        this.j = this.a.b(); 
      return;
    } 
  }
  
  public final void d(zzvl paramzzvl) {
    synchronized (this.d) {
      long l = this.a.b();
      this.l = l;
      this.b.d(paramzzvl, l);
      return;
    } 
  }
  
  public final void e(long paramLong) {
    synchronized (this.d) {
      this.m = paramLong;
      if (paramLong != -1L)
        this.b.e(this); 
      return;
    } 
  }
  
  public final void f() {
    synchronized (this.d) {
      if (this.m != -1L && this.h == -1L) {
        this.h = this.a.b();
        this.b.e(this);
      } 
      this.b.g();
      return;
    } 
  }
  
  public final void g() {
    synchronized (this.d) {
      if (this.m != -1L) {
        dl dl = new dl();
        this(this);
        dl.d();
        this.c.add(dl);
        this.k++;
        this.b.h();
        this.b.e(this);
      } 
      return;
    } 
  }
  
  public final void h() {
    synchronized (this.d) {
      if (this.m != -1L && !this.c.isEmpty()) {
        dl dl = this.c.getLast();
        if (dl.b() == -1L) {
          dl.c();
          this.b.e(this);
        } 
      } 
      return;
    } 
  }
  
  public final String i() {
    return this.e;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */