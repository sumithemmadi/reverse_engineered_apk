package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

public final class c {
  private final Set<a> a = new HashSet<a>();
  
  public void a(Uri paramUri, boolean paramBoolean) {
    a a = new a(paramUri, paramBoolean);
    this.a.add(a);
  }
  
  public Set<a> b() {
    return this.a;
  }
  
  public int c() {
    return this.a.size();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || c.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return this.a.equals(((c)paramObject).a);
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public static final class a {
    private final Uri a;
    
    private final boolean b;
    
    a(Uri param1Uri, boolean param1Boolean) {
      this.a = param1Uri;
      this.b = param1Boolean;
    }
    
    public Uri a() {
      return this.a;
    }
    
    public boolean b() {
      return this.b;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || a.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (this.b != ((a)param1Object).b || !this.a.equals(((a)param1Object).a))
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      return this.a.hashCode() * 31 + this.b;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */