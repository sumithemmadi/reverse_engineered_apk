package com.allinone.callerid.b;

import android.content.Context;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class o extends BaseAdapter {
  private Context b;
  
  private List<CallLogBean> c;
  
  private HashMap<String, Integer> d = new HashMap<String, Integer>();
  
  private LayoutInflater e;
  
  private ListView f;
  
  private int g = 0;
  
  private String h;
  
  d i;
  
  c j;
  
  private int k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  public o(Context paramContext, List<CallLogBean> paramList, HashMap<String, Integer> paramHashMap, ListView paramListView) {
    this.b = paramContext;
    this.c = paramList;
    this.e = LayoutInflater.from(paramContext);
    this.f = paramListView;
    this.d = paramHashMap;
    this.k = d1.b(paramContext, 2130968686, 2131230858);
    this.l = d1.b(paramContext, 2130968685, 2131230857);
    this.m = d1.b(paramContext, 2130968687, 2131230859);
    this.n = d1.b(paramContext, 2130968688, 2131230860);
  }
  
  public void b(List<CallLogBean> paramList, int paramInt, String paramString) {
    if (paramList == null) {
      this.c = new ArrayList<CallLogBean>();
    } else {
      this.c = paramList;
    } 
    this.g = paramInt;
    this.h = paramString;
    notifyDataSetChanged();
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
  
  public int getItemViewType(int paramInt) {
    try {
      boolean bool = ((CallLogBean)this.c.get(paramInt)).T();
      if (bool)
        return 1; 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return 0;
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
    //   11: ifnonnull -> 614
    //   14: iload #5
    //   16: ifeq -> 220
    //   19: iload #5
    //   21: iconst_1
    //   22: if_icmpeq -> 28
    //   25: goto -> 659
    //   28: aload_2
    //   29: astore #4
    //   31: aload_0
    //   32: getfield e : Landroid/view/LayoutInflater;
    //   35: ldc 2131493158
    //   37: aload_3
    //   38: iconst_0
    //   39: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   42: astore_2
    //   43: aload_2
    //   44: astore #4
    //   46: new com/allinone/callerid/b/o$d
    //   49: astore_3
    //   50: aload_2
    //   51: astore #4
    //   53: aload_3
    //   54: aconst_null
    //   55: invokespecial <init> : (Lcom/allinone/callerid/b/o$a;)V
    //   58: aload_2
    //   59: astore #4
    //   61: aload_0
    //   62: aload_3
    //   63: putfield i : Lcom/allinone/callerid/b/o$d;
    //   66: aload_2
    //   67: astore #4
    //   69: aload_3
    //   70: aload_2
    //   71: ldc 2131297304
    //   73: invokevirtual findViewById : (I)Landroid/view/View;
    //   76: checkcast android/widget/TextView
    //   79: putfield a : Landroid/widget/TextView;
    //   82: aload_2
    //   83: astore #4
    //   85: aload_0
    //   86: getfield i : Lcom/allinone/callerid/b/o$d;
    //   89: aload_2
    //   90: ldc 2131298022
    //   92: invokevirtual findViewById : (I)Landroid/view/View;
    //   95: checkcast android/widget/TextView
    //   98: putfield b : Landroid/widget/TextView;
    //   101: aload_2
    //   102: astore #4
    //   104: aload_0
    //   105: getfield i : Lcom/allinone/callerid/b/o$d;
    //   108: aload_2
    //   109: ldc 2131298187
    //   111: invokevirtual findViewById : (I)Landroid/view/View;
    //   114: checkcast android/widget/TextView
    //   117: putfield c : Landroid/widget/TextView;
    //   120: aload_2
    //   121: astore #4
    //   123: aload_0
    //   124: getfield i : Lcom/allinone/callerid/b/o$d;
    //   127: aload_2
    //   128: ldc 2131297469
    //   130: invokevirtual findViewById : (I)Landroid/view/View;
    //   133: checkcast android/widget/FrameLayout
    //   136: putfield d : Landroid/widget/FrameLayout;
    //   139: aload_2
    //   140: astore #4
    //   142: aload_0
    //   143: getfield i : Lcom/allinone/callerid/b/o$d;
    //   146: aload_2
    //   147: ldc 2131297468
    //   149: invokevirtual findViewById : (I)Landroid/view/View;
    //   152: checkcast android/widget/LinearLayout
    //   155: putfield e : Landroid/widget/LinearLayout;
    //   158: aload_2
    //   159: astore #4
    //   161: aload_0
    //   162: getfield i : Lcom/allinone/callerid/b/o$d;
    //   165: getfield a : Landroid/widget/TextView;
    //   168: invokestatic b : ()Landroid/graphics/Typeface;
    //   171: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   174: aload_2
    //   175: astore #4
    //   177: aload_0
    //   178: getfield i : Lcom/allinone/callerid/b/o$d;
    //   181: getfield b : Landroid/widget/TextView;
    //   184: invokestatic b : ()Landroid/graphics/Typeface;
    //   187: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   190: aload_2
    //   191: astore #4
    //   193: aload_0
    //   194: getfield i : Lcom/allinone/callerid/b/o$d;
    //   197: getfield c : Landroid/widget/TextView;
    //   200: invokestatic b : ()Landroid/graphics/Typeface;
    //   203: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   206: aload_2
    //   207: astore #4
    //   209: aload_2
    //   210: aload_0
    //   211: getfield i : Lcom/allinone/callerid/b/o$d;
    //   214: invokevirtual setTag : (Ljava/lang/Object;)V
    //   217: goto -> 659
    //   220: aload_2
    //   221: astore #4
    //   223: aload_0
    //   224: getfield e : Landroid/view/LayoutInflater;
    //   227: ldc 2131493157
    //   229: aload_3
    //   230: iconst_0
    //   231: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   234: astore_2
    //   235: aload_2
    //   236: astore #4
    //   238: new com/allinone/callerid/b/o$c
    //   241: astore_3
    //   242: aload_2
    //   243: astore #4
    //   245: aload_3
    //   246: aconst_null
    //   247: invokespecial <init> : (Lcom/allinone/callerid/b/o$a;)V
    //   250: aload_2
    //   251: astore #4
    //   253: aload_0
    //   254: aload_3
    //   255: putfield j : Lcom/allinone/callerid/b/o$c;
    //   258: aload_2
    //   259: astore #4
    //   261: aload_3
    //   262: aload_2
    //   263: ldc 2131296451
    //   265: invokevirtual findViewById : (I)Landroid/view/View;
    //   268: checkcast android/widget/ImageView
    //   271: putfield a : Landroid/widget/ImageView;
    //   274: aload_2
    //   275: astore #4
    //   277: aload_0
    //   278: getfield j : Lcom/allinone/callerid/b/o$c;
    //   281: aload_2
    //   282: ldc 2131296452
    //   284: invokevirtual findViewById : (I)Landroid/view/View;
    //   287: checkcast android/widget/ImageView
    //   290: putfield f : Landroid/widget/ImageView;
    //   293: aload_2
    //   294: astore #4
    //   296: aload_0
    //   297: getfield j : Lcom/allinone/callerid/b/o$c;
    //   300: aload_2
    //   301: ldc 2131296453
    //   303: invokevirtual findViewById : (I)Landroid/view/View;
    //   306: checkcast android/widget/ImageView
    //   309: putfield g : Landroid/widget/ImageView;
    //   312: aload_2
    //   313: astore #4
    //   315: aload_0
    //   316: getfield j : Lcom/allinone/callerid/b/o$c;
    //   319: getfield f : Landroid/widget/ImageView;
    //   322: bipush #8
    //   324: invokevirtual setVisibility : (I)V
    //   327: aload_2
    //   328: astore #4
    //   330: aload_0
    //   331: getfield j : Lcom/allinone/callerid/b/o$c;
    //   334: getfield g : Landroid/widget/ImageView;
    //   337: bipush #8
    //   339: invokevirtual setVisibility : (I)V
    //   342: aload_2
    //   343: astore #4
    //   345: aload_0
    //   346: getfield j : Lcom/allinone/callerid/b/o$c;
    //   349: aload_2
    //   350: ldc 2131297304
    //   352: invokevirtual findViewById : (I)Landroid/view/View;
    //   355: checkcast android/widget/TextView
    //   358: putfield j : Landroid/widget/TextView;
    //   361: aload_2
    //   362: astore #4
    //   364: aload_0
    //   365: getfield j : Lcom/allinone/callerid/b/o$c;
    //   368: aload_2
    //   369: ldc 2131298187
    //   371: invokevirtual findViewById : (I)Landroid/view/View;
    //   374: checkcast android/widget/TextView
    //   377: putfield d : Landroid/widget/TextView;
    //   380: aload_2
    //   381: astore #4
    //   383: aload_0
    //   384: getfield j : Lcom/allinone/callerid/b/o$c;
    //   387: aload_2
    //   388: ldc 2131297753
    //   390: invokevirtual findViewById : (I)Landroid/view/View;
    //   393: checkcast android/widget/TextView
    //   396: putfield b : Landroid/widget/TextView;
    //   399: aload_2
    //   400: astore #4
    //   402: aload_0
    //   403: getfield j : Lcom/allinone/callerid/b/o$c;
    //   406: aload_2
    //   407: ldc 2131297875
    //   409: invokevirtual findViewById : (I)Landroid/view/View;
    //   412: checkcast android/widget/TextView
    //   415: putfield c : Landroid/widget/TextView;
    //   418: aload_2
    //   419: astore #4
    //   421: aload_0
    //   422: getfield j : Lcom/allinone/callerid/b/o$c;
    //   425: aload_2
    //   426: ldc 2131298026
    //   428: invokevirtual findViewById : (I)Landroid/view/View;
    //   431: checkcast android/widget/TextView
    //   434: putfield e : Landroid/widget/TextView;
    //   437: aload_2
    //   438: astore #4
    //   440: aload_0
    //   441: getfield j : Lcom/allinone/callerid/b/o$c;
    //   444: getfield e : Landroid/widget/TextView;
    //   447: bipush #8
    //   449: invokevirtual setVisibility : (I)V
    //   452: aload_2
    //   453: astore #4
    //   455: aload_0
    //   456: getfield j : Lcom/allinone/callerid/b/o$c;
    //   459: getfield c : Landroid/widget/TextView;
    //   462: ldc ''
    //   464: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   467: aload_2
    //   468: astore #4
    //   470: aload_0
    //   471: getfield j : Lcom/allinone/callerid/b/o$c;
    //   474: getfield c : Landroid/widget/TextView;
    //   477: bipush #8
    //   479: invokevirtual setVisibility : (I)V
    //   482: aload_2
    //   483: astore #4
    //   485: aload_0
    //   486: getfield j : Lcom/allinone/callerid/b/o$c;
    //   489: aload_2
    //   490: ldc 2131297469
    //   492: invokevirtual findViewById : (I)Landroid/view/View;
    //   495: checkcast android/widget/FrameLayout
    //   498: putfield h : Landroid/widget/FrameLayout;
    //   501: aload_2
    //   502: astore #4
    //   504: aload_0
    //   505: getfield j : Lcom/allinone/callerid/b/o$c;
    //   508: aload_2
    //   509: ldc 2131297468
    //   511: invokevirtual findViewById : (I)Landroid/view/View;
    //   514: checkcast android/widget/LinearLayout
    //   517: putfield i : Landroid/widget/LinearLayout;
    //   520: aload_2
    //   521: astore #4
    //   523: aload_0
    //   524: getfield j : Lcom/allinone/callerid/b/o$c;
    //   527: getfield j : Landroid/widget/TextView;
    //   530: invokestatic b : ()Landroid/graphics/Typeface;
    //   533: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   536: aload_2
    //   537: astore #4
    //   539: aload_0
    //   540: getfield j : Lcom/allinone/callerid/b/o$c;
    //   543: getfield d : Landroid/widget/TextView;
    //   546: invokestatic b : ()Landroid/graphics/Typeface;
    //   549: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   552: aload_2
    //   553: astore #4
    //   555: aload_0
    //   556: getfield j : Lcom/allinone/callerid/b/o$c;
    //   559: getfield c : Landroid/widget/TextView;
    //   562: invokestatic b : ()Landroid/graphics/Typeface;
    //   565: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   568: aload_2
    //   569: astore #4
    //   571: aload_0
    //   572: getfield j : Lcom/allinone/callerid/b/o$c;
    //   575: getfield b : Landroid/widget/TextView;
    //   578: invokestatic b : ()Landroid/graphics/Typeface;
    //   581: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   584: aload_2
    //   585: astore #4
    //   587: aload_0
    //   588: getfield j : Lcom/allinone/callerid/b/o$c;
    //   591: getfield e : Landroid/widget/TextView;
    //   594: invokestatic b : ()Landroid/graphics/Typeface;
    //   597: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   600: aload_2
    //   601: astore #4
    //   603: aload_2
    //   604: aload_0
    //   605: getfield j : Lcom/allinone/callerid/b/o$c;
    //   608: invokevirtual setTag : (Ljava/lang/Object;)V
    //   611: goto -> 659
    //   614: iload #5
    //   616: ifeq -> 645
    //   619: iload #5
    //   621: iconst_1
    //   622: if_icmpeq -> 628
    //   625: goto -> 659
    //   628: aload_2
    //   629: astore #4
    //   631: aload_0
    //   632: aload_2
    //   633: invokevirtual getTag : ()Ljava/lang/Object;
    //   636: checkcast com/allinone/callerid/b/o$d
    //   639: putfield i : Lcom/allinone/callerid/b/o$d;
    //   642: goto -> 659
    //   645: aload_2
    //   646: astore #4
    //   648: aload_0
    //   649: aload_2
    //   650: invokevirtual getTag : ()Ljava/lang/Object;
    //   653: checkcast com/allinone/callerid/b/o$c
    //   656: putfield j : Lcom/allinone/callerid/b/o$c;
    //   659: iload #5
    //   661: iconst_1
    //   662: if_icmpne -> 1035
    //   665: aload_2
    //   666: astore #4
    //   668: aload_0
    //   669: getfield c : Ljava/util/List;
    //   672: iload_1
    //   673: invokeinterface get : (I)Ljava/lang/Object;
    //   678: checkcast com/allinone/callerid/search/CallLogBean
    //   681: astore_3
    //   682: iload_1
    //   683: ifne -> 761
    //   686: aload_2
    //   687: astore #4
    //   689: aload_0
    //   690: getfield i : Lcom/allinone/callerid/b/o$d;
    //   693: getfield c : Landroid/widget/TextView;
    //   696: iconst_0
    //   697: invokevirtual setVisibility : (I)V
    //   700: aload_2
    //   701: astore #4
    //   703: aload_0
    //   704: getfield c : Ljava/util/List;
    //   707: ifnull -> 741
    //   710: aload_2
    //   711: astore #4
    //   713: aload_0
    //   714: getfield g : I
    //   717: iconst_1
    //   718: if_icmpne -> 741
    //   721: aload_2
    //   722: astore #4
    //   724: aload_0
    //   725: getfield i : Lcom/allinone/callerid/b/o$d;
    //   728: getfield e : Landroid/widget/LinearLayout;
    //   731: aload_0
    //   732: getfield l : I
    //   735: invokevirtual setBackgroundResource : (I)V
    //   738: goto -> 845
    //   741: aload_2
    //   742: astore #4
    //   744: aload_0
    //   745: getfield i : Lcom/allinone/callerid/b/o$d;
    //   748: getfield e : Landroid/widget/LinearLayout;
    //   751: aload_0
    //   752: getfield n : I
    //   755: invokevirtual setBackgroundResource : (I)V
    //   758: goto -> 845
    //   761: aload_2
    //   762: astore #4
    //   764: aload_0
    //   765: getfield i : Lcom/allinone/callerid/b/o$d;
    //   768: getfield c : Landroid/widget/TextView;
    //   771: bipush #8
    //   773: invokevirtual setVisibility : (I)V
    //   776: aload_2
    //   777: astore #4
    //   779: aload_0
    //   780: getfield c : Ljava/util/List;
    //   783: ifnull -> 828
    //   786: aload_2
    //   787: astore #4
    //   789: aload_0
    //   790: getfield g : I
    //   793: istore #5
    //   795: iload #5
    //   797: ifle -> 828
    //   800: iload_1
    //   801: iload #5
    //   803: iconst_1
    //   804: isub
    //   805: if_icmpne -> 828
    //   808: aload_2
    //   809: astore #4
    //   811: aload_0
    //   812: getfield i : Lcom/allinone/callerid/b/o$d;
    //   815: getfield e : Landroid/widget/LinearLayout;
    //   818: aload_0
    //   819: getfield k : I
    //   822: invokevirtual setBackgroundResource : (I)V
    //   825: goto -> 845
    //   828: aload_2
    //   829: astore #4
    //   831: aload_0
    //   832: getfield i : Lcom/allinone/callerid/b/o$d;
    //   835: getfield e : Landroid/widget/LinearLayout;
    //   838: aload_0
    //   839: getfield m : I
    //   842: invokevirtual setBackgroundResource : (I)V
    //   845: aload_2
    //   846: astore #4
    //   848: aload_3
    //   849: invokevirtual p : ()Ljava/lang/String;
    //   852: ifnull -> 952
    //   855: aload_2
    //   856: astore #4
    //   858: ldc ''
    //   860: aload_3
    //   861: invokevirtual p : ()Ljava/lang/String;
    //   864: invokevirtual equals : (Ljava/lang/Object;)Z
    //   867: ifne -> 952
    //   870: aload_2
    //   871: astore #4
    //   873: aload_0
    //   874: getfield h : Ljava/lang/String;
    //   877: astore #6
    //   879: aload #6
    //   881: ifnull -> 935
    //   884: aload_2
    //   885: astore #4
    //   887: ldc ''
    //   889: aload #6
    //   891: invokevirtual equals : (Ljava/lang/Object;)Z
    //   894: ifne -> 935
    //   897: aload_2
    //   898: astore #4
    //   900: aload_0
    //   901: getfield b : Landroid/content/Context;
    //   904: aload_3
    //   905: invokevirtual p : ()Ljava/lang/String;
    //   908: aload_0
    //   909: getfield h : Ljava/lang/String;
    //   912: invokestatic a : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;
    //   915: astore #6
    //   917: aload_2
    //   918: astore #4
    //   920: aload_0
    //   921: getfield i : Lcom/allinone/callerid/b/o$d;
    //   924: getfield b : Landroid/widget/TextView;
    //   927: aload #6
    //   929: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   932: goto -> 952
    //   935: aload_2
    //   936: astore #4
    //   938: aload_0
    //   939: getfield i : Lcom/allinone/callerid/b/o$d;
    //   942: getfield b : Landroid/widget/TextView;
    //   945: aload_3
    //   946: invokevirtual p : ()Ljava/lang/String;
    //   949: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   952: aload_2
    //   953: astore #4
    //   955: aload_3
    //   956: invokevirtual n : ()Ljava/lang/String;
    //   959: ifnull -> 994
    //   962: aload_2
    //   963: astore #4
    //   965: ldc ''
    //   967: aload_3
    //   968: invokevirtual n : ()Ljava/lang/String;
    //   971: invokevirtual equals : (Ljava/lang/Object;)Z
    //   974: ifne -> 994
    //   977: aload_2
    //   978: astore #4
    //   980: aload_0
    //   981: getfield i : Lcom/allinone/callerid/b/o$d;
    //   984: getfield a : Landroid/widget/TextView;
    //   987: aload_3
    //   988: invokevirtual n : ()Ljava/lang/String;
    //   991: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   994: aload_2
    //   995: astore #4
    //   997: aload_0
    //   998: getfield i : Lcom/allinone/callerid/b/o$d;
    //   1001: getfield d : Landroid/widget/FrameLayout;
    //   1004: astore_3
    //   1005: aload_2
    //   1006: astore #4
    //   1008: new com/allinone/callerid/b/o$a
    //   1011: astore #6
    //   1013: aload_2
    //   1014: astore #4
    //   1016: aload #6
    //   1018: aload_0
    //   1019: iload_1
    //   1020: invokespecial <init> : (Lcom/allinone/callerid/b/o;I)V
    //   1023: aload_2
    //   1024: astore #4
    //   1026: aload_3
    //   1027: aload #6
    //   1029: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1032: goto -> 2535
    //   1035: aload_2
    //   1036: astore #4
    //   1038: aload_0
    //   1039: getfield c : Ljava/util/List;
    //   1042: iload_1
    //   1043: invokeinterface get : (I)Ljava/lang/Object;
    //   1048: checkcast com/allinone/callerid/search/CallLogBean
    //   1051: astore_3
    //   1052: aload_2
    //   1053: astore #4
    //   1055: aload_0
    //   1056: getfield g : I
    //   1059: istore #5
    //   1061: iload #5
    //   1063: ifeq -> 1259
    //   1066: iload_1
    //   1067: iload #5
    //   1069: if_icmpne -> 1159
    //   1072: aload_2
    //   1073: astore #4
    //   1075: aload_0
    //   1076: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1079: getfield d : Landroid/widget/TextView;
    //   1082: iconst_0
    //   1083: invokevirtual setVisibility : (I)V
    //   1086: aload_2
    //   1087: astore #4
    //   1089: aload_0
    //   1090: getfield c : Ljava/util/List;
    //   1093: astore #6
    //   1095: aload #6
    //   1097: ifnull -> 1139
    //   1100: aload_2
    //   1101: astore #4
    //   1103: aload #6
    //   1105: invokeinterface size : ()I
    //   1110: aload_0
    //   1111: getfield g : I
    //   1114: isub
    //   1115: iconst_1
    //   1116: if_icmpne -> 1139
    //   1119: aload_2
    //   1120: astore #4
    //   1122: aload_0
    //   1123: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1126: getfield i : Landroid/widget/LinearLayout;
    //   1129: aload_0
    //   1130: getfield l : I
    //   1133: invokevirtual setBackgroundResource : (I)V
    //   1136: goto -> 1442
    //   1139: aload_2
    //   1140: astore #4
    //   1142: aload_0
    //   1143: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1146: getfield i : Landroid/widget/LinearLayout;
    //   1149: aload_0
    //   1150: getfield n : I
    //   1153: invokevirtual setBackgroundResource : (I)V
    //   1156: goto -> 1442
    //   1159: aload_2
    //   1160: astore #4
    //   1162: aload_0
    //   1163: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1166: getfield d : Landroid/widget/TextView;
    //   1169: bipush #8
    //   1171: invokevirtual setVisibility : (I)V
    //   1174: aload_2
    //   1175: astore #4
    //   1177: aload_0
    //   1178: getfield c : Ljava/util/List;
    //   1181: astore #6
    //   1183: aload #6
    //   1185: ifnull -> 1239
    //   1188: aload_2
    //   1189: astore #4
    //   1191: aload #6
    //   1193: invokeinterface size : ()I
    //   1198: ifle -> 1239
    //   1201: aload_2
    //   1202: astore #4
    //   1204: iload_1
    //   1205: aload_0
    //   1206: getfield c : Ljava/util/List;
    //   1209: invokeinterface size : ()I
    //   1214: iconst_1
    //   1215: isub
    //   1216: if_icmpne -> 1239
    //   1219: aload_2
    //   1220: astore #4
    //   1222: aload_0
    //   1223: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1226: getfield i : Landroid/widget/LinearLayout;
    //   1229: aload_0
    //   1230: getfield k : I
    //   1233: invokevirtual setBackgroundResource : (I)V
    //   1236: goto -> 1442
    //   1239: aload_2
    //   1240: astore #4
    //   1242: aload_0
    //   1243: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1246: getfield i : Landroid/widget/LinearLayout;
    //   1249: aload_0
    //   1250: getfield m : I
    //   1253: invokevirtual setBackgroundResource : (I)V
    //   1256: goto -> 1442
    //   1259: iload_1
    //   1260: ifne -> 1345
    //   1263: aload_2
    //   1264: astore #4
    //   1266: aload_0
    //   1267: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1270: getfield d : Landroid/widget/TextView;
    //   1273: iconst_0
    //   1274: invokevirtual setVisibility : (I)V
    //   1277: aload_2
    //   1278: astore #4
    //   1280: aload_0
    //   1281: getfield c : Ljava/util/List;
    //   1284: astore #6
    //   1286: aload #6
    //   1288: ifnull -> 1325
    //   1291: aload_2
    //   1292: astore #4
    //   1294: aload #6
    //   1296: invokeinterface size : ()I
    //   1301: iconst_1
    //   1302: if_icmpne -> 1325
    //   1305: aload_2
    //   1306: astore #4
    //   1308: aload_0
    //   1309: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1312: getfield i : Landroid/widget/LinearLayout;
    //   1315: aload_0
    //   1316: getfield l : I
    //   1319: invokevirtual setBackgroundResource : (I)V
    //   1322: goto -> 1442
    //   1325: aload_2
    //   1326: astore #4
    //   1328: aload_0
    //   1329: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1332: getfield i : Landroid/widget/LinearLayout;
    //   1335: aload_0
    //   1336: getfield n : I
    //   1339: invokevirtual setBackgroundResource : (I)V
    //   1342: goto -> 1442
    //   1345: aload_2
    //   1346: astore #4
    //   1348: aload_0
    //   1349: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1352: getfield d : Landroid/widget/TextView;
    //   1355: bipush #8
    //   1357: invokevirtual setVisibility : (I)V
    //   1360: aload_2
    //   1361: astore #4
    //   1363: aload_0
    //   1364: getfield c : Ljava/util/List;
    //   1367: astore #6
    //   1369: aload #6
    //   1371: ifnull -> 1425
    //   1374: aload_2
    //   1375: astore #4
    //   1377: aload #6
    //   1379: invokeinterface size : ()I
    //   1384: ifle -> 1425
    //   1387: aload_2
    //   1388: astore #4
    //   1390: iload_1
    //   1391: aload_0
    //   1392: getfield c : Ljava/util/List;
    //   1395: invokeinterface size : ()I
    //   1400: iconst_1
    //   1401: isub
    //   1402: if_icmpne -> 1425
    //   1405: aload_2
    //   1406: astore #4
    //   1408: aload_0
    //   1409: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1412: getfield i : Landroid/widget/LinearLayout;
    //   1415: aload_0
    //   1416: getfield k : I
    //   1419: invokevirtual setBackgroundResource : (I)V
    //   1422: goto -> 1442
    //   1425: aload_2
    //   1426: astore #4
    //   1428: aload_0
    //   1429: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1432: getfield i : Landroid/widget/LinearLayout;
    //   1435: aload_0
    //   1436: getfield m : I
    //   1439: invokevirtual setBackgroundResource : (I)V
    //   1442: aload_2
    //   1443: astore #4
    //   1445: aload_3
    //   1446: invokevirtual M : ()I
    //   1449: istore #5
    //   1451: iload #5
    //   1453: iconst_1
    //   1454: if_icmpeq -> 1737
    //   1457: iload #5
    //   1459: iconst_2
    //   1460: if_icmpeq -> 1686
    //   1463: iload #5
    //   1465: iconst_3
    //   1466: if_icmpeq -> 1635
    //   1469: iload #5
    //   1471: iconst_5
    //   1472: if_icmpeq -> 1584
    //   1475: iload #5
    //   1477: bipush #9
    //   1479: if_icmpeq -> 1533
    //   1482: aload_2
    //   1483: astore #4
    //   1485: aload_0
    //   1486: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1489: getfield a : Landroid/widget/ImageView;
    //   1492: ldc_w 2131231080
    //   1495: invokevirtual setBackgroundResource : (I)V
    //   1498: aload_2
    //   1499: astore #4
    //   1501: aload_0
    //   1502: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1505: getfield f : Landroid/widget/ImageView;
    //   1508: ldc_w 2131231080
    //   1511: invokevirtual setBackgroundResource : (I)V
    //   1514: aload_2
    //   1515: astore #4
    //   1517: aload_0
    //   1518: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1521: getfield g : Landroid/widget/ImageView;
    //   1524: ldc_w 2131231080
    //   1527: invokevirtual setBackgroundResource : (I)V
    //   1530: goto -> 1785
    //   1533: aload_2
    //   1534: astore #4
    //   1536: aload_0
    //   1537: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1540: getfield a : Landroid/widget/ImageView;
    //   1543: ldc_w 2131231080
    //   1546: invokevirtual setBackgroundResource : (I)V
    //   1549: aload_2
    //   1550: astore #4
    //   1552: aload_0
    //   1553: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1556: getfield f : Landroid/widget/ImageView;
    //   1559: ldc_w 2131231080
    //   1562: invokevirtual setBackgroundResource : (I)V
    //   1565: aload_2
    //   1566: astore #4
    //   1568: aload_0
    //   1569: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1572: getfield g : Landroid/widget/ImageView;
    //   1575: ldc_w 2131231080
    //   1578: invokevirtual setBackgroundResource : (I)V
    //   1581: goto -> 1785
    //   1584: aload_2
    //   1585: astore #4
    //   1587: aload_0
    //   1588: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1591: getfield a : Landroid/widget/ImageView;
    //   1594: ldc_w 2131231080
    //   1597: invokevirtual setBackgroundResource : (I)V
    //   1600: aload_2
    //   1601: astore #4
    //   1603: aload_0
    //   1604: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1607: getfield f : Landroid/widget/ImageView;
    //   1610: ldc_w 2131231080
    //   1613: invokevirtual setBackgroundResource : (I)V
    //   1616: aload_2
    //   1617: astore #4
    //   1619: aload_0
    //   1620: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1623: getfield g : Landroid/widget/ImageView;
    //   1626: ldc_w 2131231080
    //   1629: invokevirtual setBackgroundResource : (I)V
    //   1632: goto -> 1785
    //   1635: aload_2
    //   1636: astore #4
    //   1638: aload_0
    //   1639: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1642: getfield a : Landroid/widget/ImageView;
    //   1645: ldc_w 2131231080
    //   1648: invokevirtual setBackgroundResource : (I)V
    //   1651: aload_2
    //   1652: astore #4
    //   1654: aload_0
    //   1655: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1658: getfield f : Landroid/widget/ImageView;
    //   1661: ldc_w 2131231080
    //   1664: invokevirtual setBackgroundResource : (I)V
    //   1667: aload_2
    //   1668: astore #4
    //   1670: aload_0
    //   1671: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1674: getfield g : Landroid/widget/ImageView;
    //   1677: ldc_w 2131231080
    //   1680: invokevirtual setBackgroundResource : (I)V
    //   1683: goto -> 1785
    //   1686: aload_2
    //   1687: astore #4
    //   1689: aload_0
    //   1690: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1693: getfield a : Landroid/widget/ImageView;
    //   1696: ldc_w 2131231081
    //   1699: invokevirtual setBackgroundResource : (I)V
    //   1702: aload_2
    //   1703: astore #4
    //   1705: aload_0
    //   1706: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1709: getfield f : Landroid/widget/ImageView;
    //   1712: ldc_w 2131231081
    //   1715: invokevirtual setBackgroundResource : (I)V
    //   1718: aload_2
    //   1719: astore #4
    //   1721: aload_0
    //   1722: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1725: getfield g : Landroid/widget/ImageView;
    //   1728: ldc_w 2131231081
    //   1731: invokevirtual setBackgroundResource : (I)V
    //   1734: goto -> 1785
    //   1737: aload_2
    //   1738: astore #4
    //   1740: aload_0
    //   1741: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1744: getfield a : Landroid/widget/ImageView;
    //   1747: ldc_w 2131231079
    //   1750: invokevirtual setBackgroundResource : (I)V
    //   1753: aload_2
    //   1754: astore #4
    //   1756: aload_0
    //   1757: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1760: getfield f : Landroid/widget/ImageView;
    //   1763: ldc_w 2131231079
    //   1766: invokevirtual setBackgroundResource : (I)V
    //   1769: aload_2
    //   1770: astore #4
    //   1772: aload_0
    //   1773: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1776: getfield g : Landroid/widget/ImageView;
    //   1779: ldc_w 2131231079
    //   1782: invokevirtual setBackgroundResource : (I)V
    //   1785: aload_2
    //   1786: astore #4
    //   1788: aload_0
    //   1789: getfield d : Ljava/util/HashMap;
    //   1792: astore #6
    //   1794: aload #6
    //   1796: ifnull -> 2182
    //   1799: aload_2
    //   1800: astore #4
    //   1802: aload #6
    //   1804: invokevirtual size : ()I
    //   1807: ifeq -> 2182
    //   1810: aload_2
    //   1811: astore #4
    //   1813: aload_3
    //   1814: invokevirtual K : ()Ljava/lang/String;
    //   1817: ifnull -> 2182
    //   1820: aload_2
    //   1821: astore #4
    //   1823: aload_0
    //   1824: getfield d : Ljava/util/HashMap;
    //   1827: aload_3
    //   1828: invokevirtual K : ()Ljava/lang/String;
    //   1831: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1834: checkcast java/lang/Integer
    //   1837: astore #6
    //   1839: aload #6
    //   1841: ifnull -> 2182
    //   1844: aload_2
    //   1845: astore #4
    //   1847: aload #6
    //   1849: invokevirtual intValue : ()I
    //   1852: istore #5
    //   1854: iload #5
    //   1856: iconst_1
    //   1857: if_icmpne -> 1923
    //   1860: aload_2
    //   1861: astore #4
    //   1863: aload_0
    //   1864: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1867: getfield f : Landroid/widget/ImageView;
    //   1870: bipush #8
    //   1872: invokevirtual setVisibility : (I)V
    //   1875: aload_2
    //   1876: astore #4
    //   1878: aload_0
    //   1879: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1882: getfield g : Landroid/widget/ImageView;
    //   1885: bipush #8
    //   1887: invokevirtual setVisibility : (I)V
    //   1890: aload_2
    //   1891: astore #4
    //   1893: aload_0
    //   1894: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1897: getfield c : Landroid/widget/TextView;
    //   1900: ldc ''
    //   1902: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1905: aload_2
    //   1906: astore #4
    //   1908: aload_0
    //   1909: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1912: getfield c : Landroid/widget/TextView;
    //   1915: bipush #8
    //   1917: invokevirtual setVisibility : (I)V
    //   1920: goto -> 2182
    //   1923: iload #5
    //   1925: iconst_2
    //   1926: if_icmpne -> 1991
    //   1929: aload_2
    //   1930: astore #4
    //   1932: aload_0
    //   1933: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1936: getfield f : Landroid/widget/ImageView;
    //   1939: iconst_0
    //   1940: invokevirtual setVisibility : (I)V
    //   1943: aload_2
    //   1944: astore #4
    //   1946: aload_0
    //   1947: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1950: getfield g : Landroid/widget/ImageView;
    //   1953: bipush #8
    //   1955: invokevirtual setVisibility : (I)V
    //   1958: aload_2
    //   1959: astore #4
    //   1961: aload_0
    //   1962: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1965: getfield c : Landroid/widget/TextView;
    //   1968: ldc ''
    //   1970: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1973: aload_2
    //   1974: astore #4
    //   1976: aload_0
    //   1977: getfield j : Lcom/allinone/callerid/b/o$c;
    //   1980: getfield c : Landroid/widget/TextView;
    //   1983: bipush #8
    //   1985: invokevirtual setVisibility : (I)V
    //   1988: goto -> 2182
    //   1991: iload #5
    //   1993: iconst_3
    //   1994: if_icmpne -> 2058
    //   1997: aload_2
    //   1998: astore #4
    //   2000: aload_0
    //   2001: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2004: getfield f : Landroid/widget/ImageView;
    //   2007: iconst_0
    //   2008: invokevirtual setVisibility : (I)V
    //   2011: aload_2
    //   2012: astore #4
    //   2014: aload_0
    //   2015: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2018: getfield g : Landroid/widget/ImageView;
    //   2021: iconst_0
    //   2022: invokevirtual setVisibility : (I)V
    //   2025: aload_2
    //   2026: astore #4
    //   2028: aload_0
    //   2029: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2032: getfield c : Landroid/widget/TextView;
    //   2035: ldc ''
    //   2037: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2040: aload_2
    //   2041: astore #4
    //   2043: aload_0
    //   2044: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2047: getfield c : Landroid/widget/TextView;
    //   2050: bipush #8
    //   2052: invokevirtual setVisibility : (I)V
    //   2055: goto -> 2182
    //   2058: iload #5
    //   2060: iconst_3
    //   2061: if_icmple -> 2182
    //   2064: aload_2
    //   2065: astore #4
    //   2067: aload_0
    //   2068: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2071: getfield f : Landroid/widget/ImageView;
    //   2074: iconst_0
    //   2075: invokevirtual setVisibility : (I)V
    //   2078: aload_2
    //   2079: astore #4
    //   2081: aload_0
    //   2082: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2085: getfield g : Landroid/widget/ImageView;
    //   2088: iconst_0
    //   2089: invokevirtual setVisibility : (I)V
    //   2092: aload_2
    //   2093: astore #4
    //   2095: aload_0
    //   2096: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2099: getfield c : Landroid/widget/TextView;
    //   2102: astore #6
    //   2104: aload_2
    //   2105: astore #4
    //   2107: new java/lang/StringBuilder
    //   2110: astore #7
    //   2112: aload_2
    //   2113: astore #4
    //   2115: aload #7
    //   2117: invokespecial <init> : ()V
    //   2120: aload_2
    //   2121: astore #4
    //   2123: aload #7
    //   2125: ldc_w '('
    //   2128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2131: pop
    //   2132: aload_2
    //   2133: astore #4
    //   2135: aload #7
    //   2137: iload #5
    //   2139: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2142: pop
    //   2143: aload_2
    //   2144: astore #4
    //   2146: aload #7
    //   2148: ldc_w ') '
    //   2151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2154: pop
    //   2155: aload_2
    //   2156: astore #4
    //   2158: aload #6
    //   2160: aload #7
    //   2162: invokevirtual toString : ()Ljava/lang/String;
    //   2165: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2168: aload_2
    //   2169: astore #4
    //   2171: aload_0
    //   2172: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2175: getfield c : Landroid/widget/TextView;
    //   2178: iconst_0
    //   2179: invokevirtual setVisibility : (I)V
    //   2182: aload_2
    //   2183: astore #4
    //   2185: aload_3
    //   2186: invokevirtual B : ()Ljava/lang/String;
    //   2189: ifnull -> 2265
    //   2192: aload_2
    //   2193: astore #4
    //   2195: ldc_w 'Mobile'
    //   2198: aload_3
    //   2199: invokevirtual B : ()Ljava/lang/String;
    //   2202: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2205: ifne -> 2224
    //   2208: aload_2
    //   2209: astore #4
    //   2211: ldc_w 'Fixed line'
    //   2214: aload_3
    //   2215: invokevirtual B : ()Ljava/lang/String;
    //   2218: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2221: ifeq -> 2265
    //   2224: aload_2
    //   2225: astore #4
    //   2227: aload_0
    //   2228: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2231: getfield e : Landroid/widget/TextView;
    //   2234: aload_0
    //   2235: getfield b : Landroid/content/Context;
    //   2238: aload_3
    //   2239: invokevirtual B : ()Ljava/lang/String;
    //   2242: invokestatic J : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   2245: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2248: aload_2
    //   2249: astore #4
    //   2251: aload_0
    //   2252: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2255: getfield e : Landroid/widget/TextView;
    //   2258: iconst_0
    //   2259: invokevirtual setVisibility : (I)V
    //   2262: goto -> 2295
    //   2265: aload_2
    //   2266: astore #4
    //   2268: aload_0
    //   2269: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2272: getfield e : Landroid/widget/TextView;
    //   2275: ldc ''
    //   2277: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2280: aload_2
    //   2281: astore #4
    //   2283: aload_0
    //   2284: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2287: getfield e : Landroid/widget/TextView;
    //   2290: bipush #8
    //   2292: invokevirtual setVisibility : (I)V
    //   2295: aload_2
    //   2296: astore #4
    //   2298: aload_0
    //   2299: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2302: getfield b : Landroid/widget/TextView;
    //   2305: aload_3
    //   2306: invokevirtual D : ()Ljava/lang/String;
    //   2309: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2312: aload_2
    //   2313: astore #4
    //   2315: ldc ''
    //   2317: aload_3
    //   2318: invokevirtual p : ()Ljava/lang/String;
    //   2321: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2324: ifne -> 2461
    //   2327: aload_2
    //   2328: astore #4
    //   2330: ldc_w '-1'
    //   2333: aload_3
    //   2334: invokevirtual p : ()Ljava/lang/String;
    //   2337: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2340: ifne -> 2461
    //   2343: aload_2
    //   2344: astore #4
    //   2346: ldc_w '-2'
    //   2349: aload_3
    //   2350: invokevirtual p : ()Ljava/lang/String;
    //   2353: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2356: ifne -> 2461
    //   2359: aload_2
    //   2360: astore #4
    //   2362: ldc_w '-3'
    //   2365: aload_3
    //   2366: invokevirtual p : ()Ljava/lang/String;
    //   2369: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2372: ifeq -> 2378
    //   2375: goto -> 2461
    //   2378: aload_2
    //   2379: astore #4
    //   2381: aload_0
    //   2382: getfield h : Ljava/lang/String;
    //   2385: astore #6
    //   2387: aload #6
    //   2389: ifnull -> 2441
    //   2392: aload_2
    //   2393: astore #4
    //   2395: ldc ''
    //   2397: aload #6
    //   2399: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2402: ifne -> 2441
    //   2405: aload_2
    //   2406: astore #4
    //   2408: aload_0
    //   2409: getfield b : Landroid/content/Context;
    //   2412: aload_3
    //   2413: invokevirtual p : ()Ljava/lang/String;
    //   2416: aload_0
    //   2417: getfield h : Ljava/lang/String;
    //   2420: invokestatic a : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;
    //   2423: astore_3
    //   2424: aload_2
    //   2425: astore #4
    //   2427: aload_0
    //   2428: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2431: getfield j : Landroid/widget/TextView;
    //   2434: aload_3
    //   2435: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2438: goto -> 2487
    //   2441: aload_2
    //   2442: astore #4
    //   2444: aload_0
    //   2445: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2448: getfield j : Landroid/widget/TextView;
    //   2451: aload_3
    //   2452: invokevirtual p : ()Ljava/lang/String;
    //   2455: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2458: goto -> 2487
    //   2461: aload_2
    //   2462: astore #4
    //   2464: aload_0
    //   2465: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2468: getfield j : Landroid/widget/TextView;
    //   2471: aload_0
    //   2472: getfield b : Landroid/content/Context;
    //   2475: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2478: ldc_w 2131755829
    //   2481: invokevirtual getString : (I)Ljava/lang/String;
    //   2484: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2487: aload_2
    //   2488: astore #4
    //   2490: aload_0
    //   2491: getfield j : Lcom/allinone/callerid/b/o$c;
    //   2494: getfield h : Landroid/widget/FrameLayout;
    //   2497: astore #6
    //   2499: aload_2
    //   2500: astore #4
    //   2502: new com/allinone/callerid/b/o$b
    //   2505: astore_3
    //   2506: aload_2
    //   2507: astore #4
    //   2509: aload_3
    //   2510: aload_0
    //   2511: iload_1
    //   2512: invokespecial <init> : (Lcom/allinone/callerid/b/o;I)V
    //   2515: aload_2
    //   2516: astore #4
    //   2518: aload #6
    //   2520: aload_3
    //   2521: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2524: goto -> 2535
    //   2527: astore_2
    //   2528: aload_2
    //   2529: invokevirtual printStackTrace : ()V
    //   2532: aload #4
    //   2534: astore_2
    //   2535: aload_2
    //   2536: areturn
    // Exception table:
    //   from	to	target	type
    //   3	10	2527	java/lang/Exception
    //   31	43	2527	java/lang/Exception
    //   46	50	2527	java/lang/Exception
    //   53	58	2527	java/lang/Exception
    //   61	66	2527	java/lang/Exception
    //   69	82	2527	java/lang/Exception
    //   85	101	2527	java/lang/Exception
    //   104	120	2527	java/lang/Exception
    //   123	139	2527	java/lang/Exception
    //   142	158	2527	java/lang/Exception
    //   161	174	2527	java/lang/Exception
    //   177	190	2527	java/lang/Exception
    //   193	206	2527	java/lang/Exception
    //   209	217	2527	java/lang/Exception
    //   223	235	2527	java/lang/Exception
    //   238	242	2527	java/lang/Exception
    //   245	250	2527	java/lang/Exception
    //   253	258	2527	java/lang/Exception
    //   261	274	2527	java/lang/Exception
    //   277	293	2527	java/lang/Exception
    //   296	312	2527	java/lang/Exception
    //   315	327	2527	java/lang/Exception
    //   330	342	2527	java/lang/Exception
    //   345	361	2527	java/lang/Exception
    //   364	380	2527	java/lang/Exception
    //   383	399	2527	java/lang/Exception
    //   402	418	2527	java/lang/Exception
    //   421	437	2527	java/lang/Exception
    //   440	452	2527	java/lang/Exception
    //   455	467	2527	java/lang/Exception
    //   470	482	2527	java/lang/Exception
    //   485	501	2527	java/lang/Exception
    //   504	520	2527	java/lang/Exception
    //   523	536	2527	java/lang/Exception
    //   539	552	2527	java/lang/Exception
    //   555	568	2527	java/lang/Exception
    //   571	584	2527	java/lang/Exception
    //   587	600	2527	java/lang/Exception
    //   603	611	2527	java/lang/Exception
    //   631	642	2527	java/lang/Exception
    //   648	659	2527	java/lang/Exception
    //   668	682	2527	java/lang/Exception
    //   689	700	2527	java/lang/Exception
    //   703	710	2527	java/lang/Exception
    //   713	721	2527	java/lang/Exception
    //   724	738	2527	java/lang/Exception
    //   744	758	2527	java/lang/Exception
    //   764	776	2527	java/lang/Exception
    //   779	786	2527	java/lang/Exception
    //   789	795	2527	java/lang/Exception
    //   811	825	2527	java/lang/Exception
    //   831	845	2527	java/lang/Exception
    //   848	855	2527	java/lang/Exception
    //   858	870	2527	java/lang/Exception
    //   873	879	2527	java/lang/Exception
    //   887	897	2527	java/lang/Exception
    //   900	917	2527	java/lang/Exception
    //   920	932	2527	java/lang/Exception
    //   938	952	2527	java/lang/Exception
    //   955	962	2527	java/lang/Exception
    //   965	977	2527	java/lang/Exception
    //   980	994	2527	java/lang/Exception
    //   997	1005	2527	java/lang/Exception
    //   1008	1013	2527	java/lang/Exception
    //   1016	1023	2527	java/lang/Exception
    //   1026	1032	2527	java/lang/Exception
    //   1038	1052	2527	java/lang/Exception
    //   1055	1061	2527	java/lang/Exception
    //   1075	1086	2527	java/lang/Exception
    //   1089	1095	2527	java/lang/Exception
    //   1103	1119	2527	java/lang/Exception
    //   1122	1136	2527	java/lang/Exception
    //   1142	1156	2527	java/lang/Exception
    //   1162	1174	2527	java/lang/Exception
    //   1177	1183	2527	java/lang/Exception
    //   1191	1201	2527	java/lang/Exception
    //   1204	1219	2527	java/lang/Exception
    //   1222	1236	2527	java/lang/Exception
    //   1242	1256	2527	java/lang/Exception
    //   1266	1277	2527	java/lang/Exception
    //   1280	1286	2527	java/lang/Exception
    //   1294	1305	2527	java/lang/Exception
    //   1308	1322	2527	java/lang/Exception
    //   1328	1342	2527	java/lang/Exception
    //   1348	1360	2527	java/lang/Exception
    //   1363	1369	2527	java/lang/Exception
    //   1377	1387	2527	java/lang/Exception
    //   1390	1405	2527	java/lang/Exception
    //   1408	1422	2527	java/lang/Exception
    //   1428	1442	2527	java/lang/Exception
    //   1445	1451	2527	java/lang/Exception
    //   1485	1498	2527	java/lang/Exception
    //   1501	1514	2527	java/lang/Exception
    //   1517	1530	2527	java/lang/Exception
    //   1536	1549	2527	java/lang/Exception
    //   1552	1565	2527	java/lang/Exception
    //   1568	1581	2527	java/lang/Exception
    //   1587	1600	2527	java/lang/Exception
    //   1603	1616	2527	java/lang/Exception
    //   1619	1632	2527	java/lang/Exception
    //   1638	1651	2527	java/lang/Exception
    //   1654	1667	2527	java/lang/Exception
    //   1670	1683	2527	java/lang/Exception
    //   1689	1702	2527	java/lang/Exception
    //   1705	1718	2527	java/lang/Exception
    //   1721	1734	2527	java/lang/Exception
    //   1740	1753	2527	java/lang/Exception
    //   1756	1769	2527	java/lang/Exception
    //   1772	1785	2527	java/lang/Exception
    //   1788	1794	2527	java/lang/Exception
    //   1802	1810	2527	java/lang/Exception
    //   1813	1820	2527	java/lang/Exception
    //   1823	1839	2527	java/lang/Exception
    //   1847	1854	2527	java/lang/Exception
    //   1863	1875	2527	java/lang/Exception
    //   1878	1890	2527	java/lang/Exception
    //   1893	1905	2527	java/lang/Exception
    //   1908	1920	2527	java/lang/Exception
    //   1932	1943	2527	java/lang/Exception
    //   1946	1958	2527	java/lang/Exception
    //   1961	1973	2527	java/lang/Exception
    //   1976	1988	2527	java/lang/Exception
    //   2000	2011	2527	java/lang/Exception
    //   2014	2025	2527	java/lang/Exception
    //   2028	2040	2527	java/lang/Exception
    //   2043	2055	2527	java/lang/Exception
    //   2067	2078	2527	java/lang/Exception
    //   2081	2092	2527	java/lang/Exception
    //   2095	2104	2527	java/lang/Exception
    //   2107	2112	2527	java/lang/Exception
    //   2115	2120	2527	java/lang/Exception
    //   2123	2132	2527	java/lang/Exception
    //   2135	2143	2527	java/lang/Exception
    //   2146	2155	2527	java/lang/Exception
    //   2158	2168	2527	java/lang/Exception
    //   2171	2182	2527	java/lang/Exception
    //   2185	2192	2527	java/lang/Exception
    //   2195	2208	2527	java/lang/Exception
    //   2211	2224	2527	java/lang/Exception
    //   2227	2248	2527	java/lang/Exception
    //   2251	2262	2527	java/lang/Exception
    //   2268	2280	2527	java/lang/Exception
    //   2283	2295	2527	java/lang/Exception
    //   2298	2312	2527	java/lang/Exception
    //   2315	2327	2527	java/lang/Exception
    //   2330	2343	2527	java/lang/Exception
    //   2346	2359	2527	java/lang/Exception
    //   2362	2375	2527	java/lang/Exception
    //   2381	2387	2527	java/lang/Exception
    //   2395	2405	2527	java/lang/Exception
    //   2408	2424	2527	java/lang/Exception
    //   2427	2438	2527	java/lang/Exception
    //   2444	2458	2527	java/lang/Exception
    //   2464	2487	2527	java/lang/Exception
    //   2490	2499	2527	java/lang/Exception
    //   2502	2506	2527	java/lang/Exception
    //   2509	2515	2527	java/lang/Exception
    //   2518	2524	2527	java/lang/Exception
  }
  
  public int getViewTypeCount() {
    return 2;
  }
  
  class a implements View.OnClickListener {
    a(o this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = o.a(this.c).getOnItemClickListener();
      ListView listView = o.a(this.c);
      int i = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
    }
  }
  
  class b implements View.OnClickListener {
    b(o this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = o.a(this.c).getOnItemClickListener();
      ListView listView = o.a(this.c);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */