package com.google.android.exoplayer2.drm;

public class DecryptionException extends Exception {
  public final int errorCode;
  
  public DecryptionException(int paramInt, String paramString) {
    super(paramString);
    this.errorCode = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/drm/DecryptionException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */