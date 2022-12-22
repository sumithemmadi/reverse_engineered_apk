package com.google.ads.mediation.customevent;

import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.MediationServerParameters.a;

public final class c extends MediationServerParameters {
  @a(name = "label", required = true)
  public String a;
  
  @a(name = "class_name", required = true)
  public String b;
  
  @a(name = "parameter", required = false)
  public String c = null;
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/mediation/customevent/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */