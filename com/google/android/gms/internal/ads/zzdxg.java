package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public abstract class zzdxg<E> extends zzdwy<E> implements Set<E> {
  private transient zzdxd<E> c;
  
  private static <E> zzdxg<E> a(int paramInt, Object... paramVarArgs) {
    int i = paramInt;
    while (i != 0) {
      if (i != 1) {
        int j = zzer(i);
        Object[] arrayOfObject1 = new Object[j];
        int k = j - 1;
        byte b = 0;
        int m = 0;
        for (paramInt = 0; b < i; paramInt = i3) {
          int i2;
          int i3;
          Object object = tr1.a(paramVarArgs[b], b);
          int n = object.hashCode();
          int i1 = jr1.a(n);
          while (true) {
            i2 = i1 & k;
            Object object1 = arrayOfObject1[i2];
            if (object1 == null) {
              paramVarArgs[paramInt] = object;
              arrayOfObject1[i2] = object;
              i2 = m + n;
              int i4 = paramInt + 1;
              break;
            } 
            i2 = m;
            i3 = paramInt;
            if (!object1.equals(object)) {
              i1++;
              continue;
            } 
            break;
          } 
          b++;
          m = i2;
        } 
        Arrays.fill(paramVarArgs, paramInt, i, (Object)null);
        if (paramInt == 1)
          return new zzdxz<E>((E)paramVarArgs[0], m); 
        if (zzer(paramInt) < j / 2) {
          i = paramInt;
          continue;
        } 
        Object[] arrayOfObject2 = paramVarArgs;
        if (c(paramInt, paramVarArgs.length))
          arrayOfObject2 = Arrays.copyOf(paramVarArgs, paramInt); 
        return new zzdxx<E>(arrayOfObject2, m, arrayOfObject1, k, paramInt);
      } 
      return zzad((E)paramVarArgs[0]);
    } 
    return zzdxx.d;
  }
  
  private static boolean c(int paramInt1, int paramInt2) {
    return (paramInt1 < (paramInt2 >> 1) + (paramInt2 >> 2));
  }
  
  @SafeVarargs
  public static <E> zzdxg<E> zza(E paramE1, E paramE2, E paramE3, E paramE4, E paramE5, E paramE6, E... paramVarArgs) {
    boolean bool;
    if (paramVarArgs.length <= 2147483641) {
      bool = true;
    } else {
      bool = false;
    } 
    xq1.a(bool, "the total number of elements must fit in an int");
    int i = paramVarArgs.length + 6;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramE1;
    arrayOfObject[1] = paramE2;
    arrayOfObject[2] = paramE3;
    arrayOfObject[3] = paramE4;
    arrayOfObject[4] = paramE5;
    arrayOfObject[5] = paramE6;
    System.arraycopy(paramVarArgs, 0, arrayOfObject, 6, paramVarArgs.length);
    return a(i, arrayOfObject);
  }
  
  public static <E> zzdxg<E> zzad(E paramE) {
    return new zzdxz<E>(paramE);
  }
  
  static int zzer(int paramInt) {
    int i = Math.max(paramInt, 2);
    boolean bool = true;
    if (i < 751619276) {
      paramInt = Integer.highestOneBit(i - 1) << 1;
      while (true) {
        double d = paramInt;
        Double.isNaN(d);
        if (d * 0.7D < i) {
          paramInt <<= 1;
          continue;
        } 
        return paramInt;
      } 
    } 
    if (i >= 1073741824)
      bool = false; 
    xq1.a(bool, "collection too large");
    return 1073741824;
  }
  
  public static <E> qr1<E> zzes(int paramInt) {
    ir1.b(paramInt, "expectedSize");
    return new qr1<E>(paramInt);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject instanceof zzdxg && zzazn() && ((zzdxg)paramObject).zzazn() && hashCode() != paramObject.hashCode()) ? false : vr1.a(this, paramObject));
  }
  
  public int hashCode() {
    return vr1.b(this);
  }
  
  public zzdxd<E> zzazk() {
    zzdxd<E> zzdxd1 = this.c;
    zzdxd<E> zzdxd2 = zzdxd1;
    if (zzdxd1 == null) {
      zzdxd2 = zzazo();
      this.c = zzdxd2;
    } 
    return zzdxd2;
  }
  
  boolean zzazn() {
    return false;
  }
  
  zzdxd<E> zzazo() {
    return zzdxd.zzc(toArray());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdxg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */