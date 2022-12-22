package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.r6;
import com.google.android.gms.internal.ads.tw;
import com.google.android.gms.internal.ads.wl;
import java.util.Map;

final class y extends tw {
  y(x paramx, int paramInt, String paramString, r6 paramr6, q7 paramq7, byte[] paramArrayOfbyte, Map paramMap, wl paramwl) {
    super(paramInt, paramString, paramr6, paramq7);
  }
  
  public final byte[] B() {
    byte[] arrayOfByte1 = this.t;
    byte[] arrayOfByte2 = arrayOfByte1;
    if (arrayOfByte1 == null)
      arrayOfByte2 = super.B(); 
    return arrayOfByte2;
  }
  
  protected final void I(String paramString) {
    this.v.q(paramString);
    super.I(paramString);
  }
  
  public final Map<String, String> a() {
    Map<String, String> map1 = this.u;
    Map<String, String> map2 = map1;
    if (map1 == null)
      map2 = super.a(); 
    return map2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */