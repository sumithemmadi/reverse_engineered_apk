package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class dk2 {
  public final List<byte[]> a;
  
  public final int b;
  
  private dk2(List<byte[]> paramList, int paramInt) {
    this.a = paramList;
    this.b = paramInt;
  }
  
  public static dk2 a(qj2 paramqj2) {
    try {
      List<byte> list;
      paramqj2.m(21);
      int i = paramqj2.g();
      int j = paramqj2.g();
      int k = paramqj2.b();
      byte b = 0;
      int m = 0;
      while (b < j) {
        paramqj2.m(1);
        int n = paramqj2.h();
        for (byte b1 = 0; b1 < n; b1++) {
          int i1 = paramqj2.h();
          m += i1 + 4;
          paramqj2.m(i1);
        } 
        b++;
      } 
      paramqj2.l(k);
      byte[] arrayOfByte = new byte[m];
      b = 0;
      k = 0;
      while (b < j) {
        paramqj2.m(1);
        int n = paramqj2.h();
        for (byte b1 = 0; b1 < n; b1++) {
          int i1 = paramqj2.h();
          byte[] arrayOfByte1 = pj2.a;
          System.arraycopy(arrayOfByte1, 0, arrayOfByte, k, arrayOfByte1.length);
          k += arrayOfByte1.length;
          System.arraycopy(paramqj2.a, paramqj2.b(), arrayOfByte, k, i1);
          k += i1;
          paramqj2.m(i1);
        } 
        b++;
      } 
      if (m == 0) {
        paramqj2 = null;
      } else {
        list = Collections.singletonList(arrayOfByte);
      } 
      return new dk2((List)list, (i & 0x3) + 1);
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      zzhw zzhw = new zzhw("Error parsing HEVC config", arrayIndexOutOfBoundsException);
      throw zzhw;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */