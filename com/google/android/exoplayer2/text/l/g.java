package com.google.android.exoplayer2.text.l;

import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;

public final class g {
  public static void a(long paramLong, v paramv, v[] paramArrayOfv) {
    while (true) {
      int i = paramv.a();
      boolean bool = true;
      if (i > 1) {
        int j = c(paramv);
        int k = c(paramv);
        int m = paramv.c() + k;
        if (k == -1 || k > paramv.a()) {
          o.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
          i = paramv.d();
        } else {
          i = m;
          if (j == 4) {
            i = m;
            if (k >= 8) {
              i = paramv.z();
              int n = paramv.F();
              if (n == 49) {
                j = paramv.k();
              } else {
                j = 0;
              } 
              k = paramv.z();
              if (n == 47)
                paramv.N(1); 
              if (i == 181 && (n == 49 || n == 47) && k == 3) {
                i = 1;
              } else {
                i = 0;
              } 
              k = i;
              if (n == 49) {
                if (j == 1195456820) {
                  j = bool;
                } else {
                  j = 0;
                } 
                k = i & j;
              } 
              i = m;
              if (k != 0) {
                b(paramLong, paramv, paramArrayOfv);
                i = m;
              } 
            } 
          } 
        } 
        paramv.M(i);
        continue;
      } 
      break;
    } 
  }
  
  public static void b(long paramLong, v paramv, v[] paramArrayOfv) {
    int i = paramv.z();
    byte b1 = 0;
    if ((i & 0x40) != 0) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    if (!b2)
      return; 
    paramv.N(1);
    i = (i & 0x1F) * 3;
    int j = paramv.c();
    int k = paramArrayOfv.length;
    for (byte b2 = b1; b2 < k; b2++) {
      v v1 = paramArrayOfv[b2];
      paramv.M(j);
      v1.b(paramv, i);
      v1.c(paramLong, 1, i, 0, null);
    } 
  }
  
  private static int c(v paramv) {
    int i = 0;
    while (true) {
      if (paramv.a() == 0)
        return -1; 
      int j = paramv.z();
      int k = i + j;
      i = k;
      if (j != 255)
        return k; 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/l/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */