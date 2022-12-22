package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1.d;
import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.o;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.mediacodec.g;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.q;
import com.google.android.exoplayer2.util.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class t extends MediaCodecRenderer implements q {
  private boolean A0;
  
  private boolean B0;
  
  private MediaFormat C0;
  
  private Format D0;
  
  private long E0;
  
  private boolean F0;
  
  private boolean G0;
  
  private long H0;
  
  private int I0;
  
  private final Context u0;
  
  private final l.a v0;
  
  private final AudioSink w0;
  
  private final long[] x0;
  
  private int y0;
  
  private boolean z0;
  
  @Deprecated
  public t(Context paramContext, f paramf, k<o> paramk, boolean paramBoolean1, boolean paramBoolean2, Handler paramHandler, l paraml, AudioSink paramAudioSink) {
    super(1, paramf, paramk, paramBoolean1, paramBoolean2, 44100.0F);
    this.u0 = paramContext.getApplicationContext();
    this.w0 = paramAudioSink;
    this.H0 = -9223372036854775807L;
    this.x0 = new long[10];
    this.v0 = new l.a(paramHandler, paraml);
    paramAudioSink.p1(new b(null));
  }
  
  private static boolean f1(String paramString) {
    if (h0.a < 24 && "OMX.SEC.aac.dec".equals(paramString) && "samsung".equals(h0.c)) {
      paramString = h0.b;
      if (paramString.startsWith("zeroflte") || paramString.startsWith("herolte") || paramString.startsWith("heroqlte"))
        return true; 
    } 
    return false;
  }
  
  private static boolean g1(String paramString) {
    if (h0.a < 21 && "OMX.SEC.mp3.dec".equals(paramString) && "samsung".equals(h0.c)) {
      paramString = h0.b;
      if (paramString.startsWith("baffin") || paramString.startsWith("grand") || paramString.startsWith("fortuna") || paramString.startsWith("gprimelte") || paramString.startsWith("j2y18lte") || paramString.startsWith("ms01"))
        return true; 
    } 
    return false;
  }
  
  private static boolean h1() {
    if (h0.a == 23) {
      String str = h0.d;
      if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str))
        return true; 
    } 
    return false;
  }
  
  private int i1(e parame, Format paramFormat) {
    if ("OMX.google.raw.decoder".equals(parame.a)) {
      int i = h0.a;
      if (i < 24 && (i != 23 || !h0.X(this.u0)))
        return -1; 
    } 
    return paramFormat.k;
  }
  
  private static int m1(Format paramFormat) {
    byte b;
    if ("audio/raw".equals(paramFormat.j)) {
      b = paramFormat.y;
    } else {
      b = 2;
    } 
    return b;
  }
  
  private void q1() {
    long l = this.w0.i1(o());
    if (l != Long.MIN_VALUE) {
      if (!this.G0)
        l = Math.max(this.E0, l); 
      this.E0 = l;
      this.G0 = false;
    } 
  }
  
  protected void A0(String paramString, long paramLong1, long paramLong2) {
    this.v0.c(paramString, paramLong1, paramLong2);
  }
  
  protected void B0(f0 paramf0) {
    super.B0(paramf0);
    Format format = paramf0.c;
    this.D0 = format;
    this.v0.f(format);
  }
  
  public q C() {
    return this;
  }
  
  protected void C0(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield C0 : Landroid/media/MediaFormat;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 31
    //   9: aload_0
    //   10: aload_1
    //   11: ldc 'channel-count'
    //   13: invokevirtual getInteger : (Ljava/lang/String;)I
    //   16: aload_1
    //   17: ldc 'mime'
    //   19: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   22: invokevirtual l1 : (ILjava/lang/String;)I
    //   25: istore_3
    //   26: aload_1
    //   27: astore_2
    //   28: goto -> 61
    //   31: aload_2
    //   32: ldc 'v-bits-per-sample'
    //   34: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   37: ifeq -> 53
    //   40: aload_2
    //   41: ldc 'v-bits-per-sample'
    //   43: invokevirtual getInteger : (Ljava/lang/String;)I
    //   46: invokestatic H : (I)I
    //   49: istore_3
    //   50: goto -> 61
    //   53: aload_0
    //   54: getfield D0 : Lcom/google/android/exoplayer2/Format;
    //   57: invokestatic m1 : (Lcom/google/android/exoplayer2/Format;)I
    //   60: istore_3
    //   61: aload_2
    //   62: ldc 'channel-count'
    //   64: invokevirtual getInteger : (Ljava/lang/String;)I
    //   67: istore #4
    //   69: aload_2
    //   70: ldc 'sample-rate'
    //   72: invokevirtual getInteger : (Ljava/lang/String;)I
    //   75: istore #5
    //   77: aload_0
    //   78: getfield A0 : Z
    //   81: ifeq -> 141
    //   84: iload #4
    //   86: bipush #6
    //   88: if_icmpne -> 141
    //   91: aload_0
    //   92: getfield D0 : Lcom/google/android/exoplayer2/Format;
    //   95: getfield w : I
    //   98: istore #6
    //   100: iload #6
    //   102: bipush #6
    //   104: if_icmpge -> 141
    //   107: iload #6
    //   109: newarray int
    //   111: astore_2
    //   112: iconst_0
    //   113: istore #6
    //   115: aload_2
    //   116: astore_1
    //   117: iload #6
    //   119: aload_0
    //   120: getfield D0 : Lcom/google/android/exoplayer2/Format;
    //   123: getfield w : I
    //   126: if_icmpge -> 143
    //   129: aload_2
    //   130: iload #6
    //   132: iload #6
    //   134: iastore
    //   135: iinc #6, 1
    //   138: goto -> 115
    //   141: aconst_null
    //   142: astore_1
    //   143: aload_0
    //   144: getfield w0 : Lcom/google/android/exoplayer2/audio/AudioSink;
    //   147: astore_2
    //   148: aload_0
    //   149: getfield D0 : Lcom/google/android/exoplayer2/Format;
    //   152: astore #7
    //   154: aload_2
    //   155: iload_3
    //   156: iload #4
    //   158: iload #5
    //   160: iconst_0
    //   161: aload_1
    //   162: aload #7
    //   164: getfield z : I
    //   167: aload #7
    //   169: getfield A : I
    //   172: invokeinterface f1 : (IIII[III)V
    //   177: return
    //   178: astore_1
    //   179: aload_0
    //   180: aload_1
    //   181: aload_0
    //   182: getfield D0 : Lcom/google/android/exoplayer2/Format;
    //   185: invokevirtual f : (Ljava/lang/Exception;Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/ExoPlaybackException;
    //   188: astore_1
    //   189: goto -> 194
    //   192: aload_1
    //   193: athrow
    //   194: goto -> 192
    // Exception table:
    //   from	to	target	type
    //   143	177	178	com/google/android/exoplayer2/audio/AudioSink$ConfigurationException
  }
  
  protected void D0(long paramLong) {
    while (this.I0 != 0 && paramLong >= this.x0[0]) {
      this.w0.l1();
      int i = this.I0 - 1;
      this.I0 = i;
      long[] arrayOfLong = this.x0;
      System.arraycopy(arrayOfLong, 1, arrayOfLong, 0, i);
    } 
  }
  
  protected void E() {
    try {
      this.H0 = -9223372036854775807L;
      this.I0 = 0;
      this.w0.flush();
    } finally {
      null = null;
    } 
  }
  
  protected void E0(e parame) {
    if (this.F0 && !parame.isDecodeOnly()) {
      if (Math.abs(parame.d - this.E0) > 500000L)
        this.E0 = parame.d; 
      this.F0 = false;
    } 
    this.H0 = Math.max(parame.d, this.H0);
  }
  
  protected void F(boolean paramBoolean) {
    super.F(paramBoolean);
    this.v0.e(this.t0);
    int i = (g()).b;
    if (i != 0) {
      this.w0.o1(i);
    } else {
      this.w0.j1();
    } 
  }
  
  protected void G(long paramLong, boolean paramBoolean) {
    super.G(paramLong, paramBoolean);
    this.w0.flush();
    this.E0 = paramLong;
    this.F0 = true;
    this.G0 = true;
    this.H0 = -9223372036854775807L;
    this.I0 = 0;
  }
  
  protected boolean G0(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, Format paramFormat) {
    d d;
    paramLong1 = paramLong3;
    if (this.B0) {
      paramLong1 = paramLong3;
      if (paramLong3 == 0L) {
        paramLong1 = paramLong3;
        if ((paramInt2 & 0x4) != 0) {
          paramLong2 = this.H0;
          paramLong1 = paramLong3;
          if (paramLong2 != -9223372036854775807L)
            paramLong1 = paramLong2; 
        } 
      } 
    } 
    if (this.z0 && (paramInt2 & 0x2) != 0) {
      paramMediaCodec.releaseOutputBuffer(paramInt1, false);
      return true;
    } 
    if (paramBoolean1) {
      paramMediaCodec.releaseOutputBuffer(paramInt1, false);
      d = this.t0;
      d.f++;
      this.w0.l1();
      return true;
    } 
    try {
      if (this.w0.n1(paramByteBuffer, paramLong1)) {
        d.releaseOutputBuffer(paramInt1, false);
        d = this.t0;
        d.e++;
        return true;
      } 
      return false;
    } catch (InitializationException initializationException) {
    
    } catch (WriteException writeException) {}
    throw f(writeException, this.D0);
  }
  
  protected void H() {
    try {
      super.H();
      return;
    } finally {
      this.w0.a();
    } 
  }
  
  protected void I() {
    super.I();
    this.w0.c1();
  }
  
  protected void J() {
    q1();
    this.w0.pause();
    super.J();
  }
  
  protected void K(Format[] paramArrayOfFormat, long paramLong) {
    super.K(paramArrayOfFormat, paramLong);
    if (this.H0 != -9223372036854775807L) {
      int i = this.I0;
      if (i == this.x0.length) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Too many stream changes, so dropping change at ");
        stringBuilder.append(this.x0[this.I0 - 1]);
        o.f("MediaCodecAudioRenderer", stringBuilder.toString());
      } else {
        this.I0 = i + 1;
      } 
      this.x0[this.I0 - 1] = this.H0;
    } 
  }
  
  protected void M0() {
    try {
      this.w0.g1();
      return;
    } catch (WriteException writeException) {
      throw f(writeException, this.D0);
    } 
  }
  
  protected int O(MediaCodec paramMediaCodec, e parame, Format paramFormat1, Format paramFormat2) {
    if (i1(parame, paramFormat2) <= this.y0 && paramFormat1.z == 0 && paramFormat1.A == 0 && paramFormat2.z == 0 && paramFormat2.A == 0) {
      if (parame.o(paramFormat1, paramFormat2, true))
        return 3; 
      if (e1(paramFormat1, paramFormat2))
        return 1; 
    } 
    return 0;
  }
  
  public l0 W() {
    return this.w0.W();
  }
  
  protected int W0(f paramf, k<o> paramk, Format paramFormat) {
    boolean bool;
    String str = paramFormat.j;
    if (!r.l(str))
      return s0.a(0); 
    if (h0.a >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    if (paramFormat.m == null || o.class.equals(paramFormat.D) || (paramFormat.D == null && u.N(paramk, paramFormat.m))) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    byte b2 = 8;
    byte b3 = 4;
    if (b1 && c1(paramFormat.w, str) && paramf.a() != null)
      return s0.b(4, 8, bool); 
    if (("audio/raw".equals(str) && !this.w0.e1(paramFormat.w, paramFormat.y)) || !this.w0.e1(paramFormat.w, 2))
      return s0.a(1); 
    List<e> list = m0(paramf, paramFormat, false);
    if (list.isEmpty())
      return s0.a(1); 
    if (!b1)
      return s0.a(2); 
    e e = list.get(0);
    boolean bool1 = e.l(paramFormat);
    byte b1 = b2;
    if (bool1) {
      b1 = b2;
      if (e.n(paramFormat))
        b1 = 16; 
    } 
    if (!bool1)
      b3 = 3; 
    return s0.b(b3, b1, bool);
  }
  
  protected void Y(e parame, MediaCodec paramMediaCodec, Format paramFormat, MediaCrypto paramMediaCrypto, float paramFloat) {
    String str;
    this.y0 = j1(parame, paramFormat, j());
    this.A0 = f1(parame.a);
    this.B0 = g1(parame.a);
    boolean bool = parame.h;
    this.z0 = bool;
    if (bool) {
      str = "audio/raw";
    } else {
      str = ((e)str).c;
    } 
    MediaFormat mediaFormat = k1(paramFormat, str, this.y0, paramFloat);
    paramMediaCodec.configure(mediaFormat, null, paramMediaCrypto, 0);
    if (this.z0) {
      this.C0 = mediaFormat;
      mediaFormat.setString("mime", paramFormat.j);
    } else {
      this.C0 = null;
    } 
  }
  
  public long c() {
    if (getState() == 2)
      q1(); 
    return this.E0;
  }
  
  protected boolean c1(int paramInt, String paramString) {
    boolean bool;
    if (l1(paramInt, paramString) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void d1(l0 paraml0) {
    this.w0.d1(paraml0);
  }
  
  public void e(int paramInt, Object paramObject) {
    if (paramInt != 2) {
      if (paramInt != 3) {
        if (paramInt != 5) {
          super.e(paramInt, paramObject);
        } else {
          paramObject = paramObject;
          this.w0.q1((o)paramObject);
        } 
      } else {
        paramObject = paramObject;
        this.w0.k1((i)paramObject);
      } 
    } else {
      this.w0.m1(((Float)paramObject).floatValue());
    } 
  }
  
  protected boolean e1(Format paramFormat1, Format paramFormat2) {
    boolean bool;
    if (h0.b(paramFormat1.j, paramFormat2.j) && paramFormat1.w == paramFormat2.w && paramFormat1.x == paramFormat2.x && paramFormat1.y == paramFormat2.y && paramFormat1.G(paramFormat2) && !"audio/opus".equals(paramFormat1.j)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected int j1(e parame, Format paramFormat, Format[] paramArrayOfFormat) {
    int i = i1(parame, paramFormat);
    if (paramArrayOfFormat.length == 1)
      return i; 
    int j = paramArrayOfFormat.length;
    byte b = 0;
    while (b < j) {
      Format format = paramArrayOfFormat[b];
      int k = i;
      if (parame.o(paramFormat, format, false))
        k = Math.max(i, i1(parame, format)); 
      b++;
      i = k;
    } 
    return i;
  }
  
  @SuppressLint({"InlinedApi"})
  protected MediaFormat k1(Format paramFormat, String paramString, int paramInt, float paramFloat) {
    MediaFormat mediaFormat = new MediaFormat();
    mediaFormat.setString("mime", paramString);
    mediaFormat.setInteger("channel-count", paramFormat.w);
    mediaFormat.setInteger("sample-rate", paramFormat.x);
    g.e(mediaFormat, paramFormat.l);
    g.d(mediaFormat, "max-input-size", paramInt);
    paramInt = h0.a;
    if (paramInt >= 23) {
      mediaFormat.setInteger("priority", 0);
      if (paramFloat != -1.0F && !h1())
        mediaFormat.setFloat("operating-rate", paramFloat); 
    } 
    if (paramInt <= 28 && "audio/ac4".equals(paramFormat.j))
      mediaFormat.setInteger("ac4-is-sync", 1); 
    return mediaFormat;
  }
  
  protected float l0(float paramFloat, Format paramFormat, Format[] paramArrayOfFormat) {
    int i = paramArrayOfFormat.length;
    byte b = 0;
    int j;
    for (j = -1; b < i; j = m) {
      int k = (paramArrayOfFormat[b]).x;
      int m = j;
      if (k != -1)
        m = Math.max(j, k); 
      b++;
    } 
    if (j == -1) {
      paramFloat = -1.0F;
    } else {
      paramFloat *= j;
    } 
    return paramFloat;
  }
  
  protected int l1(int paramInt, String paramString) {
    String str = paramString;
    if ("audio/eac3-joc".equals(paramString)) {
      if (this.w0.e1(-1, 18))
        return r.d("audio/eac3-joc"); 
      str = "audio/eac3";
    } 
    int i = r.d(str);
    return this.w0.e1(paramInt, i) ? i : 0;
  }
  
  public boolean m() {
    return (this.w0.h1() || super.m());
  }
  
  protected List<e> m0(f paramf, Format paramFormat, boolean paramBoolean) {
    String str = paramFormat.j;
    if (str == null)
      return Collections.emptyList(); 
    if (c1(paramFormat.w, str)) {
      e e = paramf.a();
      if (e != null)
        return Collections.singletonList(e); 
    } 
    List<?> list2 = MediaCodecUtil.l(paramf.b(str, paramBoolean, false), paramFormat);
    List<?> list1 = list2;
    if ("audio/eac3-joc".equals(str)) {
      list1 = new ArrayList(list2);
      list1.addAll(paramf.b("audio/eac3", paramBoolean, false));
    } 
    return (List)Collections.unmodifiableList(list1);
  }
  
  protected void n1(int paramInt) {}
  
  public boolean o() {
    boolean bool;
    if (super.o() && this.w0.o()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected void o1() {}
  
  protected void p1(int paramInt, long paramLong1, long paramLong2) {}
  
  private final class b implements AudioSink.a {
    private b(t this$0) {}
    
    public void a(int param1Int) {
      t.a1(this.a).a(param1Int);
      this.a.n1(param1Int);
    }
    
    public void b(int param1Int, long param1Long1, long param1Long2) {
      t.a1(this.a).b(param1Int, param1Long1, param1Long2);
      this.a.p1(param1Int, param1Long1, param1Long2);
    }
    
    public void c() {
      this.a.o1();
      t.b1(this.a, true);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */