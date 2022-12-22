package com.google.android.exoplayer2.c1.d0;

import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;

public final class b0 implements h0 {
  private final a0 a;
  
  private final v b;
  
  private int c;
  
  private int d;
  
  private boolean e;
  
  private boolean f;
  
  public b0(a0 parama0) {
    this.a = parama0;
    this.b = new v(32);
  }
  
  public void a(e0 parame0, j paramj, h0.d paramd) {
    this.a.a(parame0, paramj, paramd);
    this.f = true;
  }
  
  public void b(v paramv, int paramInt) {
    int i;
    if ((paramInt & 0x1) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (paramInt != 0) {
      i = paramv.z();
      i = paramv.c() + i;
    } else {
      i = -1;
    } 
    if (this.f) {
      if (paramInt == 0)
        return; 
      this.f = false;
      paramv.M(i);
      this.d = 0;
    } 
    while (paramv.a() > 0) {
      paramInt = this.d;
      if (paramInt < 3) {
        if (paramInt == 0) {
          paramInt = paramv.z();
          paramv.M(paramv.c() - 1);
          if (paramInt == 255) {
            this.f = true;
            return;
          } 
        } 
        paramInt = Math.min(paramv.a(), 3 - this.d);
        paramv.h(this.b.a, this.d, paramInt);
        paramInt = this.d + paramInt;
        this.d = paramInt;
        if (paramInt == 3) {
          boolean bool;
          this.b.I(3);
          this.b.N(1);
          i = this.b.z();
          paramInt = this.b.z();
          if ((i & 0x80) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          this.e = bool;
          this.c = ((i & 0xF) << 8 | paramInt) + 3;
          i = this.b.b();
          paramInt = this.c;
          if (i < paramInt) {
            v v1 = this.b;
            byte[] arrayOfByte = v1.a;
            v1.I(Math.min(4098, Math.max(paramInt, arrayOfByte.length * 2)));
            System.arraycopy(arrayOfByte, 0, this.b.a, 0, 3);
          } 
        } 
        continue;
      } 
      paramInt = Math.min(paramv.a(), this.c - this.d);
      paramv.h(this.b.a, this.d, paramInt);
      paramInt = this.d + paramInt;
      this.d = paramInt;
      i = this.c;
      if (paramInt == i) {
        if (this.e) {
          if (h0.q(this.b.a, 0, i, -1) != 0) {
            this.f = true;
            return;
          } 
          this.b.I(this.c - 4);
        } else {
          this.b.I(i);
        } 
        this.a.b(this.b);
        this.d = 0;
      } 
    } 
  }
  
  public void c() {
    this.f = true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */