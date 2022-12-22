package com.allinone.callerid.c.a;

import android.content.Context;
import com.allinone.callerid.bean.CustomBlock;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.c.b.b;
import com.allinone.callerid.c.b.c;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.e;
import com.allinone.callerid.util.m;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException;
import com.google.api.client.http.s;
import com.google.api.client.json.c;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.List;

public class a {
  public static final String a;
  
  private static final String b;
  
  private static final String c;
  
  static {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(EZCallApplication.c().getExternalFilesDir(""));
    stringBuilder.append("/");
    stringBuilder.append("contacts.vcf");
    a = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(EZCallApplication.c().getExternalFilesDir(""));
    stringBuilder.append("/");
    stringBuilder.append("blocklist.txt");
    b = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(EZCallApplication.c().getExternalFilesDir(""));
    stringBuilder.append("/");
    stringBuilder.append("customblocklist.txt");
    c = stringBuilder.toString();
  }
  
  public static void a(Context paramContext) {
    int i = c.d();
    if (e.b(paramContext) && (e.d(paramContext) || (e.c(paramContext) && i == 1))) {
      GoogleSignInAccount googleSignInAccount = com.google.android.gms.auth.api.signin.a.c(paramContext);
      if (googleSignInAccount != null) {
        com.google.api.client.googleapis.extensions.android.gms.auth.a a1 = com.google.api.client.googleapis.extensions.android.gms.auth.a.d(paramContext, Collections.singleton("https://www.googleapis.com/auth/drive.file"));
        a1.c(googleSignInAccount.U());
        b(paramContext, (new Drive.Builder(c.c.b.a.a.a.b.a.a(), (c)new com.google.api.client.json.i.a(), (s)a1)).setApplicationName(paramContext.getResources().getString(2131755094)).build(), new a());
      } 
    } 
  }
  
  public static void b(Context paramContext, Drive paramDrive, b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic a : (Landroid/content/Context;)V
    //   4: new com/allinone/callerid/util/m
    //   7: astore_3
    //   8: aload_3
    //   9: aload_0
    //   10: invokespecial <init> : (Landroid/content/Context;)V
    //   13: aload_3
    //   14: invokevirtual h : ()Ljava/util/List;
    //   17: astore #4
    //   19: aload #4
    //   21: ifnull -> 43
    //   24: aload #4
    //   26: invokeinterface size : ()I
    //   31: ifle -> 43
    //   34: aload_0
    //   35: ldc 'blocklist.txt'
    //   37: aload #4
    //   39: invokestatic b : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Z
    //   42: pop
    //   43: aload_3
    //   44: invokevirtual f : ()Ljava/util/List;
    //   47: astore_3
    //   48: aload_3
    //   49: ifnull -> 69
    //   52: aload_3
    //   53: invokeinterface size : ()I
    //   58: ifle -> 69
    //   61: aload_0
    //   62: ldc 'customblocklist.txt'
    //   64: aload_3
    //   65: invokestatic b : (Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)Z
    //   68: pop
    //   69: aload_1
    //   70: ldc 'Showcaller'
    //   72: invokestatic d : (Lcom/google/api/services/drive/Drive;Ljava/lang/String;)Ljava/lang/String;
    //   75: astore #4
    //   77: new java/io/File
    //   80: astore_3
    //   81: aload_3
    //   82: getstatic com/allinone/callerid/c/a/a.a : Ljava/lang/String;
    //   85: invokespecial <init> : (Ljava/lang/String;)V
    //   88: aload_3
    //   89: invokevirtual exists : ()Z
    //   92: istore #5
    //   94: iload #5
    //   96: ifeq -> 224
    //   99: new com/google/api/services/drive/model/File
    //   102: astore_0
    //   103: aload_0
    //   104: invokespecial <init> : ()V
    //   107: aload_0
    //   108: ldc 'contacts.vcf'
    //   110: invokevirtual setName : (Ljava/lang/String;)Lcom/google/api/services/drive/model/File;
    //   113: pop
    //   114: aload_0
    //   115: aload #4
    //   117: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   120: invokevirtual setParents : (Ljava/util/List;)Lcom/google/api/services/drive/model/File;
    //   123: pop
    //   124: new com/google/api/client/http/g
    //   127: astore #6
    //   129: aload #6
    //   131: ldc 'text/x-vcard'
    //   133: aload_3
    //   134: invokespecial <init> : (Ljava/lang/String;Ljava/io/File;)V
    //   137: aload_1
    //   138: invokevirtual files : ()Lcom/google/api/services/drive/Drive$Files;
    //   141: aload_0
    //   142: aload #6
    //   144: invokevirtual create : (Lcom/google/api/services/drive/model/File;Lcom/google/api/client/http/b;)Lcom/google/api/services/drive/Drive$Files$Create;
    //   147: ldc 'id'
    //   149: invokevirtual setFields : (Ljava/lang/String;)Lcom/google/api/services/drive/Drive$Files$Create;
    //   152: invokevirtual execute : ()Ljava/lang/Object;
    //   155: checkcast com/google/api/services/drive/model/File
    //   158: astore #7
    //   160: aload #7
    //   162: ifnull -> 224
    //   165: aload #7
    //   167: invokevirtual getId : ()Ljava/lang/String;
    //   170: astore_0
    //   171: getstatic com/allinone/callerid/util/d0.a : Z
    //   174: ifeq -> 216
    //   177: new java/lang/StringBuilder
    //   180: astore #6
    //   182: aload #6
    //   184: invokespecial <init> : ()V
    //   187: aload #6
    //   189: ldc 'contactsVcfFileId:'
    //   191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload #6
    //   197: aload #7
    //   199: invokevirtual getId : ()Ljava/lang/String;
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: ldc 'backup'
    //   208: aload #6
    //   210: invokevirtual toString : ()Ljava/lang/String;
    //   213: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   216: aload_3
    //   217: invokevirtual delete : ()Z
    //   220: pop
    //   221: goto -> 227
    //   224: ldc ''
    //   226: astore_0
    //   227: new java/io/File
    //   230: astore #6
    //   232: aload #6
    //   234: getstatic com/allinone/callerid/c/a/a.b : Ljava/lang/String;
    //   237: invokespecial <init> : (Ljava/lang/String;)V
    //   240: aload #6
    //   242: invokevirtual exists : ()Z
    //   245: istore #5
    //   247: iload #5
    //   249: ifeq -> 379
    //   252: new com/google/api/services/drive/model/File
    //   255: astore_3
    //   256: aload_3
    //   257: invokespecial <init> : ()V
    //   260: aload_3
    //   261: ldc 'blocklist.txt'
    //   263: invokevirtual setName : (Ljava/lang/String;)Lcom/google/api/services/drive/model/File;
    //   266: pop
    //   267: aload_3
    //   268: aload #4
    //   270: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   273: invokevirtual setParents : (Ljava/util/List;)Lcom/google/api/services/drive/model/File;
    //   276: pop
    //   277: new com/google/api/client/http/g
    //   280: astore #7
    //   282: aload #7
    //   284: ldc 'text/plain'
    //   286: aload #6
    //   288: invokespecial <init> : (Ljava/lang/String;Ljava/io/File;)V
    //   291: aload_1
    //   292: invokevirtual files : ()Lcom/google/api/services/drive/Drive$Files;
    //   295: aload_3
    //   296: aload #7
    //   298: invokevirtual create : (Lcom/google/api/services/drive/model/File;Lcom/google/api/client/http/b;)Lcom/google/api/services/drive/Drive$Files$Create;
    //   301: ldc 'id'
    //   303: invokevirtual setFields : (Ljava/lang/String;)Lcom/google/api/services/drive/Drive$Files$Create;
    //   306: invokevirtual execute : ()Ljava/lang/Object;
    //   309: checkcast com/google/api/services/drive/model/File
    //   312: astore #7
    //   314: aload #7
    //   316: ifnull -> 379
    //   319: aload #7
    //   321: invokevirtual getId : ()Ljava/lang/String;
    //   324: astore_3
    //   325: getstatic com/allinone/callerid/util/d0.a : Z
    //   328: ifeq -> 370
    //   331: new java/lang/StringBuilder
    //   334: astore #8
    //   336: aload #8
    //   338: invokespecial <init> : ()V
    //   341: aload #8
    //   343: ldc 'blockListFileId:'
    //   345: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: pop
    //   349: aload #8
    //   351: aload #7
    //   353: invokevirtual getId : ()Ljava/lang/String;
    //   356: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: pop
    //   360: ldc 'backup'
    //   362: aload #8
    //   364: invokevirtual toString : ()Ljava/lang/String;
    //   367: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   370: aload #6
    //   372: invokevirtual delete : ()Z
    //   375: pop
    //   376: goto -> 382
    //   379: ldc ''
    //   381: astore_3
    //   382: new java/io/File
    //   385: astore #6
    //   387: aload #6
    //   389: getstatic com/allinone/callerid/c/a/a.c : Ljava/lang/String;
    //   392: invokespecial <init> : (Ljava/lang/String;)V
    //   395: aload #6
    //   397: invokevirtual exists : ()Z
    //   400: ifeq -> 535
    //   403: new com/google/api/services/drive/model/File
    //   406: astore #7
    //   408: aload #7
    //   410: invokespecial <init> : ()V
    //   413: aload #7
    //   415: ldc 'customblocklist.txt'
    //   417: invokevirtual setName : (Ljava/lang/String;)Lcom/google/api/services/drive/model/File;
    //   420: pop
    //   421: aload #7
    //   423: aload #4
    //   425: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   428: invokevirtual setParents : (Ljava/util/List;)Lcom/google/api/services/drive/model/File;
    //   431: pop
    //   432: new com/google/api/client/http/g
    //   435: astore #4
    //   437: aload #4
    //   439: ldc 'text/plain'
    //   441: aload #6
    //   443: invokespecial <init> : (Ljava/lang/String;Ljava/io/File;)V
    //   446: aload_1
    //   447: invokevirtual files : ()Lcom/google/api/services/drive/Drive$Files;
    //   450: aload #7
    //   452: aload #4
    //   454: invokevirtual create : (Lcom/google/api/services/drive/model/File;Lcom/google/api/client/http/b;)Lcom/google/api/services/drive/Drive$Files$Create;
    //   457: ldc 'id'
    //   459: invokevirtual setFields : (Ljava/lang/String;)Lcom/google/api/services/drive/Drive$Files$Create;
    //   462: invokevirtual execute : ()Ljava/lang/Object;
    //   465: checkcast com/google/api/services/drive/model/File
    //   468: astore #7
    //   470: aload #7
    //   472: ifnull -> 535
    //   475: aload #7
    //   477: invokevirtual getId : ()Ljava/lang/String;
    //   480: astore_1
    //   481: getstatic com/allinone/callerid/util/d0.a : Z
    //   484: ifeq -> 526
    //   487: new java/lang/StringBuilder
    //   490: astore #4
    //   492: aload #4
    //   494: invokespecial <init> : ()V
    //   497: aload #4
    //   499: ldc 'customBlockListFileId:'
    //   501: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   504: pop
    //   505: aload #4
    //   507: aload #7
    //   509: invokevirtual getId : ()Ljava/lang/String;
    //   512: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   515: pop
    //   516: ldc 'backup'
    //   518: aload #4
    //   520: invokevirtual toString : ()Ljava/lang/String;
    //   523: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   526: aload #6
    //   528: invokevirtual delete : ()Z
    //   531: pop
    //   532: goto -> 538
    //   535: ldc ''
    //   537: astore_1
    //   538: ldc ''
    //   540: aload_0
    //   541: invokevirtual equals : (Ljava/lang/Object;)Z
    //   544: ifeq -> 577
    //   547: ldc ''
    //   549: aload_3
    //   550: invokevirtual equals : (Ljava/lang/Object;)Z
    //   553: ifeq -> 577
    //   556: ldc ''
    //   558: aload_1
    //   559: invokevirtual equals : (Ljava/lang/Object;)Z
    //   562: ifne -> 568
    //   565: goto -> 577
    //   568: aload_2
    //   569: invokeinterface b : ()V
    //   574: goto -> 692
    //   577: aload_2
    //   578: invokeinterface c : ()V
    //   583: goto -> 692
    //   586: astore_0
    //   587: getstatic com/allinone/callerid/util/d0.a : Z
    //   590: ifeq -> 627
    //   593: new java/lang/StringBuilder
    //   596: dup
    //   597: invokespecial <init> : ()V
    //   600: astore_1
    //   601: aload_1
    //   602: ldc_w 'back_Exception:'
    //   605: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   608: pop
    //   609: aload_1
    //   610: aload_0
    //   611: invokevirtual getMessage : ()Ljava/lang/String;
    //   614: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   617: pop
    //   618: ldc 'backup'
    //   620: aload_1
    //   621: invokevirtual toString : ()Ljava/lang/String;
    //   624: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   627: aload_2
    //   628: invokeinterface b : ()V
    //   633: aload_0
    //   634: invokevirtual printStackTrace : ()V
    //   637: goto -> 692
    //   640: astore_1
    //   641: getstatic com/allinone/callerid/util/d0.a : Z
    //   644: ifeq -> 681
    //   647: new java/lang/StringBuilder
    //   650: dup
    //   651: invokespecial <init> : ()V
    //   654: astore_0
    //   655: aload_0
    //   656: ldc_w 'UserRecoverableAuthIOException:'
    //   659: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   662: pop
    //   663: aload_0
    //   664: aload_1
    //   665: invokevirtual getMessage : ()Ljava/lang/String;
    //   668: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   671: pop
    //   672: ldc 'backup'
    //   674: aload_0
    //   675: invokevirtual toString : ()Ljava/lang/String;
    //   678: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   681: aload_2
    //   682: aload_1
    //   683: invokeinterface d : (Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException;)V
    //   688: aload_1
    //   689: invokevirtual printStackTrace : ()V
    //   692: return
    // Exception table:
    //   from	to	target	type
    //   0	19	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   0	19	586	java/lang/Exception
    //   24	43	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   24	43	586	java/lang/Exception
    //   43	48	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   43	48	586	java/lang/Exception
    //   52	69	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   52	69	586	java/lang/Exception
    //   69	94	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   69	94	586	java/lang/Exception
    //   99	160	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   99	160	586	java/lang/Exception
    //   165	216	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   165	216	586	java/lang/Exception
    //   216	221	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   216	221	586	java/lang/Exception
    //   227	247	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   227	247	586	java/lang/Exception
    //   252	314	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   252	314	586	java/lang/Exception
    //   319	370	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   319	370	586	java/lang/Exception
    //   370	376	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   370	376	586	java/lang/Exception
    //   382	470	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   382	470	586	java/lang/Exception
    //   475	526	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   475	526	586	java/lang/Exception
    //   526	532	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   526	532	586	java/lang/Exception
    //   538	565	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   538	565	586	java/lang/Exception
    //   568	574	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   568	574	586	java/lang/Exception
    //   577	583	640	com/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException
    //   577	583	586	java/lang/Exception
  }
  
  public static void c(Drive paramDrive, b paramb) {
    try {
      FileList fileList2 = (FileList)paramDrive.files().list().setQ("name = 'contacts.vcf' and trashed = false").setSpaces("drive").setFields("nextPageToken, files(id, name)").execute();
      List list = fileList2.getFiles();
      byte b1 = 0;
      if (list != null && fileList2.getFiles().size() > 0) {
        File file2 = fileList2.getFiles().get(0);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("name:");
          stringBuilder.append(file2.getName());
          stringBuilder.append(" id:");
          stringBuilder.append(file2.getId());
          d0.a("backup", stringBuilder.toString());
        } 
        File file1 = new File();
        this(a);
        FileOutputStream fileOutputStream = new FileOutputStream();
        this(file1);
        paramDrive.files().get(file2.getId()).executeMediaAndDownloadTo(fileOutputStream);
        paramb.c();
      } 
      FileList fileList1 = (FileList)paramDrive.files().list().setQ("name = 'blocklist.txt' and trashed = false").setSpaces("drive").setFields("nextPageToken, files(id, name)").execute();
      if (fileList1.getFiles() != null && fileList1.getFiles().size() > 0) {
        File file1 = fileList1.getFiles().get(0);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("name:");
          stringBuilder.append(file1.getName());
          stringBuilder.append(" id:");
          stringBuilder.append(file1.getId());
          d0.a("backup", stringBuilder.toString());
        } 
        File file2 = new File();
        this(b);
        FileOutputStream fileOutputStream = new FileOutputStream();
        this(file2);
        paramDrive.files().get(file1.getId()).executeMediaAndDownloadTo(fileOutputStream);
      } 
      fileList1 = (FileList)paramDrive.files().list().setQ("name = 'customblocklist.txt' and trashed = false").setSpaces("drive").setFields("nextPageToken, files(id, name)").execute();
      if (fileList1.getFiles() != null && fileList1.getFiles().size() > 0) {
        File file1 = fileList1.getFiles().get(0);
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("name:");
          stringBuilder.append(file1.getName());
          stringBuilder.append(" id:");
          stringBuilder.append(file1.getId());
          d0.a("backup", stringBuilder.toString());
        } 
        File file2 = new File();
        this(c);
        FileOutputStream fileOutputStream = new FileOutputStream();
        this(file2);
        paramDrive.files().get(file1.getId()).executeMediaAndDownloadTo(fileOutputStream);
      } 
      File file = new File();
      this(b);
      if (file.exists()) {
        List<EZBlackList> list1 = b.a((Context)EZCallApplication.c(), "blocklist.txt");
        if (list1 != null && list1.size() > 0) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("myBlockList:");
            stringBuilder.append(list1.toString());
            d0.a("backup", stringBuilder.toString());
          } 
          m m = new m();
          this((Context)EZCallApplication.c());
          for (byte b2 = 0; b2 < list1.size(); b2++) {
            EZBlackList eZBlackList = list1.get(b2);
            if (!m.j(eZBlackList.getNumber()).booleanValue()) {
              EZBlackList eZBlackList1 = new EZBlackList();
              this();
              eZBlackList1.setNumber(eZBlackList.getNumber());
              eZBlackList1.setName(eZBlackList.getName());
              eZBlackList1.setIs_myblock("true");
              m.l(eZBlackList1);
            } 
          } 
          file.delete();
          if (d0.a)
            d0.a("backup", "myBlockList_restore_ok"); 
        } 
      } 
      file = new File();
      this(c);
      if (file.exists()) {
        List<CustomBlock> list1 = b.a((Context)EZCallApplication.c(), "customblocklist.txt");
        if (list1 != null && list1.size() > 0) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("customBlockList:");
            stringBuilder.append(list1.toString());
            d0.a("backup", stringBuilder.toString());
          } 
          m m = new m();
          this((Context)EZCallApplication.c());
          for (byte b2 = b1; b2 < list1.size(); b2++) {
            CustomBlock customBlock = list1.get(b2);
            if (!m.i(customBlock.getNumber(), String.valueOf(customBlock.getType())).booleanValue())
              m.m(customBlock.getNumber(), customBlock.getType()); 
          } 
          file.delete();
          if (d0.a)
            d0.a("backup", "customBlockList_restore_ok"); 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static String d(Drive paramDrive, String paramString) {
    String str1;
    String str2 = "root";
    String str3 = str2;
    try {
      Drive.Files.List list = paramDrive.files().list();
      str3 = str2;
      StringBuilder stringBuilder = new StringBuilder();
      str3 = str2;
      this();
      str3 = str2;
      stringBuilder.append("mimeType = 'application/vnd.google-apps.folder' and name = '");
      str3 = str2;
      stringBuilder.append(paramString);
      str3 = str2;
      stringBuilder.append("' and trashed = false");
      str3 = str2;
      FileList fileList = (FileList)list.setQ(stringBuilder.toString()).setSpaces("drive").setFields("nextPageToken, files(id, name)").execute();
      str3 = str2;
      if (fileList.getFiles() != null) {
        str3 = str2;
        if (fileList.getFiles().size() > 0) {
          str3 = str2;
          File file1 = fileList.getFiles().get(0);
          str3 = str2;
          paramString = file1.getId();
          return str1;
        } 
      } 
      str3 = str2;
      File file = new File();
      str3 = str2;
      this();
      str3 = str2;
      file.setName(paramString);
      str3 = str2;
      file.setMimeType("application/vnd.google-apps.folder");
      str3 = str2;
    } finally {
      paramDrive = null;
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("searchFolderIdException:");
        stringBuilder.append(paramDrive.getMessage());
        d0.a("backup", stringBuilder.toString());
      } 
      paramDrive.printStackTrace();
    } 
    return str1;
  }
  
  static final class a implements b {
    public void b() {}
    
    public void c() {}
    
    public void d(UserRecoverableAuthIOException param1UserRecoverableAuthIOException) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */