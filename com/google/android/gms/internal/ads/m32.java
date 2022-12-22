package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class m32 {
  private static Cipher a;
  
  private static final Object b = new Object();
  
  private static final Object c = new Object();
  
  private final SecureRandom d = null;
  
  public m32(SecureRandom paramSecureRandom) {}
  
  private static Cipher a() {
    synchronized (c) {
      if (a == null)
        a = Cipher.getInstance("AES/CBC/PKCS5Padding"); 
      return a;
    } 
  }
  
  public final byte[] b(byte[] paramArrayOfbyte, String paramString) {
    if (paramArrayOfbyte.length == 16)
      try {
        byte[] arrayOfByte = b21.b(paramString, false);
        if (arrayOfByte.length > 16) {
          ByteBuffer byteBuffer = ByteBuffer.allocate(arrayOfByte.length);
          byteBuffer.put(arrayOfByte);
          byteBuffer.flip();
          null = new byte[16];
          arrayOfByte = new byte[arrayOfByte.length - 16];
          byteBuffer.get(null);
          byteBuffer.get(arrayOfByte);
          SecretKeySpec secretKeySpec = new SecretKeySpec();
          this(paramArrayOfbyte, "AES");
          synchronized (b) {
            Cipher cipher = a();
            IvParameterSpec ivParameterSpec = new IvParameterSpec();
            this(null);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            null = a().doFinal(arrayOfByte);
            return null;
          } 
        } 
        zzej zzej = new zzej();
        this(this);
        throw zzej;
      } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        throw new zzej(this, noSuchAlgorithmException);
      } catch (InvalidKeyException invalidKeyException) {
        throw new zzej(this, invalidKeyException);
      } catch (IllegalBlockSizeException illegalBlockSizeException) {
        throw new zzej(this, illegalBlockSizeException);
      } catch (NoSuchPaddingException noSuchPaddingException) {
        throw new zzej(this, noSuchPaddingException);
      } catch (BadPaddingException badPaddingException) {
        throw new zzej(this, badPaddingException);
      } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
        throw new zzej(this, invalidAlgorithmParameterException);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw new zzej(this, illegalArgumentException);
      }  
    throw new zzej(this);
  }
  
  public final byte[] c(String paramString) {
    byte b = 0;
    try {
      byte[] arrayOfByte = b21.b(paramString, false);
      if (arrayOfByte.length == 32) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte, 4, 16);
        byte[] arrayOfByte1 = new byte[16];
        byteBuffer.get(arrayOfByte1);
        while (b < 16) {
          arrayOfByte1[b] = (byte)(byte)(arrayOfByte1[b] ^ 0x44);
          b++;
        } 
        return arrayOfByte1;
      } 
      zzej zzej = new zzej();
      this(this);
      throw zzej;
    } catch (IllegalArgumentException illegalArgumentException) {
      zzej zzej = new zzej(this, illegalArgumentException);
      throw zzej;
    } 
  }
  
  public final String d(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1.length == 16)
      try {
        SecretKeySpec secretKeySpec = new SecretKeySpec();
        this(paramArrayOfbyte1, "AES");
        synchronized (b) {
          a().init(1, secretKeySpec, (SecureRandom)null);
          paramArrayOfbyte2 = a().doFinal(paramArrayOfbyte2);
          byte[] arrayOfByte = a().getIV();
          int i = paramArrayOfbyte2.length + arrayOfByte.length;
          null = ByteBuffer.allocate(i);
          null.put(arrayOfByte).put(paramArrayOfbyte2);
          null.flip();
          paramArrayOfbyte2 = new byte[i];
          null.get(paramArrayOfbyte2);
          return b21.a(paramArrayOfbyte2, false);
        } 
      } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        throw new zzej(this, noSuchAlgorithmException);
      } catch (InvalidKeyException invalidKeyException) {
        throw new zzej(this, invalidKeyException);
      } catch (IllegalBlockSizeException illegalBlockSizeException) {
        throw new zzej(this, illegalBlockSizeException);
      } catch (NoSuchPaddingException noSuchPaddingException) {
        throw new zzej(this, noSuchPaddingException);
      } catch (BadPaddingException badPaddingException) {
        throw new zzej(this, badPaddingException);
      }  
    throw new zzej(this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */