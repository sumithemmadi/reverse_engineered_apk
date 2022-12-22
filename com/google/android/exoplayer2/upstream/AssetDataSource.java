package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.util.e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class AssetDataSource extends g {
  private final AssetManager f;
  
  private Uri g;
  
  private InputStream h;
  
  private long i;
  
  private boolean j;
  
  public AssetDataSource(Context paramContext) {
    super(false);
    this.f = paramContext.getAssets();
  }
  
  public void close() {
    Exception exception;
    this.g = null;
    try {
      InputStream inputStream = this.h;
      if (inputStream != null)
        inputStream.close(); 
      this.h = null;
      if (this.j) {
        this.j = false;
        b();
      } 
      return;
    } catch (IOException iOException) {
      exception = new AssetDataSourceException();
      this(iOException);
      throw exception;
    } finally {}
    this.h = null;
    if (this.j) {
      this.j = false;
      b();
    } 
    throw exception;
  }
  
  public Uri e0() {
    return this.g;
  }
  
  public long g0(l paraml) {
    try {
      String str1;
      Uri uri = paraml.a;
      this.g = uri;
      String str2 = (String)e.e(uri.getPath());
      if (str2.startsWith("/android_asset/")) {
        str1 = str2.substring(15);
      } else {
        str1 = str2;
        if (str2.startsWith("/"))
          str1 = str2.substring(1); 
      } 
      c(paraml);
      InputStream inputStream = this.f.open(str1, 1);
      this.h = inputStream;
      if (inputStream.skip(paraml.f) >= paraml.f) {
        long l1 = paraml.g;
        if (l1 != -1L) {
          this.i = l1;
        } else {
          l1 = this.h.available();
          this.i = l1;
          if (l1 == 2147483647L)
            this.i = -1L; 
        } 
        this.j = true;
        d(paraml);
        return this.i;
      } 
      EOFException eOFException = new EOFException();
      this();
      throw eOFException;
    } catch (IOException iOException) {
      throw new AssetDataSourceException(iOException);
    } 
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_3
    //   1: ifne -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: aload_0
    //   7: getfield i : J
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
    //   47: getfield h : Ljava/io/InputStream;
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
    //   69: getfield i : J
    //   72: ldc2_w -1
    //   75: lcmp
    //   76: ifne -> 81
    //   79: iconst_m1
    //   80: ireturn
    //   81: new com/google/android/exoplayer2/upstream/AssetDataSource$AssetDataSourceException
    //   84: dup
    //   85: new java/io/EOFException
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: invokespecial <init> : (Ljava/io/IOException;)V
    //   95: athrow
    //   96: aload_0
    //   97: getfield i : J
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
    //   117: putfield i : J
    //   120: aload_0
    //   121: iload_2
    //   122: invokevirtual a : (I)V
    //   125: iload_2
    //   126: ireturn
    //   127: astore_1
    //   128: new com/google/android/exoplayer2/upstream/AssetDataSource$AssetDataSourceException
    //   131: dup
    //   132: aload_1
    //   133: invokespecial <init> : (Ljava/io/IOException;)V
    //   136: athrow
    // Exception table:
    //   from	to	target	type
    //   37	46	127	java/io/IOException
    //   46	63	127	java/io/IOException
  }
  
  public static final class AssetDataSourceException extends IOException {
    public AssetDataSourceException(IOException param1IOException) {
      super(param1IOException);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/AssetDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */