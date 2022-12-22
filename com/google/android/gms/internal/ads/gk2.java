package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class gk2 extends ig2 {
  private static final int[] V = new int[] { 1920, 1600, 1440, 1280, 960, 854, 640, 540, 480 };
  
  private long A0;
  
  private int B0;
  
  private final Context W;
  
  private final kk2 X;
  
  private final lk2 Y;
  
  private final long Z = 0L;
  
  private final int a0 = -1;
  
  private final boolean b0;
  
  private final long[] c0;
  
  private zzht[] d0;
  
  private ik2 e0;
  
  private Surface f0;
  
  private Surface g0;
  
  private int h0;
  
  private boolean i0;
  
  private long j0;
  
  private long k0;
  
  private int l0;
  
  private int m0;
  
  private int n0;
  
  private float o0;
  
  private int p0;
  
  private int q0;
  
  private int r0;
  
  private float s0;
  
  private int t0;
  
  private int u0;
  
  private int v0;
  
  private float w0;
  
  private boolean x0;
  
  private int y0;
  
  hk2 z0;
  
  public gk2(Context paramContext, kg2 paramkg2, long paramLong, Handler paramHandler, mk2 parammk2, int paramInt) {
    this(paramContext, paramkg2, 0L, null, false, paramHandler, parammk2, -1);
  }
  
  private gk2(Context paramContext, kg2 paramkg2, long paramLong, ge2<he2> paramge2, boolean paramBoolean, Handler paramHandler, mk2 parammk2, int paramInt) {
    super(2, paramkg2, null, false);
    this.W = paramContext.getApplicationContext();
    this.X = new kk2(paramContext);
    this.Y = new lk2(paramHandler, parammk2);
    paramBoolean = bool;
    if (wj2.a <= 22) {
      paramBoolean = bool;
      if ("foster".equals(wj2.b)) {
        paramBoolean = bool;
        if ("NVIDIA".equals(wj2.c))
          paramBoolean = true; 
      } 
    } 
    this.b0 = paramBoolean;
    this.c0 = new long[10];
    this.A0 = -9223372036854775807L;
    this.j0 = -9223372036854775807L;
    this.p0 = -1;
    this.q0 = -1;
    this.s0 = -1.0F;
    this.o0 = -1.0F;
    this.h0 = 1;
    l0();
  }
  
  private static int a0(String paramString, int paramInt1, int paramInt2) {
    if (paramInt1 == -1 || paramInt2 == -1)
      return -1; 
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b = 4;
    switch (i) {
      default:
        i = -1;
        break;
      case 1599127257:
        if (paramString.equals("video/x-vnd.on2.vp9")) {
          i = 5;
          break;
        } 
      case 1599127256:
        if (paramString.equals("video/x-vnd.on2.vp8")) {
          i = 4;
          break;
        } 
      case 1331836730:
        if (paramString.equals("video/avc")) {
          i = 3;
          break;
        } 
      case 1187890754:
        if (paramString.equals("video/mp4v-es")) {
          i = 2;
          break;
        } 
      case -1662541442:
        if (paramString.equals("video/hevc")) {
          i = 1;
          break;
        } 
      case -1664118616:
        if (paramString.equals("video/3gpp")) {
          i = 0;
          break;
        } 
    } 
    switch (i) {
      default:
        return -1;
      case 3:
        if ("BRAVIA 4K 2015".equals(wj2.d))
          return -1; 
        paramInt1 = wj2.p(paramInt1, 16) * wj2.p(paramInt2, 16) << 4 << 4;
        break;
      case 1:
      case 5:
        paramInt1 *= paramInt2;
        paramInt2 = b;
        return paramInt1 * 3 / paramInt2 * 2;
      case 0:
      case 2:
      case 4:
        paramInt1 *= paramInt2;
        break;
    } 
    paramInt2 = 2;
    return paramInt1 * 3 / paramInt2 * 2;
  }
  
  private final void b0(MediaCodec paramMediaCodec, int paramInt, long paramLong) {
    xj2.a("skipVideoBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, false);
    xj2.b();
    ae2 ae2 = this.U;
    ae2.e++;
  }
  
  @TargetApi(21)
  private final void c0(MediaCodec paramMediaCodec, int paramInt, long paramLong1, long paramLong2) {
    m0();
    xj2.a("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, paramLong2);
    xj2.b();
    ae2 ae2 = this.U;
    ae2.d++;
    this.m0 = 0;
    k0();
  }
  
  private static boolean d0(boolean paramBoolean, zzht paramzzht1, zzht paramzzht2) {
    return (paramzzht1.g.equals(paramzzht2.g) && h0(paramzzht1) == h0(paramzzht2) && (paramBoolean || (paramzzht1.k == paramzzht2.k && paramzzht1.l == paramzzht2.l)));
  }
  
  private final void e0(MediaCodec paramMediaCodec, int paramInt, long paramLong) {
    m0();
    xj2.a("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, true);
    xj2.b();
    ae2 ae2 = this.U;
    ae2.d++;
    this.m0 = 0;
    k0();
  }
  
  private static boolean f0(long paramLong) {
    return (paramLong < -30000L);
  }
  
  private static int g0(zzht paramzzht) {
    int i = paramzzht.h;
    return (i != -1) ? i : a0(paramzzht.g, paramzzht.k, paramzzht.l);
  }
  
  private static int h0(zzht paramzzht) {
    int i = paramzzht.n;
    int j = i;
    if (i == -1)
      j = 0; 
    return j;
  }
  
  private final void i0() {
    this.j0 = -9223372036854775807L;
  }
  
  private final void j0() {
    this.i0 = false;
    if (wj2.a >= 23 && this.x0) {
      MediaCodec mediaCodec = V();
      if (mediaCodec != null)
        this.z0 = new hk2(this, mediaCodec, null); 
    } 
  }
  
  private final void l0() {
    this.t0 = -1;
    this.u0 = -1;
    this.w0 = -1.0F;
    this.v0 = -1;
  }
  
  private final void m0() {
    int i = this.t0;
    int j = this.p0;
    if (i != j || this.u0 != this.q0 || this.v0 != this.r0 || this.w0 != this.s0) {
      this.Y.b(j, this.q0, this.r0, this.s0);
      this.t0 = this.p0;
      this.u0 = this.q0;
      this.v0 = this.r0;
      this.w0 = this.s0;
    } 
  }
  
  private final void n0() {
    if (this.t0 != -1 || this.u0 != -1)
      this.Y.b(this.p0, this.q0, this.r0, this.s0); 
  }
  
  private final void o0() {
    if (this.l0 > 0) {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = this.k0;
      this.Y.h(this.l0, l1 - l2);
      this.l0 = 0;
      this.k0 = l1;
    } 
  }
  
  private final boolean p0(boolean paramBoolean) {
    return (wj2.a >= 23 && !this.x0 && (!paramBoolean || zzqa.b(this.W)));
  }
  
  protected final void A(long paramLong, boolean paramBoolean) {
    super.A(paramLong, paramBoolean);
    j0();
    this.m0 = 0;
    int i = this.B0;
    if (i != 0) {
      this.A0 = this.c0[i - 1];
      this.B0 = 0;
    } 
    if (paramBoolean) {
      i0();
      return;
    } 
    this.j0 = -9223372036854775807L;
  }
  
  protected final void B(zzht[] paramArrayOfzzht, long paramLong) {
    this.d0 = paramArrayOfzzht;
    if (this.A0 == -9223372036854775807L) {
      this.A0 = paramLong;
    } else {
      int i = this.B0;
      long[] arrayOfLong = this.c0;
      if (i == arrayOfLong.length) {
        long l = arrayOfLong[i - 1];
        StringBuilder stringBuilder = new StringBuilder(65);
        stringBuilder.append("Too many stream changes, so dropping offset: ");
        stringBuilder.append(l);
        Log.w("MediaCodecVideoRenderer", stringBuilder.toString());
      } else {
        this.B0 = i + 1;
      } 
      this.c0[this.B0 - 1] = paramLong;
    } 
    super.B(paramArrayOfzzht, paramLong);
  }
  
  protected final void D(boolean paramBoolean) {
    super.D(paramBoolean);
    int i = (F()).b;
    this.y0 = i;
    if (i != 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    this.x0 = paramBoolean;
    this.Y.d(this.U);
    this.X.b();
  }
  
  protected final void E() {
    this.p0 = -1;
    this.q0 = -1;
    this.s0 = -1.0F;
    this.o0 = -1.0F;
    this.A0 = -9223372036854775807L;
    this.B0 = 0;
    l0();
    j0();
    this.X.a();
    this.z0 = null;
    this.x0 = false;
    try {
      super.E();
      return;
    } finally {
      this.U.a();
      this.Y.g(this.U);
    } 
  }
  
  protected final void H(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat) {
    int i;
    int j;
    if (paramMediaFormat.containsKey("crop-right") && paramMediaFormat.containsKey("crop-left") && paramMediaFormat.containsKey("crop-bottom") && paramMediaFormat.containsKey("crop-top")) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      j = paramMediaFormat.getInteger("crop-right") - paramMediaFormat.getInteger("crop-left") + 1;
    } else {
      j = paramMediaFormat.getInteger("width");
    } 
    this.p0 = j;
    if (i) {
      i = paramMediaFormat.getInteger("crop-bottom") - paramMediaFormat.getInteger("crop-top") + 1;
    } else {
      i = paramMediaFormat.getInteger("height");
    } 
    this.q0 = i;
    float f = this.o0;
    this.s0 = f;
    if (wj2.a >= 21) {
      j = this.n0;
      if (j == 90 || j == 270) {
        j = this.p0;
        this.p0 = i;
        this.q0 = j;
        this.s0 = 1.0F / f;
      } 
    } else {
      this.r0 = this.n0;
    } 
    paramMediaCodec.setVideoScalingMode(this.h0);
  }
  
  protected final int I(kg2 paramkg2, zzht paramzzht) {
    byte b2;
    byte b3;
    String str = paramzzht.g;
    boolean bool1 = mj2.b(str);
    byte b1 = 0;
    if (!bool1)
      return 0; 
    zzjo zzjo = paramzzht.j;
    if (zzjo != null) {
      b2 = 0;
      bool1 = false;
      while (true) {
        bool2 = bool1;
        if (b2 < zzjo.d) {
          bool1 |= (zzjo.a(b2)).f;
          b2++;
          continue;
        } 
        break;
      } 
    } else {
      bool2 = false;
    } 
    jg2 jg2 = paramkg2.b(str, bool2);
    boolean bool = true;
    if (jg2 == null)
      return 1; 
    boolean bool2 = jg2.g(paramzzht.d);
    bool1 = bool2;
    if (bool2) {
      b2 = paramzzht.k;
      bool1 = bool2;
      if (b2 > 0) {
        b3 = paramzzht.l;
        bool1 = bool2;
        if (b3 > 0)
          if (wj2.a >= 21) {
            bool1 = jg2.b(b2, b3, paramzzht.m);
          } else {
            if (b2 * b3 <= lg2.g()) {
              bool1 = bool;
            } else {
              bool1 = false;
            } 
            if (!bool1) {
              b3 = paramzzht.k;
              b2 = paramzzht.l;
              String str1 = wj2.e;
              StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 56);
              stringBuilder.append("FalseCheck [legacyFrameSize, ");
              stringBuilder.append(b3);
              stringBuilder.append("x");
              stringBuilder.append(b2);
              stringBuilder.append("] [");
              stringBuilder.append(str1);
              stringBuilder.append("]");
              Log.d("MediaCodecVideoRenderer", stringBuilder.toString());
            } 
          }  
      } 
    } 
    if (jg2.b) {
      b2 = 8;
    } else {
      b2 = 4;
    } 
    if (jg2.c)
      b1 = 16; 
    if (bool1) {
      b3 = 3;
    } else {
      b3 = 2;
    } 
    return b3 | b2 | b1;
  }
  
  protected final void K(ce2 paramce2) {
    if (wj2.a < 23 && this.x0)
      k0(); 
  }
  
  protected final void L(jg2 paramjg2, MediaCodec paramMediaCodec, zzht paramzzht, MediaCrypto paramMediaCrypto) {
    ik2 ik21;
    zzht[] arrayOfZzht = this.d0;
    int i = paramzzht.k;
    int j = paramzzht.l;
    int k = g0(paramzzht);
    if (arrayOfZzht.length == 1) {
      ik21 = new ik2(i, j, k);
    } else {
      int m = ik21.length;
      int n = 0;
      int i1;
      for (i1 = 0; n < m; i1 = i7) {
        ik2 ik22 = ik21[n];
        int i4 = i;
        int i5 = j;
        int i6 = k;
        int i7 = i1;
        if (d0(paramjg2.b, paramzzht, (zzht)ik22)) {
          i6 = ((zzht)ik22).k;
          if (i6 == -1 || ((zzht)ik22).l == -1) {
            i7 = 1;
          } else {
            i7 = 0;
          } 
          i7 = i1 | i7;
          i4 = Math.max(i, i6);
          i5 = Math.max(j, ((zzht)ik22).l);
          i6 = Math.max(k, g0((zzht)ik22));
        } 
        n++;
        i = i4;
        j = i5;
        k = i6;
      } 
      int i2 = i;
      int i3 = j;
      n = k;
      if (i1 != 0) {
        StringBuilder stringBuilder = new StringBuilder(66);
        stringBuilder.append("Resolutions unknown. Codec max resolution: ");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(j);
        String str1 = stringBuilder.toString();
        String str2 = "MediaCodecVideoRenderer";
        Log.w("MediaCodecVideoRenderer", str1);
        n = paramzzht.l;
        i2 = paramzzht.k;
        if (n > i2) {
          i1 = 1;
        } else {
          i1 = 0;
        } 
        if (i1 != 0) {
          i3 = n;
        } else {
          i3 = i2;
        } 
        if (i1 != 0)
          n = i2; 
        float f = n / i3;
        int[] arrayOfInt = V;
        i2 = arrayOfInt.length;
        byte b = 0;
        while (true) {
          if (b < i2) {
            int i4 = arrayOfInt[b];
            m = (int)(i4 * f);
            if (i4 > i3 && m > n) {
              if (wj2.a >= 21) {
                int i5;
                if (i1 != 0) {
                  i5 = m;
                } else {
                  i5 = i4;
                } 
                if (i1 == 0)
                  i4 = m; 
                Point point = paramjg2.i(i5, i4);
                float f1 = paramzzht.m;
                if (paramjg2.b(point.x, point.y, f1)) {
                  Point point1 = point;
                  break;
                } 
              } else {
                int i5 = wj2.p(i4, 16) << 4;
                m = wj2.p(m, 16) << 4;
                if (i5 * m <= lg2.g()) {
                  if (i1 != 0) {
                    n = m;
                  } else {
                    n = i5;
                  } 
                  if (i1 == 0)
                    i5 = m; 
                  Point point = new Point(n, i5);
                  break;
                } 
              } 
              b++;
              continue;
            } 
          } 
          arrayOfInt = null;
          break;
        } 
        i2 = i;
        i3 = j;
        n = k;
        if (arrayOfInt != null) {
          i2 = Math.max(i, ((Point)arrayOfInt).x);
          i3 = Math.max(j, ((Point)arrayOfInt).y);
          n = Math.max(k, a0(paramzzht.g, i2, i3));
          StringBuilder stringBuilder1 = new StringBuilder(57);
          stringBuilder1.append("Codec max resolution adjusted to: ");
          stringBuilder1.append(i2);
          stringBuilder1.append("x");
          stringBuilder1.append(i3);
          Log.w(str2, stringBuilder1.toString());
        } 
      } 
      ik21 = new ik2(i2, i3, n);
    } 
    this.e0 = ik21;
    boolean bool = this.b0;
    j = this.y0;
    MediaFormat mediaFormat = paramzzht.p();
    mediaFormat.setInteger("max-width", ik21.a);
    mediaFormat.setInteger("max-height", ik21.b);
    k = ik21.c;
    if (k != -1)
      mediaFormat.setInteger("max-input-size", k); 
    if (bool)
      mediaFormat.setInteger("auto-frc", 0); 
    if (j != 0) {
      mediaFormat.setFeatureEnabled("tunneled-playback", true);
      mediaFormat.setInteger("audio-session-id", j);
    } 
    if (this.f0 == null) {
      jj2.e(p0(paramjg2.d));
      if (this.g0 == null)
        this.g0 = zzqa.a(this.W, paramjg2.d); 
      this.f0 = this.g0;
    } 
    paramMediaCodec.configure(mediaFormat, this.f0, null, 0);
    if (wj2.a >= 23 && this.x0)
      this.z0 = new hk2(this, paramMediaCodec, null); 
  }
  
  protected final boolean N(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean) {
    ae2 ae2;
    while (true) {
      paramInt2 = this.B0;
      if (paramInt2 != 0) {
        long[] arrayOfLong = this.c0;
        if (paramLong3 >= arrayOfLong[0]) {
          this.A0 = arrayOfLong[0];
          this.B0 = --paramInt2;
          System.arraycopy(arrayOfLong, 1, arrayOfLong, 0, paramInt2);
          continue;
        } 
      } 
      break;
    } 
    long l1 = paramLong3 - this.A0;
    if (paramBoolean) {
      b0(paramMediaCodec, paramInt1, l1);
      return true;
    } 
    long l2 = paramLong3 - paramLong1;
    if (this.f0 == this.g0) {
      if (f0(l2)) {
        b0(paramMediaCodec, paramInt1, l1);
        return true;
      } 
      return false;
    } 
    if (!this.i0) {
      if (wj2.a >= 21) {
        c0(paramMediaCodec, paramInt1, l1, System.nanoTime());
      } else {
        e0(paramMediaCodec, paramInt1, l1);
      } 
      return true;
    } 
    if (getState() != 2)
      return false; 
    long l3 = SystemClock.elapsedRealtime();
    paramLong1 = System.nanoTime();
    paramLong2 = this.X.c(paramLong3, (l2 - l3 * 1000L - paramLong2) * 1000L + paramLong1);
    paramLong1 = (paramLong2 - paramLong1) / 1000L;
    if (f0(paramLong1)) {
      xj2.a("dropVideoBuffer");
      paramMediaCodec.releaseOutputBuffer(paramInt1, false);
      xj2.b();
      ae2 = this.U;
      ae2.f++;
      this.l0++;
      paramInt1 = this.m0 + 1;
      this.m0 = paramInt1;
      ae2.g = Math.max(paramInt1, ae2.g);
      if (this.l0 == this.a0)
        o0(); 
      return true;
    } 
    if (wj2.a >= 21) {
      if (paramLong1 < 50000L) {
        c0((MediaCodec)ae2, paramInt1, l1, paramLong2);
        return true;
      } 
    } else if (paramLong1 < 30000L) {
      if (paramLong1 > 11000L)
        try {
          Thread.sleep((paramLong1 - 10000L) / 1000L);
        } catch (InterruptedException interruptedException) {
          Thread.currentThread().interrupt();
        }  
      e0((MediaCodec)ae2, paramInt1, l1);
      return true;
    } 
    return false;
  }
  
  protected final boolean O(MediaCodec paramMediaCodec, boolean paramBoolean, zzht paramzzht1, zzht paramzzht2) {
    if (d0(paramBoolean, paramzzht1, paramzzht2)) {
      int i = paramzzht2.k;
      ik2 ik21 = this.e0;
      if (i <= ik21.a && paramzzht2.l <= ik21.b && paramzzht2.h <= ik21.c)
        return true; 
    } 
    return false;
  }
  
  protected final boolean P(jg2 paramjg2) {
    return (this.f0 != null || p0(paramjg2.d));
  }
  
  protected final void Q(String paramString, long paramLong1, long paramLong2) {
    this.Y.e(paramString, paramLong1, paramLong2);
  }
  
  protected final void R(zzht paramzzht) {
    super.R(paramzzht);
    this.Y.f(paramzzht);
    float f1 = paramzzht.o;
    float f2 = f1;
    if (f1 == -1.0F)
      f2 = 1.0F; 
    this.o0 = f2;
    this.n0 = h0(paramzzht);
  }
  
  protected final void X() {
    try {
      super.X();
      Surface surface = this.g0;
      return;
    } finally {
      if (this.g0 != null) {
        Surface surface1 = this.f0;
        Surface surface2 = this.g0;
        if (surface1 == surface2)
          this.f0 = null; 
        surface2.release();
        this.g0 = null;
      } 
    } 
  }
  
  public final void a(int paramInt, Object paramObject) {
    if (paramInt == 1) {
      Surface surface = (Surface)paramObject;
      paramObject = surface;
      if (surface == null) {
        paramObject = this.g0;
        if (paramObject == null) {
          jg2 jg2 = W();
          paramObject = surface;
          if (jg2 != null) {
            paramObject = surface;
            if (p0(jg2.d)) {
              paramObject = zzqa.a(this.W, jg2.d);
              this.g0 = (Surface)paramObject;
            } 
          } 
        } 
      } 
      if (this.f0 != paramObject) {
        this.f0 = (Surface)paramObject;
        paramInt = getState();
        if (paramInt == 1 || paramInt == 2) {
          MediaCodec mediaCodec = V();
          if (wj2.a >= 23 && mediaCodec != null && paramObject != null) {
            mediaCodec.setOutputSurface((Surface)paramObject);
          } else {
            super.X();
            U();
          } 
        } 
        if (paramObject != null && paramObject != this.g0) {
          n0();
          j0();
          if (paramInt == 2) {
            i0();
            return;
          } 
        } else {
          l0();
          j0();
        } 
        return;
      } 
      if (paramObject != null && paramObject != this.g0) {
        n0();
        if (this.i0)
          this.Y.c(this.f0); 
      } 
      return;
    } 
    if (paramInt == 4) {
      this.h0 = ((Integer)paramObject).intValue();
      paramObject = V();
      if (paramObject != null)
        paramObject.setVideoScalingMode(this.h0); 
      return;
    } 
    super.a(paramInt, paramObject);
  }
  
  final void k0() {
    if (!this.i0) {
      this.i0 = true;
      this.Y.c(this.f0);
    } 
  }
  
  public final boolean m() {
    if (super.m())
      if (!this.i0) {
        Surface surface = this.g0;
        if ((surface != null && this.f0 == surface) || V() == null) {
          this.j0 = -9223372036854775807L;
          return true;
        } 
      } else {
        this.j0 = -9223372036854775807L;
        return true;
      }  
    if (this.j0 == -9223372036854775807L)
      return false; 
    if (SystemClock.elapsedRealtime() < this.j0)
      return true; 
    this.j0 = -9223372036854775807L;
    return false;
  }
  
  protected final void x() {
    super.x();
    this.l0 = 0;
    this.k0 = SystemClock.elapsedRealtime();
    this.j0 = -9223372036854775807L;
  }
  
  protected final void y() {
    o0();
    super.y();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */