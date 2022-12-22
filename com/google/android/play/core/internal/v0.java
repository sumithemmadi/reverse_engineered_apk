package com.google.android.play.core.internal;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class v0 {
  static Pair<ByteBuffer, Long> a(RandomAccessFile paramRandomAccessFile) {
    if (paramRandomAccessFile.length() < 22L)
      return null; 
    Pair<ByteBuffer, Long> pair = h(paramRandomAccessFile, 0);
    return (pair != null) ? pair : h(paramRandomAccessFile, 65535);
  }
  
  public static long b(ByteBuffer paramByteBuffer) {
    i(paramByteBuffer);
    return j(paramByteBuffer, paramByteBuffer.position() + 16);
  }
  
  public static void c(ByteBuffer paramByteBuffer, long paramLong) {
    i(paramByteBuffer);
    int i = paramByteBuffer.position();
    if (paramLong >= 0L && paramLong <= 4294967295L) {
      paramByteBuffer.putInt(paramByteBuffer.position() + i + 16, (int)paramLong);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder(47);
    stringBuilder.append("uint32 value of out range: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static long d(ByteBuffer paramByteBuffer) {
    i(paramByteBuffer);
    return j(paramByteBuffer, paramByteBuffer.position() + 12);
  }
  
  public static String e(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder(paramString1.length() + 1 + String.valueOf(paramString2).length());
    stringBuilder.append(paramString1);
    stringBuilder.append(":");
    stringBuilder.append(paramString2);
    return stringBuilder.toString();
  }
  
  public static String f(String paramString1, String paramString2, String paramString3) {
    StringBuilder stringBuilder = new StringBuilder(paramString1.length() + 2 + String.valueOf(paramString2).length() + String.valueOf(paramString3).length());
    stringBuilder.append(paramString1);
    stringBuilder.append(":");
    stringBuilder.append(paramString2);
    stringBuilder.append(":");
    stringBuilder.append(paramString3);
    return stringBuilder.toString();
  }
  
  public static X509Certificate[][] g(String paramString) {
    RandomAccessFile randomAccessFile = new RandomAccessFile(paramString, "r");
    try {
      Pair<ByteBuffer, Long> pair = a(randomAccessFile);
      if (pair != null) {
        f f2;
        ByteBuffer byteBuffer = (ByteBuffer)pair.first;
        long l1 = ((Long)pair.second).longValue();
        long l2 = -20L + l1;
        if (l2 >= 0L) {
          randomAccessFile.seek(l2);
          if (randomAccessFile.readInt() == 1347094023) {
            f2 = new f();
            this("ZIP64 APK not supported");
            throw f2;
          } 
        } 
        l2 = b((ByteBuffer)f2);
        if (l2 < l1) {
          if (d((ByteBuffer)f2) + l2 == l1) {
            if (l2 >= 32L) {
              ByteBuffer byteBuffer1 = ByteBuffer.allocate(24);
              ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
              byteBuffer1.order(byteOrder);
              randomAccessFile.seek(l2 - byteBuffer1.capacity());
              randomAccessFile.readFully(byteBuffer1.array(), byteBuffer1.arrayOffset(), byteBuffer1.capacity());
              if (byteBuffer1.getLong(8) == 2334950737559900225L && byteBuffer1.getLong(16) == 3617552046287187010L) {
                byte b = 0;
                long l3 = byteBuffer1.getLong(0);
                if (l3 >= byteBuffer1.capacity() && l3 <= 2147483639L) {
                  int i = (int)(8L + l3);
                  long l4 = l2 - i;
                  if (l4 >= 0L) {
                    byteBuffer1 = ByteBuffer.allocate(i);
                    byteBuffer1.order(byteOrder);
                    randomAccessFile.seek(l4);
                    randomAccessFile.readFully(byteBuffer1.array(), byteBuffer1.arrayOffset(), byteBuffer1.capacity());
                    long l5 = byteBuffer1.getLong(0);
                    if (l5 == l3) {
                      Pair pair1 = Pair.create(byteBuffer1, Long.valueOf(l4));
                      byteBuffer1 = (ByteBuffer)pair1.first;
                      l3 = ((Long)pair1.second).longValue();
                      if (byteBuffer1.order() == byteOrder) {
                        i = byteBuffer1.capacity() - 24;
                        if (i >= 8) {
                          int j = byteBuffer1.capacity();
                          if (i <= byteBuffer1.capacity()) {
                            u0 u0;
                            j = byteBuffer1.limit();
                            int k = byteBuffer1.position();
                            try {
                              byteBuffer1.position(0);
                              byteBuffer1.limit(i);
                              byteBuffer1.position(8);
                              ByteBuffer byteBuffer2 = byteBuffer1.slice();
                              byteBuffer2.order(byteBuffer1.order());
                              byteBuffer1.position(0);
                              byteBuffer1.limit(j);
                              byteBuffer1.position(k);
                              while (byteBuffer2.hasRemaining()) {
                                b++;
                                if (byteBuffer2.remaining() >= 8) {
                                  l5 = byteBuffer2.getLong();
                                  if (l5 >= 4L && l5 <= 2147483647L) {
                                    i = (int)l5;
                                    j = byteBuffer2.position();
                                    if (i <= byteBuffer2.remaining()) {
                                      if (byteBuffer2.getInt() == 1896449818) {
                                        byteBuffer2 = r(byteBuffer2, i - 4);
                                        u0 = new u0();
                                        return arrayOfX509Certificate;
                                      } 
                                      byteBuffer2.position(j + i);
                                      continue;
                                    } 
                                    f2 = new f();
                                    j = byteBuffer2.remaining();
                                    StringBuilder stringBuilder10 = new StringBuilder();
                                    this(91);
                                    stringBuilder10.append("APK Signing Block entry #");
                                    stringBuilder10.append(b);
                                    stringBuilder10.append(" size out of range: ");
                                    stringBuilder10.append(i);
                                    stringBuilder10.append(", available: ");
                                    stringBuilder10.append(j);
                                    this(stringBuilder10.toString());
                                    throw f2;
                                  } 
                                  f f5 = new f();
                                  StringBuilder stringBuilder9 = new StringBuilder();
                                  this(76);
                                  stringBuilder9.append("APK Signing Block entry #");
                                  stringBuilder9.append(b);
                                  stringBuilder9.append(" size out of range: ");
                                  stringBuilder9.append(l5);
                                  this(stringBuilder9.toString());
                                  throw f5;
                                } 
                                f f4 = new f();
                                StringBuilder stringBuilder8 = new StringBuilder();
                                this(70);
                                stringBuilder8.append("Insufficient data to read size of APK Signing Block entry #");
                                stringBuilder8.append(b);
                                this(stringBuilder8.toString());
                                throw f4;
                              } 
                              f2 = new f();
                              this("No APK Signature Scheme v2 block in APK Signing Block");
                              throw f2;
                            } finally {
                              u0.position(0);
                              u0.limit(j);
                              u0.position(k);
                            } 
                          } 
                          IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
                          StringBuilder stringBuilder7 = new StringBuilder();
                          this(41);
                          stringBuilder7.append("end > capacity: ");
                          stringBuilder7.append(i);
                          stringBuilder7.append(" > ");
                          stringBuilder7.append(j);
                          this(stringBuilder7.toString());
                          throw illegalArgumentException2;
                        } 
                        IllegalArgumentException illegalArgumentException1 = new IllegalArgumentException();
                        StringBuilder stringBuilder6 = new StringBuilder();
                        this(38);
                        stringBuilder6.append("end < start: ");
                        stringBuilder6.append(i);
                        stringBuilder6.append(" < ");
                        stringBuilder6.append(8);
                        this(stringBuilder6.toString());
                        throw illegalArgumentException1;
                      } 
                      IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                      this("ByteBuffer byte order must be little endian");
                      throw illegalArgumentException;
                    } 
                    f2 = new f();
                    StringBuilder stringBuilder5 = new StringBuilder();
                    this(103);
                    stringBuilder5.append("APK Signing Block sizes in header and footer do not match: ");
                    stringBuilder5.append(l5);
                    stringBuilder5.append(" vs ");
                    stringBuilder5.append(l3);
                    this(stringBuilder5.toString());
                    throw f2;
                  } 
                  f f3 = new f();
                  StringBuilder stringBuilder4 = new StringBuilder();
                  this(59);
                  stringBuilder4.append("APK Signing Block offset out of range: ");
                  stringBuilder4.append(l4);
                  this(stringBuilder4.toString());
                  throw f3;
                } 
                f2 = new f();
                StringBuilder stringBuilder3 = new StringBuilder();
                this(57);
                stringBuilder3.append("APK Signing Block size out of range: ");
                stringBuilder3.append(l3);
                this(stringBuilder3.toString());
                throw f2;
              } 
              f2 = new f();
              this("No APK Signing Block before ZIP Central Directory");
              throw f2;
            } 
            f2 = new f();
            StringBuilder stringBuilder2 = new StringBuilder();
            this(87);
            stringBuilder2.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
            stringBuilder2.append(l2);
            this(stringBuilder2.toString());
            throw f2;
          } 
          f2 = new f();
          this("ZIP Central Directory is not immediately followed by End of Central Directory");
          throw f2;
        } 
        f f1 = new f();
        StringBuilder stringBuilder1 = new StringBuilder();
        this(122);
        stringBuilder1.append("ZIP Central Directory offset out of range: ");
        stringBuilder1.append(l2);
        stringBuilder1.append(". ZIP End of Central Directory offset: ");
        stringBuilder1.append(l1);
        this(stringBuilder1.toString());
        throw f1;
      } 
      f f = new f();
      long l = iOException.length();
      StringBuilder stringBuilder = new StringBuilder();
      this(102);
      stringBuilder.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
      stringBuilder.append(l);
      stringBuilder.append(" bytes");
      this(stringBuilder.toString());
      throw f;
    } finally {
      try {
        iOException.close();
      } catch (IOException iOException1) {}
    } 
  }
  
  private static Pair<ByteBuffer, Long> h(RandomAccessFile paramRandomAccessFile, int paramInt) {
    long l = paramRandomAccessFile.length();
    if (l < 22L)
      return null; 
    ByteBuffer byteBuffer = ByteBuffer.allocate((int)Math.min(paramInt, -22L + l) + 22);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    l -= byteBuffer.capacity();
    paramRandomAccessFile.seek(l);
    paramRandomAccessFile.readFully(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
    i(byteBuffer);
    paramInt = byteBuffer.capacity();
    if (paramInt >= 22) {
      int i = paramInt - 22;
      int j = Math.min(i, 65535);
      paramInt = 0;
      while (true) {
        if (paramInt < j) {
          int k = i - paramInt;
          if (byteBuffer.getInt(k) == 101010256 && (char)byteBuffer.getShort(k + 20) == paramInt) {
            paramInt = k;
            break;
          } 
          paramInt++;
          continue;
        } 
        paramInt = -1;
        break;
      } 
      if (paramInt == -1)
        return null; 
      byteBuffer.position(paramInt);
      ByteBuffer byteBuffer1 = byteBuffer.slice();
      byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
      return Pair.create(byteBuffer1, Long.valueOf(l + paramInt));
    } 
    paramInt = -1;
    break;
  }
  
  private static void i(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.order() == ByteOrder.LITTLE_ENDIAN)
      return; 
    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
  }
  
  private static long j(ByteBuffer paramByteBuffer, int paramInt) {
    return paramByteBuffer.getInt(paramInt) & 0xFFFFFFFFL;
  }
  
  private static X509Certificate[][] k(FileChannel paramFileChannel, u0 paramu0) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    ArrayList<X509Certificate[]> arrayList = new ArrayList();
    try {
      CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
      try {
        StringBuilder stringBuilder;
        ByteBuffer byteBuffer = s(u0.a(paramu0));
        byte b = 0;
        while (byteBuffer.hasRemaining()) {
          b++;
          try {
            arrayList.add(l(s(byteBuffer), (Map)hashMap, certificateFactory));
            continue;
          } catch (IOException iOException) {
            continue;
          } catch (BufferUnderflowException bufferUnderflowException) {
            continue;
          } catch (SecurityException securityException) {}
          stringBuilder = new StringBuilder(48);
          stringBuilder.append("Failed to parse/verify signer #");
          stringBuilder.append(b);
          stringBuilder.append(" block");
          throw new SecurityException(stringBuilder.toString(), securityException);
        } 
        if (b > 0) {
          if (!hashMap.isEmpty()) {
            m((Map)hashMap, (FileChannel)securityException, u0.b((u0)stringBuilder), u0.c((u0)stringBuilder), u0.d((u0)stringBuilder), u0.e((u0)stringBuilder));
            return arrayList.<X509Certificate[]>toArray(new X509Certificate[arrayList.size()][]);
          } 
          throw new SecurityException("No content digests found");
        } 
        throw new SecurityException("No signers found");
      } catch (IOException iOException) {
        throw new SecurityException("Failed to read list of signers", iOException);
      } 
    } catch (CertificateException certificateException) {
      RuntimeException runtimeException = new RuntimeException("Failed to obtain X.509 CertificateFactory", certificateException);
      throw runtimeException;
    } 
  }
  
  private static X509Certificate[] l(ByteBuffer paramByteBuffer, Map<Integer, byte[]> paramMap, CertificateFactory paramCertificateFactory) {
    Pair pair;
    String str1;
    ByteBuffer byteBuffer3;
    ByteBuffer byteBuffer1 = s(paramByteBuffer);
    ByteBuffer byteBuffer2 = s(paramByteBuffer);
    byte[] arrayOfByte1 = t(paramByteBuffer);
    ArrayList<Integer> arrayList = new ArrayList();
    AlgorithmParameterSpec algorithmParameterSpec2 = null;
    byte[] arrayOfByte2 = null;
    int i = -1;
    int j = 0;
    while (byteBuffer2.hasRemaining()) {
      int k = j + 1;
      try {
        paramByteBuffer = s(byteBuffer2);
        if (paramByteBuffer.remaining() >= 8) {
          int m = paramByteBuffer.getInt();
          arrayList.add(Integer.valueOf(m));
          if (m != 513 && m != 514 && m != 769) {
            switch (m) {
              case 257:
              case 258:
              case 259:
              case 260:
                if (i != -1) {
                  int n = o(m);
                  int i1 = o(i);
                  j = k;
                  if (n != 1) {
                    if (i1 != 1) {
                      j = k;
                      break;
                    } 
                  } else {
                    break;
                  } 
                } 
                arrayOfByte2 = t(paramByteBuffer);
                i = m;
                j = k;
                break;
            } 
            continue;
          } 
        } 
        SecurityException securityException1 = new SecurityException();
        this("Signature record too short");
        throw securityException1;
      } catch (IOException iOException) {
        StringBuilder stringBuilder1 = new StringBuilder(45);
        stringBuilder1.append("Failed to parse signature record #");
        stringBuilder1.append(k);
        throw new SecurityException(stringBuilder1.toString(), iOException);
      } catch (BufferUnderflowException bufferUnderflowException) {
        continue;
      } 
    } 
    if (i == -1) {
      SecurityException securityException1 = new SecurityException();
      if (j == 0) {
        this("No signatures found");
        throw securityException1;
      } 
      this("No supported signatures found");
      throw securityException1;
    } 
    if (i != 513 && i != 514) {
      if (i != 769) {
        String str;
        switch (i) {
          default:
            str = String.valueOf(Long.toHexString(i));
            if (str.length() != 0) {
              str = "Unknown signature algorithm: 0x".concat(str);
            } else {
              str = new String("Unknown signature algorithm: 0x");
            } 
            throw new IllegalArgumentException(str);
          case 257:
          case 258:
          case 259:
          case 260:
            break;
        } 
        str1 = "RSA";
      } else {
        str1 = "DSA";
      } 
    } else {
      str1 = "EC";
    } 
    if (i != 513) {
      if (i != 514) {
        if (i != 769) {
          String str6;
          Pair pair3;
          String str5;
          Pair pair2;
          String str4;
          Pair pair1;
          String str3;
          PSSParameterSpec pSSParameterSpec;
          switch (i) {
            default:
              str6 = String.valueOf(Long.toHexString(i));
              if (str6.length() != 0) {
                str6 = "Unknown signature algorithm: 0x".concat(str6);
              } else {
                str6 = new String("Unknown signature algorithm: 0x");
              } 
              throw new IllegalArgumentException(str6);
            case 260:
              str6 = "SHA512withRSA";
              pair3 = Pair.create(str6, null);
            case 259:
              str5 = "SHA256withRSA";
              pair2 = Pair.create(str5, null);
            case 258:
              pSSParameterSpec = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
              str4 = "SHA512withRSA/PSS";
              pair1 = Pair.create(str4, pSSParameterSpec);
              break;
            case 257:
              pSSParameterSpec = new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
              str3 = "SHA256withRSA/PSS";
              pair = Pair.create(str3, pSSParameterSpec);
              break;
          } 
        } else {
          String str = "SHA256withDSA";
          pair = Pair.create(str, null);
        } 
      } else {
        String str = "SHA512withECDSA";
        pair = Pair.create(str, null);
      } 
    } else {
      String str = "SHA256withECDSA";
      pair = Pair.create(str, null);
    } 
    String str2 = (String)pair.first;
    AlgorithmParameterSpec algorithmParameterSpec1 = (AlgorithmParameterSpec)pair.second;
    try {
      KeyFactory keyFactory = KeyFactory.getInstance(str1);
      X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec();
      this(arrayOfByte1);
      PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
      Signature signature = Signature.getInstance(str2);
      signature.initVerify(publicKey);
      if (algorithmParameterSpec1 != null)
        signature.setParameter(algorithmParameterSpec1); 
      signature.update(byteBuffer1);
      boolean bool = signature.verify(arrayOfByte2);
      if (bool) {
        StringBuilder stringBuilder1;
        byteBuffer1.clear();
        ByteBuffer byteBuffer = s(byteBuffer1);
        ArrayList<Integer> arrayList1 = new ArrayList();
        j = 0;
        algorithmParameterSpec1 = algorithmParameterSpec2;
        while (byteBuffer.hasRemaining()) {
          int k = j + 1;
          try {
            byteBuffer3 = s(byteBuffer);
            if (byteBuffer3.remaining() >= 8) {
              int m = byteBuffer3.getInt();
              arrayList1.add(Integer.valueOf(m));
              j = k;
              if (m == i) {
                byte[] arrayOfByte = t(byteBuffer3);
                j = k;
              } 
              continue;
            } 
            IOException iOException = new IOException();
            this("Record too short");
            throw iOException;
          } catch (IOException iOException) {
            continue;
          } catch (BufferUnderflowException bufferUnderflowException) {}
          stringBuilder1 = new StringBuilder(42);
          stringBuilder1.append("Failed to parse digest record #");
          stringBuilder1.append(k);
          throw new IOException(stringBuilder1.toString(), bufferUnderflowException);
        } 
        if (arrayList.equals(arrayList1)) {
          i = o(i);
          byte[] arrayOfByte = (byte[])stringBuilder1.put(Integer.valueOf(i), bufferUnderflowException);
          if (arrayOfByte == null || MessageDigest.isEqual(arrayOfByte, (byte[])bufferUnderflowException)) {
            StringBuilder stringBuilder2;
            ByteBuffer byteBuffer4 = s(byteBuffer1);
            ArrayList<g> arrayList2 = new ArrayList();
            i = 0;
            while (byteBuffer4.hasRemaining()) {
              i++;
              arrayOfByte = t(byteBuffer4);
              try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
                this(arrayOfByte);
                X509Certificate x509Certificate = (X509Certificate)paramCertificateFactory.generateCertificate(byteArrayInputStream);
                arrayList2.add(new g(x509Certificate, arrayOfByte));
              } catch (CertificateException certificateException) {
                stringBuilder2 = new StringBuilder(41);
                stringBuilder2.append("Failed to decode certificate #");
                stringBuilder2.append(i);
                throw new SecurityException(stringBuilder2.toString(), certificateException);
              } 
            } 
            if (!stringBuilder2.isEmpty()) {
              if (Arrays.equals(arrayOfByte1, ((X509Certificate)stringBuilder2.get(0)).getPublicKey().getEncoded()))
                return (X509Certificate[])stringBuilder2.toArray((Object[])new X509Certificate[stringBuilder2.size()]); 
              throw new SecurityException("Public key mismatch between certificate and signature record");
            } 
            throw new SecurityException("No certificates listed");
          } 
          throw new SecurityException(p(i).concat(" contents digest does not match the digest specified by a preceding signer"));
        } 
        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
      } 
      throw new SecurityException(String.valueOf(byteBuffer3).concat(" signature did not verify"));
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
    
    } catch (InvalidKeySpecException invalidKeySpecException) {
    
    } catch (InvalidKeyException invalidKeyException) {
    
    } catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
    
    } catch (SignatureException signatureException) {}
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(byteBuffer3).length() + 27);
    stringBuilder.append("Failed to verify ");
    stringBuilder.append((String)byteBuffer3);
    stringBuilder.append(" signature");
    SecurityException securityException = new SecurityException(stringBuilder.toString(), signatureException);
    throw securityException;
  }
  
  private static void m(Map<Integer, byte[]> paramMap, FileChannel paramFileChannel, long paramLong1, long paramLong2, long paramLong3, ByteBuffer paramByteBuffer) {
    if (!paramMap.isEmpty()) {
      t0 t02 = new t0(paramFileChannel, 0L, paramLong1);
      t0 t01 = new t0(paramFileChannel, paramLong2, paramLong3 - paramLong2);
      paramByteBuffer = paramByteBuffer.duplicate();
      paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      c(paramByteBuffer, paramLong1);
      w w = new w(paramByteBuffer);
      int i = paramMap.size();
      int[] arrayOfInt = new int[i];
      Iterator iterator = paramMap.keySet().iterator();
      int j = 0;
      int k;
      for (k = 0; iterator.hasNext(); k++)
        arrayOfInt[k] = ((Integer)iterator.next()).intValue(); 
      try {
        byte[][] arrayOfByte = n(arrayOfInt, new o0[] { (o0)t02, (o0)t01, (o0)w });
        k = j;
        while (k < i) {
          j = arrayOfInt[k];
          if (MessageDigest.isEqual(paramMap.get(Integer.valueOf(j)), arrayOfByte[k])) {
            k++;
            continue;
          } 
          throw new SecurityException(p(j).concat(" digest of contents did not verify"));
        } 
        return;
      } catch (DigestException digestException) {
        throw new SecurityException("Failed to compute digest(s) of contents", digestException);
      } 
    } 
    SecurityException securityException = new SecurityException("No digests provided");
    throw securityException;
  }
  
  private static byte[][] n(int[] paramArrayOfint, o0[] paramArrayOfo0) {
    // Byte code:
    //   0: lconst_0
    //   1: lstore_2
    //   2: iconst_0
    //   3: istore #4
    //   5: iload #4
    //   7: iconst_3
    //   8: if_icmpge -> 37
    //   11: lload_2
    //   12: aload_1
    //   13: iload #4
    //   15: aaload
    //   16: invokeinterface a : ()J
    //   21: ldc2_w 1048575
    //   24: ladd
    //   25: ldc2_w 1048576
    //   28: ldiv
    //   29: ladd
    //   30: lstore_2
    //   31: iinc #4, 1
    //   34: goto -> 5
    //   37: lload_2
    //   38: ldc2_w 2097151
    //   41: lcmp
    //   42: ifge -> 579
    //   45: lload_2
    //   46: l2i
    //   47: istore #5
    //   49: aload_0
    //   50: arraylength
    //   51: anewarray [B
    //   54: astore #6
    //   56: iconst_0
    //   57: istore #4
    //   59: aload_0
    //   60: arraylength
    //   61: istore #7
    //   63: iload #4
    //   65: iload #7
    //   67: if_icmpge -> 113
    //   70: aload_0
    //   71: iload #4
    //   73: iaload
    //   74: invokestatic q : (I)I
    //   77: iload #5
    //   79: imul
    //   80: iconst_5
    //   81: iadd
    //   82: newarray byte
    //   84: astore #8
    //   86: aload #8
    //   88: iconst_0
    //   89: bipush #90
    //   91: i2b
    //   92: bastore
    //   93: iload #5
    //   95: aload #8
    //   97: invokestatic u : (I[B)V
    //   100: aload #6
    //   102: iload #4
    //   104: aload #8
    //   106: aastore
    //   107: iinc #4, 1
    //   110: goto -> 59
    //   113: iconst_5
    //   114: newarray byte
    //   116: astore #8
    //   118: aload #8
    //   120: iconst_0
    //   121: bipush #-91
    //   123: i2b
    //   124: bastore
    //   125: iload #7
    //   127: anewarray java/security/MessageDigest
    //   130: astore #9
    //   132: iconst_0
    //   133: istore #4
    //   135: iload #4
    //   137: aload_0
    //   138: arraylength
    //   139: if_icmpge -> 185
    //   142: aload_0
    //   143: iload #4
    //   145: iaload
    //   146: invokestatic p : (I)Ljava/lang/String;
    //   149: astore #10
    //   151: aload #9
    //   153: iload #4
    //   155: aload #10
    //   157: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   160: aastore
    //   161: iinc #4, 1
    //   164: goto -> 135
    //   167: astore_0
    //   168: new java/lang/RuntimeException
    //   171: dup
    //   172: aload #10
    //   174: ldc_w ' digest not supported'
    //   177: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   180: aload_0
    //   181: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   184: athrow
    //   185: iconst_0
    //   186: istore #5
    //   188: iconst_0
    //   189: istore #11
    //   191: iconst_0
    //   192: istore #4
    //   194: iload #5
    //   196: iconst_3
    //   197: if_icmpge -> 499
    //   200: aload_1
    //   201: iload #5
    //   203: aaload
    //   204: astore #10
    //   206: aload #10
    //   208: invokeinterface a : ()J
    //   213: lstore #12
    //   215: lconst_0
    //   216: lstore_2
    //   217: lload #12
    //   219: lconst_0
    //   220: lcmp
    //   221: ifle -> 490
    //   224: lload #12
    //   226: ldc2_w 1048576
    //   229: invokestatic min : (JJ)J
    //   232: l2i
    //   233: istore #14
    //   235: iload #14
    //   237: aload #8
    //   239: invokestatic u : (I[B)V
    //   242: iconst_0
    //   243: istore #15
    //   245: iload #15
    //   247: iload #7
    //   249: if_icmpge -> 268
    //   252: aload #9
    //   254: iload #15
    //   256: aaload
    //   257: aload #8
    //   259: invokevirtual update : ([B)V
    //   262: iinc #15, 1
    //   265: goto -> 245
    //   268: aload #10
    //   270: aload #9
    //   272: lload_2
    //   273: iload #14
    //   275: invokeinterface a : ([Ljava/security/MessageDigest;JI)V
    //   280: iconst_0
    //   281: istore #15
    //   283: iload #15
    //   285: aload_0
    //   286: arraylength
    //   287: if_icmpge -> 413
    //   290: aload_0
    //   291: iload #15
    //   293: iaload
    //   294: istore #16
    //   296: aload #6
    //   298: iload #15
    //   300: aaload
    //   301: astore #17
    //   303: iload #16
    //   305: invokestatic q : (I)I
    //   308: istore #16
    //   310: aload #9
    //   312: iload #15
    //   314: aaload
    //   315: astore #18
    //   317: aload #18
    //   319: aload #17
    //   321: iload #11
    //   323: iload #16
    //   325: imul
    //   326: iconst_5
    //   327: iadd
    //   328: iload #16
    //   330: invokevirtual digest : ([BII)I
    //   333: istore #19
    //   335: iload #19
    //   337: iload #16
    //   339: if_icmpne -> 348
    //   342: iinc #15, 1
    //   345: goto -> 283
    //   348: aload #18
    //   350: invokevirtual getAlgorithm : ()Ljava/lang/String;
    //   353: astore_0
    //   354: new java/lang/StringBuilder
    //   357: dup
    //   358: aload_0
    //   359: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   362: invokevirtual length : ()I
    //   365: bipush #46
    //   367: iadd
    //   368: invokespecial <init> : (I)V
    //   371: astore_1
    //   372: aload_1
    //   373: ldc_w 'Unexpected output size of '
    //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: pop
    //   380: aload_1
    //   381: aload_0
    //   382: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: pop
    //   386: aload_1
    //   387: ldc_w ' digest: '
    //   390: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: pop
    //   394: aload_1
    //   395: iload #19
    //   397: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   400: pop
    //   401: new java/lang/RuntimeException
    //   404: dup
    //   405: aload_1
    //   406: invokevirtual toString : ()Ljava/lang/String;
    //   409: invokespecial <init> : (Ljava/lang/String;)V
    //   412: athrow
    //   413: iload #14
    //   415: i2l
    //   416: lstore #20
    //   418: lload #12
    //   420: lload #20
    //   422: lsub
    //   423: lstore #12
    //   425: iinc #11, 1
    //   428: lload_2
    //   429: lload #20
    //   431: ladd
    //   432: lstore_2
    //   433: goto -> 217
    //   436: astore_1
    //   437: new java/lang/StringBuilder
    //   440: dup
    //   441: bipush #59
    //   443: invokespecial <init> : (I)V
    //   446: astore_0
    //   447: aload_0
    //   448: ldc_w 'Failed to digest chunk #'
    //   451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: pop
    //   455: aload_0
    //   456: iload #11
    //   458: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   461: pop
    //   462: aload_0
    //   463: ldc_w ' of section #'
    //   466: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   469: pop
    //   470: aload_0
    //   471: iload #4
    //   473: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   476: pop
    //   477: new java/security/DigestException
    //   480: dup
    //   481: aload_0
    //   482: invokevirtual toString : ()Ljava/lang/String;
    //   485: aload_1
    //   486: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   489: athrow
    //   490: iinc #4, 1
    //   493: iinc #5, 1
    //   496: goto -> 194
    //   499: aload_0
    //   500: arraylength
    //   501: anewarray [B
    //   504: astore #10
    //   506: iconst_0
    //   507: istore #4
    //   509: iload #4
    //   511: aload_0
    //   512: arraylength
    //   513: if_icmpge -> 576
    //   516: aload_0
    //   517: iload #4
    //   519: iaload
    //   520: istore #5
    //   522: aload #6
    //   524: iload #4
    //   526: aaload
    //   527: astore #8
    //   529: iload #5
    //   531: invokestatic p : (I)Ljava/lang/String;
    //   534: astore_1
    //   535: aload_1
    //   536: invokestatic getInstance : (Ljava/lang/String;)Ljava/security/MessageDigest;
    //   539: astore #9
    //   541: aload #10
    //   543: iload #4
    //   545: aload #9
    //   547: aload #8
    //   549: invokevirtual digest : ([B)[B
    //   552: aastore
    //   553: iinc #4, 1
    //   556: goto -> 509
    //   559: astore_0
    //   560: new java/lang/RuntimeException
    //   563: dup
    //   564: aload_1
    //   565: ldc_w ' digest not supported'
    //   568: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   571: aload_0
    //   572: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   575: athrow
    //   576: aload #10
    //   578: areturn
    //   579: new java/lang/StringBuilder
    //   582: dup
    //   583: bipush #37
    //   585: invokespecial <init> : (I)V
    //   588: astore_0
    //   589: aload_0
    //   590: ldc_w 'Too many chunks: '
    //   593: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   596: pop
    //   597: aload_0
    //   598: lload_2
    //   599: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   602: pop
    //   603: new java/security/DigestException
    //   606: dup
    //   607: aload_0
    //   608: invokevirtual toString : ()Ljava/lang/String;
    //   611: invokespecial <init> : (Ljava/lang/String;)V
    //   614: astore_0
    //   615: goto -> 620
    //   618: aload_0
    //   619: athrow
    //   620: goto -> 618
    // Exception table:
    //   from	to	target	type
    //   151	161	167	java/security/NoSuchAlgorithmException
    //   268	280	436	java/io/IOException
    //   535	541	559	java/security/NoSuchAlgorithmException
  }
  
  private static int o(int paramInt) {
    if (paramInt != 513)
      if (paramInt != 514) {
        if (paramInt != 769) {
          String str;
          switch (paramInt) {
            default:
              str = String.valueOf(Long.toHexString(paramInt));
              if (str.length() != 0) {
                str = "Unknown signature algorithm: 0x".concat(str);
              } else {
                str = new String("Unknown signature algorithm: 0x");
              } 
              throw new IllegalArgumentException(str);
            case 258:
            case 260:
              return 2;
            case 257:
            case 259:
              break;
          } 
        } 
        return 1;
      }  
    return 1;
  }
  
  private static String p(int paramInt) {
    if (paramInt != 1) {
      if (paramInt == 2)
        return "SHA-512"; 
      StringBuilder stringBuilder = new StringBuilder(44);
      stringBuilder.append("Unknown content digest algorthm: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return "SHA-256";
  }
  
  private static int q(int paramInt) {
    if (paramInt != 1) {
      if (paramInt == 2)
        return 64; 
      StringBuilder stringBuilder = new StringBuilder(44);
      stringBuilder.append("Unknown content digest algorthm: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return 32;
  }
  
  private static ByteBuffer r(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt >= 0) {
      int i = paramByteBuffer.limit();
      int j = paramByteBuffer.position();
      paramInt += j;
      if (paramInt >= j && paramInt <= i) {
        paramByteBuffer.limit(paramInt);
        try {
          ByteBuffer byteBuffer = paramByteBuffer.slice();
          byteBuffer.order(paramByteBuffer.order());
          paramByteBuffer.position(paramInt);
          return byteBuffer;
        } finally {
          paramByteBuffer.limit(i);
        } 
      } 
      throw new BufferUnderflowException();
    } 
    StringBuilder stringBuilder = new StringBuilder(17);
    stringBuilder.append("size: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static ByteBuffer s(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.remaining() >= 4) {
      int j = paramByteBuffer.getInt();
      if (j >= 0) {
        if (j <= paramByteBuffer.remaining())
          return r(paramByteBuffer, j); 
        int k = paramByteBuffer.remaining();
        stringBuilder = new StringBuilder(101);
        stringBuilder.append("Length-prefixed field longer than remaining buffer. Field length: ");
        stringBuilder.append(j);
        stringBuilder.append(", remaining: ");
        stringBuilder.append(k);
        throw new IOException(stringBuilder.toString());
      } 
      throw new IllegalArgumentException("Negative length");
    } 
    int i = stringBuilder.remaining();
    StringBuilder stringBuilder = new StringBuilder(93);
    stringBuilder.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
    stringBuilder.append(i);
    throw new IOException(stringBuilder.toString());
  }
  
  private static byte[] t(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    if (i >= 0) {
      if (i <= paramByteBuffer.remaining()) {
        byte[] arrayOfByte = new byte[i];
        paramByteBuffer.get(arrayOfByte);
        return arrayOfByte;
      } 
      int j = paramByteBuffer.remaining();
      StringBuilder stringBuilder = new StringBuilder(90);
      stringBuilder.append("Underflow while reading length-prefixed value. Length: ");
      stringBuilder.append(i);
      stringBuilder.append(", available: ");
      stringBuilder.append(j);
      throw new IOException(stringBuilder.toString());
    } 
    throw new IOException("Negative length");
  }
  
  private static void u(int paramInt, byte[] paramArrayOfbyte) {
    paramArrayOfbyte[1] = (byte)(byte)(paramInt & 0xFF);
    paramArrayOfbyte[2] = (byte)(byte)(paramInt >>> 8 & 0xFF);
    paramArrayOfbyte[3] = (byte)(byte)(paramInt >>> 16 & 0xFF);
    paramArrayOfbyte[4] = (byte)(byte)(paramInt >> 24);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */