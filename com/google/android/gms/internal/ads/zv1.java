package com.google.android.gms.internal.ads;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;

public final class zv1 extends nu1<qy1> {
  zv1() {
    super(qy1.class, (pu1<?, qy1>[])new pu1[] { new yv1(gu1.class) });
  }
  
  private static boolean j() {
    try {
      Cipher.getInstance("AES/GCM-SIV/NoPadding");
      return true;
    } catch (NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException noSuchAlgorithmException) {
      return false;
    } 
  }
  
  public static void k(boolean paramBoolean) {
    if (j())
      dv1.k(new zv1(), true); 
  }
  
  public final String a() {
    return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
  }
  
  public final zzegd.zza d() {
    return zzegd.zza.c;
  }
  
  public final ru1<ty1, qy1> g() {
    return new bw1(this, ty1.class);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */