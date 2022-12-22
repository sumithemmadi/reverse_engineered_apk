package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.a0;
import com.google.android.gms.ads.f;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class zzvs extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzvs> CREATOR = new mq2();
  
  public final String b;
  
  public final int c;
  
  public final int d;
  
  public final boolean e;
  
  public final int f;
  
  public final int g;
  
  public final zzvs[] h;
  
  public final boolean i;
  
  public final boolean j;
  
  public boolean k;
  
  public boolean l;
  
  private boolean m;
  
  public boolean n;
  
  public boolean o;
  
  public zzvs() {
    this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
  }
  
  public zzvs(Context paramContext, f paramf) {
    this(paramContext, new f[] { paramf });
  }
  
  public zzvs(Context paramContext, f[] paramArrayOff) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_2
    //   5: iconst_0
    //   6: aaload
    //   7: astore_3
    //   8: aload_0
    //   9: iconst_0
    //   10: putfield e : Z
    //   13: aload_3
    //   14: invokevirtual e : ()Z
    //   17: istore #4
    //   19: aload_0
    //   20: iload #4
    //   22: putfield j : Z
    //   25: aload_0
    //   26: aload_3
    //   27: invokestatic c : (Lcom/google/android/gms/ads/f;)Z
    //   30: putfield n : Z
    //   33: aload_3
    //   34: invokestatic d : (Lcom/google/android/gms/ads/f;)Z
    //   37: istore #5
    //   39: aload_0
    //   40: iload #5
    //   42: putfield o : Z
    //   45: iload #4
    //   47: ifeq -> 76
    //   50: getstatic com/google/android/gms/ads/f.a : Lcom/google/android/gms/ads/f;
    //   53: astore #6
    //   55: aload_0
    //   56: aload #6
    //   58: invokevirtual c : ()I
    //   61: putfield f : I
    //   64: aload_0
    //   65: aload #6
    //   67: invokevirtual a : ()I
    //   70: putfield c : I
    //   73: goto -> 116
    //   76: iload #5
    //   78: ifeq -> 100
    //   81: aload_0
    //   82: aload_3
    //   83: invokevirtual c : ()I
    //   86: putfield f : I
    //   89: aload_0
    //   90: aload_3
    //   91: invokestatic e : (Lcom/google/android/gms/ads/f;)I
    //   94: putfield c : I
    //   97: goto -> 116
    //   100: aload_0
    //   101: aload_3
    //   102: invokevirtual c : ()I
    //   105: putfield f : I
    //   108: aload_0
    //   109: aload_3
    //   110: invokevirtual a : ()I
    //   113: putfield c : I
    //   116: aload_0
    //   117: getfield f : I
    //   120: iconst_m1
    //   121: if_icmpne -> 130
    //   124: iconst_1
    //   125: istore #7
    //   127: goto -> 133
    //   130: iconst_0
    //   131: istore #7
    //   133: aload_0
    //   134: getfield c : I
    //   137: bipush #-2
    //   139: if_icmpne -> 148
    //   142: iconst_1
    //   143: istore #8
    //   145: goto -> 151
    //   148: iconst_0
    //   149: istore #8
    //   151: aload_1
    //   152: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   155: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   158: astore #6
    //   160: iload #7
    //   162: ifeq -> 282
    //   165: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   168: pop
    //   169: aload_1
    //   170: invokestatic m : (Landroid/content/Context;)Z
    //   173: ifeq -> 212
    //   176: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   179: pop
    //   180: aload_1
    //   181: invokestatic n : (Landroid/content/Context;)Z
    //   184: ifeq -> 212
    //   187: aload #6
    //   189: getfield widthPixels : I
    //   192: istore #9
    //   194: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   197: pop
    //   198: aload_0
    //   199: iload #9
    //   201: aload_1
    //   202: invokestatic o : (Landroid/content/Context;)I
    //   205: isub
    //   206: putfield g : I
    //   209: goto -> 221
    //   212: aload_0
    //   213: aload #6
    //   215: getfield widthPixels : I
    //   218: putfield g : I
    //   221: aload_0
    //   222: getfield g : I
    //   225: i2f
    //   226: aload #6
    //   228: getfield density : F
    //   231: fdiv
    //   232: f2d
    //   233: dstore #10
    //   235: dload #10
    //   237: d2i
    //   238: istore #12
    //   240: iload #12
    //   242: i2d
    //   243: dstore #13
    //   245: dload #10
    //   247: invokestatic isNaN : (D)Z
    //   250: pop
    //   251: dload #13
    //   253: invokestatic isNaN : (D)Z
    //   256: pop
    //   257: iload #12
    //   259: istore #9
    //   261: dload #10
    //   263: dload #13
    //   265: dsub
    //   266: ldc2_w 0.01
    //   269: dcmpl
    //   270: iflt -> 305
    //   273: iload #12
    //   275: iconst_1
    //   276: iadd
    //   277: istore #9
    //   279: goto -> 305
    //   282: aload_0
    //   283: getfield f : I
    //   286: istore #9
    //   288: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   291: pop
    //   292: aload_0
    //   293: aload #6
    //   295: aload_0
    //   296: getfield f : I
    //   299: invokestatic a : (Landroid/util/DisplayMetrics;I)I
    //   302: putfield g : I
    //   305: iload #8
    //   307: ifeq -> 320
    //   310: aload #6
    //   312: invokestatic q0 : (Landroid/util/DisplayMetrics;)I
    //   315: istore #12
    //   317: goto -> 326
    //   320: aload_0
    //   321: getfield c : I
    //   324: istore #12
    //   326: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   329: pop
    //   330: aload_0
    //   331: aload #6
    //   333: iload #12
    //   335: invokestatic a : (Landroid/util/DisplayMetrics;I)I
    //   338: putfield d : I
    //   341: iload #7
    //   343: ifne -> 447
    //   346: iload #8
    //   348: ifeq -> 354
    //   351: goto -> 447
    //   354: aload_0
    //   355: getfield o : Z
    //   358: ifeq -> 422
    //   361: aload_0
    //   362: getfield f : I
    //   365: istore #9
    //   367: aload_0
    //   368: getfield c : I
    //   371: istore #7
    //   373: new java/lang/StringBuilder
    //   376: dup
    //   377: bipush #26
    //   379: invokespecial <init> : (I)V
    //   382: astore_3
    //   383: aload_3
    //   384: iload #9
    //   386: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   389: pop
    //   390: aload_3
    //   391: ldc 'x'
    //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: pop
    //   397: aload_3
    //   398: iload #7
    //   400: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   403: pop
    //   404: aload_3
    //   405: ldc '_as'
    //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: pop
    //   411: aload_0
    //   412: aload_3
    //   413: invokevirtual toString : ()Ljava/lang/String;
    //   416: putfield b : Ljava/lang/String;
    //   419: goto -> 493
    //   422: iload #4
    //   424: ifeq -> 436
    //   427: aload_0
    //   428: ldc '320x50_mb'
    //   430: putfield b : Ljava/lang/String;
    //   433: goto -> 493
    //   436: aload_0
    //   437: aload_3
    //   438: invokevirtual toString : ()Ljava/lang/String;
    //   441: putfield b : Ljava/lang/String;
    //   444: goto -> 493
    //   447: new java/lang/StringBuilder
    //   450: dup
    //   451: bipush #26
    //   453: invokespecial <init> : (I)V
    //   456: astore_3
    //   457: aload_3
    //   458: iload #9
    //   460: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   463: pop
    //   464: aload_3
    //   465: ldc 'x'
    //   467: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: pop
    //   471: aload_3
    //   472: iload #12
    //   474: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: aload_3
    //   479: ldc '_as'
    //   481: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: pop
    //   485: aload_0
    //   486: aload_3
    //   487: invokevirtual toString : ()Ljava/lang/String;
    //   490: putfield b : Ljava/lang/String;
    //   493: aload_2
    //   494: arraylength
    //   495: iconst_1
    //   496: if_icmple -> 543
    //   499: aload_0
    //   500: aload_2
    //   501: arraylength
    //   502: anewarray com/google/android/gms/internal/ads/zzvs
    //   505: putfield h : [Lcom/google/android/gms/internal/ads/zzvs;
    //   508: iconst_0
    //   509: istore #9
    //   511: iload #9
    //   513: aload_2
    //   514: arraylength
    //   515: if_icmpge -> 548
    //   518: aload_0
    //   519: getfield h : [Lcom/google/android/gms/internal/ads/zzvs;
    //   522: iload #9
    //   524: new com/google/android/gms/internal/ads/zzvs
    //   527: dup
    //   528: aload_1
    //   529: aload_2
    //   530: iload #9
    //   532: aaload
    //   533: invokespecial <init> : (Landroid/content/Context;Lcom/google/android/gms/ads/f;)V
    //   536: aastore
    //   537: iinc #9, 1
    //   540: goto -> 511
    //   543: aload_0
    //   544: aconst_null
    //   545: putfield h : [Lcom/google/android/gms/internal/ads/zzvs;
    //   548: aload_0
    //   549: iconst_0
    //   550: putfield i : Z
    //   553: aload_0
    //   554: iconst_0
    //   555: putfield k : Z
    //   558: return
  }
  
  zzvs(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, int paramInt4, zzvs[] paramArrayOfzzvs, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8) {
    this.b = paramString;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramBoolean1;
    this.f = paramInt3;
    this.g = paramInt4;
    this.h = paramArrayOfzzvs;
    this.i = paramBoolean2;
    this.j = paramBoolean3;
    this.k = paramBoolean4;
    this.l = paramBoolean5;
    this.m = paramBoolean6;
    this.n = paramBoolean7;
    this.o = paramBoolean8;
  }
  
  public static int o0(DisplayMetrics paramDisplayMetrics) {
    return paramDisplayMetrics.widthPixels;
  }
  
  public static int p0(DisplayMetrics paramDisplayMetrics) {
    return (int)(q0(paramDisplayMetrics) * paramDisplayMetrics.density);
  }
  
  private static int q0(DisplayMetrics paramDisplayMetrics) {
    int i = (int)(paramDisplayMetrics.heightPixels / paramDisplayMetrics.density);
    return (i <= 400) ? 32 : ((i <= 720) ? 50 : 90);
  }
  
  public static zzvs r0() {
    return new zzvs("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false);
  }
  
  public static zzvs s0() {
    return new zzvs("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
  }
  
  public static zzvs t0() {
    return new zzvs("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false);
  }
  
  public static zzvs u0() {
    return new zzvs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false);
  }
  
  public final f v0() {
    return a0.b(this.f, this.c, this.b);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.r(paramParcel, 2, this.b, false);
    a.k(paramParcel, 3, this.c);
    a.k(paramParcel, 4, this.d);
    a.c(paramParcel, 5, this.e);
    a.k(paramParcel, 6, this.f);
    a.k(paramParcel, 7, this.g);
    a.u(paramParcel, 8, (Parcelable[])this.h, paramInt, false);
    a.c(paramParcel, 9, this.i);
    a.c(paramParcel, 10, this.j);
    a.c(paramParcel, 11, this.k);
    a.c(paramParcel, 12, this.l);
    a.c(paramParcel, 13, this.m);
    a.c(paramParcel, 14, this.n);
    a.c(paramParcel, 15, this.o);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzvs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */