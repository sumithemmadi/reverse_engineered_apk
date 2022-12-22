package com.google.android.exoplayer2.source;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.r;
import com.google.android.exoplayer2.util.v;

public class a0 implements v {
  private boolean A;
  
  private Format B;
  
  private long C;
  
  private boolean D;
  
  private final z a;
  
  private final a b;
  
  private final k<?> c;
  
  private b d;
  
  private Format e;
  
  private DrmSession<?> f;
  
  private int g;
  
  private int[] h;
  
  private long[] i;
  
  private int[] j;
  
  private int[] k;
  
  private long[] l;
  
  private v.a[] m;
  
  private Format[] n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private long s;
  
  private long t;
  
  private boolean u;
  
  private boolean v;
  
  private boolean w;
  
  private Format x;
  
  private Format y;
  
  private int z;
  
  public a0(e parame, k<?> paramk) {
    this.a = new z(parame);
    this.c = paramk;
    this.b = new a();
    this.g = 1000;
    this.h = new int[1000];
    this.i = new long[1000];
    this.l = new long[1000];
    this.k = new int[1000];
    this.j = new int[1000];
    this.m = new v.a[1000];
    this.n = new Format[1000];
    this.s = Long.MIN_VALUE;
    this.t = Long.MIN_VALUE;
    this.w = true;
    this.v = true;
  }
  
  private boolean A(int paramInt) {
    k<?> k1 = this.c;
    k<?> k2 = k.a;
    boolean bool1 = true;
    if (k1 == k2)
      return true; 
    DrmSession<?> drmSession = this.f;
    boolean bool2 = bool1;
    if (drmSession != null) {
      bool2 = bool1;
      if (drmSession.getState() != 4)
        if ((this.k[paramInt] & 0x40000000) == 0 && this.f.c()) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }  
    } 
    return bool2;
  }
  
  private void C(Format paramFormat, f0 paramf0) {
    DrmSession<?> drmSession1;
    DrmInitData drmInitData1;
    boolean bool;
    paramf0.c = paramFormat;
    Format format = this.e;
    if (format == null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      format = null;
    } else {
      drmInitData1 = format.m;
    } 
    this.e = paramFormat;
    if (this.c == k.a)
      return; 
    DrmInitData drmInitData2 = paramFormat.m;
    paramf0.a = true;
    paramf0.b = this.f;
    if (!bool && h0.b(drmInitData1, drmInitData2))
      return; 
    DrmSession<?> drmSession2 = this.f;
    Looper looper = (Looper)e.e(Looper.myLooper());
    if (drmInitData2 != null) {
      drmSession1 = this.c.e(looper, drmInitData2);
    } else {
      drmSession1 = this.c.d(looper, r.h(((Format)drmSession1).j));
    } 
    this.f = drmSession1;
    paramf0.b = drmSession1;
    if (drmSession2 != null)
      drmSession2.a(); 
  }
  
  private int G(f0 paramf0, e parame, boolean paramBoolean1, boolean paramBoolean2, long paramLong, a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iconst_m1
    //   3: istore #8
    //   5: aload_0
    //   6: invokespecial w : ()Z
    //   9: istore #9
    //   11: iload #9
    //   13: ifeq -> 80
    //   16: aload_0
    //   17: aload_0
    //   18: getfield r : I
    //   21: invokespecial t : (I)I
    //   24: istore #10
    //   26: iload #10
    //   28: istore #8
    //   30: aload_0
    //   31: getfield l : [J
    //   34: iload #10
    //   36: laload
    //   37: lload #5
    //   39: lcmp
    //   40: ifge -> 80
    //   43: iload #10
    //   45: istore #8
    //   47: aload_0
    //   48: getfield n : [Lcom/google/android/exoplayer2/Format;
    //   51: iload #10
    //   53: aaload
    //   54: getfield j : Ljava/lang/String;
    //   57: invokestatic a : (Ljava/lang/String;)Z
    //   60: ifeq -> 80
    //   63: aload_0
    //   64: aload_0
    //   65: getfield r : I
    //   68: iconst_1
    //   69: iadd
    //   70: putfield r : I
    //   73: iload #10
    //   75: istore #8
    //   77: goto -> 5
    //   80: iload #9
    //   82: ifne -> 153
    //   85: iload #4
    //   87: ifne -> 143
    //   90: aload_0
    //   91: getfield u : Z
    //   94: ifeq -> 100
    //   97: goto -> 143
    //   100: aload_0
    //   101: getfield x : Lcom/google/android/exoplayer2/Format;
    //   104: astore_2
    //   105: aload_2
    //   106: ifnull -> 138
    //   109: iload_3
    //   110: ifne -> 121
    //   113: aload_2
    //   114: aload_0
    //   115: getfield e : Lcom/google/android/exoplayer2/Format;
    //   118: if_acmpeq -> 138
    //   121: aload_0
    //   122: aload_2
    //   123: invokestatic e : (Ljava/lang/Object;)Ljava/lang/Object;
    //   126: checkcast com/google/android/exoplayer2/Format
    //   129: aload_1
    //   130: invokespecial C : (Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/f0;)V
    //   133: aload_0
    //   134: monitorexit
    //   135: bipush #-5
    //   137: ireturn
    //   138: aload_0
    //   139: monitorexit
    //   140: bipush #-3
    //   142: ireturn
    //   143: aload_2
    //   144: iconst_4
    //   145: invokevirtual setFlags : (I)V
    //   148: aload_0
    //   149: monitorexit
    //   150: bipush #-4
    //   152: ireturn
    //   153: iload_3
    //   154: ifne -> 295
    //   157: aload_0
    //   158: getfield n : [Lcom/google/android/exoplayer2/Format;
    //   161: iload #8
    //   163: aaload
    //   164: aload_0
    //   165: getfield e : Lcom/google/android/exoplayer2/Format;
    //   168: if_acmpeq -> 174
    //   171: goto -> 295
    //   174: aload_0
    //   175: iload #8
    //   177: invokespecial A : (I)Z
    //   180: istore_3
    //   181: iload_3
    //   182: ifne -> 190
    //   185: aload_0
    //   186: monitorexit
    //   187: bipush #-3
    //   189: ireturn
    //   190: aload_2
    //   191: aload_0
    //   192: getfield k : [I
    //   195: iload #8
    //   197: iaload
    //   198: invokevirtual setFlags : (I)V
    //   201: aload_0
    //   202: getfield l : [J
    //   205: iload #8
    //   207: laload
    //   208: lstore #11
    //   210: aload_2
    //   211: lload #11
    //   213: putfield d : J
    //   216: lload #11
    //   218: lload #5
    //   220: lcmp
    //   221: ifge -> 230
    //   224: aload_2
    //   225: ldc -2147483648
    //   227: invokevirtual addFlag : (I)V
    //   230: aload_2
    //   231: invokevirtual q : ()Z
    //   234: istore_3
    //   235: iload_3
    //   236: ifeq -> 244
    //   239: aload_0
    //   240: monitorexit
    //   241: bipush #-4
    //   243: ireturn
    //   244: aload #7
    //   246: aload_0
    //   247: getfield j : [I
    //   250: iload #8
    //   252: iaload
    //   253: putfield a : I
    //   256: aload #7
    //   258: aload_0
    //   259: getfield i : [J
    //   262: iload #8
    //   264: laload
    //   265: putfield b : J
    //   268: aload #7
    //   270: aload_0
    //   271: getfield m : [Lcom/google/android/exoplayer2/c1/v$a;
    //   274: iload #8
    //   276: aaload
    //   277: putfield c : Lcom/google/android/exoplayer2/c1/v$a;
    //   280: aload_0
    //   281: aload_0
    //   282: getfield r : I
    //   285: iconst_1
    //   286: iadd
    //   287: putfield r : I
    //   290: aload_0
    //   291: monitorexit
    //   292: bipush #-4
    //   294: ireturn
    //   295: aload_0
    //   296: aload_0
    //   297: getfield n : [Lcom/google/android/exoplayer2/Format;
    //   300: iload #8
    //   302: aaload
    //   303: aload_1
    //   304: invokespecial C : (Lcom/google/android/exoplayer2/Format;Lcom/google/android/exoplayer2/f0;)V
    //   307: aload_0
    //   308: monitorexit
    //   309: bipush #-5
    //   311: ireturn
    //   312: astore_1
    //   313: aload_0
    //   314: monitorexit
    //   315: goto -> 320
    //   318: aload_1
    //   319: athrow
    //   320: goto -> 318
    // Exception table:
    //   from	to	target	type
    //   5	11	312	finally
    //   16	26	312	finally
    //   30	43	312	finally
    //   47	73	312	finally
    //   90	97	312	finally
    //   100	105	312	finally
    //   113	121	312	finally
    //   121	133	312	finally
    //   143	148	312	finally
    //   157	171	312	finally
    //   174	181	312	finally
    //   190	216	312	finally
    //   224	230	312	finally
    //   230	235	312	finally
    //   244	290	312	finally
    //   295	307	312	finally
  }
  
  private void I() {
    DrmSession<?> drmSession = this.f;
    if (drmSession != null) {
      drmSession.a();
      this.f = null;
      this.e = null;
    } 
  }
  
  private void L() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_0
    //   4: putfield r : I
    //   7: aload_0
    //   8: getfield a : Lcom/google/android/exoplayer2/source/z;
    //   11: invokevirtual l : ()V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	17	finally
  }
  
  private boolean O(Format paramFormat) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnonnull -> 15
    //   6: aload_0
    //   7: iconst_1
    //   8: putfield w : Z
    //   11: aload_0
    //   12: monitorexit
    //   13: iconst_0
    //   14: ireturn
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield w : Z
    //   20: aload_1
    //   21: aload_0
    //   22: getfield x : Lcom/google/android/exoplayer2/Format;
    //   25: invokestatic b : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   28: istore_2
    //   29: iload_2
    //   30: ifeq -> 37
    //   33: aload_0
    //   34: monitorexit
    //   35: iconst_0
    //   36: ireturn
    //   37: aload_1
    //   38: aload_0
    //   39: getfield y : Lcom/google/android/exoplayer2/Format;
    //   42: invokestatic b : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   45: ifeq -> 60
    //   48: aload_0
    //   49: aload_0
    //   50: getfield y : Lcom/google/android/exoplayer2/Format;
    //   53: putfield x : Lcom/google/android/exoplayer2/Format;
    //   56: aload_0
    //   57: monitorexit
    //   58: iconst_1
    //   59: ireturn
    //   60: aload_0
    //   61: aload_1
    //   62: putfield x : Lcom/google/android/exoplayer2/Format;
    //   65: aload_0
    //   66: monitorexit
    //   67: iconst_1
    //   68: ireturn
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Exception table:
    //   from	to	target	type
    //   6	11	69	finally
    //   15	29	69	finally
    //   37	56	69	finally
    //   60	65	69	finally
  }
  
  private boolean g(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : I
    //   6: istore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: iload_3
    //   11: ifne -> 35
    //   14: aload_0
    //   15: getfield s : J
    //   18: lstore #5
    //   20: lload_1
    //   21: lload #5
    //   23: lcmp
    //   24: ifle -> 30
    //   27: iconst_1
    //   28: istore #4
    //   30: aload_0
    //   31: monitorexit
    //   32: iload #4
    //   34: ireturn
    //   35: aload_0
    //   36: getfield s : J
    //   39: aload_0
    //   40: aload_0
    //   41: getfield r : I
    //   44: invokespecial r : (I)J
    //   47: invokestatic max : (JJ)J
    //   50: lstore #5
    //   52: lload #5
    //   54: lload_1
    //   55: lcmp
    //   56: iflt -> 63
    //   59: aload_0
    //   60: monitorexit
    //   61: iconst_0
    //   62: ireturn
    //   63: aload_0
    //   64: getfield o : I
    //   67: istore #7
    //   69: aload_0
    //   70: iload #7
    //   72: iconst_1
    //   73: isub
    //   74: invokespecial t : (I)I
    //   77: istore_3
    //   78: iload #7
    //   80: aload_0
    //   81: getfield r : I
    //   84: if_icmple -> 136
    //   87: aload_0
    //   88: getfield l : [J
    //   91: iload_3
    //   92: laload
    //   93: lload_1
    //   94: lcmp
    //   95: iflt -> 136
    //   98: iload #7
    //   100: iconst_1
    //   101: isub
    //   102: istore #8
    //   104: iload_3
    //   105: iconst_1
    //   106: isub
    //   107: istore #9
    //   109: iload #8
    //   111: istore #7
    //   113: iload #9
    //   115: istore_3
    //   116: iload #9
    //   118: iconst_m1
    //   119: if_icmpne -> 78
    //   122: aload_0
    //   123: getfield g : I
    //   126: iconst_1
    //   127: isub
    //   128: istore_3
    //   129: iload #8
    //   131: istore #7
    //   133: goto -> 78
    //   136: aload_0
    //   137: aload_0
    //   138: getfield p : I
    //   141: iload #7
    //   143: iadd
    //   144: invokespecial n : (I)J
    //   147: pop2
    //   148: aload_0
    //   149: monitorexit
    //   150: iconst_1
    //   151: ireturn
    //   152: astore #10
    //   154: aload_0
    //   155: monitorexit
    //   156: goto -> 162
    //   159: aload #10
    //   161: athrow
    //   162: goto -> 159
    // Exception table:
    //   from	to	target	type
    //   2	7	152	finally
    //   14	20	152	finally
    //   35	52	152	finally
    //   63	78	152	finally
    //   78	98	152	finally
    //   122	129	152	finally
    //   136	148	152	finally
  }
  
  private void h(long paramLong1, int paramInt1, long paramLong2, int paramInt2, v.a parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield v : Z
    //   6: istore #8
    //   8: iload #8
    //   10: ifeq -> 27
    //   13: iload_3
    //   14: iconst_1
    //   15: iand
    //   16: ifne -> 22
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: iconst_0
    //   24: putfield v : Z
    //   27: aload_0
    //   28: getfield w : Z
    //   31: ifne -> 40
    //   34: iconst_1
    //   35: istore #8
    //   37: goto -> 43
    //   40: iconst_0
    //   41: istore #8
    //   43: iload #8
    //   45: invokestatic f : (Z)V
    //   48: ldc 536870912
    //   50: iload_3
    //   51: iand
    //   52: ifeq -> 61
    //   55: iconst_1
    //   56: istore #8
    //   58: goto -> 64
    //   61: iconst_0
    //   62: istore #8
    //   64: aload_0
    //   65: iload #8
    //   67: putfield u : Z
    //   70: aload_0
    //   71: aload_0
    //   72: getfield t : J
    //   75: lload_1
    //   76: invokestatic max : (JJ)J
    //   79: putfield t : J
    //   82: aload_0
    //   83: aload_0
    //   84: getfield o : I
    //   87: invokespecial t : (I)I
    //   90: istore #9
    //   92: aload_0
    //   93: getfield l : [J
    //   96: iload #9
    //   98: lload_1
    //   99: lastore
    //   100: aload_0
    //   101: getfield i : [J
    //   104: astore #10
    //   106: aload #10
    //   108: iload #9
    //   110: lload #4
    //   112: lastore
    //   113: aload_0
    //   114: getfield j : [I
    //   117: iload #9
    //   119: iload #6
    //   121: iastore
    //   122: aload_0
    //   123: getfield k : [I
    //   126: iload #9
    //   128: iload_3
    //   129: iastore
    //   130: aload_0
    //   131: getfield m : [Lcom/google/android/exoplayer2/c1/v$a;
    //   134: iload #9
    //   136: aload #7
    //   138: aastore
    //   139: aload_0
    //   140: getfield n : [Lcom/google/android/exoplayer2/Format;
    //   143: astore #11
    //   145: aload_0
    //   146: getfield x : Lcom/google/android/exoplayer2/Format;
    //   149: astore #7
    //   151: aload #11
    //   153: iload #9
    //   155: aload #7
    //   157: aastore
    //   158: aload_0
    //   159: getfield h : [I
    //   162: iload #9
    //   164: aload_0
    //   165: getfield z : I
    //   168: iastore
    //   169: aload_0
    //   170: aload #7
    //   172: putfield y : Lcom/google/android/exoplayer2/Format;
    //   175: aload_0
    //   176: getfield o : I
    //   179: iconst_1
    //   180: iadd
    //   181: istore_3
    //   182: aload_0
    //   183: iload_3
    //   184: putfield o : I
    //   187: aload_0
    //   188: getfield g : I
    //   191: istore #6
    //   193: iload_3
    //   194: iload #6
    //   196: if_icmpne -> 520
    //   199: iload #6
    //   201: sipush #1000
    //   204: iadd
    //   205: istore_3
    //   206: iload_3
    //   207: newarray int
    //   209: astore #12
    //   211: iload_3
    //   212: newarray long
    //   214: astore #13
    //   216: iload_3
    //   217: newarray long
    //   219: astore #14
    //   221: iload_3
    //   222: newarray int
    //   224: astore #15
    //   226: iload_3
    //   227: newarray int
    //   229: astore #11
    //   231: iload_3
    //   232: anewarray com/google/android/exoplayer2/c1/v$a
    //   235: astore #16
    //   237: iload_3
    //   238: anewarray com/google/android/exoplayer2/Format
    //   241: astore #7
    //   243: aload_0
    //   244: getfield q : I
    //   247: istore #9
    //   249: iload #6
    //   251: iload #9
    //   253: isub
    //   254: istore #6
    //   256: aload #10
    //   258: iload #9
    //   260: aload #13
    //   262: iconst_0
    //   263: iload #6
    //   265: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   268: aload_0
    //   269: getfield l : [J
    //   272: aload_0
    //   273: getfield q : I
    //   276: aload #14
    //   278: iconst_0
    //   279: iload #6
    //   281: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   284: aload_0
    //   285: getfield k : [I
    //   288: aload_0
    //   289: getfield q : I
    //   292: aload #15
    //   294: iconst_0
    //   295: iload #6
    //   297: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   300: aload_0
    //   301: getfield j : [I
    //   304: aload_0
    //   305: getfield q : I
    //   308: aload #11
    //   310: iconst_0
    //   311: iload #6
    //   313: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   316: aload_0
    //   317: getfield m : [Lcom/google/android/exoplayer2/c1/v$a;
    //   320: aload_0
    //   321: getfield q : I
    //   324: aload #16
    //   326: iconst_0
    //   327: iload #6
    //   329: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   332: aload_0
    //   333: getfield n : [Lcom/google/android/exoplayer2/Format;
    //   336: aload_0
    //   337: getfield q : I
    //   340: aload #7
    //   342: iconst_0
    //   343: iload #6
    //   345: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   348: aload_0
    //   349: getfield h : [I
    //   352: aload_0
    //   353: getfield q : I
    //   356: aload #12
    //   358: iconst_0
    //   359: iload #6
    //   361: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   364: aload_0
    //   365: getfield q : I
    //   368: istore #9
    //   370: aload_0
    //   371: getfield i : [J
    //   374: iconst_0
    //   375: aload #13
    //   377: iload #6
    //   379: iload #9
    //   381: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   384: aload_0
    //   385: getfield l : [J
    //   388: iconst_0
    //   389: aload #14
    //   391: iload #6
    //   393: iload #9
    //   395: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   398: aload_0
    //   399: getfield k : [I
    //   402: iconst_0
    //   403: aload #15
    //   405: iload #6
    //   407: iload #9
    //   409: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   412: aload_0
    //   413: getfield j : [I
    //   416: iconst_0
    //   417: aload #11
    //   419: iload #6
    //   421: iload #9
    //   423: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   426: aload_0
    //   427: getfield m : [Lcom/google/android/exoplayer2/c1/v$a;
    //   430: iconst_0
    //   431: aload #16
    //   433: iload #6
    //   435: iload #9
    //   437: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   440: aload_0
    //   441: getfield n : [Lcom/google/android/exoplayer2/Format;
    //   444: iconst_0
    //   445: aload #7
    //   447: iload #6
    //   449: iload #9
    //   451: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   454: aload_0
    //   455: getfield h : [I
    //   458: iconst_0
    //   459: aload #12
    //   461: iload #6
    //   463: iload #9
    //   465: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   468: aload_0
    //   469: aload #13
    //   471: putfield i : [J
    //   474: aload_0
    //   475: aload #14
    //   477: putfield l : [J
    //   480: aload_0
    //   481: aload #15
    //   483: putfield k : [I
    //   486: aload_0
    //   487: aload #11
    //   489: putfield j : [I
    //   492: aload_0
    //   493: aload #16
    //   495: putfield m : [Lcom/google/android/exoplayer2/c1/v$a;
    //   498: aload_0
    //   499: aload #7
    //   501: putfield n : [Lcom/google/android/exoplayer2/Format;
    //   504: aload_0
    //   505: aload #12
    //   507: putfield h : [I
    //   510: aload_0
    //   511: iconst_0
    //   512: putfield q : I
    //   515: aload_0
    //   516: iload_3
    //   517: putfield g : I
    //   520: aload_0
    //   521: monitorexit
    //   522: return
    //   523: astore #7
    //   525: aload_0
    //   526: monitorexit
    //   527: aload #7
    //   529: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	523	finally
    //   22	27	523	finally
    //   27	34	523	finally
    //   43	48	523	finally
    //   64	106	523	finally
    //   113	151	523	finally
    //   158	193	523	finally
    //   206	249	523	finally
    //   256	520	523	finally
  }
  
  private long i(long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : I
    //   6: istore #5
    //   8: iload #5
    //   10: ifeq -> 105
    //   13: aload_0
    //   14: getfield l : [J
    //   17: astore #6
    //   19: aload_0
    //   20: getfield q : I
    //   23: istore #7
    //   25: lload_1
    //   26: aload #6
    //   28: iload #7
    //   30: laload
    //   31: lcmp
    //   32: ifge -> 38
    //   35: goto -> 105
    //   38: iload #5
    //   40: istore #8
    //   42: iload #4
    //   44: ifeq -> 70
    //   47: aload_0
    //   48: getfield r : I
    //   51: istore #9
    //   53: iload #5
    //   55: istore #8
    //   57: iload #9
    //   59: iload #5
    //   61: if_icmpeq -> 70
    //   64: iload #9
    //   66: iconst_1
    //   67: iadd
    //   68: istore #8
    //   70: aload_0
    //   71: iload #7
    //   73: iload #8
    //   75: lload_1
    //   76: iload_3
    //   77: invokespecial o : (IIJZ)I
    //   80: istore #8
    //   82: iload #8
    //   84: iconst_m1
    //   85: if_icmpne -> 94
    //   88: aload_0
    //   89: monitorexit
    //   90: ldc2_w -1
    //   93: lreturn
    //   94: aload_0
    //   95: iload #8
    //   97: invokespecial k : (I)J
    //   100: lstore_1
    //   101: aload_0
    //   102: monitorexit
    //   103: lload_1
    //   104: lreturn
    //   105: aload_0
    //   106: monitorexit
    //   107: ldc2_w -1
    //   110: lreturn
    //   111: astore #6
    //   113: aload_0
    //   114: monitorexit
    //   115: aload #6
    //   117: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	111	finally
    //   13	25	111	finally
    //   47	53	111	finally
    //   70	82	111	finally
    //   94	101	111	finally
  }
  
  private long j() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : I
    //   6: istore_1
    //   7: iload_1
    //   8: ifne -> 17
    //   11: aload_0
    //   12: monitorexit
    //   13: ldc2_w -1
    //   16: lreturn
    //   17: aload_0
    //   18: iload_1
    //   19: invokespecial k : (I)J
    //   22: lstore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: lload_2
    //   26: lreturn
    //   27: astore #4
    //   29: aload_0
    //   30: monitorexit
    //   31: aload #4
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	27	finally
    //   17	23	27	finally
  }
  
  private long k(int paramInt) {
    this.s = Math.max(this.s, r(paramInt));
    int i = this.o - paramInt;
    this.o = i;
    this.p += paramInt;
    int j = this.q + paramInt;
    this.q = j;
    int m = this.g;
    if (j >= m)
      this.q = j - m; 
    paramInt = this.r - paramInt;
    this.r = paramInt;
    if (paramInt < 0)
      this.r = 0; 
    if (i == 0) {
      paramInt = this.q;
      if (paramInt == 0)
        paramInt = m; 
      return this.i[--paramInt] + this.j[paramInt];
    } 
    return this.i[this.q];
  }
  
  private long n(int paramInt) {
    paramInt = v() - paramInt;
    boolean bool1 = false;
    if (paramInt >= 0 && paramInt <= this.o - this.r) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    int i = this.o - paramInt;
    this.o = i;
    this.t = Math.max(this.s, r(i));
    boolean bool2 = bool1;
    if (paramInt == 0) {
      bool2 = bool1;
      if (this.u)
        bool2 = true; 
    } 
    this.u = bool2;
    paramInt = this.o;
    if (paramInt != 0) {
      paramInt = t(paramInt - 1);
      return this.i[paramInt] + this.j[paramInt];
    } 
    return 0L;
  }
  
  private int o(int paramInt1, int paramInt2, long paramLong, boolean paramBoolean) {
    int i = -1;
    int j = 0;
    int m = paramInt1;
    for (paramInt1 = j; paramInt1 < paramInt2 && this.l[m] <= paramLong; paramInt1++) {
      if (!paramBoolean || (this.k[m] & 0x1) != 0)
        i = paramInt1; 
      j = m + 1;
      m = j;
      if (j == this.g)
        m = 0; 
    } 
    return i;
  }
  
  private long r(int paramInt) {
    long l2;
    long l1 = Long.MIN_VALUE;
    if (paramInt == 0)
      return Long.MIN_VALUE; 
    int i = t(paramInt - 1);
    byte b1 = 0;
    while (true) {
      l2 = l1;
      if (b1 < paramInt) {
        l1 = Math.max(l1, this.l[i]);
        if ((this.k[i] & 0x1) != 0) {
          l2 = l1;
          break;
        } 
        int j = i - 1;
        i = j;
        if (j == -1)
          i = this.g - 1; 
        b1++;
        continue;
      } 
      break;
    } 
    return l2;
  }
  
  private int t(int paramInt) {
    paramInt = this.q + paramInt;
    int i = this.g;
    if (paramInt >= i)
      paramInt -= i; 
    return paramInt;
  }
  
  private boolean w() {
    boolean bool;
    if (this.r != this.o) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void B() {
    DrmSession<?> drmSession = this.f;
    if (drmSession == null || drmSession.getState() != 1)
      return; 
    throw (DrmSession.DrmSessionException)e.e(this.f.f());
  }
  
  public final int D() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield r : I
    //   7: invokespecial t : (I)I
    //   10: istore_1
    //   11: aload_0
    //   12: invokespecial w : ()Z
    //   15: ifeq -> 28
    //   18: aload_0
    //   19: getfield h : [I
    //   22: iload_1
    //   23: iaload
    //   24: istore_1
    //   25: goto -> 33
    //   28: aload_0
    //   29: getfield z : I
    //   32: istore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: iload_1
    //   36: ireturn
    //   37: astore_2
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_2
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	25	37	finally
    //   28	33	37	finally
  }
  
  public void E() {
    m();
    I();
  }
  
  public int F(f0 paramf0, e parame, boolean paramBoolean1, boolean paramBoolean2, long paramLong) {
    int i = G(paramf0, parame, paramBoolean1, paramBoolean2, paramLong, this.b);
    if (i == -4 && !parame.isEndOfStream() && !parame.q())
      this.a.j(parame, this.b); 
    return i;
  }
  
  public void H() {
    K(true);
    I();
  }
  
  public final void J() {
    K(false);
  }
  
  public void K(boolean paramBoolean) {
    this.a.k();
    this.o = 0;
    this.p = 0;
    this.q = 0;
    this.r = 0;
    this.v = true;
    this.s = Long.MIN_VALUE;
    this.t = Long.MIN_VALUE;
    this.u = false;
    this.y = null;
    if (paramBoolean) {
      this.B = null;
      this.x = null;
      this.w = true;
    } 
  }
  
  public final boolean M(long paramLong, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial L : ()V
    //   6: aload_0
    //   7: aload_0
    //   8: getfield r : I
    //   11: invokespecial t : (I)I
    //   14: istore #4
    //   16: aload_0
    //   17: invokespecial w : ()Z
    //   20: ifeq -> 95
    //   23: lload_1
    //   24: aload_0
    //   25: getfield l : [J
    //   28: iload #4
    //   30: laload
    //   31: lcmp
    //   32: iflt -> 95
    //   35: lload_1
    //   36: aload_0
    //   37: getfield t : J
    //   40: lcmp
    //   41: ifle -> 51
    //   44: iload_3
    //   45: ifne -> 51
    //   48: goto -> 95
    //   51: aload_0
    //   52: iload #4
    //   54: aload_0
    //   55: getfield o : I
    //   58: aload_0
    //   59: getfield r : I
    //   62: isub
    //   63: lload_1
    //   64: iconst_1
    //   65: invokespecial o : (IIJZ)I
    //   68: istore #4
    //   70: iload #4
    //   72: iconst_m1
    //   73: if_icmpne -> 80
    //   76: aload_0
    //   77: monitorexit
    //   78: iconst_0
    //   79: ireturn
    //   80: aload_0
    //   81: aload_0
    //   82: getfield r : I
    //   85: iload #4
    //   87: iadd
    //   88: putfield r : I
    //   91: aload_0
    //   92: monitorexit
    //   93: iconst_1
    //   94: ireturn
    //   95: aload_0
    //   96: monitorexit
    //   97: iconst_0
    //   98: ireturn
    //   99: astore #5
    //   101: aload_0
    //   102: monitorexit
    //   103: aload #5
    //   105: athrow
    // Exception table:
    //   from	to	target	type
    //   2	44	99	finally
    //   51	70	99	finally
    //   80	91	99	finally
  }
  
  public final void N(long paramLong) {
    if (this.C != paramLong) {
      this.C = paramLong;
      x();
    } 
  }
  
  public final void P(b paramb) {
    this.d = paramb;
  }
  
  public final void Q(int paramInt) {
    this.z = paramInt;
  }
  
  public final void R() {
    this.D = true;
  }
  
  public final int a(i parami, int paramInt, boolean paramBoolean) {
    return this.a.m(parami, paramInt, paramBoolean);
  }
  
  public final void b(v paramv, int paramInt) {
    this.a.n(paramv, paramInt);
  }
  
  public final void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama) {
    if (this.A)
      d(this.B); 
    paramLong += this.C;
    if (this.D) {
      if ((paramInt1 & 0x1) == 0 || !g(paramLong))
        return; 
      this.D = false;
    } 
    h(paramLong, paramInt1, this.a.d() - paramInt2 - paramInt3, paramInt2, parama);
  }
  
  public final void d(Format paramFormat) {
    Format format = p(paramFormat);
    this.A = false;
    this.B = paramFormat;
    boolean bool = O(format);
    b b1 = this.d;
    if (b1 != null && bool)
      b1.d(format); 
  }
  
  public final int e(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield r : I
    //   7: invokespecial t : (I)I
    //   10: istore_3
    //   11: aload_0
    //   12: invokespecial w : ()Z
    //   15: ifeq -> 72
    //   18: lload_1
    //   19: aload_0
    //   20: getfield l : [J
    //   23: iload_3
    //   24: laload
    //   25: lcmp
    //   26: ifge -> 32
    //   29: goto -> 72
    //   32: aload_0
    //   33: iload_3
    //   34: aload_0
    //   35: getfield o : I
    //   38: aload_0
    //   39: getfield r : I
    //   42: isub
    //   43: lload_1
    //   44: iconst_1
    //   45: invokespecial o : (IIJZ)I
    //   48: istore_3
    //   49: iload_3
    //   50: iconst_m1
    //   51: if_icmpne -> 58
    //   54: aload_0
    //   55: monitorexit
    //   56: iconst_0
    //   57: ireturn
    //   58: aload_0
    //   59: aload_0
    //   60: getfield r : I
    //   63: iload_3
    //   64: iadd
    //   65: putfield r : I
    //   68: aload_0
    //   69: monitorexit
    //   70: iload_3
    //   71: ireturn
    //   72: aload_0
    //   73: monitorexit
    //   74: iconst_0
    //   75: ireturn
    //   76: astore #4
    //   78: aload_0
    //   79: monitorexit
    //   80: aload #4
    //   82: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	76	finally
    //   32	49	76	finally
    //   58	68	76	finally
  }
  
  public final int f() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : I
    //   6: istore_1
    //   7: aload_0
    //   8: getfield r : I
    //   11: istore_2
    //   12: aload_0
    //   13: iload_1
    //   14: putfield r : I
    //   17: aload_0
    //   18: monitorexit
    //   19: iload_1
    //   20: iload_2
    //   21: isub
    //   22: ireturn
    //   23: astore_3
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_3
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	23	finally
  }
  
  public final void l(long paramLong, boolean paramBoolean1, boolean paramBoolean2) {
    this.a.c(i(paramLong, paramBoolean1, paramBoolean2));
  }
  
  public final void m() {
    this.a.c(j());
  }
  
  protected Format p(Format paramFormat) {
    long l = this.C;
    Format format = paramFormat;
    if (l != 0L) {
      long l1 = paramFormat.n;
      format = paramFormat;
      if (l1 != Long.MAX_VALUE)
        format = paramFormat.k(l1 + l); 
    } 
    return format;
  }
  
  public final long q() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield t : J
    //   6: lstore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: lload_1
    //   10: lreturn
    //   11: astore_3
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_3
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public final int s() {
    return this.p + this.r;
  }
  
  public final Format u() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield w : Z
    //   6: ifeq -> 14
    //   9: aconst_null
    //   10: astore_1
    //   11: goto -> 19
    //   14: aload_0
    //   15: getfield x : Lcom/google/android/exoplayer2/Format;
    //   18: astore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: areturn
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	23	finally
    //   14	19	23	finally
  }
  
  public final int v() {
    return this.p + this.o;
  }
  
  protected final void x() {
    this.A = true;
  }
  
  public final boolean y() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield u : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public boolean z(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial w : ()Z
    //   6: istore_2
    //   7: iconst_1
    //   8: istore_3
    //   9: iload_2
    //   10: ifne -> 63
    //   13: iload_3
    //   14: istore_2
    //   15: iload_1
    //   16: ifne -> 59
    //   19: iload_3
    //   20: istore_2
    //   21: aload_0
    //   22: getfield u : Z
    //   25: ifne -> 59
    //   28: aload_0
    //   29: getfield x : Lcom/google/android/exoplayer2/Format;
    //   32: astore #4
    //   34: aload #4
    //   36: ifnull -> 57
    //   39: aload_0
    //   40: getfield e : Lcom/google/android/exoplayer2/Format;
    //   43: astore #5
    //   45: aload #4
    //   47: aload #5
    //   49: if_acmpeq -> 57
    //   52: iload_3
    //   53: istore_2
    //   54: goto -> 59
    //   57: iconst_0
    //   58: istore_2
    //   59: aload_0
    //   60: monitorexit
    //   61: iload_2
    //   62: ireturn
    //   63: aload_0
    //   64: aload_0
    //   65: getfield r : I
    //   68: invokespecial t : (I)I
    //   71: istore #6
    //   73: aload_0
    //   74: getfield n : [Lcom/google/android/exoplayer2/Format;
    //   77: iload #6
    //   79: aaload
    //   80: astore #4
    //   82: aload_0
    //   83: getfield e : Lcom/google/android/exoplayer2/Format;
    //   86: astore #5
    //   88: aload #4
    //   90: aload #5
    //   92: if_acmpeq -> 99
    //   95: aload_0
    //   96: monitorexit
    //   97: iconst_1
    //   98: ireturn
    //   99: aload_0
    //   100: iload #6
    //   102: invokespecial A : (I)Z
    //   105: istore_1
    //   106: aload_0
    //   107: monitorexit
    //   108: iload_1
    //   109: ireturn
    //   110: astore #5
    //   112: aload_0
    //   113: monitorexit
    //   114: aload #5
    //   116: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	110	finally
    //   21	34	110	finally
    //   39	45	110	finally
    //   63	88	110	finally
    //   99	106	110	finally
  }
  
  static final class a {
    public int a;
    
    public long b;
    
    public v.a c;
  }
  
  public static interface b {
    void d(Format param1Format);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */