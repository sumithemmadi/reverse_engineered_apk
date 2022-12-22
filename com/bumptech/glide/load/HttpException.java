package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException extends IOException {
  private static final long serialVersionUID = 1L;
  
  private final int statusCode;
  
  public HttpException(int paramInt) {
    this("Http request failed", paramInt);
  }
  
  @Deprecated
  public HttpException(String paramString) {
    this(paramString, -1);
  }
  
  public HttpException(String paramString, int paramInt) {
    this(paramString, paramInt, null);
  }
  
  public HttpException(String paramString, int paramInt, Throwable paramThrowable) {
    super(stringBuilder.toString(), paramThrowable);
    this.statusCode = paramInt;
  }
  
  public int getStatusCode() {
    return this.statusCode;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/HttpException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */