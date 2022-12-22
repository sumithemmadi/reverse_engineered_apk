package b.h.k;

public final class d {
  private final Object a;
  
  private d(Object paramObject) {
    this.a = paramObject;
  }
  
  static d a(Object paramObject) {
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = new d(paramObject);
    } 
    return (d)paramObject;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || d.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return b.h.j.d.a(this.a, ((d)paramObject).a);
  }
  
  public int hashCode() {
    int i;
    Object object = this.a;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    return i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DisplayCutoutCompat{");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */