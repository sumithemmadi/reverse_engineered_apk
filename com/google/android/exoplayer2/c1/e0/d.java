package com.google.android.exoplayer2.c1.e0;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;

final class d {
  public static c a(i parami) {
    StringBuilder stringBuilder;
    byte[] arrayOfByte;
    boolean bool;
    e.e(parami);
    v v = new v(16);
    if ((a.a(parami, v)).a != 1380533830)
      return null; 
    parami.k(v.a, 0, 4);
    v.M(0);
    int j = v.k();
    if (j != 1463899717) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unsupported RIFF format: ");
      stringBuilder.append(j);
      o.c("WavHeaderReader", stringBuilder.toString());
      return null;
    } 
    a a;
    for (a = a.a((i)stringBuilder, v); a.a != 1718449184; a = a.a((i)stringBuilder, v))
      stringBuilder.e((int)a.b); 
    if (a.b >= 16L) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    stringBuilder.k(v.a, 0, 16);
    v.M(0);
    int k = v.r();
    int m = v.r();
    j = v.q();
    int n = v.q();
    int i1 = v.r();
    int i2 = v.r();
    int i3 = (int)a.b - 16;
    if (i3 > 0) {
      byte[] arrayOfByte1 = new byte[i3];
      stringBuilder.k(arrayOfByte1, 0, i3);
      arrayOfByte = arrayOfByte1;
    } else {
      arrayOfByte = h0.f;
    } 
    return new c(k, m, j, n, i1, i2, arrayOfByte);
  }
  
  public static Pair<Long, Long> b(i parami) {
    e.e(parami);
    parami.h();
    v v = new v(8);
    a a = a.a(parami, v);
    while (true) {
      StringBuilder stringBuilder;
      int j = a.a;
      if (j != 1684108385) {
        if (j != 1380533830 && j != 1718449184) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Ignoring unknown WAV chunk: ");
          stringBuilder1.append(a.a);
          o.f("WavHeaderReader", stringBuilder1.toString());
        } 
        long l = a.b + 8L;
        if (a.a == 1380533830)
          l = 12L; 
        if (l <= 2147483647L) {
          parami.i((int)l);
          a = a.a(parami, v);
          continue;
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Chunk is too large (~2GB+) to skip; id: ");
        stringBuilder.append(a.a);
        throw new ParserException(stringBuilder.toString());
      } 
      stringBuilder.i(8);
      long l2 = stringBuilder.a();
      long l3 = a.b + l2;
      long l4 = stringBuilder.getLength();
      long l1 = l3;
      if (l4 != -1L) {
        l1 = l3;
        if (l3 > l4) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Data exceeds input length: ");
          stringBuilder.append(l3);
          stringBuilder.append(", ");
          stringBuilder.append(l4);
          o.f("WavHeaderReader", stringBuilder.toString());
          l1 = l4;
        } 
      } 
      return Pair.create(Long.valueOf(l2), Long.valueOf(l1));
    } 
  }
  
  private static final class a {
    public final int a;
    
    public final long b;
    
    private a(int param1Int, long param1Long) {
      this.a = param1Int;
      this.b = param1Long;
    }
    
    public static a a(i param1i, v param1v) {
      param1i.k(param1v.a, 0, 8);
      param1v.M(0);
      return new a(param1v.k(), param1v.p());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/e0/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */