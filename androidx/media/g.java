package androidx.media;

import android.media.session.MediaSessionManager;
import b.h.j.d;

final class g implements f {
  final MediaSessionManager.RemoteUserInfo a;
  
  g(String paramString, int paramInt1, int paramInt2) {
    this.a = new MediaSessionManager.RemoteUserInfo(paramString, paramInt1, paramInt2);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof g))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((g)paramObject).a);
  }
  
  public int hashCode() {
    return d.b(new Object[] { this.a });
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */