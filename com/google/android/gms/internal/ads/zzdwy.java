package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class zzdwy<E> extends AbstractCollection<E> implements Serializable {
  private static final Object[] b = new Object[0];
  
  @Deprecated
  public final boolean add(E paramE) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection<? extends E> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void clear() {
    throw new UnsupportedOperationException();
  }
  
  public abstract boolean contains(Object paramObject);
  
  @Deprecated
  public final boolean remove(Object paramObject) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean removeAll(Collection<?> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection<?> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray() {
    return toArray(b);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT) {
    T[] arrayOfT;
    xq1.b(paramArrayOfT);
    int i = size();
    if (paramArrayOfT.length < i) {
      Object[] arrayOfObject = zzazh();
      if (arrayOfObject != null)
        return Arrays.copyOfRange(arrayOfObject, zzazi(), zzazj(), (Class)paramArrayOfT.getClass()); 
      arrayOfObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i);
    } else {
      arrayOfT = paramArrayOfT;
      if (paramArrayOfT.length > i) {
        paramArrayOfT[i] = null;
        arrayOfT = paramArrayOfT;
      } 
    } 
    zza((Object[])arrayOfT, 0);
    return arrayOfT;
  }
  
  int zza(Object[] paramArrayOfObject, int paramInt) {
    yr1 yr1 = (yr1)iterator();
    while (yr1.hasNext()) {
      paramArrayOfObject[paramInt] = yr1.next();
      paramInt++;
    } 
    return paramInt;
  }
  
  public abstract yr1<E> zzazg();
  
  Object[] zzazh() {
    return null;
  }
  
  int zzazi() {
    throw new UnsupportedOperationException();
  }
  
  int zzazj() {
    throw new UnsupportedOperationException();
  }
  
  public zzdxd<E> zzazk() {
    return isEmpty() ? zzdxd.zzazm() : zzdxd.zzc(toArray());
  }
  
  abstract boolean zzazl();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdwy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */