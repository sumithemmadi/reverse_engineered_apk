package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.g;
import com.google.android.exoplayer2.audio.h;
import com.google.android.exoplayer2.c1.p;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.r;
import com.google.android.exoplayer2.util.v;
import com.google.android.exoplayer2.video.h;
import com.google.android.exoplayer2.video.i;
import com.google.android.exoplayer2.video.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class d {
  private static final byte[] a = h0.R("OpusHead");
  
  private static boolean a(long[] paramArrayOflong, long paramLong1, long paramLong2, long paramLong3) {
    int i = paramArrayOflong.length;
    boolean bool = true;
    int j = i - 1;
    i = h0.n(4, 0, j);
    j = h0.n(paramArrayOflong.length - 4, 0, j);
    if (paramArrayOflong[0] > paramLong2 || paramLong2 >= paramArrayOflong[i] || paramArrayOflong[j] >= paramLong3 || paramLong3 > paramLong1)
      bool = false; 
    return bool;
  }
  
  private static int b(v paramv, int paramInt1, int paramInt2) {
    for (int i = paramv.c(); i - paramInt1 < paramInt2; i += j) {
      boolean bool;
      paramv.M(i);
      int j = paramv.k();
      if (j > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      com.google.android.exoplayer2.util.e.b(bool, "childAtomSize should be positive");
      if (paramv.k() == 1702061171)
        return i; 
    } 
    return -1;
  }
  
  private static int c(int paramInt) {
    return (paramInt == 1936684398) ? 1 : ((paramInt == 1986618469) ? 2 : ((paramInt == 1952807028 || paramInt == 1935832172 || paramInt == 1937072756 || paramInt == 1668047728) ? 3 : ((paramInt == 1835365473) ? 4 : -1)));
  }
  
  private static void d(v paramv, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, boolean paramBoolean, DrmInitData paramDrmInitData, c paramc, int paramInt5) {
    int j;
    int k;
    int i = paramInt2;
    paramv.M(i + 8 + 8);
    if (paramBoolean) {
      j = paramv.F();
      paramv.N(6);
    } else {
      paramv.N(8);
      j = 0;
    } 
    if (!j || j == 1) {
      k = paramv.F();
      paramv.N(6);
      int i1 = paramv.A();
      if (j == 1)
        paramv.N(16); 
      j = i1;
    } else if (j == 2) {
      paramv.N(16);
      j = (int)Math.round(paramv.i());
      k = paramv.D();
      paramv.N(20);
    } else {
      return;
    } 
    int n = paramv.c();
    DrmInitData drmInitData = paramDrmInitData;
    int m = paramInt1;
    if (paramInt1 == 1701733217) {
      Pair<Integer, m> pair = p(paramv, i, paramInt3);
      drmInitData = paramDrmInitData;
      if (pair != null) {
        paramInt1 = ((Integer)pair.first).intValue();
        if (paramDrmInitData == null) {
          drmInitData = null;
        } else {
          drmInitData = paramDrmInitData.c(((m)pair.second).b);
        } 
        paramc.a[paramInt5] = (m)pair.second;
      } 
      paramv.M(n);
      m = paramInt1;
    } 
    String str = "audio/raw";
    if (m == 1633889587) {
      str = "audio/ac3";
    } else if (m == 1700998451) {
      str = "audio/eac3";
    } else if (m == 1633889588) {
      str = "audio/ac4";
    } else if (m == 1685353315) {
      str = "audio/vnd.dts";
    } else if (m == 1685353320 || m == 1685353324) {
      str = "audio/vnd.dts.hd";
    } else if (m == 1685353317) {
      str = "audio/vnd.dts.hd;profile=lbr";
    } else if (m == 1935764850) {
      str = "audio/3gpp";
    } else if (m == 1935767394) {
      str = "audio/amr-wb";
    } else {
      byte[] arrayOfByte;
      if (m == 1819304813 || m == 1936684916) {
        m = 2;
      } else if (m == 1953984371) {
        m = 268435456;
      } else {
        if (m == 778924083) {
          str = "audio/mpeg";
        } else if (m == 1634492771) {
          str = "audio/alac";
        } else if (m == 1634492791) {
          str = "audio/g711-alaw";
        } else if (m == 1970037111) {
          str = "audio/g711-mlaw";
        } else if (m == 1332770163) {
          str = "audio/opus";
        } else if (m == 1716281667) {
          str = "audio/flac";
        } else {
          str = null;
        } 
        m = -1;
      } 
      paramInt5 = j;
      paramInt1 = n;
      String str1 = str;
      str = null;
      j = k;
      while (true) {
        int i1;
        if (paramInt1 - paramInt2 < paramInt3) {
          boolean bool;
          paramv.M(paramInt1);
          i1 = paramv.k();
          if (i1 > 0) {
            bool = true;
          } else {
            bool = false;
          } 
          com.google.android.exoplayer2.util.e.b(bool, "childAtomSize should be positive");
          n = paramv.k();
          if (n == 1702061171 || (paramBoolean && n == 2002876005)) {
            k = paramInt1;
            if (n == 1702061171) {
              n = k;
            } else {
              n = b(paramv, k, i1);
            } 
            k = j;
            i = paramInt5;
            if (n != -1) {
              Pair<String, byte[]> pair = g(paramv, n);
              str1 = (String)pair.first;
              arrayOfByte = (byte[])pair.second;
              if ("audio/mp4a-latm".equals(str1)) {
                Pair pair1 = g.g(arrayOfByte);
                paramInt5 = ((Integer)pair1.first).intValue();
                j = ((Integer)pair1.second).intValue();
              } 
              i = paramInt5;
              k = j;
            } 
          } else {
            if (n == 1684103987) {
              paramv.M(paramInt1 + 8);
              paramc.b = g.c(paramv, Integer.toString(paramInt4), paramString, drmInitData);
            } else if (n == 1684366131) {
              paramv.M(paramInt1 + 8);
              paramc.b = g.g(paramv, Integer.toString(paramInt4), paramString, drmInitData);
            } else if (n == 1684103988) {
              paramv.M(paramInt1 + 8);
              paramc.b = h.b(paramv, Integer.toString(paramInt4), paramString, drmInitData);
            } else if (n == 1684305011) {
              paramc.b = Format.p(Integer.toString(paramInt4), str1, null, -1, -1, j, paramInt5, null, drmInitData, 0, paramString);
            } else {
              if (n == 1682927731) {
                k = i1 - 8;
                byte[] arrayOfByte1 = a;
                arrayOfByte = new byte[arrayOfByte1.length + k];
                System.arraycopy(arrayOfByte1, 0, arrayOfByte, 0, arrayOfByte1.length);
                paramv.M(paramInt1 + 8);
                paramv.h(arrayOfByte, arrayOfByte1.length, k);
              } else {
                i = i1;
                k = paramInt1;
                if (n == 1684425825) {
                  i -= 12;
                  arrayOfByte = new byte[i + 4];
                  arrayOfByte[0] = (byte)102;
                  arrayOfByte[1] = (byte)76;
                  arrayOfByte[2] = (byte)97;
                  arrayOfByte[3] = (byte)67;
                  paramv.M(k + 12);
                  paramv.h(arrayOfByte, 4, i);
                } else {
                  if (n == 1634492771) {
                    paramInt5 = i - 12;
                    arrayOfByte = new byte[paramInt5];
                    paramv.M(k + 12);
                    paramv.h(arrayOfByte, 0, paramInt5);
                    Pair pair = g.h(arrayOfByte);
                    paramInt5 = ((Integer)pair.first).intValue();
                    j = ((Integer)pair.second).intValue();
                  } 
                  k = j;
                  i = paramInt5;
                } 
              } 
              k = j;
              i = paramInt5;
              paramInt1 += i1;
              j = k;
              paramInt5 = i;
            } 
            k = j;
            i = paramInt5;
          } 
        } else {
          break;
        } 
        paramInt1 += i1;
        j = k;
        paramInt5 = i;
      } 
      if (paramc.b == null && str1 != null) {
        List<byte> list;
        String str2 = Integer.toString(paramInt4);
        if (arrayOfByte == null) {
          paramv = null;
        } else {
          list = Collections.singletonList(arrayOfByte);
        } 
        paramc.b = Format.o(str2, str1, null, -1, -1, j, paramInt5, m, list, drmInitData, 0, paramString);
      } 
      return;
    } 
    m = -1;
  }
  
  static Pair<Integer, m> e(v paramv, int paramInt1, int paramInt2) {
    int i = paramInt1 + 8;
    boolean bool = false;
    String str1 = null;
    String str2 = str1;
    int j = -1;
    int k = 0;
    while (i - paramInt1 < paramInt2) {
      String str3;
      String str4;
      paramv.M(i);
      int m = paramv.k();
      int n = paramv.k();
      if (n == 1718775137) {
        str3 = (String)Integer.valueOf(paramv.k());
        str4 = str1;
      } else if (n == 1935894637) {
        paramv.N(4);
        str4 = paramv.w(4);
        str3 = str2;
      } else {
        str4 = str1;
        str3 = str2;
        if (n == 1935894633) {
          j = i;
          k = m;
          str3 = str2;
          str4 = str1;
        } 
      } 
      i += m;
      str1 = str4;
      str2 = str3;
    } 
    if ("cenc".equals(str1) || "cbc1".equals(str1) || "cens".equals(str1) || "cbcs".equals(str1)) {
      if (str2 != null) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      com.google.android.exoplayer2.util.e.b(bool1, "frma atom is mandatory");
      if (j != -1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      com.google.android.exoplayer2.util.e.b(bool1, "schi atom is mandatory");
      m m = q(paramv, j, k, str1);
      boolean bool1 = bool;
      if (m != null)
        bool1 = true; 
      com.google.android.exoplayer2.util.e.b(bool1, "tenc atom is mandatory");
      return Pair.create(str2, m);
    } 
    return null;
  }
  
  private static Pair<long[], long[]> f(c.a parama) {
    if (parama != null) {
      c.b b = parama.g(1701606260);
      if (b != null) {
        v v = b.b;
        v.M(8);
        int i = c.c(v.k());
        int j = v.D();
        long[] arrayOfLong2 = new long[j];
        long[] arrayOfLong1 = new long[j];
        byte b1 = 0;
        while (b1 < j) {
          long l;
          if (i == 1) {
            l = v.E();
          } else {
            l = v.B();
          } 
          arrayOfLong2[b1] = l;
          if (i == 1) {
            l = v.s();
          } else {
            l = v.k();
          } 
          arrayOfLong1[b1] = l;
          if (v.v() == 1) {
            v.N(2);
            b1++;
            continue;
          } 
          throw new IllegalArgumentException("Unsupported media rate.");
        } 
        return Pair.create(arrayOfLong2, arrayOfLong1);
      } 
    } 
    return Pair.create(null, null);
  }
  
  private static Pair<String, byte[]> g(v paramv, int paramInt) {
    paramv.M(paramInt + 8 + 4);
    paramv.N(1);
    h(paramv);
    paramv.N(2);
    paramInt = paramv.z();
    if ((paramInt & 0x80) != 0)
      paramv.N(2); 
    if ((paramInt & 0x40) != 0)
      paramv.N(paramv.F()); 
    if ((paramInt & 0x20) != 0)
      paramv.N(2); 
    paramv.N(1);
    h(paramv);
    String str = r.f(paramv.z());
    if ("audio/mpeg".equals(str) || "audio/vnd.dts".equals(str) || "audio/vnd.dts.hd".equals(str))
      return Pair.create(str, null); 
    paramv.N(12);
    paramv.N(1);
    paramInt = h(paramv);
    byte[] arrayOfByte = new byte[paramInt];
    paramv.h(arrayOfByte, 0, paramInt);
    return Pair.create(str, arrayOfByte);
  }
  
  private static int h(v paramv) {
    int i = paramv.z();
    int j;
    for (j = i & 0x7F; (i & 0x80) == 128; j = j << 7 | i & 0x7F)
      i = paramv.z(); 
    return j;
  }
  
  private static int i(v paramv) {
    paramv.M(16);
    return paramv.k();
  }
  
  private static Metadata j(v paramv, int paramInt) {
    Metadata metadata;
    paramv.N(8);
    ArrayList<Metadata.Entry> arrayList = new ArrayList();
    while (paramv.c() < paramInt) {
      Metadata.Entry entry = h.d(paramv);
      if (entry != null)
        arrayList.add(entry); 
    } 
    if (arrayList.isEmpty()) {
      paramv = null;
    } else {
      metadata = new Metadata(arrayList);
    } 
    return metadata;
  }
  
  private static Pair<Long, String> k(v paramv) {
    byte b = 8;
    paramv.M(8);
    int i = c.c(paramv.k());
    if (i == 0) {
      j = 8;
    } else {
      j = 16;
    } 
    paramv.N(j);
    long l = paramv.B();
    int j = b;
    if (i == 0)
      j = 4; 
    paramv.N(j);
    j = paramv.F();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");
    stringBuilder.append((char)((j >> 10 & 0x1F) + 96));
    stringBuilder.append((char)((j >> 5 & 0x1F) + 96));
    stringBuilder.append((char)((j & 0x1F) + 96));
    return Pair.create(Long.valueOf(l), stringBuilder.toString());
  }
  
  public static Metadata l(c.a parama) {
    Metadata metadata;
    c.b b1 = parama.g(1751411826);
    c.b b2 = parama.g(1801812339);
    c.b b3 = parama.g(1768715124);
    c.a a1 = null;
    parama = a1;
    if (b1 != null) {
      parama = a1;
      if (b2 != null) {
        parama = a1;
        if (b3 != null)
          if (i(b1.b) != 1835299937) {
            parama = a1;
          } else {
            v v = b2.b;
            v.M(12);
            int i = v.k();
            String[] arrayOfString = new String[i];
            int j;
            for (j = 0; j < i; j++) {
              int k = v.k();
              v.N(4);
              arrayOfString[j] = v.w(k - 8);
            } 
            v = b3.b;
            v.M(8);
            ArrayList<MdtaMetadataEntry> arrayList = new ArrayList();
            while (v.a() > 8) {
              j = v.c();
              int k = v.k();
              int m = v.k() - 1;
              if (m >= 0 && m < i) {
                MdtaMetadataEntry mdtaMetadataEntry = h.g(v, j + k, arrayOfString[m]);
                if (mdtaMetadataEntry != null)
                  arrayList.add(mdtaMetadataEntry); 
              } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Skipped metadata with unknown key index: ");
                stringBuilder.append(m);
                o.f("AtomParsers", stringBuilder.toString());
              } 
              v.M(j + k);
            } 
            if (arrayList.isEmpty()) {
              c.a a2 = a1;
            } else {
              metadata = new Metadata(arrayList);
            } 
          }  
      } 
    } 
    return metadata;
  }
  
  private static long m(v paramv) {
    byte b = 8;
    paramv.M(8);
    if (c.c(paramv.k()) != 0)
      b = 16; 
    paramv.N(b);
    return paramv.B();
  }
  
  private static float n(v paramv, int paramInt) {
    paramv.M(paramInt + 8);
    paramInt = paramv.D();
    int i = paramv.D();
    return paramInt / i;
  }
  
  private static byte[] o(v paramv, int paramInt1, int paramInt2) {
    for (int i = paramInt1 + 8; i - paramInt1 < paramInt2; i += j) {
      paramv.M(i);
      int j = paramv.k();
      if (paramv.k() == 1886547818)
        return Arrays.copyOfRange(paramv.a, i, j + i); 
    } 
    return null;
  }
  
  private static Pair<Integer, m> p(v paramv, int paramInt1, int paramInt2) {
    for (int i = paramv.c(); i - paramInt1 < paramInt2; i += j) {
      boolean bool;
      paramv.M(i);
      int j = paramv.k();
      if (j > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      com.google.android.exoplayer2.util.e.b(bool, "childAtomSize should be positive");
      if (paramv.k() == 1936289382) {
        Pair<Integer, m> pair = e(paramv, i, j);
        if (pair != null)
          return pair; 
      } 
    } 
    return null;
  }
  
  private static m q(v paramv, int paramInt1, int paramInt2, String paramString) {
    int i = paramInt1 + 8;
    while (true) {
      byte[] arrayOfByte = null;
      if (i - paramInt1 < paramInt2) {
        paramv.M(i);
        int j = paramv.k();
        if (paramv.k() == 1952804451) {
          boolean bool;
          paramInt1 = c.c(paramv.k());
          paramv.N(1);
          if (paramInt1 == 0) {
            paramv.N(1);
            paramInt2 = 0;
            paramInt1 = 0;
          } else {
            paramInt2 = paramv.z();
            paramInt1 = paramInt2 & 0xF;
            paramInt2 = (paramInt2 & 0xF0) >> 4;
          } 
          if (paramv.z() == 1) {
            bool = true;
          } else {
            bool = false;
          } 
          i = paramv.z();
          byte[] arrayOfByte1 = new byte[16];
          paramv.h(arrayOfByte1, 0, 16);
          byte[] arrayOfByte2 = arrayOfByte;
          if (bool) {
            arrayOfByte2 = arrayOfByte;
            if (i == 0) {
              j = paramv.z();
              arrayOfByte2 = new byte[j];
              paramv.h(arrayOfByte2, 0, j);
            } 
          } 
          return new m(bool, paramString, i, arrayOfByte1, paramInt2, paramInt1, arrayOfByte2);
        } 
        i += j;
        continue;
      } 
      return null;
    } 
  }
  
  public static o r(l paraml, c.a parama, p paramp) {
    ParserException parserException1;
    long[] arrayOfLong1;
    long[] arrayOfLong2;
    e e;
    int[] arrayOfInt2;
    boolean bool;
    int[] arrayOfInt4;
    v v4;
    int n;
    int i3;
    long l3;
    c.b b2 = parama.g(1937011578);
    if (b2 != null) {
      d d1 = new d(b2);
    } else {
      b2 = parama.g(1937013298);
      if (b2 != null) {
        e = new e(b2);
      } else {
        parserException1 = new ParserException("Track has no sample table size information");
        throw parserException1;
      } 
    } 
    int i = e.b();
    if (i == 0)
      return new o((l)parserException1, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L); 
    b2 = parama.g(1937007471);
    if (b2 == null) {
      b2 = parama.g(1668232756);
      bool = true;
    } else {
      bool = false;
    } 
    v v1 = b2.b;
    v v2 = (parama.g(1937011555)).b;
    v v3 = (parama.g(1937011827)).b;
    b2 = parama.g(1937011571);
    c.b b3 = null;
    if (b2 != null) {
      v v = b2.b;
    } else {
      b2 = null;
    } 
    c.b b1 = parama.g(1668576371);
    if (b1 != null) {
      v4 = b1.b;
    } else {
      v4 = null;
    } 
    a a1 = new a(v2, v1, bool);
    v3.M(12);
    int j = v3.D() - 1;
    int k = v3.D();
    int m = v3.D();
    if (v4 != null) {
      v4.M(12);
      n = v4.D();
    } else {
      n = 0;
    } 
    int i1 = -1;
    if (b2 != null) {
      b2.M(12);
      i2 = b2.D();
      i3 = i2;
      b1 = b3;
      if (i2 > 0) {
        i1 = b2.D() - 1;
        b1 = b2;
        i3 = i2;
      } 
    } else {
      b1 = b2;
      i3 = 0;
    } 
    if (e.a() && "audio/raw".equals(((l)parserException1).f.j) && j == 0 && !n && !i3) {
      i2 = 1;
    } else {
      i2 = 0;
    } 
    long l1 = 0L;
    if (!i2) {
      long[] arrayOfLong5;
      long[] arrayOfLong6 = new long[i];
      int[] arrayOfInt7 = new int[i];
      arrayOfLong2 = new long[i];
      int[] arrayOfInt8 = new int[i];
      int i4 = i1;
      long l4 = 0L;
      l3 = l4;
      int i5 = 0;
      int i6 = 0;
      int i7 = 0;
      int i8 = 0;
      int i9 = 0;
      i1 = n;
      i2 = k;
      int i10 = i3;
      k = i8;
      n = i7;
      i3 = i1;
      i1 = i;
      i = i5;
      while (true) {
        int[] arrayOfInt;
        long[] arrayOfLong;
        if (i < i1) {
          int[] arrayOfInt10;
          int[] arrayOfInt11;
          bool = true;
          while (k == 0) {
            boolean bool1 = a1.a();
            bool = bool1;
            if (bool1) {
              l3 = a1.d;
              k = a1.c;
              bool = bool1;
            } 
          } 
          i8 = i2;
          if (!bool) {
            o.f("AtomParsers", "Unexpected end of chunk data");
            long[] arrayOfLong8 = Arrays.copyOf(arrayOfLong6, i);
            arrayOfInt10 = Arrays.copyOf(arrayOfInt7, i);
            arrayOfLong2 = Arrays.copyOf(arrayOfLong2, i);
            arrayOfInt = Arrays.copyOf(arrayOfInt8, i);
            i1 = i;
            i2 = k;
            arrayOfLong = arrayOfLong8;
            arrayOfInt11 = arrayOfInt;
            break;
          } 
          i7 = i3;
          i2 = n;
          i5 = i9;
          if (v4 != null) {
            while (!i9 && i3 > 0) {
              i9 = v4.D();
              n = v4.k();
              i3--;
            } 
            i5 = i9 - 1;
            i2 = n;
            i7 = i3;
          } 
          arrayOfInt[i] = l3;
          arrayOfInt7[i] = arrayOfInt11.c();
          i9 = i6;
          if (arrayOfInt7[i] > i6)
            i9 = arrayOfInt7[i]; 
          arrayOfLong2[i] = l4 + i2;
          if (arrayOfInt10 == null) {
            i3 = 1;
          } else {
            i3 = 0;
          } 
          arrayOfLong[i] = i3;
          i3 = i4;
          int i11 = i10;
          if (i == i4) {
            arrayOfLong[i] = 1L;
            n = i10 - 1;
            i3 = i4;
            i11 = n;
            if (n > 0) {
              i3 = arrayOfInt10.D() - 1;
              i11 = n;
            } 
          } 
          l4 += m;
          n = i8 - 1;
          if (n == 0 && j > 0) {
            n = v3.D();
            i6 = v3.k();
            j--;
          } else {
            i6 = m;
          } 
          long l5 = arrayOfInt7[i];
          i8 = k - 1;
          i++;
          l3 += l5;
          m = i6;
          k = i2;
          i4 = i3;
          i10 = i11;
          i6 = i9;
          i2 = n;
          i3 = i7;
          n = k;
          k = i8;
          i9 = i5;
          continue;
        } 
        i8 = i2;
        i2 = k;
        arrayOfInt6 = arrayOfInt7;
        arrayOfLong5 = arrayOfLong;
        arrayOfInt8 = arrayOfInt;
        break;
      } 
      l3 = l4 + n;
      while (true) {
        if (i3 > 0) {
          if (v4.D() != 0) {
            i3 = 0;
            break;
          } 
          v4.k();
          i3--;
          continue;
        } 
        i3 = 1;
        break;
      } 
      if (i10 != 0 || i8 != 0 || i2 != 0 || j != 0 || i9 != 0 || i3 == 0) {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Inconsistent stbl box for track ");
        stringBuilder.append(((l)parserException1).a);
        stringBuilder.append(": remainingSynchronizationSamples ");
        stringBuilder.append(i10);
        stringBuilder.append(", remainingSamplesAtTimestampDelta ");
        stringBuilder.append(i8);
        stringBuilder.append(", remainingSamplesInChunk ");
        stringBuilder.append(i2);
        stringBuilder.append(", remainingTimestampDeltaChanges ");
        stringBuilder.append(j);
        stringBuilder.append(", remainingSamplesAtTimestampOffset ");
        stringBuilder.append(i9);
        if (i3 == 0) {
          str = ", ctts invalid";
        } else {
          str = "";
        } 
        stringBuilder.append(str);
        o.f("AtomParsers", stringBuilder.toString());
      } 
      n = i1;
      int[] arrayOfInt9 = arrayOfInt8;
      long[] arrayOfLong7 = arrayOfLong5;
      i3 = i6;
      arrayOfInt2 = arrayOfInt6;
      int[] arrayOfInt6 = arrayOfInt9;
    } else {
      i3 = a1.a;
      arrayOfLong1 = new long[i3];
      int[] arrayOfInt = new int[i3];
      while (a1.a()) {
        i3 = a1.b;
        arrayOfLong1[i3] = a1.d;
        arrayOfInt[i3] = a1.c;
      } 
      Format format = ((l)parserException1).f;
      f.b b = f.a(h0.I(format.y, format.w), arrayOfLong1, arrayOfInt, m);
      arrayOfLong1 = b.a;
      arrayOfInt2 = b.b;
      i3 = b.c;
      arrayOfLong2 = b.d;
      arrayOfInt4 = b.e;
      l3 = b.f;
      n = i;
    } 
    ParserException parserException2 = parserException1;
    long l2 = h0.l0(l3, 1000000L, ((l)parserException2).c);
    long[] arrayOfLong4 = ((l)parserException2).h;
    if (arrayOfLong4 == null) {
      h0.m0(arrayOfLong2, 1000000L, ((l)parserException2).c);
      return new o((l)parserException1, arrayOfLong1, arrayOfInt2, i3, arrayOfLong2, arrayOfInt4, l2);
    } 
    if (arrayOfLong4.length == 1 && ((l)parserException2).b == 1 && arrayOfLong2.length >= 2) {
      long l4 = ((l)parserException2).i[0];
      l2 = l4 + h0.l0(arrayOfLong4[0], ((l)parserException2).c, ((l)parserException2).d);
      if (a(arrayOfLong2, l3, l4, l2)) {
        l4 = h0.l0(l4 - arrayOfLong2[0], ((l)parserException2).f.x, ((l)parserException2).c);
        l2 = h0.l0(l3 - l2, ((l)parserException2).f.x, ((l)parserException2).c);
        if ((l4 != 0L || l2 != 0L) && l4 <= 2147483647L && l2 <= 2147483647L) {
          paramp.b = (int)l4;
          paramp.c = (int)l2;
          h0.m0(arrayOfLong2, 1000000L, ((l)parserException2).c);
          return new o((l)parserException1, arrayOfLong1, arrayOfInt2, i3, arrayOfLong2, arrayOfInt4, h0.l0(((l)parserException2).h[0], 1000000L, ((l)parserException2).d));
        } 
      } 
    } 
    int[] arrayOfInt1 = arrayOfInt4;
    long[] arrayOfLong3 = ((l)parserException2).h;
    if (arrayOfLong3.length == 1 && arrayOfLong3[0] == 0L) {
      l2 = ((l)parserException2).i[0];
      for (n = 0; n < arrayOfLong2.length; n++)
        arrayOfLong2[n] = h0.l0(arrayOfLong2[n] - l2, 1000000L, ((l)parserException2).c); 
      return new o((l)parserException1, arrayOfLong1, arrayOfInt2, i3, arrayOfLong2, arrayOfInt1, h0.l0(l3 - l2, 1000000L, ((l)parserException2).c));
    } 
    if (((l)parserException2).b == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    int[] arrayOfInt5 = new int[arrayOfLong3.length];
    int[] arrayOfInt3 = new int[arrayOfLong3.length];
    i1 = 0;
    k = 0;
    int i2 = 0;
    j = 0;
    while (true) {
      int[] arrayOfInt7;
      int[] arrayOfInt8;
      arrayOfLong3 = ((l)parserException2).h;
      if (k < arrayOfLong3.length) {
        l3 = ((l)parserException2).i[k];
        if (l3 != -1L) {
          l2 = h0.l0(arrayOfLong3[k], ((l)parserException2).c, ((l)parserException2).d);
          arrayOfInt5[k] = h0.d(arrayOfLong2, l3, true, true);
          arrayOfInt3[k] = h0.d(arrayOfLong2, l3 + l2, bool, false);
          while (arrayOfInt5[k] < arrayOfInt3[k] && (arrayOfInt1[arrayOfInt5[k]] & 0x1) == 0)
            arrayOfInt5[k] = arrayOfInt5[k] + 1; 
          i = i2 + arrayOfInt3[k] - arrayOfInt5[k];
          if (j != arrayOfInt5[k]) {
            i2 = 1;
          } else {
            i2 = 0;
          } 
          j = arrayOfInt3[k];
          i1 = i2 | i1;
          i2 = i;
        } 
        k++;
        continue;
      } 
      k = 0;
      j = 1;
      if (i2 != n) {
        n = j;
      } else {
        n = 0;
      } 
      j = i1 | n;
      if (j != 0) {
        arrayOfLong3 = new long[i2];
      } else {
        arrayOfLong3 = arrayOfLong1;
      } 
      if (j != 0) {
        arrayOfInt8 = new int[i2];
      } else {
        arrayOfInt8 = arrayOfInt2;
      } 
      n = i3;
      if (j != 0)
        n = 0; 
      if (j != 0) {
        arrayOfInt7 = new int[i2];
      } else {
        arrayOfInt7 = arrayOfInt1;
      } 
      long[] arrayOfLong7 = new long[i2];
      i2 = 0;
      l3 = l1;
      long[] arrayOfLong6 = arrayOfLong2;
      i3 = k;
      long[] arrayOfLong5 = arrayOfLong1;
      int[] arrayOfInt6 = arrayOfInt5;
      while (i3 < ((l)parserException2).h.length) {
        l2 = ((l)parserException2).i[i3];
        i1 = arrayOfInt6[i3];
        i = arrayOfInt3[i3];
        if (j != 0) {
          k = i - i1;
          System.arraycopy(arrayOfLong5, i1, arrayOfLong3, i2, k);
          System.arraycopy(arrayOfInt2, i1, arrayOfInt8, i2, k);
          System.arraycopy(arrayOfInt1, i1, arrayOfInt7, i2, k);
        } 
        int[] arrayOfInt = arrayOfInt1;
        k = n;
        n = i2;
        i2 = i3;
        for (i3 = k; i1 < i; i3 = k) {
          arrayOfLong7[n] = h0.l0(l3, 1000000L, ((l)parserException2).d) + h0.l0(arrayOfLong6[i1] - l2, 1000000L, ((l)parserException2).c);
          k = i3;
          if (j != 0) {
            k = i3;
            if (arrayOfInt8[n] > i3)
              k = arrayOfInt2[i1]; 
          } 
          n++;
          i1++;
        } 
        l3 += ((l)parserException2).h[i2];
        i2++;
        i1 = i3;
        i3 = i2;
        i2 = n;
        n = i1;
        arrayOfInt1 = arrayOfInt;
      } 
      return new o((l)parserException1, arrayOfLong3, arrayOfInt8, n, arrayOfLong7, arrayOfInt7, h0.l0(l3, 1000000L, ((l)parserException2).d));
    } 
  }
  
  private static c s(v paramv, int paramInt1, int paramInt2, String paramString, DrmInitData paramDrmInitData, boolean paramBoolean) {
    paramv.M(12);
    int i = paramv.k();
    c c = new c(i);
    for (byte b = 0; b < i; b++) {
      boolean bool;
      int j = paramv.c();
      int k = paramv.k();
      if (k > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      com.google.android.exoplayer2.util.e.b(bool, "childAtomSize should be positive");
      int m = paramv.k();
      if (m == 1635148593 || m == 1635148595 || m == 1701733238 || m == 1836070006 || m == 1752589105 || m == 1751479857 || m == 1932670515 || m == 1987063864 || m == 1987063865 || m == 1635135537 || m == 1685479798 || m == 1685479729 || m == 1685481573 || m == 1685481521) {
        y(paramv, m, j, k, paramInt1, paramInt2, paramDrmInitData, c, b);
      } else if (m == 1836069985 || m == 1701733217 || m == 1633889587 || m == 1700998451 || m == 1633889588 || m == 1685353315 || m == 1685353317 || m == 1685353320 || m == 1685353324 || m == 1935764850 || m == 1935767394 || m == 1819304813 || m == 1936684916 || m == 1953984371 || m == 778924083 || m == 1634492771 || m == 1634492791 || m == 1970037111 || m == 1332770163 || m == 1716281667) {
        d(paramv, m, j, k, paramInt1, paramString, paramBoolean, paramDrmInitData, c, b);
      } else if (m == 1414810956 || m == 1954034535 || m == 2004251764 || m == 1937010800 || m == 1664495672) {
        t(paramv, m, j, k, paramInt1, paramString, c);
      } else if (m == 1667329389) {
        c.b = Format.u(Integer.toString(paramInt1), "application/x-camera-motion", null, -1, null);
      } 
      paramv.M(j + k);
    } 
    return c;
  }
  
  private static void t(v paramv, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, c paramc) {
    String str1;
    IllegalStateException illegalStateException;
    List<byte> list;
    paramv.M(paramInt2 + 8 + 8);
    String str2 = "application/ttml+xml";
    byte[] arrayOfByte = null;
    long l = Long.MAX_VALUE;
    if (paramInt1 == 1414810956) {
      str1 = str2;
    } else if (paramInt1 == 1954034535) {
      paramInt1 = paramInt3 - 8 - 8;
      arrayOfByte = new byte[paramInt1];
      str1.h(arrayOfByte, 0, paramInt1);
      list = Collections.singletonList(arrayOfByte);
      str1 = "application/x-quicktime-tx3g";
    } else if (paramInt1 == 2004251764) {
      str1 = "application/x-mp4-vtt";
    } else if (paramInt1 == 1937010800) {
      l = 0L;
      str1 = str2;
    } else if (paramInt1 == 1664495672) {
      paramc.d = 1;
      str1 = "application/x-mp4-cea-608";
    } else {
      illegalStateException = new IllegalStateException();
      throw illegalStateException;
    } 
    paramc.b = Format.z(Integer.toString(paramInt4), (String)illegalStateException, null, -1, 0, paramString, -1, null, l, list);
  }
  
  private static f u(v paramv) {
    long l2;
    int i = 8;
    paramv.M(8);
    int j = c.c(paramv.k());
    if (j == 0) {
      k = 8;
    } else {
      k = 16;
    } 
    paramv.N(k);
    int m = paramv.k();
    paramv.N(4);
    int n = paramv.c();
    int k = i;
    if (j == 0)
      k = 4; 
    boolean bool = false;
    i = 0;
    while (true) {
      if (i < k) {
        if (paramv.a[n + i] != -1) {
          i = 0;
          break;
        } 
        i++;
        continue;
      } 
      i = 1;
      break;
    } 
    long l1 = -9223372036854775807L;
    if (i != 0) {
      paramv.N(k);
      l2 = l1;
    } else {
      if (j == 0) {
        l2 = paramv.B();
      } else {
        l2 = paramv.E();
      } 
      if (l2 == 0L)
        l2 = l1; 
    } 
    paramv.N(16);
    j = paramv.k();
    int i1 = paramv.k();
    paramv.N(4);
    i = paramv.k();
    n = paramv.k();
    if (j == 0 && i1 == 65536 && i == -65536 && n == 0) {
      k = 90;
    } else if (j == 0 && i1 == -65536 && i == 65536 && n == 0) {
      k = 270;
    } else {
      k = bool;
      if (j == -65536) {
        k = bool;
        if (i1 == 0) {
          k = bool;
          if (i == 0) {
            k = bool;
            if (n == -65536)
              k = 180; 
          } 
        } 
      } 
    } 
    return new f(m, l2, k);
  }
  
  public static l v(c.a parama, c.b paramb, long paramLong, DrmInitData paramDrmInitData, boolean paramBoolean1, boolean paramBoolean2) {
    l l;
    c.a a2 = parama.f(1835297121);
    int i = c(i((a2.g(1751411826)).b));
    c.a a3 = null;
    if (i == -1)
      return null; 
    f f = u((parama.g(1953196132)).b);
    long l1 = -9223372036854775807L;
    if (paramLong == -9223372036854775807L)
      paramLong = f.a(f); 
    long l2 = m(paramb.b);
    if (paramLong == -9223372036854775807L) {
      paramLong = l1;
    } else {
      paramLong = h0.l0(paramLong, 1000000L, l2);
    } 
    c.a a1 = a2.f(1835626086).f(1937007212);
    Pair<Long, String> pair = k((a2.g(1835296868)).b);
    c c = s((a1.g(1937011556)).b, f.b(f), f.c(f), (String)pair.second, paramDrmInitData, paramBoolean2);
    if (!paramBoolean1) {
      Pair<long[], long[]> pair1 = f(parama.f(1701082227));
      long[] arrayOfLong2 = (long[])pair1.first;
      long[] arrayOfLong1 = (long[])pair1.second;
    } else {
      a1 = null;
      parama = a1;
    } 
    if (c.b == null) {
      parama = a3;
    } else {
      l = new l(f.b(f), i, ((Long)pair.first).longValue(), l2, paramLong, c.b, c.d, c.a, c.c, (long[])a1, (long[])parama);
    } 
    return l;
  }
  
  public static Metadata w(c.b paramb, boolean paramBoolean) {
    if (paramBoolean)
      return null; 
    v v = paramb.b;
    v.M(8);
    while (v.a() >= 8) {
      int i = v.c();
      int j = v.k();
      if (v.k() == 1835365473) {
        v.M(i);
        return x(v, i + j);
      } 
      v.M(i + j);
    } 
    return null;
  }
  
  private static Metadata x(v paramv, int paramInt) {
    paramv.N(12);
    while (paramv.c() < paramInt) {
      int i = paramv.c();
      int j = paramv.k();
      if (paramv.k() == 1768715124) {
        paramv.M(i);
        return j(paramv, i + j);
      } 
      paramv.M(i + j);
    } 
    return null;
  }
  
  private static void y(v paramv, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, DrmInitData paramDrmInitData, c paramc, int paramInt6) {
    int i = paramInt2;
    paramv.M(i + 8 + 8);
    paramv.N(16);
    int j = paramv.F();
    int k = paramv.F();
    paramv.N(50);
    int m = paramv.c();
    DrmInitData drmInitData1 = paramDrmInitData;
    int n = paramInt1;
    if (paramInt1 == 1701733238) {
      Pair<Integer, m> pair = p(paramv, i, paramInt3);
      DrmInitData drmInitData = paramDrmInitData;
      if (pair != null) {
        paramInt1 = ((Integer)pair.first).intValue();
        if (paramDrmInitData == null) {
          drmInitData = null;
        } else {
          drmInitData = paramDrmInitData.c(((m)pair.second).b);
        } 
        paramc.a[paramInt6] = (m)pair.second;
      } 
      paramv.M(m);
      n = paramInt1;
      drmInitData1 = drmInitData;
    } 
    DrmInitData drmInitData3 = null;
    paramDrmInitData = drmInitData3;
    DrmInitData drmInitData2 = paramDrmInitData;
    DrmInitData drmInitData4 = drmInitData2;
    i = 0;
    float f = 1.0F;
    int i1 = -1;
    DrmInitData drmInitData5 = drmInitData2;
    DrmInitData drmInitData6 = paramDrmInitData;
    paramInt6 = m;
    while (true) {
      paramInt1 = paramInt2;
      if (paramInt6 - paramInt1 < paramInt3) {
        boolean bool;
        DrmInitData drmInitData7;
        float f1;
        DrmInitData drmInitData8;
        paramv.M(paramInt6);
        m = paramv.c();
        int i2 = paramv.k();
        if (i2 == 0 && paramv.c() - paramInt1 == paramInt3)
          break; 
        if (i2 > 0) {
          bool = true;
        } else {
          bool = false;
        } 
        com.google.android.exoplayer2.util.e.b(bool, "childAtomSize should be positive");
        int i3 = paramv.k();
        if (i3 == 1635148611) {
          if (drmInitData3 == null) {
            bool = true;
          } else {
            bool = false;
          } 
          com.google.android.exoplayer2.util.e.f(bool);
          paramv.M(m + 8);
          h h = h.b(paramv);
          List list = h.a;
          paramc.c = h.b;
          if (i == 0)
            f = h.e; 
          String str = "video/avc";
          m = i;
          drmInitData7 = drmInitData6;
          f1 = f;
          drmInitData8 = drmInitData4;
          paramInt1 = i1;
        } else if (i3 == 1752589123) {
          if (drmInitData3 == null) {
            bool = true;
          } else {
            bool = false;
          } 
          com.google.android.exoplayer2.util.e.f(bool);
          paramv.M(m + 8);
          j j1 = j.a(paramv);
          List list = j1.a;
          paramc.c = j1.b;
          String str = "video/hevc";
          m = i;
          drmInitData7 = drmInitData6;
          f1 = f;
          drmInitData8 = drmInitData4;
          paramInt1 = i1;
        } else if (i3 == 1685480259 || i3 == 1685485123) {
          i i4 = i.a(paramv);
          paramDrmInitData = drmInitData3;
          m = i;
          drmInitData7 = drmInitData6;
          drmInitData2 = drmInitData5;
          f1 = f;
          drmInitData8 = drmInitData4;
          paramInt1 = i1;
          if (i4 != null) {
            String str2 = i4.c;
            String str1 = "video/dolby-vision";
            paramInt1 = i1;
            drmInitData8 = drmInitData4;
            f1 = f;
            drmInitData2 = drmInitData5;
            m = i;
          } 
        } else if (i3 == 1987076931) {
          if (drmInitData3 == null) {
            bool = true;
          } else {
            bool = false;
          } 
          com.google.android.exoplayer2.util.e.f(bool);
          if (n == 1987063864) {
            String str = "video/x-vnd.on2.vp8";
          } else {
            String str = "video/x-vnd.on2.vp9";
          } 
          m = i;
          drmInitData7 = drmInitData6;
          drmInitData2 = drmInitData5;
          f1 = f;
          drmInitData8 = drmInitData4;
          paramInt1 = i1;
        } else if (i3 == 1635135811) {
          if (drmInitData3 == null) {
            bool = true;
          } else {
            bool = false;
          } 
          com.google.android.exoplayer2.util.e.f(bool);
          String str = "video/av01";
          m = i;
          drmInitData7 = drmInitData6;
          drmInitData2 = drmInitData5;
          f1 = f;
          drmInitData8 = drmInitData4;
          paramInt1 = i1;
        } else if (i3 == 1681012275) {
          if (drmInitData3 == null) {
            bool = true;
          } else {
            bool = false;
          } 
          com.google.android.exoplayer2.util.e.f(bool);
          String str = "video/3gpp";
          m = i;
          drmInitData7 = drmInitData6;
          drmInitData2 = drmInitData5;
          f1 = f;
          drmInitData8 = drmInitData4;
          paramInt1 = i1;
        } else if (i3 == 1702061171) {
          if (drmInitData3 == null) {
            bool = true;
          } else {
            bool = false;
          } 
          com.google.android.exoplayer2.util.e.f(bool);
          Pair<String, byte[]> pair = g(paramv, m);
          String str = (String)pair.first;
          List list = Collections.singletonList(pair.second);
          m = i;
          drmInitData7 = drmInitData6;
          f1 = f;
          drmInitData8 = drmInitData4;
          paramInt1 = i1;
        } else if (i3 == 1885434736) {
          f1 = n(paramv, m);
          m = 1;
          paramDrmInitData = drmInitData3;
          drmInitData7 = drmInitData6;
          drmInitData2 = drmInitData5;
          drmInitData8 = drmInitData4;
          paramInt1 = i1;
        } else if (i3 == 1937126244) {
          byte[] arrayOfByte = o(paramv, m, i2);
          paramDrmInitData = drmInitData3;
          m = i;
          drmInitData7 = drmInitData6;
          drmInitData2 = drmInitData5;
          f1 = f;
          paramInt1 = i1;
        } else {
          paramDrmInitData = drmInitData3;
          m = i;
          drmInitData7 = drmInitData6;
          drmInitData2 = drmInitData5;
          f1 = f;
          drmInitData8 = drmInitData4;
          paramInt1 = i1;
          if (i3 == 1936995172) {
            i3 = paramv.z();
            paramv.N(3);
            paramDrmInitData = drmInitData3;
            m = i;
            drmInitData7 = drmInitData6;
            drmInitData2 = drmInitData5;
            f1 = f;
            drmInitData8 = drmInitData4;
            paramInt1 = i1;
            if (i3 == 0) {
              paramInt1 = paramv.z();
              if (paramInt1 != 0) {
                if (paramInt1 != 1) {
                  if (paramInt1 != 2) {
                    if (paramInt1 != 3) {
                      paramDrmInitData = drmInitData3;
                      m = i;
                      drmInitData7 = drmInitData6;
                      drmInitData2 = drmInitData5;
                      f1 = f;
                      drmInitData8 = drmInitData4;
                      paramInt1 = i1;
                    } else {
                      paramInt1 = 3;
                      paramDrmInitData = drmInitData3;
                      m = i;
                      drmInitData7 = drmInitData6;
                      drmInitData2 = drmInitData5;
                      f1 = f;
                      drmInitData8 = drmInitData4;
                    } 
                  } else {
                    paramInt1 = 2;
                    paramDrmInitData = drmInitData3;
                    m = i;
                    drmInitData7 = drmInitData6;
                    drmInitData2 = drmInitData5;
                    f1 = f;
                    drmInitData8 = drmInitData4;
                  } 
                } else {
                  paramInt1 = 1;
                  paramDrmInitData = drmInitData3;
                  m = i;
                  drmInitData7 = drmInitData6;
                  drmInitData2 = drmInitData5;
                  f1 = f;
                  drmInitData8 = drmInitData4;
                } 
              } else {
                paramInt1 = 0;
                paramDrmInitData = drmInitData3;
                m = i;
                drmInitData7 = drmInitData6;
                drmInitData2 = drmInitData5;
                f1 = f;
                drmInitData8 = drmInitData4;
              } 
            } 
          } 
        } 
        paramInt6 += i2;
        drmInitData3 = paramDrmInitData;
        i = m;
        drmInitData6 = drmInitData7;
        drmInitData5 = drmInitData2;
        f = f1;
        drmInitData4 = drmInitData8;
        i1 = paramInt1;
        continue;
      } 
      break;
    } 
    if (drmInitData3 == null)
      return; 
    paramc.b = Format.E(Integer.toString(paramInt4), (String)drmInitData3, (String)drmInitData6, -1, -1, j, k, -1.0F, (List)drmInitData5, paramInt5, f, (byte[])drmInitData4, i1, null, drmInitData1);
  }
  
  private static final class a {
    public final int a;
    
    public int b;
    
    public int c;
    
    public long d;
    
    private final boolean e;
    
    private final v f;
    
    private final v g;
    
    private int h;
    
    private int i;
    
    public a(v param1v1, v param1v2, boolean param1Boolean) {
      this.g = param1v1;
      this.f = param1v2;
      this.e = param1Boolean;
      param1v2.M(12);
      this.a = param1v2.D();
      param1v1.M(12);
      this.i = param1v1.D();
      int i = param1v1.k();
      param1Boolean = true;
      if (i != 1)
        param1Boolean = false; 
      com.google.android.exoplayer2.util.e.g(param1Boolean, "first_chunk must be 1");
      this.b = -1;
    }
    
    public boolean a() {
      long l;
      int i = this.b + 1;
      this.b = i;
      if (i == this.a)
        return false; 
      if (this.e) {
        l = this.f.E();
      } else {
        l = this.f.B();
      } 
      this.d = l;
      if (this.b == this.h) {
        this.c = this.g.D();
        this.g.N(4);
        i = this.i - 1;
        this.i = i;
        if (i > 0) {
          i = this.g.D() - 1;
        } else {
          i = -1;
        } 
        this.h = i;
      } 
      return true;
    }
  }
  
  private static interface b {
    boolean a();
    
    int b();
    
    int c();
  }
  
  private static final class c {
    public final m[] a;
    
    public Format b;
    
    public int c;
    
    public int d;
    
    public c(int param1Int) {
      this.a = new m[param1Int];
      this.d = 0;
    }
  }
  
  static final class d implements b {
    private final int a;
    
    private final int b;
    
    private final v c;
    
    public d(c.b param1b) {
      v v1 = param1b.b;
      this.c = v1;
      v1.M(12);
      this.a = v1.D();
      this.b = v1.D();
    }
    
    public boolean a() {
      boolean bool;
      if (this.a != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public int b() {
      return this.b;
    }
    
    public int c() {
      int i = this.a;
      int j = i;
      if (i == 0)
        j = this.c.D(); 
      return j;
    }
  }
  
  static final class e implements b {
    private final v a;
    
    private final int b;
    
    private final int c;
    
    private int d;
    
    private int e;
    
    public e(c.b param1b) {
      v v1 = param1b.b;
      this.a = v1;
      v1.M(12);
      this.c = v1.D() & 0xFF;
      this.b = v1.D();
    }
    
    public boolean a() {
      return false;
    }
    
    public int b() {
      return this.b;
    }
    
    public int c() {
      int i = this.c;
      if (i == 8)
        return this.a.z(); 
      if (i == 16)
        return this.a.F(); 
      i = this.d;
      this.d = i + 1;
      if (i % 2 == 0) {
        i = this.a.z();
        this.e = i;
        return (i & 0xF0) >> 4;
      } 
      return this.e & 0xF;
    }
  }
  
  private static final class f {
    private final int a;
    
    private final long b;
    
    private final int c;
    
    public f(int param1Int1, long param1Long, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Long;
      this.c = param1Int2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */