package com.allinone.callerid.i.a.h;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.util.b1;
import org.json.JSONArray;

public class b {
  public static void a(Context paramContext, JSONArray paramJSONArray, a parama) {
    if (b1.e())
      try {
        a a1 = new a();
        this(paramContext, paramJSONArray, parama);
        if (a1.getStatus() != AsyncTask.Status.RUNNING) {
          a1.cancel(true);
          a1 = new a();
          this(paramContext, paramJSONArray, parama);
          a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private a a;
    
    private Context b;
    
    private JSONArray c;
    
    a(Context param1Context, JSONArray param1JSONArray, a param1a) {
      this.a = param1a;
      this.b = param1Context;
      this.c = param1JSONArray;
    }
    
    protected String a(String... param1VarArgs) {
      // Byte code:
      //   0: aconst_null
      //   1: astore_2
      //   2: aload_2
      //   3: astore_3
      //   4: new java/util/HashMap
      //   7: astore #4
      //   9: aload_2
      //   10: astore_3
      //   11: aload #4
      //   13: invokespecial <init> : ()V
      //   16: aload_2
      //   17: astore_3
      //   18: aload_0
      //   19: getfield b : Landroid/content/Context;
      //   22: invokestatic H : (Landroid/content/Context;)Ljava/lang/String;
      //   25: astore #5
      //   27: aload_2
      //   28: astore_3
      //   29: aload_0
      //   30: getfield b : Landroid/content/Context;
      //   33: invokestatic d : (Landroid/content/Context;)Lcom/allinone/callerid/model/EZCountryCode;
      //   36: invokevirtual getCountry_code : ()Ljava/lang/String;
      //   39: astore #6
      //   41: aload_2
      //   42: astore_3
      //   43: invokestatic R : ()Ljava/lang/String;
      //   46: astore #7
      //   48: aload_2
      //   49: astore_3
      //   50: invokestatic N : ()Ljava/lang/String;
      //   53: astore #8
      //   55: aload_2
      //   56: astore_3
      //   57: invokestatic G : ()Ljava/lang/String;
      //   60: astore #9
      //   62: aload_2
      //   63: astore_3
      //   64: aload_0
      //   65: getfield b : Landroid/content/Context;
      //   68: invokestatic d : (Landroid/content/Context;)Lcom/allinone/callerid/model/EZCountryCode;
      //   71: invokevirtual getIso_code : ()Ljava/lang/String;
      //   74: ldc '/'
      //   76: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
      //   79: iconst_0
      //   80: aaload
      //   81: invokevirtual toLowerCase : ()Ljava/lang/String;
      //   84: astore #10
      //   86: aload_2
      //   87: astore_3
      //   88: invokestatic a : ()Lcom/allinone/callerid/i/a/n/c;
      //   91: invokevirtual b : ()Lcom/allinone/callerid/bean/ParserIpBean;
      //   94: astore #11
      //   96: aload #11
      //   98: ifnull -> 317
      //   101: aload #10
      //   103: astore #12
      //   105: aload_2
      //   106: astore_3
      //   107: aload #11
      //   109: invokevirtual getCountry : ()Ljava/lang/String;
      //   112: ifnull -> 143
      //   115: aload #10
      //   117: astore #12
      //   119: aload_2
      //   120: astore_3
      //   121: ldc ''
      //   123: aload #11
      //   125: invokevirtual getCountry : ()Ljava/lang/String;
      //   128: invokevirtual equals : (Ljava/lang/Object;)Z
      //   131: ifne -> 143
      //   134: aload_2
      //   135: astore_3
      //   136: aload #11
      //   138: invokevirtual getCountry : ()Ljava/lang/String;
      //   141: astore #12
      //   143: aload_2
      //   144: astore_3
      //   145: aload #11
      //   147: invokevirtual getState : ()Ljava/lang/String;
      //   150: ifnull -> 179
      //   153: aload_2
      //   154: astore_3
      //   155: ldc ''
      //   157: aload #11
      //   159: invokevirtual getState : ()Ljava/lang/String;
      //   162: invokevirtual equals : (Ljava/lang/Object;)Z
      //   165: ifne -> 179
      //   168: aload_2
      //   169: astore_3
      //   170: aload #11
      //   172: invokevirtual getState : ()Ljava/lang/String;
      //   175: astore_1
      //   176: goto -> 218
      //   179: aload_2
      //   180: astore_3
      //   181: aload #11
      //   183: invokevirtual getState_full : ()Ljava/lang/String;
      //   186: ifnull -> 215
      //   189: aload_2
      //   190: astore_3
      //   191: ldc ''
      //   193: aload #11
      //   195: invokevirtual getState_full : ()Ljava/lang/String;
      //   198: invokevirtual equals : (Ljava/lang/Object;)Z
      //   201: ifne -> 215
      //   204: aload_2
      //   205: astore_3
      //   206: aload #11
      //   208: invokevirtual getState_full : ()Ljava/lang/String;
      //   211: astore_1
      //   212: goto -> 218
      //   215: ldc ''
      //   217: astore_1
      //   218: aload_2
      //   219: astore_3
      //   220: aload #11
      //   222: invokevirtual getCity : ()Ljava/lang/String;
      //   225: ifnull -> 255
      //   228: aload_2
      //   229: astore_3
      //   230: ldc ''
      //   232: aload #11
      //   234: invokevirtual getCity : ()Ljava/lang/String;
      //   237: invokevirtual equals : (Ljava/lang/Object;)Z
      //   240: ifne -> 255
      //   243: aload_2
      //   244: astore_3
      //   245: aload #11
      //   247: invokevirtual getCity : ()Ljava/lang/String;
      //   250: astore #13
      //   252: goto -> 259
      //   255: ldc ''
      //   257: astore #13
      //   259: aload_2
      //   260: astore_3
      //   261: aload #11
      //   263: invokevirtual getTrue_ip : ()Ljava/lang/String;
      //   266: ifnull -> 304
      //   269: aload_2
      //   270: astore_3
      //   271: ldc ''
      //   273: aload #11
      //   275: invokevirtual getTrue_ip : ()Ljava/lang/String;
      //   278: invokevirtual equals : (Ljava/lang/Object;)Z
      //   281: ifne -> 304
      //   284: aload_2
      //   285: astore_3
      //   286: aload #11
      //   288: invokevirtual getTrue_ip : ()Ljava/lang/String;
      //   291: astore #11
      //   293: aload #12
      //   295: astore #10
      //   297: aload #11
      //   299: astore #12
      //   301: goto -> 327
      //   304: ldc ''
      //   306: astore_3
      //   307: aload #12
      //   309: astore #10
      //   311: aload_3
      //   312: astore #12
      //   314: goto -> 327
      //   317: ldc ''
      //   319: astore #12
      //   321: aload #12
      //   323: astore_1
      //   324: aload_1
      //   325: astore #13
      //   327: aload_2
      //   328: astore_3
      //   329: new org/json/JSONObject
      //   332: astore #11
      //   334: aload_2
      //   335: astore_3
      //   336: aload #11
      //   338: invokespecial <init> : ()V
      //   341: aload_2
      //   342: astore_3
      //   343: new org/json/JSONArray
      //   346: astore #14
      //   348: aload_2
      //   349: astore_3
      //   350: aload #14
      //   352: invokespecial <init> : ()V
      //   355: aload_2
      //   356: astore_3
      //   357: aload #14
      //   359: aload #5
      //   361: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   364: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   367: pop
      //   368: aload_2
      //   369: astore_3
      //   370: aload #14
      //   372: aload #6
      //   374: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   377: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   380: pop
      //   381: aload_2
      //   382: astore_3
      //   383: aload #14
      //   385: aload #7
      //   387: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   390: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   393: pop
      //   394: aload_2
      //   395: astore_3
      //   396: aload #14
      //   398: aload #8
      //   400: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   403: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   406: pop
      //   407: aload_2
      //   408: astore_3
      //   409: aload #14
      //   411: aload #9
      //   413: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   416: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   419: pop
      //   420: aload_2
      //   421: astore_3
      //   422: aload #14
      //   424: aload #12
      //   426: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   429: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   432: pop
      //   433: aload_2
      //   434: astore_3
      //   435: aload #14
      //   437: aload #10
      //   439: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   442: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   445: pop
      //   446: aload_2
      //   447: astore_3
      //   448: aload #14
      //   450: aload_1
      //   451: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   454: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   457: pop
      //   458: aload_2
      //   459: astore_3
      //   460: aload #14
      //   462: aload #13
      //   464: invokestatic f : (Ljava/lang/String;)Ljava/lang/String;
      //   467: invokevirtual put : (Ljava/lang/Object;)Lorg/json/JSONArray;
      //   470: pop
      //   471: aload_2
      //   472: astore_3
      //   473: aload #11
      //   475: ldc 'user_info'
      //   477: aload #14
      //   479: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      //   482: pop
      //   483: aload_2
      //   484: astore_3
      //   485: aload #11
      //   487: ldc 'tel_number_info'
      //   489: aload_0
      //   490: getfield c : Lorg/json/JSONArray;
      //   493: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      //   496: pop
      //   497: aload_2
      //   498: astore_3
      //   499: aload #4
      //   501: ldc 'platform'
      //   503: ldc 'android'
      //   505: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   508: pop
      //   509: aload_2
      //   510: astore_3
      //   511: aload #4
      //   513: ldc 'uid'
      //   515: aload_0
      //   516: getfield b : Landroid/content/Context;
      //   519: invokestatic T : (Landroid/content/Context;)Ljava/lang/String;
      //   522: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   525: pop
      //   526: aload_2
      //   527: astore_3
      //   528: aload #4
      //   530: ldc 'app_version'
      //   532: aload_0
      //   533: getfield b : Landroid/content/Context;
      //   536: invokestatic W : (Landroid/content/Context;)Ljava/lang/String;
      //   539: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   542: pop
      //   543: aload_2
      //   544: astore_3
      //   545: aload #4
      //   547: ldc 'origin'
      //   549: ldc 'app'
      //   551: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   554: pop
      //   555: aload_2
      //   556: astore_3
      //   557: aload_0
      //   558: getfield b : Landroid/content/Context;
      //   561: astore_1
      //   562: aload_2
      //   563: astore_3
      //   564: aload #4
      //   566: ldc 'stamp'
      //   568: aload_1
      //   569: aload_1
      //   570: invokestatic T : (Landroid/content/Context;)Ljava/lang/String;
      //   573: invokestatic Q : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   576: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   579: pop
      //   580: aload_2
      //   581: astore_3
      //   582: getstatic com/allinone/callerid/util/d0.a : Z
      //   585: istore #15
      //   587: iload #15
      //   589: ifeq -> 643
      //   592: aload_2
      //   593: astore_3
      //   594: new java/lang/StringBuilder
      //   597: astore_1
      //   598: aload_2
      //   599: astore_3
      //   600: aload_1
      //   601: invokespecial <init> : ()V
      //   604: aload_2
      //   605: astore_3
      //   606: aload_1
      //   607: ldc 'content:'
      //   609: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   612: pop
      //   613: aload_2
      //   614: astore_3
      //   615: aload_1
      //   616: aload #11
      //   618: invokevirtual toString : ()Ljava/lang/String;
      //   621: ldc '\\'
      //   623: ldc ''
      //   625: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   628: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   631: pop
      //   632: aload_2
      //   633: astore_3
      //   634: ldc 'collectinfo'
      //   636: aload_1
      //   637: invokevirtual toString : ()Ljava/lang/String;
      //   640: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   643: aload_2
      //   644: astore_3
      //   645: aload #4
      //   647: ldc 'content'
      //   649: aload #11
      //   651: invokevirtual toString : ()Ljava/lang/String;
      //   654: ldc '\\'
      //   656: ldc ''
      //   658: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   661: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
      //   664: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   667: pop
      //   668: aload_2
      //   669: astore_3
      //   670: getstatic com/allinone/callerid/util/d0.a : Z
      //   673: ifeq -> 720
      //   676: aload_2
      //   677: astore_3
      //   678: new java/lang/StringBuilder
      //   681: astore_1
      //   682: aload_2
      //   683: astore_3
      //   684: aload_1
      //   685: invokespecial <init> : ()V
      //   688: aload_2
      //   689: astore_3
      //   690: aload_1
      //   691: ldc 'params:'
      //   693: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   696: pop
      //   697: aload_2
      //   698: astore_3
      //   699: aload_1
      //   700: aload #4
      //   702: invokevirtual toString : ()Ljava/lang/String;
      //   705: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   708: pop
      //   709: aload_2
      //   710: astore_3
      //   711: ldc 'collectinfo'
      //   713: aload_1
      //   714: invokevirtual toString : ()Ljava/lang/String;
      //   717: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   720: aload_2
      //   721: astore_3
      //   722: ldc 'https://ct.show-caller.com/c_n/api/v1/cnwik.php'
      //   724: aload #4
      //   726: invokestatic b : (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
      //   729: astore_1
      //   730: aload_1
      //   731: astore_3
      //   732: aload_1
      //   733: astore #12
      //   735: getstatic com/allinone/callerid/util/d0.a : Z
      //   738: ifeq -> 800
      //   741: aload_1
      //   742: astore_3
      //   743: new java/lang/StringBuilder
      //   746: astore #12
      //   748: aload_1
      //   749: astore_3
      //   750: aload #12
      //   752: invokespecial <init> : ()V
      //   755: aload_1
      //   756: astore_3
      //   757: aload #12
      //   759: ldc 'response:'
      //   761: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   764: pop
      //   765: aload_1
      //   766: astore_3
      //   767: aload #12
      //   769: aload_1
      //   770: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   773: pop
      //   774: aload_1
      //   775: astore_3
      //   776: ldc 'collectinfo'
      //   778: aload #12
      //   780: invokevirtual toString : ()Ljava/lang/String;
      //   783: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   786: aload_1
      //   787: astore #12
      //   789: goto -> 800
      //   792: astore_1
      //   793: aload_1
      //   794: invokevirtual printStackTrace : ()V
      //   797: aload_3
      //   798: astore #12
      //   800: aload #12
      //   802: areturn
      // Exception table:
      //   from	to	target	type
      //   4	9	792	java/lang/Exception
      //   11	16	792	java/lang/Exception
      //   18	27	792	java/lang/Exception
      //   29	41	792	java/lang/Exception
      //   43	48	792	java/lang/Exception
      //   50	55	792	java/lang/Exception
      //   57	62	792	java/lang/Exception
      //   64	86	792	java/lang/Exception
      //   88	96	792	java/lang/Exception
      //   107	115	792	java/lang/Exception
      //   121	134	792	java/lang/Exception
      //   136	143	792	java/lang/Exception
      //   145	153	792	java/lang/Exception
      //   155	168	792	java/lang/Exception
      //   170	176	792	java/lang/Exception
      //   181	189	792	java/lang/Exception
      //   191	204	792	java/lang/Exception
      //   206	212	792	java/lang/Exception
      //   220	228	792	java/lang/Exception
      //   230	243	792	java/lang/Exception
      //   245	252	792	java/lang/Exception
      //   261	269	792	java/lang/Exception
      //   271	284	792	java/lang/Exception
      //   286	293	792	java/lang/Exception
      //   329	334	792	java/lang/Exception
      //   336	341	792	java/lang/Exception
      //   343	348	792	java/lang/Exception
      //   350	355	792	java/lang/Exception
      //   357	368	792	java/lang/Exception
      //   370	381	792	java/lang/Exception
      //   383	394	792	java/lang/Exception
      //   396	407	792	java/lang/Exception
      //   409	420	792	java/lang/Exception
      //   422	433	792	java/lang/Exception
      //   435	446	792	java/lang/Exception
      //   448	458	792	java/lang/Exception
      //   460	471	792	java/lang/Exception
      //   473	483	792	java/lang/Exception
      //   485	497	792	java/lang/Exception
      //   499	509	792	java/lang/Exception
      //   511	526	792	java/lang/Exception
      //   528	543	792	java/lang/Exception
      //   545	555	792	java/lang/Exception
      //   557	562	792	java/lang/Exception
      //   564	580	792	java/lang/Exception
      //   582	587	792	java/lang/Exception
      //   594	598	792	java/lang/Exception
      //   600	604	792	java/lang/Exception
      //   606	613	792	java/lang/Exception
      //   615	632	792	java/lang/Exception
      //   634	643	792	java/lang/Exception
      //   645	668	792	java/lang/Exception
      //   670	676	792	java/lang/Exception
      //   678	682	792	java/lang/Exception
      //   684	688	792	java/lang/Exception
      //   690	697	792	java/lang/Exception
      //   699	709	792	java/lang/Exception
      //   711	720	792	java/lang/Exception
      //   722	730	792	java/lang/Exception
      //   735	741	792	java/lang/Exception
      //   743	748	792	java/lang/Exception
      //   750	755	792	java/lang/Exception
      //   757	765	792	java/lang/Exception
      //   767	774	792	java/lang/Exception
      //   776	786	792	java/lang/Exception
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */