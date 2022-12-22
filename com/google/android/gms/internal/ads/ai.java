package com.google.android.gms.internal.ads;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ai implements me2 {
  private final Map<String, vj> a = new LinkedHashMap<String, vj>(16, 0.75F, true);
  
  private long b = 0L;
  
  private final rl c;
  
  private final int d;
  
  public ai(rl paramrl) {
    this(paramrl, 5242880);
  }
  
  private ai(rl paramrl, int paramInt) {
    this.c = paramrl;
    this.d = 5242880;
  }
  
  public ai(File paramFile, int paramInt) {
    this.c = new vk(this, paramFile);
    this.d = 20971520;
  }
  
  private final void d(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial r : (Ljava/lang/String;)Ljava/io/File;
    //   7: invokevirtual delete : ()Z
    //   10: istore_2
    //   11: aload_0
    //   12: aload_1
    //   13: invokespecial e : (Ljava/lang/String;)V
    //   16: iload_2
    //   17: ifne -> 40
    //   20: ldc 'Could not delete cache entry for key=%s, filename=%s'
    //   22: iconst_2
    //   23: anewarray java/lang/Object
    //   26: dup
    //   27: iconst_0
    //   28: aload_1
    //   29: aastore
    //   30: dup
    //   31: iconst_1
    //   32: aload_1
    //   33: invokestatic q : (Ljava/lang/String;)Ljava/lang/String;
    //   36: aastore
    //   37: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	43	finally
    //   20	40	43	finally
  }
  
  private final void e(String paramString) {
    vj vj = this.a.remove(paramString);
    if (vj != null)
      this.b -= vj.a; 
  }
  
  private static int f(InputStream paramInputStream) {
    int i = paramInputStream.read();
    if (i != -1)
      return i; 
    throw new EOFException();
  }
  
  private static InputStream g(File paramFile) {
    return new FileInputStream(paramFile);
  }
  
  static String h(rm paramrm) {
    return new String(m(paramrm, p(paramrm)), "UTF-8");
  }
  
  static void i(OutputStream paramOutputStream, int paramInt) {
    paramOutputStream.write(paramInt & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >>> 24);
  }
  
  static void j(OutputStream paramOutputStream, long paramLong) {
    paramOutputStream.write((byte)(int)paramLong);
    paramOutputStream.write((byte)(int)(paramLong >>> 8L));
    paramOutputStream.write((byte)(int)(paramLong >>> 16L));
    paramOutputStream.write((byte)(int)(paramLong >>> 24L));
    paramOutputStream.write((byte)(int)(paramLong >>> 32L));
    paramOutputStream.write((byte)(int)(paramLong >>> 40L));
    paramOutputStream.write((byte)(int)(paramLong >>> 48L));
    paramOutputStream.write((byte)(int)(paramLong >>> 56L));
  }
  
  static void k(OutputStream paramOutputStream, String paramString) {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    j(paramOutputStream, arrayOfByte.length);
    paramOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private final void l(String paramString, vj paramvj) {
    if (!this.a.containsKey(paramString)) {
      this.b += paramvj.a;
    } else {
      vj vj1 = this.a.get(paramString);
      this.b += paramvj.a - vj1.a;
    } 
    this.a.put(paramString, paramvj);
  }
  
  private static byte[] m(rm paramrm, long paramLong) {
    long l = paramrm.b();
    if (paramLong >= 0L && paramLong <= l) {
      int i = (int)paramLong;
      if (i == paramLong) {
        byte[] arrayOfByte = new byte[i];
        (new DataInputStream(paramrm)).readFully(arrayOfByte);
        return arrayOfByte;
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder(73);
    stringBuilder.append("streamToBytes length=");
    stringBuilder.append(paramLong);
    stringBuilder.append(", maxLength=");
    stringBuilder.append(l);
    throw new IOException(stringBuilder.toString());
  }
  
  static int n(InputStream paramInputStream) {
    int i = f(paramInputStream);
    int j = f(paramInputStream);
    int k = f(paramInputStream);
    return f(paramInputStream) << 24 | i | 0x0 | j << 8 | k << 16;
  }
  
  static List<yp2> o(rm paramrm) {
    int i = n(paramrm);
    if (i >= 0) {
      List<?> list;
      if (i == 0) {
        list = Collections.emptyList();
      } else {
        list = new ArrayList();
      } 
      for (byte b = 0; b < i; b++)
        list.add(new yp2(h(paramrm).intern(), h(paramrm).intern())); 
      return (List)list;
    } 
    StringBuilder stringBuilder = new StringBuilder(31);
    stringBuilder.append("readHeaderList size=");
    stringBuilder.append(i);
    IOException iOException = new IOException(stringBuilder.toString());
    throw iOException;
  }
  
  static long p(InputStream paramInputStream) {
    return f(paramInputStream) & 0xFFL | 0x0L | (f(paramInputStream) & 0xFFL) << 8L | (f(paramInputStream) & 0xFFL) << 16L | (f(paramInputStream) & 0xFFL) << 24L | (f(paramInputStream) & 0xFFL) << 32L | (f(paramInputStream) & 0xFFL) << 40L | (f(paramInputStream) & 0xFFL) << 48L | (0xFFL & f(paramInputStream)) << 56L;
  }
  
  private static String q(String paramString) {
    int i = paramString.length() / 2;
    String str = String.valueOf(String.valueOf(paramString.substring(0, i).hashCode()));
    paramString = String.valueOf(String.valueOf(paramString.substring(i).hashCode()));
    return (paramString.length() != 0) ? str.concat(paramString) : new String(str);
  }
  
  private final File r(String paramString) {
    return new File(this.c.g(), q(paramString));
  }
  
  public final void D() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/google/android/gms/internal/ads/rl;
    //   6: invokeinterface g : ()Ljava/io/File;
    //   11: astore_1
    //   12: aload_1
    //   13: invokevirtual exists : ()Z
    //   16: istore_2
    //   17: iconst_0
    //   18: istore_3
    //   19: iload_2
    //   20: ifne -> 50
    //   23: aload_1
    //   24: invokevirtual mkdirs : ()Z
    //   27: ifne -> 47
    //   30: ldc_w 'Unable to create cache dir %s'
    //   33: iconst_1
    //   34: anewarray java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: aload_1
    //   40: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   43: aastore
    //   44: invokestatic b : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: aload_0
    //   48: monitorexit
    //   49: return
    //   50: aload_1
    //   51: invokevirtual listFiles : ()[Ljava/io/File;
    //   54: astore_1
    //   55: aload_1
    //   56: ifnonnull -> 62
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: aload_1
    //   63: arraylength
    //   64: istore #4
    //   66: iload_3
    //   67: iload #4
    //   69: if_icmpge -> 170
    //   72: aload_1
    //   73: iload_3
    //   74: aaload
    //   75: astore #5
    //   77: aload #5
    //   79: invokevirtual length : ()J
    //   82: lstore #6
    //   84: new com/google/android/gms/internal/ads/rm
    //   87: astore #8
    //   89: new java/io/BufferedInputStream
    //   92: astore #9
    //   94: aload #9
    //   96: aload #5
    //   98: invokestatic g : (Ljava/io/File;)Ljava/io/InputStream;
    //   101: invokespecial <init> : (Ljava/io/InputStream;)V
    //   104: aload #8
    //   106: aload #9
    //   108: lload #6
    //   110: invokespecial <init> : (Ljava/io/InputStream;J)V
    //   113: aload #8
    //   115: invokestatic b : (Lcom/google/android/gms/internal/ads/rm;)Lcom/google/android/gms/internal/ads/vj;
    //   118: astore #9
    //   120: aload #9
    //   122: lload #6
    //   124: putfield a : J
    //   127: aload_0
    //   128: aload #9
    //   130: getfield b : Ljava/lang/String;
    //   133: aload #9
    //   135: invokespecial l : (Ljava/lang/String;Lcom/google/android/gms/internal/ads/vj;)V
    //   138: aload #8
    //   140: invokevirtual close : ()V
    //   143: goto -> 164
    //   146: astore #9
    //   148: aload #8
    //   150: invokevirtual close : ()V
    //   153: aload #9
    //   155: athrow
    //   156: astore #8
    //   158: aload #5
    //   160: invokevirtual delete : ()Z
    //   163: pop
    //   164: iinc #3, 1
    //   167: goto -> 66
    //   170: aload_0
    //   171: monitorexit
    //   172: return
    //   173: astore_1
    //   174: aload_0
    //   175: monitorexit
    //   176: goto -> 181
    //   179: aload_1
    //   180: athrow
    //   181: goto -> 179
    // Exception table:
    //   from	to	target	type
    //   2	17	173	finally
    //   23	47	173	finally
    //   50	55	173	finally
    //   62	66	173	finally
    //   77	113	156	java/io/IOException
    //   77	113	173	finally
    //   113	138	146	finally
    //   138	143	156	java/io/IOException
    //   138	143	173	finally
    //   148	156	156	java/io/IOException
    //   148	156	173	finally
    //   158	164	173	finally
  }
  
  public final hh2 a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast com/google/android/gms/internal/ads/vj
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: aload_0
    //   25: aload_1
    //   26: invokespecial r : (Ljava/lang/String;)Ljava/io/File;
    //   29: astore_3
    //   30: new com/google/android/gms/internal/ads/rm
    //   33: astore #4
    //   35: new java/io/BufferedInputStream
    //   38: astore #5
    //   40: aload #5
    //   42: aload_3
    //   43: invokestatic g : (Ljava/io/File;)Ljava/io/InputStream;
    //   46: invokespecial <init> : (Ljava/io/InputStream;)V
    //   49: aload #4
    //   51: aload #5
    //   53: aload_3
    //   54: invokevirtual length : ()J
    //   57: invokespecial <init> : (Ljava/io/InputStream;J)V
    //   60: aload #4
    //   62: invokestatic b : (Lcom/google/android/gms/internal/ads/rm;)Lcom/google/android/gms/internal/ads/vj;
    //   65: astore #5
    //   67: aload_1
    //   68: aload #5
    //   70: getfield b : Ljava/lang/String;
    //   73: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   76: ifne -> 122
    //   79: ldc_w '%s: key=%s, found=%s'
    //   82: iconst_3
    //   83: anewarray java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_3
    //   89: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   92: aastore
    //   93: dup
    //   94: iconst_1
    //   95: aload_1
    //   96: aastore
    //   97: dup
    //   98: iconst_2
    //   99: aload #5
    //   101: getfield b : Ljava/lang/String;
    //   104: aastore
    //   105: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: aload_0
    //   109: aload_1
    //   110: invokespecial e : (Ljava/lang/String;)V
    //   113: aload #4
    //   115: invokevirtual close : ()V
    //   118: aload_0
    //   119: monitorexit
    //   120: aconst_null
    //   121: areturn
    //   122: aload #4
    //   124: aload #4
    //   126: invokevirtual b : ()J
    //   129: invokestatic m : (Lcom/google/android/gms/internal/ads/rm;J)[B
    //   132: astore #6
    //   134: new com/google/android/gms/internal/ads/hh2
    //   137: astore #5
    //   139: aload #5
    //   141: invokespecial <init> : ()V
    //   144: aload #5
    //   146: aload #6
    //   148: putfield a : [B
    //   151: aload #5
    //   153: aload_2
    //   154: getfield c : Ljava/lang/String;
    //   157: putfield b : Ljava/lang/String;
    //   160: aload #5
    //   162: aload_2
    //   163: getfield d : J
    //   166: putfield c : J
    //   169: aload #5
    //   171: aload_2
    //   172: getfield e : J
    //   175: putfield d : J
    //   178: aload #5
    //   180: aload_2
    //   181: getfield f : J
    //   184: putfield e : J
    //   187: aload #5
    //   189: aload_2
    //   190: getfield g : J
    //   193: putfield f : J
    //   196: aload_2
    //   197: getfield h : Ljava/util/List;
    //   200: astore #7
    //   202: new java/util/TreeMap
    //   205: astore #6
    //   207: aload #6
    //   209: getstatic java/lang/String.CASE_INSENSITIVE_ORDER : Ljava/util/Comparator;
    //   212: invokespecial <init> : (Ljava/util/Comparator;)V
    //   215: aload #7
    //   217: invokeinterface iterator : ()Ljava/util/Iterator;
    //   222: astore #8
    //   224: aload #8
    //   226: invokeinterface hasNext : ()Z
    //   231: ifeq -> 267
    //   234: aload #8
    //   236: invokeinterface next : ()Ljava/lang/Object;
    //   241: checkcast com/google/android/gms/internal/ads/yp2
    //   244: astore #7
    //   246: aload #6
    //   248: aload #7
    //   250: invokevirtual a : ()Ljava/lang/String;
    //   253: aload #7
    //   255: invokevirtual b : ()Ljava/lang/String;
    //   258: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   263: pop
    //   264: goto -> 224
    //   267: aload #5
    //   269: aload #6
    //   271: putfield g : Ljava/util/Map;
    //   274: aload #5
    //   276: aload_2
    //   277: getfield h : Ljava/util/List;
    //   280: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   283: putfield h : Ljava/util/List;
    //   286: aload #4
    //   288: invokevirtual close : ()V
    //   291: aload_0
    //   292: monitorexit
    //   293: aload #5
    //   295: areturn
    //   296: astore_2
    //   297: aload #4
    //   299: invokevirtual close : ()V
    //   302: aload_2
    //   303: athrow
    //   304: astore #4
    //   306: ldc_w '%s: %s'
    //   309: iconst_2
    //   310: anewarray java/lang/Object
    //   313: dup
    //   314: iconst_0
    //   315: aload_3
    //   316: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   319: aastore
    //   320: dup
    //   321: iconst_1
    //   322: aload #4
    //   324: invokevirtual toString : ()Ljava/lang/String;
    //   327: aastore
    //   328: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: aload_0
    //   332: aload_1
    //   333: invokespecial d : (Ljava/lang/String;)V
    //   336: aload_0
    //   337: monitorexit
    //   338: aconst_null
    //   339: areturn
    //   340: astore_1
    //   341: aload_0
    //   342: monitorexit
    //   343: goto -> 348
    //   346: aload_1
    //   347: athrow
    //   348: goto -> 346
    // Exception table:
    //   from	to	target	type
    //   2	16	340	finally
    //   24	30	340	finally
    //   30	60	304	java/io/IOException
    //   30	60	340	finally
    //   60	113	296	finally
    //   113	118	304	java/io/IOException
    //   113	118	340	finally
    //   122	224	296	finally
    //   224	264	296	finally
    //   267	286	296	finally
    //   286	291	304	java/io/IOException
    //   286	291	340	finally
    //   297	304	304	java/io/IOException
    //   297	304	340	finally
    //   306	336	340	finally
  }
  
  public final void b(String paramString, hh2 paramhh2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : J
    //   6: lstore_3
    //   7: aload_2
    //   8: getfield a : [B
    //   11: astore #5
    //   13: aload #5
    //   15: arraylength
    //   16: i2l
    //   17: lstore #6
    //   19: aload_0
    //   20: getfield d : I
    //   23: istore #8
    //   25: lload_3
    //   26: lload #6
    //   28: ladd
    //   29: iload #8
    //   31: i2l
    //   32: lcmp
    //   33: ifle -> 58
    //   36: aload #5
    //   38: arraylength
    //   39: istore #9
    //   41: iload #9
    //   43: i2f
    //   44: iload #8
    //   46: i2f
    //   47: ldc_w 0.9
    //   50: fmul
    //   51: fcmpl
    //   52: ifle -> 58
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: aload_0
    //   59: aload_1
    //   60: invokespecial r : (Ljava/lang/String;)Ljava/io/File;
    //   63: astore #5
    //   65: new java/io/BufferedOutputStream
    //   68: astore #10
    //   70: new java/io/FileOutputStream
    //   73: astore #11
    //   75: aload #11
    //   77: aload #5
    //   79: invokespecial <init> : (Ljava/io/File;)V
    //   82: aload #10
    //   84: aload #11
    //   86: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   89: new com/google/android/gms/internal/ads/vj
    //   92: astore #11
    //   94: aload #11
    //   96: aload_1
    //   97: aload_2
    //   98: invokespecial <init> : (Ljava/lang/String;Lcom/google/android/gms/internal/ads/hh2;)V
    //   101: aload #11
    //   103: aload #10
    //   105: invokevirtual a : (Ljava/io/OutputStream;)Z
    //   108: ifeq -> 365
    //   111: aload #10
    //   113: aload_2
    //   114: getfield a : [B
    //   117: invokevirtual write : ([B)V
    //   120: aload #10
    //   122: invokevirtual close : ()V
    //   125: aload #11
    //   127: aload #5
    //   129: invokevirtual length : ()J
    //   132: putfield a : J
    //   135: aload_0
    //   136: aload_1
    //   137: aload #11
    //   139: invokespecial l : (Ljava/lang/String;Lcom/google/android/gms/internal/ads/vj;)V
    //   142: aload_0
    //   143: getfield b : J
    //   146: aload_0
    //   147: getfield d : I
    //   150: i2l
    //   151: lcmp
    //   152: iflt -> 362
    //   155: getstatic com/google/android/gms/internal/ads/ic.b : Z
    //   158: ifeq -> 171
    //   161: ldc_w 'Pruning old cache entries.'
    //   164: iconst_0
    //   165: anewarray java/lang/Object
    //   168: invokestatic c : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   171: aload_0
    //   172: getfield b : J
    //   175: lstore #6
    //   177: invokestatic elapsedRealtime : ()J
    //   180: lstore_3
    //   181: aload_0
    //   182: getfield a : Ljava/util/Map;
    //   185: invokeinterface entrySet : ()Ljava/util/Set;
    //   190: invokeinterface iterator : ()Ljava/util/Iterator;
    //   195: astore_1
    //   196: iconst_0
    //   197: istore #8
    //   199: aload_1
    //   200: invokeinterface hasNext : ()Z
    //   205: ifeq -> 314
    //   208: aload_1
    //   209: invokeinterface next : ()Ljava/lang/Object;
    //   214: checkcast java/util/Map$Entry
    //   217: invokeinterface getValue : ()Ljava/lang/Object;
    //   222: checkcast com/google/android/gms/internal/ads/vj
    //   225: astore_2
    //   226: aload_0
    //   227: aload_2
    //   228: getfield b : Ljava/lang/String;
    //   231: invokespecial r : (Ljava/lang/String;)Ljava/io/File;
    //   234: invokevirtual delete : ()Z
    //   237: ifeq -> 256
    //   240: aload_0
    //   241: aload_0
    //   242: getfield b : J
    //   245: aload_2
    //   246: getfield a : J
    //   249: lsub
    //   250: putfield b : J
    //   253: goto -> 281
    //   256: aload_2
    //   257: getfield b : Ljava/lang/String;
    //   260: astore_2
    //   261: ldc 'Could not delete cache entry for key=%s, filename=%s'
    //   263: iconst_2
    //   264: anewarray java/lang/Object
    //   267: dup
    //   268: iconst_0
    //   269: aload_2
    //   270: aastore
    //   271: dup
    //   272: iconst_1
    //   273: aload_2
    //   274: invokestatic q : (Ljava/lang/String;)Ljava/lang/String;
    //   277: aastore
    //   278: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   281: aload_1
    //   282: invokeinterface remove : ()V
    //   287: iinc #8, 1
    //   290: aload_0
    //   291: getfield b : J
    //   294: l2f
    //   295: aload_0
    //   296: getfield d : I
    //   299: i2f
    //   300: ldc_w 0.9
    //   303: fmul
    //   304: fcmpg
    //   305: ifge -> 311
    //   308: goto -> 314
    //   311: goto -> 199
    //   314: getstatic com/google/android/gms/internal/ads/ic.b : Z
    //   317: ifeq -> 362
    //   320: ldc_w 'pruned %d files, %d bytes, %d ms'
    //   323: iconst_3
    //   324: anewarray java/lang/Object
    //   327: dup
    //   328: iconst_0
    //   329: iload #8
    //   331: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   334: aastore
    //   335: dup
    //   336: iconst_1
    //   337: aload_0
    //   338: getfield b : J
    //   341: lload #6
    //   343: lsub
    //   344: invokestatic valueOf : (J)Ljava/lang/Long;
    //   347: aastore
    //   348: dup
    //   349: iconst_2
    //   350: invokestatic elapsedRealtime : ()J
    //   353: lload_3
    //   354: lsub
    //   355: invokestatic valueOf : (J)Ljava/lang/Long;
    //   358: aastore
    //   359: invokestatic c : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   362: aload_0
    //   363: monitorexit
    //   364: return
    //   365: aload #10
    //   367: invokevirtual close : ()V
    //   370: ldc_w 'Failed to write header for %s'
    //   373: iconst_1
    //   374: anewarray java/lang/Object
    //   377: dup
    //   378: iconst_0
    //   379: aload #5
    //   381: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   384: aastore
    //   385: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: new java/io/IOException
    //   391: astore_1
    //   392: aload_1
    //   393: invokespecial <init> : ()V
    //   396: aload_1
    //   397: athrow
    //   398: astore_1
    //   399: aload #5
    //   401: invokevirtual delete : ()Z
    //   404: ifne -> 425
    //   407: ldc_w 'Could not clean up file %s'
    //   410: iconst_1
    //   411: anewarray java/lang/Object
    //   414: dup
    //   415: iconst_0
    //   416: aload #5
    //   418: invokevirtual getAbsolutePath : ()Ljava/lang/String;
    //   421: aastore
    //   422: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   425: aload_0
    //   426: getfield c : Lcom/google/android/gms/internal/ads/rl;
    //   429: invokeinterface g : ()Ljava/io/File;
    //   434: invokevirtual exists : ()Z
    //   437: ifne -> 468
    //   440: ldc_w 'Re-initializing cache after external clearing.'
    //   443: iconst_0
    //   444: anewarray java/lang/Object
    //   447: invokestatic a : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   450: aload_0
    //   451: getfield a : Ljava/util/Map;
    //   454: invokeinterface clear : ()V
    //   459: aload_0
    //   460: lconst_0
    //   461: putfield b : J
    //   464: aload_0
    //   465: invokevirtual D : ()V
    //   468: aload_0
    //   469: monitorexit
    //   470: return
    //   471: astore_1
    //   472: aload_0
    //   473: monitorexit
    //   474: goto -> 479
    //   477: aload_1
    //   478: athrow
    //   479: goto -> 477
    // Exception table:
    //   from	to	target	type
    //   2	25	471	finally
    //   36	41	471	finally
    //   58	65	471	finally
    //   65	171	398	java/io/IOException
    //   65	171	471	finally
    //   171	196	398	java/io/IOException
    //   171	196	471	finally
    //   199	253	398	java/io/IOException
    //   199	253	471	finally
    //   256	281	398	java/io/IOException
    //   256	281	471	finally
    //   281	287	398	java/io/IOException
    //   281	287	471	finally
    //   290	308	398	java/io/IOException
    //   290	308	471	finally
    //   314	362	398	java/io/IOException
    //   314	362	471	finally
    //   365	398	398	java/io/IOException
    //   365	398	471	finally
    //   399	425	471	finally
    //   425	468	471	finally
  }
  
  public final void c(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual a : (Ljava/lang/String;)Lcom/google/android/gms/internal/ads/hh2;
    //   7: astore_3
    //   8: aload_3
    //   9: ifnull -> 28
    //   12: aload_3
    //   13: lconst_0
    //   14: putfield f : J
    //   17: aload_3
    //   18: lconst_0
    //   19: putfield e : J
    //   22: aload_0
    //   23: aload_1
    //   24: aload_3
    //   25: invokevirtual b : (Ljava/lang/String;Lcom/google/android/gms/internal/ads/hh2;)V
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	31	finally
    //   12	28	31	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */