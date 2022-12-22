package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.j;
import java.io.File;

public final class gp1 {
  private final File a;
  
  private final File b;
  
  private final SharedPreferences c;
  
  private final zzgp d;
  
  public gp1(Context paramContext, zzgp paramzzgp) {
    this.c = paramContext.getSharedPreferences("pcvmspf", 0);
    this.a = fp1.a(paramContext.getDir("pccache", 0), false);
    this.b = fp1.a(paramContext.getDir("tmppccache", 0), true);
    this.d = paramzzgp;
  }
  
  private static String a(rb2 paramrb2) {
    return j.a(paramrb2.a().toByteArray());
  }
  
  private final File c() {
    File file = new File(this.a, Integer.toString(this.d.zzv()));
    if (!file.exists())
      file.mkdir(); 
    return file;
  }
  
  private final String d() {
    int i = this.d.zzv();
    StringBuilder stringBuilder = new StringBuilder(17);
    stringBuilder.append("FBAMTD");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
  
  private final String e() {
    int i = this.d.zzv();
    StringBuilder stringBuilder = new StringBuilder(17);
    stringBuilder.append("LATMTD");
    stringBuilder.append(i);
    return stringBuilder.toString();
  }
  
  private final rb2 f(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: getstatic com/google/android/gms/internal/ads/mp1.a : I
    //   4: if_icmpne -> 25
    //   7: aload_0
    //   8: getfield c : Landroid/content/SharedPreferences;
    //   11: aload_0
    //   12: invokespecial e : ()Ljava/lang/String;
    //   15: aconst_null
    //   16: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   21: astore_2
    //   22: goto -> 52
    //   25: iload_1
    //   26: getstatic com/google/android/gms/internal/ads/mp1.b : I
    //   29: if_icmpne -> 50
    //   32: aload_0
    //   33: getfield c : Landroid/content/SharedPreferences;
    //   36: aload_0
    //   37: invokespecial d : ()Ljava/lang/String;
    //   40: aconst_null
    //   41: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   46: astore_2
    //   47: goto -> 52
    //   50: aconst_null
    //   51: astore_2
    //   52: aload_2
    //   53: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   56: ifeq -> 61
    //   59: aconst_null
    //   60: areturn
    //   61: aload_2
    //   62: invokestatic c : (Ljava/lang/String;)[B
    //   65: invokestatic zzt : ([B)Lcom/google/android/gms/internal/ads/zzejr;
    //   68: invokestatic c0 : (Lcom/google/android/gms/internal/ads/zzejr;)Lcom/google/android/gms/internal/ads/rb2;
    //   71: astore_3
    //   72: aload_3
    //   73: invokevirtual R : ()Ljava/lang/String;
    //   76: astore #4
    //   78: aload #4
    //   80: ldc 'pcam.jar'
    //   82: aload_0
    //   83: invokespecial c : ()Ljava/io/File;
    //   86: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   89: astore #5
    //   91: aload #5
    //   93: astore_2
    //   94: aload #5
    //   96: invokevirtual exists : ()Z
    //   99: ifne -> 114
    //   102: aload #4
    //   104: ldc 'pcam'
    //   106: aload_0
    //   107: invokespecial c : ()Ljava/io/File;
    //   110: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   113: astore_2
    //   114: aload #4
    //   116: ldc 'pcbc'
    //   118: aload_0
    //   119: invokespecial c : ()Ljava/io/File;
    //   122: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   125: astore #5
    //   127: aload_2
    //   128: invokevirtual exists : ()Z
    //   131: ifeq -> 151
    //   134: aload #5
    //   136: invokevirtual exists : ()Z
    //   139: istore #6
    //   141: iload #6
    //   143: ifeq -> 151
    //   146: iconst_1
    //   147: istore_1
    //   148: goto -> 153
    //   151: iconst_0
    //   152: istore_1
    //   153: iload_1
    //   154: ifeq -> 159
    //   157: aload_3
    //   158: areturn
    //   159: aconst_null
    //   160: areturn
    //   161: astore_2
    //   162: goto -> 159
    // Exception table:
    //   from	to	target	type
    //   61	91	161	com/google/android/gms/internal/ads/zzelo
    //   94	114	161	com/google/android/gms/internal/ads/zzelo
    //   114	141	161	com/google/android/gms/internal/ads/zzelo
  }
  
  public final boolean b(nb2 paramnb2, kp1 paramkp1) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   4: invokevirtual R : ()Ljava/lang/String;
    //   7: astore_3
    //   8: aload_1
    //   9: invokevirtual L : ()Lcom/google/android/gms/internal/ads/zzejr;
    //   12: invokevirtual toByteArray : ()[B
    //   15: astore #4
    //   17: aload_1
    //   18: invokevirtual M : ()Lcom/google/android/gms/internal/ads/zzejr;
    //   21: invokevirtual toByteArray : ()[B
    //   24: astore #5
    //   26: aload_3
    //   27: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   30: istore #6
    //   32: iconst_0
    //   33: istore #7
    //   35: iload #6
    //   37: ifne -> 138
    //   40: aload #5
    //   42: ifnull -> 138
    //   45: aload #5
    //   47: arraylength
    //   48: ifne -> 54
    //   51: goto -> 138
    //   54: aload_0
    //   55: getfield b : Ljava/io/File;
    //   58: invokestatic e : (Ljava/io/File;)Z
    //   61: pop
    //   62: aload_0
    //   63: getfield b : Ljava/io/File;
    //   66: invokevirtual mkdirs : ()Z
    //   69: pop
    //   70: aload_3
    //   71: aload_0
    //   72: getfield b : Ljava/io/File;
    //   75: invokestatic b : (Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   78: invokevirtual mkdirs : ()Z
    //   81: pop
    //   82: aload_3
    //   83: ldc 'pcam.jar'
    //   85: aload_0
    //   86: getfield b : Ljava/io/File;
    //   89: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   92: astore #8
    //   94: aload #4
    //   96: ifnull -> 118
    //   99: aload #4
    //   101: arraylength
    //   102: ifle -> 118
    //   105: aload #8
    //   107: aload #4
    //   109: invokestatic d : (Ljava/io/File;[B)Z
    //   112: ifne -> 118
    //   115: goto -> 138
    //   118: aload_3
    //   119: ldc 'pcbc'
    //   121: aload_0
    //   122: getfield b : Ljava/io/File;
    //   125: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   128: aload #5
    //   130: invokestatic d : (Ljava/io/File;[B)Z
    //   133: istore #6
    //   135: goto -> 141
    //   138: iconst_0
    //   139: istore #6
    //   141: iload #6
    //   143: ifne -> 148
    //   146: iconst_0
    //   147: ireturn
    //   148: aload_1
    //   149: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   152: invokevirtual R : ()Ljava/lang/String;
    //   155: ldc 'pcam.jar'
    //   157: aload_0
    //   158: getfield b : Ljava/io/File;
    //   161: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   164: astore #4
    //   166: aload #4
    //   168: invokevirtual exists : ()Z
    //   171: ifeq -> 191
    //   174: aload_2
    //   175: ifnull -> 191
    //   178: aload_2
    //   179: aload #4
    //   181: invokeinterface a : (Ljava/io/File;)Z
    //   186: ifne -> 191
    //   189: iconst_0
    //   190: ireturn
    //   191: aload_1
    //   192: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   195: invokevirtual R : ()Ljava/lang/String;
    //   198: astore #8
    //   200: aload #8
    //   202: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   205: istore #9
    //   207: iconst_1
    //   208: istore #6
    //   210: iload #9
    //   212: ifne -> 306
    //   215: aload #8
    //   217: ldc 'pcam.jar'
    //   219: aload_0
    //   220: getfield b : Ljava/io/File;
    //   223: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   226: astore #5
    //   228: aload #8
    //   230: ldc 'pcbc'
    //   232: aload_0
    //   233: getfield b : Ljava/io/File;
    //   236: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   239: astore_2
    //   240: aload #8
    //   242: ldc 'pcam.jar'
    //   244: aload_0
    //   245: invokespecial c : ()Ljava/io/File;
    //   248: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   251: astore #4
    //   253: aload #8
    //   255: ldc 'pcbc'
    //   257: aload_0
    //   258: invokespecial c : ()Ljava/io/File;
    //   261: invokestatic c : (Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   264: astore #8
    //   266: aload #5
    //   268: invokevirtual exists : ()Z
    //   271: ifeq -> 284
    //   274: aload #5
    //   276: aload #4
    //   278: invokevirtual renameTo : (Ljava/io/File;)Z
    //   281: ifeq -> 306
    //   284: aload_2
    //   285: invokevirtual exists : ()Z
    //   288: ifeq -> 306
    //   291: aload_2
    //   292: aload #8
    //   294: invokevirtual renameTo : (Ljava/io/File;)Z
    //   297: ifeq -> 306
    //   300: iconst_1
    //   301: istore #10
    //   303: goto -> 309
    //   306: iconst_0
    //   307: istore #10
    //   309: iload #10
    //   311: ifeq -> 458
    //   314: invokestatic Z : ()Lcom/google/android/gms/internal/ads/rb2$a;
    //   317: aload_1
    //   318: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   321: invokevirtual R : ()Ljava/lang/String;
    //   324: invokevirtual x : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/rb2$a;
    //   327: aload_1
    //   328: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   331: invokevirtual T : ()Ljava/lang/String;
    //   334: invokevirtual y : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/rb2$a;
    //   337: aload_1
    //   338: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   341: invokevirtual X : ()J
    //   344: invokevirtual A : (J)Lcom/google/android/gms/internal/ads/rb2$a;
    //   347: aload_1
    //   348: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   351: invokevirtual Y : ()J
    //   354: invokevirtual B : (J)Lcom/google/android/gms/internal/ads/rb2$a;
    //   357: aload_1
    //   358: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   361: invokevirtual V : ()J
    //   364: invokevirtual z : (J)Lcom/google/android/gms/internal/ads/rb2$a;
    //   367: invokevirtual h : ()Lcom/google/android/gms/internal/ads/u52;
    //   370: checkcast com/google/android/gms/internal/ads/k42
    //   373: checkcast com/google/android/gms/internal/ads/rb2
    //   376: astore #4
    //   378: aload_0
    //   379: getstatic com/google/android/gms/internal/ads/mp1.a : I
    //   382: invokespecial f : (I)Lcom/google/android/gms/internal/ads/rb2;
    //   385: astore_2
    //   386: aload_0
    //   387: getfield c : Landroid/content/SharedPreferences;
    //   390: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   395: astore_1
    //   396: aload_2
    //   397: ifnull -> 430
    //   400: aload #4
    //   402: invokevirtual R : ()Ljava/lang/String;
    //   405: aload_2
    //   406: invokevirtual R : ()Ljava/lang/String;
    //   409: invokevirtual equals : (Ljava/lang/Object;)Z
    //   412: ifne -> 430
    //   415: aload_1
    //   416: aload_0
    //   417: invokespecial d : ()Ljava/lang/String;
    //   420: aload_2
    //   421: invokestatic a : (Lcom/google/android/gms/internal/ads/rb2;)Ljava/lang/String;
    //   424: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   429: pop
    //   430: aload_1
    //   431: aload_0
    //   432: invokespecial e : ()Ljava/lang/String;
    //   435: aload #4
    //   437: invokestatic a : (Lcom/google/android/gms/internal/ads/rb2;)Ljava/lang/String;
    //   440: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   445: pop
    //   446: aload_1
    //   447: invokeinterface commit : ()Z
    //   452: ifeq -> 458
    //   455: goto -> 461
    //   458: iconst_0
    //   459: istore #6
    //   461: new java/util/HashSet
    //   464: dup
    //   465: invokespecial <init> : ()V
    //   468: astore_1
    //   469: aload_0
    //   470: getstatic com/google/android/gms/internal/ads/mp1.a : I
    //   473: invokespecial f : (I)Lcom/google/android/gms/internal/ads/rb2;
    //   476: astore_2
    //   477: aload_2
    //   478: ifnull -> 492
    //   481: aload_1
    //   482: aload_2
    //   483: invokevirtual R : ()Ljava/lang/String;
    //   486: invokeinterface add : (Ljava/lang/Object;)Z
    //   491: pop
    //   492: aload_0
    //   493: getstatic com/google/android/gms/internal/ads/mp1.b : I
    //   496: invokespecial f : (I)Lcom/google/android/gms/internal/ads/rb2;
    //   499: astore_2
    //   500: aload_2
    //   501: ifnull -> 515
    //   504: aload_1
    //   505: aload_2
    //   506: invokevirtual R : ()Ljava/lang/String;
    //   509: invokeinterface add : (Ljava/lang/Object;)Z
    //   514: pop
    //   515: aload_0
    //   516: invokespecial c : ()Ljava/io/File;
    //   519: invokevirtual listFiles : ()[Ljava/io/File;
    //   522: astore_2
    //   523: aload_2
    //   524: arraylength
    //   525: istore #11
    //   527: iload #7
    //   529: istore #10
    //   531: iload #10
    //   533: iload #11
    //   535: if_icmpge -> 577
    //   538: aload_2
    //   539: iload #10
    //   541: aaload
    //   542: invokevirtual getName : ()Ljava/lang/String;
    //   545: astore #4
    //   547: aload_1
    //   548: aload #4
    //   550: invokeinterface contains : (Ljava/lang/Object;)Z
    //   555: ifne -> 571
    //   558: aload #4
    //   560: aload_0
    //   561: invokespecial c : ()Ljava/io/File;
    //   564: invokestatic b : (Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   567: invokestatic e : (Ljava/io/File;)Z
    //   570: pop
    //   571: iinc #10, 1
    //   574: goto -> 531
    //   577: iload #6
    //   579: ireturn
  }
  
  public final dp1 g(int paramInt) {
    rb2 rb2 = f(paramInt);
    if (rb2 == null)
      return null; 
    String str = rb2.R();
    File file1 = fp1.c(str, "pcam.jar", c());
    File file2 = file1;
    if (!file1.exists())
      file2 = fp1.c(str, "pcam", c()); 
    file1 = fp1.c(str, "pcopt", c());
    return new dp1(rb2, file2, fp1.c(str, "pcbc", c()), file1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gp1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */