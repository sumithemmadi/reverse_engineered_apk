package com.allinone.callerid.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.customview.ProgressWheel;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.q0;
import com.github.clans.fab.FloatingActionButton;
import java.util.HashMap;
import java.util.List;

public class j extends BaseAdapter {
  private final int b;
  
  private final int c;
  
  private Context d;
  
  private List<CallLogBean> e;
  
  private HashMap<String, Integer> f = new HashMap<String, Integer>();
  
  private LayoutInflater g;
  
  private ListView h;
  
  f i;
  
  private LinearLayout j;
  
  private FloatingActionButton k;
  
  private int l;
  
  private RelativeLayout m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  public j(Context paramContext, List<CallLogBean> paramList, HashMap<String, Integer> paramHashMap, ListView paramListView, LinearLayout paramLinearLayout, FloatingActionButton paramFloatingActionButton, RelativeLayout paramRelativeLayout) {
    this.d = paramContext;
    this.e = paramList;
    this.g = LayoutInflater.from(paramContext);
    this.h = paramListView;
    this.f = paramHashMap;
    this.j = paramLinearLayout;
    this.k = paramFloatingActionButton;
    this.m = paramRelativeLayout;
    this.n = d1.a(paramContext, 2130968855, 2131099719);
    this.o = d1.a(paramContext, 2130968902, 2131099725);
    this.p = d1.a(paramContext, 2130968858, 2131099729);
    this.q = d1.a(paramContext, 2130968855, 2131099719);
    this.b = d1.b(this.d, 2130968700, 2131230906);
    this.c = d1.b(this.d, 2130968701, 2131230909);
  }
  
  private void h(View paramView, CallLogBean paramCallLogBean, int paramInt) {
    paramView.setOnClickListener(new e(this, paramCallLogBean));
  }
  
  public int getCount() {
    return this.e.size();
  }
  
  public Object getItem(int paramInt) {
    return this.e.get(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt) {
    return 0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual getItemViewType : (I)I
    //   5: pop
    //   6: aload_2
    //   7: ifnonnull -> 610
    //   10: aload_0
    //   11: getfield g : Landroid/view/LayoutInflater;
    //   14: ldc 2131492980
    //   16: aload_3
    //   17: iconst_0
    //   18: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   21: astore_2
    //   22: new com/allinone/callerid/b/j$f
    //   25: dup
    //   26: aconst_null
    //   27: invokespecial <init> : (Lcom/allinone/callerid/b/j$a;)V
    //   30: astore_3
    //   31: aload_0
    //   32: aload_3
    //   33: putfield i : Lcom/allinone/callerid/b/j$f;
    //   36: aload_3
    //   37: aload_2
    //   38: ldc 2131296451
    //   40: invokevirtual findViewById : (I)Landroid/view/View;
    //   43: checkcast android/widget/ImageView
    //   46: putfield a : Landroid/widget/ImageView;
    //   49: aload_0
    //   50: getfield i : Lcom/allinone/callerid/b/j$f;
    //   53: aload_2
    //   54: ldc 2131296452
    //   56: invokevirtual findViewById : (I)Landroid/view/View;
    //   59: checkcast android/widget/ImageView
    //   62: putfield m : Landroid/widget/ImageView;
    //   65: aload_0
    //   66: getfield i : Lcom/allinone/callerid/b/j$f;
    //   69: aload_2
    //   70: ldc 2131296453
    //   72: invokevirtual findViewById : (I)Landroid/view/View;
    //   75: checkcast android/widget/ImageView
    //   78: putfield n : Landroid/widget/ImageView;
    //   81: aload_0
    //   82: getfield i : Lcom/allinone/callerid/b/j$f;
    //   85: getfield m : Landroid/widget/ImageView;
    //   88: bipush #8
    //   90: invokevirtual setVisibility : (I)V
    //   93: aload_0
    //   94: getfield i : Lcom/allinone/callerid/b/j$f;
    //   97: getfield n : Landroid/widget/ImageView;
    //   100: bipush #8
    //   102: invokevirtual setVisibility : (I)V
    //   105: aload_0
    //   106: getfield i : Lcom/allinone/callerid/b/j$f;
    //   109: aload_2
    //   110: ldc 2131297304
    //   112: invokevirtual findViewById : (I)Landroid/view/View;
    //   115: checkcast android/widget/TextView
    //   118: putfield b : Landroid/widget/TextView;
    //   121: aload_0
    //   122: getfield i : Lcom/allinone/callerid/b/j$f;
    //   125: aload_2
    //   126: ldc 2131297753
    //   128: invokevirtual findViewById : (I)Landroid/view/View;
    //   131: checkcast android/widget/TextView
    //   134: putfield c : Landroid/widget/TextView;
    //   137: aload_0
    //   138: getfield i : Lcom/allinone/callerid/b/j$f;
    //   141: aload_2
    //   142: ldc 2131296379
    //   144: invokevirtual findViewById : (I)Landroid/view/View;
    //   147: checkcast android/widget/TextView
    //   150: putfield d : Landroid/widget/TextView;
    //   153: aload_0
    //   154: getfield i : Lcom/allinone/callerid/b/j$f;
    //   157: aload_2
    //   158: ldc 2131297875
    //   160: invokevirtual findViewById : (I)Landroid/view/View;
    //   163: checkcast android/widget/TextView
    //   166: putfield h : Landroid/widget/TextView;
    //   169: aload_0
    //   170: getfield i : Lcom/allinone/callerid/b/j$f;
    //   173: aload_2
    //   174: ldc 2131298026
    //   176: invokevirtual findViewById : (I)Landroid/view/View;
    //   179: checkcast android/widget/TextView
    //   182: putfield i : Landroid/widget/TextView;
    //   185: aload_0
    //   186: getfield i : Lcom/allinone/callerid/b/j$f;
    //   189: aload_2
    //   190: ldc 2131298136
    //   192: invokevirtual findViewById : (I)Landroid/view/View;
    //   195: checkcast android/widget/TextView
    //   198: putfield e : Landroid/widget/TextView;
    //   201: aload_0
    //   202: getfield i : Lcom/allinone/callerid/b/j$f;
    //   205: aload_2
    //   206: ldc 2131297880
    //   208: invokevirtual findViewById : (I)Landroid/view/View;
    //   211: checkcast android/widget/TextView
    //   214: putfield f : Landroid/widget/TextView;
    //   217: aload_0
    //   218: getfield i : Lcom/allinone/callerid/b/j$f;
    //   221: aload_2
    //   222: ldc 2131297498
    //   224: invokevirtual findViewById : (I)Landroid/view/View;
    //   227: checkcast android/widget/RelativeLayout
    //   230: putfield g : Landroid/widget/RelativeLayout;
    //   233: aload_0
    //   234: getfield i : Lcom/allinone/callerid/b/j$f;
    //   237: getfield e : Landroid/widget/TextView;
    //   240: bipush #8
    //   242: invokevirtual setVisibility : (I)V
    //   245: aload_0
    //   246: getfield i : Lcom/allinone/callerid/b/j$f;
    //   249: getfield f : Landroid/widget/TextView;
    //   252: bipush #8
    //   254: invokevirtual setVisibility : (I)V
    //   257: aload_0
    //   258: getfield i : Lcom/allinone/callerid/b/j$f;
    //   261: getfield g : Landroid/widget/RelativeLayout;
    //   264: bipush #8
    //   266: invokevirtual setVisibility : (I)V
    //   269: aload_0
    //   270: getfield i : Lcom/allinone/callerid/b/j$f;
    //   273: getfield i : Landroid/widget/TextView;
    //   276: bipush #8
    //   278: invokevirtual setVisibility : (I)V
    //   281: aload_0
    //   282: getfield i : Lcom/allinone/callerid/b/j$f;
    //   285: getfield e : Landroid/widget/TextView;
    //   288: aload_0
    //   289: getfield b : I
    //   292: invokevirtual setBackgroundResource : (I)V
    //   295: aload_0
    //   296: getfield i : Lcom/allinone/callerid/b/j$f;
    //   299: getfield e : Landroid/widget/TextView;
    //   302: aload_0
    //   303: getfield p : I
    //   306: invokevirtual setTextColor : (I)V
    //   309: aload_0
    //   310: getfield i : Lcom/allinone/callerid/b/j$f;
    //   313: aload_2
    //   314: ldc 2131296445
    //   316: invokevirtual findViewById : (I)Landroid/view/View;
    //   319: checkcast android/widget/ImageView
    //   322: putfield j : Landroid/widget/ImageView;
    //   325: aload_0
    //   326: getfield i : Lcom/allinone/callerid/b/j$f;
    //   329: aload_2
    //   330: ldc 2131296446
    //   332: invokevirtual findViewById : (I)Landroid/view/View;
    //   335: checkcast android/widget/ImageView
    //   338: putfield k : Landroid/widget/ImageView;
    //   341: aload_0
    //   342: getfield i : Lcom/allinone/callerid/b/j$f;
    //   345: aload_2
    //   346: ldc 2131296864
    //   348: invokevirtual findViewById : (I)Landroid/view/View;
    //   351: checkcast android/widget/ImageView
    //   354: putfield l : Landroid/widget/ImageView;
    //   357: aload_0
    //   358: getfield i : Lcom/allinone/callerid/b/j$f;
    //   361: getfield l : Landroid/widget/ImageView;
    //   364: bipush #8
    //   366: invokevirtual setVisibility : (I)V
    //   369: aload_0
    //   370: getfield i : Lcom/allinone/callerid/b/j$f;
    //   373: getfield h : Landroid/widget/TextView;
    //   376: ldc ''
    //   378: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   381: aload_0
    //   382: getfield i : Lcom/allinone/callerid/b/j$f;
    //   385: getfield h : Landroid/widget/TextView;
    //   388: bipush #8
    //   390: invokevirtual setVisibility : (I)V
    //   393: aload_0
    //   394: getfield i : Lcom/allinone/callerid/b/j$f;
    //   397: aload_2
    //   398: ldc 2131297383
    //   400: invokevirtual findViewById : (I)Landroid/view/View;
    //   403: checkcast com/allinone/callerid/customview/ProgressWheel
    //   406: putfield o : Lcom/allinone/callerid/customview/ProgressWheel;
    //   409: aload_0
    //   410: getfield i : Lcom/allinone/callerid/b/j$f;
    //   413: aload_2
    //   414: ldc 2131297469
    //   416: invokevirtual findViewById : (I)Landroid/view/View;
    //   419: checkcast android/widget/FrameLayout
    //   422: putfield p : Landroid/widget/FrameLayout;
    //   425: aload_0
    //   426: getfield i : Lcom/allinone/callerid/b/j$f;
    //   429: aload_2
    //   430: ldc 2131297468
    //   432: invokevirtual findViewById : (I)Landroid/view/View;
    //   435: checkcast android/widget/RelativeLayout
    //   438: putfield q : Landroid/widget/RelativeLayout;
    //   441: aload_0
    //   442: getfield i : Lcom/allinone/callerid/b/j$f;
    //   445: aload_2
    //   446: ldc 2131297483
    //   448: invokevirtual findViewById : (I)Landroid/view/View;
    //   451: putfield r : Landroid/view/View;
    //   454: aload_0
    //   455: getfield i : Lcom/allinone/callerid/b/j$f;
    //   458: getfield r : Landroid/view/View;
    //   461: bipush #8
    //   463: invokevirtual setVisibility : (I)V
    //   466: aload_0
    //   467: getfield i : Lcom/allinone/callerid/b/j$f;
    //   470: aload_2
    //   471: ldc 2131297542
    //   473: invokevirtual findViewById : (I)Landroid/view/View;
    //   476: putfield s : Landroid/view/View;
    //   479: aload_0
    //   480: getfield i : Lcom/allinone/callerid/b/j$f;
    //   483: getfield s : Landroid/view/View;
    //   486: bipush #8
    //   488: invokevirtual setVisibility : (I)V
    //   491: aload_0
    //   492: getfield i : Lcom/allinone/callerid/b/j$f;
    //   495: aload_2
    //   496: ldc_w 2131297423
    //   499: invokevirtual findViewById : (I)Landroid/view/View;
    //   502: checkcast android/widget/ImageView
    //   505: putfield t : Landroid/widget/ImageView;
    //   508: aload_0
    //   509: getfield i : Lcom/allinone/callerid/b/j$f;
    //   512: getfield b : Landroid/widget/TextView;
    //   515: invokestatic b : ()Landroid/graphics/Typeface;
    //   518: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   521: aload_0
    //   522: getfield i : Lcom/allinone/callerid/b/j$f;
    //   525: getfield h : Landroid/widget/TextView;
    //   528: invokestatic b : ()Landroid/graphics/Typeface;
    //   531: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   534: aload_0
    //   535: getfield i : Lcom/allinone/callerid/b/j$f;
    //   538: getfield c : Landroid/widget/TextView;
    //   541: invokestatic b : ()Landroid/graphics/Typeface;
    //   544: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   547: aload_0
    //   548: getfield i : Lcom/allinone/callerid/b/j$f;
    //   551: getfield i : Landroid/widget/TextView;
    //   554: invokestatic b : ()Landroid/graphics/Typeface;
    //   557: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   560: aload_0
    //   561: getfield i : Lcom/allinone/callerid/b/j$f;
    //   564: getfield d : Landroid/widget/TextView;
    //   567: invokestatic b : ()Landroid/graphics/Typeface;
    //   570: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   573: aload_0
    //   574: getfield i : Lcom/allinone/callerid/b/j$f;
    //   577: getfield e : Landroid/widget/TextView;
    //   580: invokestatic b : ()Landroid/graphics/Typeface;
    //   583: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   586: aload_0
    //   587: getfield i : Lcom/allinone/callerid/b/j$f;
    //   590: getfield f : Landroid/widget/TextView;
    //   593: invokestatic a : ()Landroid/graphics/Typeface;
    //   596: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   599: aload_2
    //   600: aload_0
    //   601: getfield i : Lcom/allinone/callerid/b/j$f;
    //   604: invokevirtual setTag : (Ljava/lang/Object;)V
    //   607: goto -> 621
    //   610: aload_0
    //   611: aload_2
    //   612: invokevirtual getTag : ()Ljava/lang/Object;
    //   615: checkcast com/allinone/callerid/b/j$f
    //   618: putfield i : Lcom/allinone/callerid/b/j$f;
    //   621: aload_0
    //   622: getfield i : Lcom/allinone/callerid/b/j$f;
    //   625: getfield t : Landroid/widget/ImageView;
    //   628: astore_3
    //   629: ldc_w 2131231148
    //   632: istore #4
    //   634: aload_3
    //   635: ldc_w 2131231148
    //   638: invokevirtual setImageResource : (I)V
    //   641: aload_0
    //   642: getfield i : Lcom/allinone/callerid/b/j$f;
    //   645: getfield b : Landroid/widget/TextView;
    //   648: aload_0
    //   649: getfield n : I
    //   652: invokevirtual setTextColor : (I)V
    //   655: aload_0
    //   656: getfield i : Lcom/allinone/callerid/b/j$f;
    //   659: getfield h : Landroid/widget/TextView;
    //   662: aload_0
    //   663: getfield o : I
    //   666: invokevirtual setTextColor : (I)V
    //   669: aload_0
    //   670: getfield i : Lcom/allinone/callerid/b/j$f;
    //   673: getfield i : Landroid/widget/TextView;
    //   676: aload_0
    //   677: getfield o : I
    //   680: invokevirtual setTextColor : (I)V
    //   683: aload_0
    //   684: getfield i : Lcom/allinone/callerid/b/j$f;
    //   687: getfield c : Landroid/widget/TextView;
    //   690: aload_0
    //   691: getfield o : I
    //   694: invokevirtual setTextColor : (I)V
    //   697: aload_0
    //   698: getfield e : Ljava/util/List;
    //   701: iload_1
    //   702: invokeinterface get : (I)Ljava/lang/Object;
    //   707: checkcast com/allinone/callerid/search/CallLogBean
    //   710: astore_3
    //   711: aload_3
    //   712: invokevirtual U : ()Z
    //   715: ifne -> 753
    //   718: aload_3
    //   719: invokevirtual T : ()Z
    //   722: ifne -> 753
    //   725: invokestatic currentTimeMillis : ()J
    //   728: aload_3
    //   729: invokevirtual z : ()J
    //   732: lcmp
    //   733: ifge -> 739
    //   736: goto -> 753
    //   739: aload_0
    //   740: getfield i : Lcom/allinone/callerid/b/j$f;
    //   743: getfield o : Lcom/allinone/callerid/customview/ProgressWheel;
    //   746: iconst_0
    //   747: invokevirtual setVisibility : (I)V
    //   750: goto -> 765
    //   753: aload_0
    //   754: getfield i : Lcom/allinone/callerid/b/j$f;
    //   757: getfield o : Lcom/allinone/callerid/customview/ProgressWheel;
    //   760: bipush #8
    //   762: invokevirtual setVisibility : (I)V
    //   765: aload_0
    //   766: getfield m : Landroid/widget/RelativeLayout;
    //   769: ifnonnull -> 784
    //   772: aload_0
    //   773: getfield i : Lcom/allinone/callerid/b/j$f;
    //   776: getfield o : Lcom/allinone/callerid/customview/ProgressWheel;
    //   779: bipush #8
    //   781: invokevirtual setVisibility : (I)V
    //   784: aload_3
    //   785: invokevirtual p : ()Ljava/lang/String;
    //   788: ldc_w 'facebook_ad'
    //   791: invokevirtual equals : (Ljava/lang/Object;)Z
    //   794: ifeq -> 824
    //   797: aload_0
    //   798: getfield i : Lcom/allinone/callerid/b/j$f;
    //   801: getfield f : Landroid/widget/TextView;
    //   804: bipush #8
    //   806: invokevirtual setVisibility : (I)V
    //   809: aload_0
    //   810: getfield i : Lcom/allinone/callerid/b/j$f;
    //   813: getfield g : Landroid/widget/RelativeLayout;
    //   816: bipush #8
    //   818: invokevirtual setVisibility : (I)V
    //   821: goto -> 871
    //   824: aload_0
    //   825: getfield i : Lcom/allinone/callerid/b/j$f;
    //   828: getfield f : Landroid/widget/TextView;
    //   831: iconst_0
    //   832: invokevirtual setVisibility : (I)V
    //   835: aload_0
    //   836: getfield i : Lcom/allinone/callerid/b/j$f;
    //   839: getfield g : Landroid/widget/RelativeLayout;
    //   842: iconst_0
    //   843: invokevirtual setVisibility : (I)V
    //   846: aload_0
    //   847: getfield i : Lcom/allinone/callerid/b/j$f;
    //   850: getfield s : Landroid/view/View;
    //   853: iconst_0
    //   854: invokevirtual setVisibility : (I)V
    //   857: aload_0
    //   858: getfield i : Lcom/allinone/callerid/b/j$f;
    //   861: getfield f : Landroid/widget/TextView;
    //   864: aload_3
    //   865: invokevirtual g : ()Ljava/lang/String;
    //   868: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   871: aload_0
    //   872: getfield e : Ljava/util/List;
    //   875: astore #5
    //   877: aload #5
    //   879: ifnull -> 1046
    //   882: aload #5
    //   884: invokeinterface size : ()I
    //   889: iconst_1
    //   890: if_icmple -> 1046
    //   893: iload_1
    //   894: ifle -> 1046
    //   897: aload_0
    //   898: getfield e : Ljava/util/List;
    //   901: astore #5
    //   903: iload_1
    //   904: iconst_1
    //   905: isub
    //   906: istore #6
    //   908: aload #5
    //   910: iload #6
    //   912: invokeinterface get : (I)Ljava/lang/Object;
    //   917: checkcast com/allinone/callerid/search/CallLogBean
    //   920: invokevirtual p : ()Ljava/lang/String;
    //   923: ldc_w 'facebook_ad'
    //   926: invokevirtual equals : (Ljava/lang/Object;)Z
    //   929: ifne -> 1046
    //   932: aload_0
    //   933: getfield e : Ljava/util/List;
    //   936: iload #6
    //   938: invokeinterface get : (I)Ljava/lang/Object;
    //   943: checkcast com/allinone/callerid/search/CallLogBean
    //   946: invokevirtual g : ()Ljava/lang/String;
    //   949: aload_0
    //   950: getfield e : Ljava/util/List;
    //   953: iload_1
    //   954: invokeinterface get : (I)Ljava/lang/Object;
    //   959: checkcast com/allinone/callerid/search/CallLogBean
    //   962: invokevirtual g : ()Ljava/lang/String;
    //   965: invokevirtual equals : (Ljava/lang/Object;)Z
    //   968: ifeq -> 1010
    //   971: aload_0
    //   972: getfield i : Lcom/allinone/callerid/b/j$f;
    //   975: getfield f : Landroid/widget/TextView;
    //   978: bipush #8
    //   980: invokevirtual setVisibility : (I)V
    //   983: aload_0
    //   984: getfield i : Lcom/allinone/callerid/b/j$f;
    //   987: getfield g : Landroid/widget/RelativeLayout;
    //   990: bipush #8
    //   992: invokevirtual setVisibility : (I)V
    //   995: aload_0
    //   996: getfield i : Lcom/allinone/callerid/b/j$f;
    //   999: getfield s : Landroid/view/View;
    //   1002: bipush #8
    //   1004: invokevirtual setVisibility : (I)V
    //   1007: goto -> 1180
    //   1010: aload_0
    //   1011: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1014: getfield f : Landroid/widget/TextView;
    //   1017: iconst_0
    //   1018: invokevirtual setVisibility : (I)V
    //   1021: aload_0
    //   1022: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1025: getfield g : Landroid/widget/RelativeLayout;
    //   1028: iconst_0
    //   1029: invokevirtual setVisibility : (I)V
    //   1032: aload_0
    //   1033: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1036: getfield s : Landroid/view/View;
    //   1039: iconst_0
    //   1040: invokevirtual setVisibility : (I)V
    //   1043: goto -> 1180
    //   1046: aload_0
    //   1047: getfield e : Ljava/util/List;
    //   1050: astore #5
    //   1052: aload #5
    //   1054: ifnull -> 1180
    //   1057: aload #5
    //   1059: invokeinterface size : ()I
    //   1064: ifle -> 1180
    //   1067: iload_1
    //   1068: ifle -> 1180
    //   1071: aload_0
    //   1072: getfield e : Ljava/util/List;
    //   1075: iload_1
    //   1076: iconst_1
    //   1077: isub
    //   1078: invokeinterface get : (I)Ljava/lang/Object;
    //   1083: checkcast com/allinone/callerid/search/CallLogBean
    //   1086: invokevirtual p : ()Ljava/lang/String;
    //   1089: ldc_w 'facebook_ad'
    //   1092: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1095: ifeq -> 1180
    //   1098: aload_0
    //   1099: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1102: getfield f : Landroid/widget/TextView;
    //   1105: bipush #8
    //   1107: invokevirtual setVisibility : (I)V
    //   1110: aload_0
    //   1111: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1114: getfield g : Landroid/widget/RelativeLayout;
    //   1117: bipush #8
    //   1119: invokevirtual setVisibility : (I)V
    //   1122: aload_0
    //   1123: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1126: getfield s : Landroid/view/View;
    //   1129: bipush #8
    //   1131: invokevirtual setVisibility : (I)V
    //   1134: goto -> 1180
    //   1137: astore #5
    //   1139: aload_0
    //   1140: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1143: getfield f : Landroid/widget/TextView;
    //   1146: bipush #8
    //   1148: invokevirtual setVisibility : (I)V
    //   1151: aload_0
    //   1152: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1155: getfield g : Landroid/widget/RelativeLayout;
    //   1158: bipush #8
    //   1160: invokevirtual setVisibility : (I)V
    //   1163: aload_0
    //   1164: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1167: getfield s : Landroid/view/View;
    //   1170: bipush #8
    //   1172: invokevirtual setVisibility : (I)V
    //   1175: aload #5
    //   1177: invokevirtual printStackTrace : ()V
    //   1180: iload_1
    //   1181: ifne -> 1263
    //   1184: aload_0
    //   1185: getfield e : Ljava/util/List;
    //   1188: iconst_0
    //   1189: invokeinterface get : (I)Ljava/lang/Object;
    //   1194: checkcast com/allinone/callerid/search/CallLogBean
    //   1197: invokevirtual p : ()Ljava/lang/String;
    //   1200: ldc_w 'facebook_ad'
    //   1203: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1206: ifne -> 1263
    //   1209: aload_0
    //   1210: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1213: getfield f : Landroid/widget/TextView;
    //   1216: iconst_0
    //   1217: invokevirtual setVisibility : (I)V
    //   1220: aload_0
    //   1221: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1224: getfield g : Landroid/widget/RelativeLayout;
    //   1227: iconst_0
    //   1228: invokevirtual setVisibility : (I)V
    //   1231: aload_0
    //   1232: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1235: getfield s : Landroid/view/View;
    //   1238: iconst_0
    //   1239: invokevirtual setVisibility : (I)V
    //   1242: aload_0
    //   1243: getfield j : Landroid/widget/LinearLayout;
    //   1246: ifnull -> 1275
    //   1249: aload_0
    //   1250: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1253: getfield l : Landroid/widget/ImageView;
    //   1256: iconst_0
    //   1257: invokevirtual setVisibility : (I)V
    //   1260: goto -> 1275
    //   1263: aload_0
    //   1264: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1267: getfield l : Landroid/widget/ImageView;
    //   1270: bipush #8
    //   1272: invokevirtual setVisibility : (I)V
    //   1275: aload_0
    //   1276: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1279: getfield l : Landroid/widget/ImageView;
    //   1282: new com/allinone/callerid/b/j$a
    //   1285: dup
    //   1286: aload_0
    //   1287: invokespecial <init> : (Lcom/allinone/callerid/b/j;)V
    //   1290: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1293: aload_0
    //   1294: getfield j : Landroid/widget/LinearLayout;
    //   1297: ifnonnull -> 1311
    //   1300: aload_0
    //   1301: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1304: getfield j : Landroid/widget/ImageView;
    //   1307: iconst_4
    //   1308: invokevirtual setVisibility : (I)V
    //   1311: aload_0
    //   1312: getfield e : Ljava/util/List;
    //   1315: astore #5
    //   1317: aload #5
    //   1319: ifnull -> 1583
    //   1322: aload #5
    //   1324: invokeinterface size : ()I
    //   1329: iconst_1
    //   1330: if_icmple -> 1583
    //   1333: iload_1
    //   1334: ifle -> 1583
    //   1337: aload_0
    //   1338: getfield e : Ljava/util/List;
    //   1341: astore #5
    //   1343: iload_1
    //   1344: iconst_1
    //   1345: isub
    //   1346: istore #6
    //   1348: aload #5
    //   1350: iload #6
    //   1352: invokeinterface get : (I)Ljava/lang/Object;
    //   1357: checkcast com/allinone/callerid/search/CallLogBean
    //   1360: invokevirtual p : ()Ljava/lang/String;
    //   1363: ldc_w 'facebook_ad'
    //   1366: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1369: ifne -> 1583
    //   1372: aload_0
    //   1373: getfield e : Ljava/util/List;
    //   1376: iload #6
    //   1378: invokeinterface get : (I)Ljava/lang/Object;
    //   1383: checkcast com/allinone/callerid/search/CallLogBean
    //   1386: invokevirtual g : ()Ljava/lang/String;
    //   1389: aload_0
    //   1390: getfield e : Ljava/util/List;
    //   1393: iload_1
    //   1394: invokeinterface get : (I)Ljava/lang/Object;
    //   1399: checkcast com/allinone/callerid/search/CallLogBean
    //   1402: invokevirtual g : ()Ljava/lang/String;
    //   1405: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1408: ifeq -> 1497
    //   1411: iload_1
    //   1412: aload_0
    //   1413: getfield e : Ljava/util/List;
    //   1416: invokeinterface size : ()I
    //   1421: iconst_1
    //   1422: isub
    //   1423: if_icmpeq -> 1483
    //   1426: aload_0
    //   1427: getfield e : Ljava/util/List;
    //   1430: iload_1
    //   1431: iconst_1
    //   1432: iadd
    //   1433: invokeinterface get : (I)Ljava/lang/Object;
    //   1438: checkcast com/allinone/callerid/search/CallLogBean
    //   1441: invokevirtual g : ()Ljava/lang/String;
    //   1444: aload_0
    //   1445: getfield e : Ljava/util/List;
    //   1448: iload_1
    //   1449: invokeinterface get : (I)Ljava/lang/Object;
    //   1454: checkcast com/allinone/callerid/search/CallLogBean
    //   1457: invokevirtual g : ()Ljava/lang/String;
    //   1460: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1463: ifeq -> 1469
    //   1466: goto -> 1749
    //   1469: aload_0
    //   1470: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1473: getfield r : Landroid/view/View;
    //   1476: iconst_0
    //   1477: invokevirtual setVisibility : (I)V
    //   1480: goto -> 1749
    //   1483: aload_0
    //   1484: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1487: getfield r : Landroid/view/View;
    //   1490: iconst_0
    //   1491: invokevirtual setVisibility : (I)V
    //   1494: goto -> 1749
    //   1497: iload_1
    //   1498: aload_0
    //   1499: getfield e : Ljava/util/List;
    //   1502: invokeinterface size : ()I
    //   1507: iconst_1
    //   1508: isub
    //   1509: if_icmpeq -> 1569
    //   1512: aload_0
    //   1513: getfield e : Ljava/util/List;
    //   1516: iload_1
    //   1517: iconst_1
    //   1518: iadd
    //   1519: invokeinterface get : (I)Ljava/lang/Object;
    //   1524: checkcast com/allinone/callerid/search/CallLogBean
    //   1527: invokevirtual g : ()Ljava/lang/String;
    //   1530: aload_0
    //   1531: getfield e : Ljava/util/List;
    //   1534: iload_1
    //   1535: invokeinterface get : (I)Ljava/lang/Object;
    //   1540: checkcast com/allinone/callerid/search/CallLogBean
    //   1543: invokevirtual g : ()Ljava/lang/String;
    //   1546: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1549: ifeq -> 1555
    //   1552: goto -> 1749
    //   1555: aload_0
    //   1556: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1559: getfield r : Landroid/view/View;
    //   1562: iconst_0
    //   1563: invokevirtual setVisibility : (I)V
    //   1566: goto -> 1749
    //   1569: aload_0
    //   1570: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1573: getfield r : Landroid/view/View;
    //   1576: iconst_0
    //   1577: invokevirtual setVisibility : (I)V
    //   1580: goto -> 1749
    //   1583: iload_1
    //   1584: aload_0
    //   1585: getfield e : Ljava/util/List;
    //   1588: invokeinterface size : ()I
    //   1593: iconst_1
    //   1594: isub
    //   1595: if_icmpeq -> 1717
    //   1598: aload_0
    //   1599: getfield e : Ljava/util/List;
    //   1602: iload_1
    //   1603: iconst_1
    //   1604: iadd
    //   1605: invokeinterface get : (I)Ljava/lang/Object;
    //   1610: checkcast com/allinone/callerid/search/CallLogBean
    //   1613: invokevirtual g : ()Ljava/lang/String;
    //   1616: aload_0
    //   1617: getfield e : Ljava/util/List;
    //   1620: iload_1
    //   1621: invokeinterface get : (I)Ljava/lang/Object;
    //   1626: checkcast com/allinone/callerid/search/CallLogBean
    //   1629: invokevirtual g : ()Ljava/lang/String;
    //   1632: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1635: ifeq -> 1641
    //   1638: goto -> 1749
    //   1641: iload_1
    //   1642: iconst_1
    //   1643: if_icmpne -> 1685
    //   1646: aload_0
    //   1647: getfield e : Ljava/util/List;
    //   1650: iconst_0
    //   1651: invokeinterface get : (I)Ljava/lang/Object;
    //   1656: checkcast com/allinone/callerid/search/CallLogBean
    //   1659: invokevirtual p : ()Ljava/lang/String;
    //   1662: ldc_w 'facebook_ad'
    //   1665: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1668: ifeq -> 1685
    //   1671: aload_0
    //   1672: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1675: getfield r : Landroid/view/View;
    //   1678: iconst_0
    //   1679: invokevirtual setVisibility : (I)V
    //   1682: goto -> 1749
    //   1685: iload_1
    //   1686: ifne -> 1703
    //   1689: aload_0
    //   1690: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1693: getfield r : Landroid/view/View;
    //   1696: iconst_0
    //   1697: invokevirtual setVisibility : (I)V
    //   1700: goto -> 1749
    //   1703: aload_0
    //   1704: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1707: getfield r : Landroid/view/View;
    //   1710: iconst_0
    //   1711: invokevirtual setVisibility : (I)V
    //   1714: goto -> 1749
    //   1717: aload_0
    //   1718: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1721: getfield r : Landroid/view/View;
    //   1724: iconst_0
    //   1725: invokevirtual setVisibility : (I)V
    //   1728: goto -> 1749
    //   1731: astore #5
    //   1733: aload_0
    //   1734: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1737: getfield r : Landroid/view/View;
    //   1740: iconst_0
    //   1741: invokevirtual setVisibility : (I)V
    //   1744: aload #5
    //   1746: invokevirtual printStackTrace : ()V
    //   1749: aload_3
    //   1750: invokevirtual c : ()Ljava/lang/String;
    //   1753: ifnull -> 1796
    //   1756: aload_3
    //   1757: invokevirtual c : ()Ljava/lang/String;
    //   1760: ldc ''
    //   1762: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1765: ifne -> 1796
    //   1768: aload_0
    //   1769: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1772: getfield d : Landroid/widget/TextView;
    //   1775: iconst_0
    //   1776: invokevirtual setVisibility : (I)V
    //   1779: aload_0
    //   1780: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1783: getfield d : Landroid/widget/TextView;
    //   1786: aload_3
    //   1787: invokevirtual c : ()Ljava/lang/String;
    //   1790: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1793: goto -> 1820
    //   1796: aload_0
    //   1797: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1800: getfield d : Landroid/widget/TextView;
    //   1803: ldc ''
    //   1805: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1808: aload_0
    //   1809: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1812: getfield d : Landroid/widget/TextView;
    //   1815: bipush #8
    //   1817: invokevirtual setVisibility : (I)V
    //   1820: aload_3
    //   1821: invokevirtual T : ()Z
    //   1824: ifne -> 2020
    //   1827: aload_3
    //   1828: invokevirtual N : ()Ljava/lang/String;
    //   1831: ifnull -> 1921
    //   1834: ldc ''
    //   1836: aload_3
    //   1837: invokevirtual N : ()Ljava/lang/String;
    //   1840: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1843: ifne -> 1921
    //   1846: aload_3
    //   1847: invokevirtual x : ()Ljava/lang/String;
    //   1850: ifnull -> 1921
    //   1853: ldc ''
    //   1855: aload_3
    //   1856: invokevirtual x : ()Ljava/lang/String;
    //   1859: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1862: ifne -> 1921
    //   1865: aload_0
    //   1866: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1869: getfield e : Landroid/widget/TextView;
    //   1872: iconst_0
    //   1873: invokevirtual setVisibility : (I)V
    //   1876: aload_0
    //   1877: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1880: getfield e : Landroid/widget/TextView;
    //   1883: aload_0
    //   1884: getfield b : I
    //   1887: invokevirtual setBackgroundResource : (I)V
    //   1890: aload_0
    //   1891: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1894: getfield e : Landroid/widget/TextView;
    //   1897: aload_0
    //   1898: getfield p : I
    //   1901: invokevirtual setTextColor : (I)V
    //   1904: aload_0
    //   1905: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1908: getfield e : Landroid/widget/TextView;
    //   1911: aload_3
    //   1912: invokevirtual N : ()Ljava/lang/String;
    //   1915: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1918: goto -> 2032
    //   1921: aload_3
    //   1922: invokevirtual y : ()Ljava/lang/String;
    //   1925: ifnull -> 2005
    //   1928: ldc ''
    //   1930: aload_3
    //   1931: invokevirtual y : ()Ljava/lang/String;
    //   1934: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1937: ifne -> 2005
    //   1940: aload_0
    //   1941: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1944: getfield e : Landroid/widget/TextView;
    //   1947: aload_0
    //   1948: getfield c : I
    //   1951: invokevirtual setBackgroundResource : (I)V
    //   1954: aload_0
    //   1955: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1958: getfield e : Landroid/widget/TextView;
    //   1961: iconst_0
    //   1962: invokevirtual setVisibility : (I)V
    //   1965: aload_0
    //   1966: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1969: getfield e : Landroid/widget/TextView;
    //   1972: aload_0
    //   1973: getfield q : I
    //   1976: invokevirtual setTextColor : (I)V
    //   1979: aload_0
    //   1980: getfield i : Lcom/allinone/callerid/b/j$f;
    //   1983: getfield e : Landroid/widget/TextView;
    //   1986: aload_0
    //   1987: getfield d : Landroid/content/Context;
    //   1990: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1993: ldc_w 2131755414
    //   1996: invokevirtual getString : (I)Ljava/lang/String;
    //   1999: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2002: goto -> 2032
    //   2005: aload_0
    //   2006: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2009: getfield e : Landroid/widget/TextView;
    //   2012: bipush #8
    //   2014: invokevirtual setVisibility : (I)V
    //   2017: goto -> 2032
    //   2020: aload_0
    //   2021: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2024: getfield e : Landroid/widget/TextView;
    //   2027: bipush #8
    //   2029: invokevirtual setVisibility : (I)V
    //   2032: aload_3
    //   2033: invokevirtual n : ()Ljava/lang/String;
    //   2036: astore #5
    //   2038: aload #5
    //   2040: ifnull -> 2071
    //   2043: ldc ''
    //   2045: aload #5
    //   2047: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2050: ifeq -> 2056
    //   2053: goto -> 2071
    //   2056: aload_0
    //   2057: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2060: getfield b : Landroid/widget/TextView;
    //   2063: aload #5
    //   2065: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2068: goto -> 2236
    //   2071: aload_3
    //   2072: invokevirtual y : ()Ljava/lang/String;
    //   2075: ifnull -> 2107
    //   2078: ldc ''
    //   2080: aload_3
    //   2081: invokevirtual y : ()Ljava/lang/String;
    //   2084: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2087: ifne -> 2107
    //   2090: aload_0
    //   2091: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2094: getfield b : Landroid/widget/TextView;
    //   2097: aload_3
    //   2098: invokevirtual y : ()Ljava/lang/String;
    //   2101: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2104: goto -> 2236
    //   2107: aload_3
    //   2108: invokevirtual d : ()Ljava/lang/String;
    //   2111: ifnull -> 2143
    //   2114: ldc ''
    //   2116: aload_3
    //   2117: invokevirtual d : ()Ljava/lang/String;
    //   2120: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2123: ifne -> 2143
    //   2126: aload_0
    //   2127: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2130: getfield b : Landroid/widget/TextView;
    //   2133: aload_3
    //   2134: invokevirtual d : ()Ljava/lang/String;
    //   2137: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2140: goto -> 2236
    //   2143: aload_3
    //   2144: invokevirtual i : ()Ljava/lang/String;
    //   2147: ifnull -> 2179
    //   2150: ldc ''
    //   2152: aload_3
    //   2153: invokevirtual i : ()Ljava/lang/String;
    //   2156: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2159: ifne -> 2179
    //   2162: aload_0
    //   2163: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2166: getfield b : Landroid/widget/TextView;
    //   2169: aload_3
    //   2170: invokevirtual i : ()Ljava/lang/String;
    //   2173: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2176: goto -> 2236
    //   2179: aload_3
    //   2180: invokevirtual p : ()Ljava/lang/String;
    //   2183: ifnull -> 2236
    //   2186: aload_3
    //   2187: invokevirtual p : ()Ljava/lang/String;
    //   2190: invokestatic v0 : (Ljava/lang/String;)Z
    //   2193: ifeq -> 2222
    //   2196: aload_0
    //   2197: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2200: getfield b : Landroid/widget/TextView;
    //   2203: aload_0
    //   2204: getfield d : Landroid/content/Context;
    //   2207: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2210: ldc_w 2131755829
    //   2213: invokevirtual getString : (I)Ljava/lang/String;
    //   2216: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2219: goto -> 2236
    //   2222: aload_0
    //   2223: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2226: getfield b : Landroid/widget/TextView;
    //   2229: aload_3
    //   2230: invokevirtual p : ()Ljava/lang/String;
    //   2233: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2236: aload_3
    //   2237: invokevirtual M : ()I
    //   2240: istore #6
    //   2242: iload #6
    //   2244: iconst_1
    //   2245: if_icmpeq -> 2483
    //   2248: iload #6
    //   2250: iconst_2
    //   2251: if_icmpeq -> 2441
    //   2254: iload #6
    //   2256: iconst_3
    //   2257: if_icmpeq -> 2399
    //   2260: iload #6
    //   2262: iconst_5
    //   2263: if_icmpeq -> 2357
    //   2266: iload #6
    //   2268: bipush #9
    //   2270: if_icmpeq -> 2315
    //   2273: aload_0
    //   2274: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2277: getfield a : Landroid/widget/ImageView;
    //   2280: ldc_w 2131231080
    //   2283: invokevirtual setBackgroundResource : (I)V
    //   2286: aload_0
    //   2287: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2290: getfield m : Landroid/widget/ImageView;
    //   2293: ldc_w 2131231080
    //   2296: invokevirtual setBackgroundResource : (I)V
    //   2299: aload_0
    //   2300: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2303: getfield n : Landroid/widget/ImageView;
    //   2306: ldc_w 2131231080
    //   2309: invokevirtual setBackgroundResource : (I)V
    //   2312: goto -> 2522
    //   2315: aload_0
    //   2316: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2319: getfield a : Landroid/widget/ImageView;
    //   2322: ldc_w 2131231080
    //   2325: invokevirtual setBackgroundResource : (I)V
    //   2328: aload_0
    //   2329: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2332: getfield m : Landroid/widget/ImageView;
    //   2335: ldc_w 2131231080
    //   2338: invokevirtual setBackgroundResource : (I)V
    //   2341: aload_0
    //   2342: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2345: getfield n : Landroid/widget/ImageView;
    //   2348: ldc_w 2131231080
    //   2351: invokevirtual setBackgroundResource : (I)V
    //   2354: goto -> 2522
    //   2357: aload_0
    //   2358: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2361: getfield a : Landroid/widget/ImageView;
    //   2364: ldc_w 2131231080
    //   2367: invokevirtual setBackgroundResource : (I)V
    //   2370: aload_0
    //   2371: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2374: getfield m : Landroid/widget/ImageView;
    //   2377: ldc_w 2131231080
    //   2380: invokevirtual setBackgroundResource : (I)V
    //   2383: aload_0
    //   2384: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2387: getfield n : Landroid/widget/ImageView;
    //   2390: ldc_w 2131231080
    //   2393: invokevirtual setBackgroundResource : (I)V
    //   2396: goto -> 2522
    //   2399: aload_0
    //   2400: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2403: getfield a : Landroid/widget/ImageView;
    //   2406: ldc_w 2131231080
    //   2409: invokevirtual setBackgroundResource : (I)V
    //   2412: aload_0
    //   2413: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2416: getfield m : Landroid/widget/ImageView;
    //   2419: ldc_w 2131231080
    //   2422: invokevirtual setBackgroundResource : (I)V
    //   2425: aload_0
    //   2426: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2429: getfield n : Landroid/widget/ImageView;
    //   2432: ldc_w 2131231080
    //   2435: invokevirtual setBackgroundResource : (I)V
    //   2438: goto -> 2522
    //   2441: aload_0
    //   2442: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2445: getfield a : Landroid/widget/ImageView;
    //   2448: ldc_w 2131231081
    //   2451: invokevirtual setBackgroundResource : (I)V
    //   2454: aload_0
    //   2455: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2458: getfield m : Landroid/widget/ImageView;
    //   2461: ldc_w 2131231081
    //   2464: invokevirtual setBackgroundResource : (I)V
    //   2467: aload_0
    //   2468: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2471: getfield n : Landroid/widget/ImageView;
    //   2474: ldc_w 2131231081
    //   2477: invokevirtual setBackgroundResource : (I)V
    //   2480: goto -> 2522
    //   2483: aload_0
    //   2484: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2487: getfield a : Landroid/widget/ImageView;
    //   2490: ldc_w 2131231079
    //   2493: invokevirtual setBackgroundResource : (I)V
    //   2496: aload_0
    //   2497: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2500: getfield m : Landroid/widget/ImageView;
    //   2503: ldc_w 2131231079
    //   2506: invokevirtual setBackgroundResource : (I)V
    //   2509: aload_0
    //   2510: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2513: getfield n : Landroid/widget/ImageView;
    //   2516: ldc_w 2131231079
    //   2519: invokevirtual setBackgroundResource : (I)V
    //   2522: aload_0
    //   2523: getfield f : Ljava/util/HashMap;
    //   2526: astore #5
    //   2528: aload #5
    //   2530: ifnull -> 2830
    //   2533: aload #5
    //   2535: invokevirtual size : ()I
    //   2538: ifeq -> 2830
    //   2541: aload_0
    //   2542: getfield f : Ljava/util/HashMap;
    //   2545: aload_3
    //   2546: invokevirtual K : ()Ljava/lang/String;
    //   2549: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2552: checkcast java/lang/Integer
    //   2555: astore #5
    //   2557: aload #5
    //   2559: ifnull -> 2830
    //   2562: aload #5
    //   2564: invokevirtual intValue : ()I
    //   2567: istore #6
    //   2569: iload #6
    //   2571: iconst_1
    //   2572: if_icmpne -> 2626
    //   2575: aload_0
    //   2576: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2579: getfield m : Landroid/widget/ImageView;
    //   2582: bipush #8
    //   2584: invokevirtual setVisibility : (I)V
    //   2587: aload_0
    //   2588: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2591: getfield n : Landroid/widget/ImageView;
    //   2594: bipush #8
    //   2596: invokevirtual setVisibility : (I)V
    //   2599: aload_0
    //   2600: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2603: getfield h : Landroid/widget/TextView;
    //   2606: ldc ''
    //   2608: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2611: aload_0
    //   2612: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2615: getfield h : Landroid/widget/TextView;
    //   2618: bipush #8
    //   2620: invokevirtual setVisibility : (I)V
    //   2623: goto -> 2830
    //   2626: iload #6
    //   2628: iconst_2
    //   2629: if_icmpne -> 2682
    //   2632: aload_0
    //   2633: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2636: getfield m : Landroid/widget/ImageView;
    //   2639: iconst_0
    //   2640: invokevirtual setVisibility : (I)V
    //   2643: aload_0
    //   2644: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2647: getfield n : Landroid/widget/ImageView;
    //   2650: bipush #8
    //   2652: invokevirtual setVisibility : (I)V
    //   2655: aload_0
    //   2656: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2659: getfield h : Landroid/widget/TextView;
    //   2662: ldc ''
    //   2664: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2667: aload_0
    //   2668: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2671: getfield h : Landroid/widget/TextView;
    //   2674: bipush #8
    //   2676: invokevirtual setVisibility : (I)V
    //   2679: goto -> 2830
    //   2682: iload #6
    //   2684: iconst_3
    //   2685: if_icmpne -> 2737
    //   2688: aload_0
    //   2689: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2692: getfield m : Landroid/widget/ImageView;
    //   2695: iconst_0
    //   2696: invokevirtual setVisibility : (I)V
    //   2699: aload_0
    //   2700: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2703: getfield n : Landroid/widget/ImageView;
    //   2706: iconst_0
    //   2707: invokevirtual setVisibility : (I)V
    //   2710: aload_0
    //   2711: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2714: getfield h : Landroid/widget/TextView;
    //   2717: ldc ''
    //   2719: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2722: aload_0
    //   2723: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2726: getfield h : Landroid/widget/TextView;
    //   2729: bipush #8
    //   2731: invokevirtual setVisibility : (I)V
    //   2734: goto -> 2830
    //   2737: iload #6
    //   2739: iconst_3
    //   2740: if_icmple -> 2830
    //   2743: aload_0
    //   2744: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2747: getfield m : Landroid/widget/ImageView;
    //   2750: iconst_0
    //   2751: invokevirtual setVisibility : (I)V
    //   2754: aload_0
    //   2755: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2758: getfield n : Landroid/widget/ImageView;
    //   2761: iconst_0
    //   2762: invokevirtual setVisibility : (I)V
    //   2765: aload_0
    //   2766: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2769: getfield h : Landroid/widget/TextView;
    //   2772: astore #5
    //   2774: new java/lang/StringBuilder
    //   2777: dup
    //   2778: invokespecial <init> : ()V
    //   2781: astore #7
    //   2783: aload #7
    //   2785: ldc_w '('
    //   2788: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2791: pop
    //   2792: aload #7
    //   2794: iload #6
    //   2796: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2799: pop
    //   2800: aload #7
    //   2802: ldc_w ')'
    //   2805: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2808: pop
    //   2809: aload #5
    //   2811: aload #7
    //   2813: invokevirtual toString : ()Ljava/lang/String;
    //   2816: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2819: aload_0
    //   2820: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2823: getfield h : Landroid/widget/TextView;
    //   2826: iconst_0
    //   2827: invokevirtual setVisibility : (I)V
    //   2830: aload_3
    //   2831: invokevirtual B : ()Ljava/lang/String;
    //   2834: ifnull -> 2877
    //   2837: ldc ''
    //   2839: aload_3
    //   2840: invokevirtual B : ()Ljava/lang/String;
    //   2843: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2846: ifne -> 2877
    //   2849: aload_0
    //   2850: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2853: getfield i : Landroid/widget/TextView;
    //   2856: aload_3
    //   2857: invokevirtual B : ()Ljava/lang/String;
    //   2860: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2863: aload_0
    //   2864: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2867: getfield i : Landroid/widget/TextView;
    //   2870: iconst_0
    //   2871: invokevirtual setVisibility : (I)V
    //   2874: goto -> 2901
    //   2877: aload_0
    //   2878: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2881: getfield i : Landroid/widget/TextView;
    //   2884: ldc ''
    //   2886: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2889: aload_0
    //   2890: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2893: getfield i : Landroid/widget/TextView;
    //   2896: bipush #8
    //   2898: invokevirtual setVisibility : (I)V
    //   2901: aload_0
    //   2902: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2905: getfield c : Landroid/widget/TextView;
    //   2908: aload_3
    //   2909: invokevirtual P : ()Ljava/lang/String;
    //   2912: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2915: aload_0
    //   2916: aload_0
    //   2917: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2920: getfield j : Landroid/widget/ImageView;
    //   2923: aload_3
    //   2924: iload_1
    //   2925: invokespecial h : (Landroid/view/View;Lcom/allinone/callerid/search/CallLogBean;I)V
    //   2928: aload_0
    //   2929: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2932: getfield p : Landroid/widget/FrameLayout;
    //   2935: new com/allinone/callerid/b/j$b
    //   2938: dup
    //   2939: aload_0
    //   2940: iload_1
    //   2941: invokespecial <init> : (Lcom/allinone/callerid/b/j;I)V
    //   2944: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2947: aload_0
    //   2948: getfield j : Landroid/widget/LinearLayout;
    //   2951: ifnull -> 2973
    //   2954: aload_0
    //   2955: getfield i : Lcom/allinone/callerid/b/j$f;
    //   2958: getfield p : Landroid/widget/FrameLayout;
    //   2961: new com/allinone/callerid/b/j$c
    //   2964: dup
    //   2965: aload_0
    //   2966: iload_1
    //   2967: invokespecial <init> : (Lcom/allinone/callerid/b/j;I)V
    //   2970: invokevirtual setOnLongClickListener : (Landroid/view/View$OnLongClickListener;)V
    //   2973: aload_0
    //   2974: getfield h : Landroid/widget/ListView;
    //   2977: new com/allinone/callerid/b/j$d
    //   2980: dup
    //   2981: aload_0
    //   2982: invokespecial <init> : (Lcom/allinone/callerid/b/j;)V
    //   2985: invokevirtual setOnScrollListener : (Landroid/widget/AbsListView$OnScrollListener;)V
    //   2988: aload_3
    //   2989: invokevirtual N : ()Ljava/lang/String;
    //   2992: ifnull -> 3046
    //   2995: ldc ''
    //   2997: aload_3
    //   2998: invokevirtual N : ()Ljava/lang/String;
    //   3001: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3004: ifne -> 3046
    //   3007: aload_3
    //   3008: invokevirtual x : ()Ljava/lang/String;
    //   3011: ifnull -> 3046
    //   3014: ldc ''
    //   3016: aload_3
    //   3017: invokevirtual x : ()Ljava/lang/String;
    //   3020: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3023: ifne -> 3046
    //   3026: aload_0
    //   3027: getfield i : Lcom/allinone/callerid/b/j$f;
    //   3030: getfield t : Landroid/widget/ImageView;
    //   3033: ldc_w 2131231149
    //   3036: invokevirtual setImageResource : (I)V
    //   3039: ldc_w 2131231149
    //   3042: istore_1
    //   3043: goto -> 3062
    //   3046: aload_0
    //   3047: getfield i : Lcom/allinone/callerid/b/j$f;
    //   3050: getfield t : Landroid/widget/ImageView;
    //   3053: ldc_w 2131231148
    //   3056: invokevirtual setImageResource : (I)V
    //   3059: iload #4
    //   3061: istore_1
    //   3062: aload_3
    //   3063: invokevirtual a : ()Ljava/lang/String;
    //   3066: ifnull -> 3100
    //   3069: ldc ''
    //   3071: aload_3
    //   3072: invokevirtual a : ()Ljava/lang/String;
    //   3075: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3078: ifne -> 3100
    //   3081: aload_0
    //   3082: getfield d : Landroid/content/Context;
    //   3085: aload_3
    //   3086: invokevirtual a : ()Ljava/lang/String;
    //   3089: iload_1
    //   3090: aload_0
    //   3091: getfield i : Lcom/allinone/callerid/b/j$f;
    //   3094: getfield t : Landroid/widget/ImageView;
    //   3097: invokestatic b : (Landroid/content/Context;Ljava/lang/Object;ILandroid/widget/ImageView;)V
    //   3100: aload_2
    //   3101: areturn
    // Exception table:
    //   from	to	target	type
    //   871	877	1137	java/lang/Exception
    //   882	893	1137	java/lang/Exception
    //   897	903	1137	java/lang/Exception
    //   908	1007	1137	java/lang/Exception
    //   1010	1043	1137	java/lang/Exception
    //   1046	1052	1137	java/lang/Exception
    //   1057	1067	1137	java/lang/Exception
    //   1071	1134	1137	java/lang/Exception
    //   1311	1317	1731	java/lang/Exception
    //   1322	1333	1731	java/lang/Exception
    //   1337	1343	1731	java/lang/Exception
    //   1348	1466	1731	java/lang/Exception
    //   1469	1480	1731	java/lang/Exception
    //   1483	1494	1731	java/lang/Exception
    //   1497	1552	1731	java/lang/Exception
    //   1555	1566	1731	java/lang/Exception
    //   1569	1580	1731	java/lang/Exception
    //   1583	1638	1731	java/lang/Exception
    //   1646	1682	1731	java/lang/Exception
    //   1689	1700	1731	java/lang/Exception
    //   1703	1714	1731	java/lang/Exception
    //   1717	1728	1731	java/lang/Exception
  }
  
  public int getViewTypeCount() {
    return 1;
  }
  
  class a implements View.OnClickListener {
    a(j this$0) {}
    
    public void onClick(View param1View) {}
  }
  
  class b implements View.OnClickListener {
    b(j this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = j.a(this.c).getOnItemClickListener();
      ListView listView = j.a(this.c);
      int i = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
    }
  }
  
  class c implements View.OnLongClickListener {
    c(j this$0, int param1Int) {}
    
    public boolean onLongClick(View param1View) {
      AdapterView.OnItemLongClickListener onItemLongClickListener = j.a(this.c).getOnItemLongClickListener();
      ListView listView = j.a(this.c);
      int i = this.b;
      onItemLongClickListener.onItemLongClick((AdapterView)listView, param1View, i, this.c.getItemId(i));
      return true;
    }
  }
  
  class d implements AbsListView.OnScrollListener {
    d(j this$0) {}
    
    public void onScroll(AbsListView param1AbsListView, int param1Int1, int param1Int2, int param1Int3) {
      try {
        if (param1Int1 > j.b(this.a)) {
          if (j.d(this.a) != null && !j.d(this.a).y())
            j.d(this.a).u(true); 
        } else if (param1Int1 < j.b(this.a) && j.d(this.a) != null && j.d(this.a).y()) {
          j.d(this.a).H(true);
        } 
        j.c(this.a, param1Int1);
        if (j.e(this.a) != null) {
          TextView textView = (TextView)j.e(this.a).findViewById(2131297910);
          textView.setTypeface(g1.a());
          if (param1Int1 >= 1) {
            List<CallLogBean> list = j.f(this.a);
            param1Int2 = param1Int1 - 1;
            if (((CallLogBean)list.get(param1Int2)).p().equals("facebook_ad")) {
              textView.setText(((CallLogBean)j.f(this.a).get(param1Int1)).g());
            } else {
              textView.setText(((CallLogBean)j.f(this.a).get(param1Int2)).g());
            } 
            j.e(this.a).setVisibility(0);
          } else {
            j.e(this.a).setVisibility(8);
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public void onScrollStateChanged(AbsListView param1AbsListView, int param1Int) {}
  }
  
  class e implements View.OnClickListener {
    e(j this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      try {
        if (this.b.p() != null) {
          if ("".equals(this.b.p()) || "-1".equals(this.b.p()) || "-2".equals(this.b.p()) || "-3".equals(this.b.p())) {
            Toast.makeText(j.g(this.c), j.g(this.c).getResources().getString(2131755829), 0).show();
            return;
          } 
          q0.a(j.g(this.c), this.b.p());
        } 
      } catch (Exception exception) {
        Toast.makeText(j.g(this.c), j.g(this.c).getResources().getString(2131755541), 0).show();
      } 
    }
  }
  
  private static class f {
    ImageView a;
    
    TextView b;
    
    TextView c;
    
    TextView d;
    
    TextView e;
    
    TextView f;
    
    RelativeLayout g;
    
    TextView h;
    
    TextView i;
    
    ImageView j;
    
    ImageView k;
    
    ImageView l;
    
    ImageView m;
    
    ImageView n;
    
    ProgressWheel o;
    
    FrameLayout p;
    
    RelativeLayout q;
    
    View r;
    
    View s;
    
    ImageView t;
    
    private f() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */