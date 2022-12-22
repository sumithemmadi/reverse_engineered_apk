package androidx.work;

import java.util.List;

public abstract class e {
  private static final String a = f.f("InputMerger");
  
  public static e a(String paramString) {
    try {
      return (e)Class.forName(paramString).newInstance();
    } catch (Exception exception) {
      f f = f.c();
      String str = a;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Trouble instantiating + ");
      stringBuilder.append(paramString);
      f.b(str, stringBuilder.toString(), new Throwable[] { exception });
      return null;
    } 
  }
  
  public abstract d b(List<d> paramList);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */