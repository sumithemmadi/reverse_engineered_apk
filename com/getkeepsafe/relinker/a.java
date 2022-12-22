package com.getkeepsafe.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class a implements b.a {
  private void b(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
      } catch (IOException iOException) {} 
  }
  
  private long c(InputStream paramInputStream, OutputStream paramOutputStream) {
    byte[] arrayOfByte = new byte[4096];
    long l;
    for (l = 0L;; l += i) {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        paramOutputStream.flush();
        return l;
      } 
      paramOutputStream.write(arrayOfByte, 0, i);
    } 
  }
  
  private a d(Context paramContext, String[] paramArrayOfString, String paramString, c paramc) {
    String[] arrayOfString = f(paramContext);
    int i = arrayOfString.length;
    byte b = 0;
    while (true) {
      Context context = null;
      if (b < i) {
        String str = arrayOfString[b];
        byte b1 = 0;
        while (true) {
          paramContext = context;
          if (b1 < 5)
            try {
              File file = new File();
              this(str);
              ZipFile zipFile = new ZipFile(file, 1);
              break;
            } catch (IOException iOException) {
              b1++;
              continue;
            }  
          break;
        } 
        if (iOException != null) {
          for (b1 = 0; b1 < 5; b1++) {
            int j = paramArrayOfString.length;
            for (byte b2 = 0; b2 < j; b2++) {
              String str2 = paramArrayOfString[b2];
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("lib");
              stringBuilder.append(File.separatorChar);
              stringBuilder.append(str2);
              stringBuilder.append(File.separatorChar);
              stringBuilder.append(paramString);
              String str1 = stringBuilder.toString();
              paramc.i("Looking for %s in APK %s...", new Object[] { str1, str });
              ZipEntry zipEntry = iOException.getEntry(str1);
              if (zipEntry != null)
                return new a((ZipFile)iOException, zipEntry); 
            } 
          } 
          try {
            iOException.close();
          } catch (IOException iOException1) {}
        } 
        b++;
        continue;
      } 
      return null;
    } 
  }
  
  private String[] e(Context paramContext, String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("lib");
    stringBuilder.append(File.separatorChar);
    stringBuilder.append("([^\\");
    stringBuilder.append(File.separatorChar);
    stringBuilder.append("]*)");
    stringBuilder.append(File.separatorChar);
    stringBuilder.append(paramString);
    Pattern pattern = Pattern.compile(stringBuilder.toString());
    HashSet<String> hashSet = new HashSet();
    String[] arrayOfString = f(paramContext);
    int i = arrayOfString.length;
    byte b = 0;
    while (true) {
      if (b < i) {
        String str = arrayOfString[b];
        try {
          ZipFile zipFile = new ZipFile();
          File file = new File();
          this(str);
          this(file, 1);
          Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
          while (enumeration.hasMoreElements()) {
            Matcher matcher = pattern.matcher(((ZipEntry)enumeration.nextElement()).getName());
            if (matcher.matches())
              hashSet.add(matcher.group(1)); 
          } 
        } catch (IOException iOException) {}
        b++;
        continue;
      } 
      return hashSet.<String>toArray(new String[hashSet.size()]);
    } 
  }
  
  private String[] f(Context paramContext) {
    ApplicationInfo applicationInfo = paramContext.getApplicationInfo();
    if (Build.VERSION.SDK_INT >= 21) {
      String[] arrayOfString = applicationInfo.splitSourceDirs;
      if (arrayOfString != null && arrayOfString.length != 0) {
        String[] arrayOfString1 = new String[arrayOfString.length + 1];
        arrayOfString1[0] = applicationInfo.sourceDir;
        System.arraycopy(arrayOfString, 0, arrayOfString1, 1, arrayOfString.length);
        return arrayOfString1;
      } 
    } 
    return new String[] { applicationInfo.sourceDir };
  }
  
  public void a(Context paramContext, String[] paramArrayOfString, String paramString, File paramFile, c paramc) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #6
    //   3: aconst_null
    //   4: astore #7
    //   6: aload_0
    //   7: aload_1
    //   8: aload_2
    //   9: aload_3
    //   10: aload #5
    //   12: invokespecial d : (Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Lcom/getkeepsafe/relinker/c;)Lcom/getkeepsafe/relinker/a$a;
    //   15: astore #8
    //   17: aload #8
    //   19: ifnull -> 284
    //   22: iconst_0
    //   23: istore #9
    //   25: iload #9
    //   27: iconst_5
    //   28: if_icmpge -> 262
    //   31: aload #5
    //   33: ldc 'Found %s! Extracting...'
    //   35: iconst_1
    //   36: anewarray java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: aload_3
    //   42: aastore
    //   43: invokevirtual i : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: aload #4
    //   48: invokevirtual exists : ()Z
    //   51: ifne -> 69
    //   54: aload #4
    //   56: invokevirtual createNewFile : ()Z
    //   59: istore #10
    //   61: iload #10
    //   63: ifne -> 69
    //   66: goto -> 256
    //   69: aload #8
    //   71: getfield a : Ljava/util/zip/ZipFile;
    //   74: aload #8
    //   76: getfield b : Ljava/util/zip/ZipEntry;
    //   79: invokevirtual getInputStream : (Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   82: astore_2
    //   83: new java/io/FileOutputStream
    //   86: astore_1
    //   87: aload_1
    //   88: aload #4
    //   90: invokespecial <init> : (Ljava/io/File;)V
    //   93: aload_0
    //   94: aload_2
    //   95: aload_1
    //   96: invokespecial c : (Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   99: lstore #11
    //   101: aload_1
    //   102: invokevirtual getFD : ()Ljava/io/FileDescriptor;
    //   105: invokevirtual sync : ()V
    //   108: aload #4
    //   110: invokevirtual length : ()J
    //   113: lstore #13
    //   115: lload #11
    //   117: lload #13
    //   119: lcmp
    //   120: ifeq -> 136
    //   123: aload_0
    //   124: aload_2
    //   125: invokespecial b : (Ljava/io/Closeable;)V
    //   128: aload_0
    //   129: aload_1
    //   130: invokespecial b : (Ljava/io/Closeable;)V
    //   133: goto -> 256
    //   136: aload_0
    //   137: aload_2
    //   138: invokespecial b : (Ljava/io/Closeable;)V
    //   141: aload_0
    //   142: aload_1
    //   143: invokespecial b : (Ljava/io/Closeable;)V
    //   146: aload #4
    //   148: iconst_1
    //   149: iconst_0
    //   150: invokevirtual setReadable : (ZZ)Z
    //   153: pop
    //   154: aload #4
    //   156: iconst_1
    //   157: iconst_0
    //   158: invokevirtual setExecutable : (ZZ)Z
    //   161: pop
    //   162: aload #4
    //   164: iconst_1
    //   165: invokevirtual setWritable : (Z)Z
    //   168: pop
    //   169: aload #8
    //   171: getfield a : Ljava/util/zip/ZipFile;
    //   174: astore_1
    //   175: aload_1
    //   176: ifnull -> 183
    //   179: aload_1
    //   180: invokevirtual close : ()V
    //   183: return
    //   184: astore #4
    //   186: aload_1
    //   187: astore_3
    //   188: aload #4
    //   190: astore_1
    //   191: goto -> 197
    //   194: astore_1
    //   195: aconst_null
    //   196: astore_3
    //   197: goto -> 218
    //   200: astore_1
    //   201: aconst_null
    //   202: astore_1
    //   203: goto -> 235
    //   206: astore_1
    //   207: aconst_null
    //   208: astore_1
    //   209: goto -> 248
    //   212: astore_1
    //   213: aconst_null
    //   214: astore_3
    //   215: aload #7
    //   217: astore_2
    //   218: aload_0
    //   219: aload_2
    //   220: invokespecial b : (Ljava/io/Closeable;)V
    //   223: aload_0
    //   224: aload_3
    //   225: invokespecial b : (Ljava/io/Closeable;)V
    //   228: aload_1
    //   229: athrow
    //   230: astore_1
    //   231: aconst_null
    //   232: astore_2
    //   233: aload_2
    //   234: astore_1
    //   235: aload_0
    //   236: aload_2
    //   237: invokespecial b : (Ljava/io/Closeable;)V
    //   240: goto -> 128
    //   243: astore_1
    //   244: aconst_null
    //   245: astore_2
    //   246: aload_2
    //   247: astore_1
    //   248: aload_0
    //   249: aload_2
    //   250: invokespecial b : (Ljava/io/Closeable;)V
    //   253: goto -> 128
    //   256: iinc #9, 1
    //   259: goto -> 25
    //   262: aload #5
    //   264: ldc 'FATAL! Couldn't extract the library from the APK!'
    //   266: invokevirtual h : (Ljava/lang/String;)V
    //   269: aload #8
    //   271: getfield a : Ljava/util/zip/ZipFile;
    //   274: astore_1
    //   275: aload_1
    //   276: ifnull -> 283
    //   279: aload_1
    //   280: invokevirtual close : ()V
    //   283: return
    //   284: aload_0
    //   285: aload_1
    //   286: aload_3
    //   287: invokespecial e : (Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
    //   290: astore_1
    //   291: goto -> 314
    //   294: astore_1
    //   295: aload #8
    //   297: astore_2
    //   298: goto -> 334
    //   301: astore_1
    //   302: iconst_1
    //   303: anewarray java/lang/String
    //   306: dup
    //   307: iconst_0
    //   308: aload_1
    //   309: invokevirtual toString : ()Ljava/lang/String;
    //   312: aastore
    //   313: astore_1
    //   314: new com/getkeepsafe/relinker/MissingLibraryException
    //   317: astore #4
    //   319: aload #4
    //   321: aload_3
    //   322: aload_2
    //   323: aload_1
    //   324: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
    //   327: aload #4
    //   329: athrow
    //   330: astore_1
    //   331: aload #6
    //   333: astore_2
    //   334: aload_2
    //   335: ifnull -> 351
    //   338: aload_2
    //   339: getfield a : Ljava/util/zip/ZipFile;
    //   342: astore_2
    //   343: aload_2
    //   344: ifnull -> 351
    //   347: aload_2
    //   348: invokevirtual close : ()V
    //   351: goto -> 356
    //   354: aload_1
    //   355: athrow
    //   356: goto -> 354
    //   359: astore_1
    //   360: goto -> 256
    //   363: astore #6
    //   365: goto -> 248
    //   368: astore #6
    //   370: goto -> 235
    //   373: astore_1
    //   374: goto -> 183
    //   377: astore_1
    //   378: goto -> 283
    //   381: astore_2
    //   382: goto -> 351
    // Exception table:
    //   from	to	target	type
    //   6	17	330	finally
    //   31	46	294	finally
    //   46	61	359	java/io/IOException
    //   46	61	294	finally
    //   69	83	243	java/io/FileNotFoundException
    //   69	83	230	java/io/IOException
    //   69	83	212	finally
    //   83	93	206	java/io/FileNotFoundException
    //   83	93	200	java/io/IOException
    //   83	93	194	finally
    //   93	115	363	java/io/FileNotFoundException
    //   93	115	368	java/io/IOException
    //   93	115	184	finally
    //   123	128	294	finally
    //   128	133	294	finally
    //   136	169	294	finally
    //   169	175	373	java/io/IOException
    //   179	183	373	java/io/IOException
    //   218	230	294	finally
    //   235	240	294	finally
    //   248	253	294	finally
    //   262	269	294	finally
    //   269	275	377	java/io/IOException
    //   279	283	377	java/io/IOException
    //   284	291	301	java/lang/Exception
    //   284	291	294	finally
    //   302	314	294	finally
    //   314	330	294	finally
    //   338	343	381	java/io/IOException
    //   347	351	381	java/io/IOException
  }
  
  private static class a {
    public ZipFile a;
    
    public ZipEntry b;
    
    public a(ZipFile param1ZipFile, ZipEntry param1ZipEntry) {
      this.a = param1ZipFile;
      this.b = param1ZipEntry;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/getkeepsafe/relinker/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */