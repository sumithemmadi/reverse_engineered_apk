package androidx.fragment.app;

public class g {
  private static final b.e.g<ClassLoader, b.e.g<String, Class<?>>> a = new b.e.g();
  
  static boolean b(ClassLoader paramClassLoader, String paramString) {
    try {
      return Fragment.class.isAssignableFrom(c(paramClassLoader, paramString));
    } catch (ClassNotFoundException classNotFoundException) {
      return false;
    } 
  }
  
  private static Class<?> c(ClassLoader paramClassLoader, String paramString) {
    b.e.g<ClassLoader, b.e.g<String, Class<?>>> g1 = a;
    b.e.g g2 = (b.e.g)g1.get(paramClassLoader);
    b.e.g g3 = g2;
    if (g2 == null) {
      g3 = new b.e.g();
      g1.put(paramClassLoader, g3);
    } 
    Class<?> clazz1 = (Class)g3.get(paramString);
    Class<?> clazz2 = clazz1;
    if (clazz1 == null) {
      clazz2 = Class.forName(paramString, false, paramClassLoader);
      g3.put(paramString, clazz2);
    } 
    return clazz2;
  }
  
  public static Class<? extends Fragment> d(ClassLoader paramClassLoader, String paramString) {
    try {
      return (Class)c(paramClassLoader, paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class name exists");
      throw new Fragment.InstantiationException(stringBuilder.toString(), classNotFoundException);
    } catch (ClassCastException classCastException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to instantiate fragment ");
      stringBuilder.append(paramString);
      stringBuilder.append(": make sure class is a valid subclass of Fragment");
      throw new Fragment.InstantiationException(stringBuilder.toString(), classCastException);
    } 
  }
  
  public Fragment a(ClassLoader paramClassLoader, String paramString) {
    throw null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/fragment/app/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */