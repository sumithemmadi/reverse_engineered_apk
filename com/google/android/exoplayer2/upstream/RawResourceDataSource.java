package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.e;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class RawResourceDataSource extends g {
  private final Resources f;
  
  private Uri g;
  
  private AssetFileDescriptor h;
  
  private InputStream i;
  
  private long j;
  
  private boolean k;
  
  public RawResourceDataSource(Context paramContext) {
    super(false);
    this.f = paramContext.getResources();
  }
  
  public static Uri buildRawResourceUri(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("rawresource:///");
    stringBuilder.append(paramInt);
    return Uri.parse(stringBuilder.toString());
  }
  
  public void close() {
    Exception exception1;
    Exception exception2;
    this.g = null;
    try {
      InputStream inputStream = this.i;
      if (inputStream != null)
        inputStream.close(); 
      this.i = null;
      try {
        AssetFileDescriptor assetFileDescriptor = this.h;
        if (assetFileDescriptor != null)
          assetFileDescriptor.close(); 
        this.h = null;
        if (this.k) {
          this.k = false;
          b();
        } 
        return;
      } catch (IOException null) {
        exception1 = new RawResourceDataSourceException();
        this((IOException)exception2);
        throw exception1;
      } finally {}
      this.h = null;
      if (this.k) {
        this.k = false;
        b();
      } 
      throw inputStream;
    } catch (IOException null) {
      exception2 = new RawResourceDataSourceException();
      this((IOException)exception1);
      throw exception2;
    } finally {}
    this.i = null;
    try {
      AssetFileDescriptor assetFileDescriptor = this.h;
      if (assetFileDescriptor != null)
        assetFileDescriptor.close(); 
      this.h = null;
      if (this.k) {
        this.k = false;
        b();
      } 
      throw exception2;
    } catch (IOException null) {
      exception2 = new RawResourceDataSourceException();
      super((IOException)exception1);
      throw exception2;
    } finally {}
    this.h = null;
    if (this.k) {
      this.k = false;
      b();
    } 
    throw exception1;
  }
  
  public Uri e0() {
    return this.g;
  }
  
  public long g0(l paraml) {
    try {
      Uri uri = paraml.a;
      this.g = uri;
      boolean bool = TextUtils.equals("rawresource", uri.getScheme());
      if (bool)
        try {
          FileInputStream fileInputStream;
          int i = Integer.parseInt((String)e.e(uri.getLastPathSegment()));
          c(paraml);
          AssetFileDescriptor assetFileDescriptor = this.f.openRawResourceFd(i);
          this.h = assetFileDescriptor;
          if (assetFileDescriptor != null) {
            fileInputStream = new FileInputStream();
            this(assetFileDescriptor.getFileDescriptor());
            this.i = fileInputStream;
            fileInputStream.skip(assetFileDescriptor.getStartOffset());
            if (fileInputStream.skip(paraml.f) >= paraml.f) {
              long l1 = paraml.g;
              long l2 = -1L;
              if (l1 != -1L) {
                this.j = l1;
              } else {
                l1 = assetFileDescriptor.getLength();
                if (l1 != -1L)
                  l2 = l1 - paraml.f; 
                this.j = l2;
              } 
              this.k = true;
              d(paraml);
              return this.j;
            } 
            EOFException eOFException = new EOFException();
            this();
            throw eOFException;
          } 
          RawResourceDataSourceException rawResourceDataSourceException1 = new RawResourceDataSourceException();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Resource is compressed: ");
          stringBuilder.append(fileInputStream);
          this(stringBuilder.toString());
          throw rawResourceDataSourceException1;
        } catch (NumberFormatException numberFormatException) {
          RawResourceDataSourceException rawResourceDataSourceException1 = new RawResourceDataSourceException();
          this("Resource identifier must be an integer.");
          throw rawResourceDataSourceException1;
        }  
      RawResourceDataSourceException rawResourceDataSourceException = new RawResourceDataSourceException();
      this("URI must use scheme rawresource");
      throw rawResourceDataSourceException;
    } catch (IOException iOException) {
      throw new RawResourceDataSourceException(iOException);
    } 
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_3
    //   1: ifne -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: aload_0
    //   7: getfield j : J
    //   10: lstore #4
    //   12: lload #4
    //   14: lconst_0
    //   15: lcmp
    //   16: ifne -> 21
    //   19: iconst_m1
    //   20: ireturn
    //   21: lload #4
    //   23: ldc2_w -1
    //   26: lcmp
    //   27: ifne -> 33
    //   30: goto -> 46
    //   33: iload_3
    //   34: i2l
    //   35: lstore #6
    //   37: lload #4
    //   39: lload #6
    //   41: invokestatic min : (JJ)J
    //   44: l2i
    //   45: istore_3
    //   46: aload_0
    //   47: getfield i : Ljava/io/InputStream;
    //   50: invokestatic g : (Ljava/lang/Object;)Ljava/lang/Object;
    //   53: checkcast java/io/InputStream
    //   56: aload_1
    //   57: iload_2
    //   58: iload_3
    //   59: invokevirtual read : ([BII)I
    //   62: istore_2
    //   63: iload_2
    //   64: iconst_m1
    //   65: if_icmpne -> 96
    //   68: aload_0
    //   69: getfield j : J
    //   72: ldc2_w -1
    //   75: lcmp
    //   76: ifne -> 81
    //   79: iconst_m1
    //   80: ireturn
    //   81: new com/google/android/exoplayer2/upstream/RawResourceDataSource$RawResourceDataSourceException
    //   84: dup
    //   85: new java/io/EOFException
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: invokespecial <init> : (Ljava/io/IOException;)V
    //   95: athrow
    //   96: aload_0
    //   97: getfield j : J
    //   100: lstore #6
    //   102: lload #6
    //   104: ldc2_w -1
    //   107: lcmp
    //   108: ifeq -> 120
    //   111: aload_0
    //   112: lload #6
    //   114: iload_2
    //   115: i2l
    //   116: lsub
    //   117: putfield j : J
    //   120: aload_0
    //   121: iload_2
    //   122: invokevirtual a : (I)V
    //   125: iload_2
    //   126: ireturn
    //   127: astore_1
    //   128: new com/google/android/exoplayer2/upstream/RawResourceDataSource$RawResourceDataSourceException
    //   131: dup
    //   132: aload_1
    //   133: invokespecial <init> : (Ljava/io/IOException;)V
    //   136: athrow
    // Exception table:
    //   from	to	target	type
    //   37	46	127	java/io/IOException
    //   46	63	127	java/io/IOException
  }
  
  public static class RawResourceDataSourceException extends IOException {
    public RawResourceDataSourceException(IOException param1IOException) {
      super(param1IOException);
    }
    
    public RawResourceDataSourceException(String param1String) {
      super(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/RawResourceDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */