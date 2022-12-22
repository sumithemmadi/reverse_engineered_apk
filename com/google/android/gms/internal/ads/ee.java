package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.f;
import java.util.Map;
import java.util.Set;

public final class ee extends oe {
  private static final Set<String> c = f.g((Object[])new String[] { "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center" });
  
  private String d = "top-right";
  
  private boolean e = true;
  
  private int f = 0;
  
  private int g = 0;
  
  private int h = -1;
  
  private int i = 0;
  
  private int j = 0;
  
  private int k = -1;
  
  private final Object l = new Object();
  
  private final tq m;
  
  private final Activity n;
  
  private ks o;
  
  private ImageView p;
  
  private LinearLayout q;
  
  private qe r;
  
  private PopupWindow s;
  
  private RelativeLayout t;
  
  private ViewGroup u;
  
  public ee(tq paramtq, qe paramqe) {
    super(paramtq, "resize");
    this.m = paramtq;
    this.n = paramtq.a();
    this.r = paramqe;
  }
  
  public final void h(int paramInt1, int paramInt2, boolean paramBoolean) {
    synchronized (this.l) {
      this.f = paramInt1;
      this.g = paramInt2;
      PopupWindow popupWindow = this.s;
      return;
    } 
  }
  
  public final void i(boolean paramBoolean) {
    synchronized (this.l) {
      PopupWindow popupWindow = this.s;
      if (popupWindow != null) {
        popupWindow.dismiss();
        this.t.removeView(this.m.getView());
        ViewGroup viewGroup = this.u;
        if (viewGroup != null) {
          viewGroup.removeView((View)this.p);
          this.u.addView(this.m.getView());
          this.m.P(this.o);
        } 
        if (paramBoolean) {
          g("default");
          qe qe1 = this.r;
          if (qe1 != null)
            qe1.c(); 
        } 
        this.s = null;
        this.t = null;
        this.u = null;
        this.q = null;
      } 
      return;
    } 
  }
  
  public final void j(Map<String, String> paramMap) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield n : Landroid/app/Activity;
    //   11: ifnonnull -> 23
    //   14: aload_0
    //   15: ldc 'Not an activity context. Cannot resize.'
    //   17: invokevirtual e : (Ljava/lang/String;)V
    //   20: aload_2
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   27: invokeinterface q : ()Lcom/google/android/gms/internal/ads/ks;
    //   32: ifnonnull -> 44
    //   35: aload_0
    //   36: ldc 'Webview is not yet available, size is not set.'
    //   38: invokevirtual e : (Ljava/lang/String;)V
    //   41: aload_2
    //   42: monitorexit
    //   43: return
    //   44: aload_0
    //   45: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   48: invokeinterface q : ()Lcom/google/android/gms/internal/ads/ks;
    //   53: invokevirtual e : ()Z
    //   56: ifeq -> 68
    //   59: aload_0
    //   60: ldc 'Is interstitial. Cannot resize an interstitial.'
    //   62: invokevirtual e : (Ljava/lang/String;)V
    //   65: aload_2
    //   66: monitorexit
    //   67: return
    //   68: aload_0
    //   69: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   72: invokeinterface T : ()Z
    //   77: ifeq -> 89
    //   80: aload_0
    //   81: ldc 'Cannot resize an expanded banner.'
    //   83: invokevirtual e : (Ljava/lang/String;)V
    //   86: aload_2
    //   87: monitorexit
    //   88: return
    //   89: aload_1
    //   90: ldc 'width'
    //   92: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   97: checkcast java/lang/CharSequence
    //   100: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   103: ifne -> 128
    //   106: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   109: pop
    //   110: aload_0
    //   111: aload_1
    //   112: ldc 'width'
    //   114: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   119: checkcast java/lang/String
    //   122: invokestatic a0 : (Ljava/lang/String;)I
    //   125: putfield k : I
    //   128: aload_1
    //   129: ldc 'height'
    //   131: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   136: checkcast java/lang/CharSequence
    //   139: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   142: ifne -> 167
    //   145: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   148: pop
    //   149: aload_0
    //   150: aload_1
    //   151: ldc 'height'
    //   153: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   158: checkcast java/lang/String
    //   161: invokestatic a0 : (Ljava/lang/String;)I
    //   164: putfield h : I
    //   167: aload_1
    //   168: ldc 'offsetX'
    //   170: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   175: checkcast java/lang/CharSequence
    //   178: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   181: ifne -> 206
    //   184: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   187: pop
    //   188: aload_0
    //   189: aload_1
    //   190: ldc 'offsetX'
    //   192: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   197: checkcast java/lang/String
    //   200: invokestatic a0 : (Ljava/lang/String;)I
    //   203: putfield i : I
    //   206: aload_1
    //   207: ldc 'offsetY'
    //   209: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   214: checkcast java/lang/CharSequence
    //   217: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   220: ifne -> 245
    //   223: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   226: pop
    //   227: aload_0
    //   228: aload_1
    //   229: ldc 'offsetY'
    //   231: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   236: checkcast java/lang/String
    //   239: invokestatic a0 : (Ljava/lang/String;)I
    //   242: putfield j : I
    //   245: aload_1
    //   246: ldc 'allowOffscreen'
    //   248: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   253: checkcast java/lang/CharSequence
    //   256: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   259: ifne -> 280
    //   262: aload_0
    //   263: aload_1
    //   264: ldc 'allowOffscreen'
    //   266: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   271: checkcast java/lang/String
    //   274: invokestatic parseBoolean : (Ljava/lang/String;)Z
    //   277: putfield e : Z
    //   280: aload_1
    //   281: ldc 'customClosePosition'
    //   283: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   288: checkcast java/lang/String
    //   291: astore_1
    //   292: aload_1
    //   293: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   296: ifne -> 304
    //   299: aload_0
    //   300: aload_1
    //   301: putfield d : Ljava/lang/String;
    //   304: aload_0
    //   305: getfield k : I
    //   308: iflt -> 323
    //   311: aload_0
    //   312: getfield h : I
    //   315: iflt -> 323
    //   318: iconst_1
    //   319: istore_3
    //   320: goto -> 325
    //   323: iconst_0
    //   324: istore_3
    //   325: iload_3
    //   326: ifne -> 338
    //   329: aload_0
    //   330: ldc 'Invalid width and height options. Cannot resize.'
    //   332: invokevirtual e : (Ljava/lang/String;)V
    //   335: aload_2
    //   336: monitorexit
    //   337: return
    //   338: aload_0
    //   339: getfield n : Landroid/app/Activity;
    //   342: invokevirtual getWindow : ()Landroid/view/Window;
    //   345: astore #4
    //   347: aload #4
    //   349: ifnull -> 2203
    //   352: aload #4
    //   354: invokevirtual getDecorView : ()Landroid/view/View;
    //   357: ifnonnull -> 363
    //   360: goto -> 2203
    //   363: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   366: pop
    //   367: aload_0
    //   368: getfield n : Landroid/app/Activity;
    //   371: invokestatic h0 : (Landroid/app/Activity;)[I
    //   374: astore #5
    //   376: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   379: pop
    //   380: aload_0
    //   381: getfield n : Landroid/app/Activity;
    //   384: invokestatic j0 : (Landroid/app/Activity;)[I
    //   387: astore_1
    //   388: aload #5
    //   390: iconst_0
    //   391: iaload
    //   392: istore #6
    //   394: aload #5
    //   396: iconst_1
    //   397: iaload
    //   398: istore #7
    //   400: aload_0
    //   401: getfield k : I
    //   404: istore #8
    //   406: iconst_m1
    //   407: istore #9
    //   409: iload #8
    //   411: bipush #50
    //   413: if_icmplt -> 976
    //   416: iload #8
    //   418: iload #6
    //   420: if_icmple -> 426
    //   423: goto -> 976
    //   426: aload_0
    //   427: getfield h : I
    //   430: istore_3
    //   431: iload_3
    //   432: bipush #50
    //   434: if_icmplt -> 967
    //   437: iload_3
    //   438: iload #7
    //   440: if_icmple -> 446
    //   443: goto -> 967
    //   446: iload_3
    //   447: iload #7
    //   449: if_icmpne -> 467
    //   452: iload #8
    //   454: iload #6
    //   456: if_icmpne -> 467
    //   459: ldc 'Cannot resize to a full-screen ad.'
    //   461: invokestatic i : (Ljava/lang/String;)V
    //   464: goto -> 982
    //   467: aload_0
    //   468: getfield e : Z
    //   471: ifeq -> 962
    //   474: aload_0
    //   475: getfield d : Ljava/lang/String;
    //   478: astore #5
    //   480: aload #5
    //   482: invokevirtual hashCode : ()I
    //   485: lookupswitch default -> 544, -1364013995 -> 622, -1012429441 -> 607, -655373719 -> 592, 1163912186 -> 577, 1288627767 -> 562, 1755462605 -> 547
    //   544: goto -> 637
    //   547: aload #5
    //   549: ldc 'top-center'
    //   551: invokevirtual equals : (Ljava/lang/Object;)Z
    //   554: ifeq -> 637
    //   557: iconst_1
    //   558: istore_3
    //   559: goto -> 639
    //   562: aload #5
    //   564: ldc 'bottom-center'
    //   566: invokevirtual equals : (Ljava/lang/Object;)Z
    //   569: ifeq -> 637
    //   572: iconst_4
    //   573: istore_3
    //   574: goto -> 639
    //   577: aload #5
    //   579: ldc 'bottom-right'
    //   581: invokevirtual equals : (Ljava/lang/Object;)Z
    //   584: ifeq -> 637
    //   587: iconst_5
    //   588: istore_3
    //   589: goto -> 639
    //   592: aload #5
    //   594: ldc 'bottom-left'
    //   596: invokevirtual equals : (Ljava/lang/Object;)Z
    //   599: ifeq -> 637
    //   602: iconst_3
    //   603: istore_3
    //   604: goto -> 639
    //   607: aload #5
    //   609: ldc 'top-left'
    //   611: invokevirtual equals : (Ljava/lang/Object;)Z
    //   614: ifeq -> 637
    //   617: iconst_0
    //   618: istore_3
    //   619: goto -> 639
    //   622: aload #5
    //   624: ldc 'center'
    //   626: invokevirtual equals : (Ljava/lang/Object;)Z
    //   629: ifeq -> 637
    //   632: iconst_2
    //   633: istore_3
    //   634: goto -> 639
    //   637: iconst_m1
    //   638: istore_3
    //   639: iload_3
    //   640: ifeq -> 898
    //   643: iload_3
    //   644: iconst_1
    //   645: if_icmpeq -> 863
    //   648: iload_3
    //   649: iconst_2
    //   650: if_icmpeq -> 819
    //   653: iload_3
    //   654: iconst_3
    //   655: if_icmpeq -> 779
    //   658: iload_3
    //   659: iconst_4
    //   660: if_icmpeq -> 739
    //   663: iload_3
    //   664: iconst_5
    //   665: if_icmpeq -> 701
    //   668: aload_0
    //   669: getfield f : I
    //   672: aload_0
    //   673: getfield i : I
    //   676: iadd
    //   677: aload_0
    //   678: getfield k : I
    //   681: iadd
    //   682: bipush #50
    //   684: isub
    //   685: istore_3
    //   686: aload_0
    //   687: getfield g : I
    //   690: istore #7
    //   692: aload_0
    //   693: getfield j : I
    //   696: istore #8
    //   698: goto -> 920
    //   701: aload_0
    //   702: getfield f : I
    //   705: aload_0
    //   706: getfield i : I
    //   709: iadd
    //   710: aload_0
    //   711: getfield k : I
    //   714: iadd
    //   715: bipush #50
    //   717: isub
    //   718: istore_3
    //   719: aload_0
    //   720: getfield g : I
    //   723: aload_0
    //   724: getfield j : I
    //   727: iadd
    //   728: istore #7
    //   730: aload_0
    //   731: getfield h : I
    //   734: istore #8
    //   736: goto -> 806
    //   739: aload_0
    //   740: getfield f : I
    //   743: aload_0
    //   744: getfield i : I
    //   747: iadd
    //   748: aload_0
    //   749: getfield k : I
    //   752: iconst_2
    //   753: idiv
    //   754: iadd
    //   755: bipush #25
    //   757: isub
    //   758: istore_3
    //   759: aload_0
    //   760: getfield g : I
    //   763: aload_0
    //   764: getfield j : I
    //   767: iadd
    //   768: istore #7
    //   770: aload_0
    //   771: getfield h : I
    //   774: istore #8
    //   776: goto -> 806
    //   779: aload_0
    //   780: getfield f : I
    //   783: aload_0
    //   784: getfield i : I
    //   787: iadd
    //   788: istore_3
    //   789: aload_0
    //   790: getfield g : I
    //   793: aload_0
    //   794: getfield j : I
    //   797: iadd
    //   798: istore #7
    //   800: aload_0
    //   801: getfield h : I
    //   804: istore #8
    //   806: iload #7
    //   808: iload #8
    //   810: iadd
    //   811: bipush #50
    //   813: isub
    //   814: istore #7
    //   816: goto -> 927
    //   819: aload_0
    //   820: getfield f : I
    //   823: aload_0
    //   824: getfield i : I
    //   827: iadd
    //   828: aload_0
    //   829: getfield k : I
    //   832: iconst_2
    //   833: idiv
    //   834: iadd
    //   835: bipush #25
    //   837: isub
    //   838: istore_3
    //   839: aload_0
    //   840: getfield g : I
    //   843: aload_0
    //   844: getfield j : I
    //   847: iadd
    //   848: aload_0
    //   849: getfield h : I
    //   852: iconst_2
    //   853: idiv
    //   854: iadd
    //   855: bipush #25
    //   857: isub
    //   858: istore #7
    //   860: goto -> 927
    //   863: aload_0
    //   864: getfield f : I
    //   867: aload_0
    //   868: getfield i : I
    //   871: iadd
    //   872: aload_0
    //   873: getfield k : I
    //   876: iconst_2
    //   877: idiv
    //   878: iadd
    //   879: bipush #25
    //   881: isub
    //   882: istore_3
    //   883: aload_0
    //   884: getfield g : I
    //   887: istore #7
    //   889: aload_0
    //   890: getfield j : I
    //   893: istore #8
    //   895: goto -> 920
    //   898: aload_0
    //   899: getfield f : I
    //   902: aload_0
    //   903: getfield i : I
    //   906: iadd
    //   907: istore_3
    //   908: aload_0
    //   909: getfield g : I
    //   912: istore #7
    //   914: aload_0
    //   915: getfield j : I
    //   918: istore #8
    //   920: iload #7
    //   922: iload #8
    //   924: iadd
    //   925: istore #7
    //   927: iload_3
    //   928: iflt -> 982
    //   931: iload_3
    //   932: bipush #50
    //   934: iadd
    //   935: iload #6
    //   937: if_icmpgt -> 982
    //   940: iload #7
    //   942: aload_1
    //   943: iconst_0
    //   944: iaload
    //   945: if_icmplt -> 982
    //   948: iload #7
    //   950: bipush #50
    //   952: iadd
    //   953: aload_1
    //   954: iconst_1
    //   955: iaload
    //   956: if_icmple -> 962
    //   959: goto -> 982
    //   962: iconst_1
    //   963: istore_3
    //   964: goto -> 984
    //   967: ldc_w 'Height is too small or too large.'
    //   970: invokestatic i : (Ljava/lang/String;)V
    //   973: goto -> 982
    //   976: ldc_w 'Width is too small or too large.'
    //   979: invokestatic i : (Ljava/lang/String;)V
    //   982: iconst_0
    //   983: istore_3
    //   984: iload_3
    //   985: ifne -> 993
    //   988: aconst_null
    //   989: astore_1
    //   990: goto -> 1180
    //   993: aload_0
    //   994: getfield e : Z
    //   997: ifeq -> 1031
    //   1000: iconst_2
    //   1001: newarray int
    //   1003: astore_1
    //   1004: aload_1
    //   1005: iconst_0
    //   1006: aload_0
    //   1007: getfield f : I
    //   1010: aload_0
    //   1011: getfield i : I
    //   1014: iadd
    //   1015: iastore
    //   1016: aload_1
    //   1017: iconst_1
    //   1018: aload_0
    //   1019: getfield g : I
    //   1022: aload_0
    //   1023: getfield j : I
    //   1026: iadd
    //   1027: iastore
    //   1028: goto -> 1180
    //   1031: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   1034: pop
    //   1035: aload_0
    //   1036: getfield n : Landroid/app/Activity;
    //   1039: invokestatic h0 : (Landroid/app/Activity;)[I
    //   1042: astore_1
    //   1043: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   1046: pop
    //   1047: aload_0
    //   1048: getfield n : Landroid/app/Activity;
    //   1051: invokestatic j0 : (Landroid/app/Activity;)[I
    //   1054: astore #5
    //   1056: aload_1
    //   1057: iconst_0
    //   1058: iaload
    //   1059: istore #6
    //   1061: aload_0
    //   1062: getfield f : I
    //   1065: aload_0
    //   1066: getfield i : I
    //   1069: iadd
    //   1070: istore #7
    //   1072: aload_0
    //   1073: getfield g : I
    //   1076: aload_0
    //   1077: getfield j : I
    //   1080: iadd
    //   1081: istore #8
    //   1083: iload #7
    //   1085: ifge -> 1093
    //   1088: iconst_0
    //   1089: istore_3
    //   1090: goto -> 1118
    //   1093: aload_0
    //   1094: getfield k : I
    //   1097: istore #10
    //   1099: iload #7
    //   1101: istore_3
    //   1102: iload #7
    //   1104: iload #10
    //   1106: iadd
    //   1107: iload #6
    //   1109: if_icmple -> 1118
    //   1112: iload #6
    //   1114: iload #10
    //   1116: isub
    //   1117: istore_3
    //   1118: iload #8
    //   1120: aload #5
    //   1122: iconst_0
    //   1123: iaload
    //   1124: if_icmpge -> 1136
    //   1127: aload #5
    //   1129: iconst_0
    //   1130: iaload
    //   1131: istore #7
    //   1133: goto -> 1167
    //   1136: aload_0
    //   1137: getfield h : I
    //   1140: istore #6
    //   1142: iload #8
    //   1144: istore #7
    //   1146: iload #8
    //   1148: iload #6
    //   1150: iadd
    //   1151: aload #5
    //   1153: iconst_1
    //   1154: iaload
    //   1155: if_icmple -> 1167
    //   1158: aload #5
    //   1160: iconst_1
    //   1161: iaload
    //   1162: iload #6
    //   1164: isub
    //   1165: istore #7
    //   1167: iconst_2
    //   1168: newarray int
    //   1170: astore_1
    //   1171: aload_1
    //   1172: iconst_0
    //   1173: iload_3
    //   1174: iastore
    //   1175: aload_1
    //   1176: iconst_1
    //   1177: iload #7
    //   1179: iastore
    //   1180: aload_1
    //   1181: ifnonnull -> 1194
    //   1184: aload_0
    //   1185: ldc_w 'Resize location out of screen or close button is not visible.'
    //   1188: invokevirtual e : (Ljava/lang/String;)V
    //   1191: aload_2
    //   1192: monitorexit
    //   1193: return
    //   1194: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   1197: pop
    //   1198: aload_0
    //   1199: getfield n : Landroid/app/Activity;
    //   1202: aload_0
    //   1203: getfield k : I
    //   1206: invokestatic r : (Landroid/content/Context;I)I
    //   1209: istore #8
    //   1211: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   1214: pop
    //   1215: aload_0
    //   1216: getfield n : Landroid/app/Activity;
    //   1219: aload_0
    //   1220: getfield h : I
    //   1223: invokestatic r : (Landroid/content/Context;I)I
    //   1226: istore #7
    //   1228: aload_0
    //   1229: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   1232: invokeinterface getView : ()Landroid/view/View;
    //   1237: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   1240: astore #5
    //   1242: aload #5
    //   1244: ifnull -> 2193
    //   1247: aload #5
    //   1249: instanceof android/view/ViewGroup
    //   1252: ifeq -> 2193
    //   1255: aload #5
    //   1257: checkcast android/view/ViewGroup
    //   1260: aload_0
    //   1261: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   1264: invokeinterface getView : ()Landroid/view/View;
    //   1269: invokevirtual removeView : (Landroid/view/View;)V
    //   1272: aload_0
    //   1273: getfield s : Landroid/widget/PopupWindow;
    //   1276: astore #11
    //   1278: aload #11
    //   1280: ifnonnull -> 1364
    //   1283: aload_0
    //   1284: aload #5
    //   1286: checkcast android/view/ViewGroup
    //   1289: putfield u : Landroid/view/ViewGroup;
    //   1292: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   1295: pop
    //   1296: aload_0
    //   1297: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   1300: invokeinterface getView : ()Landroid/view/View;
    //   1305: invokestatic m0 : (Landroid/view/View;)Landroid/graphics/Bitmap;
    //   1308: astore #11
    //   1310: new android/widget/ImageView
    //   1313: astore #5
    //   1315: aload #5
    //   1317: aload_0
    //   1318: getfield n : Landroid/app/Activity;
    //   1321: invokespecial <init> : (Landroid/content/Context;)V
    //   1324: aload_0
    //   1325: aload #5
    //   1327: putfield p : Landroid/widget/ImageView;
    //   1330: aload #5
    //   1332: aload #11
    //   1334: invokevirtual setImageBitmap : (Landroid/graphics/Bitmap;)V
    //   1337: aload_0
    //   1338: aload_0
    //   1339: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   1342: invokeinterface q : ()Lcom/google/android/gms/internal/ads/ks;
    //   1347: putfield o : Lcom/google/android/gms/internal/ads/ks;
    //   1350: aload_0
    //   1351: getfield u : Landroid/view/ViewGroup;
    //   1354: aload_0
    //   1355: getfield p : Landroid/widget/ImageView;
    //   1358: invokevirtual addView : (Landroid/view/View;)V
    //   1361: goto -> 1369
    //   1364: aload #11
    //   1366: invokevirtual dismiss : ()V
    //   1369: new android/widget/RelativeLayout
    //   1372: astore #5
    //   1374: aload #5
    //   1376: aload_0
    //   1377: getfield n : Landroid/app/Activity;
    //   1380: invokespecial <init> : (Landroid/content/Context;)V
    //   1383: aload_0
    //   1384: aload #5
    //   1386: putfield t : Landroid/widget/RelativeLayout;
    //   1389: aload #5
    //   1391: iconst_0
    //   1392: invokevirtual setBackgroundColor : (I)V
    //   1395: aload_0
    //   1396: getfield t : Landroid/widget/RelativeLayout;
    //   1399: astore #5
    //   1401: new android/view/ViewGroup$LayoutParams
    //   1404: astore #11
    //   1406: aload #11
    //   1408: iload #8
    //   1410: iload #7
    //   1412: invokespecial <init> : (II)V
    //   1415: aload #5
    //   1417: aload #11
    //   1419: invokevirtual setLayoutParams : (Landroid/view/ViewGroup$LayoutParams;)V
    //   1422: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   1425: pop
    //   1426: aload_0
    //   1427: getfield t : Landroid/widget/RelativeLayout;
    //   1430: iload #8
    //   1432: iload #7
    //   1434: iconst_0
    //   1435: invokestatic c : (Landroid/view/View;IIZ)Landroid/widget/PopupWindow;
    //   1438: astore #5
    //   1440: aload_0
    //   1441: aload #5
    //   1443: putfield s : Landroid/widget/PopupWindow;
    //   1446: aload #5
    //   1448: iconst_1
    //   1449: invokevirtual setOutsideTouchable : (Z)V
    //   1452: aload_0
    //   1453: getfield s : Landroid/widget/PopupWindow;
    //   1456: iconst_1
    //   1457: invokevirtual setTouchable : (Z)V
    //   1460: aload_0
    //   1461: getfield s : Landroid/widget/PopupWindow;
    //   1464: astore #5
    //   1466: aload_0
    //   1467: getfield e : Z
    //   1470: ifne -> 1479
    //   1473: iconst_1
    //   1474: istore #12
    //   1476: goto -> 1482
    //   1479: iconst_0
    //   1480: istore #12
    //   1482: aload #5
    //   1484: iload #12
    //   1486: invokevirtual setClippingEnabled : (Z)V
    //   1489: aload_0
    //   1490: getfield t : Landroid/widget/RelativeLayout;
    //   1493: aload_0
    //   1494: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   1497: invokeinterface getView : ()Landroid/view/View;
    //   1502: iconst_m1
    //   1503: iconst_m1
    //   1504: invokevirtual addView : (Landroid/view/View;II)V
    //   1507: new android/widget/LinearLayout
    //   1510: astore #5
    //   1512: aload #5
    //   1514: aload_0
    //   1515: getfield n : Landroid/app/Activity;
    //   1518: invokespecial <init> : (Landroid/content/Context;)V
    //   1521: aload_0
    //   1522: aload #5
    //   1524: putfield q : Landroid/widget/LinearLayout;
    //   1527: new android/widget/RelativeLayout$LayoutParams
    //   1530: astore #5
    //   1532: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   1535: pop
    //   1536: aload_0
    //   1537: getfield n : Landroid/app/Activity;
    //   1540: bipush #50
    //   1542: invokestatic r : (Landroid/content/Context;I)I
    //   1545: istore_3
    //   1546: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   1549: pop
    //   1550: aload #5
    //   1552: iload_3
    //   1553: aload_0
    //   1554: getfield n : Landroid/app/Activity;
    //   1557: bipush #50
    //   1559: invokestatic r : (Landroid/content/Context;I)I
    //   1562: invokespecial <init> : (II)V
    //   1565: aload_0
    //   1566: getfield d : Ljava/lang/String;
    //   1569: astore #11
    //   1571: aload #11
    //   1573: invokevirtual hashCode : ()I
    //   1576: lookupswitch default -> 1636, -1364013995 -> 1732, -1012429441 -> 1714, -655373719 -> 1696, 1163912186 -> 1678, 1288627767 -> 1660, 1755462605 -> 1642
    //   1636: iload #9
    //   1638: istore_3
    //   1639: goto -> 1747
    //   1642: iload #9
    //   1644: istore_3
    //   1645: aload #11
    //   1647: ldc 'top-center'
    //   1649: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1652: ifeq -> 1747
    //   1655: iconst_1
    //   1656: istore_3
    //   1657: goto -> 1747
    //   1660: iload #9
    //   1662: istore_3
    //   1663: aload #11
    //   1665: ldc 'bottom-center'
    //   1667: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1670: ifeq -> 1747
    //   1673: iconst_4
    //   1674: istore_3
    //   1675: goto -> 1747
    //   1678: iload #9
    //   1680: istore_3
    //   1681: aload #11
    //   1683: ldc 'bottom-right'
    //   1685: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1688: ifeq -> 1747
    //   1691: iconst_5
    //   1692: istore_3
    //   1693: goto -> 1747
    //   1696: iload #9
    //   1698: istore_3
    //   1699: aload #11
    //   1701: ldc 'bottom-left'
    //   1703: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1706: ifeq -> 1747
    //   1709: iconst_3
    //   1710: istore_3
    //   1711: goto -> 1747
    //   1714: iload #9
    //   1716: istore_3
    //   1717: aload #11
    //   1719: ldc 'top-left'
    //   1721: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1724: ifeq -> 1747
    //   1727: iconst_0
    //   1728: istore_3
    //   1729: goto -> 1747
    //   1732: iload #9
    //   1734: istore_3
    //   1735: aload #11
    //   1737: ldc 'center'
    //   1739: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1742: ifeq -> 1747
    //   1745: iconst_2
    //   1746: istore_3
    //   1747: iload_3
    //   1748: ifeq -> 1871
    //   1751: iload_3
    //   1752: iconst_1
    //   1753: if_icmpeq -> 1854
    //   1756: iload_3
    //   1757: iconst_2
    //   1758: if_icmpeq -> 1844
    //   1761: iload_3
    //   1762: iconst_3
    //   1763: if_icmpeq -> 1827
    //   1766: iload_3
    //   1767: iconst_4
    //   1768: if_icmpeq -> 1810
    //   1771: iload_3
    //   1772: iconst_5
    //   1773: if_icmpeq -> 1793
    //   1776: aload #5
    //   1778: bipush #10
    //   1780: invokevirtual addRule : (I)V
    //   1783: aload #5
    //   1785: bipush #11
    //   1787: invokevirtual addRule : (I)V
    //   1790: goto -> 1885
    //   1793: aload #5
    //   1795: bipush #12
    //   1797: invokevirtual addRule : (I)V
    //   1800: aload #5
    //   1802: bipush #11
    //   1804: invokevirtual addRule : (I)V
    //   1807: goto -> 1885
    //   1810: aload #5
    //   1812: bipush #12
    //   1814: invokevirtual addRule : (I)V
    //   1817: aload #5
    //   1819: bipush #14
    //   1821: invokevirtual addRule : (I)V
    //   1824: goto -> 1885
    //   1827: aload #5
    //   1829: bipush #12
    //   1831: invokevirtual addRule : (I)V
    //   1834: aload #5
    //   1836: bipush #9
    //   1838: invokevirtual addRule : (I)V
    //   1841: goto -> 1885
    //   1844: aload #5
    //   1846: bipush #13
    //   1848: invokevirtual addRule : (I)V
    //   1851: goto -> 1885
    //   1854: aload #5
    //   1856: bipush #10
    //   1858: invokevirtual addRule : (I)V
    //   1861: aload #5
    //   1863: bipush #14
    //   1865: invokevirtual addRule : (I)V
    //   1868: goto -> 1885
    //   1871: aload #5
    //   1873: bipush #10
    //   1875: invokevirtual addRule : (I)V
    //   1878: aload #5
    //   1880: bipush #9
    //   1882: invokevirtual addRule : (I)V
    //   1885: aload_0
    //   1886: getfield q : Landroid/widget/LinearLayout;
    //   1889: astore #13
    //   1891: new com/google/android/gms/internal/ads/he
    //   1894: astore #11
    //   1896: aload #11
    //   1898: aload_0
    //   1899: invokespecial <init> : (Lcom/google/android/gms/internal/ads/ee;)V
    //   1902: aload #13
    //   1904: aload #11
    //   1906: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   1909: aload_0
    //   1910: getfield q : Landroid/widget/LinearLayout;
    //   1913: ldc_w 'Close button'
    //   1916: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   1919: aload_0
    //   1920: getfield t : Landroid/widget/RelativeLayout;
    //   1923: aload_0
    //   1924: getfield q : Landroid/widget/LinearLayout;
    //   1927: aload #5
    //   1929: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   1932: aload_0
    //   1933: getfield s : Landroid/widget/PopupWindow;
    //   1936: astore #5
    //   1938: aload #4
    //   1940: invokevirtual getDecorView : ()Landroid/view/View;
    //   1943: astore #4
    //   1945: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   1948: pop
    //   1949: aload_0
    //   1950: getfield n : Landroid/app/Activity;
    //   1953: aload_1
    //   1954: iconst_0
    //   1955: iaload
    //   1956: invokestatic r : (Landroid/content/Context;I)I
    //   1959: istore_3
    //   1960: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   1963: pop
    //   1964: aload #5
    //   1966: aload #4
    //   1968: iconst_0
    //   1969: iload_3
    //   1970: aload_0
    //   1971: getfield n : Landroid/app/Activity;
    //   1974: aload_1
    //   1975: iconst_1
    //   1976: iaload
    //   1977: invokestatic r : (Landroid/content/Context;I)I
    //   1980: invokevirtual showAtLocation : (Landroid/view/View;III)V
    //   1983: aload_1
    //   1984: iconst_0
    //   1985: iaload
    //   1986: istore_3
    //   1987: aload_1
    //   1988: iconst_1
    //   1989: iaload
    //   1990: istore #9
    //   1992: aload_0
    //   1993: getfield r : Lcom/google/android/gms/internal/ads/qe;
    //   1996: astore #4
    //   1998: aload #4
    //   2000: ifnull -> 2021
    //   2003: aload #4
    //   2005: iload_3
    //   2006: iload #9
    //   2008: aload_0
    //   2009: getfield k : I
    //   2012: aload_0
    //   2013: getfield h : I
    //   2016: invokeinterface a : (IIII)V
    //   2021: aload_0
    //   2022: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   2025: iload #8
    //   2027: iload #7
    //   2029: invokestatic j : (II)Lcom/google/android/gms/internal/ads/ks;
    //   2032: invokeinterface P : (Lcom/google/android/gms/internal/ads/ks;)V
    //   2037: aload_1
    //   2038: iconst_0
    //   2039: iaload
    //   2040: istore_3
    //   2041: aload_1
    //   2042: iconst_1
    //   2043: iaload
    //   2044: istore #7
    //   2046: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   2049: pop
    //   2050: aload_0
    //   2051: iload_3
    //   2052: iload #7
    //   2054: aload_0
    //   2055: getfield n : Landroid/app/Activity;
    //   2058: invokestatic j0 : (Landroid/app/Activity;)[I
    //   2061: iconst_0
    //   2062: iaload
    //   2063: isub
    //   2064: aload_0
    //   2065: getfield k : I
    //   2068: aload_0
    //   2069: getfield h : I
    //   2072: invokevirtual b : (IIII)V
    //   2075: aload_0
    //   2076: ldc_w 'resized'
    //   2079: invokevirtual g : (Ljava/lang/String;)V
    //   2082: aload_2
    //   2083: monitorexit
    //   2084: return
    //   2085: astore_1
    //   2086: aload_1
    //   2087: invokevirtual getMessage : ()Ljava/lang/String;
    //   2090: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2093: astore_1
    //   2094: aload_1
    //   2095: invokevirtual length : ()I
    //   2098: ifeq -> 2112
    //   2101: ldc_w 'Cannot show popup window: '
    //   2104: aload_1
    //   2105: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   2108: astore_1
    //   2109: goto -> 2123
    //   2112: new java/lang/String
    //   2115: dup
    //   2116: ldc_w 'Cannot show popup window: '
    //   2119: invokespecial <init> : (Ljava/lang/String;)V
    //   2122: astore_1
    //   2123: aload_0
    //   2124: aload_1
    //   2125: invokevirtual e : (Ljava/lang/String;)V
    //   2128: aload_0
    //   2129: getfield t : Landroid/widget/RelativeLayout;
    //   2132: aload_0
    //   2133: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   2136: invokeinterface getView : ()Landroid/view/View;
    //   2141: invokevirtual removeView : (Landroid/view/View;)V
    //   2144: aload_0
    //   2145: getfield u : Landroid/view/ViewGroup;
    //   2148: astore_1
    //   2149: aload_1
    //   2150: ifnull -> 2190
    //   2153: aload_1
    //   2154: aload_0
    //   2155: getfield p : Landroid/widget/ImageView;
    //   2158: invokevirtual removeView : (Landroid/view/View;)V
    //   2161: aload_0
    //   2162: getfield u : Landroid/view/ViewGroup;
    //   2165: aload_0
    //   2166: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   2169: invokeinterface getView : ()Landroid/view/View;
    //   2174: invokevirtual addView : (Landroid/view/View;)V
    //   2177: aload_0
    //   2178: getfield m : Lcom/google/android/gms/internal/ads/tq;
    //   2181: aload_0
    //   2182: getfield o : Lcom/google/android/gms/internal/ads/ks;
    //   2185: invokeinterface P : (Lcom/google/android/gms/internal/ads/ks;)V
    //   2190: aload_2
    //   2191: monitorexit
    //   2192: return
    //   2193: aload_0
    //   2194: ldc_w 'Webview is detached, probably in the middle of a resize or expand.'
    //   2197: invokevirtual e : (Ljava/lang/String;)V
    //   2200: aload_2
    //   2201: monitorexit
    //   2202: return
    //   2203: aload_0
    //   2204: ldc_w 'Activity context is not ready, cannot get window or decor view.'
    //   2207: invokevirtual e : (Ljava/lang/String;)V
    //   2210: aload_2
    //   2211: monitorexit
    //   2212: return
    //   2213: astore_1
    //   2214: aload_2
    //   2215: monitorexit
    //   2216: aload_1
    //   2217: athrow
    // Exception table:
    //   from	to	target	type
    //   7	22	2213	finally
    //   23	43	2213	finally
    //   44	67	2213	finally
    //   68	88	2213	finally
    //   89	128	2213	finally
    //   128	167	2213	finally
    //   167	206	2213	finally
    //   206	245	2213	finally
    //   245	280	2213	finally
    //   280	304	2213	finally
    //   304	318	2213	finally
    //   329	337	2213	finally
    //   338	347	2213	finally
    //   352	360	2213	finally
    //   363	388	2213	finally
    //   400	406	2213	finally
    //   426	431	2213	finally
    //   459	464	2213	finally
    //   467	544	2213	finally
    //   547	557	2213	finally
    //   562	572	2213	finally
    //   577	587	2213	finally
    //   592	602	2213	finally
    //   607	617	2213	finally
    //   622	632	2213	finally
    //   668	698	2213	finally
    //   701	736	2213	finally
    //   739	776	2213	finally
    //   779	806	2213	finally
    //   819	860	2213	finally
    //   863	895	2213	finally
    //   898	920	2213	finally
    //   967	973	2213	finally
    //   976	982	2213	finally
    //   993	1028	2213	finally
    //   1031	1056	2213	finally
    //   1061	1083	2213	finally
    //   1093	1099	2213	finally
    //   1136	1142	2213	finally
    //   1167	1171	2213	finally
    //   1184	1193	2213	finally
    //   1194	1242	2213	finally
    //   1247	1278	2213	finally
    //   1283	1361	2213	finally
    //   1364	1369	2213	finally
    //   1369	1473	2213	finally
    //   1482	1636	2213	finally
    //   1645	1655	2213	finally
    //   1663	1673	2213	finally
    //   1681	1691	2213	finally
    //   1699	1709	2213	finally
    //   1717	1727	2213	finally
    //   1735	1745	2213	finally
    //   1776	1790	2213	finally
    //   1793	1807	2213	finally
    //   1810	1824	2213	finally
    //   1827	1841	2213	finally
    //   1844	1851	2213	finally
    //   1854	1868	2213	finally
    //   1871	1885	2213	finally
    //   1885	1932	2213	finally
    //   1932	1983	2085	java/lang/RuntimeException
    //   1932	1983	2213	finally
    //   1992	1998	2213	finally
    //   2003	2021	2213	finally
    //   2021	2037	2213	finally
    //   2046	2084	2213	finally
    //   2086	2109	2213	finally
    //   2112	2123	2213	finally
    //   2123	2149	2213	finally
    //   2153	2190	2213	finally
    //   2190	2192	2213	finally
    //   2193	2202	2213	finally
    //   2203	2212	2213	finally
    //   2214	2216	2213	finally
  }
  
  public final void k(int paramInt1, int paramInt2) {
    this.f = paramInt1;
    this.g = paramInt2;
  }
  
  public final boolean l() {
    synchronized (this.l) {
      boolean bool;
      if (this.s != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */