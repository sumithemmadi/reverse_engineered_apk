package androidx.work;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArrayCreatingInputMerger extends e {
  private Object c(Object paramObject1, Object paramObject2) {
    int i = Array.getLength(paramObject1);
    Object object = Array.newInstance(paramObject2.getClass(), i + 1);
    System.arraycopy(paramObject1, 0, object, 0, i);
    Array.set(object, i, paramObject2);
    return object;
  }
  
  private Object d(Object paramObject1, Object paramObject2) {
    int i = Array.getLength(paramObject1);
    int j = Array.getLength(paramObject2);
    Object object = Array.newInstance(paramObject1.getClass().getComponentType(), i + j);
    System.arraycopy(paramObject1, 0, object, 0, i);
    System.arraycopy(paramObject2, 0, object, i, j);
    return object;
  }
  
  private Object e(Object paramObject1, Object paramObject2) {
    Object object = Array.newInstance(paramObject1.getClass(), 2);
    Array.set(object, 0, paramObject1);
    Array.set(object, 1, paramObject2);
    return object;
  }
  
  private Object f(Object paramObject) {
    Object object = Array.newInstance(paramObject.getClass(), 1);
    Array.set(object, 0, paramObject);
    return object;
  }
  
  public d b(List<d> paramList) {
    d.a a = new d.a();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    Iterator<d> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      for (Map.Entry<String, Object> entry : ((d)iterator.next()).h().entrySet()) {
        String str = (String)entry.getKey();
        entry = (Map.Entry<String, Object>)entry.getValue();
        Class<?> clazz = entry.getClass();
        Object object = hashMap.get(str);
        if (object == null) {
          if (!clazz.isArray())
            entry = (Map.Entry<String, Object>)f(entry); 
        } else {
          Class<?> clazz1 = object.getClass();
          if (clazz1.equals(clazz)) {
            if (clazz1.isArray()) {
              entry = (Map.Entry<String, Object>)d(object, entry);
            } else {
              entry = (Map.Entry<String, Object>)e(object, entry);
            } 
          } else if (clazz1.isArray() && clazz1.getComponentType().equals(clazz)) {
            entry = (Map.Entry<String, Object>)c(object, entry);
          } else if (clazz.isArray() && clazz.getComponentType().equals(clazz1)) {
            entry = (Map.Entry<String, Object>)c(entry, object);
          } else {
            throw new IllegalArgumentException();
          } 
        } 
        hashMap.put(str, entry);
      } 
    } 
    a.d((Map)hashMap);
    return a.a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/ArrayCreatingInputMerger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */