package com.bumptech.glide.load.i;

import com.bumptech.glide.p.g;
import com.bumptech.glide.p.k;
import java.util.Queue;

public class m<A, B> {
  private final g<b<A>, B> a;
  
  public m(long paramLong) {
    this.a = new a(this, paramLong);
  }
  
  public B a(A paramA, int paramInt1, int paramInt2) {
    b<A> b = b.a(paramA, paramInt1, paramInt2);
    paramA = (A)this.a.g(b);
    b.c();
    return (B)paramA;
  }
  
  public void b(A paramA, int paramInt1, int paramInt2, B paramB) {
    b<A> b = b.a(paramA, paramInt1, paramInt2);
    this.a.k(b, paramB);
  }
  
  class a extends g<b<A>, B> {
    a(m this$0, long param1Long) {
      super(param1Long);
    }
    
    protected void n(m.b<A> param1b, B param1B) {
      param1b.c();
    }
  }
  
  static final class b<A> {
    private static final Queue<b<?>> a = k.e(0);
    
    private int b;
    
    private int c;
    
    private A d;
    
    static <A> b<A> a(A param1A, int param1Int1, int param1Int2) {
      Queue<b<?>> queue;
      b<A> b1;
      synchronized (a) {
        b<A> b2 = (b)queue.poll();
        b1 = b2;
        if (b2 == null)
          b1 = new b(); 
        b1.b(param1A, param1Int1, param1Int2);
        return b1;
      } 
    }
    
    private void b(A param1A, int param1Int1, int param1Int2) {
      this.d = param1A;
      this.c = param1Int1;
      this.b = param1Int2;
    }
    
    public void c() {
      synchronized (a) {
        null.offer(this);
        return;
      } 
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = param1Object instanceof b;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (bool) {
        param1Object = param1Object;
        bool2 = bool1;
        if (this.c == ((b)param1Object).c) {
          bool2 = bool1;
          if (this.b == ((b)param1Object).b) {
            bool2 = bool1;
            if (this.d.equals(((b)param1Object).d))
              bool2 = true; 
          } 
        } 
      } 
      return bool2;
    }
    
    public int hashCode() {
      return (this.b * 31 + this.c) * 31 + this.d.hashCode();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */