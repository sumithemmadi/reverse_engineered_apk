package com.allinone.callerid.d.e;

import android.os.AsyncTask;
import com.allinone.callerid.callscreen.bean.ActionInfo;
import com.allinone.callerid.callscreen.bean.DownloadInfo;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.d.b.d;
import com.allinone.callerid.d.b.e;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.f1;
import java.util.ArrayList;

public class c {
  public static void a(int paramInt, String paramString, boolean paramBoolean, a parama) {
    (new b(paramInt, paramString, paramBoolean, parama)).executeOnExecutor(f1.a(), (Object[])new String[0]);
  }
  
  public static void b(ArrayList<HomeInfo> paramArrayList, a parama) {
    (new c(paramArrayList, parama)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  public static interface a {
    void a(ArrayList<HomeInfo> param1ArrayList, boolean param1Boolean);
  }
  
  private static class b extends AsyncTask<String, String, ArrayList<HomeInfo>> {
    private c.a a;
    
    private int b;
    
    private String c;
    
    private boolean d = false;
    
    private boolean e = false;
    
    private boolean f = false;
    
    private ArrayList<HomeInfo> g;
    
    b(int param1Int, String param1String, boolean param1Boolean, c.a param1a) {
      this.a = param1a;
      this.b = param1Int;
      this.c = param1String;
      this.e = param1Boolean;
    }
    
    protected ArrayList<HomeInfo> a(String... param1VarArgs) {
      // Byte code:
      //   0: ldc 'hd_video_data_size'
      //   2: astore_2
      //   3: ldc 'sd_video_data_size'
      //   5: astore_3
      //   6: new java/util/HashMap
      //   9: dup
      //   10: invokespecial <init> : ()V
      //   13: astore #4
      //   15: invokestatic y0 : ()Ljava/lang/String;
      //   18: astore #5
      //   20: ldc 'en_GB'
      //   22: aload #5
      //   24: invokevirtual equals : (Ljava/lang/Object;)Z
      //   27: ifne -> 43
      //   30: aload #5
      //   32: astore_1
      //   33: ldc 'en_CA'
      //   35: aload #5
      //   37: invokevirtual equals : (Ljava/lang/Object;)Z
      //   40: ifeq -> 46
      //   43: ldc 'en'
      //   45: astore_1
      //   46: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
      //   49: astore #5
      //   51: aload #4
      //   53: ldc 'default_cc'
      //   55: aload #5
      //   57: invokestatic d : (Landroid/content/Context;)Lcom/allinone/callerid/model/EZCountryCode;
      //   60: invokevirtual getCountry_code : ()Ljava/lang/String;
      //   63: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   66: pop
      //   67: aload #4
      //   69: ldc 'language'
      //   71: aload_1
      //   72: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   75: pop
      //   76: aload #4
      //   78: ldc 'screen_size'
      //   80: aload #5
      //   82: invokestatic c : (Landroid/content/Context;)Ljava/lang/String;
      //   85: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   88: pop
      //   89: aload #4
      //   91: ldc 'uid'
      //   93: aload #5
      //   95: invokestatic T : (Landroid/content/Context;)Ljava/lang/String;
      //   98: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   101: pop
      //   102: aload #4
      //   104: ldc 'version'
      //   106: aload #5
      //   108: invokestatic W : (Landroid/content/Context;)Ljava/lang/String;
      //   111: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   114: pop
      //   115: aload #4
      //   117: ldc 'sort'
      //   119: aload_0
      //   120: getfield c : Ljava/lang/String;
      //   123: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   126: pop
      //   127: aload #4
      //   129: ldc 'stamp'
      //   131: aload #5
      //   133: aload #5
      //   135: invokestatic T : (Landroid/content/Context;)Ljava/lang/String;
      //   138: invokestatic Q : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   141: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   144: pop
      //   145: new java/lang/StringBuilder
      //   148: dup
      //   149: invokespecial <init> : ()V
      //   152: astore_1
      //   153: aload_1
      //   154: aload_0
      //   155: getfield b : I
      //   158: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   161: pop
      //   162: ldc ''
      //   164: astore #6
      //   166: aload_1
      //   167: ldc ''
      //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   172: pop
      //   173: aload #4
      //   175: ldc 'page'
      //   177: aload_1
      //   178: invokevirtual toString : ()Ljava/lang/String;
      //   181: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   184: pop
      //   185: getstatic com/allinone/callerid/util/d0.a : Z
      //   188: istore #7
      //   190: ldc 'callscreen'
      //   192: astore_1
      //   193: iload #7
      //   195: ifeq -> 236
      //   198: new java/lang/StringBuilder
      //   201: dup
      //   202: invokespecial <init> : ()V
      //   205: astore #5
      //   207: aload #5
      //   209: ldc 'params: '
      //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   214: pop
      //   215: aload #5
      //   217: aload #4
      //   219: invokevirtual toString : ()Ljava/lang/String;
      //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   225: pop
      //   226: ldc 'callscreen'
      //   228: aload #5
      //   230: invokevirtual toString : ()Ljava/lang/String;
      //   233: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   236: aload_1
      //   237: astore #5
      //   239: ldc 'https://app.show-caller.com/caller_screen_v2/v1/getsou.php'
      //   241: aload #4
      //   243: invokestatic b : (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
      //   246: astore #4
      //   248: aload_1
      //   249: astore #5
      //   251: getstatic com/allinone/callerid/util/d0.a : Z
      //   254: ifeq -> 308
      //   257: aload_1
      //   258: astore #5
      //   260: new java/lang/StringBuilder
      //   263: astore #8
      //   265: aload_1
      //   266: astore #5
      //   268: aload #8
      //   270: invokespecial <init> : ()V
      //   273: aload_1
      //   274: astore #5
      //   276: aload #8
      //   278: ldc 'result: '
      //   280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   283: pop
      //   284: aload_1
      //   285: astore #5
      //   287: aload #8
      //   289: aload #4
      //   291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   294: pop
      //   295: aload_1
      //   296: astore #5
      //   298: ldc 'callscreen'
      //   300: aload #8
      //   302: invokevirtual toString : ()Ljava/lang/String;
      //   305: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
      //   308: aload #4
      //   310: ifnull -> 1505
      //   313: aload_1
      //   314: astore #5
      //   316: ldc ''
      //   318: aload #4
      //   320: invokevirtual equals : (Ljava/lang/Object;)Z
      //   323: ifne -> 1505
      //   326: aload_1
      //   327: astore #5
      //   329: new org/json/JSONObject
      //   332: astore #8
      //   334: aload_1
      //   335: astore #5
      //   337: aload #8
      //   339: aload #4
      //   341: invokespecial <init> : (Ljava/lang/String;)V
      //   344: aload_1
      //   345: astore #5
      //   347: aload #8
      //   349: ldc 'status'
      //   351: invokevirtual getInt : (Ljava/lang/String;)I
      //   354: istore #9
      //   356: iload #9
      //   358: iconst_1
      //   359: if_icmpne -> 1418
      //   362: aload_1
      //   363: astore #5
      //   365: aload_0
      //   366: iconst_1
      //   367: putfield d : Z
      //   370: aload_1
      //   371: astore #5
      //   373: aload #8
      //   375: ldc 'data'
      //   377: invokevirtual getJSONArray : (Ljava/lang/String;)Lorg/json/JSONArray;
      //   380: astore #4
      //   382: aload_1
      //   383: astore #5
      //   385: new java/util/ArrayList
      //   388: astore #8
      //   390: aload_1
      //   391: astore #5
      //   393: aload #8
      //   395: invokespecial <init> : ()V
      //   398: aload_1
      //   399: astore #5
      //   401: aload_0
      //   402: aload #8
      //   404: putfield g : Ljava/util/ArrayList;
      //   407: aload_1
      //   408: astore #5
      //   410: aload_0
      //   411: invokestatic c : ()Lcom/allinone/callerid/f/a;
      //   414: invokevirtual a : ()Z
      //   417: putfield f : Z
      //   420: iconst_0
      //   421: istore #9
      //   423: aload_1
      //   424: astore #5
      //   426: iload #9
      //   428: aload #4
      //   430: invokevirtual length : ()I
      //   433: if_icmpge -> 871
      //   436: aload_1
      //   437: astore #5
      //   439: aload #4
      //   441: iload #9
      //   443: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
      //   446: astore #10
      //   448: aload_1
      //   449: astore #5
      //   451: aload #10
      //   453: ldc 'id'
      //   455: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   458: astore #11
      //   460: aload_1
      //   461: astore #5
      //   463: aload #10
      //   465: ldc 'name'
      //   467: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   470: astore #8
      //   472: aload_1
      //   473: astore #5
      //   475: aload #10
      //   477: ldc 'author'
      //   479: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   482: astore #12
      //   484: aload_1
      //   485: astore #5
      //   487: aload #10
      //   489: ldc 'gif_thumb_path'
      //   491: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   494: astore #13
      //   496: aload_1
      //   497: astore #5
      //   499: aload #10
      //   501: ldc 'jpg_thumb_path'
      //   503: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   506: astore #14
      //   508: aload_1
      //   509: astore #5
      //   511: aload #10
      //   513: ldc 'sd_video_path'
      //   515: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   518: astore #15
      //   520: aload_1
      //   521: astore #5
      //   523: aload #6
      //   525: aload #10
      //   527: aload_3
      //   528: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   531: invokevirtual equals : (Ljava/lang/Object;)Z
      //   534: istore #7
      //   536: lconst_0
      //   537: lstore #16
      //   539: iload #7
      //   541: ifne -> 558
      //   544: aload_1
      //   545: astore #5
      //   547: aload #10
      //   549: aload_3
      //   550: invokevirtual getLong : (Ljava/lang/String;)J
      //   553: lstore #18
      //   555: goto -> 561
      //   558: lconst_0
      //   559: lstore #18
      //   561: aload_1
      //   562: astore #5
      //   564: aload #10
      //   566: ldc 'hd_video_path'
      //   568: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   571: astore #20
      //   573: aload_1
      //   574: astore #5
      //   576: aload #6
      //   578: aload #10
      //   580: aload_2
      //   581: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   584: invokevirtual equals : (Ljava/lang/Object;)Z
      //   587: ifne -> 601
      //   590: aload_1
      //   591: astore #5
      //   593: aload #10
      //   595: aload_2
      //   596: invokevirtual getLong : (Ljava/lang/String;)J
      //   599: lstore #16
      //   601: aload_1
      //   602: astore #5
      //   604: aload #10
      //   606: ldc 'audio_path'
      //   608: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   611: astore #21
      //   613: aload_1
      //   614: astore #5
      //   616: aload #10
      //   618: ldc 'like_count'
      //   620: invokevirtual getInt : (Ljava/lang/String;)I
      //   623: istore #22
      //   625: aload_1
      //   626: astore #5
      //   628: aload #10
      //   630: ldc 'download_count'
      //   632: invokevirtual getInt : (Ljava/lang/String;)I
      //   635: istore #23
      //   637: aload_1
      //   638: astore #5
      //   640: new com/allinone/callerid/callscreen/bean/HomeInfo
      //   643: astore #10
      //   645: aload_1
      //   646: astore #5
      //   648: aload #10
      //   650: invokespecial <init> : ()V
      //   653: aload_1
      //   654: astore #5
      //   656: aload_0
      //   657: getfield f : Z
      //   660: ifeq -> 723
      //   663: aload_1
      //   664: astore #5
      //   666: aload_0
      //   667: getfield b : I
      //   670: iconst_1
      //   671: if_icmpne -> 711
      //   674: aload_1
      //   675: astore #5
      //   677: aload_0
      //   678: getfield g : Ljava/util/ArrayList;
      //   681: invokevirtual size : ()I
      //   684: ifle -> 699
      //   687: aload_1
      //   688: astore #5
      //   690: aload #10
      //   692: iconst_0
      //   693: invokevirtual setUnLock : (Z)V
      //   696: goto -> 732
      //   699: aload_1
      //   700: astore #5
      //   702: aload #10
      //   704: iconst_1
      //   705: invokevirtual setUnLock : (Z)V
      //   708: goto -> 732
      //   711: aload_1
      //   712: astore #5
      //   714: aload #10
      //   716: iconst_0
      //   717: invokevirtual setUnLock : (Z)V
      //   720: goto -> 732
      //   723: aload_1
      //   724: astore #5
      //   726: aload #10
      //   728: iconst_1
      //   729: invokevirtual setUnLock : (Z)V
      //   732: aload_1
      //   733: astore #5
      //   735: aload #10
      //   737: aload #11
      //   739: invokevirtual setData_id : (Ljava/lang/String;)V
      //   742: aload_1
      //   743: astore #5
      //   745: aload #10
      //   747: aload #8
      //   749: invokevirtual setName : (Ljava/lang/String;)V
      //   752: aload_1
      //   753: astore #5
      //   755: aload #10
      //   757: aload #12
      //   759: invokevirtual setAuthor : (Ljava/lang/String;)V
      //   762: aload_1
      //   763: astore #5
      //   765: aload #10
      //   767: aload #13
      //   769: invokevirtual setGifimg_url : (Ljava/lang/String;)V
      //   772: aload_1
      //   773: astore #5
      //   775: aload #10
      //   777: aload #14
      //   779: invokevirtual setJpgimg_url : (Ljava/lang/String;)V
      //   782: aload_1
      //   783: astore #5
      //   785: aload #10
      //   787: aload #15
      //   789: invokevirtual setSdvideo_url : (Ljava/lang/String;)V
      //   792: aload_1
      //   793: astore #5
      //   795: aload #10
      //   797: lload #18
      //   799: invokevirtual setSdvideo_size : (J)V
      //   802: aload_1
      //   803: astore #5
      //   805: aload #10
      //   807: aload #20
      //   809: invokevirtual setHdvideo_url : (Ljava/lang/String;)V
      //   812: aload_1
      //   813: astore #5
      //   815: aload #10
      //   817: lload #16
      //   819: invokevirtual setHdvideo_size : (J)V
      //   822: aload_1
      //   823: astore #5
      //   825: aload #10
      //   827: aload #21
      //   829: invokevirtual setAudio_url : (Ljava/lang/String;)V
      //   832: aload_1
      //   833: astore #5
      //   835: aload #10
      //   837: iload #22
      //   839: invokevirtual setLike_count : (I)V
      //   842: aload_1
      //   843: astore #5
      //   845: aload #10
      //   847: iload #23
      //   849: invokevirtual setDownloads : (I)V
      //   852: aload_1
      //   853: astore #5
      //   855: aload_0
      //   856: getfield g : Ljava/util/ArrayList;
      //   859: aload #10
      //   861: invokevirtual add : (Ljava/lang/Object;)Z
      //   864: pop
      //   865: iinc #9, 1
      //   868: goto -> 423
      //   871: aload_1
      //   872: astore #5
      //   874: aload_0
      //   875: getfield e : Z
      //   878: ifeq -> 983
      //   881: aload_1
      //   882: astore #5
      //   884: invokestatic e : ()Lcom/allinone/callerid/d/b/e;
      //   887: invokevirtual b : ()Z
      //   890: istore #7
      //   892: aload_1
      //   893: astore #5
      //   895: invokestatic d : ()Lcom/allinone/callerid/d/b/c;
      //   898: invokevirtual b : ()Z
      //   901: istore #24
      //   903: aload_1
      //   904: astore #5
      //   906: new com/allinone/callerid/callscreen/bean/HomeInfo
      //   909: astore #6
      //   911: aload_1
      //   912: astore #5
      //   914: aload #6
      //   916: invokespecial <init> : ()V
      //   919: aload_1
      //   920: astore #5
      //   922: aload #6
      //   924: iload #7
      //   926: invokevirtual setDefautl_diy : (Z)V
      //   929: iload #7
      //   931: ifeq -> 960
      //   934: aload_1
      //   935: astore #5
      //   937: invokestatic e : ()Lcom/allinone/callerid/d/b/e;
      //   940: invokevirtual g : ()Lcom/allinone/callerid/callscreen/bean/HomeInfo;
      //   943: astore_3
      //   944: aload_3
      //   945: ifnull -> 960
      //   948: aload_1
      //   949: astore #5
      //   951: aload #6
      //   953: aload_3
      //   954: invokevirtual getPath : ()Ljava/lang/String;
      //   957: invokevirtual setPath : (Ljava/lang/String;)V
      //   960: aload_1
      //   961: astore #5
      //   963: aload #6
      //   965: iload #24
      //   967: invokevirtual setContacts_diy : (Z)V
      //   970: aload_1
      //   971: astore #5
      //   973: aload_0
      //   974: getfield g : Ljava/util/ArrayList;
      //   977: iconst_1
      //   978: aload #6
      //   980: invokevirtual add : (ILjava/lang/Object;)V
      //   983: aload_1
      //   984: astore #5
      //   986: aload_0
      //   987: getfield g : Ljava/util/ArrayList;
      //   990: astore #6
      //   992: aload_1
      //   993: astore_3
      //   994: aload #6
      //   996: ifnull -> 1394
      //   999: aload_1
      //   1000: astore #5
      //   1002: aload #6
      //   1004: invokevirtual iterator : ()Ljava/util/Iterator;
      //   1007: astore #6
      //   1009: aload_1
      //   1010: astore_3
      //   1011: aload_1
      //   1012: astore #5
      //   1014: aload #6
      //   1016: invokeinterface hasNext : ()Z
      //   1021: ifeq -> 1394
      //   1024: aload_1
      //   1025: astore #5
      //   1027: aload #6
      //   1029: invokeinterface next : ()Ljava/lang/Object;
      //   1034: checkcast com/allinone/callerid/callscreen/bean/HomeInfo
      //   1037: astore #4
      //   1039: aload_1
      //   1040: astore #5
      //   1042: invokestatic e : ()Lcom/allinone/callerid/d/b/e;
      //   1045: aload #4
      //   1047: invokevirtual h : (Lcom/allinone/callerid/callscreen/bean/HomeInfo;)Z
      //   1050: ifne -> 1094
      //   1053: aload_1
      //   1054: astore #5
      //   1056: invokestatic d : ()Lcom/allinone/callerid/d/b/c;
      //   1059: aload #4
      //   1061: invokevirtual getData_id : ()Ljava/lang/String;
      //   1064: invokevirtual h : (Ljava/lang/String;)Z
      //   1067: ifeq -> 1073
      //   1070: goto -> 1094
      //   1073: aload_1
      //   1074: astore #5
      //   1076: aload #4
      //   1078: iconst_0
      //   1079: invokevirtual setIsdefault : (Z)V
      //   1082: aload_1
      //   1083: astore #5
      //   1085: aload #4
      //   1087: iconst_0
      //   1088: invokevirtual setIsselect : (Z)V
      //   1091: goto -> 1112
      //   1094: aload_1
      //   1095: astore #5
      //   1097: aload #4
      //   1099: iconst_1
      //   1100: invokevirtual setIsdefault : (Z)V
      //   1103: aload_1
      //   1104: astore #5
      //   1106: aload #4
      //   1108: iconst_1
      //   1109: invokevirtual setIsselect : (Z)V
      //   1112: aload_1
      //   1113: astore #5
      //   1115: invokestatic b : ()Lcom/allinone/callerid/d/b/d;
      //   1118: aload #4
      //   1120: invokevirtual getData_id : ()Ljava/lang/String;
      //   1123: invokevirtual c : (Ljava/lang/String;)Z
      //   1126: ifeq -> 1138
      //   1129: aload_1
      //   1130: astore #5
      //   1132: aload #4
      //   1134: iconst_1
      //   1135: invokevirtual setUnLock : (Z)V
      //   1138: aload_1
      //   1139: astore #5
      //   1141: invokestatic b : ()Lcom/allinone/callerid/d/b/b;
      //   1144: aload #4
      //   1146: invokevirtual getData_id : ()Ljava/lang/String;
      //   1149: invokevirtual d : (Ljava/lang/String;)Lcom/allinone/callerid/callscreen/bean/DownloadInfo;
      //   1152: astore_2
      //   1153: aload_2
      //   1154: ifnull -> 1264
      //   1157: aload_1
      //   1158: astore #5
      //   1160: getstatic com/allinone/callerid/util/d0.a : Z
      //   1163: ifeq -> 1226
      //   1166: aload_1
      //   1167: astore #5
      //   1169: new java/lang/StringBuilder
      //   1172: astore_3
      //   1173: aload_1
      //   1174: astore #5
      //   1176: aload_3
      //   1177: invokespecial <init> : ()V
      //   1180: aload_1
      //   1181: astore #5
      //   1183: aload_3
      //   1184: ldc_w '有下载完成的： '
      //   1187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1190: pop
      //   1191: aload_1
      //   1192: astore #5
      //   1194: aload_3
      //   1195: aload_2
      //   1196: invokevirtual getPath : ()Ljava/lang/String;
      //   1199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1202: pop
      //   1203: aload_1
      //   1204: astore #5
      //   1206: aload_3
      //   1207: invokevirtual toString : ()Ljava/lang/String;
      //   1210: astore #8
      //   1212: aload_1
      //   1213: astore_3
      //   1214: aload_3
      //   1215: astore #5
      //   1217: aload_3
      //   1218: aload #8
      //   1220: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   1223: goto -> 1226
      //   1226: aload_1
      //   1227: astore_3
      //   1228: aload_3
      //   1229: astore #5
      //   1231: aload #4
      //   1233: aload_2
      //   1234: invokevirtual getPath : ()Ljava/lang/String;
      //   1237: invokevirtual setPath : (Ljava/lang/String;)V
      //   1240: aload_3
      //   1241: astore #5
      //   1243: aload #4
      //   1245: aload_2
      //   1246: invokevirtual getAudio_path : ()Ljava/lang/String;
      //   1249: invokevirtual setAudio_path : (Ljava/lang/String;)V
      //   1252: aload_3
      //   1253: astore #5
      //   1255: aload #4
      //   1257: iconst_1
      //   1258: invokevirtual setUnLock : (Z)V
      //   1261: goto -> 1264
      //   1264: aload_1
      //   1265: astore #5
      //   1267: invokestatic a : ()Lcom/allinone/callerid/d/b/a;
      //   1270: aload #4
      //   1272: invokevirtual getData_id : ()Ljava/lang/String;
      //   1275: invokevirtual b : (Ljava/lang/String;)Lcom/allinone/callerid/callscreen/bean/ActionInfo;
      //   1278: astore_3
      //   1279: aload_3
      //   1280: ifnull -> 1391
      //   1283: aload_1
      //   1284: astore #5
      //   1286: aload #4
      //   1288: aload_3
      //   1289: invokevirtual isLike : ()Z
      //   1292: invokevirtual setIslike : (Z)V
      //   1295: aload_1
      //   1296: astore #5
      //   1298: aload_3
      //   1299: invokevirtual getLike_counts : ()I
      //   1302: ifeq -> 1317
      //   1305: aload_1
      //   1306: astore #5
      //   1308: aload #4
      //   1310: aload_3
      //   1311: invokevirtual getLike_counts : ()I
      //   1314: invokevirtual setLike_count : (I)V
      //   1317: aload_1
      //   1318: astore #5
      //   1320: aload #4
      //   1322: aload_3
      //   1323: invokevirtual isReport : ()Z
      //   1326: invokevirtual setIsreport : (Z)V
      //   1329: aload_1
      //   1330: astore #5
      //   1332: getstatic com/allinone/callerid/util/d0.a : Z
      //   1335: ifeq -> 1391
      //   1338: aload_1
      //   1339: astore #5
      //   1341: new java/lang/StringBuilder
      //   1344: astore #4
      //   1346: aload_1
      //   1347: astore #5
      //   1349: aload #4
      //   1351: invokespecial <init> : ()V
      //   1354: aload_1
      //   1355: astore #5
      //   1357: aload #4
      //   1359: ldc_w 'actionInfo：'
      //   1362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1365: pop
      //   1366: aload_1
      //   1367: astore #5
      //   1369: aload #4
      //   1371: aload_3
      //   1372: invokevirtual toString : ()Ljava/lang/String;
      //   1375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1378: pop
      //   1379: aload_1
      //   1380: astore #5
      //   1382: aload_1
      //   1383: aload #4
      //   1385: invokevirtual toString : ()Ljava/lang/String;
      //   1388: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   1391: goto -> 1009
      //   1394: aload_3
      //   1395: astore #5
      //   1397: aload_0
      //   1398: iconst_1
      //   1399: anewarray java/lang/String
      //   1402: dup
      //   1403: iconst_0
      //   1404: ldc_w 'https'
      //   1407: aastore
      //   1408: invokevirtual publishProgress : ([Ljava/lang/Object;)V
      //   1411: goto -> 1505
      //   1414: astore_1
      //   1415: goto -> 1461
      //   1418: ldc 'callscreen'
      //   1420: astore_1
      //   1421: iload #9
      //   1423: bipush #-20
      //   1425: if_icmpne -> 1445
      //   1428: aload_1
      //   1429: astore #5
      //   1431: aload_0
      //   1432: iconst_0
      //   1433: putfield d : Z
      //   1436: aload_1
      //   1437: astore #5
      //   1439: invokestatic a : ()V
      //   1442: goto -> 1505
      //   1445: aload_1
      //   1446: astore #5
      //   1448: aload_0
      //   1449: iconst_0
      //   1450: putfield d : Z
      //   1453: goto -> 1505
      //   1456: astore_1
      //   1457: goto -> 1461
      //   1460: astore_1
      //   1461: aload_1
      //   1462: invokevirtual printStackTrace : ()V
      //   1465: getstatic com/allinone/callerid/util/d0.a : Z
      //   1468: ifeq -> 1505
      //   1471: new java/lang/StringBuilder
      //   1474: dup
      //   1475: invokespecial <init> : ()V
      //   1478: astore_3
      //   1479: aload_3
      //   1480: ldc_w 'Exception: '
      //   1483: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1486: pop
      //   1487: aload_3
      //   1488: aload_1
      //   1489: invokevirtual getMessage : ()Ljava/lang/String;
      //   1492: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1495: pop
      //   1496: aload #5
      //   1498: aload_3
      //   1499: invokevirtual toString : ()Ljava/lang/String;
      //   1502: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   1505: aload_0
      //   1506: getfield g : Ljava/util/ArrayList;
      //   1509: areturn
      // Exception table:
      //   from	to	target	type
      //   239	248	1460	java/lang/Exception
      //   251	257	1460	java/lang/Exception
      //   260	265	1460	java/lang/Exception
      //   268	273	1460	java/lang/Exception
      //   276	284	1460	java/lang/Exception
      //   287	295	1460	java/lang/Exception
      //   298	308	1460	java/lang/Exception
      //   316	326	1460	java/lang/Exception
      //   329	334	1460	java/lang/Exception
      //   337	344	1460	java/lang/Exception
      //   347	356	1460	java/lang/Exception
      //   365	370	1460	java/lang/Exception
      //   373	382	1460	java/lang/Exception
      //   385	390	1460	java/lang/Exception
      //   393	398	1460	java/lang/Exception
      //   401	407	1460	java/lang/Exception
      //   410	420	1460	java/lang/Exception
      //   426	436	1460	java/lang/Exception
      //   439	448	1460	java/lang/Exception
      //   451	460	1460	java/lang/Exception
      //   463	472	1460	java/lang/Exception
      //   475	484	1460	java/lang/Exception
      //   487	496	1460	java/lang/Exception
      //   499	508	1460	java/lang/Exception
      //   511	520	1460	java/lang/Exception
      //   523	536	1460	java/lang/Exception
      //   547	555	1460	java/lang/Exception
      //   564	573	1460	java/lang/Exception
      //   576	590	1460	java/lang/Exception
      //   593	601	1460	java/lang/Exception
      //   604	613	1460	java/lang/Exception
      //   616	625	1460	java/lang/Exception
      //   628	637	1460	java/lang/Exception
      //   640	645	1460	java/lang/Exception
      //   648	653	1460	java/lang/Exception
      //   656	663	1414	java/lang/Exception
      //   666	674	1414	java/lang/Exception
      //   677	687	1414	java/lang/Exception
      //   690	696	1414	java/lang/Exception
      //   702	708	1414	java/lang/Exception
      //   714	720	1414	java/lang/Exception
      //   726	732	1414	java/lang/Exception
      //   735	742	1414	java/lang/Exception
      //   745	752	1414	java/lang/Exception
      //   755	762	1414	java/lang/Exception
      //   765	772	1414	java/lang/Exception
      //   775	782	1414	java/lang/Exception
      //   785	792	1414	java/lang/Exception
      //   795	802	1414	java/lang/Exception
      //   805	812	1414	java/lang/Exception
      //   815	822	1414	java/lang/Exception
      //   825	832	1414	java/lang/Exception
      //   835	842	1414	java/lang/Exception
      //   845	852	1414	java/lang/Exception
      //   855	865	1414	java/lang/Exception
      //   874	881	1414	java/lang/Exception
      //   884	892	1414	java/lang/Exception
      //   895	903	1414	java/lang/Exception
      //   906	911	1414	java/lang/Exception
      //   914	919	1414	java/lang/Exception
      //   922	929	1414	java/lang/Exception
      //   937	944	1414	java/lang/Exception
      //   951	960	1414	java/lang/Exception
      //   963	970	1414	java/lang/Exception
      //   973	983	1414	java/lang/Exception
      //   986	992	1414	java/lang/Exception
      //   1002	1009	1414	java/lang/Exception
      //   1014	1024	1414	java/lang/Exception
      //   1027	1039	1414	java/lang/Exception
      //   1042	1053	1414	java/lang/Exception
      //   1056	1070	1414	java/lang/Exception
      //   1076	1082	1414	java/lang/Exception
      //   1085	1091	1414	java/lang/Exception
      //   1097	1103	1414	java/lang/Exception
      //   1106	1112	1414	java/lang/Exception
      //   1115	1129	1414	java/lang/Exception
      //   1132	1138	1414	java/lang/Exception
      //   1141	1153	1414	java/lang/Exception
      //   1160	1166	1414	java/lang/Exception
      //   1169	1173	1414	java/lang/Exception
      //   1176	1180	1414	java/lang/Exception
      //   1183	1191	1414	java/lang/Exception
      //   1194	1203	1414	java/lang/Exception
      //   1206	1212	1414	java/lang/Exception
      //   1217	1223	1456	java/lang/Exception
      //   1231	1240	1456	java/lang/Exception
      //   1243	1252	1456	java/lang/Exception
      //   1255	1261	1456	java/lang/Exception
      //   1267	1279	1456	java/lang/Exception
      //   1286	1295	1456	java/lang/Exception
      //   1298	1305	1456	java/lang/Exception
      //   1308	1317	1456	java/lang/Exception
      //   1320	1329	1456	java/lang/Exception
      //   1332	1338	1456	java/lang/Exception
      //   1341	1346	1456	java/lang/Exception
      //   1349	1354	1456	java/lang/Exception
      //   1357	1366	1456	java/lang/Exception
      //   1369	1379	1456	java/lang/Exception
      //   1382	1391	1456	java/lang/Exception
      //   1397	1411	1456	java/lang/Exception
      //   1431	1436	1456	java/lang/Exception
      //   1439	1442	1456	java/lang/Exception
      //   1448	1453	1456	java/lang/Exception
    }
    
    protected void b(ArrayList<HomeInfo> param1ArrayList) {
      super.onPostExecute(param1ArrayList);
      c.a a1 = this.a;
      if (a1 != null)
        a1.a(param1ArrayList, this.d); 
    }
    
    protected void c(String... param1VarArgs) {
      super.onProgressUpdate((Object[])param1VarArgs);
    }
  }
  
  private static class c extends AsyncTask<String, String, ArrayList<HomeInfo>> {
    private c.a a;
    
    private ArrayList<HomeInfo> b;
    
    c(ArrayList<HomeInfo> param1ArrayList, c.a param1a) {
      this.a = param1a;
      this.b = param1ArrayList;
    }
    
    protected ArrayList<HomeInfo> a(String... param1VarArgs) {
      try {
        if (this.b != null)
          for (byte b = 0; b < this.b.size(); b++) {
            HomeInfo homeInfo = this.b.get(b);
            if (b == 1) {
              boolean bool1 = e.e().b();
              boolean bool2 = com.allinone.callerid.d.b.c.d().b();
              homeInfo.setDefautl_diy(bool1);
              if (bool1) {
                HomeInfo homeInfo1 = e.e().g();
                if (homeInfo1 != null)
                  homeInfo.setPath(homeInfo1.getPath()); 
              } 
              homeInfo.setContacts_diy(bool2);
            } 
            if (e.e().h(homeInfo) || com.allinone.callerid.d.b.c.d().h(homeInfo.getData_id())) {
              homeInfo.setIsdefault(true);
              homeInfo.setIsselect(true);
            } else {
              homeInfo.setIsdefault(false);
              homeInfo.setIsselect(false);
            } 
            if (d.b().c(homeInfo.getData_id()))
              homeInfo.setUnLock(true); 
            DownloadInfo downloadInfo = com.allinone.callerid.d.b.b.b().d(homeInfo.getData_id());
            if (downloadInfo != null) {
              if (d0.a) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("有下载完成的： ");
                stringBuilder.append(downloadInfo.getPath());
                d0.a("callscreen", stringBuilder.toString());
              } 
              homeInfo.setPath(downloadInfo.getPath());
              homeInfo.setAudio_path(downloadInfo.getAudio_path());
              homeInfo.setUnLock(true);
            } 
            ActionInfo actionInfo = com.allinone.callerid.d.b.a.a().b(homeInfo.getData_id());
            if (actionInfo != null) {
              homeInfo.setIslike(actionInfo.isLike());
              if (actionInfo.getLike_counts() != 0)
                homeInfo.setLike_count(actionInfo.getLike_counts()); 
              homeInfo.setIsreport(actionInfo.isReport());
              if (d0.a) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("actionInfo：");
                stringBuilder.append(actionInfo.toString());
                d0.a("callscreen", stringBuilder.toString());
              } 
            } 
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return this.b;
    }
    
    protected void b(ArrayList<HomeInfo> param1ArrayList) {
      super.onPostExecute(param1ArrayList);
      c.a a1 = this.a;
      if (a1 != null)
        a1.a(param1ArrayList, false); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */