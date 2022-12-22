package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.a0;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.p;
import com.google.android.gms.ads.mediation.q;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.mediation.s;
import com.google.android.gms.ads.mediation.u;
import com.google.android.gms.ads.mediation.v;
import com.google.android.gms.ads.mediation.w;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class jc extends qb {
  private final Object b;
  
  private oc c;
  
  private fi d;
  
  private a e;
  
  private o f;
  
  public jc(a parama) {
    this.b = parama;
  }
  
  public jc(f paramf) {
    this.b = paramf;
  }
  
  private final Bundle S9(String paramString1, zzvl paramzzvl, String paramString2) {
    String str = String.valueOf(paramString1);
    if (str.length() != 0) {
      str = "Server parameters: ".concat(str);
    } else {
      str = new String("Server parameters: ");
    } 
    cm.e(str);
    try {
      Bundle bundle = new Bundle();
      this();
      return bundle;
    } finally {
      paramString1 = null;
      cm.c("", (Throwable)paramString1);
      RemoteException remoteException = new RemoteException();
    } 
  }
  
  private final d<o, ?> T9(sb paramsb) {
    return new lc(this, paramsb);
  }
  
  private static String V9(String paramString, zzvl paramzzvl) {
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
  
  private static boolean W9(zzvl paramzzvl) {
    if (!paramzzvl.g) {
      er2.a();
      if (!sl.v())
        return false; 
    } 
    return true;
  }
  
  private final Bundle X9(zzvl paramzzvl) {
    Bundle bundle = paramzzvl.n;
    if (bundle != null) {
      bundle = bundle.getBundle(this.b.getClass().getName());
      if (bundle != null)
        return bundle; 
    } 
    return new Bundle();
  }
  
  public final void A5(zzvl paramzzvl, String paramString1, String paramString2) {
    Bundle bundle;
    Object<String> object = (Object<String>)this.b;
    if (object instanceof MediationRewardedVideoAdAdapter) {
      cm.e("Requesting rewarded video ad from adapter.");
      try {
        Date date;
        MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter)this.b;
        object = (Object<String>)paramzzvl.f;
        Object object1 = null;
        if (object != null) {
          object = (Object<String>)new HashSet();
          super((Collection)paramzzvl.f);
        } else {
          object = null;
        } 
        kc kc = new kc();
        if (paramzzvl.c == -1L) {
          date = null;
        } else {
          date = new Date(paramzzvl.c);
        } 
        this(date, paramzzvl.e, (Set<String>)object, paramzzvl.l, W9(paramzzvl), paramzzvl.h, paramzzvl.s, paramzzvl.u, V9(paramString1, paramzzvl));
        Bundle bundle1 = paramzzvl.n;
        object = object1;
        return;
      } finally {
        paramzzvl = null;
        cm.c("", (Throwable)paramzzvl);
      } 
    } 
    if (bundle instanceof a) {
      p6(this.e, paramzzvl, paramString1, new nc((a)bundle, this.d));
      return;
    } 
    paramString2 = MediationRewardedVideoAdAdapter.class.getCanonicalName();
    paramString1 = a.class.getCanonicalName();
    String str = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString2).length() + 26 + String.valueOf(paramString1).length() + String.valueOf(str).length());
    stringBuilder.append(paramString2);
    stringBuilder.append(" or ");
    stringBuilder.append(paramString1);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str);
    cm.i(stringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void B8(a parama, z7 paramz7, List<zzajr> paramList) {
    if (this.b instanceof a) {
      mc mc = new mc(this, paramz7);
      ArrayList<i> arrayList = new ArrayList();
      for (zzajr zzajr : paramList) {
        AdFormat adFormat;
        String str = zzajr.b;
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
          case 1911491517:
            if (!str.equals("rewarded_interstitial"))
              break; 
            b = 4;
            break;
          case 604727084:
            if (!str.equals("interstitial"))
              break; 
            b = 3;
            break;
          case -239580146:
            if (!str.equals("rewarded"))
              break; 
            b = 2;
            break;
          case -1052618729:
            if (!str.equals("native"))
              break; 
            b = 1;
            break;
          case -1396342996:
            if (!str.equals("banner"))
              break; 
            b = 0;
            break;
        } 
        switch (b) {
          default:
            str = null;
            break;
          case 4:
            adFormat = AdFormat.e;
            break;
          case 3:
            adFormat = AdFormat.c;
            break;
          case 2:
            adFormat = AdFormat.d;
            break;
          case 1:
            adFormat = AdFormat.f;
            break;
          case 0:
            adFormat = AdFormat.b;
            break;
        } 
        if (adFormat != null)
          arrayList.add(new i(adFormat, zzajr.c)); 
      } 
      ((a)this.b).initialize((Context)b.o1(parama), mc, arrayList);
      return;
    } 
    RemoteException remoteException = new RemoteException();
    throw remoteException;
  }
  
  public final zzapy F0() {
    Object object = this.b;
    return !(object instanceof a) ? null : zzapy.o0(((a)object).getVersionInfo());
  }
  
  public final void F4(a parama, zzvl paramzzvl, String paramString1, fi paramfi, String paramString2) {
    Object object = this.b;
    if (object instanceof MediationRewardedVideoAdAdapter) {
      cm.e("Initialize rewarded video adapter.");
      try {
        String str;
        MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter)this.b;
        Bundle bundle = S9(paramString2, paramzzvl, null);
        if (paramzzvl != null) {
          Date date;
          if (paramzzvl.f != null) {
            object = new HashSet();
            super((Collection)paramzzvl.f);
          } else {
            object = null;
          } 
          kc kc2 = new kc();
          if (paramzzvl.c == -1L) {
            date = null;
          } else {
            date = new Date(paramzzvl.c);
          } 
          this(date, paramzzvl.e, (Set<String>)object, paramzzvl.l, W9(paramzzvl), paramzzvl.h, paramzzvl.s, paramzzvl.u, V9(paramString2, paramzzvl));
          Bundle bundle1 = paramzzvl.n;
          if (bundle1 != null) {
            bundle1 = bundle1.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
          } else {
            bundle1 = null;
          } 
          kc kc1 = kc2;
        } else {
          paramString2 = null;
          str = paramString2;
        } 
        Context context = (Context)b.o1(parama);
        object = new gi();
        return;
      } finally {
        parama = null;
        cm.c("", (Throwable)parama);
      } 
    } 
    if (object instanceof a) {
      this.e = parama;
      this.d = paramfi;
      paramfi.a5(b.a2(object));
      return;
    } 
    paramString1 = MediationRewardedVideoAdAdapter.class.getCanonicalName();
    String str2 = a.class.getCanonicalName();
    String str1 = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 26 + String.valueOf(str2).length() + String.valueOf(str1).length());
    stringBuilder.append(paramString1);
    stringBuilder.append(" or ");
    stringBuilder.append(str2);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str1);
    cm.i(stringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void J() {
    Object object = this.b;
    if (!(object instanceof f))
      return; 
    try {
      return;
    } finally {
      object = null;
      cm.c("", (Throwable)object);
    } 
  }
  
  public final fc M4() {
    w w = this.c.C();
    return (w != null) ? new zc(w) : null;
  }
  
  public final void Q4(a parama, fi paramfi, List<String> paramList) {
    if (this.b instanceof InitializableMediationRewardedVideoAdAdapter) {
      cm.e("Initialize rewarded video adapter.");
      try {
        InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter)this.b;
        ArrayList<Bundle> arrayList = new ArrayList();
        this();
        Iterator<String> iterator = paramList.iterator();
        while (iterator.hasNext())
          arrayList.add(S9(iterator.next(), null, null)); 
        Context context = (Context)b.o1(parama);
        gi gi = new gi();
        return;
      } finally {
        parama = null;
        cm.d("Could not initialize rewarded video adapter.", (Throwable)parama);
      } 
    } 
    String str2 = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
    String str1 = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 22 + String.valueOf(str1).length());
    stringBuilder.append(str2);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str1);
    cm.i(stringBuilder.toString());
    RemoteException remoteException = new RemoteException();
    throw remoteException;
  }
  
  public final void Q8(a parama) {
    if (this.b instanceof a) {
      cm.e("Show rewarded ad from adapter.");
      o o1 = this.f;
      if (o1 != null) {
        o1.a((Context)b.o1(parama));
        return;
      } 
      cm.g("Can not show null mediation rewarded ad.");
      throw new RemoteException();
    } 
    String str1 = a.class.getCanonicalName();
    String str2 = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 22 + String.valueOf(str2).length());
    stringBuilder.append(str1);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str2);
    cm.i(stringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void S5(a parama) {
    Context context = (Context)b.o1(parama);
    Object object = this.b;
    if (object instanceof u)
      ((u)object).a(context); 
  }
  
  public final zb S6() {
    q q = this.c.B();
    return (q instanceof r) ? new qc((r)q) : null;
  }
  
  public final void W1(a parama, zzvl paramzzvl, String paramString1, String paramString2, sb paramsb, zzaeh paramzzaeh, List<String> paramList) {
    Object<String> object = (Object<String>)this.b;
    if (object instanceof MediationNativeAdapter)
      try {
        Bundle bundle1;
        Date date;
        MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter)object;
        object = (Object<String>)paramzzvl.f;
        zzaeh zzaeh1 = null;
        if (object != null) {
          object = (Object<String>)new HashSet();
          super((Collection)paramzzvl.f);
        } else {
          object = null;
        } 
        sc sc = new sc();
        if (paramzzvl.c == -1L) {
          date = null;
        } else {
          date = new Date(paramzzvl.c);
        } 
        this(date, paramzzvl.e, (Set<String>)object, paramzzvl.l, W9(paramzzvl), paramzzvl.h, paramzzaeh, paramList, paramzzvl.s, paramzzvl.u, V9(paramString1, paramzzvl));
        Bundle bundle2 = paramzzvl.n;
        paramzzaeh = zzaeh1;
        if (bundle2 != null)
          bundle1 = bundle2.getBundle(mediationNativeAdapter.getClass().getName()); 
        oc oc1 = new oc();
        this(paramsb);
        return;
      } finally {
        parama = null;
        cm.c("", (Throwable)parama);
      }  
    String str2 = MediationNativeAdapter.class.getCanonicalName();
    String str1 = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 22 + String.valueOf(str1).length());
    stringBuilder.append(str2);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str1);
    cm.i(stringBuilder.toString());
    throw new RemoteException();
  }
  
  public final i4 a6() {
    f f = this.c.D();
    return (f instanceof j4) ? ((j4)f).a() : null;
  }
  
  public final boolean c4() {
    return this.b instanceof InitializableMediationRewardedVideoAdAdapter;
  }
  
  public final a c8() {
    Object object = this.b;
    if (object instanceof MediationBannerAdapter)
      try {
        return b.a2(((MediationBannerAdapter)object).getBannerView());
      } finally {
        object = null;
        cm.c("", (Throwable)object);
      }  
    object = MediationBannerAdapter.class.getCanonicalName();
    String str = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(object).length() + 22 + String.valueOf(str).length());
    stringBuilder.append((String)object);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str);
    cm.i(stringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void destroy() {
    Object object = this.b;
    if (!(object instanceof f))
      return; 
    try {
      return;
    } finally {
      object = null;
      cm.c("", (Throwable)object);
    } 
  }
  
  public final Bundle getInterstitialAdapterInfo() {
    Object object = this.b;
    if (!(object instanceof zzbga)) {
      String str = zzbga.class.getCanonicalName();
      object = this.b.getClass().getCanonicalName();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(object).length());
      stringBuilder.append(str);
      stringBuilder.append(" #009 Class mismatch: ");
      stringBuilder.append((String)object);
      cm.i(stringBuilder.toString());
      return new Bundle();
    } 
    return ((zzbga)object).getInterstitialAdapterInfo();
  }
  
  public final nt2 getVideoController() {
    Object object = this.b;
    if (!(object instanceof y))
      return null; 
    try {
      return ((y)object).getVideoController();
    } finally {
      object = null;
      cm.c("", (Throwable)object);
    } 
  }
  
  public final boolean isInitialized() {
    Object object = this.b;
    if (object instanceof MediationRewardedVideoAdAdapter) {
      cm.e("Check if adapter is initialized.");
      try {
        return ((MediationRewardedVideoAdAdapter)this.b).isInitialized();
      } finally {
        object = null;
        cm.c("", (Throwable)object);
      } 
    } 
    if (object instanceof a)
      return (this.d != null); 
    String str1 = MediationRewardedVideoAdAdapter.class.getCanonicalName();
    String str2 = a.class.getCanonicalName();
    String str3 = this.b.getClass().getCanonicalName();
    object = new StringBuilder(String.valueOf(str1).length() + 26 + String.valueOf(str2).length() + String.valueOf(str3).length());
    object.append(str1);
    object.append(" or ");
    object.append(str2);
    object.append(" #009 Class mismatch: ");
    object.append(str3);
    cm.i(object.toString());
    throw new RemoteException();
  }
  
  public final void j9(a parama, zzvl paramzzvl, String paramString1, String paramString2, sb paramsb) {
    if (this.b instanceof MediationInterstitialAdapter) {
      cm.e("Requesting interstitial ad from adapter.");
      try {
        Bundle bundle1;
        Date date;
        MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter)this.b;
        List<String> list = paramzzvl.f;
        List list1 = null;
        if (list != null) {
          HashSet hashSet = new HashSet();
          this((Collection)paramzzvl.f);
        } else {
          list = null;
        } 
        kc kc = new kc();
        if (paramzzvl.c == -1L) {
          date = null;
        } else {
          date = new Date(paramzzvl.c);
        } 
        this(date, paramzzvl.e, (Set<String>)list, paramzzvl.l, W9(paramzzvl), paramzzvl.h, paramzzvl.s, paramzzvl.u, V9(paramString1, paramzzvl));
        Bundle bundle2 = paramzzvl.n;
        list = list1;
        if (bundle2 != null)
          bundle1 = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName()); 
        Context context = (Context)b.o1(parama);
        oc oc1 = new oc();
        return;
      } finally {
        parama = null;
        cm.c("", (Throwable)parama);
      } 
    } 
    paramString1 = MediationInterstitialAdapter.class.getCanonicalName();
    String str = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 22 + String.valueOf(str).length());
    stringBuilder.append(paramString1);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str);
    cm.i(stringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void o(boolean paramBoolean) {
    Object object = this.b;
    if (!(object instanceof v)) {
      String str1 = v.class.getCanonicalName();
      String str2 = this.b.getClass().getCanonicalName();
      object = new StringBuilder(String.valueOf(str1).length() + 22 + String.valueOf(str2).length());
      object.append(str1);
      object.append(" #009 Class mismatch: ");
      object.append(str2);
      cm.e(object.toString());
      return;
    } 
    try {
      return;
    } finally {
      object = null;
      cm.c("", (Throwable)object);
    } 
  }
  
  public final void p1(zzvl paramzzvl, String paramString) {
    A5(paramzzvl, paramString, null);
  }
  
  public final Bundle p5() {
    return new Bundle();
  }
  
  public final void p6(a parama, zzvl paramzzvl, String paramString, sb paramsb) {
    if (this.b instanceof a) {
      cm.e("Requesting rewarded ad from adapter.");
      try {
        a a1 = (a)this.b;
        d<o, ?> d = T9(paramsb);
        p p = new p();
        this((Context)b.o1(parama), "", S9(paramString, paramzzvl, null), X9(paramzzvl), W9(paramzzvl), paramzzvl.l, paramzzvl.h, paramzzvl.u, V9(paramString, paramzzvl), "");
        a1.loadRewardedAd(p, d);
        return;
      } catch (Exception exception) {
        cm.c("", exception);
        throw new RemoteException();
      } 
    } 
    paramString = a.class.getCanonicalName();
    String str = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 22 + String.valueOf(str).length());
    stringBuilder.append(paramString);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str);
    cm.i(stringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void pause() {
    Object object = this.b;
    if (!(object instanceof f))
      return; 
    try {
      return;
    } finally {
      object = null;
      cm.c("", (Throwable)object);
    } 
  }
  
  public final void r2(a parama, zzvs paramzzvs, zzvl paramzzvl, String paramString1, String paramString2, sb paramsb) {
    if (this.b instanceof MediationBannerAdapter) {
      cm.e("Requesting banner ad from adapter.");
      try {
        f f;
        Bundle bundle1;
        Date date;
        MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter)this.b;
        List<String> list = paramzzvl.f;
        List list1 = null;
        if (list != null) {
          HashSet hashSet = new HashSet();
          this((Collection)paramzzvl.f);
        } else {
          list = null;
        } 
        kc kc = new kc();
        if (paramzzvl.c == -1L) {
          date = null;
        } else {
          date = new Date(paramzzvl.c);
        } 
        this(date, paramzzvl.e, (Set<String>)list, paramzzvl.l, W9(paramzzvl), paramzzvl.h, paramzzvl.s, paramzzvl.u, V9(paramString1, paramzzvl));
        Bundle bundle2 = paramzzvl.n;
        list = list1;
        if (bundle2 != null)
          bundle1 = bundle2.getBundle(mediationBannerAdapter.getClass().getName()); 
        if (paramzzvs.o) {
          f = a0.a(paramzzvs.f, paramzzvs.c);
        } else {
          f = a0.b(((zzvs)f).f, ((zzvs)f).c, ((zzvs)f).b);
        } 
        Context context = (Context)b.o1(parama);
        oc oc1 = new oc();
        return;
      } finally {
        parama = null;
        cm.c("", (Throwable)parama);
      } 
    } 
    String str2 = MediationBannerAdapter.class.getCanonicalName();
    String str1 = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 22 + String.valueOf(str1).length());
    stringBuilder.append(str2);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str1);
    cm.i(stringBuilder.toString());
    RemoteException remoteException = new RemoteException();
    throw remoteException;
  }
  
  public final void showInterstitial() {
    if (this.b instanceof MediationInterstitialAdapter) {
      cm.e("Showing interstitial from adapter.");
      try {
        return;
      } finally {
        Exception exception = null;
        cm.c("", exception);
      } 
    } 
    String str1 = MediationInterstitialAdapter.class.getCanonicalName();
    String str2 = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 22 + String.valueOf(str2).length());
    stringBuilder.append(str1);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str2);
    cm.i(stringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void showVideo() {
    Object object = this.b;
    if (object instanceof MediationRewardedVideoAdAdapter) {
      cm.e("Show rewarded video ad from adapter.");
      try {
        return;
      } finally {
        object = null;
        cm.c("", (Throwable)object);
      } 
    } 
    if (object instanceof a) {
      object = this.f;
      if (object != null) {
        object.a((Context)b.o1(this.e));
        return;
      } 
      cm.g("Can not show null mediated rewarded ad.");
      throw new RemoteException();
    } 
    String str1 = MediationRewardedVideoAdAdapter.class.getCanonicalName();
    String str2 = a.class.getCanonicalName();
    String str3 = this.b.getClass().getCanonicalName();
    object = new StringBuilder(String.valueOf(str1).length() + 26 + String.valueOf(str2).length() + String.valueOf(str3).length());
    object.append(str1);
    object.append(" or ");
    object.append(str2);
    object.append(" #009 Class mismatch: ");
    object.append(str3);
    cm.i(object.toString());
    throw new RemoteException();
  }
  
  public final void u1(a parama, zzvs paramzzvs, zzvl paramzzvl, String paramString, sb paramsb) {
    r2(parama, paramzzvs, paramzzvl, paramString, null, paramsb);
  }
  
  public final zzapy v0() {
    Object object = this.b;
    return !(object instanceof a) ? null : zzapy.o0(((a)object).getSDKVersionInfo());
  }
  
  public final ac z5() {
    q q = this.c.B();
    return (q instanceof s) ? new pc((s)q) : null;
  }
  
  public final void z7(a parama, zzvl paramzzvl, String paramString, sb paramsb) {
    if (this.b instanceof a) {
      cm.e("Requesting rewarded interstitial ad from adapter.");
      try {
        a a1 = (a)this.b;
        d<o, ?> d = T9(paramsb);
        p p = new p();
        this((Context)b.o1(parama), "", S9(paramString, paramzzvl, null), X9(paramzzvl), W9(paramzzvl), paramzzvl.l, paramzzvl.h, paramzzvl.u, V9(paramString, paramzzvl), "");
        a1.loadRewardedInterstitialAd(p, d);
        return;
      } catch (Exception exception) {
        cm.c("", exception);
        throw new RemoteException();
      } 
    } 
    String str1 = a.class.getCanonicalName();
    String str2 = this.b.getClass().getCanonicalName();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 22 + String.valueOf(str2).length());
    stringBuilder.append(str1);
    stringBuilder.append(" #009 Class mismatch: ");
    stringBuilder.append(str2);
    cm.i(stringBuilder.toString());
    throw new RemoteException();
  }
  
  public final void z9(a parama, zzvl paramzzvl, String paramString, sb paramsb) {
    j9(parama, paramzzvl, paramString, null, paramsb);
  }
  
  public final Bundle zzux() {
    Object object = this.b;
    if (!(object instanceof zzbfz)) {
      String str = zzbfz.class.getCanonicalName();
      object = this.b.getClass().getCanonicalName();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(object).length());
      stringBuilder.append(str);
      stringBuilder.append(" #009 Class mismatch: ");
      stringBuilder.append((String)object);
      cm.i(stringBuilder.toString());
      return new Bundle();
    } 
    return ((zzbfz)object).zzux();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */