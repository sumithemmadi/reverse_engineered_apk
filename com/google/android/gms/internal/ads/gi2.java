package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class gi2 extends hi2 {
  private static final int[] f = new int[0];
  
  private final li2 g = null;
  
  private final AtomicReference<fi2> h = new AtomicReference<fi2>(new fi2());
  
  public gi2() {
    this(null);
  }
  
  private gi2(li2 paramli2) {}
  
  private static int g(int paramInt1, int paramInt2) {
    return (paramInt1 == -1) ? ((paramInt2 == -1) ? 0 : -1) : ((paramInt2 == -1) ? 1 : (paramInt1 - paramInt2));
  }
  
  private static boolean h(int paramInt, boolean paramBoolean) {
    paramInt &= 0x3;
    return (paramInt == 3 || (paramBoolean && paramInt == 2));
  }
  
  protected final mi2[] e(tc2[] paramArrayOftc2, ai2[] paramArrayOfai2, int[][][] paramArrayOfint) {
    int i = paramArrayOftc2.length;
    mi2[] arrayOfMi2 = new mi2[i];
    fi2 fi21 = this.h.get();
    int j = 0;
    int k = 0;
    while (j < i) {
      if (2 == paramArrayOftc2[j].n()) {
        if (!k) {
          ii2 ii2;
          ai2 ai21 = paramArrayOfai2[j];
          int[][] arrayOfInt = paramArrayOfint[j];
          int i1 = fi21.e;
          int i2 = fi21.f;
          k = fi21.g;
          int i3 = fi21.j;
          int i4 = fi21.k;
          boolean bool1 = fi21.l;
          boolean bool2 = fi21.h;
          boolean bool3 = fi21.i;
          mi2[] arrayOfMi21 = null;
          byte b1 = 0;
          int i5 = 0;
          boolean bool = false;
          int i6 = -1;
          int i7 = -1;
          int i8 = j;
          mi2[] arrayOfMi22 = arrayOfMi2;
          arrayOfMi2 = arrayOfMi21;
          while (b1 < ai21.b) {
            yh2 yh22 = ai21.b(b1);
            ArrayList<Integer> arrayList = new ArrayList(yh22.a);
            for (j = 0; j < yh22.a; j++)
              arrayList.add(Integer.valueOf(j)); 
            int i9 = Integer.MAX_VALUE;
            if (i3 == Integer.MAX_VALUE || i4 == Integer.MAX_VALUE) {
              j = i4;
              i4 = k;
              k = i3;
              i3 = j;
            } else {
              int i10 = 0;
              int i11 = k;
              j = i3;
              k = i4;
              i3 = i10;
              while (true) {
                i3++;
                i9 = i4;
              } 
              arrayOfMi21 = arrayOfMi2;
              boolean bool5 = bool1;
              i10 = k;
              boolean bool6 = bool2;
              arrayOfMi2 = arrayOfMi21;
              bool2 = bool6;
              bool1 = bool5;
              i3 = i10;
              k = j;
              i4 = i11;
              if (i9 != Integer.MAX_VALUE) {
                int i12 = arrayList.size() - 1;
                while (true) {
                  arrayOfMi2 = arrayOfMi21;
                  bool2 = bool6;
                  bool1 = bool5;
                  i3 = i10;
                  k = j;
                  i4 = i11;
                  if (i12 >= 0) {
                    k = yh22.a(((Integer)arrayList.get(i12)).intValue()).o();
                    if (k == -1 || k > i9)
                      arrayList.remove(i12); 
                    i12--;
                    continue;
                  } 
                  break;
                } 
              } 
            } 
            int[] arrayOfInt2 = arrayOfInt[b1];
            j = i6;
            boolean bool4 = false;
            i6 = i7;
            i7 = j;
            j = i5;
            i5 = bool4;
            yh2 yh21 = yh22;
            int[] arrayOfInt1 = arrayOfInt2;
            while (true)
              i5++; 
            continue;
            i9 = i4;
            b1++;
            i10 = i6;
            i5 = j;
            i4 = i3;
            i3 = k;
            k = i9;
            i6 = i7;
            i7 = i10;
          } 
          if (arrayOfMi2 == null) {
            arrayOfMi2 = null;
          } else {
            ii2 = new ii2((yh2)arrayOfMi2, i5);
          } 
          arrayOfMi22[i8] = ii2;
          if (arrayOfMi22[i8] != null) {
            j = 1;
          } else {
            j = 0;
          } 
          k = j;
          arrayOfMi2 = arrayOfMi22;
          j = i8;
        } 
        int n = (paramArrayOfai2[j]).b;
      } 
      j++;
    } 
    j = i;
    byte b = 0;
    int m = 0;
    k = 0;
    fi2 fi22 = fi21;
    while (b < j) {
      int i1;
      int n = paramArrayOftc2[b].n();
      if (n != 1) {
        if (n != 2) {
          yh2 yh2;
          int i2;
          if (n != 3) {
            ii2 ii2;
            paramArrayOftc2[b].n();
            ai2 ai21 = paramArrayOfai2[b];
            int[][] arrayOfInt = paramArrayOfint[b];
            boolean bool = fi22.i;
            i = 0;
            i2 = 0;
            byte b1 = 0;
            yh2 = null;
            for (n = j; i < ai21.b; n = i3) {
              yh2 yh21 = ai21.b(i);
              int[] arrayOfInt1 = arrayOfInt[i];
              j = 0;
              int i3 = n;
              while (j < yh21.a) {
                byte b2;
                if (h(arrayOfInt1[j], bool)) {
                  if (((yh21.a(j)).y & 0x1) != 0) {
                    n = 1;
                  } else {
                    n = 0;
                  } 
                  if (n != 0) {
                    b2 = 2;
                  } else {
                    b2 = 1;
                  } 
                  n = b2;
                  if (h(arrayOfInt1[j], false))
                    n = b2 + 1000; 
                  b2 = b1;
                  if (n > b1) {
                    yh2 = yh21;
                    i2 = j;
                    b2 = n;
                  } 
                } else {
                  b2 = b1;
                } 
                j++;
                b1 = b2;
              } 
              i++;
            } 
            j = n;
            if (yh2 == null) {
              ai21 = null;
            } else {
              ii2 = new ii2(yh2, i2);
            } 
            arrayOfMi2[b] = ii2;
            i1 = k;
          } else {
            int i3 = j;
            i1 = k;
            j = i3;
            if (k == 0) {
              yh2 yh21;
              ii2 ii2;
              ai2 ai21 = paramArrayOfai2[b];
              int[][] arrayOfInt = paramArrayOfint[b];
              boolean bool = fi22.i;
              byte b1 = 0;
              j = 0;
              k = 0;
              fi21 = null;
              while (b1 < ai21.b) {
                yh2 yh22 = ai21.b(b1);
                int[] arrayOfInt1 = arrayOfInt[b1];
                n = j;
                i1 = 0;
                j = k;
                k = i1;
                while (k < yh22.a) {
                  i2 = n;
                  i = j;
                  yh2 = yh21;
                  if (h(arrayOfInt1[k], bool)) {
                    boolean bool1;
                    i = (yh22.a(k)).y;
                    if ((i & 0x1) != 0) {
                      i1 = 1;
                    } else {
                      i1 = 0;
                    } 
                    if ((i & 0x2) != 0) {
                      bool1 = true;
                    } else {
                      bool1 = false;
                    } 
                    if (i1 != 0) {
                      i = 3;
                    } else {
                      i2 = n;
                      i = j;
                      yh2 = yh21;
                      if (bool1) {
                        i = 1;
                      } else {
                        continue;
                      } 
                    } 
                    i1 = i;
                    if (h(arrayOfInt1[k], false))
                      i1 = i + 1000; 
                    i2 = n;
                    i = j;
                    yh2 = yh21;
                    if (i1 > j) {
                      i2 = k;
                      yh2 = yh22;
                      i = i1;
                    } 
                  } 
                  continue;
                  k++;
                  n = i2;
                  j = i;
                  yh21 = yh2;
                } 
                b1++;
                k = j;
                j = n;
              } 
              if (yh21 == null) {
                yh21 = null;
              } else {
                ii2 = new ii2(yh21, j);
              } 
              arrayOfMi2[b] = ii2;
              if (arrayOfMi2[b] != null) {
                j = 1;
              } else {
                j = 0;
              } 
              i1 = j;
              j = i3;
            } 
          } 
        } else {
          i1 = k;
        } 
      } else {
        n = j;
        i1 = k;
        j = n;
        if (!m) {
          ii2 ii2;
          ai2 ai21 = paramArrayOfai2[b];
          int[][] arrayOfInt = paramArrayOfint[b];
          boolean bool = fi22.i;
          j = 0;
          i1 = 0;
          i = -1;
          m = -1;
          while (j < ai21.b) {
            yh2 yh2 = ai21.b(j);
            int[] arrayOfInt1 = arrayOfInt[j];
            int i2 = i1;
            int i3 = 0;
            i1 = m;
            m = i;
            i = i3;
            while (i < yh2.a) {
              int i4;
              if (h(arrayOfInt1[i], bool)) {
                zzht zzht = yh2.a(i);
                int i5 = arrayOfInt1[i];
                if ((zzht.y & 0x1) != 0) {
                  i3 = 1;
                } else {
                  i3 = 0;
                } 
                if (i3) {
                  i4 = 2;
                } else {
                  i4 = 1;
                } 
                i3 = i4;
                if (h(i5, false))
                  i3 = i4 + 1000; 
                i4 = i2;
                if (i3 > i2) {
                  m = j;
                  i1 = i;
                  i4 = i3;
                } 
              } else {
                i4 = i2;
              } 
              i++;
              i2 = i4;
            } 
            j++;
            i = m;
            m = i1;
            i1 = i2;
          } 
          if (i == -1) {
            fi21 = null;
          } else {
            ii2 = new ii2(ai21.b(i), m);
          } 
          arrayOfMi2[b] = ii2;
          if (arrayOfMi2[b] != null) {
            j = 1;
          } else {
            j = 0;
          } 
          m = j;
          j = n;
          continue;
        } 
      } 
      k = i1;
      continue;
      b++;
    } 
    return arrayOfMi2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */