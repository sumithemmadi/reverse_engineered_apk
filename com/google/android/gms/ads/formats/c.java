package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.t3;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@Deprecated
public final class c {
  public static WeakHashMap<View, c> a = new WeakHashMap<View, c>();
  
  private t3 b;
  
  private WeakReference<View> c;
  
  private final void c(a parama) {
    WeakReference<View> weakReference = this.c;
    if (weakReference != null) {
      View view = weakReference.get();
    } else {
      weakReference = null;
    } 
    if (weakReference == null) {
      cm.i("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
      return;
    } 
    if (!a.containsKey(weakReference))
      a.put(weakReference, this); 
    t3 t31 = this.b;
    if (t31 != null)
      try {
        t31.d1(parama);
        return;
      } catch (RemoteException remoteException) {
        cm.c("Unable to call setNativeAd on delegate", (Throwable)remoteException);
      }  
  }
  
  public final void a(a parama) {
    c((a)parama.a());
  }
  
  public final void b(g paramg) {
    c((a)paramg.k());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/formats/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */