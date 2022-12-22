package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.util.d1;

public final class wj implements SharedPreferences.OnSharedPreferenceChangeListener {
  private static wj a;
  
  private final SharedPreferences b;
  
  private final d1 c;
  
  private String d = "";
  
  private wj(Context paramContext, d1 paramd1) {
    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    this.b = sharedPreferences;
    this.c = paramd1;
    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
  }
  
  public static wj a(Context paramContext, d1 paramd1) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/wj
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/internal/ads/wj.a : Lcom/google/android/gms/internal/ads/wj;
    //   6: ifnonnull -> 23
    //   9: new com/google/android/gms/internal/ads/wj
    //   12: astore_2
    //   13: aload_2
    //   14: aload_0
    //   15: aload_1
    //   16: invokespecial <init> : (Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/d1;)V
    //   19: aload_2
    //   20: putstatic com/google/android/gms/internal/ads/wj.a : Lcom/google/android/gms/internal/ads/wj;
    //   23: getstatic com/google/android/gms/internal/ads/wj.a : Lcom/google/android/gms/internal/ads/wj;
    //   26: astore_0
    //   27: ldc com/google/android/gms/internal/ads/wj
    //   29: monitorexit
    //   30: aload_0
    //   31: areturn
    //   32: astore_0
    //   33: ldc com/google/android/gms/internal/ads/wj
    //   35: monitorexit
    //   36: aload_0
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   3	23	32	finally
    //   23	27	32	finally
  }
  
  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString) {
    if (!"IABTCF_PurposeConsents".equals(paramString))
      return; 
    String str = paramSharedPreferences.getString("IABTCF_PurposeConsents", "");
    if (str.isEmpty())
      return; 
    if (!this.d.equals(str)) {
      this.d = str;
      boolean bool = false;
      if (str.charAt(0) != '1')
        bool = true; 
      x<Boolean> x = m0.j0;
      if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
        this.c.i(bool); 
      x = m0.i0;
      ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */