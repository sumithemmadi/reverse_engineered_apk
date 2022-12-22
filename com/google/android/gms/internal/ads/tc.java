package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;

public final class tc<NETWORK_EXTRAS extends e, SERVER_PARAMETERS extends MediationServerParameters> implements c, d {
  private final sb a;
  
  public tc(sb paramsb) {
    this.a = paramsb;
  }
  
  public final void a(MediationBannerAdapter<?, ?> paramMediationBannerAdapter, AdRequest.ErrorCode paramErrorCode) {
    String str = String.valueOf(paramErrorCode);
    StringBuilder stringBuilder = new StringBuilder(str.length() + 47);
    stringBuilder.append("Adapter called onFailedToReceiveAd with error. ");
    stringBuilder.append(str);
    cm.e(stringBuilder.toString());
    er2.a();
    if (!sl.w()) {
      cm.f("#008 Must be called on the main UI thread.", null);
      sl.a.post(new uc(this, paramErrorCode));
      return;
    } 
    try {
      this.a.Z(xc.a(paramErrorCode));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void b(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter, AdRequest.ErrorCode paramErrorCode) {
    String str = String.valueOf(paramErrorCode);
    StringBuilder stringBuilder = new StringBuilder(str.length() + 47);
    stringBuilder.append("Adapter called onFailedToReceiveAd with error ");
    stringBuilder.append(str);
    stringBuilder.append(".");
    cm.e(stringBuilder.toString());
    er2.a();
    if (!sl.w()) {
      cm.f("#008 Must be called on the main UI thread.", null);
      sl.a.post(new vc(this, paramErrorCode));
      return;
    } 
    try {
      this.a.Z(xc.a(paramErrorCode));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */