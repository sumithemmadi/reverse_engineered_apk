package com.allinone.callerid.d.a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class a extends BaseAdapter implements SectionIndexer {
  private List<PersonaliseContact> b;
  
  private List<PersonaliseContact> c = new ArrayList<PersonaliseContact>();
  
  private Context d;
  
  private Activity e;
  
  private LayoutInflater f;
  
  c g;
  
  private b h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  public a(Context paramContext, List<PersonaliseContact> paramList) {
    this.d = paramContext;
    this.e = (Activity)paramContext;
    this.f = LayoutInflater.from(paramContext);
    if (paramList == null) {
      this.b = new ArrayList<PersonaliseContact>();
    } else {
      this.b = paramList;
    } 
    this.i = d1.b(paramContext, 2130968686, 2131230858);
    this.j = d1.b(paramContext, 2130968685, 2131230857);
    this.k = d1.b(paramContext, 2130968687, 2131230859);
    this.l = d1.b(paramContext, 2130968688, 2131230860);
  }
  
  public void c(b paramb) {
    this.h = paramb;
  }
  
  public void d(List<PersonaliseContact> paramList) {
    if (paramList == null) {
      this.b = new ArrayList<PersonaliseContact>();
    } else {
      this.b = paramList;
    } 
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
    for (byte b1 = 0; b1 < getCount(); b1++) {
      List<PersonaliseContact> list = this.b;
      if (list != null && list.get(b1) != null && ((PersonaliseContact)this.b.get(b1)).getSortLetters() != null && ((PersonaliseContact)this.b.get(b1)).getSortLetters().toUpperCase(Locale.CHINESE).charAt(0) == paramInt)
        return b1; 
    } 
    return -1;
  }
  
  public int getSectionForPosition(int paramInt) {
    return ((PersonaliseContact)this.b.get(paramInt)).getSortLetters().charAt(0);
  }
  
  public Object[] getSections() {
    return null;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: ldc ''
    //   2: astore_3
    //   3: aload_2
    //   4: ifnonnull -> 256
    //   7: aload_0
    //   8: getfield f : Landroid/view/LayoutInflater;
    //   11: ldc 2131493050
    //   13: aconst_null
    //   14: invokevirtual inflate : (ILandroid/view/ViewGroup;)Landroid/view/View;
    //   17: astore #4
    //   19: new com/allinone/callerid/d/a/a$c
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore_2
    //   27: aload_0
    //   28: aload_2
    //   29: putfield g : Lcom/allinone/callerid/d/a/a$c;
    //   32: aload_2
    //   33: aload #4
    //   35: ldc 2131297306
    //   37: invokevirtual findViewById : (I)Landroid/view/View;
    //   40: checkcast android/widget/TextView
    //   43: putfield a : Landroid/widget/TextView;
    //   46: aload_0
    //   47: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   50: aload #4
    //   52: ldc 2131297333
    //   54: invokevirtual findViewById : (I)Landroid/view/View;
    //   57: checkcast android/widget/TextView
    //   60: putfield b : Landroid/widget/TextView;
    //   63: aload_0
    //   64: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   67: aload #4
    //   69: ldc 2131297361
    //   71: invokevirtual findViewById : (I)Landroid/view/View;
    //   74: checkcast android/widget/ImageView
    //   77: putfield c : Landroid/widget/ImageView;
    //   80: aload_0
    //   81: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   84: aload #4
    //   86: ldc 2131297359
    //   88: invokevirtual findViewById : (I)Landroid/view/View;
    //   91: checkcast android/widget/TextView
    //   94: putfield d : Landroid/widget/TextView;
    //   97: aload_0
    //   98: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   101: getfield d : Landroid/widget/TextView;
    //   104: invokestatic a : ()Landroid/graphics/Typeface;
    //   107: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   110: aload_0
    //   111: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   114: getfield a : Landroid/widget/TextView;
    //   117: invokestatic b : ()Landroid/graphics/Typeface;
    //   120: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   123: aload_0
    //   124: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   127: getfield b : Landroid/widget/TextView;
    //   130: invokestatic b : ()Landroid/graphics/Typeface;
    //   133: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   136: aload_0
    //   137: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   140: aload #4
    //   142: ldc 2131297469
    //   144: invokevirtual findViewById : (I)Landroid/view/View;
    //   147: checkcast android/widget/FrameLayout
    //   150: putfield e : Landroid/widget/FrameLayout;
    //   153: aload_0
    //   154: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   157: aload #4
    //   159: ldc 2131297468
    //   161: invokevirtual findViewById : (I)Landroid/view/View;
    //   164: checkcast android/widget/FrameLayout
    //   167: putfield f : Landroid/widget/FrameLayout;
    //   170: aload_0
    //   171: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   174: aload #4
    //   176: ldc 2131297509
    //   178: invokevirtual findViewById : (I)Landroid/view/View;
    //   181: checkcast android/widget/RelativeLayout
    //   184: putfield g : Landroid/widget/RelativeLayout;
    //   187: aload_0
    //   188: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   191: aload #4
    //   193: ldc 2131297497
    //   195: invokevirtual findViewById : (I)Landroid/view/View;
    //   198: putfield h : Landroid/view/View;
    //   201: aload_0
    //   202: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   205: getfield h : Landroid/view/View;
    //   208: bipush #8
    //   210: invokevirtual setVisibility : (I)V
    //   213: aload_0
    //   214: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   217: getfield e : Landroid/widget/FrameLayout;
    //   220: iload_1
    //   221: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   224: invokevirtual setTag : (Ljava/lang/Object;)V
    //   227: aload_0
    //   228: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   231: aload #4
    //   233: ldc 2131296966
    //   235: invokevirtual findViewById : (I)Landroid/view/View;
    //   238: checkcast android/widget/CheckBox
    //   241: putfield i : Landroid/widget/CheckBox;
    //   244: aload #4
    //   246: aload_0
    //   247: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   250: invokevirtual setTag : (Ljava/lang/Object;)V
    //   253: goto -> 270
    //   256: aload_0
    //   257: aload_2
    //   258: invokevirtual getTag : ()Ljava/lang/Object;
    //   261: checkcast com/allinone/callerid/d/a/a$c
    //   264: putfield g : Lcom/allinone/callerid/d/a/a$c;
    //   267: aload_2
    //   268: astore #4
    //   270: aload_0
    //   271: getfield b : Ljava/util/List;
    //   274: iload_1
    //   275: invokeinterface get : (I)Ljava/lang/Object;
    //   280: checkcast com/allinone/callerid/callscreen/bean/PersonaliseContact
    //   283: astore #5
    //   285: aload #5
    //   287: ifnull -> 2660
    //   290: aload #5
    //   292: invokevirtual getName : ()Ljava/lang/String;
    //   295: astore #6
    //   297: aload #6
    //   299: ifnull -> 315
    //   302: aload #6
    //   304: astore_2
    //   305: ldc ''
    //   307: aload #6
    //   309: invokevirtual equals : (Ljava/lang/Object;)Z
    //   312: ifeq -> 328
    //   315: aload_0
    //   316: getfield d : Landroid/content/Context;
    //   319: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   322: ldc 2131755830
    //   324: invokevirtual getString : (I)Ljava/lang/String;
    //   327: astore_2
    //   328: aload_0
    //   329: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   332: getfield c : Landroid/widget/ImageView;
    //   335: ldc 2131231148
    //   337: invokevirtual setImageResource : (I)V
    //   340: aload_0
    //   341: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   344: getfield a : Landroid/widget/TextView;
    //   347: aload_2
    //   348: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   351: aload #5
    //   353: invokevirtual getThemtname : ()Ljava/lang/String;
    //   356: astore_2
    //   357: aload_2
    //   358: ifnull -> 443
    //   361: ldc ''
    //   363: aload #5
    //   365: invokevirtual getThemtname : ()Ljava/lang/String;
    //   368: invokevirtual equals : (Ljava/lang/Object;)Z
    //   371: ifne -> 443
    //   374: aload_0
    //   375: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   378: getfield b : Landroid/widget/TextView;
    //   381: astore_2
    //   382: new java/lang/StringBuilder
    //   385: astore #6
    //   387: aload #6
    //   389: invokespecial <init> : ()V
    //   392: aload #6
    //   394: aload_0
    //   395: getfield d : Landroid/content/Context;
    //   398: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   401: ldc_w 2131755751
    //   404: invokevirtual getString : (I)Ljava/lang/String;
    //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: pop
    //   411: aload #6
    //   413: ldc_w ' - '
    //   416: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: pop
    //   420: aload #6
    //   422: aload #5
    //   424: invokevirtual getThemtname : ()Ljava/lang/String;
    //   427: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: pop
    //   431: aload_2
    //   432: aload #6
    //   434: invokevirtual toString : ()Ljava/lang/String;
    //   437: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   440: goto -> 556
    //   443: aload #5
    //   445: invokevirtual getDefault_themtname : ()Ljava/lang/String;
    //   448: ifnull -> 533
    //   451: ldc ''
    //   453: aload #5
    //   455: invokevirtual getDefault_themtname : ()Ljava/lang/String;
    //   458: invokevirtual equals : (Ljava/lang/Object;)Z
    //   461: ifne -> 533
    //   464: aload_0
    //   465: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   468: getfield b : Landroid/widget/TextView;
    //   471: astore_2
    //   472: new java/lang/StringBuilder
    //   475: astore #6
    //   477: aload #6
    //   479: invokespecial <init> : ()V
    //   482: aload #6
    //   484: aload_0
    //   485: getfield d : Landroid/content/Context;
    //   488: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   491: ldc_w 2131755280
    //   494: invokevirtual getString : (I)Ljava/lang/String;
    //   497: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   500: pop
    //   501: aload #6
    //   503: ldc_w ' - '
    //   506: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: pop
    //   510: aload #6
    //   512: aload #5
    //   514: invokevirtual getDefault_themtname : ()Ljava/lang/String;
    //   517: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: pop
    //   521: aload_2
    //   522: aload #6
    //   524: invokevirtual toString : ()Ljava/lang/String;
    //   527: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   530: goto -> 556
    //   533: aload_0
    //   534: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   537: getfield b : Landroid/widget/TextView;
    //   540: aload_0
    //   541: getfield d : Landroid/content/Context;
    //   544: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   547: ldc_w 2131755549
    //   550: invokevirtual getString : (I)Ljava/lang/String;
    //   553: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   556: aload #5
    //   558: getfield isselect : Z
    //   561: ifeq -> 578
    //   564: aload_0
    //   565: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   568: getfield i : Landroid/widget/CheckBox;
    //   571: iconst_1
    //   572: invokevirtual setChecked : (Z)V
    //   575: goto -> 589
    //   578: aload_0
    //   579: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   582: getfield i : Landroid/widget/CheckBox;
    //   585: iconst_0
    //   586: invokevirtual setChecked : (Z)V
    //   589: aload_0
    //   590: getfield e : Landroid/app/Activity;
    //   593: getstatic android/provider/ContactsContract$Contacts.CONTENT_URI : Landroid/net/Uri;
    //   596: aload #5
    //   598: invokevirtual getContacts_id : ()I
    //   601: i2l
    //   602: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   605: ldc ''
    //   607: ldc 2131231148
    //   609: aload_0
    //   610: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   613: getfield c : Landroid/widget/ImageView;
    //   616: invokestatic c : (Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;ILandroid/widget/ImageView;)V
    //   619: aload #5
    //   621: invokevirtual getMultiple_number : ()Ljava/lang/String;
    //   624: ldc_w ':'
    //   627: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   630: pop
    //   631: aload_0
    //   632: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   635: getfield e : Landroid/widget/FrameLayout;
    //   638: astore #6
    //   640: new com/allinone/callerid/d/a/a$a
    //   643: astore_2
    //   644: aload_2
    //   645: aload_0
    //   646: aload #5
    //   648: iload_1
    //   649: invokespecial <init> : (Lcom/allinone/callerid/d/a/a;Lcom/allinone/callerid/callscreen/bean/PersonaliseContact;I)V
    //   652: aload #6
    //   654: aload_2
    //   655: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   658: aload_0
    //   659: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   662: getfield d : Landroid/widget/TextView;
    //   665: iconst_0
    //   666: invokevirtual setVisibility : (I)V
    //   669: goto -> 677
    //   672: astore_2
    //   673: aload_2
    //   674: invokevirtual printStackTrace : ()V
    //   677: aload #5
    //   679: invokevirtual getName : ()Ljava/lang/String;
    //   682: ifnull -> 928
    //   685: ldc ''
    //   687: aload #5
    //   689: invokevirtual getName : ()Ljava/lang/String;
    //   692: invokevirtual equals : (Ljava/lang/Object;)Z
    //   695: ifne -> 928
    //   698: aload #5
    //   700: invokevirtual getName : ()Ljava/lang/String;
    //   703: invokevirtual length : ()I
    //   706: ifle -> 928
    //   709: aload #5
    //   711: invokevirtual getName : ()Ljava/lang/String;
    //   714: iconst_0
    //   715: invokevirtual charAt : (I)C
    //   718: istore #7
    //   720: iload #7
    //   722: bipush #65
    //   724: if_icmplt -> 734
    //   727: iload #7
    //   729: bipush #90
    //   731: if_icmple -> 748
    //   734: iload #7
    //   736: bipush #97
    //   738: if_icmplt -> 792
    //   741: iload #7
    //   743: bipush #122
    //   745: if_icmpgt -> 792
    //   748: new java/lang/StringBuilder
    //   751: astore_2
    //   752: aload_2
    //   753: invokespecial <init> : ()V
    //   756: aload_2
    //   757: ldc ''
    //   759: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   762: pop
    //   763: aload_2
    //   764: iload #7
    //   766: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   769: pop
    //   770: aload_2
    //   771: invokevirtual toString : ()Ljava/lang/String;
    //   774: astore_2
    //   775: aload_0
    //   776: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   779: getfield d : Landroid/widget/TextView;
    //   782: aload_2
    //   783: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   786: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   789: goto -> 960
    //   792: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   795: aload #5
    //   797: invokevirtual getName : ()Ljava/lang/String;
    //   800: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   803: iconst_0
    //   804: invokevirtual get : (I)Ljava/lang/Object;
    //   807: checkcast com/allinone/callerid/util/v$a
    //   810: getfield c : Ljava/lang/String;
    //   813: astore_2
    //   814: aload_2
    //   815: ifnull -> 906
    //   818: ldc ''
    //   820: aload_2
    //   821: invokevirtual equals : (Ljava/lang/Object;)Z
    //   824: ifne -> 906
    //   827: aload_2
    //   828: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   831: iconst_0
    //   832: invokevirtual charAt : (I)C
    //   835: istore #7
    //   837: new java/lang/StringBuilder
    //   840: astore_2
    //   841: aload_2
    //   842: invokespecial <init> : ()V
    //   845: aload_2
    //   846: iload #7
    //   848: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   851: pop
    //   852: aload_2
    //   853: ldc ''
    //   855: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   858: pop
    //   859: aload_2
    //   860: invokevirtual toString : ()Ljava/lang/String;
    //   863: ldc_w '[0-9]'
    //   866: invokevirtual matches : (Ljava/lang/String;)Z
    //   869: ifeq -> 888
    //   872: aload_0
    //   873: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   876: getfield d : Landroid/widget/TextView;
    //   879: ldc_w '#'
    //   882: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   885: goto -> 960
    //   888: aload_0
    //   889: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   892: getfield d : Landroid/widget/TextView;
    //   895: iload #7
    //   897: invokestatic valueOf : (C)Ljava/lang/String;
    //   900: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   903: goto -> 960
    //   906: aload_0
    //   907: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   910: getfield d : Landroid/widget/TextView;
    //   913: aload #5
    //   915: invokevirtual getName : ()Ljava/lang/String;
    //   918: iconst_0
    //   919: invokevirtual charAt : (I)C
    //   922: invokevirtual setText : (I)V
    //   925: goto -> 960
    //   928: aload_0
    //   929: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   932: getfield d : Landroid/widget/TextView;
    //   935: bipush #8
    //   937: invokevirtual setVisibility : (I)V
    //   940: goto -> 960
    //   943: astore_2
    //   944: aload_0
    //   945: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   948: getfield d : Landroid/widget/TextView;
    //   951: bipush #8
    //   953: invokevirtual setVisibility : (I)V
    //   956: aload_2
    //   957: invokevirtual printStackTrace : ()V
    //   960: aload_0
    //   961: getfield b : Ljava/util/List;
    //   964: astore_2
    //   965: aload_2
    //   966: ifnull -> 2194
    //   969: aload_2
    //   970: invokeinterface size : ()I
    //   975: iconst_1
    //   976: if_icmple -> 2194
    //   979: iload_1
    //   980: ifle -> 2194
    //   983: aload_0
    //   984: getfield b : Ljava/util/List;
    //   987: iload_1
    //   988: iconst_1
    //   989: isub
    //   990: invokeinterface get : (I)Ljava/lang/Object;
    //   995: checkcast com/allinone/callerid/callscreen/bean/PersonaliseContact
    //   998: invokevirtual getName : ()Ljava/lang/String;
    //   1001: astore_2
    //   1002: aload_0
    //   1003: getfield b : Ljava/util/List;
    //   1006: iload_1
    //   1007: invokeinterface get : (I)Ljava/lang/Object;
    //   1012: checkcast com/allinone/callerid/callscreen/bean/PersonaliseContact
    //   1015: invokevirtual getName : ()Ljava/lang/String;
    //   1018: astore #6
    //   1020: aload_2
    //   1021: ifnull -> 1154
    //   1024: ldc ''
    //   1026: aload_2
    //   1027: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1030: ifne -> 1154
    //   1033: aload_2
    //   1034: iconst_0
    //   1035: invokevirtual charAt : (I)C
    //   1038: istore #7
    //   1040: iload #7
    //   1042: bipush #65
    //   1044: if_icmplt -> 1054
    //   1047: iload #7
    //   1049: bipush #90
    //   1051: if_icmple -> 1068
    //   1054: iload #7
    //   1056: bipush #97
    //   1058: if_icmplt -> 1101
    //   1061: iload #7
    //   1063: bipush #122
    //   1065: if_icmpgt -> 1101
    //   1068: new java/lang/StringBuilder
    //   1071: astore_2
    //   1072: aload_2
    //   1073: invokespecial <init> : ()V
    //   1076: aload_2
    //   1077: ldc ''
    //   1079: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1082: pop
    //   1083: aload_2
    //   1084: iload #7
    //   1086: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1089: pop
    //   1090: aload_2
    //   1091: invokevirtual toString : ()Ljava/lang/String;
    //   1094: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1097: astore_2
    //   1098: goto -> 1157
    //   1101: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1104: aload_2
    //   1105: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1108: iconst_0
    //   1109: invokevirtual get : (I)Ljava/lang/Object;
    //   1112: checkcast com/allinone/callerid/util/v$a
    //   1115: getfield c : Ljava/lang/String;
    //   1118: iconst_0
    //   1119: invokevirtual charAt : (I)C
    //   1122: istore #7
    //   1124: new java/lang/StringBuilder
    //   1127: astore_2
    //   1128: aload_2
    //   1129: invokespecial <init> : ()V
    //   1132: aload_2
    //   1133: ldc ''
    //   1135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1138: pop
    //   1139: aload_2
    //   1140: iload #7
    //   1142: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1145: pop
    //   1146: aload_2
    //   1147: invokevirtual toString : ()Ljava/lang/String;
    //   1150: astore_2
    //   1151: goto -> 1157
    //   1154: ldc ''
    //   1156: astore_2
    //   1157: aload #6
    //   1159: ifnull -> 1307
    //   1162: ldc ''
    //   1164: aload #6
    //   1166: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1169: ifne -> 1307
    //   1172: aload #6
    //   1174: iconst_0
    //   1175: invokevirtual charAt : (I)C
    //   1178: istore #7
    //   1180: iload #7
    //   1182: bipush #65
    //   1184: if_icmplt -> 1194
    //   1187: iload #7
    //   1189: bipush #90
    //   1191: if_icmple -> 1208
    //   1194: iload #7
    //   1196: bipush #97
    //   1198: if_icmplt -> 1247
    //   1201: iload #7
    //   1203: bipush #122
    //   1205: if_icmpgt -> 1247
    //   1208: new java/lang/StringBuilder
    //   1211: astore #6
    //   1213: aload #6
    //   1215: invokespecial <init> : ()V
    //   1218: aload #6
    //   1220: ldc ''
    //   1222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1225: pop
    //   1226: aload #6
    //   1228: iload #7
    //   1230: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1233: pop
    //   1234: aload #6
    //   1236: invokevirtual toString : ()Ljava/lang/String;
    //   1239: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1242: astore #6
    //   1244: goto -> 1311
    //   1247: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1250: aload #6
    //   1252: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1255: iconst_0
    //   1256: invokevirtual get : (I)Ljava/lang/Object;
    //   1259: checkcast com/allinone/callerid/util/v$a
    //   1262: getfield c : Ljava/lang/String;
    //   1265: iconst_0
    //   1266: invokevirtual charAt : (I)C
    //   1269: istore #7
    //   1271: new java/lang/StringBuilder
    //   1274: astore #6
    //   1276: aload #6
    //   1278: invokespecial <init> : ()V
    //   1281: aload #6
    //   1283: ldc ''
    //   1285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1288: pop
    //   1289: aload #6
    //   1291: iload #7
    //   1293: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1296: pop
    //   1297: aload #6
    //   1299: invokevirtual toString : ()Ljava/lang/String;
    //   1302: astore #6
    //   1304: goto -> 1311
    //   1307: ldc ''
    //   1309: astore #6
    //   1311: aload #6
    //   1313: aload_2
    //   1314: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1317: ifeq -> 1758
    //   1320: aload_0
    //   1321: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   1324: getfield g : Landroid/widget/RelativeLayout;
    //   1327: bipush #8
    //   1329: invokevirtual setVisibility : (I)V
    //   1332: aload_0
    //   1333: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   1336: getfield d : Landroid/widget/TextView;
    //   1339: bipush #8
    //   1341: invokevirtual setVisibility : (I)V
    //   1344: iload_1
    //   1345: aload_0
    //   1346: getfield b : Ljava/util/List;
    //   1349: invokeinterface size : ()I
    //   1354: iconst_1
    //   1355: isub
    //   1356: if_icmpeq -> 1730
    //   1359: aload_0
    //   1360: getfield b : Ljava/util/List;
    //   1363: iload_1
    //   1364: iconst_1
    //   1365: iadd
    //   1366: invokeinterface get : (I)Ljava/lang/Object;
    //   1371: checkcast com/allinone/callerid/callscreen/bean/PersonaliseContact
    //   1374: invokevirtual getName : ()Ljava/lang/String;
    //   1377: astore_2
    //   1378: aload_0
    //   1379: getfield b : Ljava/util/List;
    //   1382: iload_1
    //   1383: invokeinterface get : (I)Ljava/lang/Object;
    //   1388: checkcast com/allinone/callerid/callscreen/bean/PersonaliseContact
    //   1391: invokevirtual getName : ()Ljava/lang/String;
    //   1394: astore #5
    //   1396: aload_2
    //   1397: ifnull -> 1530
    //   1400: ldc ''
    //   1402: aload_2
    //   1403: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1406: ifne -> 1530
    //   1409: aload_2
    //   1410: iconst_0
    //   1411: invokevirtual charAt : (I)C
    //   1414: istore #7
    //   1416: iload #7
    //   1418: bipush #65
    //   1420: if_icmplt -> 1430
    //   1423: iload #7
    //   1425: bipush #90
    //   1427: if_icmple -> 1444
    //   1430: iload #7
    //   1432: bipush #97
    //   1434: if_icmplt -> 1477
    //   1437: iload #7
    //   1439: bipush #122
    //   1441: if_icmpgt -> 1477
    //   1444: new java/lang/StringBuilder
    //   1447: astore_2
    //   1448: aload_2
    //   1449: invokespecial <init> : ()V
    //   1452: aload_2
    //   1453: ldc ''
    //   1455: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1458: pop
    //   1459: aload_2
    //   1460: iload #7
    //   1462: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1465: pop
    //   1466: aload_2
    //   1467: invokevirtual toString : ()Ljava/lang/String;
    //   1470: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1473: astore_2
    //   1474: goto -> 1533
    //   1477: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1480: aload_2
    //   1481: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1484: iconst_0
    //   1485: invokevirtual get : (I)Ljava/lang/Object;
    //   1488: checkcast com/allinone/callerid/util/v$a
    //   1491: getfield c : Ljava/lang/String;
    //   1494: iconst_0
    //   1495: invokevirtual charAt : (I)C
    //   1498: istore #7
    //   1500: new java/lang/StringBuilder
    //   1503: astore_2
    //   1504: aload_2
    //   1505: invokespecial <init> : ()V
    //   1508: aload_2
    //   1509: ldc ''
    //   1511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1514: pop
    //   1515: aload_2
    //   1516: iload #7
    //   1518: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1521: pop
    //   1522: aload_2
    //   1523: invokevirtual toString : ()Ljava/lang/String;
    //   1526: astore_2
    //   1527: goto -> 1533
    //   1530: ldc ''
    //   1532: astore_2
    //   1533: aload_3
    //   1534: astore #6
    //   1536: aload #5
    //   1538: ifnull -> 1676
    //   1541: aload_3
    //   1542: astore #6
    //   1544: ldc ''
    //   1546: aload #5
    //   1548: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1551: ifne -> 1676
    //   1554: aload #5
    //   1556: iconst_0
    //   1557: invokevirtual charAt : (I)C
    //   1560: istore #7
    //   1562: iload #7
    //   1564: bipush #65
    //   1566: if_icmplt -> 1576
    //   1569: iload #7
    //   1571: bipush #90
    //   1573: if_icmple -> 1590
    //   1576: iload #7
    //   1578: bipush #97
    //   1580: if_icmplt -> 1624
    //   1583: iload #7
    //   1585: bipush #122
    //   1587: if_icmpgt -> 1624
    //   1590: new java/lang/StringBuilder
    //   1593: astore_3
    //   1594: aload_3
    //   1595: invokespecial <init> : ()V
    //   1598: aload_3
    //   1599: ldc ''
    //   1601: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1604: pop
    //   1605: aload_3
    //   1606: iload #7
    //   1608: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1611: pop
    //   1612: aload_3
    //   1613: invokevirtual toString : ()Ljava/lang/String;
    //   1616: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1619: astore #6
    //   1621: goto -> 1676
    //   1624: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1627: aload #5
    //   1629: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1632: iconst_0
    //   1633: invokevirtual get : (I)Ljava/lang/Object;
    //   1636: checkcast com/allinone/callerid/util/v$a
    //   1639: getfield c : Ljava/lang/String;
    //   1642: iconst_0
    //   1643: invokevirtual charAt : (I)C
    //   1646: istore #7
    //   1648: new java/lang/StringBuilder
    //   1651: astore_3
    //   1652: aload_3
    //   1653: invokespecial <init> : ()V
    //   1656: aload_3
    //   1657: ldc ''
    //   1659: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1662: pop
    //   1663: aload_3
    //   1664: iload #7
    //   1666: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1669: pop
    //   1670: aload_3
    //   1671: invokevirtual toString : ()Ljava/lang/String;
    //   1674: astore #6
    //   1676: aload_2
    //   1677: aload #6
    //   1679: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1682: ifeq -> 1702
    //   1685: aload_0
    //   1686: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   1689: getfield f : Landroid/widget/FrameLayout;
    //   1692: aload_0
    //   1693: getfield k : I
    //   1696: invokevirtual setBackgroundResource : (I)V
    //   1699: goto -> 2660
    //   1702: aload_0
    //   1703: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   1706: getfield f : Landroid/widget/FrameLayout;
    //   1709: aload_0
    //   1710: getfield i : I
    //   1713: invokevirtual setBackgroundResource : (I)V
    //   1716: aload_0
    //   1717: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   1720: getfield h : Landroid/view/View;
    //   1723: iconst_0
    //   1724: invokevirtual setVisibility : (I)V
    //   1727: goto -> 2660
    //   1730: aload_0
    //   1731: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   1734: getfield f : Landroid/widget/FrameLayout;
    //   1737: aload_0
    //   1738: getfield i : I
    //   1741: invokevirtual setBackgroundResource : (I)V
    //   1744: aload_0
    //   1745: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   1748: getfield h : Landroid/view/View;
    //   1751: iconst_0
    //   1752: invokevirtual setVisibility : (I)V
    //   1755: goto -> 2660
    //   1758: aload_0
    //   1759: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   1762: getfield d : Landroid/widget/TextView;
    //   1765: iconst_0
    //   1766: invokevirtual setVisibility : (I)V
    //   1769: aload_0
    //   1770: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   1773: getfield g : Landroid/widget/RelativeLayout;
    //   1776: iconst_0
    //   1777: invokevirtual setVisibility : (I)V
    //   1780: iload_1
    //   1781: aload_0
    //   1782: getfield b : Ljava/util/List;
    //   1785: invokeinterface size : ()I
    //   1790: iconst_1
    //   1791: isub
    //   1792: if_icmpeq -> 2166
    //   1795: aload_0
    //   1796: getfield b : Ljava/util/List;
    //   1799: iload_1
    //   1800: iconst_1
    //   1801: iadd
    //   1802: invokeinterface get : (I)Ljava/lang/Object;
    //   1807: checkcast com/allinone/callerid/callscreen/bean/PersonaliseContact
    //   1810: invokevirtual getName : ()Ljava/lang/String;
    //   1813: astore_2
    //   1814: aload_0
    //   1815: getfield b : Ljava/util/List;
    //   1818: iload_1
    //   1819: invokeinterface get : (I)Ljava/lang/Object;
    //   1824: checkcast com/allinone/callerid/callscreen/bean/PersonaliseContact
    //   1827: invokevirtual getName : ()Ljava/lang/String;
    //   1830: astore #5
    //   1832: aload_2
    //   1833: ifnull -> 1966
    //   1836: ldc ''
    //   1838: aload_2
    //   1839: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1842: ifne -> 1966
    //   1845: aload_2
    //   1846: iconst_0
    //   1847: invokevirtual charAt : (I)C
    //   1850: istore #7
    //   1852: iload #7
    //   1854: bipush #65
    //   1856: if_icmplt -> 1866
    //   1859: iload #7
    //   1861: bipush #90
    //   1863: if_icmple -> 1880
    //   1866: iload #7
    //   1868: bipush #97
    //   1870: if_icmplt -> 1913
    //   1873: iload #7
    //   1875: bipush #122
    //   1877: if_icmpgt -> 1913
    //   1880: new java/lang/StringBuilder
    //   1883: astore_2
    //   1884: aload_2
    //   1885: invokespecial <init> : ()V
    //   1888: aload_2
    //   1889: ldc ''
    //   1891: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1894: pop
    //   1895: aload_2
    //   1896: iload #7
    //   1898: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1901: pop
    //   1902: aload_2
    //   1903: invokevirtual toString : ()Ljava/lang/String;
    //   1906: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   1909: astore_2
    //   1910: goto -> 1969
    //   1913: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   1916: aload_2
    //   1917: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   1920: iconst_0
    //   1921: invokevirtual get : (I)Ljava/lang/Object;
    //   1924: checkcast com/allinone/callerid/util/v$a
    //   1927: getfield c : Ljava/lang/String;
    //   1930: iconst_0
    //   1931: invokevirtual charAt : (I)C
    //   1934: istore #7
    //   1936: new java/lang/StringBuilder
    //   1939: astore_2
    //   1940: aload_2
    //   1941: invokespecial <init> : ()V
    //   1944: aload_2
    //   1945: ldc ''
    //   1947: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1950: pop
    //   1951: aload_2
    //   1952: iload #7
    //   1954: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1957: pop
    //   1958: aload_2
    //   1959: invokevirtual toString : ()Ljava/lang/String;
    //   1962: astore_2
    //   1963: goto -> 1969
    //   1966: ldc ''
    //   1968: astore_2
    //   1969: aload_3
    //   1970: astore #6
    //   1972: aload #5
    //   1974: ifnull -> 2112
    //   1977: aload_3
    //   1978: astore #6
    //   1980: ldc ''
    //   1982: aload #5
    //   1984: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1987: ifne -> 2112
    //   1990: aload #5
    //   1992: iconst_0
    //   1993: invokevirtual charAt : (I)C
    //   1996: istore #7
    //   1998: iload #7
    //   2000: bipush #65
    //   2002: if_icmplt -> 2012
    //   2005: iload #7
    //   2007: bipush #90
    //   2009: if_icmple -> 2026
    //   2012: iload #7
    //   2014: bipush #97
    //   2016: if_icmplt -> 2060
    //   2019: iload #7
    //   2021: bipush #122
    //   2023: if_icmpgt -> 2060
    //   2026: new java/lang/StringBuilder
    //   2029: astore_3
    //   2030: aload_3
    //   2031: invokespecial <init> : ()V
    //   2034: aload_3
    //   2035: ldc ''
    //   2037: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2040: pop
    //   2041: aload_3
    //   2042: iload #7
    //   2044: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2047: pop
    //   2048: aload_3
    //   2049: invokevirtual toString : ()Ljava/lang/String;
    //   2052: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   2055: astore #6
    //   2057: goto -> 2112
    //   2060: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   2063: aload #5
    //   2065: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   2068: iconst_0
    //   2069: invokevirtual get : (I)Ljava/lang/Object;
    //   2072: checkcast com/allinone/callerid/util/v$a
    //   2075: getfield c : Ljava/lang/String;
    //   2078: iconst_0
    //   2079: invokevirtual charAt : (I)C
    //   2082: istore #7
    //   2084: new java/lang/StringBuilder
    //   2087: astore_3
    //   2088: aload_3
    //   2089: invokespecial <init> : ()V
    //   2092: aload_3
    //   2093: ldc ''
    //   2095: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2098: pop
    //   2099: aload_3
    //   2100: iload #7
    //   2102: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2105: pop
    //   2106: aload_3
    //   2107: invokevirtual toString : ()Ljava/lang/String;
    //   2110: astore #6
    //   2112: aload_2
    //   2113: aload #6
    //   2115: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2118: ifeq -> 2138
    //   2121: aload_0
    //   2122: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2125: getfield f : Landroid/widget/FrameLayout;
    //   2128: aload_0
    //   2129: getfield l : I
    //   2132: invokevirtual setBackgroundResource : (I)V
    //   2135: goto -> 2660
    //   2138: aload_0
    //   2139: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2142: getfield f : Landroid/widget/FrameLayout;
    //   2145: aload_0
    //   2146: getfield j : I
    //   2149: invokevirtual setBackgroundResource : (I)V
    //   2152: aload_0
    //   2153: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2156: getfield h : Landroid/view/View;
    //   2159: iconst_0
    //   2160: invokevirtual setVisibility : (I)V
    //   2163: goto -> 2660
    //   2166: aload_0
    //   2167: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2170: getfield f : Landroid/widget/FrameLayout;
    //   2173: aload_0
    //   2174: getfield i : I
    //   2177: invokevirtual setBackgroundResource : (I)V
    //   2180: aload_0
    //   2181: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2184: getfield h : Landroid/view/View;
    //   2187: iconst_0
    //   2188: invokevirtual setVisibility : (I)V
    //   2191: goto -> 2660
    //   2194: aload_0
    //   2195: getfield b : Ljava/util/List;
    //   2198: astore_2
    //   2199: aload_2
    //   2200: ifnull -> 2238
    //   2203: aload_2
    //   2204: invokeinterface size : ()I
    //   2209: iconst_1
    //   2210: if_icmpne -> 2238
    //   2213: aload_0
    //   2214: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2217: getfield f : Landroid/widget/FrameLayout;
    //   2220: aload_0
    //   2221: getfield j : I
    //   2224: invokevirtual setBackgroundResource : (I)V
    //   2227: aload_0
    //   2228: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2231: getfield h : Landroid/view/View;
    //   2234: iconst_0
    //   2235: invokevirtual setVisibility : (I)V
    //   2238: aload_0
    //   2239: getfield b : Ljava/util/List;
    //   2242: astore_2
    //   2243: aload_2
    //   2244: ifnull -> 2660
    //   2247: aload_2
    //   2248: invokeinterface size : ()I
    //   2253: iconst_1
    //   2254: if_icmple -> 2660
    //   2257: iload_1
    //   2258: ifne -> 2660
    //   2261: aload_0
    //   2262: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2265: getfield g : Landroid/widget/RelativeLayout;
    //   2268: iconst_0
    //   2269: invokevirtual setVisibility : (I)V
    //   2272: aload_0
    //   2273: getfield b : Ljava/util/List;
    //   2276: iload_1
    //   2277: iconst_1
    //   2278: iadd
    //   2279: invokeinterface get : (I)Ljava/lang/Object;
    //   2284: checkcast com/allinone/callerid/callscreen/bean/PersonaliseContact
    //   2287: invokevirtual getName : ()Ljava/lang/String;
    //   2290: astore_2
    //   2291: aload_0
    //   2292: getfield b : Ljava/util/List;
    //   2295: iload_1
    //   2296: invokeinterface get : (I)Ljava/lang/Object;
    //   2301: checkcast com/allinone/callerid/callscreen/bean/PersonaliseContact
    //   2304: invokevirtual getName : ()Ljava/lang/String;
    //   2307: astore #5
    //   2309: aload_2
    //   2310: ifnull -> 2443
    //   2313: ldc ''
    //   2315: aload_2
    //   2316: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2319: ifne -> 2443
    //   2322: aload_2
    //   2323: iconst_0
    //   2324: invokevirtual charAt : (I)C
    //   2327: istore #7
    //   2329: iload #7
    //   2331: bipush #65
    //   2333: if_icmplt -> 2343
    //   2336: iload #7
    //   2338: bipush #90
    //   2340: if_icmple -> 2357
    //   2343: iload #7
    //   2345: bipush #97
    //   2347: if_icmplt -> 2390
    //   2350: iload #7
    //   2352: bipush #122
    //   2354: if_icmpgt -> 2390
    //   2357: new java/lang/StringBuilder
    //   2360: astore_2
    //   2361: aload_2
    //   2362: invokespecial <init> : ()V
    //   2365: aload_2
    //   2366: ldc ''
    //   2368: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2371: pop
    //   2372: aload_2
    //   2373: iload #7
    //   2375: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2378: pop
    //   2379: aload_2
    //   2380: invokevirtual toString : ()Ljava/lang/String;
    //   2383: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   2386: astore_2
    //   2387: goto -> 2446
    //   2390: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   2393: aload_2
    //   2394: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   2397: iconst_0
    //   2398: invokevirtual get : (I)Ljava/lang/Object;
    //   2401: checkcast com/allinone/callerid/util/v$a
    //   2404: getfield c : Ljava/lang/String;
    //   2407: iconst_0
    //   2408: invokevirtual charAt : (I)C
    //   2411: istore #7
    //   2413: new java/lang/StringBuilder
    //   2416: astore_2
    //   2417: aload_2
    //   2418: invokespecial <init> : ()V
    //   2421: aload_2
    //   2422: ldc ''
    //   2424: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2427: pop
    //   2428: aload_2
    //   2429: iload #7
    //   2431: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2434: pop
    //   2435: aload_2
    //   2436: invokevirtual toString : ()Ljava/lang/String;
    //   2439: astore_2
    //   2440: goto -> 2446
    //   2443: ldc ''
    //   2445: astore_2
    //   2446: aload_3
    //   2447: astore #6
    //   2449: aload #5
    //   2451: ifnull -> 2589
    //   2454: aload_3
    //   2455: astore #6
    //   2457: ldc ''
    //   2459: aload #5
    //   2461: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2464: ifne -> 2589
    //   2467: aload #5
    //   2469: iconst_0
    //   2470: invokevirtual charAt : (I)C
    //   2473: istore #7
    //   2475: iload #7
    //   2477: bipush #65
    //   2479: if_icmplt -> 2489
    //   2482: iload #7
    //   2484: bipush #90
    //   2486: if_icmple -> 2503
    //   2489: iload #7
    //   2491: bipush #97
    //   2493: if_icmplt -> 2537
    //   2496: iload #7
    //   2498: bipush #122
    //   2500: if_icmpgt -> 2537
    //   2503: new java/lang/StringBuilder
    //   2506: astore_3
    //   2507: aload_3
    //   2508: invokespecial <init> : ()V
    //   2511: aload_3
    //   2512: ldc ''
    //   2514: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2517: pop
    //   2518: aload_3
    //   2519: iload #7
    //   2521: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2524: pop
    //   2525: aload_3
    //   2526: invokevirtual toString : ()Ljava/lang/String;
    //   2529: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   2532: astore #6
    //   2534: goto -> 2589
    //   2537: invokestatic c : ()Lcom/allinone/callerid/util/v;
    //   2540: aload #5
    //   2542: invokevirtual b : (Ljava/lang/String;)Ljava/util/ArrayList;
    //   2545: iconst_0
    //   2546: invokevirtual get : (I)Ljava/lang/Object;
    //   2549: checkcast com/allinone/callerid/util/v$a
    //   2552: getfield c : Ljava/lang/String;
    //   2555: iconst_0
    //   2556: invokevirtual charAt : (I)C
    //   2559: istore #7
    //   2561: new java/lang/StringBuilder
    //   2564: astore_3
    //   2565: aload_3
    //   2566: invokespecial <init> : ()V
    //   2569: aload_3
    //   2570: ldc ''
    //   2572: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2575: pop
    //   2576: aload_3
    //   2577: iload #7
    //   2579: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   2582: pop
    //   2583: aload_3
    //   2584: invokevirtual toString : ()Ljava/lang/String;
    //   2587: astore #6
    //   2589: aload_2
    //   2590: aload #6
    //   2592: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2595: ifeq -> 2615
    //   2598: aload_0
    //   2599: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2602: getfield f : Landroid/widget/FrameLayout;
    //   2605: aload_0
    //   2606: getfield l : I
    //   2609: invokevirtual setBackgroundResource : (I)V
    //   2612: goto -> 2660
    //   2615: aload_0
    //   2616: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2619: getfield f : Landroid/widget/FrameLayout;
    //   2622: aload_0
    //   2623: getfield j : I
    //   2626: invokevirtual setBackgroundResource : (I)V
    //   2629: aload_0
    //   2630: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2633: getfield h : Landroid/view/View;
    //   2636: iconst_0
    //   2637: invokevirtual setVisibility : (I)V
    //   2640: goto -> 2660
    //   2643: astore_2
    //   2644: aload_0
    //   2645: getfield g : Lcom/allinone/callerid/d/a/a$c;
    //   2648: getfield d : Landroid/widget/TextView;
    //   2651: bipush #8
    //   2653: invokevirtual setVisibility : (I)V
    //   2656: aload_2
    //   2657: invokevirtual printStackTrace : ()V
    //   2660: aload #4
    //   2662: areturn
    // Exception table:
    //   from	to	target	type
    //   290	297	672	java/lang/Exception
    //   305	315	672	java/lang/Exception
    //   315	328	672	java/lang/Exception
    //   328	357	672	java/lang/Exception
    //   361	440	672	java/lang/Exception
    //   443	530	672	java/lang/Exception
    //   533	556	672	java/lang/Exception
    //   556	575	672	java/lang/Exception
    //   578	589	672	java/lang/Exception
    //   589	669	672	java/lang/Exception
    //   677	720	943	java/lang/Exception
    //   748	789	943	java/lang/Exception
    //   792	814	943	java/lang/Exception
    //   818	885	943	java/lang/Exception
    //   888	903	943	java/lang/Exception
    //   906	925	943	java/lang/Exception
    //   928	940	943	java/lang/Exception
    //   960	965	2643	java/lang/Exception
    //   969	979	2643	java/lang/Exception
    //   983	1020	2643	java/lang/Exception
    //   1024	1040	2643	java/lang/Exception
    //   1068	1098	2643	java/lang/Exception
    //   1101	1151	2643	java/lang/Exception
    //   1162	1180	2643	java/lang/Exception
    //   1208	1244	2643	java/lang/Exception
    //   1247	1304	2643	java/lang/Exception
    //   1311	1396	2643	java/lang/Exception
    //   1400	1416	2643	java/lang/Exception
    //   1444	1474	2643	java/lang/Exception
    //   1477	1527	2643	java/lang/Exception
    //   1544	1562	2643	java/lang/Exception
    //   1590	1621	2643	java/lang/Exception
    //   1624	1676	2643	java/lang/Exception
    //   1676	1699	2643	java/lang/Exception
    //   1702	1727	2643	java/lang/Exception
    //   1730	1755	2643	java/lang/Exception
    //   1758	1832	2643	java/lang/Exception
    //   1836	1852	2643	java/lang/Exception
    //   1880	1910	2643	java/lang/Exception
    //   1913	1963	2643	java/lang/Exception
    //   1980	1998	2643	java/lang/Exception
    //   2026	2057	2643	java/lang/Exception
    //   2060	2112	2643	java/lang/Exception
    //   2112	2135	2643	java/lang/Exception
    //   2138	2163	2643	java/lang/Exception
    //   2166	2191	2643	java/lang/Exception
    //   2194	2199	2643	java/lang/Exception
    //   2203	2238	2643	java/lang/Exception
    //   2238	2243	2643	java/lang/Exception
    //   2247	2257	2643	java/lang/Exception
    //   2261	2309	2643	java/lang/Exception
    //   2313	2329	2643	java/lang/Exception
    //   2357	2387	2643	java/lang/Exception
    //   2390	2440	2643	java/lang/Exception
    //   2457	2475	2643	java/lang/Exception
    //   2503	2534	2643	java/lang/Exception
    //   2537	2589	2643	java/lang/Exception
    //   2589	2612	2643	java/lang/Exception
    //   2615	2640	2643	java/lang/Exception
  }
  
  class a implements View.OnClickListener {
    a(a this$0, PersonaliseContact param1PersonaliseContact, int param1Int) {}
    
    public void onClick(View param1View) {
      PersonaliseContact personaliseContact = this.b;
      if (!personaliseContact.isselect) {
        personaliseContact.isselect = true;
        a.a(this.d).add(this.b);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("isChecked:name:");
          stringBuilder.append(this.b.getName());
          d0.a("callscreen", stringBuilder.toString());
        } 
      } else {
        a.a(this.d).remove(this.b);
        this.b.isselect = false;
      } 
      this.d.notifyDataSetChanged();
      if (a.b(this.d) != null)
        a.b(this.d).a(param1View, this.c, a.a(this.d)); 
    }
  }
  
  public static interface b {
    void a(View param1View, int param1Int, List<PersonaliseContact> param1List);
  }
  
  public static class c {
    TextView a;
    
    TextView b;
    
    ImageView c;
    
    TextView d;
    
    FrameLayout e;
    
    FrameLayout f;
    
    RelativeLayout g;
    
    View h;
    
    CheckBox i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */