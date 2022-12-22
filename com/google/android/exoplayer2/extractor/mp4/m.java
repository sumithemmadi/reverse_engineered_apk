package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.o;

public final class m {
  public final boolean a;
  
  public final String b;
  
  public final v.a c;
  
  public final int d;
  
  public final byte[] e;
  
  public m(boolean paramBoolean, String paramString, int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte2) {
    boolean bool2;
    boolean bool1 = true;
    if (paramInt1 == 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (paramArrayOfbyte2 != null)
      bool1 = false; 
    e.a(bool1 ^ bool2);
    this.a = paramBoolean;
    this.b = paramString;
    this.d = paramInt1;
    this.e = paramArrayOfbyte2;
    this.c = new v.a(a(paramString), paramArrayOfbyte1, paramInt2, paramInt3);
  }
  
  private static int a(String paramString) {
    StringBuilder stringBuilder;
    if (paramString == null)
      return 1; 
    byte b = -1;
    switch (paramString.hashCode()) {
      case 3049895:
        if (!paramString.equals("cens"))
          break; 
        b = 3;
        break;
      case 3049879:
        if (!paramString.equals("cenc"))
          break; 
        b = 2;
        break;
      case 3046671:
        if (!paramString.equals("cbcs"))
          break; 
        b = 1;
        break;
      case 3046605:
        if (!paramString.equals("cbc1"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported protection scheme type '");
        stringBuilder.append(paramString);
        stringBuilder.append("'. Assuming AES-CTR crypto mode.");
        o.f("TrackEncryptionBox", stringBuilder.toString());
      case 2:
      case 3:
        return 1;
      case 0:
      case 1:
        break;
    } 
    return 2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */