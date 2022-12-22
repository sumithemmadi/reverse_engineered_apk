package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.af;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;

public final class AdActivity extends Activity {
  private af b;
  
  private final void a() {
    af af1 = this.b;
    if (af1 != null)
      try {
        af1.x4();
        return;
      } catch (RemoteException remoteException) {
        cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      }  
  }
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    try {
      this.b.x1(paramInt1, paramInt2, paramIntent);
    } catch (Exception exception) {
      cm.f("#007 Could not call remote method.", exception);
    } 
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public final void onBackPressed() {
    boolean bool2;
    boolean bool1 = true;
    try {
      af af1 = this.b;
      bool2 = bool1;
      if (af1 != null)
        bool2 = af1.S8(); 
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      bool2 = bool1;
    } 
    if (bool2) {
      super.onBackPressed();
      try {
        this.b.z8();
        return;
      } catch (RemoteException remoteException) {
        cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      } 
    } 
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    try {
      this.b.U7(b.a2(paramConfiguration));
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  protected final void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    af af1 = er2.b().f(this);
    this.b = af1;
    if (af1 == null) {
      cm.f("#007 Could not call remote method.", null);
      finish();
      return;
    } 
    try {
      af1.G9(paramBundle);
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      finish();
      return;
    } 
  }
  
  protected final void onDestroy() {
    try {
      af af1 = this.b;
      if (af1 != null)
        af1.onDestroy(); 
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
    } 
    super.onDestroy();
  }
  
  protected final void onPause() {
    try {
      af af1 = this.b;
      if (af1 != null)
        af1.onPause(); 
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      finish();
    } 
    super.onPause();
  }
  
  protected final void onRestart() {
    super.onRestart();
    try {
      af af1 = this.b;
      if (af1 != null)
        af1.L7(); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      finish();
      return;
    } 
  }
  
  protected final void onResume() {
    super.onResume();
    try {
      af af1 = this.b;
      if (af1 != null)
        af1.onResume(); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      finish();
      return;
    } 
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle) {
    try {
      af af1 = this.b;
      if (af1 != null)
        af1.c5(paramBundle); 
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      finish();
    } 
    super.onSaveInstanceState(paramBundle);
  }
  
  protected final void onStart() {
    super.onStart();
    try {
      af af1 = this.b;
      if (af1 != null)
        af1.onStart(); 
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      finish();
      return;
    } 
  }
  
  protected final void onStop() {
    try {
      af af1 = this.b;
      if (af1 != null)
        af1.X(); 
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      finish();
    } 
    super.onStop();
  }
  
  protected final void onUserLeaveHint() {
    super.onUserLeaveHint();
    try {
      this.b.M0();
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void setContentView(int paramInt) {
    super.setContentView(paramInt);
    a();
  }
  
  public final void setContentView(View paramView) {
    super.setContentView(paramView);
    a();
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    super.setContentView(paramView, paramLayoutParams);
    a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/AdActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */