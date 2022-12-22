package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.v;
import java.io.InputStream;
import java.util.List;

public final class f<T extends e<T>> implements v.a<T> {
  private final v.a<? extends T> a;
  
  private final List<StreamKey> b;
  
  public f(v.a<? extends T> parama, List<StreamKey> paramList) {
    this.a = parama;
    this.b = paramList;
  }
  
  public T b(Uri paramUri, InputStream paramInputStream) {
    e<e> e2 = (e)this.a.a(paramUri, paramInputStream);
    List<StreamKey> list = this.b;
    e<e> e1 = e2;
    if (list != null)
      if (list.isEmpty()) {
        e1 = e2;
      } else {
        e1 = e2.a(this.b);
      }  
    return (T)e1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/offline/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */