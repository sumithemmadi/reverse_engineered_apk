package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.h;
import com.google.android.exoplayer2.util.e0;
import java.util.List;
import java.util.Map;

public interface i {
  public static final i a = new f();
  
  a a(h paramh, Uri paramUri, Format paramFormat, List<Format> paramList, e0 parame0, Map<String, List<String>> paramMap, com.google.android.exoplayer2.c1.i parami);
  
  public static final class a {
    public final h a;
    
    public final boolean b;
    
    public final boolean c;
    
    public a(h param1h, boolean param1Boolean1, boolean param1Boolean2) {
      this.a = param1h;
      this.b = param1Boolean1;
      this.c = param1Boolean2;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */