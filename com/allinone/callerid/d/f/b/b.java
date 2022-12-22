package com.allinone.callerid.d.f.b;

import java.io.File;

public class b {
  private File a;
  
  private boolean b;
  
  private f c;
  
  public b(f paramf, File paramFile) {
    this.a = paramFile;
    this.c = paramf;
  }
  
  public File a() {
    return this.a;
  }
  
  public void b(boolean paramBoolean) {
    this.b = paramBoolean;
    if (paramBoolean)
      this.c.g(this); 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("FileBridge{mFile=");
    stringBuilder.append(this.a.getName());
    stringBuilder.append(", mIsRecycle=");
    stringBuilder.append(this.b);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/f/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */