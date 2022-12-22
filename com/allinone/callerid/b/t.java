package com.allinone.callerid.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.SpamCall;
import com.allinone.callerid.customview.MyListView;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.mvc.controller.recorder.RecordListActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.start.PermissionActivity;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class t extends RecyclerView.Adapter {
  private final Activity d;
  
  private boolean e;
  
  private List<CallLogBean> f;
  
  private LayoutInflater g;
  
  private HashMap<String, Integer> h;
  
  private ArrayList<SpamCall> i;
  
  private Context j;
  
  private boolean k;
  
  private int l;
  
  private int m;
  
  private boolean n;
  
  private final int o = 999;
  
  private final int p = 1001;
  
  private String q;
  
  private String r;
  
  private int s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private String w;
  
  private boolean x;
  
  private m y;
  
  private l z;
  
  public t(ArrayList<SpamCall> paramArrayList, Activity paramActivity) {
    this.j = (Context)paramActivity;
    ArrayList<SpamCall> arrayList = new ArrayList();
    this.i = arrayList;
    arrayList.addAll(paramArrayList);
    this.f = new ArrayList<CallLogBean>();
    this.g = LayoutInflater.from(this.j);
    this.d = paramActivity;
    this.k = c1.h(this.j.getApplicationContext());
    N();
  }
  
  private void L(View paramView, CallLogBean paramCallLogBean) {
    paramView.setOnClickListener(new i(this, paramCallLogBean));
  }
  
  private void N() {
    this.s = d1.a(this.j, 2130968855, 2131099719);
    this.t = d1.a(this.j, 2130968902, 2131099725);
    this.u = d1.a(this.j, 2130968858, 2131099729);
    this.v = d1.a(this.j, 2130968855, 2131099719);
    this.l = d1.b(this.j, 2130968700, 2131230906);
    this.m = d1.b(this.j, 2130968701, 2131230909);
    this.w = this.j.getResources().getString(2131755829);
  }
  
  public void A(l paraml) {
    this.z = paraml;
  }
  
  public void B(m paramm) {
    this.y = paramm;
  }
  
  public void K(List<SpamCall> paramList, boolean paramBoolean) {
    if (paramBoolean)
      this.i.clear(); 
    this.i.addAll(paramList);
  }
  
  public void M(List<CallLogBean> paramList, HashMap<String, Integer> paramHashMap) {
    List<CallLogBean> list = this.f;
    if (list != null) {
      list.clear();
      this.f.addAll(paramList);
    } 
    this.h = paramHashMap;
  }
  
  public void O(List<CallLogBean> paramList) {
    List<CallLogBean> list = this.f;
    if (list != null) {
      list.clear();
      this.f.addAll(paramList);
    } 
  }
  
  public void P(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public int d() {
    return this.f.size() + 1;
  }
  
  public int f(int paramInt) {
    return (paramInt == 0) ? 999 : 1001;
  }
  
  public void p(RecyclerView.b0 paramb0, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: invokevirtual f : (I)I
    //   5: istore_3
    //   6: iload_3
    //   7: sipush #999
    //   10: if_icmpeq -> 2057
    //   13: iload_3
    //   14: sipush #1001
    //   17: if_icmpeq -> 23
    //   20: goto -> 2370
    //   23: aload_1
    //   24: checkcast com/allinone/callerid/b/t$j
    //   27: astore #4
    //   29: aload_0
    //   30: getfield f : Ljava/util/List;
    //   33: iload_2
    //   34: iconst_1
    //   35: isub
    //   36: invokeinterface get : (I)Ljava/lang/Object;
    //   41: checkcast com/allinone/callerid/search/CallLogBean
    //   44: astore_1
    //   45: aload_1
    //   46: invokevirtual X : ()Z
    //   49: ifeq -> 74
    //   52: aload #4
    //   54: invokestatic M : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/FrameLayout;
    //   57: aload_0
    //   58: getfield j : Landroid/content/Context;
    //   61: ldc 2130968870
    //   63: ldc 2131099744
    //   65: invokestatic a : (Landroid/content/Context;II)I
    //   68: invokevirtual setBackgroundColor : (I)V
    //   71: goto -> 83
    //   74: aload #4
    //   76: invokestatic M : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/FrameLayout;
    //   79: aconst_null
    //   80: invokevirtual setBackground : (Landroid/graphics/drawable/Drawable;)V
    //   83: aload #4
    //   85: invokestatic N : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   88: astore #5
    //   90: ldc_w 2131231148
    //   93: istore_3
    //   94: aload #5
    //   96: ldc_w 2131231148
    //   99: invokevirtual setImageResource : (I)V
    //   102: aload #4
    //   104: invokestatic O : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   107: aload_0
    //   108: getfield s : I
    //   111: invokevirtual setTextColor : (I)V
    //   114: aload #4
    //   116: invokestatic P : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   119: aload_0
    //   120: getfield t : I
    //   123: invokevirtual setTextColor : (I)V
    //   126: aload #4
    //   128: invokestatic Q : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   131: aload_0
    //   132: getfield t : I
    //   135: invokevirtual setTextColor : (I)V
    //   138: aload #4
    //   140: invokestatic R : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   143: aload_0
    //   144: getfield t : I
    //   147: invokevirtual setTextColor : (I)V
    //   150: aload #4
    //   152: invokestatic S : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   155: aload_0
    //   156: getfield t : I
    //   159: invokevirtual setTextColor : (I)V
    //   162: aload #4
    //   164: invokestatic T : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   167: bipush #8
    //   169: invokevirtual setVisibility : (I)V
    //   172: aload #4
    //   174: invokestatic U : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   177: bipush #8
    //   179: invokevirtual setVisibility : (I)V
    //   182: aload #4
    //   184: invokestatic V : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   187: bipush #8
    //   189: invokevirtual setVisibility : (I)V
    //   192: aload #4
    //   194: invokestatic W : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   197: bipush #8
    //   199: invokevirtual setVisibility : (I)V
    //   202: aload #4
    //   204: invokestatic X : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   207: bipush #8
    //   209: invokevirtual setVisibility : (I)V
    //   212: aload #4
    //   214: invokestatic Y : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   217: bipush #8
    //   219: invokevirtual setVisibility : (I)V
    //   222: aload_0
    //   223: getfield k : Z
    //   226: istore #6
    //   228: iload #6
    //   230: ifeq -> 343
    //   233: aload_1
    //   234: invokevirtual C : ()Ljava/lang/String;
    //   237: ifnull -> 363
    //   240: aload_1
    //   241: invokevirtual C : ()Ljava/lang/String;
    //   244: ldc_w '0'
    //   247: invokevirtual equals : (Ljava/lang/Object;)Z
    //   250: ifeq -> 275
    //   253: aload #4
    //   255: invokestatic T : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   258: iconst_0
    //   259: invokevirtual setVisibility : (I)V
    //   262: aload #4
    //   264: invokestatic U : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   267: bipush #8
    //   269: invokevirtual setVisibility : (I)V
    //   272: goto -> 363
    //   275: aload_1
    //   276: invokevirtual C : ()Ljava/lang/String;
    //   279: ldc_w '1'
    //   282: invokevirtual equals : (Ljava/lang/Object;)Z
    //   285: ifeq -> 310
    //   288: aload #4
    //   290: invokestatic U : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   293: iconst_0
    //   294: invokevirtual setVisibility : (I)V
    //   297: aload #4
    //   299: invokestatic T : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   302: bipush #8
    //   304: invokevirtual setVisibility : (I)V
    //   307: goto -> 363
    //   310: aload #4
    //   312: invokestatic T : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   315: bipush #8
    //   317: invokevirtual setVisibility : (I)V
    //   320: aload #4
    //   322: invokestatic U : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   325: bipush #8
    //   327: invokevirtual setVisibility : (I)V
    //   330: goto -> 363
    //   333: astore #5
    //   335: aload #5
    //   337: invokevirtual printStackTrace : ()V
    //   340: goto -> 363
    //   343: aload #4
    //   345: invokestatic T : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   348: bipush #8
    //   350: invokevirtual setVisibility : (I)V
    //   353: aload #4
    //   355: invokestatic U : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   358: bipush #8
    //   360: invokevirtual setVisibility : (I)V
    //   363: aload_0
    //   364: aload_1
    //   365: invokevirtual g : ()Ljava/lang/String;
    //   368: putfield q : Ljava/lang/String;
    //   371: aload #4
    //   373: invokestatic Z : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   376: iconst_0
    //   377: invokevirtual setVisibility : (I)V
    //   380: aload #4
    //   382: invokestatic Z : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   385: aload_0
    //   386: getfield q : Ljava/lang/String;
    //   389: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   392: iload_2
    //   393: iconst_1
    //   394: if_icmpne -> 406
    //   397: aload #4
    //   399: invokestatic Z : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   402: iconst_0
    //   403: invokevirtual setVisibility : (I)V
    //   406: iload_2
    //   407: iconst_1
    //   408: if_icmple -> 516
    //   411: aload_0
    //   412: getfield f : Ljava/util/List;
    //   415: iload_2
    //   416: iconst_2
    //   417: isub
    //   418: invokeinterface get : (I)Ljava/lang/Object;
    //   423: checkcast com/allinone/callerid/search/CallLogBean
    //   426: invokevirtual g : ()Ljava/lang/String;
    //   429: astore #7
    //   431: aload_0
    //   432: aload #7
    //   434: putfield r : Ljava/lang/String;
    //   437: aload #7
    //   439: ifnull -> 516
    //   442: aload_0
    //   443: getfield q : Ljava/lang/String;
    //   446: astore #5
    //   448: aload #5
    //   450: ifnull -> 516
    //   453: aload #5
    //   455: aload #7
    //   457: invokevirtual equals : (Ljava/lang/Object;)Z
    //   460: ifeq -> 486
    //   463: aload #4
    //   465: invokestatic Z : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   468: bipush #8
    //   470: invokevirtual setVisibility : (I)V
    //   473: aload #4
    //   475: invokestatic Z : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   478: bipush #8
    //   480: invokevirtual setVisibility : (I)V
    //   483: goto -> 516
    //   486: aload #4
    //   488: invokestatic Z : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   491: iconst_0
    //   492: invokevirtual setVisibility : (I)V
    //   495: aload #4
    //   497: invokestatic Z : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   500: iconst_0
    //   501: invokevirtual setVisibility : (I)V
    //   504: aload #4
    //   506: invokestatic Z : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   509: aload_0
    //   510: getfield q : Ljava/lang/String;
    //   513: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   516: aload_1
    //   517: invokevirtual c : ()Ljava/lang/String;
    //   520: astore #5
    //   522: aload #5
    //   524: ifnull -> 598
    //   527: aload_1
    //   528: invokevirtual c : ()Ljava/lang/String;
    //   531: ldc_w ''
    //   534: invokevirtual equals : (Ljava/lang/Object;)Z
    //   537: ifne -> 598
    //   540: aload #4
    //   542: invokestatic S : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   545: iconst_0
    //   546: invokevirtual setVisibility : (I)V
    //   549: aload #4
    //   551: invokestatic S : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   554: astore #7
    //   556: new java/lang/StringBuilder
    //   559: astore #5
    //   561: aload #5
    //   563: invokespecial <init> : ()V
    //   566: aload #5
    //   568: aload_1
    //   569: invokevirtual c : ()Ljava/lang/String;
    //   572: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   575: pop
    //   576: aload #5
    //   578: ldc_w ' '
    //   581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: pop
    //   585: aload #7
    //   587: aload #5
    //   589: invokevirtual toString : ()Ljava/lang/String;
    //   592: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   595: goto -> 619
    //   598: aload #4
    //   600: invokestatic S : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   603: ldc_w ''
    //   606: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   609: aload #4
    //   611: invokestatic S : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   614: bipush #8
    //   616: invokevirtual setVisibility : (I)V
    //   619: aload_1
    //   620: invokevirtual y : ()Ljava/lang/String;
    //   623: astore #8
    //   625: aload_1
    //   626: invokevirtual N : ()Ljava/lang/String;
    //   629: astore #5
    //   631: aload_1
    //   632: invokevirtual x : ()Ljava/lang/String;
    //   635: astore #7
    //   637: aload #5
    //   639: ifnull -> 795
    //   642: ldc_w ''
    //   645: aload #5
    //   647: invokevirtual equals : (Ljava/lang/Object;)Z
    //   650: ifne -> 795
    //   653: aload #7
    //   655: ifnull -> 795
    //   658: ldc_w ''
    //   661: aload #7
    //   663: invokevirtual equals : (Ljava/lang/Object;)Z
    //   666: ifne -> 795
    //   669: aload_1
    //   670: invokevirtual T : ()Z
    //   673: ifne -> 782
    //   676: aload #4
    //   678: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   681: iconst_0
    //   682: invokevirtual setVisibility : (I)V
    //   685: aload #4
    //   687: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   690: aload_0
    //   691: getfield l : I
    //   694: invokevirtual setBackgroundResource : (I)V
    //   697: aload #4
    //   699: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   702: aload_0
    //   703: getfield u : I
    //   706: invokevirtual setTextColor : (I)V
    //   709: aload #4
    //   711: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   714: aload #5
    //   716: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   719: aload #4
    //   721: invokestatic O : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   724: aload_0
    //   725: getfield u : I
    //   728: invokevirtual setTextColor : (I)V
    //   731: aload #4
    //   733: invokestatic P : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   736: aload_0
    //   737: getfield u : I
    //   740: invokevirtual setTextColor : (I)V
    //   743: aload #4
    //   745: invokestatic Q : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   748: aload_0
    //   749: getfield u : I
    //   752: invokevirtual setTextColor : (I)V
    //   755: aload #4
    //   757: invokestatic R : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   760: aload_0
    //   761: getfield u : I
    //   764: invokevirtual setTextColor : (I)V
    //   767: aload #4
    //   769: invokestatic S : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   772: aload_0
    //   773: getfield u : I
    //   776: invokevirtual setTextColor : (I)V
    //   779: goto -> 937
    //   782: aload #4
    //   784: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   787: bipush #8
    //   789: invokevirtual setVisibility : (I)V
    //   792: goto -> 937
    //   795: aload_1
    //   796: invokevirtual n : ()Ljava/lang/String;
    //   799: astore #9
    //   801: aload #9
    //   803: ifnull -> 830
    //   806: ldc_w ''
    //   809: aload #9
    //   811: invokevirtual equals : (Ljava/lang/Object;)Z
    //   814: ifne -> 830
    //   817: aload #4
    //   819: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   822: bipush #8
    //   824: invokevirtual setVisibility : (I)V
    //   827: goto -> 937
    //   830: aload #8
    //   832: ifnull -> 903
    //   835: ldc_w ''
    //   838: aload #8
    //   840: invokevirtual equals : (Ljava/lang/Object;)Z
    //   843: ifne -> 903
    //   846: aload #4
    //   848: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   851: aload_0
    //   852: getfield m : I
    //   855: invokevirtual setBackgroundResource : (I)V
    //   858: aload #4
    //   860: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   863: iconst_0
    //   864: invokevirtual setVisibility : (I)V
    //   867: aload #4
    //   869: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   872: aload_0
    //   873: getfield v : I
    //   876: invokevirtual setTextColor : (I)V
    //   879: aload #4
    //   881: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   884: aload_0
    //   885: getfield j : Landroid/content/Context;
    //   888: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   891: ldc_w 2131755414
    //   894: invokevirtual getString : (I)Ljava/lang/String;
    //   897: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   900: goto -> 937
    //   903: aload #4
    //   905: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   908: bipush #8
    //   910: invokevirtual setVisibility : (I)V
    //   913: aload #4
    //   915: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   918: aload_0
    //   919: getfield l : I
    //   922: invokevirtual setBackgroundResource : (I)V
    //   925: aload #4
    //   927: invokestatic a0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   930: aload_0
    //   931: getfield u : I
    //   934: invokevirtual setTextColor : (I)V
    //   937: aload_1
    //   938: invokevirtual n : ()Ljava/lang/String;
    //   941: astore #10
    //   943: aload_1
    //   944: invokevirtual p : ()Ljava/lang/String;
    //   947: astore #9
    //   949: aload_1
    //   950: invokevirtual d : ()Ljava/lang/String;
    //   953: astore #11
    //   955: aload_1
    //   956: invokevirtual i : ()Ljava/lang/String;
    //   959: astore #12
    //   961: aload #10
    //   963: ifnull -> 993
    //   966: ldc_w ''
    //   969: aload #10
    //   971: invokevirtual equals : (Ljava/lang/Object;)Z
    //   974: ifeq -> 980
    //   977: goto -> 993
    //   980: aload #4
    //   982: invokestatic O : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   985: aload #10
    //   987: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   990: goto -> 1120
    //   993: aload #8
    //   995: ifnull -> 1022
    //   998: ldc_w ''
    //   1001: aload #8
    //   1003: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1006: ifne -> 1022
    //   1009: aload #4
    //   1011: invokestatic O : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1014: aload #8
    //   1016: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1019: goto -> 1120
    //   1022: aload #9
    //   1024: ifnull -> 1120
    //   1027: aload #11
    //   1029: ifnull -> 1056
    //   1032: ldc_w ''
    //   1035: aload #11
    //   1037: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1040: ifne -> 1056
    //   1043: aload #4
    //   1045: invokestatic O : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1048: aload #11
    //   1050: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1053: goto -> 1120
    //   1056: aload #12
    //   1058: ifnull -> 1085
    //   1061: ldc_w ''
    //   1064: aload #12
    //   1066: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1069: ifne -> 1085
    //   1072: aload #4
    //   1074: invokestatic O : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1077: aload #12
    //   1079: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1082: goto -> 1120
    //   1085: aload_1
    //   1086: invokevirtual p : ()Ljava/lang/String;
    //   1089: invokestatic v0 : (Ljava/lang/String;)Z
    //   1092: ifeq -> 1110
    //   1095: aload #4
    //   1097: invokestatic O : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1100: aload_0
    //   1101: getfield w : Ljava/lang/String;
    //   1104: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1107: goto -> 1120
    //   1110: aload #4
    //   1112: invokestatic O : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1115: aload #9
    //   1117: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1120: aload_1
    //   1121: invokevirtual M : ()I
    //   1124: istore #13
    //   1126: iload #13
    //   1128: iconst_1
    //   1129: if_icmpeq -> 1227
    //   1132: iload #13
    //   1134: iconst_2
    //   1135: if_icmpeq -> 1213
    //   1138: iload #13
    //   1140: iconst_3
    //   1141: if_icmpeq -> 1199
    //   1144: iload #13
    //   1146: iconst_5
    //   1147: if_icmpeq -> 1185
    //   1150: iload #13
    //   1152: bipush #9
    //   1154: if_icmpeq -> 1171
    //   1157: aload #4
    //   1159: invokestatic b0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1162: ldc_w 2131231080
    //   1165: invokevirtual setBackgroundResource : (I)V
    //   1168: goto -> 1238
    //   1171: aload #4
    //   1173: invokestatic b0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1176: ldc_w 2131231080
    //   1179: invokevirtual setBackgroundResource : (I)V
    //   1182: goto -> 1238
    //   1185: aload #4
    //   1187: invokestatic b0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1190: ldc_w 2131231080
    //   1193: invokevirtual setBackgroundResource : (I)V
    //   1196: goto -> 1238
    //   1199: aload #4
    //   1201: invokestatic b0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1204: ldc_w 2131231080
    //   1207: invokevirtual setBackgroundResource : (I)V
    //   1210: goto -> 1238
    //   1213: aload #4
    //   1215: invokestatic b0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1218: ldc_w 2131231081
    //   1221: invokevirtual setBackgroundResource : (I)V
    //   1224: goto -> 1238
    //   1227: aload #4
    //   1229: invokestatic b0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1232: ldc_w 2131231079
    //   1235: invokevirtual setBackgroundResource : (I)V
    //   1238: aload_0
    //   1239: getfield h : Ljava/util/HashMap;
    //   1242: astore #8
    //   1244: aload #8
    //   1246: ifnull -> 1372
    //   1249: aload #8
    //   1251: invokevirtual size : ()I
    //   1254: ifeq -> 1372
    //   1257: aload_0
    //   1258: getfield h : Ljava/util/HashMap;
    //   1261: aload_1
    //   1262: invokevirtual K : ()Ljava/lang/String;
    //   1265: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1268: checkcast java/lang/Integer
    //   1271: astore #8
    //   1273: aload #8
    //   1275: ifnull -> 1372
    //   1278: aload #8
    //   1280: invokevirtual intValue : ()I
    //   1283: istore #13
    //   1285: iload #13
    //   1287: iconst_1
    //   1288: if_icmpne -> 1304
    //   1291: aload #4
    //   1293: invokestatic P : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1296: bipush #8
    //   1298: invokevirtual setVisibility : (I)V
    //   1301: goto -> 1372
    //   1304: iload #13
    //   1306: iconst_1
    //   1307: if_icmple -> 1372
    //   1310: aload #4
    //   1312: invokestatic P : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1315: astore #9
    //   1317: new java/lang/StringBuilder
    //   1320: astore #8
    //   1322: aload #8
    //   1324: invokespecial <init> : ()V
    //   1327: aload #8
    //   1329: ldc_w '('
    //   1332: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1335: pop
    //   1336: aload #8
    //   1338: iload #13
    //   1340: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1343: pop
    //   1344: aload #8
    //   1346: ldc_w ')'
    //   1349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1352: pop
    //   1353: aload #9
    //   1355: aload #8
    //   1357: invokevirtual toString : ()Ljava/lang/String;
    //   1360: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1363: aload #4
    //   1365: invokestatic P : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1368: iconst_0
    //   1369: invokevirtual setVisibility : (I)V
    //   1372: aload_1
    //   1373: invokevirtual e : ()Ljava/lang/String;
    //   1376: ifnull -> 1392
    //   1379: ldc_w ''
    //   1382: aload_1
    //   1383: invokevirtual e : ()Ljava/lang/String;
    //   1386: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1389: ifeq -> 1399
    //   1392: aload_1
    //   1393: invokevirtual Y : ()Z
    //   1396: ifeq -> 1411
    //   1399: aload #4
    //   1401: invokestatic c0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/LinearLayout;
    //   1404: iconst_0
    //   1405: invokevirtual setVisibility : (I)V
    //   1408: goto -> 1421
    //   1411: aload #4
    //   1413: invokestatic c0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/LinearLayout;
    //   1416: bipush #8
    //   1418: invokevirtual setVisibility : (I)V
    //   1421: aload_1
    //   1422: invokevirtual T : ()Z
    //   1425: ifne -> 1553
    //   1428: aload_1
    //   1429: invokevirtual e : ()Ljava/lang/String;
    //   1432: ifnull -> 1533
    //   1435: ldc_w ''
    //   1438: aload_1
    //   1439: invokevirtual e : ()Ljava/lang/String;
    //   1442: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1445: ifne -> 1533
    //   1448: aload #4
    //   1450: invokestatic V : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1453: iconst_0
    //   1454: invokevirtual setVisibility : (I)V
    //   1457: aload #4
    //   1459: invokestatic X : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1462: astore #8
    //   1464: new java/lang/StringBuilder
    //   1467: astore #9
    //   1469: aload #9
    //   1471: invokespecial <init> : ()V
    //   1474: aload #9
    //   1476: ldc_w '('
    //   1479: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1482: pop
    //   1483: aload #9
    //   1485: aload_1
    //   1486: invokevirtual e : ()Ljava/lang/String;
    //   1489: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1492: pop
    //   1493: aload #9
    //   1495: ldc_w ')'
    //   1498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1501: pop
    //   1502: aload #8
    //   1504: aload #9
    //   1506: invokevirtual toString : ()Ljava/lang/String;
    //   1509: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1512: aload #4
    //   1514: invokestatic X : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1517: iconst_0
    //   1518: invokevirtual setVisibility : (I)V
    //   1521: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   1524: ldc_w 'comment_icon_show'
    //   1527: invokevirtual c : (Ljava/lang/String;)V
    //   1530: goto -> 1553
    //   1533: aload #4
    //   1535: invokestatic V : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1538: bipush #8
    //   1540: invokevirtual setVisibility : (I)V
    //   1543: aload #4
    //   1545: invokestatic X : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1548: bipush #8
    //   1550: invokevirtual setVisibility : (I)V
    //   1553: aload_1
    //   1554: invokevirtual r : ()Ljava/lang/String;
    //   1557: ifnull -> 1597
    //   1560: ldc_w ''
    //   1563: aload_1
    //   1564: invokevirtual r : ()Ljava/lang/String;
    //   1567: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1570: ifne -> 1597
    //   1573: aload #4
    //   1575: invokestatic Q : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1578: aload_1
    //   1579: invokevirtual r : ()Ljava/lang/String;
    //   1582: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1585: aload #4
    //   1587: invokestatic Q : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1590: iconst_0
    //   1591: invokevirtual setVisibility : (I)V
    //   1594: goto -> 1662
    //   1597: aload_1
    //   1598: invokevirtual B : ()Ljava/lang/String;
    //   1601: ifnull -> 1641
    //   1604: ldc_w ''
    //   1607: aload_1
    //   1608: invokevirtual B : ()Ljava/lang/String;
    //   1611: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1614: ifne -> 1641
    //   1617: aload #4
    //   1619: invokestatic Q : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1622: aload_1
    //   1623: invokevirtual B : ()Ljava/lang/String;
    //   1626: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1629: aload #4
    //   1631: invokestatic Q : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1634: iconst_0
    //   1635: invokevirtual setVisibility : (I)V
    //   1638: goto -> 1662
    //   1641: aload #4
    //   1643: invokestatic Q : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1646: ldc_w ''
    //   1649: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1652: aload #4
    //   1654: invokestatic Q : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1657: bipush #8
    //   1659: invokevirtual setVisibility : (I)V
    //   1662: aload #4
    //   1664: invokestatic R : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1667: aload_1
    //   1668: invokevirtual P : ()Ljava/lang/String;
    //   1671: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1674: aload_0
    //   1675: aload #4
    //   1677: invokestatic d0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1680: aload_1
    //   1681: invokespecial L : (Landroid/view/View;Lcom/allinone/callerid/search/CallLogBean;)V
    //   1684: aload #4
    //   1686: invokestatic M : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/FrameLayout;
    //   1689: astore #8
    //   1691: new com/allinone/callerid/b/t$e
    //   1694: astore #9
    //   1696: aload #9
    //   1698: aload_0
    //   1699: iload_2
    //   1700: invokespecial <init> : (Lcom/allinone/callerid/b/t;I)V
    //   1703: aload #8
    //   1705: aload #9
    //   1707: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1710: aload #4
    //   1712: invokestatic M : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/FrameLayout;
    //   1715: astore #8
    //   1717: new com/allinone/callerid/b/t$f
    //   1720: astore #9
    //   1722: aload #9
    //   1724: aload_0
    //   1725: iload_2
    //   1726: invokespecial <init> : (Lcom/allinone/callerid/b/t;I)V
    //   1729: aload #8
    //   1731: aload #9
    //   1733: invokevirtual setOnLongClickListener : (Landroid/view/View$OnLongClickListener;)V
    //   1736: aload_1
    //   1737: invokevirtual T : ()Z
    //   1740: ifeq -> 1776
    //   1743: aload_0
    //   1744: getfield d : Landroid/app/Activity;
    //   1747: getstatic android/provider/ContactsContract$Contacts.CONTENT_URI : Landroid/net/Uri;
    //   1750: aload_1
    //   1751: invokevirtual v : ()I
    //   1754: i2l
    //   1755: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   1758: aload_1
    //   1759: invokevirtual a : ()Ljava/lang/String;
    //   1762: ldc_w 2131231148
    //   1765: aload #4
    //   1767: invokestatic N : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1770: invokestatic c : (Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;ILandroid/widget/ImageView;)V
    //   1773: goto -> 1848
    //   1776: iload_3
    //   1777: istore_2
    //   1778: aload #5
    //   1780: ifnull -> 1831
    //   1783: iload_3
    //   1784: istore_2
    //   1785: ldc_w ''
    //   1788: aload #5
    //   1790: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1793: ifne -> 1831
    //   1796: iload_3
    //   1797: istore_2
    //   1798: aload #7
    //   1800: ifnull -> 1831
    //   1803: iload_3
    //   1804: istore_2
    //   1805: ldc_w ''
    //   1808: aload #7
    //   1810: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1813: ifne -> 1831
    //   1816: aload #4
    //   1818: invokestatic N : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1821: ldc_w 2131231149
    //   1824: invokevirtual setImageResource : (I)V
    //   1827: ldc_w 2131231149
    //   1830: istore_2
    //   1831: aload_0
    //   1832: getfield d : Landroid/app/Activity;
    //   1835: aload_1
    //   1836: invokevirtual a : ()Ljava/lang/String;
    //   1839: iload_2
    //   1840: aload #4
    //   1842: invokestatic N : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1845: invokestatic a : (Landroid/app/Activity;Ljava/lang/Object;ILandroid/widget/ImageView;)V
    //   1848: aload_1
    //   1849: invokevirtual Y : ()Z
    //   1852: istore #6
    //   1854: iload #6
    //   1856: ifeq -> 1974
    //   1859: aload #4
    //   1861: invokestatic W : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1864: iconst_0
    //   1865: invokevirtual setVisibility : (I)V
    //   1868: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   1871: ldc_w 'record_icon_show'
    //   1874: invokevirtual c : (Ljava/lang/String;)V
    //   1877: aload_1
    //   1878: invokevirtual w : ()Ljava/lang/String;
    //   1881: ifnull -> 1994
    //   1884: ldc_w ''
    //   1887: aload_1
    //   1888: invokevirtual w : ()Ljava/lang/String;
    //   1891: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1894: ifne -> 1994
    //   1897: aload #4
    //   1899: invokestatic Y : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1902: astore #5
    //   1904: new java/lang/StringBuilder
    //   1907: astore #7
    //   1909: aload #7
    //   1911: invokespecial <init> : ()V
    //   1914: aload #7
    //   1916: ldc_w '('
    //   1919: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1922: pop
    //   1923: aload #7
    //   1925: aload_1
    //   1926: invokevirtual w : ()Ljava/lang/String;
    //   1929: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1932: pop
    //   1933: aload #7
    //   1935: ldc_w ')'
    //   1938: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1941: pop
    //   1942: aload #5
    //   1944: aload #7
    //   1946: invokevirtual toString : ()Ljava/lang/String;
    //   1949: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1952: aload #4
    //   1954: invokestatic Y : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1957: iconst_0
    //   1958: invokevirtual setVisibility : (I)V
    //   1961: goto -> 1994
    //   1964: astore #5
    //   1966: aload #5
    //   1968: invokevirtual printStackTrace : ()V
    //   1971: goto -> 1994
    //   1974: aload #4
    //   1976: invokestatic W : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/ImageView;
    //   1979: bipush #8
    //   1981: invokevirtual setVisibility : (I)V
    //   1984: aload #4
    //   1986: invokestatic Y : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/TextView;
    //   1989: bipush #8
    //   1991: invokevirtual setVisibility : (I)V
    //   1994: aload #4
    //   1996: invokestatic e0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/LinearLayout;
    //   1999: astore #5
    //   2001: new com/allinone/callerid/b/t$g
    //   2004: astore #7
    //   2006: aload #7
    //   2008: aload_0
    //   2009: aload_1
    //   2010: invokespecial <init> : (Lcom/allinone/callerid/b/t;Lcom/allinone/callerid/search/CallLogBean;)V
    //   2013: aload #5
    //   2015: aload #7
    //   2017: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2020: aload #4
    //   2022: invokestatic f0 : (Lcom/allinone/callerid/b/t$j;)Landroid/widget/LinearLayout;
    //   2025: astore #5
    //   2027: new com/allinone/callerid/b/t$h
    //   2030: astore #4
    //   2032: aload #4
    //   2034: aload_0
    //   2035: aload_1
    //   2036: invokespecial <init> : (Lcom/allinone/callerid/b/t;Lcom/allinone/callerid/search/CallLogBean;)V
    //   2039: aload #5
    //   2041: aload #4
    //   2043: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2046: goto -> 2370
    //   2049: astore_1
    //   2050: aload_1
    //   2051: invokevirtual printStackTrace : ()V
    //   2054: goto -> 2370
    //   2057: aload_1
    //   2058: checkcast com/allinone/callerid/b/t$k
    //   2061: astore_1
    //   2062: aload_0
    //   2063: getfield j : Landroid/content/Context;
    //   2066: invokestatic f0 : (Landroid/content/Context;)Ljava/lang/Boolean;
    //   2069: invokevirtual booleanValue : ()Z
    //   2072: ifeq -> 2085
    //   2075: aload_1
    //   2076: invokestatic M : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/ImageView;
    //   2079: ldc_w 180.0
    //   2082: invokevirtual setRotation : (F)V
    //   2085: aload_1
    //   2086: invokestatic P : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/FrameLayout;
    //   2089: new com/allinone/callerid/b/t$a
    //   2092: dup
    //   2093: aload_0
    //   2094: invokespecial <init> : (Lcom/allinone/callerid/b/t;)V
    //   2097: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2100: aload_1
    //   2101: invokestatic M : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/ImageView;
    //   2104: new com/allinone/callerid/b/t$b
    //   2107: dup
    //   2108: aload_0
    //   2109: invokespecial <init> : (Lcom/allinone/callerid/b/t;)V
    //   2112: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2115: aload_1
    //   2116: invokestatic R : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/FrameLayout;
    //   2119: new com/allinone/callerid/b/t$c
    //   2122: dup
    //   2123: aload_0
    //   2124: aload_1
    //   2125: invokespecial <init> : (Lcom/allinone/callerid/b/t;Lcom/allinone/callerid/b/t$k;)V
    //   2128: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2131: aload_1
    //   2132: invokestatic S : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/ImageView;
    //   2135: new com/allinone/callerid/b/t$d
    //   2138: dup
    //   2139: aload_0
    //   2140: aload_1
    //   2141: invokespecial <init> : (Lcom/allinone/callerid/b/t;Lcom/allinone/callerid/b/t$k;)V
    //   2144: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   2147: aload_0
    //   2148: getfield x : Z
    //   2151: ifne -> 2184
    //   2154: aload_0
    //   2155: getfield i : Ljava/util/ArrayList;
    //   2158: astore #4
    //   2160: aload #4
    //   2162: ifnull -> 2184
    //   2165: aload #4
    //   2167: invokevirtual size : ()I
    //   2170: ifle -> 2184
    //   2173: aload_1
    //   2174: invokestatic Q : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/RelativeLayout;
    //   2177: iconst_0
    //   2178: invokevirtual setVisibility : (I)V
    //   2181: goto -> 2193
    //   2184: aload_1
    //   2185: invokestatic Q : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/RelativeLayout;
    //   2188: bipush #8
    //   2190: invokevirtual setVisibility : (I)V
    //   2193: aload_0
    //   2194: getfield n : Z
    //   2197: ifeq -> 2294
    //   2200: aload_1
    //   2201: invokestatic N : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/TextView;
    //   2204: astore #4
    //   2206: new java/lang/StringBuilder
    //   2209: dup
    //   2210: invokespecial <init> : ()V
    //   2213: astore #5
    //   2215: aload #5
    //   2217: aload_0
    //   2218: getfield j : Landroid/content/Context;
    //   2221: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2224: ldc_w 2131755414
    //   2227: invokevirtual getString : (I)Ljava/lang/String;
    //   2230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2233: pop
    //   2234: aload #5
    //   2236: ldc_w ' '
    //   2239: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2242: pop
    //   2243: aload #5
    //   2245: aload_0
    //   2246: getfield i : Ljava/util/ArrayList;
    //   2249: invokevirtual size : ()I
    //   2252: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2255: pop
    //   2256: aload #5
    //   2258: ldc_w ' '
    //   2261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2264: pop
    //   2265: aload #5
    //   2267: aload_0
    //   2268: getfield j : Landroid/content/Context;
    //   2271: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   2274: ldc_w 2131755680
    //   2277: invokevirtual getString : (I)Ljava/lang/String;
    //   2280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2283: pop
    //   2284: aload #4
    //   2286: aload #5
    //   2288: invokevirtual toString : ()Ljava/lang/String;
    //   2291: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   2294: aload_1
    //   2295: invokestatic O : (Lcom/allinone/callerid/b/t$k;)Lcom/allinone/callerid/b/w;
    //   2298: aload_0
    //   2299: getfield i : Ljava/util/ArrayList;
    //   2302: iconst_1
    //   2303: invokevirtual b : (Ljava/util/List;Z)V
    //   2306: aload_1
    //   2307: invokestatic O : (Lcom/allinone/callerid/b/t$k;)Lcom/allinone/callerid/b/w;
    //   2310: invokevirtual notifyDataSetChanged : ()V
    //   2313: invokestatic a0 : ()Z
    //   2316: ifeq -> 2361
    //   2319: aload_1
    //   2320: invokestatic Q : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/RelativeLayout;
    //   2323: invokevirtual getVisibility : ()I
    //   2326: ifeq -> 2361
    //   2329: aload_1
    //   2330: invokestatic P : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/FrameLayout;
    //   2333: iconst_0
    //   2334: invokevirtual setVisibility : (I)V
    //   2337: aload_0
    //   2338: getfield e : Z
    //   2341: ifne -> 2370
    //   2344: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   2347: ldc_w 'permission_guide_show'
    //   2350: invokevirtual c : (Ljava/lang/String;)V
    //   2353: aload_0
    //   2354: iconst_1
    //   2355: putfield e : Z
    //   2358: goto -> 2370
    //   2361: aload_1
    //   2362: invokestatic P : (Lcom/allinone/callerid/b/t$k;)Landroid/widget/FrameLayout;
    //   2365: bipush #8
    //   2367: invokevirtual setVisibility : (I)V
    //   2370: return
    // Exception table:
    //   from	to	target	type
    //   23	71	2049	java/lang/Exception
    //   74	83	2049	java/lang/Exception
    //   83	90	2049	java/lang/Exception
    //   94	228	2049	java/lang/Exception
    //   233	272	333	java/lang/Exception
    //   275	307	333	java/lang/Exception
    //   310	330	333	java/lang/Exception
    //   335	340	2049	java/lang/Exception
    //   343	363	2049	java/lang/Exception
    //   363	392	2049	java/lang/Exception
    //   397	406	2049	java/lang/Exception
    //   411	437	2049	java/lang/Exception
    //   442	448	2049	java/lang/Exception
    //   453	483	2049	java/lang/Exception
    //   486	516	2049	java/lang/Exception
    //   516	522	2049	java/lang/Exception
    //   527	595	2049	java/lang/Exception
    //   598	619	2049	java/lang/Exception
    //   619	637	2049	java/lang/Exception
    //   642	653	2049	java/lang/Exception
    //   658	779	2049	java/lang/Exception
    //   782	792	2049	java/lang/Exception
    //   795	801	2049	java/lang/Exception
    //   806	827	2049	java/lang/Exception
    //   835	900	2049	java/lang/Exception
    //   903	937	2049	java/lang/Exception
    //   937	961	2049	java/lang/Exception
    //   966	977	2049	java/lang/Exception
    //   980	990	2049	java/lang/Exception
    //   998	1019	2049	java/lang/Exception
    //   1032	1053	2049	java/lang/Exception
    //   1061	1082	2049	java/lang/Exception
    //   1085	1107	2049	java/lang/Exception
    //   1110	1120	2049	java/lang/Exception
    //   1120	1126	2049	java/lang/Exception
    //   1157	1168	2049	java/lang/Exception
    //   1171	1182	2049	java/lang/Exception
    //   1185	1196	2049	java/lang/Exception
    //   1199	1210	2049	java/lang/Exception
    //   1213	1224	2049	java/lang/Exception
    //   1227	1238	2049	java/lang/Exception
    //   1238	1244	2049	java/lang/Exception
    //   1249	1273	2049	java/lang/Exception
    //   1278	1285	2049	java/lang/Exception
    //   1291	1301	2049	java/lang/Exception
    //   1310	1372	2049	java/lang/Exception
    //   1372	1392	2049	java/lang/Exception
    //   1392	1399	2049	java/lang/Exception
    //   1399	1408	2049	java/lang/Exception
    //   1411	1421	2049	java/lang/Exception
    //   1421	1530	2049	java/lang/Exception
    //   1533	1553	2049	java/lang/Exception
    //   1553	1594	2049	java/lang/Exception
    //   1597	1638	2049	java/lang/Exception
    //   1641	1662	2049	java/lang/Exception
    //   1662	1773	2049	java/lang/Exception
    //   1785	1796	2049	java/lang/Exception
    //   1805	1827	2049	java/lang/Exception
    //   1831	1848	2049	java/lang/Exception
    //   1848	1854	2049	java/lang/Exception
    //   1859	1961	1964	java/lang/Exception
    //   1966	1971	2049	java/lang/Exception
    //   1974	1994	2049	java/lang/Exception
    //   1994	2046	2049	java/lang/Exception
  }
  
  public RecyclerView.b0 r(ViewGroup paramViewGroup, int paramInt) {
    return (RecyclerView.b0)((paramInt != 999) ? ((paramInt != 1001) ? null : new j(this.g.inflate(2131492981, paramViewGroup, false))) : new k(this.d, this.g.inflate(2131493217, paramViewGroup, false)));
  }
  
  class a implements View.OnClickListener {
    a(t this$0) {}
    
    public void onClick(View param1View) {
      q.b().c("permission_guide_click");
      Intent intent = new Intent();
      intent.setClass((Context)EZCallApplication.c(), PermissionActivity.class);
      t.C(this.b).startActivity(intent);
      if (t.D(this.b) != null)
        t.D(this.b).overridePendingTransition(2130771968, 2130771969); 
    }
  }
  
  class b implements View.OnClickListener {
    b(t this$0) {}
    
    public void onClick(View param1View) {
      q.b().c("permission_guide_click");
      Intent intent = new Intent();
      intent.setClass((Context)EZCallApplication.c(), PermissionActivity.class);
      t.C(this.b).startActivity(intent);
      if (t.D(this.b) != null)
        t.D(this.b).overridePendingTransition(2130771968, 2130771969); 
    }
  }
  
  class c implements View.OnClickListener {
    c(t this$0, t.k param1k) {}
    
    public void onClick(View param1View) {
      t.G(this.c, true);
      q.b().c("find_spamcall_click");
      if (t.H(this.c) != null)
        t.H(this.c).a(); 
      Animation animation = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771995);
      animation.setAnimationListener(new a(this));
      t.k.Q(this.b).startAnimation(animation);
    }
    
    class a implements Animation.AnimationListener {
      a(t.c this$0) {}
      
      public void onAnimationEnd(Animation param2Animation) {
        t.k.Q(this.a.b).setVisibility(8);
      }
      
      public void onAnimationRepeat(Animation param2Animation) {}
      
      public void onAnimationStart(Animation param2Animation) {}
    }
  }
  
  class a implements Animation.AnimationListener {
    a(t this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      t.k.Q(this.a.b).setVisibility(8);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class d implements View.OnClickListener {
    d(t this$0, t.k param1k) {}
    
    public void onClick(View param1View) {
      t.G(this.c, true);
      q.b().c("find_spamcall_close");
      Animation animation = AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771995);
      animation.setAnimationListener(new a(this));
      t.k.Q(this.b).startAnimation(animation);
    }
    
    class a implements Animation.AnimationListener {
      a(t.d this$0) {}
      
      public void onAnimationEnd(Animation param2Animation) {
        t.k.Q(this.a.b).setVisibility(8);
        if (i1.a0()) {
          t.k.P(this.a.b).setVisibility(0);
          if (!t.I(this.a.c)) {
            q.b().c("permission_guide_show");
            t.J(this.a.c, true);
          } 
        } 
      }
      
      public void onAnimationRepeat(Animation param2Animation) {}
      
      public void onAnimationStart(Animation param2Animation) {}
    }
  }
  
  class a implements Animation.AnimationListener {
    a(t this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      t.k.Q(this.a.b).setVisibility(8);
      if (i1.a0()) {
        t.k.P(this.a.b).setVisibility(0);
        if (!t.I(this.a.c)) {
          q.b().c("permission_guide_show");
          t.J(this.a.c, true);
        } 
      } 
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class e implements View.OnClickListener {
    e(t this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      if (t.E(this.c) != null)
        t.E(this.c).b(param1View, this.b - 1); 
    }
  }
  
  class f implements View.OnLongClickListener {
    f(t this$0, int param1Int) {}
    
    public boolean onLongClick(View param1View) {
      if (t.E(this.c) != null)
        t.E(this.c).a(param1View, this.b - 1); 
      return true;
    }
  }
  
  class g implements View.OnClickListener {
    g(t this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      q.b().c("record_icon_click");
      Intent intent = new Intent(t.C(this.c), RecordListActivity.class);
      intent.putExtra("recordnumber", this.b.p());
      intent.putExtra("recordname", this.b.n());
      intent.addFlags(268435456);
      t.C(this.c).startActivity(intent);
      if (t.D(this.c) != null)
        t.D(this.c).overridePendingTransition(2130771968, 2130771969); 
    }
  }
  
  class h implements View.OnClickListener {
    h(t this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      q.b().c("comment_icon_click");
      Intent intent = new Intent();
      Bundle bundle = new Bundle();
      bundle.putParcelable("contact_tony", (Parcelable)this.b);
      bundle.putBoolean("is_to_comment", true);
      intent.putExtras(bundle);
      intent.setClass(t.C(this.c), UnknownContactActivity.class);
      t.C(this.c).startActivity(intent);
      if (t.D(this.c) != null)
        t.D(this.c).overridePendingTransition(2130771968, 2130771969); 
    }
  }
  
  class i implements View.OnClickListener {
    i(t this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      try {
        String str = this.b.p();
        if (str != null) {
          if ("".equals(str) || "-1".equals(str) || "-2".equals(str) || "-3".equals(str)) {
            Toast.makeText(t.C(this.c), t.C(this.c).getResources().getString(2131755829), 1).show();
            return;
          } 
          if (t.F(this.c)) {
            if (b1.H()) {
              int j = b1.q();
              c1.d(t.C(this.c), j, str);
            } else if (Build.VERSION.SDK_INT >= 22) {
              c1.m(t.C(this.c), str);
            } else {
              q0.a(t.C(this.c), str);
            } 
          } else {
            q0.a(t.C(this.c), str);
          } 
        } 
      } catch (Exception exception) {
        Toast.makeText(t.C(this.c), t.C(this.c).getResources().getString(2131755541), 1).show();
      } 
    }
  }
  
  private static class j extends RecyclerView.b0 {
    private TextView A;
    
    private TextView B;
    
    private TextView C;
    
    private TextView D;
    
    private TextView E;
    
    private ImageView F;
    
    private FrameLayout G;
    
    private ImageView H;
    
    private ImageView I;
    
    private ImageView J;
    
    private ImageView K;
    
    private LinearLayout L;
    
    private LinearLayout M;
    
    private LinearLayout N;
    
    private TextView u;
    
    private ImageView v;
    
    private ImageView w;
    
    private TextView x;
    
    private TextView y;
    
    private TextView z;
    
    j(View param1View) {
      super(param1View);
      Typeface typeface1 = g1.b();
      Typeface typeface2 = g1.a();
      this.u = (TextView)param1View.findViewById(2131297880);
      this.w = (ImageView)param1View.findViewById(2131297423);
      this.v = (ImageView)param1View.findViewById(2131296451);
      this.K = (ImageView)param1View.findViewById(2131296969);
      this.J = (ImageView)param1View.findViewById(2131297032);
      this.L = (LinearLayout)param1View.findViewById(2131297195);
      this.M = (LinearLayout)param1View.findViewById(2131297164);
      this.N = (LinearLayout)param1View.findViewById(2131297165);
      this.x = (TextView)param1View.findViewById(2131297304);
      this.C = (TextView)param1View.findViewById(2131297851);
      this.D = (TextView)param1View.findViewById(2131298057);
      this.y = (TextView)param1View.findViewById(2131297753);
      this.z = (TextView)param1View.findViewById(2131298136);
      this.A = (TextView)param1View.findViewById(2131297875);
      this.B = (TextView)param1View.findViewById(2131298026);
      this.E = (TextView)param1View.findViewById(2131296379);
      this.F = (ImageView)param1View.findViewById(2131296445);
      this.G = (FrameLayout)param1View.findViewById(2131297469);
      this.H = (ImageView)param1View.findViewById(2131297054);
      this.I = (ImageView)param1View.findViewById(2131297055);
      this.x.setTypeface(typeface1);
      this.A.setTypeface(typeface1);
      this.y.setTypeface(typeface1);
      this.B.setTypeface(typeface1);
      this.D.setTypeface(typeface1);
      this.C.setTypeface(typeface1);
      this.z.setTypeface(typeface1);
      this.u.setTypeface(typeface2);
    }
  }
  
  private static class k extends RecyclerView.b0 {
    private ImageView A;
    
    private RelativeLayout u;
    
    private ImageView v;
    
    private TextView w;
    
    private FrameLayout x;
    
    private FrameLayout y;
    
    private w z;
    
    k(Activity param1Activity, View param1View) {
      super(param1View);
      Typeface typeface = g1.b();
      MyListView myListView = (MyListView)param1View.findViewById(2131297238);
      w w1 = new w((Context)param1Activity);
      this.z = w1;
      myListView.setAdapter((ListAdapter)w1);
      this.y = (FrameLayout)param1View.findViewById(2131297525);
      this.u = (RelativeLayout)param1View.findViewById(2131297539);
      this.v = (ImageView)param1View.findViewById(2131297133);
      TextView textView = (TextView)param1View.findViewById(2131298145);
      this.w = textView;
      textView.setTypeface(typeface);
      ((TextView)param1View.findViewById(2131297813)).setTypeface(typeface);
      this.x = (FrameLayout)param1View.findViewById(2131296718);
      this.A = (ImageView)param1View.findViewById(2131298196);
      ((TextView)param1View.findViewById(2131297426)).setTypeface(typeface);
      ((TextView)param1View.findViewById(2131297427)).setTypeface(typeface);
    }
  }
  
  public static interface l {
    void a();
  }
  
  public static interface m {
    void a(View param1View, int param1Int);
    
    void b(View param1View, int param1Int);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */