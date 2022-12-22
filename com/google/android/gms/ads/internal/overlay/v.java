package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.bq2;
import com.google.android.gms.internal.ads.df;

public final class v extends df {
  private AdOverlayInfoParcel b;
  
  private Activity c;
  
  private boolean d = false;
  
  private boolean e = false;
  
  public v(Activity paramActivity, AdOverlayInfoParcel paramAdOverlayInfoParcel) {
    this.b = paramAdOverlayInfoParcel;
    this.c = paramActivity;
  }
  
  private final void T9() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Z
    //   6: ifne -> 35
    //   9: aload_0
    //   10: getfield b : Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    //   13: getfield d : Lcom/google/android/gms/ads/internal/overlay/p;
    //   16: astore_1
    //   17: aload_1
    //   18: ifnull -> 30
    //   21: aload_1
    //   22: getstatic com/google/android/gms/ads/internal/overlay/zzn.e : Lcom/google/android/gms/ads/internal/overlay/zzn;
    //   25: invokeinterface R5 : (Lcom/google/android/gms/ads/internal/overlay/zzn;)V
    //   30: aload_0
    //   31: iconst_1
    //   32: putfield e : Z
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: astore_1
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	38	finally
    //   21	30	38	finally
    //   30	35	38	finally
  }
  
  public final void G9(Bundle paramBundle) {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramBundle != null) {
      bool2 = bool1;
      if (paramBundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false))
        bool2 = true; 
    } 
    AdOverlayInfoParcel adOverlayInfoParcel = this.b;
    if (adOverlayInfoParcel == null) {
      this.c.finish();
      return;
    } 
    if (bool2) {
      this.c.finish();
      return;
    } 
    if (paramBundle == null) {
      bq2 bq2 = adOverlayInfoParcel.c;
      if (bq2 != null)
        bq2.x(); 
      if (this.c.getIntent() != null && this.c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true)) {
        p p = this.b.d;
        if (p != null)
          p.u9(); 
      } 
    } 
    q.a();
    Activity activity = this.c;
    adOverlayInfoParcel = this.b;
    zzd zzd = adOverlayInfoParcel.b;
    if (!e.c((Context)activity, zzd, adOverlayInfoParcel.j, zzd.j))
      this.c.finish(); 
  }
  
  public final void L7() {}
  
  public final void M0() {
    p p = this.b.d;
    if (p != null)
      p.M0(); 
  }
  
  public final boolean S8() {
    return false;
  }
  
  public final void U7(a parama) {}
  
  public final void X() {
    if (this.c.isFinishing())
      T9(); 
  }
  
  public final void c5(Bundle paramBundle) {
    paramBundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.d);
  }
  
  public final void onDestroy() {
    if (this.c.isFinishing())
      T9(); 
  }
  
  public final void onPause() {
    p p = this.b.d;
    if (p != null)
      p.onPause(); 
    if (this.c.isFinishing())
      T9(); 
  }
  
  public final void onResume() {
    if (this.d) {
      this.c.finish();
      return;
    } 
    this.d = true;
    p p = this.b.d;
    if (p != null)
      p.onResume(); 
  }
  
  public final void onStart() {}
  
  public final void x1(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public final void x4() {}
  
  public final void z8() {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */