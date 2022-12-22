package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.c1.f;
import com.google.android.exoplayer2.c1.l;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.y0;

@Deprecated
public final class s extends n<Void> {
  private final y i;
  
  private s(Uri paramUri, j.a parama, l paraml, u paramu, String paramString, int paramInt, Object paramObject) {
    this.i = new y(paramUri, parama, paraml, j.d(), paramu, paramString, paramInt, paramObject);
  }
  
  protected void B(Void paramVoid, v paramv, y0 paramy0) {
    r(paramy0);
  }
  
  public u a(v.a parama, e parame, long paramLong) {
    return this.i.a(parama, parame, paramLong);
  }
  
  public void i(u paramu) {
    this.i.i(paramu);
  }
  
  protected void q(x paramx) {
    super.q(paramx);
    z(null, this.i);
  }
  
  @Deprecated
  public static final class b {
    private final j.a a;
    
    private l b;
    
    private String c;
    
    private Object d;
    
    private u e;
    
    private int f;
    
    private boolean g;
    
    public b(j.a param1a) {
      this.a = param1a;
      this.e = (u)new com.google.android.exoplayer2.upstream.s();
      this.f = 1048576;
    }
    
    public s a(Uri param1Uri) {
      this.g = true;
      if (this.b == null)
        this.b = (l)new f(); 
      return new s(param1Uri, this.a, this.b, this.e, this.c, this.f, this.d, null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */