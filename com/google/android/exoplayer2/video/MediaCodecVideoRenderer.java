package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1.d;
import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.o;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.mediacodec.g;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.r;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public class MediaCodecVideoRenderer extends MediaCodecRenderer {
  private static final int[] u0 = new int[] { 1920, 1600, 1440, 1280, 960, 854, 640, 540, 480 };
  
  private static boolean v0;
  
  private static boolean w0;
  
  private final long A0;
  
  private final int B0;
  
  private final boolean C0;
  
  private final long[] D0;
  
  private final long[] E0;
  
  private a F0;
  
  private boolean G0;
  
  private boolean H0;
  
  private Surface I0;
  
  private Surface J0;
  
  private int K0;
  
  private boolean L0;
  
  private long M0;
  
  private long N0;
  
  private long O0;
  
  private int P0;
  
  private int Q0;
  
  private int R0;
  
  private long S0;
  
  private int T0;
  
  private float U0;
  
  private MediaFormat V0;
  
  private int W0;
  
  private int X0;
  
  private int Y0;
  
  private float Z0;
  
  private int a1;
  
  private int b1;
  
  private int c1;
  
  private float d1;
  
  private boolean e1;
  
  private int f1;
  
  b g1;
  
  private long h1;
  
  private long i1;
  
  private int j1;
  
  private m k1;
  
  private final Context x0;
  
  private final n y0;
  
  private final q.a z0;
  
  @Deprecated
  public MediaCodecVideoRenderer(Context paramContext, f paramf, long paramLong, k<o> paramk, boolean paramBoolean1, boolean paramBoolean2, Handler paramHandler, q paramq, int paramInt) {
    super(2, paramf, paramk, paramBoolean1, paramBoolean2, 30.0F);
    this.A0 = paramLong;
    this.B0 = paramInt;
    paramContext = paramContext.getApplicationContext();
    this.x0 = paramContext;
    this.y0 = new n(paramContext);
    this.z0 = new q.a(paramHandler, paramq);
    this.C0 = g1();
    this.D0 = new long[10];
    this.E0 = new long[10];
    this.i1 = -9223372036854775807L;
    this.h1 = -9223372036854775807L;
    this.N0 = -9223372036854775807L;
    this.W0 = -1;
    this.X0 = -1;
    this.Z0 = -1.0F;
    this.U0 = -1.0F;
    this.K0 = 1;
    c1();
  }
  
  @TargetApi(29)
  private static void C1(MediaCodec paramMediaCodec, byte[] paramArrayOfbyte) {
    Bundle bundle = new Bundle();
    bundle.putByteArray("hdr10-plus-info", paramArrayOfbyte);
    paramMediaCodec.setParameters(bundle);
  }
  
  private void D1() {
    long l;
    if (this.A0 > 0L) {
      l = SystemClock.elapsedRealtime() + this.A0;
    } else {
      l = -9223372036854775807L;
    } 
    this.N0 = l;
  }
  
  @TargetApi(23)
  private static void E1(MediaCodec paramMediaCodec, Surface paramSurface) {
    paramMediaCodec.setOutputSurface(paramSurface);
  }
  
  private void F1(Surface paramSurface) {
    Surface surface = paramSurface;
    if (paramSurface == null) {
      surface = this.J0;
      if (surface == null) {
        e e = j0();
        surface = paramSurface;
        if (e != null) {
          surface = paramSurface;
          if (J1(e)) {
            surface = DummySurface.d(this.x0, e.g);
            this.J0 = surface;
          } 
        } 
      } 
    } 
    if (this.I0 != surface) {
      this.I0 = surface;
      int i = getState();
      MediaCodec mediaCodec = h0();
      if (mediaCodec != null)
        if (h0.a >= 23 && surface != null && !this.G0) {
          E1(mediaCodec, surface);
        } else {
          L0();
          x0();
        }  
      if (surface != null && surface != this.J0) {
        v1();
        b1();
        if (i == 2)
          D1(); 
      } else {
        c1();
        b1();
      } 
    } else if (surface != null && surface != this.J0) {
      v1();
      u1();
    } 
  }
  
  private boolean J1(e parame) {
    boolean bool;
    if (h0.a >= 23 && !this.e1 && !e1(parame.a) && (!parame.g || DummySurface.c(this.x0))) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void b1() {
    this.L0 = false;
    if (h0.a >= 23 && this.e1) {
      MediaCodec mediaCodec = h0();
      if (mediaCodec != null)
        this.g1 = new b(this, mediaCodec); 
    } 
  }
  
  private void c1() {
    this.a1 = -1;
    this.b1 = -1;
    this.d1 = -1.0F;
    this.c1 = -1;
  }
  
  @TargetApi(21)
  private static void f1(MediaFormat paramMediaFormat, int paramInt) {
    paramMediaFormat.setFeatureEnabled("tunneled-playback", true);
    paramMediaFormat.setInteger("audio-session-id", paramInt);
  }
  
  private static boolean g1() {
    return "NVIDIA".equals(h0.c);
  }
  
  private static int i1(e parame, String paramString, int paramInt1, int paramInt2) {
    if (paramInt1 == -1 || paramInt2 == -1)
      return -1; 
    paramString.hashCode();
    int i = paramString.hashCode();
    byte b1 = 4;
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
        paramString = h0.d;
        if ("BRAVIA 4K 2015".equals(paramString) || ("Amazon".equals(h0.c) && ("KFSOWI".equals(paramString) || ("AFTS".equals(paramString) && parame.g))))
          return -1; 
        paramInt1 = h0.i(paramInt1, 16) * h0.i(paramInt2, 16) * 16 * 16;
        break;
      case 1:
      case 5:
        paramInt1 *= paramInt2;
        paramInt2 = b1;
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
  
  private static Point j1(e parame, Format paramFormat) {
    boolean bool;
    int i1;
    int i = paramFormat.p;
    int j = paramFormat.o;
    int k = 0;
    if (i > j) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      i1 = i;
    } else {
      i1 = j;
    } 
    if (bool)
      i = j; 
    float f = i / i1;
    int[] arrayOfInt = u0;
    int i2 = arrayOfInt.length;
    for (j = k;; j++) {
      if (j < i2) {
        int i3 = arrayOfInt[j];
        k = (int)(i3 * f);
        if (i3 <= i1 || k <= i)
          return null; 
        if (h0.a >= 21) {
          int i4;
          if (bool) {
            i4 = k;
          } else {
            i4 = i3;
          } 
          if (!bool)
            i3 = k; 
          Point point = parame.b(i4, i3);
          float f1 = paramFormat.q;
          if (parame.t(point.x, point.y, f1))
            return point; 
        } else {
          try {
            int i4 = h0.i(i3, 16) * 16;
            k = h0.i(k, 16) * 16;
            if (i4 * k <= MediaCodecUtil.B()) {
              if (bool) {
                i1 = k;
              } else {
                i1 = i4;
              } 
              if (bool)
                k = i4; 
              return new Point(i1, k);
            } 
            j++;
            continue;
          } catch (com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException decoderQueryException) {}
          return null;
        } 
      } else {
        return null;
      } 
    } 
  }
  
  private static List<e> l1(f paramf, Format paramFormat, boolean paramBoolean1, boolean paramBoolean2) {
    String str = paramFormat.j;
    if (str == null)
      return Collections.emptyList(); 
    List<? extends e> list = MediaCodecUtil.l(paramf.b(str, paramBoolean1, paramBoolean2), paramFormat);
    if ("video/dolby-vision".equals(str)) {
      Pair pair = MediaCodecUtil.h(paramFormat);
      if (pair != null) {
        int i = ((Integer)pair.first).intValue();
        if (i == 16 || i == 256) {
          list.addAll(paramf.b("video/hevc", paramBoolean1, paramBoolean2));
          return Collections.unmodifiableList(list);
        } 
        if (i == 512)
          list.addAll(paramf.b("video/avc", paramBoolean1, paramBoolean2)); 
      } 
    } 
    return Collections.unmodifiableList(list);
  }
  
  private static int m1(e parame, Format paramFormat) {
    if (paramFormat.k != -1) {
      int i = paramFormat.l.size();
      byte b1 = 0;
      int j = 0;
      while (b1 < i) {
        j += ((byte[])paramFormat.l.get(b1)).length;
        b1++;
      } 
      return paramFormat.k + j;
    } 
    return i1(parame, paramFormat.j, paramFormat.o, paramFormat.p);
  }
  
  private static boolean o1(long paramLong) {
    boolean bool;
    if (paramLong < -30000L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean p1(long paramLong) {
    boolean bool;
    if (paramLong < -500000L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void r1() {
    if (this.P0 > 0) {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = this.O0;
      this.z0.c(this.P0, l1 - l2);
      this.P0 = 0;
      this.O0 = l1;
    } 
  }
  
  private void t1() {
    int i = this.W0;
    if ((i != -1 || this.X0 != -1) && (this.a1 != i || this.b1 != this.X0 || this.c1 != this.Y0 || this.d1 != this.Z0)) {
      this.z0.u(i, this.X0, this.Y0, this.Z0);
      this.a1 = this.W0;
      this.b1 = this.X0;
      this.c1 = this.Y0;
      this.d1 = this.Z0;
    } 
  }
  
  private void u1() {
    if (this.L0)
      this.z0.t(this.I0); 
  }
  
  private void v1() {
    int i = this.a1;
    if (i != -1 || this.b1 != -1)
      this.z0.u(i, this.b1, this.c1, this.d1); 
  }
  
  private void w1(long paramLong1, long paramLong2, Format paramFormat, MediaFormat paramMediaFormat) {
    m m1 = this.k1;
    if (m1 != null)
      m1.c(paramLong1, paramLong2, paramFormat, paramMediaFormat); 
  }
  
  private void y1() {
    R0();
  }
  
  private void z1(MediaCodec paramMediaCodec, int paramInt1, int paramInt2) {
    this.W0 = paramInt1;
    this.X0 = paramInt2;
    float f = this.U0;
    this.Z0 = f;
    if (h0.a >= 21) {
      int i = this.T0;
      if (i == 90 || i == 270) {
        this.W0 = paramInt2;
        this.X0 = paramInt1;
        this.Z0 = 1.0F / f;
      } 
    } else {
      this.Y0 = this.T0;
    } 
    paramMediaCodec.setVideoScalingMode(this.K0);
  }
  
  protected void A0(String paramString, long paramLong1, long paramLong2) {
    this.z0.a(paramString, paramLong1, paramLong2);
    this.G0 = e1(paramString);
    this.H0 = ((e)e.e(j0())).m();
  }
  
  protected void A1(MediaCodec paramMediaCodec, int paramInt, long paramLong) {
    t1();
    f0.a("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, true);
    f0.c();
    this.S0 = SystemClock.elapsedRealtime() * 1000L;
    d d = this.t0;
    d.e++;
    this.Q0 = 0;
    s1();
  }
  
  protected void B0(f0 paramf0) {
    super.B0(paramf0);
    Format format = paramf0.c;
    this.z0.e(format);
    this.U0 = format.s;
    this.T0 = format.r;
  }
  
  @TargetApi(21)
  protected void B1(MediaCodec paramMediaCodec, int paramInt, long paramLong1, long paramLong2) {
    t1();
    f0.a("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, paramLong2);
    f0.c();
    this.S0 = SystemClock.elapsedRealtime() * 1000L;
    d d = this.t0;
    d.e++;
    this.Q0 = 0;
    s1();
  }
  
  protected void C0(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat) {
    int i;
    int j;
    this.V0 = paramMediaFormat;
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
    if (i) {
      i = paramMediaFormat.getInteger("crop-bottom") - paramMediaFormat.getInteger("crop-top") + 1;
    } else {
      i = paramMediaFormat.getInteger("height");
    } 
    z1(paramMediaCodec, j, i);
  }
  
  protected void D0(long paramLong) {
    if (!this.e1)
      this.R0--; 
    while (true) {
      int i = this.j1;
      if (i != 0 && paramLong >= this.E0[0]) {
        long[] arrayOfLong = this.D0;
        this.i1 = arrayOfLong[0];
        this.j1 = --i;
        System.arraycopy(arrayOfLong, 1, arrayOfLong, 0, i);
        arrayOfLong = this.E0;
        System.arraycopy(arrayOfLong, 1, arrayOfLong, 0, this.j1);
        b1();
        continue;
      } 
      break;
    } 
  }
  
  protected void E() {
    this.h1 = -9223372036854775807L;
    this.i1 = -9223372036854775807L;
    this.j1 = 0;
    this.V0 = null;
    c1();
    b1();
    this.y0.d();
    this.g1 = null;
    try {
      super.E();
      return;
    } finally {
      this.z0.b(this.t0);
    } 
  }
  
  protected void E0(e parame) {
    if (!this.e1)
      this.R0++; 
    this.h1 = Math.max(parame.d, this.h1);
    if (h0.a < 23 && this.e1)
      x1(parame.d); 
  }
  
  protected void F(boolean paramBoolean) {
    super.F(paramBoolean);
    int i = this.f1;
    int j = (g()).b;
    this.f1 = j;
    if (j != 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    this.e1 = paramBoolean;
    if (j != i)
      L0(); 
    this.z0.d(this.t0);
    this.y0.e();
  }
  
  protected void G(long paramLong, boolean paramBoolean) {
    super.G(paramLong, paramBoolean);
    b1();
    this.M0 = -9223372036854775807L;
    this.Q0 = 0;
    this.h1 = -9223372036854775807L;
    int i = this.j1;
    if (i != 0) {
      this.i1 = this.D0[i - 1];
      this.j1 = 0;
    } 
    if (paramBoolean) {
      D1();
    } else {
      this.N0 = -9223372036854775807L;
    } 
  }
  
  protected boolean G0(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, Format paramFormat) {
    boolean bool;
    if (this.M0 == -9223372036854775807L)
      this.M0 = paramLong1; 
    long l1 = paramLong3 - this.i1;
    if (paramBoolean1 && !paramBoolean2) {
      K1(paramMediaCodec, paramInt1, l1);
      return true;
    } 
    long l2 = paramLong3 - paramLong1;
    if (this.I0 == this.J0) {
      if (o1(l2)) {
        K1(paramMediaCodec, paramInt1, l1);
        return true;
      } 
      return false;
    } 
    long l3 = SystemClock.elapsedRealtime() * 1000L;
    long l4 = this.S0;
    if (getState() == 2) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    } 
    if (this.N0 == -9223372036854775807L && paramLong1 >= this.i1 && (!this.L0 || (paramInt2 != 0 && I1(l2, l3 - l4)))) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      paramLong1 = System.nanoTime();
      w1(l1, paramLong1, paramFormat, this.V0);
      if (h0.a >= 21) {
        B1(paramMediaCodec, paramInt1, l1, paramLong1);
      } else {
        A1(paramMediaCodec, paramInt1, l1);
      } 
      return true;
    } 
    if (paramInt2 != 0 && paramLong1 != this.M0) {
      l4 = System.nanoTime();
      paramLong3 = this.y0.b(paramLong3, (l2 - l3 - paramLong2) * 1000L + l4);
      l4 = (paramLong3 - l4) / 1000L;
      if (this.N0 != -9223372036854775807L) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      } 
      if (G1(l4, paramLong2, paramBoolean2) && q1(paramMediaCodec, paramInt1, l1, paramLong1, paramBoolean1))
        return false; 
      if (H1(l4, paramLong2, paramBoolean2)) {
        if (paramBoolean1) {
          K1(paramMediaCodec, paramInt1, l1);
        } else {
          h1(paramMediaCodec, paramInt1, l1);
        } 
        return true;
      } 
      if (h0.a >= 21) {
        if (l4 < 50000L) {
          w1(l1, paramLong3, paramFormat, this.V0);
          B1(paramMediaCodec, paramInt1, l1, paramLong3);
          return true;
        } 
      } else if (l4 < 30000L) {
        if (l4 > 11000L)
          try {
            Thread.sleep((l4 - 10000L) / 1000L);
          } catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            return false;
          }  
        w1(l1, paramLong3, paramFormat, this.V0);
        A1((MediaCodec)interruptedException, paramInt1, l1);
        return true;
      } 
    } 
    return false;
  }
  
  protected boolean G1(long paramLong1, long paramLong2, boolean paramBoolean) {
    if (p1(paramLong1) && !paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    return paramBoolean;
  }
  
  protected void H() {
    try {
      super.H();
      Surface surface = this.J0;
      return;
    } finally {
      if (this.J0 != null) {
        Surface surface1 = this.I0;
        Surface surface2 = this.J0;
        if (surface1 == surface2)
          this.I0 = null; 
        surface2.release();
        this.J0 = null;
      } 
    } 
  }
  
  protected boolean H1(long paramLong1, long paramLong2, boolean paramBoolean) {
    if (o1(paramLong1) && !paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    return paramBoolean;
  }
  
  protected void I() {
    super.I();
    this.P0 = 0;
    this.O0 = SystemClock.elapsedRealtime();
    this.S0 = SystemClock.elapsedRealtime() * 1000L;
  }
  
  protected boolean I1(long paramLong1, long paramLong2) {
    boolean bool;
    if (o1(paramLong1) && paramLong2 > 100000L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected void J() {
    this.N0 = -9223372036854775807L;
    r1();
    super.J();
  }
  
  protected void K(Format[] paramArrayOfFormat, long paramLong) {
    if (this.i1 == -9223372036854775807L) {
      this.i1 = paramLong;
    } else {
      int i = this.j1;
      if (i == this.D0.length) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Too many stream changes, so dropping offset: ");
        stringBuilder.append(this.D0[this.j1 - 1]);
        o.f("MediaCodecVideoRenderer", stringBuilder.toString());
      } else {
        this.j1 = i + 1;
      } 
      long[] arrayOfLong = this.D0;
      i = this.j1;
      arrayOfLong[i - 1] = paramLong;
      this.E0[i - 1] = this.h1;
    } 
    super.K(paramArrayOfFormat, paramLong);
  }
  
  protected void K1(MediaCodec paramMediaCodec, int paramInt, long paramLong) {
    f0.a("skipVideoBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, false);
    f0.c();
    d d = this.t0;
    d.f++;
  }
  
  protected void L0() {
    try {
      super.L0();
      return;
    } finally {
      this.R0 = 0;
    } 
  }
  
  protected void L1(int paramInt) {
    d d = this.t0;
    d.g += paramInt;
    this.P0 += paramInt;
    paramInt = this.Q0 + paramInt;
    this.Q0 = paramInt;
    d.h = Math.max(paramInt, d.h);
    paramInt = this.B0;
    if (paramInt > 0 && this.P0 >= paramInt)
      r1(); 
  }
  
  protected int O(MediaCodec paramMediaCodec, e parame, Format paramFormat1, Format paramFormat2) {
    if (parame.o(paramFormat1, paramFormat2, true)) {
      int i = paramFormat2.o;
      a a1 = this.F0;
      if (i <= a1.a && paramFormat2.p <= a1.b && m1(parame, paramFormat2) <= this.F0.c) {
        if (paramFormat1.G(paramFormat2)) {
          i = 3;
        } else {
          i = 2;
        } 
        return i;
      } 
    } 
    return 0;
  }
  
  protected boolean U0(e parame) {
    return (this.I0 != null || J1(parame));
  }
  
  protected int W0(f paramf, k<o> paramk, Format paramFormat) {
    byte b2;
    boolean bool1 = r.n(paramFormat.j);
    byte b1 = 0;
    if (!bool1)
      return s0.a(0); 
    DrmInitData drmInitData = paramFormat.m;
    if (drmInitData != null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    List<e> list1 = l1(paramf, paramFormat, bool1, false);
    List<e> list2 = list1;
    if (bool1) {
      list2 = list1;
      if (list1.isEmpty())
        list2 = l1(paramf, paramFormat, false, false); 
    } 
    if (list2.isEmpty())
      return s0.a(1); 
    if (drmInitData == null || o.class.equals(paramFormat.D) || (paramFormat.D == null && u.N(paramk, drmInitData))) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    if (!b2)
      return s0.a(2); 
    e e = list2.get(0);
    boolean bool2 = e.l(paramFormat);
    if (e.n(paramFormat)) {
      b2 = 16;
    } else {
      b2 = 8;
    } 
    byte b3 = b1;
    if (bool2) {
      List<e> list = l1(paramf, paramFormat, bool1, true);
      b3 = b1;
      if (!list.isEmpty()) {
        e e1 = list.get(0);
        b3 = b1;
        if (e1.l(paramFormat)) {
          b3 = b1;
          if (e1.n(paramFormat))
            b3 = 32; 
        } 
      } 
    } 
    if (bool2) {
      b1 = 4;
    } else {
      b1 = 3;
    } 
    return s0.b(b1, b2, b3);
  }
  
  protected void Y(e parame, MediaCodec paramMediaCodec, Format paramFormat, MediaCrypto paramMediaCrypto, float paramFloat) {
    String str = parame.c;
    a a1 = k1(parame, paramFormat, j());
    this.F0 = a1;
    MediaFormat mediaFormat = n1(paramFormat, str, a1, paramFloat, this.C0, this.f1);
    if (this.I0 == null) {
      e.f(J1(parame));
      if (this.J0 == null)
        this.J0 = DummySurface.d(this.x0, parame.g); 
      this.I0 = this.J0;
    } 
    paramMediaCodec.configure(mediaFormat, this.I0, paramMediaCrypto, 0);
    if (h0.a >= 23 && this.e1)
      this.g1 = new b(this, paramMediaCodec); 
  }
  
  public void e(int paramInt, Object paramObject) {
    if (paramInt == 1) {
      F1((Surface)paramObject);
    } else if (paramInt == 4) {
      this.K0 = ((Integer)paramObject).intValue();
      paramObject = h0();
      if (paramObject != null)
        paramObject.setVideoScalingMode(this.K0); 
    } else if (paramInt == 6) {
      this.k1 = (m)paramObject;
    } else {
      super.e(paramInt, paramObject);
    } 
  }
  
  protected boolean e1(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 'OMX.google'
    //   4: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7: istore_2
    //   8: iconst_0
    //   9: istore_3
    //   10: iload_2
    //   11: ifeq -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: ldc com/google/android/exoplayer2/video/MediaCodecVideoRenderer
    //   18: monitorenter
    //   19: getstatic com/google/android/exoplayer2/video/MediaCodecVideoRenderer.v0 : Z
    //   22: ifne -> 3895
    //   25: getstatic com/google/android/exoplayer2/util/h0.b : Ljava/lang/String;
    //   28: astore_1
    //   29: ldc_w 'dangal'
    //   32: aload_1
    //   33: invokevirtual equals : (Ljava/lang/Object;)Z
    //   36: ifeq -> 46
    //   39: iconst_1
    //   40: putstatic com/google/android/exoplayer2/video/MediaCodecVideoRenderer.w0 : Z
    //   43: goto -> 3891
    //   46: getstatic com/google/android/exoplayer2/util/h0.a : I
    //   49: istore #4
    //   51: bipush #27
    //   53: istore #5
    //   55: iload #4
    //   57: bipush #27
    //   59: if_icmpgt -> 79
    //   62: ldc_w 'HWEML'
    //   65: aload_1
    //   66: invokevirtual equals : (Ljava/lang/Object;)Z
    //   69: ifeq -> 79
    //   72: iconst_1
    //   73: putstatic com/google/android/exoplayer2/video/MediaCodecVideoRenderer.w0 : Z
    //   76: goto -> 3891
    //   79: iload #4
    //   81: bipush #27
    //   83: if_icmplt -> 89
    //   86: goto -> 3891
    //   89: aload_1
    //   90: invokevirtual hashCode : ()I
    //   93: lookupswitch default -> 1112, -2144781245 -> 3230, -2144781185 -> 3213, -2144781160 -> 3196, -2097309513 -> 3179, -2022874474 -> 3162, -1978993182 -> 3145, -1978990237 -> 3128, -1936688988 -> 3111, -1936688066 -> 3094, -1936688065 -> 3077, -1931988508 -> 3060, -1696512866 -> 3043, -1680025915 -> 3026, -1615810839 -> 3009, -1554255044 -> 2992, -1481772737 -> 2975, -1481772730 -> 2958, -1481772729 -> 2941, -1320080169 -> 2924, -1217592143 -> 2907, -1180384755 -> 2890, -1139198265 -> 2873, -1052835013 -> 2856, -993250464 -> 2840, -993250458 -> 2824, -965403638 -> 2807, -958336948 -> 2790, -879245230 -> 2773, -842500323 -> 2756, -821392978 -> 2739, -797483286 -> 2722, -794946968 -> 2705, -788334647 -> 2688, -782144577 -> 2671, -575125681 -> 2654, -521118391 -> 2637, -430914369 -> 2620, -290434366 -> 2603, -282781963 -> 2586, -277133239 -> 2569, -173639913 -> 2552, -56598463 -> 2535, 2126 -> 2518, 2564 -> 2501, 2715 -> 2484, 2719 -> 2467, 3483 -> 2450, 73405 -> 2433, 75739 -> 2416, 76779 -> 2399, 78669 -> 2382, 79305 -> 2365, 80618 -> 2348, 88274 -> 2331, 98846 -> 2314, 98848 -> 2297, 99329 -> 2280, 101481 -> 2263, 1513190 -> 2247, 1514184 -> 2231, 1514185 -> 2215, 2436959 -> 2198, 2463773 -> 2181, 2464648 -> 2164, 2689555 -> 2147, 3154429 -> 2130, 3284551 -> 2113, 3351335 -> 2096, 3386211 -> 2079, 41325051 -> 2062, 55178625 -> 2045, 61542055 -> 2029, 65355429 -> 2012, 66214468 -> 1995, 66214470 -> 1978, 66214473 -> 1961, 66215429 -> 1944, 66215431 -> 1927, 66215433 -> 1910, 66216390 -> 1893, 76402249 -> 1876, 76404105 -> 1859, 76404911 -> 1842, 80963634 -> 1825, 82882791 -> 1808, 98715550 -> 1791, 101370885 -> 1774, 102844228 -> 1757, 165221241 -> 1740, 182191441 -> 1723, 245388979 -> 1706, 287431619 -> 1689, 307593612 -> 1672, 308517133 -> 1655, 316215098 -> 1638, 316215116 -> 1621, 316246811 -> 1604, 316246818 -> 1587, 407160593 -> 1570, 507412548 -> 1553, 793982701 -> 1536, 794038622 -> 1519, 794040393 -> 1502, 835649806 -> 1485, 917340916 -> 1468, 958008161 -> 1451, 1060579533 -> 1434, 1150207623 -> 1417, 1176899427 -> 1400, 1280332038 -> 1383, 1306947716 -> 1366, 1349174697 -> 1349, 1522194893 -> 1332, 1691543273 -> 1315, 1709443163 -> 1298, 1865889110 -> 1281, 1906253259 -> 1264, 1977196784 -> 1247, 2006372676 -> 1230, 2029784656 -> 1213, 2030379515 -> 1196, 2033393791 -> 1179, 2047190025 -> 1166, 2047252157 -> 1149, 2048319463 -> 1132, 2048855701 -> 1115
    //   1112: goto -> 3247
    //   1115: aload_1
    //   1116: ldc_w 'HWWAS-H'
    //   1119: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1122: ifeq -> 3247
    //   1125: bipush #55
    //   1127: istore #5
    //   1129: goto -> 3250
    //   1132: aload_1
    //   1133: ldc_w 'HWVNS-H'
    //   1136: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1139: ifeq -> 3247
    //   1142: bipush #54
    //   1144: istore #5
    //   1146: goto -> 3250
    //   1149: aload_1
    //   1150: ldc_w 'ELUGA_Prim'
    //   1153: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1156: ifeq -> 3247
    //   1159: bipush #28
    //   1161: istore #5
    //   1163: goto -> 3250
    //   1166: aload_1
    //   1167: ldc_w 'ELUGA_Note'
    //   1170: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1173: ifeq -> 3247
    //   1176: goto -> 3250
    //   1179: aload_1
    //   1180: ldc_w 'ASUS_X00AD_2'
    //   1183: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1186: ifeq -> 3247
    //   1189: bipush #12
    //   1191: istore #5
    //   1193: goto -> 3250
    //   1196: aload_1
    //   1197: ldc_w 'HWCAM-H'
    //   1200: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1203: ifeq -> 3247
    //   1206: bipush #53
    //   1208: istore #5
    //   1210: goto -> 3250
    //   1213: aload_1
    //   1214: ldc_w 'HWBLN-H'
    //   1217: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1220: ifeq -> 3247
    //   1223: bipush #52
    //   1225: istore #5
    //   1227: goto -> 3250
    //   1230: aload_1
    //   1231: ldc_w 'BRAVIA_ATV3_4K'
    //   1234: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1237: ifeq -> 3247
    //   1240: bipush #16
    //   1242: istore #5
    //   1244: goto -> 3250
    //   1247: aload_1
    //   1248: ldc_w 'Infinix-X572'
    //   1251: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1254: ifeq -> 3247
    //   1257: bipush #58
    //   1259: istore #5
    //   1261: goto -> 3250
    //   1264: aload_1
    //   1265: ldc_w 'PB2-670M'
    //   1268: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1271: ifeq -> 3247
    //   1274: bipush #87
    //   1276: istore #5
    //   1278: goto -> 3250
    //   1281: aload_1
    //   1282: ldc_w 'santoni'
    //   1285: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1288: ifeq -> 3247
    //   1291: bipush #103
    //   1293: istore #5
    //   1295: goto -> 3250
    //   1298: aload_1
    //   1299: ldc_w 'iball8735_9806'
    //   1302: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1305: ifeq -> 3247
    //   1308: bipush #57
    //   1310: istore #5
    //   1312: goto -> 3250
    //   1315: aload_1
    //   1316: ldc_w 'CPH1609'
    //   1319: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1322: ifeq -> 3247
    //   1325: bipush #20
    //   1327: istore #5
    //   1329: goto -> 3250
    //   1332: aload_1
    //   1333: ldc_w 'woods_f'
    //   1336: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1339: ifeq -> 3247
    //   1342: bipush #119
    //   1344: istore #5
    //   1346: goto -> 3250
    //   1349: aload_1
    //   1350: ldc_w 'htc_e56ml_dtul'
    //   1353: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1356: ifeq -> 3247
    //   1359: bipush #50
    //   1361: istore #5
    //   1363: goto -> 3250
    //   1366: aload_1
    //   1367: ldc_w 'EverStar_S'
    //   1370: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1373: ifeq -> 3247
    //   1376: bipush #30
    //   1378: istore #5
    //   1380: goto -> 3250
    //   1383: aload_1
    //   1384: ldc_w 'hwALE-H'
    //   1387: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1390: ifeq -> 3247
    //   1393: bipush #51
    //   1395: istore #5
    //   1397: goto -> 3250
    //   1400: aload_1
    //   1401: ldc_w 'itel_S41'
    //   1404: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1407: ifeq -> 3247
    //   1410: bipush #60
    //   1412: istore #5
    //   1414: goto -> 3250
    //   1417: aload_1
    //   1418: ldc_w 'LS-5017'
    //   1421: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1424: ifeq -> 3247
    //   1427: bipush #67
    //   1429: istore #5
    //   1431: goto -> 3250
    //   1434: aload_1
    //   1435: ldc_w 'panell_d'
    //   1438: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1441: ifeq -> 3247
    //   1444: bipush #83
    //   1446: istore #5
    //   1448: goto -> 3250
    //   1451: aload_1
    //   1452: ldc_w 'j2xlteins'
    //   1455: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1458: ifeq -> 3247
    //   1461: bipush #61
    //   1463: istore #5
    //   1465: goto -> 3250
    //   1468: aload_1
    //   1469: ldc_w 'A7000plus'
    //   1472: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1475: ifeq -> 3247
    //   1478: bipush #8
    //   1480: istore #5
    //   1482: goto -> 3250
    //   1485: aload_1
    //   1486: ldc_w 'manning'
    //   1489: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1492: ifeq -> 3247
    //   1495: bipush #69
    //   1497: istore #5
    //   1499: goto -> 3250
    //   1502: aload_1
    //   1503: ldc_w 'GIONEE_WBL7519'
    //   1506: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1509: ifeq -> 3247
    //   1512: bipush #48
    //   1514: istore #5
    //   1516: goto -> 3250
    //   1519: aload_1
    //   1520: ldc_w 'GIONEE_WBL7365'
    //   1523: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1526: ifeq -> 3247
    //   1529: bipush #47
    //   1531: istore #5
    //   1533: goto -> 3250
    //   1536: aload_1
    //   1537: ldc_w 'GIONEE_WBL5708'
    //   1540: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1543: ifeq -> 3247
    //   1546: bipush #46
    //   1548: istore #5
    //   1550: goto -> 3250
    //   1553: aload_1
    //   1554: ldc_w 'QM16XE_U'
    //   1557: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1560: ifeq -> 3247
    //   1563: bipush #101
    //   1565: istore #5
    //   1567: goto -> 3250
    //   1570: aload_1
    //   1571: ldc_w 'Pixi5-10_4G'
    //   1574: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1577: ifeq -> 3247
    //   1580: bipush #93
    //   1582: istore #5
    //   1584: goto -> 3250
    //   1587: aload_1
    //   1588: ldc_w 'TB3-850M'
    //   1591: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1594: ifeq -> 3247
    //   1597: bipush #111
    //   1599: istore #5
    //   1601: goto -> 3250
    //   1604: aload_1
    //   1605: ldc_w 'TB3-850F'
    //   1608: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1611: ifeq -> 3247
    //   1614: bipush #110
    //   1616: istore #5
    //   1618: goto -> 3250
    //   1621: aload_1
    //   1622: ldc_w 'TB3-730X'
    //   1625: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1628: ifeq -> 3247
    //   1631: bipush #109
    //   1633: istore #5
    //   1635: goto -> 3250
    //   1638: aload_1
    //   1639: ldc_w 'TB3-730F'
    //   1642: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1645: ifeq -> 3247
    //   1648: bipush #108
    //   1650: istore #5
    //   1652: goto -> 3250
    //   1655: aload_1
    //   1656: ldc_w 'A7020a48'
    //   1659: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1662: ifeq -> 3247
    //   1665: bipush #10
    //   1667: istore #5
    //   1669: goto -> 3250
    //   1672: aload_1
    //   1673: ldc_w 'A7010a48'
    //   1676: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1679: ifeq -> 3247
    //   1682: bipush #9
    //   1684: istore #5
    //   1686: goto -> 3250
    //   1689: aload_1
    //   1690: ldc_w 'griffin'
    //   1693: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1696: ifeq -> 3247
    //   1699: bipush #49
    //   1701: istore #5
    //   1703: goto -> 3250
    //   1706: aload_1
    //   1707: ldc_w 'marino_f'
    //   1710: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1713: ifeq -> 3247
    //   1716: bipush #70
    //   1718: istore #5
    //   1720: goto -> 3250
    //   1723: aload_1
    //   1724: ldc_w 'CPY83_I00'
    //   1727: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1730: ifeq -> 3247
    //   1733: bipush #21
    //   1735: istore #5
    //   1737: goto -> 3250
    //   1740: aload_1
    //   1741: ldc_w 'A2016a40'
    //   1744: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1747: ifeq -> 3247
    //   1750: bipush #6
    //   1752: istore #5
    //   1754: goto -> 3250
    //   1757: aload_1
    //   1758: ldc_w 'le_x6'
    //   1761: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1764: ifeq -> 3247
    //   1767: bipush #66
    //   1769: istore #5
    //   1771: goto -> 3250
    //   1774: aload_1
    //   1775: ldc_w 'l5460'
    //   1778: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1781: ifeq -> 3247
    //   1784: bipush #65
    //   1786: istore #5
    //   1788: goto -> 3250
    //   1791: aload_1
    //   1792: ldc_w 'i9031'
    //   1795: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1798: ifeq -> 3247
    //   1801: bipush #56
    //   1803: istore #5
    //   1805: goto -> 3250
    //   1808: aload_1
    //   1809: ldc_w 'X3_HK'
    //   1812: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1815: ifeq -> 3247
    //   1818: bipush #121
    //   1820: istore #5
    //   1822: goto -> 3250
    //   1825: aload_1
    //   1826: ldc_w 'V23GB'
    //   1829: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1832: ifeq -> 3247
    //   1835: bipush #114
    //   1837: istore #5
    //   1839: goto -> 3250
    //   1842: aload_1
    //   1843: ldc_w 'Q4310'
    //   1846: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1849: ifeq -> 3247
    //   1852: bipush #99
    //   1854: istore #5
    //   1856: goto -> 3250
    //   1859: aload_1
    //   1860: ldc_w 'Q4260'
    //   1863: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1866: ifeq -> 3247
    //   1869: bipush #97
    //   1871: istore #5
    //   1873: goto -> 3250
    //   1876: aload_1
    //   1877: ldc_w 'PRO7S'
    //   1880: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1883: ifeq -> 3247
    //   1886: bipush #95
    //   1888: istore #5
    //   1890: goto -> 3250
    //   1893: aload_1
    //   1894: ldc_w 'F3311'
    //   1897: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1900: ifeq -> 3247
    //   1903: bipush #37
    //   1905: istore #5
    //   1907: goto -> 3250
    //   1910: aload_1
    //   1911: ldc_w 'F3215'
    //   1914: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1917: ifeq -> 3247
    //   1920: bipush #36
    //   1922: istore #5
    //   1924: goto -> 3250
    //   1927: aload_1
    //   1928: ldc_w 'F3213'
    //   1931: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1934: ifeq -> 3247
    //   1937: bipush #35
    //   1939: istore #5
    //   1941: goto -> 3250
    //   1944: aload_1
    //   1945: ldc_w 'F3211'
    //   1948: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1951: ifeq -> 3247
    //   1954: bipush #34
    //   1956: istore #5
    //   1958: goto -> 3250
    //   1961: aload_1
    //   1962: ldc_w 'F3116'
    //   1965: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1968: ifeq -> 3247
    //   1971: bipush #33
    //   1973: istore #5
    //   1975: goto -> 3250
    //   1978: aload_1
    //   1979: ldc_w 'F3113'
    //   1982: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1985: ifeq -> 3247
    //   1988: bipush #32
    //   1990: istore #5
    //   1992: goto -> 3250
    //   1995: aload_1
    //   1996: ldc_w 'F3111'
    //   1999: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2002: ifeq -> 3247
    //   2005: bipush #31
    //   2007: istore #5
    //   2009: goto -> 3250
    //   2012: aload_1
    //   2013: ldc_w 'E5643'
    //   2016: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2019: ifeq -> 3247
    //   2022: bipush #25
    //   2024: istore #5
    //   2026: goto -> 3250
    //   2029: aload_1
    //   2030: ldc_w 'A1601'
    //   2033: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2036: ifeq -> 3247
    //   2039: iconst_5
    //   2040: istore #5
    //   2042: goto -> 3250
    //   2045: aload_1
    //   2046: ldc_w 'Aura_Note_2'
    //   2049: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2052: ifeq -> 3247
    //   2055: bipush #13
    //   2057: istore #5
    //   2059: goto -> 3250
    //   2062: aload_1
    //   2063: ldc_w 'MEIZU_M5'
    //   2066: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2069: ifeq -> 3247
    //   2072: bipush #71
    //   2074: istore #5
    //   2076: goto -> 3250
    //   2079: aload_1
    //   2080: ldc_w 'p212'
    //   2083: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2086: ifeq -> 3247
    //   2089: bipush #80
    //   2091: istore #5
    //   2093: goto -> 3250
    //   2096: aload_1
    //   2097: ldc_w 'mido'
    //   2100: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2103: ifeq -> 3247
    //   2106: bipush #73
    //   2108: istore #5
    //   2110: goto -> 3250
    //   2113: aload_1
    //   2114: ldc_w 'kate'
    //   2117: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2120: ifeq -> 3247
    //   2123: bipush #64
    //   2125: istore #5
    //   2127: goto -> 3250
    //   2130: aload_1
    //   2131: ldc_w 'fugu'
    //   2134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2137: ifeq -> 3247
    //   2140: bipush #39
    //   2142: istore #5
    //   2144: goto -> 3250
    //   2147: aload_1
    //   2148: ldc_w 'XE2X'
    //   2151: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2154: ifeq -> 3247
    //   2157: bipush #122
    //   2159: istore #5
    //   2161: goto -> 3250
    //   2164: aload_1
    //   2165: ldc_w 'Q427'
    //   2168: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2171: ifeq -> 3247
    //   2174: bipush #98
    //   2176: istore #5
    //   2178: goto -> 3250
    //   2181: aload_1
    //   2182: ldc_w 'Q350'
    //   2185: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2188: ifeq -> 3247
    //   2191: bipush #96
    //   2193: istore #5
    //   2195: goto -> 3250
    //   2198: aload_1
    //   2199: ldc_w 'P681'
    //   2202: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2205: ifeq -> 3247
    //   2208: bipush #81
    //   2210: istore #5
    //   2212: goto -> 3250
    //   2215: aload_1
    //   2216: ldc_w '1714'
    //   2219: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2222: ifeq -> 3247
    //   2225: iconst_2
    //   2226: istore #5
    //   2228: goto -> 3250
    //   2231: aload_1
    //   2232: ldc_w '1713'
    //   2235: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2238: ifeq -> 3247
    //   2241: iconst_1
    //   2242: istore #5
    //   2244: goto -> 3250
    //   2247: aload_1
    //   2248: ldc_w '1601'
    //   2251: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2254: ifeq -> 3247
    //   2257: iconst_0
    //   2258: istore #5
    //   2260: goto -> 3250
    //   2263: aload_1
    //   2264: ldc_w 'flo'
    //   2267: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2270: ifeq -> 3247
    //   2273: bipush #38
    //   2275: istore #5
    //   2277: goto -> 3250
    //   2280: aload_1
    //   2281: ldc_w 'deb'
    //   2284: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2287: ifeq -> 3247
    //   2290: bipush #24
    //   2292: istore #5
    //   2294: goto -> 3250
    //   2297: aload_1
    //   2298: ldc_w 'cv3'
    //   2301: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2304: ifeq -> 3247
    //   2307: bipush #23
    //   2309: istore #5
    //   2311: goto -> 3250
    //   2314: aload_1
    //   2315: ldc_w 'cv1'
    //   2318: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2321: ifeq -> 3247
    //   2324: bipush #22
    //   2326: istore #5
    //   2328: goto -> 3250
    //   2331: aload_1
    //   2332: ldc_w 'Z80'
    //   2335: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2338: ifeq -> 3247
    //   2341: bipush #125
    //   2343: istore #5
    //   2345: goto -> 3250
    //   2348: aload_1
    //   2349: ldc_w 'QX1'
    //   2352: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2355: ifeq -> 3247
    //   2358: bipush #102
    //   2360: istore #5
    //   2362: goto -> 3250
    //   2365: aload_1
    //   2366: ldc_w 'PLE'
    //   2369: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2372: ifeq -> 3247
    //   2375: bipush #94
    //   2377: istore #5
    //   2379: goto -> 3250
    //   2382: aload_1
    //   2383: ldc_w 'P85'
    //   2386: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2389: ifeq -> 3247
    //   2392: bipush #82
    //   2394: istore #5
    //   2396: goto -> 3250
    //   2399: aload_1
    //   2400: ldc_w 'MX6'
    //   2403: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2406: ifeq -> 3247
    //   2409: bipush #74
    //   2411: istore #5
    //   2413: goto -> 3250
    //   2416: aload_1
    //   2417: ldc_w 'M5c'
    //   2420: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2423: ifeq -> 3247
    //   2426: bipush #68
    //   2428: istore #5
    //   2430: goto -> 3250
    //   2433: aload_1
    //   2434: ldc_w 'JGZ'
    //   2437: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2440: ifeq -> 3247
    //   2443: bipush #62
    //   2445: istore #5
    //   2447: goto -> 3250
    //   2450: aload_1
    //   2451: ldc_w 'mh'
    //   2454: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2457: ifeq -> 3247
    //   2460: bipush #72
    //   2462: istore #5
    //   2464: goto -> 3250
    //   2467: aload_1
    //   2468: ldc_w 'V5'
    //   2471: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2474: ifeq -> 3247
    //   2477: bipush #115
    //   2479: istore #5
    //   2481: goto -> 3250
    //   2484: aload_1
    //   2485: ldc_w 'V1'
    //   2488: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2491: ifeq -> 3247
    //   2494: bipush #113
    //   2496: istore #5
    //   2498: goto -> 3250
    //   2501: aload_1
    //   2502: ldc_w 'Q5'
    //   2505: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2508: ifeq -> 3247
    //   2511: bipush #100
    //   2513: istore #5
    //   2515: goto -> 3250
    //   2518: aload_1
    //   2519: ldc_w 'C1'
    //   2522: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2525: ifeq -> 3247
    //   2528: bipush #17
    //   2530: istore #5
    //   2532: goto -> 3250
    //   2535: aload_1
    //   2536: ldc_w 'woods_fn'
    //   2539: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2542: ifeq -> 3247
    //   2545: bipush #120
    //   2547: istore #5
    //   2549: goto -> 3250
    //   2552: aload_1
    //   2553: ldc_w 'ELUGA_A3_Pro'
    //   2556: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2559: ifeq -> 3247
    //   2562: bipush #26
    //   2564: istore #5
    //   2566: goto -> 3250
    //   2569: aload_1
    //   2570: ldc_w 'Z12_PRO'
    //   2573: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2576: ifeq -> 3247
    //   2579: bipush #124
    //   2581: istore #5
    //   2583: goto -> 3250
    //   2586: aload_1
    //   2587: ldc_w 'BLACK-1X'
    //   2590: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2593: ifeq -> 3247
    //   2596: bipush #14
    //   2598: istore #5
    //   2600: goto -> 3250
    //   2603: aload_1
    //   2604: ldc_w 'taido_row'
    //   2607: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2610: ifeq -> 3247
    //   2613: bipush #107
    //   2615: istore #5
    //   2617: goto -> 3250
    //   2620: aload_1
    //   2621: ldc_w 'Pixi4-7_3G'
    //   2624: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2627: ifeq -> 3247
    //   2630: bipush #92
    //   2632: istore #5
    //   2634: goto -> 3250
    //   2637: aload_1
    //   2638: ldc_w 'GIONEE_GBL7360'
    //   2641: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2644: ifeq -> 3247
    //   2647: bipush #42
    //   2649: istore #5
    //   2651: goto -> 3250
    //   2654: aload_1
    //   2655: ldc_w 'GiONEE_CBL7513'
    //   2658: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2661: ifeq -> 3247
    //   2664: bipush #40
    //   2666: istore #5
    //   2668: goto -> 3250
    //   2671: aload_1
    //   2672: ldc_w 'OnePlus5T'
    //   2675: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2678: ifeq -> 3247
    //   2681: bipush #79
    //   2683: istore #5
    //   2685: goto -> 3250
    //   2688: aload_1
    //   2689: ldc_w 'whyred'
    //   2692: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2695: ifeq -> 3247
    //   2698: bipush #118
    //   2700: istore #5
    //   2702: goto -> 3250
    //   2705: aload_1
    //   2706: ldc_w 'watson'
    //   2709: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2712: ifeq -> 3247
    //   2715: bipush #117
    //   2717: istore #5
    //   2719: goto -> 3250
    //   2722: aload_1
    //   2723: ldc_w 'SVP-DTV15'
    //   2726: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2729: ifeq -> 3247
    //   2732: bipush #105
    //   2734: istore #5
    //   2736: goto -> 3250
    //   2739: aload_1
    //   2740: ldc_w 'A7000-a'
    //   2743: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2746: ifeq -> 3247
    //   2749: bipush #7
    //   2751: istore #5
    //   2753: goto -> 3250
    //   2756: aload_1
    //   2757: ldc_w 'nicklaus_f'
    //   2760: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2763: ifeq -> 3247
    //   2766: bipush #76
    //   2768: istore #5
    //   2770: goto -> 3250
    //   2773: aload_1
    //   2774: ldc_w 'tcl_eu'
    //   2777: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2780: ifeq -> 3247
    //   2783: bipush #112
    //   2785: istore #5
    //   2787: goto -> 3250
    //   2790: aload_1
    //   2791: ldc_w 'ELUGA_Ray_X'
    //   2794: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2797: ifeq -> 3247
    //   2800: bipush #29
    //   2802: istore #5
    //   2804: goto -> 3250
    //   2807: aload_1
    //   2808: ldc_w 's905x018'
    //   2811: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2814: ifeq -> 3247
    //   2817: bipush #106
    //   2819: istore #5
    //   2821: goto -> 3250
    //   2824: aload_1
    //   2825: ldc_w 'A10-70L'
    //   2828: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2831: ifeq -> 3247
    //   2834: iconst_4
    //   2835: istore #5
    //   2837: goto -> 3250
    //   2840: aload_1
    //   2841: ldc_w 'A10-70F'
    //   2844: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2847: ifeq -> 3247
    //   2850: iconst_3
    //   2851: istore #5
    //   2853: goto -> 3250
    //   2856: aload_1
    //   2857: ldc_w 'namath'
    //   2860: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2863: ifeq -> 3247
    //   2866: bipush #75
    //   2868: istore #5
    //   2870: goto -> 3250
    //   2873: aload_1
    //   2874: ldc_w 'Slate_Pro'
    //   2877: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2880: ifeq -> 3247
    //   2883: bipush #104
    //   2885: istore #5
    //   2887: goto -> 3250
    //   2890: aload_1
    //   2891: ldc_w 'iris60'
    //   2894: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2897: ifeq -> 3247
    //   2900: bipush #59
    //   2902: istore #5
    //   2904: goto -> 3250
    //   2907: aload_1
    //   2908: ldc_w 'BRAVIA_ATV2'
    //   2911: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2914: ifeq -> 3247
    //   2917: bipush #15
    //   2919: istore #5
    //   2921: goto -> 3250
    //   2924: aload_1
    //   2925: ldc_w 'GiONEE_GBL7319'
    //   2928: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2931: ifeq -> 3247
    //   2934: bipush #41
    //   2936: istore #5
    //   2938: goto -> 3250
    //   2941: aload_1
    //   2942: ldc_w 'panell_dt'
    //   2945: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2948: ifeq -> 3247
    //   2951: bipush #86
    //   2953: istore #5
    //   2955: goto -> 3250
    //   2958: aload_1
    //   2959: ldc_w 'panell_ds'
    //   2962: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2965: ifeq -> 3247
    //   2968: bipush #85
    //   2970: istore #5
    //   2972: goto -> 3250
    //   2975: aload_1
    //   2976: ldc_w 'panell_dl'
    //   2979: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2982: ifeq -> 3247
    //   2985: bipush #84
    //   2987: istore #5
    //   2989: goto -> 3250
    //   2992: aload_1
    //   2993: ldc_w 'vernee_M5'
    //   2996: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2999: ifeq -> 3247
    //   3002: bipush #116
    //   3004: istore #5
    //   3006: goto -> 3250
    //   3009: aload_1
    //   3010: ldc_w 'Phantom6'
    //   3013: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3016: ifeq -> 3247
    //   3019: bipush #91
    //   3021: istore #5
    //   3023: goto -> 3250
    //   3026: aload_1
    //   3027: ldc_w 'ComioS1'
    //   3030: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3033: ifeq -> 3247
    //   3036: bipush #18
    //   3038: istore #5
    //   3040: goto -> 3250
    //   3043: aload_1
    //   3044: ldc_w 'XT1663'
    //   3047: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3050: ifeq -> 3247
    //   3053: bipush #123
    //   3055: istore #5
    //   3057: goto -> 3250
    //   3060: aload_1
    //   3061: ldc_w 'AquaPowerM'
    //   3064: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3067: ifeq -> 3247
    //   3070: bipush #11
    //   3072: istore #5
    //   3074: goto -> 3250
    //   3077: aload_1
    //   3078: ldc_w 'PGN611'
    //   3081: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3084: ifeq -> 3247
    //   3087: bipush #90
    //   3089: istore #5
    //   3091: goto -> 3250
    //   3094: aload_1
    //   3095: ldc_w 'PGN610'
    //   3098: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3101: ifeq -> 3247
    //   3104: bipush #89
    //   3106: istore #5
    //   3108: goto -> 3250
    //   3111: aload_1
    //   3112: ldc_w 'PGN528'
    //   3115: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3118: ifeq -> 3247
    //   3121: bipush #88
    //   3123: istore #5
    //   3125: goto -> 3250
    //   3128: aload_1
    //   3129: ldc_w 'NX573J'
    //   3132: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3135: ifeq -> 3247
    //   3138: bipush #78
    //   3140: istore #5
    //   3142: goto -> 3250
    //   3145: aload_1
    //   3146: ldc_w 'NX541J'
    //   3149: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3152: ifeq -> 3247
    //   3155: bipush #77
    //   3157: istore #5
    //   3159: goto -> 3250
    //   3162: aload_1
    //   3163: ldc_w 'CP8676_I02'
    //   3166: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3169: ifeq -> 3247
    //   3172: bipush #19
    //   3174: istore #5
    //   3176: goto -> 3250
    //   3179: aload_1
    //   3180: ldc_w 'K50a40'
    //   3183: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3186: ifeq -> 3247
    //   3189: bipush #63
    //   3191: istore #5
    //   3193: goto -> 3250
    //   3196: aload_1
    //   3197: ldc_w 'GIONEE_SWW1631'
    //   3200: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3203: ifeq -> 3247
    //   3206: bipush #45
    //   3208: istore #5
    //   3210: goto -> 3250
    //   3213: aload_1
    //   3214: ldc_w 'GIONEE_SWW1627'
    //   3217: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3220: ifeq -> 3247
    //   3223: bipush #44
    //   3225: istore #5
    //   3227: goto -> 3250
    //   3230: aload_1
    //   3231: ldc_w 'GIONEE_SWW1609'
    //   3234: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3237: ifeq -> 3247
    //   3240: bipush #43
    //   3242: istore #5
    //   3244: goto -> 3250
    //   3247: iconst_m1
    //   3248: istore #5
    //   3250: iload #5
    //   3252: tableswitch default -> 3772, 0 -> 3775, 1 -> 3775, 2 -> 3775, 3 -> 3775, 4 -> 3775, 5 -> 3775, 6 -> 3775, 7 -> 3775, 8 -> 3775, 9 -> 3775, 10 -> 3775, 11 -> 3775, 12 -> 3775, 13 -> 3775, 14 -> 3775, 15 -> 3775, 16 -> 3775, 17 -> 3775, 18 -> 3775, 19 -> 3775, 20 -> 3775, 21 -> 3775, 22 -> 3775, 23 -> 3775, 24 -> 3775, 25 -> 3775, 26 -> 3775, 27 -> 3775, 28 -> 3775, 29 -> 3775, 30 -> 3775, 31 -> 3775, 32 -> 3775, 33 -> 3775, 34 -> 3775, 35 -> 3775, 36 -> 3775, 37 -> 3775, 38 -> 3775, 39 -> 3775, 40 -> 3775, 41 -> 3775, 42 -> 3775, 43 -> 3775, 44 -> 3775, 45 -> 3775, 46 -> 3775, 47 -> 3775, 48 -> 3775, 49 -> 3775, 50 -> 3775, 51 -> 3775, 52 -> 3775, 53 -> 3775, 54 -> 3775, 55 -> 3775, 56 -> 3775, 57 -> 3775, 58 -> 3775, 59 -> 3775, 60 -> 3775, 61 -> 3775, 62 -> 3775, 63 -> 3775, 64 -> 3775, 65 -> 3775, 66 -> 3775, 67 -> 3775, 68 -> 3775, 69 -> 3775, 70 -> 3775, 71 -> 3775, 72 -> 3775, 73 -> 3775, 74 -> 3775, 75 -> 3775, 76 -> 3775, 77 -> 3775, 78 -> 3775, 79 -> 3775, 80 -> 3775, 81 -> 3775, 82 -> 3775, 83 -> 3775, 84 -> 3775, 85 -> 3775, 86 -> 3775, 87 -> 3775, 88 -> 3775, 89 -> 3775, 90 -> 3775, 91 -> 3775, 92 -> 3775, 93 -> 3775, 94 -> 3775, 95 -> 3775, 96 -> 3775, 97 -> 3775, 98 -> 3775, 99 -> 3775, 100 -> 3775, 101 -> 3775, 102 -> 3775, 103 -> 3775, 104 -> 3775, 105 -> 3775, 106 -> 3775, 107 -> 3775, 108 -> 3775, 109 -> 3775, 110 -> 3775, 111 -> 3775, 112 -> 3775, 113 -> 3775, 114 -> 3775, 115 -> 3775, 116 -> 3775, 117 -> 3775, 118 -> 3775, 119 -> 3775, 120 -> 3775, 121 -> 3775, 122 -> 3775, 123 -> 3775, 124 -> 3775, 125 -> 3775
    //   3772: goto -> 3779
    //   3775: iconst_1
    //   3776: putstatic com/google/android/exoplayer2/video/MediaCodecVideoRenderer.w0 : Z
    //   3779: getstatic com/google/android/exoplayer2/util/h0.d : Ljava/lang/String;
    //   3782: astore_1
    //   3783: aload_1
    //   3784: invokevirtual hashCode : ()I
    //   3787: istore #5
    //   3789: iload #5
    //   3791: ldc_w -594534941
    //   3794: if_icmpeq -> 3848
    //   3797: iload #5
    //   3799: ldc_w 2006354
    //   3802: if_icmpeq -> 3832
    //   3805: iload #5
    //   3807: ldc_w 2006367
    //   3810: if_icmpeq -> 3816
    //   3813: goto -> 3864
    //   3816: aload_1
    //   3817: ldc_w 'AFTN'
    //   3820: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3823: ifeq -> 3864
    //   3826: iconst_1
    //   3827: istore #5
    //   3829: goto -> 3867
    //   3832: aload_1
    //   3833: ldc_w 'AFTA'
    //   3836: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3839: ifeq -> 3864
    //   3842: iload_3
    //   3843: istore #5
    //   3845: goto -> 3867
    //   3848: aload_1
    //   3849: ldc_w 'JSN-L21'
    //   3852: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3855: ifeq -> 3864
    //   3858: iconst_2
    //   3859: istore #5
    //   3861: goto -> 3867
    //   3864: iconst_m1
    //   3865: istore #5
    //   3867: iload #5
    //   3869: ifeq -> 3887
    //   3872: iload #5
    //   3874: iconst_1
    //   3875: if_icmpeq -> 3887
    //   3878: iload #5
    //   3880: iconst_2
    //   3881: if_icmpeq -> 3887
    //   3884: goto -> 3891
    //   3887: iconst_1
    //   3888: putstatic com/google/android/exoplayer2/video/MediaCodecVideoRenderer.w0 : Z
    //   3891: iconst_1
    //   3892: putstatic com/google/android/exoplayer2/video/MediaCodecVideoRenderer.v0 : Z
    //   3895: ldc com/google/android/exoplayer2/video/MediaCodecVideoRenderer
    //   3897: monitorexit
    //   3898: getstatic com/google/android/exoplayer2/video/MediaCodecVideoRenderer.w0 : Z
    //   3901: ireturn
    //   3902: astore_1
    //   3903: ldc com/google/android/exoplayer2/video/MediaCodecVideoRenderer
    //   3905: monitorexit
    //   3906: aload_1
    //   3907: athrow
    // Exception table:
    //   from	to	target	type
    //   19	43	3902	finally
    //   46	51	3902	finally
    //   62	76	3902	finally
    //   89	1112	3902	finally
    //   1115	1125	3902	finally
    //   1132	1142	3902	finally
    //   1149	1159	3902	finally
    //   1166	1176	3902	finally
    //   1179	1189	3902	finally
    //   1196	1206	3902	finally
    //   1213	1223	3902	finally
    //   1230	1240	3902	finally
    //   1247	1257	3902	finally
    //   1264	1274	3902	finally
    //   1281	1291	3902	finally
    //   1298	1308	3902	finally
    //   1315	1325	3902	finally
    //   1332	1342	3902	finally
    //   1349	1359	3902	finally
    //   1366	1376	3902	finally
    //   1383	1393	3902	finally
    //   1400	1410	3902	finally
    //   1417	1427	3902	finally
    //   1434	1444	3902	finally
    //   1451	1461	3902	finally
    //   1468	1478	3902	finally
    //   1485	1495	3902	finally
    //   1502	1512	3902	finally
    //   1519	1529	3902	finally
    //   1536	1546	3902	finally
    //   1553	1563	3902	finally
    //   1570	1580	3902	finally
    //   1587	1597	3902	finally
    //   1604	1614	3902	finally
    //   1621	1631	3902	finally
    //   1638	1648	3902	finally
    //   1655	1665	3902	finally
    //   1672	1682	3902	finally
    //   1689	1699	3902	finally
    //   1706	1716	3902	finally
    //   1723	1733	3902	finally
    //   1740	1750	3902	finally
    //   1757	1767	3902	finally
    //   1774	1784	3902	finally
    //   1791	1801	3902	finally
    //   1808	1818	3902	finally
    //   1825	1835	3902	finally
    //   1842	1852	3902	finally
    //   1859	1869	3902	finally
    //   1876	1886	3902	finally
    //   1893	1903	3902	finally
    //   1910	1920	3902	finally
    //   1927	1937	3902	finally
    //   1944	1954	3902	finally
    //   1961	1971	3902	finally
    //   1978	1988	3902	finally
    //   1995	2005	3902	finally
    //   2012	2022	3902	finally
    //   2029	2039	3902	finally
    //   2045	2055	3902	finally
    //   2062	2072	3902	finally
    //   2079	2089	3902	finally
    //   2096	2106	3902	finally
    //   2113	2123	3902	finally
    //   2130	2140	3902	finally
    //   2147	2157	3902	finally
    //   2164	2174	3902	finally
    //   2181	2191	3902	finally
    //   2198	2208	3902	finally
    //   2215	2225	3902	finally
    //   2231	2241	3902	finally
    //   2247	2257	3902	finally
    //   2263	2273	3902	finally
    //   2280	2290	3902	finally
    //   2297	2307	3902	finally
    //   2314	2324	3902	finally
    //   2331	2341	3902	finally
    //   2348	2358	3902	finally
    //   2365	2375	3902	finally
    //   2382	2392	3902	finally
    //   2399	2409	3902	finally
    //   2416	2426	3902	finally
    //   2433	2443	3902	finally
    //   2450	2460	3902	finally
    //   2467	2477	3902	finally
    //   2484	2494	3902	finally
    //   2501	2511	3902	finally
    //   2518	2528	3902	finally
    //   2535	2545	3902	finally
    //   2552	2562	3902	finally
    //   2569	2579	3902	finally
    //   2586	2596	3902	finally
    //   2603	2613	3902	finally
    //   2620	2630	3902	finally
    //   2637	2647	3902	finally
    //   2654	2664	3902	finally
    //   2671	2681	3902	finally
    //   2688	2698	3902	finally
    //   2705	2715	3902	finally
    //   2722	2732	3902	finally
    //   2739	2749	3902	finally
    //   2756	2766	3902	finally
    //   2773	2783	3902	finally
    //   2790	2800	3902	finally
    //   2807	2817	3902	finally
    //   2824	2834	3902	finally
    //   2840	2850	3902	finally
    //   2856	2866	3902	finally
    //   2873	2883	3902	finally
    //   2890	2900	3902	finally
    //   2907	2917	3902	finally
    //   2924	2934	3902	finally
    //   2941	2951	3902	finally
    //   2958	2968	3902	finally
    //   2975	2985	3902	finally
    //   2992	3002	3902	finally
    //   3009	3019	3902	finally
    //   3026	3036	3902	finally
    //   3043	3053	3902	finally
    //   3060	3070	3902	finally
    //   3077	3087	3902	finally
    //   3094	3104	3902	finally
    //   3111	3121	3902	finally
    //   3128	3138	3902	finally
    //   3145	3155	3902	finally
    //   3162	3172	3902	finally
    //   3179	3189	3902	finally
    //   3196	3206	3902	finally
    //   3213	3223	3902	finally
    //   3230	3240	3902	finally
    //   3775	3779	3902	finally
    //   3779	3789	3902	finally
    //   3816	3826	3902	finally
    //   3832	3842	3902	finally
    //   3848	3858	3902	finally
    //   3887	3891	3902	finally
    //   3891	3895	3902	finally
    //   3895	3898	3902	finally
    //   3903	3906	3902	finally
  }
  
  protected boolean f0() {
    try {
      return super.f0();
    } finally {
      this.R0 = 0;
    } 
  }
  
  protected void h1(MediaCodec paramMediaCodec, int paramInt, long paramLong) {
    f0.a("dropVideoBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, false);
    f0.c();
    L1(1);
  }
  
  protected boolean k0() {
    boolean bool;
    if (this.e1 && h0.a < 23) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected a k1(e parame, Format paramFormat, Format[] paramArrayOfFormat) {
    int i = paramFormat.o;
    int j = paramFormat.p;
    int k = m1(parame, paramFormat);
    if (paramArrayOfFormat.length == 1) {
      int i6 = k;
      if (k != -1) {
        int i7 = i1(parame, paramFormat.j, paramFormat.o, paramFormat.p);
        i6 = k;
        if (i7 != -1)
          i6 = Math.min((int)(k * 1.5F), i7); 
      } 
      return new a(i, j, i6);
    } 
    int i3 = paramArrayOfFormat.length;
    int i2 = 0;
    int i4 = 0;
    int i1 = j;
    while (i2 < i3) {
      Format format = paramArrayOfFormat[i2];
      int i6 = i;
      int i7 = i1;
      int i8 = k;
      j = i4;
      if (parame.o(paramFormat, format, false)) {
        i8 = format.o;
        if (i8 == -1 || format.p == -1) {
          j = 1;
        } else {
          j = 0;
        } 
        j = i4 | j;
        i6 = Math.max(i, i8);
        i7 = Math.max(i1, format.p);
        i8 = Math.max(k, m1(parame, format));
      } 
      i2++;
      i = i6;
      i1 = i7;
      k = i8;
      i4 = j;
    } 
    int i5 = i;
    j = i1;
    i2 = k;
    if (i4 != 0) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Resolutions unknown. Codec max resolution: ");
      stringBuilder.append(i);
      stringBuilder.append("x");
      stringBuilder.append(i1);
      o.f("MediaCodecVideoRenderer", stringBuilder.toString());
      Point point = j1(parame, paramFormat);
      i5 = i;
      j = i1;
      i2 = k;
      if (point != null) {
        i5 = Math.max(i, point.x);
        j = Math.max(i1, point.y);
        i2 = Math.max(k, i1(parame, paramFormat.j, i5, j));
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Codec max resolution adjusted to: ");
        stringBuilder1.append(i5);
        stringBuilder1.append("x");
        stringBuilder1.append(j);
        o.f("MediaCodecVideoRenderer", stringBuilder1.toString());
      } 
    } 
    return new a(i5, j, i2);
  }
  
  protected float l0(float paramFloat, Format paramFormat, Format[] paramArrayOfFormat) {
    int i = paramArrayOfFormat.length;
    float f1 = -1.0F;
    byte b1 = 0;
    float f2;
    for (f2 = -1.0F; b1 < i; f2 = f4) {
      float f3 = (paramArrayOfFormat[b1]).q;
      float f4 = f2;
      if (f3 != -1.0F)
        f4 = Math.max(f2, f3); 
      b1++;
    } 
    if (f2 == -1.0F) {
      paramFloat = f1;
    } else {
      paramFloat = f2 * paramFloat;
    } 
    return paramFloat;
  }
  
  public boolean m() {
    if (super.m())
      if (!this.L0) {
        Surface surface = this.J0;
        if ((surface != null && this.I0 == surface) || h0() == null || this.e1) {
          this.N0 = -9223372036854775807L;
          return true;
        } 
      } else {
        this.N0 = -9223372036854775807L;
        return true;
      }  
    if (this.N0 == -9223372036854775807L)
      return false; 
    if (SystemClock.elapsedRealtime() < this.N0)
      return true; 
    this.N0 = -9223372036854775807L;
    return false;
  }
  
  protected List<e> m0(f paramf, Format paramFormat, boolean paramBoolean) {
    return l1(paramf, paramFormat, paramBoolean, this.e1);
  }
  
  @SuppressLint({"InlinedApi"})
  protected MediaFormat n1(Format paramFormat, String paramString, a parama, float paramFloat, boolean paramBoolean, int paramInt) {
    MediaFormat mediaFormat = new MediaFormat();
    mediaFormat.setString("mime", paramString);
    mediaFormat.setInteger("width", paramFormat.o);
    mediaFormat.setInteger("height", paramFormat.p);
    g.e(mediaFormat, paramFormat.l);
    g.c(mediaFormat, "frame-rate", paramFormat.q);
    g.d(mediaFormat, "rotation-degrees", paramFormat.r);
    g.b(mediaFormat, paramFormat.v);
    if ("video/dolby-vision".equals(paramFormat.j)) {
      Pair pair = MediaCodecUtil.h(paramFormat);
      if (pair != null)
        g.d(mediaFormat, "profile", ((Integer)pair.first).intValue()); 
    } 
    mediaFormat.setInteger("max-width", parama.a);
    mediaFormat.setInteger("max-height", parama.b);
    g.d(mediaFormat, "max-input-size", parama.c);
    if (h0.a >= 23) {
      mediaFormat.setInteger("priority", 0);
      if (paramFloat != -1.0F)
        mediaFormat.setFloat("operating-rate", paramFloat); 
    } 
    if (paramBoolean) {
      mediaFormat.setInteger("no-post-process", 1);
      mediaFormat.setInteger("auto-frc", 0);
    } 
    if (paramInt != 0)
      f1(mediaFormat, paramInt); 
    return mediaFormat;
  }
  
  protected boolean q1(MediaCodec paramMediaCodec, int paramInt, long paramLong1, long paramLong2, boolean paramBoolean) {
    paramInt = M(paramLong2);
    if (paramInt == 0)
      return false; 
    d d = this.t0;
    d.i++;
    paramInt = this.R0 + paramInt;
    if (paramBoolean) {
      d.f += paramInt;
    } else {
      L1(paramInt);
    } 
    e0();
    return true;
  }
  
  protected void r0(e parame) {
    if (!this.H0)
      return; 
    ByteBuffer byteBuffer = (ByteBuffer)e.e(parame.e);
    if (byteBuffer.remaining() >= 7) {
      byte b1 = byteBuffer.get();
      short s1 = byteBuffer.getShort();
      short s2 = byteBuffer.getShort();
      byte b2 = byteBuffer.get();
      byte b3 = byteBuffer.get();
      byteBuffer.position(0);
      if (b1 == -75 && s1 == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
        byte[] arrayOfByte = new byte[byteBuffer.remaining()];
        byteBuffer.get(arrayOfByte);
        byteBuffer.position(0);
        C1(h0(), arrayOfByte);
      } 
    } 
  }
  
  void s1() {
    if (!this.L0) {
      this.L0 = true;
      this.z0.t(this.I0);
    } 
  }
  
  protected void x1(long paramLong) {
    Format format = Z0(paramLong);
    if (format != null)
      z1(h0(), format.o, format.p); 
    t1();
    s1();
    D0(paramLong);
  }
  
  public static final class VideoDecoderException extends MediaCodecRenderer.DecoderException {
    public final boolean isSurfaceValid;
    
    public final int surfaceIdentityHashCode;
    
    public VideoDecoderException(Throwable param1Throwable, e param1e, Surface param1Surface) {
      super(param1Throwable, param1e);
      boolean bool;
      this.surfaceIdentityHashCode = System.identityHashCode(param1Surface);
      if (param1Surface == null || param1Surface.isValid()) {
        bool = true;
      } else {
        bool = false;
      } 
      this.isSurfaceValid = bool;
    }
  }
  
  protected static final class a {
    public final int a;
    
    public final int b;
    
    public final int c;
    
    public a(int param1Int1, int param1Int2, int param1Int3) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
    }
  }
  
  @TargetApi(23)
  private final class b implements MediaCodec.OnFrameRenderedListener, Handler.Callback {
    private final Handler b;
    
    public b(MediaCodecVideoRenderer this$0, MediaCodec param1MediaCodec) {
      Handler handler = new Handler(this);
      this.b = handler;
      param1MediaCodec.setOnFrameRenderedListener(this, handler);
    }
    
    private void a(long param1Long) {
      MediaCodecVideoRenderer mediaCodecVideoRenderer = this.c;
      if (this != mediaCodecVideoRenderer.g1)
        return; 
      if (param1Long == Long.MAX_VALUE) {
        MediaCodecVideoRenderer.a1(mediaCodecVideoRenderer);
      } else {
        mediaCodecVideoRenderer.x1(param1Long);
      } 
    }
    
    public boolean handleMessage(Message param1Message) {
      if (param1Message.what != 0)
        return false; 
      a(h0.t0(param1Message.arg1, param1Message.arg2));
      return true;
    }
    
    public void onFrameRendered(MediaCodec param1MediaCodec, long param1Long1, long param1Long2) {
      if (h0.a < 30) {
        Message message = Message.obtain(this.b, 0, (int)(param1Long1 >> 32L), (int)param1Long1);
        this.b.sendMessageAtFrontOfQueue(message);
      } else {
        a(param1Long1);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/MediaCodecVideoRenderer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */