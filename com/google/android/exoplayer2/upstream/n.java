package com.google.android.exoplayer2.upstream;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.f;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.k;
import com.google.android.exoplayer2.util.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class n implements f, x {
  public static final Map<String, int[]> a = j();
  
  public static final long[] b = new long[] { 5700000L, 3500000L, 2000000L, 1100000L, 470000L };
  
  public static final long[] c = new long[] { 200000L, 148000L, 132000L, 115000L, 95000L };
  
  public static final long[] d = new long[] { 2200000L, 1300000L, 970000L, 810000L, 490000L };
  
  public static final long[] e = new long[] { 5300000L, 3200000L, 2000000L, 1400000L, 690000L };
  
  private static n f;
  
  private final Context g;
  
  private final SparseArray<Long> h;
  
  private final k<f.a> i;
  
  private final z j;
  
  private final f k;
  
  private int l;
  
  private long m;
  
  private long n;
  
  private int o;
  
  private long p;
  
  private long q;
  
  private long r;
  
  private long s;
  
  private boolean t;
  
  private int u;
  
  @Deprecated
  public n() {
    this(null, new SparseArray(), 2000, f.a, false);
  }
  
  private n(Context paramContext, SparseArray<Long> paramSparseArray, int paramInt, f paramf, boolean paramBoolean) {
    Context context;
    if (paramContext == null) {
      context = null;
    } else {
      context = paramContext.getApplicationContext();
    } 
    this.g = context;
    this.h = paramSparseArray;
    this.i = new k();
    this.j = new z(paramInt);
    this.k = paramf;
    if (paramContext == null) {
      paramInt = 0;
    } else {
      paramInt = h0.G(paramContext);
    } 
    this.o = paramInt;
    this.r = k(paramInt);
    if (paramContext != null && paramBoolean)
      c.a(paramContext).d(this); 
  }
  
  private static Map<String, int[]> j() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("AD", new int[] { 1, 1, 0, 0 });
    hashMap.put("AE", new int[] { 1, 4, 4, 4 });
    hashMap.put("AF", new int[] { 4, 4, 3, 3 });
    hashMap.put("AG", new int[] { 3, 1, 0, 1 });
    hashMap.put("AI", new int[] { 1, 0, 0, 3 });
    hashMap.put("AL", new int[] { 1, 2, 0, 1 });
    hashMap.put("AM", new int[] { 2, 2, 2, 2 });
    hashMap.put("AO", new int[] { 3, 4, 2, 0 });
    hashMap.put("AR", new int[] { 2, 3, 2, 2 });
    hashMap.put("AS", new int[] { 3, 0, 4, 2 });
    hashMap.put("AT", new int[] { 0, 3, 0, 0 });
    hashMap.put("AU", new int[] { 0, 3, 0, 1 });
    hashMap.put("AW", new int[] { 1, 1, 0, 3 });
    hashMap.put("AX", new int[] { 0, 3, 0, 2 });
    hashMap.put("AZ", new int[] { 3, 3, 3, 3 });
    hashMap.put("BA", new int[] { 1, 1, 0, 1 });
    hashMap.put("BB", new int[] { 0, 2, 0, 0 });
    hashMap.put("BD", new int[] { 2, 1, 3, 3 });
    hashMap.put("BE", new int[] { 0, 0, 0, 1 });
    hashMap.put("BF", new int[] { 4, 4, 4, 1 });
    hashMap.put("BG", new int[] { 0, 1, 0, 0 });
    hashMap.put("BH", new int[] { 2, 1, 3, 4 });
    hashMap.put("BI", new int[] { 4, 4, 4, 4 });
    hashMap.put("BJ", new int[] { 4, 4, 4, 4 });
    hashMap.put("BL", new int[] { 1, 0, 2, 2 });
    hashMap.put("BM", new int[] { 1, 2, 0, 0 });
    hashMap.put("BN", new int[] { 4, 1, 3, 2 });
    hashMap.put("BO", new int[] { 1, 2, 3, 2 });
    hashMap.put("BQ", new int[] { 1, 1, 2, 4 });
    hashMap.put("BR", new int[] { 2, 3, 3, 2 });
    hashMap.put("BS", new int[] { 2, 1, 1, 4 });
    hashMap.put("BT", new int[] { 3, 0, 3, 1 });
    hashMap.put("BW", new int[] { 4, 4, 1, 2 });
    hashMap.put("BY", new int[] { 0, 1, 1, 2 });
    hashMap.put("BZ", new int[] { 2, 2, 2, 1 });
    hashMap.put("CA", new int[] { 0, 3, 1, 3 });
    hashMap.put("CD", new int[] { 4, 4, 2, 2 });
    hashMap.put("CF", new int[] { 4, 4, 3, 0 });
    hashMap.put("CG", new int[] { 3, 4, 2, 4 });
    hashMap.put("CH", new int[] { 0, 0, 1, 0 });
    hashMap.put("CI", new int[] { 3, 4, 3, 3 });
    hashMap.put("CK", new int[] { 2, 4, 1, 0 });
    hashMap.put("CL", new int[] { 1, 2, 2, 3 });
    hashMap.put("CM", new int[] { 3, 4, 3, 1 });
    hashMap.put("CN", new int[] { 2, 0, 2, 3 });
    hashMap.put("CO", new int[] { 2, 3, 2, 2 });
    hashMap.put("CR", new int[] { 2, 3, 4, 4 });
    hashMap.put("CU", new int[] { 4, 4, 3, 1 });
    hashMap.put("CV", new int[] { 2, 3, 1, 2 });
    hashMap.put("CW", new int[] { 1, 1, 0, 0 });
    hashMap.put("CY", new int[] { 1, 1, 0, 0 });
    hashMap.put("CZ", new int[] { 0, 1, 0, 0 });
    hashMap.put("DE", new int[] { 0, 1, 1, 3 });
    hashMap.put("DJ", new int[] { 4, 3, 4, 1 });
    hashMap.put("DK", new int[] { 0, 0, 1, 1 });
    hashMap.put("DM", new int[] { 1, 0, 1, 3 });
    hashMap.put("DO", new int[] { 3, 3, 4, 4 });
    hashMap.put("DZ", new int[] { 3, 3, 4, 4 });
    hashMap.put("EC", new int[] { 2, 3, 4, 3 });
    hashMap.put("EE", new int[] { 0, 1, 0, 0 });
    hashMap.put("EG", new int[] { 3, 4, 2, 2 });
    hashMap.put("EH", new int[] { 2, 0, 3, 3 });
    hashMap.put("ER", new int[] { 4, 2, 2, 0 });
    hashMap.put("ES", new int[] { 0, 1, 1, 1 });
    hashMap.put("ET", new int[] { 4, 4, 4, 0 });
    hashMap.put("FI", new int[] { 0, 0, 1, 0 });
    hashMap.put("FJ", new int[] { 3, 0, 3, 3 });
    hashMap.put("FK", new int[] { 3, 4, 2, 2 });
    hashMap.put("FM", new int[] { 4, 0, 4, 0 });
    hashMap.put("FO", new int[] { 0, 0, 0, 0 });
    hashMap.put("FR", new int[] { 1, 0, 3, 1 });
    hashMap.put("GA", new int[] { 3, 3, 2, 2 });
    hashMap.put("GB", new int[] { 0, 1, 3, 3 });
    hashMap.put("GD", new int[] { 2, 0, 4, 4 });
    hashMap.put("GE", new int[] { 1, 1, 1, 4 });
    hashMap.put("GF", new int[] { 2, 3, 4, 4 });
    hashMap.put("GG", new int[] { 0, 1, 0, 0 });
    hashMap.put("GH", new int[] { 3, 3, 2, 2 });
    hashMap.put("GI", new int[] { 0, 0, 0, 1 });
    hashMap.put("GL", new int[] { 2, 2, 0, 2 });
    hashMap.put("GM", new int[] { 4, 4, 3, 4 });
    hashMap.put("GN", new int[] { 3, 4, 4, 2 });
    hashMap.put("GP", new int[] { 2, 1, 1, 4 });
    hashMap.put("GQ", new int[] { 4, 4, 3, 0 });
    hashMap.put("GR", new int[] { 1, 1, 0, 2 });
    hashMap.put("GT", new int[] { 3, 3, 3, 3 });
    hashMap.put("GU", new int[] { 1, 2, 4, 4 });
    hashMap.put("GW", new int[] { 4, 4, 4, 1 });
    hashMap.put("GY", new int[] { 3, 2, 1, 1 });
    hashMap.put("HK", new int[] { 0, 2, 3, 4 });
    hashMap.put("HN", new int[] { 3, 2, 3, 2 });
    hashMap.put("HR", new int[] { 1, 1, 0, 1 });
    hashMap.put("HT", new int[] { 4, 4, 4, 4 });
    hashMap.put("HU", new int[] { 0, 1, 0, 0 });
    hashMap.put("ID", new int[] { 3, 2, 3, 4 });
    hashMap.put("IE", new int[] { 1, 0, 1, 1 });
    hashMap.put("IL", new int[] { 0, 0, 2, 3 });
    hashMap.put("IM", new int[] { 0, 0, 0, 1 });
    hashMap.put("IN", new int[] { 2, 2, 4, 4 });
    hashMap.put("IO", new int[] { 4, 2, 2, 2 });
    hashMap.put("IQ", new int[] { 3, 3, 4, 2 });
    hashMap.put("IR", new int[] { 3, 0, 2, 2 });
    hashMap.put("IS", new int[] { 0, 1, 0, 0 });
    hashMap.put("IT", new int[] { 1, 0, 1, 2 });
    hashMap.put("JE", new int[] { 1, 0, 0, 1 });
    hashMap.put("JM", new int[] { 2, 3, 3, 1 });
    hashMap.put("JO", new int[] { 1, 2, 1, 2 });
    hashMap.put("JP", new int[] { 0, 2, 1, 1 });
    hashMap.put("KE", new int[] { 3, 4, 4, 3 });
    hashMap.put("KG", new int[] { 1, 1, 2, 2 });
    hashMap.put("KH", new int[] { 1, 0, 4, 4 });
    hashMap.put("KI", new int[] { 4, 4, 4, 4 });
    hashMap.put("KM", new int[] { 4, 3, 2, 3 });
    hashMap.put("KN", new int[] { 1, 0, 1, 3 });
    hashMap.put("KP", new int[] { 4, 2, 4, 2 });
    hashMap.put("KR", new int[] { 0, 1, 1, 1 });
    hashMap.put("KW", new int[] { 2, 3, 1, 1 });
    hashMap.put("KY", new int[] { 1, 1, 0, 1 });
    hashMap.put("KZ", new int[] { 1, 2, 2, 3 });
    hashMap.put("LA", new int[] { 2, 2, 1, 1 });
    hashMap.put("LB", new int[] { 3, 2, 0, 0 });
    hashMap.put("LC", new int[] { 1, 1, 0, 0 });
    hashMap.put("LI", new int[] { 0, 0, 2, 4 });
    hashMap.put("LK", new int[] { 2, 1, 2, 3 });
    hashMap.put("LR", new int[] { 3, 4, 3, 1 });
    hashMap.put("LS", new int[] { 3, 3, 2, 0 });
    hashMap.put("LT", new int[] { 0, 0, 0, 0 });
    hashMap.put("LU", new int[] { 0, 0, 0, 0 });
    hashMap.put("LV", new int[] { 0, 0, 0, 0 });
    hashMap.put("LY", new int[] { 4, 4, 4, 4 });
    hashMap.put("MA", new int[] { 2, 1, 2, 1 });
    hashMap.put("MC", new int[] { 0, 0, 0, 1 });
    hashMap.put("MD", new int[] { 1, 1, 0, 0 });
    hashMap.put("ME", new int[] { 1, 2, 1, 2 });
    hashMap.put("MF", new int[] { 1, 1, 1, 1 });
    hashMap.put("MG", new int[] { 3, 4, 2, 2 });
    hashMap.put("MH", new int[] { 4, 0, 2, 4 });
    hashMap.put("MK", new int[] { 1, 0, 0, 0 });
    hashMap.put("ML", new int[] { 4, 4, 2, 0 });
    hashMap.put("MM", new int[] { 3, 3, 1, 2 });
    hashMap.put("MN", new int[] { 2, 3, 2, 3 });
    hashMap.put("MO", new int[] { 0, 0, 4, 4 });
    hashMap.put("MP", new int[] { 0, 2, 4, 4 });
    hashMap.put("MQ", new int[] { 2, 1, 1, 4 });
    hashMap.put("MR", new int[] { 4, 2, 4, 2 });
    hashMap.put("MS", new int[] { 1, 2, 3, 3 });
    hashMap.put("MT", new int[] { 0, 1, 0, 0 });
    hashMap.put("MU", new int[] { 2, 2, 3, 4 });
    hashMap.put("MV", new int[] { 4, 3, 0, 2 });
    hashMap.put("MW", new int[] { 3, 2, 1, 0 });
    hashMap.put("MX", new int[] { 2, 4, 4, 3 });
    hashMap.put("MY", new int[] { 2, 2, 3, 3 });
    hashMap.put("MZ", new int[] { 3, 3, 2, 1 });
    hashMap.put("NA", new int[] { 3, 3, 2, 1 });
    hashMap.put("NC", new int[] { 2, 0, 3, 3 });
    hashMap.put("NE", new int[] { 4, 4, 4, 3 });
    hashMap.put("NF", new int[] { 1, 2, 2, 2 });
    hashMap.put("NG", new int[] { 3, 4, 3, 1 });
    hashMap.put("NI", new int[] { 3, 3, 4, 4 });
    hashMap.put("NL", new int[] { 0, 2, 3, 3 });
    hashMap.put("NO", new int[] { 0, 1, 1, 0 });
    hashMap.put("NP", new int[] { 2, 2, 2, 2 });
    hashMap.put("NR", new int[] { 4, 0, 3, 1 });
    hashMap.put("NZ", new int[] { 0, 0, 1, 2 });
    hashMap.put("OM", new int[] { 3, 2, 1, 3 });
    hashMap.put("PA", new int[] { 1, 3, 3, 4 });
    hashMap.put("PE", new int[] { 2, 3, 4, 4 });
    hashMap.put("PF", new int[] { 2, 2, 0, 1 });
    hashMap.put("PG", new int[] { 4, 3, 3, 1 });
    hashMap.put("PH", new int[] { 3, 0, 3, 4 });
    hashMap.put("PK", new int[] { 3, 3, 3, 3 });
    hashMap.put("PL", new int[] { 1, 0, 1, 3 });
    hashMap.put("PM", new int[] { 0, 2, 2, 0 });
    hashMap.put("PR", new int[] { 1, 2, 3, 3 });
    hashMap.put("PS", new int[] { 3, 3, 2, 4 });
    hashMap.put("PT", new int[] { 1, 1, 0, 0 });
    hashMap.put("PW", new int[] { 2, 1, 2, 0 });
    hashMap.put("PY", new int[] { 2, 0, 2, 3 });
    hashMap.put("QA", new int[] { 2, 2, 1, 2 });
    hashMap.put("RE", new int[] { 1, 0, 2, 2 });
    hashMap.put("RO", new int[] { 0, 1, 1, 2 });
    hashMap.put("RS", new int[] { 1, 2, 0, 0 });
    hashMap.put("RU", new int[] { 0, 1, 1, 1 });
    hashMap.put("RW", new int[] { 4, 4, 2, 4 });
    hashMap.put("SA", new int[] { 2, 2, 2, 1 });
    hashMap.put("SB", new int[] { 4, 4, 3, 0 });
    hashMap.put("SC", new int[] { 4, 2, 0, 1 });
    hashMap.put("SD", new int[] { 4, 4, 4, 3 });
    hashMap.put("SE", new int[] { 0, 1, 0, 0 });
    hashMap.put("SG", new int[] { 0, 2, 3, 3 });
    hashMap.put("SH", new int[] { 4, 4, 2, 3 });
    hashMap.put("SI", new int[] { 0, 0, 0, 0 });
    hashMap.put("SJ", new int[] { 2, 0, 2, 4 });
    hashMap.put("SK", new int[] { 0, 1, 0, 0 });
    hashMap.put("SL", new int[] { 4, 3, 3, 3 });
    hashMap.put("SM", new int[] { 0, 0, 2, 4 });
    hashMap.put("SN", new int[] { 3, 4, 4, 2 });
    hashMap.put("SO", new int[] { 3, 4, 4, 3 });
    hashMap.put("SR", new int[] { 2, 2, 1, 0 });
    hashMap.put("SS", new int[] { 4, 3, 4, 3 });
    hashMap.put("ST", new int[] { 3, 4, 2, 2 });
    hashMap.put("SV", new int[] { 2, 3, 3, 4 });
    hashMap.put("SX", new int[] { 2, 4, 1, 0 });
    hashMap.put("SY", new int[] { 4, 3, 2, 1 });
    hashMap.put("SZ", new int[] { 4, 4, 3, 4 });
    hashMap.put("TC", new int[] { 1, 2, 1, 1 });
    hashMap.put("TD", new int[] { 4, 4, 4, 2 });
    hashMap.put("TG", new int[] { 3, 3, 1, 0 });
    hashMap.put("TH", new int[] { 1, 3, 4, 4 });
    hashMap.put("TJ", new int[] { 4, 4, 4, 4 });
    hashMap.put("TL", new int[] { 4, 2, 4, 4 });
    hashMap.put("TM", new int[] { 4, 1, 2, 2 });
    hashMap.put("TN", new int[] { 2, 2, 1, 2 });
    hashMap.put("TO", new int[] { 3, 3, 3, 1 });
    hashMap.put("TR", new int[] { 2, 2, 1, 2 });
    hashMap.put("TT", new int[] { 1, 3, 1, 2 });
    hashMap.put("TV", new int[] { 4, 2, 2, 4 });
    hashMap.put("TW", new int[] { 0, 0, 0, 0 });
    hashMap.put("TZ", new int[] { 3, 3, 4, 3 });
    hashMap.put("UA", new int[] { 0, 2, 1, 2 });
    hashMap.put("UG", new int[] { 4, 3, 3, 2 });
    hashMap.put("US", new int[] { 1, 1, 3, 3 });
    hashMap.put("UY", new int[] { 2, 2, 1, 1 });
    hashMap.put("UZ", new int[] { 2, 2, 2, 2 });
    hashMap.put("VA", new int[] { 1, 2, 4, 2 });
    hashMap.put("VC", new int[] { 2, 0, 2, 4 });
    hashMap.put("VE", new int[] { 4, 4, 4, 3 });
    hashMap.put("VG", new int[] { 3, 0, 1, 3 });
    hashMap.put("VI", new int[] { 1, 1, 4, 4 });
    hashMap.put("VN", new int[] { 0, 2, 4, 4 });
    hashMap.put("VU", new int[] { 4, 1, 3, 1 });
    hashMap.put("WS", new int[] { 3, 3, 3, 2 });
    hashMap.put("XK", new int[] { 1, 2, 1, 0 });
    hashMap.put("YE", new int[] { 4, 4, 4, 3 });
    hashMap.put("YT", new int[] { 2, 2, 2, 3 });
    hashMap.put("ZA", new int[] { 2, 4, 2, 2 });
    hashMap.put("ZM", new int[] { 3, 2, 2, 1 });
    hashMap.put("ZW", new int[] { 3, 3, 2, 1 });
    return (Map)Collections.unmodifiableMap(hashMap);
  }
  
  private long k(int paramInt) {
    Long long_1 = (Long)this.h.get(paramInt);
    Long long_2 = long_1;
    if (long_1 == null)
      long_2 = (Long)this.h.get(0); 
    long_1 = long_2;
    if (long_2 == null)
      long_1 = Long.valueOf(1000000L); 
    return long_1.longValue();
  }
  
  public static n l(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/android/exoplayer2/upstream/n
    //   2: monitorenter
    //   3: getstatic com/google/android/exoplayer2/upstream/n.f : Lcom/google/android/exoplayer2/upstream/n;
    //   6: ifnonnull -> 25
    //   9: new com/google/android/exoplayer2/upstream/n$b
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: invokespecial <init> : (Landroid/content/Context;)V
    //   18: aload_1
    //   19: invokevirtual a : ()Lcom/google/android/exoplayer2/upstream/n;
    //   22: putstatic com/google/android/exoplayer2/upstream/n.f : Lcom/google/android/exoplayer2/upstream/n;
    //   25: getstatic com/google/android/exoplayer2/upstream/n.f : Lcom/google/android/exoplayer2/upstream/n;
    //   28: astore_0
    //   29: ldc com/google/android/exoplayer2/upstream/n
    //   31: monitorexit
    //   32: aload_0
    //   33: areturn
    //   34: astore_0
    //   35: ldc com/google/android/exoplayer2/upstream/n
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   3	25	34	finally
    //   25	29	34	finally
  }
  
  private void n(int paramInt, long paramLong1, long paramLong2) {
    if (paramInt == 0 && paramLong1 == 0L && paramLong2 == this.s)
      return; 
    this.s = paramLong2;
    this.i.b(new b(paramInt, paramLong1, paramLong2));
  }
  
  private void o() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield t : Z
    //   6: ifeq -> 17
    //   9: aload_0
    //   10: getfield u : I
    //   13: istore_1
    //   14: goto -> 36
    //   17: aload_0
    //   18: getfield g : Landroid/content/Context;
    //   21: astore_2
    //   22: aload_2
    //   23: ifnonnull -> 31
    //   26: iconst_0
    //   27: istore_1
    //   28: goto -> 36
    //   31: aload_2
    //   32: invokestatic G : (Landroid/content/Context;)I
    //   35: istore_1
    //   36: aload_0
    //   37: getfield o : I
    //   40: istore_3
    //   41: iload_3
    //   42: iload_1
    //   43: if_icmpne -> 49
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: aload_0
    //   50: iload_1
    //   51: putfield o : I
    //   54: iload_1
    //   55: iconst_1
    //   56: if_icmpeq -> 157
    //   59: iload_1
    //   60: ifeq -> 157
    //   63: iload_1
    //   64: bipush #8
    //   66: if_icmpne -> 72
    //   69: goto -> 157
    //   72: aload_0
    //   73: aload_0
    //   74: iload_1
    //   75: invokespecial k : (I)J
    //   78: putfield r : J
    //   81: aload_0
    //   82: getfield k : Lcom/google/android/exoplayer2/util/f;
    //   85: invokeinterface b : ()J
    //   90: lstore #4
    //   92: aload_0
    //   93: getfield l : I
    //   96: ifle -> 111
    //   99: lload #4
    //   101: aload_0
    //   102: getfield m : J
    //   105: lsub
    //   106: l2i
    //   107: istore_1
    //   108: goto -> 113
    //   111: iconst_0
    //   112: istore_1
    //   113: aload_0
    //   114: iload_1
    //   115: aload_0
    //   116: getfield n : J
    //   119: aload_0
    //   120: getfield r : J
    //   123: invokespecial n : (IJJ)V
    //   126: aload_0
    //   127: lload #4
    //   129: putfield m : J
    //   132: aload_0
    //   133: lconst_0
    //   134: putfield n : J
    //   137: aload_0
    //   138: lconst_0
    //   139: putfield q : J
    //   142: aload_0
    //   143: lconst_0
    //   144: putfield p : J
    //   147: aload_0
    //   148: getfield j : Lcom/google/android/exoplayer2/util/z;
    //   151: invokevirtual g : ()V
    //   154: aload_0
    //   155: monitorexit
    //   156: return
    //   157: aload_0
    //   158: monitorexit
    //   159: return
    //   160: astore_2
    //   161: aload_0
    //   162: monitorexit
    //   163: aload_2
    //   164: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	160	finally
    //   17	22	160	finally
    //   31	36	160	finally
    //   36	41	160	finally
    //   49	54	160	finally
    //   72	108	160	finally
    //   113	154	160	finally
  }
  
  public void a(j paramj, l paraml, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_3
    //   3: ifne -> 9
    //   6: aload_0
    //   7: monitorexit
    //   8: return
    //   9: aload_0
    //   10: getfield l : I
    //   13: ifle -> 21
    //   16: iconst_1
    //   17: istore_3
    //   18: goto -> 23
    //   21: iconst_0
    //   22: istore_3
    //   23: iload_3
    //   24: invokestatic f : (Z)V
    //   27: aload_0
    //   28: getfield k : Lcom/google/android/exoplayer2/util/f;
    //   31: invokeinterface b : ()J
    //   36: lstore #4
    //   38: lload #4
    //   40: aload_0
    //   41: getfield m : J
    //   44: lsub
    //   45: l2i
    //   46: istore #6
    //   48: aload_0
    //   49: aload_0
    //   50: getfield p : J
    //   53: iload #6
    //   55: i2l
    //   56: ladd
    //   57: putfield p : J
    //   60: aload_0
    //   61: getfield q : J
    //   64: lstore #7
    //   66: aload_0
    //   67: getfield n : J
    //   70: lstore #9
    //   72: aload_0
    //   73: lload #7
    //   75: lload #9
    //   77: ladd
    //   78: putfield q : J
    //   81: iload #6
    //   83: ifle -> 177
    //   86: lload #9
    //   88: l2f
    //   89: ldc_w 8000.0
    //   92: fmul
    //   93: iload #6
    //   95: i2f
    //   96: fdiv
    //   97: fstore #11
    //   99: aload_0
    //   100: getfield j : Lcom/google/android/exoplayer2/util/z;
    //   103: lload #9
    //   105: l2d
    //   106: invokestatic sqrt : (D)D
    //   109: d2i
    //   110: fload #11
    //   112: invokevirtual a : (IF)V
    //   115: aload_0
    //   116: getfield p : J
    //   119: ldc2_w 2000
    //   122: lcmp
    //   123: ifge -> 137
    //   126: aload_0
    //   127: getfield q : J
    //   130: ldc2_w 524288
    //   133: lcmp
    //   134: iflt -> 152
    //   137: aload_0
    //   138: aload_0
    //   139: getfield j : Lcom/google/android/exoplayer2/util/z;
    //   142: ldc_w 0.5
    //   145: invokevirtual d : (F)F
    //   148: f2l
    //   149: putfield r : J
    //   152: aload_0
    //   153: iload #6
    //   155: aload_0
    //   156: getfield n : J
    //   159: aload_0
    //   160: getfield r : J
    //   163: invokespecial n : (IJJ)V
    //   166: aload_0
    //   167: lload #4
    //   169: putfield m : J
    //   172: aload_0
    //   173: lconst_0
    //   174: putfield n : J
    //   177: aload_0
    //   178: aload_0
    //   179: getfield l : I
    //   182: iconst_1
    //   183: isub
    //   184: putfield l : I
    //   187: aload_0
    //   188: monitorexit
    //   189: return
    //   190: astore_1
    //   191: aload_0
    //   192: monitorexit
    //   193: aload_1
    //   194: athrow
    // Exception table:
    //   from	to	target	type
    //   9	16	190	finally
    //   23	81	190	finally
    //   99	137	190	finally
    //   137	152	190	finally
    //   152	177	190	finally
    //   177	187	190	finally
  }
  
  public void b(j paramj, l paraml, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_3
    //   3: ifne -> 9
    //   6: aload_0
    //   7: monitorexit
    //   8: return
    //   9: aload_0
    //   10: getfield l : I
    //   13: ifne -> 29
    //   16: aload_0
    //   17: aload_0
    //   18: getfield k : Lcom/google/android/exoplayer2/util/f;
    //   21: invokeinterface b : ()J
    //   26: putfield m : J
    //   29: aload_0
    //   30: aload_0
    //   31: getfield l : I
    //   34: iconst_1
    //   35: iadd
    //   36: putfield l : I
    //   39: aload_0
    //   40: monitorexit
    //   41: return
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Exception table:
    //   from	to	target	type
    //   9	29	42	finally
    //   29	39	42	finally
  }
  
  public x c() {
    return this;
  }
  
  public void d(f.a parama) {
    this.i.c(parama);
  }
  
  public long e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield r : J
    //   6: lstore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: lload_1
    //   10: lreturn
    //   11: astore_3
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_3
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public void f(j paramj, l paraml, boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_3
    //   3: ifne -> 9
    //   6: aload_0
    //   7: monitorexit
    //   8: return
    //   9: aload_0
    //   10: aload_0
    //   11: getfield n : J
    //   14: iload #4
    //   16: i2l
    //   17: ladd
    //   18: putfield n : J
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   9	21	24	finally
  }
  
  public void g(Handler paramHandler, f.a parama) {
    this.i.a(paramHandler, parama);
  }
  
  public void h(j paramj, l paraml, boolean paramBoolean) {}
  
  public static final class b {
    private final Context a;
    
    private SparseArray<Long> b;
    
    private int c;
    
    private f d;
    
    private boolean e;
    
    public b(Context param1Context) {
      Context context;
      if (param1Context == null) {
        context = null;
      } else {
        context = param1Context.getApplicationContext();
      } 
      this.a = context;
      this.b = c(h0.A(param1Context));
      this.c = 2000;
      this.d = f.a;
      this.e = true;
    }
    
    private static int[] b(String param1String) {
      int[] arrayOfInt2 = n.a.get(param1String);
      int[] arrayOfInt1 = arrayOfInt2;
      if (arrayOfInt2 == null) {
        arrayOfInt1 = new int[4];
        arrayOfInt1[0] = 2;
        arrayOfInt1[1] = 2;
        arrayOfInt1[2] = 2;
        arrayOfInt1[3] = 2;
      } 
      return arrayOfInt1;
    }
    
    private static SparseArray<Long> c(String param1String) {
      int[] arrayOfInt = b(param1String);
      SparseArray<Long> sparseArray = new SparseArray(6);
      sparseArray.append(0, Long.valueOf(1000000L));
      long[] arrayOfLong = n.b;
      sparseArray.append(2, Long.valueOf(arrayOfLong[arrayOfInt[0]]));
      sparseArray.append(3, Long.valueOf(n.c[arrayOfInt[1]]));
      sparseArray.append(4, Long.valueOf(n.d[arrayOfInt[2]]));
      sparseArray.append(5, Long.valueOf(n.e[arrayOfInt[3]]));
      sparseArray.append(7, Long.valueOf(arrayOfLong[arrayOfInt[0]]));
      sparseArray.append(9, Long.valueOf(arrayOfLong[arrayOfInt[0]]));
      return sparseArray;
    }
    
    public n a() {
      return new n(this.a, this.b, this.c, this.d, this.e, null);
    }
  }
  
  private static class c extends BroadcastReceiver {
    private static c a;
    
    private final Handler b = new Handler(Looper.getMainLooper());
    
    private final ArrayList<WeakReference<n>> c = new ArrayList<WeakReference<n>>();
    
    public static c a(Context param1Context) {
      // Byte code:
      //   0: ldc com/google/android/exoplayer2/upstream/n$c
      //   2: monitorenter
      //   3: getstatic com/google/android/exoplayer2/upstream/n$c.a : Lcom/google/android/exoplayer2/upstream/n$c;
      //   6: ifnonnull -> 44
      //   9: new com/google/android/exoplayer2/upstream/n$c
      //   12: astore_1
      //   13: aload_1
      //   14: invokespecial <init> : ()V
      //   17: aload_1
      //   18: putstatic com/google/android/exoplayer2/upstream/n$c.a : Lcom/google/android/exoplayer2/upstream/n$c;
      //   21: new android/content/IntentFilter
      //   24: astore_1
      //   25: aload_1
      //   26: invokespecial <init> : ()V
      //   29: aload_1
      //   30: ldc 'android.net.conn.CONNECTIVITY_CHANGE'
      //   32: invokevirtual addAction : (Ljava/lang/String;)V
      //   35: aload_0
      //   36: getstatic com/google/android/exoplayer2/upstream/n$c.a : Lcom/google/android/exoplayer2/upstream/n$c;
      //   39: aload_1
      //   40: invokevirtual registerReceiver : (Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      //   43: pop
      //   44: getstatic com/google/android/exoplayer2/upstream/n$c.a : Lcom/google/android/exoplayer2/upstream/n$c;
      //   47: astore_0
      //   48: ldc com/google/android/exoplayer2/upstream/n$c
      //   50: monitorexit
      //   51: aload_0
      //   52: areturn
      //   53: astore_0
      //   54: ldc com/google/android/exoplayer2/upstream/n$c
      //   56: monitorexit
      //   57: aload_0
      //   58: athrow
      // Exception table:
      //   from	to	target	type
      //   3	44	53	finally
      //   44	48	53	finally
    }
    
    private void e() {
      for (int i = this.c.size() - 1; i >= 0; i--) {
        if ((n)((WeakReference<n>)this.c.get(i)).get() == null)
          this.c.remove(i); 
      } 
    }
    
    private void f(n param1n) {
      n.i(param1n);
    }
    
    public void d(n param1n) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokespecial e : ()V
      //   6: aload_0
      //   7: getfield c : Ljava/util/ArrayList;
      //   10: astore_2
      //   11: new java/lang/ref/WeakReference
      //   14: astore_3
      //   15: aload_3
      //   16: aload_1
      //   17: invokespecial <init> : (Ljava/lang/Object;)V
      //   20: aload_2
      //   21: aload_3
      //   22: invokevirtual add : (Ljava/lang/Object;)Z
      //   25: pop
      //   26: aload_0
      //   27: getfield b : Landroid/os/Handler;
      //   30: astore_3
      //   31: new com/google/android/exoplayer2/upstream/a
      //   34: astore_2
      //   35: aload_2
      //   36: aload_0
      //   37: aload_1
      //   38: invokespecial <init> : (Lcom/google/android/exoplayer2/upstream/n$c;Lcom/google/android/exoplayer2/upstream/n;)V
      //   41: aload_3
      //   42: aload_2
      //   43: invokevirtual post : (Ljava/lang/Runnable;)Z
      //   46: pop
      //   47: aload_0
      //   48: monitorexit
      //   49: return
      //   50: astore_1
      //   51: aload_0
      //   52: monitorexit
      //   53: aload_1
      //   54: athrow
      // Exception table:
      //   from	to	target	type
      //   2	47	50	finally
    }
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokevirtual isInitialStickyBroadcast : ()Z
      //   6: istore_3
      //   7: iload_3
      //   8: ifeq -> 14
      //   11: aload_0
      //   12: monitorexit
      //   13: return
      //   14: aload_0
      //   15: invokespecial e : ()V
      //   18: iconst_0
      //   19: istore #4
      //   21: iload #4
      //   23: aload_0
      //   24: getfield c : Ljava/util/ArrayList;
      //   27: invokevirtual size : ()I
      //   30: if_icmpge -> 67
      //   33: aload_0
      //   34: getfield c : Ljava/util/ArrayList;
      //   37: iload #4
      //   39: invokevirtual get : (I)Ljava/lang/Object;
      //   42: checkcast java/lang/ref/WeakReference
      //   45: invokevirtual get : ()Ljava/lang/Object;
      //   48: checkcast com/google/android/exoplayer2/upstream/n
      //   51: astore_1
      //   52: aload_1
      //   53: ifnull -> 61
      //   56: aload_0
      //   57: aload_1
      //   58: invokespecial f : (Lcom/google/android/exoplayer2/upstream/n;)V
      //   61: iinc #4, 1
      //   64: goto -> 21
      //   67: aload_0
      //   68: monitorexit
      //   69: return
      //   70: astore_1
      //   71: aload_0
      //   72: monitorexit
      //   73: goto -> 78
      //   76: aload_1
      //   77: athrow
      //   78: goto -> 76
      // Exception table:
      //   from	to	target	type
      //   2	7	70	finally
      //   14	18	70	finally
      //   21	52	70	finally
      //   56	61	70	finally
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */