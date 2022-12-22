package com.allinone.callerid.i.a.r;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.allinone.callerid.f.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.t9.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class a {
  public static void a(List<CallLogBean> paramList1, List<CallLogBean> paramList2, c paramc) {
    try {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("loadData_start:");
        stringBuilder.append(i.d(System.currentTimeMillis()));
        d0.a("tony", stringBuilder.toString());
      } 
      paramList2.clear();
      for (byte b = 0; b < paramList1.size(); b++) {
        CallLogBean callLogBean = paramList1.get(b);
        if (!callLogBean.T())
          paramList2.add(callLogBean); 
        EZSearchContacts eZSearchContacts = f.b().d(callLogBean.p());
        if (eZSearchContacts != null) {
          if (!callLogBean.T()) {
            callLogBean.d1(i1.D((Context)EZCallApplication.c(), eZSearchContacts.getType_label()));
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
          callLogBean.u0(eZSearchContacts.getFaild_error_log());
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("loadData_end:");
      stringBuilder.append(i.d(System.currentTimeMillis()));
      d0.a("tony", stringBuilder.toString());
    } 
    paramc.a(paramList1, paramList2);
  }
  
  public static void b(d paramd) {
    try {
      b b = new b();
      this(paramd);
      b.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(List<CallLogBean> paramList, List<String> paramList1, HashMap<String, Integer> paramHashMap, b paramb) {
    try {
      a a1 = new a();
      this(paramList, paramList1, paramHashMap, paramb);
      a1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static List<CallLogBean> d(List<CallLogBean> paramList) {
    try {
      if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CONTACTS") == 0) {
        boolean bool = c1.h((Context)EZCallApplication.c());
        if (paramList != null && paramList.size() > 0) {
          ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
          for (byte b = 0; b < paramList.size(); b++) {
            CallLogBean callLogBean = paramList.get(b);
            if (callLogBean.T())
              callLogBean.I0(i1.Z((Context)EZCallApplication.c(), callLogBean.p())); 
            if (c1.l() && bool && bool && callLogBean.L() != null && !callLogBean.L().equals("")) {
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
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return paramList;
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private List<CallLogBean> a;
    
    private List<String> b;
    
    private HashMap<String, Integer> c;
    
    b d;
    
    a(List<CallLogBean> param1List, List<String> param1List1, HashMap<String, Integer> param1HashMap, b param1b) {
      this.a = param1List;
      this.b = param1List1;
      this.c = param1HashMap;
      this.d = param1b;
    }
    
    protected String a(String... param1VarArgs) {
      // Byte code:
      //   0: getstatic com/allinone/callerid/util/d0.a : Z
      //   3: istore_2
      //   4: ldc 'tony'
      //   6: astore_3
      //   7: iload_2
      //   8: ifeq -> 46
      //   11: new java/lang/StringBuilder
      //   14: astore_1
      //   15: aload_1
      //   16: invokespecial <init> : ()V
      //   19: aload_1
      //   20: ldc 'load_1:'
      //   22: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   25: pop
      //   26: aload_1
      //   27: invokestatic currentTimeMillis : ()J
      //   30: invokestatic d : (J)Ljava/lang/String;
      //   33: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   36: pop
      //   37: ldc 'tony'
      //   39: aload_1
      //   40: invokevirtual toString : ()Ljava/lang/String;
      //   43: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   46: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
      //   49: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
      //   52: invokestatic g : ()Landroid/net/Uri;
      //   55: aconst_null
      //   56: aconst_null
      //   57: aconst_null
      //   58: ldc 'date DESC'
      //   60: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   63: astore #4
      //   65: aload #4
      //   67: ifnull -> 779
      //   70: aload #4
      //   72: invokeinterface getCount : ()I
      //   77: ifle -> 779
      //   80: new java/text/SimpleDateFormat
      //   83: astore_1
      //   84: aload_1
      //   85: ldc 'yyyyMMdd'
      //   87: invokestatic getDefault : ()Ljava/util/Locale;
      //   90: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
      //   93: aload #4
      //   95: invokeinterface moveToNext : ()Z
      //   100: ifeq -> 738
      //   103: new java/util/Date
      //   106: astore #5
      //   108: aload #5
      //   110: aload #4
      //   112: aload #4
      //   114: ldc 'date'
      //   116: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   121: invokeinterface getLong : (I)J
      //   126: invokespecial <init> : (J)V
      //   129: aload #4
      //   131: aload #4
      //   133: ldc 'number'
      //   135: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   140: invokeinterface getString : (I)Ljava/lang/String;
      //   145: astore #6
      //   147: aload #4
      //   149: aload #4
      //   151: ldc 'name'
      //   153: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   158: invokeinterface getString : (I)Ljava/lang/String;
      //   163: astore #7
      //   165: aload #4
      //   167: aload #4
      //   169: ldc 'type'
      //   171: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   176: invokeinterface getInt : (I)I
      //   181: istore #8
      //   183: aload #4
      //   185: aload #4
      //   187: ldc '_id'
      //   189: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   194: invokeinterface getInt : (I)I
      //   199: istore #9
      //   201: getstatic android/os/Build$VERSION.SDK_INT : I
      //   204: istore #10
      //   206: iload #10
      //   208: bipush #21
      //   210: if_icmplt -> 252
      //   213: aload #4
      //   215: aload #4
      //   217: ldc 'photo_id'
      //   219: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   224: invokeinterface getString : (I)Ljava/lang/String;
      //   229: astore #11
      //   231: aload #4
      //   233: aload #4
      //   235: ldc 'formatted_number'
      //   237: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   242: invokeinterface getString : (I)Ljava/lang/String;
      //   247: astore #12
      //   249: goto -> 260
      //   252: ldc ''
      //   254: astore #11
      //   256: aload #11
      //   258: astore #12
      //   260: aload #4
      //   262: aload #4
      //   264: ldc 'numbertype'
      //   266: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   271: invokeinterface getInt : (I)I
      //   276: istore #13
      //   278: aload_1
      //   279: aload #5
      //   281: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
      //   284: astore #14
      //   286: new java/lang/StringBuilder
      //   289: astore #15
      //   291: aload #15
      //   293: invokespecial <init> : ()V
      //   296: aload #15
      //   298: aload #6
      //   300: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   303: pop
      //   304: aload #15
      //   306: iload #8
      //   308: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   311: pop
      //   312: aload #15
      //   314: aload #14
      //   316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   319: pop
      //   320: aload #15
      //   322: ldc ''
      //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   327: pop
      //   328: aload #15
      //   330: invokevirtual toString : ()Ljava/lang/String;
      //   333: astore #16
      //   335: aload_0
      //   336: getfield b : Ljava/util/List;
      //   339: aload #16
      //   341: invokeinterface contains : (Ljava/lang/Object;)Z
      //   346: ifeq -> 386
      //   349: aload_0
      //   350: getfield c : Ljava/util/HashMap;
      //   353: aload #16
      //   355: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   358: checkcast java/lang/Integer
      //   361: invokevirtual intValue : ()I
      //   364: istore #9
      //   366: aload_0
      //   367: getfield c : Ljava/util/HashMap;
      //   370: aload #16
      //   372: iload #9
      //   374: iconst_1
      //   375: iadd
      //   376: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   379: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   382: pop
      //   383: goto -> 93
      //   386: aload_0
      //   387: getfield b : Ljava/util/List;
      //   390: aload #16
      //   392: invokeinterface add : (Ljava/lang/Object;)Z
      //   397: pop
      //   398: aload_0
      //   399: getfield c : Ljava/util/HashMap;
      //   402: aload #16
      //   404: iconst_1
      //   405: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   408: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   411: pop
      //   412: aload #4
      //   414: aload #4
      //   416: ldc 'numberlabel'
      //   418: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   423: invokeinterface getString : (I)Ljava/lang/String;
      //   428: astore #15
      //   430: iload #13
      //   432: ifne -> 447
      //   435: aload #15
      //   437: ifnonnull -> 447
      //   440: ldc ''
      //   442: astore #15
      //   444: goto -> 465
      //   447: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
      //   450: invokevirtual getResources : ()Landroid/content/res/Resources;
      //   453: iload #13
      //   455: aload #15
      //   457: invokestatic getTypeLabel : (Landroid/content/res/Resources;ILjava/lang/CharSequence;)Ljava/lang/CharSequence;
      //   460: checkcast java/lang/String
      //   463: astore #15
      //   465: iload #10
      //   467: bipush #21
      //   469: if_icmplt -> 505
      //   472: aload #4
      //   474: aload #4
      //   476: ldc 'lookup_uri'
      //   478: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   483: invokeinterface getString : (I)Ljava/lang/String;
      //   488: astore #14
      //   490: aload #14
      //   492: ifnull -> 505
      //   495: aload #14
      //   497: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
      //   500: astore #14
      //   502: goto -> 508
      //   505: aconst_null
      //   506: astore #14
      //   508: invokestatic l : ()Z
      //   511: ifeq -> 545
      //   514: aload #4
      //   516: ldc 'simid'
      //   518: invokeinterface getColumnIndex : (Ljava/lang/String;)I
      //   523: istore #10
      //   525: iload #10
      //   527: iconst_m1
      //   528: if_icmpeq -> 545
      //   531: aload #4
      //   533: iload #10
      //   535: invokeinterface getString : (I)Ljava/lang/String;
      //   540: astore #17
      //   542: goto -> 549
      //   545: ldc ''
      //   547: astore #17
      //   549: aload #4
      //   551: invokestatic f : (Landroid/database/Cursor;)Ljava/lang/String;
      //   554: astore #18
      //   556: new com/allinone/callerid/search/CallLogBean
      //   559: astore #19
      //   561: aload #19
      //   563: invokespecial <init> : ()V
      //   566: aload #19
      //   568: iload #9
      //   570: invokevirtual x0 : (I)V
      //   573: aload #19
      //   575: aload #16
      //   577: invokevirtual a1 : (Ljava/lang/String;)V
      //   580: aload #19
      //   582: aload #11
      //   584: invokevirtual H0 : (Ljava/lang/String;)V
      //   587: aload #19
      //   589: aload #6
      //   591: invokevirtual D0 : (Ljava/lang/String;)V
      //   594: aload #19
      //   596: aload #12
      //   598: invokevirtual g0 : (Ljava/lang/String;)V
      //   601: aload #19
      //   603: aload #7
      //   605: invokevirtual B0 : (Ljava/lang/String;)V
      //   608: aload #7
      //   610: ifnull -> 651
      //   613: ldc ''
      //   615: aload #7
      //   617: invokevirtual equals : (Ljava/lang/Object;)Z
      //   620: ifne -> 651
      //   623: aload #19
      //   625: iconst_1
      //   626: invokevirtual o0 : (Z)V
      //   629: aload #11
      //   631: ifnull -> 651
      //   634: ldc_w '0'
      //   637: aload #11
      //   639: invokevirtual equals : (Ljava/lang/Object;)Z
      //   642: ifne -> 651
      //   645: aload #19
      //   647: iconst_1
      //   648: invokevirtual t0 : (Z)V
      //   651: aload #19
      //   653: aload #14
      //   655: invokevirtual z0 : (Landroid/net/Uri;)V
      //   658: aload #19
      //   660: aload #15
      //   662: invokevirtual E0 : (Ljava/lang/String;)V
      //   665: aload #19
      //   667: iload #8
      //   669: invokevirtual c1 : (I)V
      //   672: aload #19
      //   674: aload #5
      //   676: invokestatic h : (Ljava/util/Date;)Ljava/lang/String;
      //   679: invokevirtual h1 : (Ljava/lang/String;)V
      //   682: aload #19
      //   684: aload #5
      //   686: invokestatic n : (Ljava/util/Date;)Ljava/lang/String;
      //   689: invokevirtual T0 : (Ljava/lang/String;)V
      //   692: aload #19
      //   694: aload #5
      //   696: invokestatic c : (Ljava/util/Date;)Ljava/lang/String;
      //   699: invokevirtual r0 : (Ljava/lang/String;)V
      //   702: aload #19
      //   704: aload #5
      //   706: invokevirtual d0 : (Ljava/util/Date;)V
      //   709: aload #19
      //   711: aload #18
      //   713: invokevirtual R0 : (Ljava/lang/String;)V
      //   716: aload #19
      //   718: aload #17
      //   720: invokevirtual b1 : (Ljava/lang/String;)V
      //   723: aload_0
      //   724: getfield a : Ljava/util/List;
      //   727: aload #19
      //   729: invokeinterface add : (Ljava/lang/Object;)Z
      //   734: pop
      //   735: goto -> 93
      //   738: getstatic com/allinone/callerid/util/d0.a : Z
      //   741: ifeq -> 779
      //   744: new java/lang/StringBuilder
      //   747: astore_1
      //   748: aload_1
      //   749: invokespecial <init> : ()V
      //   752: aload_1
      //   753: ldc_w 'load_2:'
      //   756: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   759: pop
      //   760: aload_1
      //   761: invokestatic currentTimeMillis : ()J
      //   764: invokestatic d : (J)Ljava/lang/String;
      //   767: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   770: pop
      //   771: aload_3
      //   772: aload_1
      //   773: invokevirtual toString : ()Ljava/lang/String;
      //   776: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   779: aload #4
      //   781: ifnull -> 799
      //   784: aload #4
      //   786: invokeinterface close : ()V
      //   791: goto -> 799
      //   794: astore_1
      //   795: aload_1
      //   796: invokevirtual printStackTrace : ()V
      //   799: aconst_null
      //   800: areturn
      // Exception table:
      //   from	to	target	type
      //   0	4	794	java/lang/Exception
      //   11	46	794	java/lang/Exception
      //   46	65	794	java/lang/Exception
      //   70	93	794	java/lang/Exception
      //   93	206	794	java/lang/Exception
      //   213	249	794	java/lang/Exception
      //   260	383	794	java/lang/Exception
      //   386	430	794	java/lang/Exception
      //   447	465	794	java/lang/Exception
      //   472	490	794	java/lang/Exception
      //   495	502	794	java/lang/Exception
      //   508	525	794	java/lang/Exception
      //   531	542	794	java/lang/Exception
      //   549	608	794	java/lang/Exception
      //   613	629	794	java/lang/Exception
      //   634	651	794	java/lang/Exception
      //   651	735	794	java/lang/Exception
      //   738	779	794	java/lang/Exception
      //   784	791	794	java/lang/Exception
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.d.a(this.a, this.b, this.c);
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private d a;
    
    private ArrayList<CallLogBean> b;
    
    b(d param1d) {
      this.a = param1d;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
          ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
          Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
          byte b1 = 0;
          Cursor cursor = contentResolver.query(uri, new String[] { "display_name", "data1", "sort_key", "contact_id" }, null, null, "sort_key COLLATE LOCALIZED ASC");
          if (cursor != null && cursor.getCount() != 0) {
            int i = cursor.getColumnIndex("data1");
            int j = cursor.getColumnIndex("display_name");
            cursor.getColumnIndex("sort_key");
            if (cursor.getCount() > 0) {
              ArrayList<CallLogBean> arrayList1 = new ArrayList();
              this();
              this.b = arrayList1;
              while (cursor.moveToNext()) {
                String str1 = cursor.getString(i);
                if (TextUtils.isEmpty(str1))
                  continue; 
                String str2 = cursor.getString(j);
                int k = cursor.getInt(cursor.getColumnIndex("contact_id"));
                CallLogBean callLogBean = new CallLogBean();
                this();
                callLogBean.I0(k);
                callLogBean.D0(str1.replaceAll(" ", ""));
                if (str2 != null) {
                  callLogBean.B0(str2);
                  callLogBean.o0(true);
                  callLogBean.g0 = d.c(str2);
                  this.b.add(callLogBean);
                } 
              } 
            } 
            cursor.close();
            ArrayList<CallLogBean> arrayList = this.b;
            if (arrayList != null && arrayList.size() != 0)
              while (b1 < this.b.size()) {
                for (i = this.b.size() - 1; i > b1; i--) {
                  if (((CallLogBean)this.b.get(b1)).v() == ((CallLogBean)this.b.get(i)).v())
                    this.b.remove(i); 
                } 
                b1++;
              }  
          } 
        } 
      } catch (Exception exception) {}
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/r/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */