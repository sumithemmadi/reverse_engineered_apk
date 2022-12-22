package b.h.k.g0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class c {
  private final c a;
  
  public c(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2) {
    if (Build.VERSION.SDK_INT >= 25) {
      this.a = new a(paramUri1, paramClipDescription, paramUri2);
    } else {
      this.a = new b(paramUri1, paramClipDescription, paramUri2);
    } 
  }
  
  private c(c paramc) {
    this.a = paramc;
  }
  
  public static c f(Object paramObject) {
    return (paramObject == null) ? null : ((Build.VERSION.SDK_INT < 25) ? null : new c(new a(paramObject)));
  }
  
  public Uri a() {
    return this.a.a1();
  }
  
  public ClipDescription b() {
    return this.a.Z0();
  }
  
  public Uri c() {
    return this.a.c1();
  }
  
  public void d() {
    this.a.b1();
  }
  
  public Object e() {
    return this.a.d1();
  }
  
  private static final class a implements c {
    final InputContentInfo a;
    
    a(Uri param1Uri1, ClipDescription param1ClipDescription, Uri param1Uri2) {
      this.a = new InputContentInfo(param1Uri1, param1ClipDescription, param1Uri2);
    }
    
    a(Object param1Object) {
      this.a = (InputContentInfo)param1Object;
    }
    
    public ClipDescription Z0() {
      return this.a.getDescription();
    }
    
    public Uri a1() {
      return this.a.getContentUri();
    }
    
    public void b1() {
      this.a.requestPermission();
    }
    
    public Uri c1() {
      return this.a.getLinkUri();
    }
    
    public Object d1() {
      return this.a;
    }
  }
  
  private static final class b implements c {
    private final Uri a;
    
    private final ClipDescription b;
    
    private final Uri c;
    
    b(Uri param1Uri1, ClipDescription param1ClipDescription, Uri param1Uri2) {
      this.a = param1Uri1;
      this.b = param1ClipDescription;
      this.c = param1Uri2;
    }
    
    public ClipDescription Z0() {
      return this.b;
    }
    
    public Uri a1() {
      return this.a;
    }
    
    public void b1() {}
    
    public Uri c1() {
      return this.c;
    }
    
    public Object d1() {
      return null;
    }
  }
  
  private static interface c {
    ClipDescription Z0();
    
    Uri a1();
    
    void b1();
    
    Uri c1();
    
    Object d1();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/g0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */