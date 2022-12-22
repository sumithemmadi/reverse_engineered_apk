package b.h.e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.d.c;
import b.h.h.f;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public class g extends e {
  protected final Class<?> g;
  
  protected final Constructor<?> h;
  
  protected final Method i;
  
  protected final Method j;
  
  protected final Method k;
  
  protected final Method l;
  
  protected final Method m;
  
  public g() {
    ClassNotFoundException classNotFoundException2;
    ClassNotFoundException classNotFoundException3;
    ClassNotFoundException classNotFoundException4;
    ClassNotFoundException classNotFoundException5;
    ClassNotFoundException classNotFoundException6;
    ClassNotFoundException classNotFoundException7;
    ClassNotFoundException classNotFoundException1 = null;
    try {
      Class<?> clazz = y();
      Constructor<?> constructor = z(clazz);
      Method method1 = v(clazz);
      Method method2 = w(clazz);
      Method method3 = A(clazz);
      Method method4 = u(clazz);
      Method method5 = x(clazz);
    } catch (ClassNotFoundException classNotFoundException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to collect necessary methods for class ");
      stringBuilder.append(classNotFoundException.getClass().getName());
      Log.e("TypefaceCompatApi26Impl", stringBuilder.toString(), classNotFoundException);
      classNotFoundException7 = null;
      classNotFoundException = classNotFoundException7;
      classNotFoundException2 = classNotFoundException;
      classNotFoundException4 = classNotFoundException2;
      classNotFoundException5 = classNotFoundException4;
      classNotFoundException6 = classNotFoundException5;
      classNotFoundException3 = classNotFoundException2;
      classNotFoundException2 = classNotFoundException;
      classNotFoundException = classNotFoundException1;
    } catch (NoSuchMethodException noSuchMethodException) {}
    this.g = (Class<?>)noSuchMethodException;
    this.h = (Constructor<?>)classNotFoundException2;
    this.i = (Method)classNotFoundException3;
    this.j = (Method)classNotFoundException4;
    this.k = (Method)classNotFoundException5;
    this.l = (Method)classNotFoundException6;
    this.m = (Method)classNotFoundException7;
  }
  
  private Object o() {
    try {
      return this.h.newInstance(new Object[0]);
    } catch (IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  private void p(Object paramObject) {
    try {
      this.l.invoke(paramObject, new Object[0]);
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {}
  }
  
  private boolean q(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3, FontVariationAxis[] paramArrayOfFontVariationAxis) {
    try {
      return ((Boolean)this.i.invoke(paramObject, new Object[] { paramContext.getAssets(), paramString, Integer.valueOf(0), Boolean.FALSE, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramArrayOfFontVariationAxis })).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  private boolean r(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3) {
    try {
      return ((Boolean)this.j.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) })).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  private boolean s(Object paramObject) {
    try {
      return ((Boolean)this.k.invoke(paramObject, new Object[0])).booleanValue();
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return false;
    } 
  }
  
  private boolean t() {
    boolean bool;
    if (this.i == null)
      Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation."); 
    if (this.i != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected Method A(Class<?> paramClass) {
    return paramClass.getMethod("freeze", new Class[0]);
  }
  
  public Typeface b(Context paramContext, c.b paramb, Resources paramResources, int paramInt) {
    if (!t())
      return super.b(paramContext, paramb, paramResources, paramInt); 
    Object object = o();
    if (object == null)
      return null; 
    c.c[] arrayOfC = paramb.a();
    int i = arrayOfC.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      c.c c = arrayOfC[paramInt];
      if (!q(paramContext, object, c.a(), c.c(), c.e(), c.f(), FontVariationAxis.fromFontVariationSettings(c.d()))) {
        p(object);
        return null;
      } 
    } 
    return !s(object) ? null : l(object);
  }
  
  public Typeface c(Context paramContext, CancellationSignal paramCancellationSignal, f.b[] paramArrayOfb, int paramInt) {
    f.b b1;
    if (paramArrayOfb.length < 1)
      return null; 
    if (!t()) {
      b1 = h(paramArrayOfb, paramInt);
      ContentResolver contentResolver = paramContext.getContentResolver();
      try {
        ParcelFileDescriptor parcelFileDescriptor = contentResolver.openFileDescriptor(b1.d(), "r", paramCancellationSignal);
        if (parcelFileDescriptor == null) {
          if (parcelFileDescriptor != null)
            parcelFileDescriptor.close(); 
          return null;
        } 
        try {
          Typeface.Builder builder = new Typeface.Builder();
          this(parcelFileDescriptor.getFileDescriptor());
          return builder.setWeight(b1.e()).setItalic(b1.f()).build();
        } finally {
          try {
            parcelFileDescriptor.close();
          } finally {}
        } 
      } catch (IOException iOException) {
        return null;
      } 
    } 
    Map<Uri, ByteBuffer> map = k.h((Context)iOException, (f.b[])b1, paramCancellationSignal);
    Object object = o();
    if (object == null)
      return null; 
    int i = b1.length;
    boolean bool = false;
    for (byte b2 = 0; b2 < i; b2++) {
      f.b b3 = b1[b2];
      ByteBuffer byteBuffer = map.get(b3.d());
      if (byteBuffer != null) {
        if (!r(object, byteBuffer, b3.c(), b3.e(), b3.f())) {
          p(object);
          return null;
        } 
        bool = true;
      } 
    } 
    if (!bool) {
      p(object);
      return null;
    } 
    if (!s(object))
      return null; 
    object = l(object);
    return (object == null) ? null : Typeface.create((Typeface)object, paramInt);
  }
  
  public Typeface e(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    if (!t())
      return super.e(paramContext, paramResources, paramInt1, paramString, paramInt2); 
    Object object = o();
    if (object == null)
      return null; 
    if (!q(paramContext, object, paramString, 0, -1, -1, null)) {
      p(object);
      return null;
    } 
    return !s(object) ? null : l(object);
  }
  
  protected Typeface l(Object paramObject) {
    try {
      Object object = Array.newInstance(this.g, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)this.m.invoke(null, new Object[] { object, Integer.valueOf(-1), Integer.valueOf(-1) });
    } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
      return null;
    } 
  }
  
  protected Method u(Class<?> paramClass) {
    return paramClass.getMethod("abortCreation", new Class[0]);
  }
  
  protected Method v(Class<?> paramClass) {
    Class<int> clazz = int.class;
    return paramClass.getMethod("addFontFromAssetManager", new Class[] { AssetManager.class, String.class, clazz, boolean.class, clazz, clazz, clazz, FontVariationAxis[].class });
  }
  
  protected Method w(Class<?> paramClass) {
    Class<int> clazz = int.class;
    return paramClass.getMethod("addFontFromBuffer", new Class[] { ByteBuffer.class, clazz, FontVariationAxis[].class, clazz, clazz });
  }
  
  protected Method x(Class<?> paramClass) {
    paramClass = Array.newInstance(paramClass, 1).getClass();
    Class<int> clazz = int.class;
    Method method = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { paramClass, clazz, clazz });
    method.setAccessible(true);
    return method;
  }
  
  protected Class<?> y() {
    return Class.forName("android.graphics.FontFamily");
  }
  
  protected Constructor<?> z(Class<?> paramClass) {
    return paramClass.getConstructor(new Class[0]);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */