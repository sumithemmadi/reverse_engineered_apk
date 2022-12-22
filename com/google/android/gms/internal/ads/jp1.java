package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.j;
import java.io.File;

public final class jp1 {
  private static final Object a = new Object();
  
  private final Context b;
  
  private final SharedPreferences c;
  
  private final String d;
  
  private final wo1 e;
  
  private boolean f = false;
  
  private jp1(Context paramContext, zzgp paramzzgp, wo1 paramwo1) {
    this.b = paramContext;
    this.d = Integer.toString(paramzzgp.zzv());
    this.c = paramContext.getSharedPreferences("pcvmspf", 0);
    this.e = paramwo1;
  }
  
  public jp1(Context paramContext, zzgp paramzzgp, wo1 paramwo1, boolean paramBoolean) {
    this(paramContext, paramzzgp, paramwo1);
    this.f = paramBoolean;
  }
  
  private final void a(int paramInt, long paramLong) {
    wo1 wo11 = this.e;
    if (wo11 != null)
      wo11.a(paramInt, paramLong); 
  }
  
  private final void b(int paramInt, long paramLong, String paramString) {
    wo1 wo11 = this.e;
    if (wo11 != null)
      wo11.b(paramInt, paramLong, paramString); 
  }
  
  private final String e() {
    String str = String.valueOf(this.d);
    return (str.length() != 0) ? "FBAMTD".concat(str) : new String("FBAMTD");
  }
  
  private final String f() {
    String str = String.valueOf(this.d);
    return (str.length() != 0) ? "LATMTD".concat(str) : new String("LATMTD");
  }
  
  private static String g(nb2 paramnb2) {
    return j.a(((rb2)rb2.Z().x(paramnb2.K().R()).y(paramnb2.K().T()).A(paramnb2.K().X()).B(paramnb2.K().Y()).z(paramnb2.K().V()).h()).a().toByteArray());
  }
  
  private final rb2 h(int paramInt) {
    String str;
    if (paramInt == mp1.a) {
      str = this.c.getString(f(), null);
    } else if (paramInt == mp1.b) {
      str = this.c.getString(e(), null);
    } else {
      str = null;
    } 
    if (str == null)
      return null; 
    long l = System.currentTimeMillis();
    try {
      y32 y32;
      zzejr zzejr = zzejr.zzt(j.c(str));
      if (this.f) {
        y32 = y32.b();
      } else {
        y32 = y32.c();
      } 
      return rb2.N(zzejr, y32);
    } catch (zzelo zzelo) {
    
    } catch (NullPointerException nullPointerException) {
      a(2029, l);
    } 
    return null;
  }
  
  private final File j(String paramString) {
    return new File(new File(this.b.getDir("pccache", 0), this.d), paramString);
  }
  
  public final boolean c(nb2 paramnb2) {
    long l = System.currentTimeMillis();
    synchronized (a) {
      File file1 = j(paramnb2.K().R());
      File file2 = new File();
      this(file1, "pcbc");
      if (!fp1.d(file2, paramnb2.M().toByteArray())) {
        a(4020, l);
        return false;
      } 
      String str = g(paramnb2);
      SharedPreferences.Editor editor = this.c.edit();
      editor.putString(f(), str);
      boolean bool = editor.commit();
      if (bool) {
        a(5015, l);
      } else {
        a(4021, l);
      } 
      return bool;
    } 
  }
  
  public final boolean d(nb2 paramnb2, kp1 paramkp1) {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: lstore_3
    //   4: getstatic com/google/android/gms/internal/ads/jp1.a : Ljava/lang/Object;
    //   7: astore #5
    //   9: aload #5
    //   11: monitorenter
    //   12: getstatic com/google/android/gms/internal/ads/mp1.a : I
    //   15: istore #6
    //   17: aload_0
    //   18: iload #6
    //   20: invokespecial h : (I)Lcom/google/android/gms/internal/ads/rb2;
    //   23: astore #7
    //   25: aload_1
    //   26: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   29: invokevirtual R : ()Ljava/lang/String;
    //   32: astore #8
    //   34: iconst_0
    //   35: istore #9
    //   37: aload #7
    //   39: ifnull -> 68
    //   42: aload #7
    //   44: invokevirtual R : ()Ljava/lang/String;
    //   47: aload #8
    //   49: invokevirtual equals : (Ljava/lang/Object;)Z
    //   52: ifeq -> 68
    //   55: aload_0
    //   56: sipush #4014
    //   59: lload_3
    //   60: invokespecial a : (IJ)V
    //   63: aload #5
    //   65: monitorexit
    //   66: iconst_0
    //   67: ireturn
    //   68: invokestatic currentTimeMillis : ()J
    //   71: lstore #10
    //   73: aload_0
    //   74: aload #8
    //   76: invokespecial j : (Ljava/lang/String;)Ljava/io/File;
    //   79: astore #12
    //   81: aload #12
    //   83: invokevirtual exists : ()Z
    //   86: ifeq -> 222
    //   89: aload #12
    //   91: invokevirtual isDirectory : ()Z
    //   94: ifeq -> 105
    //   97: ldc_w '1'
    //   100: astore #7
    //   102: goto -> 110
    //   105: ldc_w '0'
    //   108: astore #7
    //   110: aload #12
    //   112: invokevirtual isFile : ()Z
    //   115: ifeq -> 126
    //   118: ldc_w '1'
    //   121: astore #12
    //   123: goto -> 131
    //   126: ldc_w '0'
    //   129: astore #12
    //   131: aload #7
    //   133: invokevirtual length : ()I
    //   136: istore #13
    //   138: aload #12
    //   140: invokevirtual length : ()I
    //   143: istore #14
    //   145: new java/lang/StringBuilder
    //   148: astore #15
    //   150: aload #15
    //   152: iload #13
    //   154: iconst_5
    //   155: iadd
    //   156: iload #14
    //   158: iadd
    //   159: invokespecial <init> : (I)V
    //   162: aload #15
    //   164: ldc_w 'd:'
    //   167: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: aload #15
    //   173: aload #7
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload #15
    //   181: ldc_w ',f:'
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: aload #15
    //   190: aload #12
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: pop
    //   196: aload_0
    //   197: sipush #4023
    //   200: lload #10
    //   202: aload #15
    //   204: invokevirtual toString : ()Ljava/lang/String;
    //   207: invokespecial b : (IJLjava/lang/String;)V
    //   210: aload_0
    //   211: sipush #4015
    //   214: lload #10
    //   216: invokespecial a : (IJ)V
    //   219: goto -> 310
    //   222: aload #12
    //   224: invokevirtual mkdirs : ()Z
    //   227: ifne -> 310
    //   230: aload #12
    //   232: invokevirtual canWrite : ()Z
    //   235: ifeq -> 246
    //   238: ldc_w '1'
    //   241: astore #7
    //   243: goto -> 251
    //   246: ldc_w '0'
    //   249: astore #7
    //   251: aload #7
    //   253: invokevirtual length : ()I
    //   256: ifeq -> 272
    //   259: ldc_w 'cw:'
    //   262: aload #7
    //   264: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   267: astore #7
    //   269: goto -> 284
    //   272: new java/lang/String
    //   275: dup
    //   276: ldc_w 'cw:'
    //   279: invokespecial <init> : (Ljava/lang/String;)V
    //   282: astore #7
    //   284: aload_0
    //   285: sipush #4024
    //   288: lload #10
    //   290: aload #7
    //   292: invokespecial b : (IJLjava/lang/String;)V
    //   295: aload_0
    //   296: sipush #4015
    //   299: lload #10
    //   301: invokespecial a : (IJ)V
    //   304: iconst_0
    //   305: istore #14
    //   307: goto -> 313
    //   310: iconst_1
    //   311: istore #14
    //   313: iload #14
    //   315: ifne -> 323
    //   318: aload #5
    //   320: monitorexit
    //   321: iconst_0
    //   322: ireturn
    //   323: aload_0
    //   324: aload #8
    //   326: invokespecial j : (Ljava/lang/String;)Ljava/io/File;
    //   329: astore #12
    //   331: new java/io/File
    //   334: astore #7
    //   336: aload #7
    //   338: aload #12
    //   340: ldc_w 'pcam.jar'
    //   343: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   346: new java/io/File
    //   349: astore #8
    //   351: aload #8
    //   353: aload #12
    //   355: ldc 'pcbc'
    //   357: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   360: aload #7
    //   362: aload_1
    //   363: invokevirtual L : ()Lcom/google/android/gms/internal/ads/zzejr;
    //   366: invokevirtual toByteArray : ()[B
    //   369: invokestatic d : (Ljava/io/File;[B)Z
    //   372: ifne -> 388
    //   375: aload_0
    //   376: sipush #4016
    //   379: lload_3
    //   380: invokespecial a : (IJ)V
    //   383: aload #5
    //   385: monitorexit
    //   386: iconst_0
    //   387: ireturn
    //   388: aload #8
    //   390: aload_1
    //   391: invokevirtual M : ()Lcom/google/android/gms/internal/ads/zzejr;
    //   394: invokevirtual toByteArray : ()[B
    //   397: invokestatic d : (Ljava/io/File;[B)Z
    //   400: ifne -> 416
    //   403: aload_0
    //   404: sipush #4017
    //   407: lload_3
    //   408: invokespecial a : (IJ)V
    //   411: aload #5
    //   413: monitorexit
    //   414: iconst_0
    //   415: ireturn
    //   416: aload_2
    //   417: ifnull -> 450
    //   420: aload_2
    //   421: aload #7
    //   423: invokeinterface a : (Ljava/io/File;)Z
    //   428: ifne -> 450
    //   431: aload_0
    //   432: sipush #4018
    //   435: lload_3
    //   436: invokespecial a : (IJ)V
    //   439: aload #12
    //   441: invokestatic e : (Ljava/io/File;)Z
    //   444: pop
    //   445: aload #5
    //   447: monitorexit
    //   448: iconst_0
    //   449: ireturn
    //   450: aload_1
    //   451: invokestatic g : (Lcom/google/android/gms/internal/ads/nb2;)Ljava/lang/String;
    //   454: astore_2
    //   455: invokestatic currentTimeMillis : ()J
    //   458: lstore #10
    //   460: aload_0
    //   461: getfield c : Landroid/content/SharedPreferences;
    //   464: aload_0
    //   465: invokespecial f : ()Ljava/lang/String;
    //   468: aconst_null
    //   469: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   474: astore_1
    //   475: aload_0
    //   476: getfield c : Landroid/content/SharedPreferences;
    //   479: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   484: astore #7
    //   486: aload #7
    //   488: aload_0
    //   489: invokespecial f : ()Ljava/lang/String;
    //   492: aload_2
    //   493: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   498: pop
    //   499: aload_1
    //   500: ifnull -> 516
    //   503: aload #7
    //   505: aload_0
    //   506: invokespecial e : ()Ljava/lang/String;
    //   509: aload_1
    //   510: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   515: pop
    //   516: aload #7
    //   518: invokeinterface commit : ()Z
    //   523: istore #16
    //   525: iload #16
    //   527: ifne -> 539
    //   530: aload_0
    //   531: sipush #4019
    //   534: lload #10
    //   536: invokespecial a : (IJ)V
    //   539: iload #16
    //   541: ifne -> 549
    //   544: aload #5
    //   546: monitorexit
    //   547: iconst_0
    //   548: ireturn
    //   549: new java/util/HashSet
    //   552: astore_1
    //   553: aload_1
    //   554: invokespecial <init> : ()V
    //   557: aload_0
    //   558: iload #6
    //   560: invokespecial h : (I)Lcom/google/android/gms/internal/ads/rb2;
    //   563: astore_2
    //   564: aload_2
    //   565: ifnull -> 579
    //   568: aload_1
    //   569: aload_2
    //   570: invokevirtual R : ()Ljava/lang/String;
    //   573: invokeinterface add : (Ljava/lang/Object;)Z
    //   578: pop
    //   579: aload_0
    //   580: getstatic com/google/android/gms/internal/ads/mp1.b : I
    //   583: invokespecial h : (I)Lcom/google/android/gms/internal/ads/rb2;
    //   586: astore_2
    //   587: aload_2
    //   588: ifnull -> 602
    //   591: aload_1
    //   592: aload_2
    //   593: invokevirtual R : ()Ljava/lang/String;
    //   596: invokeinterface add : (Ljava/lang/Object;)Z
    //   601: pop
    //   602: new java/io/File
    //   605: astore_2
    //   606: aload_2
    //   607: aload_0
    //   608: getfield b : Landroid/content/Context;
    //   611: ldc 'pccache'
    //   613: iconst_0
    //   614: invokevirtual getDir : (Ljava/lang/String;I)Ljava/io/File;
    //   617: aload_0
    //   618: getfield d : Ljava/lang/String;
    //   621: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   624: aload_2
    //   625: invokevirtual listFiles : ()[Ljava/io/File;
    //   628: astore #7
    //   630: aload #7
    //   632: arraylength
    //   633: istore #6
    //   635: iload #9
    //   637: istore #14
    //   639: iload #14
    //   641: iload #6
    //   643: if_icmpge -> 676
    //   646: aload #7
    //   648: iload #14
    //   650: aaload
    //   651: astore_2
    //   652: aload_1
    //   653: aload_2
    //   654: invokevirtual getName : ()Ljava/lang/String;
    //   657: invokeinterface contains : (Ljava/lang/Object;)Z
    //   662: ifne -> 670
    //   665: aload_2
    //   666: invokestatic e : (Ljava/io/File;)Z
    //   669: pop
    //   670: iinc #14, 1
    //   673: goto -> 639
    //   676: aload_0
    //   677: sipush #5014
    //   680: lload_3
    //   681: invokespecial a : (IJ)V
    //   684: aload #5
    //   686: monitorexit
    //   687: iconst_1
    //   688: ireturn
    //   689: astore_1
    //   690: aload #5
    //   692: monitorexit
    //   693: goto -> 698
    //   696: aload_1
    //   697: athrow
    //   698: goto -> 696
    // Exception table:
    //   from	to	target	type
    //   12	34	689	finally
    //   42	66	689	finally
    //   68	97	689	finally
    //   110	118	689	finally
    //   131	219	689	finally
    //   222	238	689	finally
    //   251	269	689	finally
    //   272	284	689	finally
    //   284	304	689	finally
    //   318	321	689	finally
    //   323	386	689	finally
    //   388	414	689	finally
    //   420	448	689	finally
    //   450	499	689	finally
    //   503	516	689	finally
    //   516	525	689	finally
    //   530	539	689	finally
    //   544	547	689	finally
    //   549	564	689	finally
    //   568	579	689	finally
    //   579	587	689	finally
    //   591	602	689	finally
    //   602	635	689	finally
    //   652	670	689	finally
    //   676	687	689	finally
    //   690	693	689	finally
  }
  
  public final boolean i(int paramInt) {
    long l = System.currentTimeMillis();
    synchronized (a) {
      rb2 rb2 = h(paramInt);
      if (rb2 == null) {
        a(4025, l);
        return false;
      } 
      File file1 = j(rb2.R());
      File file2 = new File();
      this(file1, "pcam.jar");
      if (!file2.exists()) {
        a(4026, l);
        return false;
      } 
      file2 = new File();
      this(file1, "pcbc");
      if (!file2.exists()) {
        a(4027, l);
        return false;
      } 
      a(5019, l);
      return true;
    } 
  }
  
  public final dp1 k(int paramInt) {
    long l = System.currentTimeMillis();
    synchronized (a) {
      rb2 rb2 = h(paramInt);
      if (rb2 == null) {
        a(4022, l);
        return null;
      } 
      File file1 = j(rb2.R());
      File file2 = new File();
      this(file1, "pcam.jar");
      File file3 = file2;
      if (!file2.exists()) {
        file3 = new File();
        this(file1, "pcam");
      } 
      File file4 = new File();
      this(file1, "pcbc");
      file2 = new File();
      this(file1, "pcopt");
      a(5016, l);
      dp1 dp1 = new dp1();
      this(rb2, file3, file4, file2);
      return dp1;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */