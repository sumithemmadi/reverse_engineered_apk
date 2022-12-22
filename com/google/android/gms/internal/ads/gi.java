package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.a;
import com.google.android.gms.ads.y.b;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class gi implements a {
  private final fi a;
  
  public gi(fi paramfi) {
    this.a = paramfi;
  }
  
  public final void A(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onVideoCompleted.");
    try {
      this.a.I3(b.a2(paramMediationRewardedVideoAdAdapter));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void B(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, int paramInt) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdFailedToLoad.");
    try {
      this.a.w3(b.a2(paramMediationRewardedVideoAdAdapter), paramInt);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void C(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdOpened.");
    try {
      this.a.X2(b.a2(paramMediationRewardedVideoAdAdapter));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void D(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onVideoStarted.");
    try {
      this.a.y8(b.a2(paramMediationRewardedVideoAdAdapter));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void E(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdLoaded.");
    try {
      this.a.O1(b.a2(paramMediationRewardedVideoAdAdapter));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void F(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, b paramb) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onRewarded.");
    if (paramb != null)
      try {
        fi fi2 = this.a;
        a a2 = b.a2(paramMediationRewardedVideoAdAdapter);
        zzavj zzavj1 = new zzavj();
        this(paramb);
        fi2.X3(a2, zzavj1);
        return;
      } catch (RemoteException remoteException) {
        cm.f("#007 Could not call remote method.", (Throwable)remoteException);
        return;
      }  
    fi fi1 = this.a;
    a a1 = b.a2(remoteException);
    zzavj zzavj = new zzavj();
    this("", 1);
    fi1.X3(a1, zzavj);
  }
  
  public final void G(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdLeftApplication.");
    try {
      this.a.u7(b.a2(paramMediationRewardedVideoAdAdapter));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void H(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onInitializationSucceeded.");
    try {
      this.a.a5(b.a2(paramMediationRewardedVideoAdAdapter));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void I(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdClosed.");
    try {
      this.a.k9(b.a2(paramMediationRewardedVideoAdAdapter));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void z(Bundle paramBundle) {
    t.e("#008 Must be called on the main UI thread.");
    cm.e("Adapter called onAdMetadataChanged.");
    try {
      this.a.z(paramBundle);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */