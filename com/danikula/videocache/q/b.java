package com.danikula.videocache.q;

import com.danikula.videocache.ProxyCacheException;
import com.danikula.videocache.a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class b implements a {
  private final a a;
  
  public File b;
  
  private RandomAccessFile c;
  
  public b(File paramFile, a parama) {
    if (parama != null)
      try {
        File file1;
        String str;
        this.a = parama;
        d.b(paramFile.getParentFile());
        boolean bool = paramFile.exists();
        if (bool) {
          file1 = paramFile;
        } else {
          file1 = paramFile.getParentFile();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(paramFile.getName());
          stringBuilder.append(".download");
          file1 = new File(file1, stringBuilder.toString());
        } 
        this.b = file1;
        RandomAccessFile randomAccessFile = new RandomAccessFile();
        File file2 = this.b;
        if (bool) {
          str = "r";
        } else {
          str = "rw";
        } 
        this(file2, str);
        this.c = randomAccessFile;
        return;
      } catch (IOException iOException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error using file ");
        stringBuilder.append(paramFile);
        stringBuilder.append(" as disc cache");
        throw new ProxyCacheException(stringBuilder.toString(), iOException);
      }  
    NullPointerException nullPointerException = new NullPointerException();
    this();
    throw nullPointerException;
  }
  
  private boolean f(File paramFile) {
    return paramFile.getName().endsWith(".download");
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual d : ()Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokevirtual close : ()V
    //   18: aload_0
    //   19: getfield b : Ljava/io/File;
    //   22: invokevirtual getName : ()Ljava/lang/String;
    //   25: iconst_0
    //   26: aload_0
    //   27: getfield b : Ljava/io/File;
    //   30: invokevirtual getName : ()Ljava/lang/String;
    //   33: invokevirtual length : ()I
    //   36: bipush #9
    //   38: isub
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: astore_2
    //   43: new java/io/File
    //   46: astore_3
    //   47: aload_3
    //   48: aload_0
    //   49: getfield b : Ljava/io/File;
    //   52: invokevirtual getParentFile : ()Ljava/io/File;
    //   55: aload_2
    //   56: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   59: aload_0
    //   60: getfield b : Ljava/io/File;
    //   63: aload_3
    //   64: invokevirtual renameTo : (Ljava/io/File;)Z
    //   67: ifeq -> 160
    //   70: aload_0
    //   71: aload_3
    //   72: putfield b : Ljava/io/File;
    //   75: new java/io/RandomAccessFile
    //   78: astore_3
    //   79: aload_3
    //   80: aload_0
    //   81: getfield b : Ljava/io/File;
    //   84: ldc 'r'
    //   86: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   89: aload_0
    //   90: aload_3
    //   91: putfield c : Ljava/io/RandomAccessFile;
    //   94: aload_0
    //   95: getfield a : Lcom/danikula/videocache/q/a;
    //   98: aload_0
    //   99: getfield b : Ljava/io/File;
    //   102: invokeinterface a : (Ljava/io/File;)V
    //   107: aload_0
    //   108: monitorexit
    //   109: return
    //   110: astore_3
    //   111: new com/danikula/videocache/ProxyCacheException
    //   114: astore #4
    //   116: new java/lang/StringBuilder
    //   119: astore_2
    //   120: aload_2
    //   121: invokespecial <init> : ()V
    //   124: aload_2
    //   125: ldc 'Error opening '
    //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: aload_2
    //   132: aload_0
    //   133: getfield b : Ljava/io/File;
    //   136: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: aload_2
    //   141: ldc ' as disc cache'
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload #4
    //   149: aload_2
    //   150: invokevirtual toString : ()Ljava/lang/String;
    //   153: aload_3
    //   154: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   157: aload #4
    //   159: athrow
    //   160: new com/danikula/videocache/ProxyCacheException
    //   163: astore #4
    //   165: new java/lang/StringBuilder
    //   168: astore_2
    //   169: aload_2
    //   170: invokespecial <init> : ()V
    //   173: aload_2
    //   174: ldc 'Error renaming file '
    //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: aload_2
    //   181: aload_0
    //   182: getfield b : Ljava/io/File;
    //   185: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   188: pop
    //   189: aload_2
    //   190: ldc ' to '
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: pop
    //   196: aload_2
    //   197: aload_3
    //   198: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: aload_2
    //   203: ldc ' for completion!'
    //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload #4
    //   211: aload_2
    //   212: invokevirtual toString : ()Ljava/lang/String;
    //   215: invokespecial <init> : (Ljava/lang/String;)V
    //   218: aload #4
    //   220: athrow
    //   221: astore_3
    //   222: aload_0
    //   223: monitorexit
    //   224: aload_3
    //   225: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	221	finally
    //   14	75	221	finally
    //   75	107	110	java/io/IOException
    //   75	107	221	finally
    //   111	160	221	finally
    //   160	221	221	finally
  }
  
  public long b() {
    Exception exception;
    /* monitor enter ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
    try {
      long l = this.c.length();
      l = (int)l;
      /* monitor exit ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
      return l;
    } catch (IOException iOException) {
      ProxyCacheException proxyCacheException = new ProxyCacheException();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("Error reading length of file ");
      stringBuilder.append(this.b);
      this(stringBuilder.toString(), iOException);
      throw proxyCacheException;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
    throw exception;
  }
  
  public void c(byte[] paramArrayOfbyte, int paramInt) {
    /* monitor enter ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
    try {
      if (!d()) {
        this.c.seek(b());
        this.c.write(paramArrayOfbyte, 0, paramInt);
        /* monitor exit ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
        return;
      } 
      ProxyCacheException proxyCacheException = new ProxyCacheException();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("Error append cache: cache file ");
      stringBuilder.append(this.b);
      stringBuilder.append(" is completed!");
      this(stringBuilder.toString());
      throw proxyCacheException;
    } catch (IOException iOException) {
      ProxyCacheException proxyCacheException = new ProxyCacheException();
      this(String.format("Error writing %d bytes to %s from buffer with size %d", new Object[] { Integer.valueOf(paramInt), this.c, Integer.valueOf(paramArrayOfbyte.length) }), iOException);
      throw proxyCacheException;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
    throw paramArrayOfbyte;
  }
  
  public void close() {
    Exception exception;
    /* monitor enter ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
    try {
      this.c.close();
      this.a.a(this.b);
      /* monitor exit ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
      return;
    } catch (IOException iOException) {
      ProxyCacheException proxyCacheException = new ProxyCacheException();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("Error closing file ");
      stringBuilder.append(this.b);
      this(stringBuilder.toString(), iOException);
      throw proxyCacheException;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
    throw exception;
  }
  
  public boolean d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield b : Ljava/io/File;
    //   7: invokespecial f : (Ljava/io/File;)Z
    //   10: istore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: iload_1
    //   14: iconst_1
    //   15: ixor
    //   16: ireturn
    //   17: astore_2
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_2
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	17	finally
  }
  
  public int e(byte[] paramArrayOfbyte, long paramLong, int paramInt) {
    /* monitor enter ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
    try {
      this.c.seek(paramLong);
      int i = this.c.read(paramArrayOfbyte, 0, paramInt);
      /* monitor exit ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
      return i;
    } catch (IOException iOException) {
      ProxyCacheException proxyCacheException = new ProxyCacheException();
      this(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Long.valueOf(b()), Integer.valueOf(paramArrayOfbyte.length) }), iOException);
      throw proxyCacheException;
    } finally {}
    /* monitor exit ThisExpression{ObjectType{com/danikula/videocache/q/b}} */
    throw paramArrayOfbyte;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/q/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */