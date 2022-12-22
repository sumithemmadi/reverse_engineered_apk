package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

final class hv1 {
  private static final Charset a = Charset.forName("UTF-8");
  
  public static f02 a(c02 paramc02) {
    f02.b b = f02.M().y(paramc02.J());
    for (c02.b b1 : paramc02.K())
      b.x((f02.a)f02.a.P().A(b1.M().O()).x(b1.J()).y(b1.K()).z(b1.N()).h()); 
    return (f02)b.h();
  }
  
  public static void b(c02 paramc02) {
    int i = paramc02.J();
    Iterator<c02.b> iterator = paramc02.K().iterator();
    byte b = 0;
    boolean bool1 = false;
    boolean bool2 = true;
    while (iterator.hasNext()) {
      c02.b b1 = iterator.next();
      if (b1.J() == zzege.c) {
        if (b1.L()) {
          if (b1.K() != zzegx.b) {
            if (b1.J() != zzege.b) {
              boolean bool = bool1;
              if (b1.N() == i)
                if (!bool1) {
                  bool = true;
                } else {
                  throw new GeneralSecurityException("keyset contains multiple primary keys");
                }  
              if (b1.M().Q() != zzegd.zza.e)
                bool2 = false; 
              b++;
              bool1 = bool;
              continue;
            } 
            throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[] { Integer.valueOf(b1.N()) }));
          } 
          throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[] { Integer.valueOf(b1.N()) }));
        } 
        throw new GeneralSecurityException(String.format("key %d has no key data", new Object[] { Integer.valueOf(b1.N()) }));
      } 
    } 
    if (b != 0) {
      if (bool1 || bool2)
        return; 
      throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
    } 
    GeneralSecurityException generalSecurityException = new GeneralSecurityException("keyset must contain at least one ENABLED key");
    throw generalSecurityException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */