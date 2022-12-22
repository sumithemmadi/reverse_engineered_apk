package com.allinone.callerid.g;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.role.RoleManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.bean.SpamCall;
import com.allinone.callerid.customview.MyLinearLayoutManager;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.contactpdt.ContactActivity;
import com.allinone.callerid.mvc.controller.contactpdt.UnknownContactActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.a1;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.d1;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.g1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.github.clans.fab.FloatingActionButton;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

public class e extends Fragment implements View.OnClickListener {
  private Context A0;
  
  private ConstraintLayout B0;
  
  private FrameLayout C0;
  
  private TextView D0;
  
  private ImageView E0;
  
  private boolean F0 = false;
  
  private ArrayList<CallLogBean> G0 = new ArrayList<CallLogBean>();
  
  private boolean H0;
  
  private int I0;
  
  private boolean J0;
  
  private View K0;
  
  private boolean L0;
  
  private Handler M0 = new Handler();
  
  private Runnable N0 = new m(this);
  
  private boolean O0;
  
  private Handler P0 = new t(this, null);
  
  private MyLinearLayoutManager Q0;
  
  private MainActivity c0;
  
  private LRecyclerView d0;
  
  private com.allinone.callerid.b.t e0;
  
  private List<CallLogBean> f0 = new ArrayList<CallLogBean>();
  
  private List<CallLogBean> g0 = new ArrayList<CallLogBean>();
  
  private List<String> h0 = new ArrayList<String>();
  
  private List<String> i0 = new ArrayList<String>();
  
  private HashMap<String, Integer> j0 = new HashMap<String, Integer>();
  
  private u k0;
  
  private LinearLayout l0;
  
  private ProgressBar m0;
  
  private FloatingActionButton n0;
  
  private ArrayList<SpamCall> o0 = new ArrayList<SpamCall>();
  
  private boolean p0;
  
  private ArrayList<SpamCall> q0 = new ArrayList<SpamCall>();
  
  public s r0;
  
  private boolean s0;
  
  private CallLogBean t0;
  
  private int u0;
  
  private int v0;
  
  private FrameLayout w0;
  
  private ViewStub x0;
  
  public int y0;
  
  private Typeface z0;
  
  private void Q1() {
    try {
      ArrayList<SpamCall> arrayList = this.o0;
      if (arrayList != null && arrayList.size() > 0)
        for (byte b = 0; b < this.o0.size(); b++) {
          SpamCall spamCall = this.o0.get(b);
          if (spamCall.isSelected()) {
            String str = spamCall.getNumber().replace("-", "");
            h h = new h();
            this(this, spamCall, str);
            com.allinone.callerid.i.a.e.b.b(str, h);
          } 
        }  
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void R2() {
    (new r(this)).execute((Object[])new Void[0]);
  }
  
  private void T2() {
    try {
      List<CallLogBean> list = this.f0;
      if (list != null && list.size() > 0) {
        list = this.G0;
        if (list != null && list.size() > 0) {
          this.f0.removeAll(this.G0);
          com.allinone.callerid.b.t t1 = this.e0;
          if (t1 != null) {
            t1.O(this.f0);
            this.e0.i();
          } 
          TextView textView = this.D0;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("0/");
          stringBuilder.append(this.f0.size());
          textView.setText(stringBuilder.toString());
          ArrayList<CallLogBean> arrayList = this.G0;
          c c = new c();
          this(this);
          com.allinone.callerid.i.a.f.i.d(arrayList, c);
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void U2(Cursor paramCursor) {
    // Byte code:
    //   0: getstatic com/allinone/callerid/util/d0.a : Z
    //   3: istore_2
    //   4: ldc_w 'tony'
    //   7: astore_3
    //   8: iload_2
    //   9: ifeq -> 54
    //   12: new java/lang/StringBuilder
    //   15: astore #4
    //   17: aload #4
    //   19: invokespecial <init> : ()V
    //   22: aload #4
    //   24: ldc_w 'load_1:'
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload #4
    //   33: invokestatic currentTimeMillis : ()J
    //   36: invokestatic d : (J)Ljava/lang/String;
    //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: ldc_w 'tony'
    //   46: aload #4
    //   48: invokevirtual toString : ()Ljava/lang/String;
    //   51: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   54: aload_0
    //   55: getfield f0 : Ljava/util/List;
    //   58: invokeinterface clear : ()V
    //   63: aload_0
    //   64: getfield g0 : Ljava/util/List;
    //   67: invokeinterface clear : ()V
    //   72: aload_0
    //   73: getfield h0 : Ljava/util/List;
    //   76: invokeinterface clear : ()V
    //   81: aload_0
    //   82: getfield j0 : Ljava/util/HashMap;
    //   85: invokevirtual clear : ()V
    //   88: new java/text/SimpleDateFormat
    //   91: astore #4
    //   93: aload #4
    //   95: ldc_w 'yyyyMMdd'
    //   98: invokestatic getDefault : ()Ljava/util/Locale;
    //   101: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   104: aload_1
    //   105: invokeinterface moveToNext : ()Z
    //   110: ifeq -> 745
    //   113: new java/util/Date
    //   116: astore #5
    //   118: aload #5
    //   120: aload_1
    //   121: aload_1
    //   122: ldc_w 'date'
    //   125: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   130: invokeinterface getLong : (I)J
    //   135: invokespecial <init> : (J)V
    //   138: aload_1
    //   139: aload_1
    //   140: ldc_w 'number'
    //   143: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   148: invokeinterface getString : (I)Ljava/lang/String;
    //   153: astore #6
    //   155: aload_1
    //   156: aload_1
    //   157: ldc_w 'name'
    //   160: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   165: invokeinterface getString : (I)Ljava/lang/String;
    //   170: astore #7
    //   172: aload_1
    //   173: aload_1
    //   174: ldc_w 'type'
    //   177: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   182: invokeinterface getInt : (I)I
    //   187: istore #8
    //   189: aload_1
    //   190: aload_1
    //   191: ldc_w '_id'
    //   194: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   199: invokeinterface getInt : (I)I
    //   204: istore #9
    //   206: getstatic android/os/Build$VERSION.SDK_INT : I
    //   209: istore #10
    //   211: iload #10
    //   213: bipush #21
    //   215: if_icmplt -> 255
    //   218: aload_1
    //   219: aload_1
    //   220: ldc_w 'photo_id'
    //   223: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   228: invokeinterface getString : (I)Ljava/lang/String;
    //   233: astore #11
    //   235: aload_1
    //   236: aload_1
    //   237: ldc_w 'formatted_number'
    //   240: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   245: invokeinterface getString : (I)Ljava/lang/String;
    //   250: astore #12
    //   252: goto -> 264
    //   255: ldc_w ''
    //   258: astore #11
    //   260: aload #11
    //   262: astore #12
    //   264: aload_1
    //   265: aload_1
    //   266: ldc_w 'numbertype'
    //   269: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   274: invokeinterface getInt : (I)I
    //   279: istore #13
    //   281: aload #4
    //   283: aload #5
    //   285: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   288: astore #14
    //   290: new java/lang/StringBuilder
    //   293: astore #15
    //   295: aload #15
    //   297: invokespecial <init> : ()V
    //   300: aload #15
    //   302: aload #6
    //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: pop
    //   308: aload #15
    //   310: iload #8
    //   312: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   315: pop
    //   316: aload #15
    //   318: aload #14
    //   320: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: pop
    //   324: aload #15
    //   326: ldc_w ''
    //   329: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: pop
    //   333: aload #15
    //   335: invokevirtual toString : ()Ljava/lang/String;
    //   338: astore #16
    //   340: aload_0
    //   341: getfield h0 : Ljava/util/List;
    //   344: aload #16
    //   346: invokeinterface contains : (Ljava/lang/Object;)Z
    //   351: ifeq -> 400
    //   354: aload_0
    //   355: getfield j0 : Ljava/util/HashMap;
    //   358: aload #16
    //   360: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   363: checkcast java/lang/Integer
    //   366: astore #11
    //   368: aload #11
    //   370: ifnull -> 397
    //   373: aload #11
    //   375: invokevirtual intValue : ()I
    //   378: istore #9
    //   380: aload_0
    //   381: getfield j0 : Ljava/util/HashMap;
    //   384: aload #16
    //   386: iload #9
    //   388: iconst_1
    //   389: iadd
    //   390: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   393: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   396: pop
    //   397: goto -> 104
    //   400: aload_0
    //   401: getfield h0 : Ljava/util/List;
    //   404: aload #16
    //   406: invokeinterface add : (Ljava/lang/Object;)Z
    //   411: pop
    //   412: aload_0
    //   413: getfield j0 : Ljava/util/HashMap;
    //   416: aload #16
    //   418: iconst_1
    //   419: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   422: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   425: pop
    //   426: aload_1
    //   427: aload_1
    //   428: ldc_w 'numberlabel'
    //   431: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   436: invokeinterface getString : (I)Ljava/lang/String;
    //   441: astore #14
    //   443: iload #13
    //   445: ifne -> 461
    //   448: aload #14
    //   450: ifnonnull -> 461
    //   453: ldc_w ''
    //   456: astore #14
    //   458: goto -> 479
    //   461: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
    //   464: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   467: iload #13
    //   469: aload #14
    //   471: invokestatic getTypeLabel : (Landroid/content/res/Resources;ILjava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   474: checkcast java/lang/String
    //   477: astore #14
    //   479: aconst_null
    //   480: astore #15
    //   482: iload #10
    //   484: bipush #21
    //   486: if_icmplt -> 509
    //   489: aload_1
    //   490: aload_1
    //   491: ldc_w 'lookup_uri'
    //   494: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   499: invokeinterface getString : (I)Ljava/lang/String;
    //   504: astore #17
    //   506: goto -> 512
    //   509: aconst_null
    //   510: astore #17
    //   512: aload #17
    //   514: ifnull -> 524
    //   517: aload #17
    //   519: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   522: astore #15
    //   524: aload_0
    //   525: getfield O0 : Z
    //   528: ifeq -> 561
    //   531: aload_1
    //   532: ldc_w 'simid'
    //   535: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   540: istore #13
    //   542: iload #13
    //   544: iconst_m1
    //   545: if_icmpeq -> 561
    //   548: aload_1
    //   549: iload #13
    //   551: invokeinterface getString : (I)Ljava/lang/String;
    //   556: astore #17
    //   558: goto -> 566
    //   561: ldc_w ''
    //   564: astore #17
    //   566: aload_1
    //   567: invokestatic f : (Landroid/database/Cursor;)Ljava/lang/String;
    //   570: astore #18
    //   572: new com/allinone/callerid/search/CallLogBean
    //   575: astore #19
    //   577: aload #19
    //   579: invokespecial <init> : ()V
    //   582: aload #19
    //   584: iload #9
    //   586: invokevirtual x0 : (I)V
    //   589: aload #19
    //   591: aload #16
    //   593: invokevirtual a1 : (Ljava/lang/String;)V
    //   596: aload #19
    //   598: aload #11
    //   600: invokevirtual H0 : (Ljava/lang/String;)V
    //   603: aload #19
    //   605: aload #6
    //   607: invokevirtual D0 : (Ljava/lang/String;)V
    //   610: aload #19
    //   612: aload #12
    //   614: invokevirtual g0 : (Ljava/lang/String;)V
    //   617: aload #19
    //   619: aload #7
    //   621: invokevirtual B0 : (Ljava/lang/String;)V
    //   624: aload #7
    //   626: ifnull -> 668
    //   629: ldc_w ''
    //   632: aload #7
    //   634: invokevirtual equals : (Ljava/lang/Object;)Z
    //   637: ifne -> 668
    //   640: aload #19
    //   642: iconst_1
    //   643: invokevirtual o0 : (Z)V
    //   646: aload #11
    //   648: ifnull -> 668
    //   651: ldc_w '0'
    //   654: aload #11
    //   656: invokevirtual equals : (Ljava/lang/Object;)Z
    //   659: ifne -> 668
    //   662: aload #19
    //   664: iconst_1
    //   665: invokevirtual t0 : (Z)V
    //   668: aload #19
    //   670: aload #15
    //   672: invokevirtual z0 : (Landroid/net/Uri;)V
    //   675: aload #19
    //   677: aload #14
    //   679: invokevirtual E0 : (Ljava/lang/String;)V
    //   682: aload #19
    //   684: iload #8
    //   686: invokevirtual c1 : (I)V
    //   689: aload #19
    //   691: aload #5
    //   693: invokestatic h : (Ljava/util/Date;)Ljava/lang/String;
    //   696: invokevirtual h1 : (Ljava/lang/String;)V
    //   699: aload #19
    //   701: aload #5
    //   703: invokestatic c : (Ljava/util/Date;)Ljava/lang/String;
    //   706: invokevirtual r0 : (Ljava/lang/String;)V
    //   709: aload #19
    //   711: aload #5
    //   713: invokevirtual d0 : (Ljava/util/Date;)V
    //   716: aload #19
    //   718: aload #18
    //   720: invokevirtual R0 : (Ljava/lang/String;)V
    //   723: aload #19
    //   725: aload #17
    //   727: invokevirtual b1 : (Ljava/lang/String;)V
    //   730: aload_0
    //   731: getfield f0 : Ljava/util/List;
    //   734: aload #19
    //   736: invokeinterface add : (Ljava/lang/Object;)Z
    //   741: pop
    //   742: goto -> 104
    //   745: aload_1
    //   746: invokeinterface close : ()V
    //   751: getstatic com/allinone/callerid/util/d0.a : Z
    //   754: ifeq -> 800
    //   757: new java/lang/StringBuilder
    //   760: astore_1
    //   761: aload_1
    //   762: invokespecial <init> : ()V
    //   765: aload_1
    //   766: ldc_w 'load_2:'
    //   769: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   772: pop
    //   773: aload_1
    //   774: invokestatic currentTimeMillis : ()J
    //   777: invokestatic d : (J)Ljava/lang/String;
    //   780: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   783: pop
    //   784: aload_3
    //   785: aload_1
    //   786: invokevirtual toString : ()Ljava/lang/String;
    //   789: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   792: goto -> 800
    //   795: astore_1
    //   796: aload_1
    //   797: invokevirtual printStackTrace : ()V
    //   800: return
    // Exception table:
    //   from	to	target	type
    //   0	4	795	java/lang/Exception
    //   12	54	795	java/lang/Exception
    //   54	104	795	java/lang/Exception
    //   104	211	795	java/lang/Exception
    //   218	252	795	java/lang/Exception
    //   264	368	795	java/lang/Exception
    //   373	397	795	java/lang/Exception
    //   400	443	795	java/lang/Exception
    //   461	479	795	java/lang/Exception
    //   489	506	795	java/lang/Exception
    //   517	524	795	java/lang/Exception
    //   524	542	795	java/lang/Exception
    //   548	558	795	java/lang/Exception
    //   566	624	795	java/lang/Exception
    //   629	646	795	java/lang/Exception
    //   651	668	795	java/lang/Exception
    //   668	742	795	java/lang/Exception
    //   745	792	795	java/lang/Exception
  }
  
  private void V2() {
    try {
      boolean bool = d0.a;
      if (bool) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("getDataNumberDb_start:");
        stringBuilder.append(com.allinone.callerid.util.i.d(System.currentTimeMillis()));
        d0.a("tony", stringBuilder.toString());
      } 
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
      this("dd/MMM", Locale.ENGLISH);
      this.q0.clear();
      List<CallLogBean> list = this.f0;
      if (list != null && list.size() != 0)
        for (byte b = 0; b < this.f0.size(); b++) {
          CallLogBean callLogBean = this.f0.get(b);
          EZSearchContacts eZSearchContacts = com.allinone.callerid.f.f.b().d(callLogBean.p());
          if (callLogBean.p() != null) {
            int i = com.allinone.callerid.f.k.b.d().e(callLogBean.p());
            if (i > 0) {
              callLogBean.Q0(true);
              callLogBean.J0(String.valueOf(i));
            } 
          } 
          if (eZSearchContacts != null) {
            callLogBean.O0(eZSearchContacts.isSearched());
            callLogBean.M0(eZSearchContacts.getSearch_time());
            callLogBean.h0(eZSearchContacts.isIs_can_search());
            if (!callLogBean.T()) {
              callLogBean.d1(i1.D((Context)EZCallApplication.c(), eZSearchContacts.getType_label()));
              callLogBean.e1(eZSearchContacts.getType_label());
              callLogBean.K0(eZSearchContacts.getReport_count());
            } 
            callLogBean.e0(eZSearchContacts.getBelong_area());
            callLogBean.L0(eZSearchContacts.getName());
            if (eZSearchContacts.getType() != null && ("Mobile".equals(eZSearchContacts.getType()) || "Fixed line".equals(eZSearchContacts.getType())))
              callLogBean.N0(i1.J((Context)EZCallApplication.c(), eZSearchContacts.getType())); 
            callLogBean.Z0(eZSearchContacts.getTel_number());
            callLogBean.Y0(eZSearchContacts.getT_p());
            callLogBean.F0(eZSearchContacts.getOld_tel_number());
            callLogBean.w0(eZSearchContacts.getFormat_tel_number());
            callLogBean.G0(eZSearchContacts.getOperator());
            callLogBean.a0(eZSearchContacts.getAddress());
            callLogBean.b0(eZSearchContacts.getAvatar());
            callLogBean.v0(eZSearchContacts.getFb_avatar());
            callLogBean.f1(eZSearchContacts.getType_tags());
            callLogBean.C0(eZSearchContacts.getName_tags());
            callLogBean.n0(eZSearchContacts.getComment_tags());
            callLogBean.q0(eZSearchContacts.getCountry());
            callLogBean.V0(eZSearchContacts.getSubtype());
            callLogBean.W0(eZSearchContacts.getSubtype_cc());
            callLogBean.y0(eZSearchContacts.getKeyword());
            callLogBean.g1(i1.v0(callLogBean.p()));
            callLogBean.X0(eZSearchContacts.getSubtype_pdt());
            callLogBean.k0(eZSearchContacts.getComment_count());
            callLogBean.i0(eZSearchContacts.isCan_search_commentcount());
            callLogBean.u0(eZSearchContacts.getFaild_error_log());
            if (this.p0) {
              ArrayList<SpamCall> arrayList = this.q0;
              if (arrayList != null && arrayList.size() < 3 && !i1.Y(this.A0, eZSearchContacts.getOld_tel_number()) && eZSearchContacts.getType_label() != null && !"".equals(eZSearchContacts.getType_label()) && eZSearchContacts.getReport_count() != null && !"".equals(eZSearchContacts.getReport_count())) {
                SpamCall spamCall = new SpamCall();
                this();
                spamCall.setNumber(eZSearchContacts.getOld_tel_number());
                spamCall.setTypelabel(eZSearchContacts.getType_label());
                spamCall.setReportcounts(eZSearchContacts.getReport_count());
                spamCall.setType(eZSearchContacts.getType());
                spamCall.setTel_number(eZSearchContacts.getTel_number());
                spamCall.setFormat_tel_number(eZSearchContacts.getFormat_tel_number());
                spamCall.setOperator(eZSearchContacts.getOperator());
                spamCall.setName(eZSearchContacts.getName());
                spamCall.setAddress(eZSearchContacts.getAddress());
                spamCall.setBelong_area(eZSearchContacts.getBelong_area());
                spamCall.setAvatar(eZSearchContacts.getAvatar());
                spamCall.setName_tags(eZSearchContacts.getName_tags());
                spamCall.setType_tags(eZSearchContacts.getType_tags());
                spamCall.setComment_tags(eZSearchContacts.getComment_tags());
                spamCall.setCountry(eZSearchContacts.getCountry());
                spamCall.setDate(simpleDateFormat.format(callLogBean.b()));
                spamCall.setCalltype(callLogBean.M());
                spamCall.setSelected(true);
                this.q0.add(spamCall);
              } 
            } 
          } 
        }  
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("getDataNumberDb_end:");
        stringBuilder.append(com.allinone.callerid.util.i.d(System.currentTimeMillis()));
        d0.a("tony", stringBuilder.toString());
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void Y2() {
    MainActivity mainActivity = this.c0;
    if (mainActivity != null)
      mainActivity.getWindow().getDecorView().post(new n(this)); 
  }
  
  private void Z2() {
    this.B0 = (ConstraintLayout)this.c0.findViewById(2131297202);
    this.C0 = (FrameLayout)this.c0.findViewById(2131297508);
    ((ImageView)this.c0.findViewById(2131297039)).setOnClickListener(this);
    ((ImageView)this.c0.findViewById(2131297582)).setOnClickListener(this);
    this.D0 = (TextView)this.c0.findViewById(2131297583);
    ImageView imageView = (ImageView)this.c0.findViewById(2131297040);
    this.E0 = imageView;
    imageView.setOnClickListener(this);
  }
  
  private void a3(Context paramContext) {
    com.allinone.callerid.i.a.d.a.a(new l(this, paramContext));
  }
  
  private void b3() {
    try {
      boolean bool1 = c1.h(this.A0);
      boolean bool2 = d0.a;
      if (bool2) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("loadDataContactsSim_start:");
        stringBuilder.append(com.allinone.callerid.util.i.d(System.currentTimeMillis()));
        d0.a("tony", stringBuilder.toString());
      } 
      List<CallLogBean> list = this.f0;
      if (list != null && list.size() > 0)
        for (byte b = 0; b < this.f0.size(); b++) {
          CallLogBean callLogBean = this.f0.get(b);
          if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CONTACTS") == 0) {
            EZCallApplication eZCallApplication = EZCallApplication.c();
            String str = callLogBean.p();
            b b1 = new b();
            this(this, callLogBean);
            com.allinone.callerid.util.f.a((Context)eZCallApplication, str, b1);
          } 
          if (this.O0 && bool1) {
            ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
            if (callLogBean.L() != null && !callLogBean.L().equals("")) {
              Cursor cursor = contentResolver.query(Uri.parse("content://telephony/siminfo"), null, "_id=?", new String[] { callLogBean.L() }, null);
              if (cursor != null) {
                String str = "";
                while (cursor.moveToNext()) {
                  int i = cursor.getColumnIndex("sim_id");
                  if (i != -1)
                    str = cursor.getString(i); 
                  callLogBean.R0(str);
                } 
              } 
              if (cursor != null)
                cursor.close(); 
            } 
          } 
        }  
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("loadDataContactsSim_end:");
        stringBuilder.append(com.allinone.callerid.util.i.d(System.currentTimeMillis()));
        d0.a("tony", stringBuilder.toString());
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void c3() {
    com.allinone.callerid.i.a.f.l.a(this.f0, new i(this));
    if (this.s0) {
      a1.h((Context)EZCallApplication.c());
      this.s0 = false;
    } 
  }
  
  private void d3() {
    try {
      List<String> list;
      boolean bool;
      if (this.i0.size() > 20) {
        ArrayList<?> arrayList = new ArrayList();
        this((Collection)this.i0.subList(0, 20));
        this.i0.removeAll(arrayList);
        bool = true;
      } else {
        list = this.i0;
        bool = false;
      } 
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("searchNumberList.size:");
        stringBuilder.append(this.i0.size());
        d0.d("searchList", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("canSearchList.size:");
        stringBuilder.append(list.size());
        d0.d("searchList", stringBuilder.toString());
      } 
      v v = new v();
      this(this, list, bool);
      if (v.getStatus() != AsyncTask.Status.RUNNING) {
        v.cancel(true);
        v = new v();
        this(this, list, bool);
        v.executeOnExecutor(f1.a(), new Object[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void e3() {
    if (d0.a)
      d0.a("searchList", "首次查询"); 
    try {
      EZCallApplication eZCallApplication = EZCallApplication.c();
      List<CallLogBean> list = this.f0;
      o o = new o();
      this(this);
      com.allinone.callerid.i.a.f.l.c((Context)eZCallApplication, list, o);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void f3(int paramInt1, int paramInt2) {
    try {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("滑动后查询 start:");
        stringBuilder.append(paramInt1);
        stringBuilder.append(" end:");
        stringBuilder.append(paramInt2);
        d0.a("searchList", stringBuilder.toString());
      } 
      List<CallLogBean> list = this.f0;
      p p = new p();
      this(this);
      com.allinone.callerid.i.a.f.l.b(paramInt1, paramInt2, list, p);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void g3() {
    List<CallLogBean> list = this.f0;
    if (list != null && list.size() > 0 && this.G0 != null) {
      TextView textView = this.D0;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.G0.size());
      stringBuilder.append("/");
      stringBuilder.append(this.f0.size());
      textView.setText(stringBuilder.toString());
      if (this.G0.size() > 0) {
        this.E0.setVisibility(0);
      } else {
        this.E0.setVisibility(8);
      } 
    } 
  }
  
  private void h3(List<CallLogBean> paramList, HashMap<String, Integer> paramHashMap) {
    com.github.jdsjlzx.recyclerview.a a;
    if (this.Q0 == null) {
      MyLinearLayoutManager myLinearLayoutManager = new MyLinearLayoutManager(this.A0);
      this.Q0 = myLinearLayoutManager;
      myLinearLayoutManager.z2(1);
      this.d0.setLayoutManager((RecyclerView.o)this.Q0);
      this.d0.setItemAnimator((RecyclerView.l)new androidx.recyclerview.widget.c());
      this.d0.setHasFixedSize(true);
      this.d0.setPullRefreshEnabled(false);
    } 
    com.allinone.callerid.b.t t1 = this.e0;
    if (t1 == null) {
      this.e0 = new com.allinone.callerid.b.t(this.o0, (Activity)this.c0);
      a = new com.github.jdsjlzx.recyclerview.a((RecyclerView.Adapter)this.e0);
      this.d0.setAdapter((RecyclerView.Adapter)a);
      this.d0.setLoadMoreEnabled(false);
      this.e0.M(paramList, paramHashMap);
      k3();
    } else {
      a.M(paramList, paramHashMap);
    } 
  }
  
  private void i3(CallLogBean paramCallLogBean) {
    try {
      com.allinone.callerid.dialog.f f;
      if (!b1.y2().booleanValue()) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i < 28 && !com.allinone.callerid.util.k1.b.d((Context)this.c0)) {
          this.t0 = paramCallLogBean;
          f = new com.allinone.callerid.dialog.f();
          this((Context)this.c0, 2131820783);
          f.setCanceledOnTouchOutside(false);
          f.show();
          return;
        } 
      } 
      String str = f.p();
      q q = new q();
      this(this, (CallLogBean)f);
      com.allinone.callerid.i.a.e.b.b(str, q);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void k3() {
    this.e0.B(new f(this));
    this.e0.A(new g(this));
  }
  
  private void l3(com.google.android.gms.ads.formats.g paramg) {
    try {
      UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView)LayoutInflater.from((Context)this.c0).inflate(2131492865, null);
      com.allinone.callerid.util.gg.d.a(paramg, unifiedNativeAdView);
      this.w0.removeAllViews();
      this.w0.addView((View)unifiedNativeAdView);
      this.w0.setVisibility(0);
      this.l0.setVisibility(0);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void m3() {
    this.B0.setVisibility(8);
    this.C0.setVisibility(0);
    this.F0 = false;
    R2();
  }
  
  private void n3() {
    this.B0.setVisibility(0);
    this.C0.setVisibility(8);
  }
  
  private void o3() {
    try {
      ((TextView)((RelativeLayout)this.x0.inflate()).findViewById(2131297997)).setTypeface(this.z0);
    } catch (Exception exception) {
      this.x0.setVisibility(0);
    } 
  }
  
  private void p3() {
    com.allinone.callerid.i.a.b0.b.a(new j(this));
  }
  
  public void I0() {
    super.I0();
  }
  
  public void L1(boolean paramBoolean) {
    super.L1(paramBoolean);
    if (paramBoolean)
      try {
        FloatingActionButton floatingActionButton = this.n0;
        if (floatingActionButton != null && floatingActionButton.y())
          this.n0.H(true); 
        MainActivity mainActivity = this.c0;
        if (mainActivity != null) {
          InputMethodManager inputMethodManager = (InputMethodManager)mainActivity.getSystemService("input_method");
          if (inputMethodManager != null && inputMethodManager.isActive() && this.c0.getWindow() != null) {
            View view = this.c0.getWindow().peekDecorView();
            if (view != null && view.getWindowToken() != null)
              inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0); 
          } 
          com.allinone.callerid.util.q.b().c("in_recent");
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public void N0() {
    super.N0();
    if (b1.N() && !this.p0) {
      b1.s1(false);
      this.p0 = true;
      W2();
    } 
    com.allinone.callerid.b.t t1 = this.e0;
    if (t1 != null && EZCallApplication.b) {
      t1.i();
      EZCallApplication.b = false;
    } 
    if (com.allinone.callerid.util.k1.b.a && this.t0 != null) {
      if (com.allinone.callerid.util.k1.b.b(this.A0))
        com.allinone.callerid.util.q.b().c("dialog_notifi_per_tip_enalbleed"); 
      com.allinone.callerid.util.k1.b.a = false;
      i3(this.t0);
    } 
  }
  
  public void S2() {
    try {
      if (b0()) {
        MainActivity mainActivity = this.c0;
        if (mainActivity != null && !mainActivity.isFinishing()) {
          AlertDialog.Builder builder2 = new AlertDialog.Builder();
          this((Context)this.c0);
          AlertDialog.Builder builder3 = builder2.setMessage(EZCallApplication.c().getResources().getString(2131755284));
          String str1 = O().getString(2131755836);
          e e1 = new e();
          this(this);
          AlertDialog.Builder builder1 = builder3.setPositiveButton(str1, e1);
          String str2 = O().getString(2131755180);
          d d = new d();
          this(this);
          AlertDialog alertDialog = builder1.setNegativeButton(str2, d).create();
          alertDialog.show();
          alertDialog.getButton(-1).setTextColor(this.I0);
          alertDialog.getButton(-2).setTextColor(O().getColor(2131099695));
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void W2() {
    try {
      if (com.allinone.callerid.util.k1.a.d(this.A0)) {
        if (!this.J0) {
          this.m0.setVisibility(0);
          this.J0 = false;
        } 
        this.O0 = c1.l();
        ExecutorService executorService = (j0.a()).b;
        a a = new a();
        this(this);
        executorService.execute(a);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void X2() {
    try {
      List<CallLogBean> list = this.g0;
      if (list != null && list.size() > 0) {
        list = new ArrayList<CallLogBean>();
        super();
        list.clear();
        for (byte b = 0; b < this.g0.size(); b++) {
          CallLogBean callLogBean = this.g0.get(b);
          int i = this.y0;
          if (i != 0) {
            if (i == 1) {
              if (callLogBean.M() == 1)
                list.add(callLogBean); 
            } else if (i == 2) {
              if (callLogBean.M() == 2)
                list.add(callLogBean); 
            } else if (i == 3 && callLogBean.M() == 3) {
              list.add(callLogBean);
            } 
          } else {
            list.clear();
            list.addAll(this.g0);
          } 
        } 
        if (list.size() > 0) {
          if (this.e0 != null) {
            this.f0.clear();
            this.f0.addAll(list);
            this.e0.O(this.f0);
            this.e0.i();
          } 
        } else {
          Toast.makeText((Context)EZCallApplication.c(), EZCallApplication.c().getResources().getString(2131755527), 0).show();
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void m0(Bundle paramBundle) {
    super.m0(paramBundle);
  }
  
  public void n0(int paramInt1, int paramInt2, Intent paramIntent) {
    super.n0(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 999 && com.allinone.callerid.util.k1.a.g((Context)EZCallApplication.c()))
      com.allinone.callerid.util.q.b().c("delete_request_default_dialer_enabled"); 
  }
  
  public void onClick(View paramView) {
    switch (paramView.getId()) {
      default:
        return;
      case 2131297582:
        m3();
      case 2131297040:
        try {
          int i = Build.VERSION.SDK_INT;
          if (i >= 23) {
            if (com.allinone.callerid.util.k1.a.g((Context)EZCallApplication.c())) {
              T2();
            } else if (i >= 29) {
              try {
                RoleManager roleManager = (RoleManager)this.A0.getSystemService(RoleManager.class);
                if (roleManager != null && roleManager.isRoleAvailable("android.app.role.DIALER")) {
                  boolean bool = roleManager.isRoleHeld("android.app.role.DIALER");
                  if (bool) {
                    if (d0.a)
                      d0.a("default_dialer", "This app is the default dialer app"); 
                    T2();
                  } else {
                    if (d0.a)
                      d0.a("default_dialer", "This app isn't the default dialer app"); 
                    startActivityForResult(roleManager.createRequestRoleIntent("android.app.role.DIALER"), 999);
                  } 
                } 
              } catch (Exception exception) {
                T2();
                exception.printStackTrace();
              } 
            } else {
              Intent intent = new Intent();
              this("android.telecom.action.CHANGE_DEFAULT_DIALER");
              intent.putExtra("android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME", i1.M((Context)EZCallApplication.c()));
              startActivityForResult(intent, 999);
            } 
          } else {
            T2();
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      case 2131297039:
        break;
    } 
    try {
      boolean bool = this.H0;
      byte b = 0;
      if (!bool) {
        this.H0 = true;
        List<CallLogBean> list = this.f0;
        if (list != null && list.size() > 0) {
          while (b < this.f0.size()) {
            ((CallLogBean)this.f0.get(b)).P0(true);
            b++;
          } 
          this.G0.clear();
          this.G0.addAll(this.f0);
        } 
      } else {
        this.H0 = false;
        List<CallLogBean> list = this.f0;
        if (list != null && list.size() > 0)
          for (b = 0; b < this.f0.size(); b++)
            ((CallLogBean)this.f0.get(b)).P0(false);  
        this.G0.clear();
      } 
      g3();
      com.allinone.callerid.b.t t1 = this.e0;
      if (t1 != null)
        t1.i(); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void p0(Context paramContext) {
    super.p0(paramContext);
    this.A0 = paramContext;
    MainActivity mainActivity = (MainActivity)paramContext;
    this.c0 = mainActivity;
    this.n0 = (FloatingActionButton)mainActivity.findViewById(2131296823);
    mainActivity = this.c0;
    if (mainActivity instanceof s)
      this.r0 = (s)mainActivity; 
  }
  
  public View w0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    i1.H0(this.A0, (EZCallApplication.c()).f);
    if (this.K0 == null) {
      View view = paramLayoutInflater.inflate(2131492979, paramViewGroup, false);
      this.K0 = view;
      this.l0 = (LinearLayout)view.findViewById(2131296925);
      this.w0 = (FrameLayout)this.K0.findViewById(2131296753);
      this.x0 = (ViewStub)this.K0.findViewById(2131298269);
      ProgressBar progressBar = (ProgressBar)this.K0.findViewById(2131297380);
      this.m0 = progressBar;
      if (Build.VERSION.SDK_INT <= 20)
        progressBar.setVisibility(0); 
      this.I0 = d1.a(this.A0, 2130968859, 2131099706);
      this.J0 = true;
      this.L0 = true;
      this.d0 = (LRecyclerView)this.K0.findViewById(2131297336);
      this.f0 = new ArrayList<CallLogBean>();
      if (m() != null && m().getIntent().getBooleanExtra("launchapp", false)) {
        com.allinone.callerid.util.q.b().c("wakeapp_noti_click");
        this.p0 = true;
      } 
      Y2();
      Z2();
      this.s0 = true;
      this.d0.l(new k(this));
      com.allinone.callerid.util.q.b().c("history_create_num");
      a3((Context)EZCallApplication.c());
    } 
    return this.K0;
  }
  
  public void x0() {
    super.x0();
    try {
      if (this.k0 != null)
        b.p.a.a.b(this.A0).e(this.k0); 
      View view = this.K0;
      if (view != null) {
        ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup != null)
          viewGroup.removeView(this.K0); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements Runnable {
    a(e this$0) {}
    
    public void run() {
      try {
        Cursor cursor = e.U1(this.b).getContentResolver().query(c1.g(), null, null, null, "date DESC");
        if (cursor != null && cursor.getCount() > 0) {
          e.k2(this.b, cursor);
          if (e.M2(this.b) != null && e.M2(this.b).size() != 0) {
            e.l2(this.b).sendEmptyMessage(15001);
            e.l2(this.b).sendEmptyMessage(15000);
            e.m2(this.b);
            e.l2(this.b).sendEmptyMessage(15004);
            e.n2(this.b);
            e.l2(this.b).sendEmptyMessage(15003);
          } else {
            e.l2(this.b).sendEmptyMessage(15002);
            e.l2(this.b).sendEmptyMessage(15000);
          } 
        } else {
          MainActivity mainActivity = e.U1(this.b);
          a a1 = new a();
          this(this);
          mainActivity.runOnUiThread(a1);
        } 
        if (cursor != null)
          cursor.close(); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements Runnable {
      a(e.a this$0) {}
      
      public void run() {
        e.s s = this.b.b.r0;
        if (s != null)
          s.l(); 
        if (e.M2(this.b.b) != null && e.M2(this.b.b).size() > 0)
          e.M2(this.b.b).clear(); 
        e.o2(this.b.b).setVisibility(8);
        e.p2(this.b.b);
        if (e.O2(this.b.b) != null)
          e.O2(this.b.b).i(); 
      }
    }
  }
  
  class a implements Runnable {
    a(e this$0) {}
    
    public void run() {
      e.s s = this.b.b.r0;
      if (s != null)
        s.l(); 
      if (e.M2(this.b.b) != null && e.M2(this.b.b).size() > 0)
        e.M2(this.b.b).clear(); 
      e.o2(this.b.b).setVisibility(8);
      e.p2(this.b.b);
      if (e.O2(this.b.b) != null)
        e.O2(this.b.b).i(); 
    }
  }
  
  class b implements com.allinone.callerid.util.f.a {
    b(e this$0, CallLogBean param1CallLogBean) {}
    
    public void a(int param1Int, String param1String) {
      if (param1Int != 0) {
        this.a.B0(param1String);
        this.a.o0(true);
        this.a.I0(param1Int);
      } else {
        this.a.o0(false);
        this.a.B0("");
        this.a.I0(0);
      } 
    }
  }
  
  class c implements com.allinone.callerid.i.a.f.h {
    c(e this$0) {}
    
    public void a() {
      e.N2(this.a).clear();
    }
  }
  
  class d implements DialogInterface.OnClickListener {
    d(e this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class e implements DialogInterface.OnClickListener {
    e(e this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (this.b.b0()) {
        e.o2(this.b).setVisibility(0);
        com.allinone.callerid.i.a.f.i.a(new a(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.f.h {
      a(e.e this$0) {}
      
      public void a() {
        try {
          if (e.O2(this.a.b) != null) {
            e.x2(this.a.b).clear();
            e.M2(this.a.b).clear();
            e.O2(this.a.b).O(e.M2(this.a.b));
            e.O2(this.a.b).i();
            this.a.b.W2();
          } 
          e.o2(this.a.b).setVisibility(8);
          Toast.makeText((Context)EZCallApplication.c(), EZCallApplication.c().getResources().getString(2131755292), 0).show();
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.f.h {
    a(e this$0) {}
    
    public void a() {
      try {
        if (e.O2(this.a.b) != null) {
          e.x2(this.a.b).clear();
          e.M2(this.a.b).clear();
          e.O2(this.a.b).O(e.M2(this.a.b));
          e.O2(this.a.b).i();
          this.a.b.W2();
        } 
        e.o2(this.a.b).setVisibility(8);
        Toast.makeText((Context)EZCallApplication.c(), EZCallApplication.c().getResources().getString(2131755292), 0).show();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class f implements com.allinone.callerid.b.t.m {
    f(e this$0) {}
    
    public void a(View param1View, int param1Int) {
      try {
        if (e.M2(this.a) != null && e.M2(this.a).size() != 0 && param1Int < e.M2(this.a).size()) {
          CallLogBean callLogBean = e.M2(this.a).get(param1Int);
          if (!e.C2(this.a)) {
            e.D2(this.a, true);
            callLogBean.P0(true);
            e.N2(this.a).add(callLogBean);
            param1View.setBackgroundColor(d1.a(e.E2(this.a), 2130968870, 2131099744));
            e.G2(this.a);
            e.F2(this.a);
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    public void b(View param1View, int param1Int) {
      try {
        if (e.M2(this.a) != null && e.M2(this.a).size() != 0) {
          CallLogBean callLogBean = e.M2(this.a).get(param1Int);
          if (e.C2(this.a)) {
            if (callLogBean.X()) {
              callLogBean.P0(false);
              param1View.setBackground(null);
              e.N2(this.a).remove(callLogBean);
            } else {
              callLogBean.P0(true);
              param1View.setBackgroundColor(d1.a(e.E2(this.a), 2130968870, 2131099744));
              e.N2(this.a).add(callLogBean);
            } 
            e.F2(this.a);
          } else {
            boolean bool = callLogBean.T();
            if (bool) {
              Intent intent = new Intent();
              this();
              Bundle bundle = new Bundle();
              this();
              bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
              intent.putExtras(bundle);
              intent.setClass((Context)e.U1(this.a), ContactActivity.class);
              if (d0.a) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("联系人：");
                stringBuilder.append(callLogBean.toString());
                d0.a("favtest", stringBuilder.toString());
              } 
              this.a.M1(intent);
              e.U1(this.a).overridePendingTransition(2130771968, 2130771969);
            } else {
              Intent intent = new Intent();
              this();
              Bundle bundle = new Bundle();
              this();
              bundle.putParcelable("contact_tony", (Parcelable)callLogBean);
              intent.putExtras(bundle);
              intent.setClass((Context)e.U1(this.a), UnknownContactActivity.class);
              if (d0.a) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("陌生人：");
                stringBuilder.append(callLogBean.toString());
                d0.a("favtest", stringBuilder.toString());
              } 
              this.a.M1(intent);
              e.U1(this.a).overridePendingTransition(2130771968, 2130771969);
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class g implements com.allinone.callerid.b.t.l {
    g(e this$0) {}
    
    public void a() {
      e.I2(this.a);
    }
  }
  
  class h implements com.allinone.callerid.i.a.e.a {
    h(e this$0, SpamCall param1SpamCall, String param1String) {}
    
    public void a(boolean param1Boolean) {
      if (!param1Boolean) {
        EZBlackList eZBlackList = new EZBlackList();
        if (this.a.getTypelabel() != null && !"".equals(this.a.getTypelabel())) {
          eZBlackList.setName(this.a.getTypelabel());
        } else {
          eZBlackList.setName("");
        } 
        eZBlackList.setNumber(this.b);
        eZBlackList.setIs_myblock("true");
        com.allinone.callerid.i.a.e.b.a(eZBlackList, new a(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(e.h this$0) {}
      
      public void a() {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(this.a.b);
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(e this$0) {}
    
    public void a() {
      CollectInfo collectInfo = new CollectInfo();
      collectInfo.setNumber(this.a.b);
      collectInfo.setUser_blocked("1");
      collectInfo.setUser_commented("0");
      collectInfo.setUser_reported("0");
      collectInfo.setUser_upload_recording("0");
      com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
    }
  }
  
  class i implements com.allinone.callerid.i.a.f.e {
    i(e this$0) {}
    
    public void a(ArrayList<String> param1ArrayList) {
      if (param1ArrayList.size() != 0)
        com.allinone.callerid.i.a.y.a.a(param1ArrayList, new a(this)); 
    }
    
    class a implements com.allinone.callerid.i.a.y.c {
      a(e.i this$0) {}
      
      public void a(String param2String) {
        if ("ok".equals(param2String))
          com.allinone.callerid.i.a.y.b.a(e.M2(this.a.a), new a(this)); 
      }
      
      class a implements com.allinone.callerid.i.a.y.d {
        a(e.i.a this$0) {}
        
        public void a(List<CallLogBean> param3List) {
          if (param3List != null && param3List.size() > 0 && e.O2(this.a.a.a) != null)
            e.O2(this.a.a.a).i(); 
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.y.d {
      a(e.i this$0) {}
      
      public void a(List<CallLogBean> param2List) {
        if (param2List != null && param2List.size() > 0 && e.O2(this.a.a.a) != null)
          e.O2(this.a.a.a).i(); 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.y.c {
    a(e this$0) {}
    
    public void a(String param1String) {
      if ("ok".equals(param1String))
        com.allinone.callerid.i.a.y.b.a(e.M2(this.a.a), new a(this)); 
    }
    
    class a implements com.allinone.callerid.i.a.y.d {
      a(e.i.a this$0) {}
      
      public void a(List<CallLogBean> param3List) {
        if (param3List != null && param3List.size() > 0 && e.O2(this.a.a.a) != null)
          e.O2(this.a.a.a).i(); 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.y.d {
    a(e this$0) {}
    
    public void a(List<CallLogBean> param1List) {
      if (param1List != null && param1List.size() > 0 && e.O2(this.a.a.a) != null)
        e.O2(this.a.a.a).i(); 
    }
  }
  
  class j implements com.allinone.callerid.i.a.b0.a {
    j(e this$0) {}
    
    public void a(List<SpamCall> param1List) {
      if (param1List != null)
        try {
          if (param1List.size() > 0) {
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("findspamcalls:");
              stringBuilder.append(param1List.toString());
              d0.a("findspamcalls", stringBuilder.toString());
            } 
            b1.L0(false);
            e.L2(this.a).clear();
            e.L2(this.a).addAll(param1List);
            com.allinone.callerid.util.q.b().c("find_spamcall_show");
            g0.y((Context)EZCallApplication.c());
            if (e.O2(this.a) != null) {
              e.O2(this.a).P(true);
              e.O2(this.a).K(e.L2(this.a), true);
              e.O2(this.a).i();
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
    }
  }
  
  class k extends RecyclerView.s {
    k(e this$0) {}
    
    public void a(RecyclerView param1RecyclerView, int param1Int) {
      super.a(param1RecyclerView, param1Int);
      if (param1Int == 0) {
        e e1 = this.a;
        e.g2(e1, e.R1(e1), e.T1(this.a));
      } 
      if (!param1RecyclerView.canScrollVertically(1) && d0.a)
        d0.a("searchList", "onScrollStateChanged到底了"); 
    }
    
    public void b(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      super.b(param1RecyclerView, param1Int1, param1Int2);
      if (e.u2(this.a) == null)
        e.w2(this.a, (MyLinearLayoutManager)param1RecyclerView.getLayoutManager()); 
      if (param1Int2 > 0) {
        e e1 = this.a;
        e.V1(e1, e.u2(e1).J());
        e1 = this.a;
        e.S1(e1, e.u2(e1).Z1());
        if (e.H2(this.a) != null && !e.H2(this.a).y())
          e.H2(this.a).u(true); 
      } else if (param1Int2 < 0) {
        e e1 = this.a;
        e.V1(e1, e.u2(e1).J());
        e1 = this.a;
        e.S1(e1, e.u2(e1).Z1());
        if (e.H2(this.a) != null && e.H2(this.a).y())
          e.H2(this.a).H(true); 
      } 
    }
  }
  
  class l implements com.allinone.callerid.i.a.d.b {
    l(e this$0, Context param1Context) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.util.q.b().c("history_request_num");
        com.google.android.gms.ads.d.a a = new com.google.android.gms.ads.d.a(this.a, "ca-app-pub-5825926894918682/4623723254");
        a.e(new a(this));
        com.google.android.gms.ads.u u = (new com.google.android.gms.ads.u.a()).b(true).a();
        a.g((new com.google.android.gms.ads.formats.b.a()).h(u).a());
        a.f(new b(this)).a().b((new com.google.android.gms.ads.e.a()).b(MediationNativeAdapter.class, new Bundle()).d());
      } 
    }
    
    class a implements com.google.android.gms.ads.formats.g.a {
      a(e.l this$0) {}
      
      public void r(com.google.android.gms.ads.formats.g param2g) {
        e.P2(this.b.b, param2g);
      }
    }
    
    class b extends com.google.android.gms.ads.b {
      b(e.l this$0) {}
      
      public void D(int param2Int) {
        super.D(param2Int);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("onAdFailedToLoad:");
          stringBuilder.append(param2Int);
          d0.a("AdLoaded", stringBuilder.toString());
        } 
      }
      
      public void J() {
        super.J();
        if (d0.a)
          d0.a("AdLoaded", "onAdLoaded"); 
      }
      
      public void K() {
        super.K();
        e.l l1 = this.a;
        e.Q2(l1.b, l1.a);
      }
    }
  }
  
  class a implements com.google.android.gms.ads.formats.g.a {
    a(e this$0) {}
    
    public void r(com.google.android.gms.ads.formats.g param1g) {
      e.P2(this.b.b, param1g);
    }
  }
  
  class b extends com.google.android.gms.ads.b {
    b(e this$0) {}
    
    public void D(int param1Int) {
      super.D(param1Int);
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onAdFailedToLoad:");
        stringBuilder.append(param1Int);
        d0.a("AdLoaded", stringBuilder.toString());
      } 
    }
    
    public void J() {
      super.J();
      if (d0.a)
        d0.a("AdLoaded", "onAdLoaded"); 
    }
    
    public void K() {
      super.K();
      e.l l1 = this.a;
      e.Q2(l1.b, l1.a);
    }
  }
  
  class m implements Runnable {
    m(e this$0) {}
    
    public void run() {
      if (e.U1(this.b) != null) {
        c1.c((Activity)e.U1(this.b));
        e.X1(this.b, new e.u(null));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.allinone.callerid.RELOAD_DATA");
        intentFilter.addAction("com.allinone.callerid.CLOSE_AD");
        b.p.a.a.b((Context)e.U1(this.b)).c(e.W1(this.b), intentFilter);
      } 
      e e1 = this.b;
      e.Z1(e1, e.M2(e1), e.Y1(this.b));
    }
  }
  
  class n implements Runnable {
    n(e this$0) {}
    
    public void run() {
      e.a2(this.b, g1.b());
      e.c2(this.b).post(e.b2(this.b));
      this.b.W2();
    }
  }
  
  class o implements com.allinone.callerid.i.a.f.n {
    o(e this$0) {}
    
    public void a(List<CallLogBean> param1List, List<String> param1List1) {
      try {
        e.e2(this.a, param1List1);
        if (e.d2(this.a) != null && e.d2(this.a).size() > 0) {
          e.f2(this.a);
        } else {
          e.h2(this.a);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class p implements com.allinone.callerid.i.a.f.e {
    p(e this$0) {}
    
    public void a(ArrayList<String> param1ArrayList) {
      if (param1ArrayList.size() != 0) {
        (new e.v(this.a, param1ArrayList, false)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
      } else {
        e.h2(this.a);
      } 
    }
  }
  
  class q implements com.allinone.callerid.i.a.e.a {
    q(e this$0, CallLogBean param1CallLogBean) {}
    
    public void a(boolean param1Boolean) {
      try {
        if (this.b.b0() && e.U1(this.b) != null) {
          boolean bool = e.U1(this.b).isFinishing();
          if (!bool) {
            String str2;
            if (param1Boolean) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(this.b.O().getString(2131755825));
              stringBuilder.append(" ");
              stringBuilder.append(this.a.p());
              str2 = stringBuilder.toString();
              str1 = this.b.O().getString(2131755826);
            } else {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(this.b.O().getString(2131755114));
              stringBuilder.append(" ");
              stringBuilder.append(this.a.p());
              stringBuilder.append(" ?");
              str2 = stringBuilder.toString();
              str1 = this.b.O().getString(2131755116);
            } 
            androidx.appcompat.app.a.a a5 = new androidx.appcompat.app.a.a();
            this((Context)e.U1(this.b));
            androidx.appcompat.app.a.a a3 = a5.h(str2);
            b b = new b();
            this(this);
            androidx.appcompat.app.a.a a4 = a3.n(str1, b);
            String str1 = this.b.O().getString(2131755180);
            a a2 = new a();
            this(this);
            androidx.appcompat.app.a a1 = a4.j(str1, a2).a();
            a1.show();
            a1.g(-1).setTextColor(e.i2(this.b));
            a1.g(-2).setTextColor(this.b.O().getColor(2131099695));
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
    
    class a implements DialogInterface.OnClickListener {
      a(e.q this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {}
    }
    
    class b implements DialogInterface.OnClickListener {
      b(e.q this$0) {}
      
      public void onClick(DialogInterface param2DialogInterface, int param2Int) {
        String str = this.b.a.p().replace("-", "");
        if (!"".equals(str))
          com.allinone.callerid.i.a.e.b.b(str, new a(this, str)); 
      }
      
      class a implements com.allinone.callerid.i.a.e.a {
        a(e.q.b this$0, String param3String) {}
        
        public void a(boolean param3Boolean) {
          if (param3Boolean) {
            com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
          } else {
            EZBlackList eZBlackList = new EZBlackList();
            if (this.b.b.a.n() != null && !"".equals(this.b.b.a.n())) {
              eZBlackList.setName(this.b.b.a.n());
            } else {
              eZBlackList.setName("");
            } 
            eZBlackList.setNumber(this.a);
            eZBlackList.setIs_myblock("true");
            com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
          } 
        }
        
        class a implements com.allinone.callerid.i.a.a {
          a(e.q.b.a this$0) {}
          
          public void a() {}
        }
        
        class b implements com.allinone.callerid.i.a.a {
          b(e.q.b.a this$0) {}
          
          public void a() {
            CollectInfo collectInfo = new CollectInfo();
            collectInfo.setNumber(this.a.a);
            collectInfo.setUser_blocked("1");
            collectInfo.setUser_commented("0");
            collectInfo.setUser_reported("0");
            collectInfo.setUser_upload_recording("0");
            com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
          }
        }
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(e.q.b this$0) {}
        
        public void a() {}
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(e.q.b this$0) {}
        
        public void a() {
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(this.a.a);
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.e.a {
      a(e.q this$0, String param2String) {}
      
      public void a(boolean param2Boolean) {
        if (param2Boolean) {
          com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
        } else {
          EZBlackList eZBlackList = new EZBlackList();
          if (this.b.b.a.n() != null && !"".equals(this.b.b.a.n())) {
            eZBlackList.setName(this.b.b.a.n());
          } else {
            eZBlackList.setName("");
          } 
          eZBlackList.setNumber(this.a);
          eZBlackList.setIs_myblock("true");
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(e.q.b.a this$0) {}
        
        public void a() {}
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(e.q.b.a this$0) {}
        
        public void a() {
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(this.a.a);
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(e.q this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(e.q this$0) {}
      
      public void a() {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(this.a.a);
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      }
    }
  }
  
  class a implements DialogInterface.OnClickListener {
    a(e this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {}
  }
  
  class b implements DialogInterface.OnClickListener {
    b(e this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      String str = this.b.a.p().replace("-", "");
      if (!"".equals(str))
        com.allinone.callerid.i.a.e.b.b(str, new a(this, str)); 
    }
    
    class a implements com.allinone.callerid.i.a.e.a {
      a(e.q.b this$0, String param3String) {}
      
      public void a(boolean param3Boolean) {
        if (param3Boolean) {
          com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
        } else {
          EZBlackList eZBlackList = new EZBlackList();
          if (this.b.b.a.n() != null && !"".equals(this.b.b.a.n())) {
            eZBlackList.setName(this.b.b.a.n());
          } else {
            eZBlackList.setName("");
          } 
          eZBlackList.setNumber(this.a);
          eZBlackList.setIs_myblock("true");
          com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
        } 
      }
      
      class a implements com.allinone.callerid.i.a.a {
        a(e.q.b.a this$0) {}
        
        public void a() {}
      }
      
      class b implements com.allinone.callerid.i.a.a {
        b(e.q.b.a this$0) {}
        
        public void a() {
          CollectInfo collectInfo = new CollectInfo();
          collectInfo.setNumber(this.a.a);
          collectInfo.setUser_blocked("1");
          collectInfo.setUser_commented("0");
          collectInfo.setUser_reported("0");
          collectInfo.setUser_upload_recording("0");
          com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(e.q.b this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(e.q.b this$0) {}
      
      public void a() {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(this.a.a);
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.e.a {
    a(e this$0, String param1String) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        com.allinone.callerid.i.a.e.b.e(this.a, new a(this));
      } else {
        EZBlackList eZBlackList = new EZBlackList();
        if (this.b.b.a.n() != null && !"".equals(this.b.b.a.n())) {
          eZBlackList.setName(this.b.b.a.n());
        } else {
          eZBlackList.setName("");
        } 
        eZBlackList.setNumber(this.a);
        eZBlackList.setIs_myblock("true");
        com.allinone.callerid.i.a.e.b.a(eZBlackList, new b(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.a {
      a(e.q.b.a this$0) {}
      
      public void a() {}
    }
    
    class b implements com.allinone.callerid.i.a.a {
      b(e.q.b.a this$0) {}
      
      public void a() {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setNumber(this.a.a);
        collectInfo.setUser_blocked("1");
        collectInfo.setUser_commented("0");
        collectInfo.setUser_reported("0");
        collectInfo.setUser_upload_recording("0");
        com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.a {
    a(e this$0) {}
    
    public void a() {}
  }
  
  class b implements com.allinone.callerid.i.a.a {
    b(e this$0) {}
    
    public void a() {
      CollectInfo collectInfo = new CollectInfo();
      collectInfo.setNumber(this.a.a);
      collectInfo.setUser_blocked("1");
      collectInfo.setUser_commented("0");
      collectInfo.setUser_reported("0");
      collectInfo.setUser_upload_recording("0");
      com.allinone.callerid.i.a.h.c.c((Context)EZCallApplication.c(), collectInfo);
    }
  }
  
  static class r extends AsyncTask<Void, Void, Void> {
    private WeakReference<e> a;
    
    r(e param1e) {
      this.a = new WeakReference<e>(param1e);
    }
    
    protected Void a(Void... param1VarArgs) {
      try {
        e e = this.a.get();
        if (e != null && e.M2(e) != null && e.M2(e).size() > 0 && e.N2(e) != null) {
          Iterator<CallLogBean> iterator = e.M2(e).iterator();
          while (iterator.hasNext())
            ((CallLogBean)iterator.next()).P0(false); 
          e.N2(e).clear();
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      e e = this.a.get();
      if (e != null && e.O2(e) != null)
        e.O2(e).i(); 
    }
  }
  
  public static interface s {
    void l();
  }
  
  private static class t extends Handler {
    private final WeakReference<e> a;
    
    private t(e param1e) {
      this.a = new WeakReference<e>(param1e);
    }
    
    public void handleMessage(Message param1Message) {
      e e = this.a.get();
      if (e != null)
        try {
          a a;
          if (e.r2(e) && param1Message.what == 15000) {
            e.s2(e, false);
            e.s s = e.r0;
            if (s != null)
              s.l(); 
            EZCallApplication eZCallApplication = EZCallApplication.c();
            a = new a();
            this(this);
            com.allinone.callerid.i.a.q.a.l((Context)eZCallApplication, a);
          } else {
            int i = param1Message.what;
            if (i == 15001) {
              e.o2((e)a).setVisibility(8);
              e.t2((e)a).setVisibility(0);
              if (e.O2((e)a) != null) {
                e.O2((e)a).M(e.M2((e)a), e.Y1((e)a));
                e.O2((e)a).i();
              } 
              e.v2((e)a).setVisibility(8);
              e.x2((e)a).addAll(e.M2((e)a));
            } else if (i == 15002) {
              e.o2((e)a).setVisibility(8);
              e.p2((e)a);
            } else if (i == 15003) {
              if (e.O2((e)a) != null)
                e.O2((e)a).i(); 
              e.o2((e)a).setVisibility(8);
            } else if (i == 15004) {
              if (e.M2((e)a).size() > 0) {
                e.y2((e)a);
                if (e.O2((e)a) != null)
                  e.O2((e)a).i(); 
              } 
              if (e.z2((e)a) && e.B2((e)a) != null && e.B2((e)a).size() > 0) {
                e.A2((e)a, false);
                if (e.O2((e)a) != null) {
                  e.O2((e)a).P(true);
                  e.O2((e)a).K(e.B2((e)a), true);
                  e.O2((e)a).i();
                } 
              } 
            } 
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        }  
      super.handleMessage(param1Message);
    }
    
    class a implements com.allinone.callerid.i.a.q.g {
      a(e.t this$0) {}
      
      public void a(ArrayList<CallLogBean> param2ArrayList) {
        if (d0.a)
          d0.a("tony", "loadContact_ok"); 
      }
      
      public void b() {}
    }
  }
  
  class a implements com.allinone.callerid.i.a.q.g {
    a(e this$0) {}
    
    public void a(ArrayList<CallLogBean> param1ArrayList) {
      if (d0.a)
        d0.a("tony", "loadContact_ok"); 
    }
    
    public void b() {}
  }
  
  private class u extends BroadcastReceiver {
    private u(e this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      try {
        if ("com.allinone.callerid.RELOAD_DATA".equals(param1Intent.getAction())) {
          this.a.W2();
          if (d0.a)
            d0.a("searchList", "reload_data====init()"); 
          if (e.U1(this.a) != null) {
            Intent intent = new Intent();
            this("com.allinone.callerid.IDENTIFY_NUMBER");
            b.p.a.a.b(param1Context).d(intent);
          } 
        } 
        if ("com.allinone.callerid.CLOSE_AD".equals(param1Intent.getAction()) && e.J2(this.a) != null)
          e.J2(this.a).setVisibility(8); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  private static class v extends AsyncTask<Object, Void, Object> {
    private WeakReference<e> a;
    
    private List<String> b;
    
    private EZSearchContacts c;
    
    private boolean d;
    
    private boolean e;
    
    v(e param1e, List<String> param1List, boolean param1Boolean) {
      this.a = new WeakReference<e>(param1e);
      this.b = param1List;
      this.d = param1Boolean;
    }
    
    protected Object doInBackground(Object[] param1ArrayOfObject) {
      // Byte code:
      //   0: ldc 'tel_number'
      //   2: astore_2
      //   3: ldc 'faild_error_log'
      //   5: astore_3
      //   6: ldc 'e164_tel_number'
      //   8: astore #4
      //   10: ldc 'country'
      //   12: astore #5
      //   14: ldc 'type_tags'
      //   16: astore #6
      //   18: ldc 'cc'
      //   20: astore #7
      //   22: ldc 'name_tags'
      //   24: astore #8
      //   26: aload_0
      //   27: getfield a : Ljava/lang/ref/WeakReference;
      //   30: invokevirtual get : ()Ljava/lang/Object;
      //   33: checkcast com/allinone/callerid/g/e
      //   36: astore_1
      //   37: ldc 'avatar'
      //   39: astore #9
      //   41: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
      //   44: astore #10
      //   46: aload #10
      //   48: invokestatic d : (Landroid/content/Context;)Lcom/allinone/callerid/model/EZCountryCode;
      //   51: astore #11
      //   53: ldc 'belong_area'
      //   55: astore #12
      //   57: aload #11
      //   59: invokevirtual getCountry_code : ()Ljava/lang/String;
      //   62: astore #11
      //   64: ldc 'address'
      //   66: astore #13
      //   68: ldc ''
      //   70: astore #14
      //   72: aload_1
      //   73: ifnull -> 3219
      //   76: ldc 'name'
      //   78: astore #15
      //   80: new org/json/JSONArray
      //   83: astore #16
      //   85: ldc 'report_count'
      //   87: astore #17
      //   89: aload #16
      //   91: aload_0
      //   92: getfield b : Ljava/util/List;
      //   95: invokespecial <init> : (Ljava/util/Collection;)V
      //   98: aload #16
      //   100: invokevirtual toString : ()Ljava/lang/String;
      //   103: astore #16
      //   105: getstatic com/allinone/callerid/util/d0.a : Z
      //   108: istore #18
      //   110: ldc 'type_label'
      //   112: astore #19
      //   114: ldc 'searchList'
      //   116: astore #20
      //   118: iload #18
      //   120: ifeq -> 162
      //   123: new java/lang/StringBuilder
      //   126: astore #21
      //   128: aload #21
      //   130: invokespecial <init> : ()V
      //   133: aload #21
      //   135: ldc 'tel_number_list:'
      //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   140: pop
      //   141: aload #21
      //   143: aload #16
      //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   148: pop
      //   149: ldc 'searchList'
      //   151: aload #21
      //   153: invokevirtual toString : ()Ljava/lang/String;
      //   156: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
      //   159: goto -> 162
      //   162: ldc 'type'
      //   164: astore #22
      //   166: aload #16
      //   168: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
      //   171: astore #21
      //   173: aload #10
      //   175: invokestatic T : (Landroid/content/Context;)Ljava/lang/String;
      //   178: astore #23
      //   180: ldc 'operator'
      //   182: astore #24
      //   184: aload #10
      //   186: invokestatic W : (Landroid/content/Context;)Ljava/lang/String;
      //   189: astore #16
      //   191: ldc 'format_tel_number'
      //   193: astore #25
      //   195: aload_0
      //   196: getfield b : Ljava/util/List;
      //   199: astore #26
      //   201: aload #26
      //   203: invokeinterface size : ()I
      //   208: istore #27
      //   210: ldc 't_p'
      //   212: astore #28
      //   214: aload #10
      //   216: aload #26
      //   218: iload #27
      //   220: iconst_1
      //   221: isub
      //   222: invokeinterface get : (I)Ljava/lang/Object;
      //   227: checkcast java/lang/String
      //   230: invokestatic Q : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   233: astore #26
      //   235: getstatic com/allinone/callerid/util/d0.a : Z
      //   238: ifeq -> 405
      //   241: new java/lang/StringBuilder
      //   244: astore #29
      //   246: aload #29
      //   248: invokespecial <init> : ()V
      //   251: aload #29
      //   253: ldc '所有参数：tel_number_list:'
      //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   258: pop
      //   259: aload #29
      //   261: aload #21
      //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   266: pop
      //   267: aload #29
      //   269: ldc '\\n'
      //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   274: pop
      //   275: aload #29
      //   277: ldc 'device:'
      //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   282: pop
      //   283: aload #29
      //   285: ldc 'android'
      //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   290: pop
      //   291: aload #29
      //   293: ldc '\\n'
      //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   298: pop
      //   299: aload #29
      //   301: ldc 'uid:'
      //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   306: pop
      //   307: aload #29
      //   309: aload #23
      //   311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   314: pop
      //   315: aload #29
      //   317: ldc '\\n'
      //   319: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   322: pop
      //   323: aload #29
      //   325: ldc 'version:'
      //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   330: pop
      //   331: aload #29
      //   333: aload #16
      //   335: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   338: pop
      //   339: aload #29
      //   341: ldc '\\n'
      //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   346: pop
      //   347: aload #29
      //   349: ldc 'default_cc:'
      //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   354: pop
      //   355: aload #29
      //   357: aload #11
      //   359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   362: pop
      //   363: aload #29
      //   365: ldc '\\n'
      //   367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   370: pop
      //   371: aload #29
      //   373: ldc 'stamp:'
      //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   378: pop
      //   379: aload #29
      //   381: aload #26
      //   383: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   386: pop
      //   387: aload #29
      //   389: ldc '\\n'
      //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   394: pop
      //   395: ldc 'searchList'
      //   397: aload #29
      //   399: invokevirtual toString : ()Ljava/lang/String;
      //   402: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   405: aload #10
      //   407: invokestatic b : (Landroid/content/Context;)Z
      //   410: ifne -> 425
      //   413: aload_1
      //   414: invokestatic M2 : (Lcom/allinone/callerid/g/e;)Ljava/util/List;
      //   417: aload #11
      //   419: invokestatic c : (Ljava/util/List;Ljava/lang/String;)V
      //   422: ldc ''
      //   424: areturn
      //   425: new java/util/HashMap
      //   428: astore #29
      //   430: aload #29
      //   432: invokespecial <init> : ()V
      //   435: aload #29
      //   437: ldc 'tel_number_list'
      //   439: aload #21
      //   441: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   444: pop
      //   445: aload #29
      //   447: ldc 'device'
      //   449: ldc 'android'
      //   451: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   454: pop
      //   455: aload #29
      //   457: ldc 'uid'
      //   459: aload #23
      //   461: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   464: pop
      //   465: aload #29
      //   467: ldc 'version'
      //   469: aload #16
      //   471: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   474: pop
      //   475: aload #29
      //   477: ldc 'default_cc'
      //   479: aload #11
      //   481: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   484: pop
      //   485: aload #29
      //   487: ldc 'cc'
      //   489: aload #11
      //   491: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   494: pop
      //   495: aload #29
      //   497: ldc 'stamp'
      //   499: aload #26
      //   501: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   504: pop
      //   505: ldc 'https://app.show-caller.com/api/v1/sealis.php'
      //   507: aload #29
      //   509: invokestatic b : (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
      //   512: astore #16
      //   514: aload #16
      //   516: astore #23
      //   518: aload_1
      //   519: astore #14
      //   521: aload #11
      //   523: astore #21
      //   525: getstatic com/allinone/callerid/util/d0.a : Z
      //   528: istore #18
      //   530: iload #18
      //   532: ifeq -> 645
      //   535: aload #16
      //   537: astore #23
      //   539: aload_1
      //   540: astore #21
      //   542: aload #11
      //   544: astore #14
      //   546: new java/lang/StringBuilder
      //   549: astore #26
      //   551: aload #16
      //   553: astore #23
      //   555: aload_1
      //   556: astore #21
      //   558: aload #11
      //   560: astore #14
      //   562: aload #26
      //   564: invokespecial <init> : ()V
      //   567: aload #16
      //   569: astore #23
      //   571: aload_1
      //   572: astore #21
      //   574: aload #11
      //   576: astore #14
      //   578: aload #26
      //   580: ldc 'enlode_result:'
      //   582: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   585: pop
      //   586: aload #16
      //   588: astore #23
      //   590: aload_1
      //   591: astore #21
      //   593: aload #11
      //   595: astore #14
      //   597: aload #26
      //   599: aload #16
      //   601: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   604: pop
      //   605: aload #16
      //   607: astore #23
      //   609: aload_1
      //   610: astore #21
      //   612: aload #11
      //   614: astore #14
      //   616: ldc 'searchList'
      //   618: aload #26
      //   620: invokevirtual toString : ()Ljava/lang/String;
      //   623: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)V
      //   626: goto -> 645
      //   629: astore #16
      //   631: aload #21
      //   633: astore_1
      //   634: aload #14
      //   636: astore #11
      //   638: aload #23
      //   640: astore #14
      //   642: goto -> 3185
      //   645: aload #16
      //   647: ifnull -> 3125
      //   650: aload #16
      //   652: astore #23
      //   654: aload_1
      //   655: astore #14
      //   657: aload #11
      //   659: astore #21
      //   661: ldc ''
      //   663: aload #16
      //   665: invokevirtual equals : (Ljava/lang/Object;)Z
      //   668: ifne -> 3125
      //   671: aload #16
      //   673: astore #23
      //   675: aload_1
      //   676: astore #14
      //   678: aload #11
      //   680: astore #21
      //   682: new org/json/JSONObject
      //   685: astore #26
      //   687: aload #16
      //   689: astore #23
      //   691: aload_1
      //   692: astore #14
      //   694: aload #11
      //   696: astore #21
      //   698: aload #26
      //   700: aload #16
      //   702: invokespecial <init> : (Ljava/lang/String;)V
      //   705: aload #16
      //   707: astore #23
      //   709: aload_1
      //   710: astore #14
      //   712: aload #11
      //   714: astore #21
      //   716: aload #26
      //   718: ldc 'status'
      //   720: invokevirtual getInt : (Ljava/lang/String;)I
      //   723: iconst_1
      //   724: if_icmpne -> 3056
      //   727: aload #16
      //   729: astore #23
      //   731: aload_1
      //   732: astore #14
      //   734: aload #11
      //   736: astore #21
      //   738: aload #26
      //   740: ldc 'list'
      //   742: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   745: astore #29
      //   747: aload #16
      //   749: astore #23
      //   751: aload_1
      //   752: astore #14
      //   754: aload #11
      //   756: astore #21
      //   758: new org/json/JSONArray
      //   761: astore #26
      //   763: aload #16
      //   765: astore #23
      //   767: aload_1
      //   768: astore #14
      //   770: aload #11
      //   772: astore #21
      //   774: aload #26
      //   776: aload #29
      //   778: invokespecial <init> : (Ljava/lang/String;)V
      //   781: iconst_0
      //   782: istore #27
      //   784: aload #16
      //   786: astore #23
      //   788: aload_1
      //   789: astore #14
      //   791: aload #11
      //   793: astore #21
      //   795: iload #27
      //   797: aload #26
      //   799: invokevirtual length : ()I
      //   802: if_icmpge -> 2456
      //   805: aload #16
      //   807: astore #23
      //   809: aload_1
      //   810: astore #14
      //   812: aload #11
      //   814: astore #21
      //   816: aload #26
      //   818: iload #27
      //   820: invokevirtual getJSONObject : (I)Lorg/json/JSONObject;
      //   823: astore #30
      //   825: aload #16
      //   827: astore #23
      //   829: aload_1
      //   830: astore #14
      //   832: aload #11
      //   834: astore #21
      //   836: new com/allinone/callerid/model/EZSearchContacts
      //   839: astore #31
      //   841: aload #16
      //   843: astore #23
      //   845: aload_1
      //   846: astore #14
      //   848: aload #11
      //   850: astore #21
      //   852: aload #31
      //   854: invokespecial <init> : ()V
      //   857: aload #16
      //   859: astore #23
      //   861: aload_1
      //   862: astore #14
      //   864: aload #11
      //   866: astore #21
      //   868: aload #30
      //   870: aload_3
      //   871: invokevirtual getInt : (Ljava/lang/String;)I
      //   874: istore #32
      //   876: iload #32
      //   878: iconst_1
      //   879: if_icmpne -> 902
      //   882: aload #16
      //   884: astore #23
      //   886: aload_1
      //   887: astore #21
      //   889: aload #11
      //   891: astore #14
      //   893: aload #31
      //   895: iconst_1
      //   896: invokevirtual setSearched : (Z)V
      //   899: goto -> 921
      //   902: aload #16
      //   904: astore #23
      //   906: aload_1
      //   907: astore #14
      //   909: aload #11
      //   911: astore #21
      //   913: aload #31
      //   915: invokestatic currentTimeMillis : ()J
      //   918: invokevirtual setSearch_time : (J)V
      //   921: aload #16
      //   923: astore #23
      //   925: aload_1
      //   926: astore #14
      //   928: aload #11
      //   930: astore #21
      //   932: aload #31
      //   934: aload #30
      //   936: ldc_w 'old_tel_number'
      //   939: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   942: invokevirtual setOld_tel_number : (Ljava/lang/String;)V
      //   945: aload #16
      //   947: astore #23
      //   949: aload_1
      //   950: astore #14
      //   952: aload #11
      //   954: astore #21
      //   956: aload #31
      //   958: aload #30
      //   960: aload_2
      //   961: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   964: invokevirtual setTel_number : (Ljava/lang/String;)V
      //   967: aload #16
      //   969: astore #23
      //   971: aload_1
      //   972: astore #14
      //   974: aload #11
      //   976: astore #21
      //   978: aload #31
      //   980: aload #30
      //   982: aload #28
      //   984: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   987: invokevirtual setT_p : (Ljava/lang/String;)V
      //   990: aload #16
      //   992: astore #23
      //   994: aload_1
      //   995: astore #14
      //   997: aload #11
      //   999: astore #21
      //   1001: aload #31
      //   1003: aload #30
      //   1005: aload #25
      //   1007: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1010: invokevirtual setFormat_tel_number : (Ljava/lang/String;)V
      //   1013: aload #31
      //   1015: aload #30
      //   1017: aload #24
      //   1019: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1022: invokevirtual setOperator : (Ljava/lang/String;)V
      //   1025: aload #31
      //   1027: aload #30
      //   1029: aload #22
      //   1031: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1034: invokevirtual setType : (Ljava/lang/String;)V
      //   1037: aload #31
      //   1039: aload #30
      //   1041: aload #19
      //   1043: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1046: invokevirtual setType_label : (Ljava/lang/String;)V
      //   1049: aload #11
      //   1051: astore #14
      //   1053: aload #31
      //   1055: aload #30
      //   1057: aload #17
      //   1059: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1062: invokevirtual setReport_count : (Ljava/lang/String;)V
      //   1065: aload #31
      //   1067: aload #30
      //   1069: aload #15
      //   1071: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1074: invokevirtual setName : (Ljava/lang/String;)V
      //   1077: aload #31
      //   1079: aload #30
      //   1081: aload #13
      //   1083: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1086: invokevirtual setAddress : (Ljava/lang/String;)V
      //   1089: aload #28
      //   1091: astore #29
      //   1093: aload #31
      //   1095: aload #30
      //   1097: aload #12
      //   1099: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1102: invokevirtual setBelong_area : (Ljava/lang/String;)V
      //   1105: aload #31
      //   1107: aload #30
      //   1109: aload #9
      //   1111: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1114: invokevirtual setAvatar : (Ljava/lang/String;)V
      //   1117: aload #31
      //   1119: aload #30
      //   1121: aload_3
      //   1122: invokevirtual getInt : (Ljava/lang/String;)I
      //   1125: invokevirtual setFaild_error_log : (I)V
      //   1128: aload #31
      //   1130: aload #30
      //   1132: aload #8
      //   1134: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1137: invokevirtual setName_tags : (Ljava/lang/String;)V
      //   1140: aload #31
      //   1142: aload #30
      //   1144: aload #6
      //   1146: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1149: invokevirtual setType_tags : (Ljava/lang/String;)V
      //   1152: aload #31
      //   1154: aload #30
      //   1156: ldc_w 'soft_comments_tags'
      //   1159: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1162: invokevirtual setComment_tags : (Ljava/lang/String;)V
      //   1165: aload #31
      //   1167: aload #30
      //   1169: aload #5
      //   1171: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1174: invokevirtual setCountry : (Ljava/lang/String;)V
      //   1177: aload #31
      //   1179: aload #30
      //   1181: aload #4
      //   1183: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1186: invokevirtual setE164_tel_number : (Ljava/lang/String;)V
      //   1189: aload #31
      //   1191: aload #30
      //   1193: aload #7
      //   1195: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1198: invokevirtual setCc : (Ljava/lang/String;)V
      //   1201: aload #30
      //   1203: aload #15
      //   1205: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1208: astore #11
      //   1210: aload #30
      //   1212: aload #19
      //   1214: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1217: astore #21
      //   1219: aload #30
      //   1221: aload #17
      //   1223: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1226: astore #23
      //   1228: ldc ''
      //   1230: aload #11
      //   1232: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1235: ifeq -> 1264
      //   1238: ldc ''
      //   1240: aload #21
      //   1242: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1245: ifne -> 1261
      //   1248: ldc ''
      //   1250: aload #23
      //   1252: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1255: ifne -> 1261
      //   1258: goto -> 1264
      //   1261: goto -> 1316
      //   1264: invokestatic w0 : ()I
      //   1267: iconst_1
      //   1268: iadd
      //   1269: invokestatic d2 : (I)V
      //   1272: getstatic com/allinone/callerid/util/d0.a : Z
      //   1275: ifeq -> 1316
      //   1278: new java/lang/StringBuilder
      //   1281: astore #11
      //   1283: aload #11
      //   1285: invokespecial <init> : ()V
      //   1288: aload #11
      //   1290: ldc_w 'spam_or_name:'
      //   1293: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1296: pop
      //   1297: aload #11
      //   1299: invokestatic w0 : ()I
      //   1302: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   1305: pop
      //   1306: aload #20
      //   1308: aload #11
      //   1310: invokevirtual toString : ()Ljava/lang/String;
      //   1313: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   1316: invokestatic h : ()Z
      //   1319: istore #18
      //   1321: iload #18
      //   1323: ifeq -> 1759
      //   1326: aload #31
      //   1328: invokevirtual getType_label : ()Ljava/lang/String;
      //   1331: ifnull -> 1759
      //   1334: ldc ''
      //   1336: aload #31
      //   1338: invokevirtual getType_label : ()Ljava/lang/String;
      //   1341: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1344: ifne -> 1759
      //   1347: aload #31
      //   1349: invokevirtual getReport_count : ()Ljava/lang/String;
      //   1352: ifnull -> 1759
      //   1355: ldc ''
      //   1357: aload #31
      //   1359: invokevirtual getReport_count : ()Ljava/lang/String;
      //   1362: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1365: ifne -> 1759
      //   1368: aload #10
      //   1370: aload #31
      //   1372: invokevirtual getOld_tel_number : ()Ljava/lang/String;
      //   1375: invokestatic Y : (Landroid/content/Context;Ljava/lang/String;)Z
      //   1378: ifne -> 1759
      //   1381: invokestatic a : ()Lcom/allinone/callerid/f/i;
      //   1384: invokevirtual b : ()Ljava/util/List;
      //   1387: astore #11
      //   1389: aload #11
      //   1391: ifnull -> 1576
      //   1394: aload #11
      //   1396: invokeinterface size : ()I
      //   1401: iconst_3
      //   1402: if_icmpge -> 1576
      //   1405: new com/allinone/callerid/bean/SpamCall
      //   1408: astore #11
      //   1410: aload #11
      //   1412: invokespecial <init> : ()V
      //   1415: aload #11
      //   1417: aload #31
      //   1419: invokevirtual getOld_tel_number : ()Ljava/lang/String;
      //   1422: invokevirtual setNumber : (Ljava/lang/String;)V
      //   1425: aload #11
      //   1427: aload #31
      //   1429: invokevirtual getType_label : ()Ljava/lang/String;
      //   1432: invokevirtual setTypelabel : (Ljava/lang/String;)V
      //   1435: aload #11
      //   1437: aload #31
      //   1439: invokevirtual getReport_count : ()Ljava/lang/String;
      //   1442: invokevirtual setReportcounts : (Ljava/lang/String;)V
      //   1445: aload #11
      //   1447: aload #31
      //   1449: invokevirtual getType : ()Ljava/lang/String;
      //   1452: invokevirtual setType : (Ljava/lang/String;)V
      //   1455: aload #11
      //   1457: aload #31
      //   1459: invokevirtual getTel_number : ()Ljava/lang/String;
      //   1462: invokevirtual setTel_number : (Ljava/lang/String;)V
      //   1465: aload #11
      //   1467: aload #31
      //   1469: invokevirtual getFormat_tel_number : ()Ljava/lang/String;
      //   1472: invokevirtual setFormat_tel_number : (Ljava/lang/String;)V
      //   1475: aload #11
      //   1477: aload #31
      //   1479: invokevirtual getOperator : ()Ljava/lang/String;
      //   1482: invokevirtual setOperator : (Ljava/lang/String;)V
      //   1485: aload #11
      //   1487: aload #31
      //   1489: invokevirtual getName : ()Ljava/lang/String;
      //   1492: invokevirtual setName : (Ljava/lang/String;)V
      //   1495: aload #11
      //   1497: aload #31
      //   1499: invokevirtual getAddress : ()Ljava/lang/String;
      //   1502: invokevirtual setAddress : (Ljava/lang/String;)V
      //   1505: aload #11
      //   1507: aload #31
      //   1509: invokevirtual getBelong_area : ()Ljava/lang/String;
      //   1512: invokevirtual setBelong_area : (Ljava/lang/String;)V
      //   1515: aload #11
      //   1517: aload #31
      //   1519: invokevirtual getAvatar : ()Ljava/lang/String;
      //   1522: invokevirtual setAvatar : (Ljava/lang/String;)V
      //   1525: aload #11
      //   1527: aload #31
      //   1529: invokevirtual getName_tags : ()Ljava/lang/String;
      //   1532: invokevirtual setName_tags : (Ljava/lang/String;)V
      //   1535: aload #11
      //   1537: aload #31
      //   1539: invokevirtual getType_tags : ()Ljava/lang/String;
      //   1542: invokevirtual setType_tags : (Ljava/lang/String;)V
      //   1545: aload #11
      //   1547: aload #31
      //   1549: invokevirtual getComment_tags : ()Ljava/lang/String;
      //   1552: invokevirtual setComment_tags : (Ljava/lang/String;)V
      //   1555: aload #11
      //   1557: aload #31
      //   1559: invokevirtual getCountry : ()Ljava/lang/String;
      //   1562: invokevirtual setCountry : (Ljava/lang/String;)V
      //   1565: invokestatic a : ()Lcom/allinone/callerid/f/i;
      //   1568: aload #11
      //   1570: invokevirtual c : (Lcom/allinone/callerid/bean/SpamCall;)V
      //   1573: goto -> 1759
      //   1576: aload #11
      //   1578: ifnonnull -> 1759
      //   1581: new com/allinone/callerid/bean/SpamCall
      //   1584: astore #11
      //   1586: aload #11
      //   1588: invokespecial <init> : ()V
      //   1591: aload #11
      //   1593: aload #31
      //   1595: invokevirtual getOld_tel_number : ()Ljava/lang/String;
      //   1598: invokevirtual setNumber : (Ljava/lang/String;)V
      //   1601: aload #11
      //   1603: aload #31
      //   1605: invokevirtual getType_label : ()Ljava/lang/String;
      //   1608: invokevirtual setTypelabel : (Ljava/lang/String;)V
      //   1611: aload #11
      //   1613: aload #31
      //   1615: invokevirtual getReport_count : ()Ljava/lang/String;
      //   1618: invokevirtual setReportcounts : (Ljava/lang/String;)V
      //   1621: aload #11
      //   1623: aload #31
      //   1625: invokevirtual getType : ()Ljava/lang/String;
      //   1628: invokevirtual setType : (Ljava/lang/String;)V
      //   1631: aload #11
      //   1633: aload #31
      //   1635: invokevirtual getTel_number : ()Ljava/lang/String;
      //   1638: invokevirtual setTel_number : (Ljava/lang/String;)V
      //   1641: aload #11
      //   1643: aload #31
      //   1645: invokevirtual getFormat_tel_number : ()Ljava/lang/String;
      //   1648: invokevirtual setFormat_tel_number : (Ljava/lang/String;)V
      //   1651: aload #11
      //   1653: aload #31
      //   1655: invokevirtual getOperator : ()Ljava/lang/String;
      //   1658: invokevirtual setOperator : (Ljava/lang/String;)V
      //   1661: aload #11
      //   1663: aload #31
      //   1665: invokevirtual getName : ()Ljava/lang/String;
      //   1668: invokevirtual setName : (Ljava/lang/String;)V
      //   1671: aload #11
      //   1673: aload #31
      //   1675: invokevirtual getAddress : ()Ljava/lang/String;
      //   1678: invokevirtual setAddress : (Ljava/lang/String;)V
      //   1681: aload #11
      //   1683: aload #31
      //   1685: invokevirtual getBelong_area : ()Ljava/lang/String;
      //   1688: invokevirtual setBelong_area : (Ljava/lang/String;)V
      //   1691: aload #11
      //   1693: aload #31
      //   1695: invokevirtual getAvatar : ()Ljava/lang/String;
      //   1698: invokevirtual setAvatar : (Ljava/lang/String;)V
      //   1701: aload #11
      //   1703: aload #31
      //   1705: invokevirtual getName_tags : ()Ljava/lang/String;
      //   1708: invokevirtual setName_tags : (Ljava/lang/String;)V
      //   1711: aload #11
      //   1713: aload #31
      //   1715: invokevirtual getType_tags : ()Ljava/lang/String;
      //   1718: invokevirtual setType_tags : (Ljava/lang/String;)V
      //   1721: aload #11
      //   1723: aload #31
      //   1725: invokevirtual getComment_tags : ()Ljava/lang/String;
      //   1728: invokevirtual setComment_tags : (Ljava/lang/String;)V
      //   1731: aload #11
      //   1733: aload #31
      //   1735: invokevirtual getCountry : ()Ljava/lang/String;
      //   1738: invokevirtual setCountry : (Ljava/lang/String;)V
      //   1741: invokestatic a : ()Lcom/allinone/callerid/f/i;
      //   1744: aload #11
      //   1746: invokevirtual c : (Lcom/allinone/callerid/bean/SpamCall;)V
      //   1749: goto -> 1759
      //   1752: astore #11
      //   1754: aload #11
      //   1756: invokevirtual printStackTrace : ()V
      //   1759: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   1762: aload #31
      //   1764: invokevirtual getOld_tel_number : ()Ljava/lang/String;
      //   1767: invokevirtual d : (Ljava/lang/String;)Lcom/allinone/callerid/model/EZSearchContacts;
      //   1770: astore #21
      //   1772: aload_0
      //   1773: astore #11
      //   1775: aload #11
      //   1777: aload #21
      //   1779: putfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   1782: aload #21
      //   1784: ifnull -> 2388
      //   1787: aload #21
      //   1789: invokevirtual getSearch_time : ()J
      //   1792: lstore #33
      //   1794: lload #33
      //   1796: lconst_0
      //   1797: lcmp
      //   1798: ifeq -> 1860
      //   1801: aload #11
      //   1803: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   1806: astore #21
      //   1808: aload #21
      //   1810: iconst_0
      //   1811: invokevirtual setIs_can_search : (Z)V
      //   1814: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   1817: astore #21
      //   1819: aload #11
      //   1821: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   1824: astore #23
      //   1826: aload #21
      //   1828: aload #23
      //   1830: iconst_1
      //   1831: anewarray java/lang/String
      //   1834: dup
      //   1835: iconst_0
      //   1836: ldc_w 'is_can_search'
      //   1839: aastore
      //   1840: invokevirtual e : (Lcom/allinone/callerid/model/EZSearchContacts;[Ljava/lang/String;)V
      //   1843: goto -> 1860
      //   1846: astore_1
      //   1847: goto -> 2385
      //   1850: astore #11
      //   1852: goto -> 2385
      //   1855: astore #11
      //   1857: goto -> 2406
      //   1860: aload #31
      //   1862: invokevirtual getComment_tags : ()Ljava/lang/String;
      //   1865: astore #21
      //   1867: aload #21
      //   1869: ifnull -> 1924
      //   1872: ldc ''
      //   1874: aload #21
      //   1876: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1879: ifne -> 1924
      //   1882: aload #11
      //   1884: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   1887: aload #21
      //   1889: invokevirtual setComment_tags : (Ljava/lang/String;)V
      //   1892: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   1895: astore #21
      //   1897: aload #11
      //   1899: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   1902: astore #23
      //   1904: aload #21
      //   1906: aload #23
      //   1908: iconst_1
      //   1909: anewarray java/lang/String
      //   1912: dup
      //   1913: iconst_0
      //   1914: ldc_w 'comment_tags'
      //   1917: aastore
      //   1918: invokevirtual e : (Lcom/allinone/callerid/model/EZSearchContacts;[Ljava/lang/String;)V
      //   1921: goto -> 1924
      //   1924: aload #31
      //   1926: invokevirtual getName_tags : ()Ljava/lang/String;
      //   1929: astore #21
      //   1931: aload #21
      //   1933: ifnull -> 1991
      //   1936: ldc ''
      //   1938: aload #21
      //   1940: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1943: ifne -> 1991
      //   1946: aload #11
      //   1948: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   1951: aload #21
      //   1953: invokevirtual setName_tags : (Ljava/lang/String;)V
      //   1956: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   1959: astore #23
      //   1961: aload #11
      //   1963: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   1966: astore #21
      //   1968: aload #23
      //   1970: aload #21
      //   1972: iconst_1
      //   1973: anewarray java/lang/String
      //   1976: dup
      //   1977: iconst_0
      //   1978: aload #8
      //   1980: aastore
      //   1981: invokevirtual e : (Lcom/allinone/callerid/model/EZSearchContacts;[Ljava/lang/String;)V
      //   1984: goto -> 1991
      //   1987: astore_1
      //   1988: goto -> 2406
      //   1991: aload #31
      //   1993: invokevirtual getType_tags : ()Ljava/lang/String;
      //   1996: astore #21
      //   1998: aload #21
      //   2000: ifnull -> 2043
      //   2003: ldc ''
      //   2005: aload #21
      //   2007: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2010: ifne -> 2043
      //   2013: aload #11
      //   2015: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2018: aload #21
      //   2020: invokevirtual setType_tags : (Ljava/lang/String;)V
      //   2023: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   2026: aload #11
      //   2028: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2031: iconst_1
      //   2032: anewarray java/lang/String
      //   2035: dup
      //   2036: iconst_0
      //   2037: aload #6
      //   2039: aastore
      //   2040: invokevirtual e : (Lcom/allinone/callerid/model/EZSearchContacts;[Ljava/lang/String;)V
      //   2043: aload #11
      //   2045: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2048: aload #31
      //   2050: invokevirtual isSearched : ()Z
      //   2053: invokevirtual setSearched : (Z)V
      //   2056: aload #11
      //   2058: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2061: aload #31
      //   2063: invokevirtual getType_label : ()Ljava/lang/String;
      //   2066: invokevirtual setType_label : (Ljava/lang/String;)V
      //   2069: aload #11
      //   2071: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2074: aload #31
      //   2076: invokevirtual getReport_count : ()Ljava/lang/String;
      //   2079: invokevirtual setReport_count : (Ljava/lang/String;)V
      //   2082: aload #11
      //   2084: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2087: aload #31
      //   2089: invokevirtual getBelong_area : ()Ljava/lang/String;
      //   2092: invokevirtual setBelong_area : (Ljava/lang/String;)V
      //   2095: aload #11
      //   2097: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2100: aload #31
      //   2102: invokevirtual getName : ()Ljava/lang/String;
      //   2105: invokevirtual setName : (Ljava/lang/String;)V
      //   2108: aload #11
      //   2110: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2113: aload #31
      //   2115: invokevirtual getType : ()Ljava/lang/String;
      //   2118: invokevirtual setType : (Ljava/lang/String;)V
      //   2121: aload #11
      //   2123: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2126: aload #31
      //   2128: invokevirtual getFormat_tel_number : ()Ljava/lang/String;
      //   2131: invokevirtual setFormat_tel_number : (Ljava/lang/String;)V
      //   2134: aload #11
      //   2136: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2139: aload #31
      //   2141: invokevirtual getOperator : ()Ljava/lang/String;
      //   2144: invokevirtual setOperator : (Ljava/lang/String;)V
      //   2147: aload #11
      //   2149: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2152: aload #31
      //   2154: invokevirtual getAddress : ()Ljava/lang/String;
      //   2157: invokevirtual setAddress : (Ljava/lang/String;)V
      //   2160: aload #11
      //   2162: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2165: aload #31
      //   2167: invokevirtual getAvatar : ()Ljava/lang/String;
      //   2170: invokevirtual setAvatar : (Ljava/lang/String;)V
      //   2173: aload #11
      //   2175: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2178: aload #31
      //   2180: invokevirtual getTel_number : ()Ljava/lang/String;
      //   2183: invokevirtual setTel_number : (Ljava/lang/String;)V
      //   2186: aload #11
      //   2188: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2191: aload #31
      //   2193: invokevirtual getT_p : ()Ljava/lang/String;
      //   2196: invokevirtual setT_p : (Ljava/lang/String;)V
      //   2199: aload #11
      //   2201: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2204: astore #21
      //   2206: aload #21
      //   2208: aload #31
      //   2210: invokevirtual getSearch_time : ()J
      //   2213: invokevirtual setSearch_time : (J)V
      //   2216: aload #11
      //   2218: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2221: aload #31
      //   2223: invokevirtual getCountry : ()Ljava/lang/String;
      //   2226: invokevirtual setCountry : (Ljava/lang/String;)V
      //   2229: aload #11
      //   2231: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2234: aload #31
      //   2236: invokevirtual getE164_tel_number : ()Ljava/lang/String;
      //   2239: invokevirtual setE164_tel_number : (Ljava/lang/String;)V
      //   2242: aload #11
      //   2244: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2247: aload #31
      //   2249: invokevirtual getCc : ()Ljava/lang/String;
      //   2252: invokevirtual setCc : (Ljava/lang/String;)V
      //   2255: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   2258: astore #21
      //   2260: aload #11
      //   2262: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2265: astore #11
      //   2267: aload #21
      //   2269: aload #11
      //   2271: bipush #16
      //   2273: anewarray java/lang/String
      //   2276: dup
      //   2277: iconst_0
      //   2278: ldc_w 'isSearched'
      //   2281: aastore
      //   2282: dup
      //   2283: iconst_1
      //   2284: aload #19
      //   2286: aastore
      //   2287: dup
      //   2288: iconst_2
      //   2289: aload #17
      //   2291: aastore
      //   2292: dup
      //   2293: iconst_3
      //   2294: aload #12
      //   2296: aastore
      //   2297: dup
      //   2298: iconst_4
      //   2299: aload #15
      //   2301: aastore
      //   2302: dup
      //   2303: iconst_5
      //   2304: aload #22
      //   2306: aastore
      //   2307: dup
      //   2308: bipush #6
      //   2310: aload #25
      //   2312: aastore
      //   2313: dup
      //   2314: bipush #7
      //   2316: aload #24
      //   2318: aastore
      //   2319: dup
      //   2320: bipush #8
      //   2322: aload #13
      //   2324: aastore
      //   2325: dup
      //   2326: bipush #9
      //   2328: aload #9
      //   2330: aastore
      //   2331: dup
      //   2332: bipush #10
      //   2334: aload_2
      //   2335: aastore
      //   2336: dup
      //   2337: bipush #11
      //   2339: aload #29
      //   2341: aastore
      //   2342: dup
      //   2343: bipush #12
      //   2345: ldc_w 'search_time'
      //   2348: aastore
      //   2349: dup
      //   2350: bipush #13
      //   2352: aload #5
      //   2354: aastore
      //   2355: dup
      //   2356: bipush #14
      //   2358: aload #4
      //   2360: aastore
      //   2361: dup
      //   2362: bipush #15
      //   2364: aload #7
      //   2366: aastore
      //   2367: invokevirtual e : (Lcom/allinone/callerid/model/EZSearchContacts;[Ljava/lang/String;)V
      //   2370: goto -> 2427
      //   2373: astore #11
      //   2375: goto -> 2411
      //   2378: astore #11
      //   2380: goto -> 2411
      //   2383: astore #11
      //   2385: goto -> 2411
      //   2388: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   2391: aload #31
      //   2393: invokevirtual c : (Lcom/allinone/callerid/model/EZSearchContacts;)V
      //   2396: goto -> 2427
      //   2399: astore #11
      //   2401: goto -> 2411
      //   2404: astore #11
      //   2406: goto -> 2411
      //   2409: astore #11
      //   2411: aload_1
      //   2412: astore #28
      //   2414: aload #14
      //   2416: astore #23
      //   2418: aload #16
      //   2420: astore #21
      //   2422: aload #11
      //   2424: invokevirtual printStackTrace : ()V
      //   2427: iinc #27, 1
      //   2430: aload #14
      //   2432: astore #11
      //   2434: aload #29
      //   2436: astore #28
      //   2438: goto -> 784
      //   2441: astore #11
      //   2443: goto -> 3157
      //   2446: astore #11
      //   2448: goto -> 3157
      //   2451: astore #21
      //   2453: goto -> 3149
      //   2456: aload_0
      //   2457: astore #23
      //   2459: aload_1
      //   2460: astore #14
      //   2462: aload #10
      //   2464: astore #21
      //   2466: aload #14
      //   2468: astore #24
      //   2470: aload #11
      //   2472: astore #10
      //   2474: aload #16
      //   2476: astore_1
      //   2477: aload #14
      //   2479: invokestatic M2 : (Lcom/allinone/callerid/g/e;)Ljava/util/List;
      //   2482: ifnull -> 3066
      //   2485: aload #14
      //   2487: astore #24
      //   2489: aload #11
      //   2491: astore #10
      //   2493: aload #16
      //   2495: astore_1
      //   2496: aload #14
      //   2498: invokestatic M2 : (Lcom/allinone/callerid/g/e;)Ljava/util/List;
      //   2501: invokeinterface size : ()I
      //   2506: ifeq -> 3066
      //   2509: iconst_0
      //   2510: istore #27
      //   2512: aload #14
      //   2514: astore #24
      //   2516: aload #11
      //   2518: astore #10
      //   2520: aload #16
      //   2522: astore_1
      //   2523: iload #27
      //   2525: aload #14
      //   2527: invokestatic M2 : (Lcom/allinone/callerid/g/e;)Ljava/util/List;
      //   2530: invokeinterface size : ()I
      //   2535: if_icmpge -> 3066
      //   2538: aload #14
      //   2540: invokestatic M2 : (Lcom/allinone/callerid/g/e;)Ljava/util/List;
      //   2543: iload #27
      //   2545: invokeinterface get : (I)Ljava/lang/Object;
      //   2550: checkcast com/allinone/callerid/search/CallLogBean
      //   2553: astore #28
      //   2555: invokestatic b : ()Lcom/allinone/callerid/f/f;
      //   2558: aload #28
      //   2560: invokevirtual p : ()Ljava/lang/String;
      //   2563: invokevirtual d : (Ljava/lang/String;)Lcom/allinone/callerid/model/EZSearchContacts;
      //   2566: astore_1
      //   2567: aload #23
      //   2569: aload_1
      //   2570: putfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2573: aload_1
      //   2574: ifnull -> 3019
      //   2577: aload #28
      //   2579: aload_1
      //   2580: invokevirtual isSearched : ()Z
      //   2583: invokevirtual O0 : (Z)V
      //   2586: aload #28
      //   2588: iconst_0
      //   2589: invokevirtual j0 : (Z)V
      //   2592: aload #23
      //   2594: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2597: invokevirtual getType_label : ()Ljava/lang/String;
      //   2600: astore #10
      //   2602: aload #21
      //   2604: astore_1
      //   2605: aload #28
      //   2607: aload_1
      //   2608: aload #10
      //   2610: invokestatic D : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   2613: invokevirtual d1 : (Ljava/lang/String;)V
      //   2616: aload #28
      //   2618: aload #23
      //   2620: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2623: invokevirtual getType_label : ()Ljava/lang/String;
      //   2626: invokevirtual e1 : (Ljava/lang/String;)V
      //   2629: aload #28
      //   2631: aload #23
      //   2633: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2636: invokevirtual getReport_count : ()Ljava/lang/String;
      //   2639: invokevirtual K0 : (Ljava/lang/String;)V
      //   2642: aload #28
      //   2644: aload #23
      //   2646: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2649: invokevirtual getBelong_area : ()Ljava/lang/String;
      //   2652: invokevirtual e0 : (Ljava/lang/String;)V
      //   2655: aload #28
      //   2657: aload #23
      //   2659: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2662: invokevirtual getName : ()Ljava/lang/String;
      //   2665: invokevirtual L0 : (Ljava/lang/String;)V
      //   2668: aload #23
      //   2670: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2673: invokevirtual getType : ()Ljava/lang/String;
      //   2676: ifnull -> 2730
      //   2679: ldc_w 'Mobile'
      //   2682: aload #23
      //   2684: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2687: invokevirtual getType : ()Ljava/lang/String;
      //   2690: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2693: ifne -> 2713
      //   2696: ldc_w 'Fixed line'
      //   2699: aload #23
      //   2701: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2704: invokevirtual getType : ()Ljava/lang/String;
      //   2707: invokevirtual equals : (Ljava/lang/Object;)Z
      //   2710: ifeq -> 2730
      //   2713: aload #28
      //   2715: aload_1
      //   2716: aload #23
      //   2718: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2721: invokevirtual getType : ()Ljava/lang/String;
      //   2724: invokestatic J : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   2727: invokevirtual N0 : (Ljava/lang/String;)V
      //   2730: aload #28
      //   2732: aload #23
      //   2734: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2737: invokevirtual getTel_number : ()Ljava/lang/String;
      //   2740: invokevirtual Z0 : (Ljava/lang/String;)V
      //   2743: aload #28
      //   2745: aload #23
      //   2747: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2750: invokevirtual getOld_tel_number : ()Ljava/lang/String;
      //   2753: invokevirtual F0 : (Ljava/lang/String;)V
      //   2756: aload #28
      //   2758: aload #23
      //   2760: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2763: invokevirtual getFormat_tel_number : ()Ljava/lang/String;
      //   2766: invokevirtual w0 : (Ljava/lang/String;)V
      //   2769: aload #28
      //   2771: aload #23
      //   2773: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2776: invokevirtual getOperator : ()Ljava/lang/String;
      //   2779: invokevirtual G0 : (Ljava/lang/String;)V
      //   2782: aload #28
      //   2784: aload #23
      //   2786: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2789: invokevirtual getAddress : ()Ljava/lang/String;
      //   2792: invokevirtual a0 : (Ljava/lang/String;)V
      //   2795: aload #28
      //   2797: aload #23
      //   2799: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2802: invokevirtual getAvatar : ()Ljava/lang/String;
      //   2805: invokevirtual b0 : (Ljava/lang/String;)V
      //   2808: aload #28
      //   2810: aload #23
      //   2812: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2815: invokevirtual getFb_avatar : ()Ljava/lang/String;
      //   2818: invokevirtual v0 : (Ljava/lang/String;)V
      //   2821: aload #28
      //   2823: aload #23
      //   2825: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2828: invokevirtual getT_p : ()Ljava/lang/String;
      //   2831: invokevirtual Y0 : (Ljava/lang/String;)V
      //   2834: aload #28
      //   2836: aload #23
      //   2838: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2841: invokevirtual getName_tags : ()Ljava/lang/String;
      //   2844: invokevirtual C0 : (Ljava/lang/String;)V
      //   2847: aload #28
      //   2849: aload #23
      //   2851: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2854: invokevirtual getType_tags : ()Ljava/lang/String;
      //   2857: invokevirtual f1 : (Ljava/lang/String;)V
      //   2860: aload #28
      //   2862: aload #23
      //   2864: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2867: invokevirtual getComment_tags : ()Ljava/lang/String;
      //   2870: invokevirtual n0 : (Ljava/lang/String;)V
      //   2873: aload #28
      //   2875: aload #23
      //   2877: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2880: invokevirtual getCountry : ()Ljava/lang/String;
      //   2883: invokevirtual q0 : (Ljava/lang/String;)V
      //   2886: aload #28
      //   2888: aload #23
      //   2890: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2893: invokevirtual getSubtype : ()Ljava/lang/String;
      //   2896: invokevirtual V0 : (Ljava/lang/String;)V
      //   2899: aload #28
      //   2901: aload #23
      //   2903: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2906: invokevirtual getSubtype_cc : ()Ljava/lang/String;
      //   2909: invokevirtual W0 : (Ljava/lang/String;)V
      //   2912: aload #28
      //   2914: aload #23
      //   2916: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2919: invokevirtual getKeyword : ()Ljava/lang/String;
      //   2922: invokevirtual y0 : (Ljava/lang/String;)V
      //   2925: aload #28
      //   2927: aload #28
      //   2929: invokevirtual p : ()Ljava/lang/String;
      //   2932: invokestatic v0 : (Ljava/lang/String;)Z
      //   2935: invokevirtual g1 : (Z)V
      //   2938: aload #28
      //   2940: aload #23
      //   2942: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2945: invokevirtual getFaild_error_log : ()I
      //   2948: invokevirtual u0 : (I)V
      //   2951: aload #28
      //   2953: aload #23
      //   2955: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2958: invokevirtual getSubtype_pdt : ()Ljava/lang/String;
      //   2961: invokevirtual X0 : (Ljava/lang/String;)V
      //   2964: aload #28
      //   2966: aload #23
      //   2968: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2971: invokevirtual getComment_count : ()Ljava/lang/String;
      //   2974: invokevirtual k0 : (Ljava/lang/String;)V
      //   2977: aload #28
      //   2979: aload #23
      //   2981: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2984: invokevirtual isCan_search_commentcount : ()Z
      //   2987: invokevirtual i0 : (Z)V
      //   2990: aload #28
      //   2992: aload #23
      //   2994: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   2997: invokevirtual getSearch_time : ()J
      //   3000: invokevirtual M0 : (J)V
      //   3003: aload #28
      //   3005: aload #23
      //   3007: getfield c : Lcom/allinone/callerid/model/EZSearchContacts;
      //   3010: invokevirtual isIs_can_search : ()Z
      //   3013: invokevirtual h0 : (Z)V
      //   3016: goto -> 3019
      //   3019: iinc #27, 1
      //   3022: goto -> 2512
      //   3025: astore_1
      //   3026: aload #14
      //   3028: astore #28
      //   3030: aload #11
      //   3032: astore #23
      //   3034: aload #16
      //   3036: astore #21
      //   3038: aload_1
      //   3039: invokevirtual printStackTrace : ()V
      //   3042: aload #14
      //   3044: astore #24
      //   3046: aload #11
      //   3048: astore #10
      //   3050: aload #16
      //   3052: astore_1
      //   3053: goto -> 3066
      //   3056: aload_1
      //   3057: astore #24
      //   3059: aload #16
      //   3061: astore_1
      //   3062: aload #11
      //   3064: astore #10
      //   3066: aload #24
      //   3068: astore #28
      //   3070: aload #10
      //   3072: astore #23
      //   3074: aload_1
      //   3075: astore #21
      //   3077: aload_1
      //   3078: astore #11
      //   3080: aload_0
      //   3081: getfield d : Z
      //   3084: ifeq -> 3129
      //   3087: aload #24
      //   3089: astore #28
      //   3091: aload #10
      //   3093: astore #23
      //   3095: aload_1
      //   3096: astore #21
      //   3098: aload #24
      //   3100: invokestatic f2 : (Lcom/allinone/callerid/g/e;)V
      //   3103: aload_1
      //   3104: astore #11
      //   3106: goto -> 3129
      //   3109: astore #11
      //   3111: aload #28
      //   3113: astore_1
      //   3114: aload #23
      //   3116: astore #14
      //   3118: aload #21
      //   3120: astore #16
      //   3122: goto -> 3157
      //   3125: aload #16
      //   3127: astore #11
      //   3129: goto -> 3209
      //   3132: astore #28
      //   3134: aload #23
      //   3136: astore #16
      //   3138: aload #21
      //   3140: astore #11
      //   3142: aload #14
      //   3144: astore_1
      //   3145: aload #28
      //   3147: astore #21
      //   3149: aload #11
      //   3151: astore #14
      //   3153: aload #21
      //   3155: astore #11
      //   3157: aload #16
      //   3159: astore #21
      //   3161: aload #11
      //   3163: astore #16
      //   3165: aload #21
      //   3167: astore #11
      //   3169: aload_1
      //   3170: astore #21
      //   3172: aload #14
      //   3174: astore_1
      //   3175: goto -> 3195
      //   3178: astore #16
      //   3180: goto -> 3185
      //   3183: astore #16
      //   3185: aload_1
      //   3186: astore #21
      //   3188: aload #11
      //   3190: astore_1
      //   3191: aload #14
      //   3193: astore #11
      //   3195: aload #16
      //   3197: invokevirtual printStackTrace : ()V
      //   3200: aload #21
      //   3202: invokestatic M2 : (Lcom/allinone/callerid/g/e;)Ljava/util/List;
      //   3205: aload_1
      //   3206: invokestatic c : (Ljava/util/List;Ljava/lang/String;)V
      //   3209: aload_0
      //   3210: invokestatic h : ()Z
      //   3213: putfield e : Z
      //   3216: goto -> 3223
      //   3219: aload #14
      //   3221: astore #11
      //   3223: aload #11
      //   3225: areturn
      // Exception table:
      //   from	to	target	type
      //   80	85	3183	java/lang/Exception
      //   89	110	3183	java/lang/Exception
      //   123	159	3183	java/lang/Exception
      //   166	180	3183	java/lang/Exception
      //   184	191	3183	java/lang/Exception
      //   195	210	3183	java/lang/Exception
      //   214	405	3178	java/lang/Exception
      //   405	422	3178	java/lang/Exception
      //   425	514	3178	java/lang/Exception
      //   525	530	3132	java/lang/Exception
      //   546	551	629	java/lang/Exception
      //   562	567	629	java/lang/Exception
      //   578	586	629	java/lang/Exception
      //   597	605	629	java/lang/Exception
      //   616	626	629	java/lang/Exception
      //   661	671	3132	java/lang/Exception
      //   682	687	3132	java/lang/Exception
      //   698	705	3132	java/lang/Exception
      //   716	727	3132	java/lang/Exception
      //   738	747	3132	java/lang/Exception
      //   758	763	3132	java/lang/Exception
      //   774	781	3132	java/lang/Exception
      //   795	805	3132	java/lang/Exception
      //   816	825	3132	java/lang/Exception
      //   836	841	3132	java/lang/Exception
      //   852	857	3132	java/lang/Exception
      //   868	876	3132	java/lang/Exception
      //   893	899	629	java/lang/Exception
      //   913	921	3132	java/lang/Exception
      //   932	945	3132	java/lang/Exception
      //   956	967	3132	java/lang/Exception
      //   978	990	3132	java/lang/Exception
      //   1001	1013	3132	java/lang/Exception
      //   1013	1049	2451	java/lang/Exception
      //   1053	1065	2446	java/lang/Exception
      //   1065	1089	2441	java/lang/Exception
      //   1093	1258	2441	java/lang/Exception
      //   1264	1316	2441	java/lang/Exception
      //   1316	1321	2441	java/lang/Exception
      //   1326	1389	1752	java/lang/Exception
      //   1394	1573	1752	java/lang/Exception
      //   1581	1749	1752	java/lang/Exception
      //   1754	1759	2441	java/lang/Exception
      //   1759	1772	2409	java/lang/Exception
      //   1775	1782	2404	java/lang/Exception
      //   1787	1794	2404	java/lang/Exception
      //   1801	1808	1855	java/lang/Exception
      //   1808	1826	1850	java/lang/Exception
      //   1826	1843	2383	java/lang/Exception
      //   1860	1867	2383	java/lang/Exception
      //   1872	1904	2383	java/lang/Exception
      //   1904	1921	2378	java/lang/Exception
      //   1924	1931	2378	java/lang/Exception
      //   1936	1968	2378	java/lang/Exception
      //   1968	1984	2378	java/lang/Exception
      //   1991	1998	2378	java/lang/Exception
      //   2003	2043	2378	java/lang/Exception
      //   2043	2206	2378	java/lang/Exception
      //   2206	2267	2373	java/lang/Exception
      //   2267	2370	2399	java/lang/Exception
      //   2388	2396	2399	java/lang/Exception
      //   2422	2427	3109	java/lang/Exception
      //   2477	2485	3025	java/lang/Exception
      //   2496	2509	3025	java/lang/Exception
      //   2523	2573	3025	java/lang/Exception
      //   2577	2602	3025	java/lang/Exception
      //   2605	2713	3025	java/lang/Exception
      //   2713	2730	3025	java/lang/Exception
      //   2730	3016	3025	java/lang/Exception
      //   3038	3042	3109	java/lang/Exception
      //   3080	3087	3109	java/lang/Exception
      //   3098	3103	3109	java/lang/Exception
    }
    
    protected void onPostExecute(Object param1Object) {
      super.onPostExecute(param1Object);
      try {
        param1Object = this.a.get();
        if (param1Object != null) {
          List list = e.M2((e)param1Object);
          if (list != null && e.M2((e)param1Object).size() != 0) {
            if (e.O2((e)param1Object) != null)
              e.O2((e)param1Object).i(); 
            if (this.e)
              e.K2((e)param1Object); 
            if (e.U1((e)param1Object) != null) {
              Intent intent = new Intent();
              this("com.allinone.callerid.IDENTIFY_NUMBER");
              b.p.a.a.b((Context)e.U1((e)param1Object)).d(intent);
            } 
          } 
          e.h2((e)param1Object);
          if (e.U1((e)param1Object) != null) {
            Intent intent = new Intent();
            this("com.allinone.callerid.IDENTIFY_NUMBER");
            b.p.a.a.b((Context)e.U1((e)param1Object)).d(intent);
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */