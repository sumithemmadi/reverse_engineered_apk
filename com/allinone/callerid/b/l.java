package com.allinone.callerid.b;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class l extends BaseAdapter {
  private final int b;
  
  private Context c;
  
  private List<CallLogBean> d;
  
  private HashMap<String, Integer> e = new HashMap<String, Integer>();
  
  private LayoutInflater f;
  
  private ListView g;
  
  private int h = 0;
  
  private d i;
  
  private c j;
  
  private Typeface k;
  
  private final SpannableStringBuilder l = new SpannableStringBuilder();
  
  public l(Context paramContext, List<CallLogBean> paramList, HashMap<String, Integer> paramHashMap, ListView paramListView) {
    this.c = paramContext;
    this.d = paramList;
    this.f = LayoutInflater.from(paramContext);
    this.g = paramListView;
    this.e = paramHashMap;
    this.k = g1.b();
    this.b = d1.a(paramContext, 2130968859, 2131099706);
  }
  
  public void b(List<CallLogBean> paramList, int paramInt) {
    if (paramList == null) {
      this.d = new ArrayList<CallLogBean>();
    } else {
      this.d = paramList;
    } 
    this.h = paramInt;
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
  
  public int getItemViewType(int paramInt) {
    try {
      boolean bool = ((CallLogBean)this.d.get(paramInt)).T();
      if (bool)
        return 0; 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return 1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_2
    //   1: astore #4
    //   3: aload_0
    //   4: iload_1
    //   5: invokevirtual getItemViewType : (I)I
    //   8: istore #5
    //   10: aload_2
    //   11: ifnonnull -> 623
    //   14: iload #5
    //   16: ifeq -> 428
    //   19: iload #5
    //   21: iconst_1
    //   22: if_icmpeq -> 30
    //   25: aload_2
    //   26: astore_3
    //   27: goto -> 704
    //   30: aload_2
    //   31: astore #4
    //   33: aload_0
    //   34: getfield f : Landroid/view/LayoutInflater;
    //   37: ldc 2131493157
    //   39: aconst_null
    //   40: invokevirtual inflate : (ILandroid/view/ViewGroup;)Landroid/view/View;
    //   43: astore_3
    //   44: aload_3
    //   45: astore #4
    //   47: new com/allinone/callerid/b/l$c
    //   50: astore_2
    //   51: aload_3
    //   52: astore #4
    //   54: aload_2
    //   55: aconst_null
    //   56: invokespecial <init> : (Lcom/allinone/callerid/b/l$a;)V
    //   59: aload_3
    //   60: astore #4
    //   62: aload_0
    //   63: aload_2
    //   64: putfield j : Lcom/allinone/callerid/b/l$c;
    //   67: aload_3
    //   68: astore #4
    //   70: aload_2
    //   71: aload_3
    //   72: ldc 2131296451
    //   74: invokevirtual findViewById : (I)Landroid/view/View;
    //   77: checkcast android/widget/ImageView
    //   80: putfield a : Landroid/widget/ImageView;
    //   83: aload_3
    //   84: astore #4
    //   86: aload_0
    //   87: getfield j : Lcom/allinone/callerid/b/l$c;
    //   90: aload_3
    //   91: ldc 2131296452
    //   93: invokevirtual findViewById : (I)Landroid/view/View;
    //   96: checkcast android/widget/ImageView
    //   99: putfield f : Landroid/widget/ImageView;
    //   102: aload_3
    //   103: astore #4
    //   105: aload_0
    //   106: getfield j : Lcom/allinone/callerid/b/l$c;
    //   109: aload_3
    //   110: ldc 2131296453
    //   112: invokevirtual findViewById : (I)Landroid/view/View;
    //   115: checkcast android/widget/ImageView
    //   118: putfield g : Landroid/widget/ImageView;
    //   121: aload_3
    //   122: astore #4
    //   124: aload_0
    //   125: getfield j : Lcom/allinone/callerid/b/l$c;
    //   128: getfield f : Landroid/widget/ImageView;
    //   131: bipush #8
    //   133: invokevirtual setVisibility : (I)V
    //   136: aload_3
    //   137: astore #4
    //   139: aload_0
    //   140: getfield j : Lcom/allinone/callerid/b/l$c;
    //   143: getfield g : Landroid/widget/ImageView;
    //   146: bipush #8
    //   148: invokevirtual setVisibility : (I)V
    //   151: aload_3
    //   152: astore #4
    //   154: aload_0
    //   155: getfield j : Lcom/allinone/callerid/b/l$c;
    //   158: aload_3
    //   159: ldc 2131297304
    //   161: invokevirtual findViewById : (I)Landroid/view/View;
    //   164: checkcast android/widget/TextView
    //   167: putfield j : Landroid/widget/TextView;
    //   170: aload_3
    //   171: astore #4
    //   173: aload_0
    //   174: getfield j : Lcom/allinone/callerid/b/l$c;
    //   177: aload_3
    //   178: ldc 2131298187
    //   180: invokevirtual findViewById : (I)Landroid/view/View;
    //   183: checkcast android/widget/TextView
    //   186: putfield d : Landroid/widget/TextView;
    //   189: aload_3
    //   190: astore #4
    //   192: aload_0
    //   193: getfield j : Lcom/allinone/callerid/b/l$c;
    //   196: aload_3
    //   197: ldc 2131297753
    //   199: invokevirtual findViewById : (I)Landroid/view/View;
    //   202: checkcast android/widget/TextView
    //   205: putfield b : Landroid/widget/TextView;
    //   208: aload_3
    //   209: astore #4
    //   211: aload_0
    //   212: getfield j : Lcom/allinone/callerid/b/l$c;
    //   215: aload_3
    //   216: ldc 2131297875
    //   218: invokevirtual findViewById : (I)Landroid/view/View;
    //   221: checkcast android/widget/TextView
    //   224: putfield c : Landroid/widget/TextView;
    //   227: aload_3
    //   228: astore #4
    //   230: aload_0
    //   231: getfield j : Lcom/allinone/callerid/b/l$c;
    //   234: aload_3
    //   235: ldc 2131298026
    //   237: invokevirtual findViewById : (I)Landroid/view/View;
    //   240: checkcast android/widget/TextView
    //   243: putfield e : Landroid/widget/TextView;
    //   246: aload_3
    //   247: astore #4
    //   249: aload_0
    //   250: getfield j : Lcom/allinone/callerid/b/l$c;
    //   253: getfield e : Landroid/widget/TextView;
    //   256: bipush #8
    //   258: invokevirtual setVisibility : (I)V
    //   261: aload_3
    //   262: astore #4
    //   264: aload_0
    //   265: getfield j : Lcom/allinone/callerid/b/l$c;
    //   268: getfield c : Landroid/widget/TextView;
    //   271: ldc ''
    //   273: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   276: aload_3
    //   277: astore #4
    //   279: aload_0
    //   280: getfield j : Lcom/allinone/callerid/b/l$c;
    //   283: getfield c : Landroid/widget/TextView;
    //   286: bipush #8
    //   288: invokevirtual setVisibility : (I)V
    //   291: aload_3
    //   292: astore #4
    //   294: aload_0
    //   295: getfield j : Lcom/allinone/callerid/b/l$c;
    //   298: aload_3
    //   299: ldc 2131297469
    //   301: invokevirtual findViewById : (I)Landroid/view/View;
    //   304: checkcast android/widget/FrameLayout
    //   307: putfield h : Landroid/widget/FrameLayout;
    //   310: aload_3
    //   311: astore #4
    //   313: aload_0
    //   314: getfield j : Lcom/allinone/callerid/b/l$c;
    //   317: aload_3
    //   318: ldc 2131297468
    //   320: invokevirtual findViewById : (I)Landroid/view/View;
    //   323: checkcast android/widget/LinearLayout
    //   326: putfield i : Landroid/widget/LinearLayout;
    //   329: aload_3
    //   330: astore #4
    //   332: aload_0
    //   333: getfield j : Lcom/allinone/callerid/b/l$c;
    //   336: getfield j : Landroid/widget/TextView;
    //   339: aload_0
    //   340: getfield k : Landroid/graphics/Typeface;
    //   343: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   346: aload_3
    //   347: astore #4
    //   349: aload_0
    //   350: getfield j : Lcom/allinone/callerid/b/l$c;
    //   353: getfield d : Landroid/widget/TextView;
    //   356: aload_0
    //   357: getfield k : Landroid/graphics/Typeface;
    //   360: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   363: aload_3
    //   364: astore #4
    //   366: aload_0
    //   367: getfield j : Lcom/allinone/callerid/b/l$c;
    //   370: getfield c : Landroid/widget/TextView;
    //   373: aload_0
    //   374: getfield k : Landroid/graphics/Typeface;
    //   377: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   380: aload_3
    //   381: astore #4
    //   383: aload_0
    //   384: getfield j : Lcom/allinone/callerid/b/l$c;
    //   387: getfield b : Landroid/widget/TextView;
    //   390: aload_0
    //   391: getfield k : Landroid/graphics/Typeface;
    //   394: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   397: aload_3
    //   398: astore #4
    //   400: aload_0
    //   401: getfield j : Lcom/allinone/callerid/b/l$c;
    //   404: getfield e : Landroid/widget/TextView;
    //   407: aload_0
    //   408: getfield k : Landroid/graphics/Typeface;
    //   411: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   414: aload_3
    //   415: astore #4
    //   417: aload_3
    //   418: aload_0
    //   419: getfield j : Lcom/allinone/callerid/b/l$c;
    //   422: invokevirtual setTag : (Ljava/lang/Object;)V
    //   425: goto -> 704
    //   428: aload_2
    //   429: astore #4
    //   431: aload_0
    //   432: getfield f : Landroid/view/LayoutInflater;
    //   435: ldc 2131493158
    //   437: aload_3
    //   438: iconst_0
    //   439: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   442: astore_3
    //   443: aload_3
    //   444: astore #4
    //   446: new com/allinone/callerid/b/l$d
    //   449: astore_2
    //   450: aload_3
    //   451: astore #4
    //   453: aload_2
    //   454: aconst_null
    //   455: invokespecial <init> : (Lcom/allinone/callerid/b/l$a;)V
    //   458: aload_3
    //   459: astore #4
    //   461: aload_0
    //   462: aload_2
    //   463: putfield i : Lcom/allinone/callerid/b/l$d;
    //   466: aload_3
    //   467: astore #4
    //   469: aload_2
    //   470: aload_3
    //   471: ldc 2131297304
    //   473: invokevirtual findViewById : (I)Landroid/view/View;
    //   476: checkcast android/widget/TextView
    //   479: putfield a : Landroid/widget/TextView;
    //   482: aload_3
    //   483: astore #4
    //   485: aload_0
    //   486: getfield i : Lcom/allinone/callerid/b/l$d;
    //   489: aload_3
    //   490: ldc 2131298022
    //   492: invokevirtual findViewById : (I)Landroid/view/View;
    //   495: checkcast android/widget/TextView
    //   498: putfield b : Landroid/widget/TextView;
    //   501: aload_3
    //   502: astore #4
    //   504: aload_0
    //   505: getfield i : Lcom/allinone/callerid/b/l$d;
    //   508: aload_3
    //   509: ldc 2131298187
    //   511: invokevirtual findViewById : (I)Landroid/view/View;
    //   514: checkcast android/widget/TextView
    //   517: putfield c : Landroid/widget/TextView;
    //   520: aload_3
    //   521: astore #4
    //   523: aload_0
    //   524: getfield i : Lcom/allinone/callerid/b/l$d;
    //   527: aload_3
    //   528: ldc 2131297469
    //   530: invokevirtual findViewById : (I)Landroid/view/View;
    //   533: checkcast android/widget/FrameLayout
    //   536: putfield d : Landroid/widget/FrameLayout;
    //   539: aload_3
    //   540: astore #4
    //   542: aload_0
    //   543: getfield i : Lcom/allinone/callerid/b/l$d;
    //   546: aload_3
    //   547: ldc 2131297468
    //   549: invokevirtual findViewById : (I)Landroid/view/View;
    //   552: checkcast android/widget/LinearLayout
    //   555: putfield e : Landroid/widget/LinearLayout;
    //   558: aload_3
    //   559: astore #4
    //   561: aload_0
    //   562: getfield i : Lcom/allinone/callerid/b/l$d;
    //   565: getfield a : Landroid/widget/TextView;
    //   568: aload_0
    //   569: getfield k : Landroid/graphics/Typeface;
    //   572: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   575: aload_3
    //   576: astore #4
    //   578: aload_0
    //   579: getfield i : Lcom/allinone/callerid/b/l$d;
    //   582: getfield b : Landroid/widget/TextView;
    //   585: aload_0
    //   586: getfield k : Landroid/graphics/Typeface;
    //   589: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   592: aload_3
    //   593: astore #4
    //   595: aload_0
    //   596: getfield i : Lcom/allinone/callerid/b/l$d;
    //   599: getfield c : Landroid/widget/TextView;
    //   602: aload_0
    //   603: getfield k : Landroid/graphics/Typeface;
    //   606: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   609: aload_3
    //   610: astore #4
    //   612: aload_3
    //   613: aload_0
    //   614: getfield i : Lcom/allinone/callerid/b/l$d;
    //   617: invokevirtual setTag : (Ljava/lang/Object;)V
    //   620: goto -> 704
    //   623: iload #5
    //   625: ifeq -> 673
    //   628: iload #5
    //   630: iconst_1
    //   631: if_icmpeq -> 639
    //   634: aload_2
    //   635: astore_3
    //   636: goto -> 704
    //   639: aload_2
    //   640: astore_3
    //   641: aload_2
    //   642: astore #4
    //   644: aload_2
    //   645: invokevirtual getTag : ()Ljava/lang/Object;
    //   648: instanceof com/allinone/callerid/b/l$c
    //   651: ifeq -> 704
    //   654: aload_2
    //   655: astore #4
    //   657: aload_0
    //   658: aload_2
    //   659: invokevirtual getTag : ()Ljava/lang/Object;
    //   662: checkcast com/allinone/callerid/b/l$c
    //   665: putfield j : Lcom/allinone/callerid/b/l$c;
    //   668: aload_2
    //   669: astore_3
    //   670: goto -> 704
    //   673: aload_2
    //   674: astore_3
    //   675: aload_2
    //   676: astore #4
    //   678: aload_2
    //   679: invokevirtual getTag : ()Ljava/lang/Object;
    //   682: instanceof com/allinone/callerid/b/l$d
    //   685: ifeq -> 704
    //   688: aload_2
    //   689: astore #4
    //   691: aload_0
    //   692: aload_2
    //   693: invokevirtual getTag : ()Ljava/lang/Object;
    //   696: checkcast com/allinone/callerid/b/l$d
    //   699: putfield i : Lcom/allinone/callerid/b/l$d;
    //   702: aload_2
    //   703: astore_3
    //   704: iload #5
    //   706: ifne -> 916
    //   709: aload_3
    //   710: astore #4
    //   712: aload_0
    //   713: getfield d : Ljava/util/List;
    //   716: iload_1
    //   717: invokeinterface get : (I)Ljava/lang/Object;
    //   722: checkcast com/allinone/callerid/search/CallLogBean
    //   725: astore_2
    //   726: iload_1
    //   727: ifne -> 747
    //   730: aload_3
    //   731: astore #4
    //   733: aload_0
    //   734: getfield i : Lcom/allinone/callerid/b/l$d;
    //   737: getfield c : Landroid/widget/TextView;
    //   740: iconst_0
    //   741: invokevirtual setVisibility : (I)V
    //   744: goto -> 762
    //   747: aload_3
    //   748: astore #4
    //   750: aload_0
    //   751: getfield i : Lcom/allinone/callerid/b/l$d;
    //   754: getfield c : Landroid/widget/TextView;
    //   757: bipush #8
    //   759: invokevirtual setVisibility : (I)V
    //   762: aload_3
    //   763: astore #4
    //   765: aload_2
    //   766: invokevirtual p : ()Ljava/lang/String;
    //   769: ifnull -> 876
    //   772: aload_3
    //   773: astore #4
    //   775: ldc ''
    //   777: aload_2
    //   778: invokevirtual p : ()Ljava/lang/String;
    //   781: invokevirtual equals : (Ljava/lang/Object;)Z
    //   784: ifne -> 876
    //   787: aload_3
    //   788: astore #4
    //   790: aload_2
    //   791: invokevirtual n : ()Ljava/lang/String;
    //   794: ifnull -> 844
    //   797: aload_3
    //   798: astore #4
    //   800: ldc ''
    //   802: aload_2
    //   803: invokevirtual n : ()Ljava/lang/String;
    //   806: invokevirtual equals : (Ljava/lang/Object;)Z
    //   809: ifne -> 844
    //   812: aload_3
    //   813: astore #4
    //   815: aload_0
    //   816: getfield i : Lcom/allinone/callerid/b/l$d;
    //   819: getfield a : Landroid/widget/TextView;
    //   822: aload_0
    //   823: getfield l : Landroid/text/SpannableStringBuilder;
    //   826: aload_2
    //   827: getfield d0 : Lcom/allinone/callerid/util/t9/T9MatchInfo;
    //   830: aload_2
    //   831: invokevirtual n : ()Ljava/lang/String;
    //   834: aload_0
    //   835: getfield b : I
    //   838: invokestatic e : (Landroid/text/SpannableStringBuilder;Lcom/allinone/callerid/util/t9/T9MatchInfo;Ljava/lang/String;I)Landroid/text/SpannableStringBuilder;
    //   841: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   844: aload_3
    //   845: astore #4
    //   847: aload_0
    //   848: getfield i : Lcom/allinone/callerid/b/l$d;
    //   851: getfield b : Landroid/widget/TextView;
    //   854: aload_0
    //   855: getfield l : Landroid/text/SpannableStringBuilder;
    //   858: aload_2
    //   859: getfield e0 : Lcom/allinone/callerid/util/t9/T9MatchInfo;
    //   862: aload_2
    //   863: invokevirtual p : ()Ljava/lang/String;
    //   866: aload_0
    //   867: getfield b : I
    //   870: invokestatic e : (Landroid/text/SpannableStringBuilder;Lcom/allinone/callerid/util/t9/T9MatchInfo;Ljava/lang/String;I)Landroid/text/SpannableStringBuilder;
    //   873: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   876: aload_3
    //   877: astore #4
    //   879: aload_0
    //   880: getfield i : Lcom/allinone/callerid/b/l$d;
    //   883: getfield d : Landroid/widget/FrameLayout;
    //   886: astore #6
    //   888: aload_3
    //   889: astore #4
    //   891: new com/allinone/callerid/b/l$a
    //   894: astore_2
    //   895: aload_3
    //   896: astore #4
    //   898: aload_2
    //   899: aload_0
    //   900: iload_1
    //   901: invokespecial <init> : (Lcom/allinone/callerid/b/l;I)V
    //   904: aload_3
    //   905: astore #4
    //   907: aload #6
    //   909: aload_2
    //   910: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   913: goto -> 2058
    //   916: aload_3
    //   917: astore #4
    //   919: aload_0
    //   920: getfield d : Ljava/util/List;
    //   923: iload_1
    //   924: invokeinterface get : (I)Ljava/lang/Object;
    //   929: checkcast com/allinone/callerid/search/CallLogBean
    //   932: astore_2
    //   933: aload_3
    //   934: astore #4
    //   936: aload_0
    //   937: getfield h : I
    //   940: istore #5
    //   942: iload #5
    //   944: ifeq -> 988
    //   947: iload_1
    //   948: iload #5
    //   950: if_icmpne -> 970
    //   953: aload_3
    //   954: astore #4
    //   956: aload_0
    //   957: getfield j : Lcom/allinone/callerid/b/l$c;
    //   960: getfield d : Landroid/widget/TextView;
    //   963: iconst_0
    //   964: invokevirtual setVisibility : (I)V
    //   967: goto -> 1024
    //   970: aload_3
    //   971: astore #4
    //   973: aload_0
    //   974: getfield j : Lcom/allinone/callerid/b/l$c;
    //   977: getfield d : Landroid/widget/TextView;
    //   980: bipush #8
    //   982: invokevirtual setVisibility : (I)V
    //   985: goto -> 1024
    //   988: iload_1
    //   989: ifne -> 1009
    //   992: aload_3
    //   993: astore #4
    //   995: aload_0
    //   996: getfield j : Lcom/allinone/callerid/b/l$c;
    //   999: getfield d : Landroid/widget/TextView;
    //   1002: iconst_0
    //   1003: invokevirtual setVisibility : (I)V
    //   1006: goto -> 1024
    //   1009: aload_3
    //   1010: astore #4
    //   1012: aload_0
    //   1013: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1016: getfield d : Landroid/widget/TextView;
    //   1019: bipush #8
    //   1021: invokevirtual setVisibility : (I)V
    //   1024: aload_3
    //   1025: astore #4
    //   1027: aload_2
    //   1028: invokevirtual M : ()I
    //   1031: istore #5
    //   1033: iload #5
    //   1035: iconst_1
    //   1036: if_icmpeq -> 1319
    //   1039: iload #5
    //   1041: iconst_2
    //   1042: if_icmpeq -> 1268
    //   1045: iload #5
    //   1047: iconst_3
    //   1048: if_icmpeq -> 1217
    //   1051: iload #5
    //   1053: iconst_5
    //   1054: if_icmpeq -> 1166
    //   1057: iload #5
    //   1059: bipush #9
    //   1061: if_icmpeq -> 1115
    //   1064: aload_3
    //   1065: astore #4
    //   1067: aload_0
    //   1068: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1071: getfield a : Landroid/widget/ImageView;
    //   1074: ldc_w 2131231080
    //   1077: invokevirtual setBackgroundResource : (I)V
    //   1080: aload_3
    //   1081: astore #4
    //   1083: aload_0
    //   1084: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1087: getfield f : Landroid/widget/ImageView;
    //   1090: ldc_w 2131231080
    //   1093: invokevirtual setBackgroundResource : (I)V
    //   1096: aload_3
    //   1097: astore #4
    //   1099: aload_0
    //   1100: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1103: getfield g : Landroid/widget/ImageView;
    //   1106: ldc_w 2131231080
    //   1109: invokevirtual setBackgroundResource : (I)V
    //   1112: goto -> 1367
    //   1115: aload_3
    //   1116: astore #4
    //   1118: aload_0
    //   1119: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1122: getfield a : Landroid/widget/ImageView;
    //   1125: ldc_w 2131231080
    //   1128: invokevirtual setBackgroundResource : (I)V
    //   1131: aload_3
    //   1132: astore #4
    //   1134: aload_0
    //   1135: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1138: getfield f : Landroid/widget/ImageView;
    //   1141: ldc_w 2131231080
    //   1144: invokevirtual setBackgroundResource : (I)V
    //   1147: aload_3
    //   1148: astore #4
    //   1150: aload_0
    //   1151: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1154: getfield g : Landroid/widget/ImageView;
    //   1157: ldc_w 2131231080
    //   1160: invokevirtual setBackgroundResource : (I)V
    //   1163: goto -> 1367
    //   1166: aload_3
    //   1167: astore #4
    //   1169: aload_0
    //   1170: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1173: getfield a : Landroid/widget/ImageView;
    //   1176: ldc_w 2131231080
    //   1179: invokevirtual setBackgroundResource : (I)V
    //   1182: aload_3
    //   1183: astore #4
    //   1185: aload_0
    //   1186: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1189: getfield f : Landroid/widget/ImageView;
    //   1192: ldc_w 2131231080
    //   1195: invokevirtual setBackgroundResource : (I)V
    //   1198: aload_3
    //   1199: astore #4
    //   1201: aload_0
    //   1202: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1205: getfield g : Landroid/widget/ImageView;
    //   1208: ldc_w 2131231080
    //   1211: invokevirtual setBackgroundResource : (I)V
    //   1214: goto -> 1367
    //   1217: aload_3
    //   1218: astore #4
    //   1220: aload_0
    //   1221: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1224: getfield a : Landroid/widget/ImageView;
    //   1227: ldc_w 2131231080
    //   1230: invokevirtual setBackgroundResource : (I)V
    //   1233: aload_3
    //   1234: astore #4
    //   1236: aload_0
    //   1237: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1240: getfield f : Landroid/widget/ImageView;
    //   1243: ldc_w 2131231080
    //   1246: invokevirtual setBackgroundResource : (I)V
    //   1249: aload_3
    //   1250: astore #4
    //   1252: aload_0
    //   1253: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1256: getfield g : Landroid/widget/ImageView;
    //   1259: ldc_w 2131231080
    //   1262: invokevirtual setBackgroundResource : (I)V
    //   1265: goto -> 1367
    //   1268: aload_3
    //   1269: astore #4
    //   1271: aload_0
    //   1272: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1275: getfield a : Landroid/widget/ImageView;
    //   1278: ldc_w 2131231081
    //   1281: invokevirtual setBackgroundResource : (I)V
    //   1284: aload_3
    //   1285: astore #4
    //   1287: aload_0
    //   1288: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1291: getfield f : Landroid/widget/ImageView;
    //   1294: ldc_w 2131231081
    //   1297: invokevirtual setBackgroundResource : (I)V
    //   1300: aload_3
    //   1301: astore #4
    //   1303: aload_0
    //   1304: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1307: getfield g : Landroid/widget/ImageView;
    //   1310: ldc_w 2131231081
    //   1313: invokevirtual setBackgroundResource : (I)V
    //   1316: goto -> 1367
    //   1319: aload_3
    //   1320: astore #4
    //   1322: aload_0
    //   1323: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1326: getfield a : Landroid/widget/ImageView;
    //   1329: ldc_w 2131231079
    //   1332: invokevirtual setBackgroundResource : (I)V
    //   1335: aload_3
    //   1336: astore #4
    //   1338: aload_0
    //   1339: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1342: getfield f : Landroid/widget/ImageView;
    //   1345: ldc_w 2131231079
    //   1348: invokevirtual setBackgroundResource : (I)V
    //   1351: aload_3
    //   1352: astore #4
    //   1354: aload_0
    //   1355: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1358: getfield g : Landroid/widget/ImageView;
    //   1361: ldc_w 2131231079
    //   1364: invokevirtual setBackgroundResource : (I)V
    //   1367: aload_3
    //   1368: astore #4
    //   1370: aload_0
    //   1371: getfield e : Ljava/util/HashMap;
    //   1374: astore #6
    //   1376: aload #6
    //   1378: ifnull -> 1754
    //   1381: aload_3
    //   1382: astore #4
    //   1384: aload #6
    //   1386: invokevirtual size : ()I
    //   1389: ifeq -> 1754
    //   1392: aload_3
    //   1393: astore #4
    //   1395: aload_0
    //   1396: getfield e : Ljava/util/HashMap;
    //   1399: aload_2
    //   1400: invokevirtual K : ()Ljava/lang/String;
    //   1403: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1406: checkcast java/lang/Integer
    //   1409: astore #6
    //   1411: aload #6
    //   1413: ifnull -> 1754
    //   1416: aload_3
    //   1417: astore #4
    //   1419: aload #6
    //   1421: invokevirtual intValue : ()I
    //   1424: istore #5
    //   1426: iload #5
    //   1428: iconst_1
    //   1429: if_icmpne -> 1495
    //   1432: aload_3
    //   1433: astore #4
    //   1435: aload_0
    //   1436: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1439: getfield f : Landroid/widget/ImageView;
    //   1442: bipush #8
    //   1444: invokevirtual setVisibility : (I)V
    //   1447: aload_3
    //   1448: astore #4
    //   1450: aload_0
    //   1451: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1454: getfield g : Landroid/widget/ImageView;
    //   1457: bipush #8
    //   1459: invokevirtual setVisibility : (I)V
    //   1462: aload_3
    //   1463: astore #4
    //   1465: aload_0
    //   1466: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1469: getfield c : Landroid/widget/TextView;
    //   1472: ldc ''
    //   1474: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1477: aload_3
    //   1478: astore #4
    //   1480: aload_0
    //   1481: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1484: getfield c : Landroid/widget/TextView;
    //   1487: bipush #8
    //   1489: invokevirtual setVisibility : (I)V
    //   1492: goto -> 1754
    //   1495: iload #5
    //   1497: iconst_2
    //   1498: if_icmpne -> 1563
    //   1501: aload_3
    //   1502: astore #4
    //   1504: aload_0
    //   1505: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1508: getfield f : Landroid/widget/ImageView;
    //   1511: iconst_0
    //   1512: invokevirtual setVisibility : (I)V
    //   1515: aload_3
    //   1516: astore #4
    //   1518: aload_0
    //   1519: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1522: getfield g : Landroid/widget/ImageView;
    //   1525: bipush #8
    //   1527: invokevirtual setVisibility : (I)V
    //   1530: aload_3
    //   1531: astore #4
    //   1533: aload_0
    //   1534: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1537: getfield c : Landroid/widget/TextView;
    //   1540: ldc ''
    //   1542: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1545: aload_3
    //   1546: astore #4
    //   1548: aload_0
    //   1549: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1552: getfield c : Landroid/widget/TextView;
    //   1555: bipush #8
    //   1557: invokevirtual setVisibility : (I)V
    //   1560: goto -> 1754
    //   1563: iload #5
    //   1565: iconst_3
    //   1566: if_icmpne -> 1630
    //   1569: aload_3
    //   1570: astore #4
    //   1572: aload_0
    //   1573: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1576: getfield f : Landroid/widget/ImageView;
    //   1579: iconst_0
    //   1580: invokevirtual setVisibility : (I)V
    //   1583: aload_3
    //   1584: astore #4
    //   1586: aload_0
    //   1587: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1590: getfield g : Landroid/widget/ImageView;
    //   1593: iconst_0
    //   1594: invokevirtual setVisibility : (I)V
    //   1597: aload_3
    //   1598: astore #4
    //   1600: aload_0
    //   1601: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1604: getfield c : Landroid/widget/TextView;
    //   1607: ldc ''
    //   1609: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1612: aload_3
    //   1613: astore #4
    //   1615: aload_0
    //   1616: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1619: getfield c : Landroid/widget/TextView;
    //   1622: bipush #8
    //   1624: invokevirtual setVisibility : (I)V
    //   1627: goto -> 1754
    //   1630: iload #5
    //   1632: iconst_3
    //   1633: if_icmple -> 1754
    //   1636: aload_3
    //   1637: astore #4
    //   1639: aload_0
    //   1640: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1643: getfield f : Landroid/widget/ImageView;
    //   1646: iconst_0
    //   1647: invokevirtual setVisibility : (I)V
    //   1650: aload_3
    //   1651: astore #4
    //   1653: aload_0
    //   1654: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1657: getfield g : Landroid/widget/ImageView;
    //   1660: iconst_0
    //   1661: invokevirtual setVisibility : (I)V
    //   1664: aload_3
    //   1665: astore #4
    //   1667: aload_0
    //   1668: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1671: getfield c : Landroid/widget/TextView;
    //   1674: astore #7
    //   1676: aload_3
    //   1677: astore #4
    //   1679: new java/lang/StringBuilder
    //   1682: astore #6
    //   1684: aload_3
    //   1685: astore #4
    //   1687: aload #6
    //   1689: invokespecial <init> : ()V
    //   1692: aload_3
    //   1693: astore #4
    //   1695: aload #6
    //   1697: ldc_w '('
    //   1700: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1703: pop
    //   1704: aload_3
    //   1705: astore #4
    //   1707: aload #6
    //   1709: iload #5
    //   1711: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1714: pop
    //   1715: aload_3
    //   1716: astore #4
    //   1718: aload #6
    //   1720: ldc_w ') '
    //   1723: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1726: pop
    //   1727: aload_3
    //   1728: astore #4
    //   1730: aload #7
    //   1732: aload #6
    //   1734: invokevirtual toString : ()Ljava/lang/String;
    //   1737: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1740: aload_3
    //   1741: astore #4
    //   1743: aload_0
    //   1744: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1747: getfield c : Landroid/widget/TextView;
    //   1750: iconst_0
    //   1751: invokevirtual setVisibility : (I)V
    //   1754: aload_3
    //   1755: astore #4
    //   1757: aload_2
    //   1758: invokevirtual B : ()Ljava/lang/String;
    //   1761: ifnull -> 1837
    //   1764: aload_3
    //   1765: astore #4
    //   1767: ldc_w 'Mobile'
    //   1770: aload_2
    //   1771: invokevirtual B : ()Ljava/lang/String;
    //   1774: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1777: ifne -> 1796
    //   1780: aload_3
    //   1781: astore #4
    //   1783: ldc_w 'Fixed line'
    //   1786: aload_2
    //   1787: invokevirtual B : ()Ljava/lang/String;
    //   1790: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1793: ifeq -> 1837
    //   1796: aload_3
    //   1797: astore #4
    //   1799: aload_0
    //   1800: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1803: getfield e : Landroid/widget/TextView;
    //   1806: aload_0
    //   1807: getfield c : Landroid/content/Context;
    //   1810: aload_2
    //   1811: invokevirtual B : ()Ljava/lang/String;
    //   1814: invokestatic J : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   1817: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1820: aload_3
    //   1821: astore #4
    //   1823: aload_0
    //   1824: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1827: getfield e : Landroid/widget/TextView;
    //   1830: iconst_0
    //   1831: invokevirtual setVisibility : (I)V
    //   1834: goto -> 1867
    //   1837: aload_3
    //   1838: astore #4
    //   1840: aload_0
    //   1841: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1844: getfield e : Landroid/widget/TextView;
    //   1847: ldc ''
    //   1849: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1852: aload_3
    //   1853: astore #4
    //   1855: aload_0
    //   1856: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1859: getfield e : Landroid/widget/TextView;
    //   1862: bipush #8
    //   1864: invokevirtual setVisibility : (I)V
    //   1867: aload_3
    //   1868: astore #4
    //   1870: aload_0
    //   1871: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1874: getfield b : Landroid/widget/TextView;
    //   1877: aload_2
    //   1878: invokevirtual D : ()Ljava/lang/String;
    //   1881: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1884: aload_3
    //   1885: astore #4
    //   1887: ldc ''
    //   1889: aload_2
    //   1890: invokevirtual p : ()Ljava/lang/String;
    //   1893: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1896: ifne -> 1984
    //   1899: aload_3
    //   1900: astore #4
    //   1902: ldc_w '-1'
    //   1905: aload_2
    //   1906: invokevirtual p : ()Ljava/lang/String;
    //   1909: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1912: ifne -> 1984
    //   1915: aload_3
    //   1916: astore #4
    //   1918: ldc_w '-2'
    //   1921: aload_2
    //   1922: invokevirtual p : ()Ljava/lang/String;
    //   1925: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1928: ifne -> 1984
    //   1931: aload_3
    //   1932: astore #4
    //   1934: ldc_w '-3'
    //   1937: aload_2
    //   1938: invokevirtual p : ()Ljava/lang/String;
    //   1941: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1944: ifeq -> 1950
    //   1947: goto -> 1984
    //   1950: aload_3
    //   1951: astore #4
    //   1953: aload_0
    //   1954: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1957: getfield j : Landroid/widget/TextView;
    //   1960: aload_0
    //   1961: getfield l : Landroid/text/SpannableStringBuilder;
    //   1964: aload_2
    //   1965: getfield e0 : Lcom/allinone/callerid/util/t9/T9MatchInfo;
    //   1968: aload_2
    //   1969: invokevirtual p : ()Ljava/lang/String;
    //   1972: ldc_w -16743169
    //   1975: invokestatic e : (Landroid/text/SpannableStringBuilder;Lcom/allinone/callerid/util/t9/T9MatchInfo;Ljava/lang/String;I)Landroid/text/SpannableStringBuilder;
    //   1978: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1981: goto -> 2010
    //   1984: aload_3
    //   1985: astore #4
    //   1987: aload_0
    //   1988: getfield j : Lcom/allinone/callerid/b/l$c;
    //   1991: getfield j : Landroid/widget/TextView;
    //   1994: aload_0
    //   1995: getfield c : Landroid/content/Context;
    //   1998: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2001: ldc_w 2131755829
    //   2004: invokevirtual getString : (I)Ljava/lang/String;
    //   2007: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2010: aload_3
    //   2011: astore #4
    //   2013: aload_0
    //   2014: getfield j : Lcom/allinone/callerid/b/l$c;
    //   2017: getfield h : Landroid/widget/FrameLayout;
    //   2020: astore #6
    //   2022: aload_3
    //   2023: astore #4
    //   2025: new com/allinone/callerid/b/l$b
    //   2028: astore_2
    //   2029: aload_3
    //   2030: astore #4
    //   2032: aload_2
    //   2033: aload_0
    //   2034: iload_1
    //   2035: invokespecial <init> : (Lcom/allinone/callerid/b/l;I)V
    //   2038: aload_3
    //   2039: astore #4
    //   2041: aload #6
    //   2043: aload_2
    //   2044: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2047: goto -> 2058
    //   2050: astore_2
    //   2051: aload_2
    //   2052: invokevirtual printStackTrace : ()V
    //   2055: aload #4
    //   2057: astore_3
    //   2058: aload_3
    //   2059: areturn
    // Exception table:
    //   from	to	target	type
    //   3	10	2050	java/lang/Exception
    //   33	44	2050	java/lang/Exception
    //   47	51	2050	java/lang/Exception
    //   54	59	2050	java/lang/Exception
    //   62	67	2050	java/lang/Exception
    //   70	83	2050	java/lang/Exception
    //   86	102	2050	java/lang/Exception
    //   105	121	2050	java/lang/Exception
    //   124	136	2050	java/lang/Exception
    //   139	151	2050	java/lang/Exception
    //   154	170	2050	java/lang/Exception
    //   173	189	2050	java/lang/Exception
    //   192	208	2050	java/lang/Exception
    //   211	227	2050	java/lang/Exception
    //   230	246	2050	java/lang/Exception
    //   249	261	2050	java/lang/Exception
    //   264	276	2050	java/lang/Exception
    //   279	291	2050	java/lang/Exception
    //   294	310	2050	java/lang/Exception
    //   313	329	2050	java/lang/Exception
    //   332	346	2050	java/lang/Exception
    //   349	363	2050	java/lang/Exception
    //   366	380	2050	java/lang/Exception
    //   383	397	2050	java/lang/Exception
    //   400	414	2050	java/lang/Exception
    //   417	425	2050	java/lang/Exception
    //   431	443	2050	java/lang/Exception
    //   446	450	2050	java/lang/Exception
    //   453	458	2050	java/lang/Exception
    //   461	466	2050	java/lang/Exception
    //   469	482	2050	java/lang/Exception
    //   485	501	2050	java/lang/Exception
    //   504	520	2050	java/lang/Exception
    //   523	539	2050	java/lang/Exception
    //   542	558	2050	java/lang/Exception
    //   561	575	2050	java/lang/Exception
    //   578	592	2050	java/lang/Exception
    //   595	609	2050	java/lang/Exception
    //   612	620	2050	java/lang/Exception
    //   644	654	2050	java/lang/Exception
    //   657	668	2050	java/lang/Exception
    //   678	688	2050	java/lang/Exception
    //   691	702	2050	java/lang/Exception
    //   712	726	2050	java/lang/Exception
    //   733	744	2050	java/lang/Exception
    //   750	762	2050	java/lang/Exception
    //   765	772	2050	java/lang/Exception
    //   775	787	2050	java/lang/Exception
    //   790	797	2050	java/lang/Exception
    //   800	812	2050	java/lang/Exception
    //   815	844	2050	java/lang/Exception
    //   847	876	2050	java/lang/Exception
    //   879	888	2050	java/lang/Exception
    //   891	895	2050	java/lang/Exception
    //   898	904	2050	java/lang/Exception
    //   907	913	2050	java/lang/Exception
    //   919	933	2050	java/lang/Exception
    //   936	942	2050	java/lang/Exception
    //   956	967	2050	java/lang/Exception
    //   973	985	2050	java/lang/Exception
    //   995	1006	2050	java/lang/Exception
    //   1012	1024	2050	java/lang/Exception
    //   1027	1033	2050	java/lang/Exception
    //   1067	1080	2050	java/lang/Exception
    //   1083	1096	2050	java/lang/Exception
    //   1099	1112	2050	java/lang/Exception
    //   1118	1131	2050	java/lang/Exception
    //   1134	1147	2050	java/lang/Exception
    //   1150	1163	2050	java/lang/Exception
    //   1169	1182	2050	java/lang/Exception
    //   1185	1198	2050	java/lang/Exception
    //   1201	1214	2050	java/lang/Exception
    //   1220	1233	2050	java/lang/Exception
    //   1236	1249	2050	java/lang/Exception
    //   1252	1265	2050	java/lang/Exception
    //   1271	1284	2050	java/lang/Exception
    //   1287	1300	2050	java/lang/Exception
    //   1303	1316	2050	java/lang/Exception
    //   1322	1335	2050	java/lang/Exception
    //   1338	1351	2050	java/lang/Exception
    //   1354	1367	2050	java/lang/Exception
    //   1370	1376	2050	java/lang/Exception
    //   1384	1392	2050	java/lang/Exception
    //   1395	1411	2050	java/lang/Exception
    //   1419	1426	2050	java/lang/Exception
    //   1435	1447	2050	java/lang/Exception
    //   1450	1462	2050	java/lang/Exception
    //   1465	1477	2050	java/lang/Exception
    //   1480	1492	2050	java/lang/Exception
    //   1504	1515	2050	java/lang/Exception
    //   1518	1530	2050	java/lang/Exception
    //   1533	1545	2050	java/lang/Exception
    //   1548	1560	2050	java/lang/Exception
    //   1572	1583	2050	java/lang/Exception
    //   1586	1597	2050	java/lang/Exception
    //   1600	1612	2050	java/lang/Exception
    //   1615	1627	2050	java/lang/Exception
    //   1639	1650	2050	java/lang/Exception
    //   1653	1664	2050	java/lang/Exception
    //   1667	1676	2050	java/lang/Exception
    //   1679	1684	2050	java/lang/Exception
    //   1687	1692	2050	java/lang/Exception
    //   1695	1704	2050	java/lang/Exception
    //   1707	1715	2050	java/lang/Exception
    //   1718	1727	2050	java/lang/Exception
    //   1730	1740	2050	java/lang/Exception
    //   1743	1754	2050	java/lang/Exception
    //   1757	1764	2050	java/lang/Exception
    //   1767	1780	2050	java/lang/Exception
    //   1783	1796	2050	java/lang/Exception
    //   1799	1820	2050	java/lang/Exception
    //   1823	1834	2050	java/lang/Exception
    //   1840	1852	2050	java/lang/Exception
    //   1855	1867	2050	java/lang/Exception
    //   1870	1884	2050	java/lang/Exception
    //   1887	1899	2050	java/lang/Exception
    //   1902	1915	2050	java/lang/Exception
    //   1918	1931	2050	java/lang/Exception
    //   1934	1947	2050	java/lang/Exception
    //   1953	1981	2050	java/lang/Exception
    //   1987	2010	2050	java/lang/Exception
    //   2013	2022	2050	java/lang/Exception
    //   2025	2029	2050	java/lang/Exception
    //   2032	2038	2050	java/lang/Exception
    //   2041	2047	2050	java/lang/Exception
  }
  
  public int getViewTypeCount() {
    return 2;
  }
  
  class a implements View.OnClickListener {
    a(l this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = l.a(this.c).getOnItemClickListener();
      ListView listView = l.a(this.c);
      int i = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
    }
  }
  
  class b implements View.OnClickListener {
    b(l this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = l.a(this.c).getOnItemClickListener();
      ListView listView = l.a(this.c);
      int i = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
    }
  }
  
  private static class c {
    ImageView a;
    
    TextView b;
    
    TextView c;
    
    TextView d;
    
    TextView e;
    
    ImageView f;
    
    ImageView g;
    
    FrameLayout h;
    
    LinearLayout i;
    
    TextView j;
    
    private c() {}
  }
  
  private static class d {
    TextView a;
    
    TextView b;
    
    TextView c;
    
    FrameLayout d;
    
    LinearLayout e;
    
    private d() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */