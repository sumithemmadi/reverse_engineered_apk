package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.zzvs;

public final class f {
  public static final f a = new f(320, 50, "320x50_mb");
  
  public static final f b = new f(468, 60, "468x60_as");
  
  public static final f c = new f(320, 100, "320x100_as");
  
  public static final f d = new f(728, 90, "728x90_as");
  
  public static final f e = new f(300, 250, "300x250_as");
  
  public static final f f = new f(160, 600, "160x600_as");
  
  public static final f g = new f(-1, -2, "smart_banner");
  
  public static final f h = new f(-3, -4, "fluid");
  
  public static final f i = new f(0, 0, "invalid");
  
  public static final f j = new f(50, 50, "50x50_mb");
  
  public static final f k = new f(-3, 0, "search_v2");
  
  private final int l;
  
  private final int m;
  
  private final String n;
  
  private boolean o;
  
  private boolean p;
  
  private int q;
  
  public f(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, stringBuilder.toString());
  }
  
  f(int paramInt1, int paramInt2, String paramString) {
    if (paramInt1 >= 0 || paramInt1 == -1 || paramInt1 == -3) {
      if (paramInt2 >= 0 || paramInt2 == -2 || paramInt2 == -4) {
        this.l = paramInt1;
        this.m = paramInt2;
        this.n = paramString;
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder(38);
      stringBuilder1.append("Invalid height for AdSize: ");
      stringBuilder1.append(paramInt2);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder(37);
    stringBuilder.append("Invalid width for AdSize: ");
    stringBuilder.append(paramInt1);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final int a() {
    return this.m;
  }
  
  public final int b(Context paramContext) {
    int i = this.m;
    if (i != -4 && i != -3) {
      if (i != -2) {
        er2.a();
        return sl.r(paramContext, this.m);
      } 
      return zzvs.p0(paramContext.getResources().getDisplayMetrics());
    } 
    return -1;
  }
  
  public final int c() {
    return this.l;
  }
  
  public final int d(Context paramContext) {
    int i = this.l;
    if (i != -4 && i != -3) {
      if (i != -1) {
        er2.a();
        return sl.r(paramContext, this.l);
      } 
      return zzvs.o0(paramContext.getResources().getDisplayMetrics());
    } 
    return -1;
  }
  
  public final boolean e() {
    return (this.l == -3 && this.m == -4);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof f))
      return false; 
    paramObject = paramObject;
    return (this.l == ((f)paramObject).l && this.m == ((f)paramObject).m && this.n.equals(((f)paramObject).n));
  }
  
  final void f(boolean paramBoolean) {
    this.p = true;
  }
  
  final boolean g() {
    return this.o;
  }
  
  final boolean h() {
    return this.p;
  }
  
  public final int hashCode() {
    return this.n.hashCode();
  }
  
  final int i() {
    return this.q;
  }
  
  final void j(int paramInt) {
    this.q = paramInt;
  }
  
  public final String toString() {
    return this.n;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */