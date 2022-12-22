package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class sj1 implements tj1 {
  private final ConcurrentHashMap<ak1, pj1> a;
  
  private zzdpf b;
  
  private uj1 c;
  
  public sj1(zzdpf paramzzdpf) {
    this.a = new ConcurrentHashMap<ak1, pj1>(paramzzdpf.i);
    this.b = paramzzdpf;
    this.c = new uj1();
  }
  
  private final void f() {
    if (zzdpf.p0()) {
      int j;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.b.g);
      stringBuilder.append(" PoolCollection");
      stringBuilder.append(this.c.g());
      Iterator<Map.Entry> iterator = this.a.entrySet().iterator();
      int i = 0;
      while (true) {
        j = i;
        if (iterator.hasNext()) {
          Map.Entry entry = iterator.next();
          j = i + 1;
          stringBuilder.append(j);
          stringBuilder.append(". ");
          stringBuilder.append(entry.getValue());
          stringBuilder.append("#");
          stringBuilder.append(((ak1)entry.getKey()).hashCode());
          stringBuilder.append("    ");
          for (i = 0; i < ((pj1)entry.getValue()).b(); i++)
            stringBuilder.append("[O]"); 
          for (i = ((pj1)entry.getValue()).b(); i < this.b.i; i++)
            stringBuilder.append("[ ]"); 
          stringBuilder.append("\n");
          stringBuilder.append(((pj1)entry.getValue()).f());
          stringBuilder.append("\n");
          i = j;
          continue;
        } 
        break;
      } 
      while (j < this.b.h) {
        stringBuilder.append(++j);
        stringBuilder.append(".\n");
      } 
      cm.e(stringBuilder.toString());
    } 
  }
  
  private final void g(bk1<?> parambk1, rk1 paramrk1) {
    if (parambk1 != null) {
      zzug$zzb zzug$zzb = (zzug$zzb)zzug$zzb.L().x(zzug$zzb.a.P().x(zzug$zzb.zzb.c).y(zzug$zzb.c.M().y(paramrk1.b).x(paramrk1.c))).h();
      parambk1.a.h().L(zzug$zzb);
    } 
    f();
  }
  
  public final zzdpf a() {
    return this.b;
  }
  
  public final boolean b(ak1 paramak1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   6: aload_1
    //   7: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast com/google/android/gms/internal/ads/pj1
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull -> 44
    //   18: aload_1
    //   19: invokevirtual b : ()I
    //   22: istore_2
    //   23: aload_0
    //   24: getfield b : Lcom/google/android/gms/internal/ads/zzdpf;
    //   27: getfield i : I
    //   30: istore_3
    //   31: iload_2
    //   32: iload_3
    //   33: if_icmpge -> 40
    //   36: aload_0
    //   37: monitorexit
    //   38: iconst_1
    //   39: ireturn
    //   40: aload_0
    //   41: monitorexit
    //   42: iconst_0
    //   43: ireturn
    //   44: aload_0
    //   45: monitorexit
    //   46: iconst_1
    //   47: ireturn
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	48	finally
    //   18	31	48	finally
  }
  
  public final bk1<?> c(ak1 paramak1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   6: aload_1
    //   7: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast com/google/android/gms/internal/ads/pj1
    //   13: astore_2
    //   14: aconst_null
    //   15: astore_1
    //   16: aload_2
    //   17: ifnull -> 48
    //   20: aload_2
    //   21: invokevirtual c : ()Lcom/google/android/gms/internal/ads/bk1;
    //   24: astore_1
    //   25: aload_1
    //   26: ifnonnull -> 36
    //   29: aload_0
    //   30: getfield c : Lcom/google/android/gms/internal/ads/uj1;
    //   33: invokevirtual b : ()V
    //   36: aload_0
    //   37: aload_1
    //   38: aload_2
    //   39: invokevirtual g : ()Lcom/google/android/gms/internal/ads/rk1;
    //   42: invokespecial g : (Lcom/google/android/gms/internal/ads/bk1;Lcom/google/android/gms/internal/ads/rk1;)V
    //   45: goto -> 61
    //   48: aload_0
    //   49: getfield c : Lcom/google/android/gms/internal/ads/uj1;
    //   52: invokevirtual a : ()V
    //   55: aload_0
    //   56: aconst_null
    //   57: aconst_null
    //   58: invokespecial g : (Lcom/google/android/gms/internal/ads/bk1;Lcom/google/android/gms/internal/ads/rk1;)V
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: areturn
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	65	finally
    //   20	25	65	finally
    //   29	36	65	finally
    //   36	45	65	finally
    //   48	61	65	finally
  }
  
  public final boolean d(ak1 paramak1, bk1<?> parambk1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   6: aload_1
    //   7: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast com/google/android/gms/internal/ads/pj1
    //   13: astore_3
    //   14: aload_2
    //   15: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   18: invokeinterface a : ()J
    //   23: putfield d : J
    //   26: aload_3
    //   27: astore #4
    //   29: aload_3
    //   30: ifnonnull -> 479
    //   33: new com/google/android/gms/internal/ads/pj1
    //   36: astore_3
    //   37: aload_0
    //   38: getfield b : Lcom/google/android/gms/internal/ads/zzdpf;
    //   41: astore #4
    //   43: aload_3
    //   44: aload #4
    //   46: getfield i : I
    //   49: aload #4
    //   51: getfield j : I
    //   54: sipush #1000
    //   57: imul
    //   58: invokespecial <init> : (II)V
    //   61: aload_0
    //   62: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   65: invokevirtual size : ()I
    //   68: istore #5
    //   70: aload_0
    //   71: getfield b : Lcom/google/android/gms/internal/ads/zzdpf;
    //   74: astore #4
    //   76: iload #5
    //   78: aload #4
    //   80: getfield h : I
    //   83: if_icmpne -> 459
    //   86: getstatic com/google/android/gms/internal/ads/vj1.a : [I
    //   89: aload #4
    //   91: getfield m : I
    //   94: iconst_1
    //   95: isub
    //   96: iaload
    //   97: istore #5
    //   99: ldc2_w 9223372036854775807
    //   102: lstore #6
    //   104: aconst_null
    //   105: astore #8
    //   107: aconst_null
    //   108: astore #9
    //   110: aconst_null
    //   111: astore #4
    //   113: iload #5
    //   115: iconst_1
    //   116: if_icmpeq -> 348
    //   119: iload #5
    //   121: iconst_2
    //   122: if_icmpeq -> 241
    //   125: iload #5
    //   127: iconst_3
    //   128: if_icmpeq -> 134
    //   131: goto -> 452
    //   134: ldc_w 2147483647
    //   137: istore #5
    //   139: aload_0
    //   140: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   143: invokevirtual entrySet : ()Ljava/util/Set;
    //   146: invokeinterface iterator : ()Ljava/util/Iterator;
    //   151: astore #8
    //   153: aload #8
    //   155: invokeinterface hasNext : ()Z
    //   160: ifeq -> 223
    //   163: aload #8
    //   165: invokeinterface next : ()Ljava/lang/Object;
    //   170: checkcast java/util/Map$Entry
    //   173: astore #9
    //   175: aload #9
    //   177: invokeinterface getValue : ()Ljava/lang/Object;
    //   182: checkcast com/google/android/gms/internal/ads/pj1
    //   185: invokevirtual e : ()I
    //   188: iload #5
    //   190: if_icmpge -> 153
    //   193: aload #9
    //   195: invokeinterface getValue : ()Ljava/lang/Object;
    //   200: checkcast com/google/android/gms/internal/ads/pj1
    //   203: invokevirtual e : ()I
    //   206: istore #5
    //   208: aload #9
    //   210: invokeinterface getKey : ()Ljava/lang/Object;
    //   215: checkcast com/google/android/gms/internal/ads/ak1
    //   218: astore #4
    //   220: goto -> 153
    //   223: aload #4
    //   225: ifnull -> 452
    //   228: aload_0
    //   229: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   232: aload #4
    //   234: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   237: pop
    //   238: goto -> 452
    //   241: aload_0
    //   242: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   245: invokevirtual entrySet : ()Ljava/util/Set;
    //   248: invokeinterface iterator : ()Ljava/util/Iterator;
    //   253: astore #9
    //   255: aload #8
    //   257: astore #4
    //   259: aload #9
    //   261: invokeinterface hasNext : ()Z
    //   266: ifeq -> 330
    //   269: aload #9
    //   271: invokeinterface next : ()Ljava/lang/Object;
    //   276: checkcast java/util/Map$Entry
    //   279: astore #8
    //   281: aload #8
    //   283: invokeinterface getValue : ()Ljava/lang/Object;
    //   288: checkcast com/google/android/gms/internal/ads/pj1
    //   291: invokevirtual d : ()J
    //   294: lload #6
    //   296: lcmp
    //   297: ifge -> 259
    //   300: aload #8
    //   302: invokeinterface getValue : ()Ljava/lang/Object;
    //   307: checkcast com/google/android/gms/internal/ads/pj1
    //   310: invokevirtual d : ()J
    //   313: lstore #6
    //   315: aload #8
    //   317: invokeinterface getKey : ()Ljava/lang/Object;
    //   322: checkcast com/google/android/gms/internal/ads/ak1
    //   325: astore #4
    //   327: goto -> 259
    //   330: aload #4
    //   332: ifnull -> 452
    //   335: aload_0
    //   336: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   339: aload #4
    //   341: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   344: pop
    //   345: goto -> 452
    //   348: aload_0
    //   349: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   352: invokevirtual entrySet : ()Ljava/util/Set;
    //   355: invokeinterface iterator : ()Ljava/util/Iterator;
    //   360: astore #8
    //   362: aload #9
    //   364: astore #4
    //   366: aload #8
    //   368: invokeinterface hasNext : ()Z
    //   373: ifeq -> 437
    //   376: aload #8
    //   378: invokeinterface next : ()Ljava/lang/Object;
    //   383: checkcast java/util/Map$Entry
    //   386: astore #9
    //   388: aload #9
    //   390: invokeinterface getValue : ()Ljava/lang/Object;
    //   395: checkcast com/google/android/gms/internal/ads/pj1
    //   398: invokevirtual a : ()J
    //   401: lload #6
    //   403: lcmp
    //   404: ifge -> 366
    //   407: aload #9
    //   409: invokeinterface getValue : ()Ljava/lang/Object;
    //   414: checkcast com/google/android/gms/internal/ads/pj1
    //   417: invokevirtual a : ()J
    //   420: lstore #6
    //   422: aload #9
    //   424: invokeinterface getKey : ()Ljava/lang/Object;
    //   429: checkcast com/google/android/gms/internal/ads/ak1
    //   432: astore #4
    //   434: goto -> 366
    //   437: aload #4
    //   439: ifnull -> 452
    //   442: aload_0
    //   443: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   446: aload #4
    //   448: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   451: pop
    //   452: aload_0
    //   453: getfield c : Lcom/google/android/gms/internal/ads/uj1;
    //   456: invokevirtual d : ()V
    //   459: aload_0
    //   460: getfield a : Ljava/util/concurrent/ConcurrentHashMap;
    //   463: aload_1
    //   464: aload_3
    //   465: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   468: pop
    //   469: aload_0
    //   470: getfield c : Lcom/google/android/gms/internal/ads/uj1;
    //   473: invokevirtual c : ()V
    //   476: aload_3
    //   477: astore #4
    //   479: aload #4
    //   481: aload_2
    //   482: invokevirtual i : (Lcom/google/android/gms/internal/ads/bk1;)Z
    //   485: istore #10
    //   487: aload_0
    //   488: getfield c : Lcom/google/android/gms/internal/ads/uj1;
    //   491: invokevirtual e : ()V
    //   494: aload_0
    //   495: getfield c : Lcom/google/android/gms/internal/ads/uj1;
    //   498: invokevirtual f : ()Lcom/google/android/gms/internal/ads/wj1;
    //   501: astore_1
    //   502: aload #4
    //   504: invokevirtual g : ()Lcom/google/android/gms/internal/ads/rk1;
    //   507: astore #4
    //   509: invokestatic L : ()Lcom/google/android/gms/internal/ads/zzug$zzb$b;
    //   512: invokestatic P : ()Lcom/google/android/gms/internal/ads/zzug$zzb$a$a;
    //   515: getstatic com/google/android/gms/internal/ads/zzug$zzb$zzb.c : Lcom/google/android/gms/internal/ads/zzug$zzb$zzb;
    //   518: invokevirtual x : (Lcom/google/android/gms/internal/ads/zzug$zzb$zzb;)Lcom/google/android/gms/internal/ads/zzug$zzb$a$a;
    //   521: invokestatic N : ()Lcom/google/android/gms/internal/ads/zzug$zzb$d$a;
    //   524: aload_1
    //   525: getfield b : Z
    //   528: invokevirtual y : (Z)Lcom/google/android/gms/internal/ads/zzug$zzb$d$a;
    //   531: aload_1
    //   532: getfield c : Z
    //   535: invokevirtual z : (Z)Lcom/google/android/gms/internal/ads/zzug$zzb$d$a;
    //   538: aload #4
    //   540: getfield c : I
    //   543: invokevirtual x : (I)Lcom/google/android/gms/internal/ads/zzug$zzb$d$a;
    //   546: invokevirtual z : (Lcom/google/android/gms/internal/ads/zzug$zzb$d$a;)Lcom/google/android/gms/internal/ads/zzug$zzb$a$a;
    //   549: invokevirtual x : (Lcom/google/android/gms/internal/ads/zzug$zzb$a$a;)Lcom/google/android/gms/internal/ads/zzug$zzb$b;
    //   552: invokevirtual h : ()Lcom/google/android/gms/internal/ads/u52;
    //   555: checkcast com/google/android/gms/internal/ads/k42
    //   558: checkcast com/google/android/gms/internal/ads/zzug$zzb
    //   561: astore_1
    //   562: aload_2
    //   563: getfield a : Lcom/google/android/gms/internal/ads/r10;
    //   566: invokevirtual h : ()Lcom/google/android/gms/internal/ads/y80;
    //   569: aload_1
    //   570: invokevirtual D0 : (Lcom/google/android/gms/internal/ads/zzug$zzb;)V
    //   573: aload_0
    //   574: invokespecial f : ()V
    //   577: aload_0
    //   578: monitorexit
    //   579: iload #10
    //   581: ireturn
    //   582: astore_1
    //   583: aload_0
    //   584: monitorexit
    //   585: goto -> 590
    //   588: aload_1
    //   589: athrow
    //   590: goto -> 588
    // Exception table:
    //   from	to	target	type
    //   2	26	582	finally
    //   33	99	582	finally
    //   139	153	582	finally
    //   153	220	582	finally
    //   228	238	582	finally
    //   241	255	582	finally
    //   259	327	582	finally
    //   335	345	582	finally
    //   348	362	582	finally
    //   366	434	582	finally
    //   442	452	582	finally
    //   452	459	582	finally
    //   459	476	582	finally
    //   479	577	582	finally
  }
  
  @Deprecated
  public final ak1 e(zzvl paramzzvl, String paramString, zzvx paramzzvx) {
    return new dk1(paramzzvl, paramString, ((new xg(this.b.e)).g()).o, this.b.k, paramzzvx);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */