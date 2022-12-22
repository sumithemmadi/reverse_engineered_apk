package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class zzdxd<E> extends zzdwy<E> implements List<E>, RandomAccess {
  private static final bs1<Object> c = new or1(zzdxr.d, 0);
  
  public static <E> zzdxd<E> zzac(E paramE) {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramE;
    for (byte b = 0; b; b++)
      tr1.a(arrayOfObject[0], 0); 
    return zzb(arrayOfObject, 1);
  }
  
  public static <E> zzdxd<E> zzazm() {
    return (zzdxd)zzdxr.d;
  }
  
  public static <E> zzdxd<E> zzb(Collection<? extends E> paramCollection) {
    zzdxd<?> zzdxd1;
    if (paramCollection instanceof zzdwy) {
      zzdxd<? extends E> zzdxd2 = ((zzdwy)paramCollection).zzazk();
      paramCollection = zzdxd2;
      if (zzdxd2.zzazl()) {
        Object[] arrayOfObject1 = zzdxd2.toArray();
        zzdxd1 = zzb(arrayOfObject1, arrayOfObject1.length);
      } 
      return (zzdxd)zzdxd1;
    } 
    Object[] arrayOfObject = zzdxd1.toArray();
    int i = arrayOfObject.length;
    for (byte b = 0; b < i; b++)
      tr1.a(arrayOfObject[b], b); 
    return zzb(arrayOfObject, arrayOfObject.length);
  }
  
  public static <E> zzdxd<E> zzb(E[] paramArrayOfE) {
    if (paramArrayOfE.length == 0)
      return (zzdxd)zzdxr.d; 
    paramArrayOfE = (E[])paramArrayOfE.clone();
    int i = paramArrayOfE.length;
    for (byte b = 0; b < i; b++)
      tr1.a(paramArrayOfE[b], b); 
    return zzb((Object[])paramArrayOfE, paramArrayOfE.length);
  }
  
  static <E> zzdxd<E> zzb(Object[] paramArrayOfObject, int paramInt) {
    return (zzdxd<E>)((paramInt == 0) ? zzdxr.d : new zzdxr<E>(paramArrayOfObject, paramInt));
  }
  
  static <E> zzdxd<E> zzc(Object[] paramArrayOfObject) {
    return zzb(paramArrayOfObject, paramArrayOfObject.length);
  }
  
  public static <E> zzdxd<E> zzh(Iterable<? extends E> paramIterable) {
    xq1.b(paramIterable);
    if (paramIterable instanceof Collection)
      return zzb((Collection<? extends E>)paramIterable); 
    Iterator<? extends E> iterator = paramIterable.iterator();
    if (!iterator.hasNext())
      return (zzdxd)zzdxr.d; 
    paramIterable = (Iterable<? extends E>)iterator.next();
    if (!iterator.hasNext())
      return zzac((E)paramIterable); 
    nr1 nr1 = (nr1)((nr1<E>)(new nr1<Iterable<? extends E>>()).b(paramIterable)).a(iterator);
    nr1.c = true;
    return zzb(nr1.a, nr1.b);
  }
  
  @Deprecated
  public final void add(int paramInt, E paramE) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
    throw new UnsupportedOperationException();
  }
  
  public boolean contains(Object paramObject) {
    return (indexOf(paramObject) >= 0);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == xq1.b(this))
      return true; 
    if (paramObject instanceof List) {
      paramObject = paramObject;
      int i = size();
      if (i == paramObject.size())
        if (paramObject instanceof RandomAccess) {
          byte b = 0;
          while (true) {
            if (b < i) {
              if (rq1.a(get(b), paramObject.get(b))) {
                b++;
                continue;
              } 
              break;
            } 
            return true;
          } 
        } else {
          i = size();
          Iterator iterator = paramObject.iterator();
          byte b = 0;
          while (b < i) {
            if (iterator.hasNext()) {
              paramObject = get(b);
              b++;
              if (rq1.a(paramObject, iterator.next()))
                continue; 
              // Byte code: goto -> 151
            } 
            // Byte code: goto -> 151
          } 
          if (!iterator.hasNext())
            return true; 
        }  
    } 
    return false;
  }
  
  public int hashCode() {
    int i = size();
    int j = 1;
    for (byte b = 0; b < i; b++)
      j = j * 31 + get(b).hashCode() ^ 0xFFFFFFFF ^ 0xFFFFFFFF; 
    return j;
  }
  
  public int indexOf(Object paramObject) {
    if (paramObject == null)
      return -1; 
    int i = size();
    for (byte b = 0; b < i; b++) {
      if (paramObject.equals(get(b)))
        return b; 
    } 
    return -1;
  }
  
  public int lastIndexOf(Object paramObject) {
    if (paramObject == null)
      return -1; 
    for (int i = size() - 1; i >= 0; i--) {
      if (paramObject.equals(get(i)))
        return i; 
    } 
    return -1;
  }
  
  @Deprecated
  public final E remove(int paramInt) {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final E set(int paramInt, E paramE) {
    throw new UnsupportedOperationException();
  }
  
  int zza(Object[] paramArrayOfObject, int paramInt) {
    int i = size();
    for (byte b = 0; b < i; b++)
      paramArrayOfObject[paramInt + b] = get(b); 
    return paramInt + i;
  }
  
  public final yr1<E> zzazg() {
    return (bs1)listIterator();
  }
  
  public final zzdxd<E> zzazk() {
    return this;
  }
  
  public zzdxd<E> zzv(int paramInt1, int paramInt2) {
    xq1.g(paramInt1, paramInt2, size());
    paramInt2 -= paramInt1;
    return (paramInt2 == size()) ? this : ((paramInt2 == 0) ? zzdxr.d : new zzdxe(this, paramInt1, paramInt2));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */