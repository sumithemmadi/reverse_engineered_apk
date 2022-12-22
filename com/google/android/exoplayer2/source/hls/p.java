package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.text.s.h;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.v;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class p implements h {
  private static final Pattern a = Pattern.compile("LOCAL:([^,]+)");
  
  private static final Pattern b = Pattern.compile("MPEGTS:(\\d+)");
  
  private final String c;
  
  private final e0 d;
  
  private final v e;
  
  private j f;
  
  private byte[] g;
  
  private int h;
  
  public p(String paramString, e0 parame0) {
    this.c = paramString;
    this.d = parame0;
    this.e = new v();
    this.g = new byte[1024];
  }
  
  @RequiresNonNull({"output"})
  private v b(long paramLong) {
    v v1 = this.f.g(0, 3);
    v1.d(Format.B(null, "text/vtt", null, -1, 0, this.c, null, paramLong));
    this.f.f();
    return v1;
  }
  
  @RequiresNonNull({"output"})
  private void c() {
    StringBuilder stringBuilder;
    v v1 = new v(this.g);
    h.e(v1);
    String str = v1.m();
    long l1 = 0L;
    long l2 = l1;
    while (!TextUtils.isEmpty(str)) {
      if (str.startsWith("X-TIMESTAMP-MAP")) {
        Matcher matcher1 = a.matcher(str);
        if (matcher1.find()) {
          Matcher matcher2 = b.matcher(str);
          if (matcher2.find()) {
            l2 = h.d(matcher1.group(1));
            l1 = e0.f(Long.parseLong(matcher2.group(1)));
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
            stringBuilder.append(str);
            throw new ParserException(stringBuilder.toString());
          } 
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
          stringBuilder.append(str);
          throw new ParserException(stringBuilder.toString());
        } 
      } 
      str = stringBuilder.m();
    } 
    Matcher matcher = h.a((v)stringBuilder);
    if (matcher == null) {
      b(0L);
      return;
    } 
    long l3 = h.d(matcher.group(1));
    l2 = this.d.b(e0.i(l1 + l3 - l2));
    v v2 = b(l2 - l3);
    this.e.K(this.g, this.h);
    v2.b(this.e, this.h);
    v2.c(l2, 1, this.h, 0, null);
  }
  
  public void a() {}
  
  public boolean e(i parami) {
    parami.c(this.g, 0, 6, false);
    this.e.K(this.g, 6);
    if (h.b(this.e))
      return true; 
    parami.c(this.g, 6, 3, false);
    this.e.K(this.g, 9);
    return h.b(this.e);
  }
  
  public int g(i parami, s params) {
    e.e(this.f);
    int k = (int)parami.getLength();
    int m = this.h;
    byte[] arrayOfByte = this.g;
    if (m == arrayOfByte.length) {
      if (k != -1) {
        m = k;
      } else {
        m = arrayOfByte.length;
      } 
      this.g = Arrays.copyOf(arrayOfByte, m * 3 / 2);
    } 
    arrayOfByte = this.g;
    m = this.h;
    m = parami.read(arrayOfByte, m, arrayOfByte.length - m);
    if (m != -1) {
      m = this.h + m;
      this.h = m;
      if (k == -1 || m != k)
        return 0; 
    } 
    c();
    return -1;
  }
  
  public void h(j paramj) {
    this.f = paramj;
    paramj.a((t)new t.b(-9223372036854775807L));
  }
  
  public void i(long paramLong1, long paramLong2) {
    throw new IllegalStateException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */