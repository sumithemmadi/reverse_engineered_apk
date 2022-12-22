package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.internal.util.x;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.k.c;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class jj implements uj {
  private static List<Future<Void>> a = Collections.synchronizedList(new ArrayList<Future<Void>>());
  
  private final zzepa$zzb.b b;
  
  private final LinkedHashMap<String, zzepa$zzb.zzh.a> c;
  
  private final List<String> d = new ArrayList<String>();
  
  private final List<String> e = new ArrayList<String>();
  
  private final Context f;
  
  private final xj g;
  
  private boolean h;
  
  private final zzawu i;
  
  private final Object j = new Object();
  
  private HashSet<String> k = new HashSet<String>();
  
  private boolean l = false;
  
  private boolean m = false;
  
  private boolean n = false;
  
  public jj(Context paramContext, zzazn paramzzazn, zzawu paramzzawu, String paramString, xj paramxj) {
    t.k(paramzzawu, "SafeBrowsing config is not present.");
    Context context = paramContext;
    if (paramContext.getApplicationContext() != null)
      context = paramContext.getApplicationContext(); 
    this.f = context;
    this.c = new LinkedHashMap<String, zzepa$zzb.zzh.a>();
    this.g = paramxj;
    this.i = paramzzawu;
    for (String str : paramzzawu.f)
      this.k.add(str.toLowerCase(Locale.ENGLISH)); 
    this.k.remove("cookie".toLowerCase(Locale.ENGLISH));
    zzepa$zzb.b b1 = zzepa$zzb.d0();
    b1.A(zzepa$zzb.zzg.j);
    b1.G(paramString);
    b1.H(paramString);
    zzepa$zzb.a.a a1 = zzepa$zzb.a.K();
    String str2 = this.i.b;
    if (str2 != null)
      a1.x(str2); 
    b1.y((zzepa$zzb.a)a1.h());
    zzepa$zzb.f.a a = zzepa$zzb.f.M().x(c.a(this.f).f());
    String str1 = paramzzazn.b;
    if (str1 != null)
      a.z(str1); 
    long l = c.f().a(this.f);
    if (l > 0L)
      a.y(l); 
    b1.C((zzepa$zzb.f)a.h());
    this.b = b1;
  }
  
  private final zzepa$zzb.zzh.a i(String paramString) {
    synchronized (this.j) {
      return this.c.get(paramString);
    } 
  }
  
  private final ot1<Void> l() {
    int i;
    boolean bool = this.h;
    if ((bool && this.i.h) || (this.n && this.i.g) || (!bool && this.i.e)) {
      i = 1;
    } else {
      i = 0;
    } 
    if (!i)
      return dt1.h(null); 
    synchronized (this.j) {
      for (zzepa$zzb.zzh.a a : this.c.values())
        this.b.B((zzepa$zzb.zzh)a.h()); 
      this.b.J(this.d);
      this.b.K(this.e);
      if (rj.a()) {
        StringBuilder stringBuilder1 = new StringBuilder();
        String str1 = this.b.x();
        String str2 = this.b.E();
        i = String.valueOf(str1).length();
        int j = String.valueOf(str2).length();
        StringBuilder stringBuilder2 = new StringBuilder();
        this(i + 53 + j);
        stringBuilder2.append("Sending SB report\n  url: ");
        stringBuilder2.append(str1);
        stringBuilder2.append("\n  clickUrl: ");
        stringBuilder2.append(str2);
        stringBuilder2.append("\n  resources: \n");
        this(stringBuilder2.toString());
        for (zzepa$zzb.zzh zzh : this.b.D()) {
          stringBuilder1.append("    [");
          stringBuilder1.append(zzh.T());
          stringBuilder1.append("] ");
          stringBuilder1.append(zzh.J());
        } 
        rj.b(stringBuilder1.toString());
      } 
      byte[] arrayOfByte = ((zzepa$zzb)this.b.h()).g();
      String str = this.i.c;
      x x = new x();
      this(this.f);
      ot1<?> ot1 = x.a(1, str, null, arrayOfByte);
      if (rj.a())
        ot1.a(nj.b, fm.a); 
      ot1 = dt1.j(ot1, mj.a, fm.f);
      return (ot1)ot1;
    } 
  }
  
  public final void a() {
    synchronized (this.j) {
      ot1<Map<String, String>> ot1 = this.g.a(this.f, this.c.keySet());
      kj kj = new kj();
      this(this);
      nt1 nt1 = fm.f;
      ot1<?> ot12 = dt1.k(ot1, kj, nt1);
      ot1<?> ot11 = dt1.d(ot12, 10L, TimeUnit.SECONDS, fm.d);
      pj pj = new pj();
      this(this, ot11);
      dt1.g(ot12, pj, nt1);
      a.add(ot11);
      return;
    } 
  }
  
  public final void b(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_1
    //   8: ifnonnull -> 22
    //   11: aload_0
    //   12: getfield b : Lcom/google/android/gms/internal/ads/zzepa$zzb$b;
    //   15: invokevirtual F : ()Lcom/google/android/gms/internal/ads/zzepa$zzb$b;
    //   18: pop
    //   19: goto -> 31
    //   22: aload_0
    //   23: getfield b : Lcom/google/android/gms/internal/ads/zzepa$zzb$b;
    //   26: aload_1
    //   27: invokevirtual I : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzepa$zzb$b;
    //   30: pop
    //   31: aload_2
    //   32: monitorexit
    //   33: return
    //   34: astore_1
    //   35: aload_2
    //   36: monitorexit
    //   37: aload_1
    //   38: athrow
    // Exception table:
    //   from	to	target	type
    //   11	19	34	finally
    //   22	31	34	finally
    //   31	33	34	finally
    //   35	37	34	finally
  }
  
  public final void c() {
    this.l = true;
  }
  
  public final void d(String paramString, Map<String, String> paramMap, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Ljava/lang/Object;
    //   4: astore #4
    //   6: aload #4
    //   8: monitorenter
    //   9: iload_3
    //   10: iconst_3
    //   11: if_icmpne -> 19
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield n : Z
    //   19: aload_0
    //   20: getfield c : Ljava/util/LinkedHashMap;
    //   23: aload_1
    //   24: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   27: ifeq -> 58
    //   30: iload_3
    //   31: iconst_3
    //   32: if_icmpne -> 54
    //   35: aload_0
    //   36: getfield c : Ljava/util/LinkedHashMap;
    //   39: aload_1
    //   40: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   43: checkcast com/google/android/gms/internal/ads/zzepa$zzb$zzh$a
    //   46: iload_3
    //   47: invokestatic zzib : (I)Lcom/google/android/gms/internal/ads/zzepa$zzb$zzh$zza;
    //   50: invokevirtual y : (Lcom/google/android/gms/internal/ads/zzepa$zzb$zzh$zza;)Lcom/google/android/gms/internal/ads/zzepa$zzb$zzh$a;
    //   53: pop
    //   54: aload #4
    //   56: monitorexit
    //   57: return
    //   58: invokestatic U : ()Lcom/google/android/gms/internal/ads/zzepa$zzb$zzh$a;
    //   61: astore #5
    //   63: iload_3
    //   64: invokestatic zzib : (I)Lcom/google/android/gms/internal/ads/zzepa$zzb$zzh$zza;
    //   67: astore #6
    //   69: aload #6
    //   71: ifnull -> 82
    //   74: aload #5
    //   76: aload #6
    //   78: invokevirtual y : (Lcom/google/android/gms/internal/ads/zzepa$zzb$zzh$zza;)Lcom/google/android/gms/internal/ads/zzepa$zzb$zzh$a;
    //   81: pop
    //   82: aload #5
    //   84: aload_0
    //   85: getfield c : Ljava/util/LinkedHashMap;
    //   88: invokevirtual size : ()I
    //   91: invokevirtual z : (I)Lcom/google/android/gms/internal/ads/zzepa$zzb$zzh$a;
    //   94: pop
    //   95: aload #5
    //   97: aload_1
    //   98: invokevirtual A : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzepa$zzb$zzh$a;
    //   101: pop
    //   102: invokestatic L : ()Lcom/google/android/gms/internal/ads/zzepa$zzb$d$b;
    //   105: astore #7
    //   107: aload_0
    //   108: getfield k : Ljava/util/HashSet;
    //   111: invokevirtual size : ()I
    //   114: ifle -> 271
    //   117: aload_2
    //   118: ifnull -> 271
    //   121: aload_2
    //   122: invokeinterface entrySet : ()Ljava/util/Set;
    //   127: invokeinterface iterator : ()Ljava/util/Iterator;
    //   132: astore #8
    //   134: aload #8
    //   136: invokeinterface hasNext : ()Z
    //   141: ifeq -> 271
    //   144: aload #8
    //   146: invokeinterface next : ()Ljava/lang/Object;
    //   151: checkcast java/util/Map$Entry
    //   154: astore #6
    //   156: aload #6
    //   158: invokeinterface getKey : ()Ljava/lang/Object;
    //   163: ifnull -> 180
    //   166: aload #6
    //   168: invokeinterface getKey : ()Ljava/lang/Object;
    //   173: checkcast java/lang/String
    //   176: astore_2
    //   177: goto -> 184
    //   180: ldc_w ''
    //   183: astore_2
    //   184: aload #6
    //   186: invokeinterface getValue : ()Ljava/lang/Object;
    //   191: ifnull -> 209
    //   194: aload #6
    //   196: invokeinterface getValue : ()Ljava/lang/Object;
    //   201: checkcast java/lang/String
    //   204: astore #6
    //   206: goto -> 214
    //   209: ldc_w ''
    //   212: astore #6
    //   214: aload_2
    //   215: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   218: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   221: astore #9
    //   223: aload_0
    //   224: getfield k : Ljava/util/HashSet;
    //   227: aload #9
    //   229: invokevirtual contains : (Ljava/lang/Object;)Z
    //   232: ifeq -> 134
    //   235: aload #7
    //   237: invokestatic N : ()Lcom/google/android/gms/internal/ads/zzepa$zzb$c$a;
    //   240: aload_2
    //   241: invokestatic zzhy : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzejr;
    //   244: invokevirtual x : (Lcom/google/android/gms/internal/ads/zzejr;)Lcom/google/android/gms/internal/ads/zzepa$zzb$c$a;
    //   247: aload #6
    //   249: invokestatic zzhy : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzejr;
    //   252: invokevirtual y : (Lcom/google/android/gms/internal/ads/zzejr;)Lcom/google/android/gms/internal/ads/zzepa$zzb$c$a;
    //   255: invokevirtual h : ()Lcom/google/android/gms/internal/ads/u52;
    //   258: checkcast com/google/android/gms/internal/ads/k42
    //   261: checkcast com/google/android/gms/internal/ads/zzepa$zzb$c
    //   264: invokevirtual x : (Lcom/google/android/gms/internal/ads/zzepa$zzb$c;)Lcom/google/android/gms/internal/ads/zzepa$zzb$d$b;
    //   267: pop
    //   268: goto -> 134
    //   271: aload #5
    //   273: aload #7
    //   275: invokevirtual h : ()Lcom/google/android/gms/internal/ads/u52;
    //   278: checkcast com/google/android/gms/internal/ads/k42
    //   281: checkcast com/google/android/gms/internal/ads/zzepa$zzb$d
    //   284: invokevirtual x : (Lcom/google/android/gms/internal/ads/zzepa$zzb$d;)Lcom/google/android/gms/internal/ads/zzepa$zzb$zzh$a;
    //   287: pop
    //   288: aload_0
    //   289: getfield c : Ljava/util/LinkedHashMap;
    //   292: aload_1
    //   293: aload #5
    //   295: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   298: pop
    //   299: aload #4
    //   301: monitorexit
    //   302: return
    //   303: astore_1
    //   304: aload #4
    //   306: monitorexit
    //   307: goto -> 312
    //   310: aload_1
    //   311: athrow
    //   312: goto -> 310
    // Exception table:
    //   from	to	target	type
    //   14	19	303	finally
    //   19	30	303	finally
    //   35	54	303	finally
    //   54	57	303	finally
    //   58	69	303	finally
    //   74	82	303	finally
    //   82	117	303	finally
    //   121	134	303	finally
    //   134	177	303	finally
    //   184	206	303	finally
    //   214	268	303	finally
    //   271	302	303	finally
    //   304	307	303	finally
  }
  
  public final boolean e() {
    return (o.f() && this.i.d && !this.m);
  }
  
  public final zzawu f() {
    return this.i;
  }
  
  public final void g(View paramView) {
    if (!this.i.d)
      return; 
    if (this.m)
      return; 
    q.c();
    Bitmap bitmap = h1.n0(paramView);
    if (bitmap == null) {
      rj.b("Failed to capture the webview bitmap.");
      return;
    } 
    this.m = true;
    h1.V(new lj(this, bitmap));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */