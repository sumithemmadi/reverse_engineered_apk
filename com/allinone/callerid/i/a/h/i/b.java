package com.allinone.callerid.i.a.h.i;

import android.content.Context;
import android.os.AsyncTask;
import org.json.JSONArray;

public class b {
  public static void a(Context paramContext, a parama) {
    try {
      a a1 = new a();
      this(paramContext, parama);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, JSONArray> {
    private a a;
    
    private Context b;
    
    a(Context param1Context, a param1a) {
      this.a = param1a;
      this.b = param1Context;
    }
    
    protected JSONArray a(String... param1VarArgs) {
      // Byte code:
      //   0: new org/json/JSONArray
      //   3: dup
      //   4: invokespecial <init> : ()V
      //   7: astore_2
      //   8: new java/util/ArrayList
      //   11: astore_3
      //   12: aload_3
      //   13: invokespecial <init> : ()V
      //   16: aload_0
      //   17: getfield b : Landroid/content/Context;
      //   20: ldc 'android.permission.READ_CALL_LOG'
      //   22: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
      //   25: istore #4
      //   27: iconst_0
      //   28: istore #5
      //   30: iload #4
      //   32: ifne -> 307
      //   35: aload_0
      //   36: getfield b : Landroid/content/Context;
      //   39: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
      //   42: getstatic android/provider/CallLog$Calls.CONTENT_URI : Landroid/net/Uri;
      //   45: iconst_4
      //   46: anewarray java/lang/String
      //   49: dup
      //   50: iconst_0
      //   51: ldc 'date'
      //   53: aastore
      //   54: dup
      //   55: iconst_1
      //   56: ldc 'number'
      //   58: aastore
      //   59: dup
      //   60: iconst_2
      //   61: ldc 'type'
      //   63: aastore
      //   64: dup
      //   65: iconst_3
      //   66: ldc 'duration'
      //   68: aastore
      //   69: aconst_null
      //   70: aconst_null
      //   71: ldc 'date DESC'
      //   73: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   76: astore #6
      //   78: aload #6
      //   80: ifnull -> 295
      //   83: aload #6
      //   85: invokeinterface getCount : ()I
      //   90: ifle -> 295
      //   93: aload #6
      //   95: invokeinterface moveToFirst : ()Z
      //   100: pop
      //   101: iconst_0
      //   102: istore #4
      //   104: iload #4
      //   106: aload #6
      //   108: invokeinterface getCount : ()I
      //   113: if_icmpge -> 295
      //   116: aload #6
      //   118: iload #4
      //   120: invokeinterface moveToPosition : (I)Z
      //   125: pop
      //   126: new java/util/Date
      //   129: astore #7
      //   131: aload #7
      //   133: aload #6
      //   135: aload #6
      //   137: ldc 'date'
      //   139: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   144: invokeinterface getLong : (I)J
      //   149: invokespecial <init> : (J)V
      //   152: aload #6
      //   154: aload #6
      //   156: ldc 'duration'
      //   158: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   163: invokeinterface getString : (I)Ljava/lang/String;
      //   168: astore #8
      //   170: aload #6
      //   172: aload #6
      //   174: ldc 'number'
      //   176: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   181: invokeinterface getString : (I)Ljava/lang/String;
      //   186: astore #9
      //   188: aload #6
      //   190: aload #6
      //   192: ldc 'type'
      //   194: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   199: invokeinterface getInt : (I)I
      //   204: istore #10
      //   206: iload #10
      //   208: iconst_2
      //   209: if_icmpne -> 215
      //   212: goto -> 289
      //   215: aload_0
      //   216: getfield b : Landroid/content/Context;
      //   219: aload #9
      //   221: invokestatic Y : (Landroid/content/Context;Ljava/lang/String;)Z
      //   224: ifne -> 289
      //   227: aload #7
      //   229: invokevirtual getTime : ()J
      //   232: invokestatic V : ()J
      //   235: lsub
      //   236: lconst_0
      //   237: lcmp
      //   238: ifle -> 289
      //   241: aload #9
      //   243: invokestatic v0 : (Ljava/lang/String;)Z
      //   246: ifne -> 289
      //   249: new com/allinone/callerid/search/CallLogBean
      //   252: astore_1
      //   253: aload_1
      //   254: invokespecial <init> : ()V
      //   257: aload_1
      //   258: aload #9
      //   260: invokevirtual D0 : (Ljava/lang/String;)V
      //   263: aload_1
      //   264: iload #10
      //   266: invokevirtual c1 : (I)V
      //   269: aload_1
      //   270: aload #7
      //   272: invokevirtual d0 : (Ljava/util/Date;)V
      //   275: aload_1
      //   276: aload #8
      //   278: invokevirtual s0 : (Ljava/lang/String;)V
      //   281: aload_3
      //   282: aload_1
      //   283: invokeinterface add : (Ljava/lang/Object;)Z
      //   288: pop
      //   289: iinc #4, 1
      //   292: goto -> 104
      //   295: aload #6
      //   297: ifnull -> 307
      //   300: aload #6
      //   302: invokeinterface close : ()V
      //   307: aload_3
      //   308: invokeinterface size : ()I
      //   313: ifle -> 780
      //   316: iload #5
      //   318: istore #4
      //   320: iload #4
      //   322: aload_3
      //   323: invokeinterface size : ()I
      //   328: if_icmpge -> 780
      //   331: aload_3
      //   332: iload #4
      //   334: invokeinterface get : (I)Ljava/lang/Object;
      //   339: checkcast com/allinone/callerid/search/CallLogBean
      //   342: astore #7
      //   344: aload #7
      //   346: invokevirtual p : ()Ljava/lang/String;
      //   349: astore #9
      //   351: aload #7
      //   353: invokevirtual h : ()Ljava/lang/String;
      //   356: astore #11
      //   358: aload #7
      //   360: invokevirtual M : ()I
      //   363: istore #5
      //   365: ldc '1'
      //   367: astore #6
      //   369: iload #5
      //   371: iconst_1
      //   372: if_icmpne -> 408
      //   375: aload #11
      //   377: ifnull -> 398
      //   380: aload #11
      //   382: invokestatic parseInt : (Ljava/lang/String;)I
      //   385: ifle -> 398
      //   388: ldc '1'
      //   390: astore_1
      //   391: ldc '0'
      //   393: astore #8
      //   395: goto -> 426
      //   398: ldc '1'
      //   400: astore #8
      //   402: ldc '0'
      //   404: astore_1
      //   405: goto -> 426
      //   408: aload #7
      //   410: invokevirtual M : ()I
      //   413: iconst_5
      //   414: if_icmpne -> 420
      //   417: goto -> 398
      //   420: ldc '0'
      //   422: astore_1
      //   423: aload_1
      //   424: astore #8
      //   426: aload #7
      //   428: invokevirtual b : ()Ljava/util/Date;
      //   431: invokevirtual getTime : ()J
      //   434: ldc2_w 1000
      //   437: ldiv
      //   438: lstore #12
      //   440: aload #7
      //   442: invokevirtual b : ()Ljava/util/Date;
      //   445: invokevirtual getTime : ()J
      //   448: invokestatic g : (J)Ljava/lang/String;
      //   451: astore #14
      //   453: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   456: aload #9
      //   458: invokevirtual d : (Ljava/lang/String;)Lcom/allinone/callerid/model/EZSearchContacts;
      //   461: astore #15
      //   463: ldc ''
      //   465: astore #16
      //   467: aload #15
      //   469: ifnull -> 617
      //   472: aload #15
      //   474: invokevirtual isSearched : ()Z
      //   477: ifeq -> 504
      //   480: aload #15
      //   482: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   485: ifnull -> 504
      //   488: ldc ''
      //   490: aload #15
      //   492: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   495: invokevirtual equals : (Ljava/lang/Object;)Z
      //   498: ifne -> 504
      //   501: goto -> 508
      //   504: ldc '-1'
      //   506: astore #6
      //   508: aload #15
      //   510: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   513: ifnull -> 599
      //   516: ldc ''
      //   518: aload #15
      //   520: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   523: invokevirtual equals : (Ljava/lang/Object;)Z
      //   526: ifne -> 599
      //   529: aload #15
      //   531: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   534: astore #17
      //   536: aload #17
      //   538: astore #9
      //   540: aload #6
      //   542: astore #18
      //   544: aload #16
      //   546: astore #7
      //   548: aload #15
      //   550: invokevirtual getCc : ()Ljava/lang/String;
      //   553: ifnull -> 625
      //   556: aload #17
      //   558: astore #9
      //   560: aload #6
      //   562: astore #18
      //   564: aload #16
      //   566: astore #7
      //   568: ldc ''
      //   570: aload #15
      //   572: invokevirtual getCc : ()Ljava/lang/String;
      //   575: invokevirtual equals : (Ljava/lang/Object;)Z
      //   578: ifne -> 625
      //   581: aload #15
      //   583: invokevirtual getCc : ()Ljava/lang/String;
      //   586: astore #7
      //   588: aload #17
      //   590: astore #9
      //   592: aload #6
      //   594: astore #18
      //   596: goto -> 625
      //   599: aload #9
      //   601: invokestatic o : (Ljava/lang/String;)Ljava/lang/String;
      //   604: astore #9
      //   606: aload #6
      //   608: astore #18
      //   610: aload #16
      //   612: astore #7
      //   614: goto -> 625
      //   617: ldc '0'
      //   619: astore #18
      //   621: aload #16
      //   623: astore #7
      //   625: new org/json/JSONArray
      //   628: astore #6
      //   630: aload #6
      //   632: invokespecial <init> : ()V
      //   635: aload #6
      //   637: aload #9
      //   639: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   642: pop
      //   643: aload #6
      //   645: aload #7
      //   647: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   650: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   653: pop
      //   654: aload #6
      //   656: aload #18
      //   658: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   661: pop
      //   662: aload #6
      //   664: lload #12
      //   666: invokestatic valueOf : (J)Ljava/lang/String;
      //   669: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   672: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   675: pop
      //   676: aload #6
      //   678: ldc '0'
      //   680: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   683: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   686: pop
      //   687: aload #6
      //   689: aload #11
      //   691: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   694: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   697: pop
      //   698: aload #6
      //   700: aload_1
      //   701: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   704: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   707: pop
      //   708: aload #6
      //   710: ldc '0'
      //   712: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   715: pop
      //   716: aload #6
      //   718: ldc '0'
      //   720: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   723: pop
      //   724: aload #6
      //   726: ldc '0'
      //   728: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   731: pop
      //   732: aload #6
      //   734: ldc '0'
      //   736: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   739: pop
      //   740: aload #6
      //   742: ldc '0'
      //   744: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   747: pop
      //   748: aload #6
      //   750: aload #8
      //   752: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   755: pop
      //   756: aload #6
      //   758: aload #14
      //   760: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   763: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   766: pop
      //   767: aload_2
      //   768: aload #6
      //   770: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   773: pop
      //   774: iinc #4, 1
      //   777: goto -> 320
      //   780: getstatic com/allinone/callerid/util/d0.a : Z
      //   783: ifeq -> 827
      //   786: new java/lang/StringBuilder
      //   789: astore_1
      //   790: aload_1
      //   791: invokespecial <init> : ()V
      //   794: aload_1
      //   795: ldc 'tel_number_info'
      //   797: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   800: pop
      //   801: aload_1
      //   802: aload_2
      //   803: invokevirtual toString : ()Ljava/lang/String;
      //   806: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   809: pop
      //   810: ldc 'collectinfo'
      //   812: aload_1
      //   813: invokevirtual toString : ()Ljava/lang/String;
      //   816: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   819: goto -> 827
      //   822: astore_1
      //   823: aload_1
      //   824: invokevirtual printStackTrace : ()V
      //   827: aload_2
      //   828: areturn
      // Exception table:
      //   from	to	target	type
      //   8	27	822	java/lang/Exception
      //   35	78	822	java/lang/Exception
      //   83	101	822	java/lang/Exception
      //   104	206	822	java/lang/Exception
      //   215	289	822	java/lang/Exception
      //   300	307	822	java/lang/Exception
      //   307	316	822	java/lang/Exception
      //   320	365	822	java/lang/Exception
      //   380	388	822	java/lang/Exception
      //   408	417	822	java/lang/Exception
      //   426	463	822	java/lang/Exception
      //   472	501	822	java/lang/Exception
      //   508	536	822	java/lang/Exception
      //   548	556	822	java/lang/Exception
      //   568	588	822	java/lang/Exception
      //   599	606	822	java/lang/Exception
      //   625	774	822	java/lang/Exception
      //   780	819	822	java/lang/Exception
    }
    
    protected void b(JSONArray param1JSONArray) {
      super.onPostExecute(param1JSONArray);
      this.a.a(param1JSONArray);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/h/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */