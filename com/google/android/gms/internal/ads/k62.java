package com.google.android.gms.internal.ads;

final class k62 implements s52 {
  private final u52 a;
  
  private final String b;
  
  private final Object[] c;
  
  private final int d;
  
  k62(u52 paramu52, String paramString, Object[] paramArrayOfObject) {
    this.a = paramu52;
    this.b = paramString;
    this.c = paramArrayOfObject;
    char c = paramString.charAt(0);
    if (c < '?') {
      this.d = c;
      return;
    } 
    int i = c & 0x1FFF;
    byte b = 13;
    c = '\001';
    while (true) {
      char c1 = paramString.charAt(c);
      if (c1 >= '?') {
        i |= (c1 & 0x1FFF) << b;
        b += 13;
        c++;
        continue;
      } 
      this.d = i | c1 << b;
      return;
    } 
  }
  
  public final u52 a() {
    return this.a;
  }
  
  public final int b() {
    return ((this.d & 0x1) == 1) ? e62.a : e62.b;
  }
  
  public final boolean c() {
    return ((this.d & 0x2) == 2);
  }
  
  final String d() {
    return this.b;
  }
  
  final Object[] e() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/k62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */