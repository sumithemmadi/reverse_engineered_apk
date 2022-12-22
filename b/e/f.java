package b.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class f<K, V> {
  b a;
  
  c b;
  
  e c;
  
  public static <K, V> boolean j(Map<K, V> paramMap, Collection<?> paramCollection) {
    Iterator<?> iterator = paramCollection.iterator();
    while (iterator.hasNext()) {
      if (!paramMap.containsKey(iterator.next()))
        return false; 
    } 
    return true;
  }
  
  public static <T> boolean k(Set<T> paramSet, Object paramObject) {
    boolean bool = true;
    if (paramSet == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      paramObject = paramObject;
      try {
        if (paramSet.size() == paramObject.size()) {
          boolean bool1 = paramSet.containsAll((Collection<?>)paramObject);
          if (bool1)
            return bool; 
        } 
        return false;
      } catch (NullPointerException|ClassCastException nullPointerException) {}
    } 
    return false;
  }
  
  public static <K, V> boolean o(Map<K, V> paramMap, Collection<?> paramCollection) {
    boolean bool;
    int i = paramMap.size();
    Iterator<?> iterator = paramCollection.iterator();
    while (iterator.hasNext())
      paramMap.remove(iterator.next()); 
    if (i != paramMap.size()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static <K, V> boolean p(Map<K, V> paramMap, Collection<?> paramCollection) {
    boolean bool;
    int i = paramMap.size();
    Iterator iterator = paramMap.keySet().iterator();
    while (iterator.hasNext()) {
      if (!paramCollection.contains(iterator.next()))
        iterator.remove(); 
    } 
    if (i != paramMap.size()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected abstract void a();
  
  protected abstract Object b(int paramInt1, int paramInt2);
  
  protected abstract Map<K, V> c();
  
  protected abstract int d();
  
  protected abstract int e(Object paramObject);
  
  protected abstract int f(Object paramObject);
  
  protected abstract void g(K paramK, V paramV);
  
  protected abstract void h(int paramInt);
  
  protected abstract V i(int paramInt, V paramV);
  
  public Set<Map.Entry<K, V>> l() {
    if (this.a == null)
      this.a = new b(this); 
    return this.a;
  }
  
  public Set<K> m() {
    if (this.b == null)
      this.b = new c(this); 
    return this.b;
  }
  
  public Collection<V> n() {
    if (this.c == null)
      this.c = new e(this); 
    return this.c;
  }
  
  public Object[] q(int paramInt) {
    int i = d();
    Object[] arrayOfObject = new Object[i];
    for (byte b1 = 0; b1 < i; b1++)
      arrayOfObject[b1] = b(b1, paramInt); 
    return arrayOfObject;
  }
  
  public <T> T[] r(T[] paramArrayOfT, int paramInt) {
    int i = d();
    T[] arrayOfT = paramArrayOfT;
    if (paramArrayOfT.length < i)
      arrayOfT = (T[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i); 
    for (byte b1 = 0; b1 < i; b1++)
      arrayOfT[b1] = (T)b(b1, paramInt); 
    if (arrayOfT.length > i)
      arrayOfT[i] = null; 
    return arrayOfT;
  }
  
  final class a<T> implements Iterator<T> {
    final int b;
    
    int c;
    
    int d;
    
    boolean e = false;
    
    a(f this$0, int param1Int) {
      this.b = param1Int;
      this.c = this$0.d();
    }
    
    public boolean hasNext() {
      boolean bool;
      if (this.d < this.c) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public T next() {
      if (hasNext()) {
        Object object = this.f.b(this.d, this.b);
        this.d++;
        this.e = true;
        return (T)object;
      } 
      throw new NoSuchElementException();
    }
    
    public void remove() {
      if (this.e) {
        int i = this.d - 1;
        this.d = i;
        this.c--;
        this.e = false;
        this.f.h(i);
        return;
      } 
      throw new IllegalStateException();
    }
  }
  
  final class b implements Set<Map.Entry<K, V>> {
    b(f this$0) {}
    
    public boolean a(Map.Entry<K, V> param1Entry) {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends Map.Entry<K, V>> param1Collection) {
      boolean bool;
      int i = this.b.d();
      for (Map.Entry<K, V> entry : param1Collection)
        this.b.g(entry.getKey(), entry.getValue()); 
      if (i != this.b.d()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void clear() {
      this.b.a();
    }
    
    public boolean contains(Object param1Object) {
      if (!(param1Object instanceof Map.Entry))
        return false; 
      param1Object = param1Object;
      int i = this.b.e(param1Object.getKey());
      return (i < 0) ? false : c.c(this.b.b(i, 1), param1Object.getValue());
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      Iterator<?> iterator = param1Collection.iterator();
      while (iterator.hasNext()) {
        if (!contains(iterator.next()))
          return false; 
      } 
      return true;
    }
    
    public boolean equals(Object param1Object) {
      return f.k(this, param1Object);
    }
    
    public int hashCode() {
      int i = this.b.d() - 1;
      int j = 0;
      while (i >= 0) {
        int k;
        int m;
        Object object1 = this.b.b(i, 0);
        Object object2 = this.b.b(i, 1);
        if (object1 == null) {
          k = 0;
        } else {
          k = object1.hashCode();
        } 
        if (object2 == null) {
          m = 0;
        } else {
          m = object2.hashCode();
        } 
        j += k ^ m;
        i--;
      } 
      return j;
    }
    
    public boolean isEmpty() {
      boolean bool;
      if (this.b.d() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public Iterator<Map.Entry<K, V>> iterator() {
      return new f.d(this.b);
    }
    
    public boolean remove(Object param1Object) {
      throw new UnsupportedOperationException();
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public int size() {
      return this.b.d();
    }
    
    public Object[] toArray() {
      throw new UnsupportedOperationException();
    }
    
    public <T> T[] toArray(T[] param1ArrayOfT) {
      throw new UnsupportedOperationException();
    }
  }
  
  final class c implements Set<K> {
    c(f this$0) {}
    
    public boolean add(K param1K) {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends K> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public void clear() {
      this.b.a();
    }
    
    public boolean contains(Object param1Object) {
      boolean bool;
      if (this.b.e(param1Object) >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      return f.j(this.b.c(), param1Collection);
    }
    
    public boolean equals(Object param1Object) {
      return f.k(this, param1Object);
    }
    
    public int hashCode() {
      int i = this.b.d() - 1;
      int j = 0;
      while (i >= 0) {
        int k;
        Object object = this.b.b(i, 0);
        if (object == null) {
          k = 0;
        } else {
          k = object.hashCode();
        } 
        j += k;
        i--;
      } 
      return j;
    }
    
    public boolean isEmpty() {
      boolean bool;
      if (this.b.d() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public Iterator<K> iterator() {
      return new f.a<K>(this.b, 0);
    }
    
    public boolean remove(Object param1Object) {
      int i = this.b.e(param1Object);
      if (i >= 0) {
        this.b.h(i);
        return true;
      } 
      return false;
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      return f.o(this.b.c(), param1Collection);
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      return f.p(this.b.c(), param1Collection);
    }
    
    public int size() {
      return this.b.d();
    }
    
    public Object[] toArray() {
      return this.b.q(0);
    }
    
    public <T> T[] toArray(T[] param1ArrayOfT) {
      return (T[])this.b.r((Object[])param1ArrayOfT, 0);
    }
  }
  
  final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
    int b;
    
    int c;
    
    boolean d = false;
    
    d(f this$0) {
      this.b = this$0.d() - 1;
      this.c = -1;
    }
    
    public Map.Entry<K, V> a() {
      if (hasNext()) {
        this.c++;
        this.d = true;
        return this;
      } 
      throw new NoSuchElementException();
    }
    
    public boolean equals(Object param1Object) {
      if (this.d) {
        boolean bool = param1Object instanceof Map.Entry;
        boolean bool1 = false;
        if (!bool)
          return false; 
        param1Object = param1Object;
        bool = bool1;
        if (c.c(param1Object.getKey(), this.e.b(this.c, 0))) {
          bool = bool1;
          if (c.c(param1Object.getValue(), this.e.b(this.c, 1)))
            bool = true; 
        } 
        return bool;
      } 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public K getKey() {
      if (this.d)
        return (K)this.e.b(this.c, 0); 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public V getValue() {
      if (this.d)
        return (V)this.e.b(this.c, 1); 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public boolean hasNext() {
      boolean bool;
      if (this.c < this.b) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public int hashCode() {
      if (this.d) {
        f f1 = this.e;
        int i = this.c;
        int j = 0;
        Object object2 = f1.b(i, 0);
        Object object1 = this.e.b(this.c, 1);
        if (object2 == null) {
          i = 0;
        } else {
          i = object2.hashCode();
        } 
        if (object1 != null)
          j = object1.hashCode(); 
        return i ^ j;
      } 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public void remove() {
      if (this.d) {
        this.e.h(this.c);
        this.c--;
        this.b--;
        this.d = false;
        return;
      } 
      throw new IllegalStateException();
    }
    
    public V setValue(V param1V) {
      if (this.d)
        return (V)this.e.i(this.c, param1V); 
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(getKey());
      stringBuilder.append("=");
      stringBuilder.append(getValue());
      return stringBuilder.toString();
    }
  }
  
  final class e implements Collection<V> {
    e(f this$0) {}
    
    public boolean add(V param1V) {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends V> param1Collection) {
      throw new UnsupportedOperationException();
    }
    
    public void clear() {
      this.b.a();
    }
    
    public boolean contains(Object param1Object) {
      boolean bool;
      if (this.b.f(param1Object) >= 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean containsAll(Collection<?> param1Collection) {
      Iterator<?> iterator = param1Collection.iterator();
      while (iterator.hasNext()) {
        if (!contains(iterator.next()))
          return false; 
      } 
      return true;
    }
    
    public boolean isEmpty() {
      boolean bool;
      if (this.b.d() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public Iterator<V> iterator() {
      return new f.a<V>(this.b, 1);
    }
    
    public boolean remove(Object param1Object) {
      int i = this.b.f(param1Object);
      if (i >= 0) {
        this.b.h(i);
        return true;
      } 
      return false;
    }
    
    public boolean removeAll(Collection<?> param1Collection) {
      int i = this.b.d();
      int j = 0;
      boolean bool = false;
      while (j < i) {
        int k = i;
        int m = j;
        if (param1Collection.contains(this.b.b(j, 1))) {
          this.b.h(j);
          m = j - 1;
          k = i - 1;
          bool = true;
        } 
        j = m + 1;
        i = k;
      } 
      return bool;
    }
    
    public boolean retainAll(Collection<?> param1Collection) {
      int i = this.b.d();
      int j = 0;
      boolean bool = false;
      while (j < i) {
        int k = i;
        int m = j;
        if (!param1Collection.contains(this.b.b(j, 1))) {
          this.b.h(j);
          m = j - 1;
          k = i - 1;
          bool = true;
        } 
        j = m + 1;
        i = k;
      } 
      return bool;
    }
    
    public int size() {
      return this.b.d();
    }
    
    public Object[] toArray() {
      return this.b.q(1);
    }
    
    public <T> T[] toArray(T[] param1ArrayOfT) {
      return (T[])this.b.r((Object[])param1ArrayOfT, 1);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */