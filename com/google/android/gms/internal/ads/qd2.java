package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class qd2 extends ig2 implements nj2 {
  private final bd2 V;
  
  private final kd2 W;
  
  private boolean X;
  
  private boolean Y;
  
  private MediaFormat Z;
  
  private int a0;
  
  private int b0;
  
  private long c0;
  
  private boolean d0;
  
  public qd2(kg2 paramkg2, Handler paramHandler, cd2 paramcd2) {
    this(paramkg2, null, true, paramHandler, paramcd2);
  }
  
  private qd2(kg2 paramkg2, ge2<he2> paramge2, boolean paramBoolean, Handler paramHandler, cd2 paramcd2) {
    this(paramkg2, null, true, paramHandler, paramcd2, null, new ad2[0]);
  }
  
  private qd2(kg2 paramkg2, ge2<he2> paramge2, boolean paramBoolean, Handler paramHandler, cd2 paramcd2, yc2 paramyc2, ad2... paramVarArgs) {
    super(1, paramkg2, null, true);
    this.W = new kd2(null, paramVarArgs, new sd2(this, null));
    this.V = new bd2(paramHandler, paramcd2);
  }
  
  private final boolean c0(String paramString) {
    return false;
  }
  
  protected static void d0(int paramInt, long paramLong1, long paramLong2) {}
  
  protected static void e0() {}
  
  protected static void f0(int paramInt) {}
  
  protected final void A(long paramLong, boolean paramBoolean) {
    super.A(paramLong, paramBoolean);
    this.W.e();
    this.c0 = paramLong;
    this.d0 = true;
  }
  
  protected final void D(boolean paramBoolean) {
    super.D(paramBoolean);
    this.V.c(this.U);
    int i = (F()).b;
    this.W.w();
  }
  
  protected final void E() {
    try {
      this.W.d();
    } finally {
      null = null;
    } 
  }
  
  protected final void H(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Z : Landroid/media/MediaFormat;
    //   4: astore_1
    //   5: iconst_0
    //   6: istore_3
    //   7: aload_1
    //   8: ifnull -> 17
    //   11: iconst_1
    //   12: istore #4
    //   14: goto -> 20
    //   17: iconst_0
    //   18: istore #4
    //   20: iload #4
    //   22: ifeq -> 35
    //   25: aload_1
    //   26: ldc 'mime'
    //   28: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   31: astore_1
    //   32: goto -> 38
    //   35: ldc 'audio/raw'
    //   37: astore_1
    //   38: iload #4
    //   40: ifeq -> 48
    //   43: aload_0
    //   44: getfield Z : Landroid/media/MediaFormat;
    //   47: astore_2
    //   48: aload_2
    //   49: ldc 'channel-count'
    //   51: invokevirtual getInteger : (Ljava/lang/String;)I
    //   54: istore #5
    //   56: aload_2
    //   57: ldc 'sample-rate'
    //   59: invokevirtual getInteger : (Ljava/lang/String;)I
    //   62: istore #6
    //   64: aload_0
    //   65: getfield Y : Z
    //   68: ifeq -> 125
    //   71: iload #5
    //   73: bipush #6
    //   75: if_icmpne -> 125
    //   78: aload_0
    //   79: getfield b0 : I
    //   82: istore #4
    //   84: iload #4
    //   86: bipush #6
    //   88: if_icmpge -> 125
    //   91: iload #4
    //   93: newarray int
    //   95: astore #7
    //   97: iload_3
    //   98: istore #4
    //   100: aload #7
    //   102: astore_2
    //   103: iload #4
    //   105: aload_0
    //   106: getfield b0 : I
    //   109: if_icmpge -> 127
    //   112: aload #7
    //   114: iload #4
    //   116: iload #4
    //   118: iastore
    //   119: iinc #4, 1
    //   122: goto -> 100
    //   125: aconst_null
    //   126: astore_2
    //   127: aload_0
    //   128: getfield W : Lcom/google/android/gms/internal/ads/kd2;
    //   131: aload_1
    //   132: iload #5
    //   134: iload #6
    //   136: aload_0
    //   137: getfield a0 : I
    //   140: iconst_0
    //   141: aload_2
    //   142: invokevirtual i : (Ljava/lang/String;IIII[I)V
    //   145: return
    //   146: astore_1
    //   147: aload_1
    //   148: aload_0
    //   149: invokevirtual w : ()I
    //   152: invokestatic zza : (Ljava/lang/Exception;I)Lcom/google/android/gms/internal/ads/zzhe;
    //   155: astore_1
    //   156: goto -> 161
    //   159: aload_1
    //   160: athrow
    //   161: goto -> 159
    // Exception table:
    //   from	to	target	type
    //   127	145	146	com/google/android/gms/internal/ads/zzix
  }
  
  protected final int I(kg2 paramkg2, zzht paramzzht) {
    // Byte code:
    //   0: aload_2
    //   1: getfield g : Ljava/lang/String;
    //   4: astore_3
    //   5: aload_3
    //   6: invokestatic a : (Ljava/lang/String;)Z
    //   9: istore #4
    //   11: iconst_0
    //   12: istore #5
    //   14: iload #4
    //   16: ifne -> 21
    //   19: iconst_0
    //   20: ireturn
    //   21: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   24: istore #6
    //   26: iload #6
    //   28: bipush #21
    //   30: if_icmplt -> 40
    //   33: bipush #16
    //   35: istore #7
    //   37: goto -> 43
    //   40: iconst_0
    //   41: istore #7
    //   43: aload_0
    //   44: aload_3
    //   45: invokespecial c0 : (Ljava/lang/String;)Z
    //   48: istore #4
    //   50: iconst_3
    //   51: istore #8
    //   53: iload #4
    //   55: ifeq -> 74
    //   58: aload_1
    //   59: invokeinterface a : ()Lcom/google/android/gms/internal/ads/jg2;
    //   64: ifnull -> 74
    //   67: iload #7
    //   69: iconst_4
    //   70: ior
    //   71: iconst_3
    //   72: ior
    //   73: ireturn
    //   74: aload_1
    //   75: aload_3
    //   76: iconst_0
    //   77: invokeinterface b : (Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/jg2;
    //   82: astore_1
    //   83: aload_1
    //   84: ifnonnull -> 89
    //   87: iconst_1
    //   88: ireturn
    //   89: iload #6
    //   91: bipush #21
    //   93: if_icmplt -> 146
    //   96: aload_2
    //   97: getfield t : I
    //   100: istore #9
    //   102: iload #9
    //   104: iconst_m1
    //   105: if_icmpeq -> 121
    //   108: iload #5
    //   110: istore #6
    //   112: aload_1
    //   113: iload #9
    //   115: invokevirtual d : (I)Z
    //   118: ifeq -> 149
    //   121: aload_2
    //   122: getfield s : I
    //   125: istore #9
    //   127: iload #9
    //   129: iconst_m1
    //   130: if_icmpeq -> 146
    //   133: iload #5
    //   135: istore #6
    //   137: aload_1
    //   138: iload #9
    //   140: invokevirtual e : (I)Z
    //   143: ifeq -> 149
    //   146: iconst_1
    //   147: istore #6
    //   149: iload #6
    //   151: ifeq -> 161
    //   154: iload #8
    //   156: istore #6
    //   158: goto -> 164
    //   161: iconst_2
    //   162: istore #6
    //   164: iload #7
    //   166: iconst_4
    //   167: ior
    //   168: iload #6
    //   170: ior
    //   171: ireturn
  }
  
  protected final jg2 J(kg2 paramkg2, zzht paramzzht, boolean paramBoolean) {
    if (c0(paramzzht.g)) {
      jg2 jg2 = paramkg2.a();
      if (jg2 != null) {
        this.X = true;
        return jg2;
      } 
    } 
    this.X = false;
    return super.J(paramkg2, paramzzht, paramBoolean);
  }
  
  protected final void L(jg2 paramjg2, MediaCodec paramMediaCodec, zzht paramzzht, MediaCrypto paramMediaCrypto) {
    // Byte code:
    //   0: aload_1
    //   1: getfield a : Ljava/lang/String;
    //   4: astore_1
    //   5: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   8: bipush #24
    //   10: if_icmpge -> 70
    //   13: ldc 'OMX.SEC.aac.dec'
    //   15: aload_1
    //   16: invokevirtual equals : (Ljava/lang/Object;)Z
    //   19: ifeq -> 70
    //   22: ldc 'samsung'
    //   24: getstatic com/google/android/gms/internal/ads/wj2.c : Ljava/lang/String;
    //   27: invokevirtual equals : (Ljava/lang/Object;)Z
    //   30: ifeq -> 70
    //   33: getstatic com/google/android/gms/internal/ads/wj2.b : Ljava/lang/String;
    //   36: astore_1
    //   37: aload_1
    //   38: ldc 'zeroflte'
    //   40: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   43: ifne -> 64
    //   46: aload_1
    //   47: ldc 'herolte'
    //   49: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   52: ifne -> 64
    //   55: aload_1
    //   56: ldc 'heroqlte'
    //   58: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   61: ifeq -> 70
    //   64: iconst_1
    //   65: istore #5
    //   67: goto -> 73
    //   70: iconst_0
    //   71: istore #5
    //   73: aload_0
    //   74: iload #5
    //   76: putfield Y : Z
    //   79: aload_0
    //   80: getfield X : Z
    //   83: ifeq -> 129
    //   86: aload_3
    //   87: invokevirtual p : ()Landroid/media/MediaFormat;
    //   90: astore_1
    //   91: aload_0
    //   92: aload_1
    //   93: putfield Z : Landroid/media/MediaFormat;
    //   96: aload_1
    //   97: ldc 'mime'
    //   99: ldc 'audio/raw'
    //   101: invokevirtual setString : (Ljava/lang/String;Ljava/lang/String;)V
    //   104: aload_2
    //   105: aload_0
    //   106: getfield Z : Landroid/media/MediaFormat;
    //   109: aconst_null
    //   110: aconst_null
    //   111: iconst_0
    //   112: invokevirtual configure : (Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   115: aload_0
    //   116: getfield Z : Landroid/media/MediaFormat;
    //   119: ldc 'mime'
    //   121: aload_3
    //   122: getfield g : Ljava/lang/String;
    //   125: invokevirtual setString : (Ljava/lang/String;Ljava/lang/String;)V
    //   128: return
    //   129: aload_2
    //   130: aload_3
    //   131: invokevirtual p : ()Landroid/media/MediaFormat;
    //   134: aconst_null
    //   135: aconst_null
    //   136: iconst_0
    //   137: invokevirtual configure : (Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   140: aload_0
    //   141: aconst_null
    //   142: putfield Z : Landroid/media/MediaFormat;
    //   145: return
  }
  
  protected final boolean N(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean) {
    ae2 ae2;
    if (this.X && (paramInt2 & 0x2) != 0) {
      paramMediaCodec.releaseOutputBuffer(paramInt1, false);
      return true;
    } 
    if (paramBoolean) {
      paramMediaCodec.releaseOutputBuffer(paramInt1, false);
      ae2 = this.U;
      ae2.e++;
      this.W.r();
      return true;
    } 
    try {
      if (this.W.k(paramByteBuffer, paramLong3)) {
        ae2.releaseOutputBuffer(paramInt1, false);
        ae2 = this.U;
        ae2.d++;
        return true;
      } 
      return false;
    } catch (zziw zziw) {
    
    } catch (zzjb zzjb) {}
    throw zzhe.zza(zzjb, w());
  }
  
  protected final void Q(String paramString, long paramLong1, long paramLong2) {
    this.V.d(paramString, paramLong1, paramLong2);
  }
  
  protected final void R(zzht paramzzht) {
    byte b;
    super.R(paramzzht);
    this.V.e(paramzzht);
    if ("audio/raw".equals(paramzzht.g)) {
      b = paramzzht.u;
    } else {
      b = 2;
    } 
    this.a0 = b;
    this.b0 = paramzzht.s;
  }
  
  protected final void T() {
    try {
      this.W.s();
      return;
    } catch (zzjb zzjb) {
      throw zzhe.zza(zzjb, w());
    } 
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramInt != 2) {
      if (paramInt != 3) {
        super.a(paramInt, paramObject);
        return;
      } 
      paramInt = ((Integer)paramObject).intValue();
      this.W.f(paramInt);
      return;
    } 
    this.W.g(((Float)paramObject).floatValue());
  }
  
  public final boolean b() {
    return (super.b() && this.W.p());
  }
  
  public final nj2 i() {
    return this;
  }
  
  public final qc2 k(qc2 paramqc2) {
    return this.W.j(paramqc2);
  }
  
  public final qc2 l() {
    return this.W.v();
  }
  
  public final boolean m() {
    return (this.W.u() || super.m());
  }
  
  public final long s() {
    long l = this.W.B(super.b());
    if (l != Long.MIN_VALUE) {
      if (!this.d0)
        l = Math.max(this.c0, l); 
      this.c0 = l;
      this.d0 = false;
    } 
    return this.c0;
  }
  
  protected final void x() {
    super.x();
    this.W.c();
  }
  
  protected final void y() {
    this.W.b();
    super.y();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */