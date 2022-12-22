package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.d;
import java.lang.ref.WeakReference;

public final class o92 extends d {
  private WeakReference<n92> a;
  
  public o92(n92 paramn92) {
    this.a = new WeakReference<n92>(paramn92);
  }
  
  public final void a(ComponentName paramComponentName, b paramb) {
    n92 n92 = this.a.get();
    if (n92 != null)
      n92.a(paramb); 
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    n92 n92 = this.a.get();
    if (n92 != null)
      n92.b(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/o92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */