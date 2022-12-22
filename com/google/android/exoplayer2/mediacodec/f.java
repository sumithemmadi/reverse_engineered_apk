package com.google.android.exoplayer2.mediacodec;

import java.util.List;

public interface f {
  public static final f a = new a();
  
  e a();
  
  List<e> b(String paramString, boolean paramBoolean1, boolean paramBoolean2);
  
  static final class a implements f {
    public e a() {
      return MediaCodecUtil.o();
    }
    
    public List<e> b(String param1String, boolean param1Boolean1, boolean param1Boolean2) {
      return MediaCodecUtil.j(param1String, param1Boolean1, param1Boolean2);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/mediacodec/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */