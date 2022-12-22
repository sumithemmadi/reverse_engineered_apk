package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.zzacr;

public final class e {
  private static boolean a(Context paramContext, Intent paramIntent, u paramu, s params, boolean paramBoolean) {
    if (paramBoolean)
      return b(paramContext, paramIntent.getData(), paramu, params); 
    try {
      String str = String.valueOf(paramIntent.toURI());
      if (str.length() != 0) {
        str = "Launching an intent: ".concat(str);
      } else {
        str = new String("Launching an intent: ");
      } 
      b1.m(str);
      q.c();
      h1.k(paramContext, paramIntent);
      if (paramu != null)
        paramu.i(); 
      if (params != null)
        params.b(true); 
      return true;
    } catch (ActivityNotFoundException activityNotFoundException) {
      cm.i(activityNotFoundException.getMessage());
      if (params != null)
        params.b(false); 
      return false;
    } 
  }
  
  private static boolean b(Context paramContext, Uri paramUri, u paramu, s params) {
    zzacr zzacr1 = zzacr.i;
    zzacr zzacr2 = zzacr1;
    try {
      zzacr zzacr = q.c().d(paramContext, paramUri);
      if (paramu != null) {
        zzacr2 = zzacr;
        zzacr1 = zzacr;
        paramu.i();
      } 
      if (params != null)
        params.a(zzacr); 
      return zzacr.equals(zzacr.f);
    } catch (ActivityNotFoundException activityNotFoundException) {
      zzacr2 = zzacr1;
      cm.i(activityNotFoundException.getMessage());
      zzacr2 = zzacr1;
      zzacr zzacr = zzacr.g;
      if (params != null)
        params.a(zzacr); 
      return zzacr.equals(zzacr.f);
    } finally {}
    if (params != null)
      params.a(zzacr2); 
    return zzacr2.equals(zzacr.f);
  }
  
  public static boolean c(Context paramContext, zzd paramzzd, u paramu, s params) {
    String str1;
    boolean bool = false;
    if (paramzzd == null) {
      cm.i("No intent data for launcher overlay.");
      return false;
    } 
    m0.a(paramContext);
    Intent intent = paramzzd.i;
    if (intent != null)
      return a(paramContext, intent, paramu, params, paramzzd.k); 
    intent = new Intent();
    if (TextUtils.isEmpty(paramzzd.c)) {
      cm.i("Open GMSG did not contain a URL.");
      return false;
    } 
    if (!TextUtils.isEmpty(paramzzd.d)) {
      intent.setDataAndType(Uri.parse(paramzzd.c), paramzzd.d);
    } else {
      intent.setData(Uri.parse(paramzzd.c));
    } 
    intent.setAction("android.intent.action.VIEW");
    if (!TextUtils.isEmpty(paramzzd.e))
      intent.setPackage(paramzzd.e); 
    if (!TextUtils.isEmpty(paramzzd.f)) {
      String[] arrayOfString = paramzzd.f.split("/", 2);
      if (arrayOfString.length < 2) {
        str1 = String.valueOf(paramzzd.f);
        if (str1.length() != 0) {
          str1 = "Could not parse component name from open GMSG: ".concat(str1);
        } else {
          str1 = new String("Could not parse component name from open GMSG: ");
        } 
        cm.i(str1);
        return false;
      } 
      intent.setClassName(arrayOfString[0], arrayOfString[1]);
    } 
    String str2 = paramzzd.g;
    if (!TextUtils.isEmpty(str2)) {
      boolean bool1;
      try {
        bool1 = Integer.parseInt(str2);
      } catch (NumberFormatException numberFormatException) {
        cm.i("Could not parse intent flags.");
        bool1 = bool;
      } 
      intent.addFlags(bool1);
    } 
    x x = m0.h3;
    if (((Boolean)er2.e().c(x)).booleanValue()) {
      intent.addFlags(268435456);
      intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
    } else {
      x = m0.g3;
      if (((Boolean)er2.e().c(x)).booleanValue()) {
        q.c();
        h1.L((Context)str1, intent);
      } 
    } 
    return a((Context)str1, intent, paramu, params, paramzzd.k);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */