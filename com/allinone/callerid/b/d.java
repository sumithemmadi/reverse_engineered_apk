package com.allinone.callerid.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.q0;
import java.util.List;

public class d extends BaseAdapter {
  private final int b;
  
  private final int c;
  
  private Context d;
  
  private List<CallLogBean> e;
  
  private LayoutInflater f;
  
  b g;
  
  public d(Context paramContext, List<CallLogBean> paramList, ListView paramListView) {
    this.d = paramContext;
    this.e = paramList;
    this.f = LayoutInflater.from(paramContext);
    this.b = d1.a(paramContext, 2130968856, 2131099723);
    this.c = d1.a(paramContext, 2130968858, 2131099729);
  }
  
  private String c(String paramString) {
    int i = Integer.parseInt(paramString);
    if (i < 60) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(i);
      stringBuilder1.append(" ");
      stringBuilder1.append(this.d.getResources().getString(2131755694));
      return stringBuilder1.toString();
    } 
    if (i < 3600) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(i / 60);
      stringBuilder1.append(" ");
      stringBuilder1.append(this.d.getResources().getString(2131755462));
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(i / 3600);
    stringBuilder.append(" ");
    stringBuilder.append(this.d.getResources().getString(2131755411));
    return stringBuilder.toString();
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
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 196
    //   4: aload_2
    //   5: astore #4
    //   7: aload_0
    //   8: getfield f : Landroid/view/LayoutInflater;
    //   11: ldc 2131492984
    //   13: aload_3
    //   14: iconst_0
    //   15: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   18: astore_2
    //   19: aload_2
    //   20: astore #4
    //   22: new com/allinone/callerid/b/d$b
    //   25: astore_3
    //   26: aload_2
    //   27: astore #4
    //   29: aload_3
    //   30: aconst_null
    //   31: invokespecial <init> : (Lcom/allinone/callerid/b/d$a;)V
    //   34: aload_2
    //   35: astore #4
    //   37: aload_0
    //   38: aload_3
    //   39: putfield g : Lcom/allinone/callerid/b/d$b;
    //   42: aload_2
    //   43: astore #4
    //   45: aload_3
    //   46: aload_2
    //   47: ldc 2131296413
    //   49: invokevirtual findViewById : (I)Landroid/view/View;
    //   52: checkcast android/widget/FrameLayout
    //   55: putfield a : Landroid/widget/FrameLayout;
    //   58: aload_2
    //   59: astore #4
    //   61: aload_0
    //   62: getfield g : Lcom/allinone/callerid/b/d$b;
    //   65: aload_2
    //   66: ldc 2131296414
    //   68: invokevirtual findViewById : (I)Landroid/view/View;
    //   71: checkcast android/widget/ImageView
    //   74: putfield b : Landroid/widget/ImageView;
    //   77: aload_2
    //   78: astore #4
    //   80: aload_0
    //   81: getfield g : Lcom/allinone/callerid/b/d$b;
    //   84: aload_2
    //   85: ldc 2131297836
    //   87: invokevirtual findViewById : (I)Landroid/view/View;
    //   90: checkcast android/widget/TextView
    //   93: putfield c : Landroid/widget/TextView;
    //   96: aload_2
    //   97: astore #4
    //   99: aload_0
    //   100: getfield g : Lcom/allinone/callerid/b/d$b;
    //   103: aload_2
    //   104: ldc 2131297833
    //   106: invokevirtual findViewById : (I)Landroid/view/View;
    //   109: checkcast android/widget/TextView
    //   112: putfield d : Landroid/widget/TextView;
    //   115: aload_2
    //   116: astore #4
    //   118: aload_0
    //   119: getfield g : Lcom/allinone/callerid/b/d$b;
    //   122: aload_2
    //   123: ldc 2131297834
    //   125: invokevirtual findViewById : (I)Landroid/view/View;
    //   128: checkcast android/widget/TextView
    //   131: putfield e : Landroid/widget/TextView;
    //   134: aload_2
    //   135: astore #4
    //   137: aload_0
    //   138: getfield g : Lcom/allinone/callerid/b/d$b;
    //   141: getfield c : Landroid/widget/TextView;
    //   144: invokestatic b : ()Landroid/graphics/Typeface;
    //   147: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   150: aload_2
    //   151: astore #4
    //   153: aload_0
    //   154: getfield g : Lcom/allinone/callerid/b/d$b;
    //   157: getfield d : Landroid/widget/TextView;
    //   160: invokestatic b : ()Landroid/graphics/Typeface;
    //   163: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   166: aload_2
    //   167: astore #4
    //   169: aload_0
    //   170: getfield g : Lcom/allinone/callerid/b/d$b;
    //   173: getfield e : Landroid/widget/TextView;
    //   176: invokestatic b : ()Landroid/graphics/Typeface;
    //   179: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   182: aload_2
    //   183: astore #4
    //   185: aload_2
    //   186: aload_0
    //   187: getfield g : Lcom/allinone/callerid/b/d$b;
    //   190: invokevirtual setTag : (Ljava/lang/Object;)V
    //   193: goto -> 210
    //   196: aload_2
    //   197: astore #4
    //   199: aload_0
    //   200: aload_2
    //   201: invokevirtual getTag : ()Ljava/lang/Object;
    //   204: checkcast com/allinone/callerid/b/d$b
    //   207: putfield g : Lcom/allinone/callerid/b/d$b;
    //   210: aload_2
    //   211: astore #4
    //   213: aload_0
    //   214: getfield e : Ljava/util/List;
    //   217: iload_1
    //   218: invokeinterface get : (I)Ljava/lang/Object;
    //   223: checkcast com/allinone/callerid/search/CallLogBean
    //   226: astore_3
    //   227: aload_2
    //   228: astore #4
    //   230: aload_3
    //   231: invokevirtual M : ()I
    //   234: istore #5
    //   236: iload #5
    //   238: iconst_1
    //   239: if_icmpeq -> 588
    //   242: iload #5
    //   244: iconst_2
    //   245: if_icmpeq -> 507
    //   248: iload #5
    //   250: iconst_3
    //   251: if_icmpeq -> 447
    //   254: iload #5
    //   256: iconst_5
    //   257: if_icmpeq -> 387
    //   260: iload #5
    //   262: bipush #9
    //   264: if_icmpeq -> 327
    //   267: aload_2
    //   268: astore #4
    //   270: aload_0
    //   271: getfield g : Lcom/allinone/callerid/b/d$b;
    //   274: getfield b : Landroid/widget/ImageView;
    //   277: ldc 2131231073
    //   279: invokevirtual setBackgroundResource : (I)V
    //   282: aload_2
    //   283: astore #4
    //   285: aload_0
    //   286: getfield g : Lcom/allinone/callerid/b/d$b;
    //   289: getfield e : Landroid/widget/TextView;
    //   292: aload_0
    //   293: getfield d : Landroid/content/Context;
    //   296: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   299: ldc 2131755465
    //   301: invokevirtual getString : (I)Ljava/lang/String;
    //   304: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   307: aload_2
    //   308: astore #4
    //   310: aload_0
    //   311: getfield g : Lcom/allinone/callerid/b/d$b;
    //   314: getfield e : Landroid/widget/TextView;
    //   317: aload_0
    //   318: getfield c : I
    //   321: invokevirtual setTextColor : (I)V
    //   324: goto -> 666
    //   327: aload_2
    //   328: astore #4
    //   330: aload_0
    //   331: getfield g : Lcom/allinone/callerid/b/d$b;
    //   334: getfield b : Landroid/widget/ImageView;
    //   337: ldc 2131231063
    //   339: invokevirtual setBackgroundResource : (I)V
    //   342: aload_2
    //   343: astore #4
    //   345: aload_0
    //   346: getfield g : Lcom/allinone/callerid/b/d$b;
    //   349: getfield e : Landroid/widget/TextView;
    //   352: aload_0
    //   353: getfield d : Landroid/content/Context;
    //   356: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   359: ldc 2131755128
    //   361: invokevirtual getString : (I)Ljava/lang/String;
    //   364: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   367: aload_2
    //   368: astore #4
    //   370: aload_0
    //   371: getfield g : Lcom/allinone/callerid/b/d$b;
    //   374: getfield e : Landroid/widget/TextView;
    //   377: aload_0
    //   378: getfield c : I
    //   381: invokevirtual setTextColor : (I)V
    //   384: goto -> 666
    //   387: aload_2
    //   388: astore #4
    //   390: aload_0
    //   391: getfield g : Lcom/allinone/callerid/b/d$b;
    //   394: getfield b : Landroid/widget/ImageView;
    //   397: ldc 2131231063
    //   399: invokevirtual setBackgroundResource : (I)V
    //   402: aload_2
    //   403: astore #4
    //   405: aload_0
    //   406: getfield g : Lcom/allinone/callerid/b/d$b;
    //   409: getfield e : Landroid/widget/TextView;
    //   412: aload_0
    //   413: getfield d : Landroid/content/Context;
    //   416: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   419: ldc 2131755128
    //   421: invokevirtual getString : (I)Ljava/lang/String;
    //   424: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   427: aload_2
    //   428: astore #4
    //   430: aload_0
    //   431: getfield g : Lcom/allinone/callerid/b/d$b;
    //   434: getfield e : Landroid/widget/TextView;
    //   437: aload_0
    //   438: getfield c : I
    //   441: invokevirtual setTextColor : (I)V
    //   444: goto -> 666
    //   447: aload_2
    //   448: astore #4
    //   450: aload_0
    //   451: getfield g : Lcom/allinone/callerid/b/d$b;
    //   454: getfield b : Landroid/widget/ImageView;
    //   457: ldc 2131231073
    //   459: invokevirtual setBackgroundResource : (I)V
    //   462: aload_2
    //   463: astore #4
    //   465: aload_0
    //   466: getfield g : Lcom/allinone/callerid/b/d$b;
    //   469: getfield e : Landroid/widget/TextView;
    //   472: aload_0
    //   473: getfield d : Landroid/content/Context;
    //   476: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   479: ldc 2131755465
    //   481: invokevirtual getString : (I)Ljava/lang/String;
    //   484: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   487: aload_2
    //   488: astore #4
    //   490: aload_0
    //   491: getfield g : Lcom/allinone/callerid/b/d$b;
    //   494: getfield e : Landroid/widget/TextView;
    //   497: aload_0
    //   498: getfield c : I
    //   501: invokevirtual setTextColor : (I)V
    //   504: goto -> 666
    //   507: aload_2
    //   508: astore #4
    //   510: aload_0
    //   511: getfield g : Lcom/allinone/callerid/b/d$b;
    //   514: getfield b : Landroid/widget/ImageView;
    //   517: ldc 2131231074
    //   519: invokevirtual setBackgroundResource : (I)V
    //   522: aload_2
    //   523: astore #4
    //   525: aload_3
    //   526: invokevirtual h : ()Ljava/lang/String;
    //   529: ifnull -> 666
    //   532: aload_2
    //   533: astore #4
    //   535: ldc ''
    //   537: aload_3
    //   538: invokevirtual h : ()Ljava/lang/String;
    //   541: invokevirtual equals : (Ljava/lang/Object;)Z
    //   544: ifne -> 666
    //   547: aload_2
    //   548: astore #4
    //   550: aload_0
    //   551: getfield g : Lcom/allinone/callerid/b/d$b;
    //   554: getfield e : Landroid/widget/TextView;
    //   557: aload_0
    //   558: aload_3
    //   559: invokevirtual h : ()Ljava/lang/String;
    //   562: invokespecial c : (Ljava/lang/String;)Ljava/lang/String;
    //   565: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   568: aload_2
    //   569: astore #4
    //   571: aload_0
    //   572: getfield g : Lcom/allinone/callerid/b/d$b;
    //   575: getfield e : Landroid/widget/TextView;
    //   578: aload_0
    //   579: getfield b : I
    //   582: invokevirtual setTextColor : (I)V
    //   585: goto -> 666
    //   588: aload_2
    //   589: astore #4
    //   591: aload_0
    //   592: getfield g : Lcom/allinone/callerid/b/d$b;
    //   595: getfield b : Landroid/widget/ImageView;
    //   598: ldc 2131231071
    //   600: invokevirtual setBackgroundResource : (I)V
    //   603: aload_2
    //   604: astore #4
    //   606: aload_3
    //   607: invokevirtual h : ()Ljava/lang/String;
    //   610: ifnull -> 666
    //   613: aload_2
    //   614: astore #4
    //   616: ldc ''
    //   618: aload_3
    //   619: invokevirtual h : ()Ljava/lang/String;
    //   622: invokevirtual equals : (Ljava/lang/Object;)Z
    //   625: ifne -> 666
    //   628: aload_2
    //   629: astore #4
    //   631: aload_0
    //   632: getfield g : Lcom/allinone/callerid/b/d$b;
    //   635: getfield e : Landroid/widget/TextView;
    //   638: aload_0
    //   639: aload_3
    //   640: invokevirtual h : ()Ljava/lang/String;
    //   643: invokespecial c : (Ljava/lang/String;)Ljava/lang/String;
    //   646: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   649: aload_2
    //   650: astore #4
    //   652: aload_0
    //   653: getfield g : Lcom/allinone/callerid/b/d$b;
    //   656: getfield e : Landroid/widget/TextView;
    //   659: aload_0
    //   660: getfield b : I
    //   663: invokevirtual setTextColor : (I)V
    //   666: aload_2
    //   667: astore #4
    //   669: aload_3
    //   670: invokevirtual i : ()Ljava/lang/String;
    //   673: ifnull -> 711
    //   676: aload_2
    //   677: astore #4
    //   679: ldc ''
    //   681: aload_3
    //   682: invokevirtual i : ()Ljava/lang/String;
    //   685: invokevirtual equals : (Ljava/lang/Object;)Z
    //   688: ifne -> 711
    //   691: aload_2
    //   692: astore #4
    //   694: aload_0
    //   695: getfield g : Lcom/allinone/callerid/b/d$b;
    //   698: getfield c : Landroid/widget/TextView;
    //   701: aload_3
    //   702: invokevirtual i : ()Ljava/lang/String;
    //   705: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   708: goto -> 794
    //   711: aload_2
    //   712: astore #4
    //   714: aload_3
    //   715: invokevirtual p : ()Ljava/lang/String;
    //   718: ifnull -> 769
    //   721: aload_2
    //   722: astore #4
    //   724: ldc ''
    //   726: aload_3
    //   727: invokevirtual p : ()Ljava/lang/String;
    //   730: invokevirtual equals : (Ljava/lang/Object;)Z
    //   733: ifne -> 769
    //   736: aload_2
    //   737: astore #4
    //   739: aload_3
    //   740: invokevirtual p : ()Ljava/lang/String;
    //   743: invokestatic v0 : (Ljava/lang/String;)Z
    //   746: ifne -> 769
    //   749: aload_2
    //   750: astore #4
    //   752: aload_0
    //   753: getfield g : Lcom/allinone/callerid/b/d$b;
    //   756: getfield c : Landroid/widget/TextView;
    //   759: aload_3
    //   760: invokevirtual p : ()Ljava/lang/String;
    //   763: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   766: goto -> 794
    //   769: aload_2
    //   770: astore #4
    //   772: aload_0
    //   773: getfield g : Lcom/allinone/callerid/b/d$b;
    //   776: getfield c : Landroid/widget/TextView;
    //   779: aload_0
    //   780: getfield d : Landroid/content/Context;
    //   783: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   786: ldc 2131755829
    //   788: invokevirtual getString : (I)Ljava/lang/String;
    //   791: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   794: aload_2
    //   795: astore #4
    //   797: aload_3
    //   798: invokevirtual g : ()Ljava/lang/String;
    //   801: ifnull -> 836
    //   804: aload_2
    //   805: astore #4
    //   807: ldc ''
    //   809: aload_3
    //   810: invokevirtual g : ()Ljava/lang/String;
    //   813: invokevirtual equals : (Ljava/lang/Object;)Z
    //   816: ifne -> 836
    //   819: aload_2
    //   820: astore #4
    //   822: aload_0
    //   823: getfield g : Lcom/allinone/callerid/b/d$b;
    //   826: getfield d : Landroid/widget/TextView;
    //   829: aload_3
    //   830: invokevirtual g : ()Ljava/lang/String;
    //   833: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   836: aload_2
    //   837: astore #4
    //   839: aload_0
    //   840: getfield g : Lcom/allinone/callerid/b/d$b;
    //   843: getfield a : Landroid/widget/FrameLayout;
    //   846: astore #6
    //   848: aload_2
    //   849: astore #4
    //   851: new com/allinone/callerid/b/d$a
    //   854: astore_3
    //   855: aload_2
    //   856: astore #4
    //   858: aload_3
    //   859: aload_0
    //   860: iload_1
    //   861: invokespecial <init> : (Lcom/allinone/callerid/b/d;I)V
    //   864: aload_2
    //   865: astore #4
    //   867: aload #6
    //   869: aload_3
    //   870: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   873: goto -> 884
    //   876: astore_2
    //   877: aload_2
    //   878: invokevirtual printStackTrace : ()V
    //   881: aload #4
    //   883: astore_2
    //   884: aload_2
    //   885: areturn
    // Exception table:
    //   from	to	target	type
    //   7	19	876	java/lang/Exception
    //   22	26	876	java/lang/Exception
    //   29	34	876	java/lang/Exception
    //   37	42	876	java/lang/Exception
    //   45	58	876	java/lang/Exception
    //   61	77	876	java/lang/Exception
    //   80	96	876	java/lang/Exception
    //   99	115	876	java/lang/Exception
    //   118	134	876	java/lang/Exception
    //   137	150	876	java/lang/Exception
    //   153	166	876	java/lang/Exception
    //   169	182	876	java/lang/Exception
    //   185	193	876	java/lang/Exception
    //   199	210	876	java/lang/Exception
    //   213	227	876	java/lang/Exception
    //   230	236	876	java/lang/Exception
    //   270	282	876	java/lang/Exception
    //   285	307	876	java/lang/Exception
    //   310	324	876	java/lang/Exception
    //   330	342	876	java/lang/Exception
    //   345	367	876	java/lang/Exception
    //   370	384	876	java/lang/Exception
    //   390	402	876	java/lang/Exception
    //   405	427	876	java/lang/Exception
    //   430	444	876	java/lang/Exception
    //   450	462	876	java/lang/Exception
    //   465	487	876	java/lang/Exception
    //   490	504	876	java/lang/Exception
    //   510	522	876	java/lang/Exception
    //   525	532	876	java/lang/Exception
    //   535	547	876	java/lang/Exception
    //   550	568	876	java/lang/Exception
    //   571	585	876	java/lang/Exception
    //   591	603	876	java/lang/Exception
    //   606	613	876	java/lang/Exception
    //   616	628	876	java/lang/Exception
    //   631	649	876	java/lang/Exception
    //   652	666	876	java/lang/Exception
    //   669	676	876	java/lang/Exception
    //   679	691	876	java/lang/Exception
    //   694	708	876	java/lang/Exception
    //   714	721	876	java/lang/Exception
    //   724	736	876	java/lang/Exception
    //   739	749	876	java/lang/Exception
    //   752	766	876	java/lang/Exception
    //   772	794	876	java/lang/Exception
    //   797	804	876	java/lang/Exception
    //   807	819	876	java/lang/Exception
    //   822	836	876	java/lang/Exception
    //   839	848	876	java/lang/Exception
    //   851	855	876	java/lang/Exception
    //   858	864	876	java/lang/Exception
    //   867	873	876	java/lang/Exception
  }
  
  class a implements View.OnClickListener {
    a(d this$0, int param1Int) {}
    
    public void onClick(View param1View) {
      q0.a(d.a(this.c), ((CallLogBean)d.b(this.c).get(this.b)).p());
    }
  }
  
  private static class b {
    FrameLayout a;
    
    ImageView b;
    
    TextView c;
    
    TextView d;
    
    TextView e;
    
    private b() {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */