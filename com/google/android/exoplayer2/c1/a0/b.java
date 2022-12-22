package com.google.android.exoplayer2.c1.a0;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.util.e;
import java.util.ArrayDeque;

final class b implements d {
  private final byte[] a = new byte[8];
  
  private final ArrayDeque<b> b = new ArrayDeque<b>();
  
  private final g c = new g();
  
  private c d;
  
  private int e;
  
  private int f;
  
  private long g;
  
  private long d(i parami) {
    parami.h();
    while (true) {
      parami.k(this.a, 0, 4);
      int j = g.c(this.a[0]);
      if (j != -1 && j <= 4) {
        int k = (int)g.a(this.a, j, false);
        if (this.d.c(k)) {
          parami.i(j);
          return k;
        } 
      } 
      parami.i(1);
    } 
  }
  
  private double e(i parami, int paramInt) {
    double d1;
    long l = f(parami, paramInt);
    if (paramInt == 4) {
      d1 = Float.intBitsToFloat((int)l);
    } else {
      d1 = Double.longBitsToDouble(l);
    } 
    return d1;
  }
  
  private long f(i parami, int paramInt) {
    byte[] arrayOfByte = this.a;
    byte b1 = 0;
    parami.readFully(arrayOfByte, 0, paramInt);
    long l = 0L;
    while (b1 < paramInt) {
      l = l << 8L | (this.a[b1] & 0xFF);
      b1++;
    } 
    return l;
  }
  
  private String g(i parami, int paramInt) {
    if (paramInt == 0)
      return ""; 
    byte[] arrayOfByte = new byte[paramInt];
    parami.readFully(arrayOfByte, 0, paramInt);
    while (paramInt > 0 && arrayOfByte[paramInt - 1] == 0)
      paramInt--; 
    return new String(arrayOfByte, 0, paramInt);
  }
  
  public void a() {
    this.e = 0;
    this.b.clear();
    this.c.e();
  }
  
  public boolean b(i parami) {
    e.e(this.d);
    while (true) {
      StringBuilder stringBuilder;
      if (!this.b.isEmpty() && parami.a() >= b.a(this.b.peek())) {
        this.d.a(b.b(this.b.pop()));
        return true;
      } 
      if (this.e == 0) {
        long l1 = this.c.d(parami, true, false, 4);
        long l2 = l1;
        if (l1 == -2L)
          l2 = d(parami); 
        if (l2 == -1L)
          return false; 
        this.f = (int)l2;
        this.e = 1;
      } 
      if (this.e == 1) {
        this.g = this.c.d(parami, false, true, 8);
        this.e = 2;
      } 
      int j = this.d.b(this.f);
      if (j != 0) {
        if (j != 1) {
          if (j != 2) {
            if (j != 3) {
              if (j != 4) {
                if (j == 5) {
                  long l4 = this.g;
                  if (l4 == 4L || l4 == 8L) {
                    this.d.f(this.f, e(parami, (int)l4));
                    this.e = 0;
                    return true;
                  } 
                  StringBuilder stringBuilder1 = new StringBuilder();
                  stringBuilder1.append("Invalid float size: ");
                  stringBuilder1.append(this.g);
                  throw new ParserException(stringBuilder1.toString());
                } 
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid element type ");
                stringBuilder.append(j);
                throw new ParserException(stringBuilder.toString());
              } 
              this.d.d(this.f, (int)this.g, (i)stringBuilder);
              this.e = 0;
              return true;
            } 
            long l3 = this.g;
            if (l3 <= 2147483647L) {
              this.d.e(this.f, g((i)stringBuilder, (int)l3));
              this.e = 0;
              return true;
            } 
            stringBuilder = new StringBuilder();
            stringBuilder.append("String element size: ");
            stringBuilder.append(this.g);
            throw new ParserException(stringBuilder.toString());
          } 
          long l = this.g;
          if (l <= 8L) {
            this.d.h(this.f, f((i)stringBuilder, (int)l));
            this.e = 0;
            return true;
          } 
          stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid integer size: ");
          stringBuilder.append(this.g);
          throw new ParserException(stringBuilder.toString());
        } 
        long l2 = stringBuilder.a();
        long l1 = this.g;
        this.b.push(new b(this.f, l1 + l2, null));
        this.d.g(this.f, l2, this.g);
        this.e = 0;
        return true;
      } 
      stringBuilder.i((int)this.g);
      this.e = 0;
    } 
  }
  
  public void c(c paramc) {
    this.d = paramc;
  }
  
  private static final class b {
    private final int a;
    
    private final long b;
    
    private b(int param1Int, long param1Long) {
      this.a = param1Int;
      this.b = param1Long;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/a0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */