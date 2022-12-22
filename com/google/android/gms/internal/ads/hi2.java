package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

public abstract class hi2 extends ni2 {
  private final SparseArray<Map<ai2, ji2>> b = new SparseArray();
  
  private final SparseBooleanArray c = new SparseBooleanArray();
  
  private int d = 0;
  
  private ki2 e;
  
  public final pi2 b(tc2[] paramArrayOftc2, ai2 paramai2) {
    int[] arrayOfInt1 = new int[paramArrayOftc2.length + 1];
    int i = paramArrayOftc2.length + 1;
    yh2[][] arrayOfYh2 = new yh2[i][];
    int[][][] arrayOfInt = new int[paramArrayOftc2.length + 1][][];
    int j;
    for (j = 0; j < i; j++) {
      int k = paramai2.b;
      arrayOfYh2[j] = new yh2[k];
      arrayOfInt[j] = new int[k][];
    } 
    i = paramArrayOftc2.length;
    int[] arrayOfInt2 = new int[i];
    for (j = 0; j < i; j++)
      arrayOfInt2[j] = paramArrayOftc2[j].o(); 
    for (byte b = 0; b < paramai2.b; b++) {
      int m;
      int[] arrayOfInt4;
      yh2 yh2 = paramai2.b(b);
      i = paramArrayOftc2.length;
      j = 0;
      int k = 0;
      label68: while (true) {
        m = i;
        if (j < paramArrayOftc2.length) {
          tc2 tc21 = paramArrayOftc2[j];
          byte b1 = 0;
          for (m = k; b1 < yh2.a; m = k) {
            int n = tc21.r(yh2.a(b1)) & 0x3;
            k = m;
            if (n > m) {
              i = j;
              m = i;
              if (n != 3) {
                k = n;
              } else {
                break label68;
              } 
            } 
            b1++;
          } 
          j++;
          k = m;
          continue;
        } 
        break;
      } 
      if (m == paramArrayOftc2.length) {
        arrayOfInt4 = new int[yh2.a];
      } else {
        tc2 tc21 = paramArrayOftc2[m];
        arrayOfInt4 = new int[yh2.a];
        for (j = 0; j < yh2.a; j++)
          arrayOfInt4[j] = tc21.r(yh2.a(j)); 
      } 
      j = arrayOfInt1[m];
      arrayOfYh2[m][j] = yh2;
      arrayOfInt[m][j] = arrayOfInt4;
      arrayOfInt1[m] = arrayOfInt1[m] + 1;
    } 
    ai2[] arrayOfAi2 = new ai2[paramArrayOftc2.length];
    int[] arrayOfInt3 = new int[paramArrayOftc2.length];
    for (j = 0; j < paramArrayOftc2.length; j++) {
      i = arrayOfInt1[j];
      arrayOfAi2[j] = new ai2(Arrays.<yh2>copyOf(arrayOfYh2[j], i));
      arrayOfInt[j] = Arrays.<int[]>copyOf(arrayOfInt[j], i);
      arrayOfInt3[j] = paramArrayOftc2[j].n();
    } 
    j = arrayOfInt1[paramArrayOftc2.length];
    ai2 ai21 = new ai2(Arrays.<yh2>copyOf(arrayOfYh2[paramArrayOftc2.length], j));
    mi2[] arrayOfMi2 = e(paramArrayOftc2, arrayOfAi2, arrayOfInt);
    j = 0;
    while (true) {
      i = paramArrayOftc2.length;
      ji2 ji2 = null;
      if (j < i) {
        if (this.c.get(j)) {
          arrayOfMi2[j] = null;
        } else {
          ai2 ai22 = arrayOfAi2[j];
          Map map = (Map)this.b.get(j);
          if (map != null)
            ji2 = (ji2)map.get(ai22); 
          if (ji2 != null)
            throw new NoSuchMethodError(); 
        } 
        j++;
        continue;
      } 
      ki2 ki21 = new ki2(arrayOfInt3, arrayOfAi2, arrayOfInt2, arrayOfInt, ai21);
      sc2[] arrayOfSc2 = new sc2[paramArrayOftc2.length];
      for (j = 0; j < paramArrayOftc2.length; j++) {
        if (arrayOfMi2[j] != null) {
          sc2 sc2 = sc2.a;
        } else {
          ji2 = null;
        } 
        arrayOfSc2[j] = (sc2)ji2;
      } 
      return new pi2(paramai2, new oi2(arrayOfMi2), ki21, arrayOfSc2);
    } 
  }
  
  public final void d(Object paramObject) {
    this.e = (ki2)paramObject;
  }
  
  protected abstract mi2[] e(tc2[] paramArrayOftc2, ai2[] paramArrayOfai2, int[][][] paramArrayOfint);
  
  public final void f(int paramInt, boolean paramBoolean) {
    if (this.c.get(paramInt) == paramBoolean)
      return; 
    this.c.put(paramInt, paramBoolean);
    a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */