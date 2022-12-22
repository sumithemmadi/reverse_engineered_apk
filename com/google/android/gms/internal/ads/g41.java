package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class g41 {
  private String a;
  
  private g41(a parama) {
    this.a = a.a(parama);
  }
  
  public final Set<String> a() {
    HashSet<String> hashSet = new HashSet();
    hashSet.add(this.a.toLowerCase(Locale.ROOT));
    return hashSet;
  }
  
  public final String b() {
    return this.a.toLowerCase(Locale.ROOT);
  }
  
  public final zzug$zza.zza c() {
    String str = this.a;
    str.hashCode();
    int i = str.hashCode();
    byte b = -1;
    switch (i) {
      case 1951953708:
        if (!str.equals("BANNER"))
          break; 
        b = 3;
        break;
      case 543046670:
        if (!str.equals("REWARDED"))
          break; 
        b = 2;
        break;
      case -1372958932:
        if (!str.equals("INTERSTITIAL"))
          break; 
        b = 1;
        break;
      case -1999289321:
        if (!str.equals("NATIVE"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        return zzug$zza.zza.b;
      case 3:
        return zzug$zza.zza.c;
      case 2:
        return zzug$zza.zza.i;
      case 1:
        return zzug$zza.zza.e;
      case 0:
        break;
    } 
    return zzug$zza.zza.h;
  }
  
  public static final class a {
    private String a;
    
    public final a b(String param1String) {
      this.a = param1String;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */