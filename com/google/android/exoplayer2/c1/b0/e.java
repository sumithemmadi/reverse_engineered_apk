package com.google.android.exoplayer2.c1.b0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.c1.p;
import com.google.android.exoplayer2.c1.q;
import com.google.android.exoplayer2.c1.r;
import com.google.android.exoplayer2.c1.s;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.b;
import com.google.android.exoplayer2.util.v;
import java.io.EOFException;

public final class e implements h {
  public static final l a = a.a;
  
  private static final b.a b = b.a;
  
  private final int c;
  
  private final long d;
  
  private final v e;
  
  private final r f;
  
  private final p g;
  
  private final q h;
  
  private j i;
  
  private v j;
  
  private int k;
  
  private Metadata l;
  
  private f m;
  
  private boolean n;
  
  private long o;
  
  private long p;
  
  private long q;
  
  private int r;
  
  public e() {
    this(0);
  }
  
  public e(int paramInt) {
    this(paramInt, -9223372036854775807L);
  }
  
  public e(int paramInt, long paramLong) {
    this.c = paramInt;
    this.d = paramLong;
    this.e = new v(10);
    this.f = new r();
    this.g = new p();
    this.o = -9223372036854775807L;
    this.h = new q();
  }
  
  private f c(i parami) {
    parami.k(this.e.a, 0, 4);
    this.e.M(0);
    r.e(this.e.k(), this.f);
    return new c(parami.getLength(), parami.a(), this.f);
  }
  
  private static int d(v paramv, int paramInt) {
    if (paramv.d() >= paramInt + 4) {
      paramv.M(paramInt);
      paramInt = paramv.k();
      if (paramInt == 1483304551 || paramInt == 1231971951)
        return paramInt; 
    } 
    if (paramv.d() >= 40) {
      paramv.M(36);
      if (paramv.k() == 1447187017)
        return 1447187017; 
    } 
    return 0;
  }
  
  private static boolean f(int paramInt, long paramLong) {
    boolean bool;
    if ((paramInt & 0xFFFE0C00) == (paramLong & 0xFFFFFFFFFFFE0C00L)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static d l(Metadata paramMetadata, long paramLong) {
    if (paramMetadata != null) {
      int i = paramMetadata.d();
      for (byte b = 0; b < i; b++) {
        Metadata.Entry entry = paramMetadata.c(b);
        if (entry instanceof MlltFrame)
          return d.a(paramLong, (MlltFrame)entry); 
      } 
    } 
    return null;
  }
  
  private f m(i parami) {
    // Byte code:
    //   0: new com/google/android/exoplayer2/util/v
    //   3: dup
    //   4: aload_0
    //   5: getfield f : Lcom/google/android/exoplayer2/c1/r;
    //   8: getfield j : I
    //   11: invokespecial <init> : (I)V
    //   14: astore_2
    //   15: aload_1
    //   16: aload_2
    //   17: getfield a : [B
    //   20: iconst_0
    //   21: aload_0
    //   22: getfield f : Lcom/google/android/exoplayer2/c1/r;
    //   25: getfield j : I
    //   28: invokeinterface k : ([BII)V
    //   33: aload_0
    //   34: getfield f : Lcom/google/android/exoplayer2/c1/r;
    //   37: astore_3
    //   38: aload_3
    //   39: getfield h : I
    //   42: istore #4
    //   44: aload_3
    //   45: getfield l : I
    //   48: istore #5
    //   50: iload #4
    //   52: iconst_1
    //   53: iand
    //   54: ifeq -> 70
    //   57: iload #5
    //   59: iconst_1
    //   60: if_icmpeq -> 76
    //   63: bipush #36
    //   65: istore #4
    //   67: goto -> 87
    //   70: iload #5
    //   72: iconst_1
    //   73: if_icmpeq -> 83
    //   76: bipush #21
    //   78: istore #4
    //   80: goto -> 87
    //   83: bipush #13
    //   85: istore #4
    //   87: aload_2
    //   88: iload #4
    //   90: invokestatic d : (Lcom/google/android/exoplayer2/util/v;I)I
    //   93: istore #5
    //   95: iload #5
    //   97: ldc 1483304551
    //   99: if_icmpeq -> 167
    //   102: iload #5
    //   104: ldc 1231971951
    //   106: if_icmpne -> 112
    //   109: goto -> 167
    //   112: iload #5
    //   114: ldc 1447187017
    //   116: if_icmpne -> 156
    //   119: aload_1
    //   120: invokeinterface getLength : ()J
    //   125: aload_1
    //   126: invokeinterface a : ()J
    //   131: aload_0
    //   132: getfield f : Lcom/google/android/exoplayer2/c1/r;
    //   135: aload_2
    //   136: invokestatic a : (JJLcom/google/android/exoplayer2/c1/r;Lcom/google/android/exoplayer2/util/v;)Lcom/google/android/exoplayer2/c1/b0/g;
    //   139: astore_3
    //   140: aload_1
    //   141: aload_0
    //   142: getfield f : Lcom/google/android/exoplayer2/c1/r;
    //   145: getfield j : I
    //   148: invokeinterface i : (I)V
    //   153: goto -> 303
    //   156: aconst_null
    //   157: astore_3
    //   158: aload_1
    //   159: invokeinterface h : ()V
    //   164: goto -> 303
    //   167: aload_1
    //   168: invokeinterface getLength : ()J
    //   173: aload_1
    //   174: invokeinterface a : ()J
    //   179: aload_0
    //   180: getfield f : Lcom/google/android/exoplayer2/c1/r;
    //   183: aload_2
    //   184: invokestatic a : (JJLcom/google/android/exoplayer2/c1/r;Lcom/google/android/exoplayer2/util/v;)Lcom/google/android/exoplayer2/c1/b0/h;
    //   187: astore_2
    //   188: aload_2
    //   189: ifnull -> 258
    //   192: aload_0
    //   193: getfield g : Lcom/google/android/exoplayer2/c1/p;
    //   196: invokevirtual a : ()Z
    //   199: ifne -> 258
    //   202: aload_1
    //   203: invokeinterface h : ()V
    //   208: aload_1
    //   209: iload #4
    //   211: sipush #141
    //   214: iadd
    //   215: invokeinterface e : (I)V
    //   220: aload_1
    //   221: aload_0
    //   222: getfield e : Lcom/google/android/exoplayer2/util/v;
    //   225: getfield a : [B
    //   228: iconst_0
    //   229: iconst_3
    //   230: invokeinterface k : ([BII)V
    //   235: aload_0
    //   236: getfield e : Lcom/google/android/exoplayer2/util/v;
    //   239: iconst_0
    //   240: invokevirtual M : (I)V
    //   243: aload_0
    //   244: getfield g : Lcom/google/android/exoplayer2/c1/p;
    //   247: aload_0
    //   248: getfield e : Lcom/google/android/exoplayer2/util/v;
    //   251: invokevirtual C : ()I
    //   254: invokevirtual d : (I)Z
    //   257: pop
    //   258: aload_1
    //   259: aload_0
    //   260: getfield f : Lcom/google/android/exoplayer2/c1/r;
    //   263: getfield j : I
    //   266: invokeinterface i : (I)V
    //   271: aload_2
    //   272: astore_3
    //   273: aload_2
    //   274: ifnull -> 303
    //   277: aload_2
    //   278: astore_3
    //   279: aload_2
    //   280: invokeinterface b : ()Z
    //   285: ifne -> 303
    //   288: aload_2
    //   289: astore_3
    //   290: iload #5
    //   292: ldc 1231971951
    //   294: if_icmpne -> 303
    //   297: aload_0
    //   298: aload_1
    //   299: invokespecial c : (Lcom/google/android/exoplayer2/c1/i;)Lcom/google/android/exoplayer2/c1/b0/f;
    //   302: areturn
    //   303: aload_3
    //   304: areturn
  }
  
  private boolean n(i parami) {
    f f1 = this.m;
    if (f1 != null) {
      long l1 = f1.d();
      if (l1 != -1L && parami.d() > l1 - 4L)
        return true; 
    } 
    try {
      boolean bool = parami.c(this.e.a, 0, 4, true);
      return bool ^ true;
    } catch (EOFException eOFException) {
      return true;
    } 
  }
  
  private int o(i parami) {
    if (this.r == 0) {
      parami.h();
      if (n(parami))
        return -1; 
      this.e.M(0);
      int m = this.e.k();
      if (!f(m, this.k) || r.b(m) == -1) {
        parami.i(1);
        this.k = 0;
        return 0;
      } 
      r.e(m, this.f);
      if (this.o == -9223372036854775807L) {
        this.o = this.m.f(parami.a());
        if (this.d != -9223372036854775807L) {
          long l3 = this.m.f(0L);
          this.o += this.d - l3;
        } 
      } 
      this.r = this.f.j;
    } 
    int k = this.j.a(parami, this.r, true);
    if (k == -1)
      return -1; 
    k = this.r - k;
    this.r = k;
    if (k > 0)
      return 0; 
    long l1 = this.o;
    long l2 = this.p;
    r r1 = this.f;
    l2 = l2 * 1000000L / r1.k;
    this.j.c(l1 + l2, 1, r1.j, 0, null);
    this.p += this.f.n;
    this.r = 0;
    return 0;
  }
  
  private boolean p(i parami, boolean paramBoolean) {
    // Byte code:
    //   0: iload_2
    //   1: ifeq -> 11
    //   4: sipush #16384
    //   7: istore_3
    //   8: goto -> 14
    //   11: ldc 131072
    //   13: istore_3
    //   14: aload_1
    //   15: invokeinterface h : ()V
    //   20: aload_1
    //   21: invokeinterface a : ()J
    //   26: lconst_0
    //   27: lcmp
    //   28: ifne -> 122
    //   31: aload_0
    //   32: getfield c : I
    //   35: iconst_2
    //   36: iand
    //   37: ifne -> 46
    //   40: iconst_1
    //   41: istore #4
    //   43: goto -> 49
    //   46: iconst_0
    //   47: istore #4
    //   49: iload #4
    //   51: ifeq -> 60
    //   54: aconst_null
    //   55: astore #5
    //   57: goto -> 65
    //   60: getstatic com/google/android/exoplayer2/c1/b0/e.b : Lcom/google/android/exoplayer2/metadata/id3/b$a;
    //   63: astore #5
    //   65: aload_0
    //   66: getfield h : Lcom/google/android/exoplayer2/c1/q;
    //   69: aload_1
    //   70: aload #5
    //   72: invokevirtual a : (Lcom/google/android/exoplayer2/c1/i;Lcom/google/android/exoplayer2/metadata/id3/b$a;)Lcom/google/android/exoplayer2/metadata/Metadata;
    //   75: astore #5
    //   77: aload_0
    //   78: aload #5
    //   80: putfield l : Lcom/google/android/exoplayer2/metadata/Metadata;
    //   83: aload #5
    //   85: ifnull -> 98
    //   88: aload_0
    //   89: getfield g : Lcom/google/android/exoplayer2/c1/p;
    //   92: aload #5
    //   94: invokevirtual c : (Lcom/google/android/exoplayer2/metadata/Metadata;)Z
    //   97: pop
    //   98: aload_1
    //   99: invokeinterface d : ()J
    //   104: l2i
    //   105: istore #6
    //   107: iload_2
    //   108: ifne -> 119
    //   111: aload_1
    //   112: iload #6
    //   114: invokeinterface i : (I)V
    //   119: goto -> 125
    //   122: iconst_0
    //   123: istore #6
    //   125: iconst_0
    //   126: istore #4
    //   128: iconst_0
    //   129: istore #7
    //   131: iconst_0
    //   132: istore #8
    //   134: aload_0
    //   135: aload_1
    //   136: invokespecial n : (Lcom/google/android/exoplayer2/c1/i;)Z
    //   139: ifeq -> 158
    //   142: iload #7
    //   144: ifle -> 150
    //   147: goto -> 315
    //   150: new java/io/EOFException
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: athrow
    //   158: aload_0
    //   159: getfield e : Lcom/google/android/exoplayer2/util/v;
    //   162: iconst_0
    //   163: invokevirtual M : (I)V
    //   166: aload_0
    //   167: getfield e : Lcom/google/android/exoplayer2/util/v;
    //   170: invokevirtual k : ()I
    //   173: istore #9
    //   175: iload #4
    //   177: ifeq -> 191
    //   180: iload #9
    //   182: iload #4
    //   184: i2l
    //   185: invokestatic f : (IJ)Z
    //   188: ifeq -> 204
    //   191: iload #9
    //   193: invokestatic b : (I)I
    //   196: istore #10
    //   198: iload #10
    //   200: iconst_m1
    //   201: if_icmpne -> 276
    //   204: iload #8
    //   206: iconst_1
    //   207: iadd
    //   208: istore #4
    //   210: iload #8
    //   212: iload_3
    //   213: if_icmpne -> 232
    //   216: iload_2
    //   217: ifeq -> 222
    //   220: iconst_0
    //   221: ireturn
    //   222: new com/google/android/exoplayer2/ParserException
    //   225: dup
    //   226: ldc 'Searched too many bytes.'
    //   228: invokespecial <init> : (Ljava/lang/String;)V
    //   231: athrow
    //   232: iload_2
    //   233: ifeq -> 256
    //   236: aload_1
    //   237: invokeinterface h : ()V
    //   242: aload_1
    //   243: iload #6
    //   245: iload #4
    //   247: iadd
    //   248: invokeinterface e : (I)V
    //   253: goto -> 263
    //   256: aload_1
    //   257: iconst_1
    //   258: invokeinterface i : (I)V
    //   263: iload #4
    //   265: istore #8
    //   267: iconst_0
    //   268: istore #4
    //   270: iconst_0
    //   271: istore #7
    //   273: goto -> 134
    //   276: iload #7
    //   278: iconst_1
    //   279: iadd
    //   280: istore #11
    //   282: iload #11
    //   284: iconst_1
    //   285: if_icmpne -> 305
    //   288: iload #9
    //   290: aload_0
    //   291: getfield f : Lcom/google/android/exoplayer2/c1/r;
    //   294: invokestatic e : (ILcom/google/android/exoplayer2/c1/r;)Z
    //   297: pop
    //   298: iload #9
    //   300: istore #7
    //   302: goto -> 347
    //   305: iload #4
    //   307: istore #7
    //   309: iload #11
    //   311: iconst_4
    //   312: if_icmpne -> 347
    //   315: iload_2
    //   316: ifeq -> 333
    //   319: aload_1
    //   320: iload #6
    //   322: iload #8
    //   324: iadd
    //   325: invokeinterface i : (I)V
    //   330: goto -> 339
    //   333: aload_1
    //   334: invokeinterface h : ()V
    //   339: aload_0
    //   340: iload #4
    //   342: putfield k : I
    //   345: iconst_1
    //   346: ireturn
    //   347: aload_1
    //   348: iload #10
    //   350: iconst_4
    //   351: isub
    //   352: invokeinterface e : (I)V
    //   357: iload #7
    //   359: istore #4
    //   361: iload #11
    //   363: istore #7
    //   365: goto -> 134
  }
  
  public void a() {}
  
  public void b() {
    this.n = true;
  }
  
  public boolean e(i parami) {
    return p(parami, true);
  }
  
  public int g(i parami, s params) {
    if (this.k == 0)
      try {
        p(parami, false);
      } catch (EOFException eOFException) {
        return -1;
      }  
    if (this.m == null) {
      Metadata metadata;
      f f1 = m((i)eOFException);
      d d = l(this.l, eOFException.a());
      if (this.n) {
        this.m = new f.a();
      } else {
        if (d != null) {
          this.m = d;
        } else if (f1 != null) {
          this.m = f1;
        } 
        f1 = this.m;
        if (f1 == null || (!f1.b() && (this.c & 0x1) != 0))
          this.m = c((i)eOFException); 
      } 
      this.i.a(this.m);
      v v1 = this.j;
      r r1 = this.f;
      String str = r1.i;
      int k = r1.l;
      int m = r1.k;
      p p1 = this.g;
      int n = p1.b;
      int i1 = p1.c;
      if ((this.c & 0x2) != 0) {
        p1 = null;
      } else {
        metadata = this.l;
      } 
      v1.d(Format.n(null, str, null, -1, 4096, k, m, -1, n, i1, null, null, 0, null, metadata));
      this.q = eOFException.a();
    } else if (this.q != 0L) {
      long l1 = eOFException.a();
      long l2 = this.q;
      if (l1 < l2)
        eOFException.i((int)(l2 - l1)); 
    } 
    return o((i)eOFException);
  }
  
  public void h(j paramj) {
    this.i = paramj;
    this.j = paramj.g(0, 1);
    this.i.f();
  }
  
  public void i(long paramLong1, long paramLong2) {
    this.k = 0;
    this.o = -9223372036854775807L;
    this.p = 0L;
    this.r = 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/b0/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */