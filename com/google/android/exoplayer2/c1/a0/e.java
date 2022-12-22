package com.google.android.exoplayer2.c1.a0;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.g;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.p;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.util.v;
import com.google.android.exoplayer2.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class e implements h {
  public static final l a = a.a;
  
  private static final byte[] b = new byte[] { 
      49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 
      44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 
      48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 
      48, 10 };
  
  private static final byte[] c = h0.R("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
  
  private static final byte[] d = new byte[] { 
      68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 
      48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 
      44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 
      48, 44 };
  
  private static final UUID e = new UUID(72057594037932032L, -9223371306706625679L);
  
  private boolean A;
  
  private int B;
  
  private long C;
  
  private boolean D;
  
  private long E = -1L;
  
  private long F = -1L;
  
  private long G = -9223372036854775807L;
  
  private p H;
  
  private p I;
  
  private boolean J;
  
  private boolean K;
  
  private int L;
  
  private long M;
  
  private long N;
  
  private int O;
  
  private int P;
  
  private int[] Q;
  
  private int R;
  
  private int S;
  
  private int T;
  
  private int U;
  
  private boolean V;
  
  private int W;
  
  private int X;
  
  private int Y;
  
  private boolean Z;
  
  private boolean a0;
  
  private boolean b0;
  
  private int c0;
  
  private byte d0;
  
  private boolean e0;
  
  private final d f;
  
  private j f0;
  
  private final g g;
  
  private final SparseArray<c> h;
  
  private final boolean i;
  
  private final v j;
  
  private final v k;
  
  private final v l;
  
  private final v m;
  
  private final v n;
  
  private final v o;
  
  private final v p;
  
  private final v q;
  
  private final v r;
  
  private final v s;
  
  private ByteBuffer t;
  
  private long u;
  
  private long v = -1L;
  
  private long w = -9223372036854775807L;
  
  private long x = -9223372036854775807L;
  
  private long y = -9223372036854775807L;
  
  private c z;
  
  public e() {
    this(0);
  }
  
  public e(int paramInt) {
    this(new b(), paramInt);
  }
  
  e(d paramd, int paramInt) {
    this.f = paramd;
    paramd.c(new b(null));
    boolean bool = true;
    if ((paramInt & 0x1) != 0)
      bool = false; 
    this.i = bool;
    this.g = new g();
    this.h = new SparseArray();
    this.l = new v(4);
    this.m = new v(ByteBuffer.allocate(4).putInt(-1).array());
    this.n = new v(4);
    this.j = new v(s.a);
    this.k = new v(4);
    this.o = new v();
    this.p = new v();
    this.q = new v(8);
    this.r = new v();
    this.s = new v();
  }
  
  private int C(i parami, c paramc, int paramInt) {
    if ("S_TEXT/UTF8".equals(paramc.b)) {
      D(parami, b, paramInt);
      return m();
    } 
    if ("S_TEXT/ASS".equals(paramc.b)) {
      D(parami, d, paramInt);
      return m();
    } 
    v v1 = paramc.V;
    boolean bool = this.Z;
    boolean bool1 = true;
    if (!bool) {
      if (paramc.g) {
        int m;
        this.T &= 0xBFFFFFFF;
        bool = this.a0;
        int k = 128;
        if (!bool) {
          parami.readFully(this.l.a, 0, 1);
          this.W++;
          byte[] arrayOfByte = this.l.a;
          if ((arrayOfByte[0] & 0x80) != 128) {
            this.d0 = (byte)arrayOfByte[0];
            this.a0 = true;
          } else {
            throw new ParserException("Extension bit is set in signal byte");
          } 
        } 
        byte b = this.d0;
        if ((b & 0x1) == 1) {
          m = 1;
        } else {
          m = 0;
        } 
        if (m) {
          if ((b & 0x2) == 2) {
            m = 1;
          } else {
            m = 0;
          } 
          this.T |= 0x40000000;
          if (!this.e0) {
            parami.readFully(this.q.a, 0, 8);
            this.W += 8;
            this.e0 = true;
            v v2 = this.l;
            byte[] arrayOfByte = v2.a;
            if (!m)
              k = 0; 
            arrayOfByte[0] = (byte)(byte)(k | 0x8);
            v2.M(0);
            v1.b(this.l, 1);
            this.X++;
            this.q.M(0);
            v1.b(this.q, 8);
            this.X += 8;
          } 
          if (m) {
            if (!this.b0) {
              parami.readFully(this.l.a, 0, 1);
              this.W++;
              this.l.M(0);
              this.c0 = this.l.z();
              this.b0 = true;
            } 
            m = this.c0 * 4;
            this.l.I(m);
            parami.readFully(this.l.a, 0, m);
            this.W += m;
            short s = (short)(this.c0 / 2 + 1);
            int n = s * 6 + 2;
            ByteBuffer byteBuffer = this.t;
            if (byteBuffer == null || byteBuffer.capacity() < n)
              this.t = ByteBuffer.allocate(n); 
            this.t.position(0);
            this.t.putShort(s);
            m = 0;
            k = 0;
            while (true) {
              int i1 = this.c0;
              if (m < i1) {
                i1 = this.l.D();
                if (m % 2 == 0) {
                  this.t.putShort((short)(i1 - k));
                } else {
                  this.t.putInt(i1 - k);
                } 
                m++;
                k = i1;
                continue;
              } 
              m = paramInt - this.W - k;
              if (i1 % 2 == 1) {
                this.t.putInt(m);
              } else {
                this.t.putShort((short)m);
                this.t.putInt(0);
              } 
              this.r.K(this.t.array(), n);
              v1.b(this.r, n);
              this.X += n;
              break;
            } 
          } 
        } 
      } else {
        byte[] arrayOfByte = paramc.h;
        if (arrayOfByte != null)
          this.o.K(arrayOfByte, arrayOfByte.length); 
      } 
      if (paramc.f > 0) {
        this.T |= 0x10000000;
        this.s.H();
        this.l.I(4);
        v v2 = this.l;
        byte[] arrayOfByte = v2.a;
        arrayOfByte[0] = (byte)(byte)(paramInt >> 24 & 0xFF);
        arrayOfByte[1] = (byte)(byte)(paramInt >> 16 & 0xFF);
        arrayOfByte[2] = (byte)(byte)(paramInt >> 8 & 0xFF);
        arrayOfByte[3] = (byte)(byte)(paramInt & 0xFF);
        v1.b(v2, 4);
        this.X += 4;
      } 
      this.Z = true;
    } 
    paramInt += this.o.d();
    if ("V_MPEG4/ISO/AVC".equals(paramc.b) || "V_MPEGH/ISO/HEVC".equals(paramc.b)) {
      byte[] arrayOfByte = this.k.a;
      arrayOfByte[0] = (byte)0;
      arrayOfByte[1] = (byte)0;
      arrayOfByte[2] = (byte)0;
      int k = paramc.W;
      while (this.W < paramInt) {
        int m = this.Y;
        if (m == 0) {
          F(parami, arrayOfByte, 4 - k, k);
          this.W += k;
          this.k.M(0);
          this.Y = this.k.D();
          this.j.M(0);
          v1.b(this.j, 4);
          this.X += 4;
          continue;
        } 
        m = E(parami, v1, m);
        this.W += m;
        this.X += m;
        this.Y -= m;
      } 
    } else {
      if (paramc.R != null) {
        if (this.o.d() != 0)
          bool1 = false; 
        com.google.android.exoplayer2.util.e.f(bool1);
        paramc.R.d(parami);
      } 
      while (true) {
        int k = this.W;
        if (k < paramInt) {
          k = E(parami, v1, paramInt - k);
          this.W += k;
          this.X += k;
          continue;
        } 
        break;
      } 
    } 
    if ("A_VORBIS".equals(paramc.b)) {
      this.m.M(0);
      v1.b(this.m, 4);
      this.X += 4;
    } 
    return m();
  }
  
  private void D(i parami, byte[] paramArrayOfbyte, int paramInt) {
    int k = paramArrayOfbyte.length + paramInt;
    if (this.p.b() < k) {
      this.p.a = Arrays.copyOf(paramArrayOfbyte, k + paramInt);
    } else {
      System.arraycopy(paramArrayOfbyte, 0, this.p.a, 0, paramArrayOfbyte.length);
    } 
    parami.readFully(this.p.a, paramArrayOfbyte.length, paramInt);
    this.p.I(k);
  }
  
  private int E(i parami, v paramv, int paramInt) {
    int k = this.o.a();
    if (k > 0) {
      paramInt = Math.min(paramInt, k);
      paramv.b(this.o, paramInt);
    } else {
      paramInt = paramv.a(parami, paramInt, false);
    } 
    return paramInt;
  }
  
  private void F(i parami, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int k = Math.min(paramInt2, this.o.a());
    parami.readFully(paramArrayOfbyte, paramInt1 + k, paramInt2 - k);
    if (k > 0)
      this.o.h(paramArrayOfbyte, paramInt1, k); 
  }
  
  private t f() {
    if (this.v != -1L && this.y != -9223372036854775807L) {
      p p1 = this.H;
      if (p1 != null && p1.c() != 0) {
        p1 = this.I;
        if (p1 != null && p1.c() == this.H.c()) {
          int m;
          int i = this.H.c();
          int[] arrayOfInt = new int[i];
          long[] arrayOfLong1 = new long[i];
          long[] arrayOfLong2 = new long[i];
          long[] arrayOfLong3 = new long[i];
          byte b = 0;
          int k = 0;
          while (true) {
            m = b;
            if (k < i) {
              arrayOfLong3[k] = this.H.b(k);
              arrayOfLong1[k] = this.v + this.I.b(k);
              k++;
              continue;
            } 
            break;
          } 
          while (true) {
            k = i - 1;
            if (m < k) {
              k = m + 1;
              arrayOfInt[m] = (int)(arrayOfLong1[k] - arrayOfLong1[m]);
              arrayOfLong2[m] = arrayOfLong3[k] - arrayOfLong3[m];
              m = k;
              continue;
            } 
            arrayOfInt[k] = (int)(this.v + this.u - arrayOfLong1[k]);
            arrayOfLong2[k] = this.y - arrayOfLong3[k];
            long l1 = arrayOfLong2[k];
            int[] arrayOfInt1 = arrayOfInt;
            long[] arrayOfLong5 = arrayOfLong1;
            long[] arrayOfLong6 = arrayOfLong2;
            long[] arrayOfLong4 = arrayOfLong3;
            if (l1 <= 0L) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Discarding last cue point with unexpected duration: ");
              stringBuilder.append(l1);
              o.f("MatroskaExtractor", stringBuilder.toString());
              arrayOfInt1 = Arrays.copyOf(arrayOfInt, k);
              arrayOfLong5 = Arrays.copyOf(arrayOfLong1, k);
              arrayOfLong6 = Arrays.copyOf(arrayOfLong2, k);
              arrayOfLong4 = Arrays.copyOf(arrayOfLong3, k);
            } 
            this.H = null;
            this.I = null;
            return (t)new com.google.android.exoplayer2.c1.c(arrayOfInt1, arrayOfLong5, arrayOfLong6, arrayOfLong4);
          } 
        } 
      } 
    } 
    this.H = null;
    this.I = null;
    return (t)new t.b(this.y);
  }
  
  private void j(c paramc, long paramLong, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_1
    //   1: getfield R : Lcom/google/android/exoplayer2/c1/a0/e$d;
    //   4: astore #7
    //   6: aload #7
    //   8: ifnull -> 27
    //   11: aload #7
    //   13: aload_1
    //   14: lload_2
    //   15: iload #4
    //   17: iload #5
    //   19: iload #6
    //   21: invokevirtual c : (Lcom/google/android/exoplayer2/c1/a0/e$c;JIII)V
    //   24: goto -> 259
    //   27: ldc 'S_TEXT/UTF8'
    //   29: aload_1
    //   30: getfield b : Ljava/lang/String;
    //   33: invokevirtual equals : (Ljava/lang/Object;)Z
    //   36: ifne -> 55
    //   39: iload #5
    //   41: istore #8
    //   43: ldc 'S_TEXT/ASS'
    //   45: aload_1
    //   46: getfield b : Ljava/lang/String;
    //   49: invokevirtual equals : (Ljava/lang/Object;)Z
    //   52: ifeq -> 164
    //   55: aload_0
    //   56: getfield P : I
    //   59: iconst_1
    //   60: if_icmple -> 79
    //   63: ldc_w 'MatroskaExtractor'
    //   66: ldc_w 'Skipping subtitle sample in laced block.'
    //   69: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   72: iload #5
    //   74: istore #8
    //   76: goto -> 164
    //   79: aload_0
    //   80: getfield N : J
    //   83: lstore #9
    //   85: lload #9
    //   87: ldc2_w -9223372036854775807
    //   90: lcmp
    //   91: ifne -> 110
    //   94: ldc_w 'MatroskaExtractor'
    //   97: ldc_w 'Skipping subtitle sample with no duration.'
    //   100: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   103: iload #5
    //   105: istore #8
    //   107: goto -> 164
    //   110: aload_1
    //   111: getfield b : Ljava/lang/String;
    //   114: lload #9
    //   116: aload_0
    //   117: getfield p : Lcom/google/android/exoplayer2/util/v;
    //   120: getfield a : [B
    //   123: invokestatic z : (Ljava/lang/String;J[B)V
    //   126: aload_1
    //   127: getfield V : Lcom/google/android/exoplayer2/c1/v;
    //   130: astore #7
    //   132: aload_0
    //   133: getfield p : Lcom/google/android/exoplayer2/util/v;
    //   136: astore #11
    //   138: aload #7
    //   140: aload #11
    //   142: aload #11
    //   144: invokevirtual d : ()I
    //   147: invokeinterface b : (Lcom/google/android/exoplayer2/util/v;I)V
    //   152: iload #5
    //   154: aload_0
    //   155: getfield p : Lcom/google/android/exoplayer2/util/v;
    //   158: invokevirtual d : ()I
    //   161: iadd
    //   162: istore #8
    //   164: iload #4
    //   166: istore #5
    //   168: iload #8
    //   170: istore #12
    //   172: ldc_w 268435456
    //   175: iload #4
    //   177: iand
    //   178: ifeq -> 239
    //   181: aload_0
    //   182: getfield P : I
    //   185: iconst_1
    //   186: if_icmple -> 204
    //   189: iload #4
    //   191: ldc_w -268435457
    //   194: iand
    //   195: istore #5
    //   197: iload #8
    //   199: istore #12
    //   201: goto -> 239
    //   204: aload_0
    //   205: getfield s : Lcom/google/android/exoplayer2/util/v;
    //   208: invokevirtual d : ()I
    //   211: istore #5
    //   213: aload_1
    //   214: getfield V : Lcom/google/android/exoplayer2/c1/v;
    //   217: aload_0
    //   218: getfield s : Lcom/google/android/exoplayer2/util/v;
    //   221: iload #5
    //   223: invokeinterface b : (Lcom/google/android/exoplayer2/util/v;I)V
    //   228: iload #8
    //   230: iload #5
    //   232: iadd
    //   233: istore #12
    //   235: iload #4
    //   237: istore #5
    //   239: aload_1
    //   240: getfield V : Lcom/google/android/exoplayer2/c1/v;
    //   243: lload_2
    //   244: iload #5
    //   246: iload #12
    //   248: iload #6
    //   250: aload_1
    //   251: getfield i : Lcom/google/android/exoplayer2/c1/v$a;
    //   254: invokeinterface c : (JIIILcom/google/android/exoplayer2/c1/v$a;)V
    //   259: aload_0
    //   260: iconst_1
    //   261: putfield K : Z
    //   264: return
  }
  
  private static int[] l(int[] paramArrayOfint, int paramInt) {
    return (paramArrayOfint == null) ? new int[paramInt] : ((paramArrayOfint.length >= paramInt) ? paramArrayOfint : new int[Math.max(paramArrayOfint.length * 2, paramInt)]);
  }
  
  private int m() {
    int i = this.X;
    x();
    return i;
  }
  
  private static byte[] o(long paramLong1, String paramString, long paramLong2) {
    boolean bool;
    if (paramLong1 != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.a(bool);
    int i = (int)(paramLong1 / 3600000000L);
    paramLong1 -= (i * 3600) * 1000000L;
    int k = (int)(paramLong1 / 60000000L);
    paramLong1 -= (k * 60) * 1000000L;
    int m = (int)(paramLong1 / 1000000L);
    int n = (int)((paramLong1 - m * 1000000L) / paramLong2);
    return h0.R(String.format(Locale.US, paramString, new Object[] { Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n) }));
  }
  
  private static boolean s(String paramString) {
    return ("V_VP8".equals(paramString) || "V_VP9".equals(paramString) || "V_AV1".equals(paramString) || "V_MPEG2".equals(paramString) || "V_MPEG4/ISO/SP".equals(paramString) || "V_MPEG4/ISO/ASP".equals(paramString) || "V_MPEG4/ISO/AP".equals(paramString) || "V_MPEG4/ISO/AVC".equals(paramString) || "V_MPEGH/ISO/HEVC".equals(paramString) || "V_MS/VFW/FOURCC".equals(paramString) || "V_THEORA".equals(paramString) || "A_OPUS".equals(paramString) || "A_VORBIS".equals(paramString) || "A_AAC".equals(paramString) || "A_MPEG/L2".equals(paramString) || "A_MPEG/L3".equals(paramString) || "A_AC3".equals(paramString) || "A_EAC3".equals(paramString) || "A_TRUEHD".equals(paramString) || "A_DTS".equals(paramString) || "A_DTS/EXPRESS".equals(paramString) || "A_DTS/LOSSLESS".equals(paramString) || "A_FLAC".equals(paramString) || "A_MS/ACM".equals(paramString) || "A_PCM/INT/LIT".equals(paramString) || "S_TEXT/UTF8".equals(paramString) || "S_TEXT/ASS".equals(paramString) || "S_VOBSUB".equals(paramString) || "S_HDMV/PGS".equals(paramString) || "S_DVBSUB".equals(paramString));
  }
  
  private boolean v(s params, long paramLong) {
    if (this.D) {
      this.F = paramLong;
      params.a = this.E;
      this.D = false;
      return true;
    } 
    if (this.A) {
      paramLong = this.F;
      if (paramLong != -1L) {
        params.a = paramLong;
        this.F = -1L;
        return true;
      } 
    } 
    return false;
  }
  
  private void w(i parami, int paramInt) {
    if (this.l.d() >= paramInt)
      return; 
    if (this.l.b() < paramInt) {
      v v2 = this.l;
      byte[] arrayOfByte = v2.a;
      v2.K(Arrays.copyOf(arrayOfByte, Math.max(arrayOfByte.length * 2, paramInt)), this.l.d());
    } 
    v v1 = this.l;
    parami.readFully(v1.a, v1.d(), paramInt - this.l.d());
    this.l.L(paramInt);
  }
  
  private void x() {
    this.W = 0;
    this.X = 0;
    this.Y = 0;
    this.Z = false;
    this.a0 = false;
    this.b0 = false;
    this.c0 = 0;
    this.d0 = (byte)0;
    this.e0 = false;
    this.o.H();
  }
  
  private long y(long paramLong) {
    long l1 = this.w;
    if (l1 != -9223372036854775807L)
      return h0.l0(paramLong, l1, 1000L); 
    throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
  }
  
  private static void z(String paramString, long paramLong, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte;
    byte b;
    paramString.hashCode();
    if (!paramString.equals("S_TEXT/ASS")) {
      if (!paramString.equals("S_TEXT/UTF8"))
        throw new IllegalArgumentException(); 
      arrayOfByte = o(paramLong, "%02d:%02d:%02d,%03d", 1000L);
      b = 19;
    } else {
      arrayOfByte = o(paramLong, "%01d:%02d:%02d:%02d", 10000L);
      b = 21;
    } 
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, b, arrayOfByte.length);
  }
  
  protected void A(int paramInt, long paramLong1, long paramLong2) {
    if (paramInt != 160) {
      if (paramInt != 174) {
        if (paramInt != 187) {
          if (paramInt != 19899) {
            if (paramInt != 20533) {
              if (paramInt != 21968) {
                if (paramInt != 408125543) {
                  if (paramInt != 475249515) {
                    if (paramInt == 524531317 && !this.A)
                      if (this.i && this.E != -1L) {
                        this.D = true;
                      } else {
                        this.f0.a((t)new t.b(this.y));
                        this.A = true;
                      }  
                  } else {
                    this.H = new p();
                    this.I = new p();
                  } 
                } else {
                  long l1 = this.v;
                  if (l1 == -1L || l1 == paramLong1) {
                    this.v = paramLong1;
                    this.u = paramLong2;
                    return;
                  } 
                  throw new ParserException("Multiple Segment elements not supported");
                } 
              } else {
                this.z.w = true;
              } 
            } else {
              this.z.g = true;
            } 
          } else {
            this.B = -1;
            this.C = -1L;
          } 
        } else {
          this.J = false;
        } 
      } else {
        this.z = new c(null);
      } 
    } else {
      this.V = false;
    } 
  }
  
  protected void B(int paramInt, String paramString) {
    if (paramInt != 134) {
      if (paramInt != 17026) {
        if (paramInt != 21358) {
          if (paramInt == 2274716)
            c.a(this.z, paramString); 
        } else {
          this.z.a = paramString;
        } 
      } else if (!"webm".equals(paramString) && !"matroska".equals(paramString)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DocType ");
        stringBuilder.append(paramString);
        stringBuilder.append(" not supported");
        throw new ParserException(stringBuilder.toString());
      } 
    } else {
      this.z.b = paramString;
    } 
  }
  
  public final void a() {}
  
  protected void d(int paramInt1, int paramInt2, i parami) {
    // Byte code:
    //   0: iload_1
    //   1: sipush #161
    //   4: if_icmpeq -> 307
    //   7: iload_1
    //   8: sipush #163
    //   11: if_icmpeq -> 307
    //   14: iload_1
    //   15: sipush #165
    //   18: if_icmpeq -> 271
    //   21: iload_1
    //   22: sipush #16981
    //   25: if_icmpeq -> 240
    //   28: iload_1
    //   29: sipush #18402
    //   32: if_icmpeq -> 203
    //   35: iload_1
    //   36: sipush #21419
    //   39: if_icmpeq -> 152
    //   42: iload_1
    //   43: sipush #25506
    //   46: if_icmpeq -> 121
    //   49: iload_1
    //   50: sipush #30322
    //   53: if_icmpne -> 87
    //   56: aload_0
    //   57: getfield z : Lcom/google/android/exoplayer2/c1/a0/e$c;
    //   60: astore #4
    //   62: iload_2
    //   63: newarray byte
    //   65: astore #5
    //   67: aload #4
    //   69: aload #5
    //   71: putfield u : [B
    //   74: aload_3
    //   75: aload #5
    //   77: iconst_0
    //   78: iload_2
    //   79: invokeinterface readFully : ([BII)V
    //   84: goto -> 1359
    //   87: new java/lang/StringBuilder
    //   90: dup
    //   91: invokespecial <init> : ()V
    //   94: astore_3
    //   95: aload_3
    //   96: ldc_w 'Unexpected id: '
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_3
    //   104: iload_1
    //   105: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: new com/google/android/exoplayer2/ParserException
    //   112: dup
    //   113: aload_3
    //   114: invokevirtual toString : ()Ljava/lang/String;
    //   117: invokespecial <init> : (Ljava/lang/String;)V
    //   120: athrow
    //   121: aload_0
    //   122: getfield z : Lcom/google/android/exoplayer2/c1/a0/e$c;
    //   125: astore #4
    //   127: iload_2
    //   128: newarray byte
    //   130: astore #5
    //   132: aload #4
    //   134: aload #5
    //   136: putfield j : [B
    //   139: aload_3
    //   140: aload #5
    //   142: iconst_0
    //   143: iload_2
    //   144: invokeinterface readFully : ([BII)V
    //   149: goto -> 1359
    //   152: aload_0
    //   153: getfield n : Lcom/google/android/exoplayer2/util/v;
    //   156: getfield a : [B
    //   159: iconst_0
    //   160: invokestatic fill : ([BB)V
    //   163: aload_3
    //   164: aload_0
    //   165: getfield n : Lcom/google/android/exoplayer2/util/v;
    //   168: getfield a : [B
    //   171: iconst_4
    //   172: iload_2
    //   173: isub
    //   174: iload_2
    //   175: invokeinterface readFully : ([BII)V
    //   180: aload_0
    //   181: getfield n : Lcom/google/android/exoplayer2/util/v;
    //   184: iconst_0
    //   185: invokevirtual M : (I)V
    //   188: aload_0
    //   189: aload_0
    //   190: getfield n : Lcom/google/android/exoplayer2/util/v;
    //   193: invokevirtual B : ()J
    //   196: l2i
    //   197: putfield B : I
    //   200: goto -> 1359
    //   203: iload_2
    //   204: newarray byte
    //   206: astore #4
    //   208: aload_3
    //   209: aload #4
    //   211: iconst_0
    //   212: iload_2
    //   213: invokeinterface readFully : ([BII)V
    //   218: aload_0
    //   219: getfield z : Lcom/google/android/exoplayer2/c1/a0/e$c;
    //   222: new com/google/android/exoplayer2/c1/v$a
    //   225: dup
    //   226: iconst_1
    //   227: aload #4
    //   229: iconst_0
    //   230: iconst_0
    //   231: invokespecial <init> : (I[BII)V
    //   234: putfield i : Lcom/google/android/exoplayer2/c1/v$a;
    //   237: goto -> 1359
    //   240: aload_0
    //   241: getfield z : Lcom/google/android/exoplayer2/c1/a0/e$c;
    //   244: astore #5
    //   246: iload_2
    //   247: newarray byte
    //   249: astore #4
    //   251: aload #5
    //   253: aload #4
    //   255: putfield h : [B
    //   258: aload_3
    //   259: aload #4
    //   261: iconst_0
    //   262: iload_2
    //   263: invokeinterface readFully : ([BII)V
    //   268: goto -> 1359
    //   271: aload_0
    //   272: getfield L : I
    //   275: iconst_2
    //   276: if_icmpeq -> 280
    //   279: return
    //   280: aload_0
    //   281: aload_0
    //   282: getfield h : Landroid/util/SparseArray;
    //   285: aload_0
    //   286: getfield R : I
    //   289: invokevirtual get : (I)Ljava/lang/Object;
    //   292: checkcast com/google/android/exoplayer2/c1/a0/e$c
    //   295: aload_0
    //   296: getfield U : I
    //   299: aload_3
    //   300: iload_2
    //   301: invokevirtual q : (Lcom/google/android/exoplayer2/c1/a0/e$c;ILcom/google/android/exoplayer2/c1/i;I)V
    //   304: goto -> 1359
    //   307: aload_0
    //   308: getfield L : I
    //   311: ifne -> 361
    //   314: aload_0
    //   315: aload_0
    //   316: getfield g : Lcom/google/android/exoplayer2/c1/a0/g;
    //   319: aload_3
    //   320: iconst_0
    //   321: iconst_1
    //   322: bipush #8
    //   324: invokevirtual d : (Lcom/google/android/exoplayer2/c1/i;ZZI)J
    //   327: l2i
    //   328: putfield R : I
    //   331: aload_0
    //   332: aload_0
    //   333: getfield g : Lcom/google/android/exoplayer2/c1/a0/g;
    //   336: invokevirtual b : ()I
    //   339: putfield S : I
    //   342: aload_0
    //   343: ldc2_w -9223372036854775807
    //   346: putfield N : J
    //   349: aload_0
    //   350: iconst_1
    //   351: putfield L : I
    //   354: aload_0
    //   355: getfield l : Lcom/google/android/exoplayer2/util/v;
    //   358: invokevirtual H : ()V
    //   361: aload_0
    //   362: getfield h : Landroid/util/SparseArray;
    //   365: aload_0
    //   366: getfield R : I
    //   369: invokevirtual get : (I)Ljava/lang/Object;
    //   372: checkcast com/google/android/exoplayer2/c1/a0/e$c
    //   375: astore #4
    //   377: aload #4
    //   379: ifnonnull -> 400
    //   382: aload_3
    //   383: iload_2
    //   384: aload_0
    //   385: getfield S : I
    //   388: isub
    //   389: invokeinterface i : (I)V
    //   394: aload_0
    //   395: iconst_0
    //   396: putfield L : I
    //   399: return
    //   400: aload_0
    //   401: getfield L : I
    //   404: iconst_1
    //   405: if_icmpne -> 1221
    //   408: aload_0
    //   409: aload_3
    //   410: iconst_3
    //   411: invokespecial w : (Lcom/google/android/exoplayer2/c1/i;I)V
    //   414: aload_0
    //   415: getfield l : Lcom/google/android/exoplayer2/util/v;
    //   418: getfield a : [B
    //   421: iconst_2
    //   422: baload
    //   423: bipush #6
    //   425: iand
    //   426: iconst_1
    //   427: ishr
    //   428: istore #6
    //   430: iload #6
    //   432: ifne -> 471
    //   435: aload_0
    //   436: iconst_1
    //   437: putfield P : I
    //   440: aload_0
    //   441: getfield Q : [I
    //   444: iconst_1
    //   445: invokestatic l : ([II)[I
    //   448: astore #5
    //   450: aload_0
    //   451: aload #5
    //   453: putfield Q : [I
    //   456: aload #5
    //   458: iconst_0
    //   459: iload_2
    //   460: aload_0
    //   461: getfield S : I
    //   464: isub
    //   465: iconst_3
    //   466: isub
    //   467: iastore
    //   468: goto -> 1034
    //   471: iconst_4
    //   472: istore #7
    //   474: aload_0
    //   475: aload_3
    //   476: iconst_4
    //   477: invokespecial w : (Lcom/google/android/exoplayer2/c1/i;I)V
    //   480: aload_0
    //   481: getfield l : Lcom/google/android/exoplayer2/util/v;
    //   484: getfield a : [B
    //   487: iconst_3
    //   488: baload
    //   489: sipush #255
    //   492: iand
    //   493: iconst_1
    //   494: iadd
    //   495: istore #8
    //   497: aload_0
    //   498: iload #8
    //   500: putfield P : I
    //   503: aload_0
    //   504: getfield Q : [I
    //   507: iload #8
    //   509: invokestatic l : ([II)[I
    //   512: astore #5
    //   514: aload_0
    //   515: aload #5
    //   517: putfield Q : [I
    //   520: iload #6
    //   522: iconst_2
    //   523: if_icmpne -> 558
    //   526: aload_0
    //   527: getfield S : I
    //   530: istore #6
    //   532: aload_0
    //   533: getfield P : I
    //   536: istore #7
    //   538: aload #5
    //   540: iconst_0
    //   541: iload #7
    //   543: iload_2
    //   544: iload #6
    //   546: isub
    //   547: iconst_4
    //   548: isub
    //   549: iload #7
    //   551: idiv
    //   552: invokestatic fill : ([IIII)V
    //   555: goto -> 468
    //   558: iload #6
    //   560: iconst_1
    //   561: if_icmpne -> 699
    //   564: iconst_0
    //   565: istore #6
    //   567: iconst_0
    //   568: istore #8
    //   570: aload_0
    //   571: getfield P : I
    //   574: istore #9
    //   576: iload #6
    //   578: iload #9
    //   580: iconst_1
    //   581: isub
    //   582: if_icmpge -> 675
    //   585: aload_0
    //   586: getfield Q : [I
    //   589: iload #6
    //   591: iconst_0
    //   592: iastore
    //   593: iload #7
    //   595: istore #9
    //   597: iload #9
    //   599: iconst_1
    //   600: iadd
    //   601: istore #7
    //   603: aload_0
    //   604: aload_3
    //   605: iload #7
    //   607: invokespecial w : (Lcom/google/android/exoplayer2/c1/i;I)V
    //   610: aload_0
    //   611: getfield l : Lcom/google/android/exoplayer2/util/v;
    //   614: getfield a : [B
    //   617: iload #7
    //   619: iconst_1
    //   620: isub
    //   621: baload
    //   622: sipush #255
    //   625: iand
    //   626: istore #10
    //   628: aload_0
    //   629: getfield Q : [I
    //   632: astore #5
    //   634: aload #5
    //   636: iload #6
    //   638: aload #5
    //   640: iload #6
    //   642: iaload
    //   643: iload #10
    //   645: iadd
    //   646: iastore
    //   647: iload #7
    //   649: istore #9
    //   651: iload #10
    //   653: sipush #255
    //   656: if_icmpeq -> 597
    //   659: iload #8
    //   661: aload #5
    //   663: iload #6
    //   665: iaload
    //   666: iadd
    //   667: istore #8
    //   669: iinc #6, 1
    //   672: goto -> 570
    //   675: aload_0
    //   676: getfield Q : [I
    //   679: iload #9
    //   681: iconst_1
    //   682: isub
    //   683: iload_2
    //   684: aload_0
    //   685: getfield S : I
    //   688: isub
    //   689: iload #7
    //   691: isub
    //   692: iload #8
    //   694: isub
    //   695: iastore
    //   696: goto -> 468
    //   699: iload #6
    //   701: iconst_3
    //   702: if_icmpne -> 1186
    //   705: iconst_0
    //   706: istore #6
    //   708: iconst_0
    //   709: istore #8
    //   711: aload_0
    //   712: getfield P : I
    //   715: istore #9
    //   717: iload #6
    //   719: iload #9
    //   721: iconst_1
    //   722: isub
    //   723: if_icmpge -> 1013
    //   726: aload_0
    //   727: getfield Q : [I
    //   730: iload #6
    //   732: iconst_0
    //   733: iastore
    //   734: iinc #7, 1
    //   737: aload_0
    //   738: aload_3
    //   739: iload #7
    //   741: invokespecial w : (Lcom/google/android/exoplayer2/c1/i;I)V
    //   744: aload_0
    //   745: getfield l : Lcom/google/android/exoplayer2/util/v;
    //   748: getfield a : [B
    //   751: astore #5
    //   753: iload #7
    //   755: iconst_1
    //   756: isub
    //   757: istore #10
    //   759: aload #5
    //   761: iload #10
    //   763: baload
    //   764: ifeq -> 1002
    //   767: iconst_0
    //   768: istore #9
    //   770: iload #9
    //   772: bipush #8
    //   774: if_icmpge -> 916
    //   777: iconst_1
    //   778: bipush #7
    //   780: iload #9
    //   782: isub
    //   783: ishl
    //   784: istore #11
    //   786: aload_0
    //   787: getfield l : Lcom/google/android/exoplayer2/util/v;
    //   790: getfield a : [B
    //   793: iload #10
    //   795: baload
    //   796: iload #11
    //   798: iand
    //   799: ifeq -> 910
    //   802: iload #7
    //   804: iload #9
    //   806: iadd
    //   807: istore #7
    //   809: aload_0
    //   810: aload_3
    //   811: iload #7
    //   813: invokespecial w : (Lcom/google/android/exoplayer2/c1/i;I)V
    //   816: aload_0
    //   817: getfield l : Lcom/google/android/exoplayer2/util/v;
    //   820: getfield a : [B
    //   823: iload #10
    //   825: baload
    //   826: sipush #255
    //   829: iand
    //   830: iload #11
    //   832: iconst_m1
    //   833: ixor
    //   834: iand
    //   835: i2l
    //   836: lstore #12
    //   838: iinc #10, 1
    //   841: lload #12
    //   843: lstore #14
    //   845: iload #10
    //   847: iload #7
    //   849: if_icmpge -> 881
    //   852: lload #14
    //   854: bipush #8
    //   856: lshl
    //   857: aload_0
    //   858: getfield l : Lcom/google/android/exoplayer2/util/v;
    //   861: getfield a : [B
    //   864: iload #10
    //   866: baload
    //   867: sipush #255
    //   870: iand
    //   871: i2l
    //   872: lor
    //   873: lstore #12
    //   875: iinc #10, 1
    //   878: goto -> 841
    //   881: lload #14
    //   883: lstore #12
    //   885: iload #6
    //   887: ifle -> 907
    //   890: lload #14
    //   892: lconst_1
    //   893: iload #9
    //   895: bipush #7
    //   897: imul
    //   898: bipush #6
    //   900: iadd
    //   901: lshl
    //   902: lconst_1
    //   903: lsub
    //   904: lsub
    //   905: lstore #12
    //   907: goto -> 919
    //   910: iinc #9, 1
    //   913: goto -> 770
    //   916: lconst_0
    //   917: lstore #12
    //   919: lload #12
    //   921: ldc2_w -2147483648
    //   924: lcmp
    //   925: iflt -> 991
    //   928: lload #12
    //   930: ldc2_w 2147483647
    //   933: lcmp
    //   934: ifgt -> 991
    //   937: lload #12
    //   939: l2i
    //   940: istore #9
    //   942: aload_0
    //   943: getfield Q : [I
    //   946: astore #5
    //   948: iload #6
    //   950: ifne -> 956
    //   953: goto -> 968
    //   956: iload #9
    //   958: aload #5
    //   960: iload #6
    //   962: iconst_1
    //   963: isub
    //   964: iaload
    //   965: iadd
    //   966: istore #9
    //   968: aload #5
    //   970: iload #6
    //   972: iload #9
    //   974: iastore
    //   975: iload #8
    //   977: aload #5
    //   979: iload #6
    //   981: iaload
    //   982: iadd
    //   983: istore #8
    //   985: iinc #6, 1
    //   988: goto -> 711
    //   991: new com/google/android/exoplayer2/ParserException
    //   994: dup
    //   995: ldc_w 'EBML lacing sample size out of range.'
    //   998: invokespecial <init> : (Ljava/lang/String;)V
    //   1001: athrow
    //   1002: new com/google/android/exoplayer2/ParserException
    //   1005: dup
    //   1006: ldc_w 'No valid varint length mask found'
    //   1009: invokespecial <init> : (Ljava/lang/String;)V
    //   1012: athrow
    //   1013: aload_0
    //   1014: getfield Q : [I
    //   1017: iload #9
    //   1019: iconst_1
    //   1020: isub
    //   1021: iload_2
    //   1022: aload_0
    //   1023: getfield S : I
    //   1026: isub
    //   1027: iload #7
    //   1029: isub
    //   1030: iload #8
    //   1032: isub
    //   1033: iastore
    //   1034: aload_0
    //   1035: getfield l : Lcom/google/android/exoplayer2/util/v;
    //   1038: getfield a : [B
    //   1041: astore #5
    //   1043: aload #5
    //   1045: iconst_0
    //   1046: baload
    //   1047: istore #7
    //   1049: aload #5
    //   1051: iconst_1
    //   1052: baload
    //   1053: istore_2
    //   1054: aload_0
    //   1055: aload_0
    //   1056: getfield G : J
    //   1059: aload_0
    //   1060: iload_2
    //   1061: sipush #255
    //   1064: iand
    //   1065: iload #7
    //   1067: bipush #8
    //   1069: ishl
    //   1070: ior
    //   1071: i2l
    //   1072: invokespecial y : (J)J
    //   1075: ladd
    //   1076: putfield M : J
    //   1079: aload_0
    //   1080: getfield l : Lcom/google/android/exoplayer2/util/v;
    //   1083: getfield a : [B
    //   1086: astore #5
    //   1088: aload #5
    //   1090: iconst_2
    //   1091: baload
    //   1092: bipush #8
    //   1094: iand
    //   1095: bipush #8
    //   1097: if_icmpne -> 1106
    //   1100: iconst_1
    //   1101: istore #7
    //   1103: goto -> 1109
    //   1106: iconst_0
    //   1107: istore #7
    //   1109: aload #4
    //   1111: getfield d : I
    //   1114: iconst_2
    //   1115: if_icmpeq -> 1147
    //   1118: iload_1
    //   1119: sipush #163
    //   1122: if_icmpne -> 1142
    //   1125: aload #5
    //   1127: iconst_2
    //   1128: baload
    //   1129: sipush #128
    //   1132: iand
    //   1133: sipush #128
    //   1136: if_icmpne -> 1142
    //   1139: goto -> 1147
    //   1142: iconst_0
    //   1143: istore_2
    //   1144: goto -> 1149
    //   1147: iconst_1
    //   1148: istore_2
    //   1149: iload #7
    //   1151: ifeq -> 1162
    //   1154: ldc_w -2147483648
    //   1157: istore #7
    //   1159: goto -> 1165
    //   1162: iconst_0
    //   1163: istore #7
    //   1165: aload_0
    //   1166: iload_2
    //   1167: iload #7
    //   1169: ior
    //   1170: putfield T : I
    //   1173: aload_0
    //   1174: iconst_2
    //   1175: putfield L : I
    //   1178: aload_0
    //   1179: iconst_0
    //   1180: putfield O : I
    //   1183: goto -> 1221
    //   1186: new java/lang/StringBuilder
    //   1189: dup
    //   1190: invokespecial <init> : ()V
    //   1193: astore_3
    //   1194: aload_3
    //   1195: ldc_w 'Unexpected lacing value: '
    //   1198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1201: pop
    //   1202: aload_3
    //   1203: iload #6
    //   1205: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1208: pop
    //   1209: new com/google/android/exoplayer2/ParserException
    //   1212: dup
    //   1213: aload_3
    //   1214: invokevirtual toString : ()Ljava/lang/String;
    //   1217: invokespecial <init> : (Ljava/lang/String;)V
    //   1220: athrow
    //   1221: iload_1
    //   1222: sipush #163
    //   1225: if_icmpne -> 1312
    //   1228: aload_0
    //   1229: getfield O : I
    //   1232: istore_1
    //   1233: iload_1
    //   1234: aload_0
    //   1235: getfield P : I
    //   1238: if_icmpge -> 1304
    //   1241: aload_0
    //   1242: aload_3
    //   1243: aload #4
    //   1245: aload_0
    //   1246: getfield Q : [I
    //   1249: iload_1
    //   1250: iaload
    //   1251: invokespecial C : (Lcom/google/android/exoplayer2/c1/i;Lcom/google/android/exoplayer2/c1/a0/e$c;I)I
    //   1254: istore_1
    //   1255: aload_0
    //   1256: getfield M : J
    //   1259: lstore #12
    //   1261: aload_0
    //   1262: aload #4
    //   1264: aload_0
    //   1265: getfield O : I
    //   1268: aload #4
    //   1270: getfield e : I
    //   1273: imul
    //   1274: sipush #1000
    //   1277: idiv
    //   1278: i2l
    //   1279: lload #12
    //   1281: ladd
    //   1282: aload_0
    //   1283: getfield T : I
    //   1286: iload_1
    //   1287: iconst_0
    //   1288: invokespecial j : (Lcom/google/android/exoplayer2/c1/a0/e$c;JIII)V
    //   1291: aload_0
    //   1292: aload_0
    //   1293: getfield O : I
    //   1296: iconst_1
    //   1297: iadd
    //   1298: putfield O : I
    //   1301: goto -> 1228
    //   1304: aload_0
    //   1305: iconst_0
    //   1306: putfield L : I
    //   1309: goto -> 1359
    //   1312: aload_0
    //   1313: getfield O : I
    //   1316: istore_1
    //   1317: iload_1
    //   1318: aload_0
    //   1319: getfield P : I
    //   1322: if_icmpge -> 1359
    //   1325: aload_0
    //   1326: getfield Q : [I
    //   1329: astore #5
    //   1331: aload #5
    //   1333: iload_1
    //   1334: aload_0
    //   1335: aload_3
    //   1336: aload #4
    //   1338: aload #5
    //   1340: iload_1
    //   1341: iaload
    //   1342: invokespecial C : (Lcom/google/android/exoplayer2/c1/i;Lcom/google/android/exoplayer2/c1/a0/e$c;I)I
    //   1345: iastore
    //   1346: aload_0
    //   1347: aload_0
    //   1348: getfield O : I
    //   1351: iconst_1
    //   1352: iadd
    //   1353: putfield O : I
    //   1356: goto -> 1312
    //   1359: return
  }
  
  public final boolean e(i parami) {
    return (new f()).b(parami);
  }
  
  public final int g(i parami, s params) {
    byte b = 0;
    this.K = false;
    boolean bool = true;
    while (bool && !this.K) {
      boolean bool1 = this.f.b(parami);
      bool = bool1;
      if (bool1) {
        bool = bool1;
        if (v(params, parami.a()))
          return 1; 
      } 
    } 
    if (!bool) {
      while (b < this.h.size()) {
        ((c)this.h.valueAt(b)).d();
        b++;
      } 
      return -1;
    } 
    return 0;
  }
  
  public final void h(j paramj) {
    this.f0 = paramj;
  }
  
  public void i(long paramLong1, long paramLong2) {
    this.G = -9223372036854775807L;
    byte b = 0;
    this.L = 0;
    this.f.a();
    this.g.e();
    x();
    while (b < this.h.size()) {
      ((c)this.h.valueAt(b)).h();
      b++;
    } 
  }
  
  protected void k(int paramInt) {
    if (paramInt != 160) {
      if (paramInt != 174) {
        if (paramInt != 19899) {
          if (paramInt != 25152) {
            if (paramInt != 28032) {
              if (paramInt != 357149030) {
                if (paramInt != 374648427) {
                  if (paramInt == 475249515 && !this.A) {
                    this.f0.a(f());
                    this.A = true;
                  } 
                } else if (this.h.size() != 0) {
                  this.f0.f();
                } else {
                  throw new ParserException("No valid tracks were found");
                } 
              } else {
                if (this.w == -9223372036854775807L)
                  this.w = 1000000L; 
                long l1 = this.x;
                if (l1 != -9223372036854775807L)
                  this.y = y(l1); 
              } 
            } else {
              c c1 = this.z;
              if (c1.g && c1.h != null)
                throw new ParserException("Combining encryption and compression is not supported"); 
            } 
          } else {
            c c1 = this.z;
            if (c1.g)
              if (c1.i != null) {
                c1.k = new DrmInitData(new DrmInitData.SchemeData[] { new DrmInitData.SchemeData(v.a, "video/webm", this.z.i.b) });
              } else {
                throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
              }  
          } 
        } else {
          paramInt = this.B;
          if (paramInt != -1) {
            long l1 = this.C;
            if (l1 != -1L) {
              if (paramInt == 475249515)
                this.E = l1; 
            } else {
              throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            } 
          } else {
            throw new ParserException("Mandatory element SeekID or SeekPosition not found");
          } 
        } 
      } else {
        if (s(this.z.b)) {
          c c1 = this.z;
          c1.c(this.f0, c1.c);
          SparseArray<c> sparseArray = this.h;
          c1 = this.z;
          sparseArray.put(c1.c, c1);
        } 
        this.z = null;
      } 
    } else {
      if (this.L != 2)
        return; 
      byte b = 0;
      paramInt = 0;
      while (b < this.P) {
        paramInt += this.Q[b];
        b++;
      } 
      c c1 = (c)this.h.get(this.R);
      for (b = 0; b < this.P; b++) {
        long l2 = this.M;
        long l1 = (c1.e * b / 1000);
        int i = this.T;
        int k = i;
        if (b == 0) {
          k = i;
          if (!this.V)
            k = i | 0x1; 
        } 
        i = this.Q[b];
        paramInt -= i;
        j(c1, l1 + l2, k, i, paramInt);
      } 
      this.L = 0;
    } 
  }
  
  protected void n(int paramInt, double paramDouble) {
    if (paramInt != 181) {
      if (paramInt != 17545) {
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                return;
              case 30325:
                this.z.t = (float)paramDouble;
              case 30324:
                this.z.s = (float)paramDouble;
              case 30323:
                break;
            } 
            this.z.r = (float)paramDouble;
          case 21978:
            this.z.L = (float)paramDouble;
          case 21977:
            this.z.K = (float)paramDouble;
          case 21976:
            this.z.J = (float)paramDouble;
          case 21975:
            this.z.I = (float)paramDouble;
          case 21974:
            this.z.H = (float)paramDouble;
          case 21973:
            this.z.G = (float)paramDouble;
          case 21972:
            this.z.F = (float)paramDouble;
          case 21971:
            this.z.E = (float)paramDouble;
          case 21970:
            this.z.D = (float)paramDouble;
          case 21969:
            break;
        } 
        this.z.C = (float)paramDouble;
      } 
      this.x = (long)paramDouble;
    } 
    this.z.O = (int)paramDouble;
  }
  
  protected int p(int paramInt) {
    switch (paramInt) {
      default:
        return 0;
      case 181:
      case 17545:
      case 21969:
      case 21970:
      case 21971:
      case 21972:
      case 21973:
      case 21974:
      case 21975:
      case 21976:
      case 21977:
      case 21978:
      case 30323:
      case 30324:
      case 30325:
        return 5;
      case 161:
      case 163:
      case 165:
      case 16981:
      case 18402:
      case 21419:
      case 25506:
      case 30322:
        return 4;
      case 160:
      case 166:
      case 174:
      case 183:
      case 187:
      case 224:
      case 225:
      case 18407:
      case 19899:
      case 20532:
      case 20533:
      case 21936:
      case 21968:
      case 25152:
      case 28032:
      case 30113:
      case 30320:
      case 290298740:
      case 357149030:
      case 374648427:
      case 408125543:
      case 440786851:
      case 475249515:
      case 524531317:
        return 1;
      case 134:
      case 17026:
      case 21358:
      case 2274716:
        return 3;
      case 131:
      case 136:
      case 155:
      case 159:
      case 176:
      case 179:
      case 186:
      case 215:
      case 231:
      case 238:
      case 241:
      case 251:
      case 16980:
      case 17029:
      case 17143:
      case 18401:
      case 18408:
      case 20529:
      case 20530:
      case 21420:
      case 21432:
      case 21680:
      case 21682:
      case 21690:
      case 21930:
      case 21945:
      case 21946:
      case 21947:
      case 21948:
      case 21949:
      case 21998:
      case 22186:
      case 22203:
      case 25188:
      case 30321:
      case 2352003:
      case 2807729:
        break;
    } 
    return 2;
  }
  
  protected void q(c paramc, int paramInt1, i parami, int paramInt2) {
    if (paramInt1 == 4 && "V_VP9".equals(paramc.b)) {
      this.s.I(paramInt2);
      parami.readFully(this.s.a, 0, paramInt2);
    } else {
      parami.i(paramInt2);
    } 
  }
  
  protected void r(int paramInt, long paramLong) {
    if (paramInt != 20529) {
      if (paramInt != 20530) {
        c c2;
        StringBuilder stringBuilder2;
        c c1;
        boolean bool1 = false;
        boolean bool2 = false;
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                return;
              case 21949:
                this.z.B = (int)paramLong;
              case 21948:
                this.z.A = (int)paramLong;
              case 21947:
                c2 = this.z;
                c2.w = true;
                paramInt = (int)paramLong;
                if (paramInt != 1) {
                  if (paramInt != 9) {
                    if (paramInt == 4 || paramInt == 5 || paramInt == 6 || paramInt == 7)
                      c2.x = 2; 
                  } else {
                    c2.x = 6;
                  } 
                } else {
                  c2.x = 1;
                } 
              case 21946:
                paramInt = (int)paramLong;
                if (paramInt != 1)
                  if (paramInt != 16) {
                    if (paramInt != 18) {
                      if (paramInt != 6 && paramInt != 7)
                        return; 
                    } else {
                      this.z.y = 7;
                    } 
                  } else {
                    this.z.y = 6;
                  }  
                this.z.y = 3;
              case 21945:
                break;
            } 
            paramInt = (int)paramLong;
            if (paramInt != 1) {
              if (paramInt != 2);
              this.z.z = 1;
            } 
            this.z.z = 2;
          case 2807729:
            this.w = paramLong;
          case 2352003:
            this.z.e = (int)paramLong;
          case 30321:
            paramInt = (int)paramLong;
            if (paramInt != 0) {
              if (paramInt != 1) {
                if (paramInt != 2) {
                  if (paramInt != 3);
                  this.z.q = 3;
                } 
                this.z.q = 2;
              } 
              this.z.q = 1;
            } 
            this.z.q = 0;
          case 25188:
            this.z.N = (int)paramLong;
          case 22203:
            this.z.Q = paramLong;
          case 22186:
            this.z.P = paramLong;
          case 21998:
            this.z.f = (int)paramLong;
          case 21930:
            c2 = this.z;
            if (paramLong == 1L)
              bool2 = true; 
            c2.S = bool2;
          case 21690:
            this.z.o = (int)paramLong;
          case 21682:
            this.z.p = (int)paramLong;
          case 21680:
            this.z.n = (int)paramLong;
          case 21432:
            paramInt = (int)paramLong;
            if (paramInt != 0) {
              if (paramInt != 1) {
                if (paramInt != 3) {
                  if (paramInt != 15);
                  this.z.v = 3;
                } 
                this.z.v = 1;
              } 
              this.z.v = 2;
            } 
            this.z.v = 0;
          case 21420:
            this.C = paramLong + this.v;
          case 18408:
            if (paramLong == 1L);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("AESSettingsCipherMode ");
            stringBuilder2.append(paramLong);
            stringBuilder2.append(" not supported");
            throw new ParserException(stringBuilder2.toString());
          case 18401:
            if (paramLong == 5L);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("ContentEncAlgo ");
            stringBuilder2.append(paramLong);
            stringBuilder2.append(" not supported");
            throw new ParserException(stringBuilder2.toString());
          case 17143:
            if (paramLong == 1L);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("EBMLReadVersion ");
            stringBuilder2.append(paramLong);
            stringBuilder2.append(" not supported");
            throw new ParserException(stringBuilder2.toString());
          case 17029:
            if (paramLong >= 1L && paramLong <= 2L);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("DocTypeReadVersion ");
            stringBuilder2.append(paramLong);
            stringBuilder2.append(" not supported");
            throw new ParserException(stringBuilder2.toString());
          case 16980:
            if (paramLong == 3L);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("ContentCompAlgo ");
            stringBuilder2.append(paramLong);
            stringBuilder2.append(" not supported");
            throw new ParserException(stringBuilder2.toString());
          case 251:
            this.V = true;
          case 241:
            if (!this.J) {
              this.I.a(paramLong);
              this.J = true;
            } 
          case 238:
            this.U = (int)paramLong;
          case 231:
            this.G = y(paramLong);
          case 215:
            this.z.c = (int)paramLong;
          case 186:
            this.z.m = (int)paramLong;
          case 179:
            this.H.a(y(paramLong));
          case 176:
            this.z.l = (int)paramLong;
          case 159:
            this.z.M = (int)paramLong;
          case 155:
            this.N = y(paramLong);
          case 136:
            c1 = this.z;
            bool2 = bool1;
            if (paramLong == 1L)
              bool2 = true; 
            c1.T = bool2;
          case 131:
            break;
        } 
        this.z.d = (int)paramLong;
      } 
      if (paramLong == 1L);
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("ContentEncodingScope ");
      stringBuilder1.append(paramLong);
      stringBuilder1.append(" not supported");
      throw new ParserException(stringBuilder1.toString());
    } 
    if (paramLong == 0L);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ContentEncodingOrder ");
    stringBuilder.append(paramLong);
    stringBuilder.append(" not supported");
    throw new ParserException(stringBuilder.toString());
  }
  
  protected boolean t(int paramInt) {
    return (paramInt == 357149030 || paramInt == 524531317 || paramInt == 475249515 || paramInt == 374648427);
  }
  
  private final class b implements c {
    private b(e this$0) {}
    
    public void a(int param1Int) {
      this.a.k(param1Int);
    }
    
    public int b(int param1Int) {
      return this.a.p(param1Int);
    }
    
    public boolean c(int param1Int) {
      return this.a.t(param1Int);
    }
    
    public void d(int param1Int1, int param1Int2, i param1i) {
      this.a.d(param1Int1, param1Int2, param1i);
    }
    
    public void e(int param1Int, String param1String) {
      this.a.B(param1Int, param1String);
    }
    
    public void f(int param1Int, double param1Double) {
      this.a.n(param1Int, param1Double);
    }
    
    public void g(int param1Int, long param1Long1, long param1Long2) {
      this.a.A(param1Int, param1Long1, param1Long2);
    }
    
    public void h(int param1Int, long param1Long) {
      this.a.r(param1Int, param1Long);
    }
  }
  
  private static final class c {
    public int A = 1000;
    
    public int B = 200;
    
    public float C = -1.0F;
    
    public float D = -1.0F;
    
    public float E = -1.0F;
    
    public float F = -1.0F;
    
    public float G = -1.0F;
    
    public float H = -1.0F;
    
    public float I = -1.0F;
    
    public float J = -1.0F;
    
    public float K = -1.0F;
    
    public float L = -1.0F;
    
    public int M = 1;
    
    public int N = -1;
    
    public int O = 8000;
    
    public long P = 0L;
    
    public long Q = 0L;
    
    public e.d R;
    
    public boolean S;
    
    public boolean T = true;
    
    private String U = "eng";
    
    public v V;
    
    public int W;
    
    public String a;
    
    public String b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    public boolean g;
    
    public byte[] h;
    
    public v.a i;
    
    public byte[] j;
    
    public DrmInitData k;
    
    public int l = -1;
    
    public int m = -1;
    
    public int n = -1;
    
    public int o = -1;
    
    public int p = 0;
    
    public int q = -1;
    
    public float r = 0.0F;
    
    public float s = 0.0F;
    
    public float t = 0.0F;
    
    public byte[] u = null;
    
    public int v = -1;
    
    public boolean w = false;
    
    public int x = -1;
    
    public int y = -1;
    
    public int z = -1;
    
    private c() {}
    
    private byte[] b() {
      if (this.C == -1.0F || this.D == -1.0F || this.E == -1.0F || this.F == -1.0F || this.G == -1.0F || this.H == -1.0F || this.I == -1.0F || this.J == -1.0F || this.K == -1.0F || this.L == -1.0F)
        return null; 
      byte[] arrayOfByte = new byte[25];
      ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte).order(ByteOrder.LITTLE_ENDIAN);
      byteBuffer.put((byte)0);
      byteBuffer.putShort((short)(int)(this.C * 50000.0F + 0.5F));
      byteBuffer.putShort((short)(int)(this.D * 50000.0F + 0.5F));
      byteBuffer.putShort((short)(int)(this.E * 50000.0F + 0.5F));
      byteBuffer.putShort((short)(int)(this.F * 50000.0F + 0.5F));
      byteBuffer.putShort((short)(int)(this.G * 50000.0F + 0.5F));
      byteBuffer.putShort((short)(int)(this.H * 50000.0F + 0.5F));
      byteBuffer.putShort((short)(int)(this.I * 50000.0F + 0.5F));
      byteBuffer.putShort((short)(int)(this.J * 50000.0F + 0.5F));
      byteBuffer.putShort((short)(int)(this.K + 0.5F));
      byteBuffer.putShort((short)(int)(this.L + 0.5F));
      byteBuffer.putShort((short)this.A);
      byteBuffer.putShort((short)this.B);
      return arrayOfByte;
    }
    
    private static Pair<String, List<byte[]>> e(v param1v) {
      try {
        param1v.N(16);
        long l = param1v.p();
        if (l == 1482049860L)
          return new Pair("video/divx", null); 
        if (l == 859189832L)
          return new Pair("video/3gpp", null); 
        if (l == 826496599L) {
          int i = param1v.c() + 20;
          byte[] arrayOfByte = param1v.a;
          while (i < arrayOfByte.length - 4) {
            if (arrayOfByte[i] == 0 && arrayOfByte[i + 1] == 0 && arrayOfByte[i + 2] == 1 && arrayOfByte[i + 3] == 15)
              return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(arrayOfByte, i, arrayOfByte.length))); 
            i++;
          } 
          ParserException parserException = new ParserException();
          this("Failed to find FourCC VC1 initialization data");
          throw parserException;
        } 
        o.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        return new Pair("video/x-unknown", null);
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        ParserException parserException = new ParserException("Error parsing FourCC private data");
        throw parserException;
      } 
    }
    
    private static boolean f(v param1v) {
      try {
        int i = param1v.r();
        boolean bool = true;
        if (i == 1)
          return true; 
        if (i == 65534) {
          param1v.M(24);
          if (param1v.s() == e.c().getMostSignificantBits()) {
            long l1 = param1v.s();
            long l2 = e.c().getLeastSignificantBits();
            if (l1 == l2)
              return bool; 
          } 
          return false;
        } 
        return false;
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        throw new ParserException("Error parsing MS/ACM codec private");
      } 
    }
    
    private static List<byte[]> g(byte[] param1ArrayOfbyte) {
      if (param1ArrayOfbyte[0] == 2) {
        int i = 1;
        int j = 0;
        while (param1ArrayOfbyte[i] == -1) {
          j += true;
          i++;
        } 
        int k = i + 1;
        int m = j + param1ArrayOfbyte[i];
        i = 0;
        for (j = k; param1ArrayOfbyte[j] == -1; j++)
          i += 255; 
        k = j + 1;
        j = param1ArrayOfbyte[j];
        if (param1ArrayOfbyte[k] == 1)
          try {
            byte[] arrayOfByte = new byte[m];
            System.arraycopy(param1ArrayOfbyte, k, arrayOfByte, 0, m);
            k += m;
            if (param1ArrayOfbyte[k] == 3) {
              i = k + i + j;
              if (param1ArrayOfbyte[i] == 5) {
                byte[] arrayOfByte1 = new byte[param1ArrayOfbyte.length - i];
                System.arraycopy(param1ArrayOfbyte, i, arrayOfByte1, 0, param1ArrayOfbyte.length - i);
                ArrayList<byte[]> arrayList = new ArrayList();
                this(2);
                arrayList.add(arrayOfByte);
                arrayList.add(arrayOfByte1);
                return (List<byte[]>)arrayList;
              } 
              ParserException parserException3 = new ParserException();
              this("Error parsing vorbis codec private");
              throw parserException3;
            } 
            ParserException parserException2 = new ParserException();
            this("Error parsing vorbis codec private");
            throw parserException2;
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            ParserException parserException2 = new ParserException("Error parsing vorbis codec private");
            throw parserException2;
          }  
        ParserException parserException1 = new ParserException();
        this("Error parsing vorbis codec private");
        throw parserException1;
      } 
      ParserException parserException = new ParserException();
      this("Error parsing vorbis codec private");
      throw parserException;
    }
    
    public void c(j param1j, int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Ljava/lang/String;
      //   4: astore_3
      //   5: aload_3
      //   6: invokevirtual hashCode : ()I
      //   9: pop
      //   10: aload_3
      //   11: invokevirtual hashCode : ()I
      //   14: istore #4
      //   16: iconst_1
      //   17: istore #5
      //   19: iload #4
      //   21: lookupswitch default -> 272, -2095576542 -> 853, -2095575984 -> 834, -1985379776 -> 815, -1784763192 -> 796, -1730367663 -> 777, -1482641358 -> 758, -1482641357 -> 738, -1373388978 -> 718, -933872740 -> 698, -538363189 -> 678, -538363109 -> 658, -425012669 -> 638, -356037306 -> 618, 62923557 -> 598, 62923603 -> 578, 62927045 -> 558, 82318131 -> 538, 82338133 -> 518, 82338134 -> 498, 99146302 -> 478, 444813526 -> 458, 542569478 -> 438, 725957860 -> 418, 738597099 -> 398, 855502857 -> 378, 1422270023 -> 358, 1809237540 -> 338, 1950749482 -> 318, 1950789798 -> 298, 1951062397 -> 278
      //   272: iconst_m1
      //   273: istore #4
      //   275: goto -> 869
      //   278: aload_3
      //   279: ldc_w 'A_OPUS'
      //   282: invokevirtual equals : (Ljava/lang/Object;)Z
      //   285: ifne -> 291
      //   288: goto -> 272
      //   291: bipush #29
      //   293: istore #4
      //   295: goto -> 869
      //   298: aload_3
      //   299: ldc_w 'A_FLAC'
      //   302: invokevirtual equals : (Ljava/lang/Object;)Z
      //   305: ifne -> 311
      //   308: goto -> 272
      //   311: bipush #28
      //   313: istore #4
      //   315: goto -> 869
      //   318: aload_3
      //   319: ldc_w 'A_EAC3'
      //   322: invokevirtual equals : (Ljava/lang/Object;)Z
      //   325: ifne -> 331
      //   328: goto -> 272
      //   331: bipush #27
      //   333: istore #4
      //   335: goto -> 869
      //   338: aload_3
      //   339: ldc_w 'V_MPEG2'
      //   342: invokevirtual equals : (Ljava/lang/Object;)Z
      //   345: ifne -> 351
      //   348: goto -> 272
      //   351: bipush #26
      //   353: istore #4
      //   355: goto -> 869
      //   358: aload_3
      //   359: ldc_w 'S_TEXT/UTF8'
      //   362: invokevirtual equals : (Ljava/lang/Object;)Z
      //   365: ifne -> 371
      //   368: goto -> 272
      //   371: bipush #25
      //   373: istore #4
      //   375: goto -> 869
      //   378: aload_3
      //   379: ldc_w 'V_MPEGH/ISO/HEVC'
      //   382: invokevirtual equals : (Ljava/lang/Object;)Z
      //   385: ifne -> 391
      //   388: goto -> 272
      //   391: bipush #24
      //   393: istore #4
      //   395: goto -> 869
      //   398: aload_3
      //   399: ldc_w 'S_TEXT/ASS'
      //   402: invokevirtual equals : (Ljava/lang/Object;)Z
      //   405: ifne -> 411
      //   408: goto -> 272
      //   411: bipush #23
      //   413: istore #4
      //   415: goto -> 869
      //   418: aload_3
      //   419: ldc_w 'A_PCM/INT/LIT'
      //   422: invokevirtual equals : (Ljava/lang/Object;)Z
      //   425: ifne -> 431
      //   428: goto -> 272
      //   431: bipush #22
      //   433: istore #4
      //   435: goto -> 869
      //   438: aload_3
      //   439: ldc_w 'A_DTS/EXPRESS'
      //   442: invokevirtual equals : (Ljava/lang/Object;)Z
      //   445: ifne -> 451
      //   448: goto -> 272
      //   451: bipush #21
      //   453: istore #4
      //   455: goto -> 869
      //   458: aload_3
      //   459: ldc_w 'V_THEORA'
      //   462: invokevirtual equals : (Ljava/lang/Object;)Z
      //   465: ifne -> 471
      //   468: goto -> 272
      //   471: bipush #20
      //   473: istore #4
      //   475: goto -> 869
      //   478: aload_3
      //   479: ldc_w 'S_HDMV/PGS'
      //   482: invokevirtual equals : (Ljava/lang/Object;)Z
      //   485: ifne -> 491
      //   488: goto -> 272
      //   491: bipush #19
      //   493: istore #4
      //   495: goto -> 869
      //   498: aload_3
      //   499: ldc_w 'V_VP9'
      //   502: invokevirtual equals : (Ljava/lang/Object;)Z
      //   505: ifne -> 511
      //   508: goto -> 272
      //   511: bipush #18
      //   513: istore #4
      //   515: goto -> 869
      //   518: aload_3
      //   519: ldc_w 'V_VP8'
      //   522: invokevirtual equals : (Ljava/lang/Object;)Z
      //   525: ifne -> 531
      //   528: goto -> 272
      //   531: bipush #17
      //   533: istore #4
      //   535: goto -> 869
      //   538: aload_3
      //   539: ldc_w 'V_AV1'
      //   542: invokevirtual equals : (Ljava/lang/Object;)Z
      //   545: ifne -> 551
      //   548: goto -> 272
      //   551: bipush #16
      //   553: istore #4
      //   555: goto -> 869
      //   558: aload_3
      //   559: ldc_w 'A_DTS'
      //   562: invokevirtual equals : (Ljava/lang/Object;)Z
      //   565: ifne -> 571
      //   568: goto -> 272
      //   571: bipush #15
      //   573: istore #4
      //   575: goto -> 869
      //   578: aload_3
      //   579: ldc_w 'A_AC3'
      //   582: invokevirtual equals : (Ljava/lang/Object;)Z
      //   585: ifne -> 591
      //   588: goto -> 272
      //   591: bipush #14
      //   593: istore #4
      //   595: goto -> 869
      //   598: aload_3
      //   599: ldc_w 'A_AAC'
      //   602: invokevirtual equals : (Ljava/lang/Object;)Z
      //   605: ifne -> 611
      //   608: goto -> 272
      //   611: bipush #13
      //   613: istore #4
      //   615: goto -> 869
      //   618: aload_3
      //   619: ldc_w 'A_DTS/LOSSLESS'
      //   622: invokevirtual equals : (Ljava/lang/Object;)Z
      //   625: ifne -> 631
      //   628: goto -> 272
      //   631: bipush #12
      //   633: istore #4
      //   635: goto -> 869
      //   638: aload_3
      //   639: ldc_w 'S_VOBSUB'
      //   642: invokevirtual equals : (Ljava/lang/Object;)Z
      //   645: ifne -> 651
      //   648: goto -> 272
      //   651: bipush #11
      //   653: istore #4
      //   655: goto -> 869
      //   658: aload_3
      //   659: ldc_w 'V_MPEG4/ISO/AVC'
      //   662: invokevirtual equals : (Ljava/lang/Object;)Z
      //   665: ifne -> 671
      //   668: goto -> 272
      //   671: bipush #10
      //   673: istore #4
      //   675: goto -> 869
      //   678: aload_3
      //   679: ldc_w 'V_MPEG4/ISO/ASP'
      //   682: invokevirtual equals : (Ljava/lang/Object;)Z
      //   685: ifne -> 691
      //   688: goto -> 272
      //   691: bipush #9
      //   693: istore #4
      //   695: goto -> 869
      //   698: aload_3
      //   699: ldc_w 'S_DVBSUB'
      //   702: invokevirtual equals : (Ljava/lang/Object;)Z
      //   705: ifne -> 711
      //   708: goto -> 272
      //   711: bipush #8
      //   713: istore #4
      //   715: goto -> 869
      //   718: aload_3
      //   719: ldc_w 'V_MS/VFW/FOURCC'
      //   722: invokevirtual equals : (Ljava/lang/Object;)Z
      //   725: ifne -> 731
      //   728: goto -> 272
      //   731: bipush #7
      //   733: istore #4
      //   735: goto -> 869
      //   738: aload_3
      //   739: ldc_w 'A_MPEG/L3'
      //   742: invokevirtual equals : (Ljava/lang/Object;)Z
      //   745: ifne -> 751
      //   748: goto -> 272
      //   751: bipush #6
      //   753: istore #4
      //   755: goto -> 869
      //   758: aload_3
      //   759: ldc_w 'A_MPEG/L2'
      //   762: invokevirtual equals : (Ljava/lang/Object;)Z
      //   765: ifne -> 771
      //   768: goto -> 272
      //   771: iconst_5
      //   772: istore #4
      //   774: goto -> 869
      //   777: aload_3
      //   778: ldc_w 'A_VORBIS'
      //   781: invokevirtual equals : (Ljava/lang/Object;)Z
      //   784: ifne -> 790
      //   787: goto -> 272
      //   790: iconst_4
      //   791: istore #4
      //   793: goto -> 869
      //   796: aload_3
      //   797: ldc_w 'A_TRUEHD'
      //   800: invokevirtual equals : (Ljava/lang/Object;)Z
      //   803: ifne -> 809
      //   806: goto -> 272
      //   809: iconst_3
      //   810: istore #4
      //   812: goto -> 869
      //   815: aload_3
      //   816: ldc_w 'A_MS/ACM'
      //   819: invokevirtual equals : (Ljava/lang/Object;)Z
      //   822: ifne -> 828
      //   825: goto -> 272
      //   828: iconst_2
      //   829: istore #4
      //   831: goto -> 869
      //   834: aload_3
      //   835: ldc_w 'V_MPEG4/ISO/SP'
      //   838: invokevirtual equals : (Ljava/lang/Object;)Z
      //   841: ifne -> 847
      //   844: goto -> 272
      //   847: iconst_1
      //   848: istore #4
      //   850: goto -> 869
      //   853: aload_3
      //   854: ldc_w 'V_MPEG4/ISO/AP'
      //   857: invokevirtual equals : (Ljava/lang/Object;)Z
      //   860: ifne -> 866
      //   863: goto -> 272
      //   866: iconst_0
      //   867: istore #4
      //   869: ldc_w 'audio/x-unknown'
      //   872: astore_3
      //   873: iload #4
      //   875: tableswitch default -> 1008, 0 -> 1711, 1 -> 1711, 2 -> 1577, 3 -> 1559, 4 -> 1535, 5 -> 1515, 6 -> 1508, 7 -> 1473, 8 -> 1429, 9 -> 1711, 10 -> 1390, 11 -> 1374, 12 -> 1367, 13 -> 1351, 14 -> 1344, 15 -> 1337, 16 -> 1330, 17 -> 1308, 18 -> 1301, 19 -> 1294, 20 -> 1288, 21 -> 1337, 22 -> 1201, 23 -> 1194, 24 -> 1155, 25 -> 1148, 26 -> 1141, 27 -> 1134, 28 -> 1118, 29 -> 1019
      //   1008: new com/google/android/exoplayer2/ParserException
      //   1011: dup
      //   1012: ldc_w 'Unrecognized codec identifier.'
      //   1015: invokespecial <init> : (Ljava/lang/String;)V
      //   1018: athrow
      //   1019: new java/util/ArrayList
      //   1022: dup
      //   1023: iconst_3
      //   1024: invokespecial <init> : (I)V
      //   1027: astore_3
      //   1028: aload_3
      //   1029: aload_0
      //   1030: getfield j : [B
      //   1033: invokeinterface add : (Ljava/lang/Object;)Z
      //   1038: pop
      //   1039: bipush #8
      //   1041: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
      //   1044: astore #6
      //   1046: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
      //   1049: astore #7
      //   1051: aload_3
      //   1052: aload #6
      //   1054: aload #7
      //   1056: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
      //   1059: aload_0
      //   1060: getfield P : J
      //   1063: invokevirtual putLong : (J)Ljava/nio/ByteBuffer;
      //   1066: invokevirtual array : ()[B
      //   1069: invokeinterface add : (Ljava/lang/Object;)Z
      //   1074: pop
      //   1075: aload_3
      //   1076: bipush #8
      //   1078: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
      //   1081: aload #7
      //   1083: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
      //   1086: aload_0
      //   1087: getfield Q : J
      //   1090: invokevirtual putLong : (J)Ljava/nio/ByteBuffer;
      //   1093: invokevirtual array : ()[B
      //   1096: invokeinterface add : (Ljava/lang/Object;)Z
      //   1101: pop
      //   1102: ldc_w 'audio/opus'
      //   1105: astore #7
      //   1107: iconst_m1
      //   1108: istore #4
      //   1110: sipush #5760
      //   1113: istore #8
      //   1115: goto -> 1738
      //   1118: aload_0
      //   1119: getfield j : [B
      //   1122: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
      //   1125: astore_3
      //   1126: ldc_w 'audio/flac'
      //   1129: astore #7
      //   1131: goto -> 1426
      //   1134: ldc_w 'audio/eac3'
      //   1137: astore_3
      //   1138: goto -> 1312
      //   1141: ldc_w 'video/mpeg2'
      //   1144: astore_3
      //   1145: goto -> 1312
      //   1148: ldc_w 'application/x-subrip'
      //   1151: astore_3
      //   1152: goto -> 1312
      //   1155: new com/google/android/exoplayer2/util/v
      //   1158: dup
      //   1159: aload_0
      //   1160: getfield j : [B
      //   1163: invokespecial <init> : ([B)V
      //   1166: invokestatic a : (Lcom/google/android/exoplayer2/util/v;)Lcom/google/android/exoplayer2/video/j;
      //   1169: astore #7
      //   1171: aload #7
      //   1173: getfield a : Ljava/util/List;
      //   1176: astore_3
      //   1177: aload_0
      //   1178: aload #7
      //   1180: getfield b : I
      //   1183: putfield W : I
      //   1186: ldc_w 'video/hevc'
      //   1189: astore #7
      //   1191: goto -> 1426
      //   1194: ldc_w 'text/x-ssa'
      //   1197: astore_3
      //   1198: goto -> 1312
      //   1201: aload_0
      //   1202: getfield N : I
      //   1205: invokestatic H : (I)I
      //   1208: istore #8
      //   1210: iload #8
      //   1212: istore #4
      //   1214: iload #8
      //   1216: ifne -> 1278
      //   1219: new java/lang/StringBuilder
      //   1222: dup
      //   1223: invokespecial <init> : ()V
      //   1226: astore #7
      //   1228: aload #7
      //   1230: ldc_w 'Unsupported PCM bit depth: '
      //   1233: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1236: pop
      //   1237: aload #7
      //   1239: aload_0
      //   1240: getfield N : I
      //   1243: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   1246: pop
      //   1247: aload #7
      //   1249: ldc_w '. Setting mimeType to '
      //   1252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1255: pop
      //   1256: aload #7
      //   1258: ldc_w 'audio/x-unknown'
      //   1261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1264: pop
      //   1265: ldc 'MatroskaExtractor'
      //   1267: aload #7
      //   1269: invokevirtual toString : ()Ljava/lang/String;
      //   1272: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
      //   1275: goto -> 1312
      //   1278: ldc_w 'audio/raw'
      //   1281: astore #7
      //   1283: aconst_null
      //   1284: astore_3
      //   1285: goto -> 1324
      //   1288: ldc 'video/x-unknown'
      //   1290: astore_3
      //   1291: goto -> 1312
      //   1294: ldc_w 'application/pgs'
      //   1297: astore_3
      //   1298: goto -> 1312
      //   1301: ldc_w 'video/x-vnd.on2.vp9'
      //   1304: astore_3
      //   1305: goto -> 1312
      //   1308: ldc_w 'video/x-vnd.on2.vp8'
      //   1311: astore_3
      //   1312: aconst_null
      //   1313: astore #6
      //   1315: aload_3
      //   1316: astore #7
      //   1318: aload #6
      //   1320: astore_3
      //   1321: iconst_m1
      //   1322: istore #4
      //   1324: iconst_m1
      //   1325: istore #8
      //   1327: goto -> 1738
      //   1330: ldc_w 'video/av01'
      //   1333: astore_3
      //   1334: goto -> 1312
      //   1337: ldc_w 'audio/vnd.dts'
      //   1340: astore_3
      //   1341: goto -> 1312
      //   1344: ldc_w 'audio/ac3'
      //   1347: astore_3
      //   1348: goto -> 1312
      //   1351: aload_0
      //   1352: getfield j : [B
      //   1355: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
      //   1358: astore_3
      //   1359: ldc_w 'audio/mp4a-latm'
      //   1362: astore #7
      //   1364: goto -> 1426
      //   1367: ldc_w 'audio/vnd.dts.hd'
      //   1370: astore_3
      //   1371: goto -> 1312
      //   1374: aload_0
      //   1375: getfield j : [B
      //   1378: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
      //   1381: astore_3
      //   1382: ldc_w 'application/vobsub'
      //   1385: astore #7
      //   1387: goto -> 1321
      //   1390: new com/google/android/exoplayer2/util/v
      //   1393: dup
      //   1394: aload_0
      //   1395: getfield j : [B
      //   1398: invokespecial <init> : ([B)V
      //   1401: invokestatic b : (Lcom/google/android/exoplayer2/util/v;)Lcom/google/android/exoplayer2/video/h;
      //   1404: astore #7
      //   1406: aload #7
      //   1408: getfield a : Ljava/util/List;
      //   1411: astore_3
      //   1412: aload_0
      //   1413: aload #7
      //   1415: getfield b : I
      //   1418: putfield W : I
      //   1421: ldc_w 'video/avc'
      //   1424: astore #7
      //   1426: goto -> 1321
      //   1429: aload_0
      //   1430: getfield j : [B
      //   1433: astore_3
      //   1434: iconst_4
      //   1435: newarray byte
      //   1437: dup
      //   1438: iconst_0
      //   1439: aload_3
      //   1440: iconst_0
      //   1441: baload
      //   1442: bastore
      //   1443: dup
      //   1444: iconst_1
      //   1445: aload_3
      //   1446: iconst_1
      //   1447: baload
      //   1448: bastore
      //   1449: dup
      //   1450: iconst_2
      //   1451: aload_3
      //   1452: iconst_2
      //   1453: baload
      //   1454: bastore
      //   1455: dup
      //   1456: iconst_3
      //   1457: aload_3
      //   1458: iconst_3
      //   1459: baload
      //   1460: bastore
      //   1461: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
      //   1464: astore_3
      //   1465: ldc_w 'application/dvbsubs'
      //   1468: astore #7
      //   1470: goto -> 1321
      //   1473: new com/google/android/exoplayer2/util/v
      //   1476: dup
      //   1477: aload_0
      //   1478: getfield j : [B
      //   1481: invokespecial <init> : ([B)V
      //   1484: invokestatic e : (Lcom/google/android/exoplayer2/util/v;)Landroid/util/Pair;
      //   1487: astore_3
      //   1488: aload_3
      //   1489: getfield first : Ljava/lang/Object;
      //   1492: checkcast java/lang/String
      //   1495: astore #7
      //   1497: aload_3
      //   1498: getfield second : Ljava/lang/Object;
      //   1501: checkcast java/util/List
      //   1504: astore_3
      //   1505: goto -> 1426
      //   1508: ldc_w 'audio/mpeg'
      //   1511: astore_3
      //   1512: goto -> 1519
      //   1515: ldc_w 'audio/mpeg-L2'
      //   1518: astore_3
      //   1519: aload_3
      //   1520: astore #7
      //   1522: aconst_null
      //   1523: astore_3
      //   1524: iconst_m1
      //   1525: istore #4
      //   1527: sipush #4096
      //   1530: istore #8
      //   1532: goto -> 1738
      //   1535: aload_0
      //   1536: getfield j : [B
      //   1539: invokestatic g : ([B)Ljava/util/List;
      //   1542: astore_3
      //   1543: ldc_w 'audio/vorbis'
      //   1546: astore #7
      //   1548: iconst_m1
      //   1549: istore #4
      //   1551: sipush #8192
      //   1554: istore #8
      //   1556: goto -> 1738
      //   1559: aload_0
      //   1560: new com/google/android/exoplayer2/c1/a0/e$d
      //   1563: dup
      //   1564: invokespecial <init> : ()V
      //   1567: putfield R : Lcom/google/android/exoplayer2/c1/a0/e$d;
      //   1570: ldc_w 'audio/true-hd'
      //   1573: astore_3
      //   1574: goto -> 1312
      //   1577: new com/google/android/exoplayer2/util/v
      //   1580: dup
      //   1581: aload_0
      //   1582: getfield j : [B
      //   1585: invokespecial <init> : ([B)V
      //   1588: invokestatic f : (Lcom/google/android/exoplayer2/util/v;)Z
      //   1591: ifeq -> 1671
      //   1594: aload_0
      //   1595: getfield N : I
      //   1598: invokestatic H : (I)I
      //   1601: istore #8
      //   1603: iload #8
      //   1605: istore #4
      //   1607: iload #8
      //   1609: ifne -> 1278
      //   1612: new java/lang/StringBuilder
      //   1615: dup
      //   1616: invokespecial <init> : ()V
      //   1619: astore #7
      //   1621: aload #7
      //   1623: ldc_w 'Unsupported PCM bit depth: '
      //   1626: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1629: pop
      //   1630: aload #7
      //   1632: aload_0
      //   1633: getfield N : I
      //   1636: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   1639: pop
      //   1640: aload #7
      //   1642: ldc_w '. Setting mimeType to '
      //   1645: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1648: pop
      //   1649: aload #7
      //   1651: ldc_w 'audio/x-unknown'
      //   1654: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1657: pop
      //   1658: ldc 'MatroskaExtractor'
      //   1660: aload #7
      //   1662: invokevirtual toString : ()Ljava/lang/String;
      //   1665: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
      //   1668: goto -> 1312
      //   1671: new java/lang/StringBuilder
      //   1674: dup
      //   1675: invokespecial <init> : ()V
      //   1678: astore #7
      //   1680: aload #7
      //   1682: ldc_w 'Non-PCM MS/ACM is unsupported. Setting mimeType to '
      //   1685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1688: pop
      //   1689: aload #7
      //   1691: ldc_w 'audio/x-unknown'
      //   1694: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1697: pop
      //   1698: ldc 'MatroskaExtractor'
      //   1700: aload #7
      //   1702: invokevirtual toString : ()Ljava/lang/String;
      //   1705: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
      //   1708: goto -> 1312
      //   1711: aload_0
      //   1712: getfield j : [B
      //   1715: astore_3
      //   1716: aload_3
      //   1717: ifnonnull -> 1725
      //   1720: aconst_null
      //   1721: astore_3
      //   1722: goto -> 1730
      //   1725: aload_3
      //   1726: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
      //   1729: astore_3
      //   1730: ldc_w 'video/mp4v-es'
      //   1733: astore #7
      //   1735: goto -> 1426
      //   1738: aload_0
      //   1739: getfield T : Z
      //   1742: istore #9
      //   1744: aload_0
      //   1745: getfield S : Z
      //   1748: ifeq -> 1757
      //   1751: iconst_2
      //   1752: istore #10
      //   1754: goto -> 1760
      //   1757: iconst_0
      //   1758: istore #10
      //   1760: iload #9
      //   1762: iconst_0
      //   1763: ior
      //   1764: iload #10
      //   1766: ior
      //   1767: istore #10
      //   1769: aload #7
      //   1771: invokestatic l : (Ljava/lang/String;)Z
      //   1774: ifeq -> 1818
      //   1777: iload_2
      //   1778: invokestatic toString : (I)Ljava/lang/String;
      //   1781: aload #7
      //   1783: aconst_null
      //   1784: iconst_m1
      //   1785: iload #8
      //   1787: aload_0
      //   1788: getfield M : I
      //   1791: aload_0
      //   1792: getfield O : I
      //   1795: iload #4
      //   1797: aload_3
      //   1798: aload_0
      //   1799: getfield k : Lcom/google/android/exoplayer2/drm/DrmInitData;
      //   1802: iload #10
      //   1804: aload_0
      //   1805: getfield U : Ljava/lang/String;
      //   1808: invokestatic o : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;
      //   1811: astore_3
      //   1812: iload #5
      //   1814: istore_2
      //   1815: goto -> 2420
      //   1818: aload #7
      //   1820: invokestatic n : (Ljava/lang/String;)Z
      //   1823: ifeq -> 2240
      //   1826: aload_0
      //   1827: getfield p : I
      //   1830: ifne -> 1892
      //   1833: aload_0
      //   1834: getfield n : I
      //   1837: istore #10
      //   1839: iload #10
      //   1841: istore #4
      //   1843: iload #10
      //   1845: iconst_m1
      //   1846: if_icmpne -> 1855
      //   1849: aload_0
      //   1850: getfield l : I
      //   1853: istore #4
      //   1855: aload_0
      //   1856: iload #4
      //   1858: putfield n : I
      //   1861: aload_0
      //   1862: getfield o : I
      //   1865: istore #10
      //   1867: iload #10
      //   1869: istore #4
      //   1871: iload #10
      //   1873: iconst_m1
      //   1874: if_icmpne -> 1883
      //   1877: aload_0
      //   1878: getfield m : I
      //   1881: istore #4
      //   1883: aload_0
      //   1884: iload #4
      //   1886: putfield o : I
      //   1889: goto -> 1892
      //   1892: aload_0
      //   1893: getfield n : I
      //   1896: istore #4
      //   1898: iload #4
      //   1900: iconst_m1
      //   1901: if_icmpeq -> 1938
      //   1904: aload_0
      //   1905: getfield o : I
      //   1908: istore #10
      //   1910: iload #10
      //   1912: iconst_m1
      //   1913: if_icmpeq -> 1938
      //   1916: aload_0
      //   1917: getfield m : I
      //   1920: iload #4
      //   1922: imul
      //   1923: i2f
      //   1924: aload_0
      //   1925: getfield l : I
      //   1928: iload #10
      //   1930: imul
      //   1931: i2f
      //   1932: fdiv
      //   1933: fstore #11
      //   1935: goto -> 1942
      //   1938: ldc -1.0
      //   1940: fstore #11
      //   1942: aload_0
      //   1943: getfield w : Z
      //   1946: ifeq -> 1981
      //   1949: aload_0
      //   1950: invokespecial b : ()[B
      //   1953: astore #6
      //   1955: new com/google/android/exoplayer2/video/ColorInfo
      //   1958: dup
      //   1959: aload_0
      //   1960: getfield x : I
      //   1963: aload_0
      //   1964: getfield z : I
      //   1967: aload_0
      //   1968: getfield y : I
      //   1971: aload #6
      //   1973: invokespecial <init> : (III[B)V
      //   1976: astore #6
      //   1978: goto -> 1984
      //   1981: aconst_null
      //   1982: astore #6
      //   1984: ldc_w 'htc_video_rotA-000'
      //   1987: aload_0
      //   1988: getfield a : Ljava/lang/String;
      //   1991: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1994: ifeq -> 2003
      //   1997: iconst_0
      //   1998: istore #4
      //   2000: goto -> 2068
      //   2003: ldc_w 'htc_video_rotA-090'
      //   2006: aload_0
      //   2007: getfield a : Ljava/lang/String;
      //   2010: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2013: ifeq -> 2023
      //   2016: bipush #90
      //   2018: istore #4
      //   2020: goto -> 2068
      //   2023: ldc_w 'htc_video_rotA-180'
      //   2026: aload_0
      //   2027: getfield a : Ljava/lang/String;
      //   2030: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2033: ifeq -> 2044
      //   2036: sipush #180
      //   2039: istore #4
      //   2041: goto -> 2068
      //   2044: ldc_w 'htc_video_rotA-270'
      //   2047: aload_0
      //   2048: getfield a : Ljava/lang/String;
      //   2051: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2054: ifeq -> 2065
      //   2057: sipush #270
      //   2060: istore #4
      //   2062: goto -> 2068
      //   2065: iconst_m1
      //   2066: istore #4
      //   2068: aload_0
      //   2069: getfield q : I
      //   2072: ifne -> 2192
      //   2075: aload_0
      //   2076: getfield r : F
      //   2079: fconst_0
      //   2080: invokestatic compare : (FF)I
      //   2083: ifne -> 2192
      //   2086: aload_0
      //   2087: getfield s : F
      //   2090: fconst_0
      //   2091: invokestatic compare : (FF)I
      //   2094: ifne -> 2192
      //   2097: aload_0
      //   2098: getfield t : F
      //   2101: fconst_0
      //   2102: invokestatic compare : (FF)I
      //   2105: ifne -> 2114
      //   2108: iconst_0
      //   2109: istore #4
      //   2111: goto -> 2192
      //   2114: aload_0
      //   2115: getfield s : F
      //   2118: ldc_w 90.0
      //   2121: invokestatic compare : (FF)I
      //   2124: ifne -> 2134
      //   2127: bipush #90
      //   2129: istore #4
      //   2131: goto -> 2192
      //   2134: aload_0
      //   2135: getfield s : F
      //   2138: ldc_w -180.0
      //   2141: invokestatic compare : (FF)I
      //   2144: ifeq -> 2184
      //   2147: aload_0
      //   2148: getfield s : F
      //   2151: ldc_w 180.0
      //   2154: invokestatic compare : (FF)I
      //   2157: ifne -> 2163
      //   2160: goto -> 2184
      //   2163: aload_0
      //   2164: getfield s : F
      //   2167: ldc_w -90.0
      //   2170: invokestatic compare : (FF)I
      //   2173: ifne -> 2192
      //   2176: sipush #270
      //   2179: istore #4
      //   2181: goto -> 2192
      //   2184: sipush #180
      //   2187: istore #4
      //   2189: goto -> 2192
      //   2192: iload_2
      //   2193: invokestatic toString : (I)Ljava/lang/String;
      //   2196: aload #7
      //   2198: aconst_null
      //   2199: iconst_m1
      //   2200: iload #8
      //   2202: aload_0
      //   2203: getfield l : I
      //   2206: aload_0
      //   2207: getfield m : I
      //   2210: ldc -1.0
      //   2212: aload_3
      //   2213: iload #4
      //   2215: fload #11
      //   2217: aload_0
      //   2218: getfield u : [B
      //   2221: aload_0
      //   2222: getfield v : I
      //   2225: aload #6
      //   2227: aload_0
      //   2228: getfield k : Lcom/google/android/exoplayer2/drm/DrmInitData;
      //   2231: invokestatic E : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IF[BILcom/google/android/exoplayer2/video/ColorInfo;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;
      //   2234: astore_3
      //   2235: iconst_2
      //   2236: istore_2
      //   2237: goto -> 2420
      //   2240: ldc_w 'application/x-subrip'
      //   2243: aload #7
      //   2245: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2248: ifeq -> 2276
      //   2251: iload_2
      //   2252: invokestatic toString : (I)Ljava/lang/String;
      //   2255: aload #7
      //   2257: iload #10
      //   2259: aload_0
      //   2260: getfield U : Ljava/lang/String;
      //   2263: aload_0
      //   2264: getfield k : Lcom/google/android/exoplayer2/drm/DrmInitData;
      //   2267: invokestatic y : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;
      //   2270: astore_3
      //   2271: iconst_3
      //   2272: istore_2
      //   2273: goto -> 2420
      //   2276: ldc_w 'text/x-ssa'
      //   2279: aload #7
      //   2281: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2284: ifeq -> 2347
      //   2287: new java/util/ArrayList
      //   2290: dup
      //   2291: iconst_2
      //   2292: invokespecial <init> : (I)V
      //   2295: astore_3
      //   2296: aload_3
      //   2297: invokestatic b : ()[B
      //   2300: invokeinterface add : (Ljava/lang/Object;)Z
      //   2305: pop
      //   2306: aload_3
      //   2307: aload_0
      //   2308: getfield j : [B
      //   2311: invokeinterface add : (Ljava/lang/Object;)Z
      //   2316: pop
      //   2317: iload_2
      //   2318: invokestatic toString : (I)Ljava/lang/String;
      //   2321: aload #7
      //   2323: aconst_null
      //   2324: iconst_m1
      //   2325: iload #10
      //   2327: aload_0
      //   2328: getfield U : Ljava/lang/String;
      //   2331: iconst_m1
      //   2332: aload_0
      //   2333: getfield k : Lcom/google/android/exoplayer2/drm/DrmInitData;
      //   2336: ldc2_w 9223372036854775807
      //   2339: aload_3
      //   2340: invokestatic z : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;JLjava/util/List;)Lcom/google/android/exoplayer2/Format;
      //   2343: astore_3
      //   2344: goto -> 2271
      //   2347: ldc_w 'application/vobsub'
      //   2350: aload #7
      //   2352: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2355: ifne -> 2394
      //   2358: ldc_w 'application/pgs'
      //   2361: aload #7
      //   2363: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2366: ifne -> 2394
      //   2369: ldc_w 'application/dvbsubs'
      //   2372: aload #7
      //   2374: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2377: ifeq -> 2383
      //   2380: goto -> 2394
      //   2383: new com/google/android/exoplayer2/ParserException
      //   2386: dup
      //   2387: ldc_w 'Unexpected MIME type.'
      //   2390: invokespecial <init> : (Ljava/lang/String;)V
      //   2393: athrow
      //   2394: iload_2
      //   2395: invokestatic toString : (I)Ljava/lang/String;
      //   2398: aload #7
      //   2400: aconst_null
      //   2401: iconst_m1
      //   2402: iload #10
      //   2404: aload_3
      //   2405: aload_0
      //   2406: getfield U : Ljava/lang/String;
      //   2409: aload_0
      //   2410: getfield k : Lcom/google/android/exoplayer2/drm/DrmInitData;
      //   2413: invokestatic s : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;
      //   2416: astore_3
      //   2417: goto -> 2271
      //   2420: aload_1
      //   2421: aload_0
      //   2422: getfield c : I
      //   2425: iload_2
      //   2426: invokeinterface g : (II)Lcom/google/android/exoplayer2/c1/v;
      //   2431: astore_1
      //   2432: aload_0
      //   2433: aload_1
      //   2434: putfield V : Lcom/google/android/exoplayer2/c1/v;
      //   2437: aload_1
      //   2438: aload_3
      //   2439: invokeinterface d : (Lcom/google/android/exoplayer2/Format;)V
      //   2444: return
    }
    
    public void d() {
      e.d d1 = this.R;
      if (d1 != null)
        d1.a(this); 
    }
    
    public void h() {
      e.d d1 = this.R;
      if (d1 != null)
        d1.b(); 
    }
  }
  
  private static final class d {
    private final byte[] a = new byte[10];
    
    private boolean b;
    
    private int c;
    
    private long d;
    
    private int e;
    
    private int f;
    
    private int g;
    
    public void a(e.c param1c) {
      if (this.c > 0) {
        param1c.V.c(this.d, this.e, this.f, this.g, param1c.i);
        this.c = 0;
      } 
    }
    
    public void b() {
      this.b = false;
      this.c = 0;
    }
    
    public void c(e.c param1c, long param1Long, int param1Int1, int param1Int2, int param1Int3) {
      if (!this.b)
        return; 
      int i = this.c;
      int j = i + 1;
      this.c = j;
      if (i == 0) {
        this.d = param1Long;
        this.e = param1Int1;
        this.f = 0;
      } 
      this.f += param1Int2;
      this.g = param1Int3;
      if (j >= 16)
        a(param1c); 
    }
    
    public void d(i param1i) {
      if (this.b)
        return; 
      param1i.k(this.a, 0, 10);
      param1i.h();
      if (g.i(this.a) == 0)
        return; 
      this.b = true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/a0/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */