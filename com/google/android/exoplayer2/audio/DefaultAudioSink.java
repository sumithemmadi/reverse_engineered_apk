package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.google.android.exoplayer2.c1.r;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class DefaultAudioSink implements AudioSink {
  public static boolean a = false;
  
  public static boolean b = false;
  
  private long A;
  
  private long B;
  
  private int C;
  
  private int D;
  
  private long E;
  
  private float F;
  
  private AudioProcessor[] G;
  
  private ByteBuffer[] H;
  
  private ByteBuffer I;
  
  private ByteBuffer J;
  
  private byte[] K;
  
  private int L;
  
  private int M;
  
  private boolean N;
  
  private boolean O;
  
  private boolean P;
  
  private int Q;
  
  private o R;
  
  private boolean S;
  
  private long T;
  
  private final j c;
  
  private final c d;
  
  private final boolean e;
  
  private final q f;
  
  private final y g;
  
  private final AudioProcessor[] h;
  
  private final AudioProcessor[] i;
  
  private final ConditionVariable j;
  
  private final n k;
  
  private final ArrayDeque<f> l;
  
  private AudioSink.a m;
  
  private AudioTrack n;
  
  private d o;
  
  private d p;
  
  private AudioTrack q;
  
  private i r;
  
  private l0 s;
  
  private l0 t;
  
  private long u;
  
  private long v;
  
  private ByteBuffer w;
  
  private int x;
  
  private long y;
  
  private long z;
  
  public DefaultAudioSink(j paramj, c paramc, boolean paramBoolean) {
    this.c = paramj;
    this.d = (c)com.google.android.exoplayer2.util.e.e(paramc);
    this.e = paramBoolean;
    this.j = new ConditionVariable(true);
    this.k = new n(new g(null));
    q q1 = new q();
    this.f = q1;
    y y1 = new y();
    this.g = y1;
    ArrayList<? super p> arrayList = new ArrayList();
    Collections.addAll(arrayList, new p[] { new u(), q1, y1 });
    Collections.addAll((Collection)arrayList, paramc.d());
    this.h = arrayList.<AudioProcessor>toArray(new AudioProcessor[0]);
    this.i = new AudioProcessor[] { new s() };
    this.F = 1.0F;
    this.D = 0;
    this.r = i.a;
    this.Q = 0;
    this.R = new o(0, 0.0F);
    this.t = l0.a;
    this.M = -1;
    this.G = new AudioProcessor[0];
    this.H = new ByteBuffer[0];
    this.l = new ArrayDeque<f>();
  }
  
  public DefaultAudioSink(j paramj, AudioProcessor[] paramArrayOfAudioProcessor) {
    this(paramj, paramArrayOfAudioProcessor, false);
  }
  
  public DefaultAudioSink(j paramj, AudioProcessor[] paramArrayOfAudioProcessor, boolean paramBoolean) {
    this(paramj, new e(paramArrayOfAudioProcessor), paramBoolean);
  }
  
  private static void A(AudioTrack paramAudioTrack, float paramFloat) {
    paramAudioTrack.setStereoVolume(paramFloat, paramFloat);
  }
  
  private void B() {
    AudioProcessor[] arrayOfAudioProcessor = this.p.k;
    ArrayList<AudioProcessor> arrayList = new ArrayList();
    int k = arrayOfAudioProcessor.length;
    int m;
    for (m = 0; m < k; m++) {
      AudioProcessor audioProcessor = arrayOfAudioProcessor[m];
      if (audioProcessor.c()) {
        arrayList.add(audioProcessor);
      } else {
        audioProcessor.flush();
      } 
    } 
    m = arrayList.size();
    this.G = arrayList.<AudioProcessor>toArray(new AudioProcessor[m]);
    this.H = new ByteBuffer[m];
    l();
  }
  
  private void C(ByteBuffer paramByteBuffer, long paramLong) {
    if (!paramByteBuffer.hasRemaining())
      return; 
    ByteBuffer byteBuffer = this.J;
    boolean bool = true;
    int k = 0;
    if (byteBuffer != null) {
      boolean bool1;
      if (byteBuffer == paramByteBuffer) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      com.google.android.exoplayer2.util.e.a(bool1);
    } else {
      this.J = paramByteBuffer;
      if (h0.a < 21) {
        int i1 = paramByteBuffer.remaining();
        byte[] arrayOfByte = this.K;
        if (arrayOfByte == null || arrayOfByte.length < i1)
          this.K = new byte[i1]; 
        int i2 = paramByteBuffer.position();
        paramByteBuffer.get(this.K, 0, i1);
        paramByteBuffer.position(i2);
        this.L = 0;
      } 
    } 
    int m = paramByteBuffer.remaining();
    if (h0.a < 21) {
      int i1 = this.k.c(this.A);
      if (i1 > 0) {
        k = Math.min(m, i1);
        i1 = this.q.write(this.K, this.L, k);
        k = i1;
        if (i1 > 0) {
          this.L += i1;
          paramByteBuffer.position(paramByteBuffer.position() + i1);
          k = i1;
        } 
      } 
    } else if (this.S) {
      boolean bool1;
      if (paramLong != -9223372036854775807L) {
        bool1 = bool;
      } else {
        bool1 = false;
      } 
      com.google.android.exoplayer2.util.e.f(bool1);
      k = E(this.q, paramByteBuffer, m, paramLong);
    } else {
      k = D(this.q, paramByteBuffer, m);
    } 
    this.T = SystemClock.elapsedRealtime();
    if (k >= 0) {
      boolean bool1 = this.p.a;
      if (bool1)
        this.A += k; 
      if (k == m) {
        if (!bool1)
          this.B += this.C; 
        this.J = null;
      } 
      return;
    } 
    throw new AudioSink.WriteException(k);
  }
  
  @TargetApi(21)
  private static int D(AudioTrack paramAudioTrack, ByteBuffer paramByteBuffer, int paramInt) {
    return paramAudioTrack.write(paramByteBuffer, paramInt, 1);
  }
  
  @TargetApi(21)
  private int E(AudioTrack paramAudioTrack, ByteBuffer paramByteBuffer, int paramInt, long paramLong) {
    if (h0.a >= 26)
      return paramAudioTrack.write(paramByteBuffer, paramInt, 1, paramLong * 1000L); 
    if (this.w == null) {
      ByteBuffer byteBuffer = ByteBuffer.allocate(16);
      this.w = byteBuffer;
      byteBuffer.order(ByteOrder.BIG_ENDIAN);
      this.w.putInt(1431633921);
    } 
    if (this.x == 0) {
      this.w.putInt(4, paramInt);
      this.w.putLong(8, paramLong * 1000L);
      this.w.position(0);
      this.x = paramInt;
    } 
    int k = this.w.remaining();
    if (k > 0) {
      int m = paramAudioTrack.write(this.w, k, 1);
      if (m < 0) {
        this.x = 0;
        return m;
      } 
      if (m < k)
        return 0; 
    } 
    paramInt = D(paramAudioTrack, paramByteBuffer, paramInt);
    if (paramInt < 0) {
      this.x = 0;
      return paramInt;
    } 
    this.x -= paramInt;
    return paramInt;
  }
  
  private void h(l0 paraml0, long paramLong) {
    if (this.p.j) {
      paraml0 = this.d.a(paraml0);
    } else {
      paraml0 = l0.a;
    } 
    this.l.add(new f(paraml0, Math.max(0L, paramLong), this.p.e(r()), null));
    B();
  }
  
  private long i(long paramLong) {
    return paramLong + this.p.e(this.d.c());
  }
  
  private long j(long paramLong) {
    f f;
    for (f = null; !this.l.isEmpty() && paramLong >= f.b(this.l.getFirst()); f = this.l.remove());
    if (f != null) {
      this.t = f.a(f);
      this.v = f.b(f);
      this.u = f.c(f) - this.E;
    } 
    if (this.t.b == 1.0F)
      return paramLong + this.u - this.v; 
    if (this.l.isEmpty()) {
      long l1 = this.u;
      paramLong = this.d.b(paramLong - this.v);
      return l1 + paramLong;
    } 
    long l = this.u;
    paramLong = h0.E(paramLong - this.v, this.t.b);
    return l + paramLong;
  }
  
  private boolean k() {
    if (this.M == -1) {
      int m;
      if (this.p.i) {
        m = 0;
      } else {
        m = this.G.length;
      } 
      this.M = m;
    } else {
      boolean bool1 = false;
      int m = this.M;
      AudioProcessor[] arrayOfAudioProcessor1 = this.G;
    } 
    boolean bool = true;
    int k = this.M;
    AudioProcessor[] arrayOfAudioProcessor = this.G;
  }
  
  private void l() {
    byte b = 0;
    while (true) {
      AudioProcessor[] arrayOfAudioProcessor = this.G;
      if (b < arrayOfAudioProcessor.length) {
        AudioProcessor audioProcessor = arrayOfAudioProcessor[b];
        audioProcessor.flush();
        this.H[b] = audioProcessor.d();
        b++;
        continue;
      } 
      break;
    } 
  }
  
  private static int m(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic com/google/android/exoplayer2/util/h0.a : I
    //   3: istore_2
    //   4: iload_0
    //   5: istore_3
    //   6: iload_2
    //   7: bipush #28
    //   9: if_icmpgt -> 50
    //   12: iload_0
    //   13: istore_3
    //   14: iload_1
    //   15: ifne -> 50
    //   18: iload_0
    //   19: bipush #7
    //   21: if_icmpne -> 30
    //   24: bipush #8
    //   26: istore_3
    //   27: goto -> 50
    //   30: iload_0
    //   31: iconst_3
    //   32: if_icmpeq -> 47
    //   35: iload_0
    //   36: iconst_4
    //   37: if_icmpeq -> 47
    //   40: iload_0
    //   41: istore_3
    //   42: iload_0
    //   43: iconst_5
    //   44: if_icmpne -> 50
    //   47: bipush #6
    //   49: istore_3
    //   50: iload_3
    //   51: istore_0
    //   52: iload_2
    //   53: bipush #26
    //   55: if_icmpgt -> 87
    //   58: iload_3
    //   59: istore_0
    //   60: ldc_w 'fugu'
    //   63: getstatic com/google/android/exoplayer2/util/h0.b : Ljava/lang/String;
    //   66: invokevirtual equals : (Ljava/lang/Object;)Z
    //   69: ifeq -> 87
    //   72: iload_3
    //   73: istore_0
    //   74: iload_1
    //   75: ifne -> 87
    //   78: iload_3
    //   79: istore_0
    //   80: iload_3
    //   81: iconst_1
    //   82: if_icmpne -> 87
    //   85: iconst_2
    //   86: istore_0
    //   87: iload_0
    //   88: invokestatic x : (I)I
    //   91: ireturn
  }
  
  private static int n(int paramInt, ByteBuffer paramByteBuffer) {
    StringBuilder stringBuilder;
    if (paramInt != 14) {
      if (paramInt != 17) {
        if (paramInt != 18)
          switch (paramInt) {
            default:
              stringBuilder = new StringBuilder();
              stringBuilder.append("Unexpected audio encoding: ");
              stringBuilder.append(paramInt);
              throw new IllegalStateException(stringBuilder.toString());
            case 9:
              return r.a(stringBuilder.get(stringBuilder.position()));
            case 7:
            case 8:
              return r.e((ByteBuffer)stringBuilder);
            case 5:
            case 6:
              break;
          }  
        return g.d((ByteBuffer)stringBuilder);
      } 
      return h.c((ByteBuffer)stringBuilder);
    } 
    paramInt = g.a((ByteBuffer)stringBuilder);
    if (paramInt == -1) {
      paramInt = 0;
    } else {
      paramInt = g.h((ByteBuffer)stringBuilder, paramInt) * 16;
    } 
    return paramInt;
  }
  
  private static int p(int paramInt) {
    if (paramInt != 5) {
      if (paramInt != 6)
        if (paramInt != 7) {
          if (paramInt != 8) {
            if (paramInt != 14) {
              if (paramInt != 17) {
                if (paramInt != 18)
                  throw new IllegalArgumentException(); 
              } else {
                return 336000;
              } 
            } else {
              return 3062500;
            } 
          } else {
            return 2250000;
          } 
        } else {
          return 192000;
        }  
      return 768000;
    } 
    return 80000;
  }
  
  private long q() {
    long l;
    d d1 = this.p;
    if (d1.a) {
      l = this.y / d1.b;
    } else {
      l = this.z;
    } 
    return l;
  }
  
  private long r() {
    long l;
    d d1 = this.p;
    if (d1.a) {
      l = this.A / d1.d;
    } else {
      l = this.B;
    } 
    return l;
  }
  
  private void s(long paramLong) {
    this.j.block();
    AudioTrack audioTrack = ((d)com.google.android.exoplayer2.util.e.e(this.p)).a(this.S, this.r, this.Q);
    this.q = audioTrack;
    int k = audioTrack.getAudioSessionId();
    if (a && h0.a < 21) {
      audioTrack = this.n;
      if (audioTrack != null && k != audioTrack.getAudioSessionId())
        x(); 
      if (this.n == null)
        this.n = t(k); 
    } 
    if (this.Q != k) {
      this.Q = k;
      AudioSink.a a1 = this.m;
      if (a1 != null)
        a1.a(k); 
    } 
    h(this.t, paramLong);
    n n1 = this.k;
    audioTrack = this.q;
    d d1 = this.p;
    n1.s(audioTrack, d1.g, d1.d, d1.h);
    y();
    k = this.R.a;
    if (k != 0) {
      this.q.attachAuxEffect(k);
      this.q.setAuxEffectSendLevel(this.R.b);
    } 
  }
  
  private static AudioTrack t(int paramInt) {
    return new AudioTrack(3, 4000, 4, 2, 2, 0, paramInt);
  }
  
  private boolean u() {
    boolean bool;
    if (this.q != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void v() {
    if (!this.O) {
      this.O = true;
      this.k.g(r());
      this.q.stop();
      this.x = 0;
    } 
  }
  
  private void w(long paramLong) {
    int k = this.G.length;
    for (int m = k; m >= 0; m--) {
      ByteBuffer byteBuffer;
      if (m > 0) {
        byteBuffer = this.H[m - 1];
      } else {
        byteBuffer = this.I;
        if (byteBuffer == null)
          byteBuffer = AudioProcessor.a; 
      } 
      if (m == k) {
        C(byteBuffer, paramLong);
      } else {
        AudioProcessor audioProcessor = this.G[m];
        audioProcessor.e(byteBuffer);
        ByteBuffer byteBuffer1 = audioProcessor.d();
        this.H[m] = byteBuffer1;
        if (byteBuffer1.hasRemaining()) {
          m++;
          continue;
        } 
      } 
      if (byteBuffer.hasRemaining())
        return; 
    } 
  }
  
  private void x() {
    AudioTrack audioTrack = this.n;
    if (audioTrack == null)
      return; 
    this.n = null;
    (new b(this, audioTrack)).start();
  }
  
  private void y() {
    if (u())
      if (h0.a >= 21) {
        z(this.q, this.F);
      } else {
        A(this.q, this.F);
      }  
  }
  
  @TargetApi(21)
  private static void z(AudioTrack paramAudioTrack, float paramFloat) {
    paramAudioTrack.setVolume(paramFloat);
  }
  
  public l0 W() {
    l0 l01 = this.s;
    if (l01 == null)
      if (!this.l.isEmpty()) {
        l01 = f.a(this.l.getLast());
      } else {
        l01 = this.t;
      }  
    return l01;
  }
  
  public void a() {
    flush();
    x();
    AudioProcessor[] arrayOfAudioProcessor = this.h;
    int k = arrayOfAudioProcessor.length;
    byte b;
    for (b = 0; b < k; b++)
      arrayOfAudioProcessor[b].a(); 
    arrayOfAudioProcessor = this.i;
    k = arrayOfAudioProcessor.length;
    for (b = 0; b < k; b++)
      arrayOfAudioProcessor[b].a(); 
    this.Q = 0;
    this.P = false;
  }
  
  public void c1() {
    this.P = true;
    if (u()) {
      this.k.t();
      this.q.play();
    } 
  }
  
  public void d1(l0 paraml0) {
    d d1 = this.p;
    if (d1 != null && !d1.j) {
      this.t = l0.a;
      return;
    } 
    if (!paraml0.equals(W()))
      if (u()) {
        this.s = paraml0;
      } else {
        this.t = paraml0;
      }  
  }
  
  public boolean e1(int paramInt1, int paramInt2) {
    null = h0.U(paramInt2);
    boolean bool1 = true;
    boolean bool2 = true;
    if (null) {
      null = bool2;
      if (paramInt2 == 4)
        if (h0.a >= 21) {
          null = bool2;
        } else {
          null = false;
        }  
      return null;
    } 
    j j1 = this.c;
    if (j1 != null && j1.e(paramInt2)) {
      null = bool1;
      if (paramInt1 != -1) {
        if (paramInt1 <= this.c.d())
          return bool1; 
      } else {
        return null;
      } 
    } 
    return false;
  }
  
  public void f1(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint, int paramInt5, int paramInt6) {
    AudioProcessor[] arrayOfAudioProcessor;
    boolean bool1;
    int[] arrayOfInt;
    boolean bool2;
    int k;
    if (h0.a < 21 && paramInt2 == 8 && paramArrayOfint == null) {
      paramArrayOfint = new int[6];
      bool1 = false;
      while (true) {
        arrayOfInt = paramArrayOfint;
        if (bool1 < 6) {
          paramArrayOfint[bool1] = bool1;
          bool1++;
          continue;
        } 
        break;
      } 
    } else {
      arrayOfInt = paramArrayOfint;
    } 
    boolean bool = h0.U(paramInt1);
    if (bool && paramInt1 != 4) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (this.e && e1(paramInt2, 4) && h0.T(paramInt1)) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1) {
      arrayOfAudioProcessor = this.i;
    } else {
      arrayOfAudioProcessor = this.h;
    } 
    if (bool2) {
      this.g.p(paramInt5, paramInt6);
      this.f.m(arrayOfInt);
      AudioProcessor.a a2 = new AudioProcessor.a(paramInt3, paramInt2, paramInt1);
      paramInt6 = arrayOfAudioProcessor.length;
      AudioProcessor.a a1 = a2;
      paramInt5 = 0;
      while (paramInt5 < paramInt6) {
        AudioProcessor audioProcessor = arrayOfAudioProcessor[paramInt5];
        try {
          a2 = audioProcessor.f(a1);
          if (audioProcessor.c())
            a1 = a2; 
          paramInt5++;
        } catch (UnhandledAudioFormatException unhandledAudioFormatException) {
          throw new AudioSink.ConfigurationException(unhandledAudioFormatException);
        } 
      } 
      paramInt5 = a2.b;
      k = a2.c;
      paramInt6 = a2.d;
    } else {
      paramInt6 = paramInt1;
      k = paramInt2;
      paramInt5 = paramInt3;
    } 
    int m = m(k, bool);
    if (m != 0) {
      boolean bool3;
      if (bool) {
        paramInt1 = h0.I(paramInt1, paramInt2);
      } else {
        paramInt1 = -1;
      } 
      if (bool) {
        paramInt2 = h0.I(paramInt6, k);
      } else {
        paramInt2 = -1;
      } 
      if (bool2 && !bool1) {
        bool3 = true;
      } else {
        bool3 = false;
      } 
      d d1 = new d(bool, paramInt1, paramInt3, paramInt2, paramInt5, m, paramInt6, paramInt4, bool2, bool3, (AudioProcessor[])unhandledAudioFormatException);
      if (u()) {
        this.o = d1;
      } else {
        this.p = d1;
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported channel count: ");
    stringBuilder.append(k);
    AudioSink.ConfigurationException configurationException = new AudioSink.ConfigurationException(stringBuilder.toString());
    throw configurationException;
  }
  
  public void flush() {
    if (u()) {
      this.y = 0L;
      this.z = 0L;
      this.A = 0L;
      this.B = 0L;
      this.C = 0;
      l0 l01 = this.s;
      if (l01 != null) {
        this.t = l01;
        this.s = null;
      } else if (!this.l.isEmpty()) {
        this.t = f.a(this.l.getLast());
      } 
      this.l.clear();
      this.u = 0L;
      this.v = 0L;
      this.g.n();
      l();
      this.I = null;
      this.J = null;
      this.O = false;
      this.N = false;
      this.M = -1;
      this.w = null;
      this.x = 0;
      this.D = 0;
      if (this.k.i())
        this.q.pause(); 
      AudioTrack audioTrack = this.q;
      this.q = null;
      d d1 = this.o;
      if (d1 != null) {
        this.p = d1;
        this.o = null;
      } 
      this.k.q();
      this.j.close();
      (new a(this, audioTrack)).start();
    } 
  }
  
  public void g1() {
    if (!this.N && u() && k()) {
      v();
      this.N = true;
    } 
  }
  
  public boolean h1() {
    boolean bool;
    if (u() && this.k.h(r())) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public long i1(boolean paramBoolean) {
    if (!u() || this.D == 0)
      return Long.MIN_VALUE; 
    long l = Math.min(this.k.d(paramBoolean), this.p.e(r()));
    return this.E + i(j(l));
  }
  
  public void j1() {
    if (this.S) {
      this.S = false;
      this.Q = 0;
      flush();
    } 
  }
  
  public void k1(i parami) {
    if (this.r.equals(parami))
      return; 
    this.r = parami;
    if (this.S)
      return; 
    flush();
    this.Q = 0;
  }
  
  public void l1() {
    if (this.D == 1)
      this.D = 2; 
  }
  
  public void m1(float paramFloat) {
    if (this.F != paramFloat) {
      this.F = paramFloat;
      y();
    } 
  }
  
  public boolean n1(ByteBuffer paramByteBuffer, long paramLong) {
    boolean bool;
    ByteBuffer byteBuffer = this.I;
    if (byteBuffer == null || paramByteBuffer == byteBuffer) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.a(bool);
    if (this.o != null) {
      if (!k())
        return false; 
      if (!this.o.b(this.p)) {
        v();
        if (h1())
          return false; 
        flush();
      } else {
        this.p = this.o;
        this.o = null;
      } 
      h(this.t, paramLong);
    } 
    if (!u()) {
      s(paramLong);
      if (this.P)
        c1(); 
    } 
    if (!this.k.k(r()))
      return false; 
    if (this.I == null) {
      if (!paramByteBuffer.hasRemaining())
        return true; 
      d d1 = this.p;
      if (!d1.a && this.C == 0) {
        int k = n(d1.g, paramByteBuffer);
        this.C = k;
        if (k == 0)
          return true; 
      } 
      if (this.s != null) {
        if (!k())
          return false; 
        l0 l01 = this.s;
        this.s = null;
        h(l01, paramLong);
      } 
      if (this.D == 0) {
        this.E = Math.max(0L, paramLong);
        this.D = 1;
      } else {
        long l = this.E + this.p.g(q() - this.g.m());
        if (this.D == 1 && Math.abs(l - paramLong) > 200000L) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Discontinuity detected [expected ");
          stringBuilder.append(l);
          stringBuilder.append(", got ");
          stringBuilder.append(paramLong);
          stringBuilder.append("]");
          o.c("AudioTrack", stringBuilder.toString());
          this.D = 2;
        } 
        if (this.D == 2) {
          l = paramLong - l;
          this.E += l;
          this.D = 1;
          AudioSink.a a1 = this.m;
          if (a1 != null && l != 0L)
            a1.c(); 
        } 
      } 
      if (this.p.a) {
        this.y += paramByteBuffer.remaining();
      } else {
        this.z += this.C;
      } 
      this.I = paramByteBuffer;
    } 
    if (this.p.i) {
      w(paramLong);
    } else {
      C(this.I, paramLong);
    } 
    if (!this.I.hasRemaining()) {
      this.I = null;
      return true;
    } 
    if (this.k.j(r())) {
      o.f("AudioTrack", "Resetting stalled audio track");
      flush();
      return true;
    } 
    return false;
  }
  
  public boolean o() {
    return (!u() || (this.N && !h1()));
  }
  
  public void o1(int paramInt) {
    boolean bool;
    if (h0.a >= 21) {
      bool = true;
    } else {
      bool = false;
    } 
    com.google.android.exoplayer2.util.e.f(bool);
    if (!this.S || this.Q != paramInt) {
      this.S = true;
      this.Q = paramInt;
      flush();
    } 
  }
  
  public void p1(AudioSink.a parama) {
    this.m = parama;
  }
  
  public void pause() {
    this.P = false;
    if (u() && this.k.p())
      this.q.pause(); 
  }
  
  public void q1(o paramo) {
    if (this.R.equals(paramo))
      return; 
    int k = paramo.a;
    float f = paramo.b;
    AudioTrack audioTrack = this.q;
    if (audioTrack != null) {
      if (this.R.a != k)
        audioTrack.attachAuxEffect(k); 
      if (k != 0)
        this.q.setAuxEffectSendLevel(f); 
    } 
    this.R = paramo;
  }
  
  public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    private InvalidAudioTrackTimestampException(String param1String) {
      super(param1String);
    }
  }
  
  class a extends Thread {
    a(DefaultAudioSink this$0, AudioTrack param1AudioTrack) {}
    
    public void run() {
      try {
        this.b.flush();
        this.b.release();
        return;
      } finally {
        DefaultAudioSink.d(this.c).open();
      } 
    }
  }
  
  class b extends Thread {
    b(DefaultAudioSink this$0, AudioTrack param1AudioTrack) {}
    
    public void run() {
      this.b.release();
    }
  }
  
  public static interface c {
    l0 a(l0 param1l0);
    
    long b(long param1Long);
    
    long c();
    
    AudioProcessor[] d();
  }
  
  private static final class d {
    public final boolean a;
    
    public final int b;
    
    public final int c;
    
    public final int d;
    
    public final int e;
    
    public final int f;
    
    public final int g;
    
    public final int h;
    
    public final boolean i;
    
    public final boolean j;
    
    public final AudioProcessor[] k;
    
    public d(boolean param1Boolean1, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, boolean param1Boolean2, boolean param1Boolean3, AudioProcessor[] param1ArrayOfAudioProcessor) {
      this.a = param1Boolean1;
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
      this.e = param1Int4;
      this.f = param1Int5;
      this.g = param1Int6;
      if (param1Int7 == 0)
        param1Int7 = f(); 
      this.h = param1Int7;
      this.i = param1Boolean2;
      this.j = param1Boolean3;
      this.k = param1ArrayOfAudioProcessor;
    }
    
    @TargetApi(21)
    private AudioTrack c(boolean param1Boolean, i param1i, int param1Int) {
      AudioAttributes audioAttributes;
      if (param1Boolean) {
        audioAttributes = (new AudioAttributes.Builder()).setContentType(3).setFlags(16).setUsage(1).build();
      } else {
        audioAttributes = audioAttributes.a();
      } 
      AudioFormat audioFormat = (new AudioFormat.Builder()).setChannelMask(this.f).setEncoding(this.g).setSampleRate(this.e).build();
      int j = this.h;
      if (param1Int == 0)
        param1Int = 0; 
      return new AudioTrack(audioAttributes, audioFormat, j, 1, param1Int);
    }
    
    private int f() {
      if (this.a) {
        boolean bool;
        int k = AudioTrack.getMinBufferSize(this.e, this.f, this.g);
        if (k != -2) {
          bool = true;
        } else {
          bool = false;
        } 
        com.google.android.exoplayer2.util.e.f(bool);
        return h0.n(k * 4, (int)d(250000L) * this.d, (int)Math.max(k, d(750000L) * this.d));
      } 
      int j = DefaultAudioSink.c(this.g);
      int i = j;
      if (this.g == 5)
        i = j * 2; 
      return (int)(i * 250000L / 1000000L);
    }
    
    public AudioTrack a(boolean param1Boolean, i param1i, int param1Int) {
      AudioTrack audioTrack;
      if (h0.a >= 21) {
        audioTrack = c(param1Boolean, param1i, param1Int);
      } else {
        int j = h0.K(((i)audioTrack).d);
        if (param1Int == 0) {
          audioTrack = new AudioTrack(j, this.e, this.f, this.g, this.h, 1);
        } else {
          audioTrack = new AudioTrack(j, this.e, this.f, this.g, this.h, 1, param1Int);
        } 
      } 
      param1Int = audioTrack.getState();
      if (param1Int == 1)
        return audioTrack; 
      try {
        audioTrack.release();
      } catch (Exception exception) {}
      throw new AudioSink.InitializationException(param1Int, this.e, this.f, this.h);
    }
    
    public boolean b(d param1d) {
      boolean bool;
      if (param1d.g == this.g && param1d.e == this.e && param1d.f == this.f) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public long d(long param1Long) {
      return param1Long * this.e / 1000000L;
    }
    
    public long e(long param1Long) {
      return param1Long * 1000000L / this.e;
    }
    
    public long g(long param1Long) {
      return param1Long * 1000000L / this.c;
    }
  }
  
  public static class e implements c {
    private final AudioProcessor[] a;
    
    private final v b;
    
    private final x c;
    
    public e(AudioProcessor... param1VarArgs) {
      AudioProcessor[] arrayOfAudioProcessor = new AudioProcessor[param1VarArgs.length + 2];
      this.a = arrayOfAudioProcessor;
      System.arraycopy(param1VarArgs, 0, arrayOfAudioProcessor, 0, param1VarArgs.length);
      v v1 = new v();
      this.b = v1;
      x x1 = new x();
      this.c = x1;
      arrayOfAudioProcessor[param1VarArgs.length] = v1;
      arrayOfAudioProcessor[param1VarArgs.length + 1] = x1;
    }
    
    public l0 a(l0 param1l0) {
      this.b.w(param1l0.d);
      return new l0(this.c.i(param1l0.b), this.c.h(param1l0.c), param1l0.d);
    }
    
    public long b(long param1Long) {
      return this.c.b(param1Long);
    }
    
    public long c() {
      return this.b.q();
    }
    
    public AudioProcessor[] d() {
      return this.a;
    }
  }
  
  private static final class f {
    private final l0 a;
    
    private final long b;
    
    private final long c;
    
    private f(l0 param1l0, long param1Long1, long param1Long2) {
      this.a = param1l0;
      this.b = param1Long1;
      this.c = param1Long2;
    }
  }
  
  private final class g implements n.a {
    private g(DefaultAudioSink this$0) {}
    
    public void a(int param1Int, long param1Long) {
      if (DefaultAudioSink.g(this.a) != null) {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = DefaultAudioSink.b(this.a);
        DefaultAudioSink.g(this.a).b(param1Int, param1Long, l1 - l2);
      } 
    }
    
    public void b(long param1Long) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Ignoring impossibly large audio latency: ");
      stringBuilder.append(param1Long);
      o.f("AudioTrack", stringBuilder.toString());
    }
    
    public void c(long param1Long1, long param1Long2, long param1Long3, long param1Long4) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Spurious audio timestamp (frame position mismatch): ");
      stringBuilder.append(param1Long1);
      stringBuilder.append(", ");
      stringBuilder.append(param1Long2);
      stringBuilder.append(", ");
      stringBuilder.append(param1Long3);
      stringBuilder.append(", ");
      stringBuilder.append(param1Long4);
      stringBuilder.append(", ");
      stringBuilder.append(DefaultAudioSink.e(this.a));
      stringBuilder.append(", ");
      stringBuilder.append(DefaultAudioSink.f(this.a));
      String str = stringBuilder.toString();
      if (!DefaultAudioSink.b) {
        o.f("AudioTrack", str);
        return;
      } 
      throw new DefaultAudioSink.InvalidAudioTrackTimestampException(str, null);
    }
    
    public void d(long param1Long1, long param1Long2, long param1Long3, long param1Long4) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Spurious audio timestamp (system clock mismatch): ");
      stringBuilder.append(param1Long1);
      stringBuilder.append(", ");
      stringBuilder.append(param1Long2);
      stringBuilder.append(", ");
      stringBuilder.append(param1Long3);
      stringBuilder.append(", ");
      stringBuilder.append(param1Long4);
      stringBuilder.append(", ");
      stringBuilder.append(DefaultAudioSink.e(this.a));
      stringBuilder.append(", ");
      stringBuilder.append(DefaultAudioSink.f(this.a));
      String str = stringBuilder.toString();
      if (!DefaultAudioSink.b) {
        o.f("AudioTrack", str);
        return;
      } 
      throw new DefaultAudioSink.InvalidAudioTrackTimestampException(str, null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/DefaultAudioSink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */