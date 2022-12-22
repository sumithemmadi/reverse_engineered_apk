package com.allinone.callerid.b;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.allinone.callerid.bean.QuickContactBean;
import com.allinone.callerid.util.d1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class s extends BaseAdapter implements SectionIndexer {
  private final int b;
  
  private final int c;
  
  private List<QuickContactBean> d;
  
  private Activity e;
  
  private LayoutInflater f;
  
  private ListView g;
  
  c h;
  
  public s(Activity paramActivity, List<QuickContactBean> paramList, ListView paramListView) {
    this.e = paramActivity;
    this.g = paramListView;
    this.f = LayoutInflater.from((Context)paramActivity);
    if (paramList == null) {
      this.d = new ArrayList<QuickContactBean>();
    } else {
      this.d = paramList;
    } 
    this.b = d1.b((Context)paramActivity, 2130969269, 2131231187);
    this.c = d1.b((Context)paramActivity, 2130969273, 2131231181);
  }
  
  public void b(List<QuickContactBean> paramList) {
    if (paramList == null) {
      this.d = new ArrayList<QuickContactBean>();
    } else {
      this.d = paramList;
    } 
    notifyDataSetChanged();
  }
  
  public int getCount() {
    return this.d.size();
  }
  
  public Object getItem(int paramInt) {
    return this.d.get(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public int getPositionForSection(int paramInt) {
    for (byte b = 0; b < getCount(); b++) {
      if ((((QuickContactBean)this.d.get(b)).getBean()).r.toUpperCase(Locale.CHINESE).charAt(0) == paramInt)
        return b; 
    } 
    return -1;
  }
  
  public int getSectionForPosition(int paramInt) {
    return (((QuickContactBean)this.d.get(paramInt)).getBean()).r.charAt(0);
  }
  
  public Object[] getSections() {
    return null;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: ldc ''
    //   2: astore #4
    //   4: aload_2
    //   5: ifnonnull -> 185
    //   8: aload_0
    //   9: getfield f : Landroid/view/LayoutInflater;
    //   12: ldc 2131492978
    //   14: aload_3
    //   15: iconst_0
    //   16: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   19: astore #5
    //   21: new com/allinone/callerid/b/s$c
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore_2
    //   29: aload_0
    //   30: aload_2
    //   31: putfield h : Lcom/allinone/callerid/b/s$c;
    //   34: aload_2
    //   35: aload #5
    //   37: ldc 2131297306
    //   39: invokevirtual findViewById : (I)Landroid/view/View;
    //   42: checkcast android/widget/TextView
    //   45: putfield a : Landroid/widget/TextView;
    //   48: aload_0
    //   49: getfield h : Lcom/allinone/callerid/b/s$c;
    //   52: aload #5
    //   54: ldc 2131297333
    //   56: invokevirtual findViewById : (I)Landroid/view/View;
    //   59: checkcast android/widget/TextView
    //   62: putfield b : Landroid/widget/TextView;
    //   65: aload_0
    //   66: getfield h : Lcom/allinone/callerid/b/s$c;
    //   69: aload #5
    //   71: ldc 2131297361
    //   73: invokevirtual findViewById : (I)Landroid/view/View;
    //   76: checkcast android/widget/ImageView
    //   79: putfield c : Landroid/widget/ImageView;
    //   82: aload_0
    //   83: getfield h : Lcom/allinone/callerid/b/s$c;
    //   86: aload #5
    //   88: ldc 2131297469
    //   90: invokevirtual findViewById : (I)Landroid/view/View;
    //   93: checkcast android/widget/FrameLayout
    //   96: putfield e : Landroid/widget/FrameLayout;
    //   99: aload_0
    //   100: getfield h : Lcom/allinone/callerid/b/s$c;
    //   103: aload #5
    //   105: ldc 2131296445
    //   107: invokevirtual findViewById : (I)Landroid/view/View;
    //   110: checkcast android/widget/ImageView
    //   113: putfield d : Landroid/widget/ImageView;
    //   116: aload_0
    //   117: getfield h : Lcom/allinone/callerid/b/s$c;
    //   120: aload #5
    //   122: ldc 2131297359
    //   124: invokevirtual findViewById : (I)Landroid/view/View;
    //   127: checkcast android/widget/TextView
    //   130: putfield f : Landroid/widget/TextView;
    //   133: aload_0
    //   134: getfield h : Lcom/allinone/callerid/b/s$c;
    //   137: getfield a : Landroid/widget/TextView;
    //   140: invokestatic b : ()Landroid/graphics/Typeface;
    //   143: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   146: aload_0
    //   147: getfield h : Lcom/allinone/callerid/b/s$c;
    //   150: getfield b : Landroid/widget/TextView;
    //   153: invokestatic b : ()Landroid/graphics/Typeface;
    //   156: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   159: aload_0
    //   160: getfield h : Lcom/allinone/callerid/b/s$c;
    //   163: getfield e : Landroid/widget/FrameLayout;
    //   166: iload_1
    //   167: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   170: invokevirtual setTag : (Ljava/lang/Object;)V
    //   173: aload #5
    //   175: aload_0
    //   176: getfield h : Lcom/allinone/callerid/b/s$c;
    //   179: invokevirtual setTag : (Ljava/lang/Object;)V
    //   182: goto -> 199
    //   185: aload_0
    //   186: aload_2
    //   187: invokevirtual getTag : ()Ljava/lang/Object;
    //   190: checkcast com/allinone/callerid/b/s$c
    //   193: putfield h : Lcom/allinone/callerid/b/s$c;
    //   196: aload_2
    //   197: astore #5
    //   199: aload_0
    //   200: getfield d : Ljava/util/List;
    //   203: iload_1
    //   204: invokeinterface get : (I)Ljava/lang/Object;
    //   209: checkcast com/allinone/callerid/bean/QuickContactBean
    //   212: astore #6
    //   214: aload #6
    //   216: invokevirtual getBean : ()Lcom/allinone/callerid/search/CallLogBean;
    //   219: astore #7
    //   221: aload #7
    //   223: ifnull -> 1206
    //   226: aload #6
    //   228: aload #7
    //   230: invokevirtual setBean : (Lcom/allinone/callerid/search/CallLogBean;)V
    //   233: aload #7
    //   235: invokevirtual n : ()Ljava/lang/String;
    //   238: astore_3
    //   239: aload_3
    //   240: ifnull -> 254
    //   243: aload_3
    //   244: astore_2
    //   245: ldc ''
    //   247: aload_3
    //   248: invokevirtual equals : (Ljava/lang/Object;)Z
    //   251: ifeq -> 267
    //   254: aload_0
    //   255: getfield e : Landroid/app/Activity;
    //   258: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   261: ldc 2131755830
    //   263: invokevirtual getString : (I)Ljava/lang/String;
    //   266: astore_2
    //   267: aload_0
    //   268: getfield h : Lcom/allinone/callerid/b/s$c;
    //   271: getfield a : Landroid/widget/TextView;
    //   274: aload_2
    //   275: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   278: aload_0
    //   279: getfield h : Lcom/allinone/callerid/b/s$c;
    //   282: getfield b : Landroid/widget/TextView;
    //   285: aload #7
    //   287: invokevirtual p : ()Ljava/lang/String;
    //   290: ldc ' '
    //   292: ldc ''
    //   294: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   297: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   300: aload_0
    //   301: getfield h : Lcom/allinone/callerid/b/s$c;
    //   304: getfield e : Landroid/widget/FrameLayout;
    //   307: astore_3
    //   308: new com/allinone/callerid/b/s$a
    //   311: astore_2
    //   312: aload_2
    //   313: aload_0
    //   314: iload_1
    //   315: invokespecial <init> : (Lcom/allinone/callerid/b/s;I)V
    //   318: aload_3
    //   319: aload_2
    //   320: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   323: aload_0
    //   324: getfield h : Lcom/allinone/callerid/b/s$c;
    //   327: getfield d : Landroid/widget/ImageView;
    //   330: astore_3
    //   331: new com/allinone/callerid/b/s$b
    //   334: astore_2
    //   335: aload_2
    //   336: aload_0
    //   337: iload_1
    //   338: invokespecial <init> : (Lcom/allinone/callerid/b/s;I)V
    //   341: aload_3
    //   342: aload_2
    //   343: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   346: aload #6
    //   348: invokevirtual getIsquick : ()Ljava/lang/Boolean;
    //   351: ifnull -> 396
    //   354: aload #6
    //   356: invokevirtual getIsquick : ()Ljava/lang/Boolean;
    //   359: invokevirtual booleanValue : ()Z
    //   362: ifeq -> 382
    //   365: aload_0
    //   366: getfield h : Lcom/allinone/callerid/b/s$c;
    //   369: getfield d : Landroid/widget/ImageView;
    //   372: aload_0
    //   373: getfield c : I
    //   376: invokevirtual setImageResource : (I)V
    //   379: goto -> 396
    //   382: aload_0
    //   383: getfield h : Lcom/allinone/callerid/b/s$c;
    //   386: getfield d : Landroid/widget/ImageView;
    //   389: aload_0
    //   390: getfield b : I
    //   393: invokevirtual setImageResource : (I)V
    //   396: aload #7
    //   398: invokevirtual u : ()Ljava/lang/String;
    //   401: ifnull -> 467
    //   404: aload #7
    //   406: invokevirtual u : ()Ljava/lang/String;
    //   409: ldc ''
    //   411: invokevirtual equals : (Ljava/lang/Object;)Z
    //   414: ifne -> 467
    //   417: aload #7
    //   419: invokevirtual u : ()Ljava/lang/String;
    //   422: invokestatic parseLong : (Ljava/lang/String;)J
    //   425: lconst_0
    //   426: lcmp
    //   427: ifle -> 467
    //   430: aload_0
    //   431: getfield e : Landroid/app/Activity;
    //   434: getstatic android/provider/ContactsContract$Contacts.CONTENT_URI : Landroid/net/Uri;
    //   437: aload #7
    //   439: invokevirtual v : ()I
    //   442: i2l
    //   443: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   446: aload #7
    //   448: invokevirtual a : ()Ljava/lang/String;
    //   451: ldc_w 2131231148
    //   454: aload_0
    //   455: getfield h : Lcom/allinone/callerid/b/s$c;
    //   458: getfield c : Landroid/widget/ImageView;
    //   461: invokestatic c : (Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;ILandroid/widget/ImageView;)V
    //   464: goto -> 488
    //   467: aload_0
    //   468: getfield h : Lcom/allinone/callerid/b/s$c;
    //   471: getfield c : Landroid/widget/ImageView;
    //   474: ldc_w 2131231148
    //   477: invokevirtual setImageResource : (I)V
    //   480: goto -> 488
    //   483: astore_2
    //   484: aload_2
    //   485: invokevirtual printStackTrace : ()V
    //   488: aload #7
    //   490: invokevirtual n : ()Ljava/lang/String;
    //   493: ifnull -> 739
    //   496: ldc ''
    //   498: aload #7
    //   500: invokevirtual n : ()Ljava/lang/String;
    //   503: invokevirtual equals : (Ljava/lang/Object;)Z
    //   506: ifne -> 739
    //   509: aload #7
    //   511: invokevirtual n : ()Ljava/lang/String;
    //   514: invokevirtual length : ()I
    //   517: ifle -> 739
    //   520: aload #7
    //   522: invokevirtual n : ()Ljava/lang/String;
    //   525: iconst_0
    //   526: invokevirtual charAt : (I)C
    //   529: istore #8
    //   531: iload #8
    //   533: bipush #65
    //   535: if_icmplt -> 545
    //   538: iload #8
    //   540: bipush #90
    //   542: if_icmple -> 559
    //   545: iload #8
    //   547: bipush #97
    //   549: if_icmplt -> 603
    //   552: iload #8
    //   554: bipush #122
    //   556: if_icmpgt -> 603
    //   559: new java/lang/StringBuilder
    //   562: astore_2
    //   563: aload_2
    //   564: invokespecial <init> : ()V
    //   567: aload_2
    //   568: ldc ''
    //   570: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   573: pop
    //   574: aload_2
    //   575: iload #8
    //   577: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   580: pop
    //   581: aload_2
    //   582: invokevirtual toString : ()Ljava/lang/String;
    //   585: astore_2
    //   586: aload_0
    //   587: getfield h : Lcom/allinone/callerid/b/s$c;
    //   590: getfield f : Landroid/widget/TextView;
    //   593: aload_2
    //   594: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   597: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   600: goto -> 771
    //   603: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   606: aload #7
    //   608: invokevirtual n : ()Ljava/lang/String;
    //   611: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   614: iconst_0
    //   615: invokevirtual get : (I)Ljava/lang/Object;
    //   618: checkcast com/allinone/callerid/util/v$a
    //   621: getfield c : Ljava/lang/String;
    //   624: astore_2
    //   625: aload_2
    //   626: ifnull -> 717
    //   629: ldc ''
    //   631: aload_2
    //   632: invokevirtual equals : (Ljava/lang/Object;)Z
    //   635: ifne -> 717
    //   638: aload_2
    //   639: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   642: iconst_0
    //   643: invokevirtual charAt : (I)C
    //   646: istore #8
    //   648: new java/lang/StringBuilder
    //   651: astore_2
    //   652: aload_2
    //   653: invokespecial <init> : ()V
    //   656: aload_2
    //   657: iload #8
    //   659: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   662: pop
    //   663: aload_2
    //   664: ldc ''
    //   666: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   669: pop
    //   670: aload_2
    //   671: invokevirtual toString : ()Ljava/lang/String;
    //   674: ldc_w '[0-9]'
    //   677: invokevirtual matches : (Ljava/lang/String;)Z
    //   680: ifeq -> 699
    //   683: aload_0
    //   684: getfield h : Lcom/allinone/callerid/b/s$c;
    //   687: getfield f : Landroid/widget/TextView;
    //   690: ldc_w '#'
    //   693: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   696: goto -> 771
    //   699: aload_0
    //   700: getfield h : Lcom/allinone/callerid/b/s$c;
    //   703: getfield f : Landroid/widget/TextView;
    //   706: iload #8
    //   708: invokestatic valueOf : (C)Ljava/lang/String;
    //   711: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   714: goto -> 771
    //   717: aload_0
    //   718: getfield h : Lcom/allinone/callerid/b/s$c;
    //   721: getfield f : Landroid/widget/TextView;
    //   724: aload #7
    //   726: invokevirtual n : ()Ljava/lang/String;
    //   729: iconst_0
    //   730: invokevirtual charAt : (I)C
    //   733: invokevirtual setText : (I)V
    //   736: goto -> 771
    //   739: aload_0
    //   740: getfield h : Lcom/allinone/callerid/b/s$c;
    //   743: getfield f : Landroid/widget/TextView;
    //   746: bipush #8
    //   748: invokevirtual setVisibility : (I)V
    //   751: goto -> 771
    //   754: astore_2
    //   755: aload_0
    //   756: getfield h : Lcom/allinone/callerid/b/s$c;
    //   759: getfield f : Landroid/widget/TextView;
    //   762: bipush #8
    //   764: invokevirtual setVisibility : (I)V
    //   767: aload_2
    //   768: invokevirtual printStackTrace : ()V
    //   771: aload_0
    //   772: getfield d : Ljava/util/List;
    //   775: astore_2
    //   776: aload_2
    //   777: ifnull -> 1152
    //   780: aload_2
    //   781: invokeinterface size : ()I
    //   786: iconst_1
    //   787: if_icmple -> 1152
    //   790: iload_1
    //   791: ifle -> 1152
    //   794: aload_0
    //   795: getfield d : Ljava/util/List;
    //   798: iload_1
    //   799: iconst_1
    //   800: isub
    //   801: invokeinterface get : (I)Ljava/lang/Object;
    //   806: checkcast com/allinone/callerid/bean/QuickContactBean
    //   809: invokevirtual getBean : ()Lcom/allinone/callerid/search/CallLogBean;
    //   812: invokevirtual n : ()Ljava/lang/String;
    //   815: astore_2
    //   816: aload_0
    //   817: getfield d : Ljava/util/List;
    //   820: iload_1
    //   821: invokeinterface get : (I)Ljava/lang/Object;
    //   826: checkcast com/allinone/callerid/bean/QuickContactBean
    //   829: invokevirtual getBean : ()Lcom/allinone/callerid/search/CallLogBean;
    //   832: invokevirtual n : ()Ljava/lang/String;
    //   835: astore #7
    //   837: aload_2
    //   838: ifnull -> 971
    //   841: ldc ''
    //   843: aload_2
    //   844: invokevirtual equals : (Ljava/lang/Object;)Z
    //   847: ifne -> 971
    //   850: aload_2
    //   851: iconst_0
    //   852: invokevirtual charAt : (I)C
    //   855: istore #8
    //   857: iload #8
    //   859: bipush #65
    //   861: if_icmplt -> 871
    //   864: iload #8
    //   866: bipush #90
    //   868: if_icmple -> 885
    //   871: iload #8
    //   873: bipush #97
    //   875: if_icmplt -> 918
    //   878: iload #8
    //   880: bipush #122
    //   882: if_icmpgt -> 918
    //   885: new java/lang/StringBuilder
    //   888: astore_2
    //   889: aload_2
    //   890: invokespecial <init> : ()V
    //   893: aload_2
    //   894: ldc ''
    //   896: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   899: pop
    //   900: aload_2
    //   901: iload #8
    //   903: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   906: pop
    //   907: aload_2
    //   908: invokevirtual toString : ()Ljava/lang/String;
    //   911: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   914: astore_2
    //   915: goto -> 974
    //   918: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   921: aload_2
    //   922: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   925: iconst_0
    //   926: invokevirtual get : (I)Ljava/lang/Object;
    //   929: checkcast com/allinone/callerid/util/v$a
    //   932: getfield c : Ljava/lang/String;
    //   935: iconst_0
    //   936: invokevirtual charAt : (I)C
    //   939: istore #8
    //   941: new java/lang/StringBuilder
    //   944: astore_2
    //   945: aload_2
    //   946: invokespecial <init> : ()V
    //   949: aload_2
    //   950: ldc ''
    //   952: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   955: pop
    //   956: aload_2
    //   957: iload #8
    //   959: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   962: pop
    //   963: aload_2
    //   964: invokevirtual toString : ()Ljava/lang/String;
    //   967: astore_2
    //   968: goto -> 974
    //   971: ldc ''
    //   973: astore_2
    //   974: aload #4
    //   976: astore_3
    //   977: aload #7
    //   979: ifnull -> 1115
    //   982: aload #4
    //   984: astore_3
    //   985: ldc ''
    //   987: aload #7
    //   989: invokevirtual equals : (Ljava/lang/Object;)Z
    //   992: ifne -> 1115
    //   995: aload #7
    //   997: iconst_0
    //   998: invokevirtual charAt : (I)C
    //   1001: istore #8
    //   1003: iload #8
    //   1005: bipush #65
    //   1007: if_icmplt -> 1017
    //   1010: iload #8
    //   1012: bipush #90
    //   1014: if_icmple -> 1031
    //   1017: iload #8
    //   1019: bipush #97
    //   1021: if_icmplt -> 1064
    //   1024: iload #8
    //   1026: bipush #122
    //   1028: if_icmpgt -> 1064
    //   1031: new java/lang/StringBuilder
    //   1034: astore_3
    //   1035: aload_3
    //   1036: invokespecial <init> : ()V
    //   1039: aload_3
    //   1040: ldc ''
    //   1042: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1045: pop
    //   1046: aload_3
    //   1047: iload #8
    //   1049: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1052: pop
    //   1053: aload_3
    //   1054: invokevirtual toString : ()Ljava/lang/String;
    //   1057: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1060: astore_3
    //   1061: goto -> 1115
    //   1064: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1067: aload #7
    //   1069: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1072: iconst_0
    //   1073: invokevirtual get : (I)Ljava/lang/Object;
    //   1076: checkcast com/allinone/callerid/util/v$a
    //   1079: getfield c : Ljava/lang/String;
    //   1082: iconst_0
    //   1083: invokevirtual charAt : (I)C
    //   1086: istore #8
    //   1088: new java/lang/StringBuilder
    //   1091: astore_3
    //   1092: aload_3
    //   1093: invokespecial <init> : ()V
    //   1096: aload_3
    //   1097: ldc ''
    //   1099: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1102: pop
    //   1103: aload_3
    //   1104: iload #8
    //   1106: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1109: pop
    //   1110: aload_3
    //   1111: invokevirtual toString : ()Ljava/lang/String;
    //   1114: astore_3
    //   1115: aload_3
    //   1116: aload_2
    //   1117: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1120: ifeq -> 1138
    //   1123: aload_0
    //   1124: getfield h : Lcom/allinone/callerid/b/s$c;
    //   1127: getfield f : Landroid/widget/TextView;
    //   1130: bipush #8
    //   1132: invokevirtual setVisibility : (I)V
    //   1135: goto -> 1206
    //   1138: aload_0
    //   1139: getfield h : Lcom/allinone/callerid/b/s$c;
    //   1142: getfield f : Landroid/widget/TextView;
    //   1145: iconst_0
    //   1146: invokevirtual setVisibility : (I)V
    //   1149: goto -> 1206
    //   1152: aload_0
    //   1153: getfield d : Ljava/util/List;
    //   1156: astore_2
    //   1157: aload_2
    //   1158: ifnull -> 1206
    //   1161: aload_2
    //   1162: invokeinterface size : ()I
    //   1167: iconst_1
    //   1168: if_icmple -> 1206
    //   1171: iload_1
    //   1172: ifne -> 1206
    //   1175: aload_0
    //   1176: getfield h : Lcom/allinone/callerid/b/s$c;
    //   1179: getfield f : Landroid/widget/TextView;
    //   1182: iconst_0
    //   1183: invokevirtual setVisibility : (I)V
    //   1186: goto -> 1206
    //   1189: astore_2
    //   1190: aload_0
    //   1191: getfield h : Lcom/allinone/callerid/b/s$c;
    //   1194: getfield f : Landroid/widget/TextView;
    //   1197: bipush #8
    //   1199: invokevirtual setVisibility : (I)V
    //   1202: aload_2
    //   1203: invokevirtual printStackTrace : ()V
    //   1206: aload #5
    //   1208: areturn
    // Exception table:
    //   from	to	target	type
    //   233	239	483	java/lang/Exception
    //   245	254	483	java/lang/Exception
    //   254	267	483	java/lang/Exception
    //   267	379	483	java/lang/Exception
    //   382	396	483	java/lang/Exception
    //   396	464	483	java/lang/Exception
    //   467	480	483	java/lang/Exception
    //   488	531	754	java/lang/Exception
    //   559	600	754	java/lang/Exception
    //   603	625	754	java/lang/Exception
    //   629	696	754	java/lang/Exception
    //   699	714	754	java/lang/Exception
    //   717	736	754	java/lang/Exception
    //   739	751	754	java/lang/Exception
    //   771	776	1189	java/lang/Exception
    //   780	790	1189	java/lang/Exception
    //   794	837	1189	java/lang/Exception
    //   841	857	1189	java/lang/Exception
    //   885	915	1189	java/lang/Exception
    //   918	968	1189	java/lang/Exception
    //   985	1003	1189	java/lang/Exception
    //   1031	1061	1189	java/lang/Exception
    //   1064	1115	1189	java/lang/Exception
    //   1115	1135	1189	java/lang/Exception
    //   1138	1149	1189	java/lang/Exception
    //   1152	1157	1189	java/lang/Exception
    //   1161	1171	1189	java/lang/Exception
    //   1175	1186	1189	java/lang/Exception
  }
  
  class a implements View.OnClickListener {
    a(s this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = s.a(this.c).getOnItemClickListener();
      ListView listView = s.a(this.c);
      int i = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
    }
  }
  
  class b implements View.OnClickListener {
    b(s this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = s.a(this.c).getOnItemClickListener();
      ListView listView = s.a(this.c);
      int i = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
    }
  }
  
  public static class c {
    TextView a;
    
    TextView b;
    
    ImageView c;
    
    ImageView d;
    
    FrameLayout e;
    
    TextView f;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */