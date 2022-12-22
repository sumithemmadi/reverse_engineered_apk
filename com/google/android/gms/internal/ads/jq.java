package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
public final class jq extends up implements kp {
  private ap e;
  
  private String f;
  
  private boolean g;
  
  private Exception h;
  
  private boolean i;
  
  public jq(eo parameo, bo parambo) {
    super(parameo);
    ap ap1 = new ap(parameo.getContext(), parambo, this.d.get());
    this.e = ap1;
    ap1.D(this);
  }
  
  private static String A(String paramString, Exception paramException) {
    String str1 = paramException.getClass().getCanonicalName();
    String str2 = paramException.getMessage();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 2 + String.valueOf(str1).length() + String.valueOf(str2).length());
    stringBuilder.append(paramString);
    stringBuilder.append("/");
    stringBuilder.append(str1);
    stringBuilder.append(":");
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
  
  private final void B(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield g : Z
    //   7: aload_0
    //   8: invokevirtual notify : ()V
    //   11: aload_0
    //   12: invokevirtual a : ()V
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_0
    //   18: getfield f : Ljava/lang/String;
    //   21: astore_2
    //   22: aload_2
    //   23: ifnull -> 71
    //   26: aload_0
    //   27: aload_2
    //   28: invokevirtual x : (Ljava/lang/String;)Ljava/lang/String;
    //   31: astore_2
    //   32: aload_0
    //   33: getfield h : Ljava/lang/Exception;
    //   36: astore_3
    //   37: aload_3
    //   38: ifnull -> 58
    //   41: aload_0
    //   42: aload_0
    //   43: getfield f : Ljava/lang/String;
    //   46: aload_2
    //   47: ldc 'badUrl'
    //   49: aload_1
    //   50: aload_3
    //   51: invokestatic A : (Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;
    //   54: invokevirtual n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   57: return
    //   58: aload_0
    //   59: aload_0
    //   60: getfield f : Ljava/lang/String;
    //   63: aload_2
    //   64: ldc 'externalAbort'
    //   66: ldc 'Programmatic precache abort.'
    //   68: invokevirtual n : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   71: return
    //   72: astore_1
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_1
    //   76: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	72	finally
    //   73	75	72	finally
  }
  
  public final void a() {
    ap ap1 = this.e;
    if (ap1 != null) {
      ap1.D(null);
      this.e.A();
    } 
    super.a();
  }
  
  public final void b(boolean paramBoolean, long paramLong) {
    eo eo = this.d.get();
    if (eo != null)
      fm.e.execute(new iq(eo, paramBoolean, paramLong)); 
  }
  
  public final void d(int paramInt1, int paramInt2) {}
  
  public final void e(String paramString, Exception paramException) {
    x<String> x = m0.l;
    String str = er2.e().<String>c(x);
    if (str != null) {
      List<String> list = Arrays.asList(str.split(","));
      if (list.contains("all"))
        return; 
      if (list.contains(paramException.getClass().getCanonicalName()))
        return; 
    } 
    this.h = paramException;
    cm.d("Precache error", paramException);
    B(paramString);
  }
  
  public final void f(int paramInt) {}
  
  public final void g() {
    B(null);
  }
  
  public final void q(int paramInt) {
    this.e.M().j(paramInt);
  }
  
  public final void r(int paramInt) {
    this.e.M().k(paramInt);
  }
  
  public final void s(int paramInt) {
    this.e.M().h(paramInt);
  }
  
  public final void t(int paramInt) {
    this.e.M().i(paramInt);
  }
  
  public final boolean u(String paramString, String[] paramArrayOfString) {
    Exception exception;
    jq jq2;
    jq jq3;
    String str6;
    jq jq1 = this;
    String str1 = paramString;
    jq1.f = str1;
    String str2 = super.x(paramString);
    String str3 = "error";
    String str4 = str1;
    String str5 = str2;
    jq jq4 = jq1;
    try {
      Uri[] arrayOfUri = new Uri[paramArrayOfString.length];
      int i = 0;
      while (true) {
        String str8;
        str4 = str1;
        str5 = str2;
        jq4 = jq1;
        int j = paramArrayOfString.length;
        if (i < j)
          try {
            arrayOfUri[i] = Uri.parse(paramArrayOfString[i]);
            i++;
            continue;
          } catch (Exception null) {
            str5 = str1;
            str1 = str2;
            jq4 = jq1;
            str8 = str5;
            break;
          }  
        str4 = str1;
        str5 = str2;
        str6 = str8;
        ((jq)str8).e.E(arrayOfUri, ((up)str8).c);
        str4 = str1;
        str5 = str2;
        str6 = str8;
        eo eo = ((up)str8).d.get();
        if (eo != null)
          eo.j(str2, (up)str8); 
        str4 = str1;
        str5 = str2;
        str6 = str8;
        e e = q.j();
        str4 = str1;
        str5 = str2;
        str6 = str8;
        long l1 = e.a();
        str4 = str1;
        str5 = str2;
        str6 = str8;
        x<Long> x2 = m0.s;
        str4 = str1;
        str5 = str2;
        str6 = str8;
        long l2 = ((Long)er2.e().<Long>c(x2)).longValue();
        str4 = str1;
        str5 = str2;
        str6 = str8;
        x2 = m0.r;
        str4 = str1;
        str5 = str2;
        str6 = str8;
        long l3 = ((Long)er2.e().<Long>c(x2)).longValue() * 1000L;
        str4 = str1;
        str5 = str2;
        str6 = str8;
        x<Integer> x1 = m0.q;
        str4 = str1;
        str5 = str2;
        str6 = str8;
        long l4 = ((Integer)er2.e().<Integer>c(x1)).intValue();
        str4 = str1;
        str5 = str2;
        str6 = str8;
        x<Boolean> x = m0.D1;
        str4 = str1;
        str5 = str2;
        str6 = str8;
        boolean bool = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
        long l5 = -1L;
        String str7 = str2;
        while (true) {
          jq jq6;
          String str10;
          str4 = str1;
          str5 = str7;
          str6 = str8;
          /* monitor enter ThisExpression{ObjectType{com/google/android/gms/internal/ads/jq}} */
          try {
            if (e.a() - l1 <= l3) {
              if (((jq)str8).g) {
                Exception exception1 = ((jq)str8).h;
                if (exception1 != null) {
                  str3 = "badUrl";
                  try {
                    throw exception1;
                  } finally {}
                } else {
                  String str = "externalAbort";
                  str3 = str;
                  IOException iOException = new IOException();
                  str3 = str;
                  this("Abort requested before buffering finished. ");
                  str3 = str;
                  throw iOException;
                } 
              } else {
                if (((jq)str8).i) {
                  /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jq}} */
                } else {
                  bc2 bc2 = ((jq)str8).e.J();
                  if (bc2 != null) {
                    jq jq13;
                    long l = bc2.getDuration();
                    if (l > 0L) {
                      long l6 = bc2.X();
                      if (l6 != l5) {
                        boolean bool1;
                        long l7;
                        long l8;
                        if (l6 > 0L) {
                          bool1 = true;
                        } else {
                          bool1 = false;
                        } 
                        if (bool) {
                          l5 = ((jq)str8).e.G();
                        } else {
                          l5 = -1L;
                        } 
                        if (bool) {
                          l7 = ((jq)str8).e.V();
                        } else {
                          l7 = -1L;
                        } 
                        if (bool) {
                          l8 = ((jq)str8).e.z();
                        } else {
                          l8 = -1L;
                        } 
                        try {
                        
                        } finally {
                          bc2 = null;
                          jq jq14 = this;
                          str8 = paramString;
                          jq13 = jq5;
                        } 
                      } 
                      if (l6 >= l) {
                        jq13 = this;
                        str8 = paramString;
                        jq jq14 = jq13;
                        str5 = str8;
                        jq jq15 = jq5;
                        String str = str3;
                        try {
                          jq13.p(str8, (String)jq5, l);
                          jq14 = jq13;
                          return true;
                        } finally {
                          bc2 = null;
                          jq5 = jq14;
                          str8 = str5;
                          jq13 = jq15;
                        } 
                      } else {
                        jq13 = this;
                        str8 = paramString;
                        jq jq14 = jq13;
                        str5 = str8;
                        jq jq15 = jq5;
                        String str = str3;
                        if (jq13.e.y() >= l4 && l6 > 0L) {
                          jq14 = jq13;
                          str5 = str8;
                          jq15 = jq5;
                          str = str3;
                          /* monitor exit ThisExpression{ObjectType{com/google/android/gms/internal/ads/jq}} */
                          return true;
                        } 
                        jq14 = jq13;
                        str5 = str8;
                        jq15 = jq5;
                        str = str3;
                      } 
                    } else {
                      String str11 = str8;
                      jq6 = jq13;
                      str10 = str11;
                      str2 = str10;
                      jq jq15 = jq6;
                      jq jq14 = jq5;
                      String str12 = str3;
                    } 
                  } else {
                    str2 = "exoPlayerReleased";
                    String str = str2;
                    jq jq13 = jq6;
                    str5 = str10;
                    jq2 = jq5;
                    IOException iOException = new IOException();
                    str = str2;
                    jq13 = jq6;
                    str5 = str10;
                    jq2 = jq5;
                    this("ExoPlayer was released during preloading.");
                    str = str2;
                    jq13 = jq6;
                    str5 = str10;
                    jq2 = jq5;
                    throw iOException;
                  } 
                  jq jq10 = jq5;
                  jq jq11 = jq6;
                  str4 = str10;
                  jq jq12 = jq2;
                } 
                return true;
              } 
            } else {
              str2 = "downloadTimeout";
              str6 = str2;
              jq jq10 = jq6;
              str5 = str10;
              jq2 = jq5;
              IOException iOException = new IOException();
              str6 = str2;
              jq10 = jq6;
              str5 = str10;
              jq2 = jq5;
              StringBuilder stringBuilder1 = new StringBuilder();
              str6 = str2;
              jq10 = jq6;
              str5 = str10;
              jq2 = jq5;
              this(47);
              str6 = str2;
              jq10 = jq6;
              str5 = str10;
              jq2 = jq5;
              stringBuilder1.append("Timeout reached. Limit: ");
              str6 = str2;
              jq10 = jq6;
              str5 = str10;
              jq2 = jq5;
              stringBuilder1.append(l3);
              str6 = str2;
              jq10 = jq6;
              str5 = str10;
              jq2 = jq5;
              stringBuilder1.append(" ms");
              str6 = str2;
              jq10 = jq6;
              str5 = str10;
              jq2 = jq5;
              this(stringBuilder1.toString());
              str6 = str2;
              jq10 = jq6;
              str5 = str10;
              jq2 = jq5;
              throw iOException;
            } 
          } finally {}
          str5 = str10;
          jq jq7 = jq5;
          jq jq5 = jq6;
          String str9 = str5;
          jq jq8 = jq5;
          str5 = str9;
          jq3 = jq7;
          jq jq9 = jq2;
        } 
      } 
    } catch (Exception exception1) {
      jq1 = jq3;
      str1 = str5;
      String str = str6;
      Exception exception3 = exception1;
      Exception exception2 = exception3;
      str6 = str;
      exception = exception2;
    } 
    str5 = exception.getMessage();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 34 + String.valueOf(str5).length());
    stringBuilder.append("Failed to preload url ");
    stringBuilder.append((String)jq1);
    stringBuilder.append(" Exception: ");
    stringBuilder.append(str5);
    cm.i(stringBuilder.toString());
    super.a();
    str6.n((String)jq1, str1, (String)jq2, A((String)jq2, exception));
    return false;
  }
  
  public final boolean w(String paramString) {
    return super.u(paramString, new String[] { paramString });
  }
  
  protected final String x(String paramString) {
    paramString = String.valueOf(super.x(paramString));
    return (paramString.length() != 0) ? "cache:".concat(paramString) : new String("cache:");
  }
  
  public final ap z() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield i : Z
    //   7: aload_0
    //   8: invokevirtual notify : ()V
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_0
    //   14: getfield e : Lcom/google/android/gms/internal/ads/ap;
    //   17: aconst_null
    //   18: invokevirtual D : (Lcom/google/android/gms/internal/ads/kp;)V
    //   21: aload_0
    //   22: getfield e : Lcom/google/android/gms/internal/ads/ap;
    //   25: astore_1
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield e : Lcom/google/android/gms/internal/ads/ap;
    //   31: aload_1
    //   32: areturn
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	33	finally
    //   34	36	33	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */