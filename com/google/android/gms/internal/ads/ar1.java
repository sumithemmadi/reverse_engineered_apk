package com.google.android.gms.internal.ads;

abstract class ar1 extends bq1<String> {
  final CharSequence d;
  
  private final fq1 e;
  
  private final boolean f;
  
  private int g = 0;
  
  private int h;
  
  protected ar1(wq1 paramwq1, CharSequence paramCharSequence) {
    this.e = wq1.a(paramwq1);
    this.f = false;
    this.h = wq1.e(paramwq1);
    this.d = paramCharSequence;
  }
  
  abstract int d(int paramInt);
  
  abstract int e(int paramInt);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ar1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */