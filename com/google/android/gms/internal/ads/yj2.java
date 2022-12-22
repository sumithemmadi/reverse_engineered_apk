package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class yj2 {
  public final List<byte[]> a;
  
  public final int b;
  
  private final int c;
  
  private final int d;
  
  public final float e;
  
  private yj2(List<byte[]> paramList, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.a = paramList;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramFloat;
  }
  
  public static yj2 a(qj2 paramqj2) {
    try {
      paramqj2.m(4);
      int i = (paramqj2.g() & 0x3) + 1;
      if (i != 3) {
        float f;
        ArrayList<byte[]> arrayList = new ArrayList();
        this();
        int j = paramqj2.g() & 0x1F;
        int k;
        for (k = 0; k < j; k++)
          arrayList.add(b(paramqj2)); 
        int m = paramqj2.g();
        for (k = 0; k < m; k++)
          arrayList.add(b(paramqj2)); 
        if (j > 0) {
          byte[] arrayOfByte = arrayList.get(0);
          oj2 oj2 = pj2.c(arrayList.get(0), i, arrayOfByte.length);
          j = oj2.b;
          k = oj2.c;
          f = oj2.d;
        } else {
          j = -1;
          k = -1;
          f = 1.0F;
        } 
        return new yj2((List<byte[]>)arrayList, i, j, k, f);
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      this();
      throw illegalStateException;
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      zzhw zzhw = new zzhw("Error parsing AVC config", arrayIndexOutOfBoundsException);
      throw zzhw;
    } 
  }
  
  private static byte[] b(qj2 paramqj2) {
    int i = paramqj2.h();
    int j = paramqj2.b();
    paramqj2.m(i);
    return ij2.c(paramqj2.a, j, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */