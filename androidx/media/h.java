package androidx.media;

import android.text.TextUtils;
import b.h.j.d;

class h implements f {
  private String a;
  
  private int b;
  
  private int c;
  
  h(String paramString, int paramInt1, int paramInt2) {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof h))
      return false; 
    paramObject = paramObject;
    if (!TextUtils.equals(this.a, ((h)paramObject).a) || this.b != ((h)paramObject).b || this.c != ((h)paramObject).c)
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return d.b(new Object[] { this.a, Integer.valueOf(this.b), Integer.valueOf(this.c) });
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */