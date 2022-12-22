package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.nativead.b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class sc implements t {
  private final Date a;
  
  private final int b;
  
  private final Set<String> c;
  
  private final boolean d;
  
  private final Location e;
  
  private final int f;
  
  private final zzaeh g;
  
  private final List<String> h;
  
  private final boolean i;
  
  private final Map<String, Boolean> j;
  
  private final int k;
  
  private final String l;
  
  public sc(Date paramDate, int paramInt1, Set<String> paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, zzaeh paramzzaeh, List<String> paramList, boolean paramBoolean2, int paramInt3, String paramString) {
    this.a = paramDate;
    this.b = paramInt1;
    this.c = paramSet;
    this.e = paramLocation;
    this.d = paramBoolean1;
    this.f = paramInt2;
    this.g = paramzzaeh;
    this.i = paramBoolean2;
    this.k = paramInt3;
    this.l = paramString;
    this.h = new ArrayList<String>();
    this.j = new HashMap<String, Boolean>();
    if (paramList != null)
      for (String str : paramList) {
        String[] arrayOfString;
        if (str.startsWith("custom:")) {
          arrayOfString = str.split(":", 3);
          if (arrayOfString.length == 3) {
            if ("true".equals(arrayOfString[2])) {
              this.j.put(arrayOfString[1], Boolean.TRUE);
              continue;
            } 
            if ("false".equals(arrayOfString[2]))
              this.j.put(arrayOfString[1], Boolean.FALSE); 
          } 
          continue;
        } 
        this.h.add((String)arrayOfString);
      }  
  }
  
  public final Map<String, Boolean> a() {
    return this.j;
  }
  
  public final b b() {
    return zzaeh.o0(this.g);
  }
  
  public final int c() {
    return this.f;
  }
  
  public final boolean d() {
    List<String> list = this.h;
    return (list != null && list.contains("6"));
  }
  
  public final boolean e() {
    List<String> list = this.h;
    return (list != null && list.contains("3"));
  }
  
  @Deprecated
  public final boolean f() {
    return this.i;
  }
  
  public final boolean g() {
    List<String> list = this.h;
    return (list != null && (list.contains("2") || this.h.contains("6")));
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
  
  public final b k() {
    return zzaeh.p0(this.g);
  }
  
  public final Location l() {
    return this.e;
  }
  
  public final boolean m() {
    List<String> list = this.h;
    return (list != null && (list.contains("1") || this.h.contains("6")));
  }
  
  @Deprecated
  public final int n() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */