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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.allinone.callerid.customview.MyListView;
import com.allinone.callerid.search.CallLogBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class i extends BaseAdapter implements SectionIndexer {
  private List<CallLogBean> b;
  
  private Context c;
  
  private Activity d;
  
  private LayoutInflater e;
  
  private ListView f;
  
  c g;
  
  private String h;
  
  public i(Context paramContext, List<CallLogBean> paramList, ListView paramListView) {
    this.c = paramContext;
    this.d = (Activity)paramContext;
    this.f = paramListView;
    this.e = LayoutInflater.from(paramContext);
    if (paramList == null) {
      this.b = new ArrayList<CallLogBean>();
    } else {
      this.b = paramList;
    } 
  }
  
  public void b(List<CallLogBean> paramList) {
    if (paramList == null) {
      this.b = new ArrayList<CallLogBean>();
    } else {
      this.b = paramList;
    } 
    this.h = null;
    notifyDataSetChanged();
  }
  
  public void c(List<CallLogBean> paramList, String paramString) {
    if (paramList == null) {
      this.b = new ArrayList<CallLogBean>();
    } else {
      this.b = paramList;
    } 
    this.h = paramString;
    notifyDataSetChanged();
  }
  
  public int getCount() {
    return this.b.size();
  }
  
  public Object getItem(int paramInt) {
    return this.b.get(paramInt);
  }
  
  public long getItemId(int paramInt) {
    return paramInt;
  }
  
  public int getPositionForSection(int paramInt) {
    for (byte b = 0; b < getCount(); b++) {
      List<CallLogBean> list = this.b;
      if (list != null && list.get(b) != null && ((CallLogBean)this.b.get(b)).r != null && ((CallLogBean)this.b.get(b)).r.toUpperCase(Locale.CHINESE).charAt(0) == paramInt)
        return b; 
    } 
    return -1;
  }
  
  public int getSectionForPosition(int paramInt) {
    return ((CallLogBean)this.b.get(paramInt)).r.charAt(0);
  }
  
  public Object[] getSections() {
    return null;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: ldc ''
    //   2: astore #4
    //   4: aload_2
    //   5: ifnonnull -> 273
    //   8: aload_0
    //   9: getfield e : Landroid/view/LayoutInflater;
    //   12: ldc 2131492975
    //   14: aload_3
    //   15: iconst_0
    //   16: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   19: astore #5
    //   21: new com/allinone/callerid/b/i$c
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore_2
    //   29: aload_0
    //   30: aload_2
    //   31: putfield g : Lcom/allinone/callerid/b/i$c;
    //   34: aload_2
    //   35: aload #5
    //   37: ldc 2131297306
    //   39: invokevirtual findViewById : (I)Landroid/view/View;
    //   42: checkcast android/widget/TextView
    //   45: putfield a : Landroid/widget/TextView;
    //   48: aload_0
    //   49: getfield g : Lcom/allinone/callerid/b/i$c;
    //   52: aload #5
    //   54: ldc 2131297333
    //   56: invokevirtual findViewById : (I)Landroid/view/View;
    //   59: checkcast android/widget/TextView
    //   62: putfield b : Landroid/widget/TextView;
    //   65: aload_0
    //   66: getfield g : Lcom/allinone/callerid/b/i$c;
    //   69: aload #5
    //   71: ldc 2131297361
    //   73: invokevirtual findViewById : (I)Landroid/view/View;
    //   76: checkcast android/widget/ImageView
    //   79: putfield c : Landroid/widget/ImageView;
    //   82: aload_0
    //   83: getfield g : Lcom/allinone/callerid/b/i$c;
    //   86: aload #5
    //   88: ldc 2131297359
    //   90: invokevirtual findViewById : (I)Landroid/view/View;
    //   93: checkcast android/widget/TextView
    //   96: putfield d : Landroid/widget/TextView;
    //   99: aload_0
    //   100: getfield g : Lcom/allinone/callerid/b/i$c;
    //   103: getfield d : Landroid/widget/TextView;
    //   106: invokestatic a : ()Landroid/graphics/Typeface;
    //   109: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   112: aload_0
    //   113: getfield g : Lcom/allinone/callerid/b/i$c;
    //   116: getfield a : Landroid/widget/TextView;
    //   119: invokestatic b : ()Landroid/graphics/Typeface;
    //   122: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   125: aload_0
    //   126: getfield g : Lcom/allinone/callerid/b/i$c;
    //   129: getfield b : Landroid/widget/TextView;
    //   132: invokestatic b : ()Landroid/graphics/Typeface;
    //   135: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   138: aload_0
    //   139: getfield g : Lcom/allinone/callerid/b/i$c;
    //   142: aload #5
    //   144: ldc 2131297469
    //   146: invokevirtual findViewById : (I)Landroid/view/View;
    //   149: checkcast android/widget/FrameLayout
    //   152: putfield e : Landroid/widget/FrameLayout;
    //   155: aload_0
    //   156: getfield g : Lcom/allinone/callerid/b/i$c;
    //   159: aload #5
    //   161: ldc 2131297468
    //   163: invokevirtual findViewById : (I)Landroid/view/View;
    //   166: checkcast android/widget/LinearLayout
    //   169: putfield f : Landroid/widget/LinearLayout;
    //   172: aload_0
    //   173: getfield g : Lcom/allinone/callerid/b/i$c;
    //   176: aload #5
    //   178: ldc 2131297509
    //   180: invokevirtual findViewById : (I)Landroid/view/View;
    //   183: putfield g : Landroid/view/View;
    //   186: aload_0
    //   187: getfield g : Lcom/allinone/callerid/b/i$c;
    //   190: aload #5
    //   192: ldc 2131297497
    //   194: invokevirtual findViewById : (I)Landroid/view/View;
    //   197: putfield h : Landroid/view/View;
    //   200: aload_0
    //   201: getfield g : Lcom/allinone/callerid/b/i$c;
    //   204: getfield h : Landroid/view/View;
    //   207: bipush #8
    //   209: invokevirtual setVisibility : (I)V
    //   212: aload_0
    //   213: getfield g : Lcom/allinone/callerid/b/i$c;
    //   216: getfield e : Landroid/widget/FrameLayout;
    //   219: iload_1
    //   220: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   223: invokevirtual setTag : (Ljava/lang/Object;)V
    //   226: aload_0
    //   227: getfield g : Lcom/allinone/callerid/b/i$c;
    //   230: getfield e : Landroid/widget/FrameLayout;
    //   233: new com/allinone/callerid/b/i$a
    //   236: dup
    //   237: aload_0
    //   238: invokespecial <init> : (Lcom/allinone/callerid/b/i;)V
    //   241: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   244: aload_0
    //   245: getfield g : Lcom/allinone/callerid/b/i$c;
    //   248: aload #5
    //   250: ldc 2131297555
    //   252: invokevirtual findViewById : (I)Landroid/view/View;
    //   255: checkcast com/allinone/callerid/customview/MyListView
    //   258: putfield i : Lcom/allinone/callerid/customview/MyListView;
    //   261: aload #5
    //   263: aload_0
    //   264: getfield g : Lcom/allinone/callerid/b/i$c;
    //   267: invokevirtual setTag : (Ljava/lang/Object;)V
    //   270: goto -> 287
    //   273: aload_0
    //   274: aload_2
    //   275: invokevirtual getTag : ()Ljava/lang/Object;
    //   278: checkcast com/allinone/callerid/b/i$c
    //   281: putfield g : Lcom/allinone/callerid/b/i$c;
    //   284: aload_2
    //   285: astore #5
    //   287: aload_0
    //   288: getfield b : Ljava/util/List;
    //   291: iload_1
    //   292: invokeinterface get : (I)Ljava/lang/Object;
    //   297: checkcast com/allinone/callerid/search/CallLogBean
    //   300: astore #6
    //   302: aload #6
    //   304: ifnull -> 2597
    //   307: aload #6
    //   309: invokevirtual n : ()Ljava/lang/String;
    //   312: astore_3
    //   313: aload_3
    //   314: ifnull -> 328
    //   317: aload_3
    //   318: astore_2
    //   319: ldc ''
    //   321: aload_3
    //   322: invokevirtual equals : (Ljava/lang/Object;)Z
    //   325: ifeq -> 341
    //   328: aload_0
    //   329: getfield c : Landroid/content/Context;
    //   332: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   335: ldc 2131755830
    //   337: invokevirtual getString : (I)Ljava/lang/String;
    //   340: astore_2
    //   341: aload_0
    //   342: getfield g : Lcom/allinone/callerid/b/i$c;
    //   345: getfield c : Landroid/widget/ImageView;
    //   348: ldc 2131231148
    //   350: invokevirtual setImageResource : (I)V
    //   353: aload_0
    //   354: getfield g : Lcom/allinone/callerid/b/i$c;
    //   357: getfield a : Landroid/widget/TextView;
    //   360: aload_2
    //   361: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   364: aload #6
    //   366: invokevirtual m : ()Ljava/lang/String;
    //   369: ldc ':'
    //   371: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   374: astore_2
    //   375: aload_0
    //   376: getfield h : Ljava/lang/String;
    //   379: astore_3
    //   380: aload_3
    //   381: ifnull -> 550
    //   384: ldc ''
    //   386: aload_3
    //   387: invokevirtual equals : (Ljava/lang/Object;)Z
    //   390: ifne -> 550
    //   393: aload_2
    //   394: ifnull -> 490
    //   397: aload_2
    //   398: arraylength
    //   399: iconst_1
    //   400: if_icmple -> 490
    //   403: aload_0
    //   404: getfield g : Lcom/allinone/callerid/b/i$c;
    //   407: getfield b : Landroid/widget/TextView;
    //   410: bipush #8
    //   412: invokevirtual setVisibility : (I)V
    //   415: aload_0
    //   416: getfield g : Lcom/allinone/callerid/b/i$c;
    //   419: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   422: iconst_0
    //   423: invokevirtual setVisibility : (I)V
    //   426: new com/allinone/callerid/b/f
    //   429: astore_3
    //   430: aload_3
    //   431: aload_0
    //   432: getfield c : Landroid/content/Context;
    //   435: aload_2
    //   436: aload_0
    //   437: getfield h : Ljava/lang/String;
    //   440: invokespecial <init> : (Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V
    //   443: aload_0
    //   444: getfield g : Lcom/allinone/callerid/b/i$c;
    //   447: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   450: aload_3
    //   451: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   454: aload_0
    //   455: getfield g : Lcom/allinone/callerid/b/i$c;
    //   458: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   461: iconst_0
    //   462: invokevirtual setClickable : (Z)V
    //   465: aload_0
    //   466: getfield g : Lcom/allinone/callerid/b/i$c;
    //   469: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   472: iconst_0
    //   473: invokevirtual setPressed : (Z)V
    //   476: aload_0
    //   477: getfield g : Lcom/allinone/callerid/b/i$c;
    //   480: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   483: iconst_0
    //   484: invokevirtual setEnabled : (Z)V
    //   487: goto -> 693
    //   490: aload_0
    //   491: getfield g : Lcom/allinone/callerid/b/i$c;
    //   494: getfield b : Landroid/widget/TextView;
    //   497: iconst_0
    //   498: invokevirtual setVisibility : (I)V
    //   501: aload_0
    //   502: getfield g : Lcom/allinone/callerid/b/i$c;
    //   505: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   508: bipush #8
    //   510: invokevirtual setVisibility : (I)V
    //   513: aload_0
    //   514: getfield c : Landroid/content/Context;
    //   517: aload_2
    //   518: iconst_0
    //   519: aaload
    //   520: ldc_w ' '
    //   523: ldc ''
    //   525: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   528: aload_0
    //   529: getfield h : Ljava/lang/String;
    //   532: invokestatic a : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;
    //   535: astore_2
    //   536: aload_0
    //   537: getfield g : Lcom/allinone/callerid/b/i$c;
    //   540: getfield b : Landroid/widget/TextView;
    //   543: aload_2
    //   544: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   547: goto -> 693
    //   550: aload_2
    //   551: ifnull -> 648
    //   554: aload_2
    //   555: arraylength
    //   556: iconst_1
    //   557: if_icmple -> 648
    //   560: aload_0
    //   561: getfield g : Lcom/allinone/callerid/b/i$c;
    //   564: getfield b : Landroid/widget/TextView;
    //   567: bipush #8
    //   569: invokevirtual setVisibility : (I)V
    //   572: aload_0
    //   573: getfield g : Lcom/allinone/callerid/b/i$c;
    //   576: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   579: bipush #8
    //   581: invokevirtual setVisibility : (I)V
    //   584: new com/allinone/callerid/b/f
    //   587: astore_3
    //   588: aload_3
    //   589: aload_0
    //   590: getfield c : Landroid/content/Context;
    //   593: aload_2
    //   594: aload_0
    //   595: getfield h : Ljava/lang/String;
    //   598: invokespecial <init> : (Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V
    //   601: aload_0
    //   602: getfield g : Lcom/allinone/callerid/b/i$c;
    //   605: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   608: aload_3
    //   609: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   612: aload_0
    //   613: getfield g : Lcom/allinone/callerid/b/i$c;
    //   616: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   619: iconst_0
    //   620: invokevirtual setClickable : (Z)V
    //   623: aload_0
    //   624: getfield g : Lcom/allinone/callerid/b/i$c;
    //   627: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   630: iconst_0
    //   631: invokevirtual setPressed : (Z)V
    //   634: aload_0
    //   635: getfield g : Lcom/allinone/callerid/b/i$c;
    //   638: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   641: iconst_0
    //   642: invokevirtual setEnabled : (Z)V
    //   645: goto -> 693
    //   648: aload_0
    //   649: getfield g : Lcom/allinone/callerid/b/i$c;
    //   652: getfield b : Landroid/widget/TextView;
    //   655: bipush #8
    //   657: invokevirtual setVisibility : (I)V
    //   660: aload_0
    //   661: getfield g : Lcom/allinone/callerid/b/i$c;
    //   664: getfield i : Lcom/allinone/callerid/customview/MyListView;
    //   667: bipush #8
    //   669: invokevirtual setVisibility : (I)V
    //   672: aload_0
    //   673: getfield g : Lcom/allinone/callerid/b/i$c;
    //   676: getfield b : Landroid/widget/TextView;
    //   679: aload_2
    //   680: iconst_0
    //   681: aaload
    //   682: ldc_w ' '
    //   685: ldc ''
    //   687: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   690: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   693: aload_0
    //   694: getfield g : Lcom/allinone/callerid/b/i$c;
    //   697: getfield e : Landroid/widget/FrameLayout;
    //   700: astore_3
    //   701: new com/allinone/callerid/b/i$b
    //   704: astore_2
    //   705: aload_2
    //   706: aload_0
    //   707: iload_1
    //   708: invokespecial <init> : (Lcom/allinone/callerid/b/i;I)V
    //   711: aload_3
    //   712: aload_2
    //   713: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   716: aload_0
    //   717: getfield d : Landroid/app/Activity;
    //   720: getstatic android/provider/ContactsContract$Contacts.CONTENT_URI : Landroid/net/Uri;
    //   723: aload #6
    //   725: invokevirtual v : ()I
    //   728: i2l
    //   729: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   732: aload #6
    //   734: invokevirtual a : ()Ljava/lang/String;
    //   737: ldc 2131231148
    //   739: aload_0
    //   740: getfield g : Lcom/allinone/callerid/b/i$c;
    //   743: getfield c : Landroid/widget/ImageView;
    //   746: invokestatic c : (Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;ILandroid/widget/ImageView;)V
    //   749: aload_0
    //   750: getfield g : Lcom/allinone/callerid/b/i$c;
    //   753: getfield d : Landroid/widget/TextView;
    //   756: iconst_0
    //   757: invokevirtual setVisibility : (I)V
    //   760: goto -> 768
    //   763: astore_2
    //   764: aload_2
    //   765: invokevirtual printStackTrace : ()V
    //   768: aload #6
    //   770: invokevirtual n : ()Ljava/lang/String;
    //   773: ifnull -> 1019
    //   776: ldc ''
    //   778: aload #6
    //   780: invokevirtual n : ()Ljava/lang/String;
    //   783: invokevirtual equals : (Ljava/lang/Object;)Z
    //   786: ifne -> 1019
    //   789: aload #6
    //   791: invokevirtual n : ()Ljava/lang/String;
    //   794: invokevirtual length : ()I
    //   797: ifle -> 1019
    //   800: aload #6
    //   802: invokevirtual n : ()Ljava/lang/String;
    //   805: iconst_0
    //   806: invokevirtual charAt : (I)C
    //   809: istore #7
    //   811: iload #7
    //   813: bipush #65
    //   815: if_icmplt -> 825
    //   818: iload #7
    //   820: bipush #90
    //   822: if_icmple -> 839
    //   825: iload #7
    //   827: bipush #97
    //   829: if_icmplt -> 883
    //   832: iload #7
    //   834: bipush #122
    //   836: if_icmpgt -> 883
    //   839: new java/lang/StringBuilder
    //   842: astore_2
    //   843: aload_2
    //   844: invokespecial <init> : ()V
    //   847: aload_2
    //   848: ldc ''
    //   850: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   853: pop
    //   854: aload_2
    //   855: iload #7
    //   857: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   860: pop
    //   861: aload_2
    //   862: invokevirtual toString : ()Ljava/lang/String;
    //   865: astore_2
    //   866: aload_0
    //   867: getfield g : Lcom/allinone/callerid/b/i$c;
    //   870: getfield d : Landroid/widget/TextView;
    //   873: aload_2
    //   874: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   877: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   880: goto -> 1051
    //   883: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   886: aload #6
    //   888: invokevirtual n : ()Ljava/lang/String;
    //   891: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   894: iconst_0
    //   895: invokevirtual get : (I)Ljava/lang/Object;
    //   898: checkcast com/allinone/callerid/util/v$a
    //   901: getfield c : Ljava/lang/String;
    //   904: astore_2
    //   905: aload_2
    //   906: ifnull -> 997
    //   909: ldc ''
    //   911: aload_2
    //   912: invokevirtual equals : (Ljava/lang/Object;)Z
    //   915: ifne -> 997
    //   918: aload_2
    //   919: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   922: iconst_0
    //   923: invokevirtual charAt : (I)C
    //   926: istore #7
    //   928: new java/lang/StringBuilder
    //   931: astore_2
    //   932: aload_2
    //   933: invokespecial <init> : ()V
    //   936: aload_2
    //   937: iload #7
    //   939: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   942: pop
    //   943: aload_2
    //   944: ldc ''
    //   946: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   949: pop
    //   950: aload_2
    //   951: invokevirtual toString : ()Ljava/lang/String;
    //   954: ldc_w '[0-9]'
    //   957: invokevirtual matches : (Ljava/lang/String;)Z
    //   960: ifeq -> 979
    //   963: aload_0
    //   964: getfield g : Lcom/allinone/callerid/b/i$c;
    //   967: getfield d : Landroid/widget/TextView;
    //   970: ldc_w '#'
    //   973: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   976: goto -> 1051
    //   979: aload_0
    //   980: getfield g : Lcom/allinone/callerid/b/i$c;
    //   983: getfield d : Landroid/widget/TextView;
    //   986: iload #7
    //   988: invokestatic valueOf : (C)Ljava/lang/String;
    //   991: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   994: goto -> 1051
    //   997: aload_0
    //   998: getfield g : Lcom/allinone/callerid/b/i$c;
    //   1001: getfield d : Landroid/widget/TextView;
    //   1004: aload #6
    //   1006: invokevirtual n : ()Ljava/lang/String;
    //   1009: iconst_0
    //   1010: invokevirtual charAt : (I)C
    //   1013: invokevirtual setText : (I)V
    //   1016: goto -> 1051
    //   1019: aload_0
    //   1020: getfield g : Lcom/allinone/callerid/b/i$c;
    //   1023: getfield d : Landroid/widget/TextView;
    //   1026: bipush #8
    //   1028: invokevirtual setVisibility : (I)V
    //   1031: goto -> 1051
    //   1034: astore_2
    //   1035: aload_0
    //   1036: getfield g : Lcom/allinone/callerid/b/i$c;
    //   1039: getfield d : Landroid/widget/TextView;
    //   1042: bipush #8
    //   1044: invokevirtual setVisibility : (I)V
    //   1047: aload_2
    //   1048: invokevirtual printStackTrace : ()V
    //   1051: aload_0
    //   1052: getfield b : Ljava/util/List;
    //   1055: astore_2
    //   1056: aload_2
    //   1057: ifnull -> 2176
    //   1060: aload_2
    //   1061: invokeinterface size : ()I
    //   1066: iconst_1
    //   1067: if_icmple -> 2176
    //   1070: iload_1
    //   1071: ifle -> 2176
    //   1074: aload_0
    //   1075: getfield b : Ljava/util/List;
    //   1078: iload_1
    //   1079: iconst_1
    //   1080: isub
    //   1081: invokeinterface get : (I)Ljava/lang/Object;
    //   1086: checkcast com/allinone/callerid/search/CallLogBean
    //   1089: invokevirtual n : ()Ljava/lang/String;
    //   1092: astore_2
    //   1093: aload_0
    //   1094: getfield b : Ljava/util/List;
    //   1097: iload_1
    //   1098: invokeinterface get : (I)Ljava/lang/Object;
    //   1103: checkcast com/allinone/callerid/search/CallLogBean
    //   1106: invokevirtual n : ()Ljava/lang/String;
    //   1109: astore_3
    //   1110: aload_2
    //   1111: ifnull -> 1244
    //   1114: ldc ''
    //   1116: aload_2
    //   1117: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1120: ifne -> 1244
    //   1123: aload_2
    //   1124: iconst_0
    //   1125: invokevirtual charAt : (I)C
    //   1128: istore #7
    //   1130: iload #7
    //   1132: bipush #65
    //   1134: if_icmplt -> 1144
    //   1137: iload #7
    //   1139: bipush #90
    //   1141: if_icmple -> 1158
    //   1144: iload #7
    //   1146: bipush #97
    //   1148: if_icmplt -> 1191
    //   1151: iload #7
    //   1153: bipush #122
    //   1155: if_icmpgt -> 1191
    //   1158: new java/lang/StringBuilder
    //   1161: astore_2
    //   1162: aload_2
    //   1163: invokespecial <init> : ()V
    //   1166: aload_2
    //   1167: ldc ''
    //   1169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1172: pop
    //   1173: aload_2
    //   1174: iload #7
    //   1176: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1179: pop
    //   1180: aload_2
    //   1181: invokevirtual toString : ()Ljava/lang/String;
    //   1184: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1187: astore_2
    //   1188: goto -> 1247
    //   1191: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1194: aload_2
    //   1195: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1198: iconst_0
    //   1199: invokevirtual get : (I)Ljava/lang/Object;
    //   1202: checkcast com/allinone/callerid/util/v$a
    //   1205: getfield c : Ljava/lang/String;
    //   1208: iconst_0
    //   1209: invokevirtual charAt : (I)C
    //   1212: istore #7
    //   1214: new java/lang/StringBuilder
    //   1217: astore_2
    //   1218: aload_2
    //   1219: invokespecial <init> : ()V
    //   1222: aload_2
    //   1223: ldc ''
    //   1225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1228: pop
    //   1229: aload_2
    //   1230: iload #7
    //   1232: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1235: pop
    //   1236: aload_2
    //   1237: invokevirtual toString : ()Ljava/lang/String;
    //   1240: astore_2
    //   1241: goto -> 1247
    //   1244: ldc ''
    //   1246: astore_2
    //   1247: aload_3
    //   1248: ifnull -> 1381
    //   1251: ldc ''
    //   1253: aload_3
    //   1254: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1257: ifne -> 1381
    //   1260: aload_3
    //   1261: iconst_0
    //   1262: invokevirtual charAt : (I)C
    //   1265: istore #7
    //   1267: iload #7
    //   1269: bipush #65
    //   1271: if_icmplt -> 1281
    //   1274: iload #7
    //   1276: bipush #90
    //   1278: if_icmple -> 1295
    //   1281: iload #7
    //   1283: bipush #97
    //   1285: if_icmplt -> 1328
    //   1288: iload #7
    //   1290: bipush #122
    //   1292: if_icmpgt -> 1328
    //   1295: new java/lang/StringBuilder
    //   1298: astore_3
    //   1299: aload_3
    //   1300: invokespecial <init> : ()V
    //   1303: aload_3
    //   1304: ldc ''
    //   1306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1309: pop
    //   1310: aload_3
    //   1311: iload #7
    //   1313: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1316: pop
    //   1317: aload_3
    //   1318: invokevirtual toString : ()Ljava/lang/String;
    //   1321: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1324: astore_3
    //   1325: goto -> 1384
    //   1328: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1331: aload_3
    //   1332: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1335: iconst_0
    //   1336: invokevirtual get : (I)Ljava/lang/Object;
    //   1339: checkcast com/allinone/callerid/util/v$a
    //   1342: getfield c : Ljava/lang/String;
    //   1345: iconst_0
    //   1346: invokevirtual charAt : (I)C
    //   1349: istore #7
    //   1351: new java/lang/StringBuilder
    //   1354: astore_3
    //   1355: aload_3
    //   1356: invokespecial <init> : ()V
    //   1359: aload_3
    //   1360: ldc ''
    //   1362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1365: pop
    //   1366: aload_3
    //   1367: iload #7
    //   1369: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1372: pop
    //   1373: aload_3
    //   1374: invokevirtual toString : ()Ljava/lang/String;
    //   1377: astore_3
    //   1378: goto -> 1384
    //   1381: ldc ''
    //   1383: astore_3
    //   1384: aload_3
    //   1385: aload_2
    //   1386: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1389: ifeq -> 1785
    //   1392: aload_0
    //   1393: getfield g : Lcom/allinone/callerid/b/i$c;
    //   1396: getfield g : Landroid/view/View;
    //   1399: bipush #8
    //   1401: invokevirtual setVisibility : (I)V
    //   1404: aload_0
    //   1405: getfield g : Lcom/allinone/callerid/b/i$c;
    //   1408: getfield d : Landroid/widget/TextView;
    //   1411: bipush #8
    //   1413: invokevirtual setVisibility : (I)V
    //   1416: iload_1
    //   1417: aload_0
    //   1418: getfield b : Ljava/util/List;
    //   1421: invokeinterface size : ()I
    //   1426: iconst_1
    //   1427: isub
    //   1428: if_icmpeq -> 1771
    //   1431: aload_0
    //   1432: getfield b : Ljava/util/List;
    //   1435: iload_1
    //   1436: iconst_1
    //   1437: iadd
    //   1438: invokeinterface get : (I)Ljava/lang/Object;
    //   1443: checkcast com/allinone/callerid/search/CallLogBean
    //   1446: invokevirtual n : ()Ljava/lang/String;
    //   1449: astore_2
    //   1450: aload_0
    //   1451: getfield b : Ljava/util/List;
    //   1454: iload_1
    //   1455: invokeinterface get : (I)Ljava/lang/Object;
    //   1460: checkcast com/allinone/callerid/search/CallLogBean
    //   1463: invokevirtual n : ()Ljava/lang/String;
    //   1466: astore #6
    //   1468: aload_2
    //   1469: ifnull -> 1602
    //   1472: ldc ''
    //   1474: aload_2
    //   1475: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1478: ifne -> 1602
    //   1481: aload_2
    //   1482: iconst_0
    //   1483: invokevirtual charAt : (I)C
    //   1486: istore #7
    //   1488: iload #7
    //   1490: bipush #65
    //   1492: if_icmplt -> 1502
    //   1495: iload #7
    //   1497: bipush #90
    //   1499: if_icmple -> 1516
    //   1502: iload #7
    //   1504: bipush #97
    //   1506: if_icmplt -> 1549
    //   1509: iload #7
    //   1511: bipush #122
    //   1513: if_icmpgt -> 1549
    //   1516: new java/lang/StringBuilder
    //   1519: astore_2
    //   1520: aload_2
    //   1521: invokespecial <init> : ()V
    //   1524: aload_2
    //   1525: ldc ''
    //   1527: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1530: pop
    //   1531: aload_2
    //   1532: iload #7
    //   1534: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1537: pop
    //   1538: aload_2
    //   1539: invokevirtual toString : ()Ljava/lang/String;
    //   1542: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1545: astore_2
    //   1546: goto -> 1605
    //   1549: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1552: aload_2
    //   1553: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1556: iconst_0
    //   1557: invokevirtual get : (I)Ljava/lang/Object;
    //   1560: checkcast com/allinone/callerid/util/v$a
    //   1563: getfield c : Ljava/lang/String;
    //   1566: iconst_0
    //   1567: invokevirtual charAt : (I)C
    //   1570: istore #7
    //   1572: new java/lang/StringBuilder
    //   1575: astore_2
    //   1576: aload_2
    //   1577: invokespecial <init> : ()V
    //   1580: aload_2
    //   1581: ldc ''
    //   1583: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1586: pop
    //   1587: aload_2
    //   1588: iload #7
    //   1590: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1593: pop
    //   1594: aload_2
    //   1595: invokevirtual toString : ()Ljava/lang/String;
    //   1598: astore_2
    //   1599: goto -> 1605
    //   1602: ldc ''
    //   1604: astore_2
    //   1605: aload #4
    //   1607: astore_3
    //   1608: aload #6
    //   1610: ifnull -> 1746
    //   1613: aload #4
    //   1615: astore_3
    //   1616: ldc ''
    //   1618: aload #6
    //   1620: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1623: ifne -> 1746
    //   1626: aload #6
    //   1628: iconst_0
    //   1629: invokevirtual charAt : (I)C
    //   1632: istore #7
    //   1634: iload #7
    //   1636: bipush #65
    //   1638: if_icmplt -> 1648
    //   1641: iload #7
    //   1643: bipush #90
    //   1645: if_icmple -> 1662
    //   1648: iload #7
    //   1650: bipush #97
    //   1652: if_icmplt -> 1695
    //   1655: iload #7
    //   1657: bipush #122
    //   1659: if_icmpgt -> 1695
    //   1662: new java/lang/StringBuilder
    //   1665: astore_3
    //   1666: aload_3
    //   1667: invokespecial <init> : ()V
    //   1670: aload_3
    //   1671: ldc ''
    //   1673: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1676: pop
    //   1677: aload_3
    //   1678: iload #7
    //   1680: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1683: pop
    //   1684: aload_3
    //   1685: invokevirtual toString : ()Ljava/lang/String;
    //   1688: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1691: astore_3
    //   1692: goto -> 1746
    //   1695: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1698: aload #6
    //   1700: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1703: iconst_0
    //   1704: invokevirtual get : (I)Ljava/lang/Object;
    //   1707: checkcast com/allinone/callerid/util/v$a
    //   1710: getfield c : Ljava/lang/String;
    //   1713: iconst_0
    //   1714: invokevirtual charAt : (I)C
    //   1717: istore #7
    //   1719: new java/lang/StringBuilder
    //   1722: astore_3
    //   1723: aload_3
    //   1724: invokespecial <init> : ()V
    //   1727: aload_3
    //   1728: ldc ''
    //   1730: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1733: pop
    //   1734: aload_3
    //   1735: iload #7
    //   1737: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1740: pop
    //   1741: aload_3
    //   1742: invokevirtual toString : ()Ljava/lang/String;
    //   1745: astore_3
    //   1746: aload_2
    //   1747: aload_3
    //   1748: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1751: ifeq -> 1757
    //   1754: goto -> 2597
    //   1757: aload_0
    //   1758: getfield g : Lcom/allinone/callerid/b/i$c;
    //   1761: getfield h : Landroid/view/View;
    //   1764: iconst_0
    //   1765: invokevirtual setVisibility : (I)V
    //   1768: goto -> 2597
    //   1771: aload_0
    //   1772: getfield g : Lcom/allinone/callerid/b/i$c;
    //   1775: getfield h : Landroid/view/View;
    //   1778: iconst_0
    //   1779: invokevirtual setVisibility : (I)V
    //   1782: goto -> 2597
    //   1785: aload_0
    //   1786: getfield g : Lcom/allinone/callerid/b/i$c;
    //   1789: getfield d : Landroid/widget/TextView;
    //   1792: iconst_0
    //   1793: invokevirtual setVisibility : (I)V
    //   1796: aload_0
    //   1797: getfield g : Lcom/allinone/callerid/b/i$c;
    //   1800: getfield g : Landroid/view/View;
    //   1803: iconst_0
    //   1804: invokevirtual setVisibility : (I)V
    //   1807: iload_1
    //   1808: aload_0
    //   1809: getfield b : Ljava/util/List;
    //   1812: invokeinterface size : ()I
    //   1817: iconst_1
    //   1818: isub
    //   1819: if_icmpeq -> 2162
    //   1822: aload_0
    //   1823: getfield b : Ljava/util/List;
    //   1826: iload_1
    //   1827: iconst_1
    //   1828: iadd
    //   1829: invokeinterface get : (I)Ljava/lang/Object;
    //   1834: checkcast com/allinone/callerid/search/CallLogBean
    //   1837: invokevirtual n : ()Ljava/lang/String;
    //   1840: astore_2
    //   1841: aload_0
    //   1842: getfield b : Ljava/util/List;
    //   1845: iload_1
    //   1846: invokeinterface get : (I)Ljava/lang/Object;
    //   1851: checkcast com/allinone/callerid/search/CallLogBean
    //   1854: invokevirtual n : ()Ljava/lang/String;
    //   1857: astore #6
    //   1859: aload_2
    //   1860: ifnull -> 1993
    //   1863: ldc ''
    //   1865: aload_2
    //   1866: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1869: ifne -> 1993
    //   1872: aload_2
    //   1873: iconst_0
    //   1874: invokevirtual charAt : (I)C
    //   1877: istore #7
    //   1879: iload #7
    //   1881: bipush #65
    //   1883: if_icmplt -> 1893
    //   1886: iload #7
    //   1888: bipush #90
    //   1890: if_icmple -> 1907
    //   1893: iload #7
    //   1895: bipush #97
    //   1897: if_icmplt -> 1940
    //   1900: iload #7
    //   1902: bipush #122
    //   1904: if_icmpgt -> 1940
    //   1907: new java/lang/StringBuilder
    //   1910: astore_2
    //   1911: aload_2
    //   1912: invokespecial <init> : ()V
    //   1915: aload_2
    //   1916: ldc ''
    //   1918: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1921: pop
    //   1922: aload_2
    //   1923: iload #7
    //   1925: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1928: pop
    //   1929: aload_2
    //   1930: invokevirtual toString : ()Ljava/lang/String;
    //   1933: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1936: astore_2
    //   1937: goto -> 1996
    //   1940: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1943: aload_2
    //   1944: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1947: iconst_0
    //   1948: invokevirtual get : (I)Ljava/lang/Object;
    //   1951: checkcast com/allinone/callerid/util/v$a
    //   1954: getfield c : Ljava/lang/String;
    //   1957: iconst_0
    //   1958: invokevirtual charAt : (I)C
    //   1961: istore #7
    //   1963: new java/lang/StringBuilder
    //   1966: astore_2
    //   1967: aload_2
    //   1968: invokespecial <init> : ()V
    //   1971: aload_2
    //   1972: ldc ''
    //   1974: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1977: pop
    //   1978: aload_2
    //   1979: iload #7
    //   1981: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1984: pop
    //   1985: aload_2
    //   1986: invokevirtual toString : ()Ljava/lang/String;
    //   1989: astore_2
    //   1990: goto -> 1996
    //   1993: ldc ''
    //   1995: astore_2
    //   1996: aload #4
    //   1998: astore_3
    //   1999: aload #6
    //   2001: ifnull -> 2137
    //   2004: aload #4
    //   2006: astore_3
    //   2007: ldc ''
    //   2009: aload #6
    //   2011: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2014: ifne -> 2137
    //   2017: aload #6
    //   2019: iconst_0
    //   2020: invokevirtual charAt : (I)C
    //   2023: istore #7
    //   2025: iload #7
    //   2027: bipush #65
    //   2029: if_icmplt -> 2039
    //   2032: iload #7
    //   2034: bipush #90
    //   2036: if_icmple -> 2053
    //   2039: iload #7
    //   2041: bipush #97
    //   2043: if_icmplt -> 2086
    //   2046: iload #7
    //   2048: bipush #122
    //   2050: if_icmpgt -> 2086
    //   2053: new java/lang/StringBuilder
    //   2056: astore_3
    //   2057: aload_3
    //   2058: invokespecial <init> : ()V
    //   2061: aload_3
    //   2062: ldc ''
    //   2064: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2067: pop
    //   2068: aload_3
    //   2069: iload #7
    //   2071: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2074: pop
    //   2075: aload_3
    //   2076: invokevirtual toString : ()Ljava/lang/String;
    //   2079: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   2082: astore_3
    //   2083: goto -> 2137
    //   2086: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   2089: aload #6
    //   2091: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   2094: iconst_0
    //   2095: invokevirtual get : (I)Ljava/lang/Object;
    //   2098: checkcast com/allinone/callerid/util/v$a
    //   2101: getfield c : Ljava/lang/String;
    //   2104: iconst_0
    //   2105: invokevirtual charAt : (I)C
    //   2108: istore #7
    //   2110: new java/lang/StringBuilder
    //   2113: astore_3
    //   2114: aload_3
    //   2115: invokespecial <init> : ()V
    //   2118: aload_3
    //   2119: ldc ''
    //   2121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2124: pop
    //   2125: aload_3
    //   2126: iload #7
    //   2128: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2131: pop
    //   2132: aload_3
    //   2133: invokevirtual toString : ()Ljava/lang/String;
    //   2136: astore_3
    //   2137: aload_2
    //   2138: aload_3
    //   2139: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2142: ifeq -> 2148
    //   2145: goto -> 2597
    //   2148: aload_0
    //   2149: getfield g : Lcom/allinone/callerid/b/i$c;
    //   2152: getfield h : Landroid/view/View;
    //   2155: iconst_0
    //   2156: invokevirtual setVisibility : (I)V
    //   2159: goto -> 2597
    //   2162: aload_0
    //   2163: getfield g : Lcom/allinone/callerid/b/i$c;
    //   2166: getfield h : Landroid/view/View;
    //   2169: iconst_0
    //   2170: invokevirtual setVisibility : (I)V
    //   2173: goto -> 2597
    //   2176: aload_0
    //   2177: getfield b : Ljava/util/List;
    //   2180: astore_2
    //   2181: aload_2
    //   2182: ifnull -> 2206
    //   2185: aload_2
    //   2186: invokeinterface size : ()I
    //   2191: iconst_1
    //   2192: if_icmpne -> 2206
    //   2195: aload_0
    //   2196: getfield g : Lcom/allinone/callerid/b/i$c;
    //   2199: getfield h : Landroid/view/View;
    //   2202: iconst_0
    //   2203: invokevirtual setVisibility : (I)V
    //   2206: aload_0
    //   2207: getfield b : Ljava/util/List;
    //   2210: astore_2
    //   2211: aload_2
    //   2212: ifnull -> 2597
    //   2215: aload_2
    //   2216: invokeinterface size : ()I
    //   2221: iconst_1
    //   2222: if_icmple -> 2597
    //   2225: iload_1
    //   2226: ifne -> 2597
    //   2229: aload_0
    //   2230: getfield g : Lcom/allinone/callerid/b/i$c;
    //   2233: getfield g : Landroid/view/View;
    //   2236: iconst_0
    //   2237: invokevirtual setVisibility : (I)V
    //   2240: aload_0
    //   2241: getfield b : Ljava/util/List;
    //   2244: iload_1
    //   2245: iconst_1
    //   2246: iadd
    //   2247: invokeinterface get : (I)Ljava/lang/Object;
    //   2252: checkcast com/allinone/callerid/search/CallLogBean
    //   2255: invokevirtual n : ()Ljava/lang/String;
    //   2258: astore_2
    //   2259: aload_0
    //   2260: getfield b : Ljava/util/List;
    //   2263: iload_1
    //   2264: invokeinterface get : (I)Ljava/lang/Object;
    //   2269: checkcast com/allinone/callerid/search/CallLogBean
    //   2272: invokevirtual n : ()Ljava/lang/String;
    //   2275: astore #6
    //   2277: aload_2
    //   2278: ifnull -> 2411
    //   2281: ldc ''
    //   2283: aload_2
    //   2284: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2287: ifne -> 2411
    //   2290: aload_2
    //   2291: iconst_0
    //   2292: invokevirtual charAt : (I)C
    //   2295: istore #7
    //   2297: iload #7
    //   2299: bipush #65
    //   2301: if_icmplt -> 2311
    //   2304: iload #7
    //   2306: bipush #90
    //   2308: if_icmple -> 2325
    //   2311: iload #7
    //   2313: bipush #97
    //   2315: if_icmplt -> 2358
    //   2318: iload #7
    //   2320: bipush #122
    //   2322: if_icmpgt -> 2358
    //   2325: new java/lang/StringBuilder
    //   2328: astore_2
    //   2329: aload_2
    //   2330: invokespecial <init> : ()V
    //   2333: aload_2
    //   2334: ldc ''
    //   2336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2339: pop
    //   2340: aload_2
    //   2341: iload #7
    //   2343: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2346: pop
    //   2347: aload_2
    //   2348: invokevirtual toString : ()Ljava/lang/String;
    //   2351: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   2354: astore_2
    //   2355: goto -> 2414
    //   2358: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   2361: aload_2
    //   2362: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   2365: iconst_0
    //   2366: invokevirtual get : (I)Ljava/lang/Object;
    //   2369: checkcast com/allinone/callerid/util/v$a
    //   2372: getfield c : Ljava/lang/String;
    //   2375: iconst_0
    //   2376: invokevirtual charAt : (I)C
    //   2379: istore #7
    //   2381: new java/lang/StringBuilder
    //   2384: astore_2
    //   2385: aload_2
    //   2386: invokespecial <init> : ()V
    //   2389: aload_2
    //   2390: ldc ''
    //   2392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2395: pop
    //   2396: aload_2
    //   2397: iload #7
    //   2399: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2402: pop
    //   2403: aload_2
    //   2404: invokevirtual toString : ()Ljava/lang/String;
    //   2407: astore_2
    //   2408: goto -> 2414
    //   2411: ldc ''
    //   2413: astore_2
    //   2414: aload #4
    //   2416: astore_3
    //   2417: aload #6
    //   2419: ifnull -> 2555
    //   2422: aload #4
    //   2424: astore_3
    //   2425: ldc ''
    //   2427: aload #6
    //   2429: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2432: ifne -> 2555
    //   2435: aload #6
    //   2437: iconst_0
    //   2438: invokevirtual charAt : (I)C
    //   2441: istore #7
    //   2443: iload #7
    //   2445: bipush #65
    //   2447: if_icmplt -> 2457
    //   2450: iload #7
    //   2452: bipush #90
    //   2454: if_icmple -> 2471
    //   2457: iload #7
    //   2459: bipush #97
    //   2461: if_icmplt -> 2504
    //   2464: iload #7
    //   2466: bipush #122
    //   2468: if_icmpgt -> 2504
    //   2471: new java/lang/StringBuilder
    //   2474: astore_3
    //   2475: aload_3
    //   2476: invokespecial <init> : ()V
    //   2479: aload_3
    //   2480: ldc ''
    //   2482: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2485: pop
    //   2486: aload_3
    //   2487: iload #7
    //   2489: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2492: pop
    //   2493: aload_3
    //   2494: invokevirtual toString : ()Ljava/lang/String;
    //   2497: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   2500: astore_3
    //   2501: goto -> 2555
    //   2504: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   2507: aload #6
    //   2509: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   2512: iconst_0
    //   2513: invokevirtual get : (I)Ljava/lang/Object;
    //   2516: checkcast com/allinone/callerid/util/v$a
    //   2519: getfield c : Ljava/lang/String;
    //   2522: iconst_0
    //   2523: invokevirtual charAt : (I)C
    //   2526: istore #7
    //   2528: new java/lang/StringBuilder
    //   2531: astore_3
    //   2532: aload_3
    //   2533: invokespecial <init> : ()V
    //   2536: aload_3
    //   2537: ldc ''
    //   2539: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2542: pop
    //   2543: aload_3
    //   2544: iload #7
    //   2546: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2549: pop
    //   2550: aload_3
    //   2551: invokevirtual toString : ()Ljava/lang/String;
    //   2554: astore_3
    //   2555: aload_2
    //   2556: aload_3
    //   2557: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2560: ifeq -> 2566
    //   2563: goto -> 2597
    //   2566: aload_0
    //   2567: getfield g : Lcom/allinone/callerid/b/i$c;
    //   2570: getfield h : Landroid/view/View;
    //   2573: iconst_0
    //   2574: invokevirtual setVisibility : (I)V
    //   2577: goto -> 2597
    //   2580: astore_2
    //   2581: aload_0
    //   2582: getfield g : Lcom/allinone/callerid/b/i$c;
    //   2585: getfield d : Landroid/widget/TextView;
    //   2588: bipush #8
    //   2590: invokevirtual setVisibility : (I)V
    //   2593: aload_2
    //   2594: invokevirtual printStackTrace : ()V
    //   2597: aload #5
    //   2599: areturn
    // Exception table:
    //   from	to	target	type
    //   307	313	763	java/lang/Exception
    //   319	328	763	java/lang/Exception
    //   328	341	763	java/lang/Exception
    //   341	380	763	java/lang/Exception
    //   384	393	763	java/lang/Exception
    //   397	487	763	java/lang/Exception
    //   490	547	763	java/lang/Exception
    //   554	645	763	java/lang/Exception
    //   648	693	763	java/lang/Exception
    //   693	760	763	java/lang/Exception
    //   768	811	1034	java/lang/Exception
    //   839	880	1034	java/lang/Exception
    //   883	905	1034	java/lang/Exception
    //   909	976	1034	java/lang/Exception
    //   979	994	1034	java/lang/Exception
    //   997	1016	1034	java/lang/Exception
    //   1019	1031	1034	java/lang/Exception
    //   1051	1056	2580	java/lang/Exception
    //   1060	1070	2580	java/lang/Exception
    //   1074	1110	2580	java/lang/Exception
    //   1114	1130	2580	java/lang/Exception
    //   1158	1188	2580	java/lang/Exception
    //   1191	1241	2580	java/lang/Exception
    //   1251	1267	2580	java/lang/Exception
    //   1295	1325	2580	java/lang/Exception
    //   1328	1378	2580	java/lang/Exception
    //   1384	1468	2580	java/lang/Exception
    //   1472	1488	2580	java/lang/Exception
    //   1516	1546	2580	java/lang/Exception
    //   1549	1599	2580	java/lang/Exception
    //   1616	1634	2580	java/lang/Exception
    //   1662	1692	2580	java/lang/Exception
    //   1695	1746	2580	java/lang/Exception
    //   1746	1754	2580	java/lang/Exception
    //   1757	1768	2580	java/lang/Exception
    //   1771	1782	2580	java/lang/Exception
    //   1785	1859	2580	java/lang/Exception
    //   1863	1879	2580	java/lang/Exception
    //   1907	1937	2580	java/lang/Exception
    //   1940	1990	2580	java/lang/Exception
    //   2007	2025	2580	java/lang/Exception
    //   2053	2083	2580	java/lang/Exception
    //   2086	2137	2580	java/lang/Exception
    //   2137	2145	2580	java/lang/Exception
    //   2148	2159	2580	java/lang/Exception
    //   2162	2173	2580	java/lang/Exception
    //   2176	2181	2580	java/lang/Exception
    //   2185	2206	2580	java/lang/Exception
    //   2206	2211	2580	java/lang/Exception
    //   2215	2225	2580	java/lang/Exception
    //   2229	2277	2580	java/lang/Exception
    //   2281	2297	2580	java/lang/Exception
    //   2325	2355	2580	java/lang/Exception
    //   2358	2408	2580	java/lang/Exception
    //   2425	2443	2580	java/lang/Exception
    //   2471	2501	2580	java/lang/Exception
    //   2504	2555	2580	java/lang/Exception
    //   2555	2563	2580	java/lang/Exception
    //   2566	2577	2580	java/lang/Exception
  }
  
  class a implements View.OnClickListener {
    a(i this$0) {}
    
    public void onClick(View param1View) {
      int j = ((Integer)param1View.getTag()).intValue();
      i.a(this.b).performItemClick((View)i.a(this.b), j, this.b.getItemId(j));
    }
  }
  
  class b implements View.OnClickListener {
    b(i this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      AdapterView.OnItemClickListener onItemClickListener = i.a(this.c).getOnItemClickListener();
      ListView listView = i.a(this.c);
      int j = this.b;
      onItemClickListener.onItemClick((AdapterView)listView, param1View, j, this.c.getItemId(j));
    }
  }
  
  public static class c {
    TextView a;
    
    TextView b;
    
    ImageView c;
    
    TextView d;
    
    FrameLayout e;
    
    LinearLayout f;
    
    View g;
    
    View h;
    
    MyListView i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */