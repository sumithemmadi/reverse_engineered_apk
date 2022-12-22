package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.fm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class e {
  private final Context a;
  
  private String b;
  
  private String c;
  
  private String d;
  
  private String e;
  
  private int f = 0;
  
  private int g;
  
  private PointF h;
  
  private PointF i;
  
  private Handler j;
  
  private Runnable k = new h(this);
  
  public e(Context paramContext) {
    this.a = paramContext;
    this.g = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    q.q().b();
    this.j = q.q().a();
  }
  
  public e(Context paramContext, String paramString) {
    this(paramContext);
    this.b = paramString;
  }
  
  private static int c(List<String> paramList, String paramString, boolean paramBoolean) {
    paramList.add(paramString);
    return paramList.size() - 1;
  }
  
  private final boolean f(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    return (Math.abs(this.h.x - paramFloat1) < this.g && Math.abs(this.h.y - paramFloat2) < this.g && Math.abs(this.i.x - paramFloat3) < this.g && Math.abs(this.i.y - paramFloat4) < this.g);
  }
  
  public final void a(String paramString) {
    this.c = paramString;
  }
  
  public final void b() {
    try {
      String str1;
      String str2;
      if (!(this.a instanceof android.app.Activity)) {
        cm.h("Can not create dialog without Activity Context");
        return;
      } 
      if (!TextUtils.isEmpty(q.m().l())) {
        str1 = "Creative Preview (Enabled)";
      } else {
        str1 = "Creative Preview";
      } 
      if (q.m().m()) {
        str2 = "Troubleshooting (Enabled)";
      } else {
        str2 = "Troubleshooting";
      } 
      ArrayList<String> arrayList = new ArrayList();
      this();
      int i = c(arrayList, "Ad Information", true);
      int j = c(arrayList, str1, true);
      int k = c(arrayList, str2, true);
      AlertDialog.Builder builder2 = new AlertDialog.Builder();
      this(this.a, q.e().r());
      AlertDialog.Builder builder1 = builder2.setTitle("Select a Debug Mode");
      CharSequence[] arrayOfCharSequence = arrayList.<CharSequence>toArray((CharSequence[])new String[0]);
      g g = new g();
      this(this, i, j, k);
      builder1.setItems(arrayOfCharSequence, g);
      builder2.create().show();
      return;
    } catch (android.view.WindowManager.BadTokenException badTokenException) {
      b1.l("", (Throwable)badTokenException);
      return;
    } 
  }
  
  public final void g(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore_2
    //   5: aload_1
    //   6: invokevirtual getHistorySize : ()I
    //   9: istore_3
    //   10: aload_1
    //   11: invokevirtual getPointerCount : ()I
    //   14: istore #4
    //   16: iconst_0
    //   17: istore #5
    //   19: iload_2
    //   20: ifne -> 50
    //   23: aload_0
    //   24: iconst_0
    //   25: putfield f : I
    //   28: aload_0
    //   29: new android/graphics/PointF
    //   32: dup
    //   33: aload_1
    //   34: iconst_0
    //   35: invokevirtual getX : (I)F
    //   38: aload_1
    //   39: iconst_0
    //   40: invokevirtual getY : (I)F
    //   43: invokespecial <init> : (FF)V
    //   46: putfield h : Landroid/graphics/PointF;
    //   49: return
    //   50: aload_0
    //   51: getfield f : I
    //   54: istore #6
    //   56: iload #6
    //   58: iconst_m1
    //   59: if_icmpne -> 63
    //   62: return
    //   63: iload #6
    //   65: ifne -> 137
    //   68: iload_2
    //   69: iconst_5
    //   70: if_icmpne -> 137
    //   73: aload_0
    //   74: iconst_5
    //   75: putfield f : I
    //   78: aload_0
    //   79: new android/graphics/PointF
    //   82: dup
    //   83: aload_1
    //   84: iconst_1
    //   85: invokevirtual getX : (I)F
    //   88: aload_1
    //   89: iconst_1
    //   90: invokevirtual getY : (I)F
    //   93: invokespecial <init> : (FF)V
    //   96: putfield i : Landroid/graphics/PointF;
    //   99: aload_0
    //   100: getfield j : Landroid/os/Handler;
    //   103: astore #7
    //   105: aload_0
    //   106: getfield k : Ljava/lang/Runnable;
    //   109: astore #8
    //   111: getstatic com/google/android/gms/internal/ads/m0.m3 : Lcom/google/android/gms/internal/ads/x;
    //   114: astore_1
    //   115: aload #7
    //   117: aload #8
    //   119: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   122: aload_1
    //   123: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   126: checkcast java/lang/Long
    //   129: invokevirtual longValue : ()J
    //   132: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   135: pop
    //   136: return
    //   137: iload #6
    //   139: iconst_5
    //   140: if_icmpne -> 259
    //   143: iload #4
    //   145: iconst_2
    //   146: if_icmpeq -> 155
    //   149: iconst_1
    //   150: istore #5
    //   152: goto -> 238
    //   155: iload_2
    //   156: iconst_2
    //   157: if_icmpne -> 238
    //   160: iconst_0
    //   161: istore_2
    //   162: iconst_0
    //   163: istore #5
    //   165: iload_2
    //   166: iload_3
    //   167: if_icmpge -> 210
    //   170: aload_0
    //   171: aload_1
    //   172: iconst_0
    //   173: iload_2
    //   174: invokevirtual getHistoricalX : (II)F
    //   177: aload_1
    //   178: iconst_0
    //   179: iload_2
    //   180: invokevirtual getHistoricalY : (II)F
    //   183: aload_1
    //   184: iconst_1
    //   185: iload_2
    //   186: invokevirtual getHistoricalX : (II)F
    //   189: aload_1
    //   190: iconst_1
    //   191: iload_2
    //   192: invokevirtual getHistoricalY : (II)F
    //   195: invokespecial f : (FFFF)Z
    //   198: ifne -> 204
    //   201: iconst_1
    //   202: istore #5
    //   204: iinc #2, 1
    //   207: goto -> 165
    //   210: aload_0
    //   211: aload_1
    //   212: invokevirtual getX : ()F
    //   215: aload_1
    //   216: invokevirtual getY : ()F
    //   219: aload_1
    //   220: iconst_1
    //   221: invokevirtual getX : (I)F
    //   224: aload_1
    //   225: iconst_1
    //   226: invokevirtual getY : (I)F
    //   229: invokespecial f : (FFFF)Z
    //   232: ifne -> 238
    //   235: goto -> 149
    //   238: iload #5
    //   240: ifeq -> 259
    //   243: aload_0
    //   244: iconst_m1
    //   245: putfield f : I
    //   248: aload_0
    //   249: getfield j : Landroid/os/Handler;
    //   252: aload_0
    //   253: getfield k : Ljava/lang/Runnable;
    //   256: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   259: return
  }
  
  public final void h(String paramString) {
    this.b = paramString;
  }
  
  public final void i(String paramString) {
    this.e = paramString;
  }
  
  public final void j(String paramString) {
    this.d = paramString;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(100);
    stringBuilder.append("{Dialog: ");
    stringBuilder.append(this.b);
    stringBuilder.append(",DebugSignal: ");
    stringBuilder.append(this.e);
    stringBuilder.append(",AFMA Version: ");
    stringBuilder.append(this.d);
    stringBuilder.append(",Ad Unit ID: ");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */