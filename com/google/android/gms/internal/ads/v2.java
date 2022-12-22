package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

public final class v2 extends e3 {
  private static final int b;
  
  private static final int c;
  
  private static final int d;
  
  private static final int e;
  
  private final String f;
  
  private final List<a3> g;
  
  private final List<m3> h;
  
  private final int i;
  
  private final int j;
  
  private final int k;
  
  private final int l;
  
  private final int m;
  
  private final boolean n;
  
  static {
    int i = Color.rgb(12, 174, 206);
    b = i;
    int j = Color.rgb(204, 204, 204);
    c = j;
    d = j;
    e = i;
  }
  
  public v2(String paramString, List<a3> paramList, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, int paramInt1, int paramInt2, boolean paramBoolean) {
    int i;
    this.g = new ArrayList<a3>();
    this.h = new ArrayList<m3>();
    this.f = paramString;
    if (paramList != null)
      for (i = 0; i < paramList.size(); i++) {
        a3 a3 = paramList.get(i);
        this.g.add(a3);
        this.h.add(a3);
      }  
    if (paramInteger1 != null) {
      i = paramInteger1.intValue();
    } else {
      i = d;
    } 
    this.i = i;
    if (paramInteger2 != null) {
      i = paramInteger2.intValue();
    } else {
      i = e;
    } 
    this.j = i;
    if (paramInteger3 != null) {
      i = paramInteger3.intValue();
    } else {
      i = 12;
    } 
    this.k = i;
    this.l = paramInt1;
    this.m = paramInt2;
    this.n = paramBoolean;
  }
  
  public final String R1() {
    return this.f;
  }
  
  public final int T9() {
    return this.i;
  }
  
  public final int U9() {
    return this.j;
  }
  
  public final int V9() {
    return this.k;
  }
  
  public final List<a3> W9() {
    return this.g;
  }
  
  public final int X9() {
    return this.l;
  }
  
  public final int Y9() {
    return this.m;
  }
  
  public final List<m3> v4() {
    return this.h;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/v2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */