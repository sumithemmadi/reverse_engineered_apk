package com.google.android.gms.internal.ads;

public class zzcmb extends Exception {
  private final zzdom zzgnm;
  
  public zzcmb(zzdom paramzzdom) {
    this.zzgnm = paramzzdom;
  }
  
  public zzcmb(zzdom paramzzdom, String paramString) {
    super(paramString);
    this.zzgnm = paramzzdom;
  }
  
  public zzcmb(zzdom paramzzdom, String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.zzgnm = paramzzdom;
  }
  
  public final zzdom zzarh() {
    return this.zzgnm;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzcmb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */