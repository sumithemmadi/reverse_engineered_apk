package com.allinone.callerid.i.a.z;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.f1;

public class d {
  public static void a(Context paramContext, String paramString, int paramInt1, int paramInt2, c paramc) {
    try {
      if (!b1.A0()) {
        a a = new a();
        this(paramContext, paramString, paramInt1, paramInt2, paramc);
        a.executeOnExecutor(f1.a(), (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private c a;
    
    private String b;
    
    private Context c;
    
    private int d;
    
    private int e;
    
    a(Context param1Context, String param1String, int param1Int1, int param1Int2, c param1c) {
      this.a = param1c;
      this.c = param1Context;
      this.b = param1String;
      this.d = param1Int1;
      this.e = param1Int2;
    }
    
    protected String a(String... param1VarArgs) {
      // Byte code:
      //   0: aconst_null
      //   1: astore_2
      //   2: aconst_null
      //   3: astore_3
      //   4: aload_3
      //   5: astore_1
      //   6: aload_0
      //   7: getfield c : Landroid/content/Context;
      //   10: invokestatic T : (Landroid/content/Context;)Ljava/lang/String;
      //   13: astore #4
      //   15: aload_3
      //   16: astore_1
      //   17: aload_0
      //   18: getfield c : Landroid/content/Context;
      //   21: invokestatic W : (Landroid/content/Context;)Ljava/lang/String;
      //   24: astore #5
      //   26: aload_3
      //   27: astore_1
      //   28: aload_0
      //   29: getfield c : Landroid/content/Context;
      //   32: invokestatic d : (Landroid/content/Context;)Lcom/allinone/callerid/model/EZCountryCode;
      //   35: invokevirtual getCountry_code : ()Ljava/lang/String;
      //   38: astore #6
      //   40: aload_3
      //   41: astore_1
      //   42: aload_0
      //   43: getfield c : Landroid/content/Context;
      //   46: aload_0
      //   47: getfield b : Ljava/lang/String;
      //   50: invokestatic Q : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   53: astore #7
      //   55: aload_3
      //   56: astore_1
      //   57: aload_0
      //   58: getfield b : Ljava/lang/String;
      //   61: astore #8
      //   63: aload_2
      //   64: astore #9
      //   66: aload #8
      //   68: ifnull -> 550
      //   71: aload_3
      //   72: astore_1
      //   73: aload_2
      //   74: astore #9
      //   76: ldc ''
      //   78: aload #8
      //   80: invokevirtual equals : (Ljava/lang/Object;)Z
      //   83: ifne -> 550
      //   86: aload_2
      //   87: astore #9
      //   89: aload #4
      //   91: ifnull -> 550
      //   94: aload_3
      //   95: astore_1
      //   96: aload_2
      //   97: astore #9
      //   99: ldc ''
      //   101: aload #4
      //   103: invokevirtual equals : (Ljava/lang/Object;)Z
      //   106: ifne -> 550
      //   109: aload_2
      //   110: astore #9
      //   112: aload #5
      //   114: ifnull -> 550
      //   117: aload_3
      //   118: astore_1
      //   119: aload_2
      //   120: astore #9
      //   122: ldc ''
      //   124: aload #5
      //   126: invokevirtual equals : (Ljava/lang/Object;)Z
      //   129: ifne -> 550
      //   132: aload_2
      //   133: astore #9
      //   135: aload #6
      //   137: ifnull -> 550
      //   140: aload_3
      //   141: astore_1
      //   142: aload_2
      //   143: astore #9
      //   145: ldc ''
      //   147: aload #6
      //   149: invokevirtual equals : (Ljava/lang/Object;)Z
      //   152: ifne -> 550
      //   155: aload_2
      //   156: astore #9
      //   158: aload #7
      //   160: ifnull -> 550
      //   163: aload_3
      //   164: astore_1
      //   165: aload_2
      //   166: astore #9
      //   168: ldc ''
      //   170: aload #7
      //   172: invokevirtual equals : (Ljava/lang/Object;)Z
      //   175: ifne -> 550
      //   178: aload_3
      //   179: astore_1
      //   180: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   183: ldc 'search_param_not_null'
      //   185: invokevirtual c : (Ljava/lang/String;)V
      //   188: aload_3
      //   189: astore_1
      //   190: new java/util/HashMap
      //   193: astore #9
      //   195: aload_3
      //   196: astore_1
      //   197: aload #9
      //   199: invokespecial <init> : ()V
      //   202: aload_3
      //   203: astore_1
      //   204: aload #9
      //   206: ldc 'tel_number'
      //   208: aload_0
      //   209: getfield b : Ljava/lang/String;
      //   212: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   215: pop
      //   216: aload_3
      //   217: astore_1
      //   218: aload #9
      //   220: ldc 'device'
      //   222: ldc 'android'
      //   224: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   227: pop
      //   228: aload_3
      //   229: astore_1
      //   230: aload #9
      //   232: ldc 'uid'
      //   234: aload #4
      //   236: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   239: pop
      //   240: aload_3
      //   241: astore_1
      //   242: aload #9
      //   244: ldc 'version'
      //   246: aload #5
      //   248: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   251: pop
      //   252: aload_3
      //   253: astore_1
      //   254: aload #9
      //   256: ldc 'default_cc'
      //   258: aload #6
      //   260: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   263: pop
      //   264: aload_3
      //   265: astore_1
      //   266: aload #9
      //   268: ldc 'cc'
      //   270: aload #6
      //   272: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   275: pop
      //   276: aload_3
      //   277: astore_1
      //   278: aload #9
      //   280: ldc 'stamp'
      //   282: aload #7
      //   284: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   287: pop
      //   288: aload_3
      //   289: astore_1
      //   290: aload #9
      //   292: ldc 'cid'
      //   294: aload_0
      //   295: getfield d : I
      //   298: invokestatic valueOf : (I)Ljava/lang/String;
      //   301: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   304: pop
      //   305: aload_3
      //   306: astore_1
      //   307: aload #9
      //   309: ldc 'is_contacts'
      //   311: aload_0
      //   312: getfield e : I
      //   315: invokestatic valueOf : (I)Ljava/lang/String;
      //   318: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   321: pop
      //   322: aload_3
      //   323: astore_1
      //   324: getstatic com/allinone/callerid/util/d0.a : Z
      //   327: istore #10
      //   329: iload #10
      //   331: ifeq -> 378
      //   334: aload_3
      //   335: astore_1
      //   336: new java/lang/StringBuilder
      //   339: astore_2
      //   340: aload_3
      //   341: astore_1
      //   342: aload_2
      //   343: invokespecial <init> : ()V
      //   346: aload_3
      //   347: astore_1
      //   348: aload_2
      //   349: ldc '所有参数：'
      //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   354: pop
      //   355: aload_3
      //   356: astore_1
      //   357: aload_2
      //   358: aload #9
      //   360: invokevirtual toString : ()Ljava/lang/String;
      //   363: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   366: pop
      //   367: aload_3
      //   368: astore_1
      //   369: ldc 'searchNumber'
      //   371: aload_2
      //   372: invokevirtual toString : ()Ljava/lang/String;
      //   375: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   378: aload_3
      //   379: astore_1
      //   380: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   383: ldc 'search_number_float'
      //   385: invokevirtual d : (Ljava/lang/String;)V
      //   388: aload_3
      //   389: astore_1
      //   390: aload_0
      //   391: getfield d : I
      //   394: iconst_1
      //   395: if_icmpne -> 459
      //   398: aload_3
      //   399: astore_1
      //   400: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   403: ldc 'unknown_incoming_search'
      //   405: invokevirtual d : (Ljava/lang/String;)V
      //   408: aload_3
      //   409: astore_1
      //   410: aload_0
      //   411: getfield b : Ljava/lang/String;
      //   414: ldc '140'
      //   416: invokevirtual startsWith : (Ljava/lang/String;)Z
      //   419: ifne -> 450
      //   422: aload_3
      //   423: astore_1
      //   424: aload_0
      //   425: getfield b : Ljava/lang/String;
      //   428: ldc '+91140'
      //   430: invokevirtual startsWith : (Ljava/lang/String;)Z
      //   433: ifne -> 450
      //   436: aload_3
      //   437: astore_1
      //   438: aload_0
      //   439: getfield b : Ljava/lang/String;
      //   442: ldc '0091140'
      //   444: invokevirtual startsWith : (Ljava/lang/String;)Z
      //   447: ifeq -> 459
      //   450: aload_3
      //   451: astore_1
      //   452: aload_0
      //   453: getfield c : Landroid/content/Context;
      //   456: invokestatic F : (Landroid/content/Context;)V
      //   459: aload_3
      //   460: astore_1
      //   461: aload_0
      //   462: getfield c : Landroid/content/Context;
      //   465: invokestatic b : (Landroid/content/Context;)V
      //   468: aload_3
      //   469: astore_1
      //   470: ldc 'https://app.show-caller.com/api/v1/sea.php'
      //   472: aload #9
      //   474: invokestatic b : (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
      //   477: astore_3
      //   478: aload_3
      //   479: astore_1
      //   480: aload_3
      //   481: astore #9
      //   483: getstatic com/allinone/callerid/util/d0.a : Z
      //   486: ifeq -> 550
      //   489: aload_3
      //   490: astore_1
      //   491: new java/lang/StringBuilder
      //   494: astore #9
      //   496: aload_3
      //   497: astore_1
      //   498: aload #9
      //   500: invokespecial <init> : ()V
      //   503: aload_3
      //   504: astore_1
      //   505: aload #9
      //   507: ldc 'response:'
      //   509: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   512: pop
      //   513: aload_3
      //   514: astore_1
      //   515: aload #9
      //   517: aload_3
      //   518: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   521: pop
      //   522: aload_3
      //   523: astore_1
      //   524: ldc 'searchNumber'
      //   526: aload #9
      //   528: invokevirtual toString : ()Ljava/lang/String;
      //   531: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   534: aload_3
      //   535: astore #9
      //   537: goto -> 550
      //   540: astore #9
      //   542: aload #9
      //   544: invokevirtual printStackTrace : ()V
      //   547: aload_1
      //   548: astore #9
      //   550: aload #9
      //   552: areturn
      // Exception table:
      //   from	to	target	type
      //   6	15	540	java/lang/Exception
      //   17	26	540	java/lang/Exception
      //   28	40	540	java/lang/Exception
      //   42	55	540	java/lang/Exception
      //   57	63	540	java/lang/Exception
      //   76	86	540	java/lang/Exception
      //   99	109	540	java/lang/Exception
      //   122	132	540	java/lang/Exception
      //   145	155	540	java/lang/Exception
      //   168	178	540	java/lang/Exception
      //   180	188	540	java/lang/Exception
      //   190	195	540	java/lang/Exception
      //   197	202	540	java/lang/Exception
      //   204	216	540	java/lang/Exception
      //   218	228	540	java/lang/Exception
      //   230	240	540	java/lang/Exception
      //   242	252	540	java/lang/Exception
      //   254	264	540	java/lang/Exception
      //   266	276	540	java/lang/Exception
      //   278	288	540	java/lang/Exception
      //   290	305	540	java/lang/Exception
      //   307	322	540	java/lang/Exception
      //   324	329	540	java/lang/Exception
      //   336	340	540	java/lang/Exception
      //   342	346	540	java/lang/Exception
      //   348	355	540	java/lang/Exception
      //   357	367	540	java/lang/Exception
      //   369	378	540	java/lang/Exception
      //   380	388	540	java/lang/Exception
      //   390	398	540	java/lang/Exception
      //   400	408	540	java/lang/Exception
      //   410	422	540	java/lang/Exception
      //   424	436	540	java/lang/Exception
      //   438	450	540	java/lang/Exception
      //   452	459	540	java/lang/Exception
      //   461	468	540	java/lang/Exception
      //   470	478	540	java/lang/Exception
      //   483	489	540	java/lang/Exception
      //   491	496	540	java/lang/Exception
      //   498	503	540	java/lang/Exception
      //   505	513	540	java/lang/Exception
      //   515	522	540	java/lang/Exception
      //   524	534	540	java/lang/Exception
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/z/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */