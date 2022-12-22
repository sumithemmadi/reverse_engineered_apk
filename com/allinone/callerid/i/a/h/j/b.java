package com.allinone.callerid.i.a.h.j;

import android.content.Context;
import android.os.AsyncTask;
import org.json.JSONArray;

public class b {
  public static void a(Context paramContext, String paramString1, String paramString2, a parama) {
    try {
      a a1 = new a();
      this(paramContext, paramString1, paramString2, parama);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, JSONArray> {
    private a a;
    
    private Context b;
    
    private String c;
    
    private String d;
    
    private String e;
    
    a(Context param1Context, String param1String1, String param1String2, a param1a) {
      this.a = param1a;
      this.b = param1Context;
      this.c = param1String1;
      this.d = "0";
      this.e = param1String2;
    }
    
    protected JSONArray a(String... param1VarArgs) {
      // Byte code:
      //   0: new org/json/JSONArray
      //   3: dup
      //   4: invokespecial <init> : ()V
      //   7: astore_2
      //   8: ldc '0'
      //   10: aload_0
      //   11: getfield e : Ljava/lang/String;
      //   14: invokevirtual equals : (Ljava/lang/Object;)Z
      //   17: istore_3
      //   18: ldc '1'
      //   20: astore #4
      //   22: iload_3
      //   23: ifeq -> 55
      //   26: invokestatic A : ()J
      //   29: lconst_0
      //   30: lcmp
      //   31: ifeq -> 105
      //   34: aload_0
      //   35: invokestatic currentTimeMillis : ()J
      //   38: invokestatic A : ()J
      //   41: lsub
      //   42: ldc2_w 1000
      //   45: ldiv
      //   46: invokestatic valueOf : (J)Ljava/lang/String;
      //   49: putfield d : Ljava/lang/String;
      //   52: goto -> 105
      //   55: ldc '1'
      //   57: aload_0
      //   58: getfield e : Ljava/lang/String;
      //   61: invokevirtual equals : (Ljava/lang/Object;)Z
      //   64: ifeq -> 105
      //   67: invokestatic a : ()J
      //   70: lstore #5
      //   72: lload #5
      //   74: lconst_0
      //   75: lcmp
      //   76: ifeq -> 105
      //   79: lload #5
      //   81: invokestatic A : ()J
      //   84: lcmp
      //   85: ifle -> 105
      //   88: aload_0
      //   89: lload #5
      //   91: invokestatic A : ()J
      //   94: lsub
      //   95: ldc2_w 1000
      //   98: ldiv
      //   99: invokestatic valueOf : (J)Ljava/lang/String;
      //   102: putfield d : Ljava/lang/String;
      //   105: ldc2_w 1000
      //   108: invokestatic sleep : (J)V
      //   111: invokestatic s2 : ()Ljava/lang/Boolean;
      //   114: invokevirtual booleanValue : ()Z
      //   117: ifeq -> 132
      //   120: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
      //   123: invokestatic K2 : (Ljava/lang/Boolean;)V
      //   126: ldc '1'
      //   128: astore_1
      //   129: goto -> 135
      //   132: ldc '0'
      //   134: astore_1
      //   135: aload_1
      //   136: astore #7
      //   138: aload_1
      //   139: astore #8
      //   141: invokestatic r2 : ()Ljava/lang/Boolean;
      //   144: invokevirtual booleanValue : ()Z
      //   147: ifeq -> 160
      //   150: ldc '2'
      //   152: astore #8
      //   154: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
      //   157: invokestatic I2 : (Ljava/lang/Boolean;)V
      //   160: aload_0
      //   161: getfield b : Landroid/content/Context;
      //   164: ldc 'android.permission.READ_CALL_LOG'
      //   166: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
      //   169: istore #9
      //   171: ldc ''
      //   173: astore #10
      //   175: iload #9
      //   177: ifne -> 551
      //   180: aload_0
      //   181: getfield b : Landroid/content/Context;
      //   184: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
      //   187: astore #11
      //   189: getstatic android/provider/CallLog$Calls.CONTENT_URI : Landroid/net/Uri;
      //   192: astore #12
      //   194: aload_0
      //   195: getfield c : Ljava/lang/String;
      //   198: astore_1
      //   199: aload #11
      //   201: aload #12
      //   203: iconst_3
      //   204: anewarray java/lang/String
      //   207: dup
      //   208: iconst_0
      //   209: ldc 'date'
      //   211: aastore
      //   212: dup
      //   213: iconst_1
      //   214: ldc 'type'
      //   216: aastore
      //   217: dup
      //   218: iconst_2
      //   219: ldc 'duration'
      //   221: aastore
      //   222: ldc 'number=?'
      //   224: iconst_1
      //   225: anewarray java/lang/String
      //   228: dup
      //   229: iconst_0
      //   230: aload_1
      //   231: aastore
      //   232: ldc 'date DESC'
      //   234: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   237: astore #13
      //   239: aload #4
      //   241: astore #12
      //   243: aload #13
      //   245: ifnull -> 486
      //   248: aload #4
      //   250: astore #12
      //   252: aload #13
      //   254: invokeinterface getCount : ()I
      //   259: ifle -> 486
      //   262: aload #13
      //   264: invokeinterface moveToFirst : ()Z
      //   269: pop
      //   270: iconst_0
      //   271: istore #9
      //   273: aload #4
      //   275: astore_1
      //   276: aload_1
      //   277: astore #12
      //   279: iload #9
      //   281: aload #13
      //   283: invokeinterface getCount : ()I
      //   288: if_icmpge -> 486
      //   291: aload #13
      //   293: iload #9
      //   295: invokeinterface moveToPosition : (I)Z
      //   300: pop
      //   301: new java/util/Date
      //   304: astore #12
      //   306: aload #12
      //   308: aload #13
      //   310: aload #13
      //   312: ldc 'date'
      //   314: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   319: invokeinterface getLong : (I)J
      //   324: invokespecial <init> : (J)V
      //   327: aload #13
      //   329: aload #13
      //   331: ldc 'duration'
      //   333: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   338: invokeinterface getString : (I)Ljava/lang/String;
      //   343: astore #14
      //   345: aload #13
      //   347: aload #13
      //   349: ldc 'type'
      //   351: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   356: invokeinterface getInt : (I)I
      //   361: istore #15
      //   363: iload #15
      //   365: iconst_2
      //   366: if_icmpne -> 375
      //   369: iinc #9, 1
      //   372: goto -> 276
      //   375: aload #12
      //   377: invokevirtual getTime : ()J
      //   380: ldc2_w 1000
      //   383: ldiv
      //   384: invokestatic valueOf : (J)Ljava/lang/String;
      //   387: astore #16
      //   389: aload #12
      //   391: invokevirtual getTime : ()J
      //   394: invokestatic g : (J)Ljava/lang/String;
      //   397: astore #17
      //   399: iload #15
      //   401: iconst_1
      //   402: if_icmpne -> 444
      //   405: aload #14
      //   407: ifnull -> 441
      //   410: aload #14
      //   412: invokestatic parseInt : (Ljava/lang/String;)I
      //   415: ifle -> 441
      //   418: aload_0
      //   419: aload_1
      //   420: putfield e : Ljava/lang/String;
      //   423: aload #16
      //   425: astore #11
      //   427: aload #17
      //   429: astore #4
      //   431: aload_1
      //   432: astore #12
      //   434: aload #14
      //   436: astore #18
      //   438: goto -> 498
      //   441: goto -> 465
      //   444: aload_1
      //   445: astore #12
      //   447: aload #16
      //   449: astore #11
      //   451: aload #17
      //   453: astore #4
      //   455: aload #14
      //   457: astore #18
      //   459: iload #15
      //   461: iconst_5
      //   462: if_icmpne -> 498
      //   465: aload_1
      //   466: astore #7
      //   468: aload #16
      //   470: astore #11
      //   472: aload #17
      //   474: astore #4
      //   476: aload_1
      //   477: astore #12
      //   479: aload #14
      //   481: astore #18
      //   483: goto -> 498
      //   486: ldc '0'
      //   488: astore #11
      //   490: aload #11
      //   492: astore #18
      //   494: ldc ''
      //   496: astore #4
      //   498: aload #11
      //   500: astore #19
      //   502: aload #4
      //   504: astore #17
      //   506: aload #12
      //   508: astore_1
      //   509: aload #7
      //   511: astore #16
      //   513: aload #18
      //   515: astore #14
      //   517: aload #13
      //   519: ifnull -> 570
      //   522: aload #13
      //   524: invokeinterface close : ()V
      //   529: aload #11
      //   531: astore #19
      //   533: aload #4
      //   535: astore #17
      //   537: aload #12
      //   539: astore_1
      //   540: aload #7
      //   542: astore #16
      //   544: aload #18
      //   546: astore #14
      //   548: goto -> 570
      //   551: ldc '1'
      //   553: astore_1
      //   554: ldc '0'
      //   556: astore #19
      //   558: aload #19
      //   560: astore #14
      //   562: ldc ''
      //   564: astore #17
      //   566: aload #7
      //   568: astore #16
      //   570: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   573: aload_0
      //   574: getfield c : Ljava/lang/String;
      //   577: invokevirtual d : (Ljava/lang/String;)Lcom/allinone/callerid/model/EZSearchContacts;
      //   580: astore #4
      //   582: aload #4
      //   584: ifnull -> 721
      //   587: aload #4
      //   589: invokevirtual isSearched : ()Z
      //   592: ifeq -> 619
      //   595: aload #4
      //   597: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   600: ifnull -> 619
      //   603: ldc ''
      //   605: aload #4
      //   607: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   610: invokevirtual equals : (Ljava/lang/Object;)Z
      //   613: ifne -> 619
      //   616: goto -> 622
      //   619: ldc '-1'
      //   621: astore_1
      //   622: aload #4
      //   624: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   627: ifnull -> 700
      //   630: ldc ''
      //   632: aload #4
      //   634: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   637: invokevirtual equals : (Ljava/lang/Object;)Z
      //   640: ifne -> 700
      //   643: aload_0
      //   644: aload #4
      //   646: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   649: putfield c : Ljava/lang/String;
      //   652: aload_1
      //   653: astore #12
      //   655: aload #10
      //   657: astore #7
      //   659: aload #4
      //   661: invokevirtual getCc : ()Ljava/lang/String;
      //   664: ifnull -> 729
      //   667: aload_1
      //   668: astore #12
      //   670: aload #10
      //   672: astore #7
      //   674: ldc ''
      //   676: aload #4
      //   678: invokevirtual getCc : ()Ljava/lang/String;
      //   681: invokevirtual equals : (Ljava/lang/Object;)Z
      //   684: ifne -> 729
      //   687: aload #4
      //   689: invokevirtual getCc : ()Ljava/lang/String;
      //   692: astore #7
      //   694: aload_1
      //   695: astore #12
      //   697: goto -> 729
      //   700: aload_0
      //   701: aload_0
      //   702: getfield c : Ljava/lang/String;
      //   705: invokestatic o : (Ljava/lang/String;)Ljava/lang/String;
      //   708: putfield c : Ljava/lang/String;
      //   711: aload_1
      //   712: astore #12
      //   714: aload #10
      //   716: astore #7
      //   718: goto -> 729
      //   721: ldc '0'
      //   723: astore #12
      //   725: aload #10
      //   727: astore #7
      //   729: new org/json/JSONArray
      //   732: astore_1
      //   733: aload_1
      //   734: invokespecial <init> : ()V
      //   737: aload_1
      //   738: aload_0
      //   739: getfield c : Ljava/lang/String;
      //   742: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   745: pop
      //   746: aload_1
      //   747: aload #7
      //   749: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   752: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   755: pop
      //   756: aload_1
      //   757: aload #12
      //   759: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   762: pop
      //   763: aload_1
      //   764: aload #19
      //   766: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   769: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   772: pop
      //   773: aload_1
      //   774: aload_0
      //   775: getfield d : Ljava/lang/String;
      //   778: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   781: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   784: pop
      //   785: aload_1
      //   786: aload #14
      //   788: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   791: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   794: pop
      //   795: aload_1
      //   796: aload_0
      //   797: getfield e : Ljava/lang/String;
      //   800: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   803: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   806: pop
      //   807: aload_1
      //   808: aload #8
      //   810: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   813: pop
      //   814: aload_1
      //   815: ldc '0'
      //   817: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   820: pop
      //   821: aload_1
      //   822: ldc '0'
      //   824: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   827: pop
      //   828: aload_1
      //   829: ldc '0'
      //   831: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   834: pop
      //   835: aload_1
      //   836: ldc '0'
      //   838: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   841: pop
      //   842: aload_1
      //   843: aload #16
      //   845: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   848: pop
      //   849: aload_1
      //   850: aload #17
      //   852: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   855: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   858: pop
      //   859: aload_2
      //   860: aload_1
      //   861: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   864: pop
      //   865: getstatic com/allinone/callerid/util/d0.a : Z
      //   868: ifeq -> 912
      //   871: new java/lang/StringBuilder
      //   874: astore_1
      //   875: aload_1
      //   876: invokespecial <init> : ()V
      //   879: aload_1
      //   880: ldc 'tel_number_info'
      //   882: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   885: pop
      //   886: aload_1
      //   887: aload_2
      //   888: invokevirtual toString : ()Ljava/lang/String;
      //   891: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   894: pop
      //   895: ldc 'collectinfo'
      //   897: aload_1
      //   898: invokevirtual toString : ()Ljava/lang/String;
      //   901: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   904: goto -> 912
      //   907: astore_1
      //   908: aload_1
      //   909: invokevirtual printStackTrace : ()V
      //   912: aload_2
      //   913: areturn
      // Exception table:
      //   from	to	target	type
      //   8	18	907	java/lang/Exception
      //   26	52	907	java/lang/Exception
      //   55	72	907	java/lang/Exception
      //   79	105	907	java/lang/Exception
      //   105	126	907	java/lang/Exception
      //   141	150	907	java/lang/Exception
      //   154	160	907	java/lang/Exception
      //   160	171	907	java/lang/Exception
      //   180	239	907	java/lang/Exception
      //   252	270	907	java/lang/Exception
      //   279	363	907	java/lang/Exception
      //   375	399	907	java/lang/Exception
      //   410	418	907	java/lang/Exception
      //   418	423	907	java/lang/Exception
      //   522	529	907	java/lang/Exception
      //   570	582	907	java/lang/Exception
      //   587	616	907	java/lang/Exception
      //   622	652	907	java/lang/Exception
      //   659	667	907	java/lang/Exception
      //   674	694	907	java/lang/Exception
      //   700	711	907	java/lang/Exception
      //   729	904	907	java/lang/Exception
    }
    
    protected void b(JSONArray param1JSONArray) {
      super.onPostExecute(param1JSONArray);
      this.a.a(param1JSONArray);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/h/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */