package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.h0;
import java.net.URLDecoder;

public final class h extends g {
  private l f;
  
  private byte[] g;
  
  private int h;
  
  private int i;
  
  public h() {
    super(false);
  }
  
  public void close() {
    if (this.g != null) {
      this.g = null;
      b();
    } 
    this.f = null;
  }
  
  public Uri e0() {
    l l1 = this.f;
    if (l1 != null) {
      Uri uri = l1.a;
    } else {
      l1 = null;
    } 
    return (Uri)l1;
  }
  
  public long g0(l paraml) {
    c(paraml);
    this.f = paraml;
    this.i = (int)paraml.f;
    Uri uri = paraml.a;
    String str = uri.getScheme();
    if ("data".equals(str)) {
      String str1;
      String[] arrayOfString = h0.n0(uri.getSchemeSpecificPart(), ",");
      if (arrayOfString.length == 2) {
        StringBuilder stringBuilder2;
        int i;
        str1 = arrayOfString[1];
        if (arrayOfString[0].contains(";base64")) {
          try {
            this.g = Base64.decode(str1, 0);
          } catch (IllegalArgumentException illegalArgumentException) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Error while parsing Base64 encoded string: ");
            stringBuilder2.append(str1);
            throw new ParserException(stringBuilder2.toString(), illegalArgumentException);
          } 
        } else {
          this.g = h0.R(URLDecoder.decode(str1, "US-ASCII"));
        } 
        long l1 = ((l)stringBuilder2).g;
        if (l1 != -1L) {
          i = (int)l1 + this.i;
        } else {
          i = this.g.length;
        } 
        this.h = i;
        if (i <= this.g.length && this.i <= i) {
          d((l)stringBuilder2);
          return this.h - this.i;
        } 
        this.g = null;
        throw new DataSourceException(0);
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unexpected URI format: ");
      stringBuilder1.append(str1);
      throw new ParserException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported scheme: ");
    stringBuilder.append((String)illegalArgumentException);
    throw new ParserException(stringBuilder.toString());
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return 0; 
    int i = this.h - this.i;
    if (i == 0)
      return -1; 
    paramInt2 = Math.min(paramInt2, i);
    System.arraycopy(h0.g(this.g), this.i, paramArrayOfbyte, paramInt1, paramInt2);
    this.i += paramInt2;
    a(paramInt2);
    return paramInt2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */