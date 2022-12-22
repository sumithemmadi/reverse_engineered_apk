package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.e0.e;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.source.hls.playlist.g;
import com.google.android.exoplayer2.trackselection.f;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.g0;
import com.google.android.exoplayer2.util.h0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class g {
  private final i a;
  
  private final j b;
  
  private final j c;
  
  private final o d;
  
  private final Uri[] e;
  
  private final Format[] f;
  
  private final HlsPlaylistTracker g;
  
  private final TrackGroup h;
  
  private final List<Format> i;
  
  private final FullSegmentEncryptionKeyCache j;
  
  private boolean k;
  
  private byte[] l;
  
  private IOException m;
  
  private Uri n;
  
  private boolean o;
  
  private f p;
  
  private long q;
  
  private boolean r;
  
  public g(i parami, HlsPlaylistTracker paramHlsPlaylistTracker, Uri[] paramArrayOfUri, Format[] paramArrayOfFormat, h paramh, x paramx, o paramo, List<Format> paramList) {
    this.a = parami;
    this.g = paramHlsPlaylistTracker;
    this.e = paramArrayOfUri;
    this.f = paramArrayOfFormat;
    this.d = paramo;
    this.i = paramList;
    this.j = new FullSegmentEncryptionKeyCache(4);
    this.l = h0.f;
    this.q = -9223372036854775807L;
    j j1 = paramh.a(1);
    this.b = j1;
    if (paramx != null)
      j1.f0(paramx); 
    this.c = paramh.a(3);
    this.h = new TrackGroup(paramArrayOfFormat);
    int[] arrayOfInt = new int[paramArrayOfUri.length];
    for (byte b = 0; b < paramArrayOfUri.length; b++)
      arrayOfInt[b] = b; 
    this.p = (f)new d(this.h, arrayOfInt);
  }
  
  private long b(k paramk, boolean paramBoolean, f paramf, long paramLong1, long paramLong2) {
    if (paramk == null || paramBoolean) {
      long l1 = paramf.p;
      long l2 = paramLong2;
      if (paramk != null)
        if (this.o) {
          l2 = paramLong2;
        } else {
          l2 = ((com.google.android.exoplayer2.source.e0.b)paramk).f;
        }  
      if (!paramf.l && l2 >= l1 + paramLong1) {
        paramLong1 = paramf.i;
        paramLong2 = paramf.o.size();
        return paramLong1 + paramLong2;
      } 
      List list = paramf.o;
      if (!this.g.g() || paramk == null) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      } 
      paramLong1 = h0.e(list, Long.valueOf(l2 - paramLong1), true, paramBoolean);
      paramLong2 = paramf.i;
      return paramLong1 + paramLong2;
    } 
    return paramk.g();
  }
  
  private static Uri c(f paramf, f.a parama) {
    if (parama != null) {
      String str = parama.i;
      if (str != null)
        return g0.d(((g)paramf).a, str); 
    } 
    return null;
  }
  
  private com.google.android.exoplayer2.source.e0.b h(Uri paramUri, int paramInt) {
    if (paramUri == null)
      return null; 
    byte[] arrayOfByte = this.j.c(paramUri);
    if (arrayOfByte != null) {
      this.j.b(paramUri, arrayOfByte);
      return null;
    } 
    l l = new l(paramUri, 0L, -1L, null, 1);
    return (com.google.android.exoplayer2.source.e0.b)new a(this.c, l, this.f[paramInt], this.p.j(), this.p.l(), this.l);
  }
  
  private long m(long paramLong) {
    boolean bool;
    long l1 = this.q;
    long l2 = -9223372036854775807L;
    if (l1 != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      l2 = l1 - paramLong; 
    return l2;
  }
  
  private void p(f paramf) {
    long l;
    if (paramf.l) {
      l = -9223372036854775807L;
    } else {
      l = paramf.e() - this.g.f();
    } 
    this.q = l;
  }
  
  public e[] a(k paramk, long paramLong) {
    int m;
    if (paramk == null) {
      m = -1;
    } else {
      m = this.h.b(((com.google.android.exoplayer2.source.e0.b)paramk).c);
    } 
    int n = this.p.length();
    e[] arrayOfE = new e[n];
    for (byte b = 0; b < n; b++) {
      int i1 = this.p.f(b);
      Uri uri = this.e[i1];
      if (!this.g.a(uri)) {
        arrayOfE[b] = e.a;
      } else {
        boolean bool;
        f f1 = this.g.m(uri, false);
        e.e(f1);
        long l1 = f1.f - this.g.f();
        if (i1 != m) {
          bool = true;
        } else {
          bool = false;
        } 
        long l2 = b(paramk, bool, f1, l1, paramLong);
        long l3 = f1.i;
        if (l2 < l3) {
          arrayOfE[b] = e.a;
        } else {
          arrayOfE[b] = (e)new c(f1, l1, (int)(l2 - l3));
        } 
      } 
    } 
    return arrayOfE;
  }
  
  public void d(long paramLong1, long paramLong2, List<k> paramList, boolean paramBoolean, b paramb) {
    // Byte code:
    //   0: aload #5
    //   2: invokeinterface isEmpty : ()Z
    //   7: ifeq -> 16
    //   10: aconst_null
    //   11: astore #8
    //   13: goto -> 37
    //   16: aload #5
    //   18: aload #5
    //   20: invokeinterface size : ()I
    //   25: iconst_1
    //   26: isub
    //   27: invokeinterface get : (I)Ljava/lang/Object;
    //   32: checkcast com/google/android/exoplayer2/source/hls/k
    //   35: astore #8
    //   37: aload #8
    //   39: ifnonnull -> 48
    //   42: iconst_m1
    //   43: istore #9
    //   45: goto -> 62
    //   48: aload_0
    //   49: getfield h : Lcom/google/android/exoplayer2/source/TrackGroup;
    //   52: aload #8
    //   54: getfield c : Lcom/google/android/exoplayer2/Format;
    //   57: invokevirtual b : (Lcom/google/android/exoplayer2/Format;)I
    //   60: istore #9
    //   62: lload_3
    //   63: lload_1
    //   64: lsub
    //   65: lstore #10
    //   67: aload_0
    //   68: lload_1
    //   69: invokespecial m : (J)J
    //   72: lstore #12
    //   74: lload #10
    //   76: lstore #14
    //   78: aload #8
    //   80: ifnull -> 143
    //   83: lload #10
    //   85: lstore #14
    //   87: aload_0
    //   88: getfield o : Z
    //   91: ifne -> 143
    //   94: aload #8
    //   96: invokevirtual d : ()J
    //   99: lstore #16
    //   101: lconst_0
    //   102: lload #10
    //   104: lload #16
    //   106: lsub
    //   107: invokestatic max : (JJ)J
    //   110: lstore #10
    //   112: lload #10
    //   114: lstore #14
    //   116: lload #12
    //   118: ldc2_w -9223372036854775807
    //   121: lcmp
    //   122: ifeq -> 143
    //   125: lconst_0
    //   126: lload #12
    //   128: lload #16
    //   130: lsub
    //   131: invokestatic max : (JJ)J
    //   134: lstore #14
    //   136: lload #14
    //   138: lstore #12
    //   140: goto -> 147
    //   143: lload #14
    //   145: lstore #10
    //   147: aload_0
    //   148: aload #8
    //   150: lload_3
    //   151: invokevirtual a : (Lcom/google/android/exoplayer2/source/hls/k;J)[Lcom/google/android/exoplayer2/source/e0/e;
    //   154: astore #18
    //   156: aload_0
    //   157: getfield p : Lcom/google/android/exoplayer2/trackselection/f;
    //   160: lload_1
    //   161: lload #10
    //   163: lload #12
    //   165: aload #5
    //   167: aload #18
    //   169: invokeinterface g : (JJJLjava/util/List;[Lcom/google/android/exoplayer2/source/e0/e;)V
    //   174: aload_0
    //   175: getfield p : Lcom/google/android/exoplayer2/trackselection/f;
    //   178: invokeinterface h : ()I
    //   183: istore #19
    //   185: iload #9
    //   187: iload #19
    //   189: if_icmpeq -> 198
    //   192: iconst_1
    //   193: istore #20
    //   195: goto -> 201
    //   198: iconst_0
    //   199: istore #20
    //   201: aload_0
    //   202: getfield e : [Landroid/net/Uri;
    //   205: iload #19
    //   207: aaload
    //   208: astore #18
    //   210: aload_0
    //   211: getfield g : Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistTracker;
    //   214: aload #18
    //   216: invokeinterface a : (Landroid/net/Uri;)Z
    //   221: ifne -> 256
    //   224: aload #7
    //   226: aload #18
    //   228: putfield c : Landroid/net/Uri;
    //   231: aload_0
    //   232: aload_0
    //   233: getfield r : Z
    //   236: aload #18
    //   238: aload_0
    //   239: getfield n : Landroid/net/Uri;
    //   242: invokevirtual equals : (Ljava/lang/Object;)Z
    //   245: iand
    //   246: putfield r : Z
    //   249: aload_0
    //   250: aload #18
    //   252: putfield n : Landroid/net/Uri;
    //   255: return
    //   256: aload_0
    //   257: getfield g : Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistTracker;
    //   260: aload #18
    //   262: iconst_1
    //   263: invokeinterface m : (Landroid/net/Uri;Z)Lcom/google/android/exoplayer2/source/hls/playlist/f;
    //   268: astore #5
    //   270: aload #5
    //   272: invokestatic e : (Ljava/lang/Object;)Ljava/lang/Object;
    //   275: pop
    //   276: aload_0
    //   277: aload #5
    //   279: getfield c : Z
    //   282: putfield o : Z
    //   285: aload_0
    //   286: aload #5
    //   288: invokespecial p : (Lcom/google/android/exoplayer2/source/hls/playlist/f;)V
    //   291: aload #5
    //   293: getfield f : J
    //   296: aload_0
    //   297: getfield g : Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistTracker;
    //   300: invokeinterface f : ()J
    //   305: lsub
    //   306: lstore_1
    //   307: aload_0
    //   308: aload #8
    //   310: iload #20
    //   312: aload #5
    //   314: lload_1
    //   315: lload_3
    //   316: invokespecial b : (Lcom/google/android/exoplayer2/source/hls/k;ZLcom/google/android/exoplayer2/source/hls/playlist/f;JJ)J
    //   319: lstore_3
    //   320: lload_3
    //   321: aload #5
    //   323: getfield i : J
    //   326: lcmp
    //   327: ifge -> 400
    //   330: aload #8
    //   332: ifnull -> 400
    //   335: iload #20
    //   337: ifeq -> 400
    //   340: aload_0
    //   341: getfield e : [Landroid/net/Uri;
    //   344: iload #9
    //   346: aaload
    //   347: astore #18
    //   349: aload_0
    //   350: getfield g : Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistTracker;
    //   353: aload #18
    //   355: iconst_1
    //   356: invokeinterface m : (Landroid/net/Uri;Z)Lcom/google/android/exoplayer2/source/hls/playlist/f;
    //   361: astore #5
    //   363: aload #5
    //   365: invokestatic e : (Ljava/lang/Object;)Ljava/lang/Object;
    //   368: pop
    //   369: aload #5
    //   371: getfield f : J
    //   374: lstore #14
    //   376: aload_0
    //   377: getfield g : Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistTracker;
    //   380: invokeinterface f : ()J
    //   385: lstore_1
    //   386: aload #8
    //   388: invokevirtual g : ()J
    //   391: lstore_3
    //   392: lload #14
    //   394: lload_1
    //   395: lsub
    //   396: lstore_1
    //   397: goto -> 404
    //   400: iload #19
    //   402: istore #9
    //   404: aload #5
    //   406: getfield i : J
    //   409: lstore #14
    //   411: lload_3
    //   412: lload #14
    //   414: lcmp
    //   415: ifge -> 430
    //   418: aload_0
    //   419: new com/google/android/exoplayer2/source/BehindLiveWindowException
    //   422: dup
    //   423: invokespecial <init> : ()V
    //   426: putfield m : Ljava/io/IOException;
    //   429: return
    //   430: lload_3
    //   431: lload #14
    //   433: lsub
    //   434: l2i
    //   435: istore #19
    //   437: aload #5
    //   439: getfield o : Ljava/util/List;
    //   442: invokeinterface size : ()I
    //   447: istore #21
    //   449: iload #19
    //   451: iload #21
    //   453: if_icmplt -> 525
    //   456: aload #5
    //   458: getfield l : Z
    //   461: ifeq -> 493
    //   464: iload #6
    //   466: ifne -> 486
    //   469: iload #21
    //   471: ifne -> 477
    //   474: goto -> 486
    //   477: iload #21
    //   479: iconst_1
    //   480: isub
    //   481: istore #19
    //   483: goto -> 525
    //   486: aload #7
    //   488: iconst_1
    //   489: putfield b : Z
    //   492: return
    //   493: aload #7
    //   495: aload #18
    //   497: putfield c : Landroid/net/Uri;
    //   500: aload_0
    //   501: aload_0
    //   502: getfield r : Z
    //   505: aload #18
    //   507: aload_0
    //   508: getfield n : Landroid/net/Uri;
    //   511: invokevirtual equals : (Ljava/lang/Object;)Z
    //   514: iand
    //   515: putfield r : Z
    //   518: aload_0
    //   519: aload #18
    //   521: putfield n : Landroid/net/Uri;
    //   524: return
    //   525: aload_0
    //   526: iconst_0
    //   527: putfield r : Z
    //   530: aload_0
    //   531: aconst_null
    //   532: putfield n : Landroid/net/Uri;
    //   535: aload #5
    //   537: getfield o : Ljava/util/List;
    //   540: iload #19
    //   542: invokeinterface get : (I)Ljava/lang/Object;
    //   547: checkcast com/google/android/exoplayer2/source/hls/playlist/f$a
    //   550: astore #22
    //   552: aload #5
    //   554: aload #22
    //   556: getfield c : Lcom/google/android/exoplayer2/source/hls/playlist/f$a;
    //   559: invokestatic c : (Lcom/google/android/exoplayer2/source/hls/playlist/f;Lcom/google/android/exoplayer2/source/hls/playlist/f$a;)Landroid/net/Uri;
    //   562: astore #23
    //   564: aload_0
    //   565: aload #23
    //   567: iload #9
    //   569: invokespecial h : (Landroid/net/Uri;I)Lcom/google/android/exoplayer2/source/e0/b;
    //   572: astore #24
    //   574: aload #7
    //   576: aload #24
    //   578: putfield a : Lcom/google/android/exoplayer2/source/e0/b;
    //   581: aload #24
    //   583: ifnull -> 587
    //   586: return
    //   587: aload #5
    //   589: aload #22
    //   591: invokestatic c : (Lcom/google/android/exoplayer2/source/hls/playlist/f;Lcom/google/android/exoplayer2/source/hls/playlist/f$a;)Landroid/net/Uri;
    //   594: astore #22
    //   596: aload_0
    //   597: aload #22
    //   599: iload #9
    //   601: invokespecial h : (Landroid/net/Uri;I)Lcom/google/android/exoplayer2/source/e0/b;
    //   604: astore #24
    //   606: aload #7
    //   608: aload #24
    //   610: putfield a : Lcom/google/android/exoplayer2/source/e0/b;
    //   613: aload #24
    //   615: ifnull -> 619
    //   618: return
    //   619: aload #7
    //   621: aload_0
    //   622: getfield a : Lcom/google/android/exoplayer2/source/hls/i;
    //   625: aload_0
    //   626: getfield b : Lcom/google/android/exoplayer2/upstream/j;
    //   629: aload_0
    //   630: getfield f : [Lcom/google/android/exoplayer2/Format;
    //   633: iload #9
    //   635: aaload
    //   636: lload_1
    //   637: aload #5
    //   639: iload #19
    //   641: aload #18
    //   643: aload_0
    //   644: getfield i : Ljava/util/List;
    //   647: aload_0
    //   648: getfield p : Lcom/google/android/exoplayer2/trackselection/f;
    //   651: invokeinterface j : ()I
    //   656: aload_0
    //   657: getfield p : Lcom/google/android/exoplayer2/trackselection/f;
    //   660: invokeinterface l : ()Ljava/lang/Object;
    //   665: aload_0
    //   666: getfield k : Z
    //   669: aload_0
    //   670: getfield d : Lcom/google/android/exoplayer2/source/hls/o;
    //   673: aload #8
    //   675: aload_0
    //   676: getfield j : Lcom/google/android/exoplayer2/source/hls/FullSegmentEncryptionKeyCache;
    //   679: aload #22
    //   681: invokevirtual a : (Landroid/net/Uri;)[B
    //   684: aload_0
    //   685: getfield j : Lcom/google/android/exoplayer2/source/hls/FullSegmentEncryptionKeyCache;
    //   688: aload #23
    //   690: invokevirtual a : (Landroid/net/Uri;)[B
    //   693: invokestatic i : (Lcom/google/android/exoplayer2/source/hls/i;Lcom/google/android/exoplayer2/upstream/j;Lcom/google/android/exoplayer2/Format;JLcom/google/android/exoplayer2/source/hls/playlist/f;ILandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLcom/google/android/exoplayer2/source/hls/o;Lcom/google/android/exoplayer2/source/hls/k;[B[B)Lcom/google/android/exoplayer2/source/hls/k;
    //   696: putfield a : Lcom/google/android/exoplayer2/source/e0/b;
    //   699: return
  }
  
  public TrackGroup e() {
    return this.h;
  }
  
  public f f() {
    return this.p;
  }
  
  public boolean g(com.google.android.exoplayer2.source.e0.b paramb, long paramLong) {
    f f1 = this.p;
    return f1.c(f1.n(this.h.b(paramb.c)), paramLong);
  }
  
  public void i() {
    Uri uri;
    IOException iOException = this.m;
    if (iOException == null) {
      uri = this.n;
      if (uri != null && this.r)
        this.g.d(uri); 
      return;
    } 
    throw uri;
  }
  
  public void j(com.google.android.exoplayer2.source.e0.b paramb) {
    if (paramb instanceof a) {
      a a = (a)paramb;
      this.l = a.h();
      this.j.b(((com.google.android.exoplayer2.source.e0.b)a).a.a, (byte[])e.e(a.j()));
    } 
  }
  
  public boolean k(Uri paramUri, long paramLong) {
    boolean bool = false;
    int k = 0;
    while (true) {
      Uri[] arrayOfUri = this.e;
      if (k < arrayOfUri.length) {
        if (arrayOfUri[k].equals(paramUri))
          break; 
        k++;
        continue;
      } 
      k = -1;
      break;
    } 
    if (k == -1)
      return true; 
    k = this.p.n(k);
    if (k == -1)
      return true; 
    boolean bool1 = this.r;
    this.r = paramUri.equals(this.n) | bool1;
    if (paramLong == -9223372036854775807L || this.p.c(k, paramLong))
      bool = true; 
    return bool;
  }
  
  public void l() {
    this.m = null;
  }
  
  public void n(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public void o(f paramf) {
    this.p = paramf;
  }
  
  private static final class a extends com.google.android.exoplayer2.source.e0.c {
    private byte[] k;
    
    public a(j param1j, l param1l, Format param1Format, int param1Int, Object param1Object, byte[] param1ArrayOfbyte) {
      super(param1j, param1l, 3, param1Format, param1Int, param1Object, param1ArrayOfbyte);
    }
    
    protected void g(byte[] param1ArrayOfbyte, int param1Int) {
      this.k = Arrays.copyOf(param1ArrayOfbyte, param1Int);
    }
    
    public byte[] j() {
      return this.k;
    }
  }
  
  public static final class b {
    public com.google.android.exoplayer2.source.e0.b a;
    
    public boolean b;
    
    public Uri c;
    
    public b() {
      a();
    }
    
    public void a() {
      this.a = null;
      this.b = false;
      this.c = null;
    }
  }
  
  private static final class c extends com.google.android.exoplayer2.source.e0.a {
    private final f e;
    
    private final long f;
    
    public c(f param1f, long param1Long, int param1Int) {
      super(param1Int, (param1f.o.size() - 1));
      this.e = param1f;
      this.f = param1Long;
    }
  }
  
  private static final class d extends com.google.android.exoplayer2.trackselection.b {
    private int g;
    
    public d(TrackGroup param1TrackGroup, int[] param1ArrayOfint) {
      super(param1TrackGroup, param1ArrayOfint);
      this.g = o(param1TrackGroup.a(0));
    }
    
    public int b() {
      return this.g;
    }
    
    public void g(long param1Long1, long param1Long2, long param1Long3, List<? extends com.google.android.exoplayer2.source.e0.d> param1List, e[] param1ArrayOfe) {
      param1Long1 = SystemClock.elapsedRealtime();
      if (!q(this.g, param1Long1))
        return; 
      for (int i = this.b - 1; i >= 0; i--) {
        if (!q(i, param1Long1)) {
          this.g = i;
          return;
        } 
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      throw illegalStateException;
    }
    
    public int j() {
      return 0;
    }
    
    public Object l() {
      return null;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */