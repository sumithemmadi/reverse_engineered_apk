package com.google.android.exoplayer2.c1.d0;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.l.d;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l implements h0.c {
  private final int a;
  
  private final List<Format> b;
  
  public l(int paramInt) {
    this(paramInt, Collections.singletonList(Format.x(null, "application/cea-608", 0, null)));
  }
  
  public l(int paramInt, List<Format> paramList) {
    this.a = paramInt;
    this.b = paramList;
  }
  
  private c0 c(h0.b paramb) {
    return new c0(e(paramb));
  }
  
  private j0 d(h0.b paramb) {
    return new j0(e(paramb));
  }
  
  private List<Format> e(h0.b paramb) {
    String str;
    if (f(32))
      return this.b; 
    v v = new v(paramb.d);
    List<Format> list = this.b;
    while (v.a() > 0) {
      int i = v.z();
      int j = v.z();
      int k = v.c();
      if (i == 134) {
        ArrayList<Format> arrayList = new ArrayList();
        int m = v.z();
        i = 0;
        while (true) {
          list = arrayList;
          if (i < (m & 0x1F)) {
            boolean bool2;
            List list1;
            String str1 = v.w(3);
            int n = v.z();
            boolean bool1 = true;
            if ((n & 0x80) != 0) {
              bool2 = true;
            } else {
              bool2 = false;
            } 
            if (bool2) {
              n &= 0x3F;
              str = "application/cea-708";
            } else {
              str = "application/cea-608";
              n = 1;
            } 
            byte b1 = (byte)v.z();
            v.N(1);
            if (bool2) {
              if ((b1 & 0x40) == 0)
                bool1 = false; 
              list1 = d.a(bool1);
            } else {
              list1 = null;
            } 
            arrayList.add(Format.z(null, str, null, -1, 0, str1, n, null, Long.MAX_VALUE, list1));
            i++;
            continue;
          } 
          break;
        } 
      } 
      v.M(k + j);
    } 
    return (List<Format>)str;
  }
  
  private boolean f(int paramInt) {
    boolean bool;
    if ((paramInt & this.a) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public h0 a(int paramInt, h0.b paramb) {
    w w;
    if (paramInt != 2) {
      if (paramInt != 3 && paramInt != 4) {
        h0.b b1 = null;
        h0.b b2 = null;
        h0.b b3 = null;
        h0.b b4 = null;
        if (paramInt != 15) {
          if (paramInt != 17) {
            if (paramInt != 21) {
              if (paramInt != 27) {
                b0 b0;
                if (paramInt != 36) {
                  if (paramInt != 89) {
                    if (paramInt != 138) {
                      if (paramInt != 172) {
                        if (paramInt != 129)
                          if (paramInt != 130) {
                            if (paramInt != 134) {
                              if (paramInt != 135)
                                return null; 
                            } else {
                              if (f(16)) {
                                paramb = b4;
                              } else {
                                b0 = new b0(new d0());
                              } 
                              return b0;
                            } 
                          } else {
                            return !f(64) ? null : new w(new m(((h0.b)b0).b));
                          }  
                        return new w(new g(((h0.b)b0).b));
                      } 
                      return new w(new i(((h0.b)b0).b));
                    } 
                    return new w(new m(((h0.b)b0).b));
                  } 
                  return new w(new n(((h0.b)b0).c));
                } 
                return new w(new r(c((h0.b)b0)));
              } 
              if (f(4)) {
                paramb = b1;
              } else {
                w = new w(new q(c(paramb), f(1), f(8)));
              } 
              return w;
            } 
            return new w(new s());
          } 
          if (f(2)) {
            paramb = b2;
          } else {
            w = new w(new t(paramb.b));
          } 
          return w;
        } 
        if (f(2)) {
          paramb = b3;
        } else {
          w = new w(new k(false, paramb.b));
        } 
        return w;
      } 
      return new w(new u(((h0.b)w).b));
    } 
    return new w(new p(d((h0.b)w)));
  }
  
  public SparseArray<h0> b() {
    return new SparseArray();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */