package com.google.android.exoplayer2.c1.d0;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.j;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.util.v;
import com.google.android.exoplayer2.util.w;
import java.util.ArrayList;
import java.util.Arrays;

public final class q implements o {
  private final c0 a;
  
  private final boolean b;
  
  private final boolean c;
  
  private final v d;
  
  private final v e;
  
  private final v f;
  
  private long g;
  
  private final boolean[] h;
  
  private String i;
  
  private v j;
  
  private b k;
  
  private boolean l;
  
  private long m;
  
  private boolean n;
  
  private final v o;
  
  public q(c0 paramc0, boolean paramBoolean1, boolean paramBoolean2) {
    this.a = paramc0;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.h = new boolean[3];
    this.d = new v(7, 128);
    this.e = new v(8, 128);
    this.f = new v(6, 128);
    this.o = new v();
  }
  
  private void a(long paramLong1, int paramInt1, int paramInt2, long paramLong2) {
    if (!this.l || this.k.c()) {
      this.d.b(paramInt2);
      this.e.b(paramInt2);
      if (!this.l) {
        if (this.d.c() && this.e.c()) {
          ArrayList<byte[]> arrayList = new ArrayList();
          v v1 = this.d;
          arrayList.add(Arrays.copyOf(v1.d, v1.e));
          v1 = this.e;
          arrayList.add(Arrays.copyOf(v1.d, v1.e));
          v1 = this.d;
          s.b b1 = s.i(v1.d, 3, v1.e);
          v v2 = this.e;
          s.a a = s.h(v2.d, 3, v2.e);
          this.j.d(Format.D(this.i, "video/avc", g.b(b1.a, b1.b, b1.c), -1, -1, b1.e, b1.f, -1.0F, arrayList, -1, b1.g, null));
          this.l = true;
          this.k.f(b1);
          this.k.e(a);
          this.d.d();
          this.e.d();
        } 
      } else if (this.d.c()) {
        v v1 = this.d;
        s.b b1 = s.i(v1.d, 3, v1.e);
        this.k.f(b1);
        this.d.d();
      } else if (this.e.c()) {
        v v1 = this.e;
        s.a a = s.h(v1.d, 3, v1.e);
        this.k.e(a);
        this.e.d();
      } 
    } 
    if (this.f.b(paramInt2)) {
      v v1 = this.f;
      paramInt2 = s.k(v1.d, v1.e);
      this.o.K(this.f.d, paramInt2);
      this.o.M(4);
      this.a.a(paramLong2, this.o);
    } 
    if (this.k.b(paramLong1, paramInt1, this.l, this.n))
      this.n = false; 
  }
  
  private void g(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (!this.l || this.k.c()) {
      this.d.a(paramArrayOfbyte, paramInt1, paramInt2);
      this.e.a(paramArrayOfbyte, paramInt1, paramInt2);
    } 
    this.f.a(paramArrayOfbyte, paramInt1, paramInt2);
    this.k.a(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private void h(long paramLong1, int paramInt, long paramLong2) {
    if (!this.l || this.k.c()) {
      this.d.e(paramInt);
      this.e.e(paramInt);
    } 
    this.f.e(paramInt);
    this.k.h(paramLong1, paramInt, paramLong2);
  }
  
  public void b(v paramv) {
    int i = paramv.c();
    int j = paramv.d();
    byte[] arrayOfByte = paramv.a;
    this.g += paramv.a();
    this.j.b(paramv, paramv.a());
    while (true) {
      int k = s.c(arrayOfByte, i, j, this.h);
      if (k == j) {
        g(arrayOfByte, i, j);
        return;
      } 
      int m = s.f(arrayOfByte, k);
      int n = k - i;
      if (n > 0)
        g(arrayOfByte, i, k); 
      int i1 = j - k;
      long l = this.g - i1;
      if (n < 0) {
        i = -n;
      } else {
        i = 0;
      } 
      a(l, i1, i, this.m);
      h(l, m, this.m);
      i = k + 3;
    } 
  }
  
  public void c() {
    s.a(this.h);
    this.d.d();
    this.e.d();
    this.f.d();
    this.k.g();
    this.g = 0L;
    this.n = false;
  }
  
  public void d() {}
  
  public void e(j paramj, h0.d paramd) {
    paramd.a();
    this.i = paramd.b();
    v v1 = paramj.g(paramd.c(), 2);
    this.j = v1;
    this.k = new b(v1, this.b, this.c);
    this.a.b(paramj, paramd);
  }
  
  public void f(long paramLong, int paramInt) {
    this.m = paramLong;
    int i = this.n;
    if ((paramInt & 0x2) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    this.n = i | paramInt;
  }
  
  private static final class b {
    private final v a;
    
    private final boolean b;
    
    private final boolean c;
    
    private final SparseArray<s.b> d;
    
    private final SparseArray<s.a> e;
    
    private final w f;
    
    private byte[] g;
    
    private int h;
    
    private int i;
    
    private long j;
    
    private boolean k;
    
    private long l;
    
    private a m;
    
    private a n;
    
    private boolean o;
    
    private long p;
    
    private long q;
    
    private boolean r;
    
    public b(v param1v, boolean param1Boolean1, boolean param1Boolean2) {
      this.a = param1v;
      this.b = param1Boolean1;
      this.c = param1Boolean2;
      this.d = new SparseArray();
      this.e = new SparseArray();
      this.m = new a(null);
      this.n = new a(null);
      byte[] arrayOfByte = new byte[128];
      this.g = arrayOfByte;
      this.f = new w(arrayOfByte, 0, 0);
      g();
    }
    
    private void d(int param1Int) {
      boolean bool = this.r;
      int i = (int)(this.j - this.p);
      this.a.c(this.q, bool, i, param1Int, null);
    }
    
    public void a(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      // Byte code:
      //   0: aload_0
      //   1: getfield k : Z
      //   4: ifne -> 8
      //   7: return
      //   8: iload_3
      //   9: iload_2
      //   10: isub
      //   11: istore #4
      //   13: aload_0
      //   14: getfield g : [B
      //   17: astore #5
      //   19: aload #5
      //   21: arraylength
      //   22: istore #6
      //   24: aload_0
      //   25: getfield h : I
      //   28: istore_3
      //   29: iload #6
      //   31: iload_3
      //   32: iload #4
      //   34: iadd
      //   35: if_icmpge -> 53
      //   38: aload_0
      //   39: aload #5
      //   41: iload_3
      //   42: iload #4
      //   44: iadd
      //   45: iconst_2
      //   46: imul
      //   47: invokestatic copyOf : ([BI)[B
      //   50: putfield g : [B
      //   53: aload_1
      //   54: iload_2
      //   55: aload_0
      //   56: getfield g : [B
      //   59: aload_0
      //   60: getfield h : I
      //   63: iload #4
      //   65: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
      //   68: aload_0
      //   69: getfield h : I
      //   72: iload #4
      //   74: iadd
      //   75: istore_2
      //   76: aload_0
      //   77: iload_2
      //   78: putfield h : I
      //   81: aload_0
      //   82: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   85: aload_0
      //   86: getfield g : [B
      //   89: iconst_0
      //   90: iload_2
      //   91: invokevirtual i : ([BII)V
      //   94: aload_0
      //   95: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   98: bipush #8
      //   100: invokevirtual b : (I)Z
      //   103: ifne -> 107
      //   106: return
      //   107: aload_0
      //   108: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   111: invokevirtual k : ()V
      //   114: aload_0
      //   115: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   118: iconst_2
      //   119: invokevirtual e : (I)I
      //   122: istore #7
      //   124: aload_0
      //   125: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   128: iconst_5
      //   129: invokevirtual l : (I)V
      //   132: aload_0
      //   133: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   136: invokevirtual c : ()Z
      //   139: ifne -> 143
      //   142: return
      //   143: aload_0
      //   144: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   147: invokevirtual h : ()I
      //   150: pop
      //   151: aload_0
      //   152: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   155: invokevirtual c : ()Z
      //   158: ifne -> 162
      //   161: return
      //   162: aload_0
      //   163: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   166: invokevirtual h : ()I
      //   169: istore #8
      //   171: aload_0
      //   172: getfield c : Z
      //   175: ifne -> 193
      //   178: aload_0
      //   179: iconst_0
      //   180: putfield k : Z
      //   183: aload_0
      //   184: getfield n : Lcom/google/android/exoplayer2/c1/d0/q$b$a;
      //   187: iload #8
      //   189: invokevirtual f : (I)V
      //   192: return
      //   193: aload_0
      //   194: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   197: invokevirtual c : ()Z
      //   200: ifne -> 204
      //   203: return
      //   204: aload_0
      //   205: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   208: invokevirtual h : ()I
      //   211: istore #9
      //   213: aload_0
      //   214: getfield e : Landroid/util/SparseArray;
      //   217: iload #9
      //   219: invokevirtual indexOfKey : (I)I
      //   222: ifge -> 231
      //   225: aload_0
      //   226: iconst_0
      //   227: putfield k : Z
      //   230: return
      //   231: aload_0
      //   232: getfield e : Landroid/util/SparseArray;
      //   235: iload #9
      //   237: invokevirtual get : (I)Ljava/lang/Object;
      //   240: checkcast com/google/android/exoplayer2/util/s$a
      //   243: astore_1
      //   244: aload_0
      //   245: getfield d : Landroid/util/SparseArray;
      //   248: aload_1
      //   249: getfield b : I
      //   252: invokevirtual get : (I)Ljava/lang/Object;
      //   255: checkcast com/google/android/exoplayer2/util/s$b
      //   258: astore #5
      //   260: aload #5
      //   262: getfield h : Z
      //   265: ifeq -> 288
      //   268: aload_0
      //   269: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   272: iconst_2
      //   273: invokevirtual b : (I)Z
      //   276: ifne -> 280
      //   279: return
      //   280: aload_0
      //   281: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   284: iconst_2
      //   285: invokevirtual l : (I)V
      //   288: aload_0
      //   289: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   292: aload #5
      //   294: getfield j : I
      //   297: invokevirtual b : (I)Z
      //   300: ifne -> 304
      //   303: return
      //   304: aload_0
      //   305: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   308: aload #5
      //   310: getfield j : I
      //   313: invokevirtual e : (I)I
      //   316: istore #10
      //   318: aload #5
      //   320: getfield i : Z
      //   323: ifne -> 382
      //   326: aload_0
      //   327: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   330: iconst_1
      //   331: invokevirtual b : (I)Z
      //   334: ifne -> 338
      //   337: return
      //   338: aload_0
      //   339: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   342: invokevirtual d : ()Z
      //   345: istore #11
      //   347: iload #11
      //   349: ifeq -> 379
      //   352: aload_0
      //   353: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   356: iconst_1
      //   357: invokevirtual b : (I)Z
      //   360: ifne -> 364
      //   363: return
      //   364: aload_0
      //   365: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   368: invokevirtual d : ()Z
      //   371: istore #12
      //   373: iconst_1
      //   374: istore #13
      //   376: goto -> 391
      //   379: goto -> 385
      //   382: iconst_0
      //   383: istore #11
      //   385: iconst_0
      //   386: istore #13
      //   388: iconst_0
      //   389: istore #12
      //   391: aload_0
      //   392: getfield i : I
      //   395: iconst_5
      //   396: if_icmpne -> 405
      //   399: iconst_1
      //   400: istore #14
      //   402: goto -> 408
      //   405: iconst_0
      //   406: istore #14
      //   408: iload #14
      //   410: ifeq -> 436
      //   413: aload_0
      //   414: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   417: invokevirtual c : ()Z
      //   420: ifne -> 424
      //   423: return
      //   424: aload_0
      //   425: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   428: invokevirtual h : ()I
      //   431: istore #4
      //   433: goto -> 439
      //   436: iconst_0
      //   437: istore #4
      //   439: aload #5
      //   441: getfield k : I
      //   444: istore_2
      //   445: iload_2
      //   446: ifne -> 515
      //   449: aload_0
      //   450: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   453: aload #5
      //   455: getfield l : I
      //   458: invokevirtual b : (I)Z
      //   461: ifne -> 465
      //   464: return
      //   465: aload_0
      //   466: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   469: aload #5
      //   471: getfield l : I
      //   474: invokevirtual e : (I)I
      //   477: istore_2
      //   478: aload_1
      //   479: getfield c : Z
      //   482: ifeq -> 512
      //   485: iload #11
      //   487: ifne -> 512
      //   490: aload_0
      //   491: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   494: invokevirtual c : ()Z
      //   497: ifne -> 501
      //   500: return
      //   501: aload_0
      //   502: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   505: invokevirtual g : ()I
      //   508: istore_3
      //   509: goto -> 598
      //   512: goto -> 596
      //   515: iload_2
      //   516: iconst_1
      //   517: if_icmpne -> 594
      //   520: aload #5
      //   522: getfield m : Z
      //   525: ifne -> 594
      //   528: aload_0
      //   529: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   532: invokevirtual c : ()Z
      //   535: ifne -> 539
      //   538: return
      //   539: aload_0
      //   540: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   543: invokevirtual g : ()I
      //   546: istore #6
      //   548: aload_1
      //   549: getfield c : Z
      //   552: ifeq -> 587
      //   555: iload #11
      //   557: ifne -> 587
      //   560: aload_0
      //   561: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   564: invokevirtual c : ()Z
      //   567: ifne -> 571
      //   570: return
      //   571: aload_0
      //   572: getfield f : Lcom/google/android/exoplayer2/util/w;
      //   575: invokevirtual g : ()I
      //   578: istore #15
      //   580: iconst_0
      //   581: istore_2
      //   582: iconst_0
      //   583: istore_3
      //   584: goto -> 604
      //   587: iconst_0
      //   588: istore_2
      //   589: iconst_0
      //   590: istore_3
      //   591: goto -> 601
      //   594: iconst_0
      //   595: istore_2
      //   596: iconst_0
      //   597: istore_3
      //   598: iconst_0
      //   599: istore #6
      //   601: iconst_0
      //   602: istore #15
      //   604: aload_0
      //   605: getfield n : Lcom/google/android/exoplayer2/c1/d0/q$b$a;
      //   608: aload #5
      //   610: iload #7
      //   612: iload #8
      //   614: iload #10
      //   616: iload #9
      //   618: iload #11
      //   620: iload #13
      //   622: iload #12
      //   624: iload #14
      //   626: iload #4
      //   628: iload_2
      //   629: iload_3
      //   630: iload #6
      //   632: iload #15
      //   634: invokevirtual e : (Lcom/google/android/exoplayer2/util/s$b;IIIIZZZZIIIII)V
      //   637: aload_0
      //   638: iconst_0
      //   639: putfield k : Z
      //   642: return
    }
    
    public boolean b(long param1Long, int param1Int, int param1Boolean1, boolean param1Boolean2) {
      int i;
      int j = this.i;
      int k = 0;
      if (j == 9 || (this.c && a.a(this.n, this.m))) {
        if (param1Boolean1 && this.o)
          d(param1Int + (int)(param1Long - this.j)); 
        this.p = this.j;
        this.q = this.l;
        this.r = false;
        this.o = true;
      } 
      if (this.b)
        param1Boolean2 = this.n.d(); 
      param1Boolean1 = this.r;
      j = this.i;
      if (j != 5) {
        param1Int = k;
        if (param1Boolean2) {
          param1Int = k;
          if (j == 1) {
            param1Int = 1;
            i = param1Boolean1 | param1Int;
            this.r = i;
            return i;
          } 
        } 
        i |= param1Int;
        this.r = i;
        return i;
      } 
      byte b1 = 1;
      i |= b1;
      this.r = i;
      return i;
    }
    
    public boolean c() {
      return this.c;
    }
    
    public void e(s.a param1a) {
      this.e.append(param1a.a, param1a);
    }
    
    public void f(s.b param1b) {
      this.d.append(param1b.d, param1b);
    }
    
    public void g() {
      this.k = false;
      this.o = false;
      this.n.b();
    }
    
    public void h(long param1Long1, int param1Int, long param1Long2) {
      this.i = param1Int;
      this.l = param1Long2;
      this.j = param1Long1;
      if ((this.b && param1Int == 1) || (this.c && (param1Int == 5 || param1Int == 1 || param1Int == 2))) {
        a a1 = this.m;
        this.m = this.n;
        this.n = a1;
        a1.b();
        this.h = 0;
        this.k = true;
      } 
    }
    
    private static final class a {
      private boolean a;
      
      private boolean b;
      
      private s.b c;
      
      private int d;
      
      private int e;
      
      private int f;
      
      private int g;
      
      private boolean h;
      
      private boolean i;
      
      private boolean j;
      
      private boolean k;
      
      private int l;
      
      private int m;
      
      private int n;
      
      private int o;
      
      private int p;
      
      private a() {}
      
      private boolean c(a param2a) {
        // Byte code:
        //   0: aload_0
        //   1: getfield a : Z
        //   4: istore_2
        //   5: iconst_1
        //   6: istore_3
        //   7: iload_2
        //   8: ifeq -> 259
        //   11: iload_3
        //   12: istore_2
        //   13: aload_1
        //   14: getfield a : Z
        //   17: ifeq -> 261
        //   20: iload_3
        //   21: istore_2
        //   22: aload_0
        //   23: getfield f : I
        //   26: aload_1
        //   27: getfield f : I
        //   30: if_icmpne -> 261
        //   33: iload_3
        //   34: istore_2
        //   35: aload_0
        //   36: getfield g : I
        //   39: aload_1
        //   40: getfield g : I
        //   43: if_icmpne -> 261
        //   46: iload_3
        //   47: istore_2
        //   48: aload_0
        //   49: getfield h : Z
        //   52: aload_1
        //   53: getfield h : Z
        //   56: if_icmpne -> 261
        //   59: aload_0
        //   60: getfield i : Z
        //   63: ifeq -> 86
        //   66: aload_1
        //   67: getfield i : Z
        //   70: ifeq -> 86
        //   73: iload_3
        //   74: istore_2
        //   75: aload_0
        //   76: getfield j : Z
        //   79: aload_1
        //   80: getfield j : Z
        //   83: if_icmpne -> 261
        //   86: aload_0
        //   87: getfield d : I
        //   90: istore #4
        //   92: aload_1
        //   93: getfield d : I
        //   96: istore #5
        //   98: iload #4
        //   100: iload #5
        //   102: if_icmpeq -> 119
        //   105: iload_3
        //   106: istore_2
        //   107: iload #4
        //   109: ifeq -> 261
        //   112: iload_3
        //   113: istore_2
        //   114: iload #5
        //   116: ifeq -> 261
        //   119: aload_0
        //   120: getfield c : Lcom/google/android/exoplayer2/util/s$b;
        //   123: getfield k : I
        //   126: istore #5
        //   128: iload #5
        //   130: ifne -> 169
        //   133: aload_1
        //   134: getfield c : Lcom/google/android/exoplayer2/util/s$b;
        //   137: getfield k : I
        //   140: ifne -> 169
        //   143: iload_3
        //   144: istore_2
        //   145: aload_0
        //   146: getfield m : I
        //   149: aload_1
        //   150: getfield m : I
        //   153: if_icmpne -> 261
        //   156: iload_3
        //   157: istore_2
        //   158: aload_0
        //   159: getfield n : I
        //   162: aload_1
        //   163: getfield n : I
        //   166: if_icmpne -> 261
        //   169: iload #5
        //   171: iconst_1
        //   172: if_icmpne -> 212
        //   175: aload_1
        //   176: getfield c : Lcom/google/android/exoplayer2/util/s$b;
        //   179: getfield k : I
        //   182: iconst_1
        //   183: if_icmpne -> 212
        //   186: iload_3
        //   187: istore_2
        //   188: aload_0
        //   189: getfield o : I
        //   192: aload_1
        //   193: getfield o : I
        //   196: if_icmpne -> 261
        //   199: iload_3
        //   200: istore_2
        //   201: aload_0
        //   202: getfield p : I
        //   205: aload_1
        //   206: getfield p : I
        //   209: if_icmpne -> 261
        //   212: aload_0
        //   213: getfield k : Z
        //   216: istore #6
        //   218: aload_1
        //   219: getfield k : Z
        //   222: istore #7
        //   224: iload_3
        //   225: istore_2
        //   226: iload #6
        //   228: iload #7
        //   230: if_icmpne -> 261
        //   233: iload #6
        //   235: ifeq -> 259
        //   238: iload #7
        //   240: ifeq -> 259
        //   243: aload_0
        //   244: getfield l : I
        //   247: aload_1
        //   248: getfield l : I
        //   251: if_icmpeq -> 259
        //   254: iload_3
        //   255: istore_2
        //   256: goto -> 261
        //   259: iconst_0
        //   260: istore_2
        //   261: iload_2
        //   262: ireturn
      }
      
      public void b() {
        this.b = false;
        this.a = false;
      }
      
      public boolean d() {
        if (this.b) {
          int i = this.e;
          if (i == 7 || i == 2)
            return true; 
        } 
        return false;
      }
      
      public void e(s.b param2b, int param2Int1, int param2Int2, int param2Int3, int param2Int4, boolean param2Boolean1, boolean param2Boolean2, boolean param2Boolean3, boolean param2Boolean4, int param2Int5, int param2Int6, int param2Int7, int param2Int8, int param2Int9) {
        this.c = param2b;
        this.d = param2Int1;
        this.e = param2Int2;
        this.f = param2Int3;
        this.g = param2Int4;
        this.h = param2Boolean1;
        this.i = param2Boolean2;
        this.j = param2Boolean3;
        this.k = param2Boolean4;
        this.l = param2Int5;
        this.m = param2Int6;
        this.n = param2Int7;
        this.o = param2Int8;
        this.p = param2Int9;
        this.a = true;
        this.b = true;
      }
      
      public void f(int param2Int) {
        this.e = param2Int;
        this.b = true;
      }
    }
  }
  
  private static final class a {
    private boolean a;
    
    private boolean b;
    
    private s.b c;
    
    private int d;
    
    private int e;
    
    private int f;
    
    private int g;
    
    private boolean h;
    
    private boolean i;
    
    private boolean j;
    
    private boolean k;
    
    private int l;
    
    private int m;
    
    private int n;
    
    private int o;
    
    private int p;
    
    private a() {}
    
    private boolean c(a param1a) {
      // Byte code:
      //   0: aload_0
      //   1: getfield a : Z
      //   4: istore_2
      //   5: iconst_1
      //   6: istore_3
      //   7: iload_2
      //   8: ifeq -> 259
      //   11: iload_3
      //   12: istore_2
      //   13: aload_1
      //   14: getfield a : Z
      //   17: ifeq -> 261
      //   20: iload_3
      //   21: istore_2
      //   22: aload_0
      //   23: getfield f : I
      //   26: aload_1
      //   27: getfield f : I
      //   30: if_icmpne -> 261
      //   33: iload_3
      //   34: istore_2
      //   35: aload_0
      //   36: getfield g : I
      //   39: aload_1
      //   40: getfield g : I
      //   43: if_icmpne -> 261
      //   46: iload_3
      //   47: istore_2
      //   48: aload_0
      //   49: getfield h : Z
      //   52: aload_1
      //   53: getfield h : Z
      //   56: if_icmpne -> 261
      //   59: aload_0
      //   60: getfield i : Z
      //   63: ifeq -> 86
      //   66: aload_1
      //   67: getfield i : Z
      //   70: ifeq -> 86
      //   73: iload_3
      //   74: istore_2
      //   75: aload_0
      //   76: getfield j : Z
      //   79: aload_1
      //   80: getfield j : Z
      //   83: if_icmpne -> 261
      //   86: aload_0
      //   87: getfield d : I
      //   90: istore #4
      //   92: aload_1
      //   93: getfield d : I
      //   96: istore #5
      //   98: iload #4
      //   100: iload #5
      //   102: if_icmpeq -> 119
      //   105: iload_3
      //   106: istore_2
      //   107: iload #4
      //   109: ifeq -> 261
      //   112: iload_3
      //   113: istore_2
      //   114: iload #5
      //   116: ifeq -> 261
      //   119: aload_0
      //   120: getfield c : Lcom/google/android/exoplayer2/util/s$b;
      //   123: getfield k : I
      //   126: istore #5
      //   128: iload #5
      //   130: ifne -> 169
      //   133: aload_1
      //   134: getfield c : Lcom/google/android/exoplayer2/util/s$b;
      //   137: getfield k : I
      //   140: ifne -> 169
      //   143: iload_3
      //   144: istore_2
      //   145: aload_0
      //   146: getfield m : I
      //   149: aload_1
      //   150: getfield m : I
      //   153: if_icmpne -> 261
      //   156: iload_3
      //   157: istore_2
      //   158: aload_0
      //   159: getfield n : I
      //   162: aload_1
      //   163: getfield n : I
      //   166: if_icmpne -> 261
      //   169: iload #5
      //   171: iconst_1
      //   172: if_icmpne -> 212
      //   175: aload_1
      //   176: getfield c : Lcom/google/android/exoplayer2/util/s$b;
      //   179: getfield k : I
      //   182: iconst_1
      //   183: if_icmpne -> 212
      //   186: iload_3
      //   187: istore_2
      //   188: aload_0
      //   189: getfield o : I
      //   192: aload_1
      //   193: getfield o : I
      //   196: if_icmpne -> 261
      //   199: iload_3
      //   200: istore_2
      //   201: aload_0
      //   202: getfield p : I
      //   205: aload_1
      //   206: getfield p : I
      //   209: if_icmpne -> 261
      //   212: aload_0
      //   213: getfield k : Z
      //   216: istore #6
      //   218: aload_1
      //   219: getfield k : Z
      //   222: istore #7
      //   224: iload_3
      //   225: istore_2
      //   226: iload #6
      //   228: iload #7
      //   230: if_icmpne -> 261
      //   233: iload #6
      //   235: ifeq -> 259
      //   238: iload #7
      //   240: ifeq -> 259
      //   243: aload_0
      //   244: getfield l : I
      //   247: aload_1
      //   248: getfield l : I
      //   251: if_icmpeq -> 259
      //   254: iload_3
      //   255: istore_2
      //   256: goto -> 261
      //   259: iconst_0
      //   260: istore_2
      //   261: iload_2
      //   262: ireturn
    }
    
    public void b() {
      this.b = false;
      this.a = false;
    }
    
    public boolean d() {
      if (this.b) {
        int i = this.e;
        if (i == 7 || i == 2)
          return true; 
      } 
      return false;
    }
    
    public void e(s.b param1b, int param1Int1, int param1Int2, int param1Int3, int param1Int4, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3, boolean param1Boolean4, int param1Int5, int param1Int6, int param1Int7, int param1Int8, int param1Int9) {
      this.c = param1b;
      this.d = param1Int1;
      this.e = param1Int2;
      this.f = param1Int3;
      this.g = param1Int4;
      this.h = param1Boolean1;
      this.i = param1Boolean2;
      this.j = param1Boolean3;
      this.k = param1Boolean4;
      this.l = param1Int5;
      this.m = param1Int6;
      this.n = param1Int7;
      this.o = param1Int8;
      this.p = param1Int9;
      this.a = true;
      this.b = true;
    }
    
    public void f(int param1Int) {
      this.e = param1Int;
      this.b = true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/d0/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */