package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

public final class e22 implements ox1 {
  private final ThreadLocal<Mac> a;
  
  private final String b;
  
  private final Key c;
  
  private final int d;
  
  public e22(String paramString, Key paramKey) {
    h22 h22 = new h22(this);
    this.a = h22;
    this.b = paramString;
    this.c = paramKey;
    if ((paramKey.getEncoded()).length >= 16) {
      paramString.hashCode();
      byte b = -1;
      switch (paramString.hashCode()) {
        case 392317873:
          if (!paramString.equals("HMACSHA512"))
            break; 
          b = 3;
          break;
        case 392316170:
          if (!paramString.equals("HMACSHA384"))
            break; 
          b = 2;
          break;
        case 392315118:
          if (!paramString.equals("HMACSHA256"))
            break; 
          b = 1;
          break;
        case -1823053428:
          if (!paramString.equals("HMACSHA1"))
            break; 
          b = 0;
          break;
      } 
      switch (b) {
        default:
          if (paramString.length() != 0) {
            paramString = "unknown Hmac algorithm: ".concat(paramString);
          } else {
            paramString = new String("unknown Hmac algorithm: ");
          } 
          throw new NoSuchAlgorithmException(paramString);
        case 3:
          this.d = 64;
          break;
        case 2:
          this.d = 48;
          break;
        case 1:
          this.d = 32;
          break;
        case 0:
          this.d = 20;
          break;
      } 
      h22.get();
      return;
    } 
    throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
  }
  
  public final byte[] a(byte[] paramArrayOfbyte, int paramInt) {
    if (paramInt <= this.d) {
      ((Mac)this.a.get()).update(paramArrayOfbyte);
      return Arrays.copyOf(((Mac)this.a.get()).doFinal(), paramInt);
    } 
    throw new InvalidAlgorithmParameterException("tag size too big");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/e22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */