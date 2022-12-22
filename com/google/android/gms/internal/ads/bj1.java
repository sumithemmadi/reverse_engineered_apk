package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.internal.util.zzap;

public final class bj1 {
  public static zzvg a(zzdom paramzzdom, zzvg paramzzvg) {
    if (paramzzdom.equals(zzdom.i)) {
      x<Integer> x = m0.P5;
      if (((Integer)er2.e().<Integer>c(x)).intValue() > 0)
        return paramzzvg; 
    } 
    return b(paramzzdom, null, paramzzvg);
  }
  
  public static zzvg b(zzdom paramzzdom, String paramString, zzvg paramzzvg) {
    StringBuilder stringBuilder;
    x<Integer> x;
    String str = paramString;
    if (paramString == null) {
      x<Integer> x1;
      switch (aj1.a[paramzzdom.ordinal()]) {
        default:
          str = "Internal error.";
          break;
        case 12:
          x1 = m0.T5;
          if (((Integer)er2.e().<Integer>c(x1)).intValue() <= 0) {
            str = "The mediation adapter did not return an ad.";
            break;
          } 
        case 10:
          str = "The ad can not be shown when app is not in foreground.";
          break;
        case 9:
          str = "The ad has already been shown.";
          break;
        case 8:
          str = "The ad is not ready.";
          break;
        case 7:
          str = "A mediation adapter failed to show the ad.";
          break;
        case 6:
          str = "App ID missing.";
          break;
        case 5:
          str = "No fill.";
          break;
        case 4:
          str = "Network error.";
          break;
        case 3:
          str = "Invalid request: Invalid ad size.";
          break;
        case 2:
          str = "Invalid request: Invalid ad unit ID.";
          break;
        case 1:
          str = "Invalid request.";
          break;
      } 
    } 
    int i = aj1.a[paramzzdom.ordinal()];
    byte b = 0;
    switch (i) {
      default:
        paramString = String.valueOf(paramzzdom);
        stringBuilder = new StringBuilder(paramString.length() + 18);
        stringBuilder.append("Unknown SdkError: ");
        stringBuilder.append(paramString);
        throw new AssertionError(stringBuilder.toString());
      case 12:
        x = m0.T5;
        if (((Integer)er2.e().<Integer>c(x)).intValue() <= 0) {
          b = 9;
          break;
        } 
      case 7:
        b = 4;
        break;
      case 6:
        b = 8;
        break;
      case 5:
      case 10:
        b = 3;
        break;
      case 4:
      case 8:
        b = 2;
        break;
      case 1:
      case 2:
      case 3:
      case 9:
        b = 1;
        break;
      case 11:
      case 13:
        break;
    } 
    return new zzvg(b, str, "com.google.android.gms.ads", paramzzvg, null);
  }
  
  public static zzvg c(Throwable paramThrowable, nv0 paramnv0) {
    zzvg zzvg = d(paramThrowable);
    int i = zzvg.b;
    if (i == 3 || i == 0) {
      zzvg zzvg1 = zzvg.e;
      if (zzvg1 != null && !zzvg1.d.equals("com.google.android.gms.ads"))
        zzvg.e = null; 
    } 
    x<Boolean> x = m0.S5;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue() && paramnv0 != null)
      zzvg.f = (IBinder)paramnv0.c(); 
    return zzvg;
  }
  
  public static zzvg d(Throwable paramThrowable) {
    if (paramThrowable instanceof zzcrn) {
      paramThrowable = paramThrowable;
      return a(paramThrowable.zzarh(), paramThrowable.zzary());
    } 
    if (paramThrowable instanceof zzcmb)
      return (paramThrowable.getMessage() == null) ? b(((zzcmb)paramThrowable).zzarh(), null, null) : b(((zzcmb)paramThrowable).zzarh(), paramThrowable.getMessage(), null); 
    if (paramThrowable instanceof zzap) {
      zzap zzap = (zzap)paramThrowable;
      return new zzvg(zzap.getErrorCode(), er1.d(zzap.getMessage()), "com.google.android.gms.ads", null, null);
    } 
    return b(zzdom.b, null, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */