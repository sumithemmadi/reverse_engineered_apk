package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

public final class kd2 {
  private long A;
  
  private boolean B;
  
  private long C;
  
  private Method D;
  
  private int E;
  
  private long F;
  
  private long G;
  
  private int H;
  
  private long I;
  
  private long J;
  
  private int K;
  
  private int L;
  
  private long M;
  
  private long N;
  
  private long O;
  
  private float P;
  
  private ad2[] Q;
  
  private ByteBuffer[] R;
  
  private ByteBuffer S;
  
  private ByteBuffer T;
  
  private byte[] U;
  
  private int V;
  
  private int W;
  
  private boolean X;
  
  private boolean Y;
  
  private int Z;
  
  private final pd2 a;
  
  private boolean a0;
  
  private final xd2 b;
  
  private boolean b0;
  
  private final ad2[] c;
  
  private long c0;
  
  private final od2 d;
  
  private final ConditionVariable e;
  
  private final long[] f;
  
  private final md2 g;
  
  private final LinkedList<nd2> h;
  
  private AudioTrack i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private boolean o;
  
  private int p;
  
  private long q;
  
  private qc2 r;
  
  private qc2 s;
  
  private long t;
  
  private long u;
  
  private ByteBuffer v;
  
  private int w;
  
  private int x;
  
  private int y;
  
  private long z;
  
  public kd2(yc2 paramyc2, ad2[] paramArrayOfad2, od2 paramod2) {
    this.d = paramod2;
    this.e = new ConditionVariable(true);
    if (wj2.a >= 18)
      try {
        this.D = AudioTrack.class.getMethod("getLatency", null);
      } catch (NoSuchMethodException noSuchMethodException) {} 
    if (wj2.a >= 19) {
      this.g = new ld2();
    } else {
      this.g = new md2(null);
    } 
    pd2 pd21 = new pd2();
    this.a = pd21;
    xd2 xd21 = new xd2();
    this.b = xd21;
    ad2[] arrayOfAd2 = new ad2[paramArrayOfad2.length + 3];
    this.c = arrayOfAd2;
    arrayOfAd2[0] = new vd2();
    arrayOfAd2[1] = pd21;
    System.arraycopy(paramArrayOfad2, 0, arrayOfAd2, 2, paramArrayOfad2.length);
    arrayOfAd2[paramArrayOfad2.length + 2] = xd21;
    this.f = new long[10];
    this.P = 1.0F;
    this.L = 0;
    this.n = 3;
    this.Z = 0;
    this.s = qc2.a;
    this.W = -1;
    this.Q = new ad2[0];
    this.R = new ByteBuffer[0];
    this.h = new LinkedList<nd2>();
  }
  
  private final boolean A() {
    if (wj2.a < 23) {
      int i = this.m;
      if (i == 5 || i == 6)
        return true; 
    } 
    return false;
  }
  
  private final boolean a() {
    return (this.i != null);
  }
  
  private final boolean l(ByteBuffer paramByteBuffer, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual hasRemaining : ()Z
    //   4: ifne -> 9
    //   7: iconst_1
    //   8: ireturn
    //   9: aload_0
    //   10: getfield T : Ljava/nio/ByteBuffer;
    //   13: astore #4
    //   15: aload #4
    //   17: ifnull -> 43
    //   20: aload #4
    //   22: aload_1
    //   23: if_acmpne -> 32
    //   26: iconst_1
    //   27: istore #5
    //   29: goto -> 35
    //   32: iconst_0
    //   33: istore #5
    //   35: iload #5
    //   37: invokestatic a : (Z)V
    //   40: goto -> 119
    //   43: aload_0
    //   44: aload_1
    //   45: putfield T : Ljava/nio/ByteBuffer;
    //   48: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   51: bipush #21
    //   53: if_icmpge -> 119
    //   56: aload_1
    //   57: invokevirtual remaining : ()I
    //   60: istore #6
    //   62: aload_0
    //   63: getfield U : [B
    //   66: astore #4
    //   68: aload #4
    //   70: ifnull -> 81
    //   73: aload #4
    //   75: arraylength
    //   76: iload #6
    //   78: if_icmpge -> 89
    //   81: aload_0
    //   82: iload #6
    //   84: newarray byte
    //   86: putfield U : [B
    //   89: aload_1
    //   90: invokevirtual position : ()I
    //   93: istore #7
    //   95: aload_1
    //   96: aload_0
    //   97: getfield U : [B
    //   100: iconst_0
    //   101: iload #6
    //   103: invokevirtual get : ([BII)Ljava/nio/ByteBuffer;
    //   106: pop
    //   107: aload_1
    //   108: iload #7
    //   110: invokevirtual position : (I)Ljava/nio/Buffer;
    //   113: pop
    //   114: aload_0
    //   115: iconst_0
    //   116: putfield V : I
    //   119: aload_1
    //   120: invokevirtual remaining : ()I
    //   123: istore #8
    //   125: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   128: bipush #21
    //   130: if_icmpge -> 241
    //   133: aload_0
    //   134: getfield I : J
    //   137: aload_0
    //   138: getfield g : Lcom/google/android/gms/internal/ads/md2;
    //   141: invokevirtual g : ()J
    //   144: aload_0
    //   145: getfield H : I
    //   148: i2l
    //   149: lmul
    //   150: lsub
    //   151: l2i
    //   152: istore #6
    //   154: aload_0
    //   155: getfield p : I
    //   158: iload #6
    //   160: isub
    //   161: istore #6
    //   163: iload #6
    //   165: ifle -> 235
    //   168: iload #8
    //   170: iload #6
    //   172: invokestatic min : (II)I
    //   175: istore #6
    //   177: aload_0
    //   178: getfield i : Landroid/media/AudioTrack;
    //   181: aload_0
    //   182: getfield U : [B
    //   185: aload_0
    //   186: getfield V : I
    //   189: iload #6
    //   191: invokevirtual write : ([BII)I
    //   194: istore #7
    //   196: iload #7
    //   198: istore #6
    //   200: iload #7
    //   202: ifle -> 465
    //   205: aload_0
    //   206: aload_0
    //   207: getfield V : I
    //   210: iload #7
    //   212: iadd
    //   213: putfield V : I
    //   216: aload_1
    //   217: aload_1
    //   218: invokevirtual position : ()I
    //   221: iload #7
    //   223: iadd
    //   224: invokevirtual position : (I)Ljava/nio/Buffer;
    //   227: pop
    //   228: iload #7
    //   230: istore #6
    //   232: goto -> 465
    //   235: iconst_0
    //   236: istore #6
    //   238: goto -> 465
    //   241: aload_0
    //   242: getfield a0 : Z
    //   245: ifeq -> 452
    //   248: lload_2
    //   249: ldc2_w -9223372036854775807
    //   252: lcmp
    //   253: ifeq -> 262
    //   256: iconst_1
    //   257: istore #5
    //   259: goto -> 265
    //   262: iconst_0
    //   263: istore #5
    //   265: iload #5
    //   267: invokestatic e : (Z)V
    //   270: aload_0
    //   271: getfield i : Landroid/media/AudioTrack;
    //   274: astore #4
    //   276: aload_0
    //   277: getfield v : Ljava/nio/ByteBuffer;
    //   280: ifnonnull -> 315
    //   283: bipush #16
    //   285: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   288: astore #9
    //   290: aload_0
    //   291: aload #9
    //   293: putfield v : Ljava/nio/ByteBuffer;
    //   296: aload #9
    //   298: getstatic java/nio/ByteOrder.BIG_ENDIAN : Ljava/nio/ByteOrder;
    //   301: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   304: pop
    //   305: aload_0
    //   306: getfield v : Ljava/nio/ByteBuffer;
    //   309: ldc 1431633921
    //   311: invokevirtual putInt : (I)Ljava/nio/ByteBuffer;
    //   314: pop
    //   315: aload_0
    //   316: getfield w : I
    //   319: ifne -> 363
    //   322: aload_0
    //   323: getfield v : Ljava/nio/ByteBuffer;
    //   326: iconst_4
    //   327: iload #8
    //   329: invokevirtual putInt : (II)Ljava/nio/ByteBuffer;
    //   332: pop
    //   333: aload_0
    //   334: getfield v : Ljava/nio/ByteBuffer;
    //   337: bipush #8
    //   339: lload_2
    //   340: ldc2_w 1000
    //   343: lmul
    //   344: invokevirtual putLong : (IJ)Ljava/nio/ByteBuffer;
    //   347: pop
    //   348: aload_0
    //   349: getfield v : Ljava/nio/ByteBuffer;
    //   352: iconst_0
    //   353: invokevirtual position : (I)Ljava/nio/Buffer;
    //   356: pop
    //   357: aload_0
    //   358: iload #8
    //   360: putfield w : I
    //   363: aload_0
    //   364: getfield v : Ljava/nio/ByteBuffer;
    //   367: invokevirtual remaining : ()I
    //   370: istore #7
    //   372: iload #7
    //   374: ifle -> 414
    //   377: aload #4
    //   379: aload_0
    //   380: getfield v : Ljava/nio/ByteBuffer;
    //   383: iload #7
    //   385: iconst_1
    //   386: invokevirtual write : (Ljava/nio/ByteBuffer;II)I
    //   389: istore #6
    //   391: iload #6
    //   393: ifge -> 404
    //   396: aload_0
    //   397: iconst_0
    //   398: putfield w : I
    //   401: goto -> 465
    //   404: iload #6
    //   406: iload #7
    //   408: if_icmpge -> 414
    //   411: goto -> 235
    //   414: aload #4
    //   416: aload_1
    //   417: iload #8
    //   419: iconst_1
    //   420: invokevirtual write : (Ljava/nio/ByteBuffer;II)I
    //   423: istore #6
    //   425: iload #6
    //   427: ifge -> 438
    //   430: aload_0
    //   431: iconst_0
    //   432: putfield w : I
    //   435: goto -> 449
    //   438: aload_0
    //   439: aload_0
    //   440: getfield w : I
    //   443: iload #6
    //   445: isub
    //   446: putfield w : I
    //   449: goto -> 465
    //   452: aload_0
    //   453: getfield i : Landroid/media/AudioTrack;
    //   456: aload_1
    //   457: iload #8
    //   459: iconst_1
    //   460: invokevirtual write : (Ljava/nio/ByteBuffer;II)I
    //   463: istore #6
    //   465: aload_0
    //   466: invokestatic elapsedRealtime : ()J
    //   469: putfield c0 : J
    //   472: iload #6
    //   474: iflt -> 535
    //   477: aload_0
    //   478: getfield o : Z
    //   481: istore #5
    //   483: iload #5
    //   485: ifne -> 500
    //   488: aload_0
    //   489: aload_0
    //   490: getfield I : J
    //   493: iload #6
    //   495: i2l
    //   496: ladd
    //   497: putfield I : J
    //   500: iload #6
    //   502: iload #8
    //   504: if_icmpne -> 533
    //   507: iload #5
    //   509: ifeq -> 526
    //   512: aload_0
    //   513: aload_0
    //   514: getfield J : J
    //   517: aload_0
    //   518: getfield K : I
    //   521: i2l
    //   522: ladd
    //   523: putfield J : J
    //   526: aload_0
    //   527: aconst_null
    //   528: putfield T : Ljava/nio/ByteBuffer;
    //   531: iconst_1
    //   532: ireturn
    //   533: iconst_0
    //   534: ireturn
    //   535: new com/google/android/gms/internal/ads/zzjb
    //   538: dup
    //   539: iload #6
    //   541: invokespecial <init> : (I)V
    //   544: astore_1
    //   545: goto -> 550
    //   548: aload_1
    //   549: athrow
    //   550: goto -> 548
  }
  
  private final void m(long paramLong) {
    int i = this.Q.length;
    for (int j = i; j >= 0; j--) {
      ByteBuffer byteBuffer;
      if (j > 0) {
        byteBuffer = this.R[j - 1];
      } else {
        byteBuffer = this.S;
        if (byteBuffer == null)
          byteBuffer = ad2.a; 
      } 
      if (j == i) {
        l(byteBuffer, paramLong);
      } else {
        ad2 ad21 = this.Q[j];
        ad21.e(byteBuffer);
        ByteBuffer byteBuffer1 = ad21.f();
        this.R[j] = byteBuffer1;
        if (byteBuffer1.hasRemaining()) {
          j++;
          continue;
        } 
      } 
      if (byteBuffer.hasRemaining())
        return; 
    } 
  }
  
  private final long n(long paramLong) {
    return paramLong * 1000000L / this.j;
  }
  
  private final long o(long paramLong) {
    return paramLong * this.j / 1000000L;
  }
  
  private final void q() {
    ArrayList<ad2> arrayList = new ArrayList();
    ad2[] arrayOfAd2 = this.c;
    int i = arrayOfAd2.length;
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      ad2 ad21 = arrayOfAd2[b];
      if (ad21.c()) {
        arrayList.add(ad21);
      } else {
        ad21.flush();
      } 
    } 
    i = arrayList.size();
    this.Q = arrayList.<ad2>toArray(new ad2[i]);
    this.R = new ByteBuffer[i];
    for (b = bool; b < i; b++) {
      ad2 ad21 = this.Q[b];
      ad21.flush();
      this.R[b] = ad21.f();
    } 
  }
  
  private final boolean t() {
    if (this.W == -1) {
      boolean bool1;
      if (this.o) {
        bool1 = this.Q.length;
      } else {
        bool1 = false;
      } 
      this.W = bool1;
    } else {
      boolean bool1 = false;
      int j = this.W;
      ad2[] arrayOfAd21 = this.Q;
    } 
    boolean bool = true;
    int i = this.W;
    ad2[] arrayOfAd2 = this.Q;
  }
  
  private final void x() {
    if (a()) {
      if (wj2.a >= 21) {
        this.i.setVolume(this.P);
        return;
      } 
      AudioTrack audioTrack = this.i;
      float f = this.P;
      audioTrack.setStereoVolume(f, f);
    } 
  }
  
  private final long y() {
    return this.o ? this.J : (this.I / this.H);
  }
  
  private final void z() {
    this.z = 0L;
    this.y = 0;
    this.x = 0;
    this.A = 0L;
    this.B = false;
    this.C = 0L;
  }
  
  public final long B(boolean paramBoolean) {
    int i;
    if (a() && this.L != 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (!i)
      return Long.MIN_VALUE; 
    if (this.i.getPlayState() == 3) {
      long l = this.g.h();
      if (l != 0L) {
        long l3 = System.nanoTime() / 1000L;
        if (l3 - this.A >= 30000L) {
          long[] arrayOfLong = this.f;
          i = this.x;
          arrayOfLong[i] = l - l3;
          this.x = (i + 1) % 10;
          i = this.y;
          if (i < 10)
            this.y = i + 1; 
          this.A = l3;
          this.z = 0L;
          i = 0;
          while (true) {
            int j = this.y;
            if (i < j) {
              this.z += this.f[i] / j;
              i++;
              continue;
            } 
            break;
          } 
        } 
        if (!A() && l3 - this.C >= 500000L) {
          boolean bool = this.g.d();
          this.B = bool;
          if (bool) {
            long l4 = this.g.e() / 1000L;
            long l5 = this.g.f();
            if (l4 < this.N) {
              this.B = false;
            } else if (Math.abs(l4 - l3) > 5000000L) {
              StringBuilder stringBuilder = new StringBuilder(136);
              stringBuilder.append("Spurious audio timestamp (system clock mismatch): ");
              stringBuilder.append(l5);
              stringBuilder.append(", ");
              stringBuilder.append(l4);
              stringBuilder.append(", ");
              stringBuilder.append(l3);
              stringBuilder.append(", ");
              stringBuilder.append(l);
              Log.w("AudioTrack", stringBuilder.toString());
              this.B = false;
            } else if (Math.abs(n(l5) - l) > 5000000L) {
              StringBuilder stringBuilder = new StringBuilder(138);
              stringBuilder.append("Spurious audio timestamp (frame position mismatch): ");
              stringBuilder.append(l5);
              stringBuilder.append(", ");
              stringBuilder.append(l4);
              stringBuilder.append(", ");
              stringBuilder.append(l3);
              stringBuilder.append(", ");
              stringBuilder.append(l);
              Log.w("AudioTrack", stringBuilder.toString());
              this.B = false;
            } 
          } 
          Method method = this.D;
          if (method != null && !this.o)
            try {
              l = ((Integer)method.invoke(this.i, null)).intValue() * 1000L - this.q;
              this.O = l;
              l = Math.max(l, 0L);
              this.O = l;
              if (l > 5000000L) {
                StringBuilder stringBuilder = new StringBuilder();
                this(61);
                stringBuilder.append("Ignoring impossibly large audio latency: ");
                stringBuilder.append(l);
                Log.w("AudioTrack", stringBuilder.toString());
                this.O = 0L;
              } 
            } catch (Exception exception) {
              this.D = null;
            }  
          this.C = l3;
        } 
      } 
    } 
    long l1 = System.nanoTime() / 1000L;
    if (this.B) {
      l1 = o(l1 - this.g.e() / 1000L);
      l1 = n(this.g.f() + l1);
    } else {
      long l;
      if (this.y == 0) {
        l = this.g.h();
      } else {
        l = l1 + this.z;
      } 
      l1 = l;
      if (!paramBoolean)
        l1 = l - this.O; 
    } 
    long l2 = this.M;
    while (!this.h.isEmpty() && l1 >= nd2.b(this.h.getFirst())) {
      nd2 nd2 = this.h.remove();
      this.s = nd2.a(nd2);
      this.u = nd2.b(nd2);
      this.t = nd2.c(nd2) - this.M;
    } 
    if (this.s.b == 1.0F) {
      l1 = l1 + this.t - this.u;
    } else {
      long l;
      if (this.h.isEmpty() && this.b.m() >= 1024L) {
        long l3 = this.t;
        l = wj2.c(l1 - this.u, this.b.l(), this.b.m());
        l1 = l3;
      } else {
        long l3 = this.t;
        double d1 = this.s.b;
        double d2 = (l1 - this.u);
        Double.isNaN(d1);
        Double.isNaN(d2);
        l = (long)(d1 * d2);
        l1 = l3;
      } 
      l1 = l + l1;
    } 
    return l2 + l1;
  }
  
  public final void b() {
    this.Y = false;
    if (a()) {
      z();
      this.g.a();
    } 
  }
  
  public final void c() {
    this.Y = true;
    if (a()) {
      this.N = System.nanoTime() / 1000L;
      this.i.play();
    } 
  }
  
  public final void d() {
    e();
    ad2[] arrayOfAd2 = this.c;
    int i = arrayOfAd2.length;
    for (byte b = 0; b < i; b++)
      arrayOfAd2[b].a(); 
    this.Z = 0;
    this.Y = false;
  }
  
  public final void e() {
    if (a()) {
      this.F = 0L;
      this.G = 0L;
      this.I = 0L;
      this.J = 0L;
      this.K = 0;
      qc2 qc21 = this.r;
      if (qc21 != null) {
        this.s = qc21;
        this.r = null;
      } else if (!this.h.isEmpty()) {
        this.s = nd2.a(this.h.getLast());
      } 
      this.h.clear();
      this.t = 0L;
      this.u = 0L;
      this.S = null;
      this.T = null;
      byte b = 0;
      while (true) {
        ad2[] arrayOfAd2 = this.Q;
        if (b < arrayOfAd2.length) {
          ad2 ad21 = arrayOfAd2[b];
          ad21.flush();
          this.R[b] = ad21.f();
          b++;
          continue;
        } 
        this.X = false;
        this.W = -1;
        this.v = null;
        this.w = 0;
        this.L = 0;
        this.O = 0L;
        z();
        if (this.i.getPlayState() == 3)
          this.i.pause(); 
        AudioTrack audioTrack = this.i;
        this.i = null;
        this.g.b(null, false);
        this.e.close();
        (new jd2(this, audioTrack)).start();
        break;
      } 
    } 
  }
  
  public final void f(int paramInt) {
    if (this.n == paramInt)
      return; 
    this.n = paramInt;
    if (this.a0)
      return; 
    e();
    this.Z = 0;
  }
  
  public final void g(float paramFloat) {
    if (this.P != paramFloat) {
      this.P = paramFloat;
      x();
    } 
  }
  
  public final void i(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    StringBuilder stringBuilder;
    int j;
    boolean bool2;
    int m;
    long l;
    boolean bool = "audio/raw".equals(paramString);
    boolean bool1 = true;
    int k = bool ^ true;
    if (k != 0) {
      paramString.hashCode();
      paramInt4 = -1;
      switch (paramString.hashCode()) {
        case 1505942594:
          if (!paramString.equals("audio/vnd.dts.hd"))
            break; 
          paramInt4 = 3;
          break;
        case 1504578661:
          if (!paramString.equals("audio/eac3"))
            break; 
          paramInt4 = 2;
          break;
        case 187078296:
          if (!paramString.equals("audio/ac3"))
            break; 
          paramInt4 = 1;
          break;
        case -1095064472:
          if (!paramString.equals("audio/vnd.dts"))
            break; 
          paramInt4 = 0;
          break;
      } 
      switch (paramInt4) {
        default:
          paramInt4 = 0;
          break;
        case 3:
          paramInt4 = 8;
          break;
        case 2:
          paramInt4 = 6;
          break;
        case 1:
          paramInt4 = 5;
          break;
        case 0:
          paramInt4 = 7;
          break;
      } 
    } else {
      paramInt4 = paramInt3;
    } 
    if (k == 0) {
      int n;
      int i1;
      this.E = wj2.q(paramInt3, paramInt1);
      this.a.j(paramArrayOfint);
      ad2[] arrayOfAd2 = this.c;
      bool2 = arrayOfAd2.length;
      m = 0;
      paramInt3 = 0;
      int i2 = paramInt4;
      while (m < bool2) {
        ad2 ad21 = arrayOfAd2[m];
        try {
          int i3 = ad21.h(paramInt2, paramInt1, i2);
          n = paramInt3 | i3;
          if (ad21.c()) {
            paramInt1 = ad21.g();
            i1 = ad21.i();
          } 
          m++;
        } catch (zzii zzii) {
          throw new zzix(zzii);
        } 
      } 
      j = i1;
      m = paramInt1;
      bool2 = n;
      if (n != 0) {
        q();
        j = i1;
        m = paramInt1;
        bool2 = n;
      } 
    } else {
      bool2 = false;
      m = paramInt1;
    } 
    switch (m) {
      default:
        stringBuilder = new StringBuilder(38);
        stringBuilder.append("Unsupported channel count: ");
        stringBuilder.append(m);
        throw new zzix(stringBuilder.toString());
      case 8:
        paramInt1 = zb2.a;
        break;
      case 7:
        paramInt1 = 1276;
        break;
      case 6:
        paramInt1 = 252;
        break;
      case 5:
        paramInt1 = 220;
        break;
      case 4:
        paramInt1 = 204;
        break;
      case 3:
        paramInt1 = 28;
        break;
      case 2:
        paramInt1 = 12;
        break;
      case 1:
        paramInt1 = 4;
        break;
    } 
    int i = wj2.a;
    if (i <= 23 && "foster".equals(wj2.b) && "NVIDIA".equals(wj2.c))
      if (m != 3 && m != 5) {
        if (m == 7)
          paramInt1 = zb2.a; 
      } else {
        paramInt1 = 252;
      }  
    if (i <= 25 && "fugu".equals(wj2.b) && k != 0 && m == 1)
      paramInt1 = 12; 
    if (!bool2 && a() && this.l == j && this.j == paramInt2 && this.k == paramInt1)
      return; 
    e();
    this.l = j;
    this.o = k;
    this.j = paramInt2;
    this.k = paramInt1;
    if (k == 0)
      j = 2; 
    this.m = j;
    this.H = wj2.q(2, m);
    if (k != 0) {
      paramInt1 = this.m;
      if (paramInt1 == 5 || paramInt1 == 6) {
        paramInt1 = 20480;
      } else {
        paramInt1 = 49152;
      } 
    } else {
      i = AudioTrack.getMinBufferSize(paramInt2, paramInt1, this.m);
      if (i == -2)
        bool1 = false; 
      jj2.e(bool1);
      paramInt1 = i << 2;
      paramInt2 = (int)o(250000L);
      paramInt2 = this.H * paramInt2;
      i = (int)Math.max(i, o(750000L) * this.H);
      if (paramInt1 < paramInt2) {
        paramInt1 = paramInt2;
      } else if (paramInt1 > i) {
        paramInt1 = i;
      } 
    } 
    this.p = paramInt1;
    if (k != 0) {
      l = -9223372036854775807L;
    } else {
      l = n((paramInt1 / this.H));
    } 
    this.q = l;
    j(this.s);
  }
  
  public final qc2 j(qc2 paramqc2) {
    if (this.o) {
      paramqc2 = qc2.a;
      this.s = paramqc2;
      return paramqc2;
    } 
    qc2 qc21 = new qc2(this.b.j(paramqc2.b), this.b.k(paramqc2.c));
    paramqc2 = this.r;
    if (paramqc2 == null)
      if (!this.h.isEmpty()) {
        paramqc2 = nd2.a(this.h.getLast());
      } else {
        paramqc2 = this.s;
      }  
    if (!qc21.equals(paramqc2))
      if (a()) {
        this.r = qc21;
      } else {
        this.s = qc21;
      }  
    return this.s;
  }
  
  public final boolean k(ByteBuffer paramByteBuffer, long paramLong) {
    ByteBuffer byteBuffer = this.S;
    if (byteBuffer == null || paramByteBuffer == byteBuffer) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    jj2.a(bool1);
    if (!a()) {
      this.e.block();
      if (this.a0) {
        int j = this.j;
        int k = this.k;
        int m = this.m;
        int n = this.p;
        int i1 = this.Z;
        this.i = new AudioTrack((new AudioAttributes.Builder()).setUsage(1).setContentType(3).setFlags(16).build(), (new AudioFormat.Builder()).setChannelMask(k).setEncoding(m).setSampleRate(j).build(), n, 1, i1);
      } else if (this.Z == 0) {
        this.i = new AudioTrack(this.n, this.j, this.k, this.m, this.p, 1);
      } else {
        this.i = new AudioTrack(this.n, this.j, this.k, this.m, this.p, 1, this.Z);
      } 
      int i = this.i.getState();
      if (i == 1) {
        i = this.i.getAudioSessionId();
        if (this.Z != i) {
          this.Z = i;
          this.d.b(i);
        } 
        this.g.b(this.i, A());
        x();
        this.b0 = false;
        if (this.Y)
          c(); 
      } else {
        try {
          this.i.release();
        } catch (Exception exception) {
        
        } finally {
          this.i = null;
        } 
        throw new zziw(i, this.j, this.k, this.p);
      } 
    } 
    if (A()) {
      if (this.i.getPlayState() == 2) {
        this.b0 = false;
        return false;
      } 
      if (this.i.getPlayState() == 1 && this.g.g() != 0L)
        return false; 
    } 
    boolean bool2 = this.b0;
    boolean bool1 = u();
    this.b0 = bool1;
    if (bool2 && !bool1 && this.i.getPlayState() != 1) {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = this.c0;
      this.d.c(this.p, zb2.a(this.q), l1 - l2);
    } 
    if (this.S == null) {
      StringBuilder stringBuilder;
      if (!paramByteBuffer.hasRemaining())
        return true; 
      if (this.o && this.K == 0) {
        int i = this.m;
        if (i == 7 || i == 8) {
          i = rd2.a(paramByteBuffer);
        } else if (i == 5) {
          i = zc2.c();
        } else if (i == 6) {
          i = zc2.d(paramByteBuffer);
        } else {
          stringBuilder = new StringBuilder(38);
          stringBuilder.append("Unexpected audio encoding: ");
          stringBuilder.append(i);
          throw new IllegalStateException(stringBuilder.toString());
        } 
        this.K = i;
      } 
      if (this.r != null) {
        if (!t())
          return false; 
        this.h.add(new nd2(this.r, Math.max(0L, paramLong), n(y()), null));
        this.r = null;
        q();
      } 
      if (this.L == 0) {
        this.M = Math.max(0L, paramLong);
        this.L = 1;
      } else {
        long l2 = this.M;
        if (this.o) {
          l1 = this.G;
        } else {
          l1 = this.F / this.E;
        } 
        long l1 = l2 + n(l1);
        if (this.L == 1 && Math.abs(l1 - paramLong) > 200000L) {
          StringBuilder stringBuilder1 = new StringBuilder(80);
          stringBuilder1.append("Discontinuity detected [expected ");
          stringBuilder1.append(l1);
          stringBuilder1.append(", got ");
          stringBuilder1.append(paramLong);
          stringBuilder1.append("]");
          Log.e("AudioTrack", stringBuilder1.toString());
          this.L = 2;
        } 
        if (this.L == 2) {
          this.M += paramLong - l1;
          this.L = 1;
          this.d.a();
        } 
      } 
      if (this.o) {
        this.G += this.K;
      } else {
        this.F += stringBuilder.remaining();
      } 
      this.S = (ByteBuffer)stringBuilder;
    } 
    if (this.o) {
      l(this.S, paramLong);
    } else {
      m(paramLong);
    } 
    if (!this.S.hasRemaining()) {
      this.S = null;
      return true;
    } 
    return false;
  }
  
  public final boolean p() {
    return (!a() || (this.X && !u()));
  }
  
  public final void r() {
    if (this.L == 1)
      this.L = 2; 
  }
  
  public final void s() {
    if (!this.X && a() && t()) {
      this.g.c(y());
      this.w = 0;
      this.X = true;
    } 
  }
  
  public final boolean u() {
    if (a())
      if (y() <= this.g.g()) {
        boolean bool;
        if (A() && this.i.getPlayState() == 2 && this.i.getPlaybackHeadPosition() == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          return true; 
      } else {
        return true;
      }  
    return false;
  }
  
  public final qc2 v() {
    return this.s;
  }
  
  public final void w() {
    if (this.a0) {
      this.a0 = false;
      this.Z = 0;
      e();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */