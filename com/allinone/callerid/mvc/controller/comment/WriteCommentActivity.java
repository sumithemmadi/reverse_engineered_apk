package com.allinone.callerid.mvc.controller.comment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.CommentContent;
import com.allinone.callerid.i.a.f.m;
import com.allinone.callerid.i.a.f.o;
import com.allinone.callerid.i.a.i.g;
import com.allinone.callerid.main.BaseActivity;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;
import org.json.JSONObject;

public class WriteCommentActivity extends BaseActivity implements View.OnClickListener {
  private EditText A;
  
  private String B;
  
  private String C;
  
  private ImageView D;
  
  private ImageView E;
  
  private ImageView F;
  
  private ImageView G;
  
  private boolean H;
  
  private String I = "";
  
  private String J;
  
  private String K;
  
  private String L;
  
  private FrameLayout M;
  
  private TextView N;
  
  private FrameLayout O;
  
  private com.allinone.callerid.dialog.b P;
  
  private com.allinone.callerid.dialog.a Q;
  
  private ImageView R;
  
  private boolean S;
  
  private boolean T = true;
  
  private int U;
  
  private int V;
  
  private int W;
  
  private int X;
  
  private int Y;
  
  private int Z;
  
  private TextWatcher a0;
  
  private final String s = "WriteCommentActivity";
  
  private Typeface t;
  
  private TextView u;
  
  private TextView v;
  
  private TextView w;
  
  private TextView x;
  
  private TextView y;
  
  private TextView z;
  
  private void h0() {
    String str = this.A.getText().toString();
    if (str != null) {
      if (!"".equals(str)) {
        q.b().c("submit_has_comment");
        if (str.length() < 5) {
          this.N.setText(getResources().getString(2131755218));
          this.M.setVisibility(0);
          this.O.setBackgroundResource(2131230828);
          this.z.setTextColor(this.U);
          q.b().c("submit_comment_least");
          return;
        } 
        if (str.contains("http") || str.contains("wwww")) {
          this.N.setText(getResources().getString(2131755208));
          this.M.setVisibility(0);
          this.O.setBackgroundResource(2131230828);
          q.b().c("submit_comment_url");
          return;
        } 
        if (i1.l0(str)) {
          this.N.setText(getResources().getString(2131755217));
          this.M.setVisibility(0);
          this.O.setBackgroundResource(2131230828);
          q.b().c("submit_comment_special");
          return;
        } 
      } else {
        q.b().c("submit_no_comment");
      } 
      long l = System.currentTimeMillis();
      l0(this.K, str, l);
      o0(getApplicationContext(), this.K, str, l);
      startActivity(new Intent((Context)this, SubmitSuccessActivity.class));
      overridePendingTransition(2130771968, 2130771969);
      Intent intent = new Intent();
      intent.putExtra("typelabel", this.B);
      setResult(301, intent);
      this.T = false;
      finish();
    } 
  }
  
  private void i0() {
    if (this.H) {
      this.Q = new com.allinone.callerid.dialog.a((Context)this, 2131820783, new c(this));
      q.b().c("select_dialog_show");
      this.Q.show();
    } else {
      com.allinone.callerid.dialog.b b1 = new com.allinone.callerid.dialog.b((Context)this, 2131820783, new d(this));
      this.P = b1;
      b1.show();
      q.b().c("unselect_dialog_show");
    } 
  }
  
  private void j0(IBinder paramIBinder) {
    if (paramIBinder != null)
      try {
        InputMethodManager inputMethodManager = (InputMethodManager)getSystemService("input_method");
        if (inputMethodManager != null)
          inputMethodManager.hideSoftInputFromWindow(paramIBinder, 2); 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  private void k0() {
    this.U = d1.a((Context)this, 2130968873, 2131099745);
    this.V = d1.a((Context)this, 2130968856, 2131099723);
    this.W = d1.a((Context)this, 2130968859, 2131099706);
    this.X = d1.a((Context)this, 2130968857, 2131099725);
    this.Y = d1.a((Context)this, 2130968874, 2131099922);
    this.Z = d1.b((Context)this, 2130968675, 2131230826);
    this.u = (TextView)findViewById(2131297857);
    this.v = (TextView)findViewById(2131298011);
    this.w = (TextView)findViewById(2131298136);
    this.x = (TextView)findViewById(2131298100);
    this.y = (TextView)findViewById(2131298169);
    this.z = (TextView)findViewById(2131297968);
    this.A = (EditText)findViewById(2131296658);
    this.M = (FrameLayout)findViewById(2131297488);
    this.O = (FrameLayout)findViewById(2131297499);
    this.N = (TextView)findViewById(2131297856);
    FrameLayout frameLayout1 = (FrameLayout)findViewById(2131296763);
    FrameLayout frameLayout2 = (FrameLayout)findViewById(2131296798);
    FrameLayout frameLayout3 = (FrameLayout)findViewById(2131296780);
    FrameLayout frameLayout4 = (FrameLayout)findViewById(2131296800);
    this.R.setAlpha(0.4F);
    this.D = (ImageView)findViewById(2131296912);
    this.E = (ImageView)findViewById(2131296914);
    this.F = (ImageView)findViewById(2131296913);
    this.G = (ImageView)findViewById(2131296917);
    FrameLayout frameLayout5 = (FrameLayout)findViewById(2131297489);
    FrameLayout frameLayout6 = (FrameLayout)findViewById(2131297541);
    View view = findViewById(2131298254);
    frameLayout1.setOnClickListener(this);
    frameLayout2.setOnClickListener(this);
    frameLayout3.setOnClickListener(this);
    frameLayout4.setOnClickListener(this);
    this.R.setOnClickListener(this);
    frameLayout5.setOnClickListener(this);
    frameLayout6.setOnClickListener(this);
    view.setOnClickListener(this);
    this.u.setTypeface(this.t);
    this.v.setTypeface(this.t);
    this.w.setTypeface(this.t);
    this.x.setTypeface(this.t);
    this.y.setTypeface(this.t);
    this.z.setTypeface(this.t);
    this.A.setTypeface(this.t);
    this.N.setTypeface(this.t);
    b b1 = new b(this);
    this.a0 = b1;
    this.A.addTextChangedListener(b1);
  }
  
  private void l0(String paramString1, String paramString2, long paramLong) {
    CommentContent commentContent = new CommentContent();
    commentContent.setTel_number(paramString1);
    commentContent.setType_label(this.B);
    commentContent.setAuthor(getApplicationContext().getResources().getString(2131755871));
    commentContent.setCreate_time(i.d(paramLong));
    commentContent.setContent(paramString2);
    commentContent.setT_p(this.J);
    com.allinone.callerid.i.a.i.a.b(commentContent, new f(this, paramString1, paramString2));
  }
  
  private void m0() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getIntent : ()Landroid/content/Intent;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 930
    //   9: aload_1
    //   10: ldc_w 'number_content'
    //   13: invokevirtual getParcelableExtra : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   16: checkcast com/allinone/callerid/search/CallLogBean
    //   19: astore_2
    //   20: aload_2
    //   21: ifnull -> 930
    //   24: aload_0
    //   25: aload_2
    //   26: invokevirtual O : ()Ljava/lang/String;
    //   29: putfield C : Ljava/lang/String;
    //   32: aload_2
    //   33: invokevirtual x : ()Ljava/lang/String;
    //   36: astore_1
    //   37: aload_0
    //   38: aload_2
    //   39: invokevirtual I : ()Ljava/lang/String;
    //   42: putfield J : Ljava/lang/String;
    //   45: aload_0
    //   46: aload_2
    //   47: invokevirtual p : ()Ljava/lang/String;
    //   50: putfield K : Ljava/lang/String;
    //   53: aload_0
    //   54: getfield C : Ljava/lang/String;
    //   57: astore_3
    //   58: aload_3
    //   59: ifnull -> 930
    //   62: ldc ''
    //   64: aload_3
    //   65: invokevirtual equals : (Ljava/lang/Object;)Z
    //   68: ifne -> 930
    //   71: getstatic com/allinone/callerid/util/d0.a : Z
    //   74: ifeq -> 112
    //   77: new java/lang/StringBuilder
    //   80: astore_3
    //   81: aload_3
    //   82: invokespecial <init> : ()V
    //   85: aload_3
    //   86: ldc_w 'typelabel_id:'
    //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: aload_3
    //   94: aload_0
    //   95: getfield C : Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: ldc_w 'comment'
    //   105: aload_3
    //   106: invokevirtual toString : ()Ljava/lang/String;
    //   109: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   112: aload_0
    //   113: getfield C : Ljava/lang/String;
    //   116: astore_3
    //   117: aload_3
    //   118: invokevirtual hashCode : ()I
    //   121: istore #4
    //   123: iload #4
    //   125: ldc_w 2570908
    //   128: if_icmpeq -> 182
    //   131: iload #4
    //   133: ldc_w 2583401
    //   136: if_icmpeq -> 166
    //   139: iload #4
    //   141: ldc_w 1172387228
    //   144: if_icmpeq -> 150
    //   147: goto -> 198
    //   150: aload_3
    //   151: ldc_w 'Telemarketing'
    //   154: invokevirtual equals : (Ljava/lang/Object;)Z
    //   157: ifeq -> 198
    //   160: iconst_2
    //   161: istore #4
    //   163: goto -> 201
    //   166: aload_3
    //   167: ldc_w 'Spam'
    //   170: invokevirtual equals : (Ljava/lang/Object;)Z
    //   173: ifeq -> 198
    //   176: iconst_0
    //   177: istore #4
    //   179: goto -> 201
    //   182: aload_3
    //   183: ldc_w 'Scam'
    //   186: invokevirtual equals : (Ljava/lang/Object;)Z
    //   189: ifeq -> 198
    //   192: iconst_1
    //   193: istore #4
    //   195: goto -> 201
    //   198: iconst_m1
    //   199: istore #4
    //   201: iload #4
    //   203: ifeq -> 526
    //   206: iload #4
    //   208: iconst_1
    //   209: if_icmpeq -> 363
    //   212: iload #4
    //   214: iconst_2
    //   215: if_icmpeq -> 221
    //   218: goto -> 665
    //   221: aload_0
    //   222: ldc_w 'is_telemarketing'
    //   225: putfield I : Ljava/lang/String;
    //   228: aload_0
    //   229: ldc_w 'Telemarketing'
    //   232: putfield B : Ljava/lang/String;
    //   235: aload_0
    //   236: iconst_1
    //   237: putfield H : Z
    //   240: aload_0
    //   241: ldc ''
    //   243: putfield L : Ljava/lang/String;
    //   246: aload_0
    //   247: iconst_1
    //   248: putfield S : Z
    //   251: aload_0
    //   252: getfield A : Landroid/widget/EditText;
    //   255: aload_0
    //   256: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   259: ldc_w 2131755207
    //   262: invokevirtual getString : (I)Ljava/lang/String;
    //   265: invokevirtual setHint : (Ljava/lang/CharSequence;)V
    //   268: aload_0
    //   269: getfield D : Landroid/widget/ImageView;
    //   272: ldc_w 2131230949
    //   275: invokevirtual setImageResource : (I)V
    //   278: aload_0
    //   279: getfield v : Landroid/widget/TextView;
    //   282: aload_0
    //   283: getfield V : I
    //   286: invokevirtual setTextColor : (I)V
    //   289: aload_0
    //   290: getfield F : Landroid/widget/ImageView;
    //   293: ldc_w 2131230950
    //   296: invokevirtual setImageResource : (I)V
    //   299: aload_0
    //   300: getfield x : Landroid/widget/TextView;
    //   303: aload_0
    //   304: getfield V : I
    //   307: invokevirtual setTextColor : (I)V
    //   310: aload_0
    //   311: getfield E : Landroid/widget/ImageView;
    //   314: ldc_w 2131230952
    //   317: invokevirtual setImageResource : (I)V
    //   320: aload_0
    //   321: getfield w : Landroid/widget/TextView;
    //   324: aload_0
    //   325: getfield V : I
    //   328: invokevirtual setTextColor : (I)V
    //   331: aload_0
    //   332: getfield G : Landroid/widget/ImageView;
    //   335: ldc_w 2131230955
    //   338: invokevirtual setImageResource : (I)V
    //   341: aload_0
    //   342: getfield y : Landroid/widget/TextView;
    //   345: aload_0
    //   346: getfield U : I
    //   349: invokevirtual setTextColor : (I)V
    //   352: aload_0
    //   353: getfield R : Landroid/widget/ImageView;
    //   356: fconst_1
    //   357: invokevirtual setAlpha : (F)V
    //   360: goto -> 665
    //   363: aload_0
    //   364: ldc_w 'is_scam'
    //   367: putfield I : Ljava/lang/String;
    //   370: aload_0
    //   371: ldc_w 'Scam'
    //   374: putfield B : Ljava/lang/String;
    //   377: aload_0
    //   378: iconst_1
    //   379: putfield H : Z
    //   382: aload_0
    //   383: ldc ''
    //   385: putfield L : Ljava/lang/String;
    //   388: aload_0
    //   389: getfield C : Ljava/lang/String;
    //   392: astore_3
    //   393: aload_3
    //   394: ifnull -> 409
    //   397: ldc ''
    //   399: aload_3
    //   400: invokevirtual equals : (Ljava/lang/Object;)Z
    //   403: ifne -> 409
    //   406: goto -> 414
    //   409: aload_0
    //   410: iconst_1
    //   411: putfield S : Z
    //   414: aload_0
    //   415: getfield A : Landroid/widget/EditText;
    //   418: aload_0
    //   419: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   422: ldc_w 2131755207
    //   425: invokevirtual getString : (I)Ljava/lang/String;
    //   428: invokevirtual setHint : (Ljava/lang/CharSequence;)V
    //   431: aload_0
    //   432: getfield D : Landroid/widget/ImageView;
    //   435: ldc_w 2131230949
    //   438: invokevirtual setImageResource : (I)V
    //   441: aload_0
    //   442: getfield v : Landroid/widget/TextView;
    //   445: aload_0
    //   446: getfield V : I
    //   449: invokevirtual setTextColor : (I)V
    //   452: aload_0
    //   453: getfield F : Landroid/widget/ImageView;
    //   456: ldc_w 2131230951
    //   459: invokevirtual setImageResource : (I)V
    //   462: aload_0
    //   463: getfield x : Landroid/widget/TextView;
    //   466: aload_0
    //   467: getfield U : I
    //   470: invokevirtual setTextColor : (I)V
    //   473: aload_0
    //   474: getfield E : Landroid/widget/ImageView;
    //   477: ldc_w 2131230952
    //   480: invokevirtual setImageResource : (I)V
    //   483: aload_0
    //   484: getfield w : Landroid/widget/TextView;
    //   487: aload_0
    //   488: getfield V : I
    //   491: invokevirtual setTextColor : (I)V
    //   494: aload_0
    //   495: getfield G : Landroid/widget/ImageView;
    //   498: ldc_w 2131230954
    //   501: invokevirtual setImageResource : (I)V
    //   504: aload_0
    //   505: getfield y : Landroid/widget/TextView;
    //   508: aload_0
    //   509: getfield V : I
    //   512: invokevirtual setTextColor : (I)V
    //   515: aload_0
    //   516: getfield R : Landroid/widget/ImageView;
    //   519: fconst_1
    //   520: invokevirtual setAlpha : (F)V
    //   523: goto -> 665
    //   526: aload_0
    //   527: ldc_w 'is_spam'
    //   530: putfield I : Ljava/lang/String;
    //   533: aload_0
    //   534: ldc_w 'Spam'
    //   537: putfield B : Ljava/lang/String;
    //   540: aload_0
    //   541: iconst_1
    //   542: putfield H : Z
    //   545: aload_0
    //   546: ldc ''
    //   548: putfield L : Ljava/lang/String;
    //   551: aload_0
    //   552: iconst_1
    //   553: putfield S : Z
    //   556: aload_0
    //   557: getfield A : Landroid/widget/EditText;
    //   560: aload_0
    //   561: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   564: ldc_w 2131755207
    //   567: invokevirtual getString : (I)Ljava/lang/String;
    //   570: invokevirtual setHint : (Ljava/lang/CharSequence;)V
    //   573: aload_0
    //   574: getfield D : Landroid/widget/ImageView;
    //   577: ldc_w 2131230949
    //   580: invokevirtual setImageResource : (I)V
    //   583: aload_0
    //   584: getfield v : Landroid/widget/TextView;
    //   587: aload_0
    //   588: getfield V : I
    //   591: invokevirtual setTextColor : (I)V
    //   594: aload_0
    //   595: getfield F : Landroid/widget/ImageView;
    //   598: ldc_w 2131230950
    //   601: invokevirtual setImageResource : (I)V
    //   604: aload_0
    //   605: getfield x : Landroid/widget/TextView;
    //   608: aload_0
    //   609: getfield V : I
    //   612: invokevirtual setTextColor : (I)V
    //   615: aload_0
    //   616: getfield E : Landroid/widget/ImageView;
    //   619: ldc_w 2131230953
    //   622: invokevirtual setImageResource : (I)V
    //   625: aload_0
    //   626: getfield w : Landroid/widget/TextView;
    //   629: aload_0
    //   630: getfield U : I
    //   633: invokevirtual setTextColor : (I)V
    //   636: aload_0
    //   637: getfield G : Landroid/widget/ImageView;
    //   640: ldc_w 2131230954
    //   643: invokevirtual setImageResource : (I)V
    //   646: aload_0
    //   647: getfield y : Landroid/widget/TextView;
    //   650: aload_0
    //   651: getfield V : I
    //   654: invokevirtual setTextColor : (I)V
    //   657: aload_0
    //   658: getfield R : Landroid/widget/ImageView;
    //   661: fconst_1
    //   662: invokevirtual setAlpha : (F)V
    //   665: aload_0
    //   666: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   669: ldc_w 2131755222
    //   672: invokevirtual getString : (I)Ljava/lang/String;
    //   675: astore #5
    //   677: new java/lang/StringBuilder
    //   680: astore_3
    //   681: aload_3
    //   682: invokespecial <init> : ()V
    //   685: aload_3
    //   686: ldc_w '<font color=''
    //   689: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   692: pop
    //   693: aload_3
    //   694: aload_0
    //   695: getfield Y : I
    //   698: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   701: pop
    //   702: aload_3
    //   703: ldc_w ''>'
    //   706: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   709: pop
    //   710: aload_3
    //   711: ldc_w ' '
    //   714: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   717: pop
    //   718: aload_3
    //   719: aload_2
    //   720: invokevirtual N : ()Ljava/lang/String;
    //   723: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   726: pop
    //   727: aload_3
    //   728: ldc_w '</font>'
    //   731: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   734: pop
    //   735: aload #5
    //   737: ldc_w 'XX'
    //   740: aload_3
    //   741: invokevirtual toString : ()Ljava/lang/String;
    //   744: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   747: astore_2
    //   748: aload_1
    //   749: ifnull -> 842
    //   752: ldc ''
    //   754: aload_1
    //   755: invokevirtual equals : (Ljava/lang/Object;)Z
    //   758: ifne -> 842
    //   761: new java/lang/StringBuilder
    //   764: astore_3
    //   765: aload_3
    //   766: invokespecial <init> : ()V
    //   769: aload_3
    //   770: ldc_w '<font color=''
    //   773: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   776: pop
    //   777: aload_3
    //   778: aload_0
    //   779: getfield Y : I
    //   782: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   785: pop
    //   786: aload_3
    //   787: ldc_w ''>'
    //   790: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   793: pop
    //   794: aload_3
    //   795: ldc_w ' '
    //   798: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   801: pop
    //   802: aload_3
    //   803: aload_1
    //   804: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   807: pop
    //   808: aload_3
    //   809: ldc_w '</font>'
    //   812: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   815: pop
    //   816: aload_2
    //   817: ldc_w 'X'
    //   820: aload_3
    //   821: invokevirtual toString : ()Ljava/lang/String;
    //   824: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   827: astore_1
    //   828: aload_0
    //   829: getfield u : Landroid/widget/TextView;
    //   832: aload_1
    //   833: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   836: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   839: goto -> 930
    //   842: new java/lang/StringBuilder
    //   845: astore_1
    //   846: aload_1
    //   847: invokespecial <init> : ()V
    //   850: aload_1
    //   851: ldc_w '<font color=''
    //   854: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   857: pop
    //   858: aload_1
    //   859: aload_0
    //   860: getfield Y : I
    //   863: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   866: pop
    //   867: aload_1
    //   868: ldc_w ''>'
    //   871: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   874: pop
    //   875: aload_1
    //   876: ldc_w ' '
    //   879: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   882: pop
    //   883: aload_1
    //   884: ldc_w '10'
    //   887: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   890: pop
    //   891: aload_1
    //   892: ldc_w '</font>'
    //   895: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   898: pop
    //   899: aload_2
    //   900: ldc_w 'X'
    //   903: aload_1
    //   904: invokevirtual toString : ()Ljava/lang/String;
    //   907: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   910: astore_1
    //   911: aload_0
    //   912: getfield u : Landroid/widget/TextView;
    //   915: aload_1
    //   916: invokestatic fromHtml : (Ljava/lang/String;)Landroid/text/Spanned;
    //   919: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   922: goto -> 930
    //   925: astore_1
    //   926: aload_1
    //   927: invokevirtual printStackTrace : ()V
    //   930: return
    // Exception table:
    //   from	to	target	type
    //   0	5	925	java/lang/Exception
    //   9	20	925	java/lang/Exception
    //   24	58	925	java/lang/Exception
    //   62	112	925	java/lang/Exception
    //   112	123	925	java/lang/Exception
    //   150	160	925	java/lang/Exception
    //   166	176	925	java/lang/Exception
    //   182	192	925	java/lang/Exception
    //   221	360	925	java/lang/Exception
    //   363	393	925	java/lang/Exception
    //   397	406	925	java/lang/Exception
    //   409	414	925	java/lang/Exception
    //   414	523	925	java/lang/Exception
    //   526	665	925	java/lang/Exception
    //   665	748	925	java/lang/Exception
    //   752	839	925	java/lang/Exception
    //   842	922	925	java/lang/Exception
  }
  
  private void n0() {
    InputMethodManager inputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (inputMethodManager != null) {
      this.A.requestFocus();
      inputMethodManager.showSoftInput((View)this.A, 0);
    } 
  }
  
  private void o0(Context paramContext, String paramString1, String paramString2, long paramLong) {
    m.a(paramContext, paramString1, new e(this, paramString1, paramLong, paramString2));
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131298254:
        j0(paramView.getWindowToken());
      case 2131297541:
        j0(paramView.getWindowToken());
      case 2131297489:
        j0(paramView.getWindowToken());
      case 2131296873:
        try {
          boolean bool = this.H;
          if (bool) {
            if (i1.a(getApplicationContext())) {
              h0();
              q.b().c("submit_comment_click");
            } else {
              Toast.makeText(getApplicationContext(), 2131755688, 0).show();
            } 
            CollectInfo collectInfo = new CollectInfo();
            this();
            collectInfo.setNumber(this.K);
            collectInfo.setUser_blocked("0");
            collectInfo.setUser_commented("1");
            if (this.S) {
              collectInfo.setUser_reported("1");
            } else {
              collectInfo.setUser_reported("0");
            } 
            collectInfo.setUser_upload_recording("0");
            com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
          } else {
            String str1 = this.A.getText().toString();
            if (str1 != null && !"".equals(str1)) {
              if (i1.a(getApplicationContext())) {
                h0();
                q.b().c("submit_comment_click");
              } else {
                Toast.makeText(getApplicationContext(), 2131755688, 0).show();
              } 
              CollectInfo collectInfo = new CollectInfo();
              this();
              collectInfo.setNumber(this.K);
              collectInfo.setUser_blocked("0");
              collectInfo.setUser_commented("1");
              collectInfo.setUser_reported("0");
              collectInfo.setUser_upload_recording("0");
              com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131296800:
        this.I = "is_telemarketing";
        this.B = "Telemarketing";
        this.H = true;
        this.L = "";
        str = this.C;
        if (str == null || "".equals(str))
          this.S = true; 
        this.A.setHint(getResources().getString(2131755207));
        this.D.setImageResource(2131230949);
        this.v.setTextColor(this.V);
        this.F.setImageResource(2131230950);
        this.x.setTextColor(this.V);
        this.E.setImageResource(2131230952);
        this.w.setTextColor(this.V);
        this.G.setImageResource(2131230955);
        this.y.setTextColor(this.U);
        this.R.setAlpha(1.0F);
        n0();
        this.A.setHint(getResources().getString(2131755207));
        q.b().c("type_select");
      case 2131296798:
        this.I = "is_spam";
        this.B = "Spam";
        this.H = true;
        this.L = "";
        str = this.C;
        if (str == null || "".equals(str))
          this.S = true; 
        this.A.setHint(getResources().getString(2131755207));
        this.D.setImageResource(2131230949);
        this.v.setTextColor(this.V);
        this.F.setImageResource(2131230950);
        this.x.setTextColor(this.V);
        this.E.setImageResource(2131230953);
        this.w.setTextColor(this.U);
        this.G.setImageResource(2131230954);
        this.y.setTextColor(this.V);
        this.R.setAlpha(1.0F);
        n0();
        this.A.setHint(getResources().getString(2131755207));
        q.b().c("type_select");
      case 2131296780:
        this.I = "is_scam";
        this.B = "Scam";
        this.H = true;
        this.L = "";
        str = this.C;
        if (str == null || "".equals(str))
          this.S = true; 
        this.A.setHint(getResources().getString(2131755207));
        this.D.setImageResource(2131230949);
        this.v.setTextColor(this.V);
        this.F.setImageResource(2131230951);
        this.x.setTextColor(this.U);
        this.E.setImageResource(2131230952);
        this.w.setTextColor(this.V);
        this.G.setImageResource(2131230954);
        this.y.setTextColor(this.V);
        this.R.setAlpha(1.0F);
        n0();
        this.A.setHint(getResources().getString(2131755207));
        q.b().c("type_select");
      case 2131296763:
        break;
    } 
    String str = this.C;
    if (str != null && !"".equals(str)) {
      this.L = "1";
    } else {
      this.L = "0";
    } 
    this.I = "";
    this.B = "";
    this.H = true;
    this.A.setHint(getResources().getString(2131755206));
    this.D.setImageResource(2131230948);
    this.v.setTextColor(this.W);
    this.F.setImageResource(2131230950);
    this.x.setTextColor(this.V);
    this.E.setImageResource(2131230952);
    this.w.setTextColor(this.V);
    this.G.setImageResource(2131230954);
    this.y.setTextColor(this.V);
    this.R.setAlpha(1.0F);
    n0();
    this.A.setHint(getResources().getString(2131755206));
    q.b().c("type_select");
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    try {
      setContentView(2131492965);
      if (i1.f0(getApplicationContext()).booleanValue() && Build.VERSION.SDK_INT >= 17)
        getWindow().getDecorView().setLayoutDirection(1); 
      View view = getWindow().getDecorView();
      a a1 = new a();
      this(this);
      view.post(a1);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  protected void onDestroy() {
    super.onDestroy();
    try {
      if (this.T) {
        q.b().c("submit_comment_drop_out");
        if (this.H) {
          q.b().c("drop_out_select_type");
        } else if (!"".equals(this.A.getText().toString())) {
          q.b().c("drop_out_write_text");
        } else {
          q.b().c("drop_out_unselect");
        } 
      } 
      this.A.removeTextChangedListener(this.a0);
      this.a0 = null;
      this.A.setOnEditorActionListener(null);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4) {
      i0();
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause() {
    super.onPause();
  }
  
  protected void onResume() {
    super.onResume();
  }
  
  class a implements Runnable {
    a(WriteCommentActivity this$0) {}
    
    public void run() {
      WriteCommentActivity.P(this.b, g1.b());
      q.b().c("submit_comment_show");
      TextView textView = (TextView)this.b.findViewById(2131298188);
      ImageView imageView = (ImageView)this.b.findViewById(2131296850);
      WriteCommentActivity writeCommentActivity = this.b;
      WriteCommentActivity.S(writeCommentActivity, (ImageView)writeCommentActivity.findViewById(2131296873));
      if (i1.f0(this.b.getApplicationContext()).booleanValue())
        imageView.setImageResource(2131231059); 
      imageView.setOnClickListener(new a(this));
      textView.setTypeface(WriteCommentActivity.O(this.b));
      WriteCommentActivity.a0(this.b);
      WriteCommentActivity.b0(this.b);
    }
    
    class a implements View.OnClickListener {
      a(WriteCommentActivity.a this$0) {}
      
      public void onClick(View param2View) {
        WriteCommentActivity.Z(this.b.b);
      }
    }
  }
  
  class a implements View.OnClickListener {
    a(WriteCommentActivity this$0) {}
    
    public void onClick(View param1View) {
      WriteCommentActivity.Z(this.b.b);
    }
  }
  
  class b implements TextWatcher {
    b(WriteCommentActivity this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      if (d0.a)
        d0.a("comment", "onTextChanged"); 
      if (param1CharSequence != null && !"".equals(param1CharSequence.toString())) {
        q.b().c("write_comment");
        TextView textView = WriteCommentActivity.c0(this.b);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1CharSequence.length());
        stringBuilder.append("/500");
        textView.setText(stringBuilder.toString());
        param1CharSequence = param1CharSequence.toString();
        if (param1CharSequence.length() >= 5 && !param1CharSequence.contains("http") && !param1CharSequence.contains("wwww.") && !i1.l0((String)param1CharSequence)) {
          WriteCommentActivity.d0(this.b).setVisibility(8);
          WriteCommentActivity.f0(this.b).setBackgroundResource(WriteCommentActivity.e0(this.b));
          WriteCommentActivity.c0(this.b).setTextColor(WriteCommentActivity.g0(this.b));
        } else {
          WriteCommentActivity.Q(this.b).setAlpha(1.0F);
        } 
        if (param1CharSequence.length() >= 495) {
          WriteCommentActivity.c0(this.b).setTextColor(WriteCommentActivity.R(this.b));
        } else {
          WriteCommentActivity.c0(this.b).setTextColor(WriteCommentActivity.g0(this.b));
        } 
      } else {
        WriteCommentActivity.c0(this.b).setText("0/500");
      } 
    }
  }
  
  class c implements View.OnClickListener {
    c(WriteCommentActivity this$0) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131296725) {
        if (i == 2131296767) {
          q.b().c("select_dialog_continue");
          WriteCommentActivity.T(this.b).dismiss();
          if (i1.a(this.b.getApplicationContext())) {
            WriteCommentActivity.U(this.b);
          } else {
            Toast.makeText(this.b.getApplicationContext(), 2131755688, 0).show();
          } 
        } 
      } else {
        q.b().c("select_dialog_cancel");
        WriteCommentActivity.T(this.b).dismiss();
        this.b.finish();
        this.b.overridePendingTransition(2130771968, 2130771969);
      } 
    }
  }
  
  class d implements View.OnClickListener {
    d(WriteCommentActivity this$0) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131296725) {
        if (i == 2131296767) {
          q.b().c("unselect_dialog_cancel");
          WriteCommentActivity.V(this.b).dismiss();
        } 
      } else {
        q.b().c("unselect_dialog_ok");
        WriteCommentActivity.V(this.b).dismiss();
        this.b.finish();
        this.b.overridePendingTransition(2130771968, 2130771969);
      } 
    }
  }
  
  class e implements o {
    e(WriteCommentActivity this$0, String param1String1, long param1Long, String param1String2) {}
    
    public void a(String param1String1, String param1String2) {
      if (param1String1 != null && !"".equals(param1String1) && param1String2 != null && !"".equals(param1String2)) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("call_time:");
          stringBuilder.append(param1String1);
          stringBuilder.append("\n");
          stringBuilder.append("is_answered:");
          stringBuilder.append(param1String2);
          d0.a("submitcomment", stringBuilder.toString());
        } 
      } else {
        param1String1 = "";
        param1String2 = param1String1;
      } 
      g.a(this.a, this.b, param1String1, param1String2, WriteCommentActivity.W(this.d), WriteCommentActivity.X(this.d), this.c, new a(this));
    }
    
    class a implements com.allinone.callerid.i.a.i.f {
      a(WriteCommentActivity.e this$0) {}
      
      public void a(String param2String) {
        if (param2String != null)
          try {
            if (!"".equals(param2String)) {
              JSONObject jSONObject = new JSONObject();
              this(param2String);
              if (jSONObject.getInt("status") == 1) {
                q.b().c("submit_comment_success");
                if (WriteCommentActivity.W(this.a.d).equals("1"))
                  q.b().c("submit_comment_success_isnormal"); 
                if (WriteCommentActivity.Y(this.a.d))
                  q.b().c("submit_comment_success_isspam"); 
              } else {
                q.b().c("submit_comment_fail");
              } 
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          }  
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.i.f {
    a(WriteCommentActivity this$0) {}
    
    public void a(String param1String) {
      if (param1String != null)
        try {
          if (!"".equals(param1String)) {
            JSONObject jSONObject = new JSONObject();
            this(param1String);
            if (jSONObject.getInt("status") == 1) {
              q.b().c("submit_comment_success");
              if (WriteCommentActivity.W(this.a.d).equals("1"))
                q.b().c("submit_comment_success_isnormal"); 
              if (WriteCommentActivity.Y(this.a.d))
                q.b().c("submit_comment_success_isspam"); 
            } else {
              q.b().c("submit_comment_fail");
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
  
  class f implements com.allinone.callerid.i.a.i.c {
    f(WriteCommentActivity this$0, String param1String1, String param1String2) {}
    
    public void a(String param1String) {
      if (param1String != null && "ok".equals(param1String)) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("s:");
          stringBuilder.append(param1String);
          d0.a("comment", stringBuilder.toString());
        } 
        Intent intent = new Intent("com.allinone.callerid.UPDATE_COMMENT");
        b.p.a.a.b(this.c.getApplicationContext()).d(intent);
        com.allinone.callerid.i.a.a0.b.b(this.a, this.b, WriteCommentActivity.X(this.c), new a(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.z.c {
      a(WriteCommentActivity.f this$0) {}
      
      public void a(String param2String) {
        if (param2String != null && "ok".equals(param2String))
          i1.I0(this.a.c.getApplicationContext()); 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.z.c {
    a(WriteCommentActivity this$0) {}
    
    public void a(String param1String) {
      if (param1String != null && "ok".equals(param1String))
        i1.I0(this.a.c.getApplicationContext()); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/mvc/controller/comment/WriteCommentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */