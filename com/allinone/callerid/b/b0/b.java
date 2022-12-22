package com.allinone.callerid.b.b0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.allinone.callerid.mvc.controller.contactpdt.ContactActivity;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.search.EZSearchResult;
import com.allinone.callerid.util.d0;
import java.util.ArrayList;
import java.util.List;

public class b extends BaseAdapter {
  private Activity b;
  
  private List<EZSearchResult> c;
  
  private b d;
  
  public b(Activity paramActivity, List<EZSearchResult> paramList) {
    this.b = paramActivity;
    this.c = new ArrayList<EZSearchResult>();
  }
  
  public void b(List<EZSearchResult> paramList) {
    if (paramList != null) {
      this.c.clear();
      this.c.addAll(paramList);
    } 
  }
  
  public int getCount() {
    return this.c.size();
  }
  
  public Object getItem(int paramInt) {
    return this.c.get(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 243
    //   4: aload_0
    //   5: new com/allinone/callerid/b/b0/b$b
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   15: aload_0
    //   16: getfield b : Landroid/app/Activity;
    //   19: ldc 2131493162
    //   21: aconst_null
    //   22: invokestatic inflate : (Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   25: astore_2
    //   26: aload_0
    //   27: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   30: aload_2
    //   31: ldc 2131297460
    //   33: invokevirtual findViewById : (I)Landroid/view/View;
    //   36: checkcast android/widget/TextView
    //   39: putfield a : Landroid/widget/TextView;
    //   42: aload_0
    //   43: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   46: aload_2
    //   47: ldc 2131298187
    //   49: invokevirtual findViewById : (I)Landroid/view/View;
    //   52: checkcast android/widget/TextView
    //   55: putfield e : Landroid/widget/TextView;
    //   58: aload_0
    //   59: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   62: aload_2
    //   63: ldc 2131297458
    //   65: invokevirtual findViewById : (I)Landroid/view/View;
    //   68: checkcast android/widget/TextView
    //   71: putfield b : Landroid/widget/TextView;
    //   74: aload_0
    //   75: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   78: aload_2
    //   79: ldc 2131298155
    //   81: invokevirtual findViewById : (I)Landroid/view/View;
    //   84: checkcast android/widget/TextView
    //   87: putfield f : Landroid/widget/TextView;
    //   90: aload_0
    //   91: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   94: aload_2
    //   95: ldc 2131297457
    //   97: invokevirtual findViewById : (I)Landroid/view/View;
    //   100: checkcast android/widget/TextView
    //   103: putfield c : Landroid/widget/TextView;
    //   106: aload_0
    //   107: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   110: aload_2
    //   111: ldc 2131297456
    //   113: invokevirtual findViewById : (I)Landroid/view/View;
    //   116: checkcast android/widget/TextView
    //   119: putfield d : Landroid/widget/TextView;
    //   122: aload_0
    //   123: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   126: aload_2
    //   127: ldc 2131297469
    //   129: invokevirtual findViewById : (I)Landroid/view/View;
    //   132: checkcast android/widget/FrameLayout
    //   135: putfield h : Landroid/widget/FrameLayout;
    //   138: aload_0
    //   139: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   142: getfield e : Landroid/widget/TextView;
    //   145: invokestatic b : ()Landroid/graphics/Typeface;
    //   148: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   151: aload_0
    //   152: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   155: getfield a : Landroid/widget/TextView;
    //   158: invokestatic b : ()Landroid/graphics/Typeface;
    //   161: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   164: aload_0
    //   165: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   168: getfield b : Landroid/widget/TextView;
    //   171: invokestatic b : ()Landroid/graphics/Typeface;
    //   174: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   177: aload_0
    //   178: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   181: getfield c : Landroid/widget/TextView;
    //   184: invokestatic b : ()Landroid/graphics/Typeface;
    //   187: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   190: aload_0
    //   191: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   194: getfield d : Landroid/widget/TextView;
    //   197: invokestatic b : ()Landroid/graphics/Typeface;
    //   200: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   203: aload_0
    //   204: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   207: getfield f : Landroid/widget/TextView;
    //   210: invokestatic b : ()Landroid/graphics/Typeface;
    //   213: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   216: aload_0
    //   217: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   220: aload_2
    //   221: ldc 2131297459
    //   223: invokevirtual findViewById : (I)Landroid/view/View;
    //   226: checkcast android/widget/ImageView
    //   229: putfield g : Landroid/widget/ImageView;
    //   232: aload_2
    //   233: aload_0
    //   234: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   237: invokevirtual setTag : (Ljava/lang/Object;)V
    //   240: goto -> 254
    //   243: aload_0
    //   244: aload_2
    //   245: invokevirtual getTag : ()Ljava/lang/Object;
    //   248: checkcast com/allinone/callerid/b/b0/b$b
    //   251: putfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   254: aload_0
    //   255: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   258: getfield f : Landroid/widget/TextView;
    //   261: bipush #8
    //   263: invokevirtual setVisibility : (I)V
    //   266: aload_0
    //   267: getfield c : Ljava/util/List;
    //   270: iload_1
    //   271: invokeinterface get : (I)Ljava/lang/Object;
    //   276: checkcast com/allinone/callerid/search/EZSearchResult
    //   279: astore #4
    //   281: aload #4
    //   283: invokevirtual getName : ()Ljava/lang/String;
    //   286: astore #5
    //   288: aload #4
    //   290: invokevirtual getFormat_tel_number : ()Ljava/lang/String;
    //   293: astore #6
    //   295: aload #4
    //   297: invokevirtual getType : ()Ljava/lang/String;
    //   300: astore #7
    //   302: aload #4
    //   304: invokevirtual getType_label : ()Ljava/lang/String;
    //   307: astore #8
    //   309: aload #4
    //   311: invokevirtual getNumber : ()Ljava/lang/String;
    //   314: astore #9
    //   316: aload #4
    //   318: invokevirtual getLocation : ()Ljava/lang/String;
    //   321: astore #10
    //   323: aload #4
    //   325: invokevirtual getSubtype : ()Ljava/lang/String;
    //   328: astore #11
    //   330: aload #4
    //   332: invokevirtual getKeyword : ()Ljava/lang/String;
    //   335: astore #12
    //   337: aload #4
    //   339: invokevirtual getComplaint_times : ()Ljava/lang/String;
    //   342: astore #13
    //   344: aload #13
    //   346: ifnull -> 362
    //   349: aload #13
    //   351: astore_3
    //   352: aload #13
    //   354: ldc ''
    //   356: invokevirtual equals : (Ljava/lang/Object;)Z
    //   359: ifeq -> 365
    //   362: ldc '0'
    //   364: astore_3
    //   365: aload #5
    //   367: ifnull -> 395
    //   370: ldc ''
    //   372: aload #5
    //   374: invokevirtual equals : (Ljava/lang/Object;)Z
    //   377: ifne -> 395
    //   380: aload_0
    //   381: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   384: getfield a : Landroid/widget/TextView;
    //   387: aload #5
    //   389: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   392: goto -> 437
    //   395: aload #8
    //   397: ifnull -> 425
    //   400: ldc ''
    //   402: aload #8
    //   404: invokevirtual equals : (Ljava/lang/Object;)Z
    //   407: ifne -> 425
    //   410: aload_0
    //   411: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   414: getfield a : Landroid/widget/TextView;
    //   417: aload #8
    //   419: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   422: goto -> 437
    //   425: aload_0
    //   426: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   429: getfield a : Landroid/widget/TextView;
    //   432: aload #9
    //   434: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   437: aload #6
    //   439: ifnull -> 522
    //   442: ldc ''
    //   444: aload #6
    //   446: invokevirtual equals : (Ljava/lang/Object;)Z
    //   449: ifne -> 522
    //   452: aload #7
    //   454: ifnull -> 522
    //   457: ldc ''
    //   459: aload #7
    //   461: invokevirtual equals : (Ljava/lang/Object;)Z
    //   464: ifne -> 522
    //   467: aload_0
    //   468: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   471: getfield b : Landroid/widget/TextView;
    //   474: astore #13
    //   476: new java/lang/StringBuilder
    //   479: dup
    //   480: invokespecial <init> : ()V
    //   483: astore #9
    //   485: aload #9
    //   487: aload #6
    //   489: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: pop
    //   493: aload #9
    //   495: ldc ' • '
    //   497: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   500: pop
    //   501: aload #9
    //   503: aload #7
    //   505: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   508: pop
    //   509: aload #13
    //   511: aload #9
    //   513: invokevirtual toString : ()Ljava/lang/String;
    //   516: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   519: goto -> 634
    //   522: aload #6
    //   524: ifnull -> 552
    //   527: ldc ''
    //   529: aload #6
    //   531: invokevirtual equals : (Ljava/lang/Object;)Z
    //   534: ifne -> 552
    //   537: aload_0
    //   538: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   541: getfield b : Landroid/widget/TextView;
    //   544: aload #6
    //   546: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   549: goto -> 634
    //   552: aload #7
    //   554: ifnull -> 622
    //   557: ldc ''
    //   559: aload #7
    //   561: invokevirtual equals : (Ljava/lang/Object;)Z
    //   564: ifne -> 622
    //   567: aload_0
    //   568: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   571: getfield b : Landroid/widget/TextView;
    //   574: astore #6
    //   576: new java/lang/StringBuilder
    //   579: dup
    //   580: invokespecial <init> : ()V
    //   583: astore #13
    //   585: aload #13
    //   587: aload #9
    //   589: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   592: pop
    //   593: aload #13
    //   595: ldc ' • '
    //   597: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   600: pop
    //   601: aload #13
    //   603: aload #7
    //   605: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   608: pop
    //   609: aload #6
    //   611: aload #13
    //   613: invokevirtual toString : ()Ljava/lang/String;
    //   616: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   619: goto -> 634
    //   622: aload_0
    //   623: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   626: getfield b : Landroid/widget/TextView;
    //   629: aload #9
    //   631: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   634: aload #10
    //   636: ifnull -> 675
    //   639: ldc ''
    //   641: aload #10
    //   643: invokevirtual equals : (Ljava/lang/Object;)Z
    //   646: ifne -> 675
    //   649: aload_0
    //   650: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   653: getfield c : Landroid/widget/TextView;
    //   656: iconst_0
    //   657: invokevirtual setVisibility : (I)V
    //   660: aload_0
    //   661: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   664: getfield c : Landroid/widget/TextView;
    //   667: aload #10
    //   669: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   672: goto -> 687
    //   675: aload_0
    //   676: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   679: getfield c : Landroid/widget/TextView;
    //   682: bipush #8
    //   684: invokevirtual setVisibility : (I)V
    //   687: aload #11
    //   689: ifnull -> 766
    //   692: ldc ''
    //   694: aload #11
    //   696: invokevirtual equals : (Ljava/lang/Object;)Z
    //   699: ifne -> 766
    //   702: new org/json/JSONArray
    //   705: astore #13
    //   707: aload #13
    //   709: aload #11
    //   711: invokespecial <init> : (Ljava/lang/String;)V
    //   714: aload #13
    //   716: invokevirtual length : ()I
    //   719: ifle -> 812
    //   722: aload #13
    //   724: iconst_0
    //   725: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
    //   728: ldc 'subtype'
    //   730: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   733: astore #13
    //   735: aload_0
    //   736: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   739: getfield f : Landroid/widget/TextView;
    //   742: aload #13
    //   744: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   747: aload_0
    //   748: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   751: getfield f : Landroid/widget/TextView;
    //   754: iconst_0
    //   755: invokevirtual setVisibility : (I)V
    //   758: goto -> 812
    //   761: astore #13
    //   763: goto -> 807
    //   766: aload #12
    //   768: ifnull -> 812
    //   771: ldc ''
    //   773: aload #12
    //   775: invokevirtual equals : (Ljava/lang/Object;)Z
    //   778: ifne -> 812
    //   781: aload_0
    //   782: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   785: getfield f : Landroid/widget/TextView;
    //   788: aload #12
    //   790: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   793: aload_0
    //   794: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   797: getfield f : Landroid/widget/TextView;
    //   800: iconst_0
    //   801: invokevirtual setVisibility : (I)V
    //   804: goto -> 812
    //   807: aload #13
    //   809: invokevirtual printStackTrace : ()V
    //   812: aload #4
    //   814: invokevirtual isContact : ()Z
    //   817: istore #14
    //   819: ldc 2131231148
    //   821: istore_1
    //   822: iload #14
    //   824: ifeq -> 884
    //   827: aload_0
    //   828: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   831: getfield d : Landroid/widget/TextView;
    //   834: bipush #8
    //   836: invokevirtual setVisibility : (I)V
    //   839: aload_0
    //   840: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   843: getfield g : Landroid/widget/ImageView;
    //   846: ldc 2131231148
    //   848: invokevirtual setImageResource : (I)V
    //   851: aload_0
    //   852: getfield b : Landroid/app/Activity;
    //   855: getstatic android/provider/ContactsContract$Contacts.CONTENT_URI : Landroid/net/Uri;
    //   858: aload #4
    //   860: invokevirtual getRaw_contact_id : ()I
    //   863: i2l
    //   864: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   867: ldc ''
    //   869: ldc 2131231148
    //   871: aload_0
    //   872: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   875: getfield g : Landroid/widget/ImageView;
    //   878: invokestatic c : (Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;ILandroid/widget/ImageView;)V
    //   881: goto -> 1060
    //   884: aload #4
    //   886: invokevirtual getType_label : ()Ljava/lang/String;
    //   889: ifnull -> 995
    //   892: ldc ''
    //   894: aload #4
    //   896: invokevirtual getType_label : ()Ljava/lang/String;
    //   899: invokevirtual equals : (Ljava/lang/Object;)Z
    //   902: ifne -> 995
    //   905: aload_0
    //   906: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   909: getfield d : Landroid/widget/TextView;
    //   912: astore #13
    //   914: new java/lang/StringBuilder
    //   917: dup
    //   918: invokespecial <init> : ()V
    //   921: astore #11
    //   923: aload #11
    //   925: aload_3
    //   926: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   929: pop
    //   930: aload #11
    //   932: ldc ' '
    //   934: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   937: pop
    //   938: aload #11
    //   940: aload_0
    //   941: getfield b : Landroid/app/Activity;
    //   944: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   947: ldc 2131755097
    //   949: invokevirtual getString : (I)Ljava/lang/String;
    //   952: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   955: pop
    //   956: aload #13
    //   958: aload #11
    //   960: invokevirtual toString : ()Ljava/lang/String;
    //   963: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   966: aload_0
    //   967: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   970: getfield d : Landroid/widget/TextView;
    //   973: iconst_0
    //   974: invokevirtual setVisibility : (I)V
    //   977: aload_0
    //   978: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   981: getfield g : Landroid/widget/ImageView;
    //   984: ldc 2131231149
    //   986: invokevirtual setImageResource : (I)V
    //   989: ldc 2131231149
    //   991: istore_1
    //   992: goto -> 1019
    //   995: aload_0
    //   996: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   999: getfield d : Landroid/widget/TextView;
    //   1002: bipush #8
    //   1004: invokevirtual setVisibility : (I)V
    //   1007: aload_0
    //   1008: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   1011: getfield g : Landroid/widget/ImageView;
    //   1014: ldc 2131231148
    //   1016: invokevirtual setImageResource : (I)V
    //   1019: aload #4
    //   1021: invokevirtual getIcon : ()Ljava/lang/String;
    //   1024: ifnull -> 1060
    //   1027: ldc ''
    //   1029: aload #4
    //   1031: invokevirtual getIcon : ()Ljava/lang/String;
    //   1034: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1037: ifne -> 1060
    //   1040: aload_0
    //   1041: getfield b : Landroid/app/Activity;
    //   1044: aload #4
    //   1046: invokevirtual getIcon : ()Ljava/lang/String;
    //   1049: iload_1
    //   1050: aload_0
    //   1051: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   1054: getfield g : Landroid/widget/ImageView;
    //   1057: invokestatic a : (Landroid/app/Activity;Ljava/lang/Object;ILandroid/widget/ImageView;)V
    //   1060: new com/allinone/callerid/search/CallLogBean
    //   1063: dup
    //   1064: invokespecial <init> : ()V
    //   1067: astore_3
    //   1068: aload_3
    //   1069: aload #4
    //   1071: invokevirtual getNumber : ()Ljava/lang/String;
    //   1074: invokevirtual D0 : (Ljava/lang/String;)V
    //   1077: aload #4
    //   1079: invokevirtual isContact : ()Z
    //   1082: ifeq -> 1094
    //   1085: aload_3
    //   1086: aload #4
    //   1088: invokevirtual getName : ()Ljava/lang/String;
    //   1091: invokevirtual B0 : (Ljava/lang/String;)V
    //   1094: aload_3
    //   1095: aload #4
    //   1097: invokevirtual getType_label : ()Ljava/lang/String;
    //   1100: invokevirtual d1 : (Ljava/lang/String;)V
    //   1103: aload_3
    //   1104: aload #4
    //   1106: invokevirtual getType_label_id : ()Ljava/lang/String;
    //   1109: invokevirtual e1 : (Ljava/lang/String;)V
    //   1112: aload_3
    //   1113: aload #4
    //   1115: invokevirtual getComplaint_times : ()Ljava/lang/String;
    //   1118: invokevirtual K0 : (Ljava/lang/String;)V
    //   1121: aload_3
    //   1122: aload #4
    //   1124: invokevirtual getLocation : ()Ljava/lang/String;
    //   1127: invokevirtual e0 : (Ljava/lang/String;)V
    //   1130: aload_3
    //   1131: aload #4
    //   1133: invokevirtual getName : ()Ljava/lang/String;
    //   1136: invokevirtual L0 : (Ljava/lang/String;)V
    //   1139: aload_3
    //   1140: aload #4
    //   1142: invokevirtual getType : ()Ljava/lang/String;
    //   1145: invokevirtual N0 : (Ljava/lang/String;)V
    //   1148: aload_3
    //   1149: aload #4
    //   1151: invokevirtual getOld_tel_number : ()Ljava/lang/String;
    //   1154: invokevirtual F0 : (Ljava/lang/String;)V
    //   1157: aload_3
    //   1158: aload #4
    //   1160: invokevirtual getTel_number : ()Ljava/lang/String;
    //   1163: invokevirtual Z0 : (Ljava/lang/String;)V
    //   1166: aload_3
    //   1167: aload #4
    //   1169: invokevirtual getFormat_tel_number : ()Ljava/lang/String;
    //   1172: invokevirtual w0 : (Ljava/lang/String;)V
    //   1175: aload_3
    //   1176: aload #4
    //   1178: invokevirtual getOperator : ()Ljava/lang/String;
    //   1181: invokevirtual G0 : (Ljava/lang/String;)V
    //   1184: aload_3
    //   1185: aload #4
    //   1187: invokevirtual getAddress : ()Ljava/lang/String;
    //   1190: invokevirtual a0 : (Ljava/lang/String;)V
    //   1193: aload_3
    //   1194: aload #4
    //   1196: invokevirtual getIcon : ()Ljava/lang/String;
    //   1199: invokevirtual b0 : (Ljava/lang/String;)V
    //   1202: aload_3
    //   1203: aload #4
    //   1205: invokevirtual getT_p : ()Ljava/lang/String;
    //   1208: invokevirtual Y0 : (Ljava/lang/String;)V
    //   1211: aload_3
    //   1212: aload #4
    //   1214: invokevirtual getComment_tags : ()Ljava/lang/String;
    //   1217: invokevirtual n0 : (Ljava/lang/String;)V
    //   1220: aload_3
    //   1221: aload #4
    //   1223: invokevirtual getCountry : ()Ljava/lang/String;
    //   1226: invokevirtual q0 : (Ljava/lang/String;)V
    //   1229: aload_3
    //   1230: aload #4
    //   1232: invokevirtual isContact : ()Z
    //   1235: invokevirtual o0 : (Z)V
    //   1238: aload_3
    //   1239: aload #4
    //   1241: invokevirtual getKeyword : ()Ljava/lang/String;
    //   1244: invokevirtual y0 : (Ljava/lang/String;)V
    //   1247: aload_0
    //   1248: getfield d : Lcom/allinone/callerid/b/b0/b$b;
    //   1251: getfield h : Landroid/widget/FrameLayout;
    //   1254: new com/allinone/callerid/b/b0/b$a
    //   1257: dup
    //   1258: aload_0
    //   1259: aload_3
    //   1260: invokespecial <init> : (Lcom/allinone/callerid/b/b0/b;Lcom/allinone/callerid/search/CallLogBean;)V
    //   1263: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1266: aload_2
    //   1267: areturn
    // Exception table:
    //   from	to	target	type
    //   692	758	761	java/lang/Exception
    //   771	804	761	java/lang/Exception
  }
  
  class a implements View.OnClickListener {
    a(b this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      Intent intent = new Intent();
      Bundle bundle = new Bundle();
      bundle.putParcelable("contact_tony", (Parcelable)this.b);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("getSubtype_pdt:");
        stringBuilder.append(this.b.H());
        d0.a("favtest", stringBuilder.toString());
      } 
      intent.putExtras(bundle);
      if (this.b.T()) {
        intent.setClass((Context)b.a(this.c), ContactActivity.class);
      } else {
        intent.setClass((Context)b.a(this.c), UnknownContactActivity.class);
      } 
      intent.addFlags(268435456);
      b.a(this.c).startActivity(intent);
      b.a(this.c).overridePendingTransition(2130771968, 2130771969);
    }
  }
  
  public static class b {
    TextView a;
    
    TextView b;
    
    TextView c;
    
    TextView d;
    
    TextView e;
    
    TextView f;
    
    ImageView g;
    
    FrameLayout h;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/b0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */