package com.allinone.callerid.i.a.s;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.r0;
import java.util.List;

public class c {
  public static void b(Context paramContext, r0 paramr0) {
    try {
      a a = new a();
      this(paramContext, paramr0);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static void c(List<CallLogBean> paramList, Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 683
    //   4: aload_0
    //   5: invokeinterface size : ()I
    //   10: ifle -> 683
    //   13: aload_1
    //   14: ldc android/content/pm/ShortcutManager
    //   16: invokevirtual getSystemService : (Ljava/lang/Class;)Ljava/lang/Object;
    //   19: checkcast android/content/pm/ShortcutManager
    //   22: astore_2
    //   23: new java/util/ArrayList
    //   26: astore_3
    //   27: aload_3
    //   28: invokespecial <init> : ()V
    //   31: getstatic com/allinone/callerid/util/d0.a : Z
    //   34: ifeq -> 77
    //   37: new java/lang/StringBuilder
    //   40: astore #4
    //   42: aload #4
    //   44: invokespecial <init> : ()V
    //   47: aload #4
    //   49: ldc 'list:'
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload #4
    //   57: aload_0
    //   58: invokeinterface size : ()I
    //   63: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: ldc 'quick'
    //   69: aload #4
    //   71: invokevirtual toString : ()Ljava/lang/String;
    //   74: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   77: aload_0
    //   78: invokeinterface size : ()I
    //   83: istore #5
    //   85: iconst_0
    //   86: istore #6
    //   88: iconst_0
    //   89: istore #7
    //   91: iload #5
    //   93: iconst_4
    //   94: if_icmpge -> 428
    //   97: new android/content/Intent
    //   100: astore #4
    //   102: aload #4
    //   104: aload_1
    //   105: ldc com/allinone/callerid/mvc/controller/QuickContactActivity
    //   107: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   110: aload #4
    //   112: ldc 'android.intent.action.VIEW'
    //   114: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   117: pop
    //   118: aload_1
    //   119: ldc 2131231430
    //   121: invokestatic createWithResource : (Landroid/content/Context;I)Landroid/graphics/drawable/Icon;
    //   124: astore #8
    //   126: new android/content/pm/ShortcutInfo$Builder
    //   129: astore #9
    //   131: aload #9
    //   133: aload_1
    //   134: ldc 'id0'
    //   136: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   139: aload_3
    //   140: aload #9
    //   142: aload_1
    //   143: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   146: ldc 2131755077
    //   148: invokevirtual getString : (I)Ljava/lang/String;
    //   151: invokevirtual setShortLabel : (Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;
    //   154: aload_1
    //   155: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   158: ldc 2131755077
    //   160: invokevirtual getString : (I)Ljava/lang/String;
    //   163: invokevirtual setLongLabel : (Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;
    //   166: aload #8
    //   168: invokevirtual setIcon : (Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;
    //   171: aload #4
    //   173: invokevirtual setIntent : (Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;
    //   176: invokevirtual build : ()Landroid/content/pm/ShortcutInfo;
    //   179: invokeinterface add : (Ljava/lang/Object;)Z
    //   184: pop
    //   185: iload #7
    //   187: istore #6
    //   189: iload #6
    //   191: aload_0
    //   192: invokeinterface size : ()I
    //   197: if_icmpge -> 669
    //   200: aload_0
    //   201: iload #6
    //   203: invokeinterface get : (I)Ljava/lang/Object;
    //   208: checkcast com/allinone/callerid/search/CallLogBean
    //   211: astore #10
    //   213: aload #10
    //   215: invokevirtual n : ()Ljava/lang/String;
    //   218: astore #8
    //   220: aload #8
    //   222: ifnull -> 239
    //   225: aload #8
    //   227: astore #4
    //   229: ldc ''
    //   231: aload #8
    //   233: invokevirtual equals : (Ljava/lang/Object;)Z
    //   236: ifeq -> 246
    //   239: aload #10
    //   241: invokevirtual p : ()Ljava/lang/String;
    //   244: astore #4
    //   246: new android/content/Intent
    //   249: astore #9
    //   251: new java/lang/StringBuilder
    //   254: astore #8
    //   256: aload #8
    //   258: invokespecial <init> : ()V
    //   261: aload #8
    //   263: ldc 'tel:'
    //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: pop
    //   269: aload #8
    //   271: aload #10
    //   273: invokevirtual p : ()Ljava/lang/String;
    //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: pop
    //   280: aload #9
    //   282: ldc 'android.intent.action.CALL'
    //   284: aload #8
    //   286: invokevirtual toString : ()Ljava/lang/String;
    //   289: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   292: invokespecial <init> : (Ljava/lang/String;Landroid/net/Uri;)V
    //   295: new com/allinone/callerid/util/c
    //   298: astore #8
    //   300: aload #8
    //   302: aload_1
    //   303: invokespecial <init> : (Landroid/content/Context;)V
    //   306: aload #8
    //   308: aload #10
    //   310: invokevirtual p : ()Ljava/lang/String;
    //   313: invokevirtual a : (Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   316: astore #8
    //   318: aload #8
    //   320: ifnonnull -> 334
    //   323: aload_1
    //   324: ldc 2131231191
    //   326: invokestatic createWithResource : (Landroid/content/Context;I)Landroid/graphics/drawable/Icon;
    //   329: astore #8
    //   331: goto -> 341
    //   334: aload #8
    //   336: invokestatic createWithBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   339: astore #8
    //   341: new android/content/pm/ShortcutInfo$Builder
    //   344: astore #10
    //   346: new java/lang/StringBuilder
    //   349: astore #11
    //   351: aload #11
    //   353: invokespecial <init> : ()V
    //   356: aload #11
    //   358: ldc 'id'
    //   360: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: pop
    //   364: aload #11
    //   366: iload #6
    //   368: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   371: pop
    //   372: aload #11
    //   374: iconst_1
    //   375: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: aload #10
    //   381: aload_1
    //   382: aload #11
    //   384: invokevirtual toString : ()Ljava/lang/String;
    //   387: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   390: aload_3
    //   391: aload #10
    //   393: aload #4
    //   395: invokevirtual setShortLabel : (Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;
    //   398: aload #4
    //   400: invokevirtual setLongLabel : (Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;
    //   403: aload #8
    //   405: invokevirtual setIcon : (Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;
    //   408: aload #9
    //   410: invokevirtual setIntent : (Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;
    //   413: invokevirtual build : ()Landroid/content/pm/ShortcutInfo;
    //   416: invokeinterface add : (Ljava/lang/Object;)Z
    //   421: pop
    //   422: iinc #6, 1
    //   425: goto -> 189
    //   428: iload #6
    //   430: aload_0
    //   431: invokeinterface size : ()I
    //   436: if_icmpge -> 669
    //   439: iload #6
    //   441: aload_2
    //   442: invokevirtual getMaxShortcutCountPerActivity : ()I
    //   445: if_icmpge -> 663
    //   448: aload_0
    //   449: iload #6
    //   451: invokeinterface get : (I)Ljava/lang/Object;
    //   456: checkcast com/allinone/callerid/search/CallLogBean
    //   459: astore #10
    //   461: aload #10
    //   463: invokevirtual n : ()Ljava/lang/String;
    //   466: astore #8
    //   468: aload #8
    //   470: ifnull -> 487
    //   473: aload #8
    //   475: astore #4
    //   477: ldc ''
    //   479: aload #8
    //   481: invokevirtual equals : (Ljava/lang/Object;)Z
    //   484: ifeq -> 494
    //   487: aload #10
    //   489: invokevirtual p : ()Ljava/lang/String;
    //   492: astore #4
    //   494: new android/content/Intent
    //   497: astore #9
    //   499: new java/lang/StringBuilder
    //   502: astore #8
    //   504: aload #8
    //   506: invokespecial <init> : ()V
    //   509: aload #8
    //   511: ldc 'tel:'
    //   513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: aload #8
    //   519: aload #10
    //   521: invokevirtual p : ()Ljava/lang/String;
    //   524: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: pop
    //   528: aload #9
    //   530: ldc 'android.intent.action.CALL'
    //   532: aload #8
    //   534: invokevirtual toString : ()Ljava/lang/String;
    //   537: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   540: invokespecial <init> : (Ljava/lang/String;Landroid/net/Uri;)V
    //   543: new com/allinone/callerid/util/c
    //   546: astore #8
    //   548: aload #8
    //   550: aload_1
    //   551: invokespecial <init> : (Landroid/content/Context;)V
    //   554: aload #8
    //   556: aload #10
    //   558: invokevirtual p : ()Ljava/lang/String;
    //   561: invokevirtual a : (Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   564: astore #8
    //   566: aload #8
    //   568: ifnonnull -> 582
    //   571: aload_1
    //   572: ldc 2131231191
    //   574: invokestatic createWithResource : (Landroid/content/Context;I)Landroid/graphics/drawable/Icon;
    //   577: astore #8
    //   579: goto -> 589
    //   582: aload #8
    //   584: invokestatic createWithBitmap : (Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    //   587: astore #8
    //   589: new android/content/pm/ShortcutInfo$Builder
    //   592: astore #11
    //   594: new java/lang/StringBuilder
    //   597: astore #10
    //   599: aload #10
    //   601: invokespecial <init> : ()V
    //   604: aload #10
    //   606: ldc 'id'
    //   608: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   611: pop
    //   612: aload #10
    //   614: iload #6
    //   616: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   619: pop
    //   620: aload #11
    //   622: aload_1
    //   623: aload #10
    //   625: invokevirtual toString : ()Ljava/lang/String;
    //   628: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   631: aload_3
    //   632: aload #11
    //   634: aload #4
    //   636: invokevirtual setShortLabel : (Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;
    //   639: aload #4
    //   641: invokevirtual setLongLabel : (Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;
    //   644: aload #8
    //   646: invokevirtual setIcon : (Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;
    //   649: aload #9
    //   651: invokevirtual setIntent : (Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;
    //   654: invokevirtual build : ()Landroid/content/pm/ShortcutInfo;
    //   657: invokeinterface add : (Ljava/lang/Object;)Z
    //   662: pop
    //   663: iinc #6, 1
    //   666: goto -> 428
    //   669: aload_2
    //   670: aload_3
    //   671: invokevirtual setDynamicShortcuts : (Ljava/util/List;)Z
    //   674: pop
    //   675: goto -> 683
    //   678: astore_0
    //   679: aload_0
    //   680: invokevirtual printStackTrace : ()V
    //   683: return
    // Exception table:
    //   from	to	target	type
    //   4	77	678	java/lang/Exception
    //   77	85	678	java/lang/Exception
    //   97	185	678	java/lang/Exception
    //   189	220	678	java/lang/Exception
    //   229	239	678	java/lang/Exception
    //   239	246	678	java/lang/Exception
    //   246	318	678	java/lang/Exception
    //   323	331	678	java/lang/Exception
    //   334	341	678	java/lang/Exception
    //   341	422	678	java/lang/Exception
    //   428	468	678	java/lang/Exception
    //   477	487	678	java/lang/Exception
    //   487	494	678	java/lang/Exception
    //   494	566	678	java/lang/Exception
    //   571	579	678	java/lang/Exception
    //   582	589	678	java/lang/Exception
    //   589	663	678	java/lang/Exception
    //   669	675	678	java/lang/Exception
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private List<CallLogBean> a;
    
    private r0 b;
    
    a(Context param1Context, r0 param1r0) {
      this.b = param1r0;
    }
    
    protected String a(String... param1VarArgs) {
      // Byte code:
      //   0: new com/allinone/callerid/util/n
      //   3: dup
      //   4: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
      //   7: invokespecial <init> : (Landroid/content/Context;)V
      //   10: invokevirtual c : ()Ljava/util/List;
      //   13: astore_1
      //   14: aload_0
      //   15: aload_1
      //   16: putfield a : Ljava/util/List;
      //   19: aload_1
      //   20: invokeinterface isEmpty : ()Z
      //   25: istore_2
      //   26: ldc 'ok'
      //   28: astore_3
      //   29: iload_2
      //   30: ifne -> 59
      //   33: aload_0
      //   34: getfield a : Ljava/util/List;
      //   37: invokeinterface size : ()I
      //   42: ifle -> 234
      //   45: getstatic android/os/Build$VERSION.SDK_INT : I
      //   48: bipush #25
      //   50: if_icmplt -> 234
      //   53: ldc 'ok'
      //   55: astore_1
      //   56: goto -> 236
      //   59: invokestatic b0 : ()Z
      //   62: istore_2
      //   63: iconst_0
      //   64: istore #4
      //   66: iconst_0
      //   67: istore #5
      //   69: iload_2
      //   70: ifeq -> 150
      //   73: getstatic android/os/Build$VERSION.SDK_INT : I
      //   76: bipush #25
      //   78: if_icmplt -> 234
      //   81: aload_0
      //   82: getfield b : Lcom/allinone/callerid/util/r0;
      //   85: invokevirtual b : ()Ljava/util/List;
      //   88: astore_1
      //   89: aload_1
      //   90: ifnull -> 53
      //   93: aload_1
      //   94: invokeinterface size : ()I
      //   99: ifle -> 53
      //   102: iload #5
      //   104: aload_1
      //   105: invokeinterface size : ()I
      //   110: if_icmpge -> 53
      //   113: aload_0
      //   114: getfield a : Ljava/util/List;
      //   117: invokeinterface size : ()I
      //   122: iconst_3
      //   123: if_icmpge -> 144
      //   126: aload_0
      //   127: getfield a : Ljava/util/List;
      //   130: aload_1
      //   131: iload #5
      //   133: invokeinterface get : (I)Ljava/lang/Object;
      //   138: invokeinterface add : (Ljava/lang/Object;)Z
      //   143: pop
      //   144: iinc #5, 1
      //   147: goto -> 102
      //   150: aload_0
      //   151: getfield b : Lcom/allinone/callerid/util/r0;
      //   154: invokevirtual a : ()Ljava/util/List;
      //   157: astore_1
      //   158: aload_1
      //   159: ifnull -> 223
      //   162: aload_1
      //   163: invokeinterface size : ()I
      //   168: ifle -> 223
      //   171: iload #4
      //   173: istore #5
      //   175: iload #5
      //   177: aload_1
      //   178: invokeinterface size : ()I
      //   183: if_icmpge -> 223
      //   186: aload_0
      //   187: getfield a : Ljava/util/List;
      //   190: invokeinterface size : ()I
      //   195: iconst_3
      //   196: if_icmpge -> 217
      //   199: aload_0
      //   200: getfield a : Ljava/util/List;
      //   203: aload_1
      //   204: iload #5
      //   206: invokeinterface get : (I)Ljava/lang/Object;
      //   211: invokeinterface add : (Ljava/lang/Object;)Z
      //   216: pop
      //   217: iinc #5, 1
      //   220: goto -> 175
      //   223: getstatic android/os/Build$VERSION.SDK_INT : I
      //   226: bipush #25
      //   228: if_icmplt -> 234
      //   231: goto -> 53
      //   234: aconst_null
      //   235: astore_1
      //   236: getstatic android/os/Build$VERSION.SDK_INT : I
      //   239: bipush #25
      //   241: if_icmplt -> 280
      //   244: aload_0
      //   245: getfield a : Ljava/util/List;
      //   248: astore #6
      //   250: aload #6
      //   252: ifnull -> 280
      //   255: aload #6
      //   257: invokeinterface size : ()I
      //   262: ifle -> 280
      //   265: aload_0
      //   266: getfield a : Ljava/util/List;
      //   269: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
      //   272: invokestatic a : (Ljava/util/List;Landroid/content/Context;)V
      //   275: aload_3
      //   276: astore_1
      //   277: goto -> 280
      //   280: aload_1
      //   281: areturn
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/s/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */