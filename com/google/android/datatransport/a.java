package com.google.android.datatransport;

final class a<T> extends c<T> {
  private final Integer a;
  
  private final T b;
  
  private final Priority c;
  
  a(Integer paramInteger, T paramT, Priority paramPriority) {
    this.a = paramInteger;
    if (paramT != null) {
      this.b = paramT;
      if (paramPriority != null) {
        this.c = paramPriority;
        return;
      } 
      throw new NullPointerException("Null priority");
    } 
    throw new NullPointerException("Null payload");
  }
  
  public Integer a() {
    return this.a;
  }
  
  public T b() {
    return this.b;
  }
  
  public Priority c() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (paramObject == this)
      return true; 
    if (paramObject instanceof c) {
      c c1 = (c)paramObject;
      paramObject = this.a;
      if (((paramObject == null) ? (c1.a() == null) : paramObject.equals(c1.a())) || !this.b.equals(c1.b()) || !this.c.equals(c1.c()))
        bool = false; 
      return bool;
    } 
    return false;
  }
  
  public int hashCode() {
    int i;
    Integer integer = this.a;
    if (integer == null) {
      i = 0;
    } else {
      i = integer.hashCode();
    } 
    return ((i ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Event{code=");
    stringBuilder.append(this.a);
    stringBuilder.append(", payload=");
    stringBuilder.append(this.b);
    stringBuilder.append(", priority=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */