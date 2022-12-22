package b.h.h;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import b.h.j.i;

public class f {
  public static Typeface a(Context paramContext, d paramd, int paramInt1, boolean paramBoolean, int paramInt2, Handler paramHandler, c paramc) {
    a a = new a(paramc, paramHandler);
    return paramBoolean ? e.e(paramContext, paramd, a, paramInt1, paramInt2) : e.d(paramContext, paramd, paramInt1, null, a);
  }
  
  public static class a {
    private final int a;
    
    private final f.b[] b;
    
    @Deprecated
    public a(int param1Int, f.b[] param1ArrayOfb) {
      this.a = param1Int;
      this.b = param1ArrayOfb;
    }
    
    static a a(int param1Int, f.b[] param1ArrayOfb) {
      return new a(param1Int, param1ArrayOfb);
    }
    
    public f.b[] b() {
      return this.b;
    }
    
    public int c() {
      return this.a;
    }
  }
  
  public static class b {
    private final Uri a;
    
    private final int b;
    
    private final int c;
    
    private final boolean d;
    
    private final int e;
    
    @Deprecated
    public b(Uri param1Uri, int param1Int1, int param1Int2, boolean param1Boolean, int param1Int3) {
      this.a = (Uri)i.e(param1Uri);
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Boolean;
      this.e = param1Int3;
    }
    
    static b a(Uri param1Uri, int param1Int1, int param1Int2, boolean param1Boolean, int param1Int3) {
      return new b(param1Uri, param1Int1, param1Int2, param1Boolean, param1Int3);
    }
    
    public int b() {
      return this.e;
    }
    
    public int c() {
      return this.b;
    }
    
    public Uri d() {
      return this.a;
    }
    
    public int e() {
      return this.c;
    }
    
    public boolean f() {
      return this.d;
    }
  }
  
  public static class c {
    public void a(int param1Int) {
      throw null;
    }
    
    public void b(Typeface param1Typeface) {
      throw null;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/h/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */