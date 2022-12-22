package b.h.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.d.c;
import b.e.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class f extends j {
  private static final Class<?> b;
  
  private static final Constructor<?> c;
  
  private static final Method d;
  
  private static final Method e;
  
  static {
    ClassNotFoundException classNotFoundException2;
    ClassNotFoundException classNotFoundException3;
    ClassNotFoundException classNotFoundException4;
    ClassNotFoundException classNotFoundException1 = null;
    try {
      Class<?> clazz = Class.forName("android.graphics.FontFamily");
      Constructor<?> constructor = clazz.getConstructor(new Class[0]);
      Class<int> clazz1 = int.class;
      Method method1 = clazz.getMethod("addFontWeightStyle", new Class[] { ByteBuffer.class, clazz1, List.class, clazz1, boolean.class });
      Method method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(clazz, 1).getClass() });
    } catch (ClassNotFoundException classNotFoundException) {
      Log.e("TypefaceCompatApi24Impl", classNotFoundException.getClass().getName(), classNotFoundException);
      classNotFoundException2 = null;
      classNotFoundException = classNotFoundException2;
      classNotFoundException3 = classNotFoundException;
      classNotFoundException4 = classNotFoundException;
      classNotFoundException = classNotFoundException1;
    } catch (NoSuchMethodException noSuchMethodException) {}
    c = (Constructor<?>)noSuchMethodException;
    b = (Class<?>)classNotFoundException2;
    d = (Method)classNotFoundException3;
    e = (Method)classNotFoundException4;
  }
  
  private static boolean k(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean) {
    try {
      return ((Boolean)d.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) })).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  private static Typeface l(Object paramObject) {
    try {
      Object object = Array.newInstance(b, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)e.invoke(null, new Object[] { object });
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  public static boolean m() {
    boolean bool;
    Method method = d;
    if (method == null)
      Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation."); 
    if (method != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static Object n() {
    try {
      return c.newInstance(new Object[0]);
    } catch (IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  public Typeface b(Context paramContext, c.b paramb, Resources paramResources, int paramInt) {
    Object object = n();
    if (object == null)
      return null; 
    c.c[] arrayOfC = paramb.a();
    int i = arrayOfC.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      c.c c = arrayOfC[paramInt];
      ByteBuffer byteBuffer = k.b(paramContext, paramResources, c.b());
      if (byteBuffer == null)
        return null; 
      if (!k(object, byteBuffer, c.c(), c.e(), c.f()))
        return null; 
    } 
    return l(object);
  }
  
  public Typeface c(Context paramContext, CancellationSignal paramCancellationSignal, b.h.h.f.b[] paramArrayOfb, int paramInt) {
    Object object = n();
    if (object == null)
      return null; 
    g g = new g();
    int i = paramArrayOfb.length;
    for (byte b1 = 0; b1 < i; b1++) {
      b.h.h.f.b b2 = paramArrayOfb[b1];
      Uri uri = b2.d();
      ByteBuffer byteBuffer1 = (ByteBuffer)g.get(uri);
      ByteBuffer byteBuffer2 = byteBuffer1;
      if (byteBuffer1 == null) {
        byteBuffer2 = k.f(paramContext, paramCancellationSignal, uri);
        g.put(uri, byteBuffer2);
      } 
      if (byteBuffer2 == null)
        return null; 
      if (!k(object, byteBuffer2, b2.c(), b2.e(), b2.f()))
        return null; 
    } 
    Typeface typeface = l(object);
    return (typeface == null) ? null : Typeface.create(typeface, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */