package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.v;

abstract class TagPayloadReader {
  protected final v a;
  
  protected TagPayloadReader(v paramv) {
    this.a = paramv;
  }
  
  public final boolean a(v paramv, long paramLong) {
    boolean bool;
    if (b(paramv) && c(paramv, paramLong)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected abstract boolean b(v paramv);
  
  protected abstract boolean c(v paramv, long paramLong);
  
  public static final class UnsupportedFormatException extends ParserException {
    public UnsupportedFormatException(String param1String) {
      super(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/flv/TagPayloadReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */