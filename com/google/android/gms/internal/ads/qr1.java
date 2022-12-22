package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;

public final class qr1<E> extends mr1<E> {
  private Object[] d;
  
  private int e;
  
  public qr1() {
    super(4);
  }
  
  qr1(int paramInt) {
    super(paramInt);
    this.d = new Object[zzdxg.zzer(paramInt)];
  }
  
  public final zzdxg<E> f() {
    int i = this.b;
    if (i != 0) {
      if (i != 1) {
        zzdxg<E> zzdxg;
        if (this.d != null && zzdxg.zzer(i) == this.d.length) {
          Object[] arrayOfObject1;
          if (zzdxg.zzx(this.b, this.a.length)) {
            arrayOfObject1 = Arrays.copyOf(this.a, this.b);
          } else {
            arrayOfObject1 = this.a;
          } 
          i = this.e;
          Object[] arrayOfObject2 = this.d;
          zzdxg = new zzdxx(arrayOfObject1, i, arrayOfObject2, arrayOfObject2.length - 1, this.b);
        } else {
          zzdxg = zzdxg.zzb(this.b, this.a);
          this.b = zzdxg.size();
        } 
        this.c = true;
        this.d = null;
        return zzdxg;
      } 
      return zzdxg.zzad((E)this.a[0]);
    } 
    return zzdxx.d;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */