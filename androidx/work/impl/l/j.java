package androidx.work.impl.l;

import androidx.work.BackoffPolicy;
import androidx.work.WorkInfo;
import androidx.work.d;
import androidx.work.f;
import java.util.List;

public class j {
  private static final String a = f.f("WorkSpec");
  
  public static final b.b.a.c.a<List<?>, List<?>> b = new a();
  
  public String c;
  
  public WorkInfo.State d = WorkInfo.State.b;
  
  public String e;
  
  public String f;
  
  public d g;
  
  public d h;
  
  public long i;
  
  public long j;
  
  public long k;
  
  public androidx.work.b l;
  
  public int m;
  
  public BackoffPolicy n;
  
  public long o;
  
  public long p;
  
  public long q;
  
  public long r;
  
  public j(j paramj) {
    d d1 = d.b;
    this.g = d1;
    this.h = d1;
    this.l = androidx.work.b.a;
    this.n = BackoffPolicy.b;
    this.o = 30000L;
    this.r = -1L;
    this.c = paramj.c;
    this.e = paramj.e;
    this.d = paramj.d;
    this.f = paramj.f;
    this.g = new d(paramj.g);
    this.h = new d(paramj.h);
    this.i = paramj.i;
    this.j = paramj.j;
    this.k = paramj.k;
    this.l = new androidx.work.b(paramj.l);
    this.m = paramj.m;
    this.n = paramj.n;
    this.o = paramj.o;
    this.p = paramj.p;
    this.q = paramj.q;
    this.r = paramj.r;
  }
  
  public j(String paramString1, String paramString2) {
    d d1 = d.b;
    this.g = d1;
    this.h = d1;
    this.l = androidx.work.b.a;
    this.n = BackoffPolicy.b;
    this.o = 30000L;
    this.r = -1L;
    this.c = paramString1;
    this.e = paramString2;
  }
  
  public long a() {
    boolean bool = c();
    boolean bool1 = false;
    boolean bool2 = false;
    if (bool) {
      long l;
      if (this.n == BackoffPolicy.c)
        bool2 = true; 
      if (bool2) {
        l = this.o * this.m;
      } else {
        l = (long)Math.scalb((float)this.o, this.m - 1);
      } 
      return this.p + Math.min(18000000L, l);
    } 
    bool = d();
    long l2 = 0L;
    if (bool) {
      long l3 = System.currentTimeMillis();
      long l4 = this.p;
      if (l4 == 0L) {
        l3 += this.i;
      } else {
        l3 = l4;
      } 
      long l5 = this.k;
      long l6 = this.j;
      bool2 = bool1;
      if (l5 != l6)
        bool2 = true; 
      if (bool2) {
        if (l4 == 0L)
          l2 = l5 * -1L; 
        return l3 + l6 + l2;
      } 
      if (l4 != 0L)
        l2 = l6; 
      return l3 + l2;
    } 
    l2 = this.p;
    long l1 = l2;
    if (l2 == 0L)
      l1 = System.currentTimeMillis(); 
    return l1 + this.i;
  }
  
  public boolean b() {
    return androidx.work.b.a.equals(this.l) ^ true;
  }
  
  public boolean c() {
    boolean bool;
    if (this.d == WorkInfo.State.b && this.m > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean d() {
    boolean bool;
    if (this.j != 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || j.class != paramObject.getClass())
      return false; 
    j j1 = (j)paramObject;
    if (this.i != j1.i)
      return false; 
    if (this.j != j1.j)
      return false; 
    if (this.k != j1.k)
      return false; 
    if (this.m != j1.m)
      return false; 
    if (this.o != j1.o)
      return false; 
    if (this.p != j1.p)
      return false; 
    if (this.q != j1.q)
      return false; 
    if (this.r != j1.r)
      return false; 
    if (!this.c.equals(j1.c))
      return false; 
    if (this.d != j1.d)
      return false; 
    if (!this.e.equals(j1.e))
      return false; 
    paramObject = this.f;
    if ((paramObject != null) ? !paramObject.equals(j1.f) : (j1.f != null))
      return false; 
    if (!this.g.equals(j1.g))
      return false; 
    if (!this.h.equals(j1.h))
      return false; 
    if (!this.l.equals(j1.l))
      return false; 
    if (this.n != j1.n)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    byte b1;
    int i = this.c.hashCode();
    int k = this.d.hashCode();
    int m = this.e.hashCode();
    String str = this.f;
    if (str != null) {
      b1 = str.hashCode();
    } else {
      b1 = 0;
    } 
    int n = this.g.hashCode();
    int i1 = this.h.hashCode();
    long l = this.i;
    int i2 = (int)(l ^ l >>> 32L);
    l = this.j;
    int i3 = (int)(l ^ l >>> 32L);
    l = this.k;
    int i4 = (int)(l ^ l >>> 32L);
    int i5 = this.l.hashCode();
    int i6 = this.m;
    int i7 = this.n.hashCode();
    l = this.o;
    int i8 = (int)(l ^ l >>> 32L);
    l = this.p;
    int i9 = (int)(l ^ l >>> 32L);
    l = this.q;
    int i10 = (int)(l ^ l >>> 32L);
    l = this.r;
    return ((((((((((((((i * 31 + k) * 31 + m) * 31 + b1) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + (int)(l ^ l >>> 32L);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("{WorkSpec: ");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class a implements b.b.a.c.a<List<?>, List<?>> {}
  
  public static class b {
    public String a;
    
    public WorkInfo.State b;
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object == null || b.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      return (this.b != ((b)param1Object).b) ? false : this.a.equals(((b)param1Object).a);
    }
    
    public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/l/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */