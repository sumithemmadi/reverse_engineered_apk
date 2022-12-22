package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.e;
import java.util.Date;
import java.util.Set;

public final class kc implements e {
  private final Date a;
  
  private final int b;
  
  private final Set<String> c;
  
  private final boolean d;
  
  private final Location e;
  
  private final int f;
  
  private final boolean g;
  
  private final int h;
  
  private final String i;
  
  public kc(Date paramDate, int paramInt1, Set<String> paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, int paramInt3, String paramString) {
    this.a = paramDate;
    this.b = paramInt1;
    this.c = paramSet;
    this.e = paramLocation;
    this.d = paramBoolean1;
    this.f = paramInt2;
    this.g = paramBoolean2;
    this.h = paramInt3;
    this.i = paramString;
  }
  
  public final int c() {
    return this.f;
  }
  
  @Deprecated
  public final boolean f() {
    return this.g;
  }
  
  @Deprecated
  public final Date h() {
    return this.a;
  }
  
  public final boolean i() {
    return this.d;
  }
  
  public final Set<String> j() {
    return this.c;
  }
  
  public final Location l() {
    return this.e;
  }
  
  @Deprecated
  public final int n() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */