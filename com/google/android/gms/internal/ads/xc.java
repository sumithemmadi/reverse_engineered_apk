package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.a;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public final class xc {
  public static int a(AdRequest.ErrorCode paramErrorCode) {
    int i = wc.b[paramErrorCode.ordinal()];
    return (i != 2) ? ((i != 3) ? ((i != 4) ? 0 : 3) : 2) : 1;
  }
  
  public static a b(zzvl paramzzvl, boolean paramBoolean) {
    Set set;
    AdRequest.Gender gender;
    if (paramzzvl.f != null) {
      set = new HashSet<String>(paramzzvl.f);
    } else {
      set = null;
    } 
    Date date = new Date(paramzzvl.c);
    int i = paramzzvl.e;
    if (i != 1) {
      if (i != 2) {
        gender = AdRequest.Gender.b;
      } else {
        gender = AdRequest.Gender.d;
      } 
    } else {
      gender = AdRequest.Gender.c;
    } 
    return new a(date, gender, set, paramBoolean, paramzzvl.l);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */