package com.google.android.gms.internal.common;

public final class k {
  public static <T> l<T> a(l<T> paraml) {
    return (l<T>)((paraml instanceof m || paraml instanceof zzq) ? paraml : ((paraml instanceof java.io.Serializable) ? new zzq<T>(paraml) : new m<T>(paraml)));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/common/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */