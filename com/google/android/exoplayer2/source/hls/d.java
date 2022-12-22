package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.util.e;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class d implements j {
  private final j b;
  
  private final byte[] c;
  
  private final byte[] d;
  
  private CipherInputStream e;
  
  public d(j paramj, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.b = paramj;
    this.c = paramArrayOfbyte1;
    this.d = paramArrayOfbyte2;
  }
  
  protected Cipher a() {
    return Cipher.getInstance("AES/CBC/PKCS7Padding");
  }
  
  public void close() {
    if (this.e != null) {
      this.e = null;
      this.b.close();
    } 
  }
  
  public final Uri e0() {
    return this.b.e0();
  }
  
  public final void f0(x paramx) {
    this.b.f0(paramx);
  }
  
  public final long g0(l paraml) {
    try {
      Cipher cipher = a();
      SecretKeySpec secretKeySpec = new SecretKeySpec(this.c, "AES");
      IvParameterSpec ivParameterSpec = new IvParameterSpec(this.d);
      try {
        cipher.init(2, secretKeySpec, ivParameterSpec);
        k k = new k(this.b, paraml);
        this.e = new CipherInputStream((InputStream)k, cipher);
        k.c();
        return -1L;
      } catch (InvalidKeyException invalidKeyException) {
      
      } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {}
      throw new RuntimeException(invalidAlgorithmParameterException);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
    
    } catch (NoSuchPaddingException noSuchPaddingException) {}
    throw new RuntimeException(noSuchPaddingException);
  }
  
  public final Map<String, List<String>> getResponseHeaders() {
    return this.b.getResponseHeaders();
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    e.e(this.e);
    paramInt2 = this.e.read(paramArrayOfbyte, paramInt1, paramInt2);
    paramInt1 = paramInt2;
    if (paramInt2 < 0)
      paramInt1 = -1; 
    return paramInt1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */