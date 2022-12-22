package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.e;
import java.util.Collections;
import java.util.List;

public abstract class g implements e<g> {
  public final String a;
  
  public final List<String> b;
  
  public final boolean c;
  
  protected g(String paramString, List<String> paramList, boolean paramBoolean) {
    this.a = paramString;
    this.b = Collections.unmodifiableList(paramList);
    this.c = paramBoolean;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/playlist/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */