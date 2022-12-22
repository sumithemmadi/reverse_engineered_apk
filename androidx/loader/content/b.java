package androidx.loader.content;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b<D> {
  int a;
  
  b<D> b;
  
  a<D> c;
  
  Context d;
  
  boolean e = false;
  
  boolean f = false;
  
  boolean g = true;
  
  boolean h = false;
  
  boolean i = false;
  
  public b(Context paramContext) {
    this.d = paramContext.getApplicationContext();
  }
  
  public void a() {
    this.f = true;
    j();
  }
  
  public boolean b() {
    return k();
  }
  
  public void c() {
    this.i = false;
  }
  
  public String d(D paramD) {
    StringBuilder stringBuilder = new StringBuilder(64);
    b.h.j.b.a(paramD, stringBuilder);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public void e() {
    a<D> a1 = this.c;
    if (a1 != null)
      a1.a(this); 
  }
  
  public void f(D paramD) {
    b<D> b1 = this.b;
    if (b1 != null)
      b1.a(this, paramD); 
  }
  
  @Deprecated
  public void g(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.b);
    if (this.e || this.h || this.i) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.e);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.h);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.i);
    } 
    if (this.f || this.g) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.f);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.g);
    } 
  }
  
  public void h() {
    m();
  }
  
  public boolean i() {
    return this.f;
  }
  
  protected void j() {}
  
  protected boolean k() {
    throw null;
  }
  
  public void l() {
    if (this.e) {
      h();
    } else {
      this.h = true;
    } 
  }
  
  protected void m() {}
  
  protected void n() {}
  
  protected void o() {
    throw null;
  }
  
  protected void p() {}
  
  public void q(int paramInt, b<D> paramb) {
    if (this.b == null) {
      this.b = paramb;
      this.a = paramInt;
      return;
    } 
    throw new IllegalStateException("There is already a listener registered");
  }
  
  public void r() {
    n();
    this.g = true;
    this.e = false;
    this.f = false;
    this.h = false;
    this.i = false;
  }
  
  public void s() {
    if (this.i)
      l(); 
  }
  
  public final void t() {
    this.e = true;
    this.g = false;
    this.f = false;
    o();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    b.h.j.b.a(this, stringBuilder);
    stringBuilder.append(" id=");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public void u() {
    this.e = false;
    p();
  }
  
  public void v(b<D> paramb) {
    b<D> b1 = this.b;
    if (b1 != null) {
      if (b1 == paramb) {
        this.b = null;
        return;
      } 
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    } 
    throw new IllegalStateException("No listener register");
  }
  
  public static interface a<D> {
    void a(b<D> param1b);
  }
  
  public static interface b<D> {
    void a(b<D> param1b, D param1D);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/loader/content/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */