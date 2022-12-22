package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class m51 implements s91<k51> {
  private final String a;
  
  private final nt1 b;
  
  private final hm0 c;
  
  public m51(String paramString, nt1 paramnt1, hm0 paramhm0) {
    this.a = paramString;
    this.b = paramnt1;
    this.c = paramhm0;
  }
  
  private static Bundle c(xi1 paramxi1) {
    Bundle bundle = new Bundle();
    try {
      if (paramxi1.B() != null)
        bundle.putString("sdk_version", paramxi1.B().toString()); 
    } catch (zzdnt zzdnt) {}
    try {
      if (paramxi1.A() != null)
        bundle.putString("adapter_version", paramxi1.A().toString()); 
    } catch (zzdnt zzdnt) {}
  }
  
  public final ot1<k51> a() {
    if ((new BigInteger(this.a)).equals(BigInteger.ONE)) {
      x<String> x = m0.o1;
      if (!er1.b(er2.e().<String>c(x)))
        return this.b.a(new p51(this)); 
    } 
    return dt1.h(new k51(new Bundle(), null));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */