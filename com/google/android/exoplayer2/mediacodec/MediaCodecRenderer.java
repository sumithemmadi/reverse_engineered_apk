package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1.d;
import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.o;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.d0;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.v;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public abstract class MediaCodecRenderer extends u {
  private static final byte[] m = new byte[] { 
      0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 
      0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 
      1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 
      47, -65, 28, 49, -61, 39, 93, 120 };
  
  private DrmSession<o> A;
  
  private DrmSession<o> B;
  
  private MediaCrypto C;
  
  private boolean D;
  
  private long E;
  
  private float F;
  
  private MediaCodec G;
  
  private Format H;
  
  private float I;
  
  private ArrayDeque<e> J;
  
  private DecoderInitializationException K;
  
  private e L;
  
  private int M;
  
  private boolean N;
  
  private boolean O;
  
  private boolean P;
  
  private boolean Q;
  
  private boolean R;
  
  private boolean S;
  
  private boolean T;
  
  private boolean U;
  
  private boolean V;
  
  private ByteBuffer[] W;
  
  private ByteBuffer[] X;
  
  private long Y;
  
  private int Z;
  
  private int a0;
  
  private ByteBuffer b0;
  
  private boolean c0;
  
  private boolean d0;
  
  private boolean e0;
  
  private int f0;
  
  private int g0;
  
  private int h0;
  
  private boolean i0;
  
  private boolean j0;
  
  private long k0;
  
  private long l0;
  
  private boolean m0;
  
  private final f n;
  
  private boolean n0;
  
  private final k<o> o;
  
  private boolean o0;
  
  private final boolean p;
  
  private boolean p0;
  
  private final boolean q;
  
  private boolean q0;
  
  private final float r;
  
  private boolean r0;
  
  private final e s;
  
  private boolean s0;
  
  private final e t;
  
  protected d t0;
  
  private final d0<Format> u;
  
  private final ArrayList<Long> v;
  
  private final MediaCodec.BufferInfo w;
  
  private boolean x;
  
  private Format y;
  
  private Format z;
  
  public MediaCodecRenderer(int paramInt, f paramf, k<o> paramk, boolean paramBoolean1, boolean paramBoolean2, float paramFloat) {
    super(paramInt);
    this.n = (f)e.e(paramf);
    this.o = paramk;
    this.p = paramBoolean1;
    this.q = paramBoolean2;
    this.r = paramFloat;
    this.s = new e(0);
    this.t = e.r();
    this.u = new d0();
    this.v = new ArrayList<Long>();
    this.w = new MediaCodec.BufferInfo();
    this.f0 = 0;
    this.g0 = 0;
    this.h0 = 0;
    this.I = -1.0F;
    this.F = 1.0F;
    this.E = -9223372036854775807L;
  }
  
  private void F0() {
    int i = this.h0;
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          this.n0 = true;
          M0();
        } else {
          K0();
        } 
      } else {
        Y0();
      } 
    } else {
      e0();
    } 
  }
  
  private void H0() {
    if (h0.a < 21)
      this.X = this.G.getOutputBuffers(); 
  }
  
  private void I0() {
    MediaFormat mediaFormat = this.G.getOutputFormat();
    if (this.M != 0 && mediaFormat.getInteger("width") == 32 && mediaFormat.getInteger("height") == 32) {
      this.U = true;
      return;
    } 
    if (this.S)
      mediaFormat.setInteger("channel-count", 1); 
    C0(this.G, mediaFormat);
  }
  
  private boolean J0(boolean paramBoolean) {
    f0 f0 = h();
    this.t.clear();
    int i = L(f0, this.t, paramBoolean);
    if (i == -5) {
      B0(f0);
      return true;
    } 
    if (i == -4 && this.t.isEndOfStream()) {
      this.m0 = true;
      F0();
    } 
    return false;
  }
  
  private void K0() {
    L0();
    x0();
  }
  
  private void N0() {
    if (h0.a < 21) {
      this.W = null;
      this.X = null;
    } 
  }
  
  private void O0() {
    this.Z = -1;
    this.s.c = null;
  }
  
  private int P(String paramString) {
    int i = h0.a;
    if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(paramString)) {
      String str = h0.d;
      if (str.startsWith("SM-T585") || str.startsWith("SM-A510") || str.startsWith("SM-A520") || str.startsWith("SM-J700"))
        return 2; 
    } 
    if (i < 24 && ("OMX.Nvidia.h264.decode".equals(paramString) || "OMX.Nvidia.h264.decode.secure".equals(paramString))) {
      paramString = h0.b;
      if ("flounder".equals(paramString) || "flounder_lte".equals(paramString) || "grouper".equals(paramString) || "tilapia".equals(paramString))
        return 1; 
    } 
    return 0;
  }
  
  private void P0() {
    this.a0 = -1;
    this.b0 = null;
  }
  
  private static boolean Q(String paramString, Format paramFormat) {
    boolean bool;
    if (h0.a < 21 && paramFormat.l.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(paramString)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void Q0(DrmSession<o> paramDrmSession) {
    i.a(this.A, paramDrmSession);
    this.A = paramDrmSession;
  }
  
  private static boolean R(String paramString) {
    int i = h0.a;
    if (i > 23 || !"OMX.google.vorbis.decoder".equals(paramString)) {
      if (i <= 19) {
        String str = h0.b;
        if (("hb2000".equals(str) || "stvm8".equals(str)) && ("OMX.amlogic.avc.decoder.awesome".equals(paramString) || "OMX.amlogic.avc.decoder.awesome.secure".equals(paramString)))
          return true; 
      } 
      return false;
    } 
    return true;
  }
  
  private static boolean S(String paramString) {
    boolean bool;
    if (h0.a == 21 && "OMX.google.aac.decoder".equals(paramString)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void S0(DrmSession<o> paramDrmSession) {
    i.a(this.B, paramDrmSession);
    this.B = paramDrmSession;
  }
  
  private static boolean T(e parame) {
    boolean bool;
    String str = parame.a;
    int i = h0.a;
    if ((i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ("Amazon".equals(h0.c) && "AFTS".equals(h0.d) && parame.g)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private boolean T0(long paramLong) {
    return (this.E == -9223372036854775807L || SystemClock.elapsedRealtime() - paramLong < this.E);
  }
  
  private static boolean U(String paramString) {
    int i = h0.a;
    return (i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(paramString) || "OMX.SEC.avc.dec.secure".equals(paramString))) || (i == 19 && h0.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(paramString) || "OMX.Exynos.avc.dec.secure".equals(paramString))));
  }
  
  private static boolean V(String paramString, Format paramFormat) {
    int i = h0.a;
    boolean bool = true;
    if (i > 18 || paramFormat.w != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(paramString))
      bool = false; 
    return bool;
  }
  
  private boolean V0(boolean paramBoolean) {
    DrmSession<o> drmSession = this.A;
    boolean bool = false;
    if (drmSession == null || (!paramBoolean && (this.p || drmSession.c())))
      return false; 
    int i = this.A.getState();
    if (i != 1) {
      paramBoolean = bool;
      if (i != 4)
        paramBoolean = true; 
      return paramBoolean;
    } 
    throw f(this.A.f(), this.y);
  }
  
  private static boolean X(String paramString) {
    boolean bool;
    if (h0.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(paramString)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void X0() {
    if (h0.a < 23)
      return; 
    float f1 = l0(this.F, this.H, j());
    float f2 = this.I;
    if (f2 != f1)
      if (f1 == -1.0F) {
        a0();
      } else if (f2 != -1.0F || f1 > this.r) {
        Bundle bundle = new Bundle();
        bundle.putFloat("operating-rate", f1);
        this.G.setParameters(bundle);
        this.I = f1;
      }  
  }
  
  @TargetApi(23)
  private void Y0() {
    o o = (o)this.B.e();
    if (o == null) {
      K0();
      return;
    } 
    if (v.e.equals(o.b)) {
      K0();
      return;
    } 
    if (e0())
      return; 
    try {
      this.C.setMediaDrmSession(o.c);
      Q0(this.B);
      this.g0 = 0;
      this.h0 = 0;
      return;
    } catch (MediaCryptoException mediaCryptoException) {
      throw f(mediaCryptoException, this.y);
    } 
  }
  
  private void Z() {
    if (this.i0) {
      this.g0 = 1;
      this.h0 = 1;
    } 
  }
  
  private void a0() {
    if (this.i0) {
      this.g0 = 1;
      this.h0 = 3;
    } else {
      K0();
    } 
  }
  
  private void b0() {
    if (h0.a < 23) {
      a0();
      return;
    } 
    if (this.i0) {
      this.g0 = 1;
      this.h0 = 2;
    } else {
      Y0();
    } 
  }
  
  private boolean c0(long paramLong1, long paramLong2) {
    if (!s0()) {
      int j;
      boolean bool1;
      if (this.R && this.j0) {
        try {
          j = this.G.dequeueOutputBuffer(this.w, n0());
        } catch (IllegalStateException illegalStateException) {
          F0();
          if (this.n0)
            L0(); 
          return false;
        } 
      } else {
        j = this.G.dequeueOutputBuffer(this.w, n0());
      } 
      if (j < 0) {
        if (j == -2) {
          I0();
          return true;
        } 
        if (j == -3) {
          H0();
          return true;
        } 
        if (this.V && (this.m0 || this.g0 == 2))
          F0(); 
        return false;
      } 
      if (this.U) {
        this.U = false;
        this.G.releaseOutputBuffer(j, false);
        return true;
      } 
      MediaCodec.BufferInfo bufferInfo1 = this.w;
      if (bufferInfo1.size == 0 && (bufferInfo1.flags & 0x4) != 0) {
        F0();
        return false;
      } 
      this.a0 = j;
      ByteBuffer byteBuffer1 = q0(j);
      this.b0 = byteBuffer1;
      if (byteBuffer1 != null) {
        byteBuffer1.position(this.w.offset);
        byteBuffer1 = this.b0;
        MediaCodec.BufferInfo bufferInfo2 = this.w;
        byteBuffer1.limit(bufferInfo2.offset + bufferInfo2.size);
      } 
      this.c0 = u0(this.w.presentationTimeUs);
      long l1 = this.l0;
      long l2 = this.w.presentationTimeUs;
      if (l1 == l2) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.d0 = bool1;
      Z0(l2);
    } 
    if (this.R && this.j0) {
      try {
        MediaCodec mediaCodec1 = this.G;
        ByteBuffer byteBuffer1 = this.b0;
        int m = this.a0;
        MediaCodec.BufferInfo bufferInfo1 = this.w;
        int j = bufferInfo1.flags;
        long l = bufferInfo1.presentationTimeUs;
        boolean bool2 = this.c0;
        boolean bool1 = this.d0;
        Format format = this.z;
        try {
          bool1 = G0(paramLong1, paramLong2, mediaCodec1, byteBuffer1, m, j, l, bool2, bool1, format);
        } catch (IllegalStateException illegalStateException) {}
      } catch (IllegalStateException illegalStateException) {}
      F0();
      if (this.n0)
        L0(); 
      return false;
    } 
    MediaCodec mediaCodec = this.G;
    ByteBuffer byteBuffer = this.b0;
    int i = this.a0;
    MediaCodec.BufferInfo bufferInfo = this.w;
    boolean bool = G0(paramLong1, paramLong2, mediaCodec, byteBuffer, i, bufferInfo.flags, bufferInfo.presentationTimeUs, this.c0, this.d0, this.z);
    if (bool) {
      D0(this.w.presentationTimeUs);
      if ((this.w.flags & 0x4) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      P0();
      if (i == 0)
        return true; 
      F0();
    } 
    return false;
  }
  
  private boolean d0() {
    int i;
    int j;
    MediaCodec mediaCodec = this.G;
    if (mediaCodec == null || this.g0 == 2 || this.m0)
      return false; 
    if (this.Z < 0) {
      i = mediaCodec.dequeueInputBuffer(0L);
      this.Z = i;
      if (i < 0)
        return false; 
      this.s.c = p0(i);
      this.s.clear();
    } 
    if (this.g0 == 1) {
      if (!this.V) {
        this.j0 = true;
        this.G.queueInputBuffer(this.Z, 0, 0, 0L, 4);
        O0();
      } 
      this.g0 = 2;
      return false;
    } 
    if (this.T) {
      this.T = false;
      ByteBuffer byteBuffer = this.s.c;
      byte[] arrayOfByte = m;
      byteBuffer.put(arrayOfByte);
      this.G.queueInputBuffer(this.Z, 0, arrayOfByte.length, 0L, 0);
      O0();
      this.i0 = true;
      return true;
    } 
    f0 f0 = h();
    if (this.o0) {
      i = -4;
      j = 0;
    } else {
      if (this.f0 == 1) {
        for (byte b = 0; b < this.H.l.size(); b++) {
          byte[] arrayOfByte = this.H.l.get(b);
          this.s.c.put(arrayOfByte);
        } 
        this.f0 = 2;
      } 
      j = this.s.c.position();
      i = L(f0, this.s, false);
    } 
    if (s())
      this.l0 = this.k0; 
    if (i == -3)
      return false; 
    if (i == -5) {
      if (this.f0 == 2) {
        this.s.clear();
        this.f0 = 1;
      } 
      B0(f0);
      return true;
    } 
    if (this.s.isEndOfStream()) {
      if (this.f0 == 2) {
        this.s.clear();
        this.f0 = 1;
      } 
      this.m0 = true;
      if (!this.i0) {
        F0();
        return false;
      } 
      try {
        if (!this.V) {
          this.j0 = true;
          this.G.queueInputBuffer(this.Z, 0, 0, 0L, 4);
          O0();
        } 
        return false;
      } catch (android.media.MediaCodec.CryptoException cryptoException) {
        throw f(cryptoException, this.y);
      } 
    } 
    if (this.p0 && !this.s.isKeyFrame()) {
      this.s.clear();
      if (this.f0 == 2)
        this.f0 = 1; 
      return true;
    } 
    this.p0 = false;
    boolean bool1 = this.s.n();
    boolean bool2 = V0(bool1);
    this.o0 = bool2;
    if (bool2)
      return false; 
    if (this.O && !bool1) {
      s.b(this.s.c);
      if (this.s.c.position() == 0)
        return true; 
      this.O = false;
    } 
    try {
      e e1 = this.s;
      long l = e1.d;
      if (e1.isDecodeOnly())
        this.v.add(Long.valueOf(l)); 
      if (this.q0) {
        this.u.a(l, this.y);
        this.q0 = false;
      } 
      this.k0 = Math.max(this.k0, l);
      this.s.m();
      if (this.s.hasSupplementalData())
        r0(this.s); 
      E0(this.s);
      if (bool1) {
        MediaCodec.CryptoInfo cryptoInfo = o0(this.s, j);
        this.G.queueSecureInputBuffer(this.Z, 0, cryptoInfo, l, 0);
      } else {
        this.G.queueInputBuffer(this.Z, 0, this.s.c.limit(), l, 0);
      } 
      O0();
      this.i0 = true;
      this.f0 = 0;
      d d1 = this.t0;
      d1.c++;
      return true;
    } catch (android.media.MediaCodec.CryptoException cryptoException) {
      throw f(cryptoException, this.y);
    } 
  }
  
  private List<e> g0(boolean paramBoolean) {
    List<e> list1 = m0(this.n, this.y, paramBoolean);
    List<e> list2 = list1;
    if (list1.isEmpty()) {
      list2 = list1;
      if (paramBoolean) {
        list1 = m0(this.n, this.y, false);
        list2 = list1;
        if (!list1.isEmpty()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Drm session requires secure decoder for ");
          stringBuilder.append(this.y.j);
          stringBuilder.append(", but no secure decoder available. Trying to proceed with ");
          stringBuilder.append(list1);
          stringBuilder.append(".");
          o.f("MediaCodecRenderer", stringBuilder.toString());
          list2 = list1;
        } 
      } 
    } 
    return list2;
  }
  
  private void i0(MediaCodec paramMediaCodec) {
    if (h0.a < 21) {
      this.W = paramMediaCodec.getInputBuffers();
      this.X = paramMediaCodec.getOutputBuffers();
    } 
  }
  
  private static MediaCodec.CryptoInfo o0(e parame, int paramInt) {
    MediaCodec.CryptoInfo cryptoInfo = parame.b.a();
    if (paramInt == 0)
      return cryptoInfo; 
    if (cryptoInfo.numBytesOfClearData == null)
      cryptoInfo.numBytesOfClearData = new int[1]; 
    int[] arrayOfInt = cryptoInfo.numBytesOfClearData;
    arrayOfInt[0] = arrayOfInt[0] + paramInt;
    return cryptoInfo;
  }
  
  private ByteBuffer p0(int paramInt) {
    return (h0.a >= 21) ? this.G.getInputBuffer(paramInt) : this.W[paramInt];
  }
  
  private ByteBuffer q0(int paramInt) {
    return (h0.a >= 21) ? this.G.getOutputBuffer(paramInt) : this.X[paramInt];
  }
  
  private boolean s0() {
    boolean bool;
    if (this.a0 >= 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void t0(e parame, MediaCrypto paramMediaCrypto) {
    float f1;
    String str = parame.a;
    if (h0.a < 23) {
      f1 = -1.0F;
    } else {
      f1 = l0(this.F, this.y, j());
    } 
    if (f1 <= this.r)
      f1 = -1.0F; 
    MediaCrypto mediaCrypto = null;
    try {
      long l = SystemClock.elapsedRealtime();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("createCodec:");
      stringBuilder.append(str);
      f0.a(stringBuilder.toString());
      MediaCodec mediaCodec = MediaCodec.createByCodecName(str);
      try {
        boolean bool;
        long l2;
        f0.c();
        f0.a("configureCodec");
        Y(parame, mediaCodec, this.y, paramMediaCrypto, f1);
        f0.c();
        f0.a("startCodec");
        mediaCodec.start();
        f0.c();
        long l1 = SystemClock.elapsedRealtime();
        i0(mediaCodec);
        this.G = mediaCodec;
        this.L = parame;
        this.I = f1;
        this.H = this.y;
        this.M = P(str);
        this.N = X(str);
        this.O = Q(str, this.H);
        this.P = U(str);
        this.Q = R(str);
        this.R = S(str);
        this.S = V(str, this.H);
        if (T(parame) || k0()) {
          bool = true;
        } else {
          bool = false;
        } 
        this.V = bool;
        O0();
        P0();
        if (getState() == 2) {
          l2 = SystemClock.elapsedRealtime() + 1000L;
        } else {
          l2 = -9223372036854775807L;
        } 
        this.Y = l2;
        this.e0 = false;
        this.f0 = 0;
        this.j0 = false;
        this.i0 = false;
        this.k0 = -9223372036854775807L;
        this.l0 = -9223372036854775807L;
        this.g0 = 0;
        this.h0 = 0;
        this.T = false;
        this.U = false;
        this.c0 = false;
        this.d0 = false;
        this.p0 = true;
        d d1 = this.t0;
        d1.a++;
        A0(str, l1, l1 - l);
        return;
      } catch (Exception null) {
        MediaCodec mediaCodec1 = mediaCodec;
      } 
    } catch (Exception exception) {
      paramMediaCrypto = mediaCrypto;
    } 
    if (paramMediaCrypto != null) {
      N0();
      paramMediaCrypto.release();
    } 
    throw exception;
  }
  
  private boolean u0(long paramLong) {
    int i = this.v.size();
    for (byte b = 0; b < i; b++) {
      if (((Long)this.v.get(b)).longValue() == paramLong) {
        this.v.remove(b);
        return true;
      } 
    } 
    return false;
  }
  
  private static boolean v0(IllegalStateException paramIllegalStateException) {
    int i = h0.a;
    boolean bool = true;
    if (i >= 21 && w0(paramIllegalStateException))
      return true; 
    StackTraceElement[] arrayOfStackTraceElement = paramIllegalStateException.getStackTrace();
    if (arrayOfStackTraceElement.length <= 0 || !arrayOfStackTraceElement[0].getClassName().equals("android.media.MediaCodec"))
      bool = false; 
    return bool;
  }
  
  @TargetApi(21)
  private static boolean w0(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException instanceof MediaCodec.CodecException;
  }
  
  private void y0(MediaCrypto paramMediaCrypto, boolean paramBoolean) {
    if (this.J == null)
      try {
        List<e> list = g0(paramBoolean);
        ArrayDeque<e> arrayDeque = new ArrayDeque();
        this();
        this.J = arrayDeque;
        if (this.q) {
          arrayDeque.addAll(list);
        } else if (!list.isEmpty()) {
          this.J.add(list.get(0));
        } 
        this.K = null;
      } catch (DecoderQueryException decoderQueryException) {
        throw new DecoderInitializationException(this.y, decoderQueryException, paramBoolean, -49998);
      }  
    if (!this.J.isEmpty()) {
      while (this.G == null) {
        e e1 = this.J.peekFirst();
        if (!U0(e1))
          return; 
        try {
          t0(e1, (MediaCrypto)decoderQueryException);
        } catch (Exception exception) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Failed to initialize decoder: ");
          stringBuilder.append(e1);
          o.g("MediaCodecRenderer", stringBuilder.toString(), exception);
          this.J.removeFirst();
          DecoderInitializationException decoderInitializationException1 = new DecoderInitializationException(this.y, exception, paramBoolean, e1);
          if (this.K == null) {
            this.K = decoderInitializationException1;
          } else {
            this.K = this.K.b(decoderInitializationException1);
          } 
          if (!this.J.isEmpty())
            continue; 
          throw this.K;
        } 
      } 
      this.J = null;
      return;
    } 
    DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.y, null, paramBoolean, -49999);
    throw decoderInitializationException;
  }
  
  private static boolean z0(DrmSession<o> paramDrmSession, Format paramFormat) {
    o o = (o)paramDrmSession.e();
    if (o == null)
      return true; 
    if (o.d)
      return false; 
    try {
      MediaCrypto mediaCrypto = new MediaCrypto(o.b, o.c);
      try {
        return mediaCrypto.requiresSecureDecoderComponent(paramFormat.j);
      } finally {
        mediaCrypto.release();
      } 
    } catch (MediaCryptoException mediaCryptoException) {
      return true;
    } 
  }
  
  protected abstract void A0(String paramString, long paramLong1, long paramLong2);
  
  protected void B0(f0 paramf0) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield q0 : Z
    //   7: aload_1
    //   8: getfield c : Lcom/google/android/exoplayer2/Format;
    //   11: invokestatic e : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast com/google/android/exoplayer2/Format
    //   17: astore_3
    //   18: aload_1
    //   19: getfield a : Z
    //   22: ifeq -> 36
    //   25: aload_0
    //   26: aload_1
    //   27: getfield b : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   30: invokespecial S0 : (Lcom/google/android/exoplayer2/drm/DrmSession;)V
    //   33: goto -> 57
    //   36: aload_0
    //   37: aload_0
    //   38: aload_0
    //   39: getfield y : Lcom/google/android/exoplayer2/Format;
    //   42: aload_3
    //   43: aload_0
    //   44: getfield o : Lcom/google/android/exoplayer2/drm/k;
    //   47: aload_0
    //   48: getfield B : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   51: invokevirtual k : (Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/drm/k;Lcom/google/android/exoplayer2/drm/DrmSession;)Lcom/google/android/exoplayer2/drm/DrmSession;
    //   54: putfield B : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   57: aload_0
    //   58: aload_3
    //   59: putfield y : Lcom/google/android/exoplayer2/Format;
    //   62: aload_0
    //   63: getfield G : Landroid/media/MediaCodec;
    //   66: ifnonnull -> 74
    //   69: aload_0
    //   70: invokevirtual x0 : ()V
    //   73: return
    //   74: aload_0
    //   75: getfield B : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   78: astore_1
    //   79: aload_1
    //   80: ifnonnull -> 90
    //   83: aload_0
    //   84: getfield A : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   87: ifnonnull -> 146
    //   90: aload_1
    //   91: ifnull -> 101
    //   94: aload_0
    //   95: getfield A : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   98: ifnull -> 146
    //   101: aload_1
    //   102: aload_0
    //   103: getfield A : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   106: if_acmpeq -> 127
    //   109: aload_0
    //   110: getfield L : Lcom/google/android/exoplayer2/mediacodec/e;
    //   113: getfield g : Z
    //   116: ifne -> 127
    //   119: aload_1
    //   120: aload_3
    //   121: invokestatic z0 : (Lcom/google/android/exoplayer2/drm/DrmSession;Lcom/google/android/exoplayer2/Format;)Z
    //   124: ifne -> 146
    //   127: getstatic com/google/android/exoplayer2/util/h0.a : I
    //   130: bipush #23
    //   132: if_icmpge -> 151
    //   135: aload_0
    //   136: getfield B : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   139: aload_0
    //   140: getfield A : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   143: if_acmpeq -> 151
    //   146: aload_0
    //   147: invokespecial a0 : ()V
    //   150: return
    //   151: aload_0
    //   152: aload_0
    //   153: getfield G : Landroid/media/MediaCodec;
    //   156: aload_0
    //   157: getfield L : Lcom/google/android/exoplayer2/mediacodec/e;
    //   160: aload_0
    //   161: getfield H : Lcom/google/android/exoplayer2/Format;
    //   164: aload_3
    //   165: invokevirtual O : (Landroid/media/MediaCodec;Lcom/google/android/exoplayer2/mediacodec/e;Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;)I
    //   168: istore #4
    //   170: iload #4
    //   172: ifeq -> 380
    //   175: iload #4
    //   177: iconst_1
    //   178: if_icmpeq -> 346
    //   181: iload #4
    //   183: iconst_2
    //   184: if_icmpeq -> 228
    //   187: iload #4
    //   189: iconst_3
    //   190: if_icmpne -> 220
    //   193: aload_0
    //   194: aload_3
    //   195: putfield H : Lcom/google/android/exoplayer2/Format;
    //   198: aload_0
    //   199: invokespecial X0 : ()V
    //   202: aload_0
    //   203: getfield B : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   206: aload_0
    //   207: getfield A : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   210: if_acmpeq -> 384
    //   213: aload_0
    //   214: invokespecial b0 : ()V
    //   217: goto -> 384
    //   220: new java/lang/IllegalStateException
    //   223: dup
    //   224: invokespecial <init> : ()V
    //   227: athrow
    //   228: aload_0
    //   229: getfield N : Z
    //   232: ifeq -> 242
    //   235: aload_0
    //   236: invokespecial a0 : ()V
    //   239: goto -> 384
    //   242: aload_0
    //   243: iconst_1
    //   244: putfield e0 : Z
    //   247: aload_0
    //   248: iconst_1
    //   249: putfield f0 : I
    //   252: aload_0
    //   253: getfield M : I
    //   256: istore #4
    //   258: iload_2
    //   259: istore #5
    //   261: iload #4
    //   263: iconst_2
    //   264: if_icmpeq -> 313
    //   267: iload #4
    //   269: iconst_1
    //   270: if_icmpne -> 310
    //   273: aload_3
    //   274: getfield o : I
    //   277: istore #4
    //   279: aload_0
    //   280: getfield H : Lcom/google/android/exoplayer2/Format;
    //   283: astore_1
    //   284: iload #4
    //   286: aload_1
    //   287: getfield o : I
    //   290: if_icmpne -> 310
    //   293: aload_3
    //   294: getfield p : I
    //   297: aload_1
    //   298: getfield p : I
    //   301: if_icmpne -> 310
    //   304: iload_2
    //   305: istore #5
    //   307: goto -> 313
    //   310: iconst_0
    //   311: istore #5
    //   313: aload_0
    //   314: iload #5
    //   316: putfield T : Z
    //   319: aload_0
    //   320: aload_3
    //   321: putfield H : Lcom/google/android/exoplayer2/Format;
    //   324: aload_0
    //   325: invokespecial X0 : ()V
    //   328: aload_0
    //   329: getfield B : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   332: aload_0
    //   333: getfield A : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   336: if_acmpeq -> 384
    //   339: aload_0
    //   340: invokespecial b0 : ()V
    //   343: goto -> 384
    //   346: aload_0
    //   347: aload_3
    //   348: putfield H : Lcom/google/android/exoplayer2/Format;
    //   351: aload_0
    //   352: invokespecial X0 : ()V
    //   355: aload_0
    //   356: getfield B : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   359: aload_0
    //   360: getfield A : Lcom/google/android/exoplayer2/drm/DrmSession;
    //   363: if_acmpeq -> 373
    //   366: aload_0
    //   367: invokespecial b0 : ()V
    //   370: goto -> 384
    //   373: aload_0
    //   374: invokespecial Z : ()V
    //   377: goto -> 384
    //   380: aload_0
    //   381: invokespecial a0 : ()V
    //   384: return
  }
  
  protected abstract void C0(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat);
  
  protected abstract void D0(long paramLong);
  
  protected void E() {
    this.y = null;
    if (this.B != null || this.A != null) {
      H();
      return;
    } 
    f0();
  }
  
  protected abstract void E0(e parame);
  
  protected void F(boolean paramBoolean) {
    k<o> k1 = this.o;
    if (k1 != null && !this.x) {
      this.x = true;
      k1.c();
    } 
    this.t0 = new d();
  }
  
  protected void G(long paramLong, boolean paramBoolean) {
    this.m0 = false;
    this.n0 = false;
    this.s0 = false;
    e0();
    this.u.c();
  }
  
  protected abstract boolean G0(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, Format paramFormat);
  
  protected void H() {
    try {
      L0();
      S0(null);
      k<o> k1 = this.o;
      return;
    } finally {
      S0(null);
    } 
  }
  
  protected void I() {}
  
  protected void J() {}
  
  protected void L0() {
    this.J = null;
    this.L = null;
    this.H = null;
    O0();
    P0();
    N0();
    this.o0 = false;
    this.Y = -9223372036854775807L;
    this.v.clear();
    this.k0 = -9223372036854775807L;
    this.l0 = -9223372036854775807L;
    try {
      null = this.G;
      if (null != null) {
        d d1 = this.t0;
        d1.b++;
        try {
          if (!this.r0)
            null.stop(); 
        } finally {
          this.G.release();
        } 
      } 
    } finally {
      Exception exception = null;
      this.G = null;
    } 
  }
  
  protected void M0() {}
  
  protected abstract int O(MediaCodec paramMediaCodec, e parame, Format paramFormat1, Format paramFormat2);
  
  protected final void R0() {
    this.s0 = true;
  }
  
  protected boolean U0(e parame) {
    return true;
  }
  
  protected abstract int W0(f paramf, k<o> paramk, Format paramFormat);
  
  protected abstract void Y(e parame, MediaCodec paramMediaCodec, Format paramFormat, MediaCrypto paramMediaCrypto, float paramFloat);
  
  protected final Format Z0(long paramLong) {
    Format format = (Format)this.u.i(paramLong);
    if (format != null)
      this.z = format; 
    return format;
  }
  
  public final int b(Format paramFormat) {
    try {
      return W0(this.n, this.o, paramFormat);
    } catch (DecoderQueryException decoderQueryException) {
      throw f(decoderQueryException, paramFormat);
    } 
  }
  
  public final int d() {
    return 8;
  }
  
  protected final boolean e0() {
    boolean bool = f0();
    if (bool)
      x0(); 
    return bool;
  }
  
  protected boolean f0() {
    MediaCodec mediaCodec = this.G;
    if (mediaCodec == null)
      return false; 
    if (this.h0 == 3 || this.P || (this.Q && this.j0)) {
      L0();
      return true;
    } 
    mediaCodec.flush();
    O0();
    P0();
    this.Y = -9223372036854775807L;
    this.j0 = false;
    this.i0 = false;
    this.p0 = true;
    this.T = false;
    this.U = false;
    this.c0 = false;
    this.d0 = false;
    this.o0 = false;
    this.v.clear();
    this.k0 = -9223372036854775807L;
    this.l0 = -9223372036854775807L;
    this.g0 = 0;
    this.h0 = 0;
    this.f0 = this.e0;
    return false;
  }
  
  protected final MediaCodec h0() {
    return this.G;
  }
  
  protected final e j0() {
    return this.L;
  }
  
  protected boolean k0() {
    return false;
  }
  
  protected abstract float l0(float paramFloat, Format paramFormat, Format[] paramArrayOfFormat);
  
  public boolean m() {
    boolean bool;
    if (this.y != null && !this.o0 && (l() || s0() || (this.Y != -9223372036854775807L && SystemClock.elapsedRealtime() < this.Y))) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected abstract List<e> m0(f paramf, Format paramFormat, boolean paramBoolean);
  
  protected long n0() {
    return 0L;
  }
  
  public boolean o() {
    return this.n0;
  }
  
  protected void r0(e parame) {}
  
  public void w(long paramLong1, long paramLong2) {
    if (this.s0) {
      this.s0 = false;
      F0();
    } 
    try {
      if (this.n0) {
        M0();
        return;
      } 
      if (this.y == null && !J0(true))
        return; 
      x0();
      if (this.G != null) {
        long l = SystemClock.elapsedRealtime();
        f0.a("drainAndFeed");
        while (c0(paramLong1, paramLong2));
        while (d0() && T0(l));
        f0.c();
      } else {
        d d1 = this.t0;
        d1.d += M(paramLong1);
        J0(false);
      } 
      this.t0.a();
      return;
    } catch (IllegalStateException illegalStateException) {
      if (v0(illegalStateException))
        throw f(illegalStateException, this.y); 
      throw illegalStateException;
    } 
  }
  
  public final void x(float paramFloat) {
    this.F = paramFloat;
    if (this.G != null && this.h0 != 3 && getState() != 0)
      X0(); 
  }
  
  protected final void x0() {
    if (this.G != null || this.y == null)
      return; 
    Q0(this.B);
    String str = this.y.j;
    DrmSession<o> drmSession = this.A;
    if (drmSession != null) {
      if (this.C == null) {
        o o = (o)drmSession.e();
        if (o == null) {
          if (this.A.f() == null)
            return; 
        } else {
          try {
            boolean bool;
            MediaCrypto mediaCrypto = new MediaCrypto();
            this(o.b, o.c);
            this.C = mediaCrypto;
            if (!o.d && mediaCrypto.requiresSecureDecoderComponent(str)) {
              bool = true;
            } else {
              bool = false;
            } 
            this.D = bool;
          } catch (MediaCryptoException mediaCryptoException) {
            throw f(mediaCryptoException, this.y);
          } 
        } 
      } 
      if (o.a) {
        int i = this.A.getState();
        if (i != 1) {
          if (i != 4)
            return; 
        } else {
          throw f(this.A.f(), this.y);
        } 
      } 
    } 
    try {
      y0(this.C, this.D);
      return;
    } catch (DecoderInitializationException decoderInitializationException) {
      throw f(decoderInitializationException, this.y);
    } 
  }
  
  public static class DecoderException extends Exception {
    public final e codecInfo;
    
    public final String diagnosticInfo;
    
    public DecoderException(Throwable param1Throwable, e param1e) {
      super(stringBuilder.toString(), param1Throwable);
      String str1;
      String str2;
      this.codecInfo = param1e;
      param1e = e1;
      if (h0.a >= 21)
        str1 = a(param1Throwable); 
      this.diagnosticInfo = str1;
    }
    
    @TargetApi(21)
    private static String a(Throwable param1Throwable) {
      return (param1Throwable instanceof MediaCodec.CodecException) ? ((MediaCodec.CodecException)param1Throwable).getDiagnosticInfo() : null;
    }
  }
  
  public static class DecoderInitializationException extends Exception {
    public final e codecInfo;
    
    public final String diagnosticInfo;
    
    public final DecoderInitializationException fallbackDecoderInitializationException;
    
    public final String mimeType;
    
    public final boolean secureDecoderRequired;
    
    public DecoderInitializationException(Format param1Format, Throwable param1Throwable, boolean param1Boolean, int param1Int) {
      this(stringBuilder.toString(), param1Throwable, param1Format.j, param1Boolean, null, a(param1Int), null);
    }
    
    public DecoderInitializationException(Format param1Format, Throwable param1Throwable, boolean param1Boolean, e param1e) {
      this(str1, param1Throwable, str2, param1Boolean, param1e, (String)param1Format, null);
    }
    
    private DecoderInitializationException(String param1String1, Throwable param1Throwable, String param1String2, boolean param1Boolean, e param1e, String param1String3, DecoderInitializationException param1DecoderInitializationException) {
      super(param1String1, param1Throwable);
      this.mimeType = param1String2;
      this.secureDecoderRequired = param1Boolean;
      this.codecInfo = param1e;
      this.diagnosticInfo = param1String3;
      this.fallbackDecoderInitializationException = param1DecoderInitializationException;
    }
    
    private static String a(int param1Int) {
      String str;
      if (param1Int < 0) {
        str = "neg_";
      } else {
        str = "";
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
      stringBuilder.append(str);
      stringBuilder.append(Math.abs(param1Int));
      return stringBuilder.toString();
    }
    
    private DecoderInitializationException b(DecoderInitializationException param1DecoderInitializationException) {
      return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, param1DecoderInitializationException);
    }
    
    @TargetApi(21)
    private static String c(Throwable param1Throwable) {
      return (param1Throwable instanceof MediaCodec.CodecException) ? ((MediaCodec.CodecException)param1Throwable).getDiagnosticInfo() : null;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/mediacodec/MediaCodecRenderer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */