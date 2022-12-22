package com.google.android.gms.internal.ads;

import java.util.Stack;

public final class bg2 implements ne2, se2 {
  private static final oe2 a = new ag2();
  
  private static final int b = wj2.k("qt  ");
  
  private final qj2 c = new qj2(pj2.a);
  
  private final qj2 d = new qj2(4);
  
  private final qj2 e = new qj2(16);
  
  private final Stack<if2> f = new Stack<if2>();
  
  private int g;
  
  private int h;
  
  private long i;
  
  private int j;
  
  private qj2 k;
  
  private int l;
  
  private int m;
  
  private pe2 n;
  
  private dg2[] o;
  
  private long p;
  
  private boolean q;
  
  private final void i(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Ljava/util/Stack;
    //   4: invokevirtual isEmpty : ()Z
    //   7: ifne -> 524
    //   10: aload_0
    //   11: getfield f : Ljava/util/Stack;
    //   14: invokevirtual peek : ()Ljava/lang/Object;
    //   17: checkcast com/google/android/gms/internal/ads/if2
    //   20: getfield Q0 : J
    //   23: lload_1
    //   24: lcmp
    //   25: ifne -> 524
    //   28: aload_0
    //   29: getfield f : Ljava/util/Stack;
    //   32: invokevirtual pop : ()Ljava/lang/Object;
    //   35: checkcast com/google/android/gms/internal/ads/if2
    //   38: astore_3
    //   39: aload_3
    //   40: getfield P0 : I
    //   43: getstatic com/google/android/gms/internal/ads/jf2.B : I
    //   46: if_icmpne -> 497
    //   49: ldc2_w -9223372036854775807
    //   52: lstore #4
    //   54: new java/util/ArrayList
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: astore #6
    //   63: ldc2_w 9223372036854775807
    //   66: lstore #7
    //   68: aconst_null
    //   69: astore #9
    //   71: new com/google/android/gms/internal/ads/re2
    //   74: dup
    //   75: invokespecial <init> : ()V
    //   78: astore #10
    //   80: aload_3
    //   81: getstatic com/google/android/gms/internal/ads/jf2.A0 : I
    //   84: invokevirtual f : (I)Lcom/google/android/gms/internal/ads/lf2;
    //   87: astore #11
    //   89: aload #11
    //   91: ifnull -> 126
    //   94: aload #11
    //   96: aload_0
    //   97: getfield q : Z
    //   100: invokestatic d : (Lcom/google/android/gms/internal/ads/lf2;Z)Lcom/google/android/gms/internal/ads/zzmh;
    //   103: astore #11
    //   105: aload #11
    //   107: astore #9
    //   109: aload #11
    //   111: ifnull -> 126
    //   114: aload #10
    //   116: aload #11
    //   118: invokevirtual a : (Lcom/google/android/gms/internal/ads/zzmh;)Z
    //   121: pop
    //   122: aload #11
    //   124: astore #9
    //   126: iconst_0
    //   127: istore #12
    //   129: aload #9
    //   131: astore #13
    //   133: iload #12
    //   135: aload_3
    //   136: getfield S0 : Ljava/util/List;
    //   139: invokeinterface size : ()I
    //   144: if_icmpge -> 433
    //   147: aload_3
    //   148: getfield S0 : Ljava/util/List;
    //   151: iload #12
    //   153: invokeinterface get : (I)Ljava/lang/Object;
    //   158: checkcast com/google/android/gms/internal/ads/if2
    //   161: astore #9
    //   163: aload #9
    //   165: getfield P0 : I
    //   168: getstatic com/google/android/gms/internal/ads/jf2.D : I
    //   171: if_icmpne -> 419
    //   174: aload #9
    //   176: aload_3
    //   177: getstatic com/google/android/gms/internal/ads/jf2.C : I
    //   180: invokevirtual f : (I)Lcom/google/android/gms/internal/ads/lf2;
    //   183: ldc2_w -9223372036854775807
    //   186: aconst_null
    //   187: aload_0
    //   188: getfield q : Z
    //   191: invokestatic b : (Lcom/google/android/gms/internal/ads/if2;Lcom/google/android/gms/internal/ads/lf2;JLcom/google/android/gms/internal/ads/zzjo;Z)Lcom/google/android/gms/internal/ads/fg2;
    //   194: astore #14
    //   196: aload #14
    //   198: ifnull -> 419
    //   201: aload #14
    //   203: aload #9
    //   205: getstatic com/google/android/gms/internal/ads/jf2.E : I
    //   208: invokevirtual g : (I)Lcom/google/android/gms/internal/ads/if2;
    //   211: getstatic com/google/android/gms/internal/ads/jf2.F : I
    //   214: invokevirtual g : (I)Lcom/google/android/gms/internal/ads/if2;
    //   217: getstatic com/google/android/gms/internal/ads/jf2.G : I
    //   220: invokevirtual g : (I)Lcom/google/android/gms/internal/ads/if2;
    //   223: aload #10
    //   225: invokestatic c : (Lcom/google/android/gms/internal/ads/fg2;Lcom/google/android/gms/internal/ads/if2;Lcom/google/android/gms/internal/ads/re2;)Lcom/google/android/gms/internal/ads/gg2;
    //   228: astore #15
    //   230: aload #15
    //   232: getfield a : I
    //   235: ifeq -> 419
    //   238: new com/google/android/gms/internal/ads/dg2
    //   241: dup
    //   242: aload #14
    //   244: aload #15
    //   246: aload_0
    //   247: getfield n : Lcom/google/android/gms/internal/ads/pe2;
    //   250: iload #12
    //   252: aload #14
    //   254: getfield b : I
    //   257: invokeinterface e : (II)Lcom/google/android/gms/internal/ads/ue2;
    //   262: invokespecial <init> : (Lcom/google/android/gms/internal/ads/fg2;Lcom/google/android/gms/internal/ads/gg2;Lcom/google/android/gms/internal/ads/ue2;)V
    //   265: astore #16
    //   267: aload #15
    //   269: getfield d : I
    //   272: istore #17
    //   274: aload #14
    //   276: getfield f : Lcom/google/android/gms/internal/ads/zzht;
    //   279: iload #17
    //   281: bipush #30
    //   283: iadd
    //   284: invokevirtual r : (I)Lcom/google/android/gms/internal/ads/zzht;
    //   287: astore #18
    //   289: aload #18
    //   291: astore #9
    //   293: aload #14
    //   295: getfield b : I
    //   298: iconst_1
    //   299: if_icmpne -> 349
    //   302: aload #18
    //   304: astore #11
    //   306: aload #10
    //   308: invokevirtual c : ()Z
    //   311: ifeq -> 331
    //   314: aload #18
    //   316: aload #10
    //   318: getfield c : I
    //   321: aload #10
    //   323: getfield d : I
    //   326: invokevirtual m : (II)Lcom/google/android/gms/internal/ads/zzht;
    //   329: astore #11
    //   331: aload #11
    //   333: astore #9
    //   335: aload #13
    //   337: ifnull -> 349
    //   340: aload #11
    //   342: aload #13
    //   344: invokevirtual b : (Lcom/google/android/gms/internal/ads/zzmh;)Lcom/google/android/gms/internal/ads/zzht;
    //   347: astore #9
    //   349: aload #16
    //   351: getfield c : Lcom/google/android/gms/internal/ads/ue2;
    //   354: aload #9
    //   356: invokeinterface a : (Lcom/google/android/gms/internal/ads/zzht;)V
    //   361: lload #4
    //   363: aload #14
    //   365: getfield e : J
    //   368: invokestatic max : (JJ)J
    //   371: lstore #19
    //   373: aload #6
    //   375: aload #16
    //   377: invokeinterface add : (Ljava/lang/Object;)Z
    //   382: pop
    //   383: aload #15
    //   385: getfield b : [J
    //   388: iconst_0
    //   389: laload
    //   390: lstore #21
    //   392: lload #19
    //   394: lstore #4
    //   396: lload #7
    //   398: lstore #23
    //   400: lload #21
    //   402: lload #7
    //   404: lcmp
    //   405: ifge -> 423
    //   408: lload #21
    //   410: lstore #23
    //   412: lload #19
    //   414: lstore #4
    //   416: goto -> 423
    //   419: lload #7
    //   421: lstore #23
    //   423: iinc #12, 1
    //   426: lload #23
    //   428: lstore #7
    //   430: goto -> 133
    //   433: aload_0
    //   434: lload #4
    //   436: putfield p : J
    //   439: aload_0
    //   440: aload #6
    //   442: aload #6
    //   444: invokeinterface size : ()I
    //   449: anewarray com/google/android/gms/internal/ads/dg2
    //   452: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   457: checkcast [Lcom/google/android/gms/internal/ads/dg2;
    //   460: putfield o : [Lcom/google/android/gms/internal/ads/dg2;
    //   463: aload_0
    //   464: getfield n : Lcom/google/android/gms/internal/ads/pe2;
    //   467: invokeinterface d : ()V
    //   472: aload_0
    //   473: getfield n : Lcom/google/android/gms/internal/ads/pe2;
    //   476: aload_0
    //   477: invokeinterface o : (Lcom/google/android/gms/internal/ads/se2;)V
    //   482: aload_0
    //   483: getfield f : Ljava/util/Stack;
    //   486: invokevirtual clear : ()V
    //   489: aload_0
    //   490: iconst_2
    //   491: putfield g : I
    //   494: goto -> 0
    //   497: aload_0
    //   498: getfield f : Ljava/util/Stack;
    //   501: invokevirtual isEmpty : ()Z
    //   504: ifne -> 0
    //   507: aload_0
    //   508: getfield f : Ljava/util/Stack;
    //   511: invokevirtual peek : ()Ljava/lang/Object;
    //   514: checkcast com/google/android/gms/internal/ads/if2
    //   517: aload_3
    //   518: invokevirtual d : (Lcom/google/android/gms/internal/ads/if2;)V
    //   521: goto -> 0
    //   524: aload_0
    //   525: getfield g : I
    //   528: iconst_2
    //   529: if_icmpeq -> 536
    //   532: aload_0
    //   533: invokespecial j : ()V
    //   536: return
  }
  
  private final void j() {
    this.g = 0;
    this.j = 0;
  }
  
  public final void a() {}
  
  public final boolean b() {
    return true;
  }
  
  public final long c() {
    return this.p;
  }
  
  public final int d(le2 paramle2, te2 paramte2) {
    while (true) {
      gg2 gg2;
      long l1;
      long l2;
      int i = this.g;
      int j = 1;
      int k = 0;
      if (i != 0) {
        byte[] arrayOfByte;
        if (i != 1) {
          if (i == 2) {
            long l = Long.MAX_VALUE;
            i = 0;
            j = -1;
            while (true) {
              dg2[] arrayOfDg2 = this.o;
              if (i < arrayOfDg2.length) {
                dg2 dg21 = arrayOfDg2[i];
                int i1 = dg21.d;
                gg21 = dg21.b;
                k = j;
                long l4 = l;
                if (i1 != gg21.a) {
                  long l5 = gg21.b[i1];
                  k = j;
                  l4 = l;
                  if (l5 < l) {
                    k = i;
                    l4 = l5;
                  } 
                } 
                i++;
                j = k;
                l = l4;
                continue;
              } 
              if (j == -1)
                return -1; 
              gg2 gg21 = gg21[j];
              ue2 ue2 = ((dg2)gg21).c;
              int m = ((dg2)gg21).d;
              gg2 gg22 = ((dg2)gg21).b;
              l = gg22.b[m];
              j = gg22.c[m];
              i = j;
              long l3 = l;
              if (((dg2)gg21).a.g == 1) {
                l3 = l + 8L;
                i = j - 8;
              } 
              l = paramle2.a();
              j = this.l;
              l = l3 - l + j;
              if (l < 0L || l >= 262144L) {
                paramte2.a = l3;
                return 1;
              } 
              paramle2.g((int)l);
              int n = ((dg2)gg21).a.k;
              j = i;
              if (n != 0) {
                arrayOfByte = this.d.a;
                arrayOfByte[0] = (byte)0;
                arrayOfByte[1] = (byte)0;
                arrayOfByte[2] = (byte)0;
                j = 4 - n;
                while (true) {
                  k = i;
                  if (this.l < i) {
                    k = this.m;
                    if (k == 0) {
                      paramle2.readFully(this.d.a, j, n);
                      this.d.l(0);
                      this.m = this.d.v();
                      this.c.l(0);
                      ue2.c(this.c, 4);
                      this.l += 4;
                      i += j;
                      continue;
                    } 
                    k = ue2.d(paramle2, k, false);
                    this.l += k;
                    this.m -= k;
                    continue;
                  } 
                  break;
                } 
              } else {
                while (true) {
                  i = this.l;
                  k = j;
                  if (i < j) {
                    i = ue2.d(paramle2, j - i, false);
                    this.l += i;
                    this.m -= i;
                    continue;
                  } 
                  break;
                } 
              } 
              gg2 = ((dg2)gg21).b;
              ue2.b(gg2.e[m], gg2.f[m], k, 0, null);
              ((dg2)gg21).d++;
              this.l = 0;
              this.m = 0;
              return 0;
            } 
            break;
          } 
          throw new IllegalStateException();
        } 
        l2 = this.i - this.j;
        l1 = gg2.a();
        qj2 qj21 = this.k;
        if (qj21 != null) {
          gg2.readFully(qj21.a, this.j, (int)l2);
          if (this.h == jf2.a) {
            boolean bool;
            qj21 = this.k;
            qj21.l(8);
            if (qj21.d() == b)
              continue; 
            qj21.m(4);
            while (true) {
              if (qj21.q() > 0) {
                if (qj21.d() == b) {
                  boolean bool1 = true;
                  break;
                } 
                continue;
              } 
              bool = false;
              break;
            } 
            this.q = bool;
          } else if (!this.f.isEmpty()) {
            ((if2)this.f.peek()).e(new lf2(this.h, this.k));
          } 
        } else if (l2 < 262144L) {
          gg2.g((int)l2);
        } else {
          ((te2)arrayOfByte).a = gg2.a() + l2;
          j = 1;
          i(l1 + l2);
          i = k;
        } 
        j = 0;
      } else {
        if (this.j == 0) {
          if (!gg2.e(this.e.a, 0, 8, true)) {
            i = 0;
          } else {
            this.j = 8;
            this.e.l(0);
            this.i = this.e.s();
            this.h = this.e.d();
            if (this.i == 1L) {
              gg2.readFully(this.e.a, 8, 8);
              this.j += 8;
              this.i = this.e.w();
            } 
          } 
          continue;
        } 
        if (this.i == 1L) {
          gg2.readFully(this.e.a, 8, 8);
          this.j += 8;
          this.i = this.e.w();
        } 
      } 
      i(l1 + l2);
      i = k;
      if (SYNTHETIC_LOCAL_VARIABLE_3 == null)
        return -1; 
    } 
  }
  
  public final void e(pe2 parampe2) {
    this.n = parampe2;
  }
  
  public final long f(long paramLong) {
    dg2[] arrayOfDg2 = this.o;
    int i = arrayOfDg2.length;
    long l = Long.MAX_VALUE;
    byte b = 0;
    while (b < i) {
      gg2 gg2 = (arrayOfDg2[b]).b;
      int j = gg2.a(paramLong);
      int k = j;
      if (j == -1)
        k = gg2.b(paramLong); 
      long l1 = gg2.b[k];
      long l2 = l;
      if (l1 < l)
        l2 = l1; 
      b++;
      l = l2;
    } 
    return l;
  }
  
  public final boolean g(le2 paramle2) {
    return cg2.c(paramle2);
  }
  
  public final void h(long paramLong1, long paramLong2) {
    this.f.clear();
    byte b = 0;
    this.j = 0;
    this.l = 0;
    this.m = 0;
    if (paramLong1 == 0L) {
      j();
      return;
    } 
    dg2[] arrayOfDg2 = this.o;
    if (arrayOfDg2 != null) {
      int i = arrayOfDg2.length;
      while (b < i) {
        dg2 dg21 = arrayOfDg2[b];
        gg2 gg2 = dg21.b;
        int j = gg2.a(paramLong2);
        int k = j;
        if (j == -1)
          k = gg2.b(paramLong2); 
        dg21.d = k;
        b++;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */