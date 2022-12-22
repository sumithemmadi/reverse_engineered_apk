package com.bumptech.glide.k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class b implements Closeable {
  private final InputStream b;
  
  private final Charset c;
  
  private byte[] d;
  
  private int e;
  
  private int f;
  
  public b(InputStream paramInputStream, int paramInt, Charset paramCharset) {
    if (paramInputStream != null && paramCharset != null) {
      if (paramInt >= 0) {
        if (paramCharset.equals(c.a)) {
          this.b = paramInputStream;
          this.c = paramCharset;
          this.d = new byte[paramInt];
          return;
        } 
        throw new IllegalArgumentException("Unsupported encoding");
      } 
      throw new IllegalArgumentException("capacity <= 0");
    } 
    throw null;
  }
  
  public b(InputStream paramInputStream, Charset paramCharset) {
    this(paramInputStream, 8192, paramCharset);
  }
  
  private void c() {
    InputStream inputStream = this.b;
    byte[] arrayOfByte = this.d;
    int i = inputStream.read(arrayOfByte, 0, arrayOfByte.length);
    if (i != -1) {
      this.e = 0;
      this.f = i;
      return;
    } 
    throw new EOFException();
  }
  
  public void close() {
    synchronized (this.b) {
      if (this.d != null) {
        this.d = null;
        this.b.close();
      } 
      return;
    } 
  }
  
  public boolean d() {
    boolean bool;
    if (this.f == -1) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public String e() {
    synchronized (this.b) {
      if (this.d != null) {
        if (this.e >= this.f)
          c(); 
        int i;
        for (i = this.e; i != this.f; i++) {
          byte[] arrayOfByte = this.d;
          if (arrayOfByte[i] == 10) {
            if (i != this.e) {
              int m = i - 1;
              if (arrayOfByte[m] == 13) {
                String str1 = new String();
                byte[] arrayOfByte2 = this.d;
                int n = this.e;
                this(arrayOfByte2, n, m - n, this.c.name());
                this.e = i + 1;
                return str1;
              } 
            } 
            int j = i;
            String str = new String();
            byte[] arrayOfByte1 = this.d;
            int k = this.e;
            this(arrayOfByte1, k, j - k, this.c.name());
            this.e = i + 1;
            return str;
          } 
        } 
        a a = new a();
        this(this, this.f - this.e + 80);
        while (true) {
          byte[] arrayOfByte = this.d;
          i = this.e;
          a.write(arrayOfByte, i, this.f - i);
          this.f = -1;
          c();
          for (i = this.e; i != this.f; i++) {
            arrayOfByte = this.d;
            if (arrayOfByte[i] == 10) {
              int j = this.e;
              if (i != j)
                a.write(arrayOfByte, j, i - j); 
              this.e = i + 1;
              return a.toString();
            } 
          } 
        } 
      } 
      IOException iOException = new IOException();
      this("LineReader is closed");
      throw iOException;
    } 
  }
  
  class a extends ByteArrayOutputStream {
    a(b this$0, int param1Int) {
      super(param1Int);
    }
    
    public String toString() {
      int i = this.count;
      int j = i;
      if (i > 0) {
        j = i;
        if (this.buf[i - 1] == 13)
          j = i - 1; 
      } 
      try {
        return new String(this.buf, 0, j, b.b(this.b).name());
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        throw new AssertionError(unsupportedEncodingException);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */