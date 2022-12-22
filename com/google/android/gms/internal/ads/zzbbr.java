package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.h1;
import java.util.Arrays;

@TargetApi(16)
public final class zzbbr extends zzbav implements TextureView.SurfaceTextureListener, kp {
  private final eo d;
  
  private final do e;
  
  private final boolean f;
  
  private final bo g;
  
  private mn h;
  
  private Surface i;
  
  private ap j;
  
  private String k;
  
  private String[] l;
  
  private boolean m;
  
  private int n = 1;
  
  private co o;
  
  private final boolean p;
  
  private boolean q;
  
  private boolean r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private float w;
  
  public zzbbr(Context paramContext, do paramdo, eo parameo, boolean paramBoolean1, boolean paramBoolean2, bo parambo) {
    super(paramContext);
    this.f = paramBoolean2;
    this.d = parameo;
    this.e = paramdo;
    this.p = paramBoolean1;
    this.g = parambo;
    setSurfaceTextureListener(this);
    paramdo.d(this);
  }
  
  private final boolean A() {
    return (z() && this.n != 1);
  }
  
  private final void B() {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Lcom/google/android/gms/internal/ads/ap;
    //   4: ifnull -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield k : Ljava/lang/String;
    //   12: astore_1
    //   13: aload_1
    //   14: ifnull -> 321
    //   17: aload_0
    //   18: getfield i : Landroid/view/Surface;
    //   21: ifnonnull -> 27
    //   24: goto -> 321
    //   27: aload_1
    //   28: ldc 'cache:'
    //   30: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   33: ifeq -> 201
    //   36: aload_0
    //   37: getfield d : Lcom/google/android/gms/internal/ads/eo;
    //   40: aload_0
    //   41: getfield k : Ljava/lang/String;
    //   44: invokeinterface y : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/up;
    //   49: astore_1
    //   50: aload_1
    //   51: instanceof com/google/android/gms/internal/ads/jq
    //   54: ifeq -> 83
    //   57: aload_1
    //   58: checkcast com/google/android/gms/internal/ads/jq
    //   61: invokevirtual z : ()Lcom/google/android/gms/internal/ads/ap;
    //   64: astore_1
    //   65: aload_0
    //   66: aload_1
    //   67: putfield j : Lcom/google/android/gms/internal/ads/ap;
    //   70: aload_1
    //   71: invokevirtual J : ()Lcom/google/android/gms/internal/ads/bc2;
    //   74: ifnonnull -> 264
    //   77: ldc 'Precached video player has been released.'
    //   79: invokestatic i : (Ljava/lang/String;)V
    //   82: return
    //   83: aload_1
    //   84: instanceof com/google/android/gms/internal/ads/gq
    //   87: ifeq -> 161
    //   90: aload_1
    //   91: checkcast com/google/android/gms/internal/ads/gq
    //   94: astore_2
    //   95: aload_0
    //   96: invokespecial y : ()Ljava/lang/String;
    //   99: astore_1
    //   100: aload_2
    //   101: invokevirtual z : ()Ljava/nio/ByteBuffer;
    //   104: astore_3
    //   105: aload_2
    //   106: invokevirtual C : ()Z
    //   109: istore #4
    //   111: aload_2
    //   112: invokevirtual A : ()Ljava/lang/String;
    //   115: astore_2
    //   116: aload_2
    //   117: ifnonnull -> 126
    //   120: ldc 'Stream cache URL is null.'
    //   122: invokestatic i : (Ljava/lang/String;)V
    //   125: return
    //   126: aload_0
    //   127: invokespecial x : ()Lcom/google/android/gms/internal/ads/ap;
    //   130: astore #5
    //   132: aload_0
    //   133: aload #5
    //   135: putfield j : Lcom/google/android/gms/internal/ads/ap;
    //   138: aload #5
    //   140: iconst_1
    //   141: anewarray android/net/Uri
    //   144: dup
    //   145: iconst_0
    //   146: aload_2
    //   147: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   150: aastore
    //   151: aload_1
    //   152: aload_3
    //   153: iload #4
    //   155: invokevirtual F : ([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V
    //   158: goto -> 264
    //   161: aload_0
    //   162: getfield k : Ljava/lang/String;
    //   165: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   168: astore_1
    //   169: aload_1
    //   170: invokevirtual length : ()I
    //   173: ifeq -> 186
    //   176: ldc 'Stream cache miss: '
    //   178: aload_1
    //   179: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   182: astore_1
    //   183: goto -> 196
    //   186: new java/lang/String
    //   189: dup
    //   190: ldc 'Stream cache miss: '
    //   192: invokespecial <init> : (Ljava/lang/String;)V
    //   195: astore_1
    //   196: aload_1
    //   197: invokestatic i : (Ljava/lang/String;)V
    //   200: return
    //   201: aload_0
    //   202: aload_0
    //   203: invokespecial x : ()Lcom/google/android/gms/internal/ads/ap;
    //   206: putfield j : Lcom/google/android/gms/internal/ads/ap;
    //   209: aload_0
    //   210: invokespecial y : ()Ljava/lang/String;
    //   213: astore_3
    //   214: aload_0
    //   215: getfield l : [Ljava/lang/String;
    //   218: arraylength
    //   219: anewarray android/net/Uri
    //   222: astore_2
    //   223: iconst_0
    //   224: istore #6
    //   226: aload_0
    //   227: getfield l : [Ljava/lang/String;
    //   230: astore_1
    //   231: iload #6
    //   233: aload_1
    //   234: arraylength
    //   235: if_icmpge -> 255
    //   238: aload_2
    //   239: iload #6
    //   241: aload_1
    //   242: iload #6
    //   244: aaload
    //   245: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   248: aastore
    //   249: iinc #6, 1
    //   252: goto -> 226
    //   255: aload_0
    //   256: getfield j : Lcom/google/android/gms/internal/ads/ap;
    //   259: aload_2
    //   260: aload_3
    //   261: invokevirtual E : ([Landroid/net/Uri;Ljava/lang/String;)V
    //   264: aload_0
    //   265: getfield j : Lcom/google/android/gms/internal/ads/ap;
    //   268: aload_0
    //   269: invokevirtual D : (Lcom/google/android/gms/internal/ads/kp;)V
    //   272: aload_0
    //   273: aload_0
    //   274: getfield i : Landroid/view/Surface;
    //   277: iconst_0
    //   278: invokespecial w : (Landroid/view/Surface;Z)V
    //   281: aload_0
    //   282: getfield j : Lcom/google/android/gms/internal/ads/ap;
    //   285: invokevirtual J : ()Lcom/google/android/gms/internal/ads/bc2;
    //   288: ifnull -> 321
    //   291: aload_0
    //   292: getfield j : Lcom/google/android/gms/internal/ads/ap;
    //   295: invokevirtual J : ()Lcom/google/android/gms/internal/ads/bc2;
    //   298: invokeinterface V : ()I
    //   303: istore #6
    //   305: aload_0
    //   306: iload #6
    //   308: putfield n : I
    //   311: iload #6
    //   313: iconst_3
    //   314: if_icmpne -> 321
    //   317: aload_0
    //   318: invokespecial C : ()V
    //   321: return
  }
  
  private final void C() {
    if (this.q)
      return; 
    this.q = true;
    h1.a.post(new jo(this));
    super.a();
    this.e.f();
    if (this.r)
      super.g(); 
  }
  
  private final void D() {
    P(this.s, this.t);
  }
  
  private final void E() {
    ap ap1 = this.j;
    if (ap1 != null)
      ap1.N(true); 
  }
  
  private final void F() {
    ap ap1 = this.j;
    if (ap1 != null)
      ap1.N(false); 
  }
  
  private final void P(int paramInt1, int paramInt2) {
    float f;
    if (paramInt2 > 0) {
      f = paramInt1 / paramInt2;
    } else {
      f = 1.0F;
    } 
    if (this.w != f) {
      this.w = f;
      requestLayout();
    } 
  }
  
  private final void v(float paramFloat, boolean paramBoolean) {
    ap ap1 = this.j;
    if (ap1 != null) {
      ap1.P(paramFloat, paramBoolean);
      return;
    } 
    cm.i("Trying to set volume before player is initalized.");
  }
  
  private final void w(Surface paramSurface, boolean paramBoolean) {
    ap ap1 = this.j;
    if (ap1 != null) {
      ap1.C(paramSurface, paramBoolean);
      return;
    } 
    cm.i("Trying to set surface before player is initalized.");
  }
  
  private final ap x() {
    return new ap(this.d.getContext(), this.g, this.d);
  }
  
  private final String y() {
    return q.c().r0(this.d.getContext(), (this.d.b()).b);
  }
  
  private final boolean z() {
    ap ap1 = this.j;
    return (ap1 != null && ap1.J() != null && !this.m);
  }
  
  public final void a() {
    v(this.c.a(), false);
  }
  
  public final void b(boolean paramBoolean, long paramLong) {
    if (this.d != null)
      fm.e.execute(new ro(this, paramBoolean, paramLong)); 
  }
  
  public final void c() {
    if (A()) {
      if (this.g.a)
        F(); 
      this.j.J().i(false);
      this.e.c();
      this.c.e();
      h1.a.post(new no(this));
    } 
  }
  
  public final void d(int paramInt1, int paramInt2) {
    this.s = paramInt1;
    this.t = paramInt2;
    D();
  }
  
  public final void e(String paramString, Exception paramException) {
    String str2 = paramException.getClass().getCanonicalName();
    String str3 = paramException.getMessage();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
    stringBuilder.append(paramString);
    stringBuilder.append("/");
    stringBuilder.append(str2);
    stringBuilder.append(":");
    stringBuilder.append(str3);
    String str1 = stringBuilder.toString();
    paramString = String.valueOf(str1);
    if (paramString.length() != 0) {
      paramString = "ExoPlayerAdapter error: ".concat(paramString);
    } else {
      paramString = new String("ExoPlayerAdapter error: ");
    } 
    cm.i(paramString);
    this.m = true;
    if (this.g.a)
      F(); 
    h1.a.post(new lo(this, str1));
  }
  
  public final void f(int paramInt) {
    if (this.n != paramInt) {
      this.n = paramInt;
      if (paramInt != 3) {
        if (paramInt == 4) {
          if (this.g.a)
            F(); 
          this.e.c();
          this.c.e();
          h1.a.post(new io(this));
        } 
      } else {
        C();
      } 
    } 
  }
  
  public final void g() {
    if (A()) {
      if (this.g.a)
        E(); 
      this.j.J().i(true);
      this.e.b();
      this.c.d();
      this.b.b();
      h1.a.post(new ko(this));
      return;
    } 
    this.r = true;
  }
  
  public final int getCurrentPosition() {
    return A() ? (int)this.j.J().k() : 0;
  }
  
  public final int getDuration() {
    return A() ? (int)this.j.J().getDuration() : 0;
  }
  
  public final long getTotalBytes() {
    ap ap1 = this.j;
    return (ap1 != null) ? ap1.z() : -1L;
  }
  
  public final int getVideoHeight() {
    return this.t;
  }
  
  public final int getVideoWidth() {
    return this.s;
  }
  
  public final void h(int paramInt) {
    if (A())
      this.j.J().e(paramInt); 
  }
  
  public final void i() {
    if (z()) {
      this.j.J().stop();
      if (this.j != null) {
        w(null, true);
        ap ap1 = this.j;
        if (ap1 != null) {
          ap1.D(null);
          this.j.A();
          this.j = null;
        } 
        this.n = 1;
        this.m = false;
        this.q = false;
        this.r = false;
      } 
    } 
    this.e.c();
    this.c.e();
    this.e.a();
  }
  
  public final void j(float paramFloat1, float paramFloat2) {
    co co1 = this.o;
    if (co1 != null)
      co1.h(paramFloat1, paramFloat2); 
  }
  
  public final void k(mn parammn) {
    this.h = parammn;
  }
  
  public final String l() {
    String str;
    if (this.p) {
      str = " spherical";
    } else {
      str = "";
    } 
    return (str.length() != 0) ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
  }
  
  public final long m() {
    ap ap1 = this.j;
    return (ap1 != null) ? ap1.G() : -1L;
  }
  
  public final int n() {
    ap ap1 = this.j;
    return (ap1 != null) ? ap1.H() : -1;
  }
  
  public final void o(String paramString, String[] paramArrayOfString) {
    if (paramString != null) {
      if (paramArrayOfString == null)
        super.setVideoPath(paramString); 
      this.k = paramString;
      this.l = Arrays.<String>copyOf(paramArrayOfString, paramArrayOfString.length);
      B();
    } 
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokespecial onMeasure : (II)V
    //   6: aload_0
    //   7: invokevirtual getMeasuredWidth : ()I
    //   10: istore_3
    //   11: aload_0
    //   12: invokevirtual getMeasuredHeight : ()I
    //   15: istore_1
    //   16: aload_0
    //   17: getfield w : F
    //   20: fstore #4
    //   22: iload_3
    //   23: istore #5
    //   25: iload_1
    //   26: istore_2
    //   27: fload #4
    //   29: fconst_0
    //   30: fcmpl
    //   31: ifeq -> 95
    //   34: iload_3
    //   35: istore #5
    //   37: iload_1
    //   38: istore_2
    //   39: aload_0
    //   40: getfield o : Lcom/google/android/gms/internal/ads/co;
    //   43: ifnonnull -> 95
    //   46: iload_3
    //   47: i2f
    //   48: fstore #6
    //   50: fload #6
    //   52: iload_1
    //   53: i2f
    //   54: fdiv
    //   55: fstore #7
    //   57: fload #4
    //   59: fload #7
    //   61: fcmpl
    //   62: ifle -> 72
    //   65: fload #6
    //   67: fload #4
    //   69: fdiv
    //   70: f2i
    //   71: istore_1
    //   72: iload_3
    //   73: istore #5
    //   75: iload_1
    //   76: istore_2
    //   77: fload #4
    //   79: fload #7
    //   81: fcmpg
    //   82: ifge -> 95
    //   85: iload_1
    //   86: i2f
    //   87: fload #4
    //   89: fmul
    //   90: f2i
    //   91: istore #5
    //   93: iload_1
    //   94: istore_2
    //   95: aload_0
    //   96: iload #5
    //   98: iload_2
    //   99: invokevirtual setMeasuredDimension : (II)V
    //   102: aload_0
    //   103: getfield o : Lcom/google/android/gms/internal/ads/co;
    //   106: astore #8
    //   108: aload #8
    //   110: ifnull -> 121
    //   113: aload #8
    //   115: iload #5
    //   117: iload_2
    //   118: invokevirtual l : (II)V
    //   121: getstatic android/os/Build$VERSION.SDK_INT : I
    //   124: bipush #16
    //   126: if_icmpne -> 300
    //   129: aload_0
    //   130: getfield u : I
    //   133: istore_1
    //   134: iload_1
    //   135: ifle -> 144
    //   138: iload_1
    //   139: iload #5
    //   141: if_icmpne -> 158
    //   144: aload_0
    //   145: getfield v : I
    //   148: istore_1
    //   149: iload_1
    //   150: ifle -> 289
    //   153: iload_1
    //   154: iload_2
    //   155: if_icmpeq -> 289
    //   158: aload_0
    //   159: getfield f : Z
    //   162: ifeq -> 289
    //   165: aload_0
    //   166: invokespecial z : ()Z
    //   169: ifeq -> 289
    //   172: aload_0
    //   173: getfield j : Lcom/google/android/gms/internal/ads/ap;
    //   176: invokevirtual J : ()Lcom/google/android/gms/internal/ads/bc2;
    //   179: astore #8
    //   181: aload #8
    //   183: invokeinterface k : ()J
    //   188: lconst_0
    //   189: lcmp
    //   190: ifle -> 289
    //   193: aload #8
    //   195: invokeinterface d : ()Z
    //   200: ifeq -> 206
    //   203: goto -> 289
    //   206: aload_0
    //   207: fconst_0
    //   208: iconst_1
    //   209: invokespecial v : (FZ)V
    //   212: aload #8
    //   214: iconst_1
    //   215: invokeinterface i : (Z)V
    //   220: aload #8
    //   222: invokeinterface k : ()J
    //   227: lstore #9
    //   229: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   232: invokeinterface a : ()J
    //   237: lstore #11
    //   239: aload_0
    //   240: invokespecial z : ()Z
    //   243: ifeq -> 277
    //   246: aload #8
    //   248: invokeinterface k : ()J
    //   253: lload #9
    //   255: lcmp
    //   256: ifne -> 277
    //   259: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   262: invokeinterface a : ()J
    //   267: lload #11
    //   269: lsub
    //   270: ldc2_w 250
    //   273: lcmp
    //   274: ifle -> 239
    //   277: aload #8
    //   279: iconst_0
    //   280: invokeinterface i : (Z)V
    //   285: aload_0
    //   286: invokevirtual a : ()V
    //   289: aload_0
    //   290: iload #5
    //   292: putfield u : I
    //   295: aload_0
    //   296: iload_2
    //   297: putfield v : I
    //   300: return
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    SurfaceTexture surfaceTexture = paramSurfaceTexture;
    if (this.p) {
      co co1 = new co(getContext());
      this.o = co1;
      co1.b(paramSurfaceTexture, paramInt1, paramInt2);
      this.o.start();
      surfaceTexture = this.o.f();
      if (surfaceTexture == null) {
        this.o.e();
        this.o = null;
        surfaceTexture = paramSurfaceTexture;
      } 
    } 
    Surface surface = new Surface(surfaceTexture);
    this.i = surface;
    if (this.j == null) {
      B();
    } else {
      w(surface, true);
      if (!this.g.a)
        E(); 
    } 
    if (this.s == 0 || this.t == 0) {
      P(paramInt1, paramInt2);
    } else {
      D();
    } 
    h1.a.post(new mo(this));
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture) {
    super.c();
    co co1 = this.o;
    if (co1 != null) {
      co1.e();
      this.o = null;
    } 
    if (this.j != null) {
      F();
      Surface surface = this.i;
      if (surface != null)
        surface.release(); 
      this.i = null;
      w(null, true);
    } 
    h1.a.post(new oo(this));
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    co co1 = this.o;
    if (co1 != null)
      co1.l(paramInt1, paramInt2); 
    h1.a.post(new qo(this, paramInt1, paramInt2));
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {
    this.e.e(this);
    this.b.a(paramSurfaceTexture, this.h);
  }
  
  protected final void onWindowVisibilityChanged(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder(57);
    stringBuilder.append("AdExoPlayerView3 window visibility changed to ");
    stringBuilder.append(paramInt);
    b1.m(stringBuilder.toString());
    h1.a.post(new so(this, paramInt));
    super.onWindowVisibilityChanged(paramInt);
  }
  
  public final void p(int paramInt) {
    ap ap1 = this.j;
    if (ap1 != null)
      ap1.M().j(paramInt); 
  }
  
  public final void q(int paramInt) {
    ap ap1 = this.j;
    if (ap1 != null)
      ap1.M().k(paramInt); 
  }
  
  public final void r(int paramInt) {
    ap ap1 = this.j;
    if (ap1 != null)
      ap1.M().h(paramInt); 
  }
  
  public final void s(int paramInt) {
    ap ap1 = this.j;
    if (ap1 != null)
      ap1.M().i(paramInt); 
  }
  
  public final void setVideoPath(String paramString) {
    if (paramString != null) {
      this.k = paramString;
      this.l = new String[] { paramString };
      B();
    } 
  }
  
  public final void t(int paramInt) {
    ap ap1 = this.j;
    if (ap1 != null)
      ap1.R(paramInt); 
  }
  
  public final long u() {
    ap ap1 = this.j;
    return (ap1 != null) ? ap1.V() : -1L;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzbbr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */