package b.h.e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.d.c;
import b.h.h.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class e extends j {
  private static Class<?> b;
  
  private static Constructor<?> c;
  
  private static Method d;
  
  private static Method e;
  
  private static boolean f = false;
  
  private static boolean k(Object paramObject, String paramString, int paramInt, boolean paramBoolean) {
    n();
    try {
      return ((Boolean)d.invoke(paramObject, new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).booleanValue();
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  private static Typeface l(Object paramObject) {
    n();
    try {
      Object object = Array.newInstance(b, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)e.invoke(null, new Object[] { object });
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  private File m(ParcelFileDescriptor paramParcelFileDescriptor) {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("/proc/self/fd/");
      stringBuilder.append(paramParcelFileDescriptor.getFd());
      String str = Os.readlink(stringBuilder.toString());
      if (OsConstants.S_ISREG((Os.stat(str)).st_mode))
        return new File(str); 
    } catch (ErrnoException errnoException) {}
    return null;
  }
  
  private static void n() {
    ClassNotFoundException classNotFoundException1;
    ClassNotFoundException classNotFoundException2;
    if (f)
      return; 
    f = true;
    Constructor<?> constructor = null;
    try {
      Class<?> clazz = Class.forName("android.graphics.FontFamily");
      Constructor<?> constructor1 = clazz.getConstructor(new Class[0]);
      Method method1 = clazz.getMethod("addFontWeightStyle", new Class[] { String.class, int.class, boolean.class });
      Method method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { Array.newInstance(clazz, 1).getClass() });
      constructor = constructor1;
    } catch (ClassNotFoundException classNotFoundException) {
      Log.e("TypefaceCompatApi21Impl", classNotFoundException.getClass().getName(), classNotFoundException);
      classNotFoundException2 = null;
      classNotFoundException = classNotFoundException2;
      classNotFoundException1 = classNotFoundException;
    } catch (NoSuchMethodException noSuchMethodException) {}
    c = constructor;
    b = (Class<?>)noSuchMethodException;
    d = (Method)classNotFoundException1;
    e = (Method)classNotFoundException2;
  }
  
  private static Object o() {
    n();
    try {
      return c.newInstance(new Object[0]);
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InstantiationException instantiationException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    throw new RuntimeException(invocationTargetException);
  }
  
  public Typeface b(Context paramContext, c.b paramb, Resources paramResources, int paramInt) {
    Object object = o();
    c.c[] arrayOfC = paramb.a();
    int i = arrayOfC.length;
    paramInt = 0;
    while (paramInt < i) {
      c.c c = arrayOfC[paramInt];
      File file = k.e(paramContext);
      if (file == null)
        return null; 
      try {
        boolean bool = k.c(file, paramResources, c.b());
        if (!bool)
          return null; 
        bool = k(object, file.getPath(), c.e(), c.f());
        if (!bool)
          return null; 
        file.delete();
      } catch (RuntimeException runtimeException) {
        return null;
      } finally {
        file.delete();
      } 
    } 
    return l(object);
  }
  
  public Typeface c(Context paramContext, CancellationSignal paramCancellationSignal, f.b[] paramArrayOfb, int paramInt) {
    if (paramArrayOfb.length < 1)
      return null; 
    f.b b1 = h(paramArrayOfb, paramInt);
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      ParcelFileDescriptor parcelFileDescriptor = contentResolver.openFileDescriptor(b1.d(), "r", paramCancellationSignal);
      if (parcelFileDescriptor == null) {
        if (parcelFileDescriptor != null)
          parcelFileDescriptor.close(); 
        return null;
      } 
      try {
        FileInputStream fileInputStream;
        File file = m(parcelFileDescriptor);
        if (file == null || !file.canRead()) {
          fileInputStream = new FileInputStream();
          this(parcelFileDescriptor.getFileDescriptor());
          try {
            return d(paramContext, fileInputStream);
          } finally {
            try {
              fileInputStream.close();
            } finally {}
          } 
        } 
        return Typeface.createFromFile((File)fileInputStream);
      } finally {
        try {
          parcelFileDescriptor.close();
        } finally {}
      } 
    } catch (IOException iOException) {
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */