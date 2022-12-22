package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public class lu1<PrimitiveT, KeyProtoT extends u52> implements mu1<PrimitiveT> {
  private final nu1<KeyProtoT> a;
  
  private final Class<PrimitiveT> b;
  
  public lu1(nu1<KeyProtoT> paramnu1, Class<PrimitiveT> paramClass) {
    if (paramnu1.e().contains(paramClass) || Void.class.equals(paramClass)) {
      this.a = paramnu1;
      this.b = paramClass;
      return;
    } 
    throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[] { paramnu1.toString(), paramClass.getName() }));
  }
  
  private final PrimitiveT g(KeyProtoT paramKeyProtoT) {
    if (!Void.class.equals(this.b)) {
      this.a.h(paramKeyProtoT);
      return this.a.b(paramKeyProtoT, this.b);
    } 
    throw new GeneralSecurityException("Cannot create a primitive for Void");
  }
  
  private final ou1<?, KeyProtoT> h() {
    return new ou1<Object, KeyProtoT>(this.a.g());
  }
  
  public final Class<PrimitiveT> a() {
    return this.b;
  }
  
  public final zzegd b(zzejr paramzzejr) {
    try {
      paramzzejr = (zzejr)h().a(paramzzejr);
      return (zzegd)zzegd.R().z(this.a.a()).x(paramzzejr.a()).y(this.a.d()).h();
    } catch (zzelo zzelo) {
      throw new GeneralSecurityException("Unexpected proto", zzelo);
    } 
  }
  
  public final u52 c(zzejr paramzzejr) {
    try {
      return (u52)h().a(paramzzejr);
    } catch (zzelo zzelo) {
      String str = this.a.g().a().getName();
      if (str.length() != 0) {
        str = "Failures parsing proto of type ".concat(str);
      } else {
        str = new String("Failures parsing proto of type ");
      } 
      throw new GeneralSecurityException(str, zzelo);
    } 
  }
  
  public final String d() {
    return this.a.a();
  }
  
  public final PrimitiveT e(u52 paramu52) {
    String str = this.a.c().getName();
    if (str.length() != 0) {
      str = "Expected proto of type ".concat(str);
    } else {
      str = new String("Expected proto of type ");
    } 
    if (this.a.c().isInstance(paramu52))
      return g((KeyProtoT)paramu52); 
    throw new GeneralSecurityException(str);
  }
  
  public final PrimitiveT f(zzejr paramzzejr) {
    try {
      return g(this.a.i(paramzzejr));
    } catch (zzelo zzelo) {
      String str = this.a.c().getName();
      if (str.length() != 0) {
        str = "Failures parsing proto of type ".concat(str);
      } else {
        str = new String("Failures parsing proto of type ");
      } 
      throw new GeneralSecurityException(str, zzelo);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */