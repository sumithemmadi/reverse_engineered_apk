package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.cm;

final class n extends WebViewClient {
  n(k paramk) {}
  
  public final void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError) {
    if (k.U9(this.a) != null)
      try {
        k.U9(this.a).Z(0);
        return;
      } catch (RemoteException remoteException) {
        cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      }  
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString) {
    if (paramString.startsWith(this.a.ha()))
      return false; 
    if (paramString.startsWith("gmsg://noAdLoaded")) {
      if (k.U9(this.a) != null)
        try {
          k.U9(this.a).Z(3);
        } catch (RemoteException remoteException) {
          cm.f("#007 Could not call remote method.", (Throwable)remoteException);
        }  
      this.a.ba(0);
      return true;
    } 
    if (paramString.startsWith("gmsg://scriptLoadFailed")) {
      if (k.U9(this.a) != null)
        try {
          k.U9(this.a).Z(0);
        } catch (RemoteException remoteException) {
          cm.f("#007 Could not call remote method.", (Throwable)remoteException);
        }  
      this.a.ba(0);
      return true;
    } 
    if (paramString.startsWith("gmsg://adResized")) {
      if (k.U9(this.a) != null)
        try {
          k.U9(this.a).i();
        } catch (RemoteException remoteException) {
          cm.f("#007 Could not call remote method.", (Throwable)remoteException);
        }  
      int i = this.a.Y9(paramString);
      this.a.ba(i);
      return true;
    } 
    if (paramString.startsWith("gmsg://"))
      return true; 
    if (k.U9(this.a) != null)
      try {
        k.U9(this.a).O();
      } catch (RemoteException remoteException) {
        cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      }  
    String str = k.V9(this.a, paramString);
    k.X9(this.a, str);
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */