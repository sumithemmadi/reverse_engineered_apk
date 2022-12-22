package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.a;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.internal.util.p1;
import com.google.android.gms.ads.internal.zzk;

final class m extends a {
  private m(f paramf) {}
  
  public final void b() {
    Bitmap bitmap = q.v().a(Integer.valueOf(this.d.d.p.g));
    if (bitmap != null) {
      p1 p1 = q.e();
      f f1 = this.d;
      Activity activity = f1.c;
      zzk zzk = f1.d.p;
      Drawable drawable = p1.d((Context)activity, bitmap, zzk.e, zzk.f);
      h1.a.post(new l(this, drawable));
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */