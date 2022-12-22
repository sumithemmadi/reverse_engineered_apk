package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.x.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream extends FilterInputStream {
  private volatile byte[] b;
  
  private int c;
  
  private int d;
  
  private int e = -1;
  
  private int f;
  
  private final b g;
  
  public RecyclableBufferedInputStream(InputStream paramInputStream, b paramb) {
    this(paramInputStream, paramb, 65536);
  }
  
  RecyclableBufferedInputStream(InputStream paramInputStream, b paramb, int paramInt) {
    super(paramInputStream);
    this.g = paramb;
    this.b = (byte[])paramb.e(paramInt, byte[].class);
  }
  
  private int b(InputStream paramInputStream, byte[] paramArrayOfbyte) {
    int i = this.e;
    if (i != -1) {
      int k = this.f;
      int m = this.d;
      if (k - i < m) {
        byte[] arrayOfByte;
        if (i == 0 && m > paramArrayOfbyte.length && this.c == paramArrayOfbyte.length) {
          i = paramArrayOfbyte.length * 2;
          if (i <= m)
            m = i; 
          arrayOfByte = (byte[])this.g.e(m, byte[].class);
          System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, paramArrayOfbyte.length);
          this.b = arrayOfByte;
          this.g.d(paramArrayOfbyte);
        } else {
          arrayOfByte = paramArrayOfbyte;
          if (i > 0) {
            System.arraycopy(paramArrayOfbyte, i, paramArrayOfbyte, 0, paramArrayOfbyte.length - i);
            arrayOfByte = paramArrayOfbyte;
          } 
        } 
        m = this.f - this.e;
        this.f = m;
        this.e = 0;
        this.c = 0;
        i = paramInputStream.read(arrayOfByte, m, arrayOfByte.length - m);
        m = this.f;
        if (i > 0)
          m += i; 
        this.c = m;
        return i;
      } 
    } 
    int j = paramInputStream.read(paramArrayOfbyte);
    if (j > 0) {
      this.e = -1;
      this.f = 0;
      this.c = j;
    } 
    return j;
  }
  
  private static IOException e() {
    throw new IOException("BufferedInputStream is closed");
  }
  
  public int available() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield in : Ljava/io/InputStream;
    //   6: astore_1
    //   7: aload_0
    //   8: getfield b : [B
    //   11: ifnull -> 43
    //   14: aload_1
    //   15: ifnull -> 43
    //   18: aload_0
    //   19: getfield c : I
    //   22: istore_2
    //   23: aload_0
    //   24: getfield f : I
    //   27: istore_3
    //   28: aload_1
    //   29: invokevirtual available : ()I
    //   32: istore #4
    //   34: aload_0
    //   35: monitorexit
    //   36: iload_2
    //   37: iload_3
    //   38: isub
    //   39: iload #4
    //   41: iadd
    //   42: ireturn
    //   43: invokestatic e : ()Ljava/io/IOException;
    //   46: athrow
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	47	finally
    //   18	34	47	finally
    //   43	47	47	finally
  }
  
  public void c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield b : [B
    //   7: arraylength
    //   8: putfield d : I
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	14	finally
  }
  
  public void close() {
    if (this.b != null) {
      this.g.d(this.b);
      this.b = null;
    } 
    InputStream inputStream = this.in;
    this.in = null;
    if (inputStream != null)
      inputStream.close(); 
  }
  
  public void d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : [B
    //   6: ifnull -> 27
    //   9: aload_0
    //   10: getfield g : Lcom/bumptech/glide/load/engine/x/b;
    //   13: aload_0
    //   14: getfield b : [B
    //   17: invokeinterface d : (Ljava/lang/Object;)V
    //   22: aload_0
    //   23: aconst_null
    //   24: putfield b : [B
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   2	27	30	finally
  }
  
  public void mark(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield d : I
    //   7: iload_1
    //   8: invokestatic max : (II)I
    //   11: putfield d : I
    //   14: aload_0
    //   15: aload_0
    //   16: getfield f : I
    //   19: putfield e : I
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	22	25	finally
  }
  
  public boolean markSupported() {
    return true;
  }
  
  public int read() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : [B
    //   6: astore_1
    //   7: aload_0
    //   8: getfield in : Ljava/io/InputStream;
    //   11: astore_2
    //   12: aload_1
    //   13: ifnull -> 114
    //   16: aload_2
    //   17: ifnull -> 114
    //   20: aload_0
    //   21: getfield f : I
    //   24: aload_0
    //   25: getfield c : I
    //   28: if_icmplt -> 47
    //   31: aload_0
    //   32: aload_2
    //   33: aload_1
    //   34: invokespecial b : (Ljava/io/InputStream;[B)I
    //   37: istore_3
    //   38: iload_3
    //   39: iconst_m1
    //   40: if_icmpne -> 47
    //   43: aload_0
    //   44: monitorexit
    //   45: iconst_m1
    //   46: ireturn
    //   47: aload_1
    //   48: astore_2
    //   49: aload_1
    //   50: aload_0
    //   51: getfield b : [B
    //   54: if_acmpeq -> 73
    //   57: aload_0
    //   58: getfield b : [B
    //   61: astore_2
    //   62: aload_2
    //   63: ifnull -> 69
    //   66: goto -> 73
    //   69: invokestatic e : ()Ljava/io/IOException;
    //   72: athrow
    //   73: aload_0
    //   74: getfield c : I
    //   77: istore #4
    //   79: aload_0
    //   80: getfield f : I
    //   83: istore_3
    //   84: iload #4
    //   86: iload_3
    //   87: isub
    //   88: ifle -> 110
    //   91: aload_0
    //   92: iload_3
    //   93: iconst_1
    //   94: iadd
    //   95: putfield f : I
    //   98: aload_2
    //   99: iload_3
    //   100: baload
    //   101: istore_3
    //   102: aload_0
    //   103: monitorexit
    //   104: iload_3
    //   105: sipush #255
    //   108: iand
    //   109: ireturn
    //   110: aload_0
    //   111: monitorexit
    //   112: iconst_m1
    //   113: ireturn
    //   114: invokestatic e : ()Ljava/io/IOException;
    //   117: athrow
    //   118: astore_2
    //   119: aload_0
    //   120: monitorexit
    //   121: aload_2
    //   122: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	118	finally
    //   20	38	118	finally
    //   49	62	118	finally
    //   69	73	118	finally
    //   73	84	118	finally
    //   91	98	118	finally
    //   114	118	118	finally
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : [B
    //   6: astore #4
    //   8: aload #4
    //   10: ifnull -> 384
    //   13: iload_3
    //   14: ifne -> 21
    //   17: aload_0
    //   18: monitorexit
    //   19: iconst_0
    //   20: ireturn
    //   21: aload_0
    //   22: getfield in : Ljava/io/InputStream;
    //   25: astore #5
    //   27: aload #5
    //   29: ifnull -> 380
    //   32: aload_0
    //   33: getfield f : I
    //   36: istore #6
    //   38: aload_0
    //   39: getfield c : I
    //   42: istore #7
    //   44: iload #6
    //   46: iload #7
    //   48: if_icmpge -> 139
    //   51: iload #7
    //   53: iload #6
    //   55: isub
    //   56: iload_3
    //   57: if_icmplt -> 66
    //   60: iload_3
    //   61: istore #7
    //   63: goto -> 73
    //   66: iload #7
    //   68: iload #6
    //   70: isub
    //   71: istore #7
    //   73: aload #4
    //   75: iload #6
    //   77: aload_1
    //   78: iload_2
    //   79: iload #7
    //   81: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   84: aload_0
    //   85: aload_0
    //   86: getfield f : I
    //   89: iload #7
    //   91: iadd
    //   92: putfield f : I
    //   95: iload #7
    //   97: iload_3
    //   98: if_icmpeq -> 134
    //   101: aload #5
    //   103: invokevirtual available : ()I
    //   106: istore #6
    //   108: iload #6
    //   110: ifne -> 116
    //   113: goto -> 134
    //   116: iload_2
    //   117: iload #7
    //   119: iadd
    //   120: istore #6
    //   122: iload_3
    //   123: iload #7
    //   125: isub
    //   126: istore_2
    //   127: iload #6
    //   129: istore #7
    //   131: goto -> 148
    //   134: aload_0
    //   135: monitorexit
    //   136: iload #7
    //   138: ireturn
    //   139: iload_3
    //   140: istore #6
    //   142: iload_2
    //   143: istore #7
    //   145: iload #6
    //   147: istore_2
    //   148: aload_0
    //   149: getfield e : I
    //   152: istore #8
    //   154: iconst_m1
    //   155: istore #6
    //   157: iload #8
    //   159: iconst_m1
    //   160: if_icmpne -> 209
    //   163: iload_2
    //   164: aload #4
    //   166: arraylength
    //   167: if_icmplt -> 209
    //   170: aload #5
    //   172: aload_1
    //   173: iload #7
    //   175: iload_2
    //   176: invokevirtual read : ([BII)I
    //   179: istore #9
    //   181: iload #9
    //   183: istore #8
    //   185: iload #9
    //   187: iconst_m1
    //   188: if_icmpne -> 339
    //   191: iload_2
    //   192: iload_3
    //   193: if_icmpne -> 199
    //   196: goto -> 204
    //   199: iload_3
    //   200: iload_2
    //   201: isub
    //   202: istore #6
    //   204: aload_0
    //   205: monitorexit
    //   206: iload #6
    //   208: ireturn
    //   209: aload_0
    //   210: aload #5
    //   212: aload #4
    //   214: invokespecial b : (Ljava/io/InputStream;[B)I
    //   217: istore #8
    //   219: iload #8
    //   221: iconst_m1
    //   222: if_icmpne -> 243
    //   225: iload_2
    //   226: iload_3
    //   227: if_icmpne -> 233
    //   230: goto -> 238
    //   233: iload_3
    //   234: iload_2
    //   235: isub
    //   236: istore #6
    //   238: aload_0
    //   239: monitorexit
    //   240: iload #6
    //   242: ireturn
    //   243: aload #4
    //   245: astore #10
    //   247: aload #4
    //   249: aload_0
    //   250: getfield b : [B
    //   253: if_acmpeq -> 274
    //   256: aload_0
    //   257: getfield b : [B
    //   260: astore #10
    //   262: aload #10
    //   264: ifnull -> 270
    //   267: goto -> 274
    //   270: invokestatic e : ()Ljava/io/IOException;
    //   273: athrow
    //   274: aload_0
    //   275: getfield c : I
    //   278: istore #6
    //   280: aload_0
    //   281: getfield f : I
    //   284: istore #8
    //   286: iload #6
    //   288: iload #8
    //   290: isub
    //   291: iload_2
    //   292: if_icmplt -> 301
    //   295: iload_2
    //   296: istore #6
    //   298: goto -> 308
    //   301: iload #6
    //   303: iload #8
    //   305: isub
    //   306: istore #6
    //   308: aload #10
    //   310: iload #8
    //   312: aload_1
    //   313: iload #7
    //   315: iload #6
    //   317: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   320: aload_0
    //   321: aload_0
    //   322: getfield f : I
    //   325: iload #6
    //   327: iadd
    //   328: putfield f : I
    //   331: iload #6
    //   333: istore #8
    //   335: aload #10
    //   337: astore #4
    //   339: iload_2
    //   340: iload #8
    //   342: isub
    //   343: istore_2
    //   344: iload_2
    //   345: ifne -> 352
    //   348: aload_0
    //   349: monitorexit
    //   350: iload_3
    //   351: ireturn
    //   352: aload #5
    //   354: invokevirtual available : ()I
    //   357: istore #6
    //   359: iload #6
    //   361: ifne -> 370
    //   364: aload_0
    //   365: monitorexit
    //   366: iload_3
    //   367: iload_2
    //   368: isub
    //   369: ireturn
    //   370: iload #7
    //   372: iload #8
    //   374: iadd
    //   375: istore #7
    //   377: goto -> 148
    //   380: invokestatic e : ()Ljava/io/IOException;
    //   383: athrow
    //   384: invokestatic e : ()Ljava/io/IOException;
    //   387: athrow
    //   388: astore_1
    //   389: aload_0
    //   390: monitorexit
    //   391: goto -> 396
    //   394: aload_1
    //   395: athrow
    //   396: goto -> 394
    // Exception table:
    //   from	to	target	type
    //   2	8	388	finally
    //   21	27	388	finally
    //   32	44	388	finally
    //   73	95	388	finally
    //   101	108	388	finally
    //   148	154	388	finally
    //   163	181	388	finally
    //   209	219	388	finally
    //   247	262	388	finally
    //   270	274	388	finally
    //   274	286	388	finally
    //   308	331	388	finally
    //   352	359	388	finally
    //   380	384	388	finally
    //   384	388	388	finally
  }
  
  public void reset() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : [B
    //   6: ifnull -> 81
    //   9: aload_0
    //   10: getfield e : I
    //   13: istore_1
    //   14: iconst_m1
    //   15: iload_1
    //   16: if_icmpeq -> 27
    //   19: aload_0
    //   20: iload_1
    //   21: putfield f : I
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: new com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream$InvalidMarkException
    //   30: astore_2
    //   31: new java/lang/StringBuilder
    //   34: astore_3
    //   35: aload_3
    //   36: invokespecial <init> : ()V
    //   39: aload_3
    //   40: ldc 'Mark has been invalidated, pos: '
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload_3
    //   47: aload_0
    //   48: getfield f : I
    //   51: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload_3
    //   56: ldc ' markLimit: '
    //   58: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload_3
    //   63: aload_0
    //   64: getfield d : I
    //   67: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   70: pop
    //   71: aload_2
    //   72: aload_3
    //   73: invokevirtual toString : ()Ljava/lang/String;
    //   76: invokespecial <init> : (Ljava/lang/String;)V
    //   79: aload_2
    //   80: athrow
    //   81: new java/io/IOException
    //   84: astore_3
    //   85: aload_3
    //   86: ldc 'Stream is closed'
    //   88: invokespecial <init> : (Ljava/lang/String;)V
    //   91: aload_3
    //   92: athrow
    //   93: astore_3
    //   94: aload_0
    //   95: monitorexit
    //   96: aload_3
    //   97: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	93	finally
    //   19	24	93	finally
    //   27	81	93	finally
    //   81	93	93	finally
  }
  
  public long skip(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: lload_1
    //   3: lconst_1
    //   4: lcmp
    //   5: ifge -> 12
    //   8: aload_0
    //   9: monitorexit
    //   10: lconst_0
    //   11: lreturn
    //   12: aload_0
    //   13: getfield b : [B
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull -> 222
    //   21: aload_0
    //   22: getfield in : Ljava/io/InputStream;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 218
    //   32: aload_0
    //   33: getfield c : I
    //   36: istore #5
    //   38: aload_0
    //   39: getfield f : I
    //   42: istore #6
    //   44: iload #5
    //   46: iload #6
    //   48: isub
    //   49: i2l
    //   50: lload_1
    //   51: lcmp
    //   52: iflt -> 69
    //   55: aload_0
    //   56: iload #6
    //   58: i2l
    //   59: lload_1
    //   60: ladd
    //   61: l2i
    //   62: putfield f : I
    //   65: aload_0
    //   66: monitorexit
    //   67: lload_1
    //   68: lreturn
    //   69: iload #5
    //   71: i2l
    //   72: iload #6
    //   74: i2l
    //   75: lsub
    //   76: lstore #7
    //   78: aload_0
    //   79: iload #5
    //   81: putfield f : I
    //   84: aload_0
    //   85: getfield e : I
    //   88: iconst_m1
    //   89: if_icmpeq -> 190
    //   92: lload_1
    //   93: aload_0
    //   94: getfield d : I
    //   97: i2l
    //   98: lcmp
    //   99: ifgt -> 190
    //   102: aload_0
    //   103: aload #4
    //   105: aload_3
    //   106: invokespecial b : (Ljava/io/InputStream;[B)I
    //   109: istore #5
    //   111: iload #5
    //   113: iconst_m1
    //   114: if_icmpne -> 122
    //   117: aload_0
    //   118: monitorexit
    //   119: lload #7
    //   121: lreturn
    //   122: aload_0
    //   123: getfield c : I
    //   126: istore #5
    //   128: aload_0
    //   129: getfield f : I
    //   132: istore #6
    //   134: iload #5
    //   136: iload #6
    //   138: isub
    //   139: i2l
    //   140: lload_1
    //   141: lload #7
    //   143: lsub
    //   144: lcmp
    //   145: iflt -> 165
    //   148: aload_0
    //   149: iload #6
    //   151: i2l
    //   152: lload_1
    //   153: ladd
    //   154: lload #7
    //   156: lsub
    //   157: l2i
    //   158: putfield f : I
    //   161: aload_0
    //   162: monitorexit
    //   163: lload_1
    //   164: lreturn
    //   165: iload #5
    //   167: i2l
    //   168: lstore #9
    //   170: iload #6
    //   172: i2l
    //   173: lstore_1
    //   174: aload_0
    //   175: iload #5
    //   177: putfield f : I
    //   180: aload_0
    //   181: monitorexit
    //   182: lload #7
    //   184: lload #9
    //   186: ladd
    //   187: lload_1
    //   188: lsub
    //   189: lreturn
    //   190: aload #4
    //   192: lload_1
    //   193: lload #7
    //   195: lsub
    //   196: invokevirtual skip : (J)J
    //   199: lstore_1
    //   200: lload_1
    //   201: lconst_0
    //   202: lcmp
    //   203: ifle -> 211
    //   206: aload_0
    //   207: iconst_m1
    //   208: putfield e : I
    //   211: aload_0
    //   212: monitorexit
    //   213: lload #7
    //   215: lload_1
    //   216: ladd
    //   217: lreturn
    //   218: invokestatic e : ()Ljava/io/IOException;
    //   221: athrow
    //   222: invokestatic e : ()Ljava/io/IOException;
    //   225: athrow
    //   226: astore #4
    //   228: aload_0
    //   229: monitorexit
    //   230: aload #4
    //   232: athrow
    // Exception table:
    //   from	to	target	type
    //   12	17	226	finally
    //   21	27	226	finally
    //   32	44	226	finally
    //   55	65	226	finally
    //   78	111	226	finally
    //   122	134	226	finally
    //   148	161	226	finally
    //   174	180	226	finally
    //   190	200	226	finally
    //   206	211	226	finally
    //   218	222	226	finally
    //   222	226	226	finally
  }
  
  static class InvalidMarkException extends IOException {
    private static final long serialVersionUID = -4338378848813561757L;
    
    InvalidMarkException(String param1String) {
      super(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */