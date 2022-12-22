package com.allinone.callerid.i.a.h.l;

import android.content.Context;
import android.os.AsyncTask;
import org.json.JSONArray;

public class b {
  public static void a(Context paramContext, String paramString, a parama) {
    try {
      a a1 = new a();
      this(paramContext, paramString, parama);
      if (a1.getStatus() != AsyncTask.Status.RUNNING) {
        a1.cancel(true);
        a1 = new a();
        this(paramContext, paramString, parama);
        a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, JSONArray> {
    private a a;
    
    private Context b;
    
    private String c;
    
    a(Context param1Context, String param1String, a param1a) {
      this.a = param1a;
      this.b = param1Context;
      this.c = param1String;
    }
    
    protected JSONArray a(String... param1VarArgs) {
      // Byte code:
      //   0: new org/json/JSONArray
      //   3: dup
      //   4: invokespecial <init> : ()V
      //   7: astore_2
      //   8: aload_0
      //   9: getfield c : Ljava/lang/String;
      //   12: invokestatic v0 : (Ljava/lang/String;)Z
      //   15: ifne -> 747
      //   18: aload_0
      //   19: getfield b : Landroid/content/Context;
      //   22: aload_0
      //   23: getfield c : Ljava/lang/String;
      //   26: invokestatic Y : (Landroid/content/Context;Ljava/lang/String;)Z
      //   29: ifne -> 747
      //   32: aconst_null
      //   33: astore_3
      //   34: aconst_null
      //   35: astore #4
      //   37: aload_0
      //   38: getfield b : Landroid/content/Context;
      //   41: ldc 'android.permission.READ_CALL_LOG'
      //   43: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
      //   46: ifne -> 305
      //   49: iconst_0
      //   50: istore #5
      //   52: aload_0
      //   53: getfield b : Landroid/content/Context;
      //   56: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
      //   59: astore_1
      //   60: getstatic android/provider/CallLog$Calls.CONTENT_URI : Landroid/net/Uri;
      //   63: astore #6
      //   65: aload_0
      //   66: getfield c : Ljava/lang/String;
      //   69: astore_3
      //   70: aload_1
      //   71: aload #6
      //   73: iconst_4
      //   74: anewarray java/lang/String
      //   77: dup
      //   78: iconst_0
      //   79: ldc 'date'
      //   81: aastore
      //   82: dup
      //   83: iconst_1
      //   84: ldc 'number'
      //   86: aastore
      //   87: dup
      //   88: iconst_2
      //   89: ldc 'type'
      //   91: aastore
      //   92: dup
      //   93: iconst_3
      //   94: ldc 'duration'
      //   96: aastore
      //   97: ldc 'number=?'
      //   99: iconst_1
      //   100: anewarray java/lang/String
      //   103: dup
      //   104: iconst_0
      //   105: aload_3
      //   106: aastore
      //   107: ldc 'date DESC'
      //   109: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   112: astore #6
      //   114: aload #4
      //   116: astore_1
      //   117: aload #6
      //   119: ifnull -> 289
      //   122: aload #4
      //   124: astore_1
      //   125: aload #6
      //   127: invokeinterface getCount : ()I
      //   132: ifle -> 289
      //   135: aload #6
      //   137: invokeinterface moveToFirst : ()Z
      //   142: pop
      //   143: aload #4
      //   145: astore_1
      //   146: iload #5
      //   148: aload #6
      //   150: invokeinterface getCount : ()I
      //   155: if_icmpge -> 289
      //   158: aload #6
      //   160: iload #5
      //   162: invokeinterface moveToPosition : (I)Z
      //   167: pop
      //   168: new java/util/Date
      //   171: astore_3
      //   172: aload_3
      //   173: aload #6
      //   175: aload #6
      //   177: ldc 'date'
      //   179: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   184: invokeinterface getLong : (I)J
      //   189: invokespecial <init> : (J)V
      //   192: aload #6
      //   194: aload #6
      //   196: ldc 'duration'
      //   198: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   203: invokeinterface getString : (I)Ljava/lang/String;
      //   208: astore #7
      //   210: aload #6
      //   212: aload #6
      //   214: ldc 'number'
      //   216: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   221: invokeinterface getString : (I)Ljava/lang/String;
      //   226: astore #8
      //   228: aload #6
      //   230: aload #6
      //   232: ldc 'type'
      //   234: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   239: invokeinterface getInt : (I)I
      //   244: istore #9
      //   246: iload #9
      //   248: iconst_2
      //   249: if_icmpne -> 258
      //   252: iinc #5, 1
      //   255: goto -> 143
      //   258: new com/allinone/callerid/search/CallLogBean
      //   261: astore_1
      //   262: aload_1
      //   263: invokespecial <init> : ()V
      //   266: aload_1
      //   267: aload #8
      //   269: invokevirtual D0 : (Ljava/lang/String;)V
      //   272: aload_1
      //   273: iload #9
      //   275: invokevirtual c1 : (I)V
      //   278: aload_1
      //   279: aload_3
      //   280: invokevirtual d0 : (Ljava/util/Date;)V
      //   283: aload_1
      //   284: aload #7
      //   286: invokevirtual s0 : (Ljava/lang/String;)V
      //   289: aload_1
      //   290: astore_3
      //   291: aload #6
      //   293: ifnull -> 305
      //   296: aload #6
      //   298: invokeinterface close : ()V
      //   303: aload_1
      //   304: astore_3
      //   305: ldc '1'
      //   307: astore #10
      //   309: ldc ''
      //   311: astore #11
      //   313: aload_3
      //   314: ifnull -> 426
      //   317: aload_3
      //   318: invokevirtual h : ()Ljava/lang/String;
      //   321: astore #7
      //   323: aload_3
      //   324: invokevirtual M : ()I
      //   327: iconst_1
      //   328: if_icmpne -> 364
      //   331: aload #7
      //   333: ifnull -> 354
      //   336: aload #7
      //   338: invokestatic parseInt : (Ljava/lang/String;)I
      //   341: ifle -> 354
      //   344: ldc '1'
      //   346: astore_1
      //   347: ldc '0'
      //   349: astore #4
      //   351: goto -> 381
      //   354: ldc '1'
      //   356: astore #4
      //   358: ldc '0'
      //   360: astore_1
      //   361: goto -> 381
      //   364: aload_3
      //   365: invokevirtual M : ()I
      //   368: iconst_5
      //   369: if_icmpne -> 375
      //   372: goto -> 354
      //   375: ldc '0'
      //   377: astore_1
      //   378: aload_1
      //   379: astore #4
      //   381: aload_3
      //   382: invokevirtual b : ()Ljava/util/Date;
      //   385: invokevirtual getTime : ()J
      //   388: ldc2_w 1000
      //   391: ldiv
      //   392: lstore #12
      //   394: aload_3
      //   395: invokevirtual b : ()Ljava/util/Date;
      //   398: invokevirtual getTime : ()J
      //   401: invokestatic g : (J)Ljava/lang/String;
      //   404: astore #6
      //   406: lload #12
      //   408: invokestatic valueOf : (J)Ljava/lang/String;
      //   411: astore #14
      //   413: aload #4
      //   415: astore #8
      //   417: ldc '1'
      //   419: astore_3
      //   420: aload_1
      //   421: astore #4
      //   423: goto -> 454
      //   426: ldc '2'
      //   428: astore_3
      //   429: ldc ''
      //   431: astore #6
      //   433: ldc '0'
      //   435: astore #7
      //   437: aload #7
      //   439: astore_1
      //   440: aload_1
      //   441: astore #4
      //   443: aload #4
      //   445: astore #14
      //   447: aload #4
      //   449: astore #8
      //   451: aload_1
      //   452: astore #4
      //   454: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   457: aload_0
      //   458: getfield c : Ljava/lang/String;
      //   461: invokevirtual d : (Ljava/lang/String;)Lcom/allinone/callerid/model/EZSearchContacts;
      //   464: astore #15
      //   466: aload #15
      //   468: ifnull -> 608
      //   471: aload #15
      //   473: invokevirtual isSearched : ()Z
      //   476: ifeq -> 506
      //   479: aload #15
      //   481: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   484: ifnull -> 506
      //   487: ldc ''
      //   489: aload #15
      //   491: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   494: invokevirtual equals : (Ljava/lang/Object;)Z
      //   497: ifne -> 506
      //   500: aload #10
      //   502: astore_1
      //   503: goto -> 509
      //   506: ldc '-1'
      //   508: astore_1
      //   509: aload #15
      //   511: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   514: ifnull -> 587
      //   517: ldc ''
      //   519: aload #15
      //   521: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   524: invokevirtual equals : (Ljava/lang/Object;)Z
      //   527: ifne -> 587
      //   530: aload_0
      //   531: aload #15
      //   533: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   536: putfield c : Ljava/lang/String;
      //   539: aload_1
      //   540: astore #16
      //   542: aload #11
      //   544: astore #10
      //   546: aload #15
      //   548: invokevirtual getCc : ()Ljava/lang/String;
      //   551: ifnull -> 616
      //   554: aload_1
      //   555: astore #16
      //   557: aload #11
      //   559: astore #10
      //   561: ldc ''
      //   563: aload #15
      //   565: invokevirtual getCc : ()Ljava/lang/String;
      //   568: invokevirtual equals : (Ljava/lang/Object;)Z
      //   571: ifne -> 616
      //   574: aload #15
      //   576: invokevirtual getCc : ()Ljava/lang/String;
      //   579: astore #10
      //   581: aload_1
      //   582: astore #16
      //   584: goto -> 616
      //   587: aload_0
      //   588: aload_0
      //   589: getfield c : Ljava/lang/String;
      //   592: invokestatic o : (Ljava/lang/String;)Ljava/lang/String;
      //   595: putfield c : Ljava/lang/String;
      //   598: aload_1
      //   599: astore #16
      //   601: aload #11
      //   603: astore #10
      //   605: goto -> 616
      //   608: ldc '0'
      //   610: astore #16
      //   612: aload #11
      //   614: astore #10
      //   616: new org/json/JSONArray
      //   619: astore_1
      //   620: aload_1
      //   621: invokespecial <init> : ()V
      //   624: aload_1
      //   625: aload_0
      //   626: getfield c : Ljava/lang/String;
      //   629: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   632: pop
      //   633: aload_1
      //   634: aload #10
      //   636: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   639: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   642: pop
      //   643: aload_1
      //   644: aload #16
      //   646: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   649: pop
      //   650: aload_1
      //   651: aload #14
      //   653: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   656: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   659: pop
      //   660: aload_1
      //   661: ldc '0'
      //   663: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   666: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   669: pop
      //   670: aload_1
      //   671: aload #7
      //   673: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   676: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   679: pop
      //   680: aload_1
      //   681: aload #4
      //   683: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   686: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   689: pop
      //   690: aload_1
      //   691: ldc '0'
      //   693: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   696: pop
      //   697: aload_1
      //   698: ldc '0'
      //   700: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   703: pop
      //   704: aload_1
      //   705: ldc '0'
      //   707: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   710: pop
      //   711: aload_1
      //   712: ldc '0'
      //   714: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   717: pop
      //   718: aload_1
      //   719: aload_3
      //   720: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   723: pop
      //   724: aload_1
      //   725: aload #8
      //   727: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   730: pop
      //   731: aload_1
      //   732: aload #6
      //   734: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   737: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   740: pop
      //   741: aload_2
      //   742: aload_1
      //   743: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   746: pop
      //   747: getstatic com/allinone/callerid/util/d0.a : Z
      //   750: ifeq -> 794
      //   753: new java/lang/StringBuilder
      //   756: astore_1
      //   757: aload_1
      //   758: invokespecial <init> : ()V
      //   761: aload_1
      //   762: ldc 'tel_number_info'
      //   764: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   767: pop
      //   768: aload_1
      //   769: aload_2
      //   770: invokevirtual toString : ()Ljava/lang/String;
      //   773: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   776: pop
      //   777: ldc 'collectinfo'
      //   779: aload_1
      //   780: invokevirtual toString : ()Ljava/lang/String;
      //   783: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   786: goto -> 794
      //   789: astore_1
      //   790: aload_1
      //   791: invokevirtual printStackTrace : ()V
      //   794: aload_2
      //   795: areturn
      // Exception table:
      //   from	to	target	type
      //   8	32	789	java/lang/Exception
      //   37	49	789	java/lang/Exception
      //   52	114	789	java/lang/Exception
      //   125	143	789	java/lang/Exception
      //   146	246	789	java/lang/Exception
      //   258	289	789	java/lang/Exception
      //   296	303	789	java/lang/Exception
      //   317	331	789	java/lang/Exception
      //   336	344	789	java/lang/Exception
      //   364	372	789	java/lang/Exception
      //   381	413	789	java/lang/Exception
      //   454	466	789	java/lang/Exception
      //   471	500	789	java/lang/Exception
      //   509	539	789	java/lang/Exception
      //   546	554	789	java/lang/Exception
      //   561	581	789	java/lang/Exception
      //   587	598	789	java/lang/Exception
      //   616	747	789	java/lang/Exception
      //   747	786	789	java/lang/Exception
    }
    
    protected void b(JSONArray param1JSONArray) {
      super.onPostExecute(param1JSONArray);
      this.a.a(param1JSONArray);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/h/l/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */