package com.allinone.callerid.i.a.w;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.allinone.callerid.bean.SearchHis;
import com.allinone.callerid.f.h;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.search.EZSearchResult;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.y0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class a {
  public static void a(b paramb) {
    try {
      c c = new c();
      this(paramb);
      if (c.getStatus() != AsyncTask.Status.RUNNING) {
        c.cancel(true);
        c = new c();
        this(paramb);
        c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(List<CallLogBean> paramList1, List<String> paramList, HashMap<String, Integer> paramHashMap, List<CallLogBean> paramList2, c paramc) {
    try {
      b b = new b();
      this(paramList1, paramList, paramHashMap, paramList2, paramc);
      b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(List<CallLogBean> paramList, d paramd) {
    try {
      d d1 = new d();
      this(paramList, paramd);
      d1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void d(d paramd) {
    try {
      e e = new e();
      this(paramd);
      e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static List<CallLogBean> e(List<CallLogBean> paramList, String paramString) {
    ArrayList<CallLogBean> arrayList = new ArrayList();
    try {
      CopyOnWriteArrayList<CallLogBean> copyOnWriteArrayList = new CopyOnWriteArrayList();
      this();
      if (paramString.matches("^([0-9]|[/+]).*")) {
        paramString = paramString.replaceAll("\\-|\\s", "");
        if (paramList != null && paramList.size() > 0)
          copyOnWriteArrayList.addAll(paramList); 
        if (copyOnWriteArrayList.size() > 0)
          for (int i = copyOnWriteArrayList.size() - 1; i >= 0; i--) {
            CallLogBean callLogBean = copyOnWriteArrayList.get(i);
            if (callLogBean.p() != null && callLogBean.p().replaceAll("\\-|\\s", "").contains(paramString) && !arrayList.contains(callLogBean))
              if (callLogBean.p().startsWith(paramString)) {
                arrayList.add(0, callLogBean);
              } else {
                arrayList.add(callLogBean);
              }  
          }  
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return arrayList;
  }
  
  public static List<CallLogBean> f(ArrayList<CallLogBean> paramArrayList, String paramString) {
    ArrayList<CallLogBean> arrayList = new ArrayList();
    try {
      CopyOnWriteArrayList<CallLogBean> copyOnWriteArrayList = new CopyOnWriteArrayList();
      this();
      if (paramString.matches("^([0-9]|[/+]).*")) {
        paramString = paramString.replaceAll("\\-|\\s", "");
        if (paramArrayList != null && paramArrayList.size() > 0)
          copyOnWriteArrayList.addAll(paramArrayList); 
        if (copyOnWriteArrayList.size() > 0)
          for (int i = copyOnWriteArrayList.size() - 1; i >= 0; i--) {
            CallLogBean callLogBean = copyOnWriteArrayList.get(i);
            if (callLogBean.p() != null && callLogBean.p().replaceAll("\\-|\\s", "").contains(paramString) && !arrayList.contains(callLogBean))
              if (callLogBean.p().startsWith(paramString)) {
                arrayList.add(0, callLogBean);
              } else {
                arrayList.add(callLogBean);
              }  
          }  
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return arrayList;
  }
  
  public static void g(Context paramContext, String paramString1, String paramString2, String paramString3, e parame) {
    try {
      a a1 = new a();
      this(paramContext, paramString1, paramString2, paramString3, parame);
      if (a1.getStatus() != AsyncTask.Status.RUNNING) {
        a1.cancel(true);
        a1 = new a();
        this(paramContext, paramString1, paramString2, paramString3, parame);
        a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void h(String paramString) {
    try {
      f f = new f();
      this(paramString);
      f.executeOnExecutor(f1.a(), (Object[])new Void[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, EZSearchResult> {
    private e a;
    
    private String b;
    
    private EZSearchResult c;
    
    private boolean d;
    
    private String e;
    
    private String f;
    
    private Context g;
    
    private JSONObject h;
    
    private JSONObject i;
    
    a(Context param1Context, String param1String1, String param1String2, String param1String3, e param1e) {
      this.a = param1e;
      this.b = param1String3;
      this.e = param1String1;
      this.f = param1String2;
      this.g = param1Context;
    }
    
    protected EZSearchResult a(String... param1VarArgs) {
      // Byte code:
      //   0: new java/util/HashMap
      //   3: astore_1
      //   4: aload_1
      //   5: invokespecial <init> : ()V
      //   8: aload_1
      //   9: ldc 'tel_number'
      //   11: aload_0
      //   12: getfield b : Ljava/lang/String;
      //   15: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   18: pop
      //   19: aload_1
      //   20: ldc 'device'
      //   22: ldc 'android'
      //   24: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   27: pop
      //   28: aload_1
      //   29: ldc 'uid'
      //   31: aload_0
      //   32: getfield g : Landroid/content/Context;
      //   35: invokestatic T : (Landroid/content/Context;)Ljava/lang/String;
      //   38: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   41: pop
      //   42: aload_1
      //   43: ldc 'version'
      //   45: aload_0
      //   46: getfield g : Landroid/content/Context;
      //   49: invokestatic W : (Landroid/content/Context;)Ljava/lang/String;
      //   52: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   55: pop
      //   56: aload_1
      //   57: ldc 'default_cc'
      //   59: aload_0
      //   60: getfield e : Ljava/lang/String;
      //   63: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   66: pop
      //   67: aload_1
      //   68: ldc 'cc'
      //   70: aload_0
      //   71: getfield f : Ljava/lang/String;
      //   74: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   77: pop
      //   78: aload_1
      //   79: ldc 'stamp'
      //   81: aload_0
      //   82: getfield g : Landroid/content/Context;
      //   85: aload_0
      //   86: getfield b : Ljava/lang/String;
      //   89: invokestatic Q : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   92: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   95: pop
      //   96: aload_1
      //   97: ldc 'cid'
      //   99: ldc ''
      //   101: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   104: pop
      //   105: aload_1
      //   106: ldc 'is_contacts'
      //   108: ldc ''
      //   110: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   113: pop
      //   114: getstatic com/allinone/callerid/util/d0.a : Z
      //   117: ifeq -> 153
      //   120: new java/lang/StringBuilder
      //   123: astore_2
      //   124: aload_2
      //   125: invokespecial <init> : ()V
      //   128: aload_2
      //   129: ldc 'params:'
      //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   134: pop
      //   135: aload_2
      //   136: aload_1
      //   137: invokevirtual toString : ()Ljava/lang/String;
      //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   143: pop
      //   144: ldc 'searchNumber'
      //   146: aload_2
      //   147: invokevirtual toString : ()Ljava/lang/String;
      //   150: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   153: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   156: ldc 'search_number'
      //   158: invokevirtual c : (Ljava/lang/String;)V
      //   161: invokestatic C : ()J
      //   164: lconst_0
      //   165: lcmp
      //   166: ifeq -> 210
      //   169: new java/util/Date
      //   172: astore_2
      //   173: aload_2
      //   174: invokestatic currentTimeMillis : ()J
      //   177: invokespecial <init> : (J)V
      //   180: new java/util/Date
      //   183: astore_3
      //   184: aload_3
      //   185: invokestatic C : ()J
      //   188: invokespecial <init> : (J)V
      //   191: aload_2
      //   192: aload_3
      //   193: invokestatic r : (Ljava/util/Date;Ljava/util/Date;)Z
      //   196: ifeq -> 210
      //   199: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   202: ldc 'search_number_install_day'
      //   204: invokevirtual c : (Ljava/lang/String;)V
      //   207: goto -> 210
      //   210: ldc 'https://app.show-caller.com/api/v1/sea.php'
      //   212: aload_1
      //   213: invokestatic b : (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
      //   216: astore_1
      //   217: aload_1
      //   218: ifnull -> 1763
      //   221: ldc ''
      //   223: aload_1
      //   224: invokevirtual equals : (Ljava/lang/Object;)Z
      //   227: ifne -> 1763
      //   230: getstatic com/allinone/callerid/util/d0.a : Z
      //   233: istore #4
      //   235: iload #4
      //   237: ifeq -> 270
      //   240: new java/lang/StringBuilder
      //   243: astore_2
      //   244: aload_2
      //   245: invokespecial <init> : ()V
      //   248: aload_2
      //   249: ldc 'response:'
      //   251: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   254: pop
      //   255: aload_2
      //   256: aload_1
      //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   260: pop
      //   261: ldc 'searchNumber'
      //   263: aload_2
      //   264: invokevirtual toString : ()Ljava/lang/String;
      //   267: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   270: new com/allinone/callerid/search/EZSearchResult
      //   273: astore_2
      //   274: aload_2
      //   275: invokespecial <init> : ()V
      //   278: aload_0
      //   279: aload_2
      //   280: putfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   283: aload_2
      //   284: aload_0
      //   285: getfield b : Ljava/lang/String;
      //   288: invokevirtual setNumber : (Ljava/lang/String;)V
      //   291: new org/json/JSONObject
      //   294: astore_2
      //   295: aload_2
      //   296: aload_1
      //   297: invokespecial <init> : (Ljava/lang/String;)V
      //   300: aload_0
      //   301: aload_2
      //   302: putfield h : Lorg/json/JSONObject;
      //   305: aload_2
      //   306: ldc 'status'
      //   308: invokevirtual getInt : (Ljava/lang/String;)I
      //   311: istore #5
      //   313: aload_0
      //   314: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   317: iload #5
      //   319: invokevirtual setStatus : (I)V
      //   322: iload #5
      //   324: iconst_1
      //   325: if_icmpne -> 1666
      //   328: aload_0
      //   329: getfield h : Lorg/json/JSONObject;
      //   332: ldc 'type_label'
      //   334: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   337: astore_1
      //   338: aload_0
      //   339: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   342: aload_1
      //   343: invokevirtual setType_label_id : (Ljava/lang/String;)V
      //   346: aload_0
      //   347: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   350: aload_0
      //   351: getfield g : Landroid/content/Context;
      //   354: aload_1
      //   355: invokestatic D : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   358: invokevirtual setType_label : (Ljava/lang/String;)V
      //   361: aload_0
      //   362: getfield h : Lorg/json/JSONObject;
      //   365: ldc 'type'
      //   367: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   370: astore_2
      //   371: aload_2
      //   372: ifnull -> 411
      //   375: ldc 'Mobile'
      //   377: aload_2
      //   378: invokevirtual equals : (Ljava/lang/Object;)Z
      //   381: ifne -> 393
      //   384: ldc 'Fixed line'
      //   386: aload_2
      //   387: invokevirtual equals : (Ljava/lang/Object;)Z
      //   390: ifeq -> 411
      //   393: aload_0
      //   394: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   397: aload_0
      //   398: getfield g : Landroid/content/Context;
      //   401: aload_2
      //   402: invokestatic J : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   405: invokevirtual setType : (Ljava/lang/String;)V
      //   408: goto -> 411
      //   411: aload_0
      //   412: getfield h : Lorg/json/JSONObject;
      //   415: ldc 'faild_error_log'
      //   417: invokevirtual getInt : (Ljava/lang/String;)I
      //   420: istore #5
      //   422: iload #5
      //   424: ifne -> 430
      //   427: goto -> 444
      //   430: iload #5
      //   432: iconst_1
      //   433: if_icmpne -> 444
      //   436: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   439: ldc 'new_search_success_zhudong'
      //   441: invokevirtual c : (Ljava/lang/String;)V
      //   444: aload_0
      //   445: getfield h : Lorg/json/JSONObject;
      //   448: ldc 'name'
      //   450: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   453: astore_2
      //   454: aload_2
      //   455: ifnull -> 486
      //   458: ldc ''
      //   460: aload_2
      //   461: invokevirtual equals : (Ljava/lang/Object;)Z
      //   464: ifne -> 486
      //   467: aload_0
      //   468: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   471: aload_2
      //   472: invokevirtual setName : (Ljava/lang/String;)V
      //   475: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   478: ldc 'new_search_name_success_zhudong'
      //   480: invokevirtual c : (Ljava/lang/String;)V
      //   483: goto -> 495
      //   486: aload_0
      //   487: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   490: ldc ''
      //   492: invokevirtual setName : (Ljava/lang/String;)V
      //   495: aload_0
      //   496: getfield h : Lorg/json/JSONObject;
      //   499: ldc 'old_tel_number'
      //   501: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   504: astore_2
      //   505: aload_2
      //   506: ifnull -> 526
      //   509: ldc ''
      //   511: aload_2
      //   512: invokevirtual equals : (Ljava/lang/Object;)Z
      //   515: ifne -> 526
      //   518: aload_0
      //   519: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   522: aload_2
      //   523: invokevirtual setOld_tel_number : (Ljava/lang/String;)V
      //   526: aload_0
      //   527: getfield h : Lorg/json/JSONObject;
      //   530: ldc 'operator'
      //   532: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   535: astore_2
      //   536: aload_2
      //   537: ifnull -> 560
      //   540: ldc ''
      //   542: aload_2
      //   543: invokevirtual equals : (Ljava/lang/Object;)Z
      //   546: ifne -> 560
      //   549: aload_0
      //   550: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   553: aload_2
      //   554: invokevirtual setOperator : (Ljava/lang/String;)V
      //   557: goto -> 560
      //   560: aload_0
      //   561: getfield h : Lorg/json/JSONObject;
      //   564: ldc 'format_tel_number'
      //   566: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   569: astore_2
      //   570: aload_2
      //   571: ifnull -> 591
      //   574: ldc ''
      //   576: aload_2
      //   577: invokevirtual equals : (Ljava/lang/Object;)Z
      //   580: ifne -> 591
      //   583: aload_0
      //   584: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   587: aload_2
      //   588: invokevirtual setFormat_tel_number : (Ljava/lang/String;)V
      //   591: aload_0
      //   592: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   595: aload_0
      //   596: getfield h : Lorg/json/JSONObject;
      //   599: ldc 'tel_number'
      //   601: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   604: invokevirtual setTel_number : (Ljava/lang/String;)V
      //   607: aload_0
      //   608: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   611: aload_0
      //   612: getfield h : Lorg/json/JSONObject;
      //   615: ldc 't_p'
      //   617: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   620: invokevirtual setT_p : (Ljava/lang/String;)V
      //   623: aload_0
      //   624: getfield h : Lorg/json/JSONObject;
      //   627: ldc 'avatar'
      //   629: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   632: astore_2
      //   633: aload_2
      //   634: ifnull -> 654
      //   637: ldc ''
      //   639: aload_2
      //   640: invokevirtual equals : (Ljava/lang/Object;)Z
      //   643: ifne -> 654
      //   646: aload_0
      //   647: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   650: aload_2
      //   651: invokevirtual setIcon : (Ljava/lang/String;)V
      //   654: aload_1
      //   655: ifnull -> 686
      //   658: ldc ''
      //   660: aload_1
      //   661: invokevirtual equals : (Ljava/lang/Object;)Z
      //   664: ifne -> 686
      //   667: aload_0
      //   668: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   671: iconst_1
      //   672: invokevirtual setIsSpam : (Z)V
      //   675: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   678: ldc 'search_number_spam'
      //   680: invokevirtual c : (Ljava/lang/String;)V
      //   683: goto -> 694
      //   686: aload_0
      //   687: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   690: iconst_0
      //   691: invokevirtual setIsSpam : (Z)V
      //   694: aload_0
      //   695: getfield h : Lorg/json/JSONObject;
      //   698: ldc 'belong_area'
      //   700: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   703: astore_2
      //   704: aload_2
      //   705: ifnull -> 765
      //   708: ldc ''
      //   710: aload_2
      //   711: invokevirtual equals : (Ljava/lang/Object;)Z
      //   714: ifne -> 765
      //   717: aload_0
      //   718: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   721: aload_2
      //   722: invokevirtual setLocation : (Ljava/lang/String;)V
      //   725: getstatic com/allinone/callerid/util/d0.a : Z
      //   728: ifeq -> 774
      //   731: new java/lang/StringBuilder
      //   734: astore_1
      //   735: aload_1
      //   736: invokespecial <init> : ()V
      //   739: aload_1
      //   740: ldc_w '位置：'
      //   743: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   746: pop
      //   747: aload_1
      //   748: aload_2
      //   749: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   752: pop
      //   753: ldc 'searchNumber'
      //   755: aload_1
      //   756: invokevirtual toString : ()Ljava/lang/String;
      //   759: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   762: goto -> 774
      //   765: aload_0
      //   766: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   769: ldc ''
      //   771: invokevirtual setLocation : (Ljava/lang/String;)V
      //   774: aload_0
      //   775: getfield h : Lorg/json/JSONObject;
      //   778: ldc_w 'soft_comments_tags'
      //   781: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   784: astore_1
      //   785: aload_1
      //   786: ifnull -> 806
      //   789: ldc ''
      //   791: aload_1
      //   792: invokevirtual equals : (Ljava/lang/Object;)Z
      //   795: ifne -> 806
      //   798: aload_0
      //   799: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   802: aload_1
      //   803: invokevirtual setComment_tags : (Ljava/lang/String;)V
      //   806: aload_0
      //   807: getfield h : Lorg/json/JSONObject;
      //   810: ldc_w 'country'
      //   813: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   816: astore_1
      //   817: aload_1
      //   818: ifnull -> 838
      //   821: ldc ''
      //   823: aload_1
      //   824: invokevirtual equals : (Ljava/lang/Object;)Z
      //   827: ifne -> 838
      //   830: aload_0
      //   831: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   834: aload_1
      //   835: invokevirtual setCountry : (Ljava/lang/String;)V
      //   838: aload_0
      //   839: getfield h : Lorg/json/JSONObject;
      //   842: ldc_w 'address'
      //   845: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   848: astore_1
      //   849: aload_1
      //   850: ifnull -> 870
      //   853: ldc ''
      //   855: aload_1
      //   856: invokevirtual equals : (Ljava/lang/Object;)Z
      //   859: ifne -> 870
      //   862: aload_0
      //   863: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   866: aload_1
      //   867: invokevirtual setLocation : (Ljava/lang/String;)V
      //   870: aload_0
      //   871: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   874: aload_0
      //   875: getfield h : Lorg/json/JSONObject;
      //   878: ldc_w 'report_count'
      //   881: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   884: invokevirtual setComplaint_times : (Ljava/lang/String;)V
      //   887: aload_0
      //   888: getfield g : Landroid/content/Context;
      //   891: aload_0
      //   892: getfield b : Ljava/lang/String;
      //   895: invokestatic w : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   898: astore_1
      //   899: aload_1
      //   900: ifnull -> 946
      //   903: ldc ''
      //   905: aload_1
      //   906: invokevirtual equals : (Ljava/lang/Object;)Z
      //   909: ifne -> 946
      //   912: aload_0
      //   913: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   916: iconst_1
      //   917: invokevirtual setContact : (Z)V
      //   920: aload_0
      //   921: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   924: aload_1
      //   925: invokevirtual setName : (Ljava/lang/String;)V
      //   928: aload_0
      //   929: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   932: aload_0
      //   933: getfield g : Landroid/content/Context;
      //   936: aload_0
      //   937: getfield b : Ljava/lang/String;
      //   940: invokestatic Z : (Landroid/content/Context;Ljava/lang/String;)I
      //   943: invokevirtual setRaw_contact_id : (I)V
      //   946: aload_0
      //   947: getfield h : Lorg/json/JSONObject;
      //   950: ldc_w 'e164_tel_number'
      //   953: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   956: astore_2
      //   957: aload_0
      //   958: getfield h : Lorg/json/JSONObject;
      //   961: ldc 'cc'
      //   963: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   966: astore #6
      //   968: invokestatic currentTimeMillis : ()J
      //   971: invokestatic c : ()J
      //   974: lsub
      //   975: lconst_0
      //   976: lcmp
      //   977: ifle -> 1763
      //   980: iload #5
      //   982: ifne -> 1763
      //   985: aload_2
      //   986: ifnull -> 1763
      //   989: ldc ''
      //   991: aload_2
      //   992: invokevirtual equals : (Ljava/lang/Object;)Z
      //   995: ifne -> 1763
      //   998: invokestatic d : ()Z
      //   1001: ifeq -> 1025
      //   1004: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   1007: ldc_w 'search_buyu_token_max_zhudong'
      //   1010: invokevirtual c : (Ljava/lang/String;)V
      //   1013: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   1016: ldc_w 'search_buyu_token_max_zhudong'
      //   1019: invokevirtual d : (Ljava/lang/String;)V
      //   1022: goto -> 1043
      //   1025: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   1028: ldc_w 'search_buyu_count_zhudong'
      //   1031: invokevirtual c : (Ljava/lang/String;)V
      //   1034: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   1037: ldc_w 'search_buyu_count_zhudong'
      //   1040: invokevirtual d : (Ljava/lang/String;)V
      //   1043: invokestatic N : ()Ljava/lang/String;
      //   1046: astore #7
      //   1048: aload_0
      //   1049: getfield g : Landroid/content/Context;
      //   1052: invokestatic T : (Landroid/content/Context;)Ljava/lang/String;
      //   1055: astore #8
      //   1057: aload_0
      //   1058: getfield g : Landroid/content/Context;
      //   1061: invokestatic W : (Landroid/content/Context;)Ljava/lang/String;
      //   1064: astore #9
      //   1066: aload_0
      //   1067: getfield g : Landroid/content/Context;
      //   1070: invokestatic d : (Landroid/content/Context;)Lcom/allinone/callerid/model/EZCountryCode;
      //   1073: invokevirtual getCountry_code : ()Ljava/lang/String;
      //   1076: astore #10
      //   1078: aload_0
      //   1079: getfield g : Landroid/content/Context;
      //   1082: aload_2
      //   1083: invokestatic Q : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   1086: astore_3
      //   1087: ldc ''
      //   1089: aload_2
      //   1090: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1093: ifne -> 1763
      //   1096: aload #10
      //   1098: ifnull -> 1763
      //   1101: ldc ''
      //   1103: aload #10
      //   1105: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1108: ifne -> 1763
      //   1111: aload_3
      //   1112: ifnull -> 1763
      //   1115: ldc ''
      //   1117: aload_3
      //   1118: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1121: ifne -> 1763
      //   1124: new java/util/HashMap
      //   1127: astore_1
      //   1128: aload_1
      //   1129: invokespecial <init> : ()V
      //   1132: aload_1
      //   1133: ldc_w 'platform'
      //   1136: ldc 'android'
      //   1138: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   1141: pop
      //   1142: aload_1
      //   1143: ldc 'device'
      //   1145: aload #7
      //   1147: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   1150: pop
      //   1151: aload_1
      //   1152: ldc 'uid'
      //   1154: aload #8
      //   1156: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   1159: pop
      //   1160: aload_1
      //   1161: ldc_w 'app_version'
      //   1164: aload #9
      //   1166: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   1169: pop
      //   1170: aload_1
      //   1171: ldc 'tel_number'
      //   1173: aload_2
      //   1174: invokestatic c : (Ljava/lang/String;)Ljava/lang/String;
      //   1177: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   1180: pop
      //   1181: aload_1
      //   1182: ldc 'default_cc'
      //   1184: aload #10
      //   1186: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   1189: pop
      //   1190: aload_1
      //   1191: ldc 'cc'
      //   1193: aload #6
      //   1195: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   1198: pop
      //   1199: aload_1
      //   1200: ldc 'stamp'
      //   1202: aload_3
      //   1203: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   1206: pop
      //   1207: getstatic com/allinone/callerid/util/d0.a : Z
      //   1210: istore #4
      //   1212: iload #4
      //   1214: ifeq -> 1284
      //   1217: new java/lang/StringBuilder
      //   1220: astore_3
      //   1221: aload_3
      //   1222: invokespecial <init> : ()V
      //   1225: aload_3
      //   1226: ldc_w 'searchNumber：'
      //   1229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1232: pop
      //   1233: aload_3
      //   1234: aload_2
      //   1235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1238: pop
      //   1239: ldc_w 'buyu'
      //   1242: aload_3
      //   1243: invokevirtual toString : ()Ljava/lang/String;
      //   1246: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   1249: new java/lang/StringBuilder
      //   1252: astore_2
      //   1253: aload_2
      //   1254: invokespecial <init> : ()V
      //   1257: aload_2
      //   1258: ldc_w '所有参数：'
      //   1261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1264: pop
      //   1265: aload_2
      //   1266: aload_1
      //   1267: invokevirtual toString : ()Ljava/lang/String;
      //   1270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1273: pop
      //   1274: ldc_w 'buyu'
      //   1277: aload_2
      //   1278: invokevirtual toString : ()Ljava/lang/String;
      //   1281: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   1284: ldc_w 'https://app2.show-caller.com/api/v1/scl.php'
      //   1287: aload_1
      //   1288: invokestatic b : (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
      //   1291: astore_1
      //   1292: getstatic com/allinone/callerid/util/d0.a : Z
      //   1295: ifeq -> 1329
      //   1298: new java/lang/StringBuilder
      //   1301: astore_2
      //   1302: aload_2
      //   1303: invokespecial <init> : ()V
      //   1306: aload_2
      //   1307: ldc 'response:'
      //   1309: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1312: pop
      //   1313: aload_2
      //   1314: aload_1
      //   1315: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1318: pop
      //   1319: ldc_w 'buyu'
      //   1322: aload_2
      //   1323: invokevirtual toString : ()Ljava/lang/String;
      //   1326: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   1329: aload_1
      //   1330: ifnull -> 1763
      //   1333: ldc ''
      //   1335: aload_1
      //   1336: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1339: istore #4
      //   1341: iload #4
      //   1343: ifne -> 1763
      //   1346: new org/json/JSONObject
      //   1349: astore_2
      //   1350: aload_2
      //   1351: aload_1
      //   1352: invokespecial <init> : (Ljava/lang/String;)V
      //   1355: aload_0
      //   1356: aload_2
      //   1357: putfield i : Lorg/json/JSONObject;
      //   1360: aload_2
      //   1361: ldc 'status'
      //   1363: invokevirtual getInt : (Ljava/lang/String;)I
      //   1366: istore #5
      //   1368: iload #5
      //   1370: iconst_1
      //   1371: if_icmpne -> 1568
      //   1374: iconst_0
      //   1375: invokestatic H0 : (Z)V
      //   1378: aload_0
      //   1379: getfield i : Lorg/json/JSONObject;
      //   1382: ldc 'faild_error_log'
      //   1384: invokevirtual getInt : (Ljava/lang/String;)I
      //   1387: iconst_1
      //   1388: if_icmpne -> 1400
      //   1391: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   1394: ldc_w 'search_buyu_count_zhudong_ok'
      //   1397: invokevirtual d : (Ljava/lang/String;)V
      //   1400: lconst_0
      //   1401: invokestatic G0 : (J)V
      //   1404: aload_0
      //   1405: getfield i : Lorg/json/JSONObject;
      //   1408: ldc 'type_label'
      //   1410: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1413: astore_1
      //   1414: aload_0
      //   1415: getfield i : Lorg/json/JSONObject;
      //   1418: ldc 'name'
      //   1420: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1423: astore_2
      //   1424: aload_0
      //   1425: getfield i : Lorg/json/JSONObject;
      //   1428: ldc 'format_tel_number'
      //   1430: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1433: astore_3
      //   1434: aload_0
      //   1435: getfield i : Lorg/json/JSONObject;
      //   1438: ldc 'avatar'
      //   1440: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1443: astore #9
      //   1445: aload_0
      //   1446: getfield i : Lorg/json/JSONObject;
      //   1449: ldc 'operator'
      //   1451: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1454: astore #7
      //   1456: aload_0
      //   1457: getfield i : Lorg/json/JSONObject;
      //   1460: ldc 'type'
      //   1462: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1465: astore #8
      //   1467: aload_0
      //   1468: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   1471: aload_2
      //   1472: invokevirtual setName : (Ljava/lang/String;)V
      //   1475: aload_0
      //   1476: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   1479: aload_1
      //   1480: invokevirtual setType_label_id : (Ljava/lang/String;)V
      //   1483: aload_0
      //   1484: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   1487: aload_0
      //   1488: getfield g : Landroid/content/Context;
      //   1491: aload_1
      //   1492: invokestatic D : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   1495: invokevirtual setType_label : (Ljava/lang/String;)V
      //   1498: aload_0
      //   1499: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   1502: aload_3
      //   1503: invokevirtual setFormat_tel_number : (Ljava/lang/String;)V
      //   1506: aload_0
      //   1507: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   1510: aload #9
      //   1512: invokevirtual setIcon : (Ljava/lang/String;)V
      //   1515: aload #8
      //   1517: ifnull -> 1556
      //   1520: ldc 'Mobile'
      //   1522: aload #8
      //   1524: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1527: ifne -> 1540
      //   1530: ldc 'Fixed line'
      //   1532: aload #8
      //   1534: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1537: ifeq -> 1556
      //   1540: aload_0
      //   1541: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   1544: aload_0
      //   1545: getfield g : Landroid/content/Context;
      //   1548: aload #8
      //   1550: invokestatic J : (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
      //   1553: invokevirtual setType : (Ljava/lang/String;)V
      //   1556: aload_0
      //   1557: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   1560: aload #7
      //   1562: invokevirtual setOperator : (Ljava/lang/String;)V
      //   1565: goto -> 1763
      //   1568: iload #5
      //   1570: iconst_2
      //   1571: if_icmpne -> 1616
      //   1574: iconst_1
      //   1575: invokestatic H0 : (Z)V
      //   1578: aload_0
      //   1579: getfield i : Lorg/json/JSONObject;
      //   1582: ldc_w 'time_stamp'
      //   1585: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
      //   1588: astore_1
      //   1589: aload_1
      //   1590: ifnull -> 1763
      //   1593: ldc ''
      //   1595: aload_1
      //   1596: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1599: ifne -> 1763
      //   1602: aload_1
      //   1603: invokestatic parseLong : (Ljava/lang/String;)J
      //   1606: ldc2_w 1000
      //   1609: lmul
      //   1610: invokestatic G0 : (J)V
      //   1613: goto -> 1763
      //   1616: iload #5
      //   1618: bipush #-30
      //   1620: if_icmpne -> 1639
      //   1623: iconst_0
      //   1624: invokestatic H0 : (Z)V
      //   1627: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   1630: ldc_w 'search_buyu_error_30_zhudong'
      //   1633: invokevirtual c : (Ljava/lang/String;)V
      //   1636: goto -> 1763
      //   1639: iconst_0
      //   1640: invokestatic H0 : (Z)V
      //   1643: goto -> 1763
      //   1646: astore_1
      //   1647: aload_1
      //   1648: invokevirtual printStackTrace : ()V
      //   1651: goto -> 1763
      //   1654: astore_1
      //   1655: goto -> 1659
      //   1658: astore_1
      //   1659: aload_1
      //   1660: invokevirtual printStackTrace : ()V
      //   1663: goto -> 1763
      //   1666: iload #5
      //   1668: bipush #-20
      //   1670: if_icmpne -> 1763
      //   1673: invokestatic a : ()V
      //   1676: goto -> 1763
      //   1679: astore_1
      //   1680: goto -> 1684
      //   1683: astore_1
      //   1684: aload_1
      //   1685: invokevirtual getMessage : ()Ljava/lang/String;
      //   1688: invokestatic e : (Ljava/lang/String;)V
      //   1691: invokestatic b : ()Lcom/allinone/callerid/util/q;
      //   1694: aload_1
      //   1695: invokevirtual getMessage : ()Ljava/lang/String;
      //   1698: invokevirtual g : (Ljava/lang/String;)V
      //   1701: ldc_w 'connect timed out'
      //   1704: aload_1
      //   1705: invokevirtual getMessage : ()Ljava/lang/String;
      //   1708: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1711: ifeq -> 1719
      //   1714: aload_0
      //   1715: iconst_1
      //   1716: putfield d : Z
      //   1719: getstatic com/allinone/callerid/util/d0.a : Z
      //   1722: ifeq -> 1759
      //   1725: new java/lang/StringBuilder
      //   1728: dup
      //   1729: invokespecial <init> : ()V
      //   1732: astore_2
      //   1733: aload_2
      //   1734: ldc_w 'Exception:'
      //   1737: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1740: pop
      //   1741: aload_2
      //   1742: aload_1
      //   1743: invokevirtual getMessage : ()Ljava/lang/String;
      //   1746: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1749: pop
      //   1750: ldc 'searchNumber'
      //   1752: aload_2
      //   1753: invokevirtual toString : ()Ljava/lang/String;
      //   1756: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
      //   1759: aload_1
      //   1760: invokevirtual printStackTrace : ()V
      //   1763: aload_0
      //   1764: getfield c : Lcom/allinone/callerid/search/EZSearchResult;
      //   1767: areturn
      // Exception table:
      //   from	to	target	type
      //   0	153	1683	java/lang/Exception
      //   153	207	1683	java/lang/Exception
      //   210	217	1683	java/lang/Exception
      //   221	235	1683	java/lang/Exception
      //   240	270	1683	java/lang/Exception
      //   270	322	1683	java/lang/Exception
      //   328	371	1683	java/lang/Exception
      //   375	393	1683	java/lang/Exception
      //   393	408	1683	java/lang/Exception
      //   411	422	1683	java/lang/Exception
      //   436	444	1683	java/lang/Exception
      //   444	454	1683	java/lang/Exception
      //   458	483	1683	java/lang/Exception
      //   486	495	1683	java/lang/Exception
      //   495	505	1683	java/lang/Exception
      //   509	526	1683	java/lang/Exception
      //   526	536	1683	java/lang/Exception
      //   540	557	1683	java/lang/Exception
      //   560	570	1683	java/lang/Exception
      //   574	591	1683	java/lang/Exception
      //   591	633	1683	java/lang/Exception
      //   637	654	1683	java/lang/Exception
      //   658	683	1683	java/lang/Exception
      //   686	694	1683	java/lang/Exception
      //   694	704	1683	java/lang/Exception
      //   708	762	1683	java/lang/Exception
      //   765	774	1683	java/lang/Exception
      //   774	785	1683	java/lang/Exception
      //   789	806	1683	java/lang/Exception
      //   806	817	1683	java/lang/Exception
      //   821	838	1683	java/lang/Exception
      //   838	849	1683	java/lang/Exception
      //   853	870	1683	java/lang/Exception
      //   870	899	1683	java/lang/Exception
      //   903	946	1683	java/lang/Exception
      //   946	980	1683	java/lang/Exception
      //   989	1022	1683	java/lang/Exception
      //   1025	1043	1683	java/lang/Exception
      //   1043	1066	1658	java/lang/Exception
      //   1066	1096	1654	java/lang/Exception
      //   1101	1111	1654	java/lang/Exception
      //   1115	1212	1654	java/lang/Exception
      //   1217	1284	1654	java/lang/Exception
      //   1284	1329	1654	java/lang/Exception
      //   1333	1341	1654	java/lang/Exception
      //   1346	1368	1646	java/lang/Exception
      //   1374	1400	1646	java/lang/Exception
      //   1400	1515	1646	java/lang/Exception
      //   1520	1540	1646	java/lang/Exception
      //   1540	1556	1646	java/lang/Exception
      //   1556	1565	1646	java/lang/Exception
      //   1574	1589	1646	java/lang/Exception
      //   1593	1613	1646	java/lang/Exception
      //   1623	1636	1646	java/lang/Exception
      //   1639	1643	1646	java/lang/Exception
      //   1647	1651	1654	java/lang/Exception
      //   1659	1663	1679	java/lang/Exception
      //   1673	1676	1679	java/lang/Exception
    }
    
    protected void b(EZSearchResult param1EZSearchResult) {
      super.onPostExecute(param1EZSearchResult);
      try {
        this.a.a(param1EZSearchResult, this.d);
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
          int i = jSONObject.getInt("status");
          this.c.setStatus(i);
          if (i == 1)
            y0.b(this.h, this.b, true); 
        } 
        jSONObject = this.i;
        if (jSONObject != null && jSONObject.getInt("status") == 1)
          y0.a(this.i, this.b); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  private static class b extends AsyncTask<Void, String, Void> {
    private List<CallLogBean> a;
    
    private List<String> b;
    
    private HashMap<String, Integer> c;
    
    private List<CallLogBean> d;
    
    private c e;
    
    b(List<CallLogBean> param1List1, List<String> param1List, HashMap<String, Integer> param1HashMap, List<CallLogBean> param1List2, c param1c) {
      this.a = param1List1;
      this.b = param1List;
      this.c = param1HashMap;
      this.d = param1List2;
      this.e = param1c;
    }
    
    protected Void a(Void... param1VarArgs) {
      ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
      Uri uri = CallLog.Calls.CONTENT_URI;
      String str2 = "date";
      String str1 = "number";
      Cursor cursor = contentResolver.query(uri, new String[] { "date", "number", "type", "_id", "numbertype", "numberlabel" }, null, null, "date DESC");
      if (cursor != null && cursor.getCount() > 0) {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        cursor.moveToFirst();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        byte b1;
        for (b1 = 0; b1 < cursor.getCount(); b1++) {
          cursor.moveToPosition(b1);
          Date date = new Date(cursor.getLong(cursor.getColumnIndex(str2)));
          String str3 = cursor.getString(cursor.getColumnIndex(str1));
          int i = cursor.getInt(cursor.getColumnIndex("type"));
          int j = cursor.getInt(cursor.getColumnIndex("_id"));
          int k = cursor.getInt(cursor.getColumnIndex("numbertype"));
          String str4 = simpleDateFormat.format(date);
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str3);
          stringBuilder.append(i);
          stringBuilder.append(str4);
          stringBuilder.append("");
          str4 = stringBuilder.toString();
          if (this.b.contains(str4)) {
            i = ((Integer)this.c.get(str4)).intValue();
            this.c.put(str4, Integer.valueOf(i + 1));
          } else {
            this.b.add(str4);
            this.c.put(str4, Integer.valueOf(1));
            String str = cursor.getString(cursor.getColumnIndex("numberlabel"));
            if (k == 0 && str == null) {
              str = "";
            } else {
              str = (String)ContactsContract.CommonDataKinds.Phone.getTypeLabel(EZCallApplication.c().getResources(), k, str);
            } 
            CallLogBean callLogBean = new CallLogBean();
            callLogBean.x0(j);
            callLogBean.a1(str4);
            callLogBean.D0(str3);
            callLogBean.B0("");
            callLogBean.E0(str);
            callLogBean.c1(i);
            callLogBean.T0(i.n(date));
            callLogBean.d0(date);
            this.a.add(callLogBean);
          } 
        } 
        List<CallLogBean> list = this.a;
        if (list != null && list.size() != 0)
          try {
            this.d.clear();
            for (b1 = 0; b1 < this.a.size(); b1++) {
              CallLogBean callLogBean = this.a.get(b1);
              if (!i1.Y((Context)EZCallApplication.c(), callLogBean.p()))
                this.d.add(this.a.get(b1)); 
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          }  
        cursor.close();
      } else {
        List<CallLogBean> list = this.a;
        if (list != null && list.size() > 0)
          this.a.clear(); 
      } 
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      this.e.a(this.a, this.b, this.c, this.d);
    }
  }
  
  private static class c extends AsyncTask<Void, String, Void> {
    private b a;
    
    c(b param1b) {
      this.a = param1b;
    }
    
    protected Void a(Void... param1VarArgs) {
      try {
        h.b().a();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      this.a.a();
    }
  }
  
  private static class d extends AsyncTask<Void, Void, List<CallLogBean>> {
    private List<CallLogBean> a;
    
    private d b;
    
    d(List<CallLogBean> param1List, d param1d) {
      this.a = param1List;
      this.b = param1d;
    }
    
    protected List<CallLogBean> a(Void... param1VarArgs) {
      ArrayList<CallLogBean> arrayList = new ArrayList();
      try {
        List<SearchHis> list1 = h.b().c();
        if (list1 != null && list1.size() > 0)
          for (byte b = 0; b < list1.size(); b++) {
            CallLogBean callLogBean = new CallLogBean();
            this();
            callLogBean.D0(((SearchHis)list1.get(b)).getNumber());
            EZSearchContacts eZSearchContacts = com.allinone.callerid.f.f.b().d(((SearchHis)list1.get(b)).getNumber());
            if (eZSearchContacts != null) {
              callLogBean.B0(eZSearchContacts.getName());
              callLogBean.O0(eZSearchContacts.isSearched());
              callLogBean.d1(i1.D((Context)EZCallApplication.c(), eZSearchContacts.getType_label()));
              callLogBean.e1(eZSearchContacts.getType_label());
              callLogBean.K0(eZSearchContacts.getReport_count());
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
              callLogBean.Y0(eZSearchContacts.getT_p());
              callLogBean.n0(eZSearchContacts.getComment_tags());
              callLogBean.q0(eZSearchContacts.getCountry());
              callLogBean.G0(eZSearchContacts.getOperator());
              callLogBean.u0(eZSearchContacts.getFaild_error_log());
              String str = i1.w((Context)EZCallApplication.c(), callLogBean.p());
              if (str != null && !"".equals(str)) {
                callLogBean.o0(true);
                callLogBean.B0(str);
                callLogBean.I0(i1.Z((Context)EZCallApplication.c(), callLogBean.p()));
              } 
            } 
            arrayList.add(callLogBean);
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      List<CallLogBean> list = this.a;
      if (list != null) {
        list.clear();
        this.a.addAll(arrayList);
        Collections.reverse(this.a);
      } 
      return this.a;
    }
    
    protected void b(List<CallLogBean> param1List) {
      super.onPostExecute(param1List);
      this.b.a(param1List);
    }
  }
  
  private static class e extends AsyncTask<Void, String, String> {
    private d a;
    
    private ArrayList<CallLogBean> b;
    
    e(d param1d) {
      this.a = param1d;
    }
    
    protected String a(Void... param1VarArgs) {
      try {
        ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
        Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        byte b = 0;
        Cursor cursor = contentResolver.query(uri, new String[] { "display_name", "data1", "sort_key", "contact_id" }, null, null, "sort_key COLLATE LOCALIZED ASC");
        if (cursor == null || cursor.getCount() == 0)
          return null; 
        int i = cursor.getColumnIndex("data1");
        int j = cursor.getColumnIndex("display_name");
        cursor.getColumnIndex("sort_key");
        if (cursor.getCount() > 0) {
          ArrayList<CallLogBean> arrayList1 = new ArrayList();
          this();
          this.b = arrayList1;
          while (cursor.moveToNext()) {
            String str2 = cursor.getString(i);
            if (TextUtils.isEmpty(str2))
              continue; 
            String str1 = cursor.getString(j);
            int k = cursor.getInt(cursor.getColumnIndex("contact_id"));
            CallLogBean callLogBean = new CallLogBean();
            this();
            callLogBean.I0(k);
            callLogBean.D0(str2.replaceAll(" ", ""));
            if (str1 != null) {
              callLogBean.B0(str1);
              callLogBean.o0(true);
              this.b.add(callLogBean);
            } 
          } 
        } 
        cursor.close();
        ArrayList<CallLogBean> arrayList = this.b;
        if (arrayList != null && arrayList.size() != 0)
          while (b < this.b.size()) {
            for (j = this.b.size() - 1; j > b; j--) {
              if (((CallLogBean)this.b.get(b)).v() == ((CallLogBean)this.b.get(j)).v())
                this.b.remove(j); 
            } 
            b++;
          }  
      } catch (Exception exception) {}
      return "ok";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if (param1String != null)
        this.a.a(this.b); 
    }
  }
  
  private static class f extends AsyncTask<Void, String, Void> {
    String a;
    
    f(String param1String) {
      this.a = param1String;
    }
    
    protected Void a(Void... param1VarArgs) {
      try {
        if (h.b().d(this.a) == null) {
          SearchHis searchHis = new SearchHis();
          this();
          searchHis.setNumber(this.a);
          h.b().e(searchHis);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/w/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */