package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.p;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.a;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class td extends nd {
  private final RtbAdapter b;
  
  private j c;
  
  private o d;
  
  private String e = "";
  
  public td(RtbAdapter paramRtbAdapter) {
    this.b = paramRtbAdapter;
  }
  
  private final d<o, ?> T9(jd paramjd, sb paramsb) {
    return new wd(this, paramjd, paramsb);
  }
  
  private static String U9(String paramString, zzvl paramzzvl) {
    String str1;
    String str2 = paramzzvl.v;
    try {
      JSONObject jSONObject = new JSONObject();
      this(paramString);
      paramString = jSONObject.getString("max_ad_content_rating");
    } catch (JSONException jSONException) {
      str1 = str2;
    } 
    return str1;
  }
  
  private static boolean V9(zzvl paramzzvl) {
    if (!paramzzvl.g) {
      er2.a();
      if (!sl.v())
        return false; 
    } 
    return true;
  }
  
  private final Bundle W9(zzvl paramzzvl) {
    Bundle bundle = paramzzvl.n;
    if (bundle != null) {
      bundle = bundle.getBundle(this.b.getClass().getName());
      if (bundle != null)
        return bundle; 
    } 
    return new Bundle();
  }
  
  private static Bundle X9(String paramString) {
    String str = String.valueOf(paramString);
    if (str.length() != 0) {
      str = "Server parameters: ".concat(str);
    } else {
      str = new String("Server parameters: ");
    } 
    cm.i(str);
    try {
      Bundle bundle = new Bundle();
      this();
      if (paramString != null) {
        JSONObject jSONObject = new JSONObject();
        this(paramString);
        bundle = new Bundle();
        this();
        Iterator<String> iterator = jSONObject.keys();
        while (iterator.hasNext()) {
          String str1 = iterator.next();
          bundle.putString(str1, jSONObject.getString(str1));
        } 
      } 
      return bundle;
    } catch (JSONException jSONException) {
      cm.c("", (Throwable)jSONException);
      RemoteException remoteException = new RemoteException();
      throw remoteException;
    } 
  }
  
  public final void B5(String paramString1, String paramString2, zzvl paramzzvl, a parama, jd paramjd, sb paramsb) {
    try {
      d<o, ?> d = T9(paramjd, paramsb);
      RtbAdapter rtbAdapter = this.b;
      p p = new p();
      return;
    } finally {
      paramString1 = null;
      cm.c("Adapter failed to render rewarded interstitial ad.", (Throwable)paramString1);
    } 
  }
  
  public final zzapy F0() {
    return zzapy.o0(this.b.getVersionInfo());
  }
  
  public final void F3(a parama) {}
  
  public final void G1(String paramString) {
    this.e = paramString;
  }
  
  public final void H7(String[] paramArrayOfString, Bundle[] paramArrayOfBundle) {}
  
  public final void I4(String paramString1, String paramString2, zzvl paramzzvl, a parama, yc paramyc, sb paramsb, zzvs paramzzvs) {
    try {
      sd sd = new sd();
      this(this, paramyc, paramsb);
      RtbAdapter rtbAdapter = this.b;
      g g = new g();
      return;
    } finally {
      paramString1 = null;
      cm.c("Adapter failed to render banner ad.", (Throwable)paramString1);
    } 
  }
  
  public final void J5(a parama, String paramString, Bundle paramBundle1, Bundle paramBundle2, zzvs paramzzvs, pd parampd) {
    try {
      IllegalArgumentException illegalArgumentException;
      AdFormat adFormat;
      xd xd = new xd();
      this(this, parampd);
      RtbAdapter rtbAdapter = this.b;
      i i = new i();
      byte b = -1;
      switch (paramString.hashCode()) {
        case 1911491517:
          if (paramString.equals("rewarded_interstitial"))
            b = 3; 
          break;
        case 604727084:
          if (paramString.equals("interstitial"))
            b = 1; 
          break;
        case -239580146:
          if (paramString.equals("rewarded"))
            b = 2; 
          break;
        case -1052618729:
          if (paramString.equals("native"))
            b = 4; 
          break;
        case -1396342996:
          if (paramString.equals("banner"))
            b = 0; 
          break;
      } 
      if (b != 0) {
        if (b != 1) {
          if (b != 2) {
            if (b != 3) {
              if (b == 4) {
                adFormat = AdFormat.f;
              } else {
                illegalArgumentException = new IllegalArgumentException();
                this("Internal Error");
                throw illegalArgumentException;
              } 
            } else {
              adFormat = AdFormat.e;
            } 
          } else {
            adFormat = AdFormat.d;
          } 
        } else {
          adFormat = AdFormat.c;
        } 
      } else {
        adFormat = AdFormat.b;
      } 
      this(adFormat, paramBundle2);
      ArrayList<i> arrayList = new ArrayList();
      this();
      arrayList.add(i);
      a a1 = new a();
      return;
    } finally {
      parama = null;
      cm.c("Error generating signals for RTB", (Throwable)parama);
    } 
  }
  
  public final void U3(String paramString1, String paramString2, zzvl paramzzvl, a parama, ed paramed, sb paramsb) {
    try {
      ud ud = new ud();
      this(this, paramed, paramsb);
      RtbAdapter rtbAdapter = this.b;
      m m = new m();
      return;
    } finally {
      paramString1 = null;
      cm.c("Adapter failed to render rewarded ad.", (Throwable)paramString1);
    } 
  }
  
  public final boolean U8(a parama) {
    o o1 = this.d;
    if (o1 == null)
      return false; 
    try {
      o1.a((Context)b.o1(parama));
    } finally {
      parama = null;
    } 
  }
  
  public final boolean a4(a parama) {
    j j1 = this.c;
    if (j1 == null)
      return false; 
    try {
      j1.a((Context)b.o1(parama));
    } finally {
      parama = null;
    } 
  }
  
  public final nt2 getVideoController() {
    RtbAdapter rtbAdapter = this.b;
    if (!(rtbAdapter instanceof y))
      return null; 
    try {
      return ((y)rtbAdapter).getVideoController();
    } finally {
      rtbAdapter = null;
      cm.c("", (Throwable)rtbAdapter);
    } 
  }
  
  public final void u4(String paramString1, String paramString2, zzvl paramzzvl, a parama, jd paramjd, sb paramsb) {
    try {
      d<o, ?> d = T9(paramjd, paramsb);
      RtbAdapter rtbAdapter = this.b;
      p p = new p();
      return;
    } finally {
      paramString1 = null;
      cm.c("Adapter failed to render rewarded ad.", (Throwable)paramString1);
    } 
  }
  
  public final zzapy v0() {
    return zzapy.o0(this.b.getSDKVersionInfo());
  }
  
  public final void v7(String paramString1, String paramString2, zzvl paramzzvl, a parama, dd paramdd, sb paramsb) {
    try {
      vd vd = new vd();
      this(this, paramdd, paramsb);
      RtbAdapter rtbAdapter = this.b;
      k k = new k();
      return;
    } finally {
      paramString1 = null;
      cm.c("Adapter failed to render interstitial ad.", (Throwable)paramString1);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/td.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */