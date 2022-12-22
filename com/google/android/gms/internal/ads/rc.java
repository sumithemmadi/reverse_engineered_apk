package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.a;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.List;

public final class rc<NETWORK_EXTRAS extends e, SERVER_PARAMETERS extends MediationServerParameters> extends qb {
  private final b<NETWORK_EXTRAS, SERVER_PARAMETERS> b;
  
  private final NETWORK_EXTRAS c;
  
  public rc(b<NETWORK_EXTRAS, SERVER_PARAMETERS> paramb, NETWORK_EXTRAS paramNETWORK_EXTRAS) {
    this.b = paramb;
    this.c = paramNETWORK_EXTRAS;
  }
  
  private static boolean S9(zzvl paramzzvl) {
    if (!paramzzvl.g) {
      er2.a();
      if (!sl.v())
        return false; 
    } 
    return true;
  }
  
  private final SERVER_PARAMETERS T9(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 70
    //   4: new org/json/JSONObject
    //   7: astore_2
    //   8: aload_2
    //   9: aload_1
    //   10: invokespecial <init> : (Ljava/lang/String;)V
    //   13: new java/util/HashMap
    //   16: astore_3
    //   17: aload_3
    //   18: aload_2
    //   19: invokevirtual length : ()I
    //   22: invokespecial <init> : (I)V
    //   25: aload_2
    //   26: invokevirtual keys : ()Ljava/util/Iterator;
    //   29: astore #4
    //   31: aload_3
    //   32: astore_1
    //   33: aload #4
    //   35: invokeinterface hasNext : ()Z
    //   40: ifeq -> 79
    //   43: aload #4
    //   45: invokeinterface next : ()Ljava/lang/Object;
    //   50: checkcast java/lang/String
    //   53: astore_1
    //   54: aload_3
    //   55: aload_1
    //   56: aload_2
    //   57: aload_1
    //   58: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   61: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   66: pop
    //   67: goto -> 31
    //   70: new java/util/HashMap
    //   73: dup
    //   74: iconst_0
    //   75: invokespecial <init> : (I)V
    //   78: astore_1
    //   79: aload_0
    //   80: getfield b : Lcom/google/ads/mediation/b;
    //   83: invokeinterface getServerParametersType : ()Ljava/lang/Class;
    //   88: astore_2
    //   89: aconst_null
    //   90: astore_3
    //   91: aload_2
    //   92: ifnull -> 108
    //   95: aload_2
    //   96: invokevirtual newInstance : ()Ljava/lang/Object;
    //   99: checkcast com/google/ads/mediation/MediationServerParameters
    //   102: astore_3
    //   103: aload_3
    //   104: aload_1
    //   105: invokevirtual a : (Ljava/util/Map;)V
    //   108: aload_3
    //   109: areturn
    //   110: astore_1
    //   111: ldc ''
    //   113: aload_1
    //   114: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   117: new android/os/RemoteException
    //   120: dup
    //   121: invokespecial <init> : ()V
    //   124: astore_1
    //   125: goto -> 130
    //   128: aload_1
    //   129: athrow
    //   130: goto -> 128
    // Exception table:
    //   from	to	target	type
    //   4	31	110	finally
    //   33	67	110	finally
    //   70	79	110	finally
    //   79	89	110	finally
    //   95	108	110	finally
  }
  
  public final void A5(zzvl paramzzvl, String paramString1, String paramString2) {}
  
  public final void B8(a parama, z7 paramz7, List<zzajr> paramList) {}
  
  public final zzapy F0() {
    return null;
  }
  
  public final void F4(a parama, zzvl paramzzvl, String paramString1, fi paramfi, String paramString2) {}
  
  public final void J() {
    throw new RemoteException();
  }
  
  public final fc M4() {
    return null;
  }
  
  public final void Q4(a parama, fi paramfi, List<String> paramList) {}
  
  public final void Q8(a parama) {}
  
  public final void S5(a parama) {}
  
  public final zb S6() {
    return null;
  }
  
  public final void W1(a parama, zzvl paramzzvl, String paramString1, String paramString2, sb paramsb, zzaeh paramzzaeh, List<String> paramList) {}
  
  public final i4 a6() {
    return null;
  }
  
  public final boolean c4() {
    return false;
  }
  
  public final a c8() {
    String str;
    b<NETWORK_EXTRAS, SERVER_PARAMETERS> b1 = this.b;
    if (!(b1 instanceof MediationBannerAdapter)) {
      str = String.valueOf(b1.getClass().getCanonicalName());
      if (str.length() != 0) {
        str = "Not a MediationBannerAdapter: ".concat(str);
      } else {
        str = new String("Not a MediationBannerAdapter: ");
      } 
      cm.i(str);
      throw new RemoteException();
    } 
    try {
      return b.a2(((MediationBannerAdapter)str).getBannerView());
    } finally {
      str = null;
      cm.c("", (Throwable)str);
    } 
  }
  
  public final void destroy() {
    try {
      return;
    } finally {
      Exception exception = null;
      cm.c("", exception);
    } 
  }
  
  public final Bundle getInterstitialAdapterInfo() {
    return new Bundle();
  }
  
  public final nt2 getVideoController() {
    return null;
  }
  
  public final boolean isInitialized() {
    return true;
  }
  
  public final void j9(a parama, zzvl paramzzvl, String paramString1, String paramString2, sb paramsb) {
    String str;
    b<NETWORK_EXTRAS, SERVER_PARAMETERS> b1 = this.b;
    if (!(b1 instanceof MediationInterstitialAdapter)) {
      str = String.valueOf(b1.getClass().getCanonicalName());
      if (str.length() != 0) {
        str = "Not a MediationInterstitialAdapter: ".concat(str);
      } else {
        str = new String("Not a MediationInterstitialAdapter: ");
      } 
      cm.i(str);
      throw new RemoteException();
    } 
    cm.e("Requesting interstitial ad from adapter.");
    try {
      MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter)this.b;
      tc<e, MediationServerParameters> tc = new tc<e, MediationServerParameters>();
      return;
    } finally {
      str = null;
      cm.c("", (Throwable)str);
    } 
  }
  
  public final void o(boolean paramBoolean) {}
  
  public final void p1(zzvl paramzzvl, String paramString) {}
  
  public final Bundle p5() {
    return new Bundle();
  }
  
  public final void p6(a parama, zzvl paramzzvl, String paramString, sb paramsb) {}
  
  public final void pause() {
    throw new RemoteException();
  }
  
  public final void r2(a parama, zzvs paramzzvs, zzvl paramzzvl, String paramString1, String paramString2, sb paramsb) {
    String str;
    b<NETWORK_EXTRAS, SERVER_PARAMETERS> b1 = this.b;
    if (!(b1 instanceof MediationBannerAdapter)) {
      str = String.valueOf(b1.getClass().getCanonicalName());
      if (str.length() != 0) {
        str = "Not a MediationBannerAdapter: ".concat(str);
      } else {
        str = new String("Not a MediationBannerAdapter: ");
      } 
      cm.i(str);
      throw new RemoteException();
    } 
    cm.e("Requesting banner ad from adapter.");
    try {
      MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter)this.b;
      tc<e, MediationServerParameters> tc = new tc<e, MediationServerParameters>();
      this(paramsb);
      Activity activity = (Activity)b.o1((a)str);
      paramString1 = (String)T9(paramString1);
      a[] arrayOfA = new a[6];
      a a1 = a.a;
      byte b2 = 0;
      arrayOfA[0] = a1;
      arrayOfA[1] = a.b;
      arrayOfA[2] = a.c;
      arrayOfA[3] = a.d;
      arrayOfA[4] = a.e;
      return;
    } finally {
      str = null;
      cm.c("", (Throwable)str);
      RemoteException remoteException = new RemoteException();
    } 
  }
  
  public final void showInterstitial() {
    b<NETWORK_EXTRAS, SERVER_PARAMETERS> b1 = this.b;
    if (!(b1 instanceof MediationInterstitialAdapter)) {
      String str = String.valueOf(b1.getClass().getCanonicalName());
      if (str.length() != 0) {
        str = "Not a MediationInterstitialAdapter: ".concat(str);
      } else {
        str = new String("Not a MediationInterstitialAdapter: ");
      } 
      cm.i(str);
      throw new RemoteException();
    } 
    cm.e("Showing interstitial from adapter.");
    try {
      return;
    } finally {
      b1 = null;
      cm.c("", (Throwable)b1);
    } 
  }
  
  public final void showVideo() {}
  
  public final void u1(a parama, zzvs paramzzvs, zzvl paramzzvl, String paramString, sb paramsb) {
    r2(parama, paramzzvs, paramzzvl, paramString, null, paramsb);
  }
  
  public final zzapy v0() {
    return null;
  }
  
  public final ac z5() {
    return null;
  }
  
  public final void z7(a parama, zzvl paramzzvl, String paramString, sb paramsb) {}
  
  public final void z9(a parama, zzvl paramzzvl, String paramString, sb paramsb) {
    j9(parama, paramzzvl, paramString, null, paramsb);
  }
  
  public final Bundle zzux() {
    return new Bundle();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */