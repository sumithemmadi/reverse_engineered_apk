package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class re2 {
  private static final ug2 a = (ug2)new qe2();
  
  private static final Pattern b = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
  
  public int c = -1;
  
  public int d = -1;
  
  private final boolean b(String paramString1, String paramString2) {
    if (!"iTunSMPB".equals(paramString1))
      return false; 
    Matcher matcher = b.matcher(paramString2);
    if (matcher.find())
      try {
        int i = Integer.parseInt(matcher.group(1), 16);
        int j = Integer.parseInt(matcher.group(2), 16);
        if (i > 0 || j > 0) {
          this.c = i;
          this.d = j;
          return true;
        } 
      } catch (NumberFormatException numberFormatException) {} 
    return false;
  }
  
  public final boolean a(zzmh paramzzmh) {
    for (byte b = 0; b < paramzzmh.a(); b++) {
      zzmh.zza zza = paramzzmh.b(b);
      if (zza instanceof zzmj) {
        zza = zza;
        if (b(((zzmj)zza).d, ((zzmj)zza).e))
          return true; 
      } 
    } 
    return false;
  }
  
  public final boolean c() {
    return (this.c != -1 && this.d != -1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/re2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */