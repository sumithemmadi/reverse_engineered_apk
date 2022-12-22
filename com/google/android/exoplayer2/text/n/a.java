package com.google.android.exoplayer2.text.n;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.c;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

public final class a extends c {
  private final v o = new v();
  
  private final v p = new v();
  
  private final a q = new a();
  
  private Inflater r;
  
  public a() {
    super("PgsDecoder");
  }
  
  private void C(v paramv) {
    if (paramv.a() > 0 && paramv.f() == 120) {
      if (this.r == null)
        this.r = new Inflater(); 
      if (h0.S(paramv, this.p, this.r)) {
        v v1 = this.p;
        paramv.K(v1.a, v1.d());
      } 
    } 
  }
  
  private static b D(v paramv, a parama) {
    b b;
    int i = paramv.d();
    int j = paramv.z();
    int k = paramv.F();
    int m = paramv.c() + k;
    a a1 = null;
    if (m > i) {
      paramv.M(i);
      return null;
    } 
    if (j != 128) {
      switch (j) {
        default:
          parama = a1;
          paramv.M(m);
          return (b)parama;
        case 22:
          a.c(parama, paramv, k);
          parama = a1;
          paramv.M(m);
          return (b)parama;
        case 21:
          a.b(parama, paramv, k);
          parama = a1;
          paramv.M(m);
          return (b)parama;
        case 20:
          break;
      } 
      a.a(parama, paramv, k);
      parama = a1;
    } else {
      b b1 = parama.d();
      parama.h();
      b = b1;
    } 
    paramv.M(m);
    return b;
  }
  
  protected e z(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    this.o.K(paramArrayOfbyte, paramInt);
    C(this.o);
    this.q.h();
    ArrayList<b> arrayList = new ArrayList();
    while (this.o.a() >= 3) {
      b b = D(this.o, this.q);
      if (b != null)
        arrayList.add(b); 
    } 
    return new b(Collections.unmodifiableList(arrayList));
  }
  
  private static final class a {
    private final v a = new v();
    
    private final int[] b = new int[256];
    
    private boolean c;
    
    private int d;
    
    private int e;
    
    private int f;
    
    private int g;
    
    private int h;
    
    private int i;
    
    private void e(v param1v, int param1Int) {
      if (param1Int < 4)
        return; 
      param1v.N(3);
      if ((param1v.z() & 0x80) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      int j = param1Int - 4;
      param1Int = j;
      if (i) {
        if (j < 7)
          return; 
        param1Int = param1v.C();
        if (param1Int < 4)
          return; 
        this.h = param1v.F();
        this.i = param1v.F();
        this.a.I(param1Int - 4);
        param1Int = j - 7;
      } 
      int i = this.a.c();
      j = this.a.d();
      if (i < j && param1Int > 0) {
        param1Int = Math.min(param1Int, j - i);
        param1v.h(this.a.a, i, param1Int);
        this.a.M(i + param1Int);
      } 
    }
    
    private void f(v param1v, int param1Int) {
      if (param1Int < 19)
        return; 
      this.d = param1v.F();
      this.e = param1v.F();
      param1v.N(11);
      this.f = param1v.F();
      this.g = param1v.F();
    }
    
    private void g(v param1v, int param1Int) {
      if (param1Int % 5 != 2)
        return; 
      param1v.N(2);
      Arrays.fill(this.b, 0);
      int i = param1Int / 5;
      for (param1Int = 0; param1Int < i; param1Int++) {
        int j = param1v.z();
        int k = param1v.z();
        int m = param1v.z();
        int n = param1v.z();
        int i1 = param1v.z();
        double d1 = k;
        double d2 = (m - 128);
        Double.isNaN(d2);
        Double.isNaN(d1);
        k = (int)(1.402D * d2 + d1);
        double d3 = (n - 128);
        Double.isNaN(d3);
        Double.isNaN(d1);
        Double.isNaN(d2);
        m = (int)(d1 - 0.34414D * d3 - d2 * 0.71414D);
        Double.isNaN(d3);
        Double.isNaN(d1);
        n = (int)(d1 + d3 * 1.772D);
        int[] arrayOfInt = this.b;
        k = h0.n(k, 0, 255);
        m = h0.n(m, 0, 255);
        arrayOfInt[j] = h0.n(n, 0, 255) | m << 8 | i1 << 24 | k << 16;
      } 
      this.c = true;
    }
    
    public b d() {
      if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.a.d() == 0 || this.a.c() != this.a.d() || !this.c)
        return null; 
      this.a.M(0);
      int i = this.h * this.i;
      int[] arrayOfInt = new int[i];
      int j = 0;
      while (j < i) {
        int m = this.a.z();
        if (m != 0) {
          int n = j + 1;
          arrayOfInt[j] = this.b[m];
          j = n;
          continue;
        } 
        m = this.a.z();
        if (m != 0) {
          int n;
          if ((m & 0x40) == 0) {
            n = m & 0x3F;
          } else {
            n = (m & 0x3F) << 8 | this.a.z();
          } 
          if ((m & 0x80) == 0) {
            m = 0;
          } else {
            m = this.b[this.a.z()];
          } 
          n += j;
          Arrays.fill(arrayOfInt, j, n, m);
          j = n;
        } 
      } 
      Bitmap bitmap = Bitmap.createBitmap(arrayOfInt, this.h, this.i, Bitmap.Config.ARGB_8888);
      float f1 = this.f;
      int k = this.d;
      float f2 = f1 / k;
      f1 = this.g;
      j = this.e;
      return new b(bitmap, f2, 0, f1 / j, 0, this.h / k, this.i / j);
    }
    
    public void h() {
      this.d = 0;
      this.e = 0;
      this.f = 0;
      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.a.I(0);
      this.c = false;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */