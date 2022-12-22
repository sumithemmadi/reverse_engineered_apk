package b.h.j;

public class e<F, S> {
  public final F a;
  
  public final S b;
  
  public e(F paramF, S paramS) {
    this.a = paramF;
    this.b = paramS;
  }
  
  public static <A, B> e<A, B> a(A paramA, B paramB) {
    return new e<A, B>(paramA, paramB);
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof e;
    boolean bool1 = false;
    if (!bool)
      return false; 
    paramObject = paramObject;
    bool = bool1;
    if (d.a(((e)paramObject).a, this.a)) {
      bool = bool1;
      if (d.a(((e)paramObject).b, this.b))
        bool = true; 
    } 
    return bool;
  }
  
  public int hashCode() {
    int j;
    F f = this.a;
    int i = 0;
    if (f == null) {
      j = 0;
    } else {
      j = f.hashCode();
    } 
    S s = this.b;
    if (s != null)
      i = s.hashCode(); 
    return j ^ i;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Pair{");
    stringBuilder.append(this.a);
    stringBuilder.append(" ");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/j/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */