package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.concurrent.atomic.AtomicInteger;

public final class th2 implements ue2 {
  private final ri2 a;
  
  private final int b;
  
  private final rh2 c;
  
  private final qh2 d;
  
  private final qj2 e;
  
  private final AtomicInteger f;
  
  private sh2 g;
  
  private sh2 h;
  
  private zzht i;
  
  private boolean j;
  
  private zzht k;
  
  private long l;
  
  private int m;
  
  private vh2 n;
  
  public th2(ri2 paramri2) {
    this.a = paramri2;
    int i = paramri2.h();
    this.b = i;
    this.c = new rh2();
    this.d = new qh2();
    this.e = new qj2(32);
    this.f = new AtomicInteger();
    this.m = i;
    sh2 sh21 = new sh2(0L, i);
    this.g = sh21;
    this.h = sh21;
  }
  
  private final void g(long paramLong, byte[] paramArrayOfbyte, int paramInt) {
    k(paramLong);
    int i = 0;
    while (i < paramInt) {
      int j = (int)(paramLong - this.g.a);
      int k = Math.min(paramInt - i, this.b - j);
      si2 si2 = this.g.d;
      System.arraycopy(si2.a, j + 0, paramArrayOfbyte, i, k);
      long l = paramLong + k;
      j = i + k;
      i = j;
      paramLong = l;
      if (l == this.g.b) {
        this.a.g(si2);
        this.g = this.g.a();
        i = j;
        paramLong = l;
      } 
    } 
  }
  
  private final int i(int paramInt) {
    if (this.m == this.b) {
      this.m = 0;
      sh2 sh21 = this.h;
      if (sh21.c)
        this.h = sh21.e; 
      sh2 sh22 = this.h;
      si2 si2 = this.a.i();
      sh21 = new sh2(this.h.b, this.b);
      sh22.d = si2;
      sh22.e = sh21;
      sh22.c = true;
    } 
    return Math.min(paramInt, this.b - this.m);
  }
  
  private final void k(long paramLong) {
    while (true) {
      sh2 sh21 = this.g;
      if (paramLong >= sh21.b) {
        this.a.g(sh21.d);
        this.g = this.g.a();
        continue;
      } 
      break;
    } 
  }
  
  private final void m() {
    this.c.g();
    sh2 sh21 = this.g;
    if (sh21.c) {
      sh2 sh22 = this.h;
      int i = sh22.c + (int)(sh22.a - sh21.a) / this.b;
      si2[] arrayOfSi2 = new si2[i];
      for (byte b = 0; b < i; b++) {
        arrayOfSi2[b] = sh21.d;
        sh21 = sh21.a();
      } 
      this.a.j(arrayOfSi2);
    } 
    sh21 = new sh2(0L, this.b);
    this.g = sh21;
    this.h = sh21;
    this.l = 0L;
    this.m = this.b;
    this.a.f();
  }
  
  private final boolean r() {
    return this.f.compareAndSet(0, 1);
  }
  
  private final void s() {
    if (!this.f.compareAndSet(1, 0))
      m(); 
  }
  
  public final void a(zzht paramzzht) {
    zzht zzht1;
    if (paramzzht == null) {
      zzht1 = null;
    } else {
      zzht1 = paramzzht;
    } 
    boolean bool = this.c.e(zzht1);
    this.k = paramzzht;
    this.j = false;
    vh2 vh21 = this.n;
    if (vh21 != null && bool)
      vh21.c(zzht1); 
  }
  
  public final void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, xe2 paramxe2) {
    if (!r()) {
      this.c.d(paramLong);
      return;
    } 
    try {
      long l1 = this.l;
      long l2 = paramInt2;
      long l3 = paramInt3;
      this.c.b(paramLong, paramInt1, l1 - l2 - l3, paramInt2, paramxe2);
      return;
    } finally {
      s();
    } 
  }
  
  public final void c(qj2 paramqj2, int paramInt) {
    int i = paramInt;
    if (!r()) {
      paramqj2.m(paramInt);
      return;
    } 
    while (i > 0) {
      paramInt = i(i);
      paramqj2.p(this.h.d.a, this.m + 0, paramInt);
      this.m += paramInt;
      this.l += paramInt;
      i -= paramInt;
    } 
    s();
  }
  
  public final int d(le2 paramle2, int paramInt, boolean paramBoolean) {
    if (!r()) {
      paramInt = paramle2.f(paramInt);
      if (paramInt != -1)
        return paramInt; 
      throw new EOFException();
    } 
    try {
      paramInt = i(paramInt);
      paramInt = paramle2.read(this.h.d.a, this.m + 0, paramInt);
      if (paramInt != -1) {
        this.m += paramInt;
        this.l += paramInt;
        return paramInt;
      } 
      EOFException eOFException = new EOFException();
      this();
      throw eOFException;
    } finally {
      s();
    } 
  }
  
  public final void e() {
    if (this.f.getAndSet(2) == 0)
      m(); 
  }
  
  public final int f(nc2 paramnc2, ce2 paramce2, boolean paramBoolean1, boolean paramBoolean2, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Lcom/google/android/gms/internal/ads/rh2;
    //   4: aload_1
    //   5: aload_2
    //   6: iload_3
    //   7: iload #4
    //   9: aload_0
    //   10: getfield i : Lcom/google/android/gms/internal/ads/zzht;
    //   13: aload_0
    //   14: getfield d : Lcom/google/android/gms/internal/ads/qh2;
    //   17: invokevirtual a : (Lcom/google/android/gms/internal/ads/nc2;Lcom/google/android/gms/internal/ads/ce2;ZZLcom/google/android/gms/internal/ads/zzht;Lcom/google/android/gms/internal/ads/qh2;)I
    //   20: istore #7
    //   22: iload #7
    //   24: bipush #-5
    //   26: if_icmpeq -> 689
    //   29: iload #7
    //   31: bipush #-4
    //   33: if_icmpeq -> 54
    //   36: iload #7
    //   38: bipush #-3
    //   40: if_icmpne -> 46
    //   43: bipush #-3
    //   45: ireturn
    //   46: new java/lang/IllegalStateException
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: athrow
    //   54: aload_2
    //   55: invokevirtual f : ()Z
    //   58: ifne -> 686
    //   61: aload_2
    //   62: getfield d : J
    //   65: lload #5
    //   67: lcmp
    //   68: ifge -> 77
    //   71: aload_2
    //   72: ldc -2147483648
    //   74: invokevirtual c : (I)V
    //   77: aload_2
    //   78: invokevirtual h : ()Z
    //   81: ifeq -> 510
    //   84: aload_0
    //   85: getfield d : Lcom/google/android/gms/internal/ads/qh2;
    //   88: astore #8
    //   90: aload #8
    //   92: getfield b : J
    //   95: lstore #5
    //   97: aload_0
    //   98: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   101: iconst_1
    //   102: invokevirtual j : (I)V
    //   105: aload_0
    //   106: lload #5
    //   108: aload_0
    //   109: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   112: getfield a : [B
    //   115: iconst_1
    //   116: invokespecial g : (J[BI)V
    //   119: lload #5
    //   121: lconst_1
    //   122: ladd
    //   123: lstore #5
    //   125: aload_0
    //   126: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   129: getfield a : [B
    //   132: iconst_0
    //   133: baload
    //   134: istore #9
    //   136: iload #9
    //   138: sipush #128
    //   141: iand
    //   142: ifeq -> 151
    //   145: iconst_1
    //   146: istore #7
    //   148: goto -> 154
    //   151: iconst_0
    //   152: istore #7
    //   154: iload #9
    //   156: bipush #127
    //   158: iand
    //   159: istore #9
    //   161: aload_2
    //   162: getfield b : Lcom/google/android/gms/internal/ads/zd2;
    //   165: astore_1
    //   166: aload_1
    //   167: getfield a : [B
    //   170: ifnonnull -> 181
    //   173: aload_1
    //   174: bipush #16
    //   176: newarray byte
    //   178: putfield a : [B
    //   181: aload_0
    //   182: lload #5
    //   184: aload_1
    //   185: getfield a : [B
    //   188: iload #9
    //   190: invokespecial g : (J[BI)V
    //   193: lload #5
    //   195: iload #9
    //   197: i2l
    //   198: ladd
    //   199: lstore #5
    //   201: iload #7
    //   203: ifeq -> 248
    //   206: aload_0
    //   207: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   210: iconst_2
    //   211: invokevirtual j : (I)V
    //   214: aload_0
    //   215: lload #5
    //   217: aload_0
    //   218: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   221: getfield a : [B
    //   224: iconst_2
    //   225: invokespecial g : (J[BI)V
    //   228: lload #5
    //   230: ldc2_w 2
    //   233: ladd
    //   234: lstore #5
    //   236: aload_0
    //   237: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   240: invokevirtual h : ()I
    //   243: istore #9
    //   245: goto -> 251
    //   248: iconst_1
    //   249: istore #9
    //   251: aload_2
    //   252: getfield b : Lcom/google/android/gms/internal/ads/zd2;
    //   255: astore #10
    //   257: aload #10
    //   259: getfield d : [I
    //   262: astore #11
    //   264: aload #11
    //   266: ifnull -> 280
    //   269: aload #11
    //   271: astore_1
    //   272: aload #11
    //   274: arraylength
    //   275: iload #9
    //   277: if_icmpge -> 285
    //   280: iload #9
    //   282: newarray int
    //   284: astore_1
    //   285: aload #10
    //   287: getfield e : [I
    //   290: astore #10
    //   292: aload #10
    //   294: ifnull -> 309
    //   297: aload #10
    //   299: astore #11
    //   301: aload #10
    //   303: arraylength
    //   304: iload #9
    //   306: if_icmpge -> 315
    //   309: iload #9
    //   311: newarray int
    //   313: astore #11
    //   315: iload #7
    //   317: ifeq -> 410
    //   320: iload #9
    //   322: bipush #6
    //   324: imul
    //   325: istore #7
    //   327: aload_0
    //   328: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   331: iload #7
    //   333: invokevirtual j : (I)V
    //   336: aload_0
    //   337: lload #5
    //   339: aload_0
    //   340: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   343: getfield a : [B
    //   346: iload #7
    //   348: invokespecial g : (J[BI)V
    //   351: lload #5
    //   353: iload #7
    //   355: i2l
    //   356: ladd
    //   357: lstore #12
    //   359: aload_0
    //   360: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   363: iconst_0
    //   364: invokevirtual l : (I)V
    //   367: iconst_0
    //   368: istore #7
    //   370: lload #12
    //   372: lstore #5
    //   374: iload #7
    //   376: iload #9
    //   378: if_icmpge -> 433
    //   381: aload_1
    //   382: iload #7
    //   384: aload_0
    //   385: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   388: invokevirtual h : ()I
    //   391: iastore
    //   392: aload #11
    //   394: iload #7
    //   396: aload_0
    //   397: getfield e : Lcom/google/android/gms/internal/ads/qj2;
    //   400: invokevirtual v : ()I
    //   403: iastore
    //   404: iinc #7, 1
    //   407: goto -> 370
    //   410: aload_1
    //   411: iconst_0
    //   412: iconst_0
    //   413: iastore
    //   414: aload #11
    //   416: iconst_0
    //   417: aload #8
    //   419: getfield a : I
    //   422: lload #5
    //   424: aload #8
    //   426: getfield b : J
    //   429: lsub
    //   430: l2i
    //   431: isub
    //   432: iastore
    //   433: aload #8
    //   435: getfield d : Lcom/google/android/gms/internal/ads/xe2;
    //   438: astore #10
    //   440: aload_2
    //   441: getfield b : Lcom/google/android/gms/internal/ads/zd2;
    //   444: astore #14
    //   446: aload #14
    //   448: iload #9
    //   450: aload_1
    //   451: aload #11
    //   453: aload #10
    //   455: getfield b : [B
    //   458: aload #14
    //   460: getfield a : [B
    //   463: aload #10
    //   465: getfield a : I
    //   468: invokevirtual a : (I[I[I[B[BI)V
    //   471: aload #8
    //   473: getfield b : J
    //   476: lstore #12
    //   478: lload #5
    //   480: lload #12
    //   482: lsub
    //   483: l2i
    //   484: istore #7
    //   486: aload #8
    //   488: lload #12
    //   490: iload #7
    //   492: i2l
    //   493: ladd
    //   494: putfield b : J
    //   497: aload #8
    //   499: aload #8
    //   501: getfield a : I
    //   504: iload #7
    //   506: isub
    //   507: putfield a : I
    //   510: aload_2
    //   511: aload_0
    //   512: getfield d : Lcom/google/android/gms/internal/ads/qh2;
    //   515: getfield a : I
    //   518: invokevirtual i : (I)V
    //   521: aload_0
    //   522: getfield d : Lcom/google/android/gms/internal/ads/qh2;
    //   525: astore #11
    //   527: aload #11
    //   529: getfield b : J
    //   532: lstore #5
    //   534: aload_2
    //   535: getfield c : Ljava/nio/ByteBuffer;
    //   538: astore_1
    //   539: aload #11
    //   541: getfield a : I
    //   544: istore #7
    //   546: aload_0
    //   547: lload #5
    //   549: invokespecial k : (J)V
    //   552: iload #7
    //   554: ifle -> 675
    //   557: lload #5
    //   559: aload_0
    //   560: getfield g : Lcom/google/android/gms/internal/ads/sh2;
    //   563: getfield a : J
    //   566: lsub
    //   567: l2i
    //   568: istore #9
    //   570: iload #7
    //   572: aload_0
    //   573: getfield b : I
    //   576: iload #9
    //   578: isub
    //   579: invokestatic min : (II)I
    //   582: istore #15
    //   584: aload_0
    //   585: getfield g : Lcom/google/android/gms/internal/ads/sh2;
    //   588: getfield d : Lcom/google/android/gms/internal/ads/si2;
    //   591: astore_2
    //   592: aload_1
    //   593: aload_2
    //   594: getfield a : [B
    //   597: iload #9
    //   599: iconst_0
    //   600: iadd
    //   601: iload #15
    //   603: invokevirtual put : ([BII)Ljava/nio/ByteBuffer;
    //   606: pop
    //   607: lload #5
    //   609: iload #15
    //   611: i2l
    //   612: ladd
    //   613: lstore #12
    //   615: iload #7
    //   617: iload #15
    //   619: isub
    //   620: istore #9
    //   622: iload #9
    //   624: istore #7
    //   626: lload #12
    //   628: lstore #5
    //   630: lload #12
    //   632: aload_0
    //   633: getfield g : Lcom/google/android/gms/internal/ads/sh2;
    //   636: getfield b : J
    //   639: lcmp
    //   640: ifne -> 552
    //   643: aload_0
    //   644: getfield a : Lcom/google/android/gms/internal/ads/ri2;
    //   647: aload_2
    //   648: invokeinterface g : (Lcom/google/android/gms/internal/ads/si2;)V
    //   653: aload_0
    //   654: aload_0
    //   655: getfield g : Lcom/google/android/gms/internal/ads/sh2;
    //   658: invokevirtual a : ()Lcom/google/android/gms/internal/ads/sh2;
    //   661: putfield g : Lcom/google/android/gms/internal/ads/sh2;
    //   664: iload #9
    //   666: istore #7
    //   668: lload #12
    //   670: lstore #5
    //   672: goto -> 552
    //   675: aload_0
    //   676: aload_0
    //   677: getfield d : Lcom/google/android/gms/internal/ads/qh2;
    //   680: getfield c : J
    //   683: invokespecial k : (J)V
    //   686: bipush #-4
    //   688: ireturn
    //   689: aload_0
    //   690: aload_1
    //   691: getfield a : Lcom/google/android/gms/internal/ads/zzht;
    //   694: putfield i : Lcom/google/android/gms/internal/ads/zzht;
    //   697: bipush #-5
    //   699: ireturn
  }
  
  public final void h(vh2 paramvh2) {
    this.n = paramvh2;
  }
  
  public final boolean j(long paramLong, boolean paramBoolean) {
    paramLong = this.c.c(paramLong, paramBoolean);
    if (paramLong == -1L)
      return false; 
    k(paramLong);
    return true;
  }
  
  public final long l() {
    return this.c.f();
  }
  
  public final int n() {
    return this.c.i();
  }
  
  public final boolean o() {
    return this.c.j();
  }
  
  public final zzht p() {
    return this.c.k();
  }
  
  public final void q() {
    long l = this.c.l();
    if (l != -1L)
      k(l); 
  }
  
  public final void t(boolean paramBoolean) {
    AtomicInteger atomicInteger = this.f;
    if (paramBoolean) {
      i = 0;
    } else {
      i = 2;
    } 
    int i = atomicInteger.getAndSet(i);
    m();
    this.c.h();
    if (i == 2)
      this.i = null; 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/th2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */