package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.util.v;
import com.google.android.exoplayer2.util.w;
import java.util.Collections;

public final class r implements o {
  private final c0 a;
  
  private String b;
  
  private v c;
  
  private a d;
  
  private boolean e;
  
  private final boolean[] f;
  
  private final v g;
  
  private final v h;
  
  private final v i;
  
  private final v j;
  
  private final v k;
  
  private long l;
  
  private long m;
  
  private final v n;
  
  public r(c0 paramc0) {
    this.a = paramc0;
    this.f = new boolean[3];
    this.g = new v(32, 128);
    this.h = new v(33, 128);
    this.i = new v(34, 128);
    this.j = new v(39, 128);
    this.k = new v(40, 128);
    this.n = new v();
  }
  
  private void a(long paramLong1, int paramInt1, int paramInt2, long paramLong2) {
    if (this.e) {
      this.d.a(paramLong1, paramInt1);
    } else {
      this.g.b(paramInt2);
      this.h.b(paramInt2);
      this.i.b(paramInt2);
      if (this.g.c() && this.h.c() && this.i.c()) {
        this.c.d(h(this.b, this.g, this.h, this.i));
        this.e = true;
      } 
    } 
    if (this.j.b(paramInt2)) {
      v v1 = this.j;
      paramInt1 = s.k(v1.d, v1.e);
      this.n.K(this.j.d, paramInt1);
      this.n.N(5);
      this.a.a(paramLong2, this.n);
    } 
    if (this.k.b(paramInt2)) {
      v v1 = this.k;
      paramInt1 = s.k(v1.d, v1.e);
      this.n.K(this.k.d, paramInt1);
      this.n.N(5);
      this.a.a(paramLong2, this.n);
    } 
  }
  
  private void g(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.e) {
      this.d.c(paramArrayOfbyte, paramInt1, paramInt2);
    } else {
      this.g.a(paramArrayOfbyte, paramInt1, paramInt2);
      this.h.a(paramArrayOfbyte, paramInt1, paramInt2);
      this.i.a(paramArrayOfbyte, paramInt1, paramInt2);
    } 
    this.j.a(paramArrayOfbyte, paramInt1, paramInt2);
    this.k.a(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private static Format h(String paramString, v paramv1, v paramv2, v paramv3) {
    int i = paramv1.e;
    byte[] arrayOfByte1 = new byte[paramv2.e + i + paramv3.e];
    byte[] arrayOfByte2 = paramv1.d;
    int j = 0;
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, i);
    System.arraycopy(paramv2.d, 0, arrayOfByte1, paramv1.e, paramv2.e);
    System.arraycopy(paramv3.d, 0, arrayOfByte1, paramv1.e + paramv2.e, paramv3.e);
    w w = new w(paramv2.d, 0, paramv2.e);
    w.l(44);
    int k = w.e(3);
    w.k();
    w.l(88);
    w.l(8);
    int m = 0;
    i = 0;
    while (m < k) {
      int i4 = i;
      if (w.d())
        i4 = i + 89; 
      i = i4;
      if (w.d())
        i = i4 + 8; 
      m++;
    } 
    w.l(i);
    if (k > 0)
      w.l((8 - k) * 2); 
    w.h();
    int i1 = w.h();
    if (i1 == 3)
      w.k(); 
    int i2 = w.h();
    int i3 = w.h();
    m = i2;
    int n = i3;
    if (w.d()) {
      m = w.h();
      int i4 = w.h();
      int i5 = w.h();
      int i6 = w.h();
      if (i1 == 1 || i1 == 2) {
        i = 2;
      } else {
        i = 1;
      } 
      if (i1 == 1) {
        n = 2;
      } else {
        n = 1;
      } 
      m = i2 - i * (m + i4);
      n = i3 - n * (i5 + i6);
    } 
    w.h();
    w.h();
    i3 = w.h();
    if (w.d()) {
      i = 0;
    } else {
      i = k;
    } 
    while (i <= k) {
      w.h();
      w.h();
      w.h();
      i++;
    } 
    w.h();
    w.h();
    w.h();
    w.h();
    w.h();
    w.h();
    if (w.d() && w.d())
      i(w); 
    w.l(2);
    if (w.d()) {
      w.l(8);
      w.h();
      w.h();
      w.k();
    } 
    j(w);
    if (w.d())
      for (i = j; i < w.h(); i++)
        w.l(i3 + 4 + 1);  
    w.l(2);
    float f1 = 1.0F;
    if (w.d() && w.d()) {
      float f;
      i = w.e(8);
      if (i == 255) {
        i = w.e(16);
        j = w.e(16);
        f = f1;
        if (i != 0) {
          f = f1;
          if (j != 0)
            f = i / j; 
        } 
      } else {
        float[] arrayOfFloat = s.b;
        if (i < arrayOfFloat.length) {
          f = arrayOfFloat[i];
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unexpected aspect_ratio_idc value: ");
          stringBuilder.append(i);
          o.f("H265Reader", stringBuilder.toString());
          f = 1.0F;
        } 
      } 
      return Format.D(paramString, "video/hevc", null, -1, -1, m, n, -1.0F, Collections.singletonList(arrayOfByte1), -1, f, null);
    } 
    float f2 = 1.0F;
  }
  
  private static void i(w paramw) {
    for (byte b = 0; b < 4; b++) {
      for (int i = 0; i < 6; i += b2) {
        boolean bool = paramw.d();
        byte b1 = 1;
        if (!bool) {
          paramw.h();
        } else {
          int j = Math.min(64, 1 << (b << 1) + 4);
          if (b > 1)
            paramw.g(); 
          for (byte b3 = 0; b3 < j; b3++)
            paramw.g(); 
        } 
        byte b2 = b1;
        if (b == 3)
          b2 = 3; 
      } 
    } 
  }
  
  private static void j(w paramw) {
    int i = paramw.h();
    byte b = 0;
    boolean bool = false;
    int j;
    for (j = 0; b < i; j = k) {
      int k;
      if (b != 0)
        bool = paramw.d(); 
      if (bool) {
        paramw.k();
        paramw.h();
        byte b1 = 0;
        while (true) {
          k = j;
          if (b1 <= j) {
            if (paramw.d())
              paramw.k(); 
            b1++;
            continue;
          } 
          break;
        } 
      } else {
        int m = paramw.h();
        k = paramw.h();
        for (j = 0; j < m; j++) {
          paramw.h();
          paramw.k();
        } 
        for (j = 0; j < k; j++) {
          paramw.h();
          paramw.k();
        } 
        k = m + k;
      } 
      b++;
    } 
  }
  
  private void k(long paramLong1, int paramInt1, int paramInt2, long paramLong2) {
    if (this.e) {
      this.d.e(paramLong1, paramInt1, paramInt2, paramLong2);
    } else {
      this.g.e(paramInt2);
      this.h.e(paramInt2);
      this.i.e(paramInt2);
    } 
    this.j.e(paramInt2);
    this.k.e(paramInt2);
  }
  
  public void b(v paramv) {
    while (paramv.a() > 0) {
      int i = paramv.c();
      int j = paramv.d();
      byte[] arrayOfByte = paramv.a;
      this.l += paramv.a();
      this.c.b(paramv, paramv.a());
      while (i < j) {
        int k = s.c(arrayOfByte, i, j, this.f);
        if (k == j) {
          g(arrayOfByte, i, j);
          return;
        } 
        int m = s.e(arrayOfByte, k);
        int n = k - i;
        if (n > 0)
          g(arrayOfByte, i, k); 
        int i1 = j - k;
        long l = this.l - i1;
        if (n < 0) {
          i = -n;
        } else {
          i = 0;
        } 
        a(l, i1, i, this.m);
        k(l, i1, m, this.m);
        i = k + 3;
      } 
    } 
  }
  
  public void c() {
    s.a(this.f);
    this.g.d();
    this.h.d();
    this.i.d();
    this.j.d();
    this.k.d();
    this.d.d();
    this.l = 0L;
  }
  
  public void d() {}
  
  public void e(j paramj, h0.d paramd) {
    paramd.a();
    this.b = paramd.b();
    v v1 = paramj.g(paramd.c(), 2);
    this.c = v1;
    this.d = new a(v1);
    this.a.b(paramj, paramd);
  }
  
  public void f(long paramLong, int paramInt) {
    this.m = paramLong;
  }
  
  private static final class a {
    private final v a;
    
    private long b;
    
    private boolean c;
    
    private int d;
    
    private long e;
    
    private boolean f;
    
    private boolean g;
    
    private boolean h;
    
    private boolean i;
    
    private boolean j;
    
    private long k;
    
    private long l;
    
    private boolean m;
    
    public a(v param1v) {
      this.a = param1v;
    }
    
    private void b(int param1Int) {
      boolean bool = this.m;
      int i = (int)(this.b - this.k);
      this.a.c(this.l, bool, i, param1Int, null);
    }
    
    public void a(long param1Long, int param1Int) {
      if (this.j && this.g) {
        this.m = this.c;
        this.j = false;
      } else if (this.h || this.g) {
        if (this.i)
          b(param1Int + (int)(param1Long - this.b)); 
        this.k = this.b;
        this.l = this.e;
        this.i = true;
        this.m = this.c;
      } 
    }
    
    public void c(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      if (this.f) {
        int i = this.d;
        int j = param1Int1 + 2 - i;
        if (j < param1Int2) {
          boolean bool;
          if ((param1ArrayOfbyte[j] & 0x80) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          this.g = bool;
          this.f = false;
        } else {
          this.d = i + param1Int2 - param1Int1;
        } 
      } 
    }
    
    public void d() {
      this.f = false;
      this.g = false;
      this.h = false;
      this.i = false;
      this.j = false;
    }
    
    public void e(long param1Long1, int param1Int1, int param1Int2, long param1Long2) {
      // Byte code:
      //   0: iconst_0
      //   1: istore #7
      //   3: aload_0
      //   4: iconst_0
      //   5: putfield g : Z
      //   8: aload_0
      //   9: iconst_0
      //   10: putfield h : Z
      //   13: aload_0
      //   14: lload #5
      //   16: putfield e : J
      //   19: aload_0
      //   20: iconst_0
      //   21: putfield d : I
      //   24: aload_0
      //   25: lload_1
      //   26: putfield b : J
      //   29: iload #4
      //   31: bipush #32
      //   33: if_icmplt -> 82
      //   36: aload_0
      //   37: getfield j : Z
      //   40: ifne -> 60
      //   43: aload_0
      //   44: getfield i : Z
      //   47: ifeq -> 60
      //   50: aload_0
      //   51: iload_3
      //   52: invokespecial b : (I)V
      //   55: aload_0
      //   56: iconst_0
      //   57: putfield i : Z
      //   60: iload #4
      //   62: bipush #34
      //   64: if_icmpgt -> 82
      //   67: aload_0
      //   68: aload_0
      //   69: getfield j : Z
      //   72: iconst_1
      //   73: ixor
      //   74: putfield h : Z
      //   77: aload_0
      //   78: iconst_1
      //   79: putfield j : Z
      //   82: iload #4
      //   84: bipush #16
      //   86: if_icmplt -> 102
      //   89: iload #4
      //   91: bipush #21
      //   93: if_icmpgt -> 102
      //   96: iconst_1
      //   97: istore #8
      //   99: goto -> 105
      //   102: iconst_0
      //   103: istore #8
      //   105: aload_0
      //   106: iload #8
      //   108: putfield c : Z
      //   111: iload #8
      //   113: ifne -> 127
      //   116: iload #7
      //   118: istore #8
      //   120: iload #4
      //   122: bipush #9
      //   124: if_icmpgt -> 130
      //   127: iconst_1
      //   128: istore #8
      //   130: aload_0
      //   131: iload #8
      //   133: putfield f : Z
      //   136: return
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */