package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

final class cx1 implements h12 {
  private final String a;
  
  private final int b;
  
  private my1 c;
  
  private wx1 d;
  
  private int e;
  
  cx1(xz1 paramxz1) {
    py1 py1;
    zx1 zx1;
    String str2 = paramxz1.J();
    this.a = str2;
    if (str2.equals(jv1.b))
      try {
        py1 = py1.L(paramxz1.K(), y32.b());
        this.c = (my1)dv1.p(paramxz1);
        this.b = py1.J();
        return;
      } catch (zzelo zzelo) {
        throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", zzelo);
      }  
    if (py1.equals(jv1.a))
      try {
        zx1 = zx1.M(zzelo.K(), y32.b());
        this.d = (wx1)dv1.p((xz1)zzelo);
        this.e = zx1.J().J();
        int i = zx1.K().J();
        this.b = this.e + i;
        return;
      } catch (zzelo zzelo1) {
        throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", zzelo1);
      }  
    String str1 = String.valueOf(zx1);
    if (str1.length() != 0) {
      str1 = "unsupported AEAD DEM key type: ".concat(str1);
    } else {
      str1 = new String("unsupported AEAD DEM key type: ");
    } 
    throw new GeneralSecurityException(str1);
  }
  
  public final gu1 a(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length == this.b) {
      my1 my11;
      if (this.a.equals(jv1.b)) {
        my11 = (my1)((my1.a)my1.O().r(this.c)).y(zzejr.zzi(paramArrayOfbyte, 0, this.b)).h();
        return dv1.<gu1>h(this.a, my11, gu1.class);
      } 
      if (this.a.equals(jv1.a)) {
        byte[] arrayOfByte2 = Arrays.copyOfRange((byte[])my11, 0, this.e);
        byte[] arrayOfByte1 = Arrays.copyOfRange((byte[])my11, this.e, this.b);
        ay1 ay1 = (ay1)((ay1.a)ay1.R().r(this.d.Q())).z(zzejr.zzt(arrayOfByte2)).h();
        nz1 nz1 = (nz1)((nz1.a)nz1.Q().r(this.d.R())).x(zzejr.zzt(arrayOfByte1)).h();
        wx1 wx11 = (wx1)wx1.S().z(this.d.J()).x(ay1).y(nz1).h();
        return dv1.<gu1>h(this.a, wx11, gu1.class);
      } 
      throw new GeneralSecurityException("unknown DEM key type");
    } 
    throw new GeneralSecurityException("Symmetric key has incorrect length");
  }
  
  public final int b() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */