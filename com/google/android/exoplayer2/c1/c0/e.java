package com.google.android.exoplayer2.c1.c0;

import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.util.v;
import java.util.Arrays;

final class e {
  private final f a = new f();
  
  private final v b = new v(new byte[65025], 0);
  
  private int c = -1;
  
  private int d;
  
  private boolean e;
  
  private int a(int paramInt) {
    int j;
    int i = 0;
    this.d = 0;
    while (true) {
      int k = this.d;
      f f1 = this.a;
      j = i;
      if (paramInt + k < f1.g) {
        int[] arrayOfInt = f1.j;
        this.d = k + 1;
        k = arrayOfInt[k + paramInt];
        j = i + k;
        i = j;
        if (k != 255)
          break; 
        continue;
      } 
      break;
    } 
    return j;
  }
  
  public f b() {
    return this.a;
  }
  
  public v c() {
    return this.b;
  }
  
  public boolean d(i parami) {
    boolean bool;
    if (parami != null) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.f(bool);
    if (this.e) {
      this.e = false;
      this.b.H();
    } 
    while (!this.e) {
      if (this.c < 0) {
        boolean bool1;
        if (!this.a.a(parami, true))
          return false; 
        f f1 = this.a;
        int m = f1.h;
        if ((f1.b & 0x1) == 1 && this.b.d() == 0) {
          m += a(0);
          bool1 = this.d + 0;
        } else {
          bool1 = false;
        } 
        parami.i(m);
        this.c = bool1;
      } 
      int k = a(this.c);
      int j = this.c + this.d;
      if (k > 0) {
        if (this.b.b() < this.b.d() + k) {
          v v2 = this.b;
          v2.a = Arrays.copyOf(v2.a, v2.d() + k);
        } 
        v v1 = this.b;
        parami.readFully(v1.a, v1.d(), k);
        v1 = this.b;
        v1.L(v1.d() + k);
        if (this.a.j[j - 1] != 255) {
          bool = true;
        } else {
          bool = false;
        } 
        this.e = bool;
      } 
      k = j;
      if (j == this.a.g)
        k = -1; 
      this.c = k;
    } 
    return true;
  }
  
  public void e() {
    this.a.b();
    this.b.H();
    this.c = -1;
    this.e = false;
  }
  
  public void f() {
    v v1 = this.b;
    byte[] arrayOfByte = v1.a;
    if (arrayOfByte.length == 65025)
      return; 
    v1.a = Arrays.copyOf(arrayOfByte, Math.max(65025, v1.d()));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/c0/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */