package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public abstract class ig2 extends yb2 {
  private static final byte[] i = wj2.l("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
  
  private boolean A;
  
  private boolean B;
  
  private boolean C;
  
  private boolean D;
  
  private boolean E;
  
  private ByteBuffer[] F;
  
  private ByteBuffer[] G;
  
  private long H;
  
  private int I;
  
  private int J;
  
  private boolean K;
  
  private boolean L;
  
  private int M;
  
  private int N;
  
  private boolean O;
  
  private boolean P;
  
  private boolean Q;
  
  private boolean R;
  
  private boolean S;
  
  private boolean T;
  
  protected ae2 U;
  
  private final kg2 j;
  
  private final ge2<he2> k;
  
  private final boolean l;
  
  private final ce2 m;
  
  private final ce2 n;
  
  private final nc2 o;
  
  private final List<Long> p;
  
  private final MediaCodec.BufferInfo q;
  
  private zzht r;
  
  private ee2<he2> s;
  
  private ee2<he2> t;
  
  private MediaCodec u;
  
  private jg2 v;
  
  private boolean w;
  
  private boolean x;
  
  private boolean y;
  
  private boolean z;
  
  public ig2(int paramInt, kg2 paramkg2, ge2<he2> paramge2, boolean paramBoolean) {
    super(paramInt);
    boolean bool;
    if (wj2.a >= 16) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.e(bool);
    this.j = jj2.<kg2>d(paramkg2);
    this.k = null;
    this.l = paramBoolean;
    this.m = new ce2(0);
    this.n = new ce2(0);
    this.o = new nc2();
    this.p = new ArrayList<Long>();
    this.q = new MediaCodec.BufferInfo();
    this.M = 0;
    this.N = 0;
  }
  
  private final void M(zzly paramzzly) {
    throw zzhe.zza(paramzzly, w());
  }
  
  private final boolean S(long paramLong1, long paramLong2) {
    boolean bool;
    if (this.J < 0) {
      if (this.B && this.P) {
        try {
          this.J = this.u.dequeueOutputBuffer(this.q, 0L);
        } catch (IllegalStateException illegalStateException) {
          Z();
          if (this.R)
            X(); 
          return false;
        } 
      } else {
        this.J = this.u.dequeueOutputBuffer(this.q, 0L);
      } 
      int i = this.J;
      if (i >= 0) {
        if (this.E) {
          this.E = false;
          this.u.releaseOutputBuffer(i, false);
          this.J = -1;
          return true;
        } 
        MediaCodec.BufferInfo bufferInfo = this.q;
        if ((bufferInfo.flags & 0x4) != 0) {
          Z();
          this.J = -1;
          return false;
        } 
        ByteBuffer byteBuffer = this.G[i];
        if (byteBuffer != null) {
          byteBuffer.position(bufferInfo.offset);
          bufferInfo = this.q;
          byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        } 
        long l = this.q.presentationTimeUs;
        int j = this.p.size();
        i = 0;
        while (true) {
          if (i < j) {
            if (((Long)this.p.get(i)).longValue() == l) {
              this.p.remove(i);
              boolean bool1 = true;
              break;
            } 
            i++;
            continue;
          } 
          bool = false;
          break;
        } 
        this.K = bool;
      } else {
        if (i == -2) {
          MediaFormat mediaFormat = this.u.getOutputFormat();
          if (this.y && mediaFormat.getInteger("width") == 32 && mediaFormat.getInteger("height") == 32) {
            this.E = true;
          } else {
            if (this.C)
              mediaFormat.setInteger("channel-count", 1); 
            H(this.u, mediaFormat);
          } 
          return true;
        } 
        if (i == -3) {
          this.G = this.u.getOutputBuffers();
          return true;
        } 
        if (this.z && (this.Q || this.N == 2))
          Z(); 
        return false;
      } 
    } 
    if (this.B && this.P) {
      try {
        MediaCodec mediaCodec = this.u;
        ByteBuffer[] arrayOfByteBuffer = this.G;
        int i = this.J;
        ByteBuffer byteBuffer = arrayOfByteBuffer[i];
        MediaCodec.BufferInfo bufferInfo = this.q;
        bool = N(paramLong1, paramLong2, mediaCodec, byteBuffer, i, bufferInfo.flags, bufferInfo.presentationTimeUs, this.K);
      } catch (IllegalStateException illegalStateException) {
        Z();
        if (this.R)
          X(); 
        return false;
      } 
    } else {
      MediaCodec mediaCodec = this.u;
      ByteBuffer[] arrayOfByteBuffer = this.G;
      int i = this.J;
      ByteBuffer byteBuffer = arrayOfByteBuffer[i];
      MediaCodec.BufferInfo bufferInfo = this.q;
      bool = N(paramLong1, paramLong2, mediaCodec, byteBuffer, i, bufferInfo.flags, bufferInfo.presentationTimeUs, this.K);
    } 
    if (bool) {
      paramLong1 = this.q.presentationTimeUs;
      this.J = -1;
      return true;
    } 
    return false;
  }
  
  private final boolean Y() {
    // Byte code:
    //   0: aload_0
    //   1: getfield u : Landroid/media/MediaCodec;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 786
    //   9: aload_0
    //   10: getfield N : I
    //   13: iconst_2
    //   14: if_icmpeq -> 786
    //   17: aload_0
    //   18: getfield Q : Z
    //   21: ifeq -> 27
    //   24: goto -> 786
    //   27: aload_0
    //   28: getfield I : I
    //   31: ifge -> 70
    //   34: aload_1
    //   35: lconst_0
    //   36: invokevirtual dequeueInputBuffer : (J)I
    //   39: istore_2
    //   40: aload_0
    //   41: iload_2
    //   42: putfield I : I
    //   45: iload_2
    //   46: ifge -> 51
    //   49: iconst_0
    //   50: ireturn
    //   51: aload_0
    //   52: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   55: astore_1
    //   56: aload_1
    //   57: aload_0
    //   58: getfield F : [Ljava/nio/ByteBuffer;
    //   61: iload_2
    //   62: aaload
    //   63: putfield c : Ljava/nio/ByteBuffer;
    //   66: aload_1
    //   67: invokevirtual a : ()V
    //   70: aload_0
    //   71: getfield N : I
    //   74: iconst_1
    //   75: if_icmpne -> 117
    //   78: aload_0
    //   79: getfield z : Z
    //   82: ifne -> 110
    //   85: aload_0
    //   86: iconst_1
    //   87: putfield P : Z
    //   90: aload_0
    //   91: getfield u : Landroid/media/MediaCodec;
    //   94: aload_0
    //   95: getfield I : I
    //   98: iconst_0
    //   99: iconst_0
    //   100: lconst_0
    //   101: iconst_4
    //   102: invokevirtual queueInputBuffer : (IIIJI)V
    //   105: aload_0
    //   106: iconst_m1
    //   107: putfield I : I
    //   110: aload_0
    //   111: iconst_2
    //   112: putfield N : I
    //   115: iconst_0
    //   116: ireturn
    //   117: aload_0
    //   118: getfield D : Z
    //   121: ifeq -> 175
    //   124: aload_0
    //   125: iconst_0
    //   126: putfield D : Z
    //   129: aload_0
    //   130: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   133: getfield c : Ljava/nio/ByteBuffer;
    //   136: astore_1
    //   137: getstatic com/google/android/gms/internal/ads/ig2.i : [B
    //   140: astore_3
    //   141: aload_1
    //   142: aload_3
    //   143: invokevirtual put : ([B)Ljava/nio/ByteBuffer;
    //   146: pop
    //   147: aload_0
    //   148: getfield u : Landroid/media/MediaCodec;
    //   151: aload_0
    //   152: getfield I : I
    //   155: iconst_0
    //   156: aload_3
    //   157: arraylength
    //   158: lconst_0
    //   159: iconst_0
    //   160: invokevirtual queueInputBuffer : (IIIJI)V
    //   163: aload_0
    //   164: iconst_m1
    //   165: putfield I : I
    //   168: aload_0
    //   169: iconst_1
    //   170: putfield O : Z
    //   173: iconst_1
    //   174: ireturn
    //   175: aload_0
    //   176: getfield S : Z
    //   179: ifeq -> 191
    //   182: bipush #-4
    //   184: istore #4
    //   186: iconst_0
    //   187: istore_2
    //   188: goto -> 283
    //   191: aload_0
    //   192: getfield M : I
    //   195: iconst_1
    //   196: if_icmpne -> 257
    //   199: iconst_0
    //   200: istore_2
    //   201: iload_2
    //   202: aload_0
    //   203: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   206: getfield i : Ljava/util/List;
    //   209: invokeinterface size : ()I
    //   214: if_icmpge -> 252
    //   217: aload_0
    //   218: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   221: getfield i : Ljava/util/List;
    //   224: iload_2
    //   225: invokeinterface get : (I)Ljava/lang/Object;
    //   230: checkcast [B
    //   233: astore_1
    //   234: aload_0
    //   235: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   238: getfield c : Ljava/nio/ByteBuffer;
    //   241: aload_1
    //   242: invokevirtual put : ([B)Ljava/nio/ByteBuffer;
    //   245: pop
    //   246: iinc #2, 1
    //   249: goto -> 201
    //   252: aload_0
    //   253: iconst_2
    //   254: putfield M : I
    //   257: aload_0
    //   258: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   261: getfield c : Ljava/nio/ByteBuffer;
    //   264: invokevirtual position : ()I
    //   267: istore_2
    //   268: aload_0
    //   269: aload_0
    //   270: getfield o : Lcom/google/android/gms/internal/ads/nc2;
    //   273: aload_0
    //   274: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   277: iconst_0
    //   278: invokevirtual z : (Lcom/google/android/gms/internal/ads/nc2;Lcom/google/android/gms/internal/ads/ce2;Z)I
    //   281: istore #4
    //   283: iload #4
    //   285: bipush #-3
    //   287: if_icmpne -> 292
    //   290: iconst_0
    //   291: ireturn
    //   292: iload #4
    //   294: bipush #-5
    //   296: if_icmpne -> 332
    //   299: aload_0
    //   300: getfield M : I
    //   303: iconst_2
    //   304: if_icmpne -> 319
    //   307: aload_0
    //   308: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   311: invokevirtual a : ()V
    //   314: aload_0
    //   315: iconst_1
    //   316: putfield M : I
    //   319: aload_0
    //   320: aload_0
    //   321: getfield o : Lcom/google/android/gms/internal/ads/nc2;
    //   324: getfield a : Lcom/google/android/gms/internal/ads/zzht;
    //   327: invokevirtual R : (Lcom/google/android/gms/internal/ads/zzht;)V
    //   330: iconst_1
    //   331: ireturn
    //   332: aload_0
    //   333: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   336: invokevirtual f : ()Z
    //   339: ifeq -> 424
    //   342: aload_0
    //   343: getfield M : I
    //   346: iconst_2
    //   347: if_icmpne -> 362
    //   350: aload_0
    //   351: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   354: invokevirtual a : ()V
    //   357: aload_0
    //   358: iconst_1
    //   359: putfield M : I
    //   362: aload_0
    //   363: iconst_1
    //   364: putfield Q : Z
    //   367: aload_0
    //   368: getfield O : Z
    //   371: ifne -> 380
    //   374: aload_0
    //   375: invokespecial Z : ()V
    //   378: iconst_0
    //   379: ireturn
    //   380: aload_0
    //   381: getfield z : Z
    //   384: ifne -> 412
    //   387: aload_0
    //   388: iconst_1
    //   389: putfield P : Z
    //   392: aload_0
    //   393: getfield u : Landroid/media/MediaCodec;
    //   396: aload_0
    //   397: getfield I : I
    //   400: iconst_0
    //   401: iconst_0
    //   402: lconst_0
    //   403: iconst_4
    //   404: invokevirtual queueInputBuffer : (IIIJI)V
    //   407: aload_0
    //   408: iconst_m1
    //   409: putfield I : I
    //   412: iconst_0
    //   413: ireturn
    //   414: astore_1
    //   415: aload_1
    //   416: aload_0
    //   417: invokevirtual w : ()I
    //   420: invokestatic zza : (Ljava/lang/Exception;I)Lcom/google/android/gms/internal/ads/zzhe;
    //   423: athrow
    //   424: aload_0
    //   425: getfield T : Z
    //   428: ifeq -> 463
    //   431: aload_0
    //   432: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   435: invokevirtual g : ()Z
    //   438: ifne -> 463
    //   441: aload_0
    //   442: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   445: invokevirtual a : ()V
    //   448: aload_0
    //   449: getfield M : I
    //   452: iconst_2
    //   453: if_icmpne -> 461
    //   456: aload_0
    //   457: iconst_1
    //   458: putfield M : I
    //   461: iconst_1
    //   462: ireturn
    //   463: aload_0
    //   464: iconst_0
    //   465: putfield T : Z
    //   468: aload_0
    //   469: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   472: invokevirtual h : ()Z
    //   475: istore #5
    //   477: aload_0
    //   478: getfield s : Lcom/google/android/gms/internal/ads/ee2;
    //   481: astore_1
    //   482: aload_1
    //   483: ifnull -> 540
    //   486: aload_1
    //   487: invokeinterface getState : ()I
    //   492: istore #4
    //   494: iload #4
    //   496: ifeq -> 523
    //   499: iload #4
    //   501: iconst_4
    //   502: if_icmpeq -> 540
    //   505: iload #5
    //   507: ifne -> 517
    //   510: aload_0
    //   511: getfield l : Z
    //   514: ifne -> 540
    //   517: iconst_1
    //   518: istore #6
    //   520: goto -> 543
    //   523: aload_0
    //   524: getfield s : Lcom/google/android/gms/internal/ads/ee2;
    //   527: invokeinterface b : ()Lcom/google/android/gms/internal/ads/zzju;
    //   532: aload_0
    //   533: invokevirtual w : ()I
    //   536: invokestatic zza : (Ljava/lang/Exception;I)Lcom/google/android/gms/internal/ads/zzhe;
    //   539: athrow
    //   540: iconst_0
    //   541: istore #6
    //   543: aload_0
    //   544: iload #6
    //   546: putfield S : Z
    //   549: iload #6
    //   551: ifeq -> 556
    //   554: iconst_0
    //   555: ireturn
    //   556: aload_0
    //   557: getfield w : Z
    //   560: ifeq -> 598
    //   563: iload #5
    //   565: ifne -> 598
    //   568: aload_0
    //   569: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   572: getfield c : Ljava/nio/ByteBuffer;
    //   575: invokestatic d : (Ljava/nio/ByteBuffer;)V
    //   578: aload_0
    //   579: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   582: getfield c : Ljava/nio/ByteBuffer;
    //   585: invokevirtual position : ()I
    //   588: ifne -> 593
    //   591: iconst_1
    //   592: ireturn
    //   593: aload_0
    //   594: iconst_0
    //   595: putfield w : Z
    //   598: aload_0
    //   599: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   602: astore_1
    //   603: aload_1
    //   604: getfield d : J
    //   607: lstore #7
    //   609: aload_1
    //   610: invokevirtual e : ()Z
    //   613: ifeq -> 631
    //   616: aload_0
    //   617: getfield p : Ljava/util/List;
    //   620: lload #7
    //   622: invokestatic valueOf : (J)Ljava/lang/Long;
    //   625: invokeinterface add : (Ljava/lang/Object;)Z
    //   630: pop
    //   631: aload_0
    //   632: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   635: getfield c : Ljava/nio/ByteBuffer;
    //   638: invokevirtual flip : ()Ljava/nio/Buffer;
    //   641: pop
    //   642: aload_0
    //   643: aload_0
    //   644: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   647: invokevirtual K : (Lcom/google/android/gms/internal/ads/ce2;)V
    //   650: iload #5
    //   652: ifeq -> 719
    //   655: aload_0
    //   656: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   659: getfield b : Lcom/google/android/gms/internal/ads/zd2;
    //   662: invokevirtual b : ()Landroid/media/MediaCodec$CryptoInfo;
    //   665: astore_1
    //   666: iload_2
    //   667: ifne -> 673
    //   670: goto -> 700
    //   673: aload_1
    //   674: getfield numBytesOfClearData : [I
    //   677: ifnonnull -> 687
    //   680: aload_1
    //   681: iconst_1
    //   682: newarray int
    //   684: putfield numBytesOfClearData : [I
    //   687: aload_1
    //   688: getfield numBytesOfClearData : [I
    //   691: astore_3
    //   692: aload_3
    //   693: iconst_0
    //   694: aload_3
    //   695: iconst_0
    //   696: iaload
    //   697: iload_2
    //   698: iadd
    //   699: iastore
    //   700: aload_0
    //   701: getfield u : Landroid/media/MediaCodec;
    //   704: aload_0
    //   705: getfield I : I
    //   708: iconst_0
    //   709: aload_1
    //   710: lload #7
    //   712: iconst_0
    //   713: invokevirtual queueSecureInputBuffer : (IILandroid/media/MediaCodec$CryptoInfo;JI)V
    //   716: goto -> 744
    //   719: aload_0
    //   720: getfield u : Landroid/media/MediaCodec;
    //   723: aload_0
    //   724: getfield I : I
    //   727: iconst_0
    //   728: aload_0
    //   729: getfield m : Lcom/google/android/gms/internal/ads/ce2;
    //   732: getfield c : Ljava/nio/ByteBuffer;
    //   735: invokevirtual limit : ()I
    //   738: lload #7
    //   740: iconst_0
    //   741: invokevirtual queueInputBuffer : (IIIJI)V
    //   744: aload_0
    //   745: iconst_m1
    //   746: putfield I : I
    //   749: aload_0
    //   750: iconst_1
    //   751: putfield O : Z
    //   754: aload_0
    //   755: iconst_0
    //   756: putfield M : I
    //   759: aload_0
    //   760: getfield U : Lcom/google/android/gms/internal/ads/ae2;
    //   763: astore_1
    //   764: aload_1
    //   765: aload_1
    //   766: getfield c : I
    //   769: iconst_1
    //   770: iadd
    //   771: putfield c : I
    //   774: iconst_1
    //   775: ireturn
    //   776: astore_1
    //   777: aload_1
    //   778: aload_0
    //   779: invokevirtual w : ()I
    //   782: invokestatic zza : (Ljava/lang/Exception;I)Lcom/google/android/gms/internal/ads/zzhe;
    //   785: athrow
    //   786: iconst_0
    //   787: ireturn
    // Exception table:
    //   from	to	target	type
    //   380	412	414	android/media/MediaCodec$CryptoException
    //   598	631	776	android/media/MediaCodec$CryptoException
    //   631	650	776	android/media/MediaCodec$CryptoException
    //   655	666	776	android/media/MediaCodec$CryptoException
    //   673	687	776	android/media/MediaCodec$CryptoException
    //   687	692	776	android/media/MediaCodec$CryptoException
    //   700	716	776	android/media/MediaCodec$CryptoException
    //   719	744	776	android/media/MediaCodec$CryptoException
    //   744	774	776	android/media/MediaCodec$CryptoException
  }
  
  private final void Z() {
    if (this.N == 2) {
      X();
      U();
      return;
    } 
    this.R = true;
    T();
  }
  
  protected void A(long paramLong, boolean paramBoolean) {
    this.Q = false;
    this.R = false;
    if (this.u != null) {
      this.H = -9223372036854775807L;
      this.I = -1;
      this.J = -1;
      this.T = true;
      this.S = false;
      this.K = false;
      this.p.clear();
      this.D = false;
      this.E = false;
      if (this.x || (this.A && this.P)) {
        X();
        U();
      } else if (this.N != 0) {
        X();
        U();
      } else {
        this.u.flush();
        this.O = false;
      } 
      if (this.L && this.r != null)
        this.M = 1; 
    } 
  }
  
  protected void D(boolean paramBoolean) {
    this.U = new ae2();
  }
  
  protected void E() {
    this.r = null;
    try {
      X();
    } finally {
      Exception exception = null;
    } 
  }
  
  protected abstract void H(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat);
  
  protected abstract int I(kg2 paramkg2, zzht paramzzht);
  
  protected jg2 J(kg2 paramkg2, zzht paramzzht, boolean paramBoolean) {
    return paramkg2.b(paramzzht.g, paramBoolean);
  }
  
  protected void K(ce2 paramce2) {}
  
  protected abstract void L(jg2 paramjg2, MediaCodec paramMediaCodec, zzht paramzzht, MediaCrypto paramMediaCrypto);
  
  protected abstract boolean N(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean);
  
  protected boolean O(MediaCodec paramMediaCodec, boolean paramBoolean, zzht paramzzht1, zzht paramzzht2) {
    return false;
  }
  
  protected boolean P(jg2 paramjg2) {
    return true;
  }
  
  protected abstract void Q(String paramString, long paramLong1, long paramLong2);
  
  protected void R(zzht paramzzht) {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   4: astore_2
    //   5: aload_0
    //   6: aload_1
    //   7: putfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   10: aload_1
    //   11: getfield j : Lcom/google/android/gms/internal/ads/zzjo;
    //   14: astore_3
    //   15: aload_2
    //   16: ifnonnull -> 24
    //   19: aconst_null
    //   20: astore_1
    //   21: goto -> 29
    //   24: aload_2
    //   25: getfield j : Lcom/google/android/gms/internal/ads/zzjo;
    //   28: astore_1
    //   29: aload_3
    //   30: aload_1
    //   31: invokestatic g : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   34: istore #4
    //   36: iconst_1
    //   37: istore #5
    //   39: iload #4
    //   41: iconst_1
    //   42: ixor
    //   43: ifeq -> 131
    //   46: aload_0
    //   47: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   50: getfield j : Lcom/google/android/gms/internal/ads/zzjo;
    //   53: ifnull -> 126
    //   56: aload_0
    //   57: getfield k : Lcom/google/android/gms/internal/ads/ge2;
    //   60: astore_1
    //   61: aload_1
    //   62: ifnull -> 108
    //   65: aload_1
    //   66: invokestatic myLooper : ()Landroid/os/Looper;
    //   69: aload_0
    //   70: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   73: getfield j : Lcom/google/android/gms/internal/ads/zzjo;
    //   76: invokeinterface b : (Landroid/os/Looper;Lcom/google/android/gms/internal/ads/zzjo;)Lcom/google/android/gms/internal/ads/ee2;
    //   81: astore_1
    //   82: aload_0
    //   83: aload_1
    //   84: putfield t : Lcom/google/android/gms/internal/ads/ee2;
    //   87: aload_1
    //   88: aload_0
    //   89: getfield s : Lcom/google/android/gms/internal/ads/ee2;
    //   92: if_acmpne -> 131
    //   95: aload_0
    //   96: getfield k : Lcom/google/android/gms/internal/ads/ge2;
    //   99: aload_1
    //   100: invokeinterface a : (Lcom/google/android/gms/internal/ads/ee2;)V
    //   105: goto -> 131
    //   108: new java/lang/IllegalStateException
    //   111: dup
    //   112: ldc_w 'Media requires a DrmSessionManager'
    //   115: invokespecial <init> : (Ljava/lang/String;)V
    //   118: aload_0
    //   119: invokevirtual w : ()I
    //   122: invokestatic zza : (Ljava/lang/Exception;I)Lcom/google/android/gms/internal/ads/zzhe;
    //   125: athrow
    //   126: aload_0
    //   127: aconst_null
    //   128: putfield t : Lcom/google/android/gms/internal/ads/ee2;
    //   131: aload_0
    //   132: getfield t : Lcom/google/android/gms/internal/ads/ee2;
    //   135: aload_0
    //   136: getfield s : Lcom/google/android/gms/internal/ads/ee2;
    //   139: if_acmpne -> 228
    //   142: aload_0
    //   143: getfield u : Landroid/media/MediaCodec;
    //   146: astore_1
    //   147: aload_1
    //   148: ifnull -> 228
    //   151: aload_0
    //   152: aload_1
    //   153: aload_0
    //   154: getfield v : Lcom/google/android/gms/internal/ads/jg2;
    //   157: getfield b : Z
    //   160: aload_2
    //   161: aload_0
    //   162: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   165: invokevirtual O : (Landroid/media/MediaCodec;ZLcom/google/android/gms/internal/ads/zzht;Lcom/google/android/gms/internal/ads/zzht;)Z
    //   168: ifeq -> 228
    //   171: aload_0
    //   172: iconst_1
    //   173: putfield L : Z
    //   176: aload_0
    //   177: iconst_1
    //   178: putfield M : I
    //   181: aload_0
    //   182: getfield y : Z
    //   185: ifeq -> 218
    //   188: aload_0
    //   189: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   192: astore_1
    //   193: aload_1
    //   194: getfield k : I
    //   197: aload_2
    //   198: getfield k : I
    //   201: if_icmpne -> 218
    //   204: aload_1
    //   205: getfield l : I
    //   208: aload_2
    //   209: getfield l : I
    //   212: if_icmpne -> 218
    //   215: goto -> 221
    //   218: iconst_0
    //   219: istore #5
    //   221: aload_0
    //   222: iload #5
    //   224: putfield D : Z
    //   227: return
    //   228: aload_0
    //   229: getfield O : Z
    //   232: ifeq -> 241
    //   235: aload_0
    //   236: iconst_1
    //   237: putfield N : I
    //   240: return
    //   241: aload_0
    //   242: invokevirtual X : ()V
    //   245: aload_0
    //   246: invokevirtual U : ()V
    //   249: return
  }
  
  protected void T() {}
  
  protected final void U() {
    // Byte code:
    //   0: aload_0
    //   1: getfield u : Landroid/media/MediaCodec;
    //   4: ifnonnull -> 833
    //   7: aload_0
    //   8: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnonnull -> 19
    //   16: goto -> 833
    //   19: aload_0
    //   20: getfield t : Lcom/google/android/gms/internal/ads/ee2;
    //   23: astore_2
    //   24: aload_0
    //   25: aload_2
    //   26: putfield s : Lcom/google/android/gms/internal/ads/ee2;
    //   29: aload_1
    //   30: getfield g : Ljava/lang/String;
    //   33: astore_3
    //   34: aload_2
    //   35: ifnull -> 102
    //   38: aload_2
    //   39: invokeinterface getState : ()I
    //   44: istore #4
    //   46: iload #4
    //   48: ifeq -> 85
    //   51: iload #4
    //   53: iconst_3
    //   54: if_icmpeq -> 64
    //   57: iload #4
    //   59: iconst_4
    //   60: if_icmpeq -> 64
    //   63: return
    //   64: aload_0
    //   65: getfield s : Lcom/google/android/gms/internal/ads/ee2;
    //   68: invokeinterface a : ()Lcom/google/android/gms/internal/ads/ie2;
    //   73: checkcast com/google/android/gms/internal/ads/he2
    //   76: astore_3
    //   77: new java/lang/NoSuchMethodError
    //   80: dup
    //   81: invokespecial <init> : ()V
    //   84: athrow
    //   85: aload_0
    //   86: getfield s : Lcom/google/android/gms/internal/ads/ee2;
    //   89: invokeinterface b : ()Lcom/google/android/gms/internal/ads/zzju;
    //   94: aload_0
    //   95: invokevirtual w : ()I
    //   98: invokestatic zza : (Ljava/lang/Exception;I)Lcom/google/android/gms/internal/ads/zzhe;
    //   101: athrow
    //   102: aload_0
    //   103: getfield v : Lcom/google/android/gms/internal/ads/jg2;
    //   106: ifnonnull -> 174
    //   109: aload_0
    //   110: aload_0
    //   111: aload_0
    //   112: getfield j : Lcom/google/android/gms/internal/ads/kg2;
    //   115: aload_1
    //   116: iconst_0
    //   117: invokevirtual J : (Lcom/google/android/gms/internal/ads/kg2;Lcom/google/android/gms/internal/ads/zzht;Z)Lcom/google/android/gms/internal/ads/jg2;
    //   120: putfield v : Lcom/google/android/gms/internal/ads/jg2;
    //   123: goto -> 147
    //   126: astore_3
    //   127: aload_0
    //   128: new com/google/android/gms/internal/ads/zzly
    //   131: dup
    //   132: aload_0
    //   133: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   136: aload_3
    //   137: iconst_0
    //   138: ldc_w -49998
    //   141: invokespecial <init> : (Lcom/google/android/gms/internal/ads/zzht;Ljava/lang/Throwable;ZI)V
    //   144: invokespecial M : (Lcom/google/android/gms/internal/ads/zzly;)V
    //   147: aload_0
    //   148: getfield v : Lcom/google/android/gms/internal/ads/jg2;
    //   151: ifnonnull -> 174
    //   154: aload_0
    //   155: new com/google/android/gms/internal/ads/zzly
    //   158: dup
    //   159: aload_0
    //   160: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   163: aconst_null
    //   164: iconst_0
    //   165: ldc_w -49999
    //   168: invokespecial <init> : (Lcom/google/android/gms/internal/ads/zzht;Ljava/lang/Throwable;ZI)V
    //   171: invokespecial M : (Lcom/google/android/gms/internal/ads/zzly;)V
    //   174: aload_0
    //   175: aload_0
    //   176: getfield v : Lcom/google/android/gms/internal/ads/jg2;
    //   179: invokevirtual P : (Lcom/google/android/gms/internal/ads/jg2;)Z
    //   182: ifne -> 186
    //   185: return
    //   186: aload_0
    //   187: getfield v : Lcom/google/android/gms/internal/ads/jg2;
    //   190: getfield a : Ljava/lang/String;
    //   193: astore_1
    //   194: aload_0
    //   195: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   198: astore_3
    //   199: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   202: istore #4
    //   204: iload #4
    //   206: bipush #21
    //   208: if_icmpge -> 239
    //   211: aload_3
    //   212: getfield i : Ljava/util/List;
    //   215: invokeinterface isEmpty : ()Z
    //   220: ifeq -> 239
    //   223: ldc_w 'OMX.MTK.VIDEO.DECODER.AVC'
    //   226: aload_1
    //   227: invokevirtual equals : (Ljava/lang/Object;)Z
    //   230: ifeq -> 239
    //   233: iconst_1
    //   234: istore #5
    //   236: goto -> 242
    //   239: iconst_0
    //   240: istore #5
    //   242: aload_0
    //   243: iload #5
    //   245: putfield w : Z
    //   248: iload #4
    //   250: bipush #18
    //   252: if_icmplt -> 330
    //   255: iload #4
    //   257: bipush #18
    //   259: if_icmpne -> 282
    //   262: ldc_w 'OMX.SEC.avc.dec'
    //   265: aload_1
    //   266: invokevirtual equals : (Ljava/lang/Object;)Z
    //   269: ifne -> 330
    //   272: ldc_w 'OMX.SEC.avc.dec.secure'
    //   275: aload_1
    //   276: invokevirtual equals : (Ljava/lang/Object;)Z
    //   279: ifne -> 330
    //   282: iload #4
    //   284: bipush #19
    //   286: if_icmpne -> 324
    //   289: getstatic com/google/android/gms/internal/ads/wj2.d : Ljava/lang/String;
    //   292: ldc_w 'SM-G800'
    //   295: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   298: ifeq -> 324
    //   301: ldc_w 'OMX.Exynos.avc.dec'
    //   304: aload_1
    //   305: invokevirtual equals : (Ljava/lang/Object;)Z
    //   308: ifne -> 330
    //   311: ldc_w 'OMX.Exynos.avc.dec.secure'
    //   314: aload_1
    //   315: invokevirtual equals : (Ljava/lang/Object;)Z
    //   318: ifeq -> 324
    //   321: goto -> 330
    //   324: iconst_0
    //   325: istore #5
    //   327: goto -> 333
    //   330: iconst_1
    //   331: istore #5
    //   333: aload_0
    //   334: iload #5
    //   336: putfield x : Z
    //   339: iload #4
    //   341: bipush #24
    //   343: if_icmpge -> 416
    //   346: ldc_w 'OMX.Nvidia.h264.decode'
    //   349: aload_1
    //   350: invokevirtual equals : (Ljava/lang/Object;)Z
    //   353: ifne -> 366
    //   356: ldc_w 'OMX.Nvidia.h264.decode.secure'
    //   359: aload_1
    //   360: invokevirtual equals : (Ljava/lang/Object;)Z
    //   363: ifeq -> 416
    //   366: getstatic com/google/android/gms/internal/ads/wj2.b : Ljava/lang/String;
    //   369: astore_3
    //   370: ldc_w 'flounder'
    //   373: aload_3
    //   374: invokevirtual equals : (Ljava/lang/Object;)Z
    //   377: ifne -> 410
    //   380: ldc_w 'flounder_lte'
    //   383: aload_3
    //   384: invokevirtual equals : (Ljava/lang/Object;)Z
    //   387: ifne -> 410
    //   390: ldc_w 'grouper'
    //   393: aload_3
    //   394: invokevirtual equals : (Ljava/lang/Object;)Z
    //   397: ifne -> 410
    //   400: ldc_w 'tilapia'
    //   403: aload_3
    //   404: invokevirtual equals : (Ljava/lang/Object;)Z
    //   407: ifeq -> 416
    //   410: iconst_1
    //   411: istore #5
    //   413: goto -> 419
    //   416: iconst_0
    //   417: istore #5
    //   419: aload_0
    //   420: iload #5
    //   422: putfield y : Z
    //   425: iload #4
    //   427: bipush #17
    //   429: if_icmpgt -> 458
    //   432: ldc_w 'OMX.rk.video_decoder.avc'
    //   435: aload_1
    //   436: invokevirtual equals : (Ljava/lang/Object;)Z
    //   439: ifne -> 452
    //   442: ldc_w 'OMX.allwinner.video.decoder.avc'
    //   445: aload_1
    //   446: invokevirtual equals : (Ljava/lang/Object;)Z
    //   449: ifeq -> 458
    //   452: iconst_1
    //   453: istore #5
    //   455: goto -> 461
    //   458: iconst_0
    //   459: istore #5
    //   461: aload_0
    //   462: iload #5
    //   464: putfield z : Z
    //   467: iload #4
    //   469: bipush #23
    //   471: if_icmpgt -> 484
    //   474: ldc_w 'OMX.google.vorbis.decoder'
    //   477: aload_1
    //   478: invokevirtual equals : (Ljava/lang/Object;)Z
    //   481: ifne -> 523
    //   484: iload #4
    //   486: bipush #19
    //   488: if_icmpgt -> 529
    //   491: ldc_w 'hb2000'
    //   494: getstatic com/google/android/gms/internal/ads/wj2.b : Ljava/lang/String;
    //   497: invokevirtual equals : (Ljava/lang/Object;)Z
    //   500: ifeq -> 529
    //   503: ldc_w 'OMX.amlogic.avc.decoder.awesome'
    //   506: aload_1
    //   507: invokevirtual equals : (Ljava/lang/Object;)Z
    //   510: ifne -> 523
    //   513: ldc_w 'OMX.amlogic.avc.decoder.awesome.secure'
    //   516: aload_1
    //   517: invokevirtual equals : (Ljava/lang/Object;)Z
    //   520: ifeq -> 529
    //   523: iconst_1
    //   524: istore #5
    //   526: goto -> 532
    //   529: iconst_0
    //   530: istore #5
    //   532: aload_0
    //   533: iload #5
    //   535: putfield A : Z
    //   538: iload #4
    //   540: bipush #21
    //   542: if_icmpne -> 561
    //   545: ldc_w 'OMX.google.aac.decoder'
    //   548: aload_1
    //   549: invokevirtual equals : (Ljava/lang/Object;)Z
    //   552: ifeq -> 561
    //   555: iconst_1
    //   556: istore #5
    //   558: goto -> 564
    //   561: iconst_0
    //   562: istore #5
    //   564: aload_0
    //   565: iload #5
    //   567: putfield B : Z
    //   570: aload_0
    //   571: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   574: astore_3
    //   575: iload #4
    //   577: bipush #18
    //   579: if_icmpgt -> 606
    //   582: aload_3
    //   583: getfield s : I
    //   586: iconst_1
    //   587: if_icmpne -> 606
    //   590: ldc_w 'OMX.MTK.AUDIO.DECODER.MP3'
    //   593: aload_1
    //   594: invokevirtual equals : (Ljava/lang/Object;)Z
    //   597: ifeq -> 606
    //   600: iconst_1
    //   601: istore #5
    //   603: goto -> 609
    //   606: iconst_0
    //   607: istore #5
    //   609: aload_0
    //   610: iload #5
    //   612: putfield C : Z
    //   615: invokestatic elapsedRealtime : ()J
    //   618: lstore #6
    //   620: aload_1
    //   621: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   624: astore_3
    //   625: aload_3
    //   626: invokevirtual length : ()I
    //   629: ifeq -> 643
    //   632: ldc_w 'createCodec:'
    //   635: aload_3
    //   636: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   639: astore_3
    //   640: goto -> 654
    //   643: new java/lang/String
    //   646: dup
    //   647: ldc_w 'createCodec:'
    //   650: invokespecial <init> : (Ljava/lang/String;)V
    //   653: astore_3
    //   654: aload_3
    //   655: invokestatic a : (Ljava/lang/String;)V
    //   658: aload_0
    //   659: aload_1
    //   660: invokestatic createByCodecName : (Ljava/lang/String;)Landroid/media/MediaCodec;
    //   663: putfield u : Landroid/media/MediaCodec;
    //   666: invokestatic b : ()V
    //   669: ldc_w 'configureCodec'
    //   672: invokestatic a : (Ljava/lang/String;)V
    //   675: aload_0
    //   676: aload_0
    //   677: getfield v : Lcom/google/android/gms/internal/ads/jg2;
    //   680: aload_0
    //   681: getfield u : Landroid/media/MediaCodec;
    //   684: aload_0
    //   685: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   688: aconst_null
    //   689: invokevirtual L : (Lcom/google/android/gms/internal/ads/jg2;Landroid/media/MediaCodec;Lcom/google/android/gms/internal/ads/zzht;Landroid/media/MediaCrypto;)V
    //   692: invokestatic b : ()V
    //   695: ldc_w 'startCodec'
    //   698: invokestatic a : (Ljava/lang/String;)V
    //   701: aload_0
    //   702: getfield u : Landroid/media/MediaCodec;
    //   705: invokevirtual start : ()V
    //   708: invokestatic b : ()V
    //   711: invokestatic elapsedRealtime : ()J
    //   714: lstore #8
    //   716: aload_0
    //   717: aload_1
    //   718: lload #8
    //   720: lload #8
    //   722: lload #6
    //   724: lsub
    //   725: invokevirtual Q : (Ljava/lang/String;JJ)V
    //   728: aload_0
    //   729: aload_0
    //   730: getfield u : Landroid/media/MediaCodec;
    //   733: invokevirtual getInputBuffers : ()[Ljava/nio/ByteBuffer;
    //   736: putfield F : [Ljava/nio/ByteBuffer;
    //   739: aload_0
    //   740: aload_0
    //   741: getfield u : Landroid/media/MediaCodec;
    //   744: invokevirtual getOutputBuffers : ()[Ljava/nio/ByteBuffer;
    //   747: putfield G : [Ljava/nio/ByteBuffer;
    //   750: goto -> 772
    //   753: astore_3
    //   754: aload_0
    //   755: new com/google/android/gms/internal/ads/zzly
    //   758: dup
    //   759: aload_0
    //   760: getfield r : Lcom/google/android/gms/internal/ads/zzht;
    //   763: aload_3
    //   764: iconst_0
    //   765: aload_1
    //   766: invokespecial <init> : (Lcom/google/android/gms/internal/ads/zzht;Ljava/lang/Throwable;ZLjava/lang/String;)V
    //   769: invokespecial M : (Lcom/google/android/gms/internal/ads/zzly;)V
    //   772: aload_0
    //   773: invokevirtual getState : ()I
    //   776: iconst_2
    //   777: if_icmpne -> 792
    //   780: invokestatic elapsedRealtime : ()J
    //   783: ldc2_w 1000
    //   786: ladd
    //   787: lstore #6
    //   789: goto -> 797
    //   792: ldc2_w -9223372036854775807
    //   795: lstore #6
    //   797: aload_0
    //   798: lload #6
    //   800: putfield H : J
    //   803: aload_0
    //   804: iconst_m1
    //   805: putfield I : I
    //   808: aload_0
    //   809: iconst_m1
    //   810: putfield J : I
    //   813: aload_0
    //   814: iconst_1
    //   815: putfield T : Z
    //   818: aload_0
    //   819: getfield U : Lcom/google/android/gms/internal/ads/ae2;
    //   822: astore_3
    //   823: aload_3
    //   824: aload_3
    //   825: getfield a : I
    //   828: iconst_1
    //   829: iadd
    //   830: putfield a : I
    //   833: return
    // Exception table:
    //   from	to	target	type
    //   109	123	126	com/google/android/gms/internal/ads/zzmd
    //   615	640	753	java/lang/Exception
    //   643	654	753	java/lang/Exception
    //   654	750	753	java/lang/Exception
  }
  
  protected final MediaCodec V() {
    return this.u;
  }
  
  protected final jg2 W() {
    return this.v;
  }
  
  protected void X() {
    this.H = -9223372036854775807L;
    this.I = -1;
    this.J = -1;
    this.S = false;
    this.K = false;
    this.p.clear();
    this.F = null;
    this.G = null;
    this.v = null;
    this.L = false;
    this.O = false;
    this.w = false;
    this.x = false;
    this.y = false;
    this.z = false;
    this.A = false;
    this.C = false;
    this.D = false;
    this.E = false;
    this.P = false;
    this.M = 0;
    this.N = 0;
    this.m.c = null;
    MediaCodec mediaCodec = this.u;
    if (mediaCodec != null) {
      ae2 ae21 = this.U;
      ae21.b++;
      try {
        mediaCodec.stop();
      } finally {
        ae21 = null;
      } 
    } 
  }
  
  public boolean b() {
    return this.R;
  }
  
  public final void h(long paramLong1, long paramLong2) {
    if (this.R) {
      T();
      return;
    } 
    if (this.r == null) {
      this.n.a();
      int i = z(this.o, this.n, true);
      if (i == -5) {
        R(this.o.a);
      } else {
        if (i == -4) {
          jj2.e(this.n.f());
          this.Q = true;
          Z();
        } 
        return;
      } 
    } 
    U();
    if (this.u != null) {
      xj2.a("drainAndFeed");
      do {
      
      } while (S(paramLong1, paramLong2));
      do {
      
      } while (Y());
      xj2.b();
    } else {
      C(paramLong1);
      this.n.a();
      int i = z(this.o, this.n, false);
      if (i == -5) {
        R(this.o.a);
      } else if (i == -4) {
        jj2.e(this.n.f());
        this.Q = true;
        Z();
      } 
    } 
    this.U.a();
  }
  
  public boolean m() {
    return (this.r != null && !this.S && (G() || this.J >= 0 || (this.H != -9223372036854775807L && SystemClock.elapsedRealtime() < this.H)));
  }
  
  public final int o() {
    return 4;
  }
  
  public final int r(zzht paramzzht) {
    try {
      return I(this.j, paramzzht);
    } catch (zzmd zzmd) {
      throw zzhe.zza(zzmd, w());
    } 
  }
  
  protected void x() {}
  
  protected void y() {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ig2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */