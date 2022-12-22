package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileDataSource extends g {
  private RandomAccessFile f;
  
  private Uri g;
  
  private long h;
  
  private boolean i;
  
  public FileDataSource() {
    super(false);
  }
  
  private static RandomAccessFile e(Uri paramUri) {
    try {
      return new RandomAccessFile((String)e.e(paramUri.getPath()), "r");
    } catch (FileNotFoundException fileNotFoundException) {
      if (!TextUtils.isEmpty(paramUri.getQuery()) || !TextUtils.isEmpty(paramUri.getFragment()))
        throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[] { paramUri.getPath(), paramUri.getQuery(), paramUri.getFragment() }), fileNotFoundException); 
      throw new FileDataSourceException(fileNotFoundException);
    } 
  }
  
  public void close() {
    Exception exception;
    this.g = null;
    try {
      RandomAccessFile randomAccessFile = this.f;
      if (randomAccessFile != null)
        randomAccessFile.close(); 
      this.f = null;
      if (this.i) {
        this.i = false;
        b();
      } 
      return;
    } catch (IOException null) {
      FileDataSourceException fileDataSourceException = new FileDataSourceException();
      this((IOException)exception);
      throw fileDataSourceException;
    } finally {}
    this.f = null;
    if (this.i) {
      this.i = false;
      b();
    } 
    throw exception;
  }
  
  public Uri e0() {
    return this.g;
  }
  
  public long g0(l paraml) {
    try {
      Uri uri = paraml.a;
      this.g = uri;
      c(paraml);
      RandomAccessFile randomAccessFile = e(uri);
      this.f = randomAccessFile;
      randomAccessFile.seek(paraml.f);
      long l1 = paraml.g;
      long l2 = l1;
      if (l1 == -1L)
        l2 = this.f.length() - paraml.f; 
      this.h = l2;
      if (l2 >= 0L) {
        this.i = true;
        d(paraml);
        return this.h;
      } 
      EOFException eOFException = new EOFException();
      this();
      throw eOFException;
    } catch (IOException iOException) {
      throw new FileDataSourceException(iOException);
    } 
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return 0; 
    if (this.h == 0L)
      return -1; 
    try {
      paramInt1 = ((RandomAccessFile)h0.g(this.f)).read(paramArrayOfbyte, paramInt1, (int)Math.min(this.h, paramInt2));
      if (paramInt1 > 0) {
        this.h -= paramInt1;
        a(paramInt1);
      } 
      return paramInt1;
    } catch (IOException iOException) {
      throw new FileDataSourceException(iOException);
    } 
  }
  
  public static class FileDataSourceException extends IOException {
    public FileDataSourceException(IOException param1IOException) {
      super(param1IOException);
    }
    
    public FileDataSourceException(String param1String, IOException param1IOException) {
      super(param1String, param1IOException);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/FileDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */