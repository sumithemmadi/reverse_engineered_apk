package com.google.android.gms.internal.ads;

final class s72 extends q72 {
  final int a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    int i = paramInt2;
    if (paramInt1 != 0) {
      if (paramInt2 >= paramInt3)
        return paramInt1; 
      byte b = (byte)paramInt1;
      if (b < -32) {
        if (b >= -62) {
          paramInt1 = paramInt2 + 1;
          if (paramArrayOfbyte[paramInt2] > -65)
            return -1; 
        } else {
          return -1;
        } 
      } else if (b < -16) {
        byte b1 = (byte)(paramInt1 >> 8 ^ 0xFFFFFFFF);
        paramInt1 = b1;
        i = paramInt2;
        if (b1 == 0) {
          i = paramInt2 + 1;
          paramInt1 = paramArrayOfbyte[paramInt2];
          if (i >= paramInt3)
            return p72.c(b, paramInt1); 
        } 
        if (paramInt1 <= -65 && (b != -32 || paramInt1 >= -96) && (b != -19 || paramInt1 < -96)) {
          paramInt1 = i + 1;
          if (paramArrayOfbyte[i] > -65)
            return -1; 
        } else {
          return -1;
        } 
      } else {
        i = (byte)(paramInt1 >> 8 ^ 0xFFFFFFFF);
        if (i == 0) {
          paramInt1 = paramInt2 + 1;
          i = paramArrayOfbyte[paramInt2];
          if (paramInt1 >= paramInt3)
            return p72.c(b, i); 
          paramInt2 = paramInt1;
          paramInt1 = 0;
        } else {
          paramInt1 = (byte)(paramInt1 >> 16);
        } 
        int k = paramInt1;
        int j = paramInt2;
        if (paramInt1 == 0) {
          j = paramInt2 + 1;
          k = paramArrayOfbyte[paramInt2];
          if (j >= paramInt3)
            return p72.i(b, i, k); 
        } 
        if (i <= -65 && (b << 28) + i + 112 >> 30 == 0 && k <= -65) {
          paramInt1 = j + 1;
          if (paramArrayOfbyte[j] > -65)
            return -1; 
        } else {
          return -1;
        } 
      } 
      i = paramInt1;
    } 
    while (i < paramInt3 && paramArrayOfbyte[i] >= 0)
      i++; 
    paramInt1 = i;
    if (i >= paramInt3)
      return 0; 
    while (true) {
      if (paramInt1 >= paramInt3)
        return 0; 
      paramInt2 = paramInt1 + 1;
      i = paramArrayOfbyte[paramInt1];
      paramInt1 = paramInt2;
      if (i < 0) {
        if (i < -32) {
          if (paramInt2 >= paramInt3)
            return i; 
          if (i >= -62) {
            paramInt1 = paramInt2 + 1;
            if (paramArrayOfbyte[paramInt2] > -65)
              return -1; 
            continue;
          } 
          return -1;
        } 
        if (i < -16) {
          if (paramInt2 >= paramInt3 - 1)
            return p72.m(paramArrayOfbyte, paramInt2, paramInt3); 
          int j = paramInt2 + 1;
          paramInt1 = paramArrayOfbyte[paramInt2];
          if (paramInt1 <= -65 && (i != -32 || paramInt1 >= -96) && (i != -19 || paramInt1 < -96)) {
            paramInt1 = j + 1;
            if (paramArrayOfbyte[j] > -65)
              return -1; 
            continue;
          } 
          return -1;
        } 
        if (paramInt2 >= paramInt3 - 2)
          return p72.m(paramArrayOfbyte, paramInt2, paramInt3); 
        paramInt1 = paramInt2 + 1;
        paramInt2 = paramArrayOfbyte[paramInt2];
        if (paramInt2 <= -65 && (i << 28) + paramInt2 + 112 >> 30 == 0) {
          paramInt2 = paramInt1 + 1;
          if (paramArrayOfbyte[paramInt1] <= -65) {
            paramInt1 = paramInt2 + 1;
            if (paramArrayOfbyte[paramInt2] > -65)
              break; 
            continue;
          } 
        } 
        break;
      } 
    } 
    return -1;
  }
  
  final int b(CharSequence paramCharSequence, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramCharSequence.length();
    int j = paramInt2 + paramInt1;
    paramInt2 = 0;
    while (paramInt2 < i) {
      int m = paramInt2 + paramInt1;
      if (m < j) {
        char c = paramCharSequence.charAt(paramInt2);
        if (c < '') {
          paramArrayOfbyte[m] = (byte)(byte)c;
          paramInt2++;
        } 
      } 
    } 
    if (paramInt2 == i)
      return paramInt1 + i; 
    int k = paramInt1 + paramInt2;
    paramInt1 = paramInt2;
    while (paramInt1 < i) {
      char c = paramCharSequence.charAt(paramInt1);
      if (c < '' && k < j) {
        paramInt2 = k + 1;
        paramArrayOfbyte[k] = (byte)(byte)c;
      } else if (c < 'ࠀ' && k <= j - 2) {
        int m = k + 1;
        paramArrayOfbyte[k] = (byte)(byte)(c >>> 6 | 0x3C0);
        paramInt2 = m + 1;
        paramArrayOfbyte[m] = (byte)(byte)(c & 0x3F | 0x80);
      } else if ((c < '?' || '?' < c) && k <= j - 3) {
        paramInt2 = k + 1;
        paramArrayOfbyte[k] = (byte)(byte)(c >>> 12 | 0x1E0);
        k = paramInt2 + 1;
        paramArrayOfbyte[paramInt2] = (byte)(byte)(c >>> 6 & 0x3F | 0x80);
        paramInt2 = k + 1;
        paramArrayOfbyte[k] = (byte)(byte)(c & 0x3F | 0x80);
      } else if (k <= j - 4) {
        paramInt2 = paramInt1 + 1;
        if (paramInt2 != paramCharSequence.length()) {
          char c1 = paramCharSequence.charAt(paramInt2);
          if (Character.isSurrogatePair(c, c1)) {
            paramInt1 = Character.toCodePoint(c, c1);
            int m = k + 1;
            paramArrayOfbyte[k] = (byte)(byte)(paramInt1 >>> 18 | 0xF0);
            k = m + 1;
            paramArrayOfbyte[m] = (byte)(byte)(paramInt1 >>> 12 & 0x3F | 0x80);
            m = k + 1;
            paramArrayOfbyte[k] = (byte)(byte)(paramInt1 >>> 6 & 0x3F | 0x80);
            k = m + 1;
            paramArrayOfbyte[m] = (byte)(byte)(paramInt1 & 0x3F | 0x80);
            paramInt1 = paramInt2;
            paramInt2 = k;
          } else {
            paramInt1 = paramInt2;
            throw new zzeon(paramInt1 - 1, i);
          } 
        } else {
          throw new zzeon(paramInt1 - 1, i);
        } 
      } else {
        if ('?' <= c && c <= '?') {
          paramInt2 = paramInt1 + 1;
          if (paramInt2 == paramCharSequence.length() || !Character.isSurrogatePair(c, paramCharSequence.charAt(paramInt2)))
            throw new zzeon(paramInt1, i); 
        } 
        paramCharSequence = new StringBuilder(37);
        paramCharSequence.append("Failed writing ");
        paramCharSequence.append(c);
        paramCharSequence.append(" at index ");
        paramCharSequence.append(k);
        throw new ArrayIndexOutOfBoundsException(paramCharSequence.toString());
      } 
      paramInt1++;
      k = paramInt2;
    } 
    return k;
  }
  
  final String d(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if ((paramInt1 | paramInt2 | paramArrayOfbyte.length - paramInt1 - paramInt2) >= 0) {
      int i = paramInt1 + paramInt2;
      char[] arrayOfChar = new char[paramInt2];
      paramInt2 = 0;
      while (paramInt1 < i) {
        byte b = paramArrayOfbyte[paramInt1];
        if (r72.m(b)) {
          paramInt1++;
          r72.h(b, arrayOfChar, paramInt2);
          paramInt2++;
        } 
      } 
      int j = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = j;
      while (paramInt2 < i) {
        j = paramInt2 + 1;
        byte b = paramArrayOfbyte[paramInt2];
        if (r72.m(b)) {
          paramInt2 = paramInt1 + 1;
          r72.h(b, arrayOfChar, paramInt1);
          paramInt1 = paramInt2;
          paramInt2 = j;
          while (paramInt2 < i) {
            byte b1 = paramArrayOfbyte[paramInt2];
            if (r72.m(b1)) {
              paramInt2++;
              r72.h(b1, arrayOfChar, paramInt1);
              paramInt1++;
            } 
          } 
          continue;
        } 
        if (r72.n(b)) {
          if (j < i) {
            r72.g(b, paramArrayOfbyte[j], arrayOfChar, paramInt1);
            paramInt2 = j + 1;
            paramInt1++;
            continue;
          } 
          throw zzelo.zzbji();
        } 
        if (r72.o(b)) {
          if (j < i - 1) {
            paramInt2 = j + 1;
            r72.f(b, paramArrayOfbyte[j], paramArrayOfbyte[paramInt2], arrayOfChar, paramInt1);
            paramInt2++;
            paramInt1++;
            continue;
          } 
          throw zzelo.zzbji();
        } 
        if (j < i - 2) {
          paramInt2 = j + 1;
          byte b1 = paramArrayOfbyte[j];
          j = paramInt2 + 1;
          r72.e(b, b1, paramArrayOfbyte[paramInt2], paramArrayOfbyte[j], arrayOfChar, paramInt1);
          paramInt2 = j + 1;
          paramInt1 = paramInt1 + 1 + 1;
          continue;
        } 
        throw zzelo.zzbji();
      } 
      return new String(arrayOfChar, 0, paramInt1);
    } 
    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] { Integer.valueOf(paramArrayOfbyte.length), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    throw arrayIndexOutOfBoundsException;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */