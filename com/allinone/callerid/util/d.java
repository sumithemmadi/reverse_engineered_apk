package com.allinone.callerid.util;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.core.app.i;
import com.allinone.callerid.bean.BlockCall;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.EZDialerActivity;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.permission.OverlayGuideActivity;
import com.allinone.callerid.service.MultiJobService;
import java.util.concurrent.ExecutorService;

public class d {
  public static void a(Context paramContext) {
    try {
      if (!i1.q0()) {
        q.b().c("wakeapp_noti");
        NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService("notification");
        Intent intent = new Intent();
        this(paramContext, MainActivity.class);
        intent.putExtra("launchapp", true);
        PendingIntent pendingIntent = PendingIntent.getActivity(paramContext, 1, intent, 134217728);
        i.e e = new i.e();
        this(paramContext, "Showcaller");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
          NotificationChannel notificationChannel = new NotificationChannel();
          this("com.allinone.callerid_notfication_N", "Showcaller", 3);
          if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
            e.g("com.allinone.callerid_notfication_N");
          } 
        } 
        e.k(paramContext.getResources().getString(2131755552)).j(paramContext.getResources().getString(2131755551)).i(pendingIntent).y("Showcaller").B(System.currentTimeMillis()).t(0).s(false).f(true);
        if (i >= 21) {
          try {
            paramContext.getDrawable(2131231332);
            try {
              e.v(2131231332);
              e.h(paramContext.getResources().getColor(2131099706));
            } catch (Exception null) {}
          } catch (Exception exception) {
            return;
          } 
        } else {
          e.v(2131231118);
          e.o(BitmapFactory.decodeResource(exception.getResources(), 2131558400));
          if (notificationManager != null)
            notificationManager.notify(66, e.b()); 
        } 
        exception.printStackTrace();
      } 
    } finally {
      paramContext = null;
    } 
  }
  
  @TargetApi(23)
  public static void b(Context paramContext) {
    try {
      if (!i1.q0()) {
        NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService("notification");
        Intent intent1 = new Intent();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("package:");
        stringBuilder.append(paramContext.getPackageName());
        this("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(stringBuilder.toString()));
        intent1.setFlags(268435456);
        Intent intent2 = new Intent();
        this(paramContext, OverlayGuideActivity.class);
        intent2.putExtra("open_notifi", true);
        intent2.addFlags(268435456);
        PendingIntent pendingIntent = PendingIntent.getActivities(paramContext, 1, new Intent[] { intent1, intent2 }, 134217728);
        i.e e = new i.e();
        this(paramContext, "Showcaller");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
          NotificationChannel notificationChannel = new NotificationChannel();
          this("com.allinone.callerid_notfication_N", "Showcaller", 3);
          if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
            e.g("com.allinone.callerid_notfication_N");
          } 
        } 
        e.k(paramContext.getResources().getString(2131755556)).j(paramContext.getResources().getString(2131755553)).i(pendingIntent).y("Showcaller").B(System.currentTimeMillis()).t(0).s(false).f(true);
        if (i >= 21) {
          try {
            paramContext.getDrawable(2131231332);
            try {
              e.v(2131231332);
              e.h(paramContext.getResources().getColor(2131099706));
            } catch (Exception null) {}
          } catch (Exception exception) {
            return;
          } 
        } else {
          e.v(2131231118);
          e.o(BitmapFactory.decodeResource(exception.getResources(), 2131558400));
          if (notificationManager != null)
            notificationManager.notify(77, e.b()); 
        } 
        exception.printStackTrace();
      } 
    } finally {
      paramContext = null;
    } 
  }
  
  public static void c(Context paramContext) {
    try {
      ExecutorService executorService = (j0.a()).b;
      b b = new b();
      this(paramContext);
      executorService.execute(b);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void d(Context paramContext) {
    try {
      String str = paramContext.getResources().getString(2131755736);
      Intent intent1 = new Intent();
      this(paramContext, EZDialerActivity.class);
      intent1.putExtra("shortcutdial", true);
      Intent intent2 = new Intent();
      this();
      intent2.putExtra("duplicate", false);
      intent2.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)intent1);
      intent2.putExtra("android.intent.extra.shortcut.NAME", str);
      intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", (Parcelable)Intent.ShortcutIconResource.fromContext(paramContext, 2131231169));
      intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
      paramContext.sendBroadcast(intent2);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static String e() {
    return EZCallApplication.c().getResources().getString(2131755515);
  }
  
  public static String f() {
    return EZCallApplication.c().getResources().getString(2131755655);
  }
  
  public static void g(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 'window'
    //   4: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   7: checkcast android/view/WindowManager
    //   10: astore_1
    //   11: iconst_0
    //   12: istore_2
    //   13: getstatic android/os/Build$VERSION.SDK_INT : I
    //   16: bipush #17
    //   18: if_icmplt -> 48
    //   21: new android/graphics/Point
    //   24: astore_3
    //   25: aload_3
    //   26: invokespecial <init> : ()V
    //   29: aload_1
    //   30: invokeinterface getDefaultDisplay : ()Landroid/view/Display;
    //   35: aload_3
    //   36: invokevirtual getRealSize : (Landroid/graphics/Point;)V
    //   39: aload_3
    //   40: getfield x : I
    //   43: istore #4
    //   45: goto -> 94
    //   48: new android/util/DisplayMetrics
    //   51: astore_3
    //   52: aload_3
    //   53: invokespecial <init> : ()V
    //   56: aload_1
    //   57: invokeinterface getDefaultDisplay : ()Landroid/view/Display;
    //   62: aload_3
    //   63: invokevirtual getMetrics : (Landroid/util/DisplayMetrics;)V
    //   66: aload_3
    //   67: getfield widthPixels : I
    //   70: istore #4
    //   72: goto -> 94
    //   75: astore_1
    //   76: getstatic com/allinone/callerid/util/d0.a : Z
    //   79: ifeq -> 91
    //   82: ldc_w 'initoverlayview'
    //   85: ldc_w 'it can't work'
    //   88: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   91: iconst_0
    //   92: istore #4
    //   94: getstatic com/allinone/callerid/util/d0.a : Z
    //   97: ifeq -> 133
    //   100: new java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: astore_1
    //   108: aload_1
    //   109: ldc_w 'screenWidth:'
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_1
    //   117: iload #4
    //   119: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: ldc_w 'initoverlayview'
    //   126: aload_1
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   133: iload #4
    //   135: ifeq -> 150
    //   138: iload #4
    //   140: sipush #480
    //   143: if_icmpgt -> 150
    //   146: iconst_1
    //   147: invokestatic e2 : (I)V
    //   150: getstatic com/allinone/callerid/util/d0.a : Z
    //   153: ifeq -> 240
    //   156: new java/lang/StringBuilder
    //   159: astore_1
    //   160: aload_1
    //   161: invokespecial <init> : ()V
    //   164: aload_1
    //   165: ldc_w 'hight:'
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: pop
    //   172: aload_1
    //   173: invokestatic C0 : ()I
    //   176: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: ldc_w 'initoverlayview'
    //   183: aload_1
    //   184: invokevirtual toString : ()Ljava/lang/String;
    //   187: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   190: new java/lang/StringBuilder
    //   193: astore_1
    //   194: aload_1
    //   195: invokespecial <init> : ()V
    //   198: aload_1
    //   199: ldc_w 'phone_type:'
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload_1
    //   207: invokestatic O : ()Ljava/lang/String;
    //   210: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: pop
    //   214: aload_1
    //   215: ldc_w ' phone_model:'
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: aload_1
    //   223: invokestatic N : ()Ljava/lang/String;
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: ldc_w 'initoverlayview'
    //   233: aload_1
    //   234: invokevirtual toString : ()Ljava/lang/String;
    //   237: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   240: invokestatic O : ()Ljava/lang/String;
    //   243: astore_1
    //   244: aload_1
    //   245: invokevirtual hashCode : ()I
    //   248: lookupswitch default -> 300, -1675632421 -> 363, 75306 -> 348, 2432928 -> 333, 3620012 -> 318, 1864941562 -> 303
    //   300: goto -> 376
    //   303: aload_1
    //   304: ldc_w 'samsung'
    //   307: invokevirtual equals : (Ljava/lang/Object;)Z
    //   310: ifeq -> 376
    //   313: iconst_3
    //   314: istore_2
    //   315: goto -> 378
    //   318: aload_1
    //   319: ldc_w 'vivo'
    //   322: invokevirtual equals : (Ljava/lang/Object;)Z
    //   325: ifeq -> 376
    //   328: iconst_1
    //   329: istore_2
    //   330: goto -> 378
    //   333: aload_1
    //   334: ldc_w 'OPPO'
    //   337: invokevirtual equals : (Ljava/lang/Object;)Z
    //   340: ifeq -> 376
    //   343: iconst_2
    //   344: istore_2
    //   345: goto -> 378
    //   348: aload_1
    //   349: ldc_w 'LGE'
    //   352: invokevirtual equals : (Ljava/lang/Object;)Z
    //   355: ifeq -> 376
    //   358: iconst_4
    //   359: istore_2
    //   360: goto -> 378
    //   363: aload_1
    //   364: ldc_w 'Xiaomi'
    //   367: invokevirtual equals : (Ljava/lang/Object;)Z
    //   370: ifeq -> 376
    //   373: goto -> 378
    //   376: iconst_m1
    //   377: istore_2
    //   378: iload_2
    //   379: ifeq -> 840
    //   382: iload_2
    //   383: iconst_1
    //   384: if_icmpeq -> 829
    //   387: iload_2
    //   388: iconst_2
    //   389: if_icmpeq -> 812
    //   392: iload_2
    //   393: iconst_3
    //   394: if_icmpeq -> 463
    //   397: iload_2
    //   398: iconst_4
    //   399: if_icmpeq -> 405
    //   402: goto -> 866
    //   405: ldc_w 'Nexus 5'
    //   408: invokestatic N : ()Ljava/lang/String;
    //   411: invokevirtual equals : (Ljava/lang/Object;)Z
    //   414: ifeq -> 434
    //   417: iload #4
    //   419: sipush #1080
    //   422: if_icmpne -> 434
    //   425: sipush #571
    //   428: invokestatic k2 : (I)V
    //   431: goto -> 866
    //   434: ldc_w 'Nexus 4'
    //   437: invokestatic N : ()Ljava/lang/String;
    //   440: invokevirtual equals : (Ljava/lang/Object;)Z
    //   443: ifeq -> 866
    //   446: iload #4
    //   448: sipush #768
    //   451: if_icmpne -> 866
    //   454: sipush #477
    //   457: invokestatic k2 : (I)V
    //   460: goto -> 866
    //   463: ldc_w 'SM-J200G'
    //   466: invokestatic N : ()Ljava/lang/String;
    //   469: invokevirtual equals : (Ljava/lang/Object;)Z
    //   472: ifeq -> 492
    //   475: iload #4
    //   477: sipush #540
    //   480: if_icmpne -> 492
    //   483: sipush #516
    //   486: invokestatic k2 : (I)V
    //   489: goto -> 866
    //   492: ldc_w 'SM-G610F'
    //   495: invokestatic N : ()Ljava/lang/String;
    //   498: invokevirtual equals : (Ljava/lang/Object;)Z
    //   501: ifeq -> 521
    //   504: iload #4
    //   506: sipush #1080
    //   509: if_icmpne -> 521
    //   512: sipush #588
    //   515: invokestatic k2 : (I)V
    //   518: goto -> 866
    //   521: ldc_w 'SM-J700H'
    //   524: invokestatic N : ()Ljava/lang/String;
    //   527: invokevirtual equals : (Ljava/lang/Object;)Z
    //   530: ifeq -> 550
    //   533: iload #4
    //   535: sipush #720
    //   538: if_icmpne -> 550
    //   541: sipush #296
    //   544: invokestatic k2 : (I)V
    //   547: goto -> 866
    //   550: ldc_w 'SM-J700F'
    //   553: invokestatic N : ()Ljava/lang/String;
    //   556: invokevirtual equals : (Ljava/lang/Object;)Z
    //   559: ifeq -> 579
    //   562: iload #4
    //   564: sipush #720
    //   567: if_icmpne -> 579
    //   570: sipush #296
    //   573: invokestatic k2 : (I)V
    //   576: goto -> 866
    //   579: ldc_w 'GT-I9060I'
    //   582: invokestatic N : ()Ljava/lang/String;
    //   585: invokevirtual equals : (Ljava/lang/Object;)Z
    //   588: ifeq -> 608
    //   591: iload #4
    //   593: sipush #480
    //   596: if_icmpne -> 608
    //   599: sipush #296
    //   602: invokestatic k2 : (I)V
    //   605: goto -> 866
    //   608: ldc_w 'Galaxy Note3'
    //   611: invokestatic N : ()Ljava/lang/String;
    //   614: invokevirtual equals : (Ljava/lang/Object;)Z
    //   617: ifeq -> 637
    //   620: iload #4
    //   622: sipush #1080
    //   625: if_icmpne -> 637
    //   628: sipush #296
    //   631: invokestatic k2 : (I)V
    //   634: goto -> 866
    //   637: ldc_w 'SM-G532F'
    //   640: invokestatic N : ()Ljava/lang/String;
    //   643: invokevirtual equals : (Ljava/lang/Object;)Z
    //   646: ifeq -> 666
    //   649: iload #4
    //   651: sipush #540
    //   654: if_icmpne -> 666
    //   657: sipush #296
    //   660: invokestatic k2 : (I)V
    //   663: goto -> 866
    //   666: ldc_w 'SM-J710F'
    //   669: invokestatic N : ()Ljava/lang/String;
    //   672: invokevirtual equals : (Ljava/lang/Object;)Z
    //   675: ifeq -> 695
    //   678: iload #4
    //   680: sipush #720
    //   683: if_icmpne -> 695
    //   686: sipush #296
    //   689: invokestatic k2 : (I)V
    //   692: goto -> 866
    //   695: iload #4
    //   697: sipush #540
    //   700: if_icmpne -> 745
    //   703: ldc_w '5.1.1'
    //   706: invokestatic R : ()Ljava/lang/String;
    //   709: invokevirtual equals : (Ljava/lang/Object;)Z
    //   712: ifeq -> 724
    //   715: sipush #516
    //   718: invokestatic k2 : (I)V
    //   721: goto -> 866
    //   724: ldc_w '6.0.1'
    //   727: invokestatic R : ()Ljava/lang/String;
    //   730: invokevirtual equals : (Ljava/lang/Object;)Z
    //   733: ifeq -> 866
    //   736: sipush #296
    //   739: invokestatic k2 : (I)V
    //   742: goto -> 866
    //   745: iload #4
    //   747: sipush #720
    //   750: if_icmpne -> 762
    //   753: sipush #296
    //   756: invokestatic k2 : (I)V
    //   759: goto -> 866
    //   762: iload #4
    //   764: sipush #1080
    //   767: if_icmpne -> 866
    //   770: ldc_w '4.3'
    //   773: invokestatic R : ()Ljava/lang/String;
    //   776: invokevirtual equals : (Ljava/lang/Object;)Z
    //   779: ifeq -> 791
    //   782: sipush #296
    //   785: invokestatic k2 : (I)V
    //   788: goto -> 866
    //   791: ldc_w '6.0.1'
    //   794: invokestatic R : ()Ljava/lang/String;
    //   797: invokevirtual equals : (Ljava/lang/Object;)Z
    //   800: ifeq -> 866
    //   803: sipush #588
    //   806: invokestatic k2 : (I)V
    //   809: goto -> 866
    //   812: iload #4
    //   814: sipush #720
    //   817: if_icmpne -> 866
    //   820: sipush #350
    //   823: invokestatic k2 : (I)V
    //   826: goto -> 866
    //   829: aload_0
    //   830: fconst_0
    //   831: invokestatic a : (Landroid/content/Context;F)I
    //   834: invokestatic k2 : (I)V
    //   837: goto -> 866
    //   840: ldc_w 'Redmi Note 4'
    //   843: invokestatic N : ()Ljava/lang/String;
    //   846: invokevirtual equals : (Ljava/lang/Object;)Z
    //   849: ifeq -> 866
    //   852: sipush #588
    //   855: invokestatic k2 : (I)V
    //   858: goto -> 866
    //   861: astore_0
    //   862: aload_0
    //   863: invokevirtual printStackTrace : ()V
    //   866: return
    //   867: astore_1
    //   868: goto -> 91
    // Exception table:
    //   from	to	target	type
    //   13	45	75	java/lang/NoSuchMethodError
    //   13	45	867	java/lang/Exception
    //   48	72	75	java/lang/NoSuchMethodError
    //   48	72	867	java/lang/Exception
    //   150	240	861	java/lang/Exception
    //   240	300	861	java/lang/Exception
    //   303	313	861	java/lang/Exception
    //   318	328	861	java/lang/Exception
    //   333	343	861	java/lang/Exception
    //   348	358	861	java/lang/Exception
    //   363	373	861	java/lang/Exception
    //   405	417	861	java/lang/Exception
    //   425	431	861	java/lang/Exception
    //   434	446	861	java/lang/Exception
    //   454	460	861	java/lang/Exception
    //   463	475	861	java/lang/Exception
    //   483	489	861	java/lang/Exception
    //   492	504	861	java/lang/Exception
    //   512	518	861	java/lang/Exception
    //   521	533	861	java/lang/Exception
    //   541	547	861	java/lang/Exception
    //   550	562	861	java/lang/Exception
    //   570	576	861	java/lang/Exception
    //   579	591	861	java/lang/Exception
    //   599	605	861	java/lang/Exception
    //   608	620	861	java/lang/Exception
    //   628	634	861	java/lang/Exception
    //   637	649	861	java/lang/Exception
    //   657	663	861	java/lang/Exception
    //   666	678	861	java/lang/Exception
    //   686	692	861	java/lang/Exception
    //   703	721	861	java/lang/Exception
    //   724	742	861	java/lang/Exception
    //   753	759	861	java/lang/Exception
    //   770	788	861	java/lang/Exception
    //   791	809	861	java/lang/Exception
    //   820	826	861	java/lang/Exception
    //   829	837	861	java/lang/Exception
    //   840	858	861	java/lang/Exception
  }
  
  public static void h(String paramString, long paramLong) {
    (j0.a()).b.execute(new a(paramString, paramLong));
  }
  
  static final class a implements Runnable {
    a(String param1String, long param1Long) {}
    
    public void run() {
      try {
        b1.I2(Boolean.TRUE);
        BlockCall blockCall = new BlockCall();
        this();
        blockCall.setNumber(this.b);
        blockCall.setTime(this.c);
        com.allinone.callerid.f.b.a().c(blockCall);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  static final class b implements Runnable {
    b(Context param1Context) {}
    
    public void run() {
      if (Build.VERSION.SDK_INT >= 21) {
        Intent intent;
        String str = b1.B0();
        long l = b1.Y();
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("date:");
          stringBuilder.append(str);
          stringBuilder.append(" time:");
          stringBuilder.append(i.d(l));
          d0.a("wakeapp", stringBuilder.toString());
        } 
        str.hashCode();
        if (!str.equals("3")) {
          if (str.equals("7") && System.currentTimeMillis() - l > 604800000L) {
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("date:");
              stringBuilder.append(str);
              stringBuilder.append(" show");
              d0.a("wakeapp", stringBuilder.toString());
            } 
            intent = new Intent(this.b, MultiJobService.class);
            this.b.startService(intent);
            b1.E1(System.currentTimeMillis());
            b1.j2("3");
          } 
        } else if (System.currentTimeMillis() - l > 259200000L) {
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("date:");
            stringBuilder.append((String)intent);
            stringBuilder.append(" show");
            d0.a("wakeapp", stringBuilder.toString());
          } 
          intent = new Intent(this.b, MultiJobService.class);
          this.b.startService(intent);
          b1.E1(System.currentTimeMillis());
          b1.j2("7");
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */