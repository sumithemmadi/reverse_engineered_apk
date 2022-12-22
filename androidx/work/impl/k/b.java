package androidx.work.impl.k;

public class b {
  private boolean a;
  
  private boolean b;
  
  private boolean c;
  
  private boolean d;
  
  public b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    this.a = paramBoolean1;
    this.b = paramBoolean2;
    this.c = paramBoolean3;
    this.d = paramBoolean4;
  }
  
  public boolean a() {
    return this.a;
  }
  
  public boolean b() {
    return this.c;
  }
  
  public boolean c() {
    return this.d;
  }
  
  public boolean d() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || b.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.a != ((b)paramObject).a || this.b != ((b)paramObject).b || this.c != ((b)paramObject).c || this.d != ((b)paramObject).d)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    if (this.a) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = i;
    if (this.b)
      j = i + 16; 
    int i = j;
    if (this.c)
      i = j + 256; 
    j = i;
    if (this.d)
      j = i + 4096; 
    return j;
  }
  
  public String toString() {
    return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[] { Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d) });
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */