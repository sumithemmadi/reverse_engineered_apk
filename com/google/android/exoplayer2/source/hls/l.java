package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.b0;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.e;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.trackselection.f;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.r;
import com.google.android.exoplayer2.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public final class l implements u, n.a, HlsPlaylistTracker.b {
  private final i b;
  
  private final HlsPlaylistTracker c;
  
  private final h d;
  
  private final x e;
  
  private final k<?> f;
  
  private final u g;
  
  private final w.a h;
  
  private final e i;
  
  private final IdentityHashMap<b0, Integer> j;
  
  private final o k;
  
  private final p l;
  
  private final boolean m;
  
  private final int n;
  
  private final boolean o;
  
  private u.a p;
  
  private int q;
  
  private TrackGroupArray r;
  
  private n[] s;
  
  private n[] t;
  
  private int[][] u;
  
  private c0 v;
  
  private boolean w;
  
  public l(i parami, HlsPlaylistTracker paramHlsPlaylistTracker, h paramh, x paramx, k<?> paramk, u paramu, w.a parama, e parame, p paramp, boolean paramBoolean1, int paramInt, boolean paramBoolean2) {
    this.b = parami;
    this.c = paramHlsPlaylistTracker;
    this.d = paramh;
    this.e = paramx;
    this.f = paramk;
    this.g = paramu;
    this.h = parama;
    this.i = parame;
    this.l = paramp;
    this.m = paramBoolean1;
    this.n = paramInt;
    this.o = paramBoolean2;
    this.v = paramp.a(new c0[0]);
    this.j = new IdentityHashMap<b0, Integer>();
    this.k = new o();
    this.s = new n[0];
    this.t = new n[0];
    this.u = new int[0][];
    parama.G();
  }
  
  private void g(long paramLong, List<e.a> paramList, List<n> paramList1, List<int[]> paramList2, Map<String, DrmInitData> paramMap) {
    ArrayList<Uri> arrayList = new ArrayList(paramList.size());
    ArrayList<Format> arrayList1 = new ArrayList(paramList.size());
    ArrayList<Integer> arrayList2 = new ArrayList(paramList.size());
    HashSet<String> hashSet = new HashSet();
    for (byte b1 = 0; b1 < paramList.size(); b1++) {
      String str = ((e.a)paramList.get(b1)).d;
      if (hashSet.add(str)) {
        arrayList.clear();
        arrayList1.clear();
        arrayList2.clear();
        byte b2 = 0;
        int j;
        for (j = 1; b2 < paramList.size(); j = m) {
          int m = j;
          if (h0.b(str, ((e.a)paramList.get(b2)).d)) {
            e.a a1 = paramList.get(b2);
            arrayList2.add(Integer.valueOf(b2));
            arrayList.add(a1.a);
            arrayList1.add(a1.b);
            if (a1.b.g != null) {
              m = 1;
            } else {
              m = 0;
            } 
            m = j & m;
          } 
          b2++;
        } 
        n n1 = j(1, (Uri[])arrayList.<Object>toArray(h0.h((Object[])new Uri[0])), arrayList1.<Format>toArray(new Format[0]), null, Collections.emptyList(), paramMap, paramLong);
        paramList2.add(h0.s0(arrayList2));
        paramList1.add(n1);
        if (this.m && j != 0)
          n1.Y(new TrackGroup[] { new TrackGroup(arrayList1.<Format>toArray(new Format[0])) }, 0, new int[0]); 
      } 
    } 
  }
  
  private void h(e parame, long paramLong, List<n> paramList, List<int[]> paramList1, Map<String, DrmInitData> paramMap) {
    // Byte code:
    //   0: aload_1
    //   1: getfield f : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: istore #7
    //   11: iload #7
    //   13: newarray int
    //   15: astore #8
    //   17: iconst_0
    //   18: istore #9
    //   20: iconst_0
    //   21: istore #10
    //   23: iconst_0
    //   24: istore #11
    //   26: iload #9
    //   28: aload_1
    //   29: getfield f : Ljava/util/List;
    //   32: invokeinterface size : ()I
    //   37: if_icmpge -> 130
    //   40: aload_1
    //   41: getfield f : Ljava/util/List;
    //   44: iload #9
    //   46: invokeinterface get : (I)Ljava/lang/Object;
    //   51: checkcast com/google/android/exoplayer2/source/hls/playlist/e$b
    //   54: getfield b : Lcom/google/android/exoplayer2/Format;
    //   57: astore #12
    //   59: aload #12
    //   61: getfield p : I
    //   64: ifgt -> 115
    //   67: aload #12
    //   69: getfield g : Ljava/lang/String;
    //   72: iconst_2
    //   73: invokestatic y : (Ljava/lang/String;I)Ljava/lang/String;
    //   76: ifnull -> 82
    //   79: goto -> 115
    //   82: aload #12
    //   84: getfield g : Ljava/lang/String;
    //   87: iconst_1
    //   88: invokestatic y : (Ljava/lang/String;I)Ljava/lang/String;
    //   91: ifnull -> 106
    //   94: aload #8
    //   96: iload #9
    //   98: iconst_1
    //   99: iastore
    //   100: iinc #11, 1
    //   103: goto -> 124
    //   106: aload #8
    //   108: iload #9
    //   110: iconst_m1
    //   111: iastore
    //   112: goto -> 124
    //   115: aload #8
    //   117: iload #9
    //   119: iconst_2
    //   120: iastore
    //   121: iinc #10, 1
    //   124: iinc #9, 1
    //   127: goto -> 26
    //   130: iload #10
    //   132: ifle -> 141
    //   135: iconst_1
    //   136: istore #11
    //   138: goto -> 171
    //   141: iload #11
    //   143: iload #7
    //   145: if_icmpge -> 164
    //   148: iload #7
    //   150: iload #11
    //   152: isub
    //   153: istore #10
    //   155: iconst_0
    //   156: istore #11
    //   158: iconst_1
    //   159: istore #9
    //   161: goto -> 174
    //   164: iconst_0
    //   165: istore #11
    //   167: iload #7
    //   169: istore #10
    //   171: iconst_0
    //   172: istore #9
    //   174: iload #10
    //   176: anewarray android/net/Uri
    //   179: astore #13
    //   181: iload #10
    //   183: anewarray com/google/android/exoplayer2/Format
    //   186: astore #12
    //   188: iload #10
    //   190: newarray int
    //   192: astore #14
    //   194: iconst_0
    //   195: istore #7
    //   197: iconst_0
    //   198: istore #15
    //   200: iload #7
    //   202: aload_1
    //   203: getfield f : Ljava/util/List;
    //   206: invokeinterface size : ()I
    //   211: if_icmpge -> 309
    //   214: iload #11
    //   216: ifeq -> 232
    //   219: iload #15
    //   221: istore #16
    //   223: aload #8
    //   225: iload #7
    //   227: iaload
    //   228: iconst_2
    //   229: if_icmpne -> 299
    //   232: iload #9
    //   234: ifeq -> 250
    //   237: iload #15
    //   239: istore #16
    //   241: aload #8
    //   243: iload #7
    //   245: iaload
    //   246: iconst_1
    //   247: if_icmpeq -> 299
    //   250: aload_1
    //   251: getfield f : Ljava/util/List;
    //   254: iload #7
    //   256: invokeinterface get : (I)Ljava/lang/Object;
    //   261: checkcast com/google/android/exoplayer2/source/hls/playlist/e$b
    //   264: astore #17
    //   266: aload #13
    //   268: iload #15
    //   270: aload #17
    //   272: getfield a : Landroid/net/Uri;
    //   275: aastore
    //   276: aload #12
    //   278: iload #15
    //   280: aload #17
    //   282: getfield b : Lcom/google/android/exoplayer2/Format;
    //   285: aastore
    //   286: aload #14
    //   288: iload #15
    //   290: iload #7
    //   292: iastore
    //   293: iload #15
    //   295: iconst_1
    //   296: iadd
    //   297: istore #16
    //   299: iinc #7, 1
    //   302: iload #16
    //   304: istore #15
    //   306: goto -> 200
    //   309: aload #12
    //   311: iconst_0
    //   312: aaload
    //   313: getfield g : Ljava/lang/String;
    //   316: astore #8
    //   318: aload_0
    //   319: iconst_0
    //   320: aload #13
    //   322: aload #12
    //   324: aload_1
    //   325: getfield k : Lcom/google/android/exoplayer2/Format;
    //   328: aload_1
    //   329: getfield l : Ljava/util/List;
    //   332: aload #6
    //   334: lload_2
    //   335: invokespecial j : (I[Landroid/net/Uri;[Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;Ljava/util/List;Ljava/util/Map;J)Lcom/google/android/exoplayer2/source/hls/n;
    //   338: astore #6
    //   340: aload #4
    //   342: aload #6
    //   344: invokeinterface add : (Ljava/lang/Object;)Z
    //   349: pop
    //   350: aload #5
    //   352: aload #14
    //   354: invokeinterface add : (Ljava/lang/Object;)Z
    //   359: pop
    //   360: aload_0
    //   361: getfield m : Z
    //   364: ifeq -> 764
    //   367: aload #8
    //   369: ifnull -> 764
    //   372: aload #8
    //   374: iconst_2
    //   375: invokestatic y : (Ljava/lang/String;I)Ljava/lang/String;
    //   378: ifnull -> 387
    //   381: iconst_1
    //   382: istore #9
    //   384: goto -> 390
    //   387: iconst_0
    //   388: istore #9
    //   390: aload #8
    //   392: iconst_1
    //   393: invokestatic y : (Ljava/lang/String;I)Ljava/lang/String;
    //   396: ifnull -> 405
    //   399: iconst_1
    //   400: istore #11
    //   402: goto -> 408
    //   405: iconst_0
    //   406: istore #11
    //   408: new java/util/ArrayList
    //   411: dup
    //   412: invokespecial <init> : ()V
    //   415: astore #4
    //   417: iload #9
    //   419: ifeq -> 595
    //   422: iload #10
    //   424: anewarray com/google/android/exoplayer2/Format
    //   427: astore #5
    //   429: iconst_0
    //   430: istore #9
    //   432: iload #9
    //   434: iload #10
    //   436: if_icmpge -> 458
    //   439: aload #5
    //   441: iload #9
    //   443: aload #12
    //   445: iload #9
    //   447: aaload
    //   448: invokestatic m : (Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/Format;
    //   451: aastore
    //   452: iinc #9, 1
    //   455: goto -> 432
    //   458: aload #4
    //   460: new com/google/android/exoplayer2/source/TrackGroup
    //   463: dup
    //   464: aload #5
    //   466: invokespecial <init> : ([Lcom/google/android/exoplayer2/Format;)V
    //   469: invokeinterface add : (Ljava/lang/Object;)Z
    //   474: pop
    //   475: iload #11
    //   477: ifeq -> 533
    //   480: aload_1
    //   481: getfield k : Lcom/google/android/exoplayer2/Format;
    //   484: ifnonnull -> 499
    //   487: aload_1
    //   488: getfield h : Ljava/util/List;
    //   491: invokeinterface isEmpty : ()Z
    //   496: ifeq -> 533
    //   499: aload #4
    //   501: new com/google/android/exoplayer2/source/TrackGroup
    //   504: dup
    //   505: iconst_1
    //   506: anewarray com/google/android/exoplayer2/Format
    //   509: dup
    //   510: iconst_0
    //   511: aload #12
    //   513: iconst_0
    //   514: aaload
    //   515: aload_1
    //   516: getfield k : Lcom/google/android/exoplayer2/Format;
    //   519: iconst_0
    //   520: invokestatic k : (Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;Z)Lcom/google/android/exoplayer2/Format;
    //   523: aastore
    //   524: invokespecial <init> : ([Lcom/google/android/exoplayer2/Format;)V
    //   527: invokeinterface add : (Ljava/lang/Object;)Z
    //   532: pop
    //   533: aload_1
    //   534: getfield l : Ljava/util/List;
    //   537: astore_1
    //   538: aload_1
    //   539: ifnull -> 658
    //   542: iconst_0
    //   543: istore #10
    //   545: iload #10
    //   547: aload_1
    //   548: invokeinterface size : ()I
    //   553: if_icmpge -> 658
    //   556: aload #4
    //   558: new com/google/android/exoplayer2/source/TrackGroup
    //   561: dup
    //   562: iconst_1
    //   563: anewarray com/google/android/exoplayer2/Format
    //   566: dup
    //   567: iconst_0
    //   568: aload_1
    //   569: iload #10
    //   571: invokeinterface get : (I)Ljava/lang/Object;
    //   576: checkcast com/google/android/exoplayer2/Format
    //   579: aastore
    //   580: invokespecial <init> : ([Lcom/google/android/exoplayer2/Format;)V
    //   583: invokeinterface add : (Ljava/lang/Object;)Z
    //   588: pop
    //   589: iinc #10, 1
    //   592: goto -> 545
    //   595: iload #11
    //   597: ifeq -> 729
    //   600: iload #10
    //   602: anewarray com/google/android/exoplayer2/Format
    //   605: astore #5
    //   607: iconst_0
    //   608: istore #11
    //   610: iload #11
    //   612: iload #10
    //   614: if_icmpge -> 641
    //   617: aload #5
    //   619: iload #11
    //   621: aload #12
    //   623: iload #11
    //   625: aaload
    //   626: aload_1
    //   627: getfield k : Lcom/google/android/exoplayer2/Format;
    //   630: iconst_1
    //   631: invokestatic k : (Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/Format;Z)Lcom/google/android/exoplayer2/Format;
    //   634: aastore
    //   635: iinc #11, 1
    //   638: goto -> 610
    //   641: aload #4
    //   643: new com/google/android/exoplayer2/source/TrackGroup
    //   646: dup
    //   647: aload #5
    //   649: invokespecial <init> : ([Lcom/google/android/exoplayer2/Format;)V
    //   652: invokeinterface add : (Ljava/lang/Object;)Z
    //   657: pop
    //   658: new com/google/android/exoplayer2/source/TrackGroup
    //   661: dup
    //   662: iconst_1
    //   663: anewarray com/google/android/exoplayer2/Format
    //   666: dup
    //   667: iconst_0
    //   668: ldc 'ID3'
    //   670: ldc 'application/id3'
    //   672: aconst_null
    //   673: iconst_m1
    //   674: aconst_null
    //   675: invokestatic u : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;
    //   678: aastore
    //   679: invokespecial <init> : ([Lcom/google/android/exoplayer2/Format;)V
    //   682: astore_1
    //   683: aload #4
    //   685: aload_1
    //   686: invokeinterface add : (Ljava/lang/Object;)Z
    //   691: pop
    //   692: aload #6
    //   694: aload #4
    //   696: iconst_0
    //   697: anewarray com/google/android/exoplayer2/source/TrackGroup
    //   700: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   705: checkcast [Lcom/google/android/exoplayer2/source/TrackGroup;
    //   708: iconst_0
    //   709: iconst_1
    //   710: newarray int
    //   712: dup
    //   713: iconst_0
    //   714: aload #4
    //   716: aload_1
    //   717: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   722: iastore
    //   723: invokevirtual Y : ([Lcom/google/android/exoplayer2/source/TrackGroup;I[I)V
    //   726: goto -> 764
    //   729: new java/lang/StringBuilder
    //   732: dup
    //   733: invokespecial <init> : ()V
    //   736: astore_1
    //   737: aload_1
    //   738: ldc_w 'Unexpected codecs attribute: '
    //   741: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   744: pop
    //   745: aload_1
    //   746: aload #8
    //   748: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   751: pop
    //   752: new java/lang/IllegalArgumentException
    //   755: dup
    //   756: aload_1
    //   757: invokevirtual toString : ()Ljava/lang/String;
    //   760: invokespecial <init> : (Ljava/lang/String;)V
    //   763: athrow
    //   764: return
  }
  
  private void i(long paramLong) {
    Map<?, ?> map;
    e e1 = (e)e.e(this.c.h());
    if (this.o) {
      map = l(e1.n);
    } else {
      map = Collections.emptyMap();
    } 
    boolean bool = e1.f.isEmpty();
    List<e.a> list1 = e1.h;
    List<e.a> list2 = e1.i;
    boolean bool1 = false;
    this.q = 0;
    ArrayList<n> arrayList = new ArrayList();
    ArrayList<int[]> arrayList1 = new ArrayList();
    if ((bool ^ true) != 0)
      h(e1, paramLong, arrayList, (List<int[]>)arrayList1, (Map)map); 
    g(paramLong, list1, arrayList, (List<int[]>)arrayList1, (Map)map);
    byte b1;
    for (b1 = 0; b1 < list2.size(); b1++) {
      e.a a1 = list2.get(b1);
      Uri uri = a1.a;
      Format format = a1.b;
      list1 = Collections.emptyList();
      n n1 = j(3, new Uri[] { uri }, new Format[] { format }, null, (List)list1, (Map)map, paramLong);
      arrayList1.add(new int[] { b1 });
      arrayList.add(n1);
      n1.Y(new TrackGroup[] { new TrackGroup(new Format[] { a1.b }, ) }, 0, new int[0]);
    } 
    this.s = arrayList.<n>toArray(new n[0]);
    this.u = arrayList1.<int[]>toArray(new int[0][]);
    n[] arrayOfN = this.s;
    this.q = arrayOfN.length;
    arrayOfN[0].h0(true);
    arrayOfN = this.s;
    int j = arrayOfN.length;
    for (b1 = bool1; b1 < j; b1++)
      arrayOfN[b1].k(); 
    this.t = this.s;
  }
  
  private n j(int paramInt, Uri[] paramArrayOfUri, Format[] paramArrayOfFormat, Format paramFormat, List<Format> paramList, Map<String, DrmInitData> paramMap, long paramLong) {
    return new n(paramInt, this, new g(this.b, this.c, paramArrayOfUri, paramArrayOfFormat, this.d, this.e, this.k, paramList), paramMap, this.i, paramLong, paramFormat, this.f, this.g, this.h, this.n);
  }
  
  private static Format k(Format paramFormat1, Format paramFormat2, boolean paramBoolean) {
    String str1;
    Metadata metadata;
    byte b1;
    boolean bool1;
    boolean bool2;
    Format format;
    byte b2;
    if (paramFormat2 != null) {
      str1 = paramFormat2.g;
      metadata = paramFormat2.h;
      b1 = paramFormat2.w;
      bool1 = paramFormat2.d;
      bool2 = paramFormat2.e;
      String str4 = paramFormat2.B;
      String str3 = paramFormat2.c;
    } else {
      str1 = h0.y(paramFormat1.g, 1);
      metadata = paramFormat1.h;
      if (paramBoolean) {
        b1 = paramFormat1.w;
        bool1 = paramFormat1.d;
        bool2 = paramFormat1.e;
        String str4 = paramFormat1.B;
        String str3 = paramFormat1.c;
      } else {
        paramFormat2 = null;
        format = paramFormat2;
        b1 = -1;
        bool1 = false;
        bool2 = false;
      } 
    } 
    String str2 = r.e(str1);
    if (paramBoolean) {
      b2 = paramFormat1.f;
    } else {
      b2 = -1;
    } 
    return Format.m(paramFormat1.b, (String)paramFormat2, paramFormat1.i, str2, str1, metadata, b2, b1, -1, null, bool1, bool2, (String)format);
  }
  
  private static Map<String, DrmInitData> l(List<DrmInitData> paramList) {
    ArrayList<DrmInitData> arrayList = new ArrayList<DrmInitData>(paramList);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    byte b1 = 0;
    while (b1 < arrayList.size()) {
      DrmInitData drmInitData = paramList.get(b1);
      String str = drmInitData.d;
      for (byte b2 = ++b1; b2 < arrayList.size(); b2++) {
        DrmInitData drmInitData1 = arrayList.get(b2);
        if (TextUtils.equals(drmInitData1.d, str)) {
          drmInitData = drmInitData.f(drmInitData1);
          arrayList.remove(b2);
          continue;
        } 
      } 
      hashMap.put(str, drmInitData);
    } 
    return (Map)hashMap;
  }
  
  private static Format m(Format paramFormat) {
    String str1 = h0.y(paramFormat.g, 2);
    String str2 = r.e(str1);
    return Format.C(paramFormat.b, paramFormat.c, paramFormat.i, str2, str1, paramFormat.h, paramFormat.f, paramFormat.o, paramFormat.p, paramFormat.q, null, paramFormat.d, paramFormat.e);
  }
  
  public long A() {
    if (!this.w) {
      this.h.J();
      this.w = true;
    } 
    return -9223372036854775807L;
  }
  
  public void B(u.a parama, long paramLong) {
    this.p = parama;
    this.c.l(this);
    i(paramLong);
  }
  
  public TrackGroupArray C() {
    return (TrackGroupArray)e.e(this.r);
  }
  
  public void D(long paramLong, boolean paramBoolean) {
    n[] arrayOfN = this.t;
    int j = arrayOfN.length;
    for (byte b1 = 0; b1 < j; b1++)
      arrayOfN[b1].D(paramLong, paramBoolean); 
  }
  
  public void a() {
    int j = this.q - 1;
    this.q = j;
    if (j > 0)
      return; 
    n[] arrayOfN = this.s;
    int m = arrayOfN.length;
    j = 0;
    int i1 = 0;
    while (j < m) {
      i1 += (arrayOfN[j].C()).c;
      j++;
    } 
    TrackGroup[] arrayOfTrackGroup = new TrackGroup[i1];
    arrayOfN = this.s;
    int i2 = arrayOfN.length;
    j = 0;
    i1 = 0;
    while (j < i2) {
      n n1 = arrayOfN[j];
      int i3 = (n1.C()).c;
      m = 0;
      while (m < i3) {
        arrayOfTrackGroup[i1] = n1.C().a(m);
        m++;
        i1++;
      } 
      j++;
    } 
    this.r = new TrackGroupArray(arrayOfTrackGroup);
    this.p.f(this);
  }
  
  public void b() {
    this.p.d((c0)this);
  }
  
  public boolean c(Uri paramUri, long paramLong) {
    n[] arrayOfN = this.s;
    int j = arrayOfN.length;
    boolean bool = true;
    for (byte b1 = 0; b1 < j; b1++)
      bool &= arrayOfN[b1].W(paramUri, paramLong); 
    this.p.d((c0)this);
    return bool;
  }
  
  public void e(Uri paramUri) {
    this.c.k(paramUri);
  }
  
  public void n(n paramn) {
    this.p.d((c0)this);
  }
  
  public void o() {
    this.c.b(this);
    n[] arrayOfN = this.s;
    int j = arrayOfN.length;
    for (byte b1 = 0; b1 < j; b1++)
      arrayOfN[b1].a0(); 
    this.p = null;
    this.h.H();
  }
  
  public boolean r() {
    return this.v.r();
  }
  
  public long s() {
    return this.v.s();
  }
  
  public boolean t(long paramLong) {
    if (this.r == null) {
      n[] arrayOfN = this.s;
      int j = arrayOfN.length;
      for (byte b1 = 0; b1 < j; b1++)
        arrayOfN[b1].k(); 
      return false;
    } 
    return this.v.t(paramLong);
  }
  
  public long u() {
    return this.v.u();
  }
  
  public void v(long paramLong) {
    this.v.v(paramLong);
  }
  
  public long w(f[] paramArrayOff, boolean[] paramArrayOfboolean1, b0[] paramArrayOfb0, boolean[] paramArrayOfboolean2, long paramLong) {
    b0[] arrayOfB01 = paramArrayOfb0;
    int[] arrayOfInt1 = new int[paramArrayOff.length];
    int[] arrayOfInt2 = new int[paramArrayOff.length];
    byte b1;
    for (b1 = 0; b1 < paramArrayOff.length; b1++) {
      int m;
      if (arrayOfB01[b1] == null) {
        m = -1;
      } else {
        m = ((Integer)this.j.get(arrayOfB01[b1])).intValue();
      } 
      arrayOfInt1[b1] = m;
      arrayOfInt2[b1] = -1;
      if (paramArrayOff[b1] != null) {
        TrackGroup trackGroup = paramArrayOff[b1].a();
        m = 0;
        while (true) {
          n[] arrayOfN1 = this.s;
          if (m < arrayOfN1.length) {
            if (arrayOfN1[m].C().b(trackGroup) != -1) {
              arrayOfInt2[b1] = m;
              break;
            } 
            m++;
            continue;
          } 
          break;
        } 
      } 
    } 
    this.j.clear();
    int j = paramArrayOff.length;
    b0[] arrayOfB02 = new b0[j];
    b0[] arrayOfB03 = new b0[paramArrayOff.length];
    f[] arrayOfF = new f[paramArrayOff.length];
    n[] arrayOfN = new n[this.s.length];
    b1 = 0;
    byte b2 = 0;
    boolean bool = false;
    while (true) {
      b0[] arrayOfB0 = paramArrayOfb0;
      if (b2 < this.s.length) {
        byte b3;
        for (b3 = 0; b3 < paramArrayOff.length; b3++) {
          f f1;
          int m = arrayOfInt1[b3];
          b0 b02 = null;
          if (m == b2) {
            b01 = arrayOfB0[b3];
          } else {
            b01 = null;
          } 
          arrayOfB03[b3] = b01;
          b0 b01 = b02;
          if (arrayOfInt2[b3] == b2)
            f1 = paramArrayOff[b3]; 
          arrayOfF[b3] = f1;
        } 
        n n1 = this.s[b2];
        boolean bool2 = n1.e0(arrayOfF, paramArrayOfboolean1, arrayOfB03, paramArrayOfboolean2, paramLong, bool);
        b3 = 0;
        boolean bool1 = false;
        while (true) {
          int m = paramArrayOff.length;
          boolean bool3 = true;
          b2++;
        } 
        continue;
      } 
      System.arraycopy(arrayOfB02, 0, arrayOfB0, 0, j);
      n[] arrayOfN1 = (n[])h0.f0((Object[])arrayOfN, b1);
      this.t = arrayOfN1;
      this.v = this.l.a((c0[])arrayOfN1);
      return paramLong;
    } 
  }
  
  public void x() {
    n[] arrayOfN = this.s;
    int j = arrayOfN.length;
    for (byte b1 = 0; b1 < j; b1++)
      arrayOfN[b1].x(); 
  }
  
  public long y(long paramLong) {
    n[] arrayOfN = this.t;
    if (arrayOfN.length > 0) {
      boolean bool = arrayOfN[0].d0(paramLong, false);
      byte b1 = 1;
      while (true) {
        arrayOfN = this.t;
        if (b1 < arrayOfN.length) {
          arrayOfN[b1].d0(paramLong, bool);
          b1++;
          continue;
        } 
        if (bool)
          this.k.b(); 
        break;
      } 
    } 
    return paramLong;
  }
  
  public long z(long paramLong, w0 paramw0) {
    return paramLong;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */