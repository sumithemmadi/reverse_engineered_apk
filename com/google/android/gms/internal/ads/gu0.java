package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public final class gu0 {
  private static final SparseArray<zzug$zzo.zzc> a;
  
  private final Context b;
  
  private final t30 c;
  
  private final TelephonyManager d;
  
  private final zt0 e;
  
  private final tt0 f;
  
  private zzuq g;
  
  static {
    SparseArray<zzug$zzo.zzc> sparseArray = new SparseArray();
    a = sparseArray;
    sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzug$zzo.zzc.d);
    int i = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
    zzug$zzo.zzc zzc1 = zzug$zzo.zzc.c;
    sparseArray.put(i, zzc1);
    sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzc1);
    sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzc1);
    sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzug$zzo.zzc.e);
    i = NetworkInfo.DetailedState.BLOCKED.ordinal();
    zzug$zzo.zzc zzc2 = zzug$zzo.zzc.f;
    sparseArray.put(i, zzc2);
    sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzc2);
    sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzc2);
    sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzc2);
    sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzc2);
    sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzug$zzo.zzc.g);
    if (Build.VERSION.SDK_INT >= 17)
      sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzc1); 
    sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzc1);
  }
  
  gu0(Context paramContext, t30 paramt30, zt0 paramzt0, tt0 paramtt0) {
    this.b = paramContext;
    this.c = paramt30;
    this.e = paramzt0;
    this.f = paramtt0;
    this.d = (TelephonyManager)paramContext.getSystemService("phone");
  }
  
  private final byte[] d(boolean paramBoolean, ArrayList<zzug$zzc.zza> paramArrayList, zzug$zzm paramzzug$zzm, zzug$zzo.zzc paramzzc) {
    boolean bool2;
    zzug$zzo.a.a a1 = zzug$zzo.a.u0().E(paramArrayList);
    ContentResolver contentResolver2 = this.b.getContentResolver();
    int i = q.e().j(contentResolver2);
    boolean bool1 = true;
    if (i != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    zzug$zzo.a.a a2 = a1.G(g(bool2)).H(q.e().g(this.b, this.d)).B(this.e.g()).C(this.e.h()).z(this.e.a()).y(paramzzc).x(paramzzug$zzm).I(this.g).D(g(paramBoolean)).A(q.j().a());
    ContentResolver contentResolver1 = this.b.getContentResolver();
    if (q.e().c(contentResolver1) != 0) {
      paramBoolean = bool1;
    } else {
      paramBoolean = false;
    } 
    return ((zzug$zzo.a)a2.F(g(paramBoolean)).h()).g();
  }
  
  private static zzuq g(boolean paramBoolean) {
    return paramBoolean ? zzuq.c : zzuq.b;
  }
  
  private final zzug$zzm i(Bundle paramBundle) {
    zzug$zzm.a a = zzug$zzm.R();
    int i = paramBundle.getInt("cnt", -2);
    int j = paramBundle.getInt("gnt", 0);
    if (i == -1) {
      this.g = zzuq.c;
    } else {
      zzug$zzm.zza zza;
      this.g = zzuq.b;
      if (i != 0) {
        if (i != 1) {
          a.y(zzug$zzm.zzc.b);
        } else {
          a.y(zzug$zzm.zzc.d);
        } 
      } else {
        a.y(zzug$zzm.zzc.c);
      } 
      switch (j) {
        default:
          zza = zzug$zzm.zza.b;
          break;
        case 13:
          zza = zzug$zzm.zza.e;
          break;
        case 3:
        case 5:
        case 6:
        case 8:
        case 9:
        case 10:
        case 12:
        case 14:
        case 15:
        case 17:
          zza = zzug$zzm.zza.d;
          break;
        case 1:
        case 2:
        case 4:
        case 7:
        case 11:
        case 16:
          zza = zzug$zzm.zza.c;
          break;
      } 
      a.x(zza);
    } 
    return (zzug$zzm)a.h();
  }
  
  private static zzug$zzo.zzc j(Bundle paramBundle) {
    int i = pi1.a(pi1.a(paramBundle, "device"), "network").getInt("active_network_state", -1);
    return (zzug$zzo.zzc)a.get(i, zzug$zzo.zzc.b);
  }
  
  private static ArrayList<zzug$zzc.zza> k(Bundle paramBundle) {
    object = (Object<String>)paramBundle.get("ad_types");
    if (object instanceof java.util.List) {
      object = object;
    } else if (object instanceof String[]) {
      object = Arrays.asList((String[])object);
    } else {
      object = Collections.emptyList();
      ArrayList arrayList1 = new ArrayList();
      Iterator<String> iterator1 = object.iterator();
    } 
    ArrayList<String> arrayList = new ArrayList(object.size());
    for (Object<String> object : object) {
      if (object instanceof String)
        arrayList.add((String)object); 
    } 
    object = Collections.unmodifiableList(arrayList);
    arrayList = new ArrayList<String>();
    Iterator<String> iterator = object.iterator();
  }
  
  public final void f(boolean paramBoolean) {
    dt1.g(this.c.a(), new fu0(this, paramBoolean), fm.f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */