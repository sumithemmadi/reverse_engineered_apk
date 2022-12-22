package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.f;
import com.google.android.exoplayer2.upstream.v;
import java.util.List;

public final class d implements i {
  private final i a;
  
  private final List<StreamKey> b;
  
  public d(i parami, List<StreamKey> paramList) {
    this.a = parami;
    this.b = paramList;
  }
  
  public v.a<g> a(e parame) {
    return (v.a<g>)new f(this.a.a(parame), this.b);
  }
  
  public v.a<g> b() {
    return (v.a<g>)new f(this.a.b(), this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/playlist/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */