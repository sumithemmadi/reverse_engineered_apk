package com.google.ads.mediation;

@Deprecated
public interface b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends MediationServerParameters> {
  void destroy();
  
  Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();
  
  Class<SERVER_PARAMETERS> getServerParametersType();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/ads/mediation/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */