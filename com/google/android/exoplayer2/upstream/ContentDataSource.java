package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class ContentDataSource extends g {
  private final ContentResolver f;
  
  private Uri g;
  
  private AssetFileDescriptor h;
  
  private FileInputStream i;
  
  private long j;
  
  private boolean k;
  
  public ContentDataSource(Context paramContext) {
    super(false);
    this.f = paramContext.getContentResolver();
  }
  
  public void close() {
    Exception exception;
    this.g = null;
    try {
      FileInputStream fileInputStream = this.i;
      if (fileInputStream != null)
        fileInputStream.close(); 
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
      } catch (IOException iOException) {
        exception = new ContentDataSourceException();
        this(iOException);
        throw exception;
      } finally {}
      this.h = null;
      if (this.k) {
        this.k = false;
        b();
      } 
      throw fileInputStream;
    } catch (IOException null) {
      ContentDataSourceException contentDataSourceException = new ContentDataSourceException();
      this((IOException)exception);
      throw contentDataSourceException;
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
      throw exception;
    } catch (IOException iOException) {
      exception = new ContentDataSourceException();
      super(iOException);
      throw exception;
    } finally {}
    this.h = null;
    if (this.k) {
      this.k = false;
      b();
    } 
    throw exception;
  }
  
  public Uri e0() {
    return this.g;
  }
  
  public long g0(l paraml) {
    try {
      FileChannel fileChannel;
      Uri uri = paraml.a;
      this.g = uri;
      c(paraml);
      AssetFileDescriptor assetFileDescriptor = this.f.openAssetFileDescriptor(uri, "r");
      this.h = assetFileDescriptor;
      if (assetFileDescriptor != null) {
        FileInputStream fileInputStream = new FileInputStream();
        this(assetFileDescriptor.getFileDescriptor());
        this.i = fileInputStream;
        long l1 = assetFileDescriptor.getStartOffset();
        long l2 = fileInputStream.skip(paraml.f + l1) - l1;
        if (l2 == paraml.f) {
          long l3 = paraml.g;
          l1 = -1L;
          if (l3 != -1L) {
            this.j = l3;
          } else {
            l3 = assetFileDescriptor.getLength();
            if (l3 == -1L) {
              fileChannel = fileInputStream.getChannel();
              l2 = fileChannel.size();
              if (l2 != 0L)
                l1 = l2 - fileChannel.position(); 
              this.j = l1;
            } else {
              this.j = l3 - l2;
            } 
          } 
          this.k = true;
          d(paraml);
          return this.j;
        } 
        EOFException eOFException = new EOFException();
        this();
        throw eOFException;
      } 
      FileNotFoundException fileNotFoundException = new FileNotFoundException();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("Could not open file descriptor for: ");
      stringBuilder.append(fileChannel);
      this(stringBuilder.toString());
      throw fileNotFoundException;
    } catch (IOException iOException) {
      throw new ContentDataSourceException(iOException);
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
    //   47: getfield i : Ljava/io/FileInputStream;
    //   50: invokestatic g : (Ljava/lang/Object;)Ljava/lang/Object;
    //   53: checkcast java/io/FileInputStream
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
    //   81: new com/google/android/exoplayer2/upstream/ContentDataSource$ContentDataSourceException
    //   84: dup
    //   85: new java/io/EOFException
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: invokespecial <init> : (Ljava/io/IOException;)V
    //   95: athrow
    //   96: aload_0
    //   97: getfield j : J
    //   100: lstore #4
    //   102: lload #4
    //   104: ldc2_w -1
    //   107: lcmp
    //   108: ifeq -> 120
    //   111: aload_0
    //   112: lload #4
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
    //   128: new com/google/android/exoplayer2/upstream/ContentDataSource$ContentDataSourceException
    //   131: dup
    //   132: aload_1
    //   133: invokespecial <init> : (Ljava/io/IOException;)V
    //   136: athrow
    // Exception table:
    //   from	to	target	type
    //   37	46	127	java/io/IOException
    //   46	63	127	java/io/IOException
  }
  
  public static class ContentDataSourceException extends IOException {
    public ContentDataSourceException(IOException param1IOException) {
      super(param1IOException);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/ContentDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */