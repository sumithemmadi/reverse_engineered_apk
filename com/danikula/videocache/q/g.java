package com.danikula.videocache.q;

import java.io.File;

public class g extends e {
  private final long c;
  
  public g(long paramLong) {
    if (paramLong > 0L) {
      this.c = paramLong;
      return;
    } 
    throw new IllegalArgumentException("Max size must be positive number!");
  }
  
  protected boolean b(File paramFile, long paramLong, int paramInt) {
    boolean bool;
    if (paramLong <= this.c) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/q/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */