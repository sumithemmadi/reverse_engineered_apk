package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class sa2 implements Callable {
  private final z92 a;
  
  private final zzcf$zza.a b;
  
  public sa2(z92 paramz92, zzcf$zza.a parama) {
    this.a = paramz92;
    this.b = parama;
  }
  
  private final Void a() {
    if (this.a.A() != null)
      this.a.A().get(); 
    zzcf$zza zzcf$zza = this.a.z();
    if (zzcf$zza != null)
      try {
        synchronized (this.b) {
          zzcf$zza.a a1 = this.b;
          byte[] arrayOfByte = zzcf$zza.g();
          y32 y32 = y32.b();
          a1.n(arrayOfByte, 0, arrayOfByte.length, y32);
        } 
      } catch (zzelo|NullPointerException zzelo) {} 
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sa2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */