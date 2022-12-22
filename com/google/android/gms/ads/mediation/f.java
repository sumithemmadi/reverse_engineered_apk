package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface f {
  void onDestroy();
  
  void onPause();
  
  void onResume();
  
  public static final class a {
    private int a;
    
    public final Bundle a() {
      Bundle bundle = new Bundle();
      bundle.putInt("capabilities", this.a);
      return bundle;
    }
    
    public final a b(int param1Int) {
      this.a = 1;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/mediation/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */