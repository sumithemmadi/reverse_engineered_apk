package androidx.media;

import android.os.Build;

public final class e {
  f a;
  
  public e(String paramString, int paramInt1, int paramInt2) {
    if (Build.VERSION.SDK_INT >= 28) {
      this.a = new g(paramString, paramInt1, paramInt2);
    } else {
      this.a = new h(paramString, paramInt1, paramInt2);
    } 
  }
  
  public boolean equals(Object paramObject) {
    return (this == paramObject) ? true : (!(paramObject instanceof e) ? false : this.a.equals(((e)paramObject).a));
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/media/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */