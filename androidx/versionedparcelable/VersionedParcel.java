package androidx.versionedparcelable;

import android.os.Parcelable;
import b.e.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class VersionedParcel {
  protected final a<String, Method> a;
  
  protected final a<String, Method> b;
  
  protected final a<String, Class> c;
  
  public VersionedParcel(a<String, Method> parama1, a<String, Method> parama2, a<String, Class> parama) {
    this.a = parama1;
    this.b = parama2;
    this.c = parama;
  }
  
  private void N(b paramb) {
    try {
      Class clazz = c((Class)paramb.getClass());
      I(clazz.getName());
      return;
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramb.getClass().getSimpleName());
      stringBuilder.append(" does not have a Parcelizer");
      throw new RuntimeException(stringBuilder.toString(), classNotFoundException);
    } 
  }
  
  private Class c(Class<? extends b> paramClass) {
    Class<?> clazz1 = (Class)this.c.get(paramClass.getName());
    Class<?> clazz2 = clazz1;
    if (clazz1 == null) {
      clazz2 = Class.forName(String.format("%s.%sParcelizer", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() }), false, paramClass.getClassLoader());
      this.c.put(paramClass.getName(), clazz2);
    } 
    return clazz2;
  }
  
  private Method d(String paramString) {
    Method method1 = (Method)this.a.get(paramString);
    Method method2 = method1;
    if (method1 == null) {
      System.currentTimeMillis();
      method2 = Class.forName(paramString, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", new Class[] { VersionedParcel.class });
      this.a.put(paramString, method2);
    } 
    return method2;
  }
  
  private Method e(Class<? extends b> paramClass) {
    Method method1 = (Method)this.b.get(paramClass.getName());
    Method method2 = method1;
    if (method1 == null) {
      Class clazz = c(paramClass);
      System.currentTimeMillis();
      method2 = clazz.getDeclaredMethod("write", new Class[] { paramClass, VersionedParcel.class });
      this.b.put(paramClass.getName(), method2);
    } 
    return method2;
  }
  
  protected abstract void A(byte[] paramArrayOfbyte);
  
  public void B(byte[] paramArrayOfbyte, int paramInt) {
    w(paramInt);
    A(paramArrayOfbyte);
  }
  
  protected abstract void C(CharSequence paramCharSequence);
  
  public void D(CharSequence paramCharSequence, int paramInt) {
    w(paramInt);
    C(paramCharSequence);
  }
  
  protected abstract void E(int paramInt);
  
  public void F(int paramInt1, int paramInt2) {
    w(paramInt2);
    E(paramInt1);
  }
  
  protected abstract void G(Parcelable paramParcelable);
  
  public void H(Parcelable paramParcelable, int paramInt) {
    w(paramInt);
    G(paramParcelable);
  }
  
  protected abstract void I(String paramString);
  
  public void J(String paramString, int paramInt) {
    w(paramInt);
    I(paramString);
  }
  
  protected <T extends b> void K(T paramT, VersionedParcel paramVersionedParcel) {
    try {
      e(paramT.getClass()).invoke(null, new Object[] { paramT, paramVersionedParcel });
      return;
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      if (invocationTargetException.getCause() instanceof RuntimeException)
        throw (RuntimeException)invocationTargetException.getCause(); 
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException);
    } catch (NoSuchMethodException noSuchMethodException) {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
    } 
  }
  
  protected void L(b paramb) {
    if (paramb == null) {
      I(null);
      return;
    } 
    N(paramb);
    VersionedParcel versionedParcel = b();
    K(paramb, versionedParcel);
    versionedParcel.a();
  }
  
  public void M(b paramb, int paramInt) {
    w(paramInt);
    L(paramb);
  }
  
  protected abstract void a();
  
  protected abstract VersionedParcel b();
  
  public boolean f() {
    return false;
  }
  
  protected abstract boolean g();
  
  public boolean h(boolean paramBoolean, int paramInt) {
    return !m(paramInt) ? paramBoolean : g();
  }
  
  protected abstract byte[] i();
  
  public byte[] j(byte[] paramArrayOfbyte, int paramInt) {
    return !m(paramInt) ? paramArrayOfbyte : i();
  }
  
  protected abstract CharSequence k();
  
  public CharSequence l(CharSequence paramCharSequence, int paramInt) {
    return !m(paramInt) ? paramCharSequence : k();
  }
  
  protected abstract boolean m(int paramInt);
  
  protected <T extends b> T n(String paramString, VersionedParcel paramVersionedParcel) {
    try {
      return (T)d(paramString).invoke(null, new Object[] { paramVersionedParcel });
    } catch (IllegalAccessException illegalAccessException) {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", illegalAccessException);
    } catch (InvocationTargetException invocationTargetException) {
      if (invocationTargetException.getCause() instanceof RuntimeException)
        throw (RuntimeException)invocationTargetException.getCause(); 
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", invocationTargetException);
    } catch (NoSuchMethodException noSuchMethodException) {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", noSuchMethodException);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", classNotFoundException);
    } 
  }
  
  protected abstract int o();
  
  public int p(int paramInt1, int paramInt2) {
    return !m(paramInt2) ? paramInt1 : o();
  }
  
  protected abstract <T extends Parcelable> T q();
  
  public <T extends Parcelable> T r(T paramT, int paramInt) {
    return !m(paramInt) ? paramT : q();
  }
  
  protected abstract String s();
  
  public String t(String paramString, int paramInt) {
    return !m(paramInt) ? paramString : s();
  }
  
  protected <T extends b> T u() {
    String str = s();
    return (str == null) ? null : n(str, b());
  }
  
  public <T extends b> T v(T paramT, int paramInt) {
    return !m(paramInt) ? paramT : u();
  }
  
  protected abstract void w(int paramInt);
  
  public void x(boolean paramBoolean1, boolean paramBoolean2) {}
  
  protected abstract void y(boolean paramBoolean);
  
  public void z(boolean paramBoolean, int paramInt) {
    w(paramInt);
    y(paramBoolean);
  }
  
  public static class ParcelException extends RuntimeException {
    public ParcelException(Throwable param1Throwable) {
      super(param1Throwable);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/versionedparcelable/VersionedParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */