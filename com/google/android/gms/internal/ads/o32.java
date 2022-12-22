package com.google.android.gms.internal.ads;

public abstract class o32 {
  int a;
  
  int b = 100;
  
  int c = Integer.MAX_VALUE;
  
  u32 d;
  
  private boolean e = false;
  
  private o32() {}
  
  public static int B(int paramInt) {
    return -(paramInt & 0x1) ^ paramInt >>> 1;
  }
  
  static o32 d(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    q32 q32 = new q32(paramArrayOfbyte, paramInt1, paramInt2, paramBoolean, null);
    try {
      q32.z(paramInt2);
      return q32;
    } catch (zzelo zzelo) {
      throw new IllegalArgumentException(zzelo);
    } 
  }
  
  public static long w(long paramLong) {
    return -(paramLong & 0x1L) ^ paramLong >>> 1L;
  }
  
  public abstract void A(int paramInt);
  
  public abstract double a();
  
  public abstract float b();
  
  public abstract String c();
  
  public abstract int e();
  
  public abstract long f();
  
  public abstract long g();
  
  public abstract int h();
  
  public abstract long i();
  
  public abstract int j();
  
  public abstract boolean k();
  
  public abstract String l();
  
  public abstract zzejr m();
  
  public abstract int n();
  
  public abstract int o();
  
  public abstract int p();
  
  public abstract long q();
  
  public abstract int r();
  
  public abstract long s();
  
  abstract long t();
  
  public abstract boolean u();
  
  public abstract int v();
  
  public abstract void x(int paramInt);
  
  public abstract boolean y(int paramInt);
  
  public abstract int z(int paramInt);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */