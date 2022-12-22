package com.google.android.exoplayer2.offline;

import android.content.Context;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public final class d {
  public static final Requirements a = new Requirements(1);
  
  private final Context b;
  
  private final b.c c;
  
  private final CopyOnWriteArraySet<a> d;
  
  private int e;
  
  private int f;
  
  private boolean g;
  
  private boolean h;
  
  private int i;
  
  private boolean j;
  
  private List<b> k;
  
  private b l;
  
  private void i() {
    Iterator<a> iterator = this.d.iterator();
    while (iterator.hasNext())
      ((a)iterator.next()).a(this, this.j); 
  }
  
  private void j(b paramb, int paramInt) {
    Requirements requirements = paramb.e();
    if (this.i == paramInt) {
      boolean bool = r();
      Iterator<a> iterator = this.d.iterator();
      while (iterator.hasNext())
        ((a)iterator.next()).b(this, requirements, paramInt); 
      if (bool)
        i(); 
      return;
    } 
    this.i = paramInt;
    this.e++;
    throw null;
  }
  
  private void o(boolean paramBoolean) {
    if (this.h == paramBoolean)
      return; 
    this.h = paramBoolean;
    this.e++;
    throw null;
  }
  
  private boolean r() {
    boolean bool = this.h;
    boolean bool1 = true;
    if (!bool && this.i != 0)
      for (byte b1 = 0; b1 < this.k.size(); b1++) {
        if (((b)this.k.get(b1)).a == 0) {
          bool = true;
          // Byte code: goto -> 65
        } 
      }  
    bool = false;
    if (this.j == bool)
      bool1 = false; 
    this.j = bool;
    return bool1;
  }
  
  public void a(DownloadRequest paramDownloadRequest, int paramInt) {
    this.e++;
    throw null;
  }
  
  public void b(a parama) {
    this.d.add(parama);
  }
  
  public List<b> c() {
    return this.k;
  }
  
  public boolean d() {
    return this.h;
  }
  
  public Requirements e() {
    return this.l.e();
  }
  
  public boolean f() {
    boolean bool;
    if (this.f == 0 && this.e == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean g() {
    return this.g;
  }
  
  public boolean h() {
    return this.j;
  }
  
  public void k() {
    o(true);
  }
  
  public void l() {
    this.e++;
    throw null;
  }
  
  public void m(String paramString) {
    this.e++;
    throw null;
  }
  
  public void n() {
    o(false);
  }
  
  public void p(Requirements paramRequirements) {
    if (paramRequirements.equals(this.l.e()))
      return; 
    this.l.h();
    b b1 = new b(this.b, this.c, paramRequirements);
    this.l = b1;
    int i = b1.g();
    j(this.l, i);
  }
  
  public void q(String paramString, int paramInt) {
    this.e++;
    throw null;
  }
  
  public static interface a {
    void a(d param1d, boolean param1Boolean);
    
    void b(d param1d, Requirements param1Requirements, int param1Int);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/offline/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */