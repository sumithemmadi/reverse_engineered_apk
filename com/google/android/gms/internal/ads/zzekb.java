package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

class zzekb extends zzejy {
  protected final byte[] zzimk;
  
  zzekb(byte[] paramArrayOfbyte) {
    paramArrayOfbyte.getClass();
    this.zzimk = paramArrayOfbyte;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof zzejr))
      return false; 
    if (super.size() != ((zzejr)paramObject).size())
      return false; 
    if (super.size() == 0)
      return true; 
    if (paramObject instanceof zzekb) {
      paramObject = paramObject;
      int i = zzbgo();
      int j = paramObject.zzbgo();
      return (i != 0 && j != 0 && i != j) ? false : super.zza((zzejr)paramObject, 0, super.size());
    } 
    return paramObject.equals(this);
  }
  
  public int size() {
    return this.zzimk.length;
  }
  
  protected final String zza(Charset paramCharset) {
    return new String(this.zzimk, zzbgp(), super.size(), paramCharset);
  }
  
  final void zza(d32 paramd32) {
    paramd32.a(this.zzimk, zzbgp(), super.size());
  }
  
  final boolean zza(zzejr paramzzejr, int paramInt1, int paramInt2) {
    if (paramInt2 <= paramzzejr.size()) {
      byte[] arrayOfByte;
      int i = paramInt1 + paramInt2;
      if (i <= paramzzejr.size()) {
        if (paramzzejr instanceof zzekb) {
          zzekb zzekb1 = (zzekb)paramzzejr;
          arrayOfByte = this.zzimk;
          byte[] arrayOfByte1 = zzekb1.zzimk;
          int j = zzbgp();
          i = zzbgp();
          for (paramInt1 = zzekb1.zzbgp() + paramInt1; i < j + paramInt2; paramInt1++) {
            if (arrayOfByte[i] != arrayOfByte1[paramInt1])
              return false; 
            i++;
          } 
          return true;
        } 
        return arrayOfByte.zzaa(paramInt1, i).equals(super.zzaa(0, paramInt2));
      } 
      i = arrayOfByte.size();
      StringBuilder stringBuilder1 = new StringBuilder(59);
      stringBuilder1.append("Ran off end of other: ");
      stringBuilder1.append(paramInt1);
      stringBuilder1.append(", ");
      stringBuilder1.append(paramInt2);
      stringBuilder1.append(", ");
      stringBuilder1.append(i);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    paramInt1 = super.size();
    StringBuilder stringBuilder = new StringBuilder(40);
    stringBuilder.append("Length too large: ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(paramInt1);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public final zzejr zzaa(int paramInt1, int paramInt2) {
    paramInt2 = zzejr.zzi(paramInt1, paramInt2, super.size());
    return (paramInt2 == 0) ? zzejr.b : new zzeju(this.zzimk, zzbgp() + paramInt1, paramInt2);
  }
  
  protected void zzb(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    System.arraycopy(this.zzimk, paramInt1, paramArrayOfbyte, paramInt2, paramInt3);
  }
  
  public final boolean zzbgj() {
    int i = zzbgp();
    return p72.j(this.zzimk, i, super.size() + i);
  }
  
  public final o32 zzbgk() {
    return o32.d(this.zzimk, zzbgp(), super.size(), true);
  }
  
  protected int zzbgp() {
    return 0;
  }
  
  public byte zzfz(int paramInt) {
    return this.zzimk[paramInt];
  }
  
  protected final int zzg(int paramInt1, int paramInt2, int paramInt3) {
    paramInt2 = zzbgp() + paramInt2;
    return p72.d(paramInt1, this.zzimk, paramInt2, paramInt3 + paramInt2);
  }
  
  byte zzga(int paramInt) {
    return this.zzimk[paramInt];
  }
  
  protected final int zzh(int paramInt1, int paramInt2, int paramInt3) {
    return m42.c(paramInt1, this.zzimk, zzbgp() + paramInt2, paramInt3);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzekb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */