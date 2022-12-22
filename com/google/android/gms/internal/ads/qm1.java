package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class qm1 implements xr1 {
  private static qm1 b;
  
  private final Context c;
  
  private final gp1 d;
  
  private final jp1 e;
  
  private final op1 f;
  
  private final u92 g;
  
  private final pn1 h;
  
  private final Executor i;
  
  private final zzgp j;
  
  private final kp1 k;
  
  private volatile long l = 0L;
  
  private final Object m = new Object();
  
  private volatile boolean n;
  
  private qm1(Context paramContext, pn1 parampn1, gp1 paramgp1, jp1 paramjp1, op1 paramop1, u92 paramu92, Executor paramExecutor, on1 paramon1, zzgp paramzzgp) {
    this.c = paramContext;
    this.h = parampn1;
    this.d = paramgp1;
    this.e = paramjp1;
    this.f = paramop1;
    this.g = paramu92;
    this.i = paramExecutor;
    this.j = paramzzgp;
    this.k = new ro1(this, paramon1);
  }
  
  static qm1 h(Context paramContext, pn1 parampn1, un1 paramun1) {
    return i(paramContext, parampn1, paramun1, Executors.newCachedThreadPool());
  }
  
  private static qm1 i(Context paramContext, pn1 parampn1, un1 paramun1, Executor paramExecutor) {
    go1 go1 = go1.b(paramContext, paramExecutor, parampn1, paramun1);
    zzfa zzfa = new zzfa(paramContext);
    u92 u921 = new u92(paramun1, go1, new ga2(paramContext, zzfa), zzfa);
    zzgp zzgp1 = (new vo1(paramContext, parampn1)).d();
    on1 on1 = new on1();
    gp1 gp11 = new gp1(paramContext, zzgp1);
    ql1 ql1 = new ql1(parampn1);
    x<Boolean> x = m0.K1;
    return new qm1(paramContext, parampn1, gp11, new jp1(paramContext, zzgp1, ql1, ((Boolean)er2.e().<Boolean>c(x)).booleanValue()), new op1(paramContext, u921, parampn1, on1), u921, paramExecutor, on1, zzgp1);
  }
  
  public static qm1 j(String paramString, Context paramContext, boolean paramBoolean) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/qm1
    //   2: monitorenter
    //   3: getstatic com/google/android/gms/internal/ads/qm1.b : Lcom/google/android/gms/internal/ads/qm1;
    //   6: ifnonnull -> 54
    //   9: invokestatic c : ()Lcom/google/android/gms/internal/ads/tn1;
    //   12: aload_0
    //   13: invokevirtual d : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/tn1;
    //   16: iload_2
    //   17: invokevirtual b : (Z)Lcom/google/android/gms/internal/ads/tn1;
    //   20: invokevirtual a : ()Lcom/google/android/gms/internal/ads/un1;
    //   23: astore_3
    //   24: invokestatic newCachedThreadPool : ()Ljava/util/concurrent/ExecutorService;
    //   27: astore_0
    //   28: aload_1
    //   29: aload_1
    //   30: aload_0
    //   31: invokestatic a : (Landroid/content/Context;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/pn1;
    //   34: aload_3
    //   35: aload_0
    //   36: invokestatic i : (Landroid/content/Context;Lcom/google/android/gms/internal/ads/pn1;Lcom/google/android/gms/internal/ads/un1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/qm1;
    //   39: astore_0
    //   40: aload_0
    //   41: putstatic com/google/android/gms/internal/ads/qm1.b : Lcom/google/android/gms/internal/ads/qm1;
    //   44: aload_0
    //   45: invokevirtual n : ()V
    //   48: getstatic com/google/android/gms/internal/ads/qm1.b : Lcom/google/android/gms/internal/ads/qm1;
    //   51: invokevirtual q : ()V
    //   54: getstatic com/google/android/gms/internal/ads/qm1.b : Lcom/google/android/gms/internal/ads/qm1;
    //   57: astore_0
    //   58: ldc com/google/android/gms/internal/ads/qm1
    //   60: monitorexit
    //   61: aload_0
    //   62: areturn
    //   63: astore_0
    //   64: ldc com/google/android/gms/internal/ads/qm1
    //   66: monitorexit
    //   67: aload_0
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   3	54	63	finally
    //   54	58	63	finally
  }
  
  private final void p() {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: lstore_1
    //   4: getstatic com/google/android/gms/internal/ads/mp1.a : I
    //   7: istore_3
    //   8: aload_0
    //   9: iload_3
    //   10: invokespecial t : (I)Lcom/google/android/gms/internal/ads/dp1;
    //   13: astore #4
    //   15: aload #4
    //   17: ifnull -> 43
    //   20: aload #4
    //   22: invokevirtual a : ()Lcom/google/android/gms/internal/ads/rb2;
    //   25: invokevirtual R : ()Ljava/lang/String;
    //   28: astore #5
    //   30: aload #4
    //   32: invokevirtual a : ()Lcom/google/android/gms/internal/ads/rb2;
    //   35: invokevirtual T : ()Ljava/lang/String;
    //   38: astore #4
    //   40: goto -> 50
    //   43: aconst_null
    //   44: astore #5
    //   46: aload #5
    //   48: astore #4
    //   50: aload_0
    //   51: getfield c : Landroid/content/Context;
    //   54: iconst_1
    //   55: aload_0
    //   56: getfield j : Lcom/google/android/gms/internal/ads/zzgp;
    //   59: aload #5
    //   61: aload #4
    //   63: ldc '1'
    //   65: aload_0
    //   66: getfield h : Lcom/google/android/gms/internal/ads/pn1;
    //   69: invokestatic a : (Landroid/content/Context;ILcom/google/android/gms/internal/ads/zzgp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/pn1;)Lcom/google/android/gms/internal/ads/zzduw;
    //   72: astore #5
    //   74: aload #5
    //   76: getfield c : [B
    //   79: astore #4
    //   81: aload #4
    //   83: ifnull -> 441
    //   86: aload #4
    //   88: arraylength
    //   89: istore #6
    //   91: iload #6
    //   93: ifne -> 99
    //   96: goto -> 441
    //   99: aload #4
    //   101: invokestatic zzt : ([B)Lcom/google/android/gms/internal/ads/zzejr;
    //   104: invokestatic b : ()Lcom/google/android/gms/internal/ads/y32;
    //   107: invokestatic J : (Lcom/google/android/gms/internal/ads/zzejr;Lcom/google/android/gms/internal/ads/y32;)Lcom/google/android/gms/internal/ads/nb2;
    //   110: astore #4
    //   112: aload #4
    //   114: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   117: invokevirtual R : ()Ljava/lang/String;
    //   120: invokevirtual isEmpty : ()Z
    //   123: istore #7
    //   125: iconst_1
    //   126: istore #8
    //   128: iconst_0
    //   129: istore #9
    //   131: iload #7
    //   133: ifne -> 252
    //   136: aload #4
    //   138: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   141: invokevirtual T : ()Ljava/lang/String;
    //   144: invokevirtual isEmpty : ()Z
    //   147: ifne -> 252
    //   150: aload #4
    //   152: invokevirtual M : ()Lcom/google/android/gms/internal/ads/zzejr;
    //   155: invokevirtual toByteArray : ()[B
    //   158: arraylength
    //   159: ifne -> 165
    //   162: goto -> 252
    //   165: aload_0
    //   166: iload_3
    //   167: invokespecial t : (I)Lcom/google/android/gms/internal/ads/dp1;
    //   170: astore #10
    //   172: aload #10
    //   174: ifnonnull -> 184
    //   177: iload #8
    //   179: istore #6
    //   181: goto -> 255
    //   184: aload #10
    //   186: invokevirtual a : ()Lcom/google/android/gms/internal/ads/rb2;
    //   189: astore #10
    //   191: aload #10
    //   193: ifnonnull -> 203
    //   196: iload #8
    //   198: istore #6
    //   200: goto -> 255
    //   203: iload #8
    //   205: istore #6
    //   207: aload #4
    //   209: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   212: invokevirtual R : ()Ljava/lang/String;
    //   215: aload #10
    //   217: invokevirtual R : ()Ljava/lang/String;
    //   220: invokevirtual equals : (Ljava/lang/Object;)Z
    //   223: ifeq -> 255
    //   226: aload #4
    //   228: invokevirtual K : ()Lcom/google/android/gms/internal/ads/rb2;
    //   231: invokevirtual T : ()Ljava/lang/String;
    //   234: aload #10
    //   236: invokevirtual T : ()Ljava/lang/String;
    //   239: invokevirtual equals : (Ljava/lang/Object;)Z
    //   242: ifne -> 252
    //   245: iload #8
    //   247: istore #6
    //   249: goto -> 255
    //   252: iconst_0
    //   253: istore #6
    //   255: iload #6
    //   257: ifne -> 277
    //   260: aload_0
    //   261: getfield h : Lcom/google/android/gms/internal/ads/pn1;
    //   264: sipush #5010
    //   267: invokestatic currentTimeMillis : ()J
    //   270: lload_1
    //   271: lsub
    //   272: invokevirtual j : (IJ)Lcom/google/android/gms/tasks/g;
    //   275: pop
    //   276: return
    //   277: aload_0
    //   278: getfield k : Lcom/google/android/gms/internal/ads/kp1;
    //   281: astore #10
    //   283: aload #5
    //   285: getfield d : I
    //   288: istore #6
    //   290: getstatic com/google/android/gms/internal/ads/m0.I1 : Lcom/google/android/gms/internal/ads/x;
    //   293: astore #5
    //   295: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   298: aload #5
    //   300: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   303: checkcast java/lang/Boolean
    //   306: invokevirtual booleanValue : ()Z
    //   309: ifeq -> 354
    //   312: iload #6
    //   314: iconst_3
    //   315: if_icmpne -> 332
    //   318: aload_0
    //   319: getfield e : Lcom/google/android/gms/internal/ads/jp1;
    //   322: aload #4
    //   324: invokevirtual c : (Lcom/google/android/gms/internal/ads/nb2;)Z
    //   327: istore #9
    //   329: goto -> 367
    //   332: iload #6
    //   334: iconst_4
    //   335: if_icmpne -> 367
    //   338: aload_0
    //   339: getfield e : Lcom/google/android/gms/internal/ads/jp1;
    //   342: aload #4
    //   344: aload #10
    //   346: invokevirtual d : (Lcom/google/android/gms/internal/ads/nb2;Lcom/google/android/gms/internal/ads/kp1;)Z
    //   349: istore #9
    //   351: goto -> 367
    //   354: aload_0
    //   355: getfield d : Lcom/google/android/gms/internal/ads/gp1;
    //   358: aload #4
    //   360: aload #10
    //   362: invokevirtual b : (Lcom/google/android/gms/internal/ads/nb2;Lcom/google/android/gms/internal/ads/kp1;)Z
    //   365: istore #9
    //   367: iload #9
    //   369: ifne -> 389
    //   372: aload_0
    //   373: getfield h : Lcom/google/android/gms/internal/ads/pn1;
    //   376: sipush #4009
    //   379: invokestatic currentTimeMillis : ()J
    //   382: lload_1
    //   383: lsub
    //   384: invokevirtual j : (IJ)Lcom/google/android/gms/tasks/g;
    //   387: pop
    //   388: return
    //   389: aload_0
    //   390: iload_3
    //   391: invokespecial t : (I)Lcom/google/android/gms/internal/ads/dp1;
    //   394: astore #5
    //   396: aload #5
    //   398: ifnull -> 421
    //   401: aload_0
    //   402: getfield f : Lcom/google/android/gms/internal/ads/op1;
    //   405: aload #5
    //   407: invokevirtual e : (Lcom/google/android/gms/internal/ads/dp1;)V
    //   410: aload_0
    //   411: invokestatic currentTimeMillis : ()J
    //   414: ldc2_w 1000
    //   417: ldiv
    //   418: putfield l : J
    //   421: return
    //   422: astore #5
    //   424: aload_0
    //   425: getfield h : Lcom/google/android/gms/internal/ads/pn1;
    //   428: sipush #2030
    //   431: invokestatic currentTimeMillis : ()J
    //   434: lload_1
    //   435: lsub
    //   436: invokevirtual j : (IJ)Lcom/google/android/gms/tasks/g;
    //   439: pop
    //   440: return
    //   441: aload_0
    //   442: getfield h : Lcom/google/android/gms/internal/ads/pn1;
    //   445: sipush #5009
    //   448: invokestatic currentTimeMillis : ()J
    //   451: lload_1
    //   452: lsub
    //   453: invokevirtual j : (IJ)Lcom/google/android/gms/tasks/g;
    //   456: pop
    //   457: return
    //   458: astore #5
    //   460: aload_0
    //   461: getfield h : Lcom/google/android/gms/internal/ads/pn1;
    //   464: sipush #4002
    //   467: invokestatic currentTimeMillis : ()J
    //   470: lload_1
    //   471: lsub
    //   472: aload #5
    //   474: invokevirtual b : (IJLjava/lang/Exception;)Lcom/google/android/gms/tasks/g;
    //   477: pop
    //   478: return
    // Exception table:
    //   from	to	target	type
    //   50	81	458	com/google/android/gms/internal/ads/zzelo
    //   86	91	458	com/google/android/gms/internal/ads/zzelo
    //   99	112	422	java/lang/NullPointerException
    //   99	112	458	com/google/android/gms/internal/ads/zzelo
    //   112	125	458	com/google/android/gms/internal/ads/zzelo
    //   136	162	458	com/google/android/gms/internal/ads/zzelo
    //   165	172	458	com/google/android/gms/internal/ads/zzelo
    //   184	191	458	com/google/android/gms/internal/ads/zzelo
    //   207	245	458	com/google/android/gms/internal/ads/zzelo
    //   260	276	458	com/google/android/gms/internal/ads/zzelo
    //   277	312	458	com/google/android/gms/internal/ads/zzelo
    //   318	329	458	com/google/android/gms/internal/ads/zzelo
    //   338	351	458	com/google/android/gms/internal/ads/zzelo
    //   354	367	458	com/google/android/gms/internal/ads/zzelo
    //   372	388	458	com/google/android/gms/internal/ads/zzelo
    //   389	396	458	com/google/android/gms/internal/ads/zzelo
    //   401	421	458	com/google/android/gms/internal/ads/zzelo
    //   424	440	458	com/google/android/gms/internal/ads/zzelo
    //   441	457	458	com/google/android/gms/internal/ads/zzelo
  }
  
  private final dp1 t(int paramInt) {
    if (!vo1.a(this.j))
      return null; 
    x<Boolean> x = m0.I1;
    return ((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? this.e.k(paramInt) : this.d.g(paramInt);
  }
  
  public final String a(Context paramContext, String paramString, View paramView) {
    return g(paramContext, paramString, paramView, null);
  }
  
  public final void b(View paramView) {
    this.g.d(paramView);
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3) {}
  
  public final String d(Context paramContext) {
    q();
    wn1 wn1 = this.f.c();
    if (wn1 != null) {
      long l = System.currentTimeMillis();
      String str = wn1.a(paramContext, null);
      this.h.d(5001, System.currentTimeMillis() - l, str, null);
      return str;
    } 
    return "";
  }
  
  public final String e(Context paramContext, View paramView, Activity paramActivity) {
    q();
    wn1 wn1 = this.f.c();
    if (wn1 != null) {
      long l = System.currentTimeMillis();
      String str = wn1.d(paramContext, null, paramView, paramActivity);
      this.h.d(5002, System.currentTimeMillis() - l, str, null);
      return str;
    } 
    return "";
  }
  
  public final void f(MotionEvent paramMotionEvent) {
    wn1 wn1 = this.f.c();
    if (wn1 != null)
      try {
        wn1.b(null, paramMotionEvent);
        return;
      } catch (zzduz zzduz) {
        this.h.b(zzduz.zzayu(), -1L, zzduz);
      }  
  }
  
  public final String g(Context paramContext, String paramString, View paramView, Activity paramActivity) {
    q();
    wn1 wn1 = this.f.c();
    if (wn1 != null) {
      long l = System.currentTimeMillis();
      String str = wn1.c(paramContext, null, paramString, paramView, paramActivity);
      this.h.d(5000, System.currentTimeMillis() - l, str, null);
      return str;
    } 
    return "";
  }
  
  final void n() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic currentTimeMillis : ()J
    //   5: lstore_1
    //   6: aload_0
    //   7: getstatic com/google/android/gms/internal/ads/mp1.a : I
    //   10: invokespecial t : (I)Lcom/google/android/gms/internal/ads/dp1;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnull -> 29
    //   18: aload_0
    //   19: getfield f : Lcom/google/android/gms/internal/ads/op1;
    //   22: aload_3
    //   23: invokevirtual e : (Lcom/google/android/gms/internal/ads/dp1;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: getfield h : Lcom/google/android/gms/internal/ads/pn1;
    //   33: sipush #4013
    //   36: invokestatic currentTimeMillis : ()J
    //   39: lload_1
    //   40: lsub
    //   41: invokevirtual j : (IJ)Lcom/google/android/gms/tasks/g;
    //   44: pop
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: astore_3
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_3
    //   52: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	48	finally
    //   18	26	48	finally
    //   29	45	48	finally
  }
  
  public final void o() {
    if (!vo1.a(this.j))
      return; 
    this.i.execute(new rn1(this));
  }
  
  public final void q() {
    if (!this.n)
      synchronized (this.m) {
        if (!this.n) {
          if (System.currentTimeMillis() / 1000L - this.l < 3600L)
            return; 
          dp1 dp1 = this.f.d();
          if (dp1 == null || dp1.e(3600L))
            o(); 
        } 
        return;
      }  
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */