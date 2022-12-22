package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.customevent.a;
import com.google.android.gms.ads.mediation.f;
import java.util.Map;

public final class nb extends pb {
  private static final qd b = new qd();
  
  private Map<Class<?>, ?> c;
  
  private final <NetworkExtrasT extends e, ServerParametersT extends MediationServerParameters> rb T9(String paramString) {
    try {
      b<e, MediationServerParameters> b;
      Class<?> clazz = Class.forName(paramString, false, nb.class.getClassLoader());
      if (b.class.isAssignableFrom(clazz))
        return new rc<e, MediationServerParameters>(b, (e)this.c.get(b.getAdditionalParametersType())); 
      if (f.class.isAssignableFrom((Class<?>)b))
        return new jc(b.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])); 
      if (a.class.isAssignableFrom((Class<?>)b))
        return new jc(b.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])); 
      int i = String.valueOf(paramString).length();
      StringBuilder stringBuilder = new StringBuilder();
      this(i + 64);
      stringBuilder.append("Could not instantiate mediation adapter: ");
      stringBuilder.append(paramString);
      stringBuilder.append(" (not a valid adapter).");
      cm.i(stringBuilder.toString());
      RemoteException remoteException = new RemoteException();
      this();
      throw remoteException;
    } finally {
      Exception exception = null;
    } 
  }
  
  private final rb U9(String paramString) {
    try {
    
    } finally {
      Exception exception = null;
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 43);
      stringBuilder.append("Could not instantiate mediation adapter: ");
      stringBuilder.append(paramString);
      stringBuilder.append(". ");
    } 
    throw new RemoteException();
  }
  
  public final void V9(Map<Class<?>, ?> paramMap) {
    this.c = paramMap;
  }
  
  public final boolean e2(String paramString) {
    try {
      return a.class.isAssignableFrom(Class.forName(paramString, false, nb.class.getClassLoader()));
    } finally {
      Exception exception = null;
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 80);
      stringBuilder.append("Could not load custom event implementation class: ");
      stringBuilder.append(paramString);
      stringBuilder.append(", assuming old implementation.");
      cm.i(stringBuilder.toString());
    } 
  }
  
  public final kd g3(String paramString) {
    return qd.a(paramString);
  }
  
  public final rb i5(String paramString) {
    return T9(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */