package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.x.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class tt2 {
  private final HashSet<String> a = new HashSet<String>();
  
  private final Bundle b = new Bundle();
  
  private final HashMap<Class<?>, ?> c = new HashMap<Class<?>, Object>();
  
  private final HashSet<String> d = new HashSet<String>();
  
  private final Bundle e = new Bundle();
  
  private final HashSet<String> f = new HashSet<String>();
  
  private Date g;
  
  private String h;
  
  private final List<String> i = new ArrayList<String>();
  
  private int j = -1;
  
  private Location k;
  
  private boolean l = false;
  
  private String m;
  
  private String n;
  
  private int o = -1;
  
  private boolean p;
  
  private a q;
  
  private int r = -1;
  
  private String s;
  
  private int t = 60000;
  
  @Deprecated
  public final void C(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public final void b(Location paramLocation) {
    this.k = paramLocation;
  }
  
  public final void c(Class<?> paramClass, Bundle paramBundle) {
    this.b.putBundle(paramClass.getName(), paramBundle);
  }
  
  @Deprecated
  public final void d(Date paramDate) {
    this.g = paramDate;
  }
  
  @Deprecated
  public final void e(boolean paramBoolean) {
    this.p = paramBoolean;
  }
  
  public final void h(String paramString) {
    this.a.add(paramString);
  }
  
  public final void i(String paramString) {
    this.d.add(paramString);
  }
  
  public final void j(String paramString) {
    this.d.remove(paramString);
  }
  
  @Deprecated
  public final void k(int paramInt) {
    this.j = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tt2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */