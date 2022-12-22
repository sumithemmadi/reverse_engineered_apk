package androidx.lifecycle;

public class s {
  private final a a;
  
  private final t b;
  
  public s(t paramt, a parama) {
    this.a = parama;
    this.b = paramt;
  }
  
  public <T extends r> T a(Class<T> paramClass) {
    String str = paramClass.getCanonicalName();
    if (str != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
      stringBuilder.append(str);
      return b(stringBuilder.toString(), paramClass);
    } 
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
  
  public <T extends r> T b(String paramString, Class<T> paramClass) {
    a a1;
    r r = this.b.b(paramString);
    if (paramClass.isInstance(r)) {
      a1 = this.a;
      if (a1 instanceof c)
        ((c)a1).b(r); 
      return (T)r;
    } 
    a a2 = this.a;
    if (a2 instanceof b) {
      paramClass = ((b)a2).c((String)a1, (Class)paramClass);
    } else {
      paramClass = a2.a((Class)paramClass);
    } 
    this.b.d((String)a1, (r)paramClass);
    return (T)paramClass;
  }
  
  public static interface a {
    <T extends r> T a(Class<T> param1Class);
  }
  
  static abstract class b extends c implements a {
    public <T extends r> T a(Class<T> param1Class) {
      throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
    }
    
    public abstract <T extends r> T c(String param1String, Class<T> param1Class);
  }
  
  static class c {
    void b(r param1r) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */