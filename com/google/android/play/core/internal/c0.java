package com.google.android.play.core.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

public final class c0<T> {
  private final Object a;
  
  private final Field b;
  
  private final Class<T> c;
  
  c0(Object paramObject, Field paramField, Class<T> paramClass) {
    this.a = paramObject;
    this.b = paramField;
    this.c = paramClass;
  }
  
  c0(Object paramObject, Field paramField, Class<?> paramClass, byte[] paramArrayOfbyte) {
    this(paramObject, paramField, (Class)Array.newInstance(paramClass, 0).getClass());
  }
  
  private Class f() {
    return c().getType().getComponentType();
  }
  
  public final T a() {
    try {
      return this.c.cast(this.b.get(this.a));
    } catch (Exception exception) {
      throw new bi(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[] { this.b.getName(), this.a.getClass().getName(), this.c.getName() }), exception);
    } 
  }
  
  public final void b(T paramT) {
    try {
      this.b.set(this.a, paramT);
      return;
    } catch (Exception exception) {
      throw new bi(String.format("Failed to set value of field %s of type %s on object of type %s", new Object[] { this.b.getName(), this.a.getClass().getName(), this.c.getName() }), exception);
    } 
  }
  
  protected final Field c() {
    return this.b;
  }
  
  public void d(Collection paramCollection) {
    int i;
    Object[] arrayOfObject1 = (Object[])a();
    if (arrayOfObject1 == null) {
      i = 0;
    } else {
      i = arrayOfObject1.length;
    } 
    Object[] arrayOfObject2 = (Object[])Array.newInstance(f(), paramCollection.size() + i);
    if (arrayOfObject1 != null)
      System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, arrayOfObject1.length); 
    Iterator iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      arrayOfObject2[i] = iterator.next();
      i++;
    } 
    b((T)arrayOfObject2);
  }
  
  public void e(Collection paramCollection) {
    Object[] arrayOfObject1 = (Object[])a();
    boolean bool = false;
    if (arrayOfObject1 == null) {
      i = 0;
    } else {
      i = arrayOfObject1.length;
    } 
    Object[] arrayOfObject2 = (Object[])Array.newInstance(f(), i + paramCollection.size());
    if (arrayOfObject1 != null)
      System.arraycopy(arrayOfObject1, 0, arrayOfObject2, paramCollection.size(), arrayOfObject1.length); 
    Iterator iterator = paramCollection.iterator();
    for (int i = bool; iterator.hasNext(); i++)
      arrayOfObject2[i] = iterator.next(); 
    b((T)arrayOfObject2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */