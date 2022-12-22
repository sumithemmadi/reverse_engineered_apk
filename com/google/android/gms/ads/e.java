package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.tt2;
import com.google.android.gms.internal.ads.ut2;
import java.util.Date;

public class e {
  protected final ut2 a;
  
  protected e(a parama) {
    this.a = new ut2(parama.a);
  }
  
  public ut2 a() {
    return this.a;
  }
  
  public static class a {
    protected final tt2 a;
    
    public a() {
      tt2 tt21 = new tt2();
      this.a = tt21;
      tt21.i("B3EEABB8EE11C2BE770B684D95219ECB");
    }
    
    public a a(String param1String) {
      this.a.h(param1String);
      return this;
    }
    
    public a b(Class<?> param1Class, Bundle param1Bundle) {
      this.a.c(param1Class, param1Bundle);
      if (param1Class.equals(AdMobAdapter.class) && param1Bundle.getBoolean("_emulatorLiveAds"))
        this.a.j("B3EEABB8EE11C2BE770B684D95219ECB"); 
      return this;
    }
    
    @Deprecated
    public a c(String param1String) {
      this.a.i(param1String);
      return this;
    }
    
    public e d() {
      return new e(this);
    }
    
    @Deprecated
    public a e(Date param1Date) {
      this.a.d(param1Date);
      return this;
    }
    
    @Deprecated
    public a f(int param1Int) {
      this.a.k(param1Int);
      return this;
    }
    
    @Deprecated
    public a g(boolean param1Boolean) {
      this.a.e(param1Boolean);
      return this;
    }
    
    public a h(Location param1Location) {
      this.a.b(param1Location);
      return this;
    }
    
    @Deprecated
    public a i(boolean param1Boolean) {
      this.a.C(param1Boolean);
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */