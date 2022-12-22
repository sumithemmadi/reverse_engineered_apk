package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.y0;

public interface v {
  u a(a parama, e parame, long paramLong);
  
  void b(b paramb);
  
  void d(Handler paramHandler, w paramw);
  
  void e(w paramw);
  
  void f(b paramb);
  
  void h();
  
  void i(u paramu);
  
  void j(b paramb, x paramx);
  
  void k(b paramb);
  
  public static final class a {
    public final Object a;
    
    public final int b;
    
    public final int c;
    
    public final long d;
    
    public final int e;
    
    public a(Object param1Object) {
      this(param1Object, -1L);
    }
    
    public a(Object param1Object, int param1Int1, int param1Int2, long param1Long) {
      this(param1Object, param1Int1, param1Int2, param1Long, -1);
    }
    
    private a(Object param1Object, int param1Int1, int param1Int2, long param1Long, int param1Int3) {
      this.a = param1Object;
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Long;
      this.e = param1Int3;
    }
    
    public a(Object param1Object, long param1Long) {
      this(param1Object, -1, -1, param1Long, -1);
    }
    
    public a(Object param1Object, long param1Long, int param1Int) {
      this(param1Object, -1, -1, param1Long, param1Int);
    }
    
    public boolean a() {
      boolean bool;
      if (this.b != -1) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || a.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (!this.a.equals(((a)param1Object).a) || this.b != ((a)param1Object).b || this.c != ((a)param1Object).c || this.d != ((a)param1Object).d || this.e != ((a)param1Object).e)
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      return ((((527 + this.a.hashCode()) * 31 + this.b) * 31 + this.c) * 31 + (int)this.d) * 31 + this.e;
    }
  }
  
  public static interface b {
    void b(v param1v, y0 param1y0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */