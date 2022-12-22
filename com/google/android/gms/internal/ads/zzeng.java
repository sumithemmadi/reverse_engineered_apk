package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Iterator;

final class zzeng extends zzejr {
  static final int[] e = new int[] { 
      1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 
      89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 
      10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 
      1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 
      165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE };
  
  private final int zzitv;
  
  private final zzejr zzitw;
  
  private final zzejr zzitx;
  
  private final int zzity;
  
  private final int zzitz;
  
  private zzeng(zzejr paramzzejr1, zzejr paramzzejr2) {
    this.zzitw = paramzzejr1;
    this.zzitx = paramzzejr2;
    int i = paramzzejr1.size();
    this.zzity = i;
    this.zzitv = i + paramzzejr2.size();
    this.zzitz = Math.max(paramzzejr1.zzbgm(), paramzzejr2.zzbgm()) + 1;
  }
  
  private static zzejr f(zzejr paramzzejr1, zzejr paramzzejr2) {
    int i = paramzzejr1.size();
    int j = paramzzejr2.size();
    byte[] arrayOfByte = new byte[i + j];
    paramzzejr1.zza(arrayOfByte, 0, 0, i);
    paramzzejr2.zza(arrayOfByte, 0, i, j);
    return zzejr.zzu(arrayOfByte);
  }
  
  static zzejr zza(zzejr paramzzejr1, zzejr paramzzejr2) {
    if (paramzzejr2.size() == 0)
      return paramzzejr1; 
    if (paramzzejr1.size() == 0)
      return paramzzejr2; 
    int i = paramzzejr1.size() + paramzzejr2.size();
    if (i < 128)
      return f(paramzzejr1, paramzzejr2); 
    if (paramzzejr1 instanceof zzeng) {
      zzeng zzeng1 = (zzeng)paramzzejr1;
      if (zzeng1.zzitx.size() + paramzzejr2.size() < 128) {
        paramzzejr1 = f(zzeng1.zzitx, paramzzejr2);
        return new zzeng(zzeng1.zzitw, paramzzejr1);
      } 
      if (zzeng1.zzitw.zzbgm() > zzeng1.zzitx.zzbgm() && zzeng1.zzbgm() > paramzzejr2.zzbgm()) {
        paramzzejr1 = new zzeng(zzeng1.zzitx, paramzzejr2);
        return new zzeng(zzeng1.zzitw, paramzzejr1);
      } 
    } 
    return (i >= zzhr(Math.max(paramzzejr1.zzbgm(), paramzzejr2.zzbgm()) + 1)) ? new zzeng(paramzzejr1, paramzzejr2) : n62.a(new n62(null), paramzzejr1, paramzzejr2);
  }
  
  static int zzhr(int paramInt) {
    int[] arrayOfInt = e;
    return (paramInt >= arrayOfInt.length) ? Integer.MAX_VALUE : arrayOfInt[paramInt];
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof zzejr))
      return false; 
    paramObject = paramObject;
    if (this.zzitv != paramObject.size())
      return false; 
    if (this.zzitv == 0)
      return true; 
    int i = zzbgo();
    int j = paramObject.zzbgo();
    if (i != 0 && j != 0 && i != j)
      return false; 
    m62 m621 = new m62(this, null);
    zzejy zzejy = m621.next();
    m62 m622 = new m62((zzejr)paramObject, null);
    paramObject = m622.next();
    i = 0;
    j = 0;
    int k = 0;
    while (true) {
      boolean bool;
      int m = zzejy.size() - i;
      int n = paramObject.size() - j;
      int i1 = Math.min(m, n);
      if (i == 0) {
        bool = zzejy.zza((zzejr)paramObject, j, i1);
      } else {
        bool = paramObject.zza(zzejy, i, i1);
      } 
      if (!bool)
        return false; 
      k += i1;
      int i2 = this.zzitv;
      if (k >= i2) {
        if (k == i2)
          return true; 
        throw new IllegalStateException();
      } 
      if (i1 == m) {
        zzejy = m621.next();
        i = 0;
      } else {
        i += i1;
      } 
      if (i1 == n) {
        paramObject = m622.next();
        j = 0;
        continue;
      } 
      j += i1;
    } 
  }
  
  public final int size() {
    return this.zzitv;
  }
  
  protected final String zza(Charset paramCharset) {
    return new String(toByteArray(), paramCharset);
  }
  
  final void zza(d32 paramd32) {
    this.zzitw.zza(paramd32);
    this.zzitx.zza(paramd32);
  }
  
  public final zzejr zzaa(int paramInt1, int paramInt2) {
    int i = zzejr.zzi(paramInt1, paramInt2, this.zzitv);
    if (i == 0)
      return zzejr.b; 
    if (i == this.zzitv)
      return this; 
    i = this.zzity;
    if (paramInt2 <= i)
      return this.zzitw.zzaa(paramInt1, paramInt2); 
    if (paramInt1 >= i)
      return this.zzitx.zzaa(paramInt1 - i, paramInt2 - i); 
    zzejr zzejr1 = this.zzitw;
    return new zzeng(zzejr1.zzaa(paramInt1, zzejr1.size()), this.zzitx.zzaa(0, paramInt2 - this.zzity));
  }
  
  protected final void zzb(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    int i = this.zzity;
    if (paramInt1 + paramInt3 <= i) {
      this.zzitw.zzb(paramArrayOfbyte, paramInt1, paramInt2, paramInt3);
      return;
    } 
    if (paramInt1 >= i) {
      this.zzitx.zzb(paramArrayOfbyte, paramInt1 - i, paramInt2, paramInt3);
      return;
    } 
    i -= paramInt1;
    this.zzitw.zzb(paramArrayOfbyte, paramInt1, paramInt2, i);
    this.zzitx.zzb(paramArrayOfbyte, 0, paramInt2 + i, paramInt3 - i);
  }
  
  public final j32 zzbgh() {
    return new l62(this);
  }
  
  public final boolean zzbgj() {
    int i = this.zzitw.zzg(0, 0, this.zzity);
    zzejr zzejr1 = this.zzitx;
    return (zzejr1.zzg(i, 0, zzejr1.size()) == 0);
  }
  
  public final o32 zzbgk() {
    return new t32(new p62(this), 4096, null);
  }
  
  protected final int zzbgm() {
    return this.zzitz;
  }
  
  protected final boolean zzbgn() {
    return (this.zzitv >= zzhr(this.zzitz));
  }
  
  public final byte zzfz(int paramInt) {
    zzejr.zzab(paramInt, this.zzitv);
    return super.zzga(paramInt);
  }
  
  protected final int zzg(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.zzity;
    if (paramInt2 + paramInt3 <= i)
      return this.zzitw.zzg(paramInt1, paramInt2, paramInt3); 
    if (paramInt2 >= i)
      return this.zzitx.zzg(paramInt1, paramInt2 - i, paramInt3); 
    i -= paramInt2;
    paramInt1 = this.zzitw.zzg(paramInt1, paramInt2, i);
    return this.zzitx.zzg(paramInt1, 0, paramInt3 - i);
  }
  
  final byte zzga(int paramInt) {
    int i = this.zzity;
    return (paramInt < i) ? this.zzitw.zzga(paramInt) : this.zzitx.zzga(paramInt - i);
  }
  
  protected final int zzh(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.zzity;
    if (paramInt2 + paramInt3 <= i)
      return this.zzitw.zzh(paramInt1, paramInt2, paramInt3); 
    if (paramInt2 >= i)
      return this.zzitx.zzh(paramInt1, paramInt2 - i, paramInt3); 
    i -= paramInt2;
    paramInt1 = this.zzitw.zzh(paramInt1, paramInt2, i);
    return this.zzitx.zzh(paramInt1, 0, paramInt3 - i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzeng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */