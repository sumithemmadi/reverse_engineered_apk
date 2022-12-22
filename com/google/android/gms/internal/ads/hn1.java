package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hn1 {
  private final vy0 a;
  
  private final String b;
  
  private final String c;
  
  private final String d;
  
  private final Context e;
  
  private final bi1 f;
  
  private final e g;
  
  private final p12 h;
  
  public hn1(vy0 paramvy0, zzazn paramzzazn, String paramString1, String paramString2, Context paramContext, bi1 parambi1, e parame, p12 paramp12) {
    this.a = paramvy0;
    this.b = paramzzazn.b;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramContext;
    this.f = parambi1;
    this.g = parame;
    this.h = paramp12;
  }
  
  public static List<String> a(int paramInt1, int paramInt2, List<String> paramList) {
    ArrayList<String> arrayList = new ArrayList();
    for (String str : paramList) {
      StringBuilder stringBuilder = new StringBuilder(23);
      stringBuilder.append(2);
      stringBuilder.append(".");
      stringBuilder.append(paramInt2);
      arrayList.add(e(str, "@gw_mpe@", stringBuilder.toString()));
    } 
    return arrayList;
  }
  
  private static String e(String paramString1, String paramString2, String paramString3) {
    String str = paramString3;
    if (TextUtils.isEmpty(paramString3))
      str = ""; 
    return paramString1.replaceAll(paramString2, str);
  }
  
  private static String f(String paramString) {
    String str = paramString;
    if (!TextUtils.isEmpty(paramString)) {
      str = paramString;
      if (wl.a())
        str = "fakeForAdDebugLog"; 
    } 
    return str;
  }
  
  public final List<String> b(nh1 paramnh1, List<String> paramList, kh paramkh) {
    ArrayList<String> arrayList = new ArrayList();
    long l = this.g.a();
    try {
      String str1;
      String str2 = paramkh.l();
      String str3 = Integer.toString(paramkh.P());
      bi1 bi11 = this.f;
      String str4 = "";
      if (bi11 == null) {
        str1 = "";
      } else {
        str1 = f(((bi1)str1).a);
      } 
      bi1 bi12 = this.f;
      if (bi12 != null)
        str4 = f(bi12.b); 
      Iterator<String> iterator = paramList.iterator();
      while (iterator.hasNext())
        arrayList.add(qk.d(e(e(e(e(e(e(iterator.next(), "@gw_rwd_userid@", Uri.encode(str1)), "@gw_rwd_custom_data@", Uri.encode(str4)), "@gw_tmstmp@", Long.toString(l)), "@gw_rwd_itm@", Uri.encode(str2)), "@gw_rwd_amt@", str3), "@gw_sdkver@", this.b), this.e, paramnh1.Q)); 
      return arrayList;
    } catch (RemoteException remoteException) {
      cm.c("Unable to determine award type and amount.", (Throwable)remoteException);
      return arrayList;
    } 
  }
  
  public final List<String> c(ci1 paramci1, nh1 paramnh1, List<String> paramList) {
    return d(paramci1, paramnh1, false, "", "", paramList);
  }
  
  public final List<String> d(ci1 paramci1, nh1 paramnh1, boolean paramBoolean, String paramString1, String paramString2, List<String> paramList) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #7
    //   9: iload_3
    //   10: ifeq -> 20
    //   13: ldc '1'
    //   15: astore #8
    //   17: goto -> 24
    //   20: ldc '0'
    //   22: astore #8
    //   24: aload #6
    //   26: invokeinterface iterator : ()Ljava/util/Iterator;
    //   31: astore #9
    //   33: aload #9
    //   35: invokeinterface hasNext : ()Z
    //   40: ifeq -> 330
    //   43: aload #9
    //   45: invokeinterface next : ()Ljava/lang/Object;
    //   50: checkcast java/lang/String
    //   53: ldc '@gw_adlocid@'
    //   55: aload_1
    //   56: getfield a : Lcom/google/android/gms/internal/ads/xh1;
    //   59: getfield a : Lcom/google/android/gms/internal/ads/gi1;
    //   62: getfield f : Ljava/lang/String;
    //   65: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   68: ldc '@gw_adnetrefresh@'
    //   70: aload #8
    //   72: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   75: ldc '@gw_sdkver@'
    //   77: aload_0
    //   78: getfield b : Ljava/lang/String;
    //   81: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   84: astore #10
    //   86: aload #10
    //   88: astore #6
    //   90: aload_2
    //   91: ifnull -> 136
    //   94: aload #10
    //   96: ldc '@gw_qdata@'
    //   98: aload_2
    //   99: getfield x : Ljava/lang/String;
    //   102: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   105: ldc '@gw_adnetid@'
    //   107: aload_2
    //   108: getfield w : Ljava/lang/String;
    //   111: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   114: ldc '@gw_allocid@'
    //   116: aload_2
    //   117: getfield v : Ljava/lang/String;
    //   120: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   123: aload_0
    //   124: getfield e : Landroid/content/Context;
    //   127: aload_2
    //   128: getfield Q : Z
    //   131: invokestatic d : (Ljava/lang/String;Landroid/content/Context;Z)Ljava/lang/String;
    //   134: astore #6
    //   136: aload #6
    //   138: ldc '@gw_adnetstatus@'
    //   140: aload_0
    //   141: getfield a : Lcom/google/android/gms/internal/ads/vy0;
    //   144: invokevirtual e : ()Ljava/lang/String;
    //   147: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   150: ldc '@gw_seqnum@'
    //   152: aload_0
    //   153: getfield c : Ljava/lang/String;
    //   156: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   159: ldc '@gw_sessid@'
    //   161: aload_0
    //   162: getfield d : Ljava/lang/String;
    //   165: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   168: astore #10
    //   170: getstatic com/google/android/gms/internal/ads/m0.h2 : Lcom/google/android/gms/internal/ads/x;
    //   173: astore #6
    //   175: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   178: aload #6
    //   180: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   183: checkcast java/lang/Boolean
    //   186: invokevirtual booleanValue : ()Z
    //   189: ifeq -> 206
    //   192: aload #4
    //   194: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   197: ifne -> 206
    //   200: iconst_1
    //   201: istore #11
    //   203: goto -> 209
    //   206: iconst_0
    //   207: istore #11
    //   209: iconst_1
    //   210: aload #5
    //   212: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   215: ixor
    //   216: istore #12
    //   218: iload #11
    //   220: ifne -> 232
    //   223: aload #10
    //   225: astore #6
    //   227: iload #12
    //   229: ifeq -> 317
    //   232: aload #10
    //   234: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   237: astore #13
    //   239: aload #10
    //   241: astore #6
    //   243: aload_0
    //   244: getfield h : Lcom/google/android/gms/internal/ads/p12;
    //   247: aload #13
    //   249: invokevirtual f : (Landroid/net/Uri;)Z
    //   252: ifeq -> 317
    //   255: aload #10
    //   257: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   260: invokevirtual buildUpon : ()Landroid/net/Uri$Builder;
    //   263: astore #10
    //   265: aload #10
    //   267: astore #6
    //   269: iload #11
    //   271: ifeq -> 286
    //   274: aload #10
    //   276: ldc_w 'ms'
    //   279: aload #4
    //   281: invokevirtual appendQueryParameter : (Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   284: astore #6
    //   286: aload #6
    //   288: astore #10
    //   290: iload #12
    //   292: ifeq -> 307
    //   295: aload #6
    //   297: ldc_w 'attok'
    //   300: aload #5
    //   302: invokevirtual appendQueryParameter : (Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   305: astore #10
    //   307: aload #10
    //   309: invokevirtual build : ()Landroid/net/Uri;
    //   312: invokevirtual toString : ()Ljava/lang/String;
    //   315: astore #6
    //   317: aload #7
    //   319: aload #6
    //   321: invokeinterface add : (Ljava/lang/Object;)Z
    //   326: pop
    //   327: goto -> 33
    //   330: aload #7
    //   332: areturn
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */