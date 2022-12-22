package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public class s implements u {
  private final int a;
  
  public s() {
    this(-1);
  }
  
  public s(int paramInt) {
    this.a = paramInt;
  }
  
  public long a(int paramInt1, long paramLong, IOException paramIOException, int paramInt2) {
    return (paramIOException instanceof com.google.android.exoplayer2.ParserException || paramIOException instanceof java.io.FileNotFoundException || paramIOException instanceof Loader.UnexpectedLoaderException) ? -9223372036854775807L : Math.min((paramInt2 - 1) * 1000, 5000);
  }
  
  public long b(int paramInt1, long paramLong, IOException paramIOException, int paramInt2) {
    boolean bool = paramIOException instanceof HttpDataSource.InvalidResponseCodeException;
    long l = -9223372036854775807L;
    paramLong = l;
    if (bool) {
      paramInt1 = ((HttpDataSource.InvalidResponseCodeException)paramIOException).responseCode;
      if (paramInt1 != 404 && paramInt1 != 410) {
        paramLong = l;
        return (paramInt1 == 416) ? 60000L : paramLong;
      } 
    } else {
      return paramLong;
    } 
    return 60000L;
  }
  
  public int c(int paramInt) {
    int i = this.a;
    if (i == -1) {
      if (paramInt == 7) {
        paramInt = 6;
      } else {
        paramInt = 3;
      } 
      return paramInt;
    } 
    return i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */