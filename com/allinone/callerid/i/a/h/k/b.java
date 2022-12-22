package com.allinone.callerid.i.a.h.k;

import android.content.Context;
import android.os.AsyncTask;
import org.json.JSONArray;

public class b {
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, a parama) {
    try {
      a a1 = new a();
      this(paramContext, paramString1, paramString2, paramString3, paramString4, paramString5, parama);
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
    
    private String f;
    
    private String g;
    
    a(Context param1Context, String param1String1, String param1String2, String param1String3, String param1String4, String param1String5, a param1a) {
      this.a = param1a;
      this.b = param1Context;
      this.c = param1String1;
      this.d = param1String2;
      this.e = param1String3;
      this.f = param1String4;
      this.g = param1String5;
    }
    
    protected JSONArray a(String... param1VarArgs) {
      // Byte code:
      //   0: new org/json/JSONArray
      //   3: dup
      //   4: invokespecial <init> : ()V
      //   7: astore_2
      //   8: aload_0
      //   9: getfield b : Landroid/content/Context;
      //   12: aload_0
      //   13: getfield c : Ljava/lang/String;
      //   16: invokestatic Y : (Landroid/content/Context;Ljava/lang/String;)Z
      //   19: ifne -> 725
      //   22: aconst_null
      //   23: astore_3
      //   24: aconst_null
      //   25: astore #4
      //   27: aload_0
      //   28: getfield b : Landroid/content/Context;
      //   31: ldc 'android.permission.READ_CALL_LOG'
      //   33: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
      //   36: ifne -> 295
      //   39: iconst_0
      //   40: istore #5
      //   42: aload_0
      //   43: getfield b : Landroid/content/Context;
      //   46: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
      //   49: astore_1
      //   50: getstatic android/provider/CallLog$Calls.CONTENT_URI : Landroid/net/Uri;
      //   53: astore #6
      //   55: aload_0
      //   56: getfield c : Ljava/lang/String;
      //   59: astore_3
      //   60: aload_1
      //   61: aload #6
      //   63: iconst_4
      //   64: anewarray java/lang/String
      //   67: dup
      //   68: iconst_0
      //   69: ldc 'date'
      //   71: aastore
      //   72: dup
      //   73: iconst_1
      //   74: ldc 'number'
      //   76: aastore
      //   77: dup
      //   78: iconst_2
      //   79: ldc 'type'
      //   81: aastore
      //   82: dup
      //   83: iconst_3
      //   84: ldc 'duration'
      //   86: aastore
      //   87: ldc 'number=?'
      //   89: iconst_1
      //   90: anewarray java/lang/String
      //   93: dup
      //   94: iconst_0
      //   95: aload_3
      //   96: aastore
      //   97: ldc 'date DESC'
      //   99: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   102: astore #6
      //   104: aload #4
      //   106: astore_1
      //   107: aload #6
      //   109: ifnull -> 279
      //   112: aload #4
      //   114: astore_1
      //   115: aload #6
      //   117: invokeinterface getCount : ()I
      //   122: ifle -> 279
      //   125: aload #6
      //   127: invokeinterface moveToFirst : ()Z
      //   132: pop
      //   133: aload #4
      //   135: astore_1
      //   136: iload #5
      //   138: aload #6
      //   140: invokeinterface getCount : ()I
      //   145: if_icmpge -> 279
      //   148: aload #6
      //   150: iload #5
      //   152: invokeinterface moveToPosition : (I)Z
      //   157: pop
      //   158: new java/util/Date
      //   161: astore_3
      //   162: aload_3
      //   163: aload #6
      //   165: aload #6
      //   167: ldc 'date'
      //   169: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   174: invokeinterface getLong : (I)J
      //   179: invokespecial <init> : (J)V
      //   182: aload #6
      //   184: aload #6
      //   186: ldc 'duration'
      //   188: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   193: invokeinterface getString : (I)Ljava/lang/String;
      //   198: astore #7
      //   200: aload #6
      //   202: aload #6
      //   204: ldc 'number'
      //   206: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   211: invokeinterface getString : (I)Ljava/lang/String;
      //   216: astore #8
      //   218: aload #6
      //   220: aload #6
      //   222: ldc 'type'
      //   224: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   229: invokeinterface getInt : (I)I
      //   234: istore #9
      //   236: iload #9
      //   238: iconst_2
      //   239: if_icmpne -> 248
      //   242: iinc #5, 1
      //   245: goto -> 133
      //   248: new com/allinone/callerid/search/CallLogBean
      //   251: astore_1
      //   252: aload_1
      //   253: invokespecial <init> : ()V
      //   256: aload_1
      //   257: aload #8
      //   259: invokevirtual D0 : (Ljava/lang/String;)V
      //   262: aload_1
      //   263: iload #9
      //   265: invokevirtual c1 : (I)V
      //   268: aload_1
      //   269: aload_3
      //   270: invokevirtual d0 : (Ljava/util/Date;)V
      //   273: aload_1
      //   274: aload #7
      //   276: invokevirtual s0 : (Ljava/lang/String;)V
      //   279: aload_1
      //   280: astore_3
      //   281: aload #6
      //   283: ifnull -> 295
      //   286: aload #6
      //   288: invokeinterface close : ()V
      //   293: aload_1
      //   294: astore_3
      //   295: ldc '1'
      //   297: astore #10
      //   299: ldc ''
      //   301: astore #11
      //   303: aload_3
      //   304: ifnull -> 404
      //   307: aload_3
      //   308: invokevirtual h : ()Ljava/lang/String;
      //   311: astore #6
      //   313: aload_3
      //   314: invokevirtual M : ()I
      //   317: iconst_1
      //   318: if_icmpne -> 354
      //   321: aload #6
      //   323: ifnull -> 344
      //   326: aload #6
      //   328: invokestatic parseInt : (Ljava/lang/String;)I
      //   331: ifle -> 344
      //   334: ldc '1'
      //   336: astore_1
      //   337: ldc '0'
      //   339: astore #4
      //   341: goto -> 371
      //   344: ldc '1'
      //   346: astore #4
      //   348: ldc '0'
      //   350: astore_1
      //   351: goto -> 371
      //   354: aload_3
      //   355: invokevirtual M : ()I
      //   358: iconst_5
      //   359: if_icmpne -> 365
      //   362: goto -> 344
      //   365: ldc '0'
      //   367: astore_1
      //   368: aload_1
      //   369: astore #4
      //   371: aload_3
      //   372: invokevirtual b : ()Ljava/util/Date;
      //   375: invokevirtual getTime : ()J
      //   378: ldc2_w 1000
      //   381: ldiv
      //   382: invokestatic valueOf : (J)Ljava/lang/String;
      //   385: astore #7
      //   387: aload_3
      //   388: invokevirtual b : ()Ljava/util/Date;
      //   391: invokevirtual getTime : ()J
      //   394: invokestatic g : (J)Ljava/lang/String;
      //   397: astore_3
      //   398: aload_1
      //   399: astore #8
      //   401: goto -> 424
      //   404: ldc ''
      //   406: astore_3
      //   407: ldc '0'
      //   409: astore #6
      //   411: aload #6
      //   413: astore_1
      //   414: aload_1
      //   415: astore #4
      //   417: aload #4
      //   419: astore #7
      //   421: aload_1
      //   422: astore #8
      //   424: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   427: aload_0
      //   428: getfield c : Ljava/lang/String;
      //   431: invokevirtual d : (Ljava/lang/String;)Lcom/allinone/callerid/model/EZSearchContacts;
      //   434: astore #12
      //   436: aload #12
      //   438: ifnull -> 578
      //   441: aload #12
      //   443: invokevirtual isSearched : ()Z
      //   446: ifeq -> 476
      //   449: aload #12
      //   451: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   454: ifnull -> 476
      //   457: ldc ''
      //   459: aload #12
      //   461: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   464: invokevirtual equals : (Ljava/lang/Object;)Z
      //   467: ifne -> 476
      //   470: aload #10
      //   472: astore_1
      //   473: goto -> 479
      //   476: ldc '-1'
      //   478: astore_1
      //   479: aload #12
      //   481: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   484: ifnull -> 557
      //   487: ldc ''
      //   489: aload #12
      //   491: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   494: invokevirtual equals : (Ljava/lang/Object;)Z
      //   497: ifne -> 557
      //   500: aload_0
      //   501: aload #12
      //   503: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   506: putfield c : Ljava/lang/String;
      //   509: aload #11
      //   511: astore #13
      //   513: aload_1
      //   514: astore #10
      //   516: aload #12
      //   518: invokevirtual getCc : ()Ljava/lang/String;
      //   521: ifnull -> 586
      //   524: aload #11
      //   526: astore #13
      //   528: aload_1
      //   529: astore #10
      //   531: ldc ''
      //   533: aload #12
      //   535: invokevirtual getCc : ()Ljava/lang/String;
      //   538: invokevirtual equals : (Ljava/lang/Object;)Z
      //   541: ifne -> 586
      //   544: aload #12
      //   546: invokevirtual getCc : ()Ljava/lang/String;
      //   549: astore #13
      //   551: aload_1
      //   552: astore #10
      //   554: goto -> 586
      //   557: aload_0
      //   558: aload_0
      //   559: getfield c : Ljava/lang/String;
      //   562: invokestatic o : (Ljava/lang/String;)Ljava/lang/String;
      //   565: putfield c : Ljava/lang/String;
      //   568: aload #11
      //   570: astore #13
      //   572: aload_1
      //   573: astore #10
      //   575: goto -> 586
      //   578: ldc '0'
      //   580: astore #10
      //   582: aload #11
      //   584: astore #13
      //   586: new org/json/JSONArray
      //   589: astore_1
      //   590: aload_1
      //   591: invokespecial <init> : ()V
      //   594: aload_1
      //   595: aload_0
      //   596: getfield c : Ljava/lang/String;
      //   599: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   602: pop
      //   603: aload_1
      //   604: aload #13
      //   606: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   609: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   612: pop
      //   613: aload_1
      //   614: aload #10
      //   616: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   619: pop
      //   620: aload_1
      //   621: aload #7
      //   623: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   626: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   629: pop
      //   630: aload_1
      //   631: ldc '0'
      //   633: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   636: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   639: pop
      //   640: aload_1
      //   641: aload #6
      //   643: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   646: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   649: pop
      //   650: aload_1
      //   651: aload #8
      //   653: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   656: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   659: pop
      //   660: aload_1
      //   661: aload_0
      //   662: getfield d : Ljava/lang/String;
      //   665: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   668: pop
      //   669: aload_1
      //   670: aload_0
      //   671: getfield e : Ljava/lang/String;
      //   674: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   677: pop
      //   678: aload_1
      //   679: aload_0
      //   680: getfield f : Ljava/lang/String;
      //   683: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   686: pop
      //   687: aload_1
      //   688: aload_0
      //   689: getfield g : Ljava/lang/String;
      //   692: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   695: pop
      //   696: aload_1
      //   697: ldc '0'
      //   699: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   702: pop
      //   703: aload_1
      //   704: aload #4
      //   706: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   709: pop
      //   710: aload_1
      //   711: aload_3
      //   712: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   715: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   718: pop
      //   719: aload_2
      //   720: aload_1
      //   721: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   724: pop
      //   725: getstatic com/allinone/callerid/util/d0.a : Z
      //   728: ifeq -> 772
      //   731: new java/lang/StringBuilder
      //   734: astore_1
      //   735: aload_1
      //   736: invokespecial <init> : ()V
      //   739: aload_1
      //   740: ldc 'tel_number_info'
      //   742: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   745: pop
      //   746: aload_1
      //   747: aload_2
      //   748: invokevirtual toString : ()Ljava/lang/String;
      //   751: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   754: pop
      //   755: ldc 'collectinfo'
      //   757: aload_1
      //   758: invokevirtual toString : ()Ljava/lang/String;
      //   761: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   764: goto -> 772
      //   767: astore_1
      //   768: aload_1
      //   769: invokevirtual printStackTrace : ()V
      //   772: aload_2
      //   773: areturn
      // Exception table:
      //   from	to	target	type
      //   8	22	767	java/lang/Exception
      //   27	39	767	java/lang/Exception
      //   42	104	767	java/lang/Exception
      //   115	133	767	java/lang/Exception
      //   136	236	767	java/lang/Exception
      //   248	279	767	java/lang/Exception
      //   286	293	767	java/lang/Exception
      //   307	321	767	java/lang/Exception
      //   326	334	767	java/lang/Exception
      //   354	362	767	java/lang/Exception
      //   371	398	767	java/lang/Exception
      //   424	436	767	java/lang/Exception
      //   441	470	767	java/lang/Exception
      //   479	509	767	java/lang/Exception
      //   516	524	767	java/lang/Exception
      //   531	551	767	java/lang/Exception
      //   557	568	767	java/lang/Exception
      //   586	725	767	java/lang/Exception
      //   725	764	767	java/lang/Exception
    }
    
    protected void b(JSONArray param1JSONArray) {
      super.onPostExecute(param1JSONArray);
      this.a.a(param1JSONArray);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/h/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */