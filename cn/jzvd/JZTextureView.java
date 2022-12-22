package cn.jzvd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;

public class JZTextureView extends TextureView {
  public int b = 0;
  
  public int c = 0;
  
  public JZTextureView(Context paramContext) {
    super(paramContext);
    this.b = 0;
    this.c = 0;
  }
  
  public JZTextureView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.b = 0;
    this.c = 0;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: aload_3
    //   9: ldc 'onMeasure  ['
    //   11: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: pop
    //   15: aload_3
    //   16: aload_0
    //   17: invokevirtual hashCode : ()I
    //   20: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload_3
    //   25: ldc '] '
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: ldc 'JZResizeTextureView'
    //   33: aload_3
    //   34: invokevirtual toString : ()Ljava/lang/String;
    //   37: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   40: pop
    //   41: aload_0
    //   42: invokevirtual getRotation : ()F
    //   45: f2i
    //   46: istore #4
    //   48: aload_0
    //   49: getfield b : I
    //   52: istore #5
    //   54: aload_0
    //   55: getfield c : I
    //   58: istore #6
    //   60: aload_0
    //   61: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   64: checkcast android/view/View
    //   67: invokevirtual getMeasuredHeight : ()I
    //   70: istore #7
    //   72: aload_0
    //   73: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   76: checkcast android/view/View
    //   79: invokevirtual getMeasuredWidth : ()I
    //   82: istore #8
    //   84: iload #6
    //   86: istore #9
    //   88: iload #7
    //   90: istore #10
    //   92: iload #8
    //   94: istore #11
    //   96: iload #8
    //   98: ifeq -> 212
    //   101: iload #6
    //   103: istore #9
    //   105: iload #7
    //   107: istore #10
    //   109: iload #8
    //   111: istore #11
    //   113: iload #7
    //   115: ifeq -> 212
    //   118: iload #6
    //   120: istore #9
    //   122: iload #7
    //   124: istore #10
    //   126: iload #8
    //   128: istore #11
    //   130: iload #5
    //   132: ifeq -> 212
    //   135: iload #6
    //   137: istore #9
    //   139: iload #7
    //   141: istore #10
    //   143: iload #8
    //   145: istore #11
    //   147: iload #6
    //   149: ifeq -> 212
    //   152: iload #6
    //   154: istore #9
    //   156: iload #7
    //   158: istore #10
    //   160: iload #8
    //   162: istore #11
    //   164: getstatic cn/jzvd/Jzvd.i : I
    //   167: iconst_1
    //   168: if_icmpne -> 212
    //   171: iload #4
    //   173: bipush #90
    //   175: if_icmpeq -> 194
    //   178: iload #7
    //   180: istore #10
    //   182: iload #8
    //   184: istore #11
    //   186: iload #4
    //   188: sipush #270
    //   191: if_icmpne -> 202
    //   194: iload #7
    //   196: istore #11
    //   198: iload #8
    //   200: istore #10
    //   202: iload #5
    //   204: iload #10
    //   206: imul
    //   207: iload #11
    //   209: idiv
    //   210: istore #9
    //   212: iload #4
    //   214: bipush #90
    //   216: if_icmpeq -> 239
    //   219: iload #4
    //   221: sipush #270
    //   224: if_icmpne -> 230
    //   227: goto -> 239
    //   230: iload_1
    //   231: istore #7
    //   233: iload_2
    //   234: istore #8
    //   236: goto -> 245
    //   239: iload_1
    //   240: istore #8
    //   242: iload_2
    //   243: istore #7
    //   245: iload #5
    //   247: iload #7
    //   249: invokestatic getDefaultSize : (II)I
    //   252: istore #12
    //   254: iload #9
    //   256: iload #8
    //   258: invokestatic getDefaultSize : (II)I
    //   261: istore #6
    //   263: iload #12
    //   265: istore_1
    //   266: iload #6
    //   268: istore_2
    //   269: iload #5
    //   271: ifle -> 644
    //   274: iload #12
    //   276: istore_1
    //   277: iload #6
    //   279: istore_2
    //   280: iload #9
    //   282: ifle -> 644
    //   285: iload #7
    //   287: invokestatic getMode : (I)I
    //   290: istore #12
    //   292: iload #7
    //   294: invokestatic getSize : (I)I
    //   297: istore #6
    //   299: iload #8
    //   301: invokestatic getMode : (I)I
    //   304: istore #13
    //   306: iload #8
    //   308: invokestatic getSize : (I)I
    //   311: istore_2
    //   312: new java/lang/StringBuilder
    //   315: dup
    //   316: invokespecial <init> : ()V
    //   319: astore_3
    //   320: aload_3
    //   321: ldc 'widthMeasureSpec  ['
    //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: pop
    //   327: aload_3
    //   328: iload #7
    //   330: invokestatic toString : (I)Ljava/lang/String;
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: pop
    //   337: aload_3
    //   338: ldc ']'
    //   340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: ldc 'JZResizeTextureView'
    //   346: aload_3
    //   347: invokevirtual toString : ()Ljava/lang/String;
    //   350: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   353: pop
    //   354: new java/lang/StringBuilder
    //   357: dup
    //   358: invokespecial <init> : ()V
    //   361: astore_3
    //   362: aload_3
    //   363: ldc 'heightMeasureSpec ['
    //   365: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: pop
    //   369: aload_3
    //   370: iload #8
    //   372: invokestatic toString : (I)Ljava/lang/String;
    //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: pop
    //   379: aload_3
    //   380: ldc ']'
    //   382: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: pop
    //   386: ldc 'JZResizeTextureView'
    //   388: aload_3
    //   389: invokevirtual toString : ()Ljava/lang/String;
    //   392: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   395: pop
    //   396: iload #12
    //   398: ldc 1073741824
    //   400: if_icmpne -> 457
    //   403: iload #13
    //   405: ldc 1073741824
    //   407: if_icmpne -> 457
    //   410: iload #5
    //   412: iload_2
    //   413: imul
    //   414: istore_1
    //   415: iload #6
    //   417: iload #9
    //   419: imul
    //   420: istore #8
    //   422: iload_1
    //   423: iload #8
    //   425: if_icmpge -> 436
    //   428: iload_1
    //   429: iload #9
    //   431: idiv
    //   432: istore_1
    //   433: goto -> 571
    //   436: iload_1
    //   437: iload #8
    //   439: if_icmple -> 451
    //   442: iload #8
    //   444: iload #5
    //   446: idiv
    //   447: istore_1
    //   448: goto -> 504
    //   451: iload #6
    //   453: istore_1
    //   454: goto -> 571
    //   457: iload #12
    //   459: ldc 1073741824
    //   461: if_icmpne -> 512
    //   464: iload #6
    //   466: iload #9
    //   468: imul
    //   469: iload #5
    //   471: idiv
    //   472: istore #8
    //   474: iload #8
    //   476: istore_1
    //   477: iload #13
    //   479: ldc -2147483648
    //   481: if_icmpne -> 504
    //   484: iload #8
    //   486: istore_1
    //   487: iload #8
    //   489: iload_2
    //   490: if_icmple -> 504
    //   493: iload_2
    //   494: iload #5
    //   496: imul
    //   497: iload #9
    //   499: idiv
    //   500: istore_1
    //   501: goto -> 571
    //   504: iload_1
    //   505: istore_2
    //   506: iload #6
    //   508: istore_1
    //   509: goto -> 644
    //   512: iload #13
    //   514: ldc 1073741824
    //   516: if_icmpne -> 574
    //   519: iload_2
    //   520: iload #5
    //   522: imul
    //   523: iload #9
    //   525: idiv
    //   526: istore #7
    //   528: iload #7
    //   530: istore #8
    //   532: iload_2
    //   533: istore_1
    //   534: iload #12
    //   536: ldc -2147483648
    //   538: if_icmpne -> 566
    //   541: iload #7
    //   543: istore #8
    //   545: iload_2
    //   546: istore_1
    //   547: iload #7
    //   549: iload #6
    //   551: if_icmple -> 566
    //   554: iload #6
    //   556: iload #9
    //   558: imul
    //   559: iload #5
    //   561: idiv
    //   562: istore_1
    //   563: goto -> 504
    //   566: iload_1
    //   567: istore_2
    //   568: iload #8
    //   570: istore_1
    //   571: goto -> 644
    //   574: iload #13
    //   576: ldc -2147483648
    //   578: if_icmpne -> 599
    //   581: iload #9
    //   583: iload_2
    //   584: if_icmple -> 599
    //   587: iload_2
    //   588: iload #5
    //   590: imul
    //   591: iload #9
    //   593: idiv
    //   594: istore #7
    //   596: goto -> 606
    //   599: iload #5
    //   601: istore #7
    //   603: iload #9
    //   605: istore_2
    //   606: iload #7
    //   608: istore #8
    //   610: iload_2
    //   611: istore_1
    //   612: iload #12
    //   614: ldc -2147483648
    //   616: if_icmpne -> 566
    //   619: iload #7
    //   621: istore #8
    //   623: iload_2
    //   624: istore_1
    //   625: iload #7
    //   627: iload #6
    //   629: if_icmple -> 566
    //   632: iload #6
    //   634: iload #9
    //   636: imul
    //   637: iload #5
    //   639: idiv
    //   640: istore_1
    //   641: goto -> 504
    //   644: iload #11
    //   646: ifeq -> 886
    //   649: iload #10
    //   651: ifeq -> 886
    //   654: iload #5
    //   656: ifeq -> 886
    //   659: iload #9
    //   661: ifeq -> 886
    //   664: getstatic cn/jzvd/Jzvd.i : I
    //   667: istore #8
    //   669: iload #8
    //   671: iconst_3
    //   672: if_icmpne -> 681
    //   675: iload #5
    //   677: istore_1
    //   678: goto -> 889
    //   681: iload #8
    //   683: iconst_2
    //   684: if_icmpne -> 886
    //   687: iload #4
    //   689: bipush #90
    //   691: if_icmpeq -> 710
    //   694: iload #10
    //   696: istore #7
    //   698: iload #11
    //   700: istore #8
    //   702: iload #4
    //   704: sipush #270
    //   707: if_icmpne -> 718
    //   710: iload #10
    //   712: istore #8
    //   714: iload #11
    //   716: istore #7
    //   718: iload #9
    //   720: i2d
    //   721: dstore #14
    //   723: iload #5
    //   725: i2d
    //   726: dstore #16
    //   728: dload #14
    //   730: invokestatic isNaN : (D)Z
    //   733: pop
    //   734: dload #16
    //   736: invokestatic isNaN : (D)Z
    //   739: pop
    //   740: dload #14
    //   742: dload #16
    //   744: ddiv
    //   745: dstore #18
    //   747: iload #7
    //   749: i2d
    //   750: dstore #14
    //   752: iload #8
    //   754: i2d
    //   755: dstore #16
    //   757: dload #14
    //   759: invokestatic isNaN : (D)Z
    //   762: pop
    //   763: dload #16
    //   765: invokestatic isNaN : (D)Z
    //   768: pop
    //   769: dload #14
    //   771: dload #16
    //   773: ddiv
    //   774: dstore #20
    //   776: dload #18
    //   778: dload #20
    //   780: dcmpl
    //   781: ifle -> 831
    //   784: iload_1
    //   785: i2d
    //   786: dstore #14
    //   788: dload #16
    //   790: invokestatic isNaN : (D)Z
    //   793: pop
    //   794: dload #14
    //   796: invokestatic isNaN : (D)Z
    //   799: pop
    //   800: dload #16
    //   802: dload #14
    //   804: ddiv
    //   805: dstore #14
    //   807: iload_2
    //   808: i2d
    //   809: dstore #16
    //   811: dload #16
    //   813: invokestatic isNaN : (D)Z
    //   816: pop
    //   817: dload #14
    //   819: dload #16
    //   821: dmul
    //   822: d2i
    //   823: istore #9
    //   825: iload #8
    //   827: istore_1
    //   828: goto -> 889
    //   831: dload #18
    //   833: dload #20
    //   835: dcmpg
    //   836: ifge -> 886
    //   839: iload_2
    //   840: i2d
    //   841: dstore #16
    //   843: dload #14
    //   845: invokestatic isNaN : (D)Z
    //   848: pop
    //   849: dload #16
    //   851: invokestatic isNaN : (D)Z
    //   854: pop
    //   855: dload #14
    //   857: dload #16
    //   859: ddiv
    //   860: dstore #16
    //   862: iload_1
    //   863: i2d
    //   864: dstore #14
    //   866: dload #14
    //   868: invokestatic isNaN : (D)Z
    //   871: pop
    //   872: dload #16
    //   874: dload #14
    //   876: dmul
    //   877: d2i
    //   878: istore_1
    //   879: iload #7
    //   881: istore #9
    //   883: goto -> 889
    //   886: iload_2
    //   887: istore #9
    //   889: aload_0
    //   890: iload_1
    //   891: iload #9
    //   893: invokevirtual setMeasuredDimension : (II)V
    //   896: return
  }
  
  public void setRotation(float paramFloat) {
    if (paramFloat != getRotation()) {
      super.setRotation(paramFloat);
      requestLayout();
    } 
  }
  
  public void setVideoSize(int paramInt1, int paramInt2) {
    if (this.b != paramInt1 || this.c != paramInt2) {
      this.b = paramInt1;
      this.c = paramInt2;
      requestLayout();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/cn/jzvd/JZTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */