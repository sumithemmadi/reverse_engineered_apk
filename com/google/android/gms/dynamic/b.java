package com.google.android.gms.dynamic;

import android.os.IBinder;
import java.lang.reflect.Field;

public final class b<T> extends a.a {
  private final T b;
  
  private b(T paramT) {
    this.b = paramT;
  }
  
  public static <T> a a2(T paramT) {
    return new b<T>(paramT);
  }
  
  public static <T> T o1(a parama) {
    Field field;
    if (parama instanceof b)
      return ((b)parama).b; 
    IBinder iBinder = parama.asBinder();
    Field[] arrayOfField = iBinder.getClass().getDeclaredFields();
    parama = null;
    int i = arrayOfField.length;
    int j = 0;
    int k;
    for (k = 0; j < i; k = m) {
      Field field1 = arrayOfField[j];
      int m = k;
      if (!field1.isSynthetic()) {
        m = k + 1;
        field = field1;
      } 
      j++;
    } 
    if (k == 1) {
      if (!field.isAccessible()) {
        field.setAccessible(true);
        try {
          return (T)field.get(iBinder);
        } catch (NullPointerException nullPointerException) {
          throw new IllegalArgumentException("Binder object is null.", nullPointerException);
        } catch (IllegalAccessException illegalAccessException) {
          throw new IllegalArgumentException("Could not access the field in remoteBinder.", illegalAccessException);
        } 
      } 
      throw new IllegalArgumentException("IObjectWrapper declared field not private!");
    } 
    j = arrayOfField.length;
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append("Unexpected number of IObjectWrapper declared fields: ");
    stringBuilder.append(j);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/dynamic/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */