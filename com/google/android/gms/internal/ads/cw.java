package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.d1;
import java.util.Map;

public final class cw implements yv {
  private final d1 a = q.g().r();
  
  public final void a(Map<String, String> paramMap) {
    if (paramMap.isEmpty())
      return; 
    String str = paramMap.get("gad_idless");
    if (str != null) {
      paramMap.remove("gad_idless");
      x<Boolean> x1 = m0.j0;
      if (((Boolean)er2.e().<Boolean>c(x1)).booleanValue())
        this.a.i(Boolean.parseBoolean(str)); 
    } 
    Bundle bundle = new Bundle();
    for (Map.Entry<String, String> entry : paramMap.entrySet())
      bundle.putString((String)entry.getKey(), (String)entry.getValue()); 
    x<Boolean> x = m0.i0;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      q.A().a(bundle); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */