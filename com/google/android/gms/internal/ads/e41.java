package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class e41 {
  private static boolean a = false;
  
  private static MessageDigest b;
  
  private static final Object c = new Object();
  
  private static final Object d = new Object();
  
  static CountDownLatch e = new CountDownLatch(1);
  
  private static zzcf$zza a(zzcf$zza.zzd paramzzd) {
    zzcf$zza.a a = zzcf$zza.z0();
    a.Q(paramzzd.zzv());
    return (zzcf$zza)a.h();
  }
  
  private static Vector<byte[]> c(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte == null || paramArrayOfbyte.length <= 0)
      return null; 
    int i = (paramArrayOfbyte.length + 255 - 1) / 255;
    Vector<byte[]> vector = new Vector();
    paramInt = 0;
    while (paramInt < i) {
      int j = paramInt * 255;
      try {
        int k;
        if (paramArrayOfbyte.length - j > 255) {
          k = j + 255;
        } else {
          k = paramArrayOfbyte.length;
        } 
        vector.add(Arrays.copyOfRange(paramArrayOfbyte, j, k));
        paramInt++;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        return null;
      } 
    } 
    return vector;
  }
  
  private static byte[] d(byte[] paramArrayOfbyte, String paramString, boolean paramBoolean) {
    if (paramBoolean) {
      c = 'ï';
    } else {
      c = 'ÿ';
    } 
    byte[] arrayOfByte1 = paramArrayOfbyte;
    if (paramArrayOfbyte.length > c)
      arrayOfByte1 = a(zzcf$zza.zzd.u).g(); 
    if (arrayOfByte1.length < c) {
      paramArrayOfbyte = new byte[c - arrayOfByte1.length];
      (new SecureRandom()).nextBytes(paramArrayOfbyte);
      paramArrayOfbyte = ByteBuffer.allocate(c + 1).put((byte)arrayOfByte1.length).put(arrayOfByte1).put(paramArrayOfbyte).array();
    } else {
      paramArrayOfbyte = ByteBuffer.allocate(c + 1).put((byte)arrayOfByte1.length).put(arrayOfByte1).array();
    } 
    arrayOfByte1 = paramArrayOfbyte;
    if (paramBoolean) {
      arrayOfByte1 = e(paramArrayOfbyte);
      arrayOfByte1 = ByteBuffer.allocate(256).put(arrayOfByte1).put(paramArrayOfbyte).array();
    } 
    byte[] arrayOfByte2 = new byte[256];
    h71[] arrayOfH71 = (new f51()).N2;
    int i = arrayOfH71.length;
    for (char c = Character.MIN_VALUE; c < i; c++)
      arrayOfH71[c].a(arrayOfByte1, arrayOfByte2); 
    if (paramString != null && paramString.length() > 0) {
      String str = paramString;
      if (paramString.length() > 32)
        str = paramString.substring(0, 32); 
      (new t22(str.getBytes("UTF-8"))).a(arrayOfByte2);
    } 
    return arrayOfByte2;
  }
  
  public static byte[] e(byte[] paramArrayOfbyte) {
    synchronized (c) {
      MessageDigest messageDigest = g();
      if (messageDigest != null) {
        messageDigest.reset();
        messageDigest.update(paramArrayOfbyte);
        paramArrayOfbyte = b.digest();
        return paramArrayOfbyte;
      } 
      NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException();
      this("Cannot compute hash");
      throw noSuchAlgorithmException;
    } 
  }
  
  static void f() {
    synchronized (d) {
      if (!a) {
        a = true;
        Thread thread = new Thread();
        g61 g61 = new g61();
        this(null);
        this(g61);
        thread.start();
      } 
      return;
    } 
  }
  
  private static MessageDigest g() {
    boolean bool;
    f();
    try {
      bool = e.await(2L, TimeUnit.SECONDS);
    } catch (InterruptedException interruptedException) {
      bool = false;
    } 
    if (!bool)
      return null; 
    MessageDigest messageDigest = b;
    return (messageDigest == null) ? null : messageDigest;
  }
  
  static String h(zzcf$zza paramzzcf$zza, String paramString) {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2 = paramzzcf$zza.g();
    x<Boolean> x = m0.Y1;
    if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      if (ca2.a != null) {
        if (paramString != null) {
          arrayOfByte1 = paramString.getBytes();
        } else {
          arrayOfByte1 = new byte[0];
        } 
        arrayOfByte1 = ca2.a.a(arrayOfByte2, arrayOfByte1);
        arrayOfByte1 = ((ri0)ri0.O().y(zzejr.zzt(arrayOfByte1)).x(zzcm.d).h()).g();
      } else {
        throw new GeneralSecurityException();
      } 
    } else {
      Vector<byte[]> vector = c(arrayOfByte2, 255);
      if (vector == null || vector.size() == 0) {
        byte[] arrayOfByte = d(a(zzcf$zza.zzd.u).g(), paramString, true);
        return b21.a(arrayOfByte, true);
      } 
      ri0.a a = ri0.O();
      Iterator<byte> iterator = vector.iterator();
      while (iterator.hasNext())
        a.y(zzejr.zzt(d((byte[])iterator.next(), paramString, false))); 
      a.z(zzejr.zzt(e(arrayOfByte2)));
      arrayOfByte1 = ((ri0)a.h()).g();
    } 
    return b21.a(arrayOfByte1, true);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/e41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */