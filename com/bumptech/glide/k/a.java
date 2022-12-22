package com.bumptech.glide.k;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Closeable {
  private final File b;
  
  private final File c;
  
  private final File d;
  
  private final File e;
  
  private final int f;
  
  private long g;
  
  private final int h;
  
  private long i = 0L;
  
  private Writer j;
  
  private final LinkedHashMap<String, d> k = new LinkedHashMap<String, d>(0, 0.75F, true);
  
  private int l;
  
  private long m = 0L;
  
  final ThreadPoolExecutor n = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new b(null));
  
  private final Callable<Void> o = new a(this);
  
  private a(File paramFile, int paramInt1, int paramInt2, long paramLong) {
    this.b = paramFile;
    this.f = paramInt1;
    this.c = new File(paramFile, "journal");
    this.d = new File(paramFile, "journal.tmp");
    this.e = new File(paramFile, "journal.bkp");
    this.h = paramInt2;
    this.g = paramLong;
  }
  
  @TargetApi(26)
  private static void A(Writer paramWriter) {
    if (Build.VERSION.SDK_INT < 26) {
      paramWriter.flush();
      return;
    } 
    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
    StrictMode.setThreadPolicy((new StrictMode.ThreadPolicy.Builder(threadPolicy)).permitUnbufferedIo().build());
    try {
      paramWriter.flush();
      return;
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
  
  private boolean C() {
    boolean bool;
    int i = this.l;
    if (i >= 2000 && i >= this.k.size()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static a F(File paramFile, int paramInt1, int paramInt2, long paramLong) {
    if (paramLong > 0L) {
      if (paramInt2 > 0) {
        File file = new File(paramFile, "journal.bkp");
        if (file.exists()) {
          File file1 = new File(paramFile, "journal");
          if (file1.exists()) {
            file.delete();
          } else {
            Q(file, file1, false);
          } 
        } 
        a a2 = new a(paramFile, paramInt1, paramInt2, paramLong);
        if (a2.c.exists())
          try {
            a2.H();
            a2.G();
            return a2;
          } catch (IOException iOException) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DiskLruCache ");
            stringBuilder.append(paramFile);
            stringBuilder.append(" is corrupt: ");
            stringBuilder.append(iOException.getMessage());
            stringBuilder.append(", removing");
            printStream.println(stringBuilder.toString());
            a2.u();
          }  
        paramFile.mkdirs();
        a a1 = new a(paramFile, paramInt1, paramInt2, paramLong);
        a1.M();
        return a1;
      } 
      throw new IllegalArgumentException("valueCount <= 0");
    } 
    throw new IllegalArgumentException("maxSize <= 0");
  }
  
  private void G() {
    v(this.d);
    Iterator<d> iterator = this.k.values().iterator();
    while (iterator.hasNext()) {
      d d = iterator.next();
      c c = d.g(d);
      boolean bool = false;
      byte b = 0;
      if (c == null) {
        while (b < this.h) {
          this.i += d.a(d)[b];
          b++;
        } 
        continue;
      } 
      d.h(d, null);
      for (b = bool; b < this.h; b++) {
        v(d.j(b));
        v(d.k(b));
      } 
      iterator.remove();
    } 
  }
  
  private void H() {
    b b = new b(new FileInputStream(this.c), c.a);
    try {
      BufferedWriter bufferedWriter;
      OutputStreamWriter outputStreamWriter;
      FileOutputStream fileOutputStream;
      String str1 = b.e();
      String str2 = b.e();
      String str3 = b.e();
      String str4 = b.e();
      String str5 = b.e();
      if ("libcore.io.DiskLruCache".equals(str1) && "1".equals(str2) && Integer.toString(this.f).equals(str3) && Integer.toString(this.h).equals(str4)) {
        boolean bool = "".equals(str5);
        if (bool) {
          byte b1 = 0;
          try {
            while (true) {
              L(b.e());
              b1++;
            } 
          } catch (EOFException eOFException) {
            this.l = b1 - this.k.size();
            if (b.d()) {
              M();
            } else {
              bufferedWriter = new BufferedWriter();
              outputStreamWriter = new OutputStreamWriter();
              fileOutputStream = new FileOutputStream();
              this(this.c, true);
              this(fileOutputStream, c.a);
              this(outputStreamWriter);
              this.j = bufferedWriter;
            } 
            return;
          } 
        } 
      } 
      IOException iOException = new IOException();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("unexpected journal header: [");
      stringBuilder.append((String)bufferedWriter);
      stringBuilder.append(", ");
      stringBuilder.append((String)outputStreamWriter);
      stringBuilder.append(", ");
      stringBuilder.append(str4);
      stringBuilder.append(", ");
      stringBuilder.append((String)fileOutputStream);
      stringBuilder.append("]");
      this(stringBuilder.toString());
      throw iOException;
    } finally {
      c.a(b);
    } 
  }
  
  private void L(String paramString) {
    String[] arrayOfString;
    int i = paramString.indexOf(' ');
    if (i != -1) {
      String str;
      int j = i + 1;
      int k = paramString.indexOf(' ', j);
      if (k == -1) {
        String str1 = paramString.substring(j);
        str = str1;
        if (i == 6) {
          str = str1;
          if (paramString.startsWith("REMOVE")) {
            this.k.remove(str1);
            return;
          } 
        } 
      } else {
        str = paramString.substring(j, k);
      } 
      d d2 = this.k.get(str);
      d d1 = d2;
      if (d2 == null) {
        d1 = new d(str, null);
        this.k.put(str, d1);
      } 
      if (k != -1 && i == 5 && paramString.startsWith("CLEAN")) {
        arrayOfString = paramString.substring(k + 1).split(" ");
        d.f(d1, true);
        d.h(d1, null);
        d.i(d1, arrayOfString);
      } else if (k == -1 && i == 5 && arrayOfString.startsWith("DIRTY")) {
        d.h(d1, new c(d1, null));
      } else if (k != -1 || i != 4 || !arrayOfString.startsWith("READ")) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("unexpected journal line: ");
        stringBuilder1.append((String)arrayOfString);
        throw new IOException(stringBuilder1.toString());
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("unexpected journal line: ");
    stringBuilder.append((String)arrayOfString);
    throw new IOException(stringBuilder.toString());
  }
  
  private void M() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Ljava/io/Writer;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 15
    //   11: aload_1
    //   12: invokestatic p : (Ljava/io/Writer;)V
    //   15: new java/io/BufferedWriter
    //   18: astore_1
    //   19: new java/io/OutputStreamWriter
    //   22: astore_2
    //   23: new java/io/FileOutputStream
    //   26: astore_3
    //   27: aload_3
    //   28: aload_0
    //   29: getfield d : Ljava/io/File;
    //   32: invokespecial <init> : (Ljava/io/File;)V
    //   35: aload_2
    //   36: aload_3
    //   37: getstatic com/bumptech/glide/k/c.a : Ljava/nio/charset/Charset;
    //   40: invokespecial <init> : (Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   43: aload_1
    //   44: aload_2
    //   45: invokespecial <init> : (Ljava/io/Writer;)V
    //   48: aload_1
    //   49: ldc_w 'libcore.io.DiskLruCache'
    //   52: invokevirtual write : (Ljava/lang/String;)V
    //   55: aload_1
    //   56: ldc_w '\\n'
    //   59: invokevirtual write : (Ljava/lang/String;)V
    //   62: aload_1
    //   63: ldc_w '1'
    //   66: invokevirtual write : (Ljava/lang/String;)V
    //   69: aload_1
    //   70: ldc_w '\\n'
    //   73: invokevirtual write : (Ljava/lang/String;)V
    //   76: aload_1
    //   77: aload_0
    //   78: getfield f : I
    //   81: invokestatic toString : (I)Ljava/lang/String;
    //   84: invokevirtual write : (Ljava/lang/String;)V
    //   87: aload_1
    //   88: ldc_w '\\n'
    //   91: invokevirtual write : (Ljava/lang/String;)V
    //   94: aload_1
    //   95: aload_0
    //   96: getfield h : I
    //   99: invokestatic toString : (I)Ljava/lang/String;
    //   102: invokevirtual write : (Ljava/lang/String;)V
    //   105: aload_1
    //   106: ldc_w '\\n'
    //   109: invokevirtual write : (Ljava/lang/String;)V
    //   112: aload_1
    //   113: ldc_w '\\n'
    //   116: invokevirtual write : (Ljava/lang/String;)V
    //   119: aload_0
    //   120: getfield k : Ljava/util/LinkedHashMap;
    //   123: invokevirtual values : ()Ljava/util/Collection;
    //   126: invokeinterface iterator : ()Ljava/util/Iterator;
    //   131: astore_2
    //   132: aload_2
    //   133: invokeinterface hasNext : ()Z
    //   138: ifeq -> 266
    //   141: aload_2
    //   142: invokeinterface next : ()Ljava/lang/Object;
    //   147: checkcast com/bumptech/glide/k/a$d
    //   150: astore_3
    //   151: aload_3
    //   152: invokestatic g : (Lcom/bumptech/glide/k/a$d;)Lcom/bumptech/glide/k/a$c;
    //   155: ifnull -> 207
    //   158: new java/lang/StringBuilder
    //   161: astore #4
    //   163: aload #4
    //   165: invokespecial <init> : ()V
    //   168: aload #4
    //   170: ldc_w 'DIRTY '
    //   173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: pop
    //   177: aload #4
    //   179: aload_3
    //   180: invokestatic b : (Lcom/bumptech/glide/k/a$d;)Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload #4
    //   189: bipush #10
    //   191: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   194: pop
    //   195: aload_1
    //   196: aload #4
    //   198: invokevirtual toString : ()Ljava/lang/String;
    //   201: invokevirtual write : (Ljava/lang/String;)V
    //   204: goto -> 132
    //   207: new java/lang/StringBuilder
    //   210: astore #4
    //   212: aload #4
    //   214: invokespecial <init> : ()V
    //   217: aload #4
    //   219: ldc_w 'CLEAN '
    //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload #4
    //   228: aload_3
    //   229: invokestatic b : (Lcom/bumptech/glide/k/a$d;)Ljava/lang/String;
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: aload #4
    //   238: aload_3
    //   239: invokevirtual l : ()Ljava/lang/String;
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: pop
    //   246: aload #4
    //   248: bipush #10
    //   250: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: aload_1
    //   255: aload #4
    //   257: invokevirtual toString : ()Ljava/lang/String;
    //   260: invokevirtual write : (Ljava/lang/String;)V
    //   263: goto -> 132
    //   266: aload_1
    //   267: invokestatic p : (Ljava/io/Writer;)V
    //   270: aload_0
    //   271: getfield c : Ljava/io/File;
    //   274: invokevirtual exists : ()Z
    //   277: ifeq -> 292
    //   280: aload_0
    //   281: getfield c : Ljava/io/File;
    //   284: aload_0
    //   285: getfield e : Ljava/io/File;
    //   288: iconst_1
    //   289: invokestatic Q : (Ljava/io/File;Ljava/io/File;Z)V
    //   292: aload_0
    //   293: getfield d : Ljava/io/File;
    //   296: aload_0
    //   297: getfield c : Ljava/io/File;
    //   300: iconst_0
    //   301: invokestatic Q : (Ljava/io/File;Ljava/io/File;Z)V
    //   304: aload_0
    //   305: getfield e : Ljava/io/File;
    //   308: invokevirtual delete : ()Z
    //   311: pop
    //   312: new java/io/BufferedWriter
    //   315: astore_1
    //   316: new java/io/OutputStreamWriter
    //   319: astore_2
    //   320: new java/io/FileOutputStream
    //   323: astore_3
    //   324: aload_3
    //   325: aload_0
    //   326: getfield c : Ljava/io/File;
    //   329: iconst_1
    //   330: invokespecial <init> : (Ljava/io/File;Z)V
    //   333: aload_2
    //   334: aload_3
    //   335: getstatic com/bumptech/glide/k/c.a : Ljava/nio/charset/Charset;
    //   338: invokespecial <init> : (Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   341: aload_1
    //   342: aload_2
    //   343: invokespecial <init> : (Ljava/io/Writer;)V
    //   346: aload_0
    //   347: aload_1
    //   348: putfield j : Ljava/io/Writer;
    //   351: aload_0
    //   352: monitorexit
    //   353: return
    //   354: astore_2
    //   355: aload_1
    //   356: invokestatic p : (Ljava/io/Writer;)V
    //   359: aload_2
    //   360: athrow
    //   361: astore_1
    //   362: aload_0
    //   363: monitorexit
    //   364: goto -> 369
    //   367: aload_1
    //   368: athrow
    //   369: goto -> 367
    // Exception table:
    //   from	to	target	type
    //   2	7	361	finally
    //   11	15	361	finally
    //   15	48	361	finally
    //   48	132	354	finally
    //   132	204	354	finally
    //   207	263	354	finally
    //   266	292	361	finally
    //   292	351	361	finally
    //   355	361	361	finally
  }
  
  private static void Q(File paramFile1, File paramFile2, boolean paramBoolean) {
    if (paramBoolean)
      v(paramFile2); 
    if (paramFile1.renameTo(paramFile2))
      return; 
    throw new IOException();
  }
  
  private void S() {
    while (this.i > this.g)
      N((String)((Map.Entry)this.k.entrySet().iterator().next()).getKey()); 
  }
  
  private void o() {
    if (this.j != null)
      return; 
    throw new IllegalStateException("cache is closed");
  }
  
  @TargetApi(26)
  private static void p(Writer paramWriter) {
    if (Build.VERSION.SDK_INT < 26) {
      paramWriter.close();
      return;
    } 
    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
    StrictMode.setThreadPolicy((new StrictMode.ThreadPolicy.Builder(threadPolicy)).permitUnbufferedIo().build());
    try {
      paramWriter.close();
      return;
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
  
  private void q(c paramc, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic c : (Lcom/bumptech/glide/k/a$c;)Lcom/bumptech/glide/k/a$d;
    //   6: astore_3
    //   7: aload_3
    //   8: invokestatic g : (Lcom/bumptech/glide/k/a$d;)Lcom/bumptech/glide/k/a$c;
    //   11: aload_1
    //   12: if_acmpne -> 433
    //   15: iconst_0
    //   16: istore #4
    //   18: iload #4
    //   20: istore #5
    //   22: iload_2
    //   23: ifeq -> 129
    //   26: iload #4
    //   28: istore #5
    //   30: aload_3
    //   31: invokestatic e : (Lcom/bumptech/glide/k/a$d;)Z
    //   34: ifne -> 129
    //   37: iconst_0
    //   38: istore #6
    //   40: iload #4
    //   42: istore #5
    //   44: iload #6
    //   46: aload_0
    //   47: getfield h : I
    //   50: if_icmpge -> 129
    //   53: aload_1
    //   54: invokestatic d : (Lcom/bumptech/glide/k/a$c;)[Z
    //   57: iload #6
    //   59: baload
    //   60: ifeq -> 88
    //   63: aload_3
    //   64: iload #6
    //   66: invokevirtual k : (I)Ljava/io/File;
    //   69: invokevirtual exists : ()Z
    //   72: ifne -> 82
    //   75: aload_1
    //   76: invokevirtual a : ()V
    //   79: aload_0
    //   80: monitorexit
    //   81: return
    //   82: iinc #6, 1
    //   85: goto -> 40
    //   88: aload_1
    //   89: invokevirtual a : ()V
    //   92: new java/lang/IllegalStateException
    //   95: astore_3
    //   96: new java/lang/StringBuilder
    //   99: astore_1
    //   100: aload_1
    //   101: invokespecial <init> : ()V
    //   104: aload_1
    //   105: ldc_w 'Newly created entry didn't create value for index '
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload_1
    //   113: iload #6
    //   115: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload_3
    //   120: aload_1
    //   121: invokevirtual toString : ()Ljava/lang/String;
    //   124: invokespecial <init> : (Ljava/lang/String;)V
    //   127: aload_3
    //   128: athrow
    //   129: iload #5
    //   131: aload_0
    //   132: getfield h : I
    //   135: if_icmpge -> 223
    //   138: aload_3
    //   139: iload #5
    //   141: invokevirtual k : (I)Ljava/io/File;
    //   144: astore_1
    //   145: iload_2
    //   146: ifeq -> 213
    //   149: aload_1
    //   150: invokevirtual exists : ()Z
    //   153: ifeq -> 217
    //   156: aload_3
    //   157: iload #5
    //   159: invokevirtual j : (I)Ljava/io/File;
    //   162: astore #7
    //   164: aload_1
    //   165: aload #7
    //   167: invokevirtual renameTo : (Ljava/io/File;)Z
    //   170: pop
    //   171: aload_3
    //   172: invokestatic a : (Lcom/bumptech/glide/k/a$d;)[J
    //   175: iload #5
    //   177: laload
    //   178: lstore #8
    //   180: aload #7
    //   182: invokevirtual length : ()J
    //   185: lstore #10
    //   187: aload_3
    //   188: invokestatic a : (Lcom/bumptech/glide/k/a$d;)[J
    //   191: iload #5
    //   193: lload #10
    //   195: lastore
    //   196: aload_0
    //   197: aload_0
    //   198: getfield i : J
    //   201: lload #8
    //   203: lsub
    //   204: lload #10
    //   206: ladd
    //   207: putfield i : J
    //   210: goto -> 217
    //   213: aload_1
    //   214: invokestatic v : (Ljava/io/File;)V
    //   217: iinc #5, 1
    //   220: goto -> 129
    //   223: aload_0
    //   224: aload_0
    //   225: getfield l : I
    //   228: iconst_1
    //   229: iadd
    //   230: putfield l : I
    //   233: aload_3
    //   234: aconst_null
    //   235: invokestatic h : (Lcom/bumptech/glide/k/a$d;Lcom/bumptech/glide/k/a$c;)Lcom/bumptech/glide/k/a$c;
    //   238: pop
    //   239: aload_3
    //   240: invokestatic e : (Lcom/bumptech/glide/k/a$d;)Z
    //   243: iload_2
    //   244: ior
    //   245: ifeq -> 337
    //   248: aload_3
    //   249: iconst_1
    //   250: invokestatic f : (Lcom/bumptech/glide/k/a$d;Z)Z
    //   253: pop
    //   254: aload_0
    //   255: getfield j : Ljava/io/Writer;
    //   258: ldc_w 'CLEAN'
    //   261: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   264: pop
    //   265: aload_0
    //   266: getfield j : Ljava/io/Writer;
    //   269: bipush #32
    //   271: invokevirtual append : (C)Ljava/io/Writer;
    //   274: pop
    //   275: aload_0
    //   276: getfield j : Ljava/io/Writer;
    //   279: aload_3
    //   280: invokestatic b : (Lcom/bumptech/glide/k/a$d;)Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   286: pop
    //   287: aload_0
    //   288: getfield j : Ljava/io/Writer;
    //   291: aload_3
    //   292: invokevirtual l : ()Ljava/lang/String;
    //   295: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   298: pop
    //   299: aload_0
    //   300: getfield j : Ljava/io/Writer;
    //   303: bipush #10
    //   305: invokevirtual append : (C)Ljava/io/Writer;
    //   308: pop
    //   309: iload_2
    //   310: ifeq -> 392
    //   313: aload_0
    //   314: getfield m : J
    //   317: lstore #8
    //   319: aload_0
    //   320: lconst_1
    //   321: lload #8
    //   323: ladd
    //   324: putfield m : J
    //   327: aload_3
    //   328: lload #8
    //   330: invokestatic d : (Lcom/bumptech/glide/k/a$d;J)J
    //   333: pop2
    //   334: goto -> 392
    //   337: aload_0
    //   338: getfield k : Ljava/util/LinkedHashMap;
    //   341: aload_3
    //   342: invokestatic b : (Lcom/bumptech/glide/k/a$d;)Ljava/lang/String;
    //   345: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   348: pop
    //   349: aload_0
    //   350: getfield j : Ljava/io/Writer;
    //   353: ldc_w 'REMOVE'
    //   356: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   359: pop
    //   360: aload_0
    //   361: getfield j : Ljava/io/Writer;
    //   364: bipush #32
    //   366: invokevirtual append : (C)Ljava/io/Writer;
    //   369: pop
    //   370: aload_0
    //   371: getfield j : Ljava/io/Writer;
    //   374: aload_3
    //   375: invokestatic b : (Lcom/bumptech/glide/k/a$d;)Ljava/lang/String;
    //   378: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   381: pop
    //   382: aload_0
    //   383: getfield j : Ljava/io/Writer;
    //   386: bipush #10
    //   388: invokevirtual append : (C)Ljava/io/Writer;
    //   391: pop
    //   392: aload_0
    //   393: getfield j : Ljava/io/Writer;
    //   396: invokestatic A : (Ljava/io/Writer;)V
    //   399: aload_0
    //   400: getfield i : J
    //   403: aload_0
    //   404: getfield g : J
    //   407: lcmp
    //   408: ifgt -> 418
    //   411: aload_0
    //   412: invokespecial C : ()Z
    //   415: ifeq -> 430
    //   418: aload_0
    //   419: getfield n : Ljava/util/concurrent/ThreadPoolExecutor;
    //   422: aload_0
    //   423: getfield o : Ljava/util/concurrent/Callable;
    //   426: invokevirtual submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   429: pop
    //   430: aload_0
    //   431: monitorexit
    //   432: return
    //   433: new java/lang/IllegalStateException
    //   436: astore_1
    //   437: aload_1
    //   438: invokespecial <init> : ()V
    //   441: aload_1
    //   442: athrow
    //   443: astore_1
    //   444: aload_0
    //   445: monitorexit
    //   446: goto -> 451
    //   449: aload_1
    //   450: athrow
    //   451: goto -> 449
    // Exception table:
    //   from	to	target	type
    //   2	15	443	finally
    //   30	37	443	finally
    //   44	79	443	finally
    //   88	129	443	finally
    //   129	145	443	finally
    //   149	210	443	finally
    //   213	217	443	finally
    //   223	309	443	finally
    //   313	334	443	finally
    //   337	392	443	finally
    //   392	418	443	finally
    //   418	430	443	finally
    //   433	443	443	finally
  }
  
  private static void v(File paramFile) {
    if (!paramFile.exists() || paramFile.delete())
      return; 
    throw new IOException();
  }
  
  private c z(String paramString, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial o : ()V
    //   6: aload_0
    //   7: getfield k : Ljava/util/LinkedHashMap;
    //   10: aload_1
    //   11: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast com/bumptech/glide/k/a$d
    //   17: astore #4
    //   19: lload_2
    //   20: ldc2_w -1
    //   23: lcmp
    //   24: ifeq -> 50
    //   27: aload #4
    //   29: ifnull -> 46
    //   32: aload #4
    //   34: invokestatic c : (Lcom/bumptech/glide/k/a$d;)J
    //   37: lstore #5
    //   39: lload #5
    //   41: lload_2
    //   42: lcmp
    //   43: ifeq -> 50
    //   46: aload_0
    //   47: monitorexit
    //   48: aconst_null
    //   49: areturn
    //   50: aload #4
    //   52: ifnonnull -> 82
    //   55: new com/bumptech/glide/k/a$d
    //   58: astore #4
    //   60: aload #4
    //   62: aload_0
    //   63: aload_1
    //   64: aconst_null
    //   65: invokespecial <init> : (Lcom/bumptech/glide/k/a;Ljava/lang/String;Lcom/bumptech/glide/k/a$a;)V
    //   68: aload_0
    //   69: getfield k : Ljava/util/LinkedHashMap;
    //   72: aload_1
    //   73: aload #4
    //   75: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   78: pop
    //   79: goto -> 98
    //   82: aload #4
    //   84: invokestatic g : (Lcom/bumptech/glide/k/a$d;)Lcom/bumptech/glide/k/a$c;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 98
    //   94: aload_0
    //   95: monitorexit
    //   96: aconst_null
    //   97: areturn
    //   98: new com/bumptech/glide/k/a$c
    //   101: astore #7
    //   103: aload #7
    //   105: aload_0
    //   106: aload #4
    //   108: aconst_null
    //   109: invokespecial <init> : (Lcom/bumptech/glide/k/a;Lcom/bumptech/glide/k/a$d;Lcom/bumptech/glide/k/a$a;)V
    //   112: aload #4
    //   114: aload #7
    //   116: invokestatic h : (Lcom/bumptech/glide/k/a$d;Lcom/bumptech/glide/k/a$c;)Lcom/bumptech/glide/k/a$c;
    //   119: pop
    //   120: aload_0
    //   121: getfield j : Ljava/io/Writer;
    //   124: ldc_w 'DIRTY'
    //   127: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   130: pop
    //   131: aload_0
    //   132: getfield j : Ljava/io/Writer;
    //   135: bipush #32
    //   137: invokevirtual append : (C)Ljava/io/Writer;
    //   140: pop
    //   141: aload_0
    //   142: getfield j : Ljava/io/Writer;
    //   145: aload_1
    //   146: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   149: pop
    //   150: aload_0
    //   151: getfield j : Ljava/io/Writer;
    //   154: bipush #10
    //   156: invokevirtual append : (C)Ljava/io/Writer;
    //   159: pop
    //   160: aload_0
    //   161: getfield j : Ljava/io/Writer;
    //   164: invokestatic A : (Ljava/io/Writer;)V
    //   167: aload_0
    //   168: monitorexit
    //   169: aload #7
    //   171: areturn
    //   172: astore_1
    //   173: aload_0
    //   174: monitorexit
    //   175: aload_1
    //   176: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	172	finally
    //   32	39	172	finally
    //   55	79	172	finally
    //   82	89	172	finally
    //   98	167	172	finally
  }
  
  public e B(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial o : ()V
    //   6: aload_0
    //   7: getfield k : Ljava/util/LinkedHashMap;
    //   10: aload_1
    //   11: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast com/bumptech/glide/k/a$d
    //   17: astore_2
    //   18: aload_2
    //   19: ifnonnull -> 26
    //   22: aload_0
    //   23: monitorexit
    //   24: aconst_null
    //   25: areturn
    //   26: aload_2
    //   27: invokestatic e : (Lcom/bumptech/glide/k/a$d;)Z
    //   30: istore_3
    //   31: iload_3
    //   32: ifne -> 39
    //   35: aload_0
    //   36: monitorexit
    //   37: aconst_null
    //   38: areturn
    //   39: aload_2
    //   40: getfield c : [Ljava/io/File;
    //   43: astore #4
    //   45: aload #4
    //   47: arraylength
    //   48: istore #5
    //   50: iconst_0
    //   51: istore #6
    //   53: iload #6
    //   55: iload #5
    //   57: if_icmpge -> 83
    //   60: aload #4
    //   62: iload #6
    //   64: aaload
    //   65: invokevirtual exists : ()Z
    //   68: istore_3
    //   69: iload_3
    //   70: ifne -> 77
    //   73: aload_0
    //   74: monitorexit
    //   75: aconst_null
    //   76: areturn
    //   77: iinc #6, 1
    //   80: goto -> 53
    //   83: aload_0
    //   84: aload_0
    //   85: getfield l : I
    //   88: iconst_1
    //   89: iadd
    //   90: putfield l : I
    //   93: aload_0
    //   94: getfield j : Ljava/io/Writer;
    //   97: ldc_w 'READ'
    //   100: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   103: pop
    //   104: aload_0
    //   105: getfield j : Ljava/io/Writer;
    //   108: bipush #32
    //   110: invokevirtual append : (C)Ljava/io/Writer;
    //   113: pop
    //   114: aload_0
    //   115: getfield j : Ljava/io/Writer;
    //   118: aload_1
    //   119: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   122: pop
    //   123: aload_0
    //   124: getfield j : Ljava/io/Writer;
    //   127: bipush #10
    //   129: invokevirtual append : (C)Ljava/io/Writer;
    //   132: pop
    //   133: aload_0
    //   134: invokespecial C : ()Z
    //   137: ifeq -> 152
    //   140: aload_0
    //   141: getfield n : Ljava/util/concurrent/ThreadPoolExecutor;
    //   144: aload_0
    //   145: getfield o : Ljava/util/concurrent/Callable;
    //   148: invokevirtual submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   151: pop
    //   152: new com/bumptech/glide/k/a$e
    //   155: dup
    //   156: aload_0
    //   157: aload_1
    //   158: aload_2
    //   159: invokestatic c : (Lcom/bumptech/glide/k/a$d;)J
    //   162: aload_2
    //   163: getfield c : [Ljava/io/File;
    //   166: aload_2
    //   167: invokestatic a : (Lcom/bumptech/glide/k/a$d;)[J
    //   170: aconst_null
    //   171: invokespecial <init> : (Lcom/bumptech/glide/k/a;Ljava/lang/String;J[Ljava/io/File;[JLcom/bumptech/glide/k/a$a;)V
    //   174: astore_1
    //   175: aload_0
    //   176: monitorexit
    //   177: aload_1
    //   178: areturn
    //   179: astore_1
    //   180: aload_0
    //   181: monitorexit
    //   182: goto -> 187
    //   185: aload_1
    //   186: athrow
    //   187: goto -> 185
    // Exception table:
    //   from	to	target	type
    //   2	18	179	finally
    //   26	31	179	finally
    //   39	50	179	finally
    //   60	69	179	finally
    //   83	152	179	finally
    //   152	175	179	finally
  }
  
  public boolean N(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial o : ()V
    //   6: aload_0
    //   7: getfield k : Ljava/util/LinkedHashMap;
    //   10: aload_1
    //   11: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast com/bumptech/glide/k/a$d
    //   17: astore_2
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_2
    //   21: ifnull -> 215
    //   24: aload_2
    //   25: invokestatic g : (Lcom/bumptech/glide/k/a$d;)Lcom/bumptech/glide/k/a$c;
    //   28: ifnull -> 34
    //   31: goto -> 215
    //   34: iload_3
    //   35: aload_0
    //   36: getfield h : I
    //   39: if_icmpge -> 133
    //   42: aload_2
    //   43: iload_3
    //   44: invokevirtual j : (I)Ljava/io/File;
    //   47: astore #4
    //   49: aload #4
    //   51: invokevirtual exists : ()Z
    //   54: ifeq -> 105
    //   57: aload #4
    //   59: invokevirtual delete : ()Z
    //   62: ifeq -> 68
    //   65: goto -> 105
    //   68: new java/io/IOException
    //   71: astore_2
    //   72: new java/lang/StringBuilder
    //   75: astore_1
    //   76: aload_1
    //   77: invokespecial <init> : ()V
    //   80: aload_1
    //   81: ldc_w 'failed to delete '
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload_1
    //   89: aload #4
    //   91: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: aload_2
    //   96: aload_1
    //   97: invokevirtual toString : ()Ljava/lang/String;
    //   100: invokespecial <init> : (Ljava/lang/String;)V
    //   103: aload_2
    //   104: athrow
    //   105: aload_0
    //   106: aload_0
    //   107: getfield i : J
    //   110: aload_2
    //   111: invokestatic a : (Lcom/bumptech/glide/k/a$d;)[J
    //   114: iload_3
    //   115: laload
    //   116: lsub
    //   117: putfield i : J
    //   120: aload_2
    //   121: invokestatic a : (Lcom/bumptech/glide/k/a$d;)[J
    //   124: iload_3
    //   125: lconst_0
    //   126: lastore
    //   127: iinc #3, 1
    //   130: goto -> 34
    //   133: aload_0
    //   134: aload_0
    //   135: getfield l : I
    //   138: iconst_1
    //   139: iadd
    //   140: putfield l : I
    //   143: aload_0
    //   144: getfield j : Ljava/io/Writer;
    //   147: ldc_w 'REMOVE'
    //   150: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   153: pop
    //   154: aload_0
    //   155: getfield j : Ljava/io/Writer;
    //   158: bipush #32
    //   160: invokevirtual append : (C)Ljava/io/Writer;
    //   163: pop
    //   164: aload_0
    //   165: getfield j : Ljava/io/Writer;
    //   168: aload_1
    //   169: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   172: pop
    //   173: aload_0
    //   174: getfield j : Ljava/io/Writer;
    //   177: bipush #10
    //   179: invokevirtual append : (C)Ljava/io/Writer;
    //   182: pop
    //   183: aload_0
    //   184: getfield k : Ljava/util/LinkedHashMap;
    //   187: aload_1
    //   188: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   191: pop
    //   192: aload_0
    //   193: invokespecial C : ()Z
    //   196: ifeq -> 211
    //   199: aload_0
    //   200: getfield n : Ljava/util/concurrent/ThreadPoolExecutor;
    //   203: aload_0
    //   204: getfield o : Ljava/util/concurrent/Callable;
    //   207: invokevirtual submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   210: pop
    //   211: aload_0
    //   212: monitorexit
    //   213: iconst_1
    //   214: ireturn
    //   215: aload_0
    //   216: monitorexit
    //   217: iconst_0
    //   218: ireturn
    //   219: astore_1
    //   220: aload_0
    //   221: monitorexit
    //   222: goto -> 227
    //   225: aload_1
    //   226: athrow
    //   227: goto -> 225
    // Exception table:
    //   from	to	target	type
    //   2	18	219	finally
    //   24	31	219	finally
    //   34	65	219	finally
    //   68	105	219	finally
    //   105	127	219	finally
    //   133	211	219	finally
  }
  
  public void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : Ljava/io/Writer;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: new java/util/ArrayList
    //   17: astore_1
    //   18: aload_1
    //   19: aload_0
    //   20: getfield k : Ljava/util/LinkedHashMap;
    //   23: invokevirtual values : ()Ljava/util/Collection;
    //   26: invokespecial <init> : (Ljava/util/Collection;)V
    //   29: aload_1
    //   30: invokevirtual iterator : ()Ljava/util/Iterator;
    //   33: astore_1
    //   34: aload_1
    //   35: invokeinterface hasNext : ()Z
    //   40: ifeq -> 70
    //   43: aload_1
    //   44: invokeinterface next : ()Ljava/lang/Object;
    //   49: checkcast com/bumptech/glide/k/a$d
    //   52: astore_2
    //   53: aload_2
    //   54: invokestatic g : (Lcom/bumptech/glide/k/a$d;)Lcom/bumptech/glide/k/a$c;
    //   57: ifnull -> 34
    //   60: aload_2
    //   61: invokestatic g : (Lcom/bumptech/glide/k/a$d;)Lcom/bumptech/glide/k/a$c;
    //   64: invokevirtual a : ()V
    //   67: goto -> 34
    //   70: aload_0
    //   71: invokespecial S : ()V
    //   74: aload_0
    //   75: getfield j : Ljava/io/Writer;
    //   78: invokestatic p : (Ljava/io/Writer;)V
    //   81: aload_0
    //   82: aconst_null
    //   83: putfield j : Ljava/io/Writer;
    //   86: aload_0
    //   87: monitorexit
    //   88: return
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: goto -> 97
    //   95: aload_1
    //   96: athrow
    //   97: goto -> 95
    // Exception table:
    //   from	to	target	type
    //   2	7	89	finally
    //   14	34	89	finally
    //   34	67	89	finally
    //   70	86	89	finally
  }
  
  public void u() {
    close();
    c.b(this.b);
  }
  
  public c x(String paramString) {
    return z(paramString, -1L);
  }
  
  class a implements Callable<Void> {
    a(a this$0) {}
    
    public Void a() {
      synchronized (this.a) {
        if (a.b(this.a) == null)
          return null; 
        a.d(this.a);
        if (a.h(this.a)) {
          a.j(this.a);
          a.l(this.a, 0);
        } 
        return null;
      } 
    }
  }
  
  private static final class b implements ThreadFactory {
    private b() {}
    
    public Thread newThread(Runnable param1Runnable) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: new java/lang/Thread
      //   5: astore_2
      //   6: aload_2
      //   7: aload_1
      //   8: ldc 'glide-disk-lru-cache-thread'
      //   10: invokespecial <init> : (Ljava/lang/Runnable;Ljava/lang/String;)V
      //   13: aload_2
      //   14: iconst_1
      //   15: invokevirtual setPriority : (I)V
      //   18: aload_0
      //   19: monitorexit
      //   20: aload_2
      //   21: areturn
      //   22: astore_1
      //   23: aload_0
      //   24: monitorexit
      //   25: aload_1
      //   26: athrow
      // Exception table:
      //   from	to	target	type
      //   2	18	22	finally
    }
  }
  
  public final class c {
    private final a.d a;
    
    private final boolean[] b;
    
    private boolean c;
    
    private c(a this$0, a.d param1d) {
      boolean[] arrayOfBoolean;
      this.a = param1d;
      if (a.d.e(param1d)) {
        a.this = null;
      } else {
        arrayOfBoolean = new boolean[a.c(a.this)];
      } 
      this.b = arrayOfBoolean;
    }
    
    public void a() {
      a.g(this.d, this, false);
    }
    
    public void b() {
      if (!this.c)
        try {
          a();
        } catch (IOException iOException) {} 
    }
    
    public void e() {
      a.g(this.d, this, true);
      this.c = true;
    }
    
    public File f(int param1Int) {
      synchronized (this.d) {
        if (a.d.g(this.a) == this) {
          if (!a.d.e(this.a))
            this.b[param1Int] = true; 
          File file = this.a.k(param1Int);
          a.e(this.d).mkdirs();
          return file;
        } 
        IllegalStateException illegalStateException = new IllegalStateException();
        this();
        throw illegalStateException;
      } 
    }
  }
  
  private final class d {
    private final String a;
    
    private final long[] b;
    
    File[] c;
    
    File[] d;
    
    private boolean e;
    
    private a.c f;
    
    private long g;
    
    private d(a this$0, String param1String) {
      this.a = param1String;
      this.b = new long[a.c(a.this)];
      this.c = new File[a.c(a.this)];
      this.d = new File[a.c(a.this)];
      StringBuilder stringBuilder = new StringBuilder(param1String);
      stringBuilder.append('.');
      int i = stringBuilder.length();
      for (byte b = 0; b < a.c(a.this); b++) {
        stringBuilder.append(b);
        this.c[b] = new File(a.e(a.this), stringBuilder.toString());
        stringBuilder.append(".tmp");
        this.d[b] = new File(a.e(a.this), stringBuilder.toString());
        stringBuilder.setLength(i);
      } 
    }
    
    private IOException m(String[] param1ArrayOfString) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("unexpected journal line: ");
      stringBuilder.append(Arrays.toString((Object[])param1ArrayOfString));
      throw new IOException(stringBuilder.toString());
    }
    
    private void n(String[] param1ArrayOfString) {
      if (param1ArrayOfString.length == a.c(this.h)) {
        byte b = 0;
        try {
          while (b < param1ArrayOfString.length) {
            this.b[b] = Long.parseLong(param1ArrayOfString[b]);
            b++;
          } 
          return;
        } catch (NumberFormatException numberFormatException) {
          throw m(param1ArrayOfString);
        } 
      } 
      IOException iOException = m(param1ArrayOfString);
      throw iOException;
    }
    
    public File j(int param1Int) {
      return this.c[param1Int];
    }
    
    public File k(int param1Int) {
      return this.d[param1Int];
    }
    
    public String l() {
      StringBuilder stringBuilder = new StringBuilder();
      for (long l : this.b) {
        stringBuilder.append(' ');
        stringBuilder.append(l);
      } 
      return stringBuilder.toString();
    }
  }
  
  public final class e {
    private final String a;
    
    private final long b;
    
    private final long[] c;
    
    private final File[] d;
    
    private e(a this$0, String param1String, long param1Long, File[] param1ArrayOfFile, long[] param1ArrayOflong) {
      this.a = param1String;
      this.b = param1Long;
      this.d = param1ArrayOfFile;
      this.c = param1ArrayOflong;
    }
    
    public File a(int param1Int) {
      return this.d[param1Int];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */