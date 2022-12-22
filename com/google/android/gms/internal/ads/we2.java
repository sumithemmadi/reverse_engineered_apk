package com.google.android.gms.internal.ads;

import java.util.Stack;

final class we2 implements bf2 {
  private final byte[] a = new byte[8];
  
  private final Stack<ye2> b = new Stack<ye2>();
  
  private final gf2 c = new gf2();
  
  private af2 d;
  
  private int e;
  
  private int f;
  
  private long g;
  
  private final long d(le2 paramle2, int paramInt) {
    byte[] arrayOfByte = this.a;
    byte b = 0;
    paramle2.readFully(arrayOfByte, 0, paramInt);
    long l = 0L;
    while (b < paramInt) {
      l = l << 8L | (this.a[b] & 0xFF);
      b++;
    } 
    return l;
  }
  
  public final void a() {
    this.e = 0;
    this.b.clear();
    this.c.a();
  }
  
  public final boolean b(le2 paramle2) {
    boolean bool;
    if (this.d != null) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.e(bool);
    while (true) {
      StringBuilder stringBuilder;
      if (!this.b.isEmpty() && paramle2.a() >= ye2.a(this.b.peek())) {
        this.d.d(ye2.b(this.b.pop()));
        return true;
      } 
      if (this.e == 0) {
        long l1 = this.c.b(paramle2, true, false, 4);
        long l2 = l1;
        if (l1 == -2L) {
          paramle2.b();
          while (true) {
            paramle2.c(this.a, 0, 4);
            int j = gf2.d(this.a[0]);
            if (j != -1 && j <= 4) {
              int k = (int)gf2.c(this.a, j, false);
              if (this.d.a(k)) {
                paramle2.g(j);
                l2 = k;
                break;
              } 
            } 
            paramle2.g(1);
          } 
        } 
        if (l2 == -1L)
          return false; 
        this.f = (int)l2;
        this.e = 1;
      } 
      if (this.e == 1) {
        this.g = this.c.b(paramle2, false, true, 8);
        this.e = 2;
      } 
      int i = this.d.c(this.f);
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              StringBuilder stringBuilder1;
              if (i != 4) {
                if (i == 5) {
                  long l4 = this.g;
                  if (l4 == 4L || l4 == 8L) {
                    double d;
                    af2 af21 = this.d;
                    int j = this.f;
                    i = (int)l4;
                    l4 = d(paramle2, i);
                    if (i == 4) {
                      d = Float.intBitsToFloat((int)l4);
                    } else {
                      d = Double.longBitsToDouble(l4);
                    } 
                    af21.g(j, d);
                    this.e = 0;
                    return true;
                  } 
                  l4 = this.g;
                  StringBuilder stringBuilder2 = new StringBuilder(40);
                  stringBuilder2.append("Invalid float size: ");
                  stringBuilder2.append(l4);
                  throw new zzhw(stringBuilder2.toString());
                } 
                stringBuilder1 = new StringBuilder(32);
                stringBuilder1.append("Invalid element type ");
                stringBuilder1.append(i);
                throw new zzhw(stringBuilder1.toString());
              } 
              this.d.e(this.f, (int)this.g, (le2)stringBuilder1);
              this.e = 0;
              return true;
            } 
            long l3 = this.g;
            if (l3 <= 2147483647L) {
              String str;
              af2 af21 = this.d;
              i = this.f;
              int j = (int)l3;
              if (j == 0) {
                str = "";
              } else {
                byte[] arrayOfByte = new byte[j];
                str.readFully(arrayOfByte, 0, j);
                str = new String(arrayOfByte);
              } 
              af21.f(i, str);
              this.e = 0;
              return true;
            } 
            l3 = this.g;
            stringBuilder = new StringBuilder(41);
            stringBuilder.append("String element size: ");
            stringBuilder.append(l3);
            throw new zzhw(stringBuilder.toString());
          } 
          long l = this.g;
          if (l <= 8L) {
            this.d.h(this.f, d((le2)stringBuilder, (int)l));
            this.e = 0;
            return true;
          } 
          l = this.g;
          stringBuilder = new StringBuilder(42);
          stringBuilder.append("Invalid integer size: ");
          stringBuilder.append(l);
          throw new zzhw(stringBuilder.toString());
        } 
        long l2 = stringBuilder.a();
        long l1 = this.g;
        this.b.add(new ye2(this.f, l1 + l2, null));
        this.d.b(this.f, l2, this.g);
        this.e = 0;
        return true;
      } 
      stringBuilder.g((int)this.g);
      this.e = 0;
    } 
  }
  
  public final void c(af2 paramaf2) {
    this.d = paramaf2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/we2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */