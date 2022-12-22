package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class h42<T extends y32> {
  private static final Logger a = Logger.getLogger(zzekl.class.getName());
  
  private static String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
  
  static <T extends y32> T b(Class<T> paramClass) {
    IllegalArgumentException illegalArgumentException;
    String str;
    ClassLoader classLoader = h42.class.getClassLoader();
    if (paramClass.equals(y32.class)) {
      str = b;
    } else if (paramClass.getPackage().equals(h42.class.getPackage())) {
      str = String.format("%s.BlazeGenerated%sLoader", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() });
    } else {
      illegalArgumentException = new IllegalArgumentException(paramClass.getName());
      throw illegalArgumentException;
    } 
    try {
      Class<?> clazz = Class.forName(str, true, classLoader);
      try {
        h42 h421 = clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
        return (T)illegalArgumentException.cast(h421.a());
      } catch (NoSuchMethodException noSuchMethodException) {
        IllegalStateException illegalStateException = new IllegalStateException();
        this(noSuchMethodException);
        throw illegalStateException;
      } catch (InstantiationException instantiationException) {
        IllegalStateException illegalStateException = new IllegalStateException();
        this(instantiationException);
        throw illegalStateException;
      } catch (IllegalAccessException illegalAccessException) {
        IllegalStateException illegalStateException = new IllegalStateException();
        this(illegalAccessException);
        throw illegalStateException;
      } catch (InvocationTargetException invocationTargetException) {
        IllegalStateException illegalStateException = new IllegalStateException();
        this(invocationTargetException);
        throw illegalStateException;
      } 
    } catch (ClassNotFoundException classNotFoundException) {
      Iterator<h42> iterator = ServiceLoader.<h42>load(h42.class, classLoader).iterator();
      ArrayList<y32> arrayList = new ArrayList();
      while (iterator.hasNext()) {
        try {
          arrayList.add(illegalArgumentException.cast(((h42)iterator.next()).a()));
        } catch (ServiceConfigurationError serviceConfigurationError) {
          Logger logger = a;
          Level level = Level.SEVERE;
          String str1 = illegalArgumentException.getSimpleName();
          if (str1.length() != 0) {
            str1 = "Unable to load ".concat(str1);
          } else {
            str1 = new String("Unable to load ");
          } 
          logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str1, serviceConfigurationError);
        } 
      } 
      if (arrayList.size() == 1)
        return (T)arrayList.get(0); 
      if (arrayList.size() == 0)
        return null; 
      try {
        return (T)illegalArgumentException.getMethod("combine", new Class[] { Collection.class }).invoke(null, new Object[] { arrayList });
      } catch (NoSuchMethodException noSuchMethodException) {
        throw new IllegalStateException(noSuchMethodException);
      } catch (IllegalAccessException illegalAccessException) {
        throw new IllegalStateException(illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
        throw new IllegalStateException(invocationTargetException);
      } 
    } 
  }
  
  protected abstract T a();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/h42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */