package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.b;
import com.google.android.exoplayer2.metadata.d;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class b implements b {
  public static final a a = a.a;
  
  private final a b;
  
  public b() {
    this(null);
  }
  
  public b(a parama) {
    this.b = parama;
  }
  
  private static byte[] b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (paramInt2 <= paramInt1) ? h0.f : Arrays.copyOfRange(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private static ApicFrame d(v paramv, int paramInt1, int paramInt2) {
    String str1;
    int i = paramv.z();
    String str2 = t(i);
    int j = paramInt1 - 1;
    byte[] arrayOfByte = new byte[j];
    paramv.h(arrayOfByte, 0, j);
    if (paramInt2 == 2) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("image/");
      stringBuilder.append(h0.u0(new String(arrayOfByte, 0, 3, "ISO-8859-1")));
      String str = stringBuilder.toString();
      str1 = str;
      if ("image/jpg".equals(str))
        str1 = "image/jpeg"; 
      paramInt1 = 2;
    } else {
      paramInt1 = w(arrayOfByte, 0);
      str1 = h0.u0(new String(arrayOfByte, 0, paramInt1, "ISO-8859-1"));
      if (str1.indexOf('/') == -1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("image/");
        stringBuilder.append(str1);
        str1 = stringBuilder.toString();
      } 
    } 
    paramInt2 = arrayOfByte[paramInt1 + 1];
    paramInt1 += 2;
    int k = v(arrayOfByte, paramInt1, i);
    return new ApicFrame(str1, new String(arrayOfByte, paramInt1, k - paramInt1, str2), paramInt2 & 0xFF, b(arrayOfByte, k + s(i), j));
  }
  
  private static BinaryFrame e(v paramv, int paramInt, String paramString) {
    byte[] arrayOfByte = new byte[paramInt];
    paramv.h(arrayOfByte, 0, paramInt);
    return new BinaryFrame(paramString, arrayOfByte);
  }
  
  private static ChapterFrame f(v paramv, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, a parama) {
    int i = paramv.c();
    int j = w(paramv.a, i);
    String str = new String(paramv.a, i, j - i, "ISO-8859-1");
    paramv.M(j + 1);
    j = paramv.k();
    int k = paramv.k();
    long l1 = paramv.B();
    if (l1 == 4294967295L)
      l1 = -1L; 
    long l2 = paramv.B();
    if (l2 == 4294967295L)
      l2 = -1L; 
    ArrayList<Id3Frame> arrayList = new ArrayList();
    while (paramv.c() < i + paramInt1) {
      Id3Frame id3Frame = i(paramInt2, paramv, paramBoolean, paramInt3, parama);
      if (id3Frame != null)
        arrayList.add(id3Frame); 
    } 
    Id3Frame[] arrayOfId3Frame = new Id3Frame[arrayList.size()];
    arrayList.toArray(arrayOfId3Frame);
    return new ChapterFrame(str, j, k, l1, l2, arrayOfId3Frame);
  }
  
  private static ChapterTocFrame g(v paramv, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, a parama) {
    boolean bool1;
    boolean bool2;
    int i = paramv.c();
    int j = w(paramv.a, i);
    String str = new String(paramv.a, i, j - i, "ISO-8859-1");
    paramv.M(j + 1);
    int k = paramv.z();
    j = 0;
    if ((k & 0x2) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if ((k & 0x1) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    k = paramv.z();
    String[] arrayOfString = new String[k];
    while (j < k) {
      int m = paramv.c();
      int n = w(paramv.a, m);
      arrayOfString[j] = new String(paramv.a, m, n - m, "ISO-8859-1");
      paramv.M(n + 1);
      j++;
    } 
    ArrayList<Id3Frame> arrayList = new ArrayList();
    while (paramv.c() < i + paramInt1) {
      Id3Frame id3Frame = i(paramInt2, paramv, paramBoolean, paramInt3, parama);
      if (id3Frame != null)
        arrayList.add(id3Frame); 
    } 
    Id3Frame[] arrayOfId3Frame = new Id3Frame[arrayList.size()];
    arrayList.toArray(arrayOfId3Frame);
    return new ChapterTocFrame(str, bool1, bool2, arrayOfString, arrayOfId3Frame);
  }
  
  private static CommentFrame h(v paramv, int paramInt) {
    if (paramInt < 4)
      return null; 
    int i = paramv.z();
    String str2 = t(i);
    byte[] arrayOfByte = new byte[3];
    paramv.h(arrayOfByte, 0, 3);
    String str3 = new String(arrayOfByte, 0, 3);
    paramInt -= 4;
    arrayOfByte = new byte[paramInt];
    paramv.h(arrayOfByte, 0, paramInt);
    paramInt = v(arrayOfByte, 0, i);
    String str1 = new String(arrayOfByte, 0, paramInt, str2);
    paramInt += s(i);
    return new CommentFrame(str3, str1, n(arrayOfByte, paramInt, v(arrayOfByte, paramInt, i), str2));
  }
  
  private static Id3Frame i(int paramInt1, v paramv, boolean paramBoolean, int paramInt2, a parama) {
    BinaryFrame binaryFrame;
    boolean bool;
    int n;
    int i = paramv.z();
    int j = paramv.z();
    int k = paramv.z();
    if (paramInt1 >= 3) {
      bool = paramv.z();
    } else {
      bool = false;
    } 
    if (paramInt1 == 4) {
      m = paramv.D();
      n = m;
      if (!paramBoolean)
        n = (m >> 24 & 0xFF) << 21 | m & 0xFF | (m >> 8 & 0xFF) << 7 | (m >> 16 & 0xFF) << 14; 
    } else if (paramInt1 == 3) {
      n = paramv.D();
    } else {
      n = paramv.C();
    } 
    int i1 = n;
    if (paramInt1 >= 3) {
      n = paramv.F();
    } else {
      n = 0;
    } 
    if (i == 0 && j == 0 && k == 0 && !bool && i1 == 0 && n == 0) {
      paramv.M(paramv.d());
      return null;
    } 
    int i2 = paramv.c() + i1;
    if (i2 > paramv.d()) {
      o.f("Id3Decoder", "Frame size exceeds remaining tag data");
      paramv.M(paramv.d());
      return null;
    } 
    if (parama != null && !parama.a(paramInt1, i, j, k, bool)) {
      paramv.M(i2);
      return null;
    } 
    int i3 = n;
    if (paramInt1 == 3) {
      if ((i3 & 0x80) != 0) {
        n = 1;
      } else {
        n = 0;
      } 
      if ((i3 & 0x40) != 0) {
        i4 = 1;
      } else {
        i4 = 0;
      } 
      if ((i3 & 0x20) != 0) {
        i5 = 1;
      } else {
        i5 = 0;
      } 
      i3 = n;
      boolean bool1 = false;
      m = n;
      n = bool1;
    } else if (paramInt1 == 4) {
      if ((i3 & 0x40) != 0) {
        m = 1;
      } else {
        m = 0;
      } 
      if ((i3 & 0x8) != 0) {
        i5 = 1;
      } else {
        i5 = 0;
      } 
      if ((i3 & 0x4) != 0) {
        i4 = 1;
      } else {
        i4 = 0;
      } 
      if ((i3 & 0x2) != 0) {
        n = 1;
      } else {
        n = 0;
      } 
      if ((i3 & 0x1) != 0) {
        i3 = 1;
      } else {
        i3 = 0;
      } 
      int i6 = m;
      m = i3;
      i3 = i5;
      i5 = i6;
    } else {
      i5 = 0;
      m = 0;
      i4 = 0;
      n = 0;
      i3 = 0;
    } 
    if (i3 != 0 || i4) {
      o.f("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
      paramv.M(i2);
      return null;
    } 
    int i4 = i1;
    if (i5) {
      i4 = i1 - 1;
      paramv.N(1);
    } 
    int i5 = i4;
    if (m) {
      i5 = i4 - 4;
      paramv.N(4);
    } 
    int m = i5;
    if (n != 0)
      m = y(paramv, i5); 
    if (i == 84 && j == 88 && k == 88 && (paramInt1 == 2 || bool == 88)) {
      try {
        TextInformationFrame textInformationFrame = p(paramv, m);
        if (textInformationFrame == null) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Failed to decode frame: id=");
          stringBuilder.append(u(paramInt1, i, j, k, bool));
          stringBuilder.append(", frameSize=");
          stringBuilder.append(m);
          o.f("Id3Decoder", stringBuilder.toString());
        } 
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        o.f("Id3Decoder", "Unsupported character encoding");
        paramv.M(i2);
        return null;
      } finally {}
    } else {
      if (i == 84) {
        TextInformationFrame textInformationFrame = o(paramv, m, u(paramInt1, i, j, k, bool));
      } else if (i == 87 && j == 88 && k == 88 && (paramInt1 == 2 || bool == 88)) {
        UrlLinkFrame urlLinkFrame = r(paramv, m);
      } else if (i == 87) {
        UrlLinkFrame urlLinkFrame = q(paramv, m, u(paramInt1, i, j, k, bool));
      } else if (i == 80 && j == 82 && k == 73 && bool == 86) {
        PrivFrame privFrame = m(paramv, m);
      } else if (i == 71 && j == 69 && k == 79 && (bool == 66 || paramInt1 == 2)) {
        GeobFrame geobFrame = j(paramv, m);
      } else if ((paramInt1 == 2) ? (i == 80 && j == 73 && k == 67) : (i == 65 && j == 80 && k == 73 && bool == 67)) {
        ApicFrame apicFrame = d(paramv, m, paramInt1);
      } else {
        CommentFrame commentFrame;
        if (i == 67 && j == 79 && k == 77 && (bool == 77 || paramInt1 == 2)) {
          commentFrame = h(paramv, m);
        } else {
          ChapterFrame chapterFrame;
          if (i == 67 && j == 72 && k == 65 && bool == 80) {
            chapterFrame = f(paramv, m, paramInt1, paramBoolean, paramInt2, (a)commentFrame);
          } else if (i == 67 && j == 84 && k == 79 && bool == 67) {
            ChapterTocFrame chapterTocFrame = g(paramv, m, paramInt1, paramBoolean, paramInt2, (a)chapterFrame);
          } else if (i == 77 && j == 76 && k == 76 && bool == 84) {
            MlltFrame mlltFrame = l(paramv, m);
          } else {
            binaryFrame = e(paramv, m, u(paramInt1, i, j, k, bool));
          } 
        } 
      } 
      if (binaryFrame == null) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Failed to decode frame: id=");
        stringBuilder.append(u(paramInt1, i, j, k, bool));
        stringBuilder.append(", frameSize=");
        stringBuilder.append(m);
        o.f("Id3Decoder", stringBuilder.toString());
      } 
    } 
    paramv.M(i2);
    throw binaryFrame;
  }
  
  private static GeobFrame j(v paramv, int paramInt) {
    int i = paramv.z();
    String str2 = t(i);
    byte[] arrayOfByte = new byte[--paramInt];
    paramv.h(arrayOfByte, 0, paramInt);
    int j = w(arrayOfByte, 0);
    String str3 = new String(arrayOfByte, 0, j, "ISO-8859-1");
    int k = j + 1;
    j = v(arrayOfByte, k, i);
    String str1 = n(arrayOfByte, k, j, str2);
    k = j + s(i);
    j = v(arrayOfByte, k, i);
    return new GeobFrame(str3, str1, n(arrayOfByte, k, j, str2), b(arrayOfByte, j + s(i), paramInt));
  }
  
  private static b k(v paramv) {
    StringBuilder stringBuilder;
    if (paramv.a() < 10) {
      o.f("Id3Decoder", "Data too short to be an ID3 tag");
      return null;
    } 
    int i = paramv.C();
    boolean bool1 = false;
    if (i != 4801587) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unexpected first three bytes of ID3 tag header: 0x");
      stringBuilder.append(String.format("%06X", new Object[] { Integer.valueOf(i) }));
      o.f("Id3Decoder", stringBuilder.toString());
      return null;
    } 
    int j = stringBuilder.z();
    stringBuilder.N(1);
    int k = stringBuilder.z();
    int m = stringBuilder.y();
    if (j == 2) {
      boolean bool;
      if ((k & 0x40) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      i = m;
      if (bool) {
        o.f("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
        return null;
      } 
    } else if (j == 3) {
      boolean bool;
      if ((k & 0x40) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      i = m;
      if (bool) {
        i = stringBuilder.k();
        stringBuilder.N(i);
        i = m - i + 4;
      } 
    } else if (j == 4) {
      if ((k & 0x40) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      int n = m;
      if (i != 0) {
        i = stringBuilder.y();
        stringBuilder.N(i - 4);
        n = m - i;
      } 
      if ((k & 0x10) != 0) {
        m = 1;
      } else {
        m = 0;
      } 
      i = n;
      if (m != 0)
        i = n - 10; 
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Skipped ID3 tag with unsupported majorVersion=");
      stringBuilder.append(j);
      o.f("Id3Decoder", stringBuilder.toString());
      return null;
    } 
    boolean bool2 = bool1;
    if (j < 4) {
      bool2 = bool1;
      if ((k & 0x80) != 0)
        bool2 = true; 
    } 
    return new b(j, bool2, i);
  }
  
  private static MlltFrame l(v paramv, int paramInt) {
    int i = paramv.F();
    int j = paramv.C();
    int k = paramv.C();
    int m = paramv.z();
    int n = paramv.z();
    u u = new u();
    u.l(paramv);
    int i1 = (paramInt - 10) * 8 / (m + n);
    int[] arrayOfInt1 = new int[i1];
    int[] arrayOfInt2 = new int[i1];
    for (paramInt = 0; paramInt < i1; paramInt++) {
      int i2 = u.h(m);
      int i3 = u.h(n);
      arrayOfInt1[paramInt] = i2;
      arrayOfInt2[paramInt] = i3;
    } 
    return new MlltFrame(i, j, k, arrayOfInt1, arrayOfInt2);
  }
  
  private static PrivFrame m(v paramv, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    paramv.h(arrayOfByte, 0, paramInt);
    int i = w(arrayOfByte, 0);
    return new PrivFrame(new String(arrayOfByte, 0, i, "ISO-8859-1"), b(arrayOfByte, i + 1, paramInt));
  }
  
  private static String n(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, String paramString) {
    return (paramInt2 <= paramInt1 || paramInt2 > paramArrayOfbyte.length) ? "" : new String(paramArrayOfbyte, paramInt1, paramInt2 - paramInt1, paramString);
  }
  
  private static TextInformationFrame o(v paramv, int paramInt, String paramString) {
    if (paramInt < 1)
      return null; 
    int i = paramv.z();
    String str = t(i);
    byte[] arrayOfByte = new byte[--paramInt];
    paramv.h(arrayOfByte, 0, paramInt);
    return new TextInformationFrame(paramString, null, new String(arrayOfByte, 0, v(arrayOfByte, 0, i), str));
  }
  
  private static TextInformationFrame p(v paramv, int paramInt) {
    if (paramInt < 1)
      return null; 
    int i = paramv.z();
    String str2 = t(i);
    byte[] arrayOfByte = new byte[--paramInt];
    paramv.h(arrayOfByte, 0, paramInt);
    paramInt = v(arrayOfByte, 0, i);
    String str1 = new String(arrayOfByte, 0, paramInt, str2);
    paramInt += s(i);
    return new TextInformationFrame("TXXX", str1, n(arrayOfByte, paramInt, v(arrayOfByte, paramInt, i), str2));
  }
  
  private static UrlLinkFrame q(v paramv, int paramInt, String paramString) {
    byte[] arrayOfByte = new byte[paramInt];
    paramv.h(arrayOfByte, 0, paramInt);
    return new UrlLinkFrame(paramString, null, new String(arrayOfByte, 0, w(arrayOfByte, 0), "ISO-8859-1"));
  }
  
  private static UrlLinkFrame r(v paramv, int paramInt) {
    if (paramInt < 1)
      return null; 
    int i = paramv.z();
    String str2 = t(i);
    byte[] arrayOfByte = new byte[--paramInt];
    paramv.h(arrayOfByte, 0, paramInt);
    paramInt = v(arrayOfByte, 0, i);
    String str1 = new String(arrayOfByte, 0, paramInt, str2);
    paramInt += s(i);
    return new UrlLinkFrame("WXXX", str1, n(arrayOfByte, paramInt, w(arrayOfByte, paramInt), "ISO-8859-1"));
  }
  
  private static int s(int paramInt) {
    return (paramInt == 0 || paramInt == 3) ? 1 : 2;
  }
  
  private static String t(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? "ISO-8859-1" : "UTF-8") : "UTF-16BE") : "UTF-16";
  }
  
  private static String u(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    String str;
    if (paramInt1 == 2) {
      str = String.format(Locale.US, "%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    } else {
      str = String.format(Locale.US, "%c%c%c%c", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
    } 
    return str;
  }
  
  private static int v(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = w(paramArrayOfbyte, paramInt1);
    if (paramInt2 != 0) {
      paramInt1 = i;
      if (paramInt2 != 3) {
        while (paramInt1 < paramArrayOfbyte.length - 1) {
          if (paramInt1 % 2 == 0 && paramArrayOfbyte[paramInt1 + 1] == 0)
            return paramInt1; 
          paramInt1 = w(paramArrayOfbyte, paramInt1 + 1);
        } 
        return paramArrayOfbyte.length;
      } 
    } 
    return i;
  }
  
  private static int w(byte[] paramArrayOfbyte, int paramInt) {
    while (paramInt < paramArrayOfbyte.length) {
      if (paramArrayOfbyte[paramInt] == 0)
        return paramInt; 
      paramInt++;
    } 
    return paramArrayOfbyte.length;
  }
  
  private static int y(v paramv, int paramInt) {
    byte[] arrayOfByte = paramv.a;
    int i = paramv.c();
    int j = i;
    while (true) {
      int k = j + 1;
      if (k < i + paramInt) {
        int m = paramInt;
        if ((arrayOfByte[j] & 0xFF) == 255) {
          m = paramInt;
          if (arrayOfByte[k] == 0) {
            System.arraycopy(arrayOfByte, j + 2, arrayOfByte, k, paramInt - j - i - 2);
            m = paramInt - 1;
          } 
        } 
        j = k;
        paramInt = m;
        continue;
      } 
      return paramInt;
    } 
  }
  
  private static boolean z(v paramv, int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual c : ()I
    //   4: istore #4
    //   6: aload_0
    //   7: invokevirtual a : ()I
    //   10: istore #5
    //   12: iconst_1
    //   13: istore #6
    //   15: iload #5
    //   17: iload_2
    //   18: if_icmplt -> 346
    //   21: iload_1
    //   22: iconst_3
    //   23: if_icmplt -> 47
    //   26: aload_0
    //   27: invokevirtual k : ()I
    //   30: istore #5
    //   32: aload_0
    //   33: invokevirtual B : ()J
    //   36: lstore #7
    //   38: aload_0
    //   39: invokevirtual F : ()I
    //   42: istore #9
    //   44: goto -> 67
    //   47: aload_0
    //   48: invokevirtual C : ()I
    //   51: istore #5
    //   53: aload_0
    //   54: invokevirtual C : ()I
    //   57: istore #10
    //   59: iload #10
    //   61: i2l
    //   62: lstore #7
    //   64: iconst_0
    //   65: istore #9
    //   67: iload #5
    //   69: ifne -> 92
    //   72: lload #7
    //   74: lconst_0
    //   75: lcmp
    //   76: ifne -> 92
    //   79: iload #9
    //   81: ifne -> 92
    //   84: aload_0
    //   85: iload #4
    //   87: invokevirtual M : (I)V
    //   90: iconst_1
    //   91: ireturn
    //   92: lload #7
    //   94: lstore #11
    //   96: iload_1
    //   97: iconst_4
    //   98: if_icmpne -> 175
    //   101: lload #7
    //   103: lstore #11
    //   105: iload_3
    //   106: ifne -> 175
    //   109: ldc2_w 8421504
    //   112: lload #7
    //   114: land
    //   115: lconst_0
    //   116: lcmp
    //   117: ifeq -> 128
    //   120: aload_0
    //   121: iload #4
    //   123: invokevirtual M : (I)V
    //   126: iconst_0
    //   127: ireturn
    //   128: lload #7
    //   130: bipush #24
    //   132: lshr
    //   133: ldc2_w 255
    //   136: land
    //   137: bipush #21
    //   139: lshl
    //   140: lload #7
    //   142: ldc2_w 255
    //   145: land
    //   146: lload #7
    //   148: bipush #8
    //   150: lshr
    //   151: ldc2_w 255
    //   154: land
    //   155: bipush #7
    //   157: lshl
    //   158: lor
    //   159: lload #7
    //   161: bipush #16
    //   163: lshr
    //   164: ldc2_w 255
    //   167: land
    //   168: bipush #14
    //   170: lshl
    //   171: lor
    //   172: lor
    //   173: lstore #11
    //   175: iload_1
    //   176: iconst_4
    //   177: if_icmpne -> 225
    //   180: iload #9
    //   182: bipush #64
    //   184: iand
    //   185: ifeq -> 194
    //   188: iconst_1
    //   189: istore #10
    //   191: goto -> 197
    //   194: iconst_0
    //   195: istore #10
    //   197: iload #10
    //   199: istore #5
    //   201: iload #9
    //   203: iconst_1
    //   204: iand
    //   205: ifeq -> 219
    //   208: iload #10
    //   210: istore #5
    //   212: iload #6
    //   214: istore #9
    //   216: goto -> 277
    //   219: iconst_0
    //   220: istore #9
    //   222: goto -> 277
    //   225: iload_1
    //   226: iconst_3
    //   227: if_icmpne -> 271
    //   230: iload #9
    //   232: bipush #32
    //   234: iand
    //   235: ifeq -> 244
    //   238: iconst_1
    //   239: istore #10
    //   241: goto -> 247
    //   244: iconst_0
    //   245: istore #10
    //   247: iload #10
    //   249: istore #5
    //   251: iload #9
    //   253: sipush #128
    //   256: iand
    //   257: ifeq -> 219
    //   260: iload #10
    //   262: istore #5
    //   264: iload #6
    //   266: istore #9
    //   268: goto -> 277
    //   271: iconst_0
    //   272: istore #5
    //   274: goto -> 219
    //   277: iload #5
    //   279: istore #10
    //   281: iload #9
    //   283: ifeq -> 292
    //   286: iload #5
    //   288: iconst_4
    //   289: iadd
    //   290: istore #10
    //   292: lload #11
    //   294: iload #10
    //   296: i2l
    //   297: lcmp
    //   298: ifge -> 309
    //   301: aload_0
    //   302: iload #4
    //   304: invokevirtual M : (I)V
    //   307: iconst_0
    //   308: ireturn
    //   309: aload_0
    //   310: invokevirtual a : ()I
    //   313: istore #5
    //   315: iload #5
    //   317: i2l
    //   318: lload #11
    //   320: lcmp
    //   321: ifge -> 332
    //   324: aload_0
    //   325: iload #4
    //   327: invokevirtual M : (I)V
    //   330: iconst_0
    //   331: ireturn
    //   332: lload #11
    //   334: l2i
    //   335: istore #5
    //   337: aload_0
    //   338: iload #5
    //   340: invokevirtual N : (I)V
    //   343: goto -> 6
    //   346: aload_0
    //   347: iload #4
    //   349: invokevirtual M : (I)V
    //   352: iconst_1
    //   353: ireturn
    //   354: astore #13
    //   356: aload_0
    //   357: iload #4
    //   359: invokevirtual M : (I)V
    //   362: goto -> 368
    //   365: aload #13
    //   367: athrow
    //   368: goto -> 365
    // Exception table:
    //   from	to	target	type
    //   6	12	354	finally
    //   26	44	354	finally
    //   47	59	354	finally
    //   309	315	354	finally
    //   337	343	354	finally
  }
  
  public Metadata a(d paramd) {
    ByteBuffer byteBuffer = (ByteBuffer)e.e(((e)paramd).c);
    return c(byteBuffer.array(), byteBuffer.limit());
  }
  
  public Metadata c(byte[] paramArrayOfbyte, int paramInt) {
    StringBuilder stringBuilder;
    ArrayList arrayList = new ArrayList();
    v v = new v(paramArrayOfbyte, paramInt);
    b b1 = k(v);
    if (b1 == null)
      return null; 
    int i = v.c();
    if (b.a(b1) == 2) {
      paramInt = 6;
    } else {
      paramInt = 10;
    } 
    int j = b.b(b1);
    if (b.c(b1))
      j = y(v, b.b(b1)); 
    v.L(i + j);
    j = b.a(b1);
    boolean bool = false;
    if (!z(v, j, paramInt, false))
      if (b.a(b1) == 4 && z(v, 4, paramInt, true)) {
        bool = true;
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to validate ID3 tag with majorVersion=");
        stringBuilder.append(b.a(b1));
        o.f("Id3Decoder", stringBuilder.toString());
        return null;
      }  
    while (v.a() >= paramInt) {
      Id3Frame id3Frame = i(b.a(b1), v, bool, paramInt, this.b);
      if (id3Frame != null)
        stringBuilder.add(id3Frame); 
    } 
    return new Metadata((List)stringBuilder);
  }
  
  public static interface a {
    boolean a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5);
  }
  
  private static final class b {
    private final int a;
    
    private final boolean b;
    
    private final int c;
    
    public b(int param1Int1, boolean param1Boolean, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Boolean;
      this.c = param1Int2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/id3/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */