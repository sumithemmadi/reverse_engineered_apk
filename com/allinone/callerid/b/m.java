package com.allinone.callerid.b;

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
import com.allinone.callerid.util.q0;
import java.util.ArrayList;

public class m extends BaseAdapter {
  private Activity b;
  
  private ArrayList<CallLogBean> c;
  
  public m(Activity paramActivity, ArrayList<CallLogBean> paramArrayList) {
    this.b = paramActivity;
    this.c = paramArrayList;
  }
  
  public void b(ArrayList<CallLogBean> paramArrayList) {
    if (paramArrayList == null) {
      this.c = new ArrayList<CallLogBean>();
    } else {
      this.c = paramArrayList;
    } 
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
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 184
    //   4: aload_2
    //   5: astore #4
    //   7: new com/allinone/callerid/b/m$c
    //   10: astore #5
    //   12: aload_2
    //   13: astore #4
    //   15: aload #5
    //   17: invokespecial <init> : ()V
    //   20: aload_2
    //   21: astore #4
    //   23: aload_0
    //   24: getfield b : Landroid/app/Activity;
    //   27: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   30: ldc 2131492976
    //   32: aload_3
    //   33: iconst_0
    //   34: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   37: astore_2
    //   38: aload_2
    //   39: astore #4
    //   41: aload #5
    //   43: aload_2
    //   44: ldc 2131297332
    //   46: invokevirtual findViewById : (I)Landroid/view/View;
    //   49: checkcast android/widget/TextView
    //   52: putfield a : Landroid/widget/TextView;
    //   55: aload_2
    //   56: astore #4
    //   58: aload_2
    //   59: ldc 2131297305
    //   61: invokevirtual findViewById : (I)Landroid/view/View;
    //   64: checkcast android/widget/TextView
    //   67: astore_3
    //   68: aload_2
    //   69: astore #4
    //   71: aload #5
    //   73: aload_3
    //   74: putfield c : Landroid/widget/TextView;
    //   77: aload_2
    //   78: astore #4
    //   80: aload_3
    //   81: iconst_0
    //   82: invokevirtual setVisibility : (I)V
    //   85: aload_2
    //   86: astore #4
    //   88: aload #5
    //   90: aload_2
    //   91: ldc 2131297361
    //   93: invokevirtual findViewById : (I)Landroid/view/View;
    //   96: checkcast android/widget/ImageView
    //   99: putfield b : Landroid/widget/ImageView;
    //   102: aload_2
    //   103: astore #4
    //   105: aload #5
    //   107: aload_2
    //   108: ldc 2131297469
    //   110: invokevirtual findViewById : (I)Landroid/view/View;
    //   113: checkcast android/widget/FrameLayout
    //   116: putfield d : Landroid/widget/FrameLayout;
    //   119: aload_2
    //   120: astore #4
    //   122: aload #5
    //   124: aload_2
    //   125: ldc 2131296445
    //   127: invokevirtual findViewById : (I)Landroid/view/View;
    //   130: checkcast android/widget/ImageView
    //   133: putfield e : Landroid/widget/ImageView;
    //   136: aload #5
    //   138: getfield a : Landroid/widget/TextView;
    //   141: invokestatic b : ()Landroid/graphics/Typeface;
    //   144: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   147: aload #5
    //   149: getfield c : Landroid/widget/TextView;
    //   152: invokestatic b : ()Landroid/graphics/Typeface;
    //   155: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   158: goto -> 169
    //   161: astore_3
    //   162: aload_2
    //   163: astore #4
    //   165: aload_3
    //   166: invokevirtual printStackTrace : ()V
    //   169: aload_2
    //   170: astore #4
    //   172: aload_2
    //   173: aload #5
    //   175: invokevirtual setTag : (Ljava/lang/Object;)V
    //   178: aload #5
    //   180: astore_3
    //   181: goto -> 195
    //   184: aload_2
    //   185: astore #4
    //   187: aload_2
    //   188: invokevirtual getTag : ()Ljava/lang/Object;
    //   191: checkcast com/allinone/callerid/b/m$c
    //   194: astore_3
    //   195: aload_2
    //   196: astore #4
    //   198: aload_0
    //   199: getfield c : Ljava/util/ArrayList;
    //   202: iload_1
    //   203: invokevirtual get : (I)Ljava/lang/Object;
    //   206: checkcast com/allinone/callerid/search/CallLogBean
    //   209: astore #5
    //   211: aload_2
    //   212: astore #4
    //   214: aload #5
    //   216: invokevirtual n : ()Ljava/lang/String;
    //   219: astore #6
    //   221: aload #6
    //   223: ifnull -> 274
    //   226: aload_2
    //   227: astore #4
    //   229: aload #5
    //   231: invokevirtual n : ()Ljava/lang/String;
    //   234: ldc ''
    //   236: invokevirtual equals : (Ljava/lang/Object;)Z
    //   239: ifeq -> 245
    //   242: goto -> 274
    //   245: aload_2
    //   246: astore #4
    //   248: aload_3
    //   249: getfield c : Landroid/widget/TextView;
    //   252: aload #5
    //   254: invokevirtual n : ()Ljava/lang/String;
    //   257: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   260: aload_2
    //   261: astore #4
    //   263: aload_3
    //   264: getfield c : Landroid/widget/TextView;
    //   267: iconst_0
    //   268: invokevirtual setVisibility : (I)V
    //   271: goto -> 342
    //   274: aload_2
    //   275: astore #4
    //   277: aload #5
    //   279: invokevirtual y : ()Ljava/lang/String;
    //   282: ifnull -> 330
    //   285: aload_2
    //   286: astore #4
    //   288: ldc ''
    //   290: aload #5
    //   292: invokevirtual y : ()Ljava/lang/String;
    //   295: invokevirtual equals : (Ljava/lang/Object;)Z
    //   298: ifne -> 330
    //   301: aload_2
    //   302: astore #4
    //   304: aload_3
    //   305: getfield c : Landroid/widget/TextView;
    //   308: aload #5
    //   310: invokevirtual y : ()Ljava/lang/String;
    //   313: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   316: aload_2
    //   317: astore #4
    //   319: aload_3
    //   320: getfield c : Landroid/widget/TextView;
    //   323: iconst_0
    //   324: invokevirtual setVisibility : (I)V
    //   327: goto -> 342
    //   330: aload_2
    //   331: astore #4
    //   333: aload_3
    //   334: getfield c : Landroid/widget/TextView;
    //   337: bipush #8
    //   339: invokevirtual setVisibility : (I)V
    //   342: aload_2
    //   343: astore #4
    //   345: aload #5
    //   347: invokevirtual p : ()Ljava/lang/String;
    //   350: ifnull -> 391
    //   353: aload_2
    //   354: astore #4
    //   356: ldc ''
    //   358: aload #5
    //   360: invokevirtual p : ()Ljava/lang/String;
    //   363: invokevirtual equals : (Ljava/lang/Object;)Z
    //   366: ifne -> 391
    //   369: aload_2
    //   370: astore #4
    //   372: aload_3
    //   373: getfield a : Landroid/widget/TextView;
    //   376: aload #5
    //   378: invokevirtual p : ()Ljava/lang/String;
    //   381: ldc ' '
    //   383: ldc ''
    //   385: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   388: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   391: aload_2
    //   392: astore #4
    //   394: aload #5
    //   396: invokevirtual u : ()Ljava/lang/String;
    //   399: ifnull -> 463
    //   402: aload_2
    //   403: astore #4
    //   405: ldc ''
    //   407: aload #5
    //   409: invokevirtual u : ()Ljava/lang/String;
    //   412: invokevirtual equals : (Ljava/lang/Object;)Z
    //   415: ifne -> 463
    //   418: aload_2
    //   419: astore #4
    //   421: aload_3
    //   422: getfield b : Landroid/widget/ImageView;
    //   425: ldc 2131231148
    //   427: invokevirtual setImageResource : (I)V
    //   430: aload_2
    //   431: astore #4
    //   433: aload_0
    //   434: getfield b : Landroid/app/Activity;
    //   437: getstatic android/provider/ContactsContract$Contacts.CONTENT_URI : Landroid/net/Uri;
    //   440: aload #5
    //   442: invokevirtual v : ()I
    //   445: i2l
    //   446: invokestatic withAppendedId : (Landroid/net/Uri;J)Landroid/net/Uri;
    //   449: ldc ''
    //   451: ldc 2131231148
    //   453: aload_3
    //   454: getfield b : Landroid/widget/ImageView;
    //   457: invokestatic c : (Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;ILandroid/widget/ImageView;)V
    //   460: goto -> 475
    //   463: aload_2
    //   464: astore #4
    //   466: aload_3
    //   467: getfield b : Landroid/widget/ImageView;
    //   470: ldc 2131231148
    //   472: invokevirtual setImageResource : (I)V
    //   475: aload_2
    //   476: astore #4
    //   478: aload_3
    //   479: getfield e : Landroid/widget/ImageView;
    //   482: astore #6
    //   484: aload_2
    //   485: astore #4
    //   487: new com/allinone/callerid/b/m$a
    //   490: astore #7
    //   492: aload_2
    //   493: astore #4
    //   495: aload #7
    //   497: aload_0
    //   498: aload #5
    //   500: invokespecial <init> : (Lcom/allinone/callerid/b/m;Lcom/allinone/callerid/search/CallLogBean;)V
    //   503: aload_2
    //   504: astore #4
    //   506: aload #6
    //   508: aload #7
    //   510: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   513: aload_2
    //   514: astore #4
    //   516: aload_3
    //   517: getfield d : Landroid/widget/FrameLayout;
    //   520: astore #6
    //   522: aload_2
    //   523: astore #4
    //   525: new com/allinone/callerid/b/m$b
    //   528: astore_3
    //   529: aload_2
    //   530: astore #4
    //   532: aload_3
    //   533: aload_0
    //   534: aload #5
    //   536: invokespecial <init> : (Lcom/allinone/callerid/b/m;Lcom/allinone/callerid/search/CallLogBean;)V
    //   539: aload_2
    //   540: astore #4
    //   542: aload #6
    //   544: aload_3
    //   545: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   548: goto -> 559
    //   551: astore_2
    //   552: aload_2
    //   553: invokevirtual printStackTrace : ()V
    //   556: aload #4
    //   558: astore_2
    //   559: aload_2
    //   560: areturn
    // Exception table:
    //   from	to	target	type
    //   7	12	551	java/lang/Exception
    //   15	20	551	java/lang/Exception
    //   23	38	551	java/lang/Exception
    //   41	55	551	java/lang/Exception
    //   58	68	551	java/lang/Exception
    //   71	77	551	java/lang/Exception
    //   80	85	551	java/lang/Exception
    //   88	102	551	java/lang/Exception
    //   105	119	551	java/lang/Exception
    //   122	136	551	java/lang/Exception
    //   136	158	161	java/lang/Exception
    //   165	169	551	java/lang/Exception
    //   172	178	551	java/lang/Exception
    //   187	195	551	java/lang/Exception
    //   198	211	551	java/lang/Exception
    //   214	221	551	java/lang/Exception
    //   229	242	551	java/lang/Exception
    //   248	260	551	java/lang/Exception
    //   263	271	551	java/lang/Exception
    //   277	285	551	java/lang/Exception
    //   288	301	551	java/lang/Exception
    //   304	316	551	java/lang/Exception
    //   319	327	551	java/lang/Exception
    //   333	342	551	java/lang/Exception
    //   345	353	551	java/lang/Exception
    //   356	369	551	java/lang/Exception
    //   372	391	551	java/lang/Exception
    //   394	402	551	java/lang/Exception
    //   405	418	551	java/lang/Exception
    //   421	430	551	java/lang/Exception
    //   433	460	551	java/lang/Exception
    //   466	475	551	java/lang/Exception
    //   478	484	551	java/lang/Exception
    //   487	492	551	java/lang/Exception
    //   495	503	551	java/lang/Exception
    //   506	513	551	java/lang/Exception
    //   516	522	551	java/lang/Exception
    //   525	529	551	java/lang/Exception
    //   532	539	551	java/lang/Exception
    //   542	548	551	java/lang/Exception
  }
  
  class a implements View.OnClickListener {
    a(m this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      q0.a((Context)m.a(this.c), this.b.p());
    }
  }
  
  class b implements View.OnClickListener {
    b(m this$0, CallLogBean param1CallLogBean) {}
    
    public void onClick(View param1View) {
      if (this.b.T()) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("contact_tony", (Parcelable)this.b);
        intent.putExtras(bundle);
        intent.setClass((Context)m.a(this.c), ContactActivity.class);
        m.a(this.c).startActivity(intent);
        m.a(this.c).overridePendingTransition(2130771968, 2130771969);
      } else {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("contact_tony", (Parcelable)this.b);
        intent.putExtras(bundle);
        intent.setClass((Context)m.a(this.c), UnknownContactActivity.class);
        m.a(this.c).startActivity(intent);
        m.a(this.c).overridePendingTransition(2130771968, 2130771969);
      } 
    }
  }
  
  public static class c {
    TextView a;
    
    ImageView b;
    
    TextView c;
    
    FrameLayout d;
    
    ImageView e;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */