package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.c;
import com.google.android.gms.common.k.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public final class wf implements ag {
  private static final Object a = new Object();
  
  private static ag b;
  
  private static ag c;
  
  private final Object d = new Object();
  
  private final Context e;
  
  private final WeakHashMap<Thread, Boolean> f = new WeakHashMap<Thread, Boolean>();
  
  private final ExecutorService g = pp1.a().e(yp1.b);
  
  private final zzazn h;
  
  private wf(Context paramContext) {
    this(paramContext, zzazn.o0());
  }
  
  private wf(Context paramContext, zzazn paramzzazn) {
    Context context = paramContext;
    if (paramContext.getApplicationContext() != null)
      context = paramContext.getApplicationContext(); 
    this.e = context;
    this.h = paramzzazn;
  }
  
  private final Uri.Builder c(String paramString1, String paramString2, String paramString3, int paramInt) {
    boolean bool;
    String str1;
    Uri.Builder builder2;
    String str2;
    String str3;
    try {
      bool = c.a(this.e).f();
    } finally {
      Exception exception = null;
      cm.c("Error fetching instant app info", exception);
    } 
    if (!str3.startsWith(str2)) {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 1 + str3.length());
      stringBuilder.append(str2);
      stringBuilder.append(" ");
      stringBuilder.append(str3);
      str3 = stringBuilder.toString();
    } 
    Uri.Builder builder1 = builder2.appendQueryParameter("device", str3).appendQueryParameter("js", this.h.b).appendQueryParameter("appid", str1).appendQueryParameter("exceptiontype", paramString1).appendQueryParameter("stacktrace", paramString2).appendQueryParameter("eids", TextUtils.join(",", m0.d())).appendQueryParameter("exceptionkey", paramString3).appendQueryParameter("cl", "350251165").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(paramInt)).appendQueryParameter("pb_tm", String.valueOf(o2.c.a()));
    x<Boolean> x = m0.n1;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      String str;
      Uri.Builder builder = builder1.appendQueryParameter("gmscv", String.valueOf(c.f().a(this.e)));
      if (this.h.f) {
        str = "1";
      } else {
        str = "0";
      } 
      builder.appendQueryParameter("lite", str);
    } 
    return builder1;
  }
  
  public static ag f(Context paramContext, zzazn paramzzazn) {
    synchronized (a) {
      if (c == null) {
        if (((Boolean)o2.e.a()).booleanValue()) {
          x<Boolean> x = m0.w5;
          if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
            wf wf1 = new wf();
            this(paramContext, paramzzazn);
            Thread thread = Looper.getMainLooper().getThread();
            if (thread != null)
              synchronized (wf1.d) {
                wf1.f.put(thread, Boolean.TRUE);
                null = thread.getUncaughtExceptionHandler();
                bg bg = new bg();
                this(wf1, (Thread.UncaughtExceptionHandler)null);
                thread.setUncaughtExceptionHandler(bg);
              }  
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            yf yf = new yf();
            this(wf1, uncaughtExceptionHandler);
            Thread.setDefaultUncaughtExceptionHandler(yf);
            c = wf1;
            return c;
          } 
        } 
        dg dg = new dg();
        this();
        c = dg;
      } 
      return c;
    } 
  }
  
  public static ag g(Context paramContext) {
    synchronized (a) {
      if (b == null) {
        if (((Boolean)o2.e.a()).booleanValue()) {
          x<Boolean> x = m0.w5;
          if (!((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
            wf wf1 = new wf();
            this(paramContext);
            b = wf1;
            return b;
          } 
        } 
        dg dg = new dg();
        this();
        b = dg;
      } 
      return b;
    } 
  }
  
  public final void a(Throwable paramThrowable, String paramString) {
    b(paramThrowable, paramString, 1.0F);
  }
  
  public final void b(Throwable paramThrowable, String paramString, float paramFloat) {
    byte b2;
    if (sl.q(paramThrowable) == null)
      return; 
    String str1 = paramThrowable.getClass().getName();
    StringWriter stringWriter = new StringWriter();
    p22.a(paramThrowable, new PrintWriter(stringWriter));
    String str2 = stringWriter.toString();
    double d1 = Math.random();
    double d2 = paramFloat;
    byte b1 = 0;
    int i = 1;
    if (d1 < d2) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    if (paramFloat > 0.0F)
      i = (int)(1.0F / paramFloat); 
    if (b2) {
      ArrayList<String> arrayList = new ArrayList();
      arrayList.add(c(str1, str2, paramString, i).toString());
      i = arrayList.size();
      b2 = b1;
      while (b2 < i) {
        paramString = arrayList.get(b2);
        b2++;
        str1 = paramString;
        em em = new em();
        this.g.execute(new zf(em, str1));
      } 
    } 
  }
  
  protected final void e(Thread paramThread, Throwable paramThrowable) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_2
    //   3: ifnull -> 109
    //   6: aload_2
    //   7: astore_1
    //   8: iconst_0
    //   9: istore #4
    //   11: iconst_0
    //   12: istore #5
    //   14: aload_1
    //   15: ifnull -> 93
    //   18: aload_1
    //   19: invokevirtual getStackTrace : ()[Ljava/lang/StackTraceElement;
    //   22: astore #6
    //   24: aload #6
    //   26: arraylength
    //   27: istore #7
    //   29: iconst_0
    //   30: istore #8
    //   32: iload #8
    //   34: iload #7
    //   36: if_icmpge -> 85
    //   39: aload #6
    //   41: iload #8
    //   43: aaload
    //   44: astore #9
    //   46: aload #9
    //   48: invokevirtual getClassName : ()Ljava/lang/String;
    //   51: invokestatic t : (Ljava/lang/String;)Z
    //   54: ifeq -> 60
    //   57: iconst_1
    //   58: istore #4
    //   60: ldc com/google/android/gms/internal/ads/wf
    //   62: invokevirtual getName : ()Ljava/lang/String;
    //   65: aload #9
    //   67: invokevirtual getClassName : ()Ljava/lang/String;
    //   70: invokevirtual equals : (Ljava/lang/Object;)Z
    //   73: ifeq -> 79
    //   76: iconst_1
    //   77: istore #5
    //   79: iinc #8, 1
    //   82: goto -> 32
    //   85: aload_1
    //   86: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   89: astore_1
    //   90: goto -> 14
    //   93: iload #4
    //   95: ifeq -> 109
    //   98: iload #5
    //   100: ifne -> 109
    //   103: iload_3
    //   104: istore #8
    //   106: goto -> 112
    //   109: iconst_0
    //   110: istore #8
    //   112: iload #8
    //   114: ifeq -> 126
    //   117: aload_0
    //   118: aload_2
    //   119: ldc_w ''
    //   122: fconst_1
    //   123: invokevirtual b : (Ljava/lang/Throwable;Ljava/lang/String;F)V
    //   126: return
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */