package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.x;

@TargetApi(18)
public class t1 extends u1 {
  public boolean b(View paramView) {
    return (super.b(paramView) || paramView.getWindowId() != null);
  }
  
  public final int o() {
    return 14;
  }
  
  public final long s() {
    x x = m0.j2;
    return !((Boolean)er2.e().c(x)).booleanValue() ? -1L : ((new StatFs(Environment.getDataDirectory().getAbsolutePath())).getAvailableBytes() / 1024L);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/t1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */