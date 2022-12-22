package androidx.work.impl.l;

public class d {
  public final String a;
  
  public final int b;
  
  public d(String paramString, int paramInt) {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || d.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return (this.b != ((d)paramObject).b) ? false : this.a.equals(((d)paramObject).a);
  }
  
  public int hashCode() {
    return this.a.hashCode() * 31 + this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/l/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */