package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class a3 extends l3 {
  private final Drawable b;
  
  private final Uri c;
  
  private final double d;
  
  private final int e;
  
  private final int f;
  
  public a3(Drawable paramDrawable, Uri paramUri, double paramDouble, int paramInt1, int paramInt2) {
    this.b = paramDrawable;
    this.c = paramUri;
    this.d = paramDouble;
    this.e = paramInt1;
    this.f = paramInt2;
  }
  
  public final a D9() {
    return b.a2(this.b);
  }
  
  public final double N5() {
    return this.d;
  }
  
  public final Uri e0() {
    return this.c;
  }
  
  public final int getHeight() {
    return this.f;
  }
  
  public final int getWidth() {
    return this.e;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */