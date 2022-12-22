package com.bumptech.glide.p;

public class i {
  private Class<?> a;
  
  private Class<?> b;
  
  private Class<?> c;
  
  public i() {}
  
  public i(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3) {
    a(paramClass1, paramClass2, paramClass3);
  }
  
  public void a(Class<?> paramClass1, Class<?> paramClass2, Class<?> paramClass3) {
    this.a = paramClass1;
    this.b = paramClass2;
    this.c = paramClass3;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || i.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return !this.a.equals(((i)paramObject).a) ? false : (!this.b.equals(((i)paramObject).b) ? false : (!!k.c(this.c, ((i)paramObject).c)));
  }
  
  public int hashCode() {
    byte b;
    int j = this.a.hashCode();
    int k = this.b.hashCode();
    Class<?> clazz = this.c;
    if (clazz != null) {
      b = clazz.hashCode();
    } else {
      b = 0;
    } 
    return (j * 31 + k) * 31 + b;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("MultiClassKey{first=");
    stringBuilder.append(this.a);
    stringBuilder.append(", second=");
    stringBuilder.append(this.b);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/p/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */