package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.util.e;

public interface t {
  boolean b();
  
  long c();
  
  a j(long paramLong);
  
  public static final class a {
    public final u a;
    
    public final u b;
    
    public a(u param1u) {
      this(param1u, param1u);
    }
    
    public a(u param1u1, u param1u2) {
      this.a = (u)e.e(param1u1);
      this.b = (u)e.e(param1u2);
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || a.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (!this.a.equals(((a)param1Object).a) || !this.b.equals(((a)param1Object).b))
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    public String toString() {
      String str;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("[");
      stringBuilder.append(this.a);
      if (this.a.equals(this.b)) {
        str = "";
      } else {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(", ");
        stringBuilder1.append(this.b);
        str = stringBuilder1.toString();
      } 
      stringBuilder.append(str);
      stringBuilder.append("]");
      return stringBuilder.toString();
    }
  }
  
  public static class b implements t {
    private final long a;
    
    private final t.a b;
    
    public b(long param1Long) {
      this(param1Long, 0L);
    }
    
    public b(long param1Long1, long param1Long2) {
      u u;
      this.a = param1Long1;
      if (param1Long2 == 0L) {
        u = u.a;
      } else {
        u = new u(0L, param1Long2);
      } 
      this.b = new t.a(u);
    }
    
    public boolean b() {
      return false;
    }
    
    public long c() {
      return this.a;
    }
    
    public t.a j(long param1Long) {
      return this.b;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */