package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.r;
import com.google.android.gms.ads.search.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class lq2 {
  public static final lq2 a = new lq2();
  
  public static zzvl a(Context paramContext, ut2 paramut2) {
    long l;
    Date date = paramut2.a();
    if (date != null) {
      l = date.getTime();
    } else {
      l = -1L;
    } 
    String str = paramut2.b();
    int i = paramut2.d();
    Set<String> set = paramut2.e();
    if (!set.isEmpty()) {
      List<?> list = Collections.unmodifiableList(new ArrayList(set));
    } else {
      set = null;
    } 
    boolean bool = paramut2.l(paramContext);
    Location location = paramut2.f();
    Bundle bundle = paramut2.i(AdMobAdapter.class);
    if (paramut2.t() == null) {
      boolean bool1 = paramut2.g();
      String str1 = paramut2.j();
      a a = paramut2.o();
      if (a != null) {
        zzaaq zzaaq = new zzaaq(a);
      } else {
        a = null;
      } 
      paramContext = paramContext.getApplicationContext();
      if (paramContext != null) {
        String str3 = paramContext.getPackageName();
        er2.a();
        str3 = sl.b(Thread.currentThread().getStackTrace(), str3);
      } else {
        paramContext = null;
      } 
      boolean bool2 = paramut2.k();
      r r = xt2.n().b();
      int j = Math.max(paramut2.r(), r.b());
      int k = Math.max(paramut2.u(), r.c());
      String str2 = Collections.<String>max(Arrays.asList(new String[] { paramut2.h(), r.a() }, ), kq2.b);
      List<String> list = paramut2.m();
      return new zzvl(8, l, bundle, i, (List<String>)set, bool, j, bool1, str1, (zzaaq)a, location, str, paramut2.q(), paramut2.c(), Collections.unmodifiableList(new ArrayList<String>(paramut2.s())), paramut2.n(), (String)paramContext, bool2, null, k, str2, list, paramut2.v());
    } 
    er2.i();
    paramut2.t();
    throw null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lq2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */