package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public final class uf2 implements ne2 {
  private static final oe2 a = new xf2();
  
  private static final int b = wj2.k("seig");
  
  private static final byte[] c = new byte[] { 
      -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 
      108, 66, 124, 100, -115, -12 };
  
  private int A;
  
  private boolean B;
  
  private pe2 C;
  
  private ue2 D;
  
  private ue2[] E;
  
  private boolean F;
  
  private final int d = 0;
  
  private final fg2 e = null;
  
  private final SparseArray<zf2> f = new SparseArray();
  
  private final qj2 g = new qj2(pj2.a);
  
  private final qj2 h = new qj2(5);
  
  private final qj2 i = new qj2();
  
  private final qj2 j = new qj2(1);
  
  private final qj2 k = new qj2(16);
  
  private final byte[] l = new byte[16];
  
  private final Stack<if2> m = new Stack<if2>();
  
  private final LinkedList<wf2> n = new LinkedList<wf2>();
  
  private int o;
  
  private int p;
  
  private long q;
  
  private int r;
  
  private qj2 s;
  
  private long t;
  
  private int u;
  
  private long v = -9223372036854775807L;
  
  private long w = -9223372036854775807L;
  
  private zf2 x;
  
  private int y;
  
  private int z;
  
  public uf2() {
    this(0);
  }
  
  private uf2(int paramInt) {
    this(0, null);
  }
  
  private uf2(int paramInt, uj2 paramuj2) {
    this(0, null, null);
  }
  
  private uf2(int paramInt, uj2 paramuj2, fg2 paramfg2) {
    i();
  }
  
  private static void b(qj2 paramqj2, int paramInt, hg2 paramhg2) {
    paramqj2.l(paramInt + 8);
    paramInt = jf2.b(paramqj2.d());
    if ((paramInt & 0x1) == 0) {
      boolean bool;
      if ((paramInt & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      int i = paramqj2.v();
      if (i == paramhg2.f) {
        Arrays.fill(paramhg2.n, 0, i, bool);
        paramhg2.a(paramqj2.q());
        paramqj2.p(paramhg2.q.a, 0, paramhg2.p);
        paramhg2.q.l(0);
        paramhg2.r = false;
        return;
      } 
      paramInt = paramhg2.f;
      StringBuilder stringBuilder = new StringBuilder(41);
      stringBuilder.append("Length mismatch: ");
      stringBuilder.append(i);
      stringBuilder.append(", ");
      stringBuilder.append(paramInt);
      throw new zzhw(stringBuilder.toString());
    } 
    throw new zzhw("Overriding TrackEncryptionBox parameters is unsupported.");
  }
  
  private static zzjo c(List<lf2> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface size : ()I
    //   6: istore_1
    //   7: aconst_null
    //   8: astore_2
    //   9: iconst_0
    //   10: istore_3
    //   11: iload_3
    //   12: iload_1
    //   13: if_icmpge -> 321
    //   16: aload_0
    //   17: iload_3
    //   18: invokeinterface get : (I)Ljava/lang/Object;
    //   23: checkcast com/google/android/gms/internal/ads/lf2
    //   26: astore #4
    //   28: aload #4
    //   30: getfield P0 : I
    //   33: istore #5
    //   35: getstatic com/google/android/gms/internal/ads/jf2.U : I
    //   38: istore #6
    //   40: aload_2
    //   41: astore #7
    //   43: iload #5
    //   45: iload #6
    //   47: if_icmpne -> 312
    //   50: aload_2
    //   51: astore #7
    //   53: aload_2
    //   54: ifnonnull -> 66
    //   57: new java/util/ArrayList
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: astore #7
    //   66: aload #4
    //   68: getfield Q0 : Lcom/google/android/gms/internal/ads/qj2;
    //   71: getfield a : [B
    //   74: astore #4
    //   76: new com/google/android/gms/internal/ads/qj2
    //   79: dup
    //   80: aload #4
    //   82: invokespecial <init> : ([B)V
    //   85: astore_2
    //   86: aload_2
    //   87: invokevirtual c : ()I
    //   90: bipush #32
    //   92: if_icmpge -> 100
    //   95: aconst_null
    //   96: astore_2
    //   97: goto -> 259
    //   100: aload_2
    //   101: iconst_0
    //   102: invokevirtual l : (I)V
    //   105: aload_2
    //   106: invokevirtual d : ()I
    //   109: aload_2
    //   110: invokevirtual q : ()I
    //   113: iconst_4
    //   114: iadd
    //   115: if_icmpeq -> 121
    //   118: goto -> 95
    //   121: aload_2
    //   122: invokevirtual d : ()I
    //   125: iload #6
    //   127: if_icmpeq -> 133
    //   130: goto -> 95
    //   133: aload_2
    //   134: invokevirtual d : ()I
    //   137: invokestatic a : (I)I
    //   140: istore #5
    //   142: iload #5
    //   144: iconst_1
    //   145: if_icmple -> 185
    //   148: new java/lang/StringBuilder
    //   151: dup
    //   152: bipush #37
    //   154: invokespecial <init> : (I)V
    //   157: astore_2
    //   158: aload_2
    //   159: ldc 'Unsupported pssh version: '
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload_2
    //   166: iload #5
    //   168: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   171: pop
    //   172: ldc 'PsshAtomUtil'
    //   174: aload_2
    //   175: invokevirtual toString : ()Ljava/lang/String;
    //   178: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   181: pop
    //   182: goto -> 95
    //   185: new java/util/UUID
    //   188: dup
    //   189: aload_2
    //   190: invokevirtual e : ()J
    //   193: aload_2
    //   194: invokevirtual e : ()J
    //   197: invokespecial <init> : (JJ)V
    //   200: astore #8
    //   202: iload #5
    //   204: iconst_1
    //   205: if_icmpne -> 218
    //   208: aload_2
    //   209: aload_2
    //   210: invokevirtual v : ()I
    //   213: iconst_4
    //   214: ishl
    //   215: invokevirtual m : (I)V
    //   218: aload_2
    //   219: invokevirtual v : ()I
    //   222: istore #5
    //   224: iload #5
    //   226: aload_2
    //   227: invokevirtual q : ()I
    //   230: if_icmpeq -> 236
    //   233: goto -> 95
    //   236: iload #5
    //   238: newarray byte
    //   240: astore #9
    //   242: aload_2
    //   243: aload #9
    //   245: iconst_0
    //   246: iload #5
    //   248: invokevirtual p : ([BII)V
    //   251: aload #8
    //   253: aload #9
    //   255: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   258: astore_2
    //   259: aload_2
    //   260: ifnonnull -> 268
    //   263: aconst_null
    //   264: astore_2
    //   265: goto -> 276
    //   268: aload_2
    //   269: getfield first : Ljava/lang/Object;
    //   272: checkcast java/util/UUID
    //   275: astore_2
    //   276: aload_2
    //   277: ifnonnull -> 293
    //   280: ldc_w 'FragmentedMp4Extractor'
    //   283: ldc_w 'Skipped pssh atom (failed to extract uuid)'
    //   286: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   289: pop
    //   290: goto -> 312
    //   293: aload #7
    //   295: new com/google/android/gms/internal/ads/zzjo$zza
    //   298: dup
    //   299: aload_2
    //   300: ldc_w 'video/mp4'
    //   303: aload #4
    //   305: invokespecial <init> : (Ljava/util/UUID;Ljava/lang/String;[B)V
    //   308: invokevirtual add : (Ljava/lang/Object;)Z
    //   311: pop
    //   312: iinc #3, 1
    //   315: aload #7
    //   317: astore_2
    //   318: goto -> 11
    //   321: aload_2
    //   322: ifnonnull -> 327
    //   325: aconst_null
    //   326: areturn
    //   327: new com/google/android/gms/internal/ads/zzjo
    //   330: dup
    //   331: aload_2
    //   332: invokespecial <init> : (Ljava/util/List;)V
    //   335: areturn
  }
  
  private final void f(long paramLong) {
    uf2 uf21 = this;
    label308: while (!uf21.m.isEmpty() && ((if2)uf21.m.peek()).Q0 == paramLong) {
      fg2 fg21;
      zzjo zzjo;
      if2 if2 = uf21.m.pop();
      int i = if2.P0;
      if (i == jf2.B) {
        ue2 ue21;
        boolean bool;
        jj2.f(true, "Unexpected moov box.");
        zzjo zzjo1 = c(if2.R0);
        if2 if21 = if2.g(jf2.M);
        SparseArray sparseArray2 = new SparseArray();
        int j = if21.R0.size();
        long l = -9223372036854775807L;
        for (i = 0; i < j; i++) {
          Pair pair;
          lf2 lf2 = if21.R0.get(i);
          int k = lf2.P0;
          if (k == jf2.y) {
            qj2 qj21 = lf2.Q0;
            qj21.l(12);
            pair = Pair.create(Integer.valueOf(qj21.d()), new tf2(qj21.v() - 1, qj21.v(), qj21.v(), qj21.d()));
            sparseArray2.put(((Integer)pair.first).intValue(), pair.second);
          } else if (k == jf2.N) {
            qj2 qj21 = ((lf2)pair).Q0;
            qj21.l(8);
            if (jf2.a(qj21.d()) == 0) {
              l = qj21.s();
            } else {
              l = qj21.w();
            } 
          } 
        } 
        SparseArray sparseArray1 = new SparseArray();
        j = if2.S0.size();
        for (i = 0; i < j; i++) {
          if2 if22 = if2.S0.get(i);
          if (if22.P0 == jf2.D) {
            fg2 fg22 = kf2.b(if22, if2.f(jf2.C), l, zzjo1, false);
            if (fg22 != null)
              sparseArray1.put(fg22.a, fg22); 
          } 
        } 
        j = sparseArray1.size();
        if (uf21.f.size() == 0) {
          for (i = 0; i < j; i++) {
            fg2 fg22 = (fg2)sparseArray1.valueAt(i);
            zf2 zf23 = new zf2(uf21.C.e(i, fg22.b));
            zf23.b(fg22, (tf2)sparseArray2.get(fg22.a));
            uf21.f.put(fg22.a, zf23);
            uf21.v = Math.max(uf21.v, fg22.e);
          } 
          if ((uf21.d & 0x4) != 0 && uf21.D == null) {
            ue21 = uf21.C.e(uf21.f.size(), 4);
            uf21.D = ue21;
            ue21.a(zzht.c(null, "application/x-emsg", Long.MAX_VALUE));
          } 
          if ((uf21.d & 0x8) != 0 && uf21.E == null) {
            ue21 = uf21.C.e(uf21.f.size() + 1, 3);
            ue21.a(zzht.h(null, "application/cea-608", null, -1, 0, null, null));
            uf21.E = new ue2[] { ue21 };
          } 
          uf21.C.d();
          continue;
        } 
        if (uf21.f.size() == j) {
          bool = true;
        } else {
          bool = false;
        } 
        jj2.e(bool);
        for (i = 0; i < j; i++) {
          fg21 = (fg2)sparseArray1.valueAt(i);
          ((zf2)uf21.f.get(fg21.a)).b(fg21, (tf2)ue21.get(fg21.a));
        } 
        continue;
      } 
      if (i == jf2.K) {
        fg2 fg22;
        byte[] arrayOfByte2;
        SparseArray<zf2> sparseArray = uf21.f;
        i = uf21.d;
        byte[] arrayOfByte1 = uf21.l;
        int k = ((if2)fg21).S0.size();
        int j = 0;
        fg2 fg23 = fg21;
        while (j < k) {
          byte[] arrayOfByte3;
          fg2 fg25;
          if2 if21 = ((if2)arrayOfByte2).S0.get(j);
          if (if21.P0 == jf2.L) {
            qj2 qj21 = (if21.f(jf2.x)).Q0;
            qj21.l(8);
            int n = jf2.b(qj21.d());
            int i1 = qj21.d();
            if ((i & 0x10) != 0)
              i1 = 0; 
            zf2 zf23 = (zf2)sparseArray.get(i1);
            if (zf23 == null) {
              zf23 = null;
            } else {
              int i2;
              int i3;
              if ((n & 0x1) != 0) {
                long l = qj21.w();
                hg2 hg2 = zf23.a;
                hg2.c = l;
                hg2.d = l;
              } 
              tf2 tf2 = zf23.d;
              if ((n & 0x2) != 0) {
                i1 = qj21.v() - 1;
              } else {
                i1 = tf2.a;
              } 
              if ((n & 0x8) != 0) {
                i2 = qj21.v();
              } else {
                i2 = tf2.b;
              } 
              if ((n & 0x10) != 0) {
                i3 = qj21.v();
              } else {
                i3 = tf2.c;
              } 
              if ((n & 0x20) != 0) {
                n = qj21.v();
              } else {
                n = tf2.d;
              } 
              zf23.a.a = new tf2(i1, i2, i3, n);
            } 
            if (zf23 != null) {
              hg2 hg23 = zf23.a;
              long l2 = hg23.s;
              zf23.a();
              i1 = jf2.w;
              long l1 = l2;
              if (if21.f(i1) != null) {
                l1 = l2;
                if ((i & 0x2) == 0) {
                  qj21 = (if21.f(i1)).Q0;
                  qj21.l(8);
                  if (jf2.a(qj21.d()) == 1) {
                    l1 = qj21.w();
                  } else {
                    l1 = qj21.s();
                  } 
                } 
              } 
              List<lf2> list = if21.R0;
              int i3 = list.size();
              n = 0;
              i1 = 0;
              int i2 = 0;
              while (i2 < i3) {
                int i5;
                int i6;
                lf2 lf2 = list.get(i2);
                if (lf2.P0 == jf2.z) {
                  qj2 qj22 = lf2.Q0;
                  qj22.l(12);
                  int i7 = qj22.v();
                  i5 = n;
                  i6 = i1;
                  if (i7 > 0) {
                    i5 = n + i7;
                    i6 = i1 + 1;
                  } 
                } else {
                  i6 = i1;
                  i5 = n;
                } 
                i2++;
                n = i5;
                i1 = i6;
              } 
              int i4 = k;
              zf23.g = 0;
              zf23.f = 0;
              zf23.e = 0;
              hg2 hg22 = zf23.a;
              hg22.e = i1;
              hg22.f = n;
              int[] arrayOfInt = hg22.h;
              if (arrayOfInt == null || arrayOfInt.length < i1) {
                hg22.g = new long[i1];
                hg22.h = new int[i1];
              } 
              arrayOfInt = hg22.i;
              if (arrayOfInt == null || arrayOfInt.length < n) {
                k = n * 125 / 100;
                hg22.i = new int[k];
                hg22.j = new int[k];
                hg22.k = new long[k];
                hg22.l = new boolean[k];
                hg22.n = new boolean[k];
              } 
              i1 = 0;
              byte b = 0;
              i2 = 0;
              zf2 zf24 = zf23;
              k = j;
              fg2 fg26 = fg22;
              hg2 hg21 = hg23;
              j = i1;
              while (true) {
                StringBuilder stringBuilder1;
                long l = 0L;
                if (j < i3) {
                  int i5;
                  lf2 lf2 = list.get(j);
                  if (lf2.P0 == jf2.z) {
                    boolean bool1;
                    boolean bool2;
                    boolean bool3;
                    boolean bool4;
                    qj2 qj22 = lf2.Q0;
                    qj22.l(8);
                    int i6 = jf2.b(qj22.d());
                    fg2 fg28 = zf24.c;
                    hg2 hg2 = zf24.a;
                    tf2 tf2 = hg2.a;
                    hg2.h[b] = qj22.v();
                    long[] arrayOfLong1 = hg2.g;
                    arrayOfLong1[b] = hg2.c;
                    if ((i6 & 0x1) != 0)
                      arrayOfLong1[b] = arrayOfLong1[b] + qj22.d(); 
                    if ((i6 & 0x4) != 0) {
                      bool1 = true;
                    } else {
                      bool1 = false;
                    } 
                    i1 = tf2.d;
                    if (bool1)
                      i1 = qj22.v(); 
                    if ((i6 & 0x100) != 0) {
                      n = 1;
                    } else {
                      n = 0;
                    } 
                    if ((i6 & 0x200) != 0) {
                      bool3 = true;
                    } else {
                      bool3 = false;
                    } 
                    if ((i6 & 0x400) != 0) {
                      bool2 = true;
                    } else {
                      bool2 = false;
                    } 
                    if ((i6 & 0x800) != 0) {
                      i6 = 1;
                    } else {
                      i6 = 0;
                    } 
                    arrayOfLong1 = fg28.i;
                    if (arrayOfLong1 != null && arrayOfLong1.length == 1 && arrayOfLong1[0] == 0L)
                      l = wj2.c(fg28.j[0], 1000L, fg28.c); 
                    int[] arrayOfInt1 = hg2.i;
                    int[] arrayOfInt2 = hg2.j;
                    long[] arrayOfLong2 = hg2.k;
                    i5 = j;
                    boolean[] arrayOfBoolean = hg2.l;
                    if (fg28.b == 2 && (i & 0x1) != 0) {
                      bool4 = true;
                    } else {
                      bool4 = false;
                    } 
                    int i7 = hg2.h[b] + i2;
                    long l3 = fg28.c;
                    if (b) {
                      l2 = hg2.s;
                    } else {
                      l2 = l1;
                    } 
                    while (i2 < i7) {
                      boolean bool;
                      int i8;
                      int i9;
                      if (n != 0) {
                        i8 = qj22.v();
                      } else {
                        i8 = tf2.b;
                      } 
                      if (bool3) {
                        i9 = qj22.v();
                      } else {
                        i9 = tf2.c;
                      } 
                      if (i2 == 0 && bool1) {
                        j = i1;
                      } else if (bool2) {
                        j = qj22.d();
                      } else {
                        j = tf2.d;
                      } 
                      if (i6 != 0) {
                        arrayOfInt2[i2] = (int)((qj22.d() * 1000) / l3);
                      } else {
                        arrayOfInt2[i2] = 0;
                      } 
                      arrayOfLong2[i2] = wj2.c(l2, 1000L, l3) - l;
                      arrayOfInt1[i2] = i9;
                      if ((j >> 16 & 0x1) == 0 && (!bool4 || i2 == 0)) {
                        bool = true;
                      } else {
                        bool = false;
                      } 
                      arrayOfBoolean[i2] = bool;
                      l2 += i8;
                      i2++;
                    } 
                    hg2.s = l2;
                    i2 = i7;
                    b++;
                  } else {
                    i5 = j;
                  } 
                  j = i5 + 1;
                  continue;
                } 
                byte[] arrayOfByte = arrayOfByte2;
                i1 = i;
                lf2 lf23 = if21.f(jf2.c0);
                if (lf23 != null) {
                  eg2[] arrayOfEg2 = zf24.c.h;
                  hg2 hg2 = hg21;
                  eg2 eg2 = arrayOfEg2[hg2.a.a];
                  qj2 qj22 = lf23.Q0;
                  n = eg2.b;
                  qj22.l(8);
                  if ((jf2.b(qj22.d()) & 0x1) == 1)
                    qj22.m(8); 
                  i = qj22.g();
                  int i5 = qj22.v();
                  if (i5 == hg2.f) {
                    if (i == 0) {
                      boolean[] arrayOfBoolean = hg2.n;
                      j = 0;
                      i = 0;
                      while (true) {
                        i2 = i;
                        if (j < i5) {
                          boolean bool;
                          i2 = qj22.g();
                          i += i2;
                          if (i2 > n) {
                            bool = true;
                          } else {
                            bool = false;
                          } 
                          arrayOfBoolean[j] = bool;
                          j++;
                          continue;
                        } 
                        break;
                      } 
                    } else {
                      boolean bool;
                      if (i > n) {
                        bool = true;
                      } else {
                        bool = false;
                      } 
                      i2 = i * i5 + 0;
                      Arrays.fill(hg2.n, 0, i5, bool);
                    } 
                    hg2.a(i2);
                  } else {
                    i = hg2.f;
                    stringBuilder1 = new StringBuilder(41);
                    stringBuilder1.append("Length mismatch: ");
                    stringBuilder1.append(i5);
                    stringBuilder1.append(", ");
                    stringBuilder1.append(i);
                    throw new zzhw(stringBuilder1.toString());
                  } 
                } 
                StringBuilder stringBuilder2 = stringBuilder1;
                lf2 lf21 = if21.f(jf2.d0);
                if (lf21 != null) {
                  qj2 qj22 = lf21.Q0;
                  qj22.l(8);
                  j = qj22.d();
                  if ((jf2.b(j) & 0x1) == 1)
                    qj22.m(8); 
                  i = qj22.v();
                  if (i == 1) {
                    i = jf2.a(j);
                    l2 = ((hg2)stringBuilder2).d;
                    if (i == 0) {
                      l1 = qj22.s();
                    } else {
                      l1 = qj22.w();
                    } 
                    ((hg2)stringBuilder2).d = l2 + l1;
                  } else {
                    StringBuilder stringBuilder = new StringBuilder(40);
                    stringBuilder.append("Unexpected saio entry count: ");
                    stringBuilder.append(i);
                    throw new zzhw(stringBuilder.toString());
                  } 
                } 
                lf21 = if21.f(jf2.h0);
                if (lf21 != null)
                  b(lf21.Q0, 0, (hg2)stringBuilder2); 
                lf2 lf22 = if21.f(jf2.e0);
                lf21 = if21.f(jf2.f0);
                if (lf22 != null && lf21 != null) {
                  qj2 qj23 = lf22.Q0;
                  qj2 qj22 = lf21.Q0;
                  qj23.l(8);
                  j = qj23.d();
                  i2 = qj23.d();
                  i = b;
                  if (i2 == i) {
                    if (jf2.a(j) == 1)
                      qj23.m(4); 
                    if (qj23.d() == 1) {
                      qj22.l(8);
                      j = qj22.d();
                      if (qj22.d() == i) {
                        i = jf2.a(j);
                        if (i == 1) {
                          if (qj22.s() == 0L)
                            throw new zzhw("Variable length decription in sgpd found (unsupported)"); 
                        } else if (i >= 2) {
                          qj22.m(4);
                        } 
                        if (qj22.s() == 1L) {
                          qj22.m(2);
                          if (qj22.g() == 1) {
                            i = qj22.g();
                            byte[] arrayOfByte5 = new byte[16];
                            qj22.p(arrayOfByte5, 0, 16);
                            ((hg2)stringBuilder2).m = true;
                            ((hg2)stringBuilder2).o = new eg2(true, i, arrayOfByte5);
                          } 
                        } else {
                          throw new zzhw("Entry count in sgpd != 1 (unsupported).");
                        } 
                      } 
                    } else {
                      throw new zzhw("Entry count in sbgp != 1 (unsupported).");
                    } 
                  } 
                } 
                j = if21.R0.size();
                i = 0;
                fg2 fg27 = fg26;
                while (i < j) {
                  lf2 lf2 = if21.R0.get(i);
                  if (lf2.P0 == jf2.g0) {
                    qj2 qj22 = lf2.Q0;
                    qj22.l(8);
                    fg2 fg28 = fg27;
                    qj22.p((byte[])fg28, 0, 16);
                    if (Arrays.equals((byte[])fg28, c))
                      b(qj22, 16, (hg2)stringBuilder2); 
                  } 
                  i++;
                } 
                fg25 = fg27;
                j = i4;
                arrayOfByte3 = arrayOfByte;
                i2 = k;
                i = i1;
                break;
              } 
              continue;
            } 
          } 
          byte[] arrayOfByte4 = arrayOfByte3;
          int m = j;
          fg2 fg24 = fg25;
          j = k;
          arrayOfByte2 = arrayOfByte4;
          continue;
          m = SYNTHETIC_LOCAL_VARIABLE_18 + 1;
          fg21 = fg23;
          arrayOfByte2 = arrayOfByte1;
          fg22 = fg21;
          k = j;
          j = m;
        } 
        zzjo = c(((if2)arrayOfByte2).R0);
        uf2 uf23 = this;
        uf2 uf22 = uf23;
        if (zzjo != null) {
          j = uf23.f.size();
          i = 0;
          while (true) {
            uf22 = uf23;
            if (i < j) {
              zf21 = (zf2)uf23.f.valueAt(i);
              zf21.b.a(zf21.c.f.a(zzjo));
              i++;
              continue;
            } 
            continue label308;
          } 
        } 
        continue;
      } 
      zf2 zf22 = zf21;
      zf2 zf21 = zf22;
      if (!((uf2)zf22).m.isEmpty()) {
        ((if2)((uf2)zf22).m.peek()).d((if2)zzjo);
        zf21 = zf22;
      } 
    } 
    i();
  }
  
  private final void i() {
    this.o = 0;
    this.r = 0;
  }
  
  public final void a() {}
  
  public final int d(le2 paramle2, te2 paramte2) {
    le2 le21 = paramle2;
    while (true) {
      int i;
      while (true) {
        i = this.o;
        break;
      } 
      if (i == 0)
        return -1; 
    } 
  }
  
  public final void e(pe2 parampe2) {
    this.C = parampe2;
  }
  
  public final boolean g(le2 paramle2) {
    return cg2.b(paramle2);
  }
  
  public final void h(long paramLong1, long paramLong2) {
    int i = this.f.size();
    for (byte b = 0; b < i; b++)
      ((zf2)this.f.valueAt(b)).a(); 
    this.n.clear();
    this.u = 0;
    this.m.clear();
    i();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uf2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */