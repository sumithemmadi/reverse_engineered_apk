package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

public final class gr1 {
  private static final Object a;
  
  private static final Method b;
  
  private static final Method c;
  
  static {
    Method method2;
    Object object = c();
    a = object;
    Method method1 = null;
    if (object == null) {
      method2 = null;
    } else {
      method2 = b("getStackTraceElement", new Class[] { Throwable.class, int.class });
    } 
    b = method2;
    if (object == null) {
      method2 = method1;
    } else {
      method2 = d();
    } 
    c = method2;
  }
  
  public static String a(Throwable paramThrowable) {
    StringWriter stringWriter = new StringWriter();
    p22.a(paramThrowable, new PrintWriter(stringWriter));
    return stringWriter.toString();
  }
  
  private static Method b(String paramString, Class<?>... paramVarArgs) {
    try {
      return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader)null).getMethod(paramString, paramVarArgs);
    } catch (ThreadDeath threadDeath) {
      throw threadDeath;
    } finally {
      paramString = null;
    } 
  }
  
  private static Object c() {
    object = null;
    try {
      Object object1 = Class.forName("sun.misc.SharedSecrets", false, (ClassLoader)null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
      object = object1;
    } catch (ThreadDeath object) {
      throw object;
    } finally {
      Exception exception;
    } 
    return object;
  }
  
  private static Method d() {
    try {
      Method method = b("getStackTraceDepth", new Class[] { Throwable.class });
      if (method == null)
        return null; 
      Object object = c();
      Throwable throwable = new Throwable();
      this();
      method.invoke(object, new Object[] { throwable });
      return method;
    } catch (UnsupportedOperationException|IllegalAccessException|java.lang.reflect.InvocationTargetException unsupportedOperationException) {
      return null;
    } 
  }
  
  public static void e(Throwable paramThrowable) {
    xq1.b(paramThrowable);
    if (!(paramThrowable instanceof RuntimeException)) {
      if (!(paramThrowable instanceof Error))
        return; 
      throw (Error)paramThrowable;
    } 
    throw (RuntimeException)paramThrowable;
  }
  
  @Deprecated
  public static RuntimeException f(Throwable paramThrowable) {
    e(paramThrowable);
    throw new RuntimeException(paramThrowable);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */