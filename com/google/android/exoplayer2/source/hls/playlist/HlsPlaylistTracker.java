package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.hls.h;
import com.google.android.exoplayer2.source.w;
import com.google.android.exoplayer2.upstream.u;
import java.io.IOException;

public interface HlsPlaylistTracker {
  boolean a(Uri paramUri);
  
  void b(b paramb);
  
  void d(Uri paramUri);
  
  long f();
  
  boolean g();
  
  e h();
  
  void i(Uri paramUri, w.a parama, c paramc);
  
  void j();
  
  void k(Uri paramUri);
  
  void l(b paramb);
  
  f m(Uri paramUri, boolean paramBoolean);
  
  void stop();
  
  public static final class PlaylistResetException extends IOException {
    public final Uri url;
    
    public PlaylistResetException(Uri param1Uri) {
      this.url = param1Uri;
    }
  }
  
  public static final class PlaylistStuckException extends IOException {
    public final Uri url;
    
    public PlaylistStuckException(Uri param1Uri) {
      this.url = param1Uri;
    }
  }
  
  public static interface a {
    HlsPlaylistTracker a(h param1h, u param1u, i param1i);
  }
  
  public static interface b {
    void b();
    
    boolean c(Uri param1Uri, long param1Long);
  }
  
  public static interface c {
    void c(f param1f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/playlist/HlsPlaylistTracker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */