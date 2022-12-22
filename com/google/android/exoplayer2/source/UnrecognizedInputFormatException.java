package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;

public class UnrecognizedInputFormatException extends ParserException {
  public final Uri uri;
  
  public UnrecognizedInputFormatException(String paramString, Uri paramUri) {
    super(paramString);
    this.uri = paramUri;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/UnrecognizedInputFormatException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */