package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class xn2 {
  private final ao2 a;
  
  private final ro2.a b = ro2.c0();
  
  private final boolean c;
  
  private xn2() {
    this.c = false;
    this.a = new ao2();
  }
  
  public xn2(ao2 paramao2) {
    this.a = paramao2;
    x<Boolean> x = m0.x3;
    this.c = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
  }
  
  private final void c(zztw$zza$zza paramzztw$zza$zza) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/google/android/gms/internal/ads/ro2$a;
    //   6: invokevirtual H : ()Lcom/google/android/gms/internal/ads/ro2$a;
    //   9: invokestatic g : ()Ljava/util/List;
    //   12: invokevirtual C : (Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/ro2$a;
    //   15: pop
    //   16: aload_0
    //   17: getfield a : Lcom/google/android/gms/internal/ads/ao2;
    //   20: aload_0
    //   21: getfield b : Lcom/google/android/gms/internal/ads/ro2$a;
    //   24: invokevirtual h : ()Lcom/google/android/gms/internal/ads/u52;
    //   27: checkcast com/google/android/gms/internal/ads/k42
    //   30: checkcast com/google/android/gms/internal/ads/ro2
    //   33: invokevirtual g : ()[B
    //   36: invokevirtual a : ([B)Lcom/google/android/gms/internal/ads/fo2;
    //   39: aload_1
    //   40: invokevirtual zzv : ()I
    //   43: invokevirtual c : (I)Lcom/google/android/gms/internal/ads/fo2;
    //   46: invokevirtual a : ()V
    //   49: aload_1
    //   50: invokevirtual zzv : ()I
    //   53: bipush #10
    //   55: invokestatic toString : (II)Ljava/lang/String;
    //   58: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   61: astore_1
    //   62: aload_1
    //   63: invokevirtual length : ()I
    //   66: ifeq -> 79
    //   69: ldc 'Logging Event with event code : '
    //   71: aload_1
    //   72: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   75: astore_1
    //   76: goto -> 89
    //   79: new java/lang/String
    //   82: dup
    //   83: ldc 'Logging Event with event code : '
    //   85: invokespecial <init> : (Ljava/lang/String;)V
    //   88: astore_1
    //   89: aload_1
    //   90: invokestatic m : (Ljava/lang/String;)V
    //   93: aload_0
    //   94: monitorexit
    //   95: return
    //   96: astore_1
    //   97: aload_0
    //   98: monitorexit
    //   99: aload_1
    //   100: athrow
    // Exception table:
    //   from	to	target	type
    //   2	76	96	finally
    //   79	89	96	finally
    //   89	93	96	finally
  }
  
  private final void d(zztw$zza$zza paramzztw$zza$zza) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic getExternalStorageDirectory : ()Ljava/io/File;
    //   5: astore_2
    //   6: aload_2
    //   7: ifnonnull -> 13
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: new java/io/File
    //   16: astore_3
    //   17: aload_3
    //   18: aload_2
    //   19: ldc 'clearcut_events.txt'
    //   21: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   24: new java/io/FileOutputStream
    //   27: astore_2
    //   28: aload_2
    //   29: aload_3
    //   30: iconst_1
    //   31: invokespecial <init> : (Ljava/io/File;Z)V
    //   34: aload_2
    //   35: aload_0
    //   36: aload_1
    //   37: invokespecial e : (Lcom/google/android/gms/internal/ads/zztw$zza$zza;)Ljava/lang/String;
    //   40: invokevirtual getBytes : ()[B
    //   43: invokevirtual write : ([B)V
    //   46: aload_2
    //   47: invokevirtual close : ()V
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: astore_1
    //   54: ldc 'Could not close Clearcut output stream.'
    //   56: invokestatic m : (Ljava/lang/String;)V
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: astore_1
    //   63: goto -> 88
    //   66: astore_1
    //   67: ldc 'Could not write Clearcut to file.'
    //   69: invokestatic m : (Ljava/lang/String;)V
    //   72: aload_2
    //   73: invokevirtual close : ()V
    //   76: aload_0
    //   77: monitorexit
    //   78: return
    //   79: astore_1
    //   80: ldc 'Could not close Clearcut output stream.'
    //   82: invokestatic m : (Ljava/lang/String;)V
    //   85: aload_0
    //   86: monitorexit
    //   87: return
    //   88: aload_2
    //   89: invokevirtual close : ()V
    //   92: goto -> 101
    //   95: astore_2
    //   96: ldc 'Could not close Clearcut output stream.'
    //   98: invokestatic m : (Ljava/lang/String;)V
    //   101: aload_1
    //   102: athrow
    //   103: astore_1
    //   104: ldc 'Could not find file for Clearcut'
    //   106: invokestatic m : (Ljava/lang/String;)V
    //   109: aload_0
    //   110: monitorexit
    //   111: return
    //   112: astore_1
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_1
    //   116: athrow
    // Exception table:
    //   from	to	target	type
    //   2	6	112	finally
    //   13	24	112	finally
    //   24	34	103	java/io/FileNotFoundException
    //   24	34	112	finally
    //   34	46	66	java/io/IOException
    //   34	46	62	finally
    //   46	50	53	java/io/IOException
    //   46	50	112	finally
    //   54	59	103	java/io/FileNotFoundException
    //   54	59	112	finally
    //   67	72	62	finally
    //   72	76	79	java/io/IOException
    //   72	76	112	finally
    //   80	85	103	java/io/FileNotFoundException
    //   80	85	112	finally
    //   88	92	95	java/io/IOException
    //   88	92	112	finally
    //   96	101	103	java/io/FileNotFoundException
    //   96	101	112	finally
    //   101	103	103	java/io/FileNotFoundException
    //   101	103	112	finally
    //   104	109	112	finally
  }
  
  private final String e(zztw$zza$zza paramzztw$zza$zza) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'id=%s,timestamp=%s,event=%s,data=%s\\n'
    //   4: iconst_4
    //   5: anewarray java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: aload_0
    //   11: getfield b : Lcom/google/android/gms/internal/ads/ro2$a;
    //   14: invokevirtual E : ()Ljava/lang/String;
    //   17: aastore
    //   18: dup
    //   19: iconst_1
    //   20: invokestatic j : ()Lcom/google/android/gms/common/util/e;
    //   23: invokeinterface b : ()J
    //   28: invokestatic valueOf : (J)Ljava/lang/Long;
    //   31: aastore
    //   32: dup
    //   33: iconst_2
    //   34: aload_1
    //   35: invokevirtual zzv : ()I
    //   38: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   41: aastore
    //   42: dup
    //   43: iconst_3
    //   44: aload_0
    //   45: getfield b : Lcom/google/android/gms/internal/ads/ro2$a;
    //   48: invokevirtual h : ()Lcom/google/android/gms/internal/ads/u52;
    //   51: checkcast com/google/android/gms/internal/ads/k42
    //   54: checkcast com/google/android/gms/internal/ads/ro2
    //   57: invokevirtual g : ()[B
    //   60: iconst_3
    //   61: invokestatic encodeToString : ([BI)Ljava/lang/String;
    //   64: aastore
    //   65: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: areturn
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_1
    //   77: athrow
    // Exception table:
    //   from	to	target	type
    //   2	69	73	finally
  }
  
  public static xn2 f() {
    return new xn2();
  }
  
  private static List<Long> g() {
    List<String> list = m0.e();
    ArrayList<Long> arrayList = new ArrayList();
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      for (String str : ((String)iterator.next()).split(",")) {
        try {
          arrayList.add(Long.valueOf(str));
        } catch (NumberFormatException numberFormatException) {
          b1.m("Experiment ID is not a number");
        } 
      } 
    } 
    return arrayList;
  }
  
  public final void a(zztw$zza$zza paramzztw$zza$zza) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: getstatic com/google/android/gms/internal/ads/m0.y3 : Lcom/google/android/gms/internal/ads/x;
    //   17: astore_3
    //   18: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   21: aload_3
    //   22: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   25: checkcast java/lang/Boolean
    //   28: invokevirtual booleanValue : ()Z
    //   31: ifeq -> 42
    //   34: aload_0
    //   35: aload_1
    //   36: invokespecial d : (Lcom/google/android/gms/internal/ads/zztw$zza$zza;)V
    //   39: aload_0
    //   40: monitorexit
    //   41: return
    //   42: aload_0
    //   43: aload_1
    //   44: invokespecial c : (Lcom/google/android/gms/internal/ads/zztw$zza$zza;)V
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
    //   2	7	50	finally
    //   14	39	50	finally
    //   42	47	50	finally
  }
  
  public final void b(zn2 paramzn2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 35
    //   11: aload_1
    //   12: aload_0
    //   13: getfield b : Lcom/google/android/gms/internal/ads/ro2$a;
    //   16: invokeinterface a : (Lcom/google/android/gms/internal/ads/ro2$a;)V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore_1
    //   25: invokestatic g : ()Lcom/google/android/gms/internal/ads/fl;
    //   28: aload_1
    //   29: ldc_w 'AdMobClearcutLogger.modify'
    //   32: invokevirtual e : (Ljava/lang/Throwable;Ljava/lang/String;)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: astore_1
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	38	finally
    //   11	21	24	java/lang/NullPointerException
    //   11	21	38	finally
    //   25	35	38	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xn2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */