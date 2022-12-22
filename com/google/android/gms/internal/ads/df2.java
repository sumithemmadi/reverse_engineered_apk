package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public final class df2 implements ne2 {
  private static final oe2 a = new cf2();
  
  private static final byte[] b = new byte[] { 
      49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 
      44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 
      48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 
      48, 10 };
  
  private static final byte[] c = new byte[] { 
      32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 
      32, 32 };
  
  private static final UUID d = new UUID(72057594037932032L, -9223371306706625679L);
  
  private long A;
  
  private boolean B;
  
  private long C = -1L;
  
  private long D = -1L;
  
  private long E = -9223372036854775807L;
  
  private kj2 F;
  
  private kj2 G;
  
  private boolean H;
  
  private int I;
  
  private long J;
  
  private long K;
  
  private int L;
  
  private int M;
  
  private int[] N;
  
  private int O;
  
  private int P;
  
  private int Q;
  
  private int R;
  
  private boolean S;
  
  private boolean T;
  
  private boolean U;
  
  private boolean V;
  
  private byte W;
  
  private int X;
  
  private int Y;
  
  private int Z;
  
  private boolean a0;
  
  private boolean b0;
  
  private pe2 c0;
  
  private final bf2 e;
  
  private final gf2 f;
  
  private final SparseArray<ef2> g;
  
  private final boolean h;
  
  private final qj2 i;
  
  private final qj2 j;
  
  private final qj2 k;
  
  private final qj2 l;
  
  private final qj2 m;
  
  private final qj2 n;
  
  private final qj2 o;
  
  private final qj2 p;
  
  private final qj2 q;
  
  private ByteBuffer r;
  
  private long s;
  
  private long t = -1L;
  
  private long u = -9223372036854775807L;
  
  private long v = -9223372036854775807L;
  
  private long w = -9223372036854775807L;
  
  private ef2 x;
  
  private boolean y;
  
  private int z;
  
  public df2() {
    this(0);
  }
  
  private df2(int paramInt) {
    this(new we2(), 0);
  }
  
  private df2(bf2 parambf2, int paramInt) {
    this.e = parambf2;
    parambf2.c(new ff2(this, null));
    this.h = true;
    this.f = new gf2();
    this.g = new SparseArray();
    this.k = new qj2(4);
    this.l = new qj2(ByteBuffer.allocate(4).putInt(-1).array());
    this.m = new qj2(4);
    this.i = new qj2(pj2.a);
    this.j = new qj2(4);
    this.n = new qj2();
    this.o = new qj2();
    this.p = new qj2(8);
    this.q = new qj2();
  }
  
  private final int b(le2 paramle2, ue2 paramue2, int paramInt) {
    int i = this.n.q();
    if (i > 0) {
      paramInt = Math.min(paramInt, i);
      paramue2.c(this.n, paramInt);
    } else {
      paramInt = paramue2.d(paramle2, paramInt, false);
    } 
    this.R += paramInt;
    this.Z += paramInt;
    return paramInt;
  }
  
  private final void j(le2 paramle2, ef2 paramef2, int paramInt) {
    byte[] arrayOfByte;
    if ("S_TEXT/UTF8".equals(paramef2.a)) {
      arrayOfByte = b;
      int i = arrayOfByte.length + paramInt;
      if (this.o.a() < i)
        this.o.a = Arrays.copyOf(arrayOfByte, i + paramInt); 
      paramle2.readFully(this.o.a, arrayOfByte.length, paramInt);
      this.o.l(0);
      this.o.k(i);
      return;
    } 
    ue2 ue2 = ((ef2)arrayOfByte).O;
    if (!this.S) {
      if (((ef2)arrayOfByte).e) {
        this.Q &= 0xBFFFFFFF;
        boolean bool = this.T;
        int i = 128;
        if (!bool) {
          paramle2.readFully(this.k.a, 0, 1);
          this.R++;
          byte[] arrayOfByte1 = this.k.a;
          if ((arrayOfByte1[0] & 0x80) != 128) {
            this.W = (byte)arrayOfByte1[0];
            this.T = true;
          } else {
            throw new zzhw("Extension bit is set in signal byte");
          } 
        } 
        byte b = this.W;
        if ((b & 0x1) == 1) {
          if ((b & 0x2) == 2) {
            b = 1;
          } else {
            b = 0;
          } 
          this.Q |= 0x40000000;
          if (!this.U) {
            paramle2.readFully(this.p.a, 0, 8);
            this.R += 8;
            this.U = true;
            qj2 qj21 = this.k;
            byte[] arrayOfByte1 = qj21.a;
            if (b == 0)
              i = 0; 
            arrayOfByte1[0] = (byte)(byte)(i | 0x8);
            qj21.l(0);
            ue2.c(this.k, 1);
            this.Z++;
            this.p.l(0);
            ue2.c(this.p, 8);
            this.Z += 8;
          } 
          if (b != 0) {
            if (!this.V) {
              paramle2.readFully(this.k.a, 0, 1);
              this.R++;
              this.k.l(0);
              this.X = this.k.g();
              this.V = true;
            } 
            int j = this.X << 2;
            this.k.j(j);
            paramle2.readFully(this.k.a, 0, j);
            this.R += j;
            short s = (short)(this.X / 2 + 1);
            int k = s * 6 + 2;
            ByteBuffer byteBuffer = this.r;
            if (byteBuffer == null || byteBuffer.capacity() < k)
              this.r = ByteBuffer.allocate(k); 
            this.r.position(0);
            this.r.putShort(s);
            j = 0;
            i = 0;
            while (true) {
              int m = this.X;
              if (j < m) {
                m = this.k.v();
                if (j % 2 == 0) {
                  this.r.putShort((short)(m - i));
                } else {
                  this.r.putInt(m - i);
                } 
                j++;
                i = m;
                continue;
              } 
              j = paramInt - this.R - i;
              if (m % 2 == 1) {
                this.r.putInt(j);
              } else {
                this.r.putShort((short)j);
                this.r.putInt(0);
              } 
              this.q.o(this.r.array(), k);
              ue2.c(this.q, k);
              this.Z += k;
              break;
            } 
          } 
        } 
      } else {
        byte[] arrayOfByte1 = ((ef2)arrayOfByte).f;
        if (arrayOfByte1 != null)
          this.n.o(arrayOfByte1, arrayOfByte1.length); 
      } 
      this.S = true;
    } 
    paramInt += this.n.c();
    if ("V_MPEG4/ISO/AVC".equals(((ef2)arrayOfByte).a) || "V_MPEGH/ISO/HEVC".equals(((ef2)arrayOfByte).a)) {
      byte[] arrayOfByte1 = this.j.a;
      arrayOfByte1[0] = (byte)0;
      arrayOfByte1[1] = (byte)0;
      arrayOfByte1[2] = (byte)0;
      int j = ((ef2)arrayOfByte).P;
      int i = 4 - j;
      while (this.R < paramInt) {
        int k = this.Y;
        if (k == 0) {
          k = Math.min(j, this.n.q());
          paramle2.readFully(arrayOfByte1, i + k, j - k);
          if (k > 0)
            this.n.p(arrayOfByte1, i, k); 
          this.R += j;
          this.j.l(0);
          this.Y = this.j.v();
          this.i.l(0);
          ue2.c(this.i, 4);
          this.Z += 4;
          continue;
        } 
        this.Y = k - b(paramle2, ue2, k);
      } 
    } else {
      while (true) {
        int i = this.R;
        if (i < paramInt) {
          b(paramle2, ue2, paramInt - i);
          continue;
        } 
        break;
      } 
    } 
    if ("A_VORBIS".equals(((ef2)arrayOfByte).a)) {
      this.l.l(0);
      ue2.c(this.l, 4);
      this.Z += 4;
    } 
  }
  
  private final void k(ef2 paramef2, long paramLong) {
    if ("S_TEXT/UTF8".equals(paramef2.a)) {
      byte[] arrayOfByte2;
      byte[] arrayOfByte1 = this.o.a;
      long l = this.K;
      if (l == -9223372036854775807L) {
        arrayOfByte2 = c;
      } else {
        int i = (int)(l / 3600000000L);
        l -= i * 3600000000L;
        int j = (int)(l / 60000000L);
        l -= (60000000 * j);
        int k = (int)(l / 1000000L);
        int m = (int)((l - (1000000 * k)) / 1000L);
        arrayOfByte2 = wj2.j(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) }));
      } 
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 19, 12);
      ue2 ue2 = paramef2.O;
      qj2 qj21 = this.o;
      ue2.c(qj21, qj21.c());
      this.Z += this.o.c();
    } 
    paramef2.O.b(paramLong, this.Q, this.Z, 0, paramef2.g);
    this.a0 = true;
    t();
  }
  
  private static int[] l(int[] paramArrayOfint, int paramInt) {
    return (paramArrayOfint == null) ? new int[paramInt] : ((paramArrayOfint.length >= paramInt) ? paramArrayOfint : new int[Math.max(paramArrayOfint.length << 1, paramInt)]);
  }
  
  static int m(int paramInt) {
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
        return 5;
      case 161:
      case 163:
      case 16981:
      case 18402:
      case 21419:
      case 25506:
      case 30322:
        return 4;
      case 160:
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
      case 22186:
      case 22203:
      case 25188:
      case 2352003:
      case 2807729:
        break;
    } 
    return 2;
  }
  
  static boolean n(int paramInt) {
    return (paramInt == 357149030 || paramInt == 524531317 || paramInt == 475249515 || paramInt == 374648427);
  }
  
  private final void p(le2 paramle2, int paramInt) {
    if (this.k.c() >= paramInt)
      return; 
    if (this.k.a() < paramInt) {
      qj2 qj22 = this.k;
      byte[] arrayOfByte = qj22.a;
      qj22.o(Arrays.copyOf(arrayOfByte, Math.max(arrayOfByte.length << 1, paramInt)), this.k.c());
    } 
    qj2 qj21 = this.k;
    paramle2.readFully(qj21.a, qj21.c(), paramInt - this.k.c());
    this.k.k(paramInt);
  }
  
  private final long s(long paramLong) {
    long l = this.u;
    if (l != -9223372036854775807L)
      return wj2.c(paramLong, l, 1000L); 
    throw new zzhw("Can't scale timecode prior to timecodeScale being set.");
  }
  
  private final void t() {
    this.R = 0;
    this.Z = 0;
    this.Y = 0;
    this.S = false;
    this.T = false;
    this.V = false;
    this.X = 0;
    this.W = (byte)0;
    this.U = false;
    this.n.i();
  }
  
  public final void a() {}
  
  final void c(int paramInt, double paramDouble) {
    if (paramInt != 181) {
      if (paramInt != 17545) {
        switch (paramInt) {
          default:
            return;
          case 21978:
            this.x.F = (float)paramDouble;
          case 21977:
            this.x.E = (float)paramDouble;
            return;
          case 21976:
            this.x.D = (float)paramDouble;
            return;
          case 21975:
            this.x.C = (float)paramDouble;
            return;
          case 21974:
            this.x.B = (float)paramDouble;
            return;
          case 21973:
            this.x.A = (float)paramDouble;
            return;
          case 21972:
            this.x.z = (float)paramDouble;
            return;
          case 21971:
            this.x.y = (float)paramDouble;
            return;
          case 21970:
            this.x.x = (float)paramDouble;
            return;
          case 21969:
            break;
        } 
        this.x.w = (float)paramDouble;
        return;
      } 
      this.v = (long)paramDouble;
      return;
    } 
    this.x.I = (int)paramDouble;
  }
  
  public final int d(le2 paramle2, te2 paramte2) {
    this.a0 = false;
    boolean bool = true;
    while (true) {
      while (true)
        break; 
      if (SYNTHETIC_LOCAL_VARIABLE_7 != null)
        return 1; 
    } 
    return bool ? 0 : -1;
  }
  
  public final void e(pe2 parampe2) {
    this.c0 = parampe2;
  }
  
  final void f(int paramInt1, int paramInt2, le2 paramle2) {
    // Byte code:
    //   0: iload_1
    //   1: sipush #161
    //   4: if_icmpeq -> 254
    //   7: iload_1
    //   8: sipush #163
    //   11: if_icmpeq -> 254
    //   14: iload_1
    //   15: sipush #16981
    //   18: if_icmpeq -> 225
    //   21: iload_1
    //   22: sipush #18402
    //   25: if_icmpeq -> 192
    //   28: iload_1
    //   29: sipush #21419
    //   32: if_icmpeq -> 143
    //   35: iload_1
    //   36: sipush #25506
    //   39: if_icmpeq -> 114
    //   42: iload_1
    //   43: sipush #30322
    //   46: if_icmpne -> 78
    //   49: aload_0
    //   50: getfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   53: astore #4
    //   55: iload_2
    //   56: newarray byte
    //   58: astore #5
    //   60: aload #4
    //   62: aload #5
    //   64: putfield o : [B
    //   67: aload_3
    //   68: aload #5
    //   70: iconst_0
    //   71: iload_2
    //   72: invokeinterface readFully : ([BII)V
    //   77: return
    //   78: new java/lang/StringBuilder
    //   81: dup
    //   82: bipush #26
    //   84: invokespecial <init> : (I)V
    //   87: astore_3
    //   88: aload_3
    //   89: ldc_w 'Unexpected id: '
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: aload_3
    //   97: iload_1
    //   98: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: new com/google/android/gms/internal/ads/zzhw
    //   105: dup
    //   106: aload_3
    //   107: invokevirtual toString : ()Ljava/lang/String;
    //   110: invokespecial <init> : (Ljava/lang/String;)V
    //   113: athrow
    //   114: aload_0
    //   115: getfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   118: astore #4
    //   120: iload_2
    //   121: newarray byte
    //   123: astore #5
    //   125: aload #4
    //   127: aload #5
    //   129: putfield h : [B
    //   132: aload_3
    //   133: aload #5
    //   135: iconst_0
    //   136: iload_2
    //   137: invokeinterface readFully : ([BII)V
    //   142: return
    //   143: aload_0
    //   144: getfield m : Lcom/google/android/gms/internal/ads/qj2;
    //   147: getfield a : [B
    //   150: iconst_0
    //   151: invokestatic fill : ([BB)V
    //   154: aload_3
    //   155: aload_0
    //   156: getfield m : Lcom/google/android/gms/internal/ads/qj2;
    //   159: getfield a : [B
    //   162: iconst_4
    //   163: iload_2
    //   164: isub
    //   165: iload_2
    //   166: invokeinterface readFully : ([BII)V
    //   171: aload_0
    //   172: getfield m : Lcom/google/android/gms/internal/ads/qj2;
    //   175: iconst_0
    //   176: invokevirtual l : (I)V
    //   179: aload_0
    //   180: aload_0
    //   181: getfield m : Lcom/google/android/gms/internal/ads/qj2;
    //   184: invokevirtual s : ()J
    //   187: l2i
    //   188: putfield z : I
    //   191: return
    //   192: iload_2
    //   193: newarray byte
    //   195: astore #4
    //   197: aload_3
    //   198: aload #4
    //   200: iconst_0
    //   201: iload_2
    //   202: invokeinterface readFully : ([BII)V
    //   207: aload_0
    //   208: getfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   211: new com/google/android/gms/internal/ads/xe2
    //   214: dup
    //   215: iconst_1
    //   216: aload #4
    //   218: invokespecial <init> : (I[B)V
    //   221: putfield g : Lcom/google/android/gms/internal/ads/xe2;
    //   224: return
    //   225: aload_0
    //   226: getfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   229: astore #4
    //   231: iload_2
    //   232: newarray byte
    //   234: astore #5
    //   236: aload #4
    //   238: aload #5
    //   240: putfield f : [B
    //   243: aload_3
    //   244: aload #5
    //   246: iconst_0
    //   247: iload_2
    //   248: invokeinterface readFully : ([BII)V
    //   253: return
    //   254: aload_0
    //   255: getfield I : I
    //   258: ifne -> 308
    //   261: aload_0
    //   262: aload_0
    //   263: getfield f : Lcom/google/android/gms/internal/ads/gf2;
    //   266: aload_3
    //   267: iconst_0
    //   268: iconst_1
    //   269: bipush #8
    //   271: invokevirtual b : (Lcom/google/android/gms/internal/ads/le2;ZZI)J
    //   274: l2i
    //   275: putfield O : I
    //   278: aload_0
    //   279: aload_0
    //   280: getfield f : Lcom/google/android/gms/internal/ads/gf2;
    //   283: invokevirtual e : ()I
    //   286: putfield P : I
    //   289: aload_0
    //   290: ldc2_w -9223372036854775807
    //   293: putfield K : J
    //   296: aload_0
    //   297: iconst_1
    //   298: putfield I : I
    //   301: aload_0
    //   302: getfield k : Lcom/google/android/gms/internal/ads/qj2;
    //   305: invokevirtual i : ()V
    //   308: aload_0
    //   309: getfield g : Landroid/util/SparseArray;
    //   312: aload_0
    //   313: getfield O : I
    //   316: invokevirtual get : (I)Ljava/lang/Object;
    //   319: checkcast com/google/android/gms/internal/ads/ef2
    //   322: astore #4
    //   324: aload #4
    //   326: ifnonnull -> 347
    //   329: aload_3
    //   330: iload_2
    //   331: aload_0
    //   332: getfield P : I
    //   335: isub
    //   336: invokeinterface g : (I)V
    //   341: aload_0
    //   342: iconst_0
    //   343: putfield I : I
    //   346: return
    //   347: aload_0
    //   348: getfield I : I
    //   351: iconst_1
    //   352: if_icmpne -> 1210
    //   355: aload_0
    //   356: aload_3
    //   357: iconst_3
    //   358: invokespecial p : (Lcom/google/android/gms/internal/ads/le2;I)V
    //   361: aload_0
    //   362: getfield k : Lcom/google/android/gms/internal/ads/qj2;
    //   365: getfield a : [B
    //   368: iconst_2
    //   369: baload
    //   370: bipush #6
    //   372: iand
    //   373: iconst_1
    //   374: ishr
    //   375: istore #6
    //   377: iload #6
    //   379: ifne -> 418
    //   382: aload_0
    //   383: iconst_1
    //   384: putfield M : I
    //   387: aload_0
    //   388: getfield N : [I
    //   391: iconst_1
    //   392: invokestatic l : ([II)[I
    //   395: astore #5
    //   397: aload_0
    //   398: aload #5
    //   400: putfield N : [I
    //   403: aload #5
    //   405: iconst_0
    //   406: iload_2
    //   407: aload_0
    //   408: getfield P : I
    //   411: isub
    //   412: iconst_3
    //   413: isub
    //   414: iastore
    //   415: goto -> 1010
    //   418: iload_1
    //   419: sipush #163
    //   422: if_icmpne -> 1199
    //   425: iconst_4
    //   426: istore #7
    //   428: aload_0
    //   429: aload_3
    //   430: iconst_4
    //   431: invokespecial p : (Lcom/google/android/gms/internal/ads/le2;I)V
    //   434: aload_0
    //   435: getfield k : Lcom/google/android/gms/internal/ads/qj2;
    //   438: getfield a : [B
    //   441: iconst_3
    //   442: baload
    //   443: sipush #255
    //   446: iand
    //   447: iconst_1
    //   448: iadd
    //   449: istore #8
    //   451: aload_0
    //   452: iload #8
    //   454: putfield M : I
    //   457: aload_0
    //   458: getfield N : [I
    //   461: iload #8
    //   463: invokestatic l : ([II)[I
    //   466: astore #5
    //   468: aload_0
    //   469: aload #5
    //   471: putfield N : [I
    //   474: iload #6
    //   476: iconst_2
    //   477: if_icmpne -> 512
    //   480: aload_0
    //   481: getfield P : I
    //   484: istore #7
    //   486: aload_0
    //   487: getfield M : I
    //   490: istore #6
    //   492: aload #5
    //   494: iconst_0
    //   495: iload #6
    //   497: iload_2
    //   498: iload #7
    //   500: isub
    //   501: iconst_4
    //   502: isub
    //   503: iload #6
    //   505: idiv
    //   506: invokestatic fill : ([IIII)V
    //   509: goto -> 415
    //   512: iload #6
    //   514: iconst_1
    //   515: if_icmpne -> 653
    //   518: iconst_0
    //   519: istore #6
    //   521: iconst_0
    //   522: istore #8
    //   524: aload_0
    //   525: getfield M : I
    //   528: istore #9
    //   530: iload #6
    //   532: iload #9
    //   534: iconst_1
    //   535: isub
    //   536: if_icmpge -> 629
    //   539: aload_0
    //   540: getfield N : [I
    //   543: iload #6
    //   545: iconst_0
    //   546: iastore
    //   547: iload #7
    //   549: istore #9
    //   551: iload #9
    //   553: iconst_1
    //   554: iadd
    //   555: istore #7
    //   557: aload_0
    //   558: aload_3
    //   559: iload #7
    //   561: invokespecial p : (Lcom/google/android/gms/internal/ads/le2;I)V
    //   564: aload_0
    //   565: getfield k : Lcom/google/android/gms/internal/ads/qj2;
    //   568: getfield a : [B
    //   571: iload #7
    //   573: iconst_1
    //   574: isub
    //   575: baload
    //   576: sipush #255
    //   579: iand
    //   580: istore #10
    //   582: aload_0
    //   583: getfield N : [I
    //   586: astore #5
    //   588: aload #5
    //   590: iload #6
    //   592: aload #5
    //   594: iload #6
    //   596: iaload
    //   597: iload #10
    //   599: iadd
    //   600: iastore
    //   601: iload #7
    //   603: istore #9
    //   605: iload #10
    //   607: sipush #255
    //   610: if_icmpeq -> 551
    //   613: iload #8
    //   615: aload #5
    //   617: iload #6
    //   619: iaload
    //   620: iadd
    //   621: istore #8
    //   623: iinc #6, 1
    //   626: goto -> 524
    //   629: aload_0
    //   630: getfield N : [I
    //   633: iload #9
    //   635: iconst_1
    //   636: isub
    //   637: iload_2
    //   638: aload_0
    //   639: getfield P : I
    //   642: isub
    //   643: iload #7
    //   645: isub
    //   646: iload #8
    //   648: isub
    //   649: iastore
    //   650: goto -> 415
    //   653: iload #6
    //   655: iconst_3
    //   656: if_icmpne -> 1162
    //   659: iconst_0
    //   660: istore #6
    //   662: iconst_0
    //   663: istore #8
    //   665: aload_0
    //   666: getfield M : I
    //   669: istore #9
    //   671: iload #6
    //   673: iload #9
    //   675: iconst_1
    //   676: isub
    //   677: if_icmpge -> 989
    //   680: aload_0
    //   681: getfield N : [I
    //   684: iload #6
    //   686: iconst_0
    //   687: iastore
    //   688: iload #7
    //   690: iconst_1
    //   691: iadd
    //   692: istore #10
    //   694: aload_0
    //   695: aload_3
    //   696: iload #10
    //   698: invokespecial p : (Lcom/google/android/gms/internal/ads/le2;I)V
    //   701: aload_0
    //   702: getfield k : Lcom/google/android/gms/internal/ads/qj2;
    //   705: getfield a : [B
    //   708: astore #5
    //   710: iload #10
    //   712: iconst_1
    //   713: isub
    //   714: istore #11
    //   716: aload #5
    //   718: iload #11
    //   720: baload
    //   721: ifeq -> 978
    //   724: lconst_0
    //   725: lstore #12
    //   727: iconst_0
    //   728: istore #9
    //   730: iload #10
    //   732: istore #7
    //   734: lload #12
    //   736: lstore #14
    //   738: iload #9
    //   740: bipush #8
    //   742: if_icmpge -> 895
    //   745: iconst_1
    //   746: bipush #7
    //   748: iload #9
    //   750: isub
    //   751: ishl
    //   752: istore #7
    //   754: aload_0
    //   755: getfield k : Lcom/google/android/gms/internal/ads/qj2;
    //   758: getfield a : [B
    //   761: iload #11
    //   763: baload
    //   764: iload #7
    //   766: iand
    //   767: ifeq -> 889
    //   770: iload #10
    //   772: iload #9
    //   774: iadd
    //   775: istore #10
    //   777: aload_0
    //   778: aload_3
    //   779: iload #10
    //   781: invokespecial p : (Lcom/google/android/gms/internal/ads/le2;I)V
    //   784: aload_0
    //   785: getfield k : Lcom/google/android/gms/internal/ads/qj2;
    //   788: getfield a : [B
    //   791: iload #11
    //   793: baload
    //   794: sipush #255
    //   797: iand
    //   798: iload #7
    //   800: iconst_m1
    //   801: ixor
    //   802: iand
    //   803: i2l
    //   804: lstore #14
    //   806: iload #11
    //   808: iconst_1
    //   809: iadd
    //   810: istore #7
    //   812: lload #14
    //   814: lstore #12
    //   816: iload #7
    //   818: iload #10
    //   820: if_icmpge -> 852
    //   823: lload #12
    //   825: bipush #8
    //   827: lshl
    //   828: aload_0
    //   829: getfield k : Lcom/google/android/gms/internal/ads/qj2;
    //   832: getfield a : [B
    //   835: iload #7
    //   837: baload
    //   838: sipush #255
    //   841: iand
    //   842: i2l
    //   843: lor
    //   844: lstore #14
    //   846: iinc #7, 1
    //   849: goto -> 812
    //   852: iload #10
    //   854: istore #7
    //   856: lload #12
    //   858: lstore #14
    //   860: iload #6
    //   862: ifle -> 895
    //   865: lload #12
    //   867: lconst_1
    //   868: iload #9
    //   870: bipush #7
    //   872: imul
    //   873: bipush #6
    //   875: iadd
    //   876: lshl
    //   877: lconst_1
    //   878: lsub
    //   879: lsub
    //   880: lstore #14
    //   882: iload #10
    //   884: istore #7
    //   886: goto -> 895
    //   889: iinc #9, 1
    //   892: goto -> 730
    //   895: lload #14
    //   897: ldc2_w -2147483648
    //   900: lcmp
    //   901: iflt -> 967
    //   904: lload #14
    //   906: ldc2_w 2147483647
    //   909: lcmp
    //   910: ifgt -> 967
    //   913: lload #14
    //   915: l2i
    //   916: istore #9
    //   918: aload_0
    //   919: getfield N : [I
    //   922: astore #5
    //   924: iload #6
    //   926: ifne -> 932
    //   929: goto -> 944
    //   932: iload #9
    //   934: aload #5
    //   936: iload #6
    //   938: iconst_1
    //   939: isub
    //   940: iaload
    //   941: iadd
    //   942: istore #9
    //   944: aload #5
    //   946: iload #6
    //   948: iload #9
    //   950: iastore
    //   951: iload #8
    //   953: aload #5
    //   955: iload #6
    //   957: iaload
    //   958: iadd
    //   959: istore #8
    //   961: iinc #6, 1
    //   964: goto -> 665
    //   967: new com/google/android/gms/internal/ads/zzhw
    //   970: dup
    //   971: ldc_w 'EBML lacing sample size out of range.'
    //   974: invokespecial <init> : (Ljava/lang/String;)V
    //   977: athrow
    //   978: new com/google/android/gms/internal/ads/zzhw
    //   981: dup
    //   982: ldc_w 'No valid varint length mask found'
    //   985: invokespecial <init> : (Ljava/lang/String;)V
    //   988: athrow
    //   989: aload_0
    //   990: getfield N : [I
    //   993: iload #9
    //   995: iconst_1
    //   996: isub
    //   997: iload_2
    //   998: aload_0
    //   999: getfield P : I
    //   1002: isub
    //   1003: iload #7
    //   1005: isub
    //   1006: iload #8
    //   1008: isub
    //   1009: iastore
    //   1010: aload_0
    //   1011: getfield k : Lcom/google/android/gms/internal/ads/qj2;
    //   1014: getfield a : [B
    //   1017: astore #5
    //   1019: aload #5
    //   1021: iconst_0
    //   1022: baload
    //   1023: istore #7
    //   1025: aload #5
    //   1027: iconst_1
    //   1028: baload
    //   1029: istore_2
    //   1030: aload_0
    //   1031: aload_0
    //   1032: getfield E : J
    //   1035: aload_0
    //   1036: iload_2
    //   1037: sipush #255
    //   1040: iand
    //   1041: iload #7
    //   1043: bipush #8
    //   1045: ishl
    //   1046: ior
    //   1047: i2l
    //   1048: invokespecial s : (J)J
    //   1051: ladd
    //   1052: putfield J : J
    //   1055: aload_0
    //   1056: getfield k : Lcom/google/android/gms/internal/ads/qj2;
    //   1059: getfield a : [B
    //   1062: astore #5
    //   1064: aload #5
    //   1066: iconst_2
    //   1067: baload
    //   1068: bipush #8
    //   1070: iand
    //   1071: bipush #8
    //   1073: if_icmpne -> 1082
    //   1076: iconst_1
    //   1077: istore #7
    //   1079: goto -> 1085
    //   1082: iconst_0
    //   1083: istore #7
    //   1085: aload #4
    //   1087: getfield c : I
    //   1090: iconst_2
    //   1091: if_icmpeq -> 1123
    //   1094: iload_1
    //   1095: sipush #163
    //   1098: if_icmpne -> 1118
    //   1101: aload #5
    //   1103: iconst_2
    //   1104: baload
    //   1105: sipush #128
    //   1108: iand
    //   1109: sipush #128
    //   1112: if_icmpne -> 1118
    //   1115: goto -> 1123
    //   1118: iconst_0
    //   1119: istore_2
    //   1120: goto -> 1125
    //   1123: iconst_1
    //   1124: istore_2
    //   1125: iload #7
    //   1127: ifeq -> 1138
    //   1130: ldc_w -2147483648
    //   1133: istore #7
    //   1135: goto -> 1141
    //   1138: iconst_0
    //   1139: istore #7
    //   1141: aload_0
    //   1142: iload_2
    //   1143: iload #7
    //   1145: ior
    //   1146: putfield Q : I
    //   1149: aload_0
    //   1150: iconst_2
    //   1151: putfield I : I
    //   1154: aload_0
    //   1155: iconst_0
    //   1156: putfield L : I
    //   1159: goto -> 1210
    //   1162: new java/lang/StringBuilder
    //   1165: dup
    //   1166: bipush #36
    //   1168: invokespecial <init> : (I)V
    //   1171: astore_3
    //   1172: aload_3
    //   1173: ldc_w 'Unexpected lacing value: '
    //   1176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1179: pop
    //   1180: aload_3
    //   1181: iload #6
    //   1183: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1186: pop
    //   1187: new com/google/android/gms/internal/ads/zzhw
    //   1190: dup
    //   1191: aload_3
    //   1192: invokevirtual toString : ()Ljava/lang/String;
    //   1195: invokespecial <init> : (Ljava/lang/String;)V
    //   1198: athrow
    //   1199: new com/google/android/gms/internal/ads/zzhw
    //   1202: dup
    //   1203: ldc_w 'Lacing only supported in SimpleBlocks.'
    //   1206: invokespecial <init> : (Ljava/lang/String;)V
    //   1209: athrow
    //   1210: iload_1
    //   1211: sipush #163
    //   1214: if_icmpne -> 1288
    //   1217: aload_0
    //   1218: getfield L : I
    //   1221: istore_1
    //   1222: iload_1
    //   1223: aload_0
    //   1224: getfield M : I
    //   1227: if_icmpge -> 1282
    //   1230: aload_0
    //   1231: aload_3
    //   1232: aload #4
    //   1234: aload_0
    //   1235: getfield N : [I
    //   1238: iload_1
    //   1239: iaload
    //   1240: invokespecial j : (Lcom/google/android/gms/internal/ads/le2;Lcom/google/android/gms/internal/ads/ef2;I)V
    //   1243: aload_0
    //   1244: aload #4
    //   1246: aload_0
    //   1247: getfield J : J
    //   1250: aload_0
    //   1251: getfield L : I
    //   1254: aload #4
    //   1256: getfield d : I
    //   1259: imul
    //   1260: sipush #1000
    //   1263: idiv
    //   1264: i2l
    //   1265: ladd
    //   1266: invokespecial k : (Lcom/google/android/gms/internal/ads/ef2;J)V
    //   1269: aload_0
    //   1270: aload_0
    //   1271: getfield L : I
    //   1274: iconst_1
    //   1275: iadd
    //   1276: putfield L : I
    //   1279: goto -> 1217
    //   1282: aload_0
    //   1283: iconst_0
    //   1284: putfield I : I
    //   1287: return
    //   1288: aload_0
    //   1289: aload_3
    //   1290: aload #4
    //   1292: aload_0
    //   1293: getfield N : [I
    //   1296: iconst_0
    //   1297: iaload
    //   1298: invokespecial j : (Lcom/google/android/gms/internal/ads/le2;Lcom/google/android/gms/internal/ads/ef2;I)V
    //   1301: return
  }
  
  public final boolean g(le2 paramle2) {
    return (new hf2()).a(paramle2);
  }
  
  public final void h(long paramLong1, long paramLong2) {
    this.E = -9223372036854775807L;
    this.I = 0;
    this.e.a();
    this.f.a();
    t();
  }
  
  final void i(int paramInt, String paramString) {
    if (paramInt != 134) {
      if (paramInt != 17026) {
        if (paramInt == 2274716)
          ef2.a(this.x, paramString); 
      } else if (!"webm".equals(paramString) && !"matroska".equals(paramString)) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 22);
        stringBuilder.append("DocType ");
        stringBuilder.append(paramString);
        stringBuilder.append(" not supported");
        throw new zzhw(stringBuilder.toString());
      } 
      return;
    } 
    this.x.a = paramString;
  }
  
  final void o(int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: iload_1
    //   5: sipush #160
    //   8: if_icmpeq -> 983
    //   11: iload_1
    //   12: sipush #174
    //   15: if_icmpeq -> 609
    //   18: iload_1
    //   19: sipush #19899
    //   22: if_icmpeq -> 559
    //   25: iload_1
    //   26: sipush #25152
    //   29: if_icmpeq -> 483
    //   32: iload_1
    //   33: sipush #28032
    //   36: if_icmpeq -> 447
    //   39: iload_1
    //   40: ldc_w 357149030
    //   43: if_icmpeq -> 403
    //   46: iload_1
    //   47: ldc_w 374648427
    //   50: if_icmpeq -> 370
    //   53: iload_1
    //   54: ldc_w 475249515
    //   57: if_icmpeq -> 63
    //   60: goto -> 597
    //   63: aload_0
    //   64: getfield y : Z
    //   67: ifne -> 597
    //   70: aload_0
    //   71: getfield c0 : Lcom/google/android/gms/internal/ads/pe2;
    //   74: astore #4
    //   76: aload_0
    //   77: getfield t : J
    //   80: ldc2_w -1
    //   83: lcmp
    //   84: ifeq -> 332
    //   87: aload_0
    //   88: getfield w : J
    //   91: ldc2_w -9223372036854775807
    //   94: lcmp
    //   95: ifeq -> 332
    //   98: aload_0
    //   99: getfield F : Lcom/google/android/gms/internal/ads/kj2;
    //   102: astore #5
    //   104: aload #5
    //   106: ifnull -> 332
    //   109: aload #5
    //   111: invokevirtual c : ()I
    //   114: ifeq -> 332
    //   117: aload_0
    //   118: getfield G : Lcom/google/android/gms/internal/ads/kj2;
    //   121: astore #5
    //   123: aload #5
    //   125: ifnull -> 332
    //   128: aload #5
    //   130: invokevirtual c : ()I
    //   133: aload_0
    //   134: getfield F : Lcom/google/android/gms/internal/ads/kj2;
    //   137: invokevirtual c : ()I
    //   140: if_icmpeq -> 146
    //   143: goto -> 332
    //   146: aload_0
    //   147: getfield F : Lcom/google/android/gms/internal/ads/kj2;
    //   150: invokevirtual c : ()I
    //   153: istore #6
    //   155: iload #6
    //   157: newarray int
    //   159: astore #7
    //   161: iload #6
    //   163: newarray long
    //   165: astore #8
    //   167: iload #6
    //   169: newarray long
    //   171: astore #9
    //   173: iload #6
    //   175: newarray long
    //   177: astore #5
    //   179: iconst_0
    //   180: istore_2
    //   181: iload_3
    //   182: istore_1
    //   183: iload_2
    //   184: iload #6
    //   186: if_icmpge -> 224
    //   189: aload #5
    //   191: iload_2
    //   192: aload_0
    //   193: getfield F : Lcom/google/android/gms/internal/ads/kj2;
    //   196: iload_2
    //   197: invokevirtual b : (I)J
    //   200: lastore
    //   201: aload #8
    //   203: iload_2
    //   204: aload_0
    //   205: getfield t : J
    //   208: aload_0
    //   209: getfield G : Lcom/google/android/gms/internal/ads/kj2;
    //   212: iload_2
    //   213: invokevirtual b : (I)J
    //   216: ladd
    //   217: lastore
    //   218: iinc #2, 1
    //   221: goto -> 181
    //   224: iload #6
    //   226: iconst_1
    //   227: isub
    //   228: istore_2
    //   229: iload_1
    //   230: iload_2
    //   231: if_icmpge -> 270
    //   234: iload_1
    //   235: iconst_1
    //   236: iadd
    //   237: istore_2
    //   238: aload #7
    //   240: iload_1
    //   241: aload #8
    //   243: iload_2
    //   244: laload
    //   245: aload #8
    //   247: iload_1
    //   248: laload
    //   249: lsub
    //   250: l2i
    //   251: iastore
    //   252: aload #9
    //   254: iload_1
    //   255: aload #5
    //   257: iload_2
    //   258: laload
    //   259: aload #5
    //   261: iload_1
    //   262: laload
    //   263: lsub
    //   264: lastore
    //   265: iload_2
    //   266: istore_1
    //   267: goto -> 224
    //   270: aload #7
    //   272: iload_2
    //   273: aload_0
    //   274: getfield t : J
    //   277: aload_0
    //   278: getfield s : J
    //   281: ladd
    //   282: aload #8
    //   284: iload_2
    //   285: laload
    //   286: lsub
    //   287: l2i
    //   288: iastore
    //   289: aload #9
    //   291: iload_2
    //   292: aload_0
    //   293: getfield w : J
    //   296: aload #5
    //   298: iload_2
    //   299: laload
    //   300: lsub
    //   301: lastore
    //   302: aload_0
    //   303: aconst_null
    //   304: putfield F : Lcom/google/android/gms/internal/ads/kj2;
    //   307: aload_0
    //   308: aconst_null
    //   309: putfield G : Lcom/google/android/gms/internal/ads/kj2;
    //   312: new com/google/android/gms/internal/ads/ke2
    //   315: dup
    //   316: aload #7
    //   318: aload #8
    //   320: aload #9
    //   322: aload #5
    //   324: invokespecial <init> : ([I[J[J[J)V
    //   327: astore #5
    //   329: goto -> 355
    //   332: aload_0
    //   333: aconst_null
    //   334: putfield F : Lcom/google/android/gms/internal/ads/kj2;
    //   337: aload_0
    //   338: aconst_null
    //   339: putfield G : Lcom/google/android/gms/internal/ads/kj2;
    //   342: new com/google/android/gms/internal/ads/ve2
    //   345: dup
    //   346: aload_0
    //   347: getfield w : J
    //   350: invokespecial <init> : (J)V
    //   353: astore #5
    //   355: aload #4
    //   357: aload #5
    //   359: invokeinterface o : (Lcom/google/android/gms/internal/ads/se2;)V
    //   364: aload_0
    //   365: iconst_1
    //   366: putfield y : Z
    //   369: return
    //   370: aload_0
    //   371: getfield g : Landroid/util/SparseArray;
    //   374: invokevirtual size : ()I
    //   377: ifeq -> 392
    //   380: aload_0
    //   381: getfield c0 : Lcom/google/android/gms/internal/ads/pe2;
    //   384: invokeinterface d : ()V
    //   389: goto -> 597
    //   392: new com/google/android/gms/internal/ads/zzhw
    //   395: dup
    //   396: ldc_w 'No valid tracks were found'
    //   399: invokespecial <init> : (Ljava/lang/String;)V
    //   402: athrow
    //   403: aload_0
    //   404: getfield u : J
    //   407: ldc2_w -9223372036854775807
    //   410: lcmp
    //   411: ifne -> 421
    //   414: aload_0
    //   415: ldc2_w 1000000
    //   418: putfield u : J
    //   421: aload_0
    //   422: getfield v : J
    //   425: lstore #10
    //   427: lload #10
    //   429: ldc2_w -9223372036854775807
    //   432: lcmp
    //   433: ifeq -> 597
    //   436: aload_0
    //   437: aload_0
    //   438: lload #10
    //   440: invokespecial s : (J)J
    //   443: putfield w : J
    //   446: return
    //   447: aload_0
    //   448: getfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   451: astore #5
    //   453: aload #5
    //   455: getfield e : Z
    //   458: ifeq -> 597
    //   461: aload #5
    //   463: getfield f : [B
    //   466: ifnonnull -> 472
    //   469: goto -> 597
    //   472: new com/google/android/gms/internal/ads/zzhw
    //   475: dup
    //   476: ldc_w 'Combining encryption and compression is not supported'
    //   479: invokespecial <init> : (Ljava/lang/String;)V
    //   482: athrow
    //   483: aload_0
    //   484: getfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   487: astore #5
    //   489: aload #5
    //   491: getfield e : Z
    //   494: ifeq -> 597
    //   497: aload #5
    //   499: getfield g : Lcom/google/android/gms/internal/ads/xe2;
    //   502: ifnull -> 548
    //   505: aload #5
    //   507: new com/google/android/gms/internal/ads/zzjo
    //   510: dup
    //   511: iconst_1
    //   512: anewarray com/google/android/gms/internal/ads/zzjo$zza
    //   515: dup
    //   516: iconst_0
    //   517: new com/google/android/gms/internal/ads/zzjo$zza
    //   520: dup
    //   521: getstatic com/google/android/gms/internal/ads/zb2.b : Ljava/util/UUID;
    //   524: ldc_w 'video/webm'
    //   527: aload_0
    //   528: getfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   531: getfield g : Lcom/google/android/gms/internal/ads/xe2;
    //   534: getfield b : [B
    //   537: invokespecial <init> : (Ljava/util/UUID;Ljava/lang/String;[B)V
    //   540: aastore
    //   541: invokespecial <init> : ([Lcom/google/android/gms/internal/ads/zzjo$zza;)V
    //   544: putfield i : Lcom/google/android/gms/internal/ads/zzjo;
    //   547: return
    //   548: new com/google/android/gms/internal/ads/zzhw
    //   551: dup
    //   552: ldc_w 'Encrypted Track found but ContentEncKeyID was not found'
    //   555: invokespecial <init> : (Ljava/lang/String;)V
    //   558: athrow
    //   559: aload_0
    //   560: getfield z : I
    //   563: istore_1
    //   564: iload_1
    //   565: iconst_m1
    //   566: if_icmpeq -> 598
    //   569: aload_0
    //   570: getfield A : J
    //   573: lstore #10
    //   575: lload #10
    //   577: ldc2_w -1
    //   580: lcmp
    //   581: ifeq -> 598
    //   584: iload_1
    //   585: ldc_w 475249515
    //   588: if_icmpne -> 597
    //   591: aload_0
    //   592: lload #10
    //   594: putfield C : J
    //   597: return
    //   598: new com/google/android/gms/internal/ads/zzhw
    //   601: dup
    //   602: ldc_w 'Mandatory element SeekID or SeekPosition not found'
    //   605: invokespecial <init> : (Ljava/lang/String;)V
    //   608: athrow
    //   609: aload_0
    //   610: getfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   613: getfield a : Ljava/lang/String;
    //   616: astore #5
    //   618: ldc_w 'V_VP8'
    //   621: aload #5
    //   623: invokevirtual equals : (Ljava/lang/Object;)Z
    //   626: ifne -> 927
    //   629: ldc_w 'V_VP9'
    //   632: aload #5
    //   634: invokevirtual equals : (Ljava/lang/Object;)Z
    //   637: ifne -> 927
    //   640: ldc_w 'V_MPEG2'
    //   643: aload #5
    //   645: invokevirtual equals : (Ljava/lang/Object;)Z
    //   648: ifne -> 927
    //   651: ldc_w 'V_MPEG4/ISO/SP'
    //   654: aload #5
    //   656: invokevirtual equals : (Ljava/lang/Object;)Z
    //   659: ifne -> 927
    //   662: ldc_w 'V_MPEG4/ISO/ASP'
    //   665: aload #5
    //   667: invokevirtual equals : (Ljava/lang/Object;)Z
    //   670: ifne -> 927
    //   673: ldc_w 'V_MPEG4/ISO/AP'
    //   676: aload #5
    //   678: invokevirtual equals : (Ljava/lang/Object;)Z
    //   681: ifne -> 927
    //   684: ldc_w 'V_MPEG4/ISO/AVC'
    //   687: aload #5
    //   689: invokevirtual equals : (Ljava/lang/Object;)Z
    //   692: ifne -> 927
    //   695: ldc_w 'V_MPEGH/ISO/HEVC'
    //   698: aload #5
    //   700: invokevirtual equals : (Ljava/lang/Object;)Z
    //   703: ifne -> 927
    //   706: ldc_w 'V_MS/VFW/FOURCC'
    //   709: aload #5
    //   711: invokevirtual equals : (Ljava/lang/Object;)Z
    //   714: ifne -> 927
    //   717: ldc_w 'V_THEORA'
    //   720: aload #5
    //   722: invokevirtual equals : (Ljava/lang/Object;)Z
    //   725: ifne -> 927
    //   728: ldc_w 'A_OPUS'
    //   731: aload #5
    //   733: invokevirtual equals : (Ljava/lang/Object;)Z
    //   736: ifne -> 927
    //   739: ldc_w 'A_VORBIS'
    //   742: aload #5
    //   744: invokevirtual equals : (Ljava/lang/Object;)Z
    //   747: ifne -> 927
    //   750: ldc_w 'A_AAC'
    //   753: aload #5
    //   755: invokevirtual equals : (Ljava/lang/Object;)Z
    //   758: ifne -> 927
    //   761: ldc_w 'A_MPEG/L2'
    //   764: aload #5
    //   766: invokevirtual equals : (Ljava/lang/Object;)Z
    //   769: ifne -> 927
    //   772: ldc_w 'A_MPEG/L3'
    //   775: aload #5
    //   777: invokevirtual equals : (Ljava/lang/Object;)Z
    //   780: ifne -> 927
    //   783: ldc_w 'A_AC3'
    //   786: aload #5
    //   788: invokevirtual equals : (Ljava/lang/Object;)Z
    //   791: ifne -> 927
    //   794: ldc_w 'A_EAC3'
    //   797: aload #5
    //   799: invokevirtual equals : (Ljava/lang/Object;)Z
    //   802: ifne -> 927
    //   805: ldc_w 'A_TRUEHD'
    //   808: aload #5
    //   810: invokevirtual equals : (Ljava/lang/Object;)Z
    //   813: ifne -> 927
    //   816: ldc_w 'A_DTS'
    //   819: aload #5
    //   821: invokevirtual equals : (Ljava/lang/Object;)Z
    //   824: ifne -> 927
    //   827: ldc_w 'A_DTS/EXPRESS'
    //   830: aload #5
    //   832: invokevirtual equals : (Ljava/lang/Object;)Z
    //   835: ifne -> 927
    //   838: ldc_w 'A_DTS/LOSSLESS'
    //   841: aload #5
    //   843: invokevirtual equals : (Ljava/lang/Object;)Z
    //   846: ifne -> 927
    //   849: ldc_w 'A_FLAC'
    //   852: aload #5
    //   854: invokevirtual equals : (Ljava/lang/Object;)Z
    //   857: ifne -> 927
    //   860: ldc_w 'A_MS/ACM'
    //   863: aload #5
    //   865: invokevirtual equals : (Ljava/lang/Object;)Z
    //   868: ifne -> 927
    //   871: ldc_w 'A_PCM/INT/LIT'
    //   874: aload #5
    //   876: invokevirtual equals : (Ljava/lang/Object;)Z
    //   879: ifne -> 927
    //   882: ldc 'S_TEXT/UTF8'
    //   884: aload #5
    //   886: invokevirtual equals : (Ljava/lang/Object;)Z
    //   889: ifne -> 927
    //   892: ldc_w 'S_VOBSUB'
    //   895: aload #5
    //   897: invokevirtual equals : (Ljava/lang/Object;)Z
    //   900: ifne -> 927
    //   903: ldc_w 'S_HDMV/PGS'
    //   906: aload #5
    //   908: invokevirtual equals : (Ljava/lang/Object;)Z
    //   911: ifne -> 927
    //   914: iload_2
    //   915: istore_1
    //   916: ldc_w 'S_DVBSUB'
    //   919: aload #5
    //   921: invokevirtual equals : (Ljava/lang/Object;)Z
    //   924: ifeq -> 929
    //   927: iconst_1
    //   928: istore_1
    //   929: iload_1
    //   930: ifeq -> 977
    //   933: aload_0
    //   934: getfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   937: astore #5
    //   939: aload #5
    //   941: aload_0
    //   942: getfield c0 : Lcom/google/android/gms/internal/ads/pe2;
    //   945: aload #5
    //   947: getfield b : I
    //   950: invokevirtual c : (Lcom/google/android/gms/internal/ads/pe2;I)V
    //   953: aload_0
    //   954: getfield g : Landroid/util/SparseArray;
    //   957: astore #5
    //   959: aload_0
    //   960: getfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   963: astore #4
    //   965: aload #5
    //   967: aload #4
    //   969: getfield b : I
    //   972: aload #4
    //   974: invokevirtual put : (ILjava/lang/Object;)V
    //   977: aload_0
    //   978: aconst_null
    //   979: putfield x : Lcom/google/android/gms/internal/ads/ef2;
    //   982: return
    //   983: aload_0
    //   984: getfield I : I
    //   987: iconst_2
    //   988: if_icmpeq -> 992
    //   991: return
    //   992: aload_0
    //   993: getfield b0 : Z
    //   996: ifne -> 1009
    //   999: aload_0
    //   1000: aload_0
    //   1001: getfield Q : I
    //   1004: iconst_1
    //   1005: ior
    //   1006: putfield Q : I
    //   1009: aload_0
    //   1010: aload_0
    //   1011: getfield g : Landroid/util/SparseArray;
    //   1014: aload_0
    //   1015: getfield O : I
    //   1018: invokevirtual get : (I)Ljava/lang/Object;
    //   1021: checkcast com/google/android/gms/internal/ads/ef2
    //   1024: aload_0
    //   1025: getfield J : J
    //   1028: invokespecial k : (Lcom/google/android/gms/internal/ads/ef2;J)V
    //   1031: aload_0
    //   1032: iconst_0
    //   1033: putfield I : I
    //   1036: return
  }
  
  final void q(int paramInt, long paramLong) {
    if (paramInt != 20529) {
      if (paramInt != 20530) {
        ef2 ef22;
        StringBuilder stringBuilder2;
        ef2 ef21;
        boolean bool1 = false;
        boolean bool2 = false;
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                return;
              case 21949:
                this.x.v = (int)paramLong;
              case 21948:
                this.x.u = (int)paramLong;
                return;
              case 21947:
                ef22 = this.x;
                ef22.q = true;
                paramInt = (int)paramLong;
                if (paramInt != 1) {
                  if (paramInt != 9) {
                    if (paramInt != 4 && paramInt != 5 && paramInt != 6 && paramInt != 7)
                      return; 
                    ef22.r = 2;
                    return;
                  } 
                  ef22.r = 6;
                  return;
                } 
                ef22.r = 1;
                return;
              case 21946:
                paramInt = (int)paramLong;
                if (paramInt != 1)
                  if (paramInt != 16) {
                    if (paramInt != 18) {
                      if (paramInt != 6 && paramInt != 7)
                        return; 
                    } else {
                      this.x.s = 7;
                      return;
                    } 
                  } else {
                    this.x.s = 6;
                    return;
                  }  
                this.x.s = 3;
                return;
              case 21945:
                break;
            } 
            paramInt = (int)paramLong;
            if (paramInt != 1) {
              if (paramInt != 2)
                return; 
              this.x.t = 1;
              return;
            } 
            this.x.t = 2;
            return;
          case 2807729:
            this.u = paramLong;
            return;
          case 2352003:
            this.x.d = (int)paramLong;
            return;
          case 25188:
            this.x.H = (int)paramLong;
            return;
          case 22203:
            this.x.K = paramLong;
            return;
          case 22186:
            this.x.J = paramLong;
            return;
          case 21930:
            ef22 = this.x;
            if (paramLong == 1L)
              bool2 = true; 
            ef22.M = bool2;
            return;
          case 21690:
            this.x.m = (int)paramLong;
            return;
          case 21682:
            this.x.n = (int)paramLong;
            return;
          case 21680:
            this.x.l = (int)paramLong;
            return;
          case 21432:
            paramInt = (int)paramLong;
            if (paramInt != 0) {
              if (paramInt != 1) {
                if (paramInt != 3) {
                  if (paramInt != 15)
                    return; 
                  this.x.p = 3;
                  return;
                } 
                this.x.p = 1;
                return;
              } 
              this.x.p = 2;
              return;
            } 
            this.x.p = 0;
            return;
          case 21420:
            this.A = paramLong + this.t;
            return;
          case 18408:
            if (paramLong == 1L);
            stringBuilder2 = new StringBuilder(56);
            stringBuilder2.append("AESSettingsCipherMode ");
            stringBuilder2.append(paramLong);
            stringBuilder2.append(" not supported");
            throw new zzhw(stringBuilder2.toString());
          case 18401:
            if (paramLong == 5L);
            stringBuilder2 = new StringBuilder(49);
            stringBuilder2.append("ContentEncAlgo ");
            stringBuilder2.append(paramLong);
            stringBuilder2.append(" not supported");
            throw new zzhw(stringBuilder2.toString());
          case 17143:
            if (paramLong == 1L);
            stringBuilder2 = new StringBuilder(50);
            stringBuilder2.append("EBMLReadVersion ");
            stringBuilder2.append(paramLong);
            stringBuilder2.append(" not supported");
            throw new zzhw(stringBuilder2.toString());
          case 17029:
            if (paramLong >= 1L && paramLong <= 2L);
            stringBuilder2 = new StringBuilder(53);
            stringBuilder2.append("DocTypeReadVersion ");
            stringBuilder2.append(paramLong);
            stringBuilder2.append(" not supported");
            throw new zzhw(stringBuilder2.toString());
          case 16980:
            if (paramLong == 3L);
            stringBuilder2 = new StringBuilder(50);
            stringBuilder2.append("ContentCompAlgo ");
            stringBuilder2.append(paramLong);
            stringBuilder2.append(" not supported");
            throw new zzhw(stringBuilder2.toString());
          case 251:
            this.b0 = true;
            return;
          case 241:
            if (!this.H) {
              this.G.a(paramLong);
              this.H = true;
              return;
            } 
          case 231:
            this.E = s(paramLong);
            return;
          case 215:
            this.x.b = (int)paramLong;
            return;
          case 186:
            this.x.k = (int)paramLong;
            return;
          case 179:
            this.F.a(s(paramLong));
            return;
          case 176:
            this.x.j = (int)paramLong;
            return;
          case 159:
            this.x.G = (int)paramLong;
            return;
          case 155:
            this.K = s(paramLong);
            return;
          case 136:
            ef21 = this.x;
            bool2 = bool1;
            if (paramLong == 1L)
              bool2 = true; 
            ef21.L = bool2;
            return;
          case 131:
            break;
        } 
        this.x.c = (int)paramLong;
        return;
      } 
      if (paramLong == 1L);
      StringBuilder stringBuilder1 = new StringBuilder(55);
      stringBuilder1.append("ContentEncodingScope ");
      stringBuilder1.append(paramLong);
      stringBuilder1.append(" not supported");
      throw new zzhw(stringBuilder1.toString());
    } 
    if (paramLong == 0L);
    StringBuilder stringBuilder = new StringBuilder(55);
    stringBuilder.append("ContentEncodingOrder ");
    stringBuilder.append(paramLong);
    stringBuilder.append(" not supported");
    throw new zzhw(stringBuilder.toString());
  }
  
  final void r(int paramInt, long paramLong1, long paramLong2) {
    if (paramInt != 160) {
      if (paramInt != 174) {
        if (paramInt != 187) {
          if (paramInt != 19899) {
            if (paramInt != 20533) {
              if (paramInt != 21968) {
                if (paramInt != 408125543) {
                  if (paramInt != 475249515) {
                    if (paramInt == 524531317 && !this.y) {
                      if (this.h && this.C != -1L) {
                        this.B = true;
                        return;
                      } 
                      this.c0.o(new ve2(this.w));
                      this.y = true;
                      return;
                    } 
                  } else {
                    this.F = new kj2();
                    this.G = new kj2();
                    return;
                  } 
                } else {
                  long l = this.t;
                  if (l == -1L || l == paramLong1) {
                    this.t = paramLong1;
                    this.s = paramLong2;
                    return;
                  } 
                  throw new zzhw("Multiple Segment elements not supported");
                } 
              } else {
                this.x.q = true;
              } 
              return;
            } 
            this.x.e = true;
            return;
          } 
          this.z = -1;
          this.A = -1L;
          return;
        } 
        this.H = false;
        return;
      } 
      this.x = new ef2(null);
      return;
    } 
    this.b0 = false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/df2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */