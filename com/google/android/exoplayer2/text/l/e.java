package com.google.android.exoplayer2.text.l;

import com.google.android.exoplayer2.text.f;
import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.text.i;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

abstract class e implements f {
  private final ArrayDeque<b> a = new ArrayDeque<b>();
  
  private final ArrayDeque<i> b;
  
  private final PriorityQueue<b> c;
  
  private b d;
  
  private long e;
  
  private long f;
  
  public e() {
    boolean bool = false;
    byte b1;
    for (b1 = 0; b1 < 10; b1++)
      this.a.add(new b(null)); 
    this.b = new ArrayDeque<i>();
    for (b1 = bool; b1 < 2; b1++)
      this.b.add(new c(null)); 
    this.c = new PriorityQueue<b>();
  }
  
  private void l(b paramb) {
    paramb.clear();
    this.a.add(paramb);
  }
  
  public void a() {}
  
  public void b(long paramLong) {
    this.e = paramLong;
  }
  
  protected abstract com.google.android.exoplayer2.text.e f();
  
  public void flush() {
    this.f = 0L;
    this.e = 0L;
    while (!this.c.isEmpty())
      l(this.c.poll()); 
    b b1 = this.d;
    if (b1 != null) {
      l(b1);
      this.d = null;
    } 
  }
  
  protected abstract void g(h paramh);
  
  public h h() {
    boolean bool;
    if (this.d == null) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.f(bool);
    if (this.a.isEmpty())
      return null; 
    b b1 = this.a.pollFirst();
    this.d = b1;
    return b1;
  }
  
  public i i() {
    if (this.b.isEmpty())
      return null; 
    while (!this.c.isEmpty() && ((com.google.android.exoplayer2.b1.e)this.c.peek()).d <= this.e) {
      b b1 = this.c.poll();
      if (b1.isEndOfStream()) {
        i i = this.b.pollFirst();
        i.addFlag(4);
        l(b1);
        return i;
      } 
      g(b1);
      if (j()) {
        com.google.android.exoplayer2.text.e e1 = f();
        if (!b1.isDecodeOnly()) {
          i i = this.b.pollFirst();
          i.k(((com.google.android.exoplayer2.b1.e)b1).d, e1, Long.MAX_VALUE);
          l(b1);
          return i;
        } 
      } 
      l(b1);
    } 
    return null;
  }
  
  protected abstract boolean j();
  
  public void k(h paramh) {
    boolean bool;
    if (paramh == this.d) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.a(bool);
    if (paramh.isDecodeOnly()) {
      l(this.d);
    } else {
      paramh = this.d;
      long l = this.f;
      this.f = 1L + l;
      b.t((b)paramh, l);
      this.c.add(this.d);
    } 
    this.d = null;
  }
  
  protected void m(i parami) {
    parami.clear();
    this.b.add(parami);
  }
  
  private static final class b extends h implements Comparable<b> {
    private long h;
    
    private b() {}
    
    public int u(b param1b) {
      boolean bool1 = isEndOfStream();
      boolean bool2 = param1b.isEndOfStream();
      boolean bool = true;
      byte b1 = 1;
      if (bool1 != bool2) {
        if (!isEndOfStream())
          b1 = -1; 
        return b1;
      } 
      long l1 = ((com.google.android.exoplayer2.b1.e)this).d - ((com.google.android.exoplayer2.b1.e)param1b).d;
      long l2 = l1;
      if (l1 == 0L) {
        l1 = this.h - param1b.h;
        l2 = l1;
        if (l1 == 0L)
          return 0; 
      } 
      if (l2 > 0L) {
        b1 = bool;
      } else {
        b1 = -1;
      } 
      return b1;
    }
  }
  
  private final class c extends i {
    private c(e this$0) {}
    
    public final void release() {
      this.d.m(this);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/l/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */