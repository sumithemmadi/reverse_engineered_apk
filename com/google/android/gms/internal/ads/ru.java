package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class ru {
  static void a(w<?> paramw, IOException paramIOException, long paramLong, pn parampn, byte[] paramArrayOfbyte) {
    String str;
    kt2 kt2;
    if (paramIOException instanceof java.net.SocketTimeoutException) {
      b("socket", paramw, new zzam());
      return;
    } 
    if (paramIOException instanceof java.net.MalformedURLException) {
      str = String.valueOf(paramw.f());
      if (str.length() != 0) {
        str = "Bad URL ".concat(str);
      } else {
        str = new String("Bad URL ");
      } 
      throw new RuntimeException(str, paramIOException);
    } 
    if (parampn != null) {
      int i = parampn.c();
      ic.b("Unexpected response code %d for %s", new Object[] { Integer.valueOf(i), str.f() });
      if (paramArrayOfbyte != null) {
        List<yp2> list = parampn.d();
        kt2 = new kt2(i, paramArrayOfbyte, false, SystemClock.elapsedRealtime() - paramLong, list);
        if (i == 401 || i == 403) {
          b("auth", (w<?>)str, new zzl(kt2));
          return;
        } 
        if (i < 400 || i > 499) {
          if (i >= 500 && i <= 599)
            throw new zzan(kt2); 
          throw new zzan(kt2);
        } 
        throw new zzo(kt2);
      } 
      b("network", (w<?>)str, new zzw());
      return;
    } 
    throw new zzy(kt2);
  }
  
  private static void b(String paramString, w<?> paramw, zzap paramzzap) {
    n8 n8 = paramw.E();
    int i = paramw.D();
    try {
      n8.a(paramzzap);
      paramw.u(String.format("%s-retry [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      return;
    } catch (zzap zzap1) {
      paramw.u(String.format("%s-timeout-giveup [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      throw zzap1;
    } 
  }
  
  static byte[] c(InputStream paramInputStream, int paramInt, eg parameg) {
    // Byte code:
    //   0: new com/google/android/gms/internal/ads/qt
    //   3: dup
    //   4: aload_2
    //   5: iload_1
    //   6: invokespecial <init> : (Lcom/google/android/gms/internal/ads/eg;I)V
    //   9: astore_3
    //   10: aload_2
    //   11: sipush #1024
    //   14: invokevirtual b : (I)[B
    //   17: astore #4
    //   19: aload_0
    //   20: aload #4
    //   22: invokevirtual read : ([B)I
    //   25: istore_1
    //   26: iload_1
    //   27: iconst_m1
    //   28: if_icmpeq -> 42
    //   31: aload_3
    //   32: aload #4
    //   34: iconst_0
    //   35: iload_1
    //   36: invokevirtual write : ([BII)V
    //   39: goto -> 19
    //   42: aload_3
    //   43: invokevirtual toByteArray : ()[B
    //   46: astore #5
    //   48: aload_0
    //   49: invokevirtual close : ()V
    //   52: goto -> 65
    //   55: astore_0
    //   56: ldc 'Error occurred when closing InputStream'
    //   58: iconst_0
    //   59: anewarray java/lang/Object
    //   62: invokestatic c : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: aload_2
    //   66: aload #4
    //   68: invokevirtual a : ([B)V
    //   71: aload_3
    //   72: invokevirtual close : ()V
    //   75: aload #5
    //   77: areturn
    //   78: astore #5
    //   80: goto -> 88
    //   83: astore #5
    //   85: aconst_null
    //   86: astore #4
    //   88: aload_0
    //   89: ifnull -> 109
    //   92: aload_0
    //   93: invokevirtual close : ()V
    //   96: goto -> 109
    //   99: astore_0
    //   100: ldc 'Error occurred when closing InputStream'
    //   102: iconst_0
    //   103: anewarray java/lang/Object
    //   106: invokestatic c : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: aload_2
    //   110: aload #4
    //   112: invokevirtual a : ([B)V
    //   115: aload_3
    //   116: invokevirtual close : ()V
    //   119: goto -> 125
    //   122: aload #5
    //   124: athrow
    //   125: goto -> 122
    // Exception table:
    //   from	to	target	type
    //   10	19	83	finally
    //   19	26	78	finally
    //   31	39	78	finally
    //   42	48	78	finally
    //   48	52	55	java/io/IOException
    //   92	96	99	java/io/IOException
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */