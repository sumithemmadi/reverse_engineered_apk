package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class po {
  public static hh2 a(kt2 paramkt2) {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: lstore_1
    //   4: aload_0
    //   5: getfield c : Ljava/util/Map;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnonnull -> 15
    //   13: aconst_null
    //   14: areturn
    //   15: aload_3
    //   16: ldc 'Date'
    //   18: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast java/lang/String
    //   26: astore #4
    //   28: aload #4
    //   30: ifnull -> 43
    //   33: aload #4
    //   35: invokestatic c : (Ljava/lang/String;)J
    //   38: lstore #5
    //   40: goto -> 46
    //   43: lconst_0
    //   44: lstore #5
    //   46: aload_3
    //   47: ldc 'Cache-Control'
    //   49: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: checkcast java/lang/String
    //   57: astore #4
    //   59: iconst_0
    //   60: istore #7
    //   62: iconst_0
    //   63: istore #8
    //   65: aload #4
    //   67: ifnull -> 249
    //   70: aload #4
    //   72: ldc ','
    //   74: iconst_0
    //   75: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   78: astore #4
    //   80: iconst_0
    //   81: istore #7
    //   83: lconst_0
    //   84: lstore #9
    //   86: lconst_0
    //   87: lstore #11
    //   89: iload #8
    //   91: aload #4
    //   93: arraylength
    //   94: if_icmpge -> 243
    //   97: aload #4
    //   99: iload #8
    //   101: aaload
    //   102: invokevirtual trim : ()Ljava/lang/String;
    //   105: astore #13
    //   107: aload #13
    //   109: ldc 'no-cache'
    //   111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   114: ifne -> 241
    //   117: aload #13
    //   119: ldc 'no-store'
    //   121: invokevirtual equals : (Ljava/lang/Object;)Z
    //   124: ifeq -> 130
    //   127: goto -> 241
    //   130: aload #13
    //   132: ldc 'max-age='
    //   134: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   137: ifeq -> 159
    //   140: aload #13
    //   142: bipush #8
    //   144: invokevirtual substring : (I)Ljava/lang/String;
    //   147: invokestatic parseLong : (Ljava/lang/String;)J
    //   150: lstore #14
    //   152: lload #11
    //   154: lstore #16
    //   156: goto -> 227
    //   159: aload #13
    //   161: ldc 'stale-while-revalidate='
    //   163: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   166: ifeq -> 188
    //   169: aload #13
    //   171: bipush #23
    //   173: invokevirtual substring : (I)Ljava/lang/String;
    //   176: invokestatic parseLong : (Ljava/lang/String;)J
    //   179: lstore #16
    //   181: lload #9
    //   183: lstore #14
    //   185: goto -> 227
    //   188: aload #13
    //   190: ldc 'must-revalidate'
    //   192: invokevirtual equals : (Ljava/lang/Object;)Z
    //   195: ifne -> 216
    //   198: lload #9
    //   200: lstore #14
    //   202: lload #11
    //   204: lstore #16
    //   206: aload #13
    //   208: ldc 'proxy-revalidate'
    //   210: invokevirtual equals : (Ljava/lang/Object;)Z
    //   213: ifeq -> 227
    //   216: iconst_1
    //   217: istore #7
    //   219: lload #11
    //   221: lstore #16
    //   223: lload #9
    //   225: lstore #14
    //   227: iinc #8, 1
    //   230: lload #14
    //   232: lstore #9
    //   234: lload #16
    //   236: lstore #11
    //   238: goto -> 89
    //   241: aconst_null
    //   242: areturn
    //   243: iconst_1
    //   244: istore #8
    //   246: goto -> 258
    //   249: iconst_0
    //   250: istore #8
    //   252: lconst_0
    //   253: lstore #9
    //   255: lconst_0
    //   256: lstore #11
    //   258: aload_3
    //   259: ldc 'Expires'
    //   261: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   266: checkcast java/lang/String
    //   269: astore #4
    //   271: aload #4
    //   273: ifnull -> 286
    //   276: aload #4
    //   278: invokestatic c : (Ljava/lang/String;)J
    //   281: lstore #16
    //   283: goto -> 289
    //   286: lconst_0
    //   287: lstore #16
    //   289: aload_3
    //   290: ldc 'Last-Modified'
    //   292: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   297: checkcast java/lang/String
    //   300: astore #4
    //   302: aload #4
    //   304: ifnull -> 317
    //   307: aload #4
    //   309: invokestatic c : (Ljava/lang/String;)J
    //   312: lstore #14
    //   314: goto -> 320
    //   317: lconst_0
    //   318: lstore #14
    //   320: aload_3
    //   321: ldc 'ETag'
    //   323: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   328: checkcast java/lang/String
    //   331: astore #4
    //   333: iload #8
    //   335: ifeq -> 392
    //   338: lload_1
    //   339: lload #9
    //   341: ldc2_w 1000
    //   344: lmul
    //   345: ladd
    //   346: lstore #9
    //   348: iload #7
    //   350: ifeq -> 360
    //   353: lload #9
    //   355: lstore #11
    //   357: goto -> 377
    //   360: lload #11
    //   362: invokestatic signum : (J)I
    //   365: pop
    //   366: lload #11
    //   368: ldc2_w 1000
    //   371: lmul
    //   372: lload #9
    //   374: ladd
    //   375: lstore #11
    //   377: lload #11
    //   379: lstore #16
    //   381: lload #9
    //   383: lstore #11
    //   385: lload #16
    //   387: lstore #9
    //   389: goto -> 429
    //   392: lconst_0
    //   393: lstore #9
    //   395: lload #5
    //   397: lconst_0
    //   398: lcmp
    //   399: ifle -> 426
    //   402: lload #16
    //   404: lload #5
    //   406: lcmp
    //   407: iflt -> 426
    //   410: lload_1
    //   411: lload #16
    //   413: lload #5
    //   415: lsub
    //   416: ladd
    //   417: lstore #11
    //   419: lload #11
    //   421: lstore #9
    //   423: goto -> 429
    //   426: lconst_0
    //   427: lstore #11
    //   429: new com/google/android/gms/internal/ads/hh2
    //   432: dup
    //   433: invokespecial <init> : ()V
    //   436: astore #13
    //   438: aload #13
    //   440: aload_0
    //   441: getfield b : [B
    //   444: putfield a : [B
    //   447: aload #13
    //   449: aload #4
    //   451: putfield b : Ljava/lang/String;
    //   454: aload #13
    //   456: lload #11
    //   458: putfield f : J
    //   461: aload #13
    //   463: lload #9
    //   465: putfield e : J
    //   468: aload #13
    //   470: lload #5
    //   472: putfield c : J
    //   475: aload #13
    //   477: lload #14
    //   479: putfield d : J
    //   482: aload #13
    //   484: aload_3
    //   485: putfield g : Ljava/util/Map;
    //   488: aload #13
    //   490: aload_0
    //   491: getfield d : Ljava/util/List;
    //   494: putfield h : Ljava/util/List;
    //   497: aload #13
    //   499: areturn
    //   500: astore #13
    //   502: lload #9
    //   504: lstore #14
    //   506: lload #11
    //   508: lstore #16
    //   510: goto -> 227
    // Exception table:
    //   from	to	target	type
    //   140	152	500	java/lang/Exception
    //   169	181	500	java/lang/Exception
  }
  
  static String b(long paramLong) {
    return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(paramLong));
  }
  
  private static long c(String paramString) {
    try {
      return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(paramString).getTime();
    } catch (ParseException parseException) {
      if ("0".equals(paramString) || "-1".equals(paramString)) {
        ic.c("Unable to parse dateStr: %s, falling back to 0", new Object[] { paramString });
        return 0L;
      } 
      ic.e(parseException, "Unable to parse dateStr: %s, falling back to 0", new Object[] { paramString });
    } 
    return 0L;
  }
  
  private static SimpleDateFormat d(String paramString) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(paramString, Locale.US);
    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    return simpleDateFormat;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/po.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */