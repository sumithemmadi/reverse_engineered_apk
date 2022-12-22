package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class t12<T_WRAPPER extends s12<T_ENGINE>, T_ENGINE> {
  private static final Logger a = Logger.getLogger(t12.class.getName());
  
  private static final List<Provider> b;
  
  public static final t12<v12, Cipher> c = new t12((T_WRAPPER)new v12());
  
  public static final t12<z12, Mac> d = new t12((T_WRAPPER)new z12());
  
  private static final t12<b22, Signature> e = new t12((T_WRAPPER)new b22());
  
  private static final t12<y12, MessageDigest> f = new t12((T_WRAPPER)new y12());
  
  public static final t12<u12, KeyAgreement> g = new t12((T_WRAPPER)new u12());
  
  public static final t12<w12, KeyPairGenerator> h = new t12((T_WRAPPER)new w12());
  
  public static final t12<x12, KeyFactory> i = new t12((T_WRAPPER)new x12());
  
  private T_WRAPPER j;
  
  private List<Provider> k;
  
  private boolean l;
  
  private t12(T_WRAPPER paramT_WRAPPER) {
    this.j = paramT_WRAPPER;
    this.k = b;
    this.l = true;
  }
  
  public final T_ENGINE a(String paramString) {
    Iterator<Provider> iterator = this.k.iterator();
    Exception exception = null;
    while (iterator.hasNext()) {
      Provider provider = iterator.next();
      try {
        return (T_ENGINE)this.j.a(paramString, provider);
      } catch (Exception exception1) {
        if (exception == null)
          exception = exception1; 
      } 
    } 
    if (this.l)
      return this.j.a(paramString, null); 
    GeneralSecurityException generalSecurityException = new GeneralSecurityException("No good Provider found.", exception);
    throw generalSecurityException;
  }
  
  static {
    if (l22.a()) {
      ArrayList<Provider> arrayList = new ArrayList();
      for (byte b = 0; b < 2; b++) {
        (new String[2])[0] = "GmsCore_OpenSSL";
        (new String[2])[1] = "AndroidOpenSSL";
        String str = (new String[2])[b];
        Provider provider = Security.getProvider(str);
        if (provider != null) {
          arrayList.add(provider);
        } else {
          a.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[] { str }));
        } 
      } 
      b = arrayList;
    } else {
      b = new ArrayList<Provider>();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */