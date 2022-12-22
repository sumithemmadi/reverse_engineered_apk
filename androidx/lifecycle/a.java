package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class a {
  static a a = new a();
  
  private final Map<Class<?>, a> b = new HashMap<Class<?>, a>();
  
  private final Map<Class<?>, Boolean> c = new HashMap<Class<?>, Boolean>();
  
  private a a(Class<?> paramClass, Method[] paramArrayOfMethod) {
    Class<?> clazz = paramClass.getSuperclass();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    if (clazz != null) {
      a a2 = c(clazz);
      if (a2 != null)
        hashMap.putAll(a2.b); 
    } 
    Class[] arrayOfClass = paramClass.getInterfaces();
    int i = arrayOfClass.length;
    byte b;
    for (b = 0; b < i; b++) {
      for (Map.Entry<b, Lifecycle.Event> entry : (c(arrayOfClass[b])).b.entrySet())
        e((Map)hashMap, (b)entry.getKey(), (Lifecycle.Event)entry.getValue(), paramClass); 
    } 
    if (paramArrayOfMethod == null)
      paramArrayOfMethod = b(paramClass); 
    int j = paramArrayOfMethod.length;
    i = 0;
    boolean bool = false;
    while (i < j) {
      Method method = paramArrayOfMethod[i];
      o o = method.<o>getAnnotation(o.class);
      if (o != null) {
        arrayOfClass = method.getParameterTypes();
        if (arrayOfClass.length > 0) {
          if (arrayOfClass[0].isAssignableFrom(h.class)) {
            b = 1;
          } else {
            throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
          } 
        } else {
          b = 0;
        } 
        Lifecycle.Event event = o.value();
        if (arrayOfClass.length > 1)
          if (arrayOfClass[1].isAssignableFrom(Lifecycle.Event.class)) {
            if (event == Lifecycle.Event.ON_ANY) {
              b = 2;
            } else {
              throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
            } 
          } else {
            throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
          }  
        if (arrayOfClass.length <= 2) {
          e((Map)hashMap, new b(b, method), event, paramClass);
          bool = true;
        } else {
          throw new IllegalArgumentException("cannot have more than 2 params");
        } 
      } 
      i++;
    } 
    a a1 = new a((Map)hashMap);
    this.b.put(paramClass, a1);
    this.c.put(paramClass, Boolean.valueOf(bool));
    return a1;
  }
  
  private Method[] b(Class<?> paramClass) {
    try {
      return paramClass.getDeclaredMethods();
    } catch (NoClassDefFoundError noClassDefFoundError) {
      throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
    } 
  }
  
  private void e(Map<b, Lifecycle.Event> paramMap, b paramb, Lifecycle.Event paramEvent, Class<?> paramClass) {
    Lifecycle.Event event = paramMap.get(paramb);
    if (event == null || paramEvent == event) {
      if (event == null)
        paramMap.put(paramb, paramEvent); 
      return;
    } 
    Method method = paramb.b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Method ");
    stringBuilder.append(method.getName());
    stringBuilder.append(" in ");
    stringBuilder.append(paramClass.getName());
    stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous value ");
    stringBuilder.append(event);
    stringBuilder.append(", new value ");
    stringBuilder.append(paramEvent);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  a c(Class<?> paramClass) {
    a a1 = this.b.get(paramClass);
    return (a1 != null) ? a1 : a(paramClass, null);
  }
  
  boolean d(Class<?> paramClass) {
    Boolean bool = this.c.get(paramClass);
    if (bool != null)
      return bool.booleanValue(); 
    Method[] arrayOfMethod = b(paramClass);
    int i = arrayOfMethod.length;
    for (byte b = 0; b < i; b++) {
      if ((o)arrayOfMethod[b].<o>getAnnotation(o.class) != null) {
        a(paramClass, arrayOfMethod);
        return true;
      } 
    } 
    this.c.put(paramClass, Boolean.FALSE);
    return false;
  }
  
  static class a {
    final Map<Lifecycle.Event, List<a.b>> a;
    
    final Map<a.b, Lifecycle.Event> b;
    
    a(Map<a.b, Lifecycle.Event> param1Map) {
      this.b = param1Map;
      this.a = new HashMap<Lifecycle.Event, List<a.b>>();
      for (Map.Entry<a.b, Lifecycle.Event> entry : param1Map.entrySet()) {
        Lifecycle.Event event = (Lifecycle.Event)entry.getValue();
        List<a.b> list2 = this.a.get(event);
        List<a.b> list1 = list2;
        if (list2 == null) {
          list1 = new ArrayList();
          this.a.put(event, list1);
        } 
        list1.add((a.b)entry.getKey());
      } 
    }
    
    private static void b(List<a.b> param1List, h param1h, Lifecycle.Event param1Event, Object param1Object) {
      if (param1List != null)
        for (int i = param1List.size() - 1; i >= 0; i--)
          ((a.b)param1List.get(i)).a(param1h, param1Event, param1Object);  
    }
    
    void a(h param1h, Lifecycle.Event param1Event, Object param1Object) {
      b(this.a.get(param1Event), param1h, param1Event, param1Object);
      b(this.a.get(Lifecycle.Event.ON_ANY), param1h, param1Event, param1Object);
    }
  }
  
  static final class b {
    final int a;
    
    final Method b;
    
    b(int param1Int, Method param1Method) {
      this.a = param1Int;
      this.b = param1Method;
      param1Method.setAccessible(true);
    }
    
    void a(h param1h, Lifecycle.Event param1Event, Object param1Object) {
      try {
        int i = this.a;
        if (i != 0) {
          if (i != 1) {
            if (i == 2)
              this.b.invoke(param1Object, new Object[] { param1h, param1Event }); 
          } else {
            this.b.invoke(param1Object, new Object[] { param1h });
          } 
        } else {
          this.b.invoke(param1Object, new Object[0]);
        } 
        return;
      } catch (InvocationTargetException invocationTargetException) {
        throw new RuntimeException("Failed to call observer method", invocationTargetException.getCause());
      } catch (IllegalAccessException illegalAccessException) {
        throw new RuntimeException(illegalAccessException);
      } 
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof b))
        return false; 
      param1Object = param1Object;
      if (this.a != ((b)param1Object).a || !this.b.getName().equals(((b)param1Object).b.getName()))
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      return this.a * 31 + this.b.getName().hashCode();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/lifecycle/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */