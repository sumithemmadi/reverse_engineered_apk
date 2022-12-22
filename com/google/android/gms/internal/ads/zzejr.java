package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzejr implements Serializable, Iterable<Byte> {
  public static final zzejr b = new zzekb(m42.c);
  
  private static final k32 c;
  
  private static final Comparator<zzejr> d = new h32();
  
  private int zzilf = 0;
  
  private static zzejr a(Iterator<zzejr> paramIterator, int paramInt) {
    if (paramInt > 0) {
      zzejr zzejr1;
      StringBuilder stringBuilder;
      if (paramInt == 1) {
        zzejr1 = paramIterator.next();
      } else {
        int i = paramInt >>> 1;
        zzejr zzejr2 = a((Iterator<zzejr>)zzejr1, i);
        zzejr1 = a((Iterator<zzejr>)zzejr1, paramInt - i);
        if (Integer.MAX_VALUE - zzejr2.size() >= zzejr1.size())
          return zzeng.zza(zzejr2, zzejr1); 
        paramInt = zzejr2.size();
        i = zzejr1.size();
        stringBuilder = new StringBuilder(53);
        stringBuilder.append("ByteString would be too long: ");
        stringBuilder.append(paramInt);
        stringBuilder.append("+");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      return (zzejr)stringBuilder;
    } 
    throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  private static int c(byte paramByte) {
    return paramByte & 0xFF;
  }
  
  static void zzab(int paramInt1, int paramInt2) {
    if ((paramInt2 - paramInt1 + 1 | paramInt1) < 0) {
      if (paramInt1 < 0) {
        StringBuilder stringBuilder1 = new StringBuilder(22);
        stringBuilder1.append("Index < 0: ");
        stringBuilder1.append(paramInt1);
        throw new ArrayIndexOutOfBoundsException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder(40);
      stringBuilder.append("Index > length: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(", ");
      stringBuilder.append(paramInt2);
      throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    } 
  }
  
  public static n32 zzbgl() {
    return new n32(128);
  }
  
  public static zzejr zzf(InputStream paramInputStream) {
    ArrayList<zzejr> arrayList = new ArrayList();
    int i = 256;
    while (true) {
      zzejr zzejr1;
      byte[] arrayOfByte = new byte[i];
      int j = 0;
      while (j < i) {
        int k = paramInputStream.read(arrayOfByte, j, i - j);
        if (k != -1)
          j += k; 
      } 
      if (j == 0) {
        arrayOfByte = null;
      } else {
        zzejr1 = zzi(arrayOfByte, 0, j);
      } 
      if (zzejr1 != null) {
        arrayList.add(zzejr1);
        i = Math.min(i << 1, 8192);
        continue;
      } 
      return zzl(arrayList);
    } 
  }
  
  static l32 zzgb(int paramInt) {
    return new l32(paramInt, null);
  }
  
  public static zzejr zzhy(String paramString) {
    return new zzekb(paramString.getBytes(m42.a));
  }
  
  static int zzi(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0) {
      if (paramInt1 >= 0) {
        if (paramInt2 < paramInt1) {
          StringBuilder stringBuilder2 = new StringBuilder(66);
          stringBuilder2.append("Beginning index larger than ending index: ");
          stringBuilder2.append(paramInt1);
          stringBuilder2.append(", ");
          stringBuilder2.append(paramInt2);
          throw new IndexOutOfBoundsException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder(37);
        stringBuilder1.append("End index: ");
        stringBuilder1.append(paramInt2);
        stringBuilder1.append(" >= ");
        stringBuilder1.append(paramInt3);
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder(32);
      stringBuilder.append("Beginning index: ");
      stringBuilder.append(paramInt1);
      stringBuilder.append(" < 0");
      throw new IndexOutOfBoundsException(stringBuilder.toString());
    } 
    return i;
  }
  
  public static zzejr zzi(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    zzi(paramInt1, paramInt1 + paramInt2, paramArrayOfbyte.length);
    return new zzekb(c.a(paramArrayOfbyte, paramInt1, paramInt2));
  }
  
  public static zzejr zzl(Iterable<zzejr> paramIterable) {
    int i;
    if (!(paramIterable instanceof Collection)) {
      byte b = 0;
      Iterator<zzejr> iterator = paramIterable.iterator();
      while (true) {
        i = b;
        if (iterator.hasNext()) {
          iterator.next();
          b++;
          continue;
        } 
        break;
      } 
    } else {
      i = ((Collection)paramIterable).size();
    } 
    return (i == 0) ? b : a(paramIterable.iterator(), i);
  }
  
  public static zzejr zzt(byte[] paramArrayOfbyte) {
    return zzi(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  static zzejr zzu(byte[] paramArrayOfbyte) {
    return new zzekb(paramArrayOfbyte);
  }
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode() {
    int i = this.zzilf;
    int j = i;
    if (i == 0) {
      j = size();
      i = zzh(j, 0, j);
      j = i;
      if (i == 0)
        j = 1; 
      this.zzilf = j;
    } 
    return j;
  }
  
  public final boolean isEmpty() {
    return (size() == 0);
  }
  
  public abstract int size();
  
  public final byte[] toByteArray() {
    int i = size();
    if (i == 0)
      return m42.c; 
    byte[] arrayOfByte = new byte[i];
    zzb(arrayOfByte, 0, 0, i);
    return arrayOfByte;
  }
  
  public final String toString() {
    String str2;
    Locale locale = Locale.ROOT;
    String str1 = Integer.toHexString(System.identityHashCode(this));
    int i = size();
    if (size() <= 50) {
      str2 = c72.a(this);
    } else {
      str2 = String.valueOf(c72.a(zzaa(0, 47))).concat("...");
    } 
    return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { str1, Integer.valueOf(i), str2 });
  }
  
  protected abstract String zza(Charset paramCharset);
  
  abstract void zza(d32 paramd32);
  
  @Deprecated
  public final void zza(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    zzi(paramInt1, paramInt1 + paramInt3, size());
    zzi(paramInt2, paramInt2 + paramInt3, paramArrayOfbyte.length);
    if (paramInt3 > 0)
      zzb(paramArrayOfbyte, paramInt1, paramInt2, paramInt3); 
  }
  
  public abstract zzejr zzaa(int paramInt1, int paramInt2);
  
  protected abstract void zzb(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3);
  
  public j32 zzbgh() {
    return new f32(this);
  }
  
  public final String zzbgi() {
    Charset charset = m42.a;
    return (size() == 0) ? "" : zza(charset);
  }
  
  public abstract boolean zzbgj();
  
  public abstract o32 zzbgk();
  
  protected abstract int zzbgm();
  
  protected abstract boolean zzbgn();
  
  protected final int zzbgo() {
    return this.zzilf;
  }
  
  public abstract byte zzfz(int paramInt);
  
  protected abstract int zzg(int paramInt1, int paramInt2, int paramInt3);
  
  abstract byte zzga(int paramInt);
  
  protected abstract int zzh(int paramInt1, int paramInt2, int paramInt3);
  
  static {
    i32 i32;
  }
  
  static {
    if (z22.a()) {
      p32 p32 = new p32(null);
    } else {
      i32 = new i32(null);
    } 
    c = i32;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzejr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */