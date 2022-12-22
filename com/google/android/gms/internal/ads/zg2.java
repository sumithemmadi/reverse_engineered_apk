package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

final class zg2 implements pe2, kh2, vh2, cj2<ch2> {
  private boolean[] A;
  
  private boolean[] B;
  
  private boolean C;
  
  private long D;
  
  private long E;
  
  private long F;
  
  private int G;
  
  private boolean H;
  
  private boolean I;
  
  private final Uri b;
  
  private final ti2 c;
  
  private final int d;
  
  private final Handler e;
  
  private final gh2 f;
  
  private final lh2 g;
  
  private final ri2 h;
  
  private final String i;
  
  private final long j;
  
  private final ej2 k;
  
  private final fh2 l;
  
  private final lj2 m;
  
  private final Runnable n;
  
  private final Runnable o;
  
  private final Handler p;
  
  private final SparseArray<th2> q;
  
  private jh2 r;
  
  private se2 s;
  
  private boolean t;
  
  private boolean u;
  
  private boolean v;
  
  private boolean w;
  
  private int x;
  
  private ai2 y;
  
  private long z;
  
  public zg2(Uri paramUri, ti2 paramti2, ne2[] paramArrayOfne2, int paramInt1, Handler paramHandler, gh2 paramgh2, lh2 paramlh2, ri2 paramri2, String paramString, int paramInt2) {
    this.b = paramUri;
    this.c = paramti2;
    this.d = paramInt1;
    this.e = paramHandler;
    this.f = paramgh2;
    this.g = paramlh2;
    this.h = paramri2;
    this.i = null;
    this.j = paramInt2;
    this.k = new ej2("Loader:ExtractorMediaPeriod");
    this.l = new fh2(paramArrayOfne2, this);
    this.m = new lj2();
    this.n = new yg2(this);
    this.o = new bh2(this);
    this.p = new Handler();
    this.F = -9223372036854775807L;
    this.q = new SparseArray();
    this.D = -1L;
  }
  
  private final void G() {
    if (!this.I && !this.u && this.s != null && this.t) {
      int i = this.q.size();
      byte b;
      for (b = 0; b < i; b++) {
        if (((th2)this.q.valueAt(b)).p() == null)
          return; 
      } 
      this.m.c();
      yh2[] arrayOfYh2 = new yh2[i];
      this.B = new boolean[i];
      this.A = new boolean[i];
      this.z = this.s.c();
      b = 0;
      while (true) {
        boolean bool = true;
        if (b < i) {
          zzht zzht = ((th2)this.q.valueAt(b)).p();
          arrayOfYh2[b] = new yh2(new zzht[] { zzht });
          String str = zzht.g;
          boolean bool1 = bool;
          if (!mj2.b(str))
            if (mj2.a(str)) {
              bool1 = bool;
            } else {
              bool1 = false;
            }  
          this.B[b] = bool1;
          this.C = bool1 | this.C;
          b++;
          continue;
        } 
        this.y = new ai2(arrayOfYh2);
        this.u = true;
        this.g.d(new zh2(this.z, this.s.b()), null);
        this.r.e(this);
        break;
      } 
    } 
  }
  
  private final int H() {
    int i = this.q.size();
    byte b = 0;
    int j = 0;
    while (b < i) {
      j += ((th2)this.q.valueAt(b)).n();
      b++;
    } 
    return j;
  }
  
  private final long I() {
    int i = this.q.size();
    long l = Long.MIN_VALUE;
    for (byte b = 0; b < i; b++)
      l = Math.max(l, ((th2)this.q.valueAt(b)).l()); 
    return l;
  }
  
  private final boolean J() {
    return (this.F != -9223372036854775807L);
  }
  
  private final void s() {
    // Byte code:
    //   0: new com/google/android/gms/internal/ads/ch2
    //   3: dup
    //   4: aload_0
    //   5: aload_0
    //   6: getfield b : Landroid/net/Uri;
    //   9: aload_0
    //   10: getfield c : Lcom/google/android/gms/internal/ads/ti2;
    //   13: aload_0
    //   14: getfield l : Lcom/google/android/gms/internal/ads/fh2;
    //   17: aload_0
    //   18: getfield m : Lcom/google/android/gms/internal/ads/lj2;
    //   21: invokespecial <init> : (Lcom/google/android/gms/internal/ads/zg2;Landroid/net/Uri;Lcom/google/android/gms/internal/ads/ti2;Lcom/google/android/gms/internal/ads/fh2;Lcom/google/android/gms/internal/ads/lj2;)V
    //   24: astore_1
    //   25: aload_0
    //   26: getfield u : Z
    //   29: ifeq -> 102
    //   32: aload_0
    //   33: invokespecial J : ()Z
    //   36: invokestatic e : (Z)V
    //   39: aload_0
    //   40: getfield z : J
    //   43: lstore_2
    //   44: lload_2
    //   45: ldc2_w -9223372036854775807
    //   48: lcmp
    //   49: ifeq -> 74
    //   52: aload_0
    //   53: getfield F : J
    //   56: lload_2
    //   57: lcmp
    //   58: iflt -> 74
    //   61: aload_0
    //   62: iconst_1
    //   63: putfield H : Z
    //   66: aload_0
    //   67: ldc2_w -9223372036854775807
    //   70: putfield F : J
    //   73: return
    //   74: aload_1
    //   75: aload_0
    //   76: getfield s : Lcom/google/android/gms/internal/ads/se2;
    //   79: aload_0
    //   80: getfield F : J
    //   83: invokeinterface f : (J)J
    //   88: aload_0
    //   89: getfield F : J
    //   92: invokevirtual e : (JJ)V
    //   95: aload_0
    //   96: ldc2_w -9223372036854775807
    //   99: putfield F : J
    //   102: aload_0
    //   103: aload_0
    //   104: invokespecial H : ()I
    //   107: putfield G : I
    //   110: aload_0
    //   111: getfield d : I
    //   114: istore #4
    //   116: iload #4
    //   118: istore #5
    //   120: iload #4
    //   122: iconst_m1
    //   123: if_icmpne -> 182
    //   126: aload_0
    //   127: getfield u : Z
    //   130: ifeq -> 179
    //   133: aload_0
    //   134: getfield D : J
    //   137: ldc2_w -1
    //   140: lcmp
    //   141: ifne -> 179
    //   144: aload_0
    //   145: getfield s : Lcom/google/android/gms/internal/ads/se2;
    //   148: astore #6
    //   150: aload #6
    //   152: ifnull -> 172
    //   155: aload #6
    //   157: invokeinterface c : ()J
    //   162: ldc2_w -9223372036854775807
    //   165: lcmp
    //   166: ifeq -> 172
    //   169: goto -> 179
    //   172: bipush #6
    //   174: istore #5
    //   176: goto -> 182
    //   179: iconst_3
    //   180: istore #5
    //   182: aload_0
    //   183: getfield k : Lcom/google/android/gms/internal/ads/ej2;
    //   186: aload_1
    //   187: aload_0
    //   188: iload #5
    //   190: invokevirtual b : (Lcom/google/android/gms/internal/ads/fj2;Lcom/google/android/gms/internal/ads/cj2;I)J
    //   193: pop2
    //   194: return
  }
  
  private final void v(ch2 paramch2) {
    if (this.D == -1L)
      this.D = ch2.d(paramch2); 
  }
  
  final void B(int paramInt, long paramLong) {
    th2 th2 = (th2)this.q.valueAt(paramInt);
    if (this.H && paramLong > th2.l()) {
      th2.q();
      return;
    } 
    th2.j(paramLong, true);
  }
  
  final void F() {
    this.k.h(-2147483648);
  }
  
  public final boolean a(long paramLong) {
    if (this.H || (this.u && this.x == 0))
      return false; 
    boolean bool = this.m.b();
    if (!this.k.a()) {
      s();
      bool = true;
    } 
    return bool;
  }
  
  public final long b() {
    return (this.x == 0) ? Long.MIN_VALUE : h();
  }
  
  public final void c(zzht paramzzht) {
    this.p.post(this.n);
  }
  
  public final void d() {
    this.t = true;
    this.p.post(this.n);
  }
  
  public final ue2 e(int paramInt1, int paramInt2) {
    th2 th21 = (th2)this.q.get(paramInt1);
    th2 th22 = th21;
    if (th21 == null) {
      th22 = new th2(this.h);
      th22.h(this);
      this.q.put(paramInt1, th22);
    } 
    return th22;
  }
  
  public final void f(long paramLong) {}
  
  public final long h() {
    long l;
    if (this.H)
      return Long.MIN_VALUE; 
    if (J())
      return this.F; 
    if (this.C) {
      long l1 = Long.MAX_VALUE;
      int i = this.q.size();
      byte b = 0;
      while (true) {
        l = l1;
        if (b < i) {
          l = l1;
          if (this.B[b])
            l = Math.min(l1, ((th2)this.q.valueAt(b)).l()); 
          b++;
          l1 = l;
          continue;
        } 
        break;
      } 
    } else {
      l = I();
    } 
    return (l == Long.MIN_VALUE) ? this.E : l;
  }
  
  public final long i(long paramLong) {
    boolean bool;
    if (!this.s.b())
      paramLong = 0L; 
    this.E = paramLong;
    int i = this.q.size();
    int j = J() ^ true;
    byte b;
    for (b = 0; j != 0 && b < i; b++) {
      if (this.A[b])
        bool = ((th2)this.q.valueAt(b)).j(paramLong, false); 
    } 
    if (!bool) {
      this.F = paramLong;
      this.H = false;
      if (this.k.a()) {
        this.k.i();
      } else {
        for (b = 0; b < i; b++)
          ((th2)this.q.valueAt(b)).t(this.A[b]); 
      } 
    } 
    this.w = false;
    return paramLong;
  }
  
  public final void k(jh2 paramjh2, long paramLong) {
    this.r = paramjh2;
    this.m.b();
    s();
  }
  
  public final ai2 l() {
    return this.y;
  }
  
  public final long n() {
    if (this.w) {
      this.w = false;
      return this.E;
    } 
    return -9223372036854775807L;
  }
  
  public final void o(se2 paramse2) {
    this.s = paramse2;
    this.p.post(this.n);
  }
  
  public final long p(mi2[] paramArrayOfmi2, boolean[] paramArrayOfboolean1, uh2[] paramArrayOfuh2, boolean[] paramArrayOfboolean2, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield u : Z
    //   4: invokestatic e : (Z)V
    //   7: iconst_0
    //   8: istore #7
    //   10: iconst_0
    //   11: istore #8
    //   13: iload #8
    //   15: aload_1
    //   16: arraylength
    //   17: if_icmpge -> 107
    //   20: aload_3
    //   21: iload #8
    //   23: aaload
    //   24: ifnull -> 101
    //   27: aload_1
    //   28: iload #8
    //   30: aaload
    //   31: ifnull -> 41
    //   34: aload_2
    //   35: iload #8
    //   37: baload
    //   38: ifne -> 101
    //   41: aload_3
    //   42: iload #8
    //   44: aaload
    //   45: checkcast com/google/android/gms/internal/ads/eh2
    //   48: invokestatic d : (Lcom/google/android/gms/internal/ads/eh2;)I
    //   51: istore #9
    //   53: aload_0
    //   54: getfield A : [Z
    //   57: iload #9
    //   59: baload
    //   60: invokestatic e : (Z)V
    //   63: aload_0
    //   64: aload_0
    //   65: getfield x : I
    //   68: iconst_1
    //   69: isub
    //   70: putfield x : I
    //   73: aload_0
    //   74: getfield A : [Z
    //   77: iload #9
    //   79: iconst_0
    //   80: bastore
    //   81: aload_0
    //   82: getfield q : Landroid/util/SparseArray;
    //   85: iload #9
    //   87: invokevirtual valueAt : (I)Ljava/lang/Object;
    //   90: checkcast com/google/android/gms/internal/ads/th2
    //   93: invokevirtual e : ()V
    //   96: aload_3
    //   97: iload #8
    //   99: aconst_null
    //   100: aastore
    //   101: iinc #8, 1
    //   104: goto -> 13
    //   107: iconst_0
    //   108: istore #9
    //   110: iconst_0
    //   111: istore #8
    //   113: iload #9
    //   115: aload_1
    //   116: arraylength
    //   117: if_icmpge -> 273
    //   120: iload #8
    //   122: istore #10
    //   124: aload_3
    //   125: iload #9
    //   127: aaload
    //   128: ifnonnull -> 263
    //   131: iload #8
    //   133: istore #10
    //   135: aload_1
    //   136: iload #9
    //   138: aaload
    //   139: ifnull -> 263
    //   142: aload_1
    //   143: iload #9
    //   145: aaload
    //   146: astore_2
    //   147: aload_2
    //   148: invokeinterface length : ()I
    //   153: iconst_1
    //   154: if_icmpne -> 163
    //   157: iconst_1
    //   158: istore #11
    //   160: goto -> 166
    //   163: iconst_0
    //   164: istore #11
    //   166: iload #11
    //   168: invokestatic e : (Z)V
    //   171: aload_2
    //   172: iconst_0
    //   173: invokeinterface a : (I)I
    //   178: ifne -> 187
    //   181: iconst_1
    //   182: istore #11
    //   184: goto -> 190
    //   187: iconst_0
    //   188: istore #11
    //   190: iload #11
    //   192: invokestatic e : (Z)V
    //   195: aload_0
    //   196: getfield y : Lcom/google/android/gms/internal/ads/ai2;
    //   199: aload_2
    //   200: invokeinterface b : ()Lcom/google/android/gms/internal/ads/yh2;
    //   205: invokevirtual a : (Lcom/google/android/gms/internal/ads/yh2;)I
    //   208: istore #8
    //   210: aload_0
    //   211: getfield A : [Z
    //   214: iload #8
    //   216: baload
    //   217: iconst_1
    //   218: ixor
    //   219: invokestatic e : (Z)V
    //   222: aload_0
    //   223: aload_0
    //   224: getfield x : I
    //   227: iconst_1
    //   228: iadd
    //   229: putfield x : I
    //   232: aload_0
    //   233: getfield A : [Z
    //   236: iload #8
    //   238: iconst_1
    //   239: bastore
    //   240: aload_3
    //   241: iload #9
    //   243: new com/google/android/gms/internal/ads/eh2
    //   246: dup
    //   247: aload_0
    //   248: iload #8
    //   250: invokespecial <init> : (Lcom/google/android/gms/internal/ads/zg2;I)V
    //   253: aastore
    //   254: aload #4
    //   256: iload #9
    //   258: iconst_1
    //   259: bastore
    //   260: iconst_1
    //   261: istore #10
    //   263: iinc #9, 1
    //   266: iload #10
    //   268: istore #8
    //   270: goto -> 113
    //   273: aload_0
    //   274: getfield v : Z
    //   277: ifne -> 330
    //   280: aload_0
    //   281: getfield q : Landroid/util/SparseArray;
    //   284: invokevirtual size : ()I
    //   287: istore #10
    //   289: iconst_0
    //   290: istore #9
    //   292: iload #9
    //   294: iload #10
    //   296: if_icmpge -> 330
    //   299: aload_0
    //   300: getfield A : [Z
    //   303: iload #9
    //   305: baload
    //   306: ifne -> 324
    //   309: aload_0
    //   310: getfield q : Landroid/util/SparseArray;
    //   313: iload #9
    //   315: invokevirtual valueAt : (I)Ljava/lang/Object;
    //   318: checkcast com/google/android/gms/internal/ads/th2
    //   321: invokevirtual e : ()V
    //   324: iinc #9, 1
    //   327: goto -> 292
    //   330: aload_0
    //   331: getfield x : I
    //   334: ifne -> 370
    //   337: aload_0
    //   338: iconst_0
    //   339: putfield w : Z
    //   342: lload #5
    //   344: lstore #12
    //   346: aload_0
    //   347: getfield k : Lcom/google/android/gms/internal/ads/ej2;
    //   350: invokevirtual a : ()Z
    //   353: ifeq -> 442
    //   356: aload_0
    //   357: getfield k : Lcom/google/android/gms/internal/ads/ej2;
    //   360: invokevirtual i : ()V
    //   363: lload #5
    //   365: lstore #12
    //   367: goto -> 442
    //   370: aload_0
    //   371: getfield v : Z
    //   374: ifeq -> 389
    //   377: lload #5
    //   379: lstore #12
    //   381: iload #8
    //   383: ifeq -> 442
    //   386: goto -> 400
    //   389: lload #5
    //   391: lstore #12
    //   393: lload #5
    //   395: lconst_0
    //   396: lcmp
    //   397: ifeq -> 442
    //   400: aload_0
    //   401: lload #5
    //   403: invokevirtual i : (J)J
    //   406: lstore #5
    //   408: iload #7
    //   410: istore #8
    //   412: lload #5
    //   414: lstore #12
    //   416: iload #8
    //   418: aload_3
    //   419: arraylength
    //   420: if_icmpge -> 442
    //   423: aload_3
    //   424: iload #8
    //   426: aaload
    //   427: ifnull -> 436
    //   430: aload #4
    //   432: iload #8
    //   434: iconst_1
    //   435: bastore
    //   436: iinc #8, 1
    //   439: goto -> 412
    //   442: aload_0
    //   443: iconst_1
    //   444: putfield v : Z
    //   447: lload #12
    //   449: lreturn
  }
  
  public final void q() {
    this.k.h(-2147483648);
  }
  
  public final void r() {
    fh2 fh21 = this.l;
    this.k.f(new ah2(this, fh21));
    this.p.removeCallbacksAndMessages(null);
    this.I = true;
  }
  
  final int t(int paramInt, nc2 paramnc2, ce2 paramce2, boolean paramBoolean) {
    return (this.w || J()) ? -3 : ((th2)this.q.valueAt(paramInt)).f(paramnc2, paramce2, paramBoolean, this.H, this.E);
  }
  
  final boolean w(int paramInt) {
    return (this.H || (!J() && ((th2)this.q.valueAt(paramInt)).o()));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */